import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static512 {

	@OriginalMember(owner = "client!rca", name = "o", descriptor = "Lclient!aj;")
	public static Class15 aClass15_129;

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
	public static int anInt8242;

	@OriginalMember(owner = "client!rca", name = "q", descriptor = "Lclient!aj;")
	public static Class15 aClass15_130;

	@OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
	public static int anInt8243;

	@OriginalMember(owner = "client!rca", name = "t", descriptor = "Z")
	public static boolean aBoolean627;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!rs;I)Z")
	public static boolean method7227(@OriginalArg(0) Class308 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean685) {
			return false;
		} else if (!arg0.method7689(Static317.anInterface16_2)) {
			return false;
		} else if (Static500.aClass83_37.method2368((long) arg0.anInt8777) == null) {
			return Static320.aClass83_42.method2368((long) arg0.anInt8782) == null;
		} else {
			return false;
		}
	}
}
