import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!ss", name = "k", descriptor = "F")
	public static float aFloat233;

	@OriginalMember(owner = "client!ss", name = "r", descriptor = "Lclient!kha;")
	public static Class181 aClass181_110;

	@OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
	public static final int anInt9098 = 1337;

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "Lclient!us;")
	public static final Class344 aClass344_112 = new Class344(29, 3);

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IFFIIFII)[F")
	public static float[] method7491(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[1] = 0.0F;
		local6[8] = local17;
		local6[6] = -local25;
		local6[3] = 0.0F;
		local6[0] = local17;
		@Pc(75) float[] local75 = new float[9];
		@Pc(77) float local77 = 1.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = (float) arg2 / 32767.0F;
		@Pc(95) float local95 = -((float) Math.sqrt((double) (1.0F - local84 * local84)));
		@Pc(100) float local100 = 1.0F - local84;
		@Pc(111) float local111 = (float) Math.sqrt((double) (arg3 * arg3 + arg5 * arg5));
		if (local111 == 0.0F && local84 == 0.0F) {
			local9 = local6;
		} else {
			if (local111 != 0.0F) {
				local77 = (float) -arg3 / local111;
				local79 = (float) arg5 / local111;
			}
			local75[1] = local79 * local95;
			local75[5] = local95 * local77;
			local75[7] = -local77 * local95;
			local75[0] = local84 + local77 * local77 * local100;
			local75[3] = local95 * -local79;
			local75[2] = local100 * local79 * local77;
			local75[4] = local84;
			local75[6] = local100 * local77 * local79;
			local75[8] = local100 * local79 * local79 + local84;
			local9[0] = local6[1] * local75[3] + local75[0] * local6[0] + local6[2] * local75[6];
			local9[1] = local75[7] * local6[2] + local75[1] * local6[0] + local75[4] * local6[1];
			local9[3] = local6[3] * local75[0] + local75[3] * local6[4] + local6[5] * local75[6];
			local9[2] = local75[8] * local6[2] + local75[2] * local6[0] + local75[5] * local6[1];
			local9[4] = local75[1] * local6[3] + local75[4] * local6[4] + local75[7] * local6[5];
			local9[6] = local6[6] * local75[0] + local6[7] * local75[3] + local75[6] * local6[8];
			local9[5] = local75[5] * local6[4] + local6[3] * local75[2] + local75[8] * local6[5];
			local9[7] = local75[7] * local6[8] + local75[1] * local6[6] + local75[4] * local6[7];
			local9[8] = local75[5] * local6[7] + local6[6] * local75[2] + local75[8] * local6[8];
		}
		local9[4] *= arg0;
		local9[3] *= arg0;
		local9[0] *= arg1;
		local9[7] *= arg4;
		local9[6] *= arg4;
		local9[8] *= arg4;
		local9[1] *= arg1;
		local9[5] *= arg0;
		local9[2] *= arg1;
		return local9;
	}
}
