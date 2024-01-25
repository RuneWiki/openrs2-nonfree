import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!ku", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString135;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLclient!dg;)V")
	public static void method8361(@OriginalArg(1) Class2_Sub2_Sub1_Sub1 arg0) {
		@Pc(19) Class3_Sub37 local19 = (Class3_Sub37) Static521.aClass25_39.method946((long) arg0.anInt7603);
		if (local19 == null) {
			return;
		}
		if (local19.aClass3_Sub14_Sub2_4 != null) {
			Static485.aClass3_Sub14_Sub1_2.method2816(local19.aClass3_Sub14_Sub2_4);
			local19.aClass3_Sub14_Sub2_4 = null;
		}
		local19.method8412();
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(IIB)Z")
	public static boolean method8366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static480.method7351(arg0, arg1) & Static202.method3383(arg0, arg1);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)I")
	public static int method8368(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static213.method3726(arg0);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
	public static void method8370() {
		if (Static129.anInt10431 == -1 || Static160.anInt3457 == -1) {
			return;
		}
		@Pc(21) int local21 = Static57.anInt1342 + ((Static329.anInt6829 - Static57.anInt1342) * Static411.anInt8066 >> 16);
		Static411.anInt8066 += local21;
		if (Static411.anInt8066 < 65535) {
			Static129.aBoolean853 = false;
			Static245.aBoolean433 = false;
		} else {
			Static411.anInt8066 = 65535;
			if (Static245.aBoolean433) {
				Static129.aBoolean853 = false;
			} else {
				Static129.aBoolean853 = true;
			}
			Static245.aBoolean433 = true;
		}
		@Pc(51) float local51 = (float) Static411.anInt8066 / 65535.0F;
		@Pc(54) float[] local54 = new float[3];
		@Pc(58) int local58 = Static299.anInt6048 * 2;
		@Pc(83) int local83;
		@Pc(115) int local115;
		@Pc(123) int local123;
		@Pc(128) int local128;
		@Pc(138) int local138;
		@Pc(156) int local156;
		for (@Pc(60) int local60 = 0; local60 < 3; local60++) {
			@Pc(71) int local71 = Static71.anIntArrayArrayArray2[Static129.anInt10431][local58][local60] * 3;
			local83 = Static71.anIntArrayArrayArray2[Static129.anInt10431][local58 + 1][local60] * 3;
			local115 = (Static71.anIntArrayArrayArray2[Static129.anInt10431][local58 + 2][local60] + Static71.anIntArrayArrayArray2[Static129.anInt10431][local58 + 2][local60] - Static71.anIntArrayArrayArray2[Static129.anInt10431][local58 + 3][local60]) * 3;
			local123 = Static71.anIntArrayArrayArray2[Static129.anInt10431][local58][local60];
			local128 = local83 - local71;
			local138 = local71 + local115 - local83 * 2;
			local156 = Static71.anIntArrayArrayArray2[Static129.anInt10431][local58 + 2][local60] + local83 - local123 - local115;
			local54[local60] = local51 * ((float) local128 + ((float) local138 + (float) local156 * local51) * local51) + (float) local123;
		}
		Static360.anInt1771 = (int) local54[1] * -1;
		Static594.anInt10391 = (int) local54[0] - Static230.anInt4667 * 512;
		Static496.anInt9269 = (int) local54[2] - Static563.anInt10006 * 512;
		@Pc(210) float[] local210 = new float[3];
		local83 = Static505.anInt9377 * 2;
		for (local115 = 0; local115 < 3; local115++) {
			local123 = Static71.anIntArrayArrayArray2[Static160.anInt3457][local83][local115] * 3;
			local128 = Static71.anIntArrayArrayArray2[Static160.anInt3457][local83 + 1][local115] * 3;
			local138 = (Static71.anIntArrayArrayArray2[Static160.anInt3457][local83 + 2][local115] + Static71.anIntArrayArrayArray2[Static160.anInt3457][local83 + 2][local115] - Static71.anIntArrayArrayArray2[Static160.anInt3457][local83 + 3][local115]) * 3;
			local156 = Static71.anIntArrayArrayArray2[Static160.anInt3457][local83][local115];
			@Pc(285) int local285 = local128 - local123;
			@Pc(293) int local293 = local123 + local138 - local128 * 2;
			@Pc(311) int local311 = Static71.anIntArrayArrayArray2[Static160.anInt3457][local83 + 2][local115] + local128 - local138 - local156;
			local210[local115] = (float) local156 + (local51 * ((float) local293 + (float) local311 * local51) + (float) local285) * local51;
		}
		@Pc(345) float local345 = local210[0] - local54[0];
		@Pc(356) float local356 = (local210[1] - local54[1]) * -1.0F;
		@Pc(364) float local364 = local210[2] - local54[2];
		@Pc(374) double local374 = Math.sqrt((double) (local364 * local364 + local345 * local345));
		Static522.anInt9554 = (int) (Math.atan2((double) local356, local374) * 2607.5945876176133D) & 0x3FFF;
		Static104.anInt2511 = (int) (-Math.atan2((double) local345, (double) local364) * 2607.5945876176133D) & 0x3FFF;
		Static235.anInt4860 = (Static411.anInt8066 * (Static71.anIntArrayArrayArray2[Static129.anInt10431][local58 + 2][3] - Static71.anIntArrayArrayArray2[Static129.anInt10431][local58][3]) >> 16) + Static71.anIntArrayArrayArray2[Static129.anInt10431][local58][3];
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBFIFIIF)[F")
	public static float[] method8373(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[2] = local25;
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		local6[0] = local17;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[6] = -local25;
		local6[1] = 0.0F;
		local6[8] = local17;
		@Pc(75) float[] local75 = new float[9];
		@Pc(77) float local77 = 1.0F;
		@Pc(79) float local79 = 0.0F;
		@Pc(84) float local84 = (float) arg5 / 32767.0F;
		@Pc(95) float local95 = -((float) Math.sqrt((double) (1.0F - local84 * local84)));
		@Pc(100) float local100 = 1.0F - local84;
		@Pc(112) float local112 = (float) Math.sqrt((double) (arg0 * arg0 + arg4 * arg4));
		if (local112 == 0.0F && local84 == 0.0F) {
			local9 = local6;
		} else {
			if (local112 != 0.0F) {
				local77 = (float) -arg4 / local112;
				local79 = (float) arg0 / local112;
			}
			local75[8] = local84 + local100 * local79 * local79;
			local75[2] = local100 * local77 * local79;
			local75[7] = -local77 * local95;
			local75[3] = -local79 * local95;
			local75[4] = local84;
			local75[6] = local100 * local79 * local77;
			local75[0] = local100 * local77 * local77 + local84;
			local75[5] = local77 * local95;
			local75[1] = local79 * local95;
			local9[0] = local75[0] * local6[0] + local6[1] * local75[3] + local6[2] * local75[6];
			local9[1] = local75[1] * local6[0] + local75[4] * local6[1] + local75[7] * local6[2];
			local9[3] = local6[5] * local75[6] + local6[3] * local75[0] + local75[3] * local6[4];
			local9[2] = local6[1] * local75[5] + local75[2] * local6[0] + local75[8] * local6[2];
			local9[4] = local6[5] * local75[7] + local75[1] * local6[3] + local75[4] * local6[4];
			local9[5] = local6[4] * local75[5] + local75[2] * local6[3] + local75[8] * local6[5];
			local9[6] = local6[8] * local75[6] + local75[3] * local6[7] + local6[6] * local75[0];
			local9[7] = local6[6] * local75[1] + local75[4] * local6[7] + local75[7] * local6[8];
			local9[8] = local75[8] * local6[8] + local75[2] * local6[6] + local6[7] * local75[5];
		}
		local9[2] *= arg6;
		local9[0] *= arg6;
		local9[8] *= arg1;
		local9[5] *= arg3;
		local9[4] *= arg3;
		local9[7] *= arg1;
		local9[6] *= arg1;
		local9[3] *= arg3;
		local9[1] *= arg6;
		return local9;
	}
}
