import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1512 = Static161.method2452("Allocating memory");

	@OriginalMember(owner = "client!w", name = "d", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1513 = Static161.method2452("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1514 = Static161.method2452("<col=00ff80>");

	@OriginalMember(owner = "client!w", name = "f", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1515 = Static161.method2452("<col=c0ff00>");

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1516 = Static161.method2452("Speicher wird zugewiesen)3");

	@OriginalMember(owner = "client!w", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray50 = new boolean[200];

	@OriginalMember(owner = "client!w", name = "o", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1517 = aClass20_1512;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Z")
	public static boolean method3112(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IILclient!wa;)Lclient!bg;")
	public static Class5_Sub4 method3113(@OriginalArg(1) int arg0, @OriginalArg(2) Class23 arg1) {
		@Pc(8) byte[] local8 = arg1.method726(arg0);
		return local8 == null ? null : new Class5_Sub4(local8);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBIIII)V")
	public static void method3114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static100.anInt2149 = 0;
		@Pc(292) int local292;
		@Pc(215) int local215;
		@Pc(132) int local132;
		for (@Pc(9) int local9 = -1; local9 < Static83.anInt1850 + Static66.anInt1444; local9++) {
			@Pc(16) Class1_Sub2 local16;
			if (local9 == -1) {
				local16 = Static210.aClass1_Sub2_Sub2_2;
			} else if (Static66.anInt1444 <= local9) {
				local16 = Static61.aClass1_Sub2_Sub1Array1[Static80.anIntArray175[local9 - Static66.anInt1444]];
			} else {
				local16 = Static6.aClass1_Sub2_Sub2Array1[Static7.anIntArray13[local9]];
			}
			if (local16 != null && local16.method1741()) {
				@Pc(53) Class5_Sub2_Sub20 local53;
				if (local16 instanceof Class1_Sub2_Sub1) {
					local53 = ((Class1_Sub2_Sub1) local16).aClass5_Sub2_Sub20_1;
					if (local53.anIntArray373 != null) {
						local53 = local53.method2717();
					}
					if (local53 == null) {
						continue;
					}
				}
				if (local9 >= Static66.anInt1444) {
					local53 = ((Class1_Sub2_Sub1) local16).aClass5_Sub2_Sub20_1;
					if (local53.anIntArray373 != null) {
						local53 = local53.method2717();
					}
					if (local53.anInt3604 >= 0 && local53.anInt3604 < Static211.aClass5_Sub2_Sub10Array12.length) {
						Static105.method1716(arg0 >> 1, arg3 >> 1, local16, local16.method1740() + 15);
						if (Static36.anInt786 > -1) {
							Static211.aClass5_Sub2_Sub10Array12[local53.anInt3604].method2403(Static36.anInt786 + arg2 - 12, Static192.anInt3781 + -30 + arg1);
						}
					}
					@Pc(130) Class14[] local130 = Static218.aClass14Array1;
					for (local132 = 0; local132 < local130.length; local132++) {
						@Pc(138) Class14 local138 = local130[local132];
						if (local138 != null && local138.anInt394 == 1 && local138.anInt399 == Static80.anIntArray175[local9 - Static66.anInt1444] && Static177.anInt3533 % 20 < 10) {
							Static105.method1716(arg0 >> 1, arg3 >> 1, local16, local16.method1740() + 15);
							if (Static36.anInt786 > -1) {
								Static10.aClass5_Sub2_Sub10Array1[local138.anInt396].method2403(arg2 + Static36.anInt786 - 12, arg1 + -28 + Static192.anInt3781);
							}
						}
					}
				} else {
					@Pc(213) Class1_Sub2_Sub2 local213 = (Class1_Sub2_Sub2) local16;
					local215 = 30;
					if (local213.anInt2287 != -1 || local213.anInt2281 != -1) {
						Static105.method1716(arg0 >> 1, arg3 >> 1, local16, local16.method1740() + 15);
						if (Static36.anInt786 > -1) {
							if (local213.anInt2287 != -1) {
								Static176.aClass5_Sub2_Sub10Array11[local213.anInt2287].method2403(Static36.anInt786 + arg2 - 12, Static192.anInt3781 + -30 + arg1);
								local215 += 25;
							}
							if (local213.anInt2281 != -1) {
								Static211.aClass5_Sub2_Sub10Array12[local213.anInt2281].method2403(Static36.anInt786 + arg2 - 12, arg1 + Static192.anInt3781 + -local215);
								local215 += 25;
							}
						}
					}
					if (local9 >= 0) {
						local292 = 0;
						@Pc(294) Class14[] local294 = Static218.aClass14Array1;
						while (local294.length > local292) {
							@Pc(300) Class14 local300 = local294[local292];
							if (local300 != null && local300.anInt394 == 10 && local300.anInt399 == Static7.anIntArray13[local9]) {
								Static105.method1716(arg0 >> 1, arg3 >> 1, local16, local16.method1740() + 15);
								if (Static36.anInt786 > -1) {
									Static10.aClass5_Sub2_Sub10Array1[local300.anInt396].method2403(arg2 + Static36.anInt786 - 12, Static192.anInt3781 + arg1 + -local215);
								}
							}
							local292++;
						}
					}
				}
				if (local16.aClass20_835 != null && (Static66.anInt1444 <= local9 || Static15.anInt314 == 0 || Static15.anInt314 == 3 || Static15.anInt314 == 1 && Static86.method1467(((Class1_Sub2_Sub2) local16).aClass20_848))) {
					Static105.method1716(arg0 >> 1, arg3 >> 1, local16, local16.method1740());
					if (Static36.anInt786 > -1 && Static100.anInt2149 < Static106.anInt2192) {
						Static106.anIntArray242[Static100.anInt2149] = Static30.aClass5_Sub2_Sub8_1.method1333(local16.aClass20_835) / 2;
						Static106.anIntArray241[Static100.anInt2149] = Static30.aClass5_Sub2_Sub8_1.anInt1726;
						Static106.anIntArray246[Static100.anInt2149] = Static36.anInt786;
						Static106.anIntArray245[Static100.anInt2149] = Static192.anInt3781;
						Static106.anIntArray243[Static100.anInt2149] = local16.anInt2267;
						Static106.anIntArray244[Static100.anInt2149] = local16.anInt2260;
						Static106.anIntArray240[Static100.anInt2149] = local16.anInt2219;
						Static106.aClass20Array15[Static100.anInt2149] = local16.aClass20_835;
						Static100.anInt2149++;
					}
				}
				if (Static177.anInt3533 < local16.anInt2218) {
					Static105.method1716(arg0 >> 1, arg3 >> 1, local16, local16.method1740() + 15);
					if (Static36.anInt786 > -1) {
						Static42.method824(Static36.anInt786 + arg2 - 15, arg1 + -3 - -Static192.anInt3781, local16.anInt2264, 5, 65280);
						Static42.method824(local16.anInt2264 + arg2 + Static36.anInt786 - 15, arg1 + -3 + Static192.anInt3781, 30 - local16.anInt2264, 5, 16711680);
					}
				}
				for (local215 = 0; local215 < 4; local215++) {
					if (local16.anIntArray252[local215] > Static177.anInt3533) {
						Static105.method1716(arg0 >> 1, arg3 >> 1, local16, local16.method1740() / 2);
						if (Static36.anInt786 > -1) {
							if (local215 == 1) {
								Static192.anInt3781 -= 20;
							}
							if (local215 == 2) {
								Static36.anInt786 -= 15;
								Static192.anInt3781 -= 10;
							}
							if (local215 == 3) {
								Static36.anInt786 += 15;
								Static192.anInt3781 -= 10;
							}
							Static150.aClass5_Sub2_Sub10Array10[local16.anIntArray249[local215]].method2403(Static36.anInt786 + arg2 - 12, Static192.anInt3781 + (arg1 - 12));
							Static31.aClass5_Sub2_Sub8_2.method1350(Static132.method2805(local16.anIntArray251[local215]), arg2 + Static36.anInt786 - 1, arg1 + 3 - -Static192.anInt3781, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(630) int local630 = 0; local630 < Static100.anInt2149; local630++) {
			@Pc(647) int local647 = Static106.anIntArray245[local630];
			local215 = Static106.anIntArray246[local630];
			local292 = Static106.anIntArray241[local630];
			@Pc(657) boolean local657 = true;
			local132 = Static106.anIntArray242[local630];
			while (local657) {
				local657 = false;
				for (@Pc(667) int local667 = 0; local667 < local630; local667++) {
					if (local647 + 2 > -Static106.anIntArray241[local667] + Static106.anIntArray245[local667] && local647 - local292 < Static106.anIntArray245[local667] + 2 && Static106.anIntArray242[local667] + Static106.anIntArray246[local667] > local215 + -local132 && Static106.anIntArray246[local667] - Static106.anIntArray242[local667] < local132 + local215 && Static106.anIntArray245[local667] - Static106.anIntArray241[local667] < local647) {
						local647 = Static106.anIntArray245[local667] - Static106.anIntArray241[local667];
						local657 = true;
					}
				}
			}
			Static36.anInt786 = Static106.anIntArray246[local630];
			Static192.anInt3781 = Static106.anIntArray245[local630] = local647;
			@Pc(771) Class20 local771 = Static106.aClass20Array15[local630];
			if (Static33.anInt698 == 0) {
				@Pc(791) int local791 = 16776960;
				if (Static106.anIntArray243[local630] < 6) {
					local791 = Static201.anIntArray170[Static106.anIntArray243[local630]];
				}
				if (Static106.anIntArray243[local630] == 6) {
					local791 = Static203.anInt3983 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static106.anIntArray243[local630] == 7) {
					local791 = Static203.anInt3983 % 20 >= 10 ? 65535 : 255;
				}
				if (Static106.anIntArray243[local630] == 8) {
					local791 = Static203.anInt3983 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(864) int local864;
				if (Static106.anIntArray243[local630] == 9) {
					local864 = 150 - Static106.anIntArray240[local630];
					if (local864 < 50) {
						local791 = local864 * 1280 + 16711680;
					} else if (local864 < 100) {
						local791 = 16776960 - (local864 - 50) * 327680;
					} else if (local864 < 150) {
						local791 = local864 * 5 + 65280 - 500;
					}
				}
				if (Static106.anIntArray243[local630] == 10) {
					local864 = 150 - Static106.anIntArray240[local630];
					if (local864 < 50) {
						local791 = local864 * 5 + 16711680;
					} else if (local864 < 100) {
						local791 = 16711935 + 16384000 - local864 * 327680;
					} else if (local864 < 150) {
						local791 = local864 * 327680 + 255 - (local864 - 100) * 5 - 32768000;
					}
				}
				if (Static106.anIntArray243[local630] == 11) {
					local864 = 150 - Static106.anIntArray240[local630];
					if (local864 < 50) {
						local791 = 16777215 - local864 * 327685;
					} else if (local864 < 100) {
						local791 = local864 * 327685 - 16318970;
					} else if (local864 < 150) {
						local791 = 16777215 + 32768000 - local864 * 327680;
					}
				}
				if (Static106.anIntArray244[local630] == 0) {
					Static30.aClass5_Sub2_Sub8_1.method1350(local771, Static36.anInt786 + arg2, arg1 + Static192.anInt3781, local791, 0);
				}
				if (Static106.anIntArray244[local630] == 1) {
					Static30.aClass5_Sub2_Sub8_1.method1341(local771, arg2 + Static36.anInt786, arg1 + Static192.anInt3781, local791, Static203.anInt3983);
				}
				if (Static106.anIntArray244[local630] == 2) {
					Static30.aClass5_Sub2_Sub8_1.method1339(local771, Static36.anInt786 + arg2, Static192.anInt3781 + arg1, local791, Static203.anInt3983);
				}
				if (Static106.anIntArray244[local630] == 3) {
					Static30.aClass5_Sub2_Sub8_1.method1354(local771, arg2 + Static36.anInt786, arg1 + Static192.anInt3781, local791, Static203.anInt3983, 150 - Static106.anIntArray240[local630]);
				}
				if (Static106.anIntArray244[local630] == 4) {
					local864 = (150 - Static106.anIntArray240[local630]) * (Static30.aClass5_Sub2_Sub8_1.method1333(local771) + 100) / 150;
					Static42.method806(arg2 + Static36.anInt786 - 50, arg1, Static36.anInt786 + arg2 + 50, arg1 + arg0);
					Static30.aClass5_Sub2_Sub8_1.method1334(local771, Static36.anInt786 + arg2 + 50 - local864, arg1 + Static192.anInt3781, local791, 0);
					Static42.method812(arg2, arg1, arg3 + arg2, arg0 + arg1);
				}
				if (Static106.anIntArray244[local630] == 5) {
					@Pc(1149) int local1149 = 0;
					local864 = 150 - Static106.anIntArray240[local630];
					Static42.method806(arg2, Static192.anInt3781 + arg1 - Static30.aClass5_Sub2_Sub8_1.anInt1726 - 1, arg2 + arg3, Static192.anInt3781 + arg1 + 5);
					if (local864 < 25) {
						local1149 = local864 - 25;
					} else if (local864 > 125) {
						local1149 = local864 - 125;
					}
					Static30.aClass5_Sub2_Sub8_1.method1350(local771, arg2 + Static36.anInt786, Static192.anInt3781 + arg1 - -local1149, local791, 0);
					Static42.method812(arg2, arg1, arg2 + arg3, arg1 + arg0);
				}
			} else {
				Static30.aClass5_Sub2_Sub8_1.method1350(local771, Static36.anInt786 + arg2, Static192.anInt3781 + arg1, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIZI)V")
	public static void method3116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 - arg5 >= Static27.anInt493 && Static72.anInt1572 >= arg4 + arg5 && Static173.anInt3464 <= arg1 - arg5 && arg1 + arg5 <= Static174.anInt3493) {
			Static211.method3123(arg0, arg1, arg2, arg3, arg4, arg5);
		} else {
			Static116.method1864(arg2, arg1, arg0, arg4, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method3117() {
		Static123.aClass5_Sub2_Sub10_Sub1_4.method2414(0, 0);
		Static43.aClass5_Sub2_Sub10_Sub1_1.method2414(382, 0);
		Static130.aClass47_4.method2016(382 - Static130.aClass47_4.anInt2707 / 2, 18);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(I)V")
	public static void method3118() {
		Static93.aByteArrayArrayArray11 = null;
		Static8.anIntArray15 = null;
		Static165.aByteArrayArrayArray9 = null;
		Static168.aByteArrayArrayArray14 = null;
		Static133.anIntArray302 = null;
		Static128.aByteArrayArrayArray10 = null;
		Static83.aByteArrayArrayArray5 = null;
		Static58.anIntArray126 = null;
		Static76.anIntArray149 = null;
		Static105.anIntArrayArrayArray8 = null;
		Static110.anIntArray256 = null;
	}
}
