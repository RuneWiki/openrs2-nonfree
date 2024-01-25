import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!bj", name = "y", descriptor = "Lclient!th;")
	public static Class188 aClass188_1;

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	public static int anInt501 = 0;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method731(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(14) int local14 = arg0.indexOf(arg2); local14 != -1; local14 = arg0.indexOf(arg2, arg1.length() + local14)) {
			arg0 = arg0.substring(0, local14) + arg1 + arg0.substring(local14 + arg2.length());
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZIII)I")
	public static int method734(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 >= arg2) {
			return arg0 < arg1 ? arg0 : arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)V")
	public static void method735() {
		if (Static267.anIntArray400 != null) {
			return;
		}
		Static267.anIntArray400 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(41) double local41 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(79) double local79;
				if (local59 < 0.5D) {
					local79 = local59 * (local52 + 1.0D);
				} else {
					local79 = local59 + local52 - local52 * local59;
				}
				@Pc(95) double local95 = local59 * 2.0D - local79;
				@Pc(99) double local99 = local41 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local41 - 0.3333333333333333D;
				if (local99 * 6.0D < 1.0D) {
					local61 = (local79 - local95) * 6.0D * local99 + local95;
				} else if (local99 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local99 * 3.0D < 2.0D) {
					local61 = local95 + (0.6666666666666666D - local99) * 6.0D * (local79 - local95);
				} else {
					local61 = local95;
				}
				if (local113 < 0.0D) {
					local113++;
				}
				if (local41 * 6.0D < 1.0D) {
					local63 = (local79 - local95) * 6.0D * local41 + local95;
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = (local79 - local95) * (0.6666666666666666D - local41) * 6.0D + local95;
				} else {
					local63 = local95;
				}
				if (local113 * 6.0D < 1.0D) {
					local65 = local95 + (local79 - local95) * 6.0D * local113;
				} else if (local113 * 2.0D < 1.0D) {
					local65 = local79;
				} else if (local113 * 3.0D < 2.0D) {
					local65 = local95 + (local79 - local95) * (-local113 + 0.6666666666666666D) * 6.0D;
				} else {
					local65 = local95;
				}
			}
			local61 = Math.pow(local61, local20);
			local63 = Math.pow(local63, local20);
			local65 = Math.pow(local65, local20);
			@Pc(294) int local294 = (int) (local61 * 256.0D);
			@Pc(299) int local299 = (int) (local63 * 256.0D);
			@Pc(304) int local304 = (int) (local65 * 256.0D);
			@Pc(314) int local314 = local304 + (local294 << 16) + (local299 << 8);
			Static267.anIntArray400[local22] = local314;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
	public static void method736(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (Static183.anInt3622 == 0 && Static295.anInt5969 < 2) {
			return;
		}
		if (arg0.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg0.equalsIgnoreCase("fpson")) {
				Static147.aBoolean25 = true;
			}
			if (arg0.equalsIgnoreCase("fpsoff")) {
				Static147.aBoolean25 = false;
			}
			if (arg0.equalsIgnoreCase("cls")) {
				Static324.anInt6551 = 0;
				Static235.anInt4515 = 0;
			}
			if (arg0.equalsIgnoreCase("cleartext")) {
				Static31.aClass67_4.method2097();
			}
			@Pc(62) int local62;
			@Pc(73) Runtime local73;
			@Pc(83) int local83;
			if (arg0.equalsIgnoreCase("gc")) {
				Static277.method5032();
				for (local62 = 0; local62 < 10; local62++) {
					System.gc();
				}
				local73 = Runtime.getRuntime();
				local83 = (int) ((local73.totalMemory() - local73.freeMemory()) / 1024L);
				Static261.method4670("mem=" + local83 + "k");
			}
			if (arg0.equalsIgnoreCase("compact")) {
				Static277.method5032();
				for (local62 = 0; local62 < 10; local62++) {
					System.gc();
				}
				local73 = Runtime.getRuntime();
				local83 = (int) ((local73.totalMemory() - local73.freeMemory()) / 1024L);
				Static261.method4670("Memory before cleanup=" + local83 + "k");
				Static104.method4930();
				Static277.method5032();
				for (@Pc(140) int local140 = 0; local140 < 10; local140++) {
					System.gc();
				}
				local83 = (int) ((local73.totalMemory() - local73.freeMemory()) / 1024L);
				Static261.method4670("Memory after cleanup=" + local83 + "k");
			}
			if (arg0.equalsIgnoreCase("pcachesize")) {
				Static261.method4670("Number of player models in cache:" + Static256.method4641());
			}
			if (arg0.equalsIgnoreCase("clientdrop")) {
				if (Static263.anInt5396 == 30) {
					Static55.method4438();
				} else if (Static263.anInt5396 == 25) {
					Static210.aBoolean362 = true;
				}
			}
			if (arg0.equalsIgnoreCase("clientjs5drop")) {
				Static193.aClass165_1.method4803();
			}
			if (arg0.equalsIgnoreCase("serverjs5drop")) {
				Static193.aClass165_1.method4806();
			}
			if (arg0.equalsIgnoreCase("breakcon")) {
				Static177.aClass168_2.method4853();
				Static157.aClass173_1.method5025();
				Static193.aClass165_1.method4795();
			}
			if (arg0.equalsIgnoreCase("rebuild")) {
				Static280.method5070();
				Static10.method373();
			}
			if (arg0.equalsIgnoreCase("wm1")) {
				Static46.method1099(1, false, -1, -1);
			}
			if (arg0.equalsIgnoreCase("wm2")) {
				Static46.method1099(2, false, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static46.method1099(3, false, 768, 1024);
			}
			if (arg0.equalsIgnoreCase("tk0")) {
				Static291.method5166(0);
				Static84.anInt1829 = 0;
				Static106.method2337(Static177.aClass168_2);
				Static235.aBoolean413 = false;
			}
			if (arg0.equalsIgnoreCase("tk1")) {
				Static291.method5166(1);
				Static84.anInt1829 = 1;
				Static106.method2337(Static177.aClass168_2);
				Static235.aBoolean413 = false;
			}
			if (arg0.equalsIgnoreCase("tk2")) {
				Static291.method5166(2);
				Static84.anInt1829 = 2;
				Static106.method2337(Static177.aClass168_2);
				Static235.aBoolean413 = false;
			}
			if (arg0.equalsIgnoreCase("tk3")) {
				Static291.method5166(3);
			}
			if (arg0.equalsIgnoreCase("ot")) {
				Static315.aBoolean563 = !Static315.aBoolean563;
				Static106.method2337(Static177.aClass168_2);
				Static235.aBoolean413 = false;
				Static280.method5070();
			}
			if (arg0.equalsIgnoreCase("gb")) {
				Static32.aBoolean70 = !Static32.aBoolean70;
				Static106.method2337(Static177.aClass168_2);
				Static235.aBoolean413 = false;
				Static280.method5070();
			}
			if (arg0.startsWith("shadows ")) {
				Static322.anInt6490 = Static133.method2671(arg0.substring(8));
				Static106.method2337(Static177.aClass168_2);
				Static235.aBoolean413 = false;
				Static280.method5070();
			}
			if (arg0.startsWith("setba")) {
				Static114.anInt6585 = Static133.method2671(arg0.substring(6));
				Static106.method2337(Static177.aClass168_2);
				Static235.aBoolean413 = false;
			}
			if (arg0.startsWith("setparticles")) {
				Static341.method5888(Static133.method2671(arg0.substring(13)));
				Static106.method2337(Static177.aClass168_2);
				Static235.aBoolean413 = false;
			}
			if (arg0.startsWith("fps ") && Static183.anInt3622 != 0) {
				Static98.method2192(Static133.method2671(arg0.substring(4)));
			}
			if (arg0.startsWith("rect_debug")) {
				Static280.anInt5692 = Static133.method2671(arg0.substring(10).trim());
				Static261.method4670("rect_debug=" + Static280.anInt5692);
			}
			if (arg0.equalsIgnoreCase("qa_op_test")) {
				Static300.aBoolean520 = true;
			}
			if (arg0.equalsIgnoreCase("clipcomponents")) {
				Static44.aBoolean94 = !Static44.aBoolean94;
				Static261.method4670("clipcomponents=" + Static44.aBoolean94);
			}
			if (arg0.startsWith("bloom")) {
				@Pc(469) boolean local469 = Static147.aClass4_2.method4240();
				if (!Static327.method5744(!local469)) {
					Static261.method4670("Failed to enable bloom");
				} else if (local469) {
					Static261.method4670("Bloom disabled");
				} else {
					Static261.method4670("Bloom enabled");
				}
			}
			if (arg0.equalsIgnoreCase("tween")) {
				if (Static70.aBoolean144) {
					Static70.aBoolean144 = false;
					Static261.method4670("Forced tweening disabled.");
				} else {
					Static70.aBoolean144 = true;
					Static261.method4670("Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("shiftclick")) {
				if (Static296.aBoolean536) {
					Static261.method4670("Shift-click disabled.");
					Static296.aBoolean536 = false;
				} else {
					Static261.method4670("Shift-click ENABLED!");
					Static296.aBoolean536 = true;
				}
			}
			if (arg0.equalsIgnoreCase("getcgcoord")) {
				Static261.method4670("x:" + (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 >> 7) + " z:" + (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 >> 7));
			}
			if (arg0.equalsIgnoreCase("getheight")) {
				Static261.method4670("Height: " + Static301.aClass73Array31[Static182.anInt3603].method4931(Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 >> 7, Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 >> 7));
			}
			if (arg0.equalsIgnoreCase("resetminimap")) {
				Static59.aClass191_35.method5445();
				Static59.aClass191_35.method5432();
				Static149.method2894();
				Static10.method373();
			}
			if (arg0.startsWith("mc")) {
				if (Static147.aClass4_2.method4290()) {
					local62 = Integer.parseInt(arg0.substring(3));
					if (local62 < 1) {
						local62 = 1;
					} else if (local62 > 4) {
						local62 = 4;
					}
					Static30.anInt553 = local62;
					Static147.aClass4_2.method4267(Static30.anInt553);
					Static147.aClass4_2.method4217(0);
					Static261.method4670("Render cores now: " + Static30.anInt553);
				} else {
					Static261.method4670("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg0.startsWith("cachespace")) {
				Static261.method4670("I(s): " + Static110.aClass119_72.method3310() + "/" + Static110.aClass119_72.method3306());
				Static261.method4670("I(m): " + Static250.aClass119_154.method3310() + "/" + Static250.aClass119_154.method3306());
				Static261.method4670("O(s): " + Static129.aClass148_1.method4064() + "/" + Static129.aClass148_1.method4065());
			}
			if (arg0.equalsIgnoreCase("getcamerapos")) {
				Static261.method4670("Pos: " + Static182.anInt3603 + "," + ((Static287.anInt5819 >> 7) + Static138.anInt2879 >> 6) + "," + ((Static290.anInt5837 >> 7) + Static342.anInt6864 >> 6) + "," + (Static138.anInt2879 + (Static287.anInt5819 >> 7) & 0x3F) + "," + (Static342.anInt6864 + (Static290.anInt5837 >> 7) & 0x3F) + " Height: " + (Static138.method2745(Static182.anInt3603, Static287.anInt5819, Static290.anInt5837) - Static163.anInt1495));
				Static261.method4670("Look: " + Static182.anInt3603 + "," + (Static138.anInt2879 + Static337.anInt6720 >> 6) + "," + (Static342.anInt6864 + Static149.anInt3053 >> 6) + "," + (Static337.anInt6720 + Static138.anInt2879 & 0x3F) + "," + (Static342.anInt6864 + Static149.anInt3053 & 0x3F) + " Height: " + (Static138.method2745(Static182.anInt3603, Static337.anInt6720, Static149.anInt3053) - Static289.anInt5821));
			}
			if (arg0.equals("showocc")) {
				Static220.aBoolean377 = !Static220.aBoolean377;
				Static280.method5070();
			}
			if (arg0.equals("renderprofile") || arg0.equals("rp")) {
				Static166.aBoolean299 = !Static166.aBoolean299;
				Static147.aClass4_2.method4218(Static166.aBoolean299);
				Static357.method6006();
			}
			if (arg0.equals("nonpcs")) {
				Static31.aBoolean67 = !Static31.aBoolean67;
			}
			if (arg0.equals("autoworld")) {
				Static99.method2236();
			}
			if (arg0.equals("heap")) {
				Static261.method4670("Heap: " + Static339.anInt6736 + "MB");
			}
			if (arg0.equals("savevarcs")) {
				Static153.method2951();
			}
			if (arg0.equals("scramblevarcs")) {
				for (local62 = 0; local62 < Static31.anIntArray37.length; local62++) {
					if (Static5.aBooleanArray23[local62]) {
						Static31.anIntArray37[local62] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static31.anIntArray37[local62] *= -1;
						}
					}
				}
				Static153.method2951();
			}
			if (arg0.equals("showcolmap")) {
				Static183.aBoolean319 = true;
				Static10.method373();
			}
			if (arg0.equals("hidecolmap")) {
				Static183.aBoolean319 = false;
				Static10.method373();
			}
			if (arg0.equals("resetcache")) {
				Static224.method3940();
			}
			if (arg0.equals("profilecpu")) {
				Static261.method4670(Static336.method5827() + "ms");
			}
			if (arg0.startsWith("cpuusage")) {
				local62 = Integer.parseInt(arg0.substring(9));
				if (local62 >= 0 && local62 <= 4) {
					Static349.anInt6923 = local62;
				}
			}
			if (Static263.anInt5396 == 30) {
				Static74.aClass2_Sub10_Sub1_2.method2049(113);
				Static74.aClass2_Sub10_Sub1_2.method4430(arg0.length() + 2);
				Static74.aClass2_Sub10_Sub1_2.method4430(arg1 ? 1 : 0);
				Static74.aClass2_Sub10_Sub1_2.method4443(arg0);
				return;
			}
		} catch (@Pc(1014) Exception local1014) {
			Static261.method4670("Whoops, something went wrong.");
			return;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!qr;B)I")
	public static int method737(@OriginalArg(0) Class62_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) int local8 = arg0.anInt5380;
		@Pc(12) Class180 local12 = arg0.method4775();
		if (arg0.aBoolean484) {
			local8 = arg0.anInt5386;
		} else if (local12.anInt5767 == arg0.anInt5347 || arg0.anInt5347 == local12.anInt5755 || arg0.anInt5347 == local12.anInt5762 || arg0.anInt5347 == local12.anInt5773) {
			local8 = arg0.anInt5390;
		} else if (arg0.anInt5347 == local12.anInt5728 || local12.anInt5754 == arg0.anInt5347 || arg0.anInt5347 == local12.anInt5746 || arg0.anInt5347 == local12.anInt5744) {
			local8 = arg0.anInt5394;
		}
		return local8;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BII)V")
	public static void method738(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static133.anIntArray238[arg0] = arg1;
		@Pc(23) Class2_Sub30 local23 = (Class2_Sub30) Static23.aClass199_2.method5751((long) arg0);
		if (local23 == null) {
			local23 = new Class2_Sub30(Static51.method1197() + 500L);
			Static23.aClass199_2.method5749(local23, (long) arg0);
		} else {
			local23.aLong125 = Static51.method1197() + 500L;
		}
	}
}
