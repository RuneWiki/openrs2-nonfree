import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "Lclient!kh;")
	public static Class111 aClass111_1;

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(II)S")
	public static short method3333(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(38) int local38 = local19 <= 64 ? local19 * local15 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(42) int local42 = local38 + local19;
		@Pc(53) int local53;
		if (local42 == 0) {
			local53 = local38 << 1;
		} else {
			local53 = (local38 << 8) / local42;
		}
		return (short) (local42 | local53 >> 4 << 7 | local9 << 10);
	}
}
