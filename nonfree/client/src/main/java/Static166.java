import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "[I")
	public static int[] anIntArray322;

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "J")
	public static long aLong118;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
	public static volatile int anInt3424 = -1;

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "[I")
	public static final int[] anIntArray323 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
	public static int anInt3429 = 0;

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_987 = Static181.method2795("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)V")
	public static void method2575() {
		Static121.method2085(Static73.aClass5_9);
		Static207.anInt4082++;
		if (Static48.aBoolean72 && Static71.aBoolean89) {
			@Pc(26) int local26 = Static4.anInt95;
			local26 -= Static131.anInt2840;
			if (local26 < Static18.anInt2016) {
				local26 = Static18.anInt2016;
			}
			@Pc(37) int local37 = Static121.anInt2740;
			@Pc(40) int local40 = Static73.aClass5_9.anInt117;
			if (local26 + Static73.aClass5_9.anInt157 > Static18.anInt2016 + Static106.aClass5_12.anInt157) {
				local26 = Static18.anInt2016 + Static106.aClass5_12.anInt157 - Static73.aClass5_9.anInt157;
			}
			@Pc(70) int local70 = local26 + Static106.aClass5_12.anInt99 - Static18.anInt2016;
			local37 -= Static207.anInt4084;
			@Pc(78) int local78 = local26 - Static11.anInt369;
			if (Static172.anInt3536 > local37) {
				local37 = Static172.anInt3536;
			}
			if (local37 + Static73.aClass5_9.anInt100 > Static172.anInt3536 - -Static106.aClass5_12.anInt100) {
				local37 = Static172.anInt3536 + Static106.aClass5_12.anInt100 - Static73.aClass5_9.anInt100;
			}
			@Pc(119) int local119 = local37 + Static106.aClass5_12.anInt125 - Static172.anInt3536;
			@Pc(123) int local123 = local37 - Static123.anInt2756;
			if (Static73.aClass5_9.anInt149 < Static207.anInt4082 && (local40 < local78 || local78 < -local40 || local123 > local40 || local123 < -local40)) {
				Static201.aBoolean185 = true;
			}
			@Pc(168) Class2_Sub4 local168;
			if (Static73.aClass5_9.anObjectArray18 != null && Static201.aBoolean185) {
				local168 = new Class2_Sub4();
				local168.anInt542 = local70;
				local168.aClass5_3 = Static73.aClass5_9;
				local168.anObjectArray27 = Static73.aClass5_9.anObjectArray18;
				local168.anInt538 = local119;
				Static89.method3267(local168);
			}
			if (Static36.anInt939 == 0) {
				if (Static201.aBoolean185) {
					if (Static73.aClass5_9.anObjectArray23 != null) {
						local168 = new Class2_Sub4();
						local168.anInt538 = local119;
						local168.anInt542 = local70;
						local168.aClass5_3 = Static73.aClass5_9;
						local168.aClass5_2 = Static22.aClass5_4;
						local168.anObjectArray27 = Static73.aClass5_9.anObjectArray23;
						Static89.method3267(local168);
					}
					if (Static22.aClass5_4 != null && Static87.method1519(Static73.aClass5_9) != null) {
						Static69.aClass2_Sub3_Sub1_2.method284(204);
						Static69.aClass2_Sub3_Sub1_2.method225(Static73.aClass5_9.anInt131);
						Static69.aClass2_Sub3_Sub1_2.method263(Static22.aClass5_4.anInt131);
						Static69.aClass2_Sub3_Sub1_2.method233(Static73.aClass5_9.anInt159);
						Static69.aClass2_Sub3_Sub1_2.method218(Static22.aClass5_4.anInt159);
					}
				} else if ((Static180.anInt3674 == 1 || Static177.method2716(Static98.anInt2124 - 1)) && Static98.anInt2124 > 2) {
					Static167.method2589();
				} else if (Static98.anInt2124 > 0) {
					Static8.method124(Static98.anInt2124 - 1);
				}
				Static73.aClass5_9 = null;
			}
		} else if (Static207.anInt4082 > 1) {
			Static73.aClass5_9 = null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIZIIIIII)Z")
	public static boolean method2576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static192.anIntArrayArray34[local7][local11] = 0;
				Static111.anIntArrayArray19[local7][local11] = 99999999;
			}
		}
		Static192.anIntArrayArray34[arg9][arg6] = 99;
		local11 = arg9;
		@Pc(52) int local52 = 0;
		Static111.anIntArrayArray19[arg9][arg6] = 0;
		@Pc(60) boolean local60 = false;
		@Pc(62) int local62 = arg6;
		@Pc(64) byte local64 = 0;
		Static104.anIntArray237[0] = arg9;
		@Pc(71) int local71 = local64 + 1;
		Static62.anIntArray123[0] = arg6;
		@Pc(76) int local76 = Static104.anIntArray237.length;
		@Pc(81) int[][] local81 = Static117.aClass22Array1[Static43.anInt1126].anIntArrayArray4;
		@Pc(199) int local199;
		while (local71 != local52) {
			local11 = Static104.anIntArray237[local52];
			local62 = Static62.anIntArray123[local52];
			local52 = (local52 + 1) % local76;
			if (arg1 == local11 && local62 == arg3) {
				local60 = true;
				break;
			}
			if (arg8 != 0) {
				if ((arg8 < 5 || arg8 == 10) && Static117.aClass22Array1[Static43.anInt1126].method736(local62, arg1, arg8 - 1, arg2, local11, arg3)) {
					local60 = true;
					break;
				}
				if (arg8 < 10 && Static117.aClass22Array1[Static43.anInt1126].method727(local11, arg3, local62, arg2, arg1, arg8 - 1)) {
					local60 = true;
					break;
				}
			}
			if (arg7 != 0 && arg10 != 0 && Static117.aClass22Array1[Static43.anInt1126].method726(local62, arg1, arg3, arg7, local11, arg10, arg5)) {
				local60 = true;
				break;
			}
			local199 = Static111.anIntArrayArray19[local11][local62] + 1;
			if (local11 > 0 && Static192.anIntArrayArray34[local11 - 1][local62] == 0 && (local81[local11 - 1][local62] & 0x12C0108) == 0) {
				Static104.anIntArray237[local71] = local11 - 1;
				Static62.anIntArray123[local71] = local62;
				Static192.anIntArrayArray34[local11 - 1][local62] = 2;
				local71 = (local71 + 1) % local76;
				Static111.anIntArrayArray19[local11 - 1][local62] = local199;
			}
			if (local11 < 103 && Static192.anIntArrayArray34[local11 + 1][local62] == 0 && (local81[local11 + 1][local62] & 0x12C0180) == 0) {
				Static104.anIntArray237[local71] = local11 + 1;
				Static62.anIntArray123[local71] = local62;
				local71 = (local71 + 1) % local76;
				Static192.anIntArrayArray34[local11 + 1][local62] = 8;
				Static111.anIntArrayArray19[local11 + 1][local62] = local199;
			}
			if (local62 > 0 && Static192.anIntArrayArray34[local11][local62 - 1] == 0 && (local81[local11][local62 - 1] & 0x12C0102) == 0) {
				Static104.anIntArray237[local71] = local11;
				Static62.anIntArray123[local71] = local62 - 1;
				local71 = (local71 + 1) % local76;
				Static192.anIntArrayArray34[local11][local62 - 1] = 1;
				Static111.anIntArrayArray19[local11][local62 - 1] = local199;
			}
			if (local62 < 103 && Static192.anIntArrayArray34[local11][local62 + 1] == 0 && (local81[local11][local62 + 1] & 0x12C0120) == 0) {
				Static104.anIntArray237[local71] = local11;
				Static62.anIntArray123[local71] = local62 + 1;
				Static192.anIntArrayArray34[local11][local62 + 1] = 4;
				Static111.anIntArrayArray19[local11][local62 + 1] = local199;
				local71 = (local71 + 1) % local76;
			}
			if (local11 > 0 && local62 > 0 && Static192.anIntArrayArray34[local11 - 1][local62 - 1] == 0 && (local81[local11 - 1][local62 - 1] & 0x12C010E) == 0 && (local81[local11 - 1][local62] & 0x12C0108) == 0 && (local81[local11][local62 - 1] & 0x12C0102) == 0) {
				Static104.anIntArray237[local71] = local11 - 1;
				Static62.anIntArray123[local71] = local62 - 1;
				local71 = (local71 + 1) % local76;
				Static192.anIntArrayArray34[local11 - 1][local62 - 1] = 3;
				Static111.anIntArrayArray19[local11 - 1][local62 - 1] = local199;
			}
			if (local11 < 103 && local62 > 0 && Static192.anIntArrayArray34[local11 + 1][local62 - 1] == 0 && (local81[local11 + 1][local62 - 1] & 0x12C0183) == 0 && (local81[local11 + 1][local62] & 0x12C0180) == 0 && (local81[local11][local62 - 1] & 0x12C0102) == 0) {
				Static104.anIntArray237[local71] = local11 + 1;
				Static62.anIntArray123[local71] = local62 - 1;
				Static192.anIntArrayArray34[local11 + 1][local62 - 1] = 9;
				Static111.anIntArrayArray19[local11 + 1][local62 - 1] = local199;
				local71 = (local71 + 1) % local76;
			}
			if (local11 > 0 && local62 < 103 && Static192.anIntArrayArray34[local11 - 1][local62 + 1] == 0 && (local81[local11 - 1][local62 + 1] & 0x12C0138) == 0 && (local81[local11 - 1][local62] & 0x12C0108) == 0 && (local81[local11][local62 + 1] & 0x12C0120) == 0) {
				Static104.anIntArray237[local71] = local11 - 1;
				Static62.anIntArray123[local71] = local62 + 1;
				local71 = (local71 + 1) % local76;
				Static192.anIntArrayArray34[local11 - 1][local62 + 1] = 6;
				Static111.anIntArrayArray19[local11 - 1][local62 + 1] = local199;
			}
			if (local11 < 103 && local62 < 103 && Static192.anIntArrayArray34[local11 + 1][local62 + 1] == 0 && (local81[local11 + 1][local62 + 1] & 0x12C01E0) == 0 && (local81[local11 + 1][local62] & 0x12C0180) == 0 && (local81[local11][local62 + 1] & 0x12C0120) == 0) {
				Static104.anIntArray237[local71] = local11 + 1;
				Static62.anIntArray123[local71] = local62 + 1;
				Static192.anIntArrayArray34[local11 + 1][local62 + 1] = 12;
				Static111.anIntArrayArray19[local11 + 1][local62 + 1] = local199;
				local71 = (local71 + 1) % local76;
			}
		}
		Static104.anInt2413 = 0;
		@Pc(808) int local808;
		@Pc(817) int local817;
		@Pc(824) int local824;
		if (!local60) {
			if (!arg4) {
				return false;
			}
			local808 = 100;
			local199 = 1000;
			for (local817 = arg1 - 10; local817 <= arg1 + 10; local817++) {
				for (local824 = arg3 - 10; local824 <= arg3 + 10; local824++) {
					if (local817 >= 0 && local824 >= 0 && local817 < 104 && local824 < 104 && Static111.anIntArrayArray19[local817][local824] < 100) {
						@Pc(849) int local849 = 0;
						@Pc(851) int local851 = 0;
						if (local817 < arg1) {
							local849 = arg1 - local817;
						} else if (arg1 + arg7 - 1 < local817) {
							local849 = local817 + 1 - arg7 - arg1;
						}
						if (arg3 > local824) {
							local851 = arg3 - local824;
						} else if (arg10 + arg3 - 1 < local824) {
							local851 = local824 + 1 - arg3 - arg10;
						}
						@Pc(920) int local920 = local851 * local851 + local849 * local849;
						if (local920 < local199 || local920 == local199 && local808 > Static111.anIntArrayArray19[local817][local824]) {
							local11 = local817;
							local62 = local824;
							local808 = Static111.anIntArrayArray19[local817][local824];
							local199 = local920;
						}
					}
				}
			}
			if (local199 == 1000) {
				return false;
			}
			if (arg9 == local11 && local62 == arg6) {
				return false;
			}
			Static104.anInt2413 = 1;
		}
		@Pc(996) byte local996 = 0;
		Static104.anIntArray237[0] = local11;
		local52 = local996 + 1;
		Static62.anIntArray123[0] = local62;
		local199 = local808 = Static192.anIntArrayArray34[local11][local62];
		while (arg9 != local11 || arg6 != local62) {
			if (local808 != local199) {
				Static104.anIntArray237[local52] = local11;
				Static62.anIntArray123[local52++] = local62;
				local808 = local199;
			}
			if ((local199 & 0x1) != 0) {
				local62++;
			} else if ((local199 & 0x4) != 0) {
				local62--;
			}
			if ((local199 & 0x2) != 0) {
				local11++;
			} else if ((local199 & 0x8) != 0) {
				local11--;
			}
			local199 = Static192.anIntArrayArray34[local11][local62];
		}
		if (local52 > 0) {
			local76 = local52;
			if (local52 > 25) {
				local76 = 25;
			}
			local52--;
			local817 = Static62.anIntArray123[local52];
			@Pc(1101) int local1101 = Static104.anIntArray237[local52];
			if (arg0 == 0) {
				Static69.aClass2_Sub3_Sub1_2.method284(230);
				Static69.aClass2_Sub3_Sub1_2.method247(local76 + local76 + 3);
			}
			if (arg0 == 1) {
				Static69.aClass2_Sub3_Sub1_2.method284(179);
				Static69.aClass2_Sub3_Sub1_2.method247(local76 + local76 + 17);
			}
			if (arg0 == 2) {
				Static69.aClass2_Sub3_Sub1_2.method284(212);
				Static69.aClass2_Sub3_Sub1_2.method247(local76 + local76 + 3);
			}
			Static69.aClass2_Sub3_Sub1_2.method272(Static71.aBooleanArray10[82] ? 1 : 0);
			Static69.aClass2_Sub3_Sub1_2.method225(local1101 + Static2.anInt57);
			Static69.aClass2_Sub3_Sub1_2.method253(Static123.anInt2755 + local817);
			Static121.anInt2747 = Static104.anIntArray237[0];
			Static175.anInt3598 = Static62.anIntArray123[0];
			for (local824 = 1; local824 < local76; local824++) {
				local52--;
				Static69.aClass2_Sub3_Sub1_2.method247(Static104.anIntArray237[local52] - local1101);
				Static69.aClass2_Sub3_Sub1_2.method247(Static62.anIntArray123[local52] - local817);
			}
			return true;
		} else if (arg0 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(III)Z")
	public static boolean method2577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static191.anInt3782; local1++) {
			@Pc(6) Class54 local6 = Static10.aClass54Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1986 == 1) {
				local15 = local6.anInt1992 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1996 + (local6.anInt2003 * local15 >> 8);
					local37 = local6.anInt1995 + (local6.anInt1990 * local15 >> 8);
					local47 = local6.anInt1981 + (local6.anInt1980 * local15 >> 8);
					local57 = local6.anInt1993 + (local6.anInt1982 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1986 == 2) {
				local15 = arg0 - local6.anInt1992;
				if (local15 > 0) {
					local27 = local6.anInt1996 + (local6.anInt2003 * local15 >> 8);
					local37 = local6.anInt1995 + (local6.anInt1990 * local15 >> 8);
					local47 = local6.anInt1981 + (local6.anInt1980 * local15 >> 8);
					local57 = local6.anInt1993 + (local6.anInt1982 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1986 == 3) {
				local15 = local6.anInt1996 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1992 + (local6.anInt1985 * local15 >> 8);
					local37 = local6.anInt1987 + (local6.anInt2002 * local15 >> 8);
					local47 = local6.anInt1981 + (local6.anInt1980 * local15 >> 8);
					local57 = local6.anInt1993 + (local6.anInt1982 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1986 == 4) {
				local15 = arg2 - local6.anInt1996;
				if (local15 > 0) {
					local27 = local6.anInt1992 + (local6.anInt1985 * local15 >> 8);
					local37 = local6.anInt1987 + (local6.anInt2002 * local15 >> 8);
					local47 = local6.anInt1981 + (local6.anInt1980 * local15 >> 8);
					local57 = local6.anInt1993 + (local6.anInt1982 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1986 == 5) {
				local15 = arg1 - local6.anInt1981;
				if (local15 > 0) {
					local27 = local6.anInt1992 + (local6.anInt1985 * local15 >> 8);
					local37 = local6.anInt1987 + (local6.anInt2002 * local15 >> 8);
					local47 = local6.anInt1996 + (local6.anInt2003 * local15 >> 8);
					local57 = local6.anInt1995 + (local6.anInt1990 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)V")
	public static void method2579() {
		Static33.aClass2_Sub3_Sub1_1.method287();
		@Pc(7) int local7 = Static33.aClass2_Sub3_Sub1_1.method285(1);
		if (local7 == 0) {
			return;
		}
		@Pc(24) int local24 = Static33.aClass2_Sub3_Sub1_1.method285(2);
		if (local24 == 0) {
			Static64.anIntArray130[Static177.anInt3619++] = 2047;
			return;
		}
		@Pc(48) int local48;
		@Pc(58) int local58;
		if (local24 == 1) {
			local48 = Static33.aClass2_Sub3_Sub1_1.method285(3);
			Static54.aClass24_Sub4_Sub1_1.method2522(local48, false);
			local58 = Static33.aClass2_Sub3_Sub1_1.method285(1);
			if (local58 == 1) {
				Static64.anIntArray130[Static177.anInt3619++] = 2047;
			}
			return;
		}
		@Pc(100) int local100;
		if (local24 == 2) {
			local48 = Static33.aClass2_Sub3_Sub1_1.method285(3);
			Static54.aClass24_Sub4_Sub1_1.method2522(local48, true);
			local58 = Static33.aClass2_Sub3_Sub1_1.method285(3);
			Static54.aClass24_Sub4_Sub1_1.method2522(local58, true);
			local100 = Static33.aClass2_Sub3_Sub1_1.method285(1);
			if (local100 == 1) {
				Static64.anIntArray130[Static177.anInt3619++] = 2047;
			}
		} else if (local24 == 3) {
			local48 = Static33.aClass2_Sub3_Sub1_1.method285(7);
			local58 = Static33.aClass2_Sub3_Sub1_1.method285(1);
			if (local58 == 1) {
				Static64.anIntArray130[Static177.anInt3619++] = 2047;
			}
			Static43.anInt1126 = Static33.aClass2_Sub3_Sub1_1.method285(2);
			local100 = Static33.aClass2_Sub3_Sub1_1.method285(7);
			@Pc(153) int local153 = Static33.aClass2_Sub3_Sub1_1.method285(1);
			Static54.aClass24_Sub4_Sub1_1.method2524(local48, local153 == 1, local100);
		}
	}
}
