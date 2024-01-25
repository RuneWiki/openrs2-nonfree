import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Lclient!tca;")
	public static final Class127 aClass127_1 = Static494.method7180();

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "Z")
	public static boolean aBoolean511 = false;

	@OriginalMember(owner = "client!qi", name = "m", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_131 = new Class133(26, 5);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
	public static void method6030() {
		if (!Static68.aBoolean122) {
			return;
		}
		while (true) {
			while (Static18.anInt677 < Static527.aClass68_Sub1Array2.length) {
				@Pc(26) Class68_Sub1 local26 = Static527.aClass68_Sub1Array2[Static18.anInt677];
				if (local26 != null && local26.anInt2098 == -1) {
					if (Static280.aClass3_Sub40_1 == null) {
						Static280.aClass3_Sub40_1 = Static370.aClass251_1.method6163(local26.aString24);
					}
					@Pc(49) int local49 = Static280.aClass3_Sub40_1.anInt7397;
					if (local49 == -1) {
						return;
					}
					Static18.anInt677++;
					local26.anInt2098 = local49;
					Static280.aClass3_Sub40_1 = null;
				} else {
					Static18.anInt677++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIFIIIFF)[F")
	public static float[] method6036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[8] = local17;
		local6[0] = local17;
		local6[3] = 0.0F;
		local6[1] = 0.0F;
		local6[2] = local25;
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		local6[6] = -local25;
		local6[5] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg1 / 32767.0F;
		@Pc(82) float local82 = 1.0F - local78;
		@Pc(93) float local93 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg4 * arg4 + arg0 * arg0));
		if (local104 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local71 = (float) -arg4 / local104;
				local73 = (float) arg0 / local104;
			}
			local69[8] = local73 * local73 * local82 + local78;
			local69[6] = local73 * local71 * local82;
			local69[3] = -local73 * local93;
			local69[2] = local82 * local71 * local73;
			local69[7] = local93 * -local71;
			local69[4] = local78;
			local69[5] = local93 * local71;
			local69[1] = local73 * local93;
			local69[0] = local78 + local71 * local71 * local82;
			local9[0] = local69[0] * local6[0] + local69[3] * local6[1] + local69[6] * local6[2];
			local9[1] = local69[7] * local6[2] + local69[1] * local6[0] + local6[1] * local69[4];
			local9[3] = local69[6] * local6[5] + local69[3] * local6[4] + local6[3] * local69[0];
			local9[2] = local69[2] * local6[0] + local69[5] * local6[1] + local6[2] * local69[8];
			local9[4] = local6[5] * local69[7] + local6[3] * local69[1] + local6[4] * local69[4];
			local9[6] = local6[8] * local69[6] + local69[0] * local6[6] + local69[3] * local6[7];
			local9[5] = local6[3] * local69[2] + local6[4] * local69[5] + local6[5] * local69[8];
			local9[7] = local69[7] * local6[8] + local69[4] * local6[7] + local69[1] * local6[6];
			local9[8] = local6[7] * local69[5] + local69[2] * local6[6] + local6[8] * local69[8];
		}
		local9[6] *= arg2;
		local9[7] *= arg2;
		local9[0] *= arg6;
		local9[5] *= arg5;
		local9[3] *= arg5;
		local9[2] *= arg6;
		local9[1] *= arg6;
		local9[4] *= arg5;
		local9[8] *= arg2;
		return local9;
	}
}
