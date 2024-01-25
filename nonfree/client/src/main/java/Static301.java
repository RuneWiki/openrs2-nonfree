import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static301 {

	@OriginalMember(owner = "client!kn", name = "z", descriptor = "[Lclient!pv;")
	public static Class279[] aClass279Array1;

	@OriginalMember(owner = "client!kn", name = "s", descriptor = "Lclient!hg;")
	public static final Class145 aClass145_90 = new Class145(69, 4);

	@OriginalMember(owner = "client!kn", name = "x", descriptor = "Lclient!bia;")
	public static final Class36 aClass36_3 = new Class36(1);

	@OriginalMember(owner = "client!kn", name = "y", descriptor = "[Lclient!rh;")
	public static Class301[] aClass301Array1 = new Class301[50];

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(IBI)Z")
	public static boolean method4749(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static524.method7273(arg1, arg0) | (arg0 & 0x40000) != 0 || Static617.method8585(arg0, arg1);
	}
}
