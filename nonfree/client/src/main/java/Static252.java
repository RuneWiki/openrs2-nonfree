import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!ii", name = "l", descriptor = "Lclient!l;")
	public static Class217 aClass217_2;

	@OriginalMember(owner = "client!ii", name = "n", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!ii", name = "C", descriptor = "Lclient!bba;")
	public static final Class30 aClass30_1 = new Class30(128);

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "([FFIIIIIII[FI)V")
	public static void method4004(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float[] arg9) {
		@Pc(5) int local5 = arg6 - arg8;
		@Pc(13) int local13 = arg7 - arg2;
		@Pc(17) int local17 = arg3 - arg4;
		@Pc(38) float local38 = arg0[2] * (float) local13 + arg0[0] * (float) local17 + arg0[1] * (float) local5;
		@Pc(59) float local59 = (float) local17 * arg0[3] + (float) local5 * arg0[4] + (float) local13 * arg0[5];
		@Pc(80) float local80 = arg0[6] * (float) local17 + (float) local5 * arg0[7] + arg0[8] * (float) local13;
		@Pc(100) float local100 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = (float) Math.asin((double) (local59 / local100)) / 3.1415927F + arg1 + 0.5F;
		@Pc(129) float local129;
		if (arg5 == 1) {
			local129 = local111;
			local111 = -local124;
			local124 = local129;
		} else if (arg5 == 2) {
			local124 = -local124;
			local111 = -local111;
		} else if (arg5 == 3) {
			local129 = local111;
			local111 = local124;
			local124 = -local129;
		}
		arg9[1] = local124;
		arg9[0] = local111;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)I")
	public static int method4005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) int local21 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | arg2 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		@Pc(25) int local25 = 255 - arg2;
		return local21 + (((arg1 & 0xFF00) * local25 & 0xFF0000 | local25 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}
}
