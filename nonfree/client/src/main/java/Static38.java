import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "Lclient!dea;")
	public static Class8_Sub15 aClass8_Sub15_1;

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "[Lclient!bk;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_4 = new Class316(10, 2, 2, 0);

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_11 = new Class257(35, 11);

	@OriginalMember(owner = "client!bg", name = "o", descriptor = "[F")
	public static final float[] aFloatArray21 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!ha;IIIIIBI)V")
	public static void method1270(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4) {
		Static580.aClass16_10 = arg0;
		Static114.aClass54_2 = Static580.aClass16_10.method6076();
		Static332.aClass54_5 = Static580.aClass16_10.method6076();
		Static499.aClass54_9 = Static580.aClass16_10.method6076();
		Static384.anInt7468 = 0;
		Static105.anInt2774 = 1;
		Static408.anInt7795 = 2;
		Static373.anInt8863 = 2;
		Static104.anInt2768 = 0;
		Static266.anInt5676 = arg3;
		Static332.anInt6574 = arg1;
		Static271.anInterface11_1 = null;
		Static599.method8250(arg4, arg2);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method1272(@OriginalArg(0) Class16 arg0) {
		if (Static211.aBoolean370) {
			Static514.method7394(arg0);
		} else {
			Static211.method4036(arg0);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II[B)[B")
	public static byte[] method1273(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(13) byte[] local13 = new byte[arg0];
		Static649.method5532(arg1, 0, local13, 0, arg0);
		return local13;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)Z")
	public static boolean method1275(@OriginalArg(1) boolean arg0) {
		@Pc(11) boolean local11 = Static171.aClass16_5.method6079();
		if (local11 == arg0) {
			return true;
		}
		if (!arg0) {
			Static171.aClass16_5.method6075();
		} else if (!Static171.aClass16_5.method6133()) {
			arg0 = false;
		}
		if (local11 == arg0) {
			return false;
		} else {
			Static155.aClass8_Sub25_6.method3465(Static155.aClass8_Sub25_6.aClass36_Sub29_1, arg0 ? 1 : 0);
			Static35.method7912();
			return true;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
	public static String method1276(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = arg1 + arg2;
		while (local17 < local21) {
			@Pc(30) int local30 = arg0[local17++] & 0xFF;
			@Pc(93) int local93;
			if (local30 >= 128) {
				if (local30 < 192) {
					local93 = 65533;
				} else if (local30 >= 224) {
					if (local30 >= 240) {
						if (local30 >= 248) {
							local93 = 65533;
						} else if (local21 > local17 + 2 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128 && (arg0[local17 + 2] & 0xC0) == 128) {
							local93 = (arg0[local17++] & 0x3F) << 12 | (local30 & 0x7) << 18 | (arg0[local17++] & 0x3F) << 6 | arg0[local17++] & 0x3F;
							if (local93 >= 65536 && local93 <= 1114111) {
								local93 = 65533;
							} else {
								local93 = 65533;
							}
						} else {
							local93 = 65533;
						}
					} else if (local21 > local17 + 1 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128) {
						local93 = (arg0[local17++] & 0x3F) << 6 | (local30 & 0xF) << 12 | arg0[local17++] & 0x3F;
						if (local93 < 2048) {
							local93 = 65533;
						}
					} else {
						local93 = 65533;
					}
				} else if (local21 > local17 && (arg0[local17] & 0xC0) == 128) {
					local93 = (local30 & 0x1F) << 6 | arg0[local17++] & 0x3F;
					if (local93 < 128) {
						local93 = 65533;
					}
				} else {
					local93 = 65533;
				}
			} else if (local30 == 0) {
				local93 = 65533;
			} else {
				local93 = local30;
			}
			local8[local10++] = (char) local93;
		}
		return new String(local8, 0, local10);
	}
}
