import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qfa", name = "x", descriptor = "Lclient!fs;")
	public static Class134 aClass134_31;

	@OriginalMember(owner = "client!qfa", name = "z", descriptor = "[Lclient!tq;")
	public static Class334[] aClass334Array1;

	@OriginalMember(owner = "client!qfa", name = "E", descriptor = "I")
	public static final int anInt8056 = -1;

	@OriginalMember(owner = "client!qfa", name = "B", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_86 = new Class387(22, 4);

	@OriginalMember(owner = "client!qfa", name = "y", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_13 = new Class370(13, 3);

	@OriginalMember(owner = "client!qfa", name = "A", descriptor = "Lclient!eg;")
	public static final Class5_Sub14 aClass5_Sub14_1 = new Class5_Sub14(0, 0);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(B)V")
	public static void method6932() {
		if (Static604.aClass5_Sub5_Sub18_1 != null) {
			Static604.aClass5_Sub5_Sub18_1 = null;
			Static199.method7894(Static652.anInt10541, Static101.anInt1607, Static422.anInt7304, Static493.anInt8236);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IILclient!dja;IIIIIIIII)Z")
	public static boolean method6934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg7;
		@Pc(17) int local17 = arg3 - 64;
		@Pc(22) int local22 = arg7 - 64;
		Static568.anIntArrayArray53[64][64] = 99;
		Static514.anIntArrayArray48[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static516.anIntArray504[0] = arg3;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static385.anIntArray377[0] = arg7;
		@Pc(56) int[][] local56 = arg2.anIntArrayArray12;
		while (true) {
			label282: while (true) {
				@Pc(82) int local82;
				@Pc(71) int local71;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(276) int local276;
				@Pc(327) int local327;
				do {
					do {
						do {
							label259: do {
								if (local51 == local48) {
									Static377.anInt6461 = local9;
									Static340.anInt6055 = local7;
									return false;
								}
								local9 = Static385.anIntArray377[local48];
								local7 = Static516.anIntArray504[local48];
								local71 = local9 - local22;
								local48 = local48 + 1 & 0xFFF;
								local82 = local7 - local17;
								local87 = local7 - arg2.anInt1778;
								local93 = local9 - arg2.anInt1763;
								if (arg9 == -4) {
									if (local7 == arg1 && local9 == arg0) {
										Static340.anInt6055 = local7;
										Static377.anInt6461 = local9;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static593.method8592(arg1, arg0, arg6, local7, arg4, arg10, arg6, local9)) {
										Static340.anInt6055 = local7;
										Static377.anInt6461 = local9;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg2.method1587(arg6, arg0, local9, arg1, arg8, arg10, local7, arg4, arg6)) {
										Static340.anInt6055 = local7;
										Static377.anInt6461 = local9;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg2.method1575(arg6, arg1, arg4, arg10, local9, arg0, arg8, local7)) {
										Static340.anInt6055 = local7;
										Static377.anInt6461 = local9;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg2.method1590(local9, arg6, -83, local7, arg1, arg5, arg0, arg9)) {
										Static340.anInt6055 = local7;
										Static377.anInt6461 = local9;
										return true;
									}
								} else if (arg2.method1588(arg5, local7, arg9, arg1, local9, arg0, arg6)) {
									Static377.anInt6461 = local9;
									Static340.anInt6055 = local7;
									return true;
								}
								local276 = Static514.anIntArrayArray48[local82][local71] + 1;
								if (local82 > 0 && Static568.anIntArrayArray53[local82 - 1][local71] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + arg6 - 1] & 0x4E240000) == 0) {
									local327 = 1;
									while (true) {
										if (arg6 - 1 <= local327) {
											Static516.anIntArray504[local51] = local7 - 1;
											Static385.anIntArray377[local51] = local9;
											Static568.anIntArrayArray53[local82 - 1][local71] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static514.anIntArrayArray48[local82 - 1][local71] = local276;
											break;
										}
										if ((local56[local87 - 1][local327 + local93] & 0x4FA40000) != 0) {
											break;
										}
										local327++;
									}
								}
								if (local82 < 128 - arg6 && Static568.anIntArrayArray53[local82 + 1][local71] == 0 && (local56[arg6 + local87][local93] & 0x60E40000) == 0 && (local56[arg6 + local87][local93 + arg6 - 1] & 0x78240000) == 0) {
									local327 = 1;
									while (true) {
										if (local327 >= arg6 - 1) {
											Static516.anIntArray504[local51] = local7 + 1;
											Static385.anIntArray377[local51] = local9;
											Static568.anIntArrayArray53[local82 + 1][local71] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static514.anIntArrayArray48[local82 + 1][local71] = local276;
											break;
										}
										if ((local56[arg6 + local87][local327 + local93] & 0x78E40000) != 0) {
											break;
										}
										local327++;
									}
								}
								if (local71 > 0 && Static568.anIntArrayArray53[local82][local71 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[arg6 + local87 - 1][local93 - 1] & 0x60E40000) == 0) {
									local327 = 1;
									while (true) {
										if (local327 >= arg6 - 1) {
											Static516.anIntArray504[local51] = local7;
											Static385.anIntArray377[local51] = local9 - 1;
											Static568.anIntArrayArray53[local82][local71 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static514.anIntArrayArray48[local82][local71 - 1] = local276;
											break;
										}
										if ((local56[local327 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local327++;
									}
								}
								if (local71 < 128 - arg6 && Static568.anIntArrayArray53[local82][local71 + 1] == 0 && (local56[local87][arg6 + local93] & 0x4E240000) == 0 && (local56[local87 + arg6 - 1][local93 + arg6] & 0x78240000) == 0) {
									local327 = 1;
									while (true) {
										if (arg6 - 1 <= local327) {
											Static516.anIntArray504[local51] = local7;
											Static385.anIntArray377[local51] = local9 + 1;
											local51 = local51 + 1 & 0xFFF;
											Static568.anIntArrayArray53[local82][local71 + 1] = 4;
											Static514.anIntArrayArray48[local82][local71 + 1] = local276;
											break;
										}
										if ((local56[local327 + local87][arg6 + local93] & 0x7E240000) != 0) {
											break;
										}
										local327++;
									}
								}
								if (local82 > 0 && local71 > 0 && Static568.anIntArrayArray53[local82 - 1][local71 - 1] == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local327 = 1;
									while (true) {
										if (arg6 <= local327) {
											Static516.anIntArray504[local51] = local7 - 1;
											Static385.anIntArray377[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static568.anIntArrayArray53[local82 - 1][local71 - 1] = 3;
											Static514.anIntArrayArray48[local82 - 1][local71 - 1] = local276;
											break;
										}
										if ((local56[local87 - 1][local93 + local327 - 1] & 0x4FA40000) != 0 || (local56[local87 + local327 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local327++;
									}
								}
								if (local82 < 128 - arg6 && local71 > 0 && Static568.anIntArrayArray53[local82 + 1][local71 - 1] == 0 && (local56[arg6 + local87][local93 - 1] & 0x60E40000) == 0) {
									local327 = 1;
									while (true) {
										if (arg6 <= local327) {
											Static516.anIntArray504[local51] = local7 + 1;
											Static385.anIntArray377[local51] = local9 - 1;
											Static568.anIntArrayArray53[local82 + 1][local71 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static514.anIntArrayArray48[local82 + 1][local71 - 1] = local276;
											break;
										}
										if ((local56[arg6 + local87][local93 + local327 - 1] & 0x78E40000) != 0 || (local56[local87 + local327][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local327++;
									}
								}
								if (local82 > 0 && 128 - arg6 > local71 && Static568.anIntArrayArray53[local82 - 1][local71 + 1] == 0 && (local56[local87 - 1][arg6 + local93] & 0x4E240000) == 0) {
									for (local327 = 1; local327 < arg6; local327++) {
										if ((local56[local87 - 1][local93 + local327] & 0x4FA40000) != 0 || (local56[local87 + local327 - 1][arg6 + local93] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static516.anIntArray504[local51] = local7 - 1;
									Static385.anIntArray377[local51] = local9 + 1;
									Static568.anIntArrayArray53[local82 - 1][local71 + 1] = 6;
									local51 = local51 + 1 & 0xFFF;
									Static514.anIntArrayArray48[local82 - 1][local71 + 1] = local276;
								}
							} while (local82 >= 128 - arg6);
						} while (local71 >= 128 - arg6);
					} while (Static568.anIntArrayArray53[local82 + 1][local71 + 1] != 0);
				} while ((local56[arg6 + local87][arg6 + local93] & 0x78240000) != 0);
				for (local327 = 1; local327 < arg6; local327++) {
					if ((local56[local327 + local87][arg6 + local93] & 0x7E240000) != 0 || (local56[arg6 + local87][local93 + local327] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static516.anIntArray504[local51] = local7 + 1;
				Static385.anIntArray377[local51] = local9 + 1;
				Static568.anIntArrayArray53[local82 + 1][local71 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static514.anIntArrayArray48[local82 + 1][local71 + 1] = local276;
			}
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIIIIILclient!sg;ILclient!ha;I)V")
	public static void method6935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class5_Sub5_Sub19 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class57 arg9, @OriginalArg(11) int arg10) {
		if (arg1 < arg6 && arg6 < arg1 + arg2 && arg4 > arg8 - 13 && arg4 < arg8 + 3 && arg7.aBoolean707) {
			arg5 = arg3;
		}
		@Pc(41) int[] local41 = null;
		if (Static30.method493(arg7.anInt9210)) {
			local41 = Static201.aClass127_1.method2501((int) arg7.aLong267).anIntArray316;
		} else if (arg7.anInt9209 != -1) {
			local41 = Static201.aClass127_1.method2501(arg7.anInt9209).anIntArray316;
		} else if (Static74.method1184((byte) 125, arg7.anInt9210)) {
			@Pc(122) Class5_Sub35 local122 = (Class5_Sub35) Static623.aClass291_43.method6993((long) (int) arg7.aLong267, 1);
			if (local122 != null) {
				@Pc(127) Class8_Sub1_Sub3_Sub2_Sub2 local127 = local122.aClass8_Sub1_Sub3_Sub2_Sub2_2;
				@Pc(130) Class227 local130 = local127.aClass227_1;
				if (local130.anIntArray341 != null) {
					local130 = local130.method5322(Static413.aClass118_1);
				}
				if (local130 != null) {
					local41 = local130.anIntArray342;
				}
			}
		} else if (Static408.method6016(arg7.anInt9210)) {
			@Pc(87) Class55 local87;
			if (arg7.anInt9210 == 1003) {
				local87 = Static536.aClass392_2.method9293(0, (int) arg7.aLong267);
			} else {
				local87 = Static536.aClass392_2.method9293(0, (int) (arg7.aLong267 >>> 32 & 0x7FFFFFFFL));
			}
			if (local87.anIntArray46 != null) {
				local87 = local87.method847(Static413.aClass118_1);
			}
			if (local87 != null) {
				local41 = local87.anIntArray47;
			}
		}
		@Pc(156) String local156 = Static442.method6549(arg7);
		if (local41 != null) {
			local156 = local156 + Static459.method6733(local41);
		}
		Static533.aClass80_10.method8789(local156, Static118.anIntArray17, Static494.aClass134Array13, arg1 + 3, arg8, arg5);
		if (arg7.aBoolean708) {
			Static264.aClass134_25.method9235(arg1 + Static594.aClass224_12.method5256(local156) + 5, arg8 + -12);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIBLclient!ic;I)V")
	public static void method6936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub1_Sub3_Sub2_Sub1 arg2) {
		@Pc(18) int local18 = arg2.anIntArray414[0];
		@Pc(23) int local23 = arg2.anIntArray415[0];
		if (local18 < 0 || Static544.anInt9261 <= local18 || local23 < 0 || local23 >= Static282.anInt4887 || (arg0 < 0 || arg0 >= Static544.anInt9261 || arg1 < 0 || arg1 >= Static282.anInt4887)) {
			return;
		}
		@Pc(91) int local91 = Static429.method6353(local23, Static670.aClass88Array1[arg2.aByte145], arg1, 0, 0, Static196.anIntArray186, arg2.method5993(), -4, Static106.anIntArray93, 0, arg0, 0, true, local18);
		if (local91 >= 1 && local91 <= 3) {
			for (@Pc(107) int local107 = 0; local107 < local91 - 1; local107++) {
				arg2.method3603((byte) 2, Static106.anIntArray93[local107], Static196.anIntArray186[local107]);
			}
		}
	}
}
