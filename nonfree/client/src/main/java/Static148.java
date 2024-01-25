import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ffa", name = "d", descriptor = "[I")
	public static int[] anIntArray193;

	@OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
	public static int anInt3680 = -1;

	@OriginalMember(owner = "client!ffa", name = "j", descriptor = "[J")
	public static final long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)I")
	public static int method3253(@OriginalArg(0) int arg0) {
		@Pc(20) int local20 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(26) int local26 = arg0 * 6 - 61440;
		@Pc(34) int local34 = (arg0 * local26 >> 12) + 40960;
		return local34 * local20 >> 12;
	}
}
