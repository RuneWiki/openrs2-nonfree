import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static663 {

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "[I")
	public static final int[] anIntArray616 = new int[3];

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZIZI)I")
	public static int method9086(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class5_Sub31 local15 = Static93.method1470(arg1, arg0);
		if (local15 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local15.anIntArray327.length) {
			return local15.anIntArray327[arg2];
		} else {
			return 0;
		}
	}
}
