import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
	public static int anInt1132 = 0;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
	public static void method1032() {
		Static197.anImage11 = null;
		Static322.aFont6 = null;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(FI[FIIIIFIII)V")
	public static void method1033(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(5) int local5 = arg8 - arg3;
		@Pc(9) int local9 = arg9 - arg6;
		@Pc(13) int local13 = arg4 - arg5;
		@Pc(38) float local38 = arg2[2] * (float) local5 + (float) local13 * arg2[1] + arg2[0] * (float) local9;
		@Pc(59) float local59 = arg2[5] * (float) local5 + arg2[3] * (float) local9 + arg2[4] * (float) local13;
		@Pc(80) float local80 = arg2[6] * (float) local9 + arg2[7] * (float) local13 + (float) local5 * arg2[8];
		@Pc(91) float local91 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		if (arg0 != 1.0F) {
			local91 *= arg0;
		}
		@Pc(105) float local105 = arg7 + local59 + 0.5F;
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
		Static336.aFloat152 = local105;
		Static289.aFloat119 = local91;
	}
}
