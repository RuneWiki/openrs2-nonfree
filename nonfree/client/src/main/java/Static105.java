import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!v", name = "l", descriptor = "Lclient!md;")
	public static Class40_Sub1 aClass40_Sub1_40;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1289 = Static34.method846("mapfunction");

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1291 = Static34.method846("glow3:");

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1290 = aClass55_1291;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "[[[Lclient!ab;")
	public static Class3[][][] aClass3ArrayArrayArray1 = new Class3[4][104][104];

	@OriginalMember(owner = "client!v", name = "h", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1292 = Static34.method846("gleiten:");

	@OriginalMember(owner = "client!v", name = "i", descriptor = "[J")
	public static long[] aLongArray6 = new long[100];

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(JI)V")
	public static void method1986(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static12.anInt712; local17++) {
			if (Static29.aLongArray3[local17] == arg0) {
				Static12.anInt712--;
				Static63.aBoolean89 = true;
				for (@Pc(37) int local37 = local17; local37 < Static12.anInt712; local37++) {
					Static29.aLongArray3[local37] = Static29.aLongArray3[local37 + 1];
				}
				Static51.aClass6_Sub1_Sub1_3.method1515(5);
				Static51.aClass6_Sub1_Sub1_3.method1463(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(JI)V")
	public static void method1987(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static64.anInt1912 >= 100 && Static55.anInt1704 != 1 || Static64.anInt1912 >= 200) {
			Static14.method510(Static34.aClass55_502, 0, Static74.aClass55_690);
			return;
		}
		@Pc(35) Class55 local35 = Static50.method2085(arg0).method1655();
		for (@Pc(37) int local37 = 0; local37 < Static64.anInt1912; local37++) {
			if (Static8.aLongArray1[local37] == arg0) {
				Static14.method510(Static34.aClass55_502, 0, Static89.method1698(new Class55[] { local35, Static97.aClass55_1195 }));
				return;
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static12.anInt712; local76++) {
			if (Static29.aLongArray3[local76] == arg0) {
				Static14.method510(Static34.aClass55_502, 0, Static89.method1698(new Class55[] { Static11.aClass55_250, local35, Static70.aClass55_834 }));
				return;
			}
		}
		if (local35.method1640(Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.aClass55_245)) {
			return;
		}
		Static68.aClass55Array18[Static64.anInt1912] = local35;
		Static8.aLongArray1[Static64.anInt1912] = arg0;
		Static102.anIntArray286[Static64.anInt1912] = 0;
		Static63.aBoolean89 = true;
		Static64.anInt1912++;
		Static51.aClass6_Sub1_Sub1_3.method1515(159);
		Static51.aClass6_Sub1_Sub1_3.method1463(arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static22.method654(arg2)) {
			Static74.method1238(Static9.aClass6_Sub2_Sub14ArrayArray1[arg2], arg5, arg0, arg1, 0, arg7, arg4, 0, arg3, arg6, -1);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method1989() {
		@Pc(14) int local14;
		@Pc(27) int local27;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(18) int local18;
		if (Static47.anInt1514 == 134) {
			local14 = Static13.aClass6_Sub1_Sub1_2.method1466();
			local18 = Static13.aClass6_Sub1_Sub1_2.method1489();
			local27 = Static34.anInt1310 + (local18 >> 4 & 0x7);
			local34 = Static87.anInt2447 + (local18 & 0x7);
			local38 = Static13.aClass6_Sub1_Sub1_2.method1500();
			if (local27 >= 0 && local34 >= 0 && local27 < 104 && local34 < 104) {
				@Pc(57) Class6_Sub2_Sub3_Sub5 local57 = new Class6_Sub2_Sub3_Sub5();
				local57.anInt2292 = local14;
				local57.anInt2287 = local38;
				if (aClass3ArrayArrayArray1[Static56.anInt1718][local27][local34] == null) {
					aClass3ArrayArrayArray1[Static56.anInt1718][local27][local34] = new Class3();
				}
				aClass3ArrayArrayArray1[Static56.anInt1718][local27][local34].method23(local57);
				Static68.method1377(local34, local27);
			}
			return;
		}
		@Pc(133) int local133;
		@Pc(137) int local137;
		@Pc(145) int local145;
		@Pc(153) int local153;
		@Pc(149) int local149;
		@Pc(157) int local157;
		@Pc(165) int local165;
		if (Static47.anInt1514 == 221) {
			local14 = Static13.aClass6_Sub1_Sub1_2.method1466();
			@Pc(107) byte local107 = Static13.aClass6_Sub1_Sub1_2.method1511();
			local27 = Static13.aClass6_Sub1_Sub1_2.method1464();
			local38 = (local27 & 0x7) + Static87.anInt2447;
			local34 = Static34.anInt1310 + (local27 >> 4 & 0x7);
			@Pc(129) byte local129 = Static13.aClass6_Sub1_Sub1_2.method1471();
			local133 = Static13.aClass6_Sub1_Sub1_2.method1502();
			local137 = Static13.aClass6_Sub1_Sub1_2.method1502();
			@Pc(141) byte local141 = Static13.aClass6_Sub1_Sub1_2.method1484();
			local145 = Static13.aClass6_Sub1_Sub1_2.method1495();
			local149 = local145 & 0x3;
			local153 = local145 >> 2;
			local157 = Static13.anIntArray46[local153];
			@Pc(161) byte local161 = Static13.aClass6_Sub1_Sub1_2.method1511();
			local165 = Static13.aClass6_Sub1_Sub1_2.method1502();
			@Pc(172) Class6_Sub2_Sub3_Sub1_Sub1 local172;
			if (local137 == Static41.anInt1401) {
				local172 = Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1;
			} else {
				local172 = Static44.aClass6_Sub2_Sub3_Sub1_Sub1Array3[local137];
			}
			if (local172 != null) {
				@Pc(182) Class6_Sub2_Sub15 local182 = Static8.method333(local14);
				@Pc(190) int local190 = Static6.anIntArrayArrayArray1[Static56.anInt1718][local34][local38];
				@Pc(202) int local202 = Static6.anIntArrayArrayArray1[Static56.anInt1718][local34 + 1][local38 + 1];
				@Pc(212) int local212 = Static6.anIntArrayArrayArray1[Static56.anInt1718][local34][local38 + 1];
				@Pc(222) int local222 = Static6.anIntArrayArrayArray1[Static56.anInt1718][local34 + 1][local38];
				@Pc(232) Class6_Sub2_Sub3_Sub3 local232 = local182.method1942(local202, local212, local222, local190, local149, local153);
				if (local232 != null) {
					Static77.method1529(local34, 0, local165 + 1, local133 + 1, Static56.anInt1718, -1, local38, local157, 0);
					local172.anInt671 = local165 + Static85.anInt2389;
					local172.anInt678 = local133 + Static85.anInt2389;
					@Pc(269) byte local269;
					if (local107 > local141) {
						local269 = local107;
						local107 = local141;
						local141 = local269;
					}
					@Pc(276) int local276 = local182.anInt2981;
					@Pc(279) int local279 = local182.anInt2984;
					if (local149 == 1 || local149 == 3) {
						local279 = local182.anInt2981;
						local276 = local182.anInt2984;
					}
					local172.aClass6_Sub2_Sub3_Sub3_1 = local232;
					local172.anInt672 = local279 * 64 + local38 * 128;
					local172.anInt680 = local34 * 128 + local276 * 64;
					if (local161 < local129) {
						local269 = local129;
						local129 = local161;
						local161 = local269;
					}
					local172.anInt687 = Static112.method2073(Static56.anInt1718, local172.anInt680, local172.anInt672);
					local172.anInt689 = local141 + local34;
					local172.anInt676 = local129 + local38;
					local172.anInt688 = local161 + local38;
					local172.anInt674 = local107 + local34;
				}
			}
		}
		@Pc(392) int local392;
		if (Static47.anInt1514 == 36) {
			local14 = Static13.aClass6_Sub1_Sub1_2.method1464();
			local27 = local14 & 0x3;
			local18 = local14 >> 2;
			local34 = Static13.anIntArray46[local18];
			local38 = Static13.aClass6_Sub1_Sub1_2.method1495();
			local133 = Static87.anInt2447 + (local38 & 0x7);
			local392 = (local38 >> 4 & 0x7) + Static34.anInt1310;
			if (local392 >= 0 && local133 >= 0 && local392 < 104 && local133 < 104) {
				Static77.method1529(local392, local18, -1, 0, Static56.anInt1718, -1, local133, local34, local27);
			}
			return;
		}
		@Pc(474) Class6_Sub2_Sub3_Sub5 local474;
		if (Static47.anInt1514 == 103) {
			local14 = Static13.aClass6_Sub1_Sub1_2.method1502();
			local18 = Static13.aClass6_Sub1_Sub1_2.method1466();
			local27 = Static13.aClass6_Sub1_Sub1_2.method1495();
			local34 = (local27 >> 4 & 0x7) + Static34.anInt1310;
			local38 = (local27 & 0x7) + Static87.anInt2447;
			local392 = Static13.aClass6_Sub1_Sub1_2.method1502();
			if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local18 != Static41.anInt1401) {
				local474 = new Class6_Sub2_Sub3_Sub5();
				local474.anInt2292 = local392;
				local474.anInt2287 = local14;
				if (aClass3ArrayArrayArray1[Static56.anInt1718][local34][local38] == null) {
					aClass3ArrayArrayArray1[Static56.anInt1718][local34][local38] = new Class3();
				}
				aClass3ArrayArrayArray1[Static56.anInt1718][local34][local38].method23(local474);
				Static68.method1377(local38, local34);
			}
		} else if (Static47.anInt1514 == 218) {
			local14 = Static13.aClass6_Sub1_Sub1_2.method1495();
			local27 = Static87.anInt2447 + (local14 & 0x7);
			local18 = Static34.anInt1310 + (local14 >> 4 & 0x7);
			local34 = Static13.aClass6_Sub1_Sub1_2.method1500();
			local38 = Static13.aClass6_Sub1_Sub1_2.method1500();
			local392 = Static13.aClass6_Sub1_Sub1_2.method1500();
			if (local18 >= 0 && local27 >= 0 && local18 < 104 && local27 < 104) {
				@Pc(570) Class3 local570 = aClass3ArrayArrayArray1[Static56.anInt1718][local18][local27];
				if (local570 != null) {
					for (@Pc(577) Class6_Sub2_Sub3_Sub5 local577 = (Class6_Sub2_Sub3_Sub5) local570.method31(); local577 != null; local577 = (Class6_Sub2_Sub3_Sub5) local570.method26()) {
						if ((local34 & 0x7FFF) == local577.anInt2287 && local577.anInt2292 == local38) {
							local577.anInt2292 = local392;
							break;
						}
					}
					Static68.method1377(local27, local18);
				}
			}
		} else {
			@Pc(664) int local664;
			if (Static47.anInt1514 == 75) {
				local18 = Static13.aClass6_Sub1_Sub1_2.method1502();
				local27 = Static13.aClass6_Sub1_Sub1_2.method1489();
				local34 = Static34.anInt1310 + (local27 >> 4 & 0x7);
				local38 = (local27 & 0x7) + Static87.anInt2447;
				local392 = Static13.aClass6_Sub1_Sub1_2.method1489();
				local133 = local392 >> 2;
				local137 = local392 & 0x3;
				local664 = Static13.anIntArray46[local133];
				if (local34 >= 0 && local38 >= 0 && local34 < 103 && local38 < 103) {
					local145 = Static6.anIntArrayArrayArray1[Static56.anInt1718][local34][local38];
					local157 = Static6.anIntArrayArrayArray1[Static56.anInt1718][local34][local38 + 1];
					local153 = Static6.anIntArrayArrayArray1[Static56.anInt1718][local34 + 1][local38];
					local149 = Static6.anIntArrayArrayArray1[Static56.anInt1718][local34 + 1][local38 + 1];
					if (local664 == 0) {
						@Pc(735) Class41 local735 = Static109.aClass34_1.method1048(Static56.anInt1718, local34, local38);
						if (local735 != null) {
							local165 = local735.anInt1871 >> 14 & 0x7FFF;
							if (local133 == 2) {
								local735.aClass6_Sub2_Sub3_5 = new Class6_Sub2_Sub3_Sub4(local165, 2, local137 + 4, local145, local153, local149, local157, local18, false, local735.aClass6_Sub2_Sub3_5);
								local735.aClass6_Sub2_Sub3_6 = new Class6_Sub2_Sub3_Sub4(local165, 2, local137 + 1 & 0x3, local145, local153, local149, local157, local18, false, local735.aClass6_Sub2_Sub3_6);
							} else {
								local735.aClass6_Sub2_Sub3_5 = new Class6_Sub2_Sub3_Sub4(local165, local133, local137, local145, local153, local149, local157, local18, false, local735.aClass6_Sub2_Sub3_5);
							}
						}
					}
					if (local664 == 1) {
						@Pc(814) Class54 local814 = Static109.aClass34_1.method1033(Static56.anInt1718, local34, local38);
						if (local814 != null) {
							local814.aClass6_Sub2_Sub3_8 = new Class6_Sub2_Sub3_Sub4(local814.anInt2335 >> 14 & 0x7FFF, 4, 0, local145, local153, local149, local157, local18, false, local814.aClass6_Sub2_Sub3_8);
						}
					}
					if (local664 == 2) {
						if (local133 == 11) {
							local133 = 10;
						}
						@Pc(855) Class44 local855 = Static109.aClass34_1.method1041(Static56.anInt1718, local34, local38);
						if (local855 != null) {
							local855.aClass6_Sub2_Sub3_7 = new Class6_Sub2_Sub3_Sub4(local855.anInt1929 >> 14 & 0x7FFF, local133, local137, local145, local153, local149, local157, local18, false, local855.aClass6_Sub2_Sub3_7);
						}
					}
					if (local664 == 3) {
						@Pc(889) Class23 local889 = Static109.aClass34_1.method1045(Static56.anInt1718, local34, local38);
						if (local889 != null) {
							local889.aClass6_Sub2_Sub3_4 = new Class6_Sub2_Sub3_Sub4(local889.anInt1144 >> 14 & 0x7FFF, 22, local137, local145, local153, local149, local157, local18, false, local889.aClass6_Sub2_Sub3_4);
						}
					}
				}
			} else if (Static47.anInt1514 == 23) {
				local18 = Static13.aClass6_Sub1_Sub1_2.method1495();
				local27 = Static34.anInt1310 + (local18 >> 4 & 0x7);
				local34 = (local18 & 0x7) + Static87.anInt2447;
				local38 = Static13.aClass6_Sub1_Sub1_2.method1484() + local27;
				local392 = Static13.aClass6_Sub1_Sub1_2.method1484() + local34;
				local133 = Static13.aClass6_Sub1_Sub1_2.method1498();
				local137 = Static13.aClass6_Sub1_Sub1_2.method1500();
				local664 = Static13.aClass6_Sub1_Sub1_2.method1495() * 4;
				local145 = Static13.aClass6_Sub1_Sub1_2.method1495() * 4;
				local153 = Static13.aClass6_Sub1_Sub1_2.method1500();
				local149 = Static13.aClass6_Sub1_Sub1_2.method1500();
				local157 = Static13.aClass6_Sub1_Sub1_2.method1495();
				@Pc(983) int local983 = Static13.aClass6_Sub1_Sub1_2.method1495();
				if (local27 >= 0 && local34 >= 0 && local27 < 104 && local34 < 104 && local38 >= 0 && local392 >= 0 && local38 < 104 && local392 < 104 && local137 != 65535) {
					local27 = local27 * 128 + 64;
					local392 = local392 * 128 + 64;
					local34 = local34 * 128 + 64;
					local38 = local38 * 128 + 64;
					@Pc(1068) Class6_Sub2_Sub3_Sub6 local1068 = new Class6_Sub2_Sub3_Sub6(local137, Static56.anInt1718, local27, local34, Static112.method2073(Static56.anInt1718, local27, local34) - local664, local153 - -Static85.anInt2389, Static85.anInt2389 + local149, local157, local983, local133, local145);
					local1068.method2070(local153 + Static85.anInt2389, local38, Static112.method2073(Static56.anInt1718, local38, local392) - local145, local392);
					Static44.aClass3_8.method23(local1068);
				}
			} else if (Static47.anInt1514 == 172) {
				local18 = Static13.aClass6_Sub1_Sub1_2.method1495();
				local27 = Static34.anInt1310 + (local18 >> 4 & 0x7);
				local34 = Static87.anInt2447 + (local18 & 0x7);
				local38 = Static13.aClass6_Sub1_Sub1_2.method1500();
				local392 = Static13.aClass6_Sub1_Sub1_2.method1495();
				local133 = Static13.aClass6_Sub1_Sub1_2.method1500();
				if (local27 >= 0 && local34 >= 0 && local27 < 104 && local34 < 104) {
					local27 = local27 * 128 + 64;
					local34 = local34 * 128 + 64;
					@Pc(1163) Class6_Sub2_Sub3_Sub2 local1163 = new Class6_Sub2_Sub3_Sub2(local38, Static56.anInt1718, local27, local34, Static112.method2073(Static56.anInt1718, local27, local34) - local392, local133, Static85.anInt2389);
					Static104.aClass3_11.method23(local1163);
				}
			} else if (Static47.anInt1514 == 59) {
				local18 = Static13.aClass6_Sub1_Sub1_2.method1505();
				local34 = Static87.anInt2447 + (local18 & 0x7);
				local27 = Static34.anInt1310 + (local18 >> 4 & 0x7);
				local38 = Static13.aClass6_Sub1_Sub1_2.method1489();
				local133 = local38 & 0x3;
				local392 = local38 >> 2;
				local137 = Static13.anIntArray46[local392];
				local664 = Static13.aClass6_Sub1_Sub1_2.method1507();
				if (local27 >= 0 && local34 >= 0 && local27 < 104 && local34 < 104) {
					Static77.method1529(local27, local392, -1, 0, Static56.anInt1718, local664, local34, local137, local133);
				}
			} else if (Static47.anInt1514 == 214) {
				local18 = Static13.aClass6_Sub1_Sub1_2.method1507();
				local27 = Static13.aClass6_Sub1_Sub1_2.method1505();
				local34 = Static34.anInt1310 + (local27 >> 4 & 0x7);
				local38 = (local27 & 0x7) + Static87.anInt2447;
				if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104) {
					@Pc(1291) Class3 local1291 = aClass3ArrayArrayArray1[Static56.anInt1718][local34][local38];
					if (local1291 != null) {
						for (local474 = (Class6_Sub2_Sub3_Sub5) local1291.method31(); local474 != null; local474 = (Class6_Sub2_Sub3_Sub5) local1291.method26()) {
							if (local474.anInt2287 == (local18 & 0x7FFF)) {
								local474.method2083();
								break;
							}
						}
						if (local1291.method31() == null) {
							aClass3ArrayArrayArray1[Static56.anInt1718][local34][local38] = null;
						}
						Static68.method1377(local38, local34);
					}
				}
			} else if (Static47.anInt1514 == 217) {
				local18 = Static13.aClass6_Sub1_Sub1_2.method1495();
				local27 = (local18 >> 4 & 0x7) + Static34.anInt1310;
				local34 = Static87.anInt2447 + (local18 & 0x7);
				local38 = Static13.aClass6_Sub1_Sub1_2.method1500();
				local392 = Static13.aClass6_Sub1_Sub1_2.method1495();
				local133 = local392 >> 4 & 0xF;
				local137 = local392 & 0x7;
				local664 = Static13.aClass6_Sub1_Sub1_2.method1495();
				if (local27 >= 0 && local34 >= 0 && local27 < 104 && local34 < 104) {
					local145 = local133 + 1;
					if (Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0] >= local27 - local145 && Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray256[0] <= local27 + local145 && local34 - local145 <= Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0] && local34 + local145 >= Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1.anIntArray255[0] && Static74.anInt1807 != 0 && local137 > 0 && Static85.anInt2391 < 50) {
						Static95.anIntArray259[Static85.anInt2391] = local38;
						Static23.anIntArray65[Static85.anInt2391] = local137;
						Static14.anIntArray47[Static85.anInt2391] = local664;
						Static55.aClass28Array1[Static85.anInt2391] = null;
						Static26.anIntArray213[Static85.anInt2391] = local133 + (local27 << 16) + (local34 << 8);
						Static85.anInt2391++;
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	public static void method1990() {
		aClass55_1291 = null;
		aClass55_1290 = null;
		aClass40_Sub1_40 = null;
		aClass55_1292 = null;
		aLongArray6 = null;
		aClass3ArrayArrayArray1 = null;
		aClass55_1289 = null;
	}
}
