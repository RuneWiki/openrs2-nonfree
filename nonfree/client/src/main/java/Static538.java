import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_27 = new Class118(60);

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "S")
	public static short aShort115 = 1;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method7528() {
		Static33.aClass85_3.method1748();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Z")
	public static boolean method7529(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIILclient!lka;IIIIIIIB)Z")
	public static boolean method7530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class226 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg1;
		@Pc(17) int local17 = arg8 - 64;
		Static313.anIntArrayArray38[64][64] = 99;
		@Pc(34) int local34 = arg1 - 64;
		Static171.anIntArrayArray19[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static564.anIntArray640[0] = arg8;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static585.anIntArray674[0] = arg1;
		@Pc(56) int[][] local56 = arg3.anIntArrayArray41;
		while (true) {
			label282: while (true) {
				@Pc(76) int local76;
				@Pc(71) int local71;
				@Pc(88) int local88;
				@Pc(93) int local93;
				@Pc(273) int local273;
				@Pc(318) int local318;
				do {
					do {
						do {
							label259: do {
								if (local48 == local51) {
									Static653.anInt10222 = local9;
									Static313.anInt4796 = local7;
									return false;
								}
								local7 = Static564.anIntArray640[local48];
								local9 = Static585.anIntArray674[local48];
								local71 = local9 - local34;
								local76 = local7 - local17;
								local48 = local48 + 1 & 0xFFF;
								local88 = local7 - arg3.anInt5905;
								local93 = local9 - arg3.anInt5886;
								if (arg0 == -4) {
									if (arg6 == local7 && local9 == arg10) {
										Static653.anInt10222 = local9;
										Static313.anInt4796 = local7;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static397.method5858(arg4, arg5, local7, arg4, arg6, arg2, local9, arg10)) {
										Static653.anInt10222 = local9;
										Static313.anInt4796 = local7;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg3.method5271(arg6, local7, local9, arg7, arg4, arg2, arg10, arg5, arg4)) {
										Static313.anInt4796 = local7;
										Static653.anInt10222 = local9;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg3.method5273(arg5, arg7, local9, arg6, arg4, arg10, arg2, local7)) {
										Static653.anInt10222 = local9;
										Static313.anInt4796 = local7;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg3.method5277(arg9, arg4, arg0, arg6, local9, local7, arg10)) {
										Static653.anInt10222 = local9;
										Static313.anInt4796 = local7;
										return true;
									}
								} else if (arg3.method5272(arg4, arg0, arg9, arg6, arg10, local9, local7)) {
									Static313.anInt4796 = local7;
									Static653.anInt10222 = local9;
									return true;
								}
								local273 = Static171.anIntArrayArray19[local76][local71] + 1;
								if (local76 > 0 && Static313.anIntArrayArray38[local76 - 1][local71] == 0 && (local56[local88 - 1][local93] & 0x43A40000) == 0 && (local56[local88 - 1][arg4 + local93 - 1] & 0x4E240000) == 0) {
									local318 = 1;
									while (true) {
										if (local318 >= arg4 - 1) {
											Static564.anIntArray640[local51] = local7 - 1;
											Static585.anIntArray674[local51] = local9;
											Static313.anIntArrayArray38[local76 - 1][local71] = 2;
											local51 = local51 + 1 & 0xFFF;
											Static171.anIntArrayArray19[local76 - 1][local71] = local273;
											break;
										}
										if ((local56[local88 - 1][local93 + local318] & 0x4FA40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local76 < 128 - arg4 && Static313.anIntArrayArray38[local76 + 1][local71] == 0 && (local56[local88 + arg4][local93] & 0x60E40000) == 0 && (local56[arg4 + local88][local93 + arg4 - 1] & 0x78240000) == 0) {
									local318 = 1;
									while (true) {
										if (arg4 - 1 <= local318) {
											Static564.anIntArray640[local51] = local7 + 1;
											Static585.anIntArray674[local51] = local9;
											Static313.anIntArrayArray38[local76 + 1][local71] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static171.anIntArrayArray19[local76 + 1][local71] = local273;
											break;
										}
										if ((local56[arg4 + local88][local318 + local93] & 0x78E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local71 > 0 && Static313.anIntArrayArray38[local76][local71 - 1] == 0 && (local56[local88][local93 - 1] & 0x43A40000) == 0 && (local56[local88 + arg4 - 1][local93 - 1] & 0x60E40000) == 0) {
									local318 = 1;
									while (true) {
										if (arg4 - 1 <= local318) {
											Static564.anIntArray640[local51] = local7;
											Static585.anIntArray674[local51] = local9 - 1;
											Static313.anIntArrayArray38[local76][local71 - 1] = 1;
											local51 = local51 + 1 & 0xFFF;
											Static171.anIntArrayArray19[local76][local71 - 1] = local273;
											break;
										}
										if ((local56[local318 + local88][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (128 - arg4 > local71 && Static313.anIntArrayArray38[local76][local71 + 1] == 0 && (local56[local88][arg4 + local93] & 0x4E240000) == 0 && (local56[arg4 + local88 - 1][local93 + arg4] & 0x78240000) == 0) {
									local318 = 1;
									while (true) {
										if (local318 >= arg4 - 1) {
											Static564.anIntArray640[local51] = local7;
											Static585.anIntArray674[local51] = local9 + 1;
											Static313.anIntArrayArray38[local76][local71 + 1] = 4;
											local51 = local51 + 1 & 0xFFF;
											Static171.anIntArrayArray19[local76][local71 + 1] = local273;
											break;
										}
										if ((local56[local88 + local318][arg4 + local93] & 0x7E240000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local76 > 0 && local71 > 0 && Static313.anIntArrayArray38[local76 - 1][local71 - 1] == 0 && (local56[local88 - 1][local93 - 1] & 0x43A40000) == 0) {
									local318 = 1;
									while (true) {
										if (arg4 <= local318) {
											Static564.anIntArray640[local51] = local7 - 1;
											Static585.anIntArray674[local51] = local9 - 1;
											Static313.anIntArrayArray38[local76 - 1][local71 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static171.anIntArrayArray19[local76 - 1][local71 - 1] = local273;
											break;
										}
										if ((local56[local88 - 1][local93 + local318 - 1] & 0x4FA40000) != 0 || (local56[local318 + local88 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local76 < 128 - arg4 && local71 > 0 && Static313.anIntArrayArray38[local76 + 1][local71 - 1] == 0 && (local56[arg4 + local88][local93 - 1] & 0x60E40000) == 0) {
									local318 = 1;
									while (true) {
										if (local318 >= arg4) {
											Static564.anIntArray640[local51] = local7 + 1;
											Static585.anIntArray674[local51] = local9 - 1;
											Static313.anIntArrayArray38[local76 + 1][local71 - 1] = 9;
											local51 = local51 + 1 & 0xFFF;
											Static171.anIntArrayArray19[local76 + 1][local71 - 1] = local273;
											break;
										}
										if ((local56[local88 + arg4][local318 + local93 - 1] & 0x78E40000) != 0 || (local56[local318 + local88][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local318++;
									}
								}
								if (local76 > 0 && local71 < 128 - arg4 && Static313.anIntArrayArray38[local76 - 1][local71 + 1] == 0 && (local56[local88 - 1][arg4 + local93] & 0x4E240000) == 0) {
									for (local318 = 1; local318 < arg4; local318++) {
										if ((local56[local88 - 1][local93 + local318] & 0x4FA40000) != 0 || (local56[local318 + local88 - 1][local93 + arg4] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static564.anIntArray640[local51] = local7 - 1;
									Static585.anIntArray674[local51] = local9 + 1;
									local51 = local51 + 1 & 0xFFF;
									Static313.anIntArrayArray38[local76 - 1][local71 + 1] = 6;
									Static171.anIntArrayArray19[local76 - 1][local71 + 1] = local273;
								}
							} while (128 - arg4 <= local76);
						} while (local71 >= 128 - arg4);
					} while (Static313.anIntArrayArray38[local76 + 1][local71 + 1] != 0);
				} while ((local56[local88 + arg4][local93 + arg4] & 0x78240000) != 0);
				for (local318 = 1; local318 < arg4; local318++) {
					if ((local56[local88 + local318][arg4 + local93] & 0x7E240000) != 0 || (local56[local88 + arg4][local318 + local93] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static564.anIntArray640[local51] = local7 + 1;
				Static585.anIntArray674[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static313.anIntArrayArray38[local76 + 1][local71 + 1] = 12;
				Static171.anIntArrayArray19[local76 + 1][local71 + 1] = local273;
			}
		}
	}
}
