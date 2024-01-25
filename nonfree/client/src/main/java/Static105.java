import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "J")
	public static long aLong44;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "Lclient!ps;")
	public static Class163 aClass163_7;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "Lclient!el;")
	public static Class59 aClass59_3;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString79 = "Connected to update server";

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIBIIILclient!ba;IIIII)Z")
	public static boolean method1649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(15) int local15 = arg7;
		@Pc(17) int local17 = arg6;
		@Pc(26) int local26 = arg7 - 64;
		Static131.anIntArrayArray25[64][64] = 99;
		@Pc(37) int local37 = arg6 - 64;
		Static257.anIntArrayArray41[64][64] = 0;
		@Pc(45) byte local45 = 0;
		@Pc(47) int local47 = 0;
		Static222.anIntArray437[0] = arg7;
		@Pc(54) int local54 = local45 + 1;
		Static121.anIntArray392[0] = arg6;
		@Pc(59) int[][] local59 = arg5.anIntArrayArray5;
		while (true) {
			label282: while (true) {
				@Pc(85) int local85;
				@Pc(74) int local74;
				@Pc(91) int local91;
				@Pc(97) int local97;
				@Pc(243) int local243;
				@Pc(285) int local285;
				do {
					do {
						do {
							label259: do {
								if (local47 == local54) {
									Static100.anInt1936 = local17;
									Static315.anInt6285 = local15;
									return false;
								}
								local15 = Static222.anIntArray437[local47];
								local17 = Static121.anIntArray392[local47];
								local74 = local17 - local37;
								local47 = local47 + 1 & 0xFFF;
								local85 = local15 - local26;
								local91 = local15 - arg5.anInt365;
								local97 = local17 - arg5.anInt370;
								if (arg9 == -4) {
									if (local15 == arg2 && local17 == arg8) {
										Static315.anInt6285 = local15;
										Static100.anInt1936 = local17;
										return true;
									}
								} else if (arg9 == -3) {
									if (Static12.method187(arg2, arg8, arg1, local15, arg0, arg0, arg10, local17)) {
										Static100.anInt1936 = local17;
										Static315.anInt6285 = local15;
										return true;
									}
								} else if (arg9 == -2) {
									if (arg5.method323(arg0, arg1, arg3, arg8, arg2, arg0, local15, local17, arg10)) {
										Static100.anInt1936 = local17;
										Static315.anInt6285 = local15;
										return true;
									}
								} else if (arg9 == -1) {
									if (arg5.method337(arg3, arg0, local15, local17, arg10, arg2, arg8, arg1)) {
										Static315.anInt6285 = local15;
										Static100.anInt1936 = local17;
										return true;
									}
								} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
									if (arg5.method340(arg8, arg9, arg4, arg0, arg2, local15, local17)) {
										Static315.anInt6285 = local15;
										Static100.anInt1936 = local17;
										return true;
									}
								} else if (arg5.method329(local17, arg0, arg4, arg8, local15, arg2, arg9)) {
									Static315.anInt6285 = local15;
									Static100.anInt1936 = local17;
									return true;
								}
								local243 = Static257.anIntArrayArray41[local85][local74] + 1;
								if (local85 > 0 && Static131.anIntArrayArray25[local85 - 1][local74] == 0 && (local59[local91 - 1][local97] & 0x43A40000) == 0 && (local59[local91 - 1][arg0 + local97 - 1] & 0x4E240000) == 0) {
									local285 = 1;
									while (true) {
										if (arg0 - 1 <= local285) {
											Static222.anIntArray437[local54] = local15 - 1;
											Static121.anIntArray392[local54] = local17;
											local54 = local54 + 1 & 0xFFF;
											Static131.anIntArrayArray25[local85 - 1][local74] = 2;
											Static257.anIntArrayArray41[local85 - 1][local74] = local243;
											break;
										}
										if ((local59[local91 - 1][local285 + local97] & 0x4FA40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (128 - arg0 > local85 && Static131.anIntArrayArray25[local85 + 1][local74] == 0 && (local59[arg0 + local91][local97] & 0x60E40000) == 0 && (local59[local91 + arg0][arg0 + local97 - 1] & 0x78240000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg0 - 1) {
											Static222.anIntArray437[local54] = local15 + 1;
											Static121.anIntArray392[local54] = local17;
											local54 = local54 + 1 & 0xFFF;
											Static131.anIntArrayArray25[local85 + 1][local74] = 8;
											Static257.anIntArrayArray41[local85 + 1][local74] = local243;
											break;
										}
										if ((local59[arg0 + local91][local285 + local97] & 0x78E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local74 > 0 && Static131.anIntArrayArray25[local85][local74 - 1] == 0 && (local59[local91][local97 - 1] & 0x43A40000) == 0 && (local59[local91 + arg0 - 1][local97 - 1] & 0x60E40000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg0 - 1) {
											Static222.anIntArray437[local54] = local15;
											Static121.anIntArray392[local54] = local17 - 1;
											Static131.anIntArrayArray25[local85][local74 - 1] = 1;
											local54 = local54 + 1 & 0xFFF;
											Static257.anIntArrayArray41[local85][local74 - 1] = local243;
											break;
										}
										if ((local59[local91 + local285][local97 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (128 - arg0 > local74 && Static131.anIntArrayArray25[local85][local74 + 1] == 0 && (local59[local91][local97 + arg0] & 0x4E240000) == 0 && (local59[arg0 + local91 - 1][arg0 + local97] & 0x78240000) == 0) {
									local285 = 1;
									while (true) {
										if (arg0 - 1 <= local285) {
											Static222.anIntArray437[local54] = local15;
											Static121.anIntArray392[local54] = local17 + 1;
											local54 = local54 + 1 & 0xFFF;
											Static131.anIntArrayArray25[local85][local74 + 1] = 4;
											Static257.anIntArrayArray41[local85][local74 + 1] = local243;
											break;
										}
										if ((local59[local285 + local91][local97 + arg0] & 0x7E240000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local85 > 0 && local74 > 0 && Static131.anIntArrayArray25[local85 - 1][local74 - 1] == 0 && (local59[local91 - 1][local97 - 1] & 0x43A40000) == 0) {
									local285 = 1;
									while (true) {
										if (local285 >= arg0) {
											Static222.anIntArray437[local54] = local15 - 1;
											Static121.anIntArray392[local54] = local17 - 1;
											Static131.anIntArrayArray25[local85 - 1][local74 - 1] = 3;
											local54 = local54 + 1 & 0xFFF;
											Static257.anIntArrayArray41[local85 - 1][local74 - 1] = local243;
											break;
										}
										if ((local59[local91 - 1][local97 + local285 - 1] & 0x4FA40000) != 0 || (local59[local285 + local91 - 1][local97 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local85 < 128 - arg0 && local74 > 0 && Static131.anIntArrayArray25[local85 + 1][local74 - 1] == 0 && (local59[arg0 + local91][local97 - 1] & 0x60E40000) == 0) {
									local285 = 1;
									while (true) {
										if (arg0 <= local285) {
											Static222.anIntArray437[local54] = local15 + 1;
											Static121.anIntArray392[local54] = local17 - 1;
											local54 = local54 + 1 & 0xFFF;
											Static131.anIntArrayArray25[local85 + 1][local74 - 1] = 9;
											Static257.anIntArrayArray41[local85 + 1][local74 - 1] = local243;
											break;
										}
										if ((local59[arg0 + local91][local285 + local97 - 1] & 0x78E40000) != 0 || (local59[local91 + local285][local97 - 1] & 0x63E40000) != 0) {
											break;
										}
										local285++;
									}
								}
								if (local85 > 0 && 128 - arg0 > local74 && Static131.anIntArrayArray25[local85 - 1][local74 + 1] == 0 && (local59[local91 - 1][local97 + arg0] & 0x4E240000) == 0) {
									for (local285 = 1; local285 < arg0; local285++) {
										if ((local59[local91 - 1][local97 + local285] & 0x4FA40000) != 0 || (local59[local91 + local285 - 1][local97 + arg0] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static222.anIntArray437[local54] = local15 - 1;
									Static121.anIntArray392[local54] = local17 + 1;
									local54 = local54 + 1 & 0xFFF;
									Static131.anIntArrayArray25[local85 - 1][local74 + 1] = 6;
									Static257.anIntArrayArray41[local85 - 1][local74 + 1] = local243;
								}
							} while (local85 >= 128 - arg0);
						} while (128 - arg0 <= local74);
					} while (Static131.anIntArrayArray25[local85 + 1][local74 + 1] != 0);
				} while ((local59[local91 + arg0][arg0 + local97] & 0x78240000) != 0);
				for (local285 = 1; local285 < arg0; local285++) {
					if ((local59[local91 + local285][arg0 + local97] & 0x7E240000) != 0 || (local59[local91 + arg0][local97 + local285] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static222.anIntArray437[local54] = local15 + 1;
				Static121.anIntArray392[local54] = local17 + 1;
				Static131.anIntArrayArray25[local85 + 1][local74 + 1] = 12;
				local54 = local54 + 1 & 0xFFF;
				Static257.anIntArrayArray41[local85 + 1][local74 + 1] = local243;
			}
		}
	}
}
