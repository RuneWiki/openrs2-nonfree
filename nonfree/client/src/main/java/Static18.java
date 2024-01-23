import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "Lclient!mi;")
	public static Class75 aClass75_2 = new Class75();

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "Lclient!oj;")
	public static Class84 aClass84_10 = new Class84(64);

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "Lclient!nativeadvert/browsercontrol;")
	public static browsercontrol aBrowsercontrol1 = null;

	@OriginalMember(owner = "client!bg", name = "G", descriptor = "Lclient!hh;")
	public static Class50 aClass50_148 = Static186.method3527("compass");

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)V")
	public static void method264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg1 >= arg0) {
			for (local15 = arg0; local15 < arg1; local15++) {
				Static139.anIntArrayArray21[local15][arg3] = arg2;
			}
		} else {
			for (local15 = arg1; local15 < arg0; local15++) {
				Static139.anIntArrayArray21[local15][arg3] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BZ)V")
	public static void method265(@OriginalArg(1) boolean arg0) {
		if (Static163.anInt3375 == Static230.aClass20_Sub3_Sub1_3.anInt3022 >> 7 && Static230.aClass20_Sub3_Sub1_3.anInt3008 >> 7 == Static66.anInt1298) {
			Static163.anInt3375 = 0;
		}
		@Pc(29) int local29 = Static13.anInt250;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(42) int local42 = 0; local42 < local29; local42++) {
			@Pc(59) Class20_Sub3_Sub1 local59;
			@Pc(53) long local53;
			if (arg0) {
				local53 = 8791798054912L;
				local59 = Static230.aClass20_Sub3_Sub1_3;
			} else {
				local53 = (long) Static52.anIntArray356[local42] << 32;
				local59 = Static232.aClass20_Sub3_Sub1Array1[Static52.anIntArray356[local42]];
			}
			if (local59 != null && local59.method2467()) {
				local59.aBoolean70 = false;
				if ((Static125.aBoolean111 && Static13.anInt250 > 200 || Static13.anInt250 > 50) && !arg0 && local59.anInt3057 == local59.anInt3051) {
					local59.aBoolean70 = true;
				}
				@Pc(105) int local105 = local59.anInt3022 >> 7;
				@Pc(110) int local110 = local59.anInt3008 >> 7;
				if (local105 >= 0 && local105 < 104 && local110 >= 0 && local110 < 104) {
					if (local59.aClass20_Sub5_1 == null || Static107.anInt2132 < local59.anInt1516 || Static107.anInt2132 >= local59.anInt1499) {
						if ((local59.anInt3022 & 0x7F) == 64 && (local59.anInt3008 & 0x7F) == 64) {
							if (Static1.anInt41 == Static231.anIntArrayArray39[local105][local110]) {
								continue;
							}
							Static231.anIntArrayArray39[local105][local110] = Static1.anInt41;
						}
						local59.anInt3011 = Static131.method2213(local59.anInt3008, local59.anInt3022, Static212.anInt4195);
						Static229.method3476(Static212.anInt4195, local59.anInt3022, local59.anInt3008, local59.anInt3011, 60, local59, local59.anInt3054, local53, local59.aBoolean128);
					} else {
						local59.aBoolean70 = false;
						local59.anInt3011 = Static131.method2213(local59.anInt3008, local59.anInt3022, Static212.anInt4195);
						Static25.method369(Static212.anInt4195, local59.anInt3022, local59.anInt3008, local59.anInt3011, local59, local59.anInt3054, local53, local59.anInt1518, local59.anInt1495, local59.anInt1511, local59.anInt1520);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIZIIIIIIIIII)Z")
	public static boolean method266(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static22.anIntArrayArray4[local7][local11] = 0;
				Static228.anIntArrayArray37[local7][local11] = 99999999;
			}
		}
		Static22.anIntArrayArray4[arg4][arg11] = 99;
		local11 = arg4;
		@Pc(47) int local47 = arg11;
		Static228.anIntArrayArray37[arg4][arg11] = 0;
		@Pc(55) byte local55 = 0;
		Static86.anIntArray141[0] = arg4;
		@Pc(61) boolean local61 = false;
		@Pc(64) int local64 = local55 + 1;
		Static194.anIntArray446[0] = arg11;
		@Pc(68) int local68 = 0;
		@Pc(73) int[][] local73 = Static22.aClass16Array1[Static212.anInt4195].anIntArrayArray6;
		@Pc(195) int local195;
		@Pc(237) int local237;
		label367: while (local64 != local68) {
			local47 = Static194.anIntArray446[local68];
			local11 = Static86.anIntArray141[local68];
			local68 = local68 + 1 & 0xFFF;
			if (arg2 == local11 && local47 == arg10) {
				local61 = true;
				break;
			}
			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && Static22.aClass16Array1[Static212.anInt4195].method435(local11, arg2, arg10, arg5, arg8 - 1, arg9, local47)) {
					local61 = true;
					break;
				}
				if (arg8 < 10 && Static22.aClass16Array1[Static212.anInt4195].method433(arg10, arg8 - 1, local11, arg2, arg9, arg5, local47)) {
					local61 = true;
					break;
				}
			}
			if (arg3 != 0 && arg0 != 0 && Static22.aClass16Array1[Static212.anInt4195].method424(arg3, local11, local47, arg0, arg5, arg10, arg6, arg2)) {
				local61 = true;
				break;
			}
			local195 = Static228.anIntArrayArray37[local11][local47] + 1;
			if (local11 > 0 && Static22.anIntArrayArray4[local11 - 1][local47] == 0 && (local73[local11 - 1][local47] & 0x12C010E) == 0 && (local73[local11 - 1][local47 + arg5 - 1] & 0x12C0138) == 0) {
				local237 = 1;
				while (true) {
					if (local237 >= arg5 - 1) {
						Static86.anIntArray141[local64] = local11 - 1;
						Static194.anIntArray446[local64] = local47;
						local64 = local64 + 1 & 0xFFF;
						Static22.anIntArrayArray4[local11 - 1][local47] = 2;
						Static228.anIntArrayArray37[local11 - 1][local47] = local195;
						break;
					}
					if ((local73[local11 - 1][local237 + local47] & 0x12C013E) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local11 < 102 && Static22.anIntArrayArray4[local11 + 1][local47] == 0 && (local73[local11 + arg5][local47] & 0x12C0183) == 0 && (local73[local11 + arg5][arg5 + local47 - 1] & 0x12C01E0) == 0) {
				local237 = 1;
				while (true) {
					if (local237 >= arg5 - 1) {
						Static86.anIntArray141[local64] = local11 + 1;
						Static194.anIntArray446[local64] = local47;
						Static22.anIntArrayArray4[local11 + 1][local47] = 8;
						Static228.anIntArrayArray37[local11 + 1][local47] = local195;
						local64 = local64 + 1 & 0xFFF;
						break;
					}
					if ((local73[local11 + arg5][local47 + local237] & 0x12C01E3) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local47 > 0 && Static22.anIntArrayArray4[local11][local47 - 1] == 0 && (local73[local11][local47 - 1] & 0x12C010E) == 0 && (local73[arg5 + local11 - 1][local47 - 1] & 0x12C0183) == 0) {
				local237 = 1;
				while (true) {
					if (local237 >= arg5 - 1) {
						Static86.anIntArray141[local64] = local11;
						Static194.anIntArray446[local64] = local47 - 1;
						local64 = local64 + 1 & 0xFFF;
						Static22.anIntArrayArray4[local11][local47 - 1] = 1;
						Static228.anIntArrayArray37[local11][local47 - 1] = local195;
						break;
					}
					if ((local73[local237 + local11][local47 - 1] & 0x12C018F) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local47 < 102 && Static22.anIntArrayArray4[local11][local47 + 1] == 0 && (local73[local11][arg5 + local47] & 0x12C0138) == 0 && (local73[local11 + arg5 - 1][arg5 + local47] & 0x12C01E0) == 0) {
				local237 = 1;
				while (true) {
					if (local237 >= arg5 - 1) {
						Static86.anIntArray141[local64] = local11;
						Static194.anIntArray446[local64] = local47 + 1;
						local64 = local64 + 1 & 0xFFF;
						Static22.anIntArrayArray4[local11][local47 + 1] = 4;
						Static228.anIntArrayArray37[local11][local47 + 1] = local195;
						break;
					}
					if ((local73[local237 + local11][arg5 + local47] & 0x12C01F8) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local11 > 0 && local47 > 0 && Static22.anIntArrayArray4[local11 - 1][local47 - 1] == 0 && (local73[local11 - 1][arg5 + local47 - 1 - 1] & 0x12C0138) == 0 && (local73[local11 - 1][local47 - 1] & 0x12C010E) == 0 && (local73[local11 + arg5 - 1 - 1][local47 - 1] & 0x12C0183) == 0) {
				local237 = 1;
				while (true) {
					if (arg5 - 1 <= local237) {
						Static86.anIntArray141[local64] = local11 - 1;
						Static194.anIntArray446[local64] = local47 - 1;
						local64 = local64 + 1 & 0xFFF;
						Static22.anIntArrayArray4[local11 - 1][local47 - 1] = 3;
						Static228.anIntArrayArray37[local11 - 1][local47 - 1] = local195;
						break;
					}
					if ((local73[local11 - 1][local47 + local237 - 1] & 0x12C013E) != 0 || (local73[local237 + local11 - 1][local47 - 1] & 0x12C018F) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local11 < 102 && local47 > 0 && Static22.anIntArrayArray4[local11 + 1][local47 - 1] == 0 && (local73[local11 + 1][local47 - 1] & 0x12C010E) == 0 && (local73[arg5 + local11][local47 - 1] & 0x12C0183) == 0 && (local73[local11 + arg5][local47 + arg5 - 1 - 1] & 0x12C01E0) == 0) {
				local237 = 1;
				while (true) {
					if (local237 >= arg5 - 1) {
						Static86.anIntArray141[local64] = local11 + 1;
						Static194.anIntArray446[local64] = local47 - 1;
						local64 = local64 + 1 & 0xFFF;
						Static22.anIntArrayArray4[local11 + 1][local47 - 1] = 9;
						Static228.anIntArrayArray37[local11 + 1][local47 - 1] = local195;
						break;
					}
					if ((local73[local11 + arg5][local237 + local47 - 1] & 0x12C01E3) != 0 || (local73[local11 + local237 + 1][local47 - 1] & 0x12C018F) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local11 > 0 && local47 < 102 && Static22.anIntArrayArray4[local11 - 1][local47 + 1] == 0 && (local73[local11 - 1][local47 + 1] & 0x12C010E) == 0 && (local73[local11 - 1][local47 + arg5] & 0x12C0138) == 0 && (local73[local11][local47 + arg5] & 0x12C01E0) == 0) {
				local237 = 1;
				while (true) {
					if (local237 >= arg5 - 1) {
						Static86.anIntArray141[local64] = local11 - 1;
						Static194.anIntArray446[local64] = local47 + 1;
						Static22.anIntArrayArray4[local11 - 1][local47 + 1] = 6;
						local64 = local64 + 1 & 0xFFF;
						Static228.anIntArrayArray37[local11 - 1][local47 + 1] = local195;
						break;
					}
					if ((local73[local11 - 1][local47 + local237 + 1] & 0x12C013E) != 0 || (local73[local11 + local237 - 1][local47 + arg5] & 0x12C01F8) != 0) {
						break;
					}
					local237++;
				}
			}
			if (local11 < 102 && local47 < 102 && Static22.anIntArrayArray4[local11 + 1][local47 + 1] == 0 && (local73[local11 + 1][local47 + arg5] & 0x12C0138) == 0 && (local73[local11 + arg5][local47 + arg5] & 0x12C01E0) == 0 && (local73[local11 + arg5][local47 + 1] & 0x12C0183) == 0) {
				for (local237 = 1; local237 < arg5 - 1; local237++) {
					if ((local73[local11 + local237 + 1][arg5 + local47] & 0x12C01F8) != 0 || (local73[local11 + arg5][local237 + local47 + 1] & 0x12C01E3) != 0) {
						continue label367;
					}
				}
				Static86.anIntArray141[local64] = local11 + 1;
				Static194.anIntArray446[local64] = local47 + 1;
				Static22.anIntArrayArray4[local11 + 1][local47 + 1] = 12;
				local64 = local64 + 1 & 0xFFF;
				Static228.anIntArrayArray37[local11 + 1][local47 + 1] = local195;
			}
		}
		Static181.anInt3752 = 0;
		if (!local61) {
			if (!arg1) {
				return false;
			}
			local195 = 1000;
			local237 = 100;
			for (@Pc(1205) int local1205 = arg2 - 10; local1205 <= arg2 + 10; local1205++) {
				for (@Pc(1212) int local1212 = arg10 - 10; local1212 <= arg10 + 10; local1212++) {
					if (local1205 >= 0 && local1212 >= 0 && local1205 < 104 && local1212 < 104 && Static228.anIntArrayArray37[local1205][local1212] < 100) {
						@Pc(1239) int local1239 = 0;
						if (arg2 > local1205) {
							local1239 = arg2 - local1205;
						} else if (local1205 > arg3 + arg2 - 1) {
							local1239 = local1205 + 1 - arg2 - arg3;
						}
						@Pc(1270) int local1270 = 0;
						if (local1212 < arg10) {
							local1270 = arg10 - local1212;
						} else if (local1212 > arg0 + arg10 - 1) {
							local1270 = local1212 + 1 - arg10 - arg0;
						}
						@Pc(1312) int local1312 = local1270 * local1270 + local1239 * local1239;
						if (local1312 < local195 || local195 == local1312 && Static228.anIntArrayArray37[local1205][local1212] < local237) {
							local195 = local1312;
							local47 = local1212;
							local11 = local1205;
							local237 = Static228.anIntArrayArray37[local1205][local1212];
						}
					}
				}
			}
			if (local195 == 1000) {
				return false;
			}
			if (local11 == arg4 && local47 == arg11) {
				return false;
			}
			Static181.anInt3752 = 1;
		}
		@Pc(1384) byte local1384 = 0;
		Static86.anIntArray141[0] = local11;
		local68 = local1384 + 1;
		Static194.anIntArray446[0] = local47;
		@Pc(1400) int local1400;
		local195 = local1400 = Static22.anIntArrayArray4[local11][local47];
		while (arg4 != local11 || arg11 != local47) {
			if (local1400 != local195) {
				local1400 = local195;
				Static86.anIntArray141[local68] = local11;
				Static194.anIntArray446[local68++] = local47;
			}
			if ((local195 & 0x1) != 0) {
				local47++;
			} else if ((local195 & 0x4) != 0) {
				local47--;
			}
			if ((local195 & 0x2) != 0) {
				local11++;
			} else if ((local195 & 0x8) != 0) {
				local11--;
			}
			local195 = Static22.anIntArrayArray4[local11][local47];
		}
		if (local68 > 0) {
			Static36.method580(local68, arg7);
			return true;
		} else if (arg7 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!v;II)V")
	public static void method269(@OriginalArg(0) Class86_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static95.aClass1_Sub17_1 == null) {
			Static104.method1598(true, 255, (byte) 0, 255, null, 0);
			Static216.aClass86_Sub1Array1[arg1] = arg0;
		} else {
			Static95.aClass1_Sub17_1.anInt2656 = arg1 * 8 + 5;
			@Pc(20) int local20 = Static95.aClass1_Sub17_1.method2140();
			@Pc(24) int local24 = Static95.aClass1_Sub17_1.method2140();
			arg0.method3350(local24, local20);
		}
	}
}
