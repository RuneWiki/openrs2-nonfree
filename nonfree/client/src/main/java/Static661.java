import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static661 {

	@OriginalMember(owner = "client!wea", name = "g", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_269 = new Class381(0, 3);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
	public static int anInt10753 = 0;

	@OriginalMember(owner = "client!wea", name = "f", descriptor = "[I")
	public static final int[] anIntArray615 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZIII)I")
	public static int method9075(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(IZZLjava/lang/String;)V")
	public static void method9076(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		try {
			if (arg2.equalsIgnoreCase("commands") || arg2.equalsIgnoreCase("help")) {
				Static239.method3794("commands - This command");
				Static239.method3794("cls - Clear console");
				Static239.method3794("displayfps - Toggle FPS and other information");
				Static239.method3794("renderer - Print graphics renderer information");
				Static239.method3794("heap - Print java memory information");
				return;
			}
			if (arg2.equalsIgnoreCase("cls")) {
				Static165.anInt3245 = 0;
				Static356.anInt5849 = 0;
				return;
			}
			if (arg2.equalsIgnoreCase("displayfps")) {
				Static480.aBoolean521 = !Static480.aBoolean521;
				if (!Static480.aBoolean521) {
					Static239.method3794("FPS off");
					return;
				}
				Static239.method3794("FPS on");
				return;
			}
			if (arg2.equals("renderer")) {
				@Pc(100) Class385 local100 = Static273.aClass100_6.method8602();
				Static239.method3794("Vendor: " + local100.anInt10668);
				Static239.method3794("Name: " + local100.aString118);
				Static239.method3794("Version: " + local100.anInt10669);
				Static239.method3794("Device: " + local100.aString119);
				Static239.method3794("Driver Version: " + local100.aLong301);
				return;
			}
			if (arg2.equals("heap")) {
				Static239.method3794("Heap: " + Static21.anInt299 + "MB");
				return;
			}
		} catch (@Pc(185) Exception local185) {
			Static239.method3794(Static184.aClass131_4.method3168(Static375.anInt7800));
			return;
		}
		if (Static670.aClass242_7 != Static387.aClass242_8 || Static296.anInt5190 >= 2) {
			if (arg2.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg2.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg2.equalsIgnoreCase("printfps")) {
					Static239.method3794("FPS: " + Static69.anInt1172);
					return;
				}
				if (arg2.equalsIgnoreCase("occlude")) {
					Static429.aBoolean478 = !Static429.aBoolean478;
					if (!Static429.aBoolean478) {
						Static239.method3794("Occlsion now off!");
						return;
					}
					Static239.method3794("Occlsion now on!");
					return;
				}
				if (arg2.equalsIgnoreCase("fpson")) {
					Static480.aBoolean521 = true;
					Static239.method3794("fps debug enabled");
					return;
				}
				if (arg2.equalsIgnoreCase("fpsoff")) {
					Static480.aBoolean521 = false;
					Static239.method3794("fps debug disabled");
					return;
				}
				if (arg2.equals("systemmem")) {
					try {
						Static239.method3794("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static506.aClass5_Sub32_2.anInt5619 + "Mb");
						return;
					} catch (@Pc(338) Throwable local338) {
						return;
					}
				}
				if (arg2.equalsIgnoreCase("cleartext")) {
					Static151.aClass387_2.method9014();
					Static239.method3794("Text coords cleared");
					return;
				}
				@Pc(386) int local386;
				@Pc(365) int local365;
				@Pc(376) Runtime local376;
				if (arg2.equalsIgnoreCase("gc")) {
					Static270.method4447();
					for (local365 = 0; local365 < 10; local365++) {
						System.gc();
					}
					local376 = Runtime.getRuntime();
					local386 = (int) ((local376.totalMemory() - local376.freeMemory()) / 1024L);
					Static239.method3794("mem=" + local386 + "k");
					return;
				}
				@Pc(455) int local455;
				if (arg2.equalsIgnoreCase("compact")) {
					Static270.method4447();
					for (local365 = 0; local365 < 10; local365++) {
						System.gc();
					}
					local376 = Runtime.getRuntime();
					local386 = (int) ((local376.totalMemory() - local376.freeMemory()) / 1024L);
					Static239.method3794("Memory before cleanup=" + local386 + "k");
					Static222.method3531();
					Static270.method4447();
					for (local455 = 0; local455 < 10; local455++) {
						System.gc();
					}
					local386 = (int) ((local376.totalMemory() - local376.freeMemory()) / 1024L);
					Static239.method3794("Memory after cleanup=" + local386 + "k");
					return;
				}
				if (arg2.equalsIgnoreCase("unloadnatives")) {
					Static239.method3794(Static73.method1223() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg2.equalsIgnoreCase("clientdrop")) {
					Static239.method3794("Dropped client connection");
					if (Static652.anInt10664 == 11) {
						Static613.method8423();
					} else if (Static652.anInt10664 == 12) {
						Static4.aClass389_17.aBoolean759 = true;
						return;
					}
					return;
				}
				if (arg2.equalsIgnoreCase("rotateconnectmethods")) {
					Static68.aClass258_6.method5843();
					Static239.method3794("Rotated connection methods");
					return;
				}
				if (arg2.equalsIgnoreCase("clientjs5drop")) {
					Static93.aClass241_1.method5538();
					Static239.method3794("Dropped client js5 net queue");
					return;
				}
				if (arg2.equalsIgnoreCase("serverjs5drop")) {
					Static93.aClass241_1.method5542();
					Static239.method3794("Dropped server js5 net queue");
					return;
				}
				@Pc(612) int local612;
				if (arg2.equalsIgnoreCase("breakcon")) {
					Static681.aClass349_6.method7745();
					@Pc(610) Class389[] local610 = Static4.aClass389Array8;
					for (local612 = 0; local612 < local610.length; local612++) {
						@Pc(618) Class389 local618 = local610[local612];
						if (local618.aClass50_2 != null) {
							local618.aClass50_2.method6171();
						}
					}
					Static93.aClass241_1.method5533();
					Static239.method3794("Breaking new connections for 5 seconds");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuild")) {
					Static627.method8561();
					Static124.method1849();
					Static239.method3794("Rebuilding map");
					return;
				}
				if (arg2.equalsIgnoreCase("rebuildprofile")) {
					Static67.aLong45 = Static480.method6763();
					Static144.aBoolean214 = true;
					Static627.method8561();
					Static124.method1849();
					Static239.method3794("Rebuilding map (with profiling)");
					return;
				}
				if (arg2.equalsIgnoreCase("wm1")) {
					Static471.method6672(1, -1, -1, false);
					if (Static260.method4249() != 1) {
						Static239.method3794("wm1 failed");
						return;
					}
					Static239.method3794("wm1 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm2")) {
					Static471.method6672(2, -1, -1, false);
					if (Static260.method4249() != 2) {
						Static239.method3794("wm2 failed");
						return;
					}
					Static239.method3794("wm2 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("wm3")) {
					Static471.method6672(3, 768, 1024, false);
					if (Static260.method4249() != 3) {
						Static239.method3794("wm3 failed");
						return;
					}
					Static239.method3794("wm3 succeeded");
					return;
				}
				if (arg2.equalsIgnoreCase("tk0")) {
					Static462.method6506(false, 0);
					if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 0) {
						Static239.method3794("Entered tk0");
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, 0);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					Static239.method3794("Failed to enter tk0");
					return;
				}
				if (arg2.equalsIgnoreCase("tk1")) {
					Static462.method6506(false, 1);
					if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 1) {
						Static239.method3794("Entered tk1");
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, 1);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					Static239.method3794("Failed to enter tk1");
					return;
				}
				if (arg2.equalsIgnoreCase("tk2")) {
					Static462.method6506(false, 2);
					if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 2) {
						Static239.method3794("Entered tk2");
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, 2);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					Static239.method3794("Failed to enter tk2");
					return;
				}
				if (arg2.equalsIgnoreCase("tk3")) {
					Static462.method6506(false, 3);
					if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 3) {
						Static239.method3794("Entered tk3");
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, 3);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					Static239.method3794("Failed to enter tk3");
					return;
				}
				if (arg2.equalsIgnoreCase("tk5")) {
					Static462.method6506(false, 5);
					if (Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 5) {
						Static239.method3794("Entered tk5");
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub24_1, 5);
						Static111.method1655();
						Static386.aBoolean427 = false;
						return;
					}
					Static239.method3794("Failed to enter tk5");
					return;
				}
				if (arg2.startsWith("setba")) {
					if (arg2.length() < 6) {
						Static239.method3794("Invalid buildarea value");
						return;
					}
					local365 = Static407.method5956(arg2.substring(6));
					if (local365 >= 0 && local365 <= Static286.method8842(Static21.anInt299)) {
						Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub20_1, local365);
						Static111.method1655();
						Static386.aBoolean427 = false;
						Static239.method3794("maxbuildarea=" + Static577.aClass5_Sub19_25.aClass17_Sub20_1.method6783());
						return;
					}
					Static239.method3794("Invalid buildarea value");
					return;
				}
				if (arg2.startsWith("rect_debug")) {
					if (arg2.length() < 10) {
						Static239.method3794("Invalid rect_debug value");
						return;
					}
					Static151.anInt2970 = Static407.method5956(arg2.substring(10).trim());
					Static239.method3794("rect_debug=" + Static151.anInt2970);
					return;
				}
				if (arg2.equalsIgnoreCase("qa_op_test")) {
					Static628.aBoolean710 = true;
					Static239.method3794("qa_op_test=" + Static628.aBoolean710);
					return;
				}
				if (arg2.equalsIgnoreCase("clipcomponents")) {
					Static606.aBoolean685 = !Static606.aBoolean685;
					Static239.method3794("clipcomponents=" + Static606.aBoolean685);
					return;
				}
				if (arg2.startsWith("bloom")) {
					@Pc(1162) boolean local1162 = Static273.aClass100_6.method8656();
					if (Static293.method6183(!local1162)) {
						if (local1162) {
							Static239.method3794("Bloom disabled");
							return;
						}
						Static239.method3794("Bloom enabled");
						return;
					}
					Static239.method3794("Failed to enable bloom");
					return;
				}
				if (arg2.equalsIgnoreCase("tween")) {
					if (Static54.aBoolean77) {
						Static54.aBoolean77 = false;
						Static239.method3794("Forced tweening disabled.");
						return;
					}
					Static54.aBoolean77 = true;
					Static239.method3794("Forced tweening ENABLED!");
					return;
				}
				if (arg2.equalsIgnoreCase("shiftclick")) {
					if (Static468.aBoolean513) {
						Static239.method3794("Shift-click disabled.");
						Static468.aBoolean513 = false;
						return;
					}
					Static239.method3794("Shift-click ENABLED!");
					Static468.aBoolean513 = true;
					return;
				}
				if (arg2.equalsIgnoreCase("getcgcoord")) {
					Static239.method3794("x:" + (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 >> 9) + " z:" + (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("getheight")) {
					Static239.method3794("Height: " + Static177.aClass84Array2[Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139].method7620(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 >> 9, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 >> 9));
					return;
				}
				if (arg2.equalsIgnoreCase("resetminimap")) {
					Static27.aClass126_18.method3093();
					Static27.aClass126_18.method3090();
					Static201.aClass97_3.method1931();
					Static583.aClass327_4.method7412();
					Static124.method1849();
					Static239.method3794("Minimap reset");
					return;
				}
				if (arg2.startsWith("mc")) {
					if (Static273.aClass100_6.method8611()) {
						local365 = Integer.parseInt(arg2.substring(3));
						if (local365 < 1) {
							local365 = 1;
						} else if (local365 > 4) {
							local365 = 4;
						}
						Static184.anInt3434 = local365;
						Static627.method8561();
						Static239.method3794("Render cores now: " + Static184.anInt3434);
						return;
					}
					Static239.method3794("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg2.startsWith("cachespace")) {
					Static239.method3794("I(s): " + Static543.aClass168_79.method3855() + "/" + Static543.aClass168_79.method3854());
					Static239.method3794("I(m): " + Static481.aClass168_67.method3855() + "/" + Static481.aClass168_67.method3854());
					Static239.method3794("O(s): " + Static82.aClass134_1.aClass90_1.method1659() + "/" + Static82.aClass134_1.aClass90_1.method1663());
					return;
				}
				if (arg2.equalsIgnoreCase("getcamerapos")) {
					Static239.method3794("Pos: " + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 + "," + (Static315.anInt5380 + (Static141.anInt2764 >> 9) >> 6) + "," + (Static290.anInt5128 + (Static282.anInt5025 >> 9) >> 6) + "," + ((Static141.anInt2764 >> 9) + Static315.anInt5380 & 0x3F) + "," + ((Static282.anInt5025 >> 9) + Static290.anInt5128 & 0x3F) + " Height: " + (Static461.method6500(Static141.anInt2764, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139, Static282.anInt5025) - Static42.anInt703));
					Static239.method3794("Look: " + Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139 + "," + (Static315.anInt5380 + Static282.anInt5028 >> 6) + "," + (Static290.anInt5128 + Static578.anInt9023 >> 6) + "," + (Static315.anInt5380 + Static282.anInt5028 & 0x3F) + "," + (Static290.anInt5128 + Static578.anInt9023 & 0x3F) + " Height: " + (Static461.method6500(Static282.anInt5028, Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139, Static578.anInt9023) - Static469.anInt7626));
					return;
				}
				if (arg2.equals("renderprofile") || arg2.equals("rp")) {
					Static428.aBoolean477 = !Static428.aBoolean477;
					Static273.aClass100_6.method8599(Static428.aBoolean477);
					Static651.method8994();
					Static239.method3794("showprofiling=" + Static428.aBoolean477);
					return;
				}
				@Pc(1656) String[] local1656;
				if (arg2.startsWith("performancetest")) {
					local365 = -1;
					local612 = 1000;
					if (arg2.length() > 15) {
						local1656 = Static350.method5156(' ', arg2);
						try {
							if (local1656.length > 1) {
								local612 = Integer.parseInt(local1656[1]);
							}
						} catch (@Pc(1669) Throwable local1669) {
						}
						try {
							if (local1656.length > 2) {
								local365 = Integer.parseInt(local1656[2]);
							}
						} catch (@Pc(1682) Throwable local1682) {
						}
					}
					if (local365 != -1) {
						Static239.method3794("Performance: " + Static621.method3253(local612, local365));
						return;
					}
					Static239.method3794("Java toolkit: " + Static621.method3253(local612, 0));
					Static239.method3794("SSE toolkit:  " + Static621.method3253(local612, 2));
					Static239.method3794("D3D toolkit:  " + Static621.method3253(local612, 3));
					Static239.method3794("GL toolkit:   " + Static621.method3253(local612, 1));
					Static239.method3794("GLX toolkit:  " + Static621.method3253(local612, 5));
					return;
				}
				if (arg2.equals("nonpcs")) {
					Static561.aBoolean583 = !Static561.aBoolean583;
					Static239.method3794("nonpcs=" + Static561.aBoolean583);
					return;
				}
				if (arg2.equals("autoworld")) {
					Static510.method7022();
					Static239.method3794("auto world selected");
					return;
				}
				if (arg2.startsWith("switchworld")) {
					local365 = Integer.parseInt(arg2.substring(12));
					Static660.method9072(Static8.method137(local365).aString37, local365);
					Static239.method3794("switched");
					return;
				}
				if (arg2.equals("getworld")) {
					Static239.method3794("w: " + Static68.aClass258_6.anInt6748);
					return;
				}
				if (arg2.startsWith("pc")) {
					@Pc(1872) Class389 local1872 = Static120.method1769(false);
					@Pc(1878) Class5_Sub41 local1878 = Static647.method8905(Static228.aClass381_101, local1872.aClass393_2);
					local1878.aClass5_Sub36_Sub2_1.method7324(0);
					local386 = local1878.aClass5_Sub36_Sub2_1.anInt8456;
					local455 = arg2.indexOf(" ", 4);
					local1878.aClass5_Sub36_Sub2_1.method7327(arg2.substring(3, local455));
					Static253.method4125(arg2.substring(local455), local1878.aClass5_Sub36_Sub2_1);
					local1878.aClass5_Sub36_Sub2_1.method7314(local1878.aClass5_Sub36_Sub2_1.anInt8456 - local386);
					local1872.method9079(local1878);
					return;
				}
				if (arg2.equals("savevarcs")) {
					Static66.method1106();
					Static239.method3794("perm varcs saved");
					return;
				}
				if (arg2.equals("scramblevarcs")) {
					for (local365 = 0; local365 < Static123.anIntArray120.length; local365++) {
						if (Static624.aBooleanArray27[local365]) {
							Static123.anIntArray120[local365] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static123.anIntArray120[local365] *= -1;
							}
						}
					}
					Static66.method1106();
					Static239.method3794("perm varcs scrambled");
					return;
				}
				if (arg2.equals("showcolmap")) {
					Static449.aBoolean497 = true;
					Static124.method1849();
					Static239.method3794("colmap is shown");
					return;
				}
				if (arg2.equals("hidecolmap")) {
					Static449.aBoolean497 = false;
					Static124.method1849();
					Static239.method3794("colmap is hidden");
					return;
				}
				if (arg2.equals("resetcache")) {
					Static109.method8573();
					Static239.method3794("Caches reset");
					return;
				}
				if (arg2.equals("profilecpu")) {
					Static239.method3794(Static475.method8942() + "ms");
					return;
				}
				if (arg2.startsWith("getclientvarpbit")) {
					local365 = Integer.parseInt(arg2.substring(17));
					Static239.method3794("varpbit=" + Static23.aClass247_1.method5699(local365));
					return;
				}
				if (arg2.startsWith("getclientvarp")) {
					local365 = Integer.parseInt(arg2.substring(14));
					Static239.method3794("varp=" + Static23.aClass247_1.method5700(local365));
					return;
				}
				@Pc(2137) String[] local2137;
				if (arg2.startsWith("directlogin")) {
					local2137 = Static350.method5156(' ', arg2.substring(12));
					if (local2137.length >= 2) {
						local612 = local2137.length > 2 ? Integer.parseInt(local2137[2]) : 0;
						Static114.method1692(local612, local2137[1], local2137[0]);
						return;
					}
				}
				if (arg2.startsWith("snlogin ")) {
					local2137 = Static350.method5156(' ', arg2.substring(8));
					local612 = Integer.parseInt(local2137[0]);
					local386 = local2137.length == 2 ? Integer.parseInt(local2137[1]) : 0;
					Static157.method2870(local386, local612);
					return;
				}
				if (arg2.startsWith("csprofileclear")) {
					Static247.method3955();
					return;
				}
				if (arg2.startsWith("csprofileoutputc")) {
					Static247.method3959();
					return;
				}
				if (arg2.startsWith("csprofileoutputt")) {
					Static247.method3959();
					return;
				}
				if (arg2.startsWith("texsize")) {
					local365 = Integer.parseInt(arg2.substring(8));
					Static273.aClass100_6.method8598(local365);
					return;
				}
				if (arg2.equals("soundstreamcount")) {
					Static239.method3794("Active streams: " + Static265.aClass5_Sub4_Sub1_2.method335());
					return;
				}
				if (arg2.equals("autosetup")) {
					Static347.method5135();
					Static239.method3794("Complete. Toolkit now: " + Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102());
					return;
				}
				if (arg2.equals("errormessage")) {
					Static239.method3794(Static189.aClient1.method1191());
					return;
				}
				if (arg2.equals("heapdump")) {
					if (Static576.aString103.startsWith("win")) {
						Static225.method3572(new File("C:\\Temp\\heap.dump"));
					} else {
						Static225.method3572(new File("/tmp/heap.dump"));
					}
					Static239.method3794("Done");
					return;
				}
				if (arg2.equals("os")) {
					Static239.method3794("Name: " + Static576.aString103);
					Static239.method3794("Arch: " + Static576.aString109);
					Static239.method3794("Ver: " + Static576.aString104);
					return;
				}
				if (arg2.startsWith("w2debug")) {
					local365 = Integer.parseInt(arg2.substring(8, 9));
					Static383.anInt6452 = local365;
					Static627.method8561();
					Static239.method3794("Toggled!");
					return;
				}
				if (arg2.startsWith("ortho ")) {
					local365 = arg2.indexOf(32);
					if (local365 < 0) {
						Static239.method3794("Syntax: ortho <n>");
						return;
					}
					local612 = Static407.method5956(arg2.substring(local365 + 1));
					Static577.aClass5_Sub19_25.method2550(Static577.aClass5_Sub19_25.aClass17_Sub18_1, local612);
					Static111.method1655();
					Static386.aBoolean427 = false;
					Static644.method8892();
					if (local612 == Static577.aClass5_Sub19_25.aClass17_Sub18_1.method6359()) {
						Static239.method3794("Successfully changed ortho mode");
						return;
					}
					Static239.method3794("Failed to change ortho mode");
					return;
				}
				if (arg2.startsWith("orthozoom ")) {
					if (Static577.aClass5_Sub19_25.aClass17_Sub18_1.method6359() == 0) {
						Static239.method3794("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local365 = Static407.method5956(arg2.substring(arg2.indexOf(32) + 1));
					Static216.anInt1166 = local365;
					Static239.method3794("orthozoom=" + Static216.anInt1166);
					return;
				}
				if (arg2.startsWith("orthotilesize ")) {
					local365 = Static407.method5956(arg2.substring(arg2.indexOf(32) + 1));
					Static619.anInt9987 = local365;
					Static13.anInt162 = local365;
					Static239.method3794("ortho tile size=" + local365);
					Static644.method8892();
					return;
				}
				if (arg2.equals("orthocamlock")) {
					Static657.aBoolean757 = !Static657.aBoolean757;
					Static239.method3794("ortho camera lock is " + (Static657.aBoolean757 ? "on" : "off"));
					return;
				}
				@Pc(2605) File local2605;
				if (arg2.startsWith("setoutput ")) {
					local2605 = new File(arg2.substring(10));
					if (local2605.exists()) {
						local2605 = new File(arg2.substring(10) + "." + Static480.method6763() + ".log");
						if (local2605.exists()) {
							Static239.method3794("file already exists!");
							return;
						}
					}
					if (Static373.aFileOutputStream1 != null) {
						Static373.aFileOutputStream1.close();
						Static373.aFileOutputStream1 = null;
					}
					try {
						Static373.aFileOutputStream1 = new FileOutputStream(local2605);
						return;
					} catch (@Pc(2654) FileNotFoundException local2654) {
						Static239.method3794("Could not create " + local2605.getName());
						return;
					} catch (@Pc(2668) SecurityException local2668) {
						Static239.method3794("Cannot write to " + local2605.getName());
						return;
					}
				}
				if (arg2.equals("closeoutput")) {
					if (Static373.aFileOutputStream1 != null) {
						Static373.aFileOutputStream1.close();
					}
					Static373.aFileOutputStream1 = null;
					return;
				}
				if (arg2.startsWith("runscript ")) {
					local2605 = new File(arg2.substring(10));
					if (!local2605.exists()) {
						Static239.method3794("No such file");
						return;
					}
					@Pc(2725) byte[] local2725 = Static165.method3007(local2605);
					if (local2725 == null) {
						Static239.method3794("Failed to read file");
						return;
					}
					local1656 = Static350.method5156('\n', Static550.method4226("", Static179.method3126(local2725)));
					Static584.method8038(local1656);
				}
				if (arg2.startsWith("zoom ")) {
					@Pc(2763) short local2763 = (short) Static407.method5956(arg2.substring(5));
					if (local2763 > 0) {
						Static523.aShort98 = local2763;
					}
					return;
				}
				if (arg2.startsWith("cs2debug")) {
					if (arg2.length() > 9 && arg2.charAt(8) == ' ') {
						Static247.aString40 = arg2.substring(9);
						Static247.aBoolean282 = true;
						Static239.method3794("cs2debug: (" + Static247.aString40 + ")");
						return;
					}
					Static247.aString40 = null;
					Static247.aBoolean282 = !Static247.aBoolean282;
					Static239.method3794("cs2debug:" + Static247.aBoolean282);
					return;
				}
				if (Static652.anInt10664 == 11) {
					@Pc(2848) Class5_Sub41 local2848 = Static647.method8905(Static184.aClass381_81, Static4.aClass389_17.aClass393_2);
					local2848.aClass5_Sub36_Sub2_1.method7324(arg2.length() + 3);
					local2848.aClass5_Sub36_Sub2_1.method7324(arg0 ? 1 : 0);
					local2848.aClass5_Sub36_Sub2_1.method7324(arg1 ? 1 : 0);
					local2848.aClass5_Sub36_Sub2_1.method7327(arg2);
					Static4.aClass389_17.method9079(local2848);
				}
				if (arg2.startsWith("fps ") && Static387.aClass242_8 != Static670.aClass242_7) {
					Static660.method9068(Static407.method5956(arg2.substring(4)));
					return;
				}
			} catch (@Pc(2910) Exception local2910) {
				Static239.method3794(Static184.aClass131_4.method3168(Static375.anInt7800));
				return;
			}
		}
		if (Static652.anInt10664 != 11) {
			Static239.method3794(Static184.aClass131_5.method3168(Static375.anInt7800) + arg2);
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V")
	public static void method9080() {
		Static462.method6510();
		Static377.aBoolean419 = false;
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "()V")
	public static void method9082() {
		Static671.method9116(Static237.anInt4100);
	}
}
