import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!i", name = "i", descriptor = "[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] aClass8_Sub1_Sub3_Sub2Array6;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!ic;")
	private static Class34 aClass34_687 = Static56.method816("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!i", name = "c", descriptor = "I")
	public static final int anInt1362 = 0;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "Lclient!ic;")
	private static Class34 aClass34_688 = Static56.method816("<col=ff7000>");

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_689 = Static56.method816("gr-Un:");

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_690 = aClass34_687;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	public static int anInt1363 = 127;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_691 = Static56.method816("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!i", name = "k", descriptor = "Lclient!ic;")
	public static Class34 aClass34_692 = Static56.method816("mapedge");

	@OriginalMember(owner = "client!i", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_693 = Static56.method816("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!i", name = "o", descriptor = "I")
	public static final int anInt1367 = 2301979;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method775() {
		aClass34_692 = null;
		aClass8_Sub1_Sub3_Sub2Array6 = null;
		aClass34_693 = null;
		aClass34_690 = null;
		aClass34_688 = null;
		aClass34_689 = null;
		aClass34_687 = null;
		aClass34_691 = null;
		aByteArrayArrayArray3 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIBILclient!t;)V")
	public static void method776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class8_Sub1_Sub3_Sub3 arg4) {
		@Pc(11) int local11 = arg3 * arg3 + arg2 * arg2;
		if (local11 <= 4225 || local11 >= 90000) {
			Static69.method1041(arg2, arg3, arg1, arg0, arg4);
			return;
		}
		@Pc(24) int local24 = Static72.anInt1744 + Static111.anInt3027 & 0x7FF;
		@Pc(28) int local28 = Class8_Sub1_Sub3_Sub1.anIntArray38[local24];
		@Pc(36) int local36 = local28 * 256 / (Static47.anInt1268 + 256);
		@Pc(40) int local40 = Class8_Sub1_Sub3_Sub1.anIntArray40[local24];
		@Pc(48) int local48 = local40 * 256 / (Static47.anInt1268 + 256);
		@Pc(59) int local59 = arg2 * local36 + arg3 * local48 >> 16;
		@Pc(70) int local70 = local48 * arg2 - local36 * arg3 >> 16;
		@Pc(76) double local76 = Math.atan2((double) local59, (double) local70);
		@Pc(82) int local82 = (int) (Math.sin(local76) * 63.0D);
		@Pc(88) int local88 = (int) (Math.cos(local76) * 57.0D);
		Static59.aClass8_Sub1_Sub3_Sub3_2.method1574(local82 + arg1 + 94 - 6, -local88 + arg0 + 63, local76);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IBIII)V")
	public static void method777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static82.anInt1977 = 0;
		@Pc(76) int local76;
		for (@Pc(9) int local9 = -1; local9 < Static41.anInt986 + Static94.anInt2223; local9++) {
			@Pc(24) Class8_Sub1_Sub1_Sub4 local24;
			if (local9 == -1) {
				local24 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1;
			} else if (Static41.anInt986 > local9) {
				local24 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[Static29.anIntArray109[local9]];
			} else {
				local24 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[Static50.anIntArray164[local9 - Static41.anInt986]];
			}
			if (local24 != null && local24.method1221()) {
				@Pc(56) Class8_Sub1_Sub16 local56;
				if (local24 instanceof Class8_Sub1_Sub1_Sub4_Sub2) {
					local56 = ((Class8_Sub1_Sub1_Sub4_Sub2) local24).aClass8_Sub1_Sub16_1;
					if (local56.anIntArray331 != null) {
						local56 = local56.method1503();
					}
					if (local56 == null) {
						continue;
					}
				}
				if (Static41.anInt986 <= local9) {
					local56 = ((Class8_Sub1_Sub1_Sub4_Sub2) local24).aClass8_Sub1_Sub16_1;
					if (local56.anIntArray331 != null) {
						local56 = local56.method1503();
					}
					if (local56.anInt2427 >= 0 && Static58.aClass8_Sub1_Sub3_Sub3Array22.length > local56.anInt2427) {
						Static87.method1307(local24.anInt2046 + 15, local24);
						if (Static87.anInt2186 > -1) {
							Static58.aClass8_Sub1_Sub3_Sub3Array22[local56.anInt2427].method1587(arg2 + Static87.anInt2186 - 12, arg3 - -Static125.anInt2997 - 30);
						}
					}
					if (Static1.anInt24 == 1 && Static50.anIntArray164[local9 - Static41.anInt986] == Static87.anInt2184 && Static21.anInt655 % 20 < 10) {
						Static87.method1307(local24.anInt2046 + 15, local24);
						if (Static87.anInt2186 > -1) {
							Static59.aClass8_Sub1_Sub3_Sub3Array24[0].method1587(arg2 + Static87.anInt2186 - 12, Static125.anInt2997 + -28 + arg3);
						}
					}
				} else {
					local76 = 30;
					@Pc(79) Class8_Sub1_Sub1_Sub4_Sub1 local79 = (Class8_Sub1_Sub1_Sub4_Sub1) local24;
					if (local79.anInt1289 != -1 || local79.anInt1263 != -1) {
						Static87.method1307(local24.anInt2046 + 15, local24);
						if (Static87.anInt2186 > -1) {
							if (local79.anInt1289 != -1) {
								Static7.aClass8_Sub1_Sub3_Sub3Array1[local79.anInt1289].method1587(Static87.anInt2186 + arg2 - 12, arg3 + Static125.anInt2997 + -30);
								local76 += 25;
							}
							if (local79.anInt1263 != -1) {
								Static58.aClass8_Sub1_Sub3_Sub3Array22[local79.anInt1263].method1587(Static87.anInt2186 + arg2 - 12, -local76 + Static125.anInt2997 + arg3);
								local76 += 25;
							}
						}
					}
					if (local9 >= 0 && Static1.anInt24 == 10 && Static134.anInt3168 == Static29.anIntArray109[local9]) {
						Static87.method1307(local24.anInt2046 + 15, local24);
						if (Static87.anInt2186 > -1) {
							Static59.aClass8_Sub1_Sub3_Sub3Array24[1].method1587(Static87.anInt2186 + arg2 - 12, Static125.anInt2997 + (arg3 - local76));
						}
					}
				}
				if (local24.aClass34_919 != null && (local9 >= Static41.anInt986 || Static112.anInt2506 == 0 || Static112.anInt2506 == 3 || Static112.anInt2506 == 1 && Static111.method1993(((Class8_Sub1_Sub1_Sub4_Sub1) local24).aClass34_638))) {
					Static87.method1307(local24.anInt2046, local24);
					if (Static87.anInt2186 > -1 && Static82.anInt1977 < Static4.anInt58) {
						Static4.anIntArray10[Static82.anInt1977] = Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1766(local24.aClass34_919) / 2;
						Static4.anIntArray6[Static82.anInt1977] = Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.anInt2723;
						Static4.anIntArray9[Static82.anInt1977] = Static87.anInt2186;
						Static4.anIntArray11[Static82.anInt1977] = Static125.anInt2997;
						Static4.anIntArray7[Static82.anInt1977] = local24.anInt2011;
						Static4.anIntArray8[Static82.anInt1977] = local24.anInt2049;
						Static4.anIntArray5[Static82.anInt1977] = local24.anInt2035;
						Static4.aClass34Array1[Static82.anInt1977] = local24.aClass34_919;
						Static82.anInt1977++;
					}
				}
				if (Static21.anInt655 < local24.anInt2008) {
					Static87.method1307(local24.anInt2046 + 15, local24);
					if (Static87.anInt2186 > -1) {
						local76 = local24.anInt2018 * 30 / local24.anInt2019;
						if (local76 > 30) {
							local76 = 30;
						}
						Static110.method1729(arg2 + Static87.anInt2186 - 15, Static125.anInt2997 + -3 + arg3, local76, 5, 65280);
						Static110.method1729(arg2 + Static87.anInt2186 + local76 - 15, arg3 - -Static125.anInt2997 + -3, 30 - local76, 5, 16711680);
					}
				}
				for (local76 = 0; local76 < 4; local76++) {
					if (local24.anIntArray263[local76] > Static21.anInt655) {
						Static87.method1307(local24.anInt2046 / 2, local24);
						if (Static87.anInt2186 > -1) {
							if (local76 == 1) {
								Static125.anInt2997 -= 20;
							}
							if (local76 == 2) {
								Static125.anInt2997 -= 10;
								Static87.anInt2186 -= 15;
							}
							if (local76 == 3) {
								Static125.anInt2997 -= 10;
								Static87.anInt2186 += 15;
							}
							Static61.aClass8_Sub1_Sub3_Sub3Array25[local24.anIntArray264[local76]].method1587(arg2 + Static87.anInt2186 - 12, Static125.anInt2997 + -12 + arg3);
							Static18.aClass8_Sub1_Sub3_Sub4_Sub1_1.method1753(Static44.method672(local24.anIntArray261[local76]), arg2 + Static87.anInt2186 - 1, Static125.anInt2997 + 3 + arg3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(543) int local543 = 0; local543 < Static82.anInt1977; local543++) {
			local76 = Static4.anIntArray9[local543];
			@Pc(553) int local553 = Static4.anIntArray11[local543];
			@Pc(557) int local557 = Static4.anIntArray10[local543];
			@Pc(561) int local561 = Static4.anIntArray6[local543];
			@Pc(563) boolean local563 = true;
			while (local563) {
				local563 = false;
				for (@Pc(569) int local569 = 0; local569 < local543; local569++) {
					if (Static4.anIntArray11[local569] - Static4.anIntArray6[local569] < local553 + 2 && local553 - local561 < Static4.anIntArray11[local569] + 2 && Static4.anIntArray10[local569] + Static4.anIntArray9[local569] > local76 - local557 && local76 + local557 > Static4.anIntArray9[local569] + -Static4.anIntArray10[local569] && local553 > Static4.anIntArray11[local569] - Static4.anIntArray6[local569]) {
						local563 = true;
						local553 = Static4.anIntArray11[local569] - Static4.anIntArray6[local569];
					}
				}
			}
			Static87.anInt2186 = Static4.anIntArray9[local543];
			Static125.anInt2997 = Static4.anIntArray11[local543] = local553;
			@Pc(658) Class34 local658 = Static4.aClass34Array1[local543];
			if (Static54.anInt1368 == 0) {
				@Pc(662) int local662 = 16776960;
				if (Static4.anIntArray7[local543] < 6) {
					local662 = Static54.anIntArray171[Static4.anIntArray7[local543]];
				}
				if (Static4.anIntArray7[local543] == 6) {
					local662 = Static48.anInt2953 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static4.anIntArray7[local543] == 7) {
					local662 = Static48.anInt2953 % 20 < 10 ? 255 : 65535;
				}
				if (Static4.anIntArray7[local543] == 8) {
					local662 = Static48.anInt2953 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(735) int local735;
				if (Static4.anIntArray7[local543] == 9) {
					local735 = 150 - Static4.anIntArray5[local543];
					if (local735 < 50) {
						local662 = local735 * 1280 + 16711680;
					} else if (local735 < 100) {
						local662 = 16776960 + 16384000 - local735 * 327680;
					} else if (local735 < 150) {
						local662 = (local735 - 100) * 5 + 65280;
					}
				}
				if (Static4.anIntArray7[local543] == 10) {
					local735 = 150 - Static4.anIntArray5[local543];
					if (local735 < 50) {
						local662 = local735 * 5 + 16711680;
					} else if (local735 < 100) {
						local662 = 16711935 - (local735 - 50) * 327680;
					} else if (local735 < 150) {
						local662 = local735 * 327680 + 255 + 500 - local735 * 5 - 32768000;
					}
				}
				if (Static4.anIntArray7[local543] == 11) {
					local735 = 150 - Static4.anIntArray5[local543];
					if (local735 < 50) {
						local662 = 16777215 - local735 * 327685;
					} else if (local735 < 100) {
						local662 = (local735 - 50) * 327685 + 65280;
					} else if (local735 < 150) {
						local662 = 16777215 - (local735 - 100) * 327680;
					}
				}
				if (Static4.anIntArray8[local543] == 0) {
					Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1753(local658, arg2 + Static87.anInt2186, arg3 + Static125.anInt2997, local662, 0);
				}
				if (Static4.anIntArray8[local543] == 1) {
					Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1761(local658, arg2 + Static87.anInt2186, Static125.anInt2997 + arg3, local662, Static48.anInt2953);
				}
				if (Static4.anIntArray8[local543] == 2) {
					Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1745(local658, Static87.anInt2186 + arg2, Static125.anInt2997 + arg3, local662, Static48.anInt2953);
				}
				if (Static4.anIntArray8[local543] == 3) {
					Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1758(local658, arg2 + Static87.anInt2186, arg3 - -Static125.anInt2997, local662, Static48.anInt2953, 150 - Static4.anIntArray5[local543]);
				}
				if (Static4.anIntArray8[local543] == 4) {
					local735 = (150 - Static4.anIntArray5[local543]) * (Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1766(local658) + 100) / 150;
					Static110.method1733(arg2 + Static87.anInt2186 - 50, arg3, arg2 + Static87.anInt2186 + 50, arg3 + arg1);
					Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1741(local658, Static87.anInt2186 + arg2 + 50 - local735, arg3 + Static125.anInt2997, local662, 0);
					Static110.method1721(arg2, arg3, arg2 + arg0, arg3 + arg1);
				}
				if (Static4.anIntArray8[local543] == 5) {
					local735 = 150 - Static4.anIntArray5[local543];
					@Pc(1049) int local1049 = 0;
					Static110.method1733(arg2, arg3 + Static125.anInt2997 - Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.anInt2723 - 1, arg0 + arg2, arg3 + Static125.anInt2997 + 5);
					if (local735 < 25) {
						local1049 = local735 - 25;
					} else if (local735 > 125) {
						local1049 = local735 - 125;
					}
					Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1753(local658, arg2 + Static87.anInt2186, arg3 - -Static125.anInt2997 + local1049, local662, 0);
					Static110.method1721(arg2, arg3, arg0 + arg2, arg3 + arg1);
				}
			} else {
				Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1753(local658, arg2 + Static87.anInt2186, arg3 - -Static125.anInt2997, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(III)Lclient!ic;")
	public static Class34 method778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return Static104.aClass34_1119;
		} else if (local7 < -6) {
			return Static16.aClass34_224;
		} else if (local7 < -3) {
			return aClass34_688;
		} else if (local7 < 0) {
			return Static93.aClass34_1024;
		} else if (local7 > 9) {
			return Static96.aClass34_279;
		} else if (local7 > 6) {
			return Static94.aClass34_1038;
		} else if (local7 > 3) {
			return Static60.aClass34_755;
		} else if (local7 > 0) {
			return Static129.aClass34_1404;
		} else {
			return Static4.aClass34_29;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
	public static void method779() {
		Static106.anInt2456 = 1;
		Static60.anInt1574 = -1;
		Static69.aClass14_18 = null;
		Static108.anInt2488 = 0;
		Static125.anInt3000 = -1;
		Static39.anInt956 = 2;
		Static92.aBoolean85 = false;
	}
}
