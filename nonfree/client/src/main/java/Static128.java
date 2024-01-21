import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
	public static int anInt2673;

	@OriginalMember(owner = "client!nd", name = "W", descriptor = "I")
	public static int anInt2678;

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_978 = Static161.method2452("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!nd", name = "P", descriptor = "[I")
	public static final int[] anIntArray292 = new int[4096];

	@OriginalMember(owner = "client!nd", name = "Z", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_979 = Static161.method2452("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(III)I")
	public static int method1994(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(44) int local44 = Static172.method2764(arg1 + 45365, 4, arg0 + 91923) + (Static172.method2764(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static172.method2764(arg1, 1, arg0) + -128 >> 2) - 128;
		local44 = (int) ((double) local44 * 0.3D) + 35;
		if (local44 < 10) {
			local44 = 10;
		} else if (local44 > 60) {
			local44 = 60;
		}
		return local44;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(B)V")
	public static void method1995() {
		Static28.aByteArrayArrayArray1 = null;
		Static207.anIntArrayArrayArray13 = null;
		Static36.anIntArray45 = null;
		Static122.aClass69_11 = null;
		Static160.aByteArrayArrayArray12 = null;
		Static62.aByteArrayArrayArray4 = null;
		Static94.aByteArrayArrayArray7 = null;
		Static144.anInt2995 = 0;
		Static93.anIntArrayArrayArray9 = null;
		Static106.aByteArrayArrayArray8 = null;
		Static200.aByteArrayArrayArray15 = null;
		Static11.aClass91_1.method2682();
		Static35.aClass91_5.method2682();
		Static168.aClass87_25 = null;
		Static117.aClass87_17 = null;
		Static188.aClass87_32 = null;
		Static3.aClass87_1 = null;
		Static44.aClass87_10 = null;
		Static176.aClass87_28 = null;
		Static107.aClass5_Sub2_Sub10_5 = null;
		Static218.aClass87_37 = null;
		Static67.aClass87_36 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILclient!ld;)V")
	public static void method1996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub2_Sub2 arg2) {
		if (arg2.anInt2254 == arg1 && arg1 != -1) {
			@Pc(74) Class5_Sub2_Sub22 local74 = Static14.method253(arg1);
			@Pc(77) int local77 = local74.anInt3662;
			if (local77 == 1) {
				arg2.anInt2265 = 0;
				arg2.anInt2223 = 0;
				arg2.anInt2262 = arg0;
				arg2.anInt2237 = 0;
				Static46.method844(arg2 == Static210.aClass1_Sub2_Sub2_2, arg2.anInt2265, arg2.anInt2241, arg2.anInt2234, local74);
			}
			if (local77 == 2) {
				arg2.anInt2223 = 0;
			}
		} else if (arg1 == -1 || arg2.anInt2254 == -1 || Static14.method253(arg1).anInt3652 >= Static14.method253(arg2.anInt2254).anInt3652) {
			arg2.anInt2265 = 0;
			arg2.anInt2220 = arg2.anInt2235;
			arg2.anInt2237 = 0;
			arg2.anInt2262 = arg0;
			arg2.anInt2254 = arg1;
			arg2.anInt2223 = 0;
			if (arg2.anInt2254 != -1) {
				Static46.method844(Static210.aClass1_Sub2_Sub2_2 == arg2, arg2.anInt2265, arg2.anInt2241, arg2.anInt2234, Static14.method253(arg2.anInt2254));
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "(I)V")
	public static void method1998() {
		@Pc(16) int local16;
		if (Static28.anInt537 > 0) {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static28.anInt537 > 768) {
					Static13.anIntArray409[local16] = Static170.method2603(Static82.anIntArray177[local16], 1024 - Static28.anInt537, Static205.anIntArray413[local16]);
				} else if (Static28.anInt537 <= 256) {
					Static13.anIntArray409[local16] = Static170.method2603(Static205.anIntArray413[local16], 256 - Static28.anInt537, Static82.anIntArray177[local16]);
				} else {
					Static13.anIntArray409[local16] = Static82.anIntArray177[local16];
				}
			}
		} else if (Static55.anInt1158 > 0) {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static55.anInt1158 > 768) {
					Static13.anIntArray409[local16] = Static170.method2603(Static72.anIntArray143[local16], 1024 - Static55.anInt1158, Static205.anIntArray413[local16]);
				} else if (Static55.anInt1158 > 256) {
					Static13.anIntArray409[local16] = Static72.anIntArray143[local16];
				} else {
					Static13.anIntArray409[local16] = Static170.method2603(Static205.anIntArray413[local16], 256 - Static55.anInt1158, Static72.anIntArray143[local16]);
				}
			}
		} else {
			for (local16 = 0; local16 < 256; local16++) {
				Static13.anIntArray409[local16] = Static205.anIntArray413[local16];
			}
		}
		@Pc(158) int local158 = Static123.aClass5_Sub2_Sub10_Sub1_4.anInt3212 * 9;
		@Pc(165) int local165 = 0;
		local16 = 0;
		@Pc(184) int local184;
		@Pc(194) int local194;
		@Pc(201) int local201;
		@Pc(207) int local207;
		@Pc(214) int local214;
		@Pc(219) int local219;
		for (@Pc(169) int local169 = 1; local169 < 255; local169++) {
			local184 = Static62.anIntArray128[local169] * (256 - local169) / 256 + 22;
			if (local184 < 0) {
				local184 = 0;
			}
			local16 += local184;
			for (local194 = local184; local194 < 128; local194++) {
				local201 = Static90.anIntArray190[local16++];
				local207 = Static123.aClass5_Sub2_Sub10_Sub1_4.anIntArray347[local158++];
				if (local201 == 0) {
					Static96.aClass5_Sub2_Sub10_Sub1_3.anIntArray347[local165++] = local207;
				} else {
					local214 = local201;
					local219 = 256 - local201;
					local201 = Static13.anIntArray409[local201];
					Static96.aClass5_Sub2_Sub10_Sub1_3.anIntArray347[local165++] = (local219 * (local207 & 0xFF00FF) + local214 * (local201 & 0xFF00FF) & 0xFF00FF00) + (local219 * (local207 & 0xFF00) + (local201 & 0xFF00) * local214 & 0xFF0000) >> 8;
				}
			}
			for (local201 = 0; local201 < local184; local201++) {
				Static96.aClass5_Sub2_Sub10_Sub1_3.anIntArray347[local165++] = Static123.aClass5_Sub2_Sub10_Sub1_4.anIntArray347[local158++];
			}
			local158 += Static123.aClass5_Sub2_Sub10_Sub1_4.anInt3212 - 128;
		}
		local16 = 0;
		local165 = 0;
		Static96.aClass5_Sub2_Sub10_Sub1_3.method2414(0, 9);
		local158 = Static123.aClass5_Sub2_Sub10_Sub1_4.anInt3212 * 9 + 128;
		for (local184 = 1; local184 < 255; local184++) {
			local194 = Static62.anIntArray128[local184] * (256 - local184) / 256 + 22;
			if (local194 < 0) {
				local194 = 0;
			}
			for (local201 = 0; local201 < local194; local201++) {
				@Pc(344) int local344 = local165++;
				local158--;
				Static93.aClass5_Sub2_Sub10_Sub1_5.anIntArray347[local344] = Static123.aClass5_Sub2_Sub10_Sub1_4.anIntArray347[local158];
			}
			for (local207 = local194; local207 < 128; local207++) {
				local214 = Static90.anIntArray190[local16++];
				local158--;
				local219 = Static123.aClass5_Sub2_Sub10_Sub1_4.anIntArray347[local158];
				if (local214 == 0) {
					Static93.aClass5_Sub2_Sub10_Sub1_5.anIntArray347[local165++] = local219;
				} else {
					@Pc(377) int local377 = 256 - local214;
					@Pc(379) int local379 = local214;
					local214 = Static13.anIntArray409[local214];
					Static93.aClass5_Sub2_Sub10_Sub1_5.anIntArray347[local165++] = (local377 * (local219 & 0xFF00) + local379 * (local214 & 0xFF00) & 0xFF0000) + ((local219 & 0xFF00FF) * local377 + (local214 & 0xFF00FF) * local379 & 0xFF00FF00) >> 8;
				}
			}
			local16 += local194;
			local158 += Static123.aClass5_Sub2_Sub10_Sub1_4.anInt3212 + 128;
		}
		Static93.aClass5_Sub2_Sub10_Sub1_5.method2414(637, 9);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIB)I")
	public static int method1999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg1 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(40) int local40 = arg0;
		if (arg0 < 3 && (Static168.aByteArrayArrayArray13[1][local11][local7] & 0x2) == 2) {
			local40 = arg0 + 1;
		}
		@Pc(63) int local63 = arg1 & 0x7F;
		@Pc(67) int local67 = arg2 & 0x7F;
		@Pc(94) int local94 = Static37.anIntArrayArrayArray5[local40][local11][local7] * (128 - local63) + Static37.anIntArrayArrayArray5[local40][local11 + 1][local7] * local63 >> 7;
		@Pc(125) int local125 = local63 * Static37.anIntArrayArrayArray5[local40][local11 + 1][local7 + 1] + (128 - local63) * Static37.anIntArrayArrayArray5[local40][local11][local7 + 1] >> 7;
		return local94 * (128 - local67) + local125 * local67 >> 7;
	}
}
