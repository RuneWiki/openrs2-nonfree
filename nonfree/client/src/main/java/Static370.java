import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_131 = new Class306("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!pk", name = "t", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_132 = new Class306("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIILclient!qo;)V")
	public static void method7390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub38 arg3) {
		@Pc(16) long local16 = (long) (arg1 << 14 | arg2 << 28 | arg0);
		@Pc(22) Class1_Sub26 local22 = (Class1_Sub26) Static255.aClass17_20.method738(local16);
		if (local22 == null) {
			local22 = new Class1_Sub26();
			Static255.aClass17_20.method737(local22, local16);
			local22.aClass37_48.method970(arg3);
			return;
		}
		@Pc(45) Class133 local45 = Static342.aClass250_2.method5980(arg3.anInt7117);
		@Pc(48) int local48 = local45.anInt3931;
		if (local45.anInt3914 == 1) {
			local48 *= arg3.anInt7119 + 1;
		}
		for (@Pc(65) Class1_Sub38 local65 = (Class1_Sub38) local22.aClass37_48.method977(); local65 != null; local65 = (Class1_Sub38) local22.aClass37_48.method971()) {
			local45 = Static342.aClass250_2.method5980(local65.anInt7117);
			@Pc(76) int local76 = local45.anInt3931;
			if (local45.anInt3914 == 1) {
				local76 *= local65.anInt7119 + 1;
			}
			if (local76 < local48) {
				Static83.method1449(local65, arg3);
				return;
			}
		}
		local22.aClass37_48.method970(arg3);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLclient!jj;)V")
	public static void method7392(@OriginalArg(1) Class1_Sub6_Sub2 arg0) {
		arg0.method3972();
		@Pc(10) int local10 = Static198.anInt3873;
		@Pc(20) Class49_Sub2_Sub2_Sub1 local20 = Static63.aClass49_Sub2_Sub2_Sub1_1 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local10] = new Class49_Sub2_Sub2_Sub1();
		local20.anInt4295 = local10;
		@Pc(28) int local28 = arg0.method3976(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		local20.anIntArray428[0] = local39 - Static470.anInt7897;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anInt7137 = (local20.anIntArray428[0] << 9) + (local20.method3788() << 8);
		local20.anIntArray427[0] = local51 - Static534.anInt9007;
		local20.anInt7141 = (local20.anIntArray427[0] << 9) + (local20.method3788() << 8);
		Static501.anInt8491 = local20.aByte98 = local33;
		if (Static243.aClass1_Sub6Array1[local10] != null) {
			local20.method1533(Static243.aClass1_Sub6Array1[local10]);
		}
		Static190.anInt3385 = 0;
		Static502.anIntArray771[Static190.anInt3385++] = local10;
		Static228.aByteArray67[local10] = 0;
		Static415.anInt7309 = 0;
		for (@Pc(129) int local129 = 1; local129 < 2048; local129++) {
			if (local129 != local10) {
				@Pc(139) int local139 = arg0.method3976(18);
				@Pc(143) int local143 = local139 >> 16;
				@Pc(149) int local149 = local139 >> 8 & 0xFF;
				@Pc(153) int local153 = local139 & 0xFF;
				@Pc(161) Class210 local161 = Static534.aClass210Array1[local129] = new Class210();
				local161.anInt6012 = -1;
				local161.anInt6009 = local153 + (local143 << 28) + (local149 << 14);
				local161.aBoolean433 = false;
				local161.anInt6010 = 0;
				Static362.anIntArray649[Static415.anInt7309++] = local129;
				Static228.aByteArray67[local129] = 0;
			}
		}
		arg0.method3977();
	}

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)V")
	public static void method7393() {
		Static462.method6525(false);
		Static41.anInt864 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static449.aByteArrayArray27.length; local14++) {
			if (Static433.anIntArray716[local14] != -1 && Static449.aByteArrayArray27[local14] == null) {
				Static449.aByteArrayArray27[local14] = Static223.aClass171_77.method4339(Static433.anIntArray716[local14], 0);
				if (Static449.aByteArrayArray27[local14] == null) {
					local12 = false;
					Static41.anInt864++;
				}
			}
			if (Static388.anIntArray681[local14] != -1 && Static529.aByteArrayArray32[local14] == null) {
				Static529.aByteArrayArray32[local14] = Static223.aClass171_77.method4356(0, Static388.anIntArray681[local14], Static13.anIntArrayArray4[local14]);
				if (Static529.aByteArrayArray32[local14] == null) {
					Static41.anInt864++;
					local12 = false;
				}
			}
			if (Static453.anIntArray725[local14] != -1 && Static324.aByteArrayArray16[local14] == null) {
				Static324.aByteArrayArray16[local14] = Static223.aClass171_77.method4339(Static453.anIntArray725[local14], 0);
				if (Static324.aByteArrayArray16[local14] == null) {
					Static41.anInt864++;
					local12 = false;
				}
			}
			if (Static356.anIntArray641[local14] != -1 && Static227.aByteArrayArray10[local14] == null) {
				Static227.aByteArrayArray10[local14] = Static223.aClass171_77.method4339(Static356.anIntArray641[local14], 0);
				if (Static227.aByteArrayArray10[local14] == null) {
					Static41.anInt864++;
					local12 = false;
				}
			}
			if (Static226.anIntArray440 != null && Static381.aByteArrayArray20[local14] == null && Static226.anIntArray440[local14] != -1) {
				Static381.aByteArrayArray20[local14] = Static223.aClass171_77.method4356(0, Static226.anIntArray440[local14], Static13.anIntArrayArray4[local14]);
				if (Static381.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static41.anInt864++;
				}
			}
		}
		if (Static111.aClass53_3 == null) {
			if (Static489.aClass1_Sub1_Sub5_3 == null || !Static154.aClass171_59.method4350(Static489.aClass1_Sub1_Sub5_3.aString34 + "_staticelements")) {
				Static111.aClass53_3 = new Class53(0);
			} else if (Static154.aClass171_59.method4357(Static489.aClass1_Sub1_Sub5_3.aString34 + "_staticelements")) {
				Static111.aClass53_3 = Static230.method1103(Static83.aBoolean102, Static154.aClass171_59, Static489.aClass1_Sub1_Sub5_3.aString34 + "_staticelements");
			} else {
				local12 = false;
				Static41.anInt864++;
			}
		}
		if (!local12) {
			Static277.anInt5226 = 1;
			return;
		}
		local12 = true;
		Static532.anInt8953 = 0;
		@Pc(263) int local263;
		@Pc(274) int local274;
		for (@Pc(244) int local244 = 0; local244 < Static449.aByteArrayArray27.length; local244++) {
			@Pc(250) byte[] local250 = Static529.aByteArrayArray32[local244];
			if (local250 != null) {
				local263 = (Static9.anIntArray23[local244] >> 8) * 64 - Static470.anInt7897;
				local274 = (Static9.anIntArray23[local244] & 0xFF) * 64 - Static534.anInt9007;
				if (Static271.anInt5150 != 0) {
					local263 = 10;
					local274 = 10;
				}
				local12 &= Static113.method1913(Static459.anInt7799, local263, local274, Static482.anInt7990, local250);
			}
			local250 = Static227.aByteArrayArray10[local244];
			if (local250 != null) {
				local263 = (Static9.anIntArray23[local244] >> 8) * 64 - Static470.anInt7897;
				local274 = (Static9.anIntArray23[local244] & 0xFF) * 64 - Static534.anInt9007;
				if (Static271.anInt5150 != 0) {
					local274 = 10;
					local263 = 10;
				}
				local12 &= Static113.method1913(Static459.anInt7799, local263, local274, Static482.anInt7990, local250);
			}
		}
		if (!local12) {
			Static277.anInt5226 = 2;
			return;
		}
		if (Static277.anInt5226 != 0) {
			Static489.method6714(Static190.aClass306_42.method7165(Static179.anInt3168) + "<br>(100%)", true, Static112.aClass67_3);
		}
		Static63.method1142();
		Static194.method2970();
		@Pc(369) boolean local369 = false;
		if (Static513.aClass122_10.method7221() && Static544.aClass1_Sub22_Sub1_1.aBoolean392) {
			for (local263 = 0; local263 < Static449.aByteArrayArray27.length; local263++) {
				if (Static227.aByteArrayArray10[local263] != null || Static324.aByteArrayArray16[local263] != null) {
					local369 = true;
					break;
				}
			}
		}
		if (Static544.aClass1_Sub22_Sub1_1.aBoolean391) {
			local263 = Static44.anIntArray121[Static251.anInt4908];
		} else {
			local263 = Static332.anIntArray606[Static251.anInt4908];
		}
		if (Static513.aClass122_10.method7262()) {
			local263++;
		}
		Static105.method1782(Static459.anInt7799, Static482.anInt7990, local263, local369, Static513.aClass122_10.method7217() > 0);
		for (local274 = 0; local274 < 4; local274++) {
			Static86.aClass91Array1[local274].method2180();
		}
		Static177.method2911();
		Static457.method6476(false);
		Static131.method2183();
		Static263.aBoolean356 = false;
		Static40.aClass117_1 = null;
		Static63.method1142();
		System.gc();
		Static462.method6525(true);
		Static424.method6218();
		Static212.anInt4112 = Static544.aClass1_Sub22_Sub1_1.method4655(Static374.anInt6861);
		Static427.aBoolean540 = Static544.aClass1_Sub22_Sub1_1.aBoolean392;
		Static449.aBoolean553 = Static17.anInt454 >= 96;
		Static521.aBoolean617 = Static544.aClass1_Sub22_Sub1_1.method4648(Static374.anInt6861);
		Static247.aBoolean344 = !Static544.aClass1_Sub22_Sub1_1.aBoolean388;
		Static402.anInt7240 = Static544.aClass1_Sub22_Sub1_1.method4662(Static374.anInt6861) ? -1 : Static206.anInt4061;
		Static469.aBoolean633 = Static303.method4788(Static374.anInt6861) || Static544.aClass1_Sub22_Sub1_1.aBoolean383;
		Static237.aBoolean337 = Static544.aClass1_Sub22_Sub1_1.aBoolean396;
		Static367.aClass149_Sub1_2 = new Class149_Sub1(4, Static459.anInt7799, Static482.anInt7990, false);
		if (Static271.anInt5150 == 0) {
			Static156.method2468(Static449.aByteArrayArray27, Static367.aClass149_Sub1_2);
		} else {
			Static168.method4649(Static367.aClass149_Sub1_2, Static449.aByteArrayArray27);
		}
		Static162.method2507(Static459.anInt7799 >> 4, Static482.anInt7990 >> 4);
		Static532.method7369();
		if (local369) {
			Static76.method1318(true);
			Static209.aClass149_Sub1_1 = new Class149_Sub1(1, Static459.anInt7799, Static482.anInt7990, true);
			if (Static271.anInt5150 == 0) {
				Static156.method2468(Static324.aByteArrayArray16, Static209.aClass149_Sub1_1);
				Static462.method6525(true);
			} else {
				Static168.method4649(Static209.aClass149_Sub1_1, Static324.aByteArrayArray16);
				Static462.method6525(true);
			}
			Static209.aClass149_Sub1_1.method3871(Static367.aClass149_Sub1_2.anIntArrayArrayArray5[0]);
			Static209.aClass149_Sub1_1.method3863(null, Static513.aClass122_10, null);
			Static76.method1318(false);
		}
		Static367.aClass149_Sub1_2.method3863(local369 ? Static209.aClass149_Sub1_1.anIntArrayArrayArray5 : null, Static513.aClass122_10, Static86.aClass91Array1);
		if (Static271.anInt5150 == 0) {
			Static462.method6525(true);
			Static113.method1911(Static529.aByteArrayArray32, Static367.aClass149_Sub1_2);
			if (Static381.aByteArrayArray20 != null) {
				Static330.method5082();
			}
		} else {
			Static462.method6525(true);
			Static35.method795(Static529.aByteArrayArray32, Static367.aClass149_Sub1_2);
		}
		Static194.method2970();
		if (Static17.anInt454 < 96) {
			Static111.method1895();
		}
		Static462.method6525(true);
		Static367.aClass149_Sub1_2.method3873(Static513.aClass122_10, null, local369 ? Static209.aClass205Array2[0] : null);
		Static367.aClass149_Sub1_2.method3878(Static513.aClass122_10);
		Static462.method6525(true);
		if (local369) {
			Static76.method1318(true);
			Static462.method6525(true);
			if (Static271.anInt5150 == 0) {
				Static113.method1911(Static227.aByteArrayArray10, Static209.aClass149_Sub1_1);
			} else {
				Static35.method795(Static227.aByteArrayArray10, Static209.aClass149_Sub1_1);
			}
			Static194.method2970();
			Static462.method6525(true);
			Static209.aClass149_Sub1_1.method3873(Static513.aClass122_10, Static16.aClass205Array1[0], null);
			Static209.aClass149_Sub1_1.method3878(Static513.aClass122_10);
			Static462.method6525(true);
			Static76.method1318(false);
		}
		Static491.method6720();
		@Pc(711) int local711 = Static367.aClass149_Sub1_2.anInt4463;
		if (Static501.anInt8491 < local711) {
			local711 = Static501.anInt8491;
		}
		if (local711 < Static501.anInt8491 - 1) {
			local711 = Static501.anInt8491 - 1;
		}
		if (Static544.aClass1_Sub22_Sub1_1.method4662(Static374.anInt6861)) {
			Static371.method5721(0);
		} else {
			Static371.method5721(local711);
		}
		@Pc(750) int local750;
		@Pc(754) int local754;
		for (@Pc(746) int local746 = 0; local746 < 4; local746++) {
			for (local750 = 0; local750 < Static459.anInt7799; local750++) {
				for (local754 = 0; local754 < Static482.anInt7990; local754++) {
					Static424.method6219(local750, local754, local746);
				}
			}
		}
		Static486.method6643();
		Static63.method1142();
		Static476.method6602();
		Static194.method2970();
		Static409.method6078();
		if (Static224.aFrame6 != null && Static402.aClass56_2 != null && Static268.anInt5100 == 10) {
			Static144.method2331(Static45.aClass296_50);
			Static455.aClass1_Sub6_Sub2_2.method3948(1057001181);
		}
		if (Static271.anInt5150 == 0) {
			local750 = (Static460.anInt7803 - (Static459.anInt7799 >> 4)) / 8;
			local754 = (Static460.anInt7803 + (Static459.anInt7799 >> 4)) / 8;
			@Pc(836) int local836 = (Static212.anInt4105 - (Static482.anInt7990 >> 4)) / 8;
			@Pc(844) int local844 = (Static212.anInt4105 + (Static482.anInt7990 >> 4)) / 8;
			for (@Pc(848) int local848 = local750 - 1; local848 <= local754 + 1; local848++) {
				for (@Pc(854) int local854 = local836 - 1; local854 <= local844 + 1; local854++) {
					if (local750 > local848 || local754 < local848 || local854 < local836 || local844 < local854) {
						Static223.aClass171_77.method4346("m" + local848 + "_" + local854);
						Static223.aClass171_77.method4346("l" + local848 + "_" + local854);
					}
				}
			}
		}
		if (Static268.anInt5100 == 3) {
			Static85.method1463(2);
		} else if (Static268.anInt5100 == 7) {
			Static85.method1463(6);
		} else {
			Static85.method1463(9);
			if (Static402.aClass56_2 != null) {
				Static144.method2331(Static33.aClass296_45);
			}
		}
		Static448.method6406();
		Static63.method1142();
		Static156.method2461();
	}
}
