import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
	public static int anInt3180 = 0;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BI)Z")
	public static boolean method2711(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}
}
