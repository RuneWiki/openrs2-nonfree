import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static204 {

	@OriginalMember(owner = "client!gl", name = "cb", descriptor = "Lclient!cm;")
	public static Class34_Sub1_Sub1_Sub2_Sub1 aClass34_Sub1_Sub1_Sub2_Sub1_1;

	@OriginalMember(owner = "client!gl", name = "eb", descriptor = "I")
	public static int anInt3590;

	@OriginalMember(owner = "client!gl", name = "W", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_39 = new Class171(86, 6);

	@OriginalMember(owner = "client!gl", name = "ab", descriptor = "Lclient!qw;")
	public static final Class302 aClass302_20 = new Class302();

	@OriginalMember(owner = "client!gl", name = "fb", descriptor = "I")
	public static int anInt3591 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IBIIIII)V")
	public static void method3063(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 - arg2 >= Static300.anInt5091 && Static629.anInt10412 >= arg1 + arg2 && Static617.anInt6260 <= arg0 - arg2 && Static229.anInt4089 >= arg0 + arg2) {
			Static475.method6322(arg5, arg1, arg3, arg0, arg4, arg2);
		} else {
			Static291.method4284(arg4, arg1, arg0, arg2, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)Z")
	public static boolean method3066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}
}
