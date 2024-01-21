import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Lclient!gd;")
	public static Class27 aClass27_47;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt2839;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "[I")
	public static int[] anIntArray411;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!na;")
	public static Class53 aClass53_1407 = Static109.method1737("");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!na;")
	public static Class53 aClass53_1404 = aClass53_1407;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	public static int anInt2837 = -1;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!na;")
	private static Class53 aClass53_1405 = Static109.method1737("Loading game screen )2 ");

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!na;")
	public static Class53 aClass53_1406 = aClass53_1407;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!na;")
	public static Class53 aClass53_1408 = aClass53_1407;

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_1409 = aClass53_1407;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "Lclient!na;")
	public static Class53 aClass53_1410 = Static109.method1737("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_1411 = Static109.method1737("null");

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "Lclient!na;")
	public static Class53 aClass53_1412 = aClass53_1407;

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Lclient!na;")
	public static Class53 aClass53_1413 = aClass53_1407;

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1414 = aClass53_1405;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	public static void method1944() {
		aClass53_1412 = null;
		aClass53_1409 = null;
		anIntArray411 = null;
		aClass53_1407 = null;
		aClass53_1410 = null;
		aClass53_1413 = null;
		aClass53_1408 = null;
		aClass27_47 = null;
		aClass53_1405 = null;
		aClass53_1411 = null;
		aClass53_1406 = null;
		aClass53_1414 = null;
		aClass53_1404 = null;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V")
	public static void method1945() {
		for (@Pc(10) Class3_Sub16 local10 = (Class3_Sub16) Static49.aClass11_7.method189(); local10 != null; local10 = (Class3_Sub16) Static49.aClass11_7.method187()) {
			if (local10.anInt2509 > 0) {
				local10.anInt2509--;
			}
			if (local10.anInt2509 != 0) {
				if (local10.anInt2510 > 0) {
					local10.anInt2510--;
				}
				if (local10.anInt2510 == 0 && local10.anInt2507 >= 1 && local10.anInt2496 >= 1 && local10.anInt2507 <= 102 && local10.anInt2496 <= 102 && (local10.anInt2503 < 0 || Static44.method880(local10.anInt2498, local10.anInt2503))) {
					Static50.method1916(local10.anInt2503, local10.anInt2496, local10.anInt2507, local10.anInt2493, local10.anInt2504, local10.anInt2498, local10.anInt2508);
					local10.anInt2510 = -1;
					if (local10.anInt2503 == local10.anInt2505 && local10.anInt2505 == -1) {
						local10.method1962();
					} else if (local10.anInt2503 == local10.anInt2505 && local10.anInt2508 == local10.anInt2497 && local10.anInt2500 == local10.anInt2498) {
						local10.method1962();
					}
				}
			} else if (local10.anInt2505 < 0 || Static44.method880(local10.anInt2500, local10.anInt2505)) {
				Static50.method1916(local10.anInt2505, local10.anInt2496, local10.anInt2507, local10.anInt2493, local10.anInt2504, local10.anInt2500, local10.anInt2497);
				local10.method1962();
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!na;B)V")
	public static void method1946(@OriginalArg(0) Class53 arg0) {
		if (arg0 == null || arg0.method1294() == 0) {
			Static49.anInt1322 = 0;
			return;
		}
		@Pc(24) Class53[] local24 = new Class53[100];
		@Pc(26) Class53 local26 = arg0;
		@Pc(28) int local28 = 0;
		while (true) {
			@Pc(33) int local33 = local26.method1283();
			if (local33 == -1) {
				local26 = local26.method1256();
				if (local26.method1294() > 0) {
					local24[local28++] = local26.method1269();
				}
				Static49.anInt1322 = 0;
				label46: for (local33 = 0; local33 < Static96.anInt1474; local33++) {
					@Pc(100) Class3_Sub1_Sub8 local100 = Static2.method38(local33);
					if (local100.anInt1608 == -1 && local100.aClass53_706 != null) {
						@Pc(113) Class53 local113 = local100.aClass53_706.method1269();
						for (@Pc(115) int local115 = 0; local115 < local28; local115++) {
							if (local113.method1281(local24[local115]) == -1) {
								continue label46;
							}
						}
						Static9.aClass53Array2[Static49.anInt1322] = local113;
						Static31.anIntArray114[Static49.anInt1322] = local33;
						Static49.anInt1322++;
						if (Static9.aClass53Array2.length <= Static49.anInt1322) {
							return;
						}
					}
				}
				return;
			}
			@Pc(67) Class53 local67 = local26.method1267(local33, 0).method1256();
			if (local67.method1294() > 0) {
				local24[local28++] = local67.method1269();
			}
			local26 = local26.method1289(local33 + 1);
		}
	}
}
