import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
	public static int anInt1916;

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lclient!fd;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "Lclient!vc;")
	public static Class65 aClass65_4;

	@OriginalMember(owner = "client!nc", name = "db", descriptor = "Lclient!fc;")
	public static Class21 aClass21_16;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "Lclient!rc;")
	private static Class55 aClass55_766 = Static34.method846("slide:");

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "Lclient!rc;")
	public static Class55 aClass55_761 = aClass55_766;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
	public static int anInt1910 = 0;

	@OriginalMember(owner = "client!nc", name = "jb", descriptor = "Lclient!rc;")
	private static Class55 aClass55_769 = Static34.method846("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "Lclient!rc;")
	public static Class55 aClass55_762 = aClass55_769;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "Lclient!rc;")
	public static Class55 aClass55_763 = Static34.method846("Entfernen");

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	public static int anInt1912 = 0;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "Lclient!rc;")
	public static Class55 aClass55_764 = Static34.method846("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!nc", name = "V", descriptor = "Lclient!rc;")
	public static Class55 aClass55_765 = Static34.method846("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!nc", name = "Y", descriptor = "Lclient!rc;")
	public static Class55 aClass55_767 = Static34.method846("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
	public static int anInt1921 = 0;

	@OriginalMember(owner = "client!nc", name = "ib", descriptor = "Lclient!rc;")
	public static Class55 aClass55_768 = Static34.method846(",Zffentlicher Chat");

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V")
	public static void method1336() {
		while (Static9.method353()) {
			if (Static13.anInt800 != -1 && Static31.anInt1202 == Static13.anInt800) {
				if (Static104.anInt3065 == 85 && Static34.aClass55_514.method1674() > 0) {
					Static34.aClass55_514 = Static34.aClass55_514.method1671(0, Static34.aClass55_514.method1674() - 1);
				}
				if ((Static22.method657(Static11.anInt692) || Static11.anInt692 == 32) && Static34.aClass55_514.method1674() < 12) {
					Static34.aClass55_514 = Static34.aClass55_514.method1668(Static11.anInt692);
				}
			} else {
				@Pc(221) int local221;
				if (Static67.aBoolean90) {
					if (Static104.anInt3065 == 85 && Static34.aClass55_511.method1674() > 0) {
						Static34.aClass55_511 = Static34.aClass55_511.method1671(0, Static34.aClass55_511.method1674() - 1);
						Static72.aBoolean99 = true;
					}
					if (Static7.method250(Static11.anInt692) && Static34.aClass55_511.method1674() < 80) {
						Static34.aClass55_511 = Static34.aClass55_511.method1668(Static11.anInt692);
						Static72.aBoolean99 = true;
					}
					if (Static104.anInt3065 == 84) {
						Static67.aBoolean90 = false;
						Static72.aBoolean99 = true;
						@Pc(788) long local788;
						if (Static98.anInt2831 == 1) {
							local788 = Static34.aClass55_511.method1639();
							Static105.method1987(local788);
						}
						if (Static98.anInt2831 == 2 && anInt1912 > 0) {
							local788 = Static34.aClass55_511.method1639();
							Static59.method1255(local788);
						}
						if (Static98.anInt2831 == 3 && Static34.aClass55_511.method1674() > 0) {
							Static51.aClass6_Sub1_Sub1_3.method1515(75);
							Static51.aClass6_Sub1_Sub1_3.method1501(0);
							local221 = Static51.aClass6_Sub1_Sub1_3.anInt2209;
							Static51.aClass6_Sub1_Sub1_3.method1463(Static75.aLong75);
							Static61.method1316(Static34.aClass55_511, Static51.aClass6_Sub1_Sub1_3);
							Static51.aClass6_Sub1_Sub1_3.method1506(Static51.aClass6_Sub1_Sub1_3.anInt2209 - local221);
							if (Static112.anInt3231 == 2) {
								Static112.anInt3231 = 1;
								Static29.aBoolean49 = true;
								Static51.aClass6_Sub1_Sub1_3.method1515(26);
								Static51.aClass6_Sub1_Sub1_3.method1501(Static12.anInt717);
								Static51.aClass6_Sub1_Sub1_3.method1501(Static112.anInt3231);
								Static51.aClass6_Sub1_Sub1_3.method1501(Static41.anInt1399);
							}
						}
						if (Static98.anInt2831 == 4 && Static12.anInt712 < 100) {
							local788 = Static34.aClass55_511.method1639();
							Static44.method1827(local788);
						}
						if (Static98.anInt2831 == 5 && Static12.anInt712 > 0) {
							local788 = Static34.aClass55_511.method1639();
							Static105.method1986(local788);
						}
					}
				} else if (Static79.anInt2289 == 1) {
					if (Static104.anInt3065 == 85 && Static34.aClass55_510.method1674() > 0) {
						Static34.aClass55_510 = Static34.aClass55_510.method1671(0, Static34.aClass55_510.method1674() - 1);
						Static72.aBoolean99 = true;
					}
					if (Static11.method452(Static11.anInt692) && Static34.aClass55_510.method1674() < 10) {
						Static34.aClass55_510 = Static34.aClass55_510.method1668(Static11.anInt692);
						Static72.aBoolean99 = true;
					}
					if (Static104.anInt3065 == 84) {
						if (Static34.aClass55_510.method1674() > 0) {
							local221 = 0;
							if (Static34.aClass55_510.method1656()) {
								local221 = Static34.aClass55_510.method1644();
							}
							Static51.aClass6_Sub1_Sub1_3.method1515(255);
							Static51.aClass6_Sub1_Sub1_3.method1499(local221);
						}
						Static72.aBoolean99 = true;
						Static79.anInt2289 = 0;
					}
				} else if (Static79.anInt2289 == 2) {
					if (Static104.anInt3065 == 85 && Static34.aClass55_510.method1674() > 0) {
						Static34.aClass55_510 = Static34.aClass55_510.method1671(0, Static34.aClass55_510.method1674() - 1);
						Static72.aBoolean99 = true;
					}
					if ((Static22.method657(Static11.anInt692) || Static11.anInt692 == 32) && Static34.aClass55_510.method1674() < 12) {
						Static34.aClass55_510 = Static34.aClass55_510.method1668(Static11.anInt692);
						Static72.aBoolean99 = true;
					}
					if (Static104.anInt3065 == 84) {
						if (Static34.aClass55_510.method1674() > 0) {
							Static51.aClass6_Sub1_Sub1_3.method1515(160);
							Static51.aClass6_Sub1_Sub1_3.method1463(Static34.aClass55_510.method1639());
						}
						Static79.anInt2289 = 0;
						Static72.aBoolean99 = true;
					}
				} else if (Static79.anInt2289 == 3) {
					if (Static104.anInt3065 == 85 && Static34.aClass55_510.method1674() > 0) {
						Static34.aClass55_510 = Static34.aClass55_510.method1671(0, Static34.aClass55_510.method1674() - 1);
						Static72.aBoolean99 = true;
					}
					if (Static7.method250(Static11.anInt692) && Static34.aClass55_510.method1674() < 40) {
						Static34.aClass55_510 = Static34.aClass55_510.method1668(Static11.anInt692);
						Static72.aBoolean99 = true;
					}
				} else if (Static1.anInt3 == -1 && Static76.anInt2217 == -1) {
					if (Static104.anInt3065 == 85 && Static34.aClass55_504.method1674() > 0) {
						Static34.aClass55_504 = Static34.aClass55_504.method1671(0, Static34.aClass55_504.method1674() - 1);
						Static72.aBoolean99 = true;
					}
					if (Static7.method250(Static11.anInt692) && Static34.aClass55_504.method1674() < 80) {
						Static34.aClass55_504 = Static34.aClass55_504.method1668(Static11.anInt692);
						Static72.aBoolean99 = true;
					}
					if (Static104.anInt3065 == 84 && Static34.aClass55_504.method1674() > 0) {
						if (Static91.anInt2554 == 2) {
							if (Static34.aClass55_504.method1640(Static98.aClass55_1199)) {
								Static91.method1745();
							}
							if (Static34.aClass55_504.method1640(Static70.aClass55_831)) {
								Static106.aBoolean111 = true;
							}
							if (Static34.aClass55_504.method1640(Static83.aClass55_953)) {
								Static106.aBoolean111 = false;
							}
							if (Static34.aClass55_504.method1640(Static63.aClass55_754)) {
								for (local221 = 0; local221 < 4; local221++) {
									for (@Pc(225) int local225 = 1; local225 < 103; local225++) {
										for (@Pc(229) int local229 = 1; local229 < 103; local229++) {
											Static96.aClass57Array1[local221].anIntArrayArray20[local225][local229] = 0;
										}
									}
								}
							}
							if (Static34.aClass55_504.method1640(Static68.aClass55_806) && Static21.anInt1000 == 2) {
								throw new RuntimeException();
							}
							if (Static34.aClass55_504.method1640(Static59.aClass55_705)) {
								Static10.aBoolean29 = true;
							}
						}
						if (Static34.aClass55_504.method1659(Static32.aClass55_459)) {
							Static51.aClass6_Sub1_Sub1_3.method1515(127);
							Static51.aClass6_Sub1_Sub1_3.method1501(Static34.aClass55_504.method1674() - 1);
							Static51.aClass6_Sub1_Sub1_3.method1493(Static34.aClass55_504.method1673(2));
						} else {
							@Pc(284) Class55 local284 = Static34.aClass55_504.method1669();
							@Pc(286) byte local286 = 0;
							if (local284.method1659(Static38.aClass55_537)) {
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static38.aClass55_537.method1674());
								local286 = 0;
							} else if (local284.method1659(Static33.aClass55_483)) {
								local286 = 1;
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static33.aClass55_483.method1674());
							} else if (local284.method1659(Static23.aClass55_376)) {
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static23.aClass55_376.method1674());
								local286 = 2;
							} else if (local284.method1659(Static24.aClass55_396)) {
								local286 = 3;
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static24.aClass55_396.method1674());
							} else if (local284.method1659(Static79.aClass55_919)) {
								local286 = 4;
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static79.aClass55_919.method1674());
							} else if (local284.method1659(Static20.aClass55_340)) {
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static20.aClass55_340.method1674());
								local286 = 5;
							} else if (local284.method1659(Static18.aClass55_326)) {
								local286 = 6;
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static18.aClass55_326.method1674());
							} else if (local284.method1659(Static31.aClass55_448)) {
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static31.aClass55_448.method1674());
								local286 = 7;
							} else if (local284.method1659(Static47.aClass55_582)) {
								local286 = 8;
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static47.aClass55_582.method1674());
							} else if (local284.method1659(Static85.aClass55_996)) {
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static85.aClass55_996.method1674());
								local286 = 9;
							} else if (local284.method1659(Static81.aClass55_926)) {
								local286 = 10;
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static81.aClass55_926.method1674());
							} else if (local284.method1659(Static105.aClass55_1290)) {
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static105.aClass55_1290.method1674());
								local286 = 11;
							}
							@Pc(478) byte local478 = 0;
							local284 = Static34.aClass55_504.method1669();
							if (local284.method1659(Static81.aClass55_924)) {
								local478 = 1;
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static81.aClass55_924.method1674());
							} else if (local284.method1659(Static92.aClass55_1065)) {
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static92.aClass55_1065.method1674());
								local478 = 2;
							} else if (local284.method1659(Static24.aClass55_393)) {
								local478 = 3;
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static24.aClass55_393.method1674());
							} else if (local284.method1659(Static21.aClass55_367)) {
								local478 = 4;
								Static34.aClass55_504 = Static34.aClass55_504.method1673(Static21.aClass55_367.method1674());
							} else if (local284.method1659(aClass55_761)) {
								Static34.aClass55_504 = Static34.aClass55_504.method1673(aClass55_761.method1674());
								local478 = 5;
							}
							Static51.aClass6_Sub1_Sub1_3.method1515(48);
							Static51.aClass6_Sub1_Sub1_3.method1501(0);
							@Pc(575) int local575 = Static51.aClass6_Sub1_Sub1_3.anInt2209;
							Static51.aClass6_Sub1_Sub1_3.method1501(local286);
							Static51.aClass6_Sub1_Sub1_3.method1501(local478);
							Static61.method1316(Static34.aClass55_504, Static51.aClass6_Sub1_Sub1_3);
							Static51.aClass6_Sub1_Sub1_3.method1506(Static51.aClass6_Sub1_Sub1_3.anInt2209 - local575);
							if (Static12.anInt717 == 2) {
								Static12.anInt717 = 3;
								Static29.aBoolean49 = true;
								Static51.aClass6_Sub1_Sub1_3.method1515(26);
								Static51.aClass6_Sub1_Sub1_3.method1501(Static12.anInt717);
								Static51.aClass6_Sub1_Sub1_3.method1501(Static112.anInt3231);
								Static51.aClass6_Sub1_Sub1_3.method1501(Static41.anInt1399);
							}
						}
						Static34.aClass55_504 = Static34.aClass55_502;
						Static72.aBoolean99 = true;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Lclient!vd;")
	public static Class6_Sub2_Sub16 method1337(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub2_Sub16 local8 = (Class6_Sub2_Sub16) Static46.aClass36_38.method1154((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static105.aClass40_Sub1_40.method1243(0, arg0);
		local8 = new Class6_Sub2_Sub16();
		@Pc(31) Class6_Sub1 local31 = new Class6_Sub1(local22);
		local31.anInt2209 = local31.aByteArray11.length - 12;
		@Pc(48) int local48 = local31.method1503();
		local8.anInt3135 = local31.method1500();
		@Pc(55) int local55 = 0;
		local8.anInt3136 = local31.method1500();
		local8.anInt3145 = local31.method1500();
		local8.anInt3144 = local31.method1500();
		local8.anIntArray295 = new int[local48];
		local8.anIntArray294 = new int[local48];
		local31.anInt2209 = 0;
		local8.aClass55Array26 = new Class55[local48];
		while (local31.aByteArray11.length - 12 > local31.anInt2209) {
			@Pc(93) int local93 = local31.method1500();
			if (local93 == 3) {
				local8.aClass55Array26[local55] = local31.method1461();
			} else if (local93 >= 100 || local93 == 21 || local93 == 38 || local93 == 39) {
				local8.anIntArray294[local55] = local31.method1495();
			} else {
				local8.anIntArray294[local55] = local31.method1503();
			}
			local8.anIntArray295[local55++] = local93;
		}
		Static46.aClass36_38.method1161((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method1338() {
		aClass55_761 = null;
		aClass21_16 = null;
		aClass4_1 = null;
		aClass55_768 = null;
		aClass55_763 = null;
		aClass55_762 = null;
		aClass55_769 = null;
		aClass55_765 = null;
		aClass65_4 = null;
		aClass55_767 = null;
		aClass55_764 = null;
		aClass55_766 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V")
	public static void method1339(@OriginalArg(0) int arg0) {
		if (Static57.aClass5_1 == null) {
			return;
		}
		if (Static52.anInt1647 != 0) {
			if (Static93.aByteArray13 == null) {
				return;
			}
			Static13.anInt799 = arg0;
		} else if (Static49.anInt1569 >= 0) {
			Static49.anInt1569 = arg0;
			Static57.aClass5_1.method1604(arg0, 0);
			return;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!eb;II)V")
	public static void method1340(@OriginalArg(1) Class6_Sub2_Sub2_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 * arg1 + arg2 * arg2;
		if (local15 <= 4225 || local15 >= 90000) {
			Static50.method2082(arg1, arg2, arg0);
			return;
		}
		@Pc(29) int local29 = Static14.anInt811 + Static8.anInt383 & 0x7FF;
		@Pc(33) int local33 = Static42.anIntArray117[local29];
		@Pc(41) int local41 = local33 * 256 / (Static27.anInt1352 + 256);
		@Pc(45) int local45 = Static42.anIntArray124[local29];
		@Pc(53) int local53 = local45 * 256 / (Static27.anInt1352 + 256);
		@Pc(63) int local63 = arg1 * local41 + local53 * arg2 >> 16;
		@Pc(74) int local74 = arg1 * local53 - local41 * arg2 >> 16;
		@Pc(80) double local80 = Math.atan2((double) local63, (double) local74);
		@Pc(86) int local86 = (int) (Math.sin(local80) * 63.0D);
		@Pc(92) int local92 = (int) (Math.cos(local80) * 57.0D);
		Static43.aClass6_Sub2_Sub2_Sub2_7.method644(local86 + 94 - 6, -local92 + 63, local80);
	}
}
