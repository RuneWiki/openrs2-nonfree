import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
	public static int anInt4615 = 0;

	@OriginalMember(owner = "client!jea", name = "l", descriptor = "Z")
	public static boolean aBoolean359 = false;

	@OriginalMember(owner = "client!jea", name = "n", descriptor = "[I")
	public static final int[] anIntArray280 = new int[5];

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)S")
	public static short method3964(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(23) int local23 = arg0 >> 3 & 0x70;
		@Pc(27) int local27 = arg0 & 0x7F;
		@Pc(47) int local47 = local27 > 64 ? (127 - local27) * local23 >> 7 : local23 * local27 >> 7;
		@Pc(51) int local51 = local47 + local27;
		@Pc(59) int local59;
		if (local51 == 0) {
			local59 = local47 << 1;
		} else {
			local59 = (local47 << 8) / local51;
		}
		return (short) (local51 | local9 << 10 | local59 >> 4 << 7);
	}
}
