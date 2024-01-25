import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static534 {

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
	public static int anInt8752;

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
	public static int anInt8753;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "Lclient!iia;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "Lclient!rh;")
	public static final Class305 aClass305_3 = new Class305();

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Z")
	public static boolean aBoolean621 = true;

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_307 = new Class179(96, 6);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)I")
	public static int method7413(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static553.method7827(arg0);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)Z")
	public static boolean method7414() {
		return Static338.anInt5833 != 0;
	}
}
