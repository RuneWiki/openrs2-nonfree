import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static236 {

	@OriginalMember(owner = "client!op", name = "n", descriptor = "Lclient!ea;")
	public static Class55 aClass55_9;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "I")
	public static int anInt4221;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	public static int anInt4222;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_101 = new Class85("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!op", name = "j", descriptor = "I")
	public static int anInt4218 = 0;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "I")
	public static int anInt4219 = -1;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!op", name = "r", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_46 = new Class109(100);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V")
	public static void method3914(@OriginalArg(1) int arg0) {
		Static110.aClass109_25 = new Class109(arg0);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!eq;IZ)V")
	public static void method3917(@OriginalArg(0) int arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2) {
		Static42.aClass65ArrayArray1[arg2][arg0] = arg1;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!gf;Lclient!ea;)V")
	public static void method3921(@OriginalArg(1) Interface3 arg0, @OriginalArg(2) Class55 arg1) {
		if (Static290.aClass5_Sub1_Sub6_2 == null) {
			return;
		}
		if (Static149.anInt2919 < 10) {
			if (!Static290.aClass93_55.method2405(Static290.aClass5_Sub1_Sub6_2.aString12)) {
				Static149.anInt2919 = Static48.aClass93_15.method2394(Static290.aClass5_Sub1_Sub6_2.aString12) / 10;
				return;
			}
			Static286.method4982();
			Static149.anInt2919 = 10;
		}
		if (Static149.anInt2919 == 10) {
			Static290.anInt2772 = Static290.aClass5_Sub1_Sub6_2.anInt1931 >> 6 << 6;
			Static290.anInt2776 = Static290.aClass5_Sub1_Sub6_2.anInt1946 >> 6 << 6;
			Static290.anInt2766 = (Static290.aClass5_Sub1_Sub6_2.anInt1945 >> 6 << 6) + 64 - Static290.anInt2772;
			Static290.anInt2777 = (Static290.aClass5_Sub1_Sub6_2.anInt1944 >> 6 << 6) + 64 - Static290.anInt2776;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static290.aClass5_Sub1_Sub6_2.method1829(Static239.anInt4811, (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 >> 7) + Static172.anInt4394, Static12.anInt3797 - -(Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 >> 7), local75)) {
				local79 = local75[2] - Static290.anInt2772;
				local77 = local75[1] - Static290.anInt2776;
			}
			if (!Static217.aBoolean353 && local77 >= 0 && local77 < Static290.anInt2777 && local79 >= 0 && local79 < Static290.anInt2766) {
				local77 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static32.anInt633 = local77;
				Static314.anInt6098 = local79;
			} else if (Static319.anInt6185 == -1 || Static227.anInt4569 == -1) {
				Static290.aClass5_Sub1_Sub6_2.method1835(Static290.aClass5_Sub1_Sub6_2.anInt1935 & 0x3FFF, local75, Static290.aClass5_Sub1_Sub6_2.anInt1935 >> 14 & 0x3FFF);
				Static32.anInt633 = local75[1] - Static290.anInt2776;
				Static314.anInt6098 = local75[2] - Static290.anInt2772;
			} else {
				Static290.aClass5_Sub1_Sub6_2.method1835(Static227.anInt4569, local75, Static319.anInt6185);
				if (local75 != null) {
					Static32.anInt633 = local75[1] - Static290.anInt2776;
					Static314.anInt6098 = local75[2] - Static290.anInt2772;
				}
				Static217.aBoolean353 = false;
				Static227.anInt4569 = -1;
				Static319.anInt6185 = -1;
			}
			if (Static290.aClass5_Sub1_Sub6_2.anInt1938 == 37) {
				Static290.aFloat20 = 3.0F;
				Static290.aFloat21 = 3.0F;
			} else if (Static290.aClass5_Sub1_Sub6_2.anInt1938 == 50) {
				Static290.aFloat20 = 4.0F;
				Static290.aFloat21 = 4.0F;
			} else if (Static290.aClass5_Sub1_Sub6_2.anInt1938 == 75) {
				Static290.aFloat20 = 6.0F;
				Static290.aFloat21 = 6.0F;
			} else if (Static290.aClass5_Sub1_Sub6_2.anInt1938 == 100) {
				Static290.aFloat20 = 8.0F;
				Static290.aFloat21 = 8.0F;
			} else if (Static290.aClass5_Sub1_Sub6_2.anInt1938 == 200) {
				Static290.aFloat20 = 16.0F;
				Static290.aFloat21 = 16.0F;
			} else {
				Static290.aFloat20 = 8.0F;
				Static290.aFloat21 = 8.0F;
			}
			Static290.anInt2764 = (int) Static290.aFloat20 >> 1;
			Static290.aByteArrayArrayArray6 = Static270.method4719(Static290.anInt2764);
			Static255.method4513();
			Static290.method2559();
			Static239.aClass103_116 = new Class103();
			Static290.anInt2763 += (int) (Math.random() * 5.0D) - 2;
			if (Static290.anInt2763 < -8) {
				Static290.anInt2763 = -8;
			}
			Static290.anInt2765 += (int) (Math.random() * 5.0D) - 2;
			if (Static290.anInt2763 > 8) {
				Static290.anInt2763 = 8;
			}
			if (Static290.anInt2765 < -16) {
				Static290.anInt2765 = -16;
			}
			if (Static290.anInt2765 > 16) {
				Static290.anInt2765 = 16;
			}
			Static290.method2546(arg0, Static290.anInt2763 >> 2 << 10, Static290.anInt2765 >> 1);
			Static88.method1589(256, 1024);
			Static301.method5301(256, 256);
			method3914(4096);
			Static280.method4879(256);
			Static149.anInt2919 = 20;
		} else if (Static149.anInt2919 == 20) {
			Static274.method4824(true);
			Static290.method2548(arg1, Static290.anInt2763, Static290.anInt2765);
			Static149.anInt2919 = 60;
			Static274.method4824(true);
			Static163.method2870();
		} else if (Static149.anInt2919 == 60) {
			if (Static290.aClass93_55.method2391(Static290.aClass5_Sub1_Sub6_2.aString12 + "_staticelements")) {
				if (!Static290.aClass93_55.method2405(Static290.aClass5_Sub1_Sub6_2.aString12 + "_staticelements")) {
					return;
				}
				Static290.aClass64_2 = Static277.method4846(Static290.aClass93_55, Static290.aClass5_Sub1_Sub6_2.aString12 + "_staticelements", Static331.aBoolean537);
			} else {
				Static290.aClass64_2 = new Class64(0);
			}
			Static290.method2562();
			Static149.anInt2919 = 70;
			Static274.method4824(true);
			Static163.method2870();
		} else if (Static149.anInt2919 == 70) {
			Static215.aClass71_6 = new Class71(arg1, 11, true, Static102.aCanvas3);
			Static149.anInt2919 = 73;
			Static274.method4824(true);
			Static163.method2870();
		} else if (Static149.anInt2919 == 73) {
			Static41.aClass71_2 = new Class71(arg1, 12, true, Static102.aCanvas3);
			Static149.anInt2919 = 76;
			Static274.method4824(true);
			Static163.method2870();
		} else if (Static149.anInt2919 == 76) {
			Static335.aClass71_9 = new Class71(arg1, 14, true, Static102.aCanvas3);
			Static149.anInt2919 = 79;
			Static274.method4824(true);
			Static163.method2870();
		} else if (Static149.anInt2919 == 79) {
			Static349.aClass71_10 = new Class71(arg1, 17, true, Static102.aCanvas3);
			Static149.anInt2919 = 82;
			Static274.method4824(true);
			Static163.method2870();
		} else if (Static149.anInt2919 == 82) {
			Static30.aClass71_1 = new Class71(arg1, 19, true, Static102.aCanvas3);
			Static149.anInt2919 = 85;
			Static274.method4824(true);
			Static163.method2870();
		} else if (Static149.anInt2919 == 85) {
			Static319.aClass71_7 = new Class71(arg1, 22, true, Static102.aCanvas3);
			Static149.anInt2919 = 88;
			Static274.method4824(true);
			Static163.method2870();
		} else if (Static149.anInt2919 == 88) {
			Static133.aClass71_5 = new Class71(arg1, 26, true, Static102.aCanvas3);
			Static149.anInt2919 = 91;
			Static274.method4824(true);
			Static163.method2870();
		} else {
			Static331.aClass71_8 = new Class71(arg1, 30, true, Static102.aCanvas3);
			Static149.anInt2919 = 100;
			Static274.method4824(true);
			Static163.method2870();
			System.gc();
		}
	}
}
