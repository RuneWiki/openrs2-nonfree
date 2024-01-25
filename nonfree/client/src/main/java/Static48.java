import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "J")
	public static long aLong191 = 0L;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method6729(@OriginalArg(1) long arg0) {
		Static256.aCalendar2.setTime(new Date(arg0));
		@Pc(18) int local18 = Static256.aCalendar2.get(7);
		@Pc(22) int local22 = Static256.aCalendar2.get(5);
		@Pc(26) int local26 = Static256.aCalendar2.get(2);
		@Pc(30) int local30 = Static256.aCalendar2.get(1);
		@Pc(34) int local34 = Static256.aCalendar2.get(11);
		@Pc(38) int local38 = Static256.aCalendar2.get(12);
		@Pc(42) int local42 = Static256.aCalendar2.get(13);
		return Static264.aStringArray37[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static100.aStringArray14[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I")
	public static int method6731(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!fu;IB)Lclient!qr;")
	public static Class270 method6733(@OriginalArg(0) Class11_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class270 local14;
		if (Static434.aClass270_3 == null) {
			local14 = new Class270();
		} else {
			local14 = Static434.aClass270_3;
			Static434.aClass270_3 = Static434.aClass270_3.aClass270_2;
			local14.aClass270_2 = null;
			Static467.anInt8609--;
		}
		local14.aClass11_Sub1_2 = arg0;
		local14.anInt7849 = arg1;
		return local14;
	}
}
