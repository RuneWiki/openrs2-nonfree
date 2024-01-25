import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!jk", name = "k", descriptor = "Lclient!re;")
	public static final Class175 aClass175_3 = new Class175();

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "Z")
	public static boolean aBoolean224 = false;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method2391(@OriginalArg(0) long arg0) {
		Static290.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static290.aCalendar2.get(7);
		@Pc(17) int local17 = Static290.aCalendar2.get(5);
		@Pc(21) int local21 = Static290.aCalendar2.get(2);
		@Pc(25) int local25 = Static290.aCalendar2.get(1);
		@Pc(34) int local34 = Static290.aCalendar2.get(11);
		@Pc(38) int local38 = Static290.aCalendar2.get(12);
		@Pc(42) int local42 = Static290.aCalendar2.get(13);
		return Static288.aStringArray45[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static153.aStringArray25[local21] + "-" + local25 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
	public static void method2392() {
		if (Static168.anInt3543 != 3) {
			Static232.anInt6331 = -1;
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	public static void method2393() {
		if (!Static89.aBoolean156) {
			return;
		}
		@Pc(11) Class177 local11 = Static323.method5412(Static90.anInt1762, Static99.anInt1953);
		if (local11 != null && local11.anObjectArray16 != null) {
			@Pc(20) Class1_Sub19 local20 = new Class1_Sub19();
			local20.anObjectArray3 = local11.anObjectArray16;
			local20.aClass177_9 = local11;
			Static98.method1797(local20);
		}
		Static177.anInt3670 = -1;
		Static89.aBoolean156 = false;
		Static133.method2517(local11);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2394(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(42) StringBuffer local42 = new StringBuffer(local8 + local10);
		for (@Pc(44) int local44 = 0; local44 < local8; local44++) {
			@Pc(50) char local50 = arg0.charAt(local44);
			if (local50 == '<') {
				local42.append("<lt>");
			} else if (local50 == '>') {
				local42.append("<gt>");
			} else {
				local42.append(local50);
			}
		}
		return local42.toString();
	}
}
