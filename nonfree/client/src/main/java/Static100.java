import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!en", name = "i", descriptor = "I")
	public static int anInt1338;

	@OriginalMember(owner = "client!en", name = "c", descriptor = "[I")
	public static final int[] anIntArray135 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!en", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!en", name = "m", descriptor = "I")
	public static int anInt1341 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ILclient!hm;II)V")
	public static void method1175(@OriginalArg(1) Class107 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte45 == 0) {
			arg0.anInt2594 = arg0.anInt2611;
		} else if (arg0.aByte45 == 1) {
			arg0.anInt2594 = (arg1 - arg0.anInt2648) / 2 + arg0.anInt2611;
		} else if (arg0.aByte45 == 2) {
			arg0.anInt2594 = arg1 - arg0.anInt2648 - arg0.anInt2611;
		} else if (arg0.aByte45 == 3) {
			arg0.anInt2594 = arg0.anInt2611 * arg1 >> 14;
		} else if (arg0.aByte45 == 4) {
			arg0.anInt2594 = (arg1 - arg0.anInt2648) / 2 + (arg1 * arg0.anInt2611 >> 14);
		} else {
			arg0.anInt2594 = arg1 - arg0.anInt2648 - (arg0.anInt2611 * arg1 >> 14);
		}
		if (arg0.aByte46 == 0) {
			arg0.anInt2618 = arg0.anInt2582;
		} else if (arg0.aByte46 == 1) {
			arg0.anInt2618 = (arg2 - arg0.anInt2606) / 2 + arg0.anInt2582;
		} else if (arg0.aByte46 == 2) {
			arg0.anInt2618 = arg2 - arg0.anInt2582 - arg0.anInt2606;
		} else if (arg0.aByte46 == 3) {
			arg0.anInt2618 = arg2 * arg0.anInt2582 >> 14;
		} else if (arg0.aByte46 == 4) {
			arg0.anInt2618 = (arg2 - arg0.anInt2606) / 2 + (arg2 * arg0.anInt2582 >> 14);
		} else {
			arg0.anInt2618 = arg2 - arg0.anInt2606 - (arg2 * arg0.anInt2582 >> 14);
		}
		if (!Static312.aBoolean465) {
			return;
		}
		if (Static55.method767(arg0).anInt3891 == 0 && arg0.anInt2598 != 0) {
			return;
		}
		if (arg0.anInt2594 < 0) {
			arg0.anInt2594 = 0;
		} else if (arg0.anInt2594 + arg0.anInt2648 > arg1) {
			arg0.anInt2594 = arg1 - arg0.anInt2648;
		}
		if (arg0.anInt2618 < 0) {
			arg0.anInt2618 = 0;
			return;
		}
		if (arg2 < arg0.anInt2606 + arg0.anInt2618) {
			arg0.anInt2618 = arg2 - arg0.anInt2606;
			return;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method1176(@OriginalArg(1) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(23) int local23 = arg0[local15] & 0xFF;
			if (local23 < 128) {
				local11[local13++] = (char) local23;
			} else if (local23 >= 194) {
				@Pc(83) int local83;
				if (local23 >= 224) {
					if (local23 >= 240) {
						if (local23 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local23);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local15 + 2 >= local8) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local83 = arg0[local15] & 0xFF;
					if (local83 < 128 || local83 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(103) int local103 = arg0[local15] & 0xFF;
					if (local103 < 128 || local103 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local103 & 0xFFFFFF7F | (local23 & 0xFFF1F) << 12 | (local83 & 0xFFFFFF7F) << 6);
				} else if (local8 > local15 + 1) {
					local15++;
					local83 = arg0[local15] & 0xFF;
					if (local83 < 128 || local83 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local23 & 0xFFFFFF3F) << 6 | local83 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local23);
			}
		}
		return new String(local11, 0, local13);
	}
}
