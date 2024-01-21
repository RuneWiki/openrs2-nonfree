import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public static int anInt3420;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
	public static final int[] anIntArray388 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1961 = Static118.method2249("Walk here");

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1959 = aClass65_1961;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public static int anInt3419 = 0;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1960 = Static118.method2249("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1962 = Static118.method2249("auf der Hautpseite)3");

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1963 = Static118.method2249(" )2> ");

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1964 = Static118.method2249("purple:");

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1965 = aClass65_1964;

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1966 = aClass65_1964;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method2611() {
		for (@Pc(10) Class1_Sub2_Sub16 local10 = (Class1_Sub2_Sub16) Static78.aClass91_6.method3148(); local10 != null; local10 = (Class1_Sub2_Sub16) Static78.aClass91_6.method3150()) {
			@Pc(15) Class6_Sub5 local15 = local10.aClass6_Sub5_1;
			if (local15.anInt2391 != Static207.anInt4425 || Static174.anInt3887 > local15.anInt2393) {
				local10.method3295();
			} else if (local15.anInt2410 <= Static174.anInt3887) {
				if (local15.anInt2397 > 0) {
					@Pc(50) Class6_Sub4_Sub2 local50 = Static106.aClass6_Sub4_Sub2Array1[local15.anInt2397 - 1];
					if (local50 != null && local50.anInt3934 >= 0 && local50.anInt3934 < 13312 && local50.anInt3976 >= 0 && local50.anInt3976 < 13312) {
						local15.method1823(local50.anInt3934, Static174.anInt3887, Static171.method2896(local50.anInt3934, local15.anInt2391, local50.anInt3976) - local15.anInt2400, local50.anInt3976);
					}
				}
				if (local15.anInt2397 < 0) {
					@Pc(105) int local105 = -local15.anInt2397 - 1;
					@Pc(110) Class6_Sub4_Sub1 local110;
					if (Static142.anInt3429 == local105) {
						local110 = Static201.aClass6_Sub4_Sub1_3;
					} else {
						local110 = Static158.aClass6_Sub4_Sub1Array1[local105];
					}
					if (local110 != null && local110.anInt3934 >= 0 && local110.anInt3934 < 13312 && local110.anInt3976 >= 0 && local110.anInt3976 < 13312) {
						local15.method1823(local110.anInt3934, Static174.anInt3887, Static171.method2896(local110.anInt3934, local15.anInt2391, local110.anInt3976) - local15.anInt2400, local110.anInt3976);
					}
				}
				local15.method1817(Static160.anInt2781);
				Static133.method2536(Static207.anInt4425, (int) local15.aDouble6, (int) local15.aDouble5, (int) local15.aDouble2, 60, local15, local15.anInt2392, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!oc;I)Lclient!oc;")
	public static Class65 method2612(@OriginalArg(0) Class65 arg0) {
		@Pc(12) Class1_Sub10 local12 = Static39.method691(arg0);
		return local12 == null ? Static81.aClass65_1216 : local12.aClass65_1134;
	}
}
