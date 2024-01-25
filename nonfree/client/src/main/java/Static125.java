import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "Lclient!wu;")
	public static Class380 aClass380_37;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_27 = new Class179(55, -1);

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
	public static int anInt2197 = 0;

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!wu;Lclient!wu;Lclient!wu;ILclient!wu;)V")
	private static void method1791(@OriginalArg(0) Class380 arg0, @OriginalArg(1) Class380 arg1, @OriginalArg(2) Class380 arg2, @OriginalArg(4) Class380 arg3) {
		Static632.aClass380_134 = arg2;
		Static92.aClass380_29 = arg3;
		Static78.aClass380_21 = arg1;
		Static559.aClass261ArrayArray2 = new Class261[Static92.aClass380_29.method8639()][];
		Static414.aBooleanArray118 = new boolean[Static92.aClass380_29.method8639()];
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < 1 || arg6 < 1 || arg4 > Static228.anInt3704 - 2 || Static162.anInt2911 - 2 < arg6) {
			return;
		}
		@Pc(32) int local32 = arg1;
		if (arg1 < 3 && Static181.method2642(arg6, arg4)) {
			local32 = arg1 + 1;
		}
		if (Static234.aClass2_Sub5_48.aClass6_Sub13_1.method3763() == 0 && !Static76.method1081(local32, arg4, arg6, Static130.anInt2239)) {
			return;
		}
		if (Static28.aClass53ArrayArrayArray1 == null) {
			return;
		}
		Static365.aClass275_Sub1_2.method7629(Static230.aClass240Array1[arg1], arg4, Static192.aClass95_4, arg2, arg1, arg6);
		if (arg3 < 0) {
			return;
		}
		@Pc(80) int local80 = Static234.aClass2_Sub5_48.aClass6_Sub4_1.method2457();
		Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub4_1);
		Static365.aClass275_Sub1_2.method7627(Static230.aClass240Array1[arg1], arg5, Static192.aClass95_4, arg0, arg1, arg3, arg6, arg7, local32, arg4);
		Static234.aClass2_Sub5_48.method176(local80, Static234.aClass2_Sub5_48.aClass6_Sub4_1);
		return;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
	public static void method1793() {
		Static596.aBoolean706 = false;
		Static32.method574();
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)I")
	public static int method1794() {
		@Pc(11) int local11;
		if (Static234.aClass2_Sub5_48.aClass6_Sub29_1.method8579() == 0) {
			for (local11 = 0; local11 < Static427.anInt6728; local11++) {
				if (Static587.anInterface22Array1[local11].method5226() == 's' || Static587.anInterface22Array1[local11].method5226() == 'S') {
					Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub29_1);
					break;
				}
			}
		}
		@Pc(58) int local58;
		if (Static111.aClass323_1 == Static528.aClass323_3) {
			@Pc(48) Runtime local48 = Runtime.getRuntime();
			local58 = (int) ((local48.totalMemory() - local48.freeMemory()) / 1024L);
			@Pc(61) long local61 = Static476.method6413();
			if (Static96.aLong56 == 0L) {
				Static96.aLong56 = local61;
			}
			if (local58 > 16384 && local61 - Static96.aLong56 < 5000L) {
				if (local61 - Static18.aLong18 > 1000L) {
					System.gc();
					Static18.aLong18 = local61;
				}
				return 0;
			}
		}
		if (Static528.aClass323_4 == Static111.aClass323_1) {
			if (Static442.aClass87_1 == null) {
				Static442.aClass87_1 = new Class87(Static301.aClass104_3, Static522.aClass376_3, Static349.aBigInteger4, Static403.aBigInteger5);
			}
			if (!Static442.aClass87_1.method1803()) {
				return 0;
			}
			Static344.method4623(null, true, 0);
			Static405.aBoolean453 = !Static419.method5600();
			Static366.aClass380_90 = Static281.method3899(Static405.aBoolean453 ? 34 : 32, 1, false);
			Static67.aClass380_19 = Static281.method3899(33, 1, false);
			Static141.aClass380_39 = Static281.method3899(13, 1, false);
		}
		@Pc(149) boolean local149;
		if (Static528.aClass323_5 == Static111.aClass323_1) {
			local149 = Static67.aClass380_19.method8618();
			local58 = Static181.aClass20_Sub1Array2[33].method473();
			local58 += Static181.aClass20_Sub1Array2[Static405.aBoolean453 ? 34 : 32].method473();
			local58 += Static181.aClass20_Sub1Array2[13].method473();
			local58 += local149 ? 100 : Static67.aClass380_19.method8613();
			if (local58 != 400) {
				return local58 / 4;
			}
			Static396.anInt6228 = Static366.aClass380_90.method8629();
			Static607.anInt9771 = Static67.aClass380_19.method8629();
			Static494.method6862(Static366.aClass380_90);
			@Pc(210) int local210 = Static234.aClass2_Sub5_48.aClass6_Sub1_1.method127();
			Class2_Sub5.lb = new Class112(Static189.aClass375_5, Static483.anInt7694, Static67.aClass380_19);
			@Pc(222) int[] local222 = Class2_Sub5.lb.method2515(local210);
			if (local222.length == 0) {
				local222 = Class2_Sub5.lb.method2515(0);
			}
			@Pc(241) Class127 local241 = new Class127(Static366.aClass380_90, Static141.aClass380_39);
			if (local222.length > 0) {
				Static122.anInterface8Array1 = new Interface8[local222.length];
				for (@Pc(253) int local253 = 0; local253 < Static122.anInterface8Array1.length; local253++) {
					Static122.anInterface8Array1[local253] = new Class359(Class2_Sub5.lb.method2516(local222[local253]), local241);
				}
			}
		}
		if (Static528.aClass323_6 == Static111.aClass323_1) {
			Static628.method8429(Static417.method5576(), Static366.aClass380_90, Static141.aClass380_39);
		}
		if (Static528.aClass323_7 == Static111.aClass323_1) {
			local11 = Static541.method7471();
			local58 = Static551.method7577();
			if (local11 < local58) {
				return local11 * 100 / local58;
			}
		}
		if (Static528.aClass323_8 == Static111.aClass323_1) {
			if (Static122.anInterface8Array1 != null && Static122.anInterface8Array1.length > 0) {
				if (Static122.anInterface8Array1[0].method8057() < 100) {
					return 0;
				}
				if (Static122.anInterface8Array1.length > 1 && Class2_Sub5.lb.method2517() && Static122.anInterface8Array1[1].method8057() < 100) {
					return 0;
				}
			}
			Static355.method4778(Static192.aClass95_4);
			Static472.method6366(Static192.aClass95_4);
			Static158.method2370(1);
		}
		if (Static111.aClass323_1 == Static528.aClass323_9) {
			for (local11 = 0; local11 < 4; local11++) {
				Static230.aClass240Array1[local11] = Static353.method4721(Static162.anInt2911, Static228.anInt3704);
			}
		}
		if (Static111.aClass323_1 == Static528.aClass323_10) {
			Static79.aClass380_22 = Static281.method3899(8, 1, false);
			Static450.aClass380_104 = Static281.method3899(0, 1, false);
			Static6.aClass380_3 = Static281.method3899(1, 1, false);
			Static576.aClass380_128 = Static281.method3899(2, 1, false);
			Static82.aClass380_25 = Static281.method3899(3, 1, false);
			Static319.aClass380_76 = Static281.method3899(4, 1, false);
			Static280.aClass380_67 = Static281.method3899(5, 1, true);
			Static539.aClass380_121 = Static281.method3899(6, 1, true);
			Static519.aClass380_116 = Static281.method3899(7, 1, false);
			Static107.aClass380_34 = Static281.method3899(9, 1, false);
			Static262.aClass380_85 = Static281.method3899(10, 1, false);
			Static428.aClass380_100 = Static281.method3899(11, 1, false);
			Static210.aClass380_53 = Static281.method3899(12, 1, false);
			Static404.aClass380_98 = Static281.method3899(14, 1, false);
			Static312.aClass380_74 = Static281.method3899(15, 1, false);
			Static247.aClass380_64 = Static281.method3899(16, 1, false);
			Static39.aClass380_14 = Static281.method3899(17, 1, false);
			Static531.aClass380_119 = Static281.method3899(18, 1, false);
			Static194.aClass380_126 = Static281.method3899(19, 1, false);
			Static3.aClass380_135 = Static281.method3899(20, 1, false);
			Static438.aClass380_102 = Static281.method3899(21, 1, false);
			Static488.aClass380_110 = Static281.method3899(22, 1, false);
			Static416.aClass380_99 = Static281.method3899(23, 1, true);
			Static607.aClass380_131 = Static281.method3899(24, 1, false);
			Static57.aClass380_15 = Static281.method3899(25, 1, false);
			Static535.aClass380_120 = Static281.method3899(26, 1, true);
			aClass380_37 = Static281.method3899(27, 1, false);
			Static92.aClass380_30 = Static281.method3899(28, 1, true);
			Static469.aClass380_10 = Static281.method3899(29, 1, false);
			Static260.aClass380_65 = Static281.method3899(30, 1, true);
			Static525.aClass380_94 = Static281.method3899(31, 1, true);
			Static342.aClass380_83 = Static281.method3899(36, 2, true);
		}
		if (Static528.aClass323_11 == Static111.aClass323_1) {
			local11 = 0;
			for (local58 = 0; local58 < 37; local58++) {
				if (Static181.aClass20_Sub1Array2[local58] != null) {
					local11 += Static181.aClass20_Sub1Array2[local58].method473() * Static248.anIntArray274[local58] / 100;
				}
			}
			if (local11 != 100) {
				if (Static127.anInt2206 < 0) {
					Static127.anInt2206 = local11;
				}
				return (local11 - Static127.anInt2206) * 100 / (100 - Static127.anInt2206);
			}
			Static629.method8441(Static79.aClass380_22);
			Static628.method8429(Static417.method5576(), Static79.aClass380_22, Static141.aClass380_39);
		}
		if (Static111.aClass323_1 == Static528.aClass323_12) {
			if (Static363.anInt5741 == -1) {
				Static363.anInt5741 = Static539.aClass380_121.method8609("scape main");
			}
			Static188.method2729();
			Static158.method2370(2);
		}
		if (Static528.aClass323_13 == Static111.aClass323_1) {
			Static13.method187(Static260.aClass380_65, Static452.aClass226_6);
		}
		if (Static528.aClass323_14 == Static111.aClass323_1) {
			local11 = Static337.method7187();
			if (local11 < 100) {
				return local11;
			}
			Static636.method8567(Static92.aClass380_30.method8616(1));
			Static546.method7541(Static92.aClass380_30.method8616(3));
		}
		if (Static111.aClass323_1 == Static528.aClass323_15) {
			if (Static410.anInt6377 != -1 && !Static519.aClass380_116.method8619(Static410.anInt6377, 0)) {
				return 99;
			}
			Static252.anInterface6_14 = new Class70(Static535.aClass380_120, Static107.aClass380_34, Static79.aClass380_22);
			Static339.aClass66_1 = new Class66(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static43.aClass283_1 = new Class283(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static537.aClass308_2 = new Class308(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128, Static79.aClass380_22);
			Static587.aClass232_1 = new Class232(Static189.aClass375_5, Static483.anInt7694, Static39.aClass380_14);
			Static18.aClass96_1 = new Class96(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static244.aClass242_7 = new Class242(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static502.aClass23_2 = new Class23(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128, Static519.aClass380_116);
			Static517.aClass11_1 = new Class11(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static516.aClass43_3 = new Class43(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static319.aClass141_4 = new Class141(Static189.aClass375_5, Static483.anInt7694, true, Static247.aClass380_64, Static519.aClass380_116);
			Static599.aClass197_4 = new Class197(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128, Static79.aClass380_22);
			Static264.aClass207_3 = new Class207(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128, Static79.aClass380_22);
			Static409.aClass107_2 = new Class107(Static189.aClass375_5, Static483.anInt7694, true, Static531.aClass380_119, Static519.aClass380_116);
			Static72.aClass225_2 = new Class225(Static189.aClass375_5, Static483.anInt7694, true, Static339.aClass66_1, Static194.aClass380_126, Static519.aClass380_116);
			Static71.aClass345_1 = new Class345(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static540.aClass173_2 = new Class173(Static189.aClass375_5, Static483.anInt7694, Static3.aClass380_135, Static450.aClass380_104, Static6.aClass380_3);
			Static355.aClass157_1 = new Class157(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static263.aClass224_1 = new Class224(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static460.aClass155_2 = new Class155(Static189.aClass375_5, Static483.anInt7694, Static438.aClass380_102, Static519.aClass380_116);
			Static105.aClass339_1 = new Class339(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static470.aClass298_1 = new Class298(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static274.aClass48_1 = new Class48(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			Static89.aClass330_3 = new Class330(Static189.aClass375_5, Static483.anInt7694, Static488.aClass380_110);
			Static361.aClass106_1 = new Class106(Static189.aClass375_5, Static483.anInt7694, Static576.aClass380_128);
			method1791(Static141.aClass380_39, Static519.aClass380_116, Static79.aClass380_22, Static82.aClass380_25);
			Static207.method2931(Static469.aClass380_10);
			Static320.aClass230_1 = new Class230(Static483.anInt7694, Static607.aClass380_131, Static57.aClass380_15);
			Static295.aClass362_2 = new Class362(Static483.anInt7694, Static607.aClass380_131, Static57.aClass380_15, new Class356());
			Static609.method8210();
			Static319.aClass141_4.method2973(Static234.aClass2_Sub5_48.aClass6_Sub13_1.method3763() == 0);
			Static431.aClass205_1 = new Class205();
			Static45.method741();
			Static379.method5068(aClass380_37);
			Static290.method4016(Static252.anInterface6_14, Static519.aClass380_116);
			@Pc(964) Class86 local964 = new Class86(Static262.aClass380_85.method8628("", "huffman"));
			Static599.method8100(local964);
			try {
				jagmisc.init();
			} catch (@Pc(971) Throwable local971) {
			}
			Static374.aClass99_1 = Static571.method7828();
			Static446.aClass2_Sub34_2 = new Class2_Sub34(true, Static452.aClass226_6);
		}
		if (Static528.aClass323_17 == Static111.aClass323_1) {
			local11 = Static264.method3723(Static79.aClass380_22) + Static343.method4362(true);
			local58 = Static498.method6889() + Static551.method7577();
			if (local11 < local58) {
				return local11 * 100 / local58;
			}
		}
		if (Static528.aClass323_18 == Static111.aClass323_1) {
			Static193.method1299(Static416.aClass380_99, Static18.aClass96_1, Static244.aClass242_7, Static319.aClass141_4, Static599.aClass197_4, Static264.aClass207_3, Static431.aClass205_1);
		}
		if (Static528.aClass323_19 == Static111.aClass323_1) {
			Static171.anIntArray203 = new int[Static274.aClass48_1.anInt1175];
			Static410.aBooleanArray116 = new boolean[Static274.aClass48_1.anInt1175];
			Static3.aStringArray48 = new String[Static470.aClass298_1.anInt8044];
			for (local11 = 0; local11 < Static274.aClass48_1.anInt1175; local11++) {
				if (Static274.aClass48_1.method919(local11).anInt8630 == 0) {
					Static410.aBooleanArray116[local11] = true;
					Static532.anInt8750++;
				}
				Static171.anIntArray203[local11] = -1;
			}
			Static611.method8227();
			Static261.anInt4094 = Static82.aClass380_25.method8609("loginscreen");
			Static380.anInt5918 = Static82.aClass380_25.method8609("lobbyscreen");
			Static280.aClass380_67.method8636(false);
			Static539.aClass380_121.method8636(true);
			Static79.aClass380_22.method8636(true);
			Static141.aClass380_39.method8636(true);
			Static262.aClass380_85.method8636(true);
			Static82.aClass380_25.method8636(true);
			Static576.aClass380_128.anInt10336 = 2;
			Static171.aBoolean225 = true;
			Static39.aClass380_14.anInt10336 = 2;
			Static247.aClass380_64.anInt10336 = 2;
			Static531.aClass380_119.anInt10336 = 2;
			Static194.aClass380_126.anInt10336 = 2;
			Static3.aClass380_135.anInt10336 = 2;
			Static438.aClass380_102.anInt10336 = 2;
		}
		if (Static111.aClass323_1 == Static528.aClass323_20) {
			if (!Static221.method3025(Static261.anInt4094)) {
				return 0;
			}
			local149 = true;
			for (local58 = 0; local58 < Static559.aClass261ArrayArray2[Static261.anInt4094].length; local58++) {
				@Pc(1157) Class261 local1157 = Static559.aClass261ArrayArray2[Static261.anInt4094][local58];
				if (local1157.anInt6635 == 5 && local1157.anInt6599 != -1 && !Static79.aClass380_22.method8619(local1157.anInt6599, 0)) {
					local149 = false;
				}
			}
			if (!local149) {
				return 0;
			}
		}
		if (Static528.aClass323_21 == Static111.aClass323_1) {
			Static518.method7243(true);
		}
		if (Static528.aClass323_22 == Static111.aClass323_1) {
			Static77.aClass252_2.method5479();
			try {
				Static235.aThread2.join();
			} catch (@Pc(1213) InterruptedException local1213) {
				return 0;
			}
			Static77.aClass252_2 = null;
			Static122.anInterface8Array1 = null;
			Static67.aClass380_19 = null;
			Static366.aClass380_90 = null;
			Static235.aThread2 = null;
			Class2_Sub5.lb = null;
			Static645.method8269();
			Static389.aBoolean445 = Static234.aClass2_Sub5_48.aClass6_Sub29_1.method8579() == 1;
			Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub29_1);
			Static329.method4407();
			if (Static389.aBoolean445) {
				Static317.method4257(false, 0);
			} else {
				Static317.method4257(false, Static234.aClass2_Sub5_48.aClass6_Sub21_1.method7280());
			}
			Static424.method5664(false, -1, -1, Static234.aClass2_Sub5_48.aClass6_Sub28_1.method8437());
			Static355.method4778(Static192.aClass95_4);
			Static472.method6366(Static192.aClass95_4);
			Static494.method6860(Static192.aClass95_4, Static79.aClass380_22);
			Static106.method1599(Static176.aClass61Array5);
		}
		return Static278.method3855();
	}
}
