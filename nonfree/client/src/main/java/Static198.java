import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([BI)Ljava/lang/String;")
	public static String method3138(@OriginalArg(0) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(26) int local26 = arg0[local15] & 0xFF;
			if (local26 < 128) {
				local11[local13++] = (char) local26;
			} else if (local26 >= 194) {
				@Pc(62) int local62;
				if (local26 < 224) {
					if (local15 + 1 >= local8) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local62 = arg0[local15] & 0xFF;
					if (local62 < 128 || local62 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local62 & 0xFFFFFF7F | (local26 & 0xFFFFFF3F) << 6);
				} else if (local26 < 240) {
					if (local8 <= local15 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local62 = arg0[local15] & 0xFF;
					if (local62 < 128 || local62 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(156) int local156 = arg0[local15] & 0xFF;
					if (local156 < 128 || local156 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local156 & 0xFFFFFF7F | (local26 & 0xFFFFFF1F) << 12 | (local62 & 0x3FFFF7F) << 6);
				} else if (local26 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local26);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local26);
			}
		}
		return new String(local11, 0, local13);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method3139(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "([BI)[B")
	public static byte[] method3140(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static468.method4350(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!za;II)V")
	public static void method3141(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(3) int arg2) {
		Static56.aClass50_1 = arg1;
		Static58.aClass184ArrayArray1 = new Class184[arg2][arg0];
		if (Static395.anIntArray651 != null) {
			Static231.aClass30_3 = Static445.method5938(Static395.anIntArray651[2], Static395.anIntArray651[4], Static395.anIntArray651[5], Static395.anIntArray651[3], Static395.anIntArray651[0], Static395.anIntArray651[1]);
		}
		Static370.aClass184_2 = new Class184();
		Static382.method5563();
	}
}
