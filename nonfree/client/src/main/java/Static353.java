import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Lclient!jo;")
	public static final Class161 aClass161_7 = new Class161("", 10);

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_102 = new Class287(80, 6);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method5077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static160.method2927(arg0)) {
			if (Static516.aClass251ArrayArray2[arg0] == null) {
				Static122.method2358(arg7, arg2, arg4, arg5, arg1, arg6, Static449.aClass251ArrayArray1[arg0], -1, arg3);
			} else {
				Static122.method2358(arg7, arg2, arg4, arg5, arg1, arg6, Static516.aClass251ArrayArray2[arg0], -1, arg3);
			}
		} else if (arg2 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static544.aBooleanArray32[local20] = true;
			}
		} else {
			Static544.aBooleanArray32[arg2] = true;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIFIFFII)[F")
	public static float[] method5081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[2] = local25;
		local6[7] = 0.0F;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[6] = -local25;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		@Pc(82) float[] local82 = new float[9];
		@Pc(84) float local84 = 1.0F;
		@Pc(86) float local86 = 0.0F;
		@Pc(91) float local91 = (float) arg3 / 32767.0F;
		@Pc(102) float local102 = -((float) Math.sqrt((double) (1.0F - local91 * local91)));
		@Pc(107) float local107 = 1.0F - local91;
		@Pc(119) float local119 = (float) Math.sqrt((double) (arg1 * arg1 + arg6 * arg6));
		if (local119 == 0.0F && local91 == 0.0F) {
			local9 = local6;
		} else {
			if (local119 != 0.0F) {
				local84 = (float) -arg6 / local119;
				local86 = (float) arg1 / local119;
			}
			local82[0] = local84 * local84 * local107 + local91;
			local82[2] = local84 * local86 * local107;
			local82[7] = local102 * -local84;
			local82[6] = local107 * local86 * local84;
			local82[4] = local91;
			local82[5] = local102 * local84;
			local82[1] = local102 * local86;
			local82[3] = local102 * -local86;
			local82[8] = local86 * local86 * local107 + local91;
			local9[0] = local82[6] * local6[2] + local82[3] * local6[1] + local82[0] * local6[0];
			local9[1] = local82[4] * local6[1] + local6[0] * local82[1] + local6[2] * local82[7];
			local9[2] = local82[8] * local6[2] + local6[1] * local82[5] + local6[0] * local82[2];
			local9[3] = local82[6] * local6[5] + local6[4] * local82[3] + local82[0] * local6[3];
			local9[4] = local6[5] * local82[7] + local82[1] * local6[3] + local6[4] * local82[4];
			local9[5] = local6[5] * local82[8] + local82[2] * local6[3] + local6[4] * local82[5];
			local9[6] = local6[6] * local82[0] + local82[3] * local6[7] + local82[6] * local6[8];
			local9[7] = local82[4] * local6[7] + local82[1] * local6[6] + local82[7] * local6[8];
			local9[8] = local6[8] * local82[8] + local82[5] * local6[7] + local82[2] * local6[6];
		}
		local9[7] *= arg4;
		local9[1] *= arg5;
		local9[6] *= arg4;
		local9[8] *= arg4;
		local9[0] *= arg5;
		local9[4] *= arg2;
		local9[5] *= arg2;
		local9[2] *= arg5;
		local9[3] *= arg2;
		return local9;
	}
}
