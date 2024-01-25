import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!tb;")
	public static Class3_Sub40 aClass3_Sub40_1;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public static int anInt1175 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!qa;BLclient!m;)V")
	public static void method865(@OriginalArg(0) Class172 arg0, @OriginalArg(2) Interface5 arg1) {
		if (Static144.aClass3_Sub4_Sub8_5 == null) {
			return;
		}
		if (Static66.anInt1702 < 10) {
			if (!Static144.aClass32_69.method804(Static144.aClass3_Sub4_Sub8_5.aString15)) {
				Static66.anInt1702 = Static419.aClass32_84.method788(Static144.aClass3_Sub4_Sub8_5.aString15) / 10;
				return;
			}
			Static52.method1068();
			Static66.anInt1702 = 10;
		}
		if (Static66.anInt1702 == 10) {
			Static144.anInt5420 = Static144.aClass3_Sub4_Sub8_5.anInt2266 >> 6 << 6;
			Static144.anInt5410 = Static144.aClass3_Sub4_Sub8_5.anInt2255 >> 6 << 6;
			Static144.anInt5421 = (Static144.aClass3_Sub4_Sub8_5.anInt2261 >> 6 << 6) + 64 - Static144.anInt5410;
			Static144.anInt5411 = (Static144.aClass3_Sub4_Sub8_5.anInt2252 >> 6 << 6) + 64 - Static144.anInt5420;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static144.aClass3_Sub4_Sub8_5.method1749((Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 >> 7) + Static223.anInt7618, Static57.anInt5085 + (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 >> 7), local76, Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77)) {
				local80 = local76[2] - Static144.anInt5420;
				local78 = local76[1] - Static144.anInt5410;
			}
			if (!Static60.aBoolean127 && local78 >= 0 && Static144.anInt5421 > local78 && local80 >= 0 && local80 < Static144.anInt5411) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static411.anInt6760 = local78;
				Static76.anInt1937 = local80;
			} else if (Static116.anInt5392 == -1 || Static169.anInt5823 == -1) {
				Static144.aClass3_Sub4_Sub8_5.method1740(Static144.aClass3_Sub4_Sub8_5.anInt2257 >> 14 & 0x3FFF, Static144.aClass3_Sub4_Sub8_5.anInt2257 & 0x3FFF, local76);
				Static411.anInt6760 = local76[1] - Static144.anInt5410;
				Static76.anInt1937 = local76[2] - Static144.anInt5420;
			} else {
				Static144.aClass3_Sub4_Sub8_5.method1740(Static116.anInt5392, Static169.anInt5823, local76);
				Static169.anInt5823 = -1;
				Static116.anInt5392 = -1;
				if (local76 != null) {
					Static76.anInt1937 = local76[2] - Static144.anInt5420;
					Static411.anInt6760 = local76[1] - Static144.anInt5410;
				}
				Static60.aBoolean127 = false;
			}
			if (Static144.aClass3_Sub4_Sub8_5.anInt2262 == 37) {
				Static144.aFloat59 = 3.0F;
				Static144.aFloat58 = 3.0F;
			} else if (Static144.aClass3_Sub4_Sub8_5.anInt2262 == 50) {
				Static144.aFloat59 = 4.0F;
				Static144.aFloat58 = 4.0F;
			} else if (Static144.aClass3_Sub4_Sub8_5.anInt2262 == 75) {
				Static144.aFloat59 = 6.0F;
				Static144.aFloat58 = 6.0F;
			} else if (Static144.aClass3_Sub4_Sub8_5.anInt2262 == 100) {
				Static144.aFloat59 = 8.0F;
				Static144.aFloat58 = 8.0F;
			} else if (Static144.aClass3_Sub4_Sub8_5.anInt2262 == 200) {
				Static144.aFloat59 = 16.0F;
				Static144.aFloat58 = 16.0F;
			} else {
				Static144.aFloat59 = 8.0F;
				Static144.aFloat58 = 8.0F;
			}
			Static144.anInt5407 = (int) Static144.aFloat59 >> 1;
			Static144.aByteArrayArrayArray17 = Static181.method2885(Static144.anInt5407);
			Static197.method3120();
			Static144.method4259();
			Static132.aClass243_17 = new Class243();
			Static144.anInt5409 += (int) (Math.random() * 5.0D) - 2;
			if (Static144.anInt5409 < -8) {
				Static144.anInt5409 = -8;
			}
			Static144.anInt5408 += (int) (Math.random() * 5.0D) - 2;
			if (Static144.anInt5409 > 8) {
				Static144.anInt5409 = 8;
			}
			if (Static144.anInt5408 < -16) {
				Static144.anInt5408 = -16;
			}
			if (Static144.anInt5408 > 16) {
				Static144.anInt5408 = 16;
			}
			Static144.method4242(arg1, Static144.anInt5409 >> 2 << 10, Static144.anInt5408 >> 1);
			Static144.aClass171_4.method3941(256, 1024);
			Static144.aClass164_2.method3867(256, 256);
			Static144.aClass30_3.method764(4096);
			Static99.aClass36_1.method853(256);
			Static66.anInt1702 = 20;
		} else if (Static66.anInt1702 == 20) {
			Static8.method4684(true);
			Static144.method4247(arg0, Static144.anInt5409, Static144.anInt5408);
			Static66.anInt1702 = 60;
			Static8.method4684(true);
			Static333.method4463();
		} else if (Static66.anInt1702 == 60) {
			if (Static144.aClass32_69.method793(Static144.aClass3_Sub4_Sub8_5.aString15 + "_staticelements")) {
				if (!Static144.aClass32_69.method804(Static144.aClass3_Sub4_Sub8_5.aString15 + "_staticelements")) {
					return;
				}
				Static144.aClass116_3 = Static50.method915(Static144.aClass32_69, Static187.aBoolean320, Static144.aClass3_Sub4_Sub8_5.aString15 + "_staticelements");
			} else {
				Static144.aClass116_3 = new Class116(0);
			}
			Static144.method4254();
			Static66.anInt1702 = 70;
			Static8.method4684(true);
			Static333.method4463();
		} else if (Static66.anInt1702 == 70) {
			Static61.aClass204_1 = new Class204(arg0, 11, true, Static392.aCanvas6);
			Static66.anInt1702 = 73;
			Static8.method4684(true);
			Static333.method4463();
		} else if (Static66.anInt1702 == 73) {
			Static246.aClass204_7 = new Class204(arg0, 12, true, Static392.aCanvas6);
			Static66.anInt1702 = 76;
			Static8.method4684(true);
			Static333.method4463();
		} else if (Static66.anInt1702 == 76) {
			Static172.aClass204_5 = new Class204(arg0, 14, true, Static392.aCanvas6);
			Static66.anInt1702 = 79;
			Static8.method4684(true);
			Static333.method4463();
		} else if (Static66.anInt1702 == 79) {
			Static121.aClass204_3 = new Class204(arg0, 17, true, Static392.aCanvas6);
			Static66.anInt1702 = 82;
			Static8.method4684(true);
			Static333.method4463();
		} else if (Static66.anInt1702 == 82) {
			Static61.aClass204_2 = new Class204(arg0, 19, true, Static392.aCanvas6);
			Static66.anInt1702 = 85;
			Static8.method4684(true);
			Static333.method4463();
		} else if (Static66.anInt1702 == 85) {
			Static205.aClass204_6 = new Class204(arg0, 22, true, Static392.aCanvas6);
			Static66.anInt1702 = 88;
			Static8.method4684(true);
			Static333.method4463();
		} else if (Static66.anInt1702 == 88) {
			Static289.aClass204_8 = new Class204(arg0, 26, true, Static392.aCanvas6);
			Static66.anInt1702 = 91;
			Static8.method4684(true);
			Static333.method4463();
		} else {
			Static162.aClass204_4 = new Class204(arg0, 30, true, Static392.aCanvas6);
			Static66.anInt1702 = 100;
			Static8.method4684(true);
			Static333.method4463();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method867(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(19) int local19 = 0; local19 < local8; local19++) {
			local10 = (local10 << 5) + arg0.charAt(local19) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method868() {
		Static302.aClass3_Sub7_Sub1_2.anInt3235 = 0;
		Static240.aClass119_99 = null;
		Static445.anInt7526 = 0;
		Static237.aClass3_Sub7_Sub1_1.anInt3235 = 0;
		Static277.aClass119_110 = null;
		Static139.anInt7585 = 0;
		Static354.aClass119_128 = null;
		Static76.aClass119_31 = null;
		Static401.anInt6631 = 0;
		Static177.method2822();
		Static188.method3010();
		for (@Pc(31) int local31 = 0; local31 < 2048; local31++) {
			Static361.aClass7_Sub2_Sub3_Sub2Array1[local31] = null;
		}
		Static379.aClass7_Sub2_Sub3_Sub2_2 = null;
		for (@Pc(47) int local47 = 0; local47 < Static139.aClass7_Sub2_Sub3_Sub1Array11.length; local47++) {
			@Pc(53) Class7_Sub2_Sub3_Sub1 local53 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local47];
			if (local53 != null) {
				local53.anInt4332 = -1;
			}
		}
		Static380.method2732();
		Static161.anInt3316 = 1;
		Static230.method3465(30);
		for (@Pc(72) int local72 = 0; local72 < 100; local72++) {
			Static55.aBooleanArray8[local72] = true;
		}
		Static104.method1813();
		Static113.aLong169 = 0L;
		Static15.aClass3_Sub1_1 = null;
	}
}
