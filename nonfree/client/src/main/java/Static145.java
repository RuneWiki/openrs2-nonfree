import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Lclient!pe;")
	public static Class13 aClass13_32;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "I")
	public static int anInt3794;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "I")
	public static int anInt3795;

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "Lclient!fa;")
	public static Class2_Sub1_Sub7_Sub2 aClass2_Sub1_Sub7_Sub2_3;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
	public static int anInt3787 = -1;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!vc;")
	public static final Class89 aClass89_55 = new Class89(64);

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1029 = Static158.method3034("Free world");

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1030 = aClass60_1029;

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "Z")
	public static boolean aBoolean144 = true;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIBZIIIIII)Z")
	public static boolean method2926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(4) int local4;
		for (@Pc(1) int local1 = 0; local1 < 104; local1++) {
			for (local4 = 0; local4 < 104; local4++) {
				Static144.anIntArrayArray24[local1][local4] = 0;
				Static38.anIntArrayArray7[local1][local4] = 99999999;
			}
		}
		Static144.anIntArrayArray24[arg5][arg9] = 99;
		local4 = arg5;
		@Pc(43) int local43 = arg9;
		@Pc(45) byte local45 = 0;
		Static38.anIntArrayArray7[arg5][arg9] = 0;
		Static7.anIntArray506[0] = arg5;
		@Pc(57) boolean local57 = false;
		@Pc(60) int local60 = local45 + 1;
		Static107.anIntArray348[0] = arg9;
		@Pc(64) int local64 = 0;
		@Pc(67) int local67 = Static7.anIntArray506.length;
		@Pc(72) int[][] local72 = Static48.aClass35Array1[Static62.anInt1923].anIntArrayArray14;
		while (local60 != local64) {
			local43 = Static107.anIntArray348[local64];
			local4 = Static7.anIntArray506[local64];
			local64 = (local64 + 1) % local67;
			if (arg2 == local4 && local43 == arg3) {
				local57 = true;
				break;
			}
			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && Static48.aClass35Array1[Static62.anInt1923].method1678(arg2, local43, arg8 - 1, local4, arg7, arg3)) {
					local57 = true;
					break;
				}
				if (arg8 < 10 && Static48.aClass35Array1[Static62.anInt1923].method1669(local4, arg7, local43, arg2, arg8 - 1, arg3)) {
					local57 = true;
					break;
				}
			}
			if (arg10 != 0 && arg1 != 0 && Static48.aClass35Array1[Static62.anInt1923].method1670(arg10, local4, arg2, arg3, local43, arg6, arg1)) {
				local57 = true;
				break;
			}
			@Pc(185) int local185 = Static38.anIntArrayArray7[local4][local43] + 1;
			if (local4 > 0 && Static144.anIntArrayArray24[local4 - 1][local43] == 0 && (local72[local4 - 1][local43] & 0x12C0108) == 0) {
				Static7.anIntArray506[local60] = local4 - 1;
				Static107.anIntArray348[local60] = local43;
				local60 = (local60 + 1) % local67;
				Static144.anIntArrayArray24[local4 - 1][local43] = 2;
				Static38.anIntArrayArray7[local4 - 1][local43] = local185;
			}
			if (local4 < 103 && Static144.anIntArrayArray24[local4 + 1][local43] == 0 && (local72[local4 + 1][local43] & 0x12C0180) == 0) {
				Static7.anIntArray506[local60] = local4 + 1;
				Static107.anIntArray348[local60] = local43;
				local60 = (local60 + 1) % local67;
				Static144.anIntArrayArray24[local4 + 1][local43] = 8;
				Static38.anIntArrayArray7[local4 + 1][local43] = local185;
			}
			if (local43 > 0 && Static144.anIntArrayArray24[local4][local43 - 1] == 0 && (local72[local4][local43 - 1] & 0x12C0102) == 0) {
				Static7.anIntArray506[local60] = local4;
				Static107.anIntArray348[local60] = local43 - 1;
				local60 = (local60 + 1) % local67;
				Static144.anIntArrayArray24[local4][local43 - 1] = 1;
				Static38.anIntArrayArray7[local4][local43 - 1] = local185;
			}
			if (local43 < 103 && Static144.anIntArrayArray24[local4][local43 + 1] == 0 && (local72[local4][local43 + 1] & 0x12C0120) == 0) {
				Static7.anIntArray506[local60] = local4;
				Static107.anIntArray348[local60] = local43 + 1;
				local60 = (local60 + 1) % local67;
				Static144.anIntArrayArray24[local4][local43 + 1] = 4;
				Static38.anIntArrayArray7[local4][local43 + 1] = local185;
			}
			if (local4 > 0 && local43 > 0 && Static144.anIntArrayArray24[local4 - 1][local43 - 1] == 0 && (local72[local4 - 1][local43 - 1] & 0x12C010E) == 0 && (local72[local4 - 1][local43] & 0x12C0108) == 0 && (local72[local4][local43 - 1] & 0x12C0102) == 0) {
				Static7.anIntArray506[local60] = local4 - 1;
				Static107.anIntArray348[local60] = local43 - 1;
				Static144.anIntArrayArray24[local4 - 1][local43 - 1] = 3;
				local60 = (local60 + 1) % local67;
				Static38.anIntArrayArray7[local4 - 1][local43 - 1] = local185;
			}
			if (local4 < 103 && local43 > 0 && Static144.anIntArrayArray24[local4 + 1][local43 - 1] == 0 && (local72[local4 + 1][local43 - 1] & 0x12C0183) == 0 && (local72[local4 + 1][local43] & 0x12C0180) == 0 && (local72[local4][local43 - 1] & 0x12C0102) == 0) {
				Static7.anIntArray506[local60] = local4 + 1;
				Static107.anIntArray348[local60] = local43 - 1;
				Static144.anIntArrayArray24[local4 + 1][local43 - 1] = 9;
				local60 = (local60 + 1) % local67;
				Static38.anIntArrayArray7[local4 + 1][local43 - 1] = local185;
			}
			if (local4 > 0 && local43 < 103 && Static144.anIntArrayArray24[local4 - 1][local43 + 1] == 0 && (local72[local4 - 1][local43 + 1] & 0x12C0138) == 0 && (local72[local4 - 1][local43] & 0x12C0108) == 0 && (local72[local4][local43 + 1] & 0x12C0120) == 0) {
				Static7.anIntArray506[local60] = local4 - 1;
				Static107.anIntArray348[local60] = local43 + 1;
				Static144.anIntArrayArray24[local4 - 1][local43 + 1] = 6;
				local60 = (local60 + 1) % local67;
				Static38.anIntArrayArray7[local4 - 1][local43 + 1] = local185;
			}
			if (local4 < 103 && local43 < 103 && Static144.anIntArrayArray24[local4 + 1][local43 + 1] == 0 && (local72[local4 + 1][local43 + 1] & 0x12C01E0) == 0 && (local72[local4 + 1][local43] & 0x12C0180) == 0 && (local72[local4][local43 + 1] & 0x12C0120) == 0) {
				Static7.anIntArray506[local60] = local4 + 1;
				Static107.anIntArray348[local60] = local43 + 1;
				Static144.anIntArrayArray24[local4 + 1][local43 + 1] = 12;
				Static38.anIntArrayArray7[local4 + 1][local43 + 1] = local185;
				local60 = (local60 + 1) % local67;
			}
		}
		Static15.anInt516 = 0;
		@Pc(821) int local821;
		@Pc(825) int local825;
		@Pc(829) int local829;
		@Pc(835) int local835;
		if (!local57) {
			if (!arg4) {
				return false;
			}
			local821 = 1000;
			local825 = 100;
			for (local829 = arg2 - 10; local829 <= arg2 + 10; local829++) {
				for (local835 = arg3 - 10; local835 <= arg3 + 10; local835++) {
					if (local829 >= 0 && local835 >= 0 && local829 < 104 && local835 < 104 && Static38.anIntArrayArray7[local829][local835] < 100) {
						@Pc(860) int local860 = 0;
						if (local829 < arg2) {
							local860 = arg2 - local829;
						} else if (local829 > arg10 + arg2 - 1) {
							local860 = local829 + 1 - arg10 - arg2;
						}
						@Pc(886) int local886 = 0;
						if (local835 < arg3) {
							local886 = arg3 - local835;
						} else if (local835 > arg3 + arg1 - 1) {
							local886 = local835 + 1 - arg1 - arg3;
						}
						@Pc(928) int local928 = local886 * local886 + local860 * local860;
						if (local928 < local821 || local821 == local928 && Static38.anIntArrayArray7[local829][local835] < local825) {
							local4 = local829;
							local825 = Static38.anIntArrayArray7[local829][local835];
							local821 = local928;
							local43 = local835;
						}
					}
				}
			}
			if (local821 == 1000) {
				return false;
			}
			if (arg5 == local4 && local43 == arg9) {
				return false;
			}
			Static15.anInt516 = 1;
		}
		@Pc(993) byte local993 = 0;
		Static7.anIntArray506[0] = local4;
		local64 = local993 + 1;
		Static107.anIntArray348[0] = local43;
		local821 = local825 = Static144.anIntArrayArray24[local4][local43];
		while (local4 != arg5 || arg9 != local43) {
			if (local821 != local825) {
				Static7.anIntArray506[local64] = local4;
				Static107.anIntArray348[local64++] = local43;
				local825 = local821;
			}
			if ((local821 & 0x2) != 0) {
				local4++;
			} else if ((local821 & 0x8) != 0) {
				local4--;
			}
			if ((local821 & 0x1) != 0) {
				local43++;
			} else if ((local821 & 0x4) != 0) {
				local43--;
			}
			local821 = Static144.anIntArrayArray24[local4][local43];
		}
		if (local64 > 0) {
			local67 = local64--;
			local829 = Static107.anIntArray348[local64];
			if (local67 > 25) {
				local67 = 25;
			}
			@Pc(1093) int local1093 = Static7.anIntArray506[local64];
			if (arg0 == 0) {
				Static7.aClass2_Sub3_Sub1_43.method244(110);
				Static7.aClass2_Sub3_Sub1_43.method224(local67 + local67 + 3);
			}
			if (arg0 == 1) {
				Static7.aClass2_Sub3_Sub1_43.method244(13);
				Static7.aClass2_Sub3_Sub1_43.method224(local67 + local67 + 14 + 3);
			}
			if (arg0 == 2) {
				Static7.aClass2_Sub3_Sub1_43.method244(25);
				Static7.aClass2_Sub3_Sub1_43.method224(local67 + local67 + 3);
			}
			Static197.anInt4656 = Static7.anIntArray506[0];
			Static194.anInt4620 = Static107.anIntArray348[0];
			for (local835 = 1; local835 < local67; local835++) {
				local64--;
				Static7.aClass2_Sub3_Sub1_43.method216(Static7.anIntArray506[local64] - local1093);
				Static7.aClass2_Sub3_Sub1_43.method203(Static107.anIntArray348[local64] - local829);
			}
			Static7.aClass2_Sub3_Sub1_43.method193(Static57.aBooleanArray7[82] ? 1 : 0);
			Static7.aClass2_Sub3_Sub1_43.method199(local829 + Static76.anInt2317);
			Static7.aClass2_Sub3_Sub1_43.method221(local1093 + Static76.anInt2319);
			return true;
		} else if (arg0 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)V")
	public static void method2927(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static21.method473(Static183.aClass60_1260, Static197.aClass60_1329, Static22.aClass60_167);
		} else if (arg0 == -2) {
			Static21.method473(Static183.aClass60_1230, Static183.aClass60_1255, Static83.aClass60_670);
		} else if (arg0 == -1) {
			Static21.method473(Static183.aClass60_1263, Static147.aClass60_1039, Static22.aClass60_164);
		} else if (arg0 == 3) {
			Static21.method473(Static183.aClass60_1231, Static183.aClass60_1267, Static64.aClass60_476);
		} else if (arg0 == 4) {
			Static21.method473(Static183.aClass60_1253, Static60.aClass60_445, Static163.aClass60_1108);
		} else if (arg0 == 5) {
			Static21.method473(Static183.aClass60_1259, Static3.aClass60_26, Static83.aClass60_665);
		} else if (arg0 == 6) {
			Static21.method473(Static183.aClass60_1266, Static146.aClass60_1036, Static113.aClass60_890);
		} else if (arg0 == 7) {
			Static21.method473(Static183.aClass60_1252, Static64.aClass60_478, Static103.aClass60_842);
		} else if (arg0 == 8) {
			Static21.method473(Static183.aClass60_1232, Static76.aClass60_617, Static12.aClass60_104);
		} else if (arg0 == 9) {
			Static21.method473(Static183.aClass60_1234, Static157.aClass60_1080, Static95.aClass60_780);
		} else if (arg0 == 10) {
			Static21.method473(Static183.aClass60_1269, Static76.aClass60_625, Static182.aClass60_1221);
		} else if (arg0 == 11) {
			Static21.method473(Static183.aClass60_1264, Static125.aClass60_952, Static89.aClass60_708);
		} else if (arg0 == 12) {
			Static21.method473(Static183.aClass60_1240, Static96.aClass60_867, Static49.aClass60_357);
		} else if (arg0 == 13) {
			Static21.method473(Static183.aClass60_1265, Static158.aClass60_1087, Static22.aClass60_169);
		} else if (arg0 == 14) {
			Static21.method473(Static183.aClass60_1242, Static130.aClass60_982, Static36.aClass60_250);
		} else if (arg0 == 16) {
			Static21.method473(Static183.aClass60_1262, Static181.aClass60_1214, Static86.aClass60_690);
		} else if (arg0 == 17) {
			Static21.method473(Static183.aClass60_1247, Static67.aClass60_507, Static180.aClass60_917);
		} else if (arg0 == 18) {
			Static21.method473(Static183.aClass60_1239, Static77.aClass60_636, Static190.aClass60_1294);
		} else if (arg0 == 19) {
			Static21.method473(Static103.aClass60_838, Static143.aClass60_1019, Static181.aClass60_1211);
		} else if (arg0 == 20) {
			Static21.method473(Static183.aClass60_1235, Static77.aClass60_634, Static22.aClass60_158);
		} else if (arg0 == 22) {
			Static21.method473(Static183.aClass60_1237, Static123.aClass60_942, Static37.aClass60_258);
		} else if (arg0 == 23) {
			Static21.method473(Static183.aClass60_1244, Static138.aClass60_157, Static36.aClass60_248);
		} else if (arg0 == 24) {
			Static21.method473(Static183.aClass60_1254, Static73.aClass60_542, Static56.aClass60_408);
		} else if (arg0 == 25) {
			Static21.method473(Static183.aClass60_1245, Static90.aClass60_716, Static22.aClass60_161);
		} else if (arg0 == 26) {
			Static21.method473(Static183.aClass60_1236, Static181.aClass60_1217, Static6.aClass60_69);
		} else if (arg0 == 27) {
			Static21.method473(Static183.aClass60_1261, Static183.aClass60_1238, Static128.aClass60_967);
		} else {
			Static21.method473(Static183.aClass60_1241, Static3.aClass60_24, Static22.aClass60_163);
		}
		Static139.method2831(10);
	}
}
