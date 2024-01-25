import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static54 {

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIB)Z")
	public static boolean method691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static149.method2197(arg0, arg1) || Static24.method4707(arg0, arg1);
	}
}
