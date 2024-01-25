import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(ZZI)V")
	public static void method7402(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		Static177.anInt3167 = arg1;
		Static466.anInt7907 = 3;
		Static122.method1852(Static453.aClass147_5.anInt3691, Static453.aClass147_5.aString55);
		if (arg0) {
			Static217.method3195("", "", false);
		} else {
			Static156.method2290();
			Static217.method3195(Static187.aString49, Static209.aString53, false);
		}
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIB)V")
	public static void method7404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg0, 5);
		local8.method776();
		local8.anInt972 = arg1;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(FFIF)F")
	public static float method7405(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + arg1 * (arg0 - arg2);
	}
}
