import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	public static int anInt6607 = 100;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
	public static void method5617() {
		@Pc(5) Class26 local5 = Static91.aClass26_16;
		synchronized (Static91.aClass26_16) {
			Static91.aClass26_16.method328();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method5618(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (Static278.anInt6305 == 0 && Static248.anInt4969 < 2) {
			return;
		}
		if (arg1.equalsIgnoreCase("errortest")) {
			throw new RuntimeException();
		}
		try {
			if (arg1.equalsIgnoreCase("fpson")) {
				Static215.aBoolean293 = true;
			}
			if (arg1.equalsIgnoreCase("fpsoff")) {
				Static215.aBoolean293 = false;
			}
			if (arg1.equalsIgnoreCase("cls")) {
				Static23.anInt431 = 0;
				Static6.anInt4028 = 0;
			}
			if (arg1.equalsIgnoreCase("cleartext")) {
				Static44.aClass210_3.method5614();
			}
			@Pc(63) int local63;
			@Pc(74) Runtime local74;
			@Pc(84) int local84;
			if (arg1.equalsIgnoreCase("gc")) {
				Static131.method2024();
				for (local63 = 0; local63 < 10; local63++) {
					System.gc();
				}
				local74 = Runtime.getRuntime();
				local84 = (int) ((local74.totalMemory() - local74.freeMemory()) / 1024L);
				Static129.method1991("mem=" + local84 + "k");
			}
			if (arg1.equalsIgnoreCase("compact")) {
				Static131.method2024();
				for (local63 = 0; local63 < 10; local63++) {
					System.gc();
				}
				local74 = Runtime.getRuntime();
				local84 = (int) ((local74.totalMemory() - local74.freeMemory()) / 1024L);
				Static129.method1991("Memory before cleanup=" + local84 + "k");
				Static286.method4772();
				Static131.method2024();
				for (@Pc(139) int local139 = 0; local139 < 10; local139++) {
					System.gc();
				}
				local84 = (int) ((local74.totalMemory() - local74.freeMemory()) / 1024L);
				Static129.method1991("Memory after cleanup=" + local84 + "k");
			}
			if (arg1.equalsIgnoreCase("pcachesize")) {
				Static129.method1991("Number of player models in cache:" + Static119.method1793());
			}
			if (arg1.equalsIgnoreCase("clientdrop")) {
				if (Static245.anInt6561 == 30) {
					Static118.method1787();
				} else if (Static245.anInt6561 == 25) {
					Static314.aBoolean140 = true;
				}
			}
			if (arg1.equalsIgnoreCase("clientjs5drop")) {
				Static285.aClass172_3.method4579();
			}
			if (arg1.equalsIgnoreCase("serverjs5drop")) {
				Static285.aClass172_3.method4570();
			}
			if (arg1.equalsIgnoreCase("breakcon")) {
				Static77.aClass118_7.method2710();
				Static291.aClass156_103.method4192();
				Static285.aClass172_3.method4572();
			}
			if (arg1.equalsIgnoreCase("rebuild")) {
				Static59.method897();
				Static178.method2897();
			}
			if (arg1.equalsIgnoreCase("wm1")) {
				Static226.method4030(-1, false, 1, -1);
			}
			if (arg1.equalsIgnoreCase("wm2")) {
				Static226.method4030(-1, false, 2, -1);
			}
			if (arg1.equalsIgnoreCase("::wm3")) {
				Static226.method4030(1024, false, 3, 768);
			}
			if (arg1.equalsIgnoreCase("tk0")) {
				Static156.method2520(0);
				Static276.anInt5525 = 0;
				Static38.method553(Static77.aClass118_7);
				Static212.aBoolean292 = false;
			}
			if (arg1.equalsIgnoreCase("tk1")) {
				Static156.method2520(1);
				Static276.anInt5525 = 1;
				Static38.method553(Static77.aClass118_7);
				Static212.aBoolean292 = false;
			}
			if (arg1.equalsIgnoreCase("tk2")) {
				Static156.method2520(2);
				Static276.anInt5525 = 2;
				Static38.method553(Static77.aClass118_7);
				Static212.aBoolean292 = false;
			}
			if (arg1.equalsIgnoreCase("tk3")) {
				Static156.method2520(3);
			}
			if (arg1.equalsIgnoreCase("ot")) {
				Static107.aBoolean127 = !Static107.aBoolean127;
				Static38.method553(Static77.aClass118_7);
				Static212.aBoolean292 = false;
				Static59.method897();
			}
			if (arg1.equalsIgnoreCase("gb")) {
				Static55.aBoolean65 = !Static55.aBoolean65;
				Static38.method553(Static77.aClass118_7);
				Static212.aBoolean292 = false;
				Static59.method897();
			}
			if (arg1.startsWith("shadows ")) {
				Static103.anInt1883 = Static87.method1250(arg1.substring(8));
				Static38.method553(Static77.aClass118_7);
				Static212.aBoolean292 = false;
				Static59.method897();
			}
			if (arg1.startsWith("setba")) {
				Static344.anInt6591 = Static87.method1250(arg1.substring(6));
				Static38.method553(Static77.aClass118_7);
				Static212.aBoolean292 = false;
			}
			if (arg1.startsWith("setparticles")) {
				Static3.method14(Static87.method1250(arg1.substring(13)));
				Static38.method553(Static77.aClass118_7);
				Static212.aBoolean292 = false;
			}
			if (arg1.startsWith("fps ") && Static278.anInt6305 != 0) {
				Static128.method1981(Static87.method1250(arg1.substring(4)));
			}
			if (arg1.startsWith("rect_debug")) {
				Static204.anInt4166 = Static87.method1250(arg1.substring(10).trim());
				Static129.method1991("rect_debug=" + Static204.anInt4166);
			}
			if (arg1.equalsIgnoreCase("qa_op_test")) {
				Static332.aBoolean414 = true;
			}
			if (arg1.equalsIgnoreCase("clipcomponents")) {
				Static81.aBoolean89 = !Static81.aBoolean89;
				Static129.method1991("clipcomponents=" + Static81.aBoolean89);
			}
			if (arg1.startsWith("bloom")) {
				@Pc(458) boolean local458 = Static107.aClass129_4.method5020();
				if (!Static206.method3695(!local458)) {
					Static129.method1991("Failed to enable bloom");
				} else if (local458) {
					Static129.method1991("Bloom disabled");
				} else {
					Static129.method1991("Bloom enabled");
				}
			}
			if (arg1.equalsIgnoreCase("tween")) {
				if (Static256.aBoolean339) {
					Static256.aBoolean339 = false;
					Static129.method1991("Forced tweening disabled.");
				} else {
					Static256.aBoolean339 = true;
					Static129.method1991("Forced tweening ENABLED!");
				}
			}
			if (arg1.equalsIgnoreCase("shiftclick")) {
				if (Static204.aBoolean280) {
					Static129.method1991("Shift-click disabled.");
					Static204.aBoolean280 = false;
				} else {
					Static129.method1991("Shift-click ENABLED!");
					Static204.aBoolean280 = true;
				}
			}
			if (arg1.equalsIgnoreCase("getcgcoord")) {
				Static129.method1991("x:" + (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 >> 7) + " z:" + (Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 >> 7));
			}
			if (arg1.equalsIgnoreCase("getheight")) {
				Static129.method1991("Height: " + Static108.aClass77Array2[Static322.anInt6250].method4122(Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 >> 7, Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 >> 7));
			}
			if (arg1.equalsIgnoreCase("resetminimap")) {
				Static182.aClass144_49.method3904();
				Static182.aClass144_49.method3918();
				Static207.method3721();
				Static178.method2897();
			}
			if (arg1.startsWith("mc")) {
				if (Static107.aClass129_4.method4921()) {
					local63 = Integer.parseInt(arg1.substring(3));
					if (local63 < 1) {
						local63 = 1;
					} else if (local63 > 4) {
						local63 = 4;
					}
					Static201.anInt6770 = local63;
					Static107.aClass129_4.method4961(Static201.anInt6770);
					Static107.aClass129_4.method4953(0);
					Static129.method1991("Render cores now: " + Static201.anInt6770);
				} else {
					Static129.method1991("Current toolkit doesn't support multiple cores");
				}
			}
			if (arg1.startsWith("cachespace")) {
				Static129.method1991("I(s): " + Static141.aClass26_22.method335() + "/" + Static141.aClass26_22.method331());
				Static129.method1991("I(m): " + Static132.aClass26_21.method335() + "/" + Static132.aClass26_21.method331());
				Static129.method1991("O(s): " + Static72.aClass54_1.method926() + "/" + Static72.aClass54_1.method927());
			}
			if (arg1.equalsIgnoreCase("getcamerapos")) {
				Static129.method1991("Pos: " + Static322.anInt6250 + "," + ((Static190.anInt3870 >> 7) + Static182.anInt3662 >> 6) + "," + ((Static316.anInt6169 >> 7) + Static169.anInt6312 >> 6) + "," + (Static182.anInt3662 + (Static190.anInt3870 >> 7) & 0x3F) + "," + (Static169.anInt6312 + (Static316.anInt6169 >> 7) & 0x3F) + " Height: " + (Static168.method2721(Static190.anInt3870, Static322.anInt6250, Static316.anInt6169) - Static86.anInt1541));
				Static129.method1991("Look: " + Static322.anInt6250 + "," + (Static182.anInt3662 + Static175.anInt3452 >> 6) + "," + (Static264.anInt5402 + Static169.anInt6312 >> 6) + "," + (Static175.anInt3452 + Static182.anInt3662 & 0x3F) + "," + (Static264.anInt5402 + Static169.anInt6312 & 0x3F) + " Height: " + (Static168.method2721(Static175.anInt3452, Static322.anInt6250, Static264.anInt5402) - Static82.anInt1500));
			}
			if (arg1.equals("showocc")) {
				Static307.aBoolean318 = !Static307.aBoolean318;
				Static59.method897();
			}
			if (arg1.equals("renderprofile") || arg1.equals("rp")) {
				Static266.aBoolean355 = !Static266.aBoolean355;
				Static107.aClass129_4.method5002(Static266.aBoolean355);
				Static37.method546();
			}
			if (arg1.equals("nonpcs")) {
				Static232.aBoolean312 = !Static232.aBoolean312;
			}
			if (arg1.equals("autoworld")) {
				Static338.method5541();
			}
			if (arg1.equals("heap")) {
				Static129.method1991("Heap: " + Static355.anInt6753 + "MB");
			}
			if (arg1.equals("savevarcs")) {
				Static62.method919();
			}
			if (arg1.equals("scramblevarcs")) {
				for (local63 = 0; local63 < Static25.anIntArray516.length; local63++) {
					if (Static315.aBooleanArray25[local63]) {
						Static25.anIntArray516[local63] = (int) (Math.random() * 99999.0D);
						if (Math.random() > 0.5D) {
							Static25.anIntArray516[local63] *= -1;
						}
					}
				}
				Static62.method919();
			}
			if (arg1.equals("showcolmap")) {
				Static239.aBoolean320 = true;
				Static178.method2897();
			}
			if (arg1.equals("hidecolmap")) {
				Static239.aBoolean320 = false;
				Static178.method2897();
			}
			if (arg1.equals("resetcache")) {
				Static42.method638();
			}
			if (arg1.equals("profilecpu")) {
				Static129.method1991(Static287.method4786() + "ms");
			}
			if (arg1.startsWith("cpuusage")) {
				local63 = Integer.parseInt(arg1.substring(9));
				if (local63 >= 0 && local63 <= 4) {
					Static150.anInt2727 = local63;
				}
			}
			if (Static245.anInt6561 == 30) {
				Static313.aClass11_Sub25_Sub1_5.method2454(165);
				Static313.aClass11_Sub25_Sub1_5.method5186(arg1.length() + 2);
				Static313.aClass11_Sub25_Sub1_5.method5186(arg0 ? 1 : 0);
				Static313.aClass11_Sub25_Sub1_5.method5173(arg1);
				return;
			}
		} catch (@Pc(995) Exception local995) {
			Static129.method1991("Whoops, something went wrong.");
			return;
		}
	}
}
