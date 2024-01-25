import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_72 = new Class163(28, 3);

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "[Lclient!qd;")
	public static final Class197[] aClass197Array1 = new Class197[2048];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method2293(@OriginalArg(0) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(28) int local28 = arg0[local20] & 0xFF;
			if (local28 >= 128) {
				if (local28 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
				}
				@Pc(80) int local80;
				if (local28 >= 224) {
					if (local28 >= 240) {
						if (local28 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
					}
					if (local20 + 2 >= local8) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local20++;
					local80 = arg0[local20] & 0xFF;
					if (local80 < 128 || local80 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local20++;
					@Pc(100) int local100 = arg0[local20] & 0xFF;
					if (local100 < 128 || local100 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local18++] = (char) (local100 & 0xFFFFFF7F | (local80 & 0xFFFFFF7F) << 6 | (local28 & 0xFFFFFF1F) << 12);
				} else if (local8 > local20 + 1) {
					local20++;
					local80 = arg0[local20] & 0xFF;
					if (local80 < 128 || local80 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local18++] = (char) ((local28 & 0xFFFFFF3F) << 6 | local80 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local11[local18++] = (char) local28;
			}
		}
		return new String(local11, 0, local18);
	}
}
