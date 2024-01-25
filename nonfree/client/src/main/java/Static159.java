import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!vo;")
	public static Class348 aClass348_38;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_20 = new Class344(65, 8);

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "[I")
	public static final int[] anIntArray160 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
	public static void method2596() {
		@Pc(5) Class167 local5 = Static580.aClass167_36;
		synchronized (Static580.aClass167_36) {
			Static580.aClass167_36.method3964(5);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IFIFFIII)[F")
	public static float[] method2597(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[0] = local17;
		local6[2] = local25;
		local6[8] = local17;
		local6[6] = -local25;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[4] = 1.0F;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg5 / 32767.0F;
		@Pc(87) float local87 = 1.0F - local83;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg6 * arg6 + arg0 * arg0));
		if (local109 == 0.0F && local83 == 0.0F) {
			local9 = local6;
		} else {
			if (local109 != 0.0F) {
				local78 = (float) arg0 / local109;
				local76 = (float) -arg6 / local109;
			}
			local74[1] = local98 * local78;
			local74[0] = local83 + local76 * local76 * local87;
			local74[3] = local98 * -local78;
			local74[6] = local87 * local78 * local76;
			local74[5] = local98 * local76;
			local74[2] = local76 * local78 * local87;
			local74[4] = local83;
			local74[7] = -local76 * local98;
			local74[8] = local87 * local78 * local78 + local83;
			local9[0] = local74[3] * local6[1] + local6[0] * local74[0] + local74[6] * local6[2];
			local9[1] = local6[1] * local74[4] + local6[0] * local74[1] + local6[2] * local74[7];
			local9[2] = local6[2] * local74[8] + local74[5] * local6[1] + local74[2] * local6[0];
			local9[3] = local6[5] * local74[6] + local6[3] * local74[0] + local6[4] * local74[3];
			local9[4] = local74[7] * local6[5] + local6[4] * local74[4] + local6[3] * local74[1];
			local9[6] = local74[0] * local6[6] + local6[7] * local74[3] + local6[8] * local74[6];
			local9[5] = local74[8] * local6[5] + local74[5] * local6[4] + local74[2] * local6[3];
			local9[7] = local74[1] * local6[6] + local74[4] * local6[7] + local74[7] * local6[8];
			local9[8] = local74[2] * local6[6] + local74[5] * local6[7] + local74[8] * local6[8];
		}
		local9[6] *= arg3;
		local9[3] *= arg1;
		local9[1] *= arg2;
		local9[0] *= arg2;
		local9[4] *= arg1;
		local9[8] *= arg3;
		local9[5] *= arg1;
		local9[2] *= arg2;
		local9[7] *= arg3;
		return local9;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!is;B)Lclient!is;")
	public static Class155 method2598(@OriginalArg(0) Class155 arg0) {
		@Pc(11) Class155 local11 = Static70.method1548(arg0);
		if (local11 == null) {
			local11 = arg0.aClass155_5;
		}
		return local11;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method2601() {
		Static328.method5066(255, -1);
	}
}
