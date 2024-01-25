import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "[I")
	public static int[] anIntArray317 = new int[1];

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "[I")
	public static final int[] anIntArray318 = new int[2];

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
	public static int anInt5996 = 0;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BIFIFIIF)[F")
	public static float[] method4874(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[6] = -local25;
		local6[3] = 0.0F;
		local6[2] = local25;
		local6[1] = 0.0F;
		local6[5] = 0.0F;
		local6[8] = local17;
		@Pc(75) float[] local75 = new float[9];
		@Pc(77) float local77 = 1.0F;
		@Pc(82) float local82 = (float) arg0 / 32767.0F;
		@Pc(84) float local84 = 0.0F;
		@Pc(88) float local88 = 1.0F - local82;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local82 * local82)));
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2));
		if (local110 == 0.0F && local82 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local84 = (float) arg4 / local110;
				local77 = (float) -arg2 / local110;
			}
			local75[7] = -local77 * local98;
			local75[2] = local84 * local77 * local88;
			local75[5] = local77 * local98;
			local75[8] = local84 * local84 * local88 + local82;
			local75[3] = -local84 * local98;
			local75[1] = local84 * local98;
			local75[4] = local82;
			local75[0] = local88 * local77 * local77 + local82;
			local75[6] = local77 * local84 * local88;
			local9[0] = local75[6] * local6[2] + local75[3] * local6[1] + local75[0] * local6[0];
			local9[1] = local75[7] * local6[2] + local6[1] * local75[4] + local75[1] * local6[0];
			local9[2] = local6[1] * local75[5] + local6[0] * local75[2] + local75[8] * local6[2];
			local9[3] = local75[6] * local6[5] + local75[3] * local6[4] + local6[3] * local75[0];
			local9[4] = local6[5] * local75[7] + local75[4] * local6[4] + local75[1] * local6[3];
			local9[6] = local75[6] * local6[8] + local75[0] * local6[6] + local75[3] * local6[7];
			local9[5] = local6[3] * local75[2] + local6[4] * local75[5] + local75[8] * local6[5];
			local9[7] = local75[4] * local6[7] + local75[1] * local6[6] + local75[7] * local6[8];
			local9[8] = local6[7] * local75[5] + local75[2] * local6[6] + local75[8] * local6[8];
		}
		local9[5] *= arg3;
		local9[4] *= arg3;
		local9[6] *= arg6;
		local9[2] *= arg1;
		local9[8] *= arg6;
		local9[0] *= arg1;
		local9[3] *= arg3;
		local9[1] *= arg1;
		local9[7] *= arg6;
		return local9;
	}
}
