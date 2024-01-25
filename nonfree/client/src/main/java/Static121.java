import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_35 = new Class241(78, -1);

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z")
	public static boolean method2200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static207.method3818(arg1, arg0) & Static441.method4892(arg1, arg0);
	}
}
