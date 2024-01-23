import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!co", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString322 = "Ok";

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	public static int anInt5327 = 0;

	@OriginalMember(owner = "client!co", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString323 = "flash2:";

	@OriginalMember(owner = "client!co", name = "m", descriptor = "I")
	public static int anInt5334 = -1;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4536(@OriginalArg(1) String arg0) {
		if (Static137.anInt2751 >= 2) {
			@Pc(19) int local19;
			@Pc(39) int local39;
			@Pc(30) Runtime local30;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static95.method1736();
				for (local19 = 0; local19 < 10; local19++) {
					System.gc();
				}
				local30 = Runtime.getRuntime();
				local39 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
				Static243.method4744("mem=" + local39 + "k", 0, null);
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static95.method1736();
				for (local19 = 0; local19 < 10; local19++) {
					System.gc();
				}
				local30 = Runtime.getRuntime();
				local39 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
				Static243.method4744("Memory before cleanup=" + local39 + "k", 0, null);
				Static105.method1210();
				Static95.method1736();
				for (@Pc(100) int local100 = 0; local100 < 10; local100++) {
					System.gc();
				}
				local39 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
				Static243.method4744("Memory after cleanup=" + local39 + "k", 0, null);
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static243.method4744("Number of player models in cache:" + Static41.method743(), 0, null);
			}
			if (Static156.aBoolean211 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static10.anInt144);
				System.out.println("oncard_2d:" + Static10.anInt143);
				System.out.println("oncard_texture:" + Static10.anInt141);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static105.method1211();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static66.aClass22_5.method525();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static66.aClass22_5.method526();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static26.aClass154_1.method3887();
				Static5.aClass97_1.method2546();
				Static66.aClass22_5.method518();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static270.aBoolean338 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static65.method1215(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static218.aBoolean73 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static218.aBoolean73 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static259.method4091(false, 0, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static259.method4091(false, 1, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static259.method4091(false, 2, -1, -1);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static259.method4091(false, 3, 1024, 768);
			}
			if (arg0.startsWith("::setba")) {
				Static27.anInt478 = Static110.method1981(arg0.substring(8));
				Static286.method4396(Static26.aClass154_1);
				Static75.aBoolean88 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static158.method2721(Static110.method1981(arg0.substring(15)));
				Static286.method4396(Static26.aClass154_1);
				Static75.aBoolean88 = false;
			}
			if (arg0.startsWith("::fps ") && Static85.anInt1679 != 0) {
				Static263.method4144(Static110.method1981(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static301.anInt5354 = Static110.method1981(arg0.substring(12).trim());
				Static243.method4744("rect_debug=" + Static301.anInt5354, 0, null);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static95.aBoolean103 = true;
			}
			if (arg0.startsWith("::hdr") && Static156.aBoolean211 && !Static255.method4048(!Static177.method2959())) {
				Static243.method4744("Failed to enable hdr", 0, null);
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static269.aBoolean159) {
					Static269.aBoolean159 = false;
					Static243.method4744("Forced tweening disabled.", 0, null);
				} else {
					Static269.aBoolean159 = true;
					Static243.method4744("Forced tweening ENABLED!", 0, null);
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static309.aBoolean379) {
					System.out.println("Shift-click disabled.");
					Static309.aBoolean379 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static309.aBoolean379 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static243.method4744("x:" + (Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7) + " z:" + (Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7) + " groundh:" + Static24.anIntArrayArrayArray2[Static65.anInt1300][Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7][Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7], 0, null);
			}
			if (arg0.equalsIgnoreCase("::getheight")) {
				Static243.method4744("Height: " + Static24.anIntArrayArrayArray2[Static65.anInt1300][Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7][Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7], 0, null);
			}
		}
		Static127.aClass1_Sub14_Sub1_3.method1408(186);
		Static127.aClass1_Sub14_Sub1_3.method1390(arg0.length() - 1);
		Static127.aClass1_Sub14_Sub1_3.method1385(arg0.substring(2));
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!lf;I)Lclient!gb;")
	public static Class44_Sub1 method4540(@OriginalArg(0) Class1_Sub14 arg0) {
		return new Class44_Sub1(arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1356(), arg0.method1352(), arg0.method1352(), arg0.method1378());
	}
}
