import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!sca", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8;

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "()V")
	public static void method6552() {
		Static333.anInt6046 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static478.anInt8127; local3++) {
			@Pc(8) Class197 local8 = Static185.aClass197Array1[local3];
			@Pc(12) int local12;
			if (Static534.anIntArray650 != null) {
				for (local12 = 0; local12 < Static534.anIntArray650.length; local12++) {
					if (Static534.anIntArray650[local12] != -1000000 && (local8.anInt5429 <= Static534.anIntArray650[local12] || local8.anInt5445 <= Static534.anIntArray650[local12]) && (local8.anInt5440 <= Static143.anIntArray190[local12] || local8.anInt5448 <= Static143.anIntArray190[local12]) && (local8.anInt5440 >= Static46.anIntArray48[local12] || local8.anInt5448 >= Static46.anIntArray48[local12]) && (local8.anInt5439 <= Static565.anIntArray492[local12] || local8.anInt5438 <= Static565.anIntArray492[local12]) && (local8.anInt5439 >= Static462.anIntArray581[local12] || local8.anInt5438 >= Static462.anIntArray581[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt5442 == 1) {
				local12 = local8.anInt5443 + Static156.anInt3342 - Static213.anInt8691;
				if (local12 >= 0 && local12 <= Static156.anInt3342 + Static156.anInt3342) {
					local110 = local8.anInt5449 + Static156.anInt3342 - Static117.anInt2704;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static156.anInt3342 + Static156.anInt3342) {
						continue;
					}
					local128 = local8.anInt5432 + Static156.anInt3342 - Static117.anInt2704;
					if (local128 > Static156.anInt3342 + Static156.anInt3342) {
						local128 = Static156.anInt3342 + Static156.anInt3342;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static211.aBooleanArrayArray2[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static170.anInt3628 - local8.anInt5440;
						if (local164 > Static546.anInt9050) {
							local8.anInt5441 = 1;
						} else {
							if (local164 >= -Static546.anInt9050) {
								continue;
							}
							local8.anInt5441 = 2;
							local164 = -local164;
						}
						local8.anInt5437 = (local8.anInt5439 - Static478.anInt8129 << 8) / local164;
						local8.anInt5444 = (local8.anInt5438 - Static478.anInt8129 << 8) / local164;
						local8.anInt5431 = (local8.anInt5429 - Static573.anInt9415 << 8) / local164;
						local8.anInt5436 = (local8.anInt5445 - Static573.anInt9415 << 8) / local164;
						Static291.aClass197Array2[Static333.anInt6046++] = local8;
					}
				}
			} else if (local8.anInt5442 == 2) {
				local12 = local8.anInt5449 + Static156.anInt3342 - Static117.anInt2704;
				if (local12 >= 0 && local12 <= Static156.anInt3342 + Static156.anInt3342) {
					local110 = local8.anInt5443 + Static156.anInt3342 - Static213.anInt8691;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static156.anInt3342 + Static156.anInt3342) {
						continue;
					}
					local128 = local8.anInt5434 + Static156.anInt3342 - Static213.anInt8691;
					if (local128 > Static156.anInt3342 + Static156.anInt3342) {
						local128 = Static156.anInt3342 + Static156.anInt3342;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static211.aBooleanArrayArray2[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static478.anInt8129 - local8.anInt5439;
						if (local164 > Static546.anInt9050) {
							local8.anInt5441 = 3;
						} else {
							if (local164 >= -Static546.anInt9050) {
								continue;
							}
							local8.anInt5441 = 4;
							local164 = -local164;
						}
						local8.anInt5433 = (local8.anInt5440 - Static170.anInt3628 << 8) / local164;
						local8.anInt5435 = (local8.anInt5448 - Static170.anInt3628 << 8) / local164;
						local8.anInt5431 = (local8.anInt5429 - Static573.anInt9415 << 8) / local164;
						local8.anInt5436 = (local8.anInt5445 - Static573.anInt9415 << 8) / local164;
						Static291.aClass197Array2[Static333.anInt6046++] = local8;
					}
				}
			} else if (local8.anInt5442 == 4) {
				local12 = local8.anInt5429 - Static573.anInt9415;
				if (local12 > Static286.anInt5388) {
					local110 = local8.anInt5449 + Static156.anInt3342 - Static117.anInt2704;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static156.anInt3342 + Static156.anInt3342) {
						continue;
					}
					local128 = local8.anInt5432 + Static156.anInt3342 - Static117.anInt2704;
					if (local128 > Static156.anInt3342 + Static156.anInt3342) {
						local128 = Static156.anInt3342 + Static156.anInt3342;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt5443 + Static156.anInt3342 - Static213.anInt8691;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static156.anInt3342 + Static156.anInt3342) {
						continue;
					}
					local164 = local8.anInt5434 + Static156.anInt3342 - Static213.anInt8691;
					if (local164 > Static156.anInt3342 + Static156.anInt3342) {
						local164 = Static156.anInt3342 + Static156.anInt3342;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static211.aBooleanArrayArray2[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt5441 = 5;
						local8.anInt5433 = (local8.anInt5440 - Static170.anInt3628 << 8) / local12;
						local8.anInt5435 = (local8.anInt5448 - Static170.anInt3628 << 8) / local12;
						local8.anInt5437 = (local8.anInt5439 - Static478.anInt8129 << 8) / local12;
						local8.anInt5444 = (local8.anInt5438 - Static478.anInt8129 << 8) / local12;
						Static291.aClass197Array2[Static333.anInt6046++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)Z")
	public static boolean method6556() {
		return Static421.anInt7365 > 0;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIB)Z")
	public static boolean method6557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
