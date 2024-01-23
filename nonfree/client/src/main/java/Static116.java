import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
	public static int anInt2571;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array7;

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_693 = Static231.method3737("hint_mapedge");

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_694 = null;

	@OriginalMember(owner = "client!kk", name = "n", descriptor = "Lclient!jd;")
	public static Class61 aClass61_47 = new Class61(50);

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
	public static int anInt2569 = 0;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "Lclient!sc;")
	public static Class107 aClass107_695 = Static231.method3737("gr-Un:");

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!ed;B)V")
	public static void method2006(@OriginalArg(0) Class5_Sub5_Sub1 arg0) {
		@Pc(20) Class1_Sub21 local20 = (Class1_Sub21) Static59.aClass50_10.method1364(arg0.aClass107_351.method3066());
		if (local20 == null) {
			return;
		}
		if (local20.aClass1_Sub6_Sub3_3 != null) {
			Static42.aClass1_Sub6_Sub1_1.method966(local20.aClass1_Sub6_Sub3_3);
			local20.aClass1_Sub6_Sub3_3 = null;
		}
		local20.method3735();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	public static void method2010() {
		for (@Pc(14) Class1_Sub2_Sub4 local14 = (Class1_Sub2_Sub4) Static13.aClass120_2.method3564(); local14 != null; local14 = (Class1_Sub2_Sub4) Static13.aClass120_2.method3561()) {
			@Pc(23) Class5_Sub4 local23 = local14.aClass5_Sub4_1;
			if (Static191.anInt4237 != local23.anInt1065 || local23.anInt1048 < Static128.anInt2802) {
				local14.method3735();
			} else if (local23.anInt1071 <= Static128.anInt2802) {
				if (local23.anInt1053 > 0) {
					@Pc(54) Class5_Sub5_Sub2 local54 = Static33.aClass5_Sub5_Sub2Array1[local23.anInt1053 - 1];
					if (local54 != null && local54.anInt3021 >= 0 && local54.anInt3021 < 13312 && local54.anInt3044 >= 0 && local54.anInt3044 < 13312) {
						local23.method928(Static130.method2174(local23.anInt1065, local54.anInt3044, local54.anInt3021) - local23.anInt1047, local54.anInt3044, local54.anInt3021, Static128.anInt2802);
					}
				}
				if (local23.anInt1053 < 0) {
					@Pc(102) int local102 = -local23.anInt1053 - 1;
					@Pc(111) Class5_Sub5_Sub1 local111;
					if (local102 == Static137.anInt2980) {
						local111 = Static204.aClass5_Sub5_Sub1_2;
					} else {
						local111 = Static198.aClass5_Sub5_Sub1Array1[local102];
					}
					if (local111 != null && local111.anInt3021 >= 0 && local111.anInt3021 < 13312 && local111.anInt3044 >= 0 && local111.anInt3044 < 13312) {
						local23.method928(Static130.method2174(local23.anInt1065, local111.anInt3044, local111.anInt3021) - local23.anInt1047, local111.anInt3044, local111.anInt3021, Static128.anInt2802);
					}
				}
				local23.method921(Static204.anInt2498);
				Static58.method1127(Static191.anInt4237, (int) local23.aDouble5, (int) local23.aDouble2, (int) local23.aDouble7, 60, local23, local23.anInt1042, -1L, false);
			}
		}
	}
}
