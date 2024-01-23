import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "[Lclient!fj;")
	public static Class7[] aClass7Array3;

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "Lclient!kb;")
	public static Class83 aClass83_143;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "[I")
	public static int[] anIntArray480 = new int[128];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
	public static void method3787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static191.anInt4244 < 100) {
			Static148.method2781();
		}
		if (Static296.aBoolean335) {
			Static288.method4714(arg3, arg2, arg1 + arg3, arg2 - -arg0);
		} else {
			Static203.method3590(arg3, arg2, arg1 + arg3, arg0 + arg2);
		}
		@Pc(47) int local47;
		@Pc(61) int local61;
		if (Static191.anInt4244 < 100) {
			local47 = arg3 + arg1 / 2;
			local61 = arg2 + arg0 / 2 - 38;
			if (Static296.aBoolean335) {
				Static288.method4713(arg3, arg2, arg1, arg0, 0);
				Static288.method4709(local47 - 152, local61, 304, 34, 9179409);
				Static288.method4709(local47 - 151, local61 + 1, 302, 32, 0);
				Static288.method4713(local47 - 150, local61 + 2, Static191.anInt4244 * 3, 30, 9179409);
				Static288.method4713(local47 + Static191.anInt4244 * 3 - 150, local61 + 2, 300 - Static191.anInt4244 * 3, 30, 0);
			} else {
				Static203.method3592(arg3, arg2, arg1, arg0, 0);
				Static203.method3598(local47 - 152, local61, 304, 34, 9179409);
				Static203.method3598(local47 - 151, local61 + 1, 302, 32, 0);
				Static203.method3592(local47 - 150, local61 + 2, Static191.anInt4244 * 3, 30, 9179409);
				Static203.method3592(local47 + Static191.anInt4244 * 3 - 150, local61 - -2, 300 - Static191.anInt4244 * 3, 30, 0);
			}
			Static156.aClass1_Sub2_Sub16_3.method3972(Static252.aString177, local47, local61 + 20, 16777215, -1);
			return;
		}
		Static33.anInt856 = (int) ((float) (arg0 * 2) / Static241.aFloat173);
		Static268.anInt5802 = Static87.anInt2033 - (int) ((float) arg1 / Static241.aFloat173);
		Static242.anInt5304 = Static88.anInt2053 - (int) ((float) arg0 / Static241.aFloat173);
		Static205.anInt4561 = (int) ((float) (arg1 * 2) / Static241.aFloat173);
		@Pc(229) int local229 = Static87.anInt2033 - (int) ((float) arg1 / Static241.aFloat173);
		local47 = Static88.anInt2053 - (int) ((float) arg0 / Static241.aFloat173);
		@Pc(246) int local246 = Static88.anInt2053 + (int) ((float) arg0 / Static241.aFloat173);
		local61 = (int) ((float) arg1 / Static241.aFloat173) + Static87.anInt2033;
		if (Static296.aBoolean335) {
			if (Static131.aClass1_Sub2_Sub14_Sub1_2 == null || arg1 != Static131.aClass1_Sub2_Sub14_Sub1_2.anInt3438 || arg0 != Static131.aClass1_Sub2_Sub14_Sub1_2.anInt3430) {
				Static131.aClass1_Sub2_Sub14_Sub1_2 = null;
				Static131.aClass1_Sub2_Sub14_Sub1_2 = new Class1_Sub2_Sub14_Sub1(arg1, arg0);
			}
			Static203.method3591(Static131.aClass1_Sub2_Sub14_Sub1_2.anIntArray294, arg1, arg0);
			Static3.method72(local61, 0, local246, arg1, arg0, local229, 0, local47);
			Static266.method4506(local246, 0, local61, local229, Static251.aBoolean291, arg0, local47, 0, arg1);
			Static102.method1688(arg0, local47, 0, local229, local246, 0, arg1, local61);
			Static131.aClass1_Sub2_Sub14_Sub1_2.method2481();
			Static288.method4719(Static131.aClass1_Sub2_Sub14_Sub1_2.anIntArray294, arg3, arg2, arg1, arg0);
			Static203.anIntArray460 = null;
		} else {
			Static3.method72(local61, arg2, local246, arg3 + arg1, arg0 + arg2, local229, arg3, local47);
			Static266.method4506(local246, arg3, local61, local229, Static251.aBoolean291, arg2 + arg0, local47, arg2, arg1 + arg3);
			Static102.method1688(arg2 + arg0, local47, arg2, local229, local246, arg3, arg1 + arg3, local61);
		}
		if (Static180.anInt4067 > 0) {
			Static94.anInt6155--;
			if (Static94.anInt6155 == 0) {
				Static180.anInt4067--;
				Static94.anInt6155 = 20;
			}
		}
		if (!Static167.aBoolean196) {
			return;
		}
		@Pc(407) int local407 = arg3 + arg1 - 5;
		@Pc(414) int local414 = arg2 + arg0 - 8;
		Static58.aClass1_Sub2_Sub16_2.method3980("Fps:" + Static181.anInt4085, local407, local414, 16776960, -1);
		@Pc(430) Runtime local430 = Runtime.getRuntime();
		@Pc(440) int local440 = (int) ((local430.totalMemory() - local430.freeMemory()) / 1024L);
		@Pc(442) int local442 = 16776960;
		if (local440 > 65536) {
			local442 = 16711680;
		}
		local414 -= 15;
		Static58.aClass1_Sub2_Sub16_2.method3980("Mem:" + local440 + "k", local407, local414, local442, -1);
		local414 -= 15;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method3788() {
		for (@Pc(19) Class1_Sub2_Sub22 local19 = (Class1_Sub2_Sub22) Static244.aClass131_24.method3791(); local19 != null; local19 = (Class1_Sub2_Sub22) Static244.aClass131_24.method3792()) {
			@Pc(24) Class25_Sub6 local24 = local19.aClass25_Sub6_1;
			if (Static145.anInt3477 != local24.anInt5979 || local24.aBoolean319) {
				local19.method4742();
			} else if (local24.anInt5982 <= Static32.anInt809) {
				local24.method4648(Static112.anInt2417);
				if (local24.aBoolean319) {
					local19.method4742();
				} else {
					Static227.method3944(local24.anInt5979, local24.anInt5992, local24.anInt5996, local24.anInt5983, 60, local24, 0, -1L, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
	public static void method3790() {
		Static84.aClass117_6 = new Class117(32);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)I")
	public static int method3796(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = Static151.anIntArray324[Static195.method3494(arg2, arg1)];
		if (arg0 > 0) {
			@Pc(22) int local22 = Static151.anInterface2_1.method4417(arg0 & 0xFFFF);
			@Pc(42) int local42;
			@Pc(64) int local64;
			if (local22 != 0) {
				if (arg1 < 0) {
					local42 = 0;
				} else if (arg1 <= 127) {
					local42 = arg1 * 131586;
				} else {
					local42 = 16777215;
				}
				if (local22 == 256) {
					local11 = local42;
				} else {
					local64 = 256 - local22;
					local11 = ((local42 & 0xFF00FF) * local22 + local64 * (local11 & 0xFF00FF) & 0xFF00FF00) + (local64 * (local11 & 0xFF00) + (local42 & 0xFF00) * local22 & 0xFF0000) >> 8;
				}
			}
			local42 = Static151.anInterface2_1.method4415(arg0 & 0xFFFF);
			if (local42 != 0) {
				local42 += 256;
				local64 = local42 * (local11 >> 8 & 0xFF);
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(127) int local127 = (local11 & 0xFF) * local42;
				@Pc(135) int local135 = (local11 >> 16 & 0xFF) * local42;
				if (local127 > 65535) {
					local127 = 65535;
				}
				if (local135 > 65535) {
					local135 = 65535;
				}
				local11 = (local127 >> 8) + (local64 & 0xFF00) + ((local135 & 0xF600FF00) << 8);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "([IJIZ)Ljava/lang/String;")
	public static String method3797(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (Static157.anInterface4_1 != null) {
			@Pc(18) String local18 = Static157.anInterface4_1.method4728(arg1, arg0, arg2);
			if (local18 != null) {
				return local18;
			}
		}
		return Long.toString(arg1);
	}
}
