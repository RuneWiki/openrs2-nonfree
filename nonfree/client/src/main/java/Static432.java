import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static432 {

	@OriginalMember(owner = "client!pga", name = "g", descriptor = "Z")
	public static boolean aBoolean607;

	@OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
	public static int anInt7299 = -2;

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(IIIIFFFI)[F")
	public static float[] method6469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[3] = 0.0F;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[8] = local17;
		local6[5] = 0.0F;
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[6] = -local25;
		local6[0] = local17;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg1 / 32767.0F;
		@Pc(84) float local84 = 0.0F;
		@Pc(88) float local88 = 1.0F - local77;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg6 * arg6 + arg0 * arg0));
		if (local109 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local109 != 0.0F) {
				local72 = (float) -arg6 / local109;
				local84 = (float) arg0 / local109;
			}
			local70[3] = -local84 * local98;
			local70[4] = local77;
			local70[1] = local84 * local98;
			local70[6] = local88 * local72 * local84;
			local70[2] = local72 * local84 * local88;
			local70[8] = local77 + local84 * local84 * local88;
			local70[0] = local77 + local72 * local72 * local88;
			local70[5] = local72 * local98;
			local70[7] = local98 * -local72;
			local9[0] = local70[0] * local6[0] + local6[1] * local70[3] + local70[6] * local6[2];
			local9[1] = local70[7] * local6[2] + local6[0] * local70[1] + local6[1] * local70[4];
			local9[3] = local6[5] * local70[6] + local70[3] * local6[4] + local6[3] * local70[0];
			local9[2] = local70[5] * local6[1] + local6[0] * local70[2] + local6[2] * local70[8];
			local9[4] = local70[7] * local6[5] + local6[4] * local70[4] + local6[3] * local70[1];
			local9[6] = local70[6] * local6[8] + local70[3] * local6[7] + local6[6] * local70[0];
			local9[5] = local6[5] * local70[8] + local6[3] * local70[2] + local70[5] * local6[4];
			local9[7] = local70[1] * local6[6] + local6[7] * local70[4] + local70[7] * local6[8];
			local9[8] = local70[8] * local6[8] + local6[7] * local70[5] + local6[6] * local70[2];
		}
		local9[4] *= arg4;
		local9[8] *= arg5;
		local9[3] *= arg4;
		local9[2] *= arg3;
		local9[1] *= arg3;
		local9[0] *= arg3;
		local9[6] *= arg5;
		local9[7] *= arg5;
		local9[5] *= arg4;
		return local9;
	}

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lclient!ee;I)Lclient!mf;")
	public static Class226 method6470(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(7) int local7 = arg0.method8645();
		@Pc(14) Class204 local14 = Static194.method3068()[arg0.method8645()];
		@Pc(29) Class288 local29 = Static609.method8474()[arg0.method8645()];
		@Pc(33) int local33 = arg0.method8595();
		@Pc(37) int local37 = arg0.method8595();
		@Pc(41) int local41 = arg0.method8631();
		@Pc(45) int local45 = arg0.method8631();
		@Pc(49) int local49 = arg0.method8623();
		@Pc(53) int local53 = arg0.method8623();
		@Pc(57) int local57 = arg0.method8623();
		@Pc(66) boolean local66 = arg0.method8645() == 1;
		return new Class226(local7, local14, local29, local33, local37, local41, local45, local49, local53, local57, local66);
	}
}
