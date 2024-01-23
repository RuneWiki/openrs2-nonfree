import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Lclient!hc;")
	public static Class51 aClass51_17;

	@OriginalMember(owner = "client!df", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "I")
	public static int anInt1360;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "I")
	public static int anInt1359 = 0;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)V")
	public static void method948() {
		Static87.aClass79_13.method2479(5);
		Static266.aClass79_40.method2479(5);
		Static210.aClass79_30.method2479(5);
		Static218.aClass79_33.method2479(5);
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	public static void method949() {
		if (Static138.anInt3362 == 2) {
			if (Static60.anInt1650 == Static221.anInt4838 && Static261.anInt5478 == Static242.anInt5237) {
				Static138.anInt3362 = 0;
				if (Static202.aBoolean219 && Static124.aBooleanArray7[81] && Static230.anInt5417 > 2) {
					Static54.method1048(Static230.anInt5417 - 2);
				} else {
					Static54.method1048(Static230.anInt5417 - 1);
				}
			}
		} else if (Static256.anInt5442 == Static221.anInt4838 && Static242.anInt5237 == Static133.anInt3300) {
			Static138.anInt3362 = 0;
			if (Static202.aBoolean219 && Static124.aBooleanArray7[81] && Static230.anInt5417 > 2) {
				Static54.method1048(Static230.anInt5417 - 2);
			} else {
				Static54.method1048(Static230.anInt5417 - 1);
			}
		} else {
			Static60.anInt1650 = Static256.anInt5442;
			Static261.anInt5478 = Static133.anInt3300;
			Static138.anInt3362 = 2;
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(B)V")
	public static void method950() {
		Static257.method4146(Static63.aClass122_7);
		Static21.anInt739++;
		if (Static51.aBoolean85 && Static66.aBoolean102) {
			@Pc(24) int local24 = Static71.anInt1930;
			local24 -= Static198.anInt4594;
			if (local24 < Static143.anInt3477) {
				local24 = Static143.anInt3477;
			}
			if (Static143.anInt3477 + Static37.aClass122_2.anInt4695 < local24 + Static63.aClass122_7.anInt4695) {
				local24 = Static143.anInt3477 + Static37.aClass122_2.anInt4695 - Static63.aClass122_7.anInt4695;
			}
			@Pc(66) int local66 = local24 - Static15.anInt535;
			@Pc(68) int local68 = Static240.anInt5167;
			local68 -= Static181.anInt4153;
			if (Static138.anInt3358 > local68) {
				local68 = Static138.anInt3358;
			}
			@Pc(80) int local80 = Static63.aClass122_7.anInt4717;
			@Pc(88) int local88 = Static37.aClass122_2.anInt4673 + local24 - Static143.anInt3477;
			if (Static138.anInt3358 + Static37.aClass122_2.anInt4726 < Static63.aClass122_7.anInt4726 + local68) {
				local68 = Static37.aClass122_2.anInt4726 + Static138.anInt3358 - Static63.aClass122_7.anInt4726;
			}
			@Pc(115) int local115 = local68 - Static2.anInt32;
			@Pc(122) int local122 = Static37.aClass122_2.anInt4653 + local68 - Static138.anInt3358;
			if (Static21.anInt739 > Static63.aClass122_7.anInt4646 && (local80 < local66 || local66 < -local80 || local115 > local80 || -local80 > local115)) {
				Static255.aBoolean276 = true;
			}
			@Pc(167) Class1_Sub30 local167;
			if (Static63.aClass122_7.anObjectArray12 != null && Static255.aBoolean276) {
				local167 = new Class1_Sub30();
				local167.aClass122_18 = Static63.aClass122_7;
				local167.anInt5439 = local88;
				local167.anInt5445 = local122;
				local167.anObjectArray32 = Static63.aClass122_7.anObjectArray12;
				Static153.method2746(local167);
			}
			if (Static248.anInt5322 == 0) {
				if (Static255.aBoolean276) {
					if (Static63.aClass122_7.anObjectArray24 != null) {
						local167 = new Class1_Sub30();
						local167.aClass122_19 = Static150.aClass122_13;
						local167.anInt5439 = local88;
						local167.anInt5445 = local122;
						local167.aClass122_18 = Static63.aClass122_7;
						local167.anObjectArray32 = Static63.aClass122_7.anObjectArray24;
						Static153.method2746(local167);
					}
					if (Static150.aClass122_13 != null && Static39.method712(Static63.aClass122_7) != null) {
						Static171.aClass1_Sub13_Sub1_3.method1825(236);
						Static171.aClass1_Sub13_Sub1_3.method1808(Static63.aClass122_7.anInt4686);
						Static171.aClass1_Sub13_Sub1_3.method1789(Static150.aClass122_13.anInt4662);
						Static171.aClass1_Sub13_Sub1_3.method1754(Static150.aClass122_13.anInt4686);
						Static171.aClass1_Sub13_Sub1_3.method1789(Static63.aClass122_7.anInt4662);
					}
				} else if ((Static15.anInt527 == 1 || Static143.method2604(Static230.anInt5417 - 1)) && Static230.anInt5417 > 2) {
					Static249.method4057();
				} else if (Static230.anInt5417 > 0) {
					method949();
				}
				Static63.aClass122_7 = null;
			}
		} else if (Static21.anInt739 > 1) {
			Static63.aClass122_7 = null;
		}
	}
}
