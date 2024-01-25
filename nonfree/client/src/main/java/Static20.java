import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!au", name = "k", descriptor = "I")
	public static int anInt355 = -1;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "I")
	public static int anInt356 = 0;

	@OriginalMember(owner = "client!au", name = "o", descriptor = "Z")
	public static boolean aBoolean30 = false;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(II)Z")
	public static boolean method284(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
