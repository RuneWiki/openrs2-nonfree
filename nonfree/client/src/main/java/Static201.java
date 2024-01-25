import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "[Lclient!dt;")
	public static Class62[] aClass62Array2;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "Lclient!vp;")
	public static final Class240 aClass240_77 = new Class240("", 11);

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_62 = new Class57("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!ss;Lclient!ss;)V")
	public static void method3138(@OriginalArg(1) Class3_Sub7 arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg1.aClass3_Sub7_53 != null) {
			arg1.method5673();
		}
		arg1.aClass3_Sub7_53 = arg0;
		arg1.aClass3_Sub7_54 = arg0.aClass3_Sub7_54;
		arg1.aClass3_Sub7_53.aClass3_Sub7_54 = arg1;
		arg1.aClass3_Sub7_54.aClass3_Sub7_53 = arg1;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!dt;)Ljava/lang/String;")
	public static String method3145(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1) {
		if (!Static48.method915(arg1).method5602(arg0) && arg1.anObjectArray7 == null) {
			return null;
		} else if (arg1.aStringArray11 == null || arg1.aStringArray11.length <= arg0 || arg1.aStringArray11[arg0] == null || arg1.aStringArray11[arg0].trim().length() == 0) {
			return Static75.aBoolean129 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray11[arg0];
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBIII)V")
	public static void method3146(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static23.aClass3_Sub5_Sub1_1.anInt3121 = 0;
		Static23.aClass3_Sub5_Sub1_1.method2791(Static56.aClass76_6.anInt1930);
		Static23.aClass3_Sub5_Sub1_1.method2791(arg1);
		Static23.aClass3_Sub5_Sub1_1.method2791(arg3);
		Static23.aClass3_Sub5_Sub1_1.method2749(arg2);
		Static23.aClass3_Sub5_Sub1_1.method2749(arg0);
		Static115.anInt2217 = 0;
		Static116.anInt2222 = -3;
		Static270.anInt5905 = 1;
		Static24.anInt334 = 0;
	}
}
