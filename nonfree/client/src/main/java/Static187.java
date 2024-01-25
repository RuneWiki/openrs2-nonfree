import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
	public static final int anInt3600 = 1339;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
	public static int anInt3601 = -50;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIBI)V")
	public static void method2764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = Static126.aClass67_Sub1_1.anInt5859 * arg1 >> 8;
		if (arg0 == -1 && !Static156.aBoolean213) {
			Static130.method1931();
		} else if (arg0 != -1 && (arg0 != Static49.anInt1347 || !Static334.method5632()) && local6 != 0 && !Static156.aBoolean213) {
			Static117.method1844(Static273.aClass166_193, local6, arg0, arg2);
		}
		Static49.anInt1347 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2766(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static22.anInt6850; local11++) {
			if (arg0.equalsIgnoreCase(Static291.aStringArray33[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static375.aClass6_Sub2_Sub1_Sub1_3.aString11);
	}
}
