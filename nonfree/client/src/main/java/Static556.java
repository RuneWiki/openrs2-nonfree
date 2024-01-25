import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "I")
	public static int anInt9486;

	@OriginalMember(owner = "client!vu", name = "f", descriptor = "I")
	public static int anInt9488;

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "I")
	public static final int anInt9484 = 1401;

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "Lclient!gl;")
	public static final Class117 aClass117_18 = new Class117(0, 7);

	@OriginalMember(owner = "client!vu", name = "g", descriptor = "[I")
	public static final int[] anIntArray818 = new int[5];

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "Z")
	public static boolean aBoolean705 = false;

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)Lclient!dv;")
	public static Class78 method7931() {
		try {
			return new Class78_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class78) Class.forName("Class78_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(18) Throwable local18) {
				return new Class78_Sub1();
			}
		}
	}
}
