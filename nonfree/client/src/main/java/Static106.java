import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!es", name = "h", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_123 = new Class198("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!id;)V")
	public static void method5678(@OriginalArg(0) Class111 arg0) {
		if (Static70.anInt1276 >= 65535) {
			return;
		}
		@Pc(6) Class5_Sub19 local6 = arg0.aClass5_Sub19_2;
		Static68.aClass111Array1[Static70.anInt1276] = arg0;
		Static381.aBooleanArray14[Static70.anInt1276] = false;
		Static70.anInt1276++;
		@Pc(21) int local21 = arg0.anInt2911;
		if (arg0.aBoolean183) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt2911;
		if (arg0.aBoolean184) {
			local29 = Static96.anInt1667 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method4979() + Static301.anInt4709 - local6.method4982() >> Static419.anInt6980;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method4979() + local6.method4982() - Static301.anInt4709 >> Static419.anInt6980;
			if (local73 >= Static459.anInt4775) {
				local73 = Static459.anInt4775 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray33[local41++];
				@Pc(105) int local105 = (local6.method4977() + Static301.anInt4709 - local6.method4982() >> Static419.anInt6980) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static439.anInt7318) {
					local113 = Static439.anInt7318 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static76.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static76.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static70.anInt1276;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static76.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static70.anInt1276 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static76.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static70.anInt1276 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static76.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static70.anInt1276 << 48;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(I)Lclient!vo;")
	public static Class213 method5679() {
		try {
			return (Class213) Class.forName("Class213_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(18) Throwable local18) {
			return null;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!fw;")
	public static RuntimeException_Sub1 method5681(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString21 = local12.aString21 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZBLjava/lang/String;Z)V")
	public static void method5682(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (Static289.aClass170_8 == Static350.aClass170_10 && Static189.anInt3178 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg1.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static9.aBoolean30 = true;
				Static143.method2070("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static9.aBoolean30 = false;
				Static143.method2070("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static143.method2070("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(85) Throwable local85) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static36.anInt723 = 0;
				Static193.anInt3219 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static107.aClass107_4.method2329();
				Static143.method2070("Text coords cleared");
				return;
			}
			@Pc(135) int local135;
			@Pc(114) int local114;
			@Pc(125) Runtime local125;
			if (arg1.equalsIgnoreCase("gc")) {
				Static326.method4002();
				for (local114 = 0; local114 < 10; local114++) {
					System.gc();
				}
				local125 = Runtime.getRuntime();
				local135 = (int) ((local125.totalMemory() - local125.freeMemory()) / 1024L);
				Static143.method2070("mem=" + local135 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static326.method4002();
				for (local114 = 0; local114 < 10; local114++) {
					System.gc();
				}
				local125 = Runtime.getRuntime();
				local135 = (int) ((local125.totalMemory() - local125.freeMemory()) / 1024L);
				Static143.method2070("Memory before cleanup=" + local135 + "k");
				Static439.method5798();
				Static326.method4002();
				for (@Pc(198) int local198 = 0; local198 < 10; local198++) {
					System.gc();
				}
				local135 = (int) ((local125.totalMemory() - local125.freeMemory()) / 1024L);
				Static143.method2070("Memory after cleanup=" + local135 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static143.method2070("Number of player models in cache:" + Static223.method2946());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static143.method2070("Dropped client connection");
				if (Static376.anInt6324 == 9) {
					Static152.method2174();
				} else if (Static376.anInt6324 == 10) {
					Static419.aBoolean470 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static247.aClass87_2.method1864();
				Static143.method2070("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static247.aClass87_2.method1874();
				Static143.method2070("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static7.aClass93_1.method2095();
				Static14.aClass99_2.method4960();
				Static247.aClass87_2.method1876();
				Static143.method2070("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static338.method4373();
				Static157.method2216();
				Static143.method2070("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static449.method5909(1, false, -1, -1);
				if (Static213.method2819() == 1) {
					Static143.method2070("wm1 succeeded");
					return;
				}
				Static143.method2070("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static449.method5909(2, false, -1, -1);
				if (Static213.method2819() != 2) {
					Static143.method2070("wm2 failed");
					return;
				}
				Static143.method2070("wm2 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static449.method5909(3, false, 1024, 768);
				if (Static213.method2819() != 3) {
					Static143.method2070("wm3 failed");
					return;
				}
				Static143.method2070("wm3 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static243.method3143(0);
				if (Static146.anInt2644 == 0) {
					Static143.method2070("Entered tk0");
					Static216.aClass1_Sub1_1.anInt4514 = 0;
					Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
					Static81.aBoolean103 = false;
					return;
				}
				Static143.method2070("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static243.method3143(1);
				if (Static146.anInt2644 == 1) {
					Static143.method2070("Entered tk1");
					Static216.aClass1_Sub1_1.anInt4514 = 1;
					Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
					Static81.aBoolean103 = false;
					return;
				}
				Static143.method2070("Failed to enter tk1");
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static243.method3143(2);
				if (Static146.anInt2644 != 2) {
					Static143.method2070("Failed to enter tk2");
					return;
				}
				Static143.method2070("Entered tk2");
				Static216.aClass1_Sub1_1.anInt4514 = 2;
				Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
				Static81.aBoolean103 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static243.method3143(3);
				if (Static146.anInt2644 == 3) {
					Static143.method2070("Entered tk3");
					return;
				}
				Static143.method2070("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static216.aClass1_Sub1_1.aBoolean311 = !Static216.aClass1_Sub1_1.aBoolean311;
				Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
				Static81.aBoolean103 = false;
				Static338.method4373();
				Static143.method2070("ot=" + Static216.aClass1_Sub1_1.aBoolean311);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static216.aClass1_Sub1_1.aBoolean302 = !Static216.aClass1_Sub1_1.aBoolean302;
				Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
				Static81.aBoolean103 = false;
				Static338.method4373();
				Static143.method2070("gb=" + Static216.aClass1_Sub1_1.aBoolean302);
				return;
			}
			@Pc(586) int local586;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static143.method2070("Invalid shadows value");
					return;
				}
				@Pc(572) String local572 = arg1.substring(8);
				local586 = Static172.method2975(local572) ? Static311.method3824(local572) : -1;
				if (local586 >= 0 && local586 <= 2) {
					Static216.aClass1_Sub1_1.method3581(Static146.anInt2644, local586);
					Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
					Static81.aBoolean103 = false;
					Static338.method4373();
					Static143.method2070("shadows=" + local586);
					return;
				}
				Static143.method2070("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static216.aClass1_Sub1_1.aBoolean312 = !Static216.aClass1_Sub1_1.aBoolean312;
				Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
				Static81.aBoolean103 = false;
				Static287.method3551();
				Static338.method4373();
				Static143.method2070("textures=" + Static216.aClass1_Sub1_1.aBoolean312);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static143.method2070("Invalid buildarea value");
					return;
				}
				local114 = Static311.method3824(arg1.substring(6));
				if (local114 >= 0 && local114 <= Static163.method2301(Static102.anInt1724)) {
					Static216.aClass1_Sub1_1.anInt4510 = local114;
					Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
					Static81.aBoolean103 = false;
					Static143.method2070("maxbuildarea=" + Static216.aClass1_Sub1_1.anInt4510);
					return;
				}
				Static143.method2070("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static143.method2070("Invalid particles value");
					return;
				}
				Static353.method4571(Static311.method3824(arg1.substring(13)));
				Static216.aClass1_Sub1_1.method3593(Static7.aClass93_1);
				Static81.aBoolean103 = false;
				Static143.method2070("particles=" + Static163.method2299());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static143.method2070("Invalid rect_debug value");
					return;
				}
				Static342.anInt5602 = Static311.method3824(arg1.substring(10).trim());
				Static143.method2070("rect_debug=" + Static342.anInt5602);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static97.aBoolean113 = true;
				Static143.method2070("qa_op_test=" + Static97.aBoolean113);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static103.aBoolean119 = !Static103.aBoolean119;
				Static143.method2070("clipcomponents=" + Static103.aBoolean119);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(824) boolean local824 = Static407.aClass200_9.method5839();
				if (Static13.method253(!local824)) {
					if (!local824) {
						Static143.method2070("Bloom enabled");
						return;
					}
					Static143.method2070("Bloom disabled");
					return;
				}
				Static143.method2070("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static17.aBoolean33) {
					Static17.aBoolean33 = true;
					Static143.method2070("Forced tweening ENABLED!");
					return;
				}
				Static17.aBoolean33 = false;
				Static143.method2070("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (!Static2.aBoolean506) {
					Static143.method2070("Shift-click ENABLED!");
					Static2.aBoolean506 = true;
					return;
				}
				Static143.method2070("Shift-click disabled.");
				Static2.aBoolean506 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static143.method2070("x:" + (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 >> 7) + " z:" + (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static143.method2070("Height: " + Static410.aClass125Array3[Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105].ua(Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 >> 7, Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static344.aClass243_196.method5451();
				Static344.aClass243_196.method5452();
				Static203.aClass51_4.method1142();
				Static404.aClass28_4.method671();
				Static157.method2216();
				Static143.method2070("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static407.aClass200_9.method5873()) {
					local114 = Integer.parseInt(arg1.substring(3));
					if (local114 < 1) {
						local114 = 1;
					} else if (local114 > 4) {
						local114 = 4;
					}
					Static60.anInt1114 = local114;
					Static407.aClass200_9.method5845(Static60.anInt1114);
					Static407.aClass200_9.method5838(0);
					Static143.method2070("Render cores now: " + Static60.anInt1114);
					return;
				}
				Static143.method2070("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static143.method2070("I(s): " + Static400.aClass44_65.method1034() + "/" + Static400.aClass44_65.method1027());
				Static143.method2070("I(m): " + Static222.aClass44_33.method1034() + "/" + Static222.aClass44_33.method1027());
				Static143.method2070("O(s): " + Static306.aClass67_3.aClass36_1.method943() + "/" + Static306.aClass67_3.aClass36_1.method944());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static143.method2070("Pos: " + Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 + "," + ((Static116.anInt1977 >> 7) + Static31.anInt618 >> 6) + "," + (Static226.anInt3768 + (Static393.anInt4184 >> 7) >> 6) + "," + ((Static116.anInt1977 >> 7) + Static31.anInt618 & 0x3F) + "," + ((Static393.anInt4184 >> 7) + Static226.anInt3768 & 0x3F) + " Height: " + (Static192.method2572(Static393.anInt4184, Static116.anInt1977, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105) - Static444.anInt7360));
				Static143.method2070("Look: " + Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105 + "," + (Static6.anInt110 + Static31.anInt618 >> 6) + "," + (Static118.anInt2132 + Static226.anInt3768 >> 6) + "," + (Static31.anInt618 + Static6.anInt110 & 0x3F) + "," + (Static226.anInt3768 + Static118.anInt2132 & 0x3F) + " Height: " + (Static192.method2572(Static118.anInt2132, Static6.anInt110, Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105) - Static230.anInt7236));
				return;
			}
			if (arg1.equals("showocc")) {
				Static257.aBoolean275 = !Static257.aBoolean275;
				Static338.method4373();
				Static143.method2070("showocc=" + Static257.aBoolean275);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static272.aBoolean284 = !Static272.aBoolean284;
				Static338.method4373();
				Static143.method2070("forcewallocc=" + Static272.aBoolean284);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static179.aBoolean200 = !Static179.aBoolean200;
				Static407.aClass200_9.method5863(Static179.aBoolean200);
				Static270.method3404();
				Static143.method2070("showprofiling=" + Static179.aBoolean200);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static143.method2070("Java toolkit: " + Static338.method4374(Static7.aClass93_1));
				Static143.method2070("GL toolkit:   " + Static338.method4374(Static7.aClass93_1));
				Static143.method2070("SSE toolkit:  " + Static338.method4374(Static7.aClass93_1));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static130.aBoolean158 = !Static130.aBoolean158;
				Static143.method2070("nonpcs=" + Static130.aBoolean158);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static374.method4920();
				Static143.method2070("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local114 = Integer.parseInt(arg1.substring(12));
				Static74.method1085(Static343.method4462(local114).aString6, local114);
				Static143.method2070("switched");
				return;
			}
			if (arg1.equals("getworld")) {
				Static143.method2070("w: " + Static239.aClass165_7.anInt4240);
				return;
			}
			if (arg1.startsWith("pc")) {
				Static288.method3576(Static115.aClass194_27);
				Static281.aClass5_Sub15_Sub2_13.method5583(0);
				local114 = Static281.aClass5_Sub15_Sub2_13.anInt7013;
				local586 = arg1.indexOf(" ", 4);
				Static281.aClass5_Sub15_Sub2_13.method5545(arg1.substring(3, local586));
				Static401.method1728(Static281.aClass5_Sub15_Sub2_13, arg1.substring(local586));
				Static281.aClass5_Sub15_Sub2_13.method5556(Static281.aClass5_Sub15_Sub2_13.anInt7013 - local114);
				return;
			}
			if (arg1.equals("heap")) {
				Static143.method2070("Heap: " + Static102.anInt1724 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static299.method3711();
				Static143.method2070("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local114 = 0; local114 < Static174.anIntArray171.length; local114++) {
					if (Static14.aBooleanArray2[local114]) {
						Static174.anIntArray171[local114] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static174.anIntArray171[local114] *= -1;
						}
					}
				}
				Static299.method3711();
				Static143.method2070("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static86.aBoolean104 = true;
				Static157.method2216();
				Static143.method2070("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static86.aBoolean104 = false;
				Static157.method2216();
				Static143.method2070("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static159.method2247();
				Static143.method2070("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static143.method2070(Static161.method2281() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local114 = Integer.parseInt(arg1.substring(9));
				if (local114 >= 0 && local114 <= 4) {
					Static216.aClass1_Sub1_1.anInt4502 = local114;
				}
				Static143.method2070("cpuusage=" + Static216.aClass1_Sub1_1.anInt4502);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local114 = Integer.parseInt(arg1.substring(17));
				Static143.method2070("varpbit=" + Static408.aClass39_1.method959(local114));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local114 = Integer.parseInt(arg1.substring(14));
				Static143.method2070("varp=" + Static408.aClass39_1.method958(local114));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static277.method3452(false, 0);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static277.method3452(true, 0);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1658) String[] local1658 = Static73.method1083(' ', arg1.substring(12));
				if (local1658.length >= 2) {
					local586 = local1658.length <= 2 ? 0 : Integer.parseInt(local1658[2]);
					Static253.method3242(local1658[1], local1658[0], local586);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static181.method2473();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static181.method2480();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static181.method2480();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local114 = Integer.parseInt(arg1.substring(8));
				Static407.aClass200_9.method5884(local114);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static143.method2070("Active streams: " + Static119.aClass5_Sub22_Sub3_3.method3635());
				return;
			}
			if (arg1.equals("errormessage")) {
				Static143.method2070(Static440.aClient1.method878());
				return;
			}
			if (Static376.anInt6324 == 9) {
				Static288.method3576(Static96.aClass194_22);
				Static281.aClass5_Sub15_Sub2_13.method5583(arg1.length() + 3);
				Static281.aClass5_Sub15_Sub2_13.method5583(arg0 ? 1 : 0);
				Static281.aClass5_Sub15_Sub2_13.method5583(arg2 ? 1 : 0);
				Static281.aClass5_Sub15_Sub2_13.method5545(arg1);
			}
			if (arg1.startsWith("fps ") && Static350.aClass170_10 != Static289.aClass170_8) {
				Static42.method666(Static311.method3824(arg1.substring(4)));
				return;
			}
			if (Static376.anInt6324 != 9) {
				Static143.method2070("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(1821) Exception local1821) {
			Static143.method2070("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
	public static void method5683() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static433.anInt7210; local9++) {
			for (@Pc(20) int local20 = 0; local20 < Static418.anInt6969; local20++) {
				if (Static53.method831(local20, true, Static319.aClass258ArrayArrayArray3, local9, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5684(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static138.anInt2465++;
		Static272.anInt4295 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static252.anInt4106; local7 < Static96.anInt1667; local7++) {
			@Pc(12) Class258[][] local12 = Static319.aClass258ArrayArrayArray3[local7];
			for (local14 = Static415.anInt6927; local14 < Static150.anInt2696; local14++) {
				for (@Pc(17) int local17 = Static401.anInt2163; local17 < Static182.anInt3095; local17++) {
					@Pc(24) Class258 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static309.aBooleanArrayArray6[local14 + Static70.anInt1271 - Static448.anInt7370][local17 + Static70.anInt1271 - Static17.anInt369] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean489 = true;
							local24.aBoolean491 = true;
							if (local24.aClass122_3 == null) {
								local24.aBoolean490 = false;
							} else {
								local24.aBoolean490 = true;
							}
							Static272.anInt4295++;
						} else {
							local24.aBoolean489 = false;
							local24.aBoolean491 = false;
							local24.aByte99 = 0;
							if (local14 >= Static448.anInt7370 - 16 && local14 <= Static448.anInt7370 + 16 && local17 >= Static17.anInt369 - 16 && local17 <= Static17.anInt369 + 16 && (local24.aClass2_Sub4_2 != null || local24.aClass2_Sub4_3 != null || local24.aClass2_Sub2_2 != null || local24.aClass2_Sub2_3 != null || local24.aClass2_Sub3_2 != null || local24.aClass122_3 != null)) {
								Static449.aClass77_1.method2848(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static408.aClass125Array2 == Static410.aClass125Array3;
		for (local14 = Static252.anInt4106; local14 < Static96.anInt1667; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static293.aClass200_5.method5832() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static309.aBooleanArrayArray6.length;
				if (Static415.anInt6927 + Static309.aBooleanArrayArray6.length > Static439.anInt7318) {
					local172 -= Static415.anInt6927 + Static309.aBooleanArrayArray6.length - Static439.anInt7318;
				}
				@Pc(192) int local192 = Static309.aBooleanArrayArray6[0].length;
				if (Static401.anInt2163 + Static309.aBooleanArrayArray6[0].length > Static459.anInt4775) {
					local192 -= Static401.anInt2163 + Static309.aBooleanArrayArray6[0].length - Static459.anInt4775;
				}
				@Pc(213) int local213 = Static462.anInt7543;
				while (true) {
					if (local213 >= local172) {
						Static449.aClass77_1.method2853(Static410.aClass125Array3[local14], local14, true, local161);
						break;
					}
					@Pc(220) int local220 = local213 + Static415.anInt6927 - Static462.anInt7543;
					for (@Pc(222) int local222 = Static203.anInt3353; local222 < local192; local222++) {
						Static37.aBooleanArrayArray1[local213][local222] = false;
						if (Static309.aBooleanArrayArray6[local213][local222]) {
							@Pc(241) int local241 = local222 + Static401.anInt2163 - Static203.anInt3353;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static319.aClass258ArrayArrayArray3[local243][local220][local241] != null && Static319.aClass258ArrayArrayArray3[local243][local220][local241].aByte98 == local14) {
									Static37.aBooleanArrayArray1[local213][local222] = Static319.aClass258ArrayArrayArray3[local243][local220][local241].aBoolean489;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static449.aClass77_1.method2853(Static410.aClass125Array3[local14], local14, false, local161);
			}
			Static449.aClass77_1.method2849();
		}
		if (!Static185.method2532(true)) {
			Static185.method2532(false);
		}
	}
}
