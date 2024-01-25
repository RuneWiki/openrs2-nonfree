import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public class Class46 {

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "[I")
	private final int[] anIntArray86 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "[I")
	private final int[] anIntArray87 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "Lclient!sv;")
	private final Class233 aClass233_2;

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
	protected final int anInt1032;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "Lclient!mg;")
	private final Class155 aClass155_2;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "I")
	protected final int anInt1029;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "Z")
	public final boolean aBoolean64;

	@OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
	public final int anInt1034;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!gp", name = "u", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!gp", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!gp", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIZLclient!mg;Lclient!sv;)V")
	protected Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class155 arg4, @OriginalArg(5) Class233 arg5) {
		this.aClass233_2 = arg5;
		this.anInt1032 = arg2;
		this.aClass155_2 = arg4;
		this.anInt1029 = arg1;
		this.aBoolean64 = arg3;
		this.anInt1034 = arg0;
		this.anIntArrayArrayArray3 = new int[this.anInt1034][this.anInt1029 + 1][this.anInt1032 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt1034][this.anInt1029 + 1][this.anInt1032 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt1034][this.anInt1029][this.anInt1032];
		this.aByteArrayArrayArray9 = new byte[this.anInt1034][this.anInt1029][this.anInt1032];
		this.aByteArrayArrayArray11 = new byte[this.anInt1034][this.anInt1029][this.anInt1032];
		this.aByteArrayArrayArray8 = new byte[this.anInt1034][this.anInt1029][this.anInt1032];
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IZIILclient!gk;IIIIII)V")
	private void method792(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class7_Sub14 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg2 == 1) {
			arg6 = 1;
		} else if (arg2 == 2) {
			arg0 = 1;
			arg6 = 1;
		} else if (arg2 == 3) {
			arg0 = 1;
		}
		@Pc(51) int local51;
		if (arg5 < 0 || arg5 >= this.anInt1029 || arg7 < 0 || this.anInt1032 <= arg7) {
			while (true) {
				local51 = arg4.method3981();
				if (local51 == 0) {
					break;
				}
				if (local51 == 1) {
					arg4.method3981();
					break;
				}
				if (local51 <= 49) {
					arg4.method3981();
				}
			}
			return;
		}
		if (!this.aBoolean64 && !arg1) {
			Static347.aByteArrayArrayArray16[arg8][arg5][arg7] = 0;
		}
		while (true) {
			local51 = arg4.method3981();
			if (local51 == 0) {
				if (this.aBoolean64) {
					this.anIntArrayArrayArray3[0][arg0 + arg5][arg6 + arg7] = 0;
				} else if (arg8 == 0) {
					this.anIntArrayArrayArray3[0][arg0 + arg5][arg6 + arg7] = -Static220.method3099(arg9 + 556238, 932731 - -arg3) * 8 << 0;
				} else {
					this.anIntArrayArrayArray3[arg8][arg0 + arg5][arg7 + arg6] = this.anIntArrayArrayArray3[arg8 - 1][arg5 + arg0][arg6 + arg7] - 240;
				}
				break;
			}
			if (local51 == 1) {
				@Pc(192) int local192 = arg4.method3981();
				if (this.aBoolean64) {
					this.anIntArrayArrayArray3[0][arg0 + arg5][arg7 + arg6] = local192 * 8 << 0;
				} else {
					if (local192 == 1) {
						local192 = 0;
					}
					if (arg8 == 0) {
						this.anIntArrayArrayArray3[0][arg0 + arg5][arg7 + arg6] = -local192 * 8 << 0;
					} else {
						this.anIntArrayArrayArray3[arg8][arg0 + arg5][arg6 + arg7] = this.anIntArrayArrayArray3[arg8 - 1][arg0 + arg5][arg7 + arg6] - (local192 * 8 << 0);
					}
				}
				break;
			}
			if (local51 <= 49) {
				if (arg1) {
					arg4.method3981();
				} else {
					this.aByteArrayArrayArray8[arg8][arg5][arg7] = arg4.method3930();
					this.aByteArrayArrayArray9[arg8][arg5][arg7] = (byte) ((local51 - 2) / 4);
					this.aByteArrayArrayArray11[arg8][arg5][arg7] = (byte) (arg2 + local51 - 2 & 0x3);
				}
			} else if (local51 <= 81) {
				if (!this.aBoolean64 && !arg1) {
					Static347.aByteArrayArrayArray16[arg8][arg5][arg7] = (byte) (local51 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray12[arg8][arg5][arg7] = (byte) (local51 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIII)V")
	public final void method794(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1034; local7++) {
			this.method799(local7, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "([[[I[Lclient!ep;Lclient!ya;I)V")
	public final void method795(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class70[] arg1, @OriginalArg(2) Class51 arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean64) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt1029; local14++) {
					for (local18 = 0; local18 < this.anInt1032; local18++) {
						if ((Static347.aByteArrayArrayArray16[local10][local14][local18] & 0x1) != 0) {
							@Pc(35) int local35 = local10;
							if ((Static347.aByteArrayArrayArray16[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg1[local35].method1701(local14, local18);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt1034; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean64) {
				if (Static410.aBoolean421) {
					local18 = 8;
				}
				if (Static34.aBoolean25) {
					local14 = 2;
				}
				if (Static374.anInt6086 != 0) {
					if (local10 == 0 | Static333.aBoolean201) {
						local18 |= 0x10;
					}
					local14 |= 0x1;
				}
			}
			if (Static34.aBoolean25) {
				local18 |= 0x7;
			}
			if (!Static73.aBoolean87) {
				local18 |= 0x20;
			}
			@Pc(148) int[][] local148 = arg0 == null || local10 >= arg0.length ? this.anIntArrayArrayArray3[local10] : arg0[local10];
			Static22.method3911(local10, arg2.method5288(this.anInt1029, this.anInt1032, this.anIntArrayArrayArray3[local10], local148, local14, local18));
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[Lclient!ep;BIILclient!gk;I)V")
	public final void method796(@OriginalArg(0) int arg0, @OriginalArg(1) Class70[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class7_Sub14 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(29) int local29;
		if (!this.aBoolean64) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class70 local16 = arg1[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local29 = arg0 + local18;
						@Pc(33) int local33 = local22 + arg5;
						if (local29 >= 0 && this.anInt1029 > local29 && local33 >= 0 && local33 < this.anInt1032) {
							local16.method1693(local33, local29);
						}
					}
				}
			}
		}
		local10 = arg3 + arg0;
		@Pc(85) int local85 = arg2 + arg5;
		for (local18 = 0; local18 < this.anInt1034; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local29 = 0; local29 < 64; local29++) {
					this.method792(0, false, 0, local22 + local10, arg4, local22 + arg0, 0, arg5 + local29, local18, local85 + local29);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIILclient!gk;III[Lclient!ep;)V")
	public final void method797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class7_Sub14 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class70[] arg8) {
		@Pc(11) int local11 = (arg7 & 0x7) * 8;
		@Pc(20) int local20;
		if (!this.aBoolean64) {
			@Pc(18) Class70 local18 = arg8[arg0];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = arg6 + Static77.method1378(arg1, local20 & 0x7, local24 & 0x7);
					@Pc(51) int local51 = arg2 + Static48.method618(local20 & 0x7, arg1, local24 & 0x7);
					if (local38 > 0 && this.anInt1029 - 1 > local38 && local51 > 0 && this.anInt1032 - 1 > local51) {
						local18.method1693(local51, local38);
					}
				}
			}
		}
		@Pc(96) int local96 = (arg3 & 0x7) * 8;
		@Pc(102) int local102 = (arg7 & 0xFFFFFFF8) << 3;
		local20 = (arg3 & 0x1FFFFFF8) << 3;
		@Pc(110) byte local110 = 0;
		@Pc(118) byte local118 = 0;
		if (arg1 == 1) {
			local118 = 1;
		} else if (arg1 == 2) {
			local118 = 1;
			local110 = 1;
		} else if (arg1 == 3) {
			local110 = 1;
		}
		for (@Pc(143) int local143 = 0; local143 < this.anInt1034; local143++) {
			for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
				for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
					if (arg5 == local143 && local11 <= local147 && local147 <= local11 + 8 && local151 >= local96 && local151 <= local96 + 8) {
						@Pc(224) int local224;
						@Pc(217) int local217;
						if (local11 + 8 == local147 || local151 == local96 + 8) {
							if (arg1 == 0) {
								local217 = arg2 + local151 - local96;
								local224 = arg6 + local147 - local11;
							} else if (arg1 == 1) {
								local224 = arg6 + local151 - local96;
								local217 = arg2 + local11 + 8 - local147;
							} else if (arg1 == 2) {
								local224 = arg6 + local11 + 8 - local147;
								local217 = arg2 + local96 + 8 - local151;
							} else {
								local217 = arg2 + local147 - local11;
								local224 = local96 + arg6 + 8 - local151;
							}
							this.method792(0, true, 0, local147 + local102, arg4, local224, 0, local217, arg0, local20 + local151);
						} else {
							local224 = arg6 + Static77.method1378(arg1, local147 & 0x7, local151 & 0x7);
							local217 = Static48.method618(local147 & 0x7, arg1, local151 & 0x7) + arg2;
							this.method792(local110, false, arg1, local147 + local102, arg4, local224, local118, local217, arg0, local20 + local151);
							if (local147 == 63 || local151 == 63) {
								@Pc(364) int local364 = local147 == 63 ? 64 : local147;
								@Pc(371) int local371 = local151 == 63 ? 64 : local151;
								@Pc(379) int local379;
								@Pc(386) int local386;
								if (arg1 == 0) {
									local379 = arg6 + local364 - local11;
									local386 = arg2 + local371 - local96;
								} else if (arg1 == 1) {
									local379 = local371 + arg6 - local96;
									local386 = local11 + arg2 + 8 - local364;
								} else if (arg1 == 2) {
									local379 = local11 + arg6 + 8 - local364;
									local386 = arg2 + local96 + 8 - local371;
								} else {
									local379 = local96 + arg6 + 8 - local371;
									local386 = local364 + arg2 - local11;
								}
								if (local379 >= 0 && this.anInt1029 > local379 && local386 >= 0 && this.anInt1032 > local386) {
									this.anIntArrayArrayArray3[arg0][local379][local386] = this.anIntArrayArrayArray3[arg0][local224 + local110][local217 + local118];
								}
							}
						}
					} else {
						this.method792(0, false, 0, 0, arg4, -1, 0, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIII)V")
	private void method799(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + 64; local3++) {
			for (local7 = arg1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && local7 < this.anInt1029 && local3 >= 0 && local3 < this.anInt1032) {
					this.anIntArrayArrayArray3[arg0][local7][local3] = arg0 > 0 ? this.anIntArrayArrayArray3[arg0 - 1][local7][local3] - 240 : 0;
				}
			}
		}
		if (arg1 > 0 && this.anInt1029 > arg1) {
			for (local7 = arg2 + 1; local7 < arg2 + 64; local7++) {
				if (local7 >= 0 && local7 < this.anInt1032) {
					this.anIntArrayArrayArray3[arg0][arg1][local7] = this.anIntArrayArrayArray3[arg0][arg1 - 1][local7];
				}
			}
		}
		if (arg2 > 0 && this.anInt1032 > arg2) {
			for (local7 = arg1 + 1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && local7 < this.anInt1029) {
					this.anIntArrayArrayArray3[arg0][local7][arg2] = this.anIntArrayArrayArray3[arg0][local7][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || this.anInt1029 <= arg1 || this.anInt1032 <= arg2) {
			return;
		}
		if (arg0 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray3[arg0 - 1][arg1 - 1][arg2] != this.anIntArrayArrayArray3[arg0][arg1 - 1][arg2]) {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = this.anIntArrayArrayArray3[arg0][arg1 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray3[arg0 - 1][arg1][arg2 - 1] != this.anIntArrayArrayArray3[arg0][arg1][arg2 - 1]) {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = this.anIntArrayArrayArray3[arg0][arg1][arg2 - 1];
				return;
			}
			if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 - 1] != this.anIntArrayArrayArray3[arg0 - 1][arg1 - 1][arg2 - 1]) {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = this.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray3[arg0][arg1 - 1][arg2] != 0) {
			this.anIntArrayArrayArray3[arg0][arg1][arg2] = this.anIntArrayArrayArray3[arg0][arg1 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray3[arg0][arg1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray3[arg0][arg1][arg2] = this.anIntArrayArrayArray3[arg0][arg1][arg2 - 1];
			return;
		}
		if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray3[arg0][arg1][arg2] = this.anIntArrayArrayArray3[arg0][arg1 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ut;III[[BB[Z[[BLclient!km;ILclient!ya;[[BII)V")
	private void method801(@OriginalArg(0) Class251 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) Class135 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class51 arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(27) boolean[] local27 = arg0 != null && arg0.aBoolean431 ? Static262.aBooleanArrayArray21[arg1] : Static420.aBooleanArrayArray17[arg1];
		@Pc(43) int local43;
		@Pc(53) Class251 local53;
		@Pc(70) byte local70;
		@Pc(86) int local86;
		@Pc(91) int local91;
		if (arg11 > 0) {
			if (arg2 > 0) {
				local43 = arg10[arg2 - 1][arg11 - 1] & 0xFF;
				if (local43 > 0) {
					local53 = this.aClass155_2.method3348(local43 - 1);
					if (local53.anInt6603 != -1 && local53.aBoolean431) {
						local70 = arg4[arg2 - 1][arg11 - 1];
						local86 = arg6[arg2 - 1][arg11 - 1] * 2 + 4 & 0x7;
						local91 = Static207.method2977(arg9, local53);
						if (Static207.aBooleanArrayArray9[local70][local86]) {
							Static433.anIntArray607[0] = local53.anInt6603;
							Static320.anIntArray475[0] = local91;
							Static261.anIntArray408[0] = arg9.method5316() ? local53.anInt6608 : local53.anInt6602;
							Static195.anIntArray313[0] = local53.anInt6600;
							Static38.anIntArray61[0] = local53.anInt6599;
							Static80.anIntArray109[0] = 256;
						}
					}
				}
			}
			if (arg3 - 1 > arg2) {
				local43 = arg10[arg2 + 1][arg11 - 1] & 0xFF;
				if (local43 > 0) {
					local53 = this.aClass155_2.method3348(local43 - 1);
					if (local53.anInt6603 != -1 && local53.aBoolean431) {
						local70 = arg4[arg2 + 1][arg11 - 1];
						local86 = arg6[arg2 + 1][arg11 - 1] * 2 + 6 & 0x7;
						local91 = Static207.method2977(arg9, local53);
						if (Static207.aBooleanArrayArray9[local70][local86]) {
							Static433.anIntArray607[2] = local53.anInt6603;
							Static320.anIntArray475[2] = local91;
							Static261.anIntArray408[2] = arg9.method5316() ? local53.anInt6608 : local53.anInt6602;
							Static195.anIntArray313[2] = local53.anInt6600;
							Static38.anIntArray61[2] = local53.anInt6599;
							Static80.anIntArray109[2] = 512;
						}
					}
				}
			}
		}
		if (arg11 < arg12 - 1) {
			if (arg2 > 0) {
				local43 = arg10[arg2 - 1][arg11 + 1] & 0xFF;
				if (local43 > 0) {
					local53 = this.aClass155_2.method3348(local43 - 1);
					if (local53.anInt6603 != -1 && local53.aBoolean431) {
						local70 = arg4[arg2 - 1][arg11 + 1];
						local86 = arg6[arg2 - 1][arg11 + 1] * 2 + 2 & 0x7;
						local91 = Static207.method2977(arg9, local53);
						if (Static207.aBooleanArrayArray9[local70][local86]) {
							Static433.anIntArray607[6] = local53.anInt6603;
							Static320.anIntArray475[6] = local91;
							Static261.anIntArray408[6] = arg9.method5316() ? local53.anInt6608 : local53.anInt6602;
							Static195.anIntArray313[6] = local53.anInt6600;
							Static38.anIntArray61[6] = local53.anInt6599;
							Static80.anIntArray109[6] = 64;
						}
					}
				}
			}
			if (arg3 - 1 > arg2) {
				local43 = arg10[arg2 + 1][arg11 + 1] & 0xFF;
				if (local43 > 0) {
					local53 = this.aClass155_2.method3348(local43 - 1);
					if (local53.anInt6603 != -1 && local53.aBoolean431) {
						local70 = arg4[arg2 + 1][arg11 + 1];
						local86 = --(arg6[arg2 + 1][arg11 + 1] * 2) & 0x7;
						local91 = Static207.method2977(arg9, local53);
						if (Static207.aBooleanArrayArray9[local70][local86]) {
							Static433.anIntArray607[4] = local53.anInt6603;
							Static320.anIntArray475[4] = local91;
							Static261.anIntArray408[4] = arg9.method5316() ? local53.anInt6608 : local53.anInt6602;
							Static195.anIntArray313[4] = local53.anInt6600;
							Static38.anIntArray61[4] = local53.anInt6599;
							Static80.anIntArray109[4] = 128;
						}
					}
				}
			}
		}
		@Pc(520) int local520;
		@Pc(525) int local525;
		@Pc(527) int local527;
		@Pc(509) byte local509;
		if (arg11 > 0) {
			local43 = arg10[arg2][arg11 - 1] & 0xFF;
			if (local43 > 0) {
				local53 = this.aClass155_2.method3348(local43 - 1);
				if (local53.anInt6603 != -1) {
					local70 = arg4[arg2][arg11 - 1];
					local509 = arg6[arg2][arg11 - 1];
					if (local53.aBoolean431) {
						local91 = 2;
						local520 = local509 * 2 + 4;
						local525 = Static207.method2977(arg9, local53);
						for (local527 = 0; local527 < 3; local527++) {
							local91 &= 0x7;
							local520 &= 0x7;
							if (Static207.aBooleanArrayArray9[local70][local520] && local53.anInt6599 >= Static38.anIntArray61[local91]) {
								Static433.anIntArray607[local91] = local53.anInt6603;
								Static320.anIntArray475[local91] = local525;
								Static261.anIntArray408[local91] = arg9.method5316() ? local53.anInt6608 : local53.anInt6602;
								Static195.anIntArray313[local91] = local53.anInt6600;
								if (local53.anInt6599 == Static38.anIntArray61[local91]) {
									Static80.anIntArray109[local91] |= 0x20;
								} else {
									Static80.anIntArray109[local91] = 32;
								}
								Static38.anIntArray61[local91] = local53.anInt6599;
							}
							local520++;
							local91--;
						}
						if (!local27[arg8 & 0x3]) {
							arg5[0] = Static262.aBooleanArrayArray21[local70][local509 + 2 & 0x3];
						}
					} else if (!local27[arg8 & 0x3]) {
						arg5[0] = Static420.aBooleanArrayArray17[local70][local509 + 2 & 0x3];
					}
				}
			}
		}
		if (arg12 - 1 > arg11) {
			local43 = arg10[arg2][arg11 + 1] & 0xFF;
			if (local43 > 0) {
				local53 = this.aClass155_2.method3348(local43 - 1);
				if (local53.anInt6603 != -1) {
					local70 = arg4[arg2][arg11 + 1];
					local509 = arg6[arg2][arg11 + 1];
					if (local53.aBoolean431) {
						local91 = 4;
						local520 = local509 * 2 + 2;
						local525 = Static207.method2977(arg9, local53);
						for (local527 = 0; local527 < 3; local527++) {
							local520 &= 0x7;
							local91 &= 0x7;
							if (Static207.aBooleanArrayArray9[local70][local520] && Static38.anIntArray61[local91] <= local53.anInt6599) {
								Static433.anIntArray607[local91] = local53.anInt6603;
								Static320.anIntArray475[local91] = local525;
								Static261.anIntArray408[local91] = arg9.method5316() ? local53.anInt6608 : local53.anInt6602;
								Static195.anIntArray313[local91] = local53.anInt6600;
								if (local53.anInt6599 == Static38.anIntArray61[local91]) {
									Static80.anIntArray109[local91] |= 0x10;
								} else {
									Static80.anIntArray109[local91] = 16;
								}
								Static38.anIntArray61[local91] = local53.anInt6599;
							}
							local91++;
							local520--;
						}
						if (!local27[arg8 + 2 & 0x3]) {
							arg5[2] = Static262.aBooleanArrayArray21[local70][--local509 & 0x3];
						}
					} else if (!local27[arg8 + 2 & 0x3]) {
						arg5[2] = Static420.aBooleanArrayArray17[local70][local509 & 0x3];
					}
				}
			}
		}
		if (arg2 > 0) {
			local43 = arg10[arg2 - 1][arg11] & 0xFF;
			if (local43 > 0) {
				local53 = this.aClass155_2.method3348(local43 - 1);
				if (local53.anInt6603 != -1) {
					local70 = arg4[arg2 - 1][arg11];
					local509 = arg6[arg2 - 1][arg11];
					if (local53.aBoolean431) {
						local91 = 6;
						local520 = local509 * 2 + 4;
						local525 = Static207.method2977(arg9, local53);
						for (local527 = 0; local527 < 3; local527++) {
							local520 &= 0x7;
							local91 &= 0x7;
							if (Static207.aBooleanArrayArray9[local70][local520] && Static38.anIntArray61[local91] <= local53.anInt6599) {
								Static433.anIntArray607[local91] = local53.anInt6603;
								Static320.anIntArray475[local91] = local525;
								Static261.anIntArray408[local91] = arg9.method5316() ? local53.anInt6608 : local53.anInt6602;
								Static195.anIntArray313[local91] = local53.anInt6600;
								if (local53.anInt6599 == Static38.anIntArray61[local91]) {
									Static80.anIntArray109[local91] |= 0x8;
								} else {
									Static80.anIntArray109[local91] = 8;
								}
								Static38.anIntArray61[local91] = local53.anInt6599;
							}
							local520--;
							local91++;
						}
						if (!local27[arg8 + 3 & 0x3]) {
							arg5[3] = Static262.aBooleanArrayArray21[local70][local509 + 1 & 0x3];
						}
					} else if (!local27[arg8 + 3 & 0x3]) {
						arg5[3] = Static420.aBooleanArrayArray17[local70][local509 + 1 & 0x3];
					}
				}
			}
		}
		if (arg3 - 1 > arg2) {
			local43 = arg10[arg2 + 1][arg11] & 0xFF;
			if (local43 > 0) {
				local53 = this.aClass155_2.method3348(local43 - 1);
				if (local53.anInt6603 != -1) {
					local70 = arg4[arg2 + 1][arg11];
					local509 = arg6[arg2 + 1][arg11];
					if (local53.aBoolean431) {
						local91 = 4;
						local520 = local509 * 2 + 6;
						local525 = Static207.method2977(arg9, local53);
						for (local527 = 0; local527 < 3; local527++) {
							local91 &= 0x7;
							local520 &= 0x7;
							if (Static207.aBooleanArrayArray9[local70][local520] && Static38.anIntArray61[local91] <= local53.anInt6599) {
								Static433.anIntArray607[local91] = local53.anInt6603;
								Static320.anIntArray475[local91] = local525;
								Static261.anIntArray408[local91] = arg9.method5316() ? local53.anInt6608 : local53.anInt6602;
								Static195.anIntArray313[local91] = local53.anInt6600;
								if (Static38.anIntArray61[local91] == local53.anInt6599) {
									Static80.anIntArray109[local91] |= 0x4;
								} else {
									Static80.anIntArray109[local91] = 4;
								}
								Static38.anIntArray61[local91] = local53.anInt6599;
							}
							local91--;
							local520++;
						}
						if (!local27[arg8 + 1 & 0x3]) {
							arg5[1] = Static262.aBooleanArrayArray21[local70][local509 + 3 & 0x3];
						}
					} else if (!local27[arg8 + 1 & 0x3]) {
						arg5[1] = Static420.aBooleanArrayArray17[local70][local509 + 3 & 0x3];
					}
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		local43 = Static207.method2977(arg9, arg0);
		if (!arg0.aBoolean431) {
			return;
		}
		for (@Pc(1223) int local1223 = 0; local1223 < 8; local1223++) {
			@Pc(1233) int local1233 = local1223 - arg8 * 2 & 0x7;
			if (Static207.aBooleanArrayArray9[arg1][local1223] && Static38.anIntArray61[local1233] <= arg0.anInt6599) {
				Static433.anIntArray607[local1233] = arg0.anInt6603;
				Static320.anIntArray475[local1233] = local43;
				Static261.anIntArray408[local1233] = arg9.method5316() ? arg0.anInt6608 : arg0.anInt6602;
				Static195.anIntArray313[local1233] = arg0.anInt6600;
				if (arg0.anInt6599 == Static38.anIntArray61[local1233]) {
					Static80.anIntArray109[local1233] |= 0x2;
				} else {
					Static80.anIntArray109[local1233] = 2;
				}
				Static38.anIntArray61[local1233] = arg0.anInt6599;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ta;ILclient!ya;Lclient!ta;)V")
	public final void method802(@OriginalArg(0) Class165 arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) Class165 arg2) {
		if (Static360.anIntArray530 == null || this.anInt1032 != Static360.anIntArray530.length) {
			Static390.anIntArray620 = new int[this.anInt1032];
			Static294.anIntArray435 = new int[this.anInt1032];
			Static360.anIntArray530 = new int[this.anInt1032];
			Static69.anIntArray101 = new int[this.anInt1032];
			Static7.anIntArray4 = new int[this.anInt1032];
		}
		@Pc(48) int[][] local48 = new int[this.anInt1029][this.anInt1032];
		@Pc(54) int local54;
		for (@Pc(50) int local50 = 0; local50 < this.anInt1034; local50++) {
			for (local54 = 0; local54 < this.anInt1032; local54++) {
				Static360.anIntArray530[local54] = 0;
				Static7.anIntArray4[local54] = 0;
				Static390.anIntArray620[local54] = 0;
				Static294.anIntArray435[local54] = 0;
				Static69.anIntArray101[local54] = 0;
			}
			for (@Pc(87) int local87 = -5; local87 < this.anInt1029; local87++) {
				@Pc(97) int local97;
				@Pc(116) int local116;
				@Pc(188) int local188;
				for (@Pc(91) int local91 = 0; local91 < this.anInt1032; local91++) {
					local97 = local87 + 5;
					@Pc(165) int local165;
					if (this.anInt1029 > local97) {
						local116 = this.aByteArrayArrayArray12[local50][local97][local91] & 0xFF;
						if (local116 > 0) {
							@Pc(129) Class135 local129 = this.aClass233_2.method4848(local116 - 1);
							Static360.anIntArray530[local91] += local129.anInt3818;
							Static7.anIntArray4[local91] += local129.anInt3824;
							Static390.anIntArray620[local91] += local129.anInt3827;
							Static294.anIntArray435[local91] += local129.anInt3820;
							local165 = Static69.anIntArray101[local91]++;
						}
					}
					local116 = local87 - 5;
					if (local116 >= 0) {
						local188 = this.aByteArrayArrayArray12[local50][local116][local91] & 0xFF;
						if (local188 > 0) {
							@Pc(198) Class135 local198 = this.aClass233_2.method4848(local188 - 1);
							Static360.anIntArray530[local91] -= local198.anInt3818;
							Static7.anIntArray4[local91] -= local198.anInt3824;
							Static390.anIntArray620[local91] -= local198.anInt3827;
							Static294.anIntArray435[local91] -= local198.anInt3820;
							local165 = Static69.anIntArray101[local91]--;
						}
					}
				}
				if (local87 >= 0) {
					local97 = 0;
					local116 = 0;
					local188 = 0;
					@Pc(256) int local256 = 0;
					@Pc(258) int local258 = 0;
					for (@Pc(260) int local260 = -5; local260 < this.anInt1032; local260++) {
						@Pc(266) int local266 = local260 + 5;
						if (local266 < this.anInt1032) {
							local116 += Static7.anIntArray4[local266];
							local256 += Static294.anIntArray435[local266];
							local188 += Static390.anIntArray620[local266];
							local97 += Static360.anIntArray530[local266];
							local258 += Static69.anIntArray101[local266];
						}
						@Pc(308) int local308 = local260 - 5;
						if (local308 >= 0) {
							local97 -= Static360.anIntArray530[local308];
							local188 -= Static390.anIntArray620[local308];
							local258 -= Static69.anIntArray101[local308];
							local116 -= Static7.anIntArray4[local308];
							local256 -= Static294.anIntArray435[local308];
						}
						if (local260 >= 0 && local256 > 0 && local258 > 0) {
							local48[local87][local260] = Static9.method51(local97 * 256 / local256, local116 / local258, local188 / local258);
						}
					}
				}
			}
			if (Static199.aBoolean214) {
				this.method805(local50 == 0 ? arg0 : null, local50, local50 == 0 ? arg2 : null, Static244.aClass165Array8[local50], arg1, local48);
			} else {
				this.method804(local50, arg1, Static244.aClass165Array8[local50], local50 == 0 ? arg0 : null, local50 == 0 ? arg2 : null, local48);
			}
			this.aByteArrayArrayArray12[local50] = null;
			this.aByteArrayArrayArray8[local50] = null;
			this.aByteArrayArrayArray9[local50] = null;
			this.aByteArrayArrayArray11[local50] = null;
		}
		if (!this.aBoolean64) {
			if (Static374.anInt6086 != 0) {
				Static381.method4856();
			}
			if (Static34.aBoolean25) {
				Static171.method2491();
			}
		}
		for (local54 = 0; local54 < this.anInt1034; local54++) {
			Static244.aClass165Array8[local54].ca();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(BI[[I)V")
	public final void method803(@OriginalArg(2) int[][] arg0) {
		@Pc(22) int[][] local22 = this.anIntArrayArrayArray3[0];
		for (@Pc(24) int local24 = 0; local24 < this.anInt1029 + 1; local24++) {
			for (@Pc(28) int local28 = 0; local28 < this.anInt1032 + 1; local28++) {
				local22[local24][local28] += arg0[local24][local28];
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!ya;ILclient!ta;Lclient!ta;Lclient!ta;[[I)V")
	private void method804(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) Class165 arg2, @OriginalArg(4) Class165 arg3, @OriginalArg(5) Class165 arg4, @OriginalArg(6) int[][] arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1029; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt1032; local11++) {
				if (Static357.anInt5688 == -1 || Static446.method5667(arg0, local11, Static357.anInt5688, local7)) {
					@Pc(35) byte local35 = this.aByteArrayArrayArray9[arg0][local7][local11];
					@Pc(44) byte local44 = this.aByteArrayArrayArray11[arg0][local7][local11];
					@Pc(55) int local55 = this.aByteArrayArrayArray8[arg0][local7][local11] & 0xFF;
					@Pc(66) int local66 = this.aByteArrayArrayArray12[arg0][local7][local11] & 0xFF;
					@Pc(81) Class251 local81 = local55 == 0 ? null : this.aClass155_2.method3348(local55 - 1);
					@Pc(96) Class135 local96 = local66 == 0 ? null : this.aClass233_2.method4848(local66 - 1);
					@Pc(98) int local98 = 0;
					@Pc(100) int local100 = 0;
					if (local35 != 0) {
						local100 = local81 == null ? 0 : Static437.anIntArray122[local35];
						local98 = local96 == null ? 0 : Static5.anIntArray2[local35];
					} else if (local81 != null) {
						local100 = Static437.anIntArray122[local35];
					} else if (local96 != null) {
						local98 = Static437.anIntArray122[local35];
					}
					@Pc(141) int local141 = local100 + local98;
					@Pc(143) int local143 = 0;
					if (local141 != 0) {
						@Pc(148) int[] local148 = new int[local141];
						@Pc(151) int[] local151 = new int[local141];
						@Pc(154) int[] local154 = new int[local141];
						@Pc(157) int[] local157 = new int[local141];
						@Pc(159) boolean local159 = false;
						@Pc(185) int local185;
						@Pc(191) int local191;
						if (local81 == null || local81.anInt6603 == -1 && local81.anInt6607 == -1 && local81.anInt6608 == -1) {
							for (local185 = 0; local185 < local100; local185++) {
								local148[local143] = -1;
								local143++;
							}
						} else {
							local185 = arg1.method5316() ? local81.anInt6608 : local81.anInt6602;
							if (Static331.aBoolean371) {
								local185 = -1;
							}
							for (local191 = 0; local191 < local100; local191++) {
								local154[local143] = local185;
								local157[local143] = local81.anInt6600;
								if (local81.anInt6603 == -1) {
									local148[local143] = -1;
								} else {
									local148[local143] = local81.anInt6603;
								}
								if (local81.anInt6607 == -1) {
									local151[local143] = -1;
								} else {
									local151[local143] = local81.anInt6607;
									local159 = true;
								}
								local143++;
							}
							if (!this.aBoolean64 && arg0 == 0) {
								Static236.method3228(local7, local11, local81.anInt6605, local81.anInt6613 * 8, local81.anInt6606);
							}
						}
						if (!local159) {
							local151 = null;
						}
						if (local96 == null) {
							for (local185 = 0; local185 < local98; local185++) {
								local148[local143] = -1;
								local143++;
							}
						} else {
							local185 = local96.anInt3822;
							if (Static331.aBoolean371) {
								local185 = -1;
							}
							for (local191 = 0; local191 < local98; local191++) {
								local154[local143] = local185;
								local157[local143] = local96.anInt3821;
								local148[local143] = arg5[local7][local11];
								if (local151 != null) {
									local151[local143] = -1;
								}
								local143++;
							}
						}
						local185 = this.anIntArray86.length;
						@Pc(354) int[] local354 = new int[local185];
						@Pc(357) int[] local357 = new int[local185];
						@Pc(364) int[] local364 = arg3 == null ? null : new int[local185];
						@Pc(373) int[] local373 = arg3 == null && arg4 == null ? null : new int[local185];
						@Pc(382) int local382;
						@Pc(387) int local387;
						@Pc(465) int local465;
						@Pc(471) int local471;
						for (@Pc(375) int local375 = 0; local375 < local185; local375++) {
							local382 = this.anIntArray86[local375];
							local387 = this.anIntArray87[local375];
							if (local44 == 0) {
								local354[local375] = local382;
								local357[local375] = local387;
							} else if (local44 == 1) {
								local354[local375] = local387;
								local357[local375] = 128 - local382;
							} else if (local44 == 2) {
								local354[local375] = 128 - local382;
								local357[local375] = 128 - local387;
							} else if (local44 == 3) {
								local354[local375] = 128 - local387;
								local357[local375] = local382;
							}
							if (local364 != null && Static207.aBooleanArrayArray9[local35][local375]) {
								local465 = (local7 << 7) + local382;
								local471 = (local11 << 7) + local382;
								local364[local375] = arg3.a(local465, local471) - arg2.a(local465, local471);
							}
							if (local373 != null) {
								if (arg3 != null && !Static207.aBooleanArrayArray9[local35][local375]) {
									local465 = (local7 << 7) + local382;
									local471 = (local11 << 7) + local382;
									local373[local375] = arg2.a(local465, local471) - arg3.a(local465, local471);
								} else if (arg4 != null && !Static239.aBooleanArrayArray14[local35][local375]) {
									local465 = (local7 << 7) + local382;
									local471 = (local11 << 7) + local382;
									local373[local375] = arg4.a(local465, local471) - arg2.a(local465, local471);
								}
							}
						}
						local382 = arg2.l(local7, local11);
						local387 = arg2.l(local7 + 1, local11);
						local465 = arg2.l(local7 + 1, local11 + 1);
						local471 = arg2.l(local7, local11 + 1);
						if (arg0 > 0) {
							@Pc(590) boolean local590 = true;
							if (local66 == 0 && local35 != 0) {
								local590 = false;
							}
							if (local55 > 0 && local81 != null && !local81.aBoolean432) {
								local590 = false;
							}
							if (local590 && local387 == local382 && local465 == local382 && local471 == local382) {
								this.aByteArrayArrayArray13[arg0][local7][local11] = (byte) (this.aByteArrayArrayArray13[arg0][local7][local11] | 0x4);
							}
						}
						@Pc(654) int local654 = 0;
						@Pc(656) int local656 = 0;
						@Pc(658) int local658 = 0;
						if (this.aBoolean64) {
							local654 = Static284.method714(local7, local11);
							local656 = Static114.method1943(local7, local11);
							local658 = Static310.method4080(local7, local11);
						}
						arg2.method3582(local7, local11, local354, local364, local357, local373, Static79.anIntArrayArray9[local35], Static13.anIntArrayArray1[local35], Static135.anIntArrayArray41[local35], local148, local151, local154, local157, local654, local656, local658);
						Static34.method472(arg0, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!ta;BILclient!ta;Lclient!ta;Lclient!ya;[[I)V")
	private void method805(@OriginalArg(0) Class165 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class165 arg2, @OriginalArg(4) Class165 arg3, @OriginalArg(5) Class51 arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray9[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray11[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray12[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray8[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt1029; local27++) {
			@Pc(54) int local54 = local27 >= this.anInt1029 - 1 ? local27 : local27 + 1;
			for (@Pc(56) int local56 = 0; local56 < this.anInt1032; local56++) {
				@Pc(74) int local74 = local56 < this.anInt1032 - 1 ? local56 + 1 : local56;
				if (Static357.anInt5688 == -1 || Static446.method5667(arg1, local56, Static357.anInt5688, local27)) {
					@Pc(89) boolean local89 = false;
					@Pc(91) boolean local91 = false;
					@Pc(94) boolean[] local94 = new boolean[4];
					@Pc(100) int local100 = local10[local27][local56];
					@Pc(106) int local106 = local15[local27][local56];
					@Pc(114) int local114 = local25[local27][local56] & 0xFF;
					@Pc(122) int local122 = local20[local27][local56] & 0xFF;
					@Pc(130) int local130 = local20[local27][local74] & 0xFF;
					@Pc(138) int local138 = local20[local54][local74] & 0xFF;
					@Pc(146) int local146 = local20[local54][local56] & 0xFF;
					if (local114 != 0 || local122 != 0) {
						@Pc(171) Class251 local171 = local114 == 0 ? null : this.aClass155_2.method3348(local114 - 1);
						if (local100 == 0 && local171 == null) {
							local100 = 12;
						}
						@Pc(192) Class135 local192 = local122 == 0 ? null : this.aClass233_2.method4848(local122 - 1);
						@Pc(194) Class251 local194 = local171;
						if (local171 != null) {
							if (local171.anInt6603 == -1 && local171.anInt6607 == -1) {
								local194 = local171;
								local171 = null;
							} else if (local192 != null && local100 != 0) {
								local91 = local171.aBoolean431;
							}
						}
						@Pc(311) int local311;
						@Pc(326) int local326;
						@Pc(399) int local399;
						@Pc(409) int local409;
						if ((local100 == 0 || local100 == 12) && local27 > 0 && local56 > 0 && this.anInt1029 > local27 && this.anInt1032 > local56) {
							@Pc(273) int local273 = local20[local54][local74] == local122 ? 1 : -1;
							@Pc(288) int local288 = local122 == local20[local54][local56 - 1] ? 1 : -1;
							local311 = local20[local27 - 1][local56 - 1] == local122 ? 1 : -1;
							local326 = local20[local27 - 1][local74] == local122 ? 1 : -1;
							if (local122 == local20[local27][local56 - 1]) {
								local288++;
								local311++;
							} else {
								local311--;
								local288--;
							}
							if (local20[local54][local56] == local122) {
								local273++;
								local288++;
							} else {
								local273--;
								local288--;
							}
							if (local122 == local20[local27][local74]) {
								local273++;
								local326++;
							} else {
								local326--;
								local273--;
							}
							if (local20[local27 - 1][local56] == local122) {
								local326++;
								local311++;
							} else {
								local311--;
								local326--;
							}
							local399 = local311 - local273;
							if (local399 < 0) {
								local399 = -local399;
							}
							local409 = local288 - local326;
							if (local409 < 0) {
								local409 = -local409;
							}
							if (local399 == local409) {
								local399 = arg3.l(local27, local56) - arg3.l(local54, local74);
								if (local399 < 0) {
									local399 = -local399;
								}
								local409 = arg3.l(local54, local56) - arg3.l(local27, local74);
								if (local409 < 0) {
									local409 = -local409;
								}
							}
							local106 = local399 < local409 ? 1 : 0;
						}
						for (local311 = 0; local311 < 13; local311++) {
							Static38.anIntArray61[local311] = -1;
							Static80.anIntArray109[local311] = 1;
						}
						@Pc(497) boolean[] local497 = local171 != null && local171.aBoolean431 ? Static262.aBooleanArrayArray21[local100] : Static420.aBooleanArrayArray17[local100];
						this.method801(local171, local100, local27, this.anInt1029, local10, local94, local15, local192, local106, arg4, local25, local56, this.anInt1032);
						@Pc(530) boolean local530 = local171 != null && local171.anInt6607 != local171.anInt6603;
						if (!local530) {
							for (local326 = 0; local326 < 8; local326++) {
								if (Static38.anIntArray61[local326] >= 0 && Static320.anIntArray475[local326] != Static433.anIntArray607[local326]) {
									local530 = true;
									break;
								}
							}
						}
						if (!local497[local106 + 1 & 0x3]) {
							local94[1] = Static343.method4441(local94[1], (Static80.anIntArray109[4] & Static80.anIntArray109[2]) == 0);
						}
						if (!local497[local106 + 3 & 0x3]) {
							local94[3] = Static343.method4441(local94[3], (Static80.anIntArray109[0] & Static80.anIntArray109[6]) == 0);
						}
						if (!local497[local106 & 0x3]) {
							local94[0] = Static343.method4441(local94[0], (Static80.anIntArray109[2] & Static80.anIntArray109[0]) == 0);
						}
						if (!local497[local106 + 2 & 0x3]) {
							local94[2] = Static343.method4441(local94[2], (Static80.anIntArray109[4] & Static80.anIntArray109[6]) == 0);
						}
						if (!local91 && (local100 == 0 || local100 == 12)) {
							if (local94[0] && !local94[1] && !local94[2] && local94[3]) {
								local100 = local100 == 0 ? 13 : 14;
								local106 = 0;
								local94[0] = local94[3] = false;
							} else if (local94[0] && local94[1] && !local94[2] && !local94[3]) {
								local94[0] = local94[1] = false;
								local106 = 3;
								local100 = local100 == 0 ? 13 : 14;
							} else if (!local94[0] && local94[1] && local94[2] && !local94[3]) {
								local106 = 2;
								local94[1] = local94[2] = false;
								local100 = local100 == 0 ? 13 : 14;
							} else if (!local94[0] && !local94[1] && local94[2] && local94[3]) {
								local94[2] = local94[3] = false;
								local100 = local100 == 0 ? 13 : 14;
								local106 = 1;
							}
						}
						@Pc(840) boolean local840 = !local91 && !local94[0] && !local94[2] && !local94[1] && !local94[3];
						@Pc(842) int[] local842 = null;
						@Pc(858) int[] local858;
						@Pc(850) int[] local850;
						@Pc(854) int[] local854;
						if (local840) {
							local850 = Static13.anIntArrayArray1[local100];
							local399 = local192 == null ? 0 : Static5.anIntArray2[local100];
							local409 = local171 == null ? 0 : Static437.anIntArray122[local100];
							local854 = Static135.anIntArrayArray41[local100];
							local858 = Static79.anIntArrayArray9[local100];
						} else if (local91) {
							local850 = Static61.anIntArrayArray5[local100];
							local854 = Static300.anIntArrayArray42[local100];
							local858 = Static445.anIntArrayArray4[local100];
							local399 = local192 == null ? 0 : Static39.anIntArray65[local100];
							local842 = Static72.anIntArrayArray6[local100];
							local409 = local171 == null ? 0 : Static149.anIntArray484[local100];
						} else {
							local409 = local171 == null ? 0 : Static127.anIntArray173[local100];
							local858 = Static42.anIntArrayArray2[local100];
							local842 = Static269.anIntArrayArray40[local100];
							local850 = Static429.anIntArrayArray60[local100];
							local854 = Static418.anIntArrayArray55[local100];
							local399 = local192 == null ? 0 : Static420.anIntArray589[local100];
						}
						@Pc(944) int local944 = local409 + local399;
						if (local944 <= 0) {
							Static34.method472(arg1, local27, local56);
						} else {
							if (local94[0]) {
								local944++;
							}
							if (local94[2]) {
								local944++;
							}
							if (local94[1]) {
								local944++;
							}
							if (local94[3]) {
								local944++;
							}
							@Pc(977) int local977 = 0;
							@Pc(979) int local979 = 0;
							@Pc(983) int local983 = local944 * 3;
							@Pc(990) int[] local990 = local530 ? new int[local983] : null;
							@Pc(993) int[] local993 = new int[local983];
							@Pc(996) int[] local996 = new int[local983];
							@Pc(999) int[] local999 = new int[local983];
							@Pc(1002) int[] local1002 = new int[local983];
							@Pc(1005) int[] local1005 = new int[local983];
							@Pc(1012) int[] local1012 = arg0 == null ? null : new int[local983];
							@Pc(1021) int[] local1021 = arg0 == null && arg2 == null ? null : new int[local983];
							@Pc(1023) int local1023 = -1;
							@Pc(1025) int local1025 = -1;
							@Pc(1027) int local1027 = 256;
							@Pc(1147) byte local1147;
							@Pc(1077) int local1077;
							@Pc(1079) int local1079;
							@Pc(1310) int local1310;
							@Pc(1316) int local1316;
							@Pc(1325) int local1325;
							@Pc(1330) int local1330;
							@Pc(1346) int local1346;
							@Pc(1335) int local1335;
							@Pc(1351) int local1351;
							@Pc(1401) int local1401;
							@Pc(1407) int local1407;
							if (local171 != null) {
								local1023 = local171.anInt6603;
								local1025 = arg4.method5316() ? local171.anInt6608 : local171.anInt6602;
								local1027 = local171.anInt6600;
								local1077 = Static207.method2977(arg4, local171);
								for (local1079 = 0; local1079 < local409; local1079++) {
									if (local94[-local106 & 0x3] && local842[0] == local977) {
										Static389.anIntArray563[0] = local858[local977];
										Static389.anIntArray563[1] = 1;
										Static389.anIntArray563[2] = local854[local977];
										Static389.anIntArray563[3] = 1;
										Static389.anIntArray563[4] = local850[local977];
										Static389.anIntArray563[5] = local854[local977];
										local1147 = 6;
									} else if (local94[2 - local106 & 0x3] && local842[2] == local977) {
										Static389.anIntArray563[0] = local858[local977];
										Static389.anIntArray563[1] = 5;
										Static389.anIntArray563[2] = local854[local977];
										Static389.anIntArray563[3] = 5;
										Static389.anIntArray563[4] = local850[local977];
										Static389.anIntArray563[5] = local854[local977];
										local1147 = 6;
									} else if (local94[1 - local106 & 0x3] && local842[1] == local977) {
										Static389.anIntArray563[0] = local858[local977];
										Static389.anIntArray563[1] = 3;
										Static389.anIntArray563[2] = local854[local977];
										Static389.anIntArray563[3] = 3;
										Static389.anIntArray563[4] = local850[local977];
										local1147 = 6;
										Static389.anIntArray563[5] = local854[local977];
									} else if (local94[3 - local106 & 0x3] && local977 == local842[3]) {
										Static389.anIntArray563[0] = local858[local977];
										Static389.anIntArray563[1] = 7;
										Static389.anIntArray563[2] = local854[local977];
										Static389.anIntArray563[3] = 7;
										Static389.anIntArray563[4] = local850[local977];
										local1147 = 6;
										Static389.anIntArray563[5] = local854[local977];
									} else {
										Static389.anIntArray563[0] = local858[local977];
										Static389.anIntArray563[1] = local850[local977];
										Static389.anIntArray563[2] = local854[local977];
										local1147 = 3;
									}
									for (local1310 = 0; local1310 < local1147; local1310++) {
										local1316 = Static389.anIntArray563[local1310];
										local1325 = local1316 - local106 * 2 & 0x7;
										local1330 = this.anIntArray86[local1316];
										local1335 = this.anIntArray87[local1316];
										if (local106 == 1) {
											local1346 = local1335;
											local1351 = 128 - local1330;
										} else if (local106 == 2) {
											local1346 = 128 - local1330;
											local1351 = 128 - local1335;
										} else if (local106 == 3) {
											local1351 = local1330;
											local1346 = 128 - local1335;
										} else {
											local1346 = local1330;
											local1351 = local1335;
										}
										local993[local979] = local1346;
										local996[local979] = local1351;
										if (local1012 != null && Static207.aBooleanArrayArray9[local100][local1316]) {
											local1401 = (local27 << 7) + local1346;
											local1407 = local1351 + (local56 << 7);
											local1012[local979] = arg0.a(local1401, local1407) - arg3.a(local1401, local1407);
										}
										if (local1021 != null) {
											if (arg0 != null && !Static207.aBooleanArrayArray9[local100][local1316]) {
												local1401 = (local27 << 7) + local1346;
												local1407 = local1351 + (local56 << 7);
												local1021[local979] = arg3.a(local1401, local1407) - arg0.a(local1401, local1407);
											} else if (arg2 != null && !Static239.aBooleanArrayArray14[local100][local1316]) {
												local1401 = (local27 << 7) + local1346;
												local1407 = local1351 + (local56 << 7);
												local1021[local979] = arg2.a(local1401, local1407) - arg3.a(local1401, local1407);
											}
										}
										if (local1316 < 8 && local171.anInt6599 < Static38.anIntArray61[local1325]) {
											if (local990 != null) {
												local990[local979] = Static320.anIntArray475[local1325];
											}
											local1005[local979] = Static195.anIntArray313[local1325];
											local1002[local979] = Static261.anIntArray408[local1325];
											local999[local979] = Static433.anIntArray607[local1325];
										} else {
											if (local990 != null) {
												local990[local979] = local1077;
											}
											local1002[local979] = arg4.method5316() ? local171.anInt6608 : local171.anInt6602;
											local1005[local979] = local171.anInt6600;
											local999[local979] = local1023;
										}
										local979++;
									}
									local977++;
								}
								if (!this.aBoolean64 && arg1 == 0) {
									Static236.method3228(local27, local56, local171.anInt6605, local171.anInt6613 * 8, local171.anInt6606);
								}
								if (local100 != 12 && local171.anInt6603 != -1 && local171.aBoolean430) {
									local89 = true;
								}
							} else if (local840) {
								local977 = Static437.anIntArray122[local100];
							} else if (local91) {
								local977 = Static149.anIntArray484[local100];
							} else {
								local977 = Static127.anIntArray173[local100];
							}
							if (local192 != null) {
								if (local138 == 0) {
									local138 = local122;
								}
								if (local130 == 0) {
									local130 = local122;
								}
								if (local146 == 0) {
									local146 = local122;
								}
								@Pc(1621) Class135 local1621 = this.aClass233_2.method4848(local122 - 1);
								@Pc(1629) Class135 local1629 = this.aClass233_2.method4848(local130 - 1);
								@Pc(1637) Class135 local1637 = this.aClass233_2.method4848(local138 - 1);
								@Pc(1645) Class135 local1645 = this.aClass233_2.method4848(local146 - 1);
								for (local1325 = 0; local1325 < local399; local1325++) {
									if (local94[-local106 & 0x3] && local977 == local842[0]) {
										Static389.anIntArray563[0] = local858[local977];
										Static389.anIntArray563[1] = 1;
										Static389.anIntArray563[2] = local854[local977];
										Static389.anIntArray563[3] = 1;
										Static389.anIntArray563[4] = local850[local977];
										Static389.anIntArray563[5] = local854[local977];
										local1147 = 6;
									} else if (local94[2 - local106 & 0x3] && local977 == local842[2]) {
										Static389.anIntArray563[0] = local858[local977];
										Static389.anIntArray563[1] = 5;
										Static389.anIntArray563[2] = local854[local977];
										Static389.anIntArray563[3] = 5;
										Static389.anIntArray563[4] = local850[local977];
										Static389.anIntArray563[5] = local854[local977];
										local1147 = 6;
									} else if (local94[1 - local106 & 0x3] && local842[1] == local977) {
										Static389.anIntArray563[0] = local858[local977];
										Static389.anIntArray563[1] = 3;
										Static389.anIntArray563[2] = local854[local977];
										Static389.anIntArray563[3] = 3;
										Static389.anIntArray563[4] = local850[local977];
										local1147 = 6;
										Static389.anIntArray563[5] = local854[local977];
									} else if (local94[3 - local106 & 0x3] && local842[3] == local977) {
										Static389.anIntArray563[0] = local858[local977];
										Static389.anIntArray563[1] = 7;
										Static389.anIntArray563[2] = local854[local977];
										Static389.anIntArray563[3] = 7;
										Static389.anIntArray563[4] = local850[local977];
										Static389.anIntArray563[5] = local854[local977];
										local1147 = 6;
									} else {
										Static389.anIntArray563[0] = local858[local977];
										Static389.anIntArray563[1] = local850[local977];
										Static389.anIntArray563[2] = local854[local977];
										local1147 = 3;
									}
									for (local1330 = 0; local1330 < local1147; local1330++) {
										local1346 = Static389.anIntArray563[local1330];
										local1335 = local1346 - local106 * 2 & 0x7;
										local1351 = this.anIntArray86[local1346];
										local1407 = this.anIntArray87[local1346];
										@Pc(1916) int local1916;
										if (local106 == 1) {
											local1916 = 128 - local1351;
											local1401 = local1407;
										} else if (local106 == 2) {
											local1916 = 128 - local1407;
											local1401 = 128 - local1351;
										} else if (local106 == 3) {
											local1916 = local1351;
											local1401 = 128 - local1407;
										} else {
											local1401 = local1351;
											local1916 = local1407;
										}
										local993[local979] = local1401;
										local996[local979] = local1916;
										@Pc(1971) int local1971;
										@Pc(1977) int local1977;
										if (local1012 != null && Static207.aBooleanArrayArray9[local100][local1346]) {
											local1971 = local1401 + (local27 << 7);
											local1977 = local1916 + (local56 << 7);
											local1012[local979] = arg0.a(local1971, local1977) - arg3.a(local1971, local1977);
										}
										if (local1021 != null) {
											if (arg0 != null && !Static207.aBooleanArrayArray9[local100][local1346]) {
												local1971 = (local27 << 7) + local1401;
												local1977 = local1916 + (local56 << 7);
												local1021[local979] = arg3.a(local1971, local1977) - arg0.a(local1971, local1977);
											} else if (arg2 != null && !Static239.aBooleanArrayArray14[local100][local1346]) {
												local1971 = (local27 << 7) + local1401;
												local1977 = (local56 << 7) + local1916;
												local1021[local979] = arg2.a(local1971, local1977) - arg3.a(local1971, local1977);
											}
										}
										if (local1346 < 8 && Static38.anIntArray61[local1335] >= 0) {
											if (local990 != null) {
												local990[local979] = Static320.anIntArray475[local1335];
											}
											local1005[local979] = Static195.anIntArray313[local1335];
											local1002[local979] = Static261.anIntArray408[local1335];
											local999[local979] = Static433.anIntArray607[local1335];
										} else {
											if (local91 && Static207.aBooleanArrayArray9[local100][local1346]) {
												local1002[local979] = local1025;
												local1005[local979] = local1027;
												local999[local979] = local1023;
											} else if (local1401 == 0 && local1916 == 0) {
												local999[local979] = arg5[local27][local56];
												local1002[local979] = local1621.anInt3822;
												local1005[local979] = local1621.anInt3821;
											} else if (local1401 == 0 && local1916 == 128) {
												local999[local979] = arg5[local27][local74];
												local1002[local979] = local1629.anInt3822;
												local1005[local979] = local1629.anInt3821;
											} else if (local1401 == 128 && local1916 == 128) {
												local999[local979] = arg5[local54][local74];
												local1002[local979] = local1637.anInt3822;
												local1005[local979] = local1637.anInt3821;
											} else if (local1401 == 128 && local1916 == 0) {
												local999[local979] = arg5[local54][local56];
												local1002[local979] = local1645.anInt3822;
												local1005[local979] = local1645.anInt3821;
											} else {
												if (local1401 < 64) {
													if (local1916 < 64) {
														local1002[local979] = local1621.anInt3822;
														local1005[local979] = local1621.anInt3821;
													} else {
														local1002[local979] = local1629.anInt3822;
														local1005[local979] = local1629.anInt3821;
													}
												} else if (local1916 >= 64) {
													local1002[local979] = local1637.anInt3822;
													local1005[local979] = local1637.anInt3821;
												} else {
													local1002[local979] = local1645.anInt3822;
													local1005[local979] = local1645.anInt3821;
												}
												local1971 = Static167.method2411(arg5[local54][local56], local1401 << 7 >> 7, arg5[local27][local56]);
												local1977 = Static167.method2411(arg5[local54][local74], local1401 << 7 >> 7, arg5[local27][local74]);
												local999[local979] = Static167.method2411(local1977, local1916 << 7 >> 7, local1971);
											}
											if (local990 != null) {
												local990[local979] = local999[local979];
											}
										}
										local979++;
									}
									local977++;
								}
								if (local100 != 0 && local192.aBoolean233) {
									local89 = true;
								}
							}
							local1077 = arg3.l(local27, local56);
							local1079 = arg3.l(local54, local56);
							local1310 = arg3.l(local54, local74);
							local1316 = arg3.l(local27, local74);
							if (arg1 > 0) {
								@Pc(2383) boolean local2383 = true;
								if (local122 == 0 && local100 != 0) {
									local2383 = false;
								}
								if (local114 > 0 && local194 != null && !local194.aBoolean432) {
									local2383 = false;
								}
								if (local2383 && local1077 == local1079 && local1310 == local1077 && local1077 == local1316) {
									this.aByteArrayArrayArray13[arg1][local27][local56] = (byte) (this.aByteArrayArrayArray13[arg1][local27][local56] | 0x4);
								}
							}
							local1325 = 0;
							local1330 = 0;
							local1346 = 0;
							if (this.aBoolean64) {
								local1325 = Static284.method714(local27, local56);
								local1330 = Static114.method1943(local27, local56);
								local1346 = Static310.method4080(local27, local56);
							}
							arg3.B(local27, local56, local993, local1012, local996, local1021, local999, local990, local1002, local1005, local1325, local1330, local1346, local89);
							Static34.method472(arg1, local27, local56);
						}
					}
				}
			}
		}
	}
}
