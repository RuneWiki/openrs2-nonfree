import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "Lclient!ng;")
	public static final Class225 aClass225_3 = new Class225();

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "[Lclient!tea;")
	public static final Interface21[] anInterface21Array1 = new Interface21[75];

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
	public static int anInt3996 = 0;

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "[I")
	public static final int[] anIntArray225 = new int[8];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IBIFIIII[FIF)V")
	public static void method3396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg8 - arg3;
		@Pc(9) int local9 = arg5 - arg4;
		@Pc(13) int local13 = arg0 - arg6;
		@Pc(38) float local38 = (float) local13 * arg7[2] + arg7[0] * (float) local5 + arg7[1] * (float) local9;
		@Pc(59) float local59 = (float) local13 * arg7[5] + arg7[3] * (float) local5 + (float) local9 * arg7[4];
		@Pc(80) float local80 = (float) local13 * arg7[8] + (float) local9 * arg7[7] + (float) local5 * arg7[6];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg2 != 1.0F) {
			local91 *= arg2;
		}
		@Pc(105) float local105 = arg9 + local59 + 0.5F;
		@Pc(124) float local124;
		if (arg1 == 1) {
			local124 = local91;
			local91 = -local105;
			local105 = local124;
		} else if (arg1 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg1 == 3) {
			local124 = local91;
			local91 = local105;
			local105 = -local124;
		}
		Static366.aFloat160 = local105;
		Static279.aFloat116 = local91;
	}
}
