import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B[B)Ljava/lang/String;")
	public static String method2527(@OriginalArg(1) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(23) int local23 = arg0[local15] & 0xFF;
			if (local23 >= 128) {
				if (local23 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local23);
				}
				@Pc(65) int local65;
				if (local23 >= 224) {
					if (local23 >= 240) {
						if (local23 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local23);
					}
					if (local8 <= local15 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local65 = arg0[local15] & 0xFF;
					if (local65 >= 128 && local65 <= 191) {
						local15++;
						@Pc(87) int local87 = arg0[local15] & 0xFF;
						if (local87 >= 128 && local87 <= 191) {
							local11[local13++] = (char) ((local65 & 0x3FFFF7F) << 6 | (local23 & 0xFFFFFF1F) << 12 | local87 & 0xFFFFFF7F);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local15 + 1 < local8) {
					local15++;
					local65 = arg0[local15] & 0xFF;
					if (local65 < 128 || local65 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local65 & 0xFFFFFF7F | (local23 & 0x3FFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local11[local13++] = (char) local23;
			}
		}
		return new String(local11, 0, local13);
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)Lclient!dt;")
	public static Class4_Sub12 method2528() {
		if (Static292.aClass244_35 == null || Static103.aClass208_1 == null) {
			return null;
		}
		for (@Pc(16) Class4_Sub12 local16 = (Class4_Sub12) Static103.aClass208_1.method4288(); local16 != null; local16 = (Class4_Sub12) Static103.aClass208_1.method4288()) {
			@Pc(24) Class100 local24 = Static292.aClass235_4.method4957(local16.anInt1566);
			if (local24 != null && local24.aBoolean162 && local24.method1962(Static292.anInterface12_2)) {
				return local16;
			}
		}
		return null;
	}
}
