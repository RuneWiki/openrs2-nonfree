import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public static int anInt8103;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
	public static int[] anIntArray576;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public static int anInt8112 = -50;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
	public static void method6706() {
		Static493.aClass313_53.method6982(50);
		Static167.aClass313_21.method6982(50);
		Static545.aClass313_56.method6982(50);
		Static545.aClass313_57.method6982(50);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method6710() {
		for (@Pc(12) int local12 = 0; local12 < Static572.anInt9312; local12++) {
			Static374.aClass148Array3[local12] = null;
		}
		Static572.anInt9312 = 0;
		@Pc(30) int local30;
		@Pc(34) int local34;
		for (@Pc(26) int local26 = 0; local26 < Static89.anInt8689; local26++) {
			for (local30 = 0; local30 < Static496.anInt8369; local30++) {
				for (local34 = 0; local34 < Static357.anInt6390; local34++) {
					@Pc(44) Class346 local44 = Static389.aClass346ArrayArrayArray2[local26][local34][local30];
					if (local44 != null) {
						if (local44.aShort113 > 0) {
							local44.aShort113 = (short) (local44.aShort113 * -1);
						}
						if (local44.aShort112 > 0) {
							local44.aShort112 = (short) (local44.aShort112 * -1);
						}
					}
				}
			}
		}
		for (local30 = 0; local30 < Static89.anInt8689; local30++) {
			for (local34 = 0; local34 < Static496.anInt8369; local34++) {
				for (@Pc(88) int local88 = 0; local88 < Static357.anInt6390; local88++) {
					@Pc(98) Class346 local98 = Static389.aClass346ArrayArrayArray2[local30][local88][local34];
					if (local98 != null) {
						@Pc(121) boolean local121 = Static389.aClass346ArrayArrayArray2[0][local88][local34] != null && Static389.aClass346ArrayArrayArray2[0][local88][local34].aClass346_1 != null;
						@Pc(126) int local126;
						@Pc(128) int local128;
						@Pc(130) int local130;
						@Pc(132) int local132;
						@Pc(142) Class346 local142;
						@Pc(150) int local150;
						@Pc(304) int local304;
						@Pc(445) int local445;
						@Pc(452) int local452;
						@Pc(468) int local468;
						@Pc(475) int local475;
						@Pc(479) int local479;
						@Pc(483) int local483;
						@Pc(490) int local490;
						@Pc(528) int local528;
						@Pc(532) int local532;
						if (local98.aShort113 < 0) {
							local126 = local34;
							local128 = local34;
							local130 = local30;
							local132 = local30;
							local142 = Static389.aClass346ArrayArrayArray2[local30][local88][local34 - 1];
							local150 = Static569.aClass67Array8[local30].method6707(local34, local88);
							while (local126 > 0 && local142 != null && local142.aShort113 < 0 && local142.aShort113 == local98.aShort113 && local98.aShort111 == local142.aShort111 && local150 == Static569.aClass67Array8[local30].method6707(local126 - 1, local88) && (local126 - 1 <= 0 || Static569.aClass67Array8[local30].method6707(local126 - 2, local88) == local150)) {
								local126--;
								local142 = Static389.aClass346ArrayArrayArray2[local30][local88][local126 - 1];
							}
							for (local142 = Static389.aClass346ArrayArrayArray2[local30][local88][local34 + 1]; Static357.anInt6390 > local128 && local142 != null && local142.aShort113 < 0 && local98.aShort113 == local142.aShort113 && local98.aShort111 == local142.aShort111 && Static569.aClass67Array8[local30].method6707(local128 + 1, local88) == local150 && (local128 + 1 >= Static357.anInt6390 || Static569.aClass67Array8[local30].method6707(local128 + 2, local88) == local150); local142 = Static389.aClass346ArrayArrayArray2[local30][local88][local128 + 1]) {
								local128++;
							}
							label289: while (local130 > 0) {
								for (local304 = local126; local304 <= local128; local304++) {
									if (Static389.aClass346ArrayArrayArray2[local130 - 1][local88][local304] == null || local98.aShort113 != Static389.aClass346ArrayArrayArray2[local130 - 1][local88][local304].aShort113 || local98.aShort111 != Static389.aClass346ArrayArrayArray2[local130 - 1][local88][local304].aShort111) {
										break label289;
									}
								}
								local130--;
							}
							label306: while (local132 < Static89.anInt8689 - 1) {
								for (local304 = local126; local304 <= local128; local304++) {
									if (Static389.aClass346ArrayArrayArray2[local132 + 1][local88][local304] == null || Static389.aClass346ArrayArrayArray2[local132 + 1][local88][local304].aShort113 != local98.aShort113 || Static389.aClass346ArrayArrayArray2[local132 + 1][local88][local304].aShort111 != local98.aShort111) {
										break label306;
									}
								}
								local132++;
							}
							local304 = local132 + 1 - local130;
							local445 = Static569.aClass67Array8[local121 ? local130 + 1 : local130].method6707(local126, local88);
							local452 = local304 * local98.aShort113 + local445;
							local468 = Static569.aClass67Array8[local121 ? local130 + 1 : local130].method6707(local128 + 1, local88);
							local475 = local98.aShort113 * local304 + local468;
							local479 = local88 << Static134.anInt2822;
							local483 = local126 << Static134.anInt2822;
							local490 = (local128 << Static134.anInt2822) + Static33.anInt857;
							Static374.aClass148Array3[Static572.anInt9312++] = new Class148(1, local132, local479 + local98.aShort111, local479 + local98.aShort111, local98.aShort111 + local479, local98.aShort111 + local479, local445, local468, local475, local452, local483, local490, local490, local483);
							for (local528 = local130; local528 <= local132; local528++) {
								for (local532 = local126; local532 <= local128; local532++) {
									Static389.aClass346ArrayArrayArray2[local528][local88][local532].aShort113 = (short) (Static389.aClass346ArrayArrayArray2[local528][local88][local532].aShort113 * -1);
								}
							}
						}
						if (local98.aShort112 < 0) {
							local126 = local88;
							local128 = local88;
							local130 = local30;
							local132 = local30;
							local142 = Static389.aClass346ArrayArrayArray2[local30][local88 - 1][local34];
							local150 = Static569.aClass67Array8[local30].method6707(local34, local88);
							while (local126 > 0 && local142 != null && local142.aShort112 < 0 && local98.aShort112 == local142.aShort112 && local142.aShort110 == local98.aShort110 && Static569.aClass67Array8[local30].method6707(local34, local126 - 1) == local150 && (local126 - 1 <= 0 || Static569.aClass67Array8[local30].method6707(local34, local126 - 2) == local150)) {
								local126--;
								local142 = Static389.aClass346ArrayArrayArray2[local30][local126 - 1][local34];
							}
							for (local142 = Static389.aClass346ArrayArrayArray2[local30][local88 + 1][local34]; Static496.anInt8369 > local128 && local142 != null && local142.aShort112 < 0 && local142.aShort112 == local98.aShort112 && local142.aShort110 == local98.aShort110 && local150 == Static569.aClass67Array8[local30].method6707(local34, local128 + 1) && (local128 + 1 >= Static496.anInt8369 || Static569.aClass67Array8[local30].method6707(local34, local128 + 2) == local150); local142 = Static389.aClass346ArrayArrayArray2[local30][local128 + 1][local34]) {
								local128++;
							}
							label205: while (local130 > 0) {
								for (local304 = local126; local304 <= local128; local304++) {
									if (Static389.aClass346ArrayArrayArray2[local130 - 1][local304][local34] == null || Static389.aClass346ArrayArrayArray2[local130 - 1][local304][local34].aShort112 != local98.aShort112 || Static389.aClass346ArrayArrayArray2[local130 - 1][local304][local34].aShort110 != local98.aShort110) {
										break label205;
									}
								}
								local130--;
							}
							label190: while (local132 < Static89.anInt8689 - 1) {
								for (local304 = local126; local304 <= local128; local304++) {
									if (Static389.aClass346ArrayArrayArray2[local132 + 1][local304][local34] == null || local98.aShort112 != Static389.aClass346ArrayArrayArray2[local132 + 1][local304][local34].aShort112 || local98.aShort110 != Static389.aClass346ArrayArrayArray2[local132 + 1][local304][local34].aShort110) {
										break label190;
									}
								}
								local132++;
							}
							local304 = local132 + 1 - local130;
							local445 = Static569.aClass67Array8[local121 ? local130 + 1 : local130].method6707(local34, local126);
							local452 = local304 * local98.aShort112 + local445;
							local468 = Static569.aClass67Array8[local121 ? local130 + 1 : local130].method6707(local34, local128 + 1);
							local475 = local304 * local98.aShort112 + local468;
							local479 = local126 << Static134.anInt2822;
							local483 = Static33.anInt857 + (local128 << Static134.anInt2822);
							local490 = local34 << Static134.anInt2822;
							Static374.aClass148Array3[Static572.anInt9312++] = new Class148(2, local132, local479, local483, local483, local479, local445, local468, local475, local452, local490 + local98.aShort110, local98.aShort110 + local490, local98.aShort110 + local490, local98.aShort110 + local490);
							for (local528 = local130; local528 <= local132; local528++) {
								for (local532 = local126; local532 <= local128; local532++) {
									Static389.aClass346ArrayArrayArray2[local528][local532][local34].aShort112 = (short) (Static389.aClass346ArrayArrayArray2[local528][local532][local34].aShort112 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static260.aBoolean387 = true;
	}
}
