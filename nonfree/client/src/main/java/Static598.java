import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!wv", name = "A", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_132 = new Class73(102, 7);

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIZ)V")
	public static void method5901(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		Static193.anInt9352 = arg0;
		Static560.anInt9247 = 3;
		Static235.method4085(Static40.aClass105_1.anInt3307, Static40.aClass105_1.aString26);
		if (arg1) {
			Static17.method406("", "", false);
		} else {
			Static1.method7670();
			Static17.method406(Static4.aString3, Static547.aString100, false);
		}
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(II)V")
	public static void method5906(@OriginalArg(1) int arg0) {
		Static186.anInt3869 = 3;
		Static538.anInt8920 = -1;
		Static29.anInt860 = arg0;
		Static230.anInt4710 = 100;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method5910(@OriginalArg(1) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(28) int local28 = arg0[local15] & 0xFF;
			if (local28 >= 128) {
				if (local28 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
				}
				@Pc(73) int local73;
				if (local28 < 224) {
					if (local15 + 1 >= local8) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local73 = arg0[local15] & 0xFF;
					if (local73 < 128 || local73 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local73 & 0xFFFFFF7F | (local28 & 0xFFFFFF3F) << 6);
				} else if (local28 < 240) {
					if (local15 + 2 >= local8) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local73 = arg0[local15] & 0xFF;
					if (local73 < 128 || local73 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(173) int local173 = arg0[local15] & 0xFF;
					if (local173 < 128 || local173 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local173 & 0xFFFFFF7F | (local73 & 0xFFFFFF7F) << 6 | (local28 & 0xFFF1F) << 12);
				} else if (local28 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local28);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				local11[local13++] = (char) local28;
			}
		}
		return new String(local11, 0, local13);
	}
}
