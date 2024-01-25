import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!jp;")
	public static final Class1_Sub19_Sub2 aClass1_Sub19_Sub2_2 = new Class1_Sub19_Sub2(5000);

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "[I")
	public static final int[] anIntArray487 = new int[25];

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "Z")
	public static boolean aBoolean592 = false;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
	public static int anInt6829 = 0;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
	public static int anInt6830 = -1;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZFFIIIIF)[F")
	public static float[] method5423(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[0] = local17;
		local6[6] = -local25;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg4 / 32767.0F;
		@Pc(93) float local93 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(97) float local97 = 1.0F - local83;
		@Pc(108) float local108 = (float) Math.sqrt((double) (arg2 * arg2 + arg3 * arg3));
		if (local108 == 0.0F && local83 == 0.0F) {
			local9 = local6;
		} else {
			if (local108 != 0.0F) {
				local76 = (float) -arg2 / local108;
				local78 = (float) arg3 / local108;
			}
			local74[1] = local78 * local93;
			local74[3] = local93 * -local78;
			local74[5] = local93 * local76;
			local74[8] = local97 * local78 * local78 + local83;
			local74[6] = local78 * local76 * local97;
			local74[4] = local83;
			local74[2] = local78 * local76 * local97;
			local74[0] = local83 + local76 * local76 * local97;
			local74[7] = local93 * -local76;
			local9[0] = local74[3] * local6[1] + local6[0] * local74[0] + local6[2] * local74[6];
			local9[1] = local74[7] * local6[2] + local6[1] * local74[4] + local6[0] * local74[1];
			local9[2] = local6[0] * local74[2] + local74[5] * local6[1] + local6[2] * local74[8];
			local9[3] = local6[4] * local74[3] + local74[0] * local6[3] + local6[5] * local74[6];
			local9[4] = local6[5] * local74[7] + local74[4] * local6[4] + local6[3] * local74[1];
			local9[5] = local6[3] * local74[2] + local74[5] * local6[4] + local6[5] * local74[8];
			local9[6] = local6[8] * local74[6] + local74[3] * local6[7] + local74[0] * local6[6];
			local9[7] = local74[1] * local6[6] + local74[4] * local6[7] + local6[8] * local74[7];
			local9[8] = local6[8] * local74[8] + local74[5] * local6[7] + local6[6] * local74[2];
		}
		local9[2] *= arg0;
		local9[3] *= arg6;
		local9[4] *= arg6;
		local9[0] *= arg0;
		local9[5] *= arg6;
		local9[8] *= arg1;
		local9[6] *= arg1;
		local9[7] *= arg1;
		local9[1] *= arg0;
		return local9;
	}
}
