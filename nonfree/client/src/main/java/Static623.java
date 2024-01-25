import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static623 {

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "I")
	public static int anInt9971 = 765;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)V")
	public static void method8471(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static567.aClass351ArrayArrayArray4 = Static126.aClass351ArrayArrayArray1;
			Static637.aClass91Array4 = Static485.aClass91Array1;
		} else {
			Static567.aClass351ArrayArrayArray4 = Static303.aClass351ArrayArrayArray3;
			Static637.aClass91Array4 = Static518.aClass91Array2;
		}
		Static603.anInt9778 = Static567.aClass351ArrayArrayArray4.length;
	}
}
