import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
	public static int anInt1505 = 0;

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(FIIFIBIF)[F")
	public static float[] method1337(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[5] = 0.0F;
		local6[7] = 0.0F;
		local6[2] = local25;
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[4] = 1.0F;
		local6[8] = local17;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg1 / 32767.0F;
		@Pc(87) float local87 = 1.0F - local83;
		@Pc(97) float local97 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg5 * arg5 + arg2 * arg2));
		if (local109 == 0.0F && local83 == 0.0F) {
			local9 = local6;
		} else {
			if (local109 != 0.0F) {
				local78 = (float) arg5 / local109;
				local76 = (float) -arg2 / local109;
			}
			local74[4] = local83;
			local74[5] = local97 * local76;
			local74[6] = local78 * local76 * local87;
			local74[2] = local87 * local76 * local78;
			local74[3] = -local78 * local97;
			local74[1] = local78 * local97;
			local74[8] = local83 + local87 * local78 * local78;
			local74[0] = local87 * local76 * local76 + local83;
			local74[7] = local97 * -local76;
			local9[0] = local74[3] * local6[1] + local74[0] * local6[0] + local6[2] * local74[6];
			local9[1] = local74[4] * local6[1] + local74[1] * local6[0] + local74[7] * local6[2];
			local9[3] = local6[4] * local74[3] + local74[0] * local6[3] + local6[5] * local74[6];
			local9[2] = local74[8] * local6[2] + local6[1] * local74[5] + local6[0] * local74[2];
			local9[4] = local6[3] * local74[1] + local6[4] * local74[4] + local74[7] * local6[5];
			local9[6] = local74[0] * local6[6] + local6[7] * local74[3] + local6[8] * local74[6];
			local9[5] = local6[3] * local74[2] + local6[4] * local74[5] + local6[5] * local74[8];
			local9[7] = local74[7] * local6[8] + local6[6] * local74[1] + local6[7] * local74[4];
			local9[8] = local74[5] * local6[7] + local6[6] * local74[2] + local6[8] * local74[8];
		}
		local9[5] *= arg6;
		local9[7] *= arg3;
		local9[0] *= arg0;
		local9[1] *= arg0;
		local9[6] *= arg3;
		local9[3] *= arg6;
		local9[4] *= arg6;
		local9[2] *= arg0;
		local9[8] *= arg3;
		return local9;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
	public static void method1338(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static116.aHashtable2.put(arg1, arg0);
	}
}
