import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZIIIIIZ)V")
	public static void method7941(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg4 >= arg2) {
			return;
		}
		@Pc(11) int local11 = (arg4 + arg2) / 2;
		@Pc(13) int local13 = arg4;
		@Pc(17) Class139_Sub1 local17 = Static446.aClass139_Sub1Array2[local11];
		Static446.aClass139_Sub1Array2[local11] = Static446.aClass139_Sub1Array2[arg2];
		Static446.aClass139_Sub1Array2[arg2] = local17;
		for (@Pc(29) int local29 = arg4; local29 < arg2; local29++) {
			if (Static556.method7728(arg5, arg1, arg0, Static446.aClass139_Sub1Array2[local29], local17, arg3) <= 0) {
				@Pc(51) Class139_Sub1 local51 = Static446.aClass139_Sub1Array2[local29];
				Static446.aClass139_Sub1Array2[local29] = Static446.aClass139_Sub1Array2[local13];
				Static446.aClass139_Sub1Array2[local13++] = local51;
			}
		}
		Static446.aClass139_Sub1Array2[arg2] = Static446.aClass139_Sub1Array2[local13];
		Static446.aClass139_Sub1Array2[local13] = local17;
		method7941(arg0, arg1, local13 - 1, arg3, arg4, arg5);
		method7941(arg0, arg1, arg2, arg3, local13 + 1, arg5);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)V")
	public static void method7942(@OriginalArg(0) int arg0) {
		Static350.method5308();
		Static105.method1624();
		Static202.method3338(arg0, true);
		Static89.method1374();
		Static462.method6471(Static554.aClass90_12);
		Static517.method7069(Static554.aClass90_12);
		Static346.method5046(Static554.aClass90_12, Static114.aClass248_20);
		Static409.method5886();
		Static498.method6896(Static390.aClass71Array43);
		Static39.method645();
		Static28.method407();
		if (Static375.anInt9162 == 3) {
			Static436.method6188(4);
		} else if (Static375.anInt9162 == 7) {
			Static436.method6188(8);
		} else if (Static375.anInt9162 == 10) {
			Static436.method6188(11);
		} else if (Static375.anInt9162 == 1 || Static375.anInt9162 == 2) {
			Static143.anInterface6_1.method3969();
		}
	}
}
