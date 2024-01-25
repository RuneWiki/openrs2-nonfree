import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static520 {

	@OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
	public static int anInt9403;

	@OriginalMember(owner = "client!rs", name = "p", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_324 = new Class179(58, 6);

	@OriginalMember(owner = "client!rs", name = "D", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray3 = new String[][] { { "M1", "M2", "S1", "F" }, { "M1", "M2", "M3", "S1", "S2", "F" }, { "M1", "M2", "M3", "M4", "S1", "S2", "S3", "F" } };

	@OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
	public static int anInt9404 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)[Lclient!qha;")
	public static Class286[] method7912() {
		return new Class286[] { Static177.aClass286_3, Static104.aClass286_2, Static265.aClass286_4 };
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(BJ)V")
	public static void method7923(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static481.method7019(arg0 - 1L);
			Static481.method7019(1L);
		} else {
			Static481.method7019(arg0);
		}
	}
}
