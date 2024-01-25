import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "[I")
	public static final int[] anIntArray487 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
	public static int anInt5907 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILclient!en;Lclient!lm;Lclient!gk;I)Z")
	public static boolean method5241(@OriginalArg(2) Class59 arg0, @OriginalArg(3) Class121 arg1, @OriginalArg(4) Class5_Sub18 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray269 != null) {
			local7 = Static186.anInt6006 + (Static186.anInt6013 - Static186.anInt6006) * (-Static186.anInt6010 + arg2.anInt2290 + arg1.anInt3585) / (Static186.anInt6015 - Static186.anInt6010);
			local11 = Static186.anInt6014 - (Static186.anInt6014 - Static186.anInt6009) * (arg1.anInt3586 + arg2.anInt2294 - Static186.anInt6005) / (Static186.anInt6004 - Static186.anInt6005);
			local13 = Static186.anInt6014 - (Static186.anInt6014 - Static186.anInt6009) * (-Static186.anInt6005 + arg2.anInt2294 + arg1.anInt3579) / (Static186.anInt6004 - Static186.anInt6005);
			local9 = (arg2.anInt2290 + arg1.anInt3584 - Static186.anInt6010) * (Static186.anInt6013 - Static186.anInt6006) / (Static186.anInt6015 - Static186.anInt6010) + Static186.anInt6006;
		}
		@Pc(103) Class54 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		if (arg1.anInt3562 != -1) {
			if (arg2.aBoolean148 && arg1.anInt3563 != -1) {
				local103 = arg1.method3307(arg0, true);
			} else {
				local103 = arg1.method3307(arg0, false);
			}
			if (local103 != null) {
				local105 = arg2.anInt2291 - (local103.method5560() + 1 >> 1);
				if (local105 < local7) {
					local7 = local105;
				}
				local107 = arg2.anInt2291 + (local103.method5560() + 1 >> 1);
				if (local107 > local9) {
					local9 = local107;
				}
				local109 = arg2.anInt2297 - (local103.method5576() + 1 >> 1);
				if (local109 < local11) {
					local11 = local109;
				}
				local111 = arg2.anInt2297 + (local103.method5576() + 1 >> 1);
				if (local111 > local13) {
					local13 = local111;
				}
			}
		}
		@Pc(209) Class75 local209 = null;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(277) int local277;
		@Pc(304) int local304;
		if (arg1.aString211 != null) {
			local209 = Static335.method5602(arg1.anInt3566);
			if (local209 != null) {
				local211 = Static65.aClass138_3.method3729(null, arg1.aString211, Static122.aStringArray14, null);
				local213 = arg2.anInt2297;
				if (local103 == null) {
					local213 -= local209.method2160() * local211 / 2;
				} else {
					local213 -= (local103.method5576() >> 1) + local211 * local209.method2158();
				}
				for (local277 = 0; local277 < local211; local277++) {
					@Pc(283) String local283 = Static122.aStringArray14[local277];
					if (local211 - 1 > local277) {
						local283 = local283.substring(0, local283.length() - 4);
					}
					local304 = local209.method2162(local283);
					if (local304 > local215) {
						local215 = local304;
					}
				}
				local217 = arg2.anInt2291 - local215 / 2;
				local224 = local215 / 2 + arg2.anInt2291;
				if (local217 < local7) {
					local7 = local217;
				}
				if (local9 < local224) {
					local9 = local224;
				}
				local226 = local213;
				if (local11 > local226) {
					local11 = local226;
				}
				local228 = local209.method2158() * local211 + local213;
				if (local228 > local13) {
					local13 = local228;
				}
			}
		}
		if (Static186.anInt6006 > local9 || Static186.anInt6013 < local7 || Static186.anInt6009 > local13 || local11 > Static186.anInt6014) {
			return true;
		}
		@Pc(402) int local402;
		if (arg1.anIntArray269 != null) {
			@Pc(400) int[] local400 = new int[arg1.anIntArray269.length];
			for (local402 = 0; local402 < local400.length / 2; local402++) {
				local304 = arg1.anIntArray269[local402 * 2] + arg2.anInt2290;
				@Pc(426) int local426 = arg2.anInt2294 + arg1.anIntArray269[local402 * 2 + 1];
				local400[local402 * 2] = (local304 - Static186.anInt6010) * (Static186.anInt6013 + -Static186.anInt6006) / (Static186.anInt6015 - Static186.anInt6010) + Static186.anInt6006;
				local400[local402 * 2 + 1] = Static186.anInt6014 - (local426 - Static186.anInt6005) * (-Static186.anInt6009 + Static186.anInt6014) / (Static186.anInt6004 - Static186.anInt6005);
			}
			Static174.method3295(arg0, local400, arg1.anInt3565);
			for (local304 = 0; local304 < local400.length / 2 - 1; local304++) {
				arg0.method4875(arg1.anInt3572, local400[local304 * 2 + 1], local400[(local304 + 1) * 2 + 1], local400[local304 * 2], local400[(local304 + 1) * 2]);
			}
			arg0.method4875(arg1.anInt3572, local400[local400.length - 1], local400[1], local400[local400.length - 2], local400[0]);
		}
		if (local103 != null) {
			if (Static210.anInt5623 > 0 && (Static274.anInt5377 != -1 && arg2.anInt2293 == Static274.anInt5377 || Static303.anInt5838 != -1 && Static303.anInt5838 == arg1.anInt3575)) {
				if (Static31.anInt823 <= 50) {
					local277 = Static31.anInt823 * 2;
				} else {
					local277 = (100 - Static31.anInt823) * 2;
				}
				local402 = local277 << 24 | 0xFFFF00;
				arg0.method4855(arg2.anInt2297, arg2.anInt2291, local402, local103.method5577() / 2 + 7);
				arg0.method4855(arg2.anInt2297, arg2.anInt2291, local402, local103.method5577() / 2 + 5);
				arg0.method4855(arg2.anInt2297, arg2.anInt2291, local402, local103.method5577() / 2 + 3);
				arg0.method4855(arg2.anInt2297, arg2.anInt2291, local402, local103.method5577() / 2 + 1);
				arg0.method4855(arg2.anInt2297, arg2.anInt2291, local402, local103.method5577() / 2);
			}
			local103.method5569(arg2.anInt2291 - (local103.method5560() >> 1), arg2.anInt2297 + -(local103.method5576() >> 1));
		}
		if (arg1.aString211 != null && local209 != null) {
			Static285.method5097(local213, arg0, local215, arg2, arg1, local209, local211);
		}
		if (arg1.anInt3562 != -1 || arg1.aString211 != null) {
			@Pc(715) Class5_Sub31 local715 = new Class5_Sub31(arg2);
			local715.anInt4102 = local109;
			local715.anInt4105 = local224;
			local715.anInt4104 = local105;
			local715.anInt4109 = local107;
			local715.anInt4099 = local217;
			local715.anInt4111 = local111;
			local715.anInt4110 = local226;
			local715.anInt4112 = local228;
			Static99.aClass211_8.method5609(local715);
		}
		return false;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!jf;I)Z")
	public static boolean method5242(@OriginalArg(0) Class96 arg0) {
		if (arg0.anInt2935 == 205) {
			Static28.anInt770 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)I")
	public static int method5244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static256.anIntArray385[arg1 & 0x3] : Static152.anIntArray213[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
	public static void method5245() {
		Static289.anIntArray417 = null;
		Static296.aByteArrayArrayArray26 = null;
		Static175.anIntArray264 = null;
		Static250.anIntArray379 = null;
		Static162.anIntArray225 = null;
		Static95.aByteArrayArrayArray30 = null;
		Static81.aByteArrayArrayArray9 = null;
		Static171.aByteArrayArrayArray17 = null;
		Static133.anIntArray563 = null;
		Static200.anIntArrayArrayArray17 = null;
		Static152.aByteArrayArrayArray14 = null;
		Static222.anIntArray313 = null;
	}
}
