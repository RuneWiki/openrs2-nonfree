import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "Lclient!ra;")
	public static Class36 aClass36_1;

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
	public static int anInt3863 = 0;

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
	public static int anInt3864 = 0;

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "[Lclient!ei;")
	public static final Class81[] aClass81Array1 = new Class81[4];

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "Z")
	public static boolean aBoolean315 = true;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZII)Lclient!md;")
	public static Class20_Sub1_Sub1 method3578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class64 local11 = Static263.aClass64ArrayArrayArray3[arg2][arg0][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class20_Sub1_Sub1 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(27) Class232 local27 = local11.aClass232_2; local27 != null; local27 = local27.aClass232_3) {
			@Pc(31) Class20_Sub1 local31 = local27.aClass20_Sub1_2;
			if (local31 instanceof Class20_Sub1_Sub1) {
				@Pc(37) Class20_Sub1_Sub1 local37 = (Class20_Sub1_Sub1) local31;
				@Pc(47) int local47 = (local37.method7808() - 1) * 64 + 60;
				@Pc(55) int local55 = local37.anInt8954 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt8949 - local47 >> 7;
				@Pc(70) int local70 = local47 + local37.anInt8954 >> 7;
				@Pc(77) int local77 = local47 + local37.anInt8949 >> 7;
				if (local55 <= arg0 && arg1 >= local63 && local70 >= arg0 && local77 >= arg1) {
					@Pc(102) int local102 = (local70 + 1 - arg0) * (-arg1 + 1 + local77);
					if (local102 > local19) {
						local17 = local37;
						local19 = local102;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BFFIIFII)[F")
	public static float[] method3580(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[3] = 0.0F;
		local6[4] = 1.0F;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[8] = local17;
		local6[7] = 0.0F;
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[6] = -local25;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg3 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(102) float local102 = 1.0F - local76;
		@Pc(114) float local114 = (float) Math.sqrt((double) (arg5 * arg5 + arg6 * arg6));
		if (local114 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local114 != 0.0F) {
				local78 = (float) arg5 / local114;
				local71 = (float) -arg6 / local114;
			}
			local69[7] = -local71 * local89;
			local69[1] = local89 * local78;
			local69[5] = local71 * local89;
			local69[2] = local71 * local78 * local102;
			local69[8] = local78 * local78 * local102 + local76;
			local69[0] = local102 * local71 * local71 + local76;
			local69[4] = local76;
			local69[6] = local102 * local78 * local71;
			local69[3] = local89 * -local78;
			local9[0] = local6[1] * local69[3] + local6[0] * local69[0] + local6[2] * local69[6];
			local9[1] = local6[2] * local69[7] + local6[1] * local69[4] + local6[0] * local69[1];
			local9[3] = local69[3] * local6[4] + local69[0] * local6[3] + local6[5] * local69[6];
			local9[2] = local69[8] * local6[2] + local69[5] * local6[1] + local6[0] * local69[2];
			local9[4] = local69[7] * local6[5] + local69[4] * local6[4] + local69[1] * local6[3];
			local9[5] = local69[2] * local6[3] + local69[5] * local6[4] + local6[5] * local69[8];
			local9[6] = local6[8] * local69[6] + local69[3] * local6[7] + local6[6] * local69[0];
			local9[7] = local69[4] * local6[7] + local6[6] * local69[1] + local69[7] * local6[8];
			local9[8] = local6[8] * local69[8] + local6[7] * local69[5] + local69[2] * local6[6];
		}
		local9[1] *= arg4;
		local9[0] *= arg4;
		local9[3] *= arg0;
		local9[5] *= arg0;
		local9[4] *= arg0;
		local9[6] *= arg1;
		local9[7] *= arg1;
		local9[2] *= arg4;
		local9[8] *= arg1;
		return local9;
	}
}
