import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
	public static int anInt5779 = -1;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
	public static int anInt5780 = 0;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
	public static final int anInt5781 = 1407;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ri;)V")
	public static void method4675(@OriginalArg(1) Class284 arg0) {
		Static596.anInt10329 = arg0.method6333("hitmarks");
		Static481.anInt8355 = arg0.method6333("hitbar_default");
		Static503.anInt8664 = arg0.method6333("timerbar_default");
		Static478.anInt8327 = arg0.method6333("headicons_pk");
		Static596.anInt10324 = arg0.method6333("headicons_prayer");
		Static361.anInt6365 = arg0.method6333("hint_headicons");
		Static490.anInt8424 = arg0.method6333("hint_mapmarkers");
		Static428.anInt7573 = arg0.method6333("mapflag");
		Static507.anInt8781 = arg0.method6333("cross");
		Static478.anInt8315 = arg0.method6333("mapdots");
		Static376.anInt6529 = arg0.method6333("scrollbar");
		Static151.anInt3499 = arg0.method6333("name_icons");
		Static295.anInt5517 = arg0.method6333("floorshadows");
		Static292.anInt5479 = arg0.method6333("compass");
		Static182.anInt3992 = arg0.method6333("otherlevel");
		Static142.anInt3360 = arg0.method6333("hint_mapedge");
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
	public static void method4678() {
		Static289.aBoolean370 = false;
		Static587.method1502(Static89.anInt2311, Static240.anInt4751, Static126.anInt2888, Static111.anInt2680);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < 1 || arg7 < 1 || arg1 > Static345.anInt6228 - 2 || Static535.anInt9341 - 2 < arg7) {
			return;
		}
		@Pc(30) int local30 = arg4;
		if (arg4 < 3 && Static269.method4098(arg1, arg7)) {
			local30 = arg4 + 1;
		}
		if (!Static348.aClass3_Sub51_Sub1_5.method7837(Static37.anInt1122) && !Static321.method4740(arg7, Static286.anInt5361, local30, arg1)) {
			return;
		}
		if (Static189.aClass333ArrayArrayArray1 == null) {
			return;
		}
		Static591.aClass268_Sub1_2.method6300(arg5, Static319.aClass31_11, arg7, Static187.aClass220Array1[arg4], arg1, arg4);
		if (arg6 < 0) {
			return;
		}
		@Pc(71) boolean local71 = Static348.aClass3_Sub51_Sub1_5.aBoolean682;
		Static348.aClass3_Sub51_Sub1_5.aBoolean682 = true;
		Static591.aClass268_Sub1_2.method6305(Static187.aClass220Array1[arg4], arg6, arg3, local30, arg1, arg7, Static319.aClass31_11, arg4, arg2, arg0);
		Static348.aClass3_Sub51_Sub1_5.aBoolean682 = local71;
		return;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V")
	public static void method4680() {
		Static495.aStringArray41 = new String[500];
		Static361.anInt6364 = Static318.aClass328_8.anInt9397 + Static318.aClass328_8.anInt9395 + 2;
		Static215.anInt4497 = Static35.aClass328_1.anInt9397 + Static35.aClass328_1.anInt9395 + 2;
		for (@Pc(34) int local34 = 0; local34 < Static495.aStringArray41.length; local34++) {
			Static495.aStringArray41[local34] = "";
		}
		Static196.method3426(Static573.aClass350_5.method7730(Static201.anInt4321));
	}
}
