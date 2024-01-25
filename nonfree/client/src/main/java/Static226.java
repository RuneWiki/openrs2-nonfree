import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!hja", name = "J", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_134 = new Class196(113, 10);

	@OriginalMember(owner = "client!hja", name = "L", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_48 = new Class187(43, 8);

	@OriginalMember(owner = "client!hja", name = "M", descriptor = "F")
	public static float aFloat54 = 1.0F;

	@OriginalMember(owner = "client!hja", name = "b", descriptor = "(Z)V")
	public static void method3207() {
		for (@Pc(5) int local5 = 0; local5 < Static509.anInt5962; local5++) {
			Static194.aClass180Array8[local5] = null;
		}
		Static509.anInt5962 = 0;
		@Pc(25) int local25;
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static202.anInt3256; local22++) {
			for (local25 = 0; local25 < Static665.anInt7330; local25++) {
				for (local28 = 0; local28 < Static92.anInt1526; local28++) {
					@Pc(37) Class313 local37 = Static129.aClass313ArrayArrayArray7[local22][local28][local25];
					if (local37 != null) {
						if (local37.aShort100 > 0) {
							local37.aShort100 = (short) (local37.aShort100 * -1);
						}
						if (local37.aShort99 > 0) {
							local37.aShort99 = (short) (local37.aShort99 * -1);
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < Static202.anInt3256; local25++) {
			for (local28 = 0; local28 < Static665.anInt7330; local28++) {
				for (@Pc(87) int local87 = 0; local87 < Static92.anInt1526; local87++) {
					@Pc(96) Class313 local96 = Static129.aClass313ArrayArrayArray7[local25][local87][local28];
					if (local96 != null) {
						@Pc(119) boolean local119 = Static129.aClass313ArrayArrayArray7[0][local87][local28] != null && Static129.aClass313ArrayArrayArray7[0][local87][local28].aClass313_1 != null;
						@Pc(124) int local124;
						@Pc(126) int local126;
						@Pc(140) Class313 local140;
						@Pc(148) int local148;
						@Pc(303) int local303;
						@Pc(317) int local317;
						@Pc(324) int local324;
						@Pc(340) int local340;
						@Pc(347) int local347;
						@Pc(351) int local351;
						@Pc(355) int local355;
						@Pc(361) int local361;
						@Pc(400) int local400;
						@Pc(403) int local403;
						if (local96.aShort99 < 0) {
							local124 = local28;
							local126 = local28;
							local140 = Static129.aClass313ArrayArrayArray7[local25][local87][local28 - 1];
							local148 = Static230.aClass88Array2[local25].method8749(local87, local28);
							while (local124 > 0 && local140 != null && local140.aShort99 < 0 && local140.aShort99 == local96.aShort99 && local140.aShort97 == local96.aShort97 && Static230.aClass88Array2[local25].method8749(local87, local124 - 1) == local148 && (local124 - 1 <= 0 || Static230.aClass88Array2[local25].method8749(local87, local124 - 2) == local148)) {
								local124--;
								local140 = Static129.aClass313ArrayArrayArray7[local25][local87][local124 - 1];
							}
							for (local140 = Static129.aClass313ArrayArrayArray7[local25][local87][local28 + 1]; local126 < Static92.anInt1526 && local140 != null && local140.aShort99 < 0 && local96.aShort99 == local140.aShort99 && local140.aShort97 == local96.aShort97 && local148 == Static230.aClass88Array2[local25].method8749(local87, local126 + 1) && (local126 + 1 >= Static92.anInt1526 || local148 == Static230.aClass88Array2[local25].method8749(local87, local126 + 2)); local140 = Static129.aClass313ArrayArrayArray7[local25][local87][local126 + 1]) {
								local126++;
							}
							local303 = local25 + 1 - local25;
							local317 = Static230.aClass88Array2[local119 ? local25 + 1 : local25].method8749(local87, local124);
							local324 = local317 + local303 * local96.aShort99;
							local340 = Static230.aClass88Array2[local119 ? local25 + 1 : local25].method8749(local87, local126 + 1);
							local347 = local340 + local96.aShort99 * local303;
							local351 = local87 << Static138.anInt2287;
							local355 = local124 << Static138.anInt2287;
							local361 = (local126 << Static138.anInt2287) + Static108.anInt1949;
							Static194.aClass180Array8[Static509.anInt5962++] = new Class180(1, local25, local351 + local96.aShort97, local96.aShort97 + local351, local96.aShort97 + local351, local351 + local96.aShort97, local317, local340, local347, local324, local355, local361, local361, local355);
							for (local400 = local25; local400 <= local25; local400++) {
								for (local403 = local124; local403 <= local126; local403++) {
									Static129.aClass313ArrayArrayArray7[local400][local87][local403].aShort99 = (short) (Static129.aClass313ArrayArrayArray7[local400][local87][local403].aShort99 * -1);
								}
							}
						}
						if (local96.aShort100 < 0) {
							local124 = local87;
							local126 = local87;
							local140 = Static129.aClass313ArrayArrayArray7[local25][local87 - 1][local28];
							local148 = Static230.aClass88Array2[local25].method8749(local87, local28);
							while (local124 > 0 && local140 != null && local140.aShort100 < 0 && local96.aShort100 == local140.aShort100 && local140.aShort98 == local96.aShort98 && Static230.aClass88Array2[local25].method8749(local124 - 1, local28) == local148 && (local124 - 1 <= 0 || Static230.aClass88Array2[local25].method8749(local124 - 2, local28) == local148)) {
								local124--;
								local140 = Static129.aClass313ArrayArrayArray7[local25][local124 - 1][local28];
							}
							for (local140 = Static129.aClass313ArrayArrayArray7[local25][local87 + 1][local28]; Static665.anInt7330 > local126 && local140 != null && local140.aShort100 < 0 && local140.aShort100 == local96.aShort100 && local96.aShort98 == local140.aShort98 && local148 == Static230.aClass88Array2[local25].method8749(local126 + 1, local28) && (Static665.anInt7330 <= local126 + 1 || local148 == Static230.aClass88Array2[local25].method8749(local126 + 2, local28)); local140 = Static129.aClass313ArrayArrayArray7[local25][local126 + 1][local28]) {
								local126++;
							}
							local303 = local25 + 1 - local25;
							local317 = Static230.aClass88Array2[local119 ? local25 + 1 : local25].method8749(local124, local28);
							local324 = local317 + local303 * local96.aShort100;
							local340 = Static230.aClass88Array2[local119 ? local25 + 1 : local25].method8749(local126 + 1, local28);
							local347 = local340 + local96.aShort100 * local303;
							local351 = local124 << Static138.anInt2287;
							local355 = Static108.anInt1949 + (local126 << Static138.anInt2287);
							local361 = local28 << Static138.anInt2287;
							Static194.aClass180Array8[Static509.anInt5962++] = new Class180(2, local25, local351, local355, local355, local351, local317, local340, local347, local324, local96.aShort98 + local361, local361 + local96.aShort98, local361 + local96.aShort98, local361 + local96.aShort98);
							for (local400 = local25; local400 <= local25; local400++) {
								for (local403 = local124; local403 <= local126; local403++) {
									Static129.aClass313ArrayArrayArray7[local400][local403][local28].aShort100 = (short) (Static129.aClass313ArrayArrayArray7[local400][local403][local28].aShort100 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static652.aBoolean748 = true;
	}
}
