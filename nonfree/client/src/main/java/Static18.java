import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "Lclient!vj;")
	public static final Class333 aClass333_1 = new Class333(1);

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZ)V")
	public static void method846(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) Class6_Sub15 local13 = Static519.method7596(arg0, arg1);
		if (local13 != null) {
			local13.method8151();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIFFZIFII[FII)V")
	public static void method847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg5 - arg11;
		@Pc(13) int local13 = arg7 - arg8;
		@Pc(21) int local21 = arg10 - arg1;
		@Pc(42) float local42 = arg9[0] * (float) local21 + (float) local5 * arg9[1] + (float) local13 * arg9[2];
		@Pc(63) float local63 = arg9[5] * (float) local13 + arg9[4] * (float) local5 + (float) local21 * arg9[3];
		@Pc(84) float local84 = arg9[7] * (float) local5 + arg9[6] * (float) local21 + arg9[8] * (float) local13;
		@Pc(101) float local101;
		@Pc(95) float local95;
		if (arg0 == 0) {
			local101 = arg6 + local42 + 0.5F;
			local95 = arg3 + 0.5F - local84;
		} else if (arg0 == 1) {
			local95 = local84 + arg3 + 0.5F;
			local101 = arg6 + local42 + 0.5F;
		} else if (arg0 == 2) {
			local95 = arg4 + 0.5F - local63;
			local101 = arg6 + 0.5F - local42;
		} else if (arg0 == 3) {
			local101 = arg6 + local42 + 0.5F;
			local95 = arg4 + 0.5F - local63;
		} else if (arg0 == 4) {
			local101 = arg3 + local84 + 0.5F;
			local95 = arg4 + 0.5F - local63;
		} else {
			local95 = arg4 + 0.5F - local63;
			local101 = arg3 + 0.5F - local84;
		}
		@Pc(206) float local206;
		if (arg2 == 1) {
			local206 = local101;
			local101 = -local95;
			local95 = local206;
		} else if (arg2 == 2) {
			local101 = -local101;
			local95 = -local95;
		} else if (arg2 == 3) {
			local206 = local101;
			local101 = local95;
			local95 = -local206;
		}
		Static116.aFloat48 = local95;
		Static432.aFloat177 = local101;
	}
}
