import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!jn", name = "W", descriptor = "Lclient!cr;")
	public static Class41 aClass41_18;

	@OriginalMember(owner = "client!jn", name = "P", descriptor = "Lclient!ca;")
	public static final Class29 aClass29_1 = new Class29();

	@OriginalMember(owner = "client!jn", name = "R", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!jn", name = "U", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_71 = new Class85("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!jn", name = "V", descriptor = "Lclient!cp;")
	public static final Class39 aClass39_4 = new Class39();

	@OriginalMember(owner = "client!jn", name = "X", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_36 = new Class109(64);

	@OriginalMember(owner = "client!jn", name = "Y", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray7 = new int[2][][];

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)V")
	public static void method2780() {
		@Pc(5) Class109 local5 = Static110.aClass109_25;
		synchronized (Static110.aClass109_25) {
			Static110.aClass109_25.method2850();
		}
		local5 = Static289.aClass109_51;
		synchronized (Static289.aClass109_51) {
			Static289.aClass109_51.method2850();
		}
		local5 = Static78.aClass109_21;
		synchronized (Static78.aClass109_21) {
			Static78.aClass109_21.method2850();
		}
		local5 = Static321.aClass109_58;
		synchronized (Static321.aClass109_58) {
			Static321.aClass109_58.method2850();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!jq;)V")
	public static void method2782(@OriginalArg(1) Class4_Sub5_Sub2 arg0) {
		if (arg0 instanceof Class4_Sub5_Sub2_Sub2) {
			@Pc(11) Class4_Sub5_Sub2_Sub2 local11 = (Class4_Sub5_Sub2_Sub2) arg0;
			if (local11.aClass106_1 != null) {
				Static167.method3040(local11);
			}
		} else if (arg0 instanceof Class4_Sub5_Sub2_Sub1) {
			Static262.method4617((Class4_Sub5_Sub2_Sub1) arg0);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)V")
	public static void method2783() {
		@Pc(1) Class109 local1 = Static119.aClass109_43;
		synchronized (Static119.aClass109_43) {
			Static119.aClass109_43.method2859(5);
		}
		local1 = Static41.aClass109_14;
		synchronized (Static41.aClass109_14) {
			Static41.aClass109_14.method2859(5);
		}
		local1 = Static142.aClass109_32;
		synchronized (Static142.aClass109_32) {
			Static142.aClass109_32.method2859(5);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZIIIIIIIII)Z")
	public static boolean method2784(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(24) int local24 = Static86.method1556(arg6, arg9, Static100.anIntArray177, Static152.aClass24Array3[Static239.anInt4811], Static192.aClass4_Sub5_Sub2_Sub1_2.method4807(), Static244.anIntArray480, arg3, arg4, arg2, arg1, arg0, arg5, arg7, arg8);
		if (local24 < 1) {
			return false;
		}
		Static224.anInt4437 = Static100.anIntArray177[local24 - 1];
		Static159.anInt3128 = Static244.anIntArray480[local24 - 1];
		Static48.aBoolean65 = false;
		Static141.method2510();
		return true;
	}
}
