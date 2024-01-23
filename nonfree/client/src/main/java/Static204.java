import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
	public static int anInt4564 = 0;

	@OriginalMember(owner = "client!ue", name = "W", descriptor = "Lclient!ui;")
	public static Class103 aClass103_21 = new Class103(4096);

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "Lclient!qe;")
	public static Class78 aClass78_810 = Static199.method3560("");

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "[I")
	public static int[] anIntArray733 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "[S")
	public static short[] aShortArray144 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(II)Lclient!mj;")
	public static Class64 method3618(@OriginalArg(0) int arg0) {
		@Pc(8) int local8 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static181.aClass64ArrayArray1[local8] == null || Static181.aClass64ArrayArray1[local8][local16] == null) {
			@Pc(30) boolean local30 = Static80.method1339(local8);
			if (!local30) {
				return null;
			}
		}
		return Static181.aClass64ArrayArray1[local8][local16];
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIII)V")
	public static void method3620(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static82.anInt1748 = 0;
		@Pc(148) int local148;
		@Pc(65) int local65;
		@Pc(273) int local273;
		for (@Pc(7) int local7 = -1; local7 < Static50.anInt908 + Static180.anInt4193; local7++) {
			@Pc(20) Class5_Sub2 local20;
			if (local7 == -1) {
				local20 = Static31.aClass5_Sub2_Sub2_1;
			} else if (local7 < Static180.anInt4193) {
				local20 = Static213.aClass5_Sub2_Sub2Array3[Static16.anIntArray792[local7]];
			} else {
				local20 = Static95.aClass5_Sub2_Sub1Array1[Static79.anIntArray286[local7 - Static180.anInt4193]];
			}
			if (local20 != null && local20.method1479()) {
				@Pc(46) Class2_Sub3_Sub9 local46;
				if (local20 instanceof Class5_Sub2_Sub1) {
					local46 = ((Class5_Sub2_Sub1) local20).aClass2_Sub3_Sub9_1;
					if (local46.anIntArray230 != null) {
						local46 = local46.method1059();
					}
					if (local46 == null) {
						continue;
					}
				}
				if (local7 >= Static180.anInt4193) {
					local46 = ((Class5_Sub2_Sub1) local20).aClass2_Sub3_Sub9_1;
					if (local46.anIntArray230 != null) {
						local46 = local46.method1059();
					}
					if (local46.anInt1295 >= 0 && Static158.aClass2_Sub3_Sub8Array7.length > local46.anInt1295) {
						Static159.method3302(local20.method1489() + 15, arg3 >> 1, arg0 >> 1, local20);
						if (Static7.anInt214 > -1) {
							Static158.aClass2_Sub3_Sub8Array7[local46.anInt1295].method2262(arg2 + Static7.anInt214 - 12, Static111.anInt2448 + -30 + arg1);
						}
					}
					@Pc(271) Class19[] local271 = Static216.aClass19Array1;
					for (local273 = 0; local273 < local271.length; local273++) {
						@Pc(278) Class19 local278 = local271[local273];
						if (local278 != null && local278.anInt504 == 1 && local278.anInt496 == Static79.anIntArray286[local7 - Static180.anInt4193] && Static123.anInt2808 % 20 < 10) {
							Static159.method3302(local20.method1489() + 15, arg3 >> 1, arg0 >> 1, local20);
							if (Static7.anInt214 > -1) {
								Static161.aClass2_Sub3_Sub8Array8[local278.anInt495].method2262(arg2 + Static7.anInt214 - 12, Static111.anInt2448 + -28 + arg1);
							}
						}
					}
				} else {
					local65 = 30;
					@Pc(68) Class5_Sub2_Sub2 local68 = (Class5_Sub2_Sub2) local20;
					if (local68.anInt1895 != -1 || local68.anInt1908 != -1) {
						Static159.method3302(local20.method1489() + 15, arg3 >> 1, arg0 >> 1, local20);
						if (Static7.anInt214 > -1) {
							if (local68.anInt1895 != -1) {
								Static209.aClass2_Sub3_Sub8Array10[local68.anInt1895].method2262(arg2 + Static7.anInt214 - 12, Static111.anInt2448 + -30 + arg1);
								local65 += 25;
							}
							if (local68.anInt1908 != -1) {
								Static158.aClass2_Sub3_Sub8Array7[local68.anInt1908].method2262(Static7.anInt214 + arg2 - 12, arg1 + Static111.anInt2448 + -local65);
								local65 += 25;
							}
						}
					}
					if (local7 >= 0) {
						@Pc(146) Class19[] local146 = Static216.aClass19Array1;
						for (local148 = 0; local148 < local146.length; local148++) {
							@Pc(153) Class19 local153 = local146[local148];
							if (local153 != null && local153.anInt504 == 10 && local153.anInt496 == Static16.anIntArray792[local7]) {
								Static159.method3302(local20.method1489() + 15, arg3 >> 1, arg0 >> 1, local20);
								if (Static7.anInt214 > -1) {
									Static161.aClass2_Sub3_Sub8Array8[local153.anInt495].method2262(arg2 + Static7.anInt214 - 12, arg1 - -Static111.anInt2448 - local65);
								}
							}
						}
					}
				}
				if (local20.aClass78_422 != null && (local7 >= Static180.anInt4193 || Static33.anInt568 == 0 || Static33.anInt568 == 3 || Static33.anInt568 == 1 && Static38.method510(((Class5_Sub2_Sub2) local20).aClass78_423))) {
					Static159.method3302(local20.method1489(), arg3 >> 1, arg0 >> 1, local20);
					if (Static7.anInt214 > -1 && Static82.anInt1748 < Static79.anInt1727) {
						Static79.anIntArray292[Static82.anInt1748] = Static75.aClass2_Sub3_Sub7_1.method883(local20.aClass78_422) / 2;
						Static79.anIntArray291[Static82.anInt1748] = Static75.aClass2_Sub3_Sub7_1.anInt1125;
						Static79.anIntArray285[Static82.anInt1748] = Static7.anInt214;
						Static79.anIntArray288[Static82.anInt1748] = Static111.anInt2448;
						Static79.anIntArray289[Static82.anInt1748] = local20.anInt1872;
						Static79.anIntArray287[Static82.anInt1748] = local20.anInt1834;
						Static79.anIntArray290[Static82.anInt1748] = local20.anInt1845;
						Static79.aClass78Array15[Static82.anInt1748] = local20.aClass78_422;
						Static82.anInt1748++;
					}
				}
				if (local20.anInt1850 > Static123.anInt2808) {
					Static159.method3302(local20.method1489() + 15, arg3 >> 1, arg0 >> 1, local20);
					if (Static7.anInt214 > -1) {
						Static217.method3761(arg2 + Static7.anInt214 - 15, Static111.anInt2448 + -3 + arg1, local20.anInt1858, 5, 65280);
						Static217.method3761(Static7.anInt214 + arg2 + local20.anInt1858 - 15, Static111.anInt2448 + -3 + arg1, 30 - local20.anInt1858, 5, 16711680);
					}
				}
				for (local65 = 0; local65 < 4; local65++) {
					if (Static123.anInt2808 < local20.anIntArray336[local65]) {
						Static159.method3302(local20.method1489() / 2, arg3 >> 1, arg0 >> 1, local20);
						if (Static7.anInt214 > -1) {
							if (local65 == 1) {
								Static111.anInt2448 -= 20;
							}
							if (local65 == 2) {
								Static7.anInt214 -= 15;
								Static111.anInt2448 -= 10;
							}
							if (local65 == 3) {
								Static111.anInt2448 -= 10;
								Static7.anInt214 += 15;
							}
							Static84.aClass2_Sub3_Sub8Array5[local20.anIntArray335[local65]].method2262(arg2 + Static7.anInt214 - 12, Static111.anInt2448 + (arg1 - 12));
							Static110.aClass2_Sub3_Sub7_2.method886(Static19.method268(local20.anIntArray332[local65]), Static7.anInt214 + arg2 - 1, arg1 + 3 - -Static111.anInt2448, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(625) int local625 = 0; local625 < Static82.anInt1748; local625++) {
			@Pc(630) int local630 = Static79.anIntArray288[local625];
			local65 = Static79.anIntArray285[local625];
			local273 = Static79.anIntArray292[local625];
			local148 = Static79.anIntArray291[local625];
			@Pc(644) boolean local644 = true;
			while (local644) {
				local644 = false;
				for (@Pc(649) int local649 = 0; local649 < local625; local649++) {
					if (Static79.anIntArray288[local649] - Static79.anIntArray291[local649] < local630 + 2 && Static79.anIntArray288[local649] + 2 > -local148 + local630 && local65 - local273 < Static79.anIntArray285[local649] + Static79.anIntArray292[local649] && local65 + local273 > Static79.anIntArray285[local649] - Static79.anIntArray292[local649] && local630 > Static79.anIntArray288[local649] - Static79.anIntArray291[local649]) {
						local644 = true;
						local630 = Static79.anIntArray288[local649] - Static79.anIntArray291[local649];
					}
				}
			}
			Static7.anInt214 = Static79.anIntArray285[local625];
			Static111.anInt2448 = Static79.anIntArray288[local625] = local630;
			@Pc(751) Class78 local751 = Static79.aClass78Array15[local625];
			if (Static30.anInt549 == 0) {
				@Pc(767) int local767 = 16776960;
				if (Static79.anIntArray289[local625] < 6) {
					local767 = Static189.anIntArray711[Static79.anIntArray289[local625]];
				}
				if (Static79.anIntArray289[local625] == 6) {
					local767 = Static25.anInt457 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static79.anIntArray289[local625] == 7) {
					local767 = Static25.anInt457 % 20 >= 10 ? 65535 : 255;
				}
				if (Static79.anIntArray289[local625] == 8) {
					local767 = Static25.anInt457 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(836) int local836;
				if (Static79.anIntArray289[local625] == 9) {
					local836 = 150 - Static79.anIntArray290[local625];
					if (local836 < 50) {
						local767 = local836 * 1280 + 16711680;
					} else if (local836 < 100) {
						local767 = 16776960 - (local836 - 50) * 327680;
					} else if (local836 < 150) {
						local767 = local836 * 5 + 65280 - 500;
					}
				}
				if (Static79.anIntArray289[local625] == 10) {
					local836 = 150 - Static79.anIntArray290[local625];
					if (local836 < 50) {
						local767 = local836 * 5 + 16711680;
					} else if (local836 < 100) {
						local767 = 16711935 - (local836 - 50) * 327680;
					} else if (local836 < 150) {
						local767 = local836 * 327680 + 255 + 500 - local836 * 5 - 32768000;
					}
				}
				if (Static79.anIntArray289[local625] == 11) {
					local836 = 150 - Static79.anIntArray290[local625];
					if (local836 < 50) {
						local767 = 16777215 - local836 * 327685;
					} else if (local836 < 100) {
						local767 = local836 * 327685 - 16318970;
					} else if (local836 < 150) {
						local767 = 16777215 - (local836 - 100) * 327680;
					}
				}
				if (Static79.anIntArray287[local625] == 0) {
					Static75.aClass2_Sub3_Sub7_1.method886(local751, arg2 + Static7.anInt214, Static111.anInt2448 + arg1, local767, 0);
				}
				if (Static79.anIntArray287[local625] == 1) {
					Static75.aClass2_Sub3_Sub7_1.method901(local751, arg2 + Static7.anInt214, Static111.anInt2448 + arg1, local767, Static25.anInt457);
				}
				if (Static79.anIntArray287[local625] == 2) {
					Static75.aClass2_Sub3_Sub7_1.method896(local751, Static7.anInt214 + arg2, Static111.anInt2448 + arg1, local767, Static25.anInt457);
				}
				if (Static79.anIntArray287[local625] == 3) {
					Static75.aClass2_Sub3_Sub7_1.method882(local751, Static7.anInt214 + arg2, Static111.anInt2448 + arg1, local767, Static25.anInt457, 150 - Static79.anIntArray290[local625]);
				}
				if (Static79.anIntArray287[local625] == 4) {
					local836 = (150 - Static79.anIntArray290[local625]) * (Static75.aClass2_Sub3_Sub7_1.method883(local751) + 100) / 150;
					Static217.method3764(Static7.anInt214 + arg2 - 50, arg1, Static7.anInt214 + arg2 + 50, arg1 + arg0);
					Static75.aClass2_Sub3_Sub7_1.method904(local751, arg2 + Static7.anInt214 + 50 - local836, Static111.anInt2448 + arg1, local767, 0);
					Static217.method3759(arg2, arg1, arg3 + arg2, arg0 + arg1);
				}
				if (Static79.anIntArray287[local625] == 5) {
					local836 = 150 - Static79.anIntArray290[local625];
					Static217.method3764(arg2, arg1 + Static111.anInt2448 - Static75.aClass2_Sub3_Sub7_1.anInt1125 - 1, arg3 + arg2, arg1 + Static111.anInt2448 + 5);
					@Pc(1152) int local1152 = 0;
					if (local836 < 25) {
						local1152 = local836 - 25;
					} else if (local836 > 125) {
						local1152 = local836 - 125;
					}
					Static75.aClass2_Sub3_Sub7_1.method886(local751, Static7.anInt214 + arg2, Static111.anInt2448 + arg1 + local1152, local767, 0);
					Static217.method3759(arg2, arg1, arg2 + arg3, arg1 - -arg0);
				}
			} else {
				Static75.aClass2_Sub3_Sub7_1.method886(local751, arg2 + Static7.anInt214, arg1 + Static111.anInt2448, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!og;B)V")
	public static void method3621(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2 arg1) {
		if (arg1.anInt1871 > Static123.anInt2808) {
			Static49.method644(arg1);
		} else if (arg1.anInt1867 < Static123.anInt2808) {
			Static5.method95(arg1);
		} else {
			Static123.method2218(arg1);
		}
		if (arg1.anInt1849 < 128 || arg1.anInt1827 < 128 || arg1.anInt1849 >= 13184 || arg1.anInt1827 >= 13184) {
			arg1.anInt1857 = -1;
			arg1.anInt1827 = arg1.anIntArray334[0] * 128 + arg1.anInt1832 * 64;
			arg1.anInt1873 = -1;
			arg1.anInt1849 = arg1.anIntArray333[0] * 128 + arg1.anInt1832 * 64;
			arg1.anInt1871 = 0;
			arg1.anInt1867 = 0;
			arg1.method1488();
		}
		if (arg1 == Static31.aClass5_Sub2_Sub2_1 && (arg1.anInt1849 < 1536 || arg1.anInt1827 < 1536 || arg1.anInt1849 >= 11776 || arg1.anInt1827 >= 11776)) {
			arg1.anInt1867 = 0;
			arg1.anInt1873 = -1;
			arg1.anInt1857 = -1;
			arg1.anInt1871 = 0;
			arg1.anInt1827 = arg1.anInt1832 * 64 + arg1.anIntArray334[0] * 128;
			arg1.anInt1849 = arg1.anInt1832 * 64 + arg1.anIntArray333[0] * 128;
			arg1.method1488();
		}
		Static205.method547(arg1);
		Static114.method1981(arg1);
	}
}
