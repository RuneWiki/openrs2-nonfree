import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Lclient!rca;")
	public static Class278 aClass278_2;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "Lclient!r;")
	public static Class12 aClass12_13;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!lv;Lclient!r;ILclient!kt;)Z")
	public static boolean method6323(@OriginalArg(2) Class1_Sub27 arg0, @OriginalArg(3) Class12 arg1, @OriginalArg(5) Class196 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray314 != null) {
			local13 = Static313.anInt4092 - (arg2.anInt5152 + arg0.anInt5623 - Static313.anInt4089) * (-Static313.anInt4086 + Static313.anInt4092) / (Static313.anInt4094 - Static313.anInt4089);
			local11 = Static313.anInt4092 - (arg0.anInt5623 + arg2.anInt5162 - Static313.anInt4089) * (-Static313.anInt4086 + Static313.anInt4092) / (Static313.anInt4094 - Static313.anInt4089);
			local7 = Static313.anInt4090 + (Static313.anInt4091 - Static313.anInt4090) * (-Static313.anInt4093 + (arg2.anInt5160 - -arg0.anInt5627)) / (Static313.anInt4088 - Static313.anInt4093);
			local9 = Static313.anInt4090 + (Static313.anInt4091 - Static313.anInt4090) * (arg0.anInt5627 + (arg2.anInt5156 - Static313.anInt4093)) / (Static313.anInt4088 - Static313.anInt4093);
		}
		@Pc(104) Class10 local104 = null;
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 0;
		@Pc(110) int local110 = 0;
		@Pc(117) int local117 = 0;
		if (arg2.anInt5179 != -1) {
			if (arg0.aBoolean417 && arg2.anInt5176 != -1) {
				local104 = arg2.method4331(arg1, true);
			} else {
				local104 = arg2.method4331(arg1, false);
			}
			if (local104 != null) {
				local106 = arg0.anInt5626 - (local104.A() + 1 >> 1);
				if (local7 > local106) {
					local7 = local106;
				}
				local108 = arg0.anInt5626 + (local104.A() + 1 >> 1);
				local110 = arg0.anInt5622 - (local104.ca() + 1 >> 1);
				if (local108 > local9) {
					local9 = local108;
				}
				if (local110 < local11) {
					local11 = local110;
				}
				local117 = arg0.anInt5622 + (local104.ca() + 1 >> 1);
				if (local117 > local13) {
					local13 = local117;
				}
			}
		}
		@Pc(215) Class27 local215 = null;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(225) int local225 = 0;
		@Pc(227) int local227 = 0;
		@Pc(229) int local229 = 0;
		@Pc(280) int local280;
		@Pc(303) int local303;
		if (arg2.aString57 != null) {
			local215 = Static53.method1247(arg2.anInt5171);
			if (local215 != null) {
				local217 = Static481.aClass13_13.method458(null, Static461.aStringArray31, arg2.aString57, null);
				local219 = arg0.anInt5622;
				if (local104 == null) {
					local219 -= local217 * local215.method854() / 2;
				} else {
					local219 -= (local104.ca() >> 1) + local217 * local215.method849();
				}
				for (local280 = 0; local280 < local217; local280++) {
					@Pc(286) String local286 = Static461.aStringArray31[local280];
					if (local280 < local217 - 1) {
						local286 = local286.substring(0, local286.length() - 4);
					}
					local303 = local215.method855(local286);
					if (local221 < local303) {
						local221 = local303;
					}
				}
				local223 = arg0.anInt5626 - local221 / 2;
				if (local7 > local223) {
					local7 = local223;
				}
				local225 = arg0.anInt5626 + local221 / 2;
				if (local9 < local225) {
					local9 = local225;
				}
				local227 = local219;
				if (local11 > local227) {
					local11 = local227;
				}
				local229 = local219 + local215.method849() * local217;
				if (local13 < local229) {
					local13 = local229;
				}
			}
		}
		if (Static313.anInt4090 > local9 || local7 > Static313.anInt4091 || Static313.anInt4086 > local13 || local11 > Static313.anInt4092) {
			return true;
		}
		@Pc(407) int local407;
		if (arg2.anIntArray314 != null) {
			@Pc(405) int[] local405 = new int[arg2.anIntArray314.length];
			for (local407 = 0; local407 < local405.length / 2; local407++) {
				local303 = arg0.anInt5627 + arg2.anIntArray314[local407 * 2];
				@Pc(432) int local432 = arg2.anIntArray314[local407 * 2 + 1] + arg0.anInt5623;
				local405[local407 * 2] = Static313.anInt4090 + (Static313.anInt4091 - Static313.anInt4090) * (-Static313.anInt4093 + local303) / (Static313.anInt4088 - Static313.anInt4093);
				local405[local407 * 2 + 1] = Static313.anInt4092 - (Static313.anInt4092 - Static313.anInt4086) * (local432 - Static313.anInt4089) / (Static313.anInt4094 - Static313.anInt4089);
			}
			Static458.method6502(arg1, local405, arg2.anInt5168);
			for (local303 = 0; local303 < local405.length / 2 - 1; local303++) {
				arg1.method6427(arg2.anInt5170, local405[local303 * 2], local405[local303 * 2 + 2 + 1], local405[local303 * 2 + 2], local405[local303 * 2 + 1]);
			}
			arg1.method6427(arg2.anInt5170, local405[local405.length - 2], local405[1], local405[0], local405[local405.length - 1]);
		}
		if (local104 != null) {
			if (Static538.anInt8880 > 0 && (Static297.anInt8265 != -1 && Static297.anInt8265 == arg0.anInt5625 || Static519.anInt8575 != -1 && arg2.anInt5173 == Static519.anInt8575)) {
				if (Static44.anInt1118 > 50) {
					local280 = (100 - Static44.anInt1118) * 2;
				} else {
					local280 = Static44.anInt1118 * 2;
				}
				local407 = local280 << 24 | 0xFFFF00;
				arg1.method6450(arg0.anInt5622, local407, arg0.anInt5626, local104.E() / 2 + 7);
				arg1.method6450(arg0.anInt5622, local407, arg0.anInt5626, local104.E() / 2 + 5);
				arg1.method6450(arg0.anInt5622, local407, arg0.anInt5626, local104.E() / 2 + 3);
				arg1.method6450(arg0.anInt5622, local407, arg0.anInt5626, local104.E() / 2 + 1);
				arg1.method6450(arg0.anInt5622, local407, arg0.anInt5626, local104.E() / 2);
			}
			local104.method7679(arg0.anInt5626 - (local104.A() >> 1), arg0.anInt5622 + -(local104.ca() >> 1));
		}
		if (arg2.aString57 != null && local215 != null) {
			Static6.method5140(arg2, arg1, local217, local219, local221, arg0, local215);
		}
		if (arg2.anInt5179 != -1 || arg2.aString57 != null) {
			@Pc(717) Class1_Sub47 local717 = new Class1_Sub47(arg0);
			local717.anInt8482 = local110;
			local717.anInt8477 = local106;
			local717.anInt8484 = local223;
			local717.anInt8487 = local227;
			local717.anInt8481 = local117;
			local717.anInt8485 = local225;
			local717.anInt8486 = local108;
			local717.anInt8479 = local229;
			Static266.aClass361_88.method7855(local717);
		}
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V")
	public static void method6325(@OriginalArg(0) boolean arg0) {
		Static474.anInt1075 = 0;
		Static553.anInt9060 = 0;
		Static323.method4890();
		Static471.method6667(arg0);
		Static193.method3392();
		@Pc(20) boolean local20 = false;
		@Pc(28) int local28;
		for (@Pc(22) int local22 = 0; local22 < Static553.anInt9060; local22++) {
			local28 = Static440.anIntArray502[local22];
			@Pc(35) Class1_Sub39 local35 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local28);
			@Pc(38) Class20_Sub2_Sub4_Sub1_Sub2 local38 = local35.aClass20_Sub2_Sub4_Sub1_Sub2_2;
			if (Static294.aBoolean407 && Static463.method6580(local28)) {
				Static38.method901();
			}
			if (local38.anInt6399 != Static81.anInt1910) {
				if (local38.aClass162_1.method3798()) {
					Static158.method2424(local38);
				}
				local38.method5359(null);
				local20 = true;
				local35.method7878();
			}
		}
		if (local20) {
			Static491.anInt1754 = Static131.aClass356_32.method7799();
			Static131.aClass356_32.method7791(Static471.aClass1_Sub39Array1);
		}
		if (Static480.aClass1_Sub20_Sub1_1.anInt5238 != Static494.anInt8294) {
			throw new RuntimeException("gnp1 pos:" + Static480.aClass1_Sub20_Sub1_1.anInt5238 + " psize:" + Static494.anInt8294);
		}
		for (local28 = 0; local28 < Static480.anInt8097; local28++) {
			if (Static131.aClass356_32.method7796((long) Static542.anIntArray599[local28]) == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static480.anInt8097);
			}
		}
	}
}
