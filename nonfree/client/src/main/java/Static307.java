import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!jm", name = "U", descriptor = "Lclient!nca;")
	public static Class254 aClass254_95;

	@OriginalMember(owner = "client!jm", name = "P", descriptor = "[[Lclient!np;")
	public static Class264[][] aClass264ArrayArray1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!jm", name = "R", descriptor = "Ljava/lang/Class;")
	public static Class aClass27;

	@OriginalMember(owner = "client!jm", name = "W", descriptor = "Lclient!pm;")
	public static final Class295 aClass295_8 = new Class295(2);

	@OriginalMember(owner = "client!jm", name = "H", descriptor = "Z")
	public static boolean aBoolean407 = false;

	@OriginalMember(owner = "client!jm", name = "D", descriptor = "Lclient!lba;")
	public static final Class218 aClass218_22 = new Class218(16);

	@OriginalMember(owner = "client!jm", name = "L", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_92 = new Class225(68, -1);

	@OriginalMember(owner = "client!jm", name = "E", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_93 = new Class225(7, -1);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)Z")
	public static boolean method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Interface25 local9 = (Interface25) Static91.method1414(arg1, arg0, arg2);
		@Pc(17) boolean local17 = true;
		if (local9 != null) {
			local17 = Static392.method5834(local9) & true;
		}
		local9 = (Interface25) Static140.method2072(arg1, arg0, arg2, aClass27 == null ? (aClass27 = Class199_Sub1.a("vi")) : aClass27);
		if (local9 != null) {
			local17 &= Static392.method5834(local9);
		}
		local9 = (Interface25) Static441.method6382(arg1, arg0, arg2);
		if (local9 != null) {
			local17 &= Static392.method5834(local9);
		}
		return local17;
	}
}
