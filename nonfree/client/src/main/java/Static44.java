import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public static int anInt728;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_13 = new Class253(104, -1);

	@OriginalMember(owner = "client!cd", name = "n", descriptor = "J")
	public static long aLong33 = -1L;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	public static int anInt726 = -1;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	public static int anInt727 = 0;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString5 = null;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!la;ILclient!ya;IZ)V")
	public static void method596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class63 arg2, @OriginalArg(4) Class51 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg5) {
			Static126.aClass11_7.method4394((Static251.anInt4258 - Static126.aClass11_7.j()) / 2, (Static286.anInt4051 - Static126.aClass11_7.T()) / 2);
			Static344.aClass11_18.method4394((Static251.anInt4258 - Static344.aClass11_18.j()) / 2, 18);
		}
		@Pc(32) String local32 = "";
		if (Static191.aClass137_3 == Static419.aClass137_4) {
			local32 = Static124.aClass55_55.method1205(Static5.anInt20);
		} else if (Static191.aClass137_3 == Static55.aClass137_1) {
			local32 = Static363.aClass55_122.method1205(Static5.anInt20);
		}
		arg2.method4585(-1, arg1, local32, Static251.anInt4258 / 2, Static286.anInt4051 / 2 - 26);
		@Pc(70) int local70 = Static286.anInt4051 / 2 - 18;
		arg3.method5287(Static251.anInt4258 / 2 - 152, local70, 304, 34, arg4, 0);
		arg3.method5287(Static251.anInt4258 / 2 - 151, local70 + 1, 302, 32, 0, 0);
		arg3.O(Static251.anInt4258 / 2 - 150, local70 + 2, Static102.anInt2084 * 3, 30, arg0, 0);
		arg3.O(Static102.anInt2084 * 3 + Static251.anInt4258 / 2 - 150, local70 + 2, 300 - Static102.anInt2084 * 3, 30, 0, 0);
		arg2.method4585(-1, arg1, Static112.aString21, Static251.anInt4258 / 2, Static286.anInt4051 / 2 + 4);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public static void method599() {
		Static176.method2549();
	}
}
