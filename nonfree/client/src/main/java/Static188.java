import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "[I")
	public static final int[] anIntArray293 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	public static int anInt3769 = -1;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)Lclient!jd;")
	public static Class119 method3130(@OriginalArg(1) int arg0) {
		@Pc(6) Class119[] local6 = Static352.method4306();
		for (@Pc(16) int local16 = 0; local16 < local6.length; local16++) {
			if (arg0 == local6[local16].anInt3754) {
				return local6[local16];
			}
		}
		return null;
	}
}
