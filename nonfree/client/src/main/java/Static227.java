import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!hka", name = "d", descriptor = "I")
	public static int anInt4605;

	@OriginalMember(owner = "client!hka", name = "g", descriptor = "Lclient!gga;")
	public static Class124 aClass124_49;

	@OriginalMember(owner = "client!hka", name = "b", descriptor = "[[S")
	private static final short[][] aShortArrayArray10 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!hka", name = "e", descriptor = "[[S")
	private static final short[][] aShortArrayArray11 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

	@OriginalMember(owner = "client!hka", name = "i", descriptor = "[[S")
	private static final short[][] aShortArrayArray12 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!hka", name = "l", descriptor = "[[[S")
	public static final short[][][] aShortArrayArrayArray3 = new short[][][] { aShortArrayArray11, aShortArrayArray10, aShortArrayArray12 };

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "([[[Lclient!q;IIZII)Z")
	public static boolean method4161(@OriginalArg(0) Class291[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static125.anInt2441 & 0xFF);
		if (Static516.aByteArrayArrayArray18[Static547.anInt9550][arg4][arg2] == local14) {
			return false;
		} else if ((Static96.aByteArrayArrayArray10[Static547.anInt9550][arg4][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(43) byte local43 = 0;
			@Pc(51) int local51 = 0;
			Static341.anIntArray308[0] = arg4;
			@Pc(58) int local58 = local43 + 1;
			Static539.anIntArray481[0] = arg2;
			Static516.aByteArrayArrayArray18[Static547.anInt9550][arg4][arg2] = local14;
			while (local58 != local51) {
				@Pc(76) int local76 = Static341.anIntArray308[local51] & 0xFFFF;
				@Pc(84) int local84 = Static341.anIntArray308[local51] >> 16 & 0xFF;
				@Pc(92) int local92 = Static341.anIntArray308[local51] >> 24 & 0xFF;
				@Pc(98) int local98 = Static539.anIntArray481[local51] & 0xFFFF;
				@Pc(106) int local106 = Static539.anIntArray481[local51] >> 16 & 0xFF;
				local51 = local51 + 1 & 0xFFF;
				@Pc(114) boolean local114 = false;
				if ((Static96.aByteArrayArrayArray10[Static547.anInt9550][local76][local98] & 0x4) == 0) {
					local114 = true;
				}
				@Pc(131) boolean local131 = false;
				@Pc(137) int local137;
				@Pc(176) int local176;
				@Pc(215) int local215;
				if (arg0 != null) {
					label237: for (local137 = Static547.anInt9550 + 1; local137 <= 3; local137++) {
						if (arg0[local137] != null && (Static96.aByteArrayArrayArray10[local137][local76][local98] & 0x8) == 0) {
							@Pc(314) Class15_Sub3_Sub3 local314;
							@Pc(324) int local324;
							@Pc(303) Class291 local303;
							@Pc(309) Class27 local309;
							if (local114 && arg0[local137][local76][local98] != null) {
								if (arg0[local137][local76][local98].aClass15_Sub3_Sub4_1 != null) {
									local176 = Static498.method7843(local84);
									if (arg0[local137][local76][local98].aClass15_Sub3_Sub4_1.aShort126 == local176 || arg0[local137][local76][local98].aClass15_Sub3_Sub4_2 != null && arg0[local137][local76][local98].aClass15_Sub3_Sub4_2.aShort126 == local176) {
										continue;
									}
									if (local92 != 0) {
										local215 = Static498.method7843(local92);
										if (arg0[local137][local76][local98].aClass15_Sub3_Sub4_1.aShort126 == local215 || arg0[local137][local76][local98].aClass15_Sub3_Sub4_2 != null && arg0[local137][local76][local98].aClass15_Sub3_Sub4_2.aShort126 == local215) {
											continue;
										}
									}
									if (local106 != 0) {
										local215 = Static498.method7843(local106);
										if (arg0[local137][local76][local98].aClass15_Sub3_Sub4_1.aShort126 == local215 || arg0[local137][local76][local98].aClass15_Sub3_Sub4_2 != null && local215 == arg0[local137][local76][local98].aClass15_Sub3_Sub4_2.aShort126) {
											continue;
										}
									}
								}
								local303 = arg0[local137][local76][local98];
								if (local303.aClass27_3 != null) {
									for (local309 = local303.aClass27_3; local309 != null; local309 = local309.aClass27_1) {
										local314 = local309.aClass15_Sub3_Sub3_1;
										if (local314 instanceof Interface23) {
											@Pc(320) Interface23 local320 = (Interface23) local314;
											local324 = local320.method9452();
											@Pc(328) int local328 = local320.method9454();
											if (local324 == 21) {
												local324 = 19;
											}
											@Pc(339) int local339 = local324 | local328 << 6;
											if (local339 == local84 || local92 != 0 && local339 == local92 || local106 != 0 && local106 == local339) {
												continue label237;
											}
										}
									}
								}
							}
							local303 = arg0[local137][local76][local98];
							if (local303 != null && local303.aClass27_3 != null) {
								for (local309 = local303.aClass27_3; local309 != null; local309 = local309.aClass27_1) {
									local314 = local309.aClass15_Sub3_Sub3_1;
									if (local314.aShort62 != local314.aShort63 || local314.aShort65 != local314.aShort64) {
										for (@Pc(401) int local401 = local314.aShort62; local401 <= local314.aShort63; local401++) {
											for (local324 = local314.aShort64; local324 <= local314.aShort65; local324++) {
												Static516.aByteArrayArrayArray18[local137][local401][local324] = local14;
											}
										}
									}
								}
							}
							Static516.aByteArrayArrayArray18[local137][local76][local98] = local14;
							local131 = true;
						}
					}
				}
				if (local131) {
					local137 = Static245.aClass18Array14[Static547.anInt9550 + 1].method8537(local98, local76);
					if (local137 > Static574.anIntArray509[arg1]) {
						Static574.anIntArray509[arg1] = local137;
					}
					local176 = local76 << 9;
					local215 = local98 << 9;
					if (local176 < Static525.anIntArray472[arg1]) {
						Static525.anIntArray472[arg1] = local176;
					} else if (Static630.anIntArray400[arg1] < local176) {
						Static630.anIntArray400[arg1] = local176;
					}
					if (Static433.anIntArray397[arg1] > local215) {
						Static433.anIntArray397[arg1] = local215;
					} else if (Static17.anIntArray439[arg1] < local215) {
						Static17.anIntArray439[arg1] = local215;
					}
				}
				if (!local114) {
					if (local76 >= 1 && Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 - 1][local98] != local14) {
						Static341.anIntArray308[local58] = local76 - 1 | 0x120000 | 0xD3000000;
						Static539.anIntArray481[local58] = local98 | 0x130000;
						local58 = local58 + 1 & 0xFFF;
						Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 - 1][local98] = local14;
					}
					local98++;
					if (local98 < Static668.anInt11370) {
						if (local76 - 1 >= 0 && local14 != Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 - 1][local98] && (Static96.aByteArrayArrayArray10[Static547.anInt9550][local76][local98] & 0x4) == 0 && (Static96.aByteArrayArrayArray10[Static547.anInt9550][local76 - 1][local98 - 1] & 0x4) == 0) {
							Static341.anIntArray308[local58] = local76 - 1 | 0x120000 | 0x52000000;
							Static539.anIntArray481[local58] = local98 | 0x130000;
							Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 - 1][local98] = local14;
							local58 = local58 + 1 & 0xFFF;
						}
						if (local14 != Static516.aByteArrayArrayArray18[Static547.anInt9550][local76][local98]) {
							Static341.anIntArray308[local58] = local76 | 0x520000 | 0x13000000;
							Static539.anIntArray481[local58] = local98 | 0x530000;
							Static516.aByteArrayArrayArray18[Static547.anInt9550][local76][local98] = local14;
							local58 = local58 + 1 & 0xFFF;
						}
						if (Static222.anInt4533 > local76 + 1 && local14 != Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 + 1][local98] && (Static96.aByteArrayArrayArray10[Static547.anInt9550][local76][local98] & 0x4) == 0 && (Static96.aByteArrayArrayArray10[Static547.anInt9550][local76 + 1][local98 - 1] & 0x4) == 0) {
							Static341.anIntArray308[local58] = local76 + 1 | 0x520000 | 0x92000000;
							Static539.anIntArray481[local58] = local98 | 0x530000;
							Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 + 1][local98] = local14;
							local58 = local58 + 1 & 0xFFF;
						}
					}
					local98--;
					if (local76 + 1 < Static222.anInt4533 && Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 + 1][local98] != local14) {
						Static341.anIntArray308[local58] = local76 + 1 | 0x53000000 | 0x920000;
						Static539.anIntArray481[local58] = local98 | 0x930000;
						Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 + 1][local98] = local14;
						local58 = local58 + 1 & 0xFFF;
					}
					local98--;
					if (local98 >= 0) {
						if (local76 - 1 >= 0 && local14 != Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 - 1][local98] && (Static96.aByteArrayArrayArray10[Static547.anInt9550][local76][local98] & 0x4) == 0 && (Static96.aByteArrayArrayArray10[Static547.anInt9550][local76 - 1][local98 + 1] & 0x4) == 0) {
							Static341.anIntArray308[local58] = local76 - 1 | 0xD20000 | 0x12000000;
							Static539.anIntArray481[local58] = local98 | 0xD30000;
							local58 = local58 + 1 & 0xFFF;
							Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 - 1][local98] = local14;
						}
						if (Static516.aByteArrayArrayArray18[Static547.anInt9550][local76][local98] != local14) {
							Static341.anIntArray308[local58] = local76 | 0xD20000 | 0x93000000;
							Static539.anIntArray481[local58] = local98 | 0xD30000;
							local58 = local58 + 1 & 0xFFF;
							Static516.aByteArrayArrayArray18[Static547.anInt9550][local76][local98] = local14;
						}
						if (local76 + 1 < Static222.anInt4533 && Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 + 1][local98] != local14 && (Static96.aByteArrayArrayArray10[Static547.anInt9550][local76][local98] & 0x4) == 0 && (Static96.aByteArrayArrayArray10[Static547.anInt9550][local76 + 1][local98 + 1] & 0x4) == 0) {
							Static341.anIntArray308[local58] = 0xD2000000 | 0x920000 | local76 + 1;
							Static539.anIntArray481[local58] = local98 | 0x930000;
							Static516.aByteArrayArrayArray18[Static547.anInt9550][local76 + 1][local98] = local14;
							local58 = local58 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static574.anIntArray509[arg1] != -1000000) {
				Static574.anIntArray509[arg1] += 40;
				Static525.anIntArray472[arg1] -= 512;
				Static630.anIntArray400[arg1] += 512;
				Static17.anIntArray439[arg1] += 512;
				Static433.anIntArray397[arg1] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(I)[Lclient!pda;")
	public static Class277[] method4162() {
		if (Static596.aClass277Array1 == null) {
			@Pc(7) Class277[] local7 = Static478.method7626(Static96.aClass48_5);
			@Pc(11) Class277[] local11 = new Class277[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static230.aClass2_Sub54_15.aClass4_Sub2_1.method172();
			@Pc(79) int local79;
			@Pc(85) Class277 local85;
			label69: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(26) Class277 local26 = local7[local20];
				if ((local26.anInt8157 <= 0 || local26.anInt8157 >= 24) && local26.anInt8153 >= 800 && local26.anInt8154 >= 600 && (local18 != 2 || local26.anInt8153 <= 800 && local26.anInt8154 <= 600) && (local18 != 1 || local26.anInt8153 <= 1024 && local26.anInt8154 <= 768)) {
					for (local79 = 0; local79 < local13; local79++) {
						local85 = local11[local79];
						if (local26.anInt8153 == local85.anInt8153 && local26.anInt8154 == local85.anInt8154) {
							if (local26.anInt8157 > local85.anInt8157) {
								local11[local79] = local26;
							}
							continue label69;
						}
					}
					local11[local13] = local26;
					local13++;
				}
			}
			Static596.aClass277Array1 = new Class277[local13];
			Static679.method4131(local11, 0, Static596.aClass277Array1, 0, local13);
			@Pc(145) int[] local145 = new int[Static596.aClass277Array1.length];
			for (local79 = 0; local79 < Static596.aClass277Array1.length; local79++) {
				local85 = Static596.aClass277Array1[local79];
				local145[local79] = local85.anInt8153 * local85.anInt8154;
			}
			Static48.method984(local145, Static596.aClass277Array1);
		}
		return Static596.aClass277Array1;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(BII)I")
	public static int method4164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = Static55.method1077(arg0 + 91923, 4, arg1 + 45365) + (Static55.method1077(arg0 + 37821, 2, arg1 + 10294) - 128 >> 1) + (Static55.method1077(arg0, 1, arg1) - 128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}
}
