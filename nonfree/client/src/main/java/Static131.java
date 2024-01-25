import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "Lclient!ni;")
	public static Class223 aClass223_41;

	@OriginalMember(owner = "client!eia", name = "e", descriptor = "[Lclient!qca;")
	public static Class273[] aClass273Array1;

	@OriginalMember(owner = "client!eia", name = "h", descriptor = "I")
	public static int anInt3188;

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_32 = new Class185(51, -1);

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "I")
	public static int anInt3186 = 0;

	@OriginalMember(owner = "client!eia", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray7 = new int[128][128];

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lclient!gv;ILclient!bi;BI)V")
	public static void method2667(@OriginalArg(0) Class9_Sub4_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub8_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(13) int local13;
		if ((arg1 & 0x400) != 0) {
			local13 = arg2.method8245();
			arg0.anInt4320 = arg2.method8253();
			arg0.anInt4327 = arg2.method8247();
			arg0.anInt4349 = local13 & 0x7FFF;
			arg0.aBoolean348 = (local13 & 0x8000) != 0;
			arg0.anInt4340 = arg0.anInt4349 + Static384.anInt7234 + arg0.anInt4320;
		}
		@Pc(49) byte local49 = -1;
		@Pc(61) int local61;
		@Pc(70) int local70;
		@Pc(74) int local74;
		@Pc(80) int local80;
		if ((arg1 & 0x4000) != 0) {
			local13 = arg2.method8237();
			local61 = arg2.method8226();
			if (local13 == 65535) {
				local13 = -1;
			}
			local70 = arg2.method8246();
			local74 = local70 & 0x7;
			local80 = local70 >> 3 & 0xF;
			if (local80 == 15) {
				local80 = -1;
			}
			arg0.method3618(local80, true, local61, local74, local13);
		}
		if ((arg1 & 0x2000) != 0) {
			local49 = arg2.method8201();
		}
		@Pc(140) int local140;
		@Pc(112) int[] local112;
		@Pc(115) int[] local115;
		if ((arg1 & 0x40000) != 0) {
			local13 = arg2.method8247();
			local112 = new int[local13];
			local115 = new int[local13];
			for (local74 = 0; local74 < local13; local74++) {
				local80 = arg2.method8245();
				if ((local80 & 0xC000) == 49152) {
					local140 = arg2.method8245();
					local112[local74] = local140 | local80 << 16;
				} else {
					local112[local74] = local80;
				}
				local115[local74] = arg2.method8220();
			}
			arg0.method3624(local115, local112);
		}
		if ((arg1 & 0x80) != 0) {
			local13 = arg2.method8220();
			local61 = arg2.method8266();
			if (local13 == 65535) {
				local13 = -1;
			}
			local70 = arg2.method8253();
			local74 = local70 & 0x7;
			local80 = local70 >> 3 & 0xF;
			if (local80 == 15) {
				local80 = -1;
			}
			arg0.method3618(local80, false, local61, local74, local13);
		}
		if ((arg1 & 0x200) != 0) {
			arg0.anInt4303 = arg2.method8204();
			arg0.anInt4273 = arg2.method8201();
			arg0.anInt4291 = arg2.method8204();
			arg0.anInt4318 = arg2.method8204();
			arg0.anInt4316 = arg2.method8245() + Static384.anInt7234;
			arg0.anInt4351 = arg2.method8237() + Static384.anInt7234;
			arg0.anInt4334 = arg2.method8253();
			if (arg0.aBoolean356) {
				arg0.anInt4273 += arg0.anInt4394;
				arg0.anInt4318 += arg0.anInt4394;
				arg0.anInt4303 += arg0.anInt4370;
				arg0.anInt4291 += arg0.anInt4370;
				arg0.anInt4359 = 0;
			} else {
				arg0.anInt4273 += arg0.anIntArray198[0];
				arg0.anInt4318 += arg0.anIntArray198[0];
				arg0.anInt4303 += arg0.anIntArray197[0];
				arg0.anInt4291 += arg0.anIntArray197[0];
				arg0.anInt4359 = 1;
			}
			arg0.anInt4361 = 0;
		}
		if ((arg1 & 0x4) != 0) {
			arg0.anInt4362 = arg2.method8237();
			if (arg0.anInt4359 == 0) {
				arg0.method3628(arg0.anInt4362);
				arg0.anInt4362 = -1;
			}
		}
		if ((arg1 & 0x2) != 0) {
			local13 = arg2.method8245();
			if (local13 == 65535) {
				local13 = -1;
			}
			arg0.anInt4293 = local13;
		}
		if ((arg1 & 0x10000) != 0) {
			arg0.aByte43 = arg2.method8204();
			arg0.aByte42 = arg2.method8251();
			arg0.aByte41 = arg2.method8251();
			arg0.aByte44 = (byte) arg2.method8246();
			arg0.anInt4331 = Static384.anInt7234 + arg2.method8237();
			arg0.anInt4275 = Static384.anInt7234 + arg2.method8229();
		}
		if ((arg1 & 0x8) != 0) {
			local13 = arg2.method8246();
			if (local13 > 0) {
				for (local61 = 0; local61 < local13; local61++) {
					local74 = -1;
					local80 = -1;
					local70 = arg2.method8214();
					local140 = -1;
					if (local70 == 32767) {
						local70 = arg2.method8214();
						local80 = arg2.method8214();
						local74 = arg2.method8214();
						local140 = arg2.method8214();
					} else if (local70 == 32766) {
						local70 = -1;
					} else {
						local80 = arg2.method8214();
					}
					@Pc(481) int local481 = arg2.method8214();
					@Pc(485) int local485 = arg2.method8246();
					arg0.method3623(local485, local80, local70, Static384.anInt7234, local140, local481, local74);
				}
			}
		}
		if ((arg1 & 0x10) != 0) {
			@Pc(509) int[] local509 = new int[4];
			for (local61 = 0; local61 < 4; local61++) {
				local509[local61] = arg2.method8237();
				if (local509[local61] == 65535) {
					local509[local61] = -1;
				}
			}
			local70 = arg2.method8243();
			Static341.method5674(local70, arg0, local509);
		}
		if ((arg1 & 0x40) != 0) {
			local13 = arg2.method8253();
			@Pc(559) byte[] local559 = new byte[local13];
			@Pc(564) Class6_Sub8 local564 = new Class6_Sub8(local559);
			arg2.method8267(local13, local559);
			Static387.aClass6_Sub8Array1[arg3] = local564;
			arg0.method3641(local564);
		}
		if ((arg1 & 0x1000) != 0) {
			arg0.aBoolean357 = arg2.method8253() == 1;
		}
		if ((arg1 & 0x8000) != 0) {
			arg0.aString44 = arg2.method8221();
			if (arg0.aString44.charAt(0) == '~') {
				arg0.aString44 = arg0.aString44.substring(1);
				Static548.method7725(2, arg0.aString44, 0, arg0.method3638(), arg0.method3642(), arg0.aString45);
			} else if (arg0 == Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1) {
				Static548.method7725(2, arg0.aString44, 0, arg0.method3638(), arg0.method3642(), arg0.aString45);
			}
			arg0.anInt4311 = 150;
			arg0.anInt4325 = 0;
			arg0.anInt4329 = 0;
		}
		if ((arg1 & 0x100) != 0) {
			local13 = arg2.method8243();
			local112 = new int[local13];
			local115 = new int[local13];
			@Pc(692) int[] local692 = new int[local13];
			for (local80 = 0; local80 < local13; local80++) {
				local140 = arg2.method8229();
				if (local140 == 65535) {
					local140 = -1;
				}
				local112[local80] = local140;
				local115[local80] = arg2.method8243();
				local692[local80] = arg2.method8237();
			}
			Static469.method6991(arg0, local692, local115, local112);
		}
		if ((arg1 & 0x1) != 0) {
			Static340.aByteArray57[arg3] = arg2.method8201();
		}
		if (!arg0.aBoolean356) {
			return;
		}
		if (local49 == 127) {
			arg0.method3639(arg0.anInt4394, arg0.anInt4370);
			return;
		}
		@Pc(757) byte local757;
		if (local49 == -1) {
			local757 = Static340.aByteArray57[arg3];
		} else {
			local757 = local49;
		}
		Static497.method7193(local757, arg0);
		arg0.method3636(arg0.anInt4370, arg0.anInt4394, local757);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Ljava/lang/String;ZZB)V")
	public static void method2668(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg0.equalsIgnoreCase("commands") || arg0.equalsIgnoreCase("help")) {
				Static552.method7749("commands - This command");
				Static552.method7749("cls - Clear console");
				Static552.method7749("displayfps - Toggle FPS and other information");
				Static552.method7749("renderer - Print graphics renderer information");
				Static552.method7749("heap - Print java memory information");
				return;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static107.anInt2893 = 0;
				Static310.anInt1854 = 0;
				return;
			}
			if (arg0.equalsIgnoreCase("displayfps")) {
				Static164.aBoolean291 = !Static164.aBoolean291;
				if (Static164.aBoolean291) {
					Static552.method7749("FPS on");
					return;
				}
				Static552.method7749("FPS off");
				return;
			}
			if (arg0.equals("renderer")) {
				@Pc(69) Class77 local69 = Static467.aClass5_13.method6162();
				Static552.method7749("Vendor: " + local69.anInt3030);
				Static552.method7749("Name: " + local69.aString23);
				Static552.method7749("Version: " + local69.anInt3029);
				Static552.method7749("Device: " + local69.aString22);
				Static552.method7749("Driver Version: " + local69.aLong72);
				return;
			}
			if (arg0.equals("heap")) {
				Static552.method7749("Heap: " + Static510.anInt8806 + "MB");
				return;
			}
		} catch (@Pc(146) Exception local146) {
			Static552.method7749(Static536.aClass316_4.method7577(Static638.anInt10709));
			return;
		}
		if (Static86.aClass212_19 != Static630.aClass212_18 || Static497.anInt8643 >= 2) {
			if (arg0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}
			if (arg0.equals("nativememerror")) {
				throw new OutOfMemoryError("native(MPR");
			}
			try {
				if (arg0.equalsIgnoreCase("printfps")) {
					Static552.method7749("FPS: " + Static576.anInt9821);
					return;
				}
				if (arg0.equalsIgnoreCase("occlude")) {
					Static211.aBoolean331 = !Static211.aBoolean331;
					if (Static211.aBoolean331) {
						Static552.method7749("Occlsion now on!");
						return;
					}
					Static552.method7749("Occlsion now off!");
					return;
				}
				if (arg0.equalsIgnoreCase("fpson")) {
					Static164.aBoolean291 = true;
					Static552.method7749("fps debug enabled");
					return;
				}
				if (arg0.equalsIgnoreCase("fpsoff")) {
					Static164.aBoolean291 = false;
					Static552.method7749("fps debug disabled");
					return;
				}
				if (arg0.equals("systemmem")) {
					try {
						Static552.method7749("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + Static18.aClass6_Sub38_1.anInt7891 + "Mb");
						return;
					} catch (@Pc(258) Throwable local258) {
						return;
					}
				}
				if (arg0.equalsIgnoreCase("cleartext")) {
					Static482.aClass234_12.method6091();
					Static552.method7749("Text coords cleared");
					return;
				}
				@Pc(300) int local300;
				@Pc(280) int local280;
				@Pc(291) Runtime local291;
				if (arg0.equalsIgnoreCase("gc")) {
					Static57.method1713();
					for (local280 = 0; local280 < 10; local280++) {
						System.gc();
					}
					local291 = Runtime.getRuntime();
					local300 = (int) ((local291.totalMemory() - local291.freeMemory()) / 1024L);
					Static552.method7749("mem=" + local300 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("compact")) {
					Static57.method1713();
					for (local280 = 0; local280 < 10; local280++) {
						System.gc();
					}
					local291 = Runtime.getRuntime();
					local300 = (int) ((local291.totalMemory() - local291.freeMemory()) / 1024L);
					Static552.method7749("Memory before cleanup=" + local300 + "k");
					Static374.method7977();
					Static57.method1713();
					for (@Pc(357) int local357 = 0; local357 < 10; local357++) {
						System.gc();
					}
					local300 = (int) ((local291.totalMemory() - local291.freeMemory()) / 1024L);
					Static552.method7749("Memory after cleanup=" + local300 + "k");
					return;
				}
				if (arg0.equalsIgnoreCase("unloadnatives")) {
					Static552.method7749(Static602.method8317() ? "Libraries unloaded" : "Library unloading failed!");
					return;
				}
				if (arg0.equalsIgnoreCase("clientdrop")) {
					Static552.method7749("Dropped client connection");
					if (Static333.anInt6626 == 10) {
						Static49.method1563();
					} else if (Static333.anInt6626 == 11) {
						Static450.aBoolean650 = true;
						return;
					}
					return;
				}
				if (arg0.equalsIgnoreCase("rotateconnectmethods")) {
					Static184.aClass358_1.method8344();
					Static552.method7749("Rotated connection methods");
					return;
				}
				if (arg0.equalsIgnoreCase("clientjs5drop")) {
					Static633.aClass152_3.method4598();
					Static552.method7749("Dropped client js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("serverjs5drop")) {
					Static633.aClass152_3.method4603();
					Static552.method7749("Dropped server js5 net queue");
					return;
				}
				if (arg0.equalsIgnoreCase("breakcon")) {
					Static496.aClass104_4.method3130();
					Static226.aClass41_1.method1730();
					Static633.aClass152_3.method4608();
					Static552.method7749("Breaking new connections for 5 seconds");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuild")) {
					Static112.method8730();
					Static485.method7134();
					Static552.method7749("Rebuilding map");
					return;
				}
				if (arg0.equalsIgnoreCase("rebuildprofile")) {
					Static235.aLong40 = Static582.method8056();
					Static474.aBoolean672 = true;
					Static112.method8730();
					Static485.method7134();
					Static552.method7749("Rebuilding map (with profiling)");
					return;
				}
				if (arg0.equalsIgnoreCase("wm1")) {
					Static210.method3780(1, -1, -1, false);
					if (Static326.method5447() != 1) {
						Static552.method7749("wm1 failed");
						return;
					}
					Static552.method7749("wm1 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("wm2")) {
					Static210.method3780(2, -1, -1, false);
					if (Static326.method5447() == 2) {
						Static552.method7749("wm2 succeeded");
						return;
					}
					Static552.method7749("wm2 failed");
					return;
				}
				if (arg0.equalsIgnoreCase("wm3")) {
					Static210.method3780(3, 1024, 768, false);
					if (Static326.method5447() != 3) {
						Static552.method7749("wm3 failed");
						return;
					}
					Static552.method7749("wm3 succeeded");
					return;
				}
				if (arg0.equalsIgnoreCase("tk0")) {
					Static237.method4302(0, false);
					if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() == 0) {
						Static552.method7749("Entered tk0");
						Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub8_2);
						Static541.method7640();
						Static406.aBoolean589 = false;
						return;
					}
					Static552.method7749("Failed to enter tk0");
					return;
				}
				if (arg0.equalsIgnoreCase("tk1")) {
					Static237.method4302(1, false);
					if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() == 1) {
						Static552.method7749("Entered tk1");
						Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub8_2);
						Static541.method7640();
						Static406.aBoolean589 = false;
						return;
					}
					Static552.method7749("Failed to enter tk1");
					return;
				}
				if (arg0.equalsIgnoreCase("tk2")) {
					Static237.method4302(2, false);
					if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() != 2) {
						Static552.method7749("Failed to enter tk2");
						return;
					}
					Static552.method7749("Entered tk2");
					Static87.aClass6_Sub33_6.method4996(2, Static87.aClass6_Sub33_6.aClass14_Sub8_2);
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk3")) {
					Static237.method4302(3, false);
					if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() != 3) {
						Static552.method7749("Failed to enter tk3");
						return;
					}
					Static552.method7749("Entered tk3");
					Static87.aClass6_Sub33_6.method4996(3, Static87.aClass6_Sub33_6.aClass14_Sub8_2);
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0.equalsIgnoreCase("tk5")) {
					Static237.method4302(5, false);
					if (Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() == 5) {
						Static552.method7749("Entered tk5");
						Static87.aClass6_Sub33_6.method4996(5, Static87.aClass6_Sub33_6.aClass14_Sub8_2);
						Static541.method7640();
						Static406.aBoolean589 = false;
						return;
					}
					Static552.method7749("Failed to enter tk5");
					return;
				}
				if (arg0.startsWith("setba")) {
					if (arg0.length() < 6) {
						Static552.method7749("Invalid buildarea value");
						return;
					}
					local280 = Static533.method7565(arg0.substring(6));
					if (local280 >= 0 && local280 <= Static595.method8268(Static510.anInt8806)) {
						Static87.aClass6_Sub33_6.method4996(local280, Static87.aClass6_Sub33_6.aClass14_Sub17_1);
						Static541.method7640();
						Static406.aBoolean589 = false;
						Static552.method7749("maxbuildarea=" + Static87.aClass6_Sub33_6.aClass14_Sub17_1.method5999());
						return;
					}
					Static552.method7749("Invalid buildarea value");
					return;
				}
				if (arg0.startsWith("rect_debug")) {
					if (arg0.length() < 10) {
						Static552.method7749("Invalid rect_debug value");
						return;
					}
					Static313.anInt6259 = Static533.method7565(arg0.substring(10).trim());
					Static552.method7749("rect_debug=" + Static313.anInt6259);
					return;
				}
				if (arg0.equalsIgnoreCase("qa_op_test")) {
					Static30.aBoolean78 = true;
					Static552.method7749("qa_op_test=" + Static30.aBoolean78);
					return;
				}
				if (arg0.equalsIgnoreCase("clipcomponents")) {
					Static292.aBoolean472 = !Static292.aBoolean472;
					Static552.method7749("clipcomponents=" + Static292.aBoolean472);
					return;
				}
				if (arg0.startsWith("bloom")) {
					@Pc(880) boolean local880 = Static467.aClass5_13.method6131();
					if (!Static157.method3090(!local880)) {
						Static552.method7749("Failed to enable bloom");
						return;
					}
					if (!local880) {
						Static552.method7749("Bloom enabled");
						return;
					}
					Static552.method7749("Bloom disabled");
					return;
				}
				if (arg0.equalsIgnoreCase("tween")) {
					if (!Static609.aBoolean809) {
						Static609.aBoolean809 = true;
						Static552.method7749("Forced tweening ENABLED!");
						return;
					}
					Static609.aBoolean809 = false;
					Static552.method7749("Forced tweening disabled.");
					return;
				}
				if (arg0.equalsIgnoreCase("shiftclick")) {
					if (Static198.aBoolean343) {
						Static552.method7749("Shift-click disabled.");
						Static198.aBoolean343 = false;
						return;
					}
					Static552.method7749("Shift-click ENABLED!");
					Static198.aBoolean343 = true;
					return;
				}
				if (arg0.equalsIgnoreCase("getcgcoord")) {
					Static552.method7749("x:" + (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 >> 9) + " z:" + (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("getheight")) {
					Static552.method7749("Height: " + Static148.aClass245Array1[Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135].method7583(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 >> 9, Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 >> 9));
					return;
				}
				if (arg0.equalsIgnoreCase("resetminimap")) {
					Static436.aClass223_98.method5975();
					Static436.aClass223_98.method5969();
					Static386.aClass341_2.method8002();
					Static385.aClass345_2.method8045();
					Static485.method7134();
					Static552.method7749("Minimap reset");
					return;
				}
				if (arg0.startsWith("mc")) {
					if (Static467.aClass5_13.method6173()) {
						local280 = Integer.parseInt(arg0.substring(3));
						if (local280 < 1) {
							local280 = 1;
						} else if (local280 > 4) {
							local280 = 4;
						}
						Static114.anInt2975 = local280;
						Static112.method8730();
						Static552.method7749("Render cores now: " + Static114.anInt2975);
						return;
					}
					Static552.method7749("Current toolkit doesn't support multiple cores");
					return;
				}
				if (arg0.startsWith("cachespace")) {
					Static552.method7749("I(s): " + Static588.aClass94_65.method2957() + "/" + Static588.aClass94_65.method2951());
					Static552.method7749("I(m): " + Static92.aClass94_12.method2957() + "/" + Static92.aClass94_12.method2951());
					Static552.method7749("O(s): " + Static356.aClass221_1.aClass89_1.method2739() + "/" + Static356.aClass221_1.aClass89_1.method2743());
					return;
				}
				if (arg0.equalsIgnoreCase("getcamerapos")) {
					Static552.method7749("Pos: " + Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 + "," + ((Static184.anInt4048 >> 9) + Static477.anInt8412 >> 6) + "," + ((Static259.anInt6990 >> 9) + Static227.anInt5049 >> 6) + "," + (Static477.anInt8412 + (Static184.anInt4048 >> 9) & 0x3F) + "," + ((Static259.anInt6990 >> 9) + Static227.anInt5049 & 0x3F) + " Height: " + (Static150.method2982(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135, Static259.anInt6990, Static184.anInt4048) - Static149.anInt3489));
					Static552.method7749("Look: " + Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 + "," + (Static18.anInt621 + Static477.anInt8412 >> 6) + "," + (Static227.anInt5049 + Static187.anInt4085 >> 6) + "," + (Static477.anInt8412 + Static18.anInt621 & 0x3F) + "," + (Static187.anInt4085 + Static227.anInt5049 & 0x3F) + " Height: " + (Static150.method2982(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135, Static187.anInt4085, Static18.anInt621) - Static526.anInt9182));
					return;
				}
				if (arg0.equals("renderprofile") || arg0.equals("rp")) {
					Static316.aBoolean491 = !Static316.aBoolean491;
					Static467.aClass5_13.method6124(Static316.aBoolean491);
					Static405.method6337();
					Static552.method7749("showprofiling=" + Static316.aBoolean491);
					return;
				}
				@Pc(1294) String[] local1294;
				@Pc(1283) int local1283;
				if (arg0.startsWith("performancetest")) {
					local280 = -1;
					local1283 = 1000;
					if (arg0.length() > 15) {
						local1294 = Static206.method3730(arg0, ' ');
						try {
							if (local1294.length > 1) {
								local1283 = Integer.parseInt(local1294[1]);
							}
						} catch (@Pc(1307) Throwable local1307) {
						}
						try {
							if (local1294.length > 2) {
								local280 = Integer.parseInt(local1294[2]);
							}
						} catch (@Pc(1320) Throwable local1320) {
						}
					}
					if (local280 != -1) {
						Static552.method7749("Performance: " + Static128.method2646(local1283, local280));
						return;
					}
					Static552.method7749("Java toolkit: " + Static128.method2646(local1283, 0));
					Static552.method7749("SSE toolkit:  " + Static128.method2646(local1283, 2));
					Static552.method7749("D3D toolkit:  " + Static128.method2646(local1283, 3));
					Static552.method7749("GL toolkit:   " + Static128.method2646(local1283, 1));
					Static552.method7749("GLX toolkit:  " + Static128.method2646(local1283, 5));
					return;
				}
				if (arg0.equals("nonpcs")) {
					Static100.aBoolean233 = !Static100.aBoolean233;
					Static552.method7749("nonpcs=" + Static100.aBoolean233);
					return;
				}
				if (arg0.equals("autoworld")) {
					Static408.method6422();
					Static552.method7749("auto world selected");
					return;
				}
				if (arg0.startsWith("switchworld")) {
					local280 = Integer.parseInt(arg0.substring(12));
					Static139.method2769(local280, Static484.method7132(local280).aString59);
					Static552.method7749("switched");
					return;
				}
				if (arg0.equals("getworld")) {
					Static552.method7749("w: " + Static184.aClass358_1.anInt10266);
					return;
				}
				@Pc(1482) Class6_Sub17 local1482;
				if (arg0.startsWith("pc")) {
					local1482 = Static330.method7824(Static547.aClass185_5, Static569.aClass134_2);
					local1482.aClass6_Sub8_Sub1_2.method8211(0);
					local1283 = local1482.aClass6_Sub8_Sub1_2.anInt10061;
					local300 = arg0.indexOf(" ", 4);
					local1482.aClass6_Sub8_Sub1_2.method8205(arg0.substring(3, local300));
					Static121.method2599(arg0.substring(local300), local1482.aClass6_Sub8_Sub1_2);
					local1482.aClass6_Sub8_Sub1_2.method8228(local1482.aClass6_Sub8_Sub1_2.anInt10061 - local1283);
					Static452.method6867(local1482);
					return;
				}
				if (arg0.equals("savevarcs")) {
					Static48.method1562();
					Static552.method7749("perm varcs saved");
					return;
				}
				if (arg0.equals("scramblevarcs")) {
					for (local280 = 0; local280 < Static267.anIntArray256.length; local280++) {
						if (Static272.aBooleanArray10[local280]) {
							Static267.anIntArray256[local280] = (int) (Math.random() * 99999.0D);
							if (Math.random() > 0.5D) {
								Static267.anIntArray256[local280] *= -1;
							}
						}
					}
					Static48.method1562();
					Static552.method7749("perm varcs scrambled");
					return;
				}
				if (arg0.equals("showcolmap")) {
					Static90.aBoolean214 = true;
					Static485.method7134();
					Static552.method7749("colmap is shown");
					return;
				}
				if (arg0.equals("hidecolmap")) {
					Static90.aBoolean214 = false;
					Static485.method7134();
					Static552.method7749("colmap is hidden");
					return;
				}
				if (arg0.equals("resetcache")) {
					Static234.method4283();
					Static552.method7749("Caches reset");
					return;
				}
				if (arg0.equals("profilecpu")) {
					Static552.method7749(Static420.method6590() + "ms");
					return;
				}
				if (arg0.startsWith("getclientvarpbit")) {
					local280 = Integer.parseInt(arg0.substring(17));
					Static552.method7749("varpbit=" + Static140.aClass157_1.method4851(local280));
					return;
				}
				if (arg0.startsWith("getclientvarp")) {
					local280 = Integer.parseInt(arg0.substring(14));
					Static552.method7749("varp=" + Static140.aClass157_1.method4850(local280));
					return;
				}
				if (arg0.startsWith("directlogin")) {
					@Pc(1698) String[] local1698 = Static206.method3730(arg0.substring(12), ' ');
					if (local1698.length >= 2) {
						local1283 = local1698.length > 2 ? Integer.parseInt(local1698[2]) : 0;
						Static441.method6731(local1698[1], local1698[0], local1283);
						return;
					}
				}
				if (arg0.startsWith("csprofileclear")) {
					Static435.method6672();
					return;
				}
				if (arg0.startsWith("csprofileoutputc")) {
					Static435.method6668();
					return;
				}
				if (arg0.startsWith("csprofileoutputt")) {
					Static435.method6668();
					return;
				}
				if (arg0.startsWith("texsize")) {
					local280 = Integer.parseInt(arg0.substring(8));
					Static467.aClass5_13.method6141(local280);
					return;
				}
				if (arg0.equals("soundstreamcount")) {
					Static552.method7749("Active streams: " + Static152.aClass6_Sub4_Sub3_2.method5200());
					return;
				}
				if (arg0.equals("autosetup")) {
					Static310.method1708();
					Static552.method7749("Complete. Toolkit now: " + Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640());
					return;
				}
				if (arg0.equals("errormessage")) {
					Static552.method7749(Static545.aClient1.method2129());
					return;
				}
				if (arg0.equals("heapdump")) {
					if (Static161.aString38.startsWith("win")) {
						Static321.method5342(new File("C:\\Temp\\heap.dump"));
					} else {
						Static321.method5342(new File("/tmp/heap.dump"));
					}
					Static552.method7749("Done");
					return;
				}
				if (arg0.equals("os")) {
					Static552.method7749("Name: " + Static161.aString38);
					Static552.method7749("Arch: " + Static161.aString34);
					Static552.method7749("Ver: " + Static161.aString31);
					return;
				}
				if (arg0.startsWith("w2debug")) {
					local280 = Integer.parseInt(arg0.substring(8, 9));
					Static209.anInt4538 = local280;
					Static112.method8730();
					Static552.method7749("Toggled!");
					return;
				}
				if (arg0.startsWith("ortho ")) {
					local280 = arg0.indexOf(32);
					if (local280 < 0) {
						Static552.method7749("Syntax: ortho <n>");
						return;
					}
					local1283 = Static533.method7565(arg0.substring(local280 + 1));
					Static87.aClass6_Sub33_6.method4996(local1283, Static87.aClass6_Sub33_6.lb);
					Static541.method7640();
					Static406.aBoolean589 = false;
					Static409.method6426();
					if (local1283 != Static87.aClass6_Sub33_6.lb.method6215()) {
						Static552.method7749("Failed to change ortho mode");
						return;
					}
					Static552.method7749("Successfully changed ortho mode");
					return;
				}
				if (arg0.startsWith("orthozoom ")) {
					if (Static87.aClass6_Sub33_6.lb.method6215() == 0) {
						Static552.method7749("enable ortho mode first (use 'ortho <n>')");
						return;
					}
					local280 = Static533.method7565(arg0.substring(arg0.indexOf(32) + 1));
					Static32.anInt850 = local280;
					Static552.method7749("orthozoom=" + Static32.anInt850);
					return;
				}
				if (arg0.startsWith("orthotilesize ")) {
					local280 = Static533.method7565(arg0.substring(arg0.indexOf(32) + 1));
					Static608.anInt10285 = local280;
					Static580.anInt9867 = local280;
					Static552.method7749("ortho tile size=" + local280);
					Static409.method6426();
					return;
				}
				if (arg0.equals("orthocamlock")) {
					Static130.aBoolean784 = !Static130.aBoolean784;
					Static552.method7749("ortho camera lock is " + (Static130.aBoolean784 ? "on" : "off"));
					return;
				}
				@Pc(2039) File local2039;
				if (arg0.startsWith("setoutput ")) {
					local2039 = new File(arg0.substring(10));
					if (local2039.exists()) {
						local2039 = new File(arg0.substring(10) + "." + Static582.method8056() + ".log");
						if (local2039.exists()) {
							Static552.method7749("file already exists!");
							return;
						}
					}
					if (Static466.aFileOutputStream1 != null) {
						Static466.aFileOutputStream1.close();
						Static466.aFileOutputStream1 = null;
					}
					try {
						Static466.aFileOutputStream1 = new FileOutputStream(local2039);
						return;
					} catch (@Pc(2081) FileNotFoundException local2081) {
						Static552.method7749("Could not create " + local2039.getName());
						return;
					} catch (@Pc(2095) SecurityException local2095) {
						Static552.method7749("Cannot write to " + local2039.getName());
						return;
					}
				}
				if (arg0.equals("closeoutput")) {
					if (Static466.aFileOutputStream1 != null) {
						Static466.aFileOutputStream1.close();
					}
					Static466.aFileOutputStream1 = null;
					return;
				}
				if (arg0.startsWith("runscript ")) {
					local2039 = new File(arg0.substring(10));
					if (!local2039.exists()) {
						Static552.method7749("No such file");
						return;
					}
					@Pc(2141) byte[] local2141 = Static478.method7047(local2039);
					if (local2141 == null) {
						Static552.method7749("Failed to read file");
						return;
					}
					local1294 = Static206.method3730(Static367.method7653(Static588.method8114(local2141), ""), '\n');
					Static203.method3703(local1294);
				}
				if (arg0.startsWith("zoom ")) {
					@Pc(2174) short local2174 = (short) Static533.method7565(arg0.substring(5));
					if (local2174 > 0) {
						Static260.aShort49 = local2174;
					}
					return;
				}
				if (Static333.anInt6626 == 10) {
					local1482 = Static330.method7824(Static536.aClass185_101, Static569.aClass134_2);
					local1482.aClass6_Sub8_Sub1_2.method8211(arg0.length() + 3);
					local1482.aClass6_Sub8_Sub1_2.method8211(arg2 ? 1 : 0);
					local1482.aClass6_Sub8_Sub1_2.method8211(arg1 ? 1 : 0);
					local1482.aClass6_Sub8_Sub1_2.method8205(arg0);
					Static452.method6867(local1482);
				}
				if (arg0.startsWith("fps ") && Static630.aClass212_18 != Static86.aClass212_19) {
					Static581.method8052(Static533.method7565(arg0.substring(4)));
					return;
				}
			} catch (@Pc(2247) Exception local2247) {
				Static552.method7749(Static536.aClass316_4.method7577(Static638.anInt10709));
				return;
			}
		}
		if (Static333.anInt6626 != 10) {
			Static552.method7749(Static536.aClass316_5.method7577(Static638.anInt10709) + arg0);
		}
	}
}
