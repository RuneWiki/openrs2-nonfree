import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	public static int anInt5701;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Lclient!ss;")
	public static final Class326 aClass326_4 = new Class326();

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V")
	public static void method5200(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static593.anInt9541 == 2) {
				Static569.aClass383Array1[0].method9127(Static324.aClass148Array1[0]);
				Static569.aClass383Array1[1].method9127(Static324.aClass148Array1[1]);
			} else if (Static593.anInt9541 == 3) {
				Static569.aClass383Array1[0].method9127(Static324.aClass148Array1[0]);
				Static569.aClass383Array1[1].method9127(Static324.aClass148Array1[1]);
				Static569.aClass383Array1[2].method9127(Static324.aClass148Array1[2]);
			} else {
				Static569.aClass383Array1[0].method9127(Static324.aClass148Array1[0]);
				Static569.aClass383Array1[1].method9127(Static324.aClass148Array1[1]);
				Static569.aClass383Array1[2].method9127(Static324.aClass148Array1[2]);
				Static569.aClass383Array1[3].method9127(Static324.aClass148Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static593.anInt9541 == 2) {
				Static569.aClass383Array1[0].method9127(Static324.aClass148Array1[2]);
			} else if (Static593.anInt9541 == 3) {
				Static569.aClass383Array1[0].method9127(Static324.aClass148Array1[3]);
				Static569.aClass383Array1[1].method9127(Static324.aClass148Array1[4]);
			} else {
				Static569.aClass383Array1[0].method9127(Static324.aClass148Array1[4]);
				Static569.aClass383Array1[1].method9127(Static324.aClass148Array1[5]);
				Static569.aClass383Array1[2].method9127(Static324.aClass148Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static593.anInt9541 == 2) {
				Static569.aClass383Array1[0].method9127(Static324.aClass148Array1[3]);
				return;
			}
			if (Static593.anInt9541 == 3) {
				Static569.aClass383Array1[0].method9127(Static324.aClass148Array1[5]);
				return;
			}
			Static569.aClass383Array1[0].method9127(Static324.aClass148Array1[7]);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5201(@OriginalArg(0) long arg0) {
		Static99.aCalendar32.setTime(new Date(arg0));
		@Pc(13) int local13 = Static99.aCalendar32.get(7);
		@Pc(17) int local17 = Static99.aCalendar32.get(5);
		@Pc(21) int local21 = Static99.aCalendar32.get(2);
		@Pc(30) int local30 = Static99.aCalendar32.get(1);
		@Pc(34) int local34 = Static99.aCalendar32.get(11);
		@Pc(38) int local38 = Static99.aCalendar32.get(12);
		@Pc(42) int local42 = Static99.aCalendar32.get(13);
		return Static673.aStringArray43[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static583.aStringArray28[local21] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
