import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!eb", name = "xb", descriptor = "I")
	public static int anInt2586;

	@OriginalMember(owner = "client!eb", name = "Hb", descriptor = "Z")
	public static boolean aBoolean185;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "Lclient!qc;")
	public static Class47 aClass47_23 = new Class47(64);

	@OriginalMember(owner = "client!eb", name = "pb", descriptor = "Lclient!o;")
	public static Class40 aClass40_734 = Static13.method257("backbase1");

	@OriginalMember(owner = "client!eb", name = "qb", descriptor = "Z")
	public static boolean aBoolean184 = false;

	@OriginalMember(owner = "client!eb", name = "rb", descriptor = "Lclient!o;")
	public static Class40 aClass40_735 = Static13.method257("Side panel redrawn");

	@OriginalMember(owner = "client!eb", name = "ub", descriptor = "Lclient!o;")
	public static Class40 aClass40_736 = Static13.method257("Import ready");

	@OriginalMember(owner = "client!eb", name = "vb", descriptor = "Lclient!o;")
	public static Class40 aClass40_737 = Static13.method257("Loaded input handler");

	@OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
	public static int anInt2585 = -1;

	@OriginalMember(owner = "client!eb", name = "yb", descriptor = "I")
	public static int anInt2587 = 0;

	@OriginalMember(owner = "client!eb", name = "Bb", descriptor = "I")
	public static int anInt2590 = -1;

	@OriginalMember(owner = "client!eb", name = "Fb", descriptor = "I")
	public static int anInt2594 = 0;

	@OriginalMember(owner = "client!eb", name = "Gb", descriptor = "Lclient!o;")
	public static Class40 aClass40_738 = Static13.method257("Jun");

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
	public static void method1689() {
		aClass47_23 = null;
		aClass40_734 = null;
		aClass40_735 = null;
		aClass40_736 = null;
		aClass40_737 = null;
		aClass40_738 = null;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(IB)V")
	public static void method1700(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = Static98.method1568(arg0).anInt1076;
		if (local15 == 0) {
			return;
		}
		@Pc(25) int local25 = Static67.anIntArray339[arg0];
		if (local15 == 1) {
			if (local25 == 1) {
				Static6.method168(0.9D);
				((Class19) Static6.anInterface4_1).method404(0.9D);
			}
			if (local25 == 2) {
				Static6.method168(0.8D);
				((Class19) Static6.anInterface4_1).method404(0.8D);
			}
			if (local25 == 3) {
				Static6.method168(0.7D);
				((Class19) Static6.anInterface4_1).method404(0.7D);
			}
			if (local25 == 4) {
				Static6.method168(0.6D);
				((Class19) Static6.anInterface4_1).method404(0.6D);
			}
			Static82.method1342();
			Static1.aBoolean1 = true;
		}
		if (local15 == 3) {
			@Pc(85) short local85 = 0;
			if (local25 == 0) {
				local85 = 255;
			}
			if (local25 == 1) {
				local85 = 192;
			}
			if (local25 == 2) {
				local85 = 128;
			}
			if (local25 == 3) {
				local85 = 64;
			}
			if (local25 == 4) {
				local85 = 0;
			}
			if (Static7.anInt239 != local85) {
				if (Static7.anInt239 == 0 && Static84.anInt1977 != -1) {
					Static94.method1499(0, Static84.anInt1977, Static85.aClass5_Sub1_17, local85);
					Static20.anInt470 = 0;
				} else if (local85 == 0) {
					Static94.method1497();
					Static20.anInt470 = 0;
				} else {
					Static36.method641(local85);
				}
				Static7.anInt239 = local85;
			}
		}
		if (local15 == 6) {
			Static53.anInt1186 = local25;
		}
		if (local15 == 9) {
			Static5.anInt182 = local25;
		}
		if (local15 == 8) {
			Static102.anInt2473 = local25;
			Static73.aBoolean144 = true;
		}
		if (local15 == 4) {
			if (local25 == 0) {
				Static98.anInt2372 = 127;
			}
			if (local25 == 1) {
				Static98.anInt2372 = 96;
			}
			if (local25 == 2) {
				Static98.anInt2372 = 64;
			}
			if (local25 == 3) {
				Static98.anInt2372 = 32;
			}
			if (local25 == 4) {
				Static98.anInt2372 = 0;
			}
		}
		if (local15 == 5) {
			Static10.anInt263 = local25;
		}
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V")
	public static void method1713() {
		anInt2587++;
		Static76.method1475(true);
		Static36.method636(true);
		Static76.method1475(false);
		Static36.method636(false);
		Static54.method917();
		Static1.method3();
		@Pc(36) int local36;
		@Pc(34) int local34;
		if (!Static7.aBoolean22) {
			local34 = Static67.anInt1669 + Static10.anInt262 & 0x7FF;
			local36 = Static93.anInt2177;
			if (local36 < Static13.anInt308 / 256) {
				local36 = Static13.anInt308 / 256;
			}
			if (Static98.aBooleanArray35[4] && Static36.anIntArray164[4] + 128 > local36) {
				local36 = Static36.anIntArray164[4] + 128;
			}
			Static41.method752(Static23.anInt577, local34, Static66.anInt1653, local36, Static86.method1383(Static1.anInt8, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284) - 50, local36 * 3 + 600);
		}
		if (Static7.aBoolean22) {
			local36 = Static18.method361();
		} else {
			local36 = Static59.method995();
		}
		local34 = Static48.anInt1114;
		@Pc(96) int local96 = Static15.anInt1863;
		@Pc(98) int local98 = Static81.anInt1935;
		@Pc(100) int local100 = Static35.anInt824;
		@Pc(102) int local102 = Static27.anInt686;
		for (@Pc(104) int local104 = 0; local104 < 5; local104++) {
			if (Static98.aBooleanArray35[local104]) {
				@Pc(146) int local146 = (int) ((double) -Static20.anIntArray93[local104] + (double) (Static20.anIntArray93[local104] * 2 + 1) * Math.random() + Math.sin((double) Static79.anIntArray415[local104] * ((double) Static35.anIntArray159[local104] / 100.0D)) * (double) Static36.anIntArray164[local104]);
				if (local104 == 3) {
					Static27.anInt686 = Static27.anInt686 + local146 & 0x7FF;
				}
				if (local104 == 2) {
					Static15.anInt1863 += local146;
				}
				if (local104 == 4) {
					Static35.anInt824 += local146;
					if (Static35.anInt824 < 128) {
						Static35.anInt824 = 128;
					}
					if (Static35.anInt824 > 383) {
						Static35.anInt824 = 383;
					}
				}
				if (local104 == 1) {
					Static81.anInt1935 += local146;
				}
				if (local104 == 0) {
					Static48.anInt1114 += local146;
				}
			}
		}
		Static75.method1230();
		Static71.aBoolean140 = true;
		Static71.anInt1748 = Static100.anInt2394 - 4;
		Static71.anInt1747 = 0;
		Static71.anInt1750 = Static32.anInt742 - 4;
		Static26.method1610();
		Static93.aClass55_1.method1430(Static48.anInt1114, Static81.anInt1935, Static15.anInt1863, Static35.anInt824, Static27.anInt686, local36);
		Static93.aClass55_1.method1454();
		Static12.method253();
		Static67.method1099();
		((Class19) Static6.anInterface4_1).method405(Static45.anInt1095);
		Static18.method359();
		if (Static75.aBoolean147 && Static105.method1668() == 0) {
			Static75.aBoolean147 = false;
		}
		if (Static75.aBoolean147) {
			Static75.method1230();
			Static26.method1610();
			Static66.method1095(false, null, Static98.aClass40_674);
		}
		Static80.method1333(Static24.aGraphics1);
		Static81.anInt1935 = local98;
		Static35.anInt824 = local100;
		Static15.anInt1863 = local96;
		Static48.anInt1114 = local34;
		Static27.anInt686 = local102;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[BZ)I")
	public static int method1726(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static19.method371(0, arg1, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class2_Sub7 local7 = null;
		for (@Pc(12) Class2_Sub7 local12 = (Class2_Sub7) Static92.aClass44_7.method1224(); local12 != null; local12 = (Class2_Sub7) Static92.aClass44_7.method1231()) {
			if (local12.anInt817 == arg1 && local12.anInt818 == arg8 && local12.anInt821 == arg6 && local12.anInt823 == arg2) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub7();
			local7.anInt817 = arg1;
			local7.anInt823 = arg2;
			local7.anInt818 = arg8;
			local7.anInt821 = arg6;
			Static4.method86(local7);
			Static92.aClass44_7.method1221(local7);
		}
		local7.anInt829 = arg3;
		local7.anInt828 = arg5;
		local7.anInt826 = arg7;
		local7.anInt827 = arg0;
		local7.anInt819 = arg4;
	}
}
