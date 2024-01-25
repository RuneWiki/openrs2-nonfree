import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!ti", name = "v", descriptor = "Lclient!gq;")
	public static Class93 aClass93_2;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_80 = new Class179(69, 0);

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "[I")
	public static final int[] anIntArray569 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIZIII[FFI)V")
	public static void method5209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg3 - arg1;
		@Pc(13) int local13 = arg5 - arg2;
		@Pc(17) int local17 = arg0 - arg8;
		@Pc(38) float local38 = (float) local13 * arg6[1] + arg6[0] * (float) local5 + (float) local17 * arg6[2];
		@Pc(59) float local59 = arg6[3] * (float) local5 + (float) local13 * arg6[4] + arg6[5] * (float) local17;
		@Pc(80) float local80 = arg6[8] * (float) local17 + (float) local5 * arg6[6] + arg6[7] * (float) local13;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(111) float local111 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg7 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(137) float local137;
		if (arg4 == 1) {
			local137 = local111;
			local111 = -local124;
			local124 = local137;
		} else if (arg4 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg4 == 3) {
			local137 = local111;
			local111 = local124;
			local124 = -local137;
		}
		Static227.aFloat62 = local111;
		Static269.aFloat68 = local124;
	}
}
