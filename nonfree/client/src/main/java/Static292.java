import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public static int anInt5232;

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray27 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V")
	public static void method4410() {
		if (Static488.aClass67_12 == null) {
			return;
		}
		if (Static178.aBoolean264) {
			Static168.method8925();
		}
		Static424.aClass88_1.method2241();
		Static362.method7254();
		Static82.method1060();
		Static247.method3755();
		Static583.method8028(-28905);
		Static486.method7077();
		Static194.method2929();
		Static299.method5787();
		Static602.method8290();
		Static110.method1959();
		Static650.method8735(false);
		for (@Pc(40) int local40 = 0; local40 < 2048; local40++) {
			@Pc(46) Class19_Sub1_Sub3_Sub2_Sub2 local46 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local40];
			if (local46 != null) {
				for (@Pc(50) int local50 = 0; local50 < local46.aClass157Array3.length; local50++) {
					local46.aClass157Array3[local50] = null;
				}
			}
		}
		for (@Pc(77) int local77 = 0; local77 < Static32.anInt518; local77++) {
			@Pc(84) Class19_Sub1_Sub3_Sub2_Sub1 local84 = Static95.aClass3_Sub13Array1[local77].aClass19_Sub1_Sub3_Sub2_Sub1_2;
			if (local84 != null) {
				for (@Pc(88) int local88 = 0; local88 < local84.aClass157Array3.length; local88++) {
					local84.aClass157Array3[local88] = null;
				}
			}
		}
		Static377.aClass181_7 = null;
		Static122.aClass181_12 = null;
		Static488.aClass67_12.method7681();
		Static488.aClass67_12 = null;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method4411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) int local22;
		if (Static255.method3996(arg2)) {
			local22 = 0;
			@Pc(45) int local45 = 0;
			@Pc(54) int local54 = 0;
			@Pc(56) int local56 = 0;
			@Pc(58) int local58 = 0;
			if (Static178.aBoolean264) {
				local56 = Static80.anInt1246;
				local45 = Static489.anInt8463;
				local22 = Static584.anInt9538;
				local54 = Static176.anInt3170;
				local58 = Static405.anInt7239;
				Static405.anInt7239 = 1;
			}
			if (Static280.aClass20ArrayArray1[arg2] == null) {
				Static130.method2166(arg3, Static403.aClass20ArrayArray2[arg2], arg1, arg6 < 0, arg6, arg5, -1, arg7, arg0, arg4);
			} else {
				Static130.method2166(arg3, Static280.aClass20ArrayArray1[arg2], arg1, arg6 < 0, arg6, arg5, -1, arg7, arg0, arg4);
			}
			if (Static178.aBoolean264) {
				if (arg6 >= 0 && Static405.anInt7239 == 2) {
					Static30.method402(Static489.anInt8463, Static176.anInt3170, Static584.anInt9538, Static80.anInt1246);
				}
				Static176.anInt3170 = local54;
				Static489.anInt8463 = local45;
				Static584.anInt9538 = local22;
				Static405.anInt7239 = local58;
				Static80.anInt1246 = local56;
			}
		} else if (arg6 == -1) {
			for (local22 = 0; local22 < 100; local22++) {
				Static195.aBooleanArray17[local22] = true;
			}
		} else {
			Static195.aBooleanArray17[arg6] = true;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)Z")
	public static boolean method4412(@OriginalArg(1) int arg0) {
		if (arg0 == 52 || arg0 == 53 || arg0 == 51 || arg0 == 4 || arg0 == 60 || arg0 == 1001) {
			return true;
		} else {
			return arg0 == 16;
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4413(@OriginalArg(0) String arg0) {
		if (!Static212.aBoolean297 || (Static718.anInt11231 & 0x18) == 0) {
			return;
		}
		@Pc(20) boolean local20 = false;
		@Pc(22) int local22 = Static558.anInt9284;
		@Pc(24) int[] local24 = Static408.anIntArray393;
		for (@Pc(26) int local26 = 0; local26 < local22; local26++) {
			@Pc(41) Class19_Sub1_Sub3_Sub2_Sub2 local41 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local24[local26]];
			if (local41.aString109 != null && local41.aString109.equalsIgnoreCase(arg0) && (local41 == Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 && (Static718.anInt11231 & 0x10) != 0 || (Static718.anInt11231 & 0x8) != 0)) {
				@Pc(81) Class3_Sub48 local81 = Static89.method1200(Static484.aClass286_80, Static532.aClass400_3.aClass399_2);
				local81.aClass3_Sub28_Sub2_1.method5309(Static397.anInt7112);
				local81.aClass3_Sub28_Sub2_1.method5282(Static575.anInt9446);
				local81.aClass3_Sub28_Sub2_1.method5284(0);
				local81.aClass3_Sub28_Sub2_1.method5282(Static198.anInt3491);
				local81.aClass3_Sub28_Sub2_1.method5313(local24[local26]);
				Static532.aClass400_3.method9223(local81);
				local20 = true;
				Static372.method5394(true, 0, local41.lb[0], local41.anIntArray430[0], 0, -2, local41.method6592(), local41.method6592());
				break;
			}
		}
		if (!local20) {
			Static332.method4975(Static476.aClass279_21.method6992(Static141.anInt2658) + arg0);
		}
		if (Static212.aBoolean297) {
			Static427.method6535();
		}
	}
}
