import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "Lclient!cb;")
	public static Class50 aClass50_89;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Lclient!kn;")
	public static final Class206 aClass206_16 = new Class206(4);

	@OriginalMember(owner = "client!kn", name = "h", descriptor = "Lclient!kn;")
	public static final Class206 aClass206_12 = new Class206(1);

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "Lclient!kn;")
	public static final Class206 aClass206_9 = new Class206(1);

	@OriginalMember(owner = "client!kn", name = "f", descriptor = "Lclient!kn;")
	public static final Class206 aClass206_10 = new Class206(2);

	@OriginalMember(owner = "client!kn", name = "g", descriptor = "Lclient!kn;")
	public static final Class206 aClass206_11 = new Class206(4);

	@OriginalMember(owner = "client!kn", name = "i", descriptor = "Lclient!kn;")
	public static final Class206 aClass206_13 = new Class206(2);

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Lclient!kn;")
	public static final Class206 aClass206_14 = new Class206(4);

	@OriginalMember(owner = "client!kn", name = "k", descriptor = "Lclient!kn;")
	public static final Class206 aClass206_15 = new Class206(2);

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_31 = new Class265(8);

	@OriginalMember(owner = "client!kn", name = "o", descriptor = "[I")
	public static int[] anIntArray310 = new int[1];

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
	public static int anInt5578 = 0;

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(FFIIIFZI)[F")
	public static float[] method4801(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[8] = local17;
		local6[2] = local25;
		local6[5] = 0.0F;
		local6[1] = 0.0F;
		local6[6] = -local25;
		local6[4] = 1.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg3 / 32767.0F;
		@Pc(82) float local82 = 1.0F - local78;
		@Pc(93) float local93 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4));
		if (local104 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local73 = (float) arg4 / local104;
				local71 = (float) -arg2 / local104;
			}
			local69[3] = -local73 * local93;
			local69[7] = local93 * -local71;
			local69[5] = local71 * local93;
			local69[0] = local71 * local71 * local82 + local78;
			local69[8] = local82 * local73 * local73 + local78;
			local69[1] = local73 * local93;
			local69[2] = local82 * local71 * local73;
			local69[4] = local78;
			local69[6] = local71 * local73 * local82;
			local9[0] = local6[2] * local69[6] + local6[0] * local69[0] + local6[1] * local69[3];
			local9[1] = local6[2] * local69[7] + local6[1] * local69[4] + local69[1] * local6[0];
			local9[3] = local6[3] * local69[0] + local6[4] * local69[3] + local69[6] * local6[5];
			local9[2] = local6[2] * local69[8] + local6[1] * local69[5] + local69[2] * local6[0];
			local9[4] = local6[4] * local69[4] + local6[3] * local69[1] + local6[5] * local69[7];
			local9[6] = local69[3] * local6[7] + local69[0] * local6[6] + local69[6] * local6[8];
			local9[5] = local69[5] * local6[4] + local6[3] * local69[2] + local6[5] * local69[8];
			local9[7] = local6[6] * local69[1] + local69[4] * local6[7] + local69[7] * local6[8];
			local9[8] = local6[6] * local69[2] + local69[5] * local6[7] + local69[8] * local6[8];
		}
		local9[0] *= arg1;
		local9[1] *= arg1;
		local9[4] *= arg5;
		local9[7] *= arg0;
		local9[6] *= arg0;
		local9[5] *= arg5;
		local9[3] *= arg5;
		local9[2] *= arg1;
		local9[8] *= arg0;
		return local9;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
	public static void method4802(@OriginalArg(0) int arg0) {
		@Pc(15) Class5_Sub27 local15 = (Class5_Sub27) Static298.aClass335_23.method7766((long) arg0);
		if (local15 != null) {
			local15.aClass104_Sub1_1.method2092();
			Static365.method5376(local15.aBoolean264, local15.anInt3825);
			local15.method8829();
		}
	}
}
