import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
	public static int anInt5744 = 0;

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "Lclient!ow;")
	public static final Class270 aClass270_2 = new Class270(false);

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "Lclient!ow;")
	public static Class270 aClass270_3 = aClass270_2;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I[F[FIFIIIFIZI)V")
	public static void method4760(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		@Pc(9) int local9 = arg10 - arg6;
		@Pc(13) int local13 = arg3 - arg9;
		@Pc(17) int local17 = arg7 - arg5;
		@Pc(38) float local38 = (float) local17 * arg1[0] + (float) local9 * arg1[1] + (float) local13 * arg1[2];
		@Pc(59) float local59 = arg1[5] * (float) local13 + arg1[4] * (float) local9 + arg1[3] * (float) local17;
		@Pc(80) float local80 = (float) local13 * arg1[8] + arg1[7] * (float) local9 + arg1[6] * (float) local17;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local91 *= arg4;
		}
		@Pc(105) float local105 = arg8 + local59 + 0.5F;
		@Pc(112) float local112;
		if (arg0 == 1) {
			local112 = local91;
			local91 = -local105;
			local105 = local112;
		} else if (arg0 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg0 == 3) {
			local112 = local91;
			local91 = local105;
			local105 = -local112;
		}
		arg2[1] = local105;
		arg2[0] = local91;
	}
}
