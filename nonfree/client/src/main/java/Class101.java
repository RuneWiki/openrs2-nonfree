import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public class Class101 {

	@OriginalMember(owner = "client!iv", name = "m", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "[I")
	private final int[] anIntArray291 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "[I")
	private final int[] anIntArray292 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "Lclient!cq;")
	private final Class43 aClass43_4;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
	protected final int anInt2929;

	@OriginalMember(owner = "client!iv", name = "A", descriptor = "Lclient!ri;")
	private final Class207 aClass207_4;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	protected final int anInt2924;

	@OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
	public final int anInt2932;

	@OriginalMember(owner = "client!iv", name = "k", descriptor = "Z")
	public final boolean aBoolean213;

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!iv", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!iv", name = "B", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!iv", name = "r", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(IIIZLclient!cq;Lclient!ri;)V")
	protected Class101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class43 arg4, @OriginalArg(5) Class207 arg5) {
		this.aClass43_4 = arg4;
		this.anInt2929 = arg1;
		this.aClass207_4 = arg5;
		this.anInt2924 = arg2;
		this.anInt2932 = arg0;
		this.aBoolean213 = arg3;
		this.aByteArrayArrayArray13 = new byte[this.anInt2932][this.anInt2929 + 1][this.anInt2924 + 1];
		this.aByteArrayArrayArray11 = new byte[this.anInt2932][this.anInt2929][this.anInt2924];
		this.anIntArrayArrayArray3 = new int[this.anInt2932][this.anInt2929 + 1][this.anInt2924 + 1];
		this.aByteArrayArrayArray9 = new byte[this.anInt2932][this.anInt2929][this.anInt2924];
		this.aByteArrayArrayArray14 = new byte[this.anInt2932][this.anInt2929][this.anInt2924];
		this.aByteArrayArrayArray12 = new byte[this.anInt2932][this.anInt2929][this.anInt2924];
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([Lclient!sd;Lclient!nn;IIBII)V")
	public final void method2428(@OriginalArg(0) Class220[] arg0, @OriginalArg(1) Class10_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean213) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class220 local16 = arg0[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg5;
						@Pc(32) int local32 = local22 + arg4;
						if (local28 >= 0 && local28 < this.anInt2929 && local32 >= 0 && this.anInt2924 > local32) {
							local16.method4875(local32, local28);
						}
					}
				}
			}
		}
		local10 = arg5 + arg3;
		@Pc(81) int local81 = arg4 + arg2;
		for (local18 = 0; local18 < this.anInt2932; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method2434(false, local22 + local10, 0, local22 + arg5, 0, 0, arg1, local18, arg4 + local28, local81 + local28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!za;Lclient!qc;I[[BI[Z[[BII[[BILclient!sb;I)V")
	private void method2429(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class198 arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class219 arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg11 != null && arg11.aBoolean400 ? Static440.aBooleanArrayArray8[arg12] : Static287.aBooleanArrayArray5[arg12];
		@Pc(40) int local40;
		@Pc(53) Class219 local53;
		@Pc(70) byte local70;
		@Pc(86) int local86;
		@Pc(91) int local91;
		if (arg4 > 0) {
			if (arg8 > 0) {
				local40 = arg9[arg8 - 1][arg4 - 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass43_4.method1032(local40 - 1);
					if (local53.anInt6161 != -1 && local53.aBoolean400) {
						local70 = arg3[arg8 - 1][arg4 - 1];
						local86 = arg6[arg8 - 1][arg4 - 1] * 2 + 4 & 0x7;
						local91 = Static417.method5483(local53, arg1);
						if (Static318.aBooleanArrayArray6[local70][local86]) {
							Static455.anIntArray745[0] = local53.anInt6161;
							Static314.anIntArray518[0] = local91;
							Static252.anIntArray456[0] = arg1.method5830() ? local53.anInt6166 : local53.anInt6162;
							Static229.anIntArray425[0] = local53.anInt6168;
							Static96.anIntArray163[0] = local53.anInt6165;
							Static405.anIntArray661[0] = 256;
						}
					}
				}
			}
			if (arg8 < arg10 - 1) {
				local40 = arg9[arg8 + 1][arg4 - 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass43_4.method1032(local40 - 1);
					if (local53.anInt6161 != -1 && local53.aBoolean400) {
						local70 = arg3[arg8 + 1][arg4 - 1];
						local86 = arg6[arg8 + 1][arg4 - 1] * 2 + 6 & 0x7;
						local91 = Static417.method5483(local53, arg1);
						if (Static318.aBooleanArrayArray6[local70][local86]) {
							Static455.anIntArray745[2] = local53.anInt6161;
							Static314.anIntArray518[2] = local91;
							Static252.anIntArray456[2] = arg1.method5830() ? local53.anInt6166 : local53.anInt6162;
							Static229.anIntArray425[2] = local53.anInt6168;
							Static96.anIntArray163[2] = local53.anInt6165;
							Static405.anIntArray661[2] = 512;
						}
					}
				}
			}
		}
		if (arg7 - 1 > arg4) {
			if (arg8 > 0) {
				local40 = arg9[arg8 - 1][arg4 + 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass43_4.method1032(local40 - 1);
					if (local53.anInt6161 != -1 && local53.aBoolean400) {
						local70 = arg3[arg8 - 1][arg4 + 1];
						local86 = arg6[arg8 - 1][arg4 + 1] * 2 + 2 & 0x7;
						local91 = Static417.method5483(local53, arg1);
						if (Static318.aBooleanArrayArray6[local70][local86]) {
							Static455.anIntArray745[6] = local53.anInt6161;
							Static314.anIntArray518[6] = local91;
							Static252.anIntArray456[6] = arg1.method5830() ? local53.anInt6166 : local53.anInt6162;
							Static229.anIntArray425[6] = local53.anInt6168;
							Static96.anIntArray163[6] = local53.anInt6165;
							Static405.anIntArray661[6] = 64;
						}
					}
				}
			}
			if (arg10 - 1 > arg8) {
				local40 = arg9[arg8 + 1][arg4 + 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass43_4.method1032(local40 - 1);
					if (local53.anInt6161 != -1 && local53.aBoolean400) {
						local70 = arg3[arg8 + 1][arg4 + 1];
						local86 = arg6[arg8 + 1][arg4 + 1] * 2 & 0x7;
						local91 = Static417.method5483(local53, arg1);
						if (Static318.aBooleanArrayArray6[local70][local86]) {
							Static455.anIntArray745[4] = local53.anInt6161;
							Static314.anIntArray518[4] = local91;
							Static252.anIntArray456[4] = arg1.method5830() ? local53.anInt6166 : local53.anInt6162;
							Static229.anIntArray425[4] = local53.anInt6168;
							Static96.anIntArray163[4] = local53.anInt6165;
							Static405.anIntArray661[4] = 128;
						}
					}
				}
			}
		}
		@Pc(542) int local542;
		@Pc(547) int local547;
		@Pc(549) int local549;
		@Pc(510) byte local510;
		if (arg4 > 0) {
			local40 = arg9[arg8][arg4 - 1] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass43_4.method1032(local40 - 1);
				if (local53.anInt6161 != -1) {
					local70 = arg3[arg8][arg4 - 1];
					local510 = arg6[arg8][arg4 - 1];
					if (local53.aBoolean400) {
						local91 = 2;
						local542 = local510 * 2 + 4;
						local547 = Static417.method5483(local53, arg1);
						for (local549 = 0; local549 < 3; local549++) {
							local91 &= 0x7;
							local542 &= 0x7;
							if (Static318.aBooleanArrayArray6[local70][local542] && local53.anInt6165 >= Static96.anIntArray163[local91]) {
								Static455.anIntArray745[local91] = local53.anInt6161;
								Static314.anIntArray518[local91] = local547;
								Static252.anIntArray456[local91] = arg1.method5830() ? local53.anInt6166 : local53.anInt6162;
								Static229.anIntArray425[local91] = local53.anInt6168;
								if (Static96.anIntArray163[local91] == local53.anInt6165) {
									Static405.anIntArray661[local91] |= 0x20;
								} else {
									Static405.anIntArray661[local91] = 32;
								}
								Static96.anIntArray163[local91] = local53.anInt6165;
							}
							local542++;
							local91--;
						}
						if (!local18[--arg0 & 0x3]) {
							arg5[0] = Static440.aBooleanArrayArray8[local70][local510 + 2 & 0x3];
						}
					} else if (!local18[arg0 & 0x3]) {
						arg5[0] = Static287.aBooleanArrayArray5[local70][local510 + 2 & 0x3];
					}
				}
			}
		}
		if (arg7 - 1 > arg4) {
			local40 = arg9[arg8][arg4 + 1] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass43_4.method1032(local40 - 1);
				if (local53.anInt6161 != -1) {
					local70 = arg3[arg8][arg4 + 1];
					local510 = arg6[arg8][arg4 + 1];
					if (local53.aBoolean400) {
						local91 = 4;
						local542 = local510 * 2 + 2;
						local547 = Static417.method5483(local53, arg1);
						for (local549 = 0; local549 < 3; local549++) {
							local91 &= 0x7;
							local542 &= 0x7;
							if (Static318.aBooleanArrayArray6[local70][local542] && local53.anInt6165 >= Static96.anIntArray163[local91]) {
								Static455.anIntArray745[local91] = local53.anInt6161;
								Static314.anIntArray518[local91] = local547;
								Static252.anIntArray456[local91] = arg1.method5830() ? local53.anInt6166 : local53.anInt6162;
								Static229.anIntArray425[local91] = local53.anInt6168;
								if (Static96.anIntArray163[local91] == local53.anInt6165) {
									Static405.anIntArray661[local91] |= 0x10;
								} else {
									Static405.anIntArray661[local91] = 16;
								}
								Static96.anIntArray163[local91] = local53.anInt6165;
							}
							local91++;
							local542--;
						}
						if (!local18[arg0 + 2 & 0x3]) {
							arg5[2] = Static440.aBooleanArrayArray8[local70][local510 & 0x3];
						}
					} else if (!local18[arg0 + 2 & 0x3]) {
						arg5[2] = Static287.aBooleanArrayArray5[local70][local510 & 0x3];
					}
				}
			}
		}
		if (arg8 > 0) {
			local40 = arg9[arg8 - 1][arg4] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass43_4.method1032(local40 - 1);
				if (local53.anInt6161 != -1) {
					local70 = arg3[arg8 - 1][arg4];
					local510 = arg6[arg8 - 1][arg4];
					if (local53.aBoolean400) {
						local91 = 6;
						local542 = local510 * 2 + 4;
						local547 = Static417.method5483(local53, arg1);
						for (local549 = 0; local549 < 3; local549++) {
							local542 &= 0x7;
							local91 &= 0x7;
							if (Static318.aBooleanArrayArray6[local70][local542] && local53.anInt6165 >= Static96.anIntArray163[local91]) {
								Static455.anIntArray745[local91] = local53.anInt6161;
								Static314.anIntArray518[local91] = local547;
								Static252.anIntArray456[local91] = arg1.method5830() ? local53.anInt6166 : local53.anInt6162;
								Static229.anIntArray425[local91] = local53.anInt6168;
								if (local53.anInt6165 == Static96.anIntArray163[local91]) {
									Static405.anIntArray661[local91] |= 0x8;
								} else {
									Static405.anIntArray661[local91] = 8;
								}
								Static96.anIntArray163[local91] = local53.anInt6165;
							}
							local91++;
							local542--;
						}
						if (!local18[arg0 + 3 & 0x3]) {
							arg5[3] = Static440.aBooleanArrayArray8[local70][local510 + 1 & 0x3];
						}
					} else if (!local18[arg0 + 3 & 0x3]) {
						arg5[3] = Static287.aBooleanArrayArray5[local70][local510 + 1 & 0x3];
					}
				}
			}
		}
		if (arg8 < arg10 - 1) {
			local40 = arg9[arg8 + 1][arg4] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass43_4.method1032(local40 - 1);
				if (local53.anInt6161 != -1) {
					local70 = arg3[arg8 + 1][arg4];
					local510 = arg6[arg8 + 1][arg4];
					if (local53.aBoolean400) {
						local91 = 4;
						local542 = local510 * 2 + 6;
						local547 = Static417.method5483(local53, arg1);
						for (local549 = 0; local549 < 3; local549++) {
							local91 &= 0x7;
							local542 &= 0x7;
							if (Static318.aBooleanArrayArray6[local70][local542] && Static96.anIntArray163[local91] <= local53.anInt6165) {
								Static455.anIntArray745[local91] = local53.anInt6161;
								Static314.anIntArray518[local91] = local547;
								Static252.anIntArray456[local91] = arg1.method5830() ? local53.anInt6166 : local53.anInt6162;
								Static229.anIntArray425[local91] = local53.anInt6168;
								if (local53.anInt6165 == Static96.anIntArray163[local91]) {
									Static405.anIntArray661[local91] |= 0x4;
								} else {
									Static405.anIntArray661[local91] = 4;
								}
								Static96.anIntArray163[local91] = local53.anInt6165;
							}
							local542++;
							local91--;
						}
						if (!local18[arg0 + 1 & 0x3]) {
							arg5[1] = Static440.aBooleanArrayArray8[local70][local510 + 3 & 0x3];
						}
					} else if (!local18[arg0 + 1 & 0x3]) {
						arg5[1] = Static287.aBooleanArrayArray5[local70][local510 + 3 & 0x3];
					}
				}
			}
		}
		if (arg11 == null) {
			return;
		}
		local40 = Static417.method5483(arg11, arg1);
		if (!arg11.aBoolean400) {
			return;
		}
		for (@Pc(1231) int local1231 = 0; local1231 < 8; local1231++) {
			@Pc(1242) int local1242 = local1231 - arg0 * 2 & 0x7;
			if (Static318.aBooleanArrayArray6[arg12][local1231] && Static96.anIntArray163[local1242] <= arg11.anInt6165) {
				Static455.anIntArray745[local1242] = arg11.anInt6161;
				Static314.anIntArray518[local1242] = local40;
				Static252.anIntArray456[local1242] = arg1.method5830() ? arg11.anInt6166 : arg11.anInt6162;
				Static229.anIntArray425[local1242] = arg11.anInt6168;
				if (Static96.anIntArray163[local1242] == arg11.anInt6165) {
					Static405.anIntArray661[local1242] |= 0x2;
				} else {
					Static405.anIntArray661[local1242] = 2;
				}
				Static96.anIntArray163[local1242] = arg11.anInt6165;
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIII)V")
	public final void method2431(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt2932; local15++) {
			this.method2439(arg1, arg0, local15);
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!za;[Lclient!sd;[[[IB)V")
	public final void method2432(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class220[] arg1, @OriginalArg(2) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(28) int local28;
		if (!this.aBoolean213) {
			for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt2929; local10++) {
					for (local14 = 0; local14 < this.anInt2924; local14++) {
						if ((Static181.aByteArrayArrayArray15[local6][local10][local14] & 0x1) != 0) {
							local28 = local6;
							if ((Static181.aByteArrayArrayArray15[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg1[local28].method4888(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt2932; local10++) {
			local14 = 0;
			local28 = 0;
			if (!this.aBoolean213) {
				if (Static20.aBoolean30) {
					local14 = 2;
				}
				if (Static138.aBoolean452) {
					local28 = 8;
				}
				if (Static74.anInt1519 != 0) {
					if (local10 == 0 | Static407.aBoolean449) {
						local28 |= 0x10;
					}
					local14 |= 0x1;
				}
			}
			if (Static20.aBoolean30) {
				local28 |= 0x7;
			}
			if (!Static18.aBoolean25) {
				local28 |= 0x20;
			}
			@Pc(149) int[][] local149 = arg2 == null || arg2.length <= local10 ? this.anIntArrayArrayArray3[local10] : arg2[local10];
			Static53.method915(local10, arg0.method5816(this.anInt2929, this.anInt2924, this.anIntArrayArrayArray3[local10], local149, local14, local28));
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!ya;IILclient!ya;Lclient!ya;[[ILclient!za;)V")
	private void method2433(@OriginalArg(0) Class154 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class154 arg2, @OriginalArg(4) Class154 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class50 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray14[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray9[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray11[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray12[arg1];
		for (@Pc(31) int local31 = 0; local31 < this.anInt2929; local31++) {
			@Pc(45) int local45 = this.anInt2929 - 1 > local31 ? local31 + 1 : local31;
			for (@Pc(47) int local47 = 0; local47 < this.anInt2924; local47++) {
				@Pc(65) int local65 = local47 < this.anInt2924 - 1 ? local47 + 1 : local47;
				if (Static197.anInt3927 == -1 || Static28.method367(arg1, Static197.anInt3927, local47, local31)) {
					@Pc(80) boolean local80 = false;
					@Pc(82) boolean local82 = false;
					@Pc(85) boolean[] local85 = new boolean[4];
					@Pc(91) int local91 = local10[local31][local47];
					@Pc(97) int local97 = local15[local31][local47];
					@Pc(105) int local105 = local25[local31][local47] & 0xFF;
					@Pc(113) int local113 = local20[local31][local47] & 0xFF;
					@Pc(121) int local121 = local20[local31][local65] & 0xFF;
					@Pc(129) int local129 = local20[local45][local65] & 0xFF;
					@Pc(137) int local137 = local20[local45][local47] & 0xFF;
					if (local105 != 0 || local113 != 0) {
						@Pc(159) Class219 local159 = local105 == 0 ? null : this.aClass43_4.method1032(local105 - 1);
						@Pc(174) Class198 local174 = local113 == 0 ? null : this.aClass207_4.method4749(local113 - 1);
						if (local91 == 0 && local159 == null) {
							local91 = 12;
						}
						@Pc(182) Class219 local182 = local159;
						if (local159 != null) {
							if (local159.anInt6161 == -1 && local159.anInt6157 == -1) {
								local182 = local159;
								local159 = null;
							} else if (local174 != null && local91 != 0) {
								local82 = local159.aBoolean400;
							}
						}
						@Pc(300) int local300;
						@Pc(330) int local330;
						@Pc(379) int local379;
						@Pc(392) int local392;
						if ((local91 == 0 || local91 == 12) && local31 > 0 && local47 > 0 && this.anInt2929 > local31 && this.anInt2924 > local47) {
							@Pc(260) int local260 = local113 == local20[local45][local47 - 1] ? 1 : -1;
							@Pc(279) int local279 = local113 == local20[local45][local65] ? 1 : -1;
							local300 = local20[local31 - 1][local47 - 1] == local113 ? 1 : -1;
							if (local113 == local20[local31][local47 - 1]) {
								local260++;
								local300++;
							} else {
								local300--;
								local260--;
							}
							local330 = local20[local31 - 1][local65] == local113 ? 1 : -1;
							if (local20[local45][local47] == local113) {
								local279++;
								local260++;
							} else {
								local279--;
								local260--;
							}
							if (local20[local31][local65] == local113) {
								local279++;
								local330++;
							} else {
								local279--;
								local330--;
							}
							if (local113 == local20[local31 - 1][local47]) {
								local300++;
								local330++;
							} else {
								local300--;
								local330--;
							}
							local379 = local300 - local279;
							if (local379 < 0) {
								local379 = -local379;
							}
							local392 = local260 - local330;
							if (local392 < 0) {
								local392 = -local392;
							}
							if (local379 == local392) {
								local379 = arg0.ua(local31, local47) - arg0.ua(local45, local65);
								local392 = arg0.ua(local45, local47) - arg0.ua(local31, local65);
								if (local379 < 0) {
									local379 = -local379;
								}
								if (local392 < 0) {
									local392 = -local392;
								}
							}
							local97 = local392 > local379 ? 1 : 0;
						}
						for (local300 = 0; local300 < 13; local300++) {
							Static96.anIntArray163[local300] = -1;
							Static405.anIntArray661[local300] = 1;
						}
						@Pc(470) boolean[] local470 = local159 != null && local159.aBoolean400 ? Static440.aBooleanArrayArray8[local91] : Static287.aBooleanArrayArray5[local91];
						this.method2429(local97, arg5, local174, local10, local47, local85, local15, this.anInt2924, local31, local25, this.anInt2929, local159, local91);
						@Pc(499) boolean local499 = local159 != null && local159.anInt6157 != local159.anInt6161;
						if (!local499) {
							for (local330 = 0; local330 < 8; local330++) {
								if (Static96.anIntArray163[local330] >= 0 && Static314.anIntArray518[local330] != Static455.anIntArray745[local330]) {
									local499 = true;
									break;
								}
							}
						}
						if (!local470[local97 + 1 & 0x3]) {
							local85[1] = Static97.method1071(local85[1], (Static405.anIntArray661[4] & Static405.anIntArray661[2]) == 0);
						}
						if (!local470[local97 + 3 & 0x3]) {
							local85[3] = Static97.method1071(local85[3], (Static405.anIntArray661[6] & Static405.anIntArray661[0]) == 0);
						}
						if (!local470[--local97 & 0x3]) {
							local85[0] = Static97.method1071(local85[0], (Static405.anIntArray661[2] & Static405.anIntArray661[0]) == 0);
						}
						if (!local470[local97 + 2 & 0x3]) {
							local85[2] = Static97.method1071(local85[2], (Static405.anIntArray661[4] & Static405.anIntArray661[6]) == 0);
						}
						if (!local82 && (local91 == 0 || local91 == 12)) {
							if (local85[0] && !local85[1] && !local85[2] && local85[3]) {
								local97 = 0;
								local91 = local91 == 0 ? 13 : 14;
								local85[0] = local85[3] = false;
							} else if (local85[0] && local85[1] && !local85[2] && !local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local97 = 3;
								local85[0] = local85[1] = false;
							} else if (!local85[0] && local85[1] && local85[2] && !local85[3]) {
								local97 = 2;
								local91 = local91 == 0 ? 13 : 14;
								local85[1] = local85[2] = false;
							} else if (!local85[0] && !local85[1] && local85[2] && local85[3]) {
								local85[2] = local85[3] = false;
								local91 = local91 == 0 ? 13 : 14;
								local97 = 1;
							}
						}
						@Pc(807) boolean local807 = !local82 && !local85[0] && !local85[2] && !local85[1] && !local85[3];
						@Pc(809) int[] local809 = null;
						@Pc(821) int[] local821;
						@Pc(825) int[] local825;
						@Pc(845) int[] local845;
						if (local807) {
							local379 = local174 == null ? 0 : Static106.anIntArray188[local91];
							local845 = Static37.anIntArrayArray4[local91];
							local392 = local159 == null ? 0 : Static372.anIntArray625[local91];
							local825 = Static405.anIntArrayArray65[local91];
							local821 = Static419.anIntArrayArray66[local91];
						} else if (local82) {
							local809 = Static428.anIntArrayArray68[local91];
							local821 = Static373.anIntArrayArray60[local91];
							local825 = Static331.anIntArrayArray55[local91];
							local392 = local159 == null ? 0 : Static361.anIntArray600[local91];
							local379 = local174 == null ? 0 : Static319.anIntArray535[local91];
							local845 = Static36.anIntArrayArray3[local91];
						} else {
							local809 = Static185.anIntArrayArray50[local91];
							local821 = Static8.anIntArrayArray2[local91];
							local379 = local174 == null ? 0 : Static244.anIntArray462[local91];
							local845 = Static120.anIntArrayArray20[local91];
							local825 = Static322.anIntArrayArray54[local91];
							local392 = local159 == null ? 0 : Static308.anIntArray515[local91];
						}
						@Pc(911) int local911 = local392 + local379;
						if (local911 <= 0) {
							Static321.method4391(arg1, local31, local47);
						} else {
							if (local85[0]) {
								local911++;
							}
							if (local85[2]) {
								local911++;
							}
							if (local85[1]) {
								local911++;
							}
							if (local85[3]) {
								local911++;
							}
							@Pc(944) int local944 = 0;
							@Pc(946) int local946 = 0;
							@Pc(950) int local950 = local911 * 3;
							@Pc(957) int[] local957 = local499 ? new int[local950] : null;
							@Pc(960) int[] local960 = new int[local950];
							@Pc(963) int[] local963 = new int[local950];
							@Pc(966) int[] local966 = new int[local950];
							@Pc(969) int[] local969 = new int[local950];
							@Pc(972) int[] local972 = new int[local950];
							@Pc(979) int[] local979 = arg3 == null ? null : new int[local950];
							@Pc(988) int[] local988 = arg3 == null && arg2 == null ? null : new int[local950];
							@Pc(990) int local990 = -1;
							@Pc(992) int local992 = -1;
							@Pc(994) int local994 = 256;
							@Pc(1094) byte local1094;
							@Pc(1044) int local1044;
							@Pc(1046) int local1046;
							@Pc(1283) int local1283;
							@Pc(1289) int local1289;
							@Pc(1298) int local1298;
							@Pc(1303) int local1303;
							@Pc(1315) int local1315;
							@Pc(1308) int local1308;
							@Pc(1319) int local1319;
							@Pc(1376) int local1376;
							@Pc(1383) int local1383;
							if (local159 != null) {
								local990 = local159.anInt6161;
								local992 = arg5.method5830() ? local159.anInt6166 : local159.anInt6162;
								local994 = local159.anInt6168;
								local1044 = Static417.method5483(local159, arg5);
								for (local1046 = 0; local1046 < local392; local1046++) {
									if (local85[-local97 & 0x3] && local809[0] == local944) {
										Static178.anIntArray371[0] = local821[local944];
										Static178.anIntArray371[1] = 1;
										Static178.anIntArray371[2] = local845[local944];
										Static178.anIntArray371[3] = 1;
										Static178.anIntArray371[4] = local825[local944];
										local1094 = 6;
										Static178.anIntArray371[5] = local845[local944];
									} else if (local85[2 - local97 & 0x3] && local809[2] == local944) {
										Static178.anIntArray371[0] = local821[local944];
										Static178.anIntArray371[1] = 5;
										Static178.anIntArray371[2] = local845[local944];
										Static178.anIntArray371[3] = 5;
										Static178.anIntArray371[4] = local825[local944];
										Static178.anIntArray371[5] = local845[local944];
										local1094 = 6;
									} else if (local85[1 - local97 & 0x3] && local809[1] == local944) {
										Static178.anIntArray371[0] = local821[local944];
										Static178.anIntArray371[1] = 3;
										Static178.anIntArray371[2] = local845[local944];
										Static178.anIntArray371[3] = 3;
										Static178.anIntArray371[4] = local825[local944];
										Static178.anIntArray371[5] = local845[local944];
										local1094 = 6;
									} else if (local85[3 - local97 & 0x3] && local944 == local809[3]) {
										Static178.anIntArray371[0] = local821[local944];
										Static178.anIntArray371[1] = 7;
										Static178.anIntArray371[2] = local845[local944];
										Static178.anIntArray371[3] = 7;
										Static178.anIntArray371[4] = local825[local944];
										Static178.anIntArray371[5] = local845[local944];
										local1094 = 6;
									} else {
										Static178.anIntArray371[0] = local821[local944];
										Static178.anIntArray371[1] = local825[local944];
										local1094 = 3;
										Static178.anIntArray371[2] = local845[local944];
									}
									local944++;
									for (local1283 = 0; local1283 < local1094; local1283++) {
										local1289 = Static178.anIntArray371[local1283];
										local1298 = local1289 - local97 * 2 & 0x7;
										local1303 = this.anIntArray292[local1289];
										local1308 = this.anIntArray291[local1289];
										if (local97 == 1) {
											local1315 = local1308;
											local1319 = 128 - local1303;
										} else if (local97 == 2) {
											local1315 = 128 - local1303;
											local1319 = 128 - local1308;
										} else if (local97 == 3) {
											local1319 = local1303;
											local1315 = 128 - local1308;
										} else {
											local1315 = local1303;
											local1319 = local1308;
										}
										local960[local946] = local1315;
										local963[local946] = local1319;
										if (local979 != null && Static318.aBooleanArrayArray6[local91][local1289]) {
											local1376 = (local31 << 7) + local1315;
											local1383 = (local47 << 7) + local1319;
											local979[local946] = arg3.ca(local1376, local1383) - arg0.ca(local1376, local1383);
										}
										if (local988 != null) {
											if (arg3 != null && !Static318.aBooleanArrayArray6[local91][local1289]) {
												local1376 = local1315 + (local31 << 7);
												local1383 = local1319 + (local47 << 7);
												local988[local946] = arg0.ca(local1376, local1383) - arg3.ca(local1376, local1383);
											} else if (arg2 != null && !Static151.aBooleanArrayArray3[local91][local1289]) {
												local1376 = local1315 + (local31 << 7);
												local1383 = local1319 + (local47 << 7);
												local988[local946] = arg2.ca(local1376, local1383) - arg0.ca(local1376, local1383);
											}
										}
										if (local1289 < 8 && local159.anInt6165 < Static96.anIntArray163[local1298]) {
											if (local957 != null) {
												local957[local946] = Static314.anIntArray518[local1298];
											}
											local972[local946] = Static229.anIntArray425[local1298];
											local969[local946] = Static252.anIntArray456[local1298];
											local966[local946] = Static455.anIntArray745[local1298];
										} else {
											if (local957 != null) {
												local957[local946] = local1044;
											}
											local969[local946] = arg5.method5830() ? local159.anInt6166 : local159.anInt6162;
											local972[local946] = local159.anInt6168;
											local966[local946] = local990;
										}
										local946++;
									}
								}
								if (!this.aBoolean213 && arg1 == 0) {
									Static74.method1395(local31, local47, local159.anInt6169, local159.anInt6163 * 8, local159.anInt6170);
								}
								if (local91 != 12 && local159.anInt6161 != -1 && local159.aBoolean399) {
									local80 = true;
								}
							} else if (local807) {
								local944 = Static372.anIntArray625[local91];
							} else if (local82) {
								local944 = Static361.anIntArray600[local91];
							} else {
								local944 = Static308.anIntArray515[local91];
							}
							if (local174 != null) {
								if (local129 == 0) {
									local129 = local113;
								}
								if (local137 == 0) {
									local137 = local113;
								}
								if (local121 == 0) {
									local121 = local113;
								}
								@Pc(1604) Class198 local1604 = this.aClass207_4.method4749(local113 - 1);
								@Pc(1612) Class198 local1612 = this.aClass207_4.method4749(local121 - 1);
								@Pc(1620) Class198 local1620 = this.aClass207_4.method4749(local129 - 1);
								@Pc(1628) Class198 local1628 = this.aClass207_4.method4749(local137 - 1);
								for (local1298 = 0; local1298 < local379; local1298++) {
									if (local85[-local97 & 0x3] && local809[0] == local944) {
										Static178.anIntArray371[0] = local821[local944];
										Static178.anIntArray371[1] = 1;
										Static178.anIntArray371[2] = local845[local944];
										Static178.anIntArray371[3] = 1;
										Static178.anIntArray371[4] = local825[local944];
										local1094 = 6;
										Static178.anIntArray371[5] = local845[local944];
									} else if (local85[2 - local97 & 0x3] && local809[2] == local944) {
										Static178.anIntArray371[0] = local821[local944];
										Static178.anIntArray371[1] = 5;
										Static178.anIntArray371[2] = local845[local944];
										Static178.anIntArray371[3] = 5;
										Static178.anIntArray371[4] = local825[local944];
										local1094 = 6;
										Static178.anIntArray371[5] = local845[local944];
									} else if (local85[1 - local97 & 0x3] && local809[1] == local944) {
										Static178.anIntArray371[0] = local821[local944];
										Static178.anIntArray371[1] = 3;
										Static178.anIntArray371[2] = local845[local944];
										Static178.anIntArray371[3] = 3;
										Static178.anIntArray371[4] = local825[local944];
										local1094 = 6;
										Static178.anIntArray371[5] = local845[local944];
									} else if (local85[3 - local97 & 0x3] && local944 == local809[3]) {
										Static178.anIntArray371[0] = local821[local944];
										Static178.anIntArray371[1] = 7;
										Static178.anIntArray371[2] = local845[local944];
										Static178.anIntArray371[3] = 7;
										Static178.anIntArray371[4] = local825[local944];
										local1094 = 6;
										Static178.anIntArray371[5] = local845[local944];
									} else {
										Static178.anIntArray371[0] = local821[local944];
										Static178.anIntArray371[1] = local825[local944];
										local1094 = 3;
										Static178.anIntArray371[2] = local845[local944];
									}
									local944++;
									for (local1303 = 0; local1303 < local1094; local1303++) {
										local1315 = Static178.anIntArray371[local1303];
										local1308 = local1315 - local97 * 2 & 0x7;
										local1319 = this.anIntArray292[local1315];
										local1383 = this.anIntArray291[local1315];
										@Pc(1901) int local1901;
										if (local97 == 1) {
											local1376 = local1383;
											local1901 = 128 - local1319;
										} else if (local97 == 2) {
											local1901 = 128 - local1383;
											local1376 = 128 - local1319;
										} else if (local97 == 3) {
											local1376 = 128 - local1383;
											local1901 = local1319;
										} else {
											local1901 = local1383;
											local1376 = local1319;
										}
										local960[local946] = local1376;
										local963[local946] = local1901;
										@Pc(1949) int local1949;
										@Pc(1955) int local1955;
										if (local979 != null && Static318.aBooleanArrayArray6[local91][local1315]) {
											local1949 = local1376 + (local31 << 7);
											local1955 = local1901 + (local47 << 7);
											local979[local946] = arg3.ca(local1949, local1955) - arg0.ca(local1949, local1955);
										}
										if (local988 != null) {
											if (arg3 != null && !Static318.aBooleanArrayArray6[local91][local1315]) {
												local1949 = (local31 << 7) + local1376;
												local1955 = local1901 + (local47 << 7);
												local988[local946] = arg0.ca(local1949, local1955) - arg3.ca(local1949, local1955);
											} else if (arg2 != null && !Static151.aBooleanArrayArray3[local91][local1315]) {
												local1949 = (local31 << 7) + local1376;
												local1955 = (local47 << 7) + local1901;
												local988[local946] = arg2.ca(local1949, local1955) - arg0.ca(local1949, local1955);
											}
										}
										if (local1315 < 8 && Static96.anIntArray163[local1308] >= 0) {
											if (local957 != null) {
												local957[local946] = Static314.anIntArray518[local1308];
											}
											local972[local946] = Static229.anIntArray425[local1308];
											local969[local946] = Static252.anIntArray456[local1308];
											local966[local946] = Static455.anIntArray745[local1308];
										} else {
											if (local82 && Static318.aBooleanArrayArray6[local91][local1315]) {
												local969[local946] = local992;
												local972[local946] = local994;
												local966[local946] = local990;
											} else if (local1376 == 0 && local1901 == 0) {
												local966[local946] = arg4[local31][local47];
												local969[local946] = local1604.anInt5555;
												local972[local946] = local1604.anInt5550;
											} else if (local1376 == 0 && local1901 == 128) {
												local966[local946] = arg4[local31][local65];
												local969[local946] = local1612.anInt5555;
												local972[local946] = local1612.anInt5550;
											} else if (local1376 == 128 && local1901 == 128) {
												local966[local946] = arg4[local45][local65];
												local969[local946] = local1620.anInt5555;
												local972[local946] = local1620.anInt5550;
											} else if (local1376 == 128 && local1901 == 0) {
												local966[local946] = arg4[local45][local47];
												local969[local946] = local1628.anInt5555;
												local972[local946] = local1628.anInt5550;
											} else {
												if (local1376 >= 64) {
													if (local1901 < 64) {
														local969[local946] = local1628.anInt5555;
														local972[local946] = local1628.anInt5550;
													} else {
														local969[local946] = local1620.anInt5555;
														local972[local946] = local1620.anInt5550;
													}
												} else if (local1901 >= 64) {
													local969[local946] = local1612.anInt5555;
													local972[local946] = local1612.anInt5550;
												} else {
													local969[local946] = local1604.anInt5555;
													local972[local946] = local1604.anInt5550;
												}
												local1949 = Static322.method4415(arg4[local45][local47], arg4[local31][local47], local1376 << 7 >> 7);
												local1955 = Static322.method4415(arg4[local45][local65], arg4[local31][local65], local1376 << 7 >> 7);
												local966[local946] = Static322.method4415(local1955, local1949, local1901 << 7 >> 7);
											}
											if (local957 != null) {
												local957[local946] = local966[local946];
											}
										}
										local946++;
									}
								}
								if (local91 != 0 && local174.aBoolean363) {
									local80 = true;
								}
							}
							local1044 = arg0.ua(local31, local47);
							local1046 = arg0.ua(local45, local47);
							local1283 = arg0.ua(local45, local65);
							local1289 = arg0.ua(local31, local65);
							if (arg1 > 0) {
								@Pc(2364) boolean local2364 = true;
								if (local113 == 0 && local91 != 0) {
									local2364 = false;
								}
								if (local105 > 0 && local182 != null && !local182.aBoolean398) {
									local2364 = false;
								}
								if (local2364 && local1046 == local1044 && local1044 == local1283 && local1044 == local1289) {
									this.aByteArrayArrayArray13[arg1][local31][local47] = (byte) (this.aByteArrayArrayArray13[arg1][local31][local47] | 0x4);
								}
							}
							local1298 = 0;
							local1303 = 0;
							local1315 = 0;
							if (this.aBoolean213) {
								local1298 = Static457.method6055(local31, local47);
								local1303 = Static142.method2406(local31, local47);
								local1315 = Static453.method6012(local31, local47);
							}
							arg0.pa(local31, local47, local960, local979, local963, local988, local966, local957, local969, local972, local1298, local1303, local1315, local80);
							Static321.method4391(arg1, local31, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZBIIIIILclient!nn;III)V")
	private void method2434(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class10_Sub8 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg4 == 1) {
			arg5 = 1;
		} else if (arg4 == 2) {
			arg5 = 1;
			arg2 = 1;
		} else if (arg4 == 3) {
			arg2 = 1;
		}
		@Pc(62) int local62;
		if (arg3 < 0 || arg3 >= this.anInt2929 || arg8 < 0 || arg8 >= this.anInt2924) {
			while (true) {
				local62 = arg6.method2502();
				if (local62 == 0) {
					return;
				}
				if (local62 == 1) {
					arg6.method2502();
					return;
				}
				if (local62 <= 49) {
					arg6.method2502();
				}
			}
			return;
		}
		if (!this.aBoolean213 && !arg0) {
			Static181.aByteArrayArrayArray15[arg7][arg3][arg8] = 0;
		}
		while (true) {
			local62 = arg6.method2502();
			if (local62 == 0) {
				if (this.aBoolean213) {
					this.anIntArrayArrayArray3[0][arg2 + arg3][arg8 + arg5] = 0;
					return;
				} else if (arg7 == 0) {
					this.anIntArrayArrayArray3[0][arg2 + arg3][arg5 + arg8] = -Static352.method4773(arg1 + 932731, arg9 + 556238) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray3[arg7][arg3 + arg2][arg5 + arg8] = this.anIntArrayArrayArray3[arg7 - 1][arg2 + arg3][arg5 + arg8] - 240;
					return;
				}
			}
			if (local62 == 1) {
				@Pc(188) int local188 = arg6.method2502();
				if (!this.aBoolean213) {
					if (local188 == 1) {
						local188 = 0;
					}
					if (arg7 == 0) {
						this.anIntArrayArrayArray3[0][arg3 + arg2][arg8 + arg5] = -local188 * 8 << 0;
						return;
					}
					this.anIntArrayArrayArray3[arg7][arg2 + arg3][arg5 + arg8] = this.anIntArrayArrayArray3[arg7 - 1][arg2 + arg3][arg8 + arg5] - (local188 * 8 << 0);
					return;
				}
				this.anIntArrayArrayArray3[0][arg3 + arg2][arg5 + arg8] = local188 * 8 << 0;
				return;
			}
			if (local62 <= 49) {
				if (arg0) {
					arg6.method2502();
				} else {
					this.aByteArrayArrayArray12[arg7][arg3][arg8] = arg6.method2460();
					this.aByteArrayArrayArray14[arg7][arg3][arg8] = (byte) ((local62 - 2) / 4);
					this.aByteArrayArrayArray9[arg7][arg3][arg8] = (byte) (arg4 + local62 - 2 & 0x3);
				}
			} else if (local62 <= 81) {
				if (!this.aBoolean213 && !arg0) {
					Static181.aByteArrayArrayArray15[arg7][arg3][arg8] = (byte) (local62 - 49);
				}
			} else if (!arg0) {
				this.aByteArrayArrayArray11[arg7][arg3][arg8] = (byte) (local62 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([[IBI)V")
	public final void method2435(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray3[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2929 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2924 + 1; local22++) {
				local10[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!nn;IIIII[Lclient!sd;III)V")
	public final void method2436(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class220[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(57) int local57;
		if (!this.aBoolean213) {
			@Pc(24) Class220 local24 = arg5[arg7];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(45) int local45 = arg4 + Static420.method5522(local26 & 0x7, local30 & 0x7, arg2);
					local57 = Static314.method4328(local30 & 0x7, arg2, local26 & 0x7) + arg1;
					if (local45 > 0 && local45 < this.anInt2929 - 1 && local57 > 0 && this.anInt2924 - 1 > local57) {
						local24.method4875(local57, local45);
					}
				}
			}
		}
		@Pc(104) int local104 = (arg8 & 0xFFFFFFF8) << 3;
		local26 = (arg3 & 0x1FFFFFF8) << 3;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		if (arg2 == 1) {
			local114 = 1;
		} else if (arg2 == 2) {
			local112 = 1;
			local114 = 1;
		} else if (arg2 == 3) {
			local112 = 1;
		}
		for (local57 = 0; local57 < this.anInt2932; local57++) {
			for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
				for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
					if (arg6 == local57 && local145 >= local11 && local11 + 8 >= local145 && local17 <= local149 && local17 + 8 >= local149) {
						@Pc(225) int local225;
						@Pc(215) int local215;
						if (local145 == local11 + 8 || local149 == local17 + 8) {
							if (arg2 == 0) {
								local215 = local149 + arg1 - local17;
								local225 = arg4 + local145 - local11;
							} else if (arg2 == 1) {
								local215 = arg1 + local11 + 8 - local145;
								local225 = arg4 + local149 - local17;
							} else if (arg2 == 2) {
								local215 = local17 + arg1 + 8 - local149;
								local225 = local11 + arg4 + 8 - local145;
							} else {
								local225 = local17 + arg4 + 8 - local149;
								local215 = local145 + arg1 - local11;
							}
							this.method2434(true, local104 + local145, 0, local225, 0, 0, arg0, arg7, local215, local26 + local149);
						} else {
							local225 = Static420.method5522(local145 & 0x7, local149 & 0x7, arg2) + arg4;
							local215 = Static314.method4328(local149 & 0x7, arg2, local145 & 0x7) + arg1;
							this.method2434(false, local145 + local104, local112, local225, arg2, local114, arg0, arg7, local215, local26 + local149);
							if (local145 == 63 || local149 == 63) {
								@Pc(357) int local357 = local145 == 63 ? 64 : local145;
								@Pc(364) int local364 = local149 == 63 ? 64 : local149;
								@Pc(390) int local390;
								@Pc(381) int local381;
								if (arg2 == 0) {
									local390 = local357 + arg4 - local11;
									local381 = local364 + arg1 - local17;
								} else if (arg2 == 1) {
									local381 = arg1 + local11 + 8 - local357;
									local390 = arg4 + local364 - local17;
								} else if (arg2 == 2) {
									local381 = local17 + arg1 + 8 - local364;
									local390 = local11 + arg4 + 8 - local357;
								} else {
									local381 = arg1 + local357 - local11;
									local390 = arg4 + local17 + 8 - local364;
								}
								if (local390 >= 0 && this.anInt2929 > local390 && local381 >= 0 && this.anInt2924 > local381) {
									this.anIntArrayArrayArray3[arg7][local390][local381] = this.anIntArrayArrayArray3[arg7][local112 + local225][local215 + local114];
								}
							}
						}
					} else {
						this.method2434(false, 0, 0, -1, 0, 0, arg0, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!ya;Lclient!za;Lclient!ya;B)V")
	public final void method2437(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) Class154 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt2929][this.anInt2924];
		if (Static345.anIntArray567 == null || Static345.anIntArray567.length != this.anInt2924) {
			Static53.anIntArray80 = new int[this.anInt2924];
			Static179.anIntArray373 = new int[this.anInt2924];
			Static370.anIntArray618 = new int[this.anInt2924];
			Static71.anIntArray88 = new int[this.anInt2924];
			Static345.anIntArray567 = new int[this.anInt2924];
		}
		@Pc(55) int local55;
		for (@Pc(51) int local51 = 0; local51 < this.anInt2932; local51++) {
			for (local55 = 0; local55 < this.anInt2924; local55++) {
				Static345.anIntArray567[local55] = 0;
				Static71.anIntArray88[local55] = 0;
				Static370.anIntArray618[local55] = 0;
				Static179.anIntArray373[local55] = 0;
				Static53.anIntArray80[local55] = 0;
			}
			for (@Pc(88) int local88 = -5; local88 < this.anInt2929; local88++) {
				@Pc(98) int local98;
				@Pc(113) int local113;
				@Pc(184) int local184;
				for (@Pc(92) int local92 = 0; local92 < this.anInt2924; local92++) {
					local98 = local88 + 5;
					@Pc(161) int local161;
					if (local98 < this.anInt2929) {
						local113 = this.aByteArrayArrayArray11[local51][local98][local92] & 0xFF;
						if (local113 > 0) {
							@Pc(125) Class198 local125 = this.aClass207_4.method4749(local113 - 1);
							Static345.anIntArray567[local92] += local125.anInt5545;
							Static71.anIntArray88[local92] += local125.anInt5547;
							Static370.anIntArray618[local92] += local125.anInt5554;
							Static179.anIntArray373[local92] += local125.anInt5552;
							local161 = Static53.anIntArray80[local92]++;
						}
					}
					local113 = local88 - 5;
					if (local113 >= 0) {
						local184 = this.aByteArrayArrayArray11[local51][local113][local92] & 0xFF;
						if (local184 > 0) {
							@Pc(194) Class198 local194 = this.aClass207_4.method4749(local184 - 1);
							Static345.anIntArray567[local92] -= local194.anInt5545;
							Static71.anIntArray88[local92] -= local194.anInt5547;
							Static370.anIntArray618[local92] -= local194.anInt5554;
							Static179.anIntArray373[local92] -= local194.anInt5552;
							local161 = Static53.anIntArray80[local92]--;
						}
					}
				}
				if (local88 >= 0) {
					local98 = 0;
					local113 = 0;
					local184 = 0;
					@Pc(248) int local248 = 0;
					@Pc(250) int local250 = 0;
					for (@Pc(252) int local252 = -5; local252 < this.anInt2924; local252++) {
						@Pc(258) int local258 = local252 + 5;
						if (local258 < this.anInt2924) {
							local248 += Static179.anIntArray373[local258];
							local98 += Static345.anIntArray567[local258];
							local113 += Static71.anIntArray88[local258];
							local250 += Static53.anIntArray80[local258];
							local184 += Static370.anIntArray618[local258];
						}
						@Pc(300) int local300 = local252 - 5;
						if (local300 >= 0) {
							local98 -= Static345.anIntArray567[local300];
							local250 -= Static53.anIntArray80[local300];
							local184 -= Static370.anIntArray618[local300];
							local248 -= Static179.anIntArray373[local300];
							local113 -= Static71.anIntArray88[local300];
						}
						if (local252 >= 0 && local248 > 0 && local250 > 0) {
							local11[local88][local252] = Static6.method48(local113 / local250, local98 * 256 / local248, local184 / local250);
						}
					}
				}
			}
			if (Static443.aBoolean490) {
				this.method2433(Static332.aClass154Array3[local51], local51, local51 == 0 ? arg2 : null, local51 == 0 ? arg0 : null, local11, arg1);
			} else {
				this.method2438(local51 == 0 ? arg0 : null, local11, Static332.aClass154Array3[local51], local51, local51 == 0 ? arg2 : null, arg1);
			}
			this.aByteArrayArrayArray11[local51] = null;
			this.aByteArrayArrayArray12[local51] = null;
			this.aByteArrayArrayArray14[local51] = null;
			this.aByteArrayArrayArray9[local51] = null;
		}
		if (!this.aBoolean213) {
			if (Static74.anInt1519 != 0) {
				Static420.method5521();
			}
			if (Static20.aBoolean30) {
				Static10.method117();
			}
		}
		for (local55 = 0; local55 < this.anInt2932; local55++) {
			Static332.aClass154Array3[local55].aa();
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!ya;[[ILclient!ya;ILclient!ya;ILclient!za;)V")
	private void method2438(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class154 arg4, @OriginalArg(6) Class50 arg5) {
		for (@Pc(22) int local22 = 0; local22 < this.anInt2929; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt2924; local26++) {
				if (Static197.anInt3927 == -1 || Static28.method367(arg3, Static197.anInt3927, local26, local22)) {
					@Pc(50) byte local50 = this.aByteArrayArrayArray14[arg3][local22][local26];
					@Pc(59) byte local59 = this.aByteArrayArrayArray9[arg3][local22][local26];
					@Pc(70) int local70 = this.aByteArrayArrayArray12[arg3][local22][local26] & 0xFF;
					@Pc(81) int local81 = this.aByteArrayArrayArray11[arg3][local22][local26] & 0xFF;
					@Pc(96) Class219 local96 = local70 == 0 ? null : this.aClass43_4.method1032(local70 - 1);
					@Pc(108) Class198 local108 = local81 == 0 ? null : this.aClass207_4.method4749(local81 - 1);
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					if (local50 != 0) {
						local112 = local96 == null ? 0 : Static372.anIntArray625[local50];
						local110 = local108 == null ? 0 : Static106.anIntArray188[local50];
					} else if (local96 != null) {
						local112 = Static372.anIntArray625[local50];
					} else if (local108 != null) {
						local110 = Static372.anIntArray625[local50];
					}
					@Pc(150) int local150 = local112 + local110;
					@Pc(152) int local152 = 0;
					if (local150 != 0) {
						@Pc(160) int[] local160 = new int[local150];
						@Pc(163) int[] local163 = new int[local150];
						@Pc(166) int[] local166 = new int[local150];
						@Pc(169) int[] local169 = new int[local150];
						@Pc(171) boolean local171 = false;
						@Pc(195) int local195;
						@Pc(201) int local201;
						if (local96 == null || local96.anInt6161 == -1 && local96.anInt6157 == -1 && local96.anInt6166 == -1) {
							for (local195 = 0; local195 < local112; local195++) {
								local160[local152] = -1;
								local152++;
							}
						} else {
							local195 = arg5.method5830() ? local96.anInt6166 : local96.anInt6162;
							if (Static300.aBoolean351) {
								local195 = -1;
							}
							for (local201 = 0; local201 < local112; local201++) {
								local166[local152] = local195;
								local169[local152] = local96.anInt6168;
								if (local96.anInt6161 == -1) {
									local160[local152] = -1;
								} else {
									local160[local152] = local96.anInt6161;
								}
								if (local96.anInt6157 == -1) {
									local163[local152] = -1;
								} else {
									local171 = true;
									local163[local152] = local96.anInt6157;
								}
								local152++;
							}
							if (!this.aBoolean213 && arg3 == 0) {
								Static74.method1395(local22, local26, local96.anInt6169, local96.anInt6163 * 8, local96.anInt6170);
							}
						}
						if (!local171) {
							local163 = null;
						}
						if (local108 == null) {
							for (local195 = 0; local195 < local110; local195++) {
								local160[local152] = -1;
								local152++;
							}
						} else {
							local195 = local108.anInt5555;
							if (Static300.aBoolean351) {
								local195 = -1;
							}
							for (local201 = 0; local201 < local110; local201++) {
								local166[local152] = local195;
								local169[local152] = local108.anInt5550;
								local160[local152] = arg1[local22][local26];
								if (local163 != null) {
									local163[local152] = -1;
								}
								local152++;
							}
						}
						local195 = this.anIntArray292.length;
						@Pc(360) int[] local360 = new int[local195];
						@Pc(363) int[] local363 = new int[local195];
						@Pc(370) int[] local370 = arg0 == null ? null : new int[local195];
						@Pc(379) int[] local379 = arg0 == null && arg4 == null ? null : new int[local195];
						@Pc(388) int local388;
						@Pc(393) int local393;
						@Pc(473) int local473;
						@Pc(479) int local479;
						for (@Pc(381) int local381 = 0; local381 < local195; local381++) {
							local388 = this.anIntArray292[local381];
							local393 = this.anIntArray291[local381];
							if (local59 == 0) {
								local360[local381] = local388;
								local363[local381] = local393;
							} else if (local59 == 1) {
								local360[local381] = local393;
								local363[local381] = 128 - local388;
							} else if (local59 == 2) {
								local360[local381] = 128 - local388;
								local363[local381] = 128 - local393;
							} else if (local59 == 3) {
								local360[local381] = 128 - local393;
								local363[local381] = local388;
							}
							if (local370 != null && Static318.aBooleanArrayArray6[local50][local381]) {
								local473 = (local22 << 7) + local388;
								local479 = local388 + (local26 << 7);
								local370[local381] = arg0.ca(local473, local479) - arg2.ca(local473, local479);
							}
							if (local379 != null) {
								if (arg0 != null && !Static318.aBooleanArrayArray6[local50][local381]) {
									local473 = local388 + (local22 << 7);
									local479 = (local26 << 7) + local388;
									local379[local381] = arg2.ca(local473, local479) - arg0.ca(local473, local479);
								} else if (arg4 != null && !Static151.aBooleanArrayArray3[local50][local381]) {
									local473 = local388 + (local22 << 7);
									local479 = local388 + (local26 << 7);
									local379[local381] = arg4.ca(local473, local479) - arg2.ca(local473, local479);
								}
							}
						}
						local388 = arg2.ua(local22, local26);
						local393 = arg2.ua(local22 + 1, local26);
						local473 = arg2.ua(local22 + 1, local26 + 1);
						local479 = arg2.ua(local22, local26 + 1);
						if (arg3 > 0) {
							@Pc(600) boolean local600 = true;
							if (local81 == 0 && local50 != 0) {
								local600 = false;
							}
							if (local70 > 0 && local96 != null && !local96.aBoolean398) {
								local600 = false;
							}
							if (local600 && local388 == local393 && local388 == local473 && local388 == local479) {
								this.aByteArrayArrayArray13[arg3][local22][local26] = (byte) (this.aByteArrayArrayArray13[arg3][local22][local26] | 0x4);
							}
						}
						@Pc(653) int local653 = 0;
						@Pc(655) int local655 = 0;
						@Pc(657) int local657 = 0;
						if (this.aBoolean213) {
							local653 = Static457.method6055(local22, local26);
							local655 = Static142.method2406(local22, local26);
							local657 = Static453.method6012(local22, local26);
						}
						arg2.method6080(local22, local26, local360, local370, local363, local379, Static419.anIntArrayArray66[local50], Static405.anIntArrayArray65[local50], Static37.anIntArrayArray4[local50], local160, local163, local166, local169, local653, local655, local657);
						Static321.method4391(arg3, local22, local26);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIII)V")
	private void method2439(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(15) int local15;
		for (@Pc(11) int local11 = arg0; local11 < arg0 + 64; local11++) {
			for (local15 = arg1; local15 < arg1 + 64; local15++) {
				if (local15 >= 0 && this.anInt2929 > local15 && local11 >= 0 && local11 < this.anInt2924) {
					this.anIntArrayArrayArray3[arg2][local15][local11] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray3[arg2 - 1][local15][local11] - 240;
				}
			}
		}
		if (arg1 > 0 && this.anInt2929 > arg1) {
			for (local15 = arg0 + 1; local15 < arg0 + 64; local15++) {
				if (local15 >= 0 && this.anInt2924 > local15) {
					this.anIntArrayArrayArray3[arg2][arg1][local15] = this.anIntArrayArrayArray3[arg2][arg1 - 1][local15];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt2924) {
			for (local15 = arg1 + 1; local15 < arg1 + 64; local15++) {
				if (local15 >= 0 && this.anInt2929 > local15) {
					this.anIntArrayArrayArray3[arg2][local15][arg0] = this.anIntArrayArrayArray3[arg2][local15][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || arg1 >= this.anInt2929 || this.anInt2924 <= arg0) {
			return;
		}
		if (arg2 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray3[arg2][arg1 - 1][arg0] != this.anIntArrayArrayArray3[arg2 - 1][arg1 - 1][arg0]) {
				this.anIntArrayArrayArray3[arg2][arg1][arg0] = this.anIntArrayArrayArray3[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray3[arg2][arg1][arg0 - 1] != this.anIntArrayArrayArray3[arg2 - 1][arg1][arg0 - 1]) {
				this.anIntArrayArrayArray3[arg2][arg1][arg0] = this.anIntArrayArrayArray3[arg2][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray3[arg2 - 1][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray3[arg2][arg1 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray3[arg2][arg1][arg0] = this.anIntArrayArrayArray3[arg2][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray3[arg2][arg1 - 1][arg0] != 0) {
			this.anIntArrayArrayArray3[arg2][arg1][arg0] = this.anIntArrayArrayArray3[arg2][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray3[arg2][arg1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray3[arg2][arg1][arg0] = this.anIntArrayArrayArray3[arg2][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray3[arg2][arg1 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray3[arg2][arg1][arg0] = this.anIntArrayArrayArray3[arg2][arg1 - 1][arg0 - 1];
			return;
		}
	}
}
