import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static425 {

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_139 = new Class151(81, 3);

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(III)Z")
	public static boolean method5897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static483.method6619(arg0, arg1)) {
			return Static15.method1581(arg1, arg0) | (arg1 & 0x9000) != 0 | Static173.method2843(arg0, arg1) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | Static564.method7467(arg1, arg0) | Static188.method2954(arg1, arg0));
		} else {
			return false;
		}
	}
}
