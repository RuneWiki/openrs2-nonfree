import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_115 = new Class98(44, 6);

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "Z")
	public static boolean aBoolean496 = false;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "Z")
	public static boolean aBoolean497 = false;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIB)Z")
	public static boolean method5849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static362.method5387(arg1, arg0) || Static359.method7509(arg0, arg1);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!bt;")
	public static Class15_Sub2 method5850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class315 local14 = local7.aClass315_1; local14 != null; local14 = local14.aClass315_3) {
			@Pc(18) Class15_Sub2 local18 = local14.aClass15_Sub2_2;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort116 == arg1 && local18.aShort114 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
