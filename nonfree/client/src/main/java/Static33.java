import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "Lclient!bq;")
	public static Class28 aClass28_1;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public static int anInt601;

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public static int anInt600 = 0;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Z")
	public static final boolean aBoolean43 = false;

	@OriginalMember(owner = "client!bd", name = "n", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray4 = new String[5];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BC)Z")
	public static boolean method674(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(28) char[] local28 = Static289.aCharArray7;
			for (@Pc(30) int local30 = 0; local30 < local28.length; local30++) {
				@Pc(36) char local36 = local28[local30];
				if (local36 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I")
	public static int method675(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static447.method6828(arg0);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method676(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg1];
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg1 + arg2;
		for (@Pc(21) int local21 = arg2; local21 < local19; local21++) {
			@Pc(29) int local29 = arg0[local21] & 0xFF;
			if (local29 < 128) {
				local13[local15++] = (char) local29;
			} else if (local29 >= 194) {
				@Pc(83) int local83;
				if (local29 >= 224) {
					if (local29 >= 240) {
						if (local29 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
					}
					if (local19 <= local21 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local83 = arg0[local21] & 0xFF;
					if (local83 >= 128 && local83 <= 191) {
						local21++;
						@Pc(101) int local101 = arg0[local21] & 0xFF;
						if (local101 >= 128 && local101 <= 191) {
							local13[local15++] = (char) ((local83 & 0xFFFFFF7F) << 6 | (local29 & 0xFFF1F) << 12 | local101 & 0xFFFFFF7F);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local19 > local21 + 1) {
					local21++;
					local83 = arg0[local21] & 0xFF;
					if (local83 < 128 || local83 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) (local83 & 0xFFFFFF7F | (local29 & 0x3FFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
			}
		}
		return new String(local13, 0, local15);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!dda;ILclient!dda;Lclient!dda;Lclient!dda;)V")
	public static void method677(@OriginalArg(0) Class53 arg0, @OriginalArg(2) Class53 arg1, @OriginalArg(3) Class53 arg2, @OriginalArg(4) Class53 arg3) {
		Static408.aClass53_148 = arg0;
		Static391.aClass53_112 = arg2;
		Static298.aClass53_85 = arg1;
		Static335.aClass53_95 = arg3;
		Static235.aClass310ArrayArray2 = new Class310[Static298.aClass53_85.method1607()][];
		Static99.aBooleanArray13 = new boolean[Static298.aClass53_85.method1607()];
	}
}
