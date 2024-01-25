import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "([FIIIIF[FIBII)V")
	public static void method6860(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg8 - arg7;
		@Pc(13) int local13 = arg4 - arg1;
		@Pc(21) int local21 = arg3 - arg2;
		@Pc(42) float local42 = (float) local21 * arg6[2] + arg6[0] * (float) local5 + (float) local13 * arg6[1];
		@Pc(63) float local63 = arg6[4] * (float) local13 + (float) local5 * arg6[3] + (float) local21 * arg6[5];
		@Pc(84) float local84 = (float) local21 * arg6[8] + (float) local13 * arg6[7] + (float) local5 * arg6[6];
		@Pc(99) float local99 = (float) Math.sqrt((double) (local84 * local84 + local63 * local63 + local42 * local42));
		@Pc(110) float local110 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		@Pc(123) float local123 = arg5 + (float) Math.asin((double) (local63 / local99)) / 3.1415927F + 0.5F;
		@Pc(128) float local128;
		if (arg9 == 1) {
			local128 = local110;
			local110 = -local123;
			local123 = local128;
		} else if (arg9 == 2) {
			local123 = -local123;
			local110 = -local110;
		} else if (arg9 == 3) {
			local128 = local110;
			local110 = local123;
			local123 = -local128;
		}
		arg0[0] = local110;
		arg0[1] = local123;
	}
}
