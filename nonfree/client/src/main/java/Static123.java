import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static123 {

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "Lclient!fd;")
	public static Class25 aClass25_31;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	public static int anInt3377;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "[I")
	public static int[] anIntArray392;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_939 = Static158.method3034("Malformed login packet)3");

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "I")
	public static int anInt3379 = 100;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_940 = Static158.method3034("Connecting to update server");

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "Lclient!ob;")
	public static Class60 aClass60_941 = aClass60_940;

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "Lclient!ob;")
	public static Class60 aClass60_942 = aClass60_939;

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_943 = Static158.method3034("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "I")
	public static int anInt3380 = 0;

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_944 = Static158.method3034(" GMT");

	@OriginalMember(owner = "client!ng", name = "E", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_945 = Static158.method3034("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method2611(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static64.anInt1962 && anInt3379 >= arg4 && arg3 >= Static64.anInt1962 && anInt3379 >= arg3 && arg8 >= Static64.anInt1962 && anInt3379 >= arg8 && Static64.anInt1962 <= arg1 && arg1 <= anInt3379 && arg6 >= Static36.anInt1076 && Static117.anInt951 >= arg6 && Static36.anInt1076 <= arg2 && Static117.anInt951 >= arg2 && Static36.anInt1076 <= arg0 && arg0 <= Static117.anInt951 && Static36.anInt1076 <= arg7 && arg7 <= Static117.anInt951) {
			Static138.method540(arg6, arg0, arg3, arg2, arg5, arg4, arg8, arg7, arg1);
		} else {
			Static189.method3457(arg1, arg8, arg0, arg6, arg5, arg2, arg4, arg7, arg3);
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Z")
	public static boolean method2612(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
