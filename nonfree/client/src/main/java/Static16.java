import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
	public static int anInt282;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "Lclient!mf;")
	public static Class165 aClass165_1;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	public static int anInt284 = 0;

	@OriginalMember(owner = "client!ap", name = "k", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)Lclient!bd;")
	public static Class23 method251() {
		try {
			return (Class23) Class.forName("Class23_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
