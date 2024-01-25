import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "Lclient!nl;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "Lclient!ha;")
	public static Class35 aClass35_26;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
	public static int anInt5649 = -1;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(III)Z")
	public static boolean method4813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(III)Z")
	public static boolean method4814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
	public static void method4815() {
		for (@Pc(18) Class2_Sub34 local18 = (Class2_Sub34) Static465.aClass249_64.method6527(); local18 != null; local18 = (Class2_Sub34) Static465.aClass249_64.method6525()) {
			if (local18.anInt5717 == -1) {
				local18.anInt5725 = 0;
				if (local18.anInt5719 >= 0 && local18.anInt5726 >= 0 && local18.anInt5719 < Static363.anInt1158 && local18.anInt5726 < Static511.anInt8889) {
					Static256.method4014(local18);
				}
			} else {
				local18.method7802();
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIFFIIFB)[F")
	public static float[] method4817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[7] = 0.0F;
		local6[8] = local17;
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[6] = -local25;
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		@Pc(78) float[] local78 = new float[9];
		@Pc(80) float local80 = 1.0F;
		@Pc(85) float local85 = (float) arg0 / 32767.0F;
		@Pc(87) float local87 = 0.0F;
		@Pc(97) float local97 = -((float) Math.sqrt((double) (1.0F - local85 * local85)));
		@Pc(101) float local101 = 1.0F - local85;
		@Pc(112) float local112 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4));
		if (local112 == 0.0F && local85 == 0.0F) {
			local9 = local6;
		} else {
			if (local112 != 0.0F) {
				local80 = (float) -arg5 / local112;
				local87 = (float) arg4 / local112;
			}
			local78[3] = local97 * -local87;
			local78[7] = local97 * -local80;
			local78[0] = local85 + local101 * local80 * local80;
			local78[5] = local80 * local97;
			local78[4] = local85;
			local78[2] = local87 * local80 * local101;
			local78[1] = local87 * local97;
			local78[6] = local101 * local80 * local87;
			local78[8] = local85 + local101 * local87 * local87;
			local9[0] = local6[1] * local78[3] + local78[0] * local6[0] + local78[6] * local6[2];
			local9[1] = local78[1] * local6[0] + local6[1] * local78[4] + local78[7] * local6[2];
			local9[3] = local78[6] * local6[5] + local78[0] * local6[3] + local6[4] * local78[3];
			local9[2] = local6[1] * local78[5] + local78[2] * local6[0] + local78[8] * local6[2];
			local9[4] = local6[4] * local78[4] + local78[1] * local6[3] + local6[5] * local78[7];
			local9[5] = local6[4] * local78[5] + local78[2] * local6[3] + local78[8] * local6[5];
			local9[6] = local6[7] * local78[3] + local78[0] * local6[6] + local6[8] * local78[6];
			local9[7] = local78[1] * local6[6] + local6[7] * local78[4] + local6[8] * local78[7];
			local9[8] = local6[6] * local78[2] + local78[5] * local6[7] + local78[8] * local6[8];
		}
		local9[8] *= arg2;
		local9[3] *= arg3;
		local9[1] *= arg6;
		local9[0] *= arg6;
		local9[7] *= arg2;
		local9[2] *= arg6;
		local9[4] *= arg3;
		local9[6] *= arg2;
		local9[5] *= arg3;
		return local9;
	}
}
