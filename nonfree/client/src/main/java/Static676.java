import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZZILjava/lang/String;)V")
	public static void method8313(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static619.method3013("commands - This command");
				Static619.method3013("cls - Clear console");
				Static619.method3013("displayfps - Toggle FPS and other information");
				Static619.method3013("renderer - Print graphics renderer information");
				Static619.method3013("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static503.anInt8655 = 0;
				Static154.anInt2438 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static443.aBoolean588 = !Static443.aBoolean588;
				if (!Static443.aBoolean588) {
					Static619.method3013("FPS off");
					return;
				}
				Static619.method3013("FPS on");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(107) Class236 local107 = Static457.aClass57_11.method7656();
				Static619.method3013("Vendor: " + local107.anInt6354);
				Static619.method3013("Name: " + local107.aString88);
				Static619.method3013("Version: " + local107.anInt6355);
				Static619.method3013("Device: " + local107.aString89);
				Static619.method3013("Driver Version: " + local107.aLong197);
				return;
			}
			if (arg2.equals("heap")) {
				Static619.method3013("Heap: " + Static329.anInt5875 + "MB");
				return;
			}
		} catch (@Pc(192) Exception local192) {
			Static619.method3013(Static582.aClass335_4.method8349(Static323.anInt5795));
			return;
		}
		if (Static408.aClass201_8 != Static570.aClass201_10 || Static539.anInt9221 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static619.method3013("FPS: " + Static57.anInt866);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static570.aBoolean734 = !Static570.aBoolean734;
					if (!Static570.aBoolean734) {
						Static619.method3013("Occlsion now off!");
						return;
					}
					Static619.method3013("Occlsion now on!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static443.aBoolean588 = true;
					Static619.method3013("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static443.aBoolean588 = false;
					Static619.method3013("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static619.method3013("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static528.aClass5_Sub19_1.anInt3442 + "Mb");
						return;
					} catch (@Pc(345) Throwable local345) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static270.aClass98_5.method1778();
					Static619.method3013("Text coords cleared");
					return;
				}
				@Pc(394) int local394;
				@Pc(374) int local374;
				@Pc(385) Runtime local385;
				if (arg2.equalsIgnoreCase("gc")) {
					Static128.method5983();
					for (local374 = 0; local374 < 10; local374++) {
						System.gc();
					}
					local385 = Runtime.getRuntime();
					local394 = (int) ((local385.totalMemory() - local385.freeMemory()) / 1024L);
					Static619.method3013("mem=" + local394 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static128.method5983();
					for (local374 = 0; local374 < 10; local374++) {
						System.gc();
					}
					local385 = Runtime.getRuntime();
					local394 = (int) ((local385.totalMemory() - local385.freeMemory()) / 1024L);
					Static619.method3013("Memory before cleanup=" + local394 + "k");
					Static484.method7008();
					Static128.method5983();
					for (@Pc(459) int local459 = 0; local459 < 10; local459++) {
						System.gc();
					}
					local394 = (int) ((local385.totalMemory() - local385.freeMemory()) / 1024L);
					Static619.method3013("Memory after cleanup=" + local394 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static619.method3013(Static257.method5456() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static619.method3013("Dropped client connection");
					if (Static107.anInt1746 == 10) {
						Static579.method8316();
					} else if (Static107.anInt1746 == 11) {
						Static246.aBoolean334 = true;
						return;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static197.aClass54_35.method825();
					Static619.method3013("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static410.aClass65_1.method1127();
					Static619.method3013("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static410.aClass65_1.method1139();
					Static619.method3013("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static294.aClass230_3.method5343();
					Static492.aClass295_1.method7019();
					Static410.aClass65_1.method1128();
					Static619.method3013("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static163.method2205();
					Static510.method7465();
					Static619.method3013("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static212.aLong104 = Static515.method7499(73);
					Static240.aBoolean312 = true;
					Static163.method2205();
					Static510.method7465();
					Static619.method3013("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static674.method9280(false, -1, -1, 1);
					if (Static341.method5176() != 1) {
						Static619.method3013("wm1 failed");
						return;
					}
					Static619.method3013("wm1 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static674.method9280(false, -1, -1, 2);
					if (Static341.method5176() == 2) {
						Static619.method3013("wm2 succeeded");
						return;
					}
					Static619.method3013("wm2 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static674.method9280(false, 1024, 768, 3);
					if (Static341.method5176() == 3) {
						Static619.method3013("wm3 succeeded");
						return;
					}
					Static619.method3013("wm3 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static565.method8890(0, false);
					if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 0) {
						Static619.method3013("Entered tk0");
						Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					Static619.method3013("Failed to enter tk0");
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static565.method8890(1, false);
					if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 1) {
						Static619.method3013("Entered tk1");
						Static637.aClass5_Sub20_31.method3194(1, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					Static619.method3013("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static565.method8890(2, false);
					if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() != 2) {
						Static619.method3013("Failed to enter tk2");
						return;
					}
					Static619.method3013("Entered tk2");
					Static637.aClass5_Sub20_31.method3194(2, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
					Static52.method792();
					Static261.aBoolean355 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static565.method8890(3, false);
					if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 3) {
						Static619.method3013("Entered tk3");
						Static637.aClass5_Sub20_31.method3194(3, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					Static619.method3013("Failed to enter tk3");
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static565.method8890(5, false);
					if (Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 5) {
						Static619.method3013("Entered tk5");
						Static637.aClass5_Sub20_31.method3194(5, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					Static619.method3013("Failed to enter tk5");
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static619.method3013("Invalid buildarea value");
						return;
					}
					local374 = Static595.method8613(arg2.substring(6));
					if (local374 >= 0 && Static536.method7908(Static329.anInt5875) >= local374) {
						Static637.aClass5_Sub20_31.method3194(local374, Static637.aClass5_Sub20_31.aClass24_Sub26_1);
						Static52.method792();
						Static261.aBoolean355 = false;
						Static619.method3013("maxbuildarea=" + Static637.aClass5_Sub20_31.aClass24_Sub26_1.method8058());
						return;
					}
					Static619.method3013("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static619.method3013("Invalid rect_debug value");
						return;
					}
					Static455.anInt7798 = Static595.method8613(arg2.substring(10).trim());
					Static619.method3013("rect_debug=" + Static455.anInt7798);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static206.aBoolean269 = true;
					Static619.method3013("qa_op_test=" + Static206.aBoolean269);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static315.aBoolean431 = !Static315.aBoolean431;
					Static619.method3013("clipcomponents=" + Static315.aBoolean431);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(1160) boolean local1160 = Static457.aClass57_11.method7711();
					if (!Static664.method9167(!local1160)) {
						Static619.method3013("Failed to enable bloom");
						return;
					}
					if (local1160) {
						Static619.method3013("Bloom disabled");
						return;
					}
					Static619.method3013("Bloom enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static95.aBoolean147) {
						Static95.aBoolean147 = false;
						Static619.method3013("Forced tweening disabled.");
						return;
					}
					Static95.aBoolean147 = true;
					Static619.method3013("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (!Static572.aBoolean460) {
						Static619.method3013("Shift-click ENABLED!");
						Static572.aBoolean460 = true;
						return;
					}
					Static619.method3013("Shift-click disabled.");
					Static572.aBoolean460 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static619.method3013("x:" + (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 >> 9) + " z:" + (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static619.method3013("Height: " + Static242.aClass22Array3[Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145].method8038(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 >> 9, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static345.aClass208_78.method5004();
					Static345.aClass208_78.method5001();
					Static645.aClass256_4.method5931();
					Static2.aClass33_1.method655();
					Static510.method7465();
					Static619.method3013("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static457.aClass57_11.method7707()) {
						local374 = Integer.parseInt(arg2.substring(3));
						if (local374 < 1) {
							local374 = 1;
						} else if (local374 > 4) {
							local374 = 4;
						}
						Static453.anInt7760 = local374;
						Static163.method2205();
						Static619.method3013("Render cores now: " + Static453.anInt7760);
						return;
					}
					Static619.method3013("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static619.method3013("I(s): " + Static171.aClass391_16.method9284() + "/" + Static171.aClass391_16.method9279());
					Static619.method3013("I(m): " + Static536.aClass391_51.method9284() + "/" + Static536.aClass391_51.method9279());
					Static619.method3013("O(s): " + Static201.aClass127_1.aClass389_1.method9255() + "/" + Static201.aClass127_1.aClass389_1.method9252());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static619.method3013("Pos: " + Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 + "," + (Static622.anInt10188 + (Static532.anInt9189 >> 9) >> 6) + "," + (Static668.anInt10683 + (Static489.anInt8202 >> 9) >> 6) + "," + ((Static532.anInt9189 >> 9) + Static622.anInt10188 & 0x3F) + "," + (Static668.anInt10683 + (Static489.anInt8202 >> 9) & 0x3F) + " Height: " + (Static380.method5559(Static532.anInt9189, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145, Static489.anInt8202, 0) - Static132.anInt2186));
					Static619.method3013("Look: " + Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145 + "," + (Static569.anInt9543 + Static622.anInt10188 >> 6) + "," + (Static668.anInt10683 + Static218.anInt3558 >> 6) + "," + (Static569.anInt9543 + Static622.anInt10188 & 0x3F) + "," + (Static218.anInt3558 + Static668.anInt10683 & 0x3F) + " Height: " + (Static380.method5559(Static569.anInt9543, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145, Static218.anInt3558, 0) - Static521.anInt8819));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static619.aBoolean273 = !Static619.aBoolean273;
					Static457.aClass57_11.method7701(Static619.aBoolean273);
					Static422.method6309();
					Static619.method3013("showprofiling=" + Static619.aBoolean273);
					return;
				}
				@Pc(1661) String[] local1661;
				@Pc(1652) int local1652;
				if (arg2.startsWith("performancetest")) {
					local374 = -1;
					local1652 = 1000;
					if (arg2.length() > 15) {
						local1661 = Static439.method6502(arg2, ' ');
						try {
							if (local1661.length > 1) {
								local1652 = Integer.parseInt(local1661[1]);
							}
						} catch (@Pc(1672) Throwable local1672) {
						}
						try {
							if (local1661.length > 2) {
								local374 = Integer.parseInt(local1661[2]);
							}
						} catch (@Pc(1685) Throwable local1685) {
						}
					}
					if (local374 == -1) {
						Static619.method3013("Java toolkit: " + Static288.method4701(0, local1652));
						Static619.method3013("SSE toolkit:  " + Static288.method4701(2, local1652));
						Static619.method3013("D3D toolkit:  " + Static288.method4701(3, local1652));
						Static619.method3013("GL toolkit:   " + Static288.method4701(1, local1652));
						Static619.method3013("GLX toolkit:  " + Static288.method4701(5, local1652));
						return;
					}
					Static619.method3013("Performance: " + Static288.method4701(local374, local1652));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static243.aBoolean324 = !Static243.aBoolean324;
					Static619.method3013("nonpcs=" + Static243.aBoolean324);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static373.method5464();
					Static619.method3013("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local374 = Integer.parseInt(arg2.substring(12));
					Static165.method2325(local374, Static30.method492(local374).aString66);
					Static619.method3013("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static619.method3013("w: " + Static197.aClass54_35.anInt869);
					return;
				}
				@Pc(1884) Class5_Sub50 local1884;
				if (arg2.startsWith("pc")) {
					local1884 = Static457.method6722(Static651.aClass387_122, Static80.aClass313_1);
					local1884.aClass5_Sub23_Sub2_2.method8502(0);
					local1652 = local1884.aClass5_Sub23_Sub2_2.anInt9869;
					local394 = arg2.indexOf(" ", 4);
					local1884.aClass5_Sub23_Sub2_2.method8538(arg2.substring(3, local394));
					Static508.method7446(arg2.substring(local394), local1884.aClass5_Sub23_Sub2_2);
					local1884.aClass5_Sub23_Sub2_2.method8541(local1884.aClass5_Sub23_Sub2_2.anInt9869 - local1652);
					Static494.method7120(local1884);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static553.method8002();
					Static619.method3013("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local374 = 0; local374 < Static21.anIntArray24.length; local374++) {
						if (Static433.aBooleanArray17[local374]) {
							Static21.anIntArray24[local374] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static21.anIntArray24[local374] *= -1;
							}
						}
					}
					Static553.method8002();
					Static619.method3013("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static654.aBoolean774 = true;
					Static510.method7465();
					Static619.method3013("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static654.aBoolean774 = false;
					Static510.method7465();
					Static619.method3013("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static234.method3394(-6177);
					Static619.method3013("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static619.method3013(Static80.method1205() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local374 = Integer.parseInt(arg2.substring(17));
					Static619.method3013("varpbit=" + Static413.aClass118_1.method2141(local374));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local374 = Integer.parseInt(arg2.substring(14));
					Static619.method3013("varp=" + Static413.aClass118_1.method2140(local374));
					return;
				}
				@Pc(2143) String[] local2143;
				if (arg2.startsWith("directlogin")) {
					local2143 = Static439.method6502(arg2.substring(12), ' ');
					if (local2143.length >= 2) {
						local1652 = local2143.length <= 2 ? 0 : Integer.parseInt(local2143[2]);
						Static133.method1930(local2143[1], local1652, local2143[0]);
						return;
					}
				}
				if (arg2.startsWith("snlogin ")) {
					local2143 = Static439.method6502(arg2.substring(8), ' ');
					local1652 = Integer.parseInt(local2143[0]);
					local394 = local2143.length == 2 ? Integer.parseInt(local2143[1]) : 0;
					Static248.method3643(local394, (byte) 95, local1652);
					return;
				}
				if (arg2.startsWith("csprofileclear")) {
					Static173.method2507();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static173.method2519();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static173.method2519();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local374 = Integer.parseInt(arg2.substring(8));
					Static457.aClass57_11.method7650(local374);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static619.method3013("Active streams: " + Static91.aClass5_Sub16_Sub1_1.method2550());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static59.method842();
					Static619.method3013("Complete. Toolkit now: " + Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static619.method3013(Static454.aClient1.method1228());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static359.aString85.startsWith("win")) {
						Static474.method6912(new File("C:\\Temp\\heap.dump"));
					} else {
						Static474.method6912(new File("/tmp/heap.dump"));
					}
					Static619.method3013("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static619.method3013("Name: " + Static359.aString85);
					Static619.method3013("Arch: " + Static359.aString82);
					Static619.method3013("Ver: " + Static359.aString84);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local374 = Integer.parseInt(arg2.substring(8, 9));
					Static669.anInt10710 = local374;
					Static163.method2205();
					Static619.method3013("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local374 = arg2.indexOf(32);
					if (local374 < 0) {
						Static619.method3013("Syntax: ortho <n>");
						return;
					}
					local1652 = Static595.method8613(arg2.substring(local374 + 1));
					Static637.aClass5_Sub20_31.method3194(local1652, Static637.aClass5_Sub20_31.aClass24_Sub23_1);
					Static52.method792();
					Static261.aBoolean355 = false;
					Static601.method8649();
					if (local1652 != Static637.aClass5_Sub20_31.aClass24_Sub23_1.method7045()) {
						Static619.method3013("Failed to change ortho mode");
						return;
					}
					Static619.method3013("Successfully changed ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static637.aClass5_Sub20_31.aClass24_Sub23_1.method7045() == 0) {
						Static619.method3013("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local374 = Static595.method8613(arg2.substring(arg2.indexOf(32) + 1));
					Static243.anInt4191 = local374;
					Static619.method3013("orthozoom=" + Static243.anInt4191);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local374 = Static595.method8613(arg2.substring(arg2.indexOf(32) + 1));
					Static253.anInt4357 = local374;
					Static574.anInt9623 = local374;
					Static619.method3013("ortho tile size=" + local374);
					Static601.method8649();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static167.aBoolean238 = !Static167.aBoolean238;
					Static619.method3013("ortho camera lock is " + (Static167.aBoolean238 ? "on" : "off"));
					return;
				}
				@Pc(2631) File local2631;
				if (arg2.startsWith("setoutput ")) {
					local2631 = new File(arg2.substring(10));
					if (local2631.exists()) {
						local2631 = new File(arg2.substring(10) + "." + Static515.method7499(101) + ".log");
						if (local2631.exists()) {
							Static619.method3013("file already exists!");
							return;
						}
					}
					if (Static2.aFileOutputStream1 != null) {
						Static2.aFileOutputStream1.close();
						Static2.aFileOutputStream1 = null;
					}
					try {
						Static2.aFileOutputStream1 = new FileOutputStream(local2631);
						return;
					} catch (@Pc(2680) FileNotFoundException local2680) {
						Static619.method3013("Could not create " + local2631.getName());
						return;
					} catch (@Pc(2694) SecurityException local2694) {
						Static619.method3013("Cannot write to " + local2631.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static2.aFileOutputStream1 != null) {
						Static2.aFileOutputStream1.close();
					}
					Static2.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local2631 = new File(arg2.substring(10));
					if (!local2631.exists()) {
						Static619.method3013("No such file");
						return;
					}
					@Pc(2753) byte[] local2753 = Static443.method6568(local2631);
					if (local2753 == null) {
						Static619.method3013("Failed to read file");
						return;
					}
					local1661 = Static439.method6502(Static642.method8953(Static585.method8417(local2753), ""), '\n');
					Static201.method2887(local1661);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2791) short local2791 = (short) Static595.method8613(arg2.substring(5));
					if (local2791 > 0) {
						Static494.aShort99 = local2791;
					}
					return;
				}
				if (Static107.anInt1746 == 10) {
					local1884 = Static457.method6722(Static84.aClass387_22, Static80.aClass313_1);
					local1884.aClass5_Sub23_Sub2_2.method8502(arg2.length() + 3);
					local1884.aClass5_Sub23_Sub2_2.method8502(arg0 ? 1 : 0);
					local1884.aClass5_Sub23_Sub2_2.method8502(arg1 ? 1 : 0);
					local1884.aClass5_Sub23_Sub2_2.method8538(arg2);
					Static494.method7120(local1884);
				}
				if (arg2.startsWith("fps ") && Static408.aClass201_8 != Static570.aClass201_10) {
					Static400.method5896(Static595.method8613(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2872) Exception local2872) {
				Static619.method3013(Static582.aClass335_4.method8349(Static323.anInt5795));
				return;
			}
		}
		if (Static107.anInt1746 != 10) {
			Static619.method3013(Static582.aClass335_5.method8349(Static323.anInt5795) + arg2);
		}
	}
}
