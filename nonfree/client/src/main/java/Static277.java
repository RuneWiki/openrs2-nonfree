import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIIFF[F[FIZ)V")
	public static void method3848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) float[] arg9, @OriginalArg(10) int arg10) {
		@Pc(5) int local5 = arg2 - arg1;
		@Pc(13) int local13 = arg3 - arg10;
		@Pc(17) int local17 = arg0 - arg5;
		@Pc(38) float local38 = arg8[0] * (float) local5 + (float) local17 * arg8[1] + arg8[2] * (float) local13;
		@Pc(63) float local63 = arg8[5] * (float) local13 + arg8[4] * (float) local17 + (float) local5 * arg8[3];
		@Pc(84) float local84 = arg8[6] * (float) local5 + (float) local17 * arg8[7] + arg8[8] * (float) local13;
		@Pc(95) float local95 = (float) Math.atan2((double) local38, (double) local84) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local95 *= arg7;
		}
		@Pc(109) float local109 = local63 + arg6 + 0.5F;
		@Pc(116) float local116;
		if (arg4 == 1) {
			local116 = local95;
			local95 = -local109;
			local109 = local116;
		} else if (arg4 == 2) {
			local95 = -local95;
			local109 = -local109;
		} else if (arg4 == 3) {
			local116 = local95;
			local95 = local109;
			local109 = -local116;
		}
		arg9[1] = local109;
		arg9[0] = local95;
	}
}
