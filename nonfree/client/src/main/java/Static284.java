import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "Z")
	public static boolean aBoolean418 = true;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
	public static int anInt5597 = -1;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "Z")
	public static boolean aBoolean419 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
	public static void method4835() {
		if (Static174.method3345() != 2) {
			return;
		}
		@Pc(17) byte local17 = (byte) (Static357.anInt6820 - 4 & 0xFF);
		@Pc(21) int local21 = Static357.anInt6820 % Static350.anInt6637;
		@Pc(33) int local33;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			for (local33 = 0; local33 < Static105.anInt2647; local33++) {
				Static63.aByteArrayArrayArray3[local23][local21][local33] = local17;
			}
		}
		if (Static12.anInt267 == 3) {
			return;
		}
		for (local33 = 0; local33 < 2; local33++) {
			Static226.anIntArray388[local33] = -1000000;
			Static151.anIntArray271[local33] = 1000000;
			Static103.anIntArray229[local33] = 0;
			Static274.anIntArray443[local33] = 1000000;
			Static7.anIntArray6[local33] = 0;
		}
		@Pc(131) int local131;
		if (Static353.anInt2640 != 1) {
			local131 = Static81.method2010(Static12.anInt267, Static129.anInt3039, Static240.anInt4829);
			if (local131 - Static112.anInt2705 >= 800 || (Static2.aByteArrayArrayArray1[Static12.anInt267][Static240.anInt4829 >> 7][Static129.anInt3039 >> 7] & 0x4) == 0) {
				return;
			}
			Static127.method2627(Static240.anInt4829 >> 7, Static273.aClass128ArrayArrayArray4, Static129.anInt3039 >> 7, 1, false);
			return;
		}
		if ((Static2.aByteArrayArrayArray1[Static12.anInt267][Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 >> 7][Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 >> 7] & 0x4) != 0) {
			Static127.method2627(Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 >> 7, Static273.aClass128ArrayArrayArray4, Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 >> 7, 0, false);
		}
		if (Static337.anInt6445 >= 2560) {
			return;
		}
		local131 = Static240.anInt4829 >> 7;
		@Pc(135) int local135 = Static129.anInt3039 >> 7;
		@Pc(140) int local140 = Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 >> 7;
		@Pc(145) int local145 = Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 >> 7;
		@Pc(153) int local153;
		if (local140 <= local131) {
			local153 = local131 - local140;
		} else {
			local153 = local140 - local131;
		}
		@Pc(171) int local171;
		if (local135 >= local145) {
			local171 = local135 - local145;
		} else {
			local171 = local145 - local135;
		}
		if ((local153 != 0 || local171 != 0) && (-Static350.anInt6637) < local153 && Static350.anInt6637 > local153 && local171 > -Static105.anInt2647 && local171 < Static105.anInt2647) {
			@Pc(250) int local250;
			@Pc(252) int local252;
			if (local171 >= local153) {
				local250 = local153 * 65536 / local171;
				local252 = 32768;
				while (local145 != local135) {
					if (local145 > local135) {
						local135++;
					} else if (local135 > local145) {
						local135--;
					}
					if ((Static2.aByteArrayArrayArray1[Static12.anInt267][local131][local135] & 0x4) != 0) {
						Static127.method2627(local131, Static273.aClass128ArrayArrayArray4, local135, 1, false);
						return;
					}
					local252 += local250;
					if (local252 >= 65536) {
						local252 -= 65536;
						if (local140 > local131) {
							local131++;
						} else if (local131 > local140) {
							local131--;
						}
						if ((Static2.aByteArrayArrayArray1[Static12.anInt267][local131][local135] & 0x4) != 0) {
							Static127.method2627(local131, Static273.aClass128ArrayArrayArray4, local135, 1, false);
							return;
						}
					}
				}
				return;
			}
			local250 = local171 * 65536 / local153;
			local252 = 32768;
			while (local131 != local140) {
				if (local131 < local140) {
					local131++;
				} else if (local140 < local131) {
					local131--;
				}
				if ((Static2.aByteArrayArrayArray1[Static12.anInt267][local131][local135] & 0x4) != 0) {
					Static127.method2627(local131, Static273.aClass128ArrayArrayArray4, local135, 1, false);
					return;
				}
				local252 += local250;
				if (local252 >= 65536) {
					local252 -= 65536;
					if (local135 < local145) {
						local135++;
					} else if (local145 < local135) {
						local135--;
					}
					if ((Static2.aByteArrayArrayArray1[Static12.anInt267][local131][local135] & 0x4) != 0) {
						Static127.method2627(local131, Static273.aClass128ArrayArrayArray4, local135, 1, false);
						return;
					}
				}
			}
			return;
		}
		Static289.method4874("RC: " + local131 + "," + local135 + " " + local140 + "," + local145 + " " + Static286.anInt6699 + "," + Static136.anInt3193, null);
		return;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([B[Lclient!qr;ZILclient!vq;II)V")
	public static void method4836(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class170[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class47 arg4, @OriginalArg(5) int arg5) {
		@Pc(18) Class4_Sub11 local18 = new Class4_Sub11(arg0);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method3416();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method3457();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local18.method3440();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(78) int local78 = local57 + arg3;
				@Pc(83) int local83 = local51 + arg5;
				if (local78 > 0 && local83 > 0 && Static350.anInt6637 - 1 > local78 && local83 < Static105.anInt2647 - 1) {
					@Pc(102) Class170 local102 = null;
					if (!arg2) {
						@Pc(106) int local106 = local61;
						if ((Static2.aByteArrayArrayArray1[1][local78][local83] & 0x2) == 2) {
							local106 = local61 - 1;
						}
						if (local106 >= 0) {
							local102 = arg1[local106];
						}
					}
					Static55.method1173(-1, local20, local102, local83, true, local78, local69, local61, arg4, local73, arg2, local61);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ml;)V")
	public static void method4837(@OriginalArg(1) Class134 arg0) {
		Static305.anInt6786 = 3;
		Static179.method3473(true);
		Static292.anInt5680 = 127;
		Static241.aBoolean366 = true;
		Static106.aBoolean193 = true;
		Static333.anInt6382 = 0;
		Static158.aBoolean271 = true;
		Static347.anInt6585 = 0;
		Static181.aBoolean302 = true;
		Static237.aBoolean480 = true;
		Static43.anInt1147 = 0;
		Static8.anInt192 = 127;
		aBoolean418 = true;
		Static51.aBoolean102 = true;
		Static184.anInt3878 = 0;
		Static9.anInt216 = 2;
		Static166.aBoolean285 = true;
		Static43.anInt1146 = 1;
		Static26.anInt577 = 255;
		Static144.aBoolean265 = true;
		Static292.aBoolean421 = true;
		if (Static286.anInt6700 < 96) {
			Static99.method2239(0);
		} else {
			Static99.method2239(2);
		}
		Static335.aBoolean468 = true;
		Static159.anInt3440 = 0;
		Static309.anInt6000 = 2;
		Static233.anInt4697 = 2;
		Static165.aBoolean280 = false;
		Static348.anInt6588 = Static340.anInt6520 == 1 ? 2 : 4;
		Static306.aBoolean438 = false;
		Static209.aBoolean333 = true;
		Static24.aBoolean37 = false;
		Static90.anInt2474 = 0;
		@Pc(90) Class84 local90 = null;
		try {
			@Pc(94) Class185 local94 = arg0.method3749();
			while (local94.anInt5682 == 0) {
				Static249.method4396(1L);
			}
			if (local94.anInt5682 == 1) {
				local90 = (Class84) local94.anObject4;
				@Pc(116) byte[] local116 = new byte[(int) local90.method2416()];
				@Pc(130) int local130;
				for (@Pc(118) int local118 = 0; local118 < local116.length; local118 += local130) {
					local130 = local90.method2418(local116, local118, local116.length - local118);
					if (local130 == -1) {
						throw new IOException("EOF");
					}
				}
				Static276.method4742(new Class4_Sub11(local116));
			}
		} catch (@Pc(158) Exception local158) {
		}
		try {
			if (local90 != null) {
				local90.method2413();
			}
		} catch (@Pc(165) Exception local165) {
		}
	}
}
