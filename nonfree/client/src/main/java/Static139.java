import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_54 = new Class27(10, 0);

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
	public static int anInt2875 = 0;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(FIIF[FIIIIBI)V")
	public static void method2393(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg5 - arg7;
		@Pc(9) int local9 = arg2 - arg1;
		@Pc(17) int local17 = arg6 - arg8;
		@Pc(38) float local38 = (float) local9 * arg4[2] + arg4[0] * (float) local5 + (float) local17 * arg4[1];
		@Pc(59) float local59 = (float) local17 * arg4[4] + (float) local5 * arg4[3] + arg4[5] * (float) local9;
		@Pc(80) float local80 = arg4[8] * (float) local9 + arg4[6] * (float) local5 + arg4[7] * (float) local17;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local91 *= arg0;
		}
		@Pc(109) float local109 = local59 + arg3 + 0.5F;
		@Pc(132) float local132;
		if (arg9 == 1) {
			local132 = local91;
			local91 = -local109;
			local109 = local132;
		} else if (arg9 == 2) {
			local109 = -local109;
			local91 = -local91;
		} else if (arg9 == 3) {
			local132 = local91;
			local91 = local109;
			local109 = -local132;
		}
		Static190.aFloat61 = local109;
		Static17.aFloat7 = local91;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)Z")
	public static boolean method2394(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([[BILclient!h;)V")
	public static void method2395(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class101_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.anInt2932; local7++) {
			Static278.method4705();
			for (@Pc(13) int local13 = 0; local13 < Static2.anInt7 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static17.anInt315 >> 3; local17++) {
					@Pc(27) int local27 = Static32.anIntArrayArrayArray1[local7][local13][local17];
					if (local27 != -1) {
						@Pc(37) int local37 = local27 >> 24 & 0x3;
						if (!arg1.aBoolean213 || local37 == 0) {
							@Pc(51) int local51 = local27 >> 1 & 0x3;
							@Pc(57) int local57 = local27 >> 14 & 0x3FF;
							@Pc(63) int local63 = local27 >> 3 & 0x7FF;
							@Pc(73) int local73 = local63 / 8 + (local57 / 8 << 8);
							for (@Pc(75) int local75 = 0; local75 < Static144.anIntArray288.length; local75++) {
								if (local73 == Static144.anIntArray288[local75] && arg0[local75] != null) {
									arg1.method2442((local63 & 0x7) * 8, arg0[local75], Static412.aClass50_8, (local57 & 0x7) * 8, local7, Static11.aClass220Array1, local17 * 8, local37, local51, local13 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
