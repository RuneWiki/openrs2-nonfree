import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IFF[FIIIIIIZ[F)V")
	public static void method6593(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) float[] arg10) {
		@Pc(5) int local5 = arg8 - arg4;
		@Pc(9) int local9 = arg7 - arg5;
		@Pc(13) int local13 = arg0 - arg6;
		@Pc(42) float local42 = (float) local13 * arg3[1] + arg3[0] * (float) local5 + arg3[2] * (float) local9;
		@Pc(63) float local63 = arg3[5] * (float) local9 + (float) local13 * arg3[4] + (float) local5 * arg3[3];
		@Pc(84) float local84 = arg3[6] * (float) local5 + (float) local13 * arg3[7] + arg3[8] * (float) local9;
		@Pc(95) float local95 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		if (arg1 != 1.0F) {
			local95 *= arg1;
		}
		@Pc(109) float local109 = arg2 + local63 + 0.5F;
		@Pc(114) float local114;
		if (arg9 == 1) {
			local114 = local95;
			local95 = -local109;
			local109 = local114;
		} else if (arg9 == 2) {
			local95 = -local95;
			local109 = -local109;
		} else if (arg9 == 3) {
			local114 = local95;
			local95 = local109;
			local109 = -local114;
		}
		arg10[1] = local109;
		arg10[0] = local95;
	}
}
