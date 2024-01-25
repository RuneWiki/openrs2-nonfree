import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!g;")
	public static Class124 aClass124_7;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar10 = Calendar.getInstance();

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar11 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!m;")
	public static final Class235 aClass235_34 = new Class235(40);

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString95 = "";

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZII)Lclient!tn;")
	public static Class3_Sub51 method5223(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(22) long local22 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub51) Static238.aClass136_22.method3503(local22);
	}
}
