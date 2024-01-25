import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!kca", name = "m", descriptor = "I")
	public static int anInt4711 = -1;

	@OriginalMember(owner = "client!kca", name = "n", descriptor = "[I")
	public static final int[] anIntArray359 = new int[14];

	@OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
	public static int anInt4713 = 0;

	@OriginalMember(owner = "client!kca", name = "b", descriptor = "(II)I")
	public static int method4339(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method4341(@OriginalArg(1) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(28) int local28 = arg0[local15] & 0xFF;
			if (local28 >= 128) {
				if (local28 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
				}
				@Pc(95) int local95;
				if (local28 >= 224) {
					if (local28 >= 240) {
						if (local28 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
					}
					if (local15 + 2 >= local8) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local95 = arg0[local15] & 0xFF;
					if (local95 < 128 || local95 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(117) int local117 = arg0[local15] & 0xFF;
					if (local117 < 128 || local117 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local28 & 0xFFF1F) << 12 | local95 << 6 & 0xFFFFDFC0 | local117 & 0xFFFFFF7F);
				} else if (local8 > local15 + 1) {
					local15++;
					local95 = arg0[local15] & 0xFF;
					if (local95 < 128 || local95 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local28 & 0x3FFFF3F) << 6 | local95 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local11[local13++] = (char) local28;
			}
		}
		return new String(local11, 0, local13);
	}
}
