import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IBI)V")
	public static void method7069(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static22.aClass144_1 == null) {
			return;
		}
		@Pc(9) int local9 = Static93.anInt1647;
		@Pc(11) int local11 = Static117.anInt1906;
		Static615.method8663(arg0, arg1);
		if (Static18.anInt243 == 0) {
			Static456.anInterface22_1 = null;
			Static456.anInterface22_1 = Static22.aClass144_1.method6956(Static22.aClass144_1.method6957(Static187.anInt3099, Static347.anInt5886), Static22.aClass144_1.method6963(Static187.anInt3099, Static347.anInt5886));
		} else if (Static18.anInt243 == 1 && (Static276.anInterface22Array1 == null || Static93.anInt1647 != local9 || Static117.anInt1906 != local11)) {
			Static276.anInterface22Array1 = new Interface22[Static117.anInt1906 * Static93.anInt1647];
			for (@Pc(69) int local69 = 0; local69 < Static276.anInterface22Array1.length; local69++) {
				Static276.anInterface22Array1[local69] = Static22.aClass144_1.method6956(Static22.aClass144_1.method6957(Static599.anInt9885, Static611.anInt10061), Static22.aClass144_1.method6963(Static599.anInt9885, Static611.anInt10061));
			}
			Static466.anIntArray414 = new int[Static93.anInt1647 * Static117.anInt1906];
			Static186.anInt3088 = 1;
		}
		Static282.aBoolean384 = true;
	}
}
