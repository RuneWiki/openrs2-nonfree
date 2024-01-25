import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cp", name = "z", descriptor = "Lclient!ot;")
	public static Class187 aClass187_1;

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_19 = new Class267("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!cp", name = "D", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_20 = new Class267("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!cp", name = "F", descriptor = "[I")
	public static final int[] anIntArray89 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IZI)V")
	public static void method1217(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static237.aClass166_8.method3892(Static214.aClass267_55.method6581(Static161.anInt3239));
		@Pc(24) int local24;
		for (@Pc(18) Class6_Sub40 local18 = (Class6_Sub40) Static292.aClass244_25.method5976(); local18 != null; local18 = (Class6_Sub40) Static292.aClass244_25.method5964()) {
			local24 = Static41.method958(local18);
			if (local24 > local13) {
				local13 = local24;
			}
		}
		local13 += 8;
		local24 = Static151.anInt3129 * 16 + 21;
		@Pc(50) int local50 = arg0 - local13 / 2;
		if (local13 + local50 > Static348.anInt6272) {
			local50 = Static348.anInt6272 - local13;
		}
		if (local50 < 0) {
			local50 = 0;
		}
		@Pc(70) int local70 = arg1;
		if (local24 + arg1 > Static199.anInt3767) {
			local70 = Static199.anInt3767 - local24;
		}
		Static187.anInt3647 = local50;
		if (local70 < 0) {
			local70 = 0;
		}
		Static230.anInt4199 = (Static215.aBoolean261 ? 26 : 22) + Static151.anInt3129 * 16;
		Static382.anInt4224 = local13;
		Static200.anInt3772 = local70;
		Static250.aBoolean294 = true;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIILclient!qo;IIIII)Z")
	public static boolean method1221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class210 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(7) int local7 = arg10;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg10 - 64;
		@Pc(22) int local22 = arg3 - 64;
		Static336.anIntArrayArray37[64][64] = 99;
		Static203.anIntArrayArray25[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static146.anIntArray183[0] = arg10;
		@Pc(42) int local42 = 0;
		@Pc(53) int local53 = local36 + 1;
		Static190.anIntArray25[0] = arg3;
		@Pc(58) int[][] local58 = arg6.anIntArrayArray34;
		while (true) {
			label282: while (true) {
				@Pc(84) int local84;
				@Pc(73) int local73;
				@Pc(89) int local89;
				@Pc(95) int local95;
				@Pc(249) int local249;
				@Pc(291) int local291;
				do {
					do {
						do {
							label259: do {
								if (local42 == local53) {
									Static446.anInt8003 = local9;
									Static219.anInt3951 = local7;
									return false;
								}
								local7 = Static146.anIntArray183[local42];
								local9 = Static190.anIntArray25[local42];
								local73 = local9 - local22;
								local42 = local42 + 1 & 0xFFF;
								local84 = local7 - local18;
								local89 = local7 - arg6.anInt5599;
								local95 = local9 - arg6.anInt5598;
								if (arg1 == -4) {
									if (arg7 == local7 && local9 == arg9) {
										Static446.anInt8003 = local9;
										Static219.anInt3951 = local7;
										return true;
									}
								} else if (arg1 == -3) {
									if (Static9.method304(arg4, arg9, arg7, local9, arg2, local7, arg5, arg2)) {
										Static446.anInt8003 = local9;
										Static219.anInt3951 = local7;
										return true;
									}
								} else if (arg1 == -2) {
									if (arg6.method4711(local7, arg4, arg5, arg2, arg0, local9, arg7, arg9, arg2)) {
										Static219.anInt3951 = local7;
										Static446.anInt8003 = local9;
										return true;
									}
								} else if (arg1 == -1) {
									if (arg6.method4703(arg2, arg7, arg4, arg9, local9, arg5, arg0, local7)) {
										Static219.anInt3951 = local7;
										Static446.anInt8003 = local9;
										return true;
									}
								} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
									if (arg6.method4704(local7, arg8, arg2, arg1, arg7, arg9, local9)) {
										Static446.anInt8003 = local9;
										Static219.anInt3951 = local7;
										return true;
									}
								} else if (arg6.method4712(arg1, arg2, arg7, arg8, arg9, local9, local7)) {
									Static219.anInt3951 = local7;
									Static446.anInt8003 = local9;
									return true;
								}
								local249 = Static203.anIntArrayArray25[local84][local73] + 1;
								if (local84 > 0 && Static336.anIntArrayArray37[local84 - 1][local73] == 0 && (local58[local89 - 1][local95] & 0x43A40000) == 0 && (local58[local89 - 1][arg2 + local95 - 1] & 0x4E240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg2 - 1 <= local291) {
											Static146.anIntArray183[local53] = local7 - 1;
											Static190.anIntArray25[local53] = local9;
											Static336.anIntArrayArray37[local84 - 1][local73] = 2;
											local53 = local53 + 1 & 0xFFF;
											Static203.anIntArrayArray25[local84 - 1][local73] = local249;
											break;
										}
										if ((local58[local89 - 1][local95 + local291] & 0x4FA40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg2 > local84 && Static336.anIntArrayArray37[local84 + 1][local73] == 0 && (local58[arg2 + local89][local95] & 0x60E40000) == 0 && (local58[arg2 + local89][local95 + arg2 - 1] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg2 - 1) {
											Static146.anIntArray183[local53] = local7 + 1;
											Static190.anIntArray25[local53] = local9;
											Static336.anIntArrayArray37[local84 + 1][local73] = 8;
											local53 = local53 + 1 & 0xFFF;
											Static203.anIntArrayArray25[local84 + 1][local73] = local249;
											break;
										}
										if ((local58[arg2 + local89][local291 + local95] & 0x78E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local73 > 0 && Static336.anIntArrayArray37[local84][local73 - 1] == 0 && (local58[local89][local95 - 1] & 0x43A40000) == 0 && (local58[arg2 + local89 - 1][local95 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg2 - 1) {
											Static146.anIntArray183[local53] = local7;
											Static190.anIntArray25[local53] = local9 - 1;
											Static336.anIntArrayArray37[local84][local73 - 1] = 1;
											local53 = local53 + 1 & 0xFFF;
											Static203.anIntArrayArray25[local84][local73 - 1] = local249;
											break;
										}
										if ((local58[local291 + local89][local95 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local73 < 128 - arg2 && Static336.anIntArrayArray37[local84][local73 + 1] == 0 && (local58[local89][arg2 + local95] & 0x4E240000) == 0 && (local58[arg2 + local89 - 1][arg2 + local95] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg2 - 1 <= local291) {
											Static146.anIntArray183[local53] = local7;
											Static190.anIntArray25[local53] = local9 + 1;
											local53 = local53 + 1 & 0xFFF;
											Static336.anIntArrayArray37[local84][local73 + 1] = 4;
											Static203.anIntArrayArray25[local84][local73 + 1] = local249;
											break;
										}
										if ((local58[local291 + local89][arg2 + local95] & 0x7E240000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local84 > 0 && local73 > 0 && Static336.anIntArrayArray37[local84 - 1][local73 - 1] == 0 && (local58[local89 - 1][local95 - 1] & 0x43A40000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg2) {
											Static146.anIntArray183[local53] = local7 - 1;
											Static190.anIntArray25[local53] = local9 - 1;
											local53 = local53 + 1 & 0xFFF;
											Static336.anIntArrayArray37[local84 - 1][local73 - 1] = 3;
											Static203.anIntArrayArray25[local84 - 1][local73 - 1] = local249;
											break;
										}
										if ((local58[local89 - 1][local95 + local291 - 1] & 0x4FA40000) != 0 || (local58[local89 + local291 - 1][local95 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg2 > local84 && local73 > 0 && Static336.anIntArrayArray37[local84 + 1][local73 - 1] == 0 && (local58[local89 + arg2][local95 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg2 <= local291) {
											Static146.anIntArray183[local53] = local7 + 1;
											Static190.anIntArray25[local53] = local9 - 1;
											Static336.anIntArrayArray37[local84 + 1][local73 - 1] = 9;
											local53 = local53 + 1 & 0xFFF;
											Static203.anIntArrayArray25[local84 + 1][local73 - 1] = local249;
											break;
										}
										if ((local58[arg2 + local89][local95 + local291 - 1] & 0x78E40000) != 0 || (local58[local89 + local291][local95 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local84 > 0 && 128 - arg2 > local73 && Static336.anIntArrayArray37[local84 - 1][local73 + 1] == 0 && (local58[local89 - 1][arg2 + local95] & 0x4E240000) == 0) {
									for (local291 = 1; local291 < arg2; local291++) {
										if ((local58[local89 - 1][local291 + local95] & 0x4FA40000) != 0 || (local58[local89 + local291 - 1][local95 + arg2] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static146.anIntArray183[local53] = local7 - 1;
									Static190.anIntArray25[local53] = local9 + 1;
									Static336.anIntArrayArray37[local84 - 1][local73 + 1] = 6;
									local53 = local53 + 1 & 0xFFF;
									Static203.anIntArrayArray25[local84 - 1][local73 + 1] = local249;
								}
							} while (local84 >= 128 - arg2);
						} while (local73 >= 128 - arg2);
					} while (Static336.anIntArrayArray37[local84 + 1][local73 + 1] != 0);
				} while ((local58[local89 + arg2][arg2 + local95] & 0x78240000) != 0);
				for (local291 = 1; local291 < arg2; local291++) {
					if ((local58[local291 + local89][local95 + arg2] & 0x7E240000) != 0 || (local58[arg2 + local89][local95 + local291] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static146.anIntArray183[local53] = local7 + 1;
				Static190.anIntArray25[local53] = local9 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static336.anIntArrayArray37[local84 + 1][local73 + 1] = 12;
				Static203.anIntArrayArray25[local84 + 1][local73 + 1] = local249;
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
	public static void method1222(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg3) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) String local25 = arg2[local19];
		arg2[local19] = arg2[arg3];
		arg2[arg3] = local25;
		@Pc(39) short local39 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local39;
		for (@Pc(51) int local51 = arg0; local51 < arg3; local51++) {
			if (local25 == null || arg2[local51] != null && (local51 & 0x1) > arg2[local51].compareTo(local25)) {
				@Pc(76) String local76 = arg2[local51];
				arg2[local51] = arg2[local21];
				arg2[local21] = local76;
				@Pc(90) short local90 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21++] = local90;
			}
		}
		arg2[arg3] = arg2[local21];
		arg2[local21] = local25;
		arg1[arg3] = arg1[local21];
		arg1[local21] = local39;
		method1222(arg0, arg1, arg2, local21 - 1);
		method1222(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIB)Z")
	public static boolean method1223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)V")
	public static void method1224() {
		if (!Static174.aBoolean224) {
			return;
		}
		@Pc(11) Class239 local11 = Static251.method5357(Static190.anInt653, Static363.anInt6463);
		if (local11 != null && local11.anObjectArray13 != null) {
			@Pc(20) Class6_Sub42 local20 = new Class6_Sub42();
			local20.aClass239_13 = local11;
			local20.anObjectArray36 = local11.anObjectArray13;
			Static166.method2744(local20);
		}
		Static174.aBoolean224 = false;
		Static76.anInt7824 = -1;
		Static327.anInt5630 = -1;
		if (local11 != null) {
			Static437.method6328(local11);
		}
	}

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "(I)V")
	public static void method1228() {
		@Pc(5) byte local5 = 0;
		if (Static291.aClass28_Sub1_1.aBoolean74) {
			local5 = 55;
		}
		Static263.method4004(local5);
		Static448.aClass104_4.method2618(local5);
		Static380.aClass231_2.method5639(local5);
		Static235.aClass263_2.method6410(local5);
		Static141.aClass141_2.method3179(local5);
		Static41.method960(local5);
		Static179.method2951(local5);
		Static184.method2978(local5);
		Static265.method4073(local5);
		if (Static217.anInt3941 == 10) {
			Static100.method1818(28);
		} else if (Static217.anInt3941 == 30) {
			Static100.method1818(25);
		}
	}
}
