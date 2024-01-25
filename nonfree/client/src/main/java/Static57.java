import jagex3.jagmisc.jagmisc;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_25 = new Class73(7, -2);

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_26 = new Class47(32, 3);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!qf;I)V")
	public static void method1220(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub21_Sub2 arg1) {
		@Pc(17) boolean local17 = arg1.method6078(1) == 1;
		if (local17) {
			Static28.anIntArray41[Static554.anInt9174++] = arg0;
		}
		@Pc(32) int local32 = arg1.method6078(2);
		@Pc(36) Class4_Sub1_Sub1_Sub2 local36 = Static588.aClass4_Sub1_Sub1_Sub2Array3[arg0];
		if (local32 != 0) {
			@Pc(154) int local154;
			@Pc(159) int local159;
			@Pc(164) int local164;
			if (local32 == 1) {
				local154 = arg1.method6078(3);
				local159 = local36.anIntArray521[0];
				local164 = local36.anIntArray522[0];
				if (local154 == 0) {
					local159--;
					local164--;
				} else if (local154 == 1) {
					local164--;
				} else if (local154 == 2) {
					local164--;
					local159++;
				} else if (local154 == 3) {
					local159--;
				} else if (local154 == 4) {
					local159++;
				} else if (local154 == 5) {
					local159--;
					local164++;
				} else if (local154 == 6) {
					local164++;
				} else if (local154 == 7) {
					local164++;
					local159++;
				}
				if (local17) {
					local36.aBoolean500 = true;
					local36.anInt7152 = local164;
					local36.anInt7160 = local159;
				} else {
					local36.method5914(local164, Static308.aByteArray66[arg0], local159);
				}
			} else if (local32 == 2) {
				local154 = arg1.method6078(4);
				local159 = local36.anIntArray521[0];
				local164 = local36.anIntArray522[0];
				if (local154 == 0) {
					local164 -= 2;
					local159 -= 2;
				} else if (local154 == 1) {
					local164 -= 2;
					local159--;
				} else if (local154 == 2) {
					local164 -= 2;
				} else if (local154 == 3) {
					local164 -= 2;
					local159++;
				} else if (local154 == 4) {
					local164 -= 2;
					local159 += 2;
				} else if (local154 == 5) {
					local164--;
					local159 -= 2;
				} else if (local154 == 6) {
					local164--;
					local159 += 2;
				} else if (local154 == 7) {
					local159 -= 2;
				} else if (local154 == 8) {
					local159 += 2;
				} else if (local154 == 9) {
					local164++;
					local159 -= 2;
				} else if (local154 == 10) {
					local164++;
					local159 += 2;
				} else if (local154 == 11) {
					local159 -= 2;
					local164 += 2;
				} else if (local154 == 12) {
					local164 += 2;
					local159--;
				} else if (local154 == 13) {
					local164 += 2;
				} else if (local154 == 14) {
					local159++;
					local164 += 2;
				} else if (local154 == 15) {
					local159 += 2;
					local164 += 2;
				}
				if (local17) {
					local36.aBoolean500 = true;
					local36.anInt7152 = local164;
					local36.anInt7160 = local159;
				} else {
					local36.method5914(local164, Static308.aByteArray66[arg0], local159);
				}
			} else {
				local154 = arg1.method6078(1);
				@Pc(433) int local433;
				@Pc(443) int local443;
				@Pc(457) int local457;
				@Pc(465) int local465;
				if (local154 == 0) {
					local159 = arg1.method6078(12);
					local164 = local159 >> 10;
					local433 = local159 >> 5 & 0x1F;
					if (local433 > 15) {
						local433 -= 32;
					}
					local443 = local159 & 0x1F;
					if (local443 > 15) {
						local443 -= 32;
					}
					local457 = local36.anIntArray521[0] + local433;
					local465 = local36.anIntArray522[0] + local443;
					if (local17) {
						local36.anInt7152 = local465;
						local36.aBoolean500 = true;
						local36.anInt7160 = local457;
					} else {
						local36.method5914(local465, Static308.aByteArray66[arg0], local457);
					}
					local36.aByte108 = (byte) (local36.aByte108 + local164 & 0x3);
					if (Static272.anInt5214 == arg0) {
						Static97.anInt1863 = local36.aByte108;
					}
				} else {
					local159 = arg1.method6078(30);
					local164 = local159 >> 28;
					local433 = local159 >> 14 & 0x3FFF;
					local443 = local159 & 0x3FFF;
					local457 = (local36.anIntArray521[0] + Static39.anInt4952 + local433 & 0x3FFF) - Static39.anInt4952;
					local465 = (local36.anIntArray522[0] + Static138.anInt3088 + local443 & 0x3FFF) - Static138.anInt3088;
					if (local17) {
						local36.aBoolean500 = true;
						local36.anInt7160 = local457;
						local36.anInt7152 = local465;
					} else {
						local36.method5914(local465, Static308.aByteArray66[arg0], local457);
					}
					local36.aByte108 = (byte) (local36.aByte108 + local164 & 0x3);
					if (Static272.anInt5214 == arg0) {
						Static97.anInt1863 = local36.aByte108;
					}
				}
			}
		} else if (local17) {
			local36.aBoolean500 = false;
		} else if (Static272.anInt5214 == arg0) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(64) Class302 local64 = Static412.aClass302Array1[arg0] = new Class302();
			local64.anInt8091 = (Static138.anInt3088 + local36.anIntArray522[0] >> 6) + (Static39.anInt4952 + local36.anIntArray521[0] >> 6 << 14) + (local36.aByte108 << 28);
			if (local36.anInt7172 == -1) {
				local64.anInt8092 = local36.aClass354_7.method7776();
			} else {
				local64.anInt8092 = local36.anInt7172;
			}
			local64.anInt8094 = local36.anInt7123;
			local64.aBoolean575 = local36.aBoolean498;
			if (local36.anInt7174 > 0) {
				Static294.method4727(local36);
			}
			Static588.aClass4_Sub1_Sub1_Sub2Array3[arg0] = null;
			if (arg1.method6078(1) != 0) {
				Static449.method6348(arg1, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZZLjava/lang/String;Z)V")
	public static void method1221(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2) {
		if (Static542.aClass194_5 == Static580.aClass194_7 && Static582.anInt9457 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		if (arg1.equals("nativememerror")) {
			throw new OutOfMemoryError("native(MPR");
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static43.aBoolean62 = true;
				Static513.method7109("fps debug enabled");
				return;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static43.aBoolean62 = false;
				Static513.method7109("fps debug disabled");
				return;
			}
			if (arg1.equals("systemmem")) {
				try {
					Static513.method7109("System memory: " + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + jagmisc.getTotalPhysicalMemory() / 1048576L + "Mb");
					return;
				} catch (@Pc(78) Throwable local78) {
					return;
				}
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static351.anInt9535 = 0;
				Static259.anInt5052 = 0;
				return;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static328.aClass40_5.method1133();
				Static513.method7109("Text coords cleared");
				return;
			}
			@Pc(128) int local128;
			@Pc(107) int local107;
			@Pc(118) Runtime local118;
			if (arg1.equalsIgnoreCase("gc")) {
				Static411.method7694();
				for (local107 = 0; local107 < 10; local107++) {
					System.gc();
				}
				local118 = Runtime.getRuntime();
				local128 = (int) ((local118.totalMemory() - local118.freeMemory()) / 1024L);
				Static513.method7109("mem=" + local128 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static411.method7694();
				for (local107 = 0; local107 < 10; local107++) {
					System.gc();
				}
				local118 = Runtime.getRuntime();
				local128 = (int) ((local118.totalMemory() - local118.freeMemory()) / 1024L);
				Static513.method7109("Memory before cleanup=" + local128 + "k");
				Static66.method1306();
				Static411.method7694();
				for (@Pc(184) int local184 = 0; local184 < 10; local184++) {
					System.gc();
				}
				local128 = (int) ((local118.totalMemory() - local118.freeMemory()) / 1024L);
				Static513.method7109("Memory after cleanup=" + local128 + "k");
				return;
			}
			if (arg1.equalsIgnoreCase("unloadnatives")) {
				Static513.method7109(Static457.method6449() ? "Libraries unloaded" : "Library unloading failed!");
				return;
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static513.method7109("Number of player models in cache:" + Static529.method4041());
				return;
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				Static513.method7109("Dropped client connection");
				if (Static557.anInt9206 == 10) {
					Static97.method1750();
					return;
				}
				if (Static557.anInt9206 == 11) {
					Static283.aBoolean380 = true;
				}
				return;
			}
			if (arg1.equalsIgnoreCase("rotateconnectmethods")) {
				Static316.aClass105_5.method2908();
				Static513.method7109("Rotated connection methods");
				return;
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static489.aClass163_3.method4210();
				Static513.method7109("Dropped client js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static489.aClass163_3.method4206();
				Static513.method7109("Dropped server js5 net queue");
				return;
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static352.aClass272_2.method6131();
				Static563.aClass127_2.method6312();
				Static489.aClass163_3.method4214();
				Static513.method7109("Breaking new connections for 5 seconds");
				return;
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static573.method7683();
				Static510.method7081();
				Static513.method7109("Rebuilding map");
				return;
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static235.method4083(false, 1, -1, -1);
				if (Static74.method1450() == 1) {
					Static513.method7109("wm1 succeeded");
					return;
				}
				Static513.method7109("wm1 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static235.method4083(false, 2, -1, -1);
				if (Static74.method1450() != 2) {
					Static513.method7109("wm2 failed");
					return;
				}
				Static513.method7109("wm2 succeeded");
				return;
			}
			if (arg1.equalsIgnoreCase("wm3")) {
				Static235.method4083(false, 3, 1024, 768);
				if (Static74.method1450() == 3) {
					Static513.method7109("wm3 succeeded");
					return;
				}
				Static513.method7109("wm3 failed");
				return;
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static293.method4707(0);
				if (Static560.anInt9242 == 0) {
					Static513.method7109("Entered tk0");
					Static140.aClass6_Sub48_Sub1_1.anInt8996 = 0;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				Static513.method7109("Failed to enter tk0");
				return;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static293.method4707(1);
				if (Static560.anInt9242 == 1) {
					Static513.method7109("Entered tk1");
					Static140.aClass6_Sub48_Sub1_1.anInt8996 = 1;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				Static513.method7109("Failed to enter tk1");
				return;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static293.method4707(2);
				if (Static560.anInt9242 != 2) {
					Static513.method7109("Failed to enter tk2");
					return;
				}
				Static513.method7109("Entered tk2");
				Static140.aClass6_Sub48_Sub1_1.anInt8996 = 2;
				Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
				Static408.aBoolean501 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static293.method4707(3);
				if (Static560.anInt9242 != 3) {
					Static513.method7109("Failed to enter tk3");
					return;
				}
				Static513.method7109("Entered tk3");
				Static140.aClass6_Sub48_Sub1_1.anInt8996 = 3;
				Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
				Static408.aBoolean501 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk4")) {
				Static293.method4707(4);
				if (Static560.anInt9242 != 4) {
					Static513.method7109("Failed to enter tk4");
					return;
				}
				Static513.method7109("Entered tk4");
				Static140.aClass6_Sub48_Sub1_1.anInt8996 = 4;
				Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
				Static408.aBoolean501 = false;
				return;
			}
			if (arg1.equalsIgnoreCase("tk5")) {
				Static293.method4707(5);
				if (Static560.anInt9242 == 5) {
					Static513.method7109("Entered tk5");
					Static140.aClass6_Sub48_Sub1_1.anInt8996 = 5;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				Static513.method7109("Failed to enter tk5");
				return;
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static140.aClass6_Sub48_Sub1_1.aBoolean684 = !Static140.aClass6_Sub48_Sub1_1.aBoolean684;
				Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
				Static408.aBoolean501 = false;
				Static573.method7683();
				Static513.method7109("ot=" + Static140.aClass6_Sub48_Sub1_1.aBoolean684);
				return;
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static140.aClass6_Sub48_Sub1_1.aBoolean690 = !Static140.aClass6_Sub48_Sub1_1.aBoolean690;
				Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
				Static408.aBoolean501 = false;
				Static573.method7683();
				Static513.method7109("gb=" + Static140.aClass6_Sub48_Sub1_1.aBoolean690);
				return;
			}
			@Pc(648) int local648;
			if (arg1.startsWith("shadows")) {
				if (arg1.length() < 8) {
					Static513.method7109("Invalid shadows value");
					return;
				}
				@Pc(638) String local638 = arg1.substring(8);
				local648 = Static198.method3584(local638) ? Static444.method6313(local638) : -1;
				if (local648 >= 0 && local648 <= 2) {
					Static140.aClass6_Sub48_Sub1_1.method7370(local648, Static560.anInt9242);
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					Static573.method7683();
					Static513.method7109("shadows=" + local648);
					return;
				}
				Static513.method7109("Invalid shadows value");
				return;
			}
			if (arg1.startsWith("textures")) {
				Static140.aClass6_Sub48_Sub1_1.aBoolean676 = !Static140.aClass6_Sub48_Sub1_1.aBoolean676;
				Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
				Static408.aBoolean501 = false;
				Static468.method6538();
				Static573.method7683();
				Static513.method7109("textures=" + Static140.aClass6_Sub48_Sub1_1.aBoolean676);
				return;
			}
			if (arg1.startsWith("lighting")) {
				Static140.aClass6_Sub48_Sub1_1.method7373(Static560.anInt9242, !Static140.aClass6_Sub48_Sub1_1.method7369(Static560.anInt9242));
				Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
				Static408.aBoolean501 = false;
				Static425.method6109();
				Static468.method6538();
				Static573.method7683();
				Static513.method7109("lighting=" + Static140.aClass6_Sub48_Sub1_1.method7369(Static560.anInt9242));
				return;
			}
			if (arg1.startsWith("setba")) {
				if (arg1.length() < 6) {
					Static513.method7109("Invalid buildarea value");
					return;
				}
				local107 = Static444.method6313(arg1.substring(6));
				if (local107 >= 0 && Static245.method4243(Static11.anInt321) >= local107) {
					Static140.aClass6_Sub48_Sub1_1.anInt9002 = local107;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					Static513.method7109("maxbuildarea=" + Static140.aClass6_Sub48_Sub1_1.anInt9002);
					return;
				}
				Static513.method7109("Invalid buildarea value");
				return;
			}
			if (arg1.startsWith("setparticles")) {
				if (arg1.length() < 13) {
					Static513.method7109("Invalid particles value");
					return;
				}
				Static474.method7123(Static444.method6313(arg1.substring(13)));
				Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
				Static408.aBoolean501 = false;
				Static513.method7109("particles=" + Static435.method6206());
				return;
			}
			if (arg1.startsWith("rect_debug")) {
				if (arg1.length() < 10) {
					Static513.method7109("Invalid rect_debug value");
					return;
				}
				Static273.anInt5224 = Static444.method6313(arg1.substring(10).trim());
				Static513.method7109("rect_debug=" + Static273.anInt5224);
				return;
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static226.aBoolean321 = true;
				Static513.method7109("qa_op_test=" + Static226.aBoolean321);
				return;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static196.aBoolean279 = !Static196.aBoolean279;
				Static513.method7109("clipcomponents=" + Static196.aBoolean279);
				return;
			}
			if (arg1.startsWith("bloom")) {
				@Pc(915) boolean local915 = Static240.aClass14_7.method6887();
				if (Static526.method7213(!local915)) {
					if (!local915) {
						Static513.method7109("Bloom enabled");
						return;
					}
					Static513.method7109("Bloom disabled");
					return;
				}
				Static513.method7109("Failed to enable bloom");
				return;
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (!Static132.aBoolean213) {
					Static132.aBoolean213 = true;
					Static513.method7109("Forced tweening ENABLED!");
					return;
				}
				Static132.aBoolean213 = false;
				Static513.method7109("Forced tweening disabled.");
				return;
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static159.aBoolean736) {
					Static513.method7109("Shift-click disabled.");
					Static159.aBoolean736 = false;
					return;
				}
				Static513.method7109("Shift-click ENABLED!");
				Static159.aBoolean736 = true;
				return;
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static513.method7109("x:" + (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 >> 9) + " z:" + (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 >> 9));
				return;
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static513.method7109("Height: " + Static133.aClass59Array3[Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108].JA(Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 >> 7, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 >> 7));
				return;
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static398.aClass251_94.method5763();
				Static398.aClass251_94.method5777();
				Static418.aClass3_4.method58();
				Static245.aClass213_3.method5130();
				Static510.method7081();
				Static513.method7109("Minimap reset");
				return;
			}
			if (arg1.startsWith("mc")) {
				if (!Static240.aClass14_7.method6836()) {
					Static513.method7109("Current toolkit doesn't support multiple cores");
					return;
				}
				local107 = Integer.parseInt(arg1.substring(3));
				if (local107 < 1) {
					local107 = 1;
				} else if (local107 > 4) {
					local107 = 4;
				}
				Static495.anInt7806 = local107;
				Static240.aClass14_7.method6905(Static495.anInt7806);
				Static240.aClass14_7.method6873(0);
				Static513.method7109("Render cores now: " + Static495.anInt7806);
				return;
			}
			if (arg1.startsWith("cachespace")) {
				Static513.method7109("I(s): " + Static187.aClass136_46.method3477() + "/" + Static187.aClass136_46.method3479());
				Static513.method7109("I(m): " + Static509.aClass136_106.method3477() + "/" + Static509.aClass136_106.method3479());
				Static513.method7109("O(s): " + Static444.aClass322_2.aClass152_1.method3992() + "/" + Static444.aClass322_2.aClass152_1.method3993());
				return;
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static513.method7109("Pos: " + Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 + "," + (Static39.anInt4952 + (Static371.anInt6572 >> 9) >> 6) + "," + ((Static322.anInt5904 >> 9) + Static138.anInt3088 >> 6) + "," + (Static39.anInt4952 + (Static371.anInt6572 >> 9) & 0x3F) + "," + ((Static322.anInt5904 >> 9) + Static138.anInt3088 & 0x3F) + " Height: " + (Static160.method2951(Static322.anInt5904, Static371.anInt6572, Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108) - Static111.anInt2160));
				Static513.method7109("Look: " + Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108 + "," + (Static190.anInt3955 + Static39.anInt4952 >> 6) + "," + (Static138.anInt3088 + Static42.anInt1021 >> 6) + "," + (Static190.anInt3955 + Static39.anInt4952 & 0x3F) + "," + (Static138.anInt3088 + Static42.anInt1021 & 0x3F) + " Height: " + (Static160.method2951(Static42.anInt1021, Static190.anInt3955, Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108) - Static48.anInt1087));
				return;
			}
			if (arg1.equals("showocc")) {
				Static449.aBoolean545 = !Static449.aBoolean545;
				Static573.method7683();
				Static513.method7109("showocc=" + Static449.aBoolean545);
				return;
			}
			if (arg1.equals("wallocc")) {
				Static398.aBoolean488 = !Static398.aBoolean488;
				Static573.method7683();
				Static513.method7109("forcewallocc=" + Static398.aBoolean488);
				return;
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static591.aBoolean735 = !Static591.aBoolean735;
				Static240.aClass14_7.method6878(Static591.aBoolean735);
				Static97.method1749();
				Static513.method7109("showprofiling=" + Static591.aBoolean735);
				return;
			}
			if (arg1.startsWith("performancetest")) {
				local107 = -1;
				local648 = 1000;
				if (arg1.length() > 15) {
					@Pc(1368) String[] local1368 = Static115.method2011(' ', arg1);
					try {
						if (local1368.length > 1) {
							local648 = Integer.parseInt(local1368[1]);
						}
					} catch (@Pc(1379) Throwable local1379) {
					}
					try {
						if (local1368.length > 2) {
							local107 = Integer.parseInt(local1368[2]);
						}
					} catch (@Pc(1390) Throwable local1390) {
					}
				}
				if (local107 != -1) {
					Static513.method7109("Performance: " + Static262.method4396(local648, Static560.anInt9242));
					return;
				}
				Static513.method7109("Java toolkit: " + Static262.method4396(local648, 0));
				Static513.method7109("SSE toolkit:  " + Static262.method4396(local648, 2));
				Static513.method7109("D3D toolkit:  " + Static262.method4396(local648, 3));
				Static513.method7109("GL toolkit:   " + Static262.method4396(local648, 1));
				Static513.method7109("GLX toolkit:  " + Static262.method4396(local648, 5));
				return;
			}
			if (arg1.equals("renderer")) {
				@Pc(1475) Class312 local1475 = Static240.aClass14_7.method6871();
				Static513.method7109("Vendor: " + local1475.anInt8309);
				Static513.method7109("Name: " + local1475.aString89);
				Static513.method7109("Version: " + local1475.anInt8307);
				Static513.method7109("Device: " + local1475.aString90);
				Static513.method7109("Driver Version: " + local1475.aLong227);
				return;
			}
			if (arg1.equals("nonpcs")) {
				Static147.aBoolean698 = !Static147.aBoolean698;
				Static513.method7109("nonpcs=" + Static147.aBoolean698);
				return;
			}
			if (arg1.equals("autoworld")) {
				Static154.method2913();
				Static513.method7109("auto world selected");
				return;
			}
			if (arg1.startsWith("switchworld")) {
				local107 = Integer.parseInt(arg1.substring(12));
				Static235.method4085(local107, Static118.method2498(local107).aString83);
				Static513.method7109("switched");
				return;
			}
			if (arg1.equals("getworld")) {
				Static513.method7109("w: " + Static316.aClass105_5.anInt3307);
				return;
			}
			@Pc(1601) Class6_Sub31 local1601;
			if (arg1.startsWith("pc")) {
				local1601 = Static114.method2007(Static228.aClass47_72, Static337.aClass324_1);
				local1601.aClass6_Sub21_Sub2_2.method6062(0);
				local648 = local1601.aClass6_Sub21_Sub2_2.anInt7338;
				local128 = arg1.indexOf(" ", 4);
				local1601.aClass6_Sub21_Sub2_2.method6022(arg1.substring(3, local128));
				Static12.method248(arg1.substring(local128), local1601.aClass6_Sub21_Sub2_2);
				local1601.aClass6_Sub21_Sub2_2.method6008(local1601.aClass6_Sub21_Sub2_2.anInt7338 - local648);
				Static534.method7251(local1601);
				return;
			}
			if (arg1.equals("heap")) {
				Static513.method7109("Heap: " + Static11.anInt321 + "MB");
				return;
			}
			if (arg1.equals("savevarcs")) {
				Static512.method7099();
				Static513.method7109("perm varcs saved");
				return;
			}
			if (arg1.equals("scramblevarcs")) {
				for (local107 = 0; local107 < Static395.anIntArray511.length; local107++) {
					if (Static165.aBooleanArray29[local107]) {
						Static395.anIntArray511[local107] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static395.anIntArray511[local107] *= -1;
						}
					}
				}
				Static512.method7099();
				Static513.method7109("perm varcs scrambled");
				return;
			}
			if (arg1.equals("showcolmap")) {
				Static542.aBoolean653 = true;
				Static510.method7081();
				Static513.method7109("colmap is shown");
				return;
			}
			if (arg1.equals("hidecolmap")) {
				Static542.aBoolean653 = false;
				Static510.method7081();
				Static513.method7109("colmap is hidden");
				return;
			}
			if (arg1.equals("resetcache")) {
				Static226.method4024();
				Static513.method7109("Caches reset");
				return;
			}
			if (arg1.equals("profilecpu")) {
				Static513.method7109(Static559.method7550() + "ms");
				return;
			}
			if (arg1.startsWith("cpuusage")) {
				local107 = Integer.parseInt(arg1.substring(9));
				if (local107 >= 0 && local107 <= 4) {
					Static140.aClass6_Sub48_Sub1_1.anInt8988 = local107;
				}
				Static513.method7109("cpuusage=" + Static140.aClass6_Sub48_Sub1_1.anInt8988);
				return;
			}
			if (arg1.startsWith("getclientvarpbit")) {
				local107 = Integer.parseInt(arg1.substring(17));
				Static513.method7109("varpbit=" + Static498.aClass101_1.method2865(local107));
				return;
			}
			if (arg1.startsWith("getclientvarp")) {
				local107 = Integer.parseInt(arg1.substring(14));
				Static513.method7109("varp=" + Static498.aClass101_1.method2866(local107));
				return;
			}
			if (arg1.startsWith("demologin")) {
				Static598.method5901(0, false);
				return;
			}
			if (arg1.startsWith("newdemologin")) {
				Static598.method5901(0, true);
				return;
			}
			if (arg1.startsWith("directlogin")) {
				@Pc(1874) String[] local1874 = Static115.method2011(' ', arg1.substring(12));
				if (local1874.length >= 2) {
					local648 = local1874.length > 2 ? Integer.parseInt(local1874[2]) : 0;
					Static332.method5171(local1874[1], local1874[0], local648);
					return;
				}
			}
			if (arg1.startsWith("csprofileclear")) {
				Static446.method6328();
				return;
			}
			if (arg1.startsWith("csprofileoutputc")) {
				Static446.method6322();
				return;
			}
			if (arg1.startsWith("csprofileoutputt")) {
				Static446.method6322();
				return;
			}
			if (arg1.startsWith("texsize")) {
				local107 = Integer.parseInt(arg1.substring(8));
				Static240.aClass14_7.method6822(local107);
				return;
			}
			if (arg1.equals("soundstreamcount")) {
				Static513.method7109("Active streams: " + Static374.aClass6_Sub18_Sub4_2.method6379());
				return;
			}
			if (arg1.equals("autosetup")) {
				Static140.aClass6_Sub48_Sub1_1.method7378();
				Static513.method7109("Complete. Toolkit now: " + Static560.anInt9242);
				return;
			}
			if (arg1.equals("errormessage")) {
				Static513.method7109(Static111.aClient1.method1347());
				return;
			}
			if (Static557.anInt9206 == 10) {
				local1601 = Static114.method2007(Static587.aClass47_154, Static337.aClass324_1);
				local1601.aClass6_Sub21_Sub2_2.method6062(arg1.length() + 3);
				local1601.aClass6_Sub21_Sub2_2.method6062(arg0 ? 1 : 0);
				local1601.aClass6_Sub21_Sub2_2.method6062(arg2 ? 1 : 0);
				local1601.aClass6_Sub21_Sub2_2.method6022(arg1);
				Static534.method7251(local1601);
			}
			if (arg1.startsWith("fps ") && Static542.aClass194_5 != Static580.aClass194_7) {
				Static540.method3559(Static444.method6313(arg1.substring(4)));
				return;
			}
			if (Static557.anInt9206 != 10) {
				Static513.method7109("Unrecogonised commmand when not logged in: " + arg1);
				return;
			}
		} catch (@Pc(2054) Exception local2054) {
			Static513.method7109("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class267 local13 = local7.aClass267_3; local13 != null; local13 = local13.aClass267_2) {
			@Pc(17) Class4_Sub1 local17 = local13.aClass4_Sub1_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort126 == arg1 && local17.aShort125 == arg2) {
				Static232.method6006(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	public static void method1223(@OriginalArg(0) int arg0) {
		if (!Static140.aClass6_Sub48_Sub1_1.aBoolean677) {
			arg0 = -1;
		}
		if (Static414.anInt7243 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class336 local26 = Static543.aClass112_2.method2956(arg0);
			@Pc(30) Class140 local30 = local26.method7317();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static352.aClass272_2.method6134(local30.method3614(), Static32.aCanvas3, new Point(local26.anInt8907, local26.anInt8910), local30.method3622(), local30.method3625());
				Static414.anInt7243 = arg0;
			}
		}
		if (arg0 == -1 && Static414.anInt7243 != -1) {
			Static352.aClass272_2.method6134(null, Static32.aCanvas3, new Point(), -1, -1);
			Static414.anInt7243 = -1;
		}
	}
}
