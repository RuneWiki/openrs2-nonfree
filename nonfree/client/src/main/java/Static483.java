import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
	public static int anInt8675;

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
	public static int anInt8676;

	@OriginalMember(owner = "client!qea", name = "e", descriptor = "D")
	public static double aDouble20;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "J")
	public static long aLong238 = 0L;

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
	public static int anInt8677 = 0;

	@OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
	public static int anInt8680 = 0;

	@OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
	public static int anInt8682 = 0;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BC)Z")
	public static boolean method7665(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method7666(@OriginalArg(1) long arg0) {
		Static633.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static633.aCalendar3.get(7);
		@Pc(17) int local17 = Static633.aCalendar3.get(5);
		@Pc(21) int local21 = Static633.aCalendar3.get(2);
		@Pc(25) int local25 = Static633.aCalendar3.get(1);
		@Pc(29) int local29 = Static633.aCalendar3.get(11);
		@Pc(33) int local33 = Static633.aCalendar3.get(12);
		@Pc(42) int local42 = Static633.aCalendar3.get(13);
		return Static293.aStringArray42[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static274.aStringArray28[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
	public static void method7667() {
		if (Static11.aClass138_1 != null) {
			Static396.aClass249_1 = new Class249();
			Static396.aClass249_1.method6626(Static11.aClass138_1.aClass134_64.method3906(Static204.anInt8130), Static11.aClass138_1.anInt4448, Static425.aLong215, Static11.aClass138_1);
			Static148.aThread4 = new Thread(Static396.aClass249_1, "");
			Static148.aThread4.start();
		}
	}
}
