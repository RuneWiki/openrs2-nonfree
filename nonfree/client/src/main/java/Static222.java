import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
	public static int anInt4450 = 0;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/lang/String;ZZ)V")
	public static void method3822(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		if (Static42.aClass219_1 == Static297.aClass219_2 && Static70.anInt1720 < 2) {
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
				Static244.aBoolean318 = true;
				Static328.method4873("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static244.aBoolean318 = false;
				Static328.method4873("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static328.method4873("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(77) Throwable local77) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static15.anInt304 = 0;
				Static210.anInt4285 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static412.aClass273_5.method6243();
				Static328.method4873("Text coords cleared");
				return;
			}
			@Pc(126) int local126;
			@Pc(106) int local106;
			@Pc(117) Runtime local117;
			if (arg0.equalsIgnoreCase("gc")) {
				Static116.method2235();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local117 = Runtime.getRuntime();
				local126 = (int) ((local117.totalMemory() - local117.freeMemory()) / 1024L);
				Static328.method4873("mem=" + local126 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static116.method2235();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local117 = Runtime.getRuntime();
				local126 = (int) ((local117.totalMemory() - local117.freeMemory()) / 1024L);
				Static328.method4873("Memory before cleanup=" + local126 + "k");
				Static304.method4690();
				Static116.method2235();
				for (@Pc(188) int local188 = 0; local188 < 10; local188++) {
					System.gc();
				}
				local126 = (int) ((local117.totalMemory() - local117.freeMemory()) / 1024L);
				Static328.method4873("Memory after cleanup=" + local126 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static328.method4873("Number of player models in cache:" + Static290.method4479());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static328.method4873("Dropped client connection");
				if (Static70.anInt1726 == 9) {
					Static124.method2333();
				} else if (Static70.anInt1726 == 10) {
					Static82.aBoolean140 = true;
					return;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static236.aClass184_2.method4442();
				Static328.method4873("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static236.aClass184_2.method4435();
				Static328.method4873("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static390.aClass255_5.method5834();
				Static172.aClass13_1.method173();
				Static236.aClass184_2.method4441();
				Static328.method4873("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static461.method4588();
				Static391.method5497();
				Static328.method4873("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static77.method1652(-1, -1, 1, false);
				if (Static331.method4891() == 1) {
					Static328.method4873("wm1 succeeded");
					return;
				}
				Static328.method4873("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static77.method1652(-1, -1, 2, false);
				if (Static331.method4891() == 2) {
					Static328.method4873("wm2 succeeded");
					return;
				}
				Static328.method4873("wm2 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static77.method1652(1024, 768, 3, false);
				if (Static331.method4891() != 3) {
					Static328.method4873("wm3 failed");
					return;
				}
				Static328.method4873("wm3 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static391.method5496(0);
				if (Static192.anInt3828 == 0) {
					Static328.method4873("Entered tk0");
					Static157.aClass185_Sub1_1.anInt5557 = 0;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					return;
				}
				Static328.method4873("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static391.method5496(1);
				if (Static192.anInt3828 != 1) {
					Static328.method4873("Failed to enter tk1");
					return;
				}
				Static328.method4873("Entered tk1");
				Static157.aClass185_Sub1_1.anInt5557 = 1;
				Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
				Static316.aBoolean426 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static391.method5496(2);
				if (Static192.anInt3828 != 2) {
					Static328.method4873("Failed to enter tk2");
					return;
				}
				Static328.method4873("Entered tk2");
				Static157.aClass185_Sub1_1.anInt5557 = 2;
				Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
				Static316.aBoolean426 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static391.method5496(3);
				if (Static192.anInt3828 != 3) {
					Static328.method4873("Failed to enter tk3");
					return;
				}
				Static328.method4873("Entered tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static157.aClass185_Sub1_1.aBoolean404 = !Static157.aClass185_Sub1_1.aBoolean404;
				Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
				Static316.aBoolean426 = false;
				Static461.method4588();
				Static328.method4873("ot=" + Static157.aClass185_Sub1_1.aBoolean404);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static157.aClass185_Sub1_1.aBoolean407 = !Static157.aClass185_Sub1_1.aBoolean407;
				Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
				Static316.aBoolean426 = false;
				Static461.method4588();
				Static328.method4873("gb=" + Static157.aClass185_Sub1_1.aBoolean407);
				return;
			}
			@Pc(587) int local587;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static328.method4873("Invalid shadows value");
					return;
				}
				@Pc(577) String local577 = arg0.substring(8);
				local587 = Static9.method159(local577) ? Static269.method4335(local577) : -1;
				if (local587 >= 0 && local587 <= 2) {
					Static157.aClass185_Sub1_1.method4629(local587, Static192.anInt3828);
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					Static461.method4588();
					Static328.method4873("shadows=" + local587);
					return;
				}
				Static328.method4873("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static157.aClass185_Sub1_1.aBoolean405 = !Static157.aClass185_Sub1_1.aBoolean405;
				Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
				Static316.aBoolean426 = false;
				Static136.method2531();
				Static461.method4588();
				Static328.method4873("textures=" + Static157.aClass185_Sub1_1.aBoolean405);
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static328.method4873("Invalid buildarea value");
					return;
				}
				local106 = Static269.method4335(arg0.substring(6));
				if (local106 >= 0 && local106 <= Static109.method2170(Static263.anInt5007)) {
					Static157.aClass185_Sub1_1.anInt5564 = local106;
					Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
					Static316.aBoolean426 = false;
					Static328.method4873("maxbuildarea=" + Static157.aClass185_Sub1_1.anInt5564);
					return;
				}
				Static328.method4873("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static328.method4873("Invalid particles value");
					return;
				}
				Static49.method1089(Static269.method4335(arg0.substring(13)));
				Static157.aClass185_Sub1_1.method4635(Static390.aClass255_5);
				Static316.aBoolean426 = false;
				Static328.method4873("particles=" + Static72.method1584());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static328.method4873("Invalid rect_debug value");
					return;
				}
				Static265.anInt5027 = Static269.method4335(arg0.substring(10).trim());
				Static328.method4873("rect_debug=" + Static265.anInt5027);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static341.aBoolean453 = true;
				Static328.method4873("qa_op_test=" + Static341.aBoolean453);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static18.aBoolean18 = !Static18.aBoolean18;
				Static328.method4873("clipcomponents=" + Static18.aBoolean18);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(835) boolean local835 = Static30.aClass30_3.method2040();
				if (!Static80.method1689(!local835)) {
					Static328.method4873("Failed to enable bloom");
					return;
				}
				if (!local835) {
					Static328.method4873("Bloom enabled");
					return;
				}
				Static328.method4873("Bloom disabled");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static198.aBoolean245) {
					Static198.aBoolean245 = true;
					Static328.method4873("Forced tweening ENABLED!");
					return;
				}
				Static198.aBoolean245 = false;
				Static328.method4873("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (!Static341.aBoolean452) {
					Static328.method4873("Shift-click ENABLED!");
					Static341.aBoolean452 = true;
					return;
				}
				Static328.method4873("Shift-click disabled.");
				Static341.aBoolean452 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static328.method4873("x:" + (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 >> 7) + " z:" + (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static328.method4873("Height: " + Static389.aClass14Array3[Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100].oa(Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 >> 7, Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static143.aClass38_30.method1046();
				Static143.aClass38_30.method1036();
				Static261.aClass8_4.method65();
				Static62.aClass116_1.method3299();
				Static391.method5497();
				Static328.method4873("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static30.aClass30_3.method2070()) {
					Static328.method4873("Current toolkit doesn't support multiple cores");
					return;
				}
				local106 = Integer.parseInt(arg0.substring(3));
				if (local106 < 1) {
					local106 = 1;
				} else if (local106 > 4) {
					local106 = 4;
				}
				Static271.anInt5145 = local106;
				Static30.aClass30_3.method2099(Static271.anInt5145);
				Static30.aClass30_3.method2049(0);
				Static328.method4873("Render cores now: " + Static271.anInt5145);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static328.method4873("I(s): " + Static342.aClass83_44.method2348() + "/" + Static342.aClass83_44.method2343());
				Static328.method4873("I(m): " + Static296.aClass83_53.method2348() + "/" + Static296.aClass83_53.method2343());
				Static328.method4873("O(s): " + Static139.aClass193_1.aClass100_1.method2878() + "/" + Static139.aClass193_1.aClass100_1.method2877());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static328.method4873("Pos: " + Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 + "," + (Static426.anInt7325 + (Static235.anInt4645 >> 7) >> 6) + "," + (Static72.anInt1776 + (Static108.anInt2350 >> 7) >> 6) + "," + ((Static235.anInt4645 >> 7) + Static426.anInt7325 & 0x3F) + "," + ((Static108.anInt2350 >> 7) + Static72.anInt1776 & 0x3F) + " Height: " + (Static21.method356(Static235.anInt4645, Static108.anInt2350, Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100) - Static405.anInt7103));
				Static328.method4873("Look: " + Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100 + "," + (Static242.anInt4727 + Static426.anInt7325 >> 6) + "," + (Static285.anInt5311 + Static72.anInt1776 >> 6) + "," + (Static426.anInt7325 + Static242.anInt4727 & 0x3F) + "," + (Static72.anInt1776 + Static285.anInt5311 & 0x3F) + " Height: " + (Static21.method356(Static242.anInt4727, Static285.anInt5311, Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100) - Static136.anInt2817));
				return;
			}
			if (arg0.equals("showocc")) {
				Static358.aBoolean465 = !Static358.aBoolean465;
				Static461.method4588();
				Static328.method4873("showocc=" + Static358.aBoolean465);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static336.aBoolean448 = !Static336.aBoolean448;
				Static461.method4588();
				Static328.method4873("forcewallocc=" + Static336.aBoolean448);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static32.aBoolean28 = !Static32.aBoolean28;
				Static30.aClass30_3.method2056(Static32.aBoolean28);
				Static204.method3632();
				Static328.method4873("showprofiling=" + Static32.aBoolean28);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static328.method4873("Java toolkit: " + Static133.method2461(Static390.aClass255_5));
				Static328.method4873("GL toolkit:   " + Static133.method2461(Static390.aClass255_5));
				Static328.method4873("SSE toolkit:  " + Static133.method2461(Static390.aClass255_5));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static54.aBoolean90 = !Static54.aBoolean90;
				Static328.method4873("nonpcs=" + Static54.aBoolean90);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static34.method496();
				Static328.method4873("auto world selected");
				return;
			}
			if (arg0.startsWith("switchworld")) {
				local106 = Integer.parseInt(arg0.substring(12));
				Static37.method743(Static7.method72(local106).aString79, local106);
				Static328.method4873("switched");
				return;
			}
			if (arg0.equals("getworld")) {
				Static328.method4873("w: " + Static302.aClass9_6.anInt84);
				return;
			}
			if (arg0.startsWith("pc")) {
				Static448.method6134(Static270.aClass212_80);
				Static457.aClass4_Sub20_Sub1_5.method4590(0);
				local106 = Static457.aClass4_Sub20_Sub1_5.anInt5526;
				local587 = arg0.indexOf(" ", 4);
				Static457.aClass4_Sub20_Sub1_5.method4599(arg0.substring(3, local587));
				Static196.method6081(arg0.substring(local587), Static457.aClass4_Sub20_Sub1_5);
				Static457.aClass4_Sub20_Sub1_5.method4567(Static457.aClass4_Sub20_Sub1_5.anInt5526 - local106);
				return;
			}
			if (arg0.equals("heap")) {
				Static328.method4873("Heap: " + Static263.anInt5007 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static386.method6045();
				Static328.method4873("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local106 = 0; local106 < Static355.anIntArray503.length; local106++) {
					if (Static241.aBooleanArray89[local106]) {
						Static355.anIntArray503[local106] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static355.anIntArray503[local106] *= -1;
						}
					}
				}
				Static386.method6045();
				Static328.method4873("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static90.aBoolean457 = true;
				Static391.method5497();
				Static328.method4873("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static90.aBoolean457 = false;
				Static391.method5497();
				Static328.method4873("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static72.method1587();
				Static328.method4873("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static328.method4873(Static389.method5452() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local106 = Integer.parseInt(arg0.substring(9));
				if (local106 >= 0 && local106 <= 4) {
					Static157.aClass185_Sub1_1.anInt5562 = local106;
				}
				Static328.method4873("cpuusage=" + Static157.aClass185_Sub1_1.anInt5562);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local106 = Integer.parseInt(arg0.substring(17));
				Static328.method4873("varpbit=" + Static67.aClass224_1.method5154(local106));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local106 = Integer.parseInt(arg0.substring(14));
				Static328.method4873("varp=" + Static67.aClass224_1.method5153(local106));
				return;
			}
			if (arg0.startsWith("demologin")) {
				Static316.method4763(0, false);
				return;
			}
			if (arg0.startsWith("newdemologin")) {
				Static316.method4763(0, true);
				return;
			}
			if (arg0.startsWith("directlogin")) {
				@Pc(1671) String[] local1671 = Static399.method5642(arg0.substring(12), ' ');
				if (local1671.length >= 2) {
					local587 = local1671.length <= 2 ? 0 : Integer.parseInt(local1671[2]);
					Static142.method2610(local587, local1671[0], local1671[1]);
					return;
				}
			}
			if (arg0.startsWith("csprofileclear")) {
				Static64.method1464();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static64.method1461();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static64.method1461();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local106 = Integer.parseInt(arg0.substring(8));
				Static30.aClass30_3.method2030(local106);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static328.method4873("Active streams: " + Static132.aClass4_Sub7_Sub4_1.method5476());
				return;
			}
			if (arg0.equals("errormessage")) {
				Static328.method4873(Static179.aClient1.method1115());
				return;
			}
			if (Static70.anInt1726 == 9) {
				Static448.method6134(Static342.aClass212_81);
				Static457.aClass4_Sub20_Sub1_5.method4590(arg0.length() + 3);
				Static457.aClass4_Sub20_Sub1_5.method4590(arg1 ? 1 : 0);
				Static457.aClass4_Sub20_Sub1_5.method4590(arg2 ? 1 : 0);
				Static457.aClass4_Sub20_Sub1_5.method4599(arg0);
			}
			if (arg0.startsWith("fps ") && Static42.aClass219_1 != Static297.aClass219_2) {
				Static271.method4360(Static269.method4335(arg0.substring(4)));
				return;
			}
			if (Static70.anInt1726 != 9) {
				Static328.method4873("Unrecogonised commmand when not logged in: " + arg0);
			}
		} catch (@Pc(1830) Exception local1830) {
			Static328.method4873("Whoops, something went wrong.");
		}
	}
}
