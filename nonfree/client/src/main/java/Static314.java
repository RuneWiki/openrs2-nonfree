import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!mj", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!mj", name = "E", descriptor = "Lclient!vf;")
	public static final Class342 aClass342_8 = new Class342(6, 0, 4, 2);

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(DI)V")
	public static void method4914(@OriginalArg(0) double arg0) {
		if (Static541.aDouble12 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static176.anIntArray217[local15] = local27 > 255 ? 255 : local27;
		}
		Static541.aDouble12 = arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!ac;IZ)V")
	public static void method4916(@OriginalArg(0) Class4_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static421.anInt7365 >= 400) {
			return;
		}
		@Pc(14) Class273 local14 = arg0.aClass273_1;
		if (local14.anIntArray537 != null) {
			local14 = local14.method6159(Static498.aClass101_1);
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean521) {
			return;
		}
		@Pc(32) String local32 = local14.aString74;
		if (local14.anInt7455 != 0) {
			@Pc(48) String local48 = Static255.aClass37_2 == Static317.aClass37_3 ? Static230.aClass156_29.method4065(Static25.anInt769) : Static230.aClass156_27.method4065(Static25.anInt769);
			local32 = local32 + Static130.method2585(local14.anInt7455, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7139) + " (" + local48 + local14.anInt7455 + ")";
		}
		if (Static199.aBoolean458 && !arg1) {
			@Pc(85) Class320 local85 = Static592.anInt9588 == -1 ? null : Static577.aClass185_2.method4519(Static592.anInt9588);
			if ((Static348.anInt6222 & 0x2) != 0 && (local85 == null || local14.method6154(Static592.anInt9588, local85.anInt8653) != local85.anInt8653)) {
				Static142.method7766(false, true, -1, 58, Static104.aString16, (long) arg0.anInt7126, Static22.aString33 + " -> <col=ffff00>" + local32, 0, Static209.anInt4228, 0);
			}
		}
		if (!arg1) {
			@Pc(135) String[] local135 = local14.aStringArray31;
			if (Static130.aBoolean211) {
				local135 = Static420.method5995(local135);
			}
			@Pc(145) int local145;
			if (local135 != null) {
				for (local145 = 4; local145 >= 0; local145--) {
					if (local135[local145] != null && (local14.aByte76 == 0 || !local135[local145].equalsIgnoreCase(Static230.aClass156_22.method4065(Static25.anInt769)))) {
						@Pc(168) byte local168 = 0;
						@Pc(170) int local170 = Static482.anInt8150;
						if (local145 == 0) {
							local168 = 51;
						}
						if (local145 == 1) {
							local168 = 2;
						}
						if (local145 == 2) {
							local168 = 13;
						}
						if (local145 == 3) {
							local168 = 30;
						}
						if (local14.anInt7466 == local145) {
							local170 = local14.anInt7476;
						}
						if (local145 == 4) {
							local168 = 47;
						}
						if (local14.anInt7473 == local145) {
							local170 = local14.anInt7453;
						}
						Static142.method7766(false, true, -1, local168, local135[local145], (long) arg0.anInt7126, "<col=ffff00>" + local32, 0, local135[local145].equalsIgnoreCase(Static230.aClass156_22.method4065(Static25.anInt769)) ? local14.anInt7456 : local170, 0);
					}
				}
			}
			if (local14.aByte76 == 1 && local135 != null) {
				for (local145 = 4; local145 >= 0; local145--) {
					if (local135[local145] != null && local135[local145].equalsIgnoreCase(Static230.aClass156_22.method4065(Static25.anInt769))) {
						@Pc(279) short local279 = 0;
						if (local14.anInt7455 > Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7139) {
							local279 = 2000;
						}
						@Pc(292) short local292 = 0;
						if (local145 == 0) {
							local292 = 51;
						}
						if (local145 == 1) {
							local292 = 2;
						}
						if (local145 == 2) {
							local292 = 13;
						}
						if (local145 == 3) {
							local292 = 30;
						}
						if (local145 == 4) {
							local292 = 47;
						}
						if (local292 != 0) {
							local292 += local279;
						}
						Static142.method7766(false, true, -1, local292, local135[local145], (long) arg0.anInt7126, "<col=ffff00>" + local32, 0, local14.anInt7456, 0);
					}
				}
			}
		}
		Static142.method7766(arg1, true, -1, 1001, Static230.aClass156_21.method4065(Static25.anInt769), (long) arg0.anInt7126, "<col=ffff00>" + local32, 0, Static355.anInt7386, 0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!pfa;B)V")
	public static void method4917(@OriginalArg(0) Class251 arg0) {
		Static599.aClass251_130 = arg0;
	}
}
