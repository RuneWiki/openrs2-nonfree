import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!hl", name = "P", descriptor = "[Lclient!eg;")
	public static Class8_Sub1_Sub7_Sub1[] aClass8_Sub1_Sub7_Sub1Array2;

	@OriginalMember(owner = "client!hl", name = "t", descriptor = "Lclient!ib;")
	public static Class77 aClass77_1 = new Class77();

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = arg4 - arg1;
		@Pc(25) int local25 = arg3 - arg1;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = arg3 * arg3;
		@Pc(37) int local37 = local25 * local25;
		@Pc(41) int local41 = local20 * local20;
		@Pc(45) int local45 = local33 << 1;
		@Pc(49) int local49 = local29 << 1;
		@Pc(53) int local53 = local37 << 1;
		@Pc(57) int local57 = arg3 << 1;
		@Pc(61) int local61 = local41 << 1;
		@Pc(65) int local65 = local25 << 1;
		@Pc(74) int local74 = (1 - local57) * local29 + local45;
		@Pc(83) int local83 = local33 - local49 * (local57 - 1);
		@Pc(92) int local92 = local53 + local41 * (1 - local65);
		@Pc(101) int local101 = local37 - (local65 - 1) * local61;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local33 << 2;
		@Pc(113) int local113 = local41 << 2;
		@Pc(117) int local117 = local37 << 2;
		@Pc(123) int local123 = (local57 - 3) * local49;
		@Pc(127) int local127 = local45 * 3;
		@Pc(131) int local131 = local53 * 3;
		@Pc(133) int local133 = local117;
		@Pc(139) int local139 = (local65 - 3) * local61;
		@Pc(141) int local141 = local109;
		@Pc(168) int local168;
		@Pc(176) int local176;
		@Pc(185) int local185;
		@Pc(193) int local193;
		if (arg2 >= Static228.anInt4643 && arg2 <= Static244.anInt4872) {
			@Pc(159) int[] local159 = Static181.anIntArrayArray19[arg2];
			local168 = Static2.method4(Static52.anInt1146, arg5 - arg4, Static253.anInt4996);
			local176 = Static2.method4(Static52.anInt1146, arg5 + arg4, Static253.anInt4996);
			local185 = Static2.method4(Static52.anInt1146, arg5 - local20, Static253.anInt4996);
			local193 = Static2.method4(Static52.anInt1146, arg5 + local20, Static253.anInt4996);
			Static19.method343(local168, arg0, local159, local185);
			Static19.method343(local185, arg6, local159, local193);
			Static19.method343(local193, arg0, local159, local176);
		}
		@Pc(217) int local217 = (arg3 - 1) * local105;
		@Pc(223) int local223 = local113 * (local25 - 1);
		while (local9 > 0) {
			@Pc(236) boolean local236 = local9 <= local25;
			local9--;
			local168 = arg2 - local9;
			if (local74 < 0) {
				while (local74 < 0) {
					local7++;
					local74 += local127;
					local127 += local109;
					local83 += local141;
					local141 += local109;
				}
			}
			local176 = arg2 + local9;
			if (local83 < 0) {
				local7++;
				local83 += local141;
				local74 += local127;
				local127 += local109;
				local141 += local109;
			}
			if (local236) {
				if (local92 < 0) {
					while (local92 < 0) {
						local92 += local131;
						local101 += local133;
						local133 += local117;
						local131 += local117;
						local15++;
					}
				}
				if (local101 < 0) {
					local15++;
					local92 += local131;
					local131 += local117;
					local101 += local133;
					local133 += local117;
				}
				local92 += -local223;
				local101 += -local139;
				local139 -= local113;
				local223 -= local113;
			}
			if (local176 >= Static228.anInt4643 && Static244.anInt4872 >= local168) {
				local185 = Static2.method4(Static52.anInt1146, local7 + arg5, Static253.anInt4996);
				local193 = Static2.method4(Static52.anInt1146, arg5 - local7, Static253.anInt4996);
				if (local236) {
					@Pc(396) int local396 = Static2.method4(Static52.anInt1146, arg5 + local15, Static253.anInt4996);
					@Pc(405) int local405 = Static2.method4(Static52.anInt1146, arg5 - local15, Static253.anInt4996);
					@Pc(416) int[] local416;
					if (Static228.anInt4643 <= local168) {
						local416 = Static181.anIntArrayArray19[local168];
						Static19.method343(local193, arg0, local416, local405);
						Static19.method343(local405, arg6, local416, local396);
						Static19.method343(local396, arg0, local416, local185);
					}
					if (local176 <= Static244.anInt4872) {
						local416 = Static181.anIntArrayArray19[local176];
						Static19.method343(local193, arg0, local416, local405);
						Static19.method343(local405, arg6, local416, local396);
						Static19.method343(local396, arg0, local416, local185);
					}
				} else {
					if (local168 >= Static228.anInt4643) {
						Static19.method343(local193, arg0, Static181.anIntArrayArray19[local168], local185);
					}
					if (Static244.anInt4872 >= local176) {
						Static19.method343(local193, arg0, Static181.anIntArrayArray19[local176], local185);
					}
				}
			}
			local74 += -local217;
			local217 -= local105;
			local83 += -local123;
			local123 -= local105;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
	public static void method1698() {
		Static59.aClass61_9.method1379();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII)V")
	public static void method1701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(36) String local36 = "::tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local36);
		Static109.method1776(local36);
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V")
	public static void method1702() {
		@Pc(9) int local9 = Static273.anInt5369 * 128 + 64;
		@Pc(15) int local15 = Static231.anInt4685 * 128 + 64;
		@Pc(24) int local24 = Static59.method927(local15, local9, Static34.anInt770) - Static92.anInt1945;
		if (Static293.anInt5688 >= 100) {
			Static185.anInt3689 = Static273.anInt5369 * 128 + 64;
			Static46.anInt1044 = Static231.anInt4685 * 128 + 64;
			Static170.anInt3411 = Static59.method927(Static46.anInt1044, Static185.anInt3689, Static34.anInt770) - Static92.anInt1945;
		} else {
			if (Static170.anInt3411 < local24) {
				Static170.anInt3411 += Static31.anInt738 + Static293.anInt5688 * (local24 - Static170.anInt3411) / 1000;
				if (Static170.anInt3411 > local24) {
					Static170.anInt3411 = local24;
				}
			}
			if (Static46.anInt1044 < local15) {
				Static46.anInt1044 += Static31.anInt738 + Static293.anInt5688 * (local15 - Static46.anInt1044) / 1000;
				if (local15 < Static46.anInt1044) {
					Static46.anInt1044 = local15;
				}
			}
			if (local15 < Static46.anInt1044) {
				Static46.anInt1044 -= (Static46.anInt1044 - local15) * Static293.anInt5688 / 1000 + Static31.anInt738;
				if (Static46.anInt1044 < local15) {
					Static46.anInt1044 = local15;
				}
			}
			if (Static170.anInt3411 > local24) {
				Static170.anInt3411 -= (Static170.anInt3411 - local24) * Static293.anInt5688 / 1000 + Static31.anInt738;
				if (local24 > Static170.anInt3411) {
					Static170.anInt3411 = local24;
				}
			}
			if (Static185.anInt3689 < local9) {
				Static185.anInt3689 += (local9 - Static185.anInt3689) * Static293.anInt5688 / 1000 + Static31.anInt738;
				if (Static185.anInt3689 > local9) {
					Static185.anInt3689 = local9;
				}
			}
			if (Static185.anInt3689 > local9) {
				Static185.anInt3689 -= (Static185.anInt3689 - local9) * Static293.anInt5688 / 1000 + Static31.anInt738;
				if (Static185.anInt3689 < local9) {
					Static185.anInt3689 = local9;
				}
			}
		}
		local15 = Static145.anInt2861 * 128 + 64;
		local9 = Static197.anInt3894 * 128 + 64;
		local24 = Static59.method927(local15, local9, Static34.anInt770) - Static163.anInt4481;
		@Pc(232) int local232 = local24 - Static170.anInt3411;
		@Pc(237) int local237 = local15 - Static46.anInt1044;
		@Pc(241) int local241 = local9 - Static185.anInt3689;
		@Pc(261) int local261 = (int) Math.sqrt((double) (local237 * local237 + local241 * local241));
		@Pc(272) int local272 = (int) (Math.atan2((double) local232, (double) local261) * 325.949D) & 0x7FF;
		@Pc(283) int local283 = (int) (-325.949D * Math.atan2((double) local237, (double) local241)) & 0x7FF;
		if (local272 < 128) {
			local272 = 128;
		}
		if (local272 > 383) {
			local272 = 383;
		}
		if (Static56.anInt1246 < local272) {
			Static56.anInt1246 += Static176.anInt3474 + Static151.anInt4072 * (local272 - Static56.anInt1246) / 1000;
			if (Static56.anInt1246 > local272) {
				Static56.anInt1246 = local272;
			}
		}
		@Pc(328) int local328 = local283 - Static293.anInt5684;
		if (Static56.anInt1246 > local272) {
			Static56.anInt1246 -= (Static56.anInt1246 - local272) * Static151.anInt4072 / 1000 + Static176.anInt3474;
			if (local272 > Static56.anInt1246) {
				Static56.anInt1246 = local272;
			}
		}
		if (local328 > 1024) {
			local328 -= 2048;
		}
		if (local328 < -1024) {
			local328 += 2048;
		}
		if (local328 > 0) {
			Static293.anInt5684 += Static176.anInt3474 + local328 * Static151.anInt4072 / 1000;
			Static293.anInt5684 &= 0x7FF;
		}
		if (local328 < 0) {
			Static293.anInt5684 -= -local328 * Static151.anInt4072 / 1000 + Static176.anInt3474;
			Static293.anInt5684 &= 0x7FF;
		}
		@Pc(406) int local406 = local283 - Static293.anInt5684;
		if (local406 > 1024) {
			local406 -= 2048;
		}
		if (local406 < -1024) {
			local406 += 2048;
		}
		if (local406 < 0 && local328 > 0 || local406 > 0 && local328 < 0) {
			Static293.anInt5684 = local283;
		}
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)I")
	public static int method1703() {
		return 6;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1704(@OriginalArg(1) int arg0) {
		return Static161.aStringArray47[arg0].length() > 0 ? Static57.aStringArray19[arg0] + Static75.aString63 + Static161.aStringArray47[arg0] : Static57.aStringArray19[arg0];
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!pk;ILclient!pk;)V")
	public static void method1705(@OriginalArg(0) Class132 arg0, @OriginalArg(2) Class132 arg1) {
		Static276.aClass8_Sub1_Sub5_4 = Static114.method1849(arg1, arg0, Static28.anInt694);
		if (Static116.aBoolean188) {
			Static210.aClass8_Sub1_Sub5_Sub2_7 = Static120.method1936(arg1, arg0, Static28.anInt694);
		} else {
			Static210.aClass8_Sub1_Sub5_Sub2_7 = (Class8_Sub1_Sub5_Sub2) Static276.aClass8_Sub1_Sub5_4;
		}
		Static247.aClass8_Sub1_Sub5_5 = Static114.method1849(arg1, arg0, Static230.anInt4669);
		Static229.aClass8_Sub1_Sub5_3 = Static114.method1849(arg1, arg0, Static74.anInt1608);
	}
}
