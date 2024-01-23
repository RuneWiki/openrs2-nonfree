import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
	public static int anInt5035;

	@OriginalMember(owner = "client!ri", name = "H", descriptor = "Lclient!kb;")
	public static Class83 aClass83_154;

	@OriginalMember(owner = "client!ri", name = "Z", descriptor = "Lclient!ug;")
	public static Class1_Sub2_Sub14 aClass1_Sub2_Sub14_7;

	@OriginalMember(owner = "client!ri", name = "gb", descriptor = "I")
	public static int anInt5072;

	@OriginalMember(owner = "client!ri", name = "ob", descriptor = "I")
	public static int anInt5078;

	@OriginalMember(owner = "client!ri", name = "zb", descriptor = "I")
	public static int anInt5088;

	@OriginalMember(owner = "client!ri", name = "pb", descriptor = "I")
	public static int anInt5079 = 10;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(III)V")
	public static void method4002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static265.anIntArray574[arg0] = arg1;
		@Pc(18) Class1_Sub21 local18 = (Class1_Sub21) Static127.aClass117_8.method3438((long) arg0);
		if (local18 == null) {
			local18 = new Class1_Sub21(4611686018427387905L);
			Static127.aClass117_8.method3445(local18, (long) arg0);
		} else if (local18.aLong106 != 4611686018427387905L) {
			local18.aLong106 = Static294.method4792() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public static int method4005(@OriginalArg(0) int arg0) {
		if (arg0 > 0) {
			return 1;
		} else if (arg0 < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4012(@OriginalArg(0) String arg0) {
		if (Static76.anInt5428 >= 2) {
			@Pc(18) int local18;
			@Pc(39) int local39;
			@Pc(29) Runtime local29;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static83.method1477();
				for (local18 = 0; local18 < 10; local18++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static89.method1540(0, null, "mem=" + local39 + "k");
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static83.method1477();
				for (local18 = 0; local18 < 10; local18++) {
					System.gc();
				}
				local29 = Runtime.getRuntime();
				local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static89.method1540(0, null, "Memory before cleanup=" + local39 + "k");
				Static193.method3434();
				Static83.method1477();
				for (@Pc(102) int local102 = 0; local102 < 10; local102++) {
					System.gc();
				}
				local39 = (int) ((local29.totalMemory() - local29.freeMemory()) / 1024L);
				Static89.method1540(0, null, "Memory after cleanup=" + local39 + "k");
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static89.method1540(0, null, "Number of player models in cache:" + Static251.method4275());
			}
			if (Static296.aBoolean335 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static237.anInt5213);
				System.out.println("oncard_2d:" + Static237.anInt5214);
				System.out.println("oncard_texture:" + Static237.anInt5215);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static104.method835();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static10.aClass42_1.method1080();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static10.aClass42_1.method1073();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static43.aClass66_1.method1602();
				Static22.aClass41_1.method1069();
				Static10.aClass42_1.method1082();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static252.aBoolean293 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static140.method2511(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static167.aBoolean196 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static167.aBoolean196 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static134.method2296(false, -1, 0, -1);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static134.method2296(false, -1, 1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static134.method2296(false, -1, 2, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static134.method2296(false, 1024, 3, 768);
			}
			if (arg0.startsWith("::setba")) {
				Static204.anInt4555 = Static267.method2723(arg0.substring(8));
				Static251.method4273(Static43.aClass66_1);
				Static134.aBoolean153 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static155.method2876(Static267.method2723(arg0.substring(15)));
				Static251.method4273(Static43.aClass66_1);
				Static134.aBoolean153 = false;
			}
			if (arg0.startsWith("::fps ") && Static105.anInt6119 != 0) {
				Static266.method4503(Static267.method2723(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static171.anInt3878 = Static267.method2723(arg0.substring(12).trim());
				Static89.method1540(0, null, "rect_debug=" + Static171.anInt3878);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static24.aBoolean27 = true;
			}
			if (arg0.startsWith("::hdr") && Static296.aBoolean335 && !Static115.method1896(!Static214.method3746())) {
				Static89.method1540(0, null, "Failed to enable hdr");
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static18.aBoolean23) {
					Static18.aBoolean23 = false;
					Static89.method1540(0, null, "Forced tweening disabled.");
				} else {
					Static18.aBoolean23 = true;
					Static89.method1540(0, null, "Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static66.aBoolean191) {
					System.out.println("Shift-click disabled.");
					Static66.aBoolean191 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static66.aBoolean191 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static89.method1540(0, null, "x:" + (Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7) + " z:" + (Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7) + " groundh:" + Static287.anIntArrayArrayArray18[Static145.anInt3477][Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7][Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7]);
			}
		}
		Static81.aClass1_Sub16_Sub1_1.method2676(169);
		Static81.aClass1_Sub16_Sub1_1.method2621(arg0.length() - 1);
		Static81.aClass1_Sub16_Sub1_1.method2630(arg0.substring(2));
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)V")
	public static void method4020() {
		Static55.method1119();
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			Static213.aClass36Array1[local4].method949();
		}
		System.gc();
	}
}
