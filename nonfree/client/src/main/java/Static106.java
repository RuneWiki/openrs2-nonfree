import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!wc", name = "Zb", descriptor = "Lclient!ib;")
	public static Class12 aClass12_1;

	@OriginalMember(owner = "client!wc", name = "Kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_739 = Static13.method257("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!wc", name = "Pb", descriptor = "[Lclient!o;")
	public static Class40[] aClass40Array40 = new Class40[100];

	@OriginalMember(owner = "client!wc", name = "Rb", descriptor = "Lclient!o;")
	public static Class40 aClass40_740 = Static13.method257("Importing models )2 ");

	@OriginalMember(owner = "client!wc", name = "Yb", descriptor = "Lclient!o;")
	public static Class40 aClass40_741 = Static13.method257("You need to set*6nnew contact details)3");

	@OriginalMember(owner = "client!wc", name = "ac", descriptor = "Lclient!o;")
	public static Class40 aClass40_742 = Static13.method257("The server is being updated)3");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!ud;I)[B")
	public static byte[] method1735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) int arg3) {
		@Pc(23) long local23 = (long) (arg3 << 16) + ((long) arg0 << 1442185824) + (long) (arg1 + arg3 * 37 & 0xFFFF);
		if (Static37.aClass47_9 != null) {
			@Pc(31) Class2_Sub2_Sub3 local31 = (Class2_Sub2_Sub3) Static37.aClass47_9.method1325(local23);
			if (local31 != null) {
				return local31.aByteArray3;
			}
		}
		@Pc(42) byte[] local42 = arg2.method68(arg1, arg3);
		if (local42 == null) {
			return null;
		} else {
			if (Static37.aClass47_9 != null) {
				Static37.aClass47_9.method1332(local23, new Class2_Sub2_Sub3(local42));
			}
			return local42;
		}
	}

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "(I)V")
	public static void method1738() {
		aClass40_742 = null;
		aClass12_1 = null;
		aClass40_740 = null;
		aClass40_739 = null;
		aClass40Array40 = null;
		aClass40_741 = null;
	}

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "(I)V")
	public static void method1740() {
		while (Static97.method1561()) {
			if (Static22.anInt2585 != -1 && Static75.anInt1826 == Static22.anInt2585) {
				if (Static37.anInt935 == 85 && Static61.aClass40_448.method1169() > 0) {
					Static61.aClass40_448 = Static61.aClass40_448.method1180(Static61.aClass40_448.method1169() - 1, 0);
				}
				if ((Static1.method2(Static4.anInt135) || Static4.anInt135 == 32) && Static61.aClass40_448.method1169() < 12) {
					Static61.aClass40_448 = Static61.aClass40_448.method1192(Static4.anInt135);
				}
			} else {
				@Pc(162) int local162;
				if (Static74.aBoolean146) {
					if (Static37.anInt935 == 85 && Static61.aClass40_447.method1169() > 0) {
						Static61.aClass40_447 = Static61.aClass40_447.method1180(Static61.aClass40_447.method1169() - 1, 0);
						Static73.aBoolean144 = true;
					}
					if (Static75.method1228(Static4.anInt135) && Static61.aClass40_447.method1169() < 80) {
						Static61.aClass40_447 = Static61.aClass40_447.method1192(Static4.anInt135);
						Static73.aBoolean144 = true;
					}
					if (Static37.anInt935 == 84) {
						Static73.aBoolean144 = true;
						Static74.aBoolean146 = false;
						@Pc(117) long local117;
						if (Static93.anInt2180 == 1) {
							local117 = Static61.aClass40_447.method1179();
							Static63.method1062(local117);
						}
						if (Static93.anInt2180 == 2 && Static22.anInt2594 > 0) {
							local117 = Static61.aClass40_447.method1179();
							Static70.method1115(local117);
						}
						if (Static93.anInt2180 == 3 && Static61.aClass40_447.method1169() > 0) {
							Static80.aClass2_Sub3_Sub1_4.method1736(22);
							Static80.aClass2_Sub3_Sub1_4.method1703(0);
							local162 = Static80.aClass2_Sub3_Sub1_4.anInt2546;
							Static80.aClass2_Sub3_Sub1_4.method1680(Static56.aLong136);
							Static34.method624(Static61.aClass40_447, Static80.aClass2_Sub3_Sub1_4);
							Static80.aClass2_Sub3_Sub1_4.method1731(Static80.aClass2_Sub3_Sub1_4.anInt2546 - local162);
							if (Static104.anInt2515 == 2) {
								Static104.anInt2515 = 1;
								Static52.aBoolean95 = true;
								Static80.aClass2_Sub3_Sub1_4.method1736(132);
								Static80.aClass2_Sub3_Sub1_4.method1703(Static23.anInt583);
								Static80.aClass2_Sub3_Sub1_4.method1703(Static104.anInt2515);
								Static80.aClass2_Sub3_Sub1_4.method1703(Static103.anInt2491);
							}
						}
						if (Static93.anInt2180 == 4 && Static99.anInt121 < 100) {
							local117 = Static61.aClass40_447.method1179();
							Static15.method1254(local117);
						}
						if (Static93.anInt2180 == 5 && Static99.anInt121 > 0) {
							local117 = Static61.aClass40_447.method1179();
							Static82.method1345(local117);
						}
					}
				} else if (Static101.anInt2399 == 1) {
					if (Static37.anInt935 == 85 && Static61.aClass40_444.method1169() > 0) {
						Static61.aClass40_444 = Static61.aClass40_444.method1180(Static61.aClass40_444.method1169() - 1, 0);
						Static73.aBoolean144 = true;
					}
					if (Static66.method1094(Static4.anInt135) && Static61.aClass40_444.method1169() < 10) {
						Static61.aClass40_444 = Static61.aClass40_444.method1192(Static4.anInt135);
						Static73.aBoolean144 = true;
					}
					if (Static37.anInt935 == 84) {
						if (Static61.aClass40_444.method1169() > 0) {
							local162 = 0;
							if (Static61.aClass40_444.method1176()) {
								local162 = Static61.aClass40_444.method1198();
							}
							Static80.aClass2_Sub3_Sub1_4.method1736(122);
							Static80.aClass2_Sub3_Sub1_4.method1725(local162);
						}
						Static73.aBoolean144 = true;
						Static101.anInt2399 = 0;
					}
				} else if (Static101.anInt2399 == 2) {
					if (Static37.anInt935 == 85 && Static61.aClass40_444.method1169() > 0) {
						Static61.aClass40_444 = Static61.aClass40_444.method1180(Static61.aClass40_444.method1169() - 1, 0);
						Static73.aBoolean144 = true;
					}
					if ((Static1.method2(Static4.anInt135) || Static4.anInt135 == 32) && Static61.aClass40_444.method1169() < 12) {
						Static61.aClass40_444 = Static61.aClass40_444.method1192(Static4.anInt135);
						Static73.aBoolean144 = true;
					}
					if (Static37.anInt935 == 84) {
						if (Static61.aClass40_444.method1169() > 0) {
							Static80.aClass2_Sub3_Sub1_4.method1736(51);
							Static80.aClass2_Sub3_Sub1_4.method1680(Static61.aClass40_444.method1179());
						}
						Static73.aBoolean144 = true;
						Static101.anInt2399 = 0;
					}
				} else if (Static101.anInt2399 == 3) {
					if (Static37.anInt935 == 85 && Static61.aClass40_444.method1169() > 0) {
						Static61.aClass40_444 = Static61.aClass40_444.method1180(Static61.aClass40_444.method1169() - 1, 0);
						Static73.aBoolean144 = true;
					}
					if (Static75.method1228(Static4.anInt135) && Static61.aClass40_444.method1169() < 40) {
						Static61.aClass40_444 = Static61.aClass40_444.method1192(Static4.anInt135);
						Static73.aBoolean144 = true;
					}
				} else if (Static85.anInt1994 == -1 && Static84.anInt1971 == -1) {
					if (Static37.anInt935 == 85 && Static61.aClass40_451.method1169() > 0) {
						Static61.aClass40_451 = Static61.aClass40_451.method1180(Static61.aClass40_451.method1169() - 1, 0);
						Static73.aBoolean144 = true;
					}
					if (Static75.method1228(Static4.anInt135) && Static61.aClass40_451.method1169() < 80) {
						Static61.aClass40_451 = Static61.aClass40_451.method1192(Static4.anInt135);
						Static73.aBoolean144 = true;
					}
					if (Static37.anInt935 == 84 && Static61.aClass40_451.method1169() > 0) {
						if (Static61.anInt1550 == 2) {
							if (Static61.aClass40_451.method1184(Static70.aClass40_494)) {
								Static34.method626();
							}
							if (Static61.aClass40_451.method1184(Static81.aClass40_560)) {
								Static96.aBoolean173 = true;
							}
							if (Static61.aClass40_451.method1184(Static24.aClass40_182)) {
								Static96.aBoolean173 = false;
							}
							if (Static61.aClass40_451.method1184(Static66.aClass40_480)) {
								for (local162 = 0; local162 < 4; local162++) {
									for (@Pc(435) int local435 = 1; local435 < 103; local435++) {
										for (@Pc(439) int local439 = 1; local439 < 103; local439++) {
											Static79.aClass20Array3[local162].anIntArrayArray9[local435][local439] = 0;
										}
									}
								}
							}
							if (Static61.aClass40_451.method1184(Static10.aClass40_62) && Static90.anInt2132 == 2) {
								throw new RuntimeException();
							}
							if (Static61.aClass40_451.method1184(Static52.aClass40_360)) {
								Static72.aBoolean143 = true;
							}
						}
						if (Static61.aClass40_451.method1168(Static23.aClass40_164)) {
							Static80.aClass2_Sub3_Sub1_4.method1736(92);
							Static80.aClass2_Sub3_Sub1_4.method1703(Static61.aClass40_451.method1169() - 1);
							Static80.aClass2_Sub3_Sub1_4.method1683(Static61.aClass40_451.method1185(2));
						} else {
							@Pc(525) Class40 local525 = Static61.aClass40_451.method1196();
							@Pc(527) byte local527 = 0;
							@Pc(529) byte local529 = 0;
							if (local525.method1168(Static45.aClass40_342)) {
								local527 = 0;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(7);
							} else if (local525.method1168(Static32.aClass40_230)) {
								Static61.aClass40_451 = Static61.aClass40_451.method1185(4);
								local527 = 1;
							} else if (local525.method1168(Static16.aClass40_109)) {
								Static61.aClass40_451 = Static61.aClass40_451.method1185(6);
								local527 = 2;
							} else if (local525.method1168(Static29.aClass40_218)) {
								local527 = 3;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(5);
							} else if (local525.method1168(Static82.aClass40_566)) {
								local527 = 4;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(7);
							} else if (local525.method1168(Static15.aClass40_538)) {
								local527 = 5;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(6);
							} else if (local525.method1168(Static20.aClass40_132)) {
								Static61.aClass40_451 = Static61.aClass40_451.method1185(7);
								local527 = 6;
							} else if (local525.method1168(Static51.aClass40_355)) {
								local527 = 7;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(7);
							} else if (local525.method1168(Static82.aClass40_565)) {
								local527 = 8;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(7);
							} else if (local525.method1168(Static90.aClass40_610)) {
								local527 = 9;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(6);
							} else if (local525.method1168(Static61.aClass40_450)) {
								local527 = 10;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(6);
							} else if (local525.method1168(Static83.aClass40_568)) {
								Static61.aClass40_451 = Static61.aClass40_451.method1185(6);
								local527 = 11;
							}
							local525 = Static61.aClass40_451.method1196();
							if (local525.method1168(Static63.aClass40_472)) {
								Static61.aClass40_451 = Static61.aClass40_451.method1185(5);
								local529 = 1;
							} else if (local525.method1168(Static10.aClass40_67)) {
								local529 = 2;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(6);
							} else if (local525.method1168(Static44.aClass40_334)) {
								local529 = 3;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(6);
							} else if (local525.method1168(Static93.aClass40_627)) {
								local529 = 4;
								Static61.aClass40_451 = Static61.aClass40_451.method1185(7);
							} else if (local525.method1168(Static73.aClass40_519)) {
								Static61.aClass40_451 = Static61.aClass40_451.method1185(6);
								local529 = 5;
							}
							Static80.aClass2_Sub3_Sub1_4.method1736(40);
							Static80.aClass2_Sub3_Sub1_4.method1703(0);
							@Pc(794) int local794 = Static80.aClass2_Sub3_Sub1_4.anInt2546;
							Static80.aClass2_Sub3_Sub1_4.method1703(local527);
							Static80.aClass2_Sub3_Sub1_4.method1703(local529);
							Static34.method624(Static61.aClass40_451, Static80.aClass2_Sub3_Sub1_4);
							Static80.aClass2_Sub3_Sub1_4.method1731(Static80.aClass2_Sub3_Sub1_4.anInt2546 - local794);
							if (Static23.anInt583 == 2) {
								Static23.anInt583 = 3;
								Static52.aBoolean95 = true;
								Static80.aClass2_Sub3_Sub1_4.method1736(132);
								Static80.aClass2_Sub3_Sub1_4.method1703(Static23.anInt583);
								Static80.aClass2_Sub3_Sub1_4.method1703(Static104.anInt2515);
								Static80.aClass2_Sub3_Sub1_4.method1703(Static103.anInt2491);
							}
						}
						Static61.aClass40_451 = Static61.aClass40_445;
						Static73.aBoolean144 = true;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ud;Lclient!ud;BZ)V")
	public static void method1741(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) boolean arg2) {
		Static56.aClass5_29 = arg0;
		Static43.aBoolean150 = arg2;
		Static41.aClass5_13 = arg1;
		Static38.anInt971 = Static41.aClass5_13.method76(10);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZLclient!ud;ILclient!ud;I)Lclient!sb;")
	public static Class2_Sub2_Sub14 method1744(@OriginalArg(1) Class5 arg0, @OriginalArg(3) Class5 arg1, @OriginalArg(4) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg0.method81(arg2);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(27) byte[] local27 = arg0.method60(arg2, local12[local14]);
			if (local27 == null) {
				local7 = false;
			} else {
				@Pc(47) int local47 = (local27[0] & 0xFF) << 8 | local27[1] & 0xFF;
				@Pc(55) byte[] local55 = arg1.method60(local47, 0);
				if (local55 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub2_Sub14(arg0, arg1, arg2, false);
		} catch (@Pc(89) Exception local89) {
			return null;
		}
	}
}
