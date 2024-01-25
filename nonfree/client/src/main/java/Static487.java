import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static487 {

	@OriginalMember(owner = "client!rha", name = "z", descriptor = "Lclient!jg;")
	public static Class174 aClass174_12;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZILclient!ae;)V")
	public static void method6991(@OriginalArg(2) Class2_Sub2_Sub1 arg0) {
		Static473.aClass39_4.method2884(arg0);
		Static505.method7155(Static473.aClass39_4, Static87.aClass97_17, Static333.aClass97_87, Static560.aClass97_137, arg0);
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(ZZ)I")
	public static int method6993(@OriginalArg(0) boolean arg0) {
		if (Static340.anIntArray413 == null) {
			return 0;
		} else if (arg0 || Static41.aClass164Array1 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(25) int local25 = 0; local25 < Static340.anIntArray413.length; local25++) {
				@Pc(30) int local30 = Static340.anIntArray413[local25];
				if (Static40.aClass97_5.method2564(local30)) {
					local18++;
				}
				if (Static51.aClass97_7.method2564(local30)) {
					local18++;
				}
			}
			return local18;
		} else {
			return Static340.anIntArray413.length * 2;
		}
	}
}
