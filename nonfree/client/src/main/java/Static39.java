import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!br", name = "ab", descriptor = "Lclient!ub;")
	public static final Class240 aClass240_1 = new Class240("", 13);

	@OriginalMember(owner = "client!br", name = "yb", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_24 = new Class211(26, 6);

	@OriginalMember(owner = "client!br", name = "Cb", descriptor = "I")
	public static int anInt748 = 0;

	@OriginalMember(owner = "client!br", name = "d", descriptor = "(I)Lclient!ti;")
	public static Class2_Sub40 method582() {
		if (Static282.aClass156_23 == null || Static366.aClass32_1 == null) {
			return null;
		}
		Static366.aClass32_1.method666(Static282.aClass156_23);
		@Pc(18) Class2_Sub40 local18 = (Class2_Sub40) Static366.aClass32_1.method668();
		if (local18 == null) {
			return null;
		} else {
			@Pc(36) Class78 local36 = Static282.aClass120_4.method2512(local18.anInt6352);
			return local36 != null && local36.aBoolean144 && local36.method1749(Static282.anInterface12_2) ? local18 : Static286.method3820();
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Lclient!jm;[I[IB[I)V")
	public static void method583(@OriginalArg(0) Class3_Sub4_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg3.length; local12++) {
			@Pc(18) int local18 = arg3[local12];
			@Pc(22) int local22 = arg2[local12];
			@Pc(26) int local26 = arg1[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && arg0.aClass194Array3.length > local28; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg0.aClass194Array3[local28] = null;
					} else {
						@Pc(52) Class128 local52 = Static334.aClass62_2.method1418(local18);
						@Pc(55) int local55 = local52.anInt3329;
						@Pc(60) Class194 local60 = arg0.aClass194Array3[local28];
						if (local60 != null) {
							if (local60.anInt5380 == local18) {
								if (local55 == 0) {
									local60 = arg0.aClass194Array3[local28] = null;
								} else if (local55 == 1) {
									local60.anInt5376 = 1;
									local60.anInt5382 = 0;
									local60.anInt5384 = 0;
									local60.anInt5385 = 0;
									local60.anInt5379 = local26;
									Static128.method1905(local52, arg0.anInt6835, false, arg0.aByte91, arg0.anInt6833, 0);
								} else if (local55 == 2) {
									local60.anInt5385 = 0;
								}
							} else if (local52.anInt3326 >= Static334.aClass62_2.method1418(local60.anInt5380).anInt3326) {
								local60 = arg0.aClass194Array3[local28] = null;
							}
						}
						if (local60 == null) {
							local60 = arg0.aClass194Array3[local28] = new Class194();
							local60.anInt5376 = 1;
							local60.anInt5379 = local26;
							local60.anInt5385 = 0;
							local60.anInt5382 = 0;
							local60.anInt5384 = 0;
							local60.anInt5380 = local18;
							Static128.method1905(local52, arg0.anInt6835, false, arg0.aByte91, arg0.anInt6833, 0);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method595(@OriginalArg(1) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(31) int local31 = arg0[local15] & 0xFF;
			if (local31 < 128) {
				local11[local13++] = (char) local31;
			} else if (local31 >= 194) {
				@Pc(104) int local104;
				if (local31 >= 224) {
					if (local31 >= 240) {
						if (local31 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local31);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local8 <= local15 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local104 = arg0[local15] & 0xFF;
					if (local104 < 128 || local104 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(124) int local124 = arg0[local15] & 0xFF;
					if (local124 < 128 || local124 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local31 & 0xFFFFFF1F) << 12 | (local104 & 0xFFFFFF7F) << 6 | local124 & 0xFFFFFF7F);
				} else if (local15 + 1 < local8) {
					local15++;
					local104 = arg0[local15] & 0xFF;
					if (local104 < 128 || local104 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local31 & 0xFFFFFF3F) << 6 | local104 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local31);
			}
		}
		return new String(local11, 0, local13);
	}
}
