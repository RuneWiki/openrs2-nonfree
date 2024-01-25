import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
	public static int anInt5940;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "Lclient!ga;")
	public static Class111 aClass111_77;

	@OriginalMember(owner = "client!mq", name = "M", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "Z")
	public static boolean aBoolean432 = false;

	@OriginalMember(owner = "client!mq", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[200];

	@OriginalMember(owner = "client!mq", name = "E", descriptor = "Lclient!er;")
	public static final Class91 aClass91_1 = Static85.method1718();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)[I")
	public static int[] method5001() {
		return new int[] { Static428.anInt4964, Static474.anInt1074, Static178.anInt3195 };
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIFIFZF)[F")
	public static float[] method5002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[6] = -local25;
		local6[1] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg1 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(88) float local88 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(93) float local93 = 1.0F - local76;
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg2 * arg2 + arg0 * arg0));
		if (local104 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local71 = (float) -arg2 / local104;
				local78 = (float) arg0 / local104;
			}
			local69[3] = -local78 * local88;
			local69[0] = local71 * local71 * local93 + local76;
			local69[4] = local76;
			local69[2] = local78 * local71 * local93;
			local69[6] = local93 * local78 * local71;
			local69[8] = local76 + local78 * local78 * local93;
			local69[1] = local78 * local88;
			local69[5] = local71 * local88;
			local69[7] = -local71 * local88;
			local9[0] = local6[2] * local69[6] + local6[0] * local69[0] + local6[1] * local69[3];
			local9[1] = local69[7] * local6[2] + local69[4] * local6[1] + local69[1] * local6[0];
			local9[3] = local6[3] * local69[0] + local6[4] * local69[3] + local6[5] * local69[6];
			local9[2] = local69[2] * local6[0] + local69[5] * local6[1] + local6[2] * local69[8];
			local9[4] = local69[7] * local6[5] + local69[1] * local6[3] + local6[4] * local69[4];
			local9[6] = local6[6] * local69[0] + local69[3] * local6[7] + local69[6] * local6[8];
			local9[5] = local6[4] * local69[5] + local6[3] * local69[2] + local69[8] * local6[5];
			local9[7] = local69[4] * local6[7] + local6[6] * local69[1] + local69[7] * local6[8];
			local9[8] = local6[6] * local69[2] + local6[7] * local69[5] + local69[8] * local6[8];
		}
		local9[0] *= arg3;
		local9[8] *= arg5;
		local9[5] *= arg6;
		local9[2] *= arg3;
		local9[4] *= arg6;
		local9[7] *= arg5;
		local9[3] *= arg6;
		local9[6] *= arg5;
		local9[1] *= arg3;
		return local9;
	}
}
