import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!ns", name = "u", descriptor = "Lclient!pl;")
	public static Class259 aClass259_119;

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_182 = new Class363(105, 14);

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZZI)Ljava/lang/String;")
	public static String method5492(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(37) int local37 = 2;
		for (@Pc(41) int local41 = arg0 / 10; local41 != 0; local41 /= 10) {
			local37++;
		}
		@Pc(53) char[] local53 = new char[local37];
		local53[0] = '+';
		for (@Pc(68) int local68 = local37 - 1; local68 > 0; local68--) {
			@Pc(72) int local72 = arg0;
			arg0 /= 10;
			@Pc(83) int local83 = local72 - arg0 * 10;
			if (local83 >= 10) {
				local53[local68] = (char) (local83 + 87);
			} else {
				local53[local68] = (char) (local83 + 48);
			}
		}
		return new String(local53);
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I[B)Ljava/lang/String;")
	public static String method5495(@OriginalArg(1) byte[] arg0) {
		@Pc(8) int local8 = arg0.length;
		@Pc(11) char[] local11 = new char[local8];
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local8; local15++) {
			@Pc(28) int local28 = arg0[local15] & 0xFF;
			if (local28 >= 128) {
				if (local28 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local28);
				}
				@Pc(56) int local56;
				if (local28 < 224) {
					if (local15 + 1 >= local8) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local56 = arg0[local15] & 0xFF;
					if (local56 < 128 || local56 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) ((local28 & 0xFFFFFF3F) << 6 | local56 & 0xFFFFFF7F);
				} else if (local28 < 240) {
					if (local15 + 2 >= local8) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local15++;
					local56 = arg0[local15] & 0xFF;
					if (local56 < 128 || local56 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local15++;
					@Pc(146) int local146 = arg0[local15] & 0xFF;
					if (local146 < 128 || local146 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local11[local13++] = (char) (local146 & 0xFFFFFF7F | (local28 & 0xFFFFFF1F) << 12 | (local56 & 0x3FFFF7F) << 6);
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

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)V")
	public static void method5496() {
		Static298.method4515(false);
		if (Static233.anInt4346 >= 0 && Static233.anInt4346 != 0) {
			Static547.method5859(Static233.anInt4346);
			Static233.anInt4346 = -1;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5497(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			for (@Pc(34) long local34 = arg0; local34 != 0L; local34 /= 37L) {
				local32++;
			}
			@Pc(50) StringBuffer local50 = new StringBuffer(local32);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static421.aCharArray11[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					@Pc(76) int local76 = local50.length() - 1;
					local50.setCharAt(local76, Character.toUpperCase(local50.charAt(local76)));
					local68 = ' ';
				}
				local50.append(local68);
			}
			local50.reverse();
			local50.setCharAt(0, Character.toUpperCase(local50.charAt(0)));
			return local50.toString();
		}
	}
}
