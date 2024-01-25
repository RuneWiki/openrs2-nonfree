import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!aka", name = "b", descriptor = "(B)V")
	public static void method235() {
		Static125.aClass29_1.method8349();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static446.aLongArray17[local10] = 0L;
		}
		for (@Pc(24) int local24 = 0; local24 < 32; local24++) {
			Static65.aLongArray3[local24] = 0L;
		}
		if (-32 == -32) {
			Static52.anInt3726 = 0;
		}
	}

	@OriginalMember(owner = "client!aka", name = "c", descriptor = "(I)V")
	public static void method237() {
		for (@Pc(12) int local12 = 0; local12 < Static496.anInt8367; local12++) {
			Static91.aClass230Array2[local12] = null;
		}
		Static496.anInt8367 = 0;
		@Pc(34) int local34;
		@Pc(38) int local38;
		for (@Pc(28) int local28 = 0; local28 < Static66.anInt802; local28++) {
			for (local34 = 0; local34 < Static230.anInt4470; local34++) {
				for (local38 = 0; local38 < Static63.anInt777; local38++) {
					@Pc(48) Class243 local48 = Static334.aClass243ArrayArrayArray2[local28][local38][local34];
					if (local48 != null) {
						if (local48.aShort74 > 0) {
							local48.aShort74 = (short) (local48.aShort74 * -1);
						}
						if (local48.aShort72 > 0) {
							local48.aShort72 = (short) (local48.aShort72 * -1);
						}
					}
				}
			}
		}
		for (local34 = 0; local34 < Static66.anInt802; local34++) {
			for (local38 = 0; local38 < Static230.anInt4470; local38++) {
				for (@Pc(120) int local120 = 0; local120 < Static63.anInt777; local120++) {
					@Pc(130) Class243 local130 = Static334.aClass243ArrayArrayArray2[local34][local120][local38];
					if (local130 != null) {
						@Pc(156) boolean local156 = Static334.aClass243ArrayArrayArray2[0][local120][local38] != null && Static334.aClass243ArrayArrayArray2[0][local120][local38].aClass243_1 != null;
						@Pc(161) int local161;
						@Pc(163) int local163;
						@Pc(177) Class243 local177;
						@Pc(185) int local185;
						@Pc(378) int local378;
						@Pc(393) int local393;
						@Pc(401) int local401;
						@Pc(418) int local418;
						@Pc(426) int local426;
						@Pc(430) int local430;
						@Pc(434) int local434;
						@Pc(441) int local441;
						@Pc(480) int local480;
						@Pc(484) int local484;
						if (local130.aShort72 < 0) {
							local161 = local38;
							local163 = local38;
							local177 = Static334.aClass243ArrayArrayArray2[local34][local120][local38 - 1];
							local185 = Static524.aClass96Array2[local34].method8080(local120, local38);
							while (local161 > 0 && local177 != null && local177.aShort72 < 0 && local177.aShort72 == local130.aShort72 && local130.aShort73 == local177.aShort73 && local185 == Static524.aClass96Array2[local34].method8080(local120, local161 - 1) && (local161 - 1 <= 0 || Static524.aClass96Array2[local34].method8080(local120, local161 - 2) == local185)) {
								local161--;
								local177 = Static334.aClass243ArrayArrayArray2[local34][local120][local161 - 1];
							}
							for (local177 = Static334.aClass243ArrayArrayArray2[local34][local120][local38 + 1]; local163 < Static63.anInt777 && local177 != null && local177.aShort72 < 0 && local130.aShort72 == local177.aShort72 && local130.aShort73 == local177.aShort73 && local185 == Static524.aClass96Array2[local34].method8080(local120, local163 + 1) && (local163 + 1 >= Static63.anInt777 || Static524.aClass96Array2[local34].method8080(local120, local163 + 2) == local185); local177 = Static334.aClass243ArrayArrayArray2[local34][local120][local163 + 1]) {
								local163++;
							}
							local378 = local34 + 1 - local34;
							local393 = Static524.aClass96Array2[local156 ? local34 + 1 : local34].method8080(local120, local161);
							local401 = local393 + local130.aShort72 * local378;
							local418 = Static524.aClass96Array2[local156 ? local34 + 1 : local34].method8080(local120, local163 + 1);
							local426 = local418 + local130.aShort72 * local378;
							local430 = local120 << Static594.anInt9440;
							local434 = local161 << Static594.anInt9440;
							local441 = (local163 << Static594.anInt9440) + Static234.anInt4537;
							Static91.aClass230Array2[Static496.anInt8367++] = new Class230(1, local34, local130.aShort73 + local430, local130.aShort73 + local430, local130.aShort73 + local430, local430 - -local130.aShort73, local393, local418, local426, local401, local434, local441, local441, local434);
							for (local480 = local34; local480 <= local34; local480++) {
								for (local484 = local161; local484 <= local163; local484++) {
									Static334.aClass243ArrayArrayArray2[local480][local120][local484].aShort72 = (short) (Static334.aClass243ArrayArrayArray2[local480][local120][local484].aShort72 * -1);
								}
							}
						}
						if (local130.aShort74 < 0) {
							local161 = local120;
							local163 = local120;
							local177 = Static334.aClass243ArrayArrayArray2[local34][local120 - 1][local38];
							local185 = Static524.aClass96Array2[local34].method8080(local120, local38);
							while (local161 > 0 && local177 != null && local177.aShort74 < 0 && local130.aShort74 == local177.aShort74 && local130.aShort75 == local177.aShort75 && Static524.aClass96Array2[local34].method8080(local161 - 1, local38) == local185 && (local161 - 1 <= 0 || Static524.aClass96Array2[local34].method8080(local161 - 2, local38) == local185)) {
								local161--;
								local177 = Static334.aClass243ArrayArrayArray2[local34][local161 - 1][local38];
							}
							for (local177 = Static334.aClass243ArrayArrayArray2[local34][local120 + 1][local38]; local163 < Static230.anInt4470 && local177 != null && local177.aShort74 < 0 && local130.aShort74 == local177.aShort74 && local130.aShort75 == local177.aShort75 && local185 == Static524.aClass96Array2[local34].method8080(local163 + 1, local38) && (Static230.anInt4470 <= local163 + 1 || Static524.aClass96Array2[local34].method8080(local163 + 2, local38) == local185); local177 = Static334.aClass243ArrayArrayArray2[local34][local163 + 1][local38]) {
								local163++;
							}
							local378 = local34 + 1 - local34;
							local393 = Static524.aClass96Array2[local156 ? local34 + 1 : local34].method8080(local161, local38);
							local401 = local378 * local130.aShort74 + local393;
							local418 = Static524.aClass96Array2[local156 ? local34 + 1 : local34].method8080(local163 + 1, local38);
							local426 = local130.aShort74 * local378 + local418;
							local430 = local161 << Static594.anInt9440;
							local434 = Static234.anInt4537 + (local163 << Static594.anInt9440);
							local441 = local38 << Static594.anInt9440;
							Static91.aClass230Array2[Static496.anInt8367++] = new Class230(2, local34, local430, local434, local434, local430, local393, local418, local426, local401, local130.aShort75 + local441, local441 + local130.aShort75, local130.aShort75 + local441, local130.aShort75 + local441);
							for (local480 = local34; local480 <= local34; local480++) {
								for (local484 = local161; local484 <= local163; local484++) {
									Static334.aClass243ArrayArrayArray2[local480][local484][local38].aShort74 = (short) (Static334.aClass243ArrayArrayArray2[local480][local484][local38].aShort74 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static370.aBoolean273 = true;
	}
}
