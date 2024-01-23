import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
	public static int anInt1083 = 0;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	public static int anInt1086 = 0;

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
	public static int anInt1090 = 0;

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
	public static int anInt1091 = 1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ua;Lclient!ng;)V")
	public static void method1000(@OriginalArg(1) Class175 arg0, @OriginalArg(2) Class1_Sub2_Sub12 arg1) {
		@Pc(9) Class23_Sub1 local9 = arg0.method4287();
		if (local9 == null) {
			return;
		}
		@Pc(16) int local16 = local9.anInt4473;
		@Pc(19) int local19 = arg1.anInt3599;
		@Pc(22) int local22 = arg1.anInt3600;
		@Pc(24) int local24 = 0;
		if (local9.anInt4469 > local9.anInt4473) {
			local16 = local9.anInt4469;
		}
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(50) int local50;
		@Pc(83) int local83;
		if (arg0.aString291 != null) {
			local24 = Static11.aClass1_Sub2_Sub6_1.method4012(arg0.aString291, null, Static280.aStringArray38);
			for (local50 = 0; local50 < local24; local50++) {
				@Pc(61) String local61 = Static280.aStringArray38[local50];
				if (local24 - 1 > local50) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				local83 = Static172.aClass90_5.method2479(local61);
				if (local83 > local35) {
					local35 = local83;
				}
			}
			local37 = (local24 - 1) * Static172.aClass90_5.method2474() + Static172.aClass90_5.method2476() / 2;
		}
		local50 = arg1.anInt3599;
		if (Static109.anInt4241 + local16 > local19) {
			local50 = local35 / 2 + local16 / 2 + Static109.anInt4241 + local16 + 5;
			local19 = local16 + Static109.anInt4241;
		} else if (Static109.anInt4239 - local16 < local19) {
			local19 = Static109.anInt4239 - local16;
			local50 = Static109.anInt4239 - local35 / 2 - local16 / 2 - local16 - 5;
		}
		@Pc(174) int local174 = arg1.anInt3600 - local37 / 2;
		if (local22 < local16 + Static109.anInt4235) {
			local22 = Static109.anInt4235 + local16;
			local174 = local16 / 2 + local16 + Static109.anInt4235 + Static172.aClass90_5.method2474();
		} else if (local22 > Static109.anInt4236 - local16) {
			local174 = Static109.anInt4236 - local16 - local16 / 2 - local37;
			local22 = Static109.anInt4236 - local16;
		}
		local16 >>= 0x1;
		@Pc(234) int local234 = -2;
		local83 = (int) (Math.atan2((double) (local19 - arg1.anInt3599), (double) (local22 - arg1.anInt3600)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local9.method1493(local9.anInt4476 << 3, local9.anInt4468 << 3, local16 + (local19 << 4), local16 + (local22 << 4), local83);
		@Pc(279) int local279 = -2;
		@Pc(281) int local281 = -2;
		@Pc(283) int local283 = -2;
		if (arg0.aString291 != null) {
			local279 = local174 - Static172.aClass90_5.method2476() - 3;
			local234 = local50 - local35 / 2 - 5;
			local281 = local234 + local35 + 10;
			local283 = Static172.aClass90_5.method2474() * local24 + local279;
			if (arg0.anInt5004 != 0) {
				Static25.method397(local234, local279, local281 - local234, -local279 + local283, arg0.anInt5004, arg0.anInt5004 >>> 24);
			}
			if (arg0.anInt5021 != 0) {
				Static25.method394(local234, local279, local281 - local234, local283 + -local279, arg0.anInt5021, arg0.anInt5021 >>> 24);
			}
			for (@Pc(362) int local362 = 0; local362 < local24; local362++) {
				@Pc(373) String local373 = Static280.aStringArray38[local362];
				if (local24 - 1 > local362) {
					local373 = local373.substring(0, local373.length() - 4);
				}
				Static172.aClass90_5.method2477(local373, local50, local174, arg0.anInt5009);
				local174 += Static172.aClass90_5.method2474();
			}
		}
		if ((local19 - local16 >= Static247.anInt4467 || Static247.anInt4467 >= local16 + local19 || Static222.anInt4105 <= local22 - local16 || local22 + local16 <= Static222.anInt4105) && (Static247.anInt4467 <= local234 || Static247.anInt4467 >= local281 || Static222.anInt4105 <= local279 || local283 <= Static222.anInt4105)) {
			return;
		}
		if (arg0.aStringArray37[4] != null) {
			Static309.method4707(0, -1, arg0.aString292, arg0.aStringArray37[4], (short) 1008, (long) arg1.anInt3591, 0);
		}
		if (arg0.aStringArray37[3] != null) {
			Static309.method4707(0, -1, arg0.aString292, arg0.aStringArray37[3], (short) 1003, (long) arg1.anInt3591, 0);
		}
		if (arg0.aStringArray37[2] != null) {
			Static309.method4707(0, -1, arg0.aString292, arg0.aStringArray37[2], (short) 1011, (long) arg1.anInt3591, 0);
		}
		if (arg0.aStringArray37[1] != null) {
			Static309.method4707(0, -1, arg0.aString292, arg0.aStringArray37[1], (short) 1005, (long) arg1.anInt3591, 0);
		}
		if (arg0.aStringArray37[0] != null) {
			Static309.method4707(0, -1, arg0.aString292, arg0.aStringArray37[0], (short) 1007, (long) arg1.anInt3591, 0);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	public static void method1002(@OriginalArg(0) int arg0) {
		Static125.anInt2557 = arg0;
		Static132.anInt3684 = -1;
		Static61.anInt1168 = -1;
		Static257.method4079();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public static void method1003() {
		Static53.aClass45_1.method4593();
		@Pc(10) int local10;
		for (local10 = 0; local10 < 32; local10++) {
			Static21.aLongArray2[local10] = 0L;
		}
		for (local10 = 0; local10 < 32; local10++) {
			Static12.aLongArray1[local10] = 0L;
		}
		Static75.anInt1557 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
	public static int method1006(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 6 & 0x3;
		@Pc(13) int local13 = arg0 & 0x3F;
		if (local13 == 18) {
			if (local9 == 0) {
				return 1;
			}
			if (local9 == 1) {
				return 2;
			}
			if (local9 == 2) {
				return 4;
			}
			if (local9 == 3) {
				return 8;
			}
		} else if (local13 == 19 || local13 == 21) {
			if (local9 == 0) {
				return 16;
			}
			if (local9 == 1) {
				return 32;
			}
			if (local9 == 2) {
				return 64;
			}
			if (local9 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
