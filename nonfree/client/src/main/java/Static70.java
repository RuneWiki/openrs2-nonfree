import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	public static int anInt1418;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Z")
	public static boolean aBoolean94 = false;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method1164(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (Static193.aClass178_9 == Static324.aClass178_18 && Static270.anInt4509 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg0.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static397.aBoolean449 = true;
				Static385.method5096("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static397.aBoolean449 = false;
				Static385.method5096("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static385.method5096("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(77) Throwable local77) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static197.anInt3567 = 0;
				Static278.anInt4618 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static436.aClass248_8.method5581();
				Static385.method5096("Text coords cleared");
				return;
			}
			@Pc(128) int local128;
			@Pc(108) int local108;
			@Pc(119) Runtime local119;
			if (arg0.equalsIgnoreCase("gc")) {
				Static270.method3596();
				for (local108 = 0; local108 < 10; local108++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local128 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static385.method5096("mem=" + local128 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static270.method3596();
				for (local108 = 0; local108 < 10; local108++) {
					System.gc();
				}
				local119 = Runtime.getRuntime();
				local128 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static385.method5096("Memory before cleanup=" + local128 + "k");
				Static138.method1970();
				Static270.method3596();
				for (@Pc(186) int local186 = 0; local186 < 10; local186++) {
					System.gc();
				}
				local128 = (int) ((local119.totalMemory() - local119.freeMemory()) / 1024L);
				Static385.method5096("Memory after cleanup=" + local128 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static385.method5096("Number of player models in cache:" + Static232.method3163());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static385.method5096("Dropped client connection");
				if (Static8.anInt119 == 9) {
					Static288.method3772();
					return;
				}
				if (Static8.anInt119 == 10) {
					Static188.aBoolean267 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static373.aClass54_2.method1240();
				Static385.method5096("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static373.aClass54_2.method1241();
				Static385.method5096("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static24.aClass196_1.method3910();
				Static338.aClass152_4.method2922();
				Static373.aClass54_2.method1243();
				Static385.method5096("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static84.method4130();
				Static351.method4657();
				Static385.method5096("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static265.method3497(false, -1, -1, 1);
				if (Static37.method500() == 1) {
					Static385.method5096("wm1 succeeded");
					return;
				}
				Static385.method5096("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static265.method3497(false, -1, -1, 2);
				if (Static37.method500() != 2) {
					Static385.method5096("wm2 failed");
					return;
				}
				Static385.method5096("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static265.method3497(false, 768, 1024, 3);
				if (Static37.method500() == 3) {
					Static385.method5096("wm3 succeeded");
					return;
				}
				Static385.method5096("wm3 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static398.method4984(0);
				if (Static341.anInt5549 != 0) {
					Static385.method5096("Failed to enter tk0");
					return;
				}
				Static385.method5096("Entered tk0");
				Static413.aClass49_Sub1_1.anInt3221 = 0;
				Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
				Static340.aBoolean392 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static398.method4984(1);
				if (Static341.anInt5549 == 1) {
					Static385.method5096("Entered tk1");
					Static413.aClass49_Sub1_1.anInt3221 = 1;
					Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
					Static340.aBoolean392 = false;
					return;
				}
				Static385.method5096("Failed to enter tk1");
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static398.method4984(2);
				if (Static341.anInt5549 != 2) {
					Static385.method5096("Failed to enter tk2");
					return;
				}
				Static385.method5096("Entered tk2");
				Static413.aClass49_Sub1_1.anInt3221 = 2;
				Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
				Static340.aBoolean392 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static398.method4984(3);
				if (Static341.anInt5549 == 3) {
					Static385.method5096("Entered tk3");
					return;
				}
				Static385.method5096("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static413.aClass49_Sub1_1.aBoolean232 = !Static413.aClass49_Sub1_1.aBoolean232;
				Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
				Static340.aBoolean392 = false;
				Static84.method4130();
				Static385.method5096("ot=" + Static413.aClass49_Sub1_1.aBoolean232);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static413.aClass49_Sub1_1.aBoolean247 = !Static413.aClass49_Sub1_1.aBoolean247;
				Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
				Static340.aBoolean392 = false;
				Static84.method4130();
				Static385.method5096("gb=" + Static413.aClass49_Sub1_1.aBoolean247);
				return;
			}
			@Pc(591) int local591;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static385.method5096("Invalid shadows value");
					return;
				}
				@Pc(579) String local579 = arg0.substring(8);
				local591 = Static269.method3566(local579) ? Static113.method1676(local579) : -1;
				if (local591 >= 0 && local591 <= 2) {
					Static413.aClass49_Sub1_1.method2480(Static341.anInt5549, local591);
					Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
					Static340.aBoolean392 = false;
					Static84.method4130();
					Static385.method5096("shadows=" + local591);
					return;
				}
				Static385.method5096("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static413.aClass49_Sub1_1.aBoolean237 = !Static413.aClass49_Sub1_1.aBoolean237;
				Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
				Static340.aBoolean392 = false;
				Static207.method2904();
				Static84.method4130();
				Static385.method5096("textures=" + Static413.aClass49_Sub1_1.aBoolean237);
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static385.method5096("Invalid buildarea value");
					return;
				}
				local108 = Static113.method1676(arg0.substring(6));
				if (local108 >= 0 && Static134.method1950(Static18.anInt296) >= local108) {
					Static413.aClass49_Sub1_1.anInt3201 = local108;
					Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
					Static340.aBoolean392 = false;
					Static385.method5096("maxbuildarea=" + Static413.aClass49_Sub1_1.anInt3201);
					return;
				}
				Static385.method5096("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static385.method5096("Invalid particles value");
					return;
				}
				Static420.method5669(Static113.method1676(arg0.substring(13)));
				Static413.aClass49_Sub1_1.method2483(Static24.aClass196_1);
				Static340.aBoolean392 = false;
				Static385.method5096("particles=" + Static370.method4889());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static385.method5096("Invalid rect_debug value");
					return;
				}
				Static271.anInt4516 = Static113.method1676(arg0.substring(10).trim());
				Static385.method5096("rect_debug=" + Static271.anInt4516);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static37.aBoolean35 = true;
				Static385.method5096("qa_op_test=" + Static37.aBoolean35);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static111.aBoolean145 = !Static111.aBoolean145;
				Static385.method5096("clipcomponents=" + Static111.aBoolean145);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(835) boolean local835 = Static39.aClass135_1.method5355();
				if (!Static350.method4638(!local835)) {
					Static385.method5096("Failed to enable bloom");
					return;
				}
				if (!local835) {
					Static385.method5096("Bloom enabled");
					return;
				}
				Static385.method5096("Bloom disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static272.aBoolean335) {
					Static272.aBoolean335 = true;
					Static385.method5096("Forced tweening ENABLED!");
					return;
				}
				Static272.aBoolean335 = false;
				Static385.method5096("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static196.aBoolean269) {
					Static385.method5096("Shift-click disabled.");
					Static196.aBoolean269 = false;
					return;
				}
				Static385.method5096("Shift-click ENABLED!");
				Static196.aBoolean269 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static385.method5096("x:" + (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 >> 7) + " z:" + (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static385.method5096("Height: " + Static278.aClass41Array3[Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99].l(Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 >> 7, Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static13.aClass211_11.method4357();
				Static13.aClass211_11.method4379();
				Static357.aClass122_3.method2321();
				Static82.aClass235_1.method4962();
				Static351.method4657();
				Static385.method5096("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static39.aClass135_1.method5393()) {
					Static385.method5096("Current toolkit doesn't support multiple cores");
					return;
				}
				local108 = Integer.parseInt(arg0.substring(3));
				if (local108 < 1) {
					local108 = 1;
				} else if (local108 > 4) {
					local108 = 4;
				}
				Static114.anInt2109 = local108;
				Static39.aClass135_1.method5373(Static114.anInt2109);
				Static39.aClass135_1.method5335(0);
				Static385.method5096("Render cores now: " + Static114.anInt2109);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static385.method5096("I(s): " + Static55.aClass137_9.method2741() + "/" + Static55.aClass137_9.method2734());
				Static385.method5096("I(m): " + Static454.aClass137_59.method2741() + "/" + Static454.aClass137_59.method2734());
				Static385.method5096("O(s): " + Static416.aClass64_2.aClass162_1.method3171() + "/" + Static416.aClass64_2.aClass162_1.method3176());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static385.method5096("Pos: " + Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 + "," + ((Static235.anInt4004 >> 7) + Static365.anInt6047 >> 6) + "," + ((Static393.anInt7135 >> 7) + Static366.anInt6052 >> 6) + "," + ((Static235.anInt4004 >> 7) + Static365.anInt6047 & 0x3F) + "," + (Static366.anInt6052 + (Static393.anInt7135 >> 7) & 0x3F) + " Height: " + (Static94.method4425(Static393.anInt7135, Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99, Static235.anInt4004) - Static222.anInt3814));
				Static385.method5096("Look: " + Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 + "," + (Static392.anInt6418 + Static365.anInt6047 >> 6) + "," + (Static288.anInt4738 + Static366.anInt6052 >> 6) + "," + (Static365.anInt6047 + Static392.anInt6418 & 0x3F) + "," + (Static288.anInt4738 + Static366.anInt6052 & 0x3F) + " Height: " + (Static94.method4425(Static288.anInt4738, Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99, Static392.anInt6418) - Static142.anInt2538));
				return;
			}
			if (arg0.equals("showocc")) {
				Static417.aBoolean498 = !Static417.aBoolean498;
				Static84.method4130();
				Static385.method5096("showocc=" + Static417.aBoolean498);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static318.aBoolean371 = !Static318.aBoolean371;
				Static84.method4130();
				Static385.method5096("forcewallocc=" + Static318.aBoolean371);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static170.aBoolean514 = !Static170.aBoolean514;
				Static39.aClass135_1.method5339(Static170.aBoolean514);
				Static453.method6003();
				Static385.method5096("showprofiling=" + Static170.aBoolean514);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static385.method5096("Java toolkit: " + Static307.method4004(Static24.aClass196_1));
				Static385.method5096("GL toolkit:   " + Static307.method4004(Static24.aClass196_1));
				Static385.method5096("SSE toolkit:  " + Static307.method4004(Static24.aClass196_1));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static132.aBoolean159 = !Static132.aBoolean159;
				Static385.method5096("nonpcs=" + Static132.aBoolean159);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static53.method707();
				Static385.method5096("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local108 = Integer.parseInt(arg0.substring(12));
				Static355.method4690(local108, Static252.method3320(local108).aString34);
				Static385.method5096("switched");
				return;
			}
			if (arg0.startsWith("pc")) {
				Static448.method5935(Static125.aClass146_39);
				Static247.aClass4_Sub9_Sub2_2.method4999(0);
				local108 = Static247.aClass4_Sub9_Sub2_2.anInt6207;
				local591 = arg0.indexOf(" ", 4);
				Static247.aClass4_Sub9_Sub2_2.method5039(arg0.substring(3, local591));
				Static390.method6052(Static247.aClass4_Sub9_Sub2_2, arg0.substring(local591));
				Static247.aClass4_Sub9_Sub2_2.method5025(Static247.aClass4_Sub9_Sub2_2.anInt6207 - local108);
				return;
			}
			if (arg0.equals("heap")) {
				Static385.method5096("Heap: " + Static18.anInt296 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static125.method1758();
				Static385.method5096("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local108 = 0; local108 < Static83.anIntArray416.length; local108++) {
					if (Static269.aBooleanArray22[local108]) {
						Static83.anIntArray416[local108] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static83.anIntArray416[local108] *= -1;
						}
					}
				}
				Static125.method1758();
				Static385.method5096("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static11.aBoolean7 = true;
				Static351.method4657();
				Static385.method5096("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static11.aBoolean7 = false;
				Static351.method4657();
				Static385.method5096("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static297.method3871();
				Static385.method5096("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static385.method5096(Static259.method3461() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local108 = Integer.parseInt(arg0.substring(9));
				if (local108 >= 0 && local108 <= 4) {
					Static413.aClass49_Sub1_1.anInt3216 = local108;
				}
				Static385.method5096("cpuusage=" + Static413.aClass49_Sub1_1.anInt3216);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local108 = Integer.parseInt(arg0.substring(17));
				Static385.method5096("varpbit=" + Static52.aClass81_1.method1660(local108));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local108 = Integer.parseInt(arg0.substring(14));
				Static385.method5096("varp=" + Static52.aClass81_1.method1659(local108));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static44.method582(0, false);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static44.method582(0, true);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1652) String[] local1652 = Static15.method181(arg0.substring(12), ' ');
				if (local1652.length >= 2) {
					local591 = local1652.length > 2 ? Integer.parseInt(local1652[2]) : 0;
					Static136.method1958(local1652[0], local1652[1], local591);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static80.method1287();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static80.method1284();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static80.method1284();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local108 = Integer.parseInt(arg0.substring(8));
				Static39.aClass135_1.method5371(local108);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static385.method5096("Active streams: " + Static406.aClass4_Sub14_Sub2_2.method2419());
				return;
			}
			if (Static8.anInt119 == 9) {
				Static448.method5935(Static84.aClass146_70);
				Static247.aClass4_Sub9_Sub2_2.method4999(arg0.length() + 2);
				Static247.aClass4_Sub9_Sub2_2.method4999(arg1 ? 1 : 0);
				Static247.aClass4_Sub9_Sub2_2.method5039(arg0);
			}
			if (arg0.startsWith("fps ") && Static324.aClass178_18 != Static193.aClass178_9) {
				Static241.method3217(Static113.method1676(arg0.substring(4)));
				return;
			}
			if (Static8.anInt119 != 9) {
				Static385.method5096("Unrecogonised commmand when not logged in: " + arg0);
			}
		} catch (@Pc(1791) Exception local1791) {
			Static385.method5096("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public static void method1165() {
		if (Static39.aClass135_1 == null) {
			return;
		}
		Static301.aClass248_6.method5581();
		Static382.method5075();
		Static351.method4657();
		Static370.method4890();
		Static331.method4358();
		Static156.method2199();
		if (Static113.aClass209_1 != null) {
			Static113.aClass209_1.method4305();
		}
		Static146.method2051();
		Static297.method3871();
		Static25.method343();
		Static284.method3714(false);
		Static194.method5775();
		for (@Pc(38) int local38 = 0; local38 < 2048; local38++) {
			@Pc(44) Class8_Sub3_Sub1_Sub1 local44 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local38];
			if (local44 != null) {
				local44.aClass4_Sub3_3 = null;
				for (@Pc(51) int local51 = 0; local51 < local44.aClass116Array3.length; local51++) {
					local44.aClass116Array3[local51] = null;
				}
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static367.aClass8_Sub3_Sub1_Sub2Array1.length; local70++) {
			@Pc(76) Class8_Sub3_Sub1_Sub2 local76 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local70];
			if (local76 != null) {
				for (@Pc(80) int local80 = 0; local80 < local76.aClass116Array3.length; local80++) {
					local76.aClass116Array3[local80] = null;
				}
			}
		}
		Static412.aClass35_4 = null;
		Static423.aClass35_5 = null;
		Static39.aClass135_1.method5332();
		Static39.aClass135_1 = null;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)V")
	public static void method1167() {
		@Pc(15) int local15 = Static413.aClass49_Sub1_1.method2488(Static341.anInt5549);
		if (local15 == 0) {
			Static267.aByteArrayArrayArray14 = null;
			Static236.method3188(0);
		} else if (local15 == 1) {
			Static318.method4138((byte) 0);
			Static236.method3188(512);
			if (Static4.aByteArrayArrayArray1 != null) {
				Static328.method4327();
			}
		} else {
			Static318.method4138((byte) (Static129.anInt2333 - 4 & 0xFF));
			Static236.method3188(2);
		}
		Static411.anInt6946 = Static68.anInt1387;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
	public static int method1168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static436.aByteArrayArray19 == null ? 0 : Static436.aByteArrayArray19[arg0][arg1] & 0xFF;
	}
}
