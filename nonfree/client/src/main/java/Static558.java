import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static558 {

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_133 = new Class71(23, 4);

	@OriginalMember(owner = "client!tw", name = "n", descriptor = "Lclient!uw;")
	public static final Class348 aClass348_3 = new Class348("WIP", 2);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(III)V")
	public static void method7817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class8_Sub5_Sub8 local8 = Static509.method7344(17, arg0);
		local8.method3509();
		local8.anInt4321 = arg1;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IBII[FI[FFIII)V")
	public static void method7824(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg9 - arg7;
		@Pc(20) int local20 = arg4 - arg2;
		@Pc(24) int local24 = arg0 - arg8;
		@Pc(45) float local45 = (float) local5 * arg3[2] + (float) local20 * arg3[1] + (float) local24 * arg3[0];
		@Pc(66) float local66 = arg3[4] * (float) local20 + (float) local24 * arg3[3] + (float) local5 * arg3[5];
		@Pc(87) float local87 = arg3[8] * (float) local5 + arg3[7] * (float) local20 + arg3[6] * (float) local24;
		@Pc(102) float local102 = (float) Math.sqrt((double) (local87 * local87 + local45 * local45 + local66 * local66));
		@Pc(113) float local113 = (float) Math.atan2((double) local45, (double) local87) / 6.2831855F + 0.5F;
		@Pc(126) float local126 = arg6 + (float) Math.asin((double) (local66 / local102)) / 3.1415927F + 0.5F;
		@Pc(149) float local149;
		if (arg1 == 1) {
			local149 = local113;
			local113 = -local126;
			local126 = local149;
		} else if (arg1 == 2) {
			local113 = -local113;
			local126 = -local126;
		} else if (arg1 == 3) {
			local149 = local113;
			local113 = local126;
			local126 = -local149;
		}
		arg5[0] = local113;
		arg5[1] = local126;
	}
}
