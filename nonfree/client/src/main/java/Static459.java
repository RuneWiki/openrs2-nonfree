import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[S")
	public static short[] aShortArray113 = new short[256];

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
	public static final int[] anIntArray494 = new int[1000];

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "J")
	public static long aLong201 = 0L;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(FFBIFIII)[F")
	public static float[] method5948(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[2] = local25;
		local6[4] = 1.0F;
		local6[8] = local17;
		local6[7] = 0.0F;
		local6[6] = -local25;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg2 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(94) float local94 = 1.0F - local77;
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4));
		if (local105 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local79 = (float) arg4 / local105;
				local72 = (float) -arg5 / local105;
			}
			local70[2] = local94 * local72 * local79;
			local70[7] = local90 * -local72;
			local70[4] = local77;
			local70[1] = local90 * local79;
			local70[5] = local90 * local72;
			local70[3] = local90 * -local79;
			local70[6] = local72 * local79 * local94;
			local70[0] = local72 * local72 * local94 + local77;
			local70[8] = local77 + local94 * local79 * local79;
			local9[0] = local6[0] * local70[0] + local70[3] * local6[1] + local70[6] * local6[2];
			local9[1] = local70[7] * local6[2] + local70[1] * local6[0] + local6[1] * local70[4];
			local9[3] = local6[4] * local70[3] + local6[3] * local70[0] + local70[6] * local6[5];
			local9[2] = local6[1] * local70[5] + local6[0] * local70[2] + local70[8] * local6[2];
			local9[4] = local6[5] * local70[7] + local6[3] * local70[1] + local70[4] * local6[4];
			local9[6] = local6[6] * local70[0] + local6[7] * local70[3] + local70[6] * local6[8];
			local9[5] = local6[4] * local70[5] + local70[2] * local6[3] + local6[5] * local70[8];
			local9[7] = local70[7] * local6[8] + local6[7] * local70[4] + local6[6] * local70[1];
			local9[8] = local70[5] * local6[7] + local6[6] * local70[2] + local6[8] * local70[8];
		}
		local9[7] *= arg0;
		local9[4] *= arg3;
		local9[2] *= arg1;
		local9[3] *= arg3;
		local9[6] *= arg0;
		local9[5] *= arg3;
		local9[8] *= arg0;
		local9[0] *= arg1;
		local9[1] *= arg1;
		return local9;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([FIIIFFIIIIB)V")
	public static void method5949(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(9) int local9 = arg9 - arg8;
		@Pc(13) int local13 = arg2 - arg6;
		@Pc(17) int local17 = arg1 - arg3;
		@Pc(46) float local46 = arg0[1] * (float) local9 + (float) local17 * arg0[0] + arg0[2] * (float) local13;
		@Pc(67) float local67 = (float) local9 * arg0[4] + (float) local17 * arg0[3] + arg0[5] * (float) local13;
		@Pc(88) float local88 = arg0[8] * (float) local13 + arg0[6] * (float) local17 + arg0[7] * (float) local9;
		@Pc(99) float local99 = (float) Math.atan2((double) local46, (double) local88) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local99 *= arg5;
		}
		@Pc(113) float local113 = local67 + arg4 + 0.5F;
		@Pc(126) float local126;
		if (arg7 == 1) {
			local126 = local99;
			local99 = -local113;
			local113 = local126;
		} else if (arg7 == 2) {
			local99 = -local99;
			local113 = -local113;
		} else if (arg7 == 3) {
			local126 = local99;
			local99 = local113;
			local113 = -local126;
		}
		Static21.aFloat9 = local99;
		Static538.aFloat233 = local113;
	}
}
