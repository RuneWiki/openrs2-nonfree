import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method3568(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) char[] local13 = new char[arg2];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = arg2 + arg1;
		while (local21 > local17) {
			@Pc(30) int local30 = arg0[local17++] & 0xFF;
			@Pc(64) int local64;
			if (local30 >= 128) {
				if (local30 < 192) {
					local64 = 65533;
				} else if (local30 < 224) {
					if (local17 < local21 && (arg0[local17] & 0xC0) == 128) {
						local64 = arg0[local17++] & 0x3F | (local30 & 0x1F) << 6;
						if (local64 < 128) {
							local64 = 65533;
						}
					} else {
						local64 = 65533;
					}
				} else if (local30 < 240) {
					if (local17 + 1 < local21 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128) {
						local64 = (arg0[local17++] & 0x3F) << 6 | (local30 & 0xF) << 12 | arg0[local17++] & 0x3F;
						if (local64 < 2048) {
							local64 = 65533;
						}
					} else {
						local64 = 65533;
					}
				} else if (local30 >= 248) {
					local64 = 65533;
				} else if (local17 + 2 < local21 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128 && (arg0[local17 + 2] & 0xC0) == 128) {
					local64 = (local30 & 0x7) << 18 | arg0[local17++] << 12 & 0x3F000 | (arg0[local17++] & 0x3F) << 6 | arg0[local17++] & 0x3F;
					if (local64 >= 65536 && local64 <= 1114111) {
						local64 = 65533;
					} else {
						local64 = 65533;
					}
				} else {
					local64 = 65533;
				}
			} else if (local30 == 0) {
				local64 = 65533;
			} else {
				local64 = local30;
			}
			local13[local15++] = (char) local64;
		}
		return new String(local13, 0, local15);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(III)Z")
	public static boolean method3569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
