import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!tba", name = "r", descriptor = "Lclient!ns;")
	public static Class220 aClass220_6;

	@OriginalMember(owner = "client!tba", name = "t", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_82 = new Class77(38, 7);

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!be;IIIB)V")
	public static void method6944(@OriginalArg(0) Class30_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) Class166 local18 = arg0.method3602();
		@Pc(28) int local28 = arg0.lb - arg0.aClass221_7.anInt6446 & 0x3FFF;
		if (arg2 == -1) {
			if (local28 != 0 || arg0.anInt4159 > 25) {
				if (arg1 < 0 && local18.anInt4999 != -1) {
					arg0.anInt4155 = local18.anInt4999;
				} else if (arg1 <= 0 || local18.anInt4956 == -1) {
					arg0.anInt4155 = local18.anInt4964;
				} else {
					arg0.anInt4155 = local18.anInt4956;
				}
				arg0.aBoolean335 = false;
			} else if (!arg0.aBoolean335 || !local18.method4182(arg0.anInt4155)) {
				arg0.anInt4155 = local18.method4179();
				arg0.aBoolean335 = arg0.anInt4155 != -1;
			}
		} else if (arg0.anInt4135 != -1 && (local28 >= 10240 || local28 <= 2048)) {
			@Pc(227) int local227 = Static86.anIntArray191[arg3] - arg0.aClass221_7.anInt6446 & 0x3FFF;
			arg0.aBoolean335 = false;
			if (arg2 == 2 && local18.anInt4962 != -1) {
				if (local227 > 2048 && local227 <= 6144 && local18.anInt4992 != -1) {
					arg0.anInt4155 = local18.anInt4992;
				} else if (local227 >= 10240 && local227 < 14336 && local18.anInt4982 != -1) {
					arg0.anInt4155 = local18.anInt4982;
				} else if (local227 <= 6144 || local227 >= 10240 || local18.anInt4973 == -1) {
					arg0.anInt4155 = local18.anInt4962;
				} else {
					arg0.anInt4155 = local18.anInt4973;
				}
			} else if (arg2 == 0 && local18.anInt4987 != -1) {
				if (local227 > 2048 && local227 <= 6144 && local18.anInt4983 != -1) {
					arg0.anInt4155 = local18.anInt4983;
				} else if (local227 >= 10240 && local227 < 14336 && local18.anInt4978 != -1) {
					arg0.anInt4155 = local18.anInt4978;
				} else if (local227 <= 6144 || local227 >= 10240 || local18.anInt4971 == -1) {
					arg0.anInt4155 = local18.anInt4987;
				} else {
					arg0.anInt4155 = local18.anInt4971;
				}
			} else if (local227 > 2048 && local227 <= 6144 && local18.anInt4959 != -1) {
				arg0.anInt4155 = local18.anInt4959;
			} else if (local227 >= 10240 && local227 < 14336 && local18.anInt4979 != -1) {
				arg0.anInt4155 = local18.anInt4979;
			} else if (local227 <= 6144 || local227 >= 10240 || local18.anInt4996 == -1) {
				arg0.anInt4155 = local18.anInt4964;
			} else {
				arg0.anInt4155 = local18.anInt4996;
			}
		} else if (local28 == 0 && arg0.anInt4159 <= 25) {
			if (arg2 == 2 && local18.anInt4962 != -1) {
				arg0.anInt4155 = local18.anInt4962;
			} else if (arg2 == 0 && local18.anInt4987 != -1) {
				arg0.anInt4155 = local18.anInt4987;
			} else {
				arg0.anInt4155 = local18.anInt4964;
			}
			arg0.aBoolean335 = false;
		} else {
			if (arg2 == 2 && local18.anInt4962 != -1) {
				if (arg1 < 0 && local18.anInt4963 != -1) {
					arg0.anInt4155 = local18.anInt4963;
				} else if (arg1 <= 0 || local18.anInt4957 == -1) {
					arg0.anInt4155 = local18.anInt4962;
				} else {
					arg0.anInt4155 = local18.anInt4957;
				}
			} else if (arg2 == 0 && local18.anInt4987 != -1) {
				if (arg1 < 0 && local18.anInt4970 != -1) {
					arg0.anInt4155 = local18.anInt4970;
				} else if (arg1 <= 0 || local18.anInt4958 == -1) {
					arg0.anInt4155 = local18.anInt4987;
				} else {
					arg0.anInt4155 = local18.anInt4958;
				}
			} else if (arg1 < 0 && local18.anInt4975 != -1) {
				arg0.anInt4155 = local18.anInt4975;
			} else if (arg1 <= 0 || local18.anInt4967 == -1) {
				arg0.anInt4155 = local18.anInt4964;
			} else {
				arg0.anInt4155 = local18.anInt4967;
			}
			arg0.aBoolean335 = false;
		}
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)V")
	public static void method6945() {
		Static431.method6594(false);
		Static478.anInt8725 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static344.aByteArrayArray18.length; local14++) {
			if (Static120.anIntArray222[local14] != -1 && Static344.aByteArrayArray18[local14] == null) {
				Static344.aByteArrayArray18[local14] = Static129.aClass16_119.method408(Static120.anIntArray222[local14], 0);
				if (Static344.aByteArrayArray18[local14] == null) {
					local12 = false;
					Static478.anInt8725++;
				}
			}
			if (Static100.anIntArray203[local14] != -1 && Static28.aByteArrayArray10[local14] == null) {
				Static28.aByteArrayArray10[local14] = Static129.aClass16_119.method418(0, Static174.anIntArrayArray38[local14], Static100.anIntArray203[local14]);
				if (Static28.aByteArrayArray10[local14] == null) {
					Static478.anInt8725++;
					local12 = false;
				}
			}
			if (Static395.anIntArray494[local14] != -1 && Static427.aByteArrayArray26[local14] == null) {
				Static427.aByteArrayArray26[local14] = Static129.aClass16_119.method408(Static395.anIntArray494[local14], 0);
				if (Static427.aByteArrayArray26[local14] == null) {
					local12 = false;
					Static478.anInt8725++;
				}
			}
			if (Static143.anIntArray236[local14] != -1 && Static73.aByteArrayArray4[local14] == null) {
				Static73.aByteArrayArray4[local14] = Static129.aClass16_119.method408(Static143.anIntArray236[local14], 0);
				if (Static73.aByteArrayArray4[local14] == null) {
					Static478.anInt8725++;
					local12 = false;
				}
			}
			if (Static13.anIntArray19 != null && Static230.aByteArrayArray9[local14] == null && Static13.anIntArray19[local14] != -1) {
				Static230.aByteArrayArray9[local14] = Static129.aClass16_119.method418(0, Static174.anIntArrayArray38[local14], Static13.anIntArray19[local14]);
				if (Static230.aByteArrayArray9[local14] == null) {
					Static478.anInt8725++;
					local12 = false;
				}
			}
		}
		if (Static119.aClass159_2 == null) {
			if (Static447.aClass12_Sub4_Sub7_3 == null || !Static224.aClass16_108.method390(Static447.aClass12_Sub4_Sub7_3.aString29 + "_staticelements")) {
				Static119.aClass159_2 = new Class159(0);
			} else if (Static224.aClass16_108.method419(Static447.aClass12_Sub4_Sub7_3.aString29 + "_staticelements")) {
				Static119.aClass159_2 = Static530.method7862(Static447.aClass12_Sub4_Sub7_3.aString29 + "_staticelements", Static105.aBoolean204, Static224.aClass16_108);
			} else {
				Static478.anInt8725++;
				local12 = false;
			}
		}
		if (!local12) {
			Static419.anInt7798 = 1;
			return;
		}
		local12 = true;
		Static377.anInt9639 = 0;
		@Pc(265) int local265;
		@Pc(276) int local276;
		for (@Pc(246) int local246 = 0; local246 < Static344.aByteArrayArray18.length; local246++) {
			@Pc(252) byte[] local252 = Static28.aByteArrayArray10[local246];
			if (local252 != null) {
				local265 = (Static443.anIntArray607[local246] >> 8) * 64 - Static61.anInt1459;
				local276 = (Static443.anIntArray607[local246] & 0xFF) * 64 - Static203.anInt4534;
				if (Static184.anInt4228 != 0) {
					local265 = 10;
					local276 = 10;
				}
				local12 &= Static289.method4718(local252, Static329.anInt6247, Static37.anInt7512, local265, local276);
			}
			local252 = Static73.aByteArrayArray4[local246];
			if (local252 != null) {
				local265 = (Static443.anIntArray607[local246] >> 8) * 64 - Static61.anInt1459;
				local276 = (Static443.anIntArray607[local246] & 0xFF) * 64 - Static203.anInt4534;
				if (Static184.anInt4228 != 0) {
					local265 = 10;
					local276 = 10;
				}
				local12 &= Static289.method4718(local252, Static329.anInt6247, Static37.anInt7512, local265, local276);
			}
		}
		if (!local12) {
			Static419.anInt7798 = 2;
			return;
		}
		if (Static419.anInt7798 != 0) {
			Static178.method3537(Static53.aClass88_34.method2391(Static345.anInt6495) + "<br>(100%)", true, Static56.aClass80_2);
		}
		Static365.method5697();
		Static514.method1479();
		@Pc(375) boolean local375 = false;
		if (Static243.aClass42_4.method5813() && Static208.aClass12_Sub10_Sub1_1.aBoolean178) {
			for (local265 = 0; local265 < Static344.aByteArrayArray18.length; local265++) {
				if (Static73.aByteArrayArray4[local265] != null || Static427.aByteArrayArray26[local265] != null) {
					local375 = true;
					break;
				}
			}
		}
		if (Static208.aClass12_Sub10_Sub1_1.aBoolean174) {
			local265 = Static295.anIntArray400[Static375.anInt6904];
		} else {
			local265 = Static234.anIntArray349[Static375.anInt6904];
		}
		if (Static243.aClass42_4.method5853()) {
			local265++;
		}
		Static339.method5404(Static37.anInt7512, Static329.anInt6247, local265, local375, Static243.aClass42_4.method5825() > 0);
		for (local276 = 0; local276 < 4; local276++) {
			Static510.aClass184Array1[local276].method4591();
		}
		Static218.method4008();
		Static381.method6031(false);
		Static231.method4122();
		Static165.aBoolean315 = false;
		Static476.aClass186_2 = null;
		Static365.method5697();
		System.gc();
		Static431.method6594(true);
		Static236.method4159();
		Static337.anInt6452 = Static208.aClass12_Sub10_Sub1_1.method2043(Static148.anInt6867);
		Static22.aBoolean684 = Static458.anInt8335 >= 96;
		Static506.aBoolean645 = Static208.aClass12_Sub10_Sub1_1.aBoolean178;
		Static394.aBoolean538 = Static208.aClass12_Sub10_Sub1_1.method2038(Static148.anInt6867);
		Static321.aBoolean462 = !Static208.aClass12_Sub10_Sub1_1.aBoolean188;
		Static416.anInt9651 = Static208.aClass12_Sub10_Sub1_1.method2057(Static148.anInt6867) ? -1 : Static415.anInt3783;
		Static141.aBoolean253 = Static39.method807(Static148.anInt6867) || Static208.aClass12_Sub10_Sub1_1.aBoolean186;
		Static151.aBoolean274 = Static208.aClass12_Sub10_Sub1_1.aBoolean180;
		Static113.aClass119_Sub1_1 = new Class119_Sub1(4, Static37.anInt7512, Static329.anInt6247, false);
		if (Static184.anInt4228 == 0) {
			Static125.method2672(Static113.aClass119_Sub1_1, Static344.aByteArrayArray18);
		} else {
			Static367.method5706(Static344.aByteArrayArray18, Static113.aClass119_Sub1_1);
		}
		Static17.method415(Static37.anInt7512 >> 4, Static329.anInt6247 >> 4);
		Static74.method1671();
		if (local375) {
			Static200.method3790(true);
			Static473.aClass119_Sub1_2 = new Class119_Sub1(1, Static37.anInt7512, Static329.anInt6247, true);
			if (Static184.anInt4228 == 0) {
				Static125.method2672(Static473.aClass119_Sub1_2, Static427.aByteArrayArray26);
				Static431.method6594(true);
			} else {
				Static367.method5706(Static427.aByteArrayArray26, Static473.aClass119_Sub1_2);
				Static431.method6594(true);
			}
			Static473.aClass119_Sub1_2.method3331(Static113.aClass119_Sub1_1.anIntArrayArrayArray4[0]);
			Static473.aClass119_Sub1_2.method3338(Static243.aClass42_4, null, null);
			Static200.method3790(false);
		}
		Static113.aClass119_Sub1_1.method3338(Static243.aClass42_4, Static510.aClass184Array1, local375 ? Static473.aClass119_Sub1_2.anIntArrayArrayArray4 : null);
		if (Static184.anInt4228 == 0) {
			Static431.method6594(true);
			Static334.method5353(Static113.aClass119_Sub1_1, Static28.aByteArrayArray10);
			if (Static230.aByteArrayArray9 != null) {
				Static152.method3026();
			}
		} else {
			Static431.method6594(true);
			Static260.method1517(Static28.aByteArrayArray10, Static113.aClass119_Sub1_1);
		}
		Static514.method1479();
		if (Static458.anInt8335 < 96) {
			Static143.method2852();
		}
		Static431.method6594(true);
		Static113.aClass119_Sub1_1.method3329(local375 ? Static67.aClass215Array2[0] : null, Static243.aClass42_4, null);
		Static113.aClass119_Sub1_1.method3347(Static243.aClass42_4);
		Static431.method6594(true);
		if (local375) {
			Static200.method3790(true);
			Static431.method6594(true);
			if (Static184.anInt4228 == 0) {
				Static334.method5353(Static473.aClass119_Sub1_2, Static73.aByteArrayArray4);
			} else {
				Static260.method1517(Static73.aByteArrayArray4, Static473.aClass119_Sub1_2);
			}
			Static514.method1479();
			Static431.method6594(true);
			Static473.aClass119_Sub1_2.method3329(null, Static243.aClass42_4, Static155.aClass215Array5[0]);
			Static473.aClass119_Sub1_2.method3347(Static243.aClass42_4);
			Static431.method6594(true);
			Static200.method3790(false);
		}
		Static466.method6990();
		@Pc(711) int local711 = Static113.aClass119_Sub1_1.anInt3807;
		if (Static56.anInt1418 < local711) {
			local711 = Static56.anInt1418;
		}
		if (Static56.anInt1418 - 1 > local711) {
			local711 = Static56.anInt1418 - 1;
		}
		if (Static208.aClass12_Sub10_Sub1_1.method2057(Static148.anInt6867)) {
			Static97.method2072(0);
		} else {
			Static97.method2072(local711);
		}
		@Pc(746) int local746;
		@Pc(750) int local750;
		for (@Pc(742) int local742 = 0; local742 < 4; local742++) {
			for (local746 = 0; local746 < Static37.anInt7512; local746++) {
				for (local750 = 0; local750 < Static329.anInt6247; local750++) {
					Static534.method7449(local742, local746, local750);
				}
			}
		}
		Static82.method1828();
		Static365.method5697();
		Static196.method3706();
		Static514.method1479();
		Static187.method3646();
		if (Static308.aFrame17 != null && Static491.aClass277_2 != null && Static96.anInt2243 == 10) {
			Static332.method5312(Static284.aClass77_51);
			Static383.aClass12_Sub8_Sub2_1.method5223(1057001181);
		}
		if (Static184.anInt4228 == 0) {
			local746 = (Static248.anInt5103 - (Static37.anInt7512 >> 4)) / 8;
			local750 = (Static248.anInt5103 + (Static37.anInt7512 >> 4)) / 8;
			@Pc(840) int local840 = (Static492.anInt8088 - (Static329.anInt6247 >> 4)) / 8;
			@Pc(849) int local849 = (Static492.anInt8088 + (Static329.anInt6247 >> 4)) / 8;
			for (@Pc(853) int local853 = local746 - 1; local853 <= local750 + 1; local853++) {
				for (@Pc(859) int local859 = local840 - 1; local859 <= local849 + 1; local859++) {
					if (local853 < local746 || local853 > local750 || local859 < local840 || local859 > local849) {
						Static129.aClass16_119.method386("m" + local853 + "_" + local859);
						Static129.aClass16_119.method386("l" + local853 + "_" + local859);
					}
				}
			}
		}
		if (Static96.anInt2243 == 3) {
			Static9.method278(2);
		} else if (Static96.anInt2243 == 7) {
			Static9.method278(6);
		} else {
			Static9.method278(9);
			if (Static491.aClass277_2 != null) {
				Static332.method5312(Static263.aClass77_84);
			}
		}
		Static306.method4978();
		Static365.method5697();
		Static403.method6323();
	}
}
