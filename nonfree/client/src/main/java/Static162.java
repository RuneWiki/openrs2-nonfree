import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
	public static int anInt3559;

	@OriginalMember(owner = "client!ge", name = "j", descriptor = "Lclient!kga;")
	public static Class196 aClass196_4;

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "Lclient!gj;")
	public static final Class124 aClass124_19 = new Class124();

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
	public static int anInt3565 = -1;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
	public static int method3173() {
		return Static484.method7811(false);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I")
	public static int method3174() {
		return Static591.anInt9706;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)V")
	public static void method3175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (arg0 != Static560.anInt9394) {
			Static80.anIntArray212 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static80.anIntArray212[local13] = (local13 << 12) / arg0;
			}
			Static560.anInt9394 = arg0;
			Static571.anInt9405 = arg0 - 1;
			Static293.anInt5417 = arg0 * 32;
		}
		if (arg1 == Static278.anInt5214) {
			return;
		}
		if (Static560.anInt9394 == arg1) {
			Static450.anIntArray619 = Static80.anIntArray212;
		} else {
			Static450.anIntArray619 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static450.anIntArray619[local13] = (local13 << 12) / arg1;
			}
		}
		Static278.anInt5214 = arg1;
		Static360.anInt6375 = arg1 - 1;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIFIFF)[F")
	public static float[] method3176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(14) float[] local14 = new float[9];
		@Pc(22) float local22 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(30) float local30 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[0] = local22;
		local6[2] = local30;
		local6[8] = local22;
		local6[5] = 0.0F;
		local6[4] = 1.0F;
		local6[3] = 0.0F;
		local6[6] = -local30;
		local6[7] = 0.0F;
		local6[1] = 0.0F;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg2 / 32767.0F;
		@Pc(88) float local88 = 1.0F - local83;
		@Pc(99) float local99 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg0 * arg0 + arg4 * arg4));
		if (local110 == 0.0F && local83 == 0.0F) {
			local14 = local6;
		} else {
			if (local110 != 0.0F) {
				local78 = (float) arg4 / local110;
				local76 = (float) -arg0 / local110;
			}
			local74[1] = local78 * local99;
			local74[6] = local88 * local78 * local76;
			local74[2] = local88 * local78 * local76;
			local74[0] = local88 * local76 * local76 + local83;
			local74[7] = local99 * -local76;
			local74[4] = local83;
			local74[5] = local76 * local99;
			local74[3] = -local78 * local99;
			local74[8] = local78 * local78 * local88 + local83;
			local14[0] = local6[1] * local74[3] + local6[0] * local74[0] + local6[2] * local74[6];
			local14[1] = local74[4] * local6[1] + local6[0] * local74[1] + local74[7] * local6[2];
			local14[2] = local74[2] * local6[0] + local74[5] * local6[1] + local74[8] * local6[2];
			local14[3] = local74[0] * local6[3] + local74[3] * local6[4] + local6[5] * local74[6];
			local14[4] = local74[4] * local6[4] + local74[1] * local6[3] + local74[7] * local6[5];
			local14[6] = local74[0] * local6[6] + local74[3] * local6[7] + local74[6] * local6[8];
			local14[5] = local6[5] * local74[8] + local74[5] * local6[4] + local6[3] * local74[2];
			local14[7] = local74[7] * local6[8] + local6[7] * local74[4] + local74[1] * local6[6];
			local14[8] = local6[8] * local74[8] + local74[2] * local6[6] + local74[5] * local6[7];
		}
		local14[3] *= arg5;
		local14[8] *= arg3;
		local14[7] *= arg3;
		local14[4] *= arg5;
		local14[1] *= arg6;
		local14[6] *= arg3;
		local14[0] *= arg6;
		local14[5] *= arg5;
		local14[2] *= arg6;
		return local14;
	}
}
