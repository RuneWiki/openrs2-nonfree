import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static600 {

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	public static int anInt9701;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)Z")
	public static boolean method8111(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
