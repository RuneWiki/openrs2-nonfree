import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
	public static int anInt8498;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!rf;")
	public static final Class292 aClass292_3 = new Class292();

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method7292() {
		for (@Pc(7) int local7 = 0; local7 < Static199.anInt3923; local7++) {
			Static342.aClass309Array2[local7] = null;
		}
		Static199.anInt3923 = 0;
		@Pc(29) int local29;
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < Static442.anInt7929; local25++) {
			for (local29 = 0; local29 < Static569.anInt9425; local29++) {
				for (local33 = 0; local33 < Static293.anInt5181; local33++) {
					@Pc(43) Class77 local43 = Static330.aClass77ArrayArrayArray2[local25][local33][local29];
					if (local43 != null) {
						if (local43.aShort29 > 0) {
							local43.aShort29 = (short) (local43.aShort29 * -1);
						}
						if (local43.aShort30 > 0) {
							local43.aShort30 = (short) (local43.aShort30 * -1);
						}
					}
				}
			}
		}
		for (local29 = 0; local29 < Static442.anInt7929; local29++) {
			for (local33 = 0; local33 < Static569.anInt9425; local33++) {
				for (@Pc(100) int local100 = 0; local100 < Static293.anInt5181; local100++) {
					@Pc(110) Class77 local110 = Static330.aClass77ArrayArrayArray2[local29][local100][local33];
					if (local110 != null) {
						@Pc(133) boolean local133 = Static330.aClass77ArrayArrayArray2[0][local100][local33] != null && Static330.aClass77ArrayArrayArray2[0][local100][local33].aClass77_1 != null;
						@Pc(141) int local141;
						@Pc(143) int local143;
						@Pc(157) Class77 local157;
						@Pc(165) int local165;
						@Pc(330) int local330;
						@Pc(344) int local344;
						@Pc(351) int local351;
						@Pc(367) int local367;
						@Pc(374) int local374;
						@Pc(378) int local378;
						@Pc(382) int local382;
						@Pc(389) int local389;
						@Pc(428) int local428;
						@Pc(432) int local432;
						if (local110.aShort29 < 0) {
							local141 = local33;
							local143 = local33;
							local157 = Static330.aClass77ArrayArrayArray2[local29][local100][local33 - 1];
							local165 = Static559.aClass51Array4[local29].method7835(local100, local33);
							while (local141 > 0 && local157 != null && local157.aShort29 < 0 && local157.aShort29 == local110.aShort29 && local157.aShort28 == local110.aShort28 && Static559.aClass51Array4[local29].method7835(local100, local141 - 1) == local165 && (local141 - 1 <= 0 || local165 == Static559.aClass51Array4[local29].method7835(local100, local141 - 2))) {
								local141--;
								local157 = Static330.aClass77ArrayArrayArray2[local29][local100][local141 - 1];
							}
							for (local157 = Static330.aClass77ArrayArrayArray2[local29][local100][local33 + 1]; local143 < Static293.anInt5181 && local157 != null && local157.aShort29 < 0 && local157.aShort29 == local110.aShort29 && local157.aShort28 == local110.aShort28 && Static559.aClass51Array4[local29].method7835(local100, local143 + 1) == local165 && (Static293.anInt5181 <= local143 + 1 || local165 == Static559.aClass51Array4[local29].method7835(local100, local143 + 2)); local157 = Static330.aClass77ArrayArrayArray2[local29][local100][local143 + 1]) {
								local143++;
							}
							local330 = local29 + 1 - local29;
							local344 = Static559.aClass51Array4[local133 ? local29 + 1 : local29].method7835(local100, local141);
							local351 = local110.aShort29 * local330 + local344;
							local367 = Static559.aClass51Array4[local133 ? local29 + 1 : local29].method7835(local100, local143 + 1);
							local374 = local330 * local110.aShort29 + local367;
							local378 = local100 << Static308.anInt5834;
							local382 = local141 << Static308.anInt5834;
							local389 = (local143 << Static308.anInt5834) + Static384.anInt7200;
							Static342.aClass309Array2[Static199.anInt3923++] = new Class309(1, local29, local110.aShort28 + local378, local378 - -local110.aShort28, local110.aShort28 + local378, local110.aShort28 + local378, local344, local367, local374, local351, local382, local389, local389, local382);
							for (local428 = local29; local428 <= local29; local428++) {
								for (local432 = local141; local432 <= local143; local432++) {
									Static330.aClass77ArrayArrayArray2[local428][local100][local432].aShort29 = (short) (Static330.aClass77ArrayArrayArray2[local428][local100][local432].aShort29 * -1);
								}
							}
						}
						if (local110.aShort30 < 0) {
							local141 = local100;
							local143 = local100;
							local157 = Static330.aClass77ArrayArrayArray2[local29][local100 - 1][local33];
							local165 = Static559.aClass51Array4[local29].method7835(local100, local33);
							while (local141 > 0 && local157 != null && local157.aShort30 < 0 && local157.aShort30 == local110.aShort30 && local110.aShort31 == local157.aShort31 && Static559.aClass51Array4[local29].method7835(local141 - 1, local33) == local165 && (local141 - 1 <= 0 || local165 == Static559.aClass51Array4[local29].method7835(local141 - 2, local33))) {
								local141--;
								local157 = Static330.aClass77ArrayArrayArray2[local29][local141 - 1][local33];
							}
							for (local157 = Static330.aClass77ArrayArrayArray2[local29][local100 + 1][local33]; local143 < Static569.anInt9425 && local157 != null && local157.aShort30 < 0 && local110.aShort30 == local157.aShort30 && local157.aShort31 == local110.aShort31 && Static559.aClass51Array4[local29].method7835(local143 + 1, local33) == local165 && (local143 + 1 >= Static569.anInt9425 || local165 == Static559.aClass51Array4[local29].method7835(local143 + 2, local33)); local157 = Static330.aClass77ArrayArrayArray2[local29][local143 + 1][local33]) {
								local143++;
							}
							local330 = local29 + 1 - local29;
							local344 = Static559.aClass51Array4[local133 ? local29 + 1 : local29].method7835(local141, local33);
							local351 = local344 + local330 * local110.aShort30;
							local367 = Static559.aClass51Array4[local133 ? local29 + 1 : local29].method7835(local143 + 1, local33);
							local374 = local367 + local330 * local110.aShort30;
							local378 = local141 << Static308.anInt5834;
							local382 = (local143 << Static308.anInt5834) + Static384.anInt7200;
							local389 = local33 << Static308.anInt5834;
							Static342.aClass309Array2[Static199.anInt3923++] = new Class309(2, local29, local378, local382, local382, local378, local344, local367, local374, local351, local110.aShort31 + local389, local110.aShort31 + local389, local110.aShort31 + local389, local110.aShort31 + local389);
							for (local428 = local29; local428 <= local29; local428++) {
								for (local432 = local141; local432 <= local143; local432++) {
									Static330.aClass77ArrayArrayArray2[local428][local432][local33].aShort30 = (short) (Static330.aClass77ArrayArrayArray2[local428][local432][local33].aShort30 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static479.aBoolean284 = true;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Z")
	public static boolean method7293() {
		return Static324.anInt8117 != 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)I")
	public static int method7294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg1 >> 1) + ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 5 << 7);
	}
}
