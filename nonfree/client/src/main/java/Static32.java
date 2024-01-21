import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!de", name = "qb", descriptor = "Lclient!tg;")
	public static Class1_Sub1_Sub12_Sub4 aClass1_Sub1_Sub12_Sub4_3;

	@OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
	public static int anInt934 = 0;

	@OriginalMember(owner = "client!de", name = "fb", descriptor = "[I")
	public static int[] anIntArray120 = new int[2000];

	@OriginalMember(owner = "client!de", name = "jb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_328 = Static169.method2903("Abbrechen");

	@OriginalMember(owner = "client!de", name = "ob", descriptor = "I")
	public static int anInt944 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V")
	public static void method567(@OriginalArg(1) int arg0) {
		if (arg0 == Static156.anInt3821) {
			return;
		}
		if (Static156.anInt3821 == 0) {
			Static94.method1628();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static9.anInt378 = 0;
			Static15.anInt477 = 0;
			Static68.anInt1788 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static106.aClass44_6 != null) {
			Static106.aClass44_6.method1417();
			Static106.aClass44_6 = null;
		}
		if (Static156.anInt3821 == 25) {
			Static142.anInt3609 = 1;
			Static180.anInt4298 = 0;
			Static118.anInt3062 = 0;
			Static109.anInt2813 = 0;
			Static97.anInt2496 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static155.method2632(Static52.aClass30_Sub1_6, Static91.aCanvas1, Static140.aClass30_Sub1_14);
		} else {
			Static79.method1416();
		}
		Static156.anInt3821 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V")
	public static void method568() {
		aClass1_Sub1_Sub12_Sub4_3 = null;
		aClass23_328 = null;
		anIntArray120 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ[BI)Z")
	public static boolean method569(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class1_Sub8 local6 = new Class1_Sub8(arg1);
		@Pc(12) boolean local12 = true;
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local6.method856();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local6.method856();
					if (local42 == 0) {
						continue label54;
					}
					local34 += local42 - 1;
					@Pc(71) int local71 = local34 >> 6 & 0x3F;
					@Pc(75) int local75 = local34 & 0x3F;
					@Pc(81) int local81 = local6.method861() >> 2;
					@Pc(85) int local85 = arg0 + local71;
					@Pc(89) int local89 = local75 + arg2;
					if (local85 > 0 && local89 > 0 && local85 < 103 && local89 < 103) {
						@Pc(105) Class1_Sub1_Sub3 local105 = Static84.method3155(local19);
						if (local81 != 22 || !Static8.aBoolean17 || local105.anInt655 != 0 || local105.anInt644 == 1 || local105.aBoolean31) {
							local36 = true;
							if (!local105.method374()) {
								Static109.anInt2813++;
								local12 = false;
							}
						}
					}
				}
				local42 = local6.method856();
				if (local42 == 0) {
					break;
				}
				local6.method861();
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIII)V")
	public static void method570(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static133.anInt3411 == 1) {
			Static4.aClass1_Sub1_Sub12_Sub1Array1[Static10.anInt388 / 100].method1944(Static47.anInt1255 - 8, Static90.anInt2404 + -8);
		}
		if (Static133.anInt3411 == 2) {
			Static4.aClass1_Sub1_Sub12_Sub1Array1[Static10.anInt388 / 100 + 4].method1944(Static47.anInt1255 - 8, Static90.anInt2404 + -8);
		}
		Static130.method2308();
		if (!Static31.aBoolean45) {
			return;
		}
		@Pc(50) int local50 = arg1 + 512 - 5;
		@Pc(52) int local52 = 16776960;
		@Pc(56) int local56 = arg3 + 20;
		Static20.aClass1_Sub1_Sub12_Sub3_Sub1_1.method3053(Static149.method2571(new Class23[] { Static14.aClass23_177, Static27.method498(Static16.anInt498) }), local50, local56, 16776960, -1);
		@Pc(77) int local77 = local56 + 15;
		@Pc(79) Runtime local79 = Runtime.getRuntime();
		@Pc(88) int local88 = (int) ((local79.totalMemory() - local79.freeMemory()) / 1024L);
		if (local88 > 32768 && Static8.aBoolean17) {
			local52 = 16711680;
		}
		if (local88 > 65536 && !Static8.aBoolean17) {
			local52 = 16711680;
		}
		Static20.aClass1_Sub1_Sub12_Sub3_Sub1_1.method3053(Static149.method2571(new Class23[] { Static42.aClass23_436, Static27.method498(local88), Static35.aClass23_378 }), local50, local77, local52, -1);
		local56 = local77 + 15;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ed;I)Z")
	public static boolean method571(@OriginalArg(0) Class23 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static65.anInt3673; local11++) {
			if (arg0.method644(Static163.aClass23Array22[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V")
	public static void method572() {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (Static15.anInt475 == 49) {
			local14 = Static35.aClass1_Sub8_Sub1_2.method861();
			local22 = (local14 >> 4 & 0x7) + Static85.anInt2264;
			local28 = (local14 & 0x7) + Static35.anInt973;
			local32 = Static35.aClass1_Sub8_Sub1_2.method878();
			local38 = Static35.aClass1_Sub8_Sub1_2.method878();
			local42 = Static35.aClass1_Sub8_Sub1_2.method878();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				@Pc(68) Class56 local68 = Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local22][local28];
				if (local68 != null) {
					for (@Pc(77) Class1_Sub1_Sub1_Sub7 local77 = (Class1_Sub1_Sub1_Sub7) local68.method1853(); local77 != null; local77 = (Class1_Sub1_Sub1_Sub7) local68.method1855()) {
						if ((local32 & 0x7FFF) == local77.anInt4373 && local38 == local77.anInt4377) {
							local77.anInt4377 = local42;
							break;
						}
					}
					Static110.method1954(local28, local22);
				}
			}
			return;
		}
		@Pc(168) Class1_Sub1_Sub1_Sub7 local168;
		if (Static15.anInt475 == 235) {
			local14 = Static35.aClass1_Sub8_Sub1_2.method867();
			local22 = Static35.aClass1_Sub8_Sub1_2.method861();
			local28 = (local22 >> 4 & 0x7) + Static85.anInt2264;
			local32 = Static35.anInt973 + (local22 & 0x7);
			if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
				@Pc(161) Class56 local161 = Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local28][local32];
				if (local161 != null) {
					for (local168 = (Class1_Sub1_Sub1_Sub7) local161.method1853(); local168 != null; local168 = (Class1_Sub1_Sub1_Sub7) local161.method1855()) {
						if (local168.anInt4373 == (local14 & 0x7FFF)) {
							local168.method3141();
							break;
						}
					}
					if (local161.method1853() == null) {
						Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local28][local32] = null;
					}
					Static110.method1954(local32, local28);
				}
			}
			return;
		}
		@Pc(248) int local248;
		if (Static15.anInt475 == 64) {
			local14 = Static35.aClass1_Sub8_Sub1_2.method866();
			local22 = local14 >> 2;
			local28 = local14 & 0x3;
			local32 = Static45.anIntArray151[local22];
			local38 = Static35.aClass1_Sub8_Sub1_2.method901();
			local42 = (local38 >> 4 & 0x7) + Static85.anInt2264;
			local248 = (local38 & 0x7) + Static35.anInt973;
			if (local42 >= 0 && local248 >= 0 && local42 < 104 && local248 < 104) {
				Static67.method1180(local28, Static85.anInt2267, -1, 0, local248, local42, local22, -1, local32);
			}
			return;
		}
		@Pc(316) int local316;
		@Pc(338) int local338;
		if (Static15.anInt475 == 189) {
			local14 = Static35.aClass1_Sub8_Sub1_2.method861();
			local28 = Static35.anInt973 + (local14 & 0x7);
			local22 = Static85.anInt2264 + (local14 >> 4 & 0x7);
			local32 = Static35.aClass1_Sub8_Sub1_2.method878();
			local38 = Static35.aClass1_Sub8_Sub1_2.method861();
			local248 = local38 & 0x7;
			local42 = local38 >> 4 & 0xF;
			local316 = Static35.aClass1_Sub8_Sub1_2.method861();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local338 = local42 + 1;
				if (Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0] >= local22 - local338 && Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0] <= local22 + local338 && local28 - local338 <= Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0] && local338 + local28 >= Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0] && Static105.anInt2708 != 0 && local248 > 0 && Static33.anInt948 < 50) {
					Static17.anIntArray74[Static33.anInt948] = local32;
					Static139.anIntArray473[Static33.anInt948] = local248;
					Static68.anIntArray241[Static33.anInt948] = local316;
					Static44.aClass6Array1[Static33.anInt948] = null;
					Static8.anIntArray48[Static33.anInt948] = local42 + (local22 << 16) + (local28 << 8);
					Static33.anInt948++;
				}
			}
		}
		@Pc(501) int local501;
		if (Static15.anInt475 == 188) {
			local14 = Static35.aClass1_Sub8_Sub1_2.method861();
			local22 = local14 >> 2;
			local28 = local14 & 0x3;
			local32 = Static45.anIntArray151[local22];
			local38 = Static35.aClass1_Sub8_Sub1_2.method866();
			local42 = Static85.anInt2264 + (local38 >> 4 & 0x7);
			local248 = (local38 & 0x7) + Static35.anInt973;
			local316 = Static35.aClass1_Sub8_Sub1_2.method886();
			if (local42 >= 0 && local248 >= 0 && local42 < 103 && local248 < 103) {
				if (local32 == 0) {
					@Pc(492) Class43 local492 = Static123.aClass80_1.method2693(Static85.anInt2267, local42, local248);
					if (local492 != null) {
						local501 = local492.anInt2034 >> 14 & 0x7FFF;
						if (local22 == 2) {
							local492.aClass1_Sub1_Sub1_5 = new Class1_Sub1_Sub1_Sub5(local501, 2, local28 + 4, Static85.anInt2267, local42, local248, local316, false, local492.aClass1_Sub1_Sub1_5);
							local492.aClass1_Sub1_Sub1_6 = new Class1_Sub1_Sub1_Sub5(local501, 2, local28 + 1 & 0x3, Static85.anInt2267, local42, local248, local316, false, local492.aClass1_Sub1_Sub1_6);
						} else {
							local492.aClass1_Sub1_Sub1_5 = new Class1_Sub1_Sub1_Sub5(local501, local22, local28, Static85.anInt2267, local42, local248, local316, false, local492.aClass1_Sub1_Sub1_5);
						}
					}
				}
				if (local32 == 1) {
					@Pc(566) Class72 local566 = Static123.aClass80_1.method2698(Static85.anInt2267, local42, local248);
					if (local566 != null) {
						local501 = local566.anInt3594 >> 14 & 0x7FFF;
						if (local22 == 4 || local22 == 5) {
							local566.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub5(local501, 4, local28, Static85.anInt2267, local42, local248, local316, false, local566.aClass1_Sub1_Sub1_7);
						} else if (local22 == 6) {
							local566.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub5(local501, 4, local28 + 4, Static85.anInt2267, local42, local248, local316, false, local566.aClass1_Sub1_Sub1_7);
						} else if (local22 == 7) {
							local566.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub5(local501, 4, (local28 + 2 & 0x3) + 4, Static85.anInt2267, local42, local248, local316, false, local566.aClass1_Sub1_Sub1_7);
						} else if (local22 == 8) {
							local566.aClass1_Sub1_Sub1_7 = new Class1_Sub1_Sub1_Sub5(local501, 4, local28 + 4, Static85.anInt2267, local42, local248, local316, false, local566.aClass1_Sub1_Sub1_7);
							local566.aClass1_Sub1_Sub1_8 = new Class1_Sub1_Sub1_Sub5(local501, 4, (local28 + 2 & 0x3) + 4, Static85.anInt2267, local42, local248, local316, false, local566.aClass1_Sub1_Sub1_8);
						}
					}
				}
				if (local32 == 2) {
					if (local22 == 11) {
						local22 = 10;
					}
					@Pc(713) Class4 local713 = Static123.aClass80_1.method2684(Static85.anInt2267, local42, local248);
					if (local713 != null) {
						local713.aClass1_Sub1_Sub1_1 = new Class1_Sub1_Sub1_Sub5(local713.anInt316 >> 14 & 0x7FFF, local22, local28, Static85.anInt2267, local42, local248, local316, false, local713.aClass1_Sub1_Sub1_1);
					}
				}
				if (local32 == 3) {
					@Pc(744) Class85 local744 = Static123.aClass80_1.method2710(Static85.anInt2267, local42, local248);
					if (local744 != null) {
						local744.aClass1_Sub1_Sub1_9 = new Class1_Sub1_Sub1_Sub5(local744.anInt4123 >> 14 & 0x7FFF, 22, local28, Static85.anInt2267, local42, local248, local316, false, local744.aClass1_Sub1_Sub1_9);
					}
				}
			}
		} else if (Static15.anInt475 == 226) {
			local14 = Static35.aClass1_Sub8_Sub1_2.method886();
			local22 = Static35.aClass1_Sub8_Sub1_2.method861();
			local28 = Static85.anInt2264 + (local22 >> 4 & 0x7);
			local32 = Static35.anInt973 + (local22 & 0x7);
			local38 = Static35.aClass1_Sub8_Sub1_2.method867();
			local42 = Static35.aClass1_Sub8_Sub1_2.method878();
			if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104 && Static72.anInt1984 != local42) {
				@Pc(826) Class1_Sub1_Sub1_Sub7 local826 = new Class1_Sub1_Sub1_Sub7();
				local826.anInt4373 = local14;
				local826.anInt4377 = local38;
				if (Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local28][local32] == null) {
					Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local28][local32] = new Class56();
				}
				Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local28][local32].method1856(local826);
				Static110.method1954(local32, local28);
			}
		} else {
			@Pc(918) int local918;
			@Pc(926) int local926;
			@Pc(922) int local922;
			if (Static15.anInt475 == 143) {
				local14 = Static35.aClass1_Sub8_Sub1_2.method902();
				@Pc(876) byte local876 = Static35.aClass1_Sub8_Sub1_2.method854();
				local28 = Static35.aClass1_Sub8_Sub1_2.method883();
				local32 = Static85.anInt2264 + (local28 >> 4 & 0x7);
				local38 = Static35.anInt973 + (local28 & 0x7);
				@Pc(898) byte local898 = Static35.aClass1_Sub8_Sub1_2.method900();
				local248 = Static35.aClass1_Sub8_Sub1_2.method902();
				@Pc(906) byte local906 = Static35.aClass1_Sub8_Sub1_2.method900();
				@Pc(910) byte local910 = Static35.aClass1_Sub8_Sub1_2.method900();
				local501 = Static35.aClass1_Sub8_Sub1_2.method886();
				local918 = Static35.aClass1_Sub8_Sub1_2.method901();
				local922 = local918 & 0x3;
				local926 = local918 >> 2;
				@Pc(930) int local930 = Static45.anIntArray151[local926];
				@Pc(934) int local934 = Static35.aClass1_Sub8_Sub1_2.method867();
				@Pc(943) Class1_Sub1_Sub1_Sub1_Sub1 local943;
				if (Static72.anInt1984 == local14) {
					local943 = Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103;
				} else {
					local943 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local14];
				}
				if (local943 != null) {
					@Pc(955) Class1_Sub1_Sub3 local955 = Static84.method3155(local248);
					@Pc(968) int local968;
					@Pc(971) int local971;
					if (local922 == 1 || local922 == 3) {
						local968 = local955.anInt657;
						local971 = local955.anInt656;
					} else {
						local968 = local955.anInt656;
						local971 = local955.anInt657;
					}
					@Pc(985) int local985 = local32 + (local968 >> 1);
					@Pc(993) int local993 = (local968 + 1 >> 1) + local32;
					@Pc(999) int local999 = (local971 >> 1) + local38;
					@Pc(1007) int local1007 = (local971 + 1 >> 1) + local38;
					@Pc(1011) int[][] local1011 = Static141.anIntArrayArrayArray3[Static85.anInt2267];
					@Pc(1019) int local1019 = (local32 << 7) + (local968 << 6);
					@Pc(1046) int local1046 = local1011[local985][local1007] + local1011[local993][local999] + local1011[local985][local999] + local1011[local993][local1007] >> 2;
					@Pc(1054) int local1054 = (local971 << 6) + (local38 << 7);
					@Pc(1064) Class1_Sub1_Sub1_Sub2 local1064 = local955.method369(local1019, local922, local1046, local1011, local1054, local926);
					if (local1064 != null) {
						@Pc(1071) byte local1071;
						if (local898 < local910) {
							local1071 = local910;
							local910 = local898;
							local898 = local1071;
						}
						Static67.method1180(0, Static85.anInt2267, -1, local501 + 1, local38, local32, 0, local934 + 1, local930);
						local943.anInt200 = Static26.anInt845 + local934;
						local943.aClass1_Sub1_Sub1_Sub2_1 = local1064;
						local943.anInt218 = local32 + local910;
						local943.anInt203 = Static26.anInt845 + local501;
						local943.anInt214 = local898 + local32;
						local943.anInt202 = local32 * 128 + local968 * 64;
						if (local876 < local906) {
							local1071 = local906;
							local906 = local876;
							local876 = local1071;
						}
						local943.anInt208 = local876 + local38;
						local943.anInt207 = local971 * 64 + local38 * 128;
						local943.anInt212 = local1046;
						local943.anInt216 = local906 + local38;
					}
				}
			}
			if (Static15.anInt475 == 205) {
				local14 = Static35.aClass1_Sub8_Sub1_2.method861();
				local28 = Static35.anInt973 + (local14 & 0x7);
				local22 = (local14 >> 4 & 0x7) + Static85.anInt2264;
				local32 = Static35.aClass1_Sub8_Sub1_2.method878();
				local38 = Static35.aClass1_Sub8_Sub1_2.method861();
				local42 = Static35.aClass1_Sub8_Sub1_2.method878();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					local28 = local28 * 128 + 64;
					local22 = local22 * 128 + 64;
					@Pc(1245) Class1_Sub1_Sub1_Sub3 local1245 = new Class1_Sub1_Sub1_Sub3(local32, Static85.anInt2267, local22, local28, Static99.method1680(local28, local22, Static85.anInt2267) - local38, local42, Static26.anInt845);
					Static49.aClass56_5.method1856(local1245);
				}
			} else if (Static15.anInt475 == 133) {
				local14 = Static35.aClass1_Sub8_Sub1_2.method861();
				local22 = (local14 >> 4 & 0x7) + Static85.anInt2264;
				local28 = (local14 & 0x7) + Static35.anInt973;
				local32 = Static35.aClass1_Sub8_Sub1_2.method900() + local22;
				local38 = Static35.aClass1_Sub8_Sub1_2.method900() + local28;
				local42 = Static35.aClass1_Sub8_Sub1_2.method875();
				local248 = Static35.aClass1_Sub8_Sub1_2.method878();
				local316 = Static35.aClass1_Sub8_Sub1_2.method861() * 4;
				local338 = Static35.aClass1_Sub8_Sub1_2.method861() * 4;
				local501 = Static35.aClass1_Sub8_Sub1_2.method878();
				local918 = Static35.aClass1_Sub8_Sub1_2.method878();
				local926 = Static35.aClass1_Sub8_Sub1_2.method861();
				local922 = Static35.aClass1_Sub8_Sub1_2.method861();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local32 >= 0 && local38 >= 0 && local32 < 104 && local38 < 104 && local248 != 65535) {
					local38 = local38 * 128 + 64;
					local28 = local28 * 128 + 64;
					local22 = local22 * 128 + 64;
					@Pc(1390) Class1_Sub1_Sub1_Sub4 local1390 = new Class1_Sub1_Sub1_Sub4(local248, Static85.anInt2267, local22, local28, Static99.method1680(local28, local22, Static85.anInt2267) - local316, local501 + Static26.anInt845, local918 + Static26.anInt845, local926, local922, local42, local338);
					local32 = local32 * 128 + 64;
					local1390.method2028(local501 + Static26.anInt845, -local338 + Static99.method1680(local38, local32, Static85.anInt2267), local38, local32);
					Static91.aClass56_7.method1856(local1390);
				}
			} else if (Static15.anInt475 == 136) {
				local14 = Static35.aClass1_Sub8_Sub1_2.method886();
				local22 = Static35.aClass1_Sub8_Sub1_2.method878();
				local28 = Static35.aClass1_Sub8_Sub1_2.method866();
				local32 = (local28 >> 4 & 0x7) + Static85.anInt2264;
				local38 = Static35.anInt973 + (local28 & 0x7);
				if (local32 >= 0 && local38 >= 0 && local32 < 104 && local38 < 104) {
					local168 = new Class1_Sub1_Sub1_Sub7();
					local168.anInt4377 = local22;
					local168.anInt4373 = local14;
					if (Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local32][local38] == null) {
						Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local32][local38] = new Class56();
					}
					Static41.aClass56ArrayArrayArray1[Static85.anInt2267][local32][local38].method1856(local168);
					Static110.method1954(local38, local32);
				}
			} else if (Static15.anInt475 == 247) {
				local14 = Static35.aClass1_Sub8_Sub1_2.method861();
				local22 = local14 >> 2;
				local28 = local14 & 0x3;
				local32 = Static45.anIntArray151[local22];
				local38 = Static35.aClass1_Sub8_Sub1_2.method902();
				local42 = Static35.aClass1_Sub8_Sub1_2.method861();
				local248 = (local42 >> 4 & 0x7) + Static85.anInt2264;
				local316 = (local42 & 0x7) + Static35.anInt973;
				if (local248 >= 0 && local316 >= 0 && local248 < 104 && local316 < 104) {
					Static67.method1180(local28, Static85.anInt2267, local38, 0, local316, local248, local22, -1, local32);
				}
			}
		}
	}
}
