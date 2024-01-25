import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "Lclient!uu;")
	public static Class343 aClass343_134;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
	public static int anInt5074 = -1;

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
	public static int anInt5076 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!cf;)V")
	public static void method4361(@OriginalArg(0) Class47 arg0) {
		Static460.aClass47_3 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BILclient!ha;ILclient!jo;ILclient!to;Lclient!cu;I)V")
	public static void method4362(@OriginalArg(1) int arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class179 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub47 arg5, @OriginalArg(7) Class61 arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg4 - arg2 / 2 - 5;
		@Pc(18) int local18 = arg7 + 2;
		if (arg3.anInt5328 != 0) {
			arg1.method6134(local14, arg7 + arg6.method1409() * arg0 + 1 - local18, arg2 + 10, arg3.anInt5328, local18);
		}
		if (arg3.anInt5321 != 0) {
			arg1.method6137(arg6.method1409() * arg0 + arg7 + 1 - local18, local14, arg2 + 10, local18, arg3.anInt5321);
		}
		@Pc(74) int local74 = arg3.anInt5335;
		if (arg5.aBoolean678 && arg3.anInt5342 != -1) {
			local74 = arg3.anInt5342;
		}
		for (@Pc(87) int local87 = 0; local87 < arg0; local87++) {
			@Pc(93) String local93 = Static282.aStringArray42[local87];
			if (arg0 - 1 > local87) {
				local93 = local93.substring(0, local93.length() - 4);
			}
			arg6.method1407(arg1, local93, arg4, arg7, local74);
			arg7 += arg6.method1409();
		}
	}
}
