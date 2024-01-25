import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "[I")
	public static final int[] anIntArray572 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	public static void method4868() {
		for (@Pc(14) Class1_Sub24 local14 = (Class1_Sub24) Static248.aClass37_30.method977(); local14 != null; local14 = (Class1_Sub24) Static248.aClass37_30.method971()) {
			if (Static156.method2464(local14.anInt3161)) {
				Static53.method1036(local14);
			}
		}
		if (Static16.anInt415 == 1) {
			Static543.method7538();
			return;
		}
		Static518.method7137(Static260.anInt5040, Static541.anInt9145, Static13.anInt305, Static188.anInt3359);
		@Pc(51) int local51 = Static381.aClass232_6.method5432(Static179.aClass306_39.method7165(Static179.anInt3168));
		for (@Pc(56) Class1_Sub24 local56 = (Class1_Sub24) Static248.aClass37_30.method977(); local56 != null; local56 = (Class1_Sub24) Static248.aClass37_30.method971()) {
			@Pc(62) int local62 = Static138.method2265(local56);
			if (local62 > local51) {
				local51 = local62;
			}
		}
		Static541.anInt9145 = local51 + 8;
		Static260.anInt5040 = (Static541.aBoolean640 ? 26 : 22) + Static16.anInt415 * 16;
	}
}
