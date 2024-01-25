import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILclient!gk;Lclient!r;II)V")
	public static void method3333(@OriginalArg(1) Class112 arg0, @OriginalArg(2) Class45 arg1) {
		Static565.aClass112_71.method3092();
		if (Static68.aBoolean127) {
			return;
		}
		for (@Pc(20) Class3_Sub51 local20 = (Class3_Sub51) arg0.method3088(); local20 != null; local20 = (Class3_Sub51) arg0.method3084()) {
			@Pc(28) Class174 local28 = Static44.aClass102_4.method2925(local20.anInt9426);
			if (Static244.method3783(local28)) {
				@Pc(40) boolean local40 = Static153.method2896(local20, local28, arg1);
				if (local40) {
					Static460.method5155(local28, arg1, local20);
				}
			}
		}
	}
}
