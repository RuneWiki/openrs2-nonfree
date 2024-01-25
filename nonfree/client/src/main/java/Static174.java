import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_66 = new Class253(43, 12);

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "()V")
	public static void method2513() {
		Static29.anInt455 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static36.anInt641; local3++) {
			@Pc(8) Class260 local8 = Static124.aClass260Array1[local3];
			@Pc(12) int local12;
			if (Static234.anIntArray355 != null) {
				for (local12 = 0; local12 < Static234.anIntArray355.length; local12++) {
					if (Static234.anIntArray355[local12] != -1000000 && (local8.anInt7232 <= Static234.anIntArray355[local12] || local8.anInt7214 <= Static234.anIntArray355[local12]) && (local8.anInt7216 <= Static221.anIntArray340[local12] || local8.anInt7225 <= Static221.anIntArray340[local12]) && (local8.anInt7216 >= Static173.anIntArray270[local12] || local8.anInt7225 >= Static173.anIntArray270[local12]) && (local8.anInt7222 <= Static134.anIntArray211[local12] || local8.anInt7230 <= Static134.anIntArray211[local12]) && (local8.anInt7222 >= Static189.anIntArray487[local12] || local8.anInt7230 >= Static189.anIntArray487[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt7226 == 1) {
				local12 = local8.anInt7220 + Static133.anInt2523 - Static408.anInt6461;
				if (local12 >= 0 && local12 <= Static133.anInt2523 + Static133.anInt2523) {
					local110 = local8.anInt7229 + Static133.anInt2523 - Static72.anInt1379;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static133.anInt2523 + Static133.anInt2523) {
						continue;
					}
					local128 = local8.anInt7213 + Static133.anInt2523 - Static72.anInt1379;
					if (local128 > Static133.anInt2523 + Static133.anInt2523) {
						local128 = Static133.anInt2523 + Static133.anInt2523;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static262.aBooleanArrayArray20[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static279.anInt7421 - local8.anInt7216;
						if (local164 > Static322.anInt5338) {
							local8.anInt7223 = 1;
						} else {
							if (local164 >= -Static322.anInt5338) {
								continue;
							}
							local8.anInt7223 = 2;
							local164 = -local164;
						}
						local8.anInt7221 = (local8.anInt7222 - Static432.anInt7276 << 8) / local164;
						local8.anInt7219 = (local8.anInt7230 - Static432.anInt7276 << 8) / local164;
						local8.anInt7218 = (local8.anInt7232 - Static28.anInt407 << 8) / local164;
						local8.anInt7227 = (local8.anInt7214 - Static28.anInt407 << 8) / local164;
						Static215.aClass260Array2[Static29.anInt455++] = local8;
					}
				}
			} else if (local8.anInt7226 == 2) {
				local12 = local8.anInt7229 + Static133.anInt2523 - Static72.anInt1379;
				if (local12 >= 0 && local12 <= Static133.anInt2523 + Static133.anInt2523) {
					local110 = local8.anInt7220 + Static133.anInt2523 - Static408.anInt6461;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static133.anInt2523 + Static133.anInt2523) {
						continue;
					}
					local128 = local8.anInt7215 + Static133.anInt2523 - Static408.anInt6461;
					if (local128 > Static133.anInt2523 + Static133.anInt2523) {
						local128 = Static133.anInt2523 + Static133.anInt2523;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static262.aBooleanArrayArray20[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static432.anInt7276 - local8.anInt7222;
						if (local164 > Static322.anInt5338) {
							local8.anInt7223 = 3;
						} else {
							if (local164 >= -Static322.anInt5338) {
								continue;
							}
							local8.anInt7223 = 4;
							local164 = -local164;
						}
						local8.anInt7217 = (local8.anInt7216 - Static279.anInt7421 << 8) / local164;
						local8.anInt7224 = (local8.anInt7225 - Static279.anInt7421 << 8) / local164;
						local8.anInt7218 = (local8.anInt7232 - Static28.anInt407 << 8) / local164;
						local8.anInt7227 = (local8.anInt7214 - Static28.anInt407 << 8) / local164;
						Static215.aClass260Array2[Static29.anInt455++] = local8;
					}
				}
			} else if (local8.anInt7226 == 4) {
				local12 = local8.anInt7232 - Static28.anInt407;
				if (local12 > Static35.anInt4762) {
					local110 = local8.anInt7229 + Static133.anInt2523 - Static72.anInt1379;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static133.anInt2523 + Static133.anInt2523) {
						continue;
					}
					local128 = local8.anInt7213 + Static133.anInt2523 - Static72.anInt1379;
					if (local128 > Static133.anInt2523 + Static133.anInt2523) {
						local128 = Static133.anInt2523 + Static133.anInt2523;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt7220 + Static133.anInt2523 - Static408.anInt6461;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static133.anInt2523 + Static133.anInt2523) {
						continue;
					}
					local164 = local8.anInt7215 + Static133.anInt2523 - Static408.anInt6461;
					if (local164 > Static133.anInt2523 + Static133.anInt2523) {
						local164 = Static133.anInt2523 + Static133.anInt2523;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static262.aBooleanArrayArray20[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt7223 = 5;
						local8.anInt7217 = (local8.anInt7216 - Static279.anInt7421 << 8) / local12;
						local8.anInt7224 = (local8.anInt7225 - Static279.anInt7421 << 8) / local12;
						local8.anInt7221 = (local8.anInt7222 - Static432.anInt7276 << 8) / local12;
						local8.anInt7219 = (local8.anInt7230 - Static432.anInt7276 << 8) / local12;
						Static215.aClass260Array2[Static29.anInt455++] = local8;
					}
				}
			}
		}
	}
}
