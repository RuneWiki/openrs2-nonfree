import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static659 {

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Lclient!m;")
	public static final Class235 aClass235_50 = new Class235(255);

	@OriginalMember(owner = "client!up", name = "o", descriptor = "Z")
	public static boolean aBoolean761 = false;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_186 = new Class186(34, 5);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(III)V")
	public static void method8815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(1, (long) arg1);
		local9.method630();
		local9.anInt803 = arg0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(ZLjava/lang/String;ZZ)V")
	public static void method8818(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		try {
			label722: {
				if (!arg1.equalsIgnoreCase("commands") && !arg1.equalsIgnoreCase("help")) {
					if (arg1.equalsIgnoreCase("cls")) {
						Static159.anInt2951 = 0;
						Static112.anInt2245 = 0;
						return;
					}
					if (arg1.equalsIgnoreCase("displayfps")) {
						Static226.aBoolean354 = !Static226.aBoolean354;
						if (Static226.aBoolean354) {
							Static269.method4123("FPS on");
							return;
						}
						Static269.method4123("FPS off");
						return;
					}
					if (arg1.equals("renderer")) {
						@Pc(100) Class90 local100 = Static488.aClass67_12.method7687();
						Static269.method4123("Vendor: " + local100.anInt2666);
						Static269.method4123("Name: " + local100.aString46);
						Static269.method4123("Version: " + local100.anInt2665);
						Static269.method4123("Device: " + local100.aString45);
						Static269.method4123("Driver Version: " + local100.aLong101);
						return;
					}
					if (!arg1.equals("heap")) {
						if (arg1.equalsIgnoreCase("getcamerapos")) {
							Static269.method4123("Pos: " + Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 + "," + (Static714.anInt11156 + (Static173.anInt3144 >> 9) >> 6) + "," + (Static339.anInt5859 + (Static235.anInt4471 >> 9) >> 6) + "," + ((Static173.anInt3144 >> 9) + Static714.anInt11156 & 0x3F) + "," + (Static339.anInt5859 + (Static235.anInt4471 >> 9) & 0x3F) + " Height: " + (Static505.method7237(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146, Static235.anInt4471, Static173.anInt3144) - Static376.anInt6408));
							Static269.method4123("Look: " + Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146 + "," + (Static624.anInt10064 + Static714.anInt11156 >> 6) + "," + (Static71.anInt1112 + Static339.anInt5859 >> 6) + "," + (Static624.anInt10064 + Static714.anInt11156 & 0x3F) + "," + (Static71.anInt1112 + Static339.anInt5859 & 0x3F) + " Height: " + (Static505.method7237(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146, Static71.anInt1112, Static624.anInt10064) - Static641.anInt10380));
							return;
						}
						break label722;
					}
					Static269.method4123("Heap: " + Static719.anInt11246 + "MB");
					return;
				}
				Static269.method4123("commands - This command");
				Static269.method4123("cls - Clear console");
				Static269.method4123("displayfps - Toggle FPS and other information");
				Static269.method4123("renderer - Print graphics renderer information");
				Static269.method4123("heap - Print java memory information");
				Static269.method4123("getcamerapos - Print location and direction of camera for use in bug reports");
				return;
			}
		} catch (@Pc(320) Exception local320) {
			Static269.method4123(Static476.aClass279_2.method6992(Static141.anInt2658));
			return;
		}
		if (Static487.aClass371_7 != Static364.aClass371_4 || Static651.anInt10450 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static269.method4123("FPS: " + Static482.anInt8392);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static177.aBoolean501 = !Static177.aBoolean501;
					if (Static177.aBoolean501) {
						Static269.method4123("Occlsion now on!");
						return;
					}
					Static269.method4123("Occlsion now off!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static226.aBoolean354 = true;
					Static269.method4123("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static226.aBoolean354 = false;
					Static269.method4123("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static269.method4123("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static50.aClass3_Sub25_1.anInt4197 + "Mb");
						return;
					} catch (@Pc(473) Throwable local473) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static209.aClass66_3.method1379();
					Static269.method4123("Text coords cleared");
					return;
				}
				@Pc(520) int local520;
				@Pc(500) int local500;
				@Pc(511) Runtime local511;
				if (arg1.equalsIgnoreCase("gc")) {
					Static174.method8801();
					for (local500 = 0; local500 < 10; local500++) {
						System.gc();
					}
					local511 = Runtime.getRuntime();
					local520 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
					Static269.method4123("mem=" + local520 + "k");
					return;
				}
				@Pc(585) int local585;
				if (arg1.equalsIgnoreCase("compact")) {
					Static174.method8801();
					for (local500 = 0; local500 < 10; local500++) {
						System.gc();
					}
					local511 = Runtime.getRuntime();
					local520 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
					Static269.method4123("Memory before cleanup=" + local520 + "k");
					Static700.method9157();
					Static174.method8801();
					for (local585 = 0; local585 < 10; local585++) {
						System.gc();
					}
					local520 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
					Static269.method4123("Memory after cleanup=" + local520 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static269.method4123(Static114.method2021() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static269.method4123("Dropped client connection");
					if (Static178.anInt3225 == 11) {
						Static648.method8729();
					} else if (Static178.anInt3225 == 12) {
						Static532.aClass400_3.aBoolean795 = true;
						return;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static272.aClass314_7.method7592();
					Static269.method4123("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static406.aClass153_2.method3733();
					Static269.method4123("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static406.aClass153_2.method3737();
					Static269.method4123("Dropped server js5 net queue");
					return;
				}
				@Pc(740) int local740;
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static310.aClass47_4.method954();
					@Pc(738) Class400[] local738 = Static532.aClass400Array1;
					for (local740 = 0; local740 < local738.length; local740++) {
						@Pc(746) Class400 local746 = local738[local740];
						if (local746.aClass255_2 != null) {
							local746.aClass255_2.method6263();
						}
					}
					Static406.aClass153_2.method3732();
					Static269.method4123("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static268.method4109();
					Static82.method1060();
					Static269.method4123("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static570.aLong320 = Static626.method8479();
					Static198.aBoolean283 = true;
					Static268.method4109();
					Static82.method1060();
					Static269.method4123("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static354.method5127(-1, -1, false, 1);
					if (Static502.method7210() == 1) {
						Static269.method4123("wm1 succeeded");
						return;
					}
					Static269.method4123("wm1 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static354.method5127(-1, -1, false, 2);
					if (Static502.method7210() != 2) {
						Static269.method4123("wm2 failed");
						return;
					}
					Static269.method4123("wm2 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static354.method5127(768, 1024, false, 3);
					if (Static502.method7210() == 3) {
						Static269.method4123("wm3 succeeded");
						return;
					}
					Static269.method4123("wm3 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static718.method9389(0, false);
					if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 0) {
						Static269.method4123("Entered tk0");
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, 0);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					Static269.method4123("Failed to enter tk0");
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static718.method9389(1, false);
					if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 1) {
						Static269.method4123("Entered tk1");
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, 1);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					Static269.method4123("Failed to enter tk1");
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static718.method9389(2, false);
					if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 2) {
						Static269.method4123("Entered tk2");
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, 2);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					Static269.method4123("Failed to enter tk2");
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static718.method9389(3, false);
					if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() != 3) {
						Static269.method4123("Failed to enter tk3");
						return;
					}
					Static269.method4123("Entered tk3");
					Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, 3);
					Static328.method4885();
					Static675.aBoolean771 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static718.method9389(5, false);
					if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 5) {
						Static269.method4123("Entered tk5");
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, 5);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					Static269.method4123("Failed to enter tk5");
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static269.method4123("Invalid buildarea value");
						return;
					}
					local500 = Static349.method5057(arg1.substring(6));
					if (local500 >= 0 && local500 <= Static636.method8628(Static719.anInt11246)) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub21_1, local500);
						Static328.method4885();
						Static675.aBoolean771 = false;
						Static269.method4123("maxbuildarea=" + Static713.aClass3_Sub55_31.aClass15_Sub21_1.method7460());
						return;
					}
					Static269.method4123("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static269.method4123("Invalid rect_debug value");
						return;
					}
					Static59.anInt936 = Static349.method5057(arg1.substring(10).trim());
					Static269.method4123("rect_debug=" + Static59.anInt936);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static632.aBoolean738 = true;
					Static269.method4123("qa_op_test=" + Static632.aBoolean738);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static599.aBoolean706 = !Static599.aBoolean706;
					Static269.method4123("clipcomponents=" + Static599.aBoolean706);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(1291) boolean local1291 = Static488.aClass67_12.method7643();
					if (!Static375.method5420(!local1291)) {
						Static269.method4123("Failed to enable bloom");
						return;
					}
					if (!local1291) {
						Static269.method4123("Bloom enabled");
						return;
					}
					Static269.method4123("Bloom disabled");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (!Static218.aBoolean351) {
						Static218.aBoolean351 = true;
						Static269.method4123("Forced tweening ENABLED!");
						return;
					}
					Static218.aBoolean351 = false;
					Static269.method4123("Forced tweening disabled.");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (Static27.aBoolean15) {
						Static269.method4123("Shift-click disabled.");
						Static27.aBoolean15 = false;
						return;
					}
					Static269.method4123("Shift-click ENABLED!");
					Static27.aBoolean15 = true;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static269.method4123("x:" + (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 >> 9) + " z:" + (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static269.method4123("Height: " + Static639.aClass313Array2[Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146].method9095(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 >> 9, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static403.aClass221_115.method5090();
					Static403.aClass221_115.method5095();
					Static567.aClass405_3.method9358();
					Static462.aClass98_2.method2449();
					Static82.method1060();
					Static269.method4123("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (!Static488.aClass67_12.method7710()) {
						Static269.method4123("Current toolkit doesn't support multiple cores");
						return;
					}
					local500 = Integer.parseInt(arg1.substring(3));
					if (local500 < 1) {
						local500 = 1;
					} else if (local500 > 4) {
						local500 = 4;
					}
					Static460.anInt8099 = local500;
					Static268.method4109();
					Static269.method4123("Render cores now: " + Static460.anInt8099);
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static269.method4123("I(s): " + Static337.aClass338_29.method8042() + "/" + Static337.aClass338_29.method8046());
					Static269.method4123("I(m): " + Static682.aClass338_62.method8042() + "/" + Static682.aClass338_62.method8046());
					Static269.method4123("O(s): " + Static243.aClass406_2.aClass290_1.method7129(true) + "/" + Static243.aClass406_2.aClass290_1.method7135());
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static181.aBoolean266 = !Static181.aBoolean266;
					Static488.aClass67_12.method7652(Static181.aBoolean266);
					Static369.method5345();
					Static269.method4123("showprofiling=" + Static181.aBoolean266);
					return;
				}
				@Pc(1650) String[] local1650;
				if (arg1.startsWith("performancetest")) {
					local500 = -1;
					local740 = 1000;
					if (arg1.length() > 15) {
						local1650 = Static349.method5051(' ', arg1);
						try {
							if (local1650.length > 1) {
								local740 = Integer.parseInt(local1650[1]);
							}
						} catch (@Pc(1663) Throwable local1663) {
						}
						try {
							if (local1650.length > 2) {
								local500 = Integer.parseInt(local1650[2]);
							}
						} catch (@Pc(1674) Throwable local1674) {
						}
					}
					if (local500 == -1) {
						Static269.method4123("Java toolkit: " + Static111.method1982(0, local740));
						Static269.method4123("SSE toolkit:  " + Static111.method1982(2, local740));
						Static269.method4123("D3D toolkit:  " + Static111.method1982(3, local740));
						Static269.method4123("GL toolkit:   " + Static111.method1982(1, local740));
						Static269.method4123("GLX toolkit:  " + Static111.method1982(5, local740));
						return;
					}
					Static269.method4123("Performance: " + Static111.method1982(local500, local740));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static471.aBoolean766 = !Static471.aBoolean766;
					Static269.method4123("nonpcs=" + Static471.aBoolean766);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static407.method6075();
					Static269.method4123("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local500 = Integer.parseInt(arg1.substring(12));
					Static611.method7556(Static325.method4838(local500).aString106, local500);
					Static269.method4123("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static269.method4123("w: " + Static272.aClass314_7.anInt9072);
					return;
				}
				if (arg1.startsWith("pc")) {
					@Pc(1866) Class400 local1866 = Static81.method1057();
					@Pc(1872) Class3_Sub48 local1872 = Static89.method1200(Static44.aClass286_11, local1866.aClass399_2);
					local1872.aClass3_Sub28_Sub2_1.method5329(0);
					local520 = local1872.aClass3_Sub28_Sub2_1.anInt6241;
					local585 = arg1.indexOf(" ", 4);
					local1872.aClass3_Sub28_Sub2_1.method5283(arg1.substring(3, local585));
					Static32.method471(local1872.aClass3_Sub28_Sub2_1, arg1.substring(local585));
					local1872.aClass3_Sub28_Sub2_1.method5291(local1872.aClass3_Sub28_Sub2_1.anInt6241 - local520);
					local1866.method9223(local1872);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static423.method6246();
					Static269.method4123("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local500 = 0; local500 < Static568.anIntArray608.length; local500++) {
						if (Static214.aBooleanArray11[local500]) {
							Static568.anIntArray608[local500] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static568.anIntArray608[local500] *= -1;
							}
						}
					}
					Static423.method6246();
					Static269.method4123("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static626.aBoolean732 = true;
					Static82.method1060();
					Static269.method4123("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static626.aBoolean732 = false;
					Static82.method1060();
					Static269.method4123("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static299.method5787();
					Static269.method4123("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static269.method4123(Static209.method3109(67) + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local500 = Integer.parseInt(arg1.substring(17));
					Static269.method4123("varpbit=" + Static577.aClass362_1.method8659(local500));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local500 = Integer.parseInt(arg1.substring(14));
					Static269.method4123("varp=" + Static577.aClass362_1.method8660(local500));
					return;
				}
				@Pc(2121) String[] local2121;
				if (arg1.startsWith("directlogin")) {
					local2121 = Static349.method5051(' ', arg1.substring(12));
					if (local2121.length >= 2) {
						local740 = local2121.length <= 2 ? 0 : Integer.parseInt(local2121[2]);
						Static600.method8264(local740, local2121[1], local2121[0]);
						return;
					}
				}
				if (arg1.startsWith("snlogin ")) {
					local2121 = Static349.method5051(' ', arg1.substring(8));
					local740 = Integer.parseInt(local2121[0]);
					local520 = local2121.length == 2 ? Integer.parseInt(local2121[1]) : 0;
					Static388.method5838(local520, local740);
					return;
				}
				if (arg1.startsWith("csprofileclear")) {
					Static185.method2829();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static185.method2817();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static185.method2817();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local500 = Integer.parseInt(arg1.substring(8));
					Static488.aClass67_12.method7691(local500);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static269.method4123("Active streams: " + Static155.aClass3_Sub22_Sub4_1.method9061());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static188.method2870();
					Static269.method4123("Complete. Toolkit now: " + Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071());
					return;
				}
				if (arg1.equals("errormessage")) {
					Static269.method4123(Static556.aClient1.method1159());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static75.aString24.startsWith("win")) {
						Static663.method8839(new File("C:\\Temp\\heap.dump"));
					} else {
						Static663.method8839(new File("/tmp/heap.dump"));
					}
					Static269.method4123("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static269.method4123("Name: " + Static75.aString24);
					Static269.method4123("Arch: " + Static75.aString19);
					Static269.method4123("Ver: " + Static75.aString21);
					return;
				}
				if (arg1.startsWith("w2debug")) {
					local500 = Integer.parseInt(arg1.substring(8, 9));
					Static132.anInt2471 = local500;
					Static268.method4109();
					Static269.method4123("Toggled!");
					return;
				}
				if (arg1.startsWith("ortho ")) {
					local500 = arg1.indexOf(32);
					if (local500 < 0) {
						Static269.method4123("Syntax: ortho <n>");
						return;
					}
					local740 = Static349.method5057(arg1.substring(local500 + 1));
					Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub2_1, local740);
					Static328.method4885();
					Static675.aBoolean771 = false;
					Static373.method5411();
					if (local740 == Static713.aClass3_Sub55_31.aClass15_Sub2_1.method857()) {
						Static269.method4123("Successfully changed ortho mode");
						return;
					}
					Static269.method4123("Failed to change ortho mode");
					return;
				}
				if (arg1.startsWith("orthozoom ")) {
					if (Static713.aClass3_Sub55_31.aClass15_Sub2_1.method857() == 0) {
						Static269.method4123("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local500 = Static349.method5057(arg1.substring(arg1.indexOf(32) + 1));
					Static705.anInt11025 = local500;
					Static269.method4123("orthozoom=" + Static705.anInt11025);
					return;
				}
				if (arg1.startsWith("orthotilesize ")) {
					local500 = Static349.method5057(arg1.substring(arg1.indexOf(32) + 1));
					Static178.anInt3228 = local500;
					Static634.anInt10262 = local500;
					Static269.method4123("ortho tile size=" + local500);
					Static373.method5411();
					return;
				}
				if (arg1.equals("orthocamlock")) {
					Static671.aBoolean769 = !Static671.aBoolean769;
					Static269.method4123("ortho camera lock is " + (Static671.aBoolean769 ? "on" : "off"));
					return;
				}
				if (arg1.startsWith("skydetail ")) {
					local500 = Static349.method5057(arg1.substring(arg1.indexOf(32) + 1));
					Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub27_1, local500);
					Static269.method4123("skydetail is " + (Static713.aClass3_Sub55_31.aClass15_Sub27_1.method9037() == 0 ? "low" : "high"));
					return;
				}
				@Pc(2631) File local2631;
				if (arg1.startsWith("setoutput ")) {
					local2631 = new File(arg1.substring(10));
					if (local2631.exists()) {
						local2631 = new File(arg1.substring(10) + "." + Static626.method8479() + ".log");
						if (local2631.exists()) {
							Static269.method4123("file already exists!");
							return;
						}
					}
					if (Static699.aFileOutputStream1 != null) {
						Static699.aFileOutputStream1.close();
						Static699.aFileOutputStream1 = null;
					}
					try {
						Static699.aFileOutputStream1 = new FileOutputStream(local2631);
						return;
					} catch (@Pc(2680) FileNotFoundException local2680) {
						Static269.method4123("Could not create " + local2631.getName());
						return;
					} catch (@Pc(2694) SecurityException local2694) {
						Static269.method4123("Cannot write to " + local2631.getName());
						return;
					}
				}
				if (arg1.equals("closeoutput")) {
					if (Static699.aFileOutputStream1 != null) {
						Static699.aFileOutputStream1.close();
					}
					Static699.aFileOutputStream1 = null;
					return;
				}
				if (arg1.startsWith("runscript ")) {
					local2631 = new File(arg1.substring(10));
					if (!local2631.exists()) {
						Static269.method4123("No such file");
						return;
					}
					@Pc(2751) byte[] local2751 = Static80.method1035(local2631);
					if (local2751 == null) {
						Static269.method4123("Failed to read file");
						return;
					}
					local1650 = Static349.method5051('\n', Static576.method7961("", Static244.method3742(local2751)));
					Static53.method9363(local1650);
				}
				if (arg1.startsWith("zoom ")) {
					@Pc(2787) short local2787 = (short) Static349.method5057(arg1.substring(5));
					if (local2787 > 0) {
						Static674.aShort126 = local2787;
					}
					return;
				}
				if (arg1.startsWith("cs2debug")) {
					if (arg1.length() > 9 && arg1.charAt(8) == ' ') {
						Static185.aString61 = arg1.substring(9);
						Static185.aBoolean268 = true;
						Static269.method4123("cs2debug: (" + Static185.aString61 + ")");
						return;
					}
					Static185.aString61 = null;
					Static185.aBoolean268 = !Static185.aBoolean268;
					Static269.method4123("cs2debug:" + Static185.aBoolean268);
					return;
				}
				if (Static178.anInt3225 == 11) {
					@Pc(2868) Class3_Sub48 local2868 = Static89.method1200(Static645.aClass286_119, Static532.aClass400_3.aClass399_2);
					local2868.aClass3_Sub28_Sub2_1.method5329(arg1.length() + 3);
					local2868.aClass3_Sub28_Sub2_1.method5329(arg0 ? 1 : 0);
					local2868.aClass3_Sub28_Sub2_1.method5329(arg2 ? 1 : 0);
					local2868.aClass3_Sub28_Sub2_1.method5283(arg1);
					Static532.aClass400_3.method9223(local2868);
				}
				if (arg1.startsWith("fps ") && Static364.aClass371_4 != Static487.aClass371_7) {
					Static516.method8185(Static349.method5057(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2926) Exception local2926) {
				Static269.method4123(Static476.aClass279_2.method6992(Static141.anInt2658));
				return;
			}
		}
		if (Static178.anInt3225 != 11) {
			Static269.method4123(Static476.aClass279_3.method6992(Static141.anInt2658) + arg1);
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIII)I")
	public static int method8820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 7 - arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
