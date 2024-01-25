import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	public static int anInt3013;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
	public static int anInt3014;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "[Lclient!cba;")
	public static final Class6_Sub10[] aClass6_Sub10Array4 = new Class6_Sub10[8];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIB[B)Ljava/lang/String;")
	public static String method2551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) char[] local13 = new char[arg1];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg1 + arg0;
		while (local21 > local17) {
			@Pc(30) int local30 = arg2[local17++] & 0xFF;
			@Pc(39) int local39;
			if (local30 < 128) {
				if (local30 == 0) {
					local39 = 65533;
				} else {
					local39 = local30;
				}
			} else if (local30 < 192) {
				local39 = 65533;
			} else if (local30 < 224) {
				if (local17 < local21 && (arg2[local17] & 0xC0) == 128) {
					local39 = arg2[local17++] & 0x3F | (local30 & 0x1F) << 6;
					if (local39 < 128) {
						local39 = 65533;
					}
				} else {
					local39 = 65533;
				}
			} else if (local30 < 240) {
				if (local17 + 1 < local21 && (arg2[local17] & 0xC0) == 128 && (arg2[local17 + 1] & 0xC0) == 128) {
					local39 = (arg2[local17++] & 0x3F) << 6 | (local30 & 0xF) << 12 | arg2[local17++] & 0x3F;
					if (local39 < 2048) {
						local39 = 65533;
					}
				} else {
					local39 = 65533;
				}
			} else if (local30 >= 248) {
				local39 = 65533;
			} else if (local17 + 2 < local21 && (arg2[local17] & 0xC0) == 128 && (arg2[local17 + 1] & 0xC0) == 128 && (arg2[local17 + 2] & 0xC0) == 128) {
				local39 = (local30 & 0x7) << 18 | (arg2[local17++] & 0x3F) << 12 | (arg2[local17++] & 0x3F) << 6 | arg2[local17++] & 0x3F;
				if (local39 >= 65536 && local39 <= 1114111) {
					local39 = 65533;
				} else {
					local39 = 65533;
				}
			} else {
				local39 = 65533;
			}
			local13[local15++] = (char) local39;
		}
		return new String(local13, 0, local15);
	}
}
