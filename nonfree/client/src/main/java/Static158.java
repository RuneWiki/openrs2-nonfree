import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!gaa", name = "k", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_57 = new Class90(20, 3);

	@OriginalMember(owner = "client!gaa", name = "o", descriptor = "[I")
	public static final int[] anIntArray165 = new int[3];

	@OriginalMember(owner = "client!gaa", name = "p", descriptor = "I")
	public static int anInt3337 = -1;

	@OriginalMember(owner = "client!gaa", name = "q", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_9 = new Class167(20);

	@OriginalMember(owner = "client!gaa", name = "r", descriptor = "I")
	public static int anInt3338 = 0;

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "([BIZI)Ljava/lang/String;")
	public static String method2662(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg1;
		@Pc(17) int local17 = arg1 + arg2;
		while (local17 > local12) {
			@Pc(31) int local31 = arg0[local12++] & 0xFF;
			@Pc(43) int local43;
			if (local31 < 128) {
				if (local31 == 0) {
					local43 = 65533;
				} else {
					local43 = local31;
				}
			} else if (local31 < 192) {
				local43 = 65533;
			} else if (local31 >= 224) {
				if (local31 < 240) {
					if (local12 + 1 < local17 && (arg0[local12] & 0xC0) == 128 && (arg0[local12 + 1] & 0xC0) == 128) {
						local43 = (local31 & 0xF) << 12 | (arg0[local12++] & 0x3F) << 6 | arg0[local12++] & 0x3F;
						if (local43 < 2048) {
							local43 = 65533;
						}
					} else {
						local43 = 65533;
					}
				} else if (local31 >= 248) {
					local43 = 65533;
				} else if (local12 + 2 < local17 && (arg0[local12] & 0xC0) == 128 && (arg0[local12 + 1] & 0xC0) == 128 && (arg0[local12 + 2] & 0xC0) == 128) {
					local43 = (arg0[local12++] & 0x3F) << 12 | (local31 & 0x7) << 18 | (arg0[local12++] & 0x3F) << 6 | arg0[local12++] & 0x3F;
					if (local43 >= 65536 && local43 <= 1114111) {
						local43 = 65533;
					} else {
						local43 = 65533;
					}
				} else {
					local43 = 65533;
				}
			} else if (local17 > local12 && (arg0[local12] & 0xC0) == 128) {
				local43 = arg0[local12++] & 0x3F | (local31 & 0x1F) << 6;
				if (local43 < 128) {
					local43 = 65533;
				}
			} else {
				local43 = 65533;
			}
			local8[local10++] = (char) local43;
		}
		return new String(local8, 0, local10);
	}
}
