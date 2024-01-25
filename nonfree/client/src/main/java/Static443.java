import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static443 {

	@OriginalMember(owner = "client!se", name = "k", descriptor = "Z")
	public static boolean aBoolean572 = false;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)Z")
	public static boolean method6860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(III)Z")
	public static boolean method6864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static340.method5717(arg0, arg1) | (arg0 & 0x70000) != 0 || Static319.method5470(arg0, arg1);
	}
}
