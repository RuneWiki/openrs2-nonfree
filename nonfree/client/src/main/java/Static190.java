import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!oh", name = "J", descriptor = "Lclient!mf;")
	public static Class100 aClass100_4;

	@OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
	public static int anInt4240;

	@OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
	public static int anInt4241;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString124 = " is already on your ignore list.";

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "[I")
	public static int[] anIntArray381 = new int[1000];

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString125 = "red:";

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIIZ)V")
	public static void method3393(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static122.method2097(arg2, Static160.aClass140_Sub1Array2.length - 1, arg0, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
	public static void method3394() {
		Static32.method671(false);
		Static25.anInt502 = 0;
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static231.aByteArrayArray125.length; local14++) {
			if (Static99.anIntArray223[local14] != -1 && Static231.aByteArrayArray125[local14] == null) {
				Static231.aByteArrayArray125[local14] = Static78.aClass83_47.method2306(Static99.anIntArray223[local14], 0);
				if (Static231.aByteArrayArray125[local14] == null) {
					local12 = false;
					Static25.anInt502++;
				}
			}
			if (Static160.anIntArray336[local14] != -1 && Static138.aByteArrayArray71[local14] == null) {
				Static138.aByteArrayArray71[local14] = Static78.aClass83_47.method2323(0, Static133.anIntArrayArray18[local14], Static160.anIntArray336[local14]);
				if (Static138.aByteArrayArray71[local14] == null) {
					local12 = false;
					Static25.anInt502++;
				}
			}
			if (Static296.aBoolean335) {
				if (Static230.anIntArray528[local14] != -1 && Static209.aByteArrayArray104[local14] == null) {
					Static209.aByteArrayArray104[local14] = Static78.aClass83_47.method2306(Static230.anIntArray528[local14], 0);
					if (Static209.aByteArrayArray104[local14] == null) {
						local12 = false;
						Static25.anInt502++;
					}
				}
				if (Static287.anIntArray603[local14] != -1 && Static105.aByteArrayArray138[local14] == null) {
					Static105.aByteArrayArray138[local14] = Static78.aClass83_47.method2306(Static287.anIntArray603[local14], 0);
					if (Static105.aByteArrayArray138[local14] == null) {
						Static25.anInt502++;
						local12 = false;
					}
				}
			}
			if (Static210.anIntArray473 != null && Static126.aByteArrayArray64[local14] == null && Static210.anIntArray473[local14] != -1) {
				Static126.aByteArrayArray64[local14] = Static78.aClass83_47.method2323(0, Static133.anIntArrayArray18[local14], Static210.anIntArray473[local14]);
				if (Static126.aByteArrayArray64[local14] == null) {
					local12 = false;
					Static25.anInt502++;
				}
			}
		}
		if (Static25.aClass78_1 == null) {
			if (Static45.aClass1_Sub2_Sub9_1 == null || !Static241.aClass83_162.method2325(Static45.aClass1_Sub2_Sub9_1.aString69 + "_labels")) {
				Static25.aClass78_1 = new Class78(0);
			} else if (Static241.aClass83_162.method2316(Static45.aClass1_Sub2_Sub9_1.aString69 + "_labels")) {
				Static25.aClass78_1 = Static126.method2147(Static241.aClass83_162, Static45.aClass1_Sub2_Sub9_1.aString69 + "_labels");
			} else {
				local12 = false;
				Static25.anInt502++;
			}
		}
		if (!local12) {
			Static280.anInt5995 = 1;
			return;
		}
		local12 = true;
		Static58.anInt1513 = 0;
		@Pc(288) int local288;
		@Pc(299) int local299;
		for (local14 = 0; local14 < Static231.aByteArrayArray125.length; local14++) {
			@Pc(273) byte[] local273 = Static138.aByteArrayArray71[local14];
			if (local273 != null) {
				local288 = (Static8.anIntArray449[local14] >> 8) * 64 - Static82.anInt1972;
				local299 = (Static8.anIntArray449[local14] & 0xFF) * 64 - Static266.anInt5790;
				if (Static219.aBoolean268) {
					local299 = 10;
					local288 = 10;
				}
				local12 &= Static177.method3222(local299, local273, local288);
			}
			if (Static296.aBoolean335) {
				local273 = Static105.aByteArrayArray138[local14];
				if (local273 != null) {
					local299 = (Static8.anIntArray449[local14] & 0xFF) * 64 - Static266.anInt5790;
					local288 = (Static8.anIntArray449[local14] >> 8) * 64 - Static82.anInt1972;
					if (Static219.aBoolean268) {
						local288 = 10;
						local299 = 10;
					}
					local12 &= Static177.method3222(local299, local273, local288);
				}
			}
		}
		if (!local12) {
			Static280.anInt5995 = 2;
			return;
		}
		if (Static280.anInt5995 != 0) {
			Static242.method4171(true, Static19.aString12 + "<br>(100%)");
		}
		Static96.method1648();
		Static91.method1596();
		@Pc(392) boolean local392 = false;
		@Pc(399) int local399;
		if (Static296.aBoolean335 && Static119.aBoolean141) {
			for (local399 = 0; local399 < Static231.aByteArrayArray125.length; local399++) {
				if (Static105.aByteArrayArray138[local399] != null || Static209.aByteArrayArray104[local399] != null) {
					local392 = true;
					break;
				}
			}
		}
		Static83.method1479(Static296.aBoolean335 ? 28 : 25, local392);
		for (local399 = 0; local399 < 4; local399++) {
			Static213.aClass36Array1[local399].method949();
		}
		for (local399 = 0; local399 < 4; local399++) {
			for (local288 = 0; local288 < 104; local288++) {
				for (local299 = 0; local299 < 104; local299++) {
					Static126.aByteArrayArrayArray24[local399][local288][local299] = 0;
				}
			}
		}
		Static12.method240(false);
		if (Static296.aBoolean335) {
			Static124.aClass7_Sub1_2.method123();
			for (local399 = 0; local399 < 13; local399++) {
				for (local288 = 0; local288 < 13; local288++) {
					Static124.aClass112ArrayArray1[local399][local288].aBoolean209 = true;
				}
			}
		}
		if (Static296.aBoolean335) {
			Static67.method1289();
		}
		if (Static296.aBoolean335) {
			Static147.method2780();
		}
		Static96.method1648();
		System.gc();
		Static32.method671(true);
		Static267.method2728(false);
		if (!Static219.aBoolean268) {
			Static141.method2523(false);
			Static32.method671(true);
			if (Static296.aBoolean335) {
				local399 = Static239.aClass25_Sub1_Sub1_2.anIntArray172[0] >> 3;
				local288 = Static239.aClass25_Sub1_Sub1_2.anIntArray173[0] >> 3;
				Static259.method4403(local288, local399);
			}
			Static291.method4764(false);
			if (Static126.aByteArrayArray64 != null) {
				Static230.method4027();
			}
		}
		if (Static219.aBoolean268) {
			Static96.method1644(false);
			Static32.method671(true);
			if (Static296.aBoolean335) {
				local399 = Static239.aClass25_Sub1_Sub1_2.anIntArray172[0] >> 3;
				local288 = Static239.aClass25_Sub1_Sub1_2.anIntArray173[0] >> 3;
				Static259.method4403(local288, local399);
			}
			Static37.method855(false);
		}
		Static91.method1596();
		Static32.method671(true);
		Static132.method2274(false, Static219.aBoolean268 ? Static130.anIntArrayArrayArray13 : (int[][][]) null, Static213.aClass36Array1);
		if (Static296.aBoolean335) {
			Static67.method1293();
		}
		Static32.method671(true);
		local399 = Static90.anInt2102;
		if (local399 > Static145.anInt3477) {
			local399 = Static145.anInt3477;
		}
		if (local399 < Static145.anInt3477 - 1) {
		}
		if (Static40.method1450()) {
			Static139.method4754(0);
		} else {
			Static139.method4754(Static90.anInt2102);
		}
		Static143.method2591();
		if (Static296.aBoolean335 && local392) {
			Static146.method2773(true);
			Static267.method2728(true);
			if (!Static219.aBoolean268) {
				Static141.method2523(true);
				Static32.method671(true);
				Static291.method4764(true);
			}
			if (Static219.aBoolean268) {
				Static96.method1644(true);
				Static32.method671(true);
				Static37.method855(true);
			}
			Static91.method1596();
			Static32.method671(true);
			Static132.method2274(true, Static219.aBoolean268 ? Static130.anIntArrayArrayArray13 : (int[][][]) null, Static213.aClass36Array1);
			Static32.method671(true);
			Static143.method2591();
			Static146.method2773(false);
		}
		if (Static296.aBoolean335) {
			for (local288 = 0; local288 < 13; local288++) {
				for (local299 = 0; local299 < 13; local299++) {
					Static124.aClass112ArrayArray1[local288][local299].method3325(Static287.anIntArrayArrayArray18[0], local288 * 8, local299 * 8);
				}
			}
		}
		for (local288 = 0; local288 < 104; local288++) {
			for (local299 = 0; local299 < 104; local299++) {
				Static117.method1923(local299, local288);
			}
		}
		Static86.method1510();
		Static96.method1648();
		Static182.method3509();
		Static91.method1596();
		Static90.aBoolean113 = false;
		if (Static296.aBoolean335) {
			Static228.method3997(true);
		}
		if (Static48.aFrame1 != null && Static22.aClass41_1 != null && Static279.anInt5968 == 25) {
			Static81.aClass1_Sub16_Sub1_1.method2676(30);
			Static81.aClass1_Sub16_Sub1_1.method2606(1057001181);
		}
		if (!Static219.aBoolean268) {
			local288 = (Static238.anInt5219 - 6) / 8;
			local299 = (Static238.anInt5219 + 6) / 8;
			@Pc(829) int local829 = (Static222.anInt4928 + 6) / 8;
			@Pc(835) int local835 = (Static222.anInt4928 - 6) / 8;
			for (@Pc(839) int local839 = local288 - 1; local839 <= local299 + 1; local839++) {
				for (@Pc(848) int local848 = local835 - 1; local848 <= local829 + 1; local848++) {
					if (local288 > local839 || local839 > local299 || local835 > local848 || local829 < local848) {
						Static78.aClass83_47.method2310("m" + local839 + "_" + local848);
						Static78.aClass83_47.method2310("l" + local839 + "_" + local848);
					}
				}
			}
		}
		if (Static279.anInt5968 == 28) {
			Static140.method2511(10);
		} else {
			Static140.method2511(30);
			if (Static22.aClass41_1 != null) {
				Static81.aClass1_Sub16_Sub1_1.method2676(213);
			}
		}
		Static119.method1957();
		Static96.method1648();
		Static54.method1101();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	public static void method3395() {
		for (@Pc(13) Class1_Sub9 local13 = (Class1_Sub9) Static236.aClass131_17.method3791(); local13 != null; local13 = (Class1_Sub9) Static236.aClass131_17.method3792()) {
			if (local13.anInt1485 > 0) {
				local13.anInt1485--;
			}
			if (local13.anInt1485 != 0) {
				if (local13.anInt1473 > 0) {
					local13.anInt1473--;
				}
				if (local13.anInt1473 == 0 && local13.anInt1476 >= 1 && local13.anInt1483 >= 1 && local13.anInt1476 <= 102 && local13.anInt1483 <= 102 && (local13.anInt1471 < 0 || Static110.method1787(local13.anInt1471, local13.anInt1477))) {
					Static26.method499(local13.anInt1486, local13.anInt1477, local13.anInt1471, local13.anInt1470, local13.anInt1476, local13.anInt1481, local13.anInt1483);
					local13.anInt1473 = -1;
					if (local13.anInt1475 == local13.anInt1471 && local13.anInt1475 == -1) {
						local13.method4742();
					} else if (local13.anInt1475 == local13.anInt1471 && local13.anInt1481 == local13.anInt1480 && local13.anInt1484 == local13.anInt1477) {
						local13.method4742();
					}
				}
			} else if (local13.anInt1475 < 0 || Static110.method1787(local13.anInt1475, local13.anInt1484)) {
				Static26.method499(local13.anInt1486, local13.anInt1484, local13.anInt1475, local13.anInt1470, local13.anInt1476, local13.anInt1480, local13.anInt1483);
				local13.method4742();
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)I")
	public static int method3396(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static73.method1360(arg0);
	}
}
