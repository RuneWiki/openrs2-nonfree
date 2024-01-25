import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "[Lclient!wp;")
	public static Class392[] aClass392Array1;

	@OriginalMember(owner = "client!ika", name = "d", descriptor = "Lclient!d;")
	public static Interface6 anInterface6_5;

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "[Lclient!ao;")
	public static final Class22[] aClass22Array1 = new Class22[4];

	@OriginalMember(owner = "client!ika", name = "e", descriptor = "I")
	public static int anInt4335 = 0;

	@OriginalMember(owner = "client!ika", name = "f", descriptor = "Z")
	public static boolean aBoolean272 = false;

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "([BB)[B")
	public static byte[] method3638(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static679.method1563(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
