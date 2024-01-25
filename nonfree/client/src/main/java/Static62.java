import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
	public static int anInt1251;

	@OriginalMember(owner = "client!cca", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "[I")
	public static final int[] anIntArray112 = new int[50];

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZBII)Ljava/lang/String;")
	public static String method1300(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		if (!arg0 || arg1 < 0) {
			return Integer.toString(arg1, 10);
		}
		@Pc(35) int local35 = 2;
		for (@Pc(44) int local44 = arg1 / 10; local44 != 0; local44 /= 10) {
			local35++;
		}
		@Pc(56) char[] local56 = new char[local35];
		local56[0] = '+';
		for (@Pc(64) int local64 = local35 - 1; local64 > 0; local64--) {
			@Pc(68) int local68 = arg1;
			arg1 /= 10;
			@Pc(79) int local79 = local68 - arg1 * 10;
			if (local79 >= 10) {
				local56[local64] = (char) (local79 + 87);
			} else {
				local56[local64] = (char) (local79 + 48);
			}
		}
		return new String(local56);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILclient!rs;Lclient!dm;IILclient!ha;)Z")
	public static boolean method1302(@OriginalArg(1) Class308 arg0, @OriginalArg(2) Class3_Sub18 arg1, @OriginalArg(5) Class13 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray748 != null) {
			local7 = (Static317.anInt5408 - Static317.anInt5404) * (arg0.anInt8785 - (Static317.anInt5401 - arg1.anInt2283)) / (Static317.anInt5406 - Static317.anInt5401) + Static317.anInt5404;
			local13 = Static317.anInt5411 - (arg0.anInt8783 + arg1.anInt2278 - Static317.anInt5407) * (Static317.anInt5411 - Static317.anInt5400) / (Static317.anInt5402 - Static317.anInt5407);
			local11 = Static317.anInt5411 - (Static317.anInt5411 - Static317.anInt5400) * (-Static317.anInt5407 + arg1.anInt2278 + arg0.anInt8776) / (Static317.anInt5402 - Static317.anInt5407);
			local9 = (Static317.anInt5408 - Static317.anInt5404) * (arg1.anInt2283 + (arg0.anInt8808 - Static317.anInt5401)) / (Static317.anInt5406 - Static317.anInt5401) + Static317.anInt5404;
		}
		@Pc(102) Class33 local102 = null;
		@Pc(104) int local104 = 0;
		@Pc(106) int local106 = 0;
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		if (arg0.anInt8801 != -1) {
			if (arg1.aBoolean187 && arg0.anInt8792 != -1) {
				local102 = arg0.method7691(true, arg2);
			} else {
				local102 = arg0.method7691(false, arg2);
			}
			if (local102 != null) {
				local104 = arg1.anInt2281 - (local102.method7645() + 1 >> 1);
				local106 = arg1.anInt2281 + (local102.method7645() + 1 >> 1);
				if (local104 < local7) {
					local7 = local104;
				}
				if (local9 < local106) {
					local9 = local106;
				}
				local116 = arg1.anInt2284 - (local102.method7658() + 1 >> 1);
				if (local116 < local11) {
					local11 = local116;
				}
				local118 = arg1.anInt2284 + (local102.method7658() + 1 >> 1);
				if (local13 < local118) {
					local13 = local118;
				}
			}
		}
		@Pc(219) Class256 local219 = null;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(231) int local231 = 0;
		@Pc(233) int local233 = 0;
		@Pc(235) int local235 = 0;
		@Pc(316) int local316;
		if (arg0.aString103 != null) {
			local219 = Static542.method7786(arg0.anInt8805);
			if (local219 != null) {
				local221 = Static595.aClass88_20.method2512((Class33[]) null, Static158.aStringArray3, (int[]) null, arg0.aString103);
				local223 = arg1.anInt2281 + arg0.anInt8797 * (Static317.anInt5408 - Static317.anInt5404) / (Static317.anInt5406 - Static317.anInt5401);
				local225 = arg1.anInt2284 - (Static317.anInt5411 - Static317.anInt5400) * arg0.anInt8774 / (Static317.anInt5402 - Static317.anInt5407);
				if (local102 == null) {
					local225 -= local221 * local219.method6200() / 2;
				} else {
					local225 -= (local102.method7658() >> 1) + (local221 * local219.method6196());
				}
				for (local316 = 0; local316 < local221; local316++) {
					@Pc(322) String local322 = Static158.aStringArray3[local316];
					if (local316 < local221 - 1) {
						local322 = local322.substring(0, local322.length() - 4);
					}
					@Pc(339) int local339 = local219.method6197(local322);
					if (local339 > local227) {
						local227 = local339;
					}
				}
				local229 = local223 - local227 / 2;
				if (local7 > local229) {
					local7 = local229;
				}
				local231 = local227 / 2 + local223;
				local233 = local225;
				if (local9 < local231) {
					local9 = local231;
				}
				if (local233 < local11) {
					local11 = local233;
				}
				local235 = local225 + local219.method6196() * local221;
				if (local235 > local13) {
					local13 = local235;
				}
			}
		}
		if (Static317.anInt5404 > local9 || local7 > Static317.anInt5408 || Static317.anInt5400 > local13 || local11 > Static317.anInt5411) {
			return true;
		}
		Static317.method4954(arg2, arg1, arg0);
		if (local102 != null) {
			if (Static122.anInt2525 > 0 && (Static246.anInt4481 != -1 && Static246.anInt4481 == arg1.anInt2277 || Static30.anInt575 != -1 && arg0.anInt8782 == Static30.anInt575)) {
				if (Static43.anInt1024 > 50) {
					local316 = 200 - Static43.anInt1024 * 2;
				} else {
					local316 = Static43.anInt1024 * 2;
				}
				@Pc(489) int local489 = local316 << 24 | 0xFFFF00;
				arg2.method8520(arg1.anInt2284, local102.method7659() / 2 + 7, local489, arg1.anInt2281);
				arg2.method8520(arg1.anInt2284, local102.method7659() / 2 + 5, local489, arg1.anInt2281);
				arg2.method8520(arg1.anInt2284, local102.method7659() / 2 + 3, local489, arg1.anInt2281);
				arg2.method8520(arg1.anInt2284, local102.method7659() / 2 + 1, local489, arg1.anInt2281);
				arg2.method8520(arg1.anInt2284, local102.method7659() / 2, local489, arg1.anInt2281);
			}
			local102.method7654(arg1.anInt2281 - (local102.method7645() >> 1), arg1.anInt2284 + -(local102.method7658() >> 1));
		}
		if (arg0.aString103 != null && local219 != null) {
			Static270.method4397(arg2, local225, local219, local221, local223, arg0, arg1, local227);
		}
		if (arg0.anInt8801 != -1 || arg0.aString103 != null) {
			@Pc(603) Class3_Sub28 local603 = new Class3_Sub28(arg1);
			local603.anInt3880 = local229;
			local603.anInt3876 = local233;
			local603.anInt3875 = local231;
			local603.anInt3871 = local106;
			local603.anInt3879 = local235;
			local603.anInt3874 = local118;
			local603.anInt3877 = local104;
			local603.anInt3878 = local116;
			Static93.aClass338_238.method8171(local603);
		}
		return false;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILclient!or;I)V")
	public static void method1303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class260 arg2) {
		if (Static678.aClass260_21 != null || Static43.aBoolean74 || (arg2 == null || Static642.method8921(arg2) == null)) {
			return;
		}
		Static678.aClass260_21 = arg2;
		Static416.aClass260_13 = Static642.method8921(arg2);
		Static196.anInt3897 = arg0;
		Static621.anInt9954 = 0;
		Static583.anInt9381 = arg1;
		Static285.aBoolean751 = false;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZB)V")
	public static void method1305() {
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub22_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.lb);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub25_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub25_2);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub4_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub5_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub9_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub23_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub13_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub19_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub3_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub15_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub12_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub29_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub17_2);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub17_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub26_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub8_1);
		Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub10_1);
		Static128.method2422();
		Static24.aClass3_Sub22_4.method2840(2, Static24.aClass3_Sub22_4.aClass6_Sub24_1);
		Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub27_1);
		Static313.method4793();
		Static225.method3837();
		Static156.aBoolean235 = true;
	}
}
