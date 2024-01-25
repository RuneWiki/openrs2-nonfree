import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public static int anInt899 = 0;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "[I")
	public static final int[] anIntArray66 = new int[1];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
	public static void method835(@OriginalArg(0) int arg0) {
		Static435.anInt7668 = arg0;
		Static107.anInt2341 = -1;
		Static201.anInt3833 = -1;
		Static117.method2269();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!gp;)V")
	public static void method836(@OriginalArg(1) Class117 arg0) {
		Static220.anInt4154 = arg0.method2982("p11_full");
		Static357.anInt6718 = arg0.method2982("p12_full");
		Static59.anInt1209 = arg0.method2982("b12_full");
		Static381.anInt6973 = arg0.method2982("hitmarks");
		Static260.anInt8431 = arg0.method2982("hitbar_default");
		Static367.anInt6862 = arg0.method2982("timerbar_default");
		Static444.anInt7777 = arg0.method2982("headicons_pk");
		Static215.anInt4079 = arg0.method2982("headicons_prayer");
		Static504.anInt8610 = arg0.method2982("hint_headicons");
		Static198.anInt3798 = arg0.method2982("hint_mapmarkers");
		Static366.anInt6857 = arg0.method2982("mapflag");
		Static361.anInt6767 = arg0.method2982("cross");
		Static209.anInt3904 = arg0.method2982("mapdots");
		Static250.anInt5059 = arg0.method2982("scrollbar");
		Static320.anInt6181 = arg0.method2982("name_icons");
		Static2.anInt64 = arg0.method2982("floorshadows");
		Static453.anInt7863 = arg0.method2982("compass");
		Static56.anInt1180 = arg0.method2982("otherlevel");
		Static147.anInt3076 = arg0.method2982("hint_mapedge");
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIILclient!aea;IIIIIIII)Z")
	public static boolean method838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg4 - 64;
		Static453.anIntArrayArray66[64][64] = 99;
		@Pc(29) int local29 = arg8 - 64;
		Static167.anIntArrayArray23[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(44) int local44 = 0;
		Static271.anIntArray364[0] = arg4;
		@Pc(51) int local51 = local37 + 1;
		Static242.anIntArray309[0] = arg8;
		@Pc(56) int[][] local56 = arg3.anIntArrayArray2;
		while (true) {
			label282: while (true) {
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(249) int local249;
				@Pc(295) int local295;
				do {
					do {
						do {
							label259: do {
								if (local44 == local51) {
									Static134.anInt2782 = local9;
									Static128.anInt2699 = local7;
									return false;
								}
								local7 = Static271.anIntArray364[local44];
								local9 = Static242.anIntArray309[local44];
								local71 = local7 - local18;
								local76 = local9 - local29;
								local44 = local44 + 1 & 0xFFF;
								local87 = local7 - arg3.anInt163;
								local93 = local9 - arg3.anInt162;
								if (arg6 == -4) {
									if (local7 == arg10 && arg2 == local9) {
										Static128.anInt2699 = local7;
										Static134.anInt2782 = local9;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static535.method7289(local7, arg9, arg7, arg1, arg1, arg10, local9, arg2)) {
										Static128.anInt2699 = local7;
										Static134.anInt2782 = local9;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg3.method304(arg0, arg10, arg9, arg2, arg7, arg1, arg1, local7, local9)) {
										Static134.anInt2782 = local9;
										Static128.anInt2699 = local7;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg3.method312(local9, arg0, local7, arg7, arg9, arg1, arg2, arg10)) {
										Static128.anInt2699 = local7;
										Static134.anInt2782 = local9;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg3.method316(local7, arg2, local9, arg10, arg1, arg5, arg6)) {
										Static134.anInt2782 = local9;
										Static128.anInt2699 = local7;
										return true;
									}
								} else if (arg3.method311(arg5, local9, arg6, arg10, local7, arg1, arg2)) {
									Static134.anInt2782 = local9;
									Static128.anInt2699 = local7;
									return true;
								}
								local249 = Static167.anIntArrayArray23[local71][local76] + 1;
								if (local71 > 0 && Static453.anIntArrayArray66[local71 - 1][local76] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + arg1 - 1] & 0x4E240000) == 0) {
									local295 = 1;
									while (true) {
										if (local295 >= arg1 - 1) {
											Static271.anIntArray364[local51] = local7 - 1;
											Static242.anIntArray309[local51] = local9;
											local51 = local51 + 1 & 0xFFF;
											Static453.anIntArrayArray66[local71 - 1][local76] = 2;
											Static167.anIntArrayArray23[local71 - 1][local76] = local249;
											break;
										}
										if ((local56[local87 - 1][local295 + local93] & 0x4FA40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local71 < 128 - arg1 && Static453.anIntArrayArray66[local71 + 1][local76] == 0 && (local56[local87 + arg1][local93] & 0x60E40000) == 0 && (local56[arg1 + local87][local93 + arg1 - 1] & 0x78240000) == 0) {
									local295 = 1;
									while (true) {
										if (arg1 - 1 <= local295) {
											Static271.anIntArray364[local51] = local7 + 1;
											Static242.anIntArray309[local51] = local9;
											Static453.anIntArrayArray66[local71 + 1][local76] = 8;
											local51 = local51 + 1 & 0xFFF;
											Static167.anIntArrayArray23[local71 + 1][local76] = local249;
											break;
										}
										if ((local56[local87 + arg1][local295 + local93] & 0x78E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local76 > 0 && Static453.anIntArrayArray66[local71][local76 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[local87 + arg1 - 1][local93 - 1] & 0x60E40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg1 - 1 <= local295) {
											Static271.anIntArray364[local51] = local7;
											Static242.anIntArray309[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static453.anIntArrayArray66[local71][local76 - 1] = 1;
											Static167.anIntArrayArray23[local71][local76 - 1] = local249;
											break;
										}
										if ((local56[local87 + local295][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (128 - arg1 > local76 && Static453.anIntArrayArray66[local71][local76 + 1] == 0 && (local56[local87][local93 + arg1] & 0x4E240000) == 0 && (local56[local87 + arg1 - 1][local93 + arg1] & 0x78240000) == 0) {
									local295 = 1;
									while (true) {
										if (arg1 - 1 <= local295) {
											Static271.anIntArray364[local51] = local7;
											Static242.anIntArray309[local51] = local9 + 1;
											local51 = local51 + 1 & 0xFFF;
											Static453.anIntArrayArray66[local71][local76 + 1] = 4;
											Static167.anIntArrayArray23[local71][local76 + 1] = local249;
											break;
										}
										if ((local56[local87 + local295][arg1 + local93] & 0x7E240000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local71 > 0 && local76 > 0 && Static453.anIntArrayArray66[local71 - 1][local76 - 1] == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg1 <= local295) {
											Static271.anIntArray364[local51] = local7 - 1;
											Static242.anIntArray309[local51] = local9 - 1;
											Static453.anIntArrayArray66[local71 - 1][local76 - 1] = 3;
											local51 = local51 + 1 & 0xFFF;
											Static167.anIntArrayArray23[local71 - 1][local76 - 1] = local249;
											break;
										}
										if ((local56[local87 - 1][local295 + local93 - 1] & 0x4FA40000) != 0 || (local56[local87 + local295 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (128 - arg1 > local71 && local76 > 0 && Static453.anIntArrayArray66[local71 + 1][local76 - 1] == 0 && (local56[local87 + arg1][local93 - 1] & 0x60E40000) == 0) {
									local295 = 1;
									while (true) {
										if (arg1 <= local295) {
											Static271.anIntArray364[local51] = local7 + 1;
											Static242.anIntArray309[local51] = local9 - 1;
											local51 = local51 + 1 & 0xFFF;
											Static453.anIntArrayArray66[local71 + 1][local76 - 1] = 9;
											Static167.anIntArrayArray23[local71 + 1][local76 - 1] = local249;
											break;
										}
										if ((local56[local87 + arg1][local93 + local295 - 1] & 0x78E40000) != 0 || (local56[local295 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local295++;
									}
								}
								if (local71 > 0 && local76 < 128 - arg1 && Static453.anIntArrayArray66[local71 - 1][local76 + 1] == 0 && (local56[local87 - 1][arg1 + local93] & 0x4E240000) == 0) {
									for (local295 = 1; local295 < arg1; local295++) {
										if ((local56[local87 - 1][local93 + local295] & 0x4FA40000) != 0 || (local56[local87 + local295 - 1][arg1 + local93] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static271.anIntArray364[local51] = local7 - 1;
									Static242.anIntArray309[local51] = local9 + 1;
									local51 = local51 + 1 & 0xFFF;
									Static453.anIntArrayArray66[local71 - 1][local76 + 1] = 6;
									Static167.anIntArrayArray23[local71 - 1][local76 + 1] = local249;
								}
							} while (local71 >= 128 - arg1);
						} while (128 - arg1 <= local76);
					} while (Static453.anIntArrayArray66[local71 + 1][local76 + 1] != 0);
				} while ((local56[arg1 + local87][local93 + arg1] & 0x78240000) != 0);
				for (local295 = 1; local295 < arg1; local295++) {
					if ((local56[local295 + local87][local93 + arg1] & 0x7E240000) != 0 || (local56[local87 + arg1][local295 + local93] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static271.anIntArray364[local51] = local7 + 1;
				Static242.anIntArray309[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static453.anIntArrayArray66[local71 + 1][local76 + 1] = 12;
				Static167.anIntArrayArray23[local71 + 1][local76 + 1] = local249;
			}
		}
	}
}
