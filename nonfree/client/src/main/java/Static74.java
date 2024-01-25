import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!ph;")
	public static Class187 aClass187_30;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "Lclient!os;")
	public static final Class182 aClass182_61 = new Class182("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
	public static int anInt1518 = 0;

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public static int anInt1519 = 0;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
	public static final int anInt1520 = 4;

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Z")
	public static boolean aBoolean106 = true;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/lang/String;ZZI)V")
	public static void method1394(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (Static110.aClass151_5 == Static284.aClass151_8 && Static200.anInt3974 < 2) {
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
				Static419.aBoolean462 = true;
				Static16.method251("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static419.aBoolean462 = false;
				Static16.method251("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static16.method251("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(75) Throwable local75) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static302.anInt5234 = 0;
				Static250.anInt4507 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static124.aClass240_1.method5232();
				Static16.method251("Text coords cleared");
				return;
			}
			@Pc(122) int local122;
			@Pc(104) int local104;
			@Pc(113) Runtime local113;
			if (arg0.equalsIgnoreCase("gc")) {
				Static133.method2302();
				for (local104 = 0; local104 < 10; local104++) {
					System.gc();
				}
				local113 = Runtime.getRuntime();
				local122 = (int) ((local113.totalMemory() - local113.freeMemory()) / 1024L);
				Static16.method251("mem=" + local122 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static133.method2302();
				for (local104 = 0; local104 < 10; local104++) {
					System.gc();
				}
				local113 = Runtime.getRuntime();
				local122 = (int) ((local113.totalMemory() - local113.freeMemory()) / 1024L);
				Static16.method251("Memory before cleanup=" + local122 + "k");
				Static168.method2799();
				Static133.method2302();
				for (@Pc(177) int local177 = 0; local177 < 10; local177++) {
					System.gc();
				}
				local122 = (int) ((local113.totalMemory() - local113.freeMemory()) / 1024L);
				Static16.method251("Memory after cleanup=" + local122 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static16.method251("Number of player models in cache:" + Static325.method4455());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static16.method251("Dropped client connection");
				if (Static358.anInt6086 == 9) {
					Static106.method1864();
				} else if (Static358.anInt6086 == 10) {
					Static317.aBoolean361 = true;
					return;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static12.aClass103_1.method2602();
				Static16.method251("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static12.aClass103_1.method2594();
				Static16.method251("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static171.aClass159_1.method3503();
				Static160.aClass253_3.method5488();
				Static12.aClass103_1.method2596();
				Static16.method251("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static44.method658();
				Static341.method4585();
				Static16.method251("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static215.method3290(-1, 1, -1, false);
				if (Static211.method3254() != 1) {
					Static16.method251("wm1 failed");
					return;
				}
				Static16.method251("wm1 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static215.method3290(-1, 2, -1, false);
				if (Static211.method3254() != 2) {
					Static16.method251("wm2 failed");
					return;
				}
				Static16.method251("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static215.method3290(1024, 3, 768, false);
				if (Static211.method3254() != 3) {
					Static16.method251("wm3 failed");
					return;
				}
				Static16.method251("wm3 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static178.method2951(0);
				if (Static423.anInt7114 == 0) {
					Static16.method251("Entered tk0");
					Static361.aClass85_Sub1_1.anInt2484 = 0;
					Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
					Static419.aBoolean463 = false;
					return;
				}
				Static16.method251("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static178.method2951(1);
				if (Static423.anInt7114 != 1) {
					Static16.method251("Failed to enter tk1");
					return;
				}
				Static16.method251("Entered tk1");
				Static361.aClass85_Sub1_1.anInt2484 = 1;
				Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
				Static419.aBoolean463 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static178.method2951(2);
				if (Static423.anInt7114 == 2) {
					Static16.method251("Entered tk2");
					Static361.aClass85_Sub1_1.anInt2484 = 2;
					Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
					Static419.aBoolean463 = false;
					return;
				}
				Static16.method251("Failed to enter tk2");
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static178.method2951(3);
				if (Static423.anInt7114 == 3) {
					Static16.method251("Entered tk3");
					return;
				}
				Static16.method251("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static361.aClass85_Sub1_1.aBoolean172 = !Static361.aClass85_Sub1_1.aBoolean172;
				Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
				Static419.aBoolean463 = false;
				Static44.method658();
				Static16.method251("ot=" + Static361.aClass85_Sub1_1.aBoolean172);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static361.aClass85_Sub1_1.aBoolean178 = !Static361.aClass85_Sub1_1.aBoolean178;
				Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
				Static419.aBoolean463 = false;
				Static44.method658();
				Static16.method251("gb=" + Static361.aClass85_Sub1_1.aBoolean178);
				return;
			}
			@Pc(559) int local559;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static16.method251("Invalid shadows value");
					return;
				}
				@Pc(549) String local549 = arg0.substring(8);
				local559 = Static223.method3363(local549) ? Static335.method4519(local549) : -1;
				if (local559 >= 0 && local559 <= 2) {
					Static361.aClass85_Sub1_1.method2107(Static423.anInt7114, local559);
					Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
					Static419.aBoolean463 = false;
					Static44.method658();
					Static16.method251("shadows=" + local559);
					return;
				}
				Static16.method251("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static361.aClass85_Sub1_1.aBoolean167 = !Static361.aClass85_Sub1_1.aBoolean167;
				Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
				Static419.aBoolean463 = false;
				Static33.method5356();
				Static44.method658();
				Static16.method251("textures=" + Static361.aClass85_Sub1_1.aBoolean167);
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static16.method251("Invalid buildarea value");
					return;
				}
				local104 = Static335.method4519(arg0.substring(6));
				if (local104 >= 0 && Static304.method4242(Static108.anInt2167) >= local104) {
					Static361.aClass85_Sub1_1.anInt2488 = local104;
					Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
					Static419.aBoolean463 = false;
					Static16.method251("maxbuildarea=" + Static361.aClass85_Sub1_1.anInt2488);
					return;
				}
				Static16.method251("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static16.method251("Invalid particles value");
					return;
				}
				Static126.method2213(Static335.method4519(arg0.substring(13)));
				Static361.aClass85_Sub1_1.method2117(Static171.aClass159_1);
				Static419.aBoolean463 = false;
				Static16.method251("particles=" + Static201.method3169());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static16.method251("Invalid rect_debug value");
					return;
				}
				Static334.anInt5662 = Static335.method4519(arg0.substring(10).trim());
				Static16.method251("rect_debug=" + Static334.anInt5662);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static372.aBoolean418 = true;
				Static16.method251("qa_op_test=" + Static372.aBoolean418);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static76.aBoolean109 = !Static76.aBoolean109;
				Static16.method251("clipcomponents=" + Static76.aBoolean109);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(797) boolean local797 = Static412.aClass50_8.method5882();
				if (Static407.method5369(!local797)) {
					if (local797) {
						Static16.method251("Bloom disabled");
						return;
					}
					Static16.method251("Bloom enabled");
					return;
				}
				Static16.method251("Failed to enable bloom");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (Static102.aBoolean131) {
					Static102.aBoolean131 = false;
					Static16.method251("Forced tweening disabled.");
					return;
				}
				Static102.aBoolean131 = true;
				Static16.method251("Forced tweening ENABLED!");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static106.aBoolean134) {
					Static16.method251("Shift-click disabled.");
					Static106.aBoolean134 = false;
					return;
				}
				Static16.method251("Shift-click ENABLED!");
				Static106.aBoolean134 = true;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static16.method251("x:" + (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 >> 7) + " z:" + (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static16.method251("Height: " + Static332.aClass154Array3[Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98].ua(Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 >> 7, Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static21.aClass187_8.method4298();
				Static21.aClass187_8.method4285();
				Static228.aClass2_4.method9();
				Static300.aClass88_3.method2269();
				Static341.method4585();
				Static16.method251("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static412.aClass50_8.method5876()) {
					Static16.method251("Current toolkit doesn't support multiple cores");
					return;
				}
				local104 = Integer.parseInt(arg0.substring(3));
				if (local104 < 1) {
					local104 = 1;
				} else if (local104 > 4) {
					local104 = 4;
				}
				Static29.anInt497 = local104;
				Static412.aClass50_8.method5817(Static29.anInt497);
				Static412.aClass50_8.method5832(0);
				Static16.method251("Render cores now: " + Static29.anInt497);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static16.method251("I(s): " + Static106.aClass267_17.method6006() + "/" + Static106.aClass267_17.method6017());
				Static16.method251("I(m): " + Static328.aClass267_81.method6006() + "/" + Static328.aClass267_81.method6017());
				Static16.method251("O(s): " + Static313.aClass272_2.aClass232_1.method5167() + "/" + Static313.aClass272_2.aClass232_1.method5164());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static16.method251("Pos: " + Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 + "," + (Static168.anInt3353 + (Static80.anInt1679 >> 7) >> 6) + "," + ((Static50.anInt906 >> 7) + Static72.anInt1488 >> 6) + "," + (Static168.anInt3353 + (Static80.anInt1679 >> 7) & 0x3F) + "," + ((Static50.anInt906 >> 7) + Static72.anInt1488 & 0x3F) + " Height: " + (Static326.method4459(Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98, Static80.anInt1679, Static50.anInt906) - Static8.anInt121));
				Static16.method251("Look: " + Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98 + "," + (Static55.anInt1001 + Static168.anInt3353 >> 6) + "," + (Static284.anInt4989 + Static72.anInt1488 >> 6) + "," + (Static55.anInt1001 + Static168.anInt3353 & 0x3F) + "," + (Static72.anInt1488 + Static284.anInt4989 & 0x3F) + " Height: " + (Static326.method4459(Static263.aClass24_Sub3_Sub2_Sub2_4.aByte98, Static55.anInt1001, Static284.anInt4989) - Static448.anInt6973));
				return;
			}
			if (arg0.equals("showocc")) {
				Static261.aBoolean314 = !Static261.aBoolean314;
				Static44.method658();
				Static16.method251("showocc=" + Static261.aBoolean314);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static342.aBoolean374 = !Static342.aBoolean374;
				Static44.method658();
				Static16.method251("forcewallocc=" + Static342.aBoolean374);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static389.aBoolean437 = !Static389.aBoolean437;
				Static412.aClass50_8.method5868(Static389.aBoolean437);
				Static230.method3437();
				Static16.method251("showprofiling=" + Static389.aBoolean437);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static16.method251("Java toolkit: " + Static449.method5990(Static171.aClass159_1));
				Static16.method251("GL toolkit:   " + Static449.method5990(Static171.aClass159_1));
				Static16.method251("SSE toolkit:  " + Static449.method5990(Static171.aClass159_1));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static182.aBoolean240 = !Static182.aBoolean240;
				Static16.method251("nonpcs=" + Static182.aBoolean240);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static90.method1691();
				Static16.method251("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local104 = Integer.parseInt(arg0.substring(12));
				Static456.method6048(Static29.method430(local104).aString49, local104);
				Static16.method251("switched");
				return;
			}
			if (arg0.equals("getworld")) {
				Static16.method251("w: " + Static87.aClass21_2.anInt407);
				return;
			}
			if (arg0.startsWith("pc")) {
				Static310.method4308(Static218.aClass27_68);
				Static337.aClass10_Sub8_Sub2_2.method2458(0);
				local104 = Static337.aClass10_Sub8_Sub2_2.anInt2989;
				local559 = arg0.indexOf(" ", 4);
				Static337.aClass10_Sub8_Sub2_2.method2465(arg0.substring(3, local559));
				Static402.method5294(Static337.aClass10_Sub8_Sub2_2, arg0.substring(local559));
				Static337.aClass10_Sub8_Sub2_2.method2472(Static337.aClass10_Sub8_Sub2_2.anInt2989 - local104);
				return;
			}
			if (arg0.equals("heap")) {
				Static16.method251("Heap: " + Static108.anInt2167 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static353.method4776();
				Static16.method251("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local104 = 0; local104 < Static136.anIntArray282.length; local104++) {
					if (Static156.aBooleanArray7[local104]) {
						Static136.anIntArray282[local104] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static136.anIntArray282[local104] *= -1;
						}
					}
				}
				Static353.method4776();
				Static16.method251("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static66.aBoolean75 = true;
				Static341.method4585();
				Static16.method251("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static66.aBoolean75 = false;
				Static341.method4585();
				Static16.method251("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static365.method2561();
				Static16.method251("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static16.method251(Static401.method5905() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local104 = Integer.parseInt(arg0.substring(9));
				if (local104 >= 0 && local104 <= 4) {
					Static361.aClass85_Sub1_1.anInt2494 = local104;
				}
				Static16.method251("cpuusage=" + Static361.aClass85_Sub1_1.anInt2494);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local104 = Integer.parseInt(arg0.substring(17));
				Static16.method251("varpbit=" + Static329.aClass201_9.method4477(local104));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local104 = Integer.parseInt(arg0.substring(14));
				Static16.method251("varp=" + Static329.aClass201_9.method4478(local104));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static239.method3396(0, false);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static239.method3396(0, true);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1615) String[] local1615 = Static253.method3686(' ', arg0.substring(12));
				if (local1615.length >= 2) {
					local559 = local1615.length > 2 ? Integer.parseInt(local1615[2]) : 0;
					Static102.method1791(local1615[0], local1615[1], local559);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static79.method1507();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static79.method1512();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static79.method1512();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local104 = Integer.parseInt(arg0.substring(8));
				Static412.aClass50_8.method5842(local104);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static16.method251("Active streams: " + Static461.aClass10_Sub7_Sub2_5.method1839());
				return;
			}
			if (Static358.anInt6086 == 9) {
				Static310.method4308(Static56.aClass27_24);
				Static337.aClass10_Sub8_Sub2_2.method2458(arg0.length() + 3);
				Static337.aClass10_Sub8_Sub2_2.method2458(arg1 ? 1 : 0);
				Static337.aClass10_Sub8_Sub2_2.method2458(arg2 ? 1 : 0);
				Static337.aClass10_Sub8_Sub2_2.method2465(arg0);
			}
			if (arg0.startsWith("fps ") && Static110.aClass151_5 != Static284.aClass151_8) {
				Static280.method3965(Static335.method4519(arg0.substring(4)));
				return;
			}
			if (Static358.anInt6086 != 9) {
				Static16.method251("Unrecogonised commmand when not logged in: " + arg0);
			}
		} catch (@Pc(1762) Exception local1762) {
			Static16.method251("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIII)V")
	public static void method1395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static290.anIntArrayArray46 != null) {
			Static290.anIntArrayArray46[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static452.aShortArrayArray4 != null) {
			Static452.aShortArrayArray4[arg0][arg1] = (short) arg3;
		}
		if (Static120.aByteArrayArray20 != null) {
			Static120.aByteArrayArray20[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BD)V")
	public static void method1396(@OriginalArg(1) double arg0) {
		if (Static304.aDouble1 == arg0) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static47.anIntArray70[local15] = local27 > 255 ? 255 : local27;
		}
		Static304.aDouble1 = arg0;
	}
}
