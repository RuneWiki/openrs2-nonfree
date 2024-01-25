import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public static int anInt8345;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Lclient!bt;")
	public static Class34 aClass34_108;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public static void method7210() {
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub3_2, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub3_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub16_2, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub16_1, 1);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub24_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub25_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub6_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub17_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub5_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub19_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub8_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub2_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub1_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub12_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub27_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub27_2, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub14_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub26_1, 0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub29_1, 0);
		Static112.method2124();
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub18_1, 2);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub23_1, 1);
		Static544.method7261();
		Static568.method7522();
		Static70.aBoolean93 = true;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(20) int local20;
		if (Static583.method7687(arg6)) {
			local20 = 0;
			@Pc(39) int local39 = 0;
			@Pc(41) int local41 = 0;
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = 0;
			if (Static423.aBoolean517) {
				local41 = Static98.anInt2026;
				local20 = Static171.anInt3034;
				local39 = Static296.anInt4682;
				local45 = Static554.anInt8294;
				local43 = Static215.anInt3475;
				Static554.anInt8294 = 1;
			}
			if (Static269.aClass199ArrayArray1[arg6] == null) {
				Static470.method6502(arg4, Static392.aClass199ArrayArray2[arg6], arg0, arg5, arg2, arg3, -1, arg4 < 0, arg1, arg7);
			} else {
				Static470.method6502(arg4, Static269.aClass199ArrayArray1[arg6], arg0, arg5, arg2, arg3, -1, ~arg4 > -1, arg1, arg7);
			}
			if (Static423.aBoolean517) {
				if (arg4 >= 0 && Static554.anInt8294 == 2) {
					Static100.method2025(Static296.anInt4682, Static98.anInt2026, Static171.anInt3034, Static215.anInt3475);
				}
				Static296.anInt4682 = local39;
				Static215.anInt3475 = local43;
				Static171.anInt3034 = local20;
				Static98.anInt2026 = local41;
				Static554.anInt8294 = local45;
			}
		} else if (arg4 == -1) {
			for (local20 = 0; local20 < 100; local20++) {
				Static109.aBooleanArray4[local20] = true;
			}
		} else {
			Static109.aBooleanArray4[arg4] = true;
		}
	}
}
