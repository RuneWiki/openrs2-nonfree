import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
	public static int anInt1463;

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "[[[Lclient!cb;")
	public static Class10[][][] aClass10ArrayArrayArray1 = new Class10[4][104][104];

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!sa;")
	public static Class74 aClass74_6 = new Class74(4096);

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
	public static int anInt1465 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)I")
	public static int method1023(@OriginalArg(1) int arg0) {
		@Pc(3) Class2_Sub2_Sub10 local3 = Static136.method2288(arg0);
		@Pc(6) int local6 = local3.anInt1832;
		@Pc(9) int local9 = local3.anInt1835;
		@Pc(12) int local12 = local3.anInt1837;
		@Pc(28) int local28 = Class2_Sub1_Sub28.anIntArray453[local12 - local9];
		return Static6.anIntArray24[local6] >> local9 & local28;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(BI)V")
	public static void method1024(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static107.anIntArray418[arg0];
		@Pc(17) int local17 = Static131.anIntArray616[arg0];
		@Pc(21) int local21 = Static20.anIntArray86[arg0];
		if (local17 >= 2000) {
			local17 -= 2000;
		}
		@Pc(31) int local31 = Static137.anIntArray496[arg0];
		@Pc(38) Class2_Sub2_Sub1_Sub6_Sub2 local38;
		if (local17 == 7) {
			local38 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local21];
			if (local38 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local38.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local38.anIntArray620[0], 1);
				Static58.anInt1518 = Static156.anInt3884;
				Static2.anInt97 = 2;
				Static94.anInt2407 = 0;
				Static105.anInt2571 = Static38.anInt1113;
				Static124.aClass2_Sub18_Sub1_3.method2398(29);
				Static124.aClass2_Sub18_Sub1_3.method2378(local21);
			}
		}
		if (local17 == 2) {
			Static124.aClass2_Sub18_Sub1_3.method2398(32);
			Static124.aClass2_Sub18_Sub1_3.method2376(Static117.anInt2916);
			Static124.aClass2_Sub18_Sub1_3.method2342(local31);
			Static124.aClass2_Sub18_Sub1_3.method2369(Static6.anInt174);
			Static124.aClass2_Sub18_Sub1_3.method2396(local13);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 11 && Static49.aClass66_6 == null) {
			Static115.method2042(local13, local31);
			Static49.aClass66_6 = Static105.method1835(local31, local13);
			Static57.method2994(Static49.aClass66_6);
		}
		@Pc(155) Class66 local155;
		if (local17 == 1002) {
			local155 = Static55.method1034(local31);
			if (local155 == null || local155.anIntArray474[local13] < 100000) {
				Static124.aClass2_Sub18_Sub1_3.method2398(62);
				Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			} else {
				Static174.method2943(Static41.aClass77_468, Static146.method2168(new Class77[] { Static2.method61(local155.anIntArray474[local13]), Static70.aClass77_754, Static158.method2689(local21).aClass77_717 }), 0);
			}
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 38) {
			local38 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local21];
			if (local38 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local38.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local38.anIntArray620[0], 1);
				Static58.anInt1518 = Static156.anInt3884;
				Static2.anInt97 = 2;
				Static94.anInt2407 = 0;
				Static105.anInt2571 = Static38.anInt1113;
				Static124.aClass2_Sub18_Sub1_3.method2398(176);
				Static124.aClass2_Sub18_Sub1_3.method2378(local21);
			}
		}
		if (local17 == 30) {
			Static124.aClass2_Sub18_Sub1_3.method2398(144);
			Static124.aClass2_Sub18_Sub1_3.method2378(local21);
			Static124.aClass2_Sub18_Sub1_3.method2357(local31);
			Static124.aClass2_Sub18_Sub1_3.method2365(local13);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 26 || local17 == 1004) {
			Static76.method1428(local13, Static136.aClass77Array20[arg0], local31, local21);
		}
		if (local17 == 10 && Static174.method2940(local31, local13, local21)) {
			Static124.aClass2_Sub18_Sub1_3.method2398(142);
			Static124.aClass2_Sub18_Sub1_3.method2369(Static6.anInt174);
			Static124.aClass2_Sub18_Sub1_3.method2376(Static117.anInt2916);
			Static124.aClass2_Sub18_Sub1_3.method2396(local31 + Static168.anInt4143);
			Static124.aClass2_Sub18_Sub1_3.method2365(local21 >> 14 & 0x7FFF);
			Static124.aClass2_Sub18_Sub1_3.method2396(Static157.anInt3889 + local13);
		}
		if (local17 == 33) {
			local38 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local21];
			if (local38 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local38.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local38.anIntArray620[0], 1);
				Static2.anInt97 = 2;
				Static94.anInt2407 = 0;
				Static105.anInt2571 = Static38.anInt1113;
				Static58.anInt1518 = Static156.anInt3884;
				Static124.aClass2_Sub18_Sub1_3.method2398(233);
				Static124.aClass2_Sub18_Sub1_3.method2378(local21);
			}
		}
		if (local17 == 29) {
			Static124.aClass2_Sub18_Sub1_3.method2398(94);
			Static124.aClass2_Sub18_Sub1_3.method2378(local13);
			Static124.aClass2_Sub18_Sub1_3.method2370(local31);
			Static124.aClass2_Sub18_Sub1_3.method2365(local21);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		@Pc(472) Class2_Sub2_Sub1_Sub6_Sub1 local472;
		if (local17 == 20) {
			local472 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local21];
			if (local472 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local472.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local472.anIntArray620[0], 1);
				Static105.anInt2571 = Static38.anInt1113;
				Static2.anInt97 = 2;
				Static58.anInt1518 = Static156.anInt3884;
				Static94.anInt2407 = 0;
				Static124.aClass2_Sub18_Sub1_3.method2398(99);
				Static124.aClass2_Sub18_Sub1_3.method2357(Static117.anInt2916);
				Static124.aClass2_Sub18_Sub1_3.method2369(local21);
				Static124.aClass2_Sub18_Sub1_3.method2378(Static6.anInt174);
			}
		}
		if (local17 == 48) {
			Static124.aClass2_Sub18_Sub1_3.method2398(184);
			Static124.aClass2_Sub18_Sub1_3.method2370(local31);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			Static124.aClass2_Sub18_Sub1_3.method2365(local13);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 12) {
			Static124.aClass2_Sub18_Sub1_3.method2398(234);
			Static124.aClass2_Sub18_Sub1_3.method2342(local31);
			Static124.aClass2_Sub18_Sub1_3.method2365(local13);
			Static124.aClass2_Sub18_Sub1_3.method2365(local21);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		@Pc(615) boolean local615;
		if (local17 == 21) {
			local615 = Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 0, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 0);
			if (!local615) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 1);
			}
			Static58.anInt1518 = Static156.anInt3884;
			Static94.anInt2407 = 0;
			Static2.anInt97 = 2;
			Static105.anInt2571 = Static38.anInt1113;
			Static124.aClass2_Sub18_Sub1_3.method2398(64);
			Static124.aClass2_Sub18_Sub1_3.method2396(Static157.anInt3889 + local13);
			Static124.aClass2_Sub18_Sub1_3.method2378(local21);
			Static124.aClass2_Sub18_Sub1_3.method2378(local31 + Static168.anInt4143);
		}
		if (local17 == 3) {
			local615 = Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 0, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 0);
			if (!local615) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 1);
			}
			Static105.anInt2571 = Static38.anInt1113;
			Static94.anInt2407 = 0;
			Static2.anInt97 = 2;
			Static58.anInt1518 = Static156.anInt3884;
			Static124.aClass2_Sub18_Sub1_3.method2398(127);
			Static124.aClass2_Sub18_Sub1_3.method2365(Static168.anInt4143 + local31);
			Static124.aClass2_Sub18_Sub1_3.method2369(local13 + Static157.anInt3889);
			Static124.aClass2_Sub18_Sub1_3.method2396(local21);
		}
		if (local17 == 41) {
			Static124.aClass2_Sub18_Sub1_3.method2398(60);
			Static124.aClass2_Sub18_Sub1_3.method2378(local21);
			Static124.aClass2_Sub18_Sub1_3.method2376(local31);
			Static124.aClass2_Sub18_Sub1_3.method2365(local13);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 23) {
			Static124.aClass2_Sub18_Sub1_3.method2398(151);
			Static124.aClass2_Sub18_Sub1_3.method2365(local21);
			Static124.aClass2_Sub18_Sub1_3.method2369(local13);
			Static124.aClass2_Sub18_Sub1_3.method2370(local31);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 9) {
			Static124.aClass2_Sub18_Sub1_3.method2398(26);
			Static124.aClass2_Sub18_Sub1_3.method2369(local13);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			Static124.aClass2_Sub18_Sub1_3.method2376(local31);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 50) {
			local38 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local21];
			if (local38 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local38.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local38.anIntArray620[0], 1);
				Static2.anInt97 = 2;
				Static94.anInt2407 = 0;
				Static105.anInt2571 = Static38.anInt1113;
				Static58.anInt1518 = Static156.anInt3884;
				Static124.aClass2_Sub18_Sub1_3.method2398(149);
				Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			}
		}
		if (local17 == 43) {
			Static124.aClass2_Sub18_Sub1_3.method2398(187);
			Static124.aClass2_Sub18_Sub1_3.method2376(local31);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			Static124.aClass2_Sub18_Sub1_3.method2369(local13);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 25) {
			Static174.method2940(local31, local13, local21);
			Static124.aClass2_Sub18_Sub1_3.method2398(50);
			Static124.aClass2_Sub18_Sub1_3.method2365(local21 >> 14 & 0x7FFF);
			Static124.aClass2_Sub18_Sub1_3.method2369(Static157.anInt3889 + local13);
			Static124.aClass2_Sub18_Sub1_3.method2365(local31 + Static168.anInt4143);
		}
		if (local17 == 8) {
			local472 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local21];
			if (local472 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local472.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local472.anIntArray620[0], 1);
				Static58.anInt1518 = Static156.anInt3884;
				Static105.anInt2571 = Static38.anInt1113;
				Static2.anInt97 = 2;
				Static94.anInt2407 = 0;
				Static124.aClass2_Sub18_Sub1_3.method2398(89);
				Static124.aClass2_Sub18_Sub1_3.method2369(Static108.anInt2711);
				Static124.aClass2_Sub18_Sub1_3.method2370(Static154.anInt3837);
				Static124.aClass2_Sub18_Sub1_3.method2369(local21);
				Static124.aClass2_Sub18_Sub1_3.method2365(Static80.anInt2087);
			}
		}
		if (local17 == 36) {
			Static124.aClass2_Sub18_Sub1_3.method2398(221);
			Static124.aClass2_Sub18_Sub1_3.method2365(local13);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			Static124.aClass2_Sub18_Sub1_3.method2376(local31);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 47) {
			local615 = Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 0, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 0);
			if (!local615) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 1);
			}
			Static2.anInt97 = 2;
			Static58.anInt1518 = Static156.anInt3884;
			Static94.anInt2407 = 0;
			Static105.anInt2571 = Static38.anInt1113;
			Static124.aClass2_Sub18_Sub1_3.method2398(83);
			Static124.aClass2_Sub18_Sub1_3.method2369(local31 + Static168.anInt4143);
			Static124.aClass2_Sub18_Sub1_3.method2369(Static157.anInt3889 + local13);
			Static124.aClass2_Sub18_Sub1_3.method2365(local21);
		}
		if (local17 == 42) {
			local472 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local21];
			if (local472 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local472.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local472.anIntArray620[0], 1);
				Static105.anInt2571 = Static38.anInt1113;
				Static94.anInt2407 = 0;
				Static58.anInt1518 = Static156.anInt3884;
				Static2.anInt97 = 2;
				Static124.aClass2_Sub18_Sub1_3.method2398(194);
				Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			}
		}
		@Pc(1249) int local1249;
		if (local17 == 37) {
			Static124.aClass2_Sub18_Sub1_3.method2398(235);
			Static124.aClass2_Sub18_Sub1_3.method2370(local31);
			local155 = Static55.method1034(local31);
			if (local155.anIntArrayArray27 != null && local155.anIntArrayArray27[0][0] == 5) {
				local1249 = local155.anIntArrayArray27[0][1];
				if (Static6.anIntArray24[local1249] != local155.anIntArray467[0]) {
					Static6.anIntArray24[local1249] = local155.anIntArray467[0];
					Static56.method1059(local1249);
				}
			}
		}
		if (local17 == 19) {
			Static165.method2760();
			local155 = Static55.method1034(local31);
			Static124.anInt3041 = 1;
			Static80.anInt2087 = local13;
			Static154.anInt3837 = local31;
			Static108.anInt2711 = local21;
			Static57.method2994(local155);
			Static15.aClass77_233 = Static146.method2168(new Class77[] { Static98.aClass77_960, Static158.method2689(local21).aClass77_717, Static145.aClass77_1255 });
			if (Static15.aClass77_233 == null) {
				Static15.aClass77_233 = Static56.aClass77_601;
			}
			return;
		}
		if (local17 == 17) {
			Static136.method2285();
		}
		if (local17 == 51) {
			local615 = Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 0, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 0);
			if (!local615) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 1);
			}
			Static105.anInt2571 = Static38.anInt1113;
			Static2.anInt97 = 2;
			Static58.anInt1518 = Static156.anInt3884;
			Static94.anInt2407 = 0;
			Static124.aClass2_Sub18_Sub1_3.method2398(104);
			Static124.aClass2_Sub18_Sub1_3.method2370(Static154.anInt3837);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			Static124.aClass2_Sub18_Sub1_3.method2396(Static108.anInt2711);
			Static124.aClass2_Sub18_Sub1_3.method2365(Static80.anInt2087);
			Static124.aClass2_Sub18_Sub1_3.method2378(local31 + Static168.anInt4143);
			Static124.aClass2_Sub18_Sub1_3.method2369(Static157.anInt3889 + local13);
		}
		if (local17 == 15) {
			Static174.method2940(local31, local13, local21);
			Static124.aClass2_Sub18_Sub1_3.method2398(185);
			Static124.aClass2_Sub18_Sub1_3.method2396(local31 + Static168.anInt4143);
			Static124.aClass2_Sub18_Sub1_3.method2378(local21 >> 14 & 0x7FFF);
			Static124.aClass2_Sub18_Sub1_3.method2396(local13 + Static157.anInt3889);
		}
		if (local17 == 24) {
			local38 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local21];
			if (local38 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local38.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local38.anIntArray620[0], 1);
				Static2.anInt97 = 2;
				Static105.anInt2571 = Static38.anInt1113;
				Static58.anInt1518 = Static156.anInt3884;
				Static94.anInt2407 = 0;
				Static124.aClass2_Sub18_Sub1_3.method2398(238);
				Static124.aClass2_Sub18_Sub1_3.method2369(local21);
				Static124.aClass2_Sub18_Sub1_3.method2365(Static80.anInt2087);
				Static124.aClass2_Sub18_Sub1_3.method2378(Static108.anInt2711);
				Static124.aClass2_Sub18_Sub1_3.method2370(Static154.anInt3837);
			}
		}
		if (local17 == 16) {
			local615 = Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 0, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 0);
			if (!local615) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 1);
			}
			Static2.anInt97 = 2;
			Static105.anInt2571 = Static38.anInt1113;
			Static58.anInt1518 = Static156.anInt3884;
			Static94.anInt2407 = 0;
			Static124.aClass2_Sub18_Sub1_3.method2398(59);
			Static124.aClass2_Sub18_Sub1_3.method2365(Static168.anInt4143 + local31);
			Static124.aClass2_Sub18_Sub1_3.method2369(Static157.anInt3889 + local13);
			Static124.aClass2_Sub18_Sub1_3.method2365(local21);
		}
		if (local17 == 5) {
			local38 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local21];
			if (local38 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local38.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local38.anIntArray620[0], 1);
				Static58.anInt1518 = Static156.anInt3884;
				Static2.anInt97 = 2;
				Static105.anInt2571 = Static38.anInt1113;
				Static94.anInt2407 = 0;
				Static124.aClass2_Sub18_Sub1_3.method2398(170);
				Static124.aClass2_Sub18_Sub1_3.method2396(local21);
				Static124.aClass2_Sub18_Sub1_3.method2378(Static6.anInt174);
				Static124.aClass2_Sub18_Sub1_3.method2370(Static117.anInt2916);
			}
		}
		if (local17 == 4) {
			local472 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local21];
			if (local472 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local472.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local472.anIntArray620[0], 1);
				Static105.anInt2571 = Static38.anInt1113;
				Static2.anInt97 = 2;
				Static94.anInt2407 = 0;
				Static58.anInt1518 = Static156.anInt3884;
				Static124.aClass2_Sub18_Sub1_3.method2398(100);
				Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			}
		}
		if (local17 == 49) {
			local472 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local21];
			if (local472 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local472.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local472.anIntArray620[0], 1);
				Static94.anInt2407 = 0;
				Static105.anInt2571 = Static38.anInt1113;
				Static58.anInt1518 = Static156.anInt3884;
				Static2.anInt97 = 2;
				Static124.aClass2_Sub18_Sub1_3.method2398(119);
				Static124.aClass2_Sub18_Sub1_3.method2396(local21);
			}
		}
		if (local17 == 46) {
			local472 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local21];
			if (local472 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local472.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local472.anIntArray620[0], 1);
				Static2.anInt97 = 2;
				Static58.anInt1518 = Static156.anInt3884;
				Static94.anInt2407 = 0;
				Static105.anInt2571 = Static38.anInt1113;
				Static124.aClass2_Sub18_Sub1_3.method2398(246);
				Static124.aClass2_Sub18_Sub1_3.method2365(local21);
			}
		}
		if (local17 == 31) {
			local38 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local21];
			if (local38 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local38.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local38.anIntArray620[0], 1);
				Static58.anInt1518 = Static156.anInt3884;
				Static94.anInt2407 = 0;
				Static105.anInt2571 = Static38.anInt1113;
				Static2.anInt97 = 2;
				Static124.aClass2_Sub18_Sub1_3.method2398(207);
				Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			}
		}
		if (local17 == 14) {
			Static174.method2940(local31, local13, local21);
			Static124.aClass2_Sub18_Sub1_3.method2398(239);
			Static124.aClass2_Sub18_Sub1_3.method2369(local31 + Static168.anInt4143);
			Static124.aClass2_Sub18_Sub1_3.method2378(Static157.anInt3889 + local13);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21 >> 14 & 0x7FFF);
		}
		if (local17 == 39) {
			Static124.aClass2_Sub18_Sub1_3.method2398(88);
			Static124.aClass2_Sub18_Sub1_3.method2370(local31);
			Static124.aClass2_Sub18_Sub1_3.method2365(local13);
			Static124.aClass2_Sub18_Sub1_3.method2396(local21);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 44) {
			local155 = Static55.method1034(local31);
			@Pc(1981) boolean local1981 = true;
			if (local155.anInt3224 > 0) {
				local1981 = Static125.method2165(local155);
			}
			if (local1981) {
				Static124.aClass2_Sub18_Sub1_3.method2398(235);
				Static124.aClass2_Sub18_Sub1_3.method2370(local31);
			}
		}
		if (local17 == 34) {
			local472 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local21];
			if (local472 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local472.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local472.anIntArray620[0], 1);
				Static2.anInt97 = 2;
				Static58.anInt1518 = Static156.anInt3884;
				Static94.anInt2407 = 0;
				Static105.anInt2571 = Static38.anInt1113;
				Static124.aClass2_Sub18_Sub1_3.method2398(6);
				Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			}
		}
		if (local17 == 35 && Static174.method2940(local31, local13, local21)) {
			Static124.aClass2_Sub18_Sub1_3.method2398(85);
			Static124.aClass2_Sub18_Sub1_3.method2365(Static80.anInt2087);
			Static124.aClass2_Sub18_Sub1_3.method2378(Static108.anInt2711);
			Static124.aClass2_Sub18_Sub1_3.method2365(local21 >> 14 & 0x7FFF);
			Static124.aClass2_Sub18_Sub1_3.method2396(local13 + Static157.anInt3889);
			Static124.aClass2_Sub18_Sub1_3.method2378(local31 + Static168.anInt4143);
			Static124.aClass2_Sub18_Sub1_3.method2342(Static154.anInt3837);
		}
		if (local17 == 6) {
			local615 = Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 0, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 0);
			if (!local615) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 1);
			}
			Static94.anInt2407 = 0;
			Static2.anInt97 = 2;
			Static105.anInt2571 = Static38.anInt1113;
			Static58.anInt1518 = Static156.anInt3884;
			Static124.aClass2_Sub18_Sub1_3.method2398(54);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			Static124.aClass2_Sub18_Sub1_3.method2378(Static168.anInt4143 + local31);
			Static124.aClass2_Sub18_Sub1_3.method2369(Static157.anInt3889 + local13);
		}
		if (local17 == 1003) {
			Static174.method2940(local31, local13, local21);
			Static124.aClass2_Sub18_Sub1_3.method2398(134);
			Static124.aClass2_Sub18_Sub1_3.method2369(Static157.anInt3889 + local13);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21 >> 14 & 0x7FFF);
			Static124.aClass2_Sub18_Sub1_3.method2365(local31 + Static168.anInt4143);
		}
		if (local17 == 45) {
			local472 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local21];
			if (local472 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local472.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local472.anIntArray620[0], 1);
				Static105.anInt2571 = Static38.anInt1113;
				Static94.anInt2407 = 0;
				Static2.anInt97 = 2;
				Static58.anInt1518 = Static156.anInt3884;
				Static124.aClass2_Sub18_Sub1_3.method2398(203);
				Static124.aClass2_Sub18_Sub1_3.method2396(local21);
			}
		}
		if (local17 == 22) {
			Static124.aClass2_Sub18_Sub1_3.method2398(235);
			Static124.aClass2_Sub18_Sub1_3.method2370(local31);
			local155 = Static55.method1034(local31);
			if (local155.anIntArrayArray27 != null && local155.anIntArrayArray27[0][0] == 5) {
				local1249 = local155.anIntArrayArray27[0][1];
				Static6.anIntArray24[local1249] = 1 - Static6.anIntArray24[local1249];
				Static56.method1059(local1249);
			}
		}
		if (local17 == 1006) {
			Static2.anInt97 = 2;
			Static105.anInt2571 = Static38.anInt1113;
			Static58.anInt1518 = Static156.anInt3884;
			Static94.anInt2407 = 0;
			local38 = Static48.aClass2_Sub2_Sub1_Sub6_Sub2Array1[local21];
			if (local38 != null) {
				@Pc(2358) Class2_Sub2_Sub16 local2358 = local38.aClass2_Sub2_Sub16_1;
				if (local2358.anIntArray555 != null) {
					local2358 = local2358.method2613();
				}
				if (local2358 != null) {
					Static124.aClass2_Sub18_Sub1_3.method2398(13);
					Static124.aClass2_Sub18_Sub1_3.method2365(local2358.anInt3771);
				}
			}
		}
		if (local17 == 32) {
			Static174.method2940(local31, local13, local21);
			Static124.aClass2_Sub18_Sub1_3.method2398(200);
			Static124.aClass2_Sub18_Sub1_3.method2396(local21 >> 14 & 0x7FFF);
			Static124.aClass2_Sub18_Sub1_3.method2365(Static168.anInt4143 + local31);
			Static124.aClass2_Sub18_Sub1_3.method2396(Static157.anInt3889 + local13);
		}
		if (local17 == 28) {
			local472 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local21];
			if (local472 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local472.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local472.anIntArray620[0], 1);
				Static2.anInt97 = 2;
				Static105.anInt2571 = Static38.anInt1113;
				Static58.anInt1518 = Static156.anInt3884;
				Static94.anInt2407 = 0;
				Static124.aClass2_Sub18_Sub1_3.method2398(181);
				Static124.aClass2_Sub18_Sub1_3.method2396(local21);
			}
		}
		if (local17 == 40) {
			Static172.aClass60_1.method2060(Static54.anInt1472, local13, local31);
		}
		if (local17 == 1) {
			local615 = Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 0, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 0);
			if (!local615) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local13, 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local31, 1);
			}
			Static58.anInt1518 = Static156.anInt3884;
			Static2.anInt97 = 2;
			Static105.anInt2571 = Static38.anInt1113;
			Static94.anInt2407 = 0;
			Static124.aClass2_Sub18_Sub1_3.method2398(145);
			Static124.aClass2_Sub18_Sub1_3.method2396(Static157.anInt3889 + local13);
			Static124.aClass2_Sub18_Sub1_3.method2378(Static6.anInt174);
			Static124.aClass2_Sub18_Sub1_3.method2357(Static117.anInt2916);
			Static124.aClass2_Sub18_Sub1_3.method2378(local31 + Static168.anInt4143);
			Static124.aClass2_Sub18_Sub1_3.method2396(local21);
		}
		if (local17 == 1005) {
			Static2.anInt97 = 2;
			Static94.anInt2407 = 0;
			Static58.anInt1518 = Static156.anInt3884;
			Static105.anInt2571 = Static38.anInt1113;
			Static124.aClass2_Sub18_Sub1_3.method2398(62);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21);
		}
		if (local17 == 57) {
			Static124.aClass2_Sub18_Sub1_3.method2398(167);
			Static124.aClass2_Sub18_Sub1_3.method2396(Static6.anInt174);
			Static124.aClass2_Sub18_Sub1_3.method2378(local13);
			Static124.aClass2_Sub18_Sub1_3.method2376(Static117.anInt2916);
			Static124.aClass2_Sub18_Sub1_3.method2357(local31);
		}
		if (local17 == 13) {
			Static124.aClass2_Sub18_Sub1_3.method2398(213);
			Static124.aClass2_Sub18_Sub1_3.method2370(Static154.anInt3837);
			Static124.aClass2_Sub18_Sub1_3.method2378(Static80.anInt2087);
			Static124.aClass2_Sub18_Sub1_3.method2396(Static108.anInt2711);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21);
			Static124.aClass2_Sub18_Sub1_3.method2369(local13);
			Static124.aClass2_Sub18_Sub1_3.method2370(local31);
			Static84.anInt3147 = 0;
			Static111.aClass66_8 = Static55.method1034(local31);
			Static64.anInt1796 = local13;
		}
		if (local17 == 58) {
			local472 = Static58.aClass2_Sub2_Sub1_Sub6_Sub1Array1[local21];
			if (local472 != null) {
				Static142.method2411(false, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray622[0], local472.anIntArray622[0], 2, 1, Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anIntArray620[0], 0, 0, 0, local472.anIntArray620[0], 1);
				Static58.anInt1518 = Static156.anInt3884;
				Static94.anInt2407 = 0;
				Static2.anInt97 = 2;
				Static105.anInt2571 = Static38.anInt1113;
				Static124.aClass2_Sub18_Sub1_3.method2398(123);
				Static124.aClass2_Sub18_Sub1_3.method2378(local21);
			}
		}
		if (local17 == 18) {
			local155 = Static105.method1835(local31, local13);
			if (local155 != null) {
				Static165.method2760();
				Static82.method1512(local13, local31, Static40.method796(Static63.method1160(local155)));
				Static124.anInt3041 = 0;
				Static120.aClass77_405 = Static130.method2229(local155);
				if (Static120.aClass77_405 == null) {
					Static120.aClass77_405 = Static33.aClass77_388;
				}
				if (local155.aBoolean131) {
					Static19.aClass77_275 = Static146.method2168(new Class77[] { local155.aClass77_1164, Static145.aClass77_1255 });
					return;
				}
				Static19.aClass77_275 = Static146.method2168(new Class77[] { Static100.aClass77_334, local155.aClass77_1158, Static145.aClass77_1255 });
			}
			return;
		}
		if (local17 == 1001) {
			Static94.anInt2407 = 0;
			Static2.anInt97 = 2;
			Static105.anInt2571 = Static38.anInt1113;
			Static58.anInt1518 = Static156.anInt3884;
			Static124.aClass2_Sub18_Sub1_3.method2398(122);
			Static124.aClass2_Sub18_Sub1_3.method2369(local21 >> 14 & 0x7FFF);
		}
		if (Static124.anInt3041 != 0) {
			Static124.anInt3041 = 0;
			Static57.method2994(Static55.method1034(Static154.anInt3837));
		}
		if (Static16.aBoolean25) {
			Static165.method2760();
		}
		if (Static111.aClass66_8 != null && Static84.anInt3147 == 0) {
			Static57.method2994(Static111.aClass66_8);
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public static void method1025() {
		aClass74_6 = null;
		aClass10ArrayArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JZ)V")
	public static void method1026(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static51.anInt1395 >= 100 && Static150.anInt3701 != 1 || Static51.anInt1395 >= 200) {
			Static174.method2943(Static41.aClass77_468, Static75.aClass77_796, 0);
			return;
		}
		@Pc(33) Class77 local33 = Static107.method1884(arg0).method2525();
		for (@Pc(35) int local35 = 0; local35 < Static51.anInt1395; local35++) {
			if (Static125.aLongArray6[local35] == arg0) {
				Static174.method2943(Static41.aClass77_468, Static146.method2168(new Class77[] { local33, Static105.aClass77_993 }), 0);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static181.anInt4605; local66++) {
			if (Static72.aLongArray4[local66] == arg0) {
				Static174.method2943(Static41.aClass77_468, Static146.method2168(new Class77[] { Static99.aClass77_970, local33, Static131.aClass77_1494 }), 0);
				return;
			}
		}
		if (local33.method2519(Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.aClass77_1482)) {
			Static174.method2943(Static41.aClass77_468, Static160.aClass77_1557, 0);
			return;
		}
		Static120.aClass77Array7[Static51.anInt1395] = local33;
		Static125.aLongArray6[Static51.anInt1395] = arg0;
		Static11.anIntArray41[Static51.anInt1395] = 0;
		Static169.anIntArray599[Static51.anInt1395] = 0;
		Static51.anInt1395++;
		Static8.anInt229 = Static52.anInt1417;
		Static124.aClass2_Sub18_Sub1_3.method2398(130);
		Static124.aClass2_Sub18_Sub1_3.method2384(arg0);
	}
}
