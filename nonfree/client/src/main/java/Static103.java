import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!me", name = "Ob", descriptor = "[I")
	public static int[] anIntArray346;

	@OriginalMember(owner = "client!me", name = "nb", descriptor = "Lclient!td;")
	public static Class79 aClass79_14 = new Class79(50);

	@OriginalMember(owner = "client!me", name = "Ib", descriptor = "[I")
	public static int[] anIntArray345 = new int[100];

	@OriginalMember(owner = "client!me", name = "Jb", descriptor = "I")
	public static int anInt2645 = 0;

	@OriginalMember(owner = "client!me", name = "Nb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1016 = Static169.method2903("Hidden");

	@OriginalMember(owner = "client!me", name = "Lb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1015 = aClass23_1016;

	@OriginalMember(owner = "client!me", name = "Mb", descriptor = "I")
	public static int anInt2647 = 0;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IIIII)V")
	public static void method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static112.anInt2869; local3++) {
			if (Static23.anIntArray97[local3] + Static87.anIntArray121[local3] > arg1 && Static87.anIntArray121[local3] < arg3 + arg1 && arg2 < anIntArray345[local3] + Static18.anIntArray79[local3] && anIntArray345[local3] < arg0 + arg2) {
				Static18.aBooleanArray5[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
	public static void method1762() {
		anIntArray345 = null;
		aClass79_14 = null;
		aClass23_1015 = null;
		aClass23_1016 = null;
		anIntArray346 = null;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(BI)V")
	public static void method1767(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static153.anIntArray506[arg0];
		@Pc(14) int local14 = Static104.anIntArray354[arg0];
		@Pc(18) int local18 = Static37.anIntArray124[arg0];
		if (local18 >= 2000) {
			local18 -= 2000;
		}
		@Pc(28) int local28 = Static178.anIntArray592[arg0];
		if (local18 == 1005) {
			Static133.anInt3411 = 2;
			Static90.anInt2404 = Static165.anInt4054;
			Static47.anInt1255 = Static38.anInt1049;
			Static10.anInt388 = 0;
			Static25.aClass1_Sub8_Sub1_1.method919(28);
			Static25.aClass1_Sub8_Sub1_1.method879(local28);
		}
		@Pc(80) boolean local80;
		if (local18 == 18) {
			local80 = Static95.method1631(0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 0);
			if (!local80) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
			}
			Static133.anInt3411 = 2;
			Static47.anInt1255 = Static38.anInt1049;
			Static10.anInt388 = 0;
			Static90.anInt2404 = Static165.anInt4054;
			Static25.aClass1_Sub8_Sub1_1.method919(100);
			Static25.aClass1_Sub8_Sub1_1.method879(local14 + Static152.anInt3545);
			Static25.aClass1_Sub8_Sub1_1.method860(local10 + Static75.anInt2039);
			Static25.aClass1_Sub8_Sub1_1.method879(local28);
		}
		if (local18 == 22) {
			Static25.aClass1_Sub8_Sub1_1.method919(32);
			Static25.aClass1_Sub8_Sub1_1.method895(local28);
			Static25.aClass1_Sub8_Sub1_1.method860(local14);
			Static25.aClass1_Sub8_Sub1_1.method896(local10);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 16) {
			Static25.aClass1_Sub8_Sub1_1.method919(40);
			Static25.aClass1_Sub8_Sub1_1.method869(local14);
			Static25.aClass1_Sub8_Sub1_1.method904(local10);
			Static25.aClass1_Sub8_Sub1_1.method895(local28);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		@Pc(203) Class1_Sub1_Sub1_Sub1_Sub1 local203;
		if (local18 == 19) {
			local203 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
			if (local203 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local203.anIntArray248[0], local203.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static10.anInt388 = 0;
				Static90.anInt2404 = Static165.anInt4054;
				Static133.anInt3411 = 2;
				Static47.anInt1255 = Static38.anInt1049;
				Static25.aClass1_Sub8_Sub1_1.method919(80);
				Static25.aClass1_Sub8_Sub1_1.method879(local28);
			}
		}
		@Pc(259) Class60 local259;
		if (local18 == 5) {
			local259 = Static120.method2104(local10, local14);
			if (local259 != null) {
				Static179.method3083();
				Static155.method2631(Static34.method580(Static170.method475(local259)), local14, local10);
				Static144.anInt3643 = 0;
				Static123.aClass23_1195 = Static93.method1620(local259);
				if (Static123.aClass23_1195 == null) {
					Static123.aClass23_1195 = Static31.aClass23_313;
				}
				if (local259.aBoolean155) {
					Static25.aClass23_277 = Static149.method2571(new Class23[] { local259.aClass23_1140, Static111.aClass23_1086 });
					return;
				}
				Static25.aClass23_277 = Static149.method2571(new Class23[] { Static154.aClass23_1451, local259.aClass23_1139, Static111.aClass23_1086 });
			}
			return;
		}
		if (local18 == 49) {
			Static164.method2829(local14, local28, local10);
			Static25.aClass1_Sub8_Sub1_1.method919(19);
			Static25.aClass1_Sub8_Sub1_1.method879(local10 + Static75.anInt2039);
			Static25.aClass1_Sub8_Sub1_1.method879(local14 + Static152.anInt3545);
			Static25.aClass1_Sub8_Sub1_1.method895(local28 >> 14 & 0x7FFF);
		}
		if (local18 == 7) {
			local203 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
			if (local203 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local203.anIntArray248[0], local203.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static133.anInt3411 = 2;
				Static47.anInt1255 = Static38.anInt1049;
				Static10.anInt388 = 0;
				Static90.anInt2404 = Static165.anInt4054;
				Static25.aClass1_Sub8_Sub1_1.method919(132);
				Static25.aClass1_Sub8_Sub1_1.method860(local28);
			}
		}
		if (local18 == 30) {
			local203 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
			if (local203 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local203.anIntArray248[0], local203.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static10.anInt388 = 0;
				Static90.anInt2404 = Static165.anInt4054;
				Static133.anInt3411 = 2;
				Static47.anInt1255 = Static38.anInt1049;
				Static25.aClass1_Sub8_Sub1_1.method919(106);
				Static25.aClass1_Sub8_Sub1_1.method894(Static16.anInt493);
				Static25.aClass1_Sub8_Sub1_1.method869(Static65.anInt3651);
				Static25.aClass1_Sub8_Sub1_1.method879(Static66.anInt1741);
				Static25.aClass1_Sub8_Sub1_1.method879(local28);
			}
		}
		if (local18 == 32) {
			Static164.method2829(local14, local28, local10);
			Static25.aClass1_Sub8_Sub1_1.method919(50);
			Static25.aClass1_Sub8_Sub1_1.method860(Static75.anInt2039 + local10);
			Static25.aClass1_Sub8_Sub1_1.method895(local14 + Static152.anInt3545);
			Static25.aClass1_Sub8_Sub1_1.method869(local28 >> 14 & 0x7FFF);
		}
		if (local18 == 4) {
			local80 = Static95.method1631(0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 0);
			if (!local80) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
			}
			Static90.anInt2404 = Static165.anInt4054;
			Static47.anInt1255 = Static38.anInt1049;
			Static133.anInt3411 = 2;
			Static10.anInt388 = 0;
			Static25.aClass1_Sub8_Sub1_1.method919(82);
			Static25.aClass1_Sub8_Sub1_1.method860(Static152.anInt3545 + local14);
			Static25.aClass1_Sub8_Sub1_1.method879(local28);
			Static25.aClass1_Sub8_Sub1_1.method895(Static75.anInt2039 + local10);
		}
		if (local18 == 1 && Static164.method2829(local14, local28, local10)) {
			Static25.aClass1_Sub8_Sub1_1.method919(235);
			Static25.aClass1_Sub8_Sub1_1.method895(Static178.anInt4245);
			Static25.aClass1_Sub8_Sub1_1.method869(local10 + Static75.anInt2039);
			Static25.aClass1_Sub8_Sub1_1.method896(Static52.anInt1969);
			Static25.aClass1_Sub8_Sub1_1.method860(Static152.anInt3545 + local14);
			Static25.aClass1_Sub8_Sub1_1.method860(local28 >> 14 & 0x7FFF);
		}
		if (local18 == 40) {
			Static123.aClass80_1.method2661(Static85.anInt2267, local14, local10);
		}
		if (local18 == 50) {
			local80 = Static95.method1631(0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 0);
			if (!local80) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
			}
			Static10.anInt388 = 0;
			Static90.anInt2404 = Static165.anInt4054;
			Static133.anInt3411 = 2;
			Static47.anInt1255 = Static38.anInt1049;
			Static25.aClass1_Sub8_Sub1_1.method919(149);
			Static25.aClass1_Sub8_Sub1_1.method860(local10 + Static75.anInt2039);
			Static25.aClass1_Sub8_Sub1_1.method879(local28);
			Static25.aClass1_Sub8_Sub1_1.method860(Static152.anInt3545 + local14);
		}
		@Pc(742) Class1_Sub1_Sub1_Sub1_Sub2 local742;
		if (local18 == 36) {
			local742 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local742 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local742.anIntArray248[0], local742.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static47.anInt1255 = Static38.anInt1049;
				Static90.anInt2404 = Static165.anInt4054;
				Static10.anInt388 = 0;
				Static133.anInt3411 = 2;
				Static25.aClass1_Sub8_Sub1_1.method919(202);
				Static25.aClass1_Sub8_Sub1_1.method879(local28);
			}
		}
		if (local18 == 35) {
			Static25.aClass1_Sub8_Sub1_1.method919(77);
			Static25.aClass1_Sub8_Sub1_1.method895(local14);
			Static25.aClass1_Sub8_Sub1_1.method894(local10);
			Static25.aClass1_Sub8_Sub1_1.method895(local28);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 28) {
			local203 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
			if (local203 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local203.anIntArray248[0], local203.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static10.anInt388 = 0;
				Static90.anInt2404 = Static165.anInt4054;
				Static133.anInt3411 = 2;
				Static47.anInt1255 = Static38.anInt1049;
				Static25.aClass1_Sub8_Sub1_1.method919(247);
				Static25.aClass1_Sub8_Sub1_1.method895(local28);
			}
		}
		if (local18 == 11) {
			local742 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local742 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local742.anIntArray248[0], local742.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static47.anInt1255 = Static38.anInt1049;
				Static90.anInt2404 = Static165.anInt4054;
				Static10.anInt388 = 0;
				Static133.anInt3411 = 2;
				Static25.aClass1_Sub8_Sub1_1.method919(210);
				Static25.aClass1_Sub8_Sub1_1.method895(local28);
			}
		}
		if (local18 == 13) {
			local742 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local742 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local742.anIntArray248[0], local742.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static47.anInt1255 = Static38.anInt1049;
				Static90.anInt2404 = Static165.anInt4054;
				Static10.anInt388 = 0;
				Static133.anInt3411 = 2;
				Static25.aClass1_Sub8_Sub1_1.method919(250);
				Static25.aClass1_Sub8_Sub1_1.method860(local28);
				Static25.aClass1_Sub8_Sub1_1.method879(Static66.anInt1741);
				Static25.aClass1_Sub8_Sub1_1.method874(Static16.anInt493);
				Static25.aClass1_Sub8_Sub1_1.method869(Static65.anInt3651);
			}
		}
		if (local18 == 6) {
			local203 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
			if (local203 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local203.anIntArray248[0], local203.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static47.anInt1255 = Static38.anInt1049;
				Static10.anInt388 = 0;
				Static90.anInt2404 = Static165.anInt4054;
				Static133.anInt3411 = 2;
				Static25.aClass1_Sub8_Sub1_1.method919(226);
				Static25.aClass1_Sub8_Sub1_1.method895(local28);
			}
		}
		if (local18 == 31) {
			Static25.aClass1_Sub8_Sub1_1.method919(111);
			Static25.aClass1_Sub8_Sub1_1.method904(Static16.anInt493);
			Static25.aClass1_Sub8_Sub1_1.method860(local14);
			Static25.aClass1_Sub8_Sub1_1.method874(local10);
			Static25.aClass1_Sub8_Sub1_1.method860(Static66.anInt1741);
			Static25.aClass1_Sub8_Sub1_1.method879(Static65.anInt3651);
			Static25.aClass1_Sub8_Sub1_1.method879(local28);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 51) {
			local259 = Static111.method1964(local10);
			@Pc(1109) boolean local1109 = true;
			if (local259.anInt3007 > 0) {
				local1109 = Static182.method3159(local259);
			}
			if (local1109) {
				Static25.aClass1_Sub8_Sub1_1.method919(23);
				Static25.aClass1_Sub8_Sub1_1.method904(local10);
			}
		}
		if (local18 == 21) {
			Static25.aClass1_Sub8_Sub1_1.method919(255);
			Static25.aClass1_Sub8_Sub1_1.method869(local28);
			Static25.aClass1_Sub8_Sub1_1.method869(local14);
			Static25.aClass1_Sub8_Sub1_1.method896(local10);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 37) {
			Static25.aClass1_Sub8_Sub1_1.method919(83);
			Static25.aClass1_Sub8_Sub1_1.method860(local14);
			Static25.aClass1_Sub8_Sub1_1.method894(local10);
			Static25.aClass1_Sub8_Sub1_1.method895(local28);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 41) {
			local203 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
			if (local203 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local203.anIntArray248[0], local203.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static10.anInt388 = 0;
				Static133.anInt3411 = 2;
				Static90.anInt2404 = Static165.anInt4054;
				Static47.anInt1255 = Static38.anInt1049;
				Static25.aClass1_Sub8_Sub1_1.method919(126);
				Static25.aClass1_Sub8_Sub1_1.method879(local28);
			}
		}
		if (local18 == 23) {
			Static179.method3083();
			local259 = Static111.method1964(local10);
			Static65.anInt3651 = local28;
			Static144.anInt3643 = 1;
			Static16.anInt493 = local10;
			Static66.anInt1741 = local14;
			Static39.method659(local259);
			Static170.aClass23_284 = Static149.method2571(new Class23[] { Static45.aClass23_477, Static2.method118(local28).aClass23_431, Static111.aClass23_1086 });
			if (Static170.aClass23_284 == null) {
				Static170.aClass23_284 = Static42.aClass23_438;
			}
			return;
		}
		if (local18 == 47) {
			Static25.aClass1_Sub8_Sub1_1.method919(183);
			Static25.aClass1_Sub8_Sub1_1.method874(local10);
			Static25.aClass1_Sub8_Sub1_1.method879(local14);
			Static25.aClass1_Sub8_Sub1_1.method869(local28);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 38) {
			local742 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local742 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local742.anIntArray248[0], local742.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static47.anInt1255 = Static38.anInt1049;
				Static133.anInt3411 = 2;
				Static10.anInt388 = 0;
				Static90.anInt2404 = Static165.anInt4054;
				Static25.aClass1_Sub8_Sub1_1.method919(10);
				Static25.aClass1_Sub8_Sub1_1.method869(local28);
			}
		}
		if (local18 == 14) {
			local203 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
			if (local203 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local203.anIntArray248[0], local203.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static10.anInt388 = 0;
				Static47.anInt1255 = Static38.anInt1049;
				Static133.anInt3411 = 2;
				Static90.anInt2404 = Static165.anInt4054;
				Static25.aClass1_Sub8_Sub1_1.method919(237);
				Static25.aClass1_Sub8_Sub1_1.method860(local28);
			}
		}
		if (local18 == 10 && Static98.aClass60_5 == null) {
			Static52.method1297(local14, local10);
			Static98.aClass60_5 = Static120.method2104(local10, local14);
			Static39.method659(Static98.aClass60_5);
		}
		if (local18 == 9) {
			Static73.method1335();
		}
		if (local18 == 26) {
			Static164.method2829(local14, local28, local10);
			Static25.aClass1_Sub8_Sub1_1.method919(0);
			Static25.aClass1_Sub8_Sub1_1.method869(Static75.anInt2039 + local10);
			Static25.aClass1_Sub8_Sub1_1.method895(Static152.anInt3545 + local14);
			Static25.aClass1_Sub8_Sub1_1.method895(local28 >> 14 & 0x7FFF);
		}
		if (local18 == 24) {
			local80 = Static95.method1631(0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 0);
			if (!local80) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
			}
			Static10.anInt388 = 0;
			Static47.anInt1255 = Static38.anInt1049;
			Static90.anInt2404 = Static165.anInt4054;
			Static133.anInt3411 = 2;
			Static25.aClass1_Sub8_Sub1_1.method919(47);
			Static25.aClass1_Sub8_Sub1_1.method895(Static66.anInt1741);
			Static25.aClass1_Sub8_Sub1_1.method860(local28);
			Static25.aClass1_Sub8_Sub1_1.method904(Static16.anInt493);
			Static25.aClass1_Sub8_Sub1_1.method860(Static152.anInt3545 + local14);
			Static25.aClass1_Sub8_Sub1_1.method869(Static75.anInt2039 + local10);
			Static25.aClass1_Sub8_Sub1_1.method895(Static65.anInt3651);
		}
		if (local18 == 43) {
			local80 = Static95.method1631(0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 0);
			if (!local80) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
			}
			Static90.anInt2404 = Static165.anInt4054;
			Static47.anInt1255 = Static38.anInt1049;
			Static10.anInt388 = 0;
			Static133.anInt3411 = 2;
			Static25.aClass1_Sub8_Sub1_1.method919(128);
			Static25.aClass1_Sub8_Sub1_1.method869(Static152.anInt3545 + local14);
			Static25.aClass1_Sub8_Sub1_1.method895(local10 + Static75.anInt2039);
			Static25.aClass1_Sub8_Sub1_1.method869(local28);
		}
		if (local18 == 1001) {
			Static133.anInt3411 = 2;
			Static10.anInt388 = 0;
			Static90.anInt2404 = Static165.anInt4054;
			Static47.anInt1255 = Static38.anInt1049;
			Static25.aClass1_Sub8_Sub1_1.method919(92);
			Static25.aClass1_Sub8_Sub1_1.method879(local28 >> 14 & 0x7FFF);
		}
		if (local18 == 33) {
			local203 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
			if (local203 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local203.anIntArray248[0], local203.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static133.anInt3411 = 2;
				Static90.anInt2404 = Static165.anInt4054;
				Static10.anInt388 = 0;
				Static47.anInt1255 = Static38.anInt1049;
				Static25.aClass1_Sub8_Sub1_1.method919(153);
				Static25.aClass1_Sub8_Sub1_1.method879(local28);
			}
		}
		if (local18 == 42) {
			local203 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
			if (local203 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local203.anIntArray248[0], local203.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static47.anInt1255 = Static38.anInt1049;
				Static10.anInt388 = 0;
				Static90.anInt2404 = Static165.anInt4054;
				Static133.anInt3411 = 2;
				Static25.aClass1_Sub8_Sub1_1.method919(142);
				Static25.aClass1_Sub8_Sub1_1.method879(Static178.anInt4245);
				Static25.aClass1_Sub8_Sub1_1.method869(local28);
				Static25.aClass1_Sub8_Sub1_1.method904(Static52.anInt1969);
			}
		}
		@Pc(1860) int local1860;
		if (local18 == 39) {
			Static25.aClass1_Sub8_Sub1_1.method919(23);
			Static25.aClass1_Sub8_Sub1_1.method904(local10);
			local259 = Static111.method1964(local10);
			if (local259.anIntArrayArray28 != null && local259.anIntArrayArray28[0][0] == 5) {
				local1860 = local259.anIntArrayArray28[0][1];
				Static27.anIntArray108[local1860] = 1 - Static27.anIntArray108[local1860];
				Static167.method2884(local1860);
			}
		}
		if (local18 == 34) {
			local80 = Static95.method1631(0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 0);
			if (!local80) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
			}
			Static47.anInt1255 = Static38.anInt1049;
			Static133.anInt3411 = 2;
			Static90.anInt2404 = Static165.anInt4054;
			Static10.anInt388 = 0;
			Static25.aClass1_Sub8_Sub1_1.method919(76);
			Static25.aClass1_Sub8_Sub1_1.method869(Static178.anInt4245);
			Static25.aClass1_Sub8_Sub1_1.method869(local28);
			Static25.aClass1_Sub8_Sub1_1.method874(Static52.anInt1969);
			Static25.aClass1_Sub8_Sub1_1.method860(Static75.anInt2039 + local10);
			Static25.aClass1_Sub8_Sub1_1.method869(Static152.anInt3545 + local14);
		}
		if (local18 == 3) {
			Static164.method2829(local14, local28, local10);
			Static25.aClass1_Sub8_Sub1_1.method919(238);
			Static25.aClass1_Sub8_Sub1_1.method895(local28 >> 14 & 0x7FFF);
			Static25.aClass1_Sub8_Sub1_1.method860(Static152.anInt3545 + local14);
			Static25.aClass1_Sub8_Sub1_1.method895(local10 + Static75.anInt2039);
		}
		if (local18 == 12) {
			local80 = Static95.method1631(0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 0);
			if (!local80) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local10, local14, 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
			}
			Static47.anInt1255 = Static38.anInt1049;
			Static133.anInt3411 = 2;
			Static10.anInt388 = 0;
			Static90.anInt2404 = Static165.anInt4054;
			Static25.aClass1_Sub8_Sub1_1.method919(108);
			Static25.aClass1_Sub8_Sub1_1.method895(local28);
			Static25.aClass1_Sub8_Sub1_1.method869(local14 + Static152.anInt3545);
			Static25.aClass1_Sub8_Sub1_1.method879(local10 + Static75.anInt2039);
		}
		if (local18 == 1002) {
			Static47.anInt1255 = Static38.anInt1049;
			Static90.anInt2404 = Static165.anInt4054;
			Static133.anInt3411 = 2;
			Static10.anInt388 = 0;
			local742 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local742 != null) {
				@Pc(2097) Class1_Sub1_Sub9 local2097 = local742.aClass1_Sub1_Sub9_1;
				if (local2097.anIntArray174 != null) {
					local2097 = local2097.method986();
				}
				if (local2097 != null) {
					Static25.aClass1_Sub8_Sub1_1.method919(179);
					Static25.aClass1_Sub8_Sub1_1.method860(local2097.anInt1518);
				}
			}
		}
		if (local18 == 25) {
			Static25.aClass1_Sub8_Sub1_1.method919(191);
			Static25.aClass1_Sub8_Sub1_1.method894(local10);
			Static25.aClass1_Sub8_Sub1_1.method895(local28);
			Static25.aClass1_Sub8_Sub1_1.method869(local14);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 15) {
			Static25.aClass1_Sub8_Sub1_1.method919(23);
			Static25.aClass1_Sub8_Sub1_1.method904(local10);
			local259 = Static111.method1964(local10);
			if (local259.anIntArrayArray28 != null && local259.anIntArrayArray28[0][0] == 5) {
				local1860 = local259.anIntArrayArray28[0][1];
				if (Static27.anIntArray108[local1860] != local259.anIntArray403[0]) {
					Static27.anIntArray108[local1860] = local259.anIntArray403[0];
					Static167.method2884(local1860);
				}
			}
		}
		if (local18 == 17) {
			local742 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local742 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local742.anIntArray248[0], local742.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static47.anInt1255 = Static38.anInt1049;
				Static90.anInt2404 = Static165.anInt4054;
				Static10.anInt388 = 0;
				Static133.anInt3411 = 2;
				Static25.aClass1_Sub8_Sub1_1.method919(110);
				Static25.aClass1_Sub8_Sub1_1.method879(local28);
			}
		}
		if (local18 == 1006) {
			local259 = Static111.method1964(local10);
			if (local259 == null || local259.anIntArray398[local14] < 100000) {
				Static25.aClass1_Sub8_Sub1_1.method919(28);
				Static25.aClass1_Sub8_Sub1_1.method879(local28);
			} else {
				Static73.method1339(Static149.method2571(new Class23[] { Static27.method498(local259.anIntArray398[local14]), Static89.aClass23_889, Static2.method118(local28).aClass23_431 }), Static101.aClass23_1001, 0);
			}
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 29 || local18 == 1004) {
			Static123.method2191(local28, local14, local10, Static104.aClass23Array12[arg0]);
		}
		if (local18 == 57) {
			local742 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local742 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local742.anIntArray248[0], local742.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static90.anInt2404 = Static165.anInt4054;
				Static133.anInt3411 = 2;
				Static10.anInt388 = 0;
				Static47.anInt1255 = Static38.anInt1049;
				Static25.aClass1_Sub8_Sub1_1.method919(78);
				Static25.aClass1_Sub8_Sub1_1.method896(Static52.anInt1969);
				Static25.aClass1_Sub8_Sub1_1.method860(local28);
				Static25.aClass1_Sub8_Sub1_1.method860(Static178.anInt4245);
			}
		}
		if (local18 == 8) {
			Static25.aClass1_Sub8_Sub1_1.method919(205);
			Static25.aClass1_Sub8_Sub1_1.method904(local10);
			Static25.aClass1_Sub8_Sub1_1.method869(local28);
			Static25.aClass1_Sub8_Sub1_1.method879(local14);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 44) {
			Static25.aClass1_Sub8_Sub1_1.method919(131);
			Static25.aClass1_Sub8_Sub1_1.method869(local28);
			Static25.aClass1_Sub8_Sub1_1.method860(local14);
			Static25.aClass1_Sub8_Sub1_1.method874(local10);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 2) {
			Static25.aClass1_Sub8_Sub1_1.method919(39);
			Static25.aClass1_Sub8_Sub1_1.method869(local14);
			Static25.aClass1_Sub8_Sub1_1.method879(local28);
			Static25.aClass1_Sub8_Sub1_1.method874(local10);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 58) {
			Static25.aClass1_Sub8_Sub1_1.method919(25);
			Static25.aClass1_Sub8_Sub1_1.method860(Static178.anInt4245);
			Static25.aClass1_Sub8_Sub1_1.method904(local10);
			Static25.aClass1_Sub8_Sub1_1.method896(Static52.anInt1969);
			Static25.aClass1_Sub8_Sub1_1.method879(local14);
		}
		if (local18 == 45) {
			local203 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local28];
			if (local203 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local203.anIntArray248[0], local203.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static133.anInt3411 = 2;
				Static10.anInt388 = 0;
				Static47.anInt1255 = Static38.anInt1049;
				Static90.anInt2404 = Static165.anInt4054;
				Static25.aClass1_Sub8_Sub1_1.method919(81);
				Static25.aClass1_Sub8_Sub1_1.method869(local28);
			}
		}
		if (local18 == 46) {
			local742 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local742 != null) {
				Static95.method1631(1, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local742.anIntArray248[0], local742.anIntArray250[0], 0, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], 0, false, 2, 0, 1);
				Static90.anInt2404 = Static165.anInt4054;
				Static47.anInt1255 = Static38.anInt1049;
				Static133.anInt3411 = 2;
				Static10.anInt388 = 0;
				Static25.aClass1_Sub8_Sub1_1.method919(120);
				Static25.aClass1_Sub8_Sub1_1.method879(local28);
			}
		}
		if (local18 == 1007) {
			Static164.method2829(local14, local28, local10);
			Static25.aClass1_Sub8_Sub1_1.method919(22);
			Static25.aClass1_Sub8_Sub1_1.method879(local14 + Static152.anInt3545);
			Static25.aClass1_Sub8_Sub1_1.method869(Static75.anInt2039 + local10);
			Static25.aClass1_Sub8_Sub1_1.method879(local28 >> 14 & 0x7FFF);
		}
		if (local18 == 48) {
			Static25.aClass1_Sub8_Sub1_1.method919(196);
			Static25.aClass1_Sub8_Sub1_1.method874(Static52.anInt1969);
			Static25.aClass1_Sub8_Sub1_1.method879(Static178.anInt4245);
			Static25.aClass1_Sub8_Sub1_1.method869(local14);
			Static25.aClass1_Sub8_Sub1_1.method894(local10);
			Static25.aClass1_Sub8_Sub1_1.method879(local28);
			Static82.anInt2196 = 0;
			Static67.aClass60_2 = Static111.method1964(local10);
			Static156.anInt3818 = local14;
		}
		if (local18 == 20 && Static164.method2829(local14, local28, local10)) {
			Static25.aClass1_Sub8_Sub1_1.method919(62);
			Static25.aClass1_Sub8_Sub1_1.method904(Static16.anInt493);
			Static25.aClass1_Sub8_Sub1_1.method879(local28 >> 14 & 0x7FFF);
			Static25.aClass1_Sub8_Sub1_1.method879(Static66.anInt1741);
			Static25.aClass1_Sub8_Sub1_1.method895(local14 + Static152.anInt3545);
			Static25.aClass1_Sub8_Sub1_1.method879(Static75.anInt2039 + local10);
			Static25.aClass1_Sub8_Sub1_1.method879(Static65.anInt3651);
		}
		if (Static144.anInt3643 != 0) {
			Static144.anInt3643 = 0;
			Static39.method659(Static111.method1964(Static16.anInt493));
		}
		if (Static156.aBoolean195) {
			Static179.method3083();
		}
		if (Static67.aClass60_2 != null && Static82.anInt2196 == 0) {
			Static39.method659(Static67.aClass60_2);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method1770(@OriginalArg(0) Class1_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt1815 == 0) {
			arg0.anInt1860 = 1024;
		}
		arg0.anInt1814 = 0;
		@Pc(22) int local22 = arg0.anInt1811 * 128 + arg0.anInt1824 * 64;
		@Pc(27) int local27 = arg0.anInt1854 - Static26.anInt845;
		@Pc(41) int local41 = arg0.anInt1858 * 128 + arg0.anInt1824 * 64;
		arg0.anInt1825 += (local22 - arg0.anInt1825) / local27;
		if (arg0.anInt1815 == 1) {
			arg0.anInt1860 = 1536;
		}
		arg0.anInt1838 += (local41 - arg0.anInt1838) / local27;
		if (arg0.anInt1815 == 2) {
			arg0.anInt1860 = 0;
		}
		if (arg0.anInt1815 == 3) {
			arg0.anInt1860 = 512;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ed;BZ)V")
	public static void method1773(@OriginalArg(0) Class23 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) Class23 local5 = arg0.method638();
		@Pc(8) short[] local8 = new short[16];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < Static79.anInt2155; local21++) {
			@Pc(27) Class1_Sub1_Sub7 local27 = Static2.method118(local21);
			if ((!arg1 || local27.aBoolean53) && local27.aClass23_431.method638().method655(local5) != -1) {
				if (local19 >= 250) {
					Static84.aShortArray47 = null;
					Static161.anInt3972 = -1;
					return;
				}
				if (local8.length <= local19) {
					@Pc(62) short[] local62 = new short[local8.length * 2];
					for (@Pc(64) int local64 = 0; local64 < local19; local64++) {
						local62[local64] = local8[local64];
					}
					local8 = local62;
				}
				local8[local19++] = (short) local21;
			}
		}
		Static84.aShortArray47 = local8;
		Static161.anInt3972 = local19;
		@Pc(99) Class23[] local99 = new Class23[Static161.anInt3972];
		Static100.anInt2566 = 0;
		for (@Pc(103) int local103 = 0; local103 < Static161.anInt3972; local103++) {
			local99[local103] = Static2.method118(local8[local103]).aClass23_431;
		}
		Static92.method1618(Static84.aShortArray47, local99);
	}
}
