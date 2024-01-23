import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!oj", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray26 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString137 = "K";

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
	public static int anInt3945 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZI)V")
	public static void method3206(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(4) Class4_Sub2_Sub15 local4 = Static131.method1210(arg0, 1);
		local4.method2876();
		local4.anInt3536 = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	public static void method3207() {
		Static97.aBoolean288 = true;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	public static void method3209() {
		Static207.anInt2136++;
	}
}
