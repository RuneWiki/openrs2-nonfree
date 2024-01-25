import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static372 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_88 = new Class289(12, 3);

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "S")
	public static short aShort82 = 32767;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)S")
	public static short method5335(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 > 64 ? local15 * (127 - local19) >> 7 : local15 * local19 >> 7;
		@Pc(43) int local43 = local19 + local39;
		@Pc(49) int local49;
		if (local43 == 0) {
			local49 = local39 << 1;
		} else {
			local49 = (local39 << 8) / local43;
		}
		return (short) (local49 >> 4 << 7 | local9 << 10 | local43);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)I")
	public static int method5336(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
