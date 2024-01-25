import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!tea", name = "y", descriptor = "I")
	public static int anInt8903 = 1;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IB)Z")
	public static boolean method7479(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IZLjava/lang/String;Z)V")
	public static void method7480(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
				Static338.method4547("commands - This command");
				Static338.method4547("cls - Clear console");
				Static338.method4547("displayfps - Toggle FPS and other information");
				Static338.method4547("renderer - Print graphics renderer information");
				Static338.method4547("heap - Print java memory information");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static294.anInt4813 = 0;
				Static16.anInt222 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("displayfps")) {
				Static80.aBoolean117 = !Static80.aBoolean117;
				if (!Static80.aBoolean117) {
					Static338.method4547("FPS off");
					return;
				}
				Static338.method4547("FPS on");
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(65) Class117 local65 = Static192.aClass95_4.method7008();
				Static338.method4547("Vendor: " + local65.anInt3083);
				Static338.method4547("Name: " + local65.aString29);
				Static338.method4547("Version: " + local65.anInt3084);
				Static338.method4547("Device: " + local65.aString28);
				Static338.method4547("Driver Version: " + local65.aLong91);
				return;
			}
			if (arg1.equals("heap")) {
				Static338.method4547("Heap: " + Static234.anInt10094 + "MB");
				return;
			}
		} catch (@Pc(133) Exception local133) {
			Static338.method4547(Static434.aClass271_2.method5972(Static483.anInt7694));
			return;
		}
		if (Static162.aClass80_2 != Static252.aClass80_3 || Static165.anInt5949 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static338.method4547("FPS: " + Static70.anInt1230);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static220.aBoolean257 = !Static220.aBoolean257;
					if (Static220.aBoolean257) {
						Static338.method4547("Occlsion now on!");
						return;
					}
					Static338.method4547("Occlsion now off!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static80.aBoolean117 = true;
					Static338.method4547("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static80.aBoolean117 = false;
					Static338.method4547("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static338.method4547("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(244) Throwable local244) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static246.aClass171_4.method3755();
					Static338.method4547("Text coords cleared");
					return;
				}
				@Pc(282) int local282;
				@Pc(264) int local264;
				@Pc(273) Runtime local273;
				if (arg1.equalsIgnoreCase("gc")) {
					Static378.method8123();
					for (local264 = 0; local264 < 10; local264++) {
						System.gc();
					}
					local273 = Runtime.getRuntime();
					local282 = (int) ((local273.totalMemory() - local273.freeMemory()) / 1024L);
					Static338.method4547("mem=" + local282 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("compact")) {
					Static378.method8123();
					for (local264 = 0; local264 < 10; local264++) {
						System.gc();
					}
					local273 = Runtime.getRuntime();
					local282 = (int) ((local273.totalMemory() - local273.freeMemory()) / 1024L);
					Static338.method4547("Memory before cleanup=" + local282 + "k");
					Static237.method3328();
					Static378.method8123();
					for (@Pc(338) int local338 = 0; local338 < 10; local338++) {
						System.gc();
					}
					local282 = (int) ((local273.totalMemory() - local273.freeMemory()) / 1024L);
					Static338.method4547("Memory after cleanup=" + local282 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static338.method4547(Static537.method7409() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static338.method4547("Dropped client connection");
					if (Static324.anInt5145 == 10) {
						Static532.method7363();
						return;
					}
					if (Static324.anInt5145 == 11) {
						Static171.aBoolean226 = true;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static216.aClass326_9.method7370();
					Static338.method4547("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static301.aClass104_3.method2236();
					Static338.method4547("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static301.aClass104_3.method2234();
					Static338.method4547("Dropped server js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static452.aClass226_6.method4850();
					Static155.aClass121_2.method2933();
					Static301.aClass104_3.method2235();
					Static338.method4547("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static566.method7765();
					Static174.method2588();
					Static338.method4547("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static168.aLong90 = Static476.method6413();
					Static356.aBoolean408 = true;
					Static566.method7765();
					Static174.method2588();
					Static338.method4547("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static424.method5664(false, -1, -1, 1);
					if (Static626.method8388() != 1) {
						Static338.method4547("wm1 failed");
						return;
					}
					Static338.method4547("wm1 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static424.method5664(false, -1, -1, 2);
					if (Static626.method8388() != 2) {
						Static338.method4547("wm2 failed");
						return;
					}
					Static338.method4547("wm2 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static424.method5664(false, 1024, 768, 3);
					if (Static626.method8388() != 3) {
						Static338.method4547("wm3 failed");
						return;
					}
					Static338.method4547("wm3 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static317.method4257(false, 0);
					if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() == 0) {
						Static338.method4547("Entered tk0");
						Static234.aClass2_Sub5_48.method176(0, Static234.aClass2_Sub5_48.aClass6_Sub21_1);
						Static329.method4407();
						Static266.aBoolean292 = false;
						return;
					}
					Static338.method4547("Failed to enter tk0");
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static317.method4257(false, 1);
					if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() != 1) {
						Static338.method4547("Failed to enter tk1");
						return;
					}
					Static338.method4547("Entered tk1");
					Static234.aClass2_Sub5_48.method176(1, Static234.aClass2_Sub5_48.aClass6_Sub21_1);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static317.method4257(false, 2);
					if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() != 2) {
						Static338.method4547("Failed to enter tk2");
						return;
					}
					Static338.method4547("Entered tk2");
					Static234.aClass2_Sub5_48.method176(2, Static234.aClass2_Sub5_48.aClass6_Sub21_1);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static317.method4257(false, 3);
					if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() != 3) {
						Static338.method4547("Failed to enter tk3");
						return;
					}
					Static338.method4547("Entered tk3");
					Static234.aClass2_Sub5_48.method176(3, Static234.aClass2_Sub5_48.aClass6_Sub21_1);
					Static329.method4407();
					Static266.aBoolean292 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static317.method4257(false, 5);
					if (Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280() == 5) {
						Static338.method4547("Entered tk5");
						Static234.aClass2_Sub5_48.method176(5, Static234.aClass2_Sub5_48.aClass6_Sub21_1);
						Static329.method4407();
						Static266.aBoolean292 = false;
						return;
					}
					Static338.method4547("Failed to enter tk5");
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static338.method4547("Invalid buildarea value");
						return;
					}
					local264 = Static445.method6066(arg1.substring(6));
					if (local264 >= 0 && Static17.method250(Static234.anInt10094) >= local264) {
						Static234.aClass2_Sub5_48.method176(local264, Static234.aClass2_Sub5_48.aClass6_Sub9_1);
						Static329.method4407();
						Static266.aBoolean292 = false;
						Static338.method4547("maxbuildarea=" + Static234.aClass2_Sub5_48.aClass6_Sub9_1.method3047());
						return;
					}
					Static338.method4547("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static338.method4547("Invalid rect_debug value");
						return;
					}
					Static205.anInt6319 = Static445.method6066(arg1.substring(10).trim());
					Static338.method4547("rect_debug=" + Static205.anInt6319);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static488.aBoolean602 = true;
					Static338.method4547("qa_op_test=" + Static488.aBoolean602);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static150.aBoolean205 = !Static150.aBoolean205;
					Static338.method4547("clipcomponents=" + Static150.aBoolean205);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(843) boolean local843 = Static192.aClass95_4.method6951();
					if (Static570.method7807(!local843)) {
						if (local843) {
							Static338.method4547("Bloom disabled");
							return;
						}
						Static338.method4547("Bloom enabled");
						return;
					}
					Static338.method4547("Failed to enable bloom");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (!Static621.aBoolean729) {
						Static621.aBoolean729 = true;
						Static338.method4547("Forced tweening ENABLED!");
						return;
					}
					Static621.aBoolean729 = false;
					Static338.method4547("Forced tweening disabled.");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (!Static341.aBoolean388) {
						Static338.method4547("Shift-click ENABLED!");
						Static341.aBoolean388 = true;
						return;
					}
					Static338.method4547("Shift-click disabled.");
					Static341.aBoolean388 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static338.method4547("x:" + (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 >> 9) + " z:" + (Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static338.method4547("Height: " + Static314.aClass76Array2[Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127].method7396(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089 >> 9, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static79.aClass380_22.method8632();
					Static79.aClass380_22.method8626();
					Static264.aClass207_3.method4279();
					Static599.aClass197_4.method4164();
					Static174.method2588();
					Static338.method4547("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (!Static192.aClass95_4.method7003()) {
						Static338.method4547("Current toolkit doesn't support multiple cores");
						return;
					}
					local264 = Integer.parseInt(arg1.substring(3));
					if (local264 < 1) {
						local264 = 1;
					} else if (local264 > 4) {
						local264 = 4;
					}
					Static429.anInt6737 = local264;
					Static566.method7765();
					Static338.method4547("Render cores now: " + Static429.anInt6737);
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static338.method4547("I(s): " + Static28.aClass32_7.method636() + "/" + Static28.aClass32_7.method642());
					Static338.method4547("I(m): " + Static489.aClass32_18.method636() + "/" + Static489.aClass32_18.method642());
					Static338.method4547("O(s): " + Static72.aClass225_2.aClass185_1.method3979() + "/" + Static72.aClass225_2.aClass185_1.method3985());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static338.method4547("Pos: " + Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 + "," + ((Static250.anInt4000 >> 9) + Static132.anInt2246 >> 6) + "," + ((Static644.anInt10376 >> 9) + Static123.anInt2176 >> 6) + "," + ((Static250.anInt4000 >> 9) + Static132.anInt2246 & 0x3F) + "," + ((Static644.anInt10376 >> 9) + Static123.anInt2176 & 0x3F) + " Height: " + (Static504.method6917(Static250.anInt4000, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, Static644.anInt10376) - Static220.anInt3605));
					Static338.method4547("Look: " + Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 + "," + (Static132.anInt2246 + Static209.anInt4595 >> 6) + "," + (Static507.anInt8477 + Static123.anInt2176 >> 6) + "," + (Static209.anInt4595 + Static132.anInt2246 & 0x3F) + "," + (Static123.anInt2176 + Static507.anInt8477 & 0x3F) + " Height: " + (Static504.method6917(Static209.anInt4595, Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, Static507.anInt8477) - Static532.anInt8751));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static435.aBoolean240 = !Static435.aBoolean240;
					Static192.aClass95_4.method6988(Static435.aBoolean240);
					Static564.method7733();
					Static338.method4547("showprofiling=" + Static435.aBoolean240);
					return;
				}
				@Pc(1246) String[] local1246;
				@Pc(1235) int local1235;
				if (arg1.startsWith("performancetest")) {
					local264 = -1;
					local1235 = 1000;
					if (arg1.length() > 15) {
						local1246 = Static17.method249(arg1, ' ');
						try {
							if (local1246.length > 1) {
								local1235 = Integer.parseInt(local1246[1]);
							}
						} catch (@Pc(1257) Throwable local1257) {
						}
						try {
							if (local1246.length > 2) {
								local264 = Integer.parseInt(local1246[2]);
							}
						} catch (@Pc(1268) Throwable local1268) {
						}
					}
					if (local264 == -1) {
						Static338.method4547("Java toolkit: " + Static560.method7665(local1235, 0));
						Static338.method4547("SSE toolkit:  " + Static560.method7665(local1235, 2));
						Static338.method4547("D3D toolkit:  " + Static560.method7665(local1235, 3));
						Static338.method4547("GL toolkit:   " + Static560.method7665(local1235, 1));
						Static338.method4547("GLX toolkit:  " + Static560.method7665(local1235, 5));
						return;
					}
					Static338.method4547("Performance: " + Static560.method7665(local1235, Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280()));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static489.aBoolean136 = !Static489.aBoolean136;
					Static338.method4547("nonpcs=" + Static489.aBoolean136);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static6.method108();
					Static338.method4547("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local264 = Integer.parseInt(arg1.substring(12));
					Static33.method588(local264, Static56.method4530(local264).aString20);
					Static338.method4547("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static338.method4547("w: " + Static216.aClass326_9.anInt8758);
					return;
				}
				@Pc(1424) Class2_Sub40 local1424;
				if (arg1.startsWith("pc")) {
					local1424 = Static464.method6285(Static251.aClass131_1, Static175.aClass179_46);
					local1424.aClass2_Sub22_Sub2_2.method8537(0);
					local1235 = local1424.aClass2_Sub22_Sub2_2.anInt10247;
					local282 = arg1.indexOf(" ", 4);
					local1424.aClass2_Sub22_Sub2_2.method8540(arg1.substring(3, local282));
					Static621.method8308(local1424.aClass2_Sub22_Sub2_2, arg1.substring(local282));
					local1424.aClass2_Sub22_Sub2_2.method8514(local1424.aClass2_Sub22_Sub2_2.anInt10247 - local1235);
					Static528.method7295(local1424);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static202.method2859();
					Static338.method4547("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local264 = 0; local264 < Static171.anIntArray203.length; local264++) {
						if (Static410.aBooleanArray116[local264]) {
							Static171.anIntArray203[local264] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static171.anIntArray203[local264] *= -1;
							}
						}
					}
					Static202.method2859();
					Static338.method4547("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static491.aBoolean605 = true;
					Static174.method2588();
					Static338.method4547("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static491.aBoolean605 = false;
					Static174.method2588();
					Static338.method4547("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static88.method1312();
					Static338.method4547("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static338.method4547(Static320.method4287() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local264 = Integer.parseInt(arg1.substring(17));
					Static338.method4547("varpbit=" + Static431.aClass205_1.method4251(local264));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local264 = Integer.parseInt(arg1.substring(14));
					Static338.method4547("varp=" + Static431.aClass205_1.method4252(local264));
					return;
				}
				if (arg1.startsWith("directlogin")) {
					@Pc(1628) String[] local1628 = Static17.method249(arg1.substring(12), ' ');
					if (local1628.length >= 2) {
						local1235 = local1628.length <= 2 ? 0 : Integer.parseInt(local1628[2]);
						Static295.method4070(local1628[1], local1235, local1628[0]);
						return;
					}
				}
				if (arg1.startsWith("csprofileclear")) {
					Static300.method4144();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static300.method4147();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static300.method4147();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local264 = Integer.parseInt(arg1.substring(8));
					Static192.aClass95_4.method6949(local264);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static338.method4547("Active streams: " + Static586.aClass2_Sub13_Sub4_2.method7229());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static251.method3437();
					Static338.method4547("Complete. Toolkit now: " + Static234.aClass2_Sub5_48.aClass6_Sub21_2.method7280());
					return;
				}
				if (arg1.equals("errormessage")) {
					Static338.method4547(Static78.aClient1.method1051());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static359.aString67.startsWith("win")) {
						Static583.method7949(new File("C:\\Temp\\heap.dump"));
					} else {
						Static583.method7949(new File("/tmp/heap.dump"));
					}
					Static338.method4547("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static338.method4547("Name: " + Static359.aString67);
					Static338.method4547("Arch: " + Static359.aString69);
					Static338.method4547("Ver: " + Static359.aString72);
					return;
				}
				if (arg1.startsWith("w2debug")) {
					local264 = Integer.parseInt(arg1.substring(8, 9));
					Static541.anInt8880 = local264;
					Static566.method7765();
					Static338.method4547("Toggled!");
					return;
				}
				if (arg1.startsWith("ortho ")) {
					local264 = arg1.indexOf(32);
					if (local264 < 0) {
						Static338.method4547("Syntax: ortho <n>");
						return;
					}
					local1235 = Static445.method6066(arg1.substring(local264 + 1));
					Static234.aClass2_Sub5_48.method176(local1235, Static234.aClass2_Sub5_48.aClass6_Sub27_1);
					Static329.method4407();
					Static266.aBoolean292 = false;
					Static541.method7472();
					if (local1235 == Static234.aClass2_Sub5_48.aClass6_Sub27_1.method8300()) {
						Static338.method4547("Successfully changed ortho mode");
						return;
					}
					Static338.method4547("Failed to change ortho mode");
					return;
				}
				if (arg1.startsWith("orthozoom ")) {
					if (Static234.aClass2_Sub5_48.aClass6_Sub27_1.method8300() == 0) {
						Static338.method4547("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local264 = Static445.method6066(arg1.substring(arg1.indexOf(32) + 1));
					Static638.anInt7981 = local264;
					Static338.method4547("orthozoom=" + Static638.anInt7981);
					return;
				}
				if (arg1.startsWith("orthotilesize ")) {
					local264 = Static445.method6066(arg1.substring(arg1.indexOf(32) + 1));
					Static555.anInt9085 = local264;
					Static514.anInt8567 = local264;
					Static338.method4547("ortho tile size=" + local264);
					Static541.method7472();
					return;
				}
				if (arg1.equals("orthocamlock")) {
					Static612.aBoolean725 = !Static612.aBoolean725;
					Static338.method4547("ortho camera lock is " + (Static612.aBoolean725 ? "on" : "off"));
					return;
				}
				@Pc(1970) File local1970;
				if (arg1.startsWith("setoutput ")) {
					local1970 = new File(arg1.substring(10));
					if (local1970.exists()) {
						local1970 = new File(arg1.substring(10) + "." + Static476.method6413() + ".log");
						if (local1970.exists()) {
							Static338.method4547("file already exists!");
							return;
						}
					}
					if (Static282.aFileOutputStream5 != null) {
						Static282.aFileOutputStream5.close();
						Static282.aFileOutputStream5 = null;
					}
					try {
						Static282.aFileOutputStream5 = new FileOutputStream(local1970);
						return;
					} catch (@Pc(2012) FileNotFoundException local2012) {
						Static338.method4547("Could not create " + local1970.getName());
						return;
					} catch (@Pc(2024) SecurityException local2024) {
						Static338.method4547("Cannot write to " + local1970.getName());
						return;
					}
				}
				if (arg1.equals("closeoutput")) {
					if (Static282.aFileOutputStream5 != null) {
						Static282.aFileOutputStream5.close();
					}
					Static282.aFileOutputStream5 = null;
					return;
				}
				if (arg1.startsWith("runscript ")) {
					local1970 = new File(arg1.substring(10));
					if (!local1970.exists()) {
						Static338.method4547("No such file");
						return;
					}
					@Pc(2068) byte[] local2068 = Static261.method3558(local1970);
					if (local2068 == null) {
						Static338.method4547("Failed to read file");
						return;
					}
					local1246 = Static17.method249(Static598.method8094(Static169.method2513(local2068), ""), '\n');
					Static71.method1000(local1246);
				}
				if (arg1.startsWith("zoom ")) {
					@Pc(2099) short local2099 = (short) Static445.method6066(arg1.substring(5));
					if (local2099 > 0) {
						Static57.aShort18 = local2099;
					}
					return;
				}
				if (Static324.anInt5145 == 10) {
					local1424 = Static464.method6285(Static251.aClass131_1, Static421.aClass179_91);
					local1424.aClass2_Sub22_Sub2_2.method8537(arg1.length() + 3);
					local1424.aClass2_Sub22_Sub2_2.method8537(arg2 ? 1 : 0);
					local1424.aClass2_Sub22_Sub2_2.method8537(arg0 ? 1 : 0);
					local1424.aClass2_Sub22_Sub2_2.method8540(arg1);
					Static528.method7295(local1424);
				}
				if (arg1.startsWith("fps ") && Static162.aClass80_2 != Static252.aClass80_3) {
					Static444.method6063(Static445.method6066(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2169) Exception local2169) {
				Static338.method4547(Static434.aClass271_2.method5972(Static483.anInt7694));
				return;
			}
		}
		if (Static324.anInt5145 != 10) {
			Static338.method4547(Static434.aClass271_3.method5972(Static483.anInt7694) + arg1);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(BLclient!ha;I)Lclient!oq;")
	public static Class256 method7481(@OriginalArg(1) Class95 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class91 local9 = Static84.method1201(true, arg0, arg1);
		return local9 == null ? null : local9.aClass256_4;
	}
}
