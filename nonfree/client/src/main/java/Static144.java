import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lclient!hc;")
	public static Class1_Sub6 aClass1_Sub6_5;

	@OriginalMember(owner = "client!sb", name = "db", descriptor = "[I")
	public static int[] anIntArray371;

	@OriginalMember(owner = "client!sb", name = "tb", descriptor = "Lclient!p;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
	public static int anInt3993 = 10;

	@OriginalMember(owner = "client!sb", name = "eb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1015 = Static8.method128("This computers address has been blocked");

	@OriginalMember(owner = "client!sb", name = "qb", descriptor = "Lclient!ea;")
	private static Class18 aClass18_1018 = Static8.method128("Use");

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1016 = aClass18_1018;

	@OriginalMember(owner = "client!sb", name = "ib", descriptor = "[[I")
	public static int[][] anIntArrayArray114 = new int[104][104];

	@OriginalMember(owner = "client!sb", name = "jb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray8 = new int[4][13][13];

	@OriginalMember(owner = "client!sb", name = "mb", descriptor = "I")
	public static int anInt3998 = 0;

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1017 = aClass18_1015;

	@OriginalMember(owner = "client!sb", name = "rb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1019 = Static8.method128("sl_back");

	@OriginalMember(owner = "client!sb", name = "ub", descriptor = "I")
	public static int anInt4001 = 0;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
	public static void method2732() {
		aClass18_1019 = null;
		aClass18_1018 = null;
		aClass56_1 = null;
		aClass18_1017 = null;
		aClass18_1016 = null;
		anIntArrayArrayArray8 = null;
		aClass18_1015 = null;
		anIntArray371 = null;
		anIntArrayArray114 = null;
		aClass1_Sub6_5 = null;
	}

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)V")
	public static void method2733() {
		for (@Pc(10) Class1_Sub1_Sub5_Sub2 local10 = (Class1_Sub1_Sub5_Sub2) Static40.aClass59_16.method2417(); local10 != null; local10 = (Class1_Sub1_Sub5_Sub2) Static40.aClass59_16.method2424()) {
			if (Static9.anInt295 != local10.anInt987 || Static41.anInt1322 > local10.anInt991) {
				local10.method3198();
			} else if (local10.anInt983 <= Static41.anInt1322) {
				if (local10.anInt981 > 0) {
					@Pc(44) Class1_Sub1_Sub5_Sub1_Sub1 local44 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[local10.anInt981 - 1];
					if (local44 != null && local44.anInt3579 >= 0 && local44.anInt3579 < 13312 && local44.anInt3558 >= 0 && local44.anInt3558 < 13312) {
						local10.method646(local44.anInt3579, Static41.anInt1322, local44.anInt3558, Static34.method728(local10.anInt987, local44.anInt3558, local44.anInt3579) - local10.anInt988);
					}
				}
				if (local10.anInt981 < 0) {
					@Pc(97) int local97 = -local10.anInt981 - 1;
					@Pc(106) Class1_Sub1_Sub5_Sub1_Sub2 local106;
					if (Static40.anInt1308 == local97) {
						local106 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1;
					} else {
						local106 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local97];
					}
					if (local106 != null && local106.anInt3579 >= 0 && local106.anInt3579 < 13312 && local106.anInt3558 >= 0 && local106.anInt3558 < 13312) {
						local10.method646(local106.anInt3579, Static41.anInt1322, local106.anInt3558, Static34.method728(local10.anInt987, local106.anInt3558, local106.anInt3579) - local10.anInt988);
					}
				}
				local10.method643(Static180.anInt4776);
				Static87.aClass68_1.method2656(Static9.anInt295, (int) local10.aDouble8, (int) local10.aDouble7, (int) local10.aDouble1, 60, local10, local10.anInt993, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "(I)V")
	public static void method2734() {
		if (Static27.aBoolean26 && Static99.anInt3024 != Static9.anInt295) {
			Static121.method2376(Static47.anInt4242, Static48.anInt1566, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray315[0], Static9.anInt295, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray314[0]);
		} else if (Static168.anInt4561 != Static9.anInt295) {
			Static168.anInt4561 = Static9.anInt295;
			Static72.method1548(Static9.anInt295);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[Lclient!ea;)Lclient!ea;")
	public static Class18 method2735(@OriginalArg(1) Class18[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static97.method2116(arg0.length, 0, arg0);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZI)Lclient!ea;")
	public static Class18 method2736(@OriginalArg(0) int arg0) {
		return Static73.method1249(arg0, true);
	}
}
