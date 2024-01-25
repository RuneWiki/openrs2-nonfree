import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "I")
	public static int anInt6960 = 999999;

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "I")
	public static int anInt6962 = 0;

	@OriginalMember(owner = "client!oaa", name = "c", descriptor = "Lclient!jk;")
	public static final Class189 aClass189_10 = new Class189();

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
	public static int anInt6963 = 0;

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)V")
	public static void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Static652.anInt10664) {
			return;
		}
		if (arg0 == 14 || arg0 == 15) {
			Static642.method8882();
		}
		if (arg0 != 14 && Static60.aClass50_1 != null) {
			Static60.aClass50_1.method6168();
			Static60.aClass50_1 = null;
		}
		if (arg0 == 3) {
			Static90.method1401(Static381.anInt6411 != Static598.anInt10850);
		}
		if (arg0 == 7) {
			Static292.method4642(Static381.anInt6411 != Static549.anInt8708);
		}
		if (arg0 == 5 || arg0 == 13) {
			Static143.method2611();
		} else if (arg0 == 6 || arg0 == 9) {
			Static642.method8882();
		}
		if (Static115.method1731(Static652.anInt10664, arg1 + 68)) {
			Static455.aClass126_208.anInt3317 = 2;
			Static647.aClass126_291.anInt3317 = 2;
			Static92.aClass126_274.anInt3317 = 2;
			Static623.aClass126_283.anInt3317 = 2;
			Static554.aClass126_253.anInt3317 = 2;
			Static279.aClass126_136.anInt3317 = 2;
			Static52.aClass126_40.anInt3317 = 2;
		}
		if (Static115.method1731(arg0, -103)) {
			Static2.anInt6 = 1;
			Static119.anInt1944 = 0;
			Static184.anInt3435 = 0;
			Static82.anInt1434 = 1;
			Static574.anInt8997 = 0;
			Static487.method7255(true);
			Static455.aClass126_208.anInt3317 = 1;
			Static647.aClass126_291.anInt3317 = 1;
			Static92.aClass126_274.anInt3317 = 1;
			Static623.aClass126_283.anInt3317 = 1;
			Static554.aClass126_253.anInt3317 = 1;
			Static279.aClass126_136.anInt3317 = 1;
			Static52.aClass126_40.anInt3317 = 1;
		}
		if (arg0 == 12 || arg0 == 3) {
			Static52.method933();
		}
		@Pc(209) boolean local209 = arg0 == 2 || Static186.method3179(arg0) || Static285.method4551(false, arg0);
		@Pc(231) boolean local231 = ~Static652.anInt10664 == arg1 || Static186.method3179(Static652.anInt10664) || Static285.method4551(false, Static652.anInt10664);
		if (local209 != local231) {
			if (local209) {
				Static603.anInt9717 = Static551.anInt8722;
				if (Static577.aClass5_Sub19_25.aClass17_Sub15_5.method5251() == 0) {
					Static457.method6442(-1);
				} else {
					Static71.method1157(Static336.aClass126_156, Static577.aClass5_Sub19_25.aClass17_Sub15_5.method5251(), arg1 + 4, Static551.anInt8722);
					Static348.method5140();
				}
				Static93.aClass241_1.method5529(false);
			} else {
				Static457.method6442(arg1 + 2);
				Static93.aClass241_1.method5529(true);
			}
		}
		if (Static115.method1731(arg0, -88) || arg0 == 14 || arg0 == 15) {
			Static273.aClass100_6.method8663();
		}
		Static652.anInt10664 = arg0;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)I")
	public static int method6061() {
		@Pc(21) int local21;
		if (Static577.aClass5_Sub19_25.aClass17_Sub25_1.method8266() == 0) {
			for (local21 = 0; local21 < Static479.anInt7781; local21++) {
				if (Static154.anInterface23Array1[local21].method4634() == 's' || Static154.anInterface23Array1[local21].method4634() == 'S') {
					Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub25_1, 1);
					Static414.aBoolean465 = true;
					break;
				}
			}
		}
		@Pc(77) int local77;
		if (Static130.aClass40_22 == Static43.aClass40_1) {
			@Pc(68) Runtime local68 = Runtime.getRuntime();
			local77 = (int) ((local68.totalMemory() - local68.freeMemory()) / 1024L);
			@Pc(80) long local80 = Static480.method6763();
			if (Static100.aLong63 == 0L) {
				Static100.aLong63 = local80;
			}
			if (local77 > 16384 && local80 - Static100.aLong63 < 5000L) {
				if (local80 - Static636.aLong294 > 1000L) {
					System.gc();
					Static636.aLong294 = local80;
				}
				return 0;
			}
		}
		if (Static43.aClass40_2 == Static130.aClass40_22) {
			if (Static62.aClass318_1 == null) {
				Static62.aClass318_1 = new Class318(Static93.aClass241_1, Static194.aClass301_9, Static462.aBigInteger4, Static609.aBigInteger3);
			}
			if (!Static62.aClass318_1.method7167()) {
				return 0;
			}
			Static514.method7054((String) null, 0, true);
			Static545.aBoolean572 = !Static659.method9060();
			Static81.aClass126_52 = Static577.method7755(1, Static545.aBoolean572 ? 34 : 32, false);
			Static206.aClass126_107 = Static577.method7755(1, 33, false);
			Static600.aClass126_275 = Static577.method7755(1, 13, false);
		}
		@Pc(187) boolean local187;
		if (Static43.aClass40_3 == Static130.aClass40_22) {
			local187 = Static206.aClass126_107.method3063();
			local77 = Static35.aClass222_Sub1Array1[33].method7718();
			local77 += Static35.aClass222_Sub1Array1[Static545.aBoolean572 ? 34 : 32].method7718();
			local77 += Static35.aClass222_Sub1Array1[13].method7718();
			local77 += local187 ? 100 : Static206.aClass126_107.method3066();
			if (local77 != 400) {
				return local77 / 4;
			}
			Static560.anInt8810 = Static81.aClass126_52.method3070();
			Static117.anInt1889 = Static206.aClass126_107.method3070();
			Static201.method3318(Static81.aClass126_52);
			@Pc(251) int local251 = Static577.aClass5_Sub19_25.aClass17_Sub13_1.method4987();
			Static294.aClass195_1 = new Class195(Static536.aClass290_6, Static375.anInt7800, Static206.aClass126_107);
			@Pc(263) int[] local263 = Static294.aClass195_1.method4553(local251);
			if (local263.length == 0) {
				local263 = Static294.aClass195_1.method4553(0);
			}
			@Pc(277) Class107 local277 = new Class107(Static81.aClass126_52, Static600.aClass126_275);
			if (local263.length > 0) {
				Static673.anInterface18Array1 = new Interface18[local263.length];
				for (@Pc(286) int local286 = 0; local286 < Static673.anInterface18Array1.length; local286++) {
					Static673.anInterface18Array1[local286] = new Class232(Static294.aClass195_1.method4552(local263[local286]), local277);
				}
			}
		}
		if (Static130.aClass40_22 == Static43.aClass40_4) {
			Static488.method6856(Static600.aClass126_275, Static26.method394(), Static81.aClass126_52);
		}
		if (Static130.aClass40_22 == Static43.aClass40_5) {
			local21 = Static240.method3812();
			local77 = Static565.method7650();
			if (local21 < local77) {
				return local21 * 100 / local77;
			}
		}
		if (Static43.aClass40_6 == Static130.aClass40_22) {
			if (Static673.anInterface18Array1 != null && Static673.anInterface18Array1.length > 0) {
				if (Static673.anInterface18Array1[0].method5203() < 100) {
					return 0;
				}
				if (Static673.anInterface18Array1.length > 1 && Static294.aClass195_1.method4555() && Static673.anInterface18Array1[1].method5203() < 100) {
					return 0;
				}
			}
			Static187.method3195(Static273.aClass100_6);
			Static186.method3182(Static273.aClass100_6);
			method6060(1, -3);
		}
		if (Static130.aClass40_22 == Static43.aClass40_7) {
			for (local21 = 0; local21 < 4; local21++) {
				Static553.aClass169Array1[local21] = Static336.method5051(Static613.anInt9909, Static271.anInt4910);
			}
		}
		if (Static43.aClass40_8 == Static130.aClass40_22) {
			Static27.aClass126_18 = Static577.method7755(1, 8, false);
			Static137.aClass126_79 = Static577.method7755(1, 0, false);
			Static38.aClass126_26 = Static577.method7755(1, 1, false);
			Static455.aClass126_208 = Static577.method7755(1, 2, false);
			Static264.aClass126_126 = Static577.method7755(1, 3, false);
			Static543.aClass126_247 = Static577.method7755(1, 4, false);
			Static495.aClass126_12 = Static577.method7755(1, 5, true);
			Static336.aClass126_156 = Static577.method7755(1, 6, true);
			Static570.aClass126_258 = Static577.method7755(1, 7, false);
			Static358.aClass126_165 = Static577.method7755(1, 9, false);
			Static673.aClass126_298 = Static577.method7755(1, 10, false);
			Static446.aClass126_207 = Static577.method7755(1, 11, false);
			Static230.aClass126_115 = Static577.method7755(1, 12, false);
			Static612.aClass126_279 = Static577.method7755(1, 14, false);
			Static535.aClass126_240 = Static577.method7755(1, 15, false);
			Static92.aClass126_274 = Static577.method7755(1, 16, false);
			Static647.aClass126_291 = Static577.method7755(1, 17, false);
			Static623.aClass126_283 = Static577.method7755(1, 18, false);
			Static554.aClass126_253 = Static577.method7755(1, 19, false);
			Static279.aClass126_136 = Static577.method7755(1, 20, false);
			Static52.aClass126_40 = Static577.method7755(1, 21, false);
			Static176.aClass126_96 = Static577.method7755(1, 22, false);
			Static460.aClass126_211 = Static577.method7755(1, 23, true);
			Static116.aClass126_248 = Static577.method7755(1, 24, false);
			Static481.aClass126_223 = Static577.method7755(1, 25, false);
			Static305.aClass126_149 = Static577.method7755(1, 26, true);
			Static35.aClass126_20 = Static577.method7755(1, 27, false);
			Static583.aClass126_265 = Static577.method7755(1, 28, true);
			Static618.aClass126_284 = Static577.method7755(1, 29, false);
			Static471.aClass126_218 = Static577.method7755(1, 30, true);
			Static63.aClass126_44 = Static577.method7755(1, 31, true);
			Static609.aClass126_198 = Static577.method7755(2, 36, true);
		}
		if (Static130.aClass40_22 == Static43.aClass40_9) {
			local21 = 0;
			for (local77 = 0; local77 < 37; local77++) {
				if (Static35.aClass222_Sub1Array1[local77] != null) {
					local21 += Static35.aClass222_Sub1Array1[local77].method7718() * Static559.anIntArray501[local77] / 100;
				}
			}
			if (local21 != 100) {
				if (Static641.anInt10426 < 0) {
					Static641.anInt10426 = local21;
				}
				return (local21 - Static641.anInt10426) * 100 / (100 - Static641.anInt10426);
			}
			Static354.method5206(Static27.aClass126_18);
			Static488.method6856(Static600.aClass126_275, Static26.method394(), Static27.aClass126_18);
		}
		if (Static130.aClass40_22 == Static43.aClass40_10) {
			if (Static551.anInt8722 == -1) {
				Static551.anInt8722 = Static336.aClass126_156.method3067("scape main");
			}
			Static464.method6558();
			method6060(2, -3);
		}
		if (Static130.aClass40_22 == Static43.aClass40_11) {
			Static524.method7140(Static471.aClass126_218, Static681.aClass349_6);
		}
		if (Static130.aClass40_22 == Static43.aClass40_12) {
			local21 = Static593.method8161();
			if (local21 < 100) {
				return local21;
			}
			Static270.method4445(Static583.aClass126_265.method3069(1));
			Static40.method760(Static583.aClass126_265.method3069(3));
			Static87.aClass133_1 = new Class133(Static583.aClass126_265);
		}
		if (Static43.aClass40_13 == Static130.aClass40_22) {
			if (Static577.anInt9007 != -1 && !Static570.aClass126_258.method3068(Static577.anInt9007, 0)) {
				return 99;
			}
			Static472.anInterface7_10 = new Class329(Static305.aClass126_149, Static358.aClass126_165, Static27.aClass126_18);
			Static612.aClass380_2 = new Class380(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static591.aClass148_2 = new Class148(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208, Static87.aClass133_1);
			Static458.aClass233_1 = new Class233(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208, Static27.aClass126_18);
			Static116.aClass237_3 = new Class237(Static536.aClass290_6, Static375.anInt7800, Static647.aClass126_291);
			Static240.aClass141_4 = new Class141(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static292.aClass152_4 = new Class152(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static140.aClass312_1 = new Class312(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208, Static27.aClass126_18);
			Static239.aClass294_1 = new Class294(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208, Static570.aClass126_258);
			Static279.aClass347_1 = new Class347(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static433.aClass104_1 = new Class104(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static528.aClass243_3 = new Class243(Static536.aClass290_6, Static375.anInt7800, true, Static92.aClass126_274, Static570.aClass126_258);
			Static583.aClass327_4 = new Class327(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208, Static27.aClass126_18);
			Static201.aClass97_3 = new Class97(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208, Static27.aClass126_18);
			Static378.aClass369_2 = new Class369(Static536.aClass290_6, Static375.anInt7800, true, Static623.aClass126_283, Static570.aClass126_258);
			Static82.aClass134_1 = new Class134(Static536.aClass290_6, Static375.anInt7800, true, Static612.aClass380_2, Static554.aClass126_253, Static570.aClass126_258);
			Static234.aClass101_1 = new Class101(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static315.aClass14_1 = new Class14(Static536.aClass290_6, Static375.anInt7800, Static279.aClass126_136, Static137.aClass126_79, Static38.aClass126_26);
			Static635.aClass356_1 = new Class356(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static332.aClass161_1 = new Class161(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static463.aClass352_1 = new Class352(Static536.aClass290_6, Static375.anInt7800, Static52.aClass126_40, Static570.aClass126_258);
			Static280.aClass111_1 = new Class111(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static431.aClass30_1 = new Class30(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static432.aClass58_1 = new Class58(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static284.aClass305_1 = new Class305(Static536.aClass290_6, Static375.anInt7800, Static176.aClass126_96);
			Static628.aClass348_1 = new Class348(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static379.aClass39_1 = new Class39(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static197.aClass9_1 = new Class9(Static536.aClass290_6, Static375.anInt7800, Static455.aClass126_208);
			Static187.method3192(Static27.aClass126_18, Static264.aClass126_126, Static570.aClass126_258, Static600.aClass126_275);
			Static358.method5234(Static618.aClass126_284);
			Static646.aClass263_1 = new Class263(Static375.anInt7800, Static116.aClass126_248, Static481.aClass126_223);
			Static54.aClass308_1 = new Class308(Static375.anInt7800, Static116.aClass126_248, Static481.aClass126_223, new Class286());
			Static46.method853();
			Static528.aClass243_3.method5549(Static577.aClass5_Sub19_25.aClass17_Sub27_1.method9058() == 0);
			Static23.aClass247_1 = new Class247();
			Static569.method7681();
			Static169.method3035(Static35.aClass126_20);
			Static669.method9110(Static472.anInterface7_10, Static570.aClass126_258);
			@Pc(1064) Class311 local1064 = new Class311(Static673.aClass126_298.method3073("", "huffman"));
			Static256.method4183(local1064);
			try {
				jagmisc.init();
			} catch (@Pc(1071) Throwable local1071) {
			}
			Static446.aClass36_1 = Static603.method8268();
			Static506.aClass5_Sub32_2 = new Class5_Sub32(true, Static681.aClass349_6);
		}
		if (Static43.aClass40_15 == Static130.aClass40_22) {
			local21 = Static398.method5824(Static27.aClass126_18) + Static206.method3382(true);
			local77 = Static513.method7047() + Static565.method7650();
			if (local77 > local21) {
				return local21 * 100 / local77;
			}
		}
		if (Static43.aClass40_16 == Static130.aClass40_22) {
			Static491.method672(Static460.aClass126_211, Static240.aClass141_4, Static292.aClass152_4, Static528.aClass243_3, Static583.aClass327_4, Static201.aClass97_3, Static23.aClass247_1);
		}
		if (Static130.aClass40_22 == Static43.aClass40_17) {
			Static624.aBooleanArray27 = new boolean[Static432.aClass58_1.anInt1084];
			Static123.anIntArray120 = new int[Static432.aClass58_1.anInt1084];
			Static140.aStringArray9 = new String[Static431.aClass30_1.anInt526];
			for (local21 = 0; local21 < Static432.aClass58_1.anInt1084; local21++) {
				if (Static432.aClass58_1.method1084(local21).anInt9948 == 0) {
					Static624.aBooleanArray27[local21] = true;
					Static262.anInt4702++;
				}
				Static123.anIntArray120[local21] = -1;
			}
			Static659.method9057();
			Static495.aClass126_12.method3092(false);
			Static336.aClass126_156.method3092(true);
			Static27.aClass126_18.method3092(true);
			Static600.aClass126_275.method3092(true);
			Static673.aClass126_298.method3092(true);
			Static455.aClass126_208.anInt3317 = 2;
			Static443.aBoolean494 = true;
			Static647.aClass126_291.anInt3317 = 2;
			Static92.aClass126_274.anInt3317 = 2;
			Static623.aClass126_283.anInt3317 = 2;
			Static554.aClass126_253.anInt3317 = 2;
			Static279.aClass126_136.anInt3317 = 2;
			Static52.aClass126_40.anInt3317 = 2;
		}
		if (Static130.aClass40_22 == Static43.aClass40_18) {
			if (!Static20.method345(Static598.anInt10850)) {
				return 0;
			}
			local187 = true;
			for (local77 = 0; local77 < Static397.aClass238ArrayArray2[Static598.anInt10850].length; local77++) {
				@Pc(1249) Class238 local1249 = Static397.aClass238ArrayArray2[Static598.anInt10850][local77];
				if (local1249.anInt5976 == 5 && local1249.anInt5950 != -1 && !Static27.aClass126_18.method3068(local1249.anInt5950, 0)) {
					local187 = false;
				}
			}
			if (!local187) {
				return 0;
			}
		}
		if (Static130.aClass40_22 == Static43.aClass40_19) {
			Static90.method1401(true);
		}
		if (Static43.aClass40_20 == Static130.aClass40_22) {
			Static510.aClass216_1.method4935();
			try {
				Static340.aThread2.join();
			} catch (@Pc(1308) InterruptedException local1308) {
				return 0;
			}
			Static510.aClass216_1 = null;
			Static673.anInterface18Array1 = null;
			Static294.aClass195_1 = null;
			Static81.aClass126_52 = null;
			Static340.aThread2 = null;
			Static206.aClass126_107 = null;
			Static265.method4289();
			Static78.aBoolean118 = Static577.aClass5_Sub19_25.aClass17_Sub25_1.method8266() == 1;
			Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub25_1, 1);
			if (Static78.aBoolean118) {
				Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, 0);
			} else if (Static577.aClass5_Sub19_25.aClass17_Sub24_1.aBoolean663 && Static506.aClass5_Sub32_2.anInt5619 < 512 && Static506.aClass5_Sub32_2.anInt5619 != 0) {
				Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, 0);
			}
			Static111.method1655();
			if (Static78.aBoolean118) {
				Static462.method6506(false, 0);
			} else {
				Static462.method6506(false, Static577.aClass5_Sub19_25.aClass17_Sub24_1.method8102());
			}
			Static471.method6672(Static577.aClass5_Sub19_25.aClass17_Sub6_1.method1610(), -1, -1, false);
			Static187.method3195(Static273.aClass100_6);
			Static186.method3182(Static273.aClass100_6);
			Static250.method4078(Static27.aClass126_18, 0, Static273.aClass100_6);
			Static502.method6975(Static326.aClass155Array13, 10);
		}
		return Static580.method8000();
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZIIBII)V")
	public static void method6062(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static239.anInt4140 = arg5;
		Static119.anInt1943 = arg2;
		Static28.anInt374 = arg0;
		Static352.anInt5799 = arg4;
		Static304.anInt5289 = arg3;
		if (arg1 && Static119.anInt1943 >= 100) {
			Static282.anInt5025 = Static352.anInt5799 * 512 + 256;
			Static141.anInt2764 = Static239.anInt4140 * 512 + 256;
			Static42.anInt703 = Static461.method6500(Static141.anInt2764, Static324.anInt5529, Static282.anInt5025) - Static28.anInt374;
		}
		Static417.anInt7039 = -1;
		Static227.anInt9451 = -1;
		Static426.anInt7111 = 2;
	}
}
