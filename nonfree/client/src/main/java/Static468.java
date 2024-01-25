import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "Lclient!pn;")
	public static final Class249 aClass249_6 = new Class249();

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "Z")
	public static boolean aBoolean540 = false;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)I")
	public static int method6546(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(50) int local50 = Static1.method47(4, arg0 + 91923, arg1 + 45365) + (Static1.method47(2, arg0 + 37821, arg1 + 10294) - 128 >> 1) + (Static1.method47(1, arg0, arg1) + -128 >> 2) - 128;
		local50 = (int) ((double) local50 * 0.3D) + 35;
		if (local50 < 10) {
			local50 = 10;
		} else if (local50 > 60) {
			local50 = 60;
		}
		return local50;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIZI)I")
	public static int method6554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 & 0x3;
		if (local16 == 0) {
			return arg0;
		} else if (local16 == 1) {
			return arg1;
		} else if (local16 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	public static void method6558() {
		if (Static152.aClass57_4.aBoolean74 && Static368.aClass147_4.anInt3691 != -1) {
			Static122.method1852(Static368.aClass147_4.anInt3691, Static368.aClass147_4.aString55);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method6563(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 + arg2;
		for (@Pc(25) int local25 = arg0; local25 < local14; local25++) {
			@Pc(33) int local33 = arg1[local25] & 0xFF;
			if (local33 < 128) {
				local8[local10++] = (char) local33;
			} else if (local33 >= 194) {
				@Pc(72) int local72;
				if (local33 >= 224) {
					if (local33 >= 240) {
						if (local33 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local33);
					}
					if (local14 <= local25 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local25++;
					local72 = arg1[local25] & 0xFF;
					if (local72 >= 128 && local72 <= 191) {
						local25++;
						@Pc(92) int local92 = arg1[local25] & 0xFF;
						if (local92 >= 128 && local92 <= 191) {
							local8[local10++] = (char) ((local33 & 0xFFF1F) << 12 | (local72 & 0xFFFFFF7F) << 6 | local92 & 0xFFFFFF7F);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local14 > local25 + 1) {
					local25++;
					local72 = arg1[local25] & 0xFF;
					if (local72 < 128 || local72 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) ((local33 & 0x3FFFF3F) << 6 | local72 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local33);
			}
		}
		return new String(local8, 0, local10);
	}
}
