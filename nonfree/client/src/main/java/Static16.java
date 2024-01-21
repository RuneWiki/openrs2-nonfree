import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bg", name = "s", descriptor = "Lclient!cd;")
	private static Class10 aClass10_196 = Static51.method932("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "Lclient!cd;")
	public static Class10 aClass10_195 = aClass10_196;

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Lclient!fa;")
	public static Class23 aClass23_1 = null;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[J")
	public static long[] aLongArray2 = new long[200];

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "[I")
	public static int[] anIntArray28 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!bg", name = "B", descriptor = "Lclient!cd;")
	public static Class10 aClass10_197 = Static51.method932("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!bg", name = "D", descriptor = "Lclient!cd;")
	public static Class10 aClass10_198 = Static51.method932("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!bg", name = "f", descriptor = "(II)Lclient!rg;")
	public static Class2_Sub1_Sub16 method259(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub1_Sub16 local13 = (Class2_Sub1_Sub16) Static25.aClass72_4.method2259((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(29) byte[] local29 = Static162.aClass29_67.method1030(arg0, 4);
		local13 = new Class2_Sub1_Sub16();
		if (local29 != null) {
			local13.method2230(new Class2_Sub11(local29), arg0);
		}
		local13.method2229();
		Static25.aClass72_4.method2254(local13, (long) arg0);
		return local13;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!gd;ILclient!ug;)V")
	public static void method261(@OriginalArg(1) Class29_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class83 arg2) {
		@Pc(7) Class2_Sub4 local7 = new Class2_Sub4();
		local7.aClass83_1 = arg2;
		local7.anInt496 = 1;
		local7.aClass29_Sub1_12 = arg0;
		local7.aLong139 = arg1;
		@Pc(27) Class12 local27 = Static34.aClass12_4;
		synchronized (Static34.aClass12_4) {
			Static34.aClass12_4.method382(local7);
		}
		Static130.method2081();
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
	public static void method262() {
		for (@Pc(6) Class2_Sub1_Sub3_Sub5 local6 = (Class2_Sub1_Sub3_Sub5) Static81.aClass12_6.method384(); local6 != null; local6 = (Class2_Sub1_Sub3_Sub5) Static81.aClass12_6.method381()) {
			if (Static56.anInt1432 != local6.anInt1868 || Static14.anInt386 > local6.anInt1866) {
				local6.method2705();
			} else if (local6.anInt1855 <= Static14.anInt386) {
				if (local6.anInt1863 > 0) {
					@Pc(38) Class2_Sub1_Sub3_Sub2_Sub2 local38 = Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local6.anInt1863 - 1];
					if (local38 != null && local38.anInt3454 >= 0 && local38.anInt3454 < 13312 && local38.anInt3499 >= 0 && local38.anInt3499 < 13312) {
						local6.method1306(local38.anInt3454, local38.anInt3499, Static178.method2702(local38.anInt3499, local38.anInt3454, local6.anInt1868) - local6.anInt1861, Static14.anInt386);
					}
				}
				if (local6.anInt1863 < 0) {
					@Pc(86) int local86 = -local6.anInt1863 - 1;
					@Pc(97) Class2_Sub1_Sub3_Sub2_Sub1 local97;
					if (local86 == Static14.anInt385) {
						local97 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1;
					} else {
						local97 = Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local86];
					}
					if (local97 != null && local97.anInt3454 >= 0 && local97.anInt3454 < 13312 && local97.anInt3499 >= 0 && local97.anInt3499 < 13312) {
						local6.method1306(local97.anInt3454, local97.anInt3499, Static178.method2702(local97.anInt3499, local97.anInt3454, local6.anInt1868) - local6.anInt1861, Static14.anInt386);
					}
				}
				local6.method1304(Static123.anInt2778);
				Static180.aClass60_1.method1812(Static56.anInt1432, (int) local6.aDouble7, (int) local6.aDouble1, (int) local6.aDouble3, 60, local6, local6.anInt1858, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
	public static int method263() {
		@Pc(15) int local15 = 3;
		if (Static95.anInt2250 < 310) {
			@Pc(22) int local22 = Static107.anInt2447 >> 7;
			@Pc(27) int local27 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 >> 7;
			@Pc(31) int local31 = Static104.anInt2384 >> 7;
			if ((Static50.aByteArrayArrayArray3[Static56.anInt1432][local22][local31] & 0x4) != 0) {
				local15 = Static56.anInt1432;
			}
			@Pc(51) int local51 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 >> 7;
			@Pc(59) int local59;
			if (local22 >= local27) {
				local59 = local22 - local27;
			} else {
				local59 = local27 - local22;
			}
			@Pc(77) int local77;
			if (local31 >= local51) {
				local77 = local31 - local51;
			} else {
				local77 = local51 - local31;
			}
			@Pc(98) int local98;
			@Pc(92) int local92;
			if (local77 < local59) {
				local92 = 32768;
				local98 = local77 * 65536 / local59;
				while (local22 != local27) {
					local92 += local98;
					if (local27 > local22) {
						local22++;
					} else if (local22 > local27) {
						local22--;
					}
					if ((Static50.aByteArrayArrayArray3[Static56.anInt1432][local22][local31] & 0x4) != 0) {
						local15 = Static56.anInt1432;
					}
					if (local92 >= 65536) {
						if (local51 > local31) {
							local31++;
						} else if (local51 < local31) {
							local31--;
						}
						if ((Static50.aByteArrayArrayArray3[Static56.anInt1432][local22][local31] & 0x4) != 0) {
							local15 = Static56.anInt1432;
						}
						local92 -= 65536;
					}
				}
			} else {
				local98 = local59 * 65536 / local77;
				local92 = 32768;
				while (local31 != local51) {
					local92 += local98;
					if (local31 < local51) {
						local31++;
					} else if (local31 > local51) {
						local31--;
					}
					if ((Static50.aByteArrayArrayArray3[Static56.anInt1432][local22][local31] & 0x4) != 0) {
						local15 = Static56.anInt1432;
					}
					if (local92 >= 65536) {
						if (local22 < local27) {
							local22++;
						} else if (local27 < local22) {
							local22--;
						}
						if ((Static50.aByteArrayArrayArray3[Static56.anInt1432][local22][local31] & 0x4) != 0) {
							local15 = Static56.anInt1432;
						}
						local92 -= 65536;
					}
				}
			}
		}
		if ((Static50.aByteArrayArrayArray3[Static56.anInt1432][Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3454 >> 7][Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anInt3499 >> 7] & 0x4) != 0) {
			local15 = Static56.anInt1432;
		}
		return local15;
	}

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "(II)Lclient!ue;")
	public static Class2_Sub1_Sub18 method264(@OriginalArg(0) int arg0) {
		@Pc(12) Class2_Sub1_Sub18 local12 = (Class2_Sub1_Sub18) Static36.aClass72_9.method2259((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static7.aClass29_Sub1_7.method1030(0, arg0);
		if (local22 == null) {
			return null;
		}
		local12 = new Class2_Sub1_Sub18();
		@Pc(35) Class2_Sub11 local35 = new Class2_Sub11(local22);
		local35.anInt2077 = local35.aByteArray24.length - 12;
		@Pc(44) int local44 = 0;
		@Pc(48) int local48 = local35.method1449();
		local12.anInt3530 = local35.method1456();
		local12.anInt3532 = local35.method1456();
		local12.anInt3534 = local35.method1456();
		local12.anInt3527 = local35.method1456();
		local35.anInt2077 = 0;
		local12.aClass10_1531 = local35.method1486();
		local12.aClass10Array24 = new Class10[local48];
		local12.anIntArray372 = new int[local48];
		local12.anIntArray373 = new int[local48];
		while (local35.aByteArray24.length - 12 > local35.anInt2077) {
			@Pc(102) int local102 = local35.method1456();
			if (local102 == 3) {
				local12.aClass10Array24[local44] = local35.method1452();
			} else if (local102 >= 100 || local102 == 21 || local102 == 38 || local102 == 39) {
				local12.anIntArray373[local44] = local35.method1461();
			} else {
				local12.anIntArray373[local44] = local35.method1449();
			}
			local12.anIntArray372[local44++] = local102;
		}
		Static36.aClass72_9.method2254(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method265() {
		aClass10_195 = null;
		aLongArray2 = null;
		aClass10_197 = null;
		aClass10_198 = null;
		aClass10_196 = null;
		anIntArray28 = null;
		aClass23_1 = null;
	}

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
	public static void method267() {
		Static25.aClass72_4.method2261();
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)Z")
	public static boolean method268(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "(II)I")
	public static int method269(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
