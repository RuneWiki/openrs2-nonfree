import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ga", name = "F", descriptor = "[I")
	public static int[] anIntArray136;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "Lclient!o;")
	public static Class86 aClass86_4;

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "Lclient!sc;")
	private static Class107 aClass107_439 = Static231.method3737(" is already on your friend list)3");

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "Lclient!sc;")
	public static Class107 aClass107_440 = aClass107_439;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
	public static int anInt1559 = 0;

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)Lclient!ab;")
	public static Class2 method1226() {
		try {
			return (Class2) Class.forName("Class2_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return new Class2_Sub1();
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	public static void method1227() {
		Static153.aClass61_59.method1689();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)I")
	public static int method1228(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
