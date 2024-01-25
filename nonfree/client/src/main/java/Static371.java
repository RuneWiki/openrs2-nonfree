import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!mga", name = "f", descriptor = "I")
	public static int anInt5965;

	@OriginalMember(owner = "client!mga", name = "c", descriptor = "Lclient!ib;")
	public static final Class147 aClass147_6 = new Class147("WTRC", "office", "_rc", 1);

	@OriginalMember(owner = "client!mga", name = "e", descriptor = "Z")
	public static boolean aBoolean430 = false;

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/util/Random;II)I")
	public static int method5392(@OriginalArg(0) Random arg0, @OriginalArg(2) int arg1) {
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static129.method2437(arg1)) {
			return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
		} else {
			@Pc(45) int local45 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(48) int local48;
			do {
				local48 = arg0.nextInt();
			} while (local48 >= local45);
			return Static431.method6190(arg1, local48);
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(CBI)C")
	public static char method5393(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(Ljava/lang/String;ZZI)V")
	public static void method5395(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Static238.method4024("commands - This command");
				Static238.method4024("cls - Clear console");
				Static238.method4024("displayfps - Toggle FPS and other information");
				Static238.method4024("renderer - Print graphics renderer information");
				Static238.method4024("heap - Print java memory information");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static643.anInt10191 = 0;
				Static449.anInt7419 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				Static261.aBoolean343 = !Static261.aBoolean343;
				if (!Static261.aBoolean343) {
					Static238.method4024("FPS off");
					return;
				}
				Static238.method4024("FPS on");
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(65) Class61 local65 = Static674.aClass13_22.method8522();
				Static238.method4024("Vendor: " + local65.anInt1399);
				Static238.method4024("Name: " + local65.aString11);
				Static238.method4024("Version: " + local65.anInt1400);
				Static238.method4024("Device: " + local65.aString12);
				Static238.method4024("Driver Version: " + local65.aLong44);
				return;
			}
			if (arg0.equals("heap")) {
				Static238.method4024("Heap: " + Static387.anInt6096 + "MB");
				return;
			}
		} catch (@Pc(137) Exception local137) {
			Static238.method4024(Static601.aClass346_4.method8440(Static609.anInt9834));
			return;
		}
		if (Static487.aClass147_8 != Static202.aClass147_5 || Static24.anInt545 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static238.method4024("FPS: " + Static403.anInt6411);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static237.aBoolean328 = !Static237.aBoolean328;
					if (!Static237.aBoolean328) {
						Static238.method4024("Occlsion now off!");
						return;
					}
					Static238.method4024("Occlsion now on!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Static261.aBoolean343 = true;
					Static238.method4024("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Static261.aBoolean343 = false;
					Static238.method4024("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static238.method4024("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static241.aClass3_Sub10_1.anInt1059 + "Mb");
						return;
					} catch (@Pc(247) Throwable local247) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static476.aClass371_4.method8915();
					Static238.method4024("Text coords cleared");
					return;
				}
				@Pc(287) int local287;
				@Pc(267) int local267;
				@Pc(278) Runtime local278;
				if (arg0.equalsIgnoreCase("gc")) {
					Static181.method3234();
					for (local267 = 0; local267 < 10; local267++) {
						System.gc();
					}
					local278 = Runtime.getRuntime();
					local287 = (int) ((local278.totalMemory() - local278.freeMemory()) / 1024L);
					Static238.method4024("mem=" + local287 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("compact")) {
					Static181.method3234();
					for (local267 = 0; local267 < 10; local267++) {
						System.gc();
					}
					local278 = Runtime.getRuntime();
					local287 = (int) ((local278.totalMemory() - local278.freeMemory()) / 1024L);
					Static238.method4024("Memory before cleanup=" + local287 + "k");
					Static554.method7893();
					Static181.method3234();
					for (@Pc(344) int local344 = 0; local344 < 10; local344++) {
						System.gc();
					}
					local287 = (int) ((local278.totalMemory() - local278.freeMemory()) / 1024L);
					Static238.method4024("Memory after cleanup=" + local287 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static238.method4024(Static653.method9046() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static238.method4024("Dropped client connection");
					if (Static406.anInt6454 == 10) {
						Static663.method9152();
						return;
					}
					if (Static406.anInt6454 == 11) {
						Static286.aBoolean362 = true;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static541.aClass342_3.method8309();
					Static238.method4024("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					Static581.aClass341_4.method8299();
					Static238.method4024("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					Static581.aClass341_4.method8297();
					Static238.method4024("Dropped server js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static247.aClass291_1.method7134();
					Static559.aClass269_1.method6700();
					Static581.aClass341_4.method8291();
					Static238.method4024("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static200.method3621();
					Static649.method8991();
					Static238.method4024("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static360.aLong187 = Static524.method7320();
					Static551.aBoolean706 = true;
					Static200.method3621();
					Static649.method8991();
					Static238.method4024("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static235.method3936(-1, 1, -1, false);
					if (Static673.method9353() != 1) {
						Static238.method4024("wm1 failed");
						return;
					}
					Static238.method4024("wm1 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static235.method3936(-1, 2, -1, false);
					if (Static673.method9353() == 2) {
						Static238.method4024("wm2 succeeded");
						return;
					}
					Static238.method4024("wm2 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static235.method3936(1024, 3, 768, false);
					if (Static673.method9353() == 3) {
						Static238.method4024("wm3 succeeded");
						return;
					}
					Static238.method4024("wm3 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static382.method5480(false, 0);
					if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() == 0) {
						Static238.method4024("Entered tk0");
						Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					Static238.method4024("Failed to enter tk0");
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static382.method5480(false, 1);
					if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != 1) {
						Static238.method4024("Failed to enter tk1");
						return;
					}
					Static238.method4024("Entered tk1");
					Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
					Static441.method6272();
					Static275.aBoolean358 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static382.method5480(false, 2);
					if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != 2) {
						Static238.method4024("Failed to enter tk2");
						return;
					}
					Static238.method4024("Entered tk2");
					Static24.aClass3_Sub22_4.method2840(2, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
					Static441.method6272();
					Static275.aBoolean358 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static382.method5480(false, 3);
					if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != 3) {
						Static238.method4024("Failed to enter tk3");
						return;
					}
					Static238.method4024("Entered tk3");
					Static24.aClass3_Sub22_4.method2840(3, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
					Static441.method6272();
					Static275.aBoolean358 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static382.method5480(false, 5);
					if (Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() != 5) {
						Static238.method4024("Failed to enter tk5");
						return;
					}
					Static238.method4024("Entered tk5");
					Static24.aClass3_Sub22_4.method2840(5, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
					Static441.method6272();
					Static275.aBoolean358 = false;
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static238.method4024("Invalid buildarea value");
						return;
					}
					local267 = Static63.method1308(arg0.substring(6));
					if (local267 >= 0 && Static635.method8846(Static387.anInt6096) >= local267) {
						Static24.aClass3_Sub22_4.method2840(local267, Static24.aClass3_Sub22_4.aClass6_Sub8_1);
						Static441.method6272();
						Static275.aBoolean358 = false;
						Static238.method4024("maxbuildarea=" + Static24.aClass3_Sub22_4.aClass6_Sub8_1.method3663());
						return;
					}
					Static238.method4024("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static238.method4024("Invalid rect_debug value");
						return;
					}
					Static649.anInt10340 = Static63.method1308(arg0.substring(10).trim());
					Static238.method4024("rect_debug=" + Static649.anInt10340);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static561.aBoolean714 = true;
					Static238.method4024("qa_op_test=" + Static561.aBoolean714);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static469.aBoolean574 = !Static469.aBoolean574;
					Static238.method4024("clipcomponents=" + Static469.aBoolean574);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(871) boolean local871 = Static674.aClass13_22.method8451();
					if (Static561.method7968(!local871)) {
						if (!local871) {
							Static238.method4024("Bloom enabled");
							return;
						}
						Static238.method4024("Bloom disabled");
						return;
					}
					Static238.method4024("Failed to enable bloom");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (!Static100.aBoolean144) {
						Static100.aBoolean144 = true;
						Static238.method4024("Forced tweening ENABLED!");
						return;
					}
					Static100.aBoolean144 = false;
					Static238.method4024("Forced tweening disabled.");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (Static332.aBoolean403) {
						Static238.method4024("Shift-click disabled.");
						Static332.aBoolean403 = false;
						return;
					}
					Static238.method4024("Shift-click ENABLED!");
					Static332.aBoolean403 = true;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static238.method4024("x:" + (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 >> 9) + " z:" + (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static238.method4024("Height: " + Static121.aClass21Array2[Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174].method7973(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 >> 9, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static369.aClass15_97.method515();
					Static369.aClass15_97.method541();
					Static370.aClass377_4.method9045();
					Static84.aClass27_1.method697();
					Static649.method8991();
					Static238.method4024("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (!Static674.aClass13_22.method8497()) {
						Static238.method4024("Current toolkit doesn't support multiple cores");
						return;
					}
					local267 = Integer.parseInt(arg0.substring(3));
					if (local267 < 1) {
						local267 = 1;
					} else if (local267 > 4) {
						local267 = 4;
					}
					Static640.anInt10168 = local267;
					Static200.method3621();
					Static238.method4024("Render cores now: " + Static640.anInt10168);
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static238.method4024("I(s): " + Static300.aClass165_35.method4395() + "/" + Static300.aClass165_35.method4401());
					Static238.method4024("I(m): " + Static649.aClass165_78.method4395() + "/" + Static649.aClass165_78.method4401());
					Static238.method4024("O(s): " + Static170.aClass370_1.aClass176_1.method4543() + "/" + Static170.aClass370_1.aClass176_1.method4548());
					return;
				}
				if (arg0.equalsIgnoreCase("getcamerapos")) {
					Static238.method4024("Pos: " + Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 + "," + (Static287.anInt4910 + (Static509.anInt8222 >> 9) >> 6) + "," + (Static72.anInt1361 + (Static652.anInt10382 >> 9) >> 6) + "," + ((Static509.anInt8222 >> 9) + Static287.anInt4910 & 0x3F) + "," + ((Static652.anInt10382 >> 9) + Static72.anInt1361 & 0x3F) + " Height: " + (Static168.method3058(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174, Static509.anInt8222, Static652.anInt10382) - Static146.anInt2945));
					Static238.method4024("Look: " + Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174 + "," + (Static225.anInt4206 + Static287.anInt4910 >> 6) + "," + (Static72.anInt1361 + Static532.anInt8768 >> 6) + "," + (Static225.anInt4206 + Static287.anInt4910 & 0x3F) + "," + (Static532.anInt8768 + Static72.anInt1361 & 0x3F) + " Height: " + (Static168.method3058(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174, Static225.anInt4206, Static532.anInt8768) - Static322.anInt5378));
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static99.aBoolean771 = !Static99.aBoolean771;
					Static674.aClass13_22.method8512(Static99.aBoolean771);
					Static420.method7788();
					Static238.method4024("showprofiling=" + Static99.aBoolean771);
					return;
				}
				@Pc(1278) String[] local1278;
				@Pc(1267) int local1267;
				if (arg0.startsWith("performancetest")) {
					local267 = -1;
					local1267 = 1000;
					if (arg0.length() > 15) {
						local1278 = Static644.method8957(arg0, ' ');
						try {
							if (local1278.length > 1) {
								local1267 = Integer.parseInt(local1278[1]);
							}
						} catch (@Pc(1291) Throwable local1291) {
						}
						try {
							if (local1278.length > 2) {
								local267 = Integer.parseInt(local1278[2]);
							}
						} catch (@Pc(1302) Throwable local1302) {
						}
					}
					if (local267 == -1) {
						Static238.method4024("Java toolkit: " + Static77.method1435(local1267, 0));
						Static238.method4024("SSE toolkit:  " + Static77.method1435(local1267, 2));
						Static238.method4024("D3D toolkit:  " + Static77.method1435(local1267, 3));
						Static238.method4024("GL toolkit:   " + Static77.method1435(local1267, 1));
						Static238.method4024("GLX toolkit:  " + Static77.method1435(local1267, 5));
						return;
					}
					Static238.method4024("Performance: " + Static77.method1435(local1267, local267));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static243.aBoolean689 = !Static243.aBoolean689;
					Static238.method4024("nonpcs=" + Static243.aBoolean689);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static200.method3619();
					Static238.method4024("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local267 = Integer.parseInt(arg0.substring(12));
					Static111.method2091(Static217.method3760(local267).aString56, local267);
					Static238.method4024("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static238.method4024("w: " + Static541.aClass342_3.anInt9498);
					return;
				}
				@Pc(1455) Class3_Sub34 local1455;
				if (arg0.startsWith("pc")) {
					local1455 = Static172.method3123(Static163.aClass375_1, Static302.aClass218_74);
					local1455.aClass3_Sub25_Sub1_2.method8614(0);
					local1267 = local1455.aClass3_Sub25_Sub1_2.anInt9765;
					local287 = arg0.indexOf(" ", 4);
					local1455.aClass3_Sub25_Sub1_2.method8583(arg0.substring(3, local287));
					Static286.method4530(local1455.aClass3_Sub25_Sub1_2, arg0.substring(local287));
					local1455.aClass3_Sub25_Sub1_2.method8628(local1455.aClass3_Sub25_Sub1_2.anInt9765 - local1267);
					Static441.method6275(local1455);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static343.method5153();
					Static238.method4024("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local267 = 0; local267 < Static449.anIntArray636.length; local267++) {
						if (Static487.aBooleanArray38[local267]) {
							Static449.anIntArray636[local267] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static449.anIntArray636[local267] *= -1;
							}
						}
					}
					Static343.method5153();
					Static238.method4024("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static185.aBoolean283 = true;
					Static649.method8991();
					Static238.method4024("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static185.aBoolean283 = false;
					Static649.method8991();
					Static238.method4024("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static429.method6182();
					Static238.method4024("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static238.method4024(Static42.method1066() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local267 = Integer.parseInt(arg0.substring(17));
					Static238.method4024("varpbit=" + Static131.aClass66_1.method1629(local267));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local267 = Integer.parseInt(arg0.substring(14));
					Static238.method4024("varp=" + Static131.aClass66_1.method1630(local267));
					return;
				}
				@Pc(1659) String[] local1659;
				if (arg0.startsWith("directlogin")) {
					local1659 = Static644.method8957(arg0.substring(12), ' ');
					if (local1659.length >= 2) {
						local1267 = local1659.length <= 2 ? 0 : Integer.parseInt(local1659[2]);
						Static641.method8916(local1659[1], local1267, local1659[0]);
						return;
					}
				}
				if (arg0.startsWith("snlogin ")) {
					local1659 = Static644.method8957(arg0.substring(8), ' ');
					local1267 = Integer.parseInt(local1659[0]);
					local287 = local1659.length == 2 ? Integer.parseInt(local1659[1]) : 0;
					Static6.method145(local287, local1267);
					return;
				}
				if (arg0.startsWith("csprofileclear")) {
					Static565.method8014();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static565.method8012();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static565.method8012();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local267 = Integer.parseInt(arg0.substring(8));
					Static674.aClass13_22.method8485(local267);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static238.method4024("Active streams: " + Static313.aClass3_Sub1_Sub2_1.method932());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static602.method8444();
					Static238.method4024("Complete. Toolkit now: " + Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970());
					return;
				}
				if (arg0.equals("errormessage")) {
					Static238.method4024(Static200.aClient1.method1490());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static497.aString91.startsWith("win")) {
						Static509.method7201(new File("C:\\Temp\\heap.dump"));
					} else {
						Static509.method7201(new File("/tmp/heap.dump"));
					}
					Static238.method4024("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static238.method4024("Name: " + Static497.aString91);
					Static238.method4024("Arch: " + Static497.aString98);
					Static238.method4024("Ver: " + Static497.aString92);
					return;
				}
				if (arg0.startsWith("w2debug")) {
					local267 = Integer.parseInt(arg0.substring(8, 9));
					Static202.anInt3394 = local267;
					Static200.method3621();
					Static238.method4024("Toggled!");
					return;
				}
				if (arg0.startsWith("ortho ")) {
					local267 = arg0.indexOf(32);
					if (local267 < 0) {
						Static238.method4024("Syntax: ortho <n>");
						return;
					}
					local1267 = Static63.method1308(arg0.substring(local267 + 1));
					Static24.aClass3_Sub22_4.method2840(local1267, Static24.aClass3_Sub22_4.aClass6_Sub2_1);
					Static441.method6272();
					Static275.aBoolean358 = false;
					Static643.method8930();
					if (local1267 != Static24.aClass3_Sub22_4.aClass6_Sub2_1.method601()) {
						Static238.method4024("Failed to change ortho mode");
						return;
					}
					Static238.method4024("Successfully changed ortho mode");
					return;
				}
				if (arg0.startsWith("orthozoom ")) {
					if (Static24.aClass3_Sub22_4.aClass6_Sub2_1.method601() == 0) {
						Static238.method4024("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local267 = Static63.method1308(arg0.substring(arg0.indexOf(32) + 1));
					Static675.anInt10879 = local267;
					Static238.method4024("orthozoom=" + Static675.anInt10879);
					return;
				}
				if (arg0.startsWith("orthotilesize ")) {
					local267 = Static63.method1308(arg0.substring(arg0.indexOf(32) + 1));
					Static9.anInt99 = local267;
					Static664.anInt10594 = local267;
					Static238.method4024("ortho tile size=" + local267);
					Static643.method8930();
					return;
				}
				if (arg0.equals("orthocamlock")) {
					Static227.aBoolean318 = !Static227.aBoolean318;
					Static238.method4024("ortho camera lock is " + (Static227.aBoolean318 ? "on" : "off"));
					return;
				}
				@Pc(2033) File local2033;
				if (arg0.startsWith("setoutput ")) {
					local2033 = new File(arg0.substring(10));
					if (local2033.exists()) {
						local2033 = new File(arg0.substring(10) + "." + Static524.method7320() + ".log");
						if (local2033.exists()) {
							Static238.method4024("file already exists!");
							return;
						}
					}
					if (Static354.aFileOutputStream1 != null) {
						Static354.aFileOutputStream1.close();
						Static354.aFileOutputStream1 = null;
					}
					try {
						Static354.aFileOutputStream1 = new FileOutputStream(local2033);
						return;
					} catch (@Pc(2075) FileNotFoundException local2075) {
						Static238.method4024("Could not create " + local2033.getName());
						return;
					} catch (@Pc(2087) SecurityException local2087) {
						Static238.method4024("Cannot write to " + local2033.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Static354.aFileOutputStream1 != null) {
						Static354.aFileOutputStream1.close();
					}
					Static354.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local2033 = new File(arg0.substring(10));
					if (!local2033.exists()) {
						Static238.method4024("No such file");
						return;
					}
					@Pc(2133) byte[] local2133 = Static601.method8443(local2033);
					if (local2133 == null) {
						Static238.method4024("Failed to read file");
						return;
					}
					local1278 = Static644.method8957(Static621.method8752(Static131.method2493(local2133), ""), '\n');
					Static451.method6589(local1278);
				}
				if (arg0.startsWith("zoom ")) {
					@Pc(2164) short local2164 = (short) Static63.method1308(arg0.substring(5));
					if (local2164 > 0) {
						Static215.aShort43 = local2164;
					}
					return;
				}
				if (Static406.anInt6454 == 10) {
					local1455 = Static172.method3123(Static163.aClass375_1, Static423.aClass218_102);
					local1455.aClass3_Sub25_Sub1_2.method8614(arg0.length() + 3);
					local1455.aClass3_Sub25_Sub1_2.method8614(arg1 ? 1 : 0);
					local1455.aClass3_Sub25_Sub1_2.method8614(arg2 ? 1 : 0);
					local1455.aClass3_Sub25_Sub1_2.method8583(arg0);
					Static441.method6275(local1455);
				}
				if (arg0.startsWith("fps ") && Static202.aClass147_5 != Static487.aClass147_8) {
					Static503.method7152(Static63.method1308(arg0.substring(4)));
					return;
				}
			} catch (@Pc(2237) Exception local2237) {
				Static238.method4024(Static601.aClass346_4.method8440(Static609.anInt9834));
				return;
			}
		}
		if (Static406.anInt6454 != 10) {
			Static238.method4024(Static601.aClass346_5.method8440(Static609.anInt9834) + arg0);
		}
	}
}
