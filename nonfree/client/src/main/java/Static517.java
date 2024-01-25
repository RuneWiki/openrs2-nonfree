import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
	public static int anInt8128;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
	public static int anInt8133;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "Z")
	public static boolean aBoolean564 = false;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lclient!ho;")
	public static Class151 method6727() {
		try {
			return (Class151) Class.forName("Class151_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(9) Throwable local9) {
			return new Class151_Sub2();
		}
	}
}
