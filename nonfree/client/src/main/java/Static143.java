import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "D")
	public static double aDouble3;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public static int anInt3169 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI[B)Ljava/lang/String;")
	public static String method2726(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg1 + arg0;
		while (local17 < local21) {
			@Pc(30) int local30 = arg2[local17++] & 0xFF;
			@Pc(42) int local42;
			if (local30 < 128) {
				if (local30 == 0) {
					local42 = 65533;
				} else {
					local42 = local30;
				}
			} else if (local30 < 192) {
				local42 = 65533;
			} else if (local30 >= 224) {
				if (local30 >= 240) {
					if (local30 >= 248) {
						local42 = 65533;
					} else if (local21 > local17 + 2 && (arg2[local17] & 0xC0) == 128 && (arg2[local17 + 1] & 0xC0) == 128 && (arg2[local17 + 2] & 0xC0) == 128) {
						local42 = (arg2[local17++] & 0x3F) << 12 | local30 << 18 & 0x1C0000 | (arg2[local17++] & 0x3F) << 6 | arg2[local17++] & 0x3F;
						if (local42 >= 65536 && local42 <= 1114111) {
							local42 = 65533;
						} else {
							local42 = 65533;
						}
					} else {
						local42 = 65533;
					}
				} else if (local21 > local17 + 1 && (arg2[local17] & 0xC0) == 128 && (arg2[local17 + 1] & 0xC0) == 128) {
					local42 = (local30 & 0xF) << 12 | (arg2[local17++] & 0x3F) << 6 | arg2[local17++] & 0x3F;
					if (local42 < 2048) {
						local42 = 65533;
					}
				} else {
					local42 = 65533;
				}
			} else if (local21 > local17 && (arg2[local17] & 0xC0) == 128) {
				local42 = (local30 & 0x1F) << 6 | arg2[local17++] & 0x3F;
				if (local42 < 128) {
					local42 = 65533;
				}
			} else {
				local42 = 65533;
			}
			local8[local10++] = (char) local42;
		}
		return new String(local8, 0, local10);
	}
}
