import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ej", name = "B", descriptor = "Lclient!cd;")
	public static Class22 aClass22_5;

	@OriginalMember(owner = "client!ej", name = "C", descriptor = "Lclient!mh;")
	public static Class109 aClass109_3;

	@OriginalMember(owner = "client!ej", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString244 = "Loading title screen - ";

	@OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
	public static int anInt4307 = 0;

	@OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
	public static int anInt4309 = -1;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZIIIZZLclient!tb;BI)Lclient!pa;")
	public static Class1_Sub2_Sub1 method3664(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class167 arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class102 local9 = Static49.method909(arg1);
		if (arg3 > 1 && local9.anIntArray272 != null) {
			@Pc(19) int local19 = -1;
			for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
				if (local9.anIntArray273[local21] <= arg3 && local9.anIntArray273[local21] != 0) {
					local19 = local9.anIntArray272[local21];
				}
			}
			if (local19 != -1) {
				local9 = Static49.method909(local19);
			}
		}
		@Pc(66) Class15_Sub2_Sub2 local66 = local9.method2786(arg6);
		if (local66 == null) {
			return null;
		}
		@Pc(73) Class1_Sub2_Sub1_Sub2 local73 = null;
		if (local9.anInt3224 != -1) {
			local73 = (Class1_Sub2_Sub1_Sub2) method3664(false, local9.anInt3213, 0, 10, true, true, arg6, 1);
			if (local73 == null) {
				return null;
			}
		} else if (local9.anInt3207 != -1) {
			local73 = (Class1_Sub2_Sub1_Sub2) method3664(false, local9.anInt3203, arg2, arg3, false, true, arg6, arg7);
			if (local73 == null) {
				return null;
			}
		}
		@Pc(118) int[] local118 = Static25.anIntArray27;
		@Pc(120) int local120 = Static25.anInt420;
		@Pc(122) int local122 = Static25.anInt421;
		@Pc(125) int[] local125 = new int[4];
		Static25.method399(local125);
		@Pc(133) Class1_Sub2_Sub1_Sub2 local133 = new Class1_Sub2_Sub1_Sub2(36, 32);
		Static25.method388(local133.anIntArray391, 36, 32);
		Static215.method3375();
		Static215.method3374(16, 16);
		@Pc(145) int local145 = local9.anInt3204;
		if (arg4) {
			local145 = (int) ((double) local145 * 1.5D);
		} else if (arg7 == 2) {
			local145 = (int) ((double) local145 * 1.04D);
		}
		Static215.aBoolean274 = false;
		@Pc(178) int local178 = local145 * Class135.anIntArray335[local9.anInt3229] >> 16;
		@Pc(187) int local187 = Class135.anIntArray338[local9.anInt3229] * local145 >> 16;
		local66.method1035(local9.anInt3191, local9.anInt3167, local9.anInt3229, local9.anInt3176, local178 + local9.anInt3186 - local66.method4676() / 2, local187 + local9.anInt3186, -1L);
		if (arg7 >= 1) {
			local133.method3865(1);
			if (arg7 >= 2) {
				local133.method3865(16777215);
			}
			Static25.method388(local133.anIntArray391, 36, 32);
		}
		if (arg2 != 0) {
			local133.method3866(arg2);
		}
		if (local9.anInt3224 != -1) {
			local73.method3839(0, 0);
		} else if (local9.anInt3207 != -1) {
			Static25.method388(local73.anIntArray391, 36, 32);
			local133.method3839(0, 0);
			local133 = local73;
		}
		if (arg0 && (local9.anInt3185 == 1 || arg3 != 1) && arg3 != -1) {
			Static81.aClass1_Sub2_Sub6_Sub1_3.method4016(Static284.method4367(arg3), 0, 9, 16776960, 1);
		}
		Static25.method388(local118, local120, local122);
		Static25.method406(local125);
		Static215.method3375();
		Static215.aBoolean274 = true;
		return Static156.aBoolean211 && !arg5 ? new Class1_Sub2_Sub1_Sub1(local133) : local133;
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V")
	public static void method3666() {
		if (Static244.anInt4426 != -1) {
			Static257.method4074(false, Static244.anInt4426, -1, -1);
			Static244.anInt4426 = -1;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZLclient!rj;Lclient!lf;I)V")
	public static void method3667(@OriginalArg(1) Class154 arg0, @OriginalArg(2) Class1_Sub14 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class1_Sub20 local9 = new Class1_Sub20();
		local9.anInt3137 = arg1.method1378();
		local9.anInt3142 = arg1.method1392();
		local9.anIntArray262 = new int[local9.anInt3137];
		local9.aByteArrayArrayArray10 = new byte[local9.anInt3137][][];
		local9.anIntArray261 = new int[local9.anInt3137];
		local9.anIntArray264 = new int[local9.anInt3137];
		local9.aClass185Array2 = new Class185[local9.anInt3137];
		local9.aClass185Array1 = new Class185[local9.anInt3137];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt3137; local51++) {
			try {
				@Pc(63) int local63 = arg1.method1378();
				@Pc(80) String local80;
				@Pc(84) String local84;
				@Pc(86) int local86;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local80 = arg1.method1375();
					local84 = arg1.method1375();
					local86 = 0;
					if (local63 == 1) {
						local86 = arg1.method1392();
					}
					local9.anIntArray264[local51] = local63;
					local9.anIntArray261[local51] = local86;
					local9.aClass185Array1[local51] = arg0.method3885(local84, Static201.method3231(local80));
				} else if (local63 == 3 || local63 == 4) {
					local80 = arg1.method1375();
					local84 = arg1.method1375();
					local86 = arg1.method1378();
					@Pc(143) String[] local143 = new String[local86];
					for (@Pc(145) int local145 = 0; local145 < local86; local145++) {
						local143[local145] = arg1.method1375();
					}
					@Pc(164) byte[][] local164 = new byte[local86][];
					@Pc(178) int local178;
					if (local63 == 3) {
						for (@Pc(171) int local171 = 0; local171 < local86; local171++) {
							local178 = arg1.method1392();
							local164[local171] = new byte[local178];
							arg1.method1355(local178, local164[local171]);
						}
					}
					@Pc(197) Class[] local197 = new Class[local86];
					local9.anIntArray264[local51] = local63;
					for (local178 = 0; local178 < local86; local178++) {
						local197[local178] = Static201.method3231(local143[local178]);
					}
					local9.aClass185Array2[local51] = arg0.method3897(local84, Static201.method3231(local80), local197);
					local9.aByteArrayArrayArray10[local51] = local164;
				}
			} catch (@Pc(241) ClassNotFoundException local241) {
				local9.anIntArray262[local51] = -1;
			} catch (@Pc(248) SecurityException local248) {
				local9.anIntArray262[local51] = -2;
			} catch (@Pc(255) NullPointerException local255) {
				local9.anIntArray262[local51] = -3;
			} catch (@Pc(262) Exception local262) {
				local9.anIntArray262[local51] = -4;
			} catch (@Pc(269) Throwable local269) {
				local9.anIntArray262[local51] = -5;
			}
		}
		Static284.aClass59_37.method1706(local9);
	}
}
