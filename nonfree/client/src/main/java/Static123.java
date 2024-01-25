import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	public static int anInt2736;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Z")
	public static boolean aBoolean212 = false;

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "Lclient!dn;")
	public static final Class56 aClass56_4 = new Class56("LOCAL", 4);

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
	public static final int[] anIntArray250 = new int[14];

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)Lclient!rc;")
	public static Class8_Sub7 method2164() {
		@Pc(10) Class8_Sub7 local10 = (Class8_Sub7) Static258.aClass112_5.method2544();
		if (local10 == null) {
			return new Class8_Sub7();
		} else {
			Static252.anInt4750--;
			return local10;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(DI)V")
	public static void method2166(@OriginalArg(0) double arg0) {
		if (Static130.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static235.anIntArray520[local7] = local19 <= 255 ? local19 : 255;
		}
		Static130.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2169(@OriginalArg(1) long arg0) {
		Static423.aCalendar42.setTime(new Date(arg0));
		@Pc(13) int local13 = Static423.aCalendar42.get(7);
		@Pc(17) int local17 = Static423.aCalendar42.get(5);
		@Pc(21) int local21 = Static423.aCalendar42.get(2);
		@Pc(25) int local25 = Static423.aCalendar42.get(1);
		@Pc(35) int local35 = Static423.aCalendar42.get(11);
		@Pc(39) int local39 = Static423.aCalendar42.get(12);
		@Pc(43) int local43 = Static423.aCalendar42.get(13);
		return Static346.aStringArray43[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static393.aStringArray46[local21] + "-" + local25 + " " + local35 / 10 + local35 % 10 + ":" + local39 / 10 + local39 % 10 + ":" + local43 / 10 + local43 % 10 + " GMT";
	}
}
