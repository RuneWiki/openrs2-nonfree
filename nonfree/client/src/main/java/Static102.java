import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "Lclient!dj;")
	public static Class24 aClass24_681 = null;

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_684 = Static81.method1507("Login server offline)3");

	@OriginalMember(owner = "client!ke", name = "v", descriptor = "Lclient!dj;")
	public static Class24 aClass24_682 = aClass24_684;

	@OriginalMember(owner = "client!ke", name = "y", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_683 = Static81.method1507("(U3");

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
	public static void method1755() {
		@Pc(5) int local5 = Static197.anInt4423 * 128 + 64;
		@Pc(11) int local11 = Static181.anInt4043 * 128 + 64;
		@Pc(23) int local23 = Static37.method699(local5, Static170.anInt3799, local11) - Static134.anInt2973;
		if (local5 > Static92.anInt2140) {
			Static92.anInt2140 += (local5 - Static92.anInt2140) * Static186.anInt823 / 1000 + Static55.anInt1377;
			if (local5 < Static92.anInt2140) {
				Static92.anInt2140 = local5;
			}
		}
		if (Static92.anInt2140 > local5) {
			Static92.anInt2140 -= Static55.anInt1377 + (Static92.anInt2140 - local5) * Static186.anInt823 / 1000;
			if (local5 > Static92.anInt2140) {
				Static92.anInt2140 = local5;
			}
		}
		local5 = Static108.anInt2431 * 128 + 64;
		if (Static146.anInt3111 < local11) {
			Static146.anInt3111 += (local11 - Static146.anInt3111) * Static186.anInt823 / 1000 + Static55.anInt1377;
			if (Static146.anInt3111 > local11) {
				Static146.anInt3111 = local11;
			}
		}
		if (Static32.anInt875 < local23) {
			Static32.anInt875 += Static55.anInt1377 + Static186.anInt823 * (local23 - Static32.anInt875) / 1000;
			if (local23 < Static32.anInt875) {
				Static32.anInt875 = local23;
			}
		}
		if (local23 < Static32.anInt875) {
			Static32.anInt875 -= Static55.anInt1377 + (Static32.anInt875 - local23) * Static186.anInt823 / 1000;
			if (Static32.anInt875 < local23) {
				Static32.anInt875 = local23;
			}
		}
		if (Static146.anInt3111 > local11) {
			Static146.anInt3111 -= Static55.anInt1377 + (Static146.anInt3111 - local11) * Static186.anInt823 / 1000;
			if (Static146.anInt3111 < local11) {
				Static146.anInt3111 = local11;
			}
		}
		local11 = Static167.anInt3702 * 128 + 64;
		local23 = Static37.method699(local5, Static170.anInt3799, local11) - Static58.anInt1431;
		@Pc(207) int local207 = local11 - Static146.anInt3111;
		@Pc(212) int local212 = local5 - Static92.anInt2140;
		@Pc(217) int local217 = local23 - Static32.anInt875;
		@Pc(237) int local237 = (int) Math.sqrt((double) (local207 * local207 + local212 * local212));
		@Pc(248) int local248 = (int) (Math.atan2((double) local217, (double) local237) * 325.949D) & 0x7FF;
		@Pc(259) int local259 = (int) (-325.949D * Math.atan2((double) local207, (double) local212)) & 0x7FF;
		@Pc(263) int local263 = local259 - Static35.anInt4158;
		if (local263 > 1024) {
			local263 -= 2048;
		}
		if (local248 < 128) {
			local248 = 128;
		}
		if (local248 > 383) {
			local248 = 383;
		}
		if (local263 < -1024) {
			local263 += 2048;
		}
		if (local263 > 0) {
			Static35.anInt4158 += Static120.anInt2669 + local263 * Static128.anInt2831 / 1000;
			Static35.anInt4158 &= 0x7FF;
		}
		if (Static175.anInt3914 < local248) {
			Static175.anInt3914 += Static120.anInt2669 + Static128.anInt2831 * (local248 - Static175.anInt3914) / 1000;
			if (Static175.anInt3914 > local248) {
				Static175.anInt3914 = local248;
			}
		}
		if (local248 < Static175.anInt3914) {
			Static175.anInt3914 -= Static120.anInt2669 + Static128.anInt2831 * (Static175.anInt3914 - local248) / 1000;
			if (Static175.anInt3914 < local248) {
				Static175.anInt3914 = local248;
			}
		}
		if (local263 < 0) {
			Static35.anInt4158 -= Static128.anInt2831 * -local263 / 1000 + Static120.anInt2669;
			Static35.anInt4158 &= 0x7FF;
		}
		@Pc(372) int local372 = local259 - Static35.anInt4158;
		if (local372 > 1024) {
			local372 -= 2048;
		}
		if (local372 < -1024) {
			local372 += 2048;
		}
		if (local372 < 0 && local263 > 0 || local372 > 0 && local263 < 0) {
			Static35.anInt4158 = local259;
		}
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method1756() {
		for (@Pc(12) Class1_Sub5 local12 = (Class1_Sub5) Static71.aClass87_11.method2827(); local12 != null; local12 = (Class1_Sub5) Static71.aClass87_11.method2830()) {
			if (local12.aClass1_Sub2_Sub5_1 != null) {
				local12.method523();
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIII)V")
	public static void method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static60.anInt3602 * 128) {
			arg0 = Static60.anInt3602 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static18.anInt3874 * 128) {
			arg2 = Static18.anInt3874 * 128 - 1;
		}
		Static164.anInt3660++;
		Static152.anInt3381 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg3];
		Static136.anInt3052 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg3];
		Static75.anInt4697 = Class1_Sub2_Sub8_Sub4.anIntArray350[arg4];
		Static70.anInt3207 = Class1_Sub2_Sub8_Sub4.anIntArray355[arg4];
		Static167.anInt3703 = arg0;
		Static134.anInt2982 = arg1;
		Static176.anInt4669 = arg2;
		Static137.anInt3098 = arg0 / 128;
		Static89.anInt2074 = arg2 / 128;
		Static77.anInt1820 = arg5;
		Static96.anInt2203 = Static137.anInt3098 - Static54.anInt3872;
		if (Static96.anInt2203 < 0) {
			Static96.anInt2203 = 0;
		}
		Static103.anInt2300 = Static89.anInt2074 - Static54.anInt3872;
		if (Static103.anInt2300 < 0) {
			Static103.anInt2300 = 0;
		}
		Static184.anInt4126 = Static137.anInt3098 + Static54.anInt3872;
		if (Static184.anInt4126 > Static60.anInt3602) {
			Static184.anInt4126 = Static60.anInt3602;
		}
		Static192.anInt4309 = Static89.anInt2074 + Static54.anInt3872;
		if (Static192.anInt4309 > Static18.anInt3874) {
			Static192.anInt4309 = Static18.anInt3874;
		}
		@Pc(108) int local108;
		@Pc(119) int local119;
		@Pc(129) int local129;
		@Pc(135) int local135;
		@Pc(141) int local141;
		@Pc(161) int local161;
		for (@Pc(105) int local105 = 0; local105 < Static54.anInt3872 + Static54.anInt3872 + 2; local105++) {
			for (local108 = 0; local108 < Static54.anInt3872 + Static54.anInt3872 + 2; local108++) {
				local119 = (local105 - Static54.anInt3872 << 7) - (arg0 & 0x7F);
				local129 = (local108 - Static54.anInt3872 << 7) - (arg2 & 0x7F);
				local135 = Static137.anInt3098 + local105 - Static54.anInt3872;
				local141 = Static89.anInt2074 + local108 - Static54.anInt3872;
				if (local135 >= 0 && local141 >= 0 && local135 < Static60.anInt3602 && local141 < Static18.anInt3874) {
					local161 = Static181.anIntArrayArrayArray10[0][local135][local141] - arg1;
					Static178.aBooleanArrayArray2[local105][local108] = Static185.method3213(local119, local161 - 2000, local161 + 128, local129);
				} else {
					Static178.aBooleanArrayArray2[local105][local108] = false;
				}
			}
		}
		for (local108 = 0; local108 < Static54.anInt3872 + Static54.anInt3872 + 1; local108++) {
			for (local119 = 0; local119 < Static54.anInt3872 + Static54.anInt3872 + 1; local119++) {
				Static142.aBooleanArrayArray1[local108][local119] = Static178.aBooleanArrayArray2[local108][local119] || Static178.aBooleanArrayArray2[local108 + 1][local119] || Static178.aBooleanArrayArray2[local108][local119 + 1] || Static178.aBooleanArrayArray2[local108 + 1][local119 + 1];
			}
		}
		Static134.method2289();
		Static48.anInt1211 = 0;
		for (local119 = Static57.anInt1420; local119 < Static143.anInt3201; local119++) {
			@Pc(271) Class1_Sub8[][] local271 = Static29.aClass1_Sub8ArrayArrayArray1[local119];
			for (local135 = Static96.anInt2203; local135 < Static184.anInt4126; local135++) {
				for (local141 = Static103.anInt2300; local141 < Static192.anInt4309; local141++) {
					@Pc(283) Class1_Sub8 local283 = local271[local135][local141];
					if (local283 != null) {
						if (local283.anInt1558 <= arg5 && Static142.aBooleanArrayArray1[local135 + Static54.anInt3872 - Static137.anInt3098][local141 + Static54.anInt3872 - Static89.anInt2074]) {
							local283.aBoolean79 = true;
							local283.aBoolean77 = true;
							if (local283.anInt1550 > 0) {
								local283.aBoolean78 = true;
							} else {
								local283.aBoolean78 = false;
							}
							Static48.anInt1211++;
						} else {
							local283.aBoolean79 = false;
							local283.aBoolean77 = false;
							local283.anInt1553 = 0;
						}
					}
				}
			}
		}
		@Pc(364) int local364;
		@Pc(373) int local373;
		@Pc(378) int local378;
		@Pc(382) int local382;
		for (local129 = Static57.anInt1420; local129 < Static143.anInt3201; local129++) {
			@Pc(352) Class1_Sub8[][] local352 = Static29.aClass1_Sub8ArrayArrayArray1[local129];
			for (local141 = -Static54.anInt3872; local141 <= 0; local141++) {
				local161 = Static137.anInt3098 + local141;
				local364 = Static137.anInt3098 - local141;
				if (local161 >= Static96.anInt2203 || local364 < Static184.anInt4126) {
					for (local373 = -Static54.anInt3872; local373 <= 0; local373++) {
						local378 = Static89.anInt2074 + local373;
						local382 = Static89.anInt2074 - local373;
						@Pc(394) Class1_Sub8 local394;
						if (local161 >= Static96.anInt2203) {
							if (local378 >= Static103.anInt2300) {
								local394 = local352[local161][local378];
								if (local394 != null && local394.aBoolean79) {
									Static202.method3416(local394, true);
								}
							}
							if (local382 < Static192.anInt4309) {
								local394 = local352[local161][local382];
								if (local394 != null && local394.aBoolean79) {
									Static202.method3416(local394, true);
								}
							}
						}
						if (local364 < Static184.anInt4126) {
							if (local378 >= Static103.anInt2300) {
								local394 = local352[local364][local378];
								if (local394 != null && local394.aBoolean79) {
									Static202.method3416(local394, true);
								}
							}
							if (local382 < Static192.anInt4309) {
								local394 = local352[local364][local382];
								if (local394 != null && local394.aBoolean79) {
									Static202.method3416(local394, true);
								}
							}
						}
						if (Static48.anInt1211 == 0) {
							Static65.aBoolean84 = false;
							return;
						}
					}
				}
			}
		}
		for (local135 = Static57.anInt1420; local135 < Static143.anInt3201; local135++) {
			@Pc(478) Class1_Sub8[][] local478 = Static29.aClass1_Sub8ArrayArrayArray1[local135];
			for (local161 = -Static54.anInt3872; local161 <= 0; local161++) {
				local364 = Static137.anInt3098 + local161;
				local373 = Static137.anInt3098 - local161;
				if (local364 >= Static96.anInt2203 || local373 < Static184.anInt4126) {
					for (local378 = -Static54.anInt3872; local378 <= 0; local378++) {
						local382 = Static89.anInt2074 + local378;
						@Pc(508) int local508 = Static89.anInt2074 - local378;
						@Pc(520) Class1_Sub8 local520;
						if (local364 >= Static96.anInt2203) {
							if (local382 >= Static103.anInt2300) {
								local520 = local478[local364][local382];
								if (local520 != null && local520.aBoolean79) {
									Static202.method3416(local520, false);
								}
							}
							if (local508 < Static192.anInt4309) {
								local520 = local478[local364][local508];
								if (local520 != null && local520.aBoolean79) {
									Static202.method3416(local520, false);
								}
							}
						}
						if (local373 < Static184.anInt4126) {
							if (local382 >= Static103.anInt2300) {
								local520 = local478[local373][local382];
								if (local520 != null && local520.aBoolean79) {
									Static202.method3416(local520, false);
								}
							}
							if (local508 < Static192.anInt4309) {
								local520 = local478[local373][local508];
								if (local520 != null && local520.aBoolean79) {
									Static202.method3416(local520, false);
								}
							}
						}
						if (Static48.anInt1211 == 0) {
							Static65.aBoolean84 = false;
							return;
						}
					}
				}
			}
		}
		Static65.aBoolean84 = false;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILclient!od;ILclient!vc;ZII)V")
	public static void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub8_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class98 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == null) {
			return;
		}
		@Pc(14) int local14 = arg2 * arg2 + arg5 * arg5;
		@Pc(20) int local20 = Static115.anInt2586 + Static66.anInt1655 & 0x7FF;
		@Pc(32) int local32 = Math.max(arg3.anInt4400 / 2, arg3.anInt4403 / 2) + 10;
		if (local14 > local32 * local32) {
			return;
		}
		@Pc(42) int local42 = Class1_Sub2_Sub8_Sub4.anIntArray350[local20];
		@Pc(50) int local50 = local42 * 256 / (Static192.anInt4308 + 256);
		@Pc(54) int local54 = Class1_Sub2_Sub8_Sub4.anIntArray355[local20];
		@Pc(67) int local67 = local54 * 256 / (Static192.anInt4308 + 256);
		@Pc(78) int local78 = local67 * arg2 - local50 * arg5 >> 16;
		@Pc(89) int local89 = local50 * arg2 + local67 * arg5 >> 16;
		arg1.method2359(arg0 + arg3.anInt4400 / 2 + local89 - arg1.anInt3019 / 2, -(arg1.anInt3021 / 2) + arg4 + arg3.anInt4403 / 2 + -local78, arg3.anIntArray387, arg3.anIntArray389);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZII)I")
	public static int method1760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) Static49.aClass57_12.method1872((long) arg1);
		if (local15 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local15.anIntArray170.length) {
			return local15.anIntArray170[arg0];
		} else {
			return -1;
		}
	}
}
