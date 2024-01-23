import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!of", name = "W", descriptor = "I")
	public static int anInt3815;

	@OriginalMember(owner = "client!of", name = "Z", descriptor = "Lclient!gl;")
	public static Class4_Sub3_Sub5 aClass4_Sub3_Sub5_2;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V")
	public static void method3193() {
		Static263.aClass26_53.method511();
		Static294.aClass26_49.method511();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3198(@OriginalArg(1) String arg0) {
		if (Static133.anInt2576 >= 2) {
			@Pc(20) int local20;
			@Pc(38) int local38;
			@Pc(29) Runtime local29;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static198.method4746();
				for (local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static186.method4394(null, 0, "mem=" + local38 + "k");
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static198.method4746();
				for (local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static186.method4394(null, 0, "Memory before cleanup=" + local38 + "k");
				Static160.method2580();
				Static198.method4746();
				for (@Pc(99) int local99 = 0; local99 < 10; local99++) {
					System.gc();
				}
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static186.method4394(null, 0, "Memory after cleanup=" + local38 + "k");
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static186.method4394(null, 0, "Number of player models in cache:" + Static75.method1228());
			}
			if (Static94.aBoolean138 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static173.anInt3331);
				System.out.println("oncard_2d:" + Static173.anInt3333);
				System.out.println("oncard_texture:" + Static173.anInt3330);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static154.method2462();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static288.aClass51_2.method1090();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static288.aClass51_2.method1081();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static276.aClass139_4.method3512();
				Static134.aClass52_7.method1104();
				Static288.aClass51_2.method1086();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static20.aBoolean18 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static15.method233(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static132.aBoolean176 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static132.aBoolean176 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static285.method4549(false, 0, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static285.method4549(false, 1, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static285.method4549(false, 2, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static285.method4549(false, 3, 1024, 768);
			}
			if (arg0.startsWith("::setba")) {
				Static222.anInt4292 = Static47.method737(arg0.substring(8));
				Static66.method1055(Static276.aClass139_4);
				Static78.aBoolean104 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static184.method2970(Static47.method737(arg0.substring(15)));
				Static66.method1055(Static276.aClass139_4);
				Static78.aBoolean104 = false;
			}
			if (arg0.startsWith("::fps ") && Static166.anInt3406 != 0) {
				Static311.method4819(Static47.method737(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static18.anInt268 = Static47.method737(arg0.substring(12).trim());
				Static186.method4394(null, 0, "rect_debug=" + Static18.anInt268);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static27.aBoolean26 = true;
			}
			if (arg0.startsWith("::hdr") && Static94.aBoolean138 && !Static22.method300(!Static53.method881())) {
				Static186.method4394(null, 0, "Failed to enable hdr");
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static269.aBoolean258) {
					Static269.aBoolean258 = false;
					Static186.method4394(null, 0, "Forced tweening disabled.");
				} else {
					Static269.aBoolean258 = true;
					Static186.method4394(null, 0, "Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static60.aBoolean68) {
					System.out.println("Shift-click disabled.");
					Static60.aBoolean68 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static60.aBoolean68 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static186.method4394(null, 0, "x:" + (Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7) + " z:" + (Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7) + " groundh:" + Static243.anIntArrayArrayArray13[Static281.anInt5335][Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7][Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7]);
			}
			if (arg0.equalsIgnoreCase("::getheight")) {
				Static186.method4394(null, 0, "Height: " + Static243.anIntArrayArrayArray13[Static281.anInt5335][Static154.aClass53_Sub1_Sub1_2.anInt3974 >> 7][Static154.aClass53_Sub1_Sub1_2.anInt4002 >> 7]);
			}
		}
		Static110.aClass4_Sub10_Sub1_1.method4687(216);
		Static110.aClass4_Sub10_Sub1_1.method4618(arg0.length() - 1);
		Static110.aClass4_Sub10_Sub1_1.method4612(arg0.substring(2));
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(III)V")
	public static void method3199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static73.aBoolean101 = true;
		Static195.anInt3715 = arg0;
		Static22.anInt315 = arg1;
		Static305.anInt5807 = arg2;
		Static32.anInt528 = -1;
		Static28.anInt420 = -1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)Lclient!fe;")
	public static Class56_Sub1 method3200() {
		@Pc(21) Class56_Sub1 local21 = new Class56_Sub1(Static47.anInt889, Static105.anInt2162, Static195.anIntArray402[0], Static187.anIntArray391[0], Static110.anIntArray185[0], Static301.anIntArray643[0], Static230.aByteArrayArray36[0], Static58.anIntArray85);
		Static304.method4707();
		return local21;
	}
}
