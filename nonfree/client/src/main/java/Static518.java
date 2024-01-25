import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!uca", name = "c", descriptor = "[I")
	public static int[] anIntArray629;

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
	public static int anInt8889;

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "F")
	public static float aFloat183;

	@OriginalMember(owner = "client!uca", name = "j", descriptor = "Lclient!pb;")
	public static Class242 aClass242_2;

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_62 = new Class330(64);

	@OriginalMember(owner = "client!uca", name = "q", descriptor = "Lclient!vh;")
	public static final Class330 aClass330_63 = new Class330(8);

	@OriginalMember(owner = "client!uca", name = "r", descriptor = "Lclient!laa;")
	public static final Class179 aClass179_14 = new Class179(2, 4, 4, 0);

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(IIIIFFIF)[F")
	public static float[] method7075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg5 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg5 * 0.024543693F));
		local6[4] = 1.0F;
		local6[6] = -local25;
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[7] = 0.0F;
		local6[1] = 0.0F;
		local6[0] = local17;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg1 / 32767.0F;
		@Pc(82) float local82 = 1.0F - local78;
		@Pc(92) float local92 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(103) float local103 = (float) Math.sqrt((double) (arg2 * arg2 + arg0 * arg0));
		if (local103 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local103 != 0.0F) {
				local71 = (float) -arg2 / local103;
				local73 = (float) arg0 / local103;
			}
			local69[1] = local92 * local73;
			local69[2] = local73 * local71 * local82;
			local69[8] = local82 * local73 * local73 + local78;
			local69[4] = local78;
			local69[7] = local92 * -local71;
			local69[6] = local82 * local73 * local71;
			local69[0] = local78 + local82 * local71 * local71;
			local69[3] = local92 * -local73;
			local69[5] = local71 * local92;
			local9[0] = local6[2] * local69[6] + local69[3] * local6[1] + local69[0] * local6[0];
			local9[1] = local6[2] * local69[7] + local6[1] * local69[4] + local69[1] * local6[0];
			local9[3] = local69[6] * local6[5] + local69[0] * local6[3] + local6[4] * local69[3];
			local9[2] = local6[0] * local69[2] + local6[1] * local69[5] + local69[8] * local6[2];
			local9[4] = local6[3] * local69[1] + local69[4] * local6[4] + local6[5] * local69[7];
			local9[5] = local69[8] * local6[5] + local6[3] * local69[2] + local69[5] * local6[4];
			local9[6] = local6[7] * local69[3] + local69[0] * local6[6] + local69[6] * local6[8];
			local9[7] = local6[8] * local69[7] + local69[1] * local6[6] + local6[7] * local69[4];
			local9[8] = local6[8] * local69[8] + local6[6] * local69[2] + local69[5] * local6[7];
		}
		local9[7] *= arg4;
		local9[6] *= arg4;
		local9[5] *= arg6;
		local9[4] *= arg6;
		local9[8] *= arg4;
		local9[1] *= arg3;
		local9[3] *= arg6;
		local9[0] *= arg3;
		local9[2] *= arg3;
		return local9;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(Lclient!oa;)V")
	public static void method7076(@OriginalArg(0) Class90 arg0) {
		for (@Pc(1) int local1 = Static251.anInt4609; local1 < Static431.anInt7712; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static547.anInt9363; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static20.anInt358; local7++) {
					@Pc(16) Class133 local16 = Static113.aClass133ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class15_Sub1 local21 = local16.aClass15_Sub1_2;
						@Pc(24) Class15_Sub1 local24 = local16.aClass15_Sub1_1;
						if (local21 != null && local21.method7162()) {
							Static314.method4911(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7162()) {
								Static314.method4911(arg0, local24, local1, local4, local7, 1, 1);
								local24.method7163(0, 0, local21, 0, false, arg0);
								local24.method7165();
							}
							local21.method7165();
						}
						for (@Pc(70) Class315 local70 = local16.aClass315_1; local70 != null; local70 = local70.aClass315_3) {
							@Pc(74) Class15_Sub2 local74 = local70.aClass15_Sub2_2;
							if (local74 != null && local74.method7162()) {
								Static314.method4911(arg0, local74, local1, local4, local7, local74.aShort115 + 1 - local74.aShort116, local74.aShort117 - local74.aShort114 + 1);
								local74.method7165();
							}
						}
						@Pc(111) Class15_Sub3 local111 = local16.aClass15_Sub3_2;
						if (local111 != null && local111.method7162()) {
							Static526.method7224(arg0, local111, local1, local4, local7);
							local111.method7165();
						}
					}
				}
			}
		}
	}
}
