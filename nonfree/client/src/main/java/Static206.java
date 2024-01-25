import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_132 = new Class67(42, 5);

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIIIILclient!mk;IIIIII)Z")
	public static boolean method2986(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class158 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7 = arg10;
		@Pc(9) int local9 = arg8;
		@Pc(18) int local18 = arg10 - 64;
		@Pc(22) int local22 = arg8 - 64;
		Static410.anIntArrayArray48[64][64] = 99;
		Static381.anIntArrayArray47[64][64] = 0;
		@Pc(36) byte local36 = 0;
		Static99.anIntArray134[0] = arg10;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local36 + 1;
		Static89.anIntArray129[0] = arg8;
		@Pc(55) int[][] local55 = arg4.anIntArrayArray39;
		while (true) {
			label282: while (true) {
				@Pc(76) int local76;
				@Pc(81) int local81;
				@Pc(87) int local87;
				@Pc(92) int local92;
				@Pc(252) int local252;
				@Pc(291) int local291;
				do {
					do {
						do {
							label259: do {
								if (local47 == local50) {
									Static103.anInt6432 = local7;
									Static44.anInt641 = local9;
									return false;
								}
								local9 = Static89.anIntArray129[local47];
								local7 = Static99.anIntArray134[local47];
								local47 = local47 + 1 & 0xFFF;
								local76 = local7 - local18;
								local81 = local9 - local22;
								local87 = local7 - arg4.anInt4542;
								local92 = local9 - arg4.anInt4550;
								if (arg0 == -4) {
									if (arg5 == local7 && local9 == arg2) {
										Static103.anInt6432 = local7;
										Static44.anInt641 = local9;
										return true;
									}
								} else if (arg0 == -3) {
									if (Static132.method5178(arg7, arg9, arg2, local7, arg5, arg3, arg9, local9)) {
										Static44.anInt641 = local9;
										Static103.anInt6432 = local7;
										return true;
									}
								} else if (arg0 == -2) {
									if (arg4.method3625(local7, arg9, arg5, arg2, arg3, local9, arg9, arg7, arg1)) {
										Static103.anInt6432 = local7;
										Static44.anInt641 = local9;
										return true;
									}
								} else if (arg0 == -1) {
									if (arg4.method3618(arg3, arg9, arg5, arg2, local9, arg1, local7, arg7)) {
										Static103.anInt6432 = local7;
										Static44.anInt641 = local9;
										return true;
									}
								} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
									if (arg4.method3613(local9, arg9, arg0, arg6, arg2, arg5, local7)) {
										Static44.anInt641 = local9;
										Static103.anInt6432 = local7;
										return true;
									}
								} else if (arg4.method3615(arg6, arg2, arg5, arg0, arg9, local7, local9)) {
									Static44.anInt641 = local9;
									Static103.anInt6432 = local7;
									return true;
								}
								local252 = Static381.anIntArrayArray47[local76][local81] + 1;
								if (local76 > 0 && Static410.anIntArrayArray48[local76 - 1][local81] == 0 && (local55[local87 - 1][local92] & 0x43A40000) == 0 && (local55[local87 - 1][local92 + arg9 - 1] & 0x4E240000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg9 - 1) {
											Static99.anIntArray134[local50] = local7 - 1;
											Static89.anIntArray129[local50] = local9;
											Static410.anIntArrayArray48[local76 - 1][local81] = 2;
											local50 = local50 + 1 & 0xFFF;
											Static381.anIntArrayArray47[local76 - 1][local81] = local252;
											break;
										}
										if ((local55[local87 - 1][local92 + local291] & 0x4FA40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg9 > local76 && Static410.anIntArrayArray48[local76 + 1][local81] == 0 && (local55[arg9 + local87][local92] & 0x60E40000) == 0 && (local55[arg9 + local87][local92 + arg9 - 1] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg9 - 1 <= local291) {
											Static99.anIntArray134[local50] = local7 + 1;
											Static89.anIntArray129[local50] = local9;
											local50 = local50 + 1 & 0xFFF;
											Static410.anIntArrayArray48[local76 + 1][local81] = 8;
											Static381.anIntArrayArray47[local76 + 1][local81] = local252;
											break;
										}
										if ((local55[local87 + arg9][local92 + local291] & 0x78E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local81 > 0 && Static410.anIntArrayArray48[local76][local81 - 1] == 0 && (local55[local87][local92 - 1] & 0x43A40000) == 0 && (local55[local87 + arg9 - 1][local92 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (local291 >= arg9 - 1) {
											Static99.anIntArray134[local50] = local7;
											Static89.anIntArray129[local50] = local9 - 1;
											local50 = local50 + 1 & 0xFFF;
											Static410.anIntArrayArray48[local76][local81 - 1] = 1;
											Static381.anIntArrayArray47[local76][local81 - 1] = local252;
											break;
										}
										if ((local55[local291 + local87][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (128 - arg9 > local81 && Static410.anIntArrayArray48[local76][local81 + 1] == 0 && (local55[local87][local92 + arg9] & 0x4E240000) == 0 && (local55[local87 + arg9 - 1][local92 + arg9] & 0x78240000) == 0) {
									local291 = 1;
									while (true) {
										if (arg9 - 1 <= local291) {
											Static99.anIntArray134[local50] = local7;
											Static89.anIntArray129[local50] = local9 + 1;
											local50 = local50 + 1 & 0xFFF;
											Static410.anIntArrayArray48[local76][local81 + 1] = 4;
											Static381.anIntArrayArray47[local76][local81 + 1] = local252;
											break;
										}
										if ((local55[local291 + local87][local92 + arg9] & 0x7E240000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local76 > 0 && local81 > 0 && Static410.anIntArrayArray48[local76 - 1][local81 - 1] == 0 && (local55[local87 - 1][local92 - 1] & 0x43A40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg9 <= local291) {
											Static99.anIntArray134[local50] = local7 - 1;
											Static89.anIntArray129[local50] = local9 - 1;
											Static410.anIntArrayArray48[local76 - 1][local81 - 1] = 3;
											local50 = local50 + 1 & 0xFFF;
											Static381.anIntArrayArray47[local76 - 1][local81 - 1] = local252;
											break;
										}
										if ((local55[local87 - 1][local291 + local92 - 1] & 0x4FA40000) != 0 || (local55[local291 + local87 - 1][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local76 < 128 - arg9 && local81 > 0 && Static410.anIntArrayArray48[local76 + 1][local81 - 1] == 0 && (local55[arg9 + local87][local92 - 1] & 0x60E40000) == 0) {
									local291 = 1;
									while (true) {
										if (arg9 <= local291) {
											Static99.anIntArray134[local50] = local7 + 1;
											Static89.anIntArray129[local50] = local9 - 1;
											Static410.anIntArrayArray48[local76 + 1][local81 - 1] = 9;
											local50 = local50 + 1 & 0xFFF;
											Static381.anIntArrayArray47[local76 + 1][local81 - 1] = local252;
											break;
										}
										if ((local55[arg9 + local87][local291 + local92 - 1] & 0x78E40000) != 0 || (local55[local87 + local291][local92 - 1] & 0x63E40000) != 0) {
											break;
										}
										local291++;
									}
								}
								if (local76 > 0 && 128 - arg9 > local81 && Static410.anIntArrayArray48[local76 - 1][local81 + 1] == 0 && (local55[local87 - 1][local92 + arg9] & 0x4E240000) == 0) {
									for (local291 = 1; local291 < arg9; local291++) {
										if ((local55[local87 - 1][local291 + local92] & 0x4FA40000) != 0 || (local55[local291 + local87 - 1][arg9 + local92] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static99.anIntArray134[local50] = local7 - 1;
									Static89.anIntArray129[local50] = local9 + 1;
									local50 = local50 + 1 & 0xFFF;
									Static410.anIntArrayArray48[local76 - 1][local81 + 1] = 6;
									Static381.anIntArrayArray47[local76 - 1][local81 + 1] = local252;
								}
							} while (local76 >= 128 - arg9);
						} while (128 - arg9 <= local81);
					} while (Static410.anIntArrayArray48[local76 + 1][local81 + 1] != 0);
				} while ((local55[arg9 + local87][arg9 + local92] & 0x78240000) != 0);
				for (local291 = 1; local291 < arg9; local291++) {
					if ((local55[local87 + local291][arg9 + local92] & 0x7E240000) != 0 || (local55[arg9 + local87][local92 + local291] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static99.anIntArray134[local50] = local7 + 1;
				Static89.anIntArray129[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static410.anIntArrayArray48[local76 + 1][local81 + 1] = 12;
				Static381.anIntArrayArray47[local76 + 1][local81 + 1] = local252;
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(BII)Z")
	public static boolean method2989(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(II[IIIIII)V")
	public static void method2990(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 > 0 && !Static375.method4864(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static375.method4864(arg2)) {
			@Pc(52) int local52 = 0;
			@Pc(63) int local63 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(67) int local67 = arg3 >> 1;
			@Pc(71) int local71 = arg2 >> 1;
			@Pc(73) int[] local73 = arg1;
			@Pc(78) int[] local78 = new int[local71 * local67];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local52, arg5, arg3, arg2, 0, 32993, arg4, local73, 0);
				if (local63 <= 1) {
					return;
				}
				@Pc(95) int local95 = 0;
				@Pc(97) int local97 = 0;
				@Pc(102) int local102 = arg3;
				for (@Pc(104) int local104 = 0; local104 < local71; local104++) {
					for (@Pc(108) int local108 = 0; local108 < local67; local108++) {
						@Pc(115) int local115 = local73[local97++];
						@Pc(120) int local120 = local73[local102++];
						@Pc(125) int local125 = local73[local97++];
						@Pc(131) int local131 = local115 >> 16 & 0xFF;
						@Pc(137) int local137 = local115 >> 8 & 0xFF;
						@Pc(142) int local142 = local73[local102++];
						@Pc(146) int local146 = local115 & 0xFF;
						@Pc(152) int local152 = local115 >> 24 & 0xFF;
						@Pc(160) int local160 = local152 + (local125 >> 24 & 0xFF);
						@Pc(168) int local168 = local137 + (local125 >> 8 & 0xFF);
						@Pc(176) int local176 = local131 + (local125 >> 16 & 0xFF);
						@Pc(182) int local182 = local146 + (local125 & 0xFF);
						@Pc(190) int local190 = local176 + (local120 >> 16 & 0xFF);
						@Pc(196) int local196 = local182 + (local120 & 0xFF);
						@Pc(204) int local204 = local160 + (local120 >> 24 & 0xFF);
						@Pc(212) int local212 = local168 + (local120 >> 8 & 0xFF);
						@Pc(220) int local220 = local204 + (local142 >> 24 & 0xFF);
						@Pc(228) int local228 = local190 + (local142 >> 16 & 0xFF);
						@Pc(236) int local236 = local212 + (local142 >> 8 & 0xFF);
						@Pc(242) int local242 = local196 + (local142 & 0xFF);
						local78[local95++] = (local236 & 0x3FC) << 6 | (local228 & 0x3FC) << 14 | (local220 & 0x3FC) << 22 | local242 >> 2 & 0xFF;
					}
					local97 += arg3;
					local102 += arg3;
				}
				@Pc(295) int[] local295 = local78;
				local78 = local73;
				local73 = local295;
				arg2 = local71;
				arg3 = local67;
				local52++;
				local67 >>= 0x1;
				local63 >>= 0x1;
				local71 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
