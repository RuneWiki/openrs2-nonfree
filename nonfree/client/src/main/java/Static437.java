import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static437 {

	@OriginalMember(owner = "client!vt", name = "B", descriptor = "[I")
	public static final int[] anIntArray122 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!vt", name = "L", descriptor = "I")
	public static int anInt1833 = -1;

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)V")
	public static void method1588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class7_Sub4_Sub14 local15 = Static54.method750(arg0, 1);
		local15.method4716();
		local15.anInt5868 = arg1;
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(IILclient!go;)Ljava/lang/String;")
	public static String method1589(@OriginalArg(1) int arg0, @OriginalArg(2) Class95 arg1) {
		if (!Static52.method725(arg1).method1908(arg0) && arg1.anObjectArray30 == null) {
			return null;
		} else if (arg1.aStringArray17 == null || arg1.aStringArray17.length <= arg0 || arg1.aStringArray17[arg0] == null || arg1.aStringArray17[arg0].trim().length() == 0) {
			return Static283.aBoolean297 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray17[arg0];
		}
	}
}
