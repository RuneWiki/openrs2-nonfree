import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "I")
	public static int anInt1109;

	@OriginalMember(owner = "client!bia", name = "f", descriptor = "Lclient!pt;")
	public static Interface23 anInterface23_1;

	@OriginalMember(owner = "client!bia", name = "c", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_23 = new Class44(50, -2);

	@OriginalMember(owner = "client!bia", name = "e", descriptor = "Lclient!saa;")
	public static final Class310 aClass310_1 = new Class310(5, 1);

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)Z")
	public static boolean method951(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class203 local8 = Static511.aClass13_2.method86(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method5013(arg0);
	}

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IB)V")
	public static void method953(@OriginalArg(0) int arg0) {
		Static494.anInt8821 = 2;
		Static652.anInt10896 = arg0;
		Static2.method22(Static521.aString85.equals(""), true, "", Static521.aString85);
	}
}
