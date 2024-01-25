import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ema", name = "c", descriptor = "I")
	public static int anInt2726 = 0;

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(FIIFIIIF)[F")
	public static float[] method2499(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[8] = local17;
		local6[6] = -local25;
		local6[4] = 1.0F;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[5] = 0.0F;
		local6[2] = local25;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(79) float local79 = (float) arg3 / 32767.0F;
		@Pc(83) float local83 = 1.0F - local79;
		@Pc(93) float local93 = -((float) Math.sqrt((double) (1.0F - local79 * local79)));
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg5 * arg5 + arg1 * arg1));
		if (local104 == 0.0F && local79 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local72 = (float) -arg5 / local104;
				local74 = (float) arg1 / local104;
			}
			local70[7] = local93 * -local72;
			local70[5] = local72 * local93;
			local70[0] = local79 + local83 * local72 * local72;
			local70[6] = local83 * local74 * local72;
			local70[4] = local79;
			local70[2] = local83 * local72 * local74;
			local70[8] = local83 * local74 * local74 + local79;
			local70[1] = local93 * local74;
			local70[3] = local93 * -local74;
			local9[0] = local70[6] * local6[2] + local70[0] * local6[0] + local70[3] * local6[1];
			local9[1] = local70[1] * local6[0] + local6[1] * local70[4] + local6[2] * local70[7];
			local9[3] = local6[5] * local70[6] + local70[0] * local6[3] + local70[3] * local6[4];
			local9[2] = local70[8] * local6[2] + local6[1] * local70[5] + local70[2] * local6[0];
			local9[4] = local70[7] * local6[5] + local6[3] * local70[1] + local6[4] * local70[4];
			local9[5] = local70[5] * local6[4] + local70[2] * local6[3] + local70[8] * local6[5];
			local9[6] = local70[0] * local6[6] + local6[7] * local70[3] + local70[6] * local6[8];
			local9[7] = local70[7] * local6[8] + local70[1] * local6[6] + local70[4] * local6[7];
			local9[8] = local70[5] * local6[7] + local70[2] * local6[6] + local6[8] * local70[8];
		}
		local9[5] *= arg6;
		local9[7] *= arg0;
		local9[3] *= arg6;
		local9[8] *= arg0;
		local9[1] *= arg2;
		local9[4] *= arg6;
		local9[2] *= arg2;
		local9[6] *= arg0;
		local9[0] *= arg2;
		return local9;
	}

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(Lclient!ika;I)Lclient!lh;")
	public static Class227_Sub1 method2500(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(22) Class227 local22 = Static556.method7271(arg0);
		@Pc(26) int local26 = arg0.method2047();
		return new Class227_Sub1(local22.anInt5832, local22.aClass223_9, local22.aClass352_9, local22.anInt5833, local22.anInt5837, local26);
	}
}
