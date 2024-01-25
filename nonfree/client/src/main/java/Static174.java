import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "Z")
	public static boolean aBoolean300 = false;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "([FIIIIFIIII)V")
	public static void method2990(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = arg3 - arg1;
		@Pc(13) int local13 = arg2 - arg6;
		@Pc(21) int local21 = arg7 - arg8;
		@Pc(42) float local42 = arg0[2] * (float) local13 + arg0[1] * (float) local21 + (float) local9 * arg0[0];
		@Pc(63) float local63 = arg0[3] * (float) local9 + (float) local21 * arg0[4] + (float) local13 * arg0[5];
		@Pc(84) float local84 = (float) local13 * arg0[8] + (float) local9 * arg0[6] + (float) local21 * arg0[7];
		@Pc(99) float local99 = (float) Math.sqrt((double) (local84 * local84 + local63 * local63 + local42 * local42));
		@Pc(110) float local110 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg5 + (float) Math.asin((double) (local63 / local99)) / 3.1415927F + 0.5F;
		@Pc(128) float local128;
		if (arg4 == 1) {
			local128 = local110;
			local110 = -local123;
			local123 = local128;
		} else if (arg4 == 2) {
			local110 = -local110;
			local123 = -local123;
		} else if (arg4 == 3) {
			local128 = local110;
			local110 = local123;
			local123 = -local128;
		}
		Static592.aFloat134 = local110;
		Static134.aFloat94 = local123;
	}
}
