import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "Lclient!tf;")
	public static Class240 aClass240_12;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "Lclient!jk;")
	public static Class122 aClass122_5;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray9;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_157 = new Class214(47, -2);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIII)V")
	public static void method4242(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 >= Static176.anInt3462 && arg0 <= Static418.anInt3023 && Static162.anInt1715 <= arg3 && arg2 <= Static55.anInt1319) {
			Static406.method5344(arg3, arg1, arg4, arg0, arg2);
		} else {
			Static458.method6214(arg2, arg4, arg1, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIFFIFB)[F")
	public static float[] method4243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(30) float local30 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[3] = 0.0F;
		local6[6] = -local30;
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		local6[1] = 0.0F;
		local6[2] = local30;
		local6[8] = local17;
		local6[0] = local17;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(81) float local81 = (float) arg1 / 32767.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(94) float local94 = -((float) Math.sqrt((double) (1.0F - local81 * local81)));
		@Pc(99) float local99 = 1.0F - local81;
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg5 * arg5 + arg2 * arg2));
		if (local110 == 0.0F && local81 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local83 = (float) arg5 / local110;
				local76 = (float) -arg2 / local110;
			}
			local74[6] = local99 * local76 * local83;
			local74[3] = local94 * -local83;
			local74[4] = local81;
			local74[5] = local94 * local76;
			local74[1] = local94 * local83;
			local74[0] = local99 * local76 * local76 + local81;
			local74[2] = local99 * local76 * local83;
			local74[7] = local94 * -local76;
			local74[8] = local81 + local83 * local83 * local99;
			local9[0] = local6[2] * local74[6] + local74[3] * local6[1] + local74[0] * local6[0];
			local9[1] = local6[2] * local74[7] + local6[0] * local74[1] + local6[1] * local74[4];
			local9[3] = local6[4] * local74[3] + local6[3] * local74[0] + local6[5] * local74[6];
			local9[2] = local74[5] * local6[1] + local74[2] * local6[0] + local74[8] * local6[2];
			local9[4] = local74[7] * local6[5] + local6[3] * local74[1] + local74[4] * local6[4];
			local9[5] = local74[2] * local6[3] + local6[4] * local74[5] + local6[5] * local74[8];
			local9[6] = local74[6] * local6[8] + local74[3] * local6[7] + local74[0] * local6[6];
			local9[7] = local6[8] * local74[7] + local6[7] * local74[4] + local74[1] * local6[6];
			local9[8] = local6[8] * local74[8] + local74[2] * local6[6] + local6[7] * local74[5];
		}
		local9[3] *= arg3;
		local9[2] *= arg4;
		local9[0] *= arg4;
		local9[6] *= arg6;
		local9[4] *= arg3;
		local9[1] *= arg4;
		local9[5] *= arg3;
		local9[8] *= arg6;
		local9[7] *= arg6;
		return local9;
	}
}
