import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
	public static int anInt4070;

	@OriginalMember(owner = "client!lp", name = "M", descriptor = "[Lclient!ya;")
	public static Class22[] aClass22Array3;

	@OriginalMember(owner = "client!lp", name = "D", descriptor = "Z")
	public static boolean aBoolean268 = true;

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "(III)V")
	public static void method3295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class36 local7 = Static175.aClass36ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		if (local7.aClass11_Sub2_1 != null) {
			local7.aClass11_Sub2_1 = null;
		}
		if (local7.aClass11_Sub2_2 != null) {
			local7.aClass11_Sub2_2 = null;
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILclient!gi;)Ljava/lang/String;")
	public static String method3326(@OriginalArg(0) int arg0, @OriginalArg(2) Class93 arg1) {
		if (!Static53.method860(arg1).method5898(arg0) && arg1.anObjectArray10 == null) {
			return null;
		} else if (arg1.aStringArray28 == null || arg1.aStringArray28.length <= arg0 || arg1.aStringArray28[arg0] == null || arg1.aStringArray28[arg0].trim().length() == 0) {
			return Static464.aBoolean176 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray28[arg0];
		}
	}
}
