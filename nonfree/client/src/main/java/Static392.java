import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas6;

	@OriginalMember(owner = "client!tp", name = "h", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_213 = new Class189("Discard", "Ablegen", "Jeter", "Descartar");

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "Lclient!ef;")
	public static final Class61 aClass61_11 = new Class61(13, 0, 1, 0);

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString57 = "";

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_100 = new Class217(40, 3);

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Z")
	public static boolean method5074(@OriginalArg(0) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)Z")
	public static boolean method5075() {
		return Static339.aBoolean493;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLjava/lang/String;Z)V")
	public static void method5076(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		if (Static10.aClass182_1 == Static191.aClass182_6 && Static190.anInt3803 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static188.aBoolean323 = true;
				Static231.method3481("fps debug enabled");
				return;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static188.aBoolean323 = false;
				Static231.method3481("fps debug disabled");
				return;
			}
			if (arg0.equals("systemmem")) {
				try {
					Static231.method3481("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(64) Throwable local64) {
					return;
				}
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static183.anInt3946 = 0;
				Static213.anInt4089 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static231.aClass138_2.method3308();
				Static231.method3481("Text coords cleared");
				return;
			}
			@Pc(93) int local93;
			@Pc(110) int local110;
			@Pc(101) Runtime local101;
			if (arg0.equalsIgnoreCase("gc")) {
				Static159.method2570();
				for (local93 = 0; local93 < 10; local93++) {
					System.gc();
				}
				local101 = Runtime.getRuntime();
				local110 = (int) ((local101.totalMemory() - local101.freeMemory()) / 1024L);
				Static231.method3481("mem=" + local110 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static159.method2570();
				for (local93 = 0; local93 < 10; local93++) {
					System.gc();
				}
				local101 = Runtime.getRuntime();
				local110 = (int) ((local101.totalMemory() - local101.freeMemory()) / 1024L);
				Static231.method3481("Memory before cleanup=" + local110 + "k");
				Static201.method4112();
				Static159.method2570();
				for (@Pc(164) int local164 = 0; local164 < 10; local164++) {
					System.gc();
				}
				local110 = (int) ((local101.totalMemory() - local101.freeMemory()) / 1024L);
				Static231.method3481("Memory after cleanup=" + local110 + "k");
				return;
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static231.method3481("Number of player models in cache:" + Static280.method3939());
				return;
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				Static231.method3481("Dropped client connection");
				if (Static120.anInt2584 == 30) {
					Static92.method1686();
					return;
				}
				if (Static120.anInt2584 == 25) {
					Static109.aBoolean215 = true;
				}
				return;
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static265.aClass257_2.method5401();
				Static231.method3481("Dropped client js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static265.aClass257_2.method5402();
				Static231.method3481("Dropped server js5 net queue");
				return;
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static66.aClass143_2.method3395();
				Static88.aClass251_2.method5341();
				Static265.aClass257_2.method5404();
				Static231.method3481("Breaking new connections for 5 seconds");
				return;
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static213.method3267();
				Static47.method862();
				Static231.method3481("Rebuilding map");
				return;
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static387.method5031(1, -1, -1, false);
				if (Static391.method5269() == 1) {
					Static231.method3481("wm1 succeeded");
					return;
				}
				Static231.method3481("wm1 failed");
				return;
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static387.method5031(2, -1, -1, false);
				if (Static391.method5269() != 2) {
					Static231.method3481("wm2 failed");
					return;
				}
				Static231.method3481("wm2 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("wm3")) {
				Static387.method5031(3, 768, 1024, false);
				if (Static391.method5269() != 3) {
					Static231.method3481("wm3 failed");
					return;
				}
				Static231.method3481("wm3 succeeded");
				return;
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static111.method1883(0);
				if (Static105.anInt2382 != 0) {
					Static231.method3481("Failed to enter tk0");
					return;
				}
				Static231.method3481("Entered tk0");
				Static374.aClass20_Sub1_1.anInt2347 = 0;
				Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
				Static196.aBoolean336 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static111.method1883(1);
				if (Static105.anInt2382 != 1) {
					Static231.method3481("Failed to enter tk1");
					return;
				}
				Static231.method3481("Entered tk1");
				Static374.aClass20_Sub1_1.anInt2347 = 1;
				Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
				Static196.aBoolean336 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static111.method1883(2);
				if (Static105.anInt2382 == 2) {
					Static231.method3481("Entered tk2");
					Static374.aClass20_Sub1_1.anInt2347 = 2;
					Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
					Static196.aBoolean336 = false;
					return;
				}
				Static231.method3481("Failed to enter tk2");
				return;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static111.method1883(3);
				if (Static105.anInt2382 != 3) {
					Static231.method3481("Failed to enter tk3");
					return;
				}
				Static231.method3481("Entered tk3");
				return;
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static374.aClass20_Sub1_1.aBoolean200 = !Static374.aClass20_Sub1_1.aBoolean200;
				Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
				Static196.aBoolean336 = false;
				Static213.method3267();
				Static231.method3481("ot=" + Static374.aClass20_Sub1_1.aBoolean200);
				return;
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static374.aClass20_Sub1_1.aBoolean184 = !Static374.aClass20_Sub1_1.aBoolean184;
				Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
				Static196.aBoolean336 = false;
				Static213.method3267();
				Static231.method3481("gb=" + Static374.aClass20_Sub1_1.aBoolean184);
				return;
			}
			@Pc(547) int local547;
			if (arg0.startsWith("shadows")) {
				if (arg0.length() < 8) {
					Static231.method3481("Invalid shadows value");
					return;
				}
				@Pc(537) String local537 = arg0.substring(8);
				local547 = Static406.method5236(local537) ? Static247.method3714(local537) : -1;
				if (local547 >= 0 && local547 <= 2) {
					Static374.aClass20_Sub1_1.method1802(local547, Static105.anInt2382);
					Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
					Static196.aBoolean336 = false;
					Static213.method3267();
					Static231.method3481("shadows=" + local547);
					return;
				}
				Static231.method3481("Invalid shadows value");
				return;
			}
			if (arg0.startsWith("textures")) {
				Static374.aClass20_Sub1_1.aBoolean193 = !Static374.aClass20_Sub1_1.aBoolean193;
				Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
				Static196.aBoolean336 = false;
				Static176.method2814();
				Static213.method3267();
				Static231.method3481("textures=" + Static374.aClass20_Sub1_1.aBoolean193);
				return;
			}
			if (arg0.startsWith("setba")) {
				if (arg0.length() < 6) {
					Static231.method3481("Invalid buildarea value");
					return;
				}
				local93 = Static247.method3714(arg0.substring(6));
				if (local93 >= 0 && Static242.method3661(Static286.anInt1448) >= local93) {
					Static374.aClass20_Sub1_1.anInt2352 = local93;
					Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
					Static196.aBoolean336 = false;
					Static231.method3481("maxbuildarea=" + Static374.aClass20_Sub1_1.anInt2352);
					return;
				}
				Static231.method3481("Invalid buildarea value");
				return;
			}
			if (arg0.startsWith("setparticles")) {
				if (arg0.length() < 13) {
					Static231.method3481("Invalid particles value");
					return;
				}
				Static82.method3177(Static247.method3714(arg0.substring(13)));
				Static374.aClass20_Sub1_1.method1818(Static66.aClass143_2);
				Static196.aBoolean336 = false;
				Static231.method3481("particles=" + Static309.method4305());
				return;
			}
			if (arg0.startsWith("rect_debug")) {
				if (arg0.length() < 10) {
					Static231.method3481("Invalid rect_debug value");
					return;
				}
				Static350.anInt3652 = Static247.method3714(arg0.substring(10).trim());
				Static231.method3481("rect_debug=" + Static350.anInt3652);
				return;
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static63.aBoolean138 = true;
				Static231.method3481("qa_op_test=" + Static63.aBoolean138);
				return;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static330.aBoolean488 = !Static330.aBoolean488;
				Static231.method3481("clipcomponents=" + Static330.aBoolean488);
				return;
			}
			if (arg0.startsWith("bloom")) {
				@Pc(782) boolean local782 = Static121.aClass172_3.method5539();
				if (Static354.method4717(!local782)) {
					if (!local782) {
						Static231.method3481("Bloom enabled");
						return;
					}
					Static231.method3481("Bloom disabled");
					return;
				}
				Static231.method3481("Failed to enable bloom");
				return;
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (!Static262.aBoolean439) {
					Static262.aBoolean439 = true;
					Static231.method3481("Forced tweening ENABLED!");
					return;
				}
				Static262.aBoolean439 = false;
				Static231.method3481("Forced tweening disabled.");
				return;
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (!Static348.aBoolean510) {
					Static231.method3481("Shift-click ENABLED!");
					Static348.aBoolean510 = true;
					return;
				}
				Static231.method3481("Shift-click disabled.");
				Static348.aBoolean510 = false;
				return;
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static231.method3481("x:" + (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 >> 7) + " z:" + (Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static231.method3481("Height: " + Static444.aClass159Array3[Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77].I(Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 >> 7, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 >> 7));
				return;
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static405.aClass32_82.method792();
				Static405.aClass32_82.method803();
				Static326.aClass164_3.method3865();
				Static168.aClass171_3.method3938();
				Static47.method862();
				Static231.method3481("Minimap reset");
				return;
			}
			if (arg0.startsWith("mc")) {
				if (Static121.aClass172_3.method5491()) {
					local93 = Integer.parseInt(arg0.substring(3));
					if (local93 < 1) {
						local93 = 1;
					} else if (local93 > 4) {
						local93 = 4;
					}
					Static181.anInt3616 = local93;
					Static121.aClass172_3.method5497(Static181.anInt3616);
					Static121.aClass172_3.method5521(0);
					Static231.method3481("Render cores now: " + Static181.anInt3616);
					return;
				}
				Static231.method3481("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg0.startsWith("cachespace")) {
				Static231.method3481("I(s): " + Static367.aClass126_51.method3137() + "/" + Static367.aClass126_51.method3134());
				Static231.method3481("I(m): " + Static225.aClass126_26.method3137() + "/" + Static225.aClass126_26.method3134());
				Static231.method3481("O(s): " + Static314.aClass12_2.aClass193_1.method4294() + "/" + Static314.aClass12_2.aClass193_1.method4301());
				return;
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static231.method3481("Pos: " + Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 + "," + (Static223.anInt7618 + (Static276.anInt5105 >> 7) >> 6) + "," + (Static57.anInt5085 + (Static265.anInt5008 >> 7) >> 6) + "," + ((Static276.anInt5105 >> 7) + Static223.anInt7618 & 0x3F) + "," + (Static57.anInt5085 + (Static265.anInt5008 >> 7) & 0x3F) + " Height: " + (Static231.method3482(Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77, Static276.anInt5105, Static265.anInt5008) - Static439.anInt7400));
				Static231.method3481("Look: " + Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 + "," + (Static223.anInt7618 + Static348.anInt5916 >> 6) + "," + (Static57.anInt5085 + Static202.anInt3951 >> 6) + "," + (Static223.anInt7618 + Static348.anInt5916 & 0x3F) + "," + (Static57.anInt5085 + Static202.anInt3951 & 0x3F) + " Height: " + (Static231.method3482(Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77, Static348.anInt5916, Static202.anInt3951) - Static185.anInt3725));
				return;
			}
			if (arg0.equals("showocc")) {
				Static451.aBoolean655 = !Static451.aBoolean655;
				Static213.method3267();
				Static231.method3481("showocc=" + Static451.aBoolean655);
				return;
			}
			if (arg0.equals("wallocc")) {
				Static231.aBoolean373 = !Static231.aBoolean373;
				Static213.method3267();
				Static231.method3481("forcewallocc=" + Static231.aBoolean373);
				return;
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static76.aBoolean161 = !Static76.aBoolean161;
				Static121.aClass172_3.method5488(Static76.aBoolean161);
				Static86.method1646();
				Static231.method3481("showprofiling=" + Static76.aBoolean161);
				return;
			}
			if (arg0.equals("performancetest")) {
				Static231.method3481("Java toolkit: " + Static296.method4145(Static66.aClass143_2));
				Static231.method3481("GL toolkit:   " + Static296.method4145(Static66.aClass143_2));
				Static231.method3481("SSE toolkit:  " + Static296.method4145(Static66.aClass143_2));
				return;
			}
			if (arg0.equals("nonpcs")) {
				Static310.aBoolean475 = !Static310.aBoolean475;
				Static231.method3481("nonpcs=" + Static310.aBoolean475);
				return;
			}
			if (arg0.equals("autoworld")) {
				Static1.method5();
				Static231.method3481("auto world selected");
				return;
			}
			if (arg0.startsWith("pc")) {
				Static30.method641(Static127.aClass217_48);
				Static302.aClass3_Sub7_Sub1_2.method2628(0);
				local93 = Static302.aClass3_Sub7_Sub1_2.anInt3235;
				local547 = arg0.indexOf(" ", 4);
				Static302.aClass3_Sub7_Sub1_2.method2608(arg0.substring(3, local547));
				Static296.method4143(arg0.substring(local547), Static302.aClass3_Sub7_Sub1_2);
				Static302.aClass3_Sub7_Sub1_2.method2629(Static302.aClass3_Sub7_Sub1_2.anInt3235 - local93);
				return;
			}
			if (arg0.equals("heap")) {
				Static231.method3481("Heap: " + Static286.anInt1448 + "MB");
				return;
			}
			if (arg0.equals("savevarcs")) {
				Static40.method775();
				Static231.method3481("perm varcs saved");
				return;
			}
			if (arg0.equals("scramblevarcs")) {
				for (local93 = 0; local93 < Static407.anIntArray453.length; local93++) {
					if (Static20.aBooleanArray4[local93]) {
						Static407.anIntArray453[local93] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static407.anIntArray453[local93] *= -1;
						}
					}
				}
				Static40.method775();
				Static231.method3481("perm varcs scrambled");
				return;
			}
			if (arg0.equals("showcolmap")) {
				Static25.aBoolean65 = true;
				Static47.method862();
				Static231.method3481("colmap is shown");
				return;
			}
			if (arg0.equals("hidecolmap")) {
				Static25.aBoolean65 = false;
				Static47.method862();
				Static231.method3481("colmap is hidden");
				return;
			}
			if (arg0.equals("resetcache")) {
				Static235.method3584();
				Static231.method3481("Caches reset");
				return;
			}
			if (arg0.equals("profilecpu")) {
				Static231.method3481(Static312.method4323() + "ms");
				return;
			}
			if (arg0.startsWith("cpuusage")) {
				local93 = Integer.parseInt(arg0.substring(9));
				if (local93 >= 0 && local93 <= 4) {
					Static374.aClass20_Sub1_1.anInt2357 = local93;
				}
				Static231.method3481("cpuusage=" + Static374.aClass20_Sub1_1.anInt2357);
				return;
			}
			if (arg0.startsWith("getclientvarpbit")) {
				local93 = Integer.parseInt(arg0.substring(17));
				Static231.method3481("varpbit=" + Static85.aClass49_1.method1310(local93));
				return;
			}
			if (arg0.startsWith("getclientvarp")) {
				local93 = Integer.parseInt(arg0.substring(14));
				Static231.method3481("varp=" + Static85.aClass49_1.method1309(local93));
				return;
			}
			if (arg0.startsWith("csprofileclear")) {
				Static285.method4060();
				return;
			}
			if (arg0.startsWith("csprofileoutputc")) {
				Static285.method4048();
				return;
			}
			if (arg0.startsWith("csprofileoutputt")) {
				Static285.method4048();
				return;
			}
			if (arg0.startsWith("texsize")) {
				local93 = Integer.parseInt(arg0.substring(8));
				Static121.aClass172_3.method5510(local93);
				return;
			}
			if (arg0.equals("soundstreamcount")) {
				Static231.method3481("Active streams: " + Static331.aClass3_Sub5_Sub1_42.method887());
				return;
			}
			if (Static120.anInt2584 == 30) {
				Static30.method641(Static246.aClass217_71);
				Static302.aClass3_Sub7_Sub1_2.method2628(arg0.length() + 2);
				Static302.aClass3_Sub7_Sub1_2.method2628(arg1 ? 1 : 0);
				Static302.aClass3_Sub7_Sub1_2.method2608(arg0);
			}
			if (arg0.startsWith("fps ") && Static10.aClass182_1 != Static191.aClass182_6) {
				Static6.method44(Static247.method3714(arg0.substring(4)));
				return;
			}
			if (Static120.anInt2584 != 30) {
				Static231.method3481("Unrecogonised commmand when not logged in: " + arg0);
			}
		} catch (@Pc(1639) Exception local1639) {
			Static231.method3481("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)I")
	public static int method5077(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
