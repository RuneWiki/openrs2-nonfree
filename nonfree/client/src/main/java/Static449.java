import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static449 {

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
	public static boolean aBoolean497 = false;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "Lclient!fg;")
	public static final Class112 aClass112_3 = new Class112();

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "F")
	public static float aFloat140 = 0.0F;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)Z")
	public static boolean method6385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static227.method8064(arg0, arg1) || Static226.method3581(arg1, arg0) || Static282.method4540(arg1, arg0);
	}
}
