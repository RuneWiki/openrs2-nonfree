import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
	public static int anInt6117 = 0;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString241 = "Select";

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "Z")
	public static volatile boolean aBoolean506 = true;

	@OriginalMember(owner = "client!ua", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString242 = "Loaded config";

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBI)I")
	public static int method5294(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 + arg1 * 57;
		@Pc(24) int local24 = local18 ^ local18 << 13;
		@Pc(38) int local38 = Integer.MAX_VALUE & (local24 * local24 * 15731 + 789221) * local24 + 1376312589;
		return local38 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public static void method5295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) String arg4) {
		Static110.method1761(null, arg0, arg3, -1, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	public static void method5296() {
		if (Static150.aFloat19 < Static150.aFloat20) {
			Static150.aFloat19 = (float) ((double) Static150.aFloat19 + (double) Static150.aFloat19 / 30.0D);
			if (Static150.aFloat19 > Static150.aFloat20) {
				Static150.aFloat19 = Static150.aFloat20;
			}
			Static173.method3116();
			Static150.anInt2632 = (int) Static150.aFloat19 >> 1;
			Static150.aByteArrayArrayArray6 = Static307.method5321(Static150.anInt2632);
		} else if (Static150.aFloat20 < Static150.aFloat19) {
			Static150.aFloat19 = (float) ((double) Static150.aFloat19 - (double) Static150.aFloat19 / 30.0D);
			if (Static150.aFloat19 < Static150.aFloat20) {
				Static150.aFloat19 = Static150.aFloat20;
			}
			Static173.method3116();
			Static150.anInt2632 = (int) Static150.aFloat19 >> 1;
			Static150.aByteArrayArrayArray6 = Static307.method5321(Static150.anInt2632);
		}
		if (Static282.anInt3502 != -1 && Static288.anInt5766 != -1) {
			@Pc(83) int local83 = Static282.anInt3502 - Static22.anInt428;
			if (local83 < 2 || local83 > 2) {
				local83 >>= 0x4;
			}
			@Pc(102) int local102 = Static288.anInt5766 - Static24.anInt439;
			Static22.anInt428 += local83;
			if (local102 < 2 || local102 > 2) {
				local102 >>= 0x4;
			}
			Static24.anInt439 -= -local102;
			if (local83 == 0 && local102 == 0) {
				Static288.anInt5766 = -1;
				Static282.anInt3502 = -1;
			}
			Static173.method3116();
		}
		if (Static284.anInt5720 <= 0) {
			Static101.anInt1939 = -1;
			Static289.anInt5793 = -1;
		} else {
			Static72.anInt1505--;
			if (Static72.anInt1505 == 0) {
				Static72.anInt1505 = 100;
				Static284.anInt5720--;
			}
		}
		if (!Static278.aBoolean472 || Static332.aClass14_35 == null) {
			return;
		}
		for (@Pc(166) Class1_Sub22 local166 = (Class1_Sub22) Static332.aClass14_35.method302(); local166 != null; local166 = (Class1_Sub22) Static332.aClass14_35.method313()) {
			@Pc(174) Class74 local174 = Static298.method5215(local166.aClass1_Sub29_1.anInt4242);
			if (Static148.anInt3053 == 0 && local166.method2862(Static28.anInt538, Static208.anInt4358)) {
				if (local174.aStringArray14 != null) {
					if (local174.aStringArray14[4] != null) {
						Static169.method2996(0, -1, local174.aStringArray14[4], (long) local166.aClass1_Sub29_1.anInt4242, local174.aString71, 1001, local174.anInt1727);
					}
					if (local174.aStringArray14[3] != null) {
						Static169.method2996(0, -1, local174.aStringArray14[3], (long) local166.aClass1_Sub29_1.anInt4242, local174.aString71, 1012, local174.anInt1727);
					}
					if (local174.aStringArray14[2] != null) {
						Static169.method2996(0, -1, local174.aStringArray14[2], (long) local166.aClass1_Sub29_1.anInt4242, local174.aString71, 1002, local174.anInt1727);
					}
					if (local174.aStringArray14[1] != null) {
						Static169.method2996(0, -1, local174.aStringArray14[1], (long) local166.aClass1_Sub29_1.anInt4242, local174.aString71, 1010, local174.anInt1727);
					}
					if (local174.aStringArray14[0] != null) {
						Static169.method2996(0, -1, local174.aStringArray14[0], (long) local166.aClass1_Sub29_1.anInt4242, local174.aString71, 1007, local174.anInt1727);
					}
				}
				if (!local166.aClass1_Sub29_1.aBoolean339) {
					local166.aClass1_Sub29_1.aBoolean339 = true;
					Static122.method1971(15, local166.aClass1_Sub29_1.anInt4242, local174.anInt1727);
				}
				if (local166.aClass1_Sub29_1.aBoolean339) {
					Static122.method1971(17, local166.aClass1_Sub29_1.anInt4242, local174.anInt1727);
				}
			} else if (local166.aClass1_Sub29_1.aBoolean339) {
				local166.aClass1_Sub29_1.aBoolean339 = false;
				Static122.method1971(16, local166.aClass1_Sub29_1.anInt4242, local174.anInt1727);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILclient!wl;Lclient!cl;IIIILjava/lang/String;Lclient!ps;Lclient!ud;)V")
	public static void method5298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class29 arg2, @OriginalArg(4) Class34 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) String arg8, @OriginalArg(10) Class163 arg9, @OriginalArg(11) Class15 arg10) {
		@Pc(13) int local13;
		if (Static246.anInt5156 == 4) {
			local13 = (int) Static143.aFloat21 & 0x3FFF;
		} else {
			local13 = Static86.anInt1648 + (int) Static143.aFloat21 & 0x3FFF;
		}
		@Pc(42) int local42 = Math.max(arg9.anInt4991 / 2, arg9.anInt4935 / 2) + 10;
		@Pc(50) int local50 = arg5 * arg5 + arg0 * arg0;
		if (local42 * local42 < local50) {
			return;
		}
		@Pc(60) int local60 = Class1_Sub5_Sub15.anIntArray335[local13];
		@Pc(64) int local64 = Class1_Sub5_Sub15.anIntArray333[local13];
		if (Static246.anInt5156 != 4) {
			local64 = local64 * 256 / (Static260.anInt5347 + 256);
			local60 = local60 * 256 / (Static260.anInt5347 + 256);
		}
		@Pc(95) int local95 = arg5 * local60 + arg0 * local64 >> 15;
		@Pc(106) int local106 = local64 * arg5 - local60 * arg0 >> 15;
		@Pc(113) int local113 = arg3.method786(100, arg8, null);
		@Pc(121) int local121 = arg3.method795(arg8, null);
		@Pc(127) int local127 = local95 - local113 / 2;
		if (-arg9.anInt4991 <= local127 && local127 <= arg9.anInt4991 && -arg9.anInt4935 <= local106 && arg9.anInt4935 >= local106) {
			arg2.method3741(arg6, arg6 + arg9.anInt4935 / 2 - local121 - arg7 - local106, arg8, null, arg4, arg1, 0, null, arg9.anInt4991 / 2 + local127 + arg1, local113, arg10, 0, 50, 0, 1);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZILclient!lm;Lclient!lm;)V")
	public static void method5300(@OriginalArg(2) Class134 arg0, @OriginalArg(3) Class134 arg1) {
		Static94.aBoolean128 = true;
		Static250.aClass134_118 = arg0;
		Static27.aClass134_96 = arg1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIB)V")
	public static void method5301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static81.anIntArray119[arg1] = arg0;
		@Pc(19) Class1_Sub25 local19 = (Class1_Sub25) Static346.aClass207_36.method5555((long) arg1);
		if (local19 == null) {
			local19 = new Class1_Sub25(Static292.method5114() + 500L);
			Static346.aClass207_36.method5552(local19, (long) arg1);
		} else {
			local19.aLong105 = Static292.method5114() + 500L;
		}
	}
}
