import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static212 {

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
	public static int anInt4406;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_64 = new Class6(79, -2);

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "Z")
	public static boolean aBoolean266 = false;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)I")
	public static int method3831(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
