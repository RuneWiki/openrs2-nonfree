import jagex3.jagmisc.jagmisc;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
	public static int anInt8051;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZLjava/lang/String;ZZ)V")
	public static void method6797(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
				Static369.method5492("commands - This command");
				Static369.method5492("cls - Clear console");
				Static369.method5492("displayfps - Toggle FPS and other information");
				Static369.method5492("renderer - Print graphics renderer information");
				Static369.method5492("heap - Print java memory information");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static442.anInt8541 = 0;
				Static536.anInt8399 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("displayfps")) {
				Static537.aBoolean334 = !Static537.aBoolean334;
				if (Static537.aBoolean334) {
					Static369.method5492("FPS on");
					return;
				}
				Static369.method5492("FPS off");
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(65) Class216 local65 = Static4.aClass43_1.method7186();
				Static369.method5492("Vendor: " + local65.anInt5947);
				Static369.method5492("Name: " + local65.aString79);
				Static369.method5492("Version: " + local65.anInt5946);
				Static369.method5492("Device: " + local65.aString78);
				Static369.method5492("Driver Version: " + local65.aLong168);
				return;
			}
			if (arg1.equals("heap")) {
				Static369.method5492("Heap: " + Static597.anInt9433 + "MB");
				return;
			}
		} catch (@Pc(133) Exception local133) {
			Static369.method5492(Static48.aClass33_4.method797(Static131.anInt2839));
			return;
		}
		if (Static555.aClass173_8 != Static559.aClass173_9 || Static274.anInt5067 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static369.method5492("FPS: " + Static306.anInt5563);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static32.aBoolean54 = !Static32.aBoolean54;
					if (!Static32.aBoolean54) {
						Static369.method5492("Occlsion now off!");
						return;
					}
					Static369.method5492("Occlsion now on!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static537.aBoolean334 = true;
					Static369.method5492("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static537.aBoolean334 = false;
					Static369.method5492("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static369.method5492("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(244) Throwable local244) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static479.aClass309_11.method6588();
					Static369.method5492("Text coords cleared");
					return;
				}
				@Pc(282) int local282;
				@Pc(264) int local264;
				@Pc(273) Runtime local273;
				if (arg1.equalsIgnoreCase("gc")) {
					Static227.method3894();
					for (local264 = 0; local264 < 10; local264++) {
						System.gc();
					}
					local273 = Runtime.getRuntime();
					local282 = (int) ((local273.totalMemory() - local273.freeMemory()) / 1024L);
					Static369.method5492("mem=" + local282 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("compact")) {
					Static227.method3894();
					for (local264 = 0; local264 < 10; local264++) {
						System.gc();
					}
					local273 = Runtime.getRuntime();
					local282 = (int) ((local273.totalMemory() - local273.freeMemory()) / 1024L);
					Static369.method5492("Memory before cleanup=" + local282 + "k");
					Static466.method7466();
					Static227.method3894();
					for (@Pc(337) int local337 = 0; local337 < 10; local337++) {
						System.gc();
					}
					local282 = (int) ((local273.totalMemory() - local273.freeMemory()) / 1024L);
					Static369.method5492("Memory after cleanup=" + local282 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static369.method5492(Static86.method1946() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static369.method5492("Dropped client connection");
					if (Static246.anInt4542 == 10) {
						Static492.method5129();
						return;
					}
					if (Static246.anInt4542 == 11) {
						Static447.aBoolean581 = true;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static583.aClass65_5.method2046();
					Static369.method5492("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static153.aClass331_1.method7002();
					Static369.method5492("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static153.aClass331_1.method7009();
					Static369.method5492("Dropped server js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static409.aClass221_6.method5201();
					Static78.aClass152_2.method3913();
					Static153.aClass331_1.method7001();
					Static369.method5492("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static447.method6262();
					Static79.method1727();
					Static369.method5492("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static106.aLong64 = Static587.method7753();
					Static198.aBoolean314 = true;
					Static447.method6262();
					Static79.method1727();
					Static369.method5492("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static29.method547(-1, 1, -1, false);
					if (Static294.method4660() == 1) {
						Static369.method5492("wm1 succeeded");
						return;
					}
					Static369.method5492("wm1 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static29.method547(-1, 2, -1, false);
					if (Static294.method4660() == 2) {
						Static369.method5492("wm2 succeeded");
						return;
					}
					Static369.method5492("wm2 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static29.method547(1024, 3, 768, false);
					if (Static294.method4660() != 3) {
						Static369.method5492("wm3 failed");
						return;
					}
					Static369.method5492("wm3 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static137.method2648(0);
					if (Static260.anInt4932 == 0) {
						Static369.method5492("Entered tk0");
						Static278.aClass3_Sub13_Sub1_1.anInt5130 = 0;
						Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
						Static529.aBoolean647 = false;
						return;
					}
					Static369.method5492("Failed to enter tk0");
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static137.method2648(1);
					if (Static260.anInt4932 != 1) {
						Static369.method5492("Failed to enter tk1");
						return;
					}
					Static369.method5492("Entered tk1");
					Static278.aClass3_Sub13_Sub1_1.anInt5130 = 1;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static137.method2648(2);
					if (Static260.anInt4932 == 2) {
						Static369.method5492("Entered tk2");
						Static278.aClass3_Sub13_Sub1_1.anInt5130 = 2;
						Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
						Static529.aBoolean647 = false;
						return;
					}
					Static369.method5492("Failed to enter tk2");
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static137.method2648(3);
					if (Static260.anInt4932 == 3) {
						Static369.method5492("Entered tk3");
						Static278.aClass3_Sub13_Sub1_1.anInt5130 = 3;
						Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
						Static529.aBoolean647 = false;
						return;
					}
					Static369.method5492("Failed to enter tk3");
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static137.method2648(5);
					if (Static260.anInt4932 == 5) {
						Static369.method5492("Entered tk5");
						Static278.aClass3_Sub13_Sub1_1.anInt5130 = 5;
						Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
						Static529.aBoolean647 = false;
						return;
					}
					Static369.method5492("Failed to enter tk5");
					return;
				}
				if (arg1.equalsIgnoreCase("ot")) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean398 = !Static278.aClass3_Sub13_Sub1_1.aBoolean398;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					Static447.method6262();
					Static369.method5492("ot=" + Static278.aClass3_Sub13_Sub1_1.aBoolean398);
					return;
				}
				if (arg1.equalsIgnoreCase("gb")) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean412 = !Static278.aClass3_Sub13_Sub1_1.aBoolean412;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					Static447.method6262();
					Static369.method5492("gb=" + Static278.aClass3_Sub13_Sub1_1.aBoolean412);
					return;
				}
				@Pc(772) int local772;
				if (arg1.startsWith("shadows")) {
					if (arg1.length() < 8) {
						Static369.method5492("Invalid shadows value");
						return;
					}
					@Pc(762) String local762 = arg1.substring(8);
					local772 = Static463.method6417(local762) ? Static118.method2472(local762) : -1;
					if (local772 >= 0 && local772 <= 2) {
						Static278.aClass3_Sub13_Sub1_1.method4456(local772, Static260.anInt4932);
						Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
						Static529.aBoolean647 = false;
						Static447.method6262();
						Static369.method5492("shadows=" + local772);
						return;
					}
					Static369.method5492("Invalid shadows value");
					return;
				}
				if (arg1.startsWith("textures")) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean410 = !Static278.aClass3_Sub13_Sub1_1.aBoolean410;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					Static385.method5693();
					Static447.method6262();
					Static369.method5492("textures=" + Static278.aClass3_Sub13_Sub1_1.aBoolean410);
					return;
				}
				if (arg1.startsWith("lighting")) {
					Static278.aClass3_Sub13_Sub1_1.method4463(Static260.anInt4932, !Static278.aClass3_Sub13_Sub1_1.method4457(Static260.anInt4932));
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					Static578.method7669();
					Static385.method5693();
					Static447.method6262();
					Static369.method5492("lighting=" + Static278.aClass3_Sub13_Sub1_1.method4457(Static260.anInt4932));
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static369.method5492("Invalid buildarea value");
						return;
					}
					local264 = Static118.method2472(arg1.substring(6));
					if (local264 >= 0 && Static462.method6403(Static597.anInt9433) >= local264) {
						Static278.aClass3_Sub13_Sub1_1.anInt5161 = local264;
						Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
						Static529.aBoolean647 = false;
						Static369.method5492("maxbuildarea=" + Static278.aClass3_Sub13_Sub1_1.anInt5161);
						return;
					}
					Static369.method5492("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static369.method5492("Invalid rect_debug value");
						return;
					}
					Static309.anInt2464 = Static118.method2472(arg1.substring(10).trim());
					Static369.method5492("rect_debug=" + Static309.anInt2464);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static393.aBoolean543 = true;
					Static369.method5492("qa_op_test=" + Static393.aBoolean543);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static438.aBoolean339 = !Static438.aBoolean339;
					Static369.method5492("clipcomponents=" + Static438.aBoolean339);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(1008) boolean local1008 = Static4.aClass43_1.method7216();
					if (Static531.method7010(!local1008)) {
						if (local1008) {
							Static369.method5492("Bloom disabled");
							return;
						}
						Static369.method5492("Bloom enabled");
						return;
					}
					Static369.method5492("Failed to enable bloom");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (Static233.aBoolean341) {
						Static233.aBoolean341 = false;
						Static369.method5492("Forced tweening disabled.");
						return;
					}
					Static233.aBoolean341 = true;
					Static369.method5492("Forced tweening ENABLED!");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (Static522.aBoolean641) {
						Static369.method5492("Shift-click disabled.");
						Static522.aBoolean641 = false;
						return;
					}
					Static369.method5492("Shift-click ENABLED!");
					Static522.aBoolean641 = true;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static369.method5492("x:" + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 >> 9) + " z:" + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static369.method5492("Height: " + Static29.aClass139Array6[Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126].method6889(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 >> 9, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static171.aClass246_84.method5661();
					Static171.aClass246_84.method5662();
					Static453.aClass348_3.method7404();
					Static191.aClass168_2.method4066();
					Static79.method1727();
					Static369.method5492("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (!Static4.aClass43_1.method7153()) {
						Static369.method5492("Current toolkit doesn't support multiple cores");
						return;
					}
					local264 = Integer.parseInt(arg1.substring(3));
					if (local264 < 1) {
						local264 = 1;
					} else if (local264 > 4) {
						local264 = 4;
					}
					Static94.anInt2311 = local264;
					Static447.method6262();
					Static369.method5492("Render cores now: " + Static94.anInt2311);
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static369.method5492("I(s): " + Static245.aClass10_22.method253() + "/" + Static245.aClass10_22.method251());
					Static369.method5492("I(m): " + Static19.aClass10_3.method253() + "/" + Static19.aClass10_3.method251());
					Static369.method5492("O(s): " + Static517.aClass145_1.aClass316_1.method6717() + "/" + Static517.aClass145_1.aClass316_1.method6711());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static369.method5492("Pos: " + Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 + "," + ((Static421.anInt7061 >> 9) + Static529.anInt8344 >> 6) + "," + ((Static233.anInt4431 >> 9) + Static463.anInt7588 >> 6) + "," + (Static529.anInt8344 + (Static421.anInt7061 >> 9) & 0x3F) + "," + (Static463.anInt7588 + (Static233.anInt4431 >> 9) & 0x3F) + " Height: " + (Static130.method2562(Static233.anInt4431, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126, Static421.anInt7061) - Static545.anInt8633));
					Static369.method5492("Look: " + Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 + "," + (Static529.anInt8344 + Static206.anInt4180 >> 6) + "," + (Static463.anInt7588 + Static452.anInt7420 >> 6) + "," + (Static529.anInt8344 + Static206.anInt4180 & 0x3F) + "," + (Static452.anInt7420 + Static463.anInt7588 & 0x3F) + " Height: " + (Static130.method2562(Static452.anInt7420, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126, Static206.anInt4180) - Static21.anInt546));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static202.aBoolean317 = !Static202.aBoolean317;
					Static4.aClass43_1.method7206(Static202.aBoolean317);
					Static270.method4387();
					Static369.method5492("showprofiling=" + Static202.aBoolean317);
					return;
				}
				if (arg1.startsWith("performancetest")) {
					local264 = -1;
					local772 = 1000;
					if (arg1.length() > 15) {
						@Pc(1407) String[] local1407 = Static583.method7710(' ', arg1);
						try {
							if (local1407.length > 1) {
								local772 = Integer.parseInt(local1407[1]);
							}
						} catch (@Pc(1420) Throwable local1420) {
						}
						try {
							if (local1407.length > 2) {
								local264 = Integer.parseInt(local1407[2]);
							}
						} catch (@Pc(1433) Throwable local1433) {
						}
					}
					if (local264 != -1) {
						Static369.method5492("Performance: " + Static109.method2274(Static260.anInt4932, local772));
						return;
					}
					Static369.method5492("Java toolkit: " + Static109.method2274(0, local772));
					Static369.method5492("SSE toolkit:  " + Static109.method2274(2, local772));
					Static369.method5492("D3D toolkit:  " + Static109.method2274(3, local772));
					Static369.method5492("GL toolkit:   " + Static109.method2274(1, local772));
					Static369.method5492("GLX toolkit:  " + Static109.method2274(5, local772));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static275.aBoolean396 = !Static275.aBoolean396;
					Static369.method5492("nonpcs=" + Static275.aBoolean396);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static427.method6071();
					Static369.method5492("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local264 = Integer.parseInt(arg1.substring(12));
					Static19.method419(local264, Static48.method798(local264).aString50);
					Static369.method5492("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static369.method5492("w: " + Static583.aClass65_5.anInt2279);
					return;
				}
				@Pc(1587) Class3_Sub34 local1587;
				if (arg1.startsWith("pc")) {
					local1587 = Static374.method5522(Static148.aClass298_61, Static220.aClass287_2);
					local1587.aClass3_Sub11_Sub1_2.method3079(0);
					local772 = local1587.aClass3_Sub11_Sub1_2.anInt3520;
					local282 = arg1.indexOf(" ", 4);
					local1587.aClass3_Sub11_Sub1_2.method3136(arg1.substring(3, local282));
					Static111.method2346(local1587.aClass3_Sub11_Sub1_2, arg1.substring(local282));
					local1587.aClass3_Sub11_Sub1_2.method3127(local1587.aClass3_Sub11_Sub1_2.anInt3520 - local772);
					Static131.method2572(local1587);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static537.method3881();
					Static369.method5492("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local264 = 0; local264 < Static99.anIntArray166.length; local264++) {
						if (Static376.aBooleanArray27[local264]) {
							Static99.anIntArray166[local264] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static99.anIntArray166[local264] *= -1;
							}
						}
					}
					Static537.method3881();
					Static369.method5492("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static236.aBoolean344 = true;
					Static79.method1727();
					Static369.method5492("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static236.aBoolean344 = false;
					Static79.method1727();
					Static369.method5492("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static65.method1513();
					Static369.method5492("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static369.method5492(Static493.method5819() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local264 = Integer.parseInt(arg1.substring(17));
					Static369.method5492("varpbit=" + Static427.aClass56_1.method1725(local264));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local264 = Integer.parseInt(arg1.substring(14));
					Static369.method5492("varp=" + Static427.aClass56_1.method1726(local264));
					return;
				}
				if (arg1.startsWith("demologin")) {
					Static175.method3038(false, 0);
					return;
				}
				if (arg1.startsWith("newdemologin")) {
					Static175.method3038(true, 0);
					return;
				}
				if (arg1.startsWith("directlogin")) {
					@Pc(1809) String[] local1809 = Static583.method7710(' ', arg1.substring(12));
					if (local1809.length >= 2) {
						local772 = local1809.length > 2 ? Integer.parseInt(local1809[2]) : 0;
						Static567.method7552(local1809[0], local772, local1809[1]);
						return;
					}
				}
				if (arg1.startsWith("csprofileclear")) {
					Static149.method2781();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static149.method2773();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static149.method2773();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local264 = Integer.parseInt(arg1.substring(8));
					Static4.aClass43_1.method7191(local264);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static369.method5492("Active streams: " + Static164.aClass3_Sub6_Sub1_1.method287());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static278.aClass3_Sub13_Sub1_1.method4478();
					Static369.method5492("Complete. Toolkit now: " + Static260.anInt4932);
					return;
				}
				if (arg1.equals("errormessage")) {
					Static369.method5492(Static478.aClient1.method1613());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static342.aString82.startsWith("win")) {
						Static532.method7030(new File("C:\\Temp\\heap.dump"));
					} else {
						Static532.method7030(new File("/tmp/heap.dump"));
					}
					Static369.method5492("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static369.method5492("Name: " + Static342.aString82);
					Static369.method5492("Arch: " + Static342.aString85);
					Static369.method5492("Ver: " + Static342.aString83);
					return;
				}
				if (arg1.equals("w2debug")) {
					Static351.aBoolean498 = !Static351.aBoolean498;
					Static447.method6262();
					Static369.method5492("Toggled!");
					return;
				}
				if (Static246.anInt4542 == 10) {
					local1587 = Static374.method5522(Static218.aClass298_83, Static220.aClass287_2);
					local1587.aClass3_Sub11_Sub1_2.method3079(arg1.length() + 3);
					local1587.aClass3_Sub11_Sub1_2.method3079(arg2 ? 1 : 0);
					local1587.aClass3_Sub11_Sub1_2.method3079(arg0 ? 1 : 0);
					local1587.aClass3_Sub11_Sub1_2.method3136(arg1);
					Static131.method2572(local1587);
				}
				if (arg1.startsWith("fps ") && Static555.aClass173_8 != Static559.aClass173_9) {
					Static230.method3917(Static118.method2472(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2052) Exception local2052) {
				Static369.method5492(Static48.aClass33_4.method797(Static131.anInt2839));
				return;
			}
		}
		if (Static246.anInt4542 != 10) {
			Static369.method5492(Static48.aClass33_5.method797(Static131.anInt2839) + arg1);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III[FFIIIII)V")
	public static void method6802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(5) int local5 = arg1 - arg0;
		@Pc(9) int local9 = arg7 - arg8;
		@Pc(17) int local17 = arg6 - arg2;
		@Pc(38) float local38 = (float) local9 * arg3[2] + arg3[0] * (float) local17 + (float) local5 * arg3[1];
		@Pc(59) float local59 = (float) local17 * arg3[3] + (float) local5 * arg3[4] + (float) local9 * arg3[5];
		@Pc(80) float local80 = (float) local9 * arg3[8] + arg3[6] * (float) local17 + arg3[7] * (float) local5;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local80 * local80 + local59 * local59 + local38 * local38));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg4 + 0.5F;
		@Pc(140) float local140;
		if (arg5 == 1) {
			local140 = local106;
			local106 = -local119;
			local119 = local140;
		} else if (arg5 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg5 == 3) {
			local140 = local106;
			local106 = local119;
			local119 = -local140;
		}
		Static486.aFloat159 = local119;
		Static244.aFloat89 = local106;
	}
}
