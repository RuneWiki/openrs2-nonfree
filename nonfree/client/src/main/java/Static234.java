import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!om", name = "h", descriptor = "[I")
	public static int[] anIntArray427;

	@OriginalMember(owner = "client!om", name = "m", descriptor = "F")
	public static float aFloat57;

	@OriginalMember(owner = "client!om", name = "b", descriptor = "[I")
	public static final int[] anIntArray426 = new int[14];

	@OriginalMember(owner = "client!om", name = "f", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/awt/Component;IBLclient!ne;)Lclient!dh;")
	public static Class47 method4159(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class139 arg3) {
		if (Static226.anInt4449 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class47 local33 = (Class47) Class.forName("Class47_Sub1").getDeclaredConstructor().newInstance();
			local33.anIntArray576 = new int[(Static188.aBoolean287 ? 2 : 1) * 256];
			local33.anInt5934 = arg0;
			local33.method5330(arg1);
			local33.anInt5933 = (arg0 & 0xFFFFFC00) + 1024;
			if (local33.anInt5933 > 16384) {
				local33.anInt5933 = 16384;
			}
			local33.method5332(local33.anInt5933);
			if (Static355.anInt6823 > 0 && Static314.aClass34_1 == null) {
				Static314.aClass34_1 = new Class34();
				Static314.aClass34_1.aClass139_2 = arg3;
				arg3.method3855(Static314.aClass34_1, Static355.anInt6823);
			}
			if (Static314.aClass34_1 != null) {
				if (Static314.aClass34_1.aClass47Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static314.aClass34_1.aClass47Array1[arg2] = local33;
			}
			return local33;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class47_Sub2 local112 = new Class47_Sub2(arg3, arg2);
				local112.anIntArray576 = new int[(Static188.aBoolean287 ? 2 : 1) * 256];
				local112.anInt5934 = arg0;
				local112.method5330(arg1);
				local112.anInt5933 = 16384;
				local112.method5332(local112.anInt5933);
				if (Static355.anInt6823 > 0 && Static314.aClass34_1 == null) {
					Static314.aClass34_1 = new Class34();
					Static314.aClass34_1.aClass139_2 = arg3;
					arg3.method3855(Static314.aClass34_1, Static355.anInt6823);
				}
				if (Static314.aClass34_1 != null) {
					if (Static314.aClass34_1.aClass47Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static314.aClass34_1.aClass47Array1[arg2] = local112;
				}
				return local112;
			} catch (@Pc(176) Throwable local176) {
				return new Class47();
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Lclient!td;")
	public static Class5_Sub1_Sub18 method4160(@OriginalArg(0) int arg0) {
		@Pc(17) Class5_Sub1_Sub18 local17 = (Class5_Sub1_Sub18) Static136.aClass122_6.method3177((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(36) byte[] local36;
		if (arg0 >= 32768) {
			local36 = Static118.aClass93_47.method2410(arg0 & 0x7FFF, 1);
		} else {
			local36 = Static339.aClass93_124.method2410(arg0, 1);
		}
		local17 = new Class5_Sub1_Sub18();
		if (local36 != null) {
			local17.method5352(new Class5_Sub12(local36));
		}
		if (arg0 >= 32768) {
			local17.method5353();
		}
		Static136.aClass122_6.method3181((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BIILclient!ea;ILclient!gf;I)V")
	public static void method4161(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class55 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Interface3 arg4, @OriginalArg(6) int arg5) {
		if (Static149.anInt2919 < 100) {
			Static236.method3921(arg4, arg2);
		}
		arg2.method5258(arg3, arg1, arg3 + arg0, arg1 - -arg5);
		@Pc(33) int local33;
		@Pc(43) int local43;
		if (Static149.anInt2919 < 100) {
			local33 = arg0 / 2 + arg3;
			local43 = arg1 + arg5 / 2 - 18 - 20;
			arg2.method5205(arg3, arg1, arg0, arg5, -16777216, 0);
			arg2.method5204(local33 - 152, local43, 304, 34, Static52.aColorArray2[Static23.anInt484].getRGB(), 0);
			arg2.method5205(local33 - 150, local43 + 2, Static149.anInt2919 * 3, 30, Static51.aColorArray1[Static23.anInt484].getRGB(), 0);
			Static77.aClass18_1.method4172(-1, Static113.aClass85_52.method2020(Static41.anInt726), Static145.aColorArray3[Static23.anInt484].getRGB(), local33, local43 + 20);
			return;
		}
		@Pc(107) int local107 = Static32.anInt633 - (int) ((float) arg0 / Static290.aFloat20);
		local33 = (int) ((float) arg5 / Static290.aFloat20) + Static314.anInt6098;
		local43 = Static32.anInt633 + (int) ((float) arg0 / Static290.aFloat20);
		Static62.anInt1095 = Static314.anInt6098 - (int) ((float) arg5 / Static290.aFloat20);
		Static329.anInt6377 = (int) ((float) (arg0 * 2) / Static290.aFloat20);
		Static69.anInt1364 = Static32.anInt633 - (int) ((float) arg0 / Static290.aFloat20);
		Static217.anInt4330 = (int) ((float) (arg5 * 2) / Static290.aFloat20);
		@Pc(178) int local178 = Static314.anInt6098 - (int) ((float) arg5 / Static290.aFloat20);
		Static290.method2560(local107 + Static290.anInt2776, local33 + Static290.anInt2772, local43 + Static290.anInt2776, local178 + Static290.anInt2772, arg3, arg1, arg0 + arg3, arg1 - -arg5 + 1);
		Static290.method2550(arg2);
		@Pc(208) Class103 local208 = Static290.method2554(arg2);
		Static284.method4944(local208, arg2);
		if (Static191.anInt3783 > 0) {
			Static229.anInt4619--;
			if (Static229.anInt4619 == 0) {
				Static191.anInt3783--;
				Static229.anInt4619 = 20;
			}
		}
		if (!Static320.aBoolean515) {
			return;
		}
		@Pc(239) int local239 = arg3 + arg0 - 5;
		@Pc(245) int local245 = arg1 + arg5 - 8;
		Static204.aClass18_3.method4184(local245, "Fps:" + Static205.anInt4080, local239, 16776960);
		@Pc(260) int local260 = local245 - 15;
		@Pc(262) Runtime local262 = Runtime.getRuntime();
		@Pc(272) int local272 = (int) ((local262.totalMemory() - local262.freeMemory()) / 1024L);
		@Pc(274) int local274 = 16776960;
		if (local272 > 65536) {
			local274 = 16711680;
		}
		Static204.aClass18_3.method4184(local260, "Mem:" + local272 + "k", local239, local274);
		local245 = local260 - 15;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZLclient!jq;B)V")
	public static void method4162(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub5_Sub2 arg1) {
		@Pc(7) Class88 local7 = arg1.method4805();
		if (arg1.anInt5413 == 0) {
			Static178.anInt3535 = -1;
			arg1.anInt5417 = 0;
			Static261.anInt5123 = 0;
			return;
		}
		if (arg1.anInt5383 != -1 && arg1.anInt5382 == 0) {
			@Pc(34) Class89 local34 = Static162.method2849(arg1.anInt5383);
			if (arg1.anInt5419 > 0 && local34.anInt2454 == 0) {
				Static178.anInt3535 = -1;
				Static261.anInt5123 = 0;
				arg1.anInt5417++;
				return;
			}
			if (arg1.anInt5419 <= 0 && local34.anInt2456 == 0) {
				Static178.anInt3535 = -1;
				arg1.anInt5417++;
				Static261.anInt5123 = 0;
				return;
			}
		}
		if (arg1.anInt5398 != -1 && Static283.anInt5563 >= arg1.anInt5395) {
			@Pc(88) Class163 local88 = Static325.method5628(arg1.anInt5398);
			if (local88.aBoolean418 && local88.anInt5031 != -1) {
				@Pc(100) Class89 local100 = Static162.method2849(local88.anInt5031);
				if (arg1.anInt5419 > 0 && local100.anInt2454 == 0) {
					Static261.anInt5123 = 0;
					arg1.anInt5417++;
					Static178.anInt3535 = -1;
					return;
				}
				if (arg1.anInt5419 <= 0 && local100.anInt2456 == 0) {
					arg1.anInt5417++;
					Static261.anInt5123 = 0;
					Static178.anInt3535 = -1;
					return;
				}
			}
		}
		@Pc(143) int local143 = arg1.anInt6631;
		@Pc(146) int local146 = arg1.anInt6632;
		@Pc(162) int local162 = arg1.anIntArray523[arg1.anInt5413 - 1] * 128 + arg1.method4807() * 64;
		@Pc(179) int local179 = arg1.anIntArray522[arg1.anInt5413 - 1] * 128 + arg1.method4807() * 64;
		if (!arg0 && (local162 - local143 > 256 || local162 - local143 < -256 || local179 - local146 > 256 || local179 - local146 < -256)) {
			Static261.anInt5123 = 0;
			Static178.anInt3535 = -1;
			arg1.anInt6631 = local162;
			arg1.anInt6632 = local179;
			return;
		}
		if (local162 <= local143) {
			if (local162 >= local143) {
				if (local146 < local179) {
					arg1.method4811(8192);
				} else if (local179 < local146) {
					arg1.method4811(0);
				}
			} else if (local146 < local179) {
				arg1.method4811(6144);
			} else if (local179 < local146) {
				arg1.method4811(2048);
			} else {
				arg1.method4811(4096);
			}
		} else if (local179 > local146) {
			arg1.method4811(10240);
		} else if (local146 > local179) {
			arg1.method4811(14336);
		} else {
			arg1.method4811(12288);
		}
		@Pc(293) int local293 = 4;
		@Pc(295) boolean local295 = true;
		if (arg1 instanceof Class4_Sub5_Sub2_Sub2) {
			local295 = ((Class4_Sub5_Sub2_Sub2) arg1).aClass106_1.aBoolean243;
		}
		if (local295) {
			@Pc(332) int local332 = arg1.anInt5349 - arg1.aClass207_7.anInt6598;
			if (local332 != 0 && arg1.anInt5362 == -1 && arg1.anInt5392 != 0) {
				local293 = 2;
			}
			if (!arg0 && arg1.anInt5413 > 2) {
				local293 = 6;
			}
			if (!arg0 && arg1.anInt5413 > 3) {
				local293 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt5413 > 1) {
				local293 = 6;
			}
			if (!arg0 && arg1.anInt5413 > 2) {
				local293 = 8;
			}
		}
		if (arg1.anInt5417 > 0 && arg1.anInt5413 > 1) {
			local293 = 8;
			arg1.anInt5417--;
		}
		@Pc(391) byte local391 = arg1.aByteArray74[arg1.anInt5413 - 1];
		if (local391 == 2) {
			local293 <<= 0x1;
		} else if (local391 == 0) {
			local293 >>= 0x1;
		}
		if (local7.anInt2303 != -1) {
			local293 <<= 0x7;
			if (arg1.anInt5413 == 1) {
				@Pc(465) int local465 = arg1.anInt5416 * arg1.anInt5416;
				@Pc(482) int local482 = (local162 < arg1.anInt6631 ? arg1.anInt6631 - local162 : local162 - arg1.anInt6631) << 7;
				@Pc(504) int local504 = (arg1.anInt6632 <= local179 ? local179 - arg1.anInt6632 : -local179 + arg1.anInt6632) << 7;
				@Pc(515) int local515 = local504 >= local482 ? local504 : local482;
				@Pc(522) int local522 = local7.anInt2303 * 2 * local515;
				if (local465 > local522) {
					arg1.anInt5416 /= 2;
				} else if (local515 < local465 / 2) {
					arg1.anInt5416 -= local7.anInt2303;
					if (arg1.anInt5416 < 0) {
						arg1.anInt5416 = 0;
					}
				} else if (local293 > arg1.anInt5416) {
					arg1.anInt5416 += local7.anInt2303;
					if (arg1.anInt5416 > local293) {
						arg1.anInt5416 = local293;
					}
				}
			} else if (arg1.anInt5416 < local293) {
				arg1.anInt5416 += local7.anInt2303;
				if (local293 < arg1.anInt5416) {
					arg1.anInt5416 = local293;
				}
			} else if (arg1.anInt5416 > 0) {
				arg1.anInt5416 -= local7.anInt2303;
				if (arg1.anInt5416 < 0) {
					arg1.anInt5416 = 0;
				}
			}
			local293 = arg1.anInt5416 >> 7;
			if (local293 < 1) {
				local293 = 1;
			}
		}
		Static261.anInt5123 = 0;
		if (local162 > local143) {
			Static261.anInt5123 |= 0x4;
			arg1.anInt6631 += local293;
			if (arg1.anInt6631 > local162) {
				arg1.anInt6631 = local162;
			}
		} else if (local143 > local162) {
			Static261.anInt5123 |= 0x8;
			arg1.anInt6631 -= local293;
			if (local162 > arg1.anInt6631) {
				arg1.anInt6631 = local162;
			}
		}
		if (local146 < local179) {
			Static261.anInt5123 |= 0x1;
			arg1.anInt6632 += local293;
			if (local179 < arg1.anInt6632) {
				arg1.anInt6632 = local179;
			}
		} else if (local146 > local179) {
			arg1.anInt6632 -= local293;
			Static261.anInt5123 |= 0x2;
			if (local179 > arg1.anInt6632) {
				arg1.anInt6632 = local179;
			}
		}
		if (arg1.anInt6631 == local162 && arg1.anInt6632 == local179) {
			if (arg1.anInt5419 > 0) {
				arg1.anInt5419--;
			}
			arg1.anInt5413--;
		}
		if (local293 >= 8) {
			Static178.anInt3535 = 2;
		} else {
			Static178.anInt3535 = local391;
		}
	}
}
