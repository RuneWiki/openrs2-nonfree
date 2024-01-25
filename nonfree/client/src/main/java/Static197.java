import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static197 {

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "[Lclient!vt;")
	public static Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "Z")
	public static boolean aBoolean301 = true;

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[100];

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "Lclient!me;")
	public static final Class211 aClass211_24 = new Class211(4);

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3343(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static402.method8391(arg5)) {
			return;
		}
		if (Static571.aClass305ArrayArray2[arg5] == null) {
			Static68.method1705(Static108.aClass305ArrayArray1[arg5], -1, arg6, arg4, arg2, arg0, arg1, arg7, arg8, arg3);
		} else {
			Static68.method1705(Static571.aClass305ArrayArray2[arg5], -1, arg6, arg4, arg2, arg0, arg1, arg7, arg8, arg3);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!pe;Lclient!pe;ZLclient!uga;Lclient!pe;)Z")
	public static boolean method3344(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(3) Class3_Sub14_Sub4 arg2, @OriginalArg(4) Class254 arg3) {
		Static547.aClass3_Sub14_Sub4_3 = arg2;
		Static70.aClass254_24 = arg0;
		Static33.aClass254_15 = arg1;
		Static444.aClass254_116 = arg3;
		return true;
	}
}
