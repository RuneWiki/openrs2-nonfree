import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_122 = new Class25(51, 8);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method4066(@OriginalArg(1) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) char[] local16 = new char[local13];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			@Pc(28) int local28 = arg0[local20] & 0xFF;
			if (local28 >= 128) {
				if (local28 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
				}
				@Pc(61) int local61;
				if (local28 >= 224) {
					if (local28 >= 240) {
						if (local28 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local13 <= local20 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local20++;
					local61 = arg0[local20] & 0xFF;
					if (local61 < 128 || local61 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local20++;
					@Pc(81) int local81 = arg0[local20] & 0xFF;
					if (local81 < 128 || local81 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local16[local18++] = (char) ((local61 & 0x3FFFF7F) << 6 | local28 << 12 & 0xFFF1F000 | local81 & 0xFFFFFF7F);
				} else if (local13 > local20 + 1) {
					local20++;
					local61 = arg0[local20] & 0xFF;
					if (local61 < 128 || local61 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local16[local18++] = (char) (local61 & 0xFFFFFF7F | (local28 & 0x3FFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local16[local18++] = (char) local28;
			}
		}
		return new String(local16, 0, local18);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
	public static void method4069(@OriginalArg(0) int arg0) {
		Static37.anInt611 = 100;
		Static139.anInt2570 = -1;
		Static377.anInt6587 = arg0;
		Static340.anInt6086 = 3;
	}
}
