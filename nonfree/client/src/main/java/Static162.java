import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ga", name = "M", descriptor = "[[[Lclient!hl;")
	public static Class133[][][] aClass133ArrayArrayArray2;

	@OriginalMember(owner = "client!ga", name = "Q", descriptor = "Z")
	public static boolean aBoolean225;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "Lclient!oj;")
	public static Class234 aClass234_23 = new Class234(8);

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public static void method2597() {
		Static61.method883();
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static30.aClass138Array1[local16].method3441();
		}
		Static299.method4522();
		Static113.method1759();
		System.gc();
	}
}
