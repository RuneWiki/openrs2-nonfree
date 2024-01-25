import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Lclient!tl;")
	public static Class339 aClass339_1;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "[I")
	public static final int[] anIntArray136 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!dm", name = "m", descriptor = "[I")
	public static final int[] anIntArray137 = new int[3];

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)Lclient!rt;")
	public static Class111 method1570() {
		try {
			return (Class111) Class.forName("Class111_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}
}
