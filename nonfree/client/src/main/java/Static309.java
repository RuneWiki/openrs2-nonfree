import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!jla", name = "a", descriptor = "(F[F[FIIZIIFIII)V")
	public static void method4678(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(5) int local5 = arg9 - arg6;
		@Pc(9) int local9 = arg4 - arg3;
		@Pc(17) int local17 = arg8 - arg5;
		@Pc(43) float local43 = arg2[2] * (float) local5 + (float) local9 * arg2[1] + (float) local17 * arg2[0];
		@Pc(64) float local64 = (float) local5 * arg2[5] + (float) local9 * arg2[4] + arg2[3] * (float) local17;
		@Pc(85) float local85 = arg2[6] * (float) local17 + (float) local9 * arg2[7] + (float) local5 * arg2[8];
		@Pc(96) float local96 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local96 *= arg7;
		}
		@Pc(110) float local110 = local64 + arg0 + 0.5F;
		@Pc(115) float local115;
		if (arg10 == 1) {
			local115 = local96;
			local96 = -local110;
			local110 = local115;
		} else if (arg10 == 2) {
			local96 = -local96;
			local110 = -local110;
		} else if (arg10 == 3) {
			local115 = local96;
			local96 = local110;
			local110 = -local115;
		}
		arg1[0] = local96;
		arg1[1] = local110;
	}

	@OriginalMember(owner = "client!jla", name = "a", descriptor = "(B[B)[B")
	public static byte[] method4679(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = new byte[arg0.length];
			Static735.method9185(arg0, 0, local22, 0, arg0.length);
			return local22;
		}
	}

	@OriginalMember(owner = "client!jla", name = "a", descriptor = "(BII)Z")
	public static boolean method4680(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}
}
