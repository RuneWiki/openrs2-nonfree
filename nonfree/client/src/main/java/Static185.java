import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gk", name = "s", descriptor = "Z")
	public static boolean aBoolean342;

	@OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
	public static int anInt5215;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[FIIIIFFII[FI)V")
	public static void method4675(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13 = arg8 - arg4;
		@Pc(17) int local17 = arg0 - arg10;
		@Pc(21) int local21 = arg7 - arg2;
		@Pc(42) float local42 = arg9[2] * (float) local21 + arg9[1] * (float) local17 + arg9[0] * (float) local13;
		@Pc(63) float local63 = (float) local13 * arg9[3] + (float) local17 * arg9[4] + (float) local21 * arg9[5];
		@Pc(84) float local84 = (float) local13 * arg9[6] + (float) local17 * arg9[7] + arg9[8] * (float) local21;
		@Pc(95) float local95 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		if (arg6 != 1.0F) {
			local95 *= arg6;
		}
		@Pc(109) float local109 = local63 + arg5 + 0.5F;
		@Pc(130) float local130;
		if (arg3 == 1) {
			local130 = local95;
			local95 = -local109;
			local109 = local130;
		} else if (arg3 == 2) {
			local95 = -local95;
			local109 = -local109;
		} else if (arg3 == 3) {
			local130 = local95;
			local95 = local109;
			local109 = -local130;
		}
		arg1[0] = local95;
		arg1[1] = local109;
	}
}
