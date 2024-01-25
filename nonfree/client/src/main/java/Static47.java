import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!br", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "Z")
	public static boolean aBoolean51 = false;

	@OriginalMember(owner = "client!br", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray2 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIBI)I")
	public static int method947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = arg2 & 0xF;
		@Pc(22) int local22 = local15 >= 8 ? arg1 : arg0;
		@Pc(39) int local39 = local15 >= 4 ? (local15 == 12 || local15 == 14 ? arg0 : arg3) : arg1;
		return ((local15 & 0x1) == 0 ? local22 : -local22) + ((local15 & 0x2) == 0 ? local39 : -local39);
	}
}
