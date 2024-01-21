import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!hd", name = "Sc", descriptor = "[I")
	public static int[] anIntArray192;

	@OriginalMember(owner = "client!hd", name = "rd", descriptor = "[I")
	public static int[] anIntArray193;

	@OriginalMember(owner = "client!hd", name = "Oc", descriptor = "Lclient!sc;")
	public static Class66 aClass66_705 = Static106.method1849("titlebutton");

	@OriginalMember(owner = "client!hd", name = "Tc", descriptor = "Lclient!sc;")
	public static Class66 aClass66_706 = Static106.method1849("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!hd", name = "ld", descriptor = "Lclient!sc;")
	private static Class66 aClass66_709 = Static106.method1849(" is already on your ignore list)3");

	@OriginalMember(owner = "client!hd", name = "bd", descriptor = "Lclient!sc;")
	public static Class66 aClass66_708 = aClass66_709;

	@OriginalMember(owner = "client!hd", name = "pd", descriptor = "Lclient!sc;")
	public static Class66 aClass66_710 = null;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!ha;)V")
	public static void method935(@OriginalArg(1) Class1_Sub1_Sub1_Sub5 arg0) {
		if (arg0.anInt1243 == 0) {
			return;
		}
		@Pc(33) int local33;
		@Pc(40) int local40;
		if (arg0.anInt1241 != -1 && arg0.anInt1241 < 32768) {
			@Pc(24) Class1_Sub1_Sub1_Sub5_Sub1 local24 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[arg0.anInt1241];
			if (local24 != null) {
				local33 = arg0.anInt1261 - local24.anInt1261;
				local40 = arg0.anInt1271 - local24.anInt1271;
				if (local33 != 0 || local40 != 0) {
					arg0.anInt1269 = (int) (Math.atan2((double) local33, (double) local40) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(74) int local74;
		if (arg0.anInt1241 >= 32768) {
			local74 = arg0.anInt1241 - 32768;
			if (local74 == Static25.anInt694) {
				local74 = 2047;
			}
			@Pc(83) Class1_Sub1_Sub1_Sub5_Sub2 local83 = Static85.aClass1_Sub1_Sub1_Sub5_Sub2Array1[local74];
			if (local83 != null) {
				local40 = arg0.anInt1261 - local83.anInt1261;
				@Pc(98) int local98 = arg0.anInt1271 - local83.anInt1271;
				if (local40 != 0 || local98 != 0) {
					arg0.anInt1269 = (int) (Math.atan2((double) local40, (double) local98) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1265 != 0 || arg0.anInt1280 != 0) && (arg0.anInt1237 == 0 || arg0.anInt1277 > 0)) {
			local74 = arg0.anInt1261 - (arg0.anInt1265 - Static48.anInt1496 - Static48.anInt1496) * 64;
			local33 = arg0.anInt1271 - (arg0.anInt1280 - Static52.anInt1603 - Static52.anInt1603) * 64;
			if (local74 != 0 || local33 != 0) {
				arg0.anInt1269 = (int) (Math.atan2((double) local74, (double) local33) * 325.949D) & 0x7FF;
			}
			arg0.anInt1265 = 0;
			arg0.anInt1280 = 0;
		}
		local74 = arg0.anInt1269 - arg0.anInt1290 & 0x7FF;
		if (local74 == 0) {
			arg0.anInt1295 = 0;
			return;
		}
		arg0.anInt1295++;
		@Pc(218) boolean local218;
		if (local74 > 1024) {
			arg0.anInt1290 -= arg0.anInt1243;
			local218 = true;
			if (local74 < arg0.anInt1243 || 2048 - arg0.anInt1243 < local74) {
				arg0.anInt1290 = arg0.anInt1269;
				local218 = false;
			}
			if (arg0.anInt1288 == arg0.anInt1247 && (arg0.anInt1295 > 25 || local218)) {
				if (arg0.anInt1289 == -1) {
					arg0.anInt1247 = arg0.anInt1262;
				} else {
					arg0.anInt1247 = arg0.anInt1289;
				}
			}
		} else {
			arg0.anInt1290 += arg0.anInt1243;
			local218 = true;
			if (arg0.anInt1243 > local74 || local74 > 2048 - arg0.anInt1243) {
				arg0.anInt1290 = arg0.anInt1269;
				local218 = false;
			}
			if (arg0.anInt1247 == arg0.anInt1288 && (arg0.anInt1295 > 25 || local218)) {
				if (arg0.anInt1276 == -1) {
					arg0.anInt1247 = arg0.anInt1262;
				} else {
					arg0.anInt1247 = arg0.anInt1276;
				}
			}
		}
		arg0.anInt1290 &= 0x7FF;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIII)I")
	public static int method936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "(I)V")
	public static void method937() {
		if (Static117.aClass56_1 != null) {
			@Pc(14) Class56 local14 = Static117.aClass56_1;
			synchronized (Static117.aClass56_1) {
				Static117.aClass56_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ae;Z)V")
	public static void method938(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1 arg1) {
		if (Static99.aClass1_Sub12_7 == null) {
			Static106.method1852((byte) 0, 255, 0, null, true, 255);
			Static48.aClass5_Sub1Array1[arg0] = arg1;
		} else {
			Static99.aClass1_Sub12_7.anInt1694 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static99.aClass1_Sub12_7.method1210();
			@Pc(20) int local20 = Static99.aClass1_Sub12_7.method1210();
			arg1.method134(local16, local20);
		}
	}

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "(I)V")
	public static void method940() {
		anIntArray192 = null;
		anIntArray193 = null;
		aClass66_710 = null;
		aClass66_706 = null;
		aClass66_708 = null;
		aClass66_705 = null;
		aClass66_709 = null;
	}

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "(I)V")
	public static void method941() {
		try {
			if (Static133.anInt2941 == 0) {
				if (Static49.aClass34_3 != null) {
					Static49.aClass34_3.method1104();
					Static49.aClass34_3 = null;
				}
				Static126.anInt2880 = 0;
				Static14.aBoolean19 = false;
				Static133.anInt2941 = 1;
				Static39.aClass32_5 = null;
			}
			if (Static133.anInt2941 == 1) {
				if (Static39.aClass32_5 == null) {
					Static39.aClass32_5 = Static120.aClass7_4.method281(Static88.anInt2320, Static98.aString4);
				}
				if (Static39.aClass32_5.anInt1494 == 2) {
					throw new IOException();
				}
				if (Static39.aClass32_5.anInt1494 == 1) {
					Static49.aClass34_3 = new Class34((Socket) Static39.aClass32_5.anObject4, Static120.aClass7_4);
					Static133.anInt2941 = 2;
					Static39.aClass32_5 = null;
				}
			}
			if (Static133.anInt2941 == 2) {
				@Pc(82) long local82 = Static102.aLong108 = Static109.aClass66_1489.method1806();
				Static127.aClass1_Sub12_Sub1_2.anInt1694 = 0;
				@Pc(92) int local92 = (int) (local82 >> 16 & 0x1FL);
				Static127.aClass1_Sub12_Sub1_2.method1197(14);
				Static127.aClass1_Sub12_Sub1_2.method1197(local92);
				Static49.aClass34_3.method1098(Static127.aClass1_Sub12_Sub1_2.aByteArray12, 2);
				Static133.anInt2941 = 3;
				Static133.aClass1_Sub12_Sub1_3.anInt1694 = 0;
			}
			@Pc(129) int local129;
			if (Static133.anInt2941 == 3) {
				if (Static20.aClass24_1 != null) {
					Static20.aClass24_1.method1456();
				}
				if (Static101.aClass24_2 != null) {
					Static101.aClass24_2.method1456();
				}
				local129 = Static49.aClass34_3.method1100();
				if (Static20.aClass24_1 != null) {
					Static20.aClass24_1.method1456();
				}
				if (Static101.aClass24_2 != null) {
					Static101.aClass24_2.method1456();
				}
				if (local129 != 0) {
					Static61.method1310(local129);
					return;
				}
				Static133.anInt2941 = 4;
				Static133.aClass1_Sub12_Sub1_3.anInt1694 = 0;
			}
			if (Static133.anInt2941 == 4) {
				if (Static133.aClass1_Sub12_Sub1_3.anInt1694 < 8) {
					local129 = Static49.aClass34_3.method1103();
					if (local129 > 8 - Static133.aClass1_Sub12_Sub1_3.anInt1694) {
						local129 = 8 - Static133.aClass1_Sub12_Sub1_3.anInt1694;
					}
					if (local129 > 0) {
						Static49.aClass34_3.method1102(Static133.aClass1_Sub12_Sub1_3.anInt1694, local129, Static133.aClass1_Sub12_Sub1_3.aByteArray12);
						Static133.aClass1_Sub12_Sub1_3.anInt1694 += local129;
					}
				}
				if (Static133.aClass1_Sub12_Sub1_3.anInt1694 == 8) {
					Static133.aClass1_Sub12_Sub1_3.anInt1694 = 0;
					Static38.aLong127 = Static133.aClass1_Sub12_Sub1_3.method1219();
					Static133.anInt2941 = 5;
				}
			}
			if (Static133.anInt2941 == 5) {
				Static127.aClass1_Sub12_Sub1_2.anInt1694 = 0;
				@Pc(219) int[] local219 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static38.aLong127 >> 32), (int) Static38.aLong127 };
				Static127.aClass1_Sub12_Sub1_2.method1197(10);
				Static127.aClass1_Sub12_Sub1_2.method1193(local219[0]);
				Static127.aClass1_Sub12_Sub1_2.method1193(local219[1]);
				Static127.aClass1_Sub12_Sub1_2.method1193(local219[2]);
				Static127.aClass1_Sub12_Sub1_2.method1193(local219[3]);
				Static127.aClass1_Sub12_Sub1_2.method1195(Static109.aClass66_1489.method1806());
				Static127.aClass1_Sub12_Sub1_2.method1188(Static109.aClass66_1472);
				Static127.aClass1_Sub12_Sub1_2.method1208(Static41.aBigInteger1, Static55.aBigInteger2);
				Static118.aClass1_Sub12_Sub1_1.anInt1694 = 0;
				if (Static11.anInt398 == 40) {
					Static118.aClass1_Sub12_Sub1_1.method1197(18);
				} else {
					Static118.aClass1_Sub12_Sub1_1.method1197(16);
				}
				Static118.aClass1_Sub12_Sub1_1.method1197(Static127.aClass1_Sub12_Sub1_2.anInt1694 + 93);
				Static118.aClass1_Sub12_Sub1_1.method1193(470);
				Static118.aClass1_Sub12_Sub1_1.method1197(Static87.aBoolean96 ? 1 : 0);
				Static93.method1710(Static118.aClass1_Sub12_Sub1_1);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static97.aClass5_Sub1_25.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static68.aClass5_Sub1_19.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static53.aClass5_Sub1_17.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static122.aClass5_Sub1_29.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static86.aClass5_Sub1_23.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static1.aClass5_Sub1_3.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static28.aClass5_Sub1_8.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static96.aClass5_Sub1_24.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static112.aClass5_Sub1_26.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static43.aClass5_Sub1_16.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static9.aClass5_Sub1_6.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static121.aClass5_Sub1_28.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static76.aClass5_Sub1_20.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static73.aClass5_Sub1_21.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static8.aClass5_Sub1_5.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1193(Static131.aClass5_Sub1_27.anInt170);
				Static118.aClass1_Sub12_Sub1_1.method1199(Static127.aClass1_Sub12_Sub1_2.aByteArray12, Static127.aClass1_Sub12_Sub1_2.anInt1694);
				Static49.aClass34_3.method1098(Static118.aClass1_Sub12_Sub1_1.aByteArray12, Static118.aClass1_Sub12_Sub1_1.anInt1694);
				Static127.aClass1_Sub12_Sub1_2.method1224(local219);
				for (@Pc(450) int local450 = 0; local450 < 4; local450++) {
					local219[local450] += 50;
				}
				Static133.aClass1_Sub12_Sub1_3.method1224(local219);
				Static133.anInt2941 = 6;
			}
			if (Static133.anInt2941 == 6 && Static49.aClass34_3.method1103() > 0) {
				local129 = Static49.aClass34_3.method1100();
				if (local129 == 21 && Static11.anInt398 == 20) {
					Static133.anInt2941 = 7;
				} else if (local129 == 2) {
					Static133.anInt2941 = 9;
				} else if (local129 == 15 && Static11.anInt398 == 40) {
					Static97.method1740();
					return;
				} else if (local129 == 23 && Static16.anInt487 < 1) {
					Static16.anInt487++;
					Static133.anInt2941 = 0;
				} else {
					Static61.method1310(local129);
					return;
				}
			}
			if (Static133.anInt2941 == 7 && Static49.aClass34_3.method1103() > 0) {
				Static43.anInt1383 = (Static49.aClass34_3.method1100() + 3) * 60;
				Static133.anInt2941 = 8;
			}
			if (Static133.anInt2941 == 8) {
				Static126.anInt2880 = 0;
				Static48.method1050(Static9.aClass66_222, Static127.aClass66_1693, Static41.method897(new Class66[] { Static88.method1632(Static43.anInt1383 / 60), Static106.aClass66_1447 }));
				if (--Static43.anInt1383 <= 0) {
					Static133.anInt2941 = 0;
				}
			} else {
				if (Static133.anInt2941 == 9 && Static49.aClass34_3.method1103() >= 8) {
					Static33.anInt850 = Static49.aClass34_3.method1100();
					Static11.aBoolean16 = Static49.aClass34_3.method1100() == 1;
					Static25.anInt694 = Static49.aClass34_3.method1100();
					Static25.anInt694 <<= 0x8;
					Static25.anInt694 += Static49.aClass34_3.method1100();
					Static13.anInt464 = Static49.aClass34_3.method1100();
					Static49.aClass34_3.method1102(0, 1, Static133.aClass1_Sub12_Sub1_3.aByteArray12);
					Static133.aClass1_Sub12_Sub1_3.anInt1694 = 0;
					Static59.anInt1826 = Static133.aClass1_Sub12_Sub1_3.method1225();
					Static49.aClass34_3.method1102(0, 2, Static133.aClass1_Sub12_Sub1_3.aByteArray12);
					Static133.aClass1_Sub12_Sub1_3.anInt1694 = 0;
					Static105.anInt2602 = Static133.aClass1_Sub12_Sub1_3.method1176();
					Static133.anInt2941 = 10;
				}
				if (Static133.anInt2941 != 10) {
					Static126.anInt2880++;
					if (Static126.anInt2880 > 2000) {
						if (Static16.anInt487 < 1) {
							if (Static88.anInt2320 == Static124.anInt2864) {
								Static88.anInt2320 = Static6.anInt318;
							} else {
								Static88.anInt2320 = Static124.anInt2864;
							}
							Static16.anInt487++;
							Static133.anInt2941 = 0;
						} else {
							Static61.method1310(-3);
						}
					}
				} else if (Static49.aClass34_3.method1103() >= Static105.anInt2602) {
					Static133.aClass1_Sub12_Sub1_3.anInt1694 = 0;
					Static49.aClass34_3.method1102(0, Static105.anInt2602, Static133.aClass1_Sub12_Sub1_3.aByteArray12);
					Static96.method1734();
					Static23.anInt683 = -1;
					Static19.method488(false);
					Static59.anInt1826 = -1;
				}
			}
		} catch (@Pc(727) IOException local727) {
			if (Static16.anInt487 < 1) {
				Static133.anInt2941 = 0;
				Static16.anInt487++;
				if (Static88.anInt2320 == Static124.anInt2864) {
					Static88.anInt2320 = Static6.anInt318;
				} else {
					Static88.anInt2320 = Static124.anInt2864;
				}
			} else {
				Static61.method1310(-2);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)Lclient!sc;")
	public static Class66 method942(@OriginalArg(0) int arg0) {
		@Pc(7) Class66 local7 = new Class66();
		local7.aByteArray29 = new byte[arg0];
		local7.anInt2583 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZII)Lclient!sc;")
	public static Class66 method943(@OriginalArg(1) int arg0) {
		return Static105.method1838(arg0, true);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ma;)V")
	public static void method944(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static60.aBoolean74) {
			Static99.method903(arg0);
			return;
		}
		if (Static97.anInt2474 == 1 && Static35.anInt866 >= 715 && Static6.anInt308 >= 453) {
			Static13.aBoolean18 = !Static13.aBoolean18;
			if (Static13.aBoolean18) {
				Static27.method547();
			} else {
				Static103.method1792(Static28.aClass5_Sub1_8, Static51.aClass66_852, Static109.aClass66_1463);
			}
		}
		if (Static11.anInt398 == 5) {
			return;
		}
		Static111.anInt2655++;
		if (Static11.anInt398 != 10) {
			return;
		}
		if (Static109.anInt2626 != 2 && Static129.anInt2913 == 0) {
			if (Static97.anInt2474 == 1 && Static35.anInt866 >= 5 && Static35.anInt866 <= 105 && Static6.anInt308 >= 463 && Static6.anInt308 <= 498) {
				Static118.method1953();
				return;
			}
			if (Static71.aClass83_1 != null) {
				Static118.method1953();
			}
		}
		@Pc(103) int local103 = Static97.anInt2474;
		@Pc(111) int local111 = Static6.anInt308;
		@Pc(113) int local113 = Static35.anInt866;
		if (Static80.anInt2175 == 0) {
			if (local103 == 1 && local113 >= 227 && local113 <= 377 && local111 >= 271 && local111 <= 311) {
				Static80.anInt2175 = 3;
				Static54.anInt1753 = 0;
			}
			if (local103 == 1 && local113 >= 387 && local113 <= 537 && local111 >= 271 && local111 <= 311) {
				Static109.aClass66_1452 = Static41.aClass66_676;
				Static54.anInt1753 = 0;
				Static109.aClass66_1479 = Static109.aClass66_1470;
				Static80.anInt2175 = 2;
				Static109.aClass66_1491 = Static109.aClass66_1492;
				return;
			}
		} else if (Static80.anInt2175 == 2) {
			@Pc(256) short local256 = 231;
			@Pc(259) int local259 = local256 + 30;
			if (local103 == 1 && local111 >= 246 && local111 < 261) {
				Static54.anInt1753 = 0;
			}
			local259 += 15;
			if (local103 == 1 && local111 >= 261 && local111 < 276) {
				Static54.anInt1753 = 1;
			}
			local259 += 15;
			if (local103 == 1 && local113 >= 227 && local113 <= 377 && local111 >= 301 && local111 <= 341) {
				Static109.aClass66_1489 = Static109.aClass66_1489.method1841().method1820();
				if (Static109.aClass66_1489.method1847() == 0) {
					Static48.method1050(Static109.aClass66_1488, Static127.aClass66_1698, Static109.aClass66_1484);
					return;
				}
				if (Static109.aClass66_1472.method1847() == 0) {
					Static48.method1050(Static109.aClass66_1453, Static2.aClass66_91, Static109.aClass66_1459);
					return;
				}
				Static48.method1050(Static109.aClass66_1477, Static23.aClass66_423, Static109.aClass66_1455);
				Static18.method468(20);
				return;
			}
			if (local103 == 1 && local113 >= 387 && local113 <= 537 && local111 >= 301 && local111 <= 341) {
				Static109.aClass66_1489 = Static109.aClass66_1463;
				Static109.aClass66_1472 = Static109.aClass66_1463;
				Static80.anInt2175 = 0;
			}
			while (true) {
				while (Static18.method469()) {
					@Pc(415) boolean local415 = false;
					for (@Pc(417) int local417 = 0; Static129.aClass66_1717.method1847() > local417; local417++) {
						if (Static23.anInt666 == Static129.aClass66_1717.method1814(local417)) {
							local415 = true;
							break;
						}
					}
					if (Static54.anInt1753 == 0) {
						if (Static2.anInt85 == 85 && Static109.aClass66_1489.method1847() > 0) {
							Static109.aClass66_1489 = Static109.aClass66_1489.method1807(0, Static109.aClass66_1489.method1847() - 1);
						}
						if (Static2.anInt85 == 84 || Static2.anInt85 == 80) {
							Static54.anInt1753 = 1;
						}
						if (local415 && Static109.aClass66_1489.method1847() < 12) {
							Static109.aClass66_1489 = Static109.aClass66_1489.method1837(Static23.anInt666);
						}
					} else if (Static54.anInt1753 == 1) {
						if (Static2.anInt85 == 85 && Static109.aClass66_1472.method1847() > 0) {
							Static109.aClass66_1472 = Static109.aClass66_1472.method1807(0, Static109.aClass66_1472.method1847() - 1);
						}
						if (Static2.anInt85 == 84 || Static2.anInt85 == 80) {
							Static54.anInt1753 = 0;
						}
						if (Static126.anInt2891 == 2 && Static2.anInt85 == 84) {
							Static109.aClass66_1489 = Static109.aClass66_1489.method1841().method1820();
							if (Static109.aClass66_1489.method1847() == 0) {
								Static48.method1050(Static109.aClass66_1488, Static127.aClass66_1698, Static109.aClass66_1484);
								return;
							}
							if (Static109.aClass66_1472.method1847() == 0) {
								Static48.method1050(Static109.aClass66_1453, Static2.aClass66_91, Static109.aClass66_1459);
								return;
							}
							Static48.method1050(Static109.aClass66_1477, Static23.aClass66_423, Static109.aClass66_1455);
							Static18.method468(20);
							return;
						}
						if (local415 && Static109.aClass66_1472.method1847() < 20) {
							Static109.aClass66_1472 = Static109.aClass66_1472.method1837(Static23.anInt666);
						}
					}
				}
				return;
			}
		} else if (Static80.anInt2175 == 3 && local103 == 1 && local113 >= 307 && local113 <= 457 && local111 >= 301 && local111 <= 341) {
			Static80.anInt2175 = 0;
			return;
		}
	}
}
