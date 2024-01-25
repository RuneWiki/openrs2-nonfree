import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!ol", name = "K", descriptor = "[I")
	public static final int[] anIntArray344 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ol", name = "M", descriptor = "I")
	public static int anInt5151 = -1;

	@OriginalMember(owner = "client!ol", name = "Q", descriptor = "I")
	public static int anInt5155 = -1;

	@OriginalMember(owner = "client!ol", name = "T", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII[FFFIIII)V")
	public static void method4164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg8 - arg0;
		@Pc(13) int local13 = arg2 - arg7;
		@Pc(17) int local17 = arg1 - arg3;
		@Pc(42) float local42 = (float) local13 * arg4[1] + (float) local17 * arg4[0] + (float) local5 * arg4[2];
		@Pc(63) float local63 = (float) local13 * arg4[4] + arg4[3] * (float) local17 + arg4[5] * (float) local5;
		@Pc(84) float local84 = arg4[8] * (float) local5 + (float) local13 * arg4[7] + (float) local17 * arg4[6];
		@Pc(95) float local95 = (float) Math.atan2((double) local42, (double) local84) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local95 *= arg5;
		}
		@Pc(109) float local109 = arg6 + local63 + 0.5F;
		@Pc(130) float local130;
		if (arg9 == 1) {
			local130 = local95;
			local95 = -local109;
			local109 = local130;
		} else if (arg9 == 2) {
			local109 = -local109;
			local95 = -local95;
		} else if (arg9 == 3) {
			local130 = local95;
			local95 = local109;
			local109 = -local130;
		}
		Static447.aFloat151 = local95;
		Static412.aFloat213 = local109;
	}
}
