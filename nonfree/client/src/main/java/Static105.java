import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
	public static int[] anIntArray287;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
	public static int anInt2531;

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "Lclient!ua;")
	public static Class24_Sub1 aClass24_Sub1_17;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	public static int anInt2523 = 1;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "Lclient!je;")
	private static Class40 aClass40_1349 = Static69.method1231("Please use a different world)3");

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_1350 = aClass40_1349;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!je;")
	public static Class40 aClass40_1351 = Static69.method1231("Mitglieder)2Welt");

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Lclient!je;")
	public static Class40 aClass40_1352 = aClass40_1349;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!uf;")
	public static Class77 aClass77_11 = new Class77(512);

	@OriginalMember(owner = "client!sc", name = "t", descriptor = "Lclient!je;")
	public static Class40 aClass40_1353 = Static69.method1231("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!sc", name = "v", descriptor = "Lclient!je;")
	public static Class40 aClass40_1354 = Static69.method1231("");

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public static int anInt2533 = 0;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
	public static void method1824() {
		@Pc(7) int local7 = Static47.anInt1288;
		@Pc(9) int local9 = Static102.anInt2481;
		@Pc(11) int local11 = Static2.anInt89;
		@Pc(13) int local13 = Static47.anInt1277;
		Static6.method1695(local9, local7, local11, local13, 6116423);
		Static6.method1695(local9 + 1, local7 - -1, local11 - 2, 16, 0);
		Static6.method1693(local9 + 1, local7 - -18, local11 - 2, local13 + -19, 0);
		Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1549(Static97.aClass40_1288, local9 + 3, local7 - -14, 6116423, -1);
		@Pc(60) int local60 = Static85.anInt2261;
		@Pc(62) int local62 = Static112.anInt2616;
		for (@Pc(64) int local64 = 0; local64 < Static57.anInt1500; local64++) {
			@Pc(68) int local68 = 16777215;
			@Pc(81) int local81 = local7 + (Static57.anInt1500 + -1 - local64) * 15 + 31;
			if (local62 > local9 && local11 + local9 > local62 && local81 - 13 < local60 && local60 < local81 + 3) {
				local68 = 16776960;
			}
			Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1549(Static30.method465(local64), local9 + 3, local81, local68, 0);
		}
		Static21.method400(Static47.anInt1277, Static47.anInt1288, Static102.anInt2481, Static2.anInt89);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!kc;)V")
	public static void method1825(@OriginalArg(1) Class2_Sub13 arg0) {
		@Pc(6) int local6 = arg0.anInt1586;
		if (local6 == 324) {
			if (Static116.anInt2703 == -1) {
				Static13.anInt246 = arg0.anInt1572;
				Static116.anInt2703 = arg0.anInt1607;
			}
			if (Static127.aClass41_2.aBoolean103) {
				arg0.anInt1607 = Static116.anInt2703;
			} else {
				arg0.anInt1607 = Static13.anInt246;
			}
		} else if (local6 == 325) {
			if (Static116.anInt2703 == -1) {
				Static13.anInt246 = arg0.anInt1572;
				Static116.anInt2703 = arg0.anInt1607;
			}
			if (Static127.aClass41_2.aBoolean103) {
				arg0.anInt1607 = Static13.anInt246;
			} else {
				arg0.anInt1607 = Static116.anInt2703;
			}
		} else if (local6 == 327) {
			arg0.anInt1580 = 150;
			arg0.anInt1557 = (int) (Math.sin((double) Static28.anInt704 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1562 = 0;
			arg0.anInt1559 = 5;
		} else if (local6 == 328) {
			arg0.anInt1580 = 150;
			arg0.anInt1557 = (int) (Math.sin((double) Static28.anInt704 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1562 = 1;
			arg0.anInt1559 = 5;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[BLclient!hb;II[Lclient!ee;III)V")
	public static void method1826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class30 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class20[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = -1;
		@Pc(17) Class2_Sub9 local17 = new Class2_Sub9(arg2);
		while (true) {
			@Pc(21) int local21 = local17.method653();
			if (local21 == 0) {
				return;
			}
			local12 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local17.method653();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(53) int local53 = local32 >> 6 & 0x3F;
				@Pc(57) int local57 = local32 & 0x3F;
				@Pc(61) int local61 = local17.method640();
				@Pc(65) int local65 = local32 >> 12;
				@Pc(69) int local69 = local61 >> 2;
				@Pc(73) int local73 = local61 & 0x3;
				if (local65 == arg8 && local53 >= arg0 && local53 < arg0 + 8 && local57 >= arg9 && arg9 + 8 > local57) {
					@Pc(108) Class2_Sub1_Sub4 local108 = Static107.method1839(local12);
					@Pc(126) int local126 = arg5 + Static85.method1586(local73, local53 & 0x7, arg4, local108.anInt1066, local108.anInt1036, local57 & 0x7);
					@Pc(143) int local143 = arg7 + Static35.method534(local108.anInt1036, local57 & 0x7, arg4, local53 & 0x7, local108.anInt1066, local73);
					if (local126 > 0 && local143 > 0 && local126 < 103 && local143 < 103) {
						@Pc(165) Class20 local165 = null;
						@Pc(167) int local167 = arg1;
						if ((Static66.aByteArrayArrayArray10[1][local126][local143] & 0x2) == 2) {
							local167 = arg1 - 1;
						}
						if (local167 >= 0) {
							local165 = arg6[local167];
						}
						Static15.method239(local69, arg3, arg1, local12, local143, local126, local73 + arg4 & 0x3, local165);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public static void method1827() {
		aClass40_1354 = null;
		aClass40_1349 = null;
		aClass77_11 = null;
		aClass40_1351 = null;
		aClass40_1352 = null;
		aClass40_1353 = null;
		anIntArray287 = null;
		aClass40_1350 = null;
		aClass24_Sub1_17 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIBIIII)V")
	public static void method1828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg4 & 0x7FF;
		@Pc(12) int local12 = 0;
		@Pc(19) int local19 = 2048 - arg2 & 0x7FF;
		@Pc(21) int local21 = 0;
		@Pc(31) int local31 = arg5;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(55) int local55;
		if (local19 != 0) {
			local40 = Class2_Sub1_Sub2_Sub2.anIntArray219[local19];
			local44 = Class2_Sub1_Sub2_Sub2.anIntArray221[local19];
			local55 = local44 * 0 - arg5 * local40 >> 16;
			local31 = local40 * 0 + arg5 * local44 >> 16;
			local21 = local55;
		}
		if (local10 != 0) {
			local40 = Class2_Sub1_Sub2_Sub2.anIntArray219[local10];
			local44 = Class2_Sub1_Sub2_Sub2.anIntArray221[local10];
			local55 = local40 * local31 + local44 * 0 >> 16;
			local31 = local44 * local31 - local40 * 0 >> 16;
			local12 = local55;
		}
		Static38.anInt1005 = arg2;
		Static67.anInt1832 = arg4;
		Static127.anInt2944 = arg3 - local31;
		Static83.anInt2155 = arg0 - local12;
		Static2.anInt101 = arg1 - local21;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Z")
	public static boolean method1829(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
