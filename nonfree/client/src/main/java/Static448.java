import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static448 {

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "Lclient!js;")
	public static Class55 aClass55_4;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)Z")
	public static boolean method6268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static178.method6932(arg1, arg0) || Static13.method5362(arg0, arg1);
	}
}
