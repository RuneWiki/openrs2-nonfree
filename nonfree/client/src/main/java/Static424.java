import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "Lclient!fs;")
	public static Class76 aClass76_99;

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "Lclient!ln;")
	public static Class49 aClass49_2;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_319 = new Class22(73, 12);

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray23 = new boolean[200];

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!et;II)I")
	public static int method5410(@OriginalArg(0) Class66 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)V")
	public static void method5412() {
		Static85.method1541();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static175.aClass213Array1[local8].method4851();
		}
		Static277.method3932();
		Static409.method5485();
		System.gc();
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II)Z")
	public static boolean method5413(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}
