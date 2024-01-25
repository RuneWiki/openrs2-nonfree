import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "[Lclient!so;")
	public static final Class334[] aClass334Array1 = new Class334[4];

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "[I")
	public static final int[] anIntArray421 = new int[14];

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(III[F[FFIIIII)V")
	public static void method4832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float[] arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(5) int local5 = arg8 - arg7;
		@Pc(9) int local9 = arg9 - arg2;
		@Pc(13) int local13 = arg0 - arg6;
		@Pc(38) float local38 = arg3[2] * (float) local5 + (float) local13 * arg3[1] + arg3[0] * (float) local9;
		@Pc(59) float local59 = (float) local9 * arg3[3] + (float) local13 * arg3[4] + (float) local5 * arg3[5];
		@Pc(80) float local80 = arg3[7] * (float) local13 + (float) local9 * arg3[6] + (float) local5 * arg3[8];
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local38 * local38 + local59 * local59));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = arg5 + (float) Math.asin((double) (local59 / local95)) / 3.1415927F + 0.5F;
		@Pc(124) float local124;
		if (arg1 == 1) {
			local124 = local106;
			local106 = -local119;
			local119 = local124;
		} else if (arg1 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg1 == 3) {
			local124 = local106;
			local106 = local119;
			local119 = -local124;
		}
		arg4[1] = local119;
		arg4[0] = local106;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)I")
	public static int method4833() {
		return Static368.anIntArray419 == null ? 0 : Static368.anIntArray419.length * 2;
	}
}
