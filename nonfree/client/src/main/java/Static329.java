import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!us;")
	public static final Class234 aClass234_112 = new Class234(76, -2);

	@OriginalMember(owner = "client!te", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!te", name = "j", descriptor = "I")
	public static int anInt5569 = 0;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "I")
	public static int anInt5571 = 0;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)I")
	public static int method5021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static185.anIntArrayArray35 == null ? 0 : Static185.anIntArrayArray35[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!oa;ILclient!km;BILclient!dq;)V")
	public static void method5022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class28_Sub1_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class60 arg6) {
		@Pc(12) Class3_Sub10 local12 = new Class3_Sub10();
		local12.anInt1609 = arg0 * 128;
		local12.anInt1604 = arg3;
		local12.anInt1615 = arg5 * 128;
		if (arg6 != null) {
			local12.aClass60_1 = arg6;
			@Pc(142) int local142 = arg6.anInt1390;
			@Pc(145) int local145 = arg6.anInt1427;
			if (arg1 == 1 || arg1 == 3) {
				local142 = arg6.anInt1427;
				local145 = arg6.anInt1390;
			}
			local12.anInt1612 = arg6.anInt1412;
			local12.anInt1605 = arg6.anInt1400 * 128;
			local12.anInt1614 = (local142 + arg5) * 128;
			local12.anInt1601 = arg6.anInt1385;
			local12.anInt1603 = arg6.anInt1428;
			local12.anInt1613 = arg6.anInt1381;
			local12.anIntArray160 = arg6.anIntArray140;
			local12.anInt1606 = (local145 + arg0) * 128;
			if (arg6.anIntArray134 != null) {
				local12.aBoolean128 = true;
				local12.method1310();
			}
			if (local12.anIntArray160 != null) {
				local12.anInt1610 = local12.anInt1612 + (int) ((double) (local12.anInt1603 - local12.anInt1612) * Math.random());
			}
			Static142.aClass138_17.method3053(local12);
		} else if (arg4 != null) {
			local12.aClass28_Sub1_Sub1_Sub1_1 = arg4;
			@Pc(85) Class61 local85 = arg4.aClass61_1;
			if (local85.anIntArray142 != null) {
				local12.aBoolean128 = true;
				local85 = local85.method1216(Static331.aClass115_1);
			}
			if (local85 != null) {
				local12.anInt1614 = (local85.anInt1467 + arg5) * 128;
				local12.anInt1606 = (local85.anInt1467 + arg0) * 128;
				local12.anInt1601 = Static95.method5453(arg4);
				local12.anInt1605 = local85.anInt1462 * 128;
				local12.anInt1613 = local85.anInt1437;
			}
			Static185.aClass138_23.method3053(local12);
		} else if (arg2 != null) {
			local12.aClass28_Sub1_Sub1_Sub2_1 = arg2;
			local12.anInt1614 = (arg5 + arg2.method4009()) * 128;
			local12.anInt1606 = (arg0 + arg2.method4009()) * 128;
			local12.anInt1601 = Static2.method57(arg2);
			local12.anInt1605 = arg2.anInt4403 * 128;
			local12.anInt1613 = arg2.anInt4388;
			Static332.aClass44_32.method948((long) arg2.anInt4373, local12);
			return;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	public static void method5024() {
		@Pc(8) Class3_Sub7_Sub8 local8 = Static275.method4307(15, 0);
		local8.method3217();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!dt;)V")
	public static void method5026(@OriginalArg(1) Class62 arg0) {
		if (!Static68.aBoolean81) {
			return;
		}
		Static229.method3783(Static331.aClass244_78);
		Static23.aClass3_Sub5_Sub1_1.method2782(arg0.anInt1500);
		Static23.aClass3_Sub5_Sub1_1.method2732(arg0.anInt1510);
		Static23.aClass3_Sub5_Sub1_1.method2749(Static127.anInt2413);
		Static23.aClass3_Sub5_Sub1_1.method2762(Static109.anInt2149);
		Static23.aClass3_Sub5_Sub1_1.method2790(Static242.anInt4268);
		Static23.aClass3_Sub5_Sub1_1.method2727(arg0.anInt1549);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!ee;IBIIIIIIII)Z")
	public static boolean method5027(@OriginalArg(0) int arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg2;
		@Pc(17) int local17 = arg3 - 64;
		@Pc(21) int local21 = arg2 - 64;
		Static221.anIntArrayArray38[64][64] = 99;
		Static389.anIntArrayArray60[64][64] = 0;
		@Pc(35) byte local35 = 0;
		Static136.anIntArray274[0] = arg3;
		@Pc(41) int local41 = 0;
		@Pc(49) int local49 = local35 + 1;
		Static269.anIntArray524[0] = arg2;
		@Pc(54) int[][] local54 = arg1.anIntArrayArray19;
		while (true) {
			label282: while (true) {
				@Pc(80) int local80;
				@Pc(75) int local75;
				@Pc(86) int local86;
				@Pc(91) int local91;
				@Pc(246) int local246;
				@Pc(292) int local292;
				do {
					do {
						do {
							label259: do {
								if (local41 == local49) {
									Static274.anInt4765 = local7;
									Static319.anInt5443 = local9;
									return false;
								}
								local9 = Static269.anIntArray524[local41];
								local7 = Static136.anIntArray274[local41];
								local41 = local41 + 1 & 0xFFF;
								local75 = local9 - local21;
								local80 = local7 - local17;
								local86 = local7 - arg1.anInt1637;
								local91 = local9 - arg1.anInt1639;
								if (arg7 == -4) {
									if (arg8 == local7 && local9 == arg4) {
										Static319.anInt5443 = local9;
										Static274.anInt4765 = local7;
										return true;
									}
								} else if (arg7 == -3) {
									if (Static252.method4104(arg5, arg0, arg9, arg8, local7, arg4, local9, arg9)) {
										Static319.anInt5443 = local9;
										Static274.anInt4765 = local7;
										return true;
									}
								} else if (arg7 == -2) {
									if (arg1.method1323(arg4, arg8, arg0, arg9, local7, arg5, local9, arg9, arg6)) {
										Static274.anInt4765 = local7;
										Static319.anInt5443 = local9;
										return true;
									}
								} else if (arg7 == -1) {
									if (arg1.method1339(local7, arg4, arg9, local9, arg5, arg0, arg8, arg6)) {
										Static319.anInt5443 = local9;
										Static274.anInt4765 = local7;
										return true;
									}
								} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
									if (arg1.method1331(arg10, local9, arg4, local7, arg8, arg9, arg7)) {
										Static319.anInt5443 = local9;
										Static274.anInt4765 = local7;
										return true;
									}
								} else if (arg1.method1326(arg7, local7, local9, arg10, arg9, arg8, arg4)) {
									Static274.anInt4765 = local7;
									Static319.anInt5443 = local9;
									return true;
								}
								local246 = Static389.anIntArrayArray60[local80][local75] + 1;
								if (local80 > 0 && Static221.anIntArrayArray38[local80 - 1][local75] == 0 && (local54[local86 - 1][local91] & 0x43A40000) == 0 && (local54[local86 - 1][local91 + arg9 - 1] & 0x4E240000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg9 - 1) {
											Static136.anIntArray274[local49] = local7 - 1;
											Static269.anIntArray524[local49] = local9;
											local49 = local49 + 1 & 0xFFF;
											Static221.anIntArrayArray38[local80 - 1][local75] = 2;
											Static389.anIntArrayArray60[local80 - 1][local75] = local246;
											break;
										}
										if ((local54[local86 - 1][local292 + local91] & 0x4FA40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (128 - arg9 > local80 && Static221.anIntArrayArray38[local80 + 1][local75] == 0 && (local54[arg9 + local86][local91] & 0x60E40000) == 0 && (local54[arg9 + local86][arg9 + local91 - 1] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (arg9 - 1 <= local292) {
											Static136.anIntArray274[local49] = local7 + 1;
											Static269.anIntArray524[local49] = local9;
											local49 = local49 + 1 & 0xFFF;
											Static221.anIntArrayArray38[local80 + 1][local75] = 8;
											Static389.anIntArrayArray60[local80 + 1][local75] = local246;
											break;
										}
										if ((local54[arg9 + local86][local91 + local292] & 0x78E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local75 > 0 && Static221.anIntArrayArray38[local80][local75 - 1] == 0 && (local54[local86][local91 - 1] & 0x43A40000) == 0 && (local54[arg9 + local86 - 1][local91 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (local292 >= arg9 - 1) {
											Static136.anIntArray274[local49] = local7;
											Static269.anIntArray524[local49] = local9 - 1;
											local49 = local49 + 1 & 0xFFF;
											Static221.anIntArrayArray38[local80][local75 - 1] = 1;
											Static389.anIntArrayArray60[local80][local75 - 1] = local246;
											break;
										}
										if ((local54[local86 + local292][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local75 < 128 - arg9 && Static221.anIntArrayArray38[local80][local75 + 1] == 0 && (local54[local86][arg9 + local91] & 0x4E240000) == 0 && (local54[arg9 + local86 - 1][arg9 + local91] & 0x78240000) == 0) {
									local292 = 1;
									while (true) {
										if (arg9 - 1 <= local292) {
											Static136.anIntArray274[local49] = local7;
											Static269.anIntArray524[local49] = local9 + 1;
											local49 = local49 + 1 & 0xFFF;
											Static221.anIntArrayArray38[local80][local75 + 1] = 4;
											Static389.anIntArrayArray60[local80][local75 + 1] = local246;
											break;
										}
										if ((local54[local292 + local86][local91 + arg9] & 0x7E240000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local80 > 0 && local75 > 0 && Static221.anIntArrayArray38[local80 - 1][local75 - 1] == 0 && (local54[local86 - 1][local91 - 1] & 0x43A40000) == 0) {
									local292 = 1;
									while (true) {
										if (arg9 <= local292) {
											Static136.anIntArray274[local49] = local7 - 1;
											Static269.anIntArray524[local49] = local9 - 1;
											local49 = local49 + 1 & 0xFFF;
											Static221.anIntArrayArray38[local80 - 1][local75 - 1] = 3;
											Static389.anIntArrayArray60[local80 - 1][local75 - 1] = local246;
											break;
										}
										if ((local54[local86 - 1][local91 + local292 - 1] & 0x4FA40000) != 0 || (local54[local86 + local292 - 1][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local80 < 128 - arg9 && local75 > 0 && Static221.anIntArrayArray38[local80 + 1][local75 - 1] == 0 && (local54[arg9 + local86][local91 - 1] & 0x60E40000) == 0) {
									local292 = 1;
									while (true) {
										if (arg9 <= local292) {
											Static136.anIntArray274[local49] = local7 + 1;
											Static269.anIntArray524[local49] = local9 - 1;
											Static221.anIntArrayArray38[local80 + 1][local75 - 1] = 9;
											local49 = local49 + 1 & 0xFFF;
											Static389.anIntArrayArray60[local80 + 1][local75 - 1] = local246;
											break;
										}
										if ((local54[arg9 + local86][local292 + local91 - 1] & 0x78E40000) != 0 || (local54[local292 + local86][local91 - 1] & 0x63E40000) != 0) {
											break;
										}
										local292++;
									}
								}
								if (local80 > 0 && 128 - arg9 > local75 && Static221.anIntArrayArray38[local80 - 1][local75 + 1] == 0 && (local54[local86 - 1][arg9 + local91] & 0x4E240000) == 0) {
									for (local292 = 1; local292 < arg9; local292++) {
										if ((local54[local86 - 1][local91 + local292] & 0x4FA40000) != 0 || (local54[local86 + local292 - 1][arg9 + local91] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static136.anIntArray274[local49] = local7 - 1;
									Static269.anIntArray524[local49] = local9 + 1;
									local49 = local49 + 1 & 0xFFF;
									Static221.anIntArrayArray38[local80 - 1][local75 + 1] = 6;
									Static389.anIntArrayArray60[local80 - 1][local75 + 1] = local246;
								}
							} while (local80 >= 128 - arg9);
						} while (128 - arg9 <= local75);
					} while (Static221.anIntArrayArray38[local80 + 1][local75 + 1] != 0);
				} while ((local54[local86 + arg9][arg9 + local91] & 0x78240000) != 0);
				for (local292 = 1; local292 < arg9; local292++) {
					if ((local54[local86 + local292][arg9 + local91] & 0x7E240000) != 0 || (local54[arg9 + local86][local292 + local91] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static136.anIntArray274[local49] = local7 + 1;
				Static269.anIntArray524[local49] = local9 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static221.anIntArrayArray38[local80 + 1][local75 + 1] = 12;
				Static389.anIntArrayArray60[local80 + 1][local75 + 1] = local246;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IBI)B")
	public static byte method5029(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
