import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!am", name = "d", descriptor = "Lclient!jj;")
	public static Class87 aClass87_1;

	@OriginalMember(owner = "client!am", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray2;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "I")
	public static int anInt260;

	@OriginalMember(owner = "client!am", name = "o", descriptor = "I")
	public static int anInt262;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!am", name = "e", descriptor = "[Lclient!tc;")
	public static Class15_Sub7[] aClass15_Sub7Array1 = new Class15_Sub7[4];

	@OriginalMember(owner = "client!am", name = "h", descriptor = "I")
	public static int anInt256 = -1;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "I")
	public static int anInt259 = -1;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "I")
	public static int anInt261 = 0;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ek;Lclient!ek;ZII)Lclient!je;")
	public static Class2_Sub8_Sub5 method234(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(4) int arg2) {
		return Static187.method3282(arg0, arg2, 0) ? Static252.method3960(arg1.method1256(arg2, 0)) : null;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)V")
	public static void method235() {
		Static236.aClass157_40.method4034(5);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	public static void method236() {
		for (@Pc(7) int local7 = 0; local7 < Static49.anInt1235; local7++) {
			@Pc(18) Class187 local18 = Static209.method3503(local7);
			if (local18 != null && local18.anInt5783 == 0) {
				Static20.anIntArray55[local7] = 0;
				Static64.anIntArray134[local7] = 0;
			}
		}
		Static164.aClass101_12 = new Class101(16);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIBIIII)V")
	public static void method237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 - arg2 >= Static53.anInt1319 && arg5 + arg2 <= Static81.anInt1915 && arg4 - arg2 >= Static148.anInt3245 && arg2 + arg4 <= Static166.anInt3675) {
			Static227.method3701(arg3, arg1, arg0, arg5, arg2, arg4);
		} else {
			Static46.method853(arg2, arg1, arg5, arg4, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public static void method239() {
		@Pc(14) int local14 = Static237.aClass2_Sub8_Sub5_5.method1237(Static204.aString145);
		@Pc(16) int local16;
		@Pc(29) int local29;
		for (local16 = 0; local16 < Static68.anInt1741; local16++) {
			local29 = Static237.aClass2_Sub8_Sub5_5.method1237(Static143.method2543(local16));
			if (local14 < local29) {
				local14 = local29;
			}
		}
		local14 += 8;
		local16 = Static68.anInt1741 * 15 + 21;
		local29 = Static169.anInt3744 - local14 / 2;
		@Pc(57) int local57 = Static75.anInt1867;
		if (local57 + local16 > Static120.anInt2649) {
			local57 = Static120.anInt2649 - local16;
		}
		if (Static60.anInt1510 < local29 + local14) {
			local29 = Static60.anInt1510 - local14;
		}
		if (local57 < 0) {
			local57 = 0;
		}
		if (local29 < 0) {
			local29 = 0;
		}
		if (Static6.anInt113 == 1) {
			if (Static169.anInt3744 == Static273.anInt5425 && Static132.anInt3027 == Static75.anInt1867) {
				Static275.anInt5450 = (Static54.aBoolean90 ? 26 : 22) + Static68.anInt1741 * 15;
				Static39.anInt982 = local57;
				Static68.anInt1739 = local29;
				Static6.anInt113 = 0;
				Static196.aBoolean281 = true;
				Static274.anInt5436 = local14;
			}
		} else if (Static169.anInt3744 == Static86.anInt2010 && Static75.anInt1867 == Static252.anInt4933) {
			Static274.anInt5436 = local14;
			Static68.anInt1739 = local29;
			Static196.aBoolean281 = true;
			Static275.anInt5450 = (Static54.aBoolean90 ? 26 : 22) + Static68.anInt1741 * 15;
			Static39.anInt982 = local57;
			Static6.anInt113 = 0;
		} else {
			Static132.anInt3027 = Static252.anInt4933;
			Static273.anInt5425 = Static86.anInt2010;
			Static6.anInt113 = 1;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!g;I)Lclient!g;")
	public static Class56 method240(@OriginalArg(0) Class56 arg0) {
		@Pc(2) Class56 local2 = Static42.method809(arg0);
		if (local2 == null) {
			local2 = arg0.aClass56_9;
		}
		return local2;
	}
}
