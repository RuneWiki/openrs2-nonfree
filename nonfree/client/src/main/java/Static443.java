import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!we", name = "i", descriptor = "F")
	public static float aFloat104;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "I")
	public static int anInt7115 = 0;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Z")
	public static boolean aBoolean516 = false;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "I")
	public static int anInt7117 = 0;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(CI)Z")
	public static boolean method5603(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
