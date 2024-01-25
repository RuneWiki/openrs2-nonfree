import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	public static int anInt9780;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "[I")
	public static int[] anIntArray712;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!iv;")
	public static final Class150 aClass150_8 = new Class150();

	@OriginalMember(owner = "client!q", name = "c", descriptor = "[S")
	public static short[] aShortArray162 = new short[256];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([BZII)Ljava/lang/String;")
	public static String method7798(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg2];
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg2 + arg1;
		for (@Pc(21) int local21 = arg1; local21 < local19; local21++) {
			@Pc(29) int local29 = arg0[local21] & 0xFF;
			if (local29 < 128) {
				local13[local15++] = (char) local29;
			} else if (local29 >= 194) {
				@Pc(76) int local76;
				if (local29 < 224) {
					if (local21 + 1 >= local19) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local76 = arg0[local21] & 0xFF;
					if (local76 < 128 || local76 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) ((local29 & 0x3FFFF3F) << 6 | local76 & 0xFFFFFF7F);
				} else if (local29 < 240) {
					if (local21 + 2 >= local19) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local76 = arg0[local21] & 0xFF;
					if (local76 < 128 || local76 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local21++;
					@Pc(147) int local147 = arg0[local21] & 0xFF;
					if (local147 < 128 || local147 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) (local147 & 0xFFFFFF7F | (local29 & 0xFFF1F) << 12 | (local76 & 0xFFFFFF7F) << 6);
				} else if (local29 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
			}
		}
		return new String(local13, 0, local15);
	}
}
