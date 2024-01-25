import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!lj", name = "T", descriptor = "Lclient!bu;")
	public static Class32 aClass32_52;

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
	public static int anInt4246 = 0;

	@OriginalMember(owner = "client!lj", name = "Q", descriptor = "[I")
	public static final int[] anIntArray279 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)I")
	public static int method3427(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!jq;Lclient!qa;ILclient!qj;Lclient!gj;IIB)V")
	public static void method3428(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class204 arg3, @OriginalArg(4) Class90 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(20) int local20 = arg0.anInt3893 - arg6 / 2 - 5;
		@Pc(24) int local24 = arg2 + 2;
		if (arg4.anInt2721 != 0) {
			arg1.method5507(arg4.anInt2721, arg2 + arg3.method4418() * arg5 + 1 - local24, local20, local24, arg6 + 10);
		}
		if (arg4.anInt2711 != 0) {
			arg1.method5503(arg6 + 10, local20, arg2 + arg5 * arg3.method4418() + 1 - local24, arg4.anInt2711, local24);
		}
		@Pc(75) int local75 = arg4.anInt2715;
		if (arg0.aBoolean335 && arg4.anInt2723 != -1) {
			local75 = arg4.anInt2723;
		}
		for (@Pc(87) int local87 = 0; local87 < arg5; local87++) {
			@Pc(93) String local93 = Static143.aStringArray14[local87];
			if (local87 < arg5 - 1) {
				local93 = local93.substring(0, local93.length() - 4);
			}
			arg3.method4417(arg1, local93, arg0.anInt3893, arg2, local75);
			arg2 += arg3.method4418();
		}
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
	public static void method3429() {
		Static146.anInt2985 = Static269.aClass70_27.anInt2270 + Static269.aClass70_27.anInt2278 + 2;
		Static271.aStringArray36 = new String[500];
		Static49.anInt1181 = Static391.aClass70_32.anInt2278 + Static391.aClass70_32.anInt2270 + 2;
		for (@Pc(25) int local25 = 0; local25 < Static271.aStringArray36.length; local25++) {
			Static271.aStringArray36[local25] = "";
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIFFFI)[F")
	public static float[] method3430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg2 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg2 * 0.024543693F));
		local6[0] = local17;
		local6[5] = 0.0F;
		local6[3] = 0.0F;
		local6[2] = local25;
		local6[8] = local17;
		local6[4] = 1.0F;
		local6[7] = 0.0F;
		local6[1] = 0.0F;
		local6[6] = -local25;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(83) float local83 = (float) arg6 / 32767.0F;
		@Pc(87) float local87 = 1.0F - local83;
		@Pc(98) float local98 = -((float) Math.sqrt((double) (1.0F - local83 * local83)));
		@Pc(110) float local110 = (float) Math.sqrt((double) (arg0 * arg0 + arg1 * arg1));
		if (local110 == 0.0F && local83 == 0.0F) {
			local9 = local6;
		} else {
			if (local110 != 0.0F) {
				local71 = (float) -arg1 / local110;
				local78 = (float) arg0 / local110;
			}
			local69[0] = local87 * local71 * local71 + local83;
			local69[2] = local78 * local71 * local87;
			local69[4] = local83;
			local69[6] = local71 * local78 * local87;
			local69[5] = local71 * local98;
			local69[8] = local83 + local78 * local78 * local87;
			local69[1] = local98 * local78;
			local69[3] = -local78 * local98;
			local69[7] = local98 * -local71;
			local9[0] = local6[1] * local69[3] + local6[0] * local69[0] + local6[2] * local69[6];
			local9[1] = local69[7] * local6[2] + local69[1] * local6[0] + local69[4] * local6[1];
			local9[2] = local69[8] * local6[2] + local69[5] * local6[1] + local69[2] * local6[0];
			local9[3] = local69[6] * local6[5] + local69[0] * local6[3] + local6[4] * local69[3];
			local9[4] = local69[7] * local6[5] + local6[4] * local69[4] + local69[1] * local6[3];
			local9[5] = local69[2] * local6[3] + local69[5] * local6[4] + local69[8] * local6[5];
			local9[6] = local6[7] * local69[3] + local6[6] * local69[0] + local6[8] * local69[6];
			local9[7] = local69[7] * local6[8] + local69[1] * local6[6] + local69[4] * local6[7];
			local9[8] = local6[7] * local69[5] + local6[6] * local69[2] + local69[8] * local6[8];
		}
		local9[5] *= arg5;
		local9[6] *= arg3;
		local9[1] *= arg4;
		local9[7] *= arg3;
		local9[3] *= arg5;
		local9[2] *= arg4;
		local9[4] *= arg5;
		local9[0] *= arg4;
		local9[8] *= arg3;
		return local9;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIZ[[[Lclient!iq;)Z")
	public static boolean method3432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class118[][][] arg4) {
		@Pc(12) byte local12 = arg3 ? 1 : (byte) (Static52.anInt1374 & 0xFF);
		if (Static229.aByteArrayArrayArray16[Static6.anInt93][arg0][arg1] == local12) {
			return false;
		} else if ((Static9.aByteArrayArrayArray1[Static6.anInt93][arg0][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(37) byte local37 = 0;
			@Pc(39) int local39 = 0;
			Static417.anIntArray498[0] = arg0;
			@Pc(46) int local46 = local37 + 1;
			Static201.anIntArray356[0] = arg1;
			Static229.aByteArrayArrayArray16[Static6.anInt93][arg0][arg1] = local12;
			while (local46 != local39) {
				@Pc(68) int local68 = Static417.anIntArray498[local39] & 0xFFFF;
				@Pc(76) int local76 = Static417.anIntArray498[local39] >> 16 & 0xFF;
				@Pc(84) int local84 = Static417.anIntArray498[local39] >> 24 & 0xFF;
				@Pc(90) int local90 = Static201.anIntArray356[local39] & 0xFFFF;
				@Pc(98) int local98 = Static201.anIntArray356[local39] >> 16 & 0xFF;
				local39 = local39 + 1 & 0xFFF;
				@Pc(106) boolean local106 = false;
				if ((Static9.aByteArrayArrayArray1[Static6.anInt93][local68][local90] & 0x4) == 0) {
					local106 = true;
				}
				@Pc(120) boolean local120 = false;
				@Pc(161) int local161;
				@Pc(209) int local209;
				label231: for (@Pc(124) int local124 = Static6.anInt93 + 1; local124 <= 3; local124++) {
					if ((Static9.aByteArrayArrayArray1[local124][local68][local90] & 0x8) == 0) {
						@Pc(305) Class7_Sub2 local305;
						@Pc(315) int local315;
						@Pc(295) Class118 local295;
						@Pc(301) Class179 local301;
						if (local106 && arg4[local124][local68][local90] != null) {
							if (arg4[local124][local68][local90].aClass7_Sub4_2 != null) {
								local161 = Static408.method5248(local76);
								if (arg4[local124][local68][local90].aClass7_Sub4_2.anInt6144 == local161 || arg4[local124][local68][local90].aClass7_Sub4_1 != null && arg4[local124][local68][local90].aClass7_Sub4_1.anInt6144 == local161) {
									continue;
								}
								if (local84 != 0) {
									local209 = Static408.method5248(local84);
									if (arg4[local124][local68][local90].aClass7_Sub4_2.anInt6144 == local209 || arg4[local124][local68][local90].aClass7_Sub4_1 != null && arg4[local124][local68][local90].aClass7_Sub4_1.anInt6144 == local209) {
										continue;
									}
								}
								if (local98 != 0) {
									local209 = Static408.method5248(local98);
									if (local209 == arg4[local124][local68][local90].aClass7_Sub4_2.anInt6144 || arg4[local124][local68][local90].aClass7_Sub4_1 != null && local209 == arg4[local124][local68][local90].aClass7_Sub4_1.anInt6144) {
										continue;
									}
								}
							}
							local295 = arg4[local124][local68][local90];
							if (local295.aClass179_2 != null) {
								for (local301 = local295.aClass179_2; local301 != null; local301 = local301.aClass179_3) {
									local305 = local301.aClass7_Sub2_2;
									if (local305 instanceof Interface8) {
										@Pc(311) Interface8 local311 = (Interface8) local305;
										local315 = local311.method4810();
										if (local315 == 21) {
											local315 = 19;
										}
										@Pc(326) int local326 = local311.method4807();
										@Pc(332) int local332 = local326 << 6 | local315;
										if (local76 == local332 || local84 != 0 && local84 == local332 || local98 != 0 && local98 == local332) {
											continue label231;
										}
									}
								}
							}
						}
						local295 = arg4[local124][local68][local90];
						if (local295 != null && local295.aClass179_2 != null) {
							for (local301 = local295.aClass179_2; local301 != null; local301 = local301.aClass179_3) {
								local305 = local301.aClass7_Sub2_2;
								if (local305.aShort72 != local305.aShort71 || local305.aShort70 != local305.aShort73) {
									for (@Pc(403) int local403 = local305.aShort71; local403 <= local305.aShort72; local403++) {
										for (local315 = local305.aShort73; local315 <= local305.aShort70; local315++) {
											Static229.aByteArrayArrayArray16[local124][local403][local315] = local12;
										}
									}
								}
							}
						}
						Static229.aByteArrayArrayArray16[local124][local68][local90] = local12;
						local120 = true;
					}
				}
				if (local120) {
					local161 = Static444.aClass159Array3[Static6.anInt93 + 1].I(local68, local90);
					if (Static107.anIntArray141[arg2] < local161) {
						Static107.anIntArray141[arg2] = local161;
					}
					local209 = local68 << 7;
					if (local209 < Static91.anIntArray128[arg2]) {
						Static91.anIntArray128[arg2] = local209;
					} else if (Static163.anIntArray403[arg2] < local209) {
						Static163.anIntArray403[arg2] = local209;
					}
					@Pc(510) int local510 = local90 << 7;
					if (Static221.anIntArray277[arg2] > local510) {
						Static221.anIntArray277[arg2] = local510;
					} else if (Static433.anIntArray513[arg2] < local510) {
						Static433.anIntArray513[arg2] = local510;
					}
				}
				if (!local106) {
					if (local68 >= 1 && Static229.aByteArrayArrayArray16[Static6.anInt93][local68 - 1][local90] != local12) {
						Static417.anIntArray498[local46] = local68 - 1 | 0xD3000000 | 0x120000;
						Static201.anIntArray356[local46] = local90 | 0x130000;
						local46 = local46 + 1 & 0xFFF;
						Static229.aByteArrayArrayArray16[Static6.anInt93][local68 - 1][local90] = local12;
					}
					@Pc(588) int local588 = ~Static44.anInt7276;
					local90++;
					if (local588 < ~local90) {
						if (local68 - 1 >= 0 && Static229.aByteArrayArrayArray16[Static6.anInt93][local68 - 1][local90] != local12 && (Static9.aByteArrayArrayArray1[Static6.anInt93][local68][local90] & 0x4) == 0 && (Static9.aByteArrayArrayArray1[Static6.anInt93][local68 - 1][local90 - 1] & 0x4) == 0) {
							Static417.anIntArray498[local46] = local68 - 1 | 0x120000 | 0x52000000;
							Static201.anIntArray356[local46] = local90 | 0x130000;
							Static229.aByteArrayArrayArray16[Static6.anInt93][local68 - 1][local90] = local12;
							local46 = local46 + 1 & 0xFFF;
						}
						if (local12 != Static229.aByteArrayArrayArray16[Static6.anInt93][local68][local90]) {
							Static417.anIntArray498[local46] = local68 | 0x520000 | 0x13000000;
							Static201.anIntArray356[local46] = local90 | 0x530000;
							local46 = local46 + 1 & 0xFFF;
							Static229.aByteArrayArrayArray16[Static6.anInt93][local68][local90] = local12;
						}
						if (local68 + 1 < Static40.anInt1089 && Static229.aByteArrayArrayArray16[Static6.anInt93][local68 + 1][local90] != local12 && (Static9.aByteArrayArrayArray1[Static6.anInt93][local68][local90] & 0x4) == 0 && (Static9.aByteArrayArrayArray1[Static6.anInt93][local68 + 1][local90 - 1] & 0x4) == 0) {
							Static417.anIntArray498[local46] = 0x92000000 | 0x520000 | local68 + 1;
							Static201.anIntArray356[local46] = local90 | 0x530000;
							Static229.aByteArrayArrayArray16[Static6.anInt93][local68 + 1][local90] = local12;
							local46 = local46 + 1 & 0xFFF;
						}
					}
					local90--;
					if (local68 + 1 < Static40.anInt1089 && Static229.aByteArrayArrayArray16[Static6.anInt93][local68 + 1][local90] != local12) {
						Static417.anIntArray498[local46] = local68 + 1 | 0x920000 | 0x53000000;
						Static201.anIntArray356[local46] = local90 | 0x930000;
						Static229.aByteArrayArrayArray16[Static6.anInt93][local68 + 1][local90] = local12;
						local46 = local46 + 1 & 0xFFF;
					}
					local90--;
					if (local90 >= 0) {
						if (local68 - 1 >= 0 && Static229.aByteArrayArrayArray16[Static6.anInt93][local68 - 1][local90] != local12 && (Static9.aByteArrayArrayArray1[Static6.anInt93][local68][local90] & 0x4) == 0 && (Static9.aByteArrayArrayArray1[Static6.anInt93][local68 - 1][local90 + 1] & 0x4) == 0) {
							Static417.anIntArray498[local46] = local68 - 1 | 0xD20000 | 0x12000000;
							Static201.anIntArray356[local46] = local90 | 0xD30000;
							Static229.aByteArrayArrayArray16[Static6.anInt93][local68 - 1][local90] = local12;
							local46 = local46 + 1 & 0xFFF;
						}
						if (Static229.aByteArrayArrayArray16[Static6.anInt93][local68][local90] != local12) {
							Static417.anIntArray498[local46] = local68 | 0xD20000 | 0x93000000;
							Static201.anIntArray356[local46] = local90 | 0xD30000;
							Static229.aByteArrayArrayArray16[Static6.anInt93][local68][local90] = local12;
							local46 = local46 + 1 & 0xFFF;
						}
						if (Static40.anInt1089 > local68 + 1 && local12 != Static229.aByteArrayArrayArray16[Static6.anInt93][local68 + 1][local90] && (Static9.aByteArrayArrayArray1[Static6.anInt93][local68][local90] & 0x4) == 0 && (Static9.aByteArrayArrayArray1[Static6.anInt93][local68 + 1][local90 + 1] & 0x4) == 0) {
							Static417.anIntArray498[local46] = local68 + 1 | 0xD2000000 | 0x920000;
							Static201.anIntArray356[local46] = local90 | 0x930000;
							local46 = local46 + 1 & 0xFFF;
							Static229.aByteArrayArrayArray16[Static6.anInt93][local68 + 1][local90] = local12;
						}
					}
				}
			}
			if (Static107.anIntArray141[arg2] != -1000000) {
				Static107.anIntArray141[arg2] += 10;
				Static91.anIntArray128[arg2] -= 50;
				Static163.anIntArray403[arg2] += 50;
				Static433.anIntArray513[arg2] += 50;
				Static221.anIntArray277[arg2] -= 50;
			}
			return true;
		}
	}
}
