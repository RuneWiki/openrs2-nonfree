import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
	public static int anInt7334;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[100];

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method5578(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) char[] local16 = new char[local13];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			@Pc(28) int local28 = arg0[local20] & 0xFF;
			if (local28 >= 128) {
				if (local28 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
				}
				@Pc(63) int local63;
				if (local28 >= 224) {
					if (local28 >= 240) {
						if (local28 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local20 + 2 >= local13) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local20++;
					local63 = arg0[local20] & 0xFF;
					if (local63 < 128 || local63 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local20++;
					@Pc(81) int local81 = arg0[local20] & 0xFF;
					if (local81 < 128 || local81 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local16[local18++] = (char) ((local63 & 0xFFFFFF7F) << 6 | (local28 & 0xFFF1F) << 12 | local81 & 0xFFFFFF7F);
				} else if (local13 > local20 + 1) {
					local20++;
					local63 = arg0[local20] & 0xFF;
					if (local63 < 128 || local63 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local16[local18++] = (char) ((local28 & 0x3FFFF3F) << 6 | local63 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local16[local18++] = (char) local28;
			}
		}
		return new String(local16, 0, local18);
	}
}
