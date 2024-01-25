import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fg", name = "gb", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_53 = new Class145(66, -1);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!d;ILclient!ha;)V")
	public static void method2750(@OriginalArg(0) Interface2 arg0, @OriginalArg(2) Class13 arg1) {
		if (Static371.aClass2_Sub7_Sub3_3 == null) {
			return;
		}
		if (Static60.anInt1449 < 10) {
			if (!Static371.aClass238_267.method5570(Static371.aClass2_Sub7_Sub3_3.aString26)) {
				Static60.anInt1449 = Static178.aClass238_289.method5566(Static371.aClass2_Sub7_Sub3_3.aString26) / 10;
				return;
			}
			Static306.method4781();
			Static60.anInt1449 = 10;
		}
		if (Static60.anInt1449 == 10) {
			Static371.anInt9384 = Static371.aClass2_Sub7_Sub3_3.anInt2682 >> 6 << 6;
			Static371.anInt9385 = Static371.aClass2_Sub7_Sub3_3.anInt2695 >> 6 << 6;
			Static371.anInt9382 = (Static371.aClass2_Sub7_Sub3_3.anInt2693 >> 6 << 6) + 64 - Static371.anInt9385;
			Static371.anInt9390 = (Static371.aClass2_Sub7_Sub3_3.anInt2692 >> 6 << 6) + 64 - Static371.anInt9384;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static371.aClass2_Sub7_Sub3_3.method2287(local74, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109, (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 >> 9) + Static406.anInt6899, (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 >> 9) + Static338.anInt5885)) {
				local76 = local74[1] - Static371.anInt9384;
				local78 = local74[2] - Static371.anInt9385;
			}
			if (!Static386.aBoolean469 && local76 >= 0 && local76 < Static371.anInt9390 && local78 >= 0 && Static371.anInt9382 > local78) {
				local76 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static331.anInt5801 = local76;
				Static611.anInt10071 = local78;
			} else if (Static573.anInt9359 == -1 || Static614.anInt10090 == -1) {
				Static371.aClass2_Sub7_Sub3_3.method2288(local74, Static371.aClass2_Sub7_Sub3_3.anInt2683 >> 14 & 0x3FFF, Static371.aClass2_Sub7_Sub3_3.anInt2683 & 0x3FFF);
				Static611.anInt10071 = local74[2] - Static371.anInt9385;
				Static331.anInt5801 = local74[1] - Static371.anInt9384;
			} else {
				Static371.aClass2_Sub7_Sub3_3.method2288(local74, Static573.anInt9359, Static614.anInt10090);
				Static386.aBoolean469 = false;
				if (local74 != null) {
					Static331.anInt5801 = local74[1] - Static371.anInt9384;
					Static611.anInt10071 = local74[2] - Static371.anInt9385;
				}
				Static614.anInt10090 = -1;
				Static573.anInt9359 = -1;
			}
			if (Static371.aClass2_Sub7_Sub3_3.anInt2694 == 37) {
				Static371.aFloat186 = 3.0F;
				Static371.aFloat187 = 3.0F;
			} else if (Static371.aClass2_Sub7_Sub3_3.anInt2694 == 50) {
				Static371.aFloat186 = 4.0F;
				Static371.aFloat187 = 4.0F;
			} else if (Static371.aClass2_Sub7_Sub3_3.anInt2694 == 75) {
				Static371.aFloat186 = 6.0F;
				Static371.aFloat187 = 6.0F;
			} else if (Static371.aClass2_Sub7_Sub3_3.anInt2694 == 100) {
				Static371.aFloat186 = 8.0F;
				Static371.aFloat187 = 8.0F;
			} else if (Static371.aClass2_Sub7_Sub3_3.anInt2694 == 200) {
				Static371.aFloat186 = 16.0F;
				Static371.aFloat187 = 16.0F;
			} else {
				Static371.aFloat186 = 8.0F;
				Static371.aFloat187 = 8.0F;
			}
			Static371.anInt9378 = (int) Static371.aFloat186 >> 1;
			Static371.aByteArrayArrayArray16 = Static105.method1963(Static371.anInt9378);
			Static274.method4476();
			Static371.method7984();
			Static435.aClass114_38 = new Class114();
			Static371.anInt9377 += (int) (Math.random() * 5.0D) - 2;
			if (Static371.anInt9377 < -8) {
				Static371.anInt9377 = -8;
			}
			if (Static371.anInt9377 > 8) {
				Static371.anInt9377 = 8;
			}
			Static371.anInt9379 += (int) (Math.random() * 5.0D) - 2;
			if (Static371.anInt9379 < -16) {
				Static371.anInt9379 = -16;
			}
			if (Static371.anInt9379 > 16) {
				Static371.anInt9379 = 16;
			}
			Static371.method7985(arg0, Static371.anInt9377 >> 2 << 10, Static371.anInt9379 >> 1);
			Static371.aClass336_4.method7850(256, 1024);
			Static371.aClass79_4.method1970(256, 256);
			Static371.aClass304_4.method6957(4096);
			Static502.aClass199_2.method4581(256);
			Static60.anInt1449 = 20;
		} else if (Static60.anInt1449 == 20) {
			Static600.method8443(true);
			Static371.method7983(arg1, Static371.anInt9377, Static371.anInt9379);
			Static60.anInt1449 = 60;
			Static600.method8443(true);
			Static127.method2286();
		} else if (Static60.anInt1449 == 60) {
			if (Static371.aClass238_267.method5583(Static371.aClass2_Sub7_Sub3_3.aString26 + "_staticelements")) {
				if (!Static371.aClass238_267.method5570(Static371.aClass2_Sub7_Sub3_3.aString26 + "_staticelements")) {
					return;
				}
				Static371.aClass129_5 = Static247.method4167(Static158.aBoolean257, Static371.aClass2_Sub7_Sub3_3.aString26 + "_staticelements", Static371.aClass238_267);
			} else {
				Static371.aClass129_5 = new Class129(0);
			}
			Static371.method7971();
			Static60.anInt1449 = 70;
			Static600.method8443(true);
			Static127.method2286();
		} else if (Static60.anInt1449 == 70) {
			Static517.aClass63_4 = new Class63(arg1, 11, true, Static150.aCanvas4);
			Static60.anInt1449 = 73;
			Static600.method8443(true);
			Static127.method2286();
		} else if (Static60.anInt1449 == 73) {
			Static418.aClass63_3 = new Class63(arg1, 12, true, Static150.aCanvas4);
			Static60.anInt1449 = 76;
			Static600.method8443(true);
			Static127.method2286();
		} else if (Static60.anInt1449 == 76) {
			Static594.aClass63_7 = new Class63(arg1, 14, true, Static150.aCanvas4);
			Static60.anInt1449 = 79;
			Static600.method8443(true);
			Static127.method2286();
		} else if (Static60.anInt1449 == 79) {
			Static15.aClass63_1 = new Class63(arg1, 17, true, Static150.aCanvas4);
			Static60.anInt1449 = 82;
			Static600.method8443(true);
			Static127.method2286();
		} else if (Static60.anInt1449 == 82) {
			Static630.aClass63_8 = new Class63(arg1, 19, true, Static150.aCanvas4);
			Static60.anInt1449 = 85;
			Static600.method8443(true);
			Static127.method2286();
		} else if (Static60.anInt1449 == 85) {
			Static546.aClass63_5 = new Class63(arg1, 22, true, Static150.aCanvas4);
			Static60.anInt1449 = 88;
			Static600.method8443(true);
			Static127.method2286();
		} else if (Static60.anInt1449 == 88) {
			Static125.aClass63_2 = new Class63(arg1, 26, true, Static150.aCanvas4);
			Static60.anInt1449 = 91;
			Static600.method8443(true);
			Static127.method2286();
		} else {
			Static562.aClass63_6 = new Class63(arg1, 30, true, Static150.aCanvas4);
			Static60.anInt1449 = 100;
			Static600.method8443(true);
			Static127.method2286();
			System.gc();
		}
	}
}
