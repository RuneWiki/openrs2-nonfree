import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
	public static int anInt1721;

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "Lclient!dd;")
	public static Class13 aClass13_586 = Static161.method2971("(U5");

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_587 = Static161.method2971("::errortest");

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
	public static int anInt1722 = 0;

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_588 = Static161.method2971("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	public static void method1291(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int[] local16 = new int[4];
		local16[0] = arg0;
		@Pc(22) int local22 = 1;
		@Pc(25) int[] local25 = new int[4];
		local25[0] = arg1;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			if (Static88.anIntArray241[local31] != arg0) {
				local16[local22] = Static88.anIntArray241[local31];
				local25[local22] = Static108.anIntArray290[local31];
				local22++;
			}
		}
		Static88.anIntArray241 = local16;
		Static108.anIntArray290 = local25;
		Static137.method2459(Static16.aClass36Array1.length - 1, Static108.anIntArray290, 0, Static16.aClass36Array1, Static88.anIntArray241);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lclient!fd;B)I")
	public static int method1292(@OriginalArg(0) Class20 arg0) {
		@Pc(21) Class1_Sub6 local21 = (Class1_Sub6) Static22.aClass45_8.method1988(((long) arg0.anInt1630 << 32) + ((long) arg0.anInt1608));
		return local21 == null ? arg0.anInt1607 : local21.anInt423;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
	public static void method1293(@OriginalArg(0) int arg0) {
		if (Static2.anInt97 == arg0) {
			return;
		}
		if (Static2.anInt97 == 0) {
			Static78.method1592();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static97.anInt4167 = 0;
			Static79.anInt2248 = 0;
			Static141.anInt3501 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static58.aClass62_3 != null) {
			Static58.aClass62_3.method2277();
			Static58.aClass62_3 = null;
		}
		if (Static2.anInt97 == 25) {
			Static102.anInt2853 = 0;
			Static17.anInt726 = 1;
			Static8.anInt287 = 1;
			Static27.anInt979 = 0;
			Static22.anInt2237 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static153.method2620(Static106.aCanvas1, Static69.aClass4_Sub1_25, Static170.aClass4_Sub1_53);
		} else {
			Static185.method2995();
		}
		Static2.anInt97 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public static void method1294() {
		aClass13_588 = null;
		aClass13_587 = null;
		aClass13_586 = null;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZII)V")
	public static void method1295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static159.anInt3764 = 0;
		@Pc(277) int local277;
		@Pc(204) int local204;
		@Pc(129) int local129;
		for (@Pc(5) int local5 = -1; local5 < Static74.anInt2127 + Static65.anInt1929; local5++) {
			@Pc(27) Class1_Sub2_Sub2_Sub2 local27;
			if (local5 == -1) {
				local27 = Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1;
			} else if (local5 >= Static65.anInt1929) {
				local27 = Static181.aClass1_Sub2_Sub2_Sub2_Sub1Array1[Static66.anIntArray202[local5 - Static65.anInt1929]];
			} else {
				local27 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[Static30.anIntArray116[local5]];
			}
			if (local27 != null && local27.method1882()) {
				@Pc(54) Class1_Sub2_Sub19 local54;
				if (local27 instanceof Class1_Sub2_Sub2_Sub2_Sub1) {
					local54 = ((Class1_Sub2_Sub2_Sub2_Sub1) local27).aClass1_Sub2_Sub19_1;
					if (local54.anIntArray430 != null) {
						local54 = local54.method2798();
					}
					if (local54 == null) {
						continue;
					}
				}
				if (Static65.anInt1929 <= local5) {
					local54 = ((Class1_Sub2_Sub2_Sub2_Sub1) local27).aClass1_Sub2_Sub19_1;
					if (local54.anIntArray430 != null) {
						local54 = local54.method2798();
					}
					if (local54.anInt3853 >= 0 && local54.anInt3853 < Static159.aClass1_Sub2_Sub1_Sub3Array11.length) {
						Static1.method48(local27.method1889() + 15, local27);
						if (Static66.anInt1948 > -1) {
							Static159.aClass1_Sub2_Sub1_Sub3Array11[local54.anInt3853].method422(Static66.anInt1948 + arg3 - 12, arg1 + Static30.anInt1069 + -30);
						}
					}
					@Pc(127) Class41[] local127 = Static144.aClass41Array1;
					for (local129 = 0; local129 < local127.length; local129++) {
						@Pc(135) Class41 local135 = local127[local129];
						if (local135 != null && local135.anInt2172 == 1 && Static66.anIntArray202[local5 - Static65.anInt1929] == local135.anInt2165 && Static78.anInt2168 % 20 < 10) {
							Static1.method48(local27.method1889() + 15, local27);
							if (Static66.anInt1948 > -1) {
								Static182.aClass1_Sub2_Sub1_Sub3Array3[local135.anInt2163].method422(arg3 + Static66.anInt1948 - 12, Static30.anInt1069 + -28 + arg1);
							}
						}
					}
				} else {
					@Pc(202) Class1_Sub2_Sub2_Sub2_Sub2 local202 = (Class1_Sub2_Sub2_Sub2_Sub2) local27;
					local204 = 30;
					if (local202.anInt2610 != -1 || local202.anInt2626 != -1) {
						Static1.method48(local27.method1889() + 15, local27);
						if (Static66.anInt1948 > -1) {
							if (local202.anInt2610 != -1) {
								Static15.aClass1_Sub2_Sub1_Sub3Array1[local202.anInt2610].method422(arg3 + Static66.anInt1948 - 12, arg1 + -30 + Static30.anInt1069);
								local204 += 25;
							}
							if (local202.anInt2626 != -1) {
								Static159.aClass1_Sub2_Sub1_Sub3Array11[local202.anInt2626].method422(Static66.anInt1948 + arg3 - 12, Static30.anInt1069 + arg1 + -local204);
								local204 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(275) Class41[] local275 = Static144.aClass41Array1;
						for (local277 = 0; local277 < local275.length; local277++) {
							@Pc(283) Class41 local283 = local275[local277];
							if (local283 != null && local283.anInt2172 == 10 && Static30.anIntArray116[local5] == local283.anInt2165) {
								Static1.method48(local27.method1889() + 15, local27);
								if (Static66.anInt1948 > -1) {
									Static182.aClass1_Sub2_Sub1_Sub3Array3[local283.anInt2163].method422(arg3 + Static66.anInt1948 - 12, -local204 + Static30.anInt1069 + arg1);
								}
							}
						}
					}
				}
				if (local27.aClass13_846 != null && (local5 >= Static65.anInt1929 || Static80.anInt2285 == 0 || Static80.anInt2285 == 3 || Static80.anInt2285 == 1 && Static3.method72(((Class1_Sub2_Sub2_Sub2_Sub2) local27).aClass13_847))) {
					Static1.method48(local27.method1889(), local27);
					if (Static66.anInt1948 > -1 && Static159.anInt3764 < Static142.anInt3511) {
						Static142.anIntArray343[Static159.anInt3764] = Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method246(local27.aClass13_846) / 2;
						Static142.anIntArray345[Static159.anInt3764] = Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.anInt225;
						Static142.anIntArray342[Static159.anInt3764] = Static66.anInt1948;
						Static142.anIntArray339[Static159.anInt3764] = Static30.anInt1069;
						Static142.anIntArray338[Static159.anInt3764] = local27.anInt2570;
						Static142.anIntArray344[Static159.anInt3764] = local27.anInt2587;
						Static142.anIntArray340[Static159.anInt3764] = local27.anInt2589;
						Static142.aClass13Array25[Static159.anInt3764] = local27.aClass13_846;
						Static159.anInt3764++;
					}
				}
				if (local27.anInt2558 > Static78.anInt2168) {
					Static1.method48(local27.method1889() + 15, local27);
					if (Static66.anInt1948 > -1) {
						Static128.method565(Static66.anInt1948 + arg3 - 15, Static30.anInt1069 + arg1 - 3, local27.anInt2563, 5, 65280);
						Static128.method565(Static66.anInt1948 + arg3 + local27.anInt2563 - 15, arg1 + -3 - -Static30.anInt1069, 30 - local27.anInt2563, 5, 16711680);
					}
				}
				for (local204 = 0; local204 < 4; local204++) {
					if (Static78.anInt2168 < local27.anIntArray248[local204]) {
						Static1.method48(local27.method1889() / 2, local27);
						if (Static66.anInt1948 > -1) {
							if (local204 == 1) {
								Static30.anInt1069 -= 20;
							}
							if (local204 == 2) {
								Static30.anInt1069 -= 10;
								Static66.anInt1948 -= 15;
							}
							if (local204 == 3) {
								Static30.anInt1069 -= 10;
								Static66.anInt1948 += 15;
							}
							Static33.aClass1_Sub2_Sub1_Sub3Array5[local27.anIntArray251[local204]].method422(arg3 + Static66.anInt1948 - 12, arg1 + -12 - -Static30.anInt1069);
							Static12.aClass1_Sub2_Sub1_Sub1_Sub1_2.method258(Static3.method75(local27.anIntArray250[local204]), Static66.anInt1948 + arg3 - 1, Static30.anInt1069 + 3 + arg1, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(588) int local588 = 0; local588 < Static159.anInt3764; local588++) {
			local204 = Static142.anIntArray342[local588];
			@Pc(598) int local598 = Static142.anIntArray339[local588];
			local129 = Static142.anIntArray343[local588];
			local277 = Static142.anIntArray345[local588];
			@Pc(608) boolean local608 = true;
			while (local608) {
				local608 = false;
				for (@Pc(614) int local614 = 0; local614 < local588; local614++) {
					if (local598 + 2 > -Static142.anIntArray345[local614] + Static142.anIntArray339[local614] && local598 - local277 < Static142.anIntArray339[local614] - -2 && local204 - local129 < Static142.anIntArray342[local614] + Static142.anIntArray343[local614] && local129 + local204 > Static142.anIntArray342[local614] - Static142.anIntArray343[local614] && local598 > Static142.anIntArray339[local614] - Static142.anIntArray345[local614]) {
						local608 = true;
						local598 = Static142.anIntArray339[local614] - Static142.anIntArray345[local614];
					}
				}
			}
			Static66.anInt1948 = Static142.anIntArray342[local588];
			Static30.anInt1069 = Static142.anIntArray339[local588] = local598;
			@Pc(719) Class13 local719 = Static142.aClass13Array25[local588];
			if (Static55.anInt1771 == 0) {
				@Pc(738) int local738 = 16776960;
				if (Static142.anIntArray338[local588] < 6) {
					local738 = Static33.anIntArray121[Static142.anIntArray338[local588]];
				}
				if (Static142.anIntArray338[local588] == 6) {
					local738 = Static35.anInt1195 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static142.anIntArray338[local588] == 7) {
					local738 = Static35.anInt1195 % 20 >= 10 ? 65535 : 255;
				}
				if (Static142.anIntArray338[local588] == 8) {
					local738 = Static35.anInt1195 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(811) int local811;
				if (Static142.anIntArray338[local588] == 9) {
					local811 = 150 - Static142.anIntArray340[local588];
					if (local811 < 50) {
						local738 = local811 * 1280 + 16711680;
					} else if (local811 < 100) {
						local738 = 33160960 - local811 * 327680;
					} else if (local811 < 150) {
						local738 = (local811 - 100) * 5 + 65280;
					}
				}
				if (Static142.anIntArray338[local588] == 10) {
					local811 = 150 - Static142.anIntArray340[local588];
					if (local811 < 50) {
						local738 = local811 * 5 + 16711680;
					} else if (local811 < 100) {
						local738 = 16384000 + 16711935 - local811 * 327680;
					} else if (local811 < 150) {
						local738 = (local811 + -100) * 327680 + 500 + 255 - local811 * 5;
					}
				}
				if (Static142.anIntArray338[local588] == 11) {
					local811 = 150 - Static142.anIntArray340[local588];
					if (local811 < 50) {
						local738 = 16777215 - local811 * 327685;
					} else if (local811 < 100) {
						local738 = local811 * 327685 - 16318970;
					} else if (local811 < 150) {
						local738 = 16777215 - (local811 - 100) * 327680;
					}
				}
				if (Static142.anIntArray344[local588] == 0) {
					Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method258(local719, arg3 + Static66.anInt1948, Static30.anInt1069 + arg1, local738, 0);
				}
				if (Static142.anIntArray344[local588] == 1) {
					Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method252(local719, Static66.anInt1948 + arg3, Static30.anInt1069 + arg1, local738, Static35.anInt1195);
				}
				if (Static142.anIntArray344[local588] == 2) {
					Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method240(local719, Static66.anInt1948 + arg3, Static30.anInt1069 + arg1, local738, Static35.anInt1195);
				}
				if (Static142.anIntArray344[local588] == 3) {
					Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method243(local719, Static66.anInt1948 + arg3, Static30.anInt1069 + arg1, local738, Static35.anInt1195, 150 - Static142.anIntArray340[local588]);
				}
				if (Static142.anIntArray344[local588] == 4) {
					local811 = (150 - Static142.anIntArray340[local588]) * (Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method246(local719) + 100) / 150;
					Static128.method549(arg3 + Static66.anInt1948 - 50, arg1, arg3 + Static66.anInt1948 + 50, arg1 + arg2);
					Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method254(local719, arg3 + Static66.anInt1948 + 50 - local811, Static30.anInt1069 + arg1, local738, 0);
					Static128.method553(arg3, arg1, arg0 + arg3, arg1 - -arg2);
				}
				if (Static142.anIntArray344[local588] == 5) {
					local811 = 150 - Static142.anIntArray340[local588];
					Static128.method549(arg3, arg1 + Static30.anInt1069 - Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.anInt225 - 1, arg3 + arg0, Static30.anInt1069 + arg1 + 5);
					@Pc(1133) int local1133 = 0;
					if (local811 < 25) {
						local1133 = local811 - 25;
					} else if (local811 > 125) {
						local1133 = local811 - 125;
					}
					Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method258(local719, Static66.anInt1948 + arg3, local1133 + Static30.anInt1069 + arg1, local738, 0);
					Static128.method553(arg3, arg1, arg0 + arg3, arg2 + arg1);
				}
			} else {
				Static110.aClass1_Sub2_Sub1_Sub1_Sub1_6.method258(local719, arg3 + Static66.anInt1948, arg1 - -Static30.anInt1069, 16776960, 0);
			}
		}
	}
}
