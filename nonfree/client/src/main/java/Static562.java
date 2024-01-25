import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "[I")
	public static final int[] anIntArray516 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "[F")
	public static final float[] aFloatArray96 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_54 = new Class357();

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)I")
	public static int method7833() {
		@Pc(11) int local11;
		if (Static713.aClass3_Sub55_31.aClass15_Sub13_1.method4638() == 0) {
			for (local11 = 0; local11 < Static225.anInt4285; local11++) {
				if (Static165.anInterface3Array2[local11].method668() == 's' || Static165.anInterface3Array2[local11].method668() == 'S') {
					Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub13_1, 1);
					Static348.aBoolean476 = true;
					break;
				}
			}
		}
		@Pc(78) int local78;
		if (Static481.aClass344_2 == Static593.aClass344_3) {
			@Pc(68) Runtime local68 = Runtime.getRuntime();
			local78 = (int) ((local68.totalMemory() - local68.freeMemory()) / 1024L);
			@Pc(81) long local81 = Static626.method8479();
			if (Static586.aLong327 == 0L) {
				Static586.aLong327 = local81;
			}
			if (local78 > 16384 && local81 - Static586.aLong327 < 5000L) {
				if (local81 - Static226.aLong144 > 1000L) {
					System.gc();
					Static226.aLong144 = local81;
				}
				return 0;
			}
		}
		if (Static481.aClass344_2 == Static593.aClass344_4) {
			if (Static30.aClass389_1 == null) {
				Static30.aClass389_1 = new Class389(Static406.aClass153_2, Static537.aClass259_2, Static324.aBigInteger2, Static339.aBigInteger3);
			}
			if (!Static30.aClass389_1.method9069()) {
				return 0;
			}
			Static13.method164(true, 0, (String) null);
			Static711.aBoolean802 = !Static55.method715();
			Static370.aClass221_103 = Static333.method4983(false, Static711.aBoolean802 ? 34 : 32, 1);
			Static581.aClass221_147 = Static333.method4983(false, 33, 1);
			Static385.aClass221_110 = Static333.method4983(false, 13, 1);
		}
		@Pc(188) boolean local188;
		if (Static593.aClass344_5 == Static481.aClass344_2) {
			local188 = Static581.aClass221_147.method5091();
			local78 = Static231.aClass171_Sub1Array1[33].method4226();
			local78 += Static231.aClass171_Sub1Array1[Static711.aBoolean802 ? 34 : 32].method4226();
			local78 += Static231.aClass171_Sub1Array1[13].method4226();
			local78 += local188 ? 100 : Static581.aClass221_147.method5075();
			if (local78 != 400) {
				return local78 / 4;
			}
			Static664.anInt10591 = Static370.aClass221_103.method5088();
			Static607.anInt9860 = Static581.aClass221_147.method5088();
			Static431.method6342(Static370.aClass221_103);
			@Pc(252) int local252 = Static713.aClass3_Sub55_31.aClass15_Sub22_1.method7522();
			Static51.aClass70_1 = new Class70(Static667.aClass169_8, Static141.anInt2658, Static581.aClass221_147);
			@Pc(264) int[] local264 = Static51.aClass70_1.method2020(local252);
			if (local264.length == 0) {
				local264 = Static51.aClass70_1.method2020(0);
			}
			@Pc(278) Class351 local278 = new Class351(Static370.aClass221_103, Static385.aClass221_110);
			if (local264.length > 0) {
				Static96.anInterface23Array1 = new Interface23[local264.length];
				for (@Pc(290) int local290 = 0; local290 < Static96.anInterface23Array1.length; local290++) {
					Static96.anInterface23Array1[local290] = new Class56(Static51.aClass70_1.method2024(local264[local290]), local278);
				}
			}
		}
		if (Static593.aClass344_6 == Static481.aClass344_2) {
			Static383.method5759(Static370.aClass221_103, Static385.aClass221_110, Static237.method9234());
		}
		if (Static481.aClass344_2 == Static593.aClass344_7) {
			local11 = Static399.method5984();
			local78 = Static591.method8102();
			if (local78 > local11) {
				return local11 * 100 / local78;
			}
		}
		if (Static593.aClass344_8 == Static481.aClass344_2) {
			if (Static96.anInterface23Array1 != null && Static96.anInterface23Array1.length > 0) {
				if (Static96.anInterface23Array1[0].method8331() < 100) {
					return 0;
				}
				if (Static96.anInterface23Array1.length > 1 && Static51.aClass70_1.method2022() && Static96.anInterface23Array1[1].method8331() < 100) {
					return 0;
				}
			}
			Static722.method9415(Static488.aClass67_12);
			Static115.method2035(Static488.aClass67_12);
			Static638.method8657(1);
		}
		if (Static593.aClass344_9 == Static481.aClass344_2) {
			for (local11 = 0; local11 < 4; local11++) {
				Static678.aClass360Array5[local11] = Static555.method7788(Static362.anInt8653, Static206.anInt11291);
			}
		}
		if (Static481.aClass344_2 == Static593.aClass344_10) {
			Static403.aClass221_115 = Static333.method4983(false, 8, 1);
			Static543.aClass221_138 = Static333.method4983(false, 0, 1);
			Static175.aClass221_157 = Static333.method4983(false, 1, 1);
			Static450.aClass221_121 = Static333.method4983(false, 2, 1);
			Static344.aClass221_99 = Static333.method4983(false, 3, 1);
			Static401.aClass221_114 = Static333.method4983(false, 4, 1);
			Static397.aClass221_113 = Static333.method4983(true, 5, 1);
			Static191.aClass221_51 = Static333.method4983(true, 6, 1);
			Static719.aClass221_163 = Static333.method4983(false, 7, 1);
			Static624.aClass221_153 = Static333.method4983(false, 9, 1);
			Static156.aClass221_42 = Static333.method4983(false, 10, 1);
			Static517.aClass221_133 = Static333.method4983(false, 11, 1);
			Static300.aClass221_87 = Static333.method4983(false, 12, 1);
			Static89.aClass221_17 = Static333.method4983(false, 14, 1);
			Static278.aClass221_84 = Static333.method4983(false, 15, 1);
			Static5.aClass221_1 = Static333.method4983(false, 16, 1);
			Static372.aClass221_104 = Static333.method4983(false, 17, 1);
			Static264.aClass221_73 = Static333.method4983(false, 18, 1);
			Static412.aClass221_119 = Static333.method4983(false, 19, 1);
			Static650.aClass221_155 = Static333.method4983(false, 20, 1);
			Static332.aClass221_95 = Static333.method4983(false, 21, 1);
			Static550.aClass221_63 = Static333.method4983(false, 22, 1);
			Static556.aClass221_140 = Static333.method4983(true, 23, 1);
			Static685.aClass221_160 = Static333.method4983(false, 24, 1);
			Static108.aClass221_21 = Static333.method4983(false, 25, 1);
			Static626.aClass221_154 = Static333.method4983(true, 26, 1);
			Static310.aClass221_89 = Static333.method4983(false, 27, 1);
			Static579.aClass221_55 = Static333.method4983(true, 28, 1);
			Static463.aClass221_124 = Static333.method4983(false, 29, 1);
			Static406.aClass221_116 = Static333.method4983(true, 35, 1);
			Static241.aClass221_74 = Static333.method4983(true, 30, 1);
			Static689.aClass221_83 = Static333.method4983(true, 31, 1);
			Static564.aClass221_143 = Static333.method4983(true, 36, 2);
		}
		if (Static481.aClass344_2 == Static593.aClass344_11) {
			local11 = 0;
			for (local78 = 0; local78 < 37; local78++) {
				if (Static231.aClass171_Sub1Array1[local78] != null) {
					local11 += Static231.aClass171_Sub1Array1[local78].method4226() * Static509.anIntArray473[local78] / 100;
				}
			}
			if (local11 != 100) {
				if (Static137.anInt2533 < 0) {
					Static137.anInt2533 = local11;
				}
				return (local11 - Static137.anInt2533) * 100 / (100 - Static137.anInt2533);
			}
			Static72.method923(Static403.aClass221_115);
			Static383.method5759(Static403.aClass221_115, Static385.aClass221_110, Static237.method9234());
		}
		if (Static593.aClass344_12 == Static481.aClass344_2) {
			@Pc(738) byte[] local738 = Static579.aClass221_55.method5077(4);
			if (local738 == null) {
				return 0;
			}
			Static3.method40(local738);
			Static264.method3691();
			Static638.method8657(2);
		}
		if (Static481.aClass344_2 == Static593.aClass344_13) {
			Static124.method2114(Static310.aClass47_4, Static241.aClass221_74);
		}
		if (Static481.aClass344_2 == Static593.aClass344_14) {
			local11 = Static448.method6655();
			if (local11 < 100) {
				return local11;
			}
			Static715.method6595(Static579.aClass221_55.method5077(1));
			Static224.aClass84_1 = new Class84(Static579.aClass221_55);
			Static92.aShortArrayArrayArray1 = Static224.aClass84_1.aShortArrayArrayArray2;
			Static576.aShortArrayArray4 = Static224.aClass84_1.aShortArrayArray1;
			Static423.aClass218_2 = new Class218(Static579.aClass221_55);
		}
		if (Static481.aClass344_2 == Static593.aClass344_15) {
			if (Static224.aClass84_1.anInt2472 != -1 && !Static719.aClass221_163.method5093(0, Static224.aClass84_1.anInt2472)) {
				return 99;
			}
			Static644.anInterface2_12 = new Class50(Static626.aClass221_154, Static624.aClass221_153, Static403.aClass221_115);
			Static646.aClass106_1 = new Class106(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static255.aClass238_1 = new Class238(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121, Static423.aClass218_2);
			Static621.aClass336_2 = new Class336(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121, Static403.aClass221_115);
			Static170.aClass191_1 = new Class191(Static667.aClass169_8, Static141.anInt2658, Static372.aClass221_104);
			Static74.aClass140_2 = new Class140(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static321.aClass124_7 = new Class124(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static610.aClass116_2 = new Class116(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121, Static403.aClass221_115);
			Static208.aClass29_2 = new Class29(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121, Static719.aClass221_163);
			Static156.aClass301_1 = new Class301(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static605.aClass122_1 = new Class122(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static70.aClass323_1 = new Class323(Static667.aClass169_8, Static141.anInt2658, true, Static5.aClass221_1, Static719.aClass221_163);
			Static462.aClass98_2 = new Class98(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121, Static403.aClass221_115);
			Static567.aClass405_3 = new Class405(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121, Static403.aClass221_115);
			Static631.aClass85_2 = new Class85(Static667.aClass169_8, Static141.anInt2658, true, Static264.aClass221_73, Static719.aClass221_163);
			Static243.aClass406_2 = new Class406(Static667.aClass169_8, Static141.anInt2658, true, Static646.aClass106_1, Static412.aClass221_119, Static719.aClass221_163);
			Static12.aClass94_1 = new Class94(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static59.aClass177_1 = new Class177(Static667.aClass169_8, Static141.anInt2658, Static650.aClass221_155, Static543.aClass221_138, Static175.aClass221_157);
			Static103.aClass114_1 = new Class114(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static102.aClass126_1 = new Class126(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static660.aClass307_2 = new Class307(Static667.aClass169_8, Static141.anInt2658, Static332.aClass221_95, Static719.aClass221_163);
			Static308.aClass321_1 = new Class321(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static389.aClass220_1 = new Class220(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static76.aClass168_1 = new Class168(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static135.aClass248_1 = new Class248(Static667.aClass169_8, Static141.anInt2658, Static550.aClass221_63);
			Static494.aClass45_1 = new Class45(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static101.aClass125_1 = new Class125(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static455.aClass227_1 = new Class227(Static667.aClass169_8, Static141.anInt2658, Static450.aClass221_121);
			Static175.method8849(Static344.aClass221_99, Static719.aClass221_163, Static403.aClass221_115, Static385.aClass221_110);
			Static532.method7500(Static463.aClass221_124);
			Static361.aClass215_1 = new Class215(Static141.anInt2658, Static685.aClass221_160, Static108.aClass221_21);
			Static558.aClass233_2 = new Class233(Static141.anInt2658, Static685.aClass221_160, Static108.aClass221_21, new Class109());
			Static32.method474();
			Static70.aClass323_1.method7800(Static713.aClass3_Sub55_31.aClass15_Sub25_1.method8268() == 0);
			Static577.aClass362_1 = new Class362();
			Static523.method7451();
			Static1.method7203(Static59.aClass177_1);
			Static265.method4093(Static310.aClass221_89);
			Static692.method9079(Static719.aClass221_163, Static644.anInterface2_12);
			@Pc(1113) Class151 local1113 = new Class151(Static156.aClass221_42.method5076("", "huffman"));
			Static543.method7617(local1113);
			try {
				jagmisc.init();
			} catch (@Pc(1122) Throwable local1122) {
			}
			Static420.aClass199_1 = Static672.method8909();
			Static50.aClass3_Sub25_1 = new Class3_Sub25(true, Static310.aClass47_4);
		}
		if (Static593.aClass344_17 == Static481.aClass344_2) {
			local11 = Static295.method4575(Static403.aClass221_115) + Static451.method6697(true);
			local78 = Static150.method2441() + Static591.method8102();
			if (local11 < local78) {
				return local11 * 100 / local78;
			}
		}
		if (Static481.aClass344_2 == Static593.aClass344_18) {
			Static654.method6877(Static556.aClass221_140, Static74.aClass140_2, Static321.aClass124_7, Static70.aClass323_1, Static462.aClass98_2, Static567.aClass405_3, Static577.aClass362_1);
		}
		if (Static593.aClass344_19 == Static481.aClass344_2) {
			Static214.aBooleanArray11 = new boolean[Static76.aClass168_1.anInt4867];
			Static283.aStringArray16 = new String[Static389.aClass220_1.anInt5943];
			Static568.anIntArray608 = new int[Static76.aClass168_1.anInt4867];
			for (local11 = 0; local11 < Static76.aClass168_1.anInt4867; local11++) {
				if (Static76.aClass168_1.method4111(local11).anInt7681 == 0) {
					Static214.aBooleanArray11[local11] = true;
					Static345.anInt5905++;
				}
				Static568.anIntArray608[local11] = -1;
			}
			Static714.method9317();
			Static397.aClass221_113.method5074(false);
			Static191.aClass221_51.method5074(true);
			Static403.aClass221_115.method5074(true);
			Static385.aClass221_110.method5074(true);
			Static156.aClass221_42.method5074(true);
			Static498.aBoolean639 = true;
			Static450.aClass221_121.anInt5968 = 2;
			Static372.aClass221_104.anInt5968 = 2;
			Static5.aClass221_1.anInt5968 = 2;
			Static264.aClass221_73.anInt5968 = 2;
			Static412.aClass221_119.anInt5968 = 2;
			Static650.aClass221_155.anInt5968 = 2;
			Static332.aClass221_95.anInt5968 = 2;
		}
		if (Static481.aClass344_2 == Static593.aClass344_20) {
			if (!Static255.method3996(Static224.aClass84_1.anInt2473)) {
				return 0;
			}
			local188 = true;
			for (local78 = 0; local78 < Static403.aClass20ArrayArray2[Static224.aClass84_1.anInt2473].length; local78++) {
				@Pc(1314) Class20 local1314 = Static403.aClass20ArrayArray2[Static224.aClass84_1.anInt2473][local78];
				if (local1314.anInt532 == 5 && local1314.anInt547 != -1 && !Static403.aClass221_115.method5093(0, local1314.anInt547)) {
					local188 = false;
				}
			}
			if (!local188) {
				return 0;
			}
		}
		if (Static481.aClass344_2 == Static593.aClass344_21) {
			Static312.method4705(true);
		}
		if (Static593.aClass344_22 == Static481.aClass344_2) {
			Static720.aClass264_1.method6409();
			try {
				Static578.aThread5.join();
			} catch (@Pc(1370) InterruptedException local1370) {
				return 0;
			}
			Static370.aClass221_103 = null;
			Static51.aClass70_1 = null;
			Static96.anInterface23Array1 = null;
			Static578.aThread5 = null;
			Static720.aClass264_1 = null;
			Static581.aClass221_147 = null;
			Static372.method5396();
			Static595.aBoolean702 = Static713.aClass3_Sub55_31.aClass15_Sub13_1.method4638() == 1;
			Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub13_1, 1);
			if (Static595.aBoolean702) {
				Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, 0);
			} else if (Static713.aClass3_Sub55_31.lb.aBoolean106 && Static50.aClass3_Sub25_1.anInt4197 < 512 && Static50.aClass3_Sub25_1.anInt4197 != 0) {
				Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, 0);
			}
			Static328.method4885();
			if (Static595.aBoolean702) {
				Static718.method9389(0, false);
			} else {
				Static718.method9389(Static713.aClass3_Sub55_31.lb.method1071(), false);
			}
			Static354.method5127(-1, -1, false, Static713.aClass3_Sub55_31.aClass15_Sub23_1.method7900());
			Static722.method9415(Static488.aClass67_12);
			Static115.method2035(Static488.aClass67_12);
			Static453.method6735(Static488.aClass67_12, Static403.aClass221_115);
			Static564.method7847(Static619.aClass9Array44, 0);
		}
		return Static641.method8687();
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(B)Lclient!hk;")
	public static Class154 method7834() {
		try {
			return (Class154) Class.forName("mb").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			return null;
		}
	}
}
