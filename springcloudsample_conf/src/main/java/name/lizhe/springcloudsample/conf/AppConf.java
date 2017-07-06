package name.lizhe.springcloudsample.conf;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
import org.springframework.cloud.config.server.EnableConfigServer;  
  
@SpringBootApplication  
@EnableConfigServer  
public class AppConf {  
    public static void main(String[] args) {     
        SpringApplication.run(AppConf.class,args);     
    }     
}  
