import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "[I")
	public static int[] anIntArray609;

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "[I")
	public static int[] anIntArray610;

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "[I")
	public static final int[] anIntArray608 = new int[8];

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IB)I")
	public static int method7478(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "(IB)I")
	public static int method7479(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
