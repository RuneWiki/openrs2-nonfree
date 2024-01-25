import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[Lclient!bba;")
	public static final Class1_Sub6_Sub1[] aClass1_Sub6_Sub1Array3 = new Class1_Sub6_Sub1[14];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!la;)V")
	public static void method3774(@OriginalArg(0) Class64 arg0) {
		Static162.aClass64_6 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method3775(@OriginalArg(0) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(23) int local23 = arg0[local15] & 0xFF;
			if (local23 >= 128) {
				if (local23 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local23);
				}
				@Pc(62) int local62;
				if (local23 < 224) {
					if (local8 <= local15 + 1) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local62 = arg0[local15] & 0xFF;
					if (local62 < 128 || local62 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local62 & 0xFFFFFF7F | (local23 & 0xFFFFFF3F) << 6);
				} else if (local23 < 240) {
					if (local15 + 2 >= local8) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local62 = arg0[local15] & 0xFF;
					if (local62 < 128 || local62 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(154) int local154 = arg0[local15] & 0xFF;
					if (local154 < 128 || local154 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local62 & 0xFFFFFF7F) << 6 | (local23 & 0xFFFFFF1F) << 12 | local154 & 0xFFFFFF7F);
				} else if (local23 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local23);
				}
			} else {
				local11[local13++] = (char) local23;
			}
		}
		return new String(local11, 0, local13);
	}
}
