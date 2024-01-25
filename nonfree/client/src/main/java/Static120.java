import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!eaa", name = "r", descriptor = "Lclient!gga;")
	public static Class124 aClass124_33;

	@OriginalMember(owner = "client!eaa", name = "o", descriptor = "Lclient!rl;")
	public static final Class320 aClass320_3 = new Class320();

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method2240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) char[] local13 = new char[arg0];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(22) int local22 = arg1 + arg0;
		while (local22 > local17) {
			@Pc(31) int local31 = arg2[local17++] & 0xFF;
			@Pc(41) int local41;
			if (local31 < 128) {
				if (local31 == 0) {
					local41 = 65533;
				} else {
					local41 = local31;
				}
			} else if (local31 < 192) {
				local41 = 65533;
			} else if (local31 >= 224) {
				if (local31 >= 240) {
					if (local31 >= 248) {
						local41 = 65533;
					} else if (local17 + 2 < local22 && (arg2[local17] & 0xC0) == 128 && (arg2[local17 + 1] & 0xC0) == 128 && (arg2[local17 + 2] & 0xC0) == 128) {
						local41 = (arg2[local17++] & 0x3F) << 12 | (local31 & 0x7) << 18 | (arg2[local17++] & 0x3F) << 6 | arg2[local17++] & 0x3F;
						if (local41 >= 65536 && local41 <= 1114111) {
							local41 = 65533;
						} else {
							local41 = 65533;
						}
					} else {
						local41 = 65533;
					}
				} else if (local22 > local17 + 1 && (arg2[local17] & 0xC0) == 128 && (arg2[local17 + 1] & 0xC0) == 128) {
					local41 = (local31 & 0xF) << 12 | (arg2[local17++] & 0x3F) << 6 | arg2[local17++] & 0x3F;
					if (local41 < 2048) {
						local41 = 65533;
					}
				} else {
					local41 = 65533;
				}
			} else if (local22 > local17 && (arg2[local17] & 0xC0) == 128) {
				local41 = (local31 & 0x1F) << 6 | arg2[local17++] & 0x3F;
				if (local41 < 128) {
					local41 = 65533;
				}
			} else {
				local41 = 65533;
			}
			local13[local15++] = (char) local41;
		}
		return new String(local13, 0, local15);
	}
}
