import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!nv", name = "u", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_130 = new Class12(58, 4);

	@OriginalMember(owner = "client!nv", name = "A", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_116 = new Class119("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!nv", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString59 = "";

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3884(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static232.method3338("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(BIFIIFIF)[F")
	public static float[] method3888(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[5] = 0.0F;
		local6[6] = -local25;
		local6[4] = 1.0F;
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[8] = local17;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg5 / 32767.0F;
		@Pc(88) float local88 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(92) float local92 = 1.0F - local78;
		@Pc(103) float local103 = (float) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3));
		if (local103 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local103 != 0.0F) {
				local73 = (float) arg2 / local103;
				local71 = (float) -arg3 / local103;
			}
			local69[7] = local88 * -local71;
			local69[4] = local78;
			local69[2] = local92 * local73 * local71;
			local69[8] = local78 + local92 * local73 * local73;
			local69[5] = local88 * local71;
			local69[1] = local88 * local73;
			local69[6] = local92 * local73 * local71;
			local69[0] = local78 + local92 * local71 * local71;
			local69[3] = -local73 * local88;
			local9[0] = local69[3] * local6[1] + local69[0] * local6[0] + local69[6] * local6[2];
			local9[1] = local6[1] * local69[4] + local6[0] * local69[1] + local6[2] * local69[7];
			local9[3] = local69[0] * local6[3] + local69[3] * local6[4] + local69[6] * local6[5];
			local9[2] = local6[2] * local69[8] + local69[2] * local6[0] + local6[1] * local69[5];
			local9[4] = local69[7] * local6[5] + local69[4] * local6[4] + local6[3] * local69[1];
			local9[5] = local69[8] * local6[5] + local6[3] * local69[2] + local6[4] * local69[5];
			local9[6] = local6[6] * local69[0] + local6[7] * local69[3] + local69[6] * local6[8];
			local9[7] = local6[8] * local69[7] + local6[7] * local69[4] + local6[6] * local69[1];
			local9[8] = local69[5] * local6[7] + local69[2] * local6[6] + local6[8] * local69[8];
		}
		local9[2] *= arg1;
		local9[7] *= arg6;
		local9[3] *= arg4;
		local9[4] *= arg4;
		local9[1] *= arg1;
		local9[8] *= arg6;
		local9[6] *= arg6;
		local9[0] *= arg1;
		local9[5] *= arg4;
		return local9;
	}
}
