import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
	public static int anInt2959;

	@OriginalMember(owner = "client!gga", name = "c", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
	public static int anInt2960;

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)Lclient!d;")
	public static Class1_Sub11 method2386() {
		@Pc(6) Class1_Sub11 local6 = Static458.method6319();
		local6.anInt1432 = 0;
		local6.aClass70_15 = null;
		local6.aClass1_Sub35_Sub2_1 = new Class1_Sub35_Sub2(5000);
		return local6;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method2388(@OriginalArg(1) String arg0) {
		if (Static514.aStringArray35 == null) {
			Static121.method1904();
		}
		Static584.aCalendar2.setTime(new Date(Static413.method5668()));
		@Pc(24) int local24 = Static584.aCalendar2.get(11);
		@Pc(28) int local28 = Static584.aCalendar2.get(12);
		@Pc(32) int local32 = Static584.aCalendar2.get(13);
		@Pc(66) String local66 = Integer.toString(local24 / 10) + local24 % 10 + ":" + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
		@Pc(71) String[] local71 = Static500.method7455('\n', arg0);
		for (@Pc(73) int local73 = 0; local73 < local71.length; local73++) {
			for (@Pc(77) int local77 = Static32.anInt511; local77 > 0; local77--) {
				Static514.aStringArray35[local77] = Static514.aStringArray35[local77 - 1];
			}
			Static514.aStringArray35[0] = local66 + ": " + local71[local73];
			if (Static32.anInt511 < Static514.aStringArray35.length - 1) {
				Static32.anInt511++;
				if (Static156.anInt2829 > 0) {
					Static156.anInt2829++;
				}
			}
		}
	}
}
