import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!sm", name = "E", descriptor = "Lclient!qq;")
	public static Class276 aClass276_7;

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString107 = null;

	@OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
	public static int anInt9140 = 0;

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)V")
	public static void method7806(@OriginalArg(0) int arg0) {
		Static433.anInt7845 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!kd;B)I")
	public static int method7809(@OriginalArg(0) Class20_Sub2_Sub2_Sub1_Sub2 arg0) {
		@Pc(8) Class247 local8 = arg0.aClass247_1;
		if (local8.anIntArray467 != null) {
			local8 = local8.method6613(Static279.aClass294_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt7680;
		@Pc(27) Class201 local27 = arg0.method4911();
		if (arg0.anInt5571 == -1 || arg0.aBoolean375) {
			local23 = local8.anInt7694;
		} else if (arg0.anInt5571 == local27.anInt6319 || local27.anInt6339 == arg0.anInt5571 || local27.anInt6334 == arg0.anInt5571 || local27.anInt6324 == arg0.anInt5571) {
			local23 = local8.anInt7707;
		} else if (arg0.anInt5571 == local27.anInt6338 || local27.anInt6350 == arg0.anInt5571 || arg0.anInt5571 == local27.anInt6317 || arg0.anInt5571 == local27.anInt6337) {
			local23 = local8.anInt7683;
		}
		return local23;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	public static void method7810() {
		@Pc(20) Class6_Sub9 local20 = Static560.method8089(Static391.aClass126_1, Static502.aClass208_77);
		local20.aClass6_Sub40_Sub2_1.method8561(Static500.anInt8420);
		Static263.method4681(local20);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZZILjava/lang/String;)V")
	public static void method7812(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static97.method1576("commands - This command");
				Static97.method1576("cls - Clear console");
				Static97.method1576("displayfps - Toggle FPS and other information");
				Static97.method1576("renderer - Print graphics renderer information");
				Static97.method1576("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static276.anInt5428 = 0;
				Static162.anInt3372 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static403.aBoolean505 = !Static403.aBoolean505;
				if (Static403.aBoolean505) {
					Static97.method1576("FPS on");
					return;
				}
				Static97.method1576("FPS off");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(69) Class168 local69 = Static162.aClass100_7.method8779();
				Static97.method1576("Vendor: " + local69.anInt5423);
				Static97.method1576("Name: " + local69.aString60);
				Static97.method1576("Version: " + local69.anInt5422);
				Static97.method1576("Device: " + local69.aString59);
				Static97.method1576("Driver Version: " + local69.aLong142);
				return;
			}
			if (arg2.equals("heap")) {
				Static97.method1576("Heap: " + Static396.anInt7427 + "MB");
				return;
			}
		} catch (@Pc(141) Exception local141) {
			Static97.method1576(Static317.aClass192_2.method5299(Static307.anInt5931));
			return;
		}
		if (Static212.aClass35_2 != Static418.aClass35_3 || Static578.anInt6641 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static97.method1576("FPS: " + Static340.anInt6735);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static365.aBoolean444 = !Static365.aBoolean444;
					if (Static365.aBoolean444) {
						Static97.method1576("Occlsion now on!");
						return;
					}
					Static97.method1576("Occlsion now off!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static403.aBoolean505 = true;
					Static97.method1576("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static403.aBoolean505 = false;
					Static97.method1576("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static97.method1576("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static428.aClass6_Sub28_1.anInt6061 + "Mb");
						return;
					} catch (@Pc(253) Throwable local253) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static78.aClass81_1.method2122();
					Static97.method1576("Text coords cleared");
					return;
				}
				@Pc(293) int local293;
				@Pc(273) int local273;
				@Pc(284) Runtime local284;
				if (arg2.equalsIgnoreCase("gc")) {
					Static624.method8684();
					for (local273 = 0; local273 < 10; local273++) {
						System.gc();
					}
					local284 = Runtime.getRuntime();
					local293 = (int) ((local284.totalMemory() - local284.freeMemory()) / 1024L);
					Static97.method1576("mem=" + local293 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static624.method8684();
					for (local273 = 0; local273 < 10; local273++) {
						System.gc();
					}
					local284 = Runtime.getRuntime();
					local293 = (int) ((local284.totalMemory() - local284.freeMemory()) / 1024L);
					Static97.method1576("Memory before cleanup=" + local293 + "k");
					Static298.method5520();
					Static624.method8684();
					for (@Pc(350) int local350 = 0; local350 < 10; local350++) {
						System.gc();
					}
					local293 = (int) ((local284.totalMemory() - local284.freeMemory()) / 1024L);
					Static97.method1576("Memory after cleanup=" + local293 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static97.method1576(Static605.method8490() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static97.method1576("Dropped client connection");
					if (Static554.anInt1821 == 10) {
						Static534.method7893();
					} else if (Static554.anInt1821 == 11) {
						Static243.aBoolean343 = true;
						return;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static315.aClass56_4.method1429();
					Static97.method1576("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static34.aClass296_2.method7434();
					Static97.method1576("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static34.aClass296_2.method7425();
					Static97.method1576("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static529.aClass112_6.method3233();
					Static97.aClass29_1.method4602();
					Static34.aClass296_2.method7430();
					Static97.method1576("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static348.method5622();
					Static147.method2345();
					Static97.method1576("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static412.aLong125 = Static32.method595();
					Static288.aBoolean384 = true;
					Static348.method5622();
					Static147.method2345();
					Static97.method1576("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static381.method5938(false, -1, 1, -1);
					if (Static323.method5374() == 1) {
						Static97.method1576("wm1 succeeded");
						return;
					}
					Static97.method1576("wm1 failed");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static381.method5938(false, -1, 2, -1);
					if (Static323.method5374() != 2) {
						Static97.method1576("wm2 failed");
						return;
					}
					Static97.method1576("wm2 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static381.method5938(false, 1024, 3, 768);
					if (Static323.method5374() != 3) {
						Static97.method1576("wm3 failed");
						return;
					}
					Static97.method1576("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static278.method4875(0, false);
					if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() == 0) {
						Static97.method1576("Entered tk0");
						Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
						Static289.method5031();
						Static509.aBoolean584 = false;
						return;
					}
					Static97.method1576("Failed to enter tk0");
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static278.method4875(1, false);
					if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() != 1) {
						Static97.method1576("Failed to enter tk1");
						return;
					}
					Static97.method1576("Entered tk1");
					Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static278.method4875(2, false);
					if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() != 2) {
						Static97.method1576("Failed to enter tk2");
						return;
					}
					Static97.method1576("Entered tk2");
					Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
					Static289.method5031();
					Static509.aBoolean584 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static278.method4875(3, false);
					if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() == 3) {
						Static97.method1576("Entered tk3");
						Static348.aClass6_Sub22_19.method3534(3, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
						Static289.method5031();
						Static509.aBoolean584 = false;
						return;
					}
					Static97.method1576("Failed to enter tk3");
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static278.method4875(5, false);
					if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() == 5) {
						Static97.method1576("Entered tk5");
						Static348.aClass6_Sub22_19.method3534(5, Static348.aClass6_Sub22_19.aClass15_Sub22_1);
						Static289.method5031();
						Static509.aBoolean584 = false;
						return;
					}
					Static97.method1576("Failed to enter tk5");
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static97.method1576("Invalid buildarea value");
						return;
					}
					local273 = Static355.method5682(arg2.substring(6));
					if (local273 >= 0 && Static205.method3576(Static396.anInt7427) >= local273) {
						Static348.aClass6_Sub22_19.method3534(local273, Static348.aClass6_Sub22_19.aClass15_Sub24_1);
						Static289.method5031();
						Static509.aBoolean584 = false;
						Static97.method1576("maxbuildarea=" + Static348.aClass6_Sub22_19.aClass15_Sub24_1.method8343());
						return;
					}
					Static97.method1576("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static97.method1576("Invalid rect_debug value");
						return;
					}
					Static205.anInt4087 = Static355.method5682(arg2.substring(10).trim());
					Static97.method1576("rect_debug=" + Static205.anInt4087);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static321.aBoolean412 = true;
					Static97.method1576("qa_op_test=" + Static321.aBoolean412);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static462.aBoolean556 = !Static462.aBoolean556;
					Static97.method1576("clipcomponents=" + Static462.aBoolean556);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(885) boolean local885 = Static162.aClass100_7.method8784();
					if (!Static448.method6930(!local885)) {
						Static97.method1576("Failed to enable bloom");
						return;
					}
					if (!local885) {
						Static97.method1576("Bloom enabled");
						return;
					}
					Static97.method1576("Bloom disabled");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static43.aBoolean46) {
						Static43.aBoolean46 = false;
						Static97.method1576("Forced tweening disabled.");
						return;
					}
					Static43.aBoolean46 = true;
					Static97.method1576("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static576.aBoolean330) {
						Static97.method1576("Shift-click disabled.");
						Static576.aBoolean330 = false;
						return;
					}
					Static97.method1576("Shift-click ENABLED!");
					Static576.aBoolean330 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static97.method1576("x:" + (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 >> 9) + " z:" + (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static97.method1576("Height: " + Static195.aClass199Array1[Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131].method8532(Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725 >> 9, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static540.aClass353_110.method8425();
					Static540.aClass353_110.method8417();
					Static592.aClass304_4.method7757();
					Static184.aClass337_2.method8115();
					Static147.method2345();
					Static97.method1576("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static162.aClass100_7.method8825()) {
						local273 = Integer.parseInt(arg2.substring(3));
						if (local273 < 1) {
							local273 = 1;
						} else if (local273 > 4) {
							local273 = 4;
						}
						Static393.anInt7352 = local273;
						Static348.method5622();
						Static97.method1576("Render cores now: " + Static393.anInt7352);
						return;
					}
					Static97.method1576("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static97.method1576("I(s): " + Static560.aClass166_56.method4800() + "/" + Static560.aClass166_56.method4806());
					Static97.method1576("I(m): " + Static292.aClass166_29.method4800() + "/" + Static292.aClass166_29.method4806());
					Static97.method1576("O(s): " + Static266.aClass138_1.aClass369_1.method8714() + "/" + Static266.aClass138_1.aClass369_1.method8708());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static97.method1576("Pos: " + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 + "," + ((Static580.anInt9662 >> 9) + Static606.anInt8651 >> 6) + "," + ((Static524.anInt9123 >> 9) + Static195.anInt3961 >> 6) + "," + (Static606.anInt8651 + (Static580.anInt9662 >> 9) & 0x3F) + "," + (Static195.anInt3961 + (Static524.anInt9123 >> 9) & 0x3F) + " Height: " + (Static138.method2248(Static580.anInt9662, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131, Static524.anInt9123) - Static428.anInt7788));
					Static97.method1576("Look: " + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 + "," + (Static80.anInt1683 + Static606.anInt8651 >> 6) + "," + (Static195.anInt3961 + Static81.anInt1699 >> 6) + "," + (Static80.anInt1683 + Static606.anInt8651 & 0x3F) + "," + (Static195.anInt3961 + Static81.anInt1699 & 0x3F) + " Height: " + (Static138.method2248(Static80.anInt1683, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131, Static81.anInt1699) - Static26.anInt536));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static386.aBoolean376 = !Static386.aBoolean376;
					Static162.aClass100_7.method8775(Static386.aBoolean376);
					Static251.method4489();
					Static97.method1576("showprofiling=" + Static386.aBoolean376);
					return;
				}
				@Pc(1297) String[] local1297;
				@Pc(1288) int local1288;
				if (arg2.startsWith("performancetest")) {
					local273 = -1;
					local1288 = 1000;
					if (arg2.length() > 15) {
						local1297 = Static513.method7614(arg2, ' ');
						try {
							if (local1297.length > 1) {
								local1288 = Integer.parseInt(local1297[1]);
							}
						} catch (@Pc(1308) Throwable local1308) {
						}
						try {
							if (local1297.length > 2) {
								local273 = Integer.parseInt(local1297[2]);
							}
						} catch (@Pc(1319) Throwable local1319) {
						}
					}
					if (local273 == -1) {
						Static97.method1576("Java toolkit: " + Static385.method6196(0, local1288));
						Static97.method1576("SSE toolkit:  " + Static385.method6196(2, local1288));
						Static97.method1576("D3D toolkit:  " + Static385.method6196(3, local1288));
						Static97.method1576("GL toolkit:   " + Static385.method6196(1, local1288));
						Static97.method1576("GLX toolkit:  " + Static385.method6196(5, local1288));
						return;
					}
					Static97.method1576("Performance: " + Static385.method6196(local273, local1288));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static643.aBoolean726 = !Static643.aBoolean726;
					Static97.method1576("nonpcs=" + Static643.aBoolean726);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static60.method1080();
					Static97.method1576("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local273 = Integer.parseInt(arg2.substring(12));
					Static470.method7121(local273, Static499.method7445(local273).aString15);
					Static97.method1576("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static97.method1576("w: " + Static315.aClass56_4.anInt1712);
					return;
				}
				@Pc(1479) Class6_Sub9 local1479;
				if (arg2.startsWith("pc")) {
					local1479 = Static560.method8089(Static391.aClass126_1, Static145.aClass208_27);
					local1479.aClass6_Sub40_Sub2_1.method8589(0);
					local1288 = local1479.aClass6_Sub40_Sub2_1.anInt10169;
					local293 = arg2.indexOf(" ", 4);
					local1479.aClass6_Sub40_Sub2_1.method8551(arg2.substring(3, local293));
					Static267.method4762(arg2.substring(local293), local1479.aClass6_Sub40_Sub2_1);
					local1479.aClass6_Sub40_Sub2_1.method8605(local1479.aClass6_Sub40_Sub2_1.anInt10169 - local1288);
					Static263.method4681(local1479);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static238.method4143();
					Static97.method1576("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local273 = 0; local273 < Static522.anIntArray557.length; local273++) {
						if (Static211.aBooleanArray25[local273]) {
							Static522.anIntArray557[local273] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static522.anIntArray557[local273] *= -1;
							}
						}
					}
					Static238.method4143();
					Static97.method1576("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static165.aBoolean248 = true;
					Static147.method2345();
					Static97.method1576("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static165.aBoolean248 = false;
					Static147.method2345();
					Static97.method1576("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static223.method3776();
					Static97.method1576("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static97.method1576(Static175.method3218() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local273 = Integer.parseInt(arg2.substring(17));
					Static97.method1576("varpbit=" + Static279.aClass294_1.method7412(local273));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local273 = Integer.parseInt(arg2.substring(14));
					Static97.method1576("varp=" + Static279.aClass294_1.method7411(local273));
					return;
				}
				if (arg2.startsWith("directlogin")) {
					@Pc(1685) String[] local1685 = Static513.method7614(arg2.substring(12), ' ');
					if (local1685.length >= 2) {
						local1288 = local1685.length > 2 ? Integer.parseInt(local1685[2]) : 0;
						Static108.method1760(local1685[1], local1288, local1685[0]);
						return;
					}
				}
				if (arg2.startsWith("csprofileclear")) {
					Static244.method4201();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static244.method4204();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static244.method4204();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local273 = Integer.parseInt(arg2.substring(8));
					Static162.aClass100_7.method8824(local273);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static97.method1576("Active streams: " + Static196.aClass6_Sub3_Sub1_1.method269());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static114.method1889();
					Static97.method1576("Complete. Toolkit now: " + Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static97.method1576(Static119.aClient1.method1348());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static177.aString41.startsWith("win")) {
						Static149.method2367(new File("C:\\Temp\\heap.dump"));
					} else {
						Static149.method2367(new File("/tmp/heap.dump"));
					}
					Static97.method1576("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static97.method1576("Name: " + Static177.aString41);
					Static97.method1576("Arch: " + Static177.aString39);
					Static97.method1576("Ver: " + Static177.aString45);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local273 = Integer.parseInt(arg2.substring(8, 9));
					Static249.anInt4972 = local273;
					Static348.method5622();
					Static97.method1576("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local273 = arg2.indexOf(32);
					if (local273 < 0) {
						Static97.method1576("Syntax: ortho <n>");
						return;
					}
					local1288 = Static355.method5682(arg2.substring(local273 + 1));
					Static348.aClass6_Sub22_19.method3534(local1288, Static348.aClass6_Sub22_19.aClass15_Sub15_1);
					Static289.method5031();
					Static509.aBoolean584 = false;
					Static350.method5633();
					if (Static348.aClass6_Sub22_19.aClass15_Sub15_1.method5047() == local1288) {
						Static97.method1576("Successfully changed ortho mode");
						return;
					}
					Static97.method1576("Failed to change ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static348.aClass6_Sub22_19.aClass15_Sub15_1.method5047() == 0) {
						Static97.method1576("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local273 = Static355.method5682(arg2.substring(arg2.indexOf(32) + 1));
					Static419.anInt7658 = local273;
					Static97.method1576("orthozoom=" + Static419.anInt7658);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local273 = Static355.method5682(arg2.substring(arg2.indexOf(32) + 1));
					Static213.anInt4193 = local273;
					Static647.anInt10719 = local273;
					Static97.method1576("ortho tile size=" + local273);
					Static350.method5633();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static233.aBoolean332 = !Static233.aBoolean332;
					Static97.method1576("ortho camera lock is " + (Static233.aBoolean332 ? "on" : "off"));
					return;
				}
				@Pc(2044) File local2044;
				if (arg2.startsWith("setoutput ")) {
					local2044 = new File(arg2.substring(10));
					if (local2044.exists()) {
						local2044 = new File(arg2.substring(10) + "." + Static32.method595() + ".log");
						if (local2044.exists()) {
							Static97.method1576("file already exists!");
							return;
						}
					}
					if (Static326.aFileOutputStream1 != null) {
						Static326.aFileOutputStream1.close();
						Static326.aFileOutputStream1 = null;
					}
					try {
						Static326.aFileOutputStream1 = new FileOutputStream(local2044);
						return;
					} catch (@Pc(2086) FileNotFoundException local2086) {
						Static97.method1576("Could not create " + local2044.getName());
						return;
					} catch (@Pc(2098) SecurityException local2098) {
						Static97.method1576("Cannot write to " + local2044.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static326.aFileOutputStream1 != null) {
						Static326.aFileOutputStream1.close();
					}
					Static326.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local2044 = new File(arg2.substring(10));
					if (!local2044.exists()) {
						Static97.method1576("No such file");
						return;
					}
					@Pc(2144) byte[] local2144 = Static169.method3112(local2044);
					if (local2144 == null) {
						Static97.method1576("Failed to read file");
						return;
					}
					local1297 = Static513.method7614(Static377.method7191("", Static4.method7047(local2144)), '\n');
					Static553.method8004(local1297);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2177) short local2177 = (short) Static355.method5682(arg2.substring(5));
					if (local2177 > 0) {
						Static509.aShort110 = local2177;
					}
					return;
				}
				if (Static554.anInt1821 == 10) {
					local1479 = Static560.method8089(Static391.aClass126_1, Static546.aClass208_83);
					local1479.aClass6_Sub40_Sub2_1.method8589(arg2.length() + 3);
					local1479.aClass6_Sub40_Sub2_1.method8589(arg1 ? 1 : 0);
					local1479.aClass6_Sub40_Sub2_1.method8589(arg0 ? 1 : 0);
					local1479.aClass6_Sub40_Sub2_1.method8551(arg2);
					Static263.method4681(local1479);
				}
				if (arg2.startsWith("fps ") && Static212.aClass35_2 != Static418.aClass35_3) {
					Static455.method7006(Static355.method5682(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2250) Exception local2250) {
				Static97.method1576(Static317.aClass192_2.method5299(Static307.anInt5931));
				return;
			}
		}
		if (Static554.anInt1821 != 10) {
			Static97.method1576(Static317.aClass192_3.method5299(Static307.anInt5931) + arg2);
		}
	}
}
