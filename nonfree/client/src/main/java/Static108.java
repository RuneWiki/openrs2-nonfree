import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
	public static int anInt2550;

	@OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
	public static int anInt2553;

	@OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
	public static int anInt2549 = 0;

	@OriginalMember(owner = "client!ub", name = "B", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1621 = Static69.method1153("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	public static int anInt2551 = 0;

	@OriginalMember(owner = "client!ub", name = "J", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1623 = Static69.method1153("skill)2");

	@OriginalMember(owner = "client!ub", name = "E", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1622 = aClass64_1623;

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
	public static int anInt2556 = 0;

	@OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
	public static int anInt2557 = 0;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1624 = Static69.method1153("mapedge");

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V")
	public static void method1803() {
		aClass64_1623 = null;
		aClass64_1624 = null;
		aClass64_1622 = null;
		aClass64_1621 = null;
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	public static void method1804() {
		while (Static60.method1017()) {
			if (Static95.anInt2177 != -1 && Static99.anInt2208 == Static95.anInt2177) {
				if (Static5.anInt122 == 85 && Static60.aClass64_867.method1469() > 0) {
					Static60.aClass64_867 = Static60.aClass64_867.method1475(Static60.aClass64_867.method1469() - 1, 0);
				}
				if ((Static74.method1232(Static21.anInt654) || Static21.anInt654 == 32) && Static60.aClass64_867.method1469() < 12) {
					Static60.aClass64_867 = Static60.aClass64_867.method1499(Static21.anInt654);
				}
			} else {
				@Pc(127) int local127;
				if (Static3.aBoolean9) {
					if (Static5.anInt122 == 85 && Static60.aClass64_869.method1469() > 0) {
						Static60.aClass64_869 = Static60.aClass64_869.method1475(Static60.aClass64_869.method1469() - 1, 0);
						Static116.aBoolean166 = true;
					}
					if (Static57.method964(Static21.anInt654) && Static60.aClass64_869.method1469() < 80) {
						Static60.aClass64_869 = Static60.aClass64_869.method1499(Static21.anInt654);
						Static116.aBoolean166 = true;
					}
					if (Static5.anInt122 == 84) {
						Static116.aBoolean166 = true;
						Static3.aBoolean9 = false;
						@Pc(979) long local979;
						if (Static42.anInt930 == 1) {
							local979 = Static60.aClass64_869.method1492();
							Static99.method1602(local979);
						}
						if (Static42.anInt930 == 2 && Static106.anInt2498 > 0) {
							local979 = Static60.aClass64_869.method1492();
							Static74.method1236(local979);
						}
						if (Static42.anInt930 == 3 && Static60.aClass64_869.method1469() > 0) {
							Static49.aClass1_Sub6_Sub1_1.method1877(32);
							Static49.aClass1_Sub6_Sub1_1.method1853(0);
							local127 = Static49.aClass1_Sub6_Sub1_1.anInt2574;
							Static49.aClass1_Sub6_Sub1_1.method1830(Static34.aLong27);
							Static5.method142(Static60.aClass64_869, Static49.aClass1_Sub6_Sub1_1);
							Static49.aClass1_Sub6_Sub1_1.method1866(Static49.aClass1_Sub6_Sub1_1.anInt2574 - local127);
							if (anInt2556 == 2) {
								anInt2556 = 1;
								Static19.aBoolean42 = true;
								Static49.aClass1_Sub6_Sub1_1.method1877(4);
								Static49.aClass1_Sub6_Sub1_1.method1853(Static10.anInt406);
								Static49.aClass1_Sub6_Sub1_1.method1853(anInt2556);
								Static49.aClass1_Sub6_Sub1_1.method1853(Static80.anInt1901);
							}
						}
						if (Static42.anInt930 == 4 && Static73.anInt1656 < 100) {
							local979 = Static60.aClass64_869.method1492();
							Static54.method1461(local979);
						}
						if (Static42.anInt930 == 5 && Static73.anInt1656 > 0) {
							local979 = Static60.aClass64_869.method1492();
							Static45.method816(local979);
						}
					}
				} else if (Static118.anInt2834 == 1) {
					if (Static5.anInt122 == 85 && Static60.aClass64_863.method1469() > 0) {
						Static60.aClass64_863 = Static60.aClass64_863.method1475(Static60.aClass64_863.method1469() - 1, 0);
						Static116.aBoolean166 = true;
					}
					if (Static23.method453(Static21.anInt654) && Static60.aClass64_863.method1469() < 10) {
						Static60.aClass64_863 = Static60.aClass64_863.method1499(Static21.anInt654);
						Static116.aBoolean166 = true;
					}
					if (Static5.anInt122 == 84) {
						if (Static60.aClass64_863.method1469() > 0) {
							local127 = 0;
							if (Static60.aClass64_863.method1483()) {
								local127 = Static60.aClass64_863.method1491();
							}
							Static49.aClass1_Sub6_Sub1_1.method1877(60);
							Static49.aClass1_Sub6_Sub1_1.method1851(local127);
						}
						Static116.aBoolean166 = true;
						Static118.anInt2834 = 0;
					}
				} else if (Static118.anInt2834 == 2) {
					if (Static5.anInt122 == 85 && Static60.aClass64_863.method1469() > 0) {
						Static60.aClass64_863 = Static60.aClass64_863.method1475(Static60.aClass64_863.method1469() - 1, 0);
						Static116.aBoolean166 = true;
					}
					if ((Static74.method1232(Static21.anInt654) || Static21.anInt654 == 32) && Static60.aClass64_863.method1469() < 12) {
						Static60.aClass64_863 = Static60.aClass64_863.method1499(Static21.anInt654);
						Static116.aBoolean166 = true;
					}
					if (Static5.anInt122 == 84) {
						if (Static60.aClass64_863.method1469() > 0) {
							Static49.aClass1_Sub6_Sub1_1.method1877(194);
							Static49.aClass1_Sub6_Sub1_1.method1830(Static60.aClass64_863.method1492());
						}
						Static116.aBoolean166 = true;
						Static118.anInt2834 = 0;
					}
				} else if (Static118.anInt2834 == 3) {
					if (Static5.anInt122 == 85 && Static60.aClass64_863.method1469() > 0) {
						Static60.aClass64_863 = Static60.aClass64_863.method1475(Static60.aClass64_863.method1469() - 1, 0);
						Static116.aBoolean166 = true;
					}
					if (Static57.method964(Static21.anInt654) && Static60.aClass64_863.method1469() < 40) {
						Static60.aClass64_863 = Static60.aClass64_863.method1499(Static21.anInt654);
						Static116.aBoolean166 = true;
					}
				} else if (Static118.anInt2834 == 4) {
					if (Static5.anInt122 == 85 && Static60.aClass64_863.method1469() > 0) {
						Static60.aClass64_863 = Static60.aClass64_863.method1475(Static60.aClass64_863.method1469() - 1, 0);
						Static116.aBoolean166 = true;
					}
					if ((Static57.method964(Static21.anInt654) || Static21.anInt654 == 32) && Static60.aClass64_863.method1469() < 80) {
						Static60.aClass64_863 = Static60.aClass64_863.method1499(Static21.anInt654);
						Static116.aBoolean166 = true;
					}
					if (Static5.anInt122 == 84) {
						if (Static60.aClass64_863.method1469() > 0) {
							Static49.aClass1_Sub6_Sub1_1.method1877(10);
							Static49.aClass1_Sub6_Sub1_1.method1853(Static60.aClass64_863.method1469() + 1);
							Static49.aClass1_Sub6_Sub1_1.method1827(Static60.aClass64_863);
						}
						Static116.aBoolean166 = true;
						Static118.anInt2834 = 0;
					}
				} else if (Static101.anInt2272 == -1 && Static27.anInt889 == -1) {
					if (Static5.anInt122 == 85 && Static60.aClass64_868.method1469() > 0) {
						Static60.aClass64_868 = Static60.aClass64_868.method1475(Static60.aClass64_868.method1469() - 1, 0);
						Static116.aBoolean166 = true;
					}
					if (Static57.method964(Static21.anInt654) && Static60.aClass64_868.method1469() < 80) {
						Static60.aClass64_868 = Static60.aClass64_868.method1499(Static21.anInt654);
						Static116.aBoolean166 = true;
					}
					if (Static5.anInt122 == 84 && Static60.aClass64_868.method1469() > 0) {
						if (Static46.anInt1085 == 2) {
							if (Static60.aClass64_868.method1496(Static95.aClass64_1383)) {
								System.gc();
							}
							if (Static60.aClass64_868.method1496(Static16.aClass64_330)) {
								Static71.method1181();
							}
							if (Static60.aClass64_868.method1496(Static109.aClass64_1653)) {
								Static100.aBoolean135 = true;
							}
							if (Static60.aClass64_868.method1496(Static41.aClass64_1693)) {
								Static100.aBoolean135 = false;
							}
							if (Static60.aClass64_868.method1496(Static68.aClass64_966)) {
								for (local127 = 0; local127 < 4; local127++) {
									for (@Pc(346) int local346 = 1; local346 < 103; local346++) {
										for (@Pc(350) int local350 = 1; local350 < 103; local350++) {
											Static74.aClass52Array1[local127].anIntArrayArray22[local346][local350] = 0;
										}
									}
								}
							}
							if (Static60.aClass64_868.method1496(Static93.aClass64_1320) && Static45.anInt1072 == 2) {
								throw new RuntimeException();
							}
							if (Static60.aClass64_868.method1496(Static12.aClass64_1230)) {
								Static1.aBoolean3 = true;
							}
						}
						if (Static60.aClass64_868.method1479(Static30.aClass64_482)) {
							Static49.aClass1_Sub6_Sub1_1.method1877(199);
							Static49.aClass1_Sub6_Sub1_1.method1853(Static60.aClass64_868.method1469() - 1);
							Static49.aClass1_Sub6_Sub1_1.method1827(Static60.aClass64_868.method1481(2));
						} else {
							@Pc(401) byte local401 = 0;
							@Pc(407) byte local407 = 0;
							@Pc(411) Class64 local411 = Static60.aClass64_868.method1503();
							if (local411.method1479(Static7.aClass64_244)) {
								local407 = 0;
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static7.aClass64_244.method1469());
							} else if (local411.method1479(Static109.aClass64_1654)) {
								local407 = 1;
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static109.aClass64_1654.method1469());
							} else if (local411.method1479(Static2.aClass64_82)) {
								local407 = 2;
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static2.aClass64_82.method1469());
							} else if (local411.method1479(Static52.aClass64_1828)) {
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static52.aClass64_1828.method1469());
								local407 = 3;
							} else if (local411.method1479(Static114.aClass64_1744)) {
								local407 = 4;
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static114.aClass64_1744.method1469());
							} else if (local411.method1479(Static73.aClass64_1038)) {
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static73.aClass64_1038.method1469());
								local407 = 5;
							} else if (local411.method1479(Static52.aClass64_1817)) {
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static52.aClass64_1817.method1469());
								local407 = 6;
							} else if (local411.method1479(Static96.aClass64_1760)) {
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static96.aClass64_1760.method1469());
								local407 = 7;
							} else if (local411.method1479(Static89.aClass64_1281)) {
								local407 = 8;
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static89.aClass64_1281.method1469());
							} else if (local411.method1479(Static80.aClass64_1172)) {
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static80.aClass64_1172.method1469());
								local407 = 9;
							} else if (local411.method1479(Static42.aClass64_618)) {
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static42.aClass64_618.method1469());
								local407 = 10;
							} else if (local411.method1479(Static94.aClass64_1353)) {
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static94.aClass64_1353.method1469());
								local407 = 11;
							}
							local411 = Static60.aClass64_868.method1503();
							if (local411.method1479(Static74.aClass64_1071)) {
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static74.aClass64_1071.method1469());
								local401 = 1;
							} else if (local411.method1479(Static55.aClass64_1813)) {
								local401 = 2;
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static55.aClass64_1813.method1469());
							} else if (local411.method1479(Static39.aClass64_597)) {
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static39.aClass64_597.method1469());
								local401 = 3;
							} else if (local411.method1479(Static5.aClass64_121)) {
								local401 = 4;
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static5.aClass64_121.method1469());
							} else if (local411.method1479(Static62.aClass64_897)) {
								Static60.aClass64_868 = Static60.aClass64_868.method1481(Static62.aClass64_897.method1469());
								local401 = 5;
							}
							Static49.aClass1_Sub6_Sub1_1.method1877(247);
							Static49.aClass1_Sub6_Sub1_1.method1853(0);
							@Pc(718) int local718 = Static49.aClass1_Sub6_Sub1_1.anInt2574;
							Static49.aClass1_Sub6_Sub1_1.method1853(local407);
							Static49.aClass1_Sub6_Sub1_1.method1853(local401);
							Static5.method142(Static60.aClass64_868, Static49.aClass1_Sub6_Sub1_1);
							Static49.aClass1_Sub6_Sub1_1.method1866(Static49.aClass1_Sub6_Sub1_1.anInt2574 - local718);
							if (Static10.anInt406 == 2) {
								Static19.aBoolean42 = true;
								Static10.anInt406 = 3;
								Static49.aClass1_Sub6_Sub1_1.method1877(4);
								Static49.aClass1_Sub6_Sub1_1.method1853(Static10.anInt406);
								Static49.aClass1_Sub6_Sub1_1.method1853(anInt2556);
								Static49.aClass1_Sub6_Sub1_1.method1853(Static80.anInt1901);
							}
						}
						Static116.aBoolean166 = true;
						Static60.aClass64_868 = Static60.aClass64_862;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZIIB)Lclient!rd;")
	public static Class64 method1805(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19 = 1;
		@Pc(23) int local23 = arg1 / 10;
		while (local23 != 0) {
			local23 /= 10;
			local19++;
		}
		@Pc(34) int local34 = local19;
		if (arg1 < 0 || arg0) {
			local34 = local19 + 1;
		}
		@Pc(45) byte[] local45 = new byte[local34];
		if (arg1 < 0) {
			local45[0] = 45;
		} else if (arg0) {
			local45[0] = 43;
		}
		for (@Pc(66) int local66 = 0; local66 < local19; local66++) {
			@Pc(72) int local72 = arg1 % 10;
			if (local72 < 0) {
				local72 = -local72;
			}
			if (local72 > 9) {
				local72 += 39;
			}
			local45[local34 - local66 - 1] = (byte) (local72 + 48);
			arg1 /= 10;
		}
		@Pc(108) Class64 local108 = new Class64();
		local108.aByteArray24 = local45;
		local108.anInt2086 = local34;
		return local108;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILclient!gb;I)V")
	public static void method1806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub5_Sub1 arg2, @OriginalArg(4) int arg3) {
		Static9.aClass37_4.method1459();
		Static118.aClass1_Sub1_Sub5_Sub3_19.method1290(0, 0);
		arg2.method663(Static109.aClass64_1649, 55, 28, 16777215, true);
		if (arg1 == 0) {
			arg2.method663(Static19.aClass64_376, 55, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg2.method663(Static27.aClass64_580, 55, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg2.method663(Static10.aClass64_282, 55, 41, 16711680, true);
		}
		if (arg1 == 3) {
			arg2.method663(Static120.aClass64_1840, 55, 41, 65535, true);
		}
		arg2.method663(Static21.aClass64_382, 184, 28, 16777215, true);
		if (arg0 == 0) {
			arg2.method663(Static19.aClass64_376, 184, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg2.method663(Static27.aClass64_580, 184, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg2.method663(Static10.aClass64_282, 184, 41, 16711680, true);
		}
		arg2.method663(Static85.aClass64_1766, 324, 28, 16777215, true);
		if (arg3 == 0) {
			arg2.method663(Static19.aClass64_376, 324, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg2.method663(Static27.aClass64_580, 324, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg2.method663(Static10.aClass64_282, 324, 41, 16711680, true);
		}
		arg2.method658(Static68.aClass64_962, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
		try {
			@Pc(154) Graphics local154 = Static93.aCanvas1.getGraphics();
			Static9.aClass37_4.method1457(0, 453, local154);
		} catch (@Pc(164) Exception local164) {
			Static93.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)Lclient!bd;")
	public static Class1_Sub1_Sub3 method1807(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub3 local10 = (Class1_Sub1_Sub3) Static66.aClass19_54.method410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static105.aClass41_64.method1062(6, arg0);
		local10 = new Class1_Sub1_Sub3();
		local10.anInt374 = arg0;
		if (local20 != null) {
			local10.method250(new Class1_Sub6(local20));
		}
		local10.method262();
		if (local10.aBoolean23) {
			local10.aBoolean31 = false;
			local10.aBoolean25 = false;
		}
		Static66.aClass19_54.method409(local10, (long) arg0);
		return local10;
	}
}
