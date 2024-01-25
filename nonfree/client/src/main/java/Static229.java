import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!hka", name = "l", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!hka", name = "C", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_63 = new Class241(82, 7);

	@OriginalMember(owner = "client!hka", name = "y", descriptor = "I")
	public static int anInt4454 = 0;

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(IIII)V")
	public static void method4087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19 = arg0 * Static687.aClass6_Sub44_33.aClass7_Sub13_2.method3338() >> 8;
		if (arg2 == -1 && !Static588.aBoolean698) {
			Static552.method7811();
		} else if (arg2 != -1 && (arg2 != Static478.anInt8119 || !Static107.method2044()) && local19 != 0 && !Static588.aBoolean698) {
			Static206.method3809(local19, arg2, Static209.aClass223_41, arg1);
			Static666.method8844();
		}
		if (Static478.anInt8119 != arg2) {
			Static664.aClass6_Sub17_Sub4_4 = null;
		}
		Static478.anInt8119 = arg2;
	}

	@OriginalMember(owner = "client!hka", name = "a", descriptor = "(Ljava/lang/String;IIILclient!ha;IBI)V")
	public static void method4088(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class75 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static495.aClass49_30 == null || Static334.aClass49_25 == null) {
			if (Static583.aClass223_113.method5285(Static456.anInt7869) && Static583.aClass223_113.method5285(Static57.anInt698)) {
				Static495.aClass49_30 = arg3.method6714(Static691.method1249(Static583.aClass223_113, Static456.anInt7869, 0), true);
				@Pc(34) Class64 local34 = Static691.method1249(Static583.aClass223_113, Static57.anInt698, 0);
				Static334.aClass49_25 = arg3.method6714(local34, true);
				local34.method1240();
				Static426.aClass49_37 = arg3.method6714(local34, true);
			} else {
				arg3.aa(arg4, arg2, arg1, 20, 255 - Static217.anInt4292 << 24 | Static402.anInt6953, 1);
			}
		}
		if (Static495.aClass49_30 != null && Static334.aClass49_25 != null) {
			@Pc(85) int local85 = (arg1 - Static334.aClass49_25.method8988() * 2) / Static495.aClass49_30.method8988();
			for (@Pc(87) int local87 = 0; local87 < local85; local87++) {
				Static495.aClass49_30.method8997(arg4 + Static334.aClass49_25.method8988() + Static495.aClass49_30.method8988() * local87, arg2);
			}
			Static334.aClass49_25.method8997(arg4, arg2);
			Static426.aClass49_37.method8997(arg4 + arg1 - Static426.aClass49_37.method8988(), arg2);
		}
		Static205.aClass67_6.method8294(arg2 + 14, arg0, -1, arg4 + 3, Static92.anInt1369 | 0xFF000000);
		arg3.aa(arg4, arg2 + 20, arg1, arg5 - 20, 255 - Static217.anInt4292 << 24 | Static402.anInt6953, 1);
	}
}
