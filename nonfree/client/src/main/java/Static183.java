import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public static int anInt3495;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!fe;")
	public static Class23_Sub1 aClass23_Sub1_3 = null;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!vh;")
	public static Class187 aClass187_94 = new Class187(64);

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
	public static int anInt3499 = -1;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Z")
	public static boolean aBoolean241 = true;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIILclient!io;Lclient!io;IIJ)V")
	public static void method2997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15 arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class160 local8 = new Class160();
		local8.aLong170 = arg8;
		local8.anInt4619 = arg1 * 128 + 64;
		local8.anInt4624 = arg2 * 128 + 64;
		local8.anInt4626 = arg3;
		local8.aClass15_7 = arg4;
		local8.aClass15_8 = arg5;
		local8.anInt4621 = arg6;
		local8.anInt4620 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static105.aClass1_Sub33ArrayArrayArray2[local42][arg1][arg2] == null) {
				Static105.aClass1_Sub33ArrayArrayArray2[local42][arg1][arg2] = new Class1_Sub33(local42, arg1, arg2);
			}
		}
		Static105.aClass1_Sub33ArrayArrayArray2[arg0][arg1][arg2].aClass160_1 = local8;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZIIIIIIII)V")
	public static void method2998(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		for (local7 = 0; local7 < 104; local7++) {
			for (local12 = 0; local12 < 104; local12++) {
				Static57.anIntArrayArray8[local7][local12] = 0;
				Static123.anIntArrayArray18[local7][local12] = 99999999;
			}
		}
		Static57.anIntArrayArray8[arg4][arg8] = 99;
		Static123.anIntArrayArray18[arg4][arg8] = 0;
		local12 = arg8;
		local7 = arg4;
		@Pc(60) byte local60 = 0;
		@Pc(62) int local62 = 0;
		Static296.anIntArray469[0] = arg4;
		@Pc(68) boolean local68 = false;
		@Pc(71) int local71 = local60 + 1;
		Static293.anIntArray466[0] = arg8;
		@Pc(78) int[][] local78 = Static240.aClass118Array1[Static65.anInt1300].anIntArrayArray28;
		@Pc(201) int local201;
		while (local71 != local62) {
			local12 = Static293.anIntArray466[local62];
			local7 = Static296.anIntArray469[local62];
			local62 = local62 + 1 & 0xFFF;
			if (arg2 == local7 && arg3 == local12) {
				local68 = true;
				break;
			}
			if (arg7 != 0) {
				if ((arg7 < 5 || arg7 == 10) && Static240.aClass118Array1[Static65.anInt1300].method3043(1, arg3, local7, arg7 - 1, arg1, local12, arg2)) {
					local68 = true;
					break;
				}
				if (arg7 < 10 && Static240.aClass118Array1[Static65.anInt1300].method3039(arg7 - 1, arg1, arg3, local12, 1, local7, arg2)) {
					local68 = true;
					break;
				}
			}
			if (arg6 != 0 && arg5 != 0 && Static240.aClass118Array1[Static65.anInt1300].method3034(arg0, arg3, local7, arg6, local12, arg5, arg2, 1)) {
				local68 = true;
				break;
			}
			local201 = Static123.anIntArrayArray18[local7][local12] + 1;
			if (local7 > 0 && Static57.anIntArrayArray8[local7 - 1][local12] == 0 && (local78[local7 - 1][local12] & 0x2C0108) == 0) {
				Static296.anIntArray469[local71] = local7 - 1;
				Static293.anIntArray466[local71] = local12;
				local71 = local71 + 1 & 0xFFF;
				Static57.anIntArrayArray8[local7 - 1][local12] = 2;
				Static123.anIntArrayArray18[local7 - 1][local12] = local201;
			}
			if (local7 < 103 && Static57.anIntArrayArray8[local7 + 1][local12] == 0 && (local78[local7 + 1][local12] & 0x2C0180) == 0) {
				Static296.anIntArray469[local71] = local7 + 1;
				Static293.anIntArray466[local71] = local12;
				local71 = local71 + 1 & 0xFFF;
				Static57.anIntArrayArray8[local7 + 1][local12] = 8;
				Static123.anIntArrayArray18[local7 + 1][local12] = local201;
			}
			if (local12 > 0 && Static57.anIntArrayArray8[local7][local12 - 1] == 0 && (local78[local7][local12 - 1] & 0x2C0102) == 0) {
				Static296.anIntArray469[local71] = local7;
				Static293.anIntArray466[local71] = local12 - 1;
				Static57.anIntArrayArray8[local7][local12 - 1] = 1;
				local71 = local71 + 1 & 0xFFF;
				Static123.anIntArrayArray18[local7][local12 - 1] = local201;
			}
			if (local12 < 103 && Static57.anIntArrayArray8[local7][local12 + 1] == 0 && (local78[local7][local12 + 1] & 0x2C0120) == 0) {
				Static296.anIntArray469[local71] = local7;
				Static293.anIntArray466[local71] = local12 + 1;
				Static57.anIntArrayArray8[local7][local12 + 1] = 4;
				Static123.anIntArrayArray18[local7][local12 + 1] = local201;
				local71 = local71 + 1 & 0xFFF;
			}
			if (local7 > 0 && local12 > 0 && Static57.anIntArrayArray8[local7 - 1][local12 - 1] == 0 && (local78[local7 - 1][local12 - 1] & 0x2C010E) == 0 && (local78[local7 - 1][local12] & 0x2C0108) == 0 && (local78[local7][local12 - 1] & 0x2C0102) == 0) {
				Static296.anIntArray469[local71] = local7 - 1;
				Static293.anIntArray466[local71] = local12 - 1;
				local71 = local71 + 1 & 0xFFF;
				Static57.anIntArrayArray8[local7 - 1][local12 - 1] = 3;
				Static123.anIntArrayArray18[local7 - 1][local12 - 1] = local201;
			}
			if (local7 < 103 && local12 > 0 && Static57.anIntArrayArray8[local7 + 1][local12 - 1] == 0 && (local78[local7 + 1][local12 - 1] & 0x2C0183) == 0 && (local78[local7 + 1][local12] & 0x2C0180) == 0 && (local78[local7][local12 - 1] & 0x2C0102) == 0) {
				Static296.anIntArray469[local71] = local7 + 1;
				Static293.anIntArray466[local71] = local12 - 1;
				Static57.anIntArrayArray8[local7 + 1][local12 - 1] = 9;
				Static123.anIntArrayArray18[local7 + 1][local12 - 1] = local201;
				local71 = local71 + 1 & 0xFFF;
			}
			if (local7 > 0 && local12 < 103 && Static57.anIntArrayArray8[local7 - 1][local12 + 1] == 0 && (local78[local7 - 1][local12 + 1] & 0x2C0138) == 0 && (local78[local7 - 1][local12] & 0x2C0108) == 0 && (local78[local7][local12 + 1] & 0x2C0120) == 0) {
				Static296.anIntArray469[local71] = local7 - 1;
				Static293.anIntArray466[local71] = local12 + 1;
				local71 = local71 + 1 & 0xFFF;
				Static57.anIntArrayArray8[local7 - 1][local12 + 1] = 6;
				Static123.anIntArrayArray18[local7 - 1][local12 + 1] = local201;
			}
			if (local7 < 103 && local12 < 103 && Static57.anIntArrayArray8[local7 + 1][local12 + 1] == 0 && (local78[local7 + 1][local12 + 1] & 0x2C01E0) == 0 && (local78[local7 + 1][local12] & 0x2C0180) == 0 && (local78[local7][local12 + 1] & 0x2C0120) == 0) {
				Static296.anIntArray469[local71] = local7 + 1;
				Static293.anIntArray466[local71] = local12 + 1;
				Static57.anIntArrayArray8[local7 + 1][local12 + 1] = 12;
				Static123.anIntArrayArray18[local7 + 1][local12 + 1] = local201;
				local71 = local71 + 1 & 0xFFF;
			}
		}
		if (!local68) {
			local201 = 1000;
			@Pc(831) int local831 = 100;
			for (@Pc(838) int local838 = arg2 - 10; local838 <= arg2 + 10; local838++) {
				for (@Pc(853) int local853 = arg3 - 10; local853 <= arg3 + 10; local853++) {
					if (local838 >= 0 && local853 >= 0 && local838 < 104 && local853 < 104 && Static123.anIntArrayArray18[local838][local853] < 100) {
						@Pc(888) int local888 = 0;
						if (arg2 > local838) {
							local888 = arg2 - local838;
						} else if (local838 > arg6 + arg2 - 1) {
							local888 = local838 + 1 - arg6 - arg2;
						}
						@Pc(919) int local919 = 0;
						if (local853 < arg3) {
							local919 = arg3 - local853;
						} else if (local853 > arg5 + arg3 - 1) {
							local919 = local853 + 1 - arg3 - arg5;
						}
						@Pc(960) int local960 = local919 * local919 + local888 * local888;
						if (local960 < local201 || local201 == local960 && Static123.anIntArrayArray18[local838][local853] < local831) {
							local12 = local853;
							local201 = local960;
							local831 = Static123.anIntArrayArray18[local838][local853];
							local7 = local838;
						}
					}
				}
			}
			if (local201 == 1000) {
				return;
			}
			if (local7 == arg4 && arg8 == local12) {
				return;
			}
		}
		Static196.anInt3703 = local12;
		Static52.aBoolean381 = false;
		Static162.anInt3171 = local7;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)Lclient!ja;")
	public static Class56 method2999() {
		try {
			return (Class56) Class.forName("Class56_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method3000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(12) int local12 = (int) arg2 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		@Pc(26) int local26 = (int) arg2 >> 20 & 0x3;
		if (local12 == 10 || local12 == 11 || local12 == 22) {
			@Pc(73) Class71 local73 = Static255.method4052(local19);
			@Pc(76) int local76 = local73.anInt2367;
			@Pc(90) int local90;
			@Pc(87) int local87;
			if (local26 == 0 || local26 == 2) {
				local90 = local73.anInt2377;
				local87 = local73.anInt2385;
			} else {
				local87 = local73.anInt2377;
				local90 = local73.anInt2385;
			}
			if (local26 != 0) {
				local76 = (local76 << local26 & 0xF) + (local76 >> 4 - local26);
			}
			Static45.method886(arg0, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], 0, arg1, local87, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], 0, local76, local90);
		} else {
			Static45.method886(arg0, Static90.aClass15_Sub5_Sub2_2.anIntArray501[0], local26, arg1, 0, Static90.aClass15_Sub5_Sub2_2.anIntArray504[0], local12 + 1, 0, 0);
		}
		return true;
	}
}
