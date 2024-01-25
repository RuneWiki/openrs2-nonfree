import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIIFFII[FZ[FI)V")
	public static void method8113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float[] arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10) {
		@Pc(3) int local3 = arg1 - arg0;
		@Pc(12) int local12 = arg10 - arg3;
		@Pc(20) int local20 = arg6 - arg2;
		@Pc(41) float local41 = (float) local12 * arg8[2] + (float) local3 * arg8[1] + arg8[0] * (float) local20;
		@Pc(62) float local62 = (float) local20 * arg8[3] + (float) local3 * arg8[4] + (float) local12 * arg8[5];
		@Pc(83) float local83 = arg8[8] * (float) local12 + arg8[6] * (float) local20 + (float) local3 * arg8[7];
		@Pc(94) float local94 = (float) Math.atan2((double) local41, (double) local83) / 6.2831855F + 0.5F;
		if (arg4 != 1.0F) {
			local94 *= arg4;
		}
		@Pc(108) float local108 = local62 + arg5 + 0.5F;
		@Pc(113) float local113;
		if (arg7 == 1) {
			local113 = local94;
			local94 = -local108;
			local108 = local113;
		} else if (arg7 == 2) {
			local94 = -local94;
			local108 = -local108;
		} else if (arg7 == 3) {
			local113 = local94;
			local94 = local108;
			local108 = -local113;
		}
		arg9[1] = local108;
		arg9[0] = local94;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IILclient!rg;Z)Lclient!tja;")
	public static Class350 method8114(@OriginalArg(0) int arg0, @OriginalArg(2) Class310 arg1) {
		@Pc(9) byte[] local9 = arg1.method7803(0, arg0);
		return local9 == null ? null : new Class350(local9);
	}
}
