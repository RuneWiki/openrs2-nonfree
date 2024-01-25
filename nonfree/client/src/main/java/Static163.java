import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!aa;")
	public static Class2 aClass2_29;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BC)Z")
	public static boolean method6311(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
	public static int method6312(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static344.method5025(arg0 - 1, arg1 + -1) + Static344.method5025(arg0 + 1, arg1 + -1) + Static344.method5025(arg0 + -1, arg1 + 1) + Static344.method5025(arg0 + 1, arg1 + 1);
		@Pc(75) int local75 = Static344.method5025(arg0 - 1, arg1) + Static344.method5025(arg0 + 1, arg1) + Static344.method5025(arg0, arg1 - 1) + Static344.method5025(arg0, arg1 - -1);
		@Pc(87) int local87 = Static344.method5025(arg0, arg1);
		return local87 / 4 + local75 / 8 + local43 / 16;
	}

	@OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
	public static void method6313() {
		Static44.aClass83_9.method2346();
	}
}
