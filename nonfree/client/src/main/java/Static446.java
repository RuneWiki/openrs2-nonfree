import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
	public static int anInt8260;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[5];

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIFI[FIIIII[F)V")
	public static void method7026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) float[] arg9) {
		@Pc(5) int local5 = arg5 - arg0;
		@Pc(13) int local13 = arg3 - arg6;
		@Pc(17) int local17 = arg7 - arg8;
		@Pc(38) float local38 = (float) local5 * arg9[2] + arg9[1] * (float) local17 + arg9[0] * (float) local13;
		@Pc(59) float local59 = (float) local5 * arg9[5] + (float) local13 * arg9[3] + (float) local17 * arg9[4];
		@Pc(80) float local80 = arg9[6] * (float) local13 + (float) local17 * arg9[7] + (float) local5 * arg9[8];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg2 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(139) float local139;
		if (arg1 == 1) {
			local139 = local106;
			local106 = -local124;
			local124 = local139;
		} else if (arg1 == 2) {
			local124 = -local124;
			local106 = -local106;
		} else if (arg1 == 3) {
			local139 = local106;
			local106 = local124;
			local124 = -local139;
		}
		arg4[0] = local106;
		arg4[1] = local124;
	}
}
