import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!el", name = "k", descriptor = "I")
	public static int anInt3186 = 0;

	@OriginalMember(owner = "client!el", name = "u", descriptor = "Lclient!sga;")
	public static final Class307 aClass307_21 = new Class307(32);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(CI)Z")
	public static boolean method2908(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method2909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg0;
		@Pc(25) int local25 = arg0 + arg1;
		while (local25 > local20) {
			@Pc(34) int local34 = arg2[local20++] & 0xFF;
			@Pc(76) int local76;
			if (local34 >= 128) {
				if (local34 < 192) {
					local76 = 65533;
				} else if (local34 < 224) {
					if (local20 < local25 && (arg2[local20] & 0xC0) == 128) {
						local76 = arg2[local20++] & 0x3F | (local34 & 0x1F) << 6;
						if (local76 < 128) {
							local76 = 65533;
						}
					} else {
						local76 = 65533;
					}
				} else if (local34 < 240) {
					if (local25 > local20 + 1 && (arg2[local20] & 0xC0) == 128 && (arg2[local20 + 1] & 0xC0) == 128) {
						local76 = (local34 & 0xF) << 12 | (arg2[local20++] & 0x3F) << 6 | arg2[local20++] & 0x3F;
						if (local76 < 2048) {
							local76 = 65533;
						}
					} else {
						local76 = 65533;
					}
				} else if (local34 >= 248) {
					local76 = 65533;
				} else if (local25 > local20 + 2 && (arg2[local20] & 0xC0) == 128 && (arg2[local20 + 1] & 0xC0) == 128 && (arg2[local20 + 2] & 0xC0) == 128) {
					local76 = (local34 & 0x7) << 18 | (arg2[local20++] & 0x3F) << 12 | (arg2[local20++] & 0x3F) << 6 | arg2[local20++] & 0x3F;
					if (local76 >= 65536 && local76 <= 1114111) {
						local76 = 65533;
					} else {
						local76 = 65533;
					}
				} else {
					local76 = 65533;
				}
			} else if (local34 == 0) {
				local76 = 65533;
			} else {
				local76 = local34;
			}
			local8[local18++] = (char) local76;
		}
		return new String(local8, 0, local18);
	}
}
