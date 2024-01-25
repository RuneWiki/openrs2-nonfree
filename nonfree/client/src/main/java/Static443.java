import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method5711(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static23.aClass56_1 == Static53.aClass56_2 && Static193.anInt3710 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static121.aBoolean205 = true;
				Static99.method1879("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static121.aBoolean205 = false;
				Static99.method1879("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static99.method1879("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(64) Throwable local64) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static161.anInt6991 = 0;
				Static155.anInt3171 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static116.aClass112_6.method2549();
				Static99.method1879("Text coords cleared");
				return;
			}
			@Pc(93) int local93;
			@Pc(114) int local114;
			@Pc(104) Runtime local104;
			if (arg1.equalsIgnoreCase("gc")) {
				Static187.method2964();
				for (local93 = 0; local93 < 10; local93++) {
					System.gc();
				}
				local104 = Runtime.getRuntime();
				local114 = (int) ((local104.totalMemory() - local104.freeMemory()) / 1024L);
				Static99.method1879("mem=" + local114 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static187.method2964();
				for (local93 = 0; local93 < 10; local93++) {
					System.gc();
				}
				local104 = Runtime.getRuntime();
				local114 = (int) ((local104.totalMemory() - local104.freeMemory()) / 1024L);
				Static99.method1879("Memory before cleanup=" + local114 + "k");
				Static258.method587();
				Static187.method2964();
				for (@Pc(169) int local169 = 0; local169 < 10; local169++) {
					System.gc();
				}
				local114 = (int) ((local104.totalMemory() - local104.freeMemory()) / 1024L);
				Static99.method1879("Memory after cleanup=" + local114 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static99.method1879("Number of player models in cache:" + Static111.method2015());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static99.method1879("Dropped client connection");
				if (Static162.anInt3250 == 30) {
					Static76.method1391();
					return;
				}
				if (Static162.anInt3250 == 25) {
					Static235.aBoolean424 = true;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static102.aClass243_2.method5239();
				Static99.method1879("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static102.aClass243_2.method5233();
				Static99.method1879("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static43.aClass59_5.method1357();
				Static34.aClass34_2.method612();
				Static102.aClass243_2.method5236();
				Static99.method1879("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static129.method2211();
				Static154.method2542();
				Static99.method1879("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static243.method3738(-1, -1, false, 1);
				if (Static359.method4899() == 1) {
					Static99.method1879("wm1 succeeded");
					return;
				}
				Static99.method1879("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static243.method3738(-1, -1, false, 2);
				if (Static359.method4899() == 2) {
					Static99.method1879("wm2 succeeded");
					return;
				}
				Static99.method1879("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static243.method3738(1024, 768, false, 3);
				if (Static359.method4899() != 3) {
					Static99.method1879("wm3 failed");
					return;
				}
				Static99.method1879("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static171.method2780(0);
				if (Static399.anInt6653 != 0) {
					Static99.method1879("Failed to enter tk0");
					return;
				}
				Static99.method1879("Entered tk0");
				Static12.aClass79_Sub1_1.anInt4926 = 0;
				Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
				Static120.aBoolean204 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static171.method2780(1);
				if (Static399.anInt6653 != 1) {
					Static99.method1879("Failed to enter tk1");
					return;
				}
				Static99.method1879("Entered tk1");
				Static12.aClass79_Sub1_1.anInt4926 = 1;
				Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
				Static120.aBoolean204 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static171.method2780(2);
				if (Static399.anInt6653 == 2) {
					Static99.method1879("Entered tk2");
					Static12.aClass79_Sub1_1.anInt4926 = 2;
					Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
					Static120.aBoolean204 = false;
					return;
				}
				Static99.method1879("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static171.method2780(3);
				if (Static399.anInt6653 != 3) {
					Static99.method1879("Failed to enter tk3");
					return;
				}
				Static99.method1879("Entered tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static12.aClass79_Sub1_1.aBoolean365 = !Static12.aClass79_Sub1_1.aBoolean365;
				Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
				Static120.aBoolean204 = false;
				Static129.method2211();
				Static99.method1879("ot=" + Static12.aClass79_Sub1_1.aBoolean365);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static12.aClass79_Sub1_1.aBoolean351 = !Static12.aClass79_Sub1_1.aBoolean351;
				Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
				Static120.aBoolean204 = false;
				Static129.method2211();
				Static99.method1879("gb=" + Static12.aClass79_Sub1_1.aBoolean351);
				return;
			}
			@Pc(547) int local547;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static99.method1879("Invalid shadows value");
					return;
				}
				@Pc(537) String local537 = arg1.substring(8);
				local547 = Static24.method4076(local537) ? Static418.method5543(local537) : -1;
				if (local547 >= 0 && local547 <= 2) {
					Static12.aClass79_Sub1_1.method3958(local547, Static399.anInt6653);
					Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
					Static120.aBoolean204 = false;
					Static129.method2211();
					Static99.method1879("shadows=" + local547);
					return;
				}
				Static99.method1879("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static12.aClass79_Sub1_1.aBoolean352 = !Static12.aClass79_Sub1_1.aBoolean352;
				Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
				Static120.aBoolean204 = false;
				Static185.method2952();
				Static129.method2211();
				Static99.method1879("textures=" + Static12.aClass79_Sub1_1.aBoolean352);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static99.method1879("Invalid buildarea value");
					return;
				}
				local93 = Static418.method5543(arg1.substring(6));
				if (local93 >= 0 && local93 <= Static184.method2948(Static7.anInt219)) {
					Static12.aClass79_Sub1_1.anInt4929 = local93;
					Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
					Static120.aBoolean204 = false;
					Static99.method1879("maxbuildarea=" + Static12.aClass79_Sub1_1.anInt4929);
					return;
				}
				Static99.method1879("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static99.method1879("Invalid particles value");
					return;
				}
				Static404.method5328(Static418.method5543(arg1.substring(13)));
				Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
				Static120.aBoolean204 = false;
				Static99.method1879("particles=" + Static38.method5045());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static99.method1879("Invalid rect_debug value");
					return;
				}
				Static270.anInt5006 = Static418.method5543(arg1.substring(10).trim());
				Static99.method1879("rect_debug=" + Static270.anInt5006);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static154.aBoolean245 = true;
				Static99.method1879("qa_op_test=" + Static154.aBoolean245);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static294.aBoolean383 = !Static294.aBoolean383;
				Static99.method1879("clipcomponents=" + Static294.aBoolean383);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(787) boolean local787 = Static33.aClass49_1.method4431();
				if (!Static320.method4495(!local787)) {
					Static99.method1879("Failed to enable bloom");
					return;
				}
				if (!local787) {
					Static99.method1879("Bloom enabled");
					return;
				}
				Static99.method1879("Bloom disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static133.aBoolean221) {
					Static133.aBoolean221 = true;
					Static99.method1879("Forced tweening ENABLED!");
					return;
				}
				Static133.aBoolean221 = false;
				Static99.method1879("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static424.aBoolean472) {
					Static99.method1879("Shift-click ENABLED!");
					Static424.aBoolean472 = true;
					return;
				}
				Static99.method1879("Shift-click disabled.");
				Static424.aBoolean472 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static99.method1879("x:" + (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 >> 7) + " z:" + (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static99.method1879("Height: " + Static58.aClass64Array1[Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89].l(Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 >> 7, Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static153.aClass160_25.method3695();
				Static153.aClass160_25.method3717();
				Static258.aClass120_4.method2661();
				Static357.aClass215_4.method4745();
				Static154.method2542();
				Static99.method1879("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static33.aClass49_1.method4459()) {
					local93 = Integer.parseInt(arg1.substring(3));
					if (local93 < 1) {
						local93 = 1;
					} else if (local93 > 4) {
						local93 = 4;
					}
					Static64.anInt1455 = local93;
					Static33.aClass49_1.method4424(Static64.anInt1455);
					Static33.aClass49_1.method4407(0);
					Static99.method1879("Render cores now: " + Static64.anInt1455);
					return;
				}
				Static99.method1879("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static99.method1879("I(s): " + Static121.aClass171_19.method3937() + "/" + Static121.aClass171_19.method3932());
				Static99.method1879("I(m): " + Static440.aClass171_60.method3937() + "/" + Static440.aClass171_60.method3932());
				Static99.method1879("O(s): " + Static318.aClass144_6.aClass38_1.method652() + "/" + Static318.aClass144_6.aClass38_1.method659());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static99.method1879("Pos: " + Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 + "," + ((Static364.anInt6270 >> 7) + Static48.anInt962 >> 6) + "," + (Static324.anInt5624 + (Static23.anInt567 >> 7) >> 6) + "," + ((Static364.anInt6270 >> 7) + Static48.anInt962 & 0x3F) + "," + ((Static23.anInt567 >> 7) + Static324.anInt5624 & 0x3F) + " Height: " + (Static85.method1695(Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89, Static23.anInt567, Static364.anInt6270) - Static355.anInt6031));
				Static99.method1879("Look: " + Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 + "," + (Static48.anInt962 + Static80.anInt7141 >> 6) + "," + (Static324.anInt5624 + Static28.anInt627 >> 6) + "," + (Static80.anInt7141 + Static48.anInt962 & 0x3F) + "," + (Static28.anInt627 + Static324.anInt5624 & 0x3F) + " Height: " + (Static85.method1695(Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89, Static28.anInt627, Static80.anInt7141) - Static146.anInt3069));
				return;
			}
			if (arg1.equals("showocc")) {
				Static70.aBoolean97 = !Static70.aBoolean97;
				Static129.method2211();
				Static99.method1879("showocc=" + Static70.aBoolean97);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static450.aBoolean484 = !Static450.aBoolean484;
				Static129.method2211();
				Static99.method1879("forcewallocc=" + Static450.aBoolean484);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static157.aBoolean246 = !Static157.aBoolean246;
				Static33.aClass49_1.method4423(Static157.aBoolean246);
				Static67.method1277();
				Static99.method1879("showprofiling=" + Static157.aBoolean246);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static99.method1879("Java toolkit: " + Static166.method2705(Static43.aClass59_5));
				Static99.method1879("GL toolkit:   " + Static166.method2705(Static43.aClass59_5));
				Static99.method1879("SSE toolkit:  " + Static166.method2705(Static43.aClass59_5));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static333.aBoolean405 = !Static333.aBoolean405;
				Static99.method1879("nonpcs=" + Static333.aBoolean405);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static2.method72();
				Static99.method1879("auto world selected");
				return;
			}
			if (arg1.startsWith("pc")) {
				Static159.method2586(Static329.aClass54_80);
				Static424.aClass2_Sub23_Sub2_1.method5449(0);
				local93 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
				local547 = arg1.indexOf(" ", 4);
				Static424.aClass2_Sub23_Sub2_1.method5496(arg1.substring(3, local547));
				Static198.method3097(arg1.substring(local547), Static424.aClass2_Sub23_Sub2_1);
				Static424.aClass2_Sub23_Sub2_1.method5448(Static424.aClass2_Sub23_Sub2_1.anInt6952 - local93);
				return;
			}
			if (arg1.equals("heap")) {
				Static99.method1879("Heap: " + Static7.anInt219 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static415.method5522();
				Static99.method1879("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local93 = 0; local93 < Static19.anIntArray426.length; local93++) {
					if (Static70.aBooleanArray9[local93]) {
						Static19.anIntArray426[local93] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static19.anIntArray426[local93] *= -1;
						}
					}
				}
				Static415.method5522();
				Static99.method1879("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static160.aBoolean312 = true;
				Static154.method2542();
				Static99.method1879("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static160.aBoolean312 = false;
				Static154.method2542();
				Static99.method1879("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static372.method2347();
				Static99.method1879("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static99.method1879(Static81.method1475() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local93 = Integer.parseInt(arg1.substring(9));
				if (local93 >= 0 && local93 <= 4) {
					Static12.aClass79_Sub1_1.anInt4913 = local93;
				}
				Static99.method1879("cpuusage=" + Static12.aClass79_Sub1_1.anInt4913);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local93 = Integer.parseInt(arg1.substring(17));
				Static99.method1879("varpbit=" + Static344.aClass108_1.method2423(local93));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local93 = Integer.parseInt(arg1.substring(14));
				Static99.method1879("varp=" + Static344.aClass108_1.method2422(local93));
				return;
			}
			if (arg1.startsWith("csprofileclear")) {
				Static168.method2730();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static168.method2739();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static168.method2739();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local93 = Integer.parseInt(arg1.substring(8));
				Static33.aClass49_1.method4454(local93);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static99.method1879("Active streams: " + Static260.aClass2_Sub3_Sub1_2.method1821());
				return;
			}
			if (Static162.anInt3250 == 30) {
				Static159.method2586(Static300.aClass54_76);
				Static424.aClass2_Sub23_Sub2_1.method5449(arg1.length() + 2);
				Static424.aClass2_Sub23_Sub2_1.method5449(arg0 ? 1 : 0);
				Static424.aClass2_Sub23_Sub2_1.method5496(arg1);
			}
			if (arg1.startsWith("fps ") && Static23.aClass56_1 != Static53.aClass56_2) {
				Static232.method3614(Static418.method5543(arg1.substring(4)));
				return;
			}
			if (Static162.anInt3250 != 30) {
				Static99.method1879("Unrecogonised commmand when not logged in: " + arg1);
			}
		} catch (@Pc(1636) Exception local1636) {
			Static99.method1879("Whoops, something went wrong.");
		}
	}
}
