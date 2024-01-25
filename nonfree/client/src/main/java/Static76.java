import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "[Lclient!af;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
	public static int anInt1679 = 0;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	public static void method1454() {
		@Pc(5) Class44 local5 = null;
		try {
			local5 = Static604.method8270("2");
			@Pc(18) Class2_Sub34 local18 = new Class2_Sub34(Static127.anInt2951 * 6 + 3);
			local18.method6894(1);
			local18.method6854(Static127.anInt2951);
			for (@Pc(33) int local33 = 0; local33 < Static608.anIntArray246.length; local33++) {
				if (Static276.aBooleanArray33[local33]) {
					local18.method6854(local33);
					local18.method6864(Static608.anIntArray246[local33]);
				}
			}
			local5.method956(0, local18.aByteArray77, local18.anInt8188);
		} catch (@Pc(63) Exception local63) {
		}
		try {
			if (local5 != null) {
				local5.method960();
			}
		} catch (@Pc(70) Exception local70) {
		}
		Static585.aLong256 = Static438.method6517();
		Static179.aBoolean335 = false;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZZILjava/lang/String;)V")
	public static void method1457(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static576.method8008("commands - This command");
				Static576.method8008("cls - Clear console");
				Static576.method8008("displayfps - Toggle FPS and other information");
				Static576.method8008("renderer - Print graphics renderer information");
				Static576.method8008("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static534.anInt8920 = 0;
				Static195.anInt9449 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static465.aBoolean604 = !Static465.aBoolean604;
				if (!Static465.aBoolean604) {
					Static576.method8008("FPS off");
					return;
				}
				Static576.method8008("FPS on");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(71) Class306 local71 = Static600.aClass87_15.method7942();
				Static576.method8008("Vendor: " + local71.anInt8691);
				Static576.method8008("Name: " + local71.aString79);
				Static576.method8008("Version: " + local71.anInt8692);
				Static576.method8008("Device: " + local71.aString80);
				Static576.method8008("Driver Version: " + local71.aLong241);
				return;
			}
			if (arg2.equals("heap")) {
				Static576.method8008("Heap: " + Static545.anInt9053 + "MB");
				return;
			}
		} catch (@Pc(139) Exception local139) {
			Static576.method8008(Static628.aClass369_2.method8475(Static377.anInt6756));
			return;
		}
		if (Static95.aClass86_5 != Static267.aClass86_7 || Static278.anInt5322 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static576.method8008("FPS: " + Static93.anInt1859);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static417.aBoolean571 = !Static417.aBoolean571;
					if (Static417.aBoolean571) {
						Static576.method8008("Occlsion now on!");
						return;
					}
					Static576.method8008("Occlsion now off!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static465.aBoolean604 = true;
					Static576.method8008("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static465.aBoolean604 = false;
					Static576.method8008("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static576.method8008("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(250) Throwable local250) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static18.aClass143_1.method3537();
					Static576.method8008("Text coords cleared");
					return;
				}
				@Pc(289) int local289;
				@Pc(270) int local270;
				@Pc(280) Runtime local280;
				if (arg2.equalsIgnoreCase("gc")) {
					Static532.method7451();
					for (local270 = 0; local270 < 10; local270++) {
						System.gc();
					}
					local280 = Runtime.getRuntime();
					local289 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static576.method8008("mem=" + local289 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static532.method7451();
					for (local270 = 0; local270 < 10; local270++) {
						System.gc();
					}
					local280 = Runtime.getRuntime();
					local289 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static576.method8008("Memory before cleanup=" + local289 + "k");
					Static184.method3328();
					Static532.method7451();
					for (@Pc(343) int local343 = 0; local343 < 10; local343++) {
						System.gc();
					}
					local289 = (int) ((local280.totalMemory() - local280.freeMemory()) / 1024L);
					Static576.method8008("Memory after cleanup=" + local289 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static576.method8008(Static598.method2774() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static576.method8008("Dropped client connection");
					if (Static538.anInt8985 == 10) {
						Static98.method1680();
						return;
					}
					if (Static538.anInt8985 == 11) {
						Static578.aBoolean692 = true;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static460.aClass322_3.method7606();
					Static576.method8008("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static252.aClass190_1.method4609();
					Static576.method8008("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static252.aClass190_1.method4606();
					Static576.method8008("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static375.aClass359_4.method8266();
					Static439.aClass210_1.method8028();
					Static252.aClass190_1.method4611();
					Static576.method8008("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static251.method4098();
					Static266.method4304();
					Static576.method8008("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static186.aLong109 = Static438.method6517();
					Static287.aBoolean412 = true;
					Static251.method4098();
					Static266.method4304();
					Static576.method8008("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static227.method3850(1, false, -1, -1);
					if (Static501.method7132() == 1) {
						Static576.method8008("wm1 succeeded");
						return;
					}
					Static576.method8008("wm1 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static227.method3850(2, false, -1, -1);
					if (Static501.method7132() == 2) {
						Static576.method8008("wm2 succeeded");
						return;
					}
					Static576.method8008("wm2 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static227.method3850(3, false, 768, 1024);
					if (Static501.method7132() == 3) {
						Static576.method8008("wm3 succeeded");
						return;
					}
					Static576.method8008("wm3 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static352.method5455(false, 0);
					if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 0) {
						Static576.method8008("Entered tk0");
						Static404.aClass2_Sub13_2.method1383(0, Static404.aClass2_Sub13_2.aClass33_Sub24_2);
						Static209.method3628();
						Static141.aBoolean267 = false;
						return;
					}
					Static576.method8008("Failed to enter tk0");
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static352.method5455(false, 1);
					if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 1) {
						Static576.method8008("Entered tk1");
						Static404.aClass2_Sub13_2.method1383(1, Static404.aClass2_Sub13_2.aClass33_Sub24_2);
						Static209.method3628();
						Static141.aBoolean267 = false;
						return;
					}
					Static576.method8008("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static352.method5455(false, 2);
					if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 2) {
						Static576.method8008("Entered tk2");
						Static404.aClass2_Sub13_2.method1383(2, Static404.aClass2_Sub13_2.aClass33_Sub24_2);
						Static209.method3628();
						Static141.aBoolean267 = false;
						return;
					}
					Static576.method8008("Failed to enter tk2");
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static352.method5455(false, 3);
					if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 3) {
						Static576.method8008("Entered tk3");
						Static404.aClass2_Sub13_2.method1383(3, Static404.aClass2_Sub13_2.aClass33_Sub24_2);
						Static209.method3628();
						Static141.aBoolean267 = false;
						return;
					}
					Static576.method8008("Failed to enter tk3");
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static352.method5455(false, 5);
					if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() != 5) {
						Static576.method8008("Failed to enter tk5");
						return;
					}
					Static576.method8008("Entered tk5");
					Static404.aClass2_Sub13_2.method1383(5, Static404.aClass2_Sub13_2.aClass33_Sub24_2);
					Static209.method3628();
					Static141.aBoolean267 = false;
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static576.method8008("Invalid buildarea value");
						return;
					}
					local270 = Static56.method1026(arg2.substring(6));
					if (local270 >= 0 && Static330.method3632(Static545.anInt9053) >= local270) {
						Static404.aClass2_Sub13_2.method1383(local270, Static404.aClass2_Sub13_2.aClass33_Sub16_1);
						Static209.method3628();
						Static141.aBoolean267 = false;
						Static576.method8008("maxbuildarea=" + Static404.aClass2_Sub13_2.aClass33_Sub16_1.method5227());
						return;
					}
					Static576.method8008("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static576.method8008("Invalid rect_debug value");
						return;
					}
					Static41.anInt941 = Static56.method1026(arg2.substring(10).trim());
					Static576.method8008("rect_debug=" + Static41.anInt941);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static612.aBoolean735 = true;
					Static576.method8008("qa_op_test=" + Static612.aBoolean735);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static568.aBoolean683 = !Static568.aBoolean683;
					Static576.method8008("clipcomponents=" + Static568.aBoolean683);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(854) boolean local854 = Static600.aClass87_15.method7914();
					if (!Static262.method4258(!local854)) {
						Static576.method8008("Failed to enable bloom");
						return;
					}
					if (!local854) {
						Static576.method8008("Bloom enabled");
						return;
					}
					Static576.method8008("Bloom disabled");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static424.aBoolean577) {
						Static424.aBoolean577 = false;
						Static576.method8008("Forced tweening disabled.");
						return;
					}
					Static424.aBoolean577 = true;
					Static576.method8008("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static19.aBoolean355) {
						Static576.method8008("Shift-click disabled.");
						Static19.aBoolean355 = false;
						return;
					}
					Static576.method8008("Shift-click ENABLED!");
					Static19.aBoolean355 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static576.method8008("x:" + (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 >> 9) + " z:" + (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static576.method8008("Height: " + Static331.aClass112Array3[Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124].method7819(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 >> 9, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static594.aClass97_144.method2548();
					Static594.aClass97_144.method2556();
					Static509.aClass139_3.method3436();
					Static259.aClass248_2.method6351();
					Static266.method4304();
					Static576.method8008("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static600.aClass87_15.method7930()) {
						local270 = Integer.parseInt(arg2.substring(3));
						if (local270 < 1) {
							local270 = 1;
						} else if (local270 > 4) {
							local270 = 4;
						}
						Static509.anInt8575 = local270;
						Static251.method4098();
						Static576.method8008("Render cores now: " + Static509.anInt8575);
						return;
					}
					Static576.method8008("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static576.method8008("I(s): " + Static637.aClass233_62.method5656() + "/" + Static637.aClass233_62.method5658());
					Static576.method8008("I(m): " + Static526.aClass233_52.method5656() + "/" + Static526.aClass233_52.method5658());
					Static576.method8008("O(s): " + Static570.aClass267_2.aClass115_1.method3032() + "/" + Static570.aClass267_2.aClass115_1.method3033());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static576.method8008("Pos: " + Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 + "," + (Static451.anInt7933 + (Static53.anInt1153 >> 9) >> 6) + "," + ((Static395.anInt3530 >> 9) + Static470.anInt8063 >> 6) + "," + (Static451.anInt7933 + (Static53.anInt1153 >> 9) & 0x3F) + "," + (Static470.anInt8063 + (Static395.anInt3530 >> 9) & 0x3F) + " Height: " + (Static582.method8038(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124, Static53.anInt1153, Static395.anInt3530) - Static64.anInt1371));
					Static576.method8008("Look: " + Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124 + "," + (Static451.anInt7933 + Static556.anInt9172 >> 6) + "," + (Static597.anInt9840 + Static470.anInt8063 >> 6) + "," + (Static556.anInt9172 + Static451.anInt7933 & 0x3F) + "," + (Static597.anInt9840 + Static470.anInt8063 & 0x3F) + " Height: " + (Static582.method8038(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124, Static556.anInt9172, Static597.anInt9840) - Static299.anInt5573));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static45.aBoolean505 = !Static45.aBoolean505;
					Static600.aClass87_15.method7916(Static45.aBoolean505);
					Static566.method1787();
					Static576.method8008("showprofiling=" + Static45.aBoolean505);
					return;
				}
				@Pc(1262) String[] local1262;
				@Pc(1253) int local1253;
				if (arg2.startsWith("performancetest")) {
					local270 = -1;
					local1253 = 1000;
					if (arg2.length() > 15) {
						local1262 = Static218.method3754(' ', arg2);
						try {
							if (local1262.length > 1) {
								local1253 = Integer.parseInt(local1262[1]);
							}
						} catch (@Pc(1273) Throwable local1273) {
						}
						try {
							if (local1262.length > 2) {
								local270 = Integer.parseInt(local1262[2]);
							}
						} catch (@Pc(1284) Throwable local1284) {
						}
					}
					if (local270 == -1) {
						Static576.method8008("Java toolkit: " + Static573.method7871(0, local1253));
						Static576.method8008("SSE toolkit:  " + Static573.method7871(2, local1253));
						Static576.method8008("D3D toolkit:  " + Static573.method7871(3, local1253));
						Static576.method8008("GL toolkit:   " + Static573.method7871(1, local1253));
						Static576.method8008("GLX toolkit:  " + Static573.method7871(5, local1253));
						return;
					}
					Static576.method8008("Performance: " + Static573.method7871(Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329(), local1253));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static399.aBoolean530 = !Static399.aBoolean530;
					Static576.method8008("nonpcs=" + Static399.aBoolean530);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static387.method5831();
					Static576.method8008("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local270 = Integer.parseInt(arg2.substring(12));
					Static222.method7436(Static619.method8431(local270).aString55, local270);
					Static576.method8008("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static576.method8008("w: " + Static460.aClass322_3.anInt9045);
					return;
				}
				@Pc(1442) Class2_Sub50 local1442;
				if (arg2.startsWith("pc")) {
					local1442 = Static595.method8194(Static610.aClass310_2, Static211.aClass269_71);
					local1442.aClass2_Sub34_Sub2_2.method6894(0);
					local1253 = local1442.aClass2_Sub34_Sub2_2.anInt8188;
					local289 = arg2.indexOf(" ", 4);
					local1442.aClass2_Sub34_Sub2_2.method6918(arg2.substring(3, local289));
					Static283.method4471(arg2.substring(local289), local1442.aClass2_Sub34_Sub2_2);
					local1442.aClass2_Sub34_Sub2_2.method6861(local1442.aClass2_Sub34_Sub2_2.anInt8188 - local1253);
					Static311.method4754(local1442);
					return;
				}
				if (arg2.equals("savevarcs")) {
					method1454();
					Static576.method8008("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local270 = 0; local270 < Static608.anIntArray246.length; local270++) {
						if (Static276.aBooleanArray33[local270]) {
							Static608.anIntArray246[local270] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static608.anIntArray246[local270] *= -1;
							}
						}
					}
					method1454();
					Static576.method8008("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static141.aBoolean266 = true;
					Static266.method4304();
					Static576.method8008("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static141.aBoolean266 = false;
					Static266.method4304();
					Static576.method8008("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static320.method4827();
					Static576.method8008("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static576.method8008(Static134.method2601() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local270 = Integer.parseInt(arg2.substring(17));
					Static576.method8008("varpbit=" + Static438.aClass198_1.method4743(local270));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local270 = Integer.parseInt(arg2.substring(14));
					Static576.method8008("varp=" + Static438.aClass198_1.method4744(local270));
					return;
				}
				if (arg2.startsWith("directlogin")) {
					@Pc(1651) String[] local1651 = Static218.method3754(' ', arg2.substring(12));
					if (local1651.length >= 2) {
						local1253 = local1651.length <= 2 ? 0 : Integer.parseInt(local1651[2]);
						Static254.method4192(local1253, local1651[1], local1651[0]);
						return;
					}
				}
				if (arg2.startsWith("csprofileclear")) {
					Static639.method8546();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static639.method8550();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static639.method8550();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local270 = Integer.parseInt(arg2.substring(8));
					Static600.aClass87_15.method7911(local270);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static576.method8008("Active streams: " + Static1.aClass2_Sub2_Sub2_6.method1041());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static606.method8284();
					Static576.method8008("Complete. Toolkit now: " + Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static576.method8008(Static181.aClient1.method1320());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static604.aString98.startsWith("win")) {
						Static250.method6950(new File("C:\\Temp\\heap.dump"));
					} else {
						Static250.method6950(new File("/tmp/heap.dump"));
					}
					Static576.method8008("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static576.method8008("Name: " + Static604.aString98);
					Static576.method8008("Arch: " + Static604.aString91);
					Static576.method8008("Ver: " + Static604.aString94);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local270 = Integer.parseInt(arg2.substring(8, 9));
					Static226.anInt4631 = local270;
					Static251.method4098();
					Static576.method8008("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local270 = arg2.indexOf(32);
					if (local270 < 0) {
						Static576.method8008("Syntax: ortho <n>");
						return;
					}
					local1253 = Static56.method1026(arg2.substring(local270 + 1));
					Static404.aClass2_Sub13_2.method1383(local1253, Static404.aClass2_Sub13_2.aClass33_Sub21_1);
					Static209.method3628();
					Static141.aBoolean267 = false;
					Static527.method7339();
					if (local1253 == Static404.aClass2_Sub13_2.aClass33_Sub21_1.method6750()) {
						Static576.method8008("Successfully changed ortho mode");
						return;
					}
					Static576.method8008("Failed to change ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static404.aClass2_Sub13_2.aClass33_Sub21_1.method6750() == 0) {
						Static576.method8008("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local270 = Static56.method1026(arg2.substring(arg2.indexOf(32) + 1));
					Static388.anInt6989 = local270;
					Static576.method8008("orthozoom=" + Static388.anInt6989);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local270 = Static56.method1026(arg2.substring(arg2.indexOf(32) + 1));
					Static554.anInt10292 = local270;
					Static151.anInt3490 = local270;
					Static576.method8008("ortho tile size=" + local270);
					Static527.method7339();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static167.aBoolean310 = !Static167.aBoolean310;
					Static576.method8008("ortho camera lock is " + (Static167.aBoolean310 ? "on" : "off"));
					return;
				}
				@Pc(1993) File local1993;
				if (arg2.startsWith("setoutput ")) {
					local1993 = new File(arg2.substring(10));
					if (local1993.exists()) {
						local1993 = new File(arg2.substring(10) + "." + Static438.method6517() + ".log");
						if (local1993.exists()) {
							Static576.method8008("file already exists!");
							return;
						}
					}
					if (Static439.aFileOutputStream1 != null) {
						Static439.aFileOutputStream1.close();
						Static439.aFileOutputStream1 = null;
					}
					try {
						Static439.aFileOutputStream1 = new FileOutputStream(local1993);
						return;
					} catch (@Pc(2037) FileNotFoundException local2037) {
						Static576.method8008("Could not create " + local1993.getName());
						return;
					} catch (@Pc(2049) SecurityException local2049) {
						Static576.method8008("Cannot write to " + local1993.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static439.aFileOutputStream1 != null) {
						Static439.aFileOutputStream1.close();
					}
					Static439.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local1993 = new File(arg2.substring(10));
					if (!local1993.exists()) {
						Static576.method8008("No such file");
						return;
					}
					@Pc(2093) byte[] local2093 = Static501.method7130(local1993);
					if (local2093 == null) {
						Static576.method8008("Failed to read file");
						return;
					}
					local1262 = Static218.method3754('\n', Static511.method6432("", Static205.method3596(local2093)));
					Static429.method6434(local1262);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2124) short local2124 = (short) Static56.method1026(arg2.substring(5));
					if (local2124 > 0) {
						Static324.aShort85 = local2124;
					}
					return;
				}
				if (Static538.anInt8985 == 10) {
					local1442 = Static595.method8194(Static610.aClass310_2, Static311.aClass269_57);
					local1442.aClass2_Sub34_Sub2_2.method6894(arg2.length() + 3);
					local1442.aClass2_Sub34_Sub2_2.method6894(arg1 ? 1 : 0);
					local1442.aClass2_Sub34_Sub2_2.method6894(arg0 ? 1 : 0);
					local1442.aClass2_Sub34_Sub2_2.method6918(arg2);
					Static311.method4754(local1442);
				}
				if (arg2.startsWith("fps ") && Static267.aClass86_7 != Static95.aClass86_5) {
					Static475.method7386(Static56.method1026(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2198) Exception local2198) {
				Static576.method8008(Static628.aClass369_2.method8475(Static377.anInt6756));
				return;
			}
		}
		if (Static538.anInt8985 != 10) {
			Static576.method8008(Static628.aClass369_3.method8475(Static377.anInt6756) + arg2);
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
	public static void method1458() {
		@Pc(12) Class2_Sub50 local12 = Static595.method8194(Static610.aClass310_2, Static377.aClass269_68);
		local12.aClass2_Sub34_Sub2_2.method6894(0);
		Static311.method4754(local12);
	}
}
