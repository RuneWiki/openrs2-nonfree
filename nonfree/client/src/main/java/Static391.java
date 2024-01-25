import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!ts", name = "x", descriptor = "[I")
	public static int[] anIntArray594;

	@OriginalMember(owner = "client!ts", name = "o", descriptor = "Z")
	public static boolean aBoolean453 = true;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "Lclient!br;")
	public static final Class27 aClass27_8 = new Class27();

	@OriginalMember(owner = "client!ts", name = "y", descriptor = "Lclient!qo;")
	public static Class196 aClass196_37 = new Class196(8);

	@OriginalMember(owner = "client!ts", name = "z", descriptor = "[B")
	public static final byte[] aByteArray89 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIZI)V")
	public static void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static414.anInt7043 <= arg1 && arg3 <= Static198.anInt3778 && Static388.anInt6740 <= arg0 && arg6 <= Static387.anInt6727) {
			Static406.method5366(arg3, arg2, arg4, arg6, arg1, arg5, arg0);
		} else {
			Static245.method3385(arg4, arg1, arg5, arg0, arg2, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "()V")
	public static void method5274() {
		Static265.anInt3300 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static18.anInt561; local3++) {
			@Pc(8) Class224 local8 = Static108.aClass224Array2[local3];
			@Pc(12) int local12;
			if (Static90.anIntArray125 != null) {
				for (local12 = 0; local12 < Static90.anIntArray125.length; local12++) {
					if (Static90.anIntArray125[local12] != -1000000 && (local8.anInt6535 <= Static90.anIntArray125[local12] || local8.anInt6549 <= Static90.anIntArray125[local12]) && (local8.anInt6553 <= Static81.anIntArray118[local12] || local8.anInt6541 <= Static81.anIntArray118[local12]) && (local8.anInt6553 >= Static146.anIntArray196[local12] || local8.anInt6541 >= Static146.anIntArray196[local12]) && (local8.anInt6544 <= Static149.anIntArray234[local12] || local8.anInt6546 <= Static149.anIntArray234[local12]) && (local8.anInt6544 >= anIntArray594[local12] || local8.anInt6546 >= anIntArray594[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt6545 == 1) {
				local12 = local8.anInt6539 + Static116.anInt2459 - Static50.anInt1363;
				if (local12 >= 0 && local12 <= Static116.anInt2459 + Static116.anInt2459) {
					local110 = local8.anInt6537 + Static116.anInt2459 - Static354.anInt6362;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static116.anInt2459 + Static116.anInt2459) {
						continue;
					}
					local128 = local8.anInt6542 + Static116.anInt2459 - Static354.anInt6362;
					if (local128 > Static116.anInt2459 + Static116.anInt2459) {
						local128 = Static116.anInt2459 + Static116.anInt2459;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static282.aBooleanArrayArray5[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static284.anInt5181 - local8.anInt6553;
						if (local164 > Static97.anInt2088) {
							local8.anInt6543 = 1;
						} else {
							if (local164 >= -Static97.anInt2088) {
								continue;
							}
							local8.anInt6543 = 2;
							local164 = -local164;
						}
						local8.anInt6551 = (local8.anInt6544 - Static113.anInt2415 << 8) / local164;
						local8.anInt6547 = (local8.anInt6546 - Static113.anInt2415 << 8) / local164;
						local8.anInt6538 = (local8.anInt6535 - Static381.anInt6689 << 8) / local164;
						local8.anInt6550 = (local8.anInt6549 - Static381.anInt6689 << 8) / local164;
						Static31.aClass224Array1[Static265.anInt3300++] = local8;
					}
				}
			} else if (local8.anInt6545 == 2) {
				local12 = local8.anInt6537 + Static116.anInt2459 - Static354.anInt6362;
				if (local12 >= 0 && local12 <= Static116.anInt2459 + Static116.anInt2459) {
					local110 = local8.anInt6539 + Static116.anInt2459 - Static50.anInt1363;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static116.anInt2459 + Static116.anInt2459) {
						continue;
					}
					local128 = local8.anInt6548 + Static116.anInt2459 - Static50.anInt1363;
					if (local128 > Static116.anInt2459 + Static116.anInt2459) {
						local128 = Static116.anInt2459 + Static116.anInt2459;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static282.aBooleanArrayArray5[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static113.anInt2415 - local8.anInt6544;
						if (local164 > Static97.anInt2088) {
							local8.anInt6543 = 3;
						} else {
							if (local164 >= -Static97.anInt2088) {
								continue;
							}
							local8.anInt6543 = 4;
							local164 = -local164;
						}
						local8.anInt6540 = (local8.anInt6553 - Static284.anInt5181 << 8) / local164;
						local8.anInt6536 = (local8.anInt6541 - Static284.anInt5181 << 8) / local164;
						local8.anInt6538 = (local8.anInt6535 - Static381.anInt6689 << 8) / local164;
						local8.anInt6550 = (local8.anInt6549 - Static381.anInt6689 << 8) / local164;
						Static31.aClass224Array1[Static265.anInt3300++] = local8;
					}
				}
			} else if (local8.anInt6545 == 4) {
				local12 = local8.anInt6535 - Static381.anInt6689;
				if (local12 > Static372.anInt7556) {
					local110 = local8.anInt6537 + Static116.anInt2459 - Static354.anInt6362;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static116.anInt2459 + Static116.anInt2459) {
						continue;
					}
					local128 = local8.anInt6542 + Static116.anInt2459 - Static354.anInt6362;
					if (local128 > Static116.anInt2459 + Static116.anInt2459) {
						local128 = Static116.anInt2459 + Static116.anInt2459;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt6539 + Static116.anInt2459 - Static50.anInt1363;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static116.anInt2459 + Static116.anInt2459) {
						continue;
					}
					local164 = local8.anInt6548 + Static116.anInt2459 - Static50.anInt1363;
					if (local164 > Static116.anInt2459 + Static116.anInt2459) {
						local164 = Static116.anInt2459 + Static116.anInt2459;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static282.aBooleanArrayArray5[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt6543 = 5;
						local8.anInt6540 = (local8.anInt6553 - Static284.anInt5181 << 8) / local12;
						local8.anInt6536 = (local8.anInt6541 - Static284.anInt5181 << 8) / local12;
						local8.anInt6551 = (local8.anInt6544 - Static113.anInt2415 << 8) / local12;
						local8.anInt6547 = (local8.anInt6546 - Static113.anInt2415 << 8) / local12;
						Static31.aClass224Array1[Static265.anInt3300++] = local8;
					}
				}
			}
		}
	}
}
