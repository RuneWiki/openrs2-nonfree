import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!mca", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!mca", name = "w", descriptor = "Lclient!mt;")
	public static final Class199 aClass199_10 = new Class199("WTWIP", 3);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IZLjava/lang/String;Z)V")
	public static void method4962(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (Static363.aClass199_14 == Static359.aClass199_13 && Static351.anInt6430 < 2) {
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
				Static184.aBoolean244 = true;
				Static327.method5346("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static184.aBoolean244 = false;
				Static327.method5346("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static327.method5346("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(77) Throwable local77) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static57.anInt1566 = 0;
				Static35.anInt1296 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static368.aClass145_7.method3920();
				Static327.method5346("Text coords cleared");
				return;
			}
			@Pc(106) int local106;
			@Pc(123) int local123;
			@Pc(114) Runtime local114;
			if (arg1.equalsIgnoreCase("gc")) {
				Static393.method5917();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local114 = Runtime.getRuntime();
				local123 = (int) ((local114.totalMemory() - local114.freeMemory()) / 1024L);
				Static327.method5346("mem=" + local123 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static393.method5917();
				for (local106 = 0; local106 < 10; local106++) {
					System.gc();
				}
				local114 = Runtime.getRuntime();
				local123 = (int) ((local114.totalMemory() - local114.freeMemory()) / 1024L);
				Static327.method5346("Memory before cleanup=" + local123 + "k");
				Static13.method709();
				Static393.method5917();
				for (@Pc(177) int local177 = 0; local177 < 10; local177++) {
					System.gc();
				}
				local123 = (int) ((local114.totalMemory() - local114.freeMemory()) / 1024L);
				Static327.method5346("Memory after cleanup=" + local123 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("unloadnatives")) {
				Static327.method5346(Static325.method5489() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static327.method5346("Number of player models in cache:" + Static376.method5717());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static327.method5346("Dropped client connection");
				if (Static51.anInt7926 == 9) {
					Static317.method5198();
				} else if (Static51.anInt7926 == 10) {
					Static5.aBoolean5 = true;
					return;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static181.aClass115_2.method3364();
				Static327.method5346("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static181.aClass115_2.method3366();
				Static327.method5346("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static91.aClass182_2.method4817();
				Static453.aClass154_1.method4017();
				Static181.aClass115_2.method3356();
				Static327.method5346("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static215.method3855();
				Static540.method7892();
				Static327.method5346("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static63.method1764(false, 1, -1, -1);
				if (Static155.method3122() == 1) {
					Static327.method5346("wm1 succeeded");
					return;
				}
				Static327.method5346("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static63.method1764(false, 2, -1, -1);
				if (Static155.method3122() != 2) {
					Static327.method5346("wm2 failed");
					return;
				}
				Static327.method5346("wm2 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static63.method1764(false, 3, 1024, 768);
				if (Static155.method3122() == 3) {
					Static327.method5346("wm3 succeeded");
					return;
				}
				Static327.method5346("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static508.method7307(0);
				if (Static526.anInt8926 == 0) {
					Static327.method5346("Entered tk0");
					Static89.aClass1_Sub28_Sub1_1.anInt4912 = 0;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				Static327.method5346("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static508.method7307(1);
				if (Static526.anInt8926 == 1) {
					Static327.method5346("Entered tk1");
					Static89.aClass1_Sub28_Sub1_1.anInt4912 = 1;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				Static327.method5346("Failed to enter tk1");
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static508.method7307(2);
				if (Static526.anInt8926 != 2) {
					Static327.method5346("Failed to enter tk2");
					return;
				}
				Static327.method5346("Entered tk2");
				Static89.aClass1_Sub28_Sub1_1.anInt4912 = 2;
				Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
				Static521.aBoolean614 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static508.method7307(3);
				if (Static526.anInt8926 == 3) {
					Static327.method5346("Entered tk3");
					Static89.aClass1_Sub28_Sub1_1.anInt4912 = 3;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				Static327.method5346("Failed to enter tk3");
				return;
			}
			if (arg1.equalsIgnoreCase("tk4")) {
				Static508.method7307(4);
				if (Static526.anInt8926 != 4) {
					Static327.method5346("Failed to enter tk4");
					return;
				}
				Static327.method5346("Entered tk4");
				Static89.aClass1_Sub28_Sub1_1.anInt4912 = 4;
				Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
				Static521.aBoolean614 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk5")) {
				Static508.method7307(5);
				if (Static526.anInt8926 != 5) {
					Static327.method5346("Failed to enter tk5");
					return;
				}
				Static327.method5346("Entered tk5");
				Static89.aClass1_Sub28_Sub1_1.anInt4912 = 5;
				Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
				Static521.aBoolean614 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static89.aClass1_Sub28_Sub1_1.aBoolean322 = !Static89.aClass1_Sub28_Sub1_1.aBoolean322;
				Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
				Static521.aBoolean614 = false;
				Static215.method3855();
				Static327.method5346("ot=" + Static89.aClass1_Sub28_Sub1_1.aBoolean322);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static89.aClass1_Sub28_Sub1_1.aBoolean325 = !Static89.aClass1_Sub28_Sub1_1.aBoolean325;
				Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
				Static521.aBoolean614 = false;
				Static215.method3855();
				Static327.method5346("gb=" + Static89.aClass1_Sub28_Sub1_1.aBoolean325);
				return;
			}
			@Pc(657) int local657;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static327.method5346("Invalid shadows value");
					return;
				}
				@Pc(645) String local645 = arg1.substring(8);
				local657 = Static138.method7942(local645) ? Static485.method7022(local645) : -1;
				if (local657 >= 0 && local657 <= 2) {
					Static89.aClass1_Sub28_Sub1_1.method4259(local657, Static526.anInt8926);
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					Static215.method3855();
					Static327.method5346("shadows=" + local657);
					return;
				}
				Static327.method5346("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static89.aClass1_Sub28_Sub1_1.aBoolean323 = !Static89.aClass1_Sub28_Sub1_1.aBoolean323;
				Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
				Static521.aBoolean614 = false;
				Static418.method6218();
				Static215.method3855();
				Static327.method5346("textures=" + Static89.aClass1_Sub28_Sub1_1.aBoolean323);
				return;
			}
			if (arg1.startsWith("lighting")) {
				Static89.aClass1_Sub28_Sub1_1.method4258(Static526.anInt8926, !Static89.aClass1_Sub28_Sub1_1.method4260(Static526.anInt8926));
				Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
				Static521.aBoolean614 = false;
				Static157.method3127();
				Static418.method6218();
				Static215.method3855();
				Static327.method5346("lighting=" + Static89.aClass1_Sub28_Sub1_1.method4260(Static526.anInt8926));
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static327.method5346("Invalid buildarea value");
					return;
				}
				local106 = Static485.method7022(arg1.substring(6));
				if (local106 >= 0 && Static309.method5133(Static318.anInt6040) >= local106) {
					Static89.aClass1_Sub28_Sub1_1.anInt4905 = local106;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					Static327.method5346("maxbuildarea=" + Static89.aClass1_Sub28_Sub1_1.anInt4905);
					return;
				}
				Static327.method5346("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static327.method5346("Invalid particles value");
					return;
				}
				Static438.method2402(Static485.method7022(arg1.substring(13)));
				Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
				Static521.aBoolean614 = false;
				Static327.method5346("particles=" + Static182.method3492());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static327.method5346("Invalid rect_debug value");
					return;
				}
				Static457.anInt7684 = Static485.method7022(arg1.substring(10).trim());
				Static327.method5346("rect_debug=" + Static457.anInt7684);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static192.aBoolean246 = true;
				Static327.method5346("qa_op_test=" + Static192.aBoolean246);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static17.aBoolean60 = !Static17.aBoolean60;
				Static327.method5346("clipcomponents=" + Static17.aBoolean60);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(936) boolean local936 = Static478.aClass9_10.method7591();
				if (!Static138.method7943(!local936)) {
					Static327.method5346("Failed to enable bloom");
					return;
				}
				if (local936) {
					Static327.method5346("Bloom disabled");
					return;
				}
				Static327.method5346("Bloom enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static306.aBoolean405) {
					Static306.aBoolean405 = false;
					Static327.method5346("Forced tweening disabled.");
					return;
				}
				Static306.aBoolean405 = true;
				Static327.method5346("Forced tweening ENABLED!");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static179.aBoolean243) {
					Static327.method5346("Shift-click disabled.");
					Static179.aBoolean243 = false;
					return;
				}
				Static327.method5346("Shift-click ENABLED!");
				Static179.aBoolean243 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static327.method5346("x:" + (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 >> 7) + " z:" + (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static327.method5346("Height: " + Static290.aClass10Array7[Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94].ba(Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 >> 7, Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static390.aClass160_80.method4204();
				Static390.aClass160_80.method4201();
				Static198.aClass165_3.method4291();
				Static167.aClass250_4.method6148();
				Static540.method7892();
				Static327.method5346("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static478.aClass9_10.method7605()) {
					Static327.method5346("Current toolkit doesn't support multiple cores");
					return;
				}
				local106 = Integer.parseInt(arg1.substring(3));
				if (local106 < 1) {
					local106 = 1;
				} else if (local106 > 4) {
					local106 = 4;
				}
				Static442.anInt7959 = local106;
				Static478.aClass9_10.method7643(Static442.anInt7959);
				Static478.aClass9_10.method7596(0);
				Static327.method5346("Render cores now: " + Static442.anInt7959);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static327.method5346("I(s): " + Static262.aClass316_33.method7804() + "/" + Static262.aClass316_33.method7797());
				Static327.method5346("I(m): " + Static216.aClass316_28.method7804() + "/" + Static216.aClass316_28.method7797());
				Static327.method5346("O(s): " + Static454.aClass153_2.aClass314_1.method7507() + "/" + Static454.aClass153_2.aClass314_1.method7506());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static327.method5346("Pos: " + Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 + "," + (Static324.anInt6132 + (Static308.anInt5918 >> 7) >> 6) + "," + (Static517.anInt8716 + (Static347.anInt6404 >> 7) >> 6) + "," + (Static324.anInt6132 + (Static308.anInt5918 >> 7) & 0x3F) + "," + ((Static347.anInt6404 >> 7) + Static517.anInt8716 & 0x3F) + " Height: " + (Static74.method1954(Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94, Static347.anInt6404, Static308.anInt5918) - Static520.anInt8842));
				Static327.method5346("Look: " + Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94 + "," + (Static110.anInt2572 + Static324.anInt6132 >> 6) + "," + (Static517.anInt8716 + Static382.anInt6686 >> 6) + "," + (Static324.anInt6132 + Static110.anInt2572 & 0x3F) + "," + (Static517.anInt8716 + Static382.anInt6686 & 0x3F) + " Height: " + (Static74.method1954(Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94, Static382.anInt6686, Static110.anInt2572) - Static217.anInt4444));
				return;
			}
			if (arg1.equals("showocc")) {
				Static280.aBoolean381 = !Static280.aBoolean381;
				Static215.method3855();
				Static327.method5346("showocc=" + Static280.aBoolean381);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static505.aBoolean590 = !Static505.aBoolean590;
				Static215.method3855();
				Static327.method5346("forcewallocc=" + Static505.aBoolean590);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static513.aBoolean593 = !Static513.aBoolean593;
				Static478.aClass9_10.method7610(Static513.aBoolean593);
				Static226.method3964();
				Static327.method5346("showprofiling=" + Static513.aBoolean593);
				return;
			}
			if (arg1.startsWith("performancetest")) {
				local106 = -1;
				local657 = 1000;
				if (arg1.length() > 15) {
					@Pc(1397) String[] local1397 = Static12.method678(' ', arg1);
					try {
						if (local1397.length > 1) {
							local657 = Integer.parseInt(local1397[1]);
						}
					} catch (@Pc(1410) Throwable local1410) {
					}
					try {
						if (local1397.length > 2) {
							local106 = Integer.parseInt(local1397[2]);
						}
					} catch (@Pc(1421) Throwable local1421) {
					}
				}
				if (local106 != -1) {
					Static327.method5346("Performance: " + Static410.method6138(Static526.anInt8926, local657));
					return;
				}
				Static327.method5346("Java toolkit: " + Static410.method6138(0, local657));
				Static327.method5346("SSE toolkit:  " + Static410.method6138(2, local657));
				Static327.method5346("D3D toolkit:  " + Static410.method6138(3, local657));
				Static327.method5346("GL toolkit:   " + Static410.method6138(1, local657));
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(1498) Class49 local1498 = Static478.aClass9_10.method7626();
				Static327.method5346("Vendor: " + local1498.anInt1928);
				Static327.method5346("Name: " + local1498.aString9);
				Static327.method5346("Version: " + local1498.anInt1929);
				Static327.method5346("Device: " + local1498.aString8);
				Static327.method5346("Driver Version: " + local1498.aLong47);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static17.aBoolean59 = !Static17.aBoolean59;
				Static327.method5346("nonpcs=" + Static17.aBoolean59);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static362.method5648();
				Static327.method5346("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local106 = Integer.parseInt(arg1.substring(12));
				Static171.method3329(Static467.method6823(local106).aString11, local106);
				Static327.method5346("switched");
				return;
			}
			if (arg1.equals("getworld")) {
				Static327.method5346("w: " + Static153.aClass130_5.anInt4072);
				return;
			}
			if (arg1.startsWith("pc")) {
				Static444.method6416(Static453.aClass186_107);
				Static192.aClass1_Sub13_Sub2_1.method3060(0);
				local106 = Static192.aClass1_Sub13_Sub2_1.anInt3400;
				local657 = arg1.indexOf(" ", 4);
				Static192.aClass1_Sub13_Sub2_1.method3061(arg1.substring(3, local657));
				Static230.method3984(Static192.aClass1_Sub13_Sub2_1, arg1.substring(local657));
				Static192.aClass1_Sub13_Sub2_1.method3077(Static192.aClass1_Sub13_Sub2_1.anInt3400 - local106);
				return;
			}
			if (arg1.equals("heap")) {
				Static327.method5346("Heap: " + Static318.anInt6040 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static466.method6817();
				Static327.method5346("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local106 = 0; local106 < Static52.anIntArray138.length; local106++) {
					if (Static99.aBooleanArray12[local106]) {
						Static52.anIntArray138[local106] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static52.anIntArray138[local106] *= -1;
						}
					}
				}
				Static466.method6817();
				Static327.method5346("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static22.aBoolean61 = true;
				Static540.method7892();
				Static327.method5346("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static22.aBoolean61 = false;
				Static540.method7892();
				Static327.method5346("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static33.method1299();
				Static327.method5346("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static327.method5346(Static468.method6833() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local106 = Integer.parseInt(arg1.substring(9));
				if (local106 >= 0 && local106 <= 4) {
					Static89.aClass1_Sub28_Sub1_1.anInt4901 = local106;
				}
				Static327.method5346("cpuusage=" + Static89.aClass1_Sub28_Sub1_1.anInt4901);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local106 = Integer.parseInt(arg1.substring(17));
				Static327.method5346("varpbit=" + Static343.aClass286_1.method6992(local106));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local106 = Integer.parseInt(arg1.substring(14));
				Static327.method5346("varp=" + Static343.aClass286_1.method6991(local106));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static440.method2214(0, false);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static440.method2214(0, true);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1896) String[] local1896 = Static12.method678(' ', arg1.substring(12));
				if (local1896.length >= 2) {
					local657 = local1896.length > 2 ? Integer.parseInt(local1896[2]) : 0;
					Static458.method6747(local1896[0], local657, local1896[1]);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static387.method5826();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static387.method5832();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static387.method5832();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local106 = Integer.parseInt(arg1.substring(8));
				Static478.aClass9_10.method7598(local106);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static327.method5346("Active streams: " + Static445.aClass1_Sub12_Sub3_2.method6364());
				return;
			}
			if (arg1.equals("autosetup")) {
				Static89.aClass1_Sub28_Sub1_1.method4270();
				Static327.method5346("Complete. Toolkit now: " + Static526.anInt8926);
				return;
			}
			if (arg1.equals("errormessage")) {
				Static327.method5346(Static496.aClient1.method1732());
				return;
			}
			if (Static51.anInt7926 == 9) {
				Static444.method6416(Static175.aClass186_53);
				Static192.aClass1_Sub13_Sub2_1.method3060(arg1.length() + 3);
				Static192.aClass1_Sub13_Sub2_1.method3060(arg2 ? 1 : 0);
				Static192.aClass1_Sub13_Sub2_1.method3060(arg0 ? 1 : 0);
				Static192.aClass1_Sub13_Sub2_1.method3061(arg1);
			}
			if (arg1.startsWith("fps ") && Static363.aClass199_14 != Static359.aClass199_13) {
				Static258.method4326(Static485.method7022(arg1.substring(4)));
				return;
			}
			if (Static51.anInt7926 != 9) {
				Static327.method5346("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(2073) Exception local2073) {
			Static327.method5346("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ZIILclient!uh;I)V")
	public static void method4963(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class288 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) Class1_Sub9 local8 = (Class1_Sub9) Static497.aClass38_70.method1419(); local8 != null; local8 = (Class1_Sub9) Static497.aClass38_70.method1415()) {
			if (arg0 == local8.anInt2352 && arg3 << 7 == local8.anInt2348 && arg1 << 7 == local8.anInt2353 && local8.aClass288_1.anInt8333 == arg2.anInt8333) {
				if (local8.aClass1_Sub12_Sub1_2 != null) {
					Static445.aClass1_Sub12_Sub3_2.method6363(local8.aClass1_Sub12_Sub1_2);
					local8.aClass1_Sub12_Sub1_2 = null;
				}
				if (local8.aClass1_Sub12_Sub1_1 != null) {
					Static445.aClass1_Sub12_Sub3_2.method6363(local8.aClass1_Sub12_Sub1_1);
					local8.aClass1_Sub12_Sub1_1 = null;
				}
				local8.method7983();
				return;
			}
		}
	}
}
