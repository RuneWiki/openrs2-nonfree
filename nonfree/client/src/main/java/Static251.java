import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "Lclient!ek;")
	public static Class4_Sub13 aClass4_Sub13_6;

	@OriginalMember(owner = "client!jq", name = "H", descriptor = "Lclient!ga;")
	public static Class116 aClass116_1;

	@OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
	public static int anInt5137 = -1;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)I")
	public static int method3998() {
		@Pc(10) int local10;
		if (!Static455.aClass4_Sub35_Sub1_1.aBoolean672) {
			for (local10 = 0; local10 < Static173.anInt3654; local10++) {
				if (Static504.anInterface19Array2[local10].method5461() == 's' || Static504.anInterface19Array2[local10].method5461() == 'S') {
					Static455.aClass4_Sub35_Sub1_1.aBoolean672 = true;
					break;
				}
			}
		}
		@Pc(52) int local52;
		if (Static121.aClass94_1 == Static523.aClass94_24) {
			@Pc(42) Runtime local42 = Runtime.getRuntime();
			local52 = (int) ((local42.totalMemory() - local42.freeMemory()) / 1024L);
			@Pc(59) long local59 = Static112.method2047();
			if (Static321.aLong168 == 0L) {
				Static321.aLong168 = local59;
			}
			if (local52 > 16384 && local59 - Static321.aLong168 < 5000L) {
				if (local59 - Static91.aLong48 > 1000L) {
					System.gc();
					Static91.aLong48 = local59;
				}
				return 0;
			}
		}
		if (Static121.aClass94_2 == Static523.aClass94_24) {
			if (Static497.aClass109_1 == null) {
				Static497.aClass109_1 = new Class109(Static433.aClass72_3, Static187.aClass225_2, Static292.aBigInteger3, Static483.aBigInteger5);
			}
			if (!Static497.aClass109_1.method2508()) {
				return 0;
			}
			Static507.method7316(0, null);
			Static243.aBoolean357 = !Static81.method7664();
			Static566.aClass348_130 = Static145.method2515(false, Static243.aBoolean357 ? 34 : 32);
			Static481.aClass348_116 = Static145.method2515(false, 33);
			Static478.aClass348_114 = Static145.method2515(false, 13);
		}
		if (Static121.aClass94_3 == Static523.aClass94_24) {
			Static481.aClass348_116.method7959();
			local10 = Static519.aClass240_Sub1Array2[33].method5498();
			local10 += Static519.aClass240_Sub1Array2[Static243.aBoolean357 ? 34 : 32].method5498();
			local10 += Static519.aClass240_Sub1Array2[13].method5498();
			local10 += Static481.aClass348_116.method7962();
			if (local10 != 400) {
				return local10 / 4;
			}
			Static306.anInt6119 = Static566.aClass348_130.method7974();
			Static371.anInt7145 = Static481.aClass348_116.method7974();
			Static571.method8037(Static566.aClass348_130);
			local52 = Static455.aClass4_Sub35_Sub1_1.anInt9918;
			Static581.aClass73_1 = new Class73(Static162.aClass128_1, Static142.anInt3088, Static481.aClass348_116);
			@Pc(216) int[] local216 = Static581.aClass73_1.method1888(local52);
			@Pc(222) Class302 local222 = new Class302(Static566.aClass348_130, Static478.aClass348_114);
			if (local216.length > 0) {
				Static229.anInterface15Array1 = new Interface15[local216.length];
				for (@Pc(234) int local234 = 0; local234 < Static229.anInterface15Array1.length; local234++) {
					Static229.anInterface15Array1[local234] = new Class365(Static581.aClass73_1.method1890(local216[local234]), local222);
				}
			}
		}
		if (Static523.aClass94_24 == Static121.aClass94_4) {
			Static187.method3085(Static309.method4896(), Static478.aClass348_114, Static566.aClass348_130);
		}
		if (Static523.aClass94_24 == Static121.aClass94_5) {
			local10 = Static235.method3840();
			local52 = Static174.method2900();
			if (local10 < local52) {
				return local10 * 100 / local52;
			}
		}
		if (Static523.aClass94_24 == Static121.aClass94_6) {
			if (Static229.anInterface15Array1 != null && Static229.anInterface15Array1.length > 0) {
				if (Static229.anInterface15Array1[0].method8259() < 100) {
					return 0;
				}
				if (Static229.anInterface15Array1.length > 1 && Static581.aClass73_1.method1887() && Static229.anInterface15Array1[1].method8259() < 100) {
					return 0;
				}
			}
			Static85.method1794(Static39.aClass7_2);
			Static31.method988(Static39.aClass7_2);
			Static231.method3759(1);
		}
		if (Static121.aClass94_7 == Static523.aClass94_24) {
			for (local10 = 0; local10 < 4; local10++) {
				Static526.aClass232Array1[local10] = Static375.method5817(Static338.anInt6508, Static390.anInt7654);
			}
		}
		if (Static523.aClass94_24 == Static121.aClass94_8) {
			Static159.aClass348_38 = Static145.method2515(false, 8);
			Static388.aClass348_95 = Static145.method2515(false, 0);
			Static42.aClass348_21 = Static145.method2515(false, 1);
			Static196.aClass348_49 = Static145.method2515(false, 2);
			Static414.aClass348_98 = Static145.method2515(false, 3);
			Static518.aClass348_118 = Static145.method2515(false, 4);
			Static46.aClass348_22 = Static145.method2515(true, 5);
			Static326.aClass348_69 = Static145.method2515(true, 6);
			Static383.aClass348_91 = Static145.method2515(false, 7);
			Static580.aClass348_84 = Static145.method2515(false, 9);
			Static26.aClass348_12 = Static145.method2515(false, 10);
			Static84.aClass348_28 = Static145.method2515(false, 11);
			Static75.aClass348_26 = Static145.method2515(false, 12);
			Static19.aClass348_11 = Static145.method2515(false, 14);
			Static359.aClass348_76 = Static145.method2515(false, 15);
			Static7.aClass348_6 = Static145.method2515(false, 16);
			Static364.aClass348_77 = Static145.method2515(false, 17);
			Static249.aClass348_41 = Static145.method2515(false, 18);
			Static384.aClass348_92 = Static145.method2515(false, 19);
			Static377.aClass348_85 = Static145.method2515(false, 20);
			Static325.aClass348_68 = Static145.method2515(false, 21);
			Static506.aClass348_117 = Static145.method2515(false, 22);
			Static272.aClass348_136 = Static145.method2515(true, 23);
			Static390.aClass348_96 = Static145.method2515(false, 24);
			Static417.aClass348_56 = Static145.method2515(false, 25);
			Static453.aClass348_104 = Static145.method2515(true, 26);
			Static277.aClass348_62 = Static145.method2515(false, 27);
			Static459.aClass348_101 = Static145.method2515(true, 28);
			Static175.aClass348_44 = Static145.method2515(false, 29);
			Static131.aClass348_30 = Static145.method2515(true, 30);
			Static18.aClass348_10 = Static145.method2515(true, 31);
		}
		if (Static523.aClass94_24 == Static121.aClass94_9) {
			local10 = 0;
			for (local52 = 0; local52 < 35; local52++) {
				if (Static519.aClass240_Sub1Array2[local52] != null) {
					local10 += Static519.aClass240_Sub1Array2[local52].method5498() * Static150.anIntArray157[local52] / 100;
				}
			}
			if (local10 != 100) {
				if (Static447.anInt10072 < 0) {
					Static447.anInt10072 = local10;
				}
				return (local10 - Static447.anInt10072) * 100 / (100 - Static447.anInt10072);
			}
			Static537.method7532(Static159.aClass348_38);
			Static187.method3085(Static309.method4896(), Static478.aClass348_114, Static159.aClass348_38);
		}
		if (Static523.aClass94_24 == Static121.aClass94_10) {
			Static518.method7356();
			Static231.method3759(2);
		}
		if (Static121.aClass94_11 == Static523.aClass94_24) {
			Static288.method4599(Static372.aClass366_5, Static131.aClass348_30);
		}
		if (Static523.aClass94_24 == Static121.aClass94_12) {
			local10 = Static168.method2769();
			if (local10 < 100) {
				return local10;
			}
			Static58.method1350(Static459.aClass348_101.method7969(1));
			Static450.method6617(Static459.aClass348_101.method7969(3));
		}
		if (Static121.aClass94_13 == Static523.aClass94_24) {
			if (Static405.anInt7854 != -1 && !Static383.aClass348_91.method7972(Static405.anInt7854, 0)) {
				return 99;
			}
			Static361.anInterface7_8 = new Class183(Static453.aClass348_104, Static580.aClass348_84, Static159.aClass348_38);
			Static245.aClass107_2 = new Class107(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static203.aClass230_1 = new Class230(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static198.aClass338_1 = new Class338(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49, Static159.aClass348_38);
			Static167.aClass291_2 = new Class291(Static162.aClass128_1, Static142.anInt3088, Static364.aClass348_77);
			Static296.aClass324_3 = new Class324(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static432.aClass335_3 = new Class335(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static516.aClass127_2 = new Class127(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49, Static383.aClass348_91);
			Static157.aClass150_1 = new Class150(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static207.aClass201_1 = new Class201(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static103.aClass298_1 = new Class298(Static162.aClass128_1, Static142.anInt3088, true, Static7.aClass348_6, Static383.aClass348_91);
			Static89.aClass121_1 = new Class121(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49, Static159.aClass348_38);
			Static259.aClass249_2 = new Class249(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49, Static159.aClass348_38);
			Class21_Sub1_Sub2_Sub1.lb = new Class212(Static162.aClass128_1, Static142.anInt3088, true, Static249.aClass348_41, Static383.aClass348_91);
			Static338.aClass29_1 = new Class29(Static162.aClass128_1, Static142.anInt3088, true, Static245.aClass107_2, Static384.aClass348_92, Static383.aClass348_91);
			Static5.aClass301_1 = new Class301(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static17.aClass254_1 = new Class254(Static162.aClass128_1, Static142.anInt3088, Static377.aClass348_85, Static388.aClass348_95, Static42.aClass348_21);
			Static145.aClass56_1 = new Class56(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static240.aClass175_1 = new Class175(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static342.aClass132_2 = new Class132(Static162.aClass128_1, Static142.anInt3088, Static325.aClass348_68, Static383.aClass348_91);
			Static288.aClass47_1 = new Class47(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static338.aClass278_1 = new Class278(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static339.aClass257_1 = new Class257(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static420.aClass60_1 = new Class60(Static162.aClass128_1, Static142.anInt3088, Static506.aClass348_117);
			Static152.aClass290_1 = new Class290(Static162.aClass128_1, Static142.anInt3088, Static196.aClass348_49);
			Static433.method6467(Static414.aClass348_98, Static478.aClass348_114, Static383.aClass348_91, Static159.aClass348_38);
			Static66.method1460(Static175.aClass348_44);
			Static89.aClass224_1 = new Class224(Static142.anInt3088, Static390.aClass348_96, Static417.aClass348_56);
			Static115.aClass213_2 = new Class213(Static142.anInt3088, Static390.aClass348_96, Static417.aClass348_56, new Class71());
			Static445.method6555();
			Static103.aClass298_1.method6817(!Static455.aClass4_Sub35_Sub1_1.method7621(Static453.anInt8614));
			Static523.aClass173_1 = new Class173();
			Static303.method4804();
			Static446.method6583(Static277.aClass348_62);
			Static571.method8039(Static383.aClass348_91, Static361.anInterface7_8);
			@Pc(915) Class79 local915 = new Class79(Static26.aClass348_12.method7956("", "huffman"));
			Static16.method4957(local915);
			try {
				jagmisc.init();
			} catch (@Pc(922) Throwable local922) {
			}
			Static84.aClass13_1 = Static534.method7521();
			Static535.aClass4_Sub15_1 = new Class4_Sub15(true, Static372.aClass366_5);
		}
		if (Static523.aClass94_24 == Static121.aClass94_15) {
			local10 = Static206.method8054(Static159.aClass348_38) + Static569.method6000(true);
			local52 = Static484.method7068() + Static174.method2900();
			if (local52 > local10) {
				return local10 * 100 / local52;
			}
		}
		if (Static523.aClass94_24 == Static121.aClass94_16) {
			Static572.method7770(Static272.aClass348_136, Static296.aClass324_3, Static432.aClass335_3, Static103.aClass298_1, Static89.aClass121_1, Static259.aClass249_2, Static523.aClass173_1);
		}
		if (Static523.aClass94_24 == Static121.aClass94_17) {
			Static188.aBooleanArray11 = new boolean[Static339.aClass257_1.anInt7589];
			Static178.aStringArray15 = new String[Static338.aClass278_1.anInt8343];
			Static65.anIntArray67 = new int[Static339.aClass257_1.anInt7589];
			for (local10 = 0; local10 < Static339.aClass257_1.anInt7589; local10++) {
				if (Static339.aClass257_1.method5966(local10).anInt4891 == 0) {
					Static188.aBooleanArray11[local10] = true;
					Static565.anInt5162++;
				}
				Static65.anIntArray67[local10] = -1;
			}
			Static429.method6380();
			Static162.anInt3366 = Static414.aClass348_98.method7966("loginscreen");
			Static588.anInt10538 = Static414.aClass348_98.method7966("lobbyscreen");
			Static46.aClass348_22.method7950(false);
			Static326.aClass348_69.method7950(true);
			Static159.aClass348_38.method7950(true);
			Static478.aClass348_114.method7950(true);
			Static26.aClass348_12.method7950(true);
			Static414.aClass348_98.method7950(true);
			Static196.aClass348_49.anInt10233 = 2;
			Static513.aBoolean648 = true;
			Static364.aClass348_77.anInt10233 = 2;
			Static7.aClass348_6.anInt10233 = 2;
			Static249.aClass348_41.anInt10233 = 2;
			Static384.aClass348_92.anInt10233 = 2;
			Static377.aClass348_85.anInt10233 = 2;
			Static325.aClass348_68.anInt10233 = 2;
		}
		@Pc(1113) Class155 local1113;
		if (Static523.aClass94_24 == Static121.aClass94_18) {
			if (!Static420.method6283(Static162.anInt3366)) {
				return 0;
			}
			for (local10 = 0; local10 < Static535.aClass155ArrayArray2[Static162.anInt3366].length; local10++) {
				local1113 = Static535.aClass155ArrayArray2[Static162.anInt3366][local10];
				if (local1113.anInt4796 == 5 && local1113.anInt4820 != -1) {
					local1113.method3691(Static39.aClass7_2);
				}
			}
		}
		if (Static121.aClass94_19 == Static523.aClass94_24) {
			for (local10 = 0; local10 < Static535.aClass155ArrayArray2[Static162.anInt3366].length; local10++) {
				local1113 = Static535.aClass155ArrayArray2[Static162.anInt3366][local10];
				if (local1113.anInt4796 == 5 && local1113.anInt4820 != -1 && local1113.method3691(Static39.aClass7_2) == null && Static46.aBoolean115) {
					return 0;
				}
			}
		}
		if (Static121.aClass94_20 == Static523.aClass94_24) {
			Static189.method3134(true);
		}
		if (Static523.aClass94_24 == Static121.aClass94_21) {
			Static521.aClass258_1.method5975();
			try {
				Static458.aThread5.join();
			} catch (@Pc(1195) InterruptedException local1195) {
				return 0;
			}
			Static521.aClass258_1 = null;
			Static481.aClass348_116 = null;
			Static581.aClass73_1 = null;
			Static229.anInterface15Array1 = null;
			Static458.aThread5 = null;
			Static566.aClass348_130 = null;
			Static463.method6786();
			Static105.aBoolean624 = Static455.aClass4_Sub35_Sub1_1.aBoolean672;
			Static455.aClass4_Sub35_Sub1_1.aBoolean672 = true;
			Static455.aClass4_Sub35_Sub1_1.method7631(Static372.aClass366_5);
			if (Static105.aBoolean624) {
				Static146.method2531(0);
			} else {
				Static146.method2531(Static455.aClass4_Sub35_Sub1_1.anInt9933);
			}
			Static503.method7242(-1, Static455.aClass4_Sub35_Sub1_1.anInt9917, false, -1);
			Static85.method1794(Static39.aClass7_2);
			Static31.method988(Static39.aClass7_2);
			Static74.method1584(Static159.aClass348_38, Static39.aClass7_2);
			Static544.method7626(Static571.aClass88Array15);
		}
		return Static27.method3279();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z")
	public static boolean method4000(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
