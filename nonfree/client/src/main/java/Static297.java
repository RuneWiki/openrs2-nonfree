import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "[I")
	public static final int[] anIntArray320 = new int[200];

	@OriginalMember(owner = "client!jv", name = "w", descriptor = "[I")
	public static final int[] anIntArray321 = new int[1000];

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(II)S")
	public static short method4770(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 > 64 ? local15 * (127 - local19) >> 7 : local15 * local19 >> 7;
		@Pc(49) int local49 = local37 + local19;
		@Pc(58) int local58;
		if (local49 == 0) {
			local58 = local37 << 1;
		} else {
			local58 = (local37 << 8) / local49;
		}
		return (short) (local58 >> 4 << 7 | local9 << 10 | local49);
	}

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "(III)Z")
	public static boolean method4773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
