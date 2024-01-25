import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!sw", name = "q", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_126 = new Class71(26, 12);

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "I")
	public static int anInt9157 = 0;

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(Z)I")
	public static int method7483() {
		@Pc(12) int local12;
		if (Static155.aClass8_Sub25_6.aClass36_Sub28_1.method8299() == 0) {
			for (local12 = 0; local12 < Static122.anInt3320; local12++) {
				if (Static547.anInterface21Array2[local12].method3239() == 's' || Static547.anInterface21Array2[local12].method3239() == 'S') {
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub28_1, 1);
					Static636.aBoolean754 = true;
					break;
				}
			}
		}
		@Pc(63) int local63;
		if (Static88.aClass296_2 == Static490.aClass296_3) {
			@Pc(53) Runtime local53 = Runtime.getRuntime();
			local63 = (int) ((local53.totalMemory() - local53.freeMemory()) / 1024L);
			@Pc(66) long local66 = Static342.method5463();
			if (Static456.aLong219 == 0L) {
				Static456.aLong219 = local66;
			}
			if (local63 > 16384 && local66 - Static456.aLong219 < 5000L) {
				if (local66 - Static573.aLong259 > 1000L) {
					System.gc();
					Static573.aLong259 = local66;
				}
				return 0;
			}
		}
		if (Static88.aClass296_2 == Static490.aClass296_4) {
			if (Static613.aClass164_1 == null) {
				Static613.aClass164_1 = new Class164(Static499.aClass113_3, Static508.aClass239_3, Static125.aBigInteger8, Static248.aBigInteger5);
			}
			if (!Static613.aClass164_1.method4611()) {
				return 0;
			}
			Static40.method1286(true, 0, null);
			Static81.aBoolean186 = !Static92.method2158();
			Static292.aClass237_80 = Static601.method8271(false, 1, Static81.aBoolean186 ? 34 : 32);
			Static533.aClass237_129 = Static601.method8271(false, 1, 33);
			Static264.aClass237_69 = Static601.method8271(false, 1, 13);
		}
		@Pc(157) boolean local157;
		if (Static88.aClass296_2 == Static490.aClass296_5) {
			local157 = Static533.aClass237_129.method6312();
			local63 = Static357.aClass210_Sub1Array3[33].method5507();
			local63 += Static357.aClass210_Sub1Array3[Static81.aBoolean186 ? 34 : 32].method5507();
			local63 += Static357.aClass210_Sub1Array3[13].method5507();
			local63 += local157 ? 100 : Static533.aClass237_129.method6320();
			if (local63 != 400) {
				return local63 / 4;
			}
			Static366.anInt6951 = Static292.aClass237_80.method6322();
			Static322.anInt6494 = Static533.aClass237_129.method6322();
			Static155.method3156(Static292.aClass237_80);
			@Pc(216) int local216 = Static155.aClass8_Sub25_6.aClass36_Sub10_1.method4062();
			Static607.aClass117_2 = new Class117(Static18.aClass217_1, Static372.anInt7083, Static533.aClass237_129);
			@Pc(228) int[] local228 = Static607.aClass117_2.method3386(local216);
			if (local228.length == 0) {
				local228 = Static607.aClass117_2.method3386(0);
			}
			@Pc(242) Class201 local242 = new Class201(Static292.aClass237_80, Static264.aClass237_69);
			if (local228.length > 0) {
				Static229.anInterface18Array1 = new Interface18[local228.length];
				for (@Pc(251) int local251 = 0; local251 < Static229.anInterface18Array1.length; local251++) {
					Static229.anInterface18Array1[local251] = new Class225(Static607.aClass117_2.method3388(local228[local251]), local242);
				}
			}
		}
		if (Static490.aClass296_6 == Static88.aClass296_2) {
			Static27.method980(Static292.aClass237_80, Static440.method6799(), Static264.aClass237_69);
		}
		if (Static88.aClass296_2 == Static490.aClass296_7) {
			local12 = Static593.method8191();
			local63 = Static312.method5159();
			if (local12 < local63) {
				return local12 * 100 / local63;
			}
		}
		if (Static88.aClass296_2 == Static490.aClass296_8) {
			if (Static229.anInterface18Array1 != null && Static229.anInterface18Array1.length > 0) {
				if (Static229.anInterface18Array1[0].method8413() < 100) {
					return 0;
				}
				if (Static229.anInterface18Array1.length > 1 && Static607.aClass117_2.method3387() && Static229.anInterface18Array1[1].method8413() < 100) {
					return 0;
				}
			}
			Static120.method2694(Static171.aClass16_5);
			Static94.method5140(Static171.aClass16_5);
			Static63.method1687(1);
		}
		if (Static88.aClass296_2 == Static490.aClass296_9) {
			for (local12 = 0; local12 < 4; local12++) {
				Static204.aClass48Array1[local12] = Static513.method7387(Static218.anInt5023, Static372.anInt7082);
			}
		}
		if (Static490.aClass296_10 == Static88.aClass296_2) {
			Static630.aClass237_149 = Static601.method8271(false, 1, 8);
			Static406.aClass237_108 = Static601.method8271(false, 1, 0);
			Static70.aClass237_23 = Static601.method8271(false, 1, 1);
			Static205.aClass237_57 = Static601.method8271(false, 1, 2);
			Static271.aClass237_72 = Static601.method8271(false, 1, 3);
			Static131.aClass237_38 = Static601.method8271(false, 1, 4);
			Static140.aClass237_41 = Static601.method8271(true, 1, 5);
			Static628.aClass237_148 = Static601.method8271(true, 1, 6);
			Static517.aClass237_125 = Static601.method8271(false, 1, 7);
			Static8.aClass237_3 = Static601.method8271(false, 1, 9);
			Static51.aClass237_16 = Static601.method8271(false, 1, 10);
			Static393.aClass237_102 = Static601.method8271(false, 1, 11);
			Static112.aClass237_30 = Static601.method8271(false, 1, 12);
			Static398.aClass237_105 = Static601.method8271(false, 1, 14);
			Static547.aClass237_132 = Static601.method8271(false, 1, 15);
			Static385.aClass237_139 = Static601.method8271(false, 1, 16);
			Static154.aClass237_13 = Static601.method8271(false, 1, 17);
			Static498.aClass237_122 = Static601.method8271(false, 1, 18);
			Static31.aClass237_10 = Static601.method8271(false, 1, 19);
			Static626.aClass237_147 = Static601.method8271(false, 1, 20);
			Static484.aClass237_117 = Static601.method8271(false, 1, 21);
			Static478.aClass237_116 = Static601.method8271(false, 1, 22);
			Static50.aClass237_15 = Static601.method8271(true, 1, 23);
			Static13.aClass237_124 = Static601.method8271(false, 1, 24);
			Static603.aClass237_144 = Static601.method8271(false, 1, 25);
			Static155.aClass237_48 = Static601.method8271(true, 1, 26);
			Static127.aClass237_33 = Static601.method8271(false, 1, 27);
			Static394.aClass237_103 = Static601.method8271(true, 1, 28);
			Static543.aClass237_131 = Static601.method8271(false, 1, 29);
			Static177.aClass237_44 = Static601.method8271(true, 1, 30);
			Static636.aClass237_150 = Static601.method8271(true, 1, 31);
			Static272.aClass237_73 = Static601.method8271(true, 2, 36);
		}
		if (Static88.aClass296_2 == Static490.aClass296_11) {
			local12 = 0;
			for (local63 = 0; local63 < 37; local63++) {
				if (Static357.aClass210_Sub1Array3[local63] != null) {
					local12 += Static357.aClass210_Sub1Array3[local63].method5507() * Static294.anIntArray350[local63] / 100;
				}
			}
			if (local12 != 100) {
				if (Static422.anInt7947 < 0) {
					Static422.anInt7947 = local12;
				}
				return (local12 - Static422.anInt7947) * 100 / (100 - Static422.anInt7947);
			}
			Static470.method7027(Static630.aClass237_149);
			Static27.method980(Static630.aClass237_149, Static440.method6799(), Static264.aClass237_69);
		}
		if (Static490.aClass296_12 == Static88.aClass296_2) {
			if (Static282.anInt5836 == -1) {
				Static282.anInt5836 = Static628.aClass237_148.method6307("scape main");
			}
			Static306.method5062();
			Static63.method1687(2);
		}
		if (Static490.aClass296_13 == Static88.aClass296_2) {
			Static32.method1191(Static177.aClass237_44, Static51.aClass118_1);
		}
		if (Static490.aClass296_14 == Static88.aClass296_2) {
			local12 = Static103.method2363();
			if (local12 < 100) {
				return local12;
			}
			Static289.method4829(Static394.aClass237_103.method6305(1));
			Static174.method3392(Static394.aClass237_103.method6305(3));
		}
		if (Static88.aClass296_2 == Static490.aClass296_15) {
			if (Static574.anInt9869 != -1 && !Static517.aClass237_125.method6326(Static574.anInt9869, 0)) {
				return 99;
			}
			Static118.anInterface2_10 = new Class135(Static155.aClass237_48, Static8.aClass237_3, Static630.aClass237_149);
			Static144.aClass274_1 = new Class274(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static472.aClass202_4 = new Class202(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static454.aClass166_2 = new Class166(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57, Static630.aClass237_149);
			Static592.aClass95_1 = new Class95(Static18.aClass217_1, Static372.anInt7083, Static154.aClass237_13);
			Static566.aClass369_6 = new Class369(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static627.aClass107_5 = new Class107(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static314.aClass79_1 = new Class79(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57, Static517.aClass237_125);
			Static446.aClass92_3 = new Class92(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static543.aClass364_1 = new Class364(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static437.aClass199_3 = new Class199(Static18.aClass217_1, Static372.anInt7083, true, Static385.aClass237_139, Static517.aClass237_125);
			Static612.aClass12_4 = new Class12(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57, Static630.aClass237_149);
			Static76.aClass67_1 = new Class67(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57, Static630.aClass237_149);
			Static297.aClass338_1 = new Class338(Static18.aClass217_1, Static372.anInt7083, true, Static498.aClass237_122, Static517.aClass237_125);
			Static497.aClass258_21 = new Class258(Static18.aClass217_1, Static372.anInt7083, true, Static144.aClass274_1, Static31.aClass237_10, Static517.aClass237_125);
			Static216.aClass356_1 = new Class356(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static28.aClass220_1 = new Class220(Static18.aClass217_1, Static372.anInt7083, Static626.aClass237_147, Static406.aClass237_108, Static70.aClass237_23);
			Static527.aClass321_1 = new Class321(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static274.aClass270_1 = new Class270(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static202.aClass333_2 = new Class333(Static18.aClass217_1, Static372.anInt7083, Static484.aClass237_117, Static517.aClass237_125);
			Static6.aClass233_1 = new Class233(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static548.aClass195_1 = new Class195(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static420.aClass128_1 = new Class128(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static418.aClass293_1 = new Class293(Static18.aClass217_1, Static372.anInt7083, Static478.aClass237_116);
			Static198.aClass161_1 = new Class161(Static18.aClass217_1, Static372.anInt7083, Static205.aClass237_57);
			Static490.method7184(Static264.aClass237_69, Static517.aClass237_125, Static271.aClass237_72, Static630.aClass237_149);
			Static319.method5214(Static543.aClass237_131);
			Static240.aClass208_1 = new Class208(Static372.anInt7083, Static13.aClass237_124, Static603.aClass237_144);
			Static105.aClass49_1 = new Class49(Static372.anInt7083, Static13.aClass237_124, Static603.aClass237_144, new Class37());
			Static613.method8355();
			Static437.aClass199_3.method5343(Static155.aClass8_Sub25_6.aClass36_Sub13_1.method4838() == 0);
			Static420.aClass77_1 = new Class77();
			Static180.method3451();
			Static622.method8406(Static127.aClass237_33);
			Static446.method6498(Static517.aClass237_125, Static118.anInterface2_10);
			@Pc(941) Class33 local941 = new Class33(Static51.aClass237_16.method6304("huffman", ""));
			Static569.method7905(local941);
			try {
				jagmisc.init();
			} catch (@Pc(948) Throwable local948) {
			}
			Static538.aClass109_1 = Static399.method6348();
			Static38.aClass8_Sub15_1 = new Class8_Sub15(true, Static51.aClass118_1);
		}
		if (Static490.aClass296_17 == Static88.aClass296_2) {
			local12 = Static390.method6239(Static630.aClass237_149) + Static26.method975(true);
			local63 = Static470.method7022() + Static312.method5159();
			if (local12 < local63) {
				return local12 * 100 / local63;
			}
		}
		if (Static490.aClass296_18 == Static88.aClass296_2) {
			Static110.method6393(Static50.aClass237_15, Static566.aClass369_6, Static627.aClass107_5, Static437.aClass199_3, Static612.aClass12_4, Static76.aClass67_1, Static420.aClass77_1);
		}
		if (Static88.aClass296_2 == Static490.aClass296_19) {
			Static2.aStringArray12 = new String[Static548.aClass195_1.anInt6356];
			Static378.aBooleanArray19 = new boolean[Static420.aClass128_1.anInt4556];
			Static69.anIntArray417 = new int[Static420.aClass128_1.anInt4556];
			for (local12 = 0; local12 < Static420.aClass128_1.anInt4556; local12++) {
				if (Static420.aClass128_1.method3671(local12).anInt5892 == 0) {
					Static378.aBooleanArray19[local12] = true;
					Static503.anInt9960++;
				}
				Static69.anIntArray417[local12] = -1;
			}
			Static250.method4532();
			Static378.anInt7229 = Static271.aClass237_72.method6307("loginscreen");
			Static524.anInt9099 = Static271.aClass237_72.method6307("lobbyscreen");
			Static140.aClass237_41.method6318(false);
			Static628.aClass237_148.method6318(true);
			Static630.aClass237_149.method6318(true);
			Static264.aClass237_69.method6318(true);
			Static51.aClass237_16.method6318(true);
			Static271.aClass237_72.method6318(true);
			Static205.aClass237_57.anInt7642 = 2;
			Static504.aBoolean626 = true;
			Static154.aClass237_13.anInt7642 = 2;
			Static385.aClass237_139.anInt7642 = 2;
			Static498.aClass237_122.anInt7642 = 2;
			Static31.aClass237_10.anInt7642 = 2;
			Static626.aClass237_147.anInt7642 = 2;
			Static484.aClass237_117.anInt7642 = 2;
		}
		if (Static88.aClass296_2 == Static490.aClass296_20) {
			if (!Static498.method7246(Static378.anInt7229)) {
				return 0;
			}
			local157 = true;
			for (local63 = 0; local63 < Static368.aClass331ArrayArray2[Static378.anInt7229].length; local63++) {
				@Pc(1128) Class331 local1128 = Static368.aClass331ArrayArray2[Static378.anInt7229][local63];
				if (local1128.anInt9490 == 5 && local1128.anInt9577 != -1 && !Static630.aClass237_149.method6326(local1128.anInt9577, 0)) {
					local157 = false;
				}
			}
			if (!local157) {
				return 0;
			}
		}
		if (Static490.aClass296_21 == Static88.aClass296_2) {
			Static352.method5561(true);
		}
		if (Static490.aClass296_22 == Static88.aClass296_2) {
			Static609.aClass42_3.method1409();
			try {
				Static156.aThread1.join();
			} catch (@Pc(1180) InterruptedException local1180) {
				return 0;
			}
			Static292.aClass237_80 = null;
			Static533.aClass237_129 = null;
			Static607.aClass117_2 = null;
			Static609.aClass42_3 = null;
			Static229.anInterface18Array1 = null;
			Static156.aThread1 = null;
			Static492.method7196();
			Static216.aBoolean373 = Static155.aClass8_Sub25_6.aClass36_Sub28_1.method8299() == 1;
			Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub28_1, 1);
			if (Static216.aBoolean373) {
				Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, 0);
			} else if (Static155.aClass8_Sub25_6.aClass36_Sub19_1.aBoolean554 && Static38.aClass8_Sub15_1.anInt2575 < 512 && Static38.aClass8_Sub15_1.anInt2575 != 0) {
				Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, 0);
			}
			Static35.method7912();
			if (Static216.aBoolean373) {
				Static553.method7773(false, 0);
			} else {
				Static553.method7773(false, Static155.aClass8_Sub25_6.aClass36_Sub19_1.method6358());
			}
			Static327.method5366(-1, -1, Static155.aClass8_Sub25_6.aClass36_Sub5_1.method3307(), false);
			Static120.method2694(Static171.aClass16_5);
			Static94.method5140(Static171.aClass16_5);
			Static3.method37(Static630.aClass237_149, Static171.aClass16_5);
			Static468.method8504(Static158.aClass21Array8);
		}
		return Static373.method7303();
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)I")
	public static int method7484() {
		return Static105.anInt2774 == 1 ? Static58.anInt1883 : 0;
	}
}
