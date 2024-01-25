import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!qca", name = "n", descriptor = "Lclient!kea;")
	public static Class161 aClass161_88;

	@OriginalMember(owner = "client!qca", name = "o", descriptor = "[Lclient!xa;")
	public static Class119[] aClass119Array13;

	@OriginalMember(owner = "client!qca", name = "m", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_127 = new Class133(10, -1);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(B[S)[S")
	public static short[] method5967(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static559.method5956(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "()V")
	public static void method5969() {
		Static414.anInt7559 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static400.anInt7398; local3++) {
			@Pc(8) Class324 local8 = Static410.aClass324Array2[local3];
			@Pc(12) int local12;
			if (Static7.anIntArray96 != null) {
				for (local12 = 0; local12 < Static7.anIntArray96.length; local12++) {
					if (Static7.anIntArray96[local12] != -1000000 && (local8.anInt9468 <= Static7.anIntArray96[local12] || local8.anInt9469 <= Static7.anIntArray96[local12]) && (local8.anInt9472 <= Static451.anIntArray707[local12] || local8.anInt9477 <= Static451.anIntArray707[local12]) && (local8.anInt9472 >= Static7.anIntArray95[local12] || local8.anInt9477 >= Static7.anIntArray95[local12]) && (local8.anInt9467 <= Static216.anIntArray225[local12] || local8.anInt9479 <= Static216.anIntArray225[local12]) && (local8.anInt9467 >= Static253.anIntArray454[local12] || local8.anInt9479 >= Static253.anIntArray454[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt9480 == 1) {
				local12 = local8.anInt9478 + Static345.anInt6586 - Static227.anInt4884;
				if (local12 >= 0 && local12 <= Static345.anInt6586 + Static345.anInt6586) {
					local110 = local8.anInt9464 + Static345.anInt6586 - Static320.anInt6157;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static345.anInt6586 + Static345.anInt6586) {
						continue;
					}
					local128 = local8.anInt9474 + Static345.anInt6586 - Static320.anInt6157;
					if (local128 > Static345.anInt6586 + Static345.anInt6586) {
						local128 = Static345.anInt6586 + Static345.anInt6586;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static30.aBooleanArrayArray3[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static184.anInt4224 - local8.anInt9472;
						if (local164 > Static349.anInt6635) {
							local8.anInt9476 = 1;
						} else {
							if (local164 >= -Static349.anInt6635) {
								continue;
							}
							local8.anInt9476 = 2;
							local164 = -local164;
						}
						local8.anInt9475 = (local8.anInt9467 - Static371.anInt6982 << 8) / local164;
						local8.anInt9465 = (local8.anInt9479 - Static371.anInt6982 << 8) / local164;
						local8.anInt9470 = (local8.anInt9468 - Static122.anInt2785 << 8) / local164;
						local8.anInt9471 = (local8.anInt9469 - Static122.anInt2785 << 8) / local164;
						Static384.aClass324Array1[Static414.anInt7559++] = local8;
					}
				}
			} else if (local8.anInt9480 == 2) {
				local12 = local8.anInt9464 + Static345.anInt6586 - Static320.anInt6157;
				if (local12 >= 0 && local12 <= Static345.anInt6586 + Static345.anInt6586) {
					local110 = local8.anInt9478 + Static345.anInt6586 - Static227.anInt4884;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static345.anInt6586 + Static345.anInt6586) {
						continue;
					}
					local128 = local8.anInt9473 + Static345.anInt6586 - Static227.anInt4884;
					if (local128 > Static345.anInt6586 + Static345.anInt6586) {
						local128 = Static345.anInt6586 + Static345.anInt6586;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static30.aBooleanArrayArray3[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static371.anInt6982 - local8.anInt9467;
						if (local164 > Static349.anInt6635) {
							local8.anInt9476 = 3;
						} else {
							if (local164 >= -Static349.anInt6635) {
								continue;
							}
							local8.anInt9476 = 4;
							local164 = -local164;
						}
						local8.anInt9463 = (local8.anInt9472 - Static184.anInt4224 << 8) / local164;
						local8.anInt9462 = (local8.anInt9477 - Static184.anInt4224 << 8) / local164;
						local8.anInt9470 = (local8.anInt9468 - Static122.anInt2785 << 8) / local164;
						local8.anInt9471 = (local8.anInt9469 - Static122.anInt2785 << 8) / local164;
						Static384.aClass324Array1[Static414.anInt7559++] = local8;
					}
				}
			} else if (local8.anInt9480 == 4) {
				local12 = local8.anInt9468 - Static122.anInt2785;
				if (local12 > Static263.anInt5492) {
					local110 = local8.anInt9464 + Static345.anInt6586 - Static320.anInt6157;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static345.anInt6586 + Static345.anInt6586) {
						continue;
					}
					local128 = local8.anInt9474 + Static345.anInt6586 - Static320.anInt6157;
					if (local128 > Static345.anInt6586 + Static345.anInt6586) {
						local128 = Static345.anInt6586 + Static345.anInt6586;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt9478 + Static345.anInt6586 - Static227.anInt4884;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static345.anInt6586 + Static345.anInt6586) {
						continue;
					}
					local164 = local8.anInt9473 + Static345.anInt6586 - Static227.anInt4884;
					if (local164 > Static345.anInt6586 + Static345.anInt6586) {
						local164 = Static345.anInt6586 + Static345.anInt6586;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static30.aBooleanArrayArray3[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt9476 = 5;
						local8.anInt9463 = (local8.anInt9472 - Static184.anInt4224 << 8) / local12;
						local8.anInt9462 = (local8.anInt9477 - Static184.anInt4224 << 8) / local12;
						local8.anInt9475 = (local8.anInt9467 - Static371.anInt6982 << 8) / local12;
						local8.anInt9465 = (local8.anInt9479 - Static371.anInt6982 << 8) / local12;
						Static384.aClass324Array1[Static414.anInt7559++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZZ)V")
	public static void method5973(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static17.anInt4281--;
			if (Static17.anInt4281 == 0) {
				Static457.anIntArray710 = null;
			}
		}
		if (!arg0) {
			return;
		}
		Static387.anInt9439--;
		if (Static387.anInt9439 == 0) {
			Static393.anIntArray638 = null;
			return;
		}
	}
}
