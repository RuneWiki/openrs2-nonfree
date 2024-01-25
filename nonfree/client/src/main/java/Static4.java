import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "I")
	public static int anInt23;

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
	public static int anInt24 = 0;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString2 = null;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIII[B)Z")
	public static boolean method39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class8_Sub8 local12 = new Class8_Sub8(arg4);
		@Pc(19) int local19 = -1;
		label68: while (true) {
			@Pc(23) int local23 = local12.method8537();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(101) Class352 local101;
				do {
					@Pc(67) int local67;
					@Pc(71) int local71;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local12.method8565();
										if (local39 == 0) {
											continue label68;
										}
										local12.method8525();
									}
									local39 = local12.method8565();
									if (local39 == 0) {
										continue label68;
									}
									local31 += local39 - 1;
									@Pc(51) int local51 = local31 & 0x3F;
									@Pc(57) int local57 = local31 >> 6 & 0x3F;
									local63 = local12.method8525() >> 2;
									local67 = arg1 + local57;
									local71 = arg2 + local51;
								} while (local67 <= 0);
							} while (local71 <= 0);
						} while (arg0 - 1 <= local67);
					} while (local71 >= arg3 - 1);
					local101 = Static437.aClass199_3.method5342(local19);
				} while (local63 == 22 && Static155.aClass8_Sub25_6.aClass36_Sub1_1.method1349() == 0 && local101.anInt10102 == 0 && local101.anInt10130 != 1 && !local101.aBoolean728);
				local33 = true;
				if (!local101.method8166()) {
					Static137.anInt3573++;
					local7 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "([FIIIIII)V")
	public static void method41(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 > 0 && !Static439.method6796(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static439.method6796(arg4)) {
			@Pc(32) int local32 = Static18.method812(6408);
			@Pc(34) int local34 = 0;
			@Pc(45) int local45 = arg4 <= arg2 ? arg4 : arg2;
			@Pc(49) int local49 = arg2 >> 1;
			@Pc(53) int local53 = arg4 >> 1;
			@Pc(55) float[] local55 = arg0;
			@Pc(62) float[] local62 = new float[local53 * local49 * local32];
			while (true) {
				OpenGL.glTexImage2Df(3553, local34, 34842, arg2, arg4, 0, 6408, 5126, local55, 0);
				if (local45 <= 1) {
					return;
				}
				@Pc(81) int local81 = local32 * arg2;
				@Pc(83) float[] local83 = local62;
				for (@Pc(85) int local85 = 0; local85 < local32; local85++) {
					@Pc(89) int local89 = local85;
					@Pc(91) int local91 = local85;
					@Pc(96) int local96 = local85 + local81;
					for (@Pc(98) int local98 = 0; local98 < local53; local98++) {
						for (@Pc(102) int local102 = 0; local102 < local49; local102++) {
							@Pc(108) float local108 = local55[local91];
							local91 += local32;
							@Pc(118) float local118 = local108 + local55[local91];
							@Pc(124) float local124 = local118 + local55[local96];
							local91 += local32;
							local96 += local32;
							@Pc(138) float local138 = local124 + local55[local96];
							local62[local89] = local138 * 0.25F;
							local96 += local32;
							local89 += local32;
						}
						local96 += local81;
						local91 += local81;
					}
				}
				local62 = local55;
				local55 = local83;
				arg2 = local49;
				arg4 = local53;
				local45 >>= 0x1;
				local53 >>= 0x1;
				local34++;
				local49 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
