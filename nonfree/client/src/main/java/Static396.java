import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!hi;")
	public static Class2_Sub30 aClass2_Sub30_2;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!l;")
	public static Class206 aClass206_1;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!nj;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!sv;")
	public static final Class341 aClass341_76 = new Class341(63, 1);

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Lclient!eaa;")
	public static Class2_Sub22 aClass2_Sub22_2 = null;

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "[I")
	public static final int[] anIntArray349 = new int[3];

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "[Lclient!je;")
	public static final Class178[] aClass178Array2 = new Class178[14];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IFIIIFIF)[F")
	public static float[] method6571(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[0] = local17;
		local6[8] = local17;
		local6[6] = -local25;
		local6[2] = local25;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		local6[1] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg1 / 32767.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(94) float local94 = 1.0F - local78;
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg3 * arg3 + arg2 * arg2));
		if (local106 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local71 = (float) -arg2 / local106;
				local73 = (float) arg3 / local106;
			}
			local69[3] = local89 * -local73;
			local69[7] = local89 * -local71;
			local69[8] = local94 * local73 * local73 + local78;
			local69[6] = local94 * local73 * local71;
			local69[0] = local71 * local71 * local94 + local78;
			local69[2] = local94 * local71 * local73;
			local69[4] = local78;
			local69[1] = local89 * local73;
			local69[5] = local89 * local71;
			local9[0] = local6[2] * local69[6] + local6[1] * local69[3] + local69[0] * local6[0];
			local9[1] = local69[7] * local6[2] + local6[0] * local69[1] + local69[4] * local6[1];
			local9[2] = local6[1] * local69[5] + local6[0] * local69[2] + local69[8] * local6[2];
			local9[3] = local69[0] * local6[3] + local6[4] * local69[3] + local69[6] * local6[5];
			local9[4] = local69[1] * local6[3] + local6[4] * local69[4] + local6[5] * local69[7];
			local9[6] = local6[8] * local69[6] + local6[6] * local69[0] + local6[7] * local69[3];
			local9[5] = local69[2] * local6[3] + local6[4] * local69[5] + local69[8] * local6[5];
			local9[7] = local6[6] * local69[1] + local6[7] * local69[4] + local69[7] * local6[8];
			local9[8] = local6[8] * local69[8] + local6[6] * local69[2] + local69[5] * local6[7];
		}
		local9[8] *= arg0;
		local9[6] *= arg0;
		local9[0] *= arg4;
		local9[2] *= arg4;
		local9[4] *= arg6;
		local9[7] *= arg0;
		local9[1] *= arg4;
		local9[3] *= arg6;
		local9[5] *= arg6;
		return local9;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZIBI)V")
	public static void method6572(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() == 0) {
			Static428.method7019(false);
		} else {
			Static86.anInt1618 = Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907();
			Static389.method6560(true, 0);
		}
		Static205.anInt4280 = arg0;
		Static161.aBoolean258 = arg1;
		Static93.anInt10961 = arg2;
		Static331.method9065(arg3);
	}
}
