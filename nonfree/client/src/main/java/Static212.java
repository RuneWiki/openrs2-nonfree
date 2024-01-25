import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "Lclient!pl;")
	public static Class259 aClass259_64;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "Z")
	public static boolean aBoolean333;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "Lclient!pk;")
	public static final Class258 aClass258_4 = new Class258("WTRC", 1);

	@OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
	public static int anInt4095 = 0;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Lclient!ev;")
	public static Class6_Sub1_Sub3 method3430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass6_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)I")
	public static int method3434() {
		if (Static125.aFrame1 == null) {
			return Static46.aBoolean79 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	public static void method3435(@OriginalArg(0) int arg0) {
		Static415.anInt7185 = -1;
		Static75.anInt1651 = arg0;
		Static415.anInt7185 = -1;
		Static246.method3822();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3438(@OriginalArg(1) String arg0) {
		if (Static77.aStringArray189 == null) {
			Static286.method4247();
		}
		Static471.aCalendar1.setTime(new Date(Static548.method7437()));
		@Pc(26) int local26 = Static471.aCalendar1.get(11);
		@Pc(30) int local30 = Static471.aCalendar1.get(12);
		@Pc(34) int local34 = Static471.aCalendar1.get(13);
		@Pc(68) String local68 = Integer.toString(local26 / 10) + local26 % 10 + ":" + local30 / 10 + local30 % 10 + ":" + local34 / 10 + local34 % 10;
		@Pc(73) String[] local73 = Static568.method7710(arg0, '\n');
		for (@Pc(75) int local75 = 0; local75 < local73.length; local75++) {
			for (@Pc(79) int local79 = Static583.anInt9519; local79 > 0; local79--) {
				Static77.aStringArray189[local79] = Static77.aStringArray189[local79 - 1];
			}
			Static77.aStringArray189[0] = local68 + ": " + local73[local75];
			if (Static583.anInt9519 < Static77.aStringArray189.length - 1) {
				if (Static70.anInt1594 > 0) {
					Static70.anInt1594++;
				}
				Static583.anInt9519++;
			}
		}
	}
}
