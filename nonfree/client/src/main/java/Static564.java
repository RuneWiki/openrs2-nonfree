import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static564 {

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "[I")
	public static int[] anIntArray630;

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array14;

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_115 = new Class179(28, 3);

	@OriginalMember(owner = "client!uaa", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray43 = new String[200];

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZIIIIZIJLjava/lang/String;JIZLjava/lang/String;)V")
	public static void method7726(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6, @OriginalArg(8) String arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) String arg11) {
		if (!Static627.aBoolean736 && Static474.anInt7600 < 500) {
			@Pc(24) int local24 = arg3 == -1 ? Static144.anInt2622 : arg3;
			@Pc(40) Class2_Sub2_Sub11 local40 = new Class2_Sub2_Sub11(arg7, arg11, local24, arg9, arg2, arg8, arg1, arg5, arg10, arg4, arg6, arg0);
			Static421.method5620(local40);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)V")
	public static void method7730(@OriginalArg(0) int arg0) {
		if (Static221.method3025(arg0)) {
			Static252.method3509(Static559.aClass261ArrayArray2[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
	public static void method7733() {
		Static235.anInt3825 = 0;
		Static202.anInt3422 = 0;
		Static286.anInt4685 = 0;
		Static572.anInt9323 = 0;
	}
}
