import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "Lclient!tc;")
	public static Class301 aClass301_1;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Lclient!fk;")
	public static Class6_Sub15_Sub1 aClass6_Sub15_Sub1_1;

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "Z")
	public static boolean aBoolean305 = false;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Z")
	public static boolean method3360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 | Static206.method3381(arg1, arg0) || Static317.method4952(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(III)Z")
	public static boolean method3361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
