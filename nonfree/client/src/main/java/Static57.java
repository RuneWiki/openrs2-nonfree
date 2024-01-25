import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "Lclient!ci;")
	public static Class38 aClass38_12;

	@OriginalMember(owner = "client!cs", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "client!cs", name = "x", descriptor = "[I")
	public static final int[] anIntArray87 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cs", name = "A", descriptor = "I")
	public static int anInt1361 = -1;

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V")
	public static void method1244() {
		for (@Pc(10) Class4_Sub46 local10 = (Class4_Sub46) Static317.aClass91_34.method2584(); local10 != null; local10 = (Class4_Sub46) Static317.aClass91_34.method2586()) {
			if (Static294.aClass162ArrayArrayArray2 == null) {
				local10.method6330();
			} else {
				@Pc(44) int local44;
				@Pc(213) Class11_Sub3 local213;
				@Pc(249) Class11_Sub3_Sub2 local249;
				@Pc(70) Class11_Sub1 local70;
				@Pc(115) Class11_Sub5 local115;
				@Pc(268) Class11_Sub2 local268;
				@Pc(89) Class11_Sub1_Sub2 local89;
				@Pc(304) Class11_Sub2_Sub2 local304;
				if (local10.anInt7379 <= Static277.anInt2834) {
					local44 = Static86.anIntArray170[local10.anInt7371];
					if (local44 == 0) {
						local268 = Static278.method4397(local10.anInt7382, local10.anInt7372, local10.anInt7376);
						if (local268 instanceof Class11_Sub2_Sub2) {
							Static29.method6226(local10.anInt7382, local10.anInt7372, local10.anInt7376);
							local304 = (Class11_Sub2_Sub2) local268;
							if (local304.aClass11_Sub2_3 != null) {
								Static381.method5402(local10.anInt7382, local10.anInt7372, local10.anInt7376, local304.aClass11_Sub2_3, null);
							}
						}
					} else if (local44 == 1) {
						local213 = Static177.method3233(local10.anInt7382, local10.anInt7372, local10.anInt7376);
						if (local213 instanceof Class11_Sub3_Sub2) {
							Static254.method4164(local10.anInt7382, local10.anInt7372, local10.anInt7376);
							local249 = (Class11_Sub3_Sub2) local213;
							if (local249.aClass11_Sub3_3 != null) {
								Static164.method2905(local10.anInt7382, local10.anInt7372, local10.anInt7376, local249.aClass11_Sub3_3, null);
							}
						}
					} else if (local44 == 2) {
						local115 = Static422.method5870(local10.anInt7382, local10.anInt7372, local10.anInt7376, wo.class);
						if (local115 instanceof Class11_Sub5_Sub5) {
							Static76.method1645(local10.anInt7382, local10.anInt7372, local10.anInt7376, wo.class);
							@Pc(446) Class11_Sub5_Sub5 local446 = (Class11_Sub5_Sub5) local115;
							if (local446.aClass11_Sub5_2 != null) {
								Static72.method1589(local446.aClass11_Sub5_2, false);
							}
						}
					} else if (local44 == 3) {
						local70 = Static241.method4021(local10.anInt7382, local10.anInt7372, local10.anInt7376);
						if (local70 instanceof Class11_Sub1_Sub2) {
							Static343.method4798(local10.anInt7382, local10.anInt7372, local10.anInt7376);
							local89 = (Class11_Sub1_Sub2) local70;
							if (local89.aClass11_Sub1_1 != null) {
								Static106.method6190(local10.anInt7382, local10.anInt7372, local10.anInt7376, local89.aClass11_Sub1_1);
							}
						}
					}
					local10.method6330();
				} else if (Static277.anInt2834 == local10.anInt7373) {
					local44 = Static86.anIntArray170[local10.anInt7371];
					if (local44 == 0) {
						local268 = Static278.method4397(local10.anInt7382, local10.anInt7372, local10.anInt7376);
						if (local268 instanceof Class11_Sub2_Sub2) {
							local10.method6330();
						} else if (Static384.method5418(local10.anInt7382, local10.anInt7372, local10.anInt7376) == null) {
							local304 = new Class11_Sub2_Sub2(local10.anInt7371, local10.anInt7388, local10.anInt7381, local10.anInt7387, local10.anInt7374, local268);
							Static381.method5402(local10.anInt7382, local10.anInt7372, local10.anInt7376, local304, null);
						} else {
							local10.method6330();
						}
					} else if (local44 == 1) {
						local213 = Static177.method3233(local10.anInt7382, local10.anInt7372, local10.anInt7376);
						if (local213 instanceof Class11_Sub3_Sub2) {
							local10.method6330();
						} else if (Static39.method805(local10.anInt7382, local10.anInt7372, local10.anInt7376) == null) {
							local249 = new Class11_Sub3_Sub2(local10.anInt7371, local10.anInt7388, local10.anInt7381, local10.anInt7387, local10.anInt7374, local213);
							Static164.method2905(local10.anInt7382, local10.anInt7372, local10.anInt7376, local249, null);
						} else {
							local10.method6330();
						}
					} else if (local44 == 2) {
						local115 = Static422.method5870(local10.anInt7382, local10.anInt7372, local10.anInt7376, wo.class);
						if (local115 instanceof Class11_Sub5_Sub5) {
							local10.method6330();
						} else {
							Static76.method1645(local10.anInt7382, local10.anInt7372, local10.anInt7376, wo.class);
							@Pc(144) Class139 local144 = Static146.aClass228_1.method5203(local10.anInt7380);
							@Pc(155) int local155;
							@Pc(158) int local158;
							if (local10.anInt7388 == 1 || local10.anInt7388 == 3) {
								local155 = local144.anInt4350;
								local158 = local144.anInt4353;
							} else {
								local155 = local144.anInt4353;
								local158 = local144.anInt4350;
							}
							@Pc(199) Class11_Sub5_Sub5 local199 = new Class11_Sub5_Sub5(local10.anInt7371, local10.anInt7388, local10.anInt7382, local10.anInt7381, local10.anInt7387, local10.anInt7374, local10.anInt7372, local155 + local10.anInt7372 - 1, local10.anInt7376, local10.anInt7376 + local158 - 1, local115);
							Static72.method1589(local199, false);
						}
					} else if (local44 == 3) {
						local70 = Static241.method4021(local10.anInt7382, local10.anInt7372, local10.anInt7376);
						if (local70 instanceof Class11_Sub1_Sub2) {
							local10.method6330();
						} else {
							local89 = new Class11_Sub1_Sub2(local10.anInt7381, local10.anInt7387, local10.anInt7374, local70);
							Static106.method6190(local10.anInt7382, local10.anInt7372, local10.anInt7376, local89);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIZIIIIIII)V")
	public static void method1245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg5 && arg2 == arg0 && arg3 == arg6 && arg7 == arg1) {
			Static105.method2009(arg2, arg3, arg7, arg8, arg4);
			return;
		}
		@Pc(36) int local36 = arg4;
		@Pc(38) int local38 = arg2;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg2 * 3;
		@Pc(50) int local50 = arg5 * 3;
		@Pc(54) int local54 = arg0 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg1 * 3;
		@Pc(72) int local72 = local50 + arg3 - arg4 - local58;
		@Pc(82) int local82 = arg7 + local54 - local62 - arg2;
		@Pc(92) int local92 = local42 + local58 - local50 - local50;
		@Pc(101) int local101 = local62 + local46 - local54 - local54;
		@Pc(106) int local106 = local50 - local42;
		@Pc(110) int local110 = local54 - local46;
		for (@Pc(112) int local112 = 128; local112 <= 4096; local112 += 128) {
			@Pc(120) int local120 = local112 * local112 >> 12;
			@Pc(126) int local126 = local120 * local112 >> 12;
			@Pc(130) int local130 = local72 * local126;
			@Pc(134) int local134 = local82 * local126;
			@Pc(138) int local138 = local120 * local92;
			@Pc(142) int local142 = local120 * local101;
			@Pc(146) int local146 = local106 * local112;
			@Pc(150) int local150 = local110 * local112;
			@Pc(161) int local161 = arg4 + (local130 + local138 + local146 >> 12);
			@Pc(171) int local171 = arg2 + (local150 + local134 + local142 >> 12);
			Static105.method2009(local38, local161, local171, arg8, local36);
			local36 = local161;
			local38 = local171;
		}
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lclient!nt;IIIII)V")
	public static void method1247(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5190 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) long local16 = Static170.aLongArrayArrayArray1[arg1][local4][local7];
				@Pc(18) long local18 = 0L;
				while (true) {
					label49: while (true) {
						if (local18 > 48L) {
							continue label54;
						}
						@Pc(27) int local27 = (int) (local16 >>> (int) local18 & 0xFFFFL);
						if (local27 <= 0) {
							continue label54;
						}
						@Pc(35) Class153 local35 = client.lb[local27 - 1];
						for (@Pc(37) int local37 = 0; local37 < arg0.anInt5190; local37++) {
							if (arg0.aClass4_Sub17Array3[local37] == local35.aClass4_Sub17_2) {
								local18 += 16L;
								continue label49;
							}
						}
						arg0.aClass4_Sub17Array3[arg0.anInt5190++] = local35.aClass4_Sub17_2;
						if (arg0.anInt5190 == 4) {
							break label56;
						}
						local18 += 16L;
					}
				}
			}
		}
		for (local7 = arg0.anInt5190; local7 < 4; local7++) {
			arg0.aClass4_Sub17Array3[local7] = null;
		}
	}
}
