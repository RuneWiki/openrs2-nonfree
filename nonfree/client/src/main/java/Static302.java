import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "Z")
	public static boolean aBoolean510 = false;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method5729(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) byte[] local16 = new byte[local13];
		for (@Pc(18) int local18 = 0; local18 < local13; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local16[local18] = (byte) local24;
			} else if (local24 == '€') {
				local16[local18] = -128;
			} else if (local24 == '‚') {
				local16[local18] = -126;
			} else if (local24 == 'ƒ') {
				local16[local18] = -125;
			} else if (local24 == '„') {
				local16[local18] = -124;
			} else if (local24 == '…') {
				local16[local18] = -123;
			} else if (local24 == '†') {
				local16[local18] = -122;
			} else if (local24 == '‡') {
				local16[local18] = -121;
			} else if (local24 == 'ˆ') {
				local16[local18] = -120;
			} else if (local24 == '‰') {
				local16[local18] = -119;
			} else if (local24 == 'Š') {
				local16[local18] = -118;
			} else if (local24 == '‹') {
				local16[local18] = -117;
			} else if (local24 == 'Œ') {
				local16[local18] = -116;
			} else if (local24 == 'Ž') {
				local16[local18] = -114;
			} else if (local24 == '‘') {
				local16[local18] = -111;
			} else if (local24 == '’') {
				local16[local18] = -110;
			} else if (local24 == '“') {
				local16[local18] = -109;
			} else if (local24 == '”') {
				local16[local18] = -108;
			} else if (local24 == '•') {
				local16[local18] = -107;
			} else if (local24 == '–') {
				local16[local18] = -106;
			} else if (local24 == '—') {
				local16[local18] = -105;
			} else if (local24 == '˜') {
				local16[local18] = -104;
			} else if (local24 == '™') {
				local16[local18] = -103;
			} else if (local24 == 'š') {
				local16[local18] = -102;
			} else if (local24 == '›') {
				local16[local18] = -101;
			} else if (local24 == 'œ') {
				local16[local18] = -100;
			} else if (local24 == 'ž') {
				local16[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local16[local18] = -97;
			} else {
				local16[local18] = 63;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
	public static int method5730() {
		@Pc(10) int local10;
		if (!Static104.aClass6_Sub6_Sub1_4.aBoolean125) {
			for (local10 = 0; local10 < Static244.anInt4935; local10++) {
				if (Static353.anInterface13Array1[local10].method7432() == 's' || Static353.anInterface13Array1[local10].method7432() == 'S') {
					Static104.aClass6_Sub6_Sub1_4.aBoolean125 = true;
					break;
				}
			}
		}
		@Pc(56) int local56;
		if (Static357.aClass174_32 == Static262.aClass174_1) {
			@Pc(46) Runtime local46 = Runtime.getRuntime();
			local56 = (int) ((local46.totalMemory() - local46.freeMemory()) / 1024L);
			@Pc(59) long local59 = Static174.method3502();
			if (Static259.aLong119 == 0L) {
				Static259.aLong119 = local59;
			}
			if (local56 > 16384 && local59 - Static259.aLong119 < 5000L) {
				if (local59 - Static548.aLong238 > 1000L) {
					System.gc();
					Static548.aLong238 = local59;
				}
				return 0;
			}
		}
		if (Static357.aClass174_32 == Static262.aClass174_2) {
			if (Static218.aClass204_1 == null) {
				Static218.aClass204_1 = new Class204(Static352.aClass228_3, Static537.aClass281_3, Static293.aBigInteger6, Static512.aBigInteger9);
			}
			if (!Static218.aClass204_1.method4914()) {
				return 0;
			}
			Static270.method4563(0, false);
			Static455.aClass168_104 = Static366.method5848(32, true, false);
			Static191.aClass168_49 = Static366.method5848(33, true, false);
			Static29.aClass168_15 = Static366.method5848(13, true, false);
		}
		if (Static357.aClass174_32 == Static262.aClass174_3) {
			Static191.aClass168_49.method4442();
			local10 = Static206.aClass164_Sub1Array1[33].method4276();
			local10 += Static206.aClass164_Sub1Array1[32].method4276();
			local10 += Static206.aClass164_Sub1Array1[13].method4276();
			local10 += Static191.aClass168_49.method4431();
			if (local10 != 400) {
				return local10 / 4;
			}
			Static38.anInt1215 = Static455.aClass168_104.method4453();
			Static136.anInt2885 = Static191.aClass168_49.method4453();
			Static433.method6620(Static455.aClass168_104);
			local56 = Static104.aClass6_Sub6_Sub1_4.anInt1164;
			Static436.aClass158_1 = new Class158(Static38.aClass162_1, Static286.anInt5468, Static191.aClass168_49);
			@Pc(206) int[] local206 = Static436.aClass158_1.method4117(local56);
			@Pc(211) Class55 local211 = new Class55(Static455.aClass168_104);
			if (local206.length > 0) {
				Static330.anInterface8Array1 = new Interface8[local206.length];
				for (@Pc(223) int local223 = 0; local223 < Static330.anInterface8Array1.length; local223++) {
					Static330.anInterface8Array1[local223] = new Class264(Static436.aClass158_1.method4116(local206[local223]), local211);
				}
			}
		}
		if (Static357.aClass174_32 == Static262.aClass174_4) {
			Static382.method6026(Static29.aClass168_15, Static436.method6658(), Static455.aClass168_104);
		}
		if (Static262.aClass174_5 == Static357.aClass174_32) {
			local10 = Static573.method8088();
			local56 = Static28.method990();
			if (local10 < local56) {
				return local10 * 100 / local56;
			}
		}
		if (Static262.aClass174_6 == Static357.aClass174_32) {
			Static229.method4075(Static323.aClass9_8);
			Static318.method5133(Static323.aClass9_8);
			Static145.method2683(1);
		}
		if (Static262.aClass174_7 == Static357.aClass174_32) {
			for (local10 = 0; local10 < 4; local10++) {
				Static55.aClass194Array1[local10] = Static139.method2601(Static44.anInt1275, Static228.anInt4746);
			}
		}
		if (Static357.aClass174_32 == Static262.aClass174_8) {
			Static132.aClass168_118 = Static366.method5848(8, true, false);
			Static385.aClass168_91 = Static366.method5848(0, true, false);
			Static513.aClass168_117 = Static366.method5848(1, true, false);
			Static206.aClass168_52 = Static366.method5848(2, true, false);
			Static292.aClass168_69 = Static366.method5848(3, true, false);
			Static487.aClass168_112 = Static366.method5848(4, true, false);
			Static257.aClass168_64 = Static366.method5848(5, true, true);
			Static378.aClass168_88 = Static366.method5848(6, false, true);
			Static406.aClass168_127 = Static366.method5848(7, true, false);
			Static372.aClass168_126 = Static366.method5848(9, true, false);
			Static430.aClass168_12 = Static366.method5848(10, true, false);
			Static278.aClass168_67 = Static366.method5848(11, true, false);
			Static318.aClass168_76 = Static366.method5848(12, true, false);
			Static128.aClass168_35 = Static366.method5848(14, false, false);
			Static215.aClass168_53 = Static366.method5848(15, true, false);
			Static235.aClass168_59 = Static366.method5848(16, true, false);
			Static284.aClass168_68 = Static366.method5848(17, true, false);
			Static457.aClass168_105 = Static366.method5848(18, true, false);
			Static17.aClass168_13 = Static366.method5848(19, true, false);
			Static260.aClass168_66 = Static366.method5848(20, true, false);
			Static321.aClass168_78 = Static366.method5848(21, true, false);
			Static381.aClass168_89 = Static366.method5848(22, true, false);
			Static168.aClass168_41 = Static366.method5848(23, true, true);
			Static4.aClass168_6 = Static366.method5848(24, true, false);
			Static304.aClass168_72 = Static366.method5848(25, true, false);
			Static476.aClass168_110 = Static366.method5848(26, true, true);
			Static245.aClass168_61 = Static366.method5848(27, true, false);
			Static503.aClass168_115 = Static366.method5848(28, true, true);
			Static86.aClass168_24 = Static366.method5848(29, true, false);
			Static94.aClass168_25 = Static366.method5848(30, true, true);
			Static107.aClass168_27 = Static366.method5848(31, true, true);
		}
		if (Static262.aClass174_9 == Static357.aClass174_32) {
			local10 = 0;
			for (local56 = 0; local56 < 34; local56++) {
				local10 += Static206.aClass164_Sub1Array1[local56].method4276() * Static310.anIntArray428[local56] / 100;
			}
			if (local10 != 100) {
				return local10;
			}
			Static42.method1134(Static132.aClass168_118);
			Static382.method6026(Static29.aClass168_15, Static436.method6658(), Static132.aClass168_118);
		}
		if (Static262.aClass174_10 == Static357.aClass174_32) {
			Static173.method3499();
			Static145.method2683(2);
		}
		if (Static357.aClass174_32 == Static262.aClass174_11) {
			Static84.method1841(Static94.aClass168_25, Static414.aClass246_5);
		}
		if (Static357.aClass174_32 == Static262.aClass174_12) {
			if (!Static503.aClass168_115.method4442()) {
				return Static503.aClass168_115.method4431();
			}
			Static318.method5134(Static503.aClass168_115.method4438(1));
			Static255.method4463(Static503.aClass168_115.method4438(3));
			if (Static38.anInt1214 != -1 && !Static406.aClass168_127.method4455(Static38.anInt1214, 0)) {
				return 99;
			}
		}
		if (Static357.aClass174_32 == Static262.aClass174_13) {
			local10 = Static437.method6666("jaggl");
			if (local10 >= 0 && local10 < 100) {
				return local10;
			}
		}
		if (Static357.aClass174_32 == Static262.aClass174_14) {
			local10 = Static437.method6666("jagdx");
			if (local10 >= 0 && local10 < 100) {
				return local10;
			}
		}
		if (Static357.aClass174_32 == Static262.aClass174_15) {
			local10 = Static437.method6666("jagmisc");
			if (local10 >= 0 && local10 < 100) {
				return local10;
			}
			if (local10 == 100) {
				Static363.aClient1.method1447();
			}
		}
		if (Static262.aClass174_16 == Static357.aClass174_32) {
			local10 = Static437.method6666("sw3d");
			if (local10 >= 0 && local10 < 100) {
				return local10;
			}
		}
		if (Static357.aClass174_32 == Static262.aClass174_17) {
			local10 = Static437.method6666("jaclib");
			if (local10 >= 0 && local10 < 100) {
				return local10;
			}
			if (local10 == 100) {
				Static363.aClient1.method1435();
			}
		}
		if (Static262.aClass174_18 == Static357.aClass174_32) {
			local10 = Static437.method6666("hw3d");
			if (local10 >= 0 && local10 < 100) {
				return local10;
			}
		}
		if (Static262.aClass174_19 == Static357.aClass174_32 && !Static107.aClass168_27.method4442()) {
			return 0;
		}
		if (Static357.aClass174_32 == Static262.aClass174_20) {
			if (!Static476.aClass168_110.method4442()) {
				return Static476.aClass168_110.method4431();
			}
			Static517.anInterface2_13 = new Class125(Static476.aClass168_110, Static372.aClass168_126, Static132.aClass168_118);
		}
		if (Static262.aClass174_21 == Static357.aClass174_32) {
			Static206.aClass168_52.method4442();
			local10 = Static206.aClass168_52.method4431();
			Static235.aClass168_59.method4442();
			local10 += Static235.aClass168_59.method4431();
			Static284.aClass168_68.method4442();
			local10 += Static284.aClass168_68.method4431();
			Static457.aClass168_105.method4442();
			local10 += Static457.aClass168_105.method4431();
			Static17.aClass168_13.method4442();
			local10 += Static17.aClass168_13.method4431();
			Static260.aClass168_66.method4442();
			local10 += Static260.aClass168_66.method4431();
			Static321.aClass168_78.method4442();
			local10 += Static321.aClass168_78.method4431();
			Static381.aClass168_89.method4442();
			local10 += Static381.aClass168_89.method4431();
			Static4.aClass168_6.method4442();
			local10 += Static4.aClass168_6.method4431();
			Static304.aClass168_72.method4442();
			local10 += Static304.aClass168_72.method4431();
			Static245.aClass168_61.method4442();
			local10 += Static245.aClass168_61.method4431();
			Static86.aClass168_24.method4442();
			local10 += Static86.aClass168_24.method4431();
			if (local10 < 1200) {
				return local10 / 12;
			}
			Static499.aClass118_2 = new Class118(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static416.aClass250_1 = new Class250(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static106.aClass205_1 = new Class205(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52, Static132.aClass168_118);
			Static550.aClass94_1 = new Class94(Static38.aClass162_1, Static286.anInt5468, Static284.aClass168_68);
			Static539.aClass339_6 = new Class339(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static165.aClass25_3 = new Class25(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static517.aClass285_2 = new Class285(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52, Static406.aClass168_127);
			Static409.aClass36_1 = new Class36(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static116.aClass110_1 = new Class110(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static480.aClass57_11 = new Class57(Static38.aClass162_1, Static286.anInt5468, true, Static235.aClass168_59, Static406.aClass168_127);
			Static17.aClass42_3 = new Class42(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52, Static132.aClass168_118);
			Static109.aClass226_3 = new Class226(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52, Static132.aClass168_118);
			Static504.aClass343_2 = new Class343(Static38.aClass162_1, Static286.anInt5468, true, Static457.aClass168_105, Static406.aClass168_127);
			Static98.aClass203_1 = new Class203(Static38.aClass162_1, Static286.anInt5468, true, Static499.aClass118_2, Static17.aClass168_13, Static406.aClass168_127);
			Static72.aClass165_1 = new Class165(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static114.aClass156_2 = new Class156(Static38.aClass162_1, Static286.anInt5468, Static260.aClass168_66, Static385.aClass168_91, Static513.aClass168_117);
			Static61.aClass15_1 = new Class15(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static273.aClass115_1 = new Class115(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static355.aClass278_2 = new Class278(Static38.aClass162_1, Static286.anInt5468, Static321.aClass168_78, Static406.aClass168_127);
			Static370.aClass17_1 = new Class17(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static25.aClass120_1 = new Class120(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static65.aClass302_1 = new Class302(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static177.aClass171_1 = new Class171(Static38.aClass162_1, Static286.anInt5468, Static381.aClass168_89);
			Static329.aClass294_1 = new Class294(Static38.aClass162_1, Static286.anInt5468, Static206.aClass168_52);
			Static226.method4054(Static406.aClass168_127, Static132.aClass168_118, Static29.aClass168_15, Static292.aClass168_69);
			Static174.method3501(Static86.aClass168_24);
			Static189.aClass92_1 = new Class92(Static286.anInt5468, Static4.aClass168_6, Static304.aClass168_72);
			Static96.aClass221_2 = new Class221(Static286.anInt5468, Static4.aClass168_6, Static304.aClass168_72, new Class320());
			Static267.method4540();
			Static480.aClass57_11.method1474(!Static104.aClass6_Sub6_Sub1_4.method1075(Static5.anInt145));
			Static435.aClass234_1 = new Class234();
			Static397.method6265();
			Static381.method6020(Static245.aClass168_61);
			Static478.method7303(Static517.anInterface2_13, Static406.aClass168_127);
		}
		if (Static262.aClass174_22 == Static357.aClass174_32) {
			local10 = Static550.method7858(Static132.aClass168_118) + Static275.method4583(true);
			local56 = Static345.method5634() + Static28.method990();
			if (local56 > local10) {
				return local10 * 100 / local56;
			}
		}
		if (Static357.aClass174_32 == Static262.aClass174_23) {
			if (!Static430.aClass168_12.method4444("huffman", "")) {
				return 0;
			}
			@Pc(1210) Class213 local1210 = new Class213(Static430.aClass168_12.method4450("", "huffman"));
			Static495.method7438(local1210);
		}
		if (Static262.aClass174_24 == Static357.aClass174_32 && !Static292.aClass168_69.method4442()) {
			return Static292.aClass168_69.method4431();
		} else if (Static262.aClass174_25 == Static357.aClass174_32 && !Static318.aClass168_76.method4442()) {
			return Static318.aClass168_76.method4431();
		} else if (Static357.aClass174_32 == Static262.aClass174_26 && !Static29.aClass168_15.method4442()) {
			return Static29.aClass168_15.method4431();
		} else {
			if (Static357.aClass174_32 == Static262.aClass174_27) {
				if (!Static168.aClass168_41.method4437("details")) {
					return Static168.aClass168_41.method4457("details");
				}
				Static461.method103(Static168.aClass168_41, Static539.aClass339_6, Static165.aClass25_3, Static480.aClass57_11, Static17.aClass42_3, Static109.aClass226_3, Static435.aClass234_1);
			}
			if (Static357.aClass174_32 == Static262.aClass174_28) {
				Static30.aBooleanArray4 = new boolean[Static65.aClass302_1.anInt8823];
				Static157.aStringArray44 = new String[Static25.aClass120_1.anInt3957];
				Static67.anIntArray106 = new int[Static65.aClass302_1.anInt8823];
				for (local10 = 0; local10 < Static65.aClass302_1.anInt8823; local10++) {
					if (Static65.aClass302_1.method7382(local10).anInt8903 == 0) {
						Static30.aBooleanArray4[local10] = true;
						Static79.anInt9882++;
					}
					Static67.anIntArray106[local10] = -1;
				}
				Static284.method4662();
				Static538.anInt9264 = Static292.aClass168_69.method4432("loginscreen");
				Static557.anInt9492 = Static292.aClass168_69.method4432("lobbyscreen");
				Static257.aClass168_64.method4451(false);
				Static378.aClass168_88.method4451(true);
				Static132.aClass168_118.method4451(true);
				Static29.aClass168_15.method4451(true);
				Static430.aClass168_12.method4451(true);
				Static292.aClass168_69.method4451(true);
				Static206.aClass168_52.anInt5130 = 2;
				Static32.aBoolean84 = true;
				Static284.aClass168_68.anInt5130 = 2;
				Static235.aClass168_59.anInt5130 = 2;
				Static457.aClass168_105.anInt5130 = 2;
				Static17.aClass168_13.anInt5130 = 2;
				Static260.aClass168_66.anInt5130 = 2;
				Static321.aClass168_78.anInt5130 = 2;
			}
			if (Static357.aClass174_32 == Static262.aClass174_30) {
				Static488.aBoolean662 = Static104.aClass6_Sub6_Sub1_4.aBoolean125;
				Static104.aClass6_Sub6_Sub1_4.aBoolean125 = true;
				Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
				if (Static488.aBoolean662) {
					Static419.method6517(0);
				} else {
					Static419.method6517(Static104.aClass6_Sub6_Sub1_4.anInt1182);
				}
				Static98.method2097(Static104.aClass6_Sub6_Sub1_4.anInt1173, -1, false, -1);
				Static229.method4075(Static323.aClass9_8);
				Static318.method5133(Static323.aClass9_8);
				Static439.method6699(Static323.aClass9_8, Static132.aClass168_118);
				Static150.method6222(Static569.aClass66Array15);
				Static204.method3801(null);
				Static191.aClass168_49 = null;
				Static455.aClass168_104 = null;
				Static436.aClass158_1 = null;
				Static330.anInterface8Array1 = null;
			}
			return Static412.method6427();
		}
	}
}
