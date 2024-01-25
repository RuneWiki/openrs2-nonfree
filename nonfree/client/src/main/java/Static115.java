import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
	public static int anInt2156;

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "I")
	public static int anInt2157;

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_39 = new Class337(113, -1);

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "Lclient!pl;")
	public static final Class273 aClass273_5 = new Class273(4);

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	public static void method1766() {
		for (@Pc(6) Class5_Sub20 local6 = (Class5_Sub20) Static368.aClass330_32.method7908(); local6 != null; local6 = (Class5_Sub20) Static368.aClass330_32.method7914()) {
			if (local6.aBoolean182) {
				local6.method2018();
			}
		}
		for (@Pc(34) Class5_Sub20 local34 = (Class5_Sub20) Static497.aClass330_55.method7908(); local34 != null; local34 = (Class5_Sub20) Static497.aClass330_55.method7914()) {
			if (local34.aBoolean182) {
				local34.method2018();
			}
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(FFFIIIIB)[F")
	public static float[] method1767(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
		local6[5] = 0.0F;
		local6[0] = local17;
		local6[2] = local25;
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		@Pc(70) float[] local70 = new float[9];
		@Pc(72) float local72 = 1.0F;
		@Pc(74) float local74 = 0.0F;
		@Pc(79) float local79 = (float) arg6 / 32767.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local79 * local79)));
		@Pc(102) float local102 = 1.0F - local79;
		@Pc(113) float local113 = (float) Math.sqrt((double) (arg3 * arg3 + arg5 * arg5));
		if (local113 == 0.0F && local79 == 0.0F) {
			local9 = local6;
		} else {
			if (local113 != 0.0F) {
				local74 = (float) arg3 / local113;
				local72 = (float) -arg5 / local113;
			}
			local70[7] = local89 * -local72;
			local70[3] = local89 * -local74;
			local70[1] = local89 * local74;
			local70[5] = local89 * local72;
			local70[4] = local79;
			local70[2] = local102 * local74 * local72;
			local70[8] = local74 * local74 * local102 + local79;
			local70[6] = local102 * local74 * local72;
			local70[0] = local79 + local102 * local72 * local72;
			local9[0] = local6[0] * local70[0] + local70[3] * local6[1] + local6[2] * local70[6];
			local9[1] = local70[4] * local6[1] + local70[1] * local6[0] + local70[7] * local6[2];
			local9[3] = local6[4] * local70[3] + local6[3] * local70[0] + local70[6] * local6[5];
			local9[2] = local70[2] * local6[0] + local6[1] * local70[5] + local70[8] * local6[2];
			local9[4] = local6[3] * local70[1] + local70[4] * local6[4] + local70[7] * local6[5];
			local9[6] = local6[6] * local70[0] + local6[7] * local70[3] + local6[8] * local70[6];
			local9[5] = local70[8] * local6[5] + local6[4] * local70[5] + local70[2] * local6[3];
			local9[7] = local6[6] * local70[1] + local70[4] * local6[7] + local70[7] * local6[8];
			local9[8] = local6[8] * local70[8] + local6[6] * local70[2] + local6[7] * local70[5];
		}
		local9[4] *= arg1;
		local9[8] *= arg0;
		local9[0] *= arg2;
		local9[3] *= arg1;
		local9[1] *= arg2;
		local9[6] *= arg0;
		local9[7] *= arg0;
		local9[5] *= arg1;
		local9[2] *= arg2;
		return local9;
	}
}
