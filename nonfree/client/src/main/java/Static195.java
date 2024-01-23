import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!qe;")
	private static Class78 aClass78_761 = Static199.method3560("Jul");

	@OriginalMember(owner = "client!te", name = "b", descriptor = "Lclient!qe;")
	private static Class78 aClass78_762 = Static199.method3560("Apr");

	@OriginalMember(owner = "client!te", name = "w", descriptor = "Lclient!qe;")
	private static Class78 aClass78_775 = Static199.method3560("Jan");

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!qe;")
	private static Class78 aClass78_764 = Static199.method3560("Feb");

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Lclient!qe;")
	private static Class78 aClass78_767 = Static199.method3560("Mar");

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!qe;")
	private static Class78 aClass78_771 = Static199.method3560("May");

	@OriginalMember(owner = "client!te", name = "v", descriptor = "Lclient!qe;")
	private static Class78 aClass78_774 = Static199.method3560("Jun");

	@OriginalMember(owner = "client!te", name = "g", descriptor = "Lclient!qe;")
	private static Class78 aClass78_765 = Static199.method3560("Aug");

	@OriginalMember(owner = "client!te", name = "o", descriptor = "Lclient!qe;")
	private static Class78 aClass78_770 = Static199.method3560("Sep");

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!qe;")
	private static Class78 aClass78_769 = Static199.method3560("Oct");

	@OriginalMember(owner = "client!te", name = "u", descriptor = "Lclient!qe;")
	private static Class78 aClass78_773 = Static199.method3560("Nov");

	@OriginalMember(owner = "client!te", name = "s", descriptor = "Lclient!qe;")
	private static Class78 aClass78_772 = Static199.method3560("Dec");

	@OriginalMember(owner = "client!te", name = "c", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array35 = new Class78[] { aClass78_775, aClass78_764, aClass78_767, aClass78_762, aClass78_771, aClass78_774, aClass78_761, aClass78_765, aClass78_770, aClass78_769, aClass78_773, aClass78_772 };

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!qe;")
	public static Class78 aClass78_763 = Static199.method3560("Angreifen");

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!qe;")
	private static Class78 aClass78_768 = Static199.method3560("World");

	@OriginalMember(owner = "client!te", name = "h", descriptor = "Lclient!qe;")
	public static Class78 aClass78_766 = aClass78_768;

	@OriginalMember(owner = "client!te", name = "p", descriptor = "I")
	public static int anInt4462 = 0;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "I")
	public static int anInt4463 = -1;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method3538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(IIIIIIII)V")
	public static void method3539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == arg1) {
			Static185.method3427(arg3, arg2, arg0, arg6, arg5, arg4);
		} else if (arg3 - arg4 >= Static6.anInt187 && Static101.anInt2213 >= arg3 + arg4 && Static73.anInt1576 <= arg6 - arg1 && Static137.anInt3137 >= arg6 + arg1) {
			Static165.method2996(arg4, arg3, arg0, arg2, arg1, arg5, arg6);
		} else {
			Static77.method1311(arg4, arg2, arg5, arg6, arg0, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZIIIIIIIII)V")
	public static void method3541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 >= Static6.anInt187 && arg1 <= Static101.anInt2213 && Static6.anInt187 <= arg2 && arg2 <= Static101.anInt2213 && arg7 >= Static6.anInt187 && Static101.anInt2213 >= arg7 && Static6.anInt187 <= arg5 && arg5 <= Static101.anInt2213 && Static73.anInt1576 <= arg8 && Static137.anInt3137 >= arg8 && Static73.anInt1576 <= arg4 && Static137.anInt3137 >= arg4 && arg3 >= Static73.anInt1576 && arg3 <= Static137.anInt3137 && Static73.anInt1576 <= arg0 && arg0 <= Static137.anInt3137) {
			Static36.method474(arg8, arg2, arg5, arg6, arg0, arg3, arg7, arg4, arg1);
		} else {
			Static57.method460(arg0, arg6, arg4, arg5, arg2, arg3, arg1, arg8, arg7);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZIII)V")
	public static void method3542(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static80.method1339(arg2)) {
			Static212.method3691(arg0, -1, arg1, arg3, Static181.aClass64ArrayArray1[arg2]);
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	public static void method3543() {
		while (true) {
			if (Static139.aClass2_Sub23_Sub1_4.method2143(Static145.anInt3288) >= 11) {
				@Pc(18) int local18 = Static139.aClass2_Sub23_Sub1_4.method2154(11);
				if (local18 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static213.aClass5_Sub2_Sub2Array3[local18] == null) {
						local23 = true;
						Static213.aClass5_Sub2_Sub2Array3[local18] = new Class5_Sub2_Sub2();
						if (Static95.aClass2_Sub23Array1[local18] != null) {
							Static213.aClass5_Sub2_Sub2Array3[local18].method1496(Static95.aClass2_Sub23Array1[local18]);
						}
					}
					Static16.anIntArray792[Static180.anInt4193++] = local18;
					@Pc(59) Class5_Sub2_Sub2 local59 = Static213.aClass5_Sub2_Sub2Array3[local18];
					local59.anInt1826 = Static123.anInt2808;
					@Pc(67) int local67 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
					@Pc(72) int local72 = Static139.aClass2_Sub23_Sub1_4.method2154(1);
					if (local72 == 1) {
						Static156.anIntArray598[Static125.anInt1641++] = local18;
					}
					@Pc(88) int local88 = Static139.aClass2_Sub23_Sub1_4.method2154(5);
					if (local88 > 15) {
						local88 -= 32;
					}
					@Pc(97) int local97 = Static139.aClass2_Sub23_Sub1_4.method2154(5);
					if (local97 > 15) {
						local97 -= 32;
					}
					@Pc(108) int local108 = Static101.anIntArray384[Static139.aClass2_Sub23_Sub1_4.method2154(3)];
					if (local23) {
						local59.anInt1852 = local59.anInt1853 = local108;
					}
					local59.method1483(local88 + Static31.aClass5_Sub2_Sub2_1.anIntArray333[0], local97 + Static31.aClass5_Sub2_Sub2_1.anIntArray334[0], local67 == 1);
					continue;
				}
			}
			Static139.aClass2_Sub23_Sub1_4.method2149();
			return;
		}
	}
}
