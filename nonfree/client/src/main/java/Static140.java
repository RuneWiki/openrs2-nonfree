import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!eia", name = "f", descriptor = "I")
	public static int anInt2267 = -2;

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "J")
	public static long aLong64 = 0L;

	@OriginalMember(owner = "client!eia", name = "j", descriptor = "Lclient!eba;")
	public static final Class98 aClass98_4 = new Class98();

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(JI)V")
	public static void method1963(@OriginalArg(0) long arg0) {
		Static242.aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Lclient!cn;I)V")
	public static void method1964(@OriginalArg(0) Class73 arg0) {
		if (arg0.anInt1391 == 5 && arg0.anInt1419 != -1) {
			Static217.method3112(Static457.aClass57_11, arg0);
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(III)V")
	public static void method1965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class5_Sub5_Sub6 local18 = Static478.method6972((long) arg1, 1);
		local18.method2687();
		local18.anInt3058 = arg0;
	}
}
