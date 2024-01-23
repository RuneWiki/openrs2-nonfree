import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
	public static int anInt4248 = 50;

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "I")
	public static int anInt4251 = 0;

	@OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
	public static int anInt4254 = 0;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
	public static void method3112() {
		Static14.aClass89_3.method2265();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
	public static void method3113() {
		Static140.aFont1 = null;
		Static98.aFontMetrics12 = null;
		Static196.anImage4 = null;
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	public static void method3115() {
		if (Static75.aClass191_4 != null || (Static238.aClass191_11 != null || Static47.anInt1141 > 0)) {
			return;
		}
		@Pc(24) int local24 = Static17.anInt472;
		@Pc(36) int local36;
		@Pc(88) int local88;
		if (!Static128.aBoolean171) {
			if (local24 == 1 && Static181.anInt3973 > 0) {
				@Pc(227) short local227 = Static86.aShortArray64[Static181.anInt3973 - 1];
				if (local227 == 21 || local227 == 17 || local227 == 22 || local227 == 41 || local227 == 4 || local227 == 38 || local227 == 42 || local227 == 25 || local227 == 60 || local227 == 57 || local227 == 33 || local227 == 1001) {
					local88 = Static256.anIntArray475[Static181.anInt3973 - 1];
					local36 = Static270.anIntArray485[Static181.anInt3973 - 1];
					@Pc(292) Class191 local292 = Static171.method2789(local88);
					@Pc(295) Class1_Sub30 local295 = Static35.method737(local292);
					if (local295.method4562() || local295.method4551()) {
						Static39.aBoolean71 = false;
						Static183.anInt4047 = 0;
						if (Static75.aClass191_4 != null) {
							Static40.method817(Static75.aClass191_4);
						}
						Static75.aClass191_4 = Static171.method2789(local88);
						Static200.anInt4363 = local36;
						Static149.anInt3345 = Static89.anInt5976;
						Static234.anInt4914 = Static94.anInt2165;
						Static40.method817(Static75.aClass191_4);
						return;
					}
				}
			}
			if (local24 == 1 && (Static102.anInt849 == 1 && Static181.anInt3973 > 2 || Static300.method4578(Static181.anInt3973 - 1))) {
				local24 = 2;
			}
			if (local24 == 2 && Static181.anInt3973 > 0 || Static163.anInt3550 == 1) {
				Static301.method3612();
			}
			if (local24 == 1 && Static181.anInt3973 > 0 || Static163.anInt3550 == 2) {
				Static103.method1723();
			}
			return;
		}
		@Pc(34) int local34;
		if (local24 != 1) {
			local34 = Static89.anInt5974;
			local36 = Static289.anInt5816;
			if (Static96.anInt2211 - 10 > local34 || local34 > Static96.anInt2211 + Static60.anInt1307 + 10 || Static303.anInt6021 - 10 > local36 || Static303.anInt6021 + Static175.anInt266 + 10 < local36) {
				Static128.aBoolean171 = false;
				Static155.method2520(Static96.anInt2211, Static303.anInt6021, Static60.anInt1307, Static175.anInt266);
			}
		}
		if (local24 != 1) {
			return;
		}
		local36 = Static303.anInt6021;
		local88 = Static60.anInt1307;
		@Pc(90) int local90 = Static94.anInt2165;
		@Pc(92) int local92 = -1;
		local34 = Static96.anInt2211;
		@Pc(96) int local96 = Static89.anInt5976;
		for (@Pc(98) int local98 = 0; local98 < Static181.anInt3973; local98++) {
			@Pc(116) int local116;
			if (Static161.aBoolean230) {
				local116 = (Static181.anInt3973 - local98 - 1) * 15 + local36 + 33;
				if (local34 < local96 && local96 < local34 + local88 && local116 - 13 < local90 && local116 + 3 > local90) {
					local92 = local98;
				}
			} else {
				local116 = (Static181.anInt3973 - local98 - 1) * 15 + local36 + 31;
				if (local96 > local34 && local88 + local34 > local96 && local90 > local116 - 13 && local90 < local116 + 3) {
					local92 = local98;
				}
			}
		}
		if (local92 != -1) {
			Static108.method1780(local92);
		}
		Static128.aBoolean171 = false;
		Static155.method2520(Static96.anInt2211, Static303.anInt6021, Static60.anInt1307, Static175.anInt266);
	}
}
