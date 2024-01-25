import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
	public static int anInt1573;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "()V")
	public static void method1443() {
		for (@Pc(1) int local1 = 0; local1 < Static255.anInt5115; local1++) {
			@Pc(6) Class15_Sub2 local6 = Static448.aClass15_Sub2Array3[local1];
			Static223.method3541(local6);
			Static448.aClass15_Sub2Array3[local1] = null;
		}
		Static255.anInt5115 = 0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!r;Lclient!km;IIII)V")
	public static void method1444(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 != null) {
			arg1.method4379(arg0.U(), arg0.TA(), arg4, arg2, arg3, arg0.Q(), arg0.wa(), arg0.va(), arg0.n(), arg0.e());
		}
	}
}
