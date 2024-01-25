import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "Lclient!qo;")
	public static final Class190 aClass190_7 = new Class190("", 15);

	@OriginalMember(owner = "client!pf", name = "I", descriptor = "Lclient!gd;")
	public static final Class90 aClass90_1 = new Class90(128);

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
	public static int anInt5364 = 0;

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[16];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method4311(@OriginalArg(1) String arg0) {
		@Pc(9) String local9 = Static379.method5191(Static315.method4683(arg0));
		if (local9 == null) {
			local9 = "";
		}
		return local9;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
	public static void method4315() {
		if (Static349.aClass109_2 != null) {
			Static349.aClass109_2.method4713();
			Static349.aClass109_2 = null;
			Static240.aClass129_3 = null;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!id;IIIIIIIIII)Z")
	public static boolean method4316(@OriginalArg(1) Class112 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(14) int local14 = arg2;
		@Pc(16) int local16 = arg3;
		@Pc(25) int local25 = arg2 - 64;
		@Pc(30) int local30 = arg3 - 64;
		Static45.anIntArrayArray23[64][64] = 99;
		Static378.anIntArrayArray183[64][64] = 0;
		@Pc(44) byte local44 = 0;
		Static221.anIntArray325[0] = arg2;
		@Pc(50) int local50 = 0;
		@Pc(53) int local53 = local44 + 1;
		Static179.anIntArray273[0] = arg3;
		@Pc(58) int[][] local58 = arg0.anIntArrayArray90;
		while (true) {
			label282: while (true) {
				@Pc(78) int local78;
				@Pc(83) int local83;
				@Pc(89) int local89;
				@Pc(95) int local95;
				@Pc(254) int local254;
				@Pc(296) int local296;
				do {
					do {
						do {
							label259: do {
								if (local53 == local50) {
									Static247.anInt3930 = local14;
									Static66.anInt1364 = local16;
									return false;
								}
								local14 = Static221.anIntArray325[local50];
								local16 = Static179.anIntArray273[local50];
								local50 = local50 + 1 & 0xFFF;
								local78 = local14 - local25;
								local83 = local16 - local30;
								local89 = local14 - arg0.anInt3133;
								local95 = local16 - arg0.anInt3142;
								if (arg6 == -4) {
									if (local14 == arg5 && local16 == arg7) {
										Static66.anInt1364 = local16;
										Static247.anInt3930 = local14;
										return true;
									}
								} else if (arg6 == -3) {
									if (Static44.method729(local14, arg8, arg7, arg4, local16, arg5, arg9, arg8)) {
										Static66.anInt1364 = local16;
										Static247.anInt3930 = local14;
										return true;
									}
								} else if (arg6 == -2) {
									if (arg0.method2695(arg4, arg8, local16, arg10, local14, arg8, arg7, arg5, arg9)) {
										Static66.anInt1364 = local16;
										Static247.anInt3930 = local14;
										return true;
									}
								} else if (arg6 == -1) {
									if (arg0.method2690(arg7, arg4, arg5, local14, arg9, local16, arg8, arg10)) {
										Static66.anInt1364 = local16;
										Static247.anInt3930 = local14;
										return true;
									}
								} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
									if (arg0.method2682(arg7, arg1, local14, arg6, local16, arg8, arg5)) {
										Static247.anInt3930 = local14;
										Static66.anInt1364 = local16;
										return true;
									}
								} else if (arg0.method2687(arg8, local16, arg1, arg5, arg7, arg6, local14)) {
									Static66.anInt1364 = local16;
									Static247.anInt3930 = local14;
									return true;
								}
								local254 = Static378.anIntArrayArray183[local78][local83] + 1;
								if (local78 > 0 && Static45.anIntArrayArray23[local78 - 1][local83] == 0 && (local58[local89 - 1][local95] & 0x43A40000) == 0 && (local58[local89 - 1][local95 + arg8 - 1] & 0x4E240000) == 0) {
									local296 = 1;
									while (true) {
										if (local296 >= arg8 - 1) {
											Static221.anIntArray325[local53] = local14 - 1;
											Static179.anIntArray273[local53] = local16;
											Static45.anIntArrayArray23[local78 - 1][local83] = 2;
											local53 = local53 + 1 & 0xFFF;
											Static378.anIntArrayArray183[local78 - 1][local83] = local254;
											break;
										}
										if ((local58[local89 - 1][local95 + local296] & 0x4FA40000) != 0) {
											break;
										}
										local296++;
									}
								}
								if (local78 < 128 - arg8 && Static45.anIntArrayArray23[local78 + 1][local83] == 0 && (local58[arg8 + local89][local95] & 0x60E40000) == 0 && (local58[local89 + arg8][local95 + arg8 - 1] & 0x78240000) == 0) {
									local296 = 1;
									while (true) {
										if (local296 >= arg8 - 1) {
											Static221.anIntArray325[local53] = local14 + 1;
											Static179.anIntArray273[local53] = local16;
											Static45.anIntArrayArray23[local78 + 1][local83] = 8;
											local53 = local53 + 1 & 0xFFF;
											Static378.anIntArrayArray183[local78 + 1][local83] = local254;
											break;
										}
										if ((local58[arg8 + local89][local296 + local95] & 0x78E40000) != 0) {
											break;
										}
										local296++;
									}
								}
								if (local83 > 0 && Static45.anIntArrayArray23[local78][local83 - 1] == 0 && (local58[local89][local95 - 1] & 0x43A40000) == 0 && (local58[local89 + arg8 - 1][local95 - 1] & 0x60E40000) == 0) {
									local296 = 1;
									while (true) {
										if (local296 >= arg8 - 1) {
											Static221.anIntArray325[local53] = local14;
											Static179.anIntArray273[local53] = local16 - 1;
											Static45.anIntArrayArray23[local78][local83 - 1] = 1;
											local53 = local53 + 1 & 0xFFF;
											Static378.anIntArrayArray183[local78][local83 - 1] = local254;
											break;
										}
										if ((local58[local296 + local89][local95 - 1] & 0x63E40000) != 0) {
											break;
										}
										local296++;
									}
								}
								if (128 - arg8 > local83 && Static45.anIntArrayArray23[local78][local83 + 1] == 0 && (local58[local89][arg8 + local95] & 0x4E240000) == 0 && (local58[arg8 + local89 - 1][local95 + arg8] & 0x78240000) == 0) {
									local296 = 1;
									while (true) {
										if (local296 >= arg8 - 1) {
											Static221.anIntArray325[local53] = local14;
											Static179.anIntArray273[local53] = local16 + 1;
											local53 = local53 + 1 & 0xFFF;
											Static45.anIntArrayArray23[local78][local83 + 1] = 4;
											Static378.anIntArrayArray183[local78][local83 + 1] = local254;
											break;
										}
										if ((local58[local296 + local89][local95 + arg8] & 0x7E240000) != 0) {
											break;
										}
										local296++;
									}
								}
								if (local78 > 0 && local83 > 0 && Static45.anIntArrayArray23[local78 - 1][local83 - 1] == 0 && (local58[local89 - 1][local95 - 1] & 0x43A40000) == 0) {
									local296 = 1;
									while (true) {
										if (arg8 <= local296) {
											Static221.anIntArray325[local53] = local14 - 1;
											Static179.anIntArray273[local53] = local16 - 1;
											local53 = local53 + 1 & 0xFFF;
											Static45.anIntArrayArray23[local78 - 1][local83 - 1] = 3;
											Static378.anIntArrayArray183[local78 - 1][local83 - 1] = local254;
											break;
										}
										if ((local58[local89 - 1][local296 + local95 - 1] & 0x4FA40000) != 0 || (local58[local296 + local89 - 1][local95 - 1] & 0x63E40000) != 0) {
											break;
										}
										local296++;
									}
								}
								if (local78 < 128 - arg8 && local83 > 0 && Static45.anIntArrayArray23[local78 + 1][local83 - 1] == 0 && (local58[arg8 + local89][local95 - 1] & 0x60E40000) == 0) {
									local296 = 1;
									while (true) {
										if (arg8 <= local296) {
											Static221.anIntArray325[local53] = local14 + 1;
											Static179.anIntArray273[local53] = local16 - 1;
											local53 = local53 + 1 & 0xFFF;
											Static45.anIntArrayArray23[local78 + 1][local83 - 1] = 9;
											Static378.anIntArrayArray183[local78 + 1][local83 - 1] = local254;
											break;
										}
										if ((local58[local89 + arg8][local296 + local95 - 1] & 0x78E40000) != 0 || (local58[local296 + local89][local95 - 1] & 0x63E40000) != 0) {
											break;
										}
										local296++;
									}
								}
								if (local78 > 0 && 128 - arg8 > local83 && Static45.anIntArrayArray23[local78 - 1][local83 + 1] == 0 && (local58[local89 - 1][local95 + arg8] & 0x4E240000) == 0) {
									for (local296 = 1; local296 < arg8; local296++) {
										if ((local58[local89 - 1][local296 + local95] & 0x4FA40000) != 0 || (local58[local89 + local296 - 1][local95 + arg8] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static221.anIntArray325[local53] = local14 - 1;
									Static179.anIntArray273[local53] = local16 + 1;
									Static45.anIntArrayArray23[local78 - 1][local83 + 1] = 6;
									local53 = local53 + 1 & 0xFFF;
									Static378.anIntArrayArray183[local78 - 1][local83 + 1] = local254;
								}
							} while (128 - arg8 <= local78);
						} while (local83 >= 128 - arg8);
					} while (Static45.anIntArrayArray23[local78 + 1][local83 + 1] != 0);
				} while ((local58[arg8 + local89][arg8 + local95] & 0x78240000) != 0);
				for (local296 = 1; local296 < arg8; local296++) {
					if ((local58[local89 + local296][local95 + arg8] & 0x7E240000) != 0 || (local58[local89 + arg8][local296 + local95] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static221.anIntArray325[local53] = local14 + 1;
				Static179.anIntArray273[local53] = local16 + 1;
				Static45.anIntArrayArray23[local78 + 1][local83 + 1] = 12;
				local53 = local53 + 1 & 0xFFF;
				Static378.anIntArrayArray183[local78 + 1][local83 + 1] = local254;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Z")
	public static boolean method4317(@OriginalArg(1) int arg0) {
		if (arg0 == 16 || arg0 == 46 || arg0 == 2 || arg0 == 22 || arg0 == 15) {
			return true;
		} else {
			return arg0 == 25 || arg0 == 1012;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZIIII)V")
	public static void method4318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static85.method1427(Static212.anInt452, arg2, Static305.anInt5429);
		@Pc(17) int local17 = Static85.method1427(Static212.anInt452, arg5, Static305.anInt5429);
		@Pc(23) int local23 = Static85.method1427(Static221.anInt4001, arg6, Static83.anInt7380);
		@Pc(29) int local29 = Static85.method1427(Static221.anInt4001, arg0, Static83.anInt7380);
		@Pc(38) int local38 = Static85.method1427(Static212.anInt452, arg2 + arg1, Static305.anInt5429);
		@Pc(47) int local47 = Static85.method1427(Static212.anInt452, arg5 - arg1, Static305.anInt5429);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static217.method3280(Static59.anIntArrayArray34[local49], local23, arg3, local29);
		}
		for (@Pc(69) int local69 = local17; local69 > local47; local69--) {
			Static217.method3280(Static59.anIntArrayArray34[local69], local23, arg3, local29);
		}
		@Pc(91) int local91 = Static85.method1427(Static221.anInt4001, arg6 + arg1, Static83.anInt7380);
		@Pc(117) int local117 = Static85.method1427(Static221.anInt4001, arg0 - arg1, Static83.anInt7380);
		for (@Pc(119) int local119 = local38; local119 <= local47; local119++) {
			@Pc(125) int[] local125 = Static59.anIntArrayArray34[local119];
			Static217.method3280(local125, local23, arg3, local91);
			Static217.method3280(local125, local91, arg4, local117);
			Static217.method3280(local125, local117, arg3, local29);
		}
	}
}
