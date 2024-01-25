import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
	public static int anInt1327;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
	public static int anInt1333;

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
	public static int anInt1328 = 0;

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[8];

	@OriginalMember(owner = "client!cp", name = "B", descriptor = "I")
	public static int anInt1351 = -1;

	@OriginalMember(owner = "client!cp", name = "C", descriptor = "[I")
	public static final int[] anIntArray111 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method1183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static419.aBoolean572) {
			return false;
		} else if (Static286.anInt8220 < 100) {
			return false;
		} else {
			@Pc(40) int local40;
			@Pc(44) int local44;
			if (arg4 != arg2 || arg3 != arg0) {
				for (local40 = arg4; local40 <= arg2; local40++) {
					for (local44 = arg0; local44 <= arg3; local44++) {
						if (-Static465.anInt7972 == Static172.anIntArrayArrayArray4[arg5][local40][local44]) {
							return false;
						}
					}
				}
				local44 = (arg4 << Static351.anInt5832) + 1;
				@Pc(120) int local120 = (arg0 << Static351.anInt5832) + 2;
				if (Static292.method4109((arg2 + 1 - arg4) * Static379.anInt6307, Static199.aClass47Array1[arg5].method7545(arg4, arg0), arg1, local44, (arg3 + 1 - arg0) * Static379.anInt6307, local120)) {
					Static541.anInt9055++;
					return true;
				} else {
					return false;
				}
			} else if (Static548.method7005(arg5, arg4, arg0)) {
				local40 = arg4 << Static351.anInt5832;
				local44 = arg0 << Static351.anInt5832;
				if (Static292.method4109(Static379.anInt6307, Static199.aClass47Array1[arg5].method7545(arg4, arg0), arg1, local40, Static379.anInt6307, local44)) {
					Static541.anInt9055++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIIZIIILclient!cp;II)Z")
	public static boolean method1184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class59 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(12) int local12 = arg9;
		@Pc(14) int local14 = arg2;
		@Pc(23) int local23 = arg9 - 64;
		Static546.anIntArrayArray195[64][64] = 99;
		@Pc(33) int local33 = arg2 - 64;
		Static485.anIntArrayArray180[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static145.anIntArray230[0] = arg9;
		@Pc(50) int local50 = local41 + 1;
		Static286.anIntArray636[0] = arg2;
		@Pc(55) int[][] local55 = arg8.anIntArrayArray34;
		while (true) {
			label282: while (true) {
				@Pc(70) int local70;
				@Pc(75) int local75;
				@Pc(87) int local87;
				@Pc(93) int local93;
				@Pc(243) int local243;
				@Pc(291) int local291;
				do {
					do {
						do {
							label259: do {
								if (local50 == local43) {
									Static115.anInt2240 = local12;
									Static215.anInt4124 = local14;
									return false;
								}
								local12 = Static145.anIntArray230[local43];
								local14 = Static286.anIntArray636[local43];
								local70 = local12 - local23;
								local75 = local14 - local33;
								local43 = local43 + 1 & 0xFFF;
								local87 = local12 - arg8.anInt1345;
								local93 = local14 - arg8.anInt1342;
								if (arg3 == -4) {
									if (arg4 == local12 && local14 == arg1) {
										Static215.anInt4124 = local14;
										Static115.anInt2240 = local12;
										return true;
									}
								} else if (arg3 == -3) {
									if (Static113.method1786(arg10, arg7, arg5, local12, local14, arg4, arg5, arg1)) {
										Static115.anInt2240 = local12;
										Static215.anInt4124 = local14;
										return true;
									}
								} else if (arg3 == -2) {
									if (arg8.method1193(arg5, arg7, arg4, local14, arg1, arg6, local12, arg5, arg10)) {
										Static115.anInt2240 = local12;
										Static215.anInt4124 = local14;
										return true;
									}
								} else if (arg3 == -1) {
									if (arg8.method1195(arg1, arg7, arg10, arg4, local14, local12, arg6, arg5)) {
										Static115.anInt2240 = local12;
										Static215.anInt4124 = local14;
										return true;
									}
								} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
									if (arg8.method1181(local12, arg3, arg0, arg4, local14, arg5, arg1)) {
										Static215.anInt4124 = local14;
										Static115.anInt2240 = local12;
										return true;
									}
								} else if (arg8.method1186(arg5, arg3, local14, arg4, arg1, arg0, local12)) {
									Static115.anInt2240 = local12;
									Static215.anInt4124 = local14;
									return true;
								}
								local243 = Static485.anIntArrayArray180[local70][local75] + 1;
								if (local70 > 0 && Static546.anIntArrayArray195[local70 - 1][local75] == 0 && (local55[local87 - 1][local93] & 0x43A40000) == 0 && (local55[local87 - 1][arg5 + local93 - 1] & 0x4E240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg5 - 1 <= local291) {
											Static145.anIntArray230[local50] = local12 - 1;
											Static286.anIntArray636[local50] = local14;
											local50 = local50 + 1 & 0xFFF;
											Static546.anIntArrayArray195[local70 - 1][local75] = 2;
											Static485.anIntArrayArray180[local70 - 1][local75] = local243;
											break;
										}
										if ((local55[local87 - 1][local291 + local93] & 0x4FA40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg5 > local70 && Static546.anIntArrayArray195[local70 + 1][local75] == 0 && (local55[local87 + arg5][local93] & 0x60E40000) == 0 && (local55[local87 + arg5][arg5 + local93 - 1] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg5 - 1 <= local291) {
											Static145.anIntArray230[local50] = local12 + 1;
											Static286.anIntArray636[local50] = local14;
											Static546.anIntArrayArray195[local70 + 1][local75] = 8;
											local50 = local50 + 1 & 0xFFF;
											Static485.anIntArrayArray180[local70 + 1][local75] = local243;
											break;
										}
										if ((local55[arg5 + local87][local93 + local291] & 0x78E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local75 > 0 && Static546.anIntArrayArray195[local70][local75 - 1] == 0 && (local55[local87][local93 - 1] & 0x43A40000) == 0 && (local55[arg5 + local87 - 1][local93 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg5 - 1 <= local291) {
											Static145.anIntArray230[local50] = local12;
											Static286.anIntArray636[local50] = local14 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static546.anIntArrayArray195[local70][local75 - 1] = 1;
											Static485.anIntArrayArray180[local70][local75 - 1] = local243;
											break;
										}
										if ((local55[local87 + local291][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local75 < 128 - arg5 && Static546.anIntArrayArray195[local70][local75 + 1] == 0 && (local55[local87][arg5 + local93] & 0x4E240000) == 0 && (local55[arg5 + local87 - 1][arg5 + local93] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg5 - 1) {
											Static145.anIntArray230[local50] = local12;
											Static286.anIntArray636[local50] = local14 + 1;
											local50 = local50 + 1 & 0xFFF;
											Static546.anIntArrayArray195[local70][local75 + 1] = 4;
											Static485.anIntArrayArray180[local70][local75 + 1] = local243;
											break;
										}
										if ((local55[local87 + local291][local93 + arg5] & 0x7E240000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local70 > 0 && local75 > 0 && Static546.anIntArrayArray195[local70 - 1][local75 - 1] == 0 && (local55[local87 - 1][local93 - 1] & 0x43A40000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg5) {
											Static145.anIntArray230[local50] = local12 - 1;
											Static286.anIntArray636[local50] = local14 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static546.anIntArrayArray195[local70 - 1][local75 - 1] = 3;
											Static485.anIntArrayArray180[local70 - 1][local75 - 1] = local243;
											break;
										}
										if ((local55[local87 - 1][local93 + local291 - 1] & 0x4FA40000) != 0 || (local55[local87 + local291 - 1][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg5 > local70 && local75 > 0 && Static546.anIntArrayArray195[local70 + 1][local75 - 1] == 0 && (local55[arg5 + local87][local93 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg5) {
											Static145.anIntArray230[local50] = local12 + 1;
											Static286.anIntArray636[local50] = local14 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static546.anIntArrayArray195[local70 + 1][local75 - 1] = 9;
											Static485.anIntArrayArray180[local70 + 1][local75 - 1] = local243;
											break;
										}
										if ((local55[arg5 + local87][local93 + local291 - 1] & 0x78E40000) != 0 || (local55[local291 + local87][local93 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local70 > 0 && 128 - arg5 > local75 && Static546.anIntArrayArray195[local70 - 1][local75 + 1] == 0 && (local55[local87 - 1][local93 + arg5] & 0x4E240000) == 0) {
									for (local291 = 1; local291 < arg5; local291++) {
										if ((local55[local87 - 1][local291 + local93] & 0x4FA40000) != 0 || (local55[local291 + local87 - 1][local93 + arg5] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static145.anIntArray230[local50] = local12 - 1;
									Static286.anIntArray636[local50] = local14 + 1;
									Static546.anIntArrayArray195[local70 - 1][local75 + 1] = 6;
									local50 = local50 + 1 & 0xFFF;
									Static485.anIntArrayArray180[local70 - 1][local75 + 1] = local243;
								}
							} while (local70 >= 128 - arg5);
						} while (local75 >= 128 - arg5);
					} while (Static546.anIntArrayArray195[local70 + 1][local75 + 1] != 0);
				} while ((local55[arg5 + local87][arg5 + local93] & 0x78240000) != 0);
				for (local291 = 1; local291 < arg5; local291++) {
					if ((local55[local291 + local87][arg5 + local93] & 0x7E240000) != 0 || (local55[local87 + arg5][local93 + local291] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static145.anIntArray230[local50] = local12 + 1;
				Static286.anIntArray636[local50] = local14 + 1;
				Static546.anIntArrayArray195[local70 + 1][local75 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static485.anIntArrayArray180[local70 + 1][local75 + 1] = local243;
			}
		}
	}

	@OriginalMember(owner = "client!cp", name = "b", descriptor = "(IIII)I")
	public static int method1191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static199.aClass47Array1 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg0 >> 9;
		@Pc(15) int local15 = arg2 >> 9;
		if (local11 < 0 || local15 < 0 || local11 > Static71.anInt1410 - 1 || local15 > Static471.anInt8012 - 1) {
			return 0;
		}
		@Pc(39) int local39 = arg1;
		if (arg1 < 3 && (Static455.aByteArrayArrayArray17[1][local11][local15] & 0x2) != 0) {
			local39 = arg1 + 1;
		}
		return Static199.aClass47Array1[local39].method7550(arg0, arg2);
	}
}
