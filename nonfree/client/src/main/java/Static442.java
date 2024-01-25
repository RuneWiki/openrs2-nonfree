import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static442 {

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
	public static boolean aBoolean591;

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "Lclient!la;")
	public static Class96 aClass96_12;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Z")
	public static boolean method6236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
