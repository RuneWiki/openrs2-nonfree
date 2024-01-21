import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "Lclient!pb;")
	public static Class71 aClass71_4;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_148 = Static151.method2243("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
	public static int anInt515 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!ii;)Lclient!mb;")
	public static Class62 method394(@OriginalArg(1) Class47 arg0) {
		if (Static6.method132(Static155.method2304(arg0)) == 0) {
			return null;
		} else if (arg0.aClass62_613 == null || arg0.aClass62_613.method1846().method1878() == 0) {
			return Static172.aBoolean27 ? Static167.aClass62_1251 : null;
		} else {
			return arg0.aClass62_613;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lclient!mb;")
	public static Class62 method395(@OriginalArg(0) int arg0) {
		@Pc(5) Class62 local5 = Static119.method1865(arg0);
		for (@Pc(11) int local11 = local5.method1878() - 3; local11 > 0; local11 -= 3) {
			local5 = Static169.method2460(new Class62[] { local5.method1862(0, local11), Static23.aClass62_157, local5.method1849(local11) });
		}
		if (local5.method1878() > 9) {
			return Static169.method2460(new Class62[] { Static35.aClass62_269, local5.method1862(0, local5.method1878() - 8), Static126.aClass62_987, Static17.aClass62_131, local5, Static208.aClass62_1496 });
		} else if (local5.method1878() > 6) {
			return Static169.method2460(new Class62[] { Static71.aClass62_498, local5.method1862(0, local5.method1878() - 4), Static216.aClass62_1545, Static17.aClass62_131, local5, Static208.aClass62_1496 });
		} else {
			return Static169.method2460(new Class62[] { Static10.aClass62_71, local5, Static54.aClass62_385 });
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Z")
	public static boolean method396(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIZZIIZ)Lclient!vi;")
	public static Class2_Sub1_Sub2 method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5) {
		@Pc(9) Class2_Sub1_Sub26 local9 = Static52.method774(arg2);
		if (arg1 > 1 && local9.anIntArray430 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (arg1 >= local9.anIntArray429[local19] && local9.anIntArray429[local19] != 0) {
					local17 = local9.anIntArray430[local19];
				}
			}
			if (local17 != -1) {
				local9 = Static52.method774(local17);
			}
		}
		@Pc(53) Class7_Sub7_Sub1 local53 = local9.method3195();
		if (local53 == null) {
			return null;
		}
		@Pc(59) Class2_Sub1_Sub2 local59 = null;
		if (local9.anInt4538 != -1) {
			local59 = method397(1, 10, local9.anInt4524, false, 0, true);
			if (local59 == null) {
				return null;
			}
		} else if (local9.anInt4542 != -1) {
			local59 = method397(arg0, arg1, local9.anInt4557, false, arg4, false);
			if (local59 == null) {
				return null;
			}
		}
		@Pc(102) int[] local102 = Static212.anIntArray398;
		@Pc(104) int local104 = Static212.anInt4430;
		@Pc(106) int local106 = Static212.anInt4431;
		@Pc(109) int[] local109 = new int[4];
		Static212.method3098(local109);
		@Pc(117) Class2_Sub1_Sub2_Sub1 local117 = new Class2_Sub1_Sub2_Sub1(36, 32);
		Static212.method3111(local117.anIntArray32, 36, 32);
		Static212.method3093();
		Static45.method700();
		Static45.method696(16, 16);
		Static45.aBoolean42 = false;
		if (local9.anInt4542 != -1) {
			local59.method280(0, 0);
		}
		@Pc(140) int local140 = local9.anInt4549;
		if (arg5) {
			local140 = (int) ((double) local140 * 1.5D);
		} else if (arg0 == 2) {
			local140 = (int) ((double) local140 * 1.04D);
		}
		@Pc(170) int local170 = local140 * Class26.anIntArray76[local9.anInt4545] >> 16;
		@Pc(179) int local179 = Class26.anIntArray77[local9.anInt4545] * local140 >> 16;
		local53.method3166(local9.anInt4530, local9.anInt4514, local9.anInt4545, local9.anInt4515, local179 + local9.anInt4539 - local53.method3148() / 2, local170 - -local9.anInt4539);
		if (local9.anInt4542 == -1) {
			if (arg0 >= 1) {
				local117.method286(1);
			}
			if (arg0 >= 2) {
				local117.method286(16777215);
			}
			if (arg4 != 0) {
				local117.method293(arg4);
			}
		}
		Static212.method3111(local117.anIntArray32, 36, 32);
		if (local9.anInt4538 != -1) {
			local59.method280(0, 0);
		}
		if (arg3 && (local9.anInt4541 == 1 || arg1 != 1) && arg1 != -1) {
			Static8.aClass2_Sub1_Sub12_Sub1_Sub1_1.method1366(Static81.method3136(arg1), 0, 9, 16776960, 1);
		}
		Static212.method3111(local102, local104, local106);
		Static212.method3108(local109);
		Static45.method700();
		Static45.aBoolean42 = true;
		return local117;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)V")
	public static void method398(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static147.anIntArray281[arg0];
		@Pc(14) long local14 = Static150.aLongArray9[arg0];
		@Pc(19) int local19 = (int) Static150.aLongArray9[arg0];
		@Pc(23) int local23 = Static26.aShortArray134[arg0];
		@Pc(27) int local27 = Static102.anIntArray215[arg0];
		if (local23 >= 2000) {
			local23 -= 2000;
		}
		if (local23 == 22 || local23 == 1003) {
			Static211.method3086(local10, local19, local27, Static87.aClass62Array53[arg0]);
		}
		@Pc(68) Class47 local68;
		if (local23 == 58) {
			Static58.aClass2_Sub11_Sub1_2.method1595(226);
			Static58.aClass2_Sub11_Sub1_2.method1544(local27);
			local68 = Static143.method2159(local27);
			if (local68.anIntArrayArray16 != null && local68.anIntArrayArray16[0][0] == 5) {
				@Pc(88) int local88 = local68.anIntArrayArray16[0][1];
				if (local68.anIntArray162[0] != Static71.anIntArray123[local88]) {
					Static71.anIntArray123[local88] = local68.anIntArray162[0];
					Static14.method238(local88);
				}
			}
		}
		@Pc(119) Class7_Sub2_Sub2 local119;
		if (local23 == 12) {
			local119 = Static62.aClass7_Sub2_Sub2Array1[local19];
			if (local119 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local119.anIntArray275[0], 2, local119.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static81.anInt4472 = Static43.anInt985;
				Static113.anInt2471 = Static170.anInt3634;
				Static174.anInt3693 = 0;
				Static134.anInt2872 = 2;
				Static58.aClass2_Sub11_Sub1_2.method1595(229);
				Static58.aClass2_Sub11_Sub1_2.method1559(local19);
			}
		}
		if (local23 == 1005) {
			Static134.anInt2872 = 2;
			Static174.anInt3693 = 0;
			Static113.anInt2471 = Static170.anInt3634;
			Static81.anInt4472 = Static43.anInt985;
			Static58.aClass2_Sub11_Sub1_2.method1595(140);
			Static58.aClass2_Sub11_Sub1_2.method1582(local19);
		}
		if (local23 == 1006) {
			Static134.anInt2872 = 2;
			Static81.anInt4472 = Static43.anInt985;
			Static174.anInt3693 = 0;
			Static113.anInt2471 = Static170.anInt3634;
			Static58.aClass2_Sub11_Sub1_2.method1595(175);
			Static58.aClass2_Sub11_Sub1_2.method1559(local19);
		}
		@Pc(244) boolean local244;
		if (local23 == 51) {
			local244 = Static33.method571(0, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 0, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			if (!local244) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			}
			Static174.anInt3693 = 0;
			Static113.anInt2471 = Static170.anInt3634;
			Static81.anInt4472 = Static43.anInt985;
			Static134.anInt2872 = 2;
			Static58.aClass2_Sub11_Sub1_2.method1595(163);
			Static58.aClass2_Sub11_Sub1_2.method1578(local27 + Static153.anInt3278);
			Static58.aClass2_Sub11_Sub1_2.method1533(local10 + Static116.anInt2535);
			Static58.aClass2_Sub11_Sub1_2.method1582(local19);
		}
		if (local23 == 46) {
			local119 = Static62.aClass7_Sub2_Sub2Array1[local19];
			if (local119 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local119.anIntArray275[0], 2, local119.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static81.anInt4472 = Static43.anInt985;
				Static134.anInt2872 = 2;
				Static113.anInt2471 = Static170.anInt3634;
				Static174.anInt3693 = 0;
				Static58.aClass2_Sub11_Sub1_2.method1595(76);
				Static58.aClass2_Sub11_Sub1_2.method1582(local19);
			}
		}
		if (local23 == 25) {
			Static58.aClass2_Sub11_Sub1_2.method1595(223);
			Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			Static58.aClass2_Sub11_Sub1_2.method1578(local10);
			Static58.aClass2_Sub11_Sub1_2.method1570(local27);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		@Pc(391) Class7_Sub2_Sub1 local391;
		if (local23 == 26) {
			local391 = Static9.aClass7_Sub2_Sub1Array1[local19];
			if (local391 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local391.anIntArray275[0], 2, local391.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static113.anInt2471 = Static170.anInt3634;
				Static174.anInt3693 = 0;
				Static81.anInt4472 = Static43.anInt985;
				Static134.anInt2872 = 2;
				Static58.aClass2_Sub11_Sub1_2.method1595(86);
				Static58.aClass2_Sub11_Sub1_2.method1559(local19);
			}
		}
		if (local23 == 1001) {
			local68 = Static143.method2159(local27);
			if (local68 == null || local68.anIntArray166[local10] < 100000) {
				Static58.aClass2_Sub11_Sub1_2.method1595(140);
				Static58.aClass2_Sub11_Sub1_2.method1582(local19);
			} else {
				Static154.method2292(Static169.method2460(new Class62[] { Static119.method1865(local68.anIntArray166[local10]), Static121.aClass62_945, Static52.method774(local19).aClass62_1540 }), 0, Static69.aClass62_484);
			}
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 40) {
			local391 = Static9.aClass7_Sub2_Sub1Array1[local19];
			if (local391 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local391.anIntArray275[0], 2, local391.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static134.anInt2872 = 2;
				Static113.anInt2471 = Static170.anInt3634;
				Static174.anInt3693 = 0;
				Static81.anInt4472 = Static43.anInt985;
				Static58.aClass2_Sub11_Sub1_2.method1595(174);
				Static58.aClass2_Sub11_Sub1_2.method1559(local19);
			}
		}
		if (local23 == 16) {
			local119 = Static62.aClass7_Sub2_Sub2Array1[local19];
			if (local119 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local119.anIntArray275[0], 2, local119.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static113.anInt2471 = Static170.anInt3634;
				Static174.anInt3693 = 0;
				Static81.anInt4472 = Static43.anInt985;
				Static134.anInt2872 = 2;
				Static58.aClass2_Sub11_Sub1_2.method1595(95);
				Static58.aClass2_Sub11_Sub1_2.method1559(Static63.anInt1336);
				Static58.aClass2_Sub11_Sub1_2.method1533(local19);
				Static58.aClass2_Sub11_Sub1_2.method1559(Static61.anInt1288);
				Static58.aClass2_Sub11_Sub1_2.method1543(Static103.anInt2276);
			}
		}
		if (local23 == 23) {
			Static58.aClass2_Sub11_Sub1_2.method1595(206);
			Static58.aClass2_Sub11_Sub1_2.method1533(local10);
			Static58.aClass2_Sub11_Sub1_2.method1579(Static151.anInt3208);
			Static58.aClass2_Sub11_Sub1_2.method1570(local27);
			Static58.aClass2_Sub11_Sub1_2.method1578(local19);
			Static58.aClass2_Sub11_Sub1_2.method1559(Static204.anInt4234);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 19) {
			Static58.aClass2_Sub11_Sub1_2.method1595(13);
			Static58.aClass2_Sub11_Sub1_2.method1544(local27);
			Static58.aClass2_Sub11_Sub1_2.method1559(local10);
			Static58.aClass2_Sub11_Sub1_2.method1559(local19);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 48) {
			local119 = Static62.aClass7_Sub2_Sub2Array1[local19];
			if (local119 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local119.anIntArray275[0], 2, local119.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static81.anInt4472 = Static43.anInt985;
				Static113.anInt2471 = Static170.anInt3634;
				Static134.anInt2872 = 2;
				Static174.anInt3693 = 0;
				Static58.aClass2_Sub11_Sub1_2.method1595(142);
				Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			}
		}
		if (local23 == 31) {
			local68 = Static93.method1400(local10, local27);
			if (local68 != null) {
				Static117.method1814();
				Static102.method1625(local10, Static6.method132(Static155.method2304(local68)), local27);
				Static97.anInt2284 = 0;
				Static125.aClass62_970 = method394(local68);
				if (Static125.aClass62_970 == null) {
					Static125.aClass62_970 = Static145.aClass62_1075;
				}
				if (!local68.aBoolean95) {
					Static145.aClass62_1077 = Static169.method2460(new Class62[] { Static176.aClass62_1311, local68.aClass62_617, Static112.aClass62_845 });
					return;
				}
				Static145.aClass62_1077 = Static169.method2460(new Class62[] { local68.aClass62_614, Static112.aClass62_845 });
			}
			return;
		}
		if (local23 == 41) {
			local391 = Static9.aClass7_Sub2_Sub1Array1[local19];
			if (local391 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local391.anIntArray275[0], 2, local391.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static174.anInt3693 = 0;
				Static81.anInt4472 = Static43.anInt985;
				Static113.anInt2471 = Static170.anInt3634;
				Static134.anInt2872 = 2;
				Static58.aClass2_Sub11_Sub1_2.method1595(3);
				Static58.aClass2_Sub11_Sub1_2.method1544(Static103.anInt2276);
				Static58.aClass2_Sub11_Sub1_2.method1533(Static63.anInt1336);
				Static58.aClass2_Sub11_Sub1_2.method1582(Static61.anInt1288);
				Static58.aClass2_Sub11_Sub1_2.method1582(local19);
			}
		}
		if (local23 == 3 && Static154.aClass47_14 == null) {
			Static55.method789(local27, local10);
			Static154.aClass47_14 = Static93.method1400(local10, local27);
			Static165.method2410(Static154.aClass47_14);
		}
		if (local23 == 7) {
			local391 = Static9.aClass7_Sub2_Sub1Array1[local19];
			if (local391 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local391.anIntArray275[0], 2, local391.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static113.anInt2471 = Static170.anInt3634;
				Static134.anInt2872 = 2;
				Static174.anInt3693 = 0;
				Static81.anInt4472 = Static43.anInt985;
				Static58.aClass2_Sub11_Sub1_2.method1595(173);
				Static58.aClass2_Sub11_Sub1_2.method1533(local19);
				Static58.aClass2_Sub11_Sub1_2.method1570(Static151.anInt3208);
				Static58.aClass2_Sub11_Sub1_2.method1578(Static204.anInt4234);
			}
		}
		if (local23 == 39) {
			local119 = Static62.aClass7_Sub2_Sub2Array1[local19];
			if (local119 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local119.anIntArray275[0], 2, local119.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static113.anInt2471 = Static170.anInt3634;
				Static134.anInt2872 = 2;
				Static174.anInt3693 = 0;
				Static81.anInt4472 = Static43.anInt985;
				Static58.aClass2_Sub11_Sub1_2.method1595(178);
				Static58.aClass2_Sub11_Sub1_2.method1570(Static151.anInt3208);
				Static58.aClass2_Sub11_Sub1_2.method1578(Static204.anInt4234);
				Static58.aClass2_Sub11_Sub1_2.method1559(local19);
			}
		}
		if (local23 == 8) {
			local244 = Static33.method571(0, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 0, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			if (!local244) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			}
			Static81.anInt4472 = Static43.anInt985;
			Static134.anInt2872 = 2;
			Static113.anInt2471 = Static170.anInt3634;
			Static174.anInt3693 = 0;
			Static58.aClass2_Sub11_Sub1_2.method1595(116);
			Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			Static58.aClass2_Sub11_Sub1_2.method1578(Static116.anInt2535 + local10);
			Static58.aClass2_Sub11_Sub1_2.method1533(Static153.anInt3278 + local27);
		}
		if (local23 == 18) {
			local391 = Static9.aClass7_Sub2_Sub1Array1[local19];
			if (local391 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local391.anIntArray275[0], 2, local391.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static81.anInt4472 = Static43.anInt985;
				Static174.anInt3693 = 0;
				Static134.anInt2872 = 2;
				Static113.anInt2471 = Static170.anInt3634;
				Static58.aClass2_Sub11_Sub1_2.method1595(20);
				Static58.aClass2_Sub11_Sub1_2.method1582(local19);
			}
		}
		if (local23 == 29) {
			local244 = Static33.method571(0, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 0, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			if (!local244) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			}
			Static134.anInt2872 = 2;
			Static174.anInt3693 = 0;
			Static81.anInt4472 = Static43.anInt985;
			Static113.anInt2471 = Static170.anInt3634;
			Static58.aClass2_Sub11_Sub1_2.method1595(45);
			Static58.aClass2_Sub11_Sub1_2.method1578(local10 + Static116.anInt2535);
			Static58.aClass2_Sub11_Sub1_2.method1559(local27 + Static153.anInt3278);
			Static58.aClass2_Sub11_Sub1_2.method1582(local19);
		}
		if (local23 == 10) {
			local119 = Static62.aClass7_Sub2_Sub2Array1[local19];
			if (local119 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local119.anIntArray275[0], 2, local119.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static174.anInt3693 = 0;
				Static134.anInt2872 = 2;
				Static81.anInt4472 = Static43.anInt985;
				Static113.anInt2471 = Static170.anInt3634;
				Static58.aClass2_Sub11_Sub1_2.method1595(131);
				Static58.aClass2_Sub11_Sub1_2.method1582(local19);
			}
		}
		if (local23 == 13) {
			local119 = Static62.aClass7_Sub2_Sub2Array1[local19];
			if (local119 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local119.anIntArray275[0], 2, local119.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static113.anInt2471 = Static170.anInt3634;
				Static81.anInt4472 = Static43.anInt985;
				Static174.anInt3693 = 0;
				Static134.anInt2872 = 2;
				Static58.aClass2_Sub11_Sub1_2.method1595(26);
				Static58.aClass2_Sub11_Sub1_2.method1578(local19);
			}
		}
		if (local23 == 20) {
			local391 = Static9.aClass7_Sub2_Sub1Array1[local19];
			if (local391 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local391.anIntArray275[0], 2, local391.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static134.anInt2872 = 2;
				Static81.anInt4472 = Static43.anInt985;
				Static113.anInt2471 = Static170.anInt3634;
				Static174.anInt3693 = 0;
				Static58.aClass2_Sub11_Sub1_2.method1595(237);
				Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			}
		}
		if (local23 == 35) {
			Static58.aClass2_Sub11_Sub1_2.method1595(170);
			Static58.aClass2_Sub11_Sub1_2.method1543(local27);
			Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			Static58.aClass2_Sub11_Sub1_2.method1559(local10);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 2 && Static109.method1692(local10, local14, local27)) {
			Static58.aClass2_Sub11_Sub1_2.method1595(120);
			Static58.aClass2_Sub11_Sub1_2.method1578(Static63.anInt1336);
			Static58.aClass2_Sub11_Sub1_2.method1570(Static103.anInt2276);
			Static58.aClass2_Sub11_Sub1_2.method1559(local10 + Static116.anInt2535);
			Static58.aClass2_Sub11_Sub1_2.method1533(Static61.anInt1288);
			Static58.aClass2_Sub11_Sub1_2.method1582((int) (local14 >>> 32) & Integer.MAX_VALUE);
			Static58.aClass2_Sub11_Sub1_2.method1533(Static153.anInt3278 + local27);
		}
		if (local23 == 6) {
			Static58.aClass2_Sub11_Sub1_2.method1595(43);
			Static58.aClass2_Sub11_Sub1_2.method1533(local10);
			Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			Static58.aClass2_Sub11_Sub1_2.method1570(local27);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 38) {
			local244 = Static33.method571(0, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 0, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			if (!local244) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			}
			Static81.anInt4472 = Static43.anInt985;
			Static134.anInt2872 = 2;
			Static174.anInt3693 = 0;
			Static113.anInt2471 = Static170.anInt3634;
			Static58.aClass2_Sub11_Sub1_2.method1595(160);
			Static58.aClass2_Sub11_Sub1_2.method1582(local27 + Static153.anInt3278);
			Static58.aClass2_Sub11_Sub1_2.method1578(Static63.anInt1336);
			Static58.aClass2_Sub11_Sub1_2.method1579(Static103.anInt2276);
			Static58.aClass2_Sub11_Sub1_2.method1533(Static61.anInt1288);
			Static58.aClass2_Sub11_Sub1_2.method1559(Static116.anInt2535 + local10);
			Static58.aClass2_Sub11_Sub1_2.method1559(local19);
		}
		if (local23 == 34) {
			Static58.aClass2_Sub11_Sub1_2.method1595(203);
			Static58.aClass2_Sub11_Sub1_2.method1544(local27);
			Static58.aClass2_Sub11_Sub1_2.method1578(local19);
			Static58.aClass2_Sub11_Sub1_2.method1533(local10);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 21) {
			local119 = Static62.aClass7_Sub2_Sub2Array1[local19];
			if (local119 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local119.anIntArray275[0], 2, local119.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static113.anInt2471 = Static170.anInt3634;
				Static134.anInt2872 = 2;
				Static81.anInt4472 = Static43.anInt985;
				Static174.anInt3693 = 0;
				Static58.aClass2_Sub11_Sub1_2.method1595(146);
				Static58.aClass2_Sub11_Sub1_2.method1578(local19);
			}
		}
		if (local23 == 24) {
			local391 = Static9.aClass7_Sub2_Sub1Array1[local19];
			if (local391 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local391.anIntArray275[0], 2, local391.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static81.anInt4472 = Static43.anInt985;
				Static174.anInt3693 = 0;
				Static113.anInt2471 = Static170.anInt3634;
				Static134.anInt2872 = 2;
				Static58.aClass2_Sub11_Sub1_2.method1595(213);
				Static58.aClass2_Sub11_Sub1_2.method1582(local19);
			}
		}
		if (local23 == 28) {
			Static58.aClass2_Sub11_Sub1_2.method1595(242);
			Static58.aClass2_Sub11_Sub1_2.method1582(local10);
			Static58.aClass2_Sub11_Sub1_2.method1533(Static61.anInt1288);
			Static58.aClass2_Sub11_Sub1_2.method1559(Static63.anInt1336);
			Static58.aClass2_Sub11_Sub1_2.method1543(local27);
			Static58.aClass2_Sub11_Sub1_2.method1579(Static103.anInt2276);
			Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 44) {
			Static109.method1692(local10, local14, local27);
			Static58.aClass2_Sub11_Sub1_2.method1595(190);
			Static58.aClass2_Sub11_Sub1_2.method1559(Static153.anInt3278 + local27);
			Static58.aClass2_Sub11_Sub1_2.method1533(Integer.MAX_VALUE & (int) (local14 >>> 32));
			Static58.aClass2_Sub11_Sub1_2.method1559(local10 + Static116.anInt2535);
		}
		if (local23 == 11) {
			Static179.method2592();
		}
		if (local23 == 9) {
			Static58.aClass2_Sub11_Sub1_2.method1595(31);
			Static58.aClass2_Sub11_Sub1_2.method1578(local19);
			Static58.aClass2_Sub11_Sub1_2.method1578(local10);
			Static58.aClass2_Sub11_Sub1_2.method1543(local27);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 4) {
			Static58.aClass2_Sub11_Sub1_2.method1595(24);
			Static58.aClass2_Sub11_Sub1_2.method1543(local27);
			Static58.aClass2_Sub11_Sub1_2.method1582(local19);
			Static58.aClass2_Sub11_Sub1_2.method1559(local10);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 30) {
			local119 = Static62.aClass7_Sub2_Sub2Array1[local19];
			if (local119 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local119.anIntArray275[0], 2, local119.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static113.anInt2471 = Static170.anInt3634;
				Static134.anInt2872 = 2;
				Static81.anInt4472 = Static43.anInt985;
				Static174.anInt3693 = 0;
				Static58.aClass2_Sub11_Sub1_2.method1595(109);
				Static58.aClass2_Sub11_Sub1_2.method1559(local19);
			}
		}
		if (local23 == 42) {
			Static117.method1814();
			local68 = Static143.method2159(local27);
			Static63.anInt1336 = local19;
			Static97.anInt2284 = 1;
			Static103.anInt2276 = local27;
			Static61.anInt1288 = local10;
			Static165.method2410(local68);
			Static155.aClass62_1179 = Static169.method2460(new Class62[] { Static209.aClass62_1504, Static52.method774(local19).aClass62_1540, Static112.aClass62_845 });
			if (Static155.aClass62_1179 == null) {
				Static155.aClass62_1179 = Static91.aClass62_722;
			}
			return;
		}
		if (local23 == 1) {
			Static58.aClass2_Sub11_Sub1_2.method1595(247);
			Static58.aClass2_Sub11_Sub1_2.method1582(local19);
			Static58.aClass2_Sub11_Sub1_2.method1559(local10);
			Static58.aClass2_Sub11_Sub1_2.method1570(local27);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 33 && Static109.method1692(local10, local14, local27)) {
			Static58.aClass2_Sub11_Sub1_2.method1595(153);
			Static58.aClass2_Sub11_Sub1_2.method1578(Static116.anInt2535 + local10);
			Static58.aClass2_Sub11_Sub1_2.method1543(Static151.anInt3208);
			Static58.aClass2_Sub11_Sub1_2.method1582(Integer.MAX_VALUE & (int) (local14 >>> 32));
			Static58.aClass2_Sub11_Sub1_2.method1582(Static204.anInt4234);
			Static58.aClass2_Sub11_Sub1_2.method1582(local27 + Static153.anInt3278);
		}
		if (local23 == 57) {
			Static58.aClass2_Sub11_Sub1_2.method1595(2);
			Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			Static58.aClass2_Sub11_Sub1_2.method1579(local27);
			Static58.aClass2_Sub11_Sub1_2.method1578(local10);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		@Pc(2188) boolean local2188;
		if (local23 == 43) {
			local2188 = Static33.method571(0, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 0, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			if (!local2188) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			}
			Static174.anInt3693 = 0;
			Static81.anInt4472 = Static43.anInt985;
			Static134.anInt2872 = 2;
			Static113.anInt2471 = Static170.anInt3634;
			Static58.aClass2_Sub11_Sub1_2.method1595(57);
			Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			Static58.aClass2_Sub11_Sub1_2.method1533(local10 + Static116.anInt2535);
			Static58.aClass2_Sub11_Sub1_2.method1533(local27 + Static153.anInt3278);
		}
		if (local23 == 1002) {
			Static174.anInt3693 = 0;
			Static81.anInt4472 = Static43.anInt985;
			Static134.anInt2872 = 2;
			Static113.anInt2471 = Static170.anInt3634;
			@Pc(2254) Class7_Sub2_Sub1 local2254 = Static9.aClass7_Sub2_Sub1Array1[local19];
			if (local2254 != null) {
				@Pc(2259) Class2_Sub1_Sub20 local2259 = local2254.aClass2_Sub1_Sub20_1;
				if (local2259.anIntArray304 != null) {
					local2259 = local2259.method2451();
				}
				if (local2259 != null) {
					Static58.aClass2_Sub11_Sub1_2.method1595(191);
					Static58.aClass2_Sub11_Sub1_2.method1559(local2259.anInt3565);
				}
			}
		}
		if (local23 == 32) {
			Static109.method1692(local10, local14, local27);
			Static58.aClass2_Sub11_Sub1_2.method1595(121);
			Static58.aClass2_Sub11_Sub1_2.method1533(Static116.anInt2535 + local10);
			Static58.aClass2_Sub11_Sub1_2.method1578(local27 + Static153.anInt3278);
			Static58.aClass2_Sub11_Sub1_2.method1533((int) (local14 >>> 32) & Integer.MAX_VALUE);
		}
		if (local23 == 17) {
			Static58.aClass2_Sub11_Sub1_2.method1595(99);
			Static58.aClass2_Sub11_Sub1_2.method1559(Static204.anInt4234);
			Static58.aClass2_Sub11_Sub1_2.method1578(local10);
			Static58.aClass2_Sub11_Sub1_2.method1543(local27);
			Static58.aClass2_Sub11_Sub1_2.method1579(Static151.anInt3208);
		}
		if (local23 == 1004) {
			Static109.method1692(local10, local14, local27);
			Static58.aClass2_Sub11_Sub1_2.method1595(110);
			Static58.aClass2_Sub11_Sub1_2.method1578(local27 + Static153.anInt3278);
			Static58.aClass2_Sub11_Sub1_2.method1533(local10 + Static116.anInt2535);
			Static58.aClass2_Sub11_Sub1_2.method1578((int) (local14 >>> 32) & Integer.MAX_VALUE);
		}
		if (local23 == 15) {
			Static109.method1692(local10, local14, local27);
			Static58.aClass2_Sub11_Sub1_2.method1595(38);
			Static58.aClass2_Sub11_Sub1_2.method1578(Static153.anInt3278 + local27);
			Static58.aClass2_Sub11_Sub1_2.method1559(Integer.MAX_VALUE & (int) (local14 >>> 32));
			Static58.aClass2_Sub11_Sub1_2.method1559(local10 + Static116.anInt2535);
		}
		if (local23 == 47) {
			Static109.method1692(local10, local14, local27);
			Static58.aClass2_Sub11_Sub1_2.method1595(230);
			Static58.aClass2_Sub11_Sub1_2.method1578(Static153.anInt3278 + local27);
			Static58.aClass2_Sub11_Sub1_2.method1533((int) (local14 >>> 32) & Integer.MAX_VALUE);
			Static58.aClass2_Sub11_Sub1_2.method1578(local10 + Static116.anInt2535);
		}
		if (local23 == 49) {
			Static16.method311(Static126.anInt2806, local10, local27);
		}
		if (local23 == 5) {
			Static58.aClass2_Sub11_Sub1_2.method1595(28);
			Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			Static58.aClass2_Sub11_Sub1_2.method1578(local10);
			Static58.aClass2_Sub11_Sub1_2.method1579(local27);
			Static197.anInt4088 = 0;
			Static83.aClass47_7 = Static143.method2159(local27);
			Static14.anInt339 = local10;
		}
		if (local23 == 50) {
			local2188 = Static33.method571(0, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 0, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			if (!local2188) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			}
			Static113.anInt2471 = Static170.anInt3634;
			Static174.anInt3693 = 0;
			Static134.anInt2872 = 2;
			Static81.anInt4472 = Static43.anInt985;
			Static58.aClass2_Sub11_Sub1_2.method1595(204);
			Static58.aClass2_Sub11_Sub1_2.method1559(Static116.anInt2535 + local10);
			Static58.aClass2_Sub11_Sub1_2.method1559(local19);
			Static58.aClass2_Sub11_Sub1_2.method1582(local27 + Static153.anInt3278);
		}
		if (local23 == 37) {
			local2188 = Static33.method571(0, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 0, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			if (!local2188) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local10, 2, local27, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
			}
			Static81.anInt4472 = Static43.anInt985;
			Static113.anInt2471 = Static170.anInt3634;
			Static174.anInt3693 = 0;
			Static134.anInt2872 = 2;
			Static58.aClass2_Sub11_Sub1_2.method1595(49);
			Static58.aClass2_Sub11_Sub1_2.method1533(Static204.anInt4234);
			Static58.aClass2_Sub11_Sub1_2.method1543(Static151.anInt3208);
			Static58.aClass2_Sub11_Sub1_2.method1582(local10 + Static116.anInt2535);
			Static58.aClass2_Sub11_Sub1_2.method1533(local19);
			Static58.aClass2_Sub11_Sub1_2.method1578(Static153.anInt3278 + local27);
		}
		@Pc(2692) Class47 local2692;
		if (local23 == 36) {
			Static58.aClass2_Sub11_Sub1_2.method1595(226);
			Static58.aClass2_Sub11_Sub1_2.method1544(local27);
			local2692 = Static143.method2159(local27);
			if (local2692.anIntArrayArray16 != null && local2692.anIntArrayArray16[0][0] == 5) {
				@Pc(2710) int local2710 = local2692.anIntArrayArray16[0][1];
				Static71.anIntArray123[local2710] = 1 - Static71.anIntArray123[local2710];
				Static14.method238(local2710);
			}
		}
		if (local23 == 45) {
			@Pc(2730) Class7_Sub2_Sub2 local2730 = Static62.aClass7_Sub2_Sub2Array1[local19];
			if (local2730 != null) {
				Static33.method571(1, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], false, 0, 1, local2730.anIntArray275[0], 2, local2730.anIntArray274[0], 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
				Static81.anInt4472 = Static43.anInt985;
				Static113.anInt2471 = Static170.anInt3634;
				Static174.anInt3693 = 0;
				Static134.anInt2872 = 2;
				Static58.aClass2_Sub11_Sub1_2.method1595(103);
				Static58.aClass2_Sub11_Sub1_2.method1559(local19);
			}
		}
		if (local23 == 14) {
			@Pc(2785) boolean local2785 = true;
			local2692 = Static143.method2159(local27);
			if (local2692.anInt1893 > 0) {
				local2785 = Static99.method1600(local2692);
			}
			if (local2785) {
				Static58.aClass2_Sub11_Sub1_2.method1595(226);
				Static58.aClass2_Sub11_Sub1_2.method1544(local27);
			}
		}
		if (Static97.anInt2284 != 0) {
			Static97.anInt2284 = 0;
			Static165.method2410(Static143.method2159(Static103.anInt2276));
		}
		if (Static8.aBoolean12) {
			Static117.method1814();
		}
		if (Static83.aClass47_7 != null && Static197.anInt4088 == 0) {
			Static165.method2410(Static83.aClass47_7);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method399() {
		Static143.aClass53_17.method1649();
	}
}
