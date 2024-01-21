import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fb", name = "md", descriptor = "Lclient!k;")
	public static Class33 aClass33_14;

	@OriginalMember(owner = "client!fb", name = "Sc", descriptor = "Lclient!wb;")
	private static Class65 aClass65_446 = Static24.method441("glow3:");

	@OriginalMember(owner = "client!fb", name = "Tc", descriptor = "Lclient!wb;")
	public static Class65 aClass65_447 = Static24.method441(",Zffentlicher Chat");

	@OriginalMember(owner = "client!fb", name = "Wc", descriptor = "Lclient!wb;")
	public static Class65 aClass65_448 = aClass65_446;

	@OriginalMember(owner = "client!fb", name = "Xc", descriptor = "Lclient!wb;")
	public static Class65 aClass65_449 = Static24.method441("gelb:");

	@OriginalMember(owner = "client!fb", name = "ad", descriptor = "Lclient!wb;")
	public static Class65 aClass65_450 = Static24.method441("sch-Utteln:");

	@OriginalMember(owner = "client!fb", name = "bd", descriptor = "Lclient!wb;")
	private static Class65 aClass65_451 = Static24.method441("Classic");

	@OriginalMember(owner = "client!fb", name = "dd", descriptor = "Lclient!wb;")
	public static Class65 aClass65_452 = aClass65_451;

	@OriginalMember(owner = "client!fb", name = "gd", descriptor = "Lclient!wb;")
	public static Class65 aClass65_453 = Static24.method441("");

	@OriginalMember(owner = "client!fb", name = "hd", descriptor = "Z")
	public static boolean aBoolean64 = true;

	@OriginalMember(owner = "client!fb", name = "id", descriptor = "Lclient!wb;")
	private static Class65 aClass65_454 = Static24.method441("flash3:");

	@OriginalMember(owner = "client!fb", name = "kd", descriptor = "Lclient!wb;")
	public static Class65 aClass65_455 = Static24.method441("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!fb", name = "nd", descriptor = "[Lclient!kb;")
	public static Class35[] aClass35Array1 = new Class35[50];

	@OriginalMember(owner = "client!fb", name = "od", descriptor = "Lclient!wb;")
	public static Class65 aClass65_456 = aClass65_454;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)V")
	public static void method569() {
		Static59.aClass2_Sub8_Sub1_19.method1421();
		@Pc(13) int local13 = Static59.aClass2_Sub8_Sub1_19.method1419(8);
		@Pc(18) int local18;
		if (Static51.anInt1482 > local13) {
			for (local18 = local13; local18 < Static51.anInt1482; local18++) {
				Static68.anIntArray276[Static12.anInt416++] = Static23.anIntArray92[local18];
			}
		}
		if (local13 > Static51.anInt1482) {
			throw new RuntimeException("gnpov1");
		}
		Static51.anInt1482 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(60) int local60 = Static23.anIntArray92[local18];
			@Pc(64) Class2_Sub1_Sub1_Sub2_Sub1 local64 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local60];
			@Pc(69) int local69 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
			if (local69 == 0) {
				Static23.anIntArray92[Static51.anInt1482++] = local60;
				local64.anInt1544 = Static108.anInt2902;
			} else {
				@Pc(89) int local89 = Static59.aClass2_Sub8_Sub1_19.method1419(2);
				if (local89 == 0) {
					Static23.anIntArray92[Static51.anInt1482++] = local60;
					local64.anInt1544 = Static108.anInt2902;
					Static61.anIntArray248[Static39.anInt1251++] = local60;
				} else {
					@Pc(133) int local133;
					@Pc(143) int local143;
					if (local89 == 1) {
						Static23.anIntArray92[Static51.anInt1482++] = local60;
						local64.anInt1544 = Static108.anInt2902;
						local133 = Static59.aClass2_Sub8_Sub1_19.method1419(3);
						local64.method921(false, local133);
						local143 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
						if (local143 == 1) {
							Static61.anIntArray248[Static39.anInt1251++] = local60;
						}
					} else if (local89 == 2) {
						Static23.anIntArray92[Static51.anInt1482++] = local60;
						local64.anInt1544 = Static108.anInt2902;
						local133 = Static59.aClass2_Sub8_Sub1_19.method1419(3);
						local64.method921(true, local133);
						local143 = Static59.aClass2_Sub8_Sub1_19.method1419(3);
						local64.method921(true, local143);
						@Pc(199) int local199 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
						if (local199 == 1) {
							Static61.anIntArray248[Static39.anInt1251++] = local60;
						}
					} else if (local89 == 3) {
						Static68.anIntArray276[Static12.anInt416++] = local60;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V")
	public static void method570() {
		Static48.aClass21_17.method743();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)V")
	public static void method571(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static51.anInt1482; local12++) {
			@Pc(20) Class2_Sub1_Sub1_Sub2_Sub1 local20 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[Static23.anIntArray92[local12]];
			@Pc(28) int local28 = (Static23.anIntArray92[local12] << 14) + 536870912;
			if (local20 != null && local20.method925() && local20.aClass2_Sub1_Sub11_1.aBoolean110 == arg0 && local20.aClass2_Sub1_Sub11_1.method1268()) {
				@Pc(57) int local57 = local20.anInt1562 >> 7;
				@Pc(62) int local62 = local20.anInt1518 >> 7;
				if (local62 >= 0 && local62 < 104 && local57 >= 0 && local57 < 104) {
					if (local20.anInt1521 == 1 && (local20.anInt1518 & 0x7F) == 64 && (local20.anInt1562 & 0x7F) == 64) {
						if (Static79.anIntArrayArray19[local62][local57] == Static100.anInt2785) {
							continue;
						}
						Static79.anIntArrayArray19[local62][local57] = Static100.anInt2785;
					}
					if (!local20.aClass2_Sub1_Sub11_1.aBoolean111) {
						local28 += Integer.MIN_VALUE;
					}
					Static67.aClass18_1.method576(Static62.anInt1879, local20.anInt1518, local20.anInt1562, Static25.method447(Static62.anInt1879, local20.anInt1562 + (local20.anInt1521 - 1) * 64, local20.anInt1518 + local20.anInt1521 * 64 + -64), local20.anInt1521 * 64 + 60 - 64, local20, local20.anInt1540, local28, local20.aBoolean86);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!je;III)V")
	public static void method572(@OriginalArg(0) Class2_Sub1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((arg1 & 0x2) != 0) {
			arg0.anInt1553 = Static59.aClass2_Sub8_Sub1_19.method1382();
			arg0.anInt1560 = Static59.aClass2_Sub8_Sub1_19.method1396();
		}
		if ((arg1 & 0x10) != 0) {
			arg0.aClass65_707 = Static59.aClass2_Sub8_Sub1_19.method1400();
			if (arg0.aClass65_707.method1766(0) == 126) {
				arg0.aClass65_707 = arg0.aClass65_707.method1779(1);
				Static36.method742(arg0.aClass65_726, arg0.aClass65_707, 2);
			} else if (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1 == arg0) {
				Static36.method742(arg0.aClass65_726, arg0.aClass65_707, 2);
			}
			arg0.anInt1531 = 150;
			arg0.anInt1551 = 0;
			arg0.anInt1529 = 0;
		}
		@Pc(87) int local87;
		@Pc(96) int local96;
		@Pc(158) int local158;
		if ((arg1 & 0x80) != 0) {
			local87 = Static59.aClass2_Sub8_Sub1_19.method1391();
			if (local87 == 65535) {
				local87 = -1;
			}
			local96 = Static59.aClass2_Sub8_Sub1_19.method1395();
			if (arg0.anInt1552 == local87 && local87 != -1) {
				local158 = Static71.method1291(local87).anInt1186;
				if (local158 == 1) {
					arg0.anInt1566 = 0;
					arg0.anInt1549 = 0;
					arg0.anInt1564 = 0;
					arg0.anInt1569 = local96;
				}
				if (local158 == 2) {
					arg0.anInt1564 = 0;
				}
			} else if (local87 == -1 || arg0.anInt1552 == -1 || Static71.method1291(local87).anInt1199 >= Static71.method1291(arg0.anInt1552).anInt1199) {
				arg0.anInt1564 = 0;
				arg0.anInt1569 = local96;
				arg0.anInt1534 = arg0.anInt1570;
				arg0.anInt1552 = local87;
				arg0.anInt1566 = 0;
				arg0.anInt1549 = 0;
			}
		}
		if ((arg1 & 0x1) != 0) {
			local87 = Static59.aClass2_Sub8_Sub1_19.method1391();
			local96 = Static59.aClass2_Sub8_Sub1_19.method1395();
			local158 = Static59.aClass2_Sub8_Sub1_19.method1412();
			@Pc(200) int local200 = Static59.aClass2_Sub8_Sub1_19.anInt2342;
			if (arg0.aClass65_726 != null && arg0.aClass49_1 != null) {
				@Pc(211) long local211 = arg0.aClass65_726.method1790();
				@Pc(213) boolean local213 = false;
				if (local96 <= 1) {
					for (@Pc(220) int local220 = 0; local220 < Static93.anInt2629; local220++) {
						if (Static52.aLongArray6[local220] == local211) {
							local213 = true;
							break;
						}
					}
				}
				if (!local213 && Static12.anInt419 == 0) {
					Static85.aClass2_Sub8_4.anInt2342 = 0;
					Static59.aClass2_Sub8_Sub1_19.method1403(local158, Static85.aClass2_Sub8_4.aByteArray59);
					Static85.aClass2_Sub8_4.anInt2342 = 0;
					@Pc(266) Class65 local266 = Static106.method1746(Static85.aClass2_Sub8_4).method1771();
					arg0.aClass65_707 = local266.method1769();
					arg0.anInt1529 = local87 >> 8;
					arg0.anInt1551 = local87 & 0xFF;
					arg0.anInt1531 = 150;
					if (local96 == 2 || local96 == 3) {
						Static36.method742(Static13.method282(new Class65[] { Static6.aClass65_117, arg0.aClass65_726 }), local266, 1);
					} else if (local96 == 1) {
						Static36.method742(Static13.method282(new Class65[] { Static69.aClass65_954, arg0.aClass65_726 }), local266, 1);
					} else {
						Static36.method742(arg0.aClass65_726, local266, 2);
					}
				}
			}
			Static59.aClass2_Sub8_Sub1_19.anInt2342 = local158 + local200;
		}
		if ((arg1 & 0x100) != 0) {
			arg0.anInt1554 = Static59.aClass2_Sub8_Sub1_19.method1394();
			local87 = Static59.aClass2_Sub8_Sub1_19.method1401();
			if (arg0.anInt1554 == 65535) {
				arg0.anInt1554 = -1;
			}
			arg0.anInt1535 = Static108.anInt2902 + (local87 & 0xFFFF);
			arg0.anInt1557 = 0;
			arg0.anInt1563 = 0;
			if (arg0.anInt1535 > Static108.anInt2902) {
				arg0.anInt1563 = -1;
			}
			arg0.anInt1537 = local87 >> 16;
		}
		if ((arg1 & 0x40) != 0) {
			local87 = Static59.aClass2_Sub8_Sub1_19.method1410();
			@Pc(402) byte[] local402 = new byte[local87];
			@Pc(407) Class2_Sub8 local407 = new Class2_Sub8(local402);
			Static59.aClass2_Sub8_Sub1_19.method1403(local87, local402);
			Static87.aClass2_Sub8Array1[arg2] = local407;
			arg0.method930(local407);
		}
		if ((arg1 & 0x4) != 0) {
			local87 = Static59.aClass2_Sub8_Sub1_19.method1378();
			local96 = Static59.aClass2_Sub8_Sub1_19.method1410();
			arg0.method920(local87, Static108.anInt2902, local96);
			arg0.anInt1543 = Static108.anInt2902 + 300;
			arg0.anInt1530 = Static59.aClass2_Sub8_Sub1_19.method1378();
			arg0.anInt1532 = Static59.aClass2_Sub8_Sub1_19.method1410();
		}
		if ((arg1 & 0x200) != 0) {
			arg0.anInt1519 = Static59.aClass2_Sub8_Sub1_19.method1378();
			arg0.anInt1572 = Static59.aClass2_Sub8_Sub1_19.method1378();
			arg0.anInt1533 = Static59.aClass2_Sub8_Sub1_19.method1412();
			arg0.anInt1522 = Static59.aClass2_Sub8_Sub1_19.method1410();
			arg0.anInt1565 = Static59.aClass2_Sub8_Sub1_19.method1391() + Static108.anInt2902;
			arg0.anInt1517 = Static59.aClass2_Sub8_Sub1_19.method1396() + Static108.anInt2902;
			arg0.anInt1539 = Static59.aClass2_Sub8_Sub1_19.method1410();
			arg0.method926();
		}
		if ((arg1 & 0x400) != 0) {
			local87 = Static59.aClass2_Sub8_Sub1_19.method1410();
			local96 = Static59.aClass2_Sub8_Sub1_19.method1378();
			arg0.method920(local87, Static108.anInt2902, local96);
			arg0.anInt1543 = Static108.anInt2902 + 300;
			arg0.anInt1530 = Static59.aClass2_Sub8_Sub1_19.method1378();
			arg0.anInt1532 = Static59.aClass2_Sub8_Sub1_19.method1410();
		}
		if ((arg1 & 0x20) == 0) {
			return;
		}
		arg0.anInt1527 = Static59.aClass2_Sub8_Sub1_19.method1396();
		if (arg0.anInt1527 == 65535) {
			arg0.anInt1527 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
	public static void method573(@OriginalArg(0) String arg0, @OriginalArg(1) Throwable arg1) {
		try {
			@Pc(3) String local3 = "";
			if (arg1 != null) {
				local3 = Static102.method1719(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local3 = local3 + " | ";
				}
				local3 = local3 + arg0;
			}
			System.out.println("Error: " + local3);
			local3 = local3.replace(':', '.');
			local3 = local3.replace('@', '_');
			local3 = local3.replace('&', '_');
			local3 = local3.replace('#', '_');
			@Pc(93) Class20 local93 = Static97.aClass53_4.method1629(new URL(Static97.aClass53_4.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static69.anInt2065 + "&u=" + Static6.aLong16 + "&v1=" + Static94.aString4 + "&v2=" + Static94.aString5 + "&e=" + local3));
			while (local93.anInt1156 == 0) {
				Static34.method698(1L);
			}
			if (local93.anInt1156 == 1) {
				@Pc(122) DataInputStream local122 = (DataInputStream) local93.anObject4;
				local122.read();
				local122.close();
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(Z)V")
	public static void method574() {
		if (!Static110.aBoolean160) {
			return;
		}
		Static41.anIntArray170 = null;
		Static69.anIntArray279 = null;
		Static85.aClass15_58 = null;
		Static1.aClass2_Sub1_Sub4_Sub3_1 = null;
		Static93.anIntArray388 = null;
		Static24.aClass2_Sub1_Sub4_Sub3_10 = null;
		Static45.aClass15_33 = null;
		Static38.aClass2_Sub1_Sub4_Sub2_5 = null;
		Static83.anIntArray309 = null;
		Static93.aClass15_64 = null;
		Static96.aClass15_67 = null;
		Static100.anIntArray407 = null;
		Static50.aClass15_35 = null;
		Static29.aClass2_Sub1_Sub4_Sub3Array1 = null;
		Static77.anIntArray303 = null;
		Static95.aClass2_Sub1_Sub4_Sub2_12 = null;
		Static108.aClass15_70 = null;
		Static38.aClass15_29 = null;
		Static90.anIntArray195 = null;
		Static92.aClass15_62 = null;
		Static59.aClass15_43 = null;
		Static37.anIntArray160 = null;
		Static57.method995();
		Static84.method1446(true);
		Static110.aBoolean160 = false;
	}

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)V")
	public static void method575() {
		aClass65_455 = null;
		aClass65_449 = null;
		aClass65_450 = null;
		aClass65_448 = null;
		aClass35Array1 = null;
		aClass65_451 = null;
		aClass65_454 = null;
		aClass65_453 = null;
		aClass65_452 = null;
		aClass65_456 = null;
		aClass65_446 = null;
		aClass33_14 = null;
		aClass65_447 = null;
	}
}
