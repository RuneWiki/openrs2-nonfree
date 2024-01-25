import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!vba", name = "ab", descriptor = "I")
	public static int anInt9873;

	@OriginalMember(owner = "client!vba", name = "db", descriptor = "F")
	public static float aFloat198;

	@OriginalMember(owner = "client!vba", name = "bb", descriptor = "I")
	public static int anInt9874 = 0;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIILclient!fp;Lclient!fp;)V")
	public static void method8495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub2_Sub3 arg3, @OriginalArg(4) Class4_Sub2_Sub3 arg4) {
		@Pc(4) Class217 local4 = Static411.method6333(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub2_Sub3_1 = arg3;
		local4.aClass4_Sub2_Sub3_2 = arg4;
		@Pc(19) int local19 = Static11.aClass61Array1 == Static456.aClass61Array3 ? 1 : 0;
		if (!arg3.method8733()) {
			arg3.aClass4_Sub2_23 = Static243.aClass4_Sub2Array2[local19];
			Static243.aClass4_Sub2Array2[local19] = arg3;
		} else if (arg3.method8727()) {
			arg3.aClass4_Sub2_23 = Static457.aClass4_Sub2Array4[local19];
			Static457.aClass4_Sub2Array4[local19] = arg3;
		} else {
			arg3.aClass4_Sub2_23 = Static79.aClass4_Sub2Array1[local19];
			Static79.aClass4_Sub2Array1[local19] = arg3;
			Static28.aBoolean15 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8733()) {
			if (arg4.method8727()) {
				arg4.aClass4_Sub2_23 = Static457.aClass4_Sub2Array4[local19];
				Static457.aClass4_Sub2Array4[local19] = arg4;
				return;
			}
			arg4.aClass4_Sub2_23 = Static79.aClass4_Sub2Array1[local19];
			Static79.aClass4_Sub2Array1[local19] = arg4;
			Static28.aBoolean15 = true;
			return;
		}
		arg4.aClass4_Sub2_23 = Static243.aClass4_Sub2Array2[local19];
		Static243.aClass4_Sub2Array2[local19] = arg4;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Ljava/lang/String;ZIZ)V")
	public static void method8497(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Static83.method6024("commands - This command");
				Static83.method6024("cls - Clear console");
				Static83.method6024("displayfps - Toggle FPS and other information");
				Static83.method6024("renderer - Print graphics renderer information");
				Static83.method6024("heap - Print java memory information");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static189.anInt10183 = 0;
				Static260.anInt4710 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				Static471.aBoolean564 = !Static471.aBoolean564;
				if (Static471.aBoolean564) {
					Static83.method6024("FPS on");
					return;
				}
				Static83.method6024("FPS off");
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(71) Class294 local71 = Static213.aClass133_5.method7281();
				Static83.method6024("Vendor: " + local71.anInt7777);
				Static83.method6024("Name: " + local71.aString86);
				Static83.method6024("Version: " + local71.anInt7781);
				Static83.method6024("Device: " + local71.aString85);
				Static83.method6024("Driver Version: " + local71.aLong198);
				return;
			}
			if (arg0.equals("heap")) {
				Static83.method6024("Heap: " + Static110.anInt2065 + "MB");
				return;
			}
		} catch (@Pc(145) Exception local145) {
			Static83.method6024(Static174.aClass120_2.method2690(Static266.anInt4796));
			return;
		}
		if (Static211.aClass15_2 != Static517.aClass15_8 || Static210.anInt4035 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static83.method6024("FPS: " + Static263.anInt4785);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static437.aBoolean537 = !Static437.aBoolean537;
					if (Static437.aBoolean537) {
						Static83.method6024("Occlsion now on!");
						return;
					}
					Static83.method6024("Occlsion now off!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Static471.aBoolean564 = true;
					Static83.method6024("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Static471.aBoolean564 = false;
					Static83.method6024("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static83.method6024("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static399.aClass5_Sub28_1.anInt4840 + "Mb");
						return;
					} catch (@Pc(257) Throwable local257) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static452.aClass99_9.method2042();
					Static83.method6024("Text coords cleared");
					return;
				}
				@Pc(298) int local298;
				@Pc(277) int local277;
				@Pc(288) Runtime local288;
				if (arg0.equalsIgnoreCase("gc")) {
					Static59.method978();
					for (local277 = 0; local277 < 10; local277++) {
						System.gc();
					}
					local288 = Runtime.getRuntime();
					local298 = (int) ((local288.totalMemory() - local288.freeMemory()) / 1024L);
					Static83.method6024("mem=" + local298 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("compact")) {
					Static59.method978();
					for (local277 = 0; local277 < 10; local277++) {
						System.gc();
					}
					local288 = Runtime.getRuntime();
					local298 = (int) ((local288.totalMemory() - local288.freeMemory()) / 1024L);
					Static83.method6024("Memory before cleanup=" + local298 + "k");
					Static209.method3593();
					Static59.method978();
					for (@Pc(358) int local358 = 0; local358 < 10; local358++) {
						System.gc();
					}
					local298 = (int) ((local288.totalMemory() - local288.freeMemory()) / 1024L);
					Static83.method6024("Memory after cleanup=" + local298 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static83.method6024(Static32.method415() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static83.method6024("Dropped client connection");
					if (Static151.anInt2620 == 10) {
						Static364.method5406();
					} else if (Static151.anInt2620 == 11) {
						Static353.aBoolean428 = true;
						return;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static490.aClass306_5.method7223();
					Static83.method6024("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					Static1.aClass309_7.method7418();
					Static83.method6024("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					Static1.aClass309_7.method7422();
					Static83.method6024("Dropped server js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static470.aClass100_14.method2083();
					Static495.aClass170_2.method8117();
					Static1.aClass309_7.method7414();
					Static83.method6024("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static608.method8684();
					Static347.method5204();
					Static83.method6024("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static204.aLong98 = Static95.method1587();
					Static559.aBoolean674 = true;
					Static608.method8684();
					Static347.method5204();
					Static83.method6024("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static400.method5975(false, 1, -1, -1);
					if (Static138.method2022() != 1) {
						Static83.method6024("wm1 failed");
						return;
					}
					Static83.method6024("wm1 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static400.method5975(false, 2, -1, -1);
					if (Static138.method2022() == 2) {
						Static83.method6024("wm2 succeeded");
						return;
					}
					Static83.method6024("wm2 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static400.method5975(false, 3, 1024, 768);
					if (Static138.method2022() == 3) {
						Static83.method6024("wm3 succeeded");
						return;
					}
					Static83.method6024("wm3 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static638.method9004(0, false);
					if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() == 0) {
						Static83.method6024("Entered tk0");
						Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
						Static273.method4418();
						Static339.aBoolean417 = false;
						return;
					}
					Static83.method6024("Failed to enter tk0");
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static638.method9004(1, false);
					if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() == 1) {
						Static83.method6024("Entered tk1");
						Static97.aClass5_Sub25_8.method3683(1, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
						Static273.method4418();
						Static339.aBoolean417 = false;
						return;
					}
					Static83.method6024("Failed to enter tk1");
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static638.method9004(2, false);
					if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() != 2) {
						Static83.method6024("Failed to enter tk2");
						return;
					}
					Static83.method6024("Entered tk2");
					Static97.aClass5_Sub25_8.method3683(2, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static638.method9004(3, false);
					if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() == 3) {
						Static83.method6024("Entered tk3");
						Static97.aClass5_Sub25_8.method3683(3, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
						Static273.method4418();
						Static339.aBoolean417 = false;
						return;
					}
					Static83.method6024("Failed to enter tk3");
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static638.method9004(5, false);
					if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() != 5) {
						Static83.method6024("Failed to enter tk5");
						return;
					}
					Static83.method6024("Entered tk5");
					Static97.aClass5_Sub25_8.method3683(5, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static83.method6024("Invalid buildarea value");
						return;
					}
					local277 = Static548.method7986(arg0.substring(6));
					if (local277 >= 0 && local277 <= Static518.method7681(Static110.anInt2065)) {
						Static97.aClass5_Sub25_8.method3683(local277, Static97.aClass5_Sub25_8.aClass6_Sub28_1);
						Static273.method4418();
						Static339.aBoolean417 = false;
						Static83.method6024("maxbuildarea=" + Static97.aClass5_Sub25_8.aClass6_Sub28_1.method8253());
						return;
					}
					Static83.method6024("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static83.method6024("Invalid rect_debug value");
						return;
					}
					Static470.anInt9219 = Static548.method7986(arg0.substring(10).trim());
					Static83.method6024("rect_debug=" + Static470.anInt9219);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static132.aBoolean513 = true;
					Static83.method6024("qa_op_test=" + Static132.aBoolean513);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static531.aBoolean662 = !Static531.aBoolean662;
					Static83.method6024("clipcomponents=" + Static531.aBoolean662);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(894) boolean local894 = Static213.aClass133_5.method7319();
					if (Static58.method967(!local894)) {
						if (local894) {
							Static83.method6024("Bloom disabled");
							return;
						}
						Static83.method6024("Bloom enabled");
						return;
					}
					Static83.method6024("Failed to enable bloom");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (Static23.aBoolean14) {
						Static23.aBoolean14 = false;
						Static83.method6024("Forced tweening disabled.");
						return;
					}
					Static23.aBoolean14 = true;
					Static83.method6024("Forced tweening ENABLED!");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (!Static59.aBoolean66) {
						Static83.method6024("Shift-click ENABLED!");
						Static59.aBoolean66 = true;
						return;
					}
					Static83.method6024("Shift-click disabled.");
					Static59.aBoolean66 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static83.method6024("x:" + (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 >> 9) + " z:" + (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static83.method6024("Height: " + Static11.aClass61Array1[Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132].method8580(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 >> 9, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static441.aClass207_89.method4666();
					Static441.aClass207_89.method4668();
					Static586.aClass333_4.method7933();
					Static325.aClass42_1.method943();
					Static347.method5204();
					Static83.method6024("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (Static213.aClass133_5.method7283()) {
						local277 = Integer.parseInt(arg0.substring(3));
						if (local277 < 1) {
							local277 = 1;
						} else if (local277 > 4) {
							local277 = 4;
						}
						Static141.anInt2453 = local277;
						Static608.method8684();
						Static83.method6024("Render cores now: " + Static141.anInt2453);
						return;
					}
					Static83.method6024("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static83.method6024("I(s): " + Static78.aClass87_48.method1799() + "/" + Static78.aClass87_48.method1803());
					Static83.method6024("I(m): " + Static207.aClass87_105.method1799() + "/" + Static207.aClass87_105.method1803());
					Static83.method6024("O(s): " + Static643.aClass275_2.aClass353_1.method8378() + "/" + Static643.aClass275_2.aClass353_1.method8384());
					return;
				}
				if (arg0.equalsIgnoreCase("getcamerapos")) {
					Static83.method6024("Pos: " + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 + "," + ((Static19.anInt277 >> 9) + Static565.anInt9560 >> 6) + "," + ((Static117.anInt2170 >> 9) + Static567.anInt9589 >> 6) + "," + (Static565.anInt9560 + (Static19.anInt277 >> 9) & 0x3F) + "," + (Static567.anInt9589 + (Static117.anInt2170 >> 9) & 0x3F) + " Height: " + (Static644.method9021(Static117.anInt2170, Static19.anInt277, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132) - Static441.anInt7550));
					Static83.method6024("Look: " + Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 + "," + (Static565.anInt9560 + Static447.anInt7620 >> 6) + "," + (Static567.anInt9589 + Static43.anInt935 >> 6) + "," + (Static565.anInt9560 + Static447.anInt7620 & 0x3F) + "," + (Static567.anInt9589 + Static43.anInt935 & 0x3F) + " Height: " + (Static644.method9021(Static43.anInt935, Static447.anInt7620, Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132) - Static485.anInt8265));
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static183.aBoolean229 = !Static183.aBoolean229;
					Static213.aClass133_5.method7274(Static183.aBoolean229);
					Static601.method8614();
					Static83.method6024("showprofiling=" + Static183.aBoolean229);
					return;
				}
				@Pc(1311) String[] local1311;
				@Pc(1302) int local1302;
				if (arg0.startsWith("performancetest")) {
					local277 = -1;
					local1302 = 1000;
					if (arg0.length() > 15) {
						local1311 = Static481.method7093(arg0, ' ');
						try {
							if (local1311.length > 1) {
								local1302 = Integer.parseInt(local1311[1]);
							}
						} catch (@Pc(1324) Throwable local1324) {
						}
						try {
							if (local1311.length > 2) {
								local277 = Integer.parseInt(local1311[2]);
							}
						} catch (@Pc(1335) Throwable local1335) {
						}
					}
					if (local277 != -1) {
						Static83.method6024("Performance: " + Static468.method6941(local277, local1302));
						return;
					}
					Static83.method6024("Java toolkit: " + Static468.method6941(0, local1302));
					Static83.method6024("SSE toolkit:  " + Static468.method6941(2, local1302));
					Static83.method6024("D3D toolkit:  " + Static468.method6941(3, local1302));
					Static83.method6024("GL toolkit:   " + Static468.method6941(1, local1302));
					Static83.method6024("GLX toolkit:  " + Static468.method6941(5, local1302));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static42.aBoolean50 = !Static42.aBoolean50;
					Static83.method6024("nonpcs=" + Static42.aBoolean50);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static12.method220();
					Static83.method6024("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local277 = Integer.parseInt(arg0.substring(12));
					Static551.method8048(Static516.method4855(local277).aString64, local277);
					Static83.method6024("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static83.method6024("w: " + Static490.aClass306_5.anInt8300);
					return;
				}
				@Pc(1497) Class5_Sub48 local1497;
				if (arg0.startsWith("pc")) {
					local1497 = Static16.method232(Static225.aClass46_49, Static276.aClass251_2);
					local1497.aClass5_Sub22_Sub1_2.method5905(0);
					local1302 = local1497.aClass5_Sub22_Sub1_2.anInt6629;
					local298 = arg0.indexOf(" ", 4);
					local1497.aClass5_Sub22_Sub1_2.method5910(arg0.substring(3, local298));
					Static413.method8718(arg0.substring(local298), local1497.aClass5_Sub22_Sub1_2);
					local1497.aClass5_Sub22_Sub1_2.method5965(local1497.aClass5_Sub22_Sub1_2.anInt6629 - local1302);
					Static277.method4436(local1497);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static182.method2792();
					Static83.method6024("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local277 = 0; local277 < Static320.anIntArray291.length; local277++) {
						if (Static578.aBooleanArray15[local277]) {
							Static320.anIntArray291[local277] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static320.anIntArray291[local277] *= -1;
							}
						}
					}
					Static182.method2792();
					Static83.method6024("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static1.aBoolean648 = true;
					Static347.method5204();
					Static83.method6024("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static1.aBoolean648 = false;
					Static347.method5204();
					Static83.method6024("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static573.method2148();
					Static83.method6024("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static83.method6024(Static337.method5085() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local277 = Integer.parseInt(arg0.substring(17));
					Static83.method6024("varpbit=" + Static301.aClass59_1.method1303(local277));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local277 = Integer.parseInt(arg0.substring(14));
					Static83.method6024("varp=" + Static301.aClass59_1.method1304(local277));
					return;
				}
				if (arg0.startsWith("directlogin")) {
					@Pc(1705) String[] local1705 = Static481.method7093(arg0.substring(12), ' ');
					if (local1705.length >= 2) {
						local1302 = local1705.length <= 2 ? 0 : Integer.parseInt(local1705[2]);
						Static78.method1356(local1302, local1705[1], local1705[0]);
						return;
					}
				}
				if (arg0.startsWith("csprofileclear")) {
					Static370.method5468();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static370.method5463();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static370.method5463();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local277 = Integer.parseInt(arg0.substring(8));
					Static213.aClass133_5.method7309(local277);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static83.method6024("Active streams: " + Static26.aClass5_Sub1_Sub2_1.method5053());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static531.method7860();
					Static83.method6024("Complete. Toolkit now: " + Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988());
					return;
				}
				if (arg0.equals("errormessage")) {
					Static83.method6024(Static475.aClient1.method1280());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static144.aString33.startsWith("win")) {
						Static263.method4268(new File("C:\\Temp\\heap.dump"));
					} else {
						Static263.method4268(new File("/tmp/heap.dump"));
					}
					Static83.method6024("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static83.method6024("Name: " + Static144.aString33);
					Static83.method6024("Arch: " + Static144.aString29);
					Static83.method6024("Ver: " + Static144.aString30);
					return;
				}
				if (arg0.startsWith("w2debug")) {
					local277 = Integer.parseInt(arg0.substring(8, 9));
					Static452.anInt7708 = local277;
					Static608.method8684();
					Static83.method6024("Toggled!");
					return;
				}
				if (arg0.startsWith("ortho ")) {
					local277 = arg0.indexOf(32);
					if (local277 < 0) {
						Static83.method6024("Syntax: ortho <n>");
						return;
					}
					local1302 = Static548.method7986(arg0.substring(local277 + 1));
					Static97.aClass5_Sub25_8.method3683(local1302, Static97.aClass5_Sub25_8.aClass6_Sub24_1);
					Static273.method4418();
					Static339.aBoolean417 = false;
					Static18.method238();
					if (local1302 == Static97.aClass5_Sub25_8.aClass6_Sub24_1.method7735()) {
						Static83.method6024("Successfully changed ortho mode");
						return;
					}
					Static83.method6024("Failed to change ortho mode");
					return;
				}
				if (arg0.startsWith("orthozoom ")) {
					if (Static97.aClass5_Sub25_8.aClass6_Sub24_1.method7735() == 0) {
						Static83.method6024("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local277 = Static548.method7986(arg0.substring(arg0.indexOf(32) + 1));
					Static469.anInt7886 = local277;
					Static83.method6024("orthozoom=" + Static469.anInt7886);
					return;
				}
				if (arg0.startsWith("orthotilesize ")) {
					local277 = Static548.method7986(arg0.substring(arg0.indexOf(32) + 1));
					Static134.anInt2377 = local277;
					Static220.anInt4133 = local277;
					Static83.method6024("ortho tile size=" + local277);
					Static18.method238();
					return;
				}
				if (arg0.equals("orthocamlock")) {
					Static375.aBoolean446 = !Static375.aBoolean446;
					Static83.method6024("ortho camera lock is " + (Static375.aBoolean446 ? "on" : "off"));
					return;
				}
				@Pc(2053) File local2053;
				if (arg0.startsWith("setoutput ")) {
					local2053 = new File(arg0.substring(10));
					if (local2053.exists()) {
						local2053 = new File(arg0.substring(10) + "." + Static95.method1587() + ".log");
						if (local2053.exists()) {
							Static83.method6024("file already exists!");
							return;
						}
					}
					if (Static93.aFileOutputStream1 != null) {
						Static93.aFileOutputStream1.close();
						Static93.aFileOutputStream1 = null;
					}
					try {
						Static93.aFileOutputStream1 = new FileOutputStream(local2053);
						return;
					} catch (@Pc(2095) FileNotFoundException local2095) {
						Static83.method6024("Could not create " + local2053.getName());
						return;
					} catch (@Pc(2107) SecurityException local2107) {
						Static83.method6024("Cannot write to " + local2053.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Static93.aFileOutputStream1 != null) {
						Static93.aFileOutputStream1.close();
					}
					Static93.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local2053 = new File(arg0.substring(10));
					if (!local2053.exists()) {
						Static83.method6024("No such file");
						return;
					}
					@Pc(2153) byte[] local2153 = Static547.method7981(local2053);
					if (local2153 == null) {
						Static83.method6024("Failed to read file");
						return;
					}
					local1311 = Static481.method7093(Static612.method8708("", Static194.method3034(local2153)), '\n');
					Static132.method6368(local1311);
				}
				if (arg0.startsWith("zoom ")) {
					@Pc(2186) short local2186 = (short) Static548.method7986(arg0.substring(5));
					if (local2186 > 0) {
						Static523.aShort105 = local2186;
					}
					return;
				}
				if (Static151.anInt2620 == 10) {
					local1497 = Static16.method232(Static367.aClass46_67, Static276.aClass251_2);
					local1497.aClass5_Sub22_Sub1_2.method5905(arg0.length() + 3);
					local1497.aClass5_Sub22_Sub1_2.method5905(arg2 ? 1 : 0);
					local1497.aClass5_Sub22_Sub1_2.method5905(arg1 ? 1 : 0);
					local1497.aClass5_Sub22_Sub1_2.method5910(arg0);
					Static277.method4436(local1497);
				}
				if (arg0.startsWith("fps ") && Static517.aClass15_8 != Static211.aClass15_2) {
					Static193.method7250(Static548.method7986(arg0.substring(4)));
					return;
				}
			} catch (@Pc(2261) Exception local2261) {
				Static83.method6024(Static174.aClass120_2.method2690(Static266.anInt4796));
				return;
			}
		}
		if (Static151.anInt2620 != 10) {
			Static83.method6024(Static174.aClass120_3.method2690(Static266.anInt4796) + arg0);
		}
	}
}
