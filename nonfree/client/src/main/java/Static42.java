import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bn", name = "M", descriptor = "[Lclient!ha;")
	public static Class35[] aClass35Array3;

	@OriginalMember(owner = "client!bn", name = "J", descriptor = "J")
	public static long aLong19 = 0L;

	@OriginalMember(owner = "client!bn", name = "V", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_8 = new Class243(36, 8);

	@OriginalMember(owner = "client!bn", name = "X", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_21 = new Class239(79, 3);

	@OriginalMember(owner = "client!bn", name = "Y", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "(I)Z")
	public static boolean method809() {
		return Static323.anInt6016 > 0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I[SI)[S")
	public static short[] method811(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static553.method3369(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!n;Lclient!qa;)V")
	public static void method812(@OriginalArg(1) Interface12 arg0, @OriginalArg(2) Class39 arg1) {
		if (Static201.aClass2_Sub13_Sub16_2 == null) {
			return;
		}
		if (Static111.anInt2224 < 10) {
			if (!Static201.aClass53_3.method1606(Static201.aClass2_Sub13_Sub16_2.aString175)) {
				Static111.anInt2224 = Static420.aClass53_119.method1601(Static201.aClass2_Sub13_Sub16_2.aString175) / 10;
				return;
			}
			Static214.method3909();
			Static111.anInt2224 = 10;
		}
		if (Static111.anInt2224 == 10) {
			Static201.anInt198 = Static201.aClass2_Sub13_Sub16_2.anInt8407 >> 6 << 6;
			Static201.anInt205 = Static201.aClass2_Sub13_Sub16_2.anInt8411 >> 6 << 6;
			Static201.anInt201 = (Static201.aClass2_Sub13_Sub16_2.anInt8406 >> 6 << 6) + 64 - Static201.anInt205;
			Static201.anInt202 = (Static201.aClass2_Sub13_Sub16_2.anInt8413 >> 6 << 6) + 64 - Static201.anInt198;
			@Pc(77) int[] local77 = new int[3];
			@Pc(79) int local79 = -1;
			@Pc(81) int local81 = -1;
			if (Static201.aClass2_Sub13_Sub16_2.method7027(local77, (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7660 >> 7) + Static238.anInt4280, Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90, (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt7659 >> 7) + Static371.anInt6936)) {
				local79 = local77[1] - Static201.anInt205;
				local81 = local77[2] - Static201.anInt198;
			}
			if (!Static174.aBoolean252 && local79 >= 0 && local79 < Static201.anInt201 && local81 >= 0 && Static201.anInt202 > local81) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static202.anInt3644 = local79;
				Static140.anInt2619 = local81;
			} else if (Static471.anInt8455 == -1 || Static83.anInt1711 == -1) {
				Static201.aClass2_Sub13_Sub16_2.method7033(local77, Static201.aClass2_Sub13_Sub16_2.anInt8420 & 0x3FFF, Static201.aClass2_Sub13_Sub16_2.anInt8420 >> 14 & 0x3FFF);
				Static202.anInt3644 = local77[1] - Static201.anInt205;
				Static140.anInt2619 = local77[2] - Static201.anInt198;
			} else {
				Static201.aClass2_Sub13_Sub16_2.method7033(local77, Static83.anInt1711, Static471.anInt8455);
				Static174.aBoolean252 = false;
				Static83.anInt1711 = -1;
				Static471.anInt8455 = -1;
				if (local77 != null) {
					Static140.anInt2619 = local77[2] - Static201.anInt198;
					Static202.anInt3644 = local77[1] - Static201.anInt205;
				}
			}
			if (Static201.aClass2_Sub13_Sub16_2.anInt8419 == 37) {
				Static201.aFloat5 = 3.0F;
				Static201.aFloat6 = 3.0F;
			} else if (Static201.aClass2_Sub13_Sub16_2.anInt8419 == 50) {
				Static201.aFloat5 = 4.0F;
				Static201.aFloat6 = 4.0F;
			} else if (Static201.aClass2_Sub13_Sub16_2.anInt8419 == 75) {
				Static201.aFloat5 = 6.0F;
				Static201.aFloat6 = 6.0F;
			} else if (Static201.aClass2_Sub13_Sub16_2.anInt8419 == 100) {
				Static201.aFloat5 = 8.0F;
				Static201.aFloat6 = 8.0F;
			} else if (Static201.aClass2_Sub13_Sub16_2.anInt8419 == 200) {
				Static201.aFloat5 = 16.0F;
				Static201.aFloat6 = 16.0F;
			} else {
				Static201.aFloat5 = 8.0F;
				Static201.aFloat6 = 8.0F;
			}
			Static201.anInt197 = (int) Static201.aFloat5 >> 1;
			Static201.aByteArrayArrayArray4 = Static525.method7622(Static201.anInt197);
			Static371.method5897();
			Static201.method370();
			Static411.aClass249_59 = new Class249();
			Static201.anInt196 += (int) (Math.random() * 5.0D) - 2;
			if (Static201.anInt196 < -8) {
				Static201.anInt196 = -8;
			}
			if (Static201.anInt196 > 8) {
				Static201.anInt196 = 8;
			}
			Static201.anInt195 += (int) (Math.random() * 5.0D) - 2;
			if (Static201.anInt195 < -16) {
				Static201.anInt195 = -16;
			}
			if (Static201.anInt195 > 16) {
				Static201.anInt195 = 16;
			}
			Static201.method362(arg0, Static201.anInt196 >> 2 << 10, Static201.anInt195 >> 1);
			Static201.aClass56_2.method1684(1024, 256);
			Static201.aClass112_2.method2962(256, 256);
			Static201.aClass206_2.method5332(4096);
			Static79.aClass80_1.method2315(256);
			Static111.anInt2224 = 20;
		} else if (Static111.anInt2224 == 20) {
			Static209.method3334(true);
			Static201.method349(arg1, Static201.anInt196, Static201.anInt195);
			Static111.anInt2224 = 60;
			Static209.method3334(true);
			Static378.method5953();
		} else if (Static111.anInt2224 == 60) {
			if (Static201.aClass53_3.method1593(Static201.aClass2_Sub13_Sub16_2.aString175 + "_staticelements")) {
				if (!Static201.aClass53_3.method1606(Static201.aClass2_Sub13_Sub16_2.aString175 + "_staticelements")) {
					return;
				}
				Static201.aClass86_2 = Static348.method5483(Static201.aClass2_Sub13_Sub16_2.aString175 + "_staticelements", Static201.aClass53_3, Static165.aBoolean245);
			} else {
				Static201.aClass86_2 = new Class86(0);
			}
			Static201.method350();
			Static111.anInt2224 = 70;
			Static209.method3334(true);
			Static378.method5953();
		} else if (Static111.anInt2224 == 70) {
			Static501.aClass25_7 = new Class25(arg1, 11, true, Static517.aCanvas14);
			Static111.anInt2224 = 73;
			Static209.method3334(true);
			Static378.method5953();
		} else if (Static111.anInt2224 == 73) {
			Static388.aClass25_5 = new Class25(arg1, 12, true, Static517.aCanvas14);
			Static111.anInt2224 = 76;
			Static209.method3334(true);
			Static378.method5953();
		} else if (Static111.anInt2224 == 76) {
			Static115.aClass25_2 = new Class25(arg1, 14, true, Static517.aCanvas14);
			Static111.anInt2224 = 79;
			Static209.method3334(true);
			Static378.method5953();
		} else if (Static111.anInt2224 == 79) {
			Static531.aClass25_8 = new Class25(arg1, 17, true, Static517.aCanvas14);
			Static111.anInt2224 = 82;
			Static209.method3334(true);
			Static378.method5953();
		} else if (Static111.anInt2224 == 82) {
			Static377.aClass25_4 = new Class25(arg1, 19, true, Static517.aCanvas14);
			Static111.anInt2224 = 85;
			Static209.method3334(true);
			Static378.method5953();
		} else if (Static111.anInt2224 == 85) {
			Static495.aClass25_6 = new Class25(arg1, 22, true, Static517.aCanvas14);
			Static111.anInt2224 = 88;
			Static209.method3334(true);
			Static378.method5953();
		} else if (Static111.anInt2224 == 88) {
			Static77.aClass25_1 = new Class25(arg1, 26, true, Static517.aCanvas14);
			Static111.anInt2224 = 91;
			Static209.method3334(true);
			Static378.method5953();
		} else {
			Static324.aClass25_3 = new Class25(arg1, 30, true, Static517.aCanvas14);
			Static111.anInt2224 = 100;
			Static209.method3334(true);
			Static378.method5953();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(III)V")
	public static void method814(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static75.anInt1562 == 1) {
			Static411.method6445(arg1, Static355.aClass2_Sub44_1, arg0);
		} else if (Static75.anInt1562 == 2) {
			Static361.method5813(arg0, arg1);
		}
		Static355.aClass2_Sub44_1 = null;
		Static75.anInt1562 = 0;
	}
}
