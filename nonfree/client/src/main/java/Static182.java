import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "[I")
	public static int[] anIntArray436;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	public static int anInt4080;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "Lclient!qa;")
	public static Class4_Sub1_Sub16 aClass4_Sub1_Sub16_1;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_49 = new Class66(64);

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_1491 = Static177.method3050("No response from server)3");

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1490 = aClass46_1491;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_1492 = Static177.method3050("Einloggen");

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	public static int anInt4081 = 0;

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
	public static int anInt4082 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public static void method3121() {
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(37) int local37;
		@Pc(29) int local29;
		@Pc(41) int local41;
		@Pc(60) Class4_Sub1_Sub1_Sub7 local60;
		if (Static55.anInt1368 == 138) {
			local19 = Static162.aClass4_Sub11_Sub1_3.method1235();
			local23 = Static162.aClass4_Sub11_Sub1_3.method1228();
			local29 = Static172.anInt3875 + (local23 & 0x7);
			local37 = (local23 >> 4 & 0x7) + Static93.anInt2387;
			local41 = Static162.aClass4_Sub11_Sub1_3.method1235();
			if (local37 >= 0 && local29 >= 0 && local37 < 104 && local29 < 104) {
				local60 = new Class4_Sub1_Sub1_Sub7();
				local60.anInt1983 = local19;
				local60.anInt1988 = local41;
				if (Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local37][local29] == null) {
					Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local37][local29] = new Class11();
				}
				Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local37][local29].method272(local60);
				Static147.method478(local29, local37);
			}
			return;
		}
		@Pc(135) int local135;
		if (Static55.anInt1368 == 211) {
			local19 = Static162.aClass4_Sub11_Sub1_3.method1253();
			local23 = (local19 >> 4 & 0x7) + Static93.anInt2387;
			local37 = Static172.anInt3875 + (local19 & 0x7);
			local29 = Static162.aClass4_Sub11_Sub1_3.method1252();
			local41 = Static162.aClass4_Sub11_Sub1_3.method1252();
			local135 = Static162.aClass4_Sub11_Sub1_3.method1252();
			if (local23 >= 0 && local37 >= 0 && local23 < 104 && local37 < 104) {
				@Pc(158) Class11 local158 = Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local23][local37];
				if (local158 != null) {
					for (@Pc(165) Class4_Sub1_Sub1_Sub7 local165 = (Class4_Sub1_Sub1_Sub7) local158.method274(); local165 != null; local165 = (Class4_Sub1_Sub1_Sub7) local158.method271()) {
						if (local165.anInt1988 == (local29 & 0x7FFF) && local165.anInt1983 == local41) {
							local165.anInt1983 = local135;
							break;
						}
					}
					Static147.method478(local37, local23);
				}
			}
			return;
		}
		@Pc(239) int local239;
		@Pc(245) int local245;
		@Pc(251) int local251;
		@Pc(259) int local259;
		@Pc(263) int local263;
		@Pc(267) int local267;
		@Pc(255) int local255;
		if (Static55.anInt1368 == 19) {
			local19 = Static162.aClass4_Sub11_Sub1_3.method1253();
			local23 = (local19 >> 4 & 0x7) + Static93.anInt2387;
			local37 = Static172.anInt3875 + (local19 & 0x7);
			local29 = Static162.aClass4_Sub11_Sub1_3.method1241() + local23;
			local41 = local37 + Static162.aClass4_Sub11_Sub1_3.method1241();
			local135 = Static162.aClass4_Sub11_Sub1_3.method1227();
			local239 = Static162.aClass4_Sub11_Sub1_3.method1252();
			local245 = Static162.aClass4_Sub11_Sub1_3.method1253() * 4;
			local251 = Static162.aClass4_Sub11_Sub1_3.method1253() * 4;
			local255 = Static162.aClass4_Sub11_Sub1_3.method1252();
			local259 = Static162.aClass4_Sub11_Sub1_3.method1252();
			local263 = Static162.aClass4_Sub11_Sub1_3.method1253();
			local267 = Static162.aClass4_Sub11_Sub1_3.method1253();
			if (local23 >= 0 && local37 >= 0 && local23 < 104 && local37 < 104 && local29 >= 0 && local41 >= 0 && local29 < 104 && local41 < 104 && local239 != 65535) {
				local29 = local29 * 128 + 64;
				local41 = local41 * 128 + 64;
				local37 = local37 * 128 + 64;
				local23 = local23 * 128 + 64;
				@Pc(352) Class4_Sub1_Sub1_Sub3 local352 = new Class4_Sub1_Sub1_Sub3(local239, Static73.anInt1873, local23, local37, Static106.method1998(local23, Static73.anInt1873, local37) - local245, local255 - -Static142.anInt3325, Static142.anInt3325 + local259, local263, local267, local135, local251);
				local352.method545(local29, Static106.method1998(local29, Static73.anInt1873, local41) - local251, Static142.anInt3325 + local255, local41);
				Static29.aClass11_3.method272(local352);
			}
			return;
		}
		if (Static55.anInt1368 == 93) {
			local19 = Static162.aClass4_Sub11_Sub1_3.method1253();
			local23 = Static93.anInt2387 + (local19 >> 4 & 0x7);
			local37 = Static172.anInt3875 + (local19 & 0x7);
			local29 = Static162.aClass4_Sub11_Sub1_3.method1252();
			local41 = Static162.aClass4_Sub11_Sub1_3.method1253();
			local135 = local41 >> 4 & 0xF;
			if (local29 == 65535) {
				local29 = -1;
			}
			local239 = local41 & 0x7;
			local245 = Static162.aClass4_Sub11_Sub1_3.method1253();
			if (local23 >= 0 && local37 >= 0 && local23 < 104 && local37 < 104) {
				local251 = local135 + 1;
				if (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0] >= local23 - local251 && local251 + local23 >= Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0] && Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0] >= local37 - local251 && Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0] <= local251 + local37 && Static122.anInt2962 != 0 && local239 > 0 && Static57.anInt1406 < 50 && local29 != -1) {
					Static50.anIntArray124[Static57.anInt1406] = local29;
					Static67.anIntArray168[Static57.anInt1406] = local239;
					Static186.anIntArray438[Static57.anInt1406] = local245;
					Static6.aClass13Array1[Static57.anInt1406] = null;
					Static91.anIntArray223[Static57.anInt1406] = local135 + (local23 << 16) + (local37 << 8);
					Static57.anInt1406++;
				}
			}
		}
		if (Static55.anInt1368 == 193) {
			local19 = Static162.aClass4_Sub11_Sub1_3.method1228();
			local23 = local19 >> 2;
			local29 = Static45.anIntArray95[local23];
			local37 = local19 & 0x3;
			local41 = Static162.aClass4_Sub11_Sub1_3.method1228();
			local135 = (local41 >> 4 & 0x7) + Static93.anInt2387;
			local239 = Static172.anInt3875 + (local41 & 0x7);
			if (local135 >= 0 && local239 >= 0 && local135 < 104 && local239 < 104) {
				Static42.method714(Static73.anInt1873, -1, -1, 0, local135, local37, local239, local23, local29);
			}
		} else if (Static55.anInt1368 == 71) {
			local19 = Static162.aClass4_Sub11_Sub1_3.method1252();
			local23 = Static162.aClass4_Sub11_Sub1_3.method1253();
			local29 = Static172.anInt3875 + (local23 & 0x7);
			local37 = Static93.anInt2387 + (local23 >> 4 & 0x7);
			local41 = Static162.aClass4_Sub11_Sub1_3.method1221();
			local239 = local41 & 0x3;
			local135 = local41 >> 2;
			local245 = Static45.anIntArray95[local135];
			if (local37 >= 0 && local29 >= 0 && local37 < 103 && local29 < 103) {
				if (local245 == 0) {
					@Pc(666) Class24 local666 = Static166.method2757(Static73.anInt1873, local37, local29);
					if (local666 != null) {
						local255 = (int) (local666.aLong36 >>> 32) & Integer.MAX_VALUE;
						if (local135 == 2) {
							local666.aClass4_Sub1_Sub1_2 = new Class4_Sub1_Sub1_Sub2(local255, 2, local239 + 4, Static73.anInt1873, local37, local29, local19, false, local666.aClass4_Sub1_Sub1_2);
							local666.aClass4_Sub1_Sub1_3 = new Class4_Sub1_Sub1_Sub2(local255, 2, local239 + 1 & 0x3, Static73.anInt1873, local37, local29, local19, false, local666.aClass4_Sub1_Sub1_3);
						} else {
							local666.aClass4_Sub1_Sub1_2 = new Class4_Sub1_Sub1_Sub2(local255, local135, local239, Static73.anInt1873, local37, local29, local19, false, local666.aClass4_Sub1_Sub1_2);
						}
					}
				}
				if (local245 == 1) {
					@Pc(740) Class65 local740 = Static88.method1739(Static73.anInt1873, local37, local29);
					if (local740 != null) {
						local255 = Integer.MAX_VALUE & (int) (local740.aLong107 >>> 32);
						if (local135 == 4 || local135 == 5) {
							local740.aClass4_Sub1_Sub1_6 = new Class4_Sub1_Sub1_Sub2(local255, 4, local239, Static73.anInt1873, local37, local29, local19, false, local740.aClass4_Sub1_Sub1_6);
						} else if (local135 == 6) {
							local740.aClass4_Sub1_Sub1_6 = new Class4_Sub1_Sub1_Sub2(local255, 4, local239 + 4, Static73.anInt1873, local37, local29, local19, false, local740.aClass4_Sub1_Sub1_6);
						} else if (local135 == 7) {
							local740.aClass4_Sub1_Sub1_6 = new Class4_Sub1_Sub1_Sub2(local255, 4, (local239 + 2 & 0x3) + 4, Static73.anInt1873, local37, local29, local19, false, local740.aClass4_Sub1_Sub1_6);
						} else if (local135 == 8) {
							local740.aClass4_Sub1_Sub1_6 = new Class4_Sub1_Sub1_Sub2(local255, 4, local239 + 4, Static73.anInt1873, local37, local29, local19, false, local740.aClass4_Sub1_Sub1_6);
							local740.aClass4_Sub1_Sub1_5 = new Class4_Sub1_Sub1_Sub2(local255, 4, (local239 + 2 & 0x3) + 4, Static73.anInt1873, local37, local29, local19, false, local740.aClass4_Sub1_Sub1_5);
						}
					}
				}
				if (local245 == 2) {
					if (local135 == 11) {
						local135 = 10;
					}
					@Pc(883) Class86 local883 = Static175.method3013(Static73.anInt1873, local37, local29);
					if (local883 != null) {
						local883.aClass4_Sub1_Sub1_10 = new Class4_Sub1_Sub1_Sub2(Integer.MAX_VALUE & (int) (local883.aLong129 >>> 32), local135, local239, Static73.anInt1873, local37, local29, local19, false, local883.aClass4_Sub1_Sub1_10);
					}
				}
				if (local245 == 3) {
					@Pc(916) Class17 local916 = Static39.method694(Static73.anInt1873, local37, local29);
					if (local916 != null) {
						local916.aClass4_Sub1_Sub1_1 = new Class4_Sub1_Sub1_Sub2(Integer.MAX_VALUE & (int) (local916.aLong19 >>> 32), 22, local239, Static73.anInt1873, local37, local29, local19, false, local916.aClass4_Sub1_Sub1_1);
					}
				}
			}
		} else if (Static55.anInt1368 == 174) {
			local19 = Static162.aClass4_Sub11_Sub1_3.method1235();
			local23 = Static162.aClass4_Sub11_Sub1_3.method1224();
			local37 = Static162.aClass4_Sub11_Sub1_3.method1235();
			local29 = Static162.aClass4_Sub11_Sub1_3.method1228();
			local135 = Static172.anInt3875 + (local29 & 0x7);
			local41 = (local29 >> 4 & 0x7) + Static93.anInt2387;
			if (local41 >= 0 && local135 >= 0 && local41 < 104 && local135 < 104 && local37 != Static151.anInt3441) {
				@Pc(1005) Class4_Sub1_Sub1_Sub7 local1005 = new Class4_Sub1_Sub1_Sub7();
				local1005.anInt1983 = local23;
				local1005.anInt1988 = local19;
				if (Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local41][local135] == null) {
					Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local41][local135] = new Class11();
				}
				Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local41][local135].method272(local1005);
				Static147.method478(local135, local41);
			}
		} else if (Static55.anInt1368 == 85) {
			local19 = Static162.aClass4_Sub11_Sub1_3.method1253();
			local37 = Static172.anInt3875 + (local19 & 0x7);
			local23 = (local19 >> 4 & 0x7) + Static93.anInt2387;
			local29 = Static162.aClass4_Sub11_Sub1_3.method1252();
			local41 = Static162.aClass4_Sub11_Sub1_3.method1253();
			local135 = Static162.aClass4_Sub11_Sub1_3.method1252();
			if (local23 >= 0 && local37 >= 0 && local23 < 104 && local37 < 104) {
				local23 = local23 * 128 + 64;
				local37 = local37 * 128 + 64;
				@Pc(1121) Class4_Sub1_Sub1_Sub5 local1121 = new Class4_Sub1_Sub1_Sub5(local29, Static73.anInt1873, local23, local37, Static106.method1998(local23, Static73.anInt1873, local37) - local41, local135, Static142.anInt3325);
				Static103.aClass11_10.method272(local1121);
			}
		} else if (Static55.anInt1368 == 7) {
			local19 = Static162.aClass4_Sub11_Sub1_3.method1271();
			local23 = Static93.anInt2387 + (local19 >> 4 & 0x7);
			local37 = (local19 & 0x7) + Static172.anInt3875;
			local29 = Static162.aClass4_Sub11_Sub1_3.method1221();
			local41 = local29 >> 2;
			local135 = local29 & 0x3;
			local239 = Static45.anIntArray95[local41];
			local245 = Static162.aClass4_Sub11_Sub1_3.method1275();
			if (local23 >= 0 && local37 >= 0 && local23 < 104 && local37 < 104) {
				Static42.method714(Static73.anInt1873, local245, -1, 0, local23, local135, local37, local41, local239);
			}
		} else {
			if (Static55.anInt1368 == 160) {
				local19 = Static162.aClass4_Sub11_Sub1_3.method1252();
				@Pc(1210) byte local1210 = Static162.aClass4_Sub11_Sub1_3.method1241();
				@Pc(1214) byte local1214 = Static162.aClass4_Sub11_Sub1_3.method1241();
				@Pc(1218) byte local1218 = Static162.aClass4_Sub11_Sub1_3.method1244();
				local41 = Static162.aClass4_Sub11_Sub1_3.method1271();
				local135 = local41 >> 2;
				local239 = local41 & 0x3;
				local245 = Static45.anIntArray95[local135];
				local251 = Static162.aClass4_Sub11_Sub1_3.method1252();
				@Pc(1242) byte local1242 = Static162.aClass4_Sub11_Sub1_3.method1241();
				local259 = Static162.aClass4_Sub11_Sub1_3.method1252();
				local263 = Static162.aClass4_Sub11_Sub1_3.method1271();
				@Pc(1256) int local1256 = Static172.anInt3875 + (local263 & 0x7);
				local267 = Static93.anInt2387 + (local263 >> 4 & 0x7);
				@Pc(1268) int local1268 = Static162.aClass4_Sub11_Sub1_3.method1235();
				@Pc(1275) Class4_Sub1_Sub1_Sub1_Sub1 local1275;
				if (Static151.anInt3441 == local259) {
					local1275 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1;
				} else {
					local1275 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local259];
				}
				if (local1275 != null) {
					@Pc(1285) Class4_Sub1_Sub19 local1285 = Static113.method2090(local1268);
					@Pc(1296) int local1296;
					@Pc(1299) int local1299;
					if (local239 == 1 || local239 == 3) {
						local1296 = local1285.anInt4187;
						local1299 = local1285.anInt4191;
					} else {
						local1299 = local1285.anInt4187;
						local1296 = local1285.anInt4191;
					}
					@Pc(1316) int local1316 = local1256 + (local1299 + 1 >> 1);
					@Pc(1322) int local1322 = local267 + (local1296 >> 1);
					@Pc(1326) int[][] local1326 = Static112.anIntArrayArrayArray42[Static73.anInt1873];
					@Pc(1334) int local1334 = local267 + (local1296 + 1 >> 1);
					@Pc(1342) int local1342 = (local1299 << 6) + (local1256 << 7);
					@Pc(1349) int local1349 = local1256 + (local1299 >> 1);
					@Pc(1357) int local1357 = (local267 << 7) + (local1296 << 6);
					@Pc(1384) int local1384 = local1326[local1322][local1316] + local1326[local1334][local1349] + local1326[local1322][local1349] + local1326[local1334][local1316] >> 2;
					@Pc(1394) Class4_Sub1_Sub1_Sub4 local1394 = local1285.method3190(local239, local1357, local1342, local135, local1384, local1326);
					if (local1394 != null) {
						Static42.method714(Static73.anInt1873, -1, local251 + 1, local19 + 1, local267, 0, local1256, 0, local245);
						local1275.anInt2104 = local251 + Static142.anInt3325;
						local1275.anInt2101 = local1296 * 64 + local267 * 128;
						local1275.anInt2113 = local1299 * 64 + local1256 * 128;
						local1275.aClass4_Sub1_Sub1_Sub4_1 = local1394;
						local1275.anInt2106 = local1384;
						@Pc(1450) byte local1450;
						if (local1210 < local1242) {
							local1450 = local1242;
							local1242 = local1210;
							local1210 = local1450;
						}
						local1275.anInt2111 = local1242 + local267;
						local1275.anInt2109 = Static142.anInt3325 + local19;
						if (local1218 < local1214) {
							local1450 = local1214;
							local1214 = local1218;
							local1218 = local1450;
						}
						local1275.anInt2102 = local267 + local1210;
						local1275.anInt2105 = local1214 + local1256;
						local1275.anInt2099 = local1218 + local1256;
					}
				}
			}
			if (Static55.anInt1368 == 163) {
				local19 = Static162.aClass4_Sub11_Sub1_3.method1224();
				local23 = Static162.aClass4_Sub11_Sub1_3.method1253();
				local29 = Static172.anInt3875 + (local23 & 0x7);
				local37 = (local23 >> 4 & 0x7) + Static93.anInt2387;
				if (local37 >= 0 && local29 >= 0 && local37 < 104 && local29 < 104) {
					@Pc(1541) Class11 local1541 = Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local37][local29];
					if (local1541 != null) {
						for (local60 = (Class4_Sub1_Sub1_Sub7) local1541.method274(); local60 != null; local60 = (Class4_Sub1_Sub1_Sub7) local1541.method271()) {
							if (local60.anInt1988 == (local19 & 0x7FFF)) {
								local60.method3173();
								break;
							}
						}
						if (local1541.method274() == null) {
							Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local37][local29] = null;
						}
						Static147.method478(local29, local37);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public static void method3123(@OriginalArg(1) int arg0) {
		Static179.anInt4002 += arg0 * 128;
		@Pc(31) int local31;
		if (Static179.anInt4002 > Static84.anIntArray440.length) {
			Static179.anInt4002 -= Static84.anIntArray440.length;
			local31 = (int) (Math.random() * 12.0D);
			Static149.method2554(Static39.aClass4_Sub1_Sub7_Sub3Array3[local31]);
		}
		local31 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(48) int local48 = (256 - arg0) * 128;
		@Pc(79) int local79;
		for (@Pc(55) int local55 = 0; local55 < local48; local55++) {
			local79 = Static124.anIntArray281[local42 + local31] - arg0 * Static84.anIntArray440[Static84.anIntArray440.length - 1 & local31 + Static179.anInt4002] / 6;
			if (local79 < 0) {
				local79 = 0;
			}
			Static124.anIntArray281[local31++] = local79;
		}
		@Pc(106) int local106;
		@Pc(108) int local108;
		@Pc(115) int local115;
		for (local79 = 256 - arg0; local79 < 256; local79++) {
			local106 = local79 * 128;
			for (local108 = 0; local108 < 128; local108++) {
				local115 = (int) (Math.random() * 100.0D);
				if (local115 < 50 && local108 > 10 && local108 < 118) {
					Static124.anIntArray281[local106 + local108] = 255;
				} else {
					Static124.anIntArray281[local108 + local106] = 0;
				}
			}
		}
		if (Static117.anInt2874 > 0) {
			Static117.anInt2874 -= arg0 * 4;
		}
		if (Static45.anInt1122 > 0) {
			Static45.anInt1122 -= arg0 * 4;
		}
		if (Static117.anInt2874 == 0 && Static45.anInt1122 == 0) {
			local106 = (int) ((double) (2000 / arg0) * Math.random());
			if (local106 == 1) {
				Static45.anInt1122 = 1024;
			}
			if (local106 == 0) {
				Static117.anInt2874 = 1024;
			}
		}
		for (local106 = 0; local106 < 256 - arg0; local106++) {
			Static36.anIntArray85[local106] = Static36.anIntArray85[local106 + arg0];
		}
		for (local108 = 256 - arg0; local108 < 256; local108++) {
			Static36.anIntArray85[local108] = (int) (Math.sin((double) Static148.anInt3378 / 14.0D) * 16.0D + Math.sin((double) Static148.anInt3378 / 15.0D) * 14.0D + Math.sin((double) Static148.anInt3378 / 16.0D) * 12.0D);
			Static148.anInt3378++;
		}
		Static39.anInt1039 += arg0;
		local115 = ((Static142.anInt3325 & 0x1) + arg0) / 2;
		if (local115 <= 0) {
			return;
		}
		@Pc(298) int local298;
		@Pc(305) int local305;
		for (@Pc(289) int local289 = 0; local289 < Static39.anInt1039 * 100; local289++) {
			local298 = (int) (Math.random() * 124.0D) + 2;
			local305 = (int) (Math.random() * 128.0D) + 128;
			Static124.anIntArray281[local298 + (local305 << 7)] = 192;
		}
		Static39.anInt1039 = 0;
		@Pc(330) int local330;
		@Pc(335) int local335;
		for (local298 = 0; local298 < 256; local298++) {
			local330 = local298 * 128;
			local305 = 0;
			for (local335 = -local115; local335 < 128; local335++) {
				if (local115 + local335 < 128) {
					local305 += Static124.anIntArray281[local115 + local330 + local335];
				}
				if (local335 - local115 - 1 >= 0) {
					local305 -= Static124.anIntArray281[local330 + local335 - local115 - 1];
				}
				if (local335 >= 0) {
					Static164.anIntArray351[local335 + local330] = local305 / (local115 * 2 + 1);
				}
			}
		}
		for (local305 = 0; local305 < 128; local305++) {
			local330 = 0;
			for (local335 = -local115; local335 < 256; local335++) {
				@Pc(412) int local412 = local335 * 128;
				if (local115 + local335 < 256) {
					local330 += Static164.anIntArray351[local115 * 128 + local305 + local412];
				}
				if (local335 - local115 - 1 >= 0) {
					local330 -= Static164.anIntArray351[local305 + local412 - (local115 + 1) * 128];
				}
				if (local335 >= 0) {
					Static124.anIntArray281[local412 + local305] = local330 / (local115 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!jd;Lclient!nh;ILclient!jd;Lclient!nh;)Lclient!ei;")
	public static Class4_Sub1_Sub7_Sub1_Sub1 method3124(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(3) Class46 arg2, @OriginalArg(4) Class62 arg3) {
		@Pc(12) int local12 = arg1.method2859(arg0);
		@Pc(18) int local18 = arg1.method2860(local12, arg2);
		return Static58.method1102(local12, arg3, arg1, local18);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZIIILclient!a;)V")
	public static void method3125(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1 arg3) {
		if (Static123.anInt2973 >= 3) {
			Static145.method2934(arg0, arg2, arg3.anIntArray10, arg3.anIntArray1);
		} else {
			Static91.aClass4_Sub1_Sub7_Sub2_2.method2529(arg0, arg2, arg3.anInt50, arg3.anInt20, Static91.aClass4_Sub1_Sub7_Sub2_2.anInt3405 / 2, Static91.aClass4_Sub1_Sub7_Sub2_2.anInt3404 / 2, Static8.anInt297, arg3.anIntArray10, arg3.anIntArray1);
		}
		Static38.aBooleanArray5[arg1] = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	public static void method3126() {
		@Pc(3) int local3 = Static30.anIntArray65[Static120.anInt3741];
		@Pc(7) Class8[] local7 = Static30.aClass8ArrayArray1[Static120.anInt3741];
		Static147.anInt730 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class8 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt378 == 1) {
				local27 = local16.anInt371 + Static139.anInt3253 - Static100.anInt2542;
				if (local27 >= 0 && local27 <= Static139.anInt3253 + Static139.anInt3253) {
					local42 = local16.anInt364 + Static139.anInt3253 - Static63.anInt1572;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt377 + Static139.anInt3253 - Static63.anInt1572;
					if (local53 > Static139.anInt3253 + Static139.anInt3253) {
						local53 = Static139.anInt3253 + Static139.anInt3253;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static135.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static116.anInt2858 - local16.anInt376;
						if (local85 > 32) {
							local16.anInt367 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt367 = 2;
							local85 = -local85;
						}
						local16.anInt368 = (local16.anInt373 - Static83.anInt2133 << 8) / local85;
						local16.anInt372 = (local16.anInt366 - Static83.anInt2133 << 8) / local85;
						local16.anInt369 = (local16.anInt365 - Static90.anInt2341 << 8) / local85;
						local16.anInt374 = (local16.anInt379 - Static90.anInt2341 << 8) / local85;
						Static181.aClass8Array1[Static147.anInt730++] = local16;
					}
				}
			} else if (local16.anInt378 == 2) {
				local27 = local16.anInt364 + Static139.anInt3253 - Static63.anInt1572;
				if (local27 >= 0 && local27 <= Static139.anInt3253 + Static139.anInt3253) {
					local42 = local16.anInt371 + Static139.anInt3253 - Static100.anInt2542;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt375 + Static139.anInt3253 - Static100.anInt2542;
					if (local53 > Static139.anInt3253 + Static139.anInt3253) {
						local53 = Static139.anInt3253 + Static139.anInt3253;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static135.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static83.anInt2133 - local16.anInt373;
						if (local85 > 32) {
							local16.anInt367 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt367 = 4;
							local85 = -local85;
						}
						local16.anInt370 = (local16.anInt376 - Static116.anInt2858 << 8) / local85;
						local16.anInt363 = (local16.anInt360 - Static116.anInt2858 << 8) / local85;
						local16.anInt369 = (local16.anInt365 - Static90.anInt2341 << 8) / local85;
						local16.anInt374 = (local16.anInt379 - Static90.anInt2341 << 8) / local85;
						Static181.aClass8Array1[Static147.anInt730++] = local16;
					}
				}
			} else if (local16.anInt378 == 4) {
				local27 = local16.anInt365 - Static90.anInt2341;
				if (local27 > 128) {
					local42 = local16.anInt364 + Static139.anInt3253 - Static63.anInt1572;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt377 + Static139.anInt3253 - Static63.anInt1572;
					if (local53 > Static139.anInt3253 + Static139.anInt3253) {
						local53 = Static139.anInt3253 + Static139.anInt3253;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt371 + Static139.anInt3253 - Static100.anInt2542;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt375 + Static139.anInt3253 - Static100.anInt2542;
						if (local85 > Static139.anInt3253 + Static139.anInt3253) {
							local85 = Static139.anInt3253 + Static139.anInt3253;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static135.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt367 = 5;
							local16.anInt370 = (local16.anInt376 - Static116.anInt2858 << 8) / local27;
							local16.anInt363 = (local16.anInt360 - Static116.anInt2858 << 8) / local27;
							local16.anInt368 = (local16.anInt373 - Static83.anInt2133 << 8) / local27;
							local16.anInt372 = (local16.anInt366 - Static83.anInt2133 << 8) / local27;
							Static181.aClass8Array1[Static147.anInt730++] = local16;
						}
					}
				}
			}
		}
	}
}
