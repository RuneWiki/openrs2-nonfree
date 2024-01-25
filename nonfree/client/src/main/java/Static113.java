import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static113 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "[I")
	public static final int[] anIntArray170 = new int[32];

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
	public static void method1669() {
		Static438.aBoolean577 = true;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!hh;)Z")
	public static boolean method1671(@OriginalArg(1) Class142 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean210) {
			return false;
		} else if (!arg0.method2521(Static476.anInterface23_2)) {
			return false;
		} else if (Static495.aClass90_34.method1685((long) arg0.anInt2933) == null) {
			return Static269.aClass90_12.method1685((long) arg0.anInt2962) == null;
		} else {
			return false;
		}
	}
}
