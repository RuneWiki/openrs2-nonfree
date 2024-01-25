import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "Lclient!eb;")
	public static Class84 aClass84_1;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "Z")
	public static boolean aBoolean575;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "[I")
	public static int[] anIntArray536;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_83 = new Class94(18, 3);

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "[Z")
	public static final boolean[] aBooleanArray20 = new boolean[100];

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!at;II)V")
	public static void method6921(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(3) int arg2) {
		Static230.anInt5090 = arg0;
		Static491.aClass24_16 = arg1;
		Static103.anInt2856 = arg2;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIFFIFII)[F")
	public static float[] method6925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(33) float local33 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[6] = -local33;
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[2] = local33;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		local6[0] = local17;
		local6[7] = 0.0F;
		@Pc(78) float[] local78 = new float[9];
		@Pc(80) float local80 = 1.0F;
		@Pc(85) float local85 = (float) arg1 / 32767.0F;
		@Pc(87) float local87 = 0.0F;
		@Pc(92) float local92 = 1.0F - local85;
		@Pc(102) float local102 = -((float) Math.sqrt((double) (1.0F - local85 * local85)));
		@Pc(113) float local113 = (float) Math.sqrt((double) (arg5 * arg5 + arg0 * arg0));
		if (local113 == 0.0F && local85 == 0.0F) {
			local9 = local6;
		} else {
			if (local113 != 0.0F) {
				local80 = (float) -arg0 / local113;
				local87 = (float) arg5 / local113;
			}
			local78[5] = local80 * local102;
			local78[2] = local80 * local87 * local92;
			local78[8] = local85 + local92 * local87 * local87;
			local78[4] = local85;
			local78[0] = local92 * local80 * local80 + local85;
			local78[6] = local92 * local87 * local80;
			local78[3] = local102 * -local87;
			local78[1] = local102 * local87;
			local78[7] = local102 * -local80;
			local9[0] = local78[0] * local6[0] + local6[1] * local78[3] + local78[6] * local6[2];
			local9[1] = local78[7] * local6[2] + local6[1] * local78[4] + local6[0] * local78[1];
			local9[2] = local6[1] * local78[5] + local6[0] * local78[2] + local6[2] * local78[8];
			local9[3] = local78[0] * local6[3] + local6[4] * local78[3] + local78[6] * local6[5];
			local9[4] = local6[5] * local78[7] + local6[3] * local78[1] + local6[4] * local78[4];
			local9[6] = local78[0] * local6[6] + local6[7] * local78[3] + local78[6] * local6[8];
			local9[5] = local6[4] * local78[5] + local78[2] * local6[3] + local6[5] * local78[8];
			local9[7] = local78[1] * local6[6] + local78[4] * local6[7] + local6[8] * local78[7];
			local9[8] = local78[5] * local6[7] + local6[6] * local78[2] + local6[8] * local78[8];
		}
		local9[7] *= arg2;
		local9[4] *= arg4;
		local9[3] *= arg4;
		local9[5] *= arg4;
		local9[2] *= arg3;
		local9[8] *= arg2;
		local9[6] *= arg2;
		local9[1] *= arg3;
		local9[0] *= arg3;
		return local9;
	}
}
