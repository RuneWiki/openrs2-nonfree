import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!v", name = "U", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_141 = new Class85("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)V")
	public static void method5724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub1_Sub2 local8 = Static166.method3027(arg0, 12);
		local8.method850();
		local8.anInt996 = arg1;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
	public static void method5726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static163.anInt3234 <= arg0 && arg0 <= Static353.anInt6760) {
			@Pc(23) int local23 = Static161.method2842(arg2, Static346.anInt6668, Static75.anInt1447);
			@Pc(29) int local29 = Static161.method2842(arg1, Static346.anInt6668, Static75.anInt1447);
			Static160.method2839(arg3, local29, arg0, local23);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIB)V")
	public static void method5727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) Class5_Sub1_Sub2 local13 = Static166.method3027(arg2, 4);
		local13.method850();
		local13.anInt996 = arg1;
		local13.anInt991 = arg3;
		local13.anInt994 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
	public static void method5728() {
		Static239.aClass109_48.method2858();
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
	public static void method5729() {
		Static239.aClass109_48.method2850();
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(III)Lclient!jk;")
	public static Class4_Sub3 method5730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub3_2;
	}
}
