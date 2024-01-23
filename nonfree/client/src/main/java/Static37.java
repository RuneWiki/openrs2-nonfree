import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
	public static int anInt930;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "Lclient!th;")
	public static Class168 aClass168_30;

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "Lclient!vl;")
	public static Class186 aClass186_4 = new Class186(16);

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "[I")
	public static int[] anIntArray119 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	public static int anInt928 = -1;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method775(@OriginalArg(1) String arg0) {
		if (Static77.anInt1764 >= 2) {
			@Pc(17) int local17;
			@Pc(36) int local36;
			@Pc(26) Runtime local26;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static252.method3855();
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				local26 = Runtime.getRuntime();
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static116.method1877("mem=" + local36 + "k");
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static252.method3855();
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				local26 = Runtime.getRuntime();
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static116.method1877("Memory before cleanup=" + local36 + "k");
				Static187.method3025();
				Static252.method3855();
				for (@Pc(97) int local97 = 0; local97 < 10; local97++) {
					System.gc();
				}
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static116.method1877("Memory after cleanup=" + local36 + "k");
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static116.method1877("Number of player models in cache:" + Static200.method3204());
			}
			if (Static294.aBoolean367 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static113.anInt2463);
				System.out.println("oncard_2d:" + Static113.anInt2466);
				System.out.println("oncard_texture:" + Static113.anInt2465);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static9.method298();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static280.aClass41_3.method1037();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static280.aClass41_3.method1031();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static142.aClass112_2.method2881();
				Static5.aClass104_5.method2575();
				Static280.aClass41_3.method1023();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static272.aBoolean337 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static112.method1823(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static24.aBoolean36 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static24.aBoolean36 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static286.method4392(0, -1, -1, false);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static286.method4392(1, -1, -1, false);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static286.method4392(2, -1, -1, false);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static286.method4392(3, 768, 1024, false);
			}
			if (arg0.startsWith("::setba")) {
				Static266.anInt5317 = Static79.method1345(arg0.substring(8));
				Static24.method510(Static142.aClass112_2);
				Static123.aBoolean162 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static42.method854(Static79.method1345(arg0.substring(15)));
				Static24.method510(Static142.aClass112_2);
				Static123.aBoolean162 = false;
			}
			if (arg0.startsWith("::fps ") && Static236.anInt1712 != 0) {
				Static302.method4605(Static79.method1345(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static206.anInt4453 = Static79.method1345(arg0.substring(12).trim());
				Static116.method1877("rect_debug=" + Static206.anInt4453);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static303.aBoolean389 = true;
			}
			if (arg0.startsWith("::hdr") && Static294.aBoolean367 && !Static41.method825(!Static314.method4745())) {
				Static116.method1877("Failed to enable hdr");
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static150.aBoolean218) {
					Static150.aBoolean218 = false;
					Static116.method1877("Forced tweening disabled.");
				} else {
					Static150.aBoolean218 = true;
					Static116.method1877("Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static77.aBoolean122) {
					System.out.println("Shift-click disabled.");
					Static77.aBoolean122 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static77.aBoolean122 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static116.method1877("x:" + (Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7) + " z:" + (Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7) + " groundh:" + Static46.anIntArrayArrayArray1[Static185.anInt4085][Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7][Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7]);
			}
			if (arg0.equalsIgnoreCase("::getheight")) {
				Static116.method1877("Height: " + Static46.anIntArrayArrayArray1[Static185.anInt4085][Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7][Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7]);
			}
		}
		Static2.aClass1_Sub14_Sub1_1.method2252(88);
		Static2.aClass1_Sub14_Sub1_1.method2191(arg0.length() - 1);
		Static2.aClass1_Sub14_Sub1_1.method2188(arg0.substring(2));
	}
}
