import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "Lclient!tv;")
	public static final Class233 aClass233_1 = Static76.method1644();

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "[I")
	public static final int[] anIntArray229 = new int[6];

	@OriginalMember(owner = "client!gg", name = "q", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_32 = new Class212(11, 8);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)S")
	public static short method2377(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(38) int local38 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(43) int local43 = local19 + local38;
		@Pc(52) int local52;
		if (local43 == 0) {
			local52 = local38 << 1;
		} else {
			local52 = (local38 << 8) / local43;
		}
		return (short) (local9 << 10 | local52 >> 4 << 7 | local43);
	}
}
