import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!el", name = "y", descriptor = "Lclient!ne;")
	public static Class146 aClass146_17;

	@OriginalMember(owner = "client!el", name = "R", descriptor = "I")
	public static int anInt1757;

	@OriginalMember(owner = "client!el", name = "d", descriptor = "Lclient!rm;")
	public static final Class178 aClass178_4 = new Class178(64);

	@OriginalMember(owner = "client!el", name = "O", descriptor = "Z")
	public static boolean aBoolean114 = true;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)Lclient!oa;")
	public static Class29 method1769() {
		try {
			return new Class29_Sub2();
		} catch (@Pc(14) Throwable local14) {
			try {
				return (Class29) Class.forName("Class29_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(20) Throwable local20) {
				return new Class29_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)V")
	public static void method1770() {
		@Pc(5) Class11 local5 = Static238.aClass11_102;
		synchronized (Static238.aClass11_102) {
			Static238.aClass11_102.method215(5);
		}
		local5 = Static20.aClass11_13;
		synchronized (Static20.aClass11_13) {
			Static20.aClass11_13.method215(5);
		}
		local5 = Static38.aClass11_20;
		synchronized (Static38.aClass11_20) {
			Static38.aClass11_20.method215(5);
		}
		local5 = Static292.aClass11_128;
		synchronized (Static292.aClass11_128) {
			Static292.aClass11_128.method215(5);
		}
	}
}
