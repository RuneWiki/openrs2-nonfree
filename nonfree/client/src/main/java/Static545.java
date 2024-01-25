import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "I")
	public static int anInt9127;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
	public static int anInt9126 = 0;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "[I")
	public static final int[] anIntArray729 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wt", name = "i", descriptor = "[I")
	public static final int[] anIntArray730 = new int[6];

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)Z")
	public static boolean method7421(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method7423(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 + arg2;
		for (@Pc(25) int local25 = arg2; local25 < local14; local25++) {
			@Pc(33) int local33 = arg1[local25] & 0xFF;
			if (local33 >= 128) {
				if (local33 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local33);
				}
				@Pc(72) int local72;
				if (local33 < 224) {
					if (local25 + 1 >= local14) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local25++;
					local72 = arg1[local25] & 0xFF;
					if (local72 < 128 || local72 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local72 & 0xFFFFFF7F | (local33 & 0xFFFFFF3F) << 6);
				} else if (local33 < 240) {
					if (local25 + 2 >= local14) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local25++;
					local72 = arg1[local25] & 0xFF;
					if (local72 < 128 || local72 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local25++;
					@Pc(145) int local145 = arg1[local25] & 0xFF;
					if (local145 < 128 || local145 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local145 & 0xFFFFFF7F | (local33 & 0xFFFFFF1F) << 12 | (local72 & 0x3FFFF7F) << 6);
				} else if (local33 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local33);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				local8[local10++] = (char) local33;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method7424(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			if (arg0 == arg1.charAt(local17)) {
				local7++;
			}
		}
		return local7;
	}
}
