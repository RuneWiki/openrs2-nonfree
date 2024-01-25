import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
	public static int anInt5008;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)S")
	public static short method4107(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(23) int local23 = arg0 >> 3 & 0x70;
		@Pc(27) int local27 = arg0 & 0x7F;
		@Pc(46) int local46 = local27 > 64 ? (127 - local27) * local23 >> 7 : local23 * local27 >> 7;
		@Pc(50) int local50 = local27 + local46;
		@Pc(61) int local61;
		if (local50 == 0) {
			local61 = local46 << 1;
		} else {
			local61 = (local46 << 8) / local50;
		}
		return (short) (local9 << 10 | local61 >> 4 << 7 | local50);
	}
}
