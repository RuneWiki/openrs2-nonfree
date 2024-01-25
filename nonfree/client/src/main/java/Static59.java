import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!cf", name = "l", descriptor = "Lclient!pl;")
	public static Class259 aClass259_29;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Lclient!jda;")
	public static Class170 aClass170_1;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBI)Z")
	public static boolean method959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
