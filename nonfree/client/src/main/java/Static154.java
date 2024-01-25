import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "[J")
	public static final long[] aLongArray8 = new long[32];

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	public static int anInt3391 = 0;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "[I")
	public static int[] anIntArray164 = new int[1];

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZLjava/lang/String;I)V")
	public static void method3163(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static455.method7295("commands - This command");
				Static455.method7295("cls - Clear console");
				Static455.method7295("displayfps - Toggle FPS and other information");
				Static455.method7295("renderer - Print graphics renderer information");
				Static455.method7295("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static211.anInt4367 = 0;
				Static491.anInt8810 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static586.aBoolean742 = !Static586.aBoolean742;
				if (!Static586.aBoolean742) {
					Static455.method7295("FPS off");
					return;
				}
				Static455.method7295("FPS on");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(65) Class99 local65 = Static607.aClass101_15.method8090();
				Static455.method7295("Vendor: " + local65.anInt2735);
				Static455.method7295("Name: " + local65.aString34);
				Static455.method7295("Version: " + local65.anInt2734);
				Static455.method7295("Device: " + local65.aString35);
				Static455.method7295("Driver Version: " + local65.aLong83);
				return;
			}
			if (arg2.equals("heap")) {
				Static455.method7295("Heap: " + Static65.anInt1229 + "MB");
				return;
			}
		} catch (@Pc(133) Exception local133) {
			Static455.method7295(Static205.aClass134_2.method3906(Static204.anInt8130));
			return;
		}
		if (Static235.aClass37_5 != Static314.aClass37_6 || Static31.anInt530 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static455.method7295("FPS: " + Static645.anInt10074);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static351.aBoolean516 = !Static351.aBoolean516;
					if (!Static351.aBoolean516) {
						Static455.method7295("Occlsion now off!");
						return;
					}
					Static455.method7295("Occlsion now on!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static586.aBoolean742 = true;
					Static455.method7295("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static586.aBoolean742 = false;
					Static455.method7295("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static455.method7295("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static466.aClass2_Sub55_1.anInt11444 + "Mb");
						return;
					} catch (@Pc(243) Throwable local243) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static183.aClass60_5.method1548();
					Static455.method7295("Text coords cleared");
					return;
				}
				@Pc(284) int local284;
				@Pc(263) int local263;
				@Pc(274) Runtime local274;
				if (arg2.equalsIgnoreCase("gc")) {
					Static312.method5100();
					for (local263 = 0; local263 < 10; local263++) {
						System.gc();
					}
					local274 = Runtime.getRuntime();
					local284 = (int) ((local274.totalMemory() - local274.freeMemory()) / 1024L);
					Static455.method7295("mem=" + local284 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("compact")) {
					Static312.method5100();
					for (local263 = 0; local263 < 10; local263++) {
						System.gc();
					}
					local274 = Runtime.getRuntime();
					local284 = (int) ((local274.totalMemory() - local274.freeMemory()) / 1024L);
					Static455.method7295("Memory before cleanup=" + local284 + "k");
					Static437.method7115();
					Static312.method5100();
					for (@Pc(341) int local341 = 0; local341 < 10; local341++) {
						System.gc();
					}
					local284 = (int) ((local274.totalMemory() - local274.freeMemory()) / 1024L);
					Static455.method7295("Memory after cleanup=" + local284 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static455.method7295(Static212.method4018() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static455.method7295("Dropped client connection");
					if (Static579.anInt10049 == 10) {
						Static175.method3431();
					} else if (Static579.anInt10049 == 11) {
						Static597.aBoolean749 = true;
						return;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static524.aClass66_4.method1681();
					Static455.method7295("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static396.aClass206_1.method5424();
					Static455.method7295("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static396.aClass206_1.method5414();
					Static455.method7295("Dropped server js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static96.aClass48_5.method1310();
					Static395.aClass207_2.method5435();
					Static396.aClass206_1.method5426();
					Static455.method7295("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static150.method2593();
					Static218.method4047();
					Static455.method7295("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static31.aLong18 = Static99.method1701();
					Static376.aBoolean539 = true;
					Static150.method2593();
					Static218.method4047();
					Static455.method7295("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static347.method6004(-1, 1, -1, false);
					if (Static255.method4444() != 1) {
						Static455.method7295("wm1 failed");
						return;
					}
					Static455.method7295("wm1 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static347.method6004(-1, 2, -1, false);
					if (Static255.method4444() != 2) {
						Static455.method7295("wm2 failed");
						return;
					}
					Static455.method7295("wm2 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static347.method6004(1024, 3, 768, false);
					if (Static255.method4444() != 3) {
						Static455.method7295("wm3 failed");
						return;
					}
					Static455.method7295("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static389.method6560(false, 0);
					if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() != 0) {
						Static455.method7295("Failed to enter tk0");
						return;
					}
					Static455.method7295("Entered tk0");
					Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, 0);
					Static482.method7663();
					Static388.aBoolean551 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static389.method6560(false, 1);
					if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() == 1) {
						Static455.method7295("Entered tk1");
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, 1);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					Static455.method7295("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static389.method6560(false, 2);
					if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() == 2) {
						Static455.method7295("Entered tk2");
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, 2);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					Static455.method7295("Failed to enter tk2");
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static389.method6560(false, 3);
					if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() != 3) {
						Static455.method7295("Failed to enter tk3");
						return;
					}
					Static455.method7295("Entered tk3");
					Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, 3);
					Static482.method7663();
					Static388.aBoolean551 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static389.method6560(false, 5);
					if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() == 5) {
						Static455.method7295("Entered tk5");
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_1, 5);
						Static482.method7663();
						Static388.aBoolean551 = false;
						return;
					}
					Static455.method7295("Failed to enter tk5");
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static455.method7295("Invalid buildarea value");
						return;
					}
					local263 = Static77.method1385(arg2.substring(6));
					if (local263 >= 0 && local263 <= Static348.method6014(Static65.anInt1229)) {
						Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub25_1, local263);
						Static482.method7663();
						Static388.aBoolean551 = false;
						Static455.method7295("maxbuildarea=" + Static230.aClass2_Sub54_15.aClass4_Sub25_1.method8512());
						return;
					}
					Static455.method7295("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static455.method7295("Invalid rect_debug value");
						return;
					}
					Static286.anInt5256 = Static77.method1385(arg2.substring(10).trim());
					Static455.method7295("rect_debug=" + Static286.anInt5256);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static214.aBoolean351 = true;
					Static455.method7295("qa_op_test=" + Static214.aBoolean351);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static372.aBoolean537 = !Static372.aBoolean537;
					Static455.method7295("clipcomponents=" + Static372.aBoolean537);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(862) boolean local862 = Static607.aClass101_15.method8101();
					if (!Static640.method9474(!local862)) {
						Static455.method7295("Failed to enable bloom");
						return;
					}
					if (!local862) {
						Static455.method7295("Bloom enabled");
						return;
					}
					Static455.method7295("Bloom disabled");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static135.aBoolean192) {
						Static135.aBoolean192 = false;
						Static455.method7295("Forced tweening disabled.");
						return;
					}
					Static135.aBoolean192 = true;
					Static455.method7295("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (!Static400.aBoolean557) {
						Static455.method7295("Shift-click ENABLED!");
						Static400.aBoolean557 = true;
						return;
					}
					Static455.method7295("Shift-click disabled.");
					Static400.aBoolean557 = false;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static455.method7295("x:" + (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 >> 9) + " z:" + (Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static455.method7295("Height: " + Static245.aClass18Array14[Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142].method8537(Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024 >> 9, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static409.aClass124_84.method3621();
					Static409.aClass124_84.method3614();
					Static157.aClass353_1.method8903();
					Static350.aClass5_3.method99();
					Static218.method4047();
					Static455.method7295("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (!Static607.aClass101_15.method8114()) {
						Static455.method7295("Current toolkit doesn't support multiple cores");
						return;
					}
					local263 = Integer.parseInt(arg2.substring(3));
					if (local263 < 1) {
						local263 = 1;
					} else if (local263 > 4) {
						local263 = 4;
					}
					Static589.anInt10284 = local263;
					Static150.method2593();
					Static455.method7295("Render cores now: " + Static589.anInt10284);
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static455.method7295("I(s): " + Static118.aClass22_10.method472() + "/" + Static118.aClass22_10.method469());
					Static455.method7295("I(m): " + Static207.aClass22_18.method472() + "/" + Static207.aClass22_18.method469());
					Static455.method7295("O(s): " + Static372.aClass343_1.aClass379_1.method9484() + "/" + Static372.aClass343_1.aClass379_1.method9494());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static455.method7295("Pos: " + Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 + "," + ((Static108.anInt1987 >> 9) + Static640.anInt11085 >> 6) + "," + ((Static598.anInt10387 >> 9) + Static490.anInt8763 >> 6) + "," + ((Static108.anInt1987 >> 9) + Static640.anInt11085 & 0x3F) + "," + (Static490.anInt8763 + (Static598.anInt10387 >> 9) & 0x3F) + " Height: " + (Static10.method154(Static598.anInt10387, Static108.anInt1987, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142) - Static229.anInt4615));
					Static455.method7295("Look: " + Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142 + "," + (Static640.anInt11085 + Static483.anInt8676 >> 6) + "," + (Static490.anInt8763 + Static46.anInt958 >> 6) + "," + (Static640.anInt11085 + Static483.anInt8676 & 0x3F) + "," + (Static46.anInt958 + Static490.anInt8763 & 0x3F) + " Height: " + (Static10.method154(Static46.anInt958, Static483.anInt8676, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142) - Static4.anInt75));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static130.aBoolean189 = !Static130.aBoolean189;
					Static607.aClass101_15.method8093(Static130.aBoolean189);
					Static34.method583();
					Static455.method7295("showprofiling=" + Static130.aBoolean189);
					return;
				}
				@Pc(1267) String[] local1267;
				@Pc(1258) int local1258;
				if (arg2.startsWith("performancetest")) {
					local263 = -1;
					local1258 = 1000;
					if (arg2.length() > 15) {
						local1267 = Static184.method3569(' ', arg2);
						try {
							if (local1267.length > 1) {
								local1258 = Integer.parseInt(local1267[1]);
							}
						} catch (@Pc(1280) Throwable local1280) {
						}
						try {
							if (local1267.length > 2) {
								local263 = Integer.parseInt(local1267[2]);
							}
						} catch (@Pc(1293) Throwable local1293) {
						}
					}
					if (local263 != -1) {
						Static455.method7295("Performance: " + Static457.method7338(local1258, local263));
						return;
					}
					Static455.method7295("Java toolkit: " + Static457.method7338(local1258, 0));
					Static455.method7295("SSE toolkit:  " + Static457.method7338(local1258, 2));
					Static455.method7295("D3D toolkit:  " + Static457.method7338(local1258, 3));
					Static455.method7295("GL toolkit:   " + Static457.method7338(local1258, 1));
					Static455.method7295("GLX toolkit:  " + Static457.method7338(local1258, 5));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static127.aBoolean182 = !Static127.aBoolean182;
					Static455.method7295("nonpcs=" + Static127.aBoolean182);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static634.method9354();
					Static455.method7295("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local263 = Integer.parseInt(arg2.substring(12));
					Static163.method3291(local263, Static69.method1289(local263).aString85);
					Static455.method7295("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static455.method7295("w: " + Static524.aClass66_4.anInt1756);
					return;
				}
				@Pc(1450) Class2_Sub52 local1450;
				if (arg2.startsWith("pc")) {
					local1450 = Static311.method5098(Static350.aClass341_67, Static125.aClass179_1);
					local1450.aClass2_Sub8_Sub2_2.method5170(0);
					local1258 = local1450.aClass2_Sub8_Sub2_2.anInt5725;
					local284 = arg2.indexOf(" ", 4);
					local1450.aClass2_Sub8_Sub2_2.method5212(arg2.substring(3, local284));
					Static628.method9328(arg2.substring(local284), local1450.aClass2_Sub8_Sub2_2);
					local1450.aClass2_Sub8_Sub2_2.method5217(local1450.aClass2_Sub8_Sub2_2.anInt5725 - local1258);
					Static38.method791(local1450);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static394.method7234();
					Static455.method7295("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local263 = 0; local263 < Static100.anIntArray75.length; local263++) {
						if (Static546.aBooleanArray56[local263]) {
							Static100.anIntArray75[local263] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static100.anIntArray75[local263] *= -1;
							}
						}
					}
					Static394.method7234();
					Static455.method7295("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static30.aBoolean28 = true;
					Static218.method4047();
					Static455.method7295("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static30.aBoolean28 = false;
					Static218.method4047();
					Static455.method7295("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static58.method1113();
					Static455.method7295("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static455.method7295(Static607.method9111() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local263 = Integer.parseInt(arg2.substring(17));
					Static455.method7295("varpbit=" + Static113.aClass282_1.method7360(local263));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local263 = Integer.parseInt(arg2.substring(14));
					Static455.method7295("varp=" + Static113.aClass282_1.method7361(local263));
					return;
				}
				if (arg2.startsWith("directlogin")) {
					@Pc(1658) String[] local1658 = Static184.method3569(' ', arg2.substring(12));
					if (local1658.length >= 2) {
						local1258 = local1658.length > 2 ? Integer.parseInt(local1658[2]) : 0;
						Static62.method1156(local1258, local1658[1], local1658[0]);
						return;
					}
				}
				if (arg2.startsWith("csprofileclear")) {
					Static518.method8022();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static518.method8020();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static518.method8020();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local263 = Integer.parseInt(arg2.substring(8));
					Static607.aClass101_15.method8122(local263);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static455.method7295("Active streams: " + Static270.aClass2_Sub26_Sub4_2.method7394());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static615.method9216();
					Static455.method7295("Complete. Toolkit now: " + Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static455.method7295(Static493.aClient1.method1463());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static72.aString13.startsWith("win")) {
						Static17.method7639(new File("C:\\Temp\\heap.dump"));
					} else {
						Static17.method7639(new File("/tmp/heap.dump"));
					}
					Static455.method7295("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static455.method7295("Name: " + Static72.aString13);
					Static455.method7295("Arch: " + Static72.aString16);
					Static455.method7295("Ver: " + Static72.aString17);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local263 = Integer.parseInt(arg2.substring(8, 9));
					Static204.anInt8127 = local263;
					Static150.method2593();
					Static455.method7295("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local263 = arg2.indexOf(32);
					if (local263 < 0) {
						Static455.method7295("Syntax: ortho <n>");
						return;
					}
					local1258 = Static77.method1385(arg2.substring(local263 + 1));
					Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub6_1, local1258);
					Static482.method7663();
					Static388.aBoolean551 = false;
					Static654.method9605();
					if (Static230.aClass2_Sub54_15.aClass4_Sub6_1.method1092() == local1258) {
						Static455.method7295("Successfully changed ortho mode");
						return;
					}
					Static455.method7295("Failed to change ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static230.aClass2_Sub54_15.aClass4_Sub6_1.method1092() == 0) {
						Static455.method7295("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local263 = Static77.method1385(arg2.substring(arg2.indexOf(32) + 1));
					Static165.anInt3548 = local263;
					Static455.method7295("orthozoom=" + Static165.anInt3548);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local263 = Static77.method1385(arg2.substring(arg2.indexOf(32) + 1));
					Static423.anInt7782 = local263;
					Static306.anInt5542 = local263;
					Static455.method7295("ortho tile size=" + local263);
					Static654.method9605();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static353.aBoolean517 = !Static353.aBoolean517;
					Static455.method7295("ortho camera lock is " + (Static353.aBoolean517 ? "on" : "off"));
					return;
				}
				@Pc(1999) File local1999;
				if (arg2.startsWith("setoutput ")) {
					local1999 = new File(arg2.substring(10));
					if (local1999.exists()) {
						local1999 = new File(arg2.substring(10) + "." + Static99.method1701() + ".log");
						if (local1999.exists()) {
							Static455.method7295("file already exists!");
							return;
						}
					}
					if (Static587.aFileOutputStream1 != null) {
						Static587.aFileOutputStream1.close();
						Static587.aFileOutputStream1 = null;
					}
					try {
						Static587.aFileOutputStream1 = new FileOutputStream(local1999);
						return;
					} catch (@Pc(2041) FileNotFoundException local2041) {
						Static455.method7295("Could not create " + local1999.getName());
						return;
					} catch (@Pc(2053) SecurityException local2053) {
						Static455.method7295("Cannot write to " + local1999.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static587.aFileOutputStream1 != null) {
						Static587.aFileOutputStream1.close();
					}
					Static587.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local1999 = new File(arg2.substring(10));
					if (!local1999.exists()) {
						Static455.method7295("No such file");
						return;
					}
					@Pc(2097) byte[] local2097 = Static79.method1394(local1999);
					if (local2097 == null) {
						Static455.method7295("Failed to read file");
						return;
					}
					local1267 = Static184.method3569('\n', Static20.method382(Static412.method6769(local2097), ""));
					Static517.method8016(local1267);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2128) short local2128 = (short) Static77.method1385(arg2.substring(5));
					if (local2128 > 0) {
						Static187.aShort43 = local2128;
					}
					return;
				}
				if (Static579.anInt10049 == 10) {
					local1450 = Static311.method5098(Static589.aClass341_99, Static125.aClass179_1);
					local1450.aClass2_Sub8_Sub2_2.method5170(arg2.length() + 3);
					local1450.aClass2_Sub8_Sub2_2.method5170(arg0 ? 1 : 0);
					local1450.aClass2_Sub8_Sub2_2.method5170(arg1 ? 1 : 0);
					local1450.aClass2_Sub8_Sub2_2.method5212(arg2);
					Static38.method791(local1450);
				}
				if (arg2.startsWith("fps ") && Static235.aClass37_5 != Static314.aClass37_6) {
					Static651.method9222(Static77.method1385(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2201) Exception local2201) {
				Static455.method7295(Static205.aClass134_2.method3906(Static204.anInt8130));
				return;
			}
		}
		if (Static579.anInt10049 != 10) {
			Static455.method7295(Static205.aClass134_3.method3906(Static204.anInt8130) + arg2);
		}
	}
}
