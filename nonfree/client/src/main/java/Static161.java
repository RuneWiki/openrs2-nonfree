import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!hq", name = "Z", descriptor = "I")
	public static int anInt3447 = 0;

	@OriginalMember(owner = "client!hq", name = "ab", descriptor = "I")
	public static int anInt3448 = 0;

	@OriginalMember(owner = "client!hq", name = "cb", descriptor = "Z")
	public static boolean aBoolean265 = false;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZIZIIZ)V")
	public static void method2807(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 <= arg2) {
			return;
		}
		@Pc(12) int local12 = (arg4 + arg2) / 2;
		@Pc(14) int local14 = arg2;
		@Pc(18) Class145_Sub1 local18 = Static279.aClass145_Sub1Array9[local12];
		Static279.aClass145_Sub1Array9[local12] = Static279.aClass145_Sub1Array9[arg4];
		Static279.aClass145_Sub1Array9[arg4] = local18;
		for (@Pc(30) int local30 = arg2; local30 < arg4; local30++) {
			if (Static128.method2225(local18, arg0, arg5, arg1, Static279.aClass145_Sub1Array9[local30], arg3) <= 0) {
				@Pc(49) Class145_Sub1 local49 = Static279.aClass145_Sub1Array9[local30];
				Static279.aClass145_Sub1Array9[local30] = Static279.aClass145_Sub1Array9[local14];
				Static279.aClass145_Sub1Array9[local14++] = local49;
			}
		}
		Static279.aClass145_Sub1Array9[arg4] = Static279.aClass145_Sub1Array9[local14];
		Static279.aClass145_Sub1Array9[local14] = local18;
		method2807(arg0, arg1, arg2, arg3, local14 - 1, arg5);
		method2807(arg0, arg1, local14 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method2808(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static411.aClass238_7 == Static356.aClass238_6 && Static199.anInt3933 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static156.aBoolean259 = true;
				Static438.method5862("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static156.aBoolean259 = false;
				Static438.method5862("fps debug disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static296.anInt5416 = 0;
				Static120.anInt2614 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static56.aClass40_1.method1194();
				Static438.method5862("Text coords cleared");
				return;
			}
			@Pc(72) int local72;
			@Pc(91) int local91;
			@Pc(82) Runtime local82;
			if (arg1.equalsIgnoreCase("gc")) {
				Static47.method1012();
				for (local72 = 0; local72 < 10; local72++) {
					System.gc();
				}
				local82 = Runtime.getRuntime();
				local91 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static438.method5862("mem=" + local91 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static47.method1012();
				for (local72 = 0; local72 < 10; local72++) {
					System.gc();
				}
				local82 = Runtime.getRuntime();
				local91 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static438.method5862("Memory before cleanup=" + local91 + "k");
				Static265.method3994();
				Static47.method1012();
				for (@Pc(145) int local145 = 0; local145 < 10; local145++) {
					System.gc();
				}
				local91 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static438.method5862("Memory after cleanup=" + local91 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static438.method5862("Number of player models in cache:" + Static125.method777());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static438.method5862("Dropped client connection");
				if (Static142.anInt3209 == 30) {
					Static237.method3708();
					return;
				}
				if (Static142.anInt3209 == 25) {
					Static206.aBoolean328 = true;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static215.aClass183_2.method4500();
				Static438.method5862("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static215.aClass183_2.method4499();
				Static438.method5862("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static295.aClass103_5.method2835();
				Static122.aClass27_1.method897();
				Static215.aClass183_2.method4495();
				Static438.method5862("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static152.method2703();
				Static338.method1145();
				Static438.method5862("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static383.method5254(-1, 1, false, -1);
				if (Static38.method898() != 1) {
					Static438.method5862("wm1 failed");
					return;
				}
				Static438.method5862("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static383.method5254(-1, 2, false, -1);
				if (Static38.method898() != 2) {
					Static438.method5862("wm2 failed");
					return;
				}
				Static438.method5862("wm2 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static383.method5254(1024, 3, false, 768);
				if (Static38.method898() != 3) {
					Static438.method5862("wm3 failed");
					return;
				}
				Static438.method5862("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static69.method1302(0);
				if (Static347.anInt6318 == 0) {
					Static438.method5862("Entered tk0");
					Static123.aClass21_Sub1_1.anInt867 = 0;
					Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
					Static103.aBoolean182 = false;
					return;
				}
				Static438.method5862("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static69.method1302(1);
				if (Static347.anInt6318 == 1) {
					Static438.method5862("Entered tk1");
					Static123.aClass21_Sub1_1.anInt867 = 1;
					Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
					Static103.aBoolean182 = false;
					return;
				}
				Static438.method5862("Failed to enter tk1");
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static69.method1302(2);
				if (Static347.anInt6318 != 2) {
					Static438.method5862("Failed to enter tk2");
					return;
				}
				Static438.method5862("Entered tk2");
				Static123.aClass21_Sub1_1.anInt867 = 2;
				Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
				Static103.aBoolean182 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static69.method1302(3);
				if (Static347.anInt6318 != 3) {
					Static438.method5862("Failed to enter tk3");
					return;
				}
				Static438.method5862("Entered tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static123.aClass21_Sub1_1.aBoolean66 = !Static123.aClass21_Sub1_1.aBoolean66;
				Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
				Static103.aBoolean182 = false;
				Static152.method2703();
				Static438.method5862("ot=" + Static123.aClass21_Sub1_1.aBoolean66);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static123.aClass21_Sub1_1.aBoolean80 = !Static123.aClass21_Sub1_1.aBoolean80;
				Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
				Static103.aBoolean182 = false;
				Static152.method2703();
				Static438.method5862("gb=" + Static123.aClass21_Sub1_1.aBoolean80);
				return;
			}
			@Pc(519) int local519;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static438.method5862("Invalid shadows value");
					return;
				}
				@Pc(509) String local509 = arg1.substring(8);
				local519 = Static179.method3046(local509) ? Static110.method1873(local509) : -1;
				if (local519 >= 0 && local519 <= 2) {
					Static123.aClass21_Sub1_1.method778(Static347.anInt6318, local519);
					Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
					Static103.aBoolean182 = false;
					Static152.method2703();
					Static438.method5862("shadows=" + local519);
					return;
				}
				Static438.method5862("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static123.aClass21_Sub1_1.aBoolean67 = !Static123.aClass21_Sub1_1.aBoolean67;
				Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
				Static103.aBoolean182 = false;
				Static337.method4900();
				Static152.method2703();
				Static438.method5862("textures=" + Static123.aClass21_Sub1_1.aBoolean67);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static438.method5862("Invalid buildarea value");
					return;
				}
				local72 = Static110.method1873(arg1.substring(6));
				if (local72 >= 0 && local72 <= Static140.method2523(Static102.anInt619)) {
					Static123.aClass21_Sub1_1.anInt866 = local72;
					Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
					Static103.aBoolean182 = false;
					Static438.method5862("maxbuildarea=" + Static123.aClass21_Sub1_1.anInt866);
					return;
				}
				Static438.method5862("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static438.method5862("Invalid particles value");
					return;
				}
				Static26.method712(Static110.method1873(arg1.substring(13)));
				Static123.aClass21_Sub1_1.method782(Static295.aClass103_5);
				Static103.aBoolean182 = false;
				Static438.method5862("particles=" + Static438.method5860());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static438.method5862("Invalid rect_debug value");
					return;
				}
				Static57.anInt1412 = Static110.method1873(arg1.substring(10).trim());
				Static438.method5862("rect_debug=" + Static57.anInt1412);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static176.aBoolean278 = true;
				Static438.method5862("qa_op_test=" + Static176.aBoolean278);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static112.aBoolean439 = !Static112.aBoolean439;
				Static438.method5862("clipcomponents=" + Static112.aBoolean439);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(750) boolean local750 = Static266.aClass75_7.method2609();
				if (Static115.method2112(!local750)) {
					if (local750) {
						Static438.method5862("Bloom disabled");
						return;
					}
					Static438.method5862("Bloom enabled");
					return;
				}
				Static438.method5862("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static426.aBoolean504) {
					Static426.aBoolean504 = true;
					Static438.method5862("Forced tweening ENABLED!");
					return;
				}
				Static426.aBoolean504 = false;
				Static438.method5862("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static93.aBoolean163) {
					Static438.method5862("Shift-click ENABLED!");
					Static93.aBoolean163 = true;
					return;
				}
				Static438.method5862("Shift-click disabled.");
				Static93.aBoolean163 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static438.method5862("x:" + (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 >> 7) + " z:" + (Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static438.method5862("Height: " + Static120.aClass64Array1[Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77].I(Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6053 >> 7, Static113.aClass1_Sub3_Sub3_Sub1_4.anInt6055 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static20.aClass56_10.method1375();
				Static20.aClass56_10.method1390();
				Static404.aClass123_3.method3179();
				Static408.aClass61_3.method1424();
				Static338.method1145();
				Static438.method5862("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static266.aClass75_7.method2623()) {
					Static438.method5862("Current toolkit doesn't support multiple cores");
					return;
				}
				local72 = Integer.parseInt(arg1.substring(3));
				if (local72 < 1) {
					local72 = 1;
				} else if (local72 > 4) {
					local72 = 4;
				}
				Static180.anInt3696 = local72;
				Static266.aClass75_7.method2634(Static180.anInt3696);
				Static266.aClass75_7.method2606(0);
				Static438.method5862("Render cores now: " + Static180.anInt3696);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static438.method5862("I(s): " + Static191.aClass5_33.method111() + "/" + Static191.aClass5_33.method105());
				Static438.method5862("I(m): " + Static229.aClass5_36.method111() + "/" + Static229.aClass5_36.method105());
				Static438.method5862("O(s): " + Static89.aClass157_1.aClass231_1.method5356() + "/" + Static89.aClass157_1.aClass231_1.method5351());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static438.method5862("Pos: " + Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 + "," + ((Static398.anInt6901 >> 7) + Static108.anInt3458 >> 6) + "," + ((Static80.anInt1722 >> 7) + Static339.anInt6223 >> 6) + "," + (Static108.anInt3458 + (Static398.anInt6901 >> 7) & 0x3F) + "," + ((Static80.anInt1722 >> 7) + Static339.anInt6223 & 0x3F) + " Height: " + (Static124.method2209(Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77, Static398.anInt6901, Static80.anInt1722) - Static422.anInt7281));
				Static438.method5862("Look: " + Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77 + "," + (Static108.anInt3458 + Static400.anInt6966 >> 6) + "," + (Static339.anInt6223 + Static283.anInt5199 >> 6) + "," + (Static108.anInt3458 + Static400.anInt6966 & 0x3F) + "," + (Static283.anInt5199 + Static339.anInt6223 & 0x3F) + " Height: " + (Static124.method2209(Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77, Static400.anInt6966, Static283.anInt5199) - Static319.anInt5771));
				return;
			}
			if (arg1.equals("showocc")) {
				Static10.aBoolean16 = !Static10.aBoolean16;
				Static152.method2703();
				Static438.method5862("showocc=" + Static10.aBoolean16);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static163.aBoolean271 = !Static163.aBoolean271;
				Static152.method2703();
				Static438.method5862("forcewallocc=" + Static163.aBoolean271);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static267.aBoolean371 = !Static267.aBoolean371;
				Static266.aClass75_7.method2586(Static267.aBoolean371);
				Static393.method5307();
				Static438.method5862("showprofiling=" + Static267.aBoolean371);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static438.method5862("Java toolkit: " + Static420.method5625(Static295.aClass103_5));
				Static438.method5862("GL toolkit:   " + Static420.method5625(Static295.aClass103_5));
				Static438.method5862("SSE toolkit:  " + Static420.method5625(Static295.aClass103_5));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static180.aBoolean288 = !Static180.aBoolean288;
				Static438.method5862("nonpcs=" + Static180.aBoolean288);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static146.method2661();
				Static438.method5862("auto world selected");
				return;
			}
			if (arg1.startsWith("pc")) {
				Static414.method5552(Static7.aClass92_7);
				Static302.aClass3_Sub2_Sub2_2.method6001(0);
				local72 = Static302.aClass3_Sub2_Sub2_2.anInt7620;
				local519 = arg1.indexOf(" ", 4);
				Static302.aClass3_Sub2_Sub2_2.method6033(arg1.substring(3, local519));
				Static305.method4505(arg1.substring(local519), Static302.aClass3_Sub2_Sub2_2);
				Static302.aClass3_Sub2_Sub2_2.method5993(Static302.aClass3_Sub2_Sub2_2.anInt7620 - local72);
				return;
			}
			if (arg1.equals("heap")) {
				Static438.method5862("Heap: " + Static102.anInt619 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static364.method5135();
				Static438.method5862("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local72 = 0; local72 < Static436.anIntArray560.length; local72++) {
					if (Static372.aBooleanArray9[local72]) {
						Static436.anIntArray560[local72] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static436.anIntArray560[local72] *= -1;
						}
					}
				}
				Static364.method5135();
				Static438.method5862("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static2.aBoolean4 = true;
				Static338.method1145();
				Static438.method5862("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static2.aBoolean4 = false;
				Static338.method1145();
				Static438.method5862("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static245.method3782();
				Static438.method5862("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static438.method5862(Static19.method565() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local72 = Integer.parseInt(arg1.substring(9));
				if (local72 >= 0 && local72 <= 4) {
					Static123.aClass21_Sub1_1.anInt881 = local72;
				}
				Static438.method5862("cpuusage=" + Static123.aClass21_Sub1_1.anInt881);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local72 = Integer.parseInt(arg1.substring(17));
				Static438.method5862("varpbit=" + Static369.aClass11_1.method455(local72));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local72 = Integer.parseInt(arg1.substring(14));
				Static438.method5862("varp=" + Static369.aClass11_1.method456(local72));
				return;
			}
			if (arg1.startsWith("csprofileclear")) {
				Static272.method4047();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static272.method4039();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static272.method4039();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local72 = Integer.parseInt(arg1.substring(8));
				Static266.aClass75_7.method2569(local72);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static438.method5862("Active streams: " + Static251.aClass3_Sub5_Sub4_1.method5192());
				return;
			}
			if (Static142.anInt3209 == 30) {
				Static414.method5552(Static278.aClass92_228);
				Static302.aClass3_Sub2_Sub2_2.method6001(arg1.length() + 2);
				Static302.aClass3_Sub2_Sub2_2.method6001(arg0 ? 1 : 0);
				Static302.aClass3_Sub2_Sub2_2.method6033(arg1);
			}
			if (arg1.startsWith("fps ") && Static411.aClass238_7 != Static356.aClass238_6) {
				Static309.method4537(Static110.method1873(arg1.substring(4)));
				return;
			}
			if (Static142.anInt3209 != 30) {
				Static438.method5862("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1597) Exception local1597) {
			Static438.method5862("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "(I)V")
	public static void method2809() {
		Static69.method1297();
		Static158.aClass7_2 = null;
		Static392.aClass7_3 = null;
		Static115.aClass75_3 = null;
		Static125.aClass14ArrayArray2 = null;
		Static399.aClass7_4 = null;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIB)I")
	public static int method2810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(20) int local20 = 65536 - Applet_Sub1.anIntArray87[arg1 * 8192 / arg3] >> 1;
		return (arg0 * (65536 - local20) >> 16) + (arg2 * local20 >> 16);
	}
}
