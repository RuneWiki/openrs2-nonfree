import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!ya", name = "k", descriptor = "I")
	public static int anInt6289;

	@OriginalMember(owner = "client!ya", name = "g", descriptor = "I")
	public static int anInt6285 = 2;

	@OriginalMember(owner = "client!ya", name = "j", descriptor = "I")
	public static final int anInt6288 = -1;

	@OriginalMember(owner = "client!ya", name = "l", descriptor = "[Lclient!oj;")
	public static final Class177[] aClass177Array5 = new Class177[14];

	@OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
	public static void method4949() {
		if (Static328.aClass30_10 != Static38.aClass30_1) {
			try {
				Static461.method3101(Static159.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}

	@OriginalMember(owner = "client!ya", name = "a", descriptor = "([BI)Z")
	public static boolean method4951(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub28 local8 = new Class1_Sub28(arg0);
		@Pc(12) int local12 = local8.method5337();
		if (local12 != 2) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method5337() == 1;
		if (local28) {
			Static107.method1709(local8);
		}
		Static103.method1581(local8);
		return true;
	}
}
