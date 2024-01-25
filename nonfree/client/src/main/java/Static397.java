import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
	public static int anInt7135;

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_64 = new Class236(13, 8);

	@OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
	public static int anInt7131 = 1;

	@OriginalMember(owner = "client!qe", name = "K", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_111 = new Class40("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
	public static int anInt7134 = -1;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ra;Lclient!qa;IIIIZ)V")
	public static void method5785(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg5) {
			Static335.aClass25_18.method6956((Static383.anInt6994 - Static335.aClass25_18.EA()) / 2, (Static456.anInt7874 - Static335.aClass25_18.ma()) / 2);
			Static24.aClass25_9.method6956((Static383.anInt6994 - Static24.aClass25_9.EA()) / 2, 18);
		}
		@Pc(31) String local31 = "";
		if (Static525.aClass155_4 == Static300.aClass155_2) {
			local31 = Static430.aClass40_125.method1063(Static194.anInt3737);
		} else if (Static525.aClass155_4 == Static53.aClass155_1) {
			local31 = Static104.aClass40_34.method1063(Static194.anInt3737);
		}
		arg0.method7204(local31, Static383.anInt6994 / 2, -1, Static456.anInt7874 / 2 - 26, arg3);
		@Pc(71) int local71 = Static456.anInt7874 / 2 - 18;
		arg1.method7009(Static383.anInt6994 / 2 - 152, local71, 304, 34, arg2, 0);
		arg1.method7009(Static383.anInt6994 / 2 - 151, local71 - -1, 302, 32, 0, 0);
		arg1.f(Static383.anInt6994 / 2 - 150, local71 + 2, Static276.anInt5393 * 3, 30, arg4, 0);
		arg1.f(Static276.anInt5393 * 3 + Static383.anInt6994 / 2 - 150, local71 + 2, 300 - Static276.anInt5393 * 3, 30, 0, 0);
		arg0.method7204(Static531.aString84, Static383.anInt6994 / 2, -1, Static456.anInt7874 / 2 + 4, arg3);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)V")
	public static void method5786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static71.anInt4958 = arg0;
		Static492.anInt8451 = arg1;
		Static398.anInt7144 = 0;
		Static4.anInt6709 = 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIFFIZF)[F")
	public static float[] method5787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6) {
		@Pc(11) float[] local11 = new float[9];
		@Pc(14) float[] local14 = new float[9];
		@Pc(22) float local22 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(30) float local30 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local11[7] = 0.0F;
		local11[2] = local30;
		local11[0] = local22;
		local11[6] = -local30;
		local11[3] = 0.0F;
		local11[8] = local22;
		local11[5] = 0.0F;
		local11[1] = 0.0F;
		local11[4] = 1.0F;
		@Pc(74) float[] local74 = new float[9];
		@Pc(76) float local76 = 1.0F;
		@Pc(81) float local81 = (float) arg1 / 32767.0F;
		@Pc(83) float local83 = 0.0F;
		@Pc(93) float local93 = -((float) Math.sqrt((double) (1.0F - local81 * local81)));
		@Pc(98) float local98 = 1.0F - local81;
		@Pc(109) float local109 = (float) Math.sqrt((double) (arg0 * arg0 + arg5 * arg5));
		if (local109 == 0.0F && local81 == 0.0F) {
			local14 = local11;
		} else {
			if (local109 != 0.0F) {
				local76 = (float) -arg0 / local109;
				local83 = (float) arg5 / local109;
			}
			local74[4] = local81;
			local74[8] = local83 * local83 * local98 + local81;
			local74[2] = local98 * local83 * local76;
			local74[3] = local93 * -local83;
			local74[0] = local98 * local76 * local76 + local81;
			local74[5] = local76 * local93;
			local74[6] = local98 * local83 * local76;
			local74[1] = local83 * local93;
			local74[7] = local93 * -local76;
			local14[0] = local74[0] * local11[0] + local11[1] * local74[3] + local11[2] * local74[6];
			local14[1] = local74[7] * local11[2] + local74[1] * local11[0] + local74[4] * local11[1];
			local14[2] = local11[2] * local74[8] + local11[0] * local74[2] + local11[1] * local74[5];
			local14[3] = local11[5] * local74[6] + local11[4] * local74[3] + local74[0] * local11[3];
			local14[4] = local74[1] * local11[3] + local11[4] * local74[4] + local11[5] * local74[7];
			local14[6] = local74[3] * local11[7] + local11[6] * local74[0] + local74[6] * local11[8];
			local14[5] = local74[5] * local11[4] + local11[3] * local74[2] + local74[8] * local11[5];
			local14[7] = local74[4] * local11[7] + local11[6] * local74[1] + local11[8] * local74[7];
			local14[8] = local74[8] * local11[8] + local74[2] * local11[6] + local74[5] * local11[7];
		}
		local14[6] *= arg3;
		local14[0] *= arg4;
		local14[3] *= arg6;
		local14[1] *= arg4;
		local14[4] *= arg6;
		local14[7] *= arg3;
		local14[8] *= arg3;
		local14[5] *= arg6;
		local14[2] *= arg4;
		return local14;
	}
}
