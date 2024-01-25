import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!ru", name = "ab", descriptor = "D")
	public static double aDouble19;

	@OriginalMember(owner = "client!ru", name = "bb", descriptor = "I")
	public static int anInt8629;

	@OriginalMember(owner = "client!ru", name = "W", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_91 = new Class46(49, 3);

	@OriginalMember(owner = "client!ru", name = "Z", descriptor = "Lclient!tg;")
	public static final Class330 aClass330_55 = new Class330();

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(III)Z")
	public static boolean method7436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static12.method218(arg1, arg0) || Static532.method7864(arg0, arg1);
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
	public static void method7437() {
		Static622.anInt10382++;
		Static58.anInt1145 = 0;
		Static222.anInt4155 = 0;
		Static311.method4809();
		Static472.method6997();
		Static517.method7656();
		@Pc(25) boolean local25 = false;
		@Pc(33) int local33;
		for (@Pc(27) int local27 = 0; local27 < Static222.anInt4155; local27++) {
			local33 = Static551.anIntArray511[local27];
			@Pc(40) Class5_Sub3 local40 = (Class5_Sub3) Static445.aClass273_29.method6581((long) local33);
			@Pc(43) Class4_Sub2_Sub1_Sub1_Sub2 local43 = local40.aClass4_Sub2_Sub1_Sub1_Sub2_1;
			if (Static142.aBoolean190 && Static187.method2848(local33)) {
				Static2.method29();
			}
			if (Static622.anInt10382 != local43.anInt1230) {
				if (local43.aClass225_1.method4985()) {
					Static390.method5789(local43);
				}
				local43.method1045(null);
				local25 = true;
				local40.method9047();
			}
		}
		if (local25) {
			Static235.anInt4322 = Static445.aClass273_29.method6580();
			Static445.aClass273_29.method6584(Static467.aClass5_Sub3Array1);
		}
		if (Static50.anInt1005 != Static257.aClass5_Sub22_Sub1_1.anInt6629) {
			throw new RuntimeException("gnp1 pos:" + Static257.aClass5_Sub22_Sub1_1.anInt6629 + " psize:" + Static50.anInt1005);
		}
		for (local33 = 0; local33 < Static280.anInt4989; local33++) {
			if (Static445.aClass273_29.method6581((long) Static209.anIntArray198[local33]) == null) {
				throw new RuntimeException("gnp2 pos:" + local33 + " size:" + Static280.anInt4989);
			}
		}
		if (Static235.anInt4322 - Static280.anInt4989 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static235.anInt4322 - Static280.anInt4989));
		}
		for (@Pc(170) int local170 = 0; local170 < Static235.anInt4322; local170++) {
			if (Static467.aClass5_Sub3Array1[local170].aClass4_Sub2_Sub1_Sub1_Sub2_1.anInt1230 != Static622.anInt10382) {
				throw new RuntimeException("gnp4 uk:" + Static467.aClass5_Sub3Array1[local170].aClass4_Sub2_Sub1_Sub1_Sub2_1.anInt1225);
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
	public static void method7438() {
		@Pc(9) int local9 = Static578.anInt4590 * 512 + 256;
		@Pc(15) int local15 = Static378.anInt6261 * 512 + 256;
		@Pc(23) int local23 = Static644.method9021(local15, local9, Static636.anInt10567) - Static609.anInt10196;
		if (Static559.anInt9426 >= 100) {
			Static19.anInt277 = Static578.anInt4590 * 512 + 256;
			Static117.anInt2170 = Static378.anInt6261 * 512 + 256;
			Static441.anInt7550 = Static644.method9021(Static117.anInt2170, Static19.anInt277, Static636.anInt10567) - Static609.anInt10196;
		} else {
			if (local9 > Static19.anInt277) {
				Static19.anInt277 += Static559.anInt9426 * (local9 - Static19.anInt277) / 1000 + Static108.anInt2042;
				if (Static19.anInt277 > local9) {
					Static19.anInt277 = local9;
				}
			}
			if (local23 > Static441.anInt7550) {
				Static441.anInt7550 += Static108.anInt2042 + Static559.anInt9426 * (local23 - Static441.anInt7550) / 1000;
				if (local23 < Static441.anInt7550) {
					Static441.anInt7550 = local23;
				}
			}
			if (local9 < Static19.anInt277) {
				Static19.anInt277 -= (Static19.anInt277 - local9) * Static559.anInt9426 / 1000 + Static108.anInt2042;
				if (local9 > Static19.anInt277) {
					Static19.anInt277 = local9;
				}
			}
			if (Static117.anInt2170 < local15) {
				Static117.anInt2170 += Static559.anInt9426 * (local15 - Static117.anInt2170) / 1000 + Static108.anInt2042;
				if (local15 < Static117.anInt2170) {
					Static117.anInt2170 = local15;
				}
			}
			if (local23 < Static441.anInt7550) {
				Static441.anInt7550 -= Static559.anInt9426 * (Static441.anInt7550 - local23) / 1000 + Static108.anInt2042;
				if (Static441.anInt7550 < local23) {
					Static441.anInt7550 = local23;
				}
			}
			if (Static117.anInt2170 > local15) {
				Static117.anInt2170 -= Static559.anInt9426 * (Static117.anInt2170 - local15) / 1000 + Static108.anInt2042;
				if (Static117.anInt2170 < local15) {
					Static117.anInt2170 = local15;
				}
			}
		}
		local9 = Static447.anInt7620 * 512 + 256;
		local15 = Static43.anInt935 * 512 + 256;
		local23 = Static644.method9021(local15, local9, Static636.anInt10567) - Static485.anInt8265;
		@Pc(223) int local223 = local9 - Static19.anInt277;
		@Pc(228) int local228 = local23 - Static441.anInt7550;
		@Pc(233) int local233 = local15 - Static117.anInt2170;
		@Pc(245) int local245 = (int) Math.sqrt((double) (local223 * local223 + local233 * local233));
		@Pc(261) int local261 = (int) (Math.atan2((double) local228, (double) local245) * 2607.5945876176133D) & 0x3FFF;
		@Pc(272) int local272 = (int) (-2607.5945876176133D * Math.atan2((double) local223, (double) local233)) & 0x3FFF;
		if (local261 < 1024) {
			local261 = 1024;
		}
		if (local261 > 3072) {
			local261 = 3072;
		}
		if (local261 > Static210.anInt4029) {
			Static210.anInt4029 += Static563.anInt9475 * (local261 - Static210.anInt4029 >> 3) / 1000 + Static118.anInt2182 << 3;
			if (Static210.anInt4029 > local261) {
				Static210.anInt4029 = local261;
			}
		}
		if (local261 < Static210.anInt4029) {
			Static210.anInt4029 -= (Static210.anInt4029 - local261 >> 3) * Static563.anInt9475 / 1000 + Static118.anInt2182 << 3;
			if (local261 > Static210.anInt4029) {
				Static210.anInt4029 = local261;
			}
		}
		@Pc(338) int local338 = local272 - Static491.anInt8292;
		if (local338 > 8192) {
			local338 -= 16384;
		}
		if (local338 < -8192) {
			local338 += 16384;
		}
		local338 >>= 0x3;
		if (local338 > 0) {
			Static491.anInt8292 += Static118.anInt2182 + Static563.anInt9475 * local338 / 1000 << 3;
			Static491.anInt8292 &= 0x3FFF;
		}
		if (local338 < 0) {
			Static491.anInt8292 -= -local338 * Static563.anInt9475 / 1000 + Static118.anInt2182 << 3;
			Static491.anInt8292 &= 0x3FFF;
		}
		@Pc(399) int local399 = local272 - Static491.anInt8292;
		if (local399 > 8192) {
			local399 -= 16384;
		}
		if (local399 < -8192) {
			local399 += 16384;
		}
		Static290.anInt5062 = 0;
		if (local399 < 0 && local338 > 0 || local399 > 0 && local338 < 0) {
			Static491.anInt8292 = local272;
		}
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(II)Lclient!bu;")
	public static Class43 method7439(@OriginalArg(1) int arg0) {
		@Pc(13) Class43[] local13 = Static285.method4509();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class43 local21 = local13[local15];
			if (arg0 == local21.anInt1115) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILclient!ofa;)Lclient!wda;")
	public static Class119_Sub3 method7440(@OriginalArg(1) Class5_Sub22 arg0) {
		@Pc(7) Class119 local7 = Static605.method8635(arg0);
		@Pc(11) int local11 = arg0.method5913();
		@Pc(15) int local15 = arg0.method5913();
		@Pc(24) int local24 = arg0.method5968();
		return new Class119_Sub3(local7.aClass245_14, local7.aClass183_12, local7.anInt10375, local7.anInt10374, local7.anInt10371, local7.anInt10373, local7.anInt10367, local7.anInt10370, local7.anInt10369, local11, local15, local24);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI[Lclient!raa;)V")
	public static void method7444(@OriginalArg(1) int arg0, @OriginalArg(2) Class295[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(20) Class295 local20 = arg1[local7];
			if (local20 != null && local20.anInt7944 == arg0 && !Static75.method1289(local20)) {
				if (local20.anInt8001 == 0) {
					method7444(local20.anInt8022, arg1);
					if (local20.aClass295Array2 != null) {
						method7444(local20.anInt8022, local20.aClass295Array2);
					}
					@Pc(61) Class5_Sub27 local61 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local20.anInt8022);
					if (local61 != null) {
						Static78.method1352(local61.anInt4270);
					}
				}
				if (local20.anInt8001 == 6 && local20.anInt7992 != -1) {
					@Pc(82) Class362 local82 = Static435.aClass298_1.method7034(local20.anInt7992);
					if (local82 != null) {
						local20.anInt7975 += Static435.anInt7492;
						@Pc(93) int local93 = local20.anInt7964;
						while (local20.anInt7975 > local82.anIntArray573[local20.anInt7964]) {
							local20.anInt7975 -= local82.anIntArray573[local20.anInt7964];
							local20.anInt7964++;
							if (local20.anInt7964 >= local82.anIntArray571.length) {
								local20.anInt7964 -= local82.anInt9996;
								if (local20.anInt7964 < 0 || local20.anInt7964 >= local82.anIntArray571.length) {
									local20.anInt7964 = 0;
								}
							}
							local20.anInt7966 = local20.anInt7964 + 1;
							if (local20.anInt7966 >= local82.anIntArray571.length) {
								local20.anInt7966 -= local82.anInt9996;
								if (local20.anInt7966 < 0 || local82.anIntArray571.length <= local20.anInt7966) {
									local20.anInt7966 = -1;
								}
							}
							Static465.method6901(local20);
						}
						if (local93 != local20.anInt7964) {
							Static574.method8327(local20.anInt7964, local82);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IILclient!la;JIIZ)V")
	public static void method7445(@OriginalArg(2) Class207 arg0, @OriginalArg(3) long arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static340.method5112(arg1, arg0, arg2, arg3);
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZLclient!qg;)I")
	public static int method7446(@OriginalArg(1) Class286 arg0) {
		if (Static122.aClass286_1 == arg0) {
			return 9216;
		} else if (arg0 == Static399.aClass286_6) {
			return 34065;
		} else if (arg0 == Static193.aClass286_9) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
