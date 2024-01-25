import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
	public static final int[] anIntArray608 = new int[13];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIIIFIIF[FFII)V")
	public static void method6127(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg0 - arg6;
		@Pc(17) int local17 = arg2 - arg5;
		@Pc(21) int local21 = arg1 - arg10;
		@Pc(42) float local42 = arg8[2] * (float) local5 + arg8[1] * (float) local17 + (float) local21 * arg8[0];
		@Pc(63) float local63 = arg8[4] * (float) local17 + arg8[3] * (float) local21 + arg8[5] * (float) local5;
		@Pc(84) float local84 = (float) local5 * arg8[8] + (float) local21 * arg8[6] + (float) local17 * arg8[7];
		@Pc(95) float local95;
		@Pc(102) float local102;
		if (arg11 == 0) {
			local95 = arg7 + local42 + 0.5F;
			local102 = arg9 + 0.5F - local84;
		} else if (arg11 == 1) {
			local95 = local42 + arg7 + 0.5F;
			local102 = arg9 + local84 + 0.5F;
		} else if (arg11 == 2) {
			local102 = arg4 + 0.5F - local63;
			local95 = arg7 + 0.5F - local42;
		} else if (arg11 == 3) {
			local102 = arg4 + 0.5F - local63;
			local95 = arg7 + local42 + 0.5F;
		} else if (arg11 == 4) {
			local102 = arg4 + 0.5F - local63;
			local95 = local84 + arg9 + 0.5F;
		} else {
			local95 = arg9 + 0.5F - local84;
			local102 = arg4 + 0.5F - local63;
		}
		@Pc(207) float local207;
		if (arg3 == 1) {
			local207 = local95;
			local95 = -local102;
			local102 = local207;
		} else if (arg3 == 2) {
			local102 = -local102;
			local95 = -local95;
		} else if (arg3 == 3) {
			local207 = local95;
			local95 = local102;
			local102 = -local207;
		}
		Static572.aFloat202 = local102;
		Static571.aFloat198 = local95;
	}
}
