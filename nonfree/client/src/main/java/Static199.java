import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	public static int anInt4344;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1989 = Static187.method3089("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1992 = Static187.method3089("Select a world");

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1990 = aClass92_1992;

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1991 = Static187.method3089("Hidden)2");

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	public static int anInt4342 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIII)Lclient!vd;")
	public static Class92 method3291(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1) {
		@Pc(26) int local26 = 1;
		for (@Pc(30) int local30 = arg1 / 10; local30 != 0; local30 /= 10) {
			local26++;
		}
		@Pc(41) int local41 = local26;
		if (arg1 < 0 || arg0) {
			local41 = local26 + 1;
		}
		@Pc(49) byte[] local49 = new byte[local41];
		if (arg1 < 0) {
			local49[0] = 45;
		} else if (arg0) {
			local49[0] = 43;
		}
		for (@Pc(73) int local73 = 0; local73 < local26; local73++) {
			@Pc(79) int local79 = arg1 % 10;
			arg1 /= 10;
			if (local79 < 0) {
				local79 = -local79;
			}
			if (local79 > 9) {
				local79 += 39;
			}
			local49[local41 - local73 - 1] = (byte) (local79 + 48);
		}
		@Pc(117) Class92 local117 = new Class92();
		local117.aByteArray52 = local49;
		local117.anInt4244 = local41;
		return local117;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(JI)V")
	public static void method3292(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static188.method3365(arg0 - 1L);
			Static188.method3365(1L);
		} else {
			Static188.method3365(arg0);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BJ)Lclient!vd;")
	public static Class92 method3293(@OriginalArg(1) long arg0) {
		Static56.aCalendar1.setTime(new Date(arg0));
		@Pc(17) int local17 = Static56.aCalendar1.get(7);
		@Pc(25) int local25 = Static56.aCalendar1.get(5);
		@Pc(29) int local29 = Static56.aCalendar1.get(2);
		@Pc(33) int local33 = Static56.aCalendar1.get(1);
		@Pc(37) int local37 = Static56.aCalendar1.get(11);
		@Pc(41) int local41 = Static56.aCalendar1.get(12);
		@Pc(45) int local45 = Static56.aCalendar1.get(13);
		return Static208.method787(new Class92[] { Static136.aClass92Array19[local17 - 1], Static85.aClass92_781, Static49.method872(local25 / 10), Static49.method872(local25 % 10), Static101.aClass92_965, Static65.aClass92Array8[local29], Static101.aClass92_965, Static49.method872(local33), Static48.aClass92_518, Static49.method872(local37 / 10), Static49.method872(local37 % 10), Static176.aClass92_1808, Static49.method872(local41 / 10), Static49.method872(local41 % 10), Static176.aClass92_1808, Static49.method872(local45 / 10), Static49.method872(local45 % 10), Static94.aClass92_874 });
	}
}
