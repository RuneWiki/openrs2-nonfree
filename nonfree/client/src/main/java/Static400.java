import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!ue", name = "E", descriptor = "Lclient!l;")
	public static Class57 aClass57_23;

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_88 = new Class215(23, 3);

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
	public static int anInt6628 = 2;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method5186(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (Static104.aClass219_2 == Static373.aClass219_6 && Static104.anInt2252 < 2) {
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
				Static325.aBoolean507 = true;
				Static441.method5568("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static325.aBoolean507 = false;
				Static441.method5568("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static441.method5568("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(75) Throwable local75) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static93.anInt1881 = 0;
				Static167.anInt3231 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static276.aClass84_4.method2310();
				Static441.method5568("Text coords cleared");
				return;
			}
			@Pc(106) int local106;
			@Pc(125) int local125;
			@Pc(115) Runtime local115;
			if (arg0.equalsIgnoreCase("gc")) {
				Static385.method5082();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local115 = Runtime.getRuntime();
				local125 = (int) ((local115.totalMemory() - local115.freeMemory()) / 1024L);
				Static441.method5568("mem=" + local125 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static385.method5082();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local115 = Runtime.getRuntime();
				local125 = (int) ((local115.totalMemory() - local115.freeMemory()) / 1024L);
				Static441.method5568("Memory before cleanup=" + local125 + "k");
				Static343.method743();
				Static385.method5082();
				for (@Pc(185) int local185 = 0; local185 < 10; local185++) {
					System.gc();
				}
				local125 = (int) ((local115.totalMemory() - local115.freeMemory()) / 1024L);
				Static441.method5568("Memory after cleanup=" + local125 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static441.method5568("Number of player models in cache:" + Static317.method4232());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static441.method5568("Dropped client connection");
				if (Static403.anInt6667 == 30) {
					Static165.method2731();
					return;
				}
				if (Static403.anInt6667 == 25) {
					Static22.aBoolean38 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static261.aClass255_2.method5474();
				Static441.method5568("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static261.aClass255_2.method5467();
				Static441.method5568("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static206.aClass66_4.method1753();
				Static125.aClass11_5.method132();
				Static261.aClass255_2.method5466();
				Static441.method5568("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static335.method4744();
				Static277.method3932();
				Static441.method5568("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static188.method4107(1, -1, -1, false);
				if (Static450.method5664() != 1) {
					Static441.method5568("wm1 failed");
					return;
				}
				Static441.method5568("wm1 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static188.method4107(2, -1, -1, false);
				if (Static450.method5664() != 2) {
					Static441.method5568("wm2 failed");
					return;
				}
				Static441.method5568("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static188.method4107(3, 768, 1024, false);
				if (Static450.method5664() != 3) {
					Static441.method5568("wm3 failed");
					return;
				}
				Static441.method5568("wm3 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static239.method3551(0);
				if (Static177.anInt2973 == 0) {
					Static441.method5568("Entered tk0");
					Static323.aClass50_Sub1_1.anInt3445 = 0;
					Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
					Static249.aBoolean425 = false;
					return;
				}
				Static441.method5568("Failed to enter tk0");
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static239.method3551(1);
				if (Static177.anInt2973 != 1) {
					Static441.method5568("Failed to enter tk1");
					return;
				}
				Static441.method5568("Entered tk1");
				Static323.aClass50_Sub1_1.anInt3445 = 1;
				Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
				Static249.aBoolean425 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static239.method3551(2);
				if (Static177.anInt2973 == 2) {
					Static441.method5568("Entered tk2");
					Static323.aClass50_Sub1_1.anInt3445 = 2;
					Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
					Static249.aBoolean425 = false;
					return;
				}
				Static441.method5568("Failed to enter tk2");
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static239.method3551(3);
				if (Static177.anInt2973 == 3) {
					Static441.method5568("Entered tk3");
					return;
				}
				Static441.method5568("Failed to enter tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static323.aClass50_Sub1_1.aBoolean293 = !Static323.aClass50_Sub1_1.aBoolean293;
				Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
				Static249.aBoolean425 = false;
				Static335.method4744();
				Static441.method5568("ot=" + Static323.aClass50_Sub1_1.aBoolean293);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static323.aClass50_Sub1_1.aBoolean289 = !Static323.aClass50_Sub1_1.aBoolean289;
				Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
				Static249.aBoolean425 = false;
				Static335.method4744();
				Static441.method5568("gb=" + Static323.aClass50_Sub1_1.aBoolean289);
				return;
			}
			@Pc(568) int local568;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static441.method5568("Invalid shadows value");
					return;
				}
				@Pc(558) String local558 = arg0.substring(8);
				local568 = Static88.method1590(local558) ? Static198.method3113(local558) : -1;
				if (local568 >= 0 && local568 <= 2) {
					Static323.aClass50_Sub1_1.method2852(Static177.anInt2973, local568);
					Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
					Static249.aBoolean425 = false;
					Static335.method4744();
					Static441.method5568("shadows=" + local568);
					return;
				}
				Static441.method5568("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static323.aClass50_Sub1_1.aBoolean307 = !Static323.aClass50_Sub1_1.aBoolean307;
				Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
				Static249.aBoolean425 = false;
				Static119.method2149();
				Static335.method4744();
				Static441.method5568("textures=" + Static323.aClass50_Sub1_1.aBoolean307);
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static441.method5568("Invalid buildarea value");
					return;
				}
				local106 = Static198.method3113(arg0.substring(6));
				if (local106 >= 0 && local106 <= Static53.method898(Static70.anInt1503)) {
					Static323.aClass50_Sub1_1.anInt3434 = local106;
					Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
					Static249.aBoolean425 = false;
					Static441.method5568("maxbuildarea=" + Static323.aClass50_Sub1_1.anInt3434);
					return;
				}
				Static441.method5568("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static441.method5568("Invalid particles value");
					return;
				}
				Static157.method2673(Static198.method3113(arg0.substring(13)));
				Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
				Static249.aBoolean425 = false;
				Static441.method5568("particles=" + Static218.method3279());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static441.method5568("Invalid rect_debug value");
					return;
				}
				Static293.anInt5286 = Static198.method3113(arg0.substring(10).trim());
				Static441.method5568("rect_debug=" + Static293.anInt5286);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static415.aBoolean626 = true;
				Static441.method5568("qa_op_test=" + Static415.aBoolean626);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static449.aBoolean688 = !Static449.aBoolean688;
				Static441.method5568("clipcomponents=" + Static449.aBoolean688);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(812) boolean local812 = Static122.aClass19_16.method4301();
				if (Static353.method4772(!local812)) {
					if (!local812) {
						Static441.method5568("Bloom enabled");
						return;
					}
					Static441.method5568("Bloom disabled");
					return;
				}
				Static441.method5568("Failed to enable bloom");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (Static127.aBoolean244) {
					Static127.aBoolean244 = false;
					Static441.method5568("Forced tweening disabled.");
					return;
				}
				Static127.aBoolean244 = true;
				Static441.method5568("Forced tweening ENABLED!");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (!Static434.aBoolean692) {
					Static441.method5568("Shift-click ENABLED!");
					Static434.aBoolean692 = true;
					return;
				}
				Static441.method5568("Shift-click disabled.");
				Static434.aBoolean692 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static441.method5568("x:" + (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 >> 7) + " z:" + (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static441.method5568("Height: " + Static417.aClass65Array4[Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82].l(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 >> 7, Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static293.aClass76_60.method2102();
				Static293.aClass76_60.method2118();
				Static76.aClass265_2.method5587();
				Static348.aClass182_4.method4127();
				Static277.method3932();
				Static441.method5568("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (!Static122.aClass19_16.method4264()) {
					Static441.method5568("Current toolkit doesn't support multiple cores");
					return;
				}
				local106 = Integer.parseInt(arg0.substring(3));
				if (local106 < 1) {
					local106 = 1;
				} else if (local106 > 4) {
					local106 = 4;
				}
				Static218.anInt4043 = local106;
				Static122.aClass19_16.method4283(Static218.anInt4043);
				Static122.aClass19_16.method4273(0);
				Static441.method5568("Render cores now: " + Static218.anInt4043);
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static441.method5568("I(s): " + Static259.aClass68_26.method1781() + "/" + Static259.aClass68_26.method1785());
				Static441.method5568("I(m): " + Static232.aClass68_25.method1781() + "/" + Static232.aClass68_25.method1785());
				Static441.method5568("O(s): " + Static444.aClass206_3.aClass220_1.method4944() + "/" + Static444.aClass206_3.aClass220_1.method4954());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static441.method5568("Pos: " + Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 + "," + (Static180.anInt3453 + (Static163.anInt3197 >> 7) >> 6) + "," + (Static86.anInt1771 + (Static145.anInt2906 >> 7) >> 6) + "," + (Static180.anInt3453 + (Static163.anInt3197 >> 7) & 0x3F) + "," + ((Static145.anInt2906 >> 7) + Static86.anInt1771 & 0x3F) + " Height: " + (Static13.method135(Static163.anInt3197, Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, Static145.anInt2906) - Static100.anInt2024));
				Static441.method5568("Look: " + Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 + "," + (Static180.anInt3453 + Static111.anInt2379 >> 6) + "," + (Static419.anInt6924 + Static86.anInt1771 >> 6) + "," + (Static111.anInt2379 + Static180.anInt3453 & 0x3F) + "," + (Static86.anInt1771 + Static419.anInt6924 & 0x3F) + " Height: " + (Static13.method135(Static111.anInt2379, Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82, Static419.anInt6924) - Static238.anInt4509));
				return;
			}
			if (arg0.equals("showocc")) {
				Static420.aBoolean647 = !Static420.aBoolean647;
				Static335.method4744();
				Static441.method5568("showocc=" + Static420.aBoolean647);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static172.aBoolean282 = !Static172.aBoolean282;
				Static335.method4744();
				Static441.method5568("forcewallocc=" + Static172.aBoolean282);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static437.aBoolean477 = !Static437.aBoolean477;
				Static122.aClass19_16.method4255(Static437.aBoolean477);
				Static47.method768();
				Static441.method5568("showprofiling=" + Static437.aBoolean477);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static441.method5568("Java toolkit: " + Static424.method5410(Static206.aClass66_4));
				Static441.method5568("GL toolkit:   " + Static424.method5410(Static206.aClass66_4));
				Static441.method5568("SSE toolkit:  " + Static424.method5410(Static206.aClass66_4));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static66.aBoolean508 = !Static66.aBoolean508;
				Static441.method5568("nonpcs=" + Static66.aBoolean508);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static129.method2288();
				Static441.method5568("auto world selected");
				return;
			}
			if (arg0.startsWith("pc")) {
				Static429.method5476(Static311.aClass215_69);
				Static3.aClass4_Sub12_Sub1_5.method2551(0);
				local106 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
				local568 = arg0.indexOf(" ", 4);
				Static3.aClass4_Sub12_Sub1_5.method2518(arg0.substring(3, local568));
				Static417.method5359(arg0.substring(local568), Static3.aClass4_Sub12_Sub1_5);
				Static3.aClass4_Sub12_Sub1_5.method2545(Static3.aClass4_Sub12_Sub1_5.anInt2997 - local106);
				return;
			}
			if (arg0.equals("heap")) {
				Static441.method5568("Heap: " + Static70.anInt1503 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static316.method4216();
				Static441.method5568("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local106 = 0; local106 < Static165.anIntArray210.length; local106++) {
					if (Static22.aBooleanArray3[local106]) {
						Static165.anIntArray210[local106] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static165.anIntArray210[local106] *= -1;
						}
					}
				}
				Static316.method4216();
				Static441.method5568("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static247.aBoolean424 = true;
				Static277.method3932();
				Static441.method5568("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static247.aBoolean424 = false;
				Static277.method3932();
				Static441.method5568("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static409.method5485();
				Static441.method5568("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static441.method5568(Static371.method4958() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local106 = Integer.parseInt(arg0.substring(9));
				if (local106 >= 0 && local106 <= 4) {
					Static323.aClass50_Sub1_1.anInt3437 = local106;
				}
				Static441.method5568("cpuusage=" + Static323.aClass50_Sub1_1.anInt3437);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local106 = Integer.parseInt(arg0.substring(17));
				Static441.method5568("varpbit=" + Static257.aClass114_1.method2825(local106));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local106 = Integer.parseInt(arg0.substring(14));
				Static441.method5568("varp=" + Static257.aClass114_1.method2826(local106));
				return;
			}
			if (arg0.startsWith("csprofileclear")) {
				Static271.method3893();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static271.method3895();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static271.method3895();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local106 = Integer.parseInt(arg0.substring(8));
				Static122.aClass19_16.method4306(local106);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static441.method5568("Active streams: " + Static360.aClass4_Sub15_Sub2_2.method2953());
				return;
			}
			if (Static403.anInt6667 == 30) {
				Static429.method5476(Static106.aClass215_26);
				Static3.aClass4_Sub12_Sub1_5.method2551(arg0.length() + 2);
				Static3.aClass4_Sub12_Sub1_5.method2551(arg1 ? 1 : 0);
				Static3.aClass4_Sub12_Sub1_5.method2518(arg0);
			}
			if (arg0.startsWith("fps ") && Static373.aClass219_6 != Static104.aClass219_2) {
				Static13.method136(Static198.method3113(arg0.substring(4)));
				return;
			}
			if (Static403.anInt6667 != 30) {
				Static441.method5568("Unrecogonised commmand when not logged in: " + arg0);
			}
		} catch (@Pc(1681) Exception local1681) {
			Static441.method5568("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)Z")
	public static boolean method5187() {
		if (Static385.aBoolean591) {
			try {
				Static458.method2593(Static206.aClass66_4.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIII)I")
	public static int method5188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg1;
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(IIII)V")
	public static void method5189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class4_Sub1_Sub11 local13 = Static405.method5222(arg0, 11);
		local13.method2604();
		local13.anInt3082 = arg2;
		local13.anInt3083 = arg1;
	}
}
