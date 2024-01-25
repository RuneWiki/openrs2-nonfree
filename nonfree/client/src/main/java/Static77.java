import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
	public static int anInt1689 = 0;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZIIIIIIIILclient!jn;I)Z")
	public static boolean method1459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class179 arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg2;
		@Pc(7) int local7 = arg9;
		@Pc(16) int local16 = arg2 - 64;
		@Pc(21) int local21 = arg9 - 64;
		Static559.anIntArrayArray88[64][64] = 99;
		Static597.anIntArrayArray96[64][64] = 0;
		@Pc(40) byte local40 = 0;
		Static369.anIntArray441[0] = arg2;
		@Pc(46) int local46 = 0;
		@Pc(49) int local49 = local40 + 1;
		Static423.anIntArray719[0] = arg9;
		@Pc(54) int[][] local54 = arg8.anIntArrayArray44;
		while (local49 != local46) {
			local5 = Static369.anIntArray441[local46];
			local7 = Static423.anIntArray719[local46];
			@Pc(68) int local68 = local5 - local16;
			@Pc(72) int local72 = local7 - local21;
			local46 = local46 + 1 & 0xFFF;
			@Pc(84) int local84 = local5 - arg8.anInt5187;
			@Pc(90) int local90 = local7 - arg8.anInt5199;
			if (arg6 == -4) {
				if (local5 == arg5 && local7 == arg3) {
					Static540.anInt9014 = local5;
					Static590.anInt9764 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static299.method4661(arg4, arg7, local7, 2, local5, arg5, 2, arg3)) {
					Static590.anInt9764 = local7;
					Static540.anInt9014 = local5;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg8.method4345(arg3, arg4, local7, 2, local5, arg5, arg7, 2, arg1)) {
					Static590.anInt9764 = local7;
					Static540.anInt9014 = local5;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg8.method4339(local5, local7, arg1, 2, arg5, arg4, arg3, arg7)) {
					Static590.anInt9764 = local7;
					Static540.anInt9014 = local5;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg8.method4353(arg3, local7, arg6, arg0, 2, arg5, local5)) {
					Static590.anInt9764 = local7;
					Static540.anInt9014 = local5;
					return true;
				}
			} else if (arg8.method4346(2, arg3, arg0, local5, arg6, arg5, local7)) {
				Static590.anInt9764 = local7;
				Static540.anInt9014 = local5;
				return true;
			}
			@Pc(247) int local247 = Static597.anIntArrayArray96[local68][local72] + 1;
			if (local68 > 0 && Static559.anIntArrayArray88[local68 - 1][local72] == 0 && (local54[local84 - 1][local90] & 0x43A40000) == 0 && (local54[local84 - 1][local90 + 1] & 0x4E240000) == 0) {
				Static369.anIntArray441[local49] = local5 - 1;
				Static423.anIntArray719[local49] = local7;
				local49 = local49 + 1 & 0xFFF;
				Static559.anIntArrayArray88[local68 - 1][local72] = 2;
				Static597.anIntArrayArray96[local68 - 1][local72] = local247;
			}
			if (local68 < 126 && Static559.anIntArrayArray88[local68 + 1][local72] == 0 && (local54[local84 + 2][local90] & 0x60E40000) == 0 && (local54[local84 + 2][local90 + 1] & 0x78240000) == 0) {
				Static369.anIntArray441[local49] = local5 + 1;
				Static423.anIntArray719[local49] = local7;
				Static559.anIntArrayArray88[local68 + 1][local72] = 8;
				local49 = local49 + 1 & 0xFFF;
				Static597.anIntArrayArray96[local68 + 1][local72] = local247;
			}
			if (local72 > 0 && Static559.anIntArrayArray88[local68][local72 - 1] == 0 && (local54[local84][local90 - 1] & 0x43A40000) == 0 && (local54[local84 + 1][local90 - 1] & 0x60E40000) == 0) {
				Static369.anIntArray441[local49] = local5;
				Static423.anIntArray719[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static559.anIntArrayArray88[local68][local72 - 1] = 1;
				Static597.anIntArrayArray96[local68][local72 - 1] = local247;
			}
			if (local72 < 126 && Static559.anIntArrayArray88[local68][local72 + 1] == 0 && (local54[local84][local90 + 2] & 0x4E240000) == 0 && (local54[local84 + 1][local90 + 2] & 0x78240000) == 0) {
				Static369.anIntArray441[local49] = local5;
				Static423.anIntArray719[local49] = local7 + 1;
				Static559.anIntArrayArray88[local68][local72 + 1] = 4;
				local49 = local49 + 1 & 0xFFF;
				Static597.anIntArrayArray96[local68][local72 + 1] = local247;
			}
			if (local68 > 0 && local72 > 0 && Static559.anIntArrayArray88[local68 - 1][local72 - 1] == 0 && (local54[local84 - 1][local90] & 0x4FA40000) == 0 && (local54[local84 - 1][local90 - 1] & 0x43A40000) == 0 && (local54[local84][local90 - 1] & 0x63E40000) == 0) {
				Static369.anIntArray441[local49] = local5 - 1;
				Static423.anIntArray719[local49] = local7 - 1;
				Static559.anIntArrayArray88[local68 - 1][local72 - 1] = 3;
				local49 = local49 + 1 & 0xFFF;
				Static597.anIntArrayArray96[local68 - 1][local72 - 1] = local247;
			}
			if (local68 < 126 && local72 > 0 && Static559.anIntArrayArray88[local68 + 1][local72 - 1] == 0 && (local54[local84 + 1][local90 - 1] & 0x63E40000) == 0 && (local54[local84 + 2][local90 - 1] & 0x60E40000) == 0 && (local54[local84 + 2][local90] & 0x78E40000) == 0) {
				Static369.anIntArray441[local49] = local5 + 1;
				Static423.anIntArray719[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static559.anIntArrayArray88[local68 + 1][local72 - 1] = 9;
				Static597.anIntArrayArray96[local68 + 1][local72 - 1] = local247;
			}
			if (local68 > 0 && local72 < 126 && Static559.anIntArrayArray88[local68 - 1][local72 + 1] == 0 && (local54[local84 - 1][local90 + 1] & 0x4FA40000) == 0 && (local54[local84 - 1][local90 + 2] & 0x4E240000) == 0 && (local54[local84][local90 + 2] & 0x7E240000) == 0) {
				Static369.anIntArray441[local49] = local5 - 1;
				Static423.anIntArray719[local49] = local7 + 1;
				Static559.anIntArrayArray88[local68 - 1][local72 + 1] = 6;
				local49 = local49 + 1 & 0xFFF;
				Static597.anIntArrayArray96[local68 - 1][local72 + 1] = local247;
			}
			if (local68 < 126 && local72 < 126 && Static559.anIntArrayArray88[local68 + 1][local72 + 1] == 0 && (local54[local84 + 1][local90 + 2] & 0x7E240000) == 0 && (local54[local84 + 2][local90 + 2] & 0x78240000) == 0 && (local54[local84 + 2][local90 + 1] & 0x78E40000) == 0) {
				Static369.anIntArray441[local49] = local5 + 1;
				Static423.anIntArray719[local49] = local7 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static559.anIntArrayArray88[local68 + 1][local72 + 1] = 12;
				Static597.anIntArrayArray96[local68 + 1][local72 + 1] = local247;
			}
		}
		Static540.anInt9014 = local5;
		Static590.anInt9764 = local7;
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([BI)[B")
	public static byte[] method1460(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub34 local8 = new Class2_Sub34(arg0);
		@Pc(28) int local28 = local8.method6904();
		@Pc(32) int local32 = local8.method6865();
		if (local32 < 0 || Static507.anInt8550 != 0 && Static507.anInt8550 < local32) {
			throw new RuntimeException();
		} else if (local28 == 0) {
			@Pc(113) byte[] local113 = new byte[local32];
			local8.method6891(local113, local32, 0);
			return local113;
		} else {
			@Pc(59) int local59 = local8.method6865();
			if (local59 < 0 || Static507.anInt8550 != 0 && Static507.anInt8550 < local59) {
				throw new RuntimeException();
			}
			@Pc(80) byte[] local80 = new byte[local59];
			if (local28 == 1) {
				Static434.method6489(local80, local59, arg0, local32);
			} else {
				@Pc(95) Class284 local95 = Static412.aClass284_1;
				synchronized (Static412.aClass284_1) {
					Static412.aClass284_1.method6785(local8, local80);
				}
			}
			return local80;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	public static void method1461() {
		if (Static473.aClass39_4 != null) {
			Static473.aClass39_4.method2885();
		}
		if (Static262.aClass39_2 != null) {
			Static262.aClass39_2.method2885();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(JI)V")
	public static void method1462(@OriginalArg(0) long arg0) {
		if (Static440.aClass217ArrayArrayArray3 != null) {
			if (Static2.anInt31 == 1 || Static2.anInt31 == 5) {
				Static34.method767(arg0);
			} else if (Static2.anInt31 == 4) {
				Static250.method6956(arg0);
			}
		}
		Static617.method8393((long) Static325.anInt5888, Static600.aClass87_15);
		if (Static387.anInt6978 != -1) {
			Static233.method3886(Static387.anInt6978);
		}
		for (@Pc(44) int local44 = 0; local44 < Static320.anInt5804; local44++) {
			if (Static618.aBooleanArray50[local44]) {
				Static473.aBooleanArray43[local44] = true;
			}
			Static286.aBooleanArray42[local44] = Static618.aBooleanArray50[local44];
			Static618.aBooleanArray50[local44] = false;
		}
		Static507.anInt8545 = Static325.anInt5888;
		Static98.method1679(-1, -1, null);
		Static475.method7387(-1, null, -1);
		if (Static387.anInt6978 != -1) {
			Static320.anInt5804 = 0;
			Static266.method4303();
		}
		Static600.aClass87_15.la();
		Static285.method4492(Static600.aClass87_15);
		@Pc(100) int local100 = Static87.method1561();
		if (local100 == -1) {
			local100 = Static385.anInt6934;
		}
		if (local100 == -1) {
			local100 = Static595.anInt9812;
		}
		Static547.method7772(local100);
		@Pc(126) int local126 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.method2778() << 8;
		Static308.method4724(Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 + local126, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 + local126, Static362.anInt6541);
		Static362.anInt6541 = 0;
	}
}
