import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!pn", name = "D", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_166 = new Class200(118, 0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6359(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Ljava/lang/String;IZZ)V")
	public static void method6362(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Static575.method7997("commands - This command");
				Static575.method7997("cls - Clear console");
				Static575.method7997("displayfps - Toggle FPS and other information");
				Static575.method7997("renderer - Print graphics renderer information");
				Static575.method7997("heap - Print java memory information");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static523.anInt8450 = 0;
				Static91.anInt2239 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				Static238.aBoolean585 = !Static238.aBoolean585;
				if (Static238.aBoolean585) {
					Static575.method7997("FPS on");
					return;
				}
				Static575.method7997("FPS off");
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(63) Class240 local63 = Static141.aClass13_27.method8135();
				Static575.method7997("Vendor: " + local63.anInt6638);
				Static575.method7997("Name: " + local63.aString55);
				Static575.method7997("Version: " + local63.anInt6640);
				Static575.method7997("Device: " + local63.aString54);
				Static575.method7997("Driver Version: " + local63.aLong168);
				return;
			}
			if (arg0.equals("heap")) {
				Static575.method7997("Heap: " + Static79.anInt2093 + "MB");
				return;
			}
		} catch (@Pc(137) Exception local137) {
			Static575.method7997(Static573.aClass345_4.method7951(Static496.anInt7407));
			return;
		}
		if (Static392.aClass373_6 != Static242.aClass373_4 || Static463.anInt7496 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static575.method7997("FPS: " + Static91.anInt2244);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static79.aBoolean178 = !Static79.aBoolean178;
					if (Static79.aBoolean178) {
						Static575.method7997("Occlsion now on!");
						return;
					}
					Static575.method7997("Occlsion now off!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Static238.aBoolean585 = true;
					Static575.method7997("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Static238.aBoolean585 = false;
					Static575.method7997("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static575.method7997("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static153.aClass2_Sub42_1.anInt9302 + "Mb");
						return;
					} catch (@Pc(247) Throwable local247) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static187.aClass19_5.method565();
					Static575.method7997("Text coords cleared");
					return;
				}
				@Pc(287) int local287;
				@Pc(267) int local267;
				@Pc(277) Runtime local277;
				if (arg0.equalsIgnoreCase("gc")) {
					Static258.method4283();
					for (local267 = 0; local267 < 10; local267++) {
						System.gc();
					}
					local277 = Runtime.getRuntime();
					local287 = (int) ((local277.totalMemory() - local277.freeMemory()) / 1024L);
					Static575.method7997("mem=" + local287 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("compact")) {
					Static258.method4283();
					for (local267 = 0; local267 < 10; local267++) {
						System.gc();
					}
					local277 = Runtime.getRuntime();
					local287 = (int) ((local277.totalMemory() - local277.freeMemory()) / 1024L);
					Static575.method7997("Memory before cleanup=" + local287 + "k");
					Static287.method8820();
					Static258.method4283();
					for (@Pc(341) int local341 = 0; local341 < 10; local341++) {
						System.gc();
					}
					local287 = (int) ((local277.totalMemory() - local277.freeMemory()) / 1024L);
					Static575.method7997("Memory after cleanup=" + local287 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static575.method7997(Static360.method5384() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static575.method7997("Dropped client connection");
					if (Static454.anInt7416 == 10) {
						Static271.method4448();
						return;
					}
					if (Static454.anInt7416 == 11) {
						Static236.aBoolean321 = true;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static262.aClass155_9.method3615();
					Static575.method7997("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					Static194.aClass322_2.method7433();
					Static575.method7997("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					Static194.aClass322_2.method7430();
					Static575.method7997("Dropped server js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static265.aClass286_3.method6579();
					Static341.aClass22_4.method7462();
					Static194.aClass322_2.method7434();
					Static575.method7997("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static592.method8366();
					Static191.method3265();
					Static575.method7997("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static552.aLong8 = Static48.method1203();
					Static272.aBoolean376 = true;
					Static592.method8366();
					Static191.method3265();
					Static575.method7997("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static63.method1431(-1, false, 1, -1);
					if (Static402.method6006() == 1) {
						Static575.method7997("wm1 succeeded");
						return;
					}
					Static575.method7997("wm1 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static63.method1431(-1, false, 2, -1);
					if (Static402.method6006() == 2) {
						Static575.method7997("wm2 succeeded");
						return;
					}
					Static575.method7997("wm2 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static63.method1431(1024, false, 3, 768);
					if (Static402.method6006() == 3) {
						Static575.method7997("wm3 succeeded");
						return;
					}
					Static575.method7997("wm3 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static99.method1936(false, 0);
					if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() == 0) {
						Static575.method7997("Entered tk0");
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, 0);
						Static531.method7366();
						Static406.aBoolean496 = false;
						return;
					}
					Static575.method7997("Failed to enter tk0");
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static99.method1936(false, 1);
					if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() == 1) {
						Static575.method7997("Entered tk1");
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, 1);
						Static531.method7366();
						Static406.aBoolean496 = false;
						return;
					}
					Static575.method7997("Failed to enter tk1");
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static99.method1936(false, 2);
					if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() == 2) {
						Static575.method7997("Entered tk2");
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, 2);
						Static531.method7366();
						Static406.aBoolean496 = false;
						return;
					}
					Static575.method7997("Failed to enter tk2");
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static99.method1936(false, 3);
					if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() != 3) {
						Static575.method7997("Failed to enter tk3");
						return;
					}
					Static575.method7997("Entered tk3");
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, 3);
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static99.method1936(false, 5);
					if (Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687() != 5) {
						Static575.method7997("Failed to enter tk5");
						return;
					}
					Static575.method7997("Entered tk5");
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub28_2, 5);
					Static531.method7366();
					Static406.aBoolean496 = false;
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static575.method7997("Invalid buildarea value");
						return;
					}
					local267 = Static307.method4785(arg0.substring(6));
					if (local267 >= 0 && local267 <= Static247.method4169(Static79.anInt2093)) {
						Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub4_1, local267);
						Static531.method7366();
						Static406.aBoolean496 = false;
						Static575.method7997("maxbuildarea=" + Static305.aClass2_Sub49_15.aClass33_Sub4_1.method1937());
						return;
					}
					Static575.method7997("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static575.method7997("Invalid rect_debug value");
						return;
					}
					Static108.anInt2358 = Static307.method4785(arg0.substring(10).trim());
					Static575.method7997("rect_debug=" + Static108.anInt2358);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static179.aBoolean273 = true;
					Static575.method7997("qa_op_test=" + Static179.aBoolean273);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static342.aBoolean426 = !Static342.aBoolean426;
					Static575.method7997("clipcomponents=" + Static342.aBoolean426);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(860) boolean local860 = Static141.aClass13_27.method8093();
					if (!Static431.method6717(!local860)) {
						Static575.method7997("Failed to enable bloom");
						return;
					}
					if (local860) {
						Static575.method7997("Bloom disabled");
						return;
					}
					Static575.method7997("Bloom enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (Static462.aBoolean531) {
						Static462.aBoolean531 = false;
						Static575.method7997("Forced tweening disabled.");
						return;
					}
					Static462.aBoolean531 = true;
					Static575.method7997("Forced tweening ENABLED!");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (Static404.aBoolean492) {
						Static575.method7997("Shift-click disabled.");
						Static404.aBoolean492 = false;
						return;
					}
					Static575.method7997("Shift-click ENABLED!");
					Static404.aBoolean492 = true;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static575.method7997("x:" + (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 >> 9) + " z:" + (Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static575.method7997("Height: " + Static511.aClass91Array3[Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109].method7447(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 >> 9, Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static497.aClass238_223.method5576();
					Static497.aClass238_223.method5577();
					Static108.aClass79_1.method1972();
					Static240.aClass336_5.method7856();
					Static191.method3265();
					Static575.method7997("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (Static141.aClass13_27.method8167()) {
						local267 = Integer.parseInt(arg0.substring(3));
						if (local267 < 1) {
							local267 = 1;
						} else if (local267 > 4) {
							local267 = 4;
						}
						Static58.anInt1440 = local267;
						Static592.method8366();
						Static575.method7997("Render cores now: " + Static58.anInt1440);
						return;
					}
					Static575.method7997("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static575.method7997("I(s): " + Static611.aClass69_69.method1907() + "/" + Static611.aClass69_69.method1911());
					Static575.method7997("I(m): " + Static199.aClass69_65.method1907() + "/" + Static199.aClass69_65.method1911());
					Static575.method7997("O(s): " + Static470.aClass250_1.aClass335_1.method7840() + "/" + Static470.aClass250_1.aClass335_1.method7839());
					return;
				}
				if (arg0.equalsIgnoreCase("getcamerapos")) {
					Static575.method7997("Pos: " + Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 + "," + ((Static576.anInt9403 >> 9) + Static406.anInt6899 >> 6) + "," + ((Static63.anInt1715 >> 9) + Static338.anInt5885 >> 6) + "," + (Static406.anInt6899 + (Static576.anInt9403 >> 9) & 0x3F) + "," + ((Static63.anInt1715 >> 9) + Static338.anInt5885 & 0x3F) + " Height: " + (Static392.method5799(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109, Static576.anInt9403, Static63.anInt1715) - Static479.anInt7769));
					Static575.method7997("Look: " + Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109 + "," + (Static406.anInt6899 + Static510.anInt8225 >> 6) + "," + (Static338.anInt5885 + Static379.anInt6616 >> 6) + "," + (Static510.anInt8225 + Static406.anInt6899 & 0x3F) + "," + (Static338.anInt5885 + Static379.anInt6616 & 0x3F) + " Height: " + (Static392.method5799(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.aByte109, Static510.anInt8225, Static379.anInt6616) - Static439.anInt7210));
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static60.aBoolean132 = !Static60.aBoolean132;
					Static141.aClass13_27.method8140(Static60.aBoolean132);
					Static34.method758();
					Static575.method7997("showprofiling=" + Static60.aBoolean132);
					return;
				}
				@Pc(1262) String[] local1262;
				@Pc(1251) int local1251;
				if (arg0.startsWith("performancetest")) {
					local267 = -1;
					local1251 = 1000;
					if (arg0.length() > 15) {
						local1262 = Static386.method5691(' ', arg0);
						try {
							if (local1262.length > 1) {
								local1251 = Integer.parseInt(local1262[1]);
							}
						} catch (@Pc(1273) Throwable local1273) {
						}
						try {
							if (local1262.length > 2) {
								local267 = Integer.parseInt(local1262[2]);
							}
						} catch (@Pc(1286) Throwable local1286) {
						}
					}
					if (local267 == -1) {
						Static575.method7997("Java toolkit: " + Static125.method2245(0, local1251));
						Static575.method7997("SSE toolkit:  " + Static125.method2245(2, local1251));
						Static575.method7997("D3D toolkit:  " + Static125.method2245(3, local1251));
						Static575.method7997("GL toolkit:   " + Static125.method2245(1, local1251));
						Static575.method7997("GLX toolkit:  " + Static125.method2245(5, local1251));
						return;
					}
					Static575.method7997("Performance: " + Static125.method2245(local267, local1251));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static55.aBoolean128 = !Static55.aBoolean128;
					Static575.method7997("nonpcs=" + Static55.aBoolean128);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static18.method521();
					Static575.method7997("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local267 = Integer.parseInt(arg0.substring(12));
					Static426.method6218(Static640.method8786(local267).aString112, local267);
					Static575.method7997("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static575.method7997("w: " + Static262.aClass155_9.anInt4152);
					return;
				}
				@Pc(1440) Class2_Sub31 local1440;
				if (arg0.startsWith("pc")) {
					local1440 = Static275.method4480(Static640.aClass314_2, Static46.aClass145_96);
					local1440.aClass2_Sub17_Sub1_2.method2837(0);
					local1251 = local1440.aClass2_Sub17_Sub1_2.anInt3378;
					local287 = arg0.indexOf(" ", 4);
					local1440.aClass2_Sub17_Sub1_2.method2856(arg0.substring(3, local287));
					Static476.method6755(local1440.aClass2_Sub17_Sub1_2, arg0.substring(local287));
					local1440.aClass2_Sub17_Sub1_2.method2840(local1440.aClass2_Sub17_Sub1_2.anInt3378 - local1251);
					Static526.method7309(local1440);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static293.method4635();
					Static575.method7997("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local267 = 0; local267 < Static450.anIntArray501.length; local267++) {
						if (Static226.aBooleanArray6[local267]) {
							Static450.anIntArray501[local267] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static450.anIntArray501[local267] *= -1;
							}
						}
					}
					Static293.method4635();
					Static575.method7997("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static644.aBoolean756 = true;
					Static191.method3265();
					Static575.method7997("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static644.aBoolean756 = false;
					Static191.method3265();
					Static575.method7997("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static116.method2086();
					Static575.method7997("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static575.method7997(Static189.method3248() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local267 = Integer.parseInt(arg0.substring(17));
					Static575.method7997("varpbit=" + Static382.aClass282_1.method6472(local267));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local267 = Integer.parseInt(arg0.substring(14));
					Static575.method7997("varp=" + Static382.aClass282_1.method6473(local267));
					return;
				}
				if (arg0.startsWith("directlogin")) {
					@Pc(1645) String[] local1645 = Static386.method5691(' ', arg0.substring(12));
					if (local1645.length >= 2) {
						local1251 = local1645.length <= 2 ? 0 : Integer.parseInt(local1645[2]);
						Static343.method5199(local1645[1], local1645[0], local1251);
						return;
					}
				}
				if (arg0.startsWith("csprofileclear")) {
					Static156.method2738();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static156.method2731();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static156.method2731();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local267 = Integer.parseInt(arg0.substring(8));
					Static141.aClass13_27.method8113(local267);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static575.method7997("Active streams: " + Static622.aClass2_Sub11_Sub2_2.method2955());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static435.method6281();
					Static575.method7997("Complete. Toolkit now: " + Static305.aClass2_Sub49_15.aClass33_Sub28_1.method8687());
					return;
				}
				if (arg0.equals("errormessage")) {
					Static575.method7997(Static509.aClient1.method1714());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static465.aString65.startsWith("win")) {
						Static232.method3731(new File("C:\\Temp\\heap.dump"));
					} else {
						Static232.method3731(new File("/tmp/heap.dump"));
					}
					Static575.method7997("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static575.method7997("Name: " + Static465.aString65);
					Static575.method7997("Arch: " + Static465.aString68);
					Static575.method7997("Ver: " + Static465.aString67);
					return;
				}
				if (arg0.startsWith("w2debug")) {
					local267 = Integer.parseInt(arg0.substring(8, 9));
					Static642.anInt10397 = local267;
					Static592.method8366();
					Static575.method7997("Toggled!");
					return;
				}
				if (arg0.startsWith("ortho ")) {
					local267 = arg0.indexOf(32);
					if (local267 < 0) {
						Static575.method7997("Syntax: ortho <n>");
						return;
					}
					local1251 = Static307.method4785(arg0.substring(local267 + 1));
					Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub14_1, local1251);
					Static531.method7366();
					Static406.aBoolean496 = false;
					Static7.method101();
					if (local1251 == Static305.aClass2_Sub49_15.aClass33_Sub14_1.method4886()) {
						Static575.method7997("Successfully changed ortho mode");
						return;
					}
					Static575.method7997("Failed to change ortho mode");
					return;
				}
				if (arg0.startsWith("orthozoom ")) {
					if (Static305.aClass2_Sub49_15.aClass33_Sub14_1.method4886() == 0) {
						Static575.method7997("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local267 = Static307.method4785(arg0.substring(arg0.indexOf(32) + 1));
					Static529.anInt8507 = local267;
					Static575.method7997("orthozoom=" + Static529.anInt8507);
					return;
				}
				if (arg0.startsWith("orthotilesize ")) {
					local267 = Static307.method4785(arg0.substring(arg0.indexOf(32) + 1));
					Static222.anInt4144 = local267;
					Static513.anInt8649 = local267;
					Static575.method7997("ortho tile size=" + local267);
					Static7.method101();
					return;
				}
				if (arg0.equals("orthocamlock")) {
					Static56.aBoolean129 = !Static56.aBoolean129;
					Static575.method7997("ortho camera lock is " + (Static56.aBoolean129 ? "on" : "off"));
					return;
				}
				@Pc(1994) File local1994;
				if (arg0.startsWith("setoutput ")) {
					local1994 = new File(arg0.substring(10));
					if (local1994.exists()) {
						local1994 = new File(arg0.substring(10) + "." + Static48.method1203() + ".log");
						if (local1994.exists()) {
							Static575.method7997("file already exists!");
							return;
						}
					}
					if (Static249.aFileOutputStream1 != null) {
						Static249.aFileOutputStream1.close();
						Static249.aFileOutputStream1 = null;
					}
					try {
						Static249.aFileOutputStream1 = new FileOutputStream(local1994);
						return;
					} catch (@Pc(2036) FileNotFoundException local2036) {
						Static575.method7997("Could not create " + local1994.getName());
						return;
					} catch (@Pc(2048) SecurityException local2048) {
						Static575.method7997("Cannot write to " + local1994.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Static249.aFileOutputStream1 != null) {
						Static249.aFileOutputStream1.close();
					}
					Static249.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local1994 = new File(arg0.substring(10));
					if (!local1994.exists()) {
						Static575.method7997("No such file");
						return;
					}
					@Pc(2092) byte[] local2092 = Static27.method630(local1994);
					if (local2092 == null) {
						Static575.method7997("Failed to read file");
						return;
					}
					local1262 = Static386.method5691('\n', Static349.method5247(Static119.method2128(local2092), ""));
					Static170.method2961(local1262);
				}
				if (arg0.startsWith("zoom ")) {
					@Pc(2123) short local2123 = (short) Static307.method4785(arg0.substring(5));
					if (local2123 > 0) {
						Static101.aShort42 = local2123;
					}
					return;
				}
				if (Static454.anInt7416 == 10) {
					local1440 = Static275.method4480(Static640.aClass314_2, Static83.aClass145_36);
					local1440.aClass2_Sub17_Sub1_2.method2837(arg0.length() + 3);
					local1440.aClass2_Sub17_Sub1_2.method2837(arg1 ? 1 : 0);
					local1440.aClass2_Sub17_Sub1_2.method2837(arg2 ? 1 : 0);
					local1440.aClass2_Sub17_Sub1_2.method2856(arg0);
					Static526.method7309(local1440);
				}
				if (arg0.startsWith("fps ") && Static392.aClass373_6 != Static242.aClass373_4) {
					Static535.method7426(Static307.method4785(arg0.substring(4)));
					return;
				}
			} catch (@Pc(2192) Exception local2192) {
				Static575.method7997(Static573.aClass345_4.method7951(Static496.anInt7407));
				return;
			}
		}
		if (Static454.anInt7416 != 10) {
			Static575.method7997(Static573.aClass345_5.method7951(Static496.anInt7407) + arg0);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IZLclient!cc;)V")
	public static void method6363(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class16_Sub1_Sub1_Sub3_Sub1 arg1) {
		if (Static633.anInt10265 >= 400) {
			return;
		}
		@Pc(14) Class113 local14 = arg1.aClass113_1;
		@Pc(17) String local17 = arg1.aString15;
		if (local14.anIntArray213 != null) {
			local14 = local14.method2752(Static382.aClass282_1);
			local17 = local14.aString31;
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean254) {
			return;
		}
		if (arg1.anInt1684 != 0) {
			@Pc(51) String local51 = Static51.aClass17_2 == Static112.aClass17_3 ? Static573.aClass345_32.method7951(Static496.anInt7407) : Static573.aClass345_30.method7951(Static496.anInt7407);
			local17 = local17 + Static482.method6816(Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8144, arg1.anInt1684) + " (" + local51 + arg1.anInt1684 + ")";
		}
		if (Static557.aBoolean660 && !arg0) {
			@Pc(89) Class328 local89 = Static404.anInt6894 == -1 ? null : Static106.aClass293_1.method6807(Static404.anInt6894);
			if ((Static613.anInt10082 & 0x2) != 0 && (local89 == null || local14.method2744(local89.anInt8782, Static404.anInt6894) != local89.anInt8782)) {
				Static244.method4145((long) arg1.anInt8075, (long) arg1.anInt8075, false, true, Static80.aString17 + " -> <col=ffff00>" + local17, -1, Static237.anInt4365, 11, 0, Static184.aString32, false, 0);
			}
		}
		if (!arg0) {
			@Pc(150) String[] local150 = local14.aStringArray21;
			if (Static211.aBoolean300) {
				local150 = Static584.method8075(local150);
			}
			@Pc(160) int local160;
			if (local150 != null) {
				for (local160 = 4; local160 >= 0; local160--) {
					if (local150[local160] != null && (local14.aByte60 == 0 || !local150[local160].equalsIgnoreCase(Static573.aClass345_25.method7951(Static496.anInt7407)))) {
						@Pc(183) byte local183 = 0;
						if (local160 == 0) {
							local183 = 12;
						}
						@Pc(189) int local189 = Static565.anInt9269;
						if (local160 == 1) {
							local183 = 60;
						}
						if (local160 == 2) {
							local183 = 58;
						}
						if (local160 == 3) {
							local183 = 25;
						}
						if (local160 == local14.anInt3232) {
							local189 = local14.anInt3221;
						}
						if (local160 == 4) {
							local183 = 4;
						}
						if (local160 == local14.anInt3223) {
							local189 = local14.anInt3203;
						}
						Static244.method4145((long) arg1.anInt8075, (long) arg1.anInt8075, false, true, "<col=ffff00>" + local17, -1, local150[local160].equalsIgnoreCase(Static573.aClass345_25.method7951(Static496.anInt7407)) ? local14.anInt3206 : local189, local183, 0, local150[local160], false, 0);
					}
				}
			}
			if (local14.aByte60 == 1 && local150 != null) {
				for (local160 = 4; local160 >= 0; local160--) {
					if (local150[local160] != null && local150[local160].equalsIgnoreCase(Static573.aClass345_25.method7951(Static496.anInt7407))) {
						@Pc(307) short local307 = 0;
						if (arg1.anInt1684 > Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8144) {
							local307 = 2000;
						}
						@Pc(320) short local320 = 0;
						if (local160 == 0) {
							local320 = 12;
						}
						if (local160 == 1) {
							local320 = 60;
						}
						if (local160 == 2) {
							local320 = 58;
						}
						if (local160 == 3) {
							local320 = 25;
						}
						if (local160 == 4) {
							local320 = 4;
						}
						if (local320 != 0) {
							local320 += local307;
						}
						Static244.method4145((long) arg1.anInt8075, (long) arg1.anInt8075, false, true, "<col=ffff00>" + local17, -1, local14.anInt3206, local320, 0, local150[local160], false, 0);
					}
				}
			}
		}
		Static244.method4145((long) arg1.anInt8075, (long) arg1.anInt8075, arg0, true, "<col=ffff00>" + local17, -1, Static36.anInt790, 1001, 0, Static573.aClass345_24.method7951(Static496.anInt7407), false, 0);
	}
}
