import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	public static void method2518() {
		for (@Pc(7) int local7 = 0; local7 < Static540.anInt8911; local7++) {
			Static82.aClass91Array1[local7] = null;
		}
		Static540.anInt8911 = 0;
		@Pc(25) int local25;
		@Pc(29) int local29;
		for (@Pc(21) int local21 = 0; local21 < Static450.anInt7223; local21++) {
			for (local25 = 0; local25 < Static83.anInt1434; local25++) {
				for (local29 = 0; local29 < Static405.anInt6657; local29++) {
					@Pc(39) Class228 local39 = Static469.aClass228ArrayArrayArray6[local21][local29][local25];
					if (local39 != null) {
						if (local39.aShort83 > 0) {
							local39.aShort83 = (short) (local39.aShort83 * -1);
						}
						if (local39.aShort80 > 0) {
							local39.aShort80 = (short) (local39.aShort80 * -1);
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < Static450.anInt7223; local25++) {
			for (local29 = 0; local29 < Static83.anInt1434; local29++) {
				for (@Pc(90) int local90 = 0; local90 < Static405.anInt6657; local90++) {
					@Pc(100) Class228 local100 = Static469.aClass228ArrayArrayArray6[local25][local90][local29];
					if (local100 != null) {
						@Pc(123) boolean local123 = Static469.aClass228ArrayArrayArray6[0][local90][local29] != null && Static469.aClass228ArrayArrayArray6[0][local90][local29].aClass228_1 != null;
						@Pc(131) int local131;
						@Pc(133) int local133;
						@Pc(147) Class228 local147;
						@Pc(155) int local155;
						@Pc(307) int local307;
						@Pc(321) int local321;
						@Pc(328) int local328;
						@Pc(344) int local344;
						@Pc(351) int local351;
						@Pc(355) int local355;
						@Pc(359) int local359;
						@Pc(365) int local365;
						@Pc(404) int local404;
						@Pc(408) int local408;
						if (local100.aShort80 < 0) {
							local131 = local29;
							local133 = local29;
							local147 = Static469.aClass228ArrayArrayArray6[local25][local90][local29 - 1];
							local155 = Static261.aClass151Array2[local25].method7676(local29, local90);
							while (local131 > 0 && local147 != null && local147.aShort80 < 0 && local100.aShort80 == local147.aShort80 && local100.aShort82 == local147.aShort82 && local155 == Static261.aClass151Array2[local25].method7676(local131 - 1, local90) && (local131 - 1 <= 0 || Static261.aClass151Array2[local25].method7676(local131 - 2, local90) == local155)) {
								local131--;
								local147 = Static469.aClass228ArrayArrayArray6[local25][local90][local131 - 1];
							}
							for (local147 = Static469.aClass228ArrayArrayArray6[local25][local90][local29 + 1]; local133 < Static405.anInt6657 && local147 != null && local147.aShort80 < 0 && local100.aShort80 == local147.aShort80 && local147.aShort82 == local100.aShort82 && Static261.aClass151Array2[local25].method7676(local133 + 1, local90) == local155 && (local133 + 1 >= Static405.anInt6657 || Static261.aClass151Array2[local25].method7676(local133 + 2, local90) == local155); local147 = Static469.aClass228ArrayArrayArray6[local25][local90][local133 + 1]) {
								local133++;
							}
							local307 = local25 + 1 - local25;
							local321 = Static261.aClass151Array2[local123 ? local25 + 1 : local25].method7676(local131, local90);
							local328 = local321 + local100.aShort80 * local307;
							local344 = Static261.aClass151Array2[local123 ? local25 + 1 : local25].method7676(local133 + 1, local90);
							local351 = local307 * local100.aShort80 + local344;
							local355 = local90 << Static562.anInt9207;
							local359 = local131 << Static562.anInt9207;
							local365 = Static481.anInt7681 + (local133 << Static562.anInt9207);
							Static82.aClass91Array1[Static540.anInt8911++] = new Class91(1, local25, local355 + local100.aShort82, local100.aShort82 + local355, local100.aShort82 + local355, local355 - -local100.aShort82, local321, local344, local351, local328, local359, local365, local365, local359);
							for (local404 = local25; local404 <= local25; local404++) {
								for (local408 = local131; local408 <= local133; local408++) {
									Static469.aClass228ArrayArrayArray6[local404][local90][local408].aShort80 = (short) (Static469.aClass228ArrayArrayArray6[local404][local90][local408].aShort80 * -1);
								}
							}
						}
						if (local100.aShort83 < 0) {
							local131 = local90;
							local133 = local90;
							local147 = Static469.aClass228ArrayArrayArray6[local25][local90 - 1][local29];
							local155 = Static261.aClass151Array2[local25].method7676(local29, local90);
							while (local131 > 0 && local147 != null && local147.aShort83 < 0 && local100.aShort83 == local147.aShort83 && local100.aShort81 == local147.aShort81 && Static261.aClass151Array2[local25].method7676(local29, local131 - 1) == local155 && (local131 - 1 <= 0 || Static261.aClass151Array2[local25].method7676(local29, local131 - 2) == local155)) {
								local131--;
								local147 = Static469.aClass228ArrayArrayArray6[local25][local131 - 1][local29];
							}
							for (local147 = Static469.aClass228ArrayArrayArray6[local25][local90 + 1][local29]; Static83.anInt1434 > local133 && local147 != null && local147.aShort83 < 0 && local100.aShort83 == local147.aShort83 && local147.aShort81 == local100.aShort81 && local155 == Static261.aClass151Array2[local25].method7676(local29, local133 + 1) && (local133 + 1 >= Static83.anInt1434 || Static261.aClass151Array2[local25].method7676(local29, local133 + 2) == local155); local147 = Static469.aClass228ArrayArrayArray6[local25][local133 + 1][local29]) {
								local133++;
							}
							local307 = local25 + 1 - local25;
							local321 = Static261.aClass151Array2[local123 ? local25 + 1 : local25].method7676(local29, local131);
							local328 = local307 * local100.aShort83 + local321;
							local344 = Static261.aClass151Array2[local123 ? local25 + 1 : local25].method7676(local29, local133 + 1);
							local351 = local344 + local100.aShort83 * local307;
							local355 = local131 << Static562.anInt9207;
							local359 = (local133 << Static562.anInt9207) + Static481.anInt7681;
							local365 = local29 << Static562.anInt9207;
							Static82.aClass91Array1[Static540.anInt8911++] = new Class91(2, local25, local355, local359, local359, local355, local321, local344, local351, local328, local365 + local100.aShort81, local365 + local100.aShort81, local365 + local100.aShort81, local365 - -local100.aShort81);
							for (local404 = local25; local404 <= local25; local404++) {
								for (local408 = local131; local408 <= local133; local408++) {
									Static469.aClass228ArrayArrayArray6[local404][local408][local29].aShort83 = (short) (Static469.aClass228ArrayArrayArray6[local404][local408][local29].aShort83 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static251.aBoolean314 = true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
	public static void method2519() {
		Static392.method5404(Static450.anInt7223);
	}
}
