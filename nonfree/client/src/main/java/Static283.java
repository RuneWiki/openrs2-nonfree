import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
	public static int anInt5296;

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "Z")
	public static boolean aBoolean402;

	@OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
	public static int anInt5302 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III[BIII)V")
	public static void method4481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static422.method6062(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static422.method6062(arg1)) {
			@Pc(34) int local34 = Static257.method4279(arg4);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg5 < arg1 ? arg5 : arg1;
			@Pc(47) int local47 = arg5 >> 1;
			@Pc(51) int local51 = arg1 >> 1;
			@Pc(64) byte[] local64 = arg3;
			@Pc(71) byte[] local71 = new byte[local34 * local51 * local47];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local36, arg0, arg5, arg1, 0, arg4, 5121, local64, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg5 * local34;
				for (@Pc(91) int local91 = 0; local91 < local34; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local89 + local91;
					for (@Pc(103) int local103 = 0; local103 < local51; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local47; local107++) {
							@Pc(113) byte local113 = local64[local97];
							local97 += local34;
							@Pc(123) int local123 = local113 + local64[local97];
							@Pc(129) int local129 = local123 + local64[local101];
							local97 += local34;
							local101 += local34;
							@Pc(143) int local143 = local129 + local64[local101];
							local71[local95] = (byte) (local143 >> 2);
							local101 += local34;
							local95 += local34;
						}
						local97 += local89;
						local101 += local89;
					}
				}
				@Pc(184) byte[] local184 = local71;
				local71 = local64;
				arg1 = local51;
				arg5 = local47;
				local64 = local184;
				local43 >>= 0x1;
				local47 >>= 0x1;
				local51 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILclient!nea;)I")
	public static int method4482(@OriginalArg(1) Class240 arg0) {
		if (Static174.aClass240_2 == arg0) {
			return 7681;
		} else if (Static152.aClass240_1 == arg0) {
			return 8448;
		} else if (arg0 == Static440.aClass240_3) {
			return 34165;
		} else if (arg0 == Static598.aClass240_5) {
			return 260;
		} else if (arg0 == Static494.aClass240_4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!fa;IIILclient!gba;ZLclient!xa;I)V")
	public static void method4483(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class115 arg4, @OriginalArg(6) Class13 arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static555.anInt9335 == 4) {
			local16 = (int) Static477.aFloat164 & 0x3FFF;
		} else {
			local16 = (int) Static477.aFloat164 + Static402.anInt6978 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg4.anInt3474 / 2, arg4.anInt3481 / 2) + 10;
		@Pc(44) int local44 = arg3 * arg3 + arg2 * arg2;
		if (local35 * local35 < local44) {
			return;
		}
		@Pc(54) int local54 = Class4_Sub11.anIntArray148[local16];
		@Pc(58) int local58 = Class4_Sub11.anIntArray147[local16];
		if (Static555.anInt9335 != 4) {
			local58 = local58 * 256 / (Static380.anInt6751 + 256);
			local54 = local54 * 256 / (Static380.anInt6751 + 256);
		}
		@Pc(93) int local93 = arg3 * local58 + local54 * arg2 >> 14;
		@Pc(103) int local103 = local58 * arg2 - arg3 * local54 >> 14;
		arg5.method8021(arg1 + arg4.anInt3474 / 2 + local93 - arg5.AA() / 2, arg4.anInt3481 / 2 + (arg6 - (local103 - -(arg5.a() / 2))), arg0, arg1, arg6);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)Z")
	public static boolean method4484(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static410.anInt7087; local1 < Static562.anInt9418; local1++) {
			@Pc(6) Class100[][] local6 = Static309.aClass100ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static415.anInt7175; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static22.anInt439 + local9;
				@Pc(18) int local18 = Static22.anInt439 - local9;
				if (local14 >= Static580.anInt2683 || local18 < Static19.anInt391) {
					for (@Pc(27) int local27 = -Static415.anInt7175; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static140.anInt3150 + local27;
						@Pc(36) int local36 = Static140.anInt3150 - local27;
						@Pc(48) Class100 local48;
						if (local14 >= Static580.anInt2683) {
							if (local32 >= Static312.anInt9781) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean244) {
									Static384.aBoolean505 = arg0;
									Static146.aClass40_1.method7716(local48);
									Static146.aClass40_1.method7713();
								}
							}
							if (local36 < Static268.anInt5152) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean244) {
									Static384.aBoolean505 = arg0;
									Static146.aClass40_1.method7716(local48);
									Static146.aClass40_1.method7713();
								}
							}
						}
						if (local18 < Static19.anInt391) {
							if (local32 >= Static312.anInt9781) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean244) {
									Static384.aBoolean505 = arg0;
									Static146.aClass40_1.method7716(local48);
									Static146.aClass40_1.method7713();
								}
							}
							if (local36 < Static268.anInt5152) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean244) {
									Static384.aBoolean505 = arg0;
									Static146.aClass40_1.method7716(local48);
									Static146.aClass40_1.method7713();
								}
							}
						}
						if (Static387.anInt9643 == 0) {
							if (Static590.aBoolean681) {
								Static146.aClass40_1.method7714(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
