import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!ai;")
	private static Class6 aClass6_454 = Static38.method685("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "Lclient!ai;")
	public static Class6 aClass6_455 = Static38.method685("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "Lclient!ai;")
	public static Class6 aClass6_456 = Static38.method685("l");

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
	public static int anInt1567 = 0;

	@OriginalMember(owner = "client!hh", name = "E", descriptor = "Lclient!ai;")
	public static Class6 aClass6_457 = aClass6_454;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)[Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3[] method1009() {
		@Pc(8) Class2_Sub3_Sub2_Sub3[] local8 = new Class2_Sub3_Sub2_Sub3[Static31.anInt774];
		for (@Pc(10) int local10 = 0; local10 < Static31.anInt774; local10++) {
			@Pc(16) Class2_Sub3_Sub2_Sub3 local16 = new Class2_Sub3_Sub2_Sub3();
			local16.anInt3618 = Static163.anInt3833;
			local16.anInt3617 = Static130.anInt3018;
			local16.anInt3619 = Static76.anIntArray121[local10];
			local16.anInt3622 = Static14.anIntArray16[local10];
			local16.anInt3620 = Static88.anIntArray153[local10];
			local16.anInt3621 = Static131.anIntArray278[local10];
			local16.anIntArray357 = Static127.anIntArray258;
			local16.aByteArray46 = Static167.aByteArrayArray10[local10];
			local8[local10] = local16;
		}
		Static49.method886();
		return local8;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
	public static void method1010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static58.method957();
		Static53.method2493(arg2, arg0, arg2 + Static89.aClass2_Sub3_Sub2_Sub3_2.anInt3620, Static89.aClass2_Sub3_Sub2_Sub3_2.anInt3621 + arg0);
		if (Static113.anInt2752 == 2 || Static113.anInt2752 == 5) {
			Static53.method2486(arg2 + 25, arg0 - -5, Static151.anIntArray347, Static61.anIntArray99);
		} else {
			@Pc(53) int local53 = Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 / 32 + 48;
			@Pc(60) int local60 = Static154.anInt3559 + Static46.anInt1324 & 0x7FF;
			@Pc(68) int local68 = 464 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 / 32;
			Static58.aClass2_Sub3_Sub2_Sub1_2.method296(arg2 + 25, arg0 + 5, 146, 151, local53, local68, local60, Static36.anInt1028 + 256, Static151.anIntArray347, Static61.anIntArray99);
			@Pc(104) int local104;
			@Pc(118) int local118;
			for (@Pc(88) int local88 = 0; local88 < Static74.anInt1802; local88++) {
				local104 = Static38.anIntArray58[local88] * 4 + 2 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 / 32;
				local118 = Static56.anIntArray222[local88] * 4 + 2 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 / 32;
				Static160.method426(Static152.aClass2_Sub3_Sub2_Sub1Array7[local88], arg2, local104, local118, arg0);
			}
			@Pc(160) int local160;
			@Pc(171) int local171;
			for (local104 = 0; local104 < 104; local104++) {
				for (local118 = 0; local118 < 104; local118++) {
					@Pc(147) Class84 local147 = Static27.aClass84ArrayArrayArray1[Static36.anInt1020][local104][local118];
					if (local147 != null) {
						local160 = local104 * 4 + 2 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 / 32;
						local171 = local118 * 4 + 2 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 / 32;
						Static160.method426(Static169.aClass2_Sub3_Sub2_Sub1Array9[0], arg2, local160, local171, arg0);
					}
				}
			}
			@Pc(248) int local248;
			for (local118 = 0; local118 < Static81.anInt1985; local118++) {
				@Pc(200) Class2_Sub3_Sub5_Sub1_Sub2 local200 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[Static149.anIntArray312[local118]];
				if (local200 != null && local200.method1806()) {
					@Pc(209) Class2_Sub3_Sub17 local209 = local200.aClass2_Sub3_Sub17_1;
					if (local209 != null && local209.anIntArray382 != null) {
						local209 = local209.method2651();
					}
					if (local209 != null && local209.aBoolean154 && local209.aBoolean157) {
						local171 = local200.anInt2674 / 32 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 / 32;
						local248 = local200.anInt2672 / 32 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 / 32;
						Static160.method426(Static169.aClass2_Sub3_Sub2_Sub1Array9[1], arg2, local171, local248, arg0);
					}
				}
			}
			@Pc(275) Class2_Sub3_Sub5_Sub1_Sub1 local275;
			for (@Pc(267) int local267 = 0; local267 < Static167.anInt3925; local267++) {
				local275 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[Static156.anIntArray358[local267]];
				if (local275 != null && local275.method1806()) {
					local171 = local275.anInt2674 / 32 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 / 32;
					@Pc(294) boolean local294 = false;
					local248 = local275.anInt2672 / 32 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 / 32;
					@Pc(310) long local310 = local275.aClass6_244.method129();
					for (@Pc(312) int local312 = 0; local312 < Static111.anInt2637; local312++) {
						if (Static102.aLongArray3[local312] == local310 && Static41.anIntArray62[local312] != 0) {
							local294 = true;
							break;
						}
					}
					@Pc(345) boolean local345 = false;
					if (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt946 != 0 && local275.anInt946 != 0 && Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt946 == local275.anInt946) {
						local345 = true;
					}
					if (local294) {
						Static160.method426(Static169.aClass2_Sub3_Sub2_Sub1Array9[3], arg2, local171, local248, arg0);
					} else if (local345) {
						Static160.method426(Static169.aClass2_Sub3_Sub2_Sub1Array9[4], arg2, local171, local248, arg0);
					} else {
						Static160.method426(Static169.aClass2_Sub3_Sub2_Sub1Array9[2], arg2, local171, local248, arg0);
					}
				}
			}
			if (Static64.anInt1578 != 0 && Static107.anInt2559 % 20 < 10) {
				if (Static64.anInt1578 == 1 && Static157.anInt3643 >= 0 && Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1.length > Static157.anInt3643) {
					@Pc(434) Class2_Sub3_Sub5_Sub1_Sub2 local434 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[Static157.anInt3643];
					if (local434 != null) {
						local171 = local434.anInt2674 / 32 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 / 32;
						local248 = local434.anInt2672 / 32 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 / 32;
						Static170.method2700(Static176.aClass2_Sub3_Sub2_Sub1Array11[1], arg0, local171, arg2, local248);
					}
				}
				if (Static64.anInt1578 == 2) {
					local160 = (Static61.anInt1526 - Static2.anInt66) * 4 + 2 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 / 32;
					local171 = (Static179.anInt4170 - Static176.anInt4061) * 4 + 2 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 / 32;
					Static170.method2700(Static176.aClass2_Sub3_Sub2_Sub1Array11[1], arg0, local160, arg2, local171);
				}
				if (Static64.anInt1578 == 10 && Static5.anInt90 >= 0 && Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1.length > Static5.anInt90) {
					local275 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[Static5.anInt90];
					if (local275 != null) {
						local171 = local275.anInt2674 / 32 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 / 32;
						local248 = local275.anInt2672 / 32 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 / 32;
						Static170.method2700(Static176.aClass2_Sub3_Sub2_Sub1Array11[1], arg0, local171, arg2, local248);
					}
				}
			}
			if (Static152.anInt3513 != 0) {
				local160 = Static152.anInt3513 * 4 + 2 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 / 32;
				local171 = Static107.anInt2564 * 4 + 2 - Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 / 32;
				Static160.method426(Static176.aClass2_Sub3_Sub2_Sub1Array11[0], arg2, local160, local171, arg0);
			}
			Static53.method2496(arg2 + 4 + 93, -4 + 82 + arg0, 3, 3, 16777215);
		}
		if (Static113.anInt2752 >= 3) {
			Static53.method2486(arg2, arg0, Static83.anIntArray149, Static122.anIntArray244);
		} else {
			Static97.aClass2_Sub3_Sub2_Sub1_3.method296(arg2, arg0, 33, 33, 25, 25, Static154.anInt3559, 256, Static83.anIntArray149, Static122.anIntArray244);
		}
		if (Static36.aBooleanArray3[arg1]) {
			Static89.aClass2_Sub3_Sub2_Sub3_2.method2398(arg2, arg0);
		}
		Static137.aBooleanArray14[arg1] = true;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public static void method1011() {
		aClass6_455 = null;
		aClass6_456 = null;
		aClass6_454 = null;
		aClass6_457 = null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public static void method1012() {
		@Pc(18) int local18;
		if (Static92.anInt2289 > 0) {
			for (local18 = 0; local18 < 256; local18++) {
				if (Static92.anInt2289 > 768) {
					Static67.anIntArray114[local18] = Static36.method639(Static43.anIntArray68[local18], 1024 - Static92.anInt2289, Static14.anIntArray15[local18]);
				} else if (Static92.anInt2289 > 256) {
					Static67.anIntArray114[local18] = Static14.anIntArray15[local18];
				} else {
					Static67.anIntArray114[local18] = Static36.method639(Static14.anIntArray15[local18], 256 - Static92.anInt2289, Static43.anIntArray68[local18]);
				}
			}
		} else if (Static83.anInt2044 <= 0) {
			for (local18 = 0; local18 < 256; local18++) {
				Static67.anIntArray114[local18] = Static43.anIntArray68[local18];
			}
		} else {
			for (local18 = 0; local18 < 256; local18++) {
				if (Static83.anInt2044 > 768) {
					Static67.anIntArray114[local18] = Static36.method639(Static43.anIntArray68[local18], 1024 - Static83.anInt2044, Static14.anIntArray17[local18]);
				} else if (Static83.anInt2044 > 256) {
					Static67.anIntArray114[local18] = Static14.anIntArray17[local18];
				} else {
					Static67.anIntArray114[local18] = Static36.method639(Static14.anIntArray17[local18], 256 - Static83.anInt2044, Static43.anIntArray68[local18]);
				}
			}
		}
		local18 = 0;
		@Pc(161) int local161 = Static132.aClass2_Sub3_Sub2_Sub1_6.anInt384 * 9;
		@Pc(167) int local167 = 0;
		@Pc(184) int local184;
		@Pc(197) int local197;
		@Pc(204) int local204;
		@Pc(210) int local210;
		@Pc(225) int local225;
		@Pc(229) int local229;
		for (@Pc(169) int local169 = 1; local169 < 255; local169++) {
			local184 = Static124.anIntArray251[local169] * (256 - local169) / 256 + 22;
			if (local184 < 0) {
				local184 = 0;
			}
			local18 += local184;
			for (local197 = local184; local197 < 128; local197++) {
				local204 = Static40.anIntArray59[local18++];
				local210 = Static132.aClass2_Sub3_Sub2_Sub1_6.anIntArray14[local161++];
				if (local204 == 0) {
					Static120.aClass2_Sub3_Sub2_Sub1_4.anIntArray14[local167++] = local210;
				} else {
					local225 = local204;
					local229 = 256 - local204;
					local204 = Static67.anIntArray114[local204];
					Static120.aClass2_Sub3_Sub2_Sub1_4.anIntArray14[local167++] = (local225 * (local204 & 0xFF00FF) + (local210 & 0xFF00FF) * local229 & 0xFF00FF00) + ((local210 & 0xFF00) * local229 + local225 * (local204 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			for (local204 = 0; local204 < local184; local204++) {
				Static120.aClass2_Sub3_Sub2_Sub1_4.anIntArray14[local167++] = Static132.aClass2_Sub3_Sub2_Sub1_6.anIntArray14[local161++];
			}
			local161 += Static132.aClass2_Sub3_Sub2_Sub1_6.anInt384 - 128;
		}
		local18 = 0;
		local167 = 0;
		Static120.aClass2_Sub3_Sub2_Sub1_4.method272(0, 9);
		local161 = Static132.aClass2_Sub3_Sub2_Sub1_6.anInt384 * 9 + 128;
		for (local184 = 1; local184 < 255; local184++) {
			local197 = (256 - local184) * Static124.anIntArray251[local184] / 256 + 22;
			if (local197 < 0) {
				local197 = 0;
			}
			for (local204 = 0; local204 < local197; local204++) {
				@Pc(347) int local347 = local167++;
				local161--;
				Static31.aClass2_Sub3_Sub2_Sub1_1.anIntArray14[local347] = Static132.aClass2_Sub3_Sub2_Sub1_6.anIntArray14[local161];
			}
			for (local210 = local197; local210 < 128; local210++) {
				local161--;
				local229 = Static132.aClass2_Sub3_Sub2_Sub1_6.anIntArray14[local161];
				local225 = Static40.anIntArray59[local18++];
				if (local225 == 0) {
					Static31.aClass2_Sub3_Sub2_Sub1_1.anIntArray14[local167++] = local229;
				} else {
					@Pc(387) int local387 = 256 - local225;
					@Pc(389) int local389 = local225;
					local225 = Static67.anIntArray114[local225];
					Static31.aClass2_Sub3_Sub2_Sub1_1.anIntArray14[local167++] = (local389 * (local225 & 0xFF00) + local387 * (local229 & 0xFF00) & 0xFF0000) + ((local225 & 0xFF00FF) * local389 + (local229 & 0xFF00FF) * local387 & 0xFF00FF00) >> 8;
				}
			}
			local161 += Static132.aClass2_Sub3_Sub2_Sub1_6.anInt384 + 128;
			local18 += local197;
		}
		Static31.aClass2_Sub3_Sub2_Sub1_1.method272(637, 9);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIB)V")
	public static void method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static36.method641(arg1)) {
			Static111.method1785(Static180.aClass87ArrayArray1[arg1], arg0);
		}
	}
}
