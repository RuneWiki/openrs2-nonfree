import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
	public static int anInt8256;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
	public static int anInt8257;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "Z")
	public static boolean aBoolean647 = false;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIIIIIIILclient!wd;)Z")
	public static boolean method6852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class355 arg10) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg5 - 64;
		Static233.anIntArrayArray24[64][64] = 99;
		@Pc(28) int local28 = arg6 - 64;
		Static416.anIntArrayArray47[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static6.anIntArray26[0] = arg5;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = local36 + 1;
		Static255.anIntArray325[0] = arg6;
		@Pc(50) int[][] local50 = arg10.anIntArrayArray68;
		while (true) {
			label282: while (true) {
				@Pc(68) int local68;
				@Pc(73) int local73;
				@Pc(84) int local84;
				@Pc(90) int local90;
				@Pc(240) int local240;
				@Pc(279) int local279;
				do {
					do {
						do {
							label259: do {
								if (local42 == local45) {
									Static30.anInt768 = local7;
									Static245.anInt4563 = local9;
									return false;
								}
								local9 = Static255.anIntArray325[local42];
								local7 = Static6.anIntArray26[local42];
								local68 = local7 - local18;
								local73 = local9 - local28;
								local42 = local42 + 1 & 0xFFF;
								local84 = local7 - arg10.anInt9399;
								local90 = local9 - arg10.anInt9391;
								if (arg1 == -4) {
									if (local7 == arg8 && arg3 == local9) {
										Static30.anInt768 = local7;
										Static245.anInt4563 = local9;
										return true;
									}
								} else if (arg1 == -3) {
									if (Static108.method1627(local7, arg2, local9, arg0, arg8, arg3, arg2, arg9)) {
										Static30.anInt768 = local7;
										Static245.anInt4563 = local9;
										return true;
									}
								} else if (arg1 == -2) {
									if (arg10.method7814(arg0, arg2, arg3, arg7, arg8, arg9, local9, local7, arg2)) {
										Static30.anInt768 = local7;
										Static245.anInt4563 = local9;
										return true;
									}
								} else if (arg1 == -1) {
									if (arg10.method7804(arg0, arg8, local9, arg3, arg9, local7, arg7, arg2)) {
										Static245.anInt4563 = local9;
										Static30.anInt768 = local7;
										return true;
									}
								} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
									if (arg10.method7819(local7, local9, arg2, arg3, arg4, arg1, arg8)) {
										Static245.anInt4563 = local9;
										Static30.anInt768 = local7;
										return true;
									}
								} else if (arg10.method7808(arg2, arg1, arg3, arg4, local9, local7, arg8)) {
									Static245.anInt4563 = local9;
									Static30.anInt768 = local7;
									return true;
								}
								local240 = Static416.anIntArrayArray47[local68][local73] + 1;
								if (local68 > 0 && Static233.anIntArrayArray24[local68 - 1][local73] == 0 && (local50[local84 - 1][local90] & 0x43A40000) == 0 && (local50[local84 - 1][arg2 + local90 - 1] & 0x4E240000) == 0) {
									local279 = 1;
									while (true) {
										if (arg2 - 1 <= local279) {
											Static6.anIntArray26[local45] = local7 - 1;
											Static255.anIntArray325[local45] = local9;
											local45 = local45 + 1 & 0xFFF;
											Static233.anIntArrayArray24[local68 - 1][local73] = 2;
											Static416.anIntArrayArray47[local68 - 1][local73] = local240;
											break;
										}
										if ((local50[local84 - 1][local279 + local90] & 0x4FA40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local68 < 128 - arg2 && Static233.anIntArrayArray24[local68 + 1][local73] == 0 && (local50[arg2 + local84][local90] & 0x60E40000) == 0 && (local50[local84 + arg2][arg2 + local90 - 1] & 0x78240000) == 0) {
									local279 = 1;
									while (true) {
										if (arg2 - 1 <= local279) {
											Static6.anIntArray26[local45] = local7 + 1;
											Static255.anIntArray325[local45] = local9;
											Static233.anIntArrayArray24[local68 + 1][local73] = 8;
											local45 = local45 + 1 & 0xFFF;
											Static416.anIntArrayArray47[local68 + 1][local73] = local240;
											break;
										}
										if ((local50[arg2 + local84][local90 + local279] & 0x78E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local73 > 0 && Static233.anIntArrayArray24[local68][local73 - 1] == 0 && (local50[local84][local90 - 1] & 0x43A40000) == 0 && (local50[local84 + arg2 - 1][local90 - 1] & 0x60E40000) == 0) {
									local279 = 1;
									while (true) {
										if (local279 >= arg2 - 1) {
											Static6.anIntArray26[local45] = local7;
											Static255.anIntArray325[local45] = local9 - 1;
											Static233.anIntArrayArray24[local68][local73 - 1] = 1;
											local45 = local45 + 1 & 0xFFF;
											Static416.anIntArrayArray47[local68][local73 - 1] = local240;
											break;
										}
										if ((local50[local84 + local279][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local73 < 128 - arg2 && Static233.anIntArrayArray24[local68][local73 + 1] == 0 && (local50[local84][local90 + arg2] & 0x4E240000) == 0 && (local50[arg2 + local84 - 1][arg2 + local90] & 0x78240000) == 0) {
									local279 = 1;
									while (true) {
										if (local279 >= arg2 - 1) {
											Static6.anIntArray26[local45] = local7;
											Static255.anIntArray325[local45] = local9 + 1;
											local45 = local45 + 1 & 0xFFF;
											Static233.anIntArrayArray24[local68][local73 + 1] = 4;
											Static416.anIntArrayArray47[local68][local73 + 1] = local240;
											break;
										}
										if ((local50[local84 + local279][local90 + arg2] & 0x7E240000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local68 > 0 && local73 > 0 && Static233.anIntArrayArray24[local68 - 1][local73 - 1] == 0 && (local50[local84 - 1][local90 - 1] & 0x43A40000) == 0) {
									local279 = 1;
									while (true) {
										if (arg2 <= local279) {
											Static6.anIntArray26[local45] = local7 - 1;
											Static255.anIntArray325[local45] = local9 - 1;
											Static233.anIntArrayArray24[local68 - 1][local73 - 1] = 3;
											local45 = local45 + 1 & 0xFFF;
											Static416.anIntArrayArray47[local68 - 1][local73 - 1] = local240;
											break;
										}
										if ((local50[local84 - 1][local90 + local279 - 1] & 0x4FA40000) != 0 || (local50[local279 + local84 - 1][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local68 < 128 - arg2 && local73 > 0 && Static233.anIntArrayArray24[local68 + 1][local73 - 1] == 0 && (local50[local84 + arg2][local90 - 1] & 0x60E40000) == 0) {
									local279 = 1;
									while (true) {
										if (local279 >= arg2) {
											Static6.anIntArray26[local45] = local7 + 1;
											Static255.anIntArray325[local45] = local9 - 1;
											local45 = local45 + 1 & 0xFFF;
											Static233.anIntArrayArray24[local68 + 1][local73 - 1] = 9;
											Static416.anIntArrayArray47[local68 + 1][local73 - 1] = local240;
											break;
										}
										if ((local50[local84 + arg2][local279 + local90 - 1] & 0x78E40000) != 0 || (local50[local279 + local84][local90 - 1] & 0x63E40000) != 0) {
											break;
										}
										local279++;
									}
								}
								if (local68 > 0 && 128 - arg2 > local73 && Static233.anIntArrayArray24[local68 - 1][local73 + 1] == 0 && (local50[local84 - 1][local90 + arg2] & 0x4E240000) == 0) {
									for (local279 = 1; local279 < arg2; local279++) {
										if ((local50[local84 - 1][local90 + local279] & 0x4FA40000) != 0 || (local50[local279 + local84 - 1][arg2 + local90] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static6.anIntArray26[local45] = local7 - 1;
									Static255.anIntArray325[local45] = local9 + 1;
									local45 = local45 + 1 & 0xFFF;
									Static233.anIntArrayArray24[local68 - 1][local73 + 1] = 6;
									Static416.anIntArrayArray47[local68 - 1][local73 + 1] = local240;
								}
							} while (128 - arg2 <= local68);
						} while (local73 >= 128 - arg2);
					} while (Static233.anIntArrayArray24[local68 + 1][local73 + 1] != 0);
				} while ((local50[arg2 + local84][local90 + arg2] & 0x78240000) != 0);
				for (local279 = 1; local279 < arg2; local279++) {
					if ((local50[local84 + local279][local90 + arg2] & 0x7E240000) != 0 || (local50[arg2 + local84][local90 + local279] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static6.anIntArray26[local45] = local7 + 1;
				Static255.anIntArray325[local45] = local9 + 1;
				local45 = local45 + 1 & 0xFFF;
				Static233.anIntArrayArray24[local68 + 1][local73 + 1] = 12;
				Static416.anIntArrayArray47[local68 + 1][local73 + 1] = local240;
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIII)I")
	public static int method6853(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < arg1) {
			return arg1;
		} else if (arg0 <= arg2) {
			return arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)Z")
	public static boolean method6854(@OriginalArg(1) int arg0) {
		if (arg0 == 23 || arg0 == 5 || arg0 == 17 || arg0 == 58 || arg0 == 13) {
			return true;
		} else {
			return arg0 == 20 || arg0 == 1001;
		}
	}
}
