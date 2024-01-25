import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "Lclient!ih;")
	public static Class116 aClass116_31;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "Lclient!hj;")
	public static Class102 aClass102_1 = new Class102(8);

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method6283(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static170.aClass193_5 == Static136.aClass193_3 && Static291.anInt5199 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static250.aBoolean295 = true;
				Static36.method908("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static250.aBoolean295 = false;
				Static36.method908("fps debug disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static161.anInt3241 = 0;
				Static20.anInt657 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static298.aClass111_4.method2693();
				Static36.method908("Text coords cleared");
				return;
			}
			@Pc(77) int local77;
			@Pc(95) int local95;
			@Pc(86) Runtime local86;
			if (arg1.equalsIgnoreCase("gc")) {
				Static44.method989();
				for (local77 = 0; local77 < 10; local77++) {
					System.gc();
				}
				local86 = Runtime.getRuntime();
				local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
				Static36.method908("mem=" + local95 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static44.method989();
				for (local77 = 0; local77 < 10; local77++) {
					System.gc();
				}
				local86 = Runtime.getRuntime();
				local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
				Static36.method908("Memory before cleanup=" + local95 + "k");
				Static217.method3261();
				Static44.method989();
				for (@Pc(153) int local153 = 0; local153 < 10; local153++) {
					System.gc();
				}
				local95 = (int) ((local86.totalMemory() - local86.freeMemory()) / 1024L);
				Static36.method908("Memory after cleanup=" + local95 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static36.method908("Number of player models in cache:" + Static357.method5295());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static36.method908("Dropped client connection");
				if (Static217.anInt3941 == 30) {
					Static406.method6008();
				} else if (Static217.anInt3941 == 25) {
					Static327.aBoolean352 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static443.aClass227_3.method5577();
				Static36.method908("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static443.aClass227_3.method5569();
				Static36.method908("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static45.aClass209_127.method4682();
				Static177.aClass73_6.method1879();
				Static443.aClass227_3.method5575();
				Static36.method908("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static29.method731();
				Static245.method3818();
				Static36.method908("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static21.method609(1, -1, -1, false);
				if (Static374.method5599() != 1) {
					Static36.method908("wm1 failed");
					return;
				}
				Static36.method908("wm1 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static21.method609(2, -1, -1, false);
				if (Static374.method5599() == 2) {
					Static36.method908("wm2 succeeded");
					return;
				}
				Static36.method908("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static21.method609(3, 1024, 768, false);
				if (Static374.method5599() == 3) {
					Static36.method908("wm3 succeeded");
					return;
				}
				Static36.method908("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static436.method6326(0);
				if (Static294.anInt5208 == 0) {
					Static36.method908("Entered tk0");
					Static291.aClass28_Sub1_1.anInt1032 = 0;
					Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
					Static38.aBoolean93 = false;
					return;
				}
				Static36.method908("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static436.method6326(1);
				if (Static294.anInt5208 != 1) {
					Static36.method908("Failed to enter tk1");
					return;
				}
				Static36.method908("Entered tk1");
				Static291.aClass28_Sub1_1.anInt1032 = 1;
				Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
				Static38.aBoolean93 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static436.method6326(2);
				if (Static294.anInt5208 == 2) {
					Static36.method908("Entered tk2");
					Static291.aClass28_Sub1_1.anInt1032 = 2;
					Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
					Static38.aBoolean93 = false;
					return;
				}
				Static36.method908("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static436.method6326(3);
				if (Static294.anInt5208 != 3) {
					Static36.method908("Failed to enter tk3");
					return;
				}
				Static36.method908("Entered tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static291.aClass28_Sub1_1.aBoolean83 = !Static291.aClass28_Sub1_1.aBoolean83;
				Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
				Static38.aBoolean93 = false;
				Static29.method731();
				Static36.method908("ot=" + Static291.aClass28_Sub1_1.aBoolean83);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static291.aClass28_Sub1_1.aBoolean76 = !Static291.aClass28_Sub1_1.aBoolean76;
				Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
				Static38.aBoolean93 = false;
				Static29.method731();
				Static36.method908("gb=" + Static291.aClass28_Sub1_1.aBoolean76);
				return;
			}
			@Pc(547) int local547;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static36.method908("Invalid shadows value");
					return;
				}
				@Pc(537) String local537 = arg1.substring(8);
				local547 = Static57.method1273(local537) ? Static221.method3333(local537) : -1;
				if (local547 >= 0 && local547 <= 2) {
					Static291.aClass28_Sub1_1.anInt1034 = local547;
					Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
					Static38.aBoolean93 = false;
					Static29.method731();
					Static36.method908("shadows=" + local547);
					return;
				}
				Static36.method908("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static36.method908("Invalid buildarea value");
					return;
				}
				local77 = Static221.method3333(arg1.substring(6));
				if (local77 >= 0 && local77 <= Static190.method580(Static270.anInt4876)) {
					Static291.aClass28_Sub1_1.anInt1037 = local77;
					Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
					Static38.aBoolean93 = false;
					Static36.method908("maxbuildarea=" + Static291.aClass28_Sub1_1.anInt1037);
					return;
				}
				Static36.method908("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static36.method908("Invalid particles value");
					return;
				}
				Static88.method4156(Static221.method3333(arg1.substring(13)));
				Static291.aClass28_Sub1_1.method831(Static45.aClass209_127);
				Static38.aBoolean93 = false;
				Static36.method908("particles=" + Static193.method3051());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static36.method908("Invalid rect_debug value");
					return;
				}
				Static69.anInt1815 = Static221.method3333(arg1.substring(10).trim());
				Static36.method908("rect_debug=" + Static69.anInt1815);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static27.aBoolean39 = true;
				Static36.method908("qa_op_test=" + Static27.aBoolean39);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static382.aBoolean280 = !Static382.aBoolean280;
				Static36.method908("clipcomponents=" + Static382.aBoolean280);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(744) boolean local744 = Static126.aClass66_5.method5056();
				if (!Static9.method306(!local744)) {
					Static36.method908("Failed to enable bloom");
					return;
				}
				if (local744) {
					Static36.method908("Bloom disabled");
					return;
				}
				Static36.method908("Bloom enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static421.aBoolean474) {
					Static421.aBoolean474 = true;
					Static36.method908("Forced tweening ENABLED!");
					return;
				}
				Static421.aBoolean474 = false;
				Static36.method908("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static395.aBoolean453) {
					Static36.method908("Shift-click ENABLED!");
					Static395.aBoolean453 = true;
					return;
				}
				Static36.method908("Shift-click disabled.");
				Static395.aBoolean453 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static36.method908("x:" + (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 >> 7) + " z:" + (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static36.method908("Height: " + Static55.aClass86Array1[Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103].method6594(Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202 >> 7, Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static350.aClass100_69.method2510();
				Static350.aClass100_69.method2507();
				Static314.aClass108_4.method2644();
				Static244.aClass169_29.method3947();
				Static245.method3818();
				Static36.method908("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static126.aClass66_5.method5029()) {
					Static36.method908("Current toolkit doesn't support multiple cores");
					return;
				}
				local77 = Integer.parseInt(arg1.substring(3));
				if (local77 < 1) {
					local77 = 1;
				} else if (local77 > 4) {
					local77 = 4;
				}
				Static143.anInt2942 = local77;
				Static126.aClass66_5.method5020(Static143.anInt2942);
				Static126.aClass66_5.method5047(0);
				Static36.method908("Render cores now: " + Static143.anInt2942);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static36.method908("I(s): " + Static125.aClass44_12.method1358() + "/" + Static125.aClass44_12.method1354());
				Static36.method908("I(m): " + Static97.aClass44_7.method1358() + "/" + Static97.aClass44_7.method1354());
				Static36.method908("O(s): " + Static380.aClass231_2.aClass251_1.method6122() + "/" + Static380.aClass231_2.aClass251_1.method6114());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static36.method908("Pos: " + Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 + "," + ((Static157.anInt3220 >> 7) + Static2.anInt6396 >> 6) + "," + (Static348.anInt6273 + (Static229.anInt4187 >> 7) >> 6) + "," + (Static2.anInt6396 + (Static157.anInt3220 >> 7) & 0x3F) + "," + ((Static229.anInt4187 >> 7) + Static348.anInt6273 & 0x3F) + " Height: " + (Static221.method3331(Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103, Static229.anInt4187, Static157.anInt3220) - Static367.anInt6653));
				Static36.method908("Look: " + Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103 + "," + (Static345.anInt6218 + Static2.anInt6396 >> 6) + "," + (Static348.anInt6273 + Static106.anInt2294 >> 6) + "," + (Static345.anInt6218 + Static2.anInt6396 & 0x3F) + "," + (Static348.anInt6273 + Static106.anInt2294 & 0x3F) + " Height: " + (Static221.method3331(Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103, Static106.anInt2294, Static345.anInt6218) - Static159.anInt5733));
				return;
			}
			if (arg1.equals("showocc")) {
				Static68.aBoolean471 = !Static68.aBoolean471;
				Static29.method731();
				Static36.method908("showocc=" + Static68.aBoolean471);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static425.aBoolean362 = !Static425.aBoolean362;
				Static29.method731();
				Static36.method908("forcewallocc=" + Static425.aBoolean362);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static28.aBoolean40 = !Static28.aBoolean40;
				Static126.aClass66_5.method4996(Static28.aBoolean40);
				Static12.method348();
				Static36.method908("showprofiling=" + Static28.aBoolean40);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static36.method908("Java toolkit: " + Static316.method4595(Static45.aClass209_127));
				Static36.method908("GL toolkit:   " + Static316.method4595(Static45.aClass209_127));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static29.aBoolean42 = !Static29.aBoolean42;
				Static36.method908("nonpcs=" + Static29.aBoolean42);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static276.method4168();
				Static36.method908("auto world selected");
				return;
			}
			if (arg1.startsWith("pc")) {
				Static403.method5961(Static426.aClass92_150);
				Static109.aClass6_Sub1_Sub1_5.method6439(0);
				local77 = Static109.aClass6_Sub1_Sub1_5.anInt7898;
				local547 = arg1.indexOf(" ", 4);
				Static109.aClass6_Sub1_Sub1_5.method6448(arg1.substring(3, local547));
				Static268.method4087(arg1.substring(local547), Static109.aClass6_Sub1_Sub1_5);
				Static109.aClass6_Sub1_Sub1_5.method6458(Static109.aClass6_Sub1_Sub1_5.anInt7898 - local77);
				return;
			}
			if (arg1.equals("heap")) {
				Static36.method908("Heap: " + Static270.anInt4876 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static327.method4731();
				Static36.method908("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local77 = 0; local77 < Static331.anIntArray389.length; local77++) {
					if (Static384.aBooleanArray25[local77]) {
						Static331.anIntArray389[local77] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static331.anIntArray389[local77] *= -1;
						}
					}
				}
				Static327.method4731();
				Static36.method908("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static225.aBoolean271 = true;
				Static245.method3818();
				Static36.method908("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static225.aBoolean271 = false;
				Static245.method3818();
				Static36.method908("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static225.method3368();
				Static36.method908("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static36.method908(Static413.method6087() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local77 = Integer.parseInt(arg1.substring(9));
				if (local77 >= 0 && local77 <= 4) {
					Static291.aClass28_Sub1_1.anInt1026 = local77;
				}
				Static36.method908("cpuusage=" + Static291.aClass28_Sub1_1.anInt1026);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local77 = Integer.parseInt(arg1.substring(17));
				Static36.method908("varpbit=" + Static393.aClass207_1.method4635(local77));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local77 = Integer.parseInt(arg1.substring(14));
				Static36.method908("varp=" + Static393.aClass207_1.method4634(local77));
				return;
			}
			if (arg1.startsWith("csprofileclear")) {
				Static166.method2748();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static166.method2747();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static166.method2747();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local77 = Integer.parseInt(arg1.substring(8));
				Static126.aClass66_5.method5026(local77);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static36.method908("Active streams: " + Static360.aClass6_Sub4_Sub4_2.method5909());
				return;
			}
			if (Static217.anInt3941 == 30) {
				Static403.method5961(Static272.aClass92_97);
				Static109.aClass6_Sub1_Sub1_5.method6439(arg1.length() + 2);
				Static109.aClass6_Sub1_Sub1_5.method6439(arg0 ? 1 : 0);
				Static109.aClass6_Sub1_Sub1_5.method6448(arg1);
			}
			if (arg1.startsWith("fps ") && Static136.aClass193_3 != Static170.aClass193_5) {
				Static378.method5646(Static221.method3333(arg1.substring(4)));
				return;
			}
			if (Static217.anInt3941 != 30) {
				Static36.method908("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1602) Exception local1602) {
			Static36.method908("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II[I[JI)V")
	public static void method6284(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg0 + arg3) / 2;
		@Pc(21) int local21 = arg0;
		@Pc(25) long local25 = arg2[local19];
		arg2[local19] = arg2[arg3];
		arg2[arg3] = local25;
		@Pc(39) int local39 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local39;
		@Pc(59) int local59 = ~local25 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg0; local61 < arg3; local61++) {
			if ((long) (local59 & local61) + local25 > arg2[local61]) {
				@Pc(82) long local82 = arg2[local61];
				arg2[local61] = arg2[local21];
				arg2[local21] = local82;
				@Pc(96) int local96 = arg1[local61];
				arg1[local61] = arg1[local21];
				arg1[local21++] = local96;
			}
		}
		arg2[arg3] = arg2[local21];
		arg2[local21] = local25;
		arg1[arg3] = arg1[local21];
		arg1[local21] = local39;
		method6284(arg0, arg1, arg2, local21 - 1);
		method6284(local21 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
	public static void method6285() {
		Static47.aClass66_3.method4998(Static268.aFloat52, Static49.aFloat10, Static350.aFloat87);
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	public static void method6287() {
		if (Static242.anInt4489 != -1) {
			Static46.method1022(-1, -1, Static242.anInt4489, false);
			Static242.anInt4489 = -1;
		}
	}
}
