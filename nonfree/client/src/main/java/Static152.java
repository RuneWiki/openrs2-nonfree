import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
	public static int anInt3135;

	@OriginalMember(owner = "client!fp", name = "i", descriptor = "Lclient!fu;")
	public static Class106 aClass106_2;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "[I")
	public static final int[] anIntArray263 = new int[14];

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method2796(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 + arg2;
		for (@Pc(17) int local17 = arg0; local17 < local15; local17++) {
			@Pc(25) int local25 = arg1[local17] & 0xFF;
			if (local25 < 128) {
				local8[local10++] = (char) local25;
			} else if (local25 >= 194) {
				@Pc(62) int local62;
				if (local25 >= 224) {
					if (local25 >= 240) {
						if (local25 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local25);
					}
					if (local15 <= local17 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local17++;
					local62 = arg1[local17] & 0xFF;
					if (local62 >= 128 && local62 <= 191) {
						local17++;
						@Pc(80) int local80 = arg1[local17] & 0xFF;
						if (local80 >= 128 && local80 <= 191) {
							local8[local10++] = (char) (local80 & 0xFFFFFF7F | (local25 & 0xFFF1F) << 12 | (local62 & 0x3FFFF7F) << 6);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local15 > local17 + 1) {
					local17++;
					local62 = arg1[local17] & 0xFF;
					if (local62 < 128 || local62 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) ((local25 & 0x3FFFF3F) << 6 | local62 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local25);
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z")
	public static boolean method2799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static386.method5701(arg0, arg1) | (arg1 & 0x70000) != 0 || Static524.method6964(arg0, arg1);
	}
}
