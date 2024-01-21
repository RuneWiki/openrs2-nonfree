import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!nb", name = "U", descriptor = "[Lclient!vd;")
	public static Class5_Sub1_Sub10_Sub3[] aClass5_Sub1_Sub10_Sub3Array7;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "Lclient!vc;")
	private static Class71 aClass71_507 = Static38.method736("No reply from loginserver)3");

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_508 = aClass71_507;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "Lclient!vc;")
	public static Class71 aClass71_509 = Static38.method736("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Lclient!vc;")
	private static Class71 aClass71_512 = Static38.method736("Login server offline)3");

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_510 = aClass71_512;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!vc;")
	public static Class71 aClass71_511 = Static38.method736("backbase1");

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "Lclient!vc;")
	public static Class71 aClass71_513 = Static38.method736("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	public static int anInt907 = 0;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
	public static int anInt913 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIII)V")
	public static void method654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static106.method1689(arg1)) {
			Static119.method1955(0, arg5, Static30.aClass5_Sub1_Sub11ArrayArray1[arg1], 0, arg0, -1, arg4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method655() {
		for (@Pc(11) int local11 = -1; local11 < Static37.anInt594; local11++) {
			@Pc(21) int local21;
			if (local11 == -1) {
				local21 = 2047;
			} else {
				local21 = Static116.anIntArray285[local11];
			}
			@Pc(29) Class5_Sub1_Sub1_Sub3_Sub2 local29 = Static85.aClass5_Sub1_Sub1_Sub3_Sub2Array1[local21];
			if (local29 != null) {
				Static30.method581(1, local29);
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
	public static void method657() {
		aClass71_513 = null;
		aClass5_Sub1_Sub10_Sub3Array7 = null;
		aClass71_507 = null;
		aClass71_508 = null;
		aClass71_510 = null;
		aClass71_512 = null;
		aClass71_511 = null;
		aClass71_509 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BII)I")
	public static int method662(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class5_Sub7 local15 = (Class5_Sub7) Static71.aClass57_10.method1575((long) arg0);
		if (local15 == null) {
			return -1;
		} else if (arg1 >= 0 && local15.anIntArray212.length > arg1) {
			return local15.anIntArray212[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIZIIIIII)Z")
	public static boolean method663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static79.anIntArrayArray24[local7][local11] = 0;
				Static59.anIntArrayArray15[local7][local11] = 99999999;
			}
		}
		Static79.anIntArrayArray24[arg7][arg0] = 99;
		@Pc(45) int local45 = arg0;
		Static59.anIntArrayArray15[arg7][arg0] = 0;
		local11 = arg7;
		@Pc(55) byte local55 = 0;
		@Pc(57) int local57 = 0;
		Static78.anIntArray117[0] = arg7;
		@Pc(64) int local64 = local55 + 1;
		Static103.anIntArray260[0] = arg0;
		@Pc(69) int local69 = Static78.anIntArray117.length;
		@Pc(71) boolean local71 = false;
		@Pc(76) int[][] local76 = Static111.aClass33Array3[Static23.anInt728].anIntArrayArray14;
		@Pc(193) int local193;
		while (local57 != local64) {
			local11 = Static78.anIntArray117[local57];
			local45 = Static103.anIntArray260[local57];
			local57 = (local57 + 1) % local69;
			if (local11 == arg1 && arg8 == local45) {
				local71 = true;
				break;
			}
			if (arg10 != 0) {
				if ((arg10 < 5 || arg10 == 10) && Static111.aClass33Array3[Static23.anInt728].method940(arg1, local45, arg8, arg10 - 1, arg2, local11)) {
					local71 = true;
					break;
				}
				if (arg10 < 10 && Static111.aClass33Array3[Static23.anInt728].method951(arg2, arg1, arg10 - 1, local11, arg8, local45)) {
					local71 = true;
					break;
				}
			}
			if (arg4 != 0 && arg9 != 0 && Static111.aClass33Array3[Static23.anInt728].method953(arg8, arg1, arg6, arg4, local45, local11, arg9)) {
				local71 = true;
				break;
			}
			local193 = Static59.anIntArrayArray15[local11][local45] + 1;
			if (local11 > 0 && Static79.anIntArrayArray24[local11 - 1][local45] == 0 && (local76[local11 - 1][local45] & 0x1280108) == 0) {
				Static78.anIntArray117[local64] = local11 - 1;
				Static103.anIntArray260[local64] = local45;
				Static79.anIntArrayArray24[local11 - 1][local45] = 2;
				local64 = (local64 + 1) % local69;
				Static59.anIntArrayArray15[local11 - 1][local45] = local193;
			}
			if (local11 < 103 && Static79.anIntArrayArray24[local11 + 1][local45] == 0 && (local76[local11 + 1][local45] & 0x1280180) == 0) {
				Static78.anIntArray117[local64] = local11 + 1;
				Static103.anIntArray260[local64] = local45;
				Static79.anIntArrayArray24[local11 + 1][local45] = 8;
				Static59.anIntArrayArray15[local11 + 1][local45] = local193;
				local64 = (local64 + 1) % local69;
			}
			if (local45 > 0 && Static79.anIntArrayArray24[local11][local45 - 1] == 0 && (local76[local11][local45 - 1] & 0x1280102) == 0) {
				Static78.anIntArray117[local64] = local11;
				Static103.anIntArray260[local64] = local45 - 1;
				Static79.anIntArrayArray24[local11][local45 - 1] = 1;
				Static59.anIntArrayArray15[local11][local45 - 1] = local193;
				local64 = (local64 + 1) % local69;
			}
			if (local45 < 103 && Static79.anIntArrayArray24[local11][local45 + 1] == 0 && (local76[local11][local45 + 1] & 0x1280120) == 0) {
				Static78.anIntArray117[local64] = local11;
				Static103.anIntArray260[local64] = local45 + 1;
				Static79.anIntArrayArray24[local11][local45 + 1] = 4;
				Static59.anIntArrayArray15[local11][local45 + 1] = local193;
				local64 = (local64 + 1) % local69;
			}
			if (local11 > 0 && local45 > 0 && Static79.anIntArrayArray24[local11 - 1][local45 - 1] == 0 && (local76[local11 - 1][local45 - 1] & 0x128010E) == 0 && (local76[local11 - 1][local45] & 0x1280108) == 0 && (local76[local11][local45 - 1] & 0x1280102) == 0) {
				Static78.anIntArray117[local64] = local11 - 1;
				Static103.anIntArray260[local64] = local45 - 1;
				local64 = (local64 + 1) % local69;
				Static79.anIntArrayArray24[local11 - 1][local45 - 1] = 3;
				Static59.anIntArrayArray15[local11 - 1][local45 - 1] = local193;
			}
			if (local11 < 103 && local45 > 0 && Static79.anIntArrayArray24[local11 + 1][local45 - 1] == 0 && (local76[local11 + 1][local45 - 1] & 0x1280183) == 0 && (local76[local11 + 1][local45] & 0x1280180) == 0 && (local76[local11][local45 - 1] & 0x1280102) == 0) {
				Static78.anIntArray117[local64] = local11 + 1;
				Static103.anIntArray260[local64] = local45 - 1;
				local64 = (local64 + 1) % local69;
				Static79.anIntArrayArray24[local11 + 1][local45 - 1] = 9;
				Static59.anIntArrayArray15[local11 + 1][local45 - 1] = local193;
			}
			if (local11 > 0 && local45 < 103 && Static79.anIntArrayArray24[local11 - 1][local45 + 1] == 0 && (local76[local11 - 1][local45 + 1] & 0x1280138) == 0 && (local76[local11 - 1][local45] & 0x1280108) == 0 && (local76[local11][local45 + 1] & 0x1280120) == 0) {
				Static78.anIntArray117[local64] = local11 - 1;
				Static103.anIntArray260[local64] = local45 + 1;
				local64 = (local64 + 1) % local69;
				Static79.anIntArrayArray24[local11 - 1][local45 + 1] = 6;
				Static59.anIntArrayArray15[local11 - 1][local45 + 1] = local193;
			}
			if (local11 < 103 && local45 < 103 && Static79.anIntArrayArray24[local11 + 1][local45 + 1] == 0 && (local76[local11 + 1][local45 + 1] & 0x12801E0) == 0 && (local76[local11 + 1][local45] & 0x1280180) == 0 && (local76[local11][local45 + 1] & 0x1280120) == 0) {
				Static78.anIntArray117[local64] = local11 + 1;
				Static103.anIntArray260[local64] = local45 + 1;
				local64 = (local64 + 1) % local69;
				Static79.anIntArrayArray24[local11 + 1][local45 + 1] = 12;
				Static59.anIntArrayArray15[local11 + 1][local45 + 1] = local193;
			}
		}
		Static19.anInt640 = 0;
		@Pc(811) int local811;
		@Pc(818) int local818;
		@Pc(825) int local825;
		if (!local71) {
			if (!arg5) {
				return false;
			}
			local811 = 100;
			local193 = 1000;
			for (local818 = arg1 - 10; local818 <= arg1 + 10; local818++) {
				for (local825 = arg8 - 10; local825 <= arg8 + 10; local825++) {
					if (local818 >= 0 && local825 >= 0 && local818 < 104 && local825 < 104 && Static59.anIntArrayArray15[local818][local825] < 100) {
						@Pc(854) int local854 = 0;
						@Pc(856) int local856 = 0;
						if (arg1 > local818) {
							local856 = arg1 - local818;
						} else if (arg4 + arg1 - 1 < local818) {
							local856 = local818 + 1 - arg4 - arg1;
						}
						if (local825 < arg8) {
							local854 = arg8 - local825;
						} else if (arg9 + arg8 - 1 < local825) {
							local854 = local825 + 1 - arg9 - arg8;
						}
						@Pc(924) int local924 = local854 * local854 + local856 * local856;
						if (local924 < local193 || local193 == local924 && Static59.anIntArrayArray15[local818][local825] < local811) {
							local193 = local924;
							local45 = local825;
							local811 = Static59.anIntArrayArray15[local818][local825];
							local11 = local818;
						}
					}
				}
			}
			if (local193 == 1000) {
				return false;
			}
			if (arg7 == local11 && local45 == arg0) {
				return false;
			}
			Static19.anInt640 = 1;
		}
		@Pc(1004) byte local1004 = 0;
		Static78.anIntArray117[0] = local11;
		local57 = local1004 + 1;
		Static103.anIntArray260[0] = local45;
		local193 = local811 = Static79.anIntArrayArray24[local11][local45];
		while (arg7 != local11 || arg0 != local45) {
			if (local811 != local193) {
				local811 = local193;
				Static78.anIntArray117[local57] = local11;
				Static103.anIntArray260[local57++] = local45;
			}
			if ((local193 & 0x1) != 0) {
				local45++;
			} else if ((local193 & 0x4) != 0) {
				local45--;
			}
			if ((local193 & 0x2) != 0) {
				local11++;
			} else if ((local193 & 0x8) != 0) {
				local11--;
			}
			local193 = Static79.anIntArrayArray24[local11][local45];
		}
		if (local57 > 0) {
			local69 = local57;
			if (local57 > 25) {
				local69 = 25;
			}
			local57--;
			local818 = Static103.anIntArray260[local57];
			@Pc(1099) int local1099 = Static78.anIntArray117[local57];
			if (arg3 == 0) {
				Static61.aClass5_Sub11_Sub1_8.method1553(204);
				Static61.aClass5_Sub11_Sub1_8.method1545(local69 + local69 + 3);
			}
			if (arg3 == 1) {
				Static61.aClass5_Sub11_Sub1_8.method1553(106);
				Static61.aClass5_Sub11_Sub1_8.method1545(local69 + local69 + 3 + 14);
			}
			if (arg3 == 2) {
				Static61.aClass5_Sub11_Sub1_8.method1553(153);
				Static61.aClass5_Sub11_Sub1_8.method1545(local69 + local69 + 3);
			}
			Static61.aClass5_Sub11_Sub1_8.method1501(Static48.anInt1367 + local1099);
			Static61.anInt1564 = Static103.anIntArray260[0];
			Static41.anInt1068 = Static78.anIntArray117[0];
			for (local825 = 1; local825 < local69; local825++) {
				local57--;
				Static61.aClass5_Sub11_Sub1_8.method1545(Static78.anIntArray117[local57] - local1099);
				Static61.aClass5_Sub11_Sub1_8.method1532(Static103.anIntArray260[local57] - local818);
			}
			Static61.aClass5_Sub11_Sub1_8.method1532(Static53.aBooleanArray11[82] ? 1 : 0);
			Static61.aClass5_Sub11_Sub1_8.method1531(local818 + Static76.anInt1884);
			return true;
		} else if (arg3 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!la;)V")
	public static void method665(@OriginalArg(1) Class5_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt2442 == 0) {
			arg0.anInt2441 = 1024;
		}
		@Pc(33) int local33 = arg0.anInt2437 * 128 + arg0.anInt2475 * 64;
		arg0.anInt2454 = 0;
		if (arg0.anInt2442 == 1) {
			arg0.anInt2441 = 1536;
		}
		@Pc(49) int local49 = arg0.anInt2447 - Static95.anInt2285;
		@Pc(59) int local59 = arg0.anInt2472 * 128 + arg0.anInt2475 * 64;
		if (arg0.anInt2442 == 2) {
			arg0.anInt2441 = 0;
		}
		if (arg0.anInt2442 == 3) {
			arg0.anInt2441 = 512;
		}
		arg0.anInt2452 += (local59 - arg0.anInt2452) / local49;
		arg0.anInt2474 += (local33 - arg0.anInt2474) / local49;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method667() {
		if (Static75.anInt1855 != 0 || Static81.aClass5_Sub1_Sub11_4 != null) {
			return;
		}
		@Pc(16) int local16 = Static66.anInt1652;
		if (Static33.aBoolean40 && Static30.anInt800 >= 516 && Static32.anInt847 >= 160 && Static30.anInt800 <= 765 && Static32.anInt847 <= 205) {
			local16 = 0;
		}
		@Pc(50) int local50;
		@Pc(52) int local52;
		@Pc(127) int local127;
		if (!Static65.aBoolean71) {
			if (local16 == 1 && Static49.anInt1394 > 0) {
				local50 = Static66.anIntArray191[Static49.anInt1394 - 1];
				if (local50 == 47 || local50 == 38 || local50 == 32 || local50 == 13 || local50 == 25 || local50 == 14 || local50 == 19 || local50 == 29 || local50 == 7 || local50 == 5 || local50 == 17 || local50 == 1002) {
					local127 = Static49.anIntArray158[Static49.anInt1394 - 1];
					local52 = Static47.anIntArray151[Static49.anInt1394 - 1];
					@Pc(296) Class5_Sub1_Sub11 local296 = Static118.method1937(local127);
					if (Static17.method475(Static23.method545(local296)) || Static50.method958(Static23.method545(local296))) {
						Static20.anInt671 = 0;
						Static111.anInt978 = local127;
						Static34.anInt969 = Static30.anInt800;
						Static58.anInt1516 = Static32.anInt847;
						Static3.aBoolean4 = false;
						Static32.anInt850 = local52;
						Static75.anInt1855 = 2;
						if (local127 >> 16 == Static47.anInt1298) {
							Static75.anInt1855 = 1;
						}
						if (local127 >> 16 == Static62.anInt1577) {
							Static75.anInt1855 = 3;
						}
						return;
					}
				}
			}
			if (local16 == 1 && (Static17.anInt618 == 1 || Static70.method1171(Static49.anInt1394 - 1)) && Static49.anInt1394 > 2) {
				local16 = 2;
			}
			if (local16 == 1 && Static49.anInt1394 > 0) {
				Static19.method492(Static49.anInt1394 - 1);
			}
			if (local16 != 2 || Static49.anInt1394 <= 0) {
				return;
			}
			Static18.method485();
			return;
		}
		if (local16 != 1) {
			local50 = Static107.anInt2563;
			local52 = Static26.anInt1440;
			if (Static90.anInt2998 == 0) {
				local52 -= 4;
				local50 -= 4;
			}
			if (Static90.anInt2998 == 1) {
				local50 -= 553;
				local52 -= 205;
			}
			if (Static90.anInt2998 == 2) {
				local50 -= 17;
				local52 -= 357;
			}
			if (Static114.anInt2680 - 10 > local50 || Static100.anInt2365 + Static114.anInt2680 + 10 < local50 || Static38.anInt1025 - 10 > local52 || Static61.anInt1559 + Static38.anInt1025 + 10 < local52) {
				if (Static90.anInt2998 == 1) {
					Static28.aBoolean33 = true;
				}
				if (Static90.anInt2998 == 2) {
					Static68.aBoolean72 = true;
				}
				Static65.aBoolean71 = false;
			}
		}
		if (local16 != 1) {
			return;
		}
		local50 = Static114.anInt2680;
		local52 = Static38.anInt1025;
		@Pc(125) int local125 = Static30.anInt800;
		local127 = Static100.anInt2365;
		@Pc(129) int local129 = -1;
		@Pc(131) int local131 = Static32.anInt847;
		if (Static90.anInt2998 == 0) {
			local131 -= 4;
			local125 -= 4;
		}
		if (Static90.anInt2998 == 1) {
			local131 -= 205;
			local125 -= 553;
		}
		if (Static90.anInt2998 == 2) {
			local125 -= 17;
			local131 -= 357;
		}
		for (@Pc(151) int local151 = 0; local151 < Static49.anInt1394; local151++) {
			@Pc(166) int local166 = (Static49.anInt1394 - local151 - 1) * 15 + local52 + 31;
			if (local125 > local50 && local125 < local127 + local50 && local166 - 13 < local131 && local166 + 3 > local131) {
				local129 = local151;
			}
		}
		if (local129 != -1) {
			Static19.method492(local129);
		}
		if (Static90.anInt2998 == 1) {
			Static28.aBoolean33 = true;
		}
		Static65.aBoolean71 = false;
		if (Static90.anInt2998 == 2) {
			Static68.aBoolean72 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V")
	public static void method676() {
		Static5.anIntArray8 = null;
		Static66.anIntArray192 = null;
		Static116.aByteArrayArray10 = null;
		Static48.anIntArray157 = null;
		Static40.anIntArray85 = null;
		Static40.anIntArray84 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I[Lclient!vc;)Lclient!vc;")
	public static Class71 method677(@OriginalArg(1) Class71[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static106.method1686(arg0.length, arg0, 0);
	}
}
