import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
	public static int anInt3349;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "[Lclient!f;")
	public static Class88[] aClass88Array3;

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Lclient!dc;")
	public static final Class68 aClass68_6 = new Class68(9, 0, 4, 1);

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
	public static int anInt3354 = -1;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method2666(@OriginalArg(0) String arg0) {
		if (Class119.aString61.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class119.aString61.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class119.aString61.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/Object;III)[B")
	public static byte[] method2668(@OriginalArg(0) Object arg0, @OriginalArg(3) int arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(20) byte[] local20 = (byte[]) arg0;
			return Static90.method1826(local20, arg1);
		} else if (arg0 instanceof Class247) {
			@Pc(32) Class247 local32 = (Class247) arg0;
			return local32.method5873(arg1);
		} else {
			throw new IllegalArgumentException();
		}
	}
}
