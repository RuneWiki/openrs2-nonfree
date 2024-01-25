import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static115 {

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "[I")
	public static int[] anIntArray118;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	public static void method1732(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static87.anInt1807 = arg0;
		Static660.aClass34_Sub7Array1 = new Class34_Sub7[Static196.anIntArray184[Static87.anInt1807] + 1];
		Static170.anInt3111 = 0;
		Static158.anInt2931 = 0;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
	public static void method1733() {
		Static59.method1093(-1, 255);
	}
}
