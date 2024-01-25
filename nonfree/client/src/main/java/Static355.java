import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!oaa", name = "h", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_116 = new Class47(1, 2);

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "Z")
	public static volatile boolean aBoolean508 = false;

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
	public static int anInt7386 = -1;

	@OriginalMember(owner = "client!oaa", name = "l", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_136 = new Class73(94, 10);

	@OriginalMember(owner = "client!oaa", name = "m", descriptor = "[I")
	public static final int[] anIntArray533 = new int[8];

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)I")
	public static int method6094() {
		@Pc(6) int local6;
		if (!Static140.aClass6_Sub48_Sub1_1.aBoolean686) {
			for (local6 = 0; local6 < Static21.anInt685; local6++) {
				if (Static551.anInterface8Array2[local6].method1040() == 's' || Static551.anInterface8Array2[local6].method1040() == 'S') {
					Static140.aClass6_Sub48_Sub1_1.aBoolean686 = true;
					break;
				}
			}
		}
		@Pc(53) int local53;
		if (Static262.aClass178_2 == Static164.aClass178_1) {
			@Pc(44) Runtime local44 = Runtime.getRuntime();
			local53 = (int) ((local44.totalMemory() - local44.freeMemory()) / 1024L);
			@Pc(56) long local56 = Static8.method201();
			if (Static577.aLong259 == 0L) {
				Static577.aLong259 = local56;
			}
			if (local53 > 16384 && local56 - Static577.aLong259 < 5000L) {
				if (local56 - Static382.aLong183 > 1000L) {
					System.gc();
					Static382.aLong183 = local56;
				}
				return 0;
			}
		}
		if (Static262.aClass178_3 == Static164.aClass178_1) {
			if (Static399.aClass13_1 == null) {
				Static399.aClass13_1 = new Class13(Static489.aClass163_3, Static142.aClass55_4, Static481.aBigInteger11, Static397.aBigInteger10);
			}
			if (!Static399.aClass13_1.method328()) {
				return 0;
			}
			Static423.method6100(0, null);
			Static578.aBoolean725 = !Static320.method5062();
			Static570.aClass251_126 = Static6.method3517(true, Static578.aBoolean725 ? 34 : 32, false);
			Static229.aClass251_62 = Static6.method3517(true, 33, false);
			Static264.aClass251_66 = Static6.method3517(true, 13, false);
		}
		if (Static262.aClass178_4 == Static164.aClass178_1) {
			Static229.aClass251_62.method5758();
			local6 = Static197.aClass160_Sub1Array2[33].method6364();
			local6 += Static197.aClass160_Sub1Array2[Static578.aBoolean725 ? 34 : 32].method6364();
			local6 += Static197.aClass160_Sub1Array2[13].method6364();
			local6 += Static229.aClass251_62.method5771();
			if (local6 != 400) {
				return local6 / 4;
			}
			Static225.anInt4647 = Static570.aClass251_126.method5779();
			Static467.anInt8010 = Static229.aClass251_62.method5779();
			Static142.method7768(Static570.aClass251_126);
			local53 = Static140.aClass6_Sub48_Sub1_1.anInt9001;
			Static391.aClass21_1 = new Class21(Static317.aClass37_3, Static25.anInt769, Static229.aClass251_62);
			@Pc(215) int[] local215 = Static391.aClass21_1.method852(local53);
			@Pc(221) Class198 local221 = new Class198(Static570.aClass251_126, Static264.aClass251_66);
			if (local215.length > 0) {
				Static294.anInterface12Array1 = new Interface12[local215.length];
				for (@Pc(233) int local233 = 0; local233 < Static294.anInterface12Array1.length; local233++) {
					Static294.anInterface12Array1[local233] = new Class114(Static391.aClass21_1.method855(local215[local233]), local221);
				}
			}
		}
		if (Static262.aClass178_5 == Static164.aClass178_1) {
			Static234.method4079(Static570.aClass251_126, Static264.aClass251_66, Static71.method1416());
		}
		if (Static164.aClass178_1 == Static262.aClass178_6) {
			local6 = Static189.method3424();
			local53 = Static198.method3583();
			if (local53 > local6) {
				return local6 * 100 / local53;
			}
		}
		if (Static262.aClass178_7 == Static164.aClass178_1) {
			if (Static294.anInterface12Array1 != null && Static294.anInterface12Array1.length > 0) {
				if (Static294.anInterface12Array1[0].method5733() < 100) {
					return 0;
				}
				if (Static294.anInterface12Array1.length > 1 && Static391.aClass21_1.method856() && Static294.anInterface12Array1[1].method5733() < 100) {
					return 0;
				}
			}
			Static389.method5727(Static240.aClass14_7);
			Static511.method7089(Static240.aClass14_7);
			Static449.method6350(1);
		}
		if (Static262.aClass178_8 == Static164.aClass178_1) {
			for (local6 = 0; local6 < 4; local6++) {
				Static579.aClass189Array4[local6] = Static385.method5691(Static473.anInt8075, Static165.anInt6749);
			}
		}
		if (Static262.aClass178_9 == Static164.aClass178_1) {
			Static398.aClass251_94 = Static6.method3517(true, 8, false);
			Static552.aClass251_125 = Static6.method3517(true, 0, false);
			Static328.aClass251_81 = Static6.method3517(true, 1, false);
			Static579.aClass251_129 = Static6.method3517(true, 2, false);
			Static284.aClass251_68 = Static6.method3517(true, 3, false);
			Static58.aClass251_18 = Static6.method3517(true, 4, false);
			Static70.aClass251_58 = Static6.method3517(true, 5, true);
			Static370.aClass251_89 = Static6.method3517(false, 6, true);
			Static145.aClass251_40 = Static6.method3517(true, 7, false);
			Static99.aClass251_25 = Static6.method3517(true, 9, false);
			Static466.aClass251_111 = Static6.method3517(true, 10, false);
			Static540.aClass251_59 = Static6.method3517(true, 11, false);
			Static466.aClass251_110 = Static6.method3517(true, 12, false);
			Static423.aClass251_97 = Static6.method3517(false, 14, false);
			Static13.aClass251_101 = Static6.method3517(true, 15, false);
			Static341.aClass251_84 = Static6.method3517(true, 16, false);
			Static438.aClass251_99 = Static6.method3517(true, 17, false);
			Static48.aClass251_14 = Static6.method3517(true, 18, false);
			Static114.aClass251_27 = Static6.method3517(true, 19, false);
			Static447.aClass251_104 = Static6.method3517(true, 20, false);
			Static459.aClass251_108 = Static6.method3517(true, 21, false);
			Static156.aClass251_48 = Static6.method3517(true, 22, false);
			Static4.aClass251_4 = Static6.method3517(true, 23, true);
			Static313.aClass251_75 = Static6.method3517(true, 24, false);
			Static533.aClass251_123 = Static6.method3517(true, 25, false);
			Static455.aClass251_106 = Static6.method3517(true, 26, true);
			Static476.aClass251_113 = Static6.method3517(true, 27, false);
			Static89.aClass251_23 = Static6.method3517(true, 28, true);
			Static132.aClass251_33 = Static6.method3517(true, 29, false);
			Static368.aClass251_88 = Static6.method3517(true, 30, true);
			Static13.aClass251_100 = Static6.method3517(true, 31, true);
		}
		if (Static164.aClass178_1 == Static262.aClass178_10) {
			local6 = 0;
			for (local53 = 0; local53 < 35; local53++) {
				if (Static197.aClass160_Sub1Array2[local53] != null) {
					local6 += Static197.aClass160_Sub1Array2[local53].method6364() * Static347.anIntArray462[local53] / 100;
				}
			}
			if (local6 != 100) {
				if (Static99.anInt1913 < 0) {
					Static99.anInt1913 = local6;
				}
				return (local6 - Static99.anInt1913) * 100 / (100 - Static99.anInt1913);
			}
			Static166.method3158(Static398.aClass251_94);
			Static234.method4079(Static398.aClass251_94, Static264.aClass251_66, Static71.method1416());
		}
		if (Static262.aClass178_11 == Static164.aClass178_1) {
			Static286.method4665();
			Static449.method6350(2);
		}
		if (Static164.aClass178_1 == Static262.aClass178_12) {
			Static488.method4439(Static352.aClass272_2, Static368.aClass251_88);
		}
		if (Static164.aClass178_1 == Static262.aClass178_13) {
			local6 = Static115.method2012();
			if (local6 < 100) {
				return local6;
			}
			Static71.method1417(Static89.aClass251_23.method5761(1));
			Static491.method6719(Static89.aClass251_23.method5761(3));
		}
		if (Static164.aClass178_1 == Static262.aClass178_14) {
			if (Static36.anInt956 != -1 && !Static145.aClass251_40.method5780(0, Static36.anInt956)) {
				return 99;
			}
			Static488.anInterface4_11 = new Class165(Static455.aClass251_106, Static99.aClass251_25, Static398.aClass251_94);
			Static577.aClass185_2 = new Class185(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static333.aClass149_1 = new Class149(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static543.aClass112_2 = new Class112(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129, Static398.aClass251_94);
			Static594.aClass9_1 = new Class9(Static317.aClass37_3, Static25.anInt769, Static438.aClass251_99);
			Static349.aClass206_5 = new Class206(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static264.aClass126_5 = new Class126(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static304.aClass333_1 = new Class333(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129, Static145.aClass251_40);
			Static134.aClass169_1 = new Class169(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static507.aClass196_1 = new Class196(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static412.aClass307_4 = new Class307(Static317.aClass37_3, Static25.anInt769, true, Static341.aClass251_84, Static145.aClass251_40);
			Static245.aClass213_3 = new Class213(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129, Static398.aClass251_94);
			Static418.aClass3_4 = new Class3(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129, Static398.aClass251_94);
			Static577.aClass125_2 = new Class125(Static317.aClass37_3, Static25.anInt769, true, Static48.aClass251_14, Static145.aClass251_40);
			Static444.aClass322_2 = new Class322(Static317.aClass37_3, Static25.anInt769, true, Static577.aClass185_2, Static114.aClass251_27, Static145.aClass251_40);
			Static586.aClass89_1 = new Class89(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static78.aClass298_2 = new Class298(Static317.aClass37_3, Static25.anInt769, Static447.aClass251_104, Static552.aClass251_125, Static328.aClass251_81);
			Static209.aClass270_1 = new Class270(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static230.aClass306_1 = new Class306(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static289.aClass66_7 = new Class66(Static317.aClass37_3, Static25.anInt769, Static459.aClass251_108, Static145.aClass251_40);
			Static121.aClass99_1 = new Class99(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static290.aClass95_1 = new Class95(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static577.aClass80_1 = new Class80(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static183.aClass316_1 = new Class316(Static317.aClass37_3, Static25.anInt769, Static156.aClass251_48);
			Static509.aClass208_6 = new Class208(Static317.aClass37_3, Static25.anInt769, Static579.aClass251_129);
			Static315.method4664(Static398.aClass251_94, Static145.aClass251_40, Static264.aClass251_66, Static284.aClass251_68);
			Static102.method1824(Static132.aClass251_33);
			Static383.aClass218_2 = new Class218(Static25.anInt769, Static313.aClass251_75, Static533.aClass251_123);
			Static266.aClass248_2 = new Class248(Static25.anInt769, Static313.aClass251_75, Static533.aClass251_123, new Class193());
			Static289.method4660();
			Static412.aClass307_4.method6631(!Static140.aClass6_Sub48_Sub1_1.method7389(Static560.anInt9242));
			Static498.aClass101_1 = new Class101();
			Static468.method6538();
			Static515.method7129(Static476.aClass251_113);
			Static228.method4051(Static145.aClass251_40, Static488.anInterface4_11);
			@Pc(929) Class356 local929 = new Class356(Static466.aClass251_111.method5762("", "huffman"));
			Static276.method4553(local929);
			try {
				jagmisc.init();
			} catch (@Pc(936) Throwable local936) {
			}
			Static25.aClass43_1 = Static59.method1230();
		}
		if (Static262.aClass178_16 == Static164.aClass178_1) {
			local53 = Static210.method3729(Static398.aClass251_94) + Static329.method5151(true);
			@Pc(965) int local965 = Static222.method3988() + Static198.method3583();
			if (local53 < local965) {
				return local53 * 100 / local965;
			}
		}
		if (Static262.aClass178_17 == Static164.aClass178_1) {
			Static217.method3352(Static4.aClass251_4, Static349.aClass206_5, Static264.aClass126_5, Static412.aClass307_4, Static245.aClass213_3, Static418.aClass3_4, Static498.aClass101_1);
		}
		if (Static164.aClass178_1 == Static262.aClass178_18) {
			Static334.aStringArray24 = new String[Static290.aClass95_1.anInt3017];
			Static395.anIntArray511 = new int[Static577.aClass80_1.anInt2176];
			Static165.aBooleanArray29 = new boolean[Static577.aClass80_1.anInt2176];
			for (local53 = 0; local53 < Static577.aClass80_1.anInt2176; local53++) {
				if (Static577.aClass80_1.method1993(local53).anInt6055 == 0) {
					Static165.aBooleanArray29[local53] = true;
					Static88.anInt1751++;
				}
				Static395.anIntArray511[local53] = -1;
			}
			Static204.method2860();
			Static532.anInt8836 = Static284.aClass251_68.method5764("loginscreen");
			Static112.anInt2175 = Static284.aClass251_68.method5764("lobbyscreen");
			Static70.aClass251_58.method5759(false);
			Static370.aClass251_89.method5759(true);
			Static398.aClass251_94.method5759(true);
			Static264.aClass251_66.method5759(true);
			Static466.aClass251_111.method5759(true);
			Static284.aClass251_68.method5759(true);
			Static579.aClass251_129.anInt6868 = 2;
			Static420.aBoolean505 = true;
			Static438.aClass251_99.anInt6868 = 2;
			Static341.aClass251_84.anInt6868 = 2;
			Static48.aClass251_14.anInt6868 = 2;
			Static114.aClass251_27.anInt6868 = 2;
			Static447.aClass251_104.anInt6868 = 2;
			Static459.aClass251_108.anInt6868 = 2;
		}
		@Pc(1119) Class292 local1119;
		if (Static164.aClass178_1 == Static262.aClass178_19) {
			if (!Static508.method7071(Static532.anInt8836)) {
				return 0;
			}
			for (local53 = 0; local53 < Static14.aClass292ArrayArray1[Static532.anInt8836].length; local53++) {
				local1119 = Static14.aClass292ArrayArray1[Static532.anInt8836][local53];
				if (local1119.lb == 5 && local1119.anInt7946 != -1) {
					local1119.method6468(Static240.aClass14_7);
				}
			}
		}
		if (Static164.aClass178_1 == Static262.aClass178_20) {
			for (local53 = 0; local53 < Static14.aClass292ArrayArray1[Static532.anInt8836].length; local53++) {
				local1119 = Static14.aClass292ArrayArray1[Static532.anInt8836][local53];
				if (local1119.lb == 5 && local1119.anInt7946 != -1 && local1119.method6468(Static240.aClass14_7) == null && Static419.aBoolean504) {
					return 0;
				}
			}
		}
		if (Static164.aClass178_1 == Static262.aClass178_21) {
			Static2.method66(true);
		}
		if (Static262.aClass178_22 == Static164.aClass178_1) {
			Static509.aClass236_6.method5511();
			try {
				Static111.aThread3.join();
			} catch (@Pc(1192) InterruptedException local1192) {
				return 0;
			}
			Static151.aBoolean241 = Static140.aClass6_Sub48_Sub1_1.aBoolean686;
			Static140.aClass6_Sub48_Sub1_1.aBoolean686 = true;
			Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
			if (Static151.aBoolean241) {
				Static293.method4707(0);
			} else {
				Static293.method4707(Static140.aClass6_Sub48_Sub1_1.anInt8996);
			}
			Static235.method4083(false, Static140.aClass6_Sub48_Sub1_1.anInt9003, -1, -1);
			Static389.method5727(Static240.aClass14_7);
			Static511.method7089(Static240.aClass14_7);
			Static230.method4062(Static398.aClass251_94, Static240.aClass14_7);
			Static150.method2878(Static241.aClass58Array12);
			Static229.aClass251_62 = null;
			Static570.aClass251_126 = null;
			Static294.anInterface12Array1 = null;
			Static391.aClass21_1 = null;
		}
		return Static64.method4913();
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZII)I")
	public static int method6096(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(17) int local17 = arg2 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg2;
		@Pc(33) int local33 = Static98.method1772(local7, local17);
		@Pc(40) int local40 = Static98.method1772(local7 + 1, local17);
		@Pc(47) int local47 = Static98.method1772(local7, local17 + 1);
		@Pc(56) int local56 = Static98.method1772(local7 + 1, local17 + 1);
		@Pc(63) int local63 = Static433.method6199(arg1, local33, local40, local13);
		@Pc(70) int local70 = Static433.method6199(arg1, local47, local56, local13);
		return Static433.method6199(arg1, local63, local70, local23);
	}
}
