import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!gka", name = "k", descriptor = "I")
	public static int anInt3602;

	@OriginalMember(owner = "client!gka", name = "Q", descriptor = "I")
	public static int anInt3625 = -1;

	@OriginalMember(owner = "client!gka", name = "db", descriptor = "I")
	public static int anInt3634 = 2;

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(III)I")
	public static int method3154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "(I)V")
	public static void method3155() {
		if (Static62.anInterface27Array1 == null) {
			return;
		}
		@Pc(5) Interface27[] local5 = Static62.anInterface27Array1;
		for (@Pc(7) int local7 = 0; local7 < local5.length; local7++) {
			@Pc(13) Interface27 local13 = local5[local7];
			local13.method7912();
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(B)V")
	public static void method3158() {
		for (@Pc(7) int local7 = 0; local7 < Static246.anInt4586; local7++) {
			Static243.aClass167Array11[local7] = null;
		}
		Static246.anInt4586 = 0;
		@Pc(25) int local25;
		@Pc(29) int local29;
		for (@Pc(21) int local21 = 0; local21 < Static373.anInt6613; local21++) {
			for (local25 = 0; local25 < Static410.anInt6962; local25++) {
				for (local29 = 0; local29 < Static315.anInt5894; local29++) {
					@Pc(39) Class247 local39 = Static332.aClass247ArrayArrayArray1[local21][local29][local25];
					if (local39 != null) {
						if (local39.aShort80 > 0) {
							local39.aShort80 = (short) (local39.aShort80 * -1);
						}
						if (local39.aShort83 > 0) {
							local39.aShort83 = (short) (local39.aShort83 * -1);
						}
					}
				}
			}
		}
		for (local25 = 0; local25 < Static373.anInt6613; local25++) {
			for (local29 = 0; local29 < Static410.anInt6962; local29++) {
				for (@Pc(99) int local99 = 0; local99 < Static315.anInt5894; local99++) {
					@Pc(109) Class247 local109 = Static332.aClass247ArrayArrayArray1[local25][local99][local29];
					if (local109 != null) {
						@Pc(132) boolean local132 = Static332.aClass247ArrayArrayArray1[0][local99][local29] != null && Static332.aClass247ArrayArrayArray1[0][local99][local29].aClass247_1 != null;
						@Pc(140) int local140;
						@Pc(142) int local142;
						@Pc(156) Class247 local156;
						@Pc(164) int local164;
						@Pc(314) int local314;
						@Pc(328) int local328;
						@Pc(335) int local335;
						@Pc(351) int local351;
						@Pc(358) int local358;
						@Pc(362) int local362;
						@Pc(366) int local366;
						@Pc(373) int local373;
						@Pc(412) int local412;
						@Pc(416) int local416;
						if (local109.aShort83 < 0) {
							local140 = local29;
							local142 = local29;
							local156 = Static332.aClass247ArrayArrayArray1[local25][local99][local29 - 1];
							local164 = Static239.aClass104Array1[local25].method8279(local29, local99);
							while (local140 > 0 && local156 != null && local156.aShort83 < 0 && local109.aShort83 == local156.aShort83 && local156.aShort82 == local109.aShort82 && local164 == Static239.aClass104Array1[local25].method8279(local140 - 1, local99) && (local140 - 1 <= 0 || Static239.aClass104Array1[local25].method8279(local140 - 2, local99) == local164)) {
								local140--;
								local156 = Static332.aClass247ArrayArrayArray1[local25][local99][local140 - 1];
							}
							for (local156 = Static332.aClass247ArrayArrayArray1[local25][local99][local29 + 1]; local142 < Static315.anInt5894 && local156 != null && local156.aShort83 < 0 && local109.aShort83 == local156.aShort83 && local109.aShort82 == local156.aShort82 && Static239.aClass104Array1[local25].method8279(local142 + 1, local99) == local164 && (Static315.anInt5894 <= local142 + 1 || Static239.aClass104Array1[local25].method8279(local142 + 2, local99) == local164); local156 = Static332.aClass247ArrayArrayArray1[local25][local99][local142 + 1]) {
								local142++;
							}
							local314 = local25 + 1 - local25;
							local328 = Static239.aClass104Array1[local132 ? local25 + 1 : local25].method8279(local140, local99);
							local335 = local314 * local109.aShort83 + local328;
							local351 = Static239.aClass104Array1[local132 ? local25 + 1 : local25].method8279(local142 + 1, local99);
							local358 = local351 + local314 * local109.aShort83;
							local362 = local99 << Static436.anInt7634;
							local366 = local140 << Static436.anInt7634;
							local373 = (local142 << Static436.anInt7634) + Static10.anInt118;
							Static243.aClass167Array11[Static246.anInt4586++] = new Class167(1, local25, local109.aShort82 + local362, local109.aShort82 + local362, local362 + local109.aShort82, local109.aShort82 + local362, local328, local351, local358, local335, local366, local373, local373, local366);
							for (local412 = local25; local412 <= local25; local412++) {
								for (local416 = local140; local416 <= local142; local416++) {
									Static332.aClass247ArrayArrayArray1[local412][local99][local416].aShort83 = (short) (Static332.aClass247ArrayArrayArray1[local412][local99][local416].aShort83 * -1);
								}
							}
						}
						if (local109.aShort80 < 0) {
							local140 = local99;
							local142 = local99;
							local156 = Static332.aClass247ArrayArrayArray1[local25][local99 - 1][local29];
							local164 = Static239.aClass104Array1[local25].method8279(local29, local99);
							while (local140 > 0 && local156 != null && local156.aShort80 < 0 && local109.aShort80 == local156.aShort80 && local156.aShort81 == local109.aShort81 && local164 == Static239.aClass104Array1[local25].method8279(local29, local140 - 1) && (local140 - 1 <= 0 || Static239.aClass104Array1[local25].method8279(local29, local140 - 2) == local164)) {
								local140--;
								local156 = Static332.aClass247ArrayArrayArray1[local25][local140 - 1][local29];
							}
							for (local156 = Static332.aClass247ArrayArrayArray1[local25][local99 + 1][local29]; local142 < Static410.anInt6962 && local156 != null && local156.aShort80 < 0 && local109.aShort80 == local156.aShort80 && local156.aShort81 == local109.aShort81 && Static239.aClass104Array1[local25].method8279(local29, local142 + 1) == local164 && (Static410.anInt6962 <= local142 + 1 || Static239.aClass104Array1[local25].method8279(local29, local142 + 2) == local164); local156 = Static332.aClass247ArrayArrayArray1[local25][local142 + 1][local29]) {
								local142++;
							}
							local314 = local25 + 1 - local25;
							local328 = Static239.aClass104Array1[local132 ? local25 + 1 : local25].method8279(local29, local140);
							local335 = local328 + local314 * local109.aShort80;
							local351 = Static239.aClass104Array1[local132 ? local25 + 1 : local25].method8279(local29, local142 + 1);
							local358 = local314 * local109.aShort80 + local351;
							local362 = local140 << Static436.anInt7634;
							local366 = (local142 << Static436.anInt7634) + Static10.anInt118;
							local373 = local29 << Static436.anInt7634;
							Static243.aClass167Array11[Static246.anInt4586++] = new Class167(2, local25, local362, local366, local366, local362, local328, local351, local358, local335, local109.aShort81 + local373, local109.aShort81 + local373, local109.aShort81 + local373, local373 + local109.aShort81);
							for (local412 = local25; local412 <= local25; local412++) {
								for (local416 = local140; local416 <= local142; local416++) {
									Static332.aClass247ArrayArrayArray1[local412][local416][local29].aShort80 = (short) (Static332.aClass247ArrayArrayArray1[local412][local416][local29].aShort80 * -1);
								}
							}
						}
					}
				}
			}
		}
		Static175.aBoolean264 = true;
	}
}
