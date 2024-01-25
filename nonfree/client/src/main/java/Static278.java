import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Lclient!np;")
	public static Class143 aClass143_20;

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
	public static int anInt6303 = 0;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
	public static int anInt6305 = 0;

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray74 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!g;)Ljava/lang/String;")
	public static String method5396(@OriginalArg(1) Class11_Sub14 arg0) {
		return arg0.aString17 == null || arg0.aString17.length() <= 0 ? arg0.aString16 : arg0.aString16 + Static220.aClass117_78.method2684(Static230.anInt4634) + arg0.aString17;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Lclient!uq;")
	public static Class10_Sub6 method5397() {
		@Pc(8) Class10_Sub6 local8 = (Class10_Sub6) Static29.aClass210_1.method5616();
		if (local8 == null) {
			return new Class10_Sub6();
		} else {
			Static16.anInt275--;
			return local8;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLclient!oo;Z)V")
	public static void method5402(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class67_Sub3_Sub3 arg1) {
		@Pc(9) Class55 local9 = arg1.method4374();
		if (arg1.anInt5074 == 0) {
			Static166.anInt3311 = -1;
			arg1.anInt5071 = 0;
			Static191.anInt6243 = 0;
			return;
		}
		if (arg1.anInt5013 != -1 && arg1.anInt5001 == 0) {
			@Pc(35) Class111 local35 = Static306.method5143(arg1.anInt5013);
			if (arg1.anInt5063 > 0 && local35.anInt2713 == 0) {
				Static166.anInt3311 = -1;
				Static191.anInt6243 = 0;
				arg1.anInt5071++;
				return;
			}
			if (arg1.anInt5063 <= 0 && local35.anInt2711 == 0) {
				Static191.anInt6243 = 0;
				arg1.anInt5071++;
				Static166.anInt3311 = -1;
				return;
			}
		}
		if (arg1.anInt5043 != -1 && arg1.anInt5061 <= Static293.anInt5807) {
			@Pc(95) Class213 local95 = Static89.method1296(arg1.anInt5043);
			if (local95.aBoolean424 && local95.anInt6649 != -1) {
				@Pc(108) Class111 local108 = Static306.method5143(local95.anInt6649);
				if (arg1.anInt5063 > 0 && local108.anInt2713 == 0) {
					Static166.anInt3311 = -1;
					Static191.anInt6243 = 0;
					arg1.anInt5071++;
					return;
				}
				if (arg1.anInt5063 <= 0 && local108.anInt2711 == 0) {
					arg1.anInt5071++;
					Static166.anInt3311 = -1;
					Static191.anInt6243 = 0;
					return;
				}
			}
		}
		@Pc(154) int local154 = arg1.anInt6308;
		@Pc(157) int local157 = arg1.anInt6310;
		@Pc(173) int local173 = arg1.anIntArray391[arg1.anInt5074 - 1] * 128 + arg1.method4368() * 64;
		@Pc(189) int local189 = arg1.anIntArray392[arg1.anInt5074 - 1] * 128 + arg1.method4368() * 64;
		if (!arg0 && (local173 - local154 > 256 || local173 - local154 < -256 || local189 - local157 > 256 || local189 - local157 < -256)) {
			arg1.anInt6310 = local189;
			Static191.anInt6243 = 0;
			Static166.anInt3311 = -1;
			arg1.anInt6308 = local173;
			return;
		}
		if (local154 >= local173) {
			if (local154 <= local173) {
				if (local189 > local157) {
					arg1.method4370(8192);
				} else if (local189 < local157) {
					arg1.method4370(0);
				}
			} else if (local157 < local189) {
				arg1.method4370(6144);
			} else if (local189 >= local157) {
				arg1.method4370(4096);
			} else {
				arg1.method4370(2048);
			}
		} else if (local189 > local157) {
			arg1.method4370(10240);
		} else if (local189 >= local157) {
			arg1.method4370(12288);
		} else {
			arg1.method4370(14336);
		}
		@Pc(316) int local316 = 4;
		@Pc(318) boolean local318 = true;
		if (arg1 instanceof Class67_Sub3_Sub3_Sub1) {
			local318 = ((Class67_Sub3_Sub3_Sub1) arg1).aClass82_1.aBoolean112;
		}
		if (local318) {
			@Pc(358) int local358 = arg1.anInt5044 - arg1.aClass17_7.anInt269;
			if (local358 != 0 && arg1.anInt5023 == -1 && arg1.anInt5055 != 0) {
				local316 = 2;
			}
			if (!arg0 && arg1.anInt5074 > 2) {
				local316 = 6;
			}
			if (!arg0 && arg1.anInt5074 > 3) {
				local316 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt5074 > 1) {
				local316 = 6;
			}
			if (!arg0 && arg1.anInt5074 > 2) {
				local316 = 8;
			}
		}
		if (arg1.anInt5071 > 0 && arg1.anInt5074 > 1) {
			arg1.anInt5071--;
			local316 = 8;
		}
		@Pc(414) byte local414 = arg1.aByteArray87[arg1.anInt5074 - 1];
		if (local414 == 2) {
			local316 <<= 0x1;
		} else if (local414 == 0) {
			local316 >>= 0x1;
		}
		Static191.anInt6243 = 0;
		if (local9.anInt1185 != -1) {
			local316 <<= 0x7;
			if (arg1.anInt5074 == 1) {
				@Pc(455) int local455 = arg1.anInt5070 * arg1.anInt5070;
				@Pc(476) int local476 = (local173 < arg1.anInt6308 ? arg1.anInt6308 - local173 : -arg1.anInt6308 + local173) << 7;
				@Pc(498) int local498 = (local189 < arg1.anInt6310 ? arg1.anInt6310 - local189 : local189 + -arg1.anInt6310) << 7;
				@Pc(505) int local505 = local476 > local498 ? local476 : local498;
				@Pc(512) int local512 = local505 * local9.anInt1185 * 2;
				if (local455 > local512) {
					arg1.anInt5070 /= 2;
				} else if (local505 < local455 / 2) {
					arg1.anInt5070 -= local9.anInt1185;
					if (arg1.anInt5070 < 0) {
						arg1.anInt5070 = 0;
					}
				} else if (local316 > arg1.anInt5070) {
					arg1.anInt5070 += local9.anInt1185;
					if (arg1.anInt5070 > local316) {
						arg1.anInt5070 = local316;
					}
				}
			} else if (arg1.anInt5070 < local316) {
				arg1.anInt5070 += local9.anInt1185;
				if (local316 < arg1.anInt5070) {
					arg1.anInt5070 = local316;
				}
			} else if (arg1.anInt5070 > 0) {
				arg1.anInt5070 -= local9.anInt1185;
				if (arg1.anInt5070 < 0) {
					arg1.anInt5070 = 0;
				}
			}
			local316 = arg1.anInt5070 >> 7;
			if (local316 < 1) {
				local316 = 1;
			}
		}
		if (local173 > local154) {
			Static191.anInt6243 |= 0x4;
			arg1.anInt6308 += local316;
			if (local173 < arg1.anInt6308) {
				arg1.anInt6308 = local173;
			}
		} else if (local154 > local173) {
			Static191.anInt6243 |= 0x8;
			arg1.anInt6308 -= local316;
			if (local173 > arg1.anInt6308) {
				arg1.anInt6308 = local173;
			}
		}
		if (local157 < local189) {
			Static191.anInt6243 |= 0x1;
			arg1.anInt6310 += local316;
			if (arg1.anInt6310 > local189) {
				arg1.anInt6310 = local189;
			}
		} else if (local189 < local157) {
			Static191.anInt6243 |= 0x2;
			arg1.anInt6310 -= local316;
			if (arg1.anInt6310 < local189) {
				arg1.anInt6310 = local189;
			}
		}
		if (local173 == arg1.anInt6308 && local189 == arg1.anInt6310) {
			if (arg1.anInt5063 > 0) {
				arg1.anInt5063--;
			}
			arg1.anInt5074--;
		}
		if (local316 >= 8) {
			Static166.anInt3311 = 2;
		} else {
			Static166.anInt3311 = local414;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static212.anInt4350++;
		Static202.anInt4130 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static104.anInt1933; local7 < Static279.anInt5583; local7++) {
			@Pc(12) Class106[][] local12 = Static212.aClass106ArrayArrayArray2[local7];
			for (local14 = Static54.anInt1025; local14 < Static199.anInt4037; local14++) {
				for (@Pc(17) int local17 = Static305.anInt5983; local17 < Static108.anInt2044; local17++) {
					@Pc(24) Class106 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static8.aBooleanArrayArray1[local14 + Static209.anInt4263 - Static6.anInt4021][local17 + Static209.anInt4263 - Static104.anInt1932] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean175 = true;
							local24.aBoolean174 = true;
							if (local24.aClass64_4 == null) {
								local24.aBoolean173 = false;
							} else {
								local24.aBoolean173 = true;
							}
							Static202.anInt4130++;
						} else {
							local24.aBoolean175 = false;
							local24.aBoolean174 = false;
							local24.aByte24 = 0;
							if (local14 >= Static6.anInt4021 - 16 && local14 <= Static6.anInt4021 + 16 && local17 >= Static104.anInt1932 - 16 && local17 <= Static104.anInt1932 + 16 && (local24.aClass67_Sub2_1 != null || local24.aClass67_Sub2_2 != null || local24.aClass67_Sub1_1 != null || local24.aClass67_Sub1_2 != null || local24.aClass67_Sub4_1 != null || local24.aClass64_4 != null)) {
								Static74.aClass38_1.method4164(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static79.aClass77Array5 == Static108.aClass77Array2;
		for (local14 = Static104.anInt1933; local14 < Static279.anInt5583; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static174.aClass129_5.method4927() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static8.aBooleanArrayArray1.length;
				if (Static54.anInt1025 + Static8.aBooleanArrayArray1.length > Static232.anInt4703) {
					local172 -= Static54.anInt1025 + Static8.aBooleanArrayArray1.length - Static232.anInt4703;
				}
				@Pc(192) int local192 = Static8.aBooleanArrayArray1[0].length;
				if (Static305.anInt5983 + Static8.aBooleanArrayArray1[0].length > Static300.anInt5931) {
					local192 -= Static305.anInt5983 + Static8.aBooleanArrayArray1[0].length - Static300.anInt5931;
				}
				@Pc(213) int local213 = Static256.anInt5196;
				while (true) {
					if (local213 >= local172) {
						Static74.aClass38_1.method4165(local161, local14, Static108.aClass77Array2[local14], true);
						break;
					}
					@Pc(220) int local220 = local213 + Static54.anInt1025 - Static256.anInt5196;
					for (@Pc(222) int local222 = Static199.anInt4035; local222 < local192; local222++) {
						Static195.aBooleanArrayArray6[local213][local222] = false;
						if (Static8.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static305.anInt5983 - Static199.anInt4035;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static212.aClass106ArrayArrayArray2[local243][local220][local241] != null && Static212.aClass106ArrayArrayArray2[local243][local220][local241].aByte26 == local14) {
									Static195.aBooleanArrayArray6[local213][local222] = Static212.aClass106ArrayArrayArray2[local243][local220][local241].aBoolean175;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static74.aClass38_1.method4165(local161, local14, Static108.aClass77Array2[local14], false);
			}
			Static74.aClass38_1.method4170();
		}
		if (!Static58.method871(true)) {
			Static58.method871(false);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLclient!nq;)V")
	public static void method5405(@OriginalArg(1) Class144 arg0) {
		Static30.aClass144_8 = arg0;
		Static49.anInt943 = Static30.aClass144_8.method3890(15);
	}
}
