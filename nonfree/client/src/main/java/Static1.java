import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "Wb", descriptor = "I")
	public static int anInt54;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!jd;")
	public static Class46 aClass46_1 = null;

	@OriginalMember(owner = "client!a", name = "gb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_5 = Static177.method3050("leuchten1:");

	@OriginalMember(owner = "client!a", name = "Eb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_8 = Static177.method3050("(Y");

	@OriginalMember(owner = "client!a", name = "Tb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_9 = Static177.method3050("Mitglieder)2Welt");

	@OriginalMember(owner = "client!a", name = "Gc", descriptor = "I")
	public static int anInt74 = 1;

	@OriginalMember(owner = "client!a", name = "Lc", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_11 = Static177.method3050("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!a;ZLclient!jd;)Lclient!jd;")
	public static Class46 method1(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class46 arg1) {
		if (arg1.method1652(Static101.aClass46_931) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(25) int local25 = arg1.method1652(Static102.aClass46_940);
			if (local25 == -1) {
				while (true) {
					local25 = arg1.method1652(Static135.aClass46_1176);
					if (local25 == -1) {
						while (true) {
							local25 = arg1.method1652(Static167.aClass46_1361);
							if (local25 == -1) {
								while (true) {
									local25 = arg1.method1652(Static63.aClass46_587);
									if (local25 == -1) {
										while (true) {
											local25 = arg1.method1652(Static23.aClass46_193);
											if (local25 == -1) {
												while (true) {
													local25 = arg1.method1652(Static23.aClass46_191);
													if (local25 == -1) {
														return arg1;
													}
													@Pc(242) Class46 local242 = Static3.aClass46_44;
													if (Static44.aClass84_3 != null) {
														local242 = Static24.method399(Static44.aClass84_3.anInt3579);
														try {
															if (Static44.aClass84_3.anObject4 != null) {
																@Pc(258) byte[] local258 = ((String) Static44.aClass84_3.anObject4).getBytes("ISO-8859-1");
																local242 = Static160.method2722(local258.length, 0, local258);
															}
														} catch (@Pc(267) UnsupportedEncodingException local267) {
														}
													}
													arg1 = Static69.method1482(new Class46[] { arg1.method1666(local25, 0), local242, arg1.method1650(local25 + 4) });
												}
											}
											arg1 = Static69.method1482(new Class46[] { arg1.method1666(local25, 0), Static57.method1097(Static90.method1796(arg0, 4)), arg1.method1650(local25 + 2) });
										}
									}
									arg1 = Static69.method1482(new Class46[] { arg1.method1666(local25, 0), Static57.method1097(Static90.method1796(arg0, 3)), arg1.method1650(local25 + 2) });
								}
							}
							arg1 = Static69.method1482(new Class46[] { arg1.method1666(local25, 0), Static57.method1097(Static90.method1796(arg0, 2)), arg1.method1650(local25 + 2) });
						}
					}
					arg1 = Static69.method1482(new Class46[] { arg1.method1666(local25, 0), Static57.method1097(Static90.method1796(arg0, 1)), arg1.method1650(local25 + 2) });
				}
			}
			arg1 = Static69.method1482(new Class46[] { arg1.method1666(local25, 0), Static57.method1097(Static90.method1796(arg0, 0)), arg1.method1650(local25 + 2) });
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!fh;IIIIIII)V")
	public static void method2(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static116.anInt2858;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static83.anInt2133;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static142.anIntArrayArrayArray33[arg1][arg6][arg7] - Static90.anInt2341;
		@Pc(49) int local49 = Static142.anIntArrayArrayArray33[arg1][arg6 + 1][arg7] - Static90.anInt2341;
		@Pc(63) int local63 = Static142.anIntArrayArrayArray33[arg1][arg6 + 1][arg7 + 1] - Static90.anInt2341;
		@Pc(75) int local75 = Static142.anIntArrayArrayArray33[arg1][arg6][arg7 + 1] - Static90.anInt2341;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static171.anInt3847 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static171.anInt3846 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static171.anInt3847 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static171.anInt3846 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static171.anInt3847 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static171.anInt3846 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static171.anInt3847 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static171.anInt3846 + (local85 << 9) / local261;
		Static171.anInt3850 = 0;
		@Pc(467) int local467;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static28.aBoolean38 && Static154.method3130(Static30.anInt762, Static134.anInt3184, local315, local331, local299, local307, local323, local291)) {
				Static104.anInt2621 = arg6;
				Static188.anInt4186 = arg7;
			}
			Static171.aBoolean157 = false;
			if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static171.anInt3849 || local323 > Static171.anInt3849 || local291 > Static171.anInt3849) {
				Static171.aBoolean157 = true;
			}
			if (arg0.anInt1324 == -1) {
				if (arg0.anInt1327 != 12345678) {
					Static171.method2950(local315, local331, local299, local307, local323, local291, arg0.anInt1327, arg0.anInt1328, arg0.anInt1333);
				}
			} else if (Static186.aBoolean169) {
				local467 = Static171.anInterface1_2.method381(arg0.anInt1324);
				Static171.method2950(local315, local331, local299, local307, local323, local291, Static10.method214(local467, arg0.anInt1327), Static10.method214(local467, arg0.anInt1328), Static10.method214(local467, arg0.anInt1333));
			} else if (arg0.aBoolean65) {
				Static171.method2956(local315, local331, local299, local307, local323, local291, arg0.anInt1327, arg0.anInt1328, arg0.anInt1333, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1324);
			} else {
				Static171.method2956(local315, local331, local299, local307, local323, local291, arg0.anInt1327, arg0.anInt1328, arg0.anInt1333, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt1324);
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static28.aBoolean38 && Static154.method3130(Static30.anInt762, Static134.anInt3184, local283, local299, local331, local275, local291, local323)) {
			Static104.anInt2621 = arg6;
			Static188.anInt4186 = arg7;
		}
		Static171.aBoolean157 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static171.anInt3849 || local291 > Static171.anInt3849 || local323 > Static171.anInt3849) {
			Static171.aBoolean157 = true;
		}
		if (arg0.anInt1324 != -1) {
			if (!Static186.aBoolean169) {
				Static171.method2956(local283, local299, local331, local275, local291, local323, arg0.anInt1326, arg0.anInt1333, arg0.anInt1328, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt1324);
				return;
			}
			local467 = Static171.anInterface1_2.method381(arg0.anInt1324);
			Static171.method2950(local283, local299, local331, local275, local291, local323, Static10.method214(local467, arg0.anInt1326), Static10.method214(local467, arg0.anInt1333), Static10.method214(local467, arg0.anInt1328));
		} else if (arg0.anInt1326 != 12345678) {
			Static171.method2950(local283, local299, local331, local275, local291, local323, arg0.anInt1326, arg0.anInt1333, arg0.anInt1328);
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILclient!tg;Lclient!tg;IIJ)V")
	public static void method5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub1 arg4, @OriginalArg(5) Class4_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class24 local8 = new Class24();
		local8.aLong36 = arg8;
		local8.anInt1096 = arg1 * 128 + 64;
		local8.anInt1094 = arg2 * 128 + 64;
		local8.anInt1095 = arg3;
		local8.aClass4_Sub1_Sub1_2 = arg4;
		local8.aClass4_Sub1_Sub1_3 = arg5;
		local8.anInt1089 = arg6;
		local8.anInt1088 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static28.aClass4_Sub7ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static28.aClass4_Sub7ArrayArrayArray1[local42][arg1][arg2] = new Class4_Sub7(local42, arg1, arg2);
			}
		}
		Static28.aClass4_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass24_1 = local8;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ILclient!ac;)V")
	public static void method13(@OriginalArg(1) Class4_Sub1_Sub1_Sub1 arg0) {
		arg0.anInt2809 = arg0.anInt2816;
		if (arg0.anInt2823 == 0) {
			arg0.anInt2838 = 0;
			return;
		}
		if (arg0.anInt2808 != -1 && arg0.anInt2840 == 0) {
			@Pc(35) Class4_Sub1_Sub4 local35 = Static137.method2394(arg0.anInt2808);
			if (arg0.anInt2836 > 0 && local35.anInt540 == 0) {
				arg0.anInt2838++;
				return;
			}
			if (arg0.anInt2836 <= 0 && local35.anInt539 == 0) {
				arg0.anInt2838++;
				return;
			}
		}
		@Pc(75) int local75 = arg0.anInt2832;
		@Pc(78) int local78 = arg0.anInt2803;
		@Pc(93) int local93 = arg0.anInt2805 * 64 + arg0.anIntArray259[arg0.anInt2823 - 1] * 128;
		@Pc(108) int local108 = arg0.anInt2805 * 64 + arg0.anIntArray262[arg0.anInt2823 - 1] * 128;
		if (local108 - local75 > 256 || local108 - local75 < -256 || local93 - local78 > 256 || local93 - local78 < -256) {
			arg0.anInt2803 = local93;
			arg0.anInt2832 = local108;
			return;
		}
		if (local75 < local108) {
			if (local93 > local78) {
				arg0.anInt2829 = 1280;
			} else if (local93 >= local78) {
				arg0.anInt2829 = 1536;
			} else {
				arg0.anInt2829 = 1792;
			}
		} else if (local108 >= local75) {
			if (local93 > local78) {
				arg0.anInt2829 = 1024;
			} else if (local93 < local78) {
				arg0.anInt2829 = 0;
			}
		} else if (local78 < local93) {
			arg0.anInt2829 = 768;
		} else if (local78 > local93) {
			arg0.anInt2829 = 256;
		} else {
			arg0.anInt2829 = 512;
		}
		@Pc(225) int local225 = arg0.anInt2829 - arg0.anInt2822 & 0x7FF;
		if (local225 > 1024) {
			local225 -= 2048;
		}
		@Pc(233) boolean local233 = true;
		@Pc(235) int local235 = 4;
		@Pc(238) int local238 = arg0.anInt2800;
		if (local225 >= -256 && local225 <= 256) {
			local238 = arg0.anInt2810;
		} else if (local225 >= 256 && local225 < 768) {
			local238 = arg0.anInt2794;
		} else if (local225 >= -768 && local225 <= -256) {
			local238 = arg0.anInt2833;
		}
		if (local238 == -1) {
			local238 = arg0.anInt2810;
		}
		arg0.anInt2809 = local238;
		if (arg0 instanceof Class4_Sub1_Sub1_Sub1_Sub2) {
			local233 = ((Class4_Sub1_Sub1_Sub1_Sub2) arg0).aClass4_Sub1_Sub11_1.aBoolean100;
		}
		if (local233) {
			if (arg0.anInt2822 != arg0.anInt2829 && arg0.anInt2799 == -1 && arg0.anInt2792 != 0) {
				local235 = 2;
			}
			if (arg0.anInt2823 > 2) {
				local235 = 6;
			}
			if (arg0.anInt2823 > 3) {
				local235 = 8;
			}
			if (arg0.anInt2838 > 0 && arg0.anInt2823 > 1) {
				local235 = 8;
				arg0.anInt2838--;
			}
		} else {
			if (arg0.anInt2823 > 1) {
				local235 = 6;
			}
			if (arg0.anInt2823 > 2) {
				local235 = 8;
			}
			if (arg0.anInt2838 > 0 && arg0.anInt2823 > 1) {
				local235 = 8;
				arg0.anInt2838--;
			}
		}
		if (arg0.aBooleanArray12[arg0.anInt2823 - 1]) {
			local235 <<= 0x1;
		}
		if (local108 > local75) {
			arg0.anInt2832 += local235;
			if (arg0.anInt2832 > local108) {
				arg0.anInt2832 = local108;
			}
		} else if (local108 < local75) {
			arg0.anInt2832 -= local235;
			if (arg0.anInt2832 < local108) {
				arg0.anInt2832 = local108;
			}
		}
		if (local78 < local93) {
			arg0.anInt2803 += local235;
			if (arg0.anInt2803 > local93) {
				arg0.anInt2803 = local93;
			}
		} else if (local93 < local78) {
			arg0.anInt2803 -= local235;
			if (local93 > arg0.anInt2803) {
				arg0.anInt2803 = local93;
			}
		}
		if (local108 == arg0.anInt2832 && local93 == arg0.anInt2803) {
			arg0.anInt2823--;
			if (arg0.anInt2836 > 0) {
				arg0.anInt2836--;
			}
		}
		if (local235 >= 8 && arg0.anInt2810 == arg0.anInt2809 && arg0.anInt2824 != -1) {
			arg0.anInt2809 = arg0.anInt2824;
		}
	}
}
