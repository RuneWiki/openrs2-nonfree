import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!da", name = "K", descriptor = "I")
	public static int anInt1270;

	@OriginalMember(owner = "client!da", name = "N", descriptor = "[I")
	public static int[] anIntArray75;

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Lclient!pl;")
	public static final Class165 aClass165_1 = new Class165();

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "[I")
	public static final int[] anIntArray76 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(B)V")
	public static void method1215() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static189.aBooleanArray24[local7] = false;
		}
		Static244.anInt4751 = Static249.anInt4824;
		Static18.anInt378 = 0;
		Static31.anInt728 = Static124.anInt2717;
		Static17.anInt351 = 0;
		Static290.anInt5596 = -1;
		Static205.anInt4115 = 5;
		Static289.anInt5590 = Static153.anInt3257;
		Static281.anInt5363 = Static141.anInt2986;
		Static334.anInt6460 = -1;
		Static269.anInt5120 = Static112.anInt2486;
		Static99.anInt2253 = Static103.anInt2301;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!jd;IZ)V")
	public static void method1216(@OriginalArg(0) Class10_Sub3_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class128 local9 = arg0.method5364();
		if (arg0.anInt5986 == 0) {
			arg0.anInt5983 = 0;
			Static141.anInt2989 = -1;
			Static130.anInt2814 = 0;
			return;
		}
		if (arg0.anInt5961 != -1 && arg0.anInt5963 == 0) {
			@Pc(36) Class79 local36 = Static233.method4080(arg0.anInt5961);
			if (arg0.anInt5988 > 0 && local36.anInt2363 == 0) {
				Static130.anInt2814 = 0;
				arg0.anInt5983++;
				Static141.anInt2989 = -1;
				return;
			}
			if (arg0.anInt5988 <= 0 && local36.anInt2360 == 0) {
				Static130.anInt2814 = 0;
				Static141.anInt2989 = -1;
				arg0.anInt5983++;
				return;
			}
		}
		if (arg0.anInt5957 != -1 && arg0.anInt5969 <= Static153.anInt3257) {
			@Pc(92) Class78 local92 = Static76.method1908(arg0.anInt5957);
			if (local92.aBoolean161 && local92.anInt2302 != -1) {
				@Pc(104) Class79 local104 = Static233.method4080(local92.anInt2302);
				if (arg0.anInt5988 > 0 && local104.anInt2363 == 0) {
					Static130.anInt2814 = 0;
					Static141.anInt2989 = -1;
					arg0.anInt5983++;
					return;
				}
				if (arg0.anInt5988 <= 0 && local104.anInt2360 == 0) {
					Static130.anInt2814 = 0;
					arg0.anInt5983++;
					Static141.anInt2989 = -1;
					return;
				}
			}
		}
		@Pc(150) int local150 = arg0.anInt5910;
		@Pc(153) int local153 = arg0.anInt5908;
		@Pc(169) int local169 = arg0.anIntArray535[arg0.anInt5986 - 1] * 128 + arg0.method5353() * 64;
		@Pc(190) int local190 = arg0.anIntArray536[arg0.anInt5986 - 1] * 128 + arg0.method5353() * 64;
		if (!arg1 && (local169 - local150 > 256 || local169 - local150 < -256 || local190 - local153 > 256 || local190 - local153 < -256)) {
			Static130.anInt2814 = 0;
			arg0.anInt5908 = local190;
			arg0.anInt5910 = local169;
			Static141.anInt2989 = -1;
			return;
		}
		if (local150 >= local169) {
			if (local150 <= local169) {
				if (local153 < local190) {
					arg0.method5354(8192);
				} else if (local153 > local190) {
					arg0.method5354(0);
				}
			} else if (local190 > local153) {
				arg0.method5354(6144);
			} else if (local190 >= local153) {
				arg0.method5354(4096);
			} else {
				arg0.method5354(2048);
			}
		} else if (local153 < local190) {
			arg0.method5354(10240);
		} else if (local190 < local153) {
			arg0.method5354(14336);
		} else {
			arg0.method5354(12288);
		}
		@Pc(318) int local318 = 4;
		@Pc(320) boolean local320 = true;
		if (arg0 instanceof Class10_Sub3_Sub3_Sub1) {
			local320 = ((Class10_Sub3_Sub3_Sub1) arg0).aClass192_1.aBoolean404;
		}
		if (local320) {
			@Pc(360) int local360 = arg0.anInt5920 - arg0.aClass133_7.anInt3899;
			if (local360 != 0 && arg0.anInt5921 == -1 && arg0.anInt5922 != 0) {
				local318 = 2;
			}
			if (!arg1 && arg0.anInt5986 > 2) {
				local318 = 6;
			}
			if (!arg1 && arg0.anInt5986 > 3) {
				local318 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt5986 > 1) {
				local318 = 6;
			}
			if (!arg1 && arg0.anInt5986 > 2) {
				local318 = 8;
			}
		}
		if (arg0.anInt5983 > 0 && arg0.anInt5986 > 1) {
			local318 = 8;
			arg0.anInt5983--;
		}
		@Pc(421) byte local421 = arg0.aByteArray188[arg0.anInt5986 - 1];
		if (local421 == 2) {
			local318 <<= 0x1;
		} else if (local421 == 0) {
			local318 >>= 0x1;
		}
		if (local9.anInt3739 != -1) {
			local318 <<= 0x7;
			if (arg0.anInt5986 == 1) {
				@Pc(502) int local502 = arg0.anInt5991 * arg0.anInt5991;
				@Pc(520) int local520 = (arg0.anInt5910 <= local169 ? local169 - arg0.anInt5910 : -local169 + arg0.anInt5910) << 7;
				@Pc(537) int local537 = (local190 >= arg0.anInt5908 ? local190 - arg0.anInt5908 : -local190 + arg0.anInt5908) << 7;
				@Pc(548) int local548 = local520 > local537 ? local520 : local537;
				@Pc(555) int local555 = local9.anInt3739 * 2 * local548;
				if (local555 < local502) {
					arg0.anInt5991 /= 2;
				} else if (local502 / 2 > local548) {
					arg0.anInt5991 -= local9.anInt3739;
					if (arg0.anInt5991 < 0) {
						arg0.anInt5991 = 0;
					}
				} else if (local318 > arg0.anInt5991) {
					arg0.anInt5991 += local9.anInt3739;
					if (local318 < arg0.anInt5991) {
						arg0.anInt5991 = local318;
					}
				}
			} else if (local318 > arg0.anInt5991) {
				arg0.anInt5991 += local9.anInt3739;
				if (arg0.anInt5991 > local318) {
					arg0.anInt5991 = local318;
				}
			} else if (arg0.anInt5991 > 0) {
				arg0.anInt5991 -= local9.anInt3739;
				if (arg0.anInt5991 < 0) {
					arg0.anInt5991 = 0;
				}
			}
			local318 = arg0.anInt5991 >> 7;
			if (local318 < 1) {
				local318 = 1;
			}
		}
		Static130.anInt2814 = 0;
		if (local169 > local150) {
			arg0.anInt5910 += local318;
			Static130.anInt2814 |= 0x4;
			if (arg0.anInt5910 > local169) {
				arg0.anInt5910 = local169;
			}
		} else if (local169 < local150) {
			arg0.anInt5910 -= local318;
			Static130.anInt2814 |= 0x8;
			if (local169 > arg0.anInt5910) {
				arg0.anInt5910 = local169;
			}
		}
		if (local190 > local153) {
			arg0.anInt5908 += local318;
			Static130.anInt2814 |= 0x1;
			if (local190 < arg0.anInt5908) {
				arg0.anInt5908 = local190;
			}
		} else if (local153 > local190) {
			arg0.anInt5908 -= local318;
			Static130.anInt2814 |= 0x2;
			if (local190 > arg0.anInt5908) {
				arg0.anInt5908 = local190;
			}
		}
		if (local318 < 8) {
			Static141.anInt2989 = local421;
		} else {
			Static141.anInt2989 = 2;
		}
		if (local169 != arg0.anInt5910 || local190 != arg0.anInt5908) {
			return;
		}
		arg0.anInt5986--;
		if (arg0.anInt5988 > 0) {
			arg0.anInt5988--;
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ne;IIILjava/lang/String;IIZLclient!q;Lclient!gh;ILclient!mp;)V")
	public static void method1217(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class156 arg7, @OriginalArg(9) Class76 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class30 arg10) {
		@Pc(13) int local13;
		if (Static205.anInt4115 == 4) {
			local13 = (int) Static94.aFloat42 & 0x3FFF;
		} else {
			local13 = (int) Static94.aFloat42 + Static8.anInt205 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg0.anInt4133 / 2, arg0.anInt4199 / 2) + 10;
		@Pc(41) int local41 = arg2 * arg2 + arg3 * arg3;
		if (local32 * local32 < local41) {
			return;
		}
		@Pc(55) int local55 = Class14_Sub3_Sub34.anIntArray547[local13];
		@Pc(59) int local59 = Class14_Sub3_Sub34.anIntArray546[local13];
		if (Static205.anInt4115 != 4) {
			local59 = local59 * 256 / (Static309.anInt5886 + 256);
			local55 = local55 * 256 / (Static309.anInt5886 + 256);
		}
		@Pc(95) int local95 = arg2 * local59 + arg3 * local55 >> 15;
		@Pc(106) int local106 = arg3 * local59 - local55 * arg2 >> 15;
		@Pc(113) int local113 = arg8.method2249(null, 100, arg4);
		@Pc(119) int local119 = local95 - local113 / 2;
		@Pc(127) int local127 = arg8.method2247(null, arg4);
		if (-arg0.anInt4133 <= local119 && arg0.anInt4133 >= local119 && local106 >= -arg0.anInt4199 && arg0.anInt4199 >= local106) {
			arg10.method5577(arg0.anInt4199 / 2 + arg6 - local127 - arg5 - local106, null, 1, null, arg7, 50, 0, local113, arg9, 0, arg1, arg4, arg0.anInt4133 / 2 + local119 + arg1, arg6, 0);
		}
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(B)V")
	public static void method1218() {
		Static157.aClass11_72.method213();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZIIII)Lclient!ma;")
	public static Class67 method1220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg0 * 986053L ^ (long) arg4 * 475427L ^ (long) arg2 * 67481L ^ (long) arg3 * 97549L ^ (long) arg1 * 32147369L ^ (long) arg5 * 76724863L;
		@Pc(44) Class67 local44 = (Class67) Static4.aClass11_1.method209(local38);
		if (local44 == null) {
			local44 = Static262.aClass46_7.method5094(arg2, arg3, arg4, arg0, arg1, arg5);
			Static4.aClass11_1.method219(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}
}
