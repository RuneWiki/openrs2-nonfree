import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_132 = new Class276(31, 10);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I")
	public static int method7424() {
		@Pc(6) int local6;
		if (!Static455.aClass3_Sub27_Sub1_1.aBoolean381) {
			for (local6 = 0; local6 < Static110.anInt2599; local6++) {
				if (Static348.anInterface23Array3[local6].method5038() == 's' || Static348.anInterface23Array3[local6].method5038() == 'S') {
					Static455.aClass3_Sub27_Sub1_1.aBoolean381 = true;
					break;
				}
			}
		}
		@Pc(50) int local50;
		if (Static529.aClass325_2 == Static537.aClass325_25) {
			@Pc(40) Runtime local40 = Runtime.getRuntime();
			local50 = (int) ((local40.totalMemory() - local40.freeMemory()) / 1024L);
			@Pc(53) long local53 = Static376.method6088();
			if (Static566.aLong253 == 0L) {
				Static566.aLong253 = local53;
			}
			if (local50 > 16384 && local53 - Static566.aLong253 < 5000L) {
				if (local53 - Static269.aLong161 > 1000L) {
					System.gc();
					Static269.aLong161 = local53;
				}
				return 0;
			}
		}
		if (Static529.aClass325_3 == Static537.aClass325_25) {
			if (Static506.aClass343_2 == null) {
				Static506.aClass343_2 = new Class343(Static122.aClass289_2, Static29.aClass349_1, Static348.aBigInteger3, Static209.aBigInteger5);
			}
			if (!Static506.aClass343_2.method8128()) {
				return 0;
			}
			Static490.method7466(0, null);
			Static551.aBoolean823 = !Static389.method6206();
			Static287.aClass254_80 = Static192.method7244(false, Static551.aBoolean823 ? 34 : 32, true);
			Static41.aClass254_16 = Static192.method7244(false, 33, true);
			Static289.aClass254_92 = Static192.method7244(false, 13, true);
		}
		if (Static529.aClass325_4 == Static537.aClass325_25) {
			Static41.aClass254_16.method6412();
			local6 = Static104.aClass62_Sub1Array1[33].method2086();
			local6 += Static104.aClass62_Sub1Array1[Static551.aBoolean823 ? 34 : 32].method2086();
			local6 += Static104.aClass62_Sub1Array1[13].method2086();
			local6 += Static41.aClass254_16.method6404();
			if (local6 != 400) {
				return local6 / 4;
			}
			Static423.anInt8220 = Static287.aClass254_80.method6394();
			Static417.anInt8177 = Static41.aClass254_16.method6394();
			Static353.method5873(Static287.aClass254_80);
			local50 = Static455.aClass3_Sub27_Sub1_1.anInt4784;
			Static23.aClass339_7 = new Class339(Static581.aClass335_4, Static126.anInt2904, Static41.aClass254_16);
			@Pc(213) int[] local213 = Static23.aClass339_7.method8092(local50);
			@Pc(219) Class86 local219 = new Class86(Static287.aClass254_80, Static289.aClass254_92);
			if (local213.length > 0) {
				Static197.anInterface24Array1 = new Interface24[local213.length];
				for (@Pc(231) int local231 = 0; local231 < Static197.anInterface24Array1.length; local231++) {
					Static197.anInterface24Array1[local231] = new Class270(Static23.aClass339_7.method8097(local213[local231]), local219);
				}
			}
		}
		if (Static537.aClass325_25 == Static529.aClass325_5) {
			Static367.method6024(Static289.aClass254_92, Static47.method1226(), Static287.aClass254_80);
		}
		if (Static537.aClass325_25 == Static529.aClass325_6) {
			local6 = Static253.method4540();
			local50 = Static562.method8114();
			if (local50 > local6) {
				return local6 * 100 / local50;
			}
		}
		if (Static529.aClass325_7 == Static537.aClass325_25) {
			if (Static197.anInterface24Array1 != null && Static197.anInterface24Array1.length > 0) {
				if (Static197.anInterface24Array1[0].method6800() < 100) {
					return 0;
				}
				if (Static197.anInterface24Array1.length > 1 && Static23.aClass339_7.method8093() && Static197.anInterface24Array1[1].method6800() < 100) {
					return 0;
				}
			}
			Static282.method4861(Static546.aClass15_16);
			Static107.method2267(Static546.aClass15_16);
			Static168.method3104(1);
		}
		if (Static537.aClass325_25 == Static529.aClass325_8) {
			for (local6 = 0; local6 < 4; local6++) {
				Static403.aClass350Array1[local6] = Static494.method7023(Static292.anInt7682, Static460.anInt8640);
			}
		}
		if (Static537.aClass325_25 == Static529.aClass325_9) {
			Static579.aClass254_137 = Static192.method7244(false, 8, true);
			Static320.aClass254_91 = Static192.method7244(false, 0, true);
			Static357.aClass254_98 = Static192.method7244(false, 1, true);
			Static389.aClass254_103 = Static192.method7244(false, 2, true);
			Static257.aClass254_74 = Static192.method7244(false, 3, true);
			Static151.aClass254_50 = Static192.method7244(false, 4, true);
			Static136.aClass254_43 = Static192.method7244(true, 5, true);
			Static302.aClass254_86 = Static192.method7244(true, 6, false);
			Static159.aClass254_51 = Static192.method7244(false, 7, true);
			Static3.aClass254_1 = Static192.method7244(false, 9, true);
			Static188.aClass254_60 = Static192.method7244(false, 10, true);
			Static405.aClass254_106 = Static192.method7244(false, 11, true);
			Static96.aClass254_29 = Static192.method7244(false, 12, true);
			Static33.aClass254_14 = Static192.method7244(false, 14, false);
			Static252.aClass254_73 = Static192.method7244(false, 15, true);
			Static22.aClass254_10 = Static192.method7244(false, 16, true);
			Static434.aClass254_111 = Static192.method7244(false, 17, true);
			Static145.aClass254_49 = Static192.method7244(false, 18, true);
			Static497.aClass254_125 = Static192.method7244(false, 19, true);
			Static437.aClass254_115 = Static192.method7244(false, 20, true);
			Static188.aClass254_61 = Static192.method7244(false, 21, true);
			Static205.aClass254_68 = Static192.method7244(false, 22, true);
			Static392.aClass254_104 = Static192.method7244(true, 23, true);
			Static483.aClass254_122 = Static192.method7244(false, 24, true);
			Static280.aClass254_131 = Static192.method7244(false, 25, true);
			Static144.aClass254_45 = Static192.method7244(true, 26, true);
			Static563.aClass254_134 = Static192.method7244(false, 27, true);
			Static134.aClass254_105 = Static192.method7244(true, 28, true);
			Static467.aClass254_120 = Static192.method7244(false, 29, true);
			Static263.aClass254_78 = Static192.method7244(true, 30, true);
			Static44.aClass254_17 = Static192.method7244(true, 31, true);
		}
		if (Static529.aClass325_10 == Static537.aClass325_25) {
			local6 = 0;
			for (local50 = 0; local50 < 35; local50++) {
				if (Static104.aClass62_Sub1Array1[local50] != null) {
					local6 += Static104.aClass62_Sub1Array1[local50].method2086() * Static223.anIntArray287[local50] / 100;
				}
			}
			if (local6 != 100) {
				if (Static325.anInt6786 < 0) {
					Static325.anInt6786 = local6;
				}
				return (local6 - Static325.anInt6786) * 100 / (100 - Static325.anInt6786);
			}
			Static201.method3369(Static579.aClass254_137);
			Static367.method6024(Static289.aClass254_92, Static47.method1226(), Static579.aClass254_137);
		}
		if (Static537.aClass325_25 == Static529.aClass325_11) {
			Static129.method8418();
			Static168.method3104(2);
		}
		if (Static529.aClass325_12 == Static537.aClass325_25) {
			Static154.method2975(Static480.aClass326_3, Static263.aClass254_78);
		}
		if (Static537.aClass325_25 == Static529.aClass325_13) {
			local6 = Static572.method8176();
			if (local6 < 100) {
				return local6;
			}
			Static569.method8165(Static134.aClass254_105.method6420(1));
			Static339.method5812(Static134.aClass254_105.method6420(3));
		}
		if (Static529.aClass325_14 == Static537.aClass325_25) {
			if (Static195.anInt3801 != -1 && !Static159.aClass254_51.method6398(Static195.anInt3801, 0)) {
				return 99;
			}
			Static122.anInterface4_5 = new Class123(Static144.aClass254_45, Static3.aClass254_1, Static579.aClass254_137);
			Static299.aClass17_2 = new Class17(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static144.aClass188_1 = new Class188(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static1.aClass228_1 = new Class228(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103, Static579.aClass254_137);
			Static547.aClass207_1 = new Class207(Static581.aClass335_4, Static126.anInt2904, Static434.aClass254_111);
			Static283.aClass209_5 = new Class209(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static393.aClass131_5 = new Class131(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static341.aClass6_1 = new Class6(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103, Static159.aClass254_51);
			Static441.aClass267_1 = new Class267(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static93.aClass246_1 = new Class246(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static253.aClass146_2 = new Class146(Static581.aClass335_4, Static126.anInt2904, true, Static22.aClass254_10, Static159.aClass254_51);
			Static44.aClass10_1 = new Class10(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103, Static579.aClass254_137);
			Static568.aClass315_4 = new Class315(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103, Static579.aClass254_137);
			Static121.aClass118_2 = new Class118(Static581.aClass335_4, Static126.anInt2904, true, Static145.aClass254_49, Static159.aClass254_51);
			Static517.aClass23_2 = new Class23(Static581.aClass335_4, Static126.anInt2904, true, Static299.aClass17_2, Static497.aClass254_125, Static159.aClass254_51);
			Static440.aClass187_2 = new Class187(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static532.aClass157_2 = new Class157(Static581.aClass335_4, Static126.anInt2904, Static437.aClass254_115, Static320.aClass254_91, Static357.aClass254_98);
			Static271.aClass176_1 = new Class176(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static136.aClass272_1 = new Class272(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static107.aClass303_1 = new Class303(Static581.aClass335_4, Static126.anInt2904, Static188.aClass254_61, Static159.aClass254_51);
			Static290.aClass362_1 = new Class362(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static297.aClass48_1 = new Class48(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static594.aClass279_1 = new Class279(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static380.aClass46_1 = new Class46(Static581.aClass335_4, Static126.anInt2904, Static205.aClass254_68);
			Static164.aClass52_1 = new Class52(Static581.aClass335_4, Static126.anInt2904, Static389.aClass254_103);
			Static202.method3378(Static159.aClass254_51, Static257.aClass254_74, Static289.aClass254_92, Static579.aClass254_137);
			Static194.method3318(Static467.aClass254_120);
			Static214.aClass99_1 = new Class99(Static126.anInt2904, Static483.aClass254_122, Static280.aClass254_131);
			Static25.aClass189_1 = new Class189(Static126.anInt2904, Static483.aClass254_122, Static280.aClass254_131, new Class290());
			Static255.method4560();
			Static253.aClass146_2.method3354(!Static455.aClass3_Sub27_Sub1_1.method4040(Static275.anInt5823));
			Static588.aClass322_1 = new Class322();
			Static49.method1242();
			Static302.method5016(Static563.aClass254_134);
			Static36.method1097(Static122.anInterface4_5, Static159.aClass254_51);
			@Pc(930) Class197 local930 = new Class197(Static188.aClass254_60.method6410("", "huffman"));
			Static257.method4573(local930);
			try {
				jagmisc.init();
			} catch (@Pc(937) Throwable local937) {
			}
			Static592.aClass12_1 = Static77.method1777();
		}
		if (Static537.aClass325_25 == Static529.aClass325_16) {
			local6 = Static483.method7397(Static579.aClass254_137) + Static252.method4535(true);
			local50 = Static4.method244() + Static562.method8114();
			if (local50 > local6) {
				return local6 * 100 / local50;
			}
		}
		if (Static537.aClass325_25 == Static529.aClass325_17) {
			Static87.method5770(Static392.aClass254_104, Static283.aClass209_5, Static393.aClass131_5, Static253.aClass146_2, Static44.aClass10_1, Static568.aClass315_4, Static588.aClass322_1);
		}
		if (Static529.aClass325_18 == Static537.aClass325_25) {
			Static183.anIntArray237 = new int[Static594.aClass279_1.anInt8547];
			Static251.aStringArray21 = new String[Static297.aClass48_1.anInt1703];
			Static57.aBooleanArray5 = new boolean[Static594.aClass279_1.anInt8547];
			for (local6 = 0; local6 < Static594.aClass279_1.anInt8547; local6++) {
				if (Static594.aClass279_1.method7005(local6).anInt4859 == 0) {
					Static57.aBooleanArray5[local6] = true;
					Static20.anInt617++;
				}
				Static183.anIntArray237[local6] = -1;
			}
			Static228.method3903();
			Static342.anInt6992 = Static257.aClass254_74.method6414("loginscreen");
			Static25.anInt773 = Static257.aClass254_74.method6414("lobbyscreen");
			Static136.aClass254_43.method6418(false);
			Static302.aClass254_86.method6418(true);
			Static579.aClass254_137.method6418(true);
			Static289.aClass254_92.method6418(true);
			Static188.aClass254_60.method6418(true);
			Static257.aClass254_74.method6418(true);
			Static127.aBoolean226 = true;
			Static389.aClass254_103.anInt7731 = 2;
			Static434.aClass254_111.anInt7731 = 2;
			Static22.aClass254_10.anInt7731 = 2;
			Static145.aClass254_49.anInt7731 = 2;
			Static497.aClass254_125.anInt7731 = 2;
			Static437.aClass254_115.anInt7731 = 2;
			Static188.aClass254_61.anInt7731 = 2;
		}
		@Pc(1112) Class305 local1112;
		if (Static529.aClass325_19 == Static537.aClass325_25) {
			if (!Static402.method8391(Static342.anInt6992)) {
				return 0;
			}
			for (local6 = 0; local6 < Static108.aClass305ArrayArray1[Static342.anInt6992].length; local6++) {
				local1112 = Static108.aClass305ArrayArray1[Static342.anInt6992][local6];
				if (local1112.anInt9211 == 5 && local1112.anInt9185 != -1) {
					local1112.method7493(Static546.aClass15_16);
				}
			}
		}
		if (Static537.aClass325_25 == Static529.aClass325_20) {
			for (local6 = 0; local6 < Static108.aClass305ArrayArray1[Static342.anInt6992].length; local6++) {
				local1112 = Static108.aClass305ArrayArray1[Static342.anInt6992][local6];
				if (local1112.anInt9211 == 5 && local1112.anInt9185 != -1 && local1112.method7493(Static546.aClass15_16) == null && Static45.aBoolean90) {
					return 0;
				}
			}
		}
		if (Static537.aClass325_25 == Static529.aClass325_21) {
			Static481.method7378(true);
		}
		if (Static529.aClass325_22 == Static537.aClass325_25) {
			Static313.aClass163_1.method3936();
			try {
				Static433.aThread3.join();
			} catch (@Pc(1187) InterruptedException local1187) {
				return 0;
			}
			Static365.aBoolean615 = Static455.aClass3_Sub27_Sub1_1.aBoolean381;
			Static455.aClass3_Sub27_Sub1_1.aBoolean381 = true;
			Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
			if (Static365.aBoolean615) {
				Static63.method1592(0);
			} else {
				Static63.method1592(Static455.aClass3_Sub27_Sub1_1.anInt4792);
			}
			Static342.method5819(Static455.aClass3_Sub27_Sub1_1.anInt4801, -1, -1, false);
			Static282.method4861(Static546.aClass15_16);
			Static107.method2267(Static546.aClass15_16);
			Static591.method8342(Static546.aClass15_16, Static579.aClass254_137);
			Static57.method1334(Static541.aClass37Array12);
			Static197.anInterface24Array1 = null;
			Static23.aClass339_7 = null;
			Static41.aClass254_16 = null;
			Static287.aClass254_80 = null;
		}
		return Static324.method5638();
	}
}
