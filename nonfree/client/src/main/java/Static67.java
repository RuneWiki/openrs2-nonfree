import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static67 {

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "I")
	public static int anInt1612;

	// $FF: synthetic field
	@OriginalMember(owner = "client!cb", name = "h", descriptor = "Ljava/lang/Class;")
	private static Class aClass5;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "Lclient!qfa;")
	public static final Class307 aClass307_13 = new Class307(4);

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "[I")
	public static final int[] anIntArray86 = new int[16];

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	public static int anInt1614 = -1;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)Z")
	public static boolean method1511(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method1514(@OriginalArg(0) String arg0) {
		return Static70.method3127(aClass5 == null ? (aClass5 = Class52.a("kla")) : aClass5, arg0);
	}
}
