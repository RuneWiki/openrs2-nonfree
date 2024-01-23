import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "[I")
	public static int[] anIntArray505;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "[I")
	public static int[] anIntArray504 = new int[32];

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1378 = Static186.method3527("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1379 = Static186.method3527("(Udns");

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1380 = Static186.method3527("name_icons");

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1381 = Static186.method3527(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1382 = Static186.method3527("Zugewiesener Speicher)3");

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1383 = Static186.method3527("k");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZIIIIIIIII)Z")
	public static boolean method3434(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static22.anIntArrayArray4[local7][local11] = 0;
				Static228.anIntArrayArray37[local7][local11] = 99999999;
			}
		}
		Static22.anIntArrayArray4[arg7][arg2] = 99;
		local11 = arg7;
		Static228.anIntArrayArray37[arg7][arg2] = 0;
		@Pc(56) byte local56 = 0;
		@Pc(58) int local58 = 0;
		Static86.anIntArray141[0] = arg7;
		@Pc(64) boolean local64 = false;
		@Pc(67) int local67 = local56 + 1;
		Static194.anIntArray446[0] = arg2;
		@Pc(71) int local71 = arg2;
		@Pc(76) int[][] local76 = Static22.aClass16Array1[Static212.anInt4195].anIntArrayArray6;
		@Pc(196) int local196;
		while (local58 != local67) {
			local11 = Static86.anIntArray141[local58];
			local71 = Static194.anIntArray446[local58];
			local58 = local58 + 1 & 0xFFF;
			if (arg5 == local11 && arg10 == local71) {
				local64 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static22.aClass16Array1[Static212.anInt4195].method435(local11, arg5, arg10, 2, arg3 - 1, arg8, local71)) {
					local64 = true;
					break;
				}
				if (arg3 < 10 && Static22.aClass16Array1[Static212.anInt4195].method433(arg10, arg3 - 1, local11, arg5, arg8, 2, local71)) {
					local64 = true;
					break;
				}
			}
			if (arg4 != 0 && arg9 != 0 && Static22.aClass16Array1[Static212.anInt4195].method424(arg4, local11, local71, arg9, 2, arg10, arg0, arg5)) {
				local64 = true;
				break;
			}
			local196 = Static228.anIntArrayArray37[local11][local71] + 1;
			if (local11 > 0 && Static22.anIntArrayArray4[local11 - 1][local71] == 0 && (local76[local11 - 1][local71] & 0x12C010E) == 0 && (local76[local11 - 1][local71 + 1] & 0x12C0138) == 0) {
				Static86.anIntArray141[local67] = local11 - 1;
				Static194.anIntArray446[local67] = local71;
				Static22.anIntArrayArray4[local11 - 1][local71] = 2;
				Static228.anIntArrayArray37[local11 - 1][local71] = local196;
				local67 = local67 + 1 & 0xFFF;
			}
			if (local11 < 102 && Static22.anIntArrayArray4[local11 + 1][local71] == 0 && (local76[local11 + 2][local71] & 0x12C0183) == 0 && (local76[local11 + 2][local71 + 1] & 0x12C01E0) == 0) {
				Static86.anIntArray141[local67] = local11 + 1;
				Static194.anIntArray446[local67] = local71;
				Static22.anIntArrayArray4[local11 + 1][local71] = 8;
				local67 = local67 + 1 & 0xFFF;
				Static228.anIntArrayArray37[local11 + 1][local71] = local196;
			}
			if (local71 > 0 && Static22.anIntArrayArray4[local11][local71 - 1] == 0 && (local76[local11][local71 - 1] & 0x12C010E) == 0 && (local76[local11 + 1][local71 - 1] & 0x12C0183) == 0) {
				Static86.anIntArray141[local67] = local11;
				Static194.anIntArray446[local67] = local71 - 1;
				Static22.anIntArrayArray4[local11][local71 - 1] = 1;
				Static228.anIntArrayArray37[local11][local71 - 1] = local196;
				local67 = local67 + 1 & 0xFFF;
			}
			if (local71 < 102 && Static22.anIntArrayArray4[local11][local71 + 1] == 0 && (local76[local11][local71 + 2] & 0x12C0138) == 0 && (local76[local11 + 1][local71 + 2] & 0x12C01E0) == 0) {
				Static86.anIntArray141[local67] = local11;
				Static194.anIntArray446[local67] = local71 + 1;
				local67 = local67 + 1 & 0xFFF;
				Static22.anIntArrayArray4[local11][local71 + 1] = 4;
				Static228.anIntArrayArray37[local11][local71 + 1] = local196;
			}
			if (local11 > 0 && local71 > 0 && Static22.anIntArrayArray4[local11 - 1][local71 - 1] == 0 && (local76[local11 - 1][local71] & 0x12C0138) == 0 && (local76[local11 - 1][local71 - 1] & 0x12C010E) == 0 && (local76[local11][local71 - 1] & 0x12C0183) == 0) {
				Static86.anIntArray141[local67] = local11 - 1;
				Static194.anIntArray446[local67] = local71 - 1;
				Static22.anIntArrayArray4[local11 - 1][local71 - 1] = 3;
				Static228.anIntArrayArray37[local11 - 1][local71 - 1] = local196;
				local67 = local67 + 1 & 0xFFF;
			}
			if (local11 < 102 && local71 > 0 && Static22.anIntArrayArray4[local11 + 1][local71 - 1] == 0 && (local76[local11 + 1][local71 - 1] & 0x12C010E) == 0 && (local76[local11 + 2][local71 - 1] & 0x12C0183) == 0 && (local76[local11 + 2][local71] & 0x12C01E0) == 0) {
				Static86.anIntArray141[local67] = local11 + 1;
				Static194.anIntArray446[local67] = local71 - 1;
				Static22.anIntArrayArray4[local11 + 1][local71 - 1] = 9;
				local67 = local67 + 1 & 0xFFF;
				Static228.anIntArrayArray37[local11 + 1][local71 - 1] = local196;
			}
			if (local11 > 0 && local71 < 102 && Static22.anIntArrayArray4[local11 - 1][local71 + 1] == 0 && (local76[local11 - 1][local71 + 1] & 0x12C010E) == 0 && (local76[local11 - 1][local71 + 2] & 0x12C0138) == 0 && (local76[local11][local71 + 2] & 0x12C01E0) == 0) {
				Static86.anIntArray141[local67] = local11 - 1;
				Static194.anIntArray446[local67] = local71 + 1;
				Static22.anIntArrayArray4[local11 - 1][local71 + 1] = 6;
				local67 = local67 + 1 & 0xFFF;
				Static228.anIntArrayArray37[local11 - 1][local71 + 1] = local196;
			}
			if (local11 < 102 && local71 < 102 && Static22.anIntArrayArray4[local11 + 1][local71 + 1] == 0 && (local76[local11 + 1][local71 + 2] & 0x12C0138) == 0 && (local76[local11 + 2][local71 + 2] & 0x12C01E0) == 0 && (local76[local11 + 2][local71 + 1] & 0x12C0183) == 0) {
				Static86.anIntArray141[local67] = local11 + 1;
				Static194.anIntArray446[local67] = local71 + 1;
				local67 = local67 + 1 & 0xFFF;
				Static22.anIntArrayArray4[local11 + 1][local71 + 1] = 12;
				Static228.anIntArrayArray37[local11 + 1][local71 + 1] = local196;
			}
		}
		Static181.anInt3752 = 0;
		@Pc(861) int local861;
		if (!local64) {
			if (!arg1) {
				return false;
			}
			local196 = 1000;
			local861 = 100;
			for (@Pc(866) int local866 = arg5 - 10; local866 <= arg5 + 10; local866++) {
				for (@Pc(872) int local872 = arg10 - 10; local872 <= arg10 + 10; local872++) {
					if (local866 >= 0 && local872 >= 0 && local866 < 104 && local872 < 104 && Static228.anIntArrayArray37[local866][local872] < 100) {
						@Pc(898) int local898 = 0;
						@Pc(900) int local900 = 0;
						if (arg10 > local872) {
							local898 = arg10 - local872;
						} else if (arg10 + arg9 - 1 < local872) {
							local898 = local872 + 1 - arg10 - arg9;
						}
						if (arg5 > local866) {
							local900 = arg5 - local866;
						} else if (arg5 + arg4 - 1 < local866) {
							local900 = local866 + 1 - arg4 - arg5;
						}
						@Pc(969) int local969 = local898 * local898 + local900 * local900;
						if (local969 < local196 || local196 == local969 && Static228.anIntArrayArray37[local866][local872] < local861) {
							local861 = Static228.anIntArrayArray37[local866][local872];
							local11 = local866;
							local71 = local872;
							local196 = local969;
						}
					}
				}
			}
			if (local196 == 1000) {
				return false;
			}
			if (arg7 == local11 && arg2 == local71) {
				return false;
			}
			Static181.anInt3752 = 1;
		}
		@Pc(1036) byte local1036 = 0;
		Static86.anIntArray141[0] = local11;
		local58 = local1036 + 1;
		Static194.anIntArray446[0] = local71;
		local196 = local861 = Static22.anIntArrayArray4[local11][local71];
		while (arg7 != local11 || local71 != arg2) {
			if (local861 != local196) {
				Static86.anIntArray141[local58] = local11;
				local861 = local196;
				Static194.anIntArray446[local58++] = local71;
			}
			if ((local196 & 0x1) != 0) {
				local71++;
			} else if ((local196 & 0x4) != 0) {
				local71--;
			}
			if ((local196 & 0x2) != 0) {
				local11++;
			} else if ((local196 & 0x8) != 0) {
				local11--;
			}
			local196 = Static22.anIntArrayArray4[local11][local71];
		}
		if (local58 > 0) {
			Static36.method580(local58, arg6);
			return true;
		} else if (arg6 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method3435() {
		Static32.aClass1_Sub17_Sub1_1.method2182(169);
		Static32.aClass1_Sub17_Sub1_1.method2171(0L);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)I")
	public static int method3436(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V")
	public static void method3438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) long local10 = Static14.method199(arg4, arg1, arg3);
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(48) int local48;
		@Pc(63) int local63;
		if (local10 != 0L) {
			local23 = (int) local10 >> 20 & 0x3;
			local30 = (int) local10 >> 14 & 0x1F;
			local32 = arg0;
			local48 = arg1 * 4 + (-(arg3 * 512) + 52736) * 4 + 24624;
			if (local10 > 0L) {
				local32 = arg2;
			}
			local63 = Integer.MAX_VALUE & (int) (local10 >>> 32);
			@Pc(65) int[] local65 = Static29.anIntArray59;
			@Pc(69) Class18 local69 = Static148.method2487(local63);
			if (local69.anInt800 == -1) {
				if (local30 == 0 || local30 == 2) {
					if (local23 == 0) {
						local65[local48] = local32;
						local65[local48 + 512] = local32;
						local65[local48 + 1024] = local32;
						local65[local48 + 1536] = local32;
					} else if (local23 == 1) {
						local65[local48] = local32;
						local65[local48 + 1] = local32;
						local65[local48 + 2] = local32;
						local65[local48 + 3] = local32;
					} else if (local23 == 2) {
						local65[local48 + 3] = local32;
						local65[local48 + 515] = local32;
						local65[local48 + 1024 + 3] = local32;
						local65[local48 + 3 + 1536] = local32;
					} else if (local23 == 3) {
						local65[local48 + 1536] = local32;
						local65[local48 + 1 + 1536] = local32;
						local65[local48 + 1538] = local32;
						local65[local48 + 1536 + 3] = local32;
					}
				}
				if (local30 == 3) {
					if (local23 == 0) {
						local65[local48] = local32;
					} else if (local23 == 1) {
						local65[local48 + 3] = local32;
					} else if (local23 == 2) {
						local65[local48 + 1539] = local32;
					} else if (local23 == 3) {
						local65[local48 + 1536] = local32;
					}
				}
				if (local30 == 2) {
					if (local23 == 3) {
						local65[local48] = local32;
						local65[local48 + 512] = local32;
						local65[local48 + 1024] = local32;
						local65[local48 + 1536] = local32;
					} else if (local23 == 0) {
						local65[local48] = local32;
						local65[local48 + 1] = local32;
						local65[local48 + 2] = local32;
						local65[local48 + 3] = local32;
					} else if (local23 == 1) {
						local65[local48 + 3] = local32;
						local65[local48 + 515] = local32;
						local65[local48 + 1024 + 3] = local32;
						local65[local48 + 1536 + 3] = local32;
					} else if (local23 == 2) {
						local65[local48 + 1536] = local32;
						local65[local48 + 1536 + 1] = local32;
						local65[local48 + 2 + 1536] = local32;
						local65[local48 + 1539] = local32;
					}
				}
			} else {
				@Pc(76) Class78_Sub1 local76 = null;
				if (!local69.aBoolean38) {
					local76 = Static82.aClass78_Sub1Array2[local69.anInt800];
				} else if (local23 == 0) {
					local76 = Static82.aClass78_Sub1Array2[local69.anInt800];
				} else if (local23 == 1) {
					local76 = Static233.aClass78_Sub1Array9[local69.anInt800];
				} else if (local23 == 2) {
					local76 = Static102.aClass78_Sub1Array3[local69.anInt800];
				} else if (local23 == 3) {
					local76 = Static204.aClass78_Sub1Array6[local69.anInt800];
				}
				if (local76 != null) {
					@Pc(135) int local135 = (local69.anInt822 * 4 - local76.anInt3818) / 2;
					@Pc(146) int local146 = (local69.anInt811 * 4 - local76.anInt3817) / 2;
					local76.method3017(local146 + arg1 * 4 + 48, local135 + 48 - -((-local69.anInt822 + 104 - arg3) * 4));
				}
			}
		}
		local10 = Static26.method382(arg4, arg1, arg3);
		if (local10 != 0L) {
			local23 = (int) local10 >> 20 & 0x3;
			local30 = (int) local10 >> 14 & 0x1F;
			local32 = (int) (local10 >>> 32) & Integer.MAX_VALUE;
			@Pc(504) Class18 local504 = Static148.method2487(local32);
			@Pc(569) int local569;
			if (local504.anInt800 != -1) {
				@Pc(511) Class78_Sub1 local511 = null;
				if (!local504.aBoolean38) {
					local511 = Static82.aClass78_Sub1Array2[local504.anInt800];
				} else if (local23 == 0) {
					local511 = Static82.aClass78_Sub1Array2[local504.anInt800];
				} else if (local23 == 1) {
					local511 = Static233.aClass78_Sub1Array9[local504.anInt800];
				} else if (local23 == 2) {
					local511 = Static102.aClass78_Sub1Array3[local504.anInt800];
				} else if (local23 == 3) {
					local511 = Static204.aClass78_Sub1Array6[local504.anInt800];
				}
				if (local511 != null) {
					local569 = (local504.anInt822 * 4 - local511.anInt3818) / 2;
					local63 = (local504.anInt811 * 4 - local511.anInt3817) / 2;
					local511.method3017(local63 + arg1 * 4 + 48, local569 + 48 + (-arg3 + (104 - local504.anInt822)) * 4);
				}
			} else if (local30 == 9) {
				local48 = 15658734;
				local569 = arg1 * 4 + (52736 - arg3 * 512) * 4 + 24624;
				@Pc(627) int[] local627 = Static29.anIntArray59;
				if (local10 > 0L) {
					local48 = 15597568;
				}
				if (local23 == 0 || local23 == 2) {
					local627[local569 + 1536] = local48;
					local627[local569 + 1024 + 1] = local48;
					local627[local569 + 514] = local48;
					local627[local569 + 3] = local48;
				} else {
					local627[local569] = local48;
					local627[local569 + 1 + 512] = local48;
					local627[local569 + 2 + 1024] = local48;
					local627[local569 + 1536 + 3] = local48;
				}
			}
		}
		local10 = Static64.method988(arg4, arg1, arg3);
		if (local10 == 0L) {
			return;
		}
		local30 = Integer.MAX_VALUE & (int) (local10 >>> 32);
		@Pc(721) Class18 local721 = Static148.method2487(local30);
		local23 = (int) local10 >> 20 & 0x3;
		if (local721.anInt800 == -1) {
			return;
		}
		@Pc(735) Class78_Sub1 local735 = null;
		if (!local721.aBoolean38) {
			local735 = Static82.aClass78_Sub1Array2[local721.anInt800];
		} else if (local23 == 0) {
			local735 = Static82.aClass78_Sub1Array2[local721.anInt800];
		} else if (local23 == 1) {
			local735 = Static233.aClass78_Sub1Array9[local721.anInt800];
		} else if (local23 == 2) {
			local735 = Static102.aClass78_Sub1Array3[local721.anInt800];
		} else if (local23 == 3) {
			local735 = Static204.aClass78_Sub1Array6[local721.anInt800];
		}
		if (local735 != null) {
			local48 = (local721.anInt811 * 4 - local735.anInt3817) / 2;
			local63 = (local721.anInt822 * 4 - local735.anInt3818) / 2;
			local735.method3017(local48 + arg1 * 4 + 48, local63 + 48 + (-arg3 + 104 + -local721.anInt822) * 4);
			return;
		}
	}
}
