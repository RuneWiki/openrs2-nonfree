import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
	public static int anInt4140;

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "Lclient!ps;")
	public static Class294 aClass294_1;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method3794(@OriginalArg(1) String arg0) {
		if (Static464.aStringArray33 == null) {
			Static550.method4227();
		}
		Static68.aCalendar3.setTime(new Date(Static480.method6763()));
		@Pc(29) int local29 = Static68.aCalendar3.get(11);
		@Pc(33) int local33 = Static68.aCalendar3.get(12);
		@Pc(37) int local37 = Static68.aCalendar3.get(13);
		@Pc(71) String local71 = Integer.toString(local29 / 10) + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10;
		@Pc(76) String[] local76 = Static350.method5156('\n', arg0);
		for (@Pc(78) int local78 = 0; local78 < local76.length; local78++) {
			for (@Pc(82) int local82 = Static356.anInt5849; local82 > 0; local82--) {
				Static464.aStringArray33[local82] = Static464.aStringArray33[local82 - 1];
			}
			Static464.aStringArray33[0] = local71 + ": " + local76[local78];
			if (Static373.aFileOutputStream1 != null) {
				try {
					Static373.aFileOutputStream1.write(Static73.method1219(Static464.aStringArray33[0] + "\n"));
				} catch (@Pc(140) IOException local140) {
				}
			}
			if (Static464.aStringArray33.length - 1 > Static356.anInt5849) {
				if (Static165.anInt3245 > 0) {
					Static165.anInt3245++;
				}
				Static356.anInt5849++;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
	public static void method3796(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		Static230.anInt3962 = 0;
		Static573.anInt8986 = 0;
		Static463.anInt7530 = arg1;
		Static319.anInt5445 = arg0;
	}
}
