import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_10 = new Class336(11, 4);

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_95 = new Class180(97, 3);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method4022() {
		Static500.aClass83_37.method2374();
		Static320.aClass83_42.method2374();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public static void method4023() {
		Static374.aClass165_40.method4403();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4024(@OriginalArg(1) String arg0) {
		if (Static605.aStringArray33 == null) {
			Static662.method9143();
		}
		Static99.aCalendar32.setTime(new Date(Static524.method7320()));
		@Pc(20) int local20 = Static99.aCalendar32.get(11);
		@Pc(24) int local24 = Static99.aCalendar32.get(12);
		@Pc(28) int local28 = Static99.aCalendar32.get(13);
		@Pc(62) String local62 = Integer.toString(local20 / 10) + local20 % 10 + ":" + local24 / 10 + local24 % 10 + ":" + local28 / 10 + local28 % 10;
		@Pc(67) String[] local67 = Static644.method8957(arg0, '\n');
		for (@Pc(74) int local74 = 0; local74 < local67.length; local74++) {
			for (@Pc(78) int local78 = Static643.anInt10191; local78 > 0; local78--) {
				Static605.aStringArray33[local78] = Static605.aStringArray33[local78 - 1];
			}
			Static605.aStringArray33[0] = local62 + ": " + local67[local74];
			if (Static354.aFileOutputStream1 != null) {
				try {
					Static354.aFileOutputStream1.write(Static128.method2418(Static605.aStringArray33[0] + "\n"));
				} catch (@Pc(124) IOException local124) {
				}
			}
			if (Static605.aStringArray33.length - 1 > Static643.anInt10191) {
				if (Static449.anInt7419 > 0) {
					Static449.anInt7419++;
				}
				Static643.anInt10191++;
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Z")
	public static boolean method4026() {
		return Static379.method5472("jaclib") ? Static379.method5472("hw3d") : false;
	}
}
