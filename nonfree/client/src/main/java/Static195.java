import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "Lclient!sm;")
	public static Class186 aClass186_1;

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
	public static int anInt3838;

	@OriginalMember(owner = "client!mn", name = "j", descriptor = "Z")
	public static boolean aBoolean270 = false;

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "Z")
	public static boolean aBoolean271 = false;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString226 = "rating: ";

	@OriginalMember(owner = "client!mn", name = "r", descriptor = "[I")
	public static final int[] anIntArray278 = new int[5];

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)I")
	public static int method3506(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!jf;ZI)I")
	public static int method3508(@OriginalArg(0) Class96 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray20 == null || arg0.anIntArrayArray20.length <= arg1) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg0.anIntArrayArray20[arg1];
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			@Pc(30) byte local30 = 0;
			while (true) {
				@Pc(40) int local40 = local24[local28++];
				@Pc(42) int local42 = 0;
				@Pc(44) byte local44 = 0;
				if (local40 == 0) {
					return local26;
				}
				if (local40 == 1) {
					local42 = Static100.anIntArray129[local24[local28++]];
				}
				if (local40 == 2) {
					local42 = Static319.anIntArray517[local24[local28++]];
				}
				if (local40 == 3) {
					local42 = Static184.anIntArray536[local24[local28++]];
				}
				@Pc(93) int local93;
				@Pc(104) Class96 local104;
				@Pc(109) int local109;
				@Pc(122) int local122;
				if (local40 == 4) {
					local93 = local24[local28++] << 16;
					@Pc(100) int local100 = local93 + local24[local28++];
					local104 = Static121.method2396(local100);
					local109 = local24[local28++];
					if (local109 != -1 && (!Static88.method1382(local109).aBoolean380 || Static32.aBoolean63)) {
						for (local122 = 0; local122 < local104.anIntArray191.length; local122++) {
							if (local109 + 1 == local104.anIntArray191[local122]) {
								local42 += local104.anIntArray195[local122];
							}
						}
					}
				}
				if (local40 == 5) {
					local42 = Static69.anIntArray80[local24[local28++]];
				}
				if (local40 == 6) {
					local42 = Class5_Sub9_Sub8.anIntArray130[Static319.anIntArray517[local24[local28++]] - 1];
				}
				if (local40 == 7) {
					local42 = Static69.anIntArray80[local24[local28++]] * 100 / 46875;
				}
				if (local40 == 8) {
					local42 = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4070;
				}
				if (local40 == 9) {
					for (local93 = 0; local93 < 25; local93++) {
						if (Static158.aBooleanArray12[local93]) {
							local42 += Static319.anIntArray517[local93];
						}
					}
				}
				if (local40 == 10) {
					local93 = local24[local28++] << 16;
					local93 += local24[local28++];
					local104 = Static121.method2396(local93);
					local109 = local24[local28++];
					if (local109 != -1 && (!Static88.method1382(local109).aBoolean380 || Static32.aBoolean63)) {
						for (local122 = 0; local122 < local104.anIntArray191.length; local122++) {
							if (local109 + 1 == local104.anIntArray191[local122]) {
								local42 = 999999999;
								break;
							}
						}
					}
				}
				if (local40 == 11) {
					local42 = Static7.anInt246;
				}
				if (local40 == 12) {
					local42 = Static213.anInt4226;
				}
				if (local40 == 13) {
					local93 = Static69.anIntArray80[local24[local28++]];
					@Pc(299) int local299 = local24[local28++];
					local42 = (local93 & 0x1 << local299) == 0 ? 0 : 1;
				}
				if (local40 == 14) {
					local93 = local24[local28++];
					local42 = Static264.method2886(local93);
				}
				if (local40 == 15) {
					local44 = 1;
				}
				if (local40 == 16) {
					local44 = 2;
				}
				if (local40 == 17) {
					local44 = 3;
				}
				if (local40 == 18) {
					local42 = Static263.anInt5063 + (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 >> 7);
				}
				if (local40 == 19) {
					local42 = (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 >> 7) + Static28.anInt773;
				}
				if (local40 == 20) {
					local42 = local24[local28++];
				}
				if (local44 == 0) {
					if (local30 == 0) {
						local26 += local42;
					}
					if (local30 == 1) {
						local26 -= local42;
					}
					if (local30 == 2 && local42 != 0) {
						local26 /= local42;
					}
					if (local30 == 3) {
						local26 *= local42;
					}
					local30 = 0;
				} else {
					local30 = local44;
				}
			}
		} catch (@Pc(413) Exception local413) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(DI)V")
	public static void method3509(@OriginalArg(0) double arg0) {
		if (arg0 == Static264.aDouble9) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static202.anIntArray284[local15] = local27 <= 255 ? local27 : 255;
		}
		Static264.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)V")
	public static void method3510() {
		@Pc(1) Class66 local1 = Static207.aClass66_71;
		synchronized (Static207.aClass66_71) {
			Static207.aClass66_71.method1933();
		}
	}
}
