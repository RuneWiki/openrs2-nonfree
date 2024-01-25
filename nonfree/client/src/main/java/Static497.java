import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!su", name = "g", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!su", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[8];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIFIII[FI)V")
	public static void method6441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float[] arg8) {
		@Pc(5) int local5 = arg3 - arg2;
		@Pc(9) int local9 = arg5 - arg1;
		@Pc(13) int local13 = arg6 - arg0;
		@Pc(38) float local38 = (float) local13 * arg8[0] + (float) local9 * arg8[1] + arg8[2] * (float) local5;
		@Pc(59) float local59 = arg8[5] * (float) local5 + arg8[4] * (float) local9 + arg8[3] * (float) local13;
		@Pc(80) float local80 = (float) local5 * arg8[8] + arg8[7] * (float) local9 + arg8[6] * (float) local13;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local59 * local59 + local38 * local38));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg4 + 0.5F;
		@Pc(126) float local126;
		if (arg7 == 1) {
			local126 = local106;
			local106 = -local119;
			local119 = local126;
		} else if (arg7 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg7 == 3) {
			local126 = local106;
			local106 = local119;
			local119 = -local126;
		}
		Static78.aFloat32 = local106;
		Static584.aFloat242 = local119;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V")
	public static void method6444() {
		Static61.aClass90_3.method1678();
	}
}
