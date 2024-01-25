import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static379 {

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	public static int anInt11206;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "Lclient!nn;")
	public static Class250 aClass250_13;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Z")
	public static boolean method9308(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)Z")
	public static boolean method9309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static583.method8334(arg0)) {
			return true;
		} else {
			return !Static583.method8334(arg1);
		}
	}
}
