import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
	public static int anInt3475;

	@OriginalMember(owner = "client!gq", name = "N", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_62 = new Class225(52, 4);

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
	public static String method3056(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg0];
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg2;
		@Pc(24) int local24 = arg2 + arg0;
		while (local12 < local24) {
			@Pc(33) int local33 = arg1[local12++] & 0xFF;
			@Pc(45) int local45;
			if (local33 >= 128) {
				if (local33 < 192) {
					local45 = 65533;
				} else if (local33 < 224) {
					if (local24 > local12 && (arg1[local12] & 0xC0) == 128) {
						local45 = (local33 & 0x1F) << 6 | arg1[local12++] & 0x3F;
						if (local45 < 128) {
							local45 = 65533;
						}
					} else {
						local45 = 65533;
					}
				} else if (local33 >= 240) {
					if (local33 >= 248) {
						local45 = 65533;
					} else if (local24 > local12 + 2 && (arg1[local12] & 0xC0) == 128 && (arg1[local12 + 1] & 0xC0) == 128 && (arg1[local12 + 2] & 0xC0) == 128) {
						local45 = (arg1[local12++] & 0x3F) << 12 | local33 << 18 & 0x1C0000 | (arg1[local12++] & 0x3F) << 6 | arg1[local12++] & 0x3F;
						if (local45 >= 65536 && local45 <= 1114111) {
							local45 = 65533;
						} else {
							local45 = 65533;
						}
					} else {
						local45 = 65533;
					}
				} else if (local12 + 1 < local24 && (arg1[local12] & 0xC0) == 128 && (arg1[local12 + 1] & 0xC0) == 128) {
					local45 = (arg1[local12++] & 0x3F) << 6 | (local33 & 0xF) << 12 | arg1[local12++] & 0x3F;
					if (local45 < 2048) {
						local45 = 65533;
					}
				} else {
					local45 = 65533;
				}
			} else if (local33 == 0) {
				local45 = 65533;
			} else {
				local45 = local33;
			}
			local8[local10++] = (char) local45;
		}
		return new String(local8, 0, local10);
	}
}
