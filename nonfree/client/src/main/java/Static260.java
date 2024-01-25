import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	public static int anInt2259;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_66 = new Class119("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_59 = new Class12(88, 1);

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Z")
	public static boolean aBoolean257 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI[Lclient!jk;)V")
	public static void method1929(@OriginalArg(1) int arg0, @OriginalArg(2) Class124[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(15) Class124 local15 = arg1[local7];
			if (local15 != null) {
				if (local15.anInt3417 == 0) {
					if (local15.aClass124Array1 != null) {
						method1929(arg0, local15.aClass124Array1);
					}
					@Pc(39) Class1_Sub14 local39 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local15.anInt3348);
					if (local39 != null) {
						Static363.method4852(arg0, local39.anInt1425);
					}
				}
				@Pc(55) Class1_Sub40 local55;
				if (arg0 == 0 && local15.anObjectArray16 != null) {
					local55 = new Class1_Sub40();
					local55.anObjectArray36 = local15.anObjectArray16;
					local55.aClass124_14 = local15;
					Static298.method4076(local55);
				}
				if (arg0 == 1 && local15.anObjectArray10 != null) {
					if (local15.anInt3430 >= 0) {
						@Pc(83) Class124 local83 = Static412.method5315(local15.anInt3348);
						if (local83 == null || local83.aClass124Array1 == null || local83.aClass124Array1.length <= local15.anInt3430 || local15 != local83.aClass124Array1[local15.anInt3430]) {
							continue;
						}
					}
					local55 = new Class1_Sub40();
					local55.anObjectArray36 = local15.anObjectArray10;
					local55.aClass124_14 = local15;
					Static298.method4076(local55);
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Lclient!as;")
	public static Class14 method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class14 local7 = new Class14();
		local7.anInt369 = arg0 + 5 + 1;
		local7.anInt356 = arg1 + 1 + 5;
		local7.anInt374 = -1;
		local7.anInt377 = -1;
		local7.anIntArrayArray3 = new int[local7.anInt356][local7.anInt369];
		local7.method288();
		return local7;
	}
}
