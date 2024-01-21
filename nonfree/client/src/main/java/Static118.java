import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!od", name = "c", descriptor = "Lclient!ga;")
	public static Class30 aClass30_46;

	@OriginalMember(owner = "client!od", name = "d", descriptor = "[S")
	public static short[] aShortArray32;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "I")
	public static int anInt3062 = 0;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ed;B)Z")
	public static boolean method2077(@OriginalArg(0) Class23 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static37.anInt996; local16++) {
			if (arg0.method644(Static133.aClass23Array19[local16])) {
				return true;
			}
		}
		return arg0.method644(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass23_68);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	public static void method2078() {
		aShortArray32 = null;
		aClass30_46 = null;
	}
}
