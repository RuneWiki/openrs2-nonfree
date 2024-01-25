import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!df", name = "w", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(II)Z")
	public static boolean method1996(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)Z")
	public static boolean method1997() {
		if (Static154.aClass3_Sub6_Sub16_2 == null) {
			return false;
		} else {
			if (Static154.aClass3_Sub6_Sub16_2.anInt7069 >= 2000) {
				Static154.aClass3_Sub6_Sub16_2.anInt7069 -= 2000;
			}
			return Static154.aClass3_Sub6_Sub16_2.anInt7069 == 1001;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) int local19;
		if (Static368.method5461(arg6)) {
			local19 = 0;
			@Pc(36) int local36 = 0;
			@Pc(42) int local42 = 0;
			@Pc(44) int local44 = 0;
			@Pc(46) int local46 = 0;
			if (Static649.aBoolean735) {
				local44 = Static628.anInt9742;
				local19 = Static367.anInt6503;
				local36 = Static312.anInt5779;
				local46 = Static215.anInt6265;
				local42 = Static269.anInt5052;
				Static215.anInt6265 = 1;
			}
			if (Static384.aClass208ArrayArray2[arg6] == null) {
				Static61.method1524(arg7 < 0, -1, arg2, arg3, arg7, Static562.aClass208ArrayArray3[arg6], arg4, arg0, arg5, arg1);
			} else {
				Static61.method1524(arg7 < 0, -1, arg2, arg3, arg7, Static384.aClass208ArrayArray2[arg6], arg4, arg0, arg5, arg1);
			}
			if (Static649.aBoolean735) {
				if (arg7 >= 0 && Static215.anInt6265 == 2) {
					Static120.method2177(Static367.anInt6503, Static269.anInt5052, Static312.anInt5779, Static628.anInt9742);
				}
				Static312.anInt5779 = local36;
				Static367.anInt6503 = local19;
				Static269.anInt5052 = local42;
				Static628.anInt9742 = local44;
				Static215.anInt6265 = local46;
			}
		} else if (arg7 == -1) {
			for (local19 = 0; local19 < 100; local19++) {
				Static119.aBooleanArray10[local19] = true;
			}
		} else {
			Static119.aBooleanArray10[arg7] = true;
		}
	}
}
