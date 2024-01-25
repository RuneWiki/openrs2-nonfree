import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eea", name = "Sb", descriptor = "Lclient!of;")
	public static final Class236 aClass236_20 = new Class236(5);

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZZBLjava/lang/String;)V")
	public static void method2685(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static481.method7139("commands - This command");
				Static481.method7139("cls - Clear console");
				Static481.method7139("displayfps - Toggle FPS and other information");
				Static481.method7139("renderer - Print graphics renderer information");
				Static481.method7139("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static183.anInt4304 = 0;
				Static150.anInt3709 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static450.aBoolean595 = !Static450.aBoolean595;
				if (!Static450.aBoolean595) {
					Static481.method7139("FPS off");
					return;
				}
				Static481.method7139("FPS on");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(73) Class234 local73 = Static171.aClass16_5.method6103();
				Static481.method7139("Vendor: " + local73.anInt7464);
				Static481.method7139("Name: " + local73.aString76);
				Static481.method7139("Version: " + local73.anInt7462);
				Static481.method7139("Device: " + local73.aString75);
				Static481.method7139("Driver Version: " + local73.aLong185);
				return;
			}
			if (arg2.equals("heap")) {
				Static481.method7139("Heap: " + Static153.anInt3785 + "MB");
				return;
			}
		} catch (@Pc(141) Exception local141) {
			Static481.method7139(Static121.aClass84_2.method2710(Static372.anInt7083));
			return;
		}
		if (Static101.aClass313_5 != Static277.aClass313_9 || Static190.anInt7431 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static481.method7139("FPS: " + Static563.anInt9710);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static307.aBoolean442 = !Static307.aBoolean442;
					if (!Static307.aBoolean442) {
						Static481.method7139("Occlsion now off!");
						return;
					}
					Static481.method7139("Occlsion now on!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static450.aBoolean595 = true;
					Static481.method7139("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static450.aBoolean595 = false;
					Static481.method7139("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static481.method7139("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static38.aClass8_Sub15_1.anInt2575 + "Mb");
						return;
					} catch (@Pc(249) Throwable local249) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static330.aClass123_6.method3534();
					Static481.method7139("Text coords cleared");
					return;
				}
				@Pc(290) int local290;
				@Pc(269) int local269;
				@Pc(280) Runtime local280;
				if (arg2.equalsIgnoreCase("gc")) {
					Static466.method7018();
					for (local269 = 0; local269 < 10; local269++) {
						System.gc();
					}
					local280 = Runtime.getRuntime();
					local290 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static481.method7139("mem=" + local290 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static466.method7018();
					for (local269 = 0; local269 < 10; local269++) {
						System.gc();
					}
					local280 = Runtime.getRuntime();
					local290 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static481.method7139("Memory before cleanup=" + local290 + "k");
					Static634.method7629();
					Static466.method7018();
					for (@Pc(345) int local345 = 0; local345 < 10; local345++) {
						System.gc();
					}
					local290 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static481.method7139("Memory after cleanup=" + local290 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static481.method7139(Static158.method3216() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static481.method7139("Dropped client connection");
					if (Static435.anInt8191 == 10) {
						Static428.method6640();
						return;
					}
					if (Static435.anInt8191 == 11) {
						Static306.aBoolean441 = true;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static471.aClass280_2.method7028();
					Static481.method7139("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static499.aClass113_3.method3345();
					Static481.method7139("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static499.aClass113_3.method3333();
					Static481.method7139("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static51.aClass118_1.method3412();
					Static319.aClass240_2.method6377();
					Static499.aClass113_3.method3342();
					Static481.method7139("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static33.method1194();
					Static551.method7733();
					Static481.method7139("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static40.aLong33 = Static342.method5463();
					Static370.aBoolean495 = true;
					Static33.method1194();
					Static551.method7733();
					Static481.method7139("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static327.method5366(-1, -1, 1, false);
					if (Static383.method6158() == 1) {
						Static481.method7139("wm1 succeeded");
						return;
					}
					Static481.method7139("wm1 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static327.method5366(-1, -1, 2, false);
					if (Static383.method6158() != 2) {
						Static481.method7139("wm2 failed");
						return;
					}
					Static481.method7139("wm2 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static327.method5366(1024, 768, 3, false);
					if (Static383.method6158() != 3) {
						Static481.method7139("wm3 failed");
						return;
					}
					Static481.method7139("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static553.method7773(false, 0);
					if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() == 0) {
						Static481.method7139("Entered tk0");
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, 0);
						Static35.method7912();
						Static497.aBoolean740 = false;
						return;
					}
					Static481.method7139("Failed to enter tk0");
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static553.method7773(false, 1);
					if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() != 1) {
						Static481.method7139("Failed to enter tk1");
						return;
					}
					Static481.method7139("Entered tk1");
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, 1);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static553.method7773(false, 2);
					if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() == 2) {
						Static481.method7139("Entered tk2");
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, 2);
						Static35.method7912();
						Static497.aBoolean740 = false;
						return;
					}
					Static481.method7139("Failed to enter tk2");
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static553.method7773(false, 3);
					if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() != 3) {
						Static481.method7139("Failed to enter tk3");
						return;
					}
					Static481.method7139("Entered tk3");
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, 3);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static553.method7773(false, 5);
					if (Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358() != 5) {
						Static481.method7139("Failed to enter tk5");
						return;
					}
					Static481.method7139("Entered tk5");
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub19_1, 5);
					Static35.method7912();
					Static497.aBoolean740 = false;
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static481.method7139("Invalid buildarea value");
						return;
					}
					local269 = Static82.method2080(arg2.substring(6));
					if (local269 >= 0 && Static441.method6807(Static153.anInt3785) >= local269) {
						Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub7_1, local269);
						Static35.method7912();
						Static497.aBoolean740 = false;
						Static481.method7139("maxbuildarea=" + Static155.aClass8_Sub25_6.aClass36_Sub7_1.method3620());
						return;
					}
					Static481.method7139("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static481.method7139("Invalid rect_debug value");
						return;
					}
					Static22.anInt950 = Static82.method2080(arg2.substring(10).trim());
					Static481.method7139("rect_debug=" + Static22.anInt950);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static54.aBoolean127 = true;
					Static481.method7139("qa_op_test=" + Static54.aBoolean127);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static203.aBoolean339 = !Static203.aBoolean339;
					Static481.method7139("clipcomponents=" + Static203.aBoolean339);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(861) boolean local861 = Static171.aClass16_5.method6079();
					if (Static38.method1275(!local861)) {
						if (!local861) {
							Static481.method7139("Bloom enabled");
							return;
						}
						Static481.method7139("Bloom disabled");
						return;
					}
					Static481.method7139("Failed to enable bloom");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static460.aBoolean600) {
						Static460.aBoolean600 = false;
						Static481.method7139("Forced tweening disabled.");
						return;
					}
					Static460.aBoolean600 = true;
					Static481.method7139("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (!Static131.aBoolean255) {
						Static481.method7139("Shift-click ENABLED!");
						Static131.aBoolean255 = true;
						return;
					}
					Static481.method7139("Shift-click disabled.");
					Static131.aBoolean255 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static481.method7139("x:" + (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 >> 9) + " z:" + (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static481.method7139("Height: " + Static34.aClass86Array5[Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124].method8086(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 >> 9, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static630.aClass237_149.method6321();
					Static630.aClass237_149.method6325();
					Static76.aClass67_1.method2157();
					Static612.aClass12_4.method137();
					Static551.method7733();
					Static481.method7139("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static171.aClass16_5.method6115()) {
						local269 = Integer.parseInt(arg2.substring(3));
						if (local269 < 1) {
							local269 = 1;
						} else if (local269 > 4) {
							local269 = 4;
						}
						Static170.anInt4134 = local269;
						Static33.method1194();
						Static481.method7139("Render cores now: " + Static170.anInt4134);
						return;
					}
					Static481.method7139("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static481.method7139("I(s): " + Static572.aClass236_98.method6249() + "/" + Static572.aClass236_98.method6244());
					Static481.method7139("I(m): " + Static529.aClass236_87.method6249() + "/" + Static529.aClass236_87.method6244());
					Static481.method7139("O(s): " + Static497.aClass258_21.aClass115_1.method3368() + "/" + Static497.aClass258_21.aClass115_1.method3375());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static481.method7139("Pos: " + Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 + "," + ((Static637.anInt10650 >> 9) + Static628.anInt10493 >> 6) + "," + (Static594.anInt10160 + (Static377.anInt7114 >> 9) >> 6) + "," + (Static628.anInt10493 + (Static637.anInt10650 >> 9) & 0x3F) + "," + (Static594.anInt10160 + (Static377.anInt7114 >> 9) & 0x3F) + " Height: " + (Static177.method3098(Static377.anInt7114, Static637.anInt10650, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124) - Static504.anInt8868));
					Static481.method7139("Look: " + Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124 + "," + (Static628.anInt10493 + Static345.anInt6703 >> 6) + "," + (Static594.anInt10160 + Static567.anInt9757 >> 6) + "," + (Static628.anInt10493 + Static345.anInt6703 & 0x3F) + "," + (Static567.anInt9757 + Static594.anInt10160 & 0x3F) + " Height: " + (Static177.method3098(Static567.anInt9757, Static345.anInt6703, Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124) - Class15_Sub1_Sub2_Sub2.lb));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static42.aBoolean119 = !Static42.aBoolean119;
					Static171.aClass16_5.method6071(Static42.aBoolean119);
					Static36.method1260();
					Static481.method7139("showprofiling=" + Static42.aBoolean119);
					return;
				}
				@Pc(1261) String[] local1261;
				@Pc(1252) int local1252;
				if (arg2.startsWith("performancetest")) {
					local269 = -1;
					local1252 = 1000;
					if (arg2.length() > 15) {
						local1261 = Static403.method6410(arg2, ' ');
						try {
							if (local1261.length > 1) {
								local1252 = Integer.parseInt(local1261[1]);
							}
						} catch (@Pc(1274) Throwable local1274) {
						}
						try {
							if (local1261.length > 2) {
								local269 = Integer.parseInt(local1261[2]);
							}
						} catch (@Pc(1285) Throwable local1285) {
						}
					}
					if (local269 == -1) {
						Static481.method7139("Java toolkit: " + Static95.method2214(local1252, 0));
						Static481.method7139("SSE toolkit:  " + Static95.method2214(local1252, 2));
						Static481.method7139("D3D toolkit:  " + Static95.method2214(local1252, 3));
						Static481.method7139("GL toolkit:   " + Static95.method2214(local1252, 1));
						Static481.method7139("GLX toolkit:  " + Static95.method2214(local1252, 5));
						return;
					}
					Static481.method7139("Performance: " + Static95.method2214(local1252, Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358()));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static586.aBoolean712 = !Static586.aBoolean712;
					Static481.method7139("nonpcs=" + Static586.aBoolean712);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static121.method2705();
					Static481.method7139("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local269 = Integer.parseInt(arg2.substring(12));
					Static164.method3284(Static309.method5083(local269).aString39, local269);
					Static481.method7139("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static481.method7139("w: " + Static471.aClass280_2.anInt8497);
					return;
				}
				@Pc(1442) Class8_Sub31 local1442;
				if (arg2.startsWith("pc")) {
					local1442 = Static51.method1418(Static223.aClass257_115, Static608.aClass336_1);
					local1442.aClass8_Sub8_Sub2_1.method8562(0);
					local1252 = local1442.aClass8_Sub8_Sub2_1.anInt10588;
					local290 = arg2.indexOf(" ", 4);
					local1442.aClass8_Sub8_Sub2_1.method8582(arg2.substring(3, local290));
					Static128.method2843(local1442.aClass8_Sub8_Sub2_1, arg2.substring(local290));
					local1442.aClass8_Sub8_Sub2_1.method8536(local1442.aClass8_Sub8_Sub2_1.anInt10588 - local1252);
					Static262.method4604(local1442);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static579.method8093();
					Static481.method7139("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local269 = 0; local269 < Static69.anIntArray417.length; local269++) {
						if (Static378.aBooleanArray19[local269]) {
							Static69.anIntArray417[local269] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static69.anIntArray417[local269] *= -1;
							}
						}
					}
					Static579.method8093();
					Static481.method7139("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static195.aBoolean332 = true;
					Static551.method7733();
					Static481.method7139("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static195.aBoolean332 = false;
					Static551.method7733();
					Static481.method7139("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static593.method8194();
					Static481.method7139("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static481.method7139(Static341.method5460() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local269 = Integer.parseInt(arg2.substring(17));
					Static481.method7139("varpbit=" + Static420.aClass77_1.method2386(local269));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local269 = Integer.parseInt(arg2.substring(14));
					Static481.method7139("varp=" + Static420.aClass77_1.method2387(local269));
					return;
				}
				if (arg2.startsWith("directlogin")) {
					@Pc(1642) String[] local1642 = Static403.method6410(arg2.substring(12), ' ');
					if (local1642.length >= 2) {
						local1252 = local1642.length <= 2 ? 0 : Integer.parseInt(local1642[2]);
						Static155.method3150(local1642[1], local1252, local1642[0]);
						return;
					}
				}
				if (arg2.startsWith("csprofileclear")) {
					Static273.method4697();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static273.method4694();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static273.method4694();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local269 = Integer.parseInt(arg2.substring(8));
					Static171.aClass16_5.method6082(local269);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static481.method7139("Active streams: " + Static15.aClass8_Sub16_Sub5_1.method7436());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static58.method1629();
					Static481.method7139("Complete. Toolkit now: " + Static155.aClass8_Sub25_6.aClass36_Sub19_2.method6358());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static481.method7139(Static227.aClient1.method1912());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static175.aString46.startsWith("win")) {
						Static326.method5360(new File("C:\\Temp\\heap.dump"));
					} else {
						Static326.method5360(new File("/tmp/heap.dump"));
					}
					Static481.method7139("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static481.method7139("Name: " + Static175.aString46);
					Static481.method7139("Arch: " + Static175.aString51);
					Static481.method7139("Ver: " + Static175.aString48);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local269 = Integer.parseInt(arg2.substring(8, 9));
					Static282.anInt5837 = local269;
					Static33.method1194();
					Static481.method7139("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local269 = arg2.indexOf(32);
					if (local269 < 0) {
						Static481.method7139("Syntax: ortho <n>");
						return;
					}
					local1252 = Static82.method2080(arg2.substring(local269 + 1));
					Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub23_1, local1252);
					Static35.method7912();
					Static497.aBoolean740 = false;
					Static582.method8107();
					if (Static155.aClass8_Sub25_6.aClass36_Sub23_1.method7382() == local1252) {
						Static481.method7139("Successfully changed ortho mode");
						return;
					}
					Static481.method7139("Failed to change ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static155.aClass8_Sub25_6.aClass36_Sub23_1.method7382() == 0) {
						Static481.method7139("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local269 = Static82.method2080(arg2.substring(arg2.indexOf(32) + 1));
					Static115.anInt3010 = local269;
					Static481.method7139("orthozoom=" + Static115.anInt3010);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local269 = Static82.method2080(arg2.substring(arg2.indexOf(32) + 1));
					Static23.anInt1014 = local269;
					Static292.anInt5942 = local269;
					Static481.method7139("ortho tile size=" + local269);
					Static582.method8107();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static187.aBoolean311 = !Static187.aBoolean311;
					Static481.method7139("ortho camera lock is " + (Static187.aBoolean311 ? "on" : "off"));
					return;
				}
				@Pc(1982) File local1982;
				if (arg2.startsWith("setoutput ")) {
					local1982 = new File(arg2.substring(10));
					if (local1982.exists()) {
						local1982 = new File(arg2.substring(10) + "." + Static342.method5463() + ".log");
						if (local1982.exists()) {
							Static481.method7139("file already exists!");
							return;
						}
					}
					if (Static578.aFileOutputStream1 != null) {
						Static578.aFileOutputStream1.close();
						Static578.aFileOutputStream1 = null;
					}
					try {
						Static578.aFileOutputStream1 = new FileOutputStream(local1982);
						return;
					} catch (@Pc(2024) FileNotFoundException local2024) {
						Static481.method7139("Could not create " + local1982.getName());
						return;
					} catch (@Pc(2036) SecurityException local2036) {
						Static481.method7139("Cannot write to " + local1982.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static578.aFileOutputStream1 != null) {
						Static578.aFileOutputStream1.close();
					}
					Static578.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local1982 = new File(arg2.substring(10));
					if (!local1982.exists()) {
						Static481.method7139("No such file");
						return;
					}
					@Pc(2080) byte[] local2080 = Static272.method4685(local1982);
					if (local2080 == null) {
						Static481.method7139("Failed to read file");
						return;
					}
					local1261 = Static403.method6410(Static276.method4705(Static639.method8613(local2080), ""), '\n');
					Static259.method4571(local1261);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2111) short local2111 = (short) Static82.method2080(arg2.substring(5));
					if (local2111 > 0) {
						Static372.aShort74 = local2111;
					}
					return;
				}
				if (Static435.anInt8191 == 10) {
					local1442 = Static51.method1418(Static2.aClass257_44, Static608.aClass336_1);
					local1442.aClass8_Sub8_Sub2_1.method8562(arg2.length() + 3);
					local1442.aClass8_Sub8_Sub2_1.method8562(arg0 ? 1 : 0);
					local1442.aClass8_Sub8_Sub2_1.method8562(arg1 ? 1 : 0);
					local1442.aClass8_Sub8_Sub2_1.method8582(arg2);
					Static262.method4604(local1442);
				}
				if (arg2.startsWith("fps ") && Static101.aClass313_5 != Static277.aClass313_9) {
					Static90.method2151(Static82.method2080(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2180) Exception local2180) {
				Static481.method7139(Static121.aClass84_2.method2710(Static372.anInt7083));
				return;
			}
		}
		if (Static435.anInt8191 != 10) {
			Static481.method7139(Static121.aClass84_3.method2710(Static372.anInt7083) + arg2);
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method2694(@OriginalArg(0) Class16 arg0) {
		Static510.aClass3Array1 = new Class3[Static232.anIntArray311.length];
		for (@Pc(11) int local11 = 0; local11 < Static232.anIntArray311.length; local11++) {
			@Pc(22) int local22 = Static232.anIntArray311[local11];
			@Pc(27) Class345 local27 = Static549.method7716(Static503.aClass237_138, local22);
			@Pc(35) Class27 local35 = arg0.method6088(local27, Static647.method3298(Static115.aClass237_32, local22));
			Static510.aClass3Array1[local11] = new Class3(local35, local27);
		}
	}

	@OriginalMember(owner = "client!eea", name = "g", descriptor = "(B)V")
	public static void method2704() {
		Static332.aClass253_23.method6598();
		Static207.aClass253_13.method6598();
	}
}
