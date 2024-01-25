import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "[F")
	public static final float[] aFloatArray74 = new float[4];

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "[I")
	public static final int[] anIntArray552 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "Lclient!dh;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "([FFIIIIIII[FI)V")
	public static void method8387(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) float[] arg8, @OriginalArg(10) int arg9) {
		@Pc(9) int local9 = arg6 - arg2;
		@Pc(13) int local13 = arg3 - arg4;
		@Pc(17) int local17 = arg7 - arg9;
		@Pc(38) float local38 = arg8[2] * (float) local9 + arg8[0] * (float) local17 + (float) local13 * arg8[1];
		@Pc(59) float local59 = (float) local9 * arg8[5] + (float) local17 * arg8[3] + arg8[4] * (float) local13;
		@Pc(80) float local80 = arg8[8] * (float) local9 + (float) local17 * arg8[6] + arg8[7] * (float) local13;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local38 * local38 + local59 * local59 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg1 + 0.5F;
		@Pc(128) float local128;
		if (arg5 == 1) {
			local128 = local106;
			local106 = -local119;
			local119 = local128;
		} else if (arg5 == 2) {
			local106 = -local106;
			local119 = -local119;
		} else if (arg5 == 3) {
			local128 = local106;
			local106 = local119;
			local119 = -local128;
		}
		arg0[1] = local119;
		arg0[0] = local106;
	}
}
