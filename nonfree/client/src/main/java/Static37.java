import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bfa", name = "a", descriptor = "(F[FIZIIIIIFI)V")
	public static void method476(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4 - arg5;
		@Pc(18) int local18 = arg7 - arg3;
		@Pc(22) int local22 = arg6 - arg2;
		@Pc(43) float local43 = arg1[2] * (float) local18 + arg1[1] * (float) local22 + (float) local5 * arg1[0];
		@Pc(64) float local64 = (float) local5 * arg1[3] + (float) local22 * arg1[4] + arg1[5] * (float) local18;
		@Pc(85) float local85 = arg1[7] * (float) local22 + arg1[6] * (float) local5 + (float) local18 * arg1[8];
		@Pc(96) float local96 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local96 *= arg0;
		}
		@Pc(110) float local110 = local64 + arg8 + 0.5F;
		@Pc(117) float local117;
		if (arg9 == 1) {
			local117 = local96;
			local96 = -local110;
			local110 = local117;
		} else if (arg9 == 2) {
			local110 = -local110;
			local96 = -local96;
		} else if (arg9 == 3) {
			local117 = local96;
			local96 = local110;
			local110 = -local117;
		}
		Static59.aFloat34 = local110;
		Static321.aFloat193 = local96;
	}

	@OriginalMember(owner = "client!bfa", name = "c", descriptor = "(I)V")
	public static void method484() {
		Static384.anInt7375 = -1;
		Static273.aClass78_29 = null;
	}
}
