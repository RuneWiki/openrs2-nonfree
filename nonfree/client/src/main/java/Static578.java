import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIZ)I")
	public static int method8020(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class3_Sub17 local8 = Static77.method3511(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && local8.anIntArray99.length > arg1) {
			return local8.anIntArray99[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Z")
	public static boolean method8021(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
