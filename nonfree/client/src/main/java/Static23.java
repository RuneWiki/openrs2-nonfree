import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "Lclient!da;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "Lclient!pi;")
	public static final Class284 aClass284_1 = new Class284(true);

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)I")
	public static int method257(@OriginalArg(1) int arg0) {
		@Pc(11) int local11 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local11 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local11 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local11 += 4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local11 += 2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local11++;
		}
		return arg0 + local11;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILclient!jc;)Lclient!qba;")
	public static Class134_Sub2 method258(@OriginalArg(1) Class6_Sub15 arg0) {
		return new Class134_Sub2(arg0.method2989(), arg0.method2989(), arg0.method2989(), arg0.method2989(), arg0.method2987(), arg0.method2987(), arg0.method3030());
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BLclient!lf;)V")
	public static void method259(@OriginalArg(1) Class221 arg0) {
		@Pc(8) Class6_Sub15_Sub1 local8 = Static525.aClass260_4.aClass6_Sub15_Sub1_2;
		@Pc(15) int local15;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(33) int local33;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(50) int local50;
		if (Static560.aClass221_19 == arg0) {
			local15 = local8.method3030();
			local21 = (local15 & 0x7) + Static118.anInt2280;
			local25 = Static404.anInt7039 + local21;
			local33 = (local15 >> 4 & 0x7) + Static497.anInt8376;
			local38 = local33 + Static50.anInt606;
			local42 = local8.method3018();
			local46 = local8.method3018();
			local50 = local8.method3018();
			if (Static650.aClass74_72 != null) {
				@Pc(67) Class6_Sub36 local67 = (Class6_Sub36) Static650.aClass74_72.method1401((long) (local25 << 14 | Static467.anInt8011 << 28 | local38));
				if (local67 != null) {
					for (@Pc(75) Class6_Sub23 local75 = (Class6_Sub23) local67.aClass340_42.method8124(); local75 != null; local75 = (Class6_Sub23) local67.aClass340_42.method8134()) {
						if ((local42 & 0x7FFF) == local75.anInt4411 && local46 == local75.anInt4410) {
							local75.method9051();
							local75.anInt4410 = local50;
							Static201.method3743(local75, local38, Static467.anInt8011, local25);
							break;
						}
					}
					if (local33 >= 0 && local21 >= 0 && Static29.anInt380 > local33 && local21 < Static327.anInt5650) {
						Static459.method7009(local21, Static467.anInt8011, local33);
					}
				}
			}
			return;
		}
		@Pc(230) int local230;
		@Pc(234) int local234;
		@Pc(238) int local238;
		@Pc(242) int local242;
		@Pc(246) int local246;
		@Pc(224) int local224;
		if (Static8.aClass221_1 == arg0) {
			local15 = local8.method3030();
			@Pc(180) boolean local180 = (local15 & 0x80) != 0;
			local25 = Static497.anInt8376 + (local15 >> 3 & 0x7);
			local33 = Static118.anInt2280 + (local15 & 0x7);
			local38 = local8.method3027() + local25;
			local42 = local8.method3027() + local33;
			local46 = local8.method2989();
			local50 = local8.method3018();
			local224 = local8.method3030() * 4;
			local230 = local8.method3030() * 4;
			local234 = local8.method3018();
			local238 = local8.method3018();
			local242 = local8.method3030();
			local246 = local8.method3018();
			if (local242 == 255) {
				local242 = -1;
			}
			if (local25 >= 0 && local33 >= 0 && local25 < Static29.anInt380 && local33 < Static327.anInt5650 && local38 >= 0 && local42 >= 0 && Static29.anInt380 > local38 && local42 < Static327.anInt5650 && local50 != 65535) {
				local246 <<= 0x2;
				local224 <<= 0x2;
				local42 = local42 * 512 + 256;
				local33 = local33 * 512 + 256;
				local230 <<= 0x2;
				local38 = local38 * 512 + 256;
				local25 = local25 * 512 + 256;
				@Pc(371) Class60_Sub1_Sub1_Sub5 local371 = new Class60_Sub1_Sub1_Sub5(local50, Static467.anInt8011, Static467.anInt8011, local25, local33, local224, local234 + Static141.anInt8737, local238 - -Static141.anInt8737, local242, local246, 0, local46, local230, local180, -1);
				local371.method7282(Static248.method4318(local42, Static467.anInt8011, local38) - local230, local42, local234 + Static141.anInt8737, local38);
				Static437.aClass340_58.method8131(new Class6_Sub2_Sub6(local371));
			}
		} else if (arg0 == Static573.aClass221_20) {
			local15 = local8.method3036();
			local21 = (local15 >> 4 & 0x7) + Static497.anInt8376;
			local25 = (local15 & 0x7) + Static118.anInt2280;
			local33 = local8.method3042();
			if (local33 == 65535) {
				local33 = -1;
			}
			local38 = local8.method3021();
			local42 = local38 >> 2;
			local46 = local38 & 0x3;
			local50 = Static49.anIntArray45[local42];
			Static71.method942(local21, local33, Static467.anInt8011, local42, local50, local25, local46);
		} else if (arg0 == Static144.aClass221_15) {
			local15 = local8.method3030();
			local21 = (local15 >> 4 & 0x7) + Static497.anInt8376;
			local25 = (local15 & 0x7) + Static118.anInt2280;
			local33 = local8.method3018();
			if (local33 == 65535) {
				local33 = -1;
			}
			local38 = local8.method3030();
			local42 = local38 >> 4 & 0xF;
			local46 = local38 & 0x7;
			local50 = local8.method3030();
			local224 = local8.method3030();
			local230 = local8.method3018();
			if (local21 >= 0 && local25 >= 0 && local21 < Static29.anInt380 && Static327.anInt5650 > local25) {
				local234 = local42 + 1;
				if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0] >= local21 - local234 && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0] <= local21 + local234 && local25 - local234 <= Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0] && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0] <= local234 + local25) {
					Static25.method328(local50, local224, local46, local33, local42 + (local21 << 16) + (Static467.anInt8011 << 24) + (local25 << 8), local230);
				}
			}
		} else if (arg0 == Static354.aClass221_13) {
			local15 = local8.method3005();
			local21 = local8.method3036();
			local25 = (local21 >> 4 & 0x7) + Static497.anInt8376;
			local33 = (local21 & 0x7) + Static118.anInt2280;
			local38 = local8.method3034();
			local42 = local38 >> 2;
			local46 = local38 & 0x3;
			local50 = Static49.anIntArray45[local42];
			if (Static276.method4639(Static541.anInt9249) || local25 >= 0 && local33 >= 0 && Static29.anInt380 > local25 && local33 < Static327.anInt5650) {
				Static251.method4375(local15, local33, local25, local42, Static467.anInt8011, local46, local50);
			}
		} else {
			@Pc(884) int local884;
			@Pc(917) int local917;
			if (Static168.aClass221_6 == arg0) {
				local15 = local8.method3042();
				@Pc(719) Class125 local719 = Static290.aClass163_5.method4124(121, local15);
				local25 = local8.method3021();
				local33 = Static497.anInt8376 + (local25 >> 4 & 0x7);
				local38 = (local25 & 0x7) + Static118.anInt2280;
				local42 = local8.method3034();
				local46 = local8.method3021();
				local50 = local46 >> 2;
				local224 = Static49.anIntArray45[local50];
				if (local50 == 11) {
					local50 = 10;
				}
				local230 = 0;
				if (local719.aByteArray24 != null) {
					local234 = -1;
					for (local238 = 0; local238 < local719.aByteArray24.length; local238++) {
						if (local50 == local719.aByteArray24[local238]) {
							local234 = local238;
							break;
						}
					}
					local230 = local719.anIntArrayArray14[local234].length;
				}
				local234 = 0;
				if (local719.aShortArray45 != null) {
					local234 = local719.aShortArray45.length;
				}
				local238 = 0;
				if (local719.aShortArray42 != null) {
					local238 = local719.aShortArray42.length;
				}
				if ((local42 & 0x1) == 1) {
					Static416.method6406(local224, (Class22) null, Static467.anInt8011, local33, local38);
				} else {
					@Pc(848) int[] local848 = null;
					if ((local42 & 0x2) == 2) {
						local848 = new int[local230];
						for (local246 = 0; local246 < local230; local246++) {
							local848[local246] = local8.method3018();
						}
					}
					@Pc(874) short[] local874 = null;
					if ((local42 & 0x4) == 4) {
						local874 = new short[local234];
						for (local884 = 0; local884 < local234; local884++) {
							local874[local884] = (short) local8.method3018();
						}
					}
					@Pc(905) short[] local905 = null;
					if ((local42 & 0x8) == 8) {
						local905 = new short[local238];
						for (local917 = 0; local917 < local238; local917++) {
							local905[local917] = (short) local8.method3018();
						}
					}
					Static416.method6406(local224, new Class22((long) Static9.aLong3++, local848, local874, local905), Static467.anInt8011, local33, local38);
				}
			} else if (arg0 == Static206.aClass221_7) {
				local8.method3030();
				local15 = local8.method3030();
				local21 = Static497.anInt8376 + (local15 >> 4 & 0x7);
				local25 = Static118.anInt2280 + (local15 & 0x7);
				local33 = local8.method3018();
				local38 = local8.method3030();
				local42 = local8.method2987();
				@Pc(1003) String local1003 = local8.method3046();
				Static128.method2493(local38, local42, local25, local33, local1003, Static467.anInt8011, local21);
			} else if (arg0 == Static647.aClass221_21) {
				local15 = local8.method3030();
				local21 = (local15 >> 4 & 0xF) + Static497.anInt8376 * 2;
				local25 = (local15 & 0xF) + Static118.anInt2280 * 2;
				local33 = local8.method3030();
				@Pc(1055) boolean local1055 = (local33 & 0x1) != 0;
				@Pc(1067) boolean local1067 = (local33 & 0x2) != 0;
				local46 = local1067 ? local33 >> 2 : -1;
				local50 = local21 + local8.method3027();
				local224 = local25 + local8.method3027();
				local230 = local8.method2989();
				local234 = local8.method2989();
				local238 = local8.method3018();
				local242 = local8.method3030();
				if (local1067) {
					local242 = (byte) local242;
				} else {
					local242 *= 4;
				}
				local246 = local8.method3030() * 4;
				local884 = local8.method3018();
				local917 = local8.method3018();
				@Pc(1134) int local1134 = local8.method3030();
				if (local1134 == 255) {
					local1134 = -1;
				}
				@Pc(1143) int local1143 = local8.method3018();
				if (local21 >= 0 && local25 >= 0 && local21 < Static29.anInt380 * 2 && Static29.anInt380 * 2 > local25 && local50 >= 0 && local224 >= 0 && Static327.anInt5650 * 2 > local50 && local224 < Static327.anInt5650 * 2 && local238 != 65535) {
					local1143 <<= 0x2;
					local21 *= 256;
					local242 <<= 0x2;
					local25 = local25 * 256;
					local224 *= 256;
					local50 *= 256;
					local246 <<= 0x2;
					if (local230 != 0 && local46 != -1) {
						@Pc(1251) Class60_Sub1_Sub1_Sub3 local1251 = null;
						@Pc(1257) int local1257;
						if (local230 >= 0) {
							local1257 = local230 - 1;
							@Pc(1264) Class6_Sub11 local1264 = (Class6_Sub11) Static419.aClass74_45.method1401((long) local1257);
							if (local1264 != null) {
								local1251 = local1264.aClass60_Sub1_Sub1_Sub3_Sub2_1;
							}
						} else {
							local1257 = -local230 - 1;
							if (Static503.anInt8407 == local1257) {
								local1251 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1;
							} else {
								local1251 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local1257];
							}
						}
						if (local1251 != null) {
							@Pc(1295) Class396 local1295 = local1251.method4417(27750);
							if (local1295.anIntArrayArray60 != null && local1295.anIntArrayArray60[local46] != null) {
								local242 -= local1295.anIntArrayArray60[local46][1];
							}
							if (local1295.anIntArrayArray61 != null && local1295.anIntArrayArray61[local46] != null) {
								local242 -= local1295.anIntArrayArray61[local46][1];
							}
						}
					}
					@Pc(1357) Class60_Sub1_Sub1_Sub5 local1357 = new Class60_Sub1_Sub1_Sub5(local238, Static467.anInt8011, Static467.anInt8011, local21, local25, local242, local884 + Static141.anInt8737, Static141.anInt8737 + local917, local1134, local1143, local230, local234, local246, local1055, local46);
					local1357.method7282(Static248.method4318(local224, Static467.anInt8011, local50) - local246, local224, local884 + Static141.anInt8737, local50);
					Static437.aClass340_58.method8131(new Class6_Sub2_Sub6(local1357));
				}
			} else if (arg0 == Static536.aClass221_17) {
				local15 = local8.method3048();
				local21 = local8.method3036();
				local25 = Static118.anInt2280 + (local21 & 0x7);
				local33 = Static404.anInt7039 + local25;
				local38 = (local21 >> 4 & 0x7) + Static497.anInt8376;
				local42 = local38 + Static50.anInt606;
				local46 = local8.method3005();
				@Pc(1449) boolean local1449 = local38 >= 0 && local25 >= 0 && local38 < Static29.anInt380 && Static327.anInt5650 > local25;
				if (local1449 || Static276.method4639(Static541.anInt9249)) {
					Static201.method3743(new Class6_Sub23(local46, local15), local42, Static467.anInt8011, local33);
					if (local1449) {
						Static459.method7009(local25, Static467.anInt8011, local38);
					}
				}
			} else if (Static560.aClass221_18 == arg0) {
				local15 = local8.method3021();
				local21 = local15 >> 2;
				local25 = local15 & 0x3;
				local33 = Static49.anIntArray45[local21];
				local38 = local8.method3030();
				local42 = Static497.anInt8376 + (local38 >> 4 & 0x7);
				local46 = Static118.anInt2280 + (local38 & 0x7);
				if (Static276.method4639(Static541.anInt9249) || local42 >= 0 && local46 >= 0 && local42 < Static29.anInt380 && local46 < Static327.anInt5650) {
					Static251.method4375(-1, local46, local42, local21, Static467.anInt8011, local25, local33);
				}
			} else if (Static144.aClass221_16 == arg0) {
				local15 = local8.method3021();
				local21 = (local15 & 0x7) + Static118.anInt2280;
				local25 = Static404.anInt7039 + local21;
				local33 = (local15 >> 4 & 0x7) + Static497.anInt8376;
				local38 = Static50.anInt606 + local33;
				local42 = local8.method3048();
				@Pc(1612) Class6_Sub36 local1612 = (Class6_Sub36) Static650.aClass74_72.method1401((long) (local38 | Static467.anInt8011 << 28 | local25 << 14));
				if (local1612 != null) {
					for (@Pc(1620) Class6_Sub23 local1620 = (Class6_Sub23) local1612.aClass340_42.method8124(); local1620 != null; local1620 = (Class6_Sub23) local1612.aClass340_42.method8134()) {
						if (local1620.anInt4411 == (local42 & 0x7FFF)) {
							local1620.method9051();
							break;
						}
					}
					if (local1612.aClass340_42.method8121()) {
						local1612.method9051();
					}
					if (local33 >= 0 && local21 >= 0 && Static29.anInt380 > local33 && Static327.anInt5650 > local21) {
						Static459.method7009(local21, Static467.anInt8011, local33);
					}
				}
			} else if (arg0 == Static152.aClass221_4) {
				local15 = local8.method3018();
				local21 = local8.method3030();
				Static290.aClass163_5.method4124(125, local15).method3388(local21);
			} else if (Static160.aClass221_5 == arg0) {
				local15 = local8.method3030();
				local21 = (local15 >> 4 & 0x7) + Static497.anInt8376;
				local25 = Static118.anInt2280 + (local15 & 0x7);
				local33 = local8.method3018();
				local38 = local8.method3030();
				local42 = local8.method3018();
				local46 = local8.method3030();
				if (local21 >= 0 && local25 >= 0 && Static29.anInt380 > local21 && Static327.anInt5650 > local25) {
					local50 = local21 * 512 + 256;
					local224 = local25 * 512 + 256;
					local230 = Static467.anInt8011;
					if (local230 < 3 && Static180.method3417(1, local21, local25)) {
						local230++;
					}
					@Pc(1819) Class60_Sub1_Sub1_Sub2 local1819 = new Class60_Sub1_Sub1_Sub2(local33, local42, Static467.anInt8011, local230, local50, Static248.method4318(local224, Static467.anInt8011, local50) - local38, local224, local21, local21, local25, local25, local46, false);
					Static276.aClass340_37.method8131(new Class6_Sub2_Sub13(local1819));
				}
			} else if (Static287.aClass221_8 == arg0) {
				local15 = local8.method3042();
				local21 = local8.method3030();
				local25 = Static118.anInt2280 + (local21 & 0x7);
				local33 = local25 + Static404.anInt7039;
				local38 = Static497.anInt8376 + (local21 >> 4 & 0x7);
				local42 = local38 + Static50.anInt606;
				local46 = local8.method3018();
				local50 = local8.method3005();
				if (Static503.anInt8407 != local46) {
					@Pc(1899) boolean local1899 = local38 >= 0 && local25 >= 0 && local38 < Static29.anInt380 && Static327.anInt5650 > local25;
					if (local1899 || Static276.method4639(Static541.anInt9249)) {
						Static201.method3743(new Class6_Sub23(local50, local15), local42, Static467.anInt8011, local33);
						if (local1899) {
							Static459.method7009(local25, Static467.anInt8011, local38);
						}
					}
				}
			} else if (Static408.aClass221_14 == arg0) {
				local15 = local8.method3030();
				local21 = (local15 >> 4 & 0x7) + Static497.anInt8376;
				local25 = (local15 & 0x7) + Static118.anInt2280;
				local33 = local8.method3018();
				if (local33 == 65535) {
					local33 = -1;
				}
				local38 = local8.method3030();
				local42 = local38 >> 4 & 0xF;
				local46 = local38 & 0x7;
				local50 = local8.method3030();
				local224 = local8.method3030();
				local230 = local8.method3018();
				if (local21 >= 0 && local25 >= 0 && local21 < Static29.anInt380 && local25 < Static327.anInt5650) {
					local234 = local42 + 1;
					if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0] >= local21 - local234 && local21 + local234 >= Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray263[0] && local25 - local234 <= Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0] && local234 + local25 >= Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anIntArray264[0]) {
						Static573.method8013(local42 + (local25 << 8) + (local21 << 16) + (Static467.anInt8011 << 24), local50, local224, local230, local46, local33);
					}
				}
			} else {
				Static550.method7785((Throwable) null, "T3 - " + arg0);
				Static166.method3296(false);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
	public static void method261(@OriginalArg(0) int arg0) {
		@Pc(17) Class6_Sub2_Sub4 local17 = Static602.method8315((long) arg0, 10);
		local17.method2038();
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	public static void method262() throws Exception_Sub1 {
		if (Static290.anInt10204 == 1) {
			Static409.aClass75_13.method6639(Static592.anInt9421, Static211.anInt4193);
		} else {
			Static409.aClass75_13.method6639(0, 0);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method263(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			for (@Pc(39) long local39 = arg0; local39 != 0L; local39 /= 37L) {
				local37++;
			}
			@Pc(59) StringBuffer local59 = new StringBuffer(local37);
			while (arg0 != 0L) {
				@Pc(65) long local65 = arg0;
				arg0 /= 37L;
				local59.append(Static330.aCharArray10[(int) (local65 - arg0 * 37L)]);
			}
			return local59.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
	public static void method264() {
		@Pc(7) short local7 = 1024;
		@Pc(9) short local9 = 3072;
		if (Static490.aBoolean634) {
			if (Static473.aBoolean609) {
				local7 = 2048;
			}
			local9 = 4096;
		}
		if (Static135.aFloat51 < (float) local7) {
			Static135.aFloat51 = (float) local7;
		}
		if (Static135.aFloat51 > (float) local9) {
			Static135.aFloat51 = (float) local9;
		}
		while (Static409.aFloat135 >= 16384.0F) {
			Static409.aFloat135 -= 16384.0F;
		}
		while (Static409.aFloat135 < 0.0F) {
			Static409.aFloat135 += 16384.0F;
		}
		@Pc(69) int local69 = Static170.anInt3533 >> 9;
		@Pc(78) int local78 = Static331.anInt8309 >> 9;
		@Pc(86) int local86 = Static248.method4318(Static331.anInt8309, Static504.anInt8428, Static170.anInt3533);
		@Pc(88) int local88 = 0;
		@Pc(122) int local122;
		if (local69 > 3 && local78 > 3 && Static29.anInt380 - 4 > local69 && Static327.anInt5650 - 4 > local78) {
			for (local122 = local69 - 4; local122 <= local69 + 4; local122++) {
				for (@Pc(130) int local130 = local78 - 4; local130 <= local78 + 4; local130++) {
					@Pc(134) int local134 = Static504.anInt8428;
					if (local134 < 3 && Static180.method3417(1, local122, local130)) {
						local134++;
					}
					@Pc(151) int local151 = 0;
					if (Static286.aClass116_Sub1_4.aByteArrayArrayArray13 != null && Static286.aClass116_Sub1_4.aByteArrayArrayArray13[local134] != null) {
						local151 = (Static286.aClass116_Sub1_4.aByteArrayArrayArray13[local134][local122][local130] & 0xFF) * 8 << 2;
					}
					if (Static555.aClass96Array3 != null && Static555.aClass96Array3[local134] != null) {
						@Pc(198) int local198 = local151 + local86 - Static555.aClass96Array3[local134].method8080(local122, local130);
						if (local198 > local88) {
							local88 = local198;
						}
					}
				}
			}
		}
		local122 = (local88 >> 2) * 1536;
		if (local122 > 786432) {
			local122 = 786432;
		}
		if (local122 < 262144) {
			local122 = 262144;
		}
		if (local122 > Static97.anInt1438) {
			Static97.anInt1438 += (local122 - Static97.anInt1438) / 24;
		} else if (local122 < Static97.anInt1438) {
			Static97.anInt1438 += (local122 - Static97.anInt1438) / 80;
		}
	}
}
