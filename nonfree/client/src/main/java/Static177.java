import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static177 {

	@OriginalMember(owner = "client!fja", name = "c", descriptor = "Lclient!nca;")
	public static Class254 aClass254_66;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "J")
	public static long aLong107 = 1L;

	@OriginalMember(owner = "client!fja", name = "e", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_51 = new Class349(30, -1);

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "Lclient!fh;")
	public static final Class118 aClass118_6 = new Class118(30);

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(III)Z")
	public static boolean method2622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static172.method2596(arg0, arg1) || Static435.method6316(arg1, arg0);
	}
}
