import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
	public static int anInt9663;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)I")
	public static int method8275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(19) int local19;
		if (arg1 > arg0) {
			local19 = arg0;
			arg0 = arg1;
			arg1 = local19;
		}
		while (arg1 != 0) {
			local19 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local19;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)V")
	public static void method8276() {
		@Pc(5) int local5;
		if (Static394.aClass337Array5 != null) {
			for (local5 = 0; local5 < Static57.anInt865; local5++) {
				Static394.aClass337Array5[local5] = null;
			}
			Static394.aClass337Array5 = null;
		}
		if (Static292.aClass337Array4 != null) {
			for (local5 = 0; local5 < Static372.anInt8186; local5++) {
				Static292.aClass337Array4[local5] = null;
			}
			Static292.aClass337Array4 = null;
		}
		if (Static265.aClass337Array3 != null) {
			for (local5 = 0; local5 < Static603.anInt10076; local5++) {
				Static265.aClass337Array3[local5] = null;
			}
			Static265.aClass337Array3 = null;
		}
		Static114.anInt1831 = -1;
		Static5.anInt9541 = -1;
		Static128.aClass337Array6 = null;
		Static422.anIntArrayArrayArray17 = null;
		Static58.anIntArray45 = null;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method8278(@OriginalArg(0) long arg0) {
		Static464.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static464.aCalendar3.get(7);
		@Pc(17) int local17 = Static464.aCalendar3.get(5);
		@Pc(29) int local29 = Static464.aCalendar3.get(2);
		@Pc(33) int local33 = Static464.aCalendar3.get(1);
		@Pc(37) int local37 = Static464.aCalendar3.get(11);
		@Pc(41) int local41 = Static464.aCalendar3.get(12);
		@Pc(45) int local45 = Static464.aCalendar3.get(13);
		return Static85.aStringArray8[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static410.aStringArray48[local29] + "-" + local33 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}
}
