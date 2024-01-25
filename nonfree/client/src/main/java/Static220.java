import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "Lclient!sj;")
	public static Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_1;

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "[I")
	public static final int[] anIntArray232 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method2892(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) char[] local17 = new char[arg2];
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg1 + arg2;
		for (@Pc(25) int local25 = arg1; local25 < local23; local25++) {
			@Pc(33) int local33 = arg0[local25] & 0xFF;
			if (local33 < 128) {
				local17[local19++] = (char) local33;
			} else if (local33 >= 194) {
				@Pc(77) int local77;
				if (local33 < 224) {
					if (local23 <= local25 + 1) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local25++;
					local77 = arg0[local25] & 0xFF;
					if (local77 < 128 || local77 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local17[local19++] = (char) (local77 & 0xFFFFFF7F | (local33 & 0x3FFFF3F) << 6);
				} else if (local33 < 240) {
					if (local25 + 2 >= local23) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local25++;
					local77 = arg0[local25] & 0xFF;
					if (local77 < 128 || local77 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local25++;
					@Pc(148) int local148 = arg0[local25] & 0xFF;
					if (local148 < 128 || local148 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local17[local19++] = (char) ((local33 & 0xFFF1F) << 12 | (local77 & 0xFFFFFF7F) << 6 | local148 & 0xFFFFFF7F);
				} else if (local33 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local33);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local33);
			}
		}
		return new String(local17, 0, local19);
	}
}
