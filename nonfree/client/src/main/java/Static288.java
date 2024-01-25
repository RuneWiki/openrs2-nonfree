import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!oi", name = "L", descriptor = "Lclient!ok;")
	public static Class178 aClass178_89;

	@OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
	public static int anInt4801 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZZI)Lclient!kd;")
	public static Class7_Sub27 method3810(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) long local12 = (long) ((arg0 ? Integer.MIN_VALUE : 0) | arg1);
		return (Class7_Sub27) Static55.aClass164_6.method3512(local12);
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!ya;IILclient!go;B)V")
	public static void method3811(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class95 arg3) {
		@Pc(18) Class119 local18 = arg3.method2163(arg0);
		if (local18 == null) {
			return;
		}
		arg0.OA(arg2, arg1, arg2 + arg3.anInt2595, arg3.anInt2638 + arg1);
		if (Static57.anInt986 == 2 || Static57.anInt986 == 5 || Static214.aClass11_9 == null) {
			arg0.ca(-16777216, local18, arg2, arg1);
			return;
		}
		@Pc(68) int local68;
		@Pc(56) int local56;
		@Pc(65) int local65;
		@Pc(74) int local74;
		if (Static9.anInt60 == 4) {
			local65 = (int) -Static97.aFloat52 & 0x3FFF;
			local56 = Static17.anInt264;
			local74 = 4096;
			local68 = Static197.anInt3481;
		} else {
			local56 = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383;
			local65 = (int) -Static97.aFloat52 + Static436.anInt7298 & 0x3FFF;
			local68 = Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388;
			local74 = 4096 - Static3.anInt11 * 16;
		}
		@Pc(101) int local101 = local68 / 32 + 48 - (Static333.anInt3375 - 104) * 2;
		@Pc(119) int local119 = Static102.anInt2086 * 4 + 48 - local56 / 32 - (Static102.anInt2086 + -104) * 2;
		Static214.aClass11_9.method4397((float) arg3.anInt2595 / 2.0F + (float) arg2, (float) arg3.anInt2638 / 2.0F + (float) arg1, (float) local101, (float) local119, local74, local65 << 2, local18, arg2, arg1);
		@Pc(170) int local170;
		@Pc(179) int local179;
		@Pc(189) int local189;
		@Pc(200) int local200;
		for (@Pc(153) Class7_Sub2 local153 = (Class7_Sub2) Static89.aClass85_8.method2010(); local153 != null; local153 = (Class7_Sub2) Static89.aClass85_8.method2000()) {
			@Pc(158) int local158 = local153.anInt128;
			local170 = (Static52.aClass109_1.anIntArray258[local158] >> 14 & 0x3FFF) - Static359.anInt5713;
			local179 = (Static52.aClass109_1.anIntArray258[local158] & 0x3FFF) - Static314.anInt5181;
			local189 = local170 * 4 + 2 - local68 / 32;
			local200 = local179 * 4 + 2 - local56 / 32;
			Static151.method2281(local18, arg0, arg3, arg1, local200, local189, Static52.aClass109_1.anIntArray259[local158], arg2);
		}
		for (local170 = 0; local170 < Static450.anInt7435; local170++) {
			local179 = Static259.anIntArray371[local170] * 4 + 2 - local68 / 32;
			local189 = Static11.anIntArray19[local170] * 4 + 2 - local56 / 32;
			@Pc(257) Class189 local257 = Static411.aClass142_4.method3148(Static244.anIntArray524[local170]);
			if (local257.anIntArray448 != null) {
				local257 = local257.method4038(Static224.aClass239_7);
				if (local257 == null || local257.anInt5065 == -1) {
					continue;
				}
			}
			Static151.method2281(local18, arg0, arg3, arg1, local189, local179, local257.anInt5065, arg2);
		}
		for (@Pc(298) Class7_Sub34 local298 = (Class7_Sub34) Static345.aClass164_33.method3514(); local298 != null; local298 = (Class7_Sub34) Static345.aClass164_33.method3519()) {
			local189 = (int) (local298.aLong230 >> 28 & 0x3L);
			if (local189 == Static355.anInt3620) {
				local200 = (int) (local298.aLong230 & 0x3FFFL) * 4 + 2 - local68 / 32;
				@Pc(347) int local347 = (int) (local298.aLong230 >> 14 & 0x3FFFL) * 4 + 2 - local56 / 32;
				Static299.method3997(arg1, local200, local18, Static256.aClass11Array7[0], arg2, arg3, local347);
			}
		}
		@Pc(417) int local417;
		for (local189 = 0; local189 < Static56.anInt943; local189++) {
			@Pc(375) Class26_Sub2_Sub4_Sub1 local375 = Static171.aClass26_Sub2_Sub4_Sub1Array1[Static228.anIntArray347[local189]];
			if (local375 != null && local375.method4826() && local375.aByte102 == Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102) {
				@Pc(389) Class249 local389 = local375.aClass249_1;
				if (local389 != null && local389.anIntArray579 != null) {
					local389 = local389.method5179(Static224.aClass239_7);
				}
				if (local389 != null && local389.aBoolean427 && local389.aBoolean428) {
					local417 = local375.anInt7388 / 32 - local68 / 32;
					@Pc(426) int local426 = local375.anInt7383 / 32 - local56 / 32;
					if (local389.anInt6544 == -1) {
						Static299.method3997(arg1, local417, local18, Static256.aClass11Array7[1], arg2, arg3, local426);
					} else {
						Static151.method2281(local18, arg0, arg3, arg1, local426, local417, local389.anInt6544, arg2);
					}
				}
			}
		}
		local200 = Static36.anInt647;
		@Pc(467) int[] local467 = Static362.anIntArray533;
		@Pc(505) int local505;
		@Pc(515) int local515;
		@Pc(519) int local519;
		for (local417 = 0; local417 < local200; local417++) {
			@Pc(477) Class26_Sub2_Sub4_Sub2 local477 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local467[local417]];
			if (local477 != null && local477.method5528() && local477 != Static104.aClass26_Sub2_Sub4_Sub2_2 && Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102 == local477.aByte102) {
				local505 = local477.anInt7388 / 32 - local68 / 32;
				local515 = local477.anInt7383 / 32 - local56 / 32;
				@Pc(517) boolean local517 = false;
				for (local519 = 0; local519 < Static184.anInt3296; local519++) {
					if (local477.aString69.equals(Static193.aStringArray30[local519]) && Static37.anIntArray54[local519] != 0) {
						local517 = true;
						break;
					}
				}
				@Pc(545) boolean local545 = false;
				for (@Pc(547) int local547 = 0; local547 < Static267.anInt4534; local547++) {
					if (local477.aString69.equals(Static76.aClass129Array1[local547].aString39)) {
						local545 = true;
						break;
					}
				}
				@Pc(567) boolean local567 = false;
				if (Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7131 != 0 && local477.anInt7131 != 0 && Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7131 == local477.anInt7131) {
					local567 = true;
				}
				if (local477.aBoolean482) {
					Static299.method3997(arg1, local505, local18, Static256.aClass11Array7[6], arg2, arg3, local515);
				} else if (local517) {
					Static299.method3997(arg1, local505, local18, Static256.aClass11Array7[3], arg2, arg3, local515);
				} else if (local545) {
					Static299.method3997(arg1, local505, local18, Static256.aClass11Array7[5], arg2, arg3, local515);
				} else if (local567) {
					Static299.method3997(arg1, local505, local18, Static256.aClass11Array7[4], arg2, arg3, local515);
				} else {
					Static299.method3997(arg1, local505, local18, Static256.aClass11Array7[2], arg2, arg3, local515);
				}
			}
		}
		@Pc(661) Class150[] local661 = Static325.aClass150Array1;
		@Pc(746) int local746;
		for (local505 = 0; local505 < local661.length; local505++) {
			@Pc(669) Class150 local669 = local661[local505];
			if (local669 != null && local669.anInt4136 != 0 && Static274.anInt4617 % 20 < 10) {
				@Pc(722) int local722;
				if (local669.anInt4136 == 1 && local669.anInt4139 >= 0 && local669.anInt4139 < Static171.aClass26_Sub2_Sub4_Sub1Array1.length) {
					@Pc(700) Class26_Sub2_Sub4_Sub1 local700 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local669.anInt4139];
					if (local700 != null) {
						local519 = local700.anInt7388 / 32 - local68 / 32;
						local722 = local700.anInt7383 / 32 - local56 / 32;
						Static337.method4389(local18, arg3, local722, local669.anInt4138, 360000L, local519, arg1, arg2);
					}
				}
				if (local669.anInt4136 == 2) {
					local746 = local669.anInt4144 / 32 - local68 / 32;
					local519 = local669.anInt4134 / 32 - local56 / 32;
					@Pc(762) long local762 = (long) (local669.anInt4135 << 5);
					@Pc(766) long local766 = local762 * local762;
					Static337.method4389(local18, arg3, local519, local669.anInt4138, local766, local746, arg1, arg2);
				}
				if (local669.anInt4136 == 10 && local669.anInt4139 >= 0 && local669.anInt4139 < Static410.aClass26_Sub2_Sub4_Sub2Array1.length) {
					@Pc(803) Class26_Sub2_Sub4_Sub2 local803 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local669.anInt4139];
					if (local803 != null) {
						local519 = local803.anInt7388 / 32 - local68 / 32;
						local722 = local803.anInt7383 / 32 - local56 / 32;
						Static337.method4389(local18, arg3, local722, local669.anInt4138, 360000L, local519, arg1, arg2);
					}
				}
			}
		}
		if (Static9.anInt60 == 4) {
			return;
		}
		if (Static153.anInt5631 != 0) {
			local515 = Static153.anInt5631 * 4 + (Static104.aClass26_Sub2_Sub4_Sub2_2.method5512() + -1) * 2 + 2 - local68 / 32;
			local746 = Static89.anInt1837 * 4 + Static104.aClass26_Sub2_Sub4_Sub2_2.method5512() * 2 + 2 - local56 / 32 - 2;
			Static299.method3997(arg1, local515, local18, Static67.aClass11Array5[Static404.aBoolean507 ? 1 : 0], arg2, arg3, local746);
		}
		arg0.method5286(3, -1, arg2 + arg3.anInt2595 / 2 - 1, 3, arg1 + arg3.anInt2638 / 2 - 1);
	}

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)[Lclient!kq;")
	public static Class136[] method3812() {
		return new Class136[] { Static167.aClass136_5, Static141.aClass136_4, Static216.aClass136_3, Static330.aClass136_8, Static50.aClass136_1, Static208.aClass136_6 };
	}

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
	public static void method3813() {
		@Pc(5) Class126 local5 = Static281.aClass126_61;
		synchronized (Static281.aClass126_61) {
			Static281.aClass126_61.method2821();
		}
		local5 = Static36.aClass126_4;
		synchronized (Static36.aClass126_4) {
			Static36.aClass126_4.method2821();
		}
	}
}
