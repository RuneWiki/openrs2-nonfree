import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!da", name = "s", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_6 = new Class107(64);

	@OriginalMember(owner = "client!da", name = "B", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	public static void method1170() {
		if (Static230.method4872() || Static291.anInt5263 == Static30.anInt483) {
			Static283.method4812(Static51.aClass37_1);
			if (Static76.anInt1437 != Static291.anInt5263) {
				Static10.method154();
			}
		} else {
			Static266.method4676(Static190.anInt6232, false, false, Static208.anInt4568);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!iq;ZIIII)V")
	public static void method1171(@OriginalArg(1) Class104 arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		Static230.anInt5823 = 1;
		Static81.anInt1526 = arg1;
		Static319.aBoolean562 = false;
		Static167.anInt3809 = 0;
		Static139.anInt3012 = arg2;
		Static341.aClass104_24 = arg0;
		Static92.anInt1809 = 2;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!fh;B)Z")
	public static boolean method1172(@OriginalArg(0) Class68 arg0) {
		if (Static239.anInt2804 == arg0.anInt1829) {
			Static99.anInt2030 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([[[Lclient!dc;IZIII)Z")
	public static boolean method1173(@OriginalArg(0) Class51[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) byte local14 = arg2 ? 1 : (byte) (Static31.anInt512 & 0xFF);
		if (Static332.aByteArrayArrayArray12[Static291.anInt5263][arg3][arg4] == local14) {
			return false;
		} else if ((Static243.aByteArrayArrayArray10[Static291.anInt5263][arg3][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(48) byte local48 = 0;
			@Pc(50) int local50 = 0;
			Static363.anIntArray537[0] = arg3;
			@Pc(57) int local57 = local48 + 1;
			Static16.anIntArray30[0] = arg4;
			Static332.aByteArrayArrayArray12[Static291.anInt5263][arg3][arg4] = local14;
			while (local57 != local50) {
				@Pc(75) int local75 = Static363.anIntArray537[local50] & 0xFFFF;
				@Pc(83) int local83 = Static363.anIntArray537[local50] >> 16 & 0xFF;
				@Pc(91) int local91 = Static363.anIntArray537[local50] >> 24 & 0xFF;
				@Pc(97) int local97 = Static16.anIntArray30[local50] & 0xFFFF;
				@Pc(105) int local105 = Static16.anIntArray30[local50] >> 16 & 0xFF;
				local50 = local50 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static243.aByteArrayArrayArray10[Static291.anInt5263][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(130) boolean local130 = false;
				@Pc(171) int local171;
				@Pc(210) int local210;
				label231: for (@Pc(134) int local134 = Static291.anInt5263 + 1; local134 <= 3; local134++) {
					if ((Static243.aByteArrayArrayArray10[local134][local75][local97] & 0x8) == 0) {
						@Pc(305) Class1_Sub2 local305;
						@Pc(317) int local317;
						@Pc(294) Class51 local294;
						@Pc(300) Class11 local300;
						if (local113 && arg0[local134][local75][local97] != null) {
							if (arg0[local134][local75][local97].aClass1_Sub1_2 != null) {
								local171 = Static67.method3688(local83);
								if (local171 == arg0[local134][local75][local97].aClass1_Sub1_2.anInt5239 || arg0[local134][local75][local97].aClass1_Sub1_1 != null && local171 == arg0[local134][local75][local97].aClass1_Sub1_1.anInt5239) {
									continue;
								}
								if (local91 != 0) {
									local210 = Static67.method3688(local91);
									if (arg0[local134][local75][local97].aClass1_Sub1_2.anInt5239 == local210 || arg0[local134][local75][local97].aClass1_Sub1_1 != null && local210 == arg0[local134][local75][local97].aClass1_Sub1_1.anInt5239) {
										continue;
									}
								}
								if (local105 != 0) {
									local210 = Static67.method3688(local105);
									if (arg0[local134][local75][local97].aClass1_Sub1_2.anInt5239 == local210 || arg0[local134][local75][local97].aClass1_Sub1_1 != null && arg0[local134][local75][local97].aClass1_Sub1_1.anInt5239 == local210) {
										continue;
									}
								}
							}
							local294 = arg0[local134][local75][local97];
							if (local294.aClass11_2 != null) {
								for (local300 = local294.aClass11_2; local300 != null; local300 = local300.aClass11_1) {
									local305 = local300.aClass1_Sub2_1;
									if (local305 instanceof Interface8) {
										@Pc(311) Interface8 local311 = (Interface8) local305;
										local317 = local311.method5503();
										if (local317 == 21) {
											local317 = 19;
										}
										@Pc(328) int local328 = local311.method5501();
										@Pc(334) int local334 = local328 << 6 | local317;
										if (local334 == local83 || local91 != 0 && local91 == local334 || local105 != 0 && local334 == local105) {
											continue label231;
										}
									}
								}
							}
						}
						local294 = arg0[local134][local75][local97];
						if (local294 != null && local294.aClass11_2 != null) {
							for (local300 = local294.aClass11_2; local300 != null; local300 = local300.aClass11_1) {
								local305 = local300.aClass1_Sub2_1;
								if (local305.aShort88 != local305.aShort89 || local305.aShort90 != local305.aShort87) {
									for (@Pc(394) int local394 = local305.aShort89; local394 <= local305.aShort88; local394++) {
										for (local317 = local305.aShort90; local317 <= local305.aShort87; local317++) {
											Static332.aByteArrayArrayArray12[local134][local394][local317] = local14;
										}
									}
								}
							}
						}
						Static332.aByteArrayArrayArray12[local134][local75][local97] = local14;
						local130 = true;
					}
				}
				if (local130) {
					local171 = Static9.aClass105Array1[Static291.anInt5263 + 1].method4453(local75, local97);
					if (local171 > Static95.anIntArray148[arg1]) {
						Static95.anIntArray148[arg1] = local171;
					}
					local210 = local75 << 7;
					if (local210 < Static129.anIntArray224[arg1]) {
						Static129.anIntArray224[arg1] = local210;
					} else if (local210 > Static116.anIntArray200[arg1]) {
						Static116.anIntArray200[arg1] = local210;
					}
					@Pc(500) int local500 = local97 << 7;
					if (Static233.anIntArray395[arg1] > local500) {
						Static233.anIntArray395[arg1] = local500;
					} else if (local500 > Static247.anIntArray404[arg1]) {
						Static247.anIntArray404[arg1] = local500;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local14 != Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 - 1][local97]) {
						Static363.anIntArray537[local57] = 0xD3000000 | 0x120000 | local75 - 1;
						Static16.anIntArray30[local57] = local97 | 0x130000;
						local57 = local57 + 1 & 0xFFF;
						Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 - 1][local97] = local14;
					}
					@Pc(571) int local571 = ~Static12.anInt213;
					local97++;
					if (local571 < ~local97) {
						if (local75 - 1 >= 0 && Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 - 1][local97] != local14 && (Static243.aByteArrayArrayArray10[Static291.anInt5263][local75][local97] & 0x4) == 0 && (Static243.aByteArrayArrayArray10[Static291.anInt5263][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static363.anIntArray537[local57] = local75 - 1 | 0x120000 | 0x52000000;
							Static16.anIntArray30[local57] = local97 | 0x130000;
							Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 - 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static332.aByteArrayArrayArray12[Static291.anInt5263][local75][local97] != local14) {
							Static363.anIntArray537[local57] = local75 | 0x13000000 | 0x520000;
							Static16.anIntArray30[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static332.aByteArrayArrayArray12[Static291.anInt5263][local75][local97] = local14;
						}
						if (Static66.anInt1177 > local75 + 1 && Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 + 1][local97] != local14 && (Static243.aByteArrayArrayArray10[Static291.anInt5263][local75][local97] & 0x4) == 0 && (Static243.aByteArrayArrayArray10[Static291.anInt5263][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static363.anIntArray537[local57] = 0x92000000 | 0x520000 | local75 + 1;
							Static16.anIntArray30[local57] = local97 | 0x530000;
							Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 + 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
					}
					local97--;
					if (Static66.anInt1177 > local75 + 1 && Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 + 1][local97] != local14) {
						Static363.anIntArray537[local57] = local75 + 1 | 0x920000 | 0x53000000;
						Static16.anIntArray30[local57] = local97 | 0x930000;
						local57 = local57 + 1 & 0xFFF;
						Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 + 1][local97] = local14;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 - 1][local97] != local14 && (Static243.aByteArrayArrayArray10[Static291.anInt5263][local75][local97] & 0x4) == 0 && (Static243.aByteArrayArrayArray10[Static291.anInt5263][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static363.anIntArray537[local57] = 0x12000000 | 0xD20000 | local75 - 1;
							Static16.anIntArray30[local57] = local97 | 0xD30000;
							Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 - 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (local14 != Static332.aByteArrayArrayArray12[Static291.anInt5263][local75][local97]) {
							Static363.anIntArray537[local57] = local75 | 0x93000000 | 0xD20000;
							Static16.anIntArray30[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static332.aByteArrayArrayArray12[Static291.anInt5263][local75][local97] = local14;
						}
						if (local75 + 1 < Static66.anInt1177 && Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 + 1][local97] != local14 && (Static243.aByteArrayArrayArray10[Static291.anInt5263][local75][local97] & 0x4) == 0 && (Static243.aByteArrayArrayArray10[Static291.anInt5263][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static363.anIntArray537[local57] = local75 + 1 | 0xD2000000 | 0x920000;
							Static16.anIntArray30[local57] = local97 | 0x930000;
							Static332.aByteArrayArrayArray12[Static291.anInt5263][local75 + 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static95.anIntArray148[arg1] != -1000000) {
				Static95.anIntArray148[arg1] += 10;
				Static129.anIntArray224[arg1] -= 50;
				Static116.anIntArray200[arg1] += 50;
				Static247.anIntArray404[arg1] += 50;
				Static233.anIntArray395[arg1] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V")
	public static void method1174() {
		for (@Pc(12) int local12 = 0; local12 < Static68.aClass191ArrayArray1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < Static68.aClass191ArrayArray1[local12].length; local16++) {
				Static68.aClass191ArrayArray1[local12][local16] = Static84.aClass191_2;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!dr;)V")
	public static void method1175(@OriginalArg(1) Class37 arg0) {
		if (Static257.aBoolean463) {
			Static178.method5752(arg0);
		} else {
			Static86.method1715(arg0);
		}
	}
}
