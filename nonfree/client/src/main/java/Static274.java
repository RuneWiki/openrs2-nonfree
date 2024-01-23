import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!to", name = "l", descriptor = "I")
	public static int anInt5042;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "[I")
	public static int[] anIntArray557 = new int[128];

	@OriginalMember(owner = "client!to", name = "b", descriptor = "Z")
	public static boolean aBoolean479 = false;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString194 = "Face here";

	@OriginalMember(owner = "client!to", name = "m", descriptor = "[I")
	public static int[] anIntArray560 = new int[50];

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4203(@OriginalArg(0) String arg0) {
		if (Static142.anInt2785 >= 2) {
			@Pc(19) int local19;
			@Pc(40) int local40;
			@Pc(30) Runtime local30;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static11.method171();
				for (local19 = 0; local19 < 10; local19++) {
					System.gc();
				}
				local30 = Runtime.getRuntime();
				local40 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
				Static305.method4555("mem=" + local40 + "k", null, 0);
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static11.method171();
				for (local19 = 0; local19 < 10; local19++) {
					System.gc();
				}
				local30 = Runtime.getRuntime();
				local40 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
				Static305.method4555("Memory before cleanup=" + local40 + "k", null, 0);
				Static207.method4490();
				Static11.method171();
				for (@Pc(102) int local102 = 0; local102 < 10; local102++) {
					System.gc();
				}
				local40 = (int) ((local30.totalMemory() - local30.freeMemory()) / 1024L);
				Static305.method4555("Memory after cleanup=" + local40 + "k", null, 0);
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static305.method4555("Number of player models in cache:" + Static268.method4137(), null, 0);
			}
			if (Static71.aBoolean165 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static162.anInt3244);
				System.out.println("oncard_2d:" + Static162.anInt3247);
				System.out.println("oncard_texture:" + Static162.anInt3246);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static269.method4149();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static136.aClass164_1.method4081();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static136.aClass164_1.method4073();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static222.aClass176_3.method4380();
				Static97.aClass49_2.method1305();
				Static136.aClass164_1.method4071();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static300.aBoolean509 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static197.method3406(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static248.aBoolean415 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static248.aBoolean415 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static122.method2210(-1, false, -1, 0);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static122.method2210(-1, false, -1, 1);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static122.method2210(-1, false, -1, 2);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static122.method2210(768, false, 1024, 3);
			}
			if (arg0.startsWith("::setba")) {
				Static19.anInt422 = Static194.method3363(arg0.substring(8));
				Static304.method4550(Static222.aClass176_3);
				Static164.aBoolean283 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static52.method969(Static194.method3363(arg0.substring(15)));
				Static304.method4550(Static222.aClass176_3);
				Static164.aBoolean283 = false;
			}
			if (arg0.startsWith("::fps ") && Static210.anInt4011 != 0) {
				Static273.method4201(Static194.method3363(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static18.anInt394 = Static194.method3363(arg0.substring(12).trim());
				Static305.method4555("rect_debug=" + Static18.anInt394, null, 0);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static26.aBoolean54 = true;
			}
			if (arg0.startsWith("::hdr") && Static71.aBoolean165 && !Static260.method4031(!Static152.method2651())) {
				Static305.method4555("Failed to enable hdr", null, 0);
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static186.aBoolean313) {
					Static186.aBoolean313 = false;
					Static305.method4555("Forced tweening disabled.", null, 0);
				} else {
					Static186.aBoolean313 = true;
					Static305.method4555("Forced tweening ENABLED!", null, 0);
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static17.aBoolean36) {
					System.out.println("Shift-click disabled.");
					Static17.aBoolean36 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static17.aBoolean36 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static305.method4555("x:" + (Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7) + " z:" + (Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7) + " groundh:" + Static280.anIntArrayArrayArray13[Static132.anInt2608][Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7][Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7], null, 0);
			}
			if (arg0.equalsIgnoreCase("::getheight")) {
				Static305.method4555("Height: " + Static280.anIntArrayArrayArray13[Static132.anInt2608][Static138.aClass11_Sub4_Sub1_3.anInt3865 >> 7][Static138.aClass11_Sub4_Sub1_3.anInt3856 >> 7], null, 0);
			}
		}
		Static116.aClass1_Sub13_Sub1_48.method1887(0);
		Static116.aClass1_Sub13_Sub1_48.method1822(arg0.length() - 1);
		Static116.aClass1_Sub13_Sub1_48.method1852(arg0.substring(2));
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I")
	public static int method4207(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		@Pc(34) double local34 = local14;
		if (local14 < local30) {
			local34 = local30;
		}
		if (local30 < local14) {
			local32 = local30;
		}
		@Pc(49) double local49 = 0.0D;
		if (local21 < local32) {
			local32 = local21;
		}
		@Pc(58) double local58 = 0.0D;
		if (local21 > local34) {
			local34 = local21;
		}
		@Pc(71) double local71 = (local34 + local32) / 2.0D;
		if (local32 != local34) {
			if (local14 == local34) {
				local49 = (local30 - local21) / (local34 - local32);
			} else if (local34 == local30) {
				local49 = (local21 - local14) / (local34 - local32) + 2.0D;
			} else if (local34 == local21) {
				local49 = (local14 - local30) / (local34 - local32) + 4.0D;
			}
			if (local71 < 0.5D) {
				local58 = (local34 - local32) / (local34 + local32);
			}
			if (local71 >= 0.5D) {
				local58 = (local34 - local32) / (2.0D - local34 - local32);
			}
		}
		local49 /= 6.0D;
		@Pc(162) int local162 = (int) (local58 * 256.0D);
		@Pc(167) int local167 = (int) (local49 * 256.0D);
		@Pc(172) int local172 = (int) (local71 * 256.0D);
		if (local172 < 0) {
			local172 = 0;
		} else if (local172 > 255) {
			local172 = 255;
		}
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		if (local172 > 243) {
			local162 >>= 0x4;
		} else if (local172 > 217) {
			local162 >>= 0x3;
		} else if (local172 > 192) {
			local162 >>= 0x2;
		} else if (local172 > 179) {
			local162 >>= 0x1;
		}
		return (local172 >> 1) + (local162 >> 5 << 7) + (local167 >> 2 << 10);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIII)V")
	public static void method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static272.anInt5001 = -1;
		Static55.anInt1176 = -1;
		@Pc(9) int local9 = arg3;
		@Pc(15) float local15 = (float) Static249.anInt5574 / (float) Static249.anInt5575;
		@Pc(25) int local25 = arg2;
		if (local15 < 1.0F) {
			local25 = (int) ((float) arg3 * local15);
		} else {
			local9 = (int) ((float) arg2 / local15);
		}
		@Pc(52) int local52 = arg1 - (arg2 - local25) / 2;
		@Pc(60) int local60 = arg0 - (arg3 - local9) / 2;
		Static54.anInt1167 = local60 * Static249.anInt5575 / local9;
		Static175.anInt3415 = local52 * Static249.anInt5574 / local25;
		Static94.method1798();
	}
}
