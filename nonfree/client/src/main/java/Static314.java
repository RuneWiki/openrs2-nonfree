import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
	public static int anInt6245;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
	public static int anInt6237 = 0;

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "[I")
	public static final int[] anIntArray627 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_102 = new Class37(64);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!lm;)V")
	public static void method5369(@OriginalArg(1) Class134 arg0) {
		Static83.aClass134_34 = arg0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
	public static void method5370() {
		Static194.aClass37_64.method919();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!fh;Lclient!ii;)V")
	public static void method5373(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class105 arg1) {
		if (Static150.aClass1_Sub2_Sub8_2 == null) {
			return;
		}
		if (Static132.anInt6774 < 10) {
			if (!Static150.aClass134_63.method3030(Static150.aClass1_Sub2_Sub8_2.aString131)) {
				Static132.anInt6774 = Static282.aClass134_79.method3023(Static150.aClass1_Sub2_Sub8_2.aString131) / 10;
				return;
			}
			Static20.method359();
			Static132.anInt6774 = 10;
		}
		if (Static132.anInt6774 == 10) {
			Static150.anInt2643 = Static150.aClass1_Sub2_Sub8_2.anInt3603 >> 6 << 6;
			Static150.anInt2638 = Static150.aClass1_Sub2_Sub8_2.anInt3602 >> 6 << 6;
			Static150.anInt2639 = (Static150.aClass1_Sub2_Sub8_2.anInt3604 >> 6 << 6) + 64 - Static150.anInt2643;
			Static150.anInt2636 = (Static150.aClass1_Sub2_Sub8_2.anInt3600 >> 6 << 6) + 64 - Static150.anInt2638;
			@Pc(83) int[] local83 = new int[3];
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = -1;
			if (Static150.aClass1_Sub2_Sub8_2.method3055(Static92.anInt1755 + (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 >> 7), Static127.anInt2487, (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 >> 7) + Static98.anInt1911, local83)) {
				local87 = local83[2] - Static150.anInt2638;
				local85 = local83[1] - Static150.anInt2643;
			}
			if (!Static50.aBoolean84 && local85 >= 0 && local85 < Static150.anInt2639 && local87 >= 0 && Static150.anInt2636 > local87) {
				local85 += (int) (Math.random() * 10.0D) - 5;
				local87 += (int) (Math.random() * 10.0D) - 5;
				Static24.anInt439 = local87;
				Static22.anInt428 = local85;
			} else if (Static158.anInt3302 == -1 || Static331.anInt3764 == -1) {
				Static150.aClass1_Sub2_Sub8_2.method3051(local83, Static150.aClass1_Sub2_Sub8_2.anInt3610 & 0x3FFF, Static150.aClass1_Sub2_Sub8_2.anInt3610 >> 14 & 0x3FFF);
				Static24.anInt439 = local83[2] - Static150.anInt2638;
				Static22.anInt428 = local83[1] - Static150.anInt2643;
			} else {
				Static150.aClass1_Sub2_Sub8_2.method3051(local83, Static331.anInt3764, Static158.anInt3302);
				if (local83 != null) {
					Static24.anInt439 = local83[2] - Static150.anInt2638;
					Static22.anInt428 = local83[1] - Static150.anInt2643;
				}
				Static331.anInt3764 = -1;
				Static158.anInt3302 = -1;
				Static50.aBoolean84 = false;
			}
			if (Static150.aClass1_Sub2_Sub8_2.anInt3608 == 37) {
				Static150.aFloat19 = 3.0F;
				Static150.aFloat20 = 3.0F;
			} else if (Static150.aClass1_Sub2_Sub8_2.anInt3608 == 50) {
				Static150.aFloat19 = 4.0F;
				Static150.aFloat20 = 4.0F;
			} else if (Static150.aClass1_Sub2_Sub8_2.anInt3608 == 75) {
				Static150.aFloat19 = 6.0F;
				Static150.aFloat20 = 6.0F;
			} else if (Static150.aClass1_Sub2_Sub8_2.anInt3608 == 100) {
				Static150.aFloat19 = 8.0F;
				Static150.aFloat20 = 8.0F;
			} else if (Static150.aClass1_Sub2_Sub8_2.anInt3608 == 200) {
				Static150.aFloat19 = 16.0F;
				Static150.aFloat20 = 16.0F;
			} else {
				Static150.aFloat19 = 8.0F;
				Static150.aFloat20 = 8.0F;
			}
			Static150.anInt2632 = (int) Static150.aFloat19 >> 1;
			Static150.aByteArrayArrayArray6 = Static307.method5321(Static150.anInt2632);
			Static173.method3116();
			Static150.method2247();
			Static332.aClass14_35 = new Class14();
			Static276.aClass137_1 = new Class137();
			Static150.anInt2630 += (int) (Math.random() * 5.0D) - 2;
			if (Static150.anInt2630 < -8) {
				Static150.anInt2630 = -8;
			}
			if (Static150.anInt2630 > 8) {
				Static150.anInt2630 = 8;
			}
			Static150.anInt2631 += (int) (Math.random() * 5.0D) - 2;
			if (Static150.anInt2631 < -16) {
				Static150.anInt2631 = -16;
			}
			if (Static150.anInt2631 > 16) {
				Static150.anInt2631 = 16;
			}
			Static150.method2249(arg0, Static150.anInt2630 >> 2 << 10, Static150.anInt2631 >> 1);
			Static49.method4590(256, 1024);
			Static180.method3195(256, 256);
			Static148.method2610(4096);
			Static214.method3960(256);
			Static132.anInt6774 = 20;
		} else if (Static132.anInt6774 == 20) {
			Static75.method1298(true);
			Static150.method2246(arg1, Static150.anInt2630, Static150.anInt2631);
			Static132.anInt6774 = 60;
			Static75.method1298(true);
			Static228.method4127();
		} else if (Static132.anInt6774 == 60) {
			if (Static150.aClass134_63.method3007(Static150.aClass1_Sub2_Sub8_2.aString131 + "_staticelements")) {
				if (!Static150.aClass134_63.method3030(Static150.aClass1_Sub2_Sub8_2.aString131 + "_staticelements")) {
					return;
				}
				Static150.aClass129_3 = Static263.method4745(Static228.aBoolean379, Static150.aClass1_Sub2_Sub8_2.aString131 + "_staticelements", Static150.aClass134_63);
			} else {
				Static150.aClass129_3 = new Class129(0);
			}
			Static150.method2258();
			Static132.anInt6774 = 70;
			Static75.method1298(true);
			Static228.method4127();
		} else if (Static132.anInt6774 == 70) {
			Static83.aClass90_3 = new Class90(arg1, 11, true, Static235.aCanvas6);
			Static132.anInt6774 = 73;
			Static75.method1298(true);
			Static228.method4127();
		} else if (Static132.anInt6774 == 73) {
			Static5.aClass90_1 = new Class90(arg1, 12, true, Static235.aCanvas6);
			Static132.anInt6774 = 76;
			Static75.method1298(true);
			Static228.method4127();
		} else if (Static132.anInt6774 == 76) {
			Static342.aClass90_6 = new Class90(arg1, 14, true, Static235.aCanvas6);
			Static132.anInt6774 = 79;
			Static75.method1298(true);
			Static228.method4127();
		} else if (Static132.anInt6774 == 79) {
			Static268.aClass90_7 = new Class90(arg1, 17, true, Static235.aCanvas6);
			Static132.anInt6774 = 82;
			Static75.method1298(true);
			Static228.method4127();
		} else if (Static132.anInt6774 == 82) {
			Static309.aClass90_8 = new Class90(arg1, 19, true, Static235.aCanvas6);
			Static132.anInt6774 = 85;
			Static75.method1298(true);
			Static228.method4127();
		} else if (Static132.anInt6774 == 85) {
			Static92.aClass90_4 = new Class90(arg1, 22, true, Static235.aCanvas6);
			Static132.anInt6774 = 88;
			Static75.method1298(true);
			Static228.method4127();
		} else if (Static132.anInt6774 == 88) {
			Static355.aClass90_9 = new Class90(arg1, 26, true, Static235.aCanvas6);
			Static132.anInt6774 = 91;
			Static75.method1298(true);
			Static228.method4127();
		} else {
			Static47.aClass90_2 = new Class90(arg1, 30, true, Static235.aCanvas6);
			Static132.anInt6774 = 100;
			Static75.method1298(true);
			Static228.method4127();
			System.gc();
		}
	}
}
