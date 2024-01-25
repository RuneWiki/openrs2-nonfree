import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!gi", name = "cc", descriptor = "I")
	public static int anInt3566 = 0;

	@OriginalMember(owner = "client!gi", name = "zc", descriptor = "Lclient!hf;")
	public static final Class129 aClass129_2 = new Class129();

	@OriginalMember(owner = "client!gi", name = "ee", descriptor = "Lclient!vf;")
	public static final Class302 aClass302_1 = new Class302();

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "([BZ)Ljava/lang/String;")
	public static String method3200(@OriginalArg(0) byte[] arg0) {
		@Pc(15) int local15 = arg0.length;
		@Pc(18) char[] local18 = new char[local15];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < local15; local22++) {
			@Pc(30) int local30 = arg0[local22] & 0xFF;
			if (local30 >= 128) {
				if (local30 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local30);
				}
				@Pc(74) int local74;
				if (local30 >= 224) {
					if (local30 >= 240) {
						if (local30 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local30);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local15 <= local22 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local22++;
					local74 = arg0[local22] & 0xFF;
					if (local74 >= 128 && local74 <= 191) {
						local22++;
						@Pc(92) int local92 = arg0[local22] & 0xFF;
						if (local92 >= 128 && local92 <= 191) {
							local18[local20++] = (char) ((local74 & 0x3FFFF7F) << 6 | (local30 & 0xFFFFFF1F) << 12 | local92 & 0xFFFFFF7F);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local15 > local22 + 1) {
					local22++;
					local74 = arg0[local22] & 0xFF;
					if (local74 < 128 || local74 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local18[local20++] = (char) (local74 & 0xFFFFFF7F | (local30 & 0x3FFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local18[local20++] = (char) local30;
			}
		}
		return new String(local18, 0, local20);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)Lclient!tl;")
	public static Class285 method3206(@OriginalArg(0) int arg0) {
		@Pc(8) Class285[] local8 = Static140.method2820();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class285 local16 = local8[local10];
			if (local16.anInt8641 == arg0) {
				return local16;
			}
		}
		return null;
	}
}
