import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!mfa", name = "m", descriptor = "Lclient!we;")
	public static final Class373 aClass373_7 = new Class373();

	@OriginalMember(owner = "client!mfa", name = "n", descriptor = "I")
	public static int anInt5748 = 0;

	@OriginalMember(owner = "client!mfa", name = "o", descriptor = "Z")
	public static boolean aBoolean417 = true;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V")
	public static void method5106() {
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub6_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub6_2);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub12_2);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub12_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub20_1);
		Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub10_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub7_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub21_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub26_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub29_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub16_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub17_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub25_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub2_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub23_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub23_2);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub9_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub28_1);
		Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub3_1);
		Static136.method2007();
		Static97.aClass5_Sub25_8.method3683(2, Static97.aClass5_Sub25_8.aClass6_Sub27_1);
		Static97.aClass5_Sub25_8.method3683(2, Static97.aClass5_Sub25_8.aClass6_Sub1_1);
		Static542.method7940();
		Static507.method7588();
		Static532.aBoolean663 = true;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)I")
	public static int method5107() {
		@Pc(12) int local12;
		if (Static97.aClass5_Sub25_8.aClass6_Sub13_1.method4101() == 0) {
			for (local12 = 0; local12 < Static61.anInt9889; local12++) {
				if (Static327.anInterface1Array2[local12].method7648() == 's' || Static327.anInterface1Array2[local12].method7648() == 'S') {
					Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub13_1);
					Static56.aBoolean64 = true;
					break;
				}
			}
		}
		@Pc(56) int local56;
		if (Static505.aClass277_22 == Static437.aClass277_1) {
			@Pc(47) Runtime local47 = Runtime.getRuntime();
			local56 = (int) ((local47.totalMemory() - local47.freeMemory()) / 1024L);
			@Pc(59) long local59 = Static95.method1587();
			if (Static183.aLong89 == 0L) {
				Static183.aLong89 = local59;
			}
			if (local56 > 16384 && local59 - Static183.aLong89 < 5000L) {
				if (local59 - Static172.aLong86 > 1000L) {
					System.gc();
					Static172.aLong86 = local59;
				}
				return 0;
			}
		}
		if (Static505.aClass277_22 == Static437.aClass277_2) {
			if (Static562.aClass237_2 == null) {
				Static562.aClass237_2 = new Class237(Static1.aClass309_7, Static593.aClass161_3, Static204.aBigInteger5, Static45.aBigInteger1);
			}
			if (!Static562.aClass237_2.method5275()) {
				return 0;
			}
			Static488.method7201(true, 0, null);
			Static315.aBoolean474 = !Static566.method8224();
			Static458.aClass207_94 = Static628.method8889(1, false, Static315.aBoolean474 ? 34 : 32);
			Static618.aClass207_127 = Static628.method8889(1, false, 33);
			Static40.aClass207_73 = Static628.method8889(1, false, 13);
		}
		@Pc(148) boolean local148;
		if (Static437.aClass277_3 == Static505.aClass277_22) {
			local148 = Static618.aClass207_127.method4689();
			local56 = Static72.aClass229_Sub1Array1[33].method5073();
			local56 += Static72.aClass229_Sub1Array1[Static315.aBoolean474 ? 34 : 32].method5073();
			local56 += Static72.aClass229_Sub1Array1[13].method5073();
			local56 += local148 ? 100 : Static618.aClass207_127.method4694();
			if (local56 != 400) {
				return local56 / 4;
			}
			Static436.anInt7500 = Static458.aClass207_94.method4691();
			Static116.anInt5367 = Static618.aClass207_127.method4691();
			Static8.method5383(Static458.aClass207_94);
			@Pc(209) int local209 = Static97.aClass5_Sub25_8.aClass6_Sub4_1.method915();
			Static294.aClass11_1 = new Class11(Static156.aClass63_2, Static266.anInt4796, Static618.aClass207_127);
			@Pc(221) int[] local221 = Static294.aClass11_1.method219(local209);
			if (local221.length == 0) {
				local221 = Static294.aClass11_1.method219(0);
			}
			@Pc(235) Class134 local235 = new Class134(Static458.aClass207_94, Static40.aClass207_73);
			if (local221.length > 0) {
				Static9.anInterface2Array1 = new Interface2[local221.length];
				for (@Pc(247) int local247 = 0; local247 < Static9.anInterface2Array1.length; local247++) {
					Static9.anInterface2Array1[local247] = new Class179(Static294.aClass11_1.method217(local221[local247]), local235);
				}
			}
		}
		if (Static505.aClass277_22 == Static437.aClass277_4) {
			Static261.method4264(Static40.aClass207_73, Static458.aClass207_94, Static37.method570());
		}
		if (Static505.aClass277_22 == Static437.aClass277_5) {
			local12 = Static48.method833();
			local56 = Static77.method1351();
			if (local56 > local12) {
				return local12 * 100 / local56;
			}
		}
		if (Static505.aClass277_22 == Static437.aClass277_6) {
			if (Static9.anInterface2Array1 != null && Static9.anInterface2Array1.length > 0) {
				if (Static9.anInterface2Array1[0].method8793() < 100) {
					return 0;
				}
				if (Static9.anInterface2Array1.length > 1 && Static294.aClass11_1.method221() && Static9.anInterface2Array1[1].method8793() < 100) {
					return 0;
				}
			}
			Static315.method6060(Static213.aClass133_5);
			Static567.method8235(Static213.aClass133_5);
			Static358.method5312(1);
		}
		if (Static505.aClass277_22 == Static437.aClass277_7) {
			for (local12 = 0; local12 < 4; local12++) {
				Static322.aClass352Array1[local12] = Static70.method1148(Static448.anInt7637, Static326.anInt5541);
			}
		}
		if (Static505.aClass277_22 == Static437.aClass277_8) {
			Static441.aClass207_89 = Static628.method8889(1, false, 8);
			Static246.aClass207_55 = Static628.method8889(1, false, 0);
			Static493.aClass207_104 = Static628.method8889(1, false, 1);
			Static141.aClass207_30 = Static628.method8889(1, false, 2);
			Static146.aClass207_31 = Static628.method8889(1, false, 3);
			Static503.aClass207_106 = Static628.method8889(1, false, 4);
			Static17.aClass207_6 = Static628.method8889(1, true, 5);
			Static151.aClass207_34 = Static628.method8889(1, true, 6);
			Static348.aClass207_69 = Static628.method8889(1, false, 7);
			Static505.aClass207_107 = Static628.method8889(1, false, 9);
			Static602.aClass207_119 = Static628.method8889(1, false, 10);
			Static621.aClass207_130 = Static628.method8889(1, false, 11);
			Static436.aClass207_88 = Static628.method8889(1, false, 12);
			Static610.aClass207_123 = Static628.method8889(1, false, 14);
			Static616.aClass207_125 = Static628.method8889(1, false, 15);
			Static101.aClass207_23 = Static628.method8889(1, false, 16);
			Static168.aClass207_36 = Static628.method8889(1, false, 17);
			Static509.aClass207_108 = Static628.method8889(1, false, 18);
			Static108.aClass207_25 = Static628.method8889(1, false, 19);
			Static452.aClass207_92 = Static628.method8889(1, false, 20);
			Static460.aClass207_96 = Static628.method8889(1, false, 21);
			Static189.aClass207_121 = Static628.method8889(1, false, 22);
			Static56.aClass207_16 = Static628.method8889(1, true, 23);
			Static548.aClass207_115 = Static628.method8889(1, false, 24);
			Static338.aClass207_68 = Static628.method8889(1, false, 25);
			Static102.aClass207_24 = Static628.method8889(1, true, 26);
			Static134.aClass207_29 = Static628.method8889(1, false, 27);
			Static373.aClass207_76 = Static628.method8889(1, true, 28);
			Static68.aClass207_20 = Static628.method8889(1, false, 29);
			Static262.aClass207_57 = Static628.method8889(1, true, 30);
			Static5.aClass207_2 = Static628.method8889(1, true, 31);
			Static59.aClass207_17 = Static628.method8889(2, true, 36);
		}
		if (Static437.aClass277_9 == Static505.aClass277_22) {
			local12 = 0;
			for (local56 = 0; local56 < 37; local56++) {
				if (Static72.aClass229_Sub1Array1[local56] != null) {
					local12 += Static72.aClass229_Sub1Array1[local56].method5073() * Static575.anIntArray550[local56] / 100;
				}
			}
			if (local12 != 100) {
				if (Static245.anInt9420 < 0) {
					Static245.anInt9420 = local12;
				}
				return (local12 - Static245.anInt9420) * 100 / (100 - Static245.anInt9420);
			}
			Static187.method2847(Static441.aClass207_89);
			Static261.method4264(Static40.aClass207_73, Static441.aClass207_89, Static37.method570());
		}
		if (Static505.aClass277_22 == Static437.aClass277_10) {
			if (Static464.anInt7792 == -1) {
				Static464.anInt7792 = Static151.aClass207_34.method4686("scape main");
			}
			Static440.method6674();
			Static358.method5312(2);
		}
		if (Static437.aClass277_11 == Static505.aClass277_22) {
			Static84.method1393(Static470.aClass100_14, Static262.aClass207_57);
		}
		if (Static437.aClass277_12 == Static505.aClass277_22) {
			local12 = Static457.method6823();
			if (local12 < 100) {
				return local12;
			}
			Static477.method7048(Static373.aClass207_76.method4690(1));
			Static55.method940(Static373.aClass207_76.method4690(3));
		}
		if (Static505.aClass277_22 == Static437.aClass277_13) {
			if (Static634.anInt10542 != -1 && !Static348.aClass207_69.method4697(Static634.anInt10542, 0)) {
				return 99;
			}
			Static31.anInterface3_1 = new Class205(Static102.aClass207_24, Static505.aClass207_107, Static441.aClass207_89);
			Static302.aClass291_1 = new Class291(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static147.aClass238_1 = new Class238(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static232.aClass189_2 = new Class189(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30, Static441.aClass207_89);
			Static577.aClass105_1 = new Class105(Static156.aClass63_2, Static266.anInt4796, Static168.aClass207_36);
			Static19.aClass289_1 = new Class289(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static533.aClass23_5 = new Class23(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static634.aClass372_2 = new Class372(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30, Static441.aClass207_89);
			Static387.aClass252_2 = new Class252(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30, Static348.aClass207_69);
			Static177.aClass195_1 = new Class195(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static124.aClass84_1 = new Class84(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static61.aClass246_7 = new Class246(Static156.aClass63_2, Static266.anInt4796, true, Static101.aClass207_23, Static348.aClass207_69);
			Static325.aClass42_1 = new Class42(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30, Static441.aClass207_89);
			Static586.aClass333_4 = new Class333(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30, Static441.aClass207_89);
			Static439.aClass92_2 = new Class92(Static156.aClass63_2, Static266.anInt4796, true, Static509.aClass207_108, Static348.aClass207_69);
			Static643.aClass275_2 = new Class275(Static156.aClass63_2, Static266.anInt4796, true, Static302.aClass291_1, Static108.aClass207_25, Static348.aClass207_69);
			Static508.aClass139_1 = new Class139(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static435.aClass298_1 = new Class298(Static156.aClass63_2, Static266.anInt4796, Static452.aClass207_92, Static246.aClass207_55, Static493.aClass207_104);
			Static513.aClass260_2 = new Class260(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static55.aClass191_1 = new Class191(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static52.aClass10_1 = new Class10(Static156.aClass63_2, Static266.anInt4796, Static460.aClass207_96, Static348.aClass207_69);
			Static275.aClass2_1 = new Class2(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static87.aClass135_1 = new Class135(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static17.aClass367_1 = new Class367(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static475.aClass370_1 = new Class370(Static156.aClass63_2, Static266.anInt4796, Static189.aClass207_121);
			Static299.aClass110_1 = new Class110(Static156.aClass63_2, Static266.anInt4796, Static141.aClass207_30);
			Static630.method8916(Static441.aClass207_89, Static146.aClass207_31, Static40.aClass207_73, Static348.aClass207_69);
			Static638.method9006(Static68.aClass207_20);
			Static45.aClass50_1 = new Class50(Static266.anInt4796, Static548.aClass207_115, Static338.aClass207_68);
			Static474.aClass66_2 = new Class66(Static266.anInt4796, Static548.aClass207_115, Static338.aClass207_68, new Class344());
			Static95.method1586();
			Static61.aClass246_7.method5491(Static97.aClass5_Sub25_8.aClass6_Sub6_2.method1639() == 0);
			Static301.aClass59_1 = new Class59();
			Static542.method7940();
			Static176.method2707(Static134.aClass207_29);
			Static42.method750(Static348.aClass207_69, Static31.anInterface3_1);
			@Pc(946) Class152 local946 = new Class152(Static602.aClass207_119.method4695("", "huffman"));
			Static98.method5413(local946);
			try {
				jagmisc.init();
			} catch (@Pc(953) Throwable local953) {
			}
			Static581.aClass47_1 = Static248.method4099();
			Static399.aClass5_Sub28_1 = new Class5_Sub28(true, Static470.aClass100_14);
		}
		if (Static505.aClass277_22 == Static437.aClass277_15) {
			local12 = Static325.method4933(Static441.aClass207_89) + Static464.method6866(true);
			local56 = Static317.method4849() + Static77.method1351();
			if (local56 > local12) {
				return local12 * 100 / local56;
			}
		}
		if (Static437.aClass277_16 == Static505.aClass277_22) {
			Static620.method7132(Static56.aClass207_16, Static19.aClass289_1, Static533.aClass23_5, Static61.aClass246_7, Static325.aClass42_1, Static586.aClass333_4, Static301.aClass59_1);
		}
		if (Static505.aClass277_22 == Static437.aClass277_17) {
			Static320.anIntArray291 = new int[Static17.aClass367_1.anInt10199];
			Static475.aStringArray65 = new String[Static87.aClass135_1.anInt3881];
			Static578.aBooleanArray15 = new boolean[Static17.aClass367_1.anInt10199];
			for (local12 = 0; local12 < Static17.aClass367_1.anInt10199; local12++) {
				if (Static17.aClass367_1.method8689(local12).anInt5606 == 0) {
					Static578.aBooleanArray15[local12] = true;
					Static351.anInt5903++;
				}
				Static320.anIntArray291[local12] = -1;
			}
			Static350.method8739();
			Static470.anInt9222 = Static146.aClass207_31.method4686("loginscreen");
			Static449.anInt7648 = Static146.aClass207_31.method4686("lobbyscreen");
			Static17.aClass207_6.method4677(false);
			Static151.aClass207_34.method4677(true);
			Static441.aClass207_89.method4677(true);
			Static40.aClass207_73.method4677(true);
			Static602.aClass207_119.method4677(true);
			Static146.aClass207_31.method4677(true);
			Static141.aClass207_30.anInt5242 = 2;
			Static255.aBoolean329 = true;
			Static168.aClass207_36.anInt5242 = 2;
			Static101.aClass207_23.anInt5242 = 2;
			Static509.aClass207_108.anInt5242 = 2;
			Static108.aClass207_25.anInt5242 = 2;
			Static452.aClass207_92.anInt5242 = 2;
			Static460.aClass207_96.anInt5242 = 2;
		}
		if (Static437.aClass277_18 == Static505.aClass277_22) {
			if (!Static633.method8959(Static470.anInt9222)) {
				return 0;
			}
			local148 = true;
			for (local56 = 0; local56 < Static519.aClass295ArrayArray2[Static470.anInt9222].length; local56++) {
				@Pc(1140) Class295 local1140 = Static519.aClass295ArrayArray2[Static470.anInt9222][local56];
				if (local1140.anInt8001 == 5 && local1140.anInt7984 != -1 && !Static441.aClass207_89.method4697(local1140.anInt7984, 0)) {
					local148 = false;
				}
			}
			if (!local148) {
				return 0;
			}
		}
		if (Static437.aClass277_19 == Static505.aClass277_22) {
			Static579.method8375(true);
		}
		if (Static505.aClass277_22 == Static437.aClass277_20) {
			Static299.aClass347_1.method8225();
			try {
				Static37.aThread1.join();
			} catch (@Pc(1188) InterruptedException local1188) {
				return 0;
			}
			Static458.aClass207_94 = null;
			Static299.aClass347_1 = null;
			Static9.anInterface2Array1 = null;
			Static618.aClass207_127 = null;
			Static294.aClass11_1 = null;
			Static37.aThread1 = null;
			Static623.method8837();
			Static496.aBoolean638 = Static97.aClass5_Sub25_8.aClass6_Sub13_1.method4101() == 1;
			Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub13_1);
			if (Static496.aBoolean638) {
				Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
			} else if (Static97.aClass5_Sub25_8.aClass6_Sub11_2.aBoolean320 && Static399.aClass5_Sub28_1.anInt4840 < 512 && Static399.aClass5_Sub28_1.anInt4840 != 0) {
				Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
			}
			Static273.method4418();
			if (Static496.aBoolean638) {
				Static638.method9004(0, false);
			} else {
				Static638.method9004(Static97.aClass5_Sub25_8.aClass6_Sub11_2.method3988(), false);
			}
			Static400.method5975(false, Static97.aClass5_Sub25_8.aClass6_Sub8_2.method2208(), -1, -1);
			Static315.method6060(Static213.aClass133_5);
			Static567.method8235(Static213.aClass133_5);
			Static48.method831(Static441.aClass207_89, Static213.aClass133_5);
			Static473.method7014(Static562.aClass28Array15);
		}
		return Static404.method6044();
	}
}
