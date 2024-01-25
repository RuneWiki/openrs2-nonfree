import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
	public static int anInt3509;

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "[I")
	public static final int[] anIntArray288 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "Z")
	public static boolean aBoolean208 = false;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method2939(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static221.aClass176_5 == Static234.aClass176_7 && Static82.anInt1625 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static195.aBoolean209 = true;
				Static391.method5338("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static195.aBoolean209 = false;
				Static391.method5338("fps debug disabled");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static381.anInt5293 = 0;
				Static241.anInt4308 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static129.aClass188_2.method4529();
				Static391.method5338("Text coords cleared");
				return;
			}
			@Pc(67) int local67;
			@Pc(87) int local87;
			@Pc(78) Runtime local78;
			if (arg1.equalsIgnoreCase("gc")) {
				method2943();
				for (local67 = 0; local67 < 10; local67++) {
					System.gc();
				}
				local78 = Runtime.getRuntime();
				local87 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
				Static391.method5338("mem=" + local87 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				method2943();
				for (local67 = 0; local67 < 10; local67++) {
					System.gc();
				}
				local78 = Runtime.getRuntime();
				local87 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
				Static391.method5338("Memory before cleanup=" + local87 + "k");
				Static257.method3778();
				method2943();
				for (@Pc(149) int local149 = 0; local149 < 10; local149++) {
					System.gc();
				}
				local87 = (int) ((local78.totalMemory() - local78.freeMemory()) / 1024L);
				Static391.method5338("Memory after cleanup=" + local87 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static391.method5338("Number of player models in cache:" + Static450.method6019());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static391.method5338("Dropped client connection");
				if (Static151.anInt2579 == 30) {
					Static32.method556();
				} else if (Static151.anInt2579 == 25) {
					Static37.aBoolean24 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static63.aClass94_2.method1911();
				Static391.method5338("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static63.aClass94_2.method1910();
				Static391.method5338("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static119.aClass138_7.method3200();
				Static372.aClass161_6.method3762();
				Static63.aClass94_2.method1915();
				Static391.method5338("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static181.method2788();
				Static209.method6067();
				Static391.method5338("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static267.method3900(-1, false, -1, 1);
				if (Static131.method5612() == 1) {
					Static391.method5338("wm1 succeeded");
					return;
				}
				Static391.method5338("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static267.method3900(-1, false, -1, 2);
				if (Static131.method5612() == 2) {
					Static391.method5338("wm2 succeeded");
					return;
				}
				Static391.method5338("wm2 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static267.method3900(768, false, 1024, 3);
				if (Static131.method5612() == 3) {
					Static391.method5338("wm3 succeeded");
					return;
				}
				Static391.method5338("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static262.method3812(0);
				if (Static285.anInt7839 != 0) {
					Static391.method5338("Failed to enter tk0");
					return;
				}
				Static391.method5338("Entered tk0");
				Static389.aClass128_Sub1_1.anInt3572 = 0;
				Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
				Static373.aBoolean406 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static262.method3812(1);
				if (Static285.anInt7839 != 1) {
					Static391.method5338("Failed to enter tk1");
					return;
				}
				Static391.method5338("Entered tk1");
				Static389.aClass128_Sub1_1.anInt3572 = 1;
				Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
				Static373.aBoolean406 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static262.method3812(2);
				if (Static285.anInt7839 == 2) {
					Static391.method5338("Entered tk2");
					Static389.aClass128_Sub1_1.anInt3572 = 2;
					Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
					Static373.aBoolean406 = false;
					return;
				}
				Static391.method5338("Failed to enter tk2");
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static262.method3812(3);
				if (Static285.anInt7839 == 3) {
					Static391.method5338("Entered tk3");
					return;
				}
				Static391.method5338("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static389.aClass128_Sub1_1.aBoolean242 = !Static389.aClass128_Sub1_1.aBoolean242;
				Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
				Static373.aBoolean406 = false;
				Static181.method2788();
				Static391.method5338("ot=" + Static389.aClass128_Sub1_1.aBoolean242);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static389.aClass128_Sub1_1.aBoolean230 = !Static389.aClass128_Sub1_1.aBoolean230;
				Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
				Static373.aBoolean406 = false;
				Static181.method2788();
				Static391.method5338("gb=" + Static389.aClass128_Sub1_1.aBoolean230);
				return;
			}
			@Pc(534) int local534;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static391.method5338("Invalid shadows value");
					return;
				}
				@Pc(522) String local522 = arg1.substring(8);
				local534 = Static99.method1539(local522) ? Static438.method5871(local522) : -1;
				if (local534 >= 0 && local534 <= 2) {
					Static389.aClass128_Sub1_1.method2974(local534, Static285.anInt7839);
					Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
					Static373.aBoolean406 = false;
					Static181.method2788();
					Static391.method5338("shadows=" + local534);
					return;
				}
				Static391.method5338("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static389.aClass128_Sub1_1.aBoolean245 = !Static389.aClass128_Sub1_1.aBoolean245;
				Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
				Static373.aBoolean406 = false;
				Static91.method1478();
				Static181.method2788();
				Static391.method5338("textures=" + Static389.aClass128_Sub1_1.aBoolean245);
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static391.method5338("Invalid buildarea value");
					return;
				}
				local67 = Static438.method5871(arg1.substring(6));
				if (local67 >= 0 && local67 <= Static245.method3606(Static113.anInt5764)) {
					Static389.aClass128_Sub1_1.anInt3574 = local67;
					Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
					Static373.aBoolean406 = false;
					Static391.method5338("maxbuildarea=" + Static389.aClass128_Sub1_1.anInt3574);
					return;
				}
				Static391.method5338("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static391.method5338("Invalid particles value");
					return;
				}
				Static374.method5136(Static438.method5871(arg1.substring(13)));
				Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
				Static373.aBoolean406 = false;
				Static391.method5338("particles=" + Static14.method305());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static391.method5338("Invalid rect_debug value");
					return;
				}
				Static86.anInt1673 = Static438.method5871(arg1.substring(10).trim());
				Static391.method5338("rect_debug=" + Static86.anInt1673);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static239.aBoolean287 = true;
				Static391.method5338("qa_op_test=" + Static239.aBoolean287);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static205.aBoolean261 = !Static205.aBoolean261;
				Static391.method5338("clipcomponents=" + Static205.aBoolean261);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(765) boolean local765 = Static276.aClass109_10.method4687();
				if (Static326.method4589(!local765)) {
					if (local765) {
						Static391.method5338("Bloom disabled");
						return;
					}
					Static391.method5338("Bloom enabled");
					return;
				}
				Static391.method5338("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static294.aBoolean385) {
					Static294.aBoolean385 = true;
					Static391.method5338("Forced tweening ENABLED!");
					return;
				}
				Static294.aBoolean385 = false;
				Static391.method5338("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static40.aBoolean27) {
					Static391.method5338("Shift-click disabled.");
					Static40.aBoolean27 = false;
					return;
				}
				Static391.method5338("Shift-click ENABLED!");
				Static40.aBoolean27 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static391.method5338("x:" + (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 >> 7) + " z:" + (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static391.method5338("Height: " + Static92.aClass136Array1[Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95].I(Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 >> 7, Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static384.aClass250_76.method5670();
				Static384.aClass250_76.method5676();
				Static231.aClass126_3.method2909();
				Static1.aClass224_1.method5307();
				Static209.method6067();
				Static391.method5338("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (Static276.aClass109_10.method4686()) {
					local67 = Integer.parseInt(arg1.substring(3));
					if (local67 < 1) {
						local67 = 1;
					} else if (local67 > 4) {
						local67 = 4;
					}
					Static262.anInt4646 = local67;
					Static276.aClass109_10.method4717(Static262.anInt4646);
					Static276.aClass109_10.method4725(0);
					Static391.method5338("Render cores now: " + Static262.anInt4646);
					return;
				}
				Static391.method5338("Current toolkit doesn't support multiple cores");
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static391.method5338("I(s): " + Static191.aClass83_30.method1672() + "/" + Static191.aClass83_30.method1673());
				Static391.method5338("I(m): " + Static361.aClass83_52.method1672() + "/" + Static361.aClass83_52.method1673());
				Static391.method5338("O(s): " + Static196.aClass139_1.aClass117_1.method2725() + "/" + Static196.aClass139_1.aClass117_1.method2727());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static391.method5338("Pos: " + Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 + "," + ((Static306.anInt5497 >> 7) + Static437.anInt7555 >> 6) + "," + (Static134.anInt5502 + (Static402.anInt6941 >> 7) >> 6) + "," + (Static437.anInt7555 + (Static306.anInt5497 >> 7) & 0x3F) + "," + ((Static402.anInt6941 >> 7) + Static134.anInt5502 & 0x3F) + " Height: " + (Static289.method4078(Static306.anInt5497, Static402.anInt6941, Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95) - Static254.anInt4567));
				Static391.method5338("Look: " + Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95 + "," + (Static437.anInt7555 + Static307.anInt5523 >> 6) + "," + (Static282.anInt4980 + Static134.anInt5502 >> 6) + "," + (Static437.anInt7555 + Static307.anInt5523 & 0x3F) + "," + (Static282.anInt4980 + Static134.anInt5502 & 0x3F) + " Height: " + (Static289.method4078(Static307.anInt5523, Static282.anInt4980, Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95) - Static86.anInt1676));
				return;
			}
			if (arg1.equals("showocc")) {
				Static403.aBoolean450 = !Static403.aBoolean450;
				Static181.method2788();
				Static391.method5338("showocc=" + Static403.aBoolean450);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static350.aBoolean388 = !Static350.aBoolean388;
				Static181.method2788();
				Static391.method5338("forcewallocc=" + Static350.aBoolean388);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static197.aBoolean250 = !Static197.aBoolean250;
				Static276.aClass109_10.method4698(Static197.aBoolean250);
				Static52.method873();
				Static391.method5338("showprofiling=" + Static197.aBoolean250);
				return;
			}
			if (arg1.equals("performancetest")) {
				Static391.method5338("Java toolkit: " + Static199.method3018(Static119.aClass138_7));
				Static391.method5338("GL toolkit:   " + Static199.method3018(Static119.aClass138_7));
				Static391.method5338("SSE toolkit:  " + Static199.method3018(Static119.aClass138_7));
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static282.aBoolean331 = !Static282.aBoolean331;
				Static391.method5338("nonpcs=" + Static282.aBoolean331);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static401.method5866();
				Static391.method5338("auto world selected");
				return;
			}
			if (arg1.startsWith("pc")) {
				Static55.method989(Static261.aClass131_192);
				Static232.aClass1_Sub1_Sub1_2.method4115(0);
				local67 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
				local534 = arg1.indexOf(" ", 4);
				Static232.aClass1_Sub1_Sub1_2.method4104(arg1.substring(3, local534));
				Static438.method5867(arg1.substring(local534), Static232.aClass1_Sub1_Sub1_2);
				Static232.aClass1_Sub1_Sub1_2.method4138(Static232.aClass1_Sub1_Sub1_2.anInt5056 - local67);
				return;
			}
			if (arg1.equals("heap")) {
				Static391.method5338("Heap: " + Static113.anInt5764 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static86.method1449();
				Static391.method5338("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local67 = 0; local67 < Static77.anIntArray142.length; local67++) {
					if (Static318.aBooleanArray18[local67]) {
						Static77.anIntArray142[local67] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static77.anIntArray142[local67] *= -1;
						}
					}
				}
				Static86.method1449();
				Static391.method5338("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static26.aBoolean264 = true;
				Static209.method6067();
				Static391.method5338("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static26.aBoolean264 = false;
				Static209.method6067();
				Static391.method5338("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static95.method1501();
				Static391.method5338("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static391.method5338(Static390.method5319() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local67 = Integer.parseInt(arg1.substring(9));
				if (local67 >= 0 && local67 <= 4) {
					Static389.aClass128_Sub1_1.anInt3563 = local67;
				}
				Static391.method5338("cpuusage=" + Static389.aClass128_Sub1_1.anInt3563);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local67 = Integer.parseInt(arg1.substring(17));
				Static391.method5338("varpbit=" + Static51.aClass79_1.method1571(local67));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local67 = Integer.parseInt(arg1.substring(14));
				Static391.method5338("varp=" + Static51.aClass79_1.method1570(local67));
				return;
			}
			if (arg1.startsWith("csprofileclear")) {
				Static104.method1596();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static104.method1605();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static104.method1605();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local67 = Integer.parseInt(arg1.substring(8));
				Static276.aClass109_10.method4679(local67);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static391.method5338("Active streams: " + Static38.aClass1_Sub7_Sub1_1.method3978());
				return;
			}
			if (Static151.anInt2579 == 30) {
				Static55.method989(Static155.aClass131_82);
				Static232.aClass1_Sub1_Sub1_2.method4115(arg1.length() + 2);
				Static232.aClass1_Sub1_Sub1_2.method4115(arg0 ? 1 : 0);
				Static232.aClass1_Sub1_Sub1_2.method4104(arg1);
			}
			if (arg1.startsWith("fps ") && Static234.aClass176_7 != Static221.aClass176_5) {
				Static88.method1471(Static438.method5871(arg1.substring(4)));
				return;
			}
			if (Static151.anInt2579 != 30) {
				Static391.method5338("Unrecogonised commmand when not logged in: " + arg1);
			}
		} catch (@Pc(1631) Exception local1631) {
			Static391.method5338("Whoops, something went wrong.");
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
	public static void method2942() {
		Static397.aClass63_1.method5557();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static106.aLongArray3[local10] = 0L;
		}
		for (@Pc(29) int local29 = 0; local29 < 32; local29++) {
			Static325.aLongArray7[local29] = 0L;
		}
		Static359.anInt6114 = 0;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
	private static void method2943() {
		Static35.aClass47_3.method1140();
		Static234.aClass107_3.method2351();
		Static46.aClass233_1.method5375();
		Static71.aClass105_6.method2339();
		Static322.aClass187_2.method4498();
		Static196.aClass139_1.method3227();
		Static191.aClass28_1.method574();
		Static168.aClass115_2.method2715();
		Static111.aClass170_1.method3950();
		Static80.aClass258_1.method5790();
		Static14.aClass193_1.method4646();
		Static231.aClass126_3.method2906();
		Static1.aClass224_1.method5305();
		Static105.aClass251_1.method5678();
		Static228.aClass243_2.method5555();
		Static141.aClass168_1.method3942();
		Static199.aClass134_1.method3025();
		Static445.aClass8_1.method236();
		Static199.aClass106_2.method2347();
		Static446.aClass89_1.method1811();
		Static37.method646();
		Static48.method818();
		Static342.method4806();
		Static257.method3780();
		Static387.aClass83_54.method1667();
		Static63.aClass83_9.method1667();
		Static358.aClass83_51.method1667();
		Static97.aClass83_15.method1667();
		Static104.aClass83_16.method1667();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)I")
	public static int method2946(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
