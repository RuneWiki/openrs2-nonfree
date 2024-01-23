import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23 = null;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray24 = new String[200];

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "[Lclient!ej;")
	public static Class45[] aClass45Array1 = new Class45[50];

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)V")
	public static void method2559() {
		Static259.aClass98_43.method2565(5);
		Static201.aClass98_32.method2565(5);
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)V")
	public static void method2561(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub4_Sub7 local10 = Static34.method528(arg0, 12);
		local10.method970();
	}
}
