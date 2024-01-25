import java.applet.Applet;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!qaa", name = "H", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet3;

	@OriginalMember(owner = "client!qaa", name = "x", descriptor = "I")
	public static int anInt7330 = 0;

	@OriginalMember(owner = "client!qaa", name = "y", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_88 = new Class208(36, 8);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ljava/lang/String;I)J")
	public static long method5893(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (long) arg0.charAt(local17) + (local15 << 5) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method5896(@OriginalArg(0) String arg0) {
		if (Static425.aStringArray26 == null) {
			Static48.method6686();
		}
		Static40.aCalendar1.setTime(new Date(Static480.method6650()));
		@Pc(20) int local20 = Static40.aCalendar1.get(11);
		@Pc(24) int local24 = Static40.aCalendar1.get(12);
		@Pc(28) int local28 = Static40.aCalendar1.get(13);
		@Pc(62) String local62 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local28 / 10 + local28 % 10;
		@Pc(67) String[] local67 = Static95.method1438(arg0, '\n');
		for (@Pc(74) int local74 = 0; local74 < local67.length; local74++) {
			for (@Pc(78) int local78 = Static296.anInt5348; local78 > 0; local78--) {
				Static425.aStringArray26[local78] = Static425.aStringArray26[local78 - 1];
			}
			Static425.aStringArray26[0] = local62 + ": " + local67[local74];
			if (Static467.aFileOutputStream2 != null) {
				try {
					Static467.aFileOutputStream2.write(Static447.method6282(Static425.aStringArray26[0] + "\n"));
				} catch (@Pc(127) IOException local127) {
				}
			}
			if (Static425.aStringArray26.length - 1 > Static296.anInt5348) {
				if (Static232.anInt4308 > 0) {
					Static232.anInt4308++;
				}
				Static296.anInt5348++;
			}
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!in;I)V")
	public static void method5900(@OriginalArg(0) Class160 arg0) {
		if (arg0.anInt4185 == Static43.anInt868) {
			Static73.aBooleanArray6[arg0.anInt4165] = true;
		}
	}
}
