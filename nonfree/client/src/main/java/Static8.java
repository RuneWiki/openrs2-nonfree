import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!aea", name = "z", descriptor = "Lclient!sg;")
	public static Class305 aClass305_1;

	@OriginalMember(owner = "client!aea", name = "E", descriptor = "I")
	public static int anInt127;

	@OriginalMember(owner = "client!aea", name = "P", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_1 = new Class215(11, 4);

	@OriginalMember(owner = "client!aea", name = "qb", descriptor = "Lclient!jn;")
	public static final Class178 aClass178_1 = new Class178(8, 0, 4, 1);

	@OriginalMember(owner = "client!aea", name = "ub", descriptor = "[I")
	public static final int[] anIntArray20 = new int[14];

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method147(@OriginalArg(1) String arg0) {
		if (Static469.aStringArray66 == null) {
			Static473.method7004();
		}
		Static206.aCalendar3.setTime(new Date(Static191.method3071()));
		@Pc(20) int local20 = Static206.aCalendar3.get(11);
		@Pc(24) int local24 = Static206.aCalendar3.get(12);
		@Pc(28) int local28 = Static206.aCalendar3.get(13);
		@Pc(62) String local62 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local28 / 10 + local28 % 10;
		@Pc(67) String[] local67 = Static557.method7916('\n', arg0);
		for (@Pc(69) int local69 = 0; local69 < local67.length; local69++) {
			for (@Pc(73) int local73 = Static214.anInt4424; local73 > 0; local73--) {
				Static469.aStringArray66[local73] = Static469.aStringArray66[local73 - 1];
			}
			Static469.aStringArray66[0] = local62 + ": " + local67[local69];
			if (Static638.aFileOutputStream1 != null) {
				try {
					Static638.aFileOutputStream1.write(Static505.method7342(Static469.aStringArray66[0] + "\n"));
				} catch (@Pc(119) IOException local119) {
				}
			}
			if (Static214.anInt4424 < Static469.aStringArray66.length - 1) {
				if (Static505.anInt8524 > 0) {
					Static505.anInt8524++;
				}
				Static214.anInt4424++;
			}
		}
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIZ)Z")
	public static boolean method152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(25) boolean local25 = (arg1 & 0x37) == 0 ? Static354.method5710(arg1, arg0) : Static103.method1721(arg0, arg1);
		return local25 | (arg0 & 0x10000) != 0 | Static270.method4505(arg1, arg0);
	}
}
