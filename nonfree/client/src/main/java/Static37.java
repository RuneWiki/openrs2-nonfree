import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
	public static int anInt2944;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "Lclient!gn;")
	public static Class66 aClass66_5;

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString102 = " from your ignore list first.";

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "Z")
	public static boolean aBoolean219 = true;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "[F")
	public static float[] aFloatArray23 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
	public static int anInt2946 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public static void method2464() {
		try {
			if (Static137.anInt3867 == 1) {
				@Pc(16) int local16 = Static256.aClass1_Sub8_Sub4_3.method4238();
				if (local16 > 0 && Static256.aClass1_Sub8_Sub4_3.method4225()) {
					local16 -= Static151.anInt2792;
					if (local16 < 0) {
						local16 = 0;
					}
					Static256.aClass1_Sub8_Sub4_3.method4218(local16);
					return;
				}
				Static256.aClass1_Sub8_Sub4_3.method4223();
				Static256.aClass1_Sub8_Sub4_3.method4228();
				if (Static262.aClass7_210 == null) {
					Static137.anInt3867 = 0;
				} else {
					Static137.anInt3867 = 2;
				}
				Static13.aClass42_2 = null;
				Static123.aClass1_Sub33_1 = null;
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static256.aClass1_Sub8_Sub4_3.method4223();
			Static262.aClass7_210 = null;
			Static123.aClass1_Sub33_1 = null;
			Static137.anInt3867 = 0;
			Static13.aClass42_2 = null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II[Lclient!og;)V")
	public static void method2466(@OriginalArg(1) int arg0, @OriginalArg(2) Class127[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(19) Class127 local19 = arg1[local7];
			if (local19 != null && local19.anInt3563 == arg0 && (!local19.aBoolean261 || !Static43.method805(local19))) {
				if (local19.anInt3570 == 0) {
					if (!local19.aBoolean261 && Static43.method805(local19) && local19 != Static30.aClass127_1) {
						continue;
					}
					method2466(local19.anInt3574, arg1);
					if (local19.aClass127Array1 != null) {
						method2466(local19.anInt3574, local19.aClass127Array1);
					}
					@Pc(70) Class1_Sub32 local70 = (Class1_Sub32) Static67.aClass22_7.method633((long) local19.anInt3574);
					if (local70 != null) {
						Static39.method719(local70.anInt5665);
					}
				}
				if (local19.anInt3570 == 6) {
					@Pc(106) int local106;
					if (local19.anInt3623 != -1 || local19.anInt3606 != -1) {
						@Pc(101) boolean local101 = Static103.method1652(local19);
						if (local101) {
							local106 = local19.anInt3606;
						} else {
							local106 = local19.anInt3623;
						}
						if (local106 != -1) {
							@Pc(120) Class133 local120 = Static262.method4031(local106);
							if (local120 != null) {
								local19.anInt3569 += Static47.anInt5866;
								while (local120.anIntArray460[local19.anInt3581] < local19.anInt3569) {
									local19.anInt3569 -= local120.anIntArray460[local19.anInt3581];
									local19.anInt3581++;
									if (local19.anInt3581 >= local120.anIntArray461.length) {
										local19.anInt3581 -= local120.anInt4026;
										if (local19.anInt3581 < 0 || local120.anIntArray461.length <= local19.anInt3581) {
											local19.anInt3581 = 0;
										}
									}
									local19.anInt3624 = local19.anInt3581 + 1;
									if (local120.anIntArray461.length <= local19.anInt3624) {
										local19.anInt3624 -= local120.anInt4026;
										if (local19.anInt3624 < 0 || local19.anInt3624 >= local120.anIntArray461.length) {
											local19.anInt3624 = -1;
										}
									}
									Static155.method2392(local19);
								}
							}
						}
					}
					if (local19.anInt3636 != 0 && !local19.aBoolean261) {
						@Pc(233) int local233 = local19.anInt3636 >> 16;
						@Pc(237) int local237 = local233 * Static47.anInt5866;
						local19.anInt3577 = local19.anInt3577 + local237 & 0x7FF;
						local106 = local19.anInt3636 << 16 >> 16;
						local106 *= Static47.anInt5866;
						local19.anInt3620 = local106 + local19.anInt3620 & 0x7FF;
						Static155.method2392(local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!og;B)Ljava/lang/String;")
	public static String method2468(@OriginalArg(0) Class127 arg0) {
		if (Static43.method794(arg0).method4351() == 0) {
			return null;
		} else if (arg0.aString122 == null || arg0.aString122.trim().length() == 0) {
			return Static26.aBoolean49 ? "Hidden-use" : null;
		} else {
			return arg0.aString122;
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	public static void method2469() {
		Static26.aClass31_7.method850();
	}
}
