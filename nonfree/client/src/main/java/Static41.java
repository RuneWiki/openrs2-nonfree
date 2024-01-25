import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static41 {

	@OriginalMember(owner = "client!bga", name = "h", descriptor = "Lclient!ai;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!bga", name = "c", descriptor = "Lclient!dj;")
	public static final Class74 aClass74_2 = new Class74(1, 2, 2, 0);

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(BI)I")
	public static int method1345(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V")
	public static void method1346() {
		Static234.method3912();
		Static219.aBoolean285 = false;
	}

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)V")
	public static void method1348() {
		Static120.aClass102_18.method2681();
	}
}
