import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method5905(@OriginalArg(0) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(30) int local30 = arg0[local15] & 0xFF;
			if (local30 < 128) {
				local11[local13++] = (char) local30;
			} else if (local30 >= 194) {
				@Pc(83) int local83;
				if (local30 < 224) {
					if (local8 <= local15 + 1) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local83 = arg0[local15] & 0xFF;
					if (local83 < 128 || local83 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local30 & 0xFFFFFF3F) << 6 | local83 & 0xFFFFFF7F);
				} else if (local30 < 240) {
					if (local15 + 2 >= local8) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local83 = arg0[local15] & 0xFF;
					if (local83 < 128 || local83 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(179) int local179 = arg0[local15] & 0xFF;
					if (local179 < 128 || local179 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local179 & 0xFFFFFF7F | (local83 & 0xFFFFFF7F) << 6 | (local30 & 0xFFF1F) << 12);
				} else if (local30 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local30);
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local30);
			}
		}
		return new String(local11, 0, local13);
	}
}
