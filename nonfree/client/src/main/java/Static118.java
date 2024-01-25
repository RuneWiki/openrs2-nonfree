import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
	public static int anInt1985 = 1;

	@OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
	public static int anInt1986 = -60;

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;ZZILclient!vo;)V")
	public static void method1729(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class389 arg3) {
		Static496.method7086(arg0, arg3, "openjs", arg2, arg1);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZ)Lclient!iaa;")
	public static Class4_Sub8 method1730(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(7) Class320[] local7 = Class137.aClass320Array1;
		synchronized (Class137.aClass320Array1) {
			@Pc(40) Class4_Sub8 local40;
			if (arg0 >= Class137.aClass320Array1.length || Class137.aClass320Array1[arg0].method7602()) {
				local40 = new Class4_Sub8();
				local40.aClass4_Sub6Array1 = new Class4_Sub6[arg0];
				for (@Pc(62) int local62 = 0; local62 < arg0; local62++) {
					local40.aClass4_Sub6Array1[local62] = new Class4_Sub6();
				}
			} else {
				local40 = (Class4_Sub8) Class137.aClass320Array1[arg0].method7606();
				local40.method9416();
				@Pc(47) int local47 = Static572.anIntArray659[arg0]--;
			}
			local40.aBoolean360 = arg1;
			return local40;
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1731(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg1 < 1 || arg0 > Static426.anInt6942 - 2 || arg1 > Static280.anInt6752 - 2) {
			return;
		}
		@Pc(44) int local44 = arg5;
		if (arg5 < 3 && Static83.method1237(arg0, arg1)) {
			local44 = arg5 + 1;
		}
		if (Static650.aClass2_Sub30_29.aClass11_Sub12_1.method2753() == 0 && !Static208.method4773(arg1, arg0, local44, Static597.anInt9295)) {
			return;
		}
		if (Static632.aClass311ArrayArrayArray3 == null) {
			return;
		}
		Static717.aClass199_Sub1_2.method4283(arg1, Static396.aClass145_6, arg0, Static626.aClass226Array1[arg5], arg5, arg2);
		if (arg7 < 0) {
			return;
		}
		@Pc(98) int local98 = Static650.aClass2_Sub30_29.aClass11_Sub25_1.method7993();
		Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub25_1);
		Static717.aClass199_Sub1_2.method4274(arg7, local44, arg4, arg5, arg1, arg3, arg6, arg0, Static396.aClass145_6, Static626.aClass226Array1[arg5]);
		Static650.aClass2_Sub30_29.method2988(local98, Static650.aClass2_Sub30_29.aClass11_Sub25_1);
		return;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "([JB[Ljava/lang/Object;)V")
	public static void method1732(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static174.method2603(arg0.length - 1, 0, arg1, arg0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;ZBZ)V")
	public static void method1733(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2) {
		try {
			label721: {
				if (!arg0.equalsIgnoreCase("commands") && !arg0.equalsIgnoreCase("help")) {
					if (arg0.equalsIgnoreCase("cls")) {
						Static646.anInt9910 = 0;
						Static371.anInt5925 = 0;
						return;
					}
					if (arg0.equalsIgnoreCase("displayfps")) {
						Static66.aBoolean131 = !Static66.aBoolean131;
						if (!Static66.aBoolean131) {
							Static180.method5442("FPS off");
							return;
						}
						Static180.method5442("FPS on");
						return;
					}
					if (arg0.equals("renderer")) {
						@Pc(113) Class47 local113 = Static396.aClass145_6.method9653();
						Static180.method5442("Vendor: " + local113.anInt1026);
						Static180.method5442("Name: " + local113.aString5);
						Static180.method5442("Version: " + local113.anInt1027);
						Static180.method5442("Device: " + local113.aString6);
						Static180.method5442("Driver Version: " + local113.aLong41);
						return;
					}
					if (!arg0.equals("heap")) {
						if (arg0.equalsIgnoreCase("getcamerapos")) {
							Static180.method5442("Pos: " + Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 + "," + ((Static430.anInt7002 >> 9) + Static243.anInt3820 >> 6) + "," + ((Static218.anInt3475 >> 9) + Static224.anInt11062 >> 6) + "," + ((Static430.anInt7002 >> 9) + Static243.anInt3820 & 0x3F) + "," + ((Static218.anInt3475 >> 9) + Static224.anInt11062 & 0x3F) + " Height: " + (Static324.method4554(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133, Static430.anInt7002, Static218.anInt3475) - Static411.anInt6731));
							Static180.method5442("Look: " + Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133 + "," + (Static243.anInt3820 + Static567.anInt8900 >> 6) + "," + (Static224.anInt11062 + Static147.anInt2479 >> 6) + "," + (Static567.anInt8900 + Static243.anInt3820 & 0x3F) + "," + (Static147.anInt2479 + Static224.anInt11062 & 0x3F) + " Height: " + (Static324.method4554(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133, Static567.anInt8900, Static147.anInt2479) - Static414.anInt9481));
							return;
						}
						break label721;
					}
					Static180.method5442("Heap: " + Static510.anInt8117 + "MB");
					return;
				}
				Static180.method5442("commands - This command");
				Static180.method5442("cls - Clear console");
				Static180.method5442("displayfps - Toggle FPS and other information");
				Static180.method5442("renderer - Print graphics renderer information");
				Static180.method5442("heap - Print java memory information");
				Static180.method5442("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
		} catch (@Pc(336) Exception local336) {
			Static180.method5442(Static289.aClass191_2.method4067(Static414.anInt9485));
			return;
		}
		if (Static229.aClass386_6 != Static661.aClass386_10 || Static565.anInt8888 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static180.method5442("FPS: " + Static162.anInt2752);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static334.aBoolean436 = !Static334.aBoolean436;
					if (!Static334.aBoolean436) {
						Static180.method5442("Occlsion now off!");
						return;
					}
					Static180.method5442("Occlsion now on!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Static66.aBoolean131 = true;
					Static180.method5442("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Static66.aBoolean131 = false;
					Static180.method5442("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static180.method5442("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static604.aClass2_Sub45_1.anInt7311 + "Mb");
						return;
					} catch (@Pc(491) Throwable local491) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static480.aClass320_6.method7603();
					Static180.method5442("Text coords cleared");
					return;
				}
				@Pc(541) int local541;
				@Pc(518) int local518;
				@Pc(531) Runtime local531;
				if (arg0.equalsIgnoreCase("gc")) {
					Static274.method3837();
					for (local518 = 0; local518 < 10; local518++) {
						System.gc();
					}
					local531 = Runtime.getRuntime();
					local541 = (int) ((local531.totalMemory() - local531.freeMemory()) / 1024L);
					Static180.method5442("mem=" + local541 + "k");
					return;
				}
				@Pc(606) int local606;
				if (arg0.equalsIgnoreCase("compact")) {
					Static274.method3837();
					for (local518 = 0; local518 < 10; local518++) {
						System.gc();
					}
					local531 = Runtime.getRuntime();
					local541 = (int) ((local531.totalMemory() - local531.freeMemory()) / 1024L);
					Static180.method5442("Memory before cleanup=" + local541 + "k");
					Static436.method6342();
					Static274.method3837();
					for (local606 = 0; local606 < 10; local606++) {
						System.gc();
					}
					local541 = (int) ((local531.totalMemory() - local531.freeMemory()) / 1024L);
					Static180.method5442("Memory after cleanup=" + local541 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static180.method5442(Static659.method9032() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static180.method5442("Dropped client connection");
					if (Static357.anInt5722 == 11) {
						Static284.method3979();
					} else if (Static357.anInt5722 == 12) {
						Static487.aClass221_2.aBoolean488 = true;
						return;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static548.aClass176_3.method3776();
					Static180.method5442("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					Static190.aClass309_1.method7266();
					Static180.method5442("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					Static190.aClass309_1.method7267();
					Static180.method5442("Dropped server js5 net queue");
					return;
				}
				@Pc(760) int local760;
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static135.aClass389_2.method9265();
					@Pc(758) Class221[] local758 = Static487.aClass221Array1;
					for (local760 = 0; local760 < local758.length; local760++) {
						@Pc(766) Class221 local766 = local758[local760];
						if (local766.aClass5_2 != null) {
							local766.aClass5_2.method107();
						}
					}
					Static190.aClass309_1.method7260();
					Static180.method5442("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static289.method4073();
					Static145.method2135();
					Static180.method5442("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static71.aLong147 = Static567.method7863();
					Static458.aBoolean644 = true;
					Static289.method4073();
					Static145.method2135();
					Static180.method5442("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static309.method4316(false, -1, -1, 1);
					if (Static193.method2756() == 1) {
						Static180.method5442("wm1 succeeded");
						return;
					}
					Static180.method5442("wm1 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static309.method4316(false, -1, -1, 2);
					if (Static193.method2756() == 2) {
						Static180.method5442("wm2 succeeded");
						return;
					}
					Static180.method5442("wm2 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static309.method4316(false, 1024, 768, 3);
					if (Static193.method2756() == 3) {
						Static180.method5442("wm3 succeeded");
						return;
					}
					Static180.method5442("wm3 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static213.method2982(false, 0);
					if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() == 0) {
						Static180.method5442("Entered tk0");
						Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					Static180.method5442("Failed to enter tk0");
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static213.method2982(false, 1);
					if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() != 1) {
						Static180.method5442("Failed to enter tk1");
						return;
					}
					Static180.method5442("Entered tk1");
					Static650.aClass2_Sub30_29.method2988(1, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
					Static610.method9380();
					Static492.aBoolean688 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static213.method2982(false, 2);
					if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() != 2) {
						Static180.method5442("Failed to enter tk2");
						return;
					}
					Static180.method5442("Entered tk2");
					Static650.aClass2_Sub30_29.method2988(2, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
					Static610.method9380();
					Static492.aBoolean688 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static213.method2982(false, 3);
					if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() != 3) {
						Static180.method5442("Failed to enter tk3");
						return;
					}
					Static180.method5442("Entered tk3");
					Static650.aClass2_Sub30_29.method2988(3, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
					Static610.method9380();
					Static492.aBoolean688 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static213.method2982(false, 5);
					if (Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() == 5) {
						Static180.method5442("Entered tk5");
						Static650.aClass2_Sub30_29.method2988(5, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					Static180.method5442("Failed to enter tk5");
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static180.method5442("Invalid buildarea value");
						return;
					}
					local518 = Static171.method2545(arg0.substring(6));
					if (local518 >= 0 && Static662.method9201(Static510.anInt8117) >= local518) {
						Static650.aClass2_Sub30_29.method2988(local518, Static650.aClass2_Sub30_29.aClass11_Sub13_1);
						Static610.method9380();
						Static492.aBoolean688 = false;
						Static180.method5442("maxbuildarea=" + Static650.aClass2_Sub30_29.aClass11_Sub13_1.method2809());
						return;
					}
					Static180.method5442("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static180.method5442("Invalid rect_debug value");
						return;
					}
					Static320.anInt9249 = Static171.method2545(arg0.substring(10).trim());
					Static180.method5442("rect_debug=" + Static320.anInt9249);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static311.aBoolean411 = true;
					Static180.method5442("qa_op_test=" + Static311.aBoolean411);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static574.aBoolean775 = !Static574.aBoolean775;
					Static180.method5442("clipcomponents=" + Static574.aBoolean775);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(1326) boolean local1326 = Static396.aClass145_6.method9632();
					if (Static717.method9543(!local1326)) {
						if (!local1326) {
							Static180.method5442("Bloom enabled");
							return;
						}
						Static180.method5442("Bloom disabled");
						return;
					}
					Static180.method5442("Failed to enable bloom");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (Static157.aBoolean265) {
						Static157.aBoolean265 = false;
						Static180.method5442("Forced tweening disabled.");
						return;
					}
					Static157.aBoolean265 = true;
					Static180.method5442("Forced tweening ENABLED!");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (Static129.aBoolean238) {
						Static180.method5442("Shift-click disabled.");
						Static129.aBoolean238 = false;
						return;
					}
					Static180.method5442("Shift-click ENABLED!");
					Static129.aBoolean238 = true;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static180.method5442("x:" + (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 >> 9) + " z:" + (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static180.method5442("Height: " + Static158.aClass133Array4[Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133].method8217(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 >> 9, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static117.aClass254_47.method6076();
					Static117.aClass254_47.method6096();
					Static591.aClass351_6.method8333();
					Static117.aClass196_2.method4187();
					Static145.method2135();
					Static180.method5442("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (Static396.aClass145_6.method9674()) {
						local518 = Integer.parseInt(arg0.substring(3));
						if (local518 < 1) {
							local518 = 1;
						} else if (local518 > 4) {
							local518 = 4;
						}
						Static329.anInt5041 = local518;
						Static289.method4073();
						Static180.method5442("Render cores now: " + Static329.anInt5041);
						return;
					}
					Static180.method5442("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static180.method5442("I(s): " + Static643.aClass85_65.method1739() + "/" + Static643.aClass85_65.method1740());
					Static180.method5442("I(m): " + Static533.aClass85_54.method1739() + "/" + Static533.aClass85_54.method1740());
					Static180.method5442("O(s): " + Static543.aClass37_2.aClass269_1.method6527() + "/" + Static543.aClass37_2.aClass269_1.method6520());
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static70.aBoolean138 = !Static70.aBoolean138;
					Static396.aClass145_6.method9659(Static70.aBoolean138);
					Static502.method7136();
					Static180.method5442("showprofiling=" + Static70.aBoolean138);
					return;
				}
				@Pc(1698) String[] local1698;
				if (arg0.startsWith("performancetest")) {
					local518 = -1;
					local760 = 1000;
					if (arg0.length() > 15) {
						local1698 = Static100.method1530(arg0, ' ');
						try {
							if (local1698.length > 1) {
								local760 = Integer.parseInt(local1698[1]);
							}
						} catch (@Pc(1711) Throwable local1711) {
						}
						try {
							if (local1698.length > 2) {
								local518 = Integer.parseInt(local1698[2]);
							}
						} catch (@Pc(1724) Throwable local1724) {
						}
					}
					if (local518 == -1) {
						Static180.method5442("Java toolkit: " + Static28.method382(0, local760));
						Static180.method5442("SSE toolkit:  " + Static28.method382(2, local760));
						Static180.method5442("D3D toolkit:  " + Static28.method382(3, local760));
						Static180.method5442("GL toolkit:   " + Static28.method382(1, local760));
						Static180.method5442("GLX toolkit:  " + Static28.method382(5, local760));
						return;
					}
					Static180.method5442("Performance: " + Static28.method382(local518, local760));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static362.aBoolean492 = !Static362.aBoolean492;
					Static180.method5442("nonpcs=" + Static362.aBoolean492);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static699.method9384();
					Static180.method5442("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local518 = Integer.parseInt(arg0.substring(12));
					Static296.method4170(local518, Static621.method8394(local518).aString21);
					Static180.method5442("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static180.method5442("w: " + Static548.aClass176_3.anInt4157);
					return;
				}
				if (arg0.startsWith("pc")) {
					@Pc(1914) Class221 local1914 = Static87.method1292();
					@Pc(1920) Class2_Sub33 local1920 = Static592.method8154(Static177.aClass349_51, local1914.aClass48_1);
					local1920.aClass2_Sub20_Sub2_1.method8584(0);
					local541 = local1920.aClass2_Sub20_Sub2_1.anInt9723;
					local606 = arg0.indexOf(" ", 4);
					local1920.aClass2_Sub20_Sub2_1.method8541(arg0.substring(3, local606));
					Static52.method744(arg0.substring(local606), local1920.aClass2_Sub20_Sub2_1);
					local1920.aClass2_Sub20_Sub2_1.method8547(local1920.aClass2_Sub20_Sub2_1.anInt9723 - local541);
					local1914.method5173(local1920);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static404.method5979();
					Static180.method5442("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local518 = 0; local518 < Static41.anIntArray266.length; local518++) {
						if (Static317.aBooleanArray27[local518]) {
							Static41.anIntArray266[local518] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static41.anIntArray266[local518] *= -1;
							}
						}
					}
					Static404.method5979();
					Static180.method5442("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static496.aBoolean689 = true;
					Static145.method2135();
					Static180.method5442("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static496.aBoolean689 = false;
					Static145.method2135();
					Static180.method5442("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static248.method3462();
					Static180.method5442("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static180.method5442(Static246.method3455() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local518 = Integer.parseInt(arg0.substring(17));
					Static180.method5442("varpbit=" + Static396.aClass107_1.method5146(local518));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local518 = Integer.parseInt(arg0.substring(14));
					Static180.method5442("varp=" + Static396.aClass107_1.method5145(local518));
					return;
				}
				@Pc(2182) String[] local2182;
				if (arg0.startsWith("directlogin")) {
					local2182 = Static100.method1530(arg0.substring(12), ' ');
					if (local2182.length >= 2) {
						local760 = local2182.length <= 2 ? 0 : Integer.parseInt(local2182[2]);
						Static9.method190(local2182[0], local760, local2182[1]);
						return;
					}
				}
				if (arg0.startsWith("snlogin ")) {
					local2182 = Static100.method1530(arg0.substring(8), ' ');
					local760 = Integer.parseInt(local2182[0]);
					local541 = local2182.length == 2 ? Integer.parseInt(local2182[1]) : 0;
					Static658.method7510(local760, local541);
					return;
				}
				if (arg0.startsWith("csprofileclear")) {
					Static484.method6912();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static484.method6929();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static484.method6929();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local518 = Integer.parseInt(arg0.substring(8));
					Static396.aClass145_6.method9672(local518);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static180.method5442("Active streams: " + Static130.aClass2_Sub23_Sub3_1.method6798());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static517.method7326();
					Static180.method5442("Complete. Toolkit now: " + Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863());
					return;
				}
				if (arg0.equals("errormessage")) {
					Static180.method5442(Static255.aClient1.method1384());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static688.aString122.startsWith("win")) {
						Static48.method627(new File("C:\\Temp\\heap.dump"));
					} else {
						Static48.method627(new File("/tmp/heap.dump"));
					}
					Static180.method5442("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static180.method5442("Name: " + Static688.aString122);
					Static180.method5442("Arch: " + Static688.aString119);
					Static180.method5442("Ver: " + Static688.aString124);
					return;
				}
				if (arg0.startsWith("w2debug")) {
					local518 = Integer.parseInt(arg0.substring(8, 9));
					Static430.anInt7017 = local518;
					Static289.method4073();
					Static180.method5442("Toggled!");
					return;
				}
				if (arg0.startsWith("ortho ")) {
					local518 = arg0.indexOf(32);
					if (local518 < 0) {
						Static180.method5442("Syntax: ortho <n>");
						return;
					}
					local760 = Static171.method2545(arg0.substring(local518 + 1));
					Static650.aClass2_Sub30_29.method2988(local760, Static650.aClass2_Sub30_29.aClass11_Sub15_1);
					Static610.method9380();
					Static492.aBoolean688 = false;
					Static70.method1065();
					if (Static650.aClass2_Sub30_29.aClass11_Sub15_1.method3264() == local760) {
						Static180.method5442("Successfully changed ortho mode");
						return;
					}
					Static180.method5442("Failed to change ortho mode");
					return;
				}
				if (arg0.startsWith("orthozoom ")) {
					if (Static650.aClass2_Sub30_29.aClass11_Sub15_1.method3264() == 0) {
						Static180.method5442("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local518 = Static171.method2545(arg0.substring(arg0.indexOf(32) + 1));
					Static96.anInt1730 = local518;
					Static180.method5442("orthozoom=" + Static96.anInt1730);
					return;
				}
				if (arg0.startsWith("orthotilesize ")) {
					local518 = Static171.method2545(arg0.substring(arg0.indexOf(32) + 1));
					Static39.anInt536 = local518;
					Static578.anInt9140 = local518;
					Static180.method5442("ortho tile size=" + local518);
					Static70.method1065();
					return;
				}
				if (arg0.equals("orthocamlock")) {
					Static232.aBoolean330 = !Static232.aBoolean330;
					Static180.method5442("ortho camera lock is " + (Static232.aBoolean330 ? "on" : "off"));
					return;
				}
				if (arg0.startsWith("skydetail ")) {
					local518 = Static171.method2545(arg0.substring(arg0.indexOf(32) + 1));
					Static650.aClass2_Sub30_29.method2988(local518, Static650.aClass2_Sub30_29.aClass11_Sub17_1);
					Static180.method5442("skydetail is " + (Static650.aClass2_Sub30_29.aClass11_Sub17_1.method4360() == 0 ? "low" : "high"));
					return;
				}
				@Pc(2732) File local2732;
				if (arg0.startsWith("setoutput ")) {
					local2732 = new File(arg0.substring(10));
					if (local2732.exists()) {
						local2732 = new File(arg0.substring(10) + "." + Static567.method7863() + ".log");
						if (local2732.exists()) {
							Static180.method5442("file already exists!");
							return;
						}
					}
					if (Static129.aFileOutputStream1 != null) {
						Static129.aFileOutputStream1.close();
						Static129.aFileOutputStream1 = null;
					}
					try {
						Static129.aFileOutputStream1 = new FileOutputStream(local2732);
						return;
					} catch (@Pc(2781) FileNotFoundException local2781) {
						Static180.method5442("Could not create " + local2732.getName());
						return;
					} catch (@Pc(2795) SecurityException local2795) {
						Static180.method5442("Cannot write to " + local2732.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Static129.aFileOutputStream1 != null) {
						Static129.aFileOutputStream1.close();
					}
					Static129.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local2732 = new File(arg0.substring(10));
					if (!local2732.exists()) {
						Static180.method5442("No such file");
						return;
					}
					@Pc(2852) byte[] local2852 = Static282.method3956(local2732);
					if (local2852 == null) {
						Static180.method5442("Failed to read file");
						return;
					}
					local1698 = Static100.method1530(Static474.method6818("", Static62.method941(local2852)), '\n');
					Static425.method6178(local1698);
				}
				if (arg0.startsWith("zoom ")) {
					@Pc(2894) short local2894 = (short) Static171.method2545(arg0.substring(5));
					if (local2894 > 0) {
						Static480.aShort104 = local2894;
					}
					return;
				}
				if (arg0.startsWith("cs2debug")) {
					if (arg0.length() > 9 && arg0.charAt(8) == ' ') {
						Static484.aString90 = arg0.substring(9);
						Static484.aBoolean677 = true;
						Static180.method5442("cs2debug: (" + Static484.aString90 + ")");
						return;
					}
					Static484.aString90 = null;
					Static484.aBoolean677 = !Static484.aBoolean677;
					Static180.method5442("cs2debug:" + Static484.aBoolean677);
					return;
				}
				if (Static357.anInt5722 == 11) {
					@Pc(2982) Class2_Sub33 local2982 = Static592.method8154(Static352.aClass349_86, Static487.aClass221_2.aClass48_1);
					local2982.aClass2_Sub20_Sub2_1.method8584(arg0.length() + 3);
					local2982.aClass2_Sub20_Sub2_1.method8584(arg1 ? 1 : 0);
					local2982.aClass2_Sub20_Sub2_1.method8584(arg2 ? 1 : 0);
					local2982.aClass2_Sub20_Sub2_1.method8541(arg0);
					Static487.aClass221_2.method5173(local2982);
				}
				if (arg0.startsWith("fps ") && Static229.aClass386_6 != Static661.aClass386_10) {
					Static234.method3336(Static171.method2545(arg0.substring(4)));
					return;
				}
			} catch (@Pc(3040) Exception local3040) {
				Static180.method5442(Static289.aClass191_2.method4067(Static414.anInt9485));
				return;
			}
		}
		if (Static357.anInt5722 != 11) {
			Static180.method5442(Static289.aClass191_3.method4067(Static414.anInt9485) + arg0);
		}
	}
}
