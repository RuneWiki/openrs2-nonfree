import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
	public static int anInt3471;

	@OriginalMember(owner = "client!gw", name = "g", descriptor = "[I")
	public static int[] anIntArray192;

	@OriginalMember(owner = "client!gw", name = "e", descriptor = "Z")
	public static boolean aBoolean206 = false;

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "Lclient!of;")
	public static final Class251 aClass251_1 = new Class251(3, 2);

	@OriginalMember(owner = "client!gw", name = "h", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[2];

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(JLjava/lang/String;IZJLjava/lang/String;IIIIZIZ)V")
	public static void method2916(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) long arg4, @OriginalArg(5) String arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11) {
		if (!Static277.aBoolean303 && Static183.anInt3155 < 500) {
			@Pc(16) int local16 = arg7 == -1 ? Static357.anInt6124 : arg7;
			@Pc(36) Class6_Sub4_Sub12 local36 = new Class6_Sub4_Sub12(arg1, arg5, local16, arg6, arg8, arg4, arg10, arg2, arg9, arg3, arg0, arg11);
			Static671.method9094(local36);
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZIIIIII)I")
	public static int method2917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg1;
			arg1 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg4;
		} else if (local14 == 1) {
			return 7 + 1 - arg0 - arg3;
		} else if (local14 == 2) {
			return 7 + 1 - arg4 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IBIFFIIF)[F")
	public static float[] method2918(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(30) float local30 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[2] = local30;
		local6[4] = 1.0F;
		local6[3] = 0.0F;
		local6[6] = -local30;
		local6[5] = 0.0F;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[8] = local17;
		local6[7] = 0.0F;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg0 / 32767.0F;
		@Pc(88) float local88 = 1.0F - local83;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg1 * arg1 + arg5 * arg5));
		if (local109 == 0.0F && local83 == 0.0F) {
			local9 = local6;
		} else {
			if (local109 != 0.0F) {
				local78 = (float) arg5 / local109;
				local76 = (float) -arg1 / local109;
			}
			local74[4] = local83;
			local74[0] = local83 + local88 * local76 * local76;
			local74[7] = local98 * -local76;
			local74[8] = local78 * local78 * local88 + local83;
			local74[6] = local88 * local78 * local76;
			local74[1] = local98 * local78;
			local74[3] = -local78 * local98;
			local74[5] = local98 * local76;
			local74[2] = local88 * local76 * local78;
			local9[0] = local6[0] * local74[0] + local74[3] * local6[1] + local6[2] * local74[6];
			local9[1] = local6[2] * local74[7] + local6[1] * local74[4] + local6[0] * local74[1];
			local9[2] = local74[5] * local6[1] + local74[2] * local6[0] + local6[2] * local74[8];
			local9[3] = local74[3] * local6[4] + local6[3] * local74[0] + local6[5] * local74[6];
			local9[4] = local74[1] * local6[3] + local6[4] * local74[4] + local74[7] * local6[5];
			local9[5] = local74[2] * local6[3] + local74[5] * local6[4] + local74[8] * local6[5];
			local9[6] = local6[8] * local74[6] + local6[7] * local74[3] + local74[0] * local6[6];
			local9[7] = local6[6] * local74[1] + local6[7] * local74[4] + local6[8] * local74[7];
			local9[8] = local6[6] * local74[2] + local6[7] * local74[5] + local6[8] * local74[8];
		}
		local9[7] *= arg3;
		local9[6] *= arg3;
		local9[2] *= arg2;
		local9[1] *= arg2;
		local9[8] *= arg3;
		local9[0] *= arg2;
		local9[5] *= arg6;
		local9[4] *= arg6;
		local9[3] *= arg6;
		return local9;
	}
}
