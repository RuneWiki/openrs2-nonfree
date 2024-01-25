import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "Lclient!ig;")
	public static Class118 aClass118_4;

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "Lclient!nn;")
	public static final Class100 aClass100_1 = Static110.method1736();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII[FFIF)V")
	public static void method2350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[] arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(5) int local5 = arg5 - arg4;
		@Pc(9) int local9 = arg2 - arg0;
		@Pc(13) int local13 = arg8 - arg3;
		@Pc(38) float local38 = arg6[2] * (float) local9 + (float) local13 * arg6[0] + (float) local5 * arg6[1];
		@Pc(59) float local59 = arg6[5] * (float) local9 + (float) local5 * arg6[4] + arg6[3] * (float) local13;
		@Pc(80) float local80 = arg6[8] * (float) local9 + (float) local13 * arg6[6] + arg6[7] * (float) local5;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg9 != 1.0F) {
			local91 *= arg9;
		}
		@Pc(105) float local105 = arg7 + local59 + 0.5F;
		@Pc(126) float local126;
		if (arg1 == 1) {
			local126 = local91;
			local91 = -local105;
			local105 = local126;
		} else if (arg1 == 2) {
			local105 = -local105;
			local91 = -local91;
		} else if (arg1 == 3) {
			local126 = local91;
			local91 = local105;
			local105 = -local126;
		}
		Static329.aFloat107 = local105;
		Static147.aFloat58 = local91;
	}
}
