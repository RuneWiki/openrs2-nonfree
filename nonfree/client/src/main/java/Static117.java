import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Lclient!fc;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
	public static int anInt2222 = 999999;

	@OriginalMember(owner = "client!ft", name = "p", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_116 = new Class12(41, -2);

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIFIFFII)[F")
	public static float[] method1810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[8] = local17;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[2] = local25;
		local6[1] = 0.0F;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[6] = -local25;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg0 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(90) float local90 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(95) float local95 = 1.0F - local77;
		@Pc(107) float local107 = (float) Math.sqrt((double) (arg6 * arg6 + arg1 * arg1));
		if (local107 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local107 != 0.0F) {
				local72 = (float) -arg1 / local107;
				local79 = (float) arg6 / local107;
			}
			local70[2] = local95 * local72 * local79;
			local70[4] = local77;
			local70[3] = -local79 * local90;
			local70[7] = -local72 * local90;
			local70[8] = local77 + local79 * local79 * local95;
			local70[1] = local79 * local90;
			local70[6] = local79 * local72 * local95;
			local70[0] = local72 * local72 * local95 + local77;
			local70[5] = local90 * local72;
			local9[0] = local6[2] * local70[6] + local70[3] * local6[1] + local6[0] * local70[0];
			local9[1] = local70[4] * local6[1] + local70[1] * local6[0] + local6[2] * local70[7];
			local9[2] = local70[8] * local6[2] + local6[0] * local70[2] + local6[1] * local70[5];
			local9[3] = local70[6] * local6[5] + local6[4] * local70[3] + local70[0] * local6[3];
			local9[4] = local70[7] * local6[5] + local70[1] * local6[3] + local70[4] * local6[4];
			local9[5] = local70[8] * local6[5] + local70[5] * local6[4] + local70[2] * local6[3];
			local9[6] = local70[0] * local6[6] + local70[3] * local6[7] + local6[8] * local70[6];
			local9[7] = local70[1] * local6[6] + local70[4] * local6[7] + local6[8] * local70[7];
			local9[8] = local70[2] * local6[6] + local6[7] * local70[5] + local70[8] * local6[8];
		}
		local9[8] *= arg5;
		local9[7] *= arg5;
		local9[4] *= arg4;
		local9[5] *= arg4;
		local9[0] *= arg2;
		local9[3] *= arg4;
		local9[2] *= arg2;
		local9[6] *= arg5;
		local9[1] *= arg2;
		return local9;
	}
}
