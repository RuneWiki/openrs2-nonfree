import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!td", name = "V", descriptor = "[[S")
	public static short[][] aShortArrayArray8;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "Lclient!im;")
	public static Class82 aClass82_1 = new Class82();

	@OriginalMember(owner = "client!td", name = "W", descriptor = "I")
	public static int anInt5410 = 0;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "Lclient!cn;")
	public static Class30 aClass30_28 = new Class30(16);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4392(@OriginalArg(0) String arg0) {
		if (Static296.anInt5879 >= 2) {
			@Pc(18) int local18;
			@Pc(38) int local38;
			@Pc(29) Runtime local29;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static187.method3130();
				for (local18 = 0; local18 < 10; local18++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static199.method3284("mem=" + local38 + "k");
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static187.method3130();
				for (local18 = 0; local18 < 10; local18++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static199.method3284("Memory before cleanup=" + local38 + "k");
				Static78.method1217();
				Static187.method3130();
				for (@Pc(97) int local97 = 0; local97 < 10; local97++) {
					System.gc();
				}
				local38 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static199.method3284("Memory after cleanup=" + local38 + "k");
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static199.method3284("Number of player models in cache:" + Static148.method2519());
			}
			if (Static283.aBoolean393 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static189.anInt3718);
				System.out.println("oncard_2d:" + Static189.anInt3720);
				System.out.println("oncard_texture:" + Static189.anInt3721);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static280.method3547();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static161.aClass177_1.method4548();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static161.aClass177_1.method4536();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static274.aClass176_4.method4506();
				Static150.aClass139_3.method3550();
				Static161.aClass177_1.method4537();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static90.aBoolean137 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static264.method4398(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static95.aBoolean141 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static95.aBoolean141 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static203.method3359(-1, false, -1, 0);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static203.method3359(-1, false, -1, 1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static203.method3359(-1, false, -1, 2);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static203.method3359(768, false, 1024, 3);
			}
			if (arg0.startsWith("::setba")) {
				Static224.anInt6084 = Static218.method3603(arg0.substring(8));
				Static188.method3143(Static274.aClass176_4);
				Static239.aBoolean340 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static71.method1077(Static218.method3603(arg0.substring(15)));
				Static188.method3143(Static274.aClass176_4);
				Static239.aBoolean340 = false;
			}
			if (arg0.startsWith("::fps ") && Static252.anInt5207 != 0) {
				Static85.method1310(Static218.method3603(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static111.anInt2048 = Static218.method3603(arg0.substring(12).trim());
				Static199.method3284("rect_debug=" + Static111.anInt2048);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static244.aBoolean346 = true;
			}
			if (arg0.startsWith("::hdr") && Static283.aBoolean393 && !Static178.method2943(!Static30.method461())) {
				Static199.method3284("Failed to enable hdr");
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static146.aBoolean417) {
					Static146.aBoolean417 = false;
					Static199.method3284("Forced tweening disabled.");
				} else {
					Static146.aBoolean417 = true;
					Static199.method3284("Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static176.aBoolean234) {
					System.out.println("Shift-click disabled.");
					Static176.aBoolean234 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static176.aBoolean234 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static199.method3284("x:" + (Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7) + " z:" + (Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7) + " groundh:" + Static256.anIntArrayArrayArray14[Static99.anInt1826][Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7][Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7]);
			}
			if (arg0.equalsIgnoreCase("::getheight")) {
				Static199.method3284("Height: " + Static256.anIntArrayArrayArray14[Static99.anInt1826][Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7][Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7]);
			}
		}
		Static215.aClass3_Sub26_Sub1_2.method3958(137);
		Static215.aClass3_Sub26_Sub1_2.method3907(arg0.length() - 1);
		Static215.aClass3_Sub26_Sub1_2.method3914(arg0.substring(2));
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method4394(@OriginalArg(0) String arg0) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg0.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			local7 = Static120.method2007(arg0.charAt(local12)) + (local7 << 5) - local7;
		}
		return local7;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public static void method4395() {
		Static137.aClass98_18.method2571();
	}
}
