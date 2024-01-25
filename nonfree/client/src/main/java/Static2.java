import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!aaa", name = "H", descriptor = "I")
	public static int anInt64;

	@OriginalMember(owner = "client!aaa", name = "E", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)Lclient!vg;")
	public static Class1 method203() {
		try {
			return new Class1_Sub3();
		} catch (@Pc(12) Throwable local12) {
			try {
				return (Class1) Class.forName("Class1_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(18) Throwable local18) {
				return new Class1_Sub2();
			}
		}
	}
}
