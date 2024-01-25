import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!mba", name = "H", descriptor = "Z")
	public static boolean aBoolean503;

	@OriginalMember(owner = "client!mba", name = "A", descriptor = "I")
	public static int anInt6830 = -1;

	@OriginalMember(owner = "client!mba", name = "g", descriptor = "(I)V")
	public static void method5844() {
		for (@Pc(6) Class2_Sub26 local6 = (Class2_Sub26) Static224.aClass99_38.method3060(); local6 != null; local6 = (Class2_Sub26) Static224.aClass99_38.method3058()) {
			if (local6.aClass165_Sub1_1.method7053()) {
				Static415.method6712(local6.anInt5281);
			} else {
				local6.aClass165_Sub1_1.method7065();
				try {
					local6.aClass165_Sub1_1.method7060();
				} catch (@Pc(29) Exception local29) {
					Static408.method6625("TV: " + local6.anInt5281, local29);
					Static415.method6712(local6.anInt5281);
				}
				if (!local6.aBoolean391 && !local6.aBoolean390) {
					@Pc(55) Class2_Sub5_Sub1 local55 = local6.aClass165_Sub1_1.method7055();
					if (local55 != null) {
						@Pc(61) Class2_Sub8_Sub2 local61 = local55.method4934();
						if (local61 != null) {
							local61.method4480(local6.anInt5285);
							Static614.aClass2_Sub8_Sub4_2.method7928(local61);
							local6.aBoolean391 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5845(@OriginalArg(0) long arg0) {
		Static130.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static130.aCalendar1.get(7);
		@Pc(17) int local17 = Static130.aCalendar1.get(5);
		@Pc(26) int local26 = Static130.aCalendar1.get(2);
		@Pc(30) int local30 = Static130.aCalendar1.get(1);
		@Pc(34) int local34 = Static130.aCalendar1.get(11);
		@Pc(38) int local38 = Static130.aCalendar1.get(12);
		@Pc(42) int local42 = Static130.aCalendar1.get(13);
		return Static334.aStringArray31[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static102.aStringArray16[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(III)Z")
	public static boolean method5846(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}
}
