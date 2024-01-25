import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "[Lclient!f;")
	public static Class76[] aClass76Array12;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_6 = new Class180(12, 14);

	@OriginalMember(owner = "client!fn", name = "i", descriptor = "J")
	public static long aLong68 = -1L;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "Lclient!sl;")
	public static final Class222 aClass222_3 = new Class222("", 13);

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIILclient!cr;)V")
	public static void method1746(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class41 arg2) {
		if (Static428.aBoolean637) {
			@Pc(174) Class47 local174 = Static21.anInt432 == -1 ? null : Static150.aClass43_1.method1210(Static21.anInt432);
			if (Static56.method1112(arg2).method1593() && (Static248.anInt4731 & 0x20) != 0 && (local174 == null || arg2.method1185(local174.anInt1781, Static21.anInt432) != local174.anInt1781)) {
				Static333.method4738(arg2.anInt1671, Static179.aString56 + " -> " + arg2.aString13, true, arg2.anInt1613, 46, Static174.aString23, Static445.anInt7767, 0L, arg2.anInt1683, false);
			}
			return;
		}
		@Pc(12) String local12;
		for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
			local12 = Static19.method267(local5, arg2);
			if (local12 != null) {
				Static333.method4738(arg2.anInt1671, arg2.aString13, true, arg2.anInt1613, 1007, local12, Static421.method5715(arg2, local5), (long) (local5 + 1), arg2.anInt1683, false);
			}
		}
		local12 = Static382.method5307(arg2);
		if (local12 != null) {
			Static333.method4738(arg2.anInt1671, arg2.aString13, true, arg2.anInt1613, 3, local12, arg2.anInt1661, 0L, arg2.anInt1683, false);
		}
		for (@Pc(73) int local73 = 4; local73 >= 0; local73--) {
			@Pc(80) String local80 = Static19.method267(local73, arg2);
			if (local80 != null) {
				Static333.method4738(arg2.anInt1671, arg2.aString13, true, arg2.anInt1613, 12, local80, Static421.method5715(arg2, local73), (long) (local73 + 1), arg2.anInt1683, false);
			}
		}
		if (!Static56.method1112(arg2).method1591()) {
			return;
		}
		if (arg2.aString9 == null) {
			Static333.method4738(arg2.anInt1671, "", true, arg2.anInt1613, 58, Static255.aClass256_90.method5720(Static272.anInt7537), -1, 0L, arg2.anInt1683, false);
		} else {
			Static333.method4738(arg2.anInt1671, "", true, arg2.anInt1613, 58, arg2.aString9, -1, 0L, arg2.anInt1683, false);
		}
	}
}
