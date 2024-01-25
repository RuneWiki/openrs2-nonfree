import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "Lclient!ha;")
	public static Class100 aClass100_6;

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "J")
	public static long aLong140;

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "Lclient!pe;")
	public static final Class282 aClass282_25 = new Class282(1, 2, 2, 0);

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(FFIIFIII)[F")
	public static float[] method4458(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(27) float local27 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(35) float local35 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[7] = 0.0F;
		local6[8] = local27;
		local6[5] = 0.0F;
		local6[4] = 1.0F;
		local6[0] = local27;
		local6[2] = local35;
		local6[6] = -local35;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		@Pc(80) float[] local80 = new float[9];
		@Pc(82) float local82 = 1.0F;
		@Pc(84) float local84 = 0.0F;
		@Pc(89) float local89 = (float) arg6 / 32767.0F;
		@Pc(100) float local100 = -((float) Math.sqrt((double) (1.0F - local89 * local89)));
		@Pc(104) float local104 = 1.0F - local89;
		@Pc(116) float local116 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3));
		if (local116 == 0.0F && local89 == 0.0F) {
			local9 = local6;
		} else {
			if (local116 != 0.0F) {
				local84 = (float) arg5 / local116;
				local82 = (float) -arg3 / local116;
			}
			local80[6] = local84 * local82 * local104;
			local80[8] = local89 + local104 * local84 * local84;
			local80[0] = local89 + local82 * local82 * local104;
			local80[7] = local100 * -local82;
			local80[5] = local82 * local100;
			local80[1] = local84 * local100;
			local80[2] = local104 * local82 * local84;
			local80[3] = local100 * -local84;
			local80[4] = local89;
			local9[0] = local6[2] * local80[6] + local80[0] * local6[0] + local6[1] * local80[3];
			local9[1] = local80[4] * local6[1] + local6[0] * local80[1] + local6[2] * local80[7];
			local9[3] = local6[3] * local80[0] + local80[3] * local6[4] + local6[5] * local80[6];
			local9[2] = local80[8] * local6[2] + local80[2] * local6[0] + local6[1] * local80[5];
			local9[4] = local80[4] * local6[4] + local80[1] * local6[3] + local6[5] * local80[7];
			local9[6] = local80[6] * local6[8] + local80[0] * local6[6] + local6[7] * local80[3];
			local9[5] = local6[4] * local80[5] + local80[2] * local6[3] + local6[5] * local80[8];
			local9[7] = local80[7] * local6[8] + local80[1] * local6[6] + local80[4] * local6[7];
			local9[8] = local80[8] * local6[8] + local80[5] * local6[7] + local6[6] * local80[2];
		}
		local9[2] *= arg1;
		local9[8] *= arg0;
		local9[6] *= arg0;
		local9[0] *= arg1;
		local9[1] *= arg1;
		local9[3] *= arg4;
		local9[5] *= arg4;
		local9[7] *= arg0;
		local9[4] *= arg4;
		return local9;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)I")
	public static int method4459(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBI)Z")
	public static boolean method4462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static407.method5958(arg1, arg0) & (Static368.method5497(arg1, arg0) | (arg0 & 0x2000) != 0 | Static536.method7358(arg1, arg0));
	}
}
