import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public static int anInt1780;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "[Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array3;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public static int anInt1779 = 0;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Lclient!ae;")
	public static Class5 aClass5_822 = Static56.method972("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_827 = Static56.method972("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "Lclient!ae;")
	public static Class5 aClass5_823 = aClass5_827;

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "Lclient!ae;")
	public static Class5 aClass5_824 = Static56.method972("blinken1:");

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "Lclient!ae;")
	public static Class5 aClass5_825 = Static56.method972(" ");

	@OriginalMember(owner = "client!mb", name = "U", descriptor = "Lclient!ae;")
	private static Class5 aClass5_826 = Static56.method972("(X100(U(Y");

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public static void method1162() {
		for (@Pc(13) Class3_Sub1_Sub1_Sub5 local13 = (Class3_Sub1_Sub1_Sub5) Static21.aClass51_6.method1316(); local13 != null; local13 = (Class3_Sub1_Sub1_Sub5) Static21.aClass51_6.method1310()) {
			if (local13.anInt2724 != Static12.anInt480 || local13.aBoolean146) {
				local13.method1966();
			} else if (local13.anInt2735 <= Static3.anInt289) {
				local13.method1774(Static74.anInt1893);
				if (local13.aBoolean146) {
					local13.method1966();
				} else {
					Static73.aClass42_1.method1031(local13.anInt2724, local13.anInt2726, local13.anInt2723, local13.anInt2737, 60, local13, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
	public static void method1163() {
		aClass5_824 = null;
		aClass5_825 = null;
		aClass5_822 = null;
		aClass5_827 = null;
		aClass3_Sub1_Sub2_Sub4Array3 = null;
		aClass5_826 = null;
		aClass5_823 = null;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(Z)Lclient!q;")
	public static Class3_Sub1_Sub2_Sub3 method1164() {
		@Pc(9) Class3_Sub1_Sub2_Sub3 local9 = new Class3_Sub1_Sub2_Sub3();
		local9.anInt2167 = Static63.anIntArray375[0];
		local9.anInt2172 = Static56.anIntArray170[0];
		local9.anInt2169 = Static116.anIntArray382[0];
		@Pc(30) int local30 = local9.anInt2169 * local9.anInt2172;
		local9.anIntArray237 = new int[local30];
		@Pc(38) byte[] local38 = Static38.aByteArrayArray6[0];
		local9.anInt2168 = Static50.anIntArray157[0];
		local9.anInt2171 = Static80.anInt1994;
		local9.anInt2170 = Static14.anInt2882;
		for (@Pc(51) int local51 = 0; local51 < local30; local51++) {
			local9.anIntArray237[local51] = Static89.anIntArray256[local38[local51] & 0xFF];
		}
		Static21.method436();
		return local9;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
	public static void method1165() {
		while (true) {
			if (Static75.aClass3_Sub6_Sub1_2.method1638(Static61.anInt1652) >= 27) {
				@Pc(12) int local12 = Static75.aClass3_Sub6_Sub1_2.method1646(15);
				if (local12 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local12] == null) {
						Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local12] = new Class3_Sub1_Sub1_Sub1_Sub1();
						local19 = true;
					}
					@Pc(35) Class3_Sub1_Sub1_Sub1_Sub1 local35 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local12];
					Static36.anIntArray320[Static115.anInt2977++] = local12;
					local35.anInt1556 = Static3.anInt289;
					@Pc(51) int local51 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
					if (local51 == 1) {
						Static78.anIntArray224[Static83.anInt2051++] = local12;
					}
					local35.aClass3_Sub1_Sub13_1 = Static115.method1958(Static75.aClass3_Sub6_Sub1_2.method1646(13));
					@Pc(75) int local75 = Static75.aClass3_Sub6_Sub1_2.method1646(5);
					@Pc(82) int local82 = Static16.anIntArray66[Static75.aClass3_Sub6_Sub1_2.method1646(3)];
					if (local19) {
						local35.anInt1517 = local82;
					}
					if (local75 > 15) {
						local75 -= 32;
					}
					@Pc(100) int local100 = Static75.aClass3_Sub6_Sub1_2.method1646(5);
					@Pc(105) int local105 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
					local35.anInt1516 = local35.aClass3_Sub1_Sub13_1.anInt2218;
					local35.anInt1562 = local35.aClass3_Sub1_Sub13_1.anInt2203;
					local35.anInt1530 = local35.aClass3_Sub1_Sub13_1.anInt2209;
					local35.anInt1549 = local35.aClass3_Sub1_Sub13_1.anInt2213;
					local35.anInt1531 = local35.aClass3_Sub1_Sub13_1.anInt2196;
					local35.anInt1550 = local35.aClass3_Sub1_Sub13_1.anInt2216;
					if (local100 > 15) {
						local100 -= 32;
					}
					local35.anInt1579 = local35.aClass3_Sub1_Sub13_1.anInt2221;
					if (local35.anInt1516 == 0) {
						local35.anInt1517 = 0;
					}
					local35.anInt1521 = local35.aClass3_Sub1_Sub13_1.anInt2201;
					local35.anInt1529 = local35.aClass3_Sub1_Sub13_1.anInt2215;
					local35.method991(local100 + Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local105 == 1, local75 + Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0]);
					continue;
				}
			}
			Static75.aClass3_Sub6_Sub1_2.method1641();
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!bf;)V")
	public static void method1166(@OriginalArg(1) Class11 arg0) {
		Static23.aClass11_14 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!vb;I)V")
	public static void method1167(@OriginalArg(1) Class11_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static83.aClass3_Sub6_6 == null) {
			Static85.method1368(255, null, 255, true, 0, (byte) 0);
			Static49.aClass11_Sub1Array1[arg1] = arg0;
		} else {
			Static83.aClass3_Sub6_6.anInt2416 = arg1 * 4 + 5;
			@Pc(16) int local16 = Static83.aClass3_Sub6_6.method1614();
			arg0.method1887(local16);
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IIIIIII)I")
	public static int method1168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(10) int local10 = arg5;
			arg5 = arg4;
			arg4 = local10;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 + 1 - arg1 - arg5;
		} else {
			return 7 + 1 - arg2 - arg4;
		}
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public static void method1169() {
		try {
			@Pc(10) Graphics local10 = Static62.aCanvas1.getGraphics();
			Static53.aClass2_12.method1322(local10, 553, 205);
		} catch (@Pc(20) Exception local20) {
			Static62.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V")
	public static void method1170() {
		Static37.aFontMetrics1 = null;
		Static22.aFont1 = null;
		Static89.anImage4 = null;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)Lclient!te;")
	public static Class3_Sub1_Sub17 method1171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) Class3_Sub1_Sub17 local11 = Static58.method1009(arg0);
		if (arg1 == -1) {
			return local11;
		} else if (local11 == null || local11.aClass3_Sub1_Sub17Array1 == null || arg1 >= local11.aClass3_Sub1_Sub17Array1.length) {
			return null;
		} else {
			return local11.aClass3_Sub1_Sub17Array1[arg1];
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
	public static void method1172() {
		Static91.method1535(false);
		Static55.anInt1454 = 0;
		@Pc(8) boolean local8 = true;
		for (@Pc(14) int local14 = 0; local14 < Static101.aByteArrayArray9.length; local14++) {
			if (Static19.anIntArray74[local14] != -1 && Static101.aByteArrayArray9[local14] == null) {
				Static101.aByteArrayArray9[local14] = Static18.aClass11_Sub1_20.method1882(Static19.anIntArray74[local14], 0);
				if (Static101.aByteArrayArray9[local14] == null) {
					local8 = false;
					Static55.anInt1454++;
				}
			}
			if (Static93.anIntArray270[local14] != -1 && Static9.aByteArrayArray2[local14] == null) {
				Static9.aByteArrayArray2[local14] = Static18.aClass11_Sub1_20.method1874(Static93.anIntArray270[local14], 0, Static15.anIntArrayArray4[local14]);
				if (Static9.aByteArrayArray2[local14] == null) {
					Static55.anInt1454++;
					local8 = false;
				}
			}
		}
		if (!local8) {
			Static1.anInt7 = 1;
			return;
		}
		local8 = true;
		Static21.anInt704 = 0;
		@Pc(123) int local123;
		@Pc(112) int local112;
		for (@Pc(94) int local94 = 0; local94 < Static101.aByteArrayArray9.length; local94++) {
			@Pc(100) byte[] local100 = Static9.aByteArrayArray2[local94];
			if (local100 != null) {
				local112 = (Static109.anIntArray371[local94] & 0xFF) * 64 - Static52.anInt1378;
				local123 = (Static109.anIntArray371[local94] >> 8) * 64 - Static109.anInt2875;
				if (Static105.aBoolean144) {
					local112 = 10;
					local123 = 10;
				}
				local8 &= Static15.method353(local112, local123, local100);
			}
		}
		if (!local8) {
			Static1.anInt7 = 2;
			return;
		}
		if (Static1.anInt7 != 0) {
			Static37.method697(true, Static12.aClass5_186, aClass5_826);
		}
		Static104.method1148();
		Static73.aClass42_1.method1034();
		System.gc();
		for (@Pc(168) int local168 = 0; local168 < 4; local168++) {
			Static80.aClass30Array1[local168].method708();
		}
		@Pc(191) int local191;
		for (local123 = 0; local123 < 4; local123++) {
			for (local112 = 0; local112 < 104; local112++) {
				for (local191 = 0; local191 < 104; local191++) {
					Static93.aByteArrayArrayArray5[local123][local112][local191] = 0;
				}
			}
		}
		Static90.method1521();
		local112 = Static101.aByteArrayArray9.length;
		Static87.method1482();
		Static91.method1535(true);
		@Pc(240) int local240;
		@Pc(251) int local251;
		@Pc(357) int local357;
		@Pc(303) int local303;
		@Pc(346) int local346;
		if (!Static105.aBoolean144) {
			@Pc(255) byte[] local255;
			for (local191 = 0; local191 < local112; local191++) {
				local240 = (Static109.anIntArray371[local191] >> 8) * 64 - Static109.anInt2875;
				local251 = (Static109.anIntArray371[local191] & 0xFF) * 64 - Static52.anInt1378;
				local255 = Static101.aByteArrayArray9[local191];
				if (local255 != null) {
					Static76.method1690(Static80.aClass30Array1, local251, local255, local240, (Static109.anInt2877 - 6) * 8, anInt1780 * 8 - 48);
				}
			}
			for (local240 = 0; local240 < local112; local240++) {
				local251 = (Static109.anIntArray371[local240] >> 8) * 64 - Static109.anInt2875;
				local303 = (Static109.anIntArray371[local240] & 0xFF) * 64 - Static52.anInt1378;
				@Pc(307) byte[] local307 = Static101.aByteArrayArray9[local240];
				if (local307 == null && Static109.anInt2877 < 800) {
					Static115.method1954(local251, local303, 64, 64);
				}
			}
			Static91.method1535(true);
			for (local251 = 0; local251 < local112; local251++) {
				local255 = Static9.aByteArrayArray2[local251];
				if (local255 != null) {
					local346 = (Static109.anIntArray371[local251] >> 8) * 64 - Static109.anInt2875;
					local357 = (Static109.anIntArray371[local251] & 0xFF) * 64 - Static52.anInt1378;
					Static68.method999(Static73.aClass42_1, local346, Static80.aClass30Array1, local255, local357);
				}
			}
		}
		@Pc(418) int local418;
		@Pc(412) int local412;
		if (Static105.aBoolean144) {
			@Pc(424) int local424;
			@Pc(435) int local435;
			@Pc(437) int local437;
			for (local191 = 0; local191 < 4; local191++) {
				for (local240 = 0; local240 < 13; local240++) {
					for (local251 = 0; local251 < 13; local251++) {
						@Pc(388) boolean local388 = false;
						local346 = Static44.anIntArrayArrayArray1[local191][local240][local251];
						if (local346 != -1) {
							local357 = local346 >> 24 & 0x3;
							local412 = local346 >> 14 & 0x3FF;
							local418 = local346 >> 1 & 0x3;
							local424 = local346 >> 3 & 0x7FF;
							local435 = (local412 / 8 << 8) + (local424 / 8);
							for (local437 = 0; local437 < Static109.anIntArray371.length; local437++) {
								if (local435 == Static109.anIntArray371[local437] && Static101.aByteArrayArray9[local437] != null) {
									local388 = true;
									Static15.method355((local412 & 0x7) * 8, local191, Static101.aByteArrayArray9[local437], Static80.aClass30Array1, local418, local240 * 8, (local424 & 0x7) * 8, local357, local251 * 8);
									break;
								}
							}
						}
						if (!local388) {
							Static99.method1660(local191, local251 * 8, local240 * 8);
						}
					}
				}
			}
			for (local240 = 0; local240 < 13; local240++) {
				for (local251 = 0; local251 < 13; local251++) {
					local303 = Static44.anIntArrayArrayArray1[0][local240][local251];
					if (local303 == -1) {
						Static115.method1954(local240 * 8, local251 * 8, 8, 8);
					}
				}
			}
			Static91.method1535(true);
			for (local251 = 0; local251 < 4; local251++) {
				for (local303 = 0; local303 < 13; local303++) {
					for (local346 = 0; local346 < 13; local346++) {
						local357 = Static44.anIntArrayArrayArray1[local251][local303][local346];
						if (local357 != -1) {
							local418 = local357 >> 24 & 0x3;
							local412 = local357 >> 1 & 0x3;
							local435 = local357 >> 3 & 0x7FF;
							local424 = local357 >> 14 & 0x3FF;
							local437 = (local424 / 8 << 8) + (local435 / 8);
							for (@Pc(616) int local616 = 0; local616 < Static109.anIntArray371.length; local616++) {
								if (local437 == Static109.anIntArray371[local616] && Static9.aByteArrayArray2[local616] != null) {
									Static92.method1543(Static9.aByteArrayArray2[local616], local412, local251, local303 * 8, local418, Static73.aClass42_1, (local424 & 0x7) * 8, (local435 & 0x7) * 8, local346 * 8, Static80.aClass30Array1);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static91.method1535(true);
		Static104.method1148();
		Static27.method542(Static73.aClass42_1, Static80.aClass30Array1);
		Static91.method1535(true);
		local191 = Static38.anInt1058;
		if (local191 > Static12.anInt480) {
			local191 = Static12.anInt480;
		}
		if (Static12.anInt480 - 1 > local191) {
		}
		if (Static74.aBoolean91) {
			Static73.aClass42_1.method1046(Static38.anInt1058);
		} else {
			Static73.aClass42_1.method1046(0);
		}
		for (local240 = 0; local240 < 104; local240++) {
			for (local251 = 0; local251 < 104; local251++) {
				Static109.method1896(local240, local251);
			}
		}
		Static49.method879();
		Static70.aClass9_17.method283();
		if (Static11.aFrame1 != null) {
			Static95.aClass3_Sub6_Sub1_3.method1645(141);
			Static95.aClass3_Sub6_Sub1_3.method1611(1057001181);
		}
		if (!Static105.aBoolean144) {
			local251 = (anInt1780 - 6) / 8;
			local303 = (anInt1780 + 6) / 8;
			local357 = (Static109.anInt2877 + 6) / 8;
			local346 = (Static109.anInt2877 - 6) / 8;
			for (local418 = local251 - 1; local418 <= local303 + 1; local418++) {
				for (local412 = local346 - 1; local412 <= local357 + 1; local412++) {
					if (local251 > local418 || local303 < local418 || local412 < local346 || local412 > local357) {
						Static18.aClass11_Sub1_20.method1861(Static75.method1261(new Class5[] { Static94.aClass5_263, Static96.method1319(local418), Static48.aClass5_638, Static96.method1319(local412) }));
						Static18.aClass11_Sub1_20.method1861(Static75.method1261(new Class5[] { Static90.aClass5_1061, Static96.method1319(local418), Static48.aClass5_638, Static96.method1319(local412) }));
					}
				}
			}
		}
		if (Static63.anInt2924 == -1) {
			Static116.method1971(30);
		} else {
			Static116.method1971(35);
		}
		Static101.method1686();
		Static95.aClass3_Sub6_Sub1_3.method1645(21);
		Static62.method1075();
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(IB)Lclient!ae;")
	public static Class5 method1173(@OriginalArg(0) int arg0) {
		@Pc(9) Class5 local9 = Static96.method1319(arg0);
		for (@Pc(15) int local15 = local9.method144() - 3; local15 > 0; local15 -= 3) {
			local9 = Static75.method1261(new Class5[] { local9.method133(0, local15), Static92.aClass5_1087, local9.method159(local15) });
		}
		if (local9.method144() > 8) {
			local9 = Static75.method1261(new Class5[] { Static62.aClass5_793, local9.method133(0, local9.method144() - 8), Static89.aClass5_1040, Static9.aClass5_162, local9, Static92.aClass5_1083 });
		} else if (local9.method144() > 4) {
			local9 = Static75.method1261(new Class5[] { Static4.aClass5_103, local9.method133(0, local9.method144() - 4), Static58.aClass5_774, Static9.aClass5_162, local9, Static92.aClass5_1083 });
		}
		return Static75.method1261(new Class5[] { aClass5_825, local9 });
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public static void method1174(@OriginalArg(1) int arg0) {
		Static113.method1939(arg0);
	}
}
