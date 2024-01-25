import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
	public static int anInt3146 = 0;

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
	public static int anInt3149 = -1;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(ILclient!es;)Lclient!tda;")
	public static Class346 method2919(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(12) int local12 = arg0.method8859();
		return new Class346(local12);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IFI[FI[FIFIIFIII)V")
	public static void method2920(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(9) int local9 = arg11 - arg5;
		@Pc(13) int local13 = arg1 - arg10;
		@Pc(17) int local17 = arg12 - arg7;
		@Pc(38) float local38 = (float) local9 * arg2[1] + arg2[0] * (float) local13 + (float) local17 * arg2[2];
		@Pc(59) float local59 = (float) local17 * arg2[5] + arg2[3] * (float) local13 + arg2[4] * (float) local9;
		@Pc(80) float local80 = (float) local17 * arg2[8] + (float) local9 * arg2[7] + (float) local13 * arg2[6];
		@Pc(107) float local107;
		@Pc(101) float local101;
		if (arg8 == 0) {
			local101 = arg6 + 0.5F - local80;
			local107 = local38 + arg9 + 0.5F;
		} else if (arg8 == 1) {
			local101 = local80 + arg6 + 0.5F;
			local107 = local38 + arg9 + 0.5F;
		} else if (arg8 == 2) {
			local107 = arg9 + 0.5F - local38;
			local101 = arg0 + 0.5F - local59;
		} else if (arg8 == 3) {
			local101 = arg0 + 0.5F - local59;
			local107 = arg9 + local38 + 0.5F;
		} else if (arg8 == 4) {
			local101 = arg0 + 0.5F - local59;
			local107 = local80 + arg6 + 0.5F;
		} else {
			local107 = arg6 + 0.5F - local80;
			local101 = arg0 + 0.5F - local59;
		}
		@Pc(190) float local190;
		if (arg3 == 1) {
			local190 = local107;
			local107 = -local101;
			local101 = local190;
		} else if (arg3 == 2) {
			local107 = -local107;
			local101 = -local101;
		} else if (arg3 == 3) {
			local190 = local107;
			local107 = local101;
			local101 = -local190;
		}
		arg4[1] = local101;
		arg4[0] = local107;
	}
}
