import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!rs", name = "v", descriptor = "I")
	public static int anInt5812;

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
	public static int anInt5805 = -1;

	@OriginalMember(owner = "client!rs", name = "s", descriptor = "Lclient!sf;")
	public static final Class180 aClass180_40 = new Class180();

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
	public static void method4855() {
		@Pc(1) Class107 local1 = Static197.aClass107_22;
		synchronized (Static197.aClass107_22) {
			Static197.aClass107_22.method3012();
		}
		local1 = Static257.aClass107_35;
		synchronized (Static257.aClass107_35) {
			Static257.aClass107_35.method3012();
		}
		local1 = Static338.aClass107_54;
		synchronized (Static338.aClass107_54) {
			Static338.aClass107_54.method3012();
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(IILclient!fh;I)V")
	public static void method4859(@OriginalArg(1) int arg0, @OriginalArg(2) Class68 arg1, @OriginalArg(3) int arg2) {
		if (Static60.aBoolean109) {
			if (!Static46.method890(arg1).method5645() || (Static7.anInt142 & 0x20) == 0) {
				return;
			}
			Static104.method2071(arg1.anInt1857, 9, arg1.anInt1851, false, Static295.aString63, Static228.aString46 + " -> " + arg1.aString23, Static333.anInt6459, 0L, true);
			return;
		}
		@Pc(20) String local20;
		for (@Pc(13) int local13 = 9; local13 >= 5; local13--) {
			local20 = Static10.method151(arg1, local13);
			if (local20 != null) {
				Static104.method2071(arg1.anInt1857, 1006, arg1.anInt1851, false, local20, arg1.aString23, Static321.method1017(arg1, local13), (long) (local13 + 1), true);
			}
		}
		local20 = Static227.method4208(arg1);
		if (local20 != null) {
			Static104.method2071(arg1.anInt1857, 25, arg1.anInt1851, false, local20, arg1.aString23, arg1.anInt1908, 0L, true);
		}
		for (@Pc(77) int local77 = 4; local77 >= 0; local77--) {
			@Pc(84) String local84 = Static10.method151(arg1, local77);
			if (local84 != null) {
				Static104.method2071(arg1.anInt1857, 60, arg1.anInt1851, false, local84, arg1.aString23, Static321.method1017(arg1, local77), (long) (local77 + 1), true);
			}
		}
		if (!Static46.method890(arg1).method5638()) {
			return;
		}
		if (arg1.aString24 != null) {
			Static104.method2071(arg1.anInt1857, 21, arg1.anInt1851, false, arg1.aString24, "", -1, 0L, true);
			return;
		}
		Static104.method2071(arg1.anInt1857, 21, arg1.anInt1851, false, Static236.aClass140_21.method4155(Static239.anInt2803), "", -1, 0L, true);
		return;
	}
}
