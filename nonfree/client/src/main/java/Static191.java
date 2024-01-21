import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "[I")
	public static int[] anIntArray516;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
	public static int anInt4389;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "[Lclient!mg;")
	public static final Class60[] aClass60Array1 = new Class60[500];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	public static void method3095() {
		for (@Pc(7) int local7 = -1; local7 < Static15.anInt327; local7++) {
			@Pc(14) int local14;
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static168.anIntArray460[local7];
			}
			@Pc(24) Class3_Sub1_Sub5_Sub4_Sub2 local24 = Static163.aClass3_Sub1_Sub5_Sub4_Sub2Array1[local14];
			if (local24 != null) {
				Static130.method1962(1, local24);
			}
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	public static void method3097() {
		Static6.aClass54_2 = new Class54(32);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
	public static void method3098() {
		if (!Static148.aBoolean134) {
			Static173.anInt3892 = 1;
			Static160.aShortArray46[0] = 1005;
			Static148.aClass80Array25[0] = Static181.aClass80_1571;
			Static18.aClass80Array5[0] = Static185.aClass80_1637;
		}
		if (Static121.anInt2651 != -1) {
			Static11.method219(Static121.anInt2651);
		}
		for (@Pc(29) int local29 = 0; local29 < Static60.anInt1321; local29++) {
			if (Static63.aBooleanArray8[local29]) {
				Static158.aBooleanArray18[local29] = true;
			}
			Static62.aBooleanArray5[local29] = Static63.aBooleanArray8[local29];
			Static63.aBooleanArray8[local29] = false;
		}
		Static94.aClass77_9 = null;
		Static175.anInt3956 = -1;
		Static25.anInt576 = -1;
		Static162.anInt3643 = Static193.anInt4411;
		if (Static121.anInt2651 != -1) {
			Static60.anInt1321 = 0;
			Static174.method2815(0, -1, 0, 765, 0, Static121.anInt2651, 0, 503);
		}
		Static24.method2571();
		Static120.method1823();
		if (Static148.aBoolean134) {
			Static110.method1712();
		} else if (Static25.anInt576 != -1) {
			Static3.method122(Static25.anInt576, Static175.anInt3956);
		}
		if (Static102.anInt2141 == 3) {
			for (@Pc(107) int local107 = 0; local107 < Static60.anInt1321; local107++) {
				if (Static62.aBooleanArray5[local107]) {
					Static24.method2575(Static160.anIntArray444[local107], Static33.anIntArray99[local107], Static148.anIntArray427[local107], Static130.anIntArray379[local107], 16711935, 128);
				} else if (Static158.aBooleanArray18[local107]) {
					Static24.method2575(Static160.anIntArray444[local107], Static33.anIntArray99[local107], Static148.anIntArray427[local107], Static130.anIntArray379[local107], 16711680, 128);
				}
			}
		}
		Static195.method3153(Static153.anInt673, Static152.anInt3407, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4329, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anInt4315);
		Static152.anInt3407 = 0;
	}
}
