import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static481 {

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method7139(@OriginalArg(0) String arg0) {
		if (Static281.aStringArray16 == null) {
			Static393.method6278();
		}
		Static494.aCalendar2.setTime(new Date(Static342.method5463()));
		@Pc(20) int local20 = Static494.aCalendar2.get(11);
		@Pc(24) int local24 = Static494.aCalendar2.get(12);
		@Pc(28) int local28 = Static494.aCalendar2.get(13);
		@Pc(62) String local62 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local28 / 10 + local28 % 10;
		@Pc(67) String[] local67 = Static403.method6410(arg0, '\n');
		for (@Pc(74) int local74 = 0; local74 < local67.length; local74++) {
			for (@Pc(78) int local78 = Static183.anInt4304; local78 > 0; local78--) {
				Static281.aStringArray16[local78] = Static281.aStringArray16[local78 - 1];
			}
			Static281.aStringArray16[0] = local62 + ": " + local67[local74];
			if (Static578.aFileOutputStream1 != null) {
				try {
					Static578.aFileOutputStream1.write(Static145.method3026(Static281.aStringArray16[0] + "\n"));
				} catch (@Pc(127) IOException local127) {
				}
			}
			if (Static183.anInt4304 < Static281.aStringArray16.length - 1) {
				if (Static150.anInt3709 > 0) {
					Static150.anInt3709++;
				}
				Static183.anInt4304++;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
	public static boolean method7140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static537.method7584(arg1, arg0)) {
			return Static228.method4246(arg1, arg0) | (arg0 & 0xB000) != 0 | Static270.method8004(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static627.method8456(arg1, arg0) | Static456.method6913(arg0, arg1));
		} else {
			return false;
		}
	}
}
