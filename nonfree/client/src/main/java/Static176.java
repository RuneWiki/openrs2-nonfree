import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static176 {

	@OriginalMember(owner = "client!gm", name = "c", descriptor = "Lclient!jda;")
	public static Class170 aClass170_3;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(III)Z")
	public static boolean method3014(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
