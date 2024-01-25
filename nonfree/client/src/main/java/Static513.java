import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static513 {

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "Lclient!f;")
	public static Class39 aClass39_35;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z")
	public static boolean method7129(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)Z")
	public static boolean method7130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
