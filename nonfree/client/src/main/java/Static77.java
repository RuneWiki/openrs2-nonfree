import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "Lclient!fd;")
	public static Class3_Sub7 aClass3_Sub7_1;

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Lclient!rh;")
	public static Class12 method1777() {
		try {
			return new Class12_Sub1();
		} catch (@Pc(13) Throwable local13) {
			try {
				return (Class12) Class.forName("Class12_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class12_Sub3();
			}
		}
	}
}
