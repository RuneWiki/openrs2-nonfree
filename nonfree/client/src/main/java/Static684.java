import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static684 {

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
	public static int anInt10516;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(FIFIIFII)[F")
	public static float[] method9214(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(24) float[] local24 = new float[9];
		@Pc(32) float local32 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(40) float local40 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[2] = local40;
		local6[1] = 0.0F;
		local6[6] = -local40;
		local6[0] = local32;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		local6[8] = local32;
		@Pc(84) float[] local84 = new float[9];
		@Pc(86) float local86 = 1.0F;
		@Pc(91) float local91 = (float) arg3 / 32767.0F;
		@Pc(93) float local93 = 0.0F;
		@Pc(103) float local103 = -((float) Math.sqrt((double) (1.0F - local91 * local91)));
		@Pc(108) float local108 = 1.0F - local91;
		@Pc(119) float local119 = (float) Math.sqrt((double) (arg6 * arg6 + arg4 * arg4));
		if (local119 == 0.0F && local91 == 0.0F) {
			local24 = local6;
		} else {
			if (local119 != 0.0F) {
				local93 = (float) arg4 / local119;
				local86 = (float) -arg6 / local119;
			}
			local84[0] = local91 + local108 * local86 * local86;
			local84[1] = local103 * local93;
			local84[4] = local91;
			local84[6] = local93 * local86 * local108;
			local84[8] = local91 + local93 * local93 * local108;
			local84[7] = local103 * -local86;
			local84[5] = local86 * local103;
			local84[3] = local103 * -local93;
			local84[2] = local108 * local86 * local93;
			local24[0] = local84[0] * local6[0] + local84[3] * local6[1] + local84[6] * local6[2];
			local24[1] = local6[2] * local84[7] + local6[1] * local84[4] + local84[1] * local6[0];
			local24[2] = local6[1] * local84[5] + local6[0] * local84[2] + local84[8] * local6[2];
			local24[3] = local84[3] * local6[4] + local84[0] * local6[3] + local84[6] * local6[5];
			local24[4] = local6[5] * local84[7] + local6[3] * local84[1] + local6[4] * local84[4];
			local24[5] = local6[4] * local84[5] + local6[3] * local84[2] + local6[5] * local84[8];
			local24[6] = local6[7] * local84[3] + local84[0] * local6[6] + local84[6] * local6[8];
			local24[7] = local84[7] * local6[8] + local84[4] * local6[7] + local84[1] * local6[6];
			local24[8] = local84[8] * local6[8] + local84[2] * local6[6] + local84[5] * local6[7];
		}
		local24[2] *= arg2;
		local24[7] *= arg5;
		local24[6] *= arg5;
		local24[0] *= arg2;
		local24[8] *= arg5;
		local24[1] *= arg2;
		local24[4] *= arg0;
		local24[3] *= arg0;
		local24[5] *= arg0;
		return local24;
	}
}
