import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static290 {

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "[Lclient!bka;")
	public static Class9[] aClass9Array16;

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "Lclient!nl;")
	public static final Class258 aClass258_10 = new Class258("", 13);

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "Lclient!tj;")
	public static final Class357 aClass357_26 = new Class357();

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "I")
	public static int anInt5227 = 0;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)Z")
	public static boolean method4406(@OriginalArg(1) int arg0) {
		if (arg0 == 12 || arg0 == 23 || arg0 == 3 || arg0 == 25 || arg0 == 19 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 30;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)Z")
	public static boolean method4408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x37) != 0;
	}
}
