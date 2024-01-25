import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)S")
	public static short method578(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = arg0 >> 10 & 0x3F;
		@Pc(20) int local20 = arg0 >> 3 & 0x70;
		@Pc(24) int local24 = arg0 & 0x7F;
		@Pc(44) int local44 = local24 <= 64 ? local24 * local20 >> 7 : (127 - local24) * local20 >> 7;
		@Pc(48) int local48 = local44 + local24;
		@Pc(57) int local57;
		if (local48 == 0) {
			local57 = local44 << 1;
		} else {
			local57 = (local44 << 8) / local48;
		}
		return (short) (local48 | local57 >> 4 << 7 | local14 << 10);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IBI)I")
	public static int method579(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(48) int local48 = (arg0 & 0x7F) * 96 >> 7;
			if (local48 < 2) {
				local48 = 2;
			} else if (local48 > 126) {
				local48 = 126;
			}
			return (arg0 & 0xFF80) + local48;
		}
	}
}
