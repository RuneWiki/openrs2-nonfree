import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!cd", name = "Yb", descriptor = "Lclient!dd;")
	public static Class14 aClass14_4;

	@OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lclient!ic;")
	private static Class34 aClass34_248 = Static56.method816("Please enter your username)3");

	@OriginalMember(owner = "client!cd", name = "U", descriptor = "Lclient!ic;")
	public static Class34 aClass34_247 = aClass34_248;

	@OriginalMember(owner = "client!cd", name = "xb", descriptor = "I")
	public static int anInt434 = 0;

	@OriginalMember(owner = "client!cd", name = "Qb", descriptor = "[Lclient!ic;")
	public static Class34[] aClass34Array6 = new Class34[1000];

	@OriginalMember(owner = "client!cd", name = "Wb", descriptor = "I")
	public static int anInt450 = 0;

	@OriginalMember(owner = "client!cd", name = "Xb", descriptor = "I")
	public static int anInt451 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!wf;B)Z")
	public static boolean method260(@OriginalArg(0) Class8_Sub24 arg0) {
		if (arg0.anIntArray415 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray415.length; local17++) {
			@Pc(24) int local24 = Static102.method2014(arg0, local17);
			@Pc(29) int local29 = arg0.anIntArray416[local17];
			if (arg0.anIntArray415[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray415[local17] == 3) {
				if (local24 <= local29) {
					return false;
				}
			} else if (arg0.anIntArray415[local17] == 4) {
				if (local24 == local29) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
	public static void method265() {
		@Pc(14) int local14;
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (Static30.anInt852 == 53) {
			local14 = Static10.aClass8_Sub20_Sub1_1.method1872();
			local23 = Static73.anInt1773 + (local14 >> 4 & 0x7);
			local30 = Static32.anInt873 + (local14 & 0x7);
			local34 = Static10.aClass8_Sub20_Sub1_1.method1839();
			local38 = Static10.aClass8_Sub20_Sub1_1.method1839();
			local42 = Static10.aClass8_Sub20_Sub1_1.method1839();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				@Pc(65) Class49 local65 = Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local23][local30];
				if (local65 != null) {
					for (@Pc(74) Class8_Sub1_Sub1_Sub2 local74 = (Class8_Sub1_Sub1_Sub2) local65.method1107(); local74 != null; local74 = (Class8_Sub1_Sub1_Sub2) local65.method1109()) {
						if ((local34 & 0x7FFF) == local74.anInt349 && local38 == local74.anInt348) {
							local74.anInt348 = local42;
							break;
						}
					}
					Static66.method1958(local23, local30);
				}
			}
			return;
		}
		@Pc(159) Class8_Sub1_Sub1_Sub2 local159;
		if (Static30.anInt852 == 137) {
			local14 = Static10.aClass8_Sub20_Sub1_1.method1858();
			local23 = Static10.aClass8_Sub20_Sub1_1.method1858();
			local30 = Static10.aClass8_Sub20_Sub1_1.method1851();
			local38 = (local30 & 0x7) + Static32.anInt873;
			local34 = (local30 >> 4 & 0x7) + Static73.anInt1773;
			if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104) {
				local159 = new Class8_Sub1_Sub1_Sub2();
				local159.anInt348 = local14;
				local159.anInt349 = local23;
				if (Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local34][local38] == null) {
					Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local34][local38] = new Class49();
				}
				Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local34][local38].method1114(local159);
				Static66.method1958(local34, local38);
			}
			return;
		}
		@Pc(241) int local241;
		@Pc(233) int local233;
		if (Static30.anInt852 == 201) {
			local14 = Static10.aClass8_Sub20_Sub1_1.method1872();
			local23 = local14 >> 2;
			local30 = local14 & 0x3;
			local34 = Static22.anIntArray344[local23];
			local38 = Static10.aClass8_Sub20_Sub1_1.method1878();
			local42 = Static10.aClass8_Sub20_Sub1_1.method1872();
			local233 = (local42 & 0x7) + Static32.anInt873;
			local241 = (local42 >> 4 & 0x7) + Static73.anInt1773;
			if (local241 >= 0 && local233 >= 0 && local241 < 104 && local233 < 104) {
				Static51.method770(Static42.anInt1024, local241, local233, 0, local30, local23, -1, local38, local34);
			}
			return;
		}
		@Pc(326) int local326;
		@Pc(330) int local330;
		if (Static30.anInt852 == 40) {
			local14 = Static10.aClass8_Sub20_Sub1_1.method1872();
			local23 = Static73.anInt1773 + (local14 >> 4 & 0x7);
			local30 = (local14 & 0x7) + Static32.anInt873;
			local34 = local23 + Static10.aClass8_Sub20_Sub1_1.method1847();
			local38 = Static10.aClass8_Sub20_Sub1_1.method1847() + local30;
			local42 = Static10.aClass8_Sub20_Sub1_1.method1856();
			local241 = Static10.aClass8_Sub20_Sub1_1.method1839();
			local233 = Static10.aClass8_Sub20_Sub1_1.method1872() * 4;
			local326 = Static10.aClass8_Sub20_Sub1_1.method1872() * 4;
			local330 = Static10.aClass8_Sub20_Sub1_1.method1839();
			@Pc(334) int local334 = Static10.aClass8_Sub20_Sub1_1.method1839();
			@Pc(338) int local338 = Static10.aClass8_Sub20_Sub1_1.method1872();
			@Pc(342) int local342 = Static10.aClass8_Sub20_Sub1_1.method1872();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104 && local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local241 != 65535) {
				local23 = local23 * 128 + 64;
				local38 = local38 * 128 + 64;
				local34 = local34 * 128 + 64;
				local30 = local30 * 128 + 64;
				@Pc(424) Class8_Sub1_Sub1_Sub7 local424 = new Class8_Sub1_Sub1_Sub7(local241, Static42.anInt1024, local23, local30, Static123.method1945(local30, Static42.anInt1024, local23) - local233, local330 - -Static21.anInt655, local334 + Static21.anInt655, local338, local342, local42, local326);
				local424.method1968(local34, Static123.method1945(local38, Static42.anInt1024, local34) - local326, local38, Static21.anInt655 + local330);
				Static82.aClass49_8.method1114(local424);
			}
		} else if (Static30.anInt852 == 96) {
			local14 = Static10.aClass8_Sub20_Sub1_1.method1877();
			local30 = (local14 & 0x7) + Static32.anInt873;
			local23 = Static73.anInt1773 + (local14 >> 4 & 0x7);
			local34 = Static10.aClass8_Sub20_Sub1_1.method1877();
			local42 = local34 & 0x3;
			local38 = local34 >> 2;
			local241 = Static22.anIntArray344[local38];
			local233 = Static10.aClass8_Sub20_Sub1_1.method1839();
			if (local23 >= 0 && local30 >= 0 && local23 < 103 && local30 < 103) {
				if (local241 == 0) {
					@Pc(508) Class74 local508 = Static3.aClass64_1.method1430(Static42.anInt1024, local23, local30);
					if (local508 != null) {
						local330 = local508.anInt2623 >> 14 & 0x7FFF;
						if (local38 == 2) {
							local508.aClass8_Sub1_Sub1_5 = new Class8_Sub1_Sub1_Sub1(local330, 2, local42 + 4, Static42.anInt1024, local23, local30, local233, false, local508.aClass8_Sub1_Sub1_5);
							local508.aClass8_Sub1_Sub1_6 = new Class8_Sub1_Sub1_Sub1(local330, 2, local42 + 1 & 0x3, Static42.anInt1024, local23, local30, local233, false, local508.aClass8_Sub1_Sub1_6);
						} else {
							local508.aClass8_Sub1_Sub1_5 = new Class8_Sub1_Sub1_Sub1(local330, local38, local42, Static42.anInt1024, local23, local30, local233, false, local508.aClass8_Sub1_Sub1_5);
						}
					}
				}
				if (local241 == 1) {
					@Pc(586) Class67 local586 = Static3.aClass64_1.method1422(Static42.anInt1024, local23, local30);
					if (local586 != null) {
						local330 = local586.anInt2386 >> 14 & 0x7FFF;
						if (local38 == 4 || local38 == 5) {
							local586.aClass8_Sub1_Sub1_4 = new Class8_Sub1_Sub1_Sub1(local330, 4, local42, Static42.anInt1024, local23, local30, local233, false, local586.aClass8_Sub1_Sub1_4);
						} else if (local38 == 6) {
							local586.aClass8_Sub1_Sub1_4 = new Class8_Sub1_Sub1_Sub1(local330, 4, local42 + 4, Static42.anInt1024, local23, local30, local233, false, local586.aClass8_Sub1_Sub1_4);
						} else if (local38 == 7) {
							local586.aClass8_Sub1_Sub1_4 = new Class8_Sub1_Sub1_Sub1(local330, 4, (local42 + 2 & 0x3) + 4, Static42.anInt1024, local23, local30, local233, false, local586.aClass8_Sub1_Sub1_4);
						} else if (local38 == 8) {
							local586.aClass8_Sub1_Sub1_4 = new Class8_Sub1_Sub1_Sub1(local330, 4, local42 + 4, Static42.anInt1024, local23, local30, local233, false, local586.aClass8_Sub1_Sub1_4);
							local586.aClass8_Sub1_Sub1_3 = new Class8_Sub1_Sub1_Sub1(local330, 4, (local42 + 2 & 0x3) + 4, Static42.anInt1024, local23, local30, local233, false, local586.aClass8_Sub1_Sub1_3);
						}
					}
				}
				if (local241 == 2) {
					if (local38 == 11) {
						local38 = 10;
					}
					@Pc(731) Class12 local731 = Static3.aClass64_1.method1387(Static42.anInt1024, local23, local30);
					if (local731 != null) {
						local731.aClass8_Sub1_Sub1_1 = new Class8_Sub1_Sub1_Sub1(local731.anInt498 >> 14 & 0x7FFF, local38, local42, Static42.anInt1024, local23, local30, local233, false, local731.aClass8_Sub1_Sub1_1);
					}
				}
				if (local241 == 3) {
					@Pc(762) Class18 local762 = Static3.aClass64_1.method1399(Static42.anInt1024, local23, local30);
					if (local762 != null) {
						local762.aClass8_Sub1_Sub1_2 = new Class8_Sub1_Sub1_Sub1(local762.anInt851 >> 14 & 0x7FFF, 22, local42, Static42.anInt1024, local23, local30, local233, false, local762.aClass8_Sub1_Sub1_2);
					}
				}
			}
		} else if (Static30.anInt852 == 174) {
			local14 = Static10.aClass8_Sub20_Sub1_1.method1878();
			local23 = Static10.aClass8_Sub20_Sub1_1.method1872();
			local30 = Static73.anInt1773 + (local23 >> 4 & 0x7);
			local34 = Static32.anInt873 + (local23 & 0x7);
			if (local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104) {
				@Pc(843) Class49 local843 = Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local30][local34];
				if (local843 != null) {
					for (local159 = (Class8_Sub1_Sub1_Sub2) local843.method1107(); local159 != null; local159 = (Class8_Sub1_Sub1_Sub2) local843.method1109()) {
						if (local159.anInt349 == (local14 & 0x7FFF)) {
							local159.method2013();
							break;
						}
					}
					if (local843.method1107() == null) {
						Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local30][local34] = null;
					}
					Static66.method1958(local30, local34);
				}
			}
		} else if (Static30.anInt852 == 147) {
			local14 = Static10.aClass8_Sub20_Sub1_1.method1877();
			local23 = Static73.anInt1773 + (local14 >> 4 & 0x7);
			local30 = (local14 & 0x7) + Static32.anInt873;
			local34 = Static10.aClass8_Sub20_Sub1_1.method1872();
			local42 = local34 & 0x3;
			local38 = local34 >> 2;
			local241 = Static22.anIntArray344[local38];
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				Static51.method770(Static42.anInt1024, local23, local30, 0, local42, local38, -1, -1, local241);
			}
		} else if (Static30.anInt852 == 177) {
			local14 = Static10.aClass8_Sub20_Sub1_1.method1889();
			local23 = Static10.aClass8_Sub20_Sub1_1.method1878();
			local30 = Static10.aClass8_Sub20_Sub1_1.method1851();
			local38 = Static32.anInt873 + (local30 & 0x7);
			local34 = (local30 >> 4 & 0x7) + Static73.anInt1773;
			local42 = Static10.aClass8_Sub20_Sub1_1.method1889();
			if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && Static2.anInt33 != local14) {
				@Pc(1003) Class8_Sub1_Sub1_Sub2 local1003 = new Class8_Sub1_Sub1_Sub2();
				local1003.anInt349 = local42;
				local1003.anInt348 = local23;
				if (Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local34][local38] == null) {
					Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local34][local38] = new Class49();
				}
				Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local34][local38].method1114(local1003);
				Static66.method1958(local34, local38);
			}
		} else if (Static30.anInt852 == 168) {
			local14 = Static10.aClass8_Sub20_Sub1_1.method1872();
			local23 = Static73.anInt1773 + (local14 >> 4 & 0x7);
			local30 = Static32.anInt873 + (local14 & 0x7);
			local34 = Static10.aClass8_Sub20_Sub1_1.method1839();
			local38 = Static10.aClass8_Sub20_Sub1_1.method1872();
			local42 = Static10.aClass8_Sub20_Sub1_1.method1839();
			if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
				local23 = local23 * 128 + 64;
				local30 = local30 * 128 + 64;
				@Pc(1126) Class8_Sub1_Sub1_Sub5 local1126 = new Class8_Sub1_Sub1_Sub5(local34, Static42.anInt1024, local23, local30, Static123.method1945(local30, Static42.anInt1024, local23) - local38, local42, Static21.anInt655);
				Static42.aClass49_4.method1114(local1126);
			}
		} else {
			if (Static30.anInt852 == 223) {
				local14 = Static10.aClass8_Sub20_Sub1_1.method1872();
				local23 = (local14 >> 4 & 0x7) + Static73.anInt1773;
				local30 = (local14 & 0x7) + Static32.anInt873;
				local34 = Static10.aClass8_Sub20_Sub1_1.method1839();
				local38 = Static10.aClass8_Sub20_Sub1_1.method1872();
				local42 = local38 >> 4 & 0xF;
				local233 = Static10.aClass8_Sub20_Sub1_1.method1872();
				local241 = local38 & 0x7;
				if (local23 >= 0 && local30 >= 0 && local23 < 104 && local30 < 104) {
					local326 = local42 + 1;
					if (local23 - local326 <= Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0] && local23 + local326 >= Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0] && local30 - local326 <= Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0] && Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0] <= local30 + local326 && Static67.anInt1640 != 0 && local241 > 0 && Static64.anInt2023 < 50) {
						Static68.anIntArray207[Static64.anInt2023] = local34;
						Static58.anIntArray191[Static64.anInt2023] = local241;
						Static36.anIntArray126[Static64.anInt2023] = local233;
						Static4.aClass57Array1[Static64.anInt2023] = null;
						Static20.anIntArray67[Static64.anInt2023] = (local23 << 16) + (local30 << 8) + local42;
						Static64.anInt2023++;
					}
				}
			}
			if (Static30.anInt852 == 179) {
				local14 = Static10.aClass8_Sub20_Sub1_1.method1877();
				local23 = (local14 >> 4 & 0x7) + Static73.anInt1773;
				local30 = (local14 & 0x7) + Static32.anInt873;
				local34 = Static10.aClass8_Sub20_Sub1_1.method1858();
				local38 = Static10.aClass8_Sub20_Sub1_1.method1858();
				local42 = Static10.aClass8_Sub20_Sub1_1.method1851();
				local233 = local42 & 0x3;
				local241 = local42 >> 2;
				local326 = Static22.anIntArray344[local241];
				local330 = Static10.aClass8_Sub20_Sub1_1.method1839();
				@Pc(1347) byte local1347 = Static10.aClass8_Sub20_Sub1_1.method1847();
				@Pc(1351) byte local1351 = Static10.aClass8_Sub20_Sub1_1.method1874();
				@Pc(1355) byte local1355 = Static10.aClass8_Sub20_Sub1_1.method1874();
				@Pc(1359) int local1359 = Static10.aClass8_Sub20_Sub1_1.method1889();
				@Pc(1365) byte local1365 = Static10.aClass8_Sub20_Sub1_1.method1875();
				@Pc(1374) Class8_Sub1_Sub1_Sub4_Sub1 local1374;
				if (Static2.anInt33 == local1359) {
					local1374 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1;
				} else {
					local1374 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local1359];
				}
				if (local1374 != null) {
					@Pc(1386) Class8_Sub1_Sub4 local1386 = Static50.method752(local330);
					@Pc(1400) int local1400;
					@Pc(1397) int local1397;
					if (local233 == 1 || local233 == 3) {
						local1397 = local1386.anInt443;
						local1400 = local1386.anInt455;
					} else {
						local1397 = local1386.anInt455;
						local1400 = local1386.anInt443;
					}
					@Pc(1417) int local1417 = local23 + (local1400 + 1 >> 1);
					@Pc(1424) int local1424 = local23 + (local1400 >> 1);
					@Pc(1431) int local1431 = local30 + (local1397 >> 1);
					@Pc(1435) int[][] local1435 = Static24.anIntArrayArrayArray4[Static42.anInt1024];
					@Pc(1443) int local1443 = (local1397 + 1 >> 1) + local30;
					@Pc(1451) int local1451 = (local1400 << 6) + (local23 << 7);
					@Pc(1460) int local1460 = (local30 << 7) + (local1397 << 6);
					@Pc(1487) int local1487 = local1435[local1417][local1443] + local1435[local1417][local1431] + local1435[local1424][local1431] + local1435[local1424][local1443] >> 2;
					@Pc(1497) Class8_Sub1_Sub1_Sub6 local1497 = local1386.method259(local233, local241, local1435, local1460, local1487, local1451);
					if (local1497 != null) {
						@Pc(1508) byte local1508;
						if (local1355 > local1347) {
							local1508 = local1355;
							local1355 = local1347;
							local1347 = local1508;
						}
						if (local1351 < local1365) {
							local1508 = local1365;
							local1365 = local1351;
							local1351 = local1508;
						}
						Static51.method770(Static42.anInt1024, local23, local30, local34 + 1, 0, 0, local38 + 1, -1, local326);
						local1374.anInt1278 = local30 * 128 + local1397 * 64;
						local1374.anInt1283 = local23 * 128 + local1400 * 64;
						local1374.anInt1288 = local1487;
						local1374.anInt1264 = local23 + local1347;
						local1374.anInt1285 = local1355 + local23;
						local1374.anInt1273 = local30 + local1365;
						local1374.anInt1271 = local1351 + local30;
						local1374.aClass8_Sub1_Sub1_Sub6_1 = local1497;
						local1374.anInt1270 = local38 + Static21.anInt655;
						local1374.anInt1269 = local34 + Static21.anInt655;
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
	public static void method267() {
		aClass14_4 = null;
		aClass34_247 = null;
		aClass34_248 = null;
		aClass34Array6 = null;
	}

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
	public static void method268() {
		try {
			if (Static77.anInt1828 == 0) {
				if (Static93.aClass25_4 != null) {
					Static93.aClass25_4.method588();
					Static93.aClass25_4 = null;
				}
				Static106.anInt2455 = 0;
				Static107.aBoolean97 = false;
				Static7.aClass10_1 = null;
				Static77.anInt1828 = 1;
			}
			if (Static77.anInt1828 == 1) {
				if (Static7.aClass10_1 == null) {
					Static7.aClass10_1 = Static93.aClass40_3.method948(Static82.aString4, Static67.anInt1653);
				}
				if (Static7.aClass10_1.anInt295 == 2) {
					throw new IOException();
				}
				if (Static7.aClass10_1.anInt295 == 1) {
					Static93.aClass25_4 = new Class25((Socket) Static7.aClass10_1.anObject1, Static93.aClass40_3);
					Static77.anInt1828 = 2;
					Static7.aClass10_1 = null;
				}
			}
			if (Static77.anInt1828 == 2) {
				@Pc(71) long local71 = Static86.aLong73 = Static83.aClass34_941.method830();
				Static106.aClass8_Sub20_Sub1_3.anInt2853 = 0;
				@Pc(81) int local81 = (int) (local71 >> 16 & 0x1FL);
				Static106.aClass8_Sub20_Sub1_3.method1883(14);
				Static106.aClass8_Sub20_Sub1_3.method1883(local81);
				Static93.aClass25_4.method586(2, Static106.aClass8_Sub20_Sub1_3.aByteArray44);
				Static77.anInt1828 = 3;
				Static10.aClass8_Sub20_Sub1_1.anInt2853 = 0;
			}
			@Pc(120) int local120;
			if (Static77.anInt1828 == 3) {
				if (Static96.aClass13_2 != null) {
					Static96.aClass13_2.method1607();
				}
				if (Static112.aClass13_3 != null) {
					Static112.aClass13_3.method1607();
				}
				local120 = Static93.aClass25_4.method582();
				if (Static96.aClass13_2 != null) {
					Static96.aClass13_2.method1607();
				}
				if (Static112.aClass13_3 != null) {
					Static112.aClass13_3.method1607();
				}
				if (local120 != 0) {
					Static96.method341(local120);
					return;
				}
				Static77.anInt1828 = 4;
				Static10.aClass8_Sub20_Sub1_1.anInt2853 = 0;
			}
			if (Static77.anInt1828 == 4) {
				if (Static10.aClass8_Sub20_Sub1_1.anInt2853 < 8) {
					local120 = Static93.aClass25_4.method585();
					if (8 - Static10.aClass8_Sub20_Sub1_1.anInt2853 < local120) {
						local120 = 8 - Static10.aClass8_Sub20_Sub1_1.anInt2853;
					}
					if (local120 > 0) {
						Static93.aClass25_4.method589(Static10.aClass8_Sub20_Sub1_1.anInt2853, local120, Static10.aClass8_Sub20_Sub1_1.aByteArray44);
						Static10.aClass8_Sub20_Sub1_1.anInt2853 += local120;
					}
				}
				if (Static10.aClass8_Sub20_Sub1_1.anInt2853 == 8) {
					Static10.aClass8_Sub20_Sub1_1.anInt2853 = 0;
					Static22.aLong86 = Static10.aClass8_Sub20_Sub1_1.method1864();
					Static77.anInt1828 = 5;
				}
			}
			if (Static77.anInt1828 == 5) {
				Static106.aClass8_Sub20_Sub1_3.anInt2853 = 0;
				@Pc(208) int[] local208 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static22.aLong86 >> 32), (int) Static22.aLong86 };
				Static106.aClass8_Sub20_Sub1_3.method1883(10);
				Static106.aClass8_Sub20_Sub1_3.method1873(local208[0]);
				Static106.aClass8_Sub20_Sub1_3.method1873(local208[1]);
				Static106.aClass8_Sub20_Sub1_3.method1873(local208[2]);
				Static106.aClass8_Sub20_Sub1_3.method1873(local208[3]);
				Static106.aClass8_Sub20_Sub1_3.method1879(Static83.aClass34_941.method830());
				Static106.aClass8_Sub20_Sub1_3.method1865(Static83.aClass34_936);
				Static106.aClass8_Sub20_Sub1_3.method1882(Static77.aBigInteger1, Static124.aBigInteger2);
				Static78.aClass8_Sub20_Sub1_2.anInt2853 = 0;
				if (Static61.anInt1587 == 40) {
					Static78.aClass8_Sub20_Sub1_2.method1883(18);
				} else {
					Static78.aClass8_Sub20_Sub1_2.method1883(16);
				}
				Static78.aClass8_Sub20_Sub1_2.method1883(Static106.aClass8_Sub20_Sub1_3.anInt2853 + 93);
				Static78.aClass8_Sub20_Sub1_2.method1873(472);
				Static78.aClass8_Sub20_Sub1_2.method1883(Static108.aBoolean98 ? 1 : 0);
				Static41.method625(Static78.aClass8_Sub20_Sub1_2);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static82.aClass14_Sub1_14.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static90.aClass14_Sub1_4.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static100.aClass14_Sub1_18.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static38.aClass14_Sub1_7.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static94.aClass14_Sub1_17.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static36.aClass14_Sub1_6.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static67.aClass14_Sub1_9.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static82.aClass14_Sub1_15.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static92.aClass14_Sub1_16.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static9.aClass14_Sub1_2.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static70.aClass14_Sub1_11.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static77.aClass14_Sub1_13.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static129.aClass14_Sub1_19.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static68.aClass14_Sub1_10.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static76.aClass14_Sub1_12.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1873(Static8.aClass14_Sub1_1.anInt1886);
				Static78.aClass8_Sub20_Sub1_2.method1871(Static106.aClass8_Sub20_Sub1_3.aByteArray44, Static106.aClass8_Sub20_Sub1_3.anInt2853);
				Static93.aClass25_4.method586(Static78.aClass8_Sub20_Sub1_2.anInt2853, Static78.aClass8_Sub20_Sub1_2.aByteArray44);
				Static106.aClass8_Sub20_Sub1_3.method1904(local208);
				for (@Pc(419) int local419 = 0; local419 < 4; local419++) {
					local208[local419] += 50;
				}
				Static10.aClass8_Sub20_Sub1_1.method1904(local208);
				Static77.anInt1828 = 6;
			}
			if (Static77.anInt1828 == 6 && Static93.aClass25_4.method585() > 0) {
				local120 = Static93.aClass25_4.method582();
				if (local120 == 21 && Static61.anInt1587 == 20) {
					Static77.anInt1828 = 7;
				} else if (local120 == 2) {
					Static77.anInt1828 = 9;
				} else if (local120 == 15 && Static61.anInt1587 == 40) {
					Static106.method1510();
					return;
				} else if (local120 == 23 && Static30.anInt848 < 1) {
					Static77.anInt1828 = 0;
					Static30.anInt848++;
				} else {
					Static96.method341(local120);
					return;
				}
			}
			if (Static77.anInt1828 == 7 && Static93.aClass25_4.method585() > 0) {
				Static32.anInt870 = Static93.aClass25_4.method582() * 60 + 180;
				Static77.anInt1828 = 8;
			}
			if (Static77.anInt1828 == 8) {
				Static106.anInt2455 = 0;
				Static74.method1091(Static77.aClass34_843, Static44.method669(new Class34[] { Static44.method672(Static32.anInt870 / 60), Static33.aClass34_482 }), Static79.aClass34_856);
				if (--Static32.anInt870 <= 0) {
					Static77.anInt1828 = 0;
				}
			} else {
				if (Static77.anInt1828 == 9 && Static93.aClass25_4.method585() >= 8) {
					Static9.anInt194 = Static93.aClass25_4.method582();
					Static129.aBoolean111 = Static93.aClass25_4.method582() == 1;
					Static2.anInt33 = Static93.aClass25_4.method582();
					Static2.anInt33 <<= 0x8;
					Static2.anInt33 += Static93.aClass25_4.method582();
					Static102.anInt3092 = Static93.aClass25_4.method582();
					Static93.aClass25_4.method589(0, 1, Static10.aClass8_Sub20_Sub1_1.aByteArray44);
					Static10.aClass8_Sub20_Sub1_1.anInt2853 = 0;
					Static30.anInt852 = Static10.aClass8_Sub20_Sub1_1.method1909();
					Static93.aClass25_4.method589(0, 2, Static10.aClass8_Sub20_Sub1_1.aByteArray44);
					Static10.aClass8_Sub20_Sub1_1.anInt2853 = 0;
					Static32.anInt872 = Static10.aClass8_Sub20_Sub1_1.method1839();
					Static77.anInt1828 = 10;
				}
				if (Static77.anInt1828 != 10) {
					Static106.anInt2455++;
					if (Static106.anInt2455 > 2000) {
						if (Static30.anInt848 < 1) {
							if (Static64.anInt2037 == Static67.anInt1653) {
								Static67.anInt1653 = Static54.anInt1372;
							} else {
								Static67.anInt1653 = Static64.anInt2037;
							}
							Static77.anInt1828 = 0;
							Static30.anInt848++;
						} else {
							Static96.method341(-3);
						}
					}
				} else if (Static93.aClass25_4.method585() >= Static32.anInt872) {
					Static10.aClass8_Sub20_Sub1_1.anInt2853 = 0;
					Static93.aClass25_4.method589(0, Static32.anInt872, Static10.aClass8_Sub20_Sub1_1.aByteArray44);
					Static52.method774();
					Static132.anInt2834 = -1;
					Static62.method941(false);
					Static30.anInt852 = -1;
				}
			}
		} catch (@Pc(706) IOException local706) {
			if (Static30.anInt848 < 1) {
				Static77.anInt1828 = 0;
				Static30.anInt848++;
				if (Static67.anInt1653 == Static64.anInt2037) {
					Static67.anInt1653 = Static54.anInt1372;
				} else {
					Static67.anInt1653 = Static64.anInt2037;
				}
			} else {
				Static96.method341(-2);
			}
		}
	}
}
