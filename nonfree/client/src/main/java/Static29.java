import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!ge;")
	public static Class7 aClass7_17;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
	public static int anInt935 = 0;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "Lclient!mb;")
	public static Class49 aClass49_8 = new Class49(64);

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!rd;")
	private static Class63 aClass63_538 = Static80.method1463("Offline");

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!rd;")
	private static Class63 aClass63_539 = Static80.method1463("Members object");

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
	public static int anInt939 = 0;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public static volatile int anInt942 = 0;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "Lclient!rd;")
	public static Class63 aClass63_540 = aClass63_538;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Lclient!rd;")
	private static Class63 aClass63_541 = Static80.method1463("::noclip");

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "Lclient!rd;")
	public static Class63 aClass63_542 = aClass63_539;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "[[B")
	public static byte[][] aByteArrayArray2 = new byte[50][];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method703() {
		while (Static120.method2145()) {
			if (Static102.anInt2833 != -1 && Static102.anInt2833 == Static112.anInt3084) {
				if (Static79.anInt2157 == 85 && Static111.aClass63_1652.method1811() > 0) {
					Static111.aClass63_1652 = Static111.aClass63_1652.method1820(Static111.aClass63_1652.method1811() - 1, 0);
				}
				if ((Static98.method1812(Static123.anInt3314) || Static123.anInt3314 == 32) && Static111.aClass63_1652.method1811() < 12) {
					Static111.aClass63_1652 = Static111.aClass63_1652.method1818(Static123.anInt3314);
				}
			} else {
				@Pc(128) int local128;
				if (Static32.aBoolean57) {
					if (Static79.anInt2157 == 85 && Static111.aClass63_1662.method1811() > 0) {
						Static111.aClass63_1662 = Static111.aClass63_1662.method1820(Static111.aClass63_1662.method1811() - 1, 0);
						Static15.aBoolean29 = true;
					}
					if (Static30.method725(Static123.anInt3314) && Static111.aClass63_1662.method1811() < 80) {
						Static111.aClass63_1662 = Static111.aClass63_1662.method1818(Static123.anInt3314);
						Static15.aBoolean29 = true;
					}
					if (Static79.anInt2157 == 84) {
						Static15.aBoolean29 = true;
						Static32.aBoolean57 = false;
						@Pc(1302) long local1302;
						if (Static50.anInt1523 == 1) {
							local1302 = Static111.aClass63_1662.method1823();
							Static91.method1666(local1302);
						}
						if (Static50.anInt1523 == 2 && Static5.anInt52 > 0) {
							local1302 = Static111.aClass63_1662.method1823();
							Static39.method883(local1302);
						}
						if (Static50.anInt1523 == 3 && Static111.aClass63_1662.method1811() > 0) {
							Static23.aClass6_Sub4_Sub1_4.method1347(157);
							Static23.aClass6_Sub4_Sub1_4.method1330(0);
							local128 = Static23.aClass6_Sub4_Sub1_4.anInt1949;
							Static23.aClass6_Sub4_Sub1_4.method1331(Static13.aLong18);
							Static124.method2174(Static111.aClass63_1662, Static23.aClass6_Sub4_Sub1_4);
							Static23.aClass6_Sub4_Sub1_4.method1316(Static23.aClass6_Sub4_Sub1_4.anInt1949 - local128);
							if (Static38.anInt1233 == 2) {
								Static96.aBoolean146 = true;
								Static38.anInt1233 = 1;
								Static23.aClass6_Sub4_Sub1_4.method1347(51);
								Static23.aClass6_Sub4_Sub1_4.method1330(Static15.anInt494);
								Static23.aClass6_Sub4_Sub1_4.method1330(Static38.anInt1233);
								Static23.aClass6_Sub4_Sub1_4.method1330(Static68.anInt1974);
							}
						}
						if (Static50.anInt1523 == 4 && Static92.anInt2592 < 100) {
							local1302 = Static111.aClass63_1662.method1823();
							Static44.method957(local1302);
						}
						if (Static50.anInt1523 == 5 && Static92.anInt2592 > 0) {
							local1302 = Static111.aClass63_1662.method1823();
							Static47.method1025(local1302);
						}
					}
				} else if (Static70.anInt2011 == 1) {
					if (Static79.anInt2157 == 85 && Static111.aClass63_1657.method1811() > 0) {
						Static111.aClass63_1657 = Static111.aClass63_1657.method1820(Static111.aClass63_1657.method1811() - 1, 0);
						Static15.aBoolean29 = true;
					}
					if (Static51.method1067(Static123.anInt3314) && Static111.aClass63_1657.method1811() < 10) {
						Static111.aClass63_1657 = Static111.aClass63_1657.method1818(Static123.anInt3314);
						Static15.aBoolean29 = true;
					}
					if (Static79.anInt2157 == 84) {
						if (Static111.aClass63_1657.method1811() > 0) {
							local128 = 0;
							if (Static111.aClass63_1657.method1807()) {
								local128 = Static111.aClass63_1657.method1796();
							}
							Static23.aClass6_Sub4_Sub1_4.method1347(144);
							Static23.aClass6_Sub4_Sub1_4.method1292(local128);
						}
						Static15.aBoolean29 = true;
						Static70.anInt2011 = 0;
					}
				} else if (Static70.anInt2011 == 2) {
					if (Static79.anInt2157 == 85 && Static111.aClass63_1657.method1811() > 0) {
						Static111.aClass63_1657 = Static111.aClass63_1657.method1820(Static111.aClass63_1657.method1811() - 1, 0);
						Static15.aBoolean29 = true;
					}
					if ((Static98.method1812(Static123.anInt3314) || Static123.anInt3314 == 32) && Static111.aClass63_1657.method1811() < 12) {
						Static111.aClass63_1657 = Static111.aClass63_1657.method1818(Static123.anInt3314);
						Static15.aBoolean29 = true;
					}
					if (Static79.anInt2157 == 84) {
						if (Static111.aClass63_1657.method1811() > 0) {
							Static23.aClass6_Sub4_Sub1_4.method1347(143);
							Static23.aClass6_Sub4_Sub1_4.method1331(Static111.aClass63_1657.method1823());
						}
						Static70.anInt2011 = 0;
						Static15.aBoolean29 = true;
					}
				} else if (Static70.anInt2011 == 3) {
					if (Static79.anInt2157 == 85 && Static111.aClass63_1657.method1811() > 0) {
						Static111.aClass63_1657 = Static111.aClass63_1657.method1820(Static111.aClass63_1657.method1811() - 1, 0);
						Static15.aBoolean29 = true;
					}
					if (Static30.method725(Static123.anInt3314) && Static111.aClass63_1657.method1811() < 40) {
						Static111.aClass63_1657 = Static111.aClass63_1657.method1818(Static123.anInt3314);
						Static15.aBoolean29 = true;
					}
				} else if (Static70.anInt2011 == 4) {
					if (Static79.anInt2157 == 85 && Static111.aClass63_1657.method1811() > 0) {
						Static111.aClass63_1657 = Static111.aClass63_1657.method1820(Static111.aClass63_1657.method1811() - 1, 0);
						Static15.aBoolean29 = true;
					}
					if ((Static30.method725(Static123.anInt3314) || Static123.anInt3314 == 32) && Static111.aClass63_1657.method1811() < 80) {
						Static111.aClass63_1657 = Static111.aClass63_1657.method1818(Static123.anInt3314);
						Static15.aBoolean29 = true;
					}
					if (Static79.anInt2157 == 84) {
						if (Static111.aClass63_1657.method1811() > 0) {
							Static23.aClass6_Sub4_Sub1_4.method1347(173);
							Static23.aClass6_Sub4_Sub1_4.method1330(Static111.aClass63_1657.method1811() + 1);
							Static23.aClass6_Sub4_Sub1_4.method1315(Static111.aClass63_1657);
						}
						Static70.anInt2011 = 0;
						Static15.aBoolean29 = true;
					}
				} else if (Static49.anInt1513 == -1 && Static14.anInt480 == -1) {
					if (Static124.anInt3327 != 0 || Static22.anInt687 > 1) {
						Static47.method1022();
					}
					if (Static79.anInt2157 == 85 && Static111.aClass63_1651.method1811() > 0) {
						Static111.aClass63_1651 = Static111.aClass63_1651.method1820(Static111.aClass63_1651.method1811() - 1, 0);
						Static15.aBoolean29 = true;
					}
					if (Static30.method725(Static123.anInt3314) && Static111.aClass63_1651.method1811() < 80) {
						Static111.aClass63_1651 = Static111.aClass63_1651.method1818(Static123.anInt3314);
						Static15.aBoolean29 = true;
					}
					if (Static79.anInt2157 == 84 && Static111.aClass63_1651.method1811() > 0) {
						if (Static124.anInt3327 != 0 || Static22.anInt687 > 1) {
							Static113.aClass63Array6[Static47.anInt1485++] = Static111.aClass63_1651;
							Static87.anInt2412 = -1;
							if (Static47.anInt1485 >= 20) {
								Static47.anInt1485 = 0;
							}
						}
						if (Static22.anInt687 == 2) {
							if (Static111.aClass63_1651.method1819(Static7.aClass63_77)) {
								System.gc();
							}
							if (Static111.aClass63_1651.method1819(Static105.aClass63_1577)) {
								Static85.method1864();
							}
							if (Static111.aClass63_1651.method1819(Static6.aClass63_62)) {
								aBoolean48 = true;
							}
							if (Static111.aClass63_1651.method1819(Static61.aClass63_978)) {
								aBoolean48 = false;
							}
							if (Static111.aClass63_1651.method1819(aClass63_541)) {
								for (local128 = 0; local128 < 4; local128++) {
									for (@Pc(373) int local373 = 1; local373 < 103; local373++) {
										for (@Pc(377) int local377 = 1; local377 < 103; local377++) {
											Static15.aClass30Array1[local128].anIntArrayArray18[local373][local377] = 0;
										}
									}
								}
							}
							if (Static111.aClass63_1651.method1819(Static86.aClass63_1236) && Static124.anInt3327 == 2) {
								throw new RuntimeException();
							}
							if (Static111.aClass63_1651.method1819(Static35.aClass63_623)) {
								Static66.aBoolean170 = true;
							}
						}
						if (Static111.aClass63_1651.method1803(Static60.aClass63_949)) {
							Static23.aClass6_Sub4_Sub1_4.method1347(45);
							Static23.aClass6_Sub4_Sub1_4.method1330(Static111.aClass63_1651.method1811() - 1);
							Static23.aClass6_Sub4_Sub1_4.method1315(Static111.aClass63_1651.method1806(2));
						} else {
							@Pc(430) byte local430 = 0;
							@Pc(436) byte local436 = 0;
							@Pc(440) Class63 local440 = Static111.aClass63_1651.method1829();
							if (local440.method1803(Static37.aClass63_656)) {
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static37.aClass63_656.method1811());
								local430 = 0;
							} else if (local440.method1803(Static56.aClass63_892)) {
								local430 = 1;
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static56.aClass63_892.method1811());
							} else if (local440.method1803(Static81.aClass63_1177)) {
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static81.aClass63_1177.method1811());
								local430 = 2;
							} else if (local440.method1803(Static49.aClass63_800)) {
								local430 = 3;
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static49.aClass63_800.method1811());
							} else if (local440.method1803(Static25.aClass63_509)) {
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static25.aClass63_509.method1811());
								local430 = 4;
							} else if (local440.method1803(Static64.aClass63_985)) {
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static64.aClass63_985.method1811());
								local430 = 5;
							} else if (local440.method1803(Static79.aClass63_1130)) {
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static79.aClass63_1130.method1811());
								local430 = 6;
							} else if (local440.method1803(Static92.aClass63_1353)) {
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static92.aClass63_1353.method1811());
								local430 = 7;
							} else if (local440.method1803(Static60.aClass63_951)) {
								local430 = 8;
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static60.aClass63_951.method1811());
							} else if (local440.method1803(Static10.aClass63_257)) {
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static10.aClass63_257.method1811());
								local430 = 9;
							} else if (local440.method1803(Static36.aClass63_652)) {
								local430 = 10;
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static36.aClass63_652.method1811());
							} else if (local440.method1803(Static42.aClass63_723)) {
								local430 = 11;
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static42.aClass63_723.method1811());
							} else if (Static65.anInt1845 != 0) {
								if (local440.method1803(Static37.aClass63_659)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static37.aClass63_659.method1811());
									local430 = 0;
								} else if (local440.method1803(Static56.aClass63_889)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static56.aClass63_889.method1811());
									local430 = 1;
								} else if (local440.method1803(Static81.aClass63_1175)) {
									local430 = 2;
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static81.aClass63_1175.method1811());
								} else if (local440.method1803(Static49.aClass63_803)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static49.aClass63_803.method1811());
									local430 = 3;
								} else if (local440.method1803(Static25.aClass63_516)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static25.aClass63_516.method1811());
									local430 = 4;
								} else if (local440.method1803(Static64.aClass63_984)) {
									local430 = 5;
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static64.aClass63_984.method1811());
								} else if (local440.method1803(Static79.aClass63_1129)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static79.aClass63_1129.method1811());
									local430 = 6;
								} else if (local440.method1803(Static92.aClass63_1357)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static92.aClass63_1357.method1811());
									local430 = 7;
								} else if (local440.method1803(Static60.aClass63_950)) {
									local430 = 8;
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static60.aClass63_950.method1811());
								} else if (local440.method1803(Static10.aClass63_260)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static10.aClass63_260.method1811());
									local430 = 9;
								} else if (local440.method1803(Static36.aClass63_651)) {
									local430 = 10;
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static36.aClass63_651.method1811());
								} else if (local440.method1803(Static42.aClass63_720)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static42.aClass63_720.method1811());
									local430 = 11;
								}
							}
							local440 = Static111.aClass63_1651.method1829();
							if (local440.method1803(Static7.aClass63_82)) {
								local436 = 1;
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static7.aClass63_82.method1811());
							} else if (local440.method1803(Static86.aClass63_1246)) {
								local436 = 2;
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static86.aClass63_1246.method1811());
							} else if (local440.method1803(Static13.aClass63_292)) {
								local436 = 3;
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static13.aClass63_292.method1811());
							} else if (local440.method1803(Static2.aClass63_9)) {
								local436 = 4;
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static2.aClass63_9.method1811());
							} else if (local440.method1803(Static2.aClass63_15)) {
								local436 = 5;
								Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static2.aClass63_15.method1811());
							} else if (Static65.anInt1845 != 0) {
								if (local440.method1803(Static7.aClass63_80)) {
									local436 = 1;
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static7.aClass63_80.method1811());
								} else if (local440.method1803(Static86.aClass63_1244)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static86.aClass63_1244.method1811());
									local436 = 2;
								} else if (local440.method1803(Static13.aClass63_291)) {
									local436 = 3;
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static13.aClass63_291.method1811());
								} else if (local440.method1803(Static2.aClass63_12)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static2.aClass63_12.method1811());
									local436 = 4;
								} else if (local440.method1803(Static2.aClass63_10)) {
									Static111.aClass63_1651 = Static111.aClass63_1651.method1806(Static2.aClass63_10.method1811());
									local436 = 5;
								}
							}
							Static23.aClass6_Sub4_Sub1_4.method1347(136);
							Static23.aClass6_Sub4_Sub1_4.method1330(0);
							@Pc(1039) int local1039 = Static23.aClass6_Sub4_Sub1_4.anInt1949;
							Static23.aClass6_Sub4_Sub1_4.method1330(local430);
							Static23.aClass6_Sub4_Sub1_4.method1330(local436);
							Static124.method2174(Static111.aClass63_1651, Static23.aClass6_Sub4_Sub1_4);
							Static23.aClass6_Sub4_Sub1_4.method1316(Static23.aClass6_Sub4_Sub1_4.anInt1949 - local1039);
							if (Static15.anInt494 == 2) {
								Static15.anInt494 = 3;
								Static96.aBoolean146 = true;
								Static23.aClass6_Sub4_Sub1_4.method1347(51);
								Static23.aClass6_Sub4_Sub1_4.method1330(Static15.anInt494);
								Static23.aClass6_Sub4_Sub1_4.method1330(Static38.anInt1233);
								Static23.aClass6_Sub4_Sub1_4.method1330(Static68.anInt1974);
							}
						}
						Static15.aBoolean29 = true;
						Static111.aClass63_1651 = Static111.aClass63_1661;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method708() {
		for (@Pc(14) Class6_Sub17 local14 = (Class6_Sub17) Static81.aClass1_4.method3(); local14 != null; local14 = (Class6_Sub17) Static81.aClass1_4.method14()) {
			if (local14.aClass6_Sub3_Sub10_1 != null) {
				local14.method1850();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ge;ILclient!ge;)V")
	public static void method709(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static30.aClass7_18 = arg1;
		Static103.aClass7_59 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	public static void method710() {
		if (Static18.aClass47_1 != null) {
			Static18.aClass47_1.method1378();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZILclient!m;)V")
	public static void method716(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class47 arg1) {
		if (Static18.aClass47_1 != null) {
			try {
				Static18.aClass47_1.method1378();
			} catch (@Pc(8) Exception local8) {
			}
			Static18.aClass47_1 = null;
		}
		Static18.aClass47_1 = arg1;
		Static52.method1070(arg0);
		Static61.anInt1802 = 0;
		Static51.aClass6_Sub4_2 = null;
		Static117.aClass6_Sub4_6.anInt1949 = 0;
		Static76.aClass6_Sub3_Sub16_1 = null;
		while (true) {
			@Pc(33) Class6_Sub3_Sub16 local33 = (Class6_Sub3_Sub16) Static25.aClass2_5.method25();
			if (local33 == null) {
				while (true) {
					local33 = (Class6_Sub3_Sub16) Static20.aClass2_4.method25();
					if (local33 == null) {
						if (Static30.aByte3 != 0) {
							try {
								@Pc(90) Class6_Sub4 local90 = new Class6_Sub4(4);
								local90.method1330(4);
								local90.method1330(Static30.aByte3);
								local90.method1332(0);
								Static18.aClass47_1.method1377(4, local90.aByteArray27);
							} catch (@Pc(115) IOException local115) {
								try {
									Static18.aClass47_1.method1378();
								} catch (@Pc(122) Exception local122) {
								}
								Static18.aClass47_1 = null;
								Static67.anInt1854++;
							}
						}
						Static43.anInt140 = 0;
						Static78.aLong52 = Static89.method1607();
						return;
					}
					Static113.aClass61_2.method1676(local33);
					Static2.aClass2_1.method18(local33, local33.aLong91);
					Static97.anInt2729++;
					Static109.anInt3033--;
				}
			}
			Static31.aClass2_6.method18(local33, local33.aLong91);
			Static74.anInt2069++;
			Static97.anInt2730--;
		}
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
	public static void method717() {
		aClass7_17 = null;
		aClass63_542 = null;
		aClass63_540 = null;
		aClass49_8 = null;
		aClass63_538 = null;
		aByteArrayArray2 = null;
		aClass63_539 = null;
		aClass63_541 = null;
	}
}
