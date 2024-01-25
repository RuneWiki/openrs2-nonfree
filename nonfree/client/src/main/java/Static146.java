import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_66 = new Class40(37, 5);

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
	public static int anInt2581 = 0;

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "I")
	public static int anInt2584 = -1;

	@OriginalMember(owner = "client!fp", name = "B", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(FIFIFIII)[F")
	public static float[] method2178(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[5] = 0.0F;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[2] = local25;
		local6[3] = 0.0F;
		local6[8] = local17;
		local6[6] = -local25;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg5 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = 1.0F - local76;
		@Pc(93) float local93 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(105) float local105 = (float) Math.sqrt((double) (arg6 * arg6 + arg2 * arg2));
		if (local105 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local105 != 0.0F) {
				local78 = (float) arg6 / local105;
				local71 = (float) -arg2 / local105;
			}
			local69[5] = local71 * local93;
			local69[1] = local93 * local78;
			local69[6] = local71 * local78 * local83;
			local69[0] = local76 + local71 * local71 * local83;
			local69[8] = local83 * local78 * local78 + local76;
			local69[4] = local76;
			local69[2] = local78 * local71 * local83;
			local69[7] = -local71 * local93;
			local69[3] = local93 * -local78;
			local9[0] = local69[0] * local6[0] + local6[1] * local69[3] + local6[2] * local69[6];
			local9[1] = local69[7] * local6[2] + local6[0] * local69[1] + local69[4] * local6[1];
			local9[2] = local6[1] * local69[5] + local6[0] * local69[2] + local6[2] * local69[8];
			local9[3] = local69[6] * local6[5] + local6[3] * local69[0] + local69[3] * local6[4];
			local9[4] = local69[7] * local6[5] + local6[4] * local69[4] + local6[3] * local69[1];
			local9[6] = local6[8] * local69[6] + local69[0] * local6[6] + local69[3] * local6[7];
			local9[5] = local69[2] * local6[3] + local69[5] * local6[4] + local69[8] * local6[5];
			local9[7] = local6[8] * local69[7] + local6[7] * local69[4] + local6[6] * local69[1];
			local9[8] = local6[6] * local69[2] + local6[7] * local69[5] + local6[8] * local69[8];
		}
		local9[4] *= arg0;
		local9[2] *= arg3;
		local9[8] *= arg1;
		local9[6] *= arg1;
		local9[0] *= arg3;
		local9[7] *= arg1;
		local9[3] *= arg0;
		local9[1] *= arg3;
		local9[5] *= arg0;
		return local9;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(BI)V")
	public static void method2179() {
		Static458.aClass332_175.method7497(50);
		Static303.aClass332_126.method7497(50);
		Static96.aClass332_45.method7497(50);
		Static333.aClass332_145.method7497(50);
		Static399.aClass332_162.method7497(50);
	}

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)V")
	public static void method2180() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static301.anInt4912; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static473.anInt7969; local13++) {
				if (Static111.method1750(Static208.aClass9ArrayArrayArray3, local7, local9, true, local13)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
