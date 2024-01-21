import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "[I")
	public static int[] anIntArray393 = new int[5];

	@OriginalMember(owner = "client!v", name = "p", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1300 = Static87.method1648("Hide");

	@OriginalMember(owner = "client!v", name = "g", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1297 = aClass27_1300;

	@OriginalMember(owner = "client!v", name = "i", descriptor = "I")
	public static int anInt2670 = 0;

	@OriginalMember(owner = "client!v", name = "j", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1298 = Static87.method1648("Abbrechen");

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1299 = Static87.method1648("Fertigkeit)2");

	@OriginalMember(owner = "client!v", name = "s", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1301 = Static87.method1648("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZJ)V")
	public static void method1838(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(8) InterruptedException local8) {
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I")
	public static int method1839(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(35) int local35 = Static2.method20(arg1 - 1, arg0 - 1) + Static2.method20(arg1 + 1, arg0 - 1) + Static2.method20(arg1 - 1, arg0 + 1) + Static2.method20(arg1 + 1, arg0 + 1);
		@Pc(76) int local76 = Static2.method20(arg1 - 1, arg0) + Static2.method20(arg1 + 1, arg0) + Static2.method20(arg1, arg0 - 1) + Static2.method20(arg1, arg0 + 1);
		@Pc(81) int local81 = Static2.method20(arg1, arg0);
		return local81 / 4 + local35 / 16 + local76 / 8;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	public static void method1840() {
		for (@Pc(6) Class3_Sub3_Sub1_Sub3 local6 = (Class3_Sub3_Sub1_Sub3) Static39.aClass28_8.method884(); local6 != null; local6 = (Class3_Sub3_Sub1_Sub3) Static39.aClass28_8.method875()) {
			if (Static68.anInt1747 != local6.anInt641 || local6.anInt627 < Static2.anInt38) {
				local6.method1883();
			} else if (Static2.anInt38 >= local6.anInt633) {
				if (local6.anInt642 > 0) {
					@Pc(50) Class3_Sub3_Sub1_Sub4_Sub1 local50 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local6.anInt642 - 1];
					if (local50 != null && local50.anInt2408 >= 0 && local50.anInt2408 < 13312 && local50.anInt2399 >= 0 && local50.anInt2399 < 13312) {
						local6.method481(local50.anInt2399, Static2.anInt38, Static48.method1675(local50.anInt2399, local6.anInt641, local50.anInt2408) - local6.anInt640, local50.anInt2408);
					}
				}
				if (local6.anInt642 < 0) {
					@Pc(97) int local97 = -local6.anInt642 - 1;
					@Pc(106) Class3_Sub3_Sub1_Sub4_Sub2 local106;
					if (Static53.anInt1423 == local97) {
						local106 = Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1;
					} else {
						local106 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local97];
					}
					if (local106 != null && local106.anInt2408 >= 0 && local106.anInt2408 < 13312 && local106.anInt2399 >= 0 && local106.anInt2399 < 13312) {
						local6.method481(local106.anInt2399, Static2.anInt38, Static48.method1675(local106.anInt2399, local6.anInt641, local106.anInt2408) - local6.anInt640, local106.anInt2408);
					}
				}
				local6.method483(Static39.anInt989);
				Static76.aClass18_1.method516(Static68.anInt1747, (int) local6.aDouble4, (int) local6.aDouble6, (int) local6.aDouble7, 60, local6, local6.anInt648, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!td;)I")
	public static int method1841(@OriginalArg(1) Class54 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1608(Static35.aClass27_426, Static102.aClass27_1293)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static80.aClass27_1033)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static94.aClass27_1220)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static33.aClass27_401)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static48.aClass27_1140)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static99.aClass27_1260)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static74.aClass27_976)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static87.aClass27_1104)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static53.aClass27_690)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static40.aClass27_585)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static109.aClass27_963)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static77.aClass27_1017)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static36.aClass27_438)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static109.aClass27_965)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static73.aClass27_939)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static88.aClass27_1145)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static93.aClass27_1219)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static69.aClass27_871)) {
			local5++;
		}
		if (arg0.method1608(Static35.aClass27_426, Static16.aClass27_191)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
	public static void method1842() {
		aClass27_1298 = null;
		aClass27_1299 = null;
		aClass27_1301 = null;
		aFont1 = null;
		anIntArray393 = null;
		aClass27_1297 = null;
		aClass27_1300 = null;
	}
}
