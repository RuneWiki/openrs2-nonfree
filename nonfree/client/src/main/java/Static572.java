import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "[I")
	public static int[] anIntArray676;

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "I")
	public static int anInt9309;

	@OriginalMember(owner = "client!vu", name = "j", descriptor = "I")
	public static int anInt9312;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	public static int anInt9306 = 0;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIIFIFII[FII)V")
	public static void method7724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9) {
		@Pc(5) int local5 = arg6 - arg2;
		@Pc(9) int local9 = arg0 - arg9;
		@Pc(17) int local17 = arg4 - arg7;
		@Pc(38) float local38 = arg8[2] * (float) local17 + (float) local9 * arg8[1] + (float) local5 * arg8[0];
		@Pc(59) float local59 = (float) local5 * arg8[3] + (float) local9 * arg8[4] + arg8[5] * (float) local17;
		@Pc(80) float local80 = (float) local9 * arg8[7] + (float) local5 * arg8[6] + arg8[8] * (float) local17;
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local91 *= arg5;
		}
		@Pc(105) float local105 = local59 + arg3 + 0.5F;
		@Pc(128) float local128;
		if (arg1 == 1) {
			local128 = local91;
			local91 = -local105;
			local105 = local128;
		} else if (arg1 == 2) {
			local91 = -local91;
			local105 = -local105;
		} else if (arg1 == 3) {
			local128 = local91;
			local91 = local105;
			local105 = -local128;
		}
		Static148.aFloat101 = local105;
		Static318.aFloat169 = local91;
	}
}
