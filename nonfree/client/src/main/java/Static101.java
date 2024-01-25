import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	public static int anInt1355;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_27 = new Class142("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!eo", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "[B")
	public static final byte[] aByteArray15 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
	public static int anInt1354 = 0;

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!eo", name = "n", descriptor = "[I")
	public static final int[] anIntArray136 = new int[2];

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method1182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(22) int local22 = arg1 + arg0;
		for (@Pc(24) int local24 = arg0; local24 < local22; local24++) {
			@Pc(32) int local32 = arg2[local24] & 0xFF;
			if (local32 >= 128) {
				if (local32 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local32);
				}
				@Pc(62) int local62;
				if (local32 < 224) {
					if (local22 <= local24 + 1) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local24++;
					local62 = arg2[local24] & 0xFF;
					if (local62 < 128 || local62 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local62 & 0xFFFFFF7F | (local32 & 0x3FFFF3F) << 6);
				} else if (local32 < 240) {
					if (local24 + 2 >= local22) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local24++;
					local62 = arg2[local24] & 0xFF;
					if (local62 < 128 || local62 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local24++;
					@Pc(148) int local148 = arg2[local24] & 0xFF;
					if (local148 < 128 || local148 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) ((local62 & 0x3FFFF7F) << 6 | (local32 & 0xFFFFFF1F) << 12 | local148 & 0xFFFFFF7F);
				} else if (local32 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local32);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				local8[local10++] = (char) local32;
			}
		}
		return new String(local8, 0, local10);
	}
}
