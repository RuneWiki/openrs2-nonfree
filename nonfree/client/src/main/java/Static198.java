import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_49 = new Class181(60, 6);

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!oa;ILclient!ep;IZ)V")
	public static void method3730(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(3) int arg3) {
		@Pc(10) Class19 local10 = arg2.method2490(arg0);
		if (local10 == null) {
			return;
		}
		arg0.ca(arg1, arg3, arg1 + arg2.anInt2777, arg3 - -arg2.anInt2738);
		if (Static426.anInt7851 == 2 || Static426.anInt7851 == 5 || Static307.aClass66_16 == null) {
			arg0.L(-16777216, local10, arg1, arg3);
			return;
		}
		@Pc(66) int local66;
		@Pc(63) int local63;
		@Pc(60) int local60;
		@Pc(52) int local52;
		if (Static84.anInt1994 == 4) {
			local60 = (int) -Static412.aFloat175 & 0x3FFF;
			local63 = Static131.anInt2843;
			local52 = 4096;
			local66 = Static99.anInt2351;
		} else {
			local52 = 4096 - Static146.anInt8629 * 16;
			local60 = Static47.anInt1291 + (int) -Static412.aFloat175 & 0x3FFF;
			local63 = Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7351;
			local66 = Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7347;
		}
		@Pc(93) int local93 = local66 / 128 + 208 + 48 - Static228.anInt4746 * 2;
		@Pc(111) int local111 = Static44.anInt1275 * 4 + 208 + 48 - Static44.anInt1275 * 2 - local63 / 128;
		Static307.aClass66_16.method8069((float) arg1 + (float) arg2.anInt2777 / 2.0F, (float) arg3 + (float) arg2.anInt2738 / 2.0F, (float) local93, (float) local111, local52, local60 << 2, local10, arg1, arg3);
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(183) int local183;
		@Pc(194) int local194;
		for (@Pc(145) Class6_Sub24 local145 = (Class6_Sub24) Static469.aClass211_66.method5183(); local145 != null; local145 = (Class6_Sub24) Static469.aClass211_66.method5177()) {
			@Pc(150) int local150 = local145.anInt4156;
			local162 = (Static335.aClass183_3.anIntArray398[local150] >> 14 & 0x3FFF) - Static191.anInt4147;
			local172 = (Static335.aClass183_3.anIntArray398[local150] & 0x3FFF) - Static247.anInt5049;
			local183 = local162 * 4 + 2 - local66 / 128;
			local194 = local172 * 4 + 2 - local63 / 128;
			Static139.method2603(arg3, arg0, arg1, local183, local10, arg2, Static335.aClass183_3.anIntArray397[local150], local194);
		}
		for (local162 = 0; local162 < Static44.anInt1263; local162++) {
			local172 = Static265.anIntArray838[local162] * 4 + 2 - local66 / 128;
			local183 = Static75.anIntArray134[local162] * 4 + 2 - local63 / 128;
			@Pc(250) Class31 local250 = Static480.aClass57_11.method1469(Static387.anIntArray509[local162]);
			if (local250.anIntArray69 != null) {
				local250 = local250.method1029(Static435.aClass234_1);
				if (local250 == null || local250.anInt1080 == -1) {
					continue;
				}
			}
			Static139.method2603(arg3, arg0, arg1, local172, local10, arg2, local250.anInt1080, local183);
		}
		@Pc(334) int local334;
		@Pc(345) int local345;
		for (@Pc(290) Class6_Sub35 local290 = (Class6_Sub35) Static516.aClass305_37.method7445(); local290 != null; local290 = (Class6_Sub35) Static516.aClass305_37.method7449()) {
			local183 = (int) (local290.aLong252 >> 28 & 0x3L);
			if (local183 == Static85.anInt2084) {
				local194 = (int) (local290.aLong252 & 0x3FFFL) - Static191.anInt4147;
				@Pc(323) int local323 = (int) (local290.aLong252 >> 14 & 0x3FFFL) - Static247.anInt5049;
				local334 = local194 * 4 + 2 - local66 / 128;
				local345 = local323 * 4 + 2 - local63 / 128;
				Static429.method6568(Static548.aClass66Array14[0], arg3, arg1, local10, local345, local334, arg2);
			}
		}
		@Pc(435) int local435;
		for (local183 = 0; local183 < Static208.anInt4409; local183++) {
			@Pc(376) Class6_Sub33 local376 = (Class6_Sub33) Static506.aClass305_36.method7447((long) Static70.anIntArray111[local183]);
			if (local376 != null) {
				@Pc(381) Class11_Sub1_Sub1_Sub1 local381 = local376.aClass11_Sub1_Sub1_Sub1_2;
				if (local381.method613() && local381.aByte77 == Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77) {
					@Pc(397) Class222 local397 = local381.aClass222_1;
					if (local397 != null && local397.anIntArray464 != null) {
						local397 = local397.method5329(Static435.aClass234_1);
					}
					if (local397 != null && local397.aBoolean464 && local397.aBoolean460) {
						local345 = local381.anInt7347 / 128 - local66 / 128;
						local435 = local381.anInt7351 / 128 - local63 / 128;
						if (local397.anInt6267 == -1) {
							Static429.method6568(Static548.aClass66Array14[1], arg3, arg1, local10, local435, local345, arg2);
						} else {
							Static139.method2603(arg3, arg0, arg1, local345, local10, arg2, local397.anInt6267, local435);
						}
					}
				}
			}
		}
		local194 = Static81.anInt1953;
		@Pc(476) int[] local476 = Static227.anIntArray309;
		@Pc(523) int local523;
		@Pc(527) int local527;
		@Pc(552) int local552;
		for (local334 = 0; local334 < local194; local334++) {
			@Pc(486) Class11_Sub1_Sub1_Sub2 local486 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local476[local334]];
			if (local486 != null && local486.method6233() && Static350.aClass11_Sub1_Sub1_Sub2_4 != local486 && Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77 == local486.aByte77) {
				local435 = local486.anInt7347 / 128 - local66 / 128;
				local523 = local486.anInt7351 / 128 - local63 / 128;
				@Pc(525) boolean local525 = false;
				for (local527 = 0; local527 < Static241.anInt4921; local527++) {
					if (local486.aString95.equals(Static381.aStringArray42[local527]) && Static331.anIntArray846[local527] != 0) {
						local525 = true;
						break;
					}
				}
				@Pc(550) boolean local550 = false;
				for (local552 = 0; local552 < Static523.anInt9087; local552++) {
					if (local486.aString95.equals(Static211.aClass241Array4[local552].aString85)) {
						local550 = true;
						break;
					}
				}
				@Pc(572) boolean local572 = false;
				if (Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7466 != 0 && local486.anInt7466 != 0 && Static350.aClass11_Sub1_Sub1_Sub2_4.anInt7466 == local486.anInt7466) {
					local572 = true;
				}
				if (local486.aBoolean548) {
					Static429.method6568(Static548.aClass66Array14[6], arg3, arg1, local10, local523, local435, arg2);
				} else if (local525) {
					Static429.method6568(Static548.aClass66Array14[3], arg3, arg1, local10, local523, local435, arg2);
				} else if (local550) {
					Static429.method6568(Static548.aClass66Array14[5], arg3, arg1, local10, local523, local435, arg2);
				} else if (local572) {
					Static429.method6568(Static548.aClass66Array14[4], arg3, arg1, local10, local523, local435, arg2);
				} else {
					Static429.method6568(Static548.aClass66Array14[2], arg3, arg1, local10, local523, local435, arg2);
				}
			}
		}
		@Pc(670) Class332[] local670 = Static83.aClass332Array2;
		@Pc(752) int local752;
		for (local435 = 0; local435 < local670.length; local435++) {
			@Pc(678) Class332 local678 = local670[local435];
			if (local678 != null && local678.anInt9341 != 0 && Static508.anInt8998 % 20 < 10) {
				@Pc(716) int local716;
				if (local678.anInt9341 == 1) {
					@Pc(702) Class6_Sub33 local702 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local678.anInt9334);
					if (local702 != null) {
						@Pc(707) Class11_Sub1_Sub1_Sub1 local707 = local702.aClass11_Sub1_Sub1_Sub1_2;
						local716 = local707.anInt7347 / 128 - local66 / 128;
						local552 = local707.anInt7351 / 128 - local63 / 128;
						Static520.method7610(local10, local552, arg2, arg3, 360000L, arg1, local678.anInt9335, local716);
					}
				}
				if (local678.anInt9341 == 2) {
					local752 = local678.anInt9339 / 128 - local66 / 128;
					local527 = local678.anInt9343 / 128 - local63 / 128;
					@Pc(767) long local767 = (long) (local678.anInt9337 << 7);
					@Pc(771) long local771 = local767 * local767;
					Static520.method7610(local10, local527, arg2, arg3, local771, arg1, local678.anInt9335, local752);
				}
				if (local678.anInt9341 == 10 && local678.anInt9334 >= 0 && Static239.aClass11_Sub1_Sub1_Sub2Array1.length > local678.anInt9334) {
					@Pc(803) Class11_Sub1_Sub1_Sub2 local803 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local678.anInt9334];
					if (local803 != null) {
						local527 = local803.anInt7347 / 128 - local66 / 128;
						local716 = local803.anInt7351 / 128 - local63 / 128;
						Static520.method7610(local10, local716, arg2, arg3, 360000L, arg1, local678.anInt9335, local527);
					}
				}
			}
		}
		if (Static84.anInt1994 == 4) {
			return;
		}
		if (Static350.anInt5889 != 0) {
			local523 = Static350.anInt5889 * 4 + (Static350.aClass11_Sub1_Sub1_Sub2_4.method6212() - 1) * 2 + 2 - local66 / 128;
			local752 = Static484.anInt8777 * 4 + (Static350.aClass11_Sub1_Sub1_Sub2_4.method6212() + -1) * 2 + 2 - local63 / 128;
			Static429.method6568(Static59.aClass66Array1[Static184.aBoolean327 ? 1 : 0], arg3, arg1, local10, local752, local523, arg2);
		}
		arg0.method5409(3, 3, -1, arg2.anInt2738 / 2 + arg3 - 1, arg2.anInt2777 / 2 + -1 + arg1);
		return;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIILclient!jo;)Lclient!qda;")
	public static Class260 method3731(@OriginalArg(0) int arg0, @OriginalArg(3) Class168 arg1) {
		@Pc(14) byte[] local14 = arg1.method4435(0, arg0);
		return local14 == null ? null : new Class260(local14);
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)I")
	public static int method3732() {
		return Static38.anInt1215;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BI)I")
	public static int method3733(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
