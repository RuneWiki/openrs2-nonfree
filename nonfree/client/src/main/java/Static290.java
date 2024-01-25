import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!sq", name = "xb", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!sq", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString224 = "Loading interfaces - ";

	@OriginalMember(owner = "client!sq", name = "ab", descriptor = "I")
	public static int anInt5612 = 0;

	@OriginalMember(owner = "client!sq", name = "eb", descriptor = "I")
	public static int anInt5616 = 0;

	@OriginalMember(owner = "client!sq", name = "fb", descriptor = "[I")
	public static final int[] anIntArray709 = new int[14];

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	public static void method4939() {
		for (@Pc(7) int local7 = 0; local7 < Static236.anInt4635; local7++) {
			@Pc(13) Class43 local13 = Static143.method2719(local7);
			if (local13 != null && local13.anInt1417 == 0) {
				Static49.anIntArray126[local7] = 0;
				Static197.anIntArray793[local7] = 0;
			}
		}
		Static318.aClass26_28 = new Class26(128);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4940(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg0); local9 != -1; local9 = arg1.indexOf(arg0, local9 + arg2.length())) {
			arg1 = arg1.substring(0, local9) + arg2 + arg1.substring(local9 + arg0.length());
		}
		return arg1;
	}

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method4943() {
		@Pc(5) String local5 = "www";
		if (Static123.anInt2380 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(22) String local22 = "";
		if (Static119.aString76 != null) {
			local22 = "/p=" + Static119.aString76;
		}
		return Static341.anInt2259 == 1 ? "http://" + local5 + ".stellardawn.com/l=" + Static257.anInt5015 + "/a=" + Static61.anInt1330 + local22 + "/" : "http://" + local5 + ".runescape.com/l=" + Static257.anInt5015 + "/a=" + Static61.anInt1330 + local22 + "/";
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!sr;Lclient!qj;B)V")
	public static void method4944(@OriginalArg(0) Interface7 arg0, @OriginalArg(1) Class165 arg1) {
		Static172.anInterface7_8 = arg0;
		Static234.aClass165_71 = arg1;
	}
}
