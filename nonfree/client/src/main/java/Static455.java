import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!rt;")
	public static Class324 aClass324_11;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "Lclient!gga;")
	public static Class124 aClass124_100;

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "Lclient!in;")
	public static final Class169 aClass169_196 = new Class169(59, 0);

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "Lclient!in;")
	public static final Class169 aClass169_197 = new Class169(21, 28);

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method7295(@OriginalArg(1) String arg0) {
		if (Static244.aStringArray82 == null) {
			Static233.method4207();
		}
		Static633.aCalendar3.setTime(new Date(Static99.method1701()));
		@Pc(18) int local18 = Static633.aCalendar3.get(11);
		@Pc(22) int local22 = Static633.aCalendar3.get(12);
		@Pc(26) int local26 = Static633.aCalendar3.get(13);
		@Pc(60) String local60 = Integer.toString(local18 / 10) + local18 % 10 + ":" + local22 / 10 + local22 % 10 + ":" + local26 / 10 + local26 % 10;
		@Pc(65) String[] local65 = Static184.method3569('\n', arg0);
		for (@Pc(67) int local67 = 0; local67 < local65.length; local67++) {
			for (@Pc(70) int local70 = Static491.anInt8810; local70 > 0; local70--) {
				Static244.aStringArray82[local70] = Static244.aStringArray82[local70 - 1];
			}
			Static244.aStringArray82[0] = local60 + ": " + local65[local67];
			if (Static587.aFileOutputStream1 != null) {
				try {
					Static587.aFileOutputStream1.write(Static278.method4686(Static244.aStringArray82[0] + "\n"));
				} catch (@Pc(115) IOException local115) {
				}
			}
			if (Static491.anInt8810 < Static244.aStringArray82.length - 1) {
				if (Static211.anInt4367 > 0) {
					Static211.anInt4367++;
				}
				Static491.anInt8810++;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BB)Z")
	public static boolean method7299(@OriginalArg(0) byte arg0) {
		@Pc(12) int local12 = arg0 & 0xFF;
		if (local12 == 0) {
			return false;
		} else {
			return local12 < 128 || local12 >= 160 || Static506.aCharArray7[local12 - 128] != '\u0000';
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!fja;)V")
	public static void method7300(@OriginalArg(1) Class2_Sub26 arg0) {
		if (arg0.aClass2_Sub44_6 != null) {
			arg0.aClass2_Sub44_6.anInt10348 = 0;
		}
		arg0.aBoolean805 = false;
		for (@Pc(22) Class2_Sub26 local22 = arg0.method9761(); local22 != null; local22 = arg0.method9758()) {
			method7300(local22);
		}
	}
}
