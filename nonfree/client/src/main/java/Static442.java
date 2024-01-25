import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "Lclient!jh;")
	public static Class170 aClass170_2;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "J")
	public static long aLong339 = 0L;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
	public static int anInt7704 = 0;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	public static void method6337() {
		Static258.aClass361_52 = new Class361();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(BI)Lclient!lg;")
	public static Class201 method6338(@OriginalArg(1) int arg0) {
		@Pc(8) Class201[] local8 = Static354.method5188();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			if (arg0 == local8[local15].anInt5472) {
				return local8[local15];
			}
		}
		return null;
	}
}
