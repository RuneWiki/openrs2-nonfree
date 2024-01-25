import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "Lclient!vo;")
	public static Class348 aClass348_68;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!mi", name = "f", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_54 = new Class344(14, 3);

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_91 = new Class90(112, 0);

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "Z")
	public static boolean aBoolean437 = true;

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[8];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLclient!pn;B)V")
	public static void method5023(@OriginalArg(1) Class4_Sub21_Sub4 arg0) {
		Static294.aClass15_2.method5346(arg0);
		Static138.method2484(Static359.aClass348_76, Static294.aClass15_2, Static518.aClass348_118, Static19.aClass348_11, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public static void method5024() {
		if (Static343.anInt6623 == 1 || Static343.anInt6623 == 3 || Static343.anInt6623 != Static308.anInt6201 && (Static343.anInt6623 == 0 || Static308.anInt6201 == 0)) {
			Static222.anInt4653 = 0;
			Static137.anInt3042 = 0;
			Static144.aClass221_6.method5078();
		}
		Static308.anInt6201 = Static343.anInt6623;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIFFIIIF)[F")
	public static float[] method5026(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[6] = -local25;
		local6[2] = local25;
		local6[7] = 0.0F;
		local6[1] = 0.0F;
		local6[5] = 0.0F;
		local6[8] = local17;
		local6[3] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(79) float local79 = (float) arg0 / 32767.0F;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local79 * local79)));
		@Pc(94) float local94 = 1.0F - local79;
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4));
		if (local105 == 0.0F && local79 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local72 = (float) -arg4 / local105;
				local74 = (float) arg5 / local105;
			}
			local70[3] = local90 * -local74;
			local70[0] = local94 * local72 * local72 + local79;
			local70[4] = local79;
			local70[2] = local94 * local72 * local74;
			local70[6] = local72 * local74 * local94;
			local70[1] = local74 * local90;
			local70[5] = local72 * local90;
			local70[7] = local90 * -local72;
			local70[8] = local74 * local74 * local94 + local79;
			local9[0] = local6[1] * local70[3] + local70[0] * local6[0] + local70[6] * local6[2];
			local9[1] = local6[2] * local70[7] + local70[4] * local6[1] + local70[1] * local6[0];
			local9[2] = local70[2] * local6[0] + local6[1] * local70[5] + local6[2] * local70[8];
			local9[3] = local6[5] * local70[6] + local6[4] * local70[3] + local70[0] * local6[3];
			local9[4] = local6[5] * local70[7] + local6[3] * local70[1] + local70[4] * local6[4];
			local9[5] = local6[3] * local70[2] + local6[4] * local70[5] + local6[5] * local70[8];
			local9[6] = local70[6] * local6[8] + local70[0] * local6[6] + local70[3] * local6[7];
			local9[7] = local70[7] * local6[8] + local70[4] * local6[7] + local70[1] * local6[6];
			local9[8] = local70[2] * local6[6] + local6[7] * local70[5] + local6[8] * local70[8];
		}
		local9[4] *= arg1;
		local9[8] *= arg2;
		local9[5] *= arg1;
		local9[3] *= arg1;
		local9[1] *= arg6;
		local9[6] *= arg2;
		local9[2] *= arg6;
		local9[7] *= arg2;
		local9[0] *= arg6;
		return local9;
	}
}
