import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "Lclient!lc;")
	public static Class98 aClass98_35;

	@OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
	public static int anInt1189;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "Lclient!lc;")
	public static Class98 aClass98_36;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!eg", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString33 = "glow2:";

	@OriginalMember(owner = "client!eg", name = "r", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!eg", name = "s", descriptor = "Z")
	public static boolean aBoolean91 = false;

	@OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
	public static int anInt1188 = -1;

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString34 = "Loading fonts - ";

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;B)J")
	public static long method967(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = arg0.length();
		@Pc(16) long local16 = 0L;
		for (@Pc(18) int local18 = 0; local18 < local4; local18++) {
			local16 = (local16 << 5) - (local16 - (long) arg0.charAt(local18));
		}
		return local16;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(JB)V")
	public static void method968(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static142.aClass4_Sub17_Sub1_3.method1905(184);
			Static142.aClass4_Sub17_Sub1_3.method1891(arg0);
		}
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
	public static void method969() {
		aClass98_35 = null;
		aCalendar2 = null;
		aString34 = null;
		aCalendar1 = null;
		aClass98_36 = null;
		aString33 = null;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
	public static void method970(@OriginalArg(0) int arg0) {
		Static96.anInt2064 = arg0;
		Static299.anInt5561 = -1;
		Static299.anInt5561 = -1;
		Static249.method3769();
	}
}
