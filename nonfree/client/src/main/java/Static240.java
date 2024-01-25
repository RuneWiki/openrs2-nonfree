import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	public static int anInt4706;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!jj;")
	public static Class121 aClass121_3;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString42 = "";

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIIZ)I")
	public static int method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class4_Sub38 local8 = Static351.method5112(arg2, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 >= 0 && local8.anIntArray541.length > arg0) {
			return local8.anIntArray541[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)I")
	public static int method4014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "()V")
	public static void method4015() {
		Static292.anInt5387 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static20.anInt7227; local3++) {
			@Pc(8) Class113 local8 = Static114.aClass113Array1[local3];
			@Pc(12) int local12;
			if (Static100.anIntArray189 != null) {
				for (local12 = 0; local12 < Static100.anIntArray189.length; local12++) {
					if (Static100.anIntArray189[local12] != -1000000 && (local8.anInt3448 <= Static100.anIntArray189[local12] || local8.anInt3438 <= Static100.anIntArray189[local12]) && (local8.anInt3444 <= Static47.anIntArray74[local12] || local8.anInt3437 <= Static47.anIntArray74[local12]) && (local8.anInt3444 >= Static88.anIntArray529[local12] || local8.anInt3437 >= Static88.anIntArray529[local12]) && (local8.anInt3453 <= Static443.anIntArray605[local12] || local8.anInt3445 <= Static443.anIntArray605[local12]) && (local8.anInt3453 >= Static363.anIntArray512[local12] || local8.anInt3445 >= Static363.anIntArray512[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt3450 == 1) {
				local12 = local8.anInt3441 + Static120.anInt2511 - Static243.anInt4735;
				if (local12 >= 0 && local12 <= Static120.anInt2511 + Static120.anInt2511) {
					local110 = local8.anInt3451 + Static120.anInt2511 - Static140.anInt2891;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static120.anInt2511 + Static120.anInt2511) {
						continue;
					}
					local128 = local8.anInt3446 + Static120.anInt2511 - Static140.anInt2891;
					if (local128 > Static120.anInt2511 + Static120.anInt2511) {
						local128 = Static120.anInt2511 + Static120.anInt2511;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static327.aBooleanArrayArray10[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static203.anInt4178 - local8.anInt3444;
						if (local164 > Static302.anInt5614) {
							local8.anInt3435 = 1;
						} else {
							if (local164 >= -Static302.anInt5614) {
								continue;
							}
							local8.anInt3435 = 2;
							local164 = -local164;
						}
						local8.anInt3447 = (local8.anInt3453 - Static332.anInt5918 << 8) / local164;
						local8.anInt3452 = (local8.anInt3445 - Static332.anInt5918 << 8) / local164;
						local8.anInt3440 = (local8.anInt3448 - Static395.anInt6978 << 8) / local164;
						local8.anInt3436 = (local8.anInt3438 - Static395.anInt6978 << 8) / local164;
						Static170.aClass113Array2[Static292.anInt5387++] = local8;
					}
				}
			} else if (local8.anInt3450 == 2) {
				local12 = local8.anInt3451 + Static120.anInt2511 - Static140.anInt2891;
				if (local12 >= 0 && local12 <= Static120.anInt2511 + Static120.anInt2511) {
					local110 = local8.anInt3441 + Static120.anInt2511 - Static243.anInt4735;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static120.anInt2511 + Static120.anInt2511) {
						continue;
					}
					local128 = local8.anInt3439 + Static120.anInt2511 - Static243.anInt4735;
					if (local128 > Static120.anInt2511 + Static120.anInt2511) {
						local128 = Static120.anInt2511 + Static120.anInt2511;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static327.aBooleanArrayArray10[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static332.anInt5918 - local8.anInt3453;
						if (local164 > Static302.anInt5614) {
							local8.anInt3435 = 3;
						} else {
							if (local164 >= -Static302.anInt5614) {
								continue;
							}
							local8.anInt3435 = 4;
							local164 = -local164;
						}
						local8.anInt3449 = (local8.anInt3444 - Static203.anInt4178 << 8) / local164;
						local8.anInt3443 = (local8.anInt3437 - Static203.anInt4178 << 8) / local164;
						local8.anInt3440 = (local8.anInt3448 - Static395.anInt6978 << 8) / local164;
						local8.anInt3436 = (local8.anInt3438 - Static395.anInt6978 << 8) / local164;
						Static170.aClass113Array2[Static292.anInt5387++] = local8;
					}
				}
			} else if (local8.anInt3450 == 4) {
				local12 = local8.anInt3448 - Static395.anInt6978;
				if (local12 > Static155.anInt3204) {
					local110 = local8.anInt3451 + Static120.anInt2511 - Static140.anInt2891;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static120.anInt2511 + Static120.anInt2511) {
						continue;
					}
					local128 = local8.anInt3446 + Static120.anInt2511 - Static140.anInt2891;
					if (local128 > Static120.anInt2511 + Static120.anInt2511) {
						local128 = Static120.anInt2511 + Static120.anInt2511;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt3441 + Static120.anInt2511 - Static243.anInt4735;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static120.anInt2511 + Static120.anInt2511) {
						continue;
					}
					local164 = local8.anInt3439 + Static120.anInt2511 - Static243.anInt4735;
					if (local164 > Static120.anInt2511 + Static120.anInt2511) {
						local164 = Static120.anInt2511 + Static120.anInt2511;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static327.aBooleanArrayArray10[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt3435 = 5;
						local8.anInt3449 = (local8.anInt3444 - Static203.anInt4178 << 8) / local12;
						local8.anInt3443 = (local8.anInt3437 - Static203.anInt4178 << 8) / local12;
						local8.anInt3447 = (local8.anInt3453 - Static332.anInt5918 << 8) / local12;
						local8.anInt3452 = (local8.anInt3445 - Static332.anInt5918 << 8) / local12;
						Static170.aClass113Array2[Static292.anInt5387++] = local8;
					}
				}
			}
		}
	}
}
