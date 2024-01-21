import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
	public static int anInt162;

	@OriginalMember(owner = "client!bb", name = "lb", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_4;

	@OriginalMember(owner = "client!bb", name = "W", descriptor = "Lclient!mb;")
	private static Class45 aClass45_72 = Static63.method1251("To play on this world move to a free area first");

	@OriginalMember(owner = "client!bb", name = "S", descriptor = "Lclient!mb;")
	public static Class45 aClass45_71 = aClass45_72;

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "Lclient!mb;")
	private static Class45 aClass45_73 = Static63.method1251("::fpson");

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lclient!mb;")
	public static Class45 aClass45_74 = Static63.method1251("backhmid2");

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "Lclient!na;")
	public static Class5_Sub9_Sub1 aClass5_Sub9_Sub1_1 = new Class5_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!bb", name = "hb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_75 = Static63.method1251("Cabbage");

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lclient!mb;")
	public static Class45 aClass45_76 = Static63.method1251("blinken2:");

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_78 = Static63.method1251("Examine");

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_77 = aClass45_78;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
	public static void method113() {
		aClass45_77 = null;
		aClass29_Sub1_4 = null;
		aClass45_72 = null;
		aClass45_74 = null;
		aClass45_75 = null;
		aClass45_78 = null;
		aClass45_73 = null;
		aClass45_76 = null;
		aClass5_Sub9_Sub1_1 = null;
		aClass45_71 = null;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(Z)V")
	public static void method114() {
		if (Static78.anInt2212 > 0) {
			Static96.method1796();
		} else {
			Static39.method1422(40);
			Static109.aClass7_4 = Static104.aClass7_3;
			Static104.aClass7_3 = null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	public static void method115() {
		while (Static117.method2126()) {
			if (Static63.anInt1837 != -1 && Static68.anInt1959 == Static63.anInt1837) {
				if (Static47.anInt1349 == 85 && Static78.aClass45_922.method1317() > 0) {
					Static78.aClass45_922 = Static78.aClass45_922.method1322(Static78.aClass45_922.method1317() - 1, 0);
				}
				if ((Static1.method8(Static25.anInt792) || Static25.anInt792 == 32) && Static78.aClass45_922.method1317() < 12) {
					Static78.aClass45_922 = Static78.aClass45_922.method1326(Static25.anInt792);
				}
			} else {
				@Pc(123) int local123;
				if (Static93.aBoolean116) {
					if (Static47.anInt1349 == 85 && Static78.aClass45_930.method1317() > 0) {
						Static78.aClass45_930 = Static78.aClass45_930.method1322(Static78.aClass45_930.method1317() - 1, 0);
						Static51.aBoolean81 = true;
					}
					if (Static59.method1213(Static25.anInt792) && Static78.aClass45_930.method1317() < 80) {
						Static78.aClass45_930 = Static78.aClass45_930.method1326(Static25.anInt792);
						Static51.aBoolean81 = true;
					}
					if (Static47.anInt1349 == 84) {
						Static93.aBoolean116 = false;
						Static51.aBoolean81 = true;
						@Pc(79) long local79;
						if (Static7.anInt191 == 1) {
							local79 = Static78.aClass45_930.method1299();
							Static80.method1505(local79);
						}
						if (Static7.anInt191 == 2 && Static104.anInt2772 > 0) {
							local79 = Static78.aClass45_930.method1299();
							Static25.method560(local79);
						}
						if (Static7.anInt191 == 3 && Static78.aClass45_930.method1317() > 0) {
							Static64.aClass5_Sub9_Sub1_2.method1466(59);
							Static64.aClass5_Sub9_Sub1_2.method1428(0);
							local123 = Static64.aClass5_Sub9_Sub1_2.anInt2140;
							Static64.aClass5_Sub9_Sub1_2.method1454(Static54.aLong78);
							Static3.method65(Static64.aClass5_Sub9_Sub1_2, Static78.aClass45_930);
							Static64.aClass5_Sub9_Sub1_2.method1440(Static64.aClass5_Sub9_Sub1_2.anInt2140 - local123);
							if (Static36.anInt1058 == 2) {
								Static36.anInt1058 = 1;
								Static96.aBoolean121 = true;
								Static64.aClass5_Sub9_Sub1_2.method1466(198);
								Static64.aClass5_Sub9_Sub1_2.method1428(Static71.anInt2080);
								Static64.aClass5_Sub9_Sub1_2.method1428(Static36.anInt1058);
								Static64.aClass5_Sub9_Sub1_2.method1428(Static70.anInt2023);
							}
						}
						if (Static7.anInt191 == 4 && Static69.anInt1993 < 100) {
							local79 = Static78.aClass45_930.method1299();
							Static100.method1843(local79);
						}
						if (Static7.anInt191 == 5 && Static69.anInt1993 > 0) {
							local79 = Static78.aClass45_930.method1299();
							Static71.method1386(local79);
						}
					}
				} else if (Static75.anInt2178 == 1) {
					if (Static47.anInt1349 == 85 && Static78.aClass45_923.method1317() > 0) {
						Static78.aClass45_923 = Static78.aClass45_923.method1322(Static78.aClass45_923.method1317() - 1, 0);
						Static51.aBoolean81 = true;
					}
					if (Static101.method762(Static25.anInt792) && Static78.aClass45_923.method1317() < 10) {
						Static78.aClass45_923 = Static78.aClass45_923.method1326(Static25.anInt792);
						Static51.aBoolean81 = true;
					}
					if (Static47.anInt1349 == 84) {
						if (Static78.aClass45_923.method1317() > 0) {
							local123 = 0;
							if (Static78.aClass45_923.method1318()) {
								local123 = Static78.aClass45_923.method1304();
							}
							Static64.aClass5_Sub9_Sub1_2.method1466(171);
							Static64.aClass5_Sub9_Sub1_2.method1413(local123);
						}
						Static51.aBoolean81 = true;
						Static75.anInt2178 = 0;
					}
				} else if (Static75.anInt2178 == 2) {
					if (Static47.anInt1349 == 85 && Static78.aClass45_923.method1317() > 0) {
						Static78.aClass45_923 = Static78.aClass45_923.method1322(Static78.aClass45_923.method1317() - 1, 0);
						Static51.aBoolean81 = true;
					}
					if ((Static1.method8(Static25.anInt792) || Static25.anInt792 == 32) && Static78.aClass45_923.method1317() < 12) {
						Static78.aClass45_923 = Static78.aClass45_923.method1326(Static25.anInt792);
						Static51.aBoolean81 = true;
					}
					if (Static47.anInt1349 == 84) {
						if (Static78.aClass45_923.method1317() > 0) {
							Static64.aClass5_Sub9_Sub1_2.method1466(46);
							Static64.aClass5_Sub9_Sub1_2.method1454(Static78.aClass45_923.method1299());
						}
						Static75.anInt2178 = 0;
						Static51.aBoolean81 = true;
					}
				} else if (Static75.anInt2178 == 3) {
					if (Static47.anInt1349 == 85 && Static78.aClass45_923.method1317() > 0) {
						Static78.aClass45_923 = Static78.aClass45_923.method1322(Static78.aClass45_923.method1317() - 1, 0);
						Static51.aBoolean81 = true;
					}
					if (Static59.method1213(Static25.anInt792) && Static78.aClass45_923.method1317() < 40) {
						Static78.aClass45_923 = Static78.aClass45_923.method1326(Static25.anInt792);
						Static51.aBoolean81 = true;
					}
				} else if (Static75.anInt2178 == 4) {
					if (Static47.anInt1349 == 85 && Static78.aClass45_923.method1317() > 0) {
						Static78.aClass45_923 = Static78.aClass45_923.method1322(Static78.aClass45_923.method1317() - 1, 0);
						Static51.aBoolean81 = true;
					}
					if ((Static59.method1213(Static25.anInt792) || Static25.anInt792 == 32) && Static78.aClass45_923.method1317() < 80) {
						Static78.aClass45_923 = Static78.aClass45_923.method1326(Static25.anInt792);
						Static51.aBoolean81 = true;
					}
					if (Static47.anInt1349 == 84) {
						if (Static78.aClass45_923.method1317() > 0) {
							Static64.aClass5_Sub9_Sub1_2.method1466(8);
							Static64.aClass5_Sub9_Sub1_2.method1428(Static78.aClass45_923.method1317() + 1);
							Static64.aClass5_Sub9_Sub1_2.method1402(Static78.aClass45_923);
						}
						Static51.aBoolean81 = true;
						Static75.anInt2178 = 0;
					}
				} else if (Static67.anInt1909 == -1 && Static101.anInt1036 == -1) {
					if (Static47.anInt1349 == 85 && Static78.aClass45_926.method1317() > 0) {
						Static78.aClass45_926 = Static78.aClass45_926.method1322(Static78.aClass45_926.method1317() - 1, 0);
						Static51.aBoolean81 = true;
					}
					if (Static59.method1213(Static25.anInt792) && Static78.aClass45_926.method1317() < 80) {
						Static78.aClass45_926 = Static78.aClass45_926.method1326(Static25.anInt792);
						Static51.aBoolean81 = true;
					}
					if (Static47.anInt1349 == 84 && Static78.aClass45_926.method1317() > 0) {
						if (Static84.anInt2332 == 2) {
							if (Static78.aClass45_926.method1319(Static91.aClass45_1061)) {
								System.gc();
							}
							if (Static78.aClass45_926.method1319(Static52.aClass45_1373)) {
								method114();
							}
							if (Static78.aClass45_926.method1319(aClass45_73)) {
								Static49.aBoolean80 = true;
							}
							if (Static78.aClass45_926.method1319(Static34.aClass45_477)) {
								Static49.aBoolean80 = false;
							}
							if (Static78.aClass45_926.method1319(Static13.aClass45_197)) {
								for (local123 = 0; local123 < 4; local123++) {
									for (@Pc(328) int local328 = 1; local328 < 103; local328++) {
										for (@Pc(332) int local332 = 1; local332 < 103; local332++) {
											Static51.aClass37Array1[local123].anIntArrayArray19[local328][local332] = 0;
										}
									}
								}
							}
							if (Static78.aClass45_926.method1319(Static53.aClass45_1004) && Static41.anInt2277 == 2) {
								throw new RuntimeException();
							}
							if (Static78.aClass45_926.method1319(Static25.aClass45_379)) {
								Static110.aBoolean123 = true;
							}
						}
						if (Static78.aClass45_926.method1302(Static33.aClass45_466)) {
							Static64.aClass5_Sub9_Sub1_2.method1466(253);
							Static64.aClass5_Sub9_Sub1_2.method1428(Static78.aClass45_926.method1317() - 1);
							Static64.aClass5_Sub9_Sub1_2.method1402(Static78.aClass45_926.method1296(2));
						} else {
							@Pc(418) byte local418 = 0;
							@Pc(422) Class45 local422 = Static78.aClass45_926.method1327();
							if (local422.method1302(Static100.aClass45_1159)) {
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static100.aClass45_1159.method1317());
								local418 = 0;
							} else if (local422.method1302(Static40.aClass45_527)) {
								local418 = 1;
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static40.aClass45_527.method1317());
							} else if (local422.method1302(Static2.aClass45_13)) {
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static2.aClass45_13.method1317());
								local418 = 2;
							} else if (local422.method1302(Static19.aClass45_282)) {
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static19.aClass45_282.method1317());
								local418 = 3;
							} else if (local422.method1302(Static99.aClass45_1139)) {
								local418 = 4;
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static99.aClass45_1139.method1317());
							} else if (local422.method1302(Static104.aClass45_1195)) {
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static104.aClass45_1195.method1317());
								local418 = 5;
							} else if (local422.method1302(Static32.aClass45_461)) {
								local418 = 6;
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static32.aClass45_461.method1317());
							} else if (local422.method1302(Static91.aClass45_1063)) {
								local418 = 7;
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static91.aClass45_1063.method1317());
							} else if (local422.method1302(Static75.aClass45_906)) {
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static75.aClass45_906.method1317());
								local418 = 8;
							} else if (local422.method1302(Static63.aClass45_784)) {
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static63.aClass45_784.method1317());
								local418 = 9;
							} else if (local422.method1302(Static85.aClass45_1020)) {
								local418 = 10;
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static85.aClass45_1020.method1317());
							} else if (local422.method1302(Static50.aClass45_645)) {
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static50.aClass45_645.method1317());
								local418 = 11;
							}
							@Pc(632) byte local632 = 0;
							local422 = Static78.aClass45_926.method1327();
							if (local422.method1302(Static16.aClass45_237)) {
								local632 = 1;
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static16.aClass45_237.method1317());
							} else if (local422.method1302(Static110.aClass45_1269)) {
								local632 = 2;
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static110.aClass45_1269.method1317());
							} else if (local422.method1302(Static114.aClass45_1312)) {
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static114.aClass45_1312.method1317());
								local632 = 3;
							} else if (local422.method1302(Static101.aClass45_486)) {
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static101.aClass45_486.method1317());
								local632 = 4;
							} else if (local422.method1302(Static60.aClass45_716)) {
								local632 = 5;
								Static78.aClass45_926 = Static78.aClass45_926.method1296(Static60.aClass45_716.method1317());
							}
							Static64.aClass5_Sub9_Sub1_2.method1466(206);
							Static64.aClass5_Sub9_Sub1_2.method1428(0);
							@Pc(737) int local737 = Static64.aClass5_Sub9_Sub1_2.anInt2140;
							Static64.aClass5_Sub9_Sub1_2.method1428(local418);
							Static64.aClass5_Sub9_Sub1_2.method1428(local632);
							Static3.method65(Static64.aClass5_Sub9_Sub1_2, Static78.aClass45_926);
							Static64.aClass5_Sub9_Sub1_2.method1440(Static64.aClass5_Sub9_Sub1_2.anInt2140 - local737);
							if (Static71.anInt2080 == 2) {
								Static71.anInt2080 = 3;
								Static96.aBoolean121 = true;
								Static64.aClass5_Sub9_Sub1_2.method1466(198);
								Static64.aClass5_Sub9_Sub1_2.method1428(Static71.anInt2080);
								Static64.aClass5_Sub9_Sub1_2.method1428(Static36.anInt1058);
								Static64.aClass5_Sub9_Sub1_2.method1428(Static70.anInt2023);
							}
						}
						Static51.aBoolean81 = true;
						Static78.aClass45_926 = Static78.aClass45_929;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)Z")
	public static boolean method117() {
		return Static45.anInt1317 == 0 ? Static54.aClass5_Sub7_Sub4_3.method2049() : true;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)I")
	public static int method118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(16) int local16 = arg2;
			arg2 = arg0;
			arg0 = local16;
		}
		if (local3 == 0) {
			return arg4;
		} else if (local3 == 1) {
			return 1 + 7 - arg2 - arg3;
		} else if (local3 == 2) {
			return 8 - arg4 - arg0;
		} else {
			return arg3;
		}
	}
}
