import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!vfa", name = "t", descriptor = "Lclient!mq;")
	public static Class212 aClass212_9;

	@OriginalMember(owner = "client!vfa", name = "w", descriptor = "F")
	public static float aFloat151;

	@OriginalMember(owner = "client!vfa", name = "q", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_110 = new Class287(21, -1);

	@OriginalMember(owner = "client!vfa", name = "s", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_223 = new Class123(1, -1);

	@OriginalMember(owner = "client!vfa", name = "v", descriptor = "Z")
	public static boolean aBoolean468 = false;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)I")
	public static int method5335() {
		@Pc(10) int local10;
		if (!Static348.aClass3_Sub51_Sub1_5.aBoolean687) {
			for (local10 = 0; local10 < Static294.anInt5507; local10++) {
				if (Static487.anInterface21Array2[local10].method5125() == 's' || Static487.anInterface21Array2[local10].method5125() == 'S') {
					Static348.aClass3_Sub51_Sub1_5.aBoolean687 = true;
					break;
				}
			}
		}
		@Pc(54) int local54;
		if (Static338.aClass106_24 == Static152.aClass106_1) {
			@Pc(44) Runtime local44 = Runtime.getRuntime();
			local54 = (int) ((local44.totalMemory() - local44.freeMemory()) / 1024L);
			@Pc(57) long local57 = Static96.method2000();
			if (Static266.aLong126 == 0L) {
				Static266.aLong126 = local57;
			}
			if (local54 > 16384 && local57 - Static266.aLong126 < 5000L) {
				if (local57 - Static456.aLong217 > 1000L) {
					System.gc();
					Static456.aLong217 = local57;
				}
				return 0;
			}
		}
		if (Static338.aClass106_24 == Static152.aClass106_2) {
			if (Static87.aClass308_6 == null) {
				Static87.aClass308_6 = new Class308(Static153.aClass117_1, Static533.aClass291_3, Static557.aBigInteger6, Static29.aBigInteger7);
			}
			if (!Static87.aClass308_6.method6724()) {
				return 0;
			}
			Static363.method4394(0, null);
			Static579.aBoolean695 = !Static389.method6677();
			Static278.aClass284_85 = Static287.method4311(false, Static579.aBoolean695 ? 34 : 32);
			Static479.aClass284_140 = Static287.method4311(false, 33);
			Static336.aClass284_99 = Static287.method4311(false, 13);
		}
		if (Static152.aClass106_3 == Static338.aClass106_24) {
			Static479.aClass284_140.method6321();
			local10 = Static449.aClass98_Sub1Array1[33].method4625();
			local10 += Static449.aClass98_Sub1Array1[Static579.aBoolean695 ? 34 : 32].method4625();
			local10 += Static449.aClass98_Sub1Array1[13].method4625();
			local10 += Static479.aClass284_140.method6350();
			if (local10 != 400) {
				return local10 / 4;
			}
			Static192.anInt4149 = Static278.aClass284_85.method6332();
			Static194.anInt4231 = Static479.aClass284_140.method6332();
			Static438.method3440(Static278.aClass284_85);
			local54 = Static348.aClass3_Sub51_Sub1_5.anInt9964;
			Static575.aClass24_2 = new Class24(Static31.aClass89_1, Static201.anInt4321, Static479.aClass284_140);
			@Pc(213) int[] local213 = Static575.aClass24_2.method240(local54);
			@Pc(219) Class138 local219 = new Class138(Static278.aClass284_85, Static336.aClass284_99);
			if (local213.length > 0) {
				Static596.anInterface23Array1 = new Interface23[local213.length];
				for (@Pc(231) int local231 = 0; local231 < Static596.anInterface23Array1.length; local231++) {
					Static596.anInterface23Array1[local231] = new Class366(Static575.aClass24_2.method242(local213[local231]), local219);
				}
			}
		}
		if (Static338.aClass106_24 == Static152.aClass106_4) {
			Static164.method2975(Static336.aClass284_99, Static481.method6561(), Static278.aClass284_85);
		}
		if (Static338.aClass106_24 == Static152.aClass106_5) {
			local10 = Static183.method3251();
			local54 = Static131.method2506();
			if (local54 > local10) {
				return local10 * 100 / local54;
			}
		}
		if (Static152.aClass106_6 == Static338.aClass106_24) {
			if (Static596.anInterface23Array1 != null && Static596.anInterface23Array1.length > 0) {
				if (Static596.anInterface23Array1[0].method8167() < 100) {
					return 0;
				}
				if (Static596.anInterface23Array1.length > 1 && Static575.aClass24_2.method246() && Static596.anInterface23Array1[1].method8167() < 100) {
					return 0;
				}
			}
			Static481.method6558(Static319.aClass31_11);
			Static420.method5838(Static319.aClass31_11);
			Static27.method293(1);
		}
		if (Static338.aClass106_24 == Static152.aClass106_7) {
			for (local10 = 0; local10 < 4; local10++) {
				Static187.aClass220Array1[local10] = Static549.method7511(Static535.anInt9341, Static345.anInt6228);
			}
		}
		if (Static338.aClass106_24 == Static152.aClass106_8) {
			Static194.aClass284_60 = Static287.method4311(false, 8);
			Static551.aClass284_158 = Static287.method4311(false, 0);
			Static17.aClass284_145 = Static287.method4311(false, 1);
			Static347.aClass284_106 = Static287.method4311(false, 2);
			Static226.aClass284_69 = Static287.method4311(false, 3);
			Static118.aClass284_39 = Static287.method4311(false, 4);
			Static295.aClass284_92 = Static287.method4311(true, 5);
			Static320.aClass284_98 = Static287.method4311(true, 6);
			Static396.aClass284_115 = Static287.method4311(false, 7);
			Static72.aClass284_29 = Static287.method4311(false, 9);
			Static275.aClass284_83 = Static287.method4311(false, 10);
			Static271.aClass284_81 = Static287.method4311(false, 11);
			Static468.aClass284_131 = Static287.method4311(false, 12);
			Static537.aClass284_153 = Static287.method4311(false, 14);
			Static513.aClass284_146 = Static287.method4311(false, 15);
			Static222.aClass284_67 = Static287.method4311(false, 16);
			Static217.aClass284_66 = Static287.method4311(false, 17);
			Static411.aClass284_117 = Static287.method4311(false, 18);
			Static401.aClass284_116 = Static287.method4311(false, 19);
			Static569.aClass284_164 = Static287.method4311(false, 20);
			Static374.aClass284_111 = Static287.method4311(false, 21);
			Static125.aClass284_41 = Static287.method4311(false, 22);
			Static332.aClass284_24 = Static287.method4311(true, 23);
			Static356.aClass284_107 = Static287.method4311(false, 24);
			Static16.aClass284_3 = Static287.method4311(false, 25);
			Static336.aClass284_100 = Static287.method4311(true, 26);
			Static345.aClass284_104 = Static287.method4311(false, 27);
			Static473.aClass284_132 = Static287.method4311(true, 28);
			Static434.aClass284_124 = Static287.method4311(false, 29);
			Static517.aClass284_147 = Static287.method4311(true, 30);
			Static374.aClass284_112 = Static287.method4311(true, 31);
		}
		if (Static338.aClass106_24 == Static152.aClass106_9) {
			local10 = 0;
			for (local54 = 0; local54 < 35; local54++) {
				if (Static449.aClass98_Sub1Array1[local54] != null) {
					local10 += Static449.aClass98_Sub1Array1[local54].method4625() * Static3.anIntArray1[local54] / 100;
				}
			}
			if (local10 != 100) {
				if (Static580.anInt10044 < 0) {
					Static580.anInt10044 = local10;
				}
				return (local10 - Static580.anInt10044) * 100 / (100 - Static580.anInt10044);
			}
			Static314.method4675(Static194.aClass284_60);
			Static164.method2975(Static336.aClass284_99, Static481.method6561(), Static194.aClass284_60);
		}
		if (Static152.aClass106_10 == Static338.aClass106_24) {
			Static18.method171();
			Static27.method293(2);
		}
		if (Static338.aClass106_24 == Static152.aClass106_11) {
			Static409.method1336(Static467.aClass168_12, Static517.aClass284_147);
		}
		if (Static152.aClass106_12 == Static338.aClass106_24) {
			local10 = Static245.method3874();
			if (local10 < 100) {
				return local10;
			}
			Static485.method6589(Static473.aClass284_132.method6357(1));
			Static532.method7295(Static473.aClass284_132.method6357(3));
		}
		if (Static338.aClass106_24 == Static152.aClass106_13) {
			if (Static485.anInt8405 != -1 && !Static396.aClass284_115.method6336(Static485.anInt8405, 0)) {
				return 99;
			}
			Static100.anInterface4_13 = new Class322(Static336.aClass284_100, Static72.aClass284_29, Static194.aClass284_60);
			Static106.aClass27_1 = new Class27(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static98.aClass313_1 = new Class313(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static198.aClass210_2 = new Class210(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106, Static194.aClass284_60);
			Static227.aClass344_1 = new Class344(Static31.aClass89_1, Static201.anInt4321, Static217.aClass284_66);
			Static98.aClass171_1 = new Class171(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static436.aClass71_4 = new Class71(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static324.aClass356_1 = new Class356(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106, Static396.aClass284_115);
			Static540.aClass327_1 = new Class327(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static517.aClass261_1 = new Class261(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static536.aClass146_4 = new Class146(Static31.aClass89_1, Static201.anInt4321, true, Static222.aClass284_67, Static396.aClass284_115);
			Static550.aClass189_3 = new Class189(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106, Static194.aClass284_60);
			Static493.aClass296_4 = new Class296(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106, Static194.aClass284_60);
			Static181.aClass60_1 = new Class60(Static31.aClass89_1, Static201.anInt4321, true, Static411.aClass284_117, Static396.aClass284_115);
			Static272.aClass121_2 = new Class121(Static31.aClass89_1, Static201.anInt4321, true, Static106.aClass27_1, Static401.aClass284_116, Static396.aClass284_115);
			Static428.aClass124_1 = new Class124(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static245.aClass155_1 = new Class155(Static31.aClass89_1, Static201.anInt4321, Static569.aClass284_164, Static551.aClass284_158, Static17.aClass284_145);
			Static345.aClass103_1 = new Class103(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static240.aClass13_1 = new Class13(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static386.aClass23_1 = new Class23(Static31.aClass89_1, Static201.anInt4321, Static374.aClass284_111, Static396.aClass284_115);
			Static326.aClass7_1 = new Class7(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static177.aClass216_1 = new Class216(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static202.aClass191_1 = new Class191(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static333.aClass177_1 = new Class177(Static31.aClass89_1, Static201.anInt4321, Static125.aClass284_41);
			Static406.aClass144_1 = new Class144(Static31.aClass89_1, Static201.anInt4321, Static347.aClass284_106);
			Static238.method3808(Static336.aClass284_99, Static396.aClass284_115, Static194.aClass284_60, Static226.aClass284_69);
			Static489.method7310(Static434.aClass284_124);
			Static239.aClass169_1 = new Class169(Static201.anInt4321, Static356.aClass284_107, Static16.aClass284_3);
			Static212.aClass294_3 = new Class294(Static201.anInt4321, Static356.aClass284_107, Static16.aClass284_3, new Class30());
			Static54.method1340();
			Static536.aClass146_4.method3722(!Static348.aClass3_Sub51_Sub1_5.method7837(Static37.anInt1122));
			Static206.aClass143_3 = new Class143();
			Static564.method7698();
			Static130.method6158(Static345.aClass284_104);
			Static232.method4770(Static100.anInterface4_13, Static396.aClass284_115);
			@Pc(911) Class77 local911 = new Class77(Static275.aClass284_83.method6328("huffman", ""));
			Static52.method1261(local911);
			try {
				jagmisc.init();
			} catch (@Pc(918) Throwable local918) {
			}
			Static83.aClass125_1 = Static139.method4615();
			Static315.aClass3_Sub18_2 = new Class3_Sub18(true, Static467.aClass168_12);
		}
		if (Static152.aClass106_15 == Static338.aClass106_24) {
			local54 = Static432.method5976(Static194.aClass284_60) + Static515.method6939(true);
			@Pc(945) int local945 = Static259.method1082() + Static131.method2506();
			if (local54 < local945) {
				return local54 * 100 / local945;
			}
		}
		if (Static338.aClass106_24 == Static152.aClass106_16) {
			Static157.method2254(Static332.aClass284_24, Static98.aClass171_1, Static436.aClass71_4, Static536.aClass146_4, Static550.aClass189_3, Static493.aClass296_4, Static206.aClass143_3);
		}
		if (Static152.aClass106_17 == Static338.aClass106_24) {
			Static592.aBooleanArray21 = new boolean[Static202.aClass191_1.anInt5762];
			Static257.aStringArray22 = new String[Static177.aClass216_1.anInt6232];
			Static161.anIntArray147 = new int[Static202.aClass191_1.anInt5762];
			for (local54 = 0; local54 < Static202.aClass191_1.anInt5762; local54++) {
				if (Static202.aClass191_1.method4672(local54).anInt4711 == 0) {
					Static592.aBooleanArray21[local54] = true;
					Static64.anInt1789++;
				}
				Static161.anIntArray147[local54] = -1;
			}
			Static360.method8010();
			Static93.anInt2348 = Static226.aClass284_69.method6333("loginscreen");
			Static472.anInt8218 = Static226.aClass284_69.method6333("lobbyscreen");
			Static295.aClass284_92.method6335(false);
			Static320.aClass284_98.method6335(true);
			Static194.aClass284_60.method6335(true);
			Static336.aClass284_99.method6335(true);
			Static275.aClass284_83.method6335(true);
			Static226.aClass284_69.method6335(true);
			Static218.aBoolean584 = true;
			Static347.aClass284_106.anInt8049 = 2;
			Static217.aClass284_66.anInt8049 = 2;
			Static222.aClass284_67.anInt8049 = 2;
			Static411.aClass284_117.anInt8049 = 2;
			Static401.aClass284_116.anInt8049 = 2;
			Static569.aClass284_164.anInt8049 = 2;
			Static374.aClass284_111.anInt8049 = 2;
		}
		@Pc(1095) Class251 local1095;
		if (Static152.aClass106_18 == Static338.aClass106_24) {
			if (!Static160.method2927(Static93.anInt2348)) {
				return 0;
			}
			for (local54 = 0; local54 < Static449.aClass251ArrayArray1[Static93.anInt2348].length; local54++) {
				local1095 = Static449.aClass251ArrayArray1[Static93.anInt2348][local54];
				if (local1095.anInt7231 == 5 && local1095.anInt7213 != -1) {
					local1095.method5701(Static319.aClass31_11);
				}
			}
		}
		if (Static152.aClass106_19 == Static338.aClass106_24) {
			for (local54 = 0; local54 < Static449.aClass251ArrayArray1[Static93.anInt2348].length; local54++) {
				local1095 = Static449.aClass251ArrayArray1[Static93.anInt2348][local54];
				if (local1095.anInt7231 == 5 && local1095.anInt7213 != -1 && local1095.method5701(Static319.aClass31_11) == null && Static373.aBoolean457) {
					return 0;
				}
			}
		}
		if (Static152.aClass106_20 == Static338.aClass106_24) {
			Static210.method7449(true);
		}
		if (Static338.aClass106_24 == Static152.aClass106_21) {
			Static372.aClass163_1.method4031();
			try {
				Static431.aThread5.join();
			} catch (@Pc(1174) InterruptedException local1174) {
				return 0;
			}
			Static596.anInterface23Array1 = null;
			Static372.aClass163_1 = null;
			Static575.aClass24_2 = null;
			Static479.aClass284_140 = null;
			Static278.aClass284_85 = null;
			Static431.aThread5 = null;
			Static439.method6136();
			Static551.aBoolean634 = Static348.aClass3_Sub51_Sub1_5.aBoolean687;
			Static348.aClass3_Sub51_Sub1_5.aBoolean687 = true;
			Static348.aClass3_Sub51_Sub1_5.method7842(Static467.aClass168_12);
			if (Static551.aBoolean634) {
				Static47.method1180(0);
			} else {
				Static47.method1180(Static348.aClass3_Sub51_Sub1_5.anInt9955);
			}
			Static276.method4180(false, -1, Static348.aClass3_Sub51_Sub1_5.anInt9953, -1);
			Static481.method6558(Static319.aClass31_11);
			Static420.method5838(Static319.aClass31_11);
			Static4.method54(Static194.aClass284_60, Static319.aClass31_11);
			Static328.method4872(Static459.aClass73Array12);
		}
		return Static4.method55();
	}
}
