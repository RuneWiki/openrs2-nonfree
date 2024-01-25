import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
	public static int anInt4026;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)S")
	public static short method3505(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 <= 64 ? local19 * local15 >> 7 : (127 - local19) * local15 >> 7;
		@Pc(43) int local43 = local39 + local19;
		@Pc(52) int local52;
		if (local43 == 0) {
			local52 = local39 << 1;
		} else {
			local52 = (local39 << 8) / local43;
		}
		return (short) (local9 << 10 | local52 >> 4 << 7 | local43);
	}
}
