import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!mca", name = "x", descriptor = "Lclient!ci;")
	public static Class55 aClass55_7;

	@OriginalMember(owner = "client!mca", name = "D", descriptor = "I")
	public static int anInt3270;

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(III)B")
	public static byte method2937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BIII)I")
	public static int method2938(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(28) int local28 = Static324.method5104(local17, local7);
		@Pc(35) int local35 = Static324.method5104(local17, local7 + 1);
		@Pc(42) int local42 = Static324.method5104(local17 + 1, local7);
		@Pc(59) int local59 = Static324.method5104(local17 + 1, local7 - -1);
		@Pc(66) int local66 = Static191.method3669(local28, arg1, local35, local13);
		@Pc(73) int local73 = Static191.method3669(local42, arg1, local59, local13);
		return Static191.method3669(local66, arg1, local73, local23);
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IFIFIIFB)[F")
	public static float[] method2939(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[1] = 0.0F;
		local6[6] = -local25;
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[2] = local25;
		local6[4] = 1.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg4 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(93) float local93 = 1.0F - local76;
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg5 * arg5 + arg2 * arg2));
		if (local104 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local71 = (float) -arg5 / local104;
				local78 = (float) arg2 / local104;
			}
			local69[5] = local71 * local89;
			local69[0] = local76 + local93 * local71 * local71;
			local69[4] = local76;
			local69[1] = local89 * local78;
			local69[7] = -local71 * local89;
			local69[2] = local78 * local71 * local93;
			local69[6] = local93 * local78 * local71;
			local69[8] = local76 + local93 * local78 * local78;
			local69[3] = -local78 * local89;
			local9[0] = local69[3] * local6[1] + local6[0] * local69[0] + local6[2] * local69[6];
			local9[1] = local6[0] * local69[1] + local6[1] * local69[4] + local69[7] * local6[2];
			local9[2] = local6[2] * local69[8] + local6[0] * local69[2] + local6[1] * local69[5];
			local9[3] = local69[6] * local6[5] + local6[3] * local69[0] + local6[4] * local69[3];
			local9[4] = local69[4] * local6[4] + local69[1] * local6[3] + local69[7] * local6[5];
			local9[5] = local6[5] * local69[8] + local6[3] * local69[2] + local69[5] * local6[4];
			local9[6] = local69[6] * local6[8] + local69[0] * local6[6] + local69[3] * local6[7];
			local9[7] = local69[7] * local6[8] + local69[1] * local6[6] + local6[7] * local69[4];
			local9[8] = local6[8] * local69[8] + local6[6] * local69[2] + local69[5] * local6[7];
		}
		local9[8] *= arg3;
		local9[5] *= arg1;
		local9[7] *= arg3;
		local9[4] *= arg1;
		local9[2] *= arg6;
		local9[6] *= arg3;
		local9[3] *= arg1;
		local9[1] *= arg6;
		local9[0] *= arg6;
		return local9;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2940(@OriginalArg(1) String arg0) {
		System.exit(1);
	}
}
