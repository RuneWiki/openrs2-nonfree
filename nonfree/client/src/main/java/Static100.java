import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!te", name = "rb", descriptor = "Lclient!bd;")
	public static Class8 aClass8_25;

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array25 = new Class1[200];

	@OriginalMember(owner = "client!te", name = "ib", descriptor = "[Lclient!a;")
	public static Class1[] aClass1Array26 = new Class1[1000];

	@OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
	public static int anInt2544 = 0;

	@OriginalMember(owner = "client!te", name = "qb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2675 = Static94.method1596("headicons_pk");

	@OriginalMember(owner = "client!te", name = "sb", descriptor = "I")
	public static int anInt2546 = 0;

	@OriginalMember(owner = "client!te", name = "tb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2676 = Static94.method1596("::fpsoff");

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Lclient!a;")
	public static Class1 method1678(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static43.method994(arg0) : Static32.aClass1_1210;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
	public static void method1679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
			if (Static67.aClass1Array29[local14] != null) {
				@Pc(24) int local24 = Static111.anIntArray351[local14];
				@Pc(35) int local35 = Static44.anInt1515 + 4 + 70 - local12 * 14;
				if (local35 < -20) {
					break;
				}
				if (local24 == 0) {
					local12++;
				}
				@Pc(45) Class1 local45 = Static107.aClass1Array28[local14];
				if (local45 != null && local45.method26(Static85.aClass1_2374)) {
					local45 = local45.method1(5);
				}
				if (local45 != null && local45.method26(Static83.aClass1_2344)) {
					local45 = local45.method1(5);
				}
				if ((local24 == 1 || local24 == 2) && (local24 == 1 || Static63.anInt1889 == 0 || Static63.anInt1889 == 1 && Static11.method410(local45))) {
					if (arg1 > local35 - 14 && arg1 <= local35 && !local45.method5(Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass1_264)) {
						if (Static32.anInt1240 >= 1) {
							Static29.method758(0, Static33.aClass1_1229, 0, 0, 28, Static97.method1655(new Class1[] { Static47.aClass1_1511, local45 }));
						}
						Static29.method758(0, Static66.aClass1_2453, 0, 0, 51, Static97.method1655(new Class1[] { Static47.aClass1_1511, local45 }));
						Static29.method758(0, Static46.aClass1_1502, 0, 0, 45, Static97.method1655(new Class1[] { Static47.aClass1_1511, local45 }));
					}
					local12++;
				}
				if ((local24 == 3 || local24 == 7) && Static5.anInt403 == 0 && (local24 == 7 || Static6.anInt409 == 0 || Static6.anInt409 == 1 && Static11.method410(local45))) {
					local12++;
					if (arg1 > local35 - 14 && arg1 <= local35) {
						if (Static32.anInt1240 >= 1) {
							Static29.method758(0, Static33.aClass1_1229, 0, 0, 28, Static97.method1655(new Class1[] { Static47.aClass1_1511, local45 }));
						}
						Static29.method758(0, Static66.aClass1_2453, 0, 0, 51, Static97.method1655(new Class1[] { Static47.aClass1_1511, local45 }));
						Static29.method758(0, Static46.aClass1_1502, 0, 0, 45, Static97.method1655(new Class1[] { Static47.aClass1_1511, local45 }));
					}
				}
				if (local24 == 4 && (Static96.anInt2420 == 0 || Static96.anInt2420 == 1 && Static11.method410(local45))) {
					if (arg1 > local35 - 14 && arg1 <= local35) {
						Static29.method758(0, Static85.aClass1_2372, 0, 0, 26, Static97.method1655(new Class1[] { Static47.aClass1_1511, local45 }));
					}
					local12++;
				}
				if ((local24 == 5 || local24 == 6) && Static5.anInt403 == 0 && Static6.anInt409 < 2) {
					local12++;
				}
				if (local24 == 8 && (Static96.anInt2420 == 0 || Static96.anInt2420 == 1 && Static11.method410(local45))) {
					if (local35 - 14 < arg1 && arg1 <= local35) {
						Static29.method758(0, Static48.aClass1_1571, 0, 0, 46, Static97.method1655(new Class1[] { Static47.aClass1_1511, local45 }));
					}
					local12++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	public static void method1680() {
		aClass1Array26 = null;
		aClass8_25 = null;
		aClass1_2676 = null;
		aClass1_2675 = null;
		aClass1Array25 = null;
	}
}
