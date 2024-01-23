import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "Lclient!jb;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_3;

	@OriginalMember(owner = "client!qf", name = "lb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	public static int anInt3673 = 0;

	@OriginalMember(owner = "client!qf", name = "eb", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)V")
	public static void method2802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static202.anInt4289 < 2 && Static54.anInt1264 == 0 && !Static82.aBoolean82) {
			return;
		}
		@Pc(47) Class51 local47;
		if (Static54.anInt1264 == 1 && Static202.anInt4289 < 2) {
			local47 = Static150.method2574(new Class51[] { Static25.aClass51_198, Static118.aClass51_854, Static87.aClass51_640, Static179.aClass51_1347 });
		} else if (Static82.aBoolean82 && Static202.anInt4289 < 2) {
			local47 = Static150.method2574(new Class51[] { Static87.aClass51_641, Static118.aClass51_854, Static51.aClass51_374, Static179.aClass51_1347 });
		} else {
			local47 = Static150.method2587(Static202.anInt4289 - 1);
		}
		if (Static202.anInt4289 > 2) {
			local47 = Static150.method2574(new Class51[] { local47, Static151.aClass51_1175, Static27.method511(Static202.anInt4289 - 2), Static174.aClass51_1315 });
		}
		@Pc(127) int local127 = Static80.aClass1_Sub2_Sub11_2.method2041(local47, arg0 + 4, arg1 + 15, Static57.aRandom1, Static113.anInt2475);
		Static221.method3642(arg1, local127 + Static80.aClass1_Sub2_Sub11_2.method2040(local47), 15, arg0 + 4);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ia;BZ)V")
	public static void method2804(@OriginalArg(0) Class51 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) short[] local12 = new short[16];
		@Pc(16) Class51 local16 = arg0.method1430();
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < Static29.anInt686; local24++) {
			@Pc(30) Class92 local30 = Static36.method637(local24);
			if ((!arg1 || local30.aBoolean168) && local30.anInt3670 == -1 && local30.anInt3658 == -1 && local30.anInt3685 == 0 && local30.aClass51_1254.method1430().method1403(local16) != -1) {
				if (local22 >= 250) {
					Static110.aShortArray13 = null;
					Static53.anInt1241 = -1;
					return;
				}
				if (local12.length <= local22) {
					@Pc(79) short[] local79 = new short[local12.length * 2];
					for (@Pc(81) int local81 = 0; local81 < local22; local81++) {
						local79[local81] = local12[local81];
					}
					local12 = local79;
				}
				local12[local22++] = (short) local24;
			}
		}
		Static53.anInt1241 = local22;
		Static110.aShortArray13 = local12;
		Static174.anInt3860 = 0;
		@Pc(114) Class51[] local114 = new Class51[Static53.anInt1241];
		for (@Pc(116) int local116 = 0; local116 < Static53.anInt1241; local116++) {
			local114[local116] = Static36.method637(local12[local116]).aClass51_1254;
		}
		Static221.method3645(Static110.aShortArray13, local114);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method2812() {
		if (Static192.aClass11_36 != null) {
			Static192.aClass11_36.method271();
			Static192.aClass11_36 = null;
		}
		Static72.aClass38_4 = Static51.aClass72_3.method2254(Static161.aString6, Static192.anInt4167);
		Static37.anInt889 = 1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	public static boolean method2816(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static168.anIntArrayArray25[local7][local11] = 0;
				Static73.anIntArrayArray9[local7][local11] = 99999999;
			}
		}
		Static168.anIntArrayArray25[arg6][arg4] = 99;
		Static73.anIntArrayArray9[arg6][arg4] = 0;
		local11 = arg6;
		@Pc(49) int local49 = arg4;
		@Pc(51) boolean local51 = false;
		@Pc(53) byte local53 = 0;
		Static223.anIntArray372[0] = arg6;
		@Pc(59) int local59 = 0;
		@Pc(62) int local62 = local53 + 1;
		Static144.anIntArray214[0] = arg4;
		@Pc(76) int[][] local76 = Static228.aClass90Array1[Static197.anInt2422].anIntArrayArray22;
		@Pc(197) int local197;
		while (local62 != local59) {
			local49 = Static144.anIntArray214[local59];
			local11 = Static223.anIntArray372[local59];
			local59 = local59 + 1 & 0xFFF;
			if (arg2 == local11 && local49 == arg8) {
				local51 = true;
				break;
			}
			if (arg1 != 0) {
				if ((arg1 < 5 || arg1 == 10) && Static228.aClass90Array1[Static197.anInt2422].method2722(local11, arg8, arg1 - 1, arg3, 1, local49, arg2)) {
					local51 = true;
					break;
				}
				if (arg1 < 10 && Static228.aClass90Array1[Static197.anInt2422].method2712(local49, arg1 - 1, local11, arg8, arg2, 1, arg3)) {
					local51 = true;
					break;
				}
			}
			if (arg7 != 0 && arg9 != 0 && Static228.aClass90Array1[Static197.anInt2422].method2713(local49, local11, 1, arg2, arg7, arg8, arg9, arg10)) {
				local51 = true;
				break;
			}
			local197 = Static73.anIntArrayArray9[local11][local49] + 1;
			if (local11 > 0 && Static168.anIntArrayArray25[local11 - 1][local49] == 0 && (local76[local11 - 1][local49] & 0x12C0108) == 0) {
				Static223.anIntArray372[local62] = local11 - 1;
				Static144.anIntArray214[local62] = local49;
				local62 = local62 + 1 & 0xFFF;
				Static168.anIntArrayArray25[local11 - 1][local49] = 2;
				Static73.anIntArrayArray9[local11 - 1][local49] = local197;
			}
			if (local11 < 103 && Static168.anIntArrayArray25[local11 + 1][local49] == 0 && (local76[local11 + 1][local49] & 0x12C0180) == 0) {
				Static223.anIntArray372[local62] = local11 + 1;
				Static144.anIntArray214[local62] = local49;
				Static168.anIntArrayArray25[local11 + 1][local49] = 8;
				Static73.anIntArrayArray9[local11 + 1][local49] = local197;
				local62 = local62 + 1 & 0xFFF;
			}
			if (local49 > 0 && Static168.anIntArrayArray25[local11][local49 - 1] == 0 && (local76[local11][local49 - 1] & 0x12C0102) == 0) {
				Static223.anIntArray372[local62] = local11;
				Static144.anIntArray214[local62] = local49 - 1;
				Static168.anIntArrayArray25[local11][local49 - 1] = 1;
				local62 = local62 + 1 & 0xFFF;
				Static73.anIntArrayArray9[local11][local49 - 1] = local197;
			}
			if (local49 < 103 && Static168.anIntArrayArray25[local11][local49 + 1] == 0 && (local76[local11][local49 + 1] & 0x12C0120) == 0) {
				Static223.anIntArray372[local62] = local11;
				Static144.anIntArray214[local62] = local49 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static168.anIntArrayArray25[local11][local49 + 1] = 4;
				Static73.anIntArrayArray9[local11][local49 + 1] = local197;
			}
			if (local11 > 0 && local49 > 0 && Static168.anIntArrayArray25[local11 - 1][local49 - 1] == 0 && (local76[local11 - 1][local49 - 1] & 0x12C010E) == 0 && (local76[local11 - 1][local49] & 0x12C0108) == 0 && (local76[local11][local49 - 1] & 0x12C0102) == 0) {
				Static223.anIntArray372[local62] = local11 - 1;
				Static144.anIntArray214[local62] = local49 - 1;
				local62 = local62 + 1 & 0xFFF;
				Static168.anIntArrayArray25[local11 - 1][local49 - 1] = 3;
				Static73.anIntArrayArray9[local11 - 1][local49 - 1] = local197;
			}
			if (local11 < 103 && local49 > 0 && Static168.anIntArrayArray25[local11 + 1][local49 - 1] == 0 && (local76[local11 + 1][local49 - 1] & 0x12C0183) == 0 && (local76[local11 + 1][local49] & 0x12C0180) == 0 && (local76[local11][local49 - 1] & 0x12C0102) == 0) {
				Static223.anIntArray372[local62] = local11 + 1;
				Static144.anIntArray214[local62] = local49 - 1;
				Static168.anIntArrayArray25[local11 + 1][local49 - 1] = 9;
				local62 = local62 + 1 & 0xFFF;
				Static73.anIntArrayArray9[local11 + 1][local49 - 1] = local197;
			}
			if (local11 > 0 && local49 < 103 && Static168.anIntArrayArray25[local11 - 1][local49 + 1] == 0 && (local76[local11 - 1][local49 + 1] & 0x12C0138) == 0 && (local76[local11 - 1][local49] & 0x12C0108) == 0 && (local76[local11][local49 + 1] & 0x12C0120) == 0) {
				Static223.anIntArray372[local62] = local11 - 1;
				Static144.anIntArray214[local62] = local49 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static168.anIntArrayArray25[local11 - 1][local49 + 1] = 6;
				Static73.anIntArrayArray9[local11 - 1][local49 + 1] = local197;
			}
			if (local11 < 103 && local49 < 103 && Static168.anIntArrayArray25[local11 + 1][local49 + 1] == 0 && (local76[local11 + 1][local49 + 1] & 0x12C01E0) == 0 && (local76[local11 + 1][local49] & 0x12C0180) == 0 && (local76[local11][local49 + 1] & 0x12C0120) == 0) {
				Static223.anIntArray372[local62] = local11 + 1;
				Static144.anIntArray214[local62] = local49 + 1;
				Static168.anIntArrayArray25[local11 + 1][local49 + 1] = 12;
				Static73.anIntArrayArray9[local11 + 1][local49 + 1] = local197;
				local62 = local62 + 1 & 0xFFF;
			}
		}
		Static80.anInt1790 = 0;
		@Pc(820) int local820;
		if (!local51) {
			if (!arg0) {
				return false;
			}
			local197 = 1000;
			local820 = 100;
			for (@Pc(827) int local827 = arg2 - 10; local827 <= arg2 + 10; local827++) {
				for (@Pc(834) int local834 = arg8 - 10; local834 <= arg8 + 10; local834++) {
					if (local827 >= 0 && local834 >= 0 && local827 < 104 && local834 < 104 && Static73.anIntArrayArray9[local827][local834] < 100) {
						@Pc(863) int local863 = 0;
						if (local827 < arg2) {
							local863 = arg2 - local827;
						} else if (local827 > arg2 + arg7 - 1) {
							local863 = local827 + 1 - arg7 - arg2;
						}
						@Pc(896) int local896 = 0;
						if (local834 < arg8) {
							local896 = arg8 - local834;
						} else if (arg8 + arg9 - 1 < local834) {
							local896 = local834 + 1 - arg9 - arg8;
						}
						@Pc(929) int local929 = local896 * local896 + local863 * local863;
						if (local929 < local197 || local197 == local929 && local820 > Static73.anIntArrayArray9[local827][local834]) {
							local49 = local834;
							local197 = local929;
							local820 = Static73.anIntArrayArray9[local827][local834];
							local11 = local827;
						}
					}
				}
			}
			if (local197 == 1000) {
				return false;
			}
			if (local11 == arg6 && local49 == arg4) {
				return false;
			}
			Static80.anInt1790 = 1;
		}
		@Pc(1002) byte local1002 = 0;
		Static223.anIntArray372[0] = local11;
		local59 = local1002 + 1;
		Static144.anIntArray214[0] = local49;
		local197 = local820 = Static168.anIntArrayArray25[local11][local49];
		while (local11 != arg6 || arg4 != local49) {
			if (local197 != local820) {
				local820 = local197;
				Static223.anIntArray372[local59] = local11;
				Static144.anIntArray214[local59++] = local49;
			}
			if ((local197 & 0x1) != 0) {
				local49++;
			} else if ((local197 & 0x4) != 0) {
				local49--;
			}
			if ((local197 & 0x2) != 0) {
				local11++;
			} else if ((local197 & 0x8) != 0) {
				local11--;
			}
			local197 = Static168.anIntArrayArray25[local11][local49];
		}
		if (local59 > 0) {
			Static132.method2334(arg5, local59);
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}
}
