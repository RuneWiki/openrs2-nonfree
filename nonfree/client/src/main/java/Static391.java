import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!to", name = "b", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas5;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Z")
	public static boolean aBoolean443;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "Lclient!qn;")
	public static Class211 aClass211_85;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "[S")
	public static final short[] aShortArray108 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IJIIIILjava/lang/String;IZLjava/lang/String;Z)V")
	public static void method5158(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) String arg8, @OriginalArg(10) boolean arg9) {
		if (!Static339.aBoolean390 && Static351.anInt5841 < 500) {
			@Pc(18) int local18 = arg4 == -1 ? Static340.anInt5535 : arg4;
			@Pc(32) Class4_Sub30 local32 = new Class4_Sub30(arg8, arg5, local18, arg6, arg1, arg0, arg3, arg2, arg9, arg7);
			Static41.aClass244_2.method5273(local32);
			Static351.anInt5841++;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method5160(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg2];
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg2 + arg0;
		for (@Pc(21) int local21 = arg0; local21 < local19; local21++) {
			@Pc(29) int local29 = arg1[local21] & 0xFF;
			if (local29 < 128) {
				local13[local15++] = (char) local29;
			} else if (local29 >= 194) {
				@Pc(68) int local68;
				if (local29 >= 224) {
					if (local29 >= 240) {
						if (local29 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local19 <= local21 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local68 = arg1[local21] & 0xFF;
					if (local68 >= 128 && local68 <= 191) {
						local21++;
						@Pc(88) int local88 = arg1[local21] & 0xFF;
						if (local88 >= 128 && local88 <= 191) {
							local13[local15++] = (char) ((local68 & 0xFFFFFF7F) << 6 | (local29 & 0xFFF1F) << 12 | local88 & 0xFFFFFF7F);
							continue;
						}
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
				} else if (local21 + 1 < local19) {
					local21++;
					local68 = arg1[local21] & 0xFF;
					if (local68 < 128 || local68 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local13[local15++] = (char) ((local29 & 0x3FFFF3F) << 6 | local68 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
			}
		}
		return new String(local13, 0, local15);
	}
}
