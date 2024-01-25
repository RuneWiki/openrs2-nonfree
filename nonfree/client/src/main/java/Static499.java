import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!sw", name = "Y", descriptor = "I")
	public static final int anInt7960 = 50;

	@OriginalMember(owner = "client!sw", name = "z", descriptor = "[I")
	public static final int[] anIntArray531 = new int[anInt7960];

	@OriginalMember(owner = "client!sw", name = "F", descriptor = "Lclient!cq;")
	public static final Class63 aClass63_39 = new Class63(12, 0, 1, 0);

	@OriginalMember(owner = "client!sw", name = "H", descriptor = "[I")
	public static final int[] anIntArray532 = new int[anInt7960];

	@OriginalMember(owner = "client!sw", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray39 = new String[anInt7960];

	@OriginalMember(owner = "client!sw", name = "K", descriptor = "[I")
	public static final int[] anIntArray533 = new int[anInt7960];

	@OriginalMember(owner = "client!sw", name = "M", descriptor = "[I")
	public static final int[] anIntArray534 = new int[anInt7960];

	@OriginalMember(owner = "client!sw", name = "O", descriptor = "[I")
	public static final int[] anIntArray535 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!sw", name = "P", descriptor = "I")
	public static int anInt7956 = 0;

	@OriginalMember(owner = "client!sw", name = "S", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!sw", name = "W", descriptor = "[I")
	public static final int[] anIntArray536 = new int[anInt7960];

	@OriginalMember(owner = "client!sw", name = "X", descriptor = "[I")
	public static final int[] anIntArray537 = new int[anInt7960];

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ZLclient!fa;Lclient!r;)V")
	public static void method6464(@OriginalArg(1) Interface9 arg0, @OriginalArg(2) Class162 arg1) {
		if (Static476.aClass2_Sub2_Sub9_3 == null) {
			return;
		}
		if (Static559.anInt9135 < 10) {
			if (!Static476.aClass229_112.method4959(Static476.aClass2_Sub2_Sub9_3.aString47)) {
				Static559.anInt9135 = Static237.aClass229_52.method4950(Static476.aClass2_Sub2_Sub9_3.aString47) / 10;
				return;
			}
			Static472.method6121();
			Static559.anInt9135 = 10;
		}
		if (Static559.anInt9135 == 10) {
			Static476.anInt7584 = Static476.aClass2_Sub2_Sub9_3.anInt3273 >> 6 << 6;
			Static476.anInt7583 = Static476.aClass2_Sub2_Sub9_3.anInt3266 >> 6 << 6;
			Static476.anInt7576 = (Static476.aClass2_Sub2_Sub9_3.anInt3267 >> 6 << 6) + 64 - Static476.anInt7583;
			Static476.anInt7586 = (Static476.aClass2_Sub2_Sub9_3.anInt3269 >> 6 << 6) + (64 - Static476.anInt7584);
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static476.aClass2_Sub2_Sub9_3.method2734(Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128, Static485.anInt7725 + (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9374 >> 9), (Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.anInt9375 >> 9) + Static310.anInt5129, local78)) {
				local82 = local78[2] - Static476.anInt7584;
				local80 = local78[1] - Static476.anInt7583;
			}
			if (!Static148.aBoolean166 && local80 >= 0 && Static476.anInt7576 > local80 && local82 >= 0 && local82 < Static476.anInt7586) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static366.anInt6166 = local82;
				Static26.anInt449 = local80;
			} else if (Static452.anInt7233 == -1 || Static567.anInt7430 == -1) {
				Static476.aClass2_Sub2_Sub9_3.method2729(Static476.aClass2_Sub2_Sub9_3.anInt3271 & 0x3FFF, Static476.aClass2_Sub2_Sub9_3.anInt3271 >> 14 & 0x3FFF, local78);
				Static366.anInt6166 = local78[2] - Static476.anInt7584;
				Static26.anInt449 = local78[1] - Static476.anInt7583;
			} else {
				Static476.aClass2_Sub2_Sub9_3.method2729(Static567.anInt7430, Static452.anInt7233, local78);
				if (local78 != null) {
					Static26.anInt449 = local78[1] - Static476.anInt7583;
					Static366.anInt6166 = local78[2] - Static476.anInt7584;
				}
				Static148.aBoolean166 = false;
				Static567.anInt7430 = -1;
				Static452.anInt7233 = -1;
			}
			if (Static476.aClass2_Sub2_Sub9_3.anInt3275 == 37) {
				Static476.aFloat197 = 3.0F;
				Static476.aFloat196 = 3.0F;
			} else if (Static476.aClass2_Sub2_Sub9_3.anInt3275 == 50) {
				Static476.aFloat197 = 4.0F;
				Static476.aFloat196 = 4.0F;
			} else if (Static476.aClass2_Sub2_Sub9_3.anInt3275 == 75) {
				Static476.aFloat197 = 6.0F;
				Static476.aFloat196 = 6.0F;
			} else if (Static476.aClass2_Sub2_Sub9_3.anInt3275 == 100) {
				Static476.aFloat197 = 8.0F;
				Static476.aFloat196 = 8.0F;
			} else if (Static476.aClass2_Sub2_Sub9_3.anInt3275 == 200) {
				Static476.aFloat197 = 16.0F;
				Static476.aFloat196 = 16.0F;
			} else {
				Static476.aFloat197 = 8.0F;
				Static476.aFloat196 = 8.0F;
			}
			Static476.anInt7574 = (int) Static476.aFloat197 >> 1;
			Static476.aByteArrayArrayArray17 = Static465.method5996(Static476.anInt7574);
			Static170.method2217();
			Static476.method6113();
			Static177.aClass70_9 = new Class70();
			Static476.anInt7572 += (int) (Math.random() * 5.0D) - 2;
			if (Static476.anInt7572 < -8) {
				Static476.anInt7572 = -8;
			}
			Static476.anInt7573 += (int) (Math.random() * 5.0D) - 2;
			if (Static476.anInt7572 > 8) {
				Static476.anInt7572 = 8;
			}
			if (Static476.anInt7573 < -16) {
				Static476.anInt7573 = -16;
			}
			if (Static476.anInt7573 > 16) {
				Static476.anInt7573 = 16;
			}
			Static476.method6117(arg0, Static476.anInt7572 >> 2 << 10, Static476.anInt7573 >> 1);
			Static476.aClass360_4.method7571(1024, 256);
			Static476.aClass212_5.method4406(256, 256);
			Static476.aClass290_4.method5801(4096);
			Static31.aClass145_1.method2544(256);
			Static559.anInt9135 = 20;
		} else if (Static559.anInt9135 == 20) {
			Static333.method4776(true);
			Static476.method6099(arg1, Static476.anInt7572, Static476.anInt7573);
			Static559.anInt9135 = 60;
			Static333.method4776(true);
			Static524.method6734();
		} else if (Static559.anInt9135 == 60) {
			if (Static476.aClass229_112.method4951(Static476.aClass2_Sub2_Sub9_3.aString47 + "_staticelements")) {
				if (!Static476.aClass229_112.method4959(Static476.aClass2_Sub2_Sub9_3.aString47 + "_staticelements")) {
					return;
				}
				Static476.aClass214_3 = Static134.method1814(Static476.aClass2_Sub2_Sub9_3.aString47 + "_staticelements", Static524.aBoolean704, Static476.aClass229_112);
			} else {
				Static476.aClass214_3 = new Class214(0);
			}
			Static476.method6098();
			Static559.anInt9135 = 70;
			Static333.method4776(true);
			Static524.method6734();
		} else if (Static559.anInt9135 == 70) {
			Static336.aClass200_7 = new Class200(arg1, 11, true, Static9.aCanvas1);
			Static559.anInt9135 = 73;
			Static333.method4776(true);
			Static524.method6734();
		} else if (Static559.anInt9135 == 73) {
			Static75.aClass200_1 = new Class200(arg1, 12, true, Static9.aCanvas1);
			Static559.anInt9135 = 76;
			Static333.method4776(true);
			Static524.method6734();
		} else if (Static559.anInt9135 == 76) {
			Static94.aClass200_2 = new Class200(arg1, 14, true, Static9.aCanvas1);
			Static559.anInt9135 = 79;
			Static333.method4776(true);
			Static524.method6734();
		} else if (Static559.anInt9135 == 79) {
			Static212.aClass200_4 = new Class200(arg1, 17, true, Static9.aCanvas1);
			Static559.anInt9135 = 82;
			Static333.method4776(true);
			Static524.method6734();
		} else if (Static559.anInt9135 == 82) {
			Static343.aClass200_8 = new Class200(arg1, 19, true, Static9.aCanvas1);
			Static559.anInt9135 = 85;
			Static333.method4776(true);
			Static524.method6734();
		} else if (Static559.anInt9135 == 85) {
			Static115.aClass200_3 = new Class200(arg1, 22, true, Static9.aCanvas1);
			Static559.anInt9135 = 88;
			Static333.method4776(true);
			Static524.method6734();
		} else if (Static559.anInt9135 == 88) {
			Static290.aClass200_6 = new Class200(arg1, 26, true, Static9.aCanvas1);
			Static559.anInt9135 = 91;
			Static333.method4776(true);
			Static524.method6734();
		} else {
			Static246.aClass200_5 = new Class200(arg1, 30, true, Static9.aCanvas1);
			Static559.anInt9135 = 100;
			Static333.method4776(true);
			Static524.method6734();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(FIIIIIFIF[FIII)V")
	public static void method6466(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg3 - arg11;
		@Pc(13) int local13 = arg2 - arg4;
		@Pc(17) int local17 = arg7 - arg5;
		@Pc(38) float local38 = (float) local13 * arg9[0] + (float) local5 * arg9[1] + (float) local17 * arg9[2];
		@Pc(59) float local59 = (float) local17 * arg9[5] + arg9[3] * (float) local13 + arg9[4] * (float) local5;
		@Pc(88) float local88 = (float) local13 * arg9[6] + (float) local5 * arg9[7] + arg9[8] * (float) local17;
		@Pc(119) float local119;
		@Pc(113) float local113;
		if (arg10 == 0) {
			local119 = local38 + arg6 + 0.5F;
			local113 = arg8 + 0.5F - local88;
		} else if (arg10 == 1) {
			local119 = local38 + arg6 + 0.5F;
			local113 = local88 + arg8 + 0.5F;
		} else if (arg10 == 2) {
			local113 = arg0 + 0.5F - local59;
			local119 = arg6 + 0.5F - local38;
		} else if (arg10 == 3) {
			local113 = arg0 + 0.5F - local59;
			local119 = local38 + arg6 + 0.5F;
		} else if (arg10 == 4) {
			local119 = local88 + arg8 + 0.5F;
			local113 = arg0 + 0.5F - local59;
		} else {
			local119 = arg8 + 0.5F - local88;
			local113 = arg0 + 0.5F - local59;
		}
		@Pc(205) float local205;
		if (arg1 == 1) {
			local205 = local119;
			local119 = -local113;
			local113 = local205;
		} else if (arg1 == 2) {
			local119 = -local119;
			local113 = -local113;
		} else if (arg1 == 3) {
			local205 = local119;
			local119 = local113;
			local113 = -local205;
		}
		Static341.aFloat161 = local113;
		Static543.aFloat234 = local119;
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIC)I")
	public static int method6469(@OriginalArg(0) int arg0, @OriginalArg(2) char arg1) {
		@Pc(7) int local7 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			@Pc(16) char local16 = Character.toLowerCase(arg1);
			local7 = (local16 << 4) + 1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sw", name = "g", descriptor = "(I)V")
	public static void method6471() {
		@Pc(12) Class2_Sub34 local12 = Static555.method7264(Static494.aClass154_107, Static551.aClass64_2);
		local12.aClass2_Sub7_Sub2_2.method4459(Static480.method6206());
		local12.aClass2_Sub7_Sub2_2.method4511(Static172.anInt2621);
		local12.aClass2_Sub7_Sub2_2.method4511(Static187.anInt8962);
		local12.aClass2_Sub7_Sub2_2.method4459(Static257.aClass2_Sub35_Sub1_1.anInt7498);
		Static100.method1508(local12);
	}
}
