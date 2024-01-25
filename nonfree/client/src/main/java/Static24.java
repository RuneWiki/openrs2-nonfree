import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!au", name = "f", descriptor = "I")
	public static int anInt314;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IFIFZIFI)[F")
	public static float[] method273(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(38) float local38 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[1] = 0.0F;
		local6[7] = 0.0F;
		local6[2] = local38;
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[3] = 0.0F;
		local6[6] = -local38;
		local6[0] = local17;
		local6[5] = 0.0F;
		@Pc(83) float[] local83 = new float[9];
		@Pc(85) float local85 = 1.0F;
		@Pc(90) float local90 = (float) arg0 / 32767.0F;
		@Pc(92) float local92 = 0.0F;
		@Pc(103) float local103 = -((float) Math.sqrt((double) (1.0F - local90 * local90)));
		@Pc(108) float local108 = 1.0F - local90;
		@Pc(119) float local119 = (float) Math.sqrt((double) (arg6 * arg6 + arg4 * arg4));
		if (local119 == 0.0F && local90 == 0.0F) {
			local9 = local6;
		} else {
			if (local119 != 0.0F) {
				local92 = (float) arg6 / local119;
				local85 = (float) -arg4 / local119;
			}
			local83[7] = -local85 * local103;
			local83[6] = local85 * local92 * local108;
			local83[8] = local108 * local92 * local92 + local90;
			local83[3] = local103 * -local92;
			local83[2] = local85 * local92 * local108;
			local83[5] = local103 * local85;
			local83[0] = local90 + local85 * local85 * local108;
			local83[1] = local103 * local92;
			local83[4] = local90;
			local9[0] = local83[0] * local6[0] + local83[3] * local6[1] + local6[2] * local83[6];
			local9[1] = local83[7] * local6[2] + local6[0] * local83[1] + local83[4] * local6[1];
			local9[2] = local6[2] * local83[8] + local83[2] * local6[0] + local6[1] * local83[5];
			local9[3] = local6[5] * local83[6] + local83[3] * local6[4] + local6[3] * local83[0];
			local9[4] = local6[3] * local83[1] + local83[4] * local6[4] + local6[5] * local83[7];
			local9[6] = local6[8] * local83[6] + local6[6] * local83[0] + local83[3] * local6[7];
			local9[5] = local83[5] * local6[4] + local6[3] * local83[2] + local83[8] * local6[5];
			local9[7] = local6[6] * local83[1] + local6[7] * local83[4] + local83[7] * local6[8];
			local9[8] = local83[5] * local6[7] + local83[2] * local6[6] + local6[8] * local83[8];
		}
		local9[8] *= arg1;
		local9[5] *= arg5;
		local9[1] *= arg3;
		local9[0] *= arg3;
		local9[6] *= arg1;
		local9[3] *= arg5;
		local9[2] *= arg3;
		local9[4] *= arg5;
		local9[7] *= arg1;
		return local9;
	}
}
