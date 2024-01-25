import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!aba;")
	public static Class4 aClass4_10;

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_54 = new Class187(34, 7);

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_154 = new Class196(26, -1);

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!aj;ZZ)V")
	public static void method3801(@OriginalArg(1) Class5_Sub4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(11) int local11 = arg0.anInt257;
		@Pc(15) int local15 = (int) arg0.aLong329;
		arg0.method8829();
		if (arg2) {
			Static46.method622(local11);
		}
		Static307.method4714(local11);
		@Pc(30) Class394 local30 = Static238.method3422(local15);
		if (local30 != null) {
			Static609.method8190(local30);
		}
		Static190.method2743();
		if (!arg1 && Static131.anInt2222 != -1) {
			Static416.method6119(Static131.anInt2222, 1);
		}
		@Pc(51) Class304 local51 = new Class304(Static131.aClass335_15);
		for (@Pc(56) Class5_Sub4 local56 = (Class5_Sub4) local51.method7247(); local56 != null; local56 = (Class5_Sub4) local51.method7246()) {
			if (!local56.method8826()) {
				local56 = (Class5_Sub4) local51.method7247();
				if (local56 == null) {
					return;
				}
			}
			if (local56.anInt259 == 3) {
				@Pc(77) int local77 = (int) local56.aLong329;
				if (local11 == local77 >>> 16) {
					method3801(local56, arg1, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;)V")
	public static void method3804(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(7) Class295 local7 = Static69.aClass295Array1[99];
		for (@Pc(9) int local9 = 99; local9 > 0; local9--) {
			Static69.aClass295Array1[local9] = Static69.aClass295Array1[local9 - 1];
		}
		if (local7 == null) {
			local7 = new Class295(arg4, arg6, arg2, arg1, arg3, arg7, arg5, arg0);
		} else {
			local7.method7179(arg5, arg2, arg6, arg3, arg4, arg1, arg7, arg0);
		}
		Static155.anInt2639++;
		Static649.anInt10250 = Static293.anInt4549;
		Static69.aClass295Array1[0] = local7;
	}
}
