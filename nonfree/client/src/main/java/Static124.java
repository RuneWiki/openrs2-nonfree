import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "Lclient!ka;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!hr", name = "E", descriptor = "Lclient!dp;")
	public static Class53 aClass53_69;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
	public static int anInt2286 = 0;

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "Z")
	public static boolean aBoolean193 = false;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(I)V")
	public static void method2455() {
		if (Static105.aString73.length() != 0) {
			Static297.method5064("--> " + Static105.aString73);
			Static325.method5422(Static105.aString73, false);
			Static292.anInt5503 = 0;
			Static105.aString73 = "";
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!dp;)V")
	public static void method2456(@OriginalArg(1) Class53 arg0) {
		Static329.aClass53_150 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!dp;IZ)Lclient!bs;")
	public static Class26 method2458(@OriginalArg(0) Class53 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1014(arg1);
		return local13 == null ? null : new Class26(local13);
	}

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "(I)V")
	public static void method2460() {
		@Pc(1) Class70 local1 = Static30.aClass70_18;
		synchronized (Static30.aClass70_18) {
			Static30.aClass70_18.method1399();
		}
		local1 = Static340.aClass70_19;
		synchronized (Static340.aClass70_19) {
			Static340.aClass70_19.method1399();
		}
		local1 = Static227.aClass70_76;
		synchronized (Static227.aClass70_76) {
			Static227.aClass70_76.method1399();
		}
		local1 = Static183.aClass70_61;
		synchronized (Static183.aClass70_61) {
			Static183.aClass70_61.method1399();
		}
	}

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "(I)V")
	public static void method2461() {
		@Pc(14) int local14;
		@Pc(26) int local26;
		@Pc(34) int local34;
		@Pc(42) int local42;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(48) int local48;
		if (Static336.anInt6134 == 165) {
			local14 = Static142.aClass6_Sub10_Sub1_3.method3989();
			local18 = Static142.aClass6_Sub10_Sub1_3.method3980();
			local22 = local18 >> 2;
			local26 = local18 & 0x3;
			local30 = Static348.anIntArray718[local22];
			local34 = Static142.aClass6_Sub10_Sub1_3.method3972();
			local42 = (local34 >> 4 & 0x7) + Static149.anInt2752;
			local48 = (local34 & 0x7) + Static138.anInt4575;
			if (local42 >= 0 && local48 >= 0 && local42 < Static153.anInt2883 && Static246.anInt4606 > local48) {
				Static86.method1480(local22, local14, local48, -1, 0, local30, local42, Static343.anInt6225, local26);
			}
		} else if (Static336.anInt6134 == 205) {
			local14 = Static142.aClass6_Sub10_Sub1_3.method3972();
			local18 = (local14 >> 4 & 0x7) + Static149.anInt2752;
			local22 = (local14 & 0x7) + Static138.anInt4575;
			local26 = Static142.aClass6_Sub10_Sub1_3.method4021();
			local30 = Static142.aClass6_Sub10_Sub1_3.method4021();
			local34 = Static142.aClass6_Sub10_Sub1_3.method4021();
			if (Static33.aClass108_3 != null && local18 >= 0 && local22 >= 0 && local18 < Static153.anInt2883 && local22 < Static246.anInt4606) {
				@Pc(145) Class6_Sub8 local145 = (Class6_Sub8) Static33.aClass108_3.method2900((long) (local18 | local22 << 14 | Static343.anInt6225 << 28));
				if (local145 != null) {
					for (@Pc(153) Class6_Sub23 local153 = (Class6_Sub23) local145.aClass211_4.method5594(); local153 != null; local153 = (Class6_Sub23) local145.aClass211_4.method5582()) {
						if ((local26 & 0x7FFF) == local153.anInt3151 && local153.anInt3148 == local30) {
							local153.method5756();
							local153.anInt3148 = local34;
							Static207.method3717(local22, Static343.anInt6225, local153, local18);
							break;
						}
					}
					Static226.method4028(local18, local22, Static343.anInt6225);
				}
			}
		} else {
			@Pc(236) int local236;
			@Pc(240) int local240;
			@Pc(244) int local244;
			@Pc(248) int local248;
			@Pc(256) int local256;
			@Pc(262) int local262;
			if (Static336.anInt6134 == 238) {
				local14 = Static142.aClass6_Sub10_Sub1_3.method3995();
				@Pc(206) byte local206 = Static142.aClass6_Sub10_Sub1_3.method3969();
				@Pc(210) byte local210 = Static142.aClass6_Sub10_Sub1_3.method3969();
				local26 = Static142.aClass6_Sub10_Sub1_3.method3995();
				@Pc(220) byte local220 = Static142.aClass6_Sub10_Sub1_3.method3999();
				local34 = Static142.aClass6_Sub10_Sub1_3.method4008();
				local42 = Static142.aClass6_Sub10_Sub1_3.method3994();
				@Pc(232) byte local232 = Static142.aClass6_Sub10_Sub1_3.method3992();
				local236 = Static142.aClass6_Sub10_Sub1_3.method3977();
				local240 = local236 >> 2;
				local244 = local236 & 0x3;
				local248 = Static142.aClass6_Sub10_Sub1_3.method4011();
				local256 = (local248 >> 4 & 0x7) + Static149.anInt2752;
				local262 = Static138.anInt4575 + (local248 & 0x7);
				if (!Static289.aClass81_7.method2988()) {
					Static354.method5808(local240, local232, local34, local42, local26, local220, local244, local210, local206, local256, local14, local262);
				}
			}
			if (Static336.anInt6134 == 118) {
				local14 = Static142.aClass6_Sub10_Sub1_3.method3972();
				local18 = (local14 >> 4 & 0xF) + Static149.anInt2752 * 2;
				local22 = (local14 & 0xF) + Static138.anInt4575 * 2;
				local26 = Static142.aClass6_Sub10_Sub1_3.method3992() + local18;
				local30 = Static142.aClass6_Sub10_Sub1_3.method3992() + local22;
				local34 = Static142.aClass6_Sub10_Sub1_3.method4022();
				local42 = Static142.aClass6_Sub10_Sub1_3.method4022();
				local48 = Static142.aClass6_Sub10_Sub1_3.method4021();
				local236 = Static142.aClass6_Sub10_Sub1_3.method3992();
				local240 = Static142.aClass6_Sub10_Sub1_3.method3972() * 4;
				local244 = Static142.aClass6_Sub10_Sub1_3.method4021();
				local248 = Static142.aClass6_Sub10_Sub1_3.method4021();
				local256 = Static142.aClass6_Sub10_Sub1_3.method3972();
				if (local256 == 255) {
					local256 = -1;
				}
				local262 = Static142.aClass6_Sub10_Sub1_3.method3972();
				if (local18 >= 0 && local22 >= 0 && local18 < 208 && local22 < 208 && local26 >= 0 && local30 >= 0 && local26 < 208 && local30 < 208 && local48 != 65535) {
					local22 *= 64;
					local30 *= 64;
					local26 = local26 * 64;
					local18 *= 64;
					if (local34 != 0) {
						@Pc(436) int local436;
						@Pc(440) Class44_Sub4_Sub4 local440;
						@Pc(426) int local426;
						@Pc(430) int local430;
						if (local34 >= 0) {
							local426 = local34 - 1;
							local430 = local426 & 0x7FF;
							local436 = local426 >> 11 & 0xF;
							local440 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local430];
						} else {
							local426 = -local34 - 1;
							local430 = local426 & 0x7FF;
							local436 = local426 >> 11 & 0xF;
							if (local430 == Static44.anInt879) {
								local440 = Static253.aClass44_Sub4_Sub4_Sub1_1;
							} else {
								local440 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local430];
							}
						}
						if (local440 != null) {
							@Pc(478) Class128 local478 = local440.method4716();
							if (local478.anIntArrayArray123 != null && local478.anIntArrayArray123[local436] != null) {
								local430 = local478.anIntArrayArray123[local436][0];
								@Pc(500) int local500 = local478.anIntArrayArray123[local436][2];
								@Pc(507) int local507 = local440.aClass219_7.method5750();
								@Pc(511) int local511 = Class207.anIntArray697[local507];
								@Pc(515) int local515 = Class207.anIntArray698[local507];
								@Pc(526) int local526 = local511 * local500 + local430 * local515 >> 15;
								@Pc(537) int local537 = local515 * local500 - local430 * local511 >> 15;
								local236 -= local478.anIntArrayArray123[local436][1];
								local22 += local537;
								local18 += local526;
							}
						}
					}
					@Pc(585) Class44_Sub4_Sub3 local585 = new Class44_Sub4_Sub3(local48, Static343.anInt6225, local18, local22, Static306.method5249(local22, local18, Static343.anInt6225) - local236, local244 - -Static76.anInt2853, Static76.anInt2853 + local248, local256, local262, local42, local240);
					local585.method4172(Static306.method5249(local30, local26, Static343.anInt6225) - local240, local26, Static76.anInt2853 + local244, local30);
					Static62.aClass211_5.method5585(new Class6_Sub2_Sub20(local585));
				}
			} else if (Static336.anInt6134 == 174) {
				local14 = Static142.aClass6_Sub10_Sub1_3.method3995();
				local18 = Static142.aClass6_Sub10_Sub1_3.method3972();
				local22 = Static149.anInt2752 + (local18 >> 4 & 0x7);
				local26 = Static138.anInt4575 + (local18 & 0x7);
				local30 = Static142.aClass6_Sub10_Sub1_3.method3995();
				local34 = Static142.aClass6_Sub10_Sub1_3.method3995();
				if (local22 >= 0 && local26 >= 0 && local22 < Static153.anInt2883 && Static246.anInt4606 > local26 && Static44.anInt879 != local34) {
					Static207.method3717(local26, Static343.anInt6225, new Class6_Sub23(local14, local30), local22);
					Static226.method4028(local22, local26, Static343.anInt6225);
				}
			} else {
				@Pc(835) Class44_Sub4_Sub3 local835;
				if (Static336.anInt6134 == 39) {
					local14 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local18 = (local14 >> 4 & 0xF) + Static149.anInt2752 * 2;
					local22 = (local14 & 0xF) + Static138.anInt4575 * 2;
					local26 = local18 + Static142.aClass6_Sub10_Sub1_3.method3992();
					local30 = local22 + Static142.aClass6_Sub10_Sub1_3.method3992();
					local34 = Static142.aClass6_Sub10_Sub1_3.method4022();
					local42 = Static142.aClass6_Sub10_Sub1_3.method4021();
					local48 = Static142.aClass6_Sub10_Sub1_3.method3972() * 4;
					local236 = Static142.aClass6_Sub10_Sub1_3.method3972() * 4;
					local240 = Static142.aClass6_Sub10_Sub1_3.method4021();
					local244 = Static142.aClass6_Sub10_Sub1_3.method4021();
					local248 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local256 = Static142.aClass6_Sub10_Sub1_3.method3972();
					if (local248 == 255) {
						local248 = -1;
					}
					if (local18 >= 0 && local22 >= 0 && local18 < 208 && local22 < 208 && local26 >= 0 && local30 >= 0 && local26 < 208 && local30 < 208 && local42 != 65535) {
						local30 = local30 * 64;
						local26 = local26 * 64;
						local18 *= 64;
						local22 = local22 * 64;
						local835 = new Class44_Sub4_Sub3(local42, Static343.anInt6225, local18, local22, Static306.method5249(local22, local18, Static343.anInt6225) - local48, Static76.anInt2853 + local240, Static76.anInt2853 + local244, local248, local256, local34, local236);
						local835.method4172(Static306.method5249(local30, local26, Static343.anInt6225) - local236, local26, local240 + Static76.anInt2853, local30);
						Static62.aClass211_5.method5585(new Class6_Sub2_Sub20(local835));
					}
				} else if (Static336.anInt6134 == 53) {
					local14 = Static142.aClass6_Sub10_Sub1_3.method3977();
					local18 = local14 >> 2;
					local22 = local14 & 0x3;
					local26 = Static348.anIntArray718[local18];
					local30 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local34 = Static149.anInt2752 + (local30 >> 4 & 0x7);
					local42 = (local30 & 0x7) + Static138.anInt4575;
					if (local34 >= 0 && local42 >= 0 && local34 < Static153.anInt2883 && local42 < Static246.anInt4606) {
						Static86.method1480(local18, -1, local42, -1, 0, local26, local34, Static343.anInt6225, local22);
					}
				} else if (Static336.anInt6134 == 119) {
					local14 = Static142.aClass6_Sub10_Sub1_3.method3994();
					local18 = Static142.aClass6_Sub10_Sub1_3.method3989();
					local22 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local26 = (local22 >> 4 & 0x7) + Static149.anInt2752;
					local30 = (local22 & 0x7) + Static138.anInt4575;
					if (local26 >= 0 && local30 >= 0 && local26 < Static153.anInt2883 && local30 < Static246.anInt4606) {
						Static207.method3717(local30, Static343.anInt6225, new Class6_Sub23(local18, local14), local26);
						Static226.method4028(local26, local30, Static343.anInt6225);
					}
				} else if (Static336.anInt6134 == 213) {
					Static142.aClass6_Sub10_Sub1_3.method3972();
					local14 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local18 = Static149.anInt2752 + (local14 >> 4 & 0x7);
					local22 = (local14 & 0x7) + Static138.anInt4575;
					local26 = Static142.aClass6_Sub10_Sub1_3.method4021();
					local30 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local34 = Static142.aClass6_Sub10_Sub1_3.method3996();
					@Pc(1030) String local1030 = Static142.aClass6_Sub10_Sub1_3.method4023();
					Static339.method5598(local26, local34, local30, local18, local1030, local22);
				} else if (Static336.anInt6134 == 189) {
					local14 = Static142.aClass6_Sub10_Sub1_3.method4011();
					local18 = local14 >> 2;
					local22 = local14 & 0x3;
					local26 = Static348.anIntArray718[local18];
					local30 = Static142.aClass6_Sub10_Sub1_3.method3994();
					if (local30 == 65535) {
						local30 = -1;
					}
					local34 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local42 = Static149.anInt2752 + (local34 >> 4 & 0x7);
					local48 = Static138.anInt4575 + (local34 & 0x7);
					Static309.method5279(local48, local42, local18, Static343.anInt6225, local26, local30, local22);
				} else if (Static336.anInt6134 == 62) {
					local14 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local18 = (local14 >> 4 & 0x7) + Static149.anInt2752;
					local22 = (local14 & 0x7) + Static138.anInt4575;
					local26 = Static142.aClass6_Sub10_Sub1_3.method4021();
					if (local26 == 65535) {
						local26 = -1;
					}
					local30 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local34 = local30 >> 4 & 0xF;
					local42 = local30 & 0x7;
					local48 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local236 = Static142.aClass6_Sub10_Sub1_3.method3972();
					if (local18 >= 0 && local22 >= 0 && local18 < Static153.anInt2883 && Static246.anInt4606 > local22) {
						local240 = local34 + 1;
						if (Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0] >= local18 - local240 && Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0] <= local240 + local18 && Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0] >= local22 - local240 && local240 + local22 >= Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0] && Static243.anInt4564 != 0 && local42 > 0 && Static284.anInt5378 < 50 && local26 != -1) {
							Static194.anIntArray433[Static284.anInt5378] = local26;
							Static194.anIntArray432[Static284.anInt5378] = local42;
							Static263.anIntArray530[Static284.anInt5378] = local48;
							Static65.aClass12Array1[Static284.anInt5378] = null;
							Static209.anIntArray449[Static284.anInt5378] = (local18 << 16) - (-(local22 << 8) - local34);
							Static125.anIntArray307[Static284.anInt5378] = local236;
							Static284.anInt5378++;
						}
					}
				} else if (Static336.anInt6134 == 196) {
					local14 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local18 = Static149.anInt2752 + (local14 >> 4 & 0x7);
					local22 = (local14 & 0x7) + Static138.anInt4575;
					local26 = local18 + Static142.aClass6_Sub10_Sub1_3.method3992();
					local30 = Static142.aClass6_Sub10_Sub1_3.method3992() + local22;
					local34 = Static142.aClass6_Sub10_Sub1_3.method4022();
					local42 = Static142.aClass6_Sub10_Sub1_3.method4021();
					local48 = Static142.aClass6_Sub10_Sub1_3.method3972() * 4;
					local236 = Static142.aClass6_Sub10_Sub1_3.method3972() * 4;
					local240 = Static142.aClass6_Sub10_Sub1_3.method4021();
					local244 = Static142.aClass6_Sub10_Sub1_3.method4021();
					local248 = Static142.aClass6_Sub10_Sub1_3.method3972();
					if (local248 == 255) {
						local248 = -1;
					}
					local256 = Static142.aClass6_Sub10_Sub1_3.method3972();
					if (local18 >= 0 && local22 >= 0 && local18 < Static153.anInt2883 && local22 < Static246.anInt4606 && local26 >= 0 && local30 >= 0 && Static153.anInt2883 > local26 && Static246.anInt4606 > local30 && local42 != 65535) {
						local18 = local18 * 128 + 64;
						local26 = local26 * 128 + 64;
						local22 = local22 * 128 + 64;
						local30 = local30 * 128 + 64;
						local835 = new Class44_Sub4_Sub3(local42, Static343.anInt6225, local18, local22, Static306.method5249(local22, local18, Static343.anInt6225) - local48, Static76.anInt2853 + local240, local244 + Static76.anInt2853, local248, local256, local34, local236);
						local835.method4172(Static306.method5249(local30, local26, Static343.anInt6225) - local236, local26, local240 + Static76.anInt2853, local30);
						Static62.aClass211_5.method5585(new Class6_Sub2_Sub20(local835));
					}
				} else if (Static336.anInt6134 == 200) {
					local14 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local18 = (local14 >> 4 & 0x7) + Static149.anInt2752;
					local22 = (local14 & 0x7) + Static138.anInt4575;
					local26 = Static142.aClass6_Sub10_Sub1_3.method4021();
					local30 = Static142.aClass6_Sub10_Sub1_3.method3972();
					local34 = Static142.aClass6_Sub10_Sub1_3.method4021();
					if (local18 >= 0 && local22 >= 0 && Static153.anInt2883 > local18 && Static246.anInt4606 > local22) {
						local42 = local18 * 128 + 64;
						local48 = local22 * 128 + 64;
						@Pc(1538) Class44_Sub4_Sub2 local1538 = new Class44_Sub4_Sub2(local26, local34, Static76.anInt2853, Static343.anInt6225, local42, Static306.method5249(local48, local42, Static343.anInt6225) - local30, local48, local18, local18, local22, local22);
						Static280.aClass211_32.method5585(new Class6_Sub2_Sub4(local1538));
					}
				} else if (Static336.anInt6134 == 146) {
					local14 = Static142.aClass6_Sub10_Sub1_3.method4021();
					local18 = Static142.aClass6_Sub10_Sub1_3.method3972();
					Static196.method3622(local14).method1371(local18);
				} else if (Static336.anInt6134 == 86) {
					local14 = Static142.aClass6_Sub10_Sub1_3.method4021();
					local18 = Static142.aClass6_Sub10_Sub1_3.method3980();
					local22 = Static149.anInt2752 + (local18 >> 4 & 0x7);
					local26 = Static138.anInt4575 + (local18 & 0x7);
					if (local22 >= 0 && local26 >= 0 && Static153.anInt2883 > local22 && Static246.anInt4606 > local26) {
						@Pc(1632) Class6_Sub8 local1632 = (Class6_Sub8) Static33.aClass108_3.method2900((long) (local22 | local26 << 14 | Static343.anInt6225 << 28));
						if (local1632 != null) {
							for (@Pc(1640) Class6_Sub23 local1640 = (Class6_Sub23) local1632.aClass211_4.method5594(); local1640 != null; local1640 = (Class6_Sub23) local1632.aClass211_4.method5582()) {
								if (local1640.anInt3151 == (local14 & 0x7FFF)) {
									local1640.method5756();
									break;
								}
							}
							if (local1632.aClass211_4.method5589()) {
								local1632.method5756();
							}
							Static226.method4028(local22, local26, Static343.anInt6225);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(CI)B")
	public static byte method2462(@OriginalArg(0) char arg0) {
		@Pc(33) byte local33;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local33 = (byte) arg0;
		} else if (arg0 == '€') {
			local33 = -128;
		} else if (arg0 == '‚') {
			local33 = -126;
		} else if (arg0 == 'ƒ') {
			local33 = -125;
		} else if (arg0 == '„') {
			local33 = -124;
		} else if (arg0 == '…') {
			local33 = -123;
		} else if (arg0 == '†') {
			local33 = -122;
		} else if (arg0 == '‡') {
			local33 = -121;
		} else if (arg0 == 'ˆ') {
			local33 = -120;
		} else if (arg0 == '‰') {
			local33 = -119;
		} else if (arg0 == 'Š') {
			local33 = -118;
		} else if (arg0 == '‹') {
			local33 = -117;
		} else if (arg0 == 'Œ') {
			local33 = -116;
		} else if (arg0 == 'Ž') {
			local33 = -114;
		} else if (arg0 == '‘') {
			local33 = -111;
		} else if (arg0 == '’') {
			local33 = -110;
		} else if (arg0 == '“') {
			local33 = -109;
		} else if (arg0 == '”') {
			local33 = -108;
		} else if (arg0 == '•') {
			local33 = -107;
		} else if (arg0 == '–') {
			local33 = -106;
		} else if (arg0 == '—') {
			local33 = -105;
		} else if (arg0 == '˜') {
			local33 = -104;
		} else if (arg0 == '™') {
			local33 = -103;
		} else if (arg0 == 'š') {
			local33 = -102;
		} else if (arg0 == '›') {
			local33 = -101;
		} else if (arg0 == 'œ') {
			local33 = -100;
		} else if (arg0 == 'ž') {
			local33 = -98;
		} else if (arg0 == 'Ÿ') {
			local33 = -97;
		} else {
			local33 = 63;
		}
		return local33;
	}
}
