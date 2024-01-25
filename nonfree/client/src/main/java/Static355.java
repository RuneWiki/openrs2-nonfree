import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Z")
	public static boolean aBoolean411 = false;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "J")
	public static long aLong181 = 0L;

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method4888(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(6) char[] local6 = new char[arg2];
		@Pc(13) int local13 = 0;
		@Pc(17) int local17 = arg2 + arg0;
		for (@Pc(19) int local19 = arg0; local19 < local17; local19++) {
			@Pc(26) int local26 = arg1[local19] & 0xFF;
			if (local26 < 128) {
				local6[local13++] = (char) local26;
			} else if (local26 >= 194) {
				@Pc(64) int local64;
				if (local26 >= 224) {
					if (local26 >= 240) {
						if (local26 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local26);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local17 <= local19 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local19++;
					local64 = arg1[local19] & 0xFF;
					if (local64 >= 128 && local64 <= 191) {
						local19++;
						@Pc(86) int local86 = arg1[local19] & 0xFF;
						if (local86 >= 128 && local86 <= 191) {
							local6[local13++] = (char) ((local64 & 0xFFFFFF7F) << 6 | (local26 & 0xFFF1F) << 12 | local86 & 0xFFFFFF7F);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local19 + 1 < local17) {
					local19++;
					local64 = arg1[local19] & 0xFF;
					if (local64 < 128 || local64 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local6[local13++] = (char) ((local26 & 0x3FFFF3F) << 6 | local64 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local26);
			}
		}
		return new String(local6, 0, local13);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public static void method4889() {
		Static30.aBoolean29 = true;
	}
}
