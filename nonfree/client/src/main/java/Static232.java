import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
	public static int anInt3661 = -1;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)I")
	public static int method3348() {
		@Pc(9) int local9;
		if (Static124.aClass4_Sub20_4.aClass8_Sub10_1.method4051() == 0) {
			for (local9 = 0; local9 < Static411.anInt5921; local9++) {
				if (Static76.anInterface26Array1[local9].method7134() == 's' || Static76.anInterface26Array1[local9].method7134() == 'S') {
					Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub10_1, 1);
					Static645.aBoolean784 = true;
					break;
				}
			}
		}
		@Pc(57) int local57;
		if (Static393.aClass246_2 == Static6.aClass246_1) {
			@Pc(48) Runtime local48 = Runtime.getRuntime();
			local57 = (int) ((local48.totalMemory() - local48.freeMemory()) / 1024L);
			@Pc(60) long local60 = Static429.method5935();
			if (Static99.aLong69 == 0L) {
				Static99.aLong69 = local60;
			}
			if (local57 > 16384 && local60 - Static99.aLong69 < 5000L) {
				if (local60 - Static264.aLong124 > 1000L) {
					System.gc();
					Static264.aLong124 = local60;
				}
				return 0;
			}
		}
		if (Static393.aClass246_3 == Static6.aClass246_1) {
			if (Static560.aClass183_1 == null) {
				Static560.aClass183_1 = new Class183(Static334.aClass260_4, Static319.aClass309_3, Static574.aBigInteger10, Static1.aBigInteger8);
			}
			if (!Static560.aClass183_1.method4105()) {
				return 0;
			}
			Static485.method6635(true, (String) null, 0);
			Static305.aBoolean358 = !Static87.method1773();
			Static614.aClass34_122 = Static330.method4562(false, 1, Static305.aBoolean358 ? 34 : 32);
			Static433.aClass34_93 = Static330.method4562(false, 1, 33);
			Static305.aClass34_68 = Static330.method4562(false, 1, 13);
		}
		@Pc(151) boolean local151;
		if (Static393.aClass246_4 == Static6.aClass246_1) {
			local151 = Static433.aClass34_93.method1257();
			local57 = Static558.aClass89_Sub1Array2[33].method2246();
			local57 += Static558.aClass89_Sub1Array2[Static305.aBoolean358 ? 34 : 32].method2246();
			local57 += Static558.aClass89_Sub1Array2[13].method2246();
			local57 += local151 ? 100 : Static433.aClass34_93.method1241();
			if (local57 != 400) {
				return local57 / 4;
			}
			Static296.anInt4685 = Static614.aClass34_122.method1229();
			Static215.anInt3495 = Static433.aClass34_93.method1229();
			Static481.method6593(Static614.aClass34_122);
			@Pc(210) int local210 = Static124.aClass4_Sub20_4.aClass8_Sub11_1.method4347();
			Static84.aClass128_1 = new Class128(Static333.aClass234_5, Static164.anInt2984, Static433.aClass34_93);
			@Pc(222) int[] local222 = Static84.aClass128_1.method2869(local210);
			if (local222.length == 0) {
				local222 = Static84.aClass128_1.method2869(0);
			}
			@Pc(236) Class106 local236 = new Class106(Static614.aClass34_122, Static305.aClass34_68);
			if (local222.length > 0) {
				Static238.anInterface22Array1 = new Interface22[local222.length];
				for (@Pc(245) int local245 = 0; local245 < Static238.anInterface22Array1.length; local245++) {
					Static238.anInterface22Array1[local245] = new Class384(Static84.aClass128_1.method2868(local222[local245]), local236);
				}
			}
		}
		if (Static6.aClass246_1 == Static393.aClass246_5) {
			Static374.method4925(Static305.aClass34_68, Static614.aClass34_122, Static199.method3054());
		}
		if (Static393.aClass246_6 == Static6.aClass246_1) {
			local9 = Static45.method824();
			local57 = Static364.method4833();
			if (local9 < local57) {
				return local9 * 100 / local57;
			}
		}
		if (Static6.aClass246_1 == Static393.aClass246_7) {
			if (Static238.anInterface22Array1 != null && Static238.anInterface22Array1.length > 0) {
				if (Static238.anInterface22Array1[0].method8777() < 100) {
					return 0;
				}
				if (Static238.anInterface22Array1.length > 1 && Static84.aClass128_1.method2870() && Static238.anInterface22Array1[1].method8777() < 100) {
					return 0;
				}
			}
			Static90.method7665(Static582.aClass33_13);
			Static514.method6977(Static582.aClass33_13);
			Static53.method1256(1);
		}
		if (Static393.aClass246_8 == Static6.aClass246_1) {
			for (local9 = 0; local9 < 4; local9++) {
				Static263.aClass389Array1[local9] = Static564.method7466(Static224.anInt3557, Static267.anInt4309);
			}
		}
		if (Static6.aClass246_1 == Static393.aClass246_9) {
			Static368.aClass34_80 = Static330.method4562(false, 1, 8);
			Static580.aClass34_115 = Static330.method4562(false, 1, 0);
			Static64.aClass34_11 = Static330.method4562(false, 1, 1);
			Static674.aClass34_134 = Static330.method4562(false, 1, 2);
			Static20.aClass34_4 = Static330.method4562(false, 1, 3);
			Static42.aClass34_6 = Static330.method4562(false, 1, 4);
			Static151.aClass34_38 = Static330.method4562(true, 1, 5);
			Static611.aClass34_120 = Static330.method4562(true, 1, 6);
			Static89.aClass34_20 = Static330.method4562(false, 1, 7);
			Static573.aClass34_112 = Static330.method4562(false, 1, 9);
			Static122.aClass34_28 = Static330.method4562(false, 1, 10);
			Static349.aClass34_75 = Static330.method4562(false, 1, 11);
			Static338.aClass34_73 = Static330.method4562(false, 1, 12);
			Static400.aClass34_84 = Static330.method4562(false, 1, 14);
			Static172.aClass34_44 = Static330.method4562(false, 1, 15);
			Static194.aClass34_48 = Static330.method4562(false, 1, 16);
			Static31.aClass34_124 = Static330.method4562(false, 1, 17);
			Static584.aClass34_60 = Static330.method4562(false, 1, 18);
			Static203.aClass34_53 = Static330.method4562(false, 1, 19);
			Static199.aClass34_50 = Static330.method4562(false, 1, 20);
			Static363.aClass34_82 = Static330.method4562(false, 1, 21);
			Static335.aClass34_72 = Static330.method4562(false, 1, 22);
			Static329.aClass34_71 = Static330.method4562(true, 1, 23);
			Static584.aClass34_59 = Static330.method4562(false, 1, 24);
			Static96.aClass34_21 = Static330.method4562(false, 1, 25);
			Static629.aClass34_125 = Static330.method4562(true, 1, 26);
			Static362.aClass34_81 = Static330.method4562(false, 1, 27);
			Static388.aClass34_83 = Static330.method4562(true, 1, 28);
			Static409.aClass34_85 = Static330.method4562(false, 1, 29);
			Static201.aClass34_52 = Static330.method4562(true, 1, 30);
			Static143.aClass34_31 = Static330.method4562(true, 1, 31);
			Static636.aClass34_126 = Static330.method4562(true, 2, 36);
		}
		if (Static6.aClass246_1 == Static393.aClass246_10) {
			local9 = 0;
			for (local57 = 0; local57 < 37; local57++) {
				if (Static558.aClass89_Sub1Array2[local57] != null) {
					local9 += Static558.aClass89_Sub1Array2[local57].method2246() * Static158.anIntArray670[local57] / 100;
				}
			}
			if (local9 != 100) {
				if (Static594.anInt9145 < 0) {
					Static594.anInt9145 = local9;
				}
				return (local9 - Static594.anInt9145) * 100 / (100 - Static594.anInt9145);
			}
			Static523.method7046(Static368.aClass34_80);
			Static374.method4925(Static305.aClass34_68, Static368.aClass34_80, Static199.method3054());
		}
		if (Static6.aClass246_1 == Static393.aClass246_11) {
			if (Static431.anInt6781 == -1) {
				Static431.anInt6781 = Static611.aClass34_120.method1252("scape main");
			}
			Static553.method7372();
			Static53.method1256(2);
		}
		if (Static6.aClass246_1 == Static393.aClass246_12) {
			Static487.method1697(Static239.aClass207_2, Static201.aClass34_52);
		}
		if (Static393.aClass246_13 == Static6.aClass246_1) {
			local9 = Static5.method109();
			if (local9 < 100) {
				return local9;
			}
			Static375.method4926(Static388.aClass34_83.method1255(1));
			Static410.method5169(Static388.aClass34_83.method1255(3));
			Static358.aClass220_2 = new Class220(Static388.aClass34_83);
		}
		if (Static6.aClass246_1 == Static393.aClass246_14) {
			if (Static386.anInt5675 != -1 && !Static89.aClass34_20.method1245(0, Static386.anInt5675)) {
				return 99;
			}
			Static57.anInterface9_4 = new Class47(Static629.aClass34_125, Static573.aClass34_112, Static368.aClass34_80);
			Static482.aClass84_2 = new Class84(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static116.aClass177_1 = new Class177(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134, Static358.aClass220_2);
			Static87.aClass32_1 = new Class32(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134, Static368.aClass34_80);
			Static599.aClass311_1 = new Class311(Static333.aClass234_5, Static164.anInt2984, Static31.aClass34_124);
			Static415.aClass217_6 = new Class217(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static14.aClass160_1 = new Class160(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static204.aClass361_1 = new Class361(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134, Static368.aClass34_80);
			Static511.aClass254_1 = new Class254(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134, Static89.aClass34_20);
			Static432.aClass121_1 = new Class121(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static270.aClass299_1 = new Class299(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static441.aClass74_169 = new Class74(Static333.aClass234_5, Static164.anInt2984, true, Static194.aClass34_48, Static89.aClass34_20);
			Static526.aClass59_4 = new Class59(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134, Static368.aClass34_80);
			Static623.aClass132_4 = new Class132(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134, Static368.aClass34_80);
			Static255.aClass380_1 = new Class380(Static333.aClass234_5, Static164.anInt2984, true, Static584.aClass34_60, Static89.aClass34_20);
			Static532.aClass255_2 = new Class255(Static333.aClass234_5, Static164.anInt2984, true, Static482.aClass84_2, Static203.aClass34_53, Static89.aClass34_20);
			Static431.aClass39_1 = new Class39(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static99.aClass2_1 = new Class2(Static333.aClass234_5, Static164.anInt2984, Static199.aClass34_50, Static580.aClass34_115, Static64.aClass34_11);
			Static153.aClass344_1 = new Class344(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static422.aClass273_1 = new Class273(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static341.aClass349_1 = new Class349(Static333.aClass234_5, Static164.anInt2984, Static363.aClass34_82, Static89.aClass34_20);
			Static536.aClass148_1 = new Class148(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static418.aClass28_1 = new Class28(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static189.aClass376_1 = new Class376(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static110.aClass184_1 = new Class184(Static333.aClass234_5, Static164.anInt2984, Static335.aClass34_72);
			Static522.aClass365_1 = new Class365(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static315.aClass135_1 = new Class135(Static333.aClass234_5, Static164.anInt2984, Static674.aClass34_134);
			Static151.method2616(Static89.aClass34_20, Static305.aClass34_68, Static368.aClass34_80, Static20.aClass34_4);
			Static263.method3785(Static409.aClass34_85);
			Static468.aClass337_1 = new Class337(Static164.anInt2984, Static584.aClass34_59, Static96.aClass34_21);
			Static410.aClass298_1 = new Class298(Static164.anInt2984, Static584.aClass34_59, Static96.aClass34_21, new Class153());
			Static235.method4850();
			Static441.aClass74_169.method2079(Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() == 0);
			Static526.aClass293_1 = new Class293();
			Static544.method7261();
			Static48.method984(Static362.aClass34_81);
			Static261.method3768(Static89.aClass34_20, Static57.anInterface9_4);
			@Pc(968) Class165 local968 = new Class165(Static122.aClass34_28.method1238("huffman", ""));
			Static7.method145(local968);
			try {
				jagmisc.init();
			} catch (@Pc(977) Throwable local977) {
			}
			Static572.aClass41_1 = Static528.method7110();
			Static566.aClass4_Sub41_1 = new Class4_Sub41(true, Static239.aClass207_2);
		}
		if (Static6.aClass246_1 == Static393.aClass246_16) {
			local9 = Static368.method4807(Static368.aClass34_80) + Static227.method3321(true);
			local57 = Static531.method7139() + Static364.method4833();
			if (local57 > local9) {
				return local9 * 100 / local57;
			}
		}
		if (Static6.aClass246_1 == Static393.aClass246_17) {
			Static154.method465(Static329.aClass34_71, Static415.aClass217_6, Static14.aClass160_1, Static441.aClass74_169, Static526.aClass59_4, Static623.aClass132_4, Static526.aClass293_1);
		}
		if (Static393.aClass246_18 == Static6.aClass246_1) {
			Static89.aStringArray9 = new String[Static418.aClass28_1.anInt900];
			Static509.anIntArray546 = new int[Static189.aClass376_1.anInt9899];
			Static51.aBooleanArray3 = new boolean[Static189.aClass376_1.anInt9899];
			for (local9 = 0; local9 < Static189.aClass376_1.anInt9899; local9++) {
				if (Static189.aClass376_1.method8472(local9).anInt854 == 0) {
					Static51.aBooleanArray3[local9] = true;
					Static145.anInt2659++;
				}
				Static509.anIntArray546[local9] = -1;
			}
			Static41.method787();
			Static500.anInt7840 = Static20.aClass34_4.method1252("loginscreen");
			Static624.anInt9781 = Static20.aClass34_4.method1252("lobbyscreen");
			Static151.aClass34_38.method1259(false);
			Static611.aClass34_120.method1259(true);
			Static368.aClass34_80.method1259(true);
			Static305.aClass34_68.method1259(true);
			Static122.aClass34_28.method1259(true);
			Static20.aClass34_4.method1259(true);
			Static674.aClass34_134.anInt1211 = 2;
			Static33.aBoolean727 = true;
			Static31.aClass34_124.anInt1211 = 2;
			Static194.aClass34_48.anInt1211 = 2;
			Static584.aClass34_60.anInt1211 = 2;
			Static203.aClass34_53.anInt1211 = 2;
			Static199.aClass34_50.anInt1211 = 2;
			Static363.aClass34_82.anInt1211 = 2;
		}
		if (Static393.aClass246_19 == Static6.aClass246_1) {
			if (!Static583.method7687(Static500.anInt7840)) {
				return 0;
			}
			local151 = true;
			for (local57 = 0; local57 < Static392.aClass199ArrayArray2[Static500.anInt7840].length; local57++) {
				@Pc(1163) Class199 local1163 = Static392.aClass199ArrayArray2[Static500.anInt7840][local57];
				if (local1163.anInt4966 == 5 && local1163.anInt4958 != -1 && !Static368.aClass34_80.method1245(0, local1163.anInt4958)) {
					local151 = false;
				}
			}
			if (!local151) {
				return 0;
			}
		}
		if (Static6.aClass246_1 == Static393.aClass246_20) {
			Static587.method7741(true);
		}
		if (Static393.aClass246_21 == Static6.aClass246_1) {
			Static31.aClass353_3.method7682();
			try {
				Static261.aThread2.join();
			} catch (@Pc(1214) InterruptedException local1214) {
				return 0;
			}
			Static433.aClass34_93 = null;
			Static84.aClass128_1 = null;
			Static31.aClass353_3 = null;
			Static614.aClass34_122 = null;
			Static238.anInterface22Array1 = null;
			Static261.aThread2 = null;
			Static62.method1353();
			Static338.aBoolean404 = Static124.aClass4_Sub20_4.aClass8_Sub10_1.method4051() == 1;
			Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub10_1, 1);
			if (Static338.aBoolean404) {
				Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, 0);
			} else if (Static124.aClass4_Sub20_4.aClass8_Sub13_1.aBoolean439 && Static566.aClass4_Sub41_1.anInt7533 < 512 && Static566.aClass4_Sub41_1.anInt7533 != 0) {
				Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_1, 0);
			}
			Static361.method4808();
			if (Static338.aBoolean404) {
				Static46.method825(0, false);
			} else {
				Static46.method825(Static124.aClass4_Sub20_4.aClass8_Sub13_1.method5052(), false);
			}
			Static532.method7162(Static124.aClass4_Sub20_4.aClass8_Sub21_2.method7121(), -1, -1, false);
			Static90.method7665(Static582.aClass33_13);
			Static514.method6977(Static582.aClass33_13);
			Static275.method3980(Static368.aClass34_80, Static582.aClass33_13);
			Static319.method4405(Static638.aClass17Array18);
		}
		return Static599.method7867();
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	public static void method3350() {
		for (@Pc(6) Class4_Sub23 local6 = (Class4_Sub23) Static328.aClass163_30.method3639(); local6 != null; local6 = (Class4_Sub23) Static328.aClass163_30.method3640()) {
			if (local6.aBoolean304) {
				local6.method3688();
			}
		}
		for (@Pc(30) Class4_Sub23 local30 = (Class4_Sub23) Static611.aClass163_65.method3639(); local30 != null; local30 = (Class4_Sub23) Static611.aClass163_65.method3640()) {
			if (local30.aBoolean304) {
				local30.method3688();
			}
		}
	}
}
