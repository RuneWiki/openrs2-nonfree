import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static328 {

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "[Lclient!bf;")
	public static Class22[] aClass22Array2;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "Lclient!ks;")
	public static Class109 aClass109_4;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IC)Z")
	public static boolean method4416(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
