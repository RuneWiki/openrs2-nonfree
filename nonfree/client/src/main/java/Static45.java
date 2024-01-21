import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!vd;")
	public static Class3_Sub1_Sub4_Sub4 aClass3_Sub1_Sub4_Sub4_1;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "Lclient!bb;")
	public static Class8 aClass8_15 = new Class8(64);

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "Lclient!ad;")
	public static Class4 aClass4_582 = Static75.method1216("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!ad;")
	private static Class4 aClass4_584 = Static75.method1216("Could not complete login)3");

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Lclient!ad;")
	public static Class4 aClass4_583 = aClass4_584;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
	public static int anInt1163 = 0;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!ad;")
	private static Class4 aClass4_585 = Static75.method1216("From");

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_586 = aClass4_585;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_587 = Static75.method1216("(U4");

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "Lclient!ad;")
	public static Class4 aClass4_588 = Static75.method1216("Entfernen");

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "Lclient!ad;")
	public static Class4 aClass4_589 = Static75.method1216("null");

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "[I")
	public static int[] anIntArray162 = new int[1000];

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public static void method813(@OriginalArg(1) int arg0) {
		Static13.anInt350 = Static60.anInt1489;
		Static34.method707();
		@Pc(16) int local16 = Static81.method1285(arg0).anInt1684;
		if (local16 == 0) {
			return;
		}
		@Pc(26) int local26 = Static106.anIntArray329[arg0];
		if (local16 == 1) {
			if (local26 == 1) {
				Static99.method1591(0.9D);
				((Class44) Static99.anInterface2_1).method964(0.9D);
			}
			if (local26 == 2) {
				Static99.method1591(0.8D);
				((Class44) Static99.anInterface2_1).method964(0.8D);
			}
			if (local26 == 3) {
				Static99.method1591(0.7D);
				((Class44) Static99.anInterface2_1).method964(0.7D);
			}
			if (local26 == 4) {
				Static99.method1591(0.6D);
				((Class44) Static99.anInterface2_1).method964(0.6D);
			}
			Static1.method2();
			Static103.aBoolean216 = true;
		}
		if (local16 == 3) {
			@Pc(84) short local84 = 0;
			if (local26 == 0) {
				local84 = 255;
			}
			if (local26 == 1) {
				local84 = 192;
			}
			if (local26 == 2) {
				local84 = 128;
			}
			if (local26 == 3) {
				local84 = 64;
			}
			if (local26 == 4) {
				local84 = 0;
			}
			if (Static90.anInt2816 != local84) {
				if (Static90.anInt2816 == 0 && Static103.anInt2538 != -1) {
					Static67.method1108(Static103.anInt2538, local84, 0, Static94.aClass64_Sub1_18);
					Static85.anInt1992 = 0;
				} else if (local84 == 0) {
					Static67.method1106();
					Static85.anInt1992 = 0;
				} else {
					Static93.method1639(local84);
				}
				Static90.anInt2816 = local84;
			}
		}
		if (local16 == 9) {
			Static96.anInt1729 = local26;
		}
		if (local16 == 6) {
			Static98.anInt2369 = local26;
		}
		if (local16 == 8) {
			Static86.aBoolean153 = true;
			Static112.anInt2829 = local26;
		}
		if (local16 == 10) {
			if (local26 == 0) {
				Static93.anInt2442 = 127;
			}
			if (local26 == 1) {
				Static93.anInt2442 = 96;
			}
			if (local26 == 2) {
				Static93.anInt2442 = 64;
			}
			if (local26 == 3) {
				Static93.anInt2442 = 32;
			}
			if (local26 == 4) {
				Static93.anInt2442 = 0;
			}
		}
		if (local16 == 4) {
			if (local26 == 0) {
				Static49.anInt1209 = 127;
			}
			if (local26 == 1) {
				Static49.anInt1209 = 96;
			}
			if (local26 == 2) {
				Static49.anInt1209 = 64;
			}
			if (local26 == 3) {
				Static49.anInt1209 = 32;
			}
			if (local26 == 4) {
				Static49.anInt1209 = 0;
			}
		}
		if (local16 == 5) {
			Static30.anInt941 = local26;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!sd;II)V")
	public static void method814(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(25) int local25;
		if ((arg2 & 0x400) != 0) {
			arg1.anInt2335 = Static32.aClass3_Sub4_Sub1_2.method459();
			local25 = Static32.aClass3_Sub4_Sub1_2.method432();
			if (arg1.anInt2335 == 65535) {
				arg1.anInt2335 = -1;
			}
			arg1.anInt2340 = (local25 & 0xFFFF) + Static60.anInt1489;
			arg1.anInt2338 = 0;
			if (Static60.anInt1489 < arg1.anInt2340) {
				arg1.anInt2338 = -1;
			}
			arg1.anInt2309 = 0;
			arg1.anInt2323 = local25 >> 16;
		}
		if ((arg2 & 0x40) != 0) {
			arg1.aClass4_1294 = Static32.aClass3_Sub4_Sub1_2.method417();
			if (arg1.aClass4_1294.method140(0) == 126) {
				arg1.aClass4_1294 = arg1.aClass4_1294.method137(1);
				Static21.method296(arg1.aClass4_1294, arg1.aClass4_1302, 2);
			} else if (arg1 == Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1) {
				Static21.method296(arg1.aClass4_1294, arg1.aClass4_1302, 2);
			}
			arg1.anInt2294 = 0;
			arg1.anInt2341 = 0;
			arg1.anInt2330 = 150;
		}
		@Pc(138) int local138;
		@Pc(192) int local192;
		if ((arg2 & 0x1) != 0) {
			local25 = Static32.aClass3_Sub4_Sub1_2.method459();
			if (local25 == 65535) {
				local25 = -1;
			}
			local138 = Static32.aClass3_Sub4_Sub1_2.method446();
			if (local25 == arg1.anInt2320 && local25 != -1) {
				local192 = Static67.method1107(local25).anInt1596;
				if (local192 == 1) {
					arg1.anInt2339 = 0;
					arg1.anInt2318 = local138;
					arg1.anInt2297 = 0;
					arg1.anInt2286 = 0;
				}
				if (local192 == 2) {
					arg1.anInt2286 = 0;
				}
			} else if (local25 == -1 || arg1.anInt2320 == -1 || Static67.method1107(local25).anInt1590 >= Static67.method1107(arg1.anInt2320).anInt1590) {
				arg1.anInt2318 = local138;
				arg1.anInt2320 = local25;
				arg1.anInt2297 = 0;
				arg1.anInt2286 = 0;
				arg1.anInt2339 = 0;
				arg1.anInt2315 = arg1.anInt2317;
			}
		}
		if ((arg2 & 0x20) != 0) {
			arg1.anInt2288 = Static32.aClass3_Sub4_Sub1_2.method452();
			if (arg1.anInt2288 == 65535) {
				arg1.anInt2288 = -1;
			}
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt2304 = Static32.aClass3_Sub4_Sub1_2.method449();
			arg1.anInt2336 = Static32.aClass3_Sub4_Sub1_2.method451();
			arg1.anInt2300 = Static32.aClass3_Sub4_Sub1_2.method449();
			arg1.anInt2311 = Static32.aClass3_Sub4_Sub1_2.method421();
			arg1.anInt2334 = Static32.aClass3_Sub4_Sub1_2.method414() + Static60.anInt1489;
			arg1.anInt2303 = Static32.aClass3_Sub4_Sub1_2.method439() + Static60.anInt1489;
			arg1.anInt2316 = Static32.aClass3_Sub4_Sub1_2.method451();
			arg1.method1549();
		}
		if ((arg2 & 0x80) != 0) {
			local25 = Static32.aClass3_Sub4_Sub1_2.method451();
			local138 = Static32.aClass3_Sub4_Sub1_2.method449();
			arg1.method1547(Static60.anInt1489, local138, local25);
			arg1.anInt2328 = Static60.anInt1489 + 300;
			arg1.anInt2344 = Static32.aClass3_Sub4_Sub1_2.method421();
			arg1.anInt2292 = Static32.aClass3_Sub4_Sub1_2.method446();
		}
		if ((arg2 & 0x2) != 0) {
			local25 = Static32.aClass3_Sub4_Sub1_2.method446();
			@Pc(333) byte[] local333 = new byte[local25];
			@Pc(338) Class3_Sub4 local338 = new Class3_Sub4(local333);
			Static32.aClass3_Sub4_Sub1_2.method418(local25, local333);
			Static74.aClass3_Sub4Array1[arg0] = local338;
			arg1.method1554(local338);
		}
		if ((arg2 & 0x4) != 0) {
			arg1.anInt2302 = Static32.aClass3_Sub4_Sub1_2.method414();
			arg1.anInt2345 = Static32.aClass3_Sub4_Sub1_2.method459();
		}
		if ((arg2 & 0x10) != 0) {
			local25 = Static32.aClass3_Sub4_Sub1_2.method452();
			local138 = Static32.aClass3_Sub4_Sub1_2.method446();
			local192 = Static32.aClass3_Sub4_Sub1_2.method421();
			@Pc(388) int local388 = Static32.aClass3_Sub4_Sub1_2.anInt627;
			if (arg1.aClass4_1302 != null && arg1.aClass41_2 != null) {
				@Pc(399) long local399 = arg1.aClass4_1302.method149();
				@Pc(401) boolean local401 = false;
				if (local138 <= 1) {
					for (@Pc(406) int local406 = 0; local406 < Static28.anInt869; local406++) {
						if (Static13.aLongArray6[local406] == local399) {
							local401 = true;
							break;
						}
					}
				}
				if (!local401 && Static58.anInt1430 == 0) {
					Static76.aClass3_Sub4_5.anInt627 = 0;
					Static32.aClass3_Sub4_Sub1_2.method418(local192, Static76.aClass3_Sub4_5.aByteArray4);
					Static76.aClass3_Sub4_5.anInt627 = 0;
					@Pc(456) Class4 local456 = Static90.method1921(Static76.aClass3_Sub4_5).method157();
					arg1.aClass4_1294 = local456.method124();
					arg1.anInt2330 = 150;
					arg1.anInt2341 = local25 >> 8;
					arg1.anInt2294 = local25 & 0xFF;
					if (local138 == 2 || local138 == 3) {
						Static21.method296(local456, Static60.method1012(new Class4[] { Static75.aClass4_996, arg1.aClass4_1302 }), 1);
					} else if (local138 == 1) {
						Static21.method296(local456, Static60.method1012(new Class4[] { Static93.aClass4_1336, arg1.aClass4_1302 }), 1);
					} else {
						Static21.method296(local456, arg1.aClass4_1302, 2);
					}
				}
			}
			Static32.aClass3_Sub4_Sub1_2.anInt627 = local192 + local388;
		}
		if ((arg2 & 0x200) == 0) {
			return;
		}
		local25 = Static32.aClass3_Sub4_Sub1_2.method446();
		local138 = Static32.aClass3_Sub4_Sub1_2.method421();
		arg1.method1547(Static60.anInt1489, local138, local25);
		arg1.anInt2328 = Static60.anInt1489 + 300;
		arg1.anInt2344 = Static32.aClass3_Sub4_Sub1_2.method421();
		arg1.anInt2292 = Static32.aClass3_Sub4_Sub1_2.method451();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method815() {
		aClass4_584 = null;
		aClass4_585 = null;
		aClass4_587 = null;
		aClass4_588 = null;
		anIntArray162 = null;
		aClass8_15 = null;
		anIntArrayArray14 = null;
		aClass4_586 = null;
		aClass4_583 = null;
		aClass4_589 = null;
		aClass4_582 = null;
		aClass3_Sub1_Sub4_Sub4_1 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method816() {
		try {
			if (Static54.anInt1278 == 0) {
				if (Static53.aClass31_6 != null) {
					Static53.aClass31_6.method717();
					Static53.aClass31_6 = null;
				}
				Static54.anInt1278 = 1;
				Static112.anInt2823 = 0;
				Static30.aClass42_3 = null;
				Static11.aBoolean251 = false;
			}
			if (Static54.anInt1278 == 1) {
				if (Static30.aClass42_3 == null) {
					Static30.aClass42_3 = Static24.aClass2_1.method16(Static24.anInt684);
				}
				if (Static30.aClass42_3.anInt1395 == 2) {
					throw new IOException();
				}
				if (Static30.aClass42_3.anInt1395 == 1) {
					Static53.aClass31_6 = new Class31((Socket) Static30.aClass42_3.anObject2, Static24.aClass2_1);
					Static30.aClass42_3 = null;
					Static54.anInt1278 = 2;
				}
			}
			if (Static54.anInt1278 == 2) {
				@Pc(72) long local72 = Static31.aLong36 = Static95.aClass4_1260.method149();
				Static5.aClass3_Sub4_Sub1_1.anInt627 = 0;
				@Pc(82) int local82 = (int) (local72 >> 16 & 0x1FL);
				Static5.aClass3_Sub4_Sub1_1.method423(14);
				Static5.aClass3_Sub4_Sub1_1.method423(local82);
				Static53.aClass31_6.method716(2, Static5.aClass3_Sub4_Sub1_1.aByteArray4);
				Static54.anInt1278 = 3;
				Static32.aClass3_Sub4_Sub1_2.anInt627 = 0;
			}
			@Pc(111) int local111;
			if (Static54.anInt1278 == 3) {
				local111 = Static53.aClass31_6.method713();
				if (local111 != 0) {
					Static39.method732(local111);
					return;
				}
				Static32.aClass3_Sub4_Sub1_2.anInt627 = 0;
				Static54.anInt1278 = 4;
			}
			if (Static54.anInt1278 == 4) {
				if (Static32.aClass3_Sub4_Sub1_2.anInt627 < 8) {
					local111 = Static53.aClass31_6.method715();
					if (local111 > 8 - Static32.aClass3_Sub4_Sub1_2.anInt627) {
						local111 = 8 - Static32.aClass3_Sub4_Sub1_2.anInt627;
					}
					if (local111 > 0) {
						Static53.aClass31_6.method711(Static32.aClass3_Sub4_Sub1_2.anInt627, local111, Static32.aClass3_Sub4_Sub1_2.aByteArray4);
						Static32.aClass3_Sub4_Sub1_2.anInt627 += local111;
					}
				}
				if (Static32.aClass3_Sub4_Sub1_2.anInt627 == 8) {
					Static32.aClass3_Sub4_Sub1_2.anInt627 = 0;
					Static7.aLong7 = Static32.aClass3_Sub4_Sub1_2.method428();
					Static54.anInt1278 = 5;
				}
			}
			if (Static54.anInt1278 == 5) {
				@Pc(196) int[] local196 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static7.aLong7 >> 32), (int) Static7.aLong7 };
				Static5.aClass3_Sub4_Sub1_1.anInt627 = 0;
				Static5.aClass3_Sub4_Sub1_1.method423(10);
				Static5.aClass3_Sub4_Sub1_1.method424(local196[0]);
				Static5.aClass3_Sub4_Sub1_1.method424(local196[1]);
				Static5.aClass3_Sub4_Sub1_1.method424(local196[2]);
				Static5.aClass3_Sub4_Sub1_1.method424(local196[3]);
				Static5.aClass3_Sub4_Sub1_1.method424(Static24.aClass2_1.anInt11);
				Static5.aClass3_Sub4_Sub1_1.method456(Static95.aClass4_1260.method149());
				Static5.aClass3_Sub4_Sub1_1.method453(Static95.aClass4_1256);
				Static5.aClass3_Sub4_Sub1_1.method420(Static67.aBigInteger2, Static28.aBigInteger1);
				Static55.aClass3_Sub4_Sub1_3.anInt627 = 0;
				if (Static20.anInt479 == 40) {
					Static55.aClass3_Sub4_Sub1_3.method423(18);
				} else {
					Static55.aClass3_Sub4_Sub1_3.method423(16);
				}
				Static55.aClass3_Sub4_Sub1_3.method423(Static5.aClass3_Sub4_Sub1_1.anInt627 + 57);
				Static55.aClass3_Sub4_Sub1_3.method424(433);
				Static55.aClass3_Sub4_Sub1_3.method423(Static36.aBoolean70 ? 1 : 0);
				Static55.aClass3_Sub4_Sub1_3.method424(Static35.aClass64_Sub1_3.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static42.aClass64_Sub1_9.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static47.aClass64_Sub1_10.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static74.aClass64_Sub1_17.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static96.aClass64_Sub1_15.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static20.aClass64_Sub1_1.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static94.aClass64_Sub1_18.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static67.aClass64_Sub1_13.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static31.aClass64_Sub1_8.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static74.aClass64_Sub1_16.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static67.aClass64_Sub1_12.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static110.aClass64_Sub1_20.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method424(Static96.aClass64_Sub1_14.anInt2434);
				Static55.aClass3_Sub4_Sub1_3.method427(Static5.aClass3_Sub4_Sub1_1.anInt627, Static5.aClass3_Sub4_Sub1_1.aByteArray4);
				Static53.aClass31_6.method716(Static55.aClass3_Sub4_Sub1_3.anInt627, Static55.aClass3_Sub4_Sub1_3.aByteArray4);
				Static5.aClass3_Sub4_Sub1_1.method463(local196);
				for (@Pc(397) int local397 = 0; local397 < 4; local397++) {
					local196[local397] += 50;
				}
				Static32.aClass3_Sub4_Sub1_2.method463(local196);
				Static54.anInt1278 = 6;
			}
			if (Static54.anInt1278 == 6 && Static53.aClass31_6.method715() > 0) {
				local111 = Static53.aClass31_6.method713();
				if (local111 == 21 && Static20.anInt479 == 20) {
					Static54.anInt1278 = 7;
				} else if (local111 == 2) {
					Static54.anInt1278 = 9;
				} else if (local111 == 15 && Static20.anInt479 == 40) {
					Static94.method1482();
					return;
				} else if (local111 == 23 && Static15.anInt359 < 1) {
					Static15.anInt359++;
					Static54.anInt1278 = 0;
				} else {
					Static39.method732(local111);
					return;
				}
			}
			if (Static54.anInt1278 == 7 && Static53.aClass31_6.method715() > 0) {
				Static68.anInt1654 = (Static53.aClass31_6.method713() + 3) * 60;
				Static54.anInt1278 = 8;
			}
			if (Static54.anInt1278 == 8) {
				Static112.anInt2823 = 0;
				Static103.method1696(Static72.aClass4_920, Static60.method1012(new Class4[] { Static93.method1632(Static68.anInt1654 / 60), Static61.aClass4_785 }), Static61.aClass4_779);
				if (--Static68.anInt1654 <= 0) {
					Static54.anInt1278 = 0;
				}
			} else {
				if (Static54.anInt1278 == 9 && Static53.aClass31_6.method715() >= 8) {
					Static67.anInt1652 = Static53.aClass31_6.method713();
					Static11.aBoolean252 = Static53.aClass31_6.method713() == 1;
					Static110.anInt2775 = Static53.aClass31_6.method713();
					Static110.anInt2775 <<= 0x8;
					Static110.anInt2775 += Static53.aClass31_6.method713();
					Static51.anInt1255 = Static53.aClass31_6.method713();
					Static53.aClass31_6.method711(0, 1, Static32.aClass3_Sub4_Sub1_2.aByteArray4);
					Static32.aClass3_Sub4_Sub1_2.anInt627 = 0;
					Static4.anInt201 = Static32.aClass3_Sub4_Sub1_2.method470();
					Static53.aClass31_6.method711(0, 2, Static32.aClass3_Sub4_Sub1_2.aByteArray4);
					Static32.aClass3_Sub4_Sub1_2.anInt627 = 0;
					Static65.anInt1630 = Static32.aClass3_Sub4_Sub1_2.method459();
					Static54.anInt1278 = 10;
				}
				if (Static54.anInt1278 != 10) {
					Static112.anInt2823++;
					if (Static112.anInt2823 > 2000) {
						if (Static15.anInt359 < 1) {
							Static54.anInt1278 = 0;
							Static15.anInt359++;
							if (Static24.anInt684 == Static75.anInt1790) {
								Static24.anInt684 = Static75.anInt1798;
							} else {
								Static24.anInt684 = Static75.anInt1790;
							}
						} else {
							Static39.method732(-3);
						}
					}
				} else if (Static53.aClass31_6.method715() >= Static65.anInt1630) {
					Static32.aClass3_Sub4_Sub1_2.anInt627 = 0;
					Static53.aClass31_6.method711(0, Static65.anInt1630, Static32.aClass3_Sub4_Sub1_2.aByteArray4);
					Static6.method168();
					Static92.anInt2106 = -1;
					Static106.method1811(false);
					Static4.anInt201 = -1;
				}
			}
		} catch (@Pc(679) IOException local679) {
			if (Static15.anInt359 < 1) {
				Static54.anInt1278 = 0;
				Static15.anInt359++;
				if (Static24.anInt684 == Static75.anInt1790) {
					Static24.anInt684 = Static75.anInt1798;
				} else {
					Static24.anInt684 = Static75.anInt1790;
				}
			} else {
				Static39.method732(-2);
			}
		}
	}
}
