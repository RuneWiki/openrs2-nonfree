import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static462 {

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!dr;")
	public static Class73 aClass73_148;

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "[I")
	public static int[] anIntArray581;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIB)Z")
	public static boolean method6479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static234.method4077(arg0, arg1) || Static297.method992(arg0, arg1);
	}
}
