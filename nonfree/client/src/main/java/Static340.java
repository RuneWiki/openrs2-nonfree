import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static int anInt6746 = -1;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V")
	public static void method5859() {
		Static240.aClass216_38 = new Class216();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5862(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static296.anInt6002; local11++) {
			if (arg0.equalsIgnoreCase(Static287.aStringArray53[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static41.aClass62_Sub1_Sub2_Sub2_2.aString48);
	}
}
