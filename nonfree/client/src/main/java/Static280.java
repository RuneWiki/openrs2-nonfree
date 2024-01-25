import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "Lclient!kaa;")
	public static Class203 aClass203_2;

	@OriginalMember(owner = "client!ija", name = "d", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ija", name = "j", descriptor = "[I")
	public static final int[] anIntArray333 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!ija", name = "h", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance();

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(BZLjava/lang/String;ZLclient!br;)V")
	public static void method3947(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class47 arg3) {
		Static521.method6990(arg1, arg2, arg3, arg0, "openjs");
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(III)V")
	public static void method3948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub7_Sub21 local9 = Static136.method2378((long) arg0, 17);
		local9.method9256();
		local9.anInt10899 = arg1;
	}

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "(III)Z")
	public static boolean method3949(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static145.method2457(arg0, arg1) & (Static47.method1236(arg0, arg1) | (arg0 & 0x2000) != 0 | Static317.method4644(arg0, arg1));
	}

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "(B)Z")
	public static boolean method3951() {
		try {
			@Pc(7) Class233 local7 = new Class233();
			@Pc(12) byte[] local12 = local7.method5134(Static635.aByteArray93);
			Static271.method3836(local12);
			return true;
		} catch (@Pc(25) Exception local25) {
			return false;
		}
	}
}
