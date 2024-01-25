import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static538 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Z")
	public static boolean aBoolean652 = false;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt9250 = 0;

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public static int anInt9252 = 0;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
	public static int anInt9253 = 0;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(CB)Z")
	public static boolean method7647(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
