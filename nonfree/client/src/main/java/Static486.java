import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
	public static int anInt8842;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZIZZI)V")
	public static void method7265(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		Static541.method7948(0, arg2, arg3, arg0, arg1, Static197.aClass23_Sub1Array1.length - 1);
		Static369.anInt6841 = 0;
		Static330.aClass12_Sub37_1 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZII)Z")
	public static boolean method7266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BILclient!j;ILclient!du;Lclient!qa;)Z")
	public static boolean method7267(@OriginalArg(2) Class152 arg0, @OriginalArg(4) Class12_Sub12 arg1, @OriginalArg(5) Class42 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray344 != null) {
			local13 = Static2.anInt5915 - (Static2.anInt5915 - Static2.anInt5912) * (arg0.anInt4739 - (-arg1.anInt2334 - -Static2.anInt5913)) / (Static2.anInt5921 - Static2.anInt5913);
			local11 = Static2.anInt5915 - (Static2.anInt5915 - Static2.anInt5912) * (arg0.anInt4746 + arg1.anInt2334 - Static2.anInt5913) / (Static2.anInt5921 - Static2.anInt5913);
			local7 = (arg1.anInt2332 + arg0.anInt4734 - Static2.anInt5918) * (Static2.anInt5922 - Static2.anInt5919) / (Static2.anInt5917 - Static2.anInt5918) + Static2.anInt5919;
			local9 = Static2.anInt5919 + (arg1.anInt2332 + arg0.anInt4751 - Static2.anInt5918) * (-Static2.anInt5919 + Static2.anInt5922) / (Static2.anInt5917 - Static2.anInt5918);
		}
		@Pc(105) Class84 local105 = null;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		if (arg0.anInt4736 != -1) {
			if (arg1.aBoolean197 && arg0.anInt4722 != -1) {
				local105 = arg0.method4017(true, arg2);
			} else {
				local105 = arg0.method4017(false, arg2);
			}
			if (local105 != null) {
				local107 = arg1.anInt2335 - (local105.EA() + 1 >> 1);
				if (local7 > local107) {
					local7 = local107;
				}
				local109 = arg1.anInt2335 + (local105.EA() + 1 >> 1);
				local111 = arg1.anInt2329 - (local105.ma() + 1 >> 1);
				if (local9 < local109) {
					local9 = local109;
				}
				if (local111 < local11) {
					local11 = local111;
				}
				local113 = arg1.anInt2329 + (local105.ma() + 1 >> 1);
				if (local13 < local113) {
					local13 = local113;
				}
			}
		}
		@Pc(207) Class17 local207 = null;
		@Pc(209) int local209 = 0;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(270) int local270;
		@Pc(297) int local297;
		if (arg0.aString44 != null) {
			local207 = Static23.method7566(arg0.anInt4756);
			if (local207 != null) {
				local209 = Static186.aClass244_3.method6158(Static141.aStringArray18, null, arg0.aString44, null);
				local211 = arg1.anInt2329;
				if (local105 == null) {
					local211 -= local207.method426() * local209 / 2;
				} else {
					local211 -= (local105.ma() >> 1) + local207.method423() * local209;
				}
				for (local270 = 0; local270 < local209; local270++) {
					@Pc(276) String local276 = Static141.aStringArray18[local270];
					if (local209 - 1 > local270) {
						local276 = local276.substring(0, local276.length() - 4);
					}
					local297 = local207.method421(local276);
					if (local213 < local297) {
						local213 = local297;
					}
				}
				local215 = arg1.anInt2335 - local213 / 2;
				if (local215 < local7) {
					local7 = local215;
				}
				local217 = arg1.anInt2335 + local213 / 2;
				if (local9 < local217) {
					local9 = local217;
				}
				local219 = local211;
				local221 = local211 + local207.method423() * local209;
				if (local11 > local219) {
					local11 = local219;
				}
				if (local221 > local13) {
					local13 = local221;
				}
			}
		}
		if (Static2.anInt5919 > local9 || local7 > Static2.anInt5922 || local13 < Static2.anInt5912 || local11 > Static2.anInt5915) {
			return true;
		}
		@Pc(406) int local406;
		if (arg0.anIntArray344 != null) {
			@Pc(404) int[] local404 = new int[arg0.anIntArray344.length];
			for (local406 = 0; local406 < local404.length / 2; local406++) {
				local297 = arg1.anInt2332 + arg0.anIntArray344[local406 * 2];
				@Pc(430) int local430 = arg1.anInt2334 + arg0.anIntArray344[local406 * 2 + 1];
				local404[local406 * 2] = (local297 - Static2.anInt5918) * (Static2.anInt5922 - Static2.anInt5919) / (Static2.anInt5917 - Static2.anInt5918) + Static2.anInt5919;
				local404[local406 * 2 + 1] = Static2.anInt5915 - (Static2.anInt5915 - Static2.anInt5912) * (-Static2.anInt5913 + local430) / (Static2.anInt5921 - Static2.anInt5913);
			}
			Static364.method5688(arg2, local404, arg0.anInt4735);
			for (local297 = 0; local297 < local404.length / 2 - 1; local297++) {
				arg2.method5865(local404[local297 * 2 + 1], local404[(local297 + 1) * 2], local404[(local297 + 1) * 2 + 1], arg0.anInt4750, local404[local297 * 2]);
			}
			arg2.method5865(local404[local404.length - 1], local404[0], local404[1], arg0.anInt4750, local404[local404.length - 2]);
		}
		if (local105 != null) {
			if (Static247.anInt5085 > 0 && (Static420.anInt7807 != -1 && arg1.anInt2333 == Static420.anInt7807 || Static288.anInt5602 != -1 && Static288.anInt5602 == arg0.anInt4724)) {
				if (Static40.anInt812 > 50) {
					local270 = 200 - Static40.anInt812 * 2;
				} else {
					local270 = Static40.anInt812 * 2;
				}
				local406 = local270 << 24 | 0xFFFF00;
				arg2.method5838(local406, arg1.anInt2335, local105.c() / 2 + 7, arg1.anInt2329);
				arg2.method5838(local406, arg1.anInt2335, local105.c() / 2 + 5, arg1.anInt2329);
				arg2.method5838(local406, arg1.anInt2335, local105.c() / 2 + 3, arg1.anInt2329);
				arg2.method5838(local406, arg1.anInt2335, local105.c() / 2 + 1, arg1.anInt2329);
				arg2.method5838(local406, arg1.anInt2335, local105.c() / 2, arg1.anInt2329);
			}
			local105.method7487(arg1.anInt2335 - (local105.EA() >> 1), arg1.anInt2329 + -(local105.ma() >> 1));
		}
		if (arg0.aString44 != null && local207 != null) {
			Static350.method5482(arg1, arg0, arg2, local211, local207, local213, local209);
		}
		if (arg0.anInt4736 != -1 || arg0.aString44 != null) {
			@Pc(727) Class12_Sub2 local727 = new Class12_Sub2(arg1);
			local727.anInt262 = local215;
			local727.anInt263 = local111;
			local727.anInt261 = local109;
			local727.anInt259 = local221;
			local727.anInt265 = local219;
			local727.anInt264 = local107;
			local727.anInt260 = local217;
			local727.anInt257 = local113;
			Static284.aClass73_46.method2012(local727);
		}
		return false;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)V")
	public static void method7268(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static409.anInt7683 - Static236.anInt4926;
		if (local8 >= 100) {
			Static242.anInt4993 = 1;
			return;
		}
		@Pc(17) int local17 = (int) Static49.aFloat10;
		if (local17 < Static32.anInt534 >> 8) {
			local17 = Static32.anInt534 >> 8;
		}
		if (Static110.aBooleanArray22[4] && local17 < Static325.anIntArray433[4] + 128) {
			local17 = Static325.anIntArray433[4] + 128;
		}
		@Pc(54) int local54 = (int) Static500.aFloat186 + Static525.anInt9367 & 0x3FFF;
		Static52.method1403(Static112.anInt2594, arg0, local17, Static443.method6717(Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416, Static56.anInt1418) - 50, local54, Static401.anInt7550, (local17 >> 3) * 3 + 600 << 0);
		@Pc(98) float local98 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static519.anInt9341 = (int) (local98 * (float) (Static519.anInt9341 - Static259.anInt5252) + (float) Static259.anInt5252);
		Static62.anInt1472 = (int) ((float) (Static62.anInt1472 - Static160.anInt3747) * local98 + (float) Static160.anInt3747);
		Static6.anInt93 = (int) (local98 * (float) (Static6.anInt93 - Static257.anInt5237) + (float) Static257.anInt5237);
		Static368.anInt6832 = (int) ((float) Static165.anInt3828 + (float) (Static368.anInt6832 - Static165.anInt3828) * local98);
		@Pc(153) int local153 = Static248.anInt5104 - Static400.anInt7503;
		if (local153 > 8192) {
			local153 -= 16384;
		} else if (local153 < -8192) {
			local153 += 16384;
		}
		Static248.anInt5104 = (int) ((float) Static400.anInt7503 + (float) local153 * local98);
		Static248.anInt5104 &= 0x3FFF;
	}
}
