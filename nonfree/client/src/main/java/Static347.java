import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!nda", name = "F", descriptor = "I")
	public static int anInt5777;

	@OriginalMember(owner = "client!nda", name = "I", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!nda", name = "C", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_191 = new Class235(29, 6);

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "([BBII)Ljava/lang/String;")
	public static String method4734(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = arg2 + arg1;
		for (@Pc(24) int local24 = arg2; local24 < local22; local24++) {
			@Pc(32) int local32 = arg0[local24] & 0xFF;
			if (local32 >= 128) {
				if (local32 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local32);
				}
				@Pc(84) int local84;
				if (local32 >= 224) {
					if (local32 >= 240) {
						if (local32 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local32);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local24 + 2 >= local22) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local24++;
					local84 = arg0[local24] & 0xFF;
					if (local84 < 128 || local84 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local24++;
					@Pc(102) int local102 = arg0[local24] & 0xFF;
					if (local102 < 128 || local102 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local18++] = (char) (local102 & 0xFFFFFF7F | (local84 & 0xFFFFFF7F) << 6 | (local32 & 0xFFF1F) << 12);
				} else if (local24 + 1 < local22) {
					local24++;
					local84 = arg0[local24] & 0xFF;
					if (local84 < 128 || local84 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local18++] = (char) ((local32 & 0xFFFFFF3F) << 6 | local84 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local8[local18++] = (char) local32;
			}
		}
		return new String(local8, 0, local18);
	}
}
