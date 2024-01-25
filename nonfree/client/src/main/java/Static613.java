import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static613 {

	@OriginalMember(owner = "client!un", name = "i", descriptor = "I")
	public static int anInt9546;

	@OriginalMember(owner = "client!un", name = "p", descriptor = "I")
	public static int anInt9553 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)Z")
	public static boolean method8081(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
