import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_367 = Static181.method2795("Hidden");

	@OriginalMember(owner = "client!ei", name = "x", descriptor = "Lclient!qe;")
	public static Class83 aClass83_366 = aClass83_367;

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "[Lclient!rd;")
	public static final Class24_Sub4_Sub2[] aClass24_Sub4_Sub2Array1 = new Class24_Sub4_Sub2[32768];

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_368 = Static181.method2795("Unexpected server response)3");

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_369 = Static181.method2795("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "Lclient!qe;")
	public static Class83 aClass83_370 = aClass83_368;

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_371 = Static181.method2795("::qa_op_test");

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method941(@OriginalArg(1) Class24_Sub4 arg0) {
		arg0.anInt3310 = arg0.anInt3290;
		if (arg0.anInt3330 == 0) {
			arg0.anInt3339 = 0;
			return;
		}
		if (arg0.anInt3336 != -1 && arg0.anInt3297 == 0) {
			@Pc(31) Class2_Sub2_Sub16 local31 = Static213.method3229(arg0.anInt3336);
			if (arg0.anInt3334 > 0 && local31.anInt2351 == 0) {
				arg0.anInt3339++;
				return;
			}
			if (arg0.anInt3334 <= 0 && local31.anInt2352 == 0) {
				arg0.anInt3339++;
				return;
			}
		}
		@Pc(63) int local63 = arg0.anInt3316;
		@Pc(66) int local66 = arg0.anInt3349;
		@Pc(81) int local81 = arg0.anInt3332 * 64 + arg0.anIntArray316[arg0.anInt3330 - 1] * 128;
		@Pc(96) int local96 = arg0.anInt3332 * 64 + arg0.anIntArray319[arg0.anInt3330 - 1] * 128;
		if (local96 - local63 > 256 || local96 - local63 < -256 || local81 - local66 > 256 || local81 - local66 < -256) {
			arg0.anInt3349 = local81;
			arg0.anInt3316 = local96;
			return;
		}
		if (local63 < local96) {
			if (local81 > local66) {
				arg0.anInt3318 = 1280;
			} else if (local81 < local66) {
				arg0.anInt3318 = 1792;
			} else {
				arg0.anInt3318 = 1536;
			}
		} else if (local63 > local96) {
			if (local81 > local66) {
				arg0.anInt3318 = 768;
			} else if (local66 <= local81) {
				arg0.anInt3318 = 512;
			} else {
				arg0.anInt3318 = 256;
			}
		} else if (local81 > local66) {
			arg0.anInt3318 = 1024;
		} else if (local81 < local66) {
			arg0.anInt3318 = 0;
		}
		@Pc(230) int local230 = arg0.anInt3318 - arg0.anInt3331 & 0x7FF;
		if (local230 > 1024) {
			local230 -= 2048;
		}
		@Pc(237) int local237 = arg0.anInt3292;
		@Pc(239) int local239 = 4;
		if (local230 >= -256 && local230 <= 256) {
			local237 = arg0.anInt3289;
		} else if (local230 >= 256 && local230 < 768) {
			local237 = arg0.anInt3350;
		} else if (local230 >= -768 && local230 <= -256) {
			local237 = arg0.anInt3324;
		}
		if (local237 == -1) {
			local237 = arg0.anInt3289;
		}
		arg0.anInt3310 = local237;
		@Pc(288) boolean local288 = true;
		if (arg0 instanceof Class24_Sub4_Sub2) {
			local288 = ((Class24_Sub4_Sub2) arg0).aClass2_Sub2_Sub24_1.aBoolean150;
		}
		if (local288) {
			if (arg0.anInt3331 != arg0.anInt3318 && arg0.anInt3299 == -1 && arg0.anInt3345 != 0) {
				local239 = 2;
			}
			if (arg0.anInt3330 > 2) {
				local239 = 6;
			}
			if (arg0.anInt3330 > 3) {
				local239 = 8;
			}
			if (arg0.anInt3339 > 0 && arg0.anInt3330 > 1) {
				local239 = 8;
				arg0.anInt3339--;
			}
		} else {
			if (arg0.anInt3330 > 1) {
				local239 = 6;
			}
			if (arg0.anInt3330 > 2) {
				local239 = 8;
			}
			if (arg0.anInt3339 > 0 && arg0.anInt3330 > 1) {
				local239 = 8;
				arg0.anInt3339--;
			}
		}
		if (arg0.aBooleanArray22[arg0.anInt3330 - 1]) {
			local239 <<= 0x1;
		}
		if (local96 > local63) {
			arg0.anInt3316 += local239;
			if (local96 < arg0.anInt3316) {
				arg0.anInt3316 = local96;
			}
		} else if (local63 > local96) {
			arg0.anInt3316 -= local239;
			if (local96 > arg0.anInt3316) {
				arg0.anInt3316 = local96;
			}
		}
		if (local239 >= 8 && arg0.anInt3289 == arg0.anInt3310 && arg0.anInt3341 != -1) {
			arg0.anInt3310 = arg0.anInt3341;
		}
		if (local66 < local81) {
			arg0.anInt3349 += local239;
			if (local81 < arg0.anInt3349) {
				arg0.anInt3349 = local81;
			}
		} else if (local81 < local66) {
			arg0.anInt3349 -= local239;
			if (arg0.anInt3349 < local81) {
				arg0.anInt3349 = local81;
			}
		}
		if (arg0.anInt3316 != local96 || local81 != arg0.anInt3349) {
			return;
		}
		arg0.anInt3330--;
		if (arg0.anInt3334 > 0) {
			arg0.anInt3334--;
			return;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIII)V")
	public static void method942(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg5;
		@Pc(20) int local20 = arg1 - arg5;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(28) int local28 = arg1 * arg1;
		@Pc(32) int local32 = local28 << 1;
		@Pc(36) int local36 = local24 << 1;
		@Pc(40) int local40 = local20 * local20;
		@Pc(44) int local44 = local16 * local16;
		@Pc(48) int local48 = local44 << 1;
		@Pc(52) int local52 = local40 << 1;
		@Pc(56) int local56 = arg1 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = (1 - local56) * local24 + local32;
		@Pc(77) int local77 = local28 - (local56 - 1) * local36;
		@Pc(86) int local86 = local40 - (local60 - 1) * local48;
		@Pc(95) int local95 = local44 * (1 - local60) + local52;
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local44 << 2;
		@Pc(107) int local107 = local40 << 2;
		@Pc(111) int local111 = local28 << 2;
		@Pc(115) int local115 = local32 * 3;
		@Pc(121) int local121 = local36 * (local56 - 3);
		@Pc(125) int local125 = local52 * 3;
		@Pc(131) int local131 = (local60 - 3) * local48;
		@Pc(133) int local133 = local111;
		@Pc(139) int local139 = (arg1 - 1) * local99;
		@Pc(141) int local141 = local107;
		@Pc(147) int local147 = (local20 - 1) * local103;
		@Pc(166) int local166;
		@Pc(175) int local175;
		@Pc(184) int local184;
		@Pc(192) int local192;
		if (arg4 >= Static147.anInt4074 && Static61.anInt1501 >= arg4) {
			@Pc(157) int[] local157 = Static14.anIntArrayArray18[arg4];
			local166 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg6 - arg0);
			local175 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg6 + arg0);
			local184 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg6 - local16);
			local192 = Static50.method998(Static36.anInt940, Static209.anInt4155, local16 + arg6);
			Static22.method438(local184, arg3, local166, local157);
			Static22.method438(local192, arg2, local184, local157);
			Static22.method438(local175, arg3, local192, local157);
		}
		while (local9 > 0) {
			if (local69 < 0) {
				while (local69 < 0) {
					local7++;
					local77 += local133;
					local133 += local111;
					local69 += local115;
					local115 += local111;
				}
			}
			if (local77 < 0) {
				local77 += local133;
				local69 += local115;
				local115 += local111;
				local133 += local111;
				local7++;
			}
			@Pc(270) boolean local270 = local9 <= local20;
			local9--;
			local175 = arg4 + local9;
			local166 = arg4 - local9;
			local77 += -local121;
			if (local270) {
				if (local95 < 0) {
					while (local95 < 0) {
						local95 += local125;
						local125 += local107;
						local11++;
						local86 += local141;
						local141 += local107;
					}
				}
				if (local86 < 0) {
					local95 += local125;
					local125 += local107;
					local11++;
					local86 += local141;
					local141 += local107;
				}
				local86 += -local131;
				local95 += -local147;
				local147 -= local103;
				local131 -= local103;
			}
			local69 += -local139;
			local139 -= local99;
			if (Static147.anInt4074 <= local175 && Static61.anInt1501 >= local166) {
				local184 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg6 + local7);
				local192 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg6 - local7);
				if (local270) {
					@Pc(399) int local399 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg6 + local11);
					@Pc(408) int local408 = Static50.method998(Static36.anInt940, Static209.anInt4155, arg6 - local11);
					@Pc(419) int[] local419;
					if (local166 >= Static147.anInt4074) {
						local419 = Static14.anIntArrayArray18[local166];
						Static22.method438(local408, arg3, local192, local419);
						Static22.method438(local399, arg2, local408, local419);
						Static22.method438(local184, arg3, local399, local419);
					}
					if (local175 <= Static61.anInt1501) {
						local419 = Static14.anIntArrayArray18[local175];
						Static22.method438(local408, arg3, local192, local419);
						Static22.method438(local399, arg2, local408, local419);
						Static22.method438(local184, arg3, local399, local419);
					}
				} else {
					if (local166 >= Static147.anInt4074) {
						Static22.method438(local184, arg3, local192, Static14.anIntArrayArray18[local166]);
					}
					if (Static61.anInt1501 >= local175) {
						Static22.method438(local184, arg3, local192, Static14.anIntArrayArray18[local175]);
					}
				}
			}
			local121 -= local99;
		}
	}
}
