import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!ifa", name = "e", descriptor = "Lclient!ee;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "I")
	public static int anInt4119;

	@OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
	public static int anInt4121;

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
	public static int anInt4111 = 0;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3336(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static301.method4223("\n", "%0a", arg0));
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)Z")
	public static boolean method3337() {
		@Pc(10) Class1_Sub22 local10 = (Class1_Sub22) Static520.aClass353_61.method7677();
		if (local10 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < local10.anInt3251; local16++) {
			if (local10.aClass260Array2[local16] != null && local10.aClass260Array2[local16].anInt7041 == 0) {
				return false;
			}
			if (local10.aClass260Array1[local16] != null && local10.aClass260Array1[local16].anInt7041 == 0) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(FIIFIIFI)[F")
	public static float[] method3339(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[2] = local25;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[8] = local17;
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[4] = 1.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg2 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(95) float local95 = 1.0F - local77;
		@Pc(106) float local106 = (float) Math.sqrt((double) (arg1 * arg1 + arg4 * arg4));
		if (local106 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local106 != 0.0F) {
				local72 = (float) -arg1 / local106;
				local79 = (float) arg4 / local106;
			}
			local70[7] = -local72 * local90;
			local70[1] = local79 * local90;
			local70[0] = local77 + local95 * local72 * local72;
			local70[5] = local72 * local90;
			local70[4] = local77;
			local70[2] = local79 * local72 * local95;
			local70[3] = -local79 * local90;
			local70[6] = local79 * local72 * local95;
			local70[8] = local95 * local79 * local79 + local77;
			local9[0] = local70[6] * local6[2] + local70[3] * local6[1] + local70[0] * local6[0];
			local9[1] = local70[7] * local6[2] + local6[1] * local70[4] + local70[1] * local6[0];
			local9[3] = local70[6] * local6[5] + local70[0] * local6[3] + local6[4] * local70[3];
			local9[2] = local6[2] * local70[8] + local70[2] * local6[0] + local70[5] * local6[1];
			local9[4] = local6[3] * local70[1] + local70[4] * local6[4] + local70[7] * local6[5];
			local9[6] = local6[6] * local70[0] + local70[3] * local6[7] + local70[6] * local6[8];
			local9[5] = local70[5] * local6[4] + local6[3] * local70[2] + local6[5] * local70[8];
			local9[7] = local70[7] * local6[8] + local6[7] * local70[4] + local70[1] * local6[6];
			local9[8] = local6[8] * local70[8] + local6[6] * local70[2] + local6[7] * local70[5];
		}
		local9[0] *= arg3;
		local9[3] *= arg5;
		local9[1] *= arg3;
		local9[4] *= arg5;
		local9[5] *= arg5;
		local9[6] *= arg0;
		local9[7] *= arg0;
		local9[8] *= arg0;
		local9[2] *= arg3;
		return local9;
	}
}
