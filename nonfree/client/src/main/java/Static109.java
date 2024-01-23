import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Z")
	public static boolean aBoolean177;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "Lclient!pk;")
	public static Class132 aClass132_41;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
	public static int anInt2271 = -1;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
	public static int anInt2272 = 10;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1776(@OriginalArg(1) String arg0) {
		if (Static94.anInt1962 >= 2) {
			@Pc(17) int local17;
			@Pc(36) int local36;
			@Pc(26) Runtime local26;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static292.method4266();
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				local26 = Runtime.getRuntime();
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static47.method746(0, "mem=" + local36 + "k", null);
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static292.method4266();
				for (local17 = 0; local17 < 10; local17++) {
					System.gc();
				}
				local26 = Runtime.getRuntime();
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static47.method746(0, "Memory before cleanup=" + local36 + "k", null);
				Static99.method1576();
				Static292.method4266();
				for (@Pc(96) int local96 = 0; local96 < 10; local96++) {
					System.gc();
				}
				local36 = (int) ((local26.totalMemory() - local26.freeMemory()) / 1024L);
				Static47.method746(0, "Memory after cleanup=" + local36 + "k", null);
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static47.method746(0, "Number of player models in cache:" + Static285.method4243(), null);
			}
			if (Static116.aBoolean188 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static166.anInt3353);
				System.out.println("oncard_2d:" + Static166.anInt3352);
				System.out.println("oncard_texture:" + Static166.anInt3351);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static134.method2184();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static158.aClass139_2.method3448();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static158.aClass139_2.method3452();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static199.aClass17_3.method446();
				Static95.aClass92_4.method2183();
				Static158.aClass139_2.method3438();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static120.aBoolean205 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static49.method774(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static216.aBoolean360 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static216.aBoolean360 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static101.method1616(-1, -1, false, 0);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static101.method1616(-1, -1, false, 1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static101.method1616(-1, -1, false, 2);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static101.method1616(1024, 768, false, 3);
			}
			if (arg0.startsWith("::setba")) {
				Static279.anInt5448 = Static167.method2646(arg0.substring(8));
				Static269.method3754(Static199.aClass17_3);
				Static49.aBoolean75 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static223.method3485(Static167.method2646(arg0.substring(15)));
				Static269.method3754(Static199.aClass17_3);
				Static49.aBoolean75 = false;
			}
			if (arg0.startsWith("::fps ") && Static147.anInt2995 != 0) {
				Static45.method4134(Static167.method2646(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static138.anInt2763 = Static167.method2646(arg0.substring(12).trim());
				Static47.method746(0, "rect_debug=" + Static138.anInt2763, null);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static104.aBoolean169 = true;
			}
			if (arg0.startsWith("::hdr") && Static116.aBoolean188 && !Static256.method3840(!Static154.method2459())) {
				Static47.method746(0, "Failed to enable hdr", null);
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static48.aBoolean74) {
					Static48.aBoolean74 = false;
					Static47.method746(0, "Forced tweening disabled.", null);
				} else {
					Static48.aBoolean74 = true;
					Static47.method746(0, "Forced tweening ENABLED!", null);
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static269.aBoolean399) {
					System.out.println("Shift-click disabled.");
					Static269.aBoolean399 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static269.aBoolean399 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static47.method746(0, "x:" + (Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7) + " z:" + (Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7) + " groundh:" + Static195.anIntArrayArrayArray7[Static34.anInt770][Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7][Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7], null);
			}
		}
		Static66.aClass8_Sub2_Sub1_4.method2398(206);
		Static66.aClass8_Sub2_Sub1_4.method2340(arg0.length() - 1);
		Static66.aClass8_Sub2_Sub1_4.method2331(arg0.substring(2));
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!lk;I)V")
	public static void method1777(@OriginalArg(0) Class36_Sub3 arg0) {
		if (Static183.anInt3590 == arg0.anInt4096 || arg0.anInt4107 == -1 || arg0.anInt4113 != 0 || arg0.anInt4132 + 1 > Static115.method1855(arg0.anInt4107).anIntArray158[arg0.anInt4103]) {
			@Pc(32) int local32 = arg0.anInt4096 - arg0.anInt4078;
			@Pc(38) int local38 = Static183.anInt3590 - arg0.anInt4078;
			@Pc(50) int local50 = arg0.anInt4143 * 128 + arg0.method3110() * 64;
			@Pc(61) int local61 = arg0.anInt4092 * 128 + arg0.method3110() * 64;
			@Pc(72) int local72 = arg0.anInt4135 * 128 + arg0.method3110() * 64;
			@Pc(83) int local83 = arg0.anInt4079 * 128 + arg0.method3110() * 64;
			arg0.anInt4117 = ((local32 - local38) * local50 + local72 * local38) / local32;
			arg0.anInt4118 = (local61 * (local32 - local38) + local83 * local38) / local32;
		}
		if (arg0.anInt4063 == 0) {
			arg0.anInt4081 = 1024;
		}
		arg0.anInt4148 = 0;
		if (arg0.anInt4063 == 1) {
			arg0.anInt4081 = 1536;
		}
		if (arg0.anInt4063 == 2) {
			arg0.anInt4081 = 0;
		}
		if (arg0.anInt4063 == 3) {
			arg0.anInt4081 = 512;
		}
		arg0.anInt4128 = arg0.anInt4081;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!he;IIIIII)Z")
	public static boolean method1778(@OriginalArg(0) Class70 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(17) Class52 local17 = Static156.method2488(arg0.anInt2095);
		if (local17.anInt1562 == -1) {
			return true;
		}
		if (arg0.aBoolean163) {
			@Pc(33) int local33 = arg3 + arg0.anInt2093;
			arg3 = local33 & 0x3;
		} else {
			arg3 = 0;
		}
		@Pc(48) Class43_Sub2 local48 = local17.method1150(arg0.aBoolean152, arg3);
		if (local48 == null) {
			return false;
		}
		@Pc(57) int local57 = arg0.anInt2065;
		@Pc(60) int local60 = arg0.anInt2063;
		if ((arg3 & 0x1) == 1) {
			local57 = arg0.anInt2063;
			local60 = arg0.anInt2065;
		}
		@Pc(77) int local77 = local48.anInt5711;
		@Pc(80) int local80 = local48.anInt5713;
		if (local17.aBoolean111) {
			local77 = local57 * 4;
			local80 = local60 * 4;
		}
		if (local17.anInt1570 == 0) {
			local48.method4311(arg2 * 4 + 48, 48 - -((-local60 + 104 - arg1) * 4), local77, local80);
		} else {
			local48.method4302(arg2 * 4 + 48, (-local60 + -arg1 + 104) * 4 + 48, local77, local80, local17.anInt1570);
		}
		return true;
	}
}
