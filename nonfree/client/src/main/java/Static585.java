import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "[I")
	public static final int[] anIntArray558 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "S")
	public static short aShort111 = 1;

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)Lclient!ec;")
	public static Class86 method8443() {
		try {
			return (Class86) Class.forName("Class86_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class86_Sub1();
		}
	}
}
