import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "[I")
	public static int[] anIntArray578 = new int[1];

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIFIFF)[F")
	public static float[] method7341(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(30) float local30 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(38) float local38 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[8] = local30;
		local6[1] = 0.0F;
		local6[2] = local38;
		local6[7] = 0.0F;
		local6[0] = local30;
		local6[6] = -local38;
		local6[3] = 0.0F;
		local6[5] = 0.0F;
		local6[4] = 1.0F;
		@Pc(82) float[] local82 = new float[9];
		@Pc(84) float local84 = 1.0F;
		@Pc(86) float local86 = 0.0F;
		@Pc(91) float local91 = (float) arg1 / 32767.0F;
		@Pc(102) float local102 = -((float) Math.sqrt((double) (1.0F - local91 * local91)));
		@Pc(107) float local107 = 1.0F - local91;
		@Pc(118) float local118 = (float) Math.sqrt((double) (arg0 * arg0 + arg4 * arg4));
		if (local118 == 0.0F && local91 == 0.0F) {
			local9 = local6;
		} else {
			if (local118 != 0.0F) {
				local86 = (float) arg4 / local118;
				local84 = (float) -arg0 / local118;
			}
			local82[4] = local91;
			local82[3] = local102 * -local86;
			local82[2] = local107 * local84 * local86;
			local82[0] = local91 + local84 * local84 * local107;
			local82[7] = local102 * -local84;
			local82[1] = local86 * local102;
			local82[8] = local91 + local86 * local86 * local107;
			local82[6] = local86 * local84 * local107;
			local82[5] = local84 * local102;
			local9[0] = local6[0] * local82[0] + local82[3] * local6[1] + local6[2] * local82[6];
			local9[1] = local82[1] * local6[0] + local82[4] * local6[1] + local82[7] * local6[2];
			local9[2] = local82[8] * local6[2] + local82[2] * local6[0] + local82[5] * local6[1];
			local9[3] = local6[5] * local82[6] + local6[3] * local82[0] + local6[4] * local82[3];
			local9[4] = local82[1] * local6[3] + local6[4] * local82[4] + local6[5] * local82[7];
			local9[6] = local6[8] * local82[6] + local6[7] * local82[3] + local6[6] * local82[0];
			local9[5] = local82[2] * local6[3] + local82[5] * local6[4] + local82[8] * local6[5];
			local9[7] = local6[7] * local82[4] + local6[6] * local82[1] + local82[7] * local6[8];
			local9[8] = local6[8] * local82[8] + local82[2] * local6[6] + local6[7] * local82[5];
		}
		local9[6] *= arg3;
		local9[8] *= arg3;
		local9[7] *= arg3;
		local9[2] *= arg6;
		local9[0] *= arg6;
		local9[5] *= arg5;
		local9[1] *= arg6;
		local9[3] *= arg5;
		local9[4] *= arg5;
		return local9;
	}
}
