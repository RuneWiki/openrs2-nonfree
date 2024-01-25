import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!rl", name = "u", descriptor = "Lclient!vb;")
	public static Class259 aClass259_3;

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "Z")
	public static boolean aBoolean574;

	@OriginalMember(owner = "client!rl", name = "t", descriptor = "[[B")
	public static final byte[][] aByteArrayArray130 = new byte[1000][];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)S")
	public static short method5263(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 <= 64 ? local19 * local15 >> 7 : (127 - local19) * local15 >> 7;
		@Pc(43) int local43 = local39 + local19;
		@Pc(54) int local54;
		if (local43 == 0) {
			local54 = local39 << 1;
		} else {
			local54 = (local39 << 8) / local43;
		}
		return (short) (local43 | local54 >> 4 << 7 | local9 << 10);
	}
}
