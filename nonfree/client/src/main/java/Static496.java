import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!ria", name = "E", descriptor = "I")
	public static int anInt2424;

	@OriginalMember(owner = "client!ria", name = "B", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_16 = new Class102(20);

	@OriginalMember(owner = "client!ria", name = "C", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_17 = new Class102(4);

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)I")
	public static int method2278() {
		@Pc(15) int local15;
		if (Static262.aClass3_Sub27_12.aClass21_Sub11_1.method4362() == 0) {
			for (local15 = 0; local15 < Static611.anInt9889; local15++) {
				if (Static283.anInterface5Array5[local15].method7866() == 's' || Static283.anInterface5Array5[local15].method7866() == 'S') {
					Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub11_1);
					break;
				}
			}
		}
		@Pc(71) int local71;
		if (Static523.aClass310_2 == Static582.aClass310_23) {
			@Pc(61) Runtime local61 = Runtime.getRuntime();
			local71 = (int) ((local61.totalMemory() - local61.freeMemory()) / 1024L);
			@Pc(74) long local74 = Static374.method6036();
			if (Static135.aLong65 == 0L) {
				Static135.aLong65 = local74;
			}
			if (local71 > 16384 && local74 - Static135.aLong65 < 5000L) {
				if (local74 - Static633.aLong269 > 1000L) {
					System.gc();
					Static633.aLong269 = local74;
				}
				return 0;
			}
		}
		if (Static582.aClass310_23 == Static523.aClass310_3) {
			if (Static618.aClass295_1 == null) {
				Static618.aClass295_1 = new Class295(Static365.aClass248_1, Static168.aClass266_2, Static597.aBigInteger9, Static59.aBigInteger3);
			}
			if (!Static618.aClass295_1.method7327()) {
				return 0;
			}
			Static224.method3733(true, 0, null);
			Static47.aBoolean91 = !Static20.method905();
			Static225.aClass196_102 = Static572.method8140(false, 1, Static47.aBoolean91 ? 34 : 32);
			Static306.aClass196_60 = Static572.method8140(false, 1, 33);
			Static429.aClass196_84 = Static572.method8140(false, 1, 13);
		}
		@Pc(167) boolean local167;
		if (Static523.aClass310_4 == Static582.aClass310_23) {
			local167 = Static306.aClass196_60.method5122();
			local71 = Static534.aClass147_Sub1Array2[33].method7352();
			local71 += Static534.aClass147_Sub1Array2[Static47.aBoolean91 ? 34 : 32].method7352();
			local71 += Static534.aClass147_Sub1Array2[13].method7352();
			local71 += local167 ? 100 : Static306.aClass196_60.method5112();
			if (local71 != 400) {
				return local71 / 4;
			}
			Static336.anInt6302 = Static225.aClass196_102.method5117();
			Static286.anInt5092 = Static306.aClass196_60.method5117();
			Static545.method8461(Static225.aClass196_102);
			@Pc(228) int local228 = Static262.aClass3_Sub27_12.aClass21_Sub16_1.method5997();
			Static143.aClass153_1 = new Class153(Static212.aClass222_2, Static325.anInt6083, Static306.aClass196_60);
			@Pc(240) int[] local240 = Static143.aClass153_1.method3937(local228);
			if (local240.length == 0) {
				local240 = Static143.aClass153_1.method3937(0);
			}
			@Pc(259) Class157 local259 = new Class157(Static225.aClass196_102, Static429.aClass196_84);
			if (local240.length > 0) {
				Static29.anInterface21Array1 = new Interface21[local240.length];
				for (@Pc(268) int local268 = 0; local268 < Static29.anInterface21Array1.length; local268++) {
					Static29.anInterface21Array1[local268] = new Class134(Static143.aClass153_1.method3935(local240[local268]), local259);
				}
			}
		}
		if (Static582.aClass310_23 == Static523.aClass310_5) {
			Static357.method5869(Static225.aClass196_102, Static138.method2572(), Static429.aClass196_84);
		}
		if (Static582.aClass310_23 == Static523.aClass310_6) {
			local15 = Static642.method8745();
			local71 = Static505.method7457();
			if (local15 < local71) {
				return local15 * 100 / local71;
			}
		}
		if (Static523.aClass310_7 == Static582.aClass310_23) {
			if (Static29.anInterface21Array1 != null && Static29.anInterface21Array1.length > 0) {
				if (Static29.anInterface21Array1[0].method3923() < 100) {
					return 0;
				}
				if (Static29.anInterface21Array1.length > 1 && Static143.aClass153_1.method3934() && Static29.anInterface21Array1[1].method3923() < 100) {
					return 0;
				}
			}
			Static235.method3933(Static323.aClass5_9);
			Static68.method1698(Static323.aClass5_9);
			Static256.method4279(1);
		}
		if (Static582.aClass310_23 == Static523.aClass310_8) {
			for (local15 = 0; local15 < 4; local15++) {
				Static271.aClass105Array1[local15] = Static640.method8724(Static634.anInt10129, Static638.anInt10172);
			}
		}
		if (Static582.aClass310_23 == Static523.aClass310_9) {
			Static474.aClass196_98 = Static572.method8140(false, 1, 8);
			Static571.aClass196_119 = Static572.method8140(false, 1, 0);
			Static450.aClass196_96 = Static572.method8140(false, 1, 1);
			Static351.aClass196_69 = Static572.method8140(false, 1, 2);
			Static226.aClass196_25 = Static572.method8140(false, 1, 3);
			Static294.aClass196_53 = Static572.method8140(false, 1, 4);
			Static395.aClass196_80 = Static572.method8140(true, 1, 5);
			Static336.aClass196_65 = Static572.method8140(true, 1, 6);
			Static68.aClass196_18 = Static572.method8140(false, 1, 7);
			Static297.aClass196_58 = Static572.method8140(false, 1, 9);
			Static182.aClass196_38 = Static572.method8140(false, 1, 10);
			Static29.aClass196_9 = Static572.method8140(false, 1, 11);
			Static522.aClass196_109 = Static572.method8140(false, 1, 12);
			Static342.aClass196_67 = Static572.method8140(false, 1, 14);
			Static106.aClass196_30 = Static572.method8140(false, 1, 15);
			Static557.aClass196_113 = Static572.method8140(false, 1, 16);
			Static383.aClass196_76 = Static572.method8140(false, 1, 17);
			Static368.aClass196_74 = Static572.method8140(false, 1, 18);
			Static311.aClass196_77 = Static572.method8140(false, 1, 19);
			Static11.aClass196_129 = Static572.method8140(false, 1, 20);
			Static35.aClass196_12 = Static572.method8140(false, 1, 21);
			Static384.aClass196_78 = Static572.method8140(false, 1, 22);
			Static508.aClass196_106 = Static572.method8140(true, 1, 23);
			Static501.aClass196_103 = Static572.method8140(false, 1, 24);
			Static72.aClass196_19 = Static572.method8140(false, 1, 25);
			Static584.aClass196_122 = Static572.method8140(true, 1, 26);
			Static455.aClass196_97 = Static572.method8140(false, 1, 27);
			Static25.aClass196_85 = Static572.method8140(true, 1, 28);
			Static351.aClass196_68 = Static572.method8140(false, 1, 29);
			Static580.aClass196_120 = Static572.method8140(true, 1, 30);
			Static56.aClass196_17 = Static572.method8140(true, 1, 31);
			Static177.aClass196_36 = Static572.method8140(true, 2, 36);
		}
		if (Static582.aClass310_23 == Static523.aClass310_10) {
			local15 = 0;
			for (local71 = 0; local71 < 37; local71++) {
				if (Static534.aClass147_Sub1Array2[local71] != null) {
					local15 += Static534.aClass147_Sub1Array2[local71].method7352() * Static610.anIntArray644[local71] / 100;
				}
			}
			if (local15 != 100) {
				if (Static133.anInt2708 < 0) {
					Static133.anInt2708 = local15;
				}
				return (local15 - Static133.anInt2708) * 100 / (100 - Static133.anInt2708);
			}
			Static221.method3710(Static474.aClass196_98);
			Static357.method5869(Static474.aClass196_98, Static138.method2572(), Static429.aClass196_84);
		}
		if (Static523.aClass310_11 == Static582.aClass310_23) {
			if (Static249.anInt4578 == -1) {
				Static249.anInt4578 = Static336.aClass196_65.method5104("scape main");
			}
			Static82.method1952();
			Static256.method4279(2);
		}
		if (Static523.aClass310_12 == Static582.aClass310_23) {
			Static256.method4281(Static580.aClass196_120, Static205.aClass138_2);
		}
		if (Static523.aClass310_13 == Static582.aClass310_23) {
			local15 = Static125.method2476();
			if (local15 < 100) {
				return local15;
			}
			Static176.method3078(Static25.aClass196_85.method5113(1));
			Static165.method2920(Static25.aClass196_85.method5113(3));
		}
		if (Static523.aClass310_14 == Static582.aClass310_23) {
			if (Static130.anInt2693 != -1 && !Static68.aClass196_18.method5115(0, Static130.anInt2693)) {
				return 99;
			}
			Static473.anInterface7_14 = new Class334(Static584.aClass196_122, Static297.aClass196_58, Static474.aClass196_98);
			Static449.aClass55_2 = new Class55(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static78.aClass261_1 = new Class261(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static64.aClass263_34 = new Class263(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69, Static474.aClass196_98);
			Static571.aClass31_1 = new Class31(Static212.aClass222_2, Static325.anInt6083, Static383.aClass196_76);
			Static621.aClass315_6 = new Class315(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static527.aClass238_5 = new Class238(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static53.aClass286_6 = new Class286(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69, Static68.aClass196_18);
			Static465.aClass125_1 = new Class125(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static135.aClass331_1 = new Class331(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static105.aClass302_1 = new Class302(Static212.aClass222_2, Static325.anInt6083, true, Static557.aClass196_113, Static68.aClass196_18);
			Static68.aClass335_2 = new Class335(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69, Static474.aClass196_98);
			Static9.aClass202_1 = new Class202(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69, Static474.aClass196_98);
			Static547.aClass177_2 = new Class177(Static212.aClass222_2, Static325.anInt6083, true, Static368.aClass196_74, Static68.aClass196_18);
			Static320.aClass53_2 = new Class53(Static212.aClass222_2, Static325.anInt6083, true, Static449.aClass55_2, Static311.aClass196_77, Static68.aClass196_18);
			Static511.aClass8_1 = new Class8(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static115.aClass227_1 = new Class227(Static212.aClass222_2, Static325.anInt6083, Static11.aClass196_129, Static571.aClass196_119, Static450.aClass196_96);
			Static300.aClass186_1 = new Class186(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static229.aClass306_1 = new Class306(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static275.aClass68_2 = new Class68(Static212.aClass222_2, Static325.anInt6083, Static35.aClass196_12, Static68.aClass196_18);
			Static451.aClass247_1 = new Class247(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static311.aClass314_2 = new Class314(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static606.aClass268_1 = new Class268(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static169.aClass187_1 = new Class187(Static212.aClass222_2, Static325.anInt6083, Static384.aClass196_78);
			Static92.aClass23_1 = new Class23(Static212.aClass222_2, Static325.anInt6083, Static351.aClass196_69);
			Static170.method2974(Static429.aClass196_84, Static68.aClass196_18, Static226.aClass196_25, Static474.aClass196_98);
			Static519.method6985(Static351.aClass196_68);
			Static379.aClass226_1 = new Class226(Static325.anInt6083, Static501.aClass196_103, Static72.aClass196_19);
			Static430.aClass113_2 = new Class113(Static325.anInt6083, Static501.aClass196_103, Static72.aClass196_19, new Class67());
			Static352.method5818();
			Static105.aClass302_1.method7463(Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() == 0);
			Static373.aClass150_1 = new Class150();
			Static128.method2511();
			Static382.method6186(Static455.aClass196_97);
			Static572.method8139(Static68.aClass196_18, Static473.anInterface7_14);
			@Pc(971) Class303 local971 = new Class303(Static182.aClass196_38.method5093("huffman", ""));
			Static390.method6328(local971);
			try {
				jagmisc.init();
			} catch (@Pc(980) Throwable local980) {
			}
			Static41.aClass14_1 = Static134.method2555();
			Static17.aClass3_Sub23_1 = new Class3_Sub23(true, Static205.aClass138_2);
		}
		if (Static582.aClass310_23 == Static523.aClass310_16) {
			local15 = Static394.method6368(Static474.aClass196_98) + Static482.method7192(true);
			local71 = Static576.method8181() + Static505.method7457();
			if (local15 < local71) {
				return local15 * 100 / local71;
			}
		}
		if (Static523.aClass310_17 == Static582.aClass310_23) {
			Static110.method2786(Static508.aClass196_106, Static621.aClass315_6, Static527.aClass238_5, Static105.aClass302_1, Static68.aClass335_2, Static9.aClass202_1, Static373.aClass150_1);
		}
		if (Static582.aClass310_23 == Static523.aClass310_18) {
			Static396.anIntArray394 = new int[Static606.aClass268_1.anInt7964];
			Static165.aStringArray16 = new String[Static311.aClass314_2.anInt9080];
			Static515.aBooleanArray24 = new boolean[Static606.aClass268_1.anInt7964];
			for (local15 = 0; local15 < Static606.aClass268_1.anInt7964; local15++) {
				if (Static606.aClass268_1.method6925(local15).anInt9849 == 0) {
					Static515.aBooleanArray24[local15] = true;
					Static445.anInt7952++;
				}
				Static396.anIntArray394[local15] = -1;
			}
			Static575.method8160();
			Static489.anInt8493 = Static226.aClass196_25.method5104("loginscreen");
			Static96.anInt2226 = Static226.aClass196_25.method5104("lobbyscreen");
			Static395.aClass196_80.method5108(false);
			Static336.aClass196_65.method5108(true);
			Static474.aClass196_98.method5108(true);
			Static429.aClass196_84.method5108(true);
			Static182.aClass196_38.method5108(true);
			Static226.aClass196_25.method5108(true);
			Static351.aClass196_69.anInt5854 = 2;
			Static238.aBoolean299 = true;
			Static383.aClass196_76.anInt5854 = 2;
			Static557.aClass196_113.anInt5854 = 2;
			Static368.aClass196_74.anInt5854 = 2;
			Static311.aClass196_77.anInt5854 = 2;
			Static11.aClass196_129.anInt5854 = 2;
			Static35.aClass196_12.anInt5854 = 2;
		}
		if (Static582.aClass310_23 == Static523.aClass310_19) {
			if (!Static219.method3673(Static489.anInt8493)) {
				return 0;
			}
			local167 = true;
			for (local71 = 0; local71 < Static92.aClass279ArrayArray1[Static489.anInt8493].length; local71++) {
				@Pc(1165) Class279 local1165 = Static92.aClass279ArrayArray1[Static489.anInt8493][local71];
				if (local1165.anInt8204 == 5 && local1165.anInt8207 != -1 && !Static474.aClass196_98.method5115(0, local1165.anInt8207)) {
					local167 = false;
				}
			}
			if (!local167) {
				return 0;
			}
		}
		if (Static582.aClass310_23 == Static523.aClass310_20) {
			Static260.method7708(true);
		}
		if (Static582.aClass310_23 == Static523.aClass310_21) {
			Static101.aClass59_1.method1959();
			try {
				Static264.aThread3.join();
			} catch (@Pc(1209) InterruptedException local1209) {
				return 0;
			}
			Static101.aClass59_1 = null;
			Static264.aThread3 = null;
			Static29.anInterface21Array1 = null;
			Static225.aClass196_102 = null;
			Static143.aClass153_1 = null;
			Static306.aClass196_60 = null;
			Static98.method2121();
			Static12.aBoolean55 = Static262.aClass3_Sub27_12.aClass21_Sub11_1.method4362() == 1;
			Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub11_1);
			Static108.method2177();
			if (Static12.aBoolean55) {
				Static441.method6865(false, 0);
			} else {
				Static441.method6865(false, Static262.aClass3_Sub27_12.aClass21_Sub1_2.method1025());
			}
			Static398.method6435(-1, false, -1, Static262.aClass3_Sub27_12.aClass21_Sub2_2.method1086());
			Static235.method3933(Static323.aClass5_9);
			Static68.method1698(Static323.aClass5_9);
			Static33.method1208(Static323.aClass5_9, Static474.aClass196_98);
			Static421.method6614(Static135.aClass24Array7);
		}
		return Static487.method7256();
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)[Lclient!cga;")
	public static Class50[] method2282() {
		return new Class50[] { Static63.aClass50_6, Static454.aClass50_12, Static405.aClass50_14 };
	}
}
