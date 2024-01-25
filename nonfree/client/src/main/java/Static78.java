import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static78 {

	@OriginalMember(owner = "client!da", name = "F", descriptor = "[I")
	public static final int[] anIntArray162 = new int[1];

	@OriginalMember(owner = "client!da", name = "I", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_79 = new Class296(57, 4);

	@OriginalMember(owner = "client!da", name = "i", descriptor = "(I)V")
	public static void method1337() {
		if (Static176.aClass157_6 == null) {
			return;
		}
		if (Static176.aClass157_6.anInt4742 == 1) {
			Static176.aClass157_6 = null;
			return;
		}
		if (Static176.aClass157_6.anInt4742 == 2) {
			Static248.method1989(Static5.aClass102_1, 2, Static207.aString39);
			Static176.aClass157_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Ljava/lang/Object;I[J)V")
	public static void method1339(@OriginalArg(0) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static176.method2645(arg1, arg0, arg1.length - 1, 0);
	}
}
