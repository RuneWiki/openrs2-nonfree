import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	public static int anInt4083;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "Z")
	public static boolean aBoolean310 = true;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	public static int anInt4080 = -1;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!or;I)Ljava/lang/String;")
	public static String method3726(@OriginalArg(1) Class260 arg0, @OriginalArg(2) int arg1) {
		if (!Static79.method1526(arg0).method7070(arg1) && arg0.anObjectArray9 == null) {
			return null;
		} else if (arg0.aStringArray19 == null || arg1 >= arg0.aStringArray19.length || arg0.aStringArray19[arg1] == null || arg0.aStringArray19[arg1].trim().length() == 0) {
			return Static561.aBoolean714 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray19[arg1];
		}
	}
}
