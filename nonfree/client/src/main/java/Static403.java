import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!qq", name = "B", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!qq", name = "C", descriptor = "Lclient!ra;")
	public static Class36 aClass36_3;

	@OriginalMember(owner = "client!qq", name = "F", descriptor = "I")
	public static int anInt7100;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIFIFIBI[FFIII)V")
	public static void method6414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg3 - arg1;
		@Pc(9) int local9 = arg10 - arg11;
		@Pc(13) int local13 = arg0 - arg6;
		@Pc(38) float local38 = (float) local13 * arg7[1] + (float) local5 * arg7[0] + arg7[2] * (float) local9;
		@Pc(59) float local59 = (float) local9 * arg7[5] + (float) local5 * arg7[3] + (float) local13 * arg7[4];
		@Pc(80) float local80 = arg7[8] * (float) local9 + arg7[7] * (float) local13 + arg7[6] * (float) local5;
		@Pc(98) float local98;
		@Pc(92) float local92;
		if (arg9 == 0) {
			local92 = arg4 + 0.5F - local80;
			local98 = local38 + arg2 + 0.5F;
		} else if (arg9 == 1) {
			local92 = arg4 + local80 + 0.5F;
			local98 = arg2 + local38 + 0.5F;
		} else if (arg9 == 2) {
			local98 = arg2 + 0.5F - local38;
			local92 = arg8 + 0.5F - local59;
		} else if (arg9 == 3) {
			local98 = arg2 + local38 + 0.5F;
			local92 = arg8 + 0.5F - local59;
		} else if (arg9 == 4) {
			local92 = arg8 + 0.5F - local59;
			local98 = local80 + arg4 + 0.5F;
		} else {
			local98 = arg4 + 0.5F - local80;
			local92 = arg8 + 0.5F - local59;
		}
		@Pc(213) float local213;
		if (arg5 == 1) {
			local213 = local98;
			local98 = -local92;
			local92 = local213;
		} else if (arg5 == 2) {
			local98 = -local98;
			local92 = -local92;
		} else if (arg5 == 3) {
			local213 = local98;
			local98 = local92;
			local92 = -local213;
		}
		Static517.aFloat187 = local92;
		Static466.aFloat163 = local98;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!qa;Lclient!oe;IIIII)V")
	public static void method6416(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static63.anInt1587) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static501.anInt9458) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static420.anInt7323 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class64 local62 = Static263.aClass64ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static296.aClass7Array11[local17].ba(local23, local32) + Static296.aClass7Array11[local17].ba(local23 + 1, local32) + Static296.aClass7Array11[local17].ba(local23, local32 + 1) + Static296.aClass7Array11[local17].ba(local23 + 1, local32 + 1)) / 4 - (Static296.aClass7Array11[arg2].ba(arg3, arg4) + Static296.aClass7Array11[arg2].ba(arg3 + 1, arg4) + Static296.aClass7Array11[arg2].ba(arg3, arg4 + 1) + Static296.aClass7Array11[arg2].ba(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class20_Sub2 local143 = local62.aClass20_Sub2_1;
									@Pc(146) Class20_Sub2 local146 = local62.aClass20_Sub2_2;
									if (local143 != null && local143.method8038()) {
										arg1.method8034(local1, local143, (local32 - arg4) * Static382.anInt6794 + (1 - arg6) * Static270.anInt5197, arg0, local140, (local23 - arg3) * Static382.anInt6794 + (1 - arg5) * Static270.anInt5197);
									}
									if (local146 != null && local146.method8038()) {
										arg1.method8034(local1, local146, (local32 - arg4) * Static382.anInt6794 + (1 - arg6) * Static270.anInt5197, arg0, local140, (local23 - arg3) * Static382.anInt6794 + (1 - arg5) * Static270.anInt5197);
									}
									for (@Pc(219) Class232 local219 = local62.aClass232_2; local219 != null; local219 = local219.aClass232_3) {
										@Pc(223) Class20_Sub1 local223 = local219.aClass20_Sub1_2;
										if (local223 != null && local223.method8038() && (local23 == local223.aShort124 || local23 == local3) && (local32 == local223.aShort123 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort126 + 1 - local223.aShort124;
											@Pc(260) int local260 = local223.aShort125 + 1 - local223.aShort123;
											arg1.method8034(local1, local223, (local223.aShort123 - arg4) * Static382.anInt6794 + (local260 - arg6) * Static270.anInt5197, arg0, local140, (local223.aShort124 - arg3) * Static382.anInt6794 + (local252 - arg5) * Static270.anInt5197);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
