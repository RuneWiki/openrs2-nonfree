import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "Lclient!mp;")
	public static final Class222 aClass222_23 = new Class222(64);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)V")
	public static void method5470(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub5_Sub10 local8 = Static594.method8175(arg0, 1);
		local8.method4387();
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIILjava/lang/String;Lclient!ha;I)V")
	public static void method5477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3, @OriginalArg(6) Class87 arg4, @OriginalArg(7) int arg5) {
		if (Static267.aClass20_32 == null || Static345.aClass20_28 == null) {
			if (Static594.aClass97_144.method2564(Static582.anInt9557) && Static594.aClass97_144.method2564(Static263.anInt5130)) {
				Static267.aClass20_32 = arg4.method7969(Static647.method3070(Static594.aClass97_144, Static582.anInt9557, 0), true);
				@Pc(46) Class120 local46 = Static647.method3070(Static594.aClass97_144, Static263.anInt5130, 0);
				Static345.aClass20_28 = arg4.method7969(local46, true);
				local46.method3072();
				Static71.aClass20_2 = arg4.method7969(local46, true);
			} else {
				arg4.aa(arg1, arg5, arg0, 20, 255 - Static299.anInt5575 << 24 | Static597.anInt9841, 1);
			}
		}
		if (Static267.aClass20_32 != null && Static345.aClass20_28 != null) {
			@Pc(73) int local73 = (arg0 - Static345.aClass20_28.method4579() * 2) / Static267.aClass20_32.method4579();
			for (@Pc(75) int local75 = 0; local75 < local73; local75++) {
				Static267.aClass20_32.method4582(arg1 + Static345.aClass20_28.method4579() + Static267.aClass20_32.method4579() * local75, arg5);
			}
			Static345.aClass20_28.method4582(arg1, arg5);
			Static71.aClass20_2.method4582(arg1 + arg0 - Static71.aClass20_2.method4579(), arg5);
		}
		Static4.aClass64_1.method7508(arg5 + 14, arg3, -1, arg1 + 3, Static82.anInt1752 | 0xFF000000);
		arg4.aa(arg1, arg5 + 20, arg0, arg2 - 20, Static597.anInt9841 | -Static299.anInt5575 + 255 << 24, 1);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "()V")
	public static void method5478() {
		Static17.method426(Static330.anInt4381);
	}
}
