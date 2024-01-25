import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	public static int anInt7691;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_262 = new Class288(62, 4);

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	public static int anInt7692 = 0;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!bfa;")
	public static final Class30 aClass30_5 = new Class30();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method6496(@OriginalArg(0) Class95 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static319.aBoolean356) {
			local7 = Static274.method3801();
			local9 = Static69.method966();
		}
		@Pc(21) int local21 = local7 + Static46.anInt975;
		@Pc(26) int local26 = Static139.anInt2567 + local9;
		@Pc(28) int local28 = Static408.anInt6345;
		@Pc(32) int local32 = Static467.anInt7465 - 3;
		Static575.method7865(arg0, Static467.anInt7465, local7 + Static46.anInt975, Static434.aClass271_24.method5972(Static483.anInt7694), Static408.anInt6345, Static139.anInt2567 + local9);
		@Pc(57) int local57 = local7 + Static507.aClass335_1.method7811();
		@Pc(63) int local63 = Static507.aClass335_1.method7821() + local9;
		@Pc(67) int local67;
		@Pc(72) Class2_Sub2_Sub12 local72;
		@Pc(84) int local84;
		@Pc(189) int local189;
		@Pc(262) Class2_Sub2_Sub11 local262;
		@Pc(176) Class2_Sub2_Sub11 local176;
		if (Static187.aBoolean234) {
			local67 = 0;
			for (local72 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1573(); local72 != null; local72 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1568()) {
				local84 = local67 * 16 + local26 + 20 + 13;
				if (local7 + Static46.anInt975 < local57 && Static408.anInt6345 + local7 + Static46.anInt975 > local57 && local63 > local84 - 13 && local63 < local84 + 4 && (local72.anInt4924 > 1 || ((Class2_Sub2_Sub11) local72.aClass75_9.aClass2_Sub2_26.aClass2_Sub2_67).aBoolean300)) {
					arg0.aa(local7 + Static46.anInt975, local84 + -12, Static408.anInt6345, 16, 255 - Static544.anInt9304 << 24 | Static309.anInt4983, 1);
				}
				local67++;
			}
			if (Static446.aClass2_Sub2_Sub12_2 != null) {
				local67 = 0;
				Static575.method7865(arg0, Static104.anInt1917, Static621.anInt9974, Static446.aClass2_Sub2_Sub12_2.aString52, Static351.anInt5494, Static346.anInt5444);
				for (local176 = (Class2_Sub2_Sub11) Static446.aClass2_Sub2_Sub12_2.aClass75_9.method1573(); local176 != null; local176 = (Class2_Sub2_Sub11) Static446.aClass2_Sub2_Sub12_2.aClass75_9.method1568()) {
					local189 = local67 * 16 + Static346.anInt5444 + 33;
					local67++;
					if (Static621.anInt9974 < local57 && local57 < Static621.anInt9974 + Static351.anInt5494 && local189 - 13 < local63 && local189 + 4 > local63 && local176.aBoolean300) {
						arg0.aa(Static621.anInt9974, local189 - 12, Static351.anInt5494, 16, Static309.anInt4983 | 255 - Static544.anInt9304 << 24, 1);
					}
				}
				Static265.method3732(Static104.anInt1917, Static346.anInt5444, Static351.anInt5494, Static621.anInt9974, arg0);
			}
		} else {
			local67 = 0;
			for (local262 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2325(); local262 != null; local262 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2318()) {
				local84 = local26 + (Static474.anInt7600 + -1 + -local67) * 16 + 33;
				local67++;
				if (Static46.anInt975 + local7 < local57 && local57 < Static46.anInt975 + local7 + Static408.anInt6345 && local84 - 13 < local63 && local63 < local84 + 4 && local262.aBoolean300) {
					arg0.aa(Static46.anInt975 + local7, local84 + -12, Static408.anInt6345, 16, Static309.anInt4983 | 255 - Static544.anInt9304 << 24, 1);
				}
			}
		}
		Static265.method3732(Static467.anInt7465, local9 + Static139.anInt2567, Static408.anInt6345, Static46.anInt975 + local7, arg0);
		if (Static187.aBoolean234) {
			local67 = 0;
			for (local72 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1573(); local72 != null; local72 = (Class2_Sub2_Sub12) Static453.aClass75_10.method1568()) {
				local84 = local67 * 16 + local9 + Static139.anInt2567 + 13 + 20;
				if (local72.anInt4924 == 1) {
					Static636.method8571(local84, Static46.anInt975 + local7, Static565.anInt9214 | 0xFF000000, Static408.anInt6345, local9 + Static139.anInt2567, (Class2_Sub2_Sub11) local72.aClass75_9.aClass2_Sub2_26.aClass2_Sub2_67, Static467.anInt7465, arg0, Static413.anInt6426 | 0xFF000000, local57, local63);
				} else {
					Static242.method3398(Static46.anInt975 + local7, local9 + Static139.anInt2567, Static408.anInt6345, Static467.anInt7465, local63, local57, Static565.anInt9214 | 0xFF000000, Static413.anInt6426 | 0xFF000000, arg0, local72, local84);
				}
				local67++;
			}
			if (Static446.aClass2_Sub2_Sub12_2 != null) {
				local67 = 0;
				for (local176 = (Class2_Sub2_Sub11) Static446.aClass2_Sub2_Sub12_2.aClass75_9.method1573(); local176 != null; local176 = (Class2_Sub2_Sub11) Static446.aClass2_Sub2_Sub12_2.aClass75_9.method1568()) {
					local189 = Static346.anInt5444 + local67 * 16 + 13 + 20;
					Static636.method8571(local189, Static621.anInt9974, Static565.anInt9214 | 0xFF000000, Static351.anInt5494, Static346.anInt5444, local176, Static104.anInt1917, arg0, Static413.anInt6426 | 0xFF000000, local57, local63);
					local67++;
				}
				Static594.method8048(Static346.anInt5444, Static621.anInt9974, Static104.anInt1917, Static351.anInt5494);
			}
		} else {
			local67 = 0;
			for (local262 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2325(); local262 != null; local262 = (Class2_Sub2_Sub11) Static115.aClass109_11.method2318()) {
				local84 = (Static474.anInt7600 - local67 - 1) * 16 + local26 + 13 + 20;
				Static636.method8571(local84, local21, Static565.anInt9214 | 0xFF000000, local28, local26, local262, local32, arg0, Static413.anInt6426 | 0xFF000000, local57, local63);
				local67++;
			}
		}
		Static594.method8048(Static139.anInt2567 + local9, local7 + Static46.anInt975, Static467.anInt7465, Static408.anInt6345);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BII)Z")
	public static boolean method6499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}
}
