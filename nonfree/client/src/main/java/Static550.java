import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
	public static int anInt9238;

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "Lclient!gt;")
	public static final Class129 aClass129_7 = new Class129();

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
	public static int anInt9239 = 2;

	@OriginalMember(owner = "client!vca", name = "k", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_127 = new Class61(21, 3);

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BII[B)Ljava/lang/String;")
	public static String method7598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg0 + arg1;
		for (@Pc(21) int local21 = arg0; local21 < local14; local21++) {
			@Pc(29) int local29 = arg2[local21] & 0xFF;
			if (local29 >= 128) {
				if (local29 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
				}
				@Pc(66) int local66;
				if (local29 < 224) {
					if (local14 <= local21 + 1) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local66 = arg2[local21] & 0xFF;
					if (local66 < 128 || local66 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local66 & 0xFFFFFF7F | (local29 & 0x3FFFF3F) << 6);
				} else if (local29 < 240) {
					if (local21 + 2 >= local14) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local66 = arg2[local21] & 0xFF;
					if (local66 < 128 || local66 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local21++;
					@Pc(143) int local143 = arg2[local21] & 0xFF;
					if (local143 < 128 || local143 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local143 & 0xFFFFFF7F | (local29 & 0xFFF1F) << 12 | (local66 & 0xFFFFFF7F) << 6);
				} else if (local29 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
				}
			} else {
				local8[local10++] = (char) local29;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!eh;IB)Ljava/lang/String;")
	public static String method7599(@OriginalArg(0) Class4_Sub9 arg0) {
		try {
			@Pc(16) int local16 = arg0.method5978();
			if (local16 > 32767) {
				local16 = 32767;
			}
			@Pc(28) byte[] local28 = new byte[local16];
			arg0.anInt7219 += Static261.aClass133_1.method3383(arg0.aByteArray97, arg0.anInt7219, 0, local16, local28);
			return Static519.method7291(local28, 0, local16);
		} catch (@Pc(52) Exception local52) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(JJ)J")
	public static long method7600(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IBIIIII)V")
	public static void method7601(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static385.anInt6803 = arg3;
		Static192.anInt4179 = arg5;
		Static414.anInt7167 = arg0;
		Static231.anInt4730 = arg1;
		Static534.anInt9046 = arg2;
		Static149.anInt3331 = arg4;
	}
}
