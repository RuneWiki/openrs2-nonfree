import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static655 {

	@OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
	public static int anInt10164;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "Lclient!iha;")
	public static Class172 aClass172_2;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
	public static int anInt10163 = 1;

	@OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
	public static int anInt10166 = 0;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method8761(@OriginalArg(0) String arg0) {
		if (Static177.aStringArray14 == null) {
			Static558.method7884();
		}
		Static657.aCalendar3.setTime(new Date(Static549.method7758()));
		@Pc(30) int local30 = Static657.aCalendar3.get(11);
		@Pc(34) int local34 = Static657.aCalendar3.get(12);
		@Pc(38) int local38 = Static657.aCalendar3.get(13);
		@Pc(72) String local72 = Integer.toString(local30 / 10) + local30 % 10 + ":" + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10;
		@Pc(77) String[] local77 = Static26.method332('\n', arg0);
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			for (@Pc(83) int local83 = Static573.anInt9177; local83 > 0; local83--) {
				Static177.aStringArray14[local83] = Static177.aStringArray14[local83 - 1];
			}
			Static177.aStringArray14[0] = local72 + ": " + local77[local79];
			if (Static214.aFileOutputStream1 != null) {
				try {
					Static214.aFileOutputStream1.write(Static668.method8852(Static177.aStringArray14[0] + "\n"));
				} catch (@Pc(141) IOException local141) {
				}
			}
			if (Static573.anInt9177 < Static177.aStringArray14.length - 1) {
				Static573.anInt9177++;
				if (Static577.anInt9220 > 0) {
					Static577.anInt9220++;
				}
			}
		}
	}
}
