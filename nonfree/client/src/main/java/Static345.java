import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	public static int anInt6211;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
	public static int anInt6206 = 0;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "F")
	public static float aFloat142 = 0.0F;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(FIFIFIIB)[F")
	public static float[] method5316(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(33) float local33 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[7] = 0.0F;
		local6[8] = local17;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		local6[6] = -local33;
		local6[2] = local33;
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		@Pc(77) float[] local77 = new float[9];
		@Pc(79) float local79 = 1.0F;
		@Pc(81) float local81 = 0.0F;
		@Pc(86) float local86 = (float) arg3 / 32767.0F;
		@Pc(96) float local96 = -((float) Math.sqrt((double) (1.0F - local86 * local86)));
		@Pc(101) float local101 = 1.0F - local86;
		@Pc(113) float local113 = (float) Math.sqrt((double) (arg1 * arg1 + arg5 * arg5));
		if (local113 == 0.0F && local86 == 0.0F) {
			local9 = local6;
		} else {
			if (local113 != 0.0F) {
				local79 = (float) -arg5 / local113;
				local81 = (float) arg1 / local113;
			}
			local77[3] = -local81 * local96;
			local77[4] = local86;
			local77[2] = local81 * local79 * local101;
			local77[5] = local79 * local96;
			local77[6] = local101 * local81 * local79;
			local77[8] = local81 * local81 * local101 + local86;
			local77[0] = local86 + local79 * local79 * local101;
			local77[7] = -local79 * local96;
			local77[1] = local81 * local96;
			local9[0] = local6[0] * local77[0] + local77[3] * local6[1] + local77[6] * local6[2];
			local9[1] = local6[2] * local77[7] + local6[0] * local77[1] + local6[1] * local77[4];
			local9[3] = local77[6] * local6[5] + local6[4] * local77[3] + local6[3] * local77[0];
			local9[2] = local77[5] * local6[1] + local77[2] * local6[0] + local6[2] * local77[8];
			local9[4] = local77[7] * local6[5] + local6[4] * local77[4] + local77[1] * local6[3];
			local9[6] = local77[6] * local6[8] + local6[6] * local77[0] + local77[3] * local6[7];
			local9[5] = local77[2] * local6[3] + local6[4] * local77[5] + local77[8] * local6[5];
			local9[7] = local77[1] * local6[6] + local6[7] * local77[4] + local77[7] * local6[8];
			local9[8] = local77[5] * local6[7] + local6[6] * local77[2] + local77[8] * local6[8];
		}
		local9[8] *= arg4;
		local9[1] *= arg2;
		local9[7] *= arg4;
		local9[2] *= arg2;
		local9[4] *= arg0;
		local9[3] *= arg0;
		local9[0] *= arg2;
		local9[6] *= arg4;
		local9[5] *= arg0;
		return local9;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public static void method5317() {
		Static256.method4332();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static579.aClass189Array4[local8].method4600();
		}
		Static510.method7081();
		Static226.method4024();
		System.gc();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFFB)I")
	public static int method5318(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local26 > local12 && local35 < local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local26 < local35) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
