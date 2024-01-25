import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	public static int anInt5113;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "Lclient!us;")
	public static Class234 aClass234_104 = null;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!us;")
	public static final Class234 aClass234_105 = new Class234(34, 7);

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	public static int anInt5111 = 0;

	@OriginalMember(owner = "client!re", name = "C", descriptor = "I")
	public static int anInt5115 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Lclient!vg;")
	public static Class28_Sub5 method4569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class48 local7 = Static69.aClass48ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class28_Sub5 local14 = local7.aClass28_Sub5_1;
			local7.aClass28_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method4571(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static238.aClass171_4 == Static291.aClass171_5 && Static315.anInt5429 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static383.aBoolean500 = true;
				Static171.method2654("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static383.aBoolean500 = false;
				Static171.method2654("fps debug disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static319.anInt5444 = 0;
				Static125.anInt2385 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static11.aClass22_8.method289();
				Static171.method2654("Text coords cleared");
				return;
			}
			@Pc(73) int local73;
			@Pc(91) int local91;
			@Pc(82) Runtime local82;
			if (arg1.equalsIgnoreCase("gc")) {
				Static72.method1213();
				for (local73 = 0; local73 < 10; local73++) {
					System.gc();
				}
				local82 = Runtime.getRuntime();
				local91 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static171.method2654("mem=" + local91 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static72.method1213();
				for (local73 = 0; local73 < 10; local73++) {
					System.gc();
				}
				local82 = Runtime.getRuntime();
				local91 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static171.method2654("Memory before cleanup=" + local91 + "k");
				Static19.method219();
				Static72.method1213();
				for (@Pc(147) int local147 = 0; local147 < 10; local147++) {
					System.gc();
				}
				local91 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
				Static171.method2654("Memory after cleanup=" + local91 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static171.method2654("Number of player models in cache:" + Static52.method944());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static171.method2654("Dropped client connection");
				if (Static348.anInt4439 == 30) {
					Static244.method3987();
				} else if (Static348.anInt4439 == 25) {
					Static227.aBoolean319 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static328.aClass11_3.method170();
				Static171.method2654("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static328.aClass11_3.method164();
				Static171.method2654("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static61.aClass156_1.method3664();
				Static12.aClass145_2.method3140();
				Static328.aClass11_3.method167();
				Static171.method2654("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static151.method2380();
				Static239.method5187();
				Static171.method2654("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static175.method2696(1, -1, false, -1);
				if (Static200.method3135() != 1) {
					Static171.method2654("wm1 failed");
					return;
				}
				Static171.method2654("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static175.method2696(2, -1, false, -1);
				if (Static200.method3135() == 2) {
					Static171.method2654("wm2 succeeded");
					return;
				}
				Static171.method2654("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static175.method2696(3, 768, false, 1024);
				if (Static200.method3135() != 3) {
					Static171.method2654("wm3 failed");
					return;
				}
				Static171.method2654("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static186.method2929(0);
				if (Static2.anInt68 != 0) {
					Static171.method2654("Failed to enter tk0");
					return;
				}
				Static171.method2654("Entered tk0");
				Static164.aClass154_Sub1_1.anInt6060 = 0;
				Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
				Static47.aBoolean45 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static186.method2929(1);
				if (Static2.anInt68 != 1) {
					Static171.method2654("Failed to enter tk1");
					return;
				}
				Static171.method2654("Entered tk1");
				Static164.aClass154_Sub1_1.anInt6060 = 1;
				Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
				Static47.aBoolean45 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static186.method2929(2);
				if (Static2.anInt68 == 2) {
					Static171.method2654("Entered tk2");
					Static164.aClass154_Sub1_1.anInt6060 = 2;
					Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
					Static47.aBoolean45 = false;
					return;
				}
				Static171.method2654("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static186.method2929(3);
				if (Static2.anInt68 == 3) {
					Static171.method2654("Entered tk3");
					return;
				}
				Static171.method2654("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static164.aClass154_Sub1_1.aBoolean464 = !Static164.aClass154_Sub1_1.aBoolean464;
				Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
				Static47.aBoolean45 = false;
				Static151.method2380();
				Static171.method2654("ot=" + Static164.aClass154_Sub1_1.aBoolean464);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static164.aClass154_Sub1_1.aBoolean460 = !Static164.aClass154_Sub1_1.aBoolean460;
				Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
				Static47.aBoolean45 = false;
				Static151.method2380();
				Static171.method2654("gb=" + Static164.aClass154_Sub1_1.aBoolean460);
				return;
			}
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static171.method2654("Invalid shadows value");
					return;
				}
				@Pc(525) String local525 = arg1.substring(8);
				@Pc(537) int local537 = Static245.method4021(local525) ? Static321.method2984(local525) : -1;
				if (local537 >= 0 && local537 <= 2) {
					Static164.aClass154_Sub1_1.anInt6057 = local537;
					Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
					Static47.aBoolean45 = false;
					Static151.method2380();
					Static171.method2654("shadows=" + local537);
					return;
				}
				Static171.method2654("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static171.method2654("Invalid buildarea value");
					return;
				}
				local73 = Static321.method2984(arg1.substring(6));
				if (local73 >= 0 && Static276.method4310(Static368.anInt6173) >= local73) {
					Static164.aClass154_Sub1_1.anInt6063 = local73;
					Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
					Static47.aBoolean45 = false;
					Static171.method2654("maxbuildarea=" + Static164.aClass154_Sub1_1.anInt6063);
					return;
				}
				Static171.method2654("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static171.method2654("Invalid particles value");
					return;
				}
				Static139.method2215(Static321.method2984(arg1.substring(13)));
				Static164.aClass154_Sub1_1.method5403(Static61.aClass156_1);
				Static47.aBoolean45 = false;
				Static171.method2654("particles=" + Static287.method4504());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static171.method2654("Invalid rect_debug value");
					return;
				}
				Static247.anInt4443 = Static321.method2984(arg1.substring(10).trim());
				Static171.method2654("rect_debug=" + Static247.anInt4443);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static75.aBoolean129 = true;
				Static171.method2654("qa_op_test=" + Static75.aBoolean129);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static363.aBoolean484 = !Static363.aBoolean484;
				Static171.method2654("clipcomponents=" + Static363.aBoolean484);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(732) boolean local732 = Static347.aClass155_9.method4898();
				if (!Static266.method4236(!local732)) {
					Static171.method2654("Failed to enable bloom");
					return;
				}
				if (!local732) {
					Static171.method2654("Bloom enabled");
					return;
				}
				Static171.method2654("Bloom disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static120.aBoolean173) {
					Static120.aBoolean173 = false;
					Static171.method2654("Forced tweening disabled.");
					return;
				}
				Static120.aBoolean173 = true;
				Static171.method2654("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static282.aBoolean391) {
					Static171.method2654("Shift-click disabled.");
					Static282.aBoolean391 = false;
					return;
				}
				Static171.method2654("Shift-click ENABLED!");
				Static282.aBoolean391 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static171.method2654("x:" + (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 >> 7) + " z:" + (Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static171.method2654("Height: " + Static337.aClass7Array3[Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73].method5648(Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5774 >> 7, Static226.aClass28_Sub1_Sub1_Sub2_2.anInt5766 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static77.aClass20_19.method238();
				Static77.aClass20_19.method227();
				Static319.aClass24_4.method314();
				Static326.aClass195_4.method4499();
				Static239.method5187();
				Static171.method2654("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static347.aClass155_9.method4949()) {
					local73 = Integer.parseInt(arg1.substring(3));
					if (local73 < 1) {
						local73 = 1;
					} else if (local73 > 4) {
						local73 = 4;
					}
					Static307.anInt5415 = local73;
					Static347.aClass155_9.method4865(Static307.anInt5415);
					Static347.aClass155_9.method4852(0);
					Static171.method2654("Render cores now: " + Static307.anInt5415);
					return;
				}
				Static171.method2654("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static171.method2654("I(s): " + Static179.aClass139_37.method3081() + "/" + Static179.aClass139_37.method3069());
				Static171.method2654("I(m): " + Static103.aClass139_21.method3081() + "/" + Static103.aClass139_21.method3069());
				Static171.method2654("O(s): " + Static176.aClass78_3.aClass178_1.method4142() + "/" + Static176.aClass78_3.aClass178_1.method4130());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static171.method2654("Pos: " + Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 + "," + (Static21.anInt265 + (Static206.anInt3639 >> 7) >> 6) + "," + ((Static339.anInt5726 >> 7) + Static103.anInt2044 >> 6) + "," + ((Static206.anInt3639 >> 7) + Static21.anInt265 & 0x3F) + "," + (Static103.anInt2044 + (Static339.anInt5726 >> 7) & 0x3F) + " Height: " + (Static55.method1005(Static339.anInt5726, Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, Static206.anInt3639) - Static243.anInt4289));
				Static171.method2654("Look: " + Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73 + "," + (Static210.anInt3709 + Static21.anInt265 >> 6) + "," + (Static103.anInt2044 + Static241.anInt4238 >> 6) + "," + (Static21.anInt265 + Static210.anInt3709 & 0x3F) + "," + (Static241.anInt4238 + Static103.anInt2044 & 0x3F) + " Height: " + (Static55.method1005(Static241.anInt4238, Static226.aClass28_Sub1_Sub1_Sub2_2.aByte73, Static210.anInt3709) - Static51.anInt1084));
				return;
			}
			if (arg1.equals("showocc")) {
				Static305.aBoolean410 = !Static305.aBoolean410;
				Static151.method2380();
				Static171.method2654("showocc=" + Static305.aBoolean410);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static102.aBoolean153 = !Static102.aBoolean153;
				Static151.method2380();
				Static171.method2654("forcewallocc=" + Static102.aBoolean153);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static169.aBoolean232 = !Static169.aBoolean232;
				Static347.aClass155_9.method4857(Static169.aBoolean232);
				Static166.method5549();
				Static171.method2654("showprofiling=" + Static169.aBoolean232);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static114.aBoolean164 = !Static114.aBoolean164;
				Static171.method2654("nonpcs=" + Static114.aBoolean164);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static333.method5077();
				Static171.method2654("auto world selected");
				return;
			}
			if (arg1.equals("heap")) {
				Static171.method2654("Heap: " + Static368.anInt6173 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static314.method4813();
				Static171.method2654("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local73 = 0; local73 < Static97.anIntArray196.length; local73++) {
					if (Static29.aBooleanArray105[local73]) {
						Static97.anIntArray196[local73] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static97.anIntArray196[local73] *= -1;
						}
					}
				}
				Static314.method4813();
				Static171.method2654("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static180.aBoolean239 = true;
				Static239.method5187();
				Static171.method2654("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static180.aBoolean239 = false;
				Static239.method5187();
				Static171.method2654("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static73.method1286();
				Static171.method2654("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static171.method2654(Static281.method4460() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local73 = Integer.parseInt(arg1.substring(9));
				if (local73 >= 0 && local73 <= 4) {
					Static164.aClass154_Sub1_1.anInt6061 = local73;
				}
				Static171.method2654("cpuusage=" + Static164.aClass154_Sub1_1.anInt6061);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local73 = Integer.parseInt(arg1.substring(17));
				Static171.method2654("varpbit=" + Static331.aClass115_1.method2397(local73));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local73 = Integer.parseInt(arg1.substring(14));
				Static171.method2654("varp=" + Static331.aClass115_1.method2398(local73));
				return;
			}
			if (Static348.anInt4439 == 30) {
				Static229.method3783(Static120.aClass244_38);
				Static23.aClass3_Sub5_Sub1_1.method2791(arg1.length() + 2);
				Static23.aClass3_Sub5_Sub1_1.method2791(arg0 ? 1 : 0);
				Static23.aClass3_Sub5_Sub1_1.method2768(arg1);
			}
			if (arg1.startsWith("fps ") && Static291.aClass171_5 != Static238.aClass171_4) {
				Static242.method3972(Static321.method2984(arg1.substring(4)));
				return;
			}
			if (Static348.anInt4439 != 30) {
				Static171.method2654("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1462) Exception local1462) {
			Static171.method2654("Whoops, something went wrong.");
			return;
		}
	}
}
