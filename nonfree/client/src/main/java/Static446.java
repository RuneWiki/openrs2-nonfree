import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "Lclient!ni;")
	public static Class223 aClass223_100;

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
	public static int anInt8097;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "[I")
	public static final int[] anIntArray420 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
	public static final int anInt8089 = 1;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "Z")
	public static boolean aBoolean647 = false;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "[I")
	public static final int[] anIntArray421 = new int[8];

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(II[[[Lclient!lha;IBZ)Z")
	public static boolean method6806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class186[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (Static322.anInt6388 & 0xFF);
		if (Static538.aByteArrayArrayArray18[Static86.anInt10575][arg0][arg3] == local14) {
			return false;
		} else if ((Static495.aByteArrayArrayArray17[Static86.anInt10575][arg0][arg3] & 0x4) == 0) {
			return false;
		} else {
			@Pc(48) byte local48 = 0;
			@Pc(50) int local50 = 0;
			Static383.anIntArray348[0] = arg0;
			@Pc(57) int local57 = local48 + 1;
			Static130.anIntArray537[0] = arg3;
			Static538.aByteArrayArrayArray18[Static86.anInt10575][arg0][arg3] = local14;
			while (local57 != local50) {
				@Pc(75) int local75 = Static383.anIntArray348[local50] & 0xFFFF;
				@Pc(83) int local83 = Static383.anIntArray348[local50] >> 16 & 0xFF;
				@Pc(91) int local91 = Static383.anIntArray348[local50] >> 24 & 0xFF;
				@Pc(97) int local97 = Static130.anIntArray537[local50] & 0xFFFF;
				@Pc(105) int local105 = Static130.anIntArray537[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static495.aByteArrayArrayArray17[Static86.anInt10575][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(127) boolean local127 = false;
				@Pc(133) int local133;
				@Pc(175) int local175;
				@Pc(217) int local217;
				if (arg2 != null) {
					label237: for (local133 = Static86.anInt10575 + 1; local133 <= 3; local133++) {
						if (arg2[local133] != null && (Static495.aByteArrayArrayArray17[local133][local75][local97] & 0x8) == 0) {
							@Pc(320) Class9_Sub4_Sub2 local320;
							@Pc(330) int local330;
							@Pc(309) Class186 local309;
							@Pc(315) Class168 local315;
							if (local113 && arg2[local133][local75][local97] != null) {
								if (arg2[local133][local75][local97].aClass9_Sub4_Sub5_1 != null) {
									local175 = Static25.method716(local83);
									if (arg2[local133][local75][local97].aClass9_Sub4_Sub5_1.aShort128 == local175 || arg2[local133][local75][local97].aClass9_Sub4_Sub5_2 != null && local175 == arg2[local133][local75][local97].aClass9_Sub4_Sub5_2.aShort128) {
										continue;
									}
									if (local91 != 0) {
										local217 = Static25.method716(local91);
										if (local217 == arg2[local133][local75][local97].aClass9_Sub4_Sub5_1.aShort128 || arg2[local133][local75][local97].aClass9_Sub4_Sub5_2 != null && arg2[local133][local75][local97].aClass9_Sub4_Sub5_2.aShort128 == local217) {
											continue;
										}
									}
									if (local105 != 0) {
										local217 = Static25.method716(local105);
										if (local217 == arg2[local133][local75][local97].aClass9_Sub4_Sub5_1.aShort128 || arg2[local133][local75][local97].aClass9_Sub4_Sub5_2 != null && local217 == arg2[local133][local75][local97].aClass9_Sub4_Sub5_2.aShort128) {
											continue;
										}
									}
								}
								local309 = arg2[local133][local75][local97];
								if (local309.aClass168_3 != null) {
									for (local315 = local309.aClass168_3; local315 != null; local315 = local315.aClass168_2) {
										local320 = local315.aClass9_Sub4_Sub2_1;
										if (local320 instanceof Interface22) {
											@Pc(326) Interface22 local326 = (Interface22) local320;
											local330 = local326.method8435();
											@Pc(336) int local336 = local326.method8438();
											if (local330 == 21) {
												local330 = 19;
											}
											@Pc(349) int local349 = local330 | local336 << 6;
											if (local83 == local349 || local91 != 0 && local349 == local91 || local105 != 0 && local349 == local105) {
												continue label237;
											}
										}
									}
								}
							}
							local309 = arg2[local133][local75][local97];
							if (local309 != null && local309.aClass168_3 != null) {
								for (local315 = local309.aClass168_3; local315 != null; local315 = local315.aClass168_2) {
									local320 = local315.aClass9_Sub4_Sub2_1;
									if (local320.aShort115 != local320.aShort117 || local320.aShort116 != local320.aShort114) {
										for (@Pc(421) int local421 = local320.aShort115; local421 <= local320.aShort117; local421++) {
											for (local330 = local320.aShort114; local330 <= local320.aShort116; local330++) {
												Static538.aByteArrayArrayArray18[local133][local421][local330] = local14;
											}
										}
									}
								}
							}
							Static538.aByteArrayArrayArray18[local133][local75][local97] = local14;
							local127 = true;
						}
					}
				}
				if (local127) {
					local133 = Static148.aClass245Array1[Static86.anInt10575 + 1].method7583(local97, local75);
					if (Static372.anIntArray335[arg1] < local133) {
						Static372.anIntArray335[arg1] = local133;
					}
					local175 = local75 << 9;
					local217 = local97 << 9;
					if (Static574.anIntArray522[arg1] > local175) {
						Static574.anIntArray522[arg1] = local175;
					} else if (local175 > Static502.anIntArray343[arg1]) {
						Static502.anIntArray343[arg1] = local175;
					}
					if (Static84.anIntArray85[arg1] > local217) {
						Static84.anIntArray85[arg1] = local217;
					} else if (Static515.anIntArray467[arg1] < local217) {
						Static515.anIntArray467[arg1] = local217;
					}
				}
				if (!local113) {
					if (local75 >= 1 && Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 - 1][local97] != local14) {
						Static383.anIntArray348[local57] = local75 - 1 | 0xD3000000 | 0x120000;
						Static130.anIntArray537[local57] = local97 | 0x130000;
						local57 = local57 + 1 & 0xFFF;
						Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 - 1][local97] = local14;
					}
					local97++;
					if (local97 < Static108.anInt2930) {
						if (local75 - 1 >= 0 && local14 != Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 - 1][local97] && (Static495.aByteArrayArrayArray17[Static86.anInt10575][local75][local97] & 0x4) == 0 && (Static495.aByteArrayArrayArray17[Static86.anInt10575][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static383.anIntArray348[local57] = local75 - 1 | 0x120000 | 0x52000000;
							Static130.anIntArray537[local57] = local97 | 0x130000;
							Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 - 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static538.aByteArrayArrayArray18[Static86.anInt10575][local75][local97] != local14) {
							Static383.anIntArray348[local57] = local75 | 0x520000 | 0x13000000;
							Static130.anIntArray537[local57] = local97 | 0x530000;
							Static538.aByteArrayArrayArray18[Static86.anInt10575][local75][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static306.anInt6176 > local75 + 1 && local14 != Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 + 1][local97] && (Static495.aByteArrayArrayArray17[Static86.anInt10575][local75][local97] & 0x4) == 0 && (Static495.aByteArrayArrayArray17[Static86.anInt10575][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static383.anIntArray348[local57] = local75 + 1 | 0x520000 | 0x92000000;
							Static130.anIntArray537[local57] = local97 | 0x530000;
							Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 + 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
					}
					local97--;
					if (local75 + 1 < Static306.anInt6176 && Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 + 1][local97] != local14) {
						Static383.anIntArray348[local57] = local75 + 1 | 0x920000 | 0x53000000;
						Static130.anIntArray537[local57] = local97 | 0x930000;
						local57 = local57 + 1 & 0xFFF;
						Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 + 1][local97] = local14;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 - 1][local97] != local14 && (Static495.aByteArrayArrayArray17[Static86.anInt10575][local75][local97] & 0x4) == 0 && (Static495.aByteArrayArrayArray17[Static86.anInt10575][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static383.anIntArray348[local57] = local75 - 1 | 0xD20000 | 0x12000000;
							Static130.anIntArray537[local57] = local97 | 0xD30000;
							Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 - 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static538.aByteArrayArrayArray18[Static86.anInt10575][local75][local97] != local14) {
							Static383.anIntArray348[local57] = local75 | 0xD20000 | 0x93000000;
							Static130.anIntArray537[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static538.aByteArrayArrayArray18[Static86.anInt10575][local75][local97] = local14;
						}
						if (local75 + 1 < Static306.anInt6176 && local14 != Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 + 1][local97] && (Static495.aByteArrayArrayArray17[Static86.anInt10575][local75][local97] & 0x4) == 0 && (Static495.aByteArrayArrayArray17[Static86.anInt10575][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static383.anIntArray348[local57] = local75 + 1 | 0xD2000000 | 0x920000;
							Static130.anIntArray537[local57] = local97 | 0x930000;
							local57 = local57 + 1 & 0xFFF;
							Static538.aByteArrayArrayArray18[Static86.anInt10575][local75 + 1][local97] = local14;
						}
					}
				}
			}
			if (Static372.anIntArray335[arg1] != -1000000) {
				Static372.anIntArray335[arg1] += 40;
				Static574.anIntArray522[arg1] -= 512;
				Static502.anIntArray343[arg1] += 512;
				Static515.anIntArray467[arg1] += 512;
				Static84.anIntArray85[arg1] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)Lclient!hc;")
	public static Class9_Sub4_Sub3 method6808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class186 local7 = Static26.aClass186ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass9_Sub4_Sub3_1 == null ? null : local7.aClass9_Sub4_Sub3_1;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIILclient!sba;Z)V")
	public static void method6811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class302 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(8) int local8 = arg2.anInt8909;
		if (arg2.aByte111 == 0) {
			arg2.anInt8909 = arg2.anInt8858;
		} else if (arg2.aByte111 == 1) {
			arg2.anInt8909 = arg1 - arg2.anInt8858;
		} else if (arg2.aByte111 == 2) {
			arg2.anInt8909 = arg1 * arg2.anInt8858 >> 14;
		}
		@Pc(50) int local50 = arg2.anInt8872;
		if (arg2.aByte109 == 0) {
			arg2.anInt8872 = arg2.anInt8863;
		} else if (arg2.aByte109 == 1) {
			arg2.anInt8872 = arg0 - arg2.anInt8863;
		} else if (arg2.aByte109 == 2) {
			arg2.anInt8872 = arg0 * arg2.anInt8863 >> 14;
		}
		if (arg2.aByte111 == 4) {
			arg2.anInt8909 = arg2.anInt8917 * arg2.anInt8872 / arg2.anInt8925;
		}
		if (arg2.aByte109 == 4) {
			arg2.anInt8872 = arg2.anInt8909 * arg2.anInt8925 / arg2.anInt8917;
		}
		if (Static30.aBoolean78 && (Static75.method2151(arg2).anInt10438 != 0 || arg2.anInt8936 == 0)) {
			if (arg2.anInt8872 < 5 && arg2.anInt8909 < 5) {
				arg2.anInt8909 = 5;
				arg2.anInt8872 = 5;
			} else {
				if (arg2.anInt8872 <= 0) {
					arg2.anInt8872 = 5;
				}
				if (arg2.anInt8909 <= 0) {
					arg2.anInt8909 = 5;
				}
			}
		}
		if (Static47.anInt1660 == arg2.anInt8904) {
			Static367.aClass302_17 = arg2;
		}
		if (arg3 && arg2.anObjectArray12 != null && (arg2.anInt8909 != local8 || arg2.anInt8872 != local50)) {
			@Pc(181) Class6_Sub29 local181 = new Class6_Sub29();
			local181.aClass302_7 = arg2;
			local181.anObjectArray1 = arg2.anObjectArray12;
			Static138.aClass163_17.method4967(local181);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!ni;I)V")
	public static void method6812(@OriginalArg(0) Class223 arg0) {
		Static586.aClass223_52 = arg0;
	}
}
