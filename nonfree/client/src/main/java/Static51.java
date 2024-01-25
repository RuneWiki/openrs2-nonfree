import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bu", name = "s", descriptor = "[I")
	public static final int[] anIntArray53 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZI)I")
	public static int method1165(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(BII)Z")
	public static boolean method1166(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
