import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
	public static int anInt3419;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "J")
	public static volatile long aLong118 = 0L;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	public static void method3145(@OriginalArg(0) int arg0) {
		if (Static337.anIntArray814 == null || arg0 > Static337.anIntArray814.length) {
			Static337.anIntArray814 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!bi;)I")
	public static int method3152(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1) {
		if (arg1.anIntArrayArray6 == null || arg1.anIntArrayArray6.length <= arg0) {
			return -2;
		}
		try {
			@Pc(23) int[] local23 = arg1.anIntArrayArray6[arg0];
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			while (true) {
				@Pc(34) int local34 = local23[local27++];
				@Pc(36) int local36 = 0;
				@Pc(38) byte local38 = 0;
				if (local34 == 0) {
					return local25;
				}
				if (local34 == 1) {
					local36 = Static204.anIntArray557[local23[local27++]];
				}
				if (local34 == 2) {
					local36 = Static145.anIntArray414[local23[local27++]];
				}
				if (local34 == 3) {
					local36 = Static212.anIntArray580[local23[local27++]];
				}
				@Pc(88) int local88;
				@Pc(101) Class26 local101;
				@Pc(106) int local106;
				@Pc(120) int local120;
				if (local34 == 4) {
					local88 = local23[local27++] << 16;
					@Pc(95) int local95 = local88 + local23[local27++];
					local101 = Static245.method4231(local95);
					local106 = local23[local27++];
					if (local106 != -1 && (!Static17.method4472(local106).aBoolean311 || Static204.aBoolean315)) {
						for (local120 = 0; local120 < local101.anIntArray72.length; local120++) {
							if (local101.anIntArray72[local120] == local106 + 1) {
								local36 += local101.anIntArray69[local120];
							}
						}
					}
				}
				if (local34 == 5) {
					local36 = Static212.anIntArray579[local23[local27++]];
				}
				if (local34 == 6) {
					local36 = Class7_Sub4_Sub7.anIntArray296[Static145.anIntArray414[local23[local27++]] - 1];
				}
				if (local34 == 7) {
					local36 = Static212.anIntArray579[local23[local27++]] * 100 / 46875;
				}
				if (local34 == 8) {
					local36 = Static252.aClass22_Sub2_Sub1_Sub1_4.anInt1020;
				}
				if (local34 == 9) {
					for (local88 = 0; local88 < 25; local88++) {
						if (Static86.aBooleanArray13[local88]) {
							local36 += Static145.anIntArray414[local88];
						}
					}
				}
				if (local34 == 10) {
					local88 = local23[local27++] << 16;
					local88 += local23[local27++];
					local101 = Static245.method4231(local88);
					local106 = local23[local27++];
					if (local106 != -1 && (!Static17.method4472(local106).aBoolean311 || Static204.aBoolean315)) {
						for (local120 = 0; local120 < local101.anIntArray72.length; local120++) {
							if (local101.anIntArray72[local120] == local106 + 1) {
								local36 = 999999999;
								break;
							}
						}
					}
				}
				if (local34 == 11) {
					local36 = Static152.anInt3253;
				}
				if (local34 == 12) {
					local36 = Static182.anInt3703;
				}
				if (local34 == 13) {
					local88 = Static212.anIntArray579[local23[local27++]];
					@Pc(303) int local303 = local23[local27++];
					local36 = (local88 & 0x1 << local303) == 0 ? 0 : 1;
				}
				if (local34 == 15) {
					local38 = 1;
				}
				if (local34 == 14) {
					local88 = local23[local27++];
					local36 = Static141.method2849(local88);
				}
				if (local34 == 16) {
					local38 = 2;
				}
				if (local34 == 18) {
					local36 = Static350.anInt6609 + (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5973 >> 7);
				}
				if (local34 == 17) {
					local38 = 3;
				}
				if (local34 == 19) {
					local36 = (Static252.aClass22_Sub2_Sub1_Sub1_4.anInt5967 >> 7) + Static237.anInt4696;
				}
				if (local34 == 20) {
					local36 = local23[local27++];
				}
				if (local38 == 0) {
					if (local29 == 0) {
						local25 += local36;
					}
					if (local29 == 1) {
						local25 -= local36;
					}
					if (local29 == 2 && local36 != 0) {
						local25 /= local36;
					}
					if (local29 == 3) {
						local25 *= local36;
					}
					local29 = 0;
				} else {
					local29 = local38;
				}
			}
		} catch (@Pc(426) Exception local426) {
			return -1;
		}
	}
}
