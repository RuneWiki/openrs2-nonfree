import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static379 {

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar19 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar20 = Calendar.getInstance();

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
	public static final int anInt6059 = -1;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_142 = new Class180(76, -1);

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;I)I")
	public static int method5470(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg0.length();
		@Pc(16) int local16 = arg1.length();
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local18 - local22 < local13 || local20 - local24 < local16) {
			if (local13 <= local18 - local22) {
				return -1;
			}
			if (local16 <= local20 - local24) {
				return 1;
			}
			@Pc(64) char local64;
			if (local22 == '\u0000') {
				local64 = arg0.charAt(local18++);
			} else {
				local64 = local22;
			}
			@Pc(83) char local83;
			if (local24 == '\u0000') {
				local83 = arg1.charAt(local20++);
			} else {
				local83 = local24;
			}
			local22 = Static390.method9300(local64);
			local24 = Static390.method9300(local83);
			local64 = Static371.method5393(local64, arg2);
			local83 = Static371.method5393(local83, arg2);
			if (local64 != local83 && Character.toUpperCase(local64) != Character.toUpperCase(local83)) {
				local64 = Character.toLowerCase(local64);
				local83 = Character.toLowerCase(local83);
				if (local83 != local64) {
					return Static524.method7314(local64, arg2) - Static524.method7314(local83, arg2);
				}
			}
		}
		@Pc(147) int local147 = Math.min(local13, local16);
		for (@Pc(149) int local149 = 0; local149 < local147; local149++) {
			if (arg2 == 2) {
				local18 = local13 - local149 - 1;
				local20 = local16 - local149 - 1;
			} else {
				local20 = local149;
				local18 = local149;
			}
			@Pc(180) char local180 = arg0.charAt(local18);
			@Pc(184) char local184 = arg1.charAt(local20);
			if (local180 != local184 && Character.toUpperCase(local180) != Character.toUpperCase(local184)) {
				local180 = Character.toLowerCase(local180);
				local184 = Character.toLowerCase(local184);
				if (local184 != local180) {
					return Static524.method7314(local180, arg2) - Static524.method7314(local184, arg2);
				}
			}
		}
		@Pc(220) int local220 = local13 - local16;
		if (local220 != 0) {
			return local220;
		}
		for (@Pc(226) int local226 = 0; local226 < local147; local226++) {
			@Pc(232) char local232 = arg0.charAt(local226);
			@Pc(236) char local236 = arg1.charAt(local226);
			if (local232 != local236) {
				return Static524.method7314(local232, arg2) - Static524.method7314(local236, arg2);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5472(@OriginalArg(1) String arg0) {
		return Static76.method1426(arg0, ou.class);
	}
}
