import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ik", name = "c", descriptor = "Lclient!lu;")
	public static final Class186 aClass186_67 = new Class186(5, 8);

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public static void method3779() {
		if (Static546.anInt9466 == 6) {
			Static546.anInt9466 = 7;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method3780(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(9) int local9 = 0; local9 < Static108.anInt2509; local9++) {
			if (arg0.equalsIgnoreCase(Static366.aStringArray40[local9])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static16.aClass47_Sub2_Sub3_Sub2_1.aString36);
	}
}
