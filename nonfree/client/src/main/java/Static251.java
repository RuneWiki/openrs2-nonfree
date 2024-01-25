import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "Lclient!hc;")
	public static Class119 aClass119_1;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "[[Lclient!th;")
	public static Class283[][] aClass283ArrayArray1;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
	public static int anInt4913;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "[Lclient!rs;")
	public static Class260[] aClass260Array2;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "[I")
	public static final int[] anIntArray470 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	public static int anInt4908 = -1;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
	public static final int anInt4912 = 52;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[SB)[S")
	public static short[] method4230(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static551.method3493(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "()V")
	public static void method4232() {
		Static124.anInt2511 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static216.anInt4206; local3++) {
			@Pc(8) Class260 local8 = Static224.aClass260Array1[local3];
			@Pc(12) int local12;
			if (Static254.anIntArray516 != null) {
				for (local12 = 0; local12 < Static254.anIntArray516.length; local12++) {
					if (Static254.anIntArray516[local12] != -1000000 && (local8.anInt7450 <= Static254.anIntArray516[local12] || local8.anInt7453 <= Static254.anIntArray516[local12]) && (local8.anInt7437 <= Static486.anIntArray751[local12] || local8.anInt7448 <= Static486.anIntArray751[local12]) && (local8.anInt7437 >= Static508.anIntArray776[local12] || local8.anInt7448 >= Static508.anIntArray776[local12]) && (local8.anInt7447 <= Static415.anIntArray701[local12] || local8.anInt7439 <= Static415.anIntArray701[local12]) && (local8.anInt7447 >= Static106.anIntArray207[local12] || local8.anInt7439 >= Static106.anIntArray207[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt7444 == 1) {
				local12 = local8.anInt7451 + anInt4913 - Static393.anInt7097;
				if (local12 >= 0 && local12 <= anInt4913 + anInt4913) {
					local110 = local8.anInt7455 + anInt4913 - Static211.anInt4100;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > anInt4913 + anInt4913) {
						continue;
					}
					local128 = local8.anInt7440 + anInt4913 - Static211.anInt4100;
					if (local128 > anInt4913 + anInt4913) {
						local128 = anInt4913 + anInt4913;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static149.aBooleanArrayArray5[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static311.anInt1617 - local8.anInt7437;
						if (local164 > Static161.anInt2922) {
							local8.anInt7441 = 1;
						} else {
							if (local164 >= -Static161.anInt2922) {
								continue;
							}
							local8.anInt7441 = 2;
							local164 = -local164;
						}
						local8.anInt7452 = (local8.anInt7447 - Static2.anInt5668 << 8) / local164;
						local8.anInt7443 = (local8.anInt7439 - Static2.anInt5668 << 8) / local164;
						local8.anInt7445 = (local8.anInt7450 - Static334.anInt6030 << 8) / local164;
						local8.anInt7449 = (local8.anInt7453 - Static334.anInt6030 << 8) / local164;
						aClass260Array2[Static124.anInt2511++] = local8;
					}
				}
			} else if (local8.anInt7444 == 2) {
				local12 = local8.anInt7455 + anInt4913 - Static211.anInt4100;
				if (local12 >= 0 && local12 <= anInt4913 + anInt4913) {
					local110 = local8.anInt7451 + anInt4913 - Static393.anInt7097;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > anInt4913 + anInt4913) {
						continue;
					}
					local128 = local8.anInt7454 + anInt4913 - Static393.anInt7097;
					if (local128 > anInt4913 + anInt4913) {
						local128 = anInt4913 + anInt4913;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static149.aBooleanArrayArray5[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static2.anInt5668 - local8.anInt7447;
						if (local164 > Static161.anInt2922) {
							local8.anInt7441 = 3;
						} else {
							if (local164 >= -Static161.anInt2922) {
								continue;
							}
							local8.anInt7441 = 4;
							local164 = -local164;
						}
						local8.anInt7442 = (local8.anInt7437 - Static311.anInt1617 << 8) / local164;
						local8.anInt7438 = (local8.anInt7448 - Static311.anInt1617 << 8) / local164;
						local8.anInt7445 = (local8.anInt7450 - Static334.anInt6030 << 8) / local164;
						local8.anInt7449 = (local8.anInt7453 - Static334.anInt6030 << 8) / local164;
						aClass260Array2[Static124.anInt2511++] = local8;
					}
				}
			} else if (local8.anInt7444 == 4) {
				local12 = local8.anInt7450 - Static334.anInt6030;
				if (local12 > Static54.anInt1078) {
					local110 = local8.anInt7455 + anInt4913 - Static211.anInt4100;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > anInt4913 + anInt4913) {
						continue;
					}
					local128 = local8.anInt7440 + anInt4913 - Static211.anInt4100;
					if (local128 > anInt4913 + anInt4913) {
						local128 = anInt4913 + anInt4913;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt7451 + anInt4913 - Static393.anInt7097;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > anInt4913 + anInt4913) {
						continue;
					}
					local164 = local8.anInt7454 + anInt4913 - Static393.anInt7097;
					if (local164 > anInt4913 + anInt4913) {
						local164 = anInt4913 + anInt4913;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static149.aBooleanArrayArray5[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt7441 = 5;
						local8.anInt7442 = (local8.anInt7437 - Static311.anInt1617 << 8) / local12;
						local8.anInt7438 = (local8.anInt7448 - Static311.anInt1617 << 8) / local12;
						local8.anInt7452 = (local8.anInt7447 - Static2.anInt5668 << 8) / local12;
						local8.anInt7443 = (local8.anInt7439 - Static2.anInt5668 << 8) / local12;
						aClass260Array2[Static124.anInt2511++] = local8;
					}
				}
			}
		}
	}
}
