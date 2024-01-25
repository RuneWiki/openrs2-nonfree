import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method8495(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(16) char[] local16 = new char[arg0];
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg1;
		@Pc(24) int local24 = arg0 + arg1;
		while (local20 < local24) {
			@Pc(33) int local33 = arg2[local20++] & 0xFF;
			@Pc(102) int local102;
			if (local33 >= 128) {
				if (local33 < 192) {
					local102 = 65533;
				} else if (local33 >= 224) {
					if (local33 < 240) {
						if (local24 > local20 + 1 && (arg2[local20] & 0xC0) == 128 && (arg2[local20 + 1] & 0xC0) == 128) {
							local102 = (arg2[local20++] & 0x3F) << 6 | (local33 & 0xF) << 12 | arg2[local20++] & 0x3F;
							if (local102 < 2048) {
								local102 = 65533;
							}
						} else {
							local102 = 65533;
						}
					} else if (local33 >= 248) {
						local102 = 65533;
					} else if (local24 > local20 + 2 && (arg2[local20] & 0xC0) == 128 && (arg2[local20 + 1] & 0xC0) == 128 && (arg2[local20 + 2] & 0xC0) == 128) {
						local102 = (arg2[local20++] & 0x3F) << 12 | (local33 & 0x7) << 18 | (arg2[local20++] & 0x3F) << 6 | arg2[local20++] & 0x3F;
						if (local102 >= 65536 && local102 <= 1114111) {
							local102 = 65533;
						} else {
							local102 = 65533;
						}
					} else {
						local102 = 65533;
					}
				} else if (local24 > local20 && (arg2[local20] & 0xC0) == 128) {
					local102 = (local33 & 0x1F) << 6 | arg2[local20++] & 0x3F;
					if (local102 < 128) {
						local102 = 65533;
					}
				} else {
					local102 = 65533;
				}
			} else if (local33 == 0) {
				local102 = 65533;
			} else {
				local102 = local33;
			}
			local16[local18++] = (char) local102;
		}
		return new String(local16, 0, local18);
	}
}
