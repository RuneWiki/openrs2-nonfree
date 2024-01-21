import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "[S")
	public static short[] aShortArray33;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1830 = Static107.method1838("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1831 = Static107.method1838("<col=ffff00>");

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	public static void method2145() {
		aShortArray33 = null;
		aClass28_1831 = null;
		aClass28_1830 = null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)I")
	public static int method2146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub11 local10 = (Class2_Sub11) Static101.aClass35_6.method1354((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray202.length) {
			return local10.anIntArray202[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!gf;II)V")
	public static void method2147(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub4_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16;
		@Pc(25) int local25;
		if ((arg2 & 0x2) != 0) {
			local16 = Static151.aClass2_Sub2_Sub1_3.method1674();
			if (local16 == 65535) {
				local16 = -1;
			}
			local25 = Static151.aClass2_Sub2_Sub1_3.method1667();
			Static122.method2003(local16, arg1, local25);
		}
		if ((arg2 & 0x4) != 0) {
			arg1.anInt1651 = Static151.aClass2_Sub2_Sub1_3.method1680();
			arg1.anInt1615 = Static151.aClass2_Sub2_Sub1_3.method1665();
		}
		if ((arg2 & 0x40) != 0) {
			local16 = Static151.aClass2_Sub2_Sub1_3.method1668();
			local25 = Static151.aClass2_Sub2_Sub1_3.method1668();
			arg1.method1097(local25, local16, Static156.anInt3491);
			arg1.anInt1645 = Static156.anInt3491 + 300;
			arg1.anInt1629 = Static151.aClass2_Sub2_Sub1_3.method1698();
		}
		if ((arg2 & 0x400) != 0) {
			local16 = Static151.aClass2_Sub2_Sub1_3.method1668();
			local25 = Static151.aClass2_Sub2_Sub1_3.method1667();
			arg1.method1097(local25, local16, Static156.anInt3491);
		}
		if ((arg2 & 0x1) != 0) {
			local16 = Static151.aClass2_Sub2_Sub1_3.method1703();
			@Pc(114) byte[] local114 = new byte[local16];
			@Pc(119) Class2_Sub2 local119 = new Class2_Sub2(local114);
			Static151.aClass2_Sub2_Sub1_3.method1689(local114, local16);
			Static83.aClass2_Sub2Array1[arg0] = local119;
			arg1.method1103(local119);
		}
		if ((arg2 & 0x8) != 0) {
			arg1.aClass28_951 = Static151.aClass2_Sub2_Sub1_3.method1662();
			if (arg1.aClass28_951.method1112(0) == 126) {
				arg1.aClass28_951 = arg1.aClass28_951.method1131(1);
				Static93.method1632(2, arg1.aClass28_953, arg1.aClass28_951);
			} else if (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2 == arg1) {
				Static93.method1632(2, arg1.aClass28_953, arg1.aClass28_951);
			}
			arg1.anInt1630 = 0;
			arg1.anInt1621 = 0;
			arg1.anInt1637 = 150;
		}
		if ((arg2 & 0x100) != 0) {
			arg1.anInt1627 = Static151.aClass2_Sub2_Sub1_3.method1665();
			local16 = Static151.aClass2_Sub2_Sub1_3.method1653();
			arg1.anInt1611 = 0;
			if (arg1.anInt1627 == 65535) {
				arg1.anInt1627 = -1;
			}
			arg1.anInt1622 = 0;
			arg1.anInt1613 = local16 >> 16;
			arg1.anInt1640 = (local16 & 0xFFFF) + Static156.anInt3491;
			if (arg1.anInt1640 > Static156.anInt3491) {
				arg1.anInt1611 = -1;
			}
		}
		if ((arg2 & 0x200) != 0) {
			arg1.anInt1642 = Static151.aClass2_Sub2_Sub1_3.method1668();
			arg1.anInt1598 = Static151.aClass2_Sub2_Sub1_3.method1703();
			arg1.anInt1647 = Static151.aClass2_Sub2_Sub1_3.method1698();
			arg1.anInt1605 = Static151.aClass2_Sub2_Sub1_3.method1667();
			arg1.anInt1620 = Static151.aClass2_Sub2_Sub1_3.method1665() + Static156.anInt3491;
			arg1.anInt1632 = Static151.aClass2_Sub2_Sub1_3.method1674() + Static156.anInt3491;
			arg1.anInt1652 = Static151.aClass2_Sub2_Sub1_3.method1667();
			arg1.anInt1644 = 0;
			arg1.anInt1643 = 1;
		}
		if ((arg2 & 0x10) != 0) {
			arg1.anInt1625 = Static151.aClass2_Sub2_Sub1_3.method1680();
			if (arg1.anInt1625 == 65535) {
				arg1.anInt1625 = -1;
			}
		}
		if ((arg2 & 0x20) == 0) {
			return;
		}
		local16 = Static151.aClass2_Sub2_Sub1_3.method1670();
		local25 = Static151.aClass2_Sub2_Sub1_3.method1698();
		@Pc(331) int local331 = Static151.aClass2_Sub2_Sub1_3.method1668();
		@Pc(334) int local334 = Static151.aClass2_Sub2_Sub1_3.anInt2385;
		if (arg1.aClass28_953 != null && arg1.aClass6_2 != null) {
			@Pc(342) boolean local342 = false;
			@Pc(347) long local347 = arg1.aClass28_953.method1129();
			if (local25 <= 1) {
				for (@Pc(354) int local354 = 0; local354 < Static92.anInt2333; local354++) {
					if (Static11.aLongArray3[local354] == local347) {
						local342 = true;
						break;
					}
				}
			}
			if (!local342 && Static67.anInt1799 == 0) {
				Static150.aClass2_Sub2_5.anInt2385 = 0;
				Static151.aClass2_Sub2_Sub1_3.method1676(Static150.aClass2_Sub2_5.aByteArray35, local331);
				Static150.aClass2_Sub2_5.anInt2385 = 0;
				@Pc(405) Class28 local405 = Static68.method2470(Static156.method2408(Static150.aClass2_Sub2_5).method1138());
				arg1.aClass28_951 = local405.method1117();
				arg1.anInt1630 = local16 >> 8;
				arg1.anInt1621 = local16 & 0xFF;
				arg1.anInt1637 = 150;
				if (local25 == 2 || local25 == 3) {
					Static93.method1632(1, Static83.method1481(new Class28[] { Static148.aClass28_1971, arg1.aClass28_953 }), local405);
				} else if (local25 == 1) {
					Static93.method1632(1, Static83.method1481(new Class28[] { Static69.aClass28_1087, arg1.aClass28_953 }), local405);
				} else {
					Static93.method1632(2, arg1.aClass28_953, local405);
				}
			}
		}
		Static151.aClass2_Sub2_Sub1_3.anInt2385 = local331 + local334;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	public static void method2148() {
		for (@Pc(1) int local1 = 0; local1 < Static152.anInt3423; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static178.anInt3959; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static13.anInt587; local7++) {
					@Pc(16) Class2_Sub14 local16 = Static133.aClass2_Sub14ArrayArrayArray1[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class52 local21 = local16.aClass52_1;
						if (local21 != null && local21.aClass2_Sub4_Sub1_6 instanceof Class2_Sub4_Sub1_Sub5) {
							@Pc(31) Class2_Sub4_Sub1_Sub5 local31 = (Class2_Sub4_Sub1_Sub5) local21.aClass2_Sub4_Sub1_6;
							Static124.method2019(local31, local1, local4, local7, 1, 1);
							if (local21.aClass2_Sub4_Sub1_5 instanceof Class2_Sub4_Sub1_Sub5) {
								@Pc(46) Class2_Sub4_Sub1_Sub5 local46 = (Class2_Sub4_Sub1_Sub5) local21.aClass2_Sub4_Sub1_5;
								Static124.method2019(local46, local1, local4, local7, 1, 1);
								Static86.method1543(local31, local46, 0, 0, 0, false);
								local21.aClass2_Sub4_Sub1_5 = local46.method1544(local46.aShort34, local46.aShort32, -50, -10, -50, false);
							}
							local21.aClass2_Sub4_Sub1_6 = local31.method1544(local31.aShort34, local31.aShort32, -50, -10, -50, false);
						}
						@Pc(104) Class2_Sub4_Sub1_Sub5 local104;
						for (@Pc(88) int local88 = 0; local88 < local16.anInt2269; local88++) {
							@Pc(94) Class43 local94 = local16.aClass43Array56[local88];
							if (local94 != null && local94.aClass2_Sub4_Sub1_2 instanceof Class2_Sub4_Sub1_Sub5) {
								local104 = (Class2_Sub4_Sub1_Sub5) local94.aClass2_Sub4_Sub1_2;
								Static124.method2019(local104, local1, local4, local7, local94.anInt2321 + 1 - local94.anInt2326, local94.anInt2319 - local94.anInt2322 + 1);
								local94.aClass2_Sub4_Sub1_2 = local104.method1544(local104.aShort34, local104.aShort32, -50, -10, -50, false);
							}
						}
						@Pc(144) Class19 local144 = local16.aClass19_1;
						if (local144 != null && local144.aClass2_Sub4_Sub1_1 instanceof Class2_Sub4_Sub1_Sub5) {
							local104 = (Class2_Sub4_Sub1_Sub5) local144.aClass2_Sub4_Sub1_1;
							Static109.method1856(local104, local1, local4, local7);
							local144.aClass2_Sub4_Sub1_1 = local104.method1544(local104.aShort34, local104.aShort32, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}
}
