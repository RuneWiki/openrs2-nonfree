import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static139 {

	@OriginalMember(owner = "client!gr", name = "t", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_11 = new Class70(1, 2, 2, 0);

	@OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
	public static int anInt2475 = 0;

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
	public static int anInt2476 = 0;

	@OriginalMember(owner = "client!gr", name = "A", descriptor = "Ljava/lang/String;")
	public static String aString36 = null;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Z")
	public static boolean method2135(@OriginalArg(1) int arg0) {
		return arg0 == 45 || arg0 == 58 || arg0 == 1006 || arg0 == 10 || arg0 == 60;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILclient!uu;)V")
	public static void method2136(@OriginalArg(1) Class250 arg0) {
		Static184.aClass250_56 = arg0;
	}
}
