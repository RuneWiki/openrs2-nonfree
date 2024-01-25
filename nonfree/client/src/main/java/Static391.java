import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!th", name = "e", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_18 = new Class37(13, 0, 1, 0);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIBIIZ)Z")
	public static boolean method5421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(8) int local8 = Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray632[0];
		@Pc(13) int local13 = Static127.aClass11_Sub5_Sub2_Sub1_2.anIntArray633[0];
		if (local8 < 0 || Static234.anInt3949 <= local8 || local13 < 0 || local13 >= Static371.anInt6492) {
			return false;
		} else if (arg0 >= 0 && Static234.anInt3949 > arg0 && arg3 >= 0 && arg3 < Static371.anInt6492) {
			@Pc(80) int local80 = Static396.method5468(arg4, Static235.anIntArray356, arg0, arg6, arg5, local13, Static430.anIntArray596, Static127.aClass11_Sub5_Sub2_Sub1_2.method6215(), arg7, local8, arg2, Static89.aClass225Array2[Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101], arg3, arg1);
			if (local80 < 1) {
				return false;
			}
			Static249.anInt4279 = Static430.anIntArray596[local80 - 1];
			Static331.anInt5943 = Static235.anIntArray356[local80 - 1];
			Static68.aBoolean65 = false;
			Static303.method3585();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method5423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) char[] local13 = new char[arg1];
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg0 + arg1;
		for (@Pc(21) int local21 = arg0; local21 < local19; local21++) {
			@Pc(29) int local29 = arg2[local21] & 0xFF;
			if (local29 >= 128) {
				if (local29 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
				}
				@Pc(74) int local74;
				if (local29 < 224) {
					if (local21 + 1 >= local19) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local74 = arg2[local21] & 0xFF;
					if (local74 < 128 || local74 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) (local74 & 0xFFFFFF7F | (local29 & 0xFFFFFF3F) << 6);
				} else if (local29 < 240) {
					if (local21 + 2 >= local19) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local74 = arg2[local21] & 0xFF;
					if (local74 < 128 || local74 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local21++;
					@Pc(153) int local153 = arg2[local21] & 0xFF;
					if (local153 < 128 || local153 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) ((local74 & 0xFFFFFF7F) << 6 | (local29 & 0xFFF1F) << 12 | local153 & 0xFFFFFF7F);
				} else if (local29 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
				}
			} else {
				local13[local15++] = (char) local29;
			}
		}
		return new String(local13, 0, local15);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)I")
	public static int method5424(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
