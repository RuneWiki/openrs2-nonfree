import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!qaa;")
	public static Class144 aClass144_4;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public static int anInt10555;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "[I")
	public static final int[] anIntArray778 = new int[32];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI[BI)Ljava/lang/String;")
	public static String method8799(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg2 + arg0;
		while (local17 < local21) {
			@Pc(30) int local30 = arg1[local17++] & 0xFF;
			@Pc(40) int local40;
			if (local30 >= 128) {
				if (local30 < 192) {
					local40 = 65533;
				} else if (local30 >= 224) {
					if (local30 < 240) {
						if (local17 + 1 < local21 && (arg1[local17] & 0xC0) == 128 && (arg1[local17 + 1] & 0xC0) == 128) {
							local40 = (local30 & 0xF) << 12 | (arg1[local17++] & 0x3F) << 6 | arg1[local17++] & 0x3F;
							if (local40 < 2048) {
								local40 = 65533;
							}
						} else {
							local40 = 65533;
						}
					} else if (local30 >= 248) {
						local40 = 65533;
					} else if (local17 + 2 < local21 && (arg1[local17] & 0xC0) == 128 && (arg1[local17 + 1] & 0xC0) == 128 && (arg1[local17 + 2] & 0xC0) == 128) {
						local40 = (arg1[local17++] & 0x3F) << 12 | (local30 & 0x7) << 18 | (arg1[local17++] & 0x3F) << 6 | arg1[local17++] & 0x3F;
						if (local40 >= 65536 && local40 <= 1114111) {
							local40 = 65533;
						} else {
							local40 = 65533;
						}
					} else {
						local40 = 65533;
					}
				} else if (local21 > local17 && (arg1[local17] & 0xC0) == 128) {
					local40 = (local30 & 0x1F) << 6 | arg1[local17++] & 0x3F;
					if (local40 < 128) {
						local40 = 65533;
					}
				} else {
					local40 = 65533;
				}
			} else if (local30 == 0) {
				local40 = 65533;
			} else {
				local40 = local30;
			}
			local8[local10++] = (char) local40;
		}
		return new String(local8, 0, local10);
	}
}
