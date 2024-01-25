import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static326 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZII)Z")
	public static boolean method5155(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static204.method3284(arg0, arg1) & Static460.method7584(arg0, arg1);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)Z")
	public static boolean method5156(@OriginalArg(1) int arg0) {
		if (arg0 == 10 || arg0 == 49 || arg0 == 8 || arg0 == 20 || arg0 == 1010) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1006;
		}
	}
}
