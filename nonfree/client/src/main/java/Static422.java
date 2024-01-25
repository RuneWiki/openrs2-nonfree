import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "I")
	public static int anInt7962;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
	public static void method6796() {
		Static127.aClass169_21.method5009();
		Static140.aClass169_24.method5009();
		Static90.aClass169_13.method5009();
		Static297.aClass169_34.method5009();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I)I")
	public static int method6797() {
		@Pc(13) int local13;
		if (Static74.aClass2_Sub13_5.aClass14_Sub19_1.method6726() == 0) {
			for (local13 = 0; local13 < Static266.anInt5672; local13++) {
				if (Static332.anInterface16Array1[local13].method4433() == 's' || Static332.anInterface16Array1[local13].method4433() == 'S') {
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub19_1, 1);
					Static638.aBoolean751 = true;
					break;
				}
			}
		}
		@Pc(70) int local70;
		if (Static137.aClass167_2 == Static265.aClass167_3) {
			@Pc(60) Runtime local60 = Runtime.getRuntime();
			local70 = (int) ((local60.totalMemory() - local60.freeMemory()) / 1024L);
			@Pc(75) long local75 = Static277.method5091();
			if (Static259.aLong119 == 0L) {
				Static259.aLong119 = local75;
			}
			if (local70 > 16384 && local75 - Static259.aLong119 < 5000L) {
				if (local75 - Static434.aLong199 > 1000L) {
					System.gc();
					Static434.aLong199 = local75;
				}
				return 0;
			}
		}
		if (Static265.aClass167_4 == Static137.aClass167_2) {
			if (Static437.aClass84_1 == null) {
				Static437.aClass84_1 = new Class84(Static142.aClass329_3, Static238.aClass5_3, Static255.aBigInteger6, Static137.aBigInteger3);
			}
			if (!Static437.aClass84_1.method2853()) {
				return 0;
			}
			Static25.method8261(null, 0, true);
			Static549.aBoolean684 = !Static243.method4511();
			Static549.aClass157_267 = Static410.method6635(false, Static549.aBoolean684 ? 34 : 32, 1);
			Static75.aClass157_48 = Static410.method6635(false, 33, 1);
			Static348.aClass157_177 = Static410.method6635(false, 13, 1);
		}
		@Pc(167) boolean local167;
		if (Static265.aClass167_5 == Static137.aClass167_2) {
			local167 = Static75.aClass157_48.method4555();
			local70 = Static18.aClass37_Sub1Array1[33].method1671();
			local70 += Static18.aClass37_Sub1Array1[Static549.aBoolean684 ? 34 : 32].method1671();
			local70 += Static18.aClass37_Sub1Array1[13].method1671();
			local70 += local167 ? 100 : Static75.aClass157_48.method4552();
			if (local70 != 400) {
				return local70 / 4;
			}
			Static428.anInt5962 = Static549.aClass157_267.method4543();
			Static354.anInt7039 = Static75.aClass157_48.method4543();
			Static349.method5951(Static549.aClass157_267);
			@Pc(232) int local232 = Static74.aClass2_Sub13_5.aClass14_Sub26_1.method8283();
			Static310.aClass214_1 = new Class214(Static423.aClass316_4, Static476.anInt8915, Static75.aClass157_48);
			@Pc(244) int[] local244 = Static310.aClass214_1.method6061(local232);
			if (local244.length == 0) {
				local244 = Static310.aClass214_1.method6061(0);
			}
			@Pc(261) Class210 local261 = new Class210(Static549.aClass157_267, Static348.aClass157_177);
			if (local244.length > 0) {
				Static449.anInterface5Array1 = new Interface5[local244.length];
				for (@Pc(273) int local273 = 0; local273 < Static449.anInterface5Array1.length; local273++) {
					Static449.anInterface5Array1[local273] = new Class285(Static310.aClass214_1.method6058(local244[local273]), local261);
				}
			}
		}
		if (Static137.aClass167_2 == Static265.aClass167_6) {
			Static328.method5642(Static348.aClass157_177, Static65.method9240(), Static549.aClass157_267);
		}
		if (Static265.aClass167_7 == Static137.aClass167_2) {
			local13 = Static85.method2424();
			local70 = Static150.method7141();
			if (local13 < local70) {
				return local13 * 100 / local70;
			}
		}
		if (Static137.aClass167_2 == Static265.aClass167_8) {
			if (Static449.anInterface5Array1 != null && Static449.anInterface5Array1.length > 0) {
				if (Static449.anInterface5Array1[0].method9014() < 100) {
					return 0;
				}
				if (Static449.anInterface5Array1.length > 1 && Static310.aClass214_1.method6059() && Static449.anInterface5Array1[1].method9014() < 100) {
					return 0;
				}
			}
			Static429.method6860(Static186.aClass20_4);
			Static161.method6633(Static186.aClass20_4);
			Static66.method8375(1);
		}
		if (Static137.aClass167_2 == Static265.aClass167_9) {
			for (local13 = 0; local13 < 4; local13++) {
				Static55.aClass104Array3[local13] = Static256.method4724(Static209.anInt4742, Static47.anInt1794);
			}
		}
		if (Static137.aClass167_2 == Static265.aClass167_10) {
			Static214.aClass157_106 = Static410.method6635(false, 8, 1);
			Static400.aClass157_206 = Static410.method6635(false, 0, 1);
			Static456.aClass157_154 = Static410.method6635(false, 1, 1);
			Static337.aClass157_172 = Static410.method6635(false, 2, 1);
			Static489.aClass157_241 = Static410.method6635(false, 3, 1);
			Static377.aClass157_192 = Static410.method6635(false, 4, 1);
			Static316.aClass157_158 = Static410.method6635(true, 5, 1);
			Static100.aClass157_64 = Static410.method6635(true, 6, 1);
			Static363.aClass157_188 = Static410.method6635(false, 7, 1);
			Static410.aClass157_211 = Static410.method6635(false, 9, 1);
			Static207.aClass157_104 = Static410.method6635(false, 10, 1);
			Static361.aClass157_187 = Static410.method6635(false, 11, 1);
			Static38.aClass157_28 = Static410.method6635(false, 12, 1);
			Static282.aClass157_139 = Static410.method6635(false, 14, 1);
			Static371.aClass157_189 = Static410.method6635(false, 15, 1);
			Static335.aClass157_169 = Static410.method6635(false, 16, 1);
			Static539.aClass157_263 = Static410.method6635(false, 17, 1);
			Static499.aClass157_245 = Static410.method6635(false, 18, 1);
			Static435.aClass157_222 = Static410.method6635(false, 19, 1);
			Static563.aClass157_278 = Static410.method6635(false, 20, 1);
			Static309.aClass157_152 = Static410.method6635(false, 21, 1);
			Static336.aClass157_171 = Static410.method6635(false, 22, 1);
			Static474.aClass157_237 = Static410.method6635(true, 23, 1);
			Static378.aClass157_70 = Static410.method6635(false, 24, 1);
			Static313.aClass157_155 = Static410.method6635(false, 25, 1);
			Static233.aClass157_116 = Static410.method6635(true, 26, 1);
			Static527.aClass157_304 = Static410.method6635(false, 27, 1);
			Static299.aClass157_148 = Static410.method6635(true, 28, 1);
			Static571.aClass157_284 = Static410.method6635(false, 29, 1);
			Static373.aClass157_190 = Static410.method6635(true, 30, 1);
			Static384.aClass157_195 = Static410.method6635(true, 31, 1);
			Static44.aClass157_34 = Static410.method6635(true, 36, 2);
		}
		if (Static265.aClass167_11 == Static137.aClass167_2) {
			local13 = 0;
			for (local70 = 0; local70 < 37; local70++) {
				if (Static18.aClass37_Sub1Array1[local70] != null) {
					local13 += Static18.aClass37_Sub1Array1[local70].method1671() * Static193.anIntArray224[local70] / 100;
				}
			}
			if (local13 != 100) {
				if (Static60.anInt2001 < 0) {
					Static60.anInt2001 = local13;
				}
				return (local13 - Static60.anInt2001) * 100 / (100 - Static60.anInt2001);
			}
			Static190.method3912(Static214.aClass157_106);
			Static328.method5642(Static348.aClass157_177, Static65.method9240(), Static214.aClass157_106);
		}
		if (Static265.aClass167_12 == Static137.aClass167_2) {
			if (Static121.anInt9613 == -1) {
				Static121.anInt9613 = Static100.aClass157_64.method4571("scape main");
			}
			Static144.method3206();
			Static66.method8375(2);
		}
		if (Static265.aClass167_13 == Static137.aClass167_2) {
			Static227.method4303(Static373.aClass157_190, Static268.aClass370_3);
		}
		if (Static265.aClass167_14 == Static137.aClass167_2) {
			local13 = Static416.method6728();
			if (local13 < 100) {
				return local13;
			}
			Static572.method8542(Static299.aClass157_148.method4569(1));
			Static291.method5256(Static299.aClass157_148.method4569(3));
		}
		if (Static137.aClass167_2 == Static265.aClass167_15) {
			if (Static428.anInt5961 != -1 && !Static363.aClass157_188.method4574(Static428.anInt5961, 0)) {
				return 99;
			}
			Static216.anInterface4_10 = new Class326(Static233.aClass157_116, Static410.aClass157_211, Static214.aClass157_106);
			Static229.aClass70_1 = new Class70(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static415.aClass340_1 = new Class340(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static527.aClass260_31 = new Class260(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172, Static214.aClass157_106);
			Static176.aClass145_1 = new Class145(Static423.aClass316_4, Static476.anInt8915, Static539.aClass157_263);
			Static517.aClass49_3 = new Class49(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static151.aClass275_3 = new Class275(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static298.aClass307_2 = new Class307(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172, Static214.aClass157_106);
			Static541.aClass245_2 = new Class245(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172, Static363.aClass157_188);
			Static133.aClass349_1 = new Class349(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static2.aClass277_4 = new Class277(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static27.aClass342_3 = new Class342(Static423.aClass316_4, Static476.anInt8915, true, Static335.aClass157_169, Static363.aClass157_188);
			Static361.aClass248_4 = new Class248(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172, Static214.aClass157_106);
			Static16.aClass237_3 = new Class237(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172, Static214.aClass157_106);
			Static462.aClass355_2 = new Class355(Static423.aClass316_4, Static476.anInt8915, true, Static499.aClass157_245, Static363.aClass157_188);
			Static635.aClass336_2 = new Class336(Static423.aClass316_4, Static476.anInt8915, true, Static229.aClass70_1, Static435.aClass157_222, Static363.aClass157_188);
			Static361.aClass278_1 = new Class278(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static195.aClass193_1 = new Class193(Static423.aClass316_4, Static476.anInt8915, Static563.aClass157_278, Static400.aClass157_206, Static456.aClass157_154);
			Static227.aClass190_1 = new Class190(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static371.aClass137_1 = new Class137(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static459.aClass62_2 = new Class62(Static423.aClass316_4, Static476.anInt8915, Static309.aClass157_152, Static363.aClass157_188);
			Static384.aClass173_1 = new Class173(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static325.aClass188_1 = new Class188(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static436.aClass338_1 = new Class338(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static517.aClass284_1 = new Class284(Static423.aClass316_4, Static476.anInt8915, Static336.aClass157_171);
			Static581.aClass305_1 = new Class305(Static423.aClass316_4, Static476.anInt8915, Static337.aClass157_172);
			Static281.method5116(Static348.aClass157_177, Static489.aClass157_241, Static214.aClass157_106, Static363.aClass157_188);
			Static300.method2215(Static571.aClass157_284);
			Static479.aClass312_1 = new Class312(Static476.anInt8915, Static378.aClass157_70, Static313.aClass157_155);
			Static296.aClass13_1 = new Class13(Static476.anInt8915, Static378.aClass157_70, Static313.aClass157_155, new Class140());
			Static398.method6497();
			Static27.aClass342_3.method8537(Static74.aClass2_Sub13_5.aClass14_Sub7_2.method3523() == 0);
			Static286.aClass263_3 = new Class263();
			Static538.method9146();
			Static291.method5255(Static527.aClass157_304);
			Static400.method6534(Static363.aClass157_188, Static216.anInterface4_10);
			@Pc(995) Class369 local995 = new Class369(Static207.aClass157_104.method4545("huffman", ""));
			Static626.method1530(local995);
			try {
				jagmisc.init();
			} catch (@Pc(1002) Throwable local1002) {
			}
			Static186.aClass50_1 = Static517.method7855();
			Static494.aClass2_Sub16_1 = new Class2_Sub16(true, Static268.aClass370_3);
		}
		if (Static137.aClass167_2 == Static265.aClass167_17) {
			local13 = Static330.method5695(Static214.aClass157_106) + Static559.method8395(true);
			local70 = Static625.method9091() + Static150.method7141();
			if (local13 < local70) {
				return local13 * 100 / local70;
			}
		}
		if (Static265.aClass167_18 == Static137.aClass167_2) {
			Static303.method149(Static474.aClass157_237, Static517.aClass49_3, Static151.aClass275_3, Static27.aClass342_3, Static361.aClass248_4, Static16.aClass237_3, Static286.aClass263_3);
		}
		if (Static265.aClass167_19 == Static137.aClass167_2) {
			Static306.anIntArray372 = new int[Static436.aClass338_1.anInt10155];
			Static544.aBooleanArray25 = new boolean[Static436.aClass338_1.anInt10155];
			Static443.aStringArray36 = new String[Static325.aClass188_1.anInt6438];
			for (local13 = 0; local13 < Static436.aClass338_1.anInt10155; local13++) {
				if (Static436.aClass338_1.method8462(local13).anInt7782 == 0) {
					Static544.aBooleanArray25[local13] = true;
					Static110.anInt3009++;
				}
				Static306.anIntArray372[local13] = -1;
			}
			Static362.method6134();
			Static603.anInt7122 = Static489.aClass157_241.method4571("loginscreen");
			Static258.anInt5506 = Static489.aClass157_241.method4571("lobbyscreen");
			Static316.aClass157_158.method4558(false);
			Static100.aClass157_64.method4558(true);
			Static214.aClass157_106.method4558(true);
			Static348.aClass157_177.method4558(true);
			Static207.aClass157_104.method4558(true);
			Static489.aClass157_241.method4558(true);
			Static337.aClass157_172.anInt5303 = 2;
			Static78.aBoolean206 = true;
			Static539.aClass157_263.anInt5303 = 2;
			Static335.aClass157_169.anInt5303 = 2;
			Static499.aClass157_245.anInt5303 = 2;
			Static435.aClass157_222.anInt5303 = 2;
			Static563.aClass157_278.anInt5303 = 2;
			Static309.aClass157_152.anInt5303 = 2;
		}
		if (Static137.aClass167_2 == Static265.aClass167_20) {
			if (!Static80.method2326(Static603.anInt7122)) {
				return 0;
			}
			local167 = true;
			for (local70 = 0; local70 < Static631.aClass24ArrayArray2[Static603.anInt7122].length; local70++) {
				@Pc(1186) Class24 local1186 = Static631.aClass24ArrayArray2[Static603.anInt7122][local70];
				if (local1186.anInt480 == 5 && local1186.anInt468 != -1 && !Static214.aClass157_106.method4574(local1186.anInt468, 0)) {
					local167 = false;
				}
			}
			if (!local167) {
				return 0;
			}
		}
		if (Static265.aClass167_21 == Static137.aClass167_2) {
			Static461.method6815(true);
		}
		if (Static137.aClass167_2 == Static265.aClass167_22) {
			Static251.aClass8_1.method172();
			try {
				Static474.aThread5.join();
			} catch (@Pc(1232) InterruptedException local1232) {
				return 0;
			}
			Static310.aClass214_1 = null;
			Static75.aClass157_48 = null;
			Static251.aClass8_1 = null;
			Static449.anInterface5Array1 = null;
			Static474.aThread5 = null;
			Static549.aClass157_267 = null;
			Static626.method1520();
			Static361.aBoolean524 = Static74.aClass2_Sub13_5.aClass14_Sub19_1.method6726() == 1;
			Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub19_1, 1);
			if (Static361.aBoolean524) {
				Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, 0);
			} else if (Static74.aClass2_Sub13_5.aClass14_Sub5_1.aBoolean248 && Static494.aClass2_Sub16_1.anInt3436 < 512 && Static494.aClass2_Sub16_1.anInt3436 != 0) {
				Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, 0);
			}
			Static318.method5531();
			if (Static361.aBoolean524) {
				Static316.method5509(false, 0);
			} else {
				Static316.method5509(false, Static74.aClass2_Sub13_5.aClass14_Sub5_1.method2945());
			}
			Static317.method5514(Static74.aClass2_Sub13_5.aClass14_Sub16_1.method5919(), -1, false, -1);
			Static429.method6860(Static186.aClass20_4);
			Static161.method6633(Static186.aClass20_4);
			Static561.method8417(Static214.aClass157_106, Static186.aClass20_4);
			Static33.method4656(Static38.aClass46Array2);
		}
		return Static222.method4284();
	}

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI[Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6798(@OriginalArg(1) int arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			return "";
		} else if (arg0 == 1) {
			@Pc(19) String local19 = arg1[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(30) int local30 = arg0 + arg2;
			@Pc(32) int local32 = 0;
			for (@Pc(34) int local34 = arg2; local34 < local30; local34++) {
				@Pc(40) String local40 = arg1[local34];
				if (local40 == null) {
					local32 += 4;
				} else {
					local32 += local40.length();
				}
			}
			@Pc(63) StringBuffer local63 = new StringBuffer(local32);
			for (@Pc(65) int local65 = arg2; local65 < local30; local65++) {
				@Pc(71) String local71 = arg1[local65];
				if (local71 == null) {
					local63.append("null");
				} else {
					local63.append(local71);
				}
			}
			return local63.toString();
		}
	}
}
