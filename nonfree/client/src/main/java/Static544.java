import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static544 {

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
	public static int anInt9261 = 104;

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
	public static int anInt9264 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Z")
	public static boolean method7954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static477.method6966(arg1, arg0) | (arg0 & 0x10000) != 0 || Static581.method8339(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static395.method5775(arg0, arg1);
		}
	}
}
