import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ba", name = "cc", descriptor = "Lclient!g;")
	public static Class26 aClass26_30;

	@OriginalMember(owner = "client!ba", name = "ob", descriptor = "I")
	public static int anInt2661 = 0;

	@OriginalMember(owner = "client!ba", name = "wb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1652 = Static72.method1077("leuchten2:");

	@OriginalMember(owner = "client!ba", name = "xb", descriptor = "Lclient!u;")
	private static Class74 aClass74_1653 = Static72.method1077("Accept challenge");

	@OriginalMember(owner = "client!ba", name = "Ab", descriptor = "Lclient!u;")
	public static Class74 aClass74_1654 = Static72.method1077("compass");

	@OriginalMember(owner = "client!ba", name = "Gb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1655 = aClass74_1653;

	@OriginalMember(owner = "client!ba", name = "Hb", descriptor = "Lclient!u;")
	public static Class74 aClass74_1656 = Static72.method1077("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!ba", name = "kc", descriptor = "I")
	public static int anInt2699 = -1;

	@OriginalMember(owner = "client!ba", name = "qc", descriptor = "Lclient!u;")
	public static Class74 aClass74_1658 = Static72.method1077("(U1");

	@OriginalMember(owner = "client!ba", name = "tc", descriptor = "Lclient!u;")
	public static Class74 aClass74_1659 = Static72.method1077("logo");

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)V")
	public static void method1858() {
		for (@Pc(13) Class2_Sub2_Sub2_Sub3 local13 = (Class2_Sub2_Sub2_Sub3) Static5.aClass13_4.method415(); local13 != null; local13 = (Class2_Sub2_Sub2_Sub3) Static5.aClass13_4.method414()) {
			if (local13.anInt1137 != Static117.anInt2529 || Static107.anInt2338 > local13.anInt1139) {
				local13.method1930();
			} else if (Static107.anInt2338 >= local13.anInt1134) {
				if (local13.anInt1144 > 0) {
					@Pc(45) Class2_Sub2_Sub2_Sub1_Sub1 local45 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local13.anInt1144 - 1];
					if (local45 != null && local45.anInt2673 >= 0 && local45.anInt2673 < 13312 && local45.anInt2672 >= 0 && local45.anInt2672 < 13312) {
						local13.method790(local45.anInt2672, Static107.anInt2338, Static15.method348(local45.anInt2673, local45.anInt2672, local13.anInt1137) - local13.anInt1141, local45.anInt2673);
					}
				}
				if (local13.anInt1144 < 0) {
					@Pc(97) int local97 = -local13.anInt1144 - 1;
					@Pc(106) Class2_Sub2_Sub2_Sub1_Sub2 local106;
					if (local97 == Static39.anInt949) {
						local106 = Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1;
					} else {
						local106 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local97];
					}
					if (local106 != null && local106.anInt2673 >= 0 && local106.anInt2673 < 13312 && local106.anInt2672 >= 0 && local106.anInt2672 < 13312) {
						local13.method790(local106.anInt2672, Static107.anInt2338, Static15.method348(local106.anInt2673, local106.anInt2672, local13.anInt1137) - local13.anInt1141, local106.anInt2673);
					}
				}
				local13.method796(Static15.anInt429);
				Static84.aClass69_1.method1637(Static117.anInt2529, (int) local13.aDouble1, (int) local13.aDouble5, (int) local13.aDouble8, 60, local13, local13.anInt1150, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public static void method1859() {
		aClass74_1653 = null;
		aClass74_1658 = null;
		aClass74_1652 = null;
		aClass74_1656 = null;
		aClass26_30 = null;
		aClass74_1659 = null;
		aClass74_1655 = null;
		aClass74_1654 = null;
	}

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)I")
	public static int method1860() {
		@Pc(5) int local5 = Static15.method348(Static113.anInt2444, Static40.anInt958, Static117.anInt2529);
		return local5 - Static12.anInt362 >= 800 || (Static17.aByteArrayArrayArray1[Static117.anInt2529][Static113.anInt2444 >> 7][Static40.anInt958 >> 7] & 0x4) == 0 ? 3 : Static117.anInt2529;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!u;I)Z")
	public static boolean method1864(@OriginalArg(0) Class74 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static65.anInt1450; local11++) {
			if (arg0.method1701(Static19.aClass74Array2[local11])) {
				return true;
			}
		}
		return arg0.method1701(Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.aClass74_1661);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII[Lclient!ve;Lclient!ve;IIIII)Lclient!ve;")
	public static Class2_Sub2_Sub17 method1865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub2_Sub17[] arg5, @OriginalArg(6) Class2_Sub2_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg9 > arg1 || arg7 > arg2 || arg1 >= arg4 || arg2 >= arg3) {
			return null;
		}
		for (@Pc(29) int local29 = 0; local29 < arg5.length; local29++) {
			@Pc(38) Class2_Sub2_Sub17 local38 = arg5[local29];
			if (local38 != null && local38.anInt2803 == arg10 && !Static63.method1002(local38) && local38 != arg6) {
				@Pc(66) int local66 = arg7 + local38.anInt2834 - arg0;
				@Pc(74) int local74 = arg9 + local38.anInt2780 - arg8;
				if (local38.anInt2777 == 0) {
					@Pc(100) Class2_Sub2_Sub17 local100 = method1865(local38.anInt2836, arg1, arg2, local66 + local38.anInt2829, local74 + local38.anInt2810, arg5, arg6, local66, local38.anInt2832, local74, local38.anInt2794);
					if (local100 != null) {
						return local100;
					}
					if (local38.aClass2_Sub2_Sub17Array2 != null) {
						local100 = method1865(local38.anInt2836, arg1, arg2, local66 + local38.anInt2829, local38.anInt2810 + local74, local38.aClass2_Sub2_Sub17Array2, arg6, local66, local38.anInt2832, local74, local38.anInt2794);
						if (local100 != null) {
							return local100;
						}
					}
				}
				if (Static90.method1330(Static19.method429(local38)) && arg1 >= local74 && arg2 >= local66 && arg1 < local74 + local38.anInt2810 && local66 + local38.anInt2829 > arg2) {
					return local38;
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "([BI)[B")
	public static byte[] method1866(@OriginalArg(0) byte[] arg0) {
		@Pc(13) Class2_Sub10 local13 = new Class2_Sub10(arg0);
		@Pc(17) int local17 = local13.method1514();
		@Pc(21) int local21 = local13.method1532();
		if (local21 < 0 || Static105.anInt2316 != 0 && local21 > Static105.anInt2316) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(92) byte[] local92 = new byte[local21];
			local13.method1516(local21, local92);
			return local92;
		} else {
			@Pc(48) int local48 = local13.method1532();
			if (local48 < 0 || Static105.anInt2316 != 0 && local48 > Static105.anInt2316) {
				throw new RuntimeException();
			}
			@Pc(69) byte[] local69 = new byte[local48];
			if (local17 == 1) {
				Static26.method506(local69, local48, arg0, local21);
			} else {
				Static90.aClass41_1.method994(local69, local13);
			}
			return local69;
		}
	}
}
