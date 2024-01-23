import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean338 = false;

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "[I")
	public static int[] anIntArray392 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3932(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 2);
		local8.method2876();
		local8.aString123 = arg1;
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)Lclient!el;")
	public static Class44 method3936() {
		try {
			return (Class44) Class.forName("Class44_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}
}
