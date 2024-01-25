import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!or", name = "i", descriptor = "Lclient!vg;")
	public static final Class340 aClass340_5 = new Class340();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!fa;Lclient!r;IIII)V")
	public static void method6101(@OriginalArg(1) Interface11 arg0, @OriginalArg(2) Class44 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static312.anInt6205 < 100) {
			Static488.method7239(arg1, arg0);
		}
		arg1.da(arg2, arg4, arg3 + arg2, arg4 - -arg5);
		@Pc(33) int local33;
		@Pc(44) int local44;
		if (Static312.anInt6205 < 100) {
			local33 = arg2 + arg3 / 2;
			local44 = arg4 + arg5 / 2 - 18 - 20;
			arg1.J(arg2, arg4, arg3, arg5, -16777216, 0);
			arg1.method4996(local33 - 152, local44, 304, 34, Static128.aColorArray2[Static179.anInt3619].getRGB(), 0);
			arg1.J(local33 - 150, local44 + 2, Static312.anInt6205 * 3, 30, Static188.aColorArray3[Static179.anInt3619].getRGB(), 0);
			Static552.aClass58_14.method8167(local33, local44 + 20, Static590.aClass364_22.method8334(Static154.anInt3181), Static46.aColorArray1[Static179.anInt3619].getRGB(), -1);
			return;
		}
		@Pc(107) int local107 = Static529.anInt9422 - (int) ((float) arg3 / Static455.aFloat121);
		local33 = (int) ((float) arg5 / Static455.aFloat121) + Static480.anInt10076;
		local44 = Static529.anInt9422 + (int) ((float) arg3 / Static455.aFloat121);
		Static34.anInt506 = Static480.anInt10076 - (int) ((float) arg5 / Static455.aFloat121);
		Static3.anInt140 = (int) ((float) (arg3 * 2) / Static455.aFloat121);
		@Pc(150) int local150 = Static480.anInt10076 - (int) ((float) arg5 / Static455.aFloat121);
		Static85.anInt1574 = (int) ((float) (arg5 * 2) / Static455.aFloat121);
		Static47.anInt646 = Static529.anInt9422 - (int) ((float) arg3 / Static455.aFloat121);
		Static455.method3069(local107 + Static455.anInt3448, Static455.anInt3450 + local33, local44 + Static455.anInt3448, Static455.anInt3450 + local150, arg2, arg4, arg2 + arg3, arg4 - -arg5 + 1);
		Static455.method3075(arg1);
		@Pc(197) Class244 local197 = Static455.method3076(arg1);
		Static44.method527(arg1, local197);
		if (Static77.anInt1283 > 0) {
			Static425.anInt7984--;
			if (Static425.anInt7984 == 0) {
				Static425.anInt7984 = 20;
				Static77.anInt1283--;
			}
		}
		if (!Static397.aBoolean521) {
			return;
		}
		@Pc(229) int local229 = arg2 + arg3 - 5;
		@Pc(235) int local235 = arg5 + arg4 - 8;
		Static272.aClass58_5.method8162(local229, 16776960, local235, -1, "Fps:" + Static382.anInt7358);
		@Pc(250) int local250 = local235 - 15;
		@Pc(252) Runtime local252 = Runtime.getRuntime();
		@Pc(262) int local262 = (int) ((local252.totalMemory() - local252.freeMemory()) / 1024L);
		@Pc(264) int local264 = 16776960;
		if (local262 > 65536) {
			local264 = 16711680;
		}
		Static272.aClass58_5.method8162(local229, local264, local250, -1, "Mem:" + local262 + "k");
		local235 = local250 - 15;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)I")
	public static int method6102(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!un;)V")
	public static void method6103(@OriginalArg(1) Class4_Sub11 arg0) {
		for (@Pc(15) int local15 = 0; local15 < Static401.anInt7652; local15++) {
			@Pc(21) int local21 = arg0.method4942();
			@Pc(25) int local25 = arg0.method4936();
			if (local25 == 65535) {
				local25 = -1;
			}
			if (Static539.aClass158_Sub1Array2[local21] != null) {
				Static539.aClass158_Sub1Array2[local21].anInt4058 = local25;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IFIIFIFI)[F")
	public static float[] method6104(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[7] = 0.0F;
		local6[2] = local25;
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		local6[1] = 0.0F;
		local6[3] = 0.0F;
		local6[0] = local17;
		local6[6] = -local25;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg5 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(88) float local88 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(93) float local93 = 1.0F - local76;
		@Pc(115) float local115 = (float) Math.sqrt((double) (arg2 * arg2 + arg0 * arg0));
		if (local115 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local115 != 0.0F) {
				local78 = (float) arg0 / local115;
				local71 = (float) -arg2 / local115;
			}
			local69[6] = local78 * local71 * local93;
			local69[3] = -local78 * local88;
			local69[7] = local88 * -local71;
			local69[8] = local78 * local78 * local93 + local76;
			local69[4] = local76;
			local69[1] = local88 * local78;
			local69[2] = local71 * local78 * local93;
			local69[0] = local71 * local71 * local93 + local76;
			local69[5] = local71 * local88;
			local9[0] = local6[2] * local69[6] + local69[0] * local6[0] + local69[3] * local6[1];
			local9[1] = local6[1] * local69[4] + local6[0] * local69[1] + local6[2] * local69[7];
			local9[3] = local69[3] * local6[4] + local69[0] * local6[3] + local69[6] * local6[5];
			local9[2] = local69[5] * local6[1] + local6[0] * local69[2] + local6[2] * local69[8];
			local9[4] = local6[3] * local69[1] + local6[4] * local69[4] + local6[5] * local69[7];
			local9[5] = local6[4] * local69[5] + local69[2] * local6[3] + local6[5] * local69[8];
			local9[6] = local6[6] * local69[0] + local6[7] * local69[3] + local6[8] * local69[6];
			local9[7] = local69[7] * local6[8] + local6[7] * local69[4] + local6[6] * local69[1];
			local9[8] = local6[7] * local69[5] + local6[6] * local69[2] + local69[8] * local6[8];
		}
		local9[5] *= arg1;
		local9[7] *= arg6;
		local9[3] *= arg1;
		local9[0] *= arg4;
		local9[2] *= arg4;
		local9[8] *= arg6;
		local9[6] *= arg6;
		local9[1] *= arg4;
		local9[4] *= arg1;
		return local9;
	}
}
