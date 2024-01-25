import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
	public static int anInt4883 = 0;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_93 = new Class186(72, 7);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIB)Z")
	public static boolean method4121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4123(@OriginalArg(1) String arg0) {
		if (Static527.aStringArray34 == null) {
			Static545.method5919();
		}
		Static183.aCalendar1.setTime(new Date(Static626.method8479()));
		@Pc(22) int local22 = Static183.aCalendar1.get(11);
		@Pc(26) int local26 = Static183.aCalendar1.get(12);
		@Pc(30) int local30 = Static183.aCalendar1.get(13);
		@Pc(64) String local64 = Integer.toString(local22 / 10) + local22 % 10 + ":" + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
		@Pc(69) String[] local69 = Static349.method5051('\n', arg0);
		for (@Pc(79) int local79 = 0; local79 < local69.length; local79++) {
			for (@Pc(83) int local83 = Static159.anInt2951; local83 > 0; local83--) {
				Static527.aStringArray34[local83] = Static527.aStringArray34[local83 - 1];
			}
			Static527.aStringArray34[0] = local64 + ": " + local69[local79];
			if (Static699.aFileOutputStream1 != null) {
				try {
					Static699.aFileOutputStream1.write(Static312.method4703(Static527.aStringArray34[0] + "\n"));
				} catch (@Pc(141) IOException local141) {
				}
			}
			if (Static527.aStringArray34.length - 1 > Static159.anInt2951) {
				Static159.anInt2951++;
				if (Static112.anInt2245 > 0) {
					Static112.anInt2245++;
				}
			}
		}
	}
}
