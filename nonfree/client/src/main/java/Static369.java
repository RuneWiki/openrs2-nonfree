import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)S")
	public static short method7613(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 >> 10 & 0x3F;
		@Pc(19) int local19 = arg0 >> 3 & 0x70;
		@Pc(23) int local23 = arg0 & 0x7F;
		@Pc(42) int local42 = local23 <= 64 ? local23 * local19 >> 7 : (127 - local23) * local19 >> 7;
		@Pc(47) int local47 = local23 + local42;
		@Pc(58) int local58;
		if (local47 == 0) {
			local58 = local42 << 1;
		} else {
			local58 = (local42 << 8) / local47;
		}
		return (short) (local13 << 10 | local58 >> 4 << 7 | local47);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIILclient!da;I)Lclient!eh;")
	public static Class93 method7616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class65 arg3) {
		return arg3 == null ? null : new Class93(arg0, arg1, arg2, arg3.K(), arg3.KA(), arg3.l(), arg3.J(), arg3.H(), arg3.OA(), arg3.za());
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!hw;Lclient!sj;II)V")
	public static void method7617(@OriginalArg(1) Class21_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) Class4_Sub13_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg2 & 0x2) != 0) {
			arg0.anInt4323 = arg1.method6995();
			if (arg0.anInt4277 == 0) {
				arg0.method3325(arg0.anInt4323);
				arg0.anInt4323 = -1;
			}
		}
		@Pc(38) int local38;
		@Pc(49) int local49;
		@Pc(53) int local53;
		if ((arg2 & 0x10) != 0) {
			local38 = arg1.method6995();
			if (local38 == 65535) {
				local38 = -1;
			}
			local49 = arg1.method6989();
			local53 = arg1.method7004();
			arg0.method3336(local53, false, local49, local38);
		}
		if ((arg2 & 0x40000) != 0) {
			arg0.aByte62 = arg1.method7008();
			arg0.aByte65 = arg1.method7045();
			arg0.aByte63 = arg1.method7007();
			arg0.aByte64 = (byte) arg1.method6987();
			arg0.anInt4273 = Static306.anInt6122 + arg1.method7010();
			arg0.anInt4217 = Static306.anInt6122 + arg1.method7035();
		}
		@Pc(118) int local118;
		@Pc(124) int local124;
		@Pc(135) int local135;
		@Pc(113) int[] local113;
		@Pc(116) int[] local116;
		if ((arg2 & 0x20000) != 0) {
			local38 = arg1.method7004();
			local113 = new int[local38];
			local116 = new int[local38];
			for (local118 = 0; local118 < local38; local118++) {
				local124 = arg1.method6995();
				if ((local124 & 0xC000) == 49152) {
					local135 = arg1.method7054();
					local113[local118] = local124 << 16 | local135;
				} else {
					local113[local118] = local124;
				}
				local116[local118] = arg1.method7035();
			}
			arg0.method3332(local116, local113);
		}
		if ((arg2 & 0x100) != 0) {
			arg0.aBoolean302 = arg1.method7009() == 1;
		}
		if ((arg2 & 0x8000) != 0) {
			local38 = arg1.method6995();
			if (local38 == 65535) {
				local38 = -1;
			}
			local49 = arg1.method7046();
			local53 = arg1.method7005();
			arg0.method3336(local53, true, local49, local38);
		}
		if ((arg2 & 0x80) != 0) {
			local38 = arg1.method7019();
			local49 = arg1.method6987();
			arg0.method3331(Static306.anInt6122, local49, local38);
			arg0.anInt4264 = Static306.anInt6122 + 300;
			arg0.anInt4276 = arg1.method6987();
		}
		if ((arg2 & 0x20) != 0) {
			local38 = arg1.method6987();
			@Pc(260) byte[] local260 = new byte[local38];
			@Pc(265) Class4_Sub13 local265 = new Class4_Sub13(local260);
			arg1.method6988(local260, local38);
			Static229.aClass4_Sub13Array1[arg3] = local265;
			arg0.method3356(local265);
		}
		if ((arg2 & 0x1) != 0) {
			Static298.aByteArray48[arg3] = arg1.method7045();
		}
		if ((arg2 & 0x800) != 0) {
			arg0.anInt4239 = arg1.method7045();
			arg0.anInt4274 = arg1.method7045();
			arg0.anInt4227 = arg1.method7007();
			arg0.anInt4259 = arg1.method7011();
			arg0.anInt4242 = arg1.method7010() + Static306.anInt6122;
			arg0.anInt4212 = arg1.method7054() + Static306.anInt6122;
			arg0.anInt4215 = arg1.method7005();
			arg0.anInt4280 = 0;
			if (arg0.aBoolean303) {
				arg0.anInt4239 += arg0.anInt4310;
				arg0.anInt4274 += arg0.anInt4288;
				arg0.anInt4259 += arg0.anInt4288;
				arg0.anInt4227 += arg0.anInt4310;
				arg0.anInt4277 = 0;
			} else {
				arg0.anInt4227 += arg0.anIntArray206[0];
				arg0.anInt4277 = 1;
				arg0.anInt4259 += arg0.anIntArray207[0];
				arg0.anInt4274 += arg0.anIntArray207[0];
				arg0.anInt4239 += arg0.anIntArray206[0];
			}
		}
		if ((arg2 & 0x200) != 0) {
			local38 = arg1.method7010();
			arg0.anInt4238 = arg1.method7005();
			arg0.anInt4208 = arg1.method6987();
			arg0.anInt4221 = local38 & 0x7FFF;
			arg0.aBoolean296 = (local38 & 0x8000) != 0;
			arg0.anInt4229 = Static306.anInt6122 + arg0.anInt4221 + arg0.anInt4238;
		}
		if ((arg2 & 0x4) != 0) {
			local38 = arg1.method7035();
			if (local38 == 65535) {
				local38 = -1;
			}
			arg0.anInt4263 = local38;
		}
		if ((arg2 & 0x2000) != 0) {
			local38 = arg1.method6987();
			local113 = new int[local38];
			local116 = new int[local38];
			@Pc(491) int[] local491 = new int[local38];
			for (local124 = 0; local124 < local38; local124++) {
				local135 = arg1.method7010();
				if (local135 == 65535) {
					local135 = -1;
				}
				local113[local124] = local135;
				local116[local124] = arg1.method6987();
				local491[local124] = arg1.method7035();
			}
			Static101.method1936(local491, local116, arg0, local113);
		}
		if ((arg2 & 0x40) != 0) {
			@Pc(542) int[] local542 = new int[4];
			for (local49 = 0; local49 < 4; local49++) {
				local542[local49] = arg1.method7010();
				if (local542[local49] == 65535) {
					local542[local49] = -1;
				}
			}
			local53 = arg1.method7005();
			Static256.method4060(arg0, local53, local542);
		}
		if ((arg2 & 0x4000) != 0) {
			arg0.aString86 = arg1.method7016();
			if (arg0.aString86.charAt(0) == '~') {
				arg0.aString86 = arg0.aString86.substring(1);
				Static84.method1791(2, arg0.method3348(), arg0.method3345(), arg0.aString86, 0, arg0.aString88);
			} else if (arg0 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2) {
				Static84.method1791(2, arg0.method3348(), arg0.method3345(), arg0.aString86, 0, arg0.aString88);
			}
			arg0.anInt4240 = 150;
			arg0.anInt4205 = 0;
			arg0.anInt4248 = 0;
		}
		if ((arg2 & 0x400) != 0) {
			local7 = arg1.method7008();
		}
		if ((arg2 & 0x10000) != 0) {
			local49 = Static306.anInt6122;
			local53 = arg1.method7019();
			local118 = arg1.method6987();
			arg0.method3331(local49, local118, local53);
		}
		if (!arg0.aBoolean303) {
			return;
		}
		if (local7 == 127) {
			arg0.method3346(arg0.anInt4310, arg0.anInt4288);
			return;
		}
		@Pc(706) byte local706;
		if (local7 == -1) {
			local706 = Static298.aByteArray48[arg3];
		} else {
			local706 = local7;
		}
		arg0.method3351(arg0.anInt4288, arg0.anInt4310, local706);
	}
}
