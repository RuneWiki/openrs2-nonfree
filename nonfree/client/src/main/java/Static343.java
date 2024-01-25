import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static343 {

	@OriginalMember(owner = "client!nfa", name = "zg", descriptor = "Z")
	public static boolean aBoolean495 = false;

	@OriginalMember(owner = "client!nfa", name = "Nh", descriptor = "I")
	public static int anInt6636 = 0;

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "(II)Z")
	public static boolean method5603(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}
}
