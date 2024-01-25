import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!rc", name = "N", descriptor = "Z")
	public static boolean aBoolean669;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!lb;IZI)Lclient!iq;")
	public static Class178 method7606(@OriginalArg(0) Class221 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg2) {
			@Pc(15) byte[] local15 = arg0.method5089(arg1, arg3);
			return local15 == null ? null : new Class178(local15);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	public static void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static85.anInt1313 <= arg2 - arg1 && Static316.anInt6313 >= arg2 + arg1 && arg0 - arg1 >= Static280.anInt5114 && Static356.anInt6028 >= arg0 + arg1) {
			Static174.method8803(arg3, arg0, arg2, arg1);
		} else {
			Static376.method5426(arg1, arg2, arg0, arg3);
		}
	}
}
