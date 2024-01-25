import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
	public static int anInt4144;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
	public static void method3344() {
		Static401.aClass199_172.method4385();
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
	public static void method3346() {
		for (@Pc(17) Class1_Sub3 local17 = (Class1_Sub3) Static413.aClass227_43.method4967(); local17 != null; local17 = (Class1_Sub3) Static413.aClass227_43.method4973()) {
			if (local17.anInt120 > 0) {
				local17.anInt120--;
			}
			if (local17.anInt120 != 0) {
				if (local17.anInt118 > 0) {
					local17.anInt118--;
				}
				if (local17.anInt118 == 0 && local17.anInt126 >= 1 && local17.anInt121 >= 1 && Static296.anInt5187 - 2 >= local17.anInt126 && Static206.anInt3607 - 2 >= local17.anInt121 && (local17.anInt124 < 0 || Static382.method5589(local17.anInt124, local17.anInt119))) {
					Static222.method3241(-1, local17.anInt124, local17.anInt126, local17.anInt125, local17.anInt119, local17.anInt115, local17.anInt127, local17.anInt121);
					local17.anInt118 = -1;
					if (local17.anInt123 == local17.anInt124 && local17.anInt123 == -1) {
						local17.method5915();
					} else if (local17.anInt124 == local17.anInt123 && local17.anInt116 == local17.anInt115 && local17.anInt117 == local17.anInt119) {
						local17.method5915();
					}
				}
			} else if (local17.anInt123 < 0 || Static382.method5589(local17.anInt123, local17.anInt117)) {
				Static222.method3241(-1, local17.anInt123, local17.anInt126, local17.anInt125, local17.anInt117, local17.anInt116, local17.anInt127, local17.anInt121);
				local17.method5915();
			}
		}
	}
}
