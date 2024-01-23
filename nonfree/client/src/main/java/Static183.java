import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!pa;")
	public static Class86 aClass86_70;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "[Lclient!rh;")
	public static Class78_Sub1[] aClass78_Sub1Array5;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
	public static int anInt3789 = 0;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "Z")
	public static boolean aBoolean172 = false;

	@OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
	public static int anInt3798 = 0;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "[Lclient!qi;")
	public static Class94[] aClass94Array4 = new Class94[5000];

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1235 = Static186.method3527("m");

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public static void method3000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub11 local28 = Static56.aClass1_Sub11ArrayArrayArray3[local9][arg0][arg1] = Static56.aClass1_Sub11ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt1067--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt1072; local38++) {
					@Pc(44) Class94 local44 = local28.aClass94Array1[local38];
					if ((local44.aLong143 >> 29 & 0x3L) == 2L && local44.anInt3686 == arg0 && local44.anInt3683 == arg1) {
						local44.anInt3685--;
					}
				}
			}
		}
		if (Static56.aClass1_Sub11ArrayArrayArray3[0][arg0][arg1] == null) {
			Static56.aClass1_Sub11ArrayArrayArray3[0][arg0][arg1] = new Class1_Sub11(0, arg0, arg1);
		}
		Static56.aClass1_Sub11ArrayArrayArray3[0][arg0][arg1].aClass1_Sub11_1 = local7;
		Static56.aClass1_Sub11ArrayArrayArray3[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Lclient!wg;")
	public static Class128 method3004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class128 local14 = local7.aClass128_1;
			local7.aClass128_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!pa;)V")
	public static void method3005(@OriginalArg(1) Class86 arg0) {
		Static196.aClass86_74 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V")
	public static void method3006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(10) int local10 = 1;
		@Pc(13) int[] local13 = new int[4];
		local8[0] = arg1;
		local13[0] = arg0;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (Static221.anIntArray497[local23] != arg1) {
				local8[local10] = Static221.anIntArray497[local23];
				local13[local10] = Static175.anIntArray396[local23];
				local10++;
			}
		}
		Static175.anIntArray396 = local13;
		Static221.anIntArray497 = local8;
		Static144.method2383(Static53.aClass106Array1.length - 1, Static53.aClass106Array1, 0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B[I)[I")
	public static int[] method3007(@OriginalArg(1) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) int[] local11 = new int[arg0.length];
			Static235.method865(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public static void method3008() {
		@Pc(3) Class81 local3 = Static32.aClass81_1;
		synchronized (Static32.aClass81_1) {
			Static93.anInt1907++;
			Static2.anInt53 = Static84.anInt1729;
			@Pc(22) int local22;
			if (Static221.anInt4310 >= 0) {
				while (Static221.anInt4310 != Static130.anInt2695) {
					local22 = Static12.anIntArray27[Static130.anInt2695];
					Static130.anInt2695 = Static130.anInt2695 + 1 & 0x7F;
					if (local22 >= 0) {
						Static188.aBooleanArray21[local22] = true;
					} else {
						Static188.aBooleanArray21[~local22] = false;
					}
				}
			} else {
				for (local22 = 0; local22 < 112; local22++) {
					Static188.aBooleanArray21[local22] = false;
				}
				Static221.anInt4310 = Static130.anInt2695;
			}
			Static84.anInt1729 = Static153.anInt3178;
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)V")
	public static void method3009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class75 local11 = Static182.aClass75ArrayArrayArray1[Static212.anInt4195][arg0][arg1];
		if (local11 == null) {
			Static153.method2558(Static212.anInt4195, arg0, arg1);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class1_Sub1_Sub3 local23 = null;
		@Pc(28) Class1_Sub1_Sub3 local28;
		for (local28 = (Class1_Sub1_Sub3) local11.method2239(); local28 != null; local28 = (Class1_Sub1_Sub3) local11.method2238()) {
			@Pc(35) Class70 local35 = Static16.method227(local28.aClass20_Sub2_1.anInt1196);
			@Pc(38) int local38 = local35.anInt2438;
			if (local35.anInt2430 == 1) {
				local38 *= local28.aClass20_Sub2_1.anInt1198 + 1;
			}
			if (local38 > local21) {
				local23 = local28;
				local21 = local38;
			}
		}
		if (local23 == null) {
			Static153.method2558(Static212.anInt4195, arg0, arg1);
			return;
		}
		local11.method2236(local23);
		@Pc(78) Class20_Sub2 local78 = null;
		local28 = (Class1_Sub1_Sub3) local11.method2239();
		@Pc(85) Class20_Sub2 local85 = null;
		while (local28 != null) {
			@Pc(89) Class20_Sub2 local89 = local28.aClass20_Sub2_1;
			if (local89.anInt1196 != local23.aClass20_Sub2_1.anInt1196) {
				if (local78 == null) {
					local78 = local89;
				}
				if (local78.anInt1196 != local89.anInt1196 && local85 == null) {
					local85 = local89;
				}
			}
			local28 = (Class1_Sub1_Sub3) local11.method2238();
		}
		@Pc(124) long local124 = (long) ((arg1 << 7) + arg0 + 1610612736);
		Static60.method903(Static212.anInt4195, arg0, arg1, Static131.method2213(arg1 * 128 + 64, arg0 * 128 - -64, Static212.anInt4195), local23.aClass20_Sub2_1, local124, local78, local85);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!pa;Lclient!pa;)V")
	public static void method3010(@OriginalArg(1) Class86 arg0, @OriginalArg(2) Class86 arg1) {
		Static222.aClass86_82 = arg0;
		aClass86_70 = arg1;
	}
}
