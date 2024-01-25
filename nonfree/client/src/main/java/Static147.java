import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static147 {

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "Lclient!ia;")
	public static Class134 aClass134_1;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "[S")
	public static short[] aShortArray64 = new short[256];

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Z")
	public static boolean method2754(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Lclient!wf;")
	public static Class315 method2755(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static77.aClass315Array1[arg0] : null;
	}
}
