import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
	public static int anInt308;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "Lclient!kg;")
	public static Class4_Sub2_Sub12_Sub1 aClass4_Sub2_Sub12_Sub1_1;

	@OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
	public static int anInt313;

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
	public static int anInt307 = 0;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public static int anInt311 = -1;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "[I")
	public static int[] anIntArray33 = new int[2];

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "Z")
	public static boolean aBoolean23 = false;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
	public static int anInt314 = -1;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIB)V")
	public static void method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = Static142.method2311(arg5, Static141.anInt2889, Static171.anInt3392);
		@Pc(17) int local17 = Static142.method2311(arg4, Static141.anInt2889, Static171.anInt3392);
		@Pc(23) int local23 = Static142.method2311(arg0, Static154.anInt3126, Static211.anInt4200);
		@Pc(29) int local29 = Static142.method2311(arg2, Static154.anInt3126, Static211.anInt4200);
		@Pc(37) int local37 = Static142.method2311(arg1 + arg5, Static141.anInt2889, Static171.anInt3392);
		@Pc(46) int local46 = Static142.method2311(arg4 - arg1, Static141.anInt2889, Static171.anInt3392);
		@Pc(48) int local48;
		for (local48 = local11; local48 < local37; local48++) {
			Static129.method2127(local29, local23, arg3, Static234.anIntArrayArray40[local48]);
		}
		for (local48 = local17; local48 > local46; local48--) {
			Static129.method2127(local29, local23, arg3, Static234.anIntArrayArray40[local48]);
		}
		@Pc(99) int local99 = Static142.method2311(arg0 + arg1, Static154.anInt3126, Static211.anInt4200);
		@Pc(108) int local108 = Static142.method2311(arg2 - arg1, Static154.anInt3126, Static211.anInt4200);
		for (local48 = local37; local48 <= local46; local48++) {
			@Pc(117) int[] local117 = Static234.anIntArrayArray40[local48];
			Static129.method2127(local99, local23, arg3, local117);
			Static129.method2127(local29, local108, arg3, local117);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method274(@OriginalArg(1) String arg0) {
		if (Static176.anInt829 >= 2) {
			@Pc(20) int local20;
			@Pc(41) int local41;
			@Pc(31) Runtime local31;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static45.method709();
				for (local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				local31 = Runtime.getRuntime();
				local41 = (int) ((local31.totalMemory() - local31.freeMemory()) / 1024L);
				Static271.method4062("mem=" + local41 + "k", 0, null);
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static45.method709();
				for (local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				local31 = Runtime.getRuntime();
				local41 = (int) ((local31.totalMemory() - local31.freeMemory()) / 1024L);
				Static271.method4062("Memory before cleanup=" + local41 + "k", 0, null);
				Static241.method3697();
				Static45.method709();
				for (@Pc(103) int local103 = 0; local103 < 10; local103++) {
					System.gc();
				}
				local41 = (int) ((local31.totalMemory() - local31.freeMemory()) / 1024L);
				Static271.method4062("Memory after cleanup=" + local41 + "k", 0, null);
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static271.method4062("Number of player models in cache:" + Static236.method2948(), 0, null);
			}
			if (Static178.aBoolean216 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static163.anInt3219);
				System.out.println("oncard_2d:" + Static163.anInt3220);
				System.out.println("oncard_texture:" + Static163.anInt3221);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static278.method4129();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static103.aClass113_1.method2687();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static103.aClass113_1.method2678();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static87.aClass164_2.method3939();
				Static259.aClass158_3.method3778();
				Static103.aClass113_1.method2670();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static115.aBoolean170 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static264.method3976(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static131.aBoolean184 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static131.aBoolean184 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static82.method1277(false, 0, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static82.method1277(false, 1, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static82.method1277(false, 2, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static82.method1277(false, 3, 1024, 768);
			}
			if (arg0.startsWith("::setba")) {
				Static86.anInt1777 = Static224.method3585(arg0.substring(8));
				Static102.method1649(Static87.aClass164_2);
				Static189.aBoolean320 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static109.method1760(Static224.method3585(arg0.substring(15)));
				Static102.method1649(Static87.aClass164_2);
				Static189.aBoolean320 = false;
			}
			if (arg0.startsWith("::fps ") && Static251.anInt4743 != 0) {
				Static242.method3908(Static224.method3585(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static14.anInt2092 = Static224.method3585(arg0.substring(12).trim());
				Static271.method4062("rect_debug=" + Static14.anInt2092, 0, null);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static255.aBoolean311 = true;
			}
			if (arg0.startsWith("::hdr") && Static178.aBoolean216 && !Static140.method2283(!Static58.method942())) {
				Static271.method4062("Failed to enable hdr", 0, null);
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static112.aBoolean164) {
					Static112.aBoolean164 = false;
					Static271.method4062("Forced tweening disabled.", 0, null);
				} else {
					Static112.aBoolean164 = true;
					Static271.method4062("Forced tweening ENABLED!", 0, null);
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static86.aBoolean133) {
					System.out.println("Shift-click disabled.");
					Static86.aBoolean133 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static86.aBoolean133 = true;
				}
			}
		}
		Static142.aClass4_Sub17_Sub1_3.method1905(152);
		Static142.aClass4_Sub17_Sub1_3.method1861(arg0.length() - 1);
		Static142.aClass4_Sub17_Sub1_3.method1849(arg0.substring(2));
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method276() {
		anIntArray33 = null;
		aClass4_Sub2_Sub12_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)I")
	public static int method277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (local7 + arg0) / arg1 - local7;
	}
}
