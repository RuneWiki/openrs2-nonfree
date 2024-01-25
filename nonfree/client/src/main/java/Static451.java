import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public static int anInt7398;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Z")
	public static boolean aBoolean584 = false;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
	public static int anInt7402 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)V")
	public static void method6277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static114.anInt2640 == 1) {
			Static377.method5583(arg1, arg0, Static106.aClass3_Sub44_3);
		} else if (Static114.anInt2640 == 2) {
			Static4.method57(arg0, arg1);
		}
		Static106.aClass3_Sub44_3 = null;
		Static114.anInt2640 = 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
	public static void method6278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= Static385.anInt6630 && Static69.anInt1918 >= arg2) {
			@Pc(15) int local15 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg0);
			@Pc(21) int local21 = Static157.method2835(Static459.anInt7524, Static110.anInt2597, arg3);
			Static534.method7034(arg2, arg1, local21, local15);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)I")
	public static int method6280() {
		@Pc(10) int local10;
		if (!Static278.aClass3_Sub13_Sub1_1.aBoolean407) {
			for (local10 = 0; local10 < Static187.anInt3653; local10++) {
				if (Static400.anInterface16Array2[local10].method5162() == 's' || Static400.anInterface16Array2[local10].method5162() == 'S') {
					Static278.aClass3_Sub13_Sub1_1.aBoolean407 = true;
					break;
				}
			}
		}
		@Pc(53) int local53;
		if (Static447.aClass281_1 == Static458.aClass281_23) {
			@Pc(44) Runtime local44 = Runtime.getRuntime();
			local53 = (int) ((local44.totalMemory() - local44.freeMemory()) / 1024L);
			@Pc(56) long local56 = Static587.method7753();
			if (Static317.aLong162 == 0L) {
				Static317.aLong162 = local56;
			}
			if (local53 > 16384 && local56 - Static317.aLong162 < 5000L) {
				if (local56 - Static2.aLong1 > 1000L) {
					System.gc();
					Static2.aLong1 = local56;
				}
				return 0;
			}
		}
		if (Static447.aClass281_2 == Static458.aClass281_23) {
			if (Static259.aClass296_6 == null) {
				Static259.aClass296_6 = new Class296(Static153.aClass331_1, Static546.aClass125_3, Static533.aBigInteger7, Static169.aBigInteger3);
			}
			if (!Static259.aClass296_6.method6474()) {
				return 0;
			}
			Static498.method6714(0, null);
			Static459.aBoolean595 = !Static402.method5861();
			Static520.aClass246_242 = Static531.method7008(false, Static459.aBoolean595 ? 34 : 32);
			Static222.aClass246_274 = Static531.method7008(false, 33);
			Static467.aClass246_221 = Static531.method7008(false, 13);
		}
		if (Static458.aClass281_23 == Static447.aClass281_3) {
			Static222.aClass246_274.method5649();
			local10 = Static478.aClass303_Sub1Array2[33].method6966();
			local10 += Static478.aClass303_Sub1Array2[Static459.aBoolean595 ? 34 : 32].method6966();
			local10 += Static478.aClass303_Sub1Array2[13].method6966();
			local10 += Static222.aClass246_274.method5656();
			if (local10 != 400) {
				return local10 / 4;
			}
			Static372.anInt6337 = Static520.aClass246_242.method5666();
			Static565.anInt9104 = Static222.aClass246_274.method5666();
			Static288.method4545(Static520.aClass246_242);
			local53 = Static278.aClass3_Sub13_Sub1_1.anInt5134;
			Static437.aClass210_1 = new Class210(Static227.aClass211_1, Static131.anInt2839, Static222.aClass246_274);
			@Pc(219) int[] local219 = Static437.aClass210_1.method4967(local53);
			@Pc(225) Class311 local225 = new Class311(Static520.aClass246_242, Static467.aClass246_221);
			if (local219.length > 0) {
				Static105.anInterface13Array4 = new Interface13[local219.length];
				for (@Pc(234) int local234 = 0; local234 < Static105.anInterface13Array4.length; local234++) {
					Static105.anInterface13Array4[local234] = new Class231(Static437.aClass210_1.method4964(local219[local234]), local225);
				}
			}
		}
		if (Static458.aClass281_23 == Static447.aClass281_4) {
			Static20.method431(Static409.method5567(), Static467.aClass246_221, Static520.aClass246_242);
		}
		if (Static458.aClass281_23 == Static447.aClass281_5) {
			local10 = Static509.method6824();
			local53 = Static581.method7694();
			if (local53 > local10) {
				return local10 * 100 / local53;
			}
		}
		if (Static458.aClass281_23 == Static447.aClass281_6) {
			if (Static105.anInterface13Array4 != null && Static105.anInterface13Array4.length > 0) {
				if (Static105.anInterface13Array4[0].method5346() < 100) {
					return 0;
				}
				if (Static105.anInterface13Array4.length > 1 && Static437.aClass210_1.method4963() && Static105.anInterface13Array4[1].method5346() < 100) {
					return 0;
				}
			}
			Static424.method6051(Static4.aClass43_1);
			Static39.method724(Static4.aClass43_1);
			Static113.method2374(1);
		}
		if (Static447.aClass281_7 == Static458.aClass281_23) {
			for (local10 = 0; local10 < 4; local10++) {
				Static221.aClass95Array2[local10] = Static352.method4081(Static400.anInt6818, Static271.anInt5050);
			}
		}
		if (Static447.aClass281_8 == Static458.aClass281_23) {
			Static171.aClass246_84 = Static531.method7008(false, 8);
			Static104.aClass246_56 = Static531.method7008(false, 0);
			Static287.aClass246_135 = Static531.method7008(false, 1);
			Static531.aClass246_249 = Static531.method7008(false, 2);
			Static415.aClass246_259 = Static531.method7008(false, 3);
			Static35.aClass246_28 = Static531.method7008(false, 4);
			Static565.aClass246_261 = Static531.method7008(true, 5);
			Static576.aClass246_267 = Static531.method7008(true, 6);
			Static384.aClass246_184 = Static531.method7008(false, 7);
			Static202.aClass246_101 = Static531.method7008(false, 9);
			Static325.aClass246_158 = Static531.method7008(false, 10);
			Static444.aClass246_208 = Static531.method7008(false, 11);
			Static151.aClass246_77 = Static531.method7008(false, 12);
			Static437.aClass246_205 = Static531.method7008(false, 14);
			Static500.aClass246_235 = Static531.method7008(false, 15);
			Static114.aClass246_67 = Static531.method7008(false, 16);
			Static463.aClass246_219 = Static531.method7008(false, 17);
			Static79.aClass246_44 = Static531.method7008(false, 18);
			Static329.aClass246_162 = Static531.method7008(false, 19);
			Static462.aClass246_218 = Static531.method7008(false, 20);
			Static530.aClass246_248 = Static531.method7008(false, 21);
			Static334.aClass246_165 = Static531.method7008(false, 22);
			Static494.aClass246_232 = Static531.method7008(true, 23);
			Static376.aClass246_180 = Static531.method7008(false, 24);
			Static285.aClass246_133 = Static531.method7008(false, 25);
			Static89.aClass246_46 = Static531.method7008(true, 26);
			Static207.aClass246_105 = Static531.method7008(false, 27);
			Static549.aClass246_251 = Static531.method7008(true, 28);
			Static89.aClass246_47 = Static531.method7008(false, 29);
			Static329.aClass246_161 = Static531.method7008(true, 30);
			Static542.aClass246_250 = Static531.method7008(true, 31);
		}
		if (Static447.aClass281_9 == Static458.aClass281_23) {
			local10 = 0;
			for (local53 = 0; local53 < 35; local53++) {
				if (Static478.aClass303_Sub1Array2[local53] != null) {
					local10 += Static478.aClass303_Sub1Array2[local53].method6966() * Static403.anIntArray544[local53] / 100;
				}
			}
			if (local10 != 100) {
				if (Static215.anInt4260 < 0) {
					Static215.anInt4260 = local10;
				}
				return (local10 - Static215.anInt4260) * 100 / (100 - Static215.anInt4260);
			}
			Static516.method6880(Static171.aClass246_84);
			Static20.method431(Static409.method5567(), Static467.aClass246_221, Static171.aClass246_84);
		}
		if (Static447.aClass281_10 == Static458.aClass281_23) {
			Static511.method6830();
			Static113.method2374(2);
		}
		if (Static447.aClass281_11 == Static458.aClass281_23) {
			Static519.method6918(Static409.aClass221_6, Static329.aClass246_161);
		}
		if (Static458.aClass281_23 == Static447.aClass281_12) {
			local10 = Static69.method1643();
			if (local10 < 100) {
				return local10;
			}
			Static122.method2528(Static549.aClass246_251.method5679(1));
			Static141.method2714(Static549.aClass246_251.method5679(3));
		}
		if (Static458.aClass281_23 == Static447.aClass281_13) {
			if (Static488.anInt7869 != -1 && !Static384.aClass246_184.method5654(Static488.anInt7869, 0)) {
				return 99;
			}
			Static56.anInterface8_3 = new Class304(Static89.aClass246_46, Static202.aClass246_101, Static171.aClass246_84);
			Static69.aClass118_1 = new Class118(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static363.aClass135_1 = new Class135(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static172.aClass219_1 = new Class219(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249, Static171.aClass246_84);
			Static11.aClass155_1 = new Class155(Static227.aClass211_1, Static131.anInt2839, Static463.aClass246_219);
			Static31.aClass305_1 = new Class305(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static545.aClass201_5 = new Class201(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static107.aClass352_2 = new Class352(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249, Static384.aClass246_184);
			Static258.aClass302_1 = new Class302(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static483.aClass2_1 = new Class2(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static476.aClass69_5 = new Class69(Static227.aClass211_1, Static131.anInt2839, true, Static114.aClass246_67, Static384.aClass246_184);
			Static191.aClass168_2 = new Class168(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249, Static171.aClass246_84);
			Static453.aClass348_3 = new Class348(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249, Static171.aClass246_84);
			Static510.aClass284_2 = new Class284(Static227.aClass211_1, Static131.anInt2839, true, Static79.aClass246_44, Static384.aClass246_184);
			Static517.aClass145_1 = new Class145(Static227.aClass211_1, Static131.anInt2839, true, Static69.aClass118_1, Static329.aClass246_162, Static384.aClass246_184);
			Static268.aClass79_1 = new Class79(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static330.aClass279_2 = new Class279(Static227.aClass211_1, Static131.anInt2839, Static462.aClass246_218, Static104.aClass246_56, Static287.aClass246_135);
			Static257.aClass182_1 = new Class182(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static125.aClass349_1 = new Class349(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static547.aClass248_2 = new Class248(Static227.aClass211_1, Static131.anInt2839, Static530.aClass246_248, Static384.aClass246_184);
			Static405.aClass71_1 = new Class71(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static273.aClass131_2 = new Class131(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static361.aClass329_1 = new Class329(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static165.aClass212_1 = new Class212(Static227.aClass211_1, Static131.anInt2839, Static334.aClass246_165);
			Static157.aClass195_1 = new Class195(Static227.aClass211_1, Static131.anInt2839, Static531.aClass246_249);
			Static89.method2013(Static415.aClass246_259, Static171.aClass246_84, Static467.aClass246_221, Static384.aClass246_184);
			Static559.method7438(Static89.aClass246_47);
			Static90.aClass22_1 = new Class22(Static131.anInt2839, Static376.aClass246_180, Static285.aClass246_133);
			Static459.aClass290_1 = new Class290(Static131.anInt2839, Static376.aClass246_180, Static285.aClass246_133, new Class172());
			Static445.method6253();
			Static476.aClass69_5.method2178(!Static278.aClass3_Sub13_Sub1_1.method4485(Static260.anInt4932));
			Static427.aClass56_1 = new Class56();
			Static385.method5693();
			Static422.method6020(Static207.aClass246_105);
			Static436.method6151(Static384.aClass246_184, Static56.anInterface8_3);
			@Pc(909) Class49 local909 = new Class49(Static325.aClass246_158.method5648("huffman", ""));
			Static113.method2368(local909);
			try {
				jagmisc.init();
			} catch (@Pc(916) Throwable local916) {
			}
			Static270.aClass77_1 = Static4.method61();
		}
		if (Static447.aClass281_15 == Static458.aClass281_23) {
			local10 = Static400.method5832(Static171.aClass246_84) + Static157.method2837(true);
			local53 = Static37.method657() + Static581.method7694();
			if (local53 > local10) {
				return local10 * 100 / local53;
			}
		}
		if (Static447.aClass281_16 == Static458.aClass281_23) {
			Static284.method6635(Static494.aClass246_232, Static31.aClass305_1, Static545.aClass201_5, Static476.aClass69_5, Static191.aClass168_2, Static453.aClass348_3, Static427.aClass56_1);
		}
		if (Static458.aClass281_23 == Static447.aClass281_17) {
			Static376.aBooleanArray27 = new boolean[Static361.aClass329_1.anInt8330];
			Static230.aStringArray30 = new String[Static273.aClass131_2.anInt4012];
			Static99.anIntArray166 = new int[Static361.aClass329_1.anInt8330];
			for (local10 = 0; local10 < Static361.aClass329_1.anInt8330; local10++) {
				if (Static361.aClass329_1.method6989(local10).anInt4554 == 0) {
					Static376.aBooleanArray27[local10] = true;
					Static167.anInt3319++;
				}
				Static99.anIntArray166[local10] = -1;
			}
			Static323.method7772();
			Static576.anInt9188 = Static415.aClass246_259.method5665("loginscreen");
			Static437.anInt7265 = Static415.aClass246_259.method5665("lobbyscreen");
			Static565.aClass246_261.method5672(false);
			Static576.aClass246_267.method5672(true);
			Static171.aClass246_84.method5672(true);
			Static467.aClass246_221.method5672(true);
			Static325.aClass246_158.method5672(true);
			Static415.aClass246_259.method5672(true);
			Static531.aClass246_249.anInt6627 = 2;
			Static248.aBoolean725 = true;
			Static463.aClass246_219.anInt6627 = 2;
			Static114.aClass246_67.anInt6627 = 2;
			Static79.aClass246_44.anInt6627 = 2;
			Static329.aClass246_162.anInt6627 = 2;
			Static462.aClass246_218.anInt6627 = 2;
			Static530.aClass246_248.anInt6627 = 2;
		}
		@Pc(1085) Class203 local1085;
		if (Static458.aClass281_23 == Static447.aClass281_18) {
			if (!Static87.method1968(Static576.anInt9188)) {
				return 0;
			}
			for (local10 = 0; local10 < Static59.aClass203ArrayArray3[Static576.anInt9188].length; local10++) {
				local1085 = Static59.aClass203ArrayArray3[Static576.anInt9188][local10];
				if (local1085.anInt5473 == 5 && local1085.anInt5496 != -1) {
					local1085.method4772(Static4.aClass43_1);
				}
			}
		}
		if (Static458.aClass281_23 == Static447.aClass281_19) {
			for (local10 = 0; local10 < Static59.aClass203ArrayArray3[Static576.anInt9188].length; local10++) {
				local1085 = Static59.aClass203ArrayArray3[Static576.anInt9188][local10];
				if (local1085.anInt5473 == 5 && local1085.anInt5496 != -1 && local1085.method4772(Static4.aClass43_1) == null && Static80.aBoolean705) {
					return 0;
				}
			}
		}
		if (Static447.aClass281_20 == Static458.aClass281_23) {
			Static197.method3569(true);
		}
		if (Static447.aClass281_21 == Static458.aClass281_23) {
			Static268.aClass366_1.method7800();
			try {
				Static516.aThread7.join();
			} catch (@Pc(1170) InterruptedException local1170) {
				return 0;
			}
			Static437.aClass210_1 = null;
			Static520.aClass246_242 = null;
			Static105.anInterface13Array4 = null;
			Static516.aThread7 = null;
			Static222.aClass246_274 = null;
			Static268.aClass366_1 = null;
			Static419.method7096();
			Static211.aBoolean324 = Static278.aClass3_Sub13_Sub1_1.aBoolean407;
			Static278.aClass3_Sub13_Sub1_1.aBoolean407 = true;
			Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
			if (Static211.aBoolean324) {
				Static137.method2648(0);
			} else {
				Static137.method2648(Static278.aClass3_Sub13_Sub1_1.anInt5130);
			}
			Static29.method547(-1, Static278.aClass3_Sub13_Sub1_1.anInt5151, -1, false);
			Static424.method6051(Static4.aClass43_1);
			Static39.method724(Static4.aClass43_1);
			Static560.method7464(Static171.aClass246_84, Static4.aClass43_1);
			Static151.method2790(Static90.aClass46Array4);
		}
		return Static178.method6931();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
	public static void method6283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class217 local14 = Static370.aClass217ArrayArray1[arg0][arg1];
		if (local14 != null) {
			Static79.anInt2013 = local14.anInt5953;
			Static163.anInt3264 = local14.anInt5955;
			Static250.anInt4575 = local14.anInt5954;
		}
		Static489.method6651();
	}
}
