import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!sj", name = "Q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
	public static int anInt4106 = 0;

	@OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
	public static int anInt4108 = 0;

	@OriginalMember(owner = "client!sj", name = "N", descriptor = "Lclient!oa;")
	public static Class76 aClass76_1 = Static11.method164();

	@OriginalMember(owner = "client!sj", name = "O", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1415 = Static64.method1101("Benutzen");

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)I")
	public static int method3183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = 0;
		while (arg1 > 0) {
			arg1--;
			local3 = local3 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
		}
		return local3;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)Lclient!ia;")
	public static Class51 method3187(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static207.aClass51_1527;
		} else if (local7 < -6) {
			return Static148.aClass51_1138;
		} else if (local7 < -3) {
			return Static219.aClass51_1566;
		} else if (local7 < 0) {
			return Static113.aClass51_821;
		} else if (local7 > 9) {
			return Static161.aClass51_1226;
		} else if (local7 > 6) {
			return Static169.aClass51_1299;
		} else if (local7 > 3) {
			return Static30.aClass51_738;
		} else if (local7 > 0) {
			return Static163.aClass51_1234;
		} else {
			return Static92.aClass51_659;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	public static boolean method3188(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static168.anIntArrayArray25[local3][local7] = 0;
				Static73.anIntArrayArray9[local3][local7] = 99999999;
			}
		}
		local7 = arg8;
		@Pc(37) int local37 = arg5;
		Static168.anIntArrayArray25[arg8][arg5] = 99;
		@Pc(45) int local45 = 0;
		Static73.anIntArrayArray9[arg8][arg5] = 0;
		@Pc(53) boolean local53 = false;
		@Pc(55) byte local55 = 0;
		Static223.anIntArray372[0] = arg8;
		@Pc(62) int local62 = local55 + 1;
		Static144.anIntArray214[0] = arg5;
		@Pc(69) int[][] local69 = Static228.aClass90Array1[Static197.anInt2422].anIntArrayArray22;
		@Pc(184) int local184;
		while (local45 != local62) {
			local37 = Static144.anIntArray214[local45];
			local7 = Static223.anIntArray372[local45];
			local45 = local45 + 1 & 0xFFF;
			if (local7 == arg6 && arg2 == local37) {
				local53 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static228.aClass90Array1[Static197.anInt2422].method2722(local7, arg2, arg3 - 1, arg7, 2, local37, arg6)) {
					local53 = true;
					break;
				}
				if (arg3 < 10 && Static228.aClass90Array1[Static197.anInt2422].method2712(local37, arg3 - 1, local7, arg2, arg6, 2, arg7)) {
					local53 = true;
					break;
				}
			}
			if (arg1 != 0 && arg9 != 0 && Static228.aClass90Array1[Static197.anInt2422].method2713(local37, local7, 2, arg6, arg1, arg2, arg9, arg10)) {
				local53 = true;
				break;
			}
			local184 = Static73.anIntArrayArray9[local7][local37] + 1;
			if (local7 > 0 && Static168.anIntArrayArray25[local7 - 1][local37] == 0 && (local69[local7 - 1][local37] & 0x12C010E) == 0 && (local69[local7 - 1][local37 + 1] & 0x12C0138) == 0) {
				Static223.anIntArray372[local62] = local7 - 1;
				Static144.anIntArray214[local62] = local37;
				local62 = local62 + 1 & 0xFFF;
				Static168.anIntArrayArray25[local7 - 1][local37] = 2;
				Static73.anIntArrayArray9[local7 - 1][local37] = local184;
			}
			if (local7 < 102 && Static168.anIntArrayArray25[local7 + 1][local37] == 0 && (local69[local7 + 2][local37] & 0x12C0183) == 0 && (local69[local7 + 2][local37 + 1] & 0x12C01E0) == 0) {
				Static223.anIntArray372[local62] = local7 + 1;
				Static144.anIntArray214[local62] = local37;
				local62 = local62 + 1 & 0xFFF;
				Static168.anIntArrayArray25[local7 + 1][local37] = 8;
				Static73.anIntArrayArray9[local7 + 1][local37] = local184;
			}
			if (local37 > 0 && Static168.anIntArrayArray25[local7][local37 - 1] == 0 && (local69[local7][local37 - 1] & 0x12C010E) == 0 && (local69[local7 + 1][local37 - 1] & 0x12C0183) == 0) {
				Static223.anIntArray372[local62] = local7;
				Static144.anIntArray214[local62] = local37 - 1;
				Static168.anIntArrayArray25[local7][local37 - 1] = 1;
				Static73.anIntArrayArray9[local7][local37 - 1] = local184;
				local62 = local62 + 1 & 0xFFF;
			}
			if (local37 < 102 && Static168.anIntArrayArray25[local7][local37 + 1] == 0 && (local69[local7][local37 + 2] & 0x12C0138) == 0 && (local69[local7 + 1][local37 + 2] & 0x12C01E0) == 0) {
				Static223.anIntArray372[local62] = local7;
				Static144.anIntArray214[local62] = local37 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static168.anIntArrayArray25[local7][local37 + 1] = 4;
				Static73.anIntArrayArray9[local7][local37 + 1] = local184;
			}
			if (local7 > 0 && local37 > 0 && Static168.anIntArrayArray25[local7 - 1][local37 - 1] == 0 && (local69[local7 - 1][local37] & 0x12C0138) == 0 && (local69[local7 - 1][local37 - 1] & 0x12C010E) == 0 && (local69[local7][local37 - 1] & 0x12C0183) == 0) {
				Static223.anIntArray372[local62] = local7 - 1;
				Static144.anIntArray214[local62] = local37 - 1;
				Static168.anIntArrayArray25[local7 - 1][local37 - 1] = 3;
				Static73.anIntArrayArray9[local7 - 1][local37 - 1] = local184;
				local62 = local62 + 1 & 0xFFF;
			}
			if (local7 < 102 && local37 > 0 && Static168.anIntArrayArray25[local7 + 1][local37 - 1] == 0 && (local69[local7 + 1][local37 - 1] & 0x12C010E) == 0 && (local69[local7 + 2][local37 - 1] & 0x12C0183) == 0 && (local69[local7 + 2][local37] & 0x12C01E0) == 0) {
				Static223.anIntArray372[local62] = local7 + 1;
				Static144.anIntArray214[local62] = local37 - 1;
				local62 = local62 + 1 & 0xFFF;
				Static168.anIntArrayArray25[local7 + 1][local37 - 1] = 9;
				Static73.anIntArrayArray9[local7 + 1][local37 - 1] = local184;
			}
			if (local7 > 0 && local37 < 102 && Static168.anIntArrayArray25[local7 - 1][local37 + 1] == 0 && (local69[local7 - 1][local37 + 1] & 0x12C010E) == 0 && (local69[local7 - 1][local37 + 2] & 0x12C0138) == 0 && (local69[local7][local37 + 2] & 0x12C01E0) == 0) {
				Static223.anIntArray372[local62] = local7 - 1;
				Static144.anIntArray214[local62] = local37 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static168.anIntArrayArray25[local7 - 1][local37 + 1] = 6;
				Static73.anIntArrayArray9[local7 - 1][local37 + 1] = local184;
			}
			if (local7 < 102 && local37 < 102 && Static168.anIntArrayArray25[local7 + 1][local37 + 1] == 0 && (local69[local7 + 1][local37 + 2] & 0x12C0138) == 0 && (local69[local7 + 2][local37 + 2] & 0x12C01E0) == 0 && (local69[local7 + 2][local37 + 1] & 0x12C0183) == 0) {
				Static223.anIntArray372[local62] = local7 + 1;
				Static144.anIntArray214[local62] = local37 + 1;
				Static168.anIntArrayArray25[local7 + 1][local37 + 1] = 12;
				local62 = local62 + 1 & 0xFFF;
				Static73.anIntArrayArray9[local7 + 1][local37 + 1] = local184;
			}
		}
		Static80.anInt1790 = 0;
		@Pc(874) int local874;
		if (!local53) {
			if (!arg0) {
				return false;
			}
			local874 = 100;
			local184 = 1000;
			for (@Pc(883) int local883 = arg6 - 10; local883 <= arg6 + 10; local883++) {
				for (@Pc(889) int local889 = arg2 - 10; local889 <= arg2 + 10; local889++) {
					if (local883 >= 0 && local889 >= 0 && local883 < 104 && local889 < 104 && Static73.anIntArrayArray9[local883][local889] < 100) {
						@Pc(913) int local913 = 0;
						if (arg6 > local883) {
							local913 = arg6 - local883;
						} else if (local883 > arg1 + arg6 - 1) {
							local913 = local883 + 1 - arg6 - arg1;
						}
						@Pc(948) int local948 = 0;
						if (local889 < arg2) {
							local948 = arg2 - local889;
						} else if (local889 > arg2 + arg9 - 1) {
							local948 = local889 + 1 - arg2 - arg9;
						}
						@Pc(991) int local991 = local913 * local913 + local948 * local948;
						if (local991 < local184 || local991 == local184 && Static73.anIntArrayArray9[local883][local889] < local874) {
							local7 = local883;
							local184 = local991;
							local874 = Static73.anIntArrayArray9[local883][local889];
							local37 = local889;
						}
					}
				}
			}
			if (local184 == 1000) {
				return false;
			}
			if (local7 == arg8 && local37 == arg5) {
				return false;
			}
			Static80.anInt1790 = 1;
		}
		@Pc(1049) byte local1049 = 0;
		Static223.anIntArray372[0] = local7;
		local45 = local1049 + 1;
		Static144.anIntArray214[0] = local37;
		local184 = local874 = Static168.anIntArrayArray25[local7][local37];
		while (arg8 != local7 || local37 != arg5) {
			if (local874 != local184) {
				local874 = local184;
				Static223.anIntArray372[local45] = local7;
				Static144.anIntArray214[local45++] = local37;
			}
			if ((local184 & 0x1) != 0) {
				local37++;
			} else if ((local184 & 0x4) != 0) {
				local37--;
			}
			if ((local184 & 0x2) != 0) {
				local7++;
			} else if ((local184 & 0x8) != 0) {
				local7--;
			}
			local184 = Static168.anIntArrayArray25[local7][local37];
		}
		if (local45 > 0) {
			Static132.method2334(arg4, local45);
			return true;
		} else if (arg4 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
