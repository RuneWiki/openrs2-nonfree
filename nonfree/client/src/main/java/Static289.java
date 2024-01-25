import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "[I")
	public static int[] anIntArray486;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!am;")
	public static Class11 aClass11_127;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
	public static int anInt5852 = 0;

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "Z")
	public static boolean aBoolean516 = false;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Lclient!fd;")
	public static Class72 method4934(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class72 local7 = Static66.method1243(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass72Array1 == null || arg0 >= local7.aClass72Array1.length) {
			return null;
		} else {
			return local7.aClass72Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIII)Z")
	public static boolean method4936(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static284.method4849(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(23) int local23 = Static307.aClass26Array3[arg0].method4996(arg1, arg2) - 1;
		@Pc(27) int local27 = local23 - 120;
		@Pc(31) int local31 = local23 - 230;
		@Pc(35) int local35 = local23 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static269.anInt5510) {
					if (!Static75.method1392(local10, local23, local14)) {
						return false;
					}
					if (!Static75.method1392(local10, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static75.method1392(local10, local27, local14)) {
						return false;
					}
					if (!Static75.method1392(local10, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static75.method1392(local10, local31, local14)) {
					return false;
				}
				if (!Static75.method1392(local10, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static241.anInt5032) {
					if (!Static75.method1392(local10, local23, local14 + 128)) {
						return false;
					}
					if (!Static75.method1392(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static75.method1392(local10, local27, local14 + 128)) {
						return false;
					}
					if (!Static75.method1392(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static75.method1392(local10, local31, local14 + 128)) {
					return false;
				}
				if (!Static75.method1392(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static269.anInt5510) {
					if (!Static75.method1392(local10 + 128, local23, local14)) {
						return false;
					}
					if (!Static75.method1392(local10 + 128, local23, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static75.method1392(local10 + 128, local27, local14)) {
						return false;
					}
					if (!Static75.method1392(local10 + 128, local27, local14 + 128)) {
						return false;
					}
				}
				if (!Static75.method1392(local10 + 128, local31, local14)) {
					return false;
				}
				if (!Static75.method1392(local10 + 128, local31, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static241.anInt5032) {
					if (!Static75.method1392(local10, local23, local14)) {
						return false;
					}
					if (!Static75.method1392(local10 + 128, local23, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static75.method1392(local10, local27, local14)) {
						return false;
					}
					if (!Static75.method1392(local10 + 128, local27, local14)) {
						return false;
					}
				}
				if (!Static75.method1392(local10, local31, local14)) {
					return false;
				}
				if (!Static75.method1392(local10 + 128, local31, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static75.method1392(local10 + 64, local35, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static75.method1392(local10, local31, local14 + 128);
		} else if (arg3 == 32) {
			return Static75.method1392(local10 + 128, local31, local14 + 128);
		} else if (arg3 == 64) {
			return Static75.method1392(local10 + 128, local31, local14);
		} else if (arg3 == 128) {
			return Static75.method1392(local10, local31, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBIZII)V")
	public static void method4937(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(31) int local31 = arg0 - 334;
		if (local31 < 0) {
			local31 = 0;
		} else if (local31 > 100) {
			local31 = 100;
		}
		@Pc(53) int local53 = Static222.aShort59 + local31 * (Static167.aShort53 - Static222.aShort59) / 100;
		if (local53 < Static84.aShort36) {
			local53 = Static84.aShort36;
		} else if (local53 > Static14.aShort8) {
			local53 = Static14.aShort8;
		}
		@Pc(83) int local83 = arg0 * 512 * local53 / (arg4 * 334);
		@Pc(117) int local117;
		@Pc(124) int local124;
		@Pc(88) short local88;
		if (Static169.aShort54 > local83) {
			local88 = Static169.aShort54;
			local53 = arg4 * 334 * local88 / (arg0 * 512);
			if (local53 > Static14.aShort8) {
				local53 = Static14.aShort8;
				local117 = arg0 * local53 * 512 / (local88 * 334);
				local124 = (arg4 - local117) / 2;
				if (arg2) {
					Static164.aClass92_7.method4467();
					Static164.aClass92_7.method4502(arg1, local124, arg3, arg0, -16777216);
					Static164.aClass92_7.method4502(arg1, local124, arg3 + arg4 - local124, arg0, -16777216);
				}
				arg3 += local124;
				arg4 -= local124 * 2;
			}
		} else if (Static311.aShort80 < local83) {
			local88 = Static311.aShort80;
			local53 = arg4 * 334 * local88 / (arg0 * 512);
			if (Static84.aShort36 > local53) {
				local53 = Static84.aShort36;
				local117 = arg4 * local88 * 334 / (local53 * 512);
				local124 = (arg0 - local117) / 2;
				if (arg2) {
					Static164.aClass92_7.method4467();
					Static164.aClass92_7.method4502(arg1, arg4, arg3, local124, -16777216);
					Static164.aClass92_7.method4502(arg1 + arg0 - local124, arg4, arg3, local124, -16777216);
				}
				arg0 -= local124 * 2;
				arg1 += local124;
			}
		}
		Static13.anInt307 = (short) arg0;
		Static51.anInt1147 = local53 * arg0 / 334;
		Static51.anInt1146 = arg1;
		Static130.anInt2949 = arg3;
		Static1.anInt3 = (short) arg4;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!vm;Lclient!ir;Lclient!nj;III)Z")
	public static boolean method4938(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class4_Sub20 arg1, @OriginalArg(2) Class139 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg2.anIntArray365 != null) {
			local11 = Static42.anInt2436 - (Static42.anInt2436 - Static42.anInt2442) * (-Static42.anInt2440 + arg2.anInt4362 + arg1.anInt3079) / (Static42.anInt2445 - Static42.anInt2440);
			local13 = Static42.anInt2436 - (arg1.anInt3079 + arg2.anInt4376 - Static42.anInt2440) * (-Static42.anInt2442 + Static42.anInt2436) / (Static42.anInt2445 - Static42.anInt2440);
			local9 = Static42.anInt2444 + (arg2.anInt4371 + arg1.anInt3085 - Static42.anInt2437) * (Static42.anInt2435 - Static42.anInt2444) / (Static42.anInt2438 - Static42.anInt2437);
			local7 = Static42.anInt2444 + (Static42.anInt2435 - Static42.anInt2444) * (arg2.anInt4373 + arg1.anInt3085 - Static42.anInt2437) / (Static42.anInt2438 - Static42.anInt2437);
		}
		@Pc(103) Class60 local103 = null;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		if (arg2.anInt4358 != -1) {
			if (arg1.aBoolean260 && arg2.anInt4355 != -1) {
				local103 = arg2.method3659(true, arg0);
			} else {
				local103 = arg2.method3659(false, arg0);
			}
			if (local103 != null) {
				local105 = arg1.anInt3078 - (local103.method5683() + 1 >> 1);
				if (local7 > local105) {
					local7 = local105;
				}
				local107 = arg1.anInt3078 + (local103.method5683() + 1 >> 1);
				if (local107 > local9) {
					local9 = local107;
				}
				local109 = arg1.anInt3084 - (local103.method5691() + 1 >> 1);
				local111 = arg1.anInt3084 + (local103.method5691() + 1 >> 1);
				if (local109 < local11) {
					local11 = local109;
				}
				if (local111 > local13) {
					local13 = local111;
				}
			}
		}
		@Pc(214) Class147 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(234) int local234 = 0;
		@Pc(236) int local236 = 0;
		@Pc(286) int local286;
		@Pc(309) int local309;
		if (arg2.aString156 != null) {
			local214 = Static301.method5109(arg2.anInt4357);
			if (local214 != null) {
				local216 = Static259.aClass106_8.method2875(arg2.aString156, null, null, Static344.aStringArray46);
				local226 = arg1.anInt3084;
				if (local103 == null) {
					local226 -= local216 * local214.method3907() / 2;
				} else {
					local226 -= (local103.method5691() >> 1) + (local214.method3910() * local216);
				}
				for (local286 = 0; local286 < local216; local286++) {
					@Pc(292) String local292 = Static344.aStringArray46[local286];
					if (local286 < local216 - 1) {
						local292 = local292.substring(0, local292.length() - 4);
					}
					local309 = local214.method3908(local292);
					if (local309 > local228) {
						local228 = local309;
					}
				}
				local230 = arg1.anInt3078 - local228 / 2;
				if (local230 < local7) {
					local7 = local230;
				}
				local232 = local228 / 2 + arg1.anInt3078;
				local234 = local226;
				if (local232 > local9) {
					local9 = local232;
				}
				local236 = local226 + local216 * local214.method3910();
				if (local11 > local234) {
					local11 = local234;
				}
				if (local13 < local236) {
					local13 = local236;
				}
			}
		}
		if (Static42.anInt2444 > local9 || local7 > Static42.anInt2435 || local13 < Static42.anInt2442 || Static42.anInt2436 < local11) {
			return true;
		}
		@Pc(403) int local403;
		if (arg2.anIntArray365 != null) {
			@Pc(401) int[] local401 = new int[arg2.anIntArray365.length];
			for (local403 = 0; local403 < local401.length / 2; local403++) {
				local309 = arg1.anInt3085 + arg2.anIntArray365[local403 * 2];
				@Pc(428) int local428 = arg2.anIntArray365[local403 * 2 + 1] + arg1.anInt3079;
				local401[local403 * 2] = (local309 - Static42.anInt2437) * (Static42.anInt2435 - Static42.anInt2444) / (Static42.anInt2438 - Static42.anInt2437) + Static42.anInt2444;
				local401[local403 * 2 + 1] = Static42.anInt2436 - (local428 - Static42.anInt2440) * (-Static42.anInt2442 + Static42.anInt2436) / (Static42.anInt2445 - Static42.anInt2440);
			}
			Static26.method473(arg0, local401, arg2.anInt4367);
			for (local309 = 0; local309 < local401.length / 2 - 1; local309++) {
				arg0.method4500(local401[local309 * 2 + 1], local401[local309 * 2], arg2.anInt4374, local401[local309 * 2 + 2], local401[local309 * 2 + 2 + 1]);
			}
			arg0.method4500(local401[local401.length - 1], local401[local401.length - 2], arg2.anInt4374, local401[0], local401[1]);
		}
		if (local103 != null) {
			if (Static153.anInt3426 > 0 && (Static213.anInt4432 != -1 && Static213.anInt4432 == arg1.anInt3082 || Static214.anInt4451 != -1 && arg2.anInt4370 == Static214.anInt4451)) {
				if (Static290.anInt5894 <= 50) {
					local286 = Static290.anInt5894 * 2;
				} else {
					local286 = (100 - Static290.anInt5894) * 2;
				}
				local403 = local286 << 24 | 0xFFFF00;
				arg0.method4453(local403, arg1.anInt3078, local103.method5679() / 2 + 7, arg1.anInt3084);
				arg0.method4453(local403, arg1.anInt3078, local103.method5679() / 2 + 5, arg1.anInt3084);
				arg0.method4453(local403, arg1.anInt3078, local103.method5679() / 2 + 3, arg1.anInt3084);
				arg0.method4453(local403, arg1.anInt3078, local103.method5679() / 2 + 1, arg1.anInt3084);
				arg0.method4453(local403, arg1.anInt3078, local103.method5679() / 2, arg1.anInt3084);
			}
			local103.method5675(arg1.anInt3078 - (local103.method5683() >> 1), arg1.anInt3084 + -(local103.method5691() >> 1));
		}
		if (arg2.aString156 != null && local214 != null) {
			Static246.method4246(local214, local216, arg1, arg0, local226, arg2, local228);
		}
		if (arg2.anInt4358 != -1 || arg2.aString156 != null) {
			@Pc(712) Class4_Sub25 local712 = new Class4_Sub25(arg1);
			local712.anInt3445 = local232;
			local712.anInt3451 = local230;
			local712.anInt3455 = local107;
			local712.anInt3450 = local105;
			local712.anInt3458 = local109;
			local712.anInt3447 = local236;
			local712.anInt3453 = local111;
			local712.anInt3446 = local234;
			Static104.aClass130_159.method3510(local712);
		}
		return false;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method4939() {
		if (Static11.anInt266 < 0) {
			return;
		}
		@Pc(7) long local7 = Static274.method4763();
		Static11.anInt266 = (int) ((long) Static11.anInt266 + Static16.aLong18 - local7);
		if (Static11.anInt266 <= 0) {
			Static6.anInt1977 = Static13.aClass100_1.anInt3106;
			Static72.aFloat19 = Static13.aClass100_1.aFloat32;
			Static22.anInt409 = Static13.aClass100_1.anInt3101;
			Static322.aFloat75 = Static13.aClass100_1.aFloat29;
			Static320.aFloat74 = Static13.aClass100_1.aFloat31;
			Static91.aFloat20 = Static13.aClass100_1.aFloat30;
			Static47.anInt1065 = Static13.aClass100_1.anInt3103;
			Static277.aFloat71 = Static13.aClass100_1.aFloat34;
			Static112.aClass49_1 = Static13.aClass100_1.aClass49_2;
			Static305.aFloat73 = Static13.aClass100_1.aFloat33;
			Static11.anInt266 = -1;
		} else {
			@Pc(58) int local58 = (Static11.anInt266 << 8) / Static240.anInt5022;
			@Pc(63) int local63 = 255 - local58;
			@Pc(68) float local68 = (float) local58 / 255.0F;
			Static6.anInt1977 = (local58 * (Static125.anInt6058 & 0xFF00) + local63 * (Static13.aClass100_1.anInt3106 & 0xFF00) & 0xFF0000) + (local63 * (Static13.aClass100_1.anInt3106 & 0xFF00FF) + local58 * (Static125.anInt6058 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			@Pc(104) float local104 = 1.0F - local68;
			Static320.aFloat74 = (Static13.aClass100_1.aFloat31 - Static189.aFloat40) * local104 + Static189.aFloat40;
			Static22.anInt409 = (local63 * (Static13.aClass100_1.anInt3101 & 0xFF00) + (Static308.anInt6687 & 0xFF00) * local58 & 0xFF0000) + ((Static13.aClass100_1.anInt3101 & 0xFF00FF) * local63 + (Static308.anInt6687 & 0xFF00FF) * local58 & 0xFF00FF00) >>> 8;
			Static277.aFloat71 = (Static13.aClass100_1.aFloat34 - Static167.aFloat38) * local104 + Static167.aFloat38;
			Static47.anInt1065 = Static13.aClass100_1.anInt3103 * local63 + local58 * Static208.anInt4349 >> 8;
			Static91.aFloat20 = (Static13.aClass100_1.aFloat30 - Static30.aFloat16) * local104 + Static30.aFloat16;
			Static322.aFloat75 = local104 * (Static13.aClass100_1.aFloat29 - Static157.aFloat37) + Static157.aFloat37;
			Static305.aFloat73 = (Static13.aClass100_1.aFloat33 - Static221.aFloat42) * local104 + Static221.aFloat42;
			Static72.aFloat19 = local104 * (Static13.aClass100_1.aFloat32 - Static153.aFloat36) + Static153.aFloat36;
			if (Static174.aClass49_3 != Static13.aClass100_1.aClass49_2) {
				Static112.aClass49_1 = Static158.aClass92_6.method4512(Static174.aClass49_3, Static13.aClass100_1.aClass49_2, local104, Static112.aClass49_1);
			}
		}
		Static16.aLong18 = local7;
	}
}
