import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
	public static int anInt6297 = 0;

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public static int anInt6298 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5096(@OriginalArg(0) String arg0) {
		if (Static307.aStringArray35 == null) {
			Static98.method1495();
		}
		@Pc(20) String[] local20 = Static15.method181(arg0, '\n');
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			for (@Pc(26) int local26 = Static197.anInt3567; local26 > 0; local26--) {
				Static307.aStringArray35[local26] = Static307.aStringArray35[local26 - 1];
			}
			Static307.aStringArray35[0] = local20[local22];
			if (Static307.aStringArray35.length - 1 > Static197.anInt3567) {
				if (Static278.anInt4618 > 0) {
					Static278.anInt4618++;
				}
				Static197.anInt3567++;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V")
	public static void method5097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 >= Static62.anInt1114 && Static207.anInt3632 >= arg3 && Static254.anInt4211 <= arg1 && Static275.anInt4594 >= arg0) {
			if (arg4 == 1) {
				Static225.method3047(arg5, arg1, arg0, arg3, arg2);
			} else {
				Static81.method1306(arg1, arg5, arg4, arg3, arg0, arg2);
			}
		} else if (arg4 == 1) {
			Static139.method1980(arg1, arg2, arg3, arg5, arg0);
		} else {
			Static413.method5615(arg2, arg0, arg4, arg1, arg5, arg3);
		}
	}
}
