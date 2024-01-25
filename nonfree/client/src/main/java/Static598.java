import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
	public static void method8286(@OriginalArg(0) int arg0) {
		Static510.method7302();
		@Pc(11) int local11 = Static259.aClass156_2.method4847(arg0).anInt6260;
		if (local11 == 0) {
			return;
		}
		@Pc(19) int local19 = Static140.aClass157_1.anIntArray257[arg0];
		if (local11 == 6) {
			Static248.anInt5406 = local19;
		}
		if (local11 == 5) {
			Static358.anInt6951 = local19;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIFFIIFI)[F")
	public static float[] method8287(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
		local6[4] = 1.0F;
		local6[1] = 0.0F;
		local6[0] = local17;
		local6[8] = local17;
		local6[5] = 0.0F;
		local6[2] = local25;
		local6[6] = -local25;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg4 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(89) float local89 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(93) float local93 = 1.0F - local76;
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg3 * arg3 + arg6 * arg6));
		if (local104 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local71 = (float) -arg3 / local104;
				local78 = (float) arg6 / local104;
			}
			local69[7] = local89 * -local71;
			local69[3] = local89 * -local78;
			local69[8] = local76 + local93 * local78 * local78;
			local69[0] = local76 + local71 * local71 * local93;
			local69[1] = local78 * local89;
			local69[6] = local93 * local71 * local78;
			local69[2] = local93 * local71 * local78;
			local69[5] = local89 * local71;
			local69[4] = local76;
			local9[0] = local6[1] * local69[3] + local6[0] * local69[0] + local69[6] * local6[2];
			local9[1] = local69[7] * local6[2] + local69[1] * local6[0] + local69[4] * local6[1];
			local9[2] = local6[2] * local69[8] + local69[2] * local6[0] + local69[5] * local6[1];
			local9[3] = local69[6] * local6[5] + local6[4] * local69[3] + local6[3] * local69[0];
			local9[4] = local6[5] * local69[7] + local6[4] * local69[4] + local6[3] * local69[1];
			local9[6] = local6[8] * local69[6] + local69[3] * local6[7] + local6[6] * local69[0];
			local9[5] = local6[5] * local69[8] + local69[2] * local6[3] + local6[4] * local69[5];
			local9[7] = local6[6] * local69[1] + local6[7] * local69[4] + local6[8] * local69[7];
			local9[8] = local69[8] * local6[8] + local69[2] * local6[6] + local69[5] * local6[7];
		}
		local9[5] *= arg2;
		local9[6] *= arg5;
		local9[1] *= arg1;
		local9[3] *= arg2;
		local9[7] *= arg5;
		local9[2] *= arg1;
		local9[0] *= arg1;
		local9[4] *= arg2;
		local9[8] *= arg5;
		return local9;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLclient!gg;ILclient!gaa;)V")
	public static void method8288(@OriginalArg(1) Class9_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class113 arg2) {
		if (Static530.anInt9223 >= 50 || (arg2 == null || arg2.anIntArrayArray16 == null || arg2.anIntArrayArray16.length <= arg1 || arg2.anIntArrayArray16[arg1] == null)) {
			return;
		}
		@Pc(36) int local36 = arg2.anIntArrayArray16[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(50) int local50 = local36 & 0x1F;
		@Pc(69) int local69;
		if (arg2.anIntArrayArray16[arg1].length > 1) {
			local69 = (int) (Math.random() * (double) arg2.anIntArrayArray16[arg1].length);
			if (local69 > 0) {
				local40 = arg2.anIntArrayArray16[arg1][local69];
			}
		}
		local69 = 256;
		if (arg2.anIntArray175 != null && arg2.anIntArray177 != null) {
			local69 = arg2.anIntArray175[arg1] + (int) (Math.random() * (double) (arg2.anIntArray177[arg1] - arg2.anIntArray175[arg1]));
		}
		@Pc(118) int local118 = arg2.anIntArray174 == null ? 255 : arg2.anIntArray174[arg1];
		if (local50 == 0) {
			if (arg0 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1) {
				if (!arg2.aBoolean307) {
					Static523.method7452(local69, local40, local46, 0, local118);
					return;
				}
				Static141.method2795(local118, local46, local40, false, 0, local69);
			}
		} else if (Static87.aClass6_Sub33_6.aClass14_Sub22_1.method7288() != 0) {
			@Pc(162) int local162 = arg0.anInt10360 - 256 >> 9;
			@Pc(173) int local173 = arg0.anInt10357 - 256 >> 9;
			@Pc(193) int local193 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 == arg0 ? 0 : local50 + (local162 << 16) + (arg0.aByte135 << 24) + (local173 << 8);
			Static433.aClass343Array1[Static530.anInt9223++] = new Class343((byte) (arg2.aBoolean307 ? 2 : 1), local40, local46, 0, local118, local193, local69, arg0);
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIIII)V")
	public static void method8289(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) long local18 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg2);
		@Pc(24) Class6_Sub6 local24 = (Class6_Sub6) Static276.aClass380_47.method8747(local18);
		if (local24 == null) {
			local24 = new Class6_Sub6();
			Static276.aClass380_47.method8753(local24, local18);
		}
		if (local24.anIntArray33.length <= arg4) {
			@Pc(45) int[] local45 = new int[arg4 + 1];
			@Pc(50) int[] local50 = new int[arg4 + 1];
			for (@Pc(52) int local52 = 0; local52 < local24.anIntArray33.length; local52++) {
				local45[local52] = local24.anIntArray33[local52];
				local50[local52] = local24.anIntArray32[local52];
			}
			for (@Pc(78) int local78 = local24.anIntArray33.length; local78 < arg4; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local24.anIntArray33 = local45;
			local24.anIntArray32 = local50;
		}
		local24.anIntArray33[arg4] = arg3;
		local24.anIntArray32[arg4] = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Z")
	public static boolean method8290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BC)B")
	public static byte method8291(@OriginalArg(1) char arg0) {
		@Pc(40) byte local40;
		if (arg0 > '\u0000' && arg0 < '\u0080' || arg0 >= ' ' && arg0 <= 'ÿ') {
			local40 = (byte) arg0;
		} else if (arg0 == '€') {
			local40 = -128;
		} else if (arg0 == '‚') {
			local40 = -126;
		} else if (arg0 == 'ƒ') {
			local40 = -125;
		} else if (arg0 == '„') {
			local40 = -124;
		} else if (arg0 == '…') {
			local40 = -123;
		} else if (arg0 == '†') {
			local40 = -122;
		} else if (arg0 == '‡') {
			local40 = -121;
		} else if (arg0 == 'ˆ') {
			local40 = -120;
		} else if (arg0 == '‰') {
			local40 = -119;
		} else if (arg0 == 'Š') {
			local40 = -118;
		} else if (arg0 == '‹') {
			local40 = -117;
		} else if (arg0 == 'Œ') {
			local40 = -116;
		} else if (arg0 == 'Ž') {
			local40 = -114;
		} else if (arg0 == '‘') {
			local40 = -111;
		} else if (arg0 == '’') {
			local40 = -110;
		} else if (arg0 == '“') {
			local40 = -109;
		} else if (arg0 == '”') {
			local40 = -108;
		} else if (arg0 == '•') {
			local40 = -107;
		} else if (arg0 == '–') {
			local40 = -106;
		} else if (arg0 == '—') {
			local40 = -105;
		} else if (arg0 == '˜') {
			local40 = -104;
		} else if (arg0 == '™') {
			local40 = -103;
		} else if (arg0 == 'š') {
			local40 = -102;
		} else if (arg0 == '›') {
			local40 = -101;
		} else if (arg0 == 'œ') {
			local40 = -100;
		} else if (arg0 == 'ž') {
			local40 = -98;
		} else if (arg0 == 'Ÿ') {
			local40 = -97;
		} else {
			local40 = 63;
		}
		return local40;
	}
}
