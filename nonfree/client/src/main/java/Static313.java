import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "Lclient!in;")
	public static Class157 aClass157_155;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
	public static int anInt6435;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Ljava/lang/String;ZZB)V")
	public static void method5481(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Static300.method2224("commands - This command");
				Static300.method2224("cls - Clear console");
				Static300.method2224("displayfps - Toggle FPS and other information");
				Static300.method2224("renderer - Print graphics renderer information");
				Static300.method2224("heap - Print java memory information");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static602.anInt10571 = 0;
				Static410.anInt7746 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				Static624.aBoolean742 = !Static624.aBoolean742;
				if (Static624.aBoolean742) {
					Static300.method2224("FPS on");
					return;
				}
				Static300.method2224("FPS off");
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(73) Class108 local73 = Static186.aClass20_4.method7240();
				Static300.method2224("Vendor: " + local73.anInt3959);
				Static300.method2224("Name: " + local73.aString37);
				Static300.method2224("Version: " + local73.anInt3958);
				Static300.method2224("Device: " + local73.aString38);
				Static300.method2224("Driver Version: " + local73.aLong87);
				return;
			}
			if (arg0.equals("heap")) {
				Static300.method2224("Heap: " + Static514.anInt9425 + "MB");
				return;
			}
		} catch (@Pc(145) Exception local145) {
			Static300.method2224(Static588.aClass351_4.method8691(Static476.anInt8915));
			return;
		}
		if (Static193.aClass107_2 != Static448.aClass107_7 || Static468.anInt8823 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static300.method2224("FPS: " + Static290.anInt6169);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static62.aBoolean167 = !Static62.aBoolean167;
					if (!Static62.aBoolean167) {
						Static300.method2224("Occlsion now off!");
						return;
					}
					Static300.method2224("Occlsion now on!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Static624.aBoolean742 = true;
					Static300.method2224("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Static624.aBoolean742 = false;
					Static300.method2224("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static300.method2224("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static494.aClass2_Sub16_1.anInt3436 + "Mb");
						return;
					} catch (@Pc(257) Throwable local257) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static513.aClass325_8.method8020();
					Static300.method2224("Text coords cleared");
					return;
				}
				@Pc(300) int local300;
				@Pc(281) int local281;
				@Pc(290) Runtime local290;
				if (arg0.equalsIgnoreCase("gc")) {
					Static24.method613();
					for (local281 = 0; local281 < 10; local281++) {
						System.gc();
					}
					local290 = Runtime.getRuntime();
					local300 = (int) ((local290.totalMemory() - local290.freeMemory()) / 1024L);
					Static300.method2224("mem=" + local300 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("compact")) {
					Static24.method613();
					for (local281 = 0; local281 < 10; local281++) {
						System.gc();
					}
					local290 = Runtime.getRuntime();
					local300 = (int) ((local290.totalMemory() - local290.freeMemory()) / 1024L);
					Static300.method2224("Memory before cleanup=" + local300 + "k");
					Static307.method5437();
					Static24.method613();
					for (@Pc(356) int local356 = 0; local356 < 10; local356++) {
						System.gc();
					}
					local300 = (int) ((local290.totalMemory() - local290.freeMemory()) / 1024L);
					Static300.method2224("Memory after cleanup=" + local300 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static300.method2224(Static516.method7853() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static300.method2224("Dropped client connection");
					if (Static529.anInt9623 == 10) {
						Static584.method4583();
						return;
					}
					if (Static529.anInt9623 == 11) {
						Static356.aBoolean506 = true;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static185.aClass255_2.method6754();
					Static300.method2224("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					Static142.aClass329_3.method8126();
					Static300.method2224("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					Static142.aClass329_3.method8130();
					Static300.method2224("Dropped server js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static268.aClass370_3.method9074();
					Static272.aClass116_1.method3742();
					Static142.aClass329_3.method8123();
					Static300.method2224("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static269.method4952();
					Static180.method3757();
					Static300.method2224("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static32.aLong22 = Static277.method5091();
					Static628.aBoolean745 = true;
					Static269.method4952();
					Static180.method3757();
					Static300.method2224("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static317.method5514(1, -1, false, -1);
					if (Static89.method2478() != 1) {
						Static300.method2224("wm1 failed");
						return;
					}
					Static300.method2224("wm1 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static317.method5514(2, -1, false, -1);
					if (Static89.method2478() == 2) {
						Static300.method2224("wm2 succeeded");
						return;
					}
					Static300.method2224("wm2 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static317.method5514(3, 1024, false, 768);
					if (Static89.method2478() == 3) {
						Static300.method2224("wm3 succeeded");
						return;
					}
					Static300.method2224("wm3 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static316.method5509(false, 0);
					if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() != 0) {
						Static300.method2224("Failed to enter tk0");
						return;
					}
					Static300.method2224("Entered tk0");
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, 0);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static316.method5509(false, 1);
					if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() != 1) {
						Static300.method2224("Failed to enter tk1");
						return;
					}
					Static300.method2224("Entered tk1");
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, 1);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static316.method5509(false, 2);
					if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() == 2) {
						Static300.method2224("Entered tk2");
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, 2);
						Static318.method5531();
						Static475.aBoolean694 = false;
						return;
					}
					Static300.method2224("Failed to enter tk2");
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static316.method5509(false, 3);
					if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() != 3) {
						Static300.method2224("Failed to enter tk3");
						return;
					}
					Static300.method2224("Entered tk3");
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, 3);
					Static318.method5531();
					Static475.aBoolean694 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static316.method5509(false, 5);
					if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() == 5) {
						Static300.method2224("Entered tk5");
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub5_1, 5);
						Static318.method5531();
						Static475.aBoolean694 = false;
						return;
					}
					Static300.method2224("Failed to enter tk5");
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static300.method2224("Invalid buildarea value");
						return;
					}
					local281 = Static562.method8436(arg0.substring(6));
					if (local281 >= 0 && Static124.method9248(Static514.anInt9425) >= local281) {
						Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub14_1, local281);
						Static318.method5531();
						Static475.aBoolean694 = false;
						Static300.method2224("maxbuildarea=" + Static74.aClass2_Sub13_5.aClass14_Sub14_1.method5289());
						return;
					}
					Static300.method2224("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static300.method2224("Invalid rect_debug value");
						return;
					}
					Static626.anInt1506 = Static562.method8436(arg0.substring(10).trim());
					Static300.method2224("rect_debug=" + Static626.anInt1506);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static591.aBoolean480 = true;
					Static300.method2224("qa_op_test=" + Static591.aBoolean480);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static148.aBoolean267 = !Static148.aBoolean267;
					Static300.method2224("clipcomponents=" + Static148.aBoolean267);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(885) boolean local885 = Static186.aClass20_4.method7269();
					if (!Static631.method9158(!local885)) {
						Static300.method2224("Failed to enable bloom");
						return;
					}
					if (!local885) {
						Static300.method2224("Bloom enabled");
						return;
					}
					Static300.method2224("Bloom disabled");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (!Static225.aBoolean373) {
						Static225.aBoolean373 = true;
						Static300.method2224("Forced tweening ENABLED!");
						return;
					}
					Static225.aBoolean373 = false;
					Static300.method2224("Forced tweening disabled.");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (Static362.aBoolean525) {
						Static300.method2224("Shift-click disabled.");
						Static362.aBoolean525 = false;
						return;
					}
					Static300.method2224("Shift-click ENABLED!");
					Static362.aBoolean525 = true;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static300.method2224("x:" + (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 >> 9) + " z:" + (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static300.method2224("Height: " + Static9.aClass65Array1[Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132].method7995(Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 >> 9, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static214.aClass157_106.method4559();
					Static214.aClass157_106.method4566();
					Static16.aClass237_3.method6468();
					Static361.aClass248_4.method6578();
					Static180.method3757();
					Static300.method2224("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (Static186.aClass20_4.method7311()) {
						local281 = Integer.parseInt(arg0.substring(3));
						if (local281 < 1) {
							local281 = 1;
						} else if (local281 > 4) {
							local281 = 4;
						}
						Static506.anInt9329 = local281;
						Static269.method4952();
						Static300.method2224("Render cores now: " + Static506.anInt9329);
						return;
					}
					Static300.method2224("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static300.method2224("I(s): " + Static127.aClass169_21.method5000() + "/" + Static127.aClass169_21.method4996());
					Static300.method2224("I(m): " + Static140.aClass169_24.method5000() + "/" + Static140.aClass169_24.method4996());
					Static300.method2224("O(s): " + Static635.aClass336_2.aClass268_1.method6928() + "/" + Static635.aClass336_2.aClass268_1.method6917());
					return;
				}
				if (arg0.equalsIgnoreCase("getcamerapos")) {
					Static300.method2224("Pos: " + Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 + "," + ((Static135.anInt3347 >> 9) + Static84.anInt2565 >> 6) + "," + ((Static621.anInt10870 >> 9) + Static32.anInt723 >> 6) + "," + ((Static135.anInt3347 >> 9) + Static84.anInt2565 & 0x3F) + "," + ((Static621.anInt10870 >> 9) + Static32.anInt723 & 0x3F) + " Height: " + (Static590.method8716(Static135.anInt3347, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132, Static621.anInt10870) - Static639.anInt11034));
					Static300.method2224("Look: " + Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132 + "," + (Static129.anInt3274 + Static84.anInt2565 >> 6) + "," + (Static32.anInt723 + Static596.anInt10491 >> 6) + "," + (Static129.anInt3274 + Static84.anInt2565 & 0x3F) + "," + (Static596.anInt10491 + Static32.anInt723 & 0x3F) + " Height: " + (Static590.method8716(Static129.anInt3274, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132, Static596.anInt10491) - Static369.anInt7338));
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static460.aBoolean604 = !Static460.aBoolean604;
					Static186.aClass20_4.method7250(Static460.aBoolean604);
					Static344.method5906();
					Static300.method2224("showprofiling=" + Static460.aBoolean604);
					return;
				}
				@Pc(1305) String[] local1305;
				@Pc(1296) int local1296;
				if (arg0.startsWith("performancetest")) {
					local281 = -1;
					local1296 = 1000;
					if (arg0.length() > 15) {
						local1305 = Static62.method1946(' ', arg0);
						try {
							if (local1305.length > 1) {
								local1296 = Integer.parseInt(local1305[1]);
							}
						} catch (@Pc(1316) Throwable local1316) {
						}
						try {
							if (local1305.length > 2) {
								local281 = Integer.parseInt(local1305[2]);
							}
						} catch (@Pc(1327) Throwable local1327) {
						}
					}
					if (local281 != -1) {
						Static300.method2224("Performance: " + Static436.method6915(local281, local1296));
						return;
					}
					Static300.method2224("Java toolkit: " + Static436.method6915(0, local1296));
					Static300.method2224("SSE toolkit:  " + Static436.method6915(2, local1296));
					Static300.method2224("D3D toolkit:  " + Static436.method6915(3, local1296));
					Static300.method2224("GL toolkit:   " + Static436.method6915(1, local1296));
					Static300.method2224("GLX toolkit:  " + Static436.method6915(5, local1296));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static34.aBoolean61 = !Static34.aBoolean61;
					Static300.method2224("nonpcs=" + Static34.aBoolean61);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static270.method4968();
					Static300.method2224("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local281 = Integer.parseInt(arg0.substring(12));
					Static268.method4935(Static290.method5252(local281).aString75, local281);
					Static300.method2224("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static300.method2224("w: " + Static185.aClass255_2.anInt7912);
					return;
				}
				@Pc(1486) Class2_Sub52 local1486;
				if (arg0.startsWith("pc")) {
					local1486 = Static130.method3019(Static520.aClass94_97, Static361.aClass183_1);
					local1486.aClass2_Sub11_Sub2_7.method8374(0);
					local1296 = local1486.aClass2_Sub11_Sub2_7.anInt10066;
					local300 = arg0.indexOf(" ", 4);
					local1486.aClass2_Sub11_Sub2_7.method8329(arg0.substring(3, local300));
					Static47.method1691(local1486.aClass2_Sub11_Sub2_7, arg0.substring(local300));
					local1486.aClass2_Sub11_Sub2_7.method8335(local1486.aClass2_Sub11_Sub2_7.anInt10066 - local1296);
					Static96.method2563(local1486);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static154.method6048();
					Static300.method2224("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local281 = 0; local281 < Static306.anIntArray372.length; local281++) {
						if (Static544.aBooleanArray25[local281]) {
							Static306.anIntArray372[local281] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static306.anIntArray372[local281] *= -1;
							}
						}
					}
					Static154.method6048();
					Static300.method2224("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static179.aBoolean321 = true;
					Static180.method3757();
					Static300.method2224("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static179.aBoolean321 = false;
					Static180.method3757();
					Static300.method2224("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static261.method4784();
					Static300.method2224("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static300.method2224(Static602.method8804() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local281 = Integer.parseInt(arg0.substring(17));
					Static300.method2224("varpbit=" + Static286.aClass263_3.method6853(local281));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local281 = Integer.parseInt(arg0.substring(14));
					Static300.method2224("varp=" + Static286.aClass263_3.method6852(local281));
					return;
				}
				if (arg0.startsWith("directlogin")) {
					@Pc(1700) String[] local1700 = Static62.method1946(' ', arg0.substring(12));
					if (local1700.length >= 2) {
						local1296 = local1700.length > 2 ? Integer.parseInt(local1700[2]) : 0;
						Static558.method8316(local1700[1], local1296, local1700[0]);
						return;
					}
				}
				if (arg0.startsWith("csprofileclear")) {
					Static284.method5154();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static284.method5163();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static284.method5163();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local281 = Integer.parseInt(arg0.substring(8));
					Static186.aClass20_4.method7299(local281);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static300.method2224("Active streams: " + Static614.aClass2_Sub8_Sub4_2.method7932());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static455.method5073();
					Static300.method2224("Complete. Toolkit now: " + Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945());
					return;
				}
				if (arg0.equals("errormessage")) {
					Static300.method2224(Static30.aClient1.method2211());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static623.aString117.startsWith("win")) {
						Static409.method6628(new File("C:\\Temp\\heap.dump"));
					} else {
						Static409.method6628(new File("/tmp/heap.dump"));
					}
					Static300.method2224("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static300.method2224("Name: " + Static623.aString117);
					Static300.method2224("Arch: " + Static623.aString111);
					Static300.method2224("Ver: " + Static623.aString110);
					return;
				}
				if (arg0.startsWith("w2debug")) {
					local281 = Integer.parseInt(arg0.substring(8, 9));
					Static275.anInt5875 = local281;
					Static269.method4952();
					Static300.method2224("Toggled!");
					return;
				}
				if (arg0.startsWith("ortho ")) {
					local281 = arg0.indexOf(32);
					if (local281 < 0) {
						Static300.method2224("Syntax: ortho <n>");
						return;
					}
					local1296 = Static562.method8436(arg0.substring(local281 + 1));
					Static74.aClass2_Sub13_5.method2607(Static74.aClass2_Sub13_5.aClass14_Sub11_1, local1296);
					Static318.method5531();
					Static475.aBoolean694 = false;
					Static328.method5643();
					if (Static74.aClass2_Sub13_5.aClass14_Sub11_1.method4676() != local1296) {
						Static300.method2224("Failed to change ortho mode");
						return;
					}
					Static300.method2224("Successfully changed ortho mode");
					return;
				}
				if (arg0.startsWith("orthozoom ")) {
					if (Static74.aClass2_Sub13_5.aClass14_Sub11_1.method4676() == 0) {
						Static300.method2224("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local281 = Static562.method8436(arg0.substring(arg0.indexOf(32) + 1));
					Static380.anInt7422 = local281;
					Static300.method2224("orthozoom=" + Static380.anInt7422);
					return;
				}
				if (arg0.startsWith("orthotilesize ")) {
					local281 = Static562.method8436(arg0.substring(arg0.indexOf(32) + 1));
					Static246.anInt5330 = local281;
					Static310.anInt6428 = local281;
					Static300.method2224("ortho tile size=" + local281);
					Static328.method5643();
					return;
				}
				if (arg0.equals("orthocamlock")) {
					Static183.aBoolean325 = !Static183.aBoolean325;
					Static300.method2224("ortho camera lock is " + (Static183.aBoolean325 ? "on" : "off"));
					return;
				}
				@Pc(2049) File local2049;
				if (arg0.startsWith("setoutput ")) {
					local2049 = new File(arg0.substring(10));
					if (local2049.exists()) {
						local2049 = new File(arg0.substring(10) + "." + Static277.method5091() + ".log");
						if (local2049.exists()) {
							Static300.method2224("file already exists!");
							return;
						}
					}
					if (Static107.aFileOutputStream3 != null) {
						Static107.aFileOutputStream3.close();
						Static107.aFileOutputStream3 = null;
					}
					try {
						Static107.aFileOutputStream3 = new FileOutputStream(local2049);
						return;
					} catch (@Pc(2091) FileNotFoundException local2091) {
						Static300.method2224("Could not create " + local2049.getName());
						return;
					} catch (@Pc(2103) SecurityException local2103) {
						Static300.method2224("Cannot write to " + local2049.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Static107.aFileOutputStream3 != null) {
						Static107.aFileOutputStream3.close();
					}
					Static107.aFileOutputStream3 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local2049 = new File(arg0.substring(10));
					if (!local2049.exists()) {
						Static300.method2224("No such file");
						return;
					}
					@Pc(2151) byte[] local2151 = Static90.method2492(local2049);
					if (local2151 == null) {
						Static300.method2224("Failed to read file");
						return;
					}
					local1305 = Static62.method1946('\n', Static570.method8510(Static543.method8144(local2151), ""));
					Static374.method6269(local1305);
				}
				if (arg0.startsWith("zoom ")) {
					@Pc(2182) short local2182 = (short) Static562.method8436(arg0.substring(5));
					if (local2182 > 0) {
						Static80.aShort10 = local2182;
					}
					return;
				}
				if (Static529.anInt9623 == 10) {
					local1486 = Static130.method3019(Static200.aClass94_41, Static361.aClass183_1);
					local1486.aClass2_Sub11_Sub2_7.method8374(arg0.length() + 3);
					local1486.aClass2_Sub11_Sub2_7.method8374(arg1 ? 1 : 0);
					local1486.aClass2_Sub11_Sub2_7.method8374(arg2 ? 1 : 0);
					local1486.aClass2_Sub11_Sub2_7.method8329(arg0);
					Static96.method2563(local1486);
				}
				if (arg0.startsWith("fps ") && Static193.aClass107_2 != Static448.aClass107_7) {
					Static619.method9026(Static562.method8436(arg0.substring(4)));
					return;
				}
			} catch (@Pc(2251) Exception local2251) {
				Static300.method2224(Static588.aClass351_4.method8691(Static476.anInt8915));
				return;
			}
		}
		if (Static529.anInt9623 != 10) {
			Static300.method2224(Static588.aClass351_5.method8691(Static476.anInt8915) + arg0);
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)Lclient!qfa;")
	public static Class3_Sub1_Sub5 method5482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class100 local7 = Static395.aClass100ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub1_Sub5_1;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BJ)V")
	public static void method5483(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static173.anInt4166;
		@Pc(18) int local18;
		@Pc(26) int local26;
		if (Static21.anInt398 != local7) {
			local18 = local7 - Static21.anInt398;
			local26 = (int) ((long) local18 * arg0 / 320L);
			if (local18 <= 0) {
				if (local26 == 0) {
					local26 = -1;
				} else if (local18 > local26) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = 1;
			} else if (local26 > local18) {
				local26 = local18;
			}
			Static21.anInt398 += local26;
		}
		@Pc(72) int local72 = Static176.anInt4216;
		Static305.aFloat154 += Static351.aFloat157 * (float) arg0 / 40.0F * 8.0F;
		Static72.aFloat68 += Static485.aFloat196 * (float) arg0 / 40.0F * 8.0F;
		if (Static468.anInt8821 != local72) {
			local18 = local72 - Static468.anInt8821;
			local26 = (int) (arg0 * (long) local18 / 320L);
			if (local18 <= 0) {
				if (local26 == 0) {
					local26 = -1;
				} else if (local26 < local18) {
					local26 = local18;
				}
			} else if (local26 == 0) {
				local26 = 1;
			} else if (local18 < local26) {
				local26 = local18;
			}
			Static468.anInt8821 += local26;
		}
		Static182.method3782();
	}
}
