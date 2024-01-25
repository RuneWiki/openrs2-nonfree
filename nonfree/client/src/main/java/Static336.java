import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
	public static int anInt5797;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "Lclient!rd;")
	public static Class3_Sub41 aClass3_Sub41_18;

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)I")
	public static int method4916() {
		@Pc(8) int local8;
		if (aClass3_Sub41_18.aClass14_Sub12_1.method3863() == 0) {
			for (local8 = 0; local8 < Static310.anInt5197; local8++) {
				if (Static54.anInterface18Array1[local8].method3024() == 's' || Static54.anInterface18Array1[local8].method3024() == 'S') {
					aClass3_Sub41_18.method6705(1, aClass3_Sub41_18.aClass14_Sub12_1);
					Static123.aBoolean167 = true;
					break;
				}
			}
		}
		@Pc(62) int local62;
		if (Static245.aClass159_2 == Static197.aClass159_1) {
			@Pc(53) Runtime local53 = Runtime.getRuntime();
			local62 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
			@Pc(65) long local65 = Static15.method380();
			if (Static480.aLong210 == 0L) {
				Static480.aLong210 = local65;
			}
			if (local62 > 16384 && local65 - Static480.aLong210 < 5000L) {
				if (local65 - Static276.aLong130 > 1000L) {
					System.gc();
					Static276.aLong130 = local65;
				}
				return 0;
			}
		}
		if (Static197.aClass159_1 == Static245.aClass159_3) {
			if (Static563.aClass257_1 == null) {
				Static563.aClass257_1 = new Class257(Static512.aClass113_3, Static37.aClass66_1, Static392.aBigInteger4, Static130.aBigInteger8);
			}
			if (!Static563.aClass257_1.method5622()) {
				return 0;
			}
			Static139.method5492(0, true, (String) null);
			Static296.aBoolean334 = !Static24.method564();
			Static676.aClass362_155 = Static270.method4006(false, Static296.aBoolean334 ? 34 : 32, 1);
			Static392.aClass362_83 = Static270.method4006(false, 33, 1);
			Static583.aClass362_138 = Static270.method4006(false, 13, 1);
		}
		@Pc(155) boolean local155;
		if (Static245.aClass159_4 == Static197.aClass159_1) {
			local155 = Static392.aClass362_83.method8341();
			local62 = Static84.aClass229_Sub1Array1[33].method5291();
			local62 += Static84.aClass229_Sub1Array1[Static296.aBoolean334 ? 34 : 32].method5291();
			local62 += Static84.aClass229_Sub1Array1[13].method5291();
			local62 += local155 ? 100 : Static392.aClass362_83.method8358();
			if (local62 != 400) {
				return local62 / 4;
			}
			Static380.anInt6370 = Static676.aClass362_155.method8337();
			Static427.anInt6960 = Static392.aClass362_83.method8337();
			Static44.method793(Static676.aClass362_155);
			@Pc(216) int local216 = aClass3_Sub41_18.aClass14_Sub1_1.method420();
			Static388.aClass109_1 = new Class109(Static227.aClass203_4, Static654.anInt10668, Static392.aClass362_83);
			@Pc(228) int[] local228 = Static388.aClass109_1.method2359(local216);
			if (local228.length == 0) {
				local228 = Static388.aClass109_1.method2359(0);
			}
			@Pc(242) Class153 local242 = new Class153(Static676.aClass362_155, Static583.aClass362_138);
			if (local228.length > 0) {
				Static40.anInterface13Array1 = new Interface13[local228.length];
				for (@Pc(251) int local251 = 0; local251 < Static40.anInterface13Array1.length; local251++) {
					Static40.anInterface13Array1[local251] = new Class140(Static388.aClass109_1.method2355(local228[local251]), local242);
				}
			}
		}
		if (Static245.aClass159_5 == Static197.aClass159_1) {
			Static558.method7351(Static583.aClass362_138, Static676.aClass362_155, Static650.method8730());
		}
		if (Static245.aClass159_6 == Static197.aClass159_1) {
			local8 = Static278.method4064();
			local62 = Static281.method4096();
			if (local8 < local62) {
				return local8 * 100 / local62;
			}
		}
		if (Static245.aClass159_7 == Static197.aClass159_1) {
			if (Static40.anInterface13Array1 != null && Static40.anInterface13Array1.length > 0) {
				if (Static40.anInterface13Array1[0].method7040() < 100) {
					return 0;
				}
				if (Static40.anInterface13Array1.length > 1 && Static388.aClass109_1.method2358() && Static40.anInterface13Array1[1].method7040() < 100) {
					return 0;
				}
			}
			Static78.method1307(Static119.aClass95_4);
			Static285.method4140(Static119.aClass95_4);
			Static279.method4069(1);
		}
		if (Static245.aClass159_8 == Static197.aClass159_1) {
			for (local8 = 0; local8 < 4; local8++) {
				Static609.aClass110Array1[local8] = Static92.method1527(Static438.anInt7120, Static98.anInt361);
			}
		}
		if (Static197.aClass159_1 == Static245.aClass159_9) {
			Static142.aClass362_32 = Static270.method4006(false, 8, 1);
			Static653.aClass362_153 = Static270.method4006(false, 0, 1);
			Static139.aClass362_84 = Static270.method4006(false, 1, 1);
			Static532.aClass362_114 = Static270.method4006(false, 2, 1);
			Static33.aClass362_118 = Static270.method4006(false, 3, 1);
			Static201.aClass362_43 = Static270.method4006(false, 4, 1);
			Static405.aClass362_87 = Static270.method4006(true, 5, 1);
			Static214.aClass362_141 = Static270.method4006(true, 6, 1);
			Static420.aClass362_91 = Static270.method4006(false, 7, 1);
			Static615.aClass362_147 = Static270.method4006(false, 9, 1);
			Static69.aClass362_140 = Static270.method4006(false, 10, 1);
			Static459.aClass362_101 = Static270.method4006(false, 11, 1);
			Static413.aClass362_88 = Static270.method4006(false, 12, 1);
			Static585.aClass362_139 = Static270.method4006(false, 14, 1);
			Static442.aClass362_97 = Static270.method4006(false, 15, 1);
			Static666.aClass362_154 = Static270.method4006(false, 16, 1);
			Static195.aClass362_41 = Static270.method4006(false, 17, 1);
			Static354.aClass362_73 = Static270.method4006(false, 18, 1);
			Static117.aClass362_22 = Static270.method4006(false, 19, 1);
			Static216.aClass362_46 = Static270.method4006(false, 20, 1);
			Static617.aClass362_78 = Static270.method4006(false, 21, 1);
			Static302.aClass362_60 = Static270.method4006(false, 22, 1);
			Static305.aClass362_61 = Static270.method4006(true, 23, 1);
			Static419.aClass362_90 = Static270.method4006(false, 24, 1);
			Static226.aClass362_48 = Static270.method4006(false, 25, 1);
			Static368.aClass362_75 = Static270.method4006(true, 26, 1);
			Static344.aClass362_72 = Static270.method4006(false, 27, 1);
			Static610.aClass362_143 = Static270.method4006(true, 28, 1);
			Static532.aClass362_115 = Static270.method4006(false, 29, 1);
			Static523.aClass362_112 = Static270.method4006(true, 30, 1);
			Static545.aClass362_122 = Static270.method4006(true, 31, 1);
			Static261.aClass362_54 = Static270.method4006(true, 36, 2);
		}
		if (Static197.aClass159_1 == Static245.aClass159_10) {
			local8 = 0;
			for (local62 = 0; local62 < 37; local62++) {
				if (Static84.aClass229_Sub1Array1[local62] != null) {
					local8 += Static84.aClass229_Sub1Array1[local62].method5291() * Static217.anIntArray547[local62] / 100;
				}
			}
			if (local8 != 100) {
				if (Static360.anInt6167 < 0) {
					Static360.anInt6167 = local8;
				}
				return (local8 - Static360.anInt6167) * 100 / (100 - Static360.anInt6167);
			}
			Static178.method2802(Static142.aClass362_32);
			Static558.method7351(Static583.aClass362_138, Static142.aClass362_32, Static650.method8730());
		}
		if (Static245.aClass159_11 == Static197.aClass159_1) {
			if (Static339.anInt5830 == -1) {
				Static339.anInt5830 = Static214.aClass362_141.method8353("scape main");
			}
			Static310.method4469();
			Static279.method4069(2);
		}
		if (Static197.aClass159_1 == Static245.aClass159_12) {
			Static403.method8657(Static566.aClass92_6, Static523.aClass362_112);
		}
		if (Static245.aClass159_13 == Static197.aClass159_1) {
			local8 = Static65.method1163();
			if (local8 < 100) {
				return local8;
			}
			Static150.method2436(Static610.aClass362_143.method8356(1));
			Static620.method8392(Static610.aClass362_143.method8356(3));
			Static111.aClass279_1 = new Class279(Static610.aClass362_143);
		}
		if (Static197.aClass159_1 == Static245.aClass159_14) {
			if (Static26.anInt627 != -1 && !Static420.aClass362_91.method8354(Static26.anInt627, 0)) {
				return 99;
			}
			Static559.anInterface2_11 = new Class360(Static368.aClass362_75, Static615.aClass362_147, Static142.aClass362_32);
			Static389.aClass335_2 = new Class335(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static461.aClass223_42 = new Class223(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114, Static111.aClass279_1);
			Static598.aClass175_2 = new Class175(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114, Static142.aClass362_32);
			Static597.aClass311_1 = new Class311(Static227.aClass203_4, Static654.anInt10668, Static195.aClass362_41);
			Static267.aClass37_3 = new Class37(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static543.aClass59_3 = new Class59(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static32.aClass65_1 = new Class65(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114, Static142.aClass362_32);
			Static538.aClass114_2 = new Class114(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114, Static420.aClass362_91);
			Static578.aClass230_1 = new Class230(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static148.aClass320_1 = new Class320(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static466.aClass340_6 = new Class340(Static227.aClass203_4, Static654.anInt10668, true, Static666.aClass362_154, Static420.aClass362_91);
			Static61.aClass378_1 = new Class378(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114, Static142.aClass362_32);
			Static33.aClass208_11 = new Class208(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114, Static142.aClass362_32);
			Static267.aClass196_1 = new Class196(Static227.aClass203_4, Static654.anInt10668, true, Static354.aClass362_73, Static420.aClass362_91);
			Static117.aClass197_2 = new Class197(Static227.aClass203_4, Static654.anInt10668, true, Static389.aClass335_2, Static117.aClass362_22, Static420.aClass362_91);
			Static256.aClass303_1 = new Class303(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static13.aClass213_1 = new Class213(Static227.aClass203_4, Static654.anInt10668, Static216.aClass362_46, Static653.aClass362_153, Static139.aClass362_84);
			Static73.aClass64_3 = new Class64(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static300.aClass332_1 = new Class332(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static366.aClass182_2 = new Class182(Static227.aClass203_4, Static654.anInt10668, Static617.aClass362_78, Static420.aClass362_91);
			Static88.aClass273_1 = new Class273(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static22.aClass40_1 = new Class40(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static357.aClass328_1 = new Class328(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static400.aClass36_1 = new Class36(Static227.aClass203_4, Static654.anInt10668, Static302.aClass362_60);
			Static530.aClass237_1 = new Class237(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static286.aClass319_1 = new Class319(Static227.aClass203_4, Static654.anInt10668, Static532.aClass362_114);
			Static464.method6196(Static420.aClass362_91, Static33.aClass362_118, Static583.aClass362_138, Static142.aClass362_32);
			Static629.method8498(Static532.aClass362_115);
			Static107.aClass116_1 = new Class116(Static654.anInt10668, Static419.aClass362_90, Static226.aClass362_48);
			Static116.aClass284_1 = new Class284(Static654.anInt10668, Static419.aClass362_90, Static226.aClass362_48, new Class30());
			Static437.method5972();
			Static466.aClass340_6.method7668(aClass3_Sub41_18.aClass14_Sub25_1.method6576() == 0);
			Static210.aClass262_1 = new Class262();
			Static136.method2278();
			Static652.method8747(Static344.aClass362_72);
			Static122.method1839(Static420.aClass362_91, Static559.anInterface2_11);
			@Pc(979) Class264 local979 = new Class264(Static69.aClass362_140.method8369("", "huffman"));
			Static170.method2691(local979);
			try {
				jagmisc.init();
			} catch (@Pc(986) Throwable local986) {
			}
			Static152.aClass12_12 = Static310.method4467();
			Static395.aClass3_Sub28_1 = new Class3_Sub28(true, Static566.aClass92_6);
		}
		if (Static245.aClass159_16 == Static197.aClass159_1) {
			local8 = Static352.method5110(Static142.aClass362_32) + Static128.method1921(true);
			local62 = Static93.method1604() + Static281.method4096();
			if (local8 < local62) {
				return local8 * 100 / local62;
			}
		}
		if (Static197.aClass159_1 == Static245.aClass159_17) {
			Static671.method7623(Static305.aClass362_61, Static267.aClass37_3, Static543.aClass59_3, Static466.aClass340_6, Static61.aClass378_1, Static33.aClass208_11, Static210.aClass262_1);
		}
		if (Static245.aClass159_18 == Static197.aClass159_1) {
			Static484.anIntArray417 = new int[Static357.aClass328_1.anInt9065];
			Static373.aBooleanArray21 = new boolean[Static357.aClass328_1.anInt9065];
			Static364.aStringArray42 = new String[Static22.aClass40_1.anInt1175];
			for (local8 = 0; local8 < Static357.aClass328_1.anInt9065; local8++) {
				if (Static357.aClass328_1.method7384(local8).anInt7377 == 0) {
					Static373.aBooleanArray21[local8] = true;
					Static245.anInt4344++;
				}
				Static484.anIntArray417[local8] = -1;
			}
			Static619.method8380();
			Static104.anInt2019 = Static33.aClass362_118.method8353("loginscreen");
			Static335.anInt5741 = Static33.aClass362_118.method8353("lobbyscreen");
			Static405.aClass362_87.method8349(false);
			Static214.aClass362_141.method8349(true);
			Static142.aClass362_32.method8349(true);
			Static583.aClass362_138.method8349(true);
			Static69.aClass362_140.method8349(true);
			Static33.aClass362_118.method8349(true);
			Static402.aBoolean460 = true;
			Static532.aClass362_114.anInt10235 = 2;
			Static195.aClass362_41.anInt10235 = 2;
			Static666.aClass362_154.anInt10235 = 2;
			Static354.aClass362_73.anInt10235 = 2;
			Static117.aClass362_22.anInt10235 = 2;
			Static216.aClass362_46.anInt10235 = 2;
			Static617.aClass362_78.anInt10235 = 2;
		}
		if (Static245.aClass159_19 == Static197.aClass159_1) {
			if (!Static185.method2900(Static104.anInt2019)) {
				return 0;
			}
			local155 = true;
			for (local62 = 0; local62 < Static270.aClass265ArrayArray2[Static104.anInt2019].length; local62++) {
				@Pc(1175) Class265 local1175 = Static270.aClass265ArrayArray2[Static104.anInt2019][local62];
				if (local1175.anInt6967 == 5 && local1175.anInt7012 != -1 && !Static142.aClass362_32.method8354(local1175.anInt7012, 0)) {
					local155 = false;
				}
			}
			if (!local155) {
				return 0;
			}
		}
		if (Static245.aClass159_20 == Static197.aClass159_1) {
			Static24.method561(true);
		}
		if (Static245.aClass159_21 == Static197.aClass159_1) {
			Static74.aClass191_1.method4364();
			try {
				Static382.aThread4.join();
			} catch (@Pc(1221) InterruptedException local1221) {
				return 0;
			}
			Static392.aClass362_83 = null;
			Static40.anInterface13Array1 = null;
			Static382.aThread4 = null;
			Static676.aClass362_155 = null;
			Static388.aClass109_1 = null;
			Static74.aClass191_1 = null;
			Static281.method4097();
			Static556.aBoolean627 = aClass3_Sub41_18.aClass14_Sub12_1.method3863() == 1;
			aClass3_Sub41_18.method6705(1, aClass3_Sub41_18.aClass14_Sub12_1);
			if (Static556.aBoolean627) {
				aClass3_Sub41_18.method6705(0, aClass3_Sub41_18.aClass14_Sub7_1);
			} else if (aClass3_Sub41_18.aClass14_Sub7_1.aBoolean249 && Static395.aClass3_Sub28_1.anInt4590 < 512 && Static395.aClass3_Sub28_1.anInt4590 != 0) {
				aClass3_Sub41_18.method6705(0, aClass3_Sub41_18.aClass14_Sub7_1);
			}
			Static219.method3247();
			if (Static556.aBoolean627) {
				Static168.method2665(false, 0);
			} else {
				Static168.method2665(false, aClass3_Sub41_18.aClass14_Sub7_1.method2899());
			}
			Static551.method7076(false, aClass3_Sub41_18.aClass14_Sub13_2.method4048(), -1, -1);
			Static78.method1307(Static119.aClass95_4);
			Static285.method4140(Static119.aClass95_4);
			Static411.method5618(Static142.aClass362_32, Static119.aClass95_4);
			Static365.method5251(Static266.aClass6Array8);
		}
		return Static545.method6994();
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZI)Z")
	public static boolean method4917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static258.method3864(arg1, arg0) || Static559.method7378(arg1, arg0);
	}
}
