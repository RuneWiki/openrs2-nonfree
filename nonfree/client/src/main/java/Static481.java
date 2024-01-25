import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "Lclient!xa;")
	public static Class4 aClass4_31;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_173 = new Class40(71, -2);

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!cb;")
	public static final Class40 aClass40_174 = new Class40(59, 3);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Z")
	public static boolean method6677(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(ZI)Z")
	public static boolean method6678(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)Lclient!ia;")
	public static Class29_Sub4 method6680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class29_Sub4 local14 = local7.aClass29_Sub4_1;
			local7.aClass29_Sub4_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIII)V")
	public static void method6681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static112.method1759(arg4, Static134.anInt2364, Static60.anInt971);
		@Pc(21) int local21 = Static112.method1759(arg1, Static134.anInt2364, Static60.anInt971);
		@Pc(27) int local27 = Static112.method1759(arg3, Static235.anInt3970, Static151.anInt2683);
		@Pc(33) int local33 = Static112.method1759(arg0, Static235.anInt3970, Static151.anInt2683);
		for (@Pc(35) int local35 = local11; local35 <= local21; local35++) {
			Static455.method6536(local33, local27, arg2, Static503.anIntArrayArray12[local35]);
		}
	}
}
