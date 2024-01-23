import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "[I")
	public static int[] anIntArray523;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public static int anInt6127 = 0;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[J")
	public static long[] aLongArray25 = new long[200];

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
	public static int anInt6137 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method4880() {
		if (Static219.aBoolean385) {
			return;
		}
		Static230.aBoolean329 = true;
		if (Static236.aBoolean408) {
			Static142.aFloat31 = (int) Static142.aFloat31 + 191 & 0xFFFFFF80;
		} else {
			Static21.aFloat3 += (24.0F - Static21.aFloat3) / 2.0F;
		}
		Static219.aBoolean385 = true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Lclient!dd;")
	public static Class37 method4882(@OriginalArg(1) int arg0) {
		@Pc(16) Class37 local16 = (Class37) Static11.aClass46_4.method1074((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Static89.aClass84_38.method2127(arg0, 30);
		local16 = new Class37();
		if (local28 != null) {
			local16.method834(arg0, new Class2_Sub26(local28));
		}
		Static11.aClass46_4.method1071(local16, (long) arg0);
		return local16;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lclient!l;")
	public static Class2_Sub3_Sub13 method4883(@OriginalArg(0) int arg0) {
		@Pc(15) Class2_Sub3_Sub13 local15 = (Class2_Sub3_Sub13) Static148.aClass46_26.method1074((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static230.method3098(Static10.aClass84_6, Static95.aClass84_40, arg0);
		if (local15 != null) {
			Static148.aClass46_26.method1071(local15, (long) arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!vl;)V")
	public static void method4884(@OriginalArg(1) Class177 arg0) {
		@Pc(7) Class110 local7 = null;
		try {
			@Pc(12) Class28 local12 = arg0.method4685("runescape");
			while (local12.anInt726 == 0) {
				Static134.method2329(1L);
			}
			if (local12.anInt726 == 1) {
				local7 = (Class110) local12.anObject2;
				@Pc(34) Class2_Sub26 local34 = Static273.method4568();
				local7.method2683(local34.anInt5328, local34.aByteArray72, 0);
			}
		} catch (@Pc(50) Exception local50) {
		}
		try {
			if (local7 != null) {
				local7.method2681();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)Z")
	public static boolean method4885() {
		return Static60.aBoolean106 ? true : Static124.aBoolean208;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4887(@OriginalArg(0) String arg0) {
		if (Static189.anInt3958 >= 2) {
			@Pc(20) int local20;
			@Pc(39) int local39;
			@Pc(29) Runtime local29;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static35.method700();
				for (local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static173.method2979(null, "mem=" + local39 + "k", 0);
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static35.method700();
				for (local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static173.method2979(null, "Memory before cleanup=" + local39 + "k", 0);
				method4888();
				Static35.method700();
				for (@Pc(103) int local103 = 0; local103 < 10; local103++) {
					System.gc();
				}
				local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static173.method2979(null, "Memory after cleanup=" + local39 + "k", 0);
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static173.method2979(null, "Number of player models in cache:" + Static190.method3491(), 0);
			}
			if (Static60.aBoolean106 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static256.anInt5187);
				System.out.println("oncard_2d:" + Static256.anInt5186);
				System.out.println("oncard_texture:" + Static256.anInt5188);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static75.method1375();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static139.aClass78_2.method1959();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static139.aClass78_2.method1958();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static299.aClass177_5.method4671();
				Static42.aClass45_1.method1042();
				Static139.aClass78_2.method1960();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static52.aBoolean89 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static21.method453(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static173.aBoolean307 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static173.aBoolean307 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static190.method3495(-1, 0, false, -1);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static190.method3495(-1, 1, false, -1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static190.method3495(-1, 2, false, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static190.method3495(1024, 3, false, 768);
			}
			if (arg0.startsWith("::setba")) {
				Static171.anInt3648 = Static285.method4727(arg0.substring(8));
				method4884(Static299.aClass177_5);
				Static278.aBoolean468 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static179.method3100(Static285.method4727(arg0.substring(15)));
				method4884(Static299.aClass177_5);
				Static278.aBoolean468 = false;
			}
			if (arg0.startsWith("::fps ") && Static7.anInt237 != 0) {
				Static202.method3407(Static285.method4727(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static219.anInt4589 = Static285.method4727(arg0.substring(12).trim());
				Static173.method2979(null, "rect_debug=" + Static219.anInt4589, 0);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static202.aBoolean348 = true;
			}
			if (arg0.startsWith("::hdr") && Static60.aBoolean106 && !Static42.method827(!Static276.method4597())) {
				Static173.method2979(null, "Failed to enable hdr", 0);
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static176.aBoolean324) {
					Static176.aBoolean324 = false;
					Static173.method2979(null, "Forced tweening disabled.", 0);
				} else {
					Static176.aBoolean324 = true;
					Static173.method2979(null, "Forced tweening ENABLED!", 0);
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static42.aBoolean74) {
					System.out.println("Shift-click disabled.");
					Static42.aBoolean74 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static42.aBoolean74 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static173.method2979(null, "x:" + (Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7) + " z:" + (Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7) + " groundh:" + Static141.anIntArrayArrayArray4[Static208.anInt4335][Static111.aClass36_Sub3_Sub2_1.anInt5093 >> 7][Static111.aClass36_Sub3_Sub2_1.anInt5109 >> 7], 0);
			}
		}
		Static95.aClass2_Sub26_Sub1_1.method4287(224);
		Static95.aClass2_Sub26_Sub1_1.method4239(arg0.length() - 1);
		Static95.aClass2_Sub26_Sub1_1.method4253(arg0.substring(2));
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method4888() {
		if (!Static60.aBoolean106 || Static122.aBoolean200) {
			return;
		}
		@Pc(17) Class2_Sub31[][][] local17 = Static180.aClass2_Sub31ArrayArrayArray2;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(31) Class2_Sub31[][] local31 = local17[local19];
			for (@Pc(33) int local33 = 0; local33 < local31.length; local33++) {
				for (@Pc(39) int local39 = 0; local39 < local31[local33].length; local39++) {
					@Pc(51) Class2_Sub31 local51 = local31[local33][local39];
					if (local51 != null) {
						@Pc(69) Class36_Sub2_Sub1 local69;
						if (local51.aClass65_1 != null && local51.aClass65_1.aClass36_5 instanceof Class36_Sub2_Sub1) {
							local69 = (Class36_Sub2_Sub1) local51.aClass65_1.aClass36_5;
							if ((local51.aClass65_1.aLong104 & Long.MIN_VALUE) == 0L) {
								local69.method947(false, true, true, false, true, true);
							} else {
								local69.method947(true, true, true, true, true, true);
							}
						}
						if (local51.aClass50_1 != null) {
							if (local51.aClass50_1.aClass36_3 instanceof Class36_Sub2_Sub1) {
								local69 = (Class36_Sub2_Sub1) local51.aClass50_1.aClass36_3;
								if ((local51.aClass50_1.aLong65 & Long.MIN_VALUE) == 0L) {
									local69.method947(false, true, true, false, true, true);
								} else {
									local69.method947(true, true, true, true, true, true);
								}
							}
							if (local51.aClass50_1.aClass36_2 instanceof Class36_Sub2_Sub1) {
								local69 = (Class36_Sub2_Sub1) local51.aClass50_1.aClass36_2;
								if ((Long.MIN_VALUE & local51.aClass50_1.aLong65) == 0L) {
									local69.method947(false, true, true, false, true, true);
								} else {
									local69.method947(true, true, true, true, true, true);
								}
							}
						}
						if (local51.aClass168_1 != null) {
							if (local51.aClass168_1.aClass36_10 instanceof Class36_Sub2_Sub1) {
								local69 = (Class36_Sub2_Sub1) local51.aClass168_1.aClass36_10;
								if ((Long.MIN_VALUE & local51.aClass168_1.aLong268) == 0L) {
									local69.method947(false, true, true, false, true, true);
								} else {
									local69.method947(true, true, true, true, true, true);
								}
							}
							if (local51.aClass168_1.aClass36_9 instanceof Class36_Sub2_Sub1) {
								local69 = (Class36_Sub2_Sub1) local51.aClass168_1.aClass36_9;
								if ((local51.aClass168_1.aLong268 & Long.MIN_VALUE) == 0L) {
									local69.method947(false, true, true, false, true, true);
								} else {
									local69.method947(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(264) int local264 = 0; local264 < local51.anInt5708; local264++) {
							if (local51.aClass34Array2[local264].aClass36_1 instanceof Class36_Sub2_Sub1) {
								@Pc(282) Class36_Sub2_Sub1 local282 = (Class36_Sub2_Sub1) local51.aClass34Array2[local264].aClass36_1;
								if ((local51.aClass34Array2[local264].aLong49 & Long.MIN_VALUE) == 0L) {
									local282.method947(false, true, true, false, true, true);
								} else {
									local282.method947(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static122.aBoolean200 = true;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
	public static void method4890() {
		if (Static43.aBoolean75) {
			return;
		}
		Static230.aBoolean329 = true;
		if (Static236.aBoolean408) {
			Static198.aFloat41 = (int) Static198.aFloat41 - 17 & 0xFFFFFFF0;
		} else {
			Static188.aFloat39 += (-12.0F - Static188.aFloat39) / 2.0F;
		}
		Static43.aBoolean75 = true;
	}
}
