import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static630 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
	public static int anInt10046 = 0;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "Z")
	public static boolean aBoolean760 = false;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Z")
	public static boolean method8524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
