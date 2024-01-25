import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6830(@OriginalArg(0) String arg0) {
		if (Static286.aStringArray14 == null) {
			Static262.method3785();
		}
		Static391.aCalendar3.setTime(new Date(Static521.method7499()));
		@Pc(24) int local24 = Static391.aCalendar3.get(11);
		@Pc(28) int local28 = Static391.aCalendar3.get(12);
		@Pc(32) int local32 = Static391.aCalendar3.get(13);
		@Pc(66) String local66 = Integer.toString(local24 / 10) + local24 % 10 + ":" + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
		@Pc(71) String[] local71 = Static111.method1920('\n', arg0);
		for (@Pc(73) int local73 = 0; local73 < local71.length; local73++) {
			for (@Pc(77) int local77 = Static559.anInt9499; local77 > 0; local77--) {
				Static286.aStringArray14[local77] = Static286.aStringArray14[local77 - 1];
			}
			Static286.aStringArray14[0] = local66 + ": " + local71[local73];
			if (Static16.aFileOutputStream3 != null) {
				try {
					Static16.aFileOutputStream3.write(Static264.method3852(Static286.aStringArray14[0] + "\n"));
				} catch (@Pc(126) IOException local126) {
				}
			}
			if (Static286.aStringArray14.length - 1 > Static559.anInt9499) {
				if (Static157.anInt3114 > 0) {
					Static157.anInt3114++;
				}
				Static559.anInt9499++;
			}
		}
	}
}
