import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
	public static int anInt1396;

	@OriginalMember(owner = "client!pb", name = "Q", descriptor = "Lclient!ke;")
	public static Class41_Sub1 aClass41_Sub1_11;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	public static int anInt1387 = 0;

	@OriginalMember(owner = "client!pb", name = "J", descriptor = "Lclient!rd;")
	private static Class64 aClass64_884 = Static69.method1153("Password: ");

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_879 = aClass64_884;

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_880 = Static69.method1153("sch-Utteln:");

	@OriginalMember(owner = "client!pb", name = "w", descriptor = "Lclient!rd;")
	public static Class64 aClass64_881 = Static69.method1153("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!pb", name = "A", descriptor = "Lclient!rd;")
	public static Class64 aClass64_882 = Static69.method1153("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "Lclient!rd;")
	public static Class64 aClass64_883 = Static69.method1153("(X");

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
	public static int anInt1404 = 0;

	@OriginalMember(owner = "client!pb", name = "L", descriptor = "Lclient!rd;")
	public static Class64 aClass64_885 = Static69.method1153("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
	public static int anInt1408 = 0;

	@OriginalMember(owner = "client!pb", name = "P", descriptor = "Lclient!rd;")
	public static Class64 aClass64_886 = Static69.method1153("backvmid1");

	@OriginalMember(owner = "client!pb", name = "X", descriptor = "Lclient!rd;")
	public static Class64 aClass64_887 = Static69.method1153("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!nd;IIIII[Lclient!nd;IIIII)Lclient!nd;")
	public static Class1_Sub1_Sub11 method1058(@OriginalArg(0) Class1_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub11[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg4 < arg1 || arg8 < arg2 || arg4 >= arg9 || arg3 <= arg8) {
			return null;
		}
		for (@Pc(30) int local30 = 0; local30 < arg6.length; local30++) {
			@Pc(36) Class1_Sub1_Sub11 local36 = arg6[local30];
			if (local36 != null && arg5 == local36.anInt1739 && !Static99.method1605(local36) && local36 != arg0) {
				@Pc(63) int local63 = arg2 + local36.anInt1702 - arg10;
				@Pc(70) int local70 = arg1 + local36.anInt1690 - arg7;
				if (local36.anInt1697 == 0) {
					@Pc(97) Class1_Sub1_Sub11 local97 = method1058(arg0, local70, local63, local63 + local36.anInt1707, arg4, local36.anInt1717, arg6, local36.anInt1706, arg8, local36.anInt1700 + local70, local36.anInt1689);
					if (local97 != null) {
						return local97;
					}
					if (local36.aClass1_Sub1_Sub11Array2 != null) {
						local97 = method1058(arg0, local70, local63, local63 + local36.anInt1707, arg4, local36.anInt1717, local36.aClass1_Sub1_Sub11Array2, local36.anInt1706, arg8, local70 + local36.anInt1700, local36.anInt1689);
						if (local97 != null) {
							return local97;
						}
					}
				}
				if (Static61.method1086(Static31.method548(local36)) && arg4 >= local70 && local63 <= arg8 && arg4 < local70 + local36.anInt1700 && arg8 < local36.anInt1707 + local63) {
					return local36;
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1059() {
		aClass64_879 = null;
		aClass64_886 = null;
		aClass41_Sub1_11 = null;
		aClass64_882 = null;
		aClass64_887 = null;
		aClass64_884 = null;
		aClass64_880 = null;
		aClass64_883 = null;
		aClass64_881 = null;
		aClass64_885 = null;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public static void method1061() {
		for (@Pc(10) Class1_Sub1_Sub2_Sub2 local10 = (Class1_Sub1_Sub2_Sub2) Static53.aClass50_7.method1151(); local10 != null; local10 = (Class1_Sub1_Sub2_Sub2) Static53.aClass50_7.method1141()) {
			if (local10.anInt1294 != Static15.anInt463 || Static15.anInt471 > local10.anInt1301) {
				local10.method2076();
			} else if (Static15.anInt471 >= local10.anInt1279) {
				if (local10.anInt1290 > 0) {
					@Pc(50) Class1_Sub1_Sub2_Sub1_Sub1 local50 = Static101.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local10.anInt1290 - 1];
					if (local50 != null && local50.anInt2375 >= 0 && local50.anInt2375 < 13312 && local50.anInt2412 >= 0 && local50.anInt2412 < 13312) {
						local10.method966(Static114.method1996(local10.anInt1294, local50.anInt2375, local50.anInt2412) - local10.anInt1284, local50.anInt2412, local50.anInt2375, Static15.anInt471);
					}
				}
				if (local10.anInt1290 < 0) {
					@Pc(106) int local106 = -local10.anInt1290 - 1;
					@Pc(117) Class1_Sub1_Sub2_Sub1_Sub2 local117;
					if (local106 == Static64.anInt1485) {
						local117 = Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1;
					} else {
						local117 = Static28.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local106];
					}
					if (local117 != null && local117.anInt2375 >= 0 && local117.anInt2375 < 13312 && local117.anInt2412 >= 0 && local117.anInt2412 < 13312) {
						local10.method966(Static114.method1996(local10.anInt1294, local117.anInt2375, local117.anInt2412) - local10.anInt1284, local117.anInt2412, local117.anInt2375, Static15.anInt471);
					}
				}
				local10.method963(Static113.anInt1815);
				Static82.aClass68_1.method1765(Static15.anInt463, (int) local10.aDouble2, (int) local10.aDouble8, (int) local10.aDouble4, 60, local10, local10.anInt1278, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!nd;I)[I")
	public static int[] method1069(@OriginalArg(0) Class1_Sub1_Sub11 arg0) {
		@Pc(11) int local11 = arg0.anInt1717 >> 16;
		if (!Static1.method35(local11)) {
			return null;
		}
		@Pc(24) int local24 = arg0.anInt1690;
		@Pc(27) int local27 = arg0.anInt1702;
		@Pc(30) int local30 = arg0.anInt1739;
		while (local30 != -1) {
			@Pc(40) Class1_Sub1_Sub11 local40 = Static65.aClass1_Sub1_Sub11ArrayArray1[local11][local30 & 0xFFFF];
			local27 += local40.anInt1702 - local40.anInt1689;
			local30 = local40.anInt1739;
			local24 += local40.anInt1690 - local40.anInt1706;
		}
		return new int[] { local24, local27 };
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(IZ)Lclient!s;")
	public static Class1_Sub1_Sub13 method1071(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub1_Sub13 local15 = (Class1_Sub1_Sub13) Static101.aClass19_85.method410((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static44.aClass41_26.method1062(14, arg0);
		local15 = new Class1_Sub1_Sub13();
		if (local25 != null) {
			local15.method1541(new Class1_Sub6(local25));
		}
		Static101.aClass19_85.method409(local15, (long) arg0);
		return local15;
	}
}
