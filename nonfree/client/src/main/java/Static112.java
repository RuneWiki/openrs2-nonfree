import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static112 {

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "[I")
	public static int[] anIntArray83;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBI)Z")
	public static boolean method2102(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static312.method4927(arg1, arg0) | Static316.method4963(arg1, arg0) | Static537.method3393(arg1, arg0)) & Static260.method4075(arg0, arg1);
	}
}
