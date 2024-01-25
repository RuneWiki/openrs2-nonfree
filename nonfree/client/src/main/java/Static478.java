import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static478 {

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	public static int anInt7690;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Lclient!rha;")
	public static Class2_Sub23_Sub5 aClass2_Sub23_Sub5_4;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_112 = new Class349(42, 3);

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)Z")
	public static boolean method6877(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
