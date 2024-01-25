import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public class Class49 {

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray28;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "[I")
	private final int[] anIntArray203 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
	private final int[] anIntArray202 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "Lclient!cp;")
	private final Class59 aClass59_5;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
	public final boolean aBoolean301;

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
	protected final int anInt3632;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	public final int anInt3634;

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "Lclient!jf;")
	private final Class173 aClass173_5;

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
	protected final int anInt3639;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray25;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray23;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray26;

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray27;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray24;

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIZLclient!cp;Lclient!jf;)V")
	protected Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class59 arg4, @OriginalArg(5) Class173 arg5) {
		this.aClass59_5 = arg4;
		this.aBoolean301 = arg3;
		this.anInt3632 = arg1;
		this.anInt3634 = arg0;
		this.aClass173_5 = arg5;
		this.anInt3639 = arg2;
		this.aByteArrayArrayArray25 = new byte[this.anInt3634][this.anInt3632][this.anInt3639];
		this.aByteArrayArrayArray23 = new byte[this.anInt3634][this.anInt3632][this.anInt3639];
		this.aByteArrayArrayArray26 = new byte[this.anInt3634][this.anInt3632][this.anInt3639];
		this.aByteArrayArrayArray27 = new byte[this.anInt3634][this.anInt3632 + 1][this.anInt3639 + 1];
		this.aByteArrayArrayArray24 = new byte[this.anInt3634][this.anInt3632][this.anInt3639];
		this.anIntArrayArrayArray17 = new int[this.anInt3634][this.anInt3632 + 1][this.anInt3639 + 1];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI[[I)V")
	public final void method2993(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray17[0];
		for (@Pc(23) int local23 = 0; local23 < this.anInt3632 + 1; local23++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt3639 + 1; local27++) {
				local10[local23][local27] += arg0[local23][local27];
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILclient!es;I[Lclient!wd;)V")
	public final void method2994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2_Sub15 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class355[] arg5) {
		@Pc(6) int local6;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(28) int local28;
		if (!this.aBoolean301) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class355 local12 = arg5[local6];
				for (@Pc(14) int local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg1;
						local28 = local18 + arg0;
						if (local24 >= 0 && local24 < this.anInt3632 && local28 >= 0 && this.anInt3639 > local28) {
							local12.method7811(local28, local24);
						}
					}
				}
			}
		}
		local6 = arg2 + arg1;
		@Pc(80) int local80 = arg0 + arg4;
		for (local18 = 0; local18 < this.anInt3634; local18++) {
			for (local24 = 0; local24 < 64; local24++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method2995(0, 0, arg1 + local24, local28 + local80, false, arg0 + local28, 0, local24 + local6, local18, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZIIIILclient!es;B)V")
	private void method2995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class2_Sub15 arg9) {
		if (arg1 == 1) {
			arg6 = 1;
		} else if (arg1 == 2) {
			arg6 = 1;
			arg0 = 1;
		} else if (arg1 == 3) {
			arg0 = 1;
		}
		@Pc(67) int local67;
		if (arg2 < 0 || this.anInt3632 <= arg2 || arg5 < 0 || arg5 >= this.anInt3639) {
			while (true) {
				local67 = arg9.method4325();
				if (local67 == 0) {
					return;
				}
				if (local67 == 1) {
					arg9.method4325();
					return;
				}
				if (local67 <= 49) {
					arg9.method4325();
				}
			}
			return;
		}
		if (!this.aBoolean301 && !arg4) {
			Static521.aByteArrayArrayArray45[arg8][arg2][arg5] = 0;
		}
		while (true) {
			local67 = arg9.method4325();
			if (local67 == 0) {
				if (this.aBoolean301) {
					this.anIntArrayArrayArray17[0][arg0 + arg2][arg6 + arg5] = 0;
					return;
				} else if (arg8 == 0) {
					this.anIntArrayArrayArray17[0][arg0 + arg2][arg6 + arg5] = -Static153.method2484(arg3 + 556238, arg7 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray17[arg8][arg0 + arg2][arg5 + arg6] = this.anIntArrayArrayArray17[arg8 - 1][arg0 + arg2][arg5 + arg6] - 960;
					return;
				}
			}
			if (local67 == 1) {
				@Pc(153) int local153 = arg9.method4325();
				if (!this.aBoolean301) {
					if (local153 == 1) {
						local153 = 0;
					}
					if (arg8 != 0) {
						this.anIntArrayArrayArray17[arg8][arg2 + arg0][arg5 + arg6] = this.anIntArrayArrayArray17[arg8 - 1][arg2 + arg0][arg6 + arg5] - (local153 * 8 << 2);
						return;
					}
					this.anIntArrayArrayArray17[0][arg0 + arg2][arg5 + arg6] = -local153 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray17[0][arg0 + arg2][arg6 + arg5] = local153 * 8 << 2;
				return;
			}
			if (local67 <= 49) {
				if (arg4) {
					arg9.method4325();
				} else {
					this.aByteArrayArrayArray25[arg8][arg2][arg5] = arg9.method4304();
					this.aByteArrayArrayArray24[arg8][arg2][arg5] = (byte) ((local67 - 2) / 4);
					this.aByteArrayArrayArray23[arg8][arg2][arg5] = (byte) (arg1 + local67 - 2 & 0x3);
				}
			} else if (local67 <= 81) {
				if (!this.aBoolean301 && !arg4) {
					Static521.aByteArrayArrayArray45[arg8][arg2][arg5] = (byte) (local67 - 49);
				}
			} else if (!arg4) {
				this.aByteArrayArrayArray26[arg8][arg2][arg5] = (byte) (local67 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBII)V")
	public final void method2996(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3634; local7++) {
			this.method3002(arg0, arg1, local7);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "([[[I[Lclient!wd;Lclient!r;B)V")
	public final void method2997(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class355[] arg1, @OriginalArg(2) Class100 arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean301) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt3632; local14++) {
					for (local18 = 0; local18 < this.anInt3639; local18++) {
						if ((Static521.aByteArrayArrayArray45[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static521.aByteArrayArrayArray45[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg1[local32].method7812(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt3634; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean301) {
				if (Static422.aBoolean560) {
					local18 = 8;
				}
				if (Static235.aBoolean353) {
					local14 = 2;
				}
				if (Static286.anInt5169 != 0) {
					local14 |= 0x1;
					if (Static22.aBoolean31 | local10 == 0) {
						local18 |= 0x10;
					}
				}
			}
			if (Static235.aBoolean353) {
				local18 |= 0x7;
			}
			if (!Static403.aBoolean547) {
				local18 |= 0x20;
			}
			@Pc(144) int[][] local144 = arg0 == null || arg0.length <= local10 ? this.anIntArrayArrayArray17[local10] : arg0[local10];
			Static248.method3897(local10, arg2.method6195(this.anInt3632, this.anInt3639, this.anIntArrayArrayArray17[local10], local144, local14, local18));
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lclient!wd;Lclient!es;IIIIIZI)V")
	public final void method2998(@OriginalArg(0) int arg0, @OriginalArg(1) Class355[] arg1, @OriginalArg(2) Class2_Sub15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg5 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(51) int local51;
		if (!this.aBoolean301) {
			@Pc(18) Class355 local18 = arg1[arg0];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static475.method6744(local24 & 0x7, arg3, local20 & 0x7) + arg7;
					local51 = arg6 + Static529.method7843(local20 & 0x7, arg3, local24 & 0x7);
					if (local38 > 0 && this.anInt3632 - 1 > local38 && local51 > 0 && this.anInt3639 - 1 > local51) {
						local18.method7811(local51, local38);
					}
				}
			}
		}
		@Pc(101) int local101 = (arg8 & 0x7) * 8;
		@Pc(107) int local107 = (arg5 & 0xFFFFFFF8) << 3;
		local20 = (arg8 & 0xFFFFFFF8) << 3;
		@Pc(127) byte local127 = 0;
		@Pc(129) byte local129 = 0;
		if (arg3 == 1) {
			local129 = 1;
		} else if (arg3 == 2) {
			local127 = 1;
			local129 = 1;
		} else if (arg3 == 3) {
			local127 = 1;
		}
		for (local51 = 0; local51 < this.anInt3634; local51++) {
			for (@Pc(160) int local160 = 0; local160 < 64; local160++) {
				for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
					if (arg4 == local51 && local160 >= local11 && local11 + 8 >= local160 && local101 <= local164 && local101 + 8 >= local164) {
						@Pc(211) int local211;
						@Pc(224) int local224;
						if (local11 + 8 == local160 || local164 == local101 + 8) {
							if (arg3 == 0) {
								local224 = local164 + arg6 - local101;
								local211 = arg7 + local160 - local11;
							} else if (arg3 == 1) {
								local211 = local164 + arg7 - local101;
								local224 = local11 + arg6 + 8 - local160;
							} else if (arg3 == 2) {
								local211 = arg7 + local11 + 8 - local160;
								local224 = arg6 + local101 + 8 - local164;
							} else {
								local224 = local160 + arg6 - local11;
								local211 = arg7 + local101 + 8 - local164;
							}
							this.method2995(0, 0, local211, local164 + local20, true, local224, 0, local160 + local107, arg0, arg2);
						} else {
							local211 = Static475.method6744(local164 & 0x7, arg3, local160 & 0x7) + arg7;
							local224 = arg6 + Static529.method7843(local160 & 0x7, arg3, local164 & 0x7);
							this.method2995(local127, arg3, local211, local20 + local164, false, local224, local129, local107 + local160, arg0, arg2);
						}
						if (local160 == 63 || local164 == 63) {
							@Pc(346) byte local346 = 1;
							if (local160 == 63 && local164 == 63) {
								local346 = 3;
							}
							for (@Pc(358) int local358 = 0; local358 < local346; local358++) {
								@Pc(362) int local362 = local160;
								@Pc(364) int local364 = local164;
								if (local358 == 0) {
									local362 = local160 == 63 ? 64 : local160;
									local364 = local164 == 63 ? 64 : local164;
								} else if (local358 == 1) {
									local362 = 64;
								} else if (local358 == 2) {
									local364 = 64;
								}
								@Pc(408) int local408;
								@Pc(415) int local415;
								if (arg3 == 0) {
									local408 = local362 + arg7 - local11;
									local415 = arg6 + local364 - local101;
								} else if (arg3 == 1) {
									local408 = local364 + arg7 - local101;
									local415 = local11 + arg6 + 8 - local362;
								} else if (arg3 == 2) {
									local415 = arg6 + local101 + 8 - local364;
									local408 = local11 + arg7 + 8 - local362;
								} else {
									local415 = local362 + arg6 - local11;
									local408 = local101 + arg7 + 8 - local364;
								}
								if (local408 >= 0 && local408 < this.anInt3632 && local415 >= 0 && this.anInt3639 > local415) {
									this.anIntArrayArrayArray17[arg0][local408][local415] = this.anIntArrayArrayArray17[arg0][local211 + local127][local224 + local129];
								}
							}
						}
					} else {
						this.method2995(0, 0, -1, 0, false, -1, 0, 0, 0, arg2);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILclient!gda;Lclient!r;[[B[[BI[[BLclient!ng;IIII[Z)V")
	private void method2999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) Class230 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean[] arg12) {
		@Pc(18) boolean[] local18 = arg8 != null && arg8.aBoolean504 ? Static539.aBooleanArrayArray8[arg1] : Static103.aBooleanArrayArray1[arg1];
		@Pc(37) int local37;
		@Pc(50) Class230 local50;
		@Pc(67) byte local67;
		@Pc(83) int local83;
		@Pc(88) int local88;
		if (arg0 > 0) {
			if (arg6 > 0) {
				local37 = arg4[arg6 - 1][arg0 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass59_5.method1141(local37 - 1);
					if (local50.anInt6393 != -1 && local50.aBoolean504) {
						local67 = arg7[arg6 - 1][arg0 - 1];
						local83 = arg5[arg6 - 1][arg0 - 1] * 2 + 4 & 0x7;
						local88 = Static196.method3248(arg3, local50);
						if (Static299.aBooleanArrayArray6[local67][local83]) {
							Static39.anIntArray56[0] = local50.anInt6393;
							Static488.anIntArray590[0] = local88;
							Static38.anIntArray53[0] = local50.anInt6404;
							Static34.anIntArray52[0] = local50.anInt6392;
							Static337.anIntArray428[0] = local50.anInt6395;
							Static297.anIntArray381[0] = 256;
						}
					}
				}
			}
			if (arg9 - 1 > arg6) {
				local37 = arg4[arg6 + 1][arg0 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass59_5.method1141(local37 - 1);
					if (local50.anInt6393 != -1 && local50.aBoolean504) {
						local67 = arg7[arg6 + 1][arg0 - 1];
						local83 = arg5[arg6 + 1][arg0 - 1] * 2 + 6 & 0x7;
						local88 = Static196.method3248(arg3, local50);
						if (Static299.aBooleanArrayArray6[local67][local83]) {
							Static39.anIntArray56[2] = local50.anInt6393;
							Static488.anIntArray590[2] = local88;
							Static38.anIntArray53[2] = local50.anInt6404;
							Static34.anIntArray52[2] = local50.anInt6392;
							Static337.anIntArray428[2] = local50.anInt6395;
							Static297.anIntArray381[2] = 512;
						}
					}
				}
			}
		}
		if (arg11 - 1 > arg0) {
			if (arg6 > 0) {
				local37 = arg4[arg6 - 1][arg0 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass59_5.method1141(local37 - 1);
					if (local50.anInt6393 != -1 && local50.aBoolean504) {
						local67 = arg7[arg6 - 1][arg0 + 1];
						local83 = arg5[arg6 - 1][arg0 + 1] * 2 + 2 & 0x7;
						local88 = Static196.method3248(arg3, local50);
						if (Static299.aBooleanArrayArray6[local67][local83]) {
							Static39.anIntArray56[6] = local50.anInt6393;
							Static488.anIntArray590[6] = local88;
							Static38.anIntArray53[6] = local50.anInt6404;
							Static34.anIntArray52[6] = local50.anInt6392;
							Static337.anIntArray428[6] = local50.anInt6395;
							Static297.anIntArray381[6] = 64;
						}
					}
				}
			}
			if (arg9 - 1 > arg6) {
				local37 = arg4[arg6 + 1][arg0 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass59_5.method1141(local37 - 1);
					if (local50.anInt6393 != -1 && local50.aBoolean504) {
						local67 = arg7[arg6 + 1][arg0 + 1];
						local83 = arg5[arg6 + 1][arg0 + 1] * 2 & 0x7;
						local88 = Static196.method3248(arg3, local50);
						if (Static299.aBooleanArrayArray6[local67][local83]) {
							Static39.anIntArray56[4] = local50.anInt6393;
							Static488.anIntArray590[4] = local88;
							Static38.anIntArray53[4] = local50.anInt6404;
							Static34.anIntArray52[4] = local50.anInt6392;
							Static337.anIntArray428[4] = local50.anInt6395;
							Static297.anIntArray381[4] = 128;
						}
					}
				}
			}
		}
		@Pc(513) int local513;
		@Pc(518) int local518;
		@Pc(520) int local520;
		@Pc(482) byte local482;
		if (arg0 > 0) {
			local37 = arg4[arg6][arg0 - 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass59_5.method1141(local37 - 1);
				if (local50.anInt6393 != -1) {
					local67 = arg7[arg6][arg0 - 1];
					local482 = arg5[arg6][arg0 - 1];
					if (local50.aBoolean504) {
						local88 = 2;
						local513 = local482 * 2 + 4;
						local518 = Static196.method3248(arg3, local50);
						for (local520 = 0; local520 < 3; local520++) {
							local88 &= 0x7;
							local513 &= 0x7;
							if (Static299.aBooleanArrayArray6[local67][local513] && local50.anInt6395 >= Static337.anIntArray428[local88]) {
								Static39.anIntArray56[local88] = local50.anInt6393;
								Static488.anIntArray590[local88] = local518;
								Static38.anIntArray53[local88] = local50.anInt6404;
								Static34.anIntArray52[local88] = local50.anInt6392;
								if (local50.anInt6395 == Static337.anIntArray428[local88]) {
									Static297.anIntArray381[local88] |= 0x20;
								} else {
									Static297.anIntArray381[local88] = 32;
								}
								Static337.anIntArray428[local88] = local50.anInt6395;
							}
							local513++;
							local88--;
						}
						if (!local18[arg10 & 0x3]) {
							arg12[0] = Static539.aBooleanArrayArray8[local67][local482 + 2 & 0x3];
						}
					} else if (!local18[arg10 & 0x3]) {
						arg12[0] = Static103.aBooleanArrayArray1[local67][local482 + 2 & 0x3];
					}
				}
			}
		}
		if (arg0 < arg11 - 1) {
			local37 = arg4[arg6][arg0 + 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass59_5.method1141(local37 - 1);
				if (local50.anInt6393 != -1) {
					local67 = arg7[arg6][arg0 + 1];
					local482 = arg5[arg6][arg0 + 1];
					if (local50.aBoolean504) {
						local88 = 4;
						local513 = local482 * 2 + 2;
						local518 = Static196.method3248(arg3, local50);
						for (local520 = 0; local520 < 3; local520++) {
							local513 &= 0x7;
							local88 &= 0x7;
							if (Static299.aBooleanArrayArray6[local67][local513] && local50.anInt6395 >= Static337.anIntArray428[local88]) {
								Static39.anIntArray56[local88] = local50.anInt6393;
								Static488.anIntArray590[local88] = local518;
								Static38.anIntArray53[local88] = local50.anInt6404;
								Static34.anIntArray52[local88] = local50.anInt6392;
								if (Static337.anIntArray428[local88] == local50.anInt6395) {
									Static297.anIntArray381[local88] |= 0x10;
								} else {
									Static297.anIntArray381[local88] = 16;
								}
								Static337.anIntArray428[local88] = local50.anInt6395;
							}
							local88++;
							local513--;
						}
						if (!local18[arg10 + 2 & 0x3]) {
							arg12[2] = Static539.aBooleanArrayArray8[local67][--local482 & 0x3];
						}
					} else if (!local18[arg10 + 2 & 0x3]) {
						arg12[2] = Static103.aBooleanArrayArray1[local67][local482 & 0x3];
					}
				}
			}
		}
		if (arg6 > 0) {
			local37 = arg4[arg6 - 1][arg0] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass59_5.method1141(local37 - 1);
				if (local50.anInt6393 != -1) {
					local67 = arg7[arg6 - 1][arg0];
					local482 = arg5[arg6 - 1][arg0];
					if (local50.aBoolean504) {
						local88 = 6;
						local513 = local482 * 2 + 4;
						local518 = Static196.method3248(arg3, local50);
						for (local520 = 0; local520 < 3; local520++) {
							local513 &= 0x7;
							local88 &= 0x7;
							if (Static299.aBooleanArrayArray6[local67][local513] && Static337.anIntArray428[local88] <= local50.anInt6395) {
								Static39.anIntArray56[local88] = local50.anInt6393;
								Static488.anIntArray590[local88] = local518;
								Static38.anIntArray53[local88] = local50.anInt6404;
								Static34.anIntArray52[local88] = local50.anInt6392;
								if (local50.anInt6395 == Static337.anIntArray428[local88]) {
									Static297.anIntArray381[local88] |= 0x8;
								} else {
									Static297.anIntArray381[local88] = 8;
								}
								Static337.anIntArray428[local88] = local50.anInt6395;
							}
							local88++;
							local513--;
						}
						if (!local18[arg10 + 3 & 0x3]) {
							arg12[3] = Static539.aBooleanArrayArray8[local67][local482 + 1 & 0x3];
						}
					} else if (!local18[arg10 + 3 & 0x3]) {
						arg12[3] = Static103.aBooleanArrayArray1[local67][local482 + 1 & 0x3];
					}
				}
			}
		}
		if (arg6 < arg9 - 1) {
			local37 = arg4[arg6 + 1][arg0] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass59_5.method1141(local37 - 1);
				if (local50.anInt6393 != -1) {
					local67 = arg7[arg6 + 1][arg0];
					local482 = arg5[arg6 + 1][arg0];
					if (local50.aBoolean504) {
						local88 = 4;
						local513 = local482 * 2 + 6;
						local518 = Static196.method3248(arg3, local50);
						for (local520 = 0; local520 < 3; local520++) {
							local513 &= 0x7;
							local88 &= 0x7;
							if (Static299.aBooleanArrayArray6[local67][local513] && Static337.anIntArray428[local88] <= local50.anInt6395) {
								Static39.anIntArray56[local88] = local50.anInt6393;
								Static488.anIntArray590[local88] = local518;
								Static38.anIntArray53[local88] = local50.anInt6404;
								Static34.anIntArray52[local88] = local50.anInt6392;
								if (local50.anInt6395 == Static337.anIntArray428[local88]) {
									Static297.anIntArray381[local88] |= 0x4;
								} else {
									Static297.anIntArray381[local88] = 4;
								}
								Static337.anIntArray428[local88] = local50.anInt6395;
							}
							local513++;
							local88--;
						}
						if (!local18[arg10 + 1 & 0x3]) {
							arg12[1] = Static539.aBooleanArrayArray8[local67][local482 + 3 & 0x3];
						}
					} else if (!local18[arg10 + 1 & 0x3]) {
						arg12[1] = Static103.aBooleanArrayArray1[local67][local482 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local37 = Static196.method3248(arg3, arg8);
		if (!arg8.aBoolean504) {
			return;
		}
		for (@Pc(1186) int local1186 = 0; local1186 < 8; local1186++) {
			@Pc(1196) int local1196 = local1186 - arg10 * 2 & 0x7;
			if (Static299.aBooleanArrayArray6[arg1][local1186] && Static337.anIntArray428[local1196] <= arg8.anInt6395) {
				Static39.anIntArray56[local1196] = arg8.anInt6393;
				Static488.anIntArray590[local1196] = local37;
				Static38.anIntArray53[local1196] = arg8.anInt6404;
				Static34.anIntArray52[local1196] = arg8.anInt6392;
				if (arg8.anInt6395 == Static337.anIntArray428[local1196]) {
					Static297.anIntArray381[local1196] |= 0x2;
				} else {
					Static297.anIntArray381[local1196] = 2;
				}
				Static337.anIntArray428[local1196] = arg8.anInt6395;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!r;Lclient!i;Lclient!i;Z[[IILclient!i;)V")
	private void method3000(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class67 arg5) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt3632; local9++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt3639; local13++) {
				if (Static393.anInt6889 == -1 || Static199.method3279(arg4, Static393.anInt6889, local9, local13)) {
					@Pc(36) byte local36 = this.aByteArrayArrayArray24[arg4][local9][local13];
					@Pc(45) byte local45 = this.aByteArrayArrayArray23[arg4][local9][local13];
					@Pc(56) int local56 = this.aByteArrayArrayArray25[arg4][local9][local13] & 0xFF;
					@Pc(67) int local67 = this.aByteArrayArrayArray26[arg4][local9][local13] & 0xFF;
					@Pc(79) Class230 local79 = local56 == 0 ? null : this.aClass59_5.method1141(local56 - 1);
					@Pc(91) Class121 local91 = local67 == 0 ? null : this.aClass173_5.method3825(local67 - 1);
					@Pc(93) int local93 = 0;
					@Pc(95) int local95 = 0;
					if (local36 != 0) {
						local95 = local79 == null ? 0 : Static4.anIntArray673[local36];
						local93 = local91 == null ? 0 : Static43.anIntArray523[local36];
					} else if (local79 != null) {
						local95 = Static4.anIntArray673[local36];
					} else if (local91 != null) {
						local93 = Static4.anIntArray673[local36];
					}
					@Pc(136) int local136 = local93 + local95;
					@Pc(138) int local138 = 0;
					if (local136 != 0) {
						@Pc(149) int local149;
						if (Static185.aBoolean708) {
							local149 = local79 == null ? -1 : local79.anInt6404;
						} else {
							local149 = -1;
						}
						@Pc(156) int[] local156 = new int[local136];
						@Pc(159) int[] local159 = new int[local136];
						@Pc(162) int[] local162 = new int[local136];
						@Pc(165) int[] local165 = new int[local136];
						@Pc(167) boolean local167 = false;
						@Pc(183) int local183;
						if (local79 == null || local79.anInt6393 == -1 && local79.anInt6398 == -1 && local149 == -1) {
							for (local183 = 0; local183 < local95; local183++) {
								local156[local138] = -1;
								local138++;
							}
						} else {
							for (local183 = 0; local183 < local95; local183++) {
								local162[local138] = local149;
								local165[local138] = local79.anInt6392;
								if (local79.anInt6393 == -1) {
									local156[local138] = -1;
								} else {
									local156[local138] = local79.anInt6393;
								}
								if (local79.anInt6398 == -1) {
									local159[local138] = -1;
								} else {
									local159[local138] = local79.anInt6398;
									local167 = true;
								}
								local138++;
							}
							if (!this.aBoolean301 && arg4 == 0) {
								Static16.method311(local9, local13, local79.anInt6402, local79.anInt6401 * 8, local79.anInt6391);
							}
						}
						if (!local167) {
							local159 = null;
						}
						if (local91 == null) {
							for (local183 = 0; local183 < local93; local183++) {
								local156[local138] = -1;
								local138++;
							}
						} else {
							local183 = local91.anInt3494;
							if (Static185.aBoolean708) {
								local183 = -1;
							}
							for (@Pc(281) int local281 = 0; local281 < local93; local281++) {
								local162[local138] = local183;
								local165[local138] = local91.anInt3496;
								local156[local138] = arg3[local9][local13];
								if (local159 != null) {
									local159[local138] = -1;
								}
								local138++;
							}
						}
						local183 = this.anIntArray203.length;
						@Pc(337) int[] local337 = new int[local183];
						@Pc(340) int[] local340 = new int[local183];
						@Pc(347) int[] local347 = arg1 == null ? null : new int[local183];
						@Pc(356) int[] local356 = arg1 == null && arg5 == null ? null : new int[local183];
						@Pc(365) int local365;
						@Pc(370) int local370;
						@Pc(455) int local455;
						@Pc(461) int local461;
						for (@Pc(358) int local358 = 0; local358 < local183; local358++) {
							local365 = this.anIntArray203[local358];
							local370 = this.anIntArray202[local358];
							if (local45 == 0) {
								local337[local358] = local365;
								local340[local358] = local370;
							} else if (local45 == 1) {
								local337[local358] = local370;
								local340[local358] = 512 - local365;
							} else if (local45 == 2) {
								local337[local358] = 512 - local365;
								local340[local358] = 512 - local370;
							} else if (local45 == 3) {
								local337[local358] = 512 - local370;
								local340[local358] = local365;
							}
							if (local347 != null && Static299.aBooleanArrayArray6[local36][local358]) {
								local455 = local365 + (local9 << 9);
								local461 = local365 + (local13 << 9);
								local347[local358] = arg1.method6711(local461, local455) - arg2.method6711(local461, local455);
							}
							if (local356 != null) {
								if (arg1 != null && !Static299.aBooleanArrayArray6[local36][local358]) {
									local455 = (local9 << 9) + local365;
									local461 = (local13 << 9) + local365;
									local356[local358] = arg2.method6711(local461, local455) - arg1.method6711(local461, local455);
								} else if (arg5 != null && !Static329.aBooleanArrayArray7[local36][local358]) {
									local455 = (local9 << 9) + local365;
									local461 = (local13 << 9) + local365;
									local356[local358] = arg5.method6711(local461, local455) - arg2.method6711(local461, local455);
								}
							}
						}
						local365 = arg2.method6707(local13, local9);
						local370 = arg2.method6707(local13, local9 + 1);
						local455 = arg2.method6707(local13 + 1, local9 + 1);
						local461 = arg2.method6707(local13 + 1, local9);
						@Pc(595) boolean local595 = Static551.method7475(local13, local9);
						if (local595 && arg4 > 1 || !local595 && arg4 > 0) {
							@Pc(611) boolean local611 = true;
							if (local91 != null && !local91.aBoolean289) {
								local611 = false;
							} else if (local67 == 0 && local36 != 0) {
								local611 = false;
							} else if (local56 > 0 && local79 != null && !local79.aBoolean503) {
								local611 = false;
							}
							if (local611 && local365 == local370 && local365 == local455 && local365 == local461) {
								this.aByteArrayArrayArray27[arg4][local9][local13] = (byte) (this.aByteArrayArrayArray27[arg4][local9][local13] | 0x4);
							}
						}
						@Pc(679) int local679 = 0;
						@Pc(681) int local681 = 0;
						@Pc(683) int local683 = 0;
						if (this.aBoolean301) {
							local679 = Static106.method5542(local9, local13);
							local681 = Static299.method4537(local9, local13);
							local683 = Static386.method5688(local9, local13);
						}
						arg2.method6714(local9, local13, local337, local347, local340, local356, Static550.anIntArrayArray61[local36], Static423.anIntArrayArray48[local36], Static563.anIntArrayArray67[local36], local156, local159, local162, local165, local679, local681, local683);
						Static384.method7164(arg4, local9, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBLclient!i;Lclient!r;[[ILclient!i;Lclient!i;)V")
	private void method3001(@OriginalArg(0) int arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class67 arg4, @OriginalArg(6) Class67 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray24[arg0];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray23[arg0];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray26[arg0];
		@Pc(44) byte[][] local44 = this.aByteArrayArrayArray25[arg0];
		for (@Pc(46) int local46 = 0; local46 < this.anInt3632; local46++) {
			@Pc(64) int local64 = this.anInt3632 - 1 <= local46 ? local46 : local46 + 1;
			for (@Pc(66) int local66 = 0; local66 < this.anInt3639; local66++) {
				@Pc(84) int local84 = this.anInt3639 - 1 <= local66 ? local66 : local66 + 1;
				if (Static393.anInt6889 == -1 || Static199.method3279(arg0, Static393.anInt6889, local46, local66)) {
					@Pc(99) boolean local99 = false;
					@Pc(101) boolean local101 = false;
					@Pc(104) boolean[] local104 = new boolean[4];
					@Pc(110) int local110 = local10[local46][local66];
					@Pc(116) int local116 = local15[local46][local66];
					@Pc(124) int local124 = local44[local46][local66] & 0xFF;
					@Pc(132) int local132 = local20[local46][local66] & 0xFF;
					@Pc(140) int local140 = local20[local46][local84] & 0xFF;
					@Pc(148) int local148 = local20[local64][local84] & 0xFF;
					@Pc(156) int local156 = local20[local64][local66] & 0xFF;
					if (local124 != 0 || local132 != 0) {
						@Pc(175) Class230 local175 = local124 == 0 ? null : this.aClass59_5.method1141(local124 - 1);
						@Pc(190) Class121 local190 = local132 == 0 ? null : this.aClass173_5.method3825(local132 - 1);
						if (local110 == 0 && local175 == null) {
							local110 = 12;
						}
						@Pc(201) Class230 local201 = local175;
						if (local175 != null) {
							if (local175.anInt6393 == -1 && local175.anInt6398 == -1) {
								local201 = local175;
								local175 = null;
							} else if (local190 != null && local110 != 0) {
								local101 = local175.aBoolean504;
							}
						}
						@Pc(303) int local303;
						@Pc(333) int local333;
						@Pc(386) int local386;
						@Pc(398) int local398;
						if ((local110 == 0 || local110 == 12) && local46 > 0 && local66 > 0 && this.anInt3632 > local46 && local66 < this.anInt3639) {
							@Pc(267) int local267 = local20[local64][local66 - 1] == local132 ? 1 : -1;
							@Pc(280) int local280 = local20[local64][local84] == local132 ? 1 : -1;
							local303 = local132 == local20[local46 - 1][local66 - 1] ? 1 : -1;
							if (local132 == local20[local46][local66 - 1]) {
								local303++;
								local267++;
							} else {
								local303--;
								local267--;
							}
							local333 = local20[local46 - 1][local84] == local132 ? 1 : -1;
							if (local132 == local20[local64][local66]) {
								local280++;
								local267++;
							} else {
								local280--;
								local267--;
							}
							if (local132 == local20[local46][local84]) {
								local280++;
								local333++;
							} else {
								local333--;
								local280--;
							}
							if (local20[local46 - 1][local66] == local132) {
								local333++;
								local303++;
							} else {
								local303--;
								local333--;
							}
							local386 = local303 - local280;
							if (local386 < 0) {
								local386 = -local386;
							}
							local398 = local267 - local333;
							if (local398 < 0) {
								local398 = -local398;
							}
							if (local398 == local386) {
								local386 = arg1.method6707(local66, local46) - arg1.method6707(local84, local64);
								if (local386 < 0) {
									local386 = -local386;
								}
								local398 = arg1.method6707(local66, local64) - arg1.method6707(local84, local46);
								if (local398 < 0) {
									local398 = -local398;
								}
							}
							local116 = local398 <= local386 ? 0 : 1;
						}
						for (local303 = 0; local303 < 13; local303++) {
							Static337.anIntArray428[local303] = -1;
							Static297.anIntArray381[local303] = 1;
						}
						@Pc(487) boolean[] local487 = local175 != null && local175.aBoolean504 ? Static539.aBooleanArrayArray8[local110] : Static103.aBooleanArrayArray1[local110];
						this.method2999(local66, local110, local190, arg2, local44, local15, local46, local10, local175, this.anInt3632, local116, this.anInt3639, local104);
						@Pc(522) boolean local522 = local175 != null && local175.anInt6398 != local175.anInt6393;
						if (!local522) {
							for (local333 = 0; local333 < 8; local333++) {
								if (Static337.anIntArray428[local333] >= 0 && Static39.anIntArray56[local333] != Static488.anIntArray590[local333]) {
									local522 = true;
									break;
								}
							}
						}
						if (!local487[local116 + 1 & 0x3]) {
							local104[1] = Static536.method7341(local104[1], (Static297.anIntArray381[4] & Static297.anIntArray381[2]) == 0);
						}
						if (!local487[local116 + 3 & 0x3]) {
							local104[3] = Static536.method7341(local104[3], (Static297.anIntArray381[0] & Static297.anIntArray381[6]) == 0);
						}
						if (!local487[local116 & 0x3]) {
							local104[0] = Static536.method7341(local104[0], (Static297.anIntArray381[0] & Static297.anIntArray381[2]) == 0);
						}
						if (!local487[local116 + 2 & 0x3]) {
							local104[2] = Static536.method7341(local104[2], (Static297.anIntArray381[6] & Static297.anIntArray381[4]) == 0);
						}
						if (!local101 && (local110 == 0 || local110 == 12)) {
							if (local104[0] && !local104[1] && !local104[2] && local104[3]) {
								local110 = local110 == 0 ? 13 : 14;
								local104[0] = local104[3] = false;
								local116 = 0;
							} else if (local104[0] && local104[1] && !local104[2] && !local104[3]) {
								local116 = 3;
								local110 = local110 == 0 ? 13 : 14;
								local104[0] = local104[1] = false;
							} else if (!local104[0] && local104[1] && local104[2] && !local104[3]) {
								local104[1] = local104[2] = false;
								local116 = 2;
								local110 = local110 == 0 ? 13 : 14;
							} else if (!local104[0] && !local104[1] && local104[2] && local104[3]) {
								local104[2] = local104[3] = false;
								local116 = 1;
								local110 = local110 == 0 ? 13 : 14;
							}
						}
						@Pc(835) boolean local835 = !local101 && !local104[0] && !local104[2] && !local104[1] && !local104[3];
						@Pc(837) int[] local837 = null;
						@Pc(855) int[] local855;
						@Pc(843) int[] local843;
						@Pc(859) int[] local859;
						if (local835) {
							local843 = Static423.anIntArrayArray48[local110];
							local386 = local190 == null ? 0 : Static43.anIntArray523[local110];
							local855 = Static550.anIntArrayArray61[local110];
							local859 = Static563.anIntArrayArray67[local110];
							local398 = local175 == null ? 0 : Static4.anIntArray673[local110];
						} else if (local101) {
							local398 = local175 == null ? 0 : Static308.anIntArray407[local110];
							local859 = Static576.anIntArrayArray49[local110];
							local843 = Static299.anIntArrayArray33[local110];
							local837 = Static399.anIntArrayArray43[local110];
							local386 = local190 == null ? 0 : Static125.anIntArray158[local110];
							local855 = Static411.anIntArrayArray45[local110];
						} else {
							local398 = local175 == null ? 0 : Static255.anIntArray324[local110];
							local837 = Static265.anIntArrayArray30[local110];
							local855 = Static491.anIntArrayArray36[local110];
							local843 = Static555.anIntArrayArray66[local110];
							local386 = local190 == null ? 0 : Static402.anIntArray481[local110];
							local859 = Static132.anIntArrayArray46[local110];
						}
						@Pc(940) int local940 = local398 + local386;
						if (local940 <= 0) {
							Static384.method7164(arg0, local46, local66);
						} else {
							if (local104[0]) {
								local940++;
							}
							if (local104[2]) {
								local940++;
							}
							if (local104[1]) {
								local940++;
							}
							if (local104[3]) {
								local940++;
							}
							@Pc(970) int local970 = 0;
							@Pc(972) int local972 = 0;
							@Pc(976) int local976 = local940 * 3;
							@Pc(983) int[] local983 = local522 ? new int[local976] : null;
							@Pc(986) int[] local986 = new int[local976];
							@Pc(989) int[] local989 = new int[local976];
							@Pc(992) int[] local992 = new int[local976];
							@Pc(995) int[] local995 = new int[local976];
							@Pc(998) int[] local998 = new int[local976];
							@Pc(1005) int[] local1005 = arg5 == null ? null : new int[local976];
							@Pc(1014) int[] local1014 = arg5 == null && arg4 == null ? null : new int[local976];
							@Pc(1016) int local1016 = -1;
							@Pc(1018) int local1018 = -1;
							@Pc(1020) int local1020 = 256;
							@Pc(1092) byte local1092;
							@Pc(1036) int local1036;
							@Pc(1038) int local1038;
							@Pc(1279) int local1279;
							@Pc(1285) int local1285;
							@Pc(1294) int local1294;
							@Pc(1299) int local1299;
							@Pc(1319) int local1319;
							@Pc(1304) int local1304;
							@Pc(1321) int local1321;
							@Pc(1370) int local1370;
							@Pc(1377) int local1377;
							if (local175 != null) {
								local1020 = local175.anInt6392;
								local1018 = local175.anInt6404;
								local1016 = local175.anInt6393;
								local1036 = Static196.method3248(arg2, local175);
								for (local1038 = 0; local1038 < local398; local1038++) {
									if (local104[-local116 & 0x3] && local837[0] == local970) {
										Static128.anIntArray159[0] = local855[local970];
										Static128.anIntArray159[1] = 1;
										Static128.anIntArray159[2] = local859[local970];
										Static128.anIntArray159[3] = 1;
										Static128.anIntArray159[4] = local843[local970];
										Static128.anIntArray159[5] = local859[local970];
										local1092 = 6;
									} else if (local104[2 - local116 & 0x3] && local970 == local837[2]) {
										Static128.anIntArray159[0] = local855[local970];
										Static128.anIntArray159[1] = 5;
										Static128.anIntArray159[2] = local859[local970];
										Static128.anIntArray159[3] = 5;
										Static128.anIntArray159[4] = local843[local970];
										local1092 = 6;
										Static128.anIntArray159[5] = local859[local970];
									} else if (local104[1 - local116 & 0x3] && local970 == local837[1]) {
										Static128.anIntArray159[0] = local855[local970];
										Static128.anIntArray159[1] = 3;
										Static128.anIntArray159[2] = local859[local970];
										Static128.anIntArray159[3] = 3;
										Static128.anIntArray159[4] = local843[local970];
										local1092 = 6;
										Static128.anIntArray159[5] = local859[local970];
									} else if (local104[3 - local116 & 0x3] && local970 == local837[3]) {
										Static128.anIntArray159[0] = local855[local970];
										Static128.anIntArray159[1] = 7;
										Static128.anIntArray159[2] = local859[local970];
										Static128.anIntArray159[3] = 7;
										Static128.anIntArray159[4] = local843[local970];
										Static128.anIntArray159[5] = local859[local970];
										local1092 = 6;
									} else {
										Static128.anIntArray159[0] = local855[local970];
										Static128.anIntArray159[1] = local843[local970];
										local1092 = 3;
										Static128.anIntArray159[2] = local859[local970];
									}
									local970++;
									for (local1279 = 0; local1279 < local1092; local1279++) {
										local1285 = Static128.anIntArray159[local1279];
										local1294 = local1285 - local116 * 2 & 0x7;
										local1299 = this.anIntArray203[local1285];
										local1304 = this.anIntArray202[local1285];
										if (local116 == 1) {
											local1321 = 512 - local1299;
											local1319 = local1304;
										} else if (local116 == 2) {
											local1319 = 512 - local1299;
											local1321 = 512 - local1304;
										} else if (local116 == 3) {
											local1319 = 512 - local1304;
											local1321 = local1299;
										} else {
											local1319 = local1299;
											local1321 = local1304;
										}
										local986[local972] = local1319;
										local989[local972] = local1321;
										if (local1005 != null && Static299.aBooleanArrayArray6[local110][local1285]) {
											local1370 = (local46 << 9) + local1319;
											local1377 = (local66 << 9) + local1321;
											local1005[local972] = arg5.method6711(local1377, local1370) - arg1.method6711(local1377, local1370);
										}
										if (local1014 != null) {
											if (arg5 != null && !Static299.aBooleanArrayArray6[local110][local1285]) {
												local1370 = (local46 << 9) + local1319;
												local1377 = (local66 << 9) + local1321;
												local1014[local972] = arg1.method6711(local1377, local1370) - arg5.method6711(local1377, local1370);
											} else if (arg4 != null && !Static329.aBooleanArrayArray7[local110][local1285]) {
												local1370 = local1319 + (local46 << 9);
												local1377 = local1321 + (local66 << 9);
												local1014[local972] = arg4.method6711(local1377, local1370) - arg1.method6711(local1377, local1370);
											}
										}
										if (local1285 < 8 && Static337.anIntArray428[local1294] > local175.anInt6395) {
											if (local983 != null) {
												local983[local972] = Static488.anIntArray590[local1294];
											}
											local998[local972] = Static34.anIntArray52[local1294];
											local995[local972] = Static38.anIntArray53[local1294];
											local992[local972] = Static39.anIntArray56[local1294];
										} else {
											if (local983 != null) {
												local983[local972] = local1036;
											}
											local995[local972] = local175.anInt6404;
											local998[local972] = local175.anInt6392;
											local992[local972] = local1016;
										}
										local972++;
									}
								}
								if (!this.aBoolean301 && arg0 == 0) {
									Static16.method311(local46, local66, local175.anInt6402, local175.anInt6401 * 8, local175.anInt6391);
								}
								if (local110 != 12 && local175.anInt6393 != -1 && local175.aBoolean502) {
									local99 = true;
								}
							} else if (local835) {
								local970 = Static4.anIntArray673[local110];
							} else if (local101) {
								local970 = Static308.anIntArray407[local110];
							} else {
								local970 = Static255.anIntArray324[local110];
							}
							if (local190 != null) {
								if (local140 == 0) {
									local140 = local132;
								}
								if (local156 == 0) {
									local156 = local132;
								}
								if (local148 == 0) {
									local148 = local132;
								}
								@Pc(1624) Class121 local1624 = this.aClass173_5.method3825(local132 - 1);
								@Pc(1632) Class121 local1632 = this.aClass173_5.method3825(local140 - 1);
								@Pc(1640) Class121 local1640 = this.aClass173_5.method3825(local148 - 1);
								@Pc(1648) Class121 local1648 = this.aClass173_5.method3825(local156 - 1);
								for (local1294 = 0; local1294 < local386; local1294++) {
									if (local104[-local116 & 0x3] && local837[0] == local970) {
										Static128.anIntArray159[0] = local855[local970];
										Static128.anIntArray159[1] = 1;
										Static128.anIntArray159[2] = local859[local970];
										Static128.anIntArray159[3] = 1;
										Static128.anIntArray159[4] = local843[local970];
										local1092 = 6;
										Static128.anIntArray159[5] = local859[local970];
									} else if (local104[2 - local116 & 0x3] && local837[2] == local970) {
										Static128.anIntArray159[0] = local855[local970];
										Static128.anIntArray159[1] = 5;
										Static128.anIntArray159[2] = local859[local970];
										Static128.anIntArray159[3] = 5;
										Static128.anIntArray159[4] = local843[local970];
										local1092 = 6;
										Static128.anIntArray159[5] = local859[local970];
									} else if (local104[1 - local116 & 0x3] && local837[1] == local970) {
										Static128.anIntArray159[0] = local855[local970];
										Static128.anIntArray159[1] = 3;
										Static128.anIntArray159[2] = local859[local970];
										Static128.anIntArray159[3] = 3;
										Static128.anIntArray159[4] = local843[local970];
										Static128.anIntArray159[5] = local859[local970];
										local1092 = 6;
									} else if (local104[3 - local116 & 0x3] && local970 == local837[3]) {
										Static128.anIntArray159[0] = local855[local970];
										Static128.anIntArray159[1] = 7;
										Static128.anIntArray159[2] = local859[local970];
										Static128.anIntArray159[3] = 7;
										Static128.anIntArray159[4] = local843[local970];
										Static128.anIntArray159[5] = local859[local970];
										local1092 = 6;
									} else {
										Static128.anIntArray159[0] = local855[local970];
										Static128.anIntArray159[1] = local843[local970];
										local1092 = 3;
										Static128.anIntArray159[2] = local859[local970];
									}
									for (local1299 = 0; local1299 < local1092; local1299++) {
										local1319 = Static128.anIntArray159[local1299];
										local1304 = local1319 - local116 * 2 & 0x7;
										local1321 = this.anIntArray203[local1319];
										local1377 = this.anIntArray202[local1319];
										@Pc(1918) int local1918;
										if (local116 == 1) {
											local1370 = local1377;
											local1918 = 512 - local1321;
										} else if (local116 == 2) {
											local1370 = 512 - local1321;
											local1918 = 512 - local1377;
										} else if (local116 == 3) {
											local1918 = local1321;
											local1370 = 512 - local1377;
										} else {
											local1370 = local1321;
											local1918 = local1377;
										}
										local986[local972] = local1370;
										local989[local972] = local1918;
										@Pc(1971) int local1971;
										@Pc(1978) int local1978;
										if (local1005 != null && Static299.aBooleanArrayArray6[local110][local1319]) {
											local1971 = local1370 + (local46 << 9);
											local1978 = (local66 << 9) + local1918;
											local1005[local972] = arg5.method6711(local1978, local1971) - arg1.method6711(local1978, local1971);
										}
										if (local1014 != null) {
											if (arg5 != null && !Static299.aBooleanArrayArray6[local110][local1319]) {
												local1971 = (local46 << 9) + local1370;
												local1978 = local1918 + (local66 << 9);
												local1014[local972] = arg1.method6711(local1978, local1971) - arg5.method6711(local1978, local1971);
											} else if (arg4 != null && !Static329.aBooleanArrayArray7[local110][local1319]) {
												local1971 = (local46 << 9) + local1370;
												local1978 = local1918 + (local66 << 9);
												local1014[local972] = arg4.method6711(local1978, local1971) - arg1.method6711(local1978, local1971);
											}
										}
										if (local1319 < 8 && Static337.anIntArray428[local1304] >= 0) {
											if (local983 != null) {
												local983[local972] = Static488.anIntArray590[local1304];
											}
											local998[local972] = Static34.anIntArray52[local1304];
											local995[local972] = Static38.anIntArray53[local1304];
											local992[local972] = Static39.anIntArray56[local1304];
										} else {
											if (local101 && Static299.aBooleanArrayArray6[local110][local1319]) {
												local995[local972] = local1018;
												local998[local972] = local1020;
												local992[local972] = local1016;
											} else if (local1370 == 0 && local1918 == 0) {
												local992[local972] = arg3[local46][local66];
												local995[local972] = local1624.anInt3494;
												local998[local972] = local1624.anInt3496;
											} else if (local1370 == 0 && local1918 == 512) {
												local992[local972] = arg3[local46][local84];
												local995[local972] = local1632.anInt3494;
												local998[local972] = local1632.anInt3496;
											} else if (local1370 == 512 && local1918 == 512) {
												local992[local972] = arg3[local64][local84];
												local995[local972] = local1640.anInt3494;
												local998[local972] = local1640.anInt3496;
											} else if (local1370 == 512 && local1918 == 0) {
												local992[local972] = arg3[local64][local66];
												local995[local972] = local1648.anInt3494;
												local998[local972] = local1648.anInt3496;
											} else {
												if (local1370 < 256) {
													if (local1918 >= 256) {
														local995[local972] = local1632.anInt3494;
														local998[local972] = local1632.anInt3496;
													} else {
														local995[local972] = local1624.anInt3494;
														local998[local972] = local1624.anInt3496;
													}
												} else if (local1918 < 256) {
													local995[local972] = local1648.anInt3494;
													local998[local972] = local1648.anInt3496;
												} else {
													local995[local972] = local1640.anInt3494;
													local998[local972] = local1640.anInt3496;
												}
												local1971 = Static559.method7617(arg3[local46][local66], arg3[local64][local66], local1370 << 7 >> 9);
												local1978 = Static559.method7617(arg3[local46][local84], arg3[local64][local84], local1370 << 7 >> 9);
												local992[local972] = Static559.method7617(local1971, local1978, local1918 << 7 >> 9);
											}
											if (local983 != null) {
												local983[local972] = local992[local972];
											}
										}
										local972++;
									}
									local970++;
								}
								if (local110 != 0 && local190.aBoolean288) {
									local99 = true;
								}
							}
							local1036 = arg1.method6707(local66, local46);
							local1038 = arg1.method6707(local66, local64);
							local1279 = arg1.method6707(local84, local64);
							local1285 = arg1.method6707(local84, local46);
							@Pc(2400) boolean local2400 = Static551.method7475(local66, local46);
							if (local2400 && arg0 > 1 || !local2400 && arg0 > 0) {
								@Pc(2416) boolean local2416 = true;
								if (local190 != null && !local190.aBoolean289) {
									local2416 = false;
								} else if (local132 == 0 && local110 != 0) {
									local2416 = false;
								} else if (local124 > 0 && local201 != null && !local201.aBoolean503) {
									local2416 = false;
								}
								if (local2416 && local1036 == local1038 && local1279 == local1036 && local1285 == local1036) {
									this.aByteArrayArrayArray27[arg0][local46][local66] = (byte) (this.aByteArrayArrayArray27[arg0][local46][local66] | 0x4);
								}
							}
							local1299 = 0;
							local1319 = 0;
							local1304 = 0;
							if (this.aBoolean301) {
								local1299 = Static106.method5542(local46, local66);
								local1319 = Static299.method4537(local46, local66);
								local1304 = Static386.method5688(local46, local66);
							}
							arg1.O(local46, local66, local986, local1005, local989, local1014, local992, local983, local995, local998, local1299, local1319, local1304, local99);
							Static384.method7164(arg0, local46, local66);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZI)V")
	private void method3002(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		@Pc(16) int local16;
		for (@Pc(12) int local12 = arg0; local12 < arg0 + 64; local12++) {
			for (local16 = arg1; local16 < arg1 + 64; local16++) {
				if (local16 >= 0 && local16 < this.anInt3632 && local12 >= 0 && local12 < this.anInt3639) {
					this.anIntArrayArrayArray17[arg2][local16][local12] = arg2 > 0 ? this.anIntArrayArrayArray17[arg2 - 1][local16][local12] - 960 : 0;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt3632) {
			for (local16 = arg0 + 1; local16 < arg0 + 64; local16++) {
				if (local16 >= 0 && this.anInt3639 > local16) {
					this.anIntArrayArrayArray17[arg2][arg1][local16] = this.anIntArrayArrayArray17[arg2][arg1 - 1][local16];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt3639) {
			for (local16 = arg1 + 1; local16 < arg1 + 64; local16++) {
				if (local16 >= 0 && local16 < this.anInt3632) {
					this.anIntArrayArrayArray17[arg2][local16][arg0] = this.anIntArrayArrayArray17[arg2][local16][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || this.anInt3632 <= arg1 || this.anInt3639 <= arg0) {
			return;
		}
		if (arg2 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray17[arg2][arg1 - 1][arg0] != this.anIntArrayArrayArray17[arg2 - 1][arg1 - 1][arg0]) {
				this.anIntArrayArrayArray17[arg2][arg1][arg0] = this.anIntArrayArrayArray17[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray17[arg2][arg1][arg0 - 1] != this.anIntArrayArrayArray17[arg2 - 1][arg1][arg0 - 1]) {
				this.anIntArrayArrayArray17[arg2][arg1][arg0] = this.anIntArrayArrayArray17[arg2][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray17[arg2][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray17[arg2 - 1][arg1 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray17[arg2][arg1][arg0] = this.anIntArrayArrayArray17[arg2][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray17[arg2][arg1 - 1][arg0] != 0) {
			this.anIntArrayArrayArray17[arg2][arg1][arg0] = this.anIntArrayArrayArray17[arg2][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray17[arg2][arg1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray17[arg2][arg1][arg0] = this.anIntArrayArrayArray17[arg2][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray17[arg2][arg1 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray17[arg2][arg1][arg0] = this.anIntArrayArrayArray17[arg2][arg1 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!i;Lclient!i;ILclient!r;)V")
	public final void method3004(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt3632][this.anInt3639];
		if (Static465.anIntArray526 == null || Static465.anIntArray526.length != this.anInt3639) {
			Static572.anIntArray676 = new int[this.anInt3639];
			Static465.anIntArray526 = new int[this.anInt3639];
			Static266.anIntArray332 = new int[this.anInt3639];
			Static101.anIntArray109 = new int[this.anInt3639];
			Static241.anIntArray297 = new int[this.anInt3639];
		}
		@Pc(52) int local52;
		for (@Pc(48) int local48 = 0; local48 < this.anInt3634; local48++) {
			for (local52 = 0; local52 < this.anInt3639; local52++) {
				Static465.anIntArray526[local52] = 0;
				Static241.anIntArray297[local52] = 0;
				Static266.anIntArray332[local52] = 0;
				Static101.anIntArray109[local52] = 0;
				Static572.anIntArray676[local52] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt3632; local81++) {
				@Pc(91) int local91;
				@Pc(106) int local106;
				@Pc(178) int local178;
				for (@Pc(85) int local85 = 0; local85 < this.anInt3639; local85++) {
					local91 = local81 + 5;
					@Pc(155) int local155;
					if (local91 < this.anInt3632) {
						local106 = this.aByteArrayArrayArray26[local48][local91][local85] & 0xFF;
						if (local106 > 0) {
							@Pc(119) Class121 local119 = this.aClass173_5.method3825(local106 - 1);
							Static465.anIntArray526[local85] += local119.anInt3486;
							Static241.anIntArray297[local85] += local119.anInt3492;
							Static266.anIntArray332[local85] += local119.anInt3490;
							Static101.anIntArray109[local85] += local119.anInt3488;
							local155 = Static572.anIntArray676[local85]++;
						}
					}
					local106 = local81 - 5;
					if (local106 >= 0) {
						local178 = this.aByteArrayArrayArray26[local48][local106][local85] & 0xFF;
						if (local178 > 0) {
							@Pc(191) Class121 local191 = this.aClass173_5.method3825(local178 - 1);
							Static465.anIntArray526[local85] -= local191.anInt3486;
							Static241.anIntArray297[local85] -= local191.anInt3492;
							Static266.anIntArray332[local85] -= local191.anInt3490;
							Static101.anIntArray109[local85] -= local191.anInt3488;
							local155 = Static572.anIntArray676[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local106 = 0;
					local178 = 0;
					@Pc(249) int local249 = 0;
					@Pc(251) int local251 = 0;
					for (@Pc(253) int local253 = -5; local253 < this.anInt3639; local253++) {
						@Pc(259) int local259 = local253 + 5;
						if (this.anInt3639 > local259) {
							local178 += Static266.anIntArray332[local259];
							local249 += Static101.anIntArray109[local259];
							local251 += Static572.anIntArray676[local259];
							local91 += Static465.anIntArray526[local259];
							local106 += Static241.anIntArray297[local259];
						}
						@Pc(297) int local297 = local253 - 5;
						if (local297 >= 0) {
							local178 -= Static266.anIntArray332[local297];
							local249 -= Static101.anIntArray109[local297];
							local91 -= Static465.anIntArray526[local297];
							local251 -= Static572.anIntArray676[local297];
							local106 -= Static241.anIntArray297[local297];
						}
						if (local253 >= 0 && local249 > 0 && local251 > 0) {
							local11[local81][local253] = Static354.method3775(local91 * 256 / local249, local178 / local251, local106 / local251);
						}
					}
				}
			}
			if (Static92.aBoolean174) {
				this.method3001(local48, Static421.aClass67Array7[local48], arg2, local11, local48 == 0 ? arg0 : null, local48 == 0 ? arg1 : null);
			} else {
				this.method3000(arg2, local48 == 0 ? arg1 : null, Static421.aClass67Array7[local48], local11, local48, local48 == 0 ? arg0 : null);
			}
			this.aByteArrayArrayArray26[local48] = null;
			this.aByteArrayArrayArray25[local48] = null;
			this.aByteArrayArrayArray24[local48] = null;
			this.aByteArrayArrayArray23[local48] = null;
		}
		if (!this.aBoolean301) {
			if (Static286.anInt5169 != 0) {
				Static348.method5193();
			}
			if (Static235.aBoolean353) {
				Static4.method7708();
			}
		}
		for (local52 = 0; local52 < this.anInt3634; local52++) {
			Static421.aClass67Array7[local52].BA();
		}
	}
}
