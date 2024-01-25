import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static579 {

	@OriginalMember(owner = "client!wea", name = "t", descriptor = "I")
	public static int anInt9553 = 0;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(III)Z")
	public static boolean method7769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
