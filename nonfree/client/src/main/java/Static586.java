import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!to", name = "J", descriptor = "Lclient!bt;")
	public static Class34 aClass34_116;

	@OriginalMember(owner = "client!to", name = "G", descriptor = "Lclient!ei;")
	public static final Class91 aClass91_5 = new Class91();

	@OriginalMember(owner = "client!to", name = "H", descriptor = "I")
	public static int anInt9032 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)I")
	public static int method7709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg0) {
			return arg0;
		}
		@Pc(13) int local13 = 128 - arg1;
		@Pc(27) int local27 = (arg0 & 0x7F) * local13 + (arg2 & 0x7F) * arg1 >> 7;
		@Pc(42) int local42 = local13 * (arg0 & 0x380) + arg1 * (arg2 & 0x380) >> 7;
		@Pc(61) int local61 = (arg2 & 0xFC00) * arg1 + local13 * (arg0 & 0xFC00) >> 7;
		return local27 & 0x7F | local61 & 0xFC00 | local42 & 0x380;
	}
}
