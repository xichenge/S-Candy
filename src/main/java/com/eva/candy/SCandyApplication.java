package com.eva.candy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.eva.candy.mapper")
public class SCandyApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SCandyApplication.class);
        application.setAdditionalProfiles("dev");
        application.run(args);
    }
}
