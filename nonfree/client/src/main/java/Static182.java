import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
	public static int anInt3969 = -1;

	@OriginalMember(owner = "client!sb", name = "eb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1367 = Static64.method1101("null");

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1368 = Static64.method1101(" ");

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "[I")
	public static int[] anIntArray301 = new int[] { 12543016, 15504954, 15914854, 16773818 };

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	public static void method3077() {
		if (Static208.aBooleanArray25[96]) {
			Static165.anInt3673 += (-Static165.anInt3673 - 24) / 2;
		} else if (Static208.aBooleanArray25[97]) {
			Static165.anInt3673 += (24 - Static165.anInt3673) / 2;
		} else {
			Static165.anInt3673 /= 2;
		}
		if (Static208.aBooleanArray25[98]) {
			Static172.anInt3848 += (12 - Static172.anInt3848) / 2;
		} else if (Static208.aBooleanArray25[99]) {
			Static172.anInt3848 += (-Static172.anInt3848 - 12) / 2;
		} else {
			Static172.anInt3848 /= 2;
		}
		Static16.anInt379 += Static165.anInt3673 / 2;
		Static20.anInt552 += Static172.anInt3848 / 2;
		@Pc(93) int local93 = Static13.anInt321 + Static73.aClass5_Sub1_Sub1_1.anInt3598;
		@Pc(98) int local98 = Static73.aClass5_Sub1_Sub1_1.anInt3624 + Static76.anInt1703;
		if (Static151.anInt3335 - local98 < -500 || Static151.anInt3335 - local98 > 500 || Static161.anInt3485 - local93 < -500 || Static161.anInt3485 - local93 > 500) {
			Static161.anInt3485 = local93;
			Static151.anInt3335 = local98;
		}
		if (local98 != Static151.anInt3335) {
			Static151.anInt3335 += (local98 - Static151.anInt3335) / 16;
		}
		if (Static161.anInt3485 != local93) {
			Static161.anInt3485 += (local93 - Static161.anInt3485) / 16;
		}
		Static80.method1381();
	}

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "(II)I")
	public static int method3078(@OriginalArg(1) int arg0) {
		@Pc(12) Class124 local12 = Static144.method2492(arg0);
		@Pc(15) int local15 = local12.anInt4668;
		@Pc(18) int local18 = local12.anInt4660;
		@Pc(21) int local21 = local12.anInt4667;
		@Pc(27) int local27 = Class45.anIntArray97[local21 - local18];
		return local27 & Static86.anIntArray125[local15] >> local18;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIZLclient!me;I)V")
	public static void method3079(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class71 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt2802;
		if (arg2.aByte11 == 0) {
			arg2.anInt2802 = arg2.anInt2855;
		} else if (arg2.aByte11 == 1) {
			arg2.anInt2802 = arg3 - arg2.anInt2855;
		} else if (arg2.aByte11 == 2) {
			arg2.anInt2802 = arg2.anInt2855 * arg3 >> 14;
		} else if (arg2.aByte11 == 3) {
			if (arg2.anInt2777 == 2) {
				arg2.anInt2802 = arg2.anInt2803 * (arg2.anInt2855 - 1) + arg2.anInt2855 * 32;
			} else if (arg2.anInt2777 == 7) {
				arg2.anInt2802 = arg2.anInt2855 * 115 + (arg2.anInt2855 - 1) * arg2.anInt2803;
			}
		}
		@Pc(94) int local94 = arg2.anInt2835;
		if (arg2.aByte8 == 0) {
			arg2.anInt2835 = arg2.anInt2797;
		} else if (arg2.aByte8 == 1) {
			arg2.anInt2835 = arg0 - arg2.anInt2797;
		} else if (arg2.aByte8 == 2) {
			arg2.anInt2835 = arg2.anInt2797 * arg0 >> 14;
		} else if (arg2.aByte8 == 3) {
			if (arg2.anInt2777 == 2) {
				arg2.anInt2835 = arg2.anInt2797 * 32 + (arg2.anInt2797 - 1) * arg2.anInt2826;
			} else if (arg2.anInt2777 == 7) {
				arg2.anInt2835 = (arg2.anInt2797 - 1) * arg2.anInt2826 + arg2.anInt2797 * 12;
			}
		}
		if (arg2.aByte11 == 4) {
			arg2.anInt2802 = arg2.anInt2835 * arg2.anInt2799 / arg2.anInt2778;
		}
		if (arg2.aByte8 == 4) {
			arg2.anInt2835 = arg2.anInt2778 * arg2.anInt2802 / arg2.anInt2799;
		}
		if (Static135.aBoolean135 && (Static33.method587(arg2) != 0 || arg2.anInt2777 == 0)) {
			if (arg2.anInt2835 < 5 && arg2.anInt2802 < 5) {
				arg2.anInt2835 = 5;
				arg2.anInt2802 = 5;
			} else {
				if (arg2.anInt2835 <= 0) {
					arg2.anInt2835 = 5;
				}
				if (arg2.anInt2802 <= 0) {
					arg2.anInt2802 = 5;
				}
			}
		}
		if (arg2.anInt2815 == 1337) {
			Static20.aClass71_6 = arg2;
		}
		if (arg1 && arg2.anObjectArray23 != null && (local8 != arg2.anInt2802 || local94 != arg2.anInt2835)) {
			@Pc(287) Class1_Sub21 local287 = new Class1_Sub21();
			local287.anObjectArray32 = arg2.anObjectArray23;
			local287.aClass71_25 = arg2;
			Static152.aClass105_17.method3119(local287);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBIIIIIIIIIZI)Z")
	public static boolean method3080(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int arg11) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static168.anIntArrayArray25[local3][local7] = 0;
				Static73.anIntArrayArray9[local3][local7] = 99999999;
			}
		}
		Static168.anIntArrayArray25[arg1][arg8] = 99;
		Static73.anIntArrayArray9[arg1][arg8] = 0;
		@Pc(54) int local54 = arg8;
		local7 = arg1;
		@Pc(58) byte local58 = 0;
		Static223.anIntArray372[0] = arg1;
		@Pc(65) int local65 = local58 + 1;
		Static144.anIntArray214[0] = arg8;
		@Pc(69) boolean local69 = false;
		@Pc(71) int local71 = 0;
		@Pc(76) int[][] local76 = Static228.aClass90Array1[Static197.anInt2422].anIntArrayArray22;
		@Pc(198) int local198;
		@Pc(247) int local247;
		label367: while (local71 != local65) {
			local7 = Static223.anIntArray372[local71];
			local54 = Static144.anIntArray214[local71];
			local71 = local71 + 1 & 0xFFF;
			if (local7 == arg9 && arg3 == local54) {
				local69 = true;
				break;
			}
			if (arg4 != 0) {
				if ((arg4 < 5 || arg4 == 10) && Static228.aClass90Array1[Static197.anInt2422].method2722(local7, arg3, arg4 - 1, arg0, arg2, local54, arg9)) {
					local69 = true;
					break;
				}
				if (arg4 < 10 && Static228.aClass90Array1[Static197.anInt2422].method2712(local54, arg4 - 1, local7, arg3, arg9, arg2, arg0)) {
					local69 = true;
					break;
				}
			}
			if (arg7 != 0 && arg11 != 0 && Static228.aClass90Array1[Static197.anInt2422].method2713(local54, local7, arg2, arg9, arg7, arg3, arg11, arg6)) {
				local69 = true;
				break;
			}
			local198 = Static73.anIntArrayArray9[local7][local54] + 1;
			if (local7 > 0 && Static168.anIntArrayArray25[local7 - 1][local54] == 0 && (local76[local7 - 1][local54] & 0x12C010E) == 0 && (local76[local7 - 1][local54 + arg2 - 1] & 0x12C0138) == 0) {
				local247 = 1;
				while (true) {
					if (local247 >= arg2 - 1) {
						Static223.anIntArray372[local65] = local7 - 1;
						Static144.anIntArray214[local65] = local54;
						local65 = local65 + 1 & 0xFFF;
						Static168.anIntArrayArray25[local7 - 1][local54] = 2;
						Static73.anIntArrayArray9[local7 - 1][local54] = local198;
						break;
					}
					if ((local76[local7 - 1][local247 + local54] & 0x12C013E) != 0) {
						break;
					}
					local247++;
				}
			}
			if (local7 < 102 && Static168.anIntArrayArray25[local7 + 1][local54] == 0 && (local76[arg2 + local7][local54] & 0x12C0183) == 0 && (local76[arg2 + local7][local54 + arg2 - 1] & 0x12C01E0) == 0) {
				local247 = 1;
				while (true) {
					if (arg2 - 1 <= local247) {
						Static223.anIntArray372[local65] = local7 + 1;
						Static144.anIntArray214[local65] = local54;
						Static168.anIntArrayArray25[local7 + 1][local54] = 8;
						local65 = local65 + 1 & 0xFFF;
						Static73.anIntArrayArray9[local7 + 1][local54] = local198;
						break;
					}
					if ((local76[arg2 + local7][local247 + local54] & 0x12C01E3) != 0) {
						break;
					}
					local247++;
				}
			}
			if (local54 > 0 && Static168.anIntArrayArray25[local7][local54 - 1] == 0 && (local76[local7][local54 - 1] & 0x12C010E) == 0 && (local76[arg2 + local7 - 1][local54 - 1] & 0x12C0183) == 0) {
				local247 = 1;
				while (true) {
					if (arg2 - 1 <= local247) {
						Static223.anIntArray372[local65] = local7;
						Static144.anIntArray214[local65] = local54 - 1;
						local65 = local65 + 1 & 0xFFF;
						Static168.anIntArrayArray25[local7][local54 - 1] = 1;
						Static73.anIntArrayArray9[local7][local54 - 1] = local198;
						break;
					}
					if ((local76[local7 + local247][local54 - 1] & 0x12C018F) != 0) {
						break;
					}
					local247++;
				}
			}
			if (local54 < 102 && Static168.anIntArrayArray25[local7][local54 + 1] == 0 && (local76[local7][local54 + arg2] & 0x12C0138) == 0 && (local76[arg2 + local7 - 1][local54 + arg2] & 0x12C01E0) == 0) {
				local247 = 1;
				while (true) {
					if (arg2 - 1 <= local247) {
						Static223.anIntArray372[local65] = local7;
						Static144.anIntArray214[local65] = local54 + 1;
						Static168.anIntArrayArray25[local7][local54 + 1] = 4;
						local65 = local65 + 1 & 0xFFF;
						Static73.anIntArrayArray9[local7][local54 + 1] = local198;
						break;
					}
					if ((local76[local247 + local7][arg2 + local54] & 0x12C01F8) != 0) {
						break;
					}
					local247++;
				}
			}
			if (local7 > 0 && local54 > 0 && Static168.anIntArrayArray25[local7 - 1][local54 - 1] == 0 && (local76[local7 - 1][arg2 + local54 - 2] & 0x12C0138) == 0 && (local76[local7 - 1][local54 - 1] & 0x12C010E) == 0 && (local76[arg2 + local7 - 1 - 1][local54 - 1] & 0x12C0183) == 0) {
				local247 = 1;
				while (true) {
					if (arg2 - 1 <= local247) {
						Static223.anIntArray372[local65] = local7 - 1;
						Static144.anIntArray214[local65] = local54 - 1;
						local65 = local65 + 1 & 0xFFF;
						Static168.anIntArrayArray25[local7 - 1][local54 - 1] = 3;
						Static73.anIntArrayArray9[local7 - 1][local54 - 1] = local198;
						break;
					}
					if ((local76[local7 - 1][local247 + local54 - 1] & 0x12C013E) != 0 || (local76[local7 + local247 - 1][local54 - 1] & 0x12C018F) != 0) {
						break;
					}
					local247++;
				}
			}
			if (local7 < 102 && local54 > 0 && Static168.anIntArrayArray25[local7 + 1][local54 - 1] == 0 && (local76[local7 + 1][local54 - 1] & 0x12C010E) == 0 && (local76[local7 + arg2][local54 - 1] & 0x12C0183) == 0 && (local76[arg2 + local7][arg2 + local54 - 1 - 1] & 0x12C01E0) == 0) {
				local247 = 1;
				while (true) {
					if (local247 >= arg2 - 1) {
						Static223.anIntArray372[local65] = local7 + 1;
						Static144.anIntArray214[local65] = local54 - 1;
						Static168.anIntArrayArray25[local7 + 1][local54 - 1] = 9;
						local65 = local65 + 1 & 0xFFF;
						Static73.anIntArrayArray9[local7 + 1][local54 - 1] = local198;
						break;
					}
					if ((local76[arg2 + local7][local54 + local247 - 1] & 0x12C01E3) != 0 || (local76[local247 + local7 + 1][local54 - 1] & 0x12C018F) != 0) {
						break;
					}
					local247++;
				}
			}
			if (local7 > 0 && local54 < 102 && Static168.anIntArrayArray25[local7 - 1][local54 + 1] == 0 && (local76[local7 - 1][local54 + 1] & 0x12C010E) == 0 && (local76[local7 - 1][local54 + arg2] & 0x12C0138) == 0 && (local76[local7][arg2 + local54] & 0x12C01E0) == 0) {
				local247 = 1;
				while (true) {
					if (arg2 - 1 <= local247) {
						Static223.anIntArray372[local65] = local7 - 1;
						Static144.anIntArray214[local65] = local54 + 1;
						local65 = local65 + 1 & 0xFFF;
						Static168.anIntArrayArray25[local7 - 1][local54 + 1] = 6;
						Static73.anIntArrayArray9[local7 - 1][local54 + 1] = local198;
						break;
					}
					if ((local76[local7 - 1][local54 + local247 + 1] & 0x12C013E) != 0 || (local76[local247 + local7 - 1][arg2 + local54] & 0x12C01F8) != 0) {
						break;
					}
					local247++;
				}
			}
			if (local7 < 102 && local54 < 102 && Static168.anIntArrayArray25[local7 + 1][local54 + 1] == 0 && (local76[local7 + 1][arg2 + local54] & 0x12C0138) == 0 && (local76[arg2 + local7][arg2 + local54] & 0x12C01E0) == 0 && (local76[local7 + arg2][local54 + 1] & 0x12C0183) == 0) {
				for (local247 = 1; local247 < arg2 - 1; local247++) {
					if ((local76[local7 + local247 + 1][arg2 + local54] & 0x12C01F8) != 0 || (local76[local7 + arg2][local54 + local247 + 1] & 0x12C01E3) != 0) {
						continue label367;
					}
				}
				Static223.anIntArray372[local65] = local7 + 1;
				Static144.anIntArray214[local65] = local54 + 1;
				local65 = local65 + 1 & 0xFFF;
				Static168.anIntArrayArray25[local7 + 1][local54 + 1] = 12;
				Static73.anIntArrayArray9[local7 + 1][local54 + 1] = local198;
			}
		}
		Static80.anInt1790 = 0;
		if (!local69) {
			if (!arg10) {
				return false;
			}
			local198 = 1000;
			local247 = 100;
			for (@Pc(1212) int local1212 = arg9 - 10; local1212 <= arg9 + 10; local1212++) {
				for (@Pc(1218) int local1218 = arg3 - 10; local1218 <= arg3 + 10; local1218++) {
					if (local1212 >= 0 && local1218 >= 0 && local1212 < 104 && local1218 < 104 && Static73.anIntArrayArray9[local1212][local1218] < 100) {
						@Pc(1247) int local1247 = 0;
						@Pc(1249) int local1249 = 0;
						if (local1218 < arg3) {
							local1247 = arg3 - local1218;
						} else if (arg11 + arg3 - 1 < local1218) {
							local1247 = local1218 + 1 - arg3 - arg11;
						}
						if (local1212 < arg9) {
							local1249 = arg9 - local1212;
						} else if (local1212 > arg9 + arg7 - 1) {
							local1249 = local1212 + 1 - arg9 - arg7;
						}
						@Pc(1315) int local1315 = local1249 * local1249 + local1247 * local1247;
						if (local1315 < local198 || local1315 == local198 && local247 > Static73.anIntArrayArray9[local1212][local1218]) {
							local54 = local1218;
							local198 = local1315;
							local7 = local1212;
							local247 = Static73.anIntArrayArray9[local1212][local1218];
						}
					}
				}
			}
			if (local198 == 1000) {
				return false;
			}
			if (arg1 == local7 && arg8 == local54) {
				return false;
			}
			Static80.anInt1790 = 1;
		}
		@Pc(1382) byte local1382 = 0;
		Static223.anIntArray372[0] = local7;
		local71 = local1382 + 1;
		Static144.anIntArray214[0] = local54;
		local198 = local247 = Static168.anIntArrayArray25[local7][local54];
		while (arg1 != local7 || arg8 != local54) {
			if (local198 != local247) {
				local247 = local198;
				Static223.anIntArray372[local71] = local7;
				Static144.anIntArray214[local71++] = local54;
			}
			if ((local198 & 0x1) != 0) {
				local54++;
			} else if ((local198 & 0x4) != 0) {
				local54--;
			}
			if ((local198 & 0x2) != 0) {
				local7++;
			} else if ((local198 & 0x8) != 0) {
				local7--;
			}
			local198 = Static168.anIntArrayArray25[local7][local54];
		}
		if (local71 > 0) {
			Static132.method2334(arg5, local71);
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
	public static void method3081() {
		while (true) {
			@Pc(10) Class105 local10 = Static28.aClass105_4;
			@Pc(17) Class1_Sub12 local17;
			synchronized (Static28.aClass105_4) {
				local17 = (Class1_Sub12) Static211.aClass105_22.method3117();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass70_Sub1_17.method3549(local17.aByteArray15, (int) local17.aLong170, local17.aClass100_32, false);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIILclient!q;II)V")
	public static void method3082(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class90 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) long local3 = 0L;
		if (arg4 == 0) {
			local3 = Static225.method3687(arg5, arg1, arg0);
		} else if (arg4 == 1) {
			local3 = Static104.method1769(arg5, arg1, arg0);
		} else if (arg4 == 2) {
			local3 = Static25.method503(arg5, arg1, arg0);
		} else if (arg4 == 3) {
			local3 = Static224.method3674(arg5, arg1, arg0);
		}
		@Pc(62) int local62 = (int) local3 >> 14 & 0x1F;
		@Pc(69) int local69 = (int) (local3 >>> 32) & Integer.MAX_VALUE;
		@Pc(75) Class82 local75 = Static9.method132(local69);
		if (local75.method2570()) {
			Static135.method2408(local75, arg1, arg0, arg5);
		}
		@Pc(92) int local92 = (int) local3 >> 20 & 0x3;
		if (local3 == 0L) {
			return;
		}
		if (arg4 == 0) {
			Static148.method2538(arg5, arg1, arg0);
			if (local75.anInt3294 != 0) {
				arg3.method2705(arg0, local92, local62, local75.aBoolean155, arg1);
				return;
			}
		} else if (arg4 == 1) {
			Static60.method1054(arg5, arg1, arg0);
		} else if (arg4 == 2) {
			Static93.method1545(arg5, arg1, arg0);
			if (local75.anInt3294 != 0 && arg1 + local75.anInt3258 < 104 && local75.anInt3258 + arg0 < 104 && local75.anInt3279 + arg1 < 104 && arg0 + local75.anInt3279 < 104) {
				arg3.method2715(arg0, local75.anInt3258, local75.anInt3279, arg1, local92, local75.aBoolean155);
				return;
			}
		} else {
			if (arg4 == 3) {
				Static13.method272(arg5, arg1, arg0);
				if (local75.anInt3294 == 1) {
					arg3.method2716(arg1, arg0);
					return;
				}
			}
			return;
		}
	}
}
