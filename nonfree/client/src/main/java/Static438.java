import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static438 {

	@OriginalMember(owner = "client!on", name = "m", descriptor = "[I")
	public static int[] anIntArray473 = null;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BZI)Ljava/lang/String;")
	public static String method6053(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		return arg0 && arg1 >= 0 ? Static270.method3889(arg0, arg1) : Integer.toString(arg1);
	}
}
