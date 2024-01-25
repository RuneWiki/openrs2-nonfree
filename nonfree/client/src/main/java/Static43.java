import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_5 = new Class37(14, 0, 4, 1);

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public static final int anInt670 = 52;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray3 = new int[2][][];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
	public static int method654(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(18) int local18 = local0 | local0 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}
}
