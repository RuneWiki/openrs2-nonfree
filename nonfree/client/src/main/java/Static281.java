import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "[I")
	public static int[] anIntArray393;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_35 = new Class156();

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)Lclient!ln;")
	public static Class140 method3750() {
		try {
			return new Class140_Sub2();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class140) Class.forName("Class140_Sub3").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class140_Sub1();
			}
		}
	}
}
