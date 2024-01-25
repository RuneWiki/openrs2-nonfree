import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!ka;III)Lclient!lca;")
	public static Class191 method5365(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return arg1 == null ? null : new Class191(arg2, arg3, arg0, arg1.na(), arg1.V(), arg1.RA(), arg1.fa(), arg1.EA(), arg1.HA(), arg1.G());
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBIZ)V")
	public static void method5366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static582.method8107();
		Static137.aLong85 = 0L;
		@Pc(14) int local14 = Static383.method6158();
		if (arg2 == 3 || local14 == 3) {
			arg3 = true;
		}
		if (!Static171.aClass16_5.method6055()) {
			arg3 = true;
		}
		Static526.method7465(arg1, arg3, arg2, local14, arg0);
	}
}
