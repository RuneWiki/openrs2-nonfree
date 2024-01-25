import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "[I")
	public static int[] anIntArray514;

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
	public static int anInt5636 = 0;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(III)I")
	public static int method5018(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 << 13 ^ local14;
		@Pc(34) int local34 = local20 * (local20 * local20 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)V")
	public static void method5019(@OriginalArg(0) int arg0) {
		@Pc(16) Class14_Sub2_Sub13 local16 = Static1.method5711(8, arg0);
		local16.method3539();
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIZ)V")
	public static void method5021(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static218.aClass46_5 = Static65.method5095(Static220.anInterface2_4, Static105.aClass15_2, Static95.aCanvas2, Static217.anInt4358 * 2, arg1);
		} else {
			if (arg0) {
				Static218.aClass46_5 = Static65.method5095(Static220.anInterface2_4, Static105.aClass15_2, Static95.aCanvas2, 0, 0);
				Static218.aClass46_5.method5100(0);
				@Pc(24) Class76 local24 = Static307.method2744(Static97.anInt2234, Static332.aClass143_111);
				@Pc(33) Class30 local33 = Static218.aClass46_5.method5093(local24, Static368.method5805(Static348.aClass143_98, Static97.anInt2234));
				Static162.method3226(Static84.aString78, true, local33);
				Static218.aClass46_5.method5118();
				Static102.method2261();
				Static218.aClass46_5.method5158();
			}
			try {
				Static218.aClass46_5 = Static65.method5095(Static220.anInterface2_4, Static105.aClass15_2, Static95.aCanvas2, Static217.anInt4358 * 2, arg1);
			} catch (@Pc(57) Throwable local57) {
				arg1 = 0;
				Static218.aClass46_5 = Static65.method5095(Static220.anInterface2_4, Static105.aClass15_2, Static95.aCanvas2, 0, 0);
			}
		}
		if (Static218.aClass46_5.method5155()) {
			@Pc(86) Class14_Sub20 local86 = Static218.aClass46_5.method5141();
			Static218.aClass46_5.method5096(local86);
		}
		Static67.anInt1615 = arg1;
		Static247.method4309();
		if (!Static218.aClass46_5.method5162()) {
			Static202.anInt4074 = 1;
		}
		Static218.aClass46_5.method5171(Static202.anInt4074);
		Static218.aClass46_5.method5132(0);
		Static197.aClass51_3 = Static218.aClass46_5.method5185();
		Static74.aClass51_4 = Static218.aClass46_5.method5185();
		@Pc(116) int local116 = (int) ((double) Static195.anInt3965 * 34.46D);
		if (Static218.aClass46_5.method5106()) {
			local116 += 128;
		}
		Static218.aClass46_5.method5111(50, local116);
		Static218.aClass46_5.method5128(!Static53.aBoolean87);
		if (Static218.aClass46_5.method5154()) {
			Static131.method1800(Static32.aBoolean39);
		}
		Static198.aBoolean250 = !Static96.method2208();
		Static258.method4432(Static218.aClass46_5, Static195.anInt3965 >> 3, Static298.anInt5716 >> 3);
		Static159.method3098();
		Static251.aBoolean207 = false;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIZIIIIII)Z")
	public static boolean method5022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg7 + arg5 && arg4 + arg0 > arg7) {
			return arg3 + arg6 > arg2 && arg3 < arg2 + arg1;
		} else {
			return false;
		}
	}
}
