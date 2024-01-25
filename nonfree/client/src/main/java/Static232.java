import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "Z")
	public static boolean aBoolean310 = false;

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
	public static int anInt4308 = 0;

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "[I")
	public static final int[] anIntArray219 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(FFBIIIIF)[F")
	public static float[] method3445(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[6] = -local25;
		local6[8] = local17;
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[5] = 0.0F;
		local6[0] = local17;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(77) float local77 = (float) arg3 / 32767.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = 1.0F - local77;
		@Pc(95) float local95 = -((float) Math.sqrt((double) (1.0F - local77 * local77)));
		@Pc(107) float local107 = (float) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4));
		if (local107 == 0.0F && local77 == 0.0F) {
			local9 = local6;
		} else {
			if (local107 != 0.0F) {
				local72 = (float) -arg4 / local107;
				local79 = (float) arg2 / local107;
			}
			local70[6] = local72 * local79 * local84;
			local70[0] = local72 * local72 * local84 + local77;
			local70[7] = -local72 * local95;
			local70[2] = local84 * local72 * local79;
			local70[1] = local79 * local95;
			local70[8] = local79 * local79 * local84 + local77;
			local70[5] = local72 * local95;
			local70[3] = -local79 * local95;
			local70[4] = local77;
			local9[0] = local70[6] * local6[2] + local70[3] * local6[1] + local6[0] * local70[0];
			local9[1] = local6[1] * local70[4] + local6[0] * local70[1] + local6[2] * local70[7];
			local9[3] = local6[4] * local70[3] + local6[3] * local70[0] + local70[6] * local6[5];
			local9[2] = local6[2] * local70[8] + local6[1] * local70[5] + local70[2] * local6[0];
			local9[4] = local70[7] * local6[5] + local70[1] * local6[3] + local70[4] * local6[4];
			local9[5] = local70[2] * local6[3] + local6[4] * local70[5] + local6[5] * local70[8];
			local9[6] = local70[6] * local6[8] + local70[3] * local6[7] + local6[6] * local70[0];
			local9[7] = local6[6] * local70[1] + local6[7] * local70[4] + local6[8] * local70[7];
			local9[8] = local6[8] * local70[8] + local70[5] * local6[7] + local6[6] * local70[2];
		}
		local9[5] *= arg6;
		local9[8] *= arg1;
		local9[2] *= arg0;
		local9[4] *= arg6;
		local9[6] *= arg1;
		local9[0] *= arg0;
		local9[1] *= arg0;
		local9[7] *= arg1;
		local9[3] *= arg6;
		return local9;
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IBIIIII)V")
	public static void method3447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg3 - arg1;
		@Pc(14) int local14 = arg4 + arg1;
		for (@Pc(16) int local16 = arg4; local16 < local14; local16++) {
			Static329.method4871(arg2, arg0, Static280.anIntArrayArray25[local16], arg5);
		}
		for (@Pc(36) int local36 = arg3; local36 > local10; local36--) {
			Static329.method4871(arg2, arg0, Static280.anIntArrayArray25[local36], arg5);
		}
		@Pc(58) int local58 = arg1 + arg2;
		@Pc(62) int local62 = arg0 - arg1;
		for (@Pc(64) int local64 = local14; local64 <= local10; local64++) {
			@Pc(75) int[] local75 = Static280.anIntArrayArray25[local64];
			Static329.method4871(arg2, local58, local75, arg5);
			Static329.method4871(local62, arg0, local75, arg5);
		}
	}
}
