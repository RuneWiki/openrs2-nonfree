import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
	public static int anInt8407 = -1;

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBZIIII)V")
	public static void method7340(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 ? Static687.aClass6_Sub44_33.aClass7_Sub13_3.method3338() : Static687.aClass6_Sub44_33.aClass7_Sub13_5.method3338()) != 0 && arg3 != 0 && Static74.anInt1034 < 50 && arg2 != -1) {
			Static534.aClass124Array6[Static74.anInt1034++] = new Class124((byte) (arg1 ? 3 : 2), arg2, arg3, arg0, arg5, 0, arg4, (Class60_Sub1) null);
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)I")
	public static int method7341() {
		@Pc(10) int local10;
		if (Static687.aClass6_Sub44_33.aClass7_Sub21_1.method6913() == 0) {
			for (local10 = 0; local10 < Static686.anInt10489; local10++) {
				if (Static350.anInterface17Array2[local10].method8951() == 's' || Static350.anInterface17Array2[local10].method8951() == 'S') {
					Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub21_1);
					Static121.aBoolean196 = true;
					break;
				}
			}
		}
		@Pc(72) int local72;
		if (Static564.aClass331_2 == Static420.aClass331_1) {
			@Pc(63) Runtime local63 = Runtime.getRuntime();
			local72 = (int) ((local63.totalMemory() - local63.freeMemory()) / 1024L);
			@Pc(75) long local75 = Static549.method7758();
			if (Static370.aLong97 == 0L) {
				Static370.aLong97 = local75;
			}
			if (local72 > 16384 && local75 - Static370.aLong97 < 5000L) {
				if (local75 - Static656.aLong332 > 1000L) {
					System.gc();
					Static656.aLong332 = local75;
				}
				return 0;
			}
		}
		if (Static420.aClass331_1 == Static564.aClass331_3) {
			if (Static38.aClass72_1 == null) {
				Static38.aClass72_1 = new Class72(Static116.aClass189_2, Static62.aClass188_1, Static321.aBigInteger6, Static143.aBigInteger2);
			}
			if (!Static38.aClass72_1.method1357(23004)) {
				return 0;
			}
			Static92.method1338(0, (String) null, true);
			Static675.aBoolean412 = !Static17.method217();
			Static354.aClass223_76 = Static544.method7720(false, Static675.aBoolean412 ? 34 : 32, 1);
			Static589.aClass223_114 = Static544.method7720(false, 33, 1);
			Static373.aClass223_79 = Static544.method7720(false, 13, 1);
		}
		@Pc(184) boolean local184;
		if (Static564.aClass331_4 == Static420.aClass331_1) {
			local184 = Static589.aClass223_114.method5273();
			local72 = Static16.aClass21_Sub1Array1[33].method4626();
			local72 += Static16.aClass21_Sub1Array1[Static675.aBoolean412 ? 34 : 32].method4626();
			local72 += Static16.aClass21_Sub1Array1[13].method4626();
			local72 += local184 ? 100 : Static589.aClass223_114.method5263();
			if (local72 != 400) {
				return local72 / 4;
			}
			Static324.anInt5598 = Static354.aClass223_76.method5253();
			Static470.anInt8041 = Static589.aClass223_114.method5253();
			Static463.method8203(Static354.aClass223_76);
			@Pc(248) int local248 = Static687.aClass6_Sub44_33.aClass7_Sub23_1.method7151();
			Static385.aClass132_1 = new Class132(Static129.aClass121_1, Static601.anInt9518, Static589.aClass223_114);
			@Pc(260) int[] local260 = Static385.aClass132_1.method3523(local248);
			if (local260.length == 0) {
				local260 = Static385.aClass132_1.method3523(0);
			}
			@Pc(277) Class10 local277 = new Class10(Static354.aClass223_76, Static373.aClass223_79);
			if (local260.length > 0) {
				Static119.anInterface9Array1 = new Interface9[local260.length];
				for (@Pc(286) int local286 = 0; local286 < Static119.anInterface9Array1.length; local286++) {
					Static119.anInterface9Array1[local286] = new Class110(Static385.aClass132_1.method3529(local260[local286]), local277);
				}
			}
		}
		if (Static420.aClass331_1 == Static564.aClass331_5) {
			Static177.method3380(Static373.aClass223_79, Static377.method5762(), Static354.aClass223_76);
		}
		if (Static564.aClass331_6 == Static420.aClass331_1) {
			local10 = Static518.method7498();
			local72 = Static676.method8939();
			if (local10 < local72) {
				return local10 * 100 / local72;
			}
		}
		if (Static564.aClass331_7 == Static420.aClass331_1) {
			if (Static119.anInterface9Array1 != null && Static119.anInterface9Array1.length > 0) {
				if (Static119.anInterface9Array1[0].method3096() < 100) {
					return 0;
				}
				if (Static119.anInterface9Array1.length > 1 && Static385.aClass132_1.method3525() && Static119.anInterface9Array1[1].method3096() < 100) {
					return 0;
				}
			}
			Static488.method7230(Static202.aClass75_5);
			Static360.method5485(Static202.aClass75_5);
			Static307.method4889(1);
		}
		if (Static420.aClass331_1 == Static564.aClass331_8) {
			for (local10 = 0; local10 < 4; local10++) {
				Static669.aClass356Array1[local10] = Static689.method9047(Static327.anInt5650, Static29.anInt380);
			}
		}
		if (Static420.aClass331_1 == Static564.aClass331_9) {
			Static583.aClass223_113 = Static544.method7720(false, 8, 1);
			Static277.aClass223_65 = Static544.method7720(false, 0, 1);
			Static116.aClass223_24 = Static544.method7720(false, 1, 1);
			Static460.aClass223_93 = Static544.method7720(false, 2, 1);
			Static675.aClass223_72 = Static544.method7720(false, 3, 1);
			Static56.aClass223_9 = Static544.method7720(false, 4, 1);
			Static194.aClass223_39 = Static544.method7720(true, 5, 1);
			Static209.aClass223_41 = Static544.method7720(true, 6, 1);
			Static517.aClass223_100 = Static544.method7720(false, 7, 1);
			Static259.aClass223_61 = Static544.method7720(false, 9, 1);
			Static120.aClass223_26 = Static544.method7720(false, 10, 1);
			Static676.aClass223_124 = Static544.method7720(false, 11, 1);
			Static314.aClass223_70 = Static544.method7720(false, 12, 1);
			Static255.aClass223_58 = Static544.method7720(false, 14, 1);
			Static322.aClass223_73 = Static544.method7720(false, 15, 1);
			Static531.aClass223_103 = Static544.method7720(false, 16, 1);
			Static57.aClass223_11 = Static544.method7720(false, 17, 1);
			Static74.aClass223_16 = Static544.method7720(false, 18, 1);
			Static479.aClass223_94 = Static544.method7720(false, 19, 1);
			Static84.aClass223_19 = Static544.method7720(false, 20, 1);
			Static317.aClass223_71 = Static544.method7720(false, 21, 1);
			Static672.aClass223_120 = Static544.method7720(false, 22, 1);
			Static482.aClass223_95 = Static544.method7720(true, 23, 1);
			Static275.aClass223_64 = Static544.method7720(false, 24, 1);
			Static373.aClass223_78 = Static544.method7720(false, 25, 1);
			Static167.aClass223_30 = Static544.method7720(true, 26, 1);
			Static681.aClass223_125 = Static544.method7720(false, 27, 1);
			Static136.aClass223_28 = Static544.method7720(true, 28, 1);
			Static253.aClass223_56 = Static544.method7720(false, 29, 1);
			Static185.aClass223_36 = Static544.method7720(true, 30, 1);
			Static377.aClass223_80 = Static544.method7720(true, 31, 1);
			Static338.aClass223_74 = Static544.method7720(true, 36, 2);
		}
		if (Static564.aClass331_10 == Static420.aClass331_1) {
			local10 = 0;
			for (local72 = 0; local72 < 37; local72++) {
				if (Static16.aClass21_Sub1Array1[local72] != null) {
					local10 += Static16.aClass21_Sub1Array1[local72].method4626() * Static546.anIntArray587[local72] / 100;
				}
			}
			if (local10 != 100) {
				if (Static539.anInt8782 < 0) {
					Static539.anInt8782 = local10;
				}
				return (local10 - Static539.anInt8782) * 100 / (100 - Static539.anInt8782);
			}
			Static184.method3455(Static583.aClass223_113);
			Static177.method3380(Static373.aClass223_79, Static377.method5762(), Static583.aClass223_113);
		}
		if (Static564.aClass331_11 == Static420.aClass331_1) {
			if (Static141.anInt8739 == -1) {
				Static141.anInt8739 = Static209.aClass223_41.method5257("scape main");
			}
			Static269.method4564(-125);
			Static307.method4889(2);
		}
		if (Static564.aClass331_12 == Static420.aClass331_1) {
			Static21.method248(Static185.aClass223_36, Static651.aClass122_38);
		}
		if (Static420.aClass331_1 == Static564.aClass331_13) {
			local10 = Static566.method7361();
			if (local10 < 100) {
				return local10;
			}
			Static679.method5487(Static136.aClass223_28.method5275(1));
			Static614.method8473(Static136.aClass223_28.method5275(3));
			Static557.aClass262_1 = new Class262(Static136.aClass223_28);
		}
		if (Static564.aClass331_14 == Static420.aClass331_1) {
			if (Static226.anInt4403 != -1 && !Static517.aClass223_100.method5261(Static226.anInt4403, 0)) {
				return 99;
			}
			Static334.anInterface11_7 = new Class247(Static167.aClass223_30, Static259.aClass223_61, Static583.aClass223_113);
			Static521.aClass20_21 = new Class20(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static551.aClass392_1 = new Class392(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93, Static557.aClass262_1);
			Static319.aClass337_2 = new Class337(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93, Static583.aClass223_113);
			Static146.aClass32_1 = new Class32(Static129.aClass121_1, Static601.anInt9518, Static57.aClass223_11);
			Static158.aClass245_1 = new Class245(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static471.aClass255_5 = new Class255(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static597.aClass313_2 = new Class313(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93, Static583.aClass223_113);
			Static664.aClass319_2 = new Class319(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93, Static517.aClass223_100);
			Static544.aClass233_1 = new Class233(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static378.aClass90_1 = new Class90(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static290.aClass163_5 = new Class163(Static129.aClass121_1, Static601.anInt9518, true, Static531.aClass223_103, Static517.aClass223_100);
			Static508.aClass190_3 = new Class190(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93, Static583.aClass223_113);
			Static599.aClass306_2 = new Class306(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93, Static583.aClass223_113);
			Static221.aClass164_1 = new Class164(Static129.aClass121_1, Static601.anInt9518, true, Static74.aClass223_16, Static517.aClass223_100);
			Static149.aClass244_1 = new Class244(Static129.aClass121_1, Static601.anInt9518, true, Static521.aClass20_21, Static479.aClass223_94, Static517.aClass223_100);
			Static431.aClass156_1 = new Class156(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static444.aClass68_3 = new Class68(Static129.aClass121_1, Static601.anInt9518, Static84.aClass223_19, Static277.aClass223_65, Static116.aClass223_24);
			Static227.aClass298_1 = new Class298(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static276.aClass350_1 = new Class350(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static655.aClass172_2 = new Class172(Static129.aClass121_1, Static601.anInt9518, Static317.aClass223_71, Static517.aClass223_100);
			Static143.aClass296_2 = new Class296(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static81.aClass394_1 = new Class394(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static197.aClass388_1 = new Class388(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static61.aClass335_1 = new Class335(Static129.aClass121_1, Static601.anInt9518, Static672.aClass223_120);
			Static469.aClass47_1 = new Class47(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static582.aClass367_1 = new Class367(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static338.aClass159_1 = new Class159(Static129.aClass121_1, Static601.anInt9518, Static460.aClass223_93);
			Static141.method7648(Static517.aClass223_100, Static675.aClass223_72, Static373.aClass223_79, Static583.aClass223_113);
			Static579.method8062(Static253.aClass223_56);
			Static457.aClass48_1 = new Class48(Static601.anInt9518, Static275.aClass223_64, Static373.aClass223_78);
			Static35.aClass276_1 = new Class276(Static601.anInt9518, Static275.aClass223_64, Static373.aClass223_78, new Class139());
			Static208.method3831();
			Static290.aClass163_5.method4117(Static687.aClass6_Sub44_33.aClass7_Sub6_1.method926() == 0);
			Static303.aClass55_2 = new Class55();
			Static423.method6439();
			Static610.method8415(Static444.aClass68_3);
			Static115.method2160(Static681.aClass223_125);
			Static573.method8011(Static517.aClass223_100, Static334.anInterface11_7);
			@Pc(1089) Class157 local1089 = new Class157(Static120.aClass223_26.method5284("huffman", ""));
			Static328.method5135(local1089);
			try {
				jagmisc.init();
			} catch (@Pc(1096) Throwable local1096) {
			}
			Static125.aClass29_1 = Static159.method3130();
			Static192.aClass6_Sub1_1 = new Class6_Sub1(true, Static651.aClass122_38);
		}
		if (Static420.aClass331_1 == Static564.aClass331_16) {
			local10 = Static78.method1065(Static583.aClass223_113) + Static427.method6510(true, -17827);
			local72 = Static185.method3482() + Static676.method8939();
			if (local72 > local10) {
				return local10 * 100 / local72;
			}
		}
		if (Static564.aClass331_17 == Static420.aClass331_1) {
			Static627.method6470(Static482.aClass223_95, Static158.aClass245_1, Static471.aClass255_5, Static290.aClass163_5, Static508.aClass190_3, Static599.aClass306_2, Static303.aClass55_2);
		}
		if (Static564.aClass331_18 == Static420.aClass331_1) {
			Static592.aStringArray37 = new String[Static81.aClass394_1.anInt10345];
			Static333.anIntArray333 = new int[Static197.aClass388_1.anInt10254];
			Static371.aBooleanArray19 = new boolean[Static197.aClass388_1.anInt10254];
			for (local10 = 0; local10 < Static197.aClass388_1.anInt10254; local10++) {
				if (Static197.aClass388_1.method8843(local10).anInt10446 == 0) {
					Static371.aBooleanArray19[local10] = true;
					Static684.anInt10456++;
				}
				Static333.anIntArray333[local10] = -1;
			}
			Static397.method6101();
			Static194.aClass223_39.method5281(false);
			Static209.aClass223_41.method5281(true);
			Static583.aClass223_113.method5281(true);
			Static373.aClass223_79.method5281(true);
			Static120.aClass223_26.method5281(true);
			Static110.aBoolean185 = true;
			Static460.aClass223_93.anInt5858 = 2;
			Static57.aClass223_11.anInt5858 = 2;
			Static531.aClass223_103.anInt5858 = 2;
			Static74.aClass223_16.anInt5858 = 2;
			Static479.aClass223_94.anInt5858 = 2;
			Static84.aClass223_19.anInt5858 = 2;
			Static317.aClass223_71.anInt5858 = 2;
		}
		if (Static564.aClass331_19 == Static420.aClass331_1) {
			if (!Static172.method3336(Static94.anInt1386, (byte) -31)) {
				return 0;
			}
			local184 = true;
			for (local72 = 0; local72 < Static686.aClass381ArrayArray2[Static94.anInt1386].length; local72++) {
				@Pc(1278) Class381 local1278 = Static686.aClass381ArrayArray2[Static94.anInt1386][local72];
				if (local1278.anInt10156 == 5 && local1278.anInt10126 != -1 && !Static583.aClass223_113.method5261(local1278.anInt10126, 0)) {
					local184 = false;
				}
			}
			if (!local184) {
				return 0;
			}
		}
		if (Static420.aClass331_1 == Static564.aClass331_20) {
			Static283.method4692(true);
		}
		if (Static420.aClass331_1 == Static564.aClass331_21) {
			Static616.aClass339_1.method8117();
			try {
				Static203.aThread7.join();
			} catch (@Pc(1341) InterruptedException local1341) {
				return 0;
			}
			Static354.aClass223_76 = null;
			Static203.aThread7 = null;
			Static616.aClass339_1 = null;
			Static385.aClass132_1 = null;
			Static119.anInterface9Array1 = null;
			Static589.aClass223_114 = null;
			Static362.method5503();
			Static210.aBoolean335 = Static687.aClass6_Sub44_33.aClass7_Sub21_1.method6913() == 1;
			Static687.aClass6_Sub44_33.method7080(1, Static687.aClass6_Sub44_33.aClass7_Sub21_1);
			if (Static210.aBoolean335) {
				Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
			} else if (Static687.aClass6_Sub44_33.aClass7_Sub19_2.aBoolean542 && Static192.aClass6_Sub1_1.anInt39 < 512 && Static192.aClass6_Sub1_1.anInt39 != 0) {
				Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
			}
			Static392.method6007();
			if (Static210.aBoolean335) {
				Static536.method7652(false, 0);
			} else {
				Static536.method7652(false, Static687.aClass6_Sub44_33.aClass7_Sub19_2.method6431());
			}
			Static137.method2612(-1, -1, Static687.aClass6_Sub44_33.aClass7_Sub18_2.method6279(), false);
			Static488.method7230(Static202.aClass75_5);
			Static360.method5485(Static202.aClass75_5);
			Static671.method8899(Static583.aClass223_113, Static202.aClass75_5);
			Static269.method4563(Static626.aClass49Array16);
		}
		return Static214.method3878();
	}
}
