import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!pk;")
	public static Class132 aClass132_82;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "Lclient!gd;")
	public static Class61 aClass61_46 = new Class61(20);

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	public static int anInt4799 = 0;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "I")
	public static volatile int anInt4800 = -1;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	public static void method3613() {
		@Pc(7) int local7 = Static111.anInt2293;
		@Pc(9) int local9 = Static215.anInt4426;
		@Pc(11) int local11 = Static17.anInt485;
		@Pc(13) int local13 = Static202.anInt4178;
		if (Static116.aBoolean188) {
			Static126.method1994(local7, local9, local11, local13, 6116423);
			Static126.method1994(local7 + 1, local9 - -1, local11 - 2, 16, 0);
			Static126.method2004(local7 + 1, local9 + 18, local11 - 2, local13 + -19, 0);
		} else {
			Static103.method1664(local7, local9, local11, local13, 6116423);
			Static103.method1664(local7 + 1, local9 + 1, local11 - 2, 16, 0);
			Static103.method1669(local7 + 1, local9 + 18, local11 - 2, local13 - 19, 0);
		}
		Static229.aClass8_Sub1_Sub5_3.method2027(Static183.aString127, local7 + 3, local9 + 14, 6116423, -1);
		@Pc(96) int local96 = Static182.anInt3572;
		@Pc(98) int local98 = Static106.anInt2198;
		for (@Pc(100) int local100 = 0; local100 < Static185.anInt3679; local100++) {
			@Pc(109) int local109 = 16777215;
			@Pc(122) int local122 = local9 + (Static185.anInt3679 - (local100 + 1)) * 15 + 31;
			if (local7 < local96 && local7 + local11 > local96 && local98 > local122 - 13 && local122 + 3 > local98) {
				local109 = 16776960;
			}
			Static229.aClass8_Sub1_Sub5_3.method2027(Static105.method1704(local100), local7 + 3, local122, local109, 0);
		}
		Static128.method2076(Static111.anInt2293, Static215.anInt4426, Static202.anInt4178, Static17.anInt485);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZII)V")
	public static void method3615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= Static253.anInt4996 && Static52.anInt1146 >= arg3) {
			@Pc(19) int local19 = Static2.method4(Static244.anInt4872, arg0, Static228.anInt4643);
			@Pc(25) int local25 = Static2.method4(Static244.anInt4872, arg1, Static228.anInt4643);
			Static141.method2238(local25, arg2, local19, arg3);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Lclient!nj;")
	public static Class120 method3616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class8_Sub27 local7 = Static178.aClass8_Sub27ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class120 local14 = local7.aClass120_1;
			local7.aClass120_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public static void method3618() {
		@Pc(3) boolean local3 = true;
		Static49.method773(false);
		Static50.anInt1115 = 0;
		@Pc(14) int local14;
		for (local14 = 0; local14 < Static177.aByteArrayArray7.length; local14++) {
			if (Static294.anIntArray496[local14] != -1 && Static177.aByteArrayArray7[local14] == null) {
				Static177.aByteArrayArray7[local14] = Static157.aClass132_92.method3194(Static294.anIntArray496[local14], 0);
				if (Static177.aByteArrayArray7[local14] == null) {
					Static50.anInt1115++;
					local3 = false;
				}
			}
			if (Static114.anIntArray190[local14] != -1 && Static282.aByteArrayArray5[local14] == null) {
				Static282.aByteArrayArray5[local14] = Static157.aClass132_92.method3163(Static162.anIntArrayArray16[local14], Static114.anIntArray190[local14], 0);
				if (Static282.aByteArrayArray5[local14] == null) {
					local3 = false;
					Static50.anInt1115++;
				}
			}
			if (Static116.aBoolean188) {
				if (Static173.anIntArray262[local14] != -1 && Static109.aByteArrayArray8[local14] == null) {
					Static109.aByteArrayArray8[local14] = Static157.aClass132_92.method3194(Static173.anIntArray262[local14], 0);
					if (Static109.aByteArrayArray8[local14] == null) {
						Static50.anInt1115++;
						local3 = false;
					}
				}
				if (Static52.anIntArray80[local14] != -1 && Static13.aByteArrayArray1[local14] == null) {
					Static13.aByteArrayArray1[local14] = Static157.aClass132_92.method3194(Static52.anIntArray80[local14], 0);
					if (Static13.aByteArrayArray1[local14] == null) {
						local3 = false;
						Static50.anInt1115++;
					}
				}
			}
			if (Static218.anIntArray335 != null && Static274.aByteArrayArray17[local14] == null && Static218.anIntArray335[local14] != -1) {
				Static274.aByteArrayArray17[local14] = Static157.aClass132_92.method3163(Static162.anIntArrayArray16[local14], Static218.anIntArray335[local14], 0);
				if (Static274.aByteArrayArray17[local14] == null) {
					Static50.anInt1115++;
					local3 = false;
				}
			}
		}
		if (Static104.aClass130_1 == null) {
			if (Static111.aClass8_Sub1_Sub2_1 == null || !Static172.aClass132_61.method3170(Static111.aClass8_Sub1_Sub2_1.aString20 + "_labels")) {
				Static104.aClass130_1 = new Class130(0);
			} else if (Static172.aClass132_61.method3178(Static111.aClass8_Sub1_Sub2_1.aString20 + "_labels")) {
				Static104.aClass130_1 = Static27.method461(Static172.aClass132_61, Static111.aClass8_Sub1_Sub2_1.aString20 + "_labels");
			} else {
				Static50.anInt1115++;
				local3 = false;
			}
		}
		if (!local3) {
			Static14.anInt370 = 1;
			return;
		}
		local3 = true;
		Static4.anInt46 = 0;
		@Pc(301) int local301;
		@Pc(311) int local311;
		for (local14 = 0; local14 < Static177.aByteArrayArray7.length; local14++) {
			@Pc(288) byte[] local288 = Static282.aByteArrayArray5[local14];
			if (local288 != null) {
				local301 = (Static13.anIntArray15[local14] >> 8) * 64 - Static49.anInt1089;
				local311 = (Static13.anIntArray15[local14] & 0xFF) * 64 - Static130.anInt2601;
				if (Static207.aBoolean349) {
					local301 = 10;
					local311 = 10;
				}
				local3 &= Static168.method4157(local311, local288, local301);
			}
			if (Static116.aBoolean188) {
				local288 = Static13.aByteArrayArray1[local14];
				if (local288 != null) {
					local301 = (Static13.anIntArray15[local14] >> 8) * 64 - Static49.anInt1089;
					local311 = (Static13.anIntArray15[local14] & 0xFF) * 64 - Static130.anInt2601;
					if (Static207.aBoolean349) {
						local311 = 10;
						local301 = 10;
					}
					local3 &= Static168.method4157(local311, local288, local301);
				}
			}
		}
		if (!local3) {
			Static14.anInt370 = 2;
			return;
		}
		@Pc(381) boolean local381 = false;
		if (Static14.anInt370 != 0) {
			Static261.method3923(Static58.aString83 + "<br>(100%)", true);
		}
		Static16.method2745();
		Static123.method1978();
		@Pc(405) int local405;
		if (Static116.aBoolean188 && Static273.aBoolean455) {
			for (local405 = 0; local405 < Static177.aByteArrayArray7.length; local405++) {
				if (Static13.aByteArrayArray1[local405] != null || Static109.aByteArrayArray8[local405] != null) {
					local381 = true;
					break;
				}
			}
		}
		Static20.method364(Static116.aBoolean188 ? 28 : 25, local381);
		for (local405 = 0; local405 < 4; local405++) {
			Static159.aClass112Array1[local405].method2540();
		}
		for (local405 = 0; local405 < 4; local405++) {
			for (local301 = 0; local301 < 104; local301++) {
				for (local311 = 0; local311 < 104; local311++) {
					Static170.aByteArrayArrayArray9[local405][local301][local311] = 0;
				}
			}
		}
		Static132.method2137(false);
		if (Static116.aBoolean188) {
			Static6.aClass43_Sub2_1.method4309();
			for (local405 = 0; local405 < 13; local405++) {
				for (local301 = 0; local301 < 13; local301++) {
					Static6.aClass71ArrayArray1[local405][local301].aBoolean164 = true;
				}
			}
		}
		if (Static116.aBoolean188) {
			Static186.method2917();
		}
		if (Static116.aBoolean188) {
			Static218.method3412();
		}
		Static16.method2745();
		System.gc();
		Static49.method773(true);
		Static37.method3009(false);
		if (!Static207.aBoolean349) {
			Static113.method1843(false);
			Static49.method773(true);
			if (Static116.aBoolean188) {
				local405 = Static21.aClass36_Sub3_Sub1_1.anIntArray310[0] >> 3;
				local301 = Static21.aClass36_Sub3_Sub1_1.anIntArray308[0] >> 3;
				Static70.method1141(local301, local405);
			}
			Static141.method2241(false);
			if (Static274.aByteArrayArray17 != null) {
				Static158.method2544();
			}
		}
		if (Static207.aBoolean349) {
			Static47.method745(false);
			Static49.method773(true);
			if (Static116.aBoolean188) {
				local405 = Static21.aClass36_Sub3_Sub1_1.anIntArray310[0] >> 3;
				local301 = Static21.aClass36_Sub3_Sub1_1.anIntArray308[0] >> 3;
				Static70.method1141(local301, local405);
			}
			Static254.method3804(false);
		}
		Static123.method1978();
		Static49.method773(true);
		Static57.method904(Static159.aClass112Array1, false, Static207.aBoolean349 ? Static4.anIntArrayArrayArray1 : (int[][][]) null);
		if (Static116.aBoolean188) {
			Static186.method2928();
		}
		Static49.method773(true);
		local405 = Static241.anInt4830;
		if (local405 > Static34.anInt770) {
			local405 = Static34.anInt770;
		}
		if (Static34.anInt770 - 1 > local405) {
		}
		if (Static158.method2553()) {
			Static258.method3877(0);
		} else {
			Static258.method3877(Static241.anInt4830);
		}
		Static45.method4132();
		if (Static116.aBoolean188 && local381) {
			Static174.method2689(true);
			Static37.method3009(true);
			if (!Static207.aBoolean349) {
				Static113.method1843(true);
				Static49.method773(true);
				Static141.method2241(true);
			}
			if (Static207.aBoolean349) {
				Static47.method745(true);
				Static49.method773(true);
				Static254.method3804(true);
			}
			Static123.method1978();
			Static49.method773(true);
			Static57.method904(Static159.aClass112Array1, true, Static207.aBoolean349 ? Static4.anIntArrayArrayArray1 : (int[][][]) null);
			Static49.method773(true);
			Static45.method4132();
			Static174.method2689(false);
		}
		if (Static116.aBoolean188) {
			for (local301 = 0; local301 < 13; local301++) {
				for (local311 = 0; local311 < 13; local311++) {
					Static6.aClass71ArrayArray1[local301][local311].method1592(Static195.anIntArrayArrayArray7[0], local301 * 8, local311 * 8);
				}
			}
		}
		for (local301 = 0; local301 < 104; local301++) {
			for (local311 = 0; local311 < 104; local311++) {
				Static115.method1856(local311, local301);
			}
		}
		Static17.method316();
		Static16.method2745();
		Static113.method1842();
		Static123.method1978();
		Static176.aBoolean290 = false;
		if (Static116.aBoolean188) {
			Static245.method3662(true);
		}
		if (Static209.aFrame3 != null && Static95.aClass92_4 != null && Static23.anInt618 == 25) {
			Static66.aClass8_Sub2_Sub1_4.method2398(247);
			Static66.aClass8_Sub2_Sub1_4.method2330(1057001181);
		}
		if (!Static207.aBoolean349) {
			local301 = (Static250.anInt4960 - 6) / 8;
			local311 = (Static250.anInt4960 + 6) / 8;
			@Pc(841) int local841 = (Static42.anInt957 - 6) / 8;
			@Pc(847) int local847 = (Static42.anInt957 + 6) / 8;
			for (@Pc(851) int local851 = local301 - 1; local851 <= local311 + 1; local851++) {
				for (@Pc(860) int local860 = local841 - 1; local860 <= local847 + 1; local860++) {
					if (local301 > local851 || local851 > local311 || local841 > local860 || local860 > local847) {
						Static157.aClass132_92.method3165("m" + local851 + "_" + local860);
						Static157.aClass132_92.method3165("l" + local851 + "_" + local860);
					}
				}
			}
		}
		if (Static23.anInt618 == 28) {
			Static49.method774(10);
		} else {
			Static49.method774(30);
			if (Static95.aClass92_4 != null) {
				Static66.aClass8_Sub2_Sub1_4.method2398(211);
			}
		}
		Static70.method1139();
		Static16.method2745();
		Static159.method2557();
	}
}
