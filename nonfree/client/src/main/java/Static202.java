import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!iaa", name = "f", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "Lclient!u;")
	public static Class6_Sub48 aClass6_Sub48_2;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IF[FIFIFIIIIII)V")
	public static void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(9) int local9 = arg8 - arg11;
		@Pc(13) int local13 = arg7 - arg3;
		@Pc(17) int local17 = arg10 - arg0;
		@Pc(38) float local38 = arg2[2] * (float) local17 + arg2[1] * (float) local13 + arg2[0] * (float) local9;
		@Pc(59) float local59 = arg2[5] * (float) local17 + (float) local13 * arg2[4] + arg2[3] * (float) local9;
		@Pc(88) float local88 = arg2[7] * (float) local13 + arg2[6] * (float) local9 + (float) local17 * arg2[8];
		@Pc(115) float local115;
		@Pc(108) float local108;
		if (arg5 == 0) {
			local115 = local38 + arg4 + 0.5F;
			local108 = arg6 + 0.5F - local88;
		} else if (arg5 == 1) {
			local115 = arg4 + local38 + 0.5F;
			local108 = arg6 + local88 + 0.5F;
		} else if (arg5 == 2) {
			local108 = arg1 + 0.5F - local59;
			local115 = arg4 + 0.5F - local38;
		} else if (arg5 == 3) {
			local108 = arg1 + 0.5F - local59;
			local115 = local38 + arg4 + 0.5F;
		} else if (arg5 == 4) {
			local108 = arg1 + 0.5F - local59;
			local115 = arg6 + local88 + 0.5F;
		} else {
			local115 = arg6 + 0.5F - local88;
			local108 = arg1 + 0.5F - local59;
		}
		@Pc(221) float local221;
		if (arg9 == 1) {
			local221 = local115;
			local115 = -local108;
			local108 = local221;
		} else if (arg9 == 2) {
			local115 = -local115;
			local108 = -local108;
		} else if (arg9 == 3) {
			local221 = local115;
			local115 = local108;
			local108 = -local221;
		}
		Static130.aFloat21 = local115;
		Static323.aFloat132 = local108;
	}
}
