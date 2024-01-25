import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "[I")
	public static final int[] anIntArray686 = new int[8];

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "[Lclient!og;")
	public static final Class242[] aClass242Array1 = new Class242[100];

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIILclient!ha;Lclient!db;IIIBIII)V")
	public static void method8912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class2_Sub6_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg9 < arg10 && arg10 < arg9 + arg5 && arg6 > arg2 - 13 && arg6 < arg2 + 3 && arg4.aBoolean219) {
			arg7 = arg1;
		}
		@Pc(52) int[] local52 = null;
		if (Static396.method6492(arg4.anInt2631)) {
			local52 = Static635.aClass336_2.method8424((int) arg4.aLong61).anIntArray602;
		} else if (arg4.anInt2626 != -1) {
			local52 = Static635.aClass336_2.method8424(arg4.anInt2626).anIntArray602;
		} else if (Static299.method5338(arg4.anInt2631)) {
			@Pc(122) Class2_Sub33 local122 = (Class2_Sub33) Static600.aClass99_79.method3056((long) arg4.aLong61);
			if (local122 != null) {
				@Pc(127) Class3_Sub1_Sub3_Sub3_Sub1 local127 = local122.aClass3_Sub1_Sub3_Sub3_Sub1_2;
				@Pc(130) Class27 local130 = local127.aClass27_1;
				if (local130.anIntArray43 != null) {
					local130 = local130.method727(Static286.aClass263_3);
				}
				if (local130 != null) {
					local52 = local130.anIntArray42;
				}
			}
		} else if (Static613.method8966(arg4.anInt2631)) {
			@Pc(91) Class161 local91;
			if (arg4.anInt2631 == 1001) {
				local91 = Static27.aClass342_3.method8534((int) arg4.aLong61);
			} else {
				local91 = Static27.aClass342_3.method8534((int) (arg4.aLong61 >>> 32 & 0x7FFFFFFFL));
			}
			if (local91.anIntArray288 != null) {
				local91 = local91.method4606(Static286.aClass263_3);
			}
			if (local91 != null) {
				local52 = local91.anIntArray286;
			}
		}
		@Pc(164) String local164 = Static74.method2135(arg4);
		if (local52 != null) {
			local164 = local164 + Static421.method6792(local52);
		}
		Static571.aClass68_12.method8098(arg2, local164, arg7, arg9 + 3, Static117.aClass46Array5, Static437.anIntArray536);
		if (arg4.aBoolean218) {
			Static90.aClass46_10.method6213(Static161.aClass239_14.method6482(local164) + arg9 + 5, arg2 + -12);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static67.method2076(arg1)) {
			return true;
		} else {
			return !Static67.method2076(arg0);
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([BBLjava/lang/String;I)I")
	public static int method8915(@OriginalArg(0) byte[] arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12 += 4) {
			@Pc(27) int local27 = Static310.method5470(arg1.charAt(local12));
			@Pc(42) int local42 = local10 > local12 + 1 ? Static310.method5470(arg1.charAt(local12 + 1)) : -1;
			@Pc(57) int local57 = local12 + 2 < local10 ? Static310.method5470(arg1.charAt(local12 + 2)) : -1;
			@Pc(76) int local76 = local12 + 3 >= local10 ? -1 : Static310.method5470(arg1.charAt(local12 + 3));
			arg0[arg2++] = (byte) (local27 << 2 | local42 >>> 4);
			if (local57 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local42 & 0xF) << 4 | local57 >>> 2);
			if (local76 == -1) {
				break;
			}
			arg0[arg2++] = (byte) ((local57 & 0x3) << 6 | local76);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!ea;Lclient!ha;BI)V")
	public static void method8916(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) int arg2) {
		@Pc(22) int local22;
		if (Static287.anIntArray359 != null && arg2 <= arg0.aByte38) {
			for (local22 = 0; local22 < Static287.anIntArray359.length; local22++) {
				if (Static287.anIntArray359[local22] != -1000000 && (arg0.anIntArray151[0] <= Static287.anIntArray359[local22] || arg0.anIntArray151[1] <= Static287.anIntArray359[local22] || arg0.anIntArray151[2] <= Static287.anIntArray359[local22] || Static287.anIntArray359[local22] >= arg0.anIntArray151[3]) && (arg0.anIntArray150[0] <= Static528.anIntArray630[local22] || arg0.anIntArray150[1] <= Static528.anIntArray630[local22] || arg0.anIntArray150[2] <= Static528.anIntArray630[local22] || Static528.anIntArray630[local22] >= arg0.anIntArray150[3]) && (arg0.anIntArray150[0] >= Static548.anIntArray642[local22] || Static548.anIntArray642[local22] <= arg0.anIntArray150[1] || arg0.anIntArray150[2] >= Static548.anIntArray642[local22] || Static548.anIntArray642[local22] <= arg0.anIntArray150[3]) && (Static307.anIntArray373[local22] >= arg0.anIntArray149[0] || arg0.anIntArray149[1] <= Static307.anIntArray373[local22] || arg0.anIntArray149[2] <= Static307.anIntArray373[local22] || Static307.anIntArray373[local22] >= arg0.anIntArray149[3]) && (arg0.anIntArray149[0] >= Static76.anIntArray107[local22] || arg0.anIntArray149[1] >= Static76.anIntArray107[local22] || arg0.anIntArray149[2] >= Static76.anIntArray107[local22] || arg0.anIntArray149[3] >= Static76.anIntArray107[local22])) {
					return;
				}
			}
		}
		@Pc(233) int local233;
		@Pc(261) int local261;
		@Pc(282) boolean local282;
		@Pc(313) float local313;
		if (arg0.aByte39 == 1) {
			local22 = Static177.anInt4273 + arg0.aShort21 - Static120.anInt3199;
			if (local22 >= 0 && local22 <= Static177.anInt4273 + Static177.anInt4273) {
				local233 = Static177.anInt4273 + arg0.aShort23 - Static360.anInt7144;
				if (local233 < 0) {
					local233 = 0;
				} else if (local233 > Static177.anInt4273 + Static177.anInt4273) {
					return;
				}
				local261 = arg0.aShort22 + Static177.anInt4273 - Static360.anInt7144;
				if (Static177.anInt4273 + Static177.anInt4273 < local261) {
					local261 = Static177.anInt4273 + Static177.anInt4273;
				} else if (local261 < 0) {
					return;
				}
				local282 = false;
				while (local233 <= local261) {
					if (Static342.aBooleanArrayArray6[local22][local233++]) {
						local282 = true;
						break;
					}
				}
				if (local282) {
					local313 = Static393.anInt7549 - arg0.anIntArray150[0];
					if (local313 < 0.0F) {
						local313 *= -1.0F;
					}
					if (!local313 < (float) Static201.anInt4635 && (Static132.method3030(0, arg0) && (Static132.method3030(1, arg0) && (Static132.method3030(2, arg0) && Static132.method3030(3, arg0))))) {
						Static266.aClass82Array1[Static534.anInt9664++] = arg0;
					}
				}
			}
		} else if (arg0.aByte39 == 2) {
			local22 = Static177.anInt4273 + arg0.aShort23 - Static360.anInt7144;
			if (local22 >= 0 && local22 <= Static177.anInt4273 + Static177.anInt4273) {
				local233 = arg0.aShort21 + Static177.anInt4273 - Static120.anInt3199;
				if (local233 < 0) {
					local233 = 0;
				} else if (local233 > Static177.anInt4273 + Static177.anInt4273) {
					return;
				}
				local261 = arg0.aShort20 + Static177.anInt4273 - Static120.anInt3199;
				if (Static177.anInt4273 + Static177.anInt4273 < local261) {
					local261 = Static177.anInt4273 + Static177.anInt4273;
				} else if (local261 < 0) {
					return;
				}
				local282 = false;
				while (local261 >= local233) {
					if (Static342.aBooleanArrayArray6[local233++][local22]) {
						local282 = true;
						break;
					}
				}
				if (local282) {
					local313 = Static574.anInt10281 - arg0.anIntArray149[0];
					if (local313 < 0.0F) {
						local313 *= -1.0F;
					}
					if (!(local313 < (float) Static201.anInt4635) && (Static132.method3030(0, arg0) && (Static132.method3030(1, arg0) && (Static132.method3030(2, arg0) && Static132.method3030(3, arg0))))) {
						Static266.aClass82Array1[Static534.anInt9664++] = arg0;
					}
				}
			}
		} else if (arg0.aByte39 == 16 || arg0.aByte39 == 8) {
			local22 = Static177.anInt4273 + arg0.aShort21 - Static120.anInt3199;
			if (local22 >= 0 && local22 <= Static177.anInt4273 + Static177.anInt4273) {
				local233 = arg0.aShort23 + Static177.anInt4273 - Static360.anInt7144;
				if (local233 >= 0 && local233 <= Static177.anInt4273 + Static177.anInt4273 && Static342.aBooleanArrayArray6[local22][local233]) {
					@Pc(569) float local569 = (float) (Static393.anInt7549 - arg0.anIntArray150[0]);
					if (local569 < 0.0F) {
						local569 *= -1.0F;
					}
					@Pc(586) float local586 = (float) (Static574.anInt10281 - arg0.anIntArray149[0]);
					if (local586 < 0.0F) {
						local586 *= -1.0F;
					}
					if ((!(local569 < (float) Static201.anInt4635) || !((float) Static201.anInt4635 > local586)) && (Static132.method3030(0, arg0) && (Static132.method3030(1, arg0) && (Static132.method3030(2, arg0) && Static132.method3030(3, arg0))))) {
						Static266.aClass82Array1[Static534.anInt9664++] = arg0;
					}
				}
			}
		} else if (arg0.aByte39 == 4) {
			@Pc(653) float local653 = (float) (arg0.anIntArray151[0] - Static521.anInt9499);
			if (!(local653 <= (float) Static467.anInt8761)) {
				local233 = Static177.anInt4273 + arg0.aShort23 - Static360.anInt7144;
				if (local233 < 0) {
					local233 = 0;
				} else if (Static177.anInt4273 + Static177.anInt4273 < local233) {
					return;
				}
				local261 = Static177.anInt4273 + arg0.aShort22 - Static360.anInt7144;
				if (Static177.anInt4273 + Static177.anInt4273 < local261) {
					local261 = Static177.anInt4273 + Static177.anInt4273;
				} else if (local261 < 0) {
					return;
				}
				@Pc(716) int local716 = arg0.aShort21 + Static177.anInt4273 - Static120.anInt3199;
				if (local716 < 0) {
					local716 = 0;
				} else if (local716 > Static177.anInt4273 + Static177.anInt4273) {
					return;
				}
				@Pc(738) int local738 = Static177.anInt4273 + arg0.aShort20 - Static120.anInt3199;
				if (Static177.anInt4273 + Static177.anInt4273 < local738) {
					local738 = Static177.anInt4273 + Static177.anInt4273;
				} else if (local738 < 0) {
					return;
				}
				@Pc(758) boolean local758 = false;
				label283: for (@Pc(760) int local760 = local716; local760 <= local738; local760++) {
					for (@Pc(764) int local764 = local233; local764 <= local261; local764++) {
						if (Static342.aBooleanArrayArray6[local760][local764]) {
							local758 = true;
							break label283;
						}
					}
				}
				if (local758 && (Static132.method3030(0, arg0) && (Static132.method3030(1, arg0) && (Static132.method3030(2, arg0) && Static132.method3030(3, arg0))))) {
					Static266.aClass82Array1[Static534.anInt9664++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIBI)Z")
	public static boolean method8917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (!Static62.aBoolean167 || !Static219.aBoolean366) {
			return false;
		} else if (Static513.anInt9411 < 100) {
			return false;
		} else {
			@Pc(40) int local40;
			@Pc(44) int local44;
			if (arg5 != arg4 || arg2 != arg1) {
				for (local40 = arg4; local40 <= arg5; local40++) {
					for (local44 = arg2; local44 <= arg1; local44++) {
						if (Static132.anIntArrayArrayArray10[arg0][local40][local44] == -Static523.anInt9521) {
							return false;
						}
					}
				}
				local44 = (arg4 << Static151.anInt3896) + 1;
				@Pc(127) int local127 = (arg2 << Static151.anInt3896) + 2;
				if (Static369.method6238(arg3, (arg5 + 1 - arg4) * Static582.anInt10356, local127, local44, Static9.aClass65Array1[arg0].method7995(arg2, arg4), Static582.anInt10356 * (arg1 + 1 - arg2))) {
					Static216.anInt4874++;
					return true;
				} else {
					return false;
				}
			} else if (Static331.method5702(arg0, arg4, arg2)) {
				local40 = arg4 << Static151.anInt3896;
				local44 = arg2 << Static151.anInt3896;
				if (Static369.method6238(arg3, Static582.anInt10356, local44, local40, Static9.aClass65Array1[arg0].method7995(arg2, arg4), Static582.anInt10356)) {
					Static216.anInt4874++;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}
}
