import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_50 = new Class125(200);

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Z")
	public static boolean aBoolean556 = false;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	public static int anInt7832 = -60;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method6483(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) char[] local16 = new char[local13];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			@Pc(28) int local28 = arg0[local20] & 0xFF;
			if (local28 < 128) {
				local16[local18++] = (char) local28;
			} else if (local28 >= 194) {
				@Pc(105) int local105;
				if (local28 >= 224) {
					if (local28 >= 240) {
						if (local28 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
					}
					if (local20 + 2 >= local13) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local20++;
					local105 = arg0[local20] & 0xFF;
					if (local105 < 128 || local105 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local20++;
					@Pc(127) int local127 = arg0[local20] & 0xFF;
					if (local127 < 128 || local127 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local16[local18++] = (char) (local127 & 0xFFFFFF7F | (local28 & 0xFFF1F) << 12 | (local105 & 0xFFFFFF7F) << 6);
				} else if (local20 + 1 < local13) {
					local20++;
					local105 = arg0[local20] & 0xFF;
					if (local105 < 128 || local105 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local16[local18++] = (char) (local105 & 0xFFFFFF7F | (local28 & 0x3FFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
			}
		}
		return new String(local16, 0, local18);
	}
}
