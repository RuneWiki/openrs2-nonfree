import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "Lclient!qia;")
	public static Class26 aClass26_1;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_4 = new Class240(35, 7);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIIILclient!eq;II)Z")
	public static boolean method350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class110 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg9 - 64;
		Static624.anIntArrayArray56[64][64] = 99;
		@Pc(29) int local29 = arg0 - 64;
		Static107.anIntArrayArray9[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static114.anIntArray117[0] = arg9;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static459.anIntArray400[0] = arg0;
		@Pc(51) int[][] local51 = arg8.anIntArrayArray14;
		while (true) {
			label282: while (true) {
				@Pc(66) int local66;
				@Pc(71) int local71;
				@Pc(83) int local83;
				@Pc(88) int local88;
				@Pc(232) int local232;
				@Pc(272) int local272;
				do {
					do {
						do {
							label259: do {
								if (local43 == local46) {
									Static168.anInt3083 = local9;
									Static246.anInt4348 = local7;
									return false;
								}
								local7 = Static114.anIntArray117[local43];
								local9 = Static459.anIntArray400[local43];
								local66 = local7 - local18;
								local71 = local9 - local29;
								local43 = local43 + 1 & 0xFFF;
								local83 = local7 - arg8.anInt2712;
								local88 = local9 - arg8.anInt2726;
								if (arg6 == -4) {
									if (arg1 == local7 && local9 == arg5) {
										Static246.anInt4348 = local7;
										Static168.anInt3083 = local9;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static364.method5247(arg1, local7, arg7, arg5, arg4, arg7, arg2, local9)) {
										Static168.anInt3083 = local9;
										Static246.anInt4348 = local7;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg8.method2375(arg4, arg2, arg7, arg3, arg7, arg5, arg1, local9, local7)) {
										Static246.anInt4348 = local7;
										Static168.anInt3083 = local9;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg8.method2374(arg4, arg7, arg1, arg2, arg3, arg5, local9, local7)) {
										Static168.anInt3083 = local9;
										Static246.anInt4348 = local7;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg8.method2370(arg6, arg1, arg7, arg5, arg10, local7, local9)) {
										Static246.anInt4348 = local7;
										Static168.anInt3083 = local9;
										return true;
									}
								} else if (arg8.method2363(local9, local7, arg7, arg1, arg5, arg6, arg10)) {
									Static168.anInt3083 = local9;
									Static246.anInt4348 = local7;
									return true;
								}
								local232 = Static107.anIntArrayArray9[local66][local71] + 1;
								if (local66 > 0 && Static624.anIntArrayArray56[local66 - 1][local71] == 0 && (local51[local83 - 1][local88] & 0x43A40000) == 0 && (local51[local83 - 1][local88 + arg7 - 1] & 0x4E240000) == 0) {
									local272 = 1;
									while (true) {
										if (arg7 - 1 <= local272) {
											Static114.anIntArray117[local46] = local7 - 1;
											Static459.anIntArray400[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static624.anIntArrayArray56[local66 - 1][local71] = 2;
											Static107.anIntArrayArray9[local66 - 1][local71] = local232;
											break;
										}
										if ((local51[local83 - 1][local88 + local272] & 0x4FA40000) != 0) {
											break;
										}
										local272++;
									}
								}
								if (local66 < 128 - arg7 && Static624.anIntArrayArray56[local66 + 1][local71] == 0 && (local51[arg7 + local83][local88] & 0x60E40000) == 0 && (local51[arg7 + local83][arg7 + local88 - 1] & 0x78240000) == 0) {
									local272 = 1;
									while (true) {
										if (local272 >= arg7 - 1) {
											Static114.anIntArray117[local46] = local7 + 1;
											Static459.anIntArray400[local46] = local9;
											Static624.anIntArrayArray56[local66 + 1][local71] = 8;
											local46 = local46 + 1 & 0xFFF;
											Static107.anIntArrayArray9[local66 + 1][local71] = local232;
											break;
										}
										if ((local51[arg7 + local83][local88 + local272] & 0x78E40000) != 0) {
											break;
										}
										local272++;
									}
								}
								if (local71 > 0 && Static624.anIntArrayArray56[local66][local71 - 1] == 0 && (local51[local83][local88 - 1] & 0x43A40000) == 0 && (local51[arg7 + local83 - 1][local88 - 1] & 0x60E40000) == 0) {
									local272 = 1;
									while (true) {
										if (arg7 - 1 <= local272) {
											Static114.anIntArray117[local46] = local7;
											Static459.anIntArray400[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static624.anIntArrayArray56[local66][local71 - 1] = 1;
											Static107.anIntArrayArray9[local66][local71 - 1] = local232;
											break;
										}
										if ((local51[local272 + local83][local88 - 1] & 0x63E40000) != 0) {
											break;
										}
										local272++;
									}
								}
								if (128 - arg7 > local71 && Static624.anIntArrayArray56[local66][local71 + 1] == 0 && (local51[local83][arg7 + local88] & 0x4E240000) == 0 && (local51[local83 + arg7 - 1][arg7 + local88] & 0x78240000) == 0) {
									local272 = 1;
									while (true) {
										if (local272 >= arg7 - 1) {
											Static114.anIntArray117[local46] = local7;
											Static459.anIntArray400[local46] = local9 + 1;
											Static624.anIntArrayArray56[local66][local71 + 1] = 4;
											local46 = local46 + 1 & 0xFFF;
											Static107.anIntArrayArray9[local66][local71 + 1] = local232;
											break;
										}
										if ((local51[local272 + local83][local88 + arg7] & 0x7E240000) != 0) {
											break;
										}
										local272++;
									}
								}
								if (local66 > 0 && local71 > 0 && Static624.anIntArrayArray56[local66 - 1][local71 - 1] == 0 && (local51[local83 - 1][local88 - 1] & 0x43A40000) == 0) {
									local272 = 1;
									while (true) {
										if (arg7 <= local272) {
											Static114.anIntArray117[local46] = local7 - 1;
											Static459.anIntArray400[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static624.anIntArrayArray56[local66 - 1][local71 - 1] = 3;
											Static107.anIntArrayArray9[local66 - 1][local71 - 1] = local232;
											break;
										}
										if ((local51[local83 - 1][local272 + local88 - 1] & 0x4FA40000) != 0 || (local51[local83 + local272 - 1][local88 - 1] & 0x63E40000) != 0) {
											break;
										}
										local272++;
									}
								}
								if (128 - arg7 > local66 && local71 > 0 && Static624.anIntArrayArray56[local66 + 1][local71 - 1] == 0 && (local51[local83 + arg7][local88 - 1] & 0x60E40000) == 0) {
									local272 = 1;
									while (true) {
										if (local272 >= arg7) {
											Static114.anIntArray117[local46] = local7 + 1;
											Static459.anIntArray400[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static624.anIntArrayArray56[local66 + 1][local71 - 1] = 9;
											Static107.anIntArrayArray9[local66 + 1][local71 - 1] = local232;
											break;
										}
										if ((local51[local83 + arg7][local272 + local88 - 1] & 0x78E40000) != 0 || (local51[local272 + local83][local88 - 1] & 0x63E40000) != 0) {
											break;
										}
										local272++;
									}
								}
								if (local66 > 0 && local71 < 128 - arg7 && Static624.anIntArrayArray56[local66 - 1][local71 + 1] == 0 && (local51[local83 - 1][local88 + arg7] & 0x4E240000) == 0) {
									for (local272 = 1; local272 < arg7; local272++) {
										if ((local51[local83 - 1][local88 + local272] & 0x4FA40000) != 0 || (local51[local272 + local83 - 1][local88 + arg7] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static114.anIntArray117[local46] = local7 - 1;
									Static459.anIntArray400[local46] = local9 + 1;
									local46 = local46 + 1 & 0xFFF;
									Static624.anIntArrayArray56[local66 - 1][local71 + 1] = 6;
									Static107.anIntArrayArray9[local66 - 1][local71 + 1] = local232;
								}
							} while (local66 >= 128 - arg7);
						} while (128 - arg7 <= local71);
					} while (Static624.anIntArrayArray56[local66 + 1][local71 + 1] != 0);
				} while ((local51[arg7 + local83][local88 + arg7] & 0x78240000) != 0);
				for (local272 = 1; local272 < arg7; local272++) {
					if ((local51[local83 + local272][arg7 + local88] & 0x7E240000) != 0 || (local51[local83 + arg7][local272 + local88] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static114.anIntArray117[local46] = local7 + 1;
				Static459.anIntArray400[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static624.anIntArrayArray56[local66 + 1][local71 + 1] = 12;
				Static107.anIntArrayArray9[local66 + 1][local71 + 1] = local232;
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!ha;IIIIIIII)V")
	public static void method351(@OriginalArg(0) Class95 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface17 local11 = (Interface17) Static454.method6134(arg4, arg2, arg1);
		@Pc(22) Class216 local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(39) int local39;
		if (local11 != null) {
			local22 = Static466.aClass340_6.method7665(local11.method6661());
			local28 = local11.method6659() & 0x3;
			local32 = local11.method6662();
			if (local22.anInt5957 == -1) {
				local39 = arg6;
				if (local22.anInt5978 > 0) {
					local39 = arg3;
				}
				if (local32 == 0 || local32 == 2) {
					if (local28 == 0) {
						arg0.method8000(arg7, local39, arg5, 4);
					} else if (local28 == 1) {
						arg0.method8066(arg7, 4, arg5, local39);
					} else if (local28 == 2) {
						arg0.method8000(arg7 + 3, local39, arg5, 4);
					} else if (local28 == 3) {
						arg0.method8066(arg7, 4, arg5 + 3, local39);
					}
				}
				if (local32 == 3) {
					if (local28 == 0) {
						arg0.method8054(1, arg5, 1, arg7, local39);
					} else if (local28 == 1) {
						arg0.method8054(1, arg5, 1, arg7 + 3, local39);
					} else if (local28 == 2) {
						arg0.method8054(1, arg5 + 3, 1, arg7 + 3, local39);
					} else if (local28 == 3) {
						arg0.method8054(1, arg5 + 3, 1, arg7, local39);
					}
				}
				if (local32 == 2) {
					if (local28 == 0) {
						arg0.method8066(arg7, 4, arg5, local39);
					} else if (local28 == 1) {
						arg0.method8000(arg7 + 3, local39, arg5, 4);
					} else if (local28 == 2) {
						arg0.method8066(arg7, 4, arg5 + 3, local39);
					} else if (local28 == 3) {
						arg0.method8000(arg7, local39, arg5, 4);
					}
				}
			} else {
				Static106.method1695(local28, arg5, arg7, local22, arg0);
			}
		}
		local11 = (Interface17) Static180.method2823(arg4, arg2, arg1, nf.class);
		if (local11 != null) {
			local22 = Static466.aClass340_6.method7665(local11.method6661());
			local28 = local11.method6659() & 0x3;
			local32 = local11.method6662();
			if (local22.anInt5957 != -1) {
				Static106.method1695(local28, arg5, arg7, local22, arg0);
			} else if (local32 == 9) {
				local39 = -1118482;
				if (local22.anInt5978 > 0) {
					local39 = -1179648;
				}
				if (local28 == 0 || local28 == 2) {
					arg0.method7988(arg5 + 3, local39, arg7 + 3, arg7, arg5);
				} else {
					arg0.method7988(arg5, local39, arg7 + 3, arg7, arg5 + 3);
				}
			}
		}
		local11 = (Interface17) Static609.method8264(arg4, arg2, arg1);
		if (local11 == null) {
			return;
		}
		local22 = Static466.aClass340_6.method7665(local11.method6661());
		local28 = local11.method6659() & 0x3;
		if (local22.anInt5957 != -1) {
			Static106.method1695(local28, arg5, arg7, local22, arg0);
		}
	}
}
