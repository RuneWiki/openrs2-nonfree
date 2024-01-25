import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static606 {

	@OriginalMember(owner = "client!uha", name = "K", descriptor = "Lclient!nf;")
	public static Class102 aClass102_36;

	@OriginalMember(owner = "client!uha", name = "D", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_191 = new Class126(110, 7);

	@OriginalMember(owner = "client!uha", name = "G", descriptor = "Z")
	public static boolean aBoolean710 = false;

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(IIIIIBII)V")
	public static void method8038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static303.anInt9951 <= arg3 && Static408.anInt6951 >= arg0 && Static255.anInt4818 <= arg4 && Static658.anInt10079 >= arg1) {
			Static33.method1060(arg4, arg0, arg3, arg1, arg5, arg6, arg2);
		} else {
			Static341.method5168(arg2, arg5, arg1, arg6, arg4, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(IB)J")
	public static long method8039(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}
}
