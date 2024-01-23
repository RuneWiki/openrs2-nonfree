import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	public static int anInt283;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "[I")
	public static int[] anIntArray8;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "I")
	public static int anInt286;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!nb;")
	public static Class111 aClass111_1 = new Class111(64);

	@OriginalMember(owner = "client!al", name = "g", descriptor = "F")
	public static float aFloat9 = 0.0F;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method232(@OriginalArg(0) String arg0) {
		if (Static191.anInt3873 >= 2) {
			@Pc(17) int local17;
			@Pc(36) int local36;
			@Pc(26) Runtime local26;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static189.method4540();
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				local26 = Runtime.getRuntime();
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static173.method2811(0, "mem=" + local36 + "k", null);
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static189.method4540();
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				local26 = Runtime.getRuntime();
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static173.method2811(0, "Memory before cleanup=" + local36 + "k", null);
				Static173.method2812();
				Static189.method4540();
				for (@Pc(99) int local99 = 0; local99 < 10; local99++) {
					System.gc();
				}
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static173.method2811(0, "Memory after cleanup=" + local36 + "k", null);
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static173.method2811(0, "Number of player models in cache:" + Static100.method1657(), null);
			}
			if (Static251.aBoolean330 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static239.anInt4727);
				System.out.println("oncard_2d:" + Static239.anInt4725);
				System.out.println("oncard_texture:" + Static239.anInt4728);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static63.method1164();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static82.aClass70_2.method1830();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static82.aClass70_2.method1840();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static95.aClass184_3.method4612();
				Static261.aClass91_3.method2301();
				Static82.aClass70_2.method1843();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static66.aBoolean338 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static123.method2035(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static262.aBoolean344 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static262.aBoolean344 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static112.method1885(false, 0, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static112.method1885(false, 1, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static112.method1885(false, 2, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static112.method1885(false, 3, 1024, 768);
			}
			if (arg0.startsWith("::setba")) {
				Static230.anInt4613 = Static113.method1907(arg0.substring(8));
				Static204.method3268(Static95.aClass184_3);
				Static136.aBoolean173 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static117.method1978(Static113.method1907(arg0.substring(15)));
				Static204.method3268(Static95.aClass184_3);
				Static136.aBoolean173 = false;
			}
			if (arg0.startsWith("::fps ") && Static74.anInt1511 != 0) {
				Static194.method3180(Static113.method1907(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static20.anInt2891 = Static113.method1907(arg0.substring(12).trim());
				Static173.method2811(0, "rect_debug=" + Static20.anInt2891, null);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static14.aBoolean26 = true;
			}
			if (arg0.startsWith("::hdr") && Static251.aBoolean330 && !Static214.method4431(!Static281.method4369())) {
				Static173.method2811(0, "Failed to enable hdr", null);
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static230.aBoolean289) {
					Static230.aBoolean289 = false;
					Static173.method2811(0, "Forced tweening disabled.", null);
				} else {
					Static230.aBoolean289 = true;
					Static173.method2811(0, "Forced tweening ENABLED!", null);
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static168.aBoolean217) {
					System.out.println("Shift-click disabled.");
					Static168.aBoolean217 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static168.aBoolean217 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static173.method2811(0, "x:" + (Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7) + " z:" + (Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7) + " groundh:" + Static154.anIntArrayArrayArray5[Static222.anInt4467][Static72.aClass13_Sub5_Sub1_1.anInt5334 >> 7][Static72.aClass13_Sub5_Sub1_1.anInt5294 >> 7], null);
			}
		}
		Static175.aClass4_Sub24_Sub1_1.method3123(242);
		Static175.aClass4_Sub24_Sub1_1.method3116(arg0.length() - 1);
		Static175.aClass4_Sub24_Sub1_1.method3095(arg0.substring(2));
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Lclient!ti;")
	public static Class4_Sub2_Sub9_Sub2 method233(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub2_Sub9_Sub2 local10 = (Class4_Sub2_Sub9_Sub2) Static246.aClass172_40.method4347((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static292.aClass22_102.method665(arg0, 0);
		local10 = new Class4_Sub2_Sub9_Sub2(local20);
		local10.method4107(Static303.aClass58Array5, null);
		Static246.aClass172_40.method4345(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!cg;IZI)Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2 method234(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static225.method3549(arg2, arg0, arg1) ? Static225.method3546() : null;
	}
}
