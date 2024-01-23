import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!he", name = "J", descriptor = "[I")
	public static int[] anIntArray91;

	@OriginalMember(owner = "client!he", name = "K", descriptor = "I")
	public static int anInt1095;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "Lclient!ek;")
	public static Class42 aClass42_15;

	@OriginalMember(owner = "client!he", name = "P", descriptor = "I")
	public static int anInt1098;

	@OriginalMember(owner = "client!he", name = "S", descriptor = "Z")
	private static boolean aBoolean77;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "Z")
	private static boolean aBoolean78;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "Lclient!sf;")
	public static Class157 aClass157_9 = new Class157(30);

	@OriginalMember(owner = "client!he", name = "N", descriptor = "[Lclient!eb;")
	public static Class2_Sub8_Sub6[] aClass2_Sub8_Sub6Array3 = new Class2_Sub8_Sub6[14];

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "Lclient!to;")
	public static Interface4 anInterface4_2 = null;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method779() {
		for (@Pc(16) Class2_Sub8_Sub17 local16 = (Class2_Sub8_Sub17) Static88.aClass44_8.method1352(); local16 != null; local16 = (Class2_Sub8_Sub17) Static88.aClass44_8.method1360()) {
			@Pc(22) Class15_Sub6 local22 = local16.aClass15_Sub6_1;
			if (Static32.anInt876 != local22.anInt3844 || local22.aBoolean258) {
				local16.method4743();
			} else if (local22.anInt3832 <= Static268.anInt5236) {
				local22.method3153(Static247.anInt1733);
				if (local22.aBoolean258) {
					local16.method4743();
				} else {
					Static152.method2794(local22.anInt3844, local22.anInt3838, local22.anInt3833, local22.anInt3848, 60, local22, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method789(@OriginalArg(0) String arg0) {
		if (Static175.anInt3864 >= 2) {
			@Pc(20) int local20;
			@Pc(40) int local40;
			@Pc(31) Runtime local31;
			if (arg0.equalsIgnoreCase("::gc")) {
				Static90.method1600();
				for (local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				local31 = Runtime.getRuntime();
				local40 = (int) ((local31.totalMemory() - local31.freeMemory()) / 1024L);
				Static315.method4765("mem=" + local40 + "k");
			}
			if (arg0.equalsIgnoreCase("::mm")) {
				Static90.method1600();
				for (local20 = 0; local20 < 10; local20++) {
					System.gc();
				}
				local31 = Runtime.getRuntime();
				local40 = (int) ((local31.totalMemory() - local31.freeMemory()) / 1024L);
				Static315.method4765("Memory before cleanup=" + local40 + "k");
				Static300.method4557();
				Static90.method1600();
				for (@Pc(101) int local101 = 0; local101 < 10; local101++) {
					System.gc();
				}
				local40 = (int) ((local31.totalMemory() - local31.freeMemory()) / 1024L);
				Static315.method4765("Memory after cleanup=" + local40 + "k");
			}
			if (arg0.equalsIgnoreCase("::pcachesize")) {
				Static315.method4765("Number of player models in cache:" + Static33.method646());
			}
			if (Static116.aBoolean184 && arg0.equalsIgnoreCase("::cardmem")) {
				System.out.println("oncard_geometry:" + Static124.anInt2874);
				System.out.println("oncard_2d:" + Static124.anInt2873);
				System.out.println("oncard_texture:" + Static124.anInt2872);
			}
			if (arg0.equalsIgnoreCase("::clientdrop")) {
				Static154.method2844();
			}
			if (arg0.equalsIgnoreCase("::clientjs5drop")) {
				Static217.aClass21_3.method550();
			}
			if (arg0.equalsIgnoreCase("::serverjs5drop")) {
				Static217.aClass21_3.method554();
			}
			if (arg0.equalsIgnoreCase("::breakcon")) {
				Static164.aClass102_2.method2873();
				Static253.aClass34_3.method1075();
				Static217.aClass21_3.method560();
			}
			if (arg0.equalsIgnoreCase("::replacecanvas")) {
				Static269.aBoolean351 = true;
			}
			if (arg0.equalsIgnoreCase("::rebuild")) {
				Static305.method4624(25);
			}
			if (arg0.equalsIgnoreCase("::fpson")) {
				Static193.aBoolean277 = true;
			}
			if (arg0.equalsIgnoreCase("::fpsoff")) {
				Static193.aBoolean277 = false;
			}
			if (arg0.equalsIgnoreCase("::wm0")) {
				Static260.method4091(0, -1, -1, false);
			}
			if (arg0.equalsIgnoreCase("::wm1")) {
				Static260.method4091(1, -1, -1, false);
			}
			if (arg0.equalsIgnoreCase("::wm2")) {
				Static260.method4091(2, -1, -1, false);
			}
			if (arg0.equalsIgnoreCase("::wm3")) {
				Static260.method4091(3, 768, 1024, false);
			}
			if (arg0.startsWith("::setba")) {
				Static272.anInt5414 = Static100.method1729(arg0.substring(8));
				Static108.method1847(Static164.aClass102_2);
				Static38.aBoolean61 = false;
			}
			if (arg0.startsWith("::setparticles")) {
				Static97.method1696(Static100.method1729(arg0.substring(15)));
				Static108.method1847(Static164.aClass102_2);
				Static38.aBoolean61 = false;
			}
			if (arg0.startsWith("::fps ") && Static123.anInt2856 != 0) {
				Static306.method4638(Static100.method1729(arg0.substring(6)));
			}
			if (arg0.equalsIgnoreCase("::errortest")) {
				throw new RuntimeException();
			}
			if (arg0.startsWith("::rect_debug")) {
				Static270.anInt4253 = Static100.method1729(arg0.substring(12).trim());
				Static315.method4765("rect_debug=" + Static270.anInt4253);
			}
			if (arg0.equalsIgnoreCase("::qa_op_test")) {
				Static199.aBoolean295 = true;
			}
			if (arg0.startsWith("::hdr") && Static116.aBoolean184 && !Static107.method1821(!Static288.method4475())) {
				Static315.method4765("Failed to enable hdr");
			}
			if (arg0.equalsIgnoreCase("::tween")) {
				if (Static104.aBoolean160) {
					Static104.aBoolean160 = false;
					Static315.method4765("Forced tweening disabled.");
				} else {
					Static104.aBoolean160 = true;
					Static315.method4765("Forced tweening ENABLED!");
				}
			}
			if (arg0.equalsIgnoreCase("::shiftclick")) {
				if (Static72.aBoolean117) {
					System.out.println("Shift-click disabled.");
					Static72.aBoolean117 = false;
				} else {
					System.out.println("Shift-click ENABLED!");
					Static72.aBoolean117 = true;
				}
			}
			if (arg0.equalsIgnoreCase("::getcgcoord")) {
				Static315.method4765("x:" + (Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7) + " z:" + (Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7) + " groundh:" + Static9.anIntArrayArrayArray7[Static32.anInt876][Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7][Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7]);
			}
			if (arg0.equalsIgnoreCase("::getheight")) {
				Static315.method4765("Height: " + Static9.anIntArrayArrayArray7[Static32.anInt876][Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7][Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7]);
			}
		}
		Static211.aClass2_Sub16_Sub1_2.method2198(130);
		Static211.aClass2_Sub16_Sub1_2.method2168(arg0.length() - 1);
		Static211.aClass2_Sub16_Sub1_2.method2153(arg0.substring(2));
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIII)I")
	public static int method794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(11) int local11 = arg3;
			arg3 = arg5;
			arg5 = local11;
		}
		@Pc(27) int local27 = arg1 & 0x3;
		if (local27 == 0) {
			return arg0;
		} else if (local27 == 1) {
			return arg4;
		} else if (local27 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return 1 + 7 - arg5 - arg4;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZI)V")
	public static void method796(@OriginalArg(0) boolean arg0) {
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (Static116.aBoolean184 && arg0) {
			local11 = Static234.aByteArrayArray15;
			local13 = 1;
		} else {
			local11 = Static296.aByteArrayArray19;
			local13 = 4;
		}
		@Pc(21) int[] local21 = null;
		for (@Pc(23) int local23 = 0; local23 < local13; local23++) {
			Static220.method3662();
			for (@Pc(34) int local34 = 0; local34 < 13; local34++) {
				for (@Pc(41) int local41 = 0; local41 < 13; local41++) {
					@Pc(48) boolean local48 = false;
					@Pc(56) int local56 = Static50.anIntArrayArrayArray3[local23][local34][local41];
					if (local56 != -1) {
						@Pc(66) int local66 = local56 >> 24 & 0x3;
						if (!arg0 || local66 == 0) {
							@Pc(79) int local79 = local56 >> 1 & 0x3;
							@Pc(85) int local85 = local56 >> 14 & 0x3FF;
							@Pc(91) int local91 = local56 >> 3 & 0x7FF;
							@Pc(101) int local101 = local91 / 8 + (local85 / 8 << 8);
							for (@Pc(103) int local103 = 0; local103 < Static253.anIntArray485.length; local103++) {
								if (local101 == Static253.anIntArray485[local103] && local11[local103] != null) {
									@Pc(136) int[] local136 = Static21.method368(local85, arg0, local79, local91, local41 * 8, local34 * 8, Static89.aClass154Array1, local11[local103], local66, local23);
									local48 = true;
									if (local21 == null && local136 != null) {
										local21 = local136;
									}
									break;
								}
							}
						}
					}
					if (!local48) {
						Static154.method2843(local34 * 8, local41 * 8, local23, 8, 8);
					}
				}
			}
		}
		if (local21 == null) {
			Static100.anInt2372 = -1;
			return;
		}
		Static100.anInt2372 = local21[0];
		Static118.anInt2627 = local21[2];
		Static200.anInt4186 = local21[3];
		Static130.anInt2985 = local21[4];
		Static278.anInt5486 = local21[1];
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!ek;II)[Lclient!ob;")
	public static Class93[] method797(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1) {
		return Static187.method3282(arg0, arg1, 0) ? Static149.method2644() : null;
	}
}
