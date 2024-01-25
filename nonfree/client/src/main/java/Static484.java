import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!qea", name = "g", descriptor = "Lclient!wb;")
	public static Class382 aClass382_4;

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_162 = new Class151(126, 2);

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(JJ)J")
	public static long method6621(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 ^ arg1;
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZZI)I")
	public static int method6624(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class4_Sub54 local15 = Static473.method6525(arg2, arg1);
		if (local15 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local15.anIntArray721.length; local29++) {
				if (local15.anIntArray723[local29] == arg0) {
					local27 += local15.anIntArray721[local29];
				}
			}
			return local27;
		}
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method6626(@OriginalArg(1) long arg0) {
		Static109.aCalendar5.setTime(new Date(arg0));
		@Pc(13) int local13 = Static109.aCalendar5.get(7);
		@Pc(17) int local17 = Static109.aCalendar5.get(5);
		@Pc(21) int local21 = Static109.aCalendar5.get(2);
		@Pc(25) int local25 = Static109.aCalendar5.get(1);
		@Pc(34) int local34 = Static109.aCalendar5.get(11);
		@Pc(38) int local38 = Static109.aCalendar5.get(12);
		@Pc(42) int local42 = Static109.aCalendar5.get(13);
		return Static4.aStringArray1[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static595.aStringArray46[local21] + "-" + local25 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
