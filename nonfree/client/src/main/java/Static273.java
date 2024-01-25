import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Lclient!gh;")
	public static Class115 aClass115_1;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public static void method4575() {
		if (Static330.anInterface8Array1 == null) {
			return;
		}
		@Pc(10) Interface8[] local10 = Static330.anInterface8Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface8 local18 = local10[local12];
			local18.method6512();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
	public static void method4577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static460.anInt8492 == 1) {
			Static460.aClass66Array12[Static450.anInt8253 / 100].method8066(Static77.anInt1917 - 8, Static383.anInt7200 + -8);
		}
		if (Static460.anInt8492 == 2) {
			Static460.aClass66Array12[Static450.anInt8253 / 100 + 4].method8066(Static77.anInt1917 - 8, Static383.anInt7200 + -8);
		}
		Static471.method7249();
	}
}
