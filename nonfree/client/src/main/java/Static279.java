import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_98 = new Class359(77, -2);

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(BLclient!hd;)Lclient!bj;")
	public static Class41 method4511(@OriginalArg(1) Class28_Sub1_Sub4 arg0) {
		@Pc(9) Class41 local9;
		if (Static16.aClass41_1 == null) {
			local9 = new Class41();
		} else {
			local9 = Static16.aClass41_1;
			Static16.aClass41_1 = Static16.aClass41_1.aClass41_2;
			Static388.anInt6928--;
			local9.aClass41_2 = null;
		}
		local9.aClass28_Sub1_Sub4_1 = arg0;
		return local9;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZIII)V")
	public static void method4512(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static517.method7322();
		Static578.aLong269 = (long) 0;
		@Pc(11) int local11 = Static469.method6688();
		if (arg2 == 3 || local11 == 3) {
			arg1 = true;
		}
		if (!Static208.aClass65_7.method6896()) {
			arg1 = true;
		}
		Static125.method2270(arg1, arg2, arg3, local11, arg0);
	}
}
