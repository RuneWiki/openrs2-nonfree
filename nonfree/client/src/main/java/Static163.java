import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)S")
	public static short method3033(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(22) int local22 = arg0 >> 3 & 0x70;
		@Pc(26) int local26 = arg0 & 0x7F;
		@Pc(44) int local44 = local26 > 64 ? (127 - local26) * local22 >> 7 : local26 * local22 >> 7;
		@Pc(48) int local48 = local26 + local44;
		@Pc(57) int local57;
		if (local48 == 0) {
			local57 = local44 << 1;
		} else {
			local57 = (local44 << 8) / local48;
		}
		return (short) (local48 | local9 << 10 | local57 >> 4 << 7);
	}
}
