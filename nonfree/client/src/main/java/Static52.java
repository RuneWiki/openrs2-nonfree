import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!br", name = "s", descriptor = "[[[Lclient!lha;")
	public static Class186[][][] aClass186ArrayArrayArray2;

	@OriginalMember(owner = "client!br", name = "l", descriptor = "I")
	public static int anInt1780 = 503;

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IBI)V")
	public static void method1636(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static181.anInt3980 = arg1 - Static491.anInt7783;
		Static315.anInt6316 = arg0 - Static491.anInt7785;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(ILclient!mv;Lclient!da;ZLclient!ha;Ljava/lang/String;)V")
	public static void method1637(@OriginalArg(1) Class213 arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) String arg4) {
		@Pc(12) boolean local12 = !Static112.aBoolean841 || Static586.method4065();
		if (!local12) {
			return;
		}
		@Pc(26) int local26;
		@Pc(35) int local35;
		if (Static112.aBoolean841 && local12) {
			@Pc(135) Class213 local135 = Static228.aClass213_8;
			@Pc(141) Class34 local141 = arg3.method6167(local135, Static108.aClass331Array1);
			local26 = local135.method5827(250, arg4, (Class4[]) null);
			local35 = local135.method5829((Class4[]) null, 250, local135.anInt6975, arg4);
			@Pc(160) int local160 = Static411.aClass331_2.anInt9650;
			@Pc(164) int local164 = local160 + 4;
			local35 += local164 * 2;
			local26 += local164 * 2;
			if (local35 < Static290.anInt5993) {
				local35 = Static290.anInt5993;
			}
			if (local26 < Static324.anInt6419) {
				local26 = Static324.anInt6419;
			}
			@Pc(202) int local202 = Static289.aClass79_24.method2610(Static182.anInt4018, local26) + Static30.anInt816;
			@Pc(210) int local210 = Static370.aClass127_13.method3682(local35, anInt1780) + Static601.anInt10190;
			if (Static238.aBoolean425) {
				local202 += Static352.method5739();
				local210 += Static573.method7997();
			}
			arg3.method6121(Static594.aClass331_3, false).method7691(Static229.aClass331_1.anInt9650 + local202, local210 + Static229.aClass331_1.anInt9648, local26 - Static229.aClass331_1.anInt9650 * 2, -(Static229.aClass331_1.anInt9648 * 2) + local35, 1, 0, 0);
			arg3.method6121(Static229.aClass331_1, true).method7698(local202, local210);
			Static229.aClass331_1.method7898();
			arg3.method6121(Static229.aClass331_1, true).method7698(local26 + local202 - local160, local210);
			Static229.aClass331_1.method7889();
			arg3.method6121(Static229.aClass331_1, true).method7698(local202 + local26 - local160, local35 + (local210 - local160));
			Static229.aClass331_1.method7898();
			arg3.method6121(Static229.aClass331_1, true).method7698(local202, local210 + local35 - local160);
			Static229.aClass331_1.method7889();
			arg3.method6121(Static411.aClass331_2, true).method7701(local202, local210 + Static229.aClass331_1.anInt9648, local160, local35 - Static229.aClass331_1.anInt9648 * 2);
			Static411.aClass331_2.method7894();
			arg3.method6121(Static411.aClass331_2, true).method7701(local202 + Static229.aClass331_1.anInt9650, local210, local26 - Static229.aClass331_1.anInt9650 * 2, local160);
			Static411.aClass331_2.method7894();
			arg3.method6121(Static411.aClass331_2, true).method7701(local26 + local202 - local160, Static229.aClass331_1.anInt9648 + local210, local160, local35 - Static229.aClass331_1.anInt9648 * 2);
			Static411.aClass331_2.method7894();
			arg3.method6121(Static411.aClass331_2, true).method7701(Static229.aClass331_1.anInt9650 + local202, local35 + (local210 - local160), local26 - Static229.aClass331_1.anInt9650 * 2, local160);
			Static411.aClass331_2.method7894();
			local141.method8595(local164 + local202, (Class4[]) null, local26 - local164 * 2, arg4, 0, -1, (Class1) null, 1, Static91.anInt2687 | 0xFF000000, (int[]) null, 0, 0, 1, local210 + local164, -(local164 * 2) + local35);
			Static413.method6488(local35, local26, local202, local210);
		} else {
			local26 = arg0.method5827(250, arg4, (Class4[]) null);
			local35 = arg0.method5826(250, arg4, (Class4[]) null) * 13;
			arg3.aa(6, 6, local26 + 4 + 4, local35 + 8, -16777216, 0);
			arg3.method6142(6, 6, local26 + 4 + 4, local35 + 4 - -4, -1, 0);
			arg1.method8595(10, (Class4[]) null, local26, arg4, 0, -1, (Class1) null, 1, -1, (int[]) null, 0, 0, 1, 10, local35);
			Static413.method6488(local35 + 4 + 4, local26 - -8, 6, 6);
		}
		if (!arg2) {
			return;
		}
		try {
			if (Static238.aBoolean425) {
				Static10.method499();
			} else {
				arg3.method6117();
			}
		} catch (@Pc(454) Exception_Sub1 local454) {
		}
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(IIB)Z")
	public static boolean method1638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
