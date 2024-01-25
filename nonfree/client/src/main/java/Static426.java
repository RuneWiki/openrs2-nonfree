import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
	public static int anInt7184;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIZI)I")
	public static int method5802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class3_Sub32 local8 = Static457.method6232(arg2, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray275.length) {
			return local8.anIntArray275[arg1];
		} else {
			return 0;
		}
	}
}
