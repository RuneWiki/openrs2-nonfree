import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
	public static int anInt7506;

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "[[I")
	public static int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_103 = new Class186(9, -1);

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "F")
	public static float aFloat151 = 0.0F;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "Lclient!h;")
	public static final Class114 aClass114_147 = new Class114("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IFIBIIFF)[F")
	public static float[] method6411(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[0] = local17;
		local6[2] = local25;
		local6[1] = 0.0F;
		local6[6] = -local25;
		local6[4] = 1.0F;
		local6[8] = local17;
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		local6[5] = 0.0F;
		@Pc(75) float[] local75 = new float[9];
		@Pc(77) float local77 = 1.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = (float) arg2 / 32767.0F;
		@Pc(89) float local89 = 1.0F - local84;
		@Pc(99) float local99 = -((float) Math.sqrt((double) (1.0F - local84 * local84)));
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg4 * arg4 + arg0 * arg0));
		if (local110 == 0.0F && local84 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local77 = (float) -arg0 / local110;
				local79 = (float) arg4 / local110;
			}
			local75[0] = local77 * local77 * local89 + local84;
			local75[5] = local77 * local99;
			local75[6] = local79 * local77 * local89;
			local75[2] = local77 * local79 * local89;
			local75[4] = local84;
			local75[3] = local99 * -local79;
			local75[7] = -local77 * local99;
			local75[8] = local89 * local79 * local79 + local84;
			local75[1] = local79 * local99;
			local9[0] = local75[3] * local6[1] + local75[0] * local6[0] + local75[6] * local6[2];
			local9[1] = local75[1] * local6[0] + local6[1] * local75[4] + local6[2] * local75[7];
			local9[3] = local6[3] * local75[0] + local6[4] * local75[3] + local6[5] * local75[6];
			local9[2] = local6[2] * local75[8] + local6[1] * local75[5] + local6[0] * local75[2];
			local9[4] = local75[1] * local6[3] + local6[4] * local75[4] + local6[5] * local75[7];
			local9[5] = local75[8] * local6[5] + local75[5] * local6[4] + local75[2] * local6[3];
			local9[6] = local6[8] * local75[6] + local75[3] * local6[7] + local6[6] * local75[0];
			local9[7] = local75[7] * local6[8] + local75[4] * local6[7] + local6[6] * local75[1];
			local9[8] = local6[8] * local75[8] + local6[6] * local75[2] + local75[5] * local6[7];
		}
		local9[5] *= arg5;
		local9[1] *= arg6;
		local9[8] *= arg1;
		local9[7] *= arg1;
		local9[3] *= arg5;
		local9[0] *= arg6;
		local9[2] *= arg6;
		local9[6] *= arg1;
		local9[4] *= arg5;
		return local9;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method6412(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public static void method6413() {
		if (Static426.aClass39_7 != null) {
			Static426.aClass39_7.method5071();
		}
		if (Static404.aClass39_9 != null) {
			Static404.aClass39_9.method5071();
		}
	}
}
