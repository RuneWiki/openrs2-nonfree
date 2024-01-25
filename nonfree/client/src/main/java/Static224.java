import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
	public static void method3949() {
		for (@Pc(18) Class20_Sub5 local18 = (Class20_Sub5) Static126.aClass109_3.method2940(); local18 != null; local18 = (Class20_Sub5) Static126.aClass109_3.method2940()) {
			Static191.method3585(local18);
		}
		Static43.method752();
		Static43.method745();
		Static43.method749();
		Static43.method757();
		Static43.method748();
		Static43.method754();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(CI)C")
	public static char method3950(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}
