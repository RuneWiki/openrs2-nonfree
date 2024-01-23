import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "Qb", descriptor = "I")
	public static int anInt279;

	@OriginalMember(owner = "client!ae", name = "Xb", descriptor = "I")
	public static int anInt285;

	@OriginalMember(owner = "client!ae", name = "gc", descriptor = "Lclient!qg;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!ae", name = "Kb", descriptor = "I")
	public static int anInt276 = 0;

	@OriginalMember(owner = "client!ae", name = "Lb", descriptor = "I")
	public static int anInt277 = 0;

	@OriginalMember(owner = "client!ae", name = "Mb", descriptor = "Lclient!i;")
	public static Class41 aClass41_49 = Static184.method2923("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ae", name = "Ob", descriptor = "[I")
	public static int[] anIntArray12 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ae", name = "cc", descriptor = "Lclient!i;")
	private static Class41 aClass41_54 = Static184.method2923("Cancel");

	@OriginalMember(owner = "client!ae", name = "Pb", descriptor = "Lclient!i;")
	public static Class41 aClass41_50 = aClass41_54;

	@OriginalMember(owner = "client!ae", name = "Vb", descriptor = "Lclient!i;")
	public static Class41 aClass41_51 = Static184.method2923(" GMT");

	@OriginalMember(owner = "client!ae", name = "Wb", descriptor = "I")
	public static int anInt284 = 10;

	@OriginalMember(owner = "client!ae", name = "Zb", descriptor = "Lclient!i;")
	public static Class41 aClass41_52 = Static184.method2923("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ae", name = "ac", descriptor = "Lclient!i;")
	public static Class41 aClass41_53 = Static184.method2923("Freie Welt");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIIIII)V")
	public static void method217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static60.anInt4779 <= arg3 && Static11.anInt385 >= arg4 && arg1 >= Static45.anInt1337 && Static17.anInt457 >= arg0) {
			Static198.method3078(arg3, arg2, arg4, arg1, arg0);
		} else {
			Static31.method609(arg2, arg1, arg0, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "(IB)Z")
	public static boolean method218(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}
}
