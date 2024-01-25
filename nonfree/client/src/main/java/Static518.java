import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static518 {

	@OriginalMember(owner = "client!sha", name = "B", descriptor = "[Lclient!va;")
	public static final Class351[] aClass351Array1 = new Class351[16];

	@OriginalMember(owner = "client!sha", name = "E", descriptor = "Z")
	public static final boolean aBoolean640 = false;

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIZ)Z")
	public static boolean method7273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static248.method4049(arg0, arg1) & Static486.method6977(arg1, arg0);
	}
}
