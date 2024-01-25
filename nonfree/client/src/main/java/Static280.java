import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray175;

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_32 = new Class211();

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "Lclient!vq;")
	public static final Class211 aClass211_33 = new Class211();

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	public static void method4828() {
		Static298.method5108(Static350.aClass132_20);
		Static296.anInt5972++;
		if (Static346.aBoolean419 && Static95.aBoolean127) {
			@Pc(26) int local26 = Static7.anInt149;
			@Pc(28) int local28 = Static79.anInt1449;
			local26 -= Static63.anInt1136;
			local28 -= Static336.anInt6135;
			if (local26 < Static265.anInt4935) {
				local26 = Static265.anInt4935;
			}
			if (Static350.aClass132_20.anInt3507 + local26 > Static265.anInt4935 + Static214.aClass132_14.anInt3507) {
				local26 = Static265.anInt4935 + Static214.aClass132_14.anInt3507 - Static350.aClass132_20.anInt3507;
			}
			if (Static175.anInt3297 > local28) {
				local28 = Static175.anInt3297;
			}
			if (Static175.anInt3297 + Static214.aClass132_14.anInt3503 < local28 - -Static350.aClass132_20.anInt3503) {
				local28 = Static175.anInt3297 + Static214.aClass132_14.anInt3503 - Static350.aClass132_20.anInt3503;
			}
			@Pc(104) int local104 = local26 - Static339.anInt6180;
			@Pc(113) int local113 = local28 - Static323.anInt5958;
			@Pc(116) int local116 = Static350.aClass132_20.anInt3576;
			if (Static350.aClass132_20.anInt3548 < Static296.anInt5972 && (local104 > local116 || -local116 > local104 || local113 > local116 || -local116 > local113)) {
				Static192.aBoolean276 = true;
			}
			@Pc(156) int local156 = Static214.aClass132_14.anInt3522 + local26 - Static265.anInt4935;
			@Pc(165) int local165 = local28 + Static214.aClass132_14.anInt3578 - Static175.anInt3297;
			@Pc(174) Class6_Sub15 local174;
			if (Static350.aClass132_20.anObjectArray21 != null && Static192.aBoolean276) {
				local174 = new Class6_Sub15();
				local174.anObjectArray2 = Static350.aClass132_20.anObjectArray21;
				local174.anInt1907 = local156;
				local174.anInt1916 = local165;
				local174.aClass132_5 = Static350.aClass132_20;
				Static140.method2654(local174);
			}
			if (Static193.anInt3653 == 0) {
				if (Static192.aBoolean276) {
					if (Static350.aClass132_20.anObjectArray17 != null) {
						local174 = new Class6_Sub15();
						local174.aClass132_6 = Static296.aClass132_19;
						local174.anObjectArray2 = Static350.aClass132_20.anObjectArray17;
						local174.anInt1916 = local165;
						local174.aClass132_5 = Static350.aClass132_20;
						local174.anInt1907 = local156;
						Static140.method2654(local174);
					}
					if (Static296.aClass132_19 != null && Static43.method755(Static350.aClass132_20) != null) {
						Static131.aClass6_Sub10_Sub1_2.method2886(59);
						Static131.aClass6_Sub10_Sub1_2.method3976(Static350.aClass132_20.anInt3551);
						Static131.aClass6_Sub10_Sub1_2.method4006(Static296.aClass132_19.anInt3551);
						Static131.aClass6_Sub10_Sub1_2.method3984(Static350.aClass132_20.anInt3555);
						Static131.aClass6_Sub10_Sub1_2.method3961(Static296.aClass132_19.anInt3555);
					}
				} else if ((Static118.anInt2251 == 1 || Static313.method5292()) && Static256.anInt4749 > 2) {
					Static282.method4847(2);
				} else if (Static165.method5485()) {
					Static282.method4847(1);
				}
				Static350.aClass132_20 = null;
			}
		} else if (Static296.anInt5972 > 1) {
			Static350.aClass132_20 = null;
		}
	}
}
