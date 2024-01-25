import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!km", name = "q", descriptor = "I")
	public static int anInt5058 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I[FBFIIIIII)V")
	public static void method4212(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg6 - arg4;
		@Pc(9) int local9 = arg7 - arg3;
		@Pc(17) int local17 = arg5 - arg8;
		@Pc(38) float local38 = arg1[1] * (float) local9 + arg1[0] * (float) local5 + (float) local17 * arg1[2];
		@Pc(64) float local64 = arg1[4] * (float) local9 + arg1[3] * (float) local5 + arg1[5] * (float) local17;
		@Pc(85) float local85 = (float) local9 * arg1[7] + arg1[6] * (float) local5 + arg1[8] * (float) local17;
		@Pc(100) float local100 = (float) Math.sqrt((double) (local38 * local38 + local64 * local64 + local85 * local85));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local64 / local100)) / 3.1415927F + arg2 + 0.5F;
		@Pc(147) float local147;
		if (arg0 == 1) {
			local147 = local111;
			local111 = -local124;
			local124 = local147;
		} else if (arg0 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg0 == 3) {
			local147 = local111;
			local111 = local124;
			local124 = -local147;
		}
		Static307.aFloat150 = local111;
		Static181.aFloat122 = local124;
	}
}
