import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
	public static int anInt1460;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public static void method1021() {
		Static449.method6425();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method1026(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg2];
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg2 + arg1;
		for (@Pc(21) int local21 = arg1; local21 < local19; local21++) {
			@Pc(29) int local29 = arg0[local21] & 0xFF;
			if (local29 >= 128) {
				if (local29 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
				}
				@Pc(66) int local66;
				if (local29 < 224) {
					if (local21 + 1 >= local19) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local66 = arg0[local21] & 0xFF;
					if (local66 < 128 || local66 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) ((local29 & 0x3FFFF3F) << 6 | local66 & 0xFFFFFF7F);
				} else if (local29 < 240) {
					if (local19 <= local21 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local66 = arg0[local21] & 0xFF;
					if (local66 < 128 || local66 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local21++;
					@Pc(139) int local139 = arg0[local21] & 0xFF;
					if (local139 < 128 || local139 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) ((local29 & 0xFFFFFF1F) << 12 | (local66 & 0x3FFFF7F) << 6 | local139 & 0xFFFFFF7F);
				} else if (local29 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				local13[local15++] = (char) local29;
			}
		}
		return new String(local13, 0, local15);
	}
}
