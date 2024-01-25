import jagex3.jagmisc.jagmisc;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIII)V")
	public static void method696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static525.method8003(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg2;
		@Pc(24) int local24 = -arg2;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(56) int local56;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(81) int local81;
		if (Static326.anInt6028 <= arg0 && Static80.anInt1738 >= arg0) {
			@Pc(45) int[] local45 = Static582.anIntArrayArray69[arg0];
			local56 = Static489.method6853(arg1 - arg2, Static553.anInt9074, Static249.anInt4668);
			local64 = Static489.method6853(arg2 + arg1, Static553.anInt9074, Static249.anInt4668);
			local73 = Static489.method6853(arg1 - local15, Static553.anInt9074, Static249.anInt4668);
			local81 = Static489.method6853(local15 + arg1, Static553.anInt9074, Static249.anInt4668);
			Static276.method3099(local56, local45, arg3, local73);
			Static276.method3099(local73, local45, arg5, local81);
			Static276.method3099(local81, local45, arg3, local64);
		}
		@Pc(101) int local101 = -1;
		while (local21 > local10) {
			local31 += 2;
			local101 += 2;
			local24 += local31;
			local29 += local101;
			if (local29 >= 0 && local26 >= 1) {
				local26--;
				local29 -= local26 << 1;
				Static53.anIntArray65[local26] = local10;
			}
			local10++;
			@Pc(246) int local246;
			@Pc(255) int local255;
			@Pc(266) int[] local266;
			@Pc(147) int local147;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				local147 = arg0 - local21;
				local56 = arg0 + local21;
				if (Static326.anInt6028 <= local56 && Static80.anInt1738 >= local147) {
					if (local15 <= local21) {
						local64 = Static489.method6853(local10 + arg1, Static553.anInt9074, Static249.anInt4668);
						local73 = Static489.method6853(arg1 - local10, Static553.anInt9074, Static249.anInt4668);
						if (Static80.anInt1738 >= local56) {
							Static276.method3099(local73, Static582.anIntArrayArray69[local56], arg3, local64);
						}
						if (local147 >= Static326.anInt6028) {
							Static276.method3099(local73, Static582.anIntArrayArray69[local147], arg3, local64);
						}
					} else {
						local64 = Static53.anIntArray65[local21];
						local73 = Static489.method6853(local10 + arg1, Static553.anInt9074, Static249.anInt4668);
						local81 = Static489.method6853(arg1 - local10, Static553.anInt9074, Static249.anInt4668);
						local246 = Static489.method6853(local64 + arg1, Static553.anInt9074, Static249.anInt4668);
						local255 = Static489.method6853(arg1 - local64, Static553.anInt9074, Static249.anInt4668);
						if (Static80.anInt1738 >= local56) {
							local266 = Static582.anIntArrayArray69[local56];
							Static276.method3099(local81, local266, arg3, local255);
							Static276.method3099(local255, local266, arg5, local246);
							Static276.method3099(local246, local266, arg3, local73);
						}
						if (local147 >= Static326.anInt6028) {
							local266 = Static582.anIntArrayArray69[local147];
							Static276.method3099(local81, local266, arg3, local255);
							Static276.method3099(local255, local266, arg5, local246);
							Static276.method3099(local246, local266, arg3, local73);
						}
					}
				}
			}
			local147 = arg0 - local10;
			local56 = arg0 + local10;
			if (local56 >= Static326.anInt6028 && Static80.anInt1738 >= local147) {
				local64 = local21 + arg1;
				local73 = arg1 - local21;
				if (Static553.anInt9074 <= local64 && local73 <= Static249.anInt4668) {
					local64 = Static489.method6853(local64, Static553.anInt9074, Static249.anInt4668);
					local73 = Static489.method6853(local73, Static553.anInt9074, Static249.anInt4668);
					if (local10 >= local15) {
						if (local56 <= Static80.anInt1738) {
							Static276.method3099(local73, Static582.anIntArrayArray69[local56], arg3, local64);
						}
						if (Static326.anInt6028 <= local147) {
							Static276.method3099(local73, Static582.anIntArrayArray69[local147], arg3, local64);
						}
					} else {
						local81 = local10 > local26 ? Static53.anIntArray65[local10] : local26;
						local246 = Static489.method6853(local81 + arg1, Static553.anInt9074, Static249.anInt4668);
						local255 = Static489.method6853(arg1 - local81, Static553.anInt9074, Static249.anInt4668);
						if (local56 <= Static80.anInt1738) {
							local266 = Static582.anIntArrayArray69[local56];
							Static276.method3099(local73, local266, arg3, local255);
							Static276.method3099(local255, local266, arg5, local246);
							Static276.method3099(local246, local266, arg3, local64);
						}
						if (Static326.anInt6028 <= local147) {
							local266 = Static582.anIntArrayArray69[local147];
							Static276.method3099(local73, local266, arg3, local255);
							Static276.method3099(local255, local266, arg5, local246);
							Static276.method3099(local246, local266, arg3, local64);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZLjava/lang/String;Z)V")
	public static void method697(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1.equalsIgnoreCase("commands") || arg1.equalsIgnoreCase("help")) {
				Static212.method3438("commands - This command");
				Static212.method3438("cls - Clear console");
				Static212.method3438("displayfps - Toggle FPS and other information");
				Static212.method3438("renderer - Print graphics renderer information");
				Static212.method3438("heap - Print java memory information");
				return;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static70.anInt1594 = 0;
				Static583.anInt9519 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("displayfps")) {
				Static489.aBoolean647 = !Static489.aBoolean647;
				if (Static489.aBoolean647) {
					Static212.method3438("FPS on");
					return;
				}
				Static212.method3438("FPS off");
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(74) Class237 local74 = Static307.aClass100_6.method6247();
				Static212.method3438("Vendor: " + local74.anInt6600);
				Static212.method3438("Name: " + local74.aString58);
				Static212.method3438("Version: " + local74.anInt6599);
				Static212.method3438("Device: " + local74.aString59);
				Static212.method3438("Driver Version: " + local74.aLong182);
				return;
			}
			if (arg1.equals("heap")) {
				Static212.method3438("Heap: " + Static440.anInt7756 + "MB");
				return;
			}
		} catch (@Pc(146) Exception local146) {
			Static212.method3438(Static290.aClass198_4.method4365(Static52.anInt1264));
			return;
		}
		if (Static207.aClass258_3 != Static375.aClass258_6 || Static210.anInt4045 >= 2) {
			if (arg1.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg1.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg1.equalsIgnoreCase("printfps")) {
					Static212.method3438("FPS: " + Static156.anInt8495);
					return;
				}
				if (arg1.equalsIgnoreCase("occlude")) {
					Static225.aBoolean343 = !Static225.aBoolean343;
					if (Static225.aBoolean343) {
						Static212.method3438("Occlsion now on!");
						return;
					}
					Static212.method3438("Occlsion now off!");
					return;
				}
				if (arg1.equalsIgnoreCase("fpson")) {
					Static489.aBoolean647 = true;
					Static212.method3438("fps debug enabled");
					return;
				}
				if (arg1.equalsIgnoreCase("fpsoff")) {
					Static489.aBoolean647 = false;
					Static212.method3438("fps debug disabled");
					return;
				}
				if (arg1.equals("systemmem")) {
					try {
						Static212.method3438("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
						return;
					} catch (@Pc(261) Throwable local261) {
						return;
					}
				}
				if (arg1.equalsIgnoreCase("cleartext")) {
					Static181.aClass109_5.method2311();
					Static212.method3438("Text coords cleared");
					return;
				}
				@Pc(304) int local304;
				@Pc(285) int local285;
				@Pc(294) Runtime local294;
				if (arg1.equalsIgnoreCase("gc")) {
					Static141.method2402();
					for (local285 = 0; local285 < 10; local285++) {
						System.gc();
					}
					local294 = Runtime.getRuntime();
					local304 = (int) ((local294.totalMemory() - local294.freeMemory()) / 1024L);
					Static212.method3438("mem=" + local304 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("compact")) {
					Static141.method2402();
					for (local285 = 0; local285 < 10; local285++) {
						System.gc();
					}
					local294 = Runtime.getRuntime();
					local304 = (int) ((local294.totalMemory() - local294.freeMemory()) / 1024L);
					Static212.method3438("Memory before cleanup=" + local304 + "k");
					Static192.method3653();
					Static141.method2402();
					for (@Pc(361) int local361 = 0; local361 < 10; local361++) {
						System.gc();
					}
					local304 = (int) ((local294.totalMemory() - local294.freeMemory()) / 1024L);
					Static212.method3438("Memory after cleanup=" + local304 + "k");
					return;
				}
				if (arg1.equalsIgnoreCase("unloadnatives")) {
					Static212.method3438(Static472.method6650() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg1.equalsIgnoreCase("clientdrop")) {
					Static212.method3438("Dropped client connection");
					if (Static201.anInt3963 == 10) {
						Static530.method7282();
						return;
					}
					if (Static201.anInt3963 == 11) {
						Static68.aBoolean123 = true;
					}
					return;
				}
				if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
					Static176.aClass170_3.method3783();
					Static212.method3438("Rotated connection methods");
					return;
				}
				if (arg1.equalsIgnoreCase("clientjs5drop")) {
					Static42.aClass327_1.method7224();
					Static212.method3438("Dropped client js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("serverjs5drop")) {
					Static42.aClass327_1.method7225();
					Static212.method3438("Dropped server js5 net queue");
					return;
				}
				if (arg1.equalsIgnoreCase("breakcon")) {
					Static356.aClass287_5.method6534();
					Static57.aClass116_1.method2477();
					Static42.aClass327_1.method7233();
					Static212.method3438("Breaking new connections for 5 seconds");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuild")) {
					Static265.method4069();
					Static361.method6164();
					Static212.method3438("Rebuilding map");
					return;
				}
				if (arg1.equalsIgnoreCase("rebuildprofile")) {
					Static155.aLong172 = Static548.method7437();
					Static99.aBoolean182 = true;
					Static265.method4069();
					Static361.method6164();
					Static212.method3438("Rebuilding map (with profiling)");
					return;
				}
				if (arg1.equalsIgnoreCase("wm1")) {
					Static273.method4136(false, -1, -1, 1);
					if (Static212.method3434() != 1) {
						Static212.method3438("wm1 failed");
						return;
					}
					Static212.method3438("wm1 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("wm2")) {
					Static273.method4136(false, -1, -1, 2);
					if (Static212.method3434() != 2) {
						Static212.method3438("wm2 failed");
						return;
					}
					Static212.method3438("wm2 succeeded");
					return;
				}
				if (arg1.equalsIgnoreCase("wm3")) {
					Static273.method4136(false, 1024, 768, 3);
					if (Static212.method3434() == 3) {
						Static212.method3438("wm3 succeeded");
						return;
					}
					Static212.method3438("wm3 failed");
					return;
				}
				if (arg1.equalsIgnoreCase("tk0")) {
					Static547.method5859(0);
					if (Static391.anInt6846 == 0) {
						Static212.method3438("Entered tk0");
						Static72.aClass2_Sub12_Sub1_1.anInt1917 = 0;
						Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
						Static335.aBoolean491 = false;
						return;
					}
					Static212.method3438("Failed to enter tk0");
					return;
				}
				if (arg1.equalsIgnoreCase("tk1")) {
					Static547.method5859(1);
					if (Static391.anInt6846 == 1) {
						Static212.method3438("Entered tk1");
						Static72.aClass2_Sub12_Sub1_1.anInt1917 = 1;
						Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
						Static335.aBoolean491 = false;
						return;
					}
					Static212.method3438("Failed to enter tk1");
					return;
				}
				if (arg1.equalsIgnoreCase("tk2")) {
					Static547.method5859(2);
					if (Static391.anInt6846 == 2) {
						Static212.method3438("Entered tk2");
						Static72.aClass2_Sub12_Sub1_1.anInt1917 = 2;
						Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
						Static335.aBoolean491 = false;
						return;
					}
					Static212.method3438("Failed to enter tk2");
					return;
				}
				if (arg1.equalsIgnoreCase("tk3")) {
					Static547.method5859(3);
					if (Static391.anInt6846 != 3) {
						Static212.method3438("Failed to enter tk3");
						return;
					}
					Static212.method3438("Entered tk3");
					Static72.aClass2_Sub12_Sub1_1.anInt1917 = 3;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("tk5")) {
					Static547.method5859(5);
					if (Static391.anInt6846 != 5) {
						Static212.method3438("Failed to enter tk5");
						return;
					}
					Static212.method3438("Entered tk5");
					Static72.aClass2_Sub12_Sub1_1.anInt1917 = 5;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					return;
				}
				if (arg1.equalsIgnoreCase("ot")) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean159 = !Static72.aClass2_Sub12_Sub1_1.aBoolean159;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					Static265.method4069();
					Static212.method3438("ot=" + Static72.aClass2_Sub12_Sub1_1.aBoolean159);
					return;
				}
				if (arg1.equalsIgnoreCase("gb")) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean164 = !Static72.aClass2_Sub12_Sub1_1.aBoolean164;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					Static265.method4069();
					Static212.method3438("gb=" + Static72.aClass2_Sub12_Sub1_1.aBoolean164);
					return;
				}
				@Pc(825) int local825;
				if (arg1.startsWith("shadows")) {
					if (arg1.length() < 8) {
						Static212.method3438("Invalid shadows value");
						return;
					}
					@Pc(813) String local813 = arg1.substring(8);
					local825 = Static271.method4107(local813) ? Static158.method2594(local813) : -1;
					if (local825 >= 0 && local825 <= 2) {
						Static72.aClass2_Sub12_Sub1_1.method1407(local825, Static391.anInt6846);
						Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
						Static335.aBoolean491 = false;
						Static265.method4069();
						Static212.method3438("shadows=" + local825);
						return;
					}
					Static212.method3438("Invalid shadows value");
					return;
				}
				if (arg1.startsWith("textures")) {
					Static72.aClass2_Sub12_Sub1_1.aBoolean150 = !Static72.aClass2_Sub12_Sub1_1.aBoolean150;
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					Static29.method539();
					Static265.method4069();
					Static212.method3438("textures=" + Static72.aClass2_Sub12_Sub1_1.aBoolean150);
					return;
				}
				if (arg1.startsWith("lighting")) {
					Static72.aClass2_Sub12_Sub1_1.method1412(!Static72.aClass2_Sub12_Sub1_1.method1408(Static391.anInt6846), Static391.anInt6846);
					Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
					Static335.aBoolean491 = false;
					Static6.method168();
					Static29.method539();
					Static265.method4069();
					Static212.method3438("lighting=" + Static72.aClass2_Sub12_Sub1_1.method1408(Static391.anInt6846));
					return;
				}
				if (arg1.startsWith("setba")) {
					if (arg1.length() < 6) {
						Static212.method3438("Invalid buildarea value");
						return;
					}
					local285 = Static158.method2594(arg1.substring(6));
					if (local285 >= 0 && Static158.method2595(Static440.anInt7756) >= local285) {
						Static72.aClass2_Sub12_Sub1_1.anInt1904 = local285;
						Static72.aClass2_Sub12_Sub1_1.method1425(Static356.aClass287_5);
						Static335.aBoolean491 = false;
						Static212.method3438("maxbuildarea=" + Static72.aClass2_Sub12_Sub1_1.anInt1904);
						return;
					}
					Static212.method3438("Invalid buildarea value");
					return;
				}
				if (arg1.startsWith("rect_debug")) {
					if (arg1.length() < 10) {
						Static212.method3438("Invalid rect_debug value");
						return;
					}
					Static318.anInt5934 = Static158.method2594(arg1.substring(10).trim());
					Static212.method3438("rect_debug=" + Static318.anInt5934);
					return;
				}
				if (arg1.equalsIgnoreCase("qa_op_test")) {
					Static298.aBoolean425 = true;
					Static212.method3438("qa_op_test=" + Static298.aBoolean425);
					return;
				}
				if (arg1.equalsIgnoreCase("clipcomponents")) {
					Static250.aBoolean380 = !Static250.aBoolean380;
					Static212.method3438("clipcomponents=" + Static250.aBoolean380);
					return;
				}
				if (arg1.startsWith("bloom")) {
					@Pc(1068) boolean local1068 = Static307.aClass100_6.method6248();
					if (Static224.method3515(!local1068)) {
						if (!local1068) {
							Static212.method3438("Bloom enabled");
							return;
						}
						Static212.method3438("Bloom disabled");
						return;
					}
					Static212.method3438("Failed to enable bloom");
					return;
				}
				if (arg1.equalsIgnoreCase("tween")) {
					if (Static564.aBoolean711) {
						Static564.aBoolean711 = false;
						Static212.method3438("Forced tweening disabled.");
						return;
					}
					Static564.aBoolean711 = true;
					Static212.method3438("Forced tweening ENABLED!");
					return;
				}
				if (arg1.equalsIgnoreCase("shiftclick")) {
					if (Static561.aBoolean709) {
						Static212.method3438("Shift-click disabled.");
						Static561.aBoolean709 = false;
						return;
					}
					Static212.method3438("Shift-click ENABLED!");
					Static561.aBoolean709 = true;
					return;
				}
				if (arg1.equalsIgnoreCase("getcgcoord")) {
					Static212.method3438("x:" + (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 >> 9) + " z:" + (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("getheight")) {
					Static212.method3438("Height: " + Static421.aClass67Array7[Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112].method6707(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764 >> 9, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761 >> 9));
					return;
				}
				if (arg1.equalsIgnoreCase("resetminimap")) {
					Static490.aClass259_153.method5981();
					Static490.aClass259_153.method5975();
					Static165.aClass306_3.method6829();
					Static205.aClass25_3.method440();
					Static361.method6164();
					Static212.method3438("Minimap reset");
					return;
				}
				if (arg1.startsWith("mc")) {
					if (Static307.aClass100_6.method6196()) {
						local285 = Integer.parseInt(arg1.substring(3));
						if (local285 < 1) {
							local285 = 1;
						} else if (local285 > 4) {
							local285 = 4;
						}
						Static164.anInt3483 = local285;
						Static265.method4069();
						Static212.method3438("Render cores now: " + Static164.anInt3483);
						return;
					}
					Static212.method3438("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg1.startsWith("cachespace")) {
					Static212.method3438("I(s): " + Static493.aClass313_53.method6984() + "/" + Static493.aClass313_53.method6979());
					Static212.method3438("I(m): " + Static167.aClass313_21.method6984() + "/" + Static167.aClass313_21.method6979());
					Static212.method3438("O(s): " + Static296.aClass218_1.aClass3_1.method24() + "/" + Static296.aClass218_1.aClass3_1.method21());
					return;
				}
				if (arg1.equalsIgnoreCase("getcamerapos")) {
					Static212.method3438("Pos: " + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 + "," + (Static35.anInt906 + (Static90.anInt1932 >> 9) >> 6) + "," + ((Static7.anInt337 >> 9) + Static130.anInt5246 >> 6) + "," + ((Static90.anInt1932 >> 9) + Static35.anInt906 & 0x3F) + "," + (Static130.anInt5246 + (Static7.anInt337 >> 9) & 0x3F) + " Height: " + (Static524.method7217(Static90.anInt1932, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112, Static7.anInt337) - Static548.anInt8906));
					Static212.method3438("Look: " + Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 + "," + (Static35.anInt906 + Static285.anInt6373 >> 6) + "," + (Static330.anInt6084 + Static130.anInt5246 >> 6) + "," + (Static35.anInt906 + Static285.anInt6373 & 0x3F) + "," + (Static330.anInt6084 + Static130.anInt5246 & 0x3F) + " Height: " + (Static524.method7217(Static285.anInt6373, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112, Static330.anInt6084) - Static412.anInt568));
					return;
				}
				if (arg1.equals("renderprofile") || arg1.equals("rp")) {
					Static208.aBoolean326 = !Static208.aBoolean326;
					Static307.aClass100_6.method6199(Static208.aBoolean326);
					Static84.method1348();
					Static212.method3438("showprofiling=" + Static208.aBoolean326);
					return;
				}
				if (arg1.startsWith("performancetest")) {
					local285 = -1;
					local825 = 1000;
					if (arg1.length() > 15) {
						@Pc(1485) String[] local1485 = Static568.method7710(arg1, ' ');
						try {
							if (local1485.length > 1) {
								local825 = Integer.parseInt(local1485[1]);
							}
						} catch (@Pc(1496) Throwable local1496) {
						}
						try {
							if (local1485.length > 2) {
								local285 = Integer.parseInt(local1485[2]);
							}
						} catch (@Pc(1507) Throwable local1507) {
						}
					}
					if (local285 != -1) {
						Static212.method3438("Performance: " + Static551.method7486(Static391.anInt6846, local825));
						return;
					}
					Static212.method3438("Java toolkit: " + Static551.method7486(0, local825));
					Static212.method3438("SSE toolkit:  " + Static551.method7486(2, local825));
					Static212.method3438("D3D toolkit:  " + Static551.method7486(3, local825));
					Static212.method3438("GL toolkit:   " + Static551.method7486(1, local825));
					Static212.method3438("GLX toolkit:  " + Static551.method7486(5, local825));
					return;
				}
				if (arg1.equals("nonpcs")) {
					Static440.aBoolean612 = !Static440.aBoolean612;
					Static212.method3438("nonpcs=" + Static440.aBoolean612);
					return;
				}
				if (arg1.equals("autoworld")) {
					Static556.method7587();
					Static212.method3438("auto world selected");
					return;
				}
				if (arg1.startsWith("switchworld")) {
					local285 = Integer.parseInt(arg1.substring(12));
					Static114.method1694(local285, Static271.method4110(local285).aString33);
					Static212.method3438("switched");
					return;
				}
				if (arg1.equals("getworld")) {
					Static212.method3438("w: " + Static176.aClass170_3.anInt4548);
					return;
				}
				@Pc(1666) Class2_Sub42 local1666;
				if (arg1.startsWith("pc")) {
					local1666 = Static249.method3910(Static317.aClass286_103, Static400.aClass145_2);
					local1666.aClass2_Sub15_Sub2_2.method4333(0);
					local825 = local1666.aClass2_Sub15_Sub2_2.anInt5241;
					local304 = arg1.indexOf(" ", 4);
					local1666.aClass2_Sub15_Sub2_2.method4313(arg1.substring(3, local304));
					Static276.method3095(arg1.substring(local304), local1666.aClass2_Sub15_Sub2_2);
					local1666.aClass2_Sub15_Sub2_2.method4311(local1666.aClass2_Sub15_Sub2_2.anInt5241 - local825);
					Static531.method7296(local1666);
					return;
				}
				if (arg1.equals("savevarcs")) {
					Static53.method919();
					Static212.method3438("perm varcs saved");
					return;
				}
				if (arg1.equals("scramblevarcs")) {
					for (local285 = 0; local285 < Static470.anIntArray532.length; local285++) {
						if (Static254.aBooleanArray23[local285]) {
							Static470.anIntArray532[local285] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static470.anIntArray532[local285] *= -1;
							}
						}
					}
					Static53.method919();
					Static212.method3438("perm varcs scrambled");
					return;
				}
				if (arg1.equals("showcolmap")) {
					Static423.aBoolean563 = true;
					Static361.method6164();
					Static212.method3438("colmap is shown");
					return;
				}
				if (arg1.equals("hidecolmap")) {
					Static423.aBoolean563 = false;
					Static361.method6164();
					Static212.method3438("colmap is hidden");
					return;
				}
				if (arg1.equals("resetcache")) {
					Static542.method7382();
					Static212.method3438("Caches reset");
					return;
				}
				if (arg1.equals("profilecpu")) {
					Static212.method3438(Static547.method5857() + "ms");
					return;
				}
				if (arg1.startsWith("getclientvarpbit")) {
					local285 = Integer.parseInt(arg1.substring(17));
					Static212.method3438("varpbit=" + Static70.aClass78_1.method1459(local285));
					return;
				}
				if (arg1.startsWith("getclientvarp")) {
					local285 = Integer.parseInt(arg1.substring(14));
					Static212.method3438("varp=" + Static70.aClass78_1.method1460(local285));
					return;
				}
				if (arg1.startsWith("demologin")) {
					Static138.method2344(false, 0);
					return;
				}
				if (arg1.startsWith("newdemologin")) {
					Static138.method2344(true, 0);
					return;
				}
				if (arg1.startsWith("directlogin")) {
					@Pc(1892) String[] local1892 = Static568.method7710(arg1.substring(12), ' ');
					if (local1892.length >= 2) {
						local825 = local1892.length > 2 ? Integer.parseInt(local1892[2]) : 0;
						Static538.method7345(local1892[1], local1892[0], local825);
						return;
					}
				}
				if (arg1.startsWith("csprofileclear")) {
					Static552.method7496();
					return;
				}
				if (arg1.startsWith("csprofileoutputc")) {
					Static552.method7498();
					return;
				}
				if (arg1.startsWith("csprofileoutputt")) {
					Static552.method7498();
					return;
				}
				if (arg1.startsWith("texsize")) {
					local285 = Integer.parseInt(arg1.substring(8));
					Static307.aClass100_6.method6229(local285);
					return;
				}
				if (arg1.equals("soundstreamcount")) {
					Static212.method3438("Active streams: " + Static122.aClass2_Sub10_Sub1_2.method1014());
					return;
				}
				if (arg1.equals("autosetup")) {
					Static72.aClass2_Sub12_Sub1_1.method1424();
					Static212.method3438("Complete. Toolkit now: " + Static391.anInt6846);
					return;
				}
				if (arg1.equals("errormessage")) {
					Static212.method3438(Static413.aClient1.method1076());
					return;
				}
				if (arg1.equals("heapdump")) {
					if (Static464.aString79.startsWith("win")) {
						Static162.method2874(new File("C:\\Temp\\heap.dump"));
					} else {
						Static162.method2874(new File("/tmp/heap.dump"));
					}
					Static212.method3438("Done");
					return;
				}
				if (arg1.equals("os")) {
					Static212.method3438("Name: " + Static464.aString79);
					Static212.method3438("Arch: " + Static464.aString75);
					Static212.method3438("Ver: " + Static464.aString76);
					return;
				}
				if (arg1.equals("w2debug")) {
					Static295.aBoolean658 = !Static295.aBoolean658;
					Static265.method4069();
					Static212.method3438("Toggled!");
					return;
				}
				if (Static201.anInt3963 == 10) {
					local1666 = Static249.method3910(Static38.aClass286_12, Static400.aClass145_2);
					local1666.aClass2_Sub15_Sub2_2.method4333(arg1.length() + 3);
					local1666.aClass2_Sub15_Sub2_2.method4333(arg2 ? 1 : 0);
					local1666.aClass2_Sub15_Sub2_2.method4333(arg0 ? 1 : 0);
					local1666.aClass2_Sub15_Sub2_2.method4313(arg1);
					Static531.method7296(local1666);
				}
				if (arg1.startsWith("fps ") && Static375.aClass258_6 != Static207.aClass258_3) {
					Static463.method6530(Static158.method2594(arg1.substring(4)));
					return;
				}
			} catch (@Pc(2141) Exception local2141) {
				Static212.method3438(Static290.aClass198_4.method4365(Static52.anInt1264));
				return;
			}
		}
		if (Static201.anInt3963 != 10) {
			Static212.method3438(Static290.aClass198_5.method4365(Static52.anInt1264) + arg1);
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZII)Z")
	public static boolean method698(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) boolean local25 = (arg0 & 0x37) == 0 ? Static263.method4046(arg1, arg0) : Static41.method700(arg0, arg1);
		return local25 | (arg1 & 0x10000) != 0 | Static64.method1032(arg0, arg1);
	}
}
