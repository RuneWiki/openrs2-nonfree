import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static661 {

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "I")
	public static int anInt10551 = -1;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(II)Z")
	public static boolean method9136(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}
}
