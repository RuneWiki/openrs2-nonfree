import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public class Class238 {

	@OriginalMember(owner = "client!tr", name = "x", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "[I")
	private final int[] anIntArray490 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "[I")
	private final int[] anIntArray489 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!tr", name = "z", descriptor = "Z")
	public final boolean aBoolean476;

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "Lclient!ada;")
	private final Class7 aClass7_5;

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "I")
	protected final int anInt6918;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
	protected final int anInt6909;

	@OriginalMember(owner = "client!tr", name = "p", descriptor = "Lclient!c;")
	private final Class41 aClass41_4;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "I")
	public final int anInt6912;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!tr", name = "A", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIZLclient!ada;Lclient!c;)V")
	protected Class238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class7 arg4, @OriginalArg(5) Class41 arg5) {
		this.aBoolean476 = arg3;
		this.aClass7_5 = arg4;
		this.anInt6918 = arg1;
		this.anInt6909 = arg2;
		this.aClass41_4 = arg5;
		this.anInt6912 = arg0;
		this.aByteArrayArrayArray17 = new byte[this.anInt6912][this.anInt6918][this.anInt6909];
		this.aByteArrayArrayArray18 = new byte[this.anInt6912][this.anInt6918][this.anInt6909];
		this.aByteArrayArrayArray15 = new byte[this.anInt6912][this.anInt6918][this.anInt6909];
		this.anIntArrayArrayArray12 = new int[this.anInt6912][this.anInt6918 + 1][this.anInt6909 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt6912][this.anInt6918 + 1][this.anInt6909 + 1];
		this.aByteArrayArrayArray20 = new byte[this.anInt6912][this.anInt6918][this.anInt6909];
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIII)V")
	private void method5534(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg2; local7 < arg2 + 64; local7++) {
			for (local11 = arg1; local11 < arg1 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt6918 && local7 >= 0 && local7 < this.anInt6909) {
					this.anIntArrayArrayArray12[arg0][local11][local7] = arg0 <= 0 ? 0 : this.anIntArrayArrayArray12[arg0 - 1][local11][local7] - 960;
				}
			}
		}
		if (arg1 > 0 && this.anInt6918 > arg1) {
			for (local11 = arg2 + 1; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && this.anInt6909 > local11) {
					this.anIntArrayArrayArray12[arg0][arg1][local11] = this.anIntArrayArrayArray12[arg0][arg1 - 1][local11];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt6909) {
			for (local11 = arg1 + 1; local11 < arg1 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt6918) {
					this.anIntArrayArrayArray12[arg0][local11][arg2] = this.anIntArrayArrayArray12[arg0][local11][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || this.anInt6918 <= arg1 || this.anInt6909 <= arg2) {
			return;
		}
		if (arg0 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray12[arg0][arg1 - 1][arg2] != this.anIntArrayArrayArray12[arg0 - 1][arg1 - 1][arg2]) {
				this.anIntArrayArrayArray12[arg0][arg1][arg2] = this.anIntArrayArrayArray12[arg0][arg1 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray12[arg0][arg1][arg2 - 1] != this.anIntArrayArrayArray12[arg0 - 1][arg1][arg2 - 1]) {
				this.anIntArrayArrayArray12[arg0][arg1][arg2] = this.anIntArrayArrayArray12[arg0][arg1][arg2 - 1];
				return;
			}
			if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray12[arg0 - 1][arg1 - 1][arg2 - 1] != this.anIntArrayArrayArray12[arg0][arg1 - 1][arg2 - 1]) {
				this.anIntArrayArrayArray12[arg0][arg1][arg2] = this.anIntArrayArrayArray12[arg0][arg1 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray12[arg0][arg1 - 1][arg2] != 0) {
			this.anIntArrayArrayArray12[arg0][arg1][arg2] = this.anIntArrayArrayArray12[arg0][arg1 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray12[arg0][arg1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray12[arg0][arg1][arg2] = this.anIntArrayArrayArray12[arg0][arg1][arg2 - 1];
			return;
		}
		if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray12[arg0][arg1 - 1][arg2 - 1] != 0) {
			this.anIntArrayArrayArray12[arg0][arg1][arg2] = this.anIntArrayArrayArray12[arg0][arg1 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIII)V")
	public final void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6912; local7++) {
			this.method5534(local7, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([Lclient!iaa;[[[ILclient!oa;I)V")
	public final void method5536(@OriginalArg(0) Class138[] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class90 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean476) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt6918; local10++) {
					for (local14 = 0; local14 < this.anInt6909; local14++) {
						if ((Static267.aByteArrayArrayArray8[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static267.aByteArrayArrayArray8[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg0[local28].method3446(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt6912; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean476) {
				if (Static178.aBoolean280) {
					local14 = 8;
				}
				if (Static552.aBoolean657) {
					local10 = 2;
				}
				if (Static33.anInt615 != 0) {
					local10 |= 0x1;
					if (local6 == 0 | Static111.aBoolean128) {
						local14 |= 0x10;
					}
				}
			}
			if (Static552.aBoolean657) {
				local14 |= 0x7;
			}
			if (!Static113.aBoolean129) {
				local14 |= 0x20;
			}
			@Pc(149) int[][] local149 = arg1 == null || arg1.length <= local6 ? this.anIntArrayArrayArray12[local6] : arg1[local6];
			Static65.method907(local6, arg2.method7477(this.anInt6918, this.anInt6909, this.anIntArrayArrayArray12[local6], local149, local10, local14));
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBII[Lclient!iaa;IILclient!jr;II)V")
	public final void method5537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class138[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class6_Sub12 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(17) int local17 = (arg4 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(58) int local58;
		if (!this.aBoolean476) {
			@Pc(24) Class138 local24 = arg3[arg2];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(45) int local45 = arg5 + Static384.method5632(local26 & 0x7, local30 & 0x7, arg7);
					local58 = arg0 + Static152.method1763(local26 & 0x7, local30 & 0x7, arg7);
					if (local45 > 0 && this.anInt6918 - 1 > local45 && local58 > 0 && local58 < this.anInt6909 - 1) {
						local24.method3445(local45, local58);
					}
				}
			}
		}
		@Pc(102) int local102 = (arg1 & 0x1FFFFFF8) << 3;
		local26 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (arg7 == 1) {
			local112 = 1;
		} else if (arg7 == 2) {
			local110 = 1;
			local112 = 1;
		} else if (arg7 == 3) {
			local110 = 1;
		}
		for (local58 = 0; local58 < this.anInt6912; local58++) {
			for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
				for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
					if (arg8 == local58 && local11 <= local149 && local11 + 8 >= local149 && local17 <= local153 && local17 + 8 >= local153) {
						@Pc(228) int local228;
						@Pc(235) int local235;
						if (local11 + 8 == local149 || local153 == local17 + 8) {
							if (arg7 == 0) {
								local228 = arg5 + local149 - local11;
								local235 = arg0 + local153 - local17;
							} else if (arg7 == 1) {
								local228 = arg5 + local153 - local17;
								local235 = local11 + arg0 + 8 - local149;
							} else if (arg7 == 2) {
								local235 = local17 + arg0 + 8 - local153;
								local228 = arg5 + local11 + 8 - local149;
							} else {
								local228 = local17 + arg5 + 8 - local153;
								local235 = arg0 + local149 - local11;
							}
							this.method5542(arg2, 0, arg6, 0, local153 + local26, 0, local228, true, local102 + local149, local235);
						} else {
							local228 = Static384.method5632(local149 & 0x7, local153 & 0x7, arg7) + arg5;
							local235 = arg0 + Static152.method1763(local149 & 0x7, local153 & 0x7, arg7);
							this.method5542(arg2, local112, arg6, arg7, local26 + local153, local110, local228, false, local102 + local149, local235);
						}
						if (local149 == 63 || local153 == 63) {
							@Pc(370) byte local370 = 1;
							if (local149 == 63 && local153 == 63) {
								local370 = 3;
							}
							for (@Pc(384) int local384 = 0; local384 < local370; local384++) {
								@Pc(388) int local388 = local149;
								@Pc(390) int local390 = local153;
								if (local384 == 0) {
									local388 = local149 == 63 ? 64 : local149;
									local390 = local153 == 63 ? 64 : local153;
								} else if (local384 == 1) {
									local388 = 64;
								} else if (local384 == 2) {
									local390 = 64;
								}
								@Pc(440) int local440;
								@Pc(433) int local433;
								if (arg7 == 0) {
									local433 = local390 + arg0 - local17;
									local440 = local388 + arg5 - local11;
								} else if (arg7 == 1) {
									local433 = local11 + arg0 + 8 - local388;
									local440 = local390 + arg5 - local17;
								} else if (arg7 == 2) {
									local433 = local17 + arg0 + 8 - local390;
									local440 = arg5 + local11 + 8 - local388;
								} else {
									local433 = local388 + arg0 - local11;
									local440 = arg5 + local17 + 8 - local390;
								}
								if (local440 >= 0 && this.anInt6918 > local440 && local433 >= 0 && local433 < this.anInt6909) {
									this.anIntArrayArrayArray12[arg2][local440][local433] = this.anIntArrayArrayArray12[arg2][local110 + local228][local112 + local235];
								}
							}
						}
					} else {
						this.method5542(0, 0, arg6, 0, 0, 0, -1, false, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!on;[ZII[[BII[[B[[BIILclient!jp;Lclient!oa;I)V")
	private void method5538(@OriginalArg(0) Class237 arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class159 arg10, @OriginalArg(12) Class90 arg11, @OriginalArg(13) int arg12) {
		@Pc(22) boolean[] local22 = arg10 != null && arg10.aBoolean339 ? Static134.aBooleanArrayArray6[arg4] : Static484.aBooleanArrayArray8[arg4];
		@Pc(41) int local41;
		@Pc(54) Class159 local54;
		@Pc(72) byte local72;
		@Pc(88) int local88;
		@Pc(93) int local93;
		if (arg2 > 0) {
			if (arg12 > 0) {
				local41 = arg6[arg12 - 1][arg2 - 1] & 0xFF;
				if (local41 > 0) {
					local54 = this.aClass7_5.method89(local41 - 1);
					if (local54.anInt4610 != -1 && local54.aBoolean339) {
						local72 = arg3[arg12 - 1][arg2 - 1];
						local88 = arg7[arg12 - 1][arg2 - 1] * 2 + 4 & 0x7;
						local93 = Static408.method5881(arg11, local54);
						if (Static241.aBooleanArrayArray5[local72][local88]) {
							Static166.anIntArray370[0] = local54.anInt4610;
							Static379.anIntArray492[0] = local93;
							Static228.anIntArray349[0] = arg11.method7480() ? local54.anInt4617 : local54.anInt4612;
							Static362.anIntArray468[0] = local54.anInt4613;
							Static109.anIntArray298[0] = local54.anInt4606;
							Static112.anIntArray155[0] = 256;
						}
					}
				}
			}
			if (arg12 < arg5 - 1) {
				local41 = arg6[arg12 + 1][arg2 - 1] & 0xFF;
				if (local41 > 0) {
					local54 = this.aClass7_5.method89(local41 - 1);
					if (local54.anInt4610 != -1 && local54.aBoolean339) {
						local72 = arg3[arg12 + 1][arg2 - 1];
						local88 = arg7[arg12 + 1][arg2 - 1] * 2 + 6 & 0x7;
						local93 = Static408.method5881(arg11, local54);
						if (Static241.aBooleanArrayArray5[local72][local88]) {
							Static166.anIntArray370[2] = local54.anInt4610;
							Static379.anIntArray492[2] = local93;
							Static228.anIntArray349[2] = arg11.method7480() ? local54.anInt4617 : local54.anInt4612;
							Static362.anIntArray468[2] = local54.anInt4613;
							Static109.anIntArray298[2] = local54.anInt4606;
							Static112.anIntArray155[2] = 512;
						}
					}
				}
			}
		}
		if (arg9 - 1 > arg2) {
			if (arg12 > 0) {
				local41 = arg6[arg12 - 1][arg2 + 1] & 0xFF;
				if (local41 > 0) {
					local54 = this.aClass7_5.method89(local41 - 1);
					if (local54.anInt4610 != -1 && local54.aBoolean339) {
						local72 = arg3[arg12 - 1][arg2 + 1];
						local88 = arg7[arg12 - 1][arg2 + 1] * 2 + 2 & 0x7;
						local93 = Static408.method5881(arg11, local54);
						if (Static241.aBooleanArrayArray5[local72][local88]) {
							Static166.anIntArray370[6] = local54.anInt4610;
							Static379.anIntArray492[6] = local93;
							Static228.anIntArray349[6] = arg11.method7480() ? local54.anInt4617 : local54.anInt4612;
							Static362.anIntArray468[6] = local54.anInt4613;
							Static109.anIntArray298[6] = local54.anInt4606;
							Static112.anIntArray155[6] = 64;
						}
					}
				}
			}
			if (arg5 - 1 > arg12) {
				local41 = arg6[arg12 + 1][arg2 + 1] & 0xFF;
				if (local41 > 0) {
					local54 = this.aClass7_5.method89(local41 - 1);
					if (local54.anInt4610 != -1 && local54.aBoolean339) {
						local72 = arg3[arg12 + 1][arg2 + 1];
						local88 = arg7[arg12 + 1][arg2 + 1] * 2 & 0x7;
						local93 = Static408.method5881(arg11, local54);
						if (Static241.aBooleanArrayArray5[local72][local88]) {
							Static166.anIntArray370[4] = local54.anInt4610;
							Static379.anIntArray492[4] = local93;
							Static228.anIntArray349[4] = arg11.method7480() ? local54.anInt4617 : local54.anInt4612;
							Static362.anIntArray468[4] = local54.anInt4613;
							Static109.anIntArray298[4] = local54.anInt4606;
							Static112.anIntArray155[4] = 128;
						}
					}
				}
			}
		}
		@Pc(516) int local516;
		@Pc(521) int local521;
		@Pc(523) int local523;
		@Pc(504) byte local504;
		if (arg2 > 0) {
			local41 = arg6[arg12][arg2 - 1] & 0xFF;
			if (local41 > 0) {
				local54 = this.aClass7_5.method89(local41 - 1);
				if (local54.anInt4610 != -1) {
					local72 = arg3[arg12][arg2 - 1];
					local504 = arg7[arg12][arg2 - 1];
					if (local54.aBoolean339) {
						local93 = 2;
						local516 = local504 * 2 + 4;
						local521 = Static408.method5881(arg11, local54);
						for (local523 = 0; local523 < 3; local523++) {
							local516 &= 0x7;
							local93 &= 0x7;
							if (Static241.aBooleanArrayArray5[local72][local516] && local54.anInt4606 >= Static109.anIntArray298[local93]) {
								Static166.anIntArray370[local93] = local54.anInt4610;
								Static379.anIntArray492[local93] = local521;
								Static228.anIntArray349[local93] = arg11.method7480() ? local54.anInt4617 : local54.anInt4612;
								Static362.anIntArray468[local93] = local54.anInt4613;
								if (local54.anInt4606 == Static109.anIntArray298[local93]) {
									Static112.anIntArray155[local93] |= 0x20;
								} else {
									Static112.anIntArray155[local93] = 32;
								}
								Static109.anIntArray298[local93] = local54.anInt4606;
							}
							local93--;
							local516++;
						}
						if (!local22[arg8 & 0x3]) {
							arg1[0] = Static134.aBooleanArrayArray6[local72][local504 + 2 & 0x3];
						}
					} else if (!local22[arg8 & 0x3]) {
						arg1[0] = Static484.aBooleanArrayArray8[local72][local504 + 2 & 0x3];
					}
				}
			}
		}
		if (arg2 < arg9 - 1) {
			local41 = arg6[arg12][arg2 + 1] & 0xFF;
			if (local41 > 0) {
				local54 = this.aClass7_5.method89(local41 - 1);
				if (local54.anInt4610 != -1) {
					local72 = arg3[arg12][arg2 + 1];
					local504 = arg7[arg12][arg2 + 1];
					if (local54.aBoolean339) {
						local93 = 4;
						local516 = local504 * 2 + 2;
						local521 = Static408.method5881(arg11, local54);
						for (local523 = 0; local523 < 3; local523++) {
							local93 &= 0x7;
							local516 &= 0x7;
							if (Static241.aBooleanArrayArray5[local72][local516] && local54.anInt4606 >= Static109.anIntArray298[local93]) {
								Static166.anIntArray370[local93] = local54.anInt4610;
								Static379.anIntArray492[local93] = local521;
								Static228.anIntArray349[local93] = arg11.method7480() ? local54.anInt4617 : local54.anInt4612;
								Static362.anIntArray468[local93] = local54.anInt4613;
								if (local54.anInt4606 == Static109.anIntArray298[local93]) {
									Static112.anIntArray155[local93] |= 0x10;
								} else {
									Static112.anIntArray155[local93] = 16;
								}
								Static109.anIntArray298[local93] = local54.anInt4606;
							}
							local516--;
							local93++;
						}
						if (!local22[arg8 + 2 & 0x3]) {
							arg1[2] = Static134.aBooleanArrayArray6[local72][local504 & 0x3];
						}
					} else if (!local22[arg8 + 2 & 0x3]) {
						arg1[2] = Static484.aBooleanArrayArray8[local72][local504 & 0x3];
					}
				}
			}
		}
		if (arg12 > 0) {
			local41 = arg6[arg12 - 1][arg2] & 0xFF;
			if (local41 > 0) {
				local54 = this.aClass7_5.method89(local41 - 1);
				if (local54.anInt4610 != -1) {
					local72 = arg3[arg12 - 1][arg2];
					local504 = arg7[arg12 - 1][arg2];
					if (local54.aBoolean339) {
						local93 = 6;
						local516 = local504 * 2 + 4;
						local521 = Static408.method5881(arg11, local54);
						for (local523 = 0; local523 < 3; local523++) {
							local93 &= 0x7;
							local516 &= 0x7;
							if (Static241.aBooleanArrayArray5[local72][local516] && local54.anInt4606 >= Static109.anIntArray298[local93]) {
								Static166.anIntArray370[local93] = local54.anInt4610;
								Static379.anIntArray492[local93] = local521;
								Static228.anIntArray349[local93] = arg11.method7480() ? local54.anInt4617 : local54.anInt4612;
								Static362.anIntArray468[local93] = local54.anInt4613;
								if (Static109.anIntArray298[local93] == local54.anInt4606) {
									Static112.anIntArray155[local93] |= 0x8;
								} else {
									Static112.anIntArray155[local93] = 8;
								}
								Static109.anIntArray298[local93] = local54.anInt4606;
							}
							local93++;
							local516--;
						}
						if (!local22[arg8 + 3 & 0x3]) {
							arg1[3] = Static134.aBooleanArrayArray6[local72][local504 + 1 & 0x3];
						}
					} else if (!local22[arg8 + 3 & 0x3]) {
						arg1[3] = Static484.aBooleanArrayArray8[local72][local504 + 1 & 0x3];
					}
				}
			}
		}
		if (arg5 - 1 > arg12) {
			local41 = arg6[arg12 + 1][arg2] & 0xFF;
			if (local41 > 0) {
				local54 = this.aClass7_5.method89(local41 - 1);
				if (local54.anInt4610 != -1) {
					local72 = arg3[arg12 + 1][arg2];
					local504 = arg7[arg12 + 1][arg2];
					if (local54.aBoolean339) {
						local93 = 4;
						local516 = local504 * 2 + 6;
						local521 = Static408.method5881(arg11, local54);
						for (local523 = 0; local523 < 3; local523++) {
							local93 &= 0x7;
							local516 &= 0x7;
							if (Static241.aBooleanArrayArray5[local72][local516] && Static109.anIntArray298[local93] <= local54.anInt4606) {
								Static166.anIntArray370[local93] = local54.anInt4610;
								Static379.anIntArray492[local93] = local521;
								Static228.anIntArray349[local93] = arg11.method7480() ? local54.anInt4617 : local54.anInt4612;
								Static362.anIntArray468[local93] = local54.anInt4613;
								if (local54.anInt4606 == Static109.anIntArray298[local93]) {
									Static112.anIntArray155[local93] |= 0x4;
								} else {
									Static112.anIntArray155[local93] = 4;
								}
								Static109.anIntArray298[local93] = local54.anInt4606;
							}
							local93--;
							local516++;
						}
						if (!local22[arg8 + 1 & 0x3]) {
							arg1[1] = Static134.aBooleanArrayArray6[local72][local504 + 3 & 0x3];
						}
					} else if (!local22[arg8 + 1 & 0x3]) {
						arg1[1] = Static484.aBooleanArrayArray8[local72][local504 + 3 & 0x3];
					}
				}
			}
		}
		if (arg10 == null) {
			return;
		}
		local41 = Static408.method5881(arg11, arg10);
		if (!arg10.aBoolean339) {
			return;
		}
		for (@Pc(1222) int local1222 = 0; local1222 < 8; local1222++) {
			@Pc(1233) int local1233 = local1222 - arg8 * 2 & 0x7;
			if (Static241.aBooleanArrayArray5[arg4][local1222] && Static109.anIntArray298[local1233] <= arg10.anInt4606) {
				Static166.anIntArray370[local1233] = arg10.anInt4610;
				Static379.anIntArray492[local1233] = local41;
				Static228.anIntArray349[local1233] = arg11.method7480() ? arg10.anInt4617 : arg10.anInt4612;
				Static362.anIntArray468[local1233] = arg10.anInt4613;
				if (Static109.anIntArray298[local1233] == arg10.anInt4606) {
					Static112.anIntArray155[local1233] |= 0x2;
				} else {
					Static112.anIntArray155[local1233] = 2;
				}
				Static109.anIntArray298[local1233] = arg10.anInt4606;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([[ILclient!oa;Lclient!d;BLclient!d;Lclient!d;I)V")
	private void method5539(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(4) Class46 arg3, @OriginalArg(5) Class46 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray20[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray17[arg5];
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray18[arg5];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray15[arg5];
		for (@Pc(35) int local35 = 0; local35 < this.anInt6918; local35++) {
			@Pc(49) int local49 = this.anInt6918 - 1 <= local35 ? local35 : local35 + 1;
			for (@Pc(51) int local51 = 0; local51 < this.anInt6909; local51++) {
				@Pc(65) int local65 = local51 < this.anInt6909 - 1 ? local51 + 1 : local51;
				if (Static308.anInt5671 == -1 || Static163.method2600(local35, Static308.anInt5671, local51, arg5)) {
					@Pc(80) boolean local80 = false;
					@Pc(82) boolean local82 = false;
					@Pc(85) boolean[] local85 = new boolean[4];
					@Pc(91) int local91 = local10[local35][local51];
					@Pc(97) int local97 = local15[local35][local51];
					@Pc(105) int local105 = local33[local35][local51] & 0xFF;
					@Pc(113) int local113 = local28[local35][local51] & 0xFF;
					@Pc(121) int local121 = local28[local35][local65] & 0xFF;
					@Pc(129) int local129 = local28[local49][local65] & 0xFF;
					@Pc(137) int local137 = local28[local49][local51] & 0xFF;
					if (local105 != 0 || local113 != 0) {
						@Pc(159) Class159 local159 = local105 == 0 ? null : this.aClass7_5.method89(local105 - 1);
						if (local91 == 0 && local159 == null) {
							local91 = 12;
						}
						@Pc(183) Class237 local183 = local113 == 0 ? null : this.aClass41_4.method829(local113 - 1);
						@Pc(185) Class159 local185 = local159;
						if (local159 != null) {
							if (local159.anInt4610 == -1 && local159.anInt4621 == -1) {
								local185 = local159;
								local159 = null;
							} else if (local183 != null && local91 != 0) {
								local82 = local159.aBoolean339;
							}
						}
						@Pc(268) int local268;
						@Pc(325) int local325;
						@Pc(390) int local390;
						@Pc(400) int local400;
						if ((local91 == 0 || local91 == 12) && local35 > 0 && local51 > 0 && this.anInt6918 > local35 && this.anInt6909 > local51) {
							local268 = local113 == local28[local35 - 1][local51 - 1] ? 1 : -1;
							@Pc(287) int local287 = local28[local49][local51 - 1] == local113 ? 1 : -1;
							@Pc(304) int local304 = local113 == local28[local49][local65] ? 1 : -1;
							local325 = local28[local35 - 1][local65] == local113 ? 1 : -1;
							if (local113 == local28[local35][local51 - 1]) {
								local287++;
								local268++;
							} else {
								local268--;
								local287--;
							}
							if (local113 == local28[local49][local51]) {
								local304++;
								local287++;
							} else {
								local287--;
								local304--;
							}
							if (local28[local35][local65] == local113) {
								local325++;
								local304++;
							} else {
								local325--;
								local304--;
							}
							if (local28[local35 - 1][local51] == local113) {
								local268++;
								local325++;
							} else {
								local325--;
								local268--;
							}
							local390 = local268 - local304;
							if (local390 < 0) {
								local390 = -local390;
							}
							local400 = local287 - local325;
							if (local400 < 0) {
								local400 = -local400;
							}
							if (local400 == local390) {
								local390 = arg3.JA(local35, local51) - arg3.JA(local49, local65);
								if (local390 < 0) {
									local390 = -local390;
								}
								local400 = arg3.JA(local49, local51) - arg3.JA(local35, local65);
								if (local400 < 0) {
									local400 = -local400;
								}
							}
							local97 = local390 < local400 ? 1 : 0;
						}
						for (local268 = 0; local268 < 13; local268++) {
							Static109.anIntArray298[local268] = -1;
							Static112.anIntArray155[local268] = 1;
						}
						@Pc(479) boolean[] local479 = local159 != null && local159.aBoolean339 ? Static134.aBooleanArrayArray6[local91] : Static484.aBooleanArrayArray8[local91];
						this.method5538(local183, local85, local51, local10, local91, this.anInt6918, local33, local15, local97, this.anInt6909, local159, arg1, local35);
						@Pc(512) boolean local512 = local159 != null && local159.anInt4621 != local159.anInt4610;
						if (!local512) {
							for (local325 = 0; local325 < 8; local325++) {
								if (Static109.anIntArray298[local325] >= 0 && Static166.anIntArray370[local325] != Static379.anIntArray492[local325]) {
									local512 = true;
									break;
								}
							}
						}
						if (!local479[local97 + 1 & 0x3]) {
							local85[1] = Static283.method4314(local85[1], (Static112.anIntArray155[4] & Static112.anIntArray155[2]) == 0);
						}
						if (!local479[local97 + 3 & 0x3]) {
							local85[3] = Static283.method4314(local85[3], (Static112.anIntArray155[0] & Static112.anIntArray155[6]) == 0);
						}
						if (!local479[local97 & 0x3]) {
							local85[0] = Static283.method4314(local85[0], (Static112.anIntArray155[0] & Static112.anIntArray155[2]) == 0);
						}
						if (!local479[local97 + 2 & 0x3]) {
							local85[2] = Static283.method4314(local85[2], (Static112.anIntArray155[6] & Static112.anIntArray155[4]) == 0);
						}
						if (!local82 && (local91 == 0 || local91 == 12)) {
							if (local85[0] && !local85[1] && !local85[2] && local85[3]) {
								local97 = 0;
								local85[0] = local85[3] = false;
								local91 = local91 == 0 ? 13 : 14;
							} else if (local85[0] && local85[1] && !local85[2] && !local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local85[0] = local85[1] = false;
								local97 = 3;
							} else if (!local85[0] && local85[1] && local85[2] && !local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local97 = 2;
								local85[1] = local85[2] = false;
							} else if (!local85[0] && !local85[1] && local85[2] && local85[3]) {
								local85[2] = local85[3] = false;
								local91 = local91 == 0 ? 13 : 14;
								local97 = 1;
							}
						}
						@Pc(812) boolean local812 = !local82 && !local85[0] && !local85[2] && !local85[1] && !local85[3];
						@Pc(814) int[] local814 = null;
						@Pc(830) int[] local830;
						@Pc(850) int[] local850;
						@Pc(838) int[] local838;
						if (local812) {
							local850 = Static443.anIntArrayArray67[local91];
							local838 = Static373.anIntArrayArray59[local91];
							local830 = Static249.anIntArrayArray42[local91];
							local400 = local159 == null ? 0 : Static355.anIntArray464[local91];
							local390 = local183 == null ? 0 : Static440.anIntArray560[local91];
						} else if (local82) {
							local390 = local183 == null ? 0 : Static355.anIntArray463[local91];
							local838 = Static408.anIntArrayArray64[local91];
							local850 = Static299.anIntArrayArray46[local91];
							local814 = Static257.anIntArrayArray62[local91];
							local830 = Static482.anIntArrayArray72[local91];
							local400 = local159 == null ? 0 : Static198.anIntArray321[local91];
						} else {
							local400 = local159 == null ? 0 : Static432.anIntArray543[local91];
							local830 = Static130.anIntArrayArray18[local91];
							local814 = Static467.anIntArrayArray70[local91];
							local838 = Static417.anIntArrayArray65[local91];
							local390 = local183 == null ? 0 : Static311.anIntArray432[local91];
							local850 = Static376.anIntArrayArray60[local91];
						}
						@Pc(916) int local916 = local390 + local400;
						if (local916 <= 0) {
							Static256.method3972(arg5, local35, local51);
						} else {
							if (local85[0]) {
								local916++;
							}
							if (local85[2]) {
								local916++;
							}
							if (local85[1]) {
								local916++;
							}
							if (local85[3]) {
								local916++;
							}
							@Pc(946) int local946 = 0;
							@Pc(948) int local948 = 0;
							@Pc(952) int local952 = local916 * 3;
							@Pc(959) int[] local959 = local512 ? new int[local952] : null;
							@Pc(962) int[] local962 = new int[local952];
							@Pc(965) int[] local965 = new int[local952];
							@Pc(968) int[] local968 = new int[local952];
							@Pc(971) int[] local971 = new int[local952];
							@Pc(974) int[] local974 = new int[local952];
							@Pc(981) int[] local981 = arg4 == null ? null : new int[local952];
							@Pc(990) int[] local990 = arg4 == null && arg2 == null ? null : new int[local952];
							@Pc(992) int local992 = -1;
							@Pc(994) int local994 = -1;
							@Pc(996) int local996 = 256;
							@Pc(1098) byte local1098;
							@Pc(1046) int local1046;
							@Pc(1048) int local1048;
							@Pc(1280) int local1280;
							@Pc(1286) int local1286;
							@Pc(1295) int local1295;
							@Pc(1300) int local1300;
							@Pc(1323) int local1323;
							@Pc(1305) int local1305;
							@Pc(1318) int local1318;
							@Pc(1373) int local1373;
							@Pc(1380) int local1380;
							if (local159 != null) {
								local992 = local159.anInt4610;
								local994 = arg1.method7480() ? local159.anInt4617 : local159.anInt4612;
								local996 = local159.anInt4613;
								local1046 = Static408.method5881(arg1, local159);
								for (local1048 = 0; local1048 < local400; local1048++) {
									if (local85[-local97 & 0x3] && local946 == local814[0]) {
										Static348.anIntArray460[0] = local830[local946];
										Static348.anIntArray460[1] = 1;
										Static348.anIntArray460[2] = local838[local946];
										Static348.anIntArray460[3] = 1;
										Static348.anIntArray460[4] = local850[local946];
										Static348.anIntArray460[5] = local838[local946];
										local1098 = 6;
									} else if (local85[2 - local97 & 0x3] && local814[2] == local946) {
										Static348.anIntArray460[0] = local830[local946];
										Static348.anIntArray460[1] = 5;
										Static348.anIntArray460[2] = local838[local946];
										Static348.anIntArray460[3] = 5;
										Static348.anIntArray460[4] = local850[local946];
										local1098 = 6;
										Static348.anIntArray460[5] = local838[local946];
									} else if (local85[1 - local97 & 0x3] && local946 == local814[1]) {
										Static348.anIntArray460[0] = local830[local946];
										Static348.anIntArray460[1] = 3;
										Static348.anIntArray460[2] = local838[local946];
										Static348.anIntArray460[3] = 3;
										Static348.anIntArray460[4] = local850[local946];
										local1098 = 6;
										Static348.anIntArray460[5] = local838[local946];
									} else if (local85[3 - local97 & 0x3] && local946 == local814[3]) {
										Static348.anIntArray460[0] = local830[local946];
										Static348.anIntArray460[1] = 7;
										Static348.anIntArray460[2] = local838[local946];
										Static348.anIntArray460[3] = 7;
										Static348.anIntArray460[4] = local850[local946];
										local1098 = 6;
										Static348.anIntArray460[5] = local838[local946];
									} else {
										Static348.anIntArray460[0] = local830[local946];
										Static348.anIntArray460[1] = local850[local946];
										Static348.anIntArray460[2] = local838[local946];
										local1098 = 3;
									}
									local946++;
									for (local1280 = 0; local1280 < local1098; local1280++) {
										local1286 = Static348.anIntArray460[local1280];
										local1295 = local1286 - local97 * 2 & 0x7;
										local1300 = this.anIntArray489[local1286];
										local1305 = this.anIntArray490[local1286];
										if (local97 == 1) {
											local1323 = local1305;
											local1318 = 512 - local1300;
										} else if (local97 == 2) {
											local1318 = 512 - local1305;
											local1323 = 512 - local1300;
										} else if (local97 == 3) {
											local1318 = local1300;
											local1323 = 512 - local1305;
										} else {
											local1318 = local1305;
											local1323 = local1300;
										}
										local962[local948] = local1323;
										local965[local948] = local1318;
										if (local981 != null && Static241.aBooleanArrayArray5[local91][local1286]) {
											local1373 = local1323 + (local35 << 9);
											local1380 = (local51 << 9) + local1318;
											local981[local948] = arg4.sa(local1373, local1380) - arg3.sa(local1373, local1380);
										}
										if (local990 != null) {
											if (arg4 != null && !Static241.aBooleanArrayArray5[local91][local1286]) {
												local1373 = local1323 + (local35 << 9);
												local1380 = local1318 + (local51 << 9);
												local990[local948] = arg3.sa(local1373, local1380) - arg4.sa(local1373, local1380);
											} else if (arg2 != null && !Static180.aBooleanArrayArray3[local91][local1286]) {
												local1373 = local1323 + (local35 << 9);
												local1380 = (local51 << 9) + local1318;
												local990[local948] = arg2.sa(local1373, local1380) - arg3.sa(local1373, local1380);
											}
										}
										if (local1286 < 8 && Static109.anIntArray298[local1295] > local159.anInt4606) {
											if (local959 != null) {
												local959[local948] = Static379.anIntArray492[local1295];
											}
											local974[local948] = Static362.anIntArray468[local1295];
											local971[local948] = Static228.anIntArray349[local1295];
											local968[local948] = Static166.anIntArray370[local1295];
										} else {
											if (local959 != null) {
												local959[local948] = local1046;
											}
											local971[local948] = arg1.method7480() ? local159.anInt4617 : local159.anInt4612;
											local974[local948] = local159.anInt4613;
											local968[local948] = local992;
										}
										local948++;
									}
								}
								if (!this.aBoolean476 && arg5 == 0) {
									Static410.method5900(local35, local51, local159.anInt4608, local159.anInt4622 * 8, local159.anInt4611);
								}
								if (local91 != 12 && local159.anInt4610 != -1 && local159.aBoolean338) {
									local80 = true;
								}
							} else if (local812) {
								local946 = Static355.anIntArray464[local91];
							} else if (local82) {
								local946 = Static198.anIntArray321[local91];
							} else {
								local946 = Static432.anIntArray543[local91];
							}
							if (local183 != null) {
								if (local121 == 0) {
									local121 = local113;
								}
								if (local137 == 0) {
									local137 = local113;
								}
								if (local129 == 0) {
									local129 = local113;
								}
								@Pc(1597) Class237 local1597 = this.aClass41_4.method829(local113 - 1);
								@Pc(1605) Class237 local1605 = this.aClass41_4.method829(local121 - 1);
								@Pc(1613) Class237 local1613 = this.aClass41_4.method829(local129 - 1);
								@Pc(1621) Class237 local1621 = this.aClass41_4.method829(local137 - 1);
								for (local1295 = 0; local1295 < local390; local1295++) {
									if (local85[-local97 & 0x3] && local946 == local814[0]) {
										Static348.anIntArray460[0] = local830[local946];
										Static348.anIntArray460[1] = 1;
										Static348.anIntArray460[2] = local838[local946];
										Static348.anIntArray460[3] = 1;
										Static348.anIntArray460[4] = local850[local946];
										Static348.anIntArray460[5] = local838[local946];
										local1098 = 6;
									} else if (local85[2 - local97 & 0x3] && local814[2] == local946) {
										Static348.anIntArray460[0] = local830[local946];
										Static348.anIntArray460[1] = 5;
										Static348.anIntArray460[2] = local838[local946];
										Static348.anIntArray460[3] = 5;
										Static348.anIntArray460[4] = local850[local946];
										Static348.anIntArray460[5] = local838[local946];
										local1098 = 6;
									} else if (local85[1 - local97 & 0x3] && local814[1] == local946) {
										Static348.anIntArray460[0] = local830[local946];
										Static348.anIntArray460[1] = 3;
										Static348.anIntArray460[2] = local838[local946];
										Static348.anIntArray460[3] = 3;
										Static348.anIntArray460[4] = local850[local946];
										Static348.anIntArray460[5] = local838[local946];
										local1098 = 6;
									} else if (local85[3 - local97 & 0x3] && local946 == local814[3]) {
										Static348.anIntArray460[0] = local830[local946];
										Static348.anIntArray460[1] = 7;
										Static348.anIntArray460[2] = local838[local946];
										Static348.anIntArray460[3] = 7;
										Static348.anIntArray460[4] = local850[local946];
										Static348.anIntArray460[5] = local838[local946];
										local1098 = 6;
									} else {
										Static348.anIntArray460[0] = local830[local946];
										Static348.anIntArray460[1] = local850[local946];
										local1098 = 3;
										Static348.anIntArray460[2] = local838[local946];
									}
									for (local1300 = 0; local1300 < local1098; local1300++) {
										local1323 = Static348.anIntArray460[local1300];
										local1305 = local1323 - local97 * 2 & 0x7;
										local1318 = this.anIntArray489[local1323];
										local1380 = this.anIntArray490[local1323];
										@Pc(1884) int local1884;
										if (local97 == 1) {
											local1884 = 512 - local1318;
											local1373 = local1380;
										} else if (local97 == 2) {
											local1884 = 512 - local1380;
											local1373 = 512 - local1318;
										} else if (local97 == 3) {
											local1884 = local1318;
											local1373 = 512 - local1380;
										} else {
											local1373 = local1318;
											local1884 = local1380;
										}
										local962[local948] = local1373;
										local965[local948] = local1884;
										@Pc(1946) int local1946;
										@Pc(1952) int local1952;
										if (local981 != null && Static241.aBooleanArrayArray5[local91][local1323]) {
											local1946 = (local35 << 9) + local1373;
											local1952 = local1884 + (local51 << 9);
											local981[local948] = arg4.sa(local1946, local1952) - arg3.sa(local1946, local1952);
										}
										if (local990 != null) {
											if (arg4 != null && !Static241.aBooleanArrayArray5[local91][local1323]) {
												local1946 = (local35 << 9) + local1373;
												local1952 = (local51 << 9) + local1884;
												local990[local948] = arg3.sa(local1946, local1952) - arg4.sa(local1946, local1952);
											} else if (arg2 != null && !Static180.aBooleanArrayArray3[local91][local1323]) {
												local1946 = (local35 << 9) + local1373;
												local1952 = local1884 + (local51 << 9);
												local990[local948] = arg2.sa(local1946, local1952) - arg3.sa(local1946, local1952);
											}
										}
										if (local1323 < 8 && Static109.anIntArray298[local1305] >= 0) {
											if (local959 != null) {
												local959[local948] = Static379.anIntArray492[local1305];
											}
											local974[local948] = Static362.anIntArray468[local1305];
											local971[local948] = Static228.anIntArray349[local1305];
											local968[local948] = Static166.anIntArray370[local1305];
										} else {
											if (local82 && Static241.aBooleanArrayArray5[local91][local1323]) {
												local971[local948] = local994;
												local974[local948] = local996;
												local968[local948] = local992;
											} else if (local1373 == 0 && local1884 == 0) {
												local968[local948] = arg0[local35][local51];
												local971[local948] = local1597.anInt6859;
												local974[local948] = local1597.anInt6862;
											} else if (local1373 == 0 && local1884 == 512) {
												local968[local948] = arg0[local35][local65];
												local971[local948] = local1605.anInt6859;
												local974[local948] = local1605.anInt6862;
											} else if (local1373 == 512 && local1884 == 512) {
												local968[local948] = arg0[local49][local65];
												local971[local948] = local1613.anInt6859;
												local974[local948] = local1613.anInt6862;
											} else if (local1373 == 512 && local1884 == 0) {
												local968[local948] = arg0[local49][local51];
												local971[local948] = local1621.anInt6859;
												local974[local948] = local1621.anInt6862;
											} else {
												if (local1373 >= 256) {
													if (local1884 >= 256) {
														local971[local948] = local1613.anInt6859;
														local974[local948] = local1613.anInt6862;
													} else {
														local971[local948] = local1621.anInt6859;
														local974[local948] = local1621.anInt6862;
													}
												} else if (local1884 < 256) {
													local971[local948] = local1597.anInt6859;
													local974[local948] = local1597.anInt6862;
												} else {
													local971[local948] = local1605.anInt6859;
													local974[local948] = local1605.anInt6862;
												}
												local1946 = Static544.method5970(arg0[local35][local51], local1373 << 7 >> 9, arg0[local49][local51]);
												local1952 = Static544.method5970(arg0[local35][local65], local1373 << 7 >> 9, arg0[local49][local65]);
												local968[local948] = Static544.method5970(local1946, local1884 << 7 >> 9, local1952);
											}
											if (local959 != null) {
												local959[local948] = local968[local948];
											}
										}
										local948++;
									}
									local946++;
								}
								if (local91 != 0 && local183.aBoolean470) {
									local80 = true;
								}
							}
							local1046 = arg3.JA(local35, local51);
							local1048 = arg3.JA(local49, local51);
							local1280 = arg3.JA(local49, local65);
							local1286 = arg3.JA(local35, local65);
							if (arg5 > 0) {
								@Pc(2370) boolean local2370 = true;
								if (local113 == 0 && local91 != 0) {
									local2370 = false;
								}
								if (local105 > 0 && local185 != null && !local185.aBoolean340) {
									local2370 = false;
								}
								if (local2370 && local1048 == local1046 && local1280 == local1046 && local1286 == local1046) {
									this.aByteArrayArrayArray16[arg5][local35][local51] = (byte) (this.aByteArrayArrayArray16[arg5][local35][local51] | 0x4);
								}
							}
							local1295 = 0;
							local1300 = 0;
							local1323 = 0;
							if (this.aBoolean476) {
								local1295 = Static393.method5720(local35, local51);
								local1300 = Static334.method5142(local35, local51);
								local1323 = Static4.method72(local35, local51);
							}
							arg3.BA(local35, local51, local962, local981, local965, local990, local968, local959, local971, local974, local1295, local1300, local1323, local80);
							Static256.method3972(arg5, local35, local51);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BI[Lclient!iaa;IILclient!jr;I)V")
	public final void method5541(@OriginalArg(1) int arg0, @OriginalArg(2) Class138[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class6_Sub12 arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean476) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class138 local12 = arg1[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg3;
						@Pc(28) int local28 = local18 + arg0;
						if (local24 >= 0 && this.anInt6918 > local24 && local28 >= 0 && this.anInt6909 > local28) {
							local12.method3445(local24, local28);
						}
					}
				}
			}
		}
		local6 = arg3 + arg5;
		@Pc(75) int local75 = arg0 + arg2;
		for (local14 = 0; local14 < this.anInt6912; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method5542(local14, 0, arg4, 0, local75 + local24, 0, local18 + arg3, false, local18 + local6, arg0 + local24);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBILclient!jr;IIIIZII)V")
	private void method5542(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub12 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg3 == 1) {
			arg1 = 1;
		} else if (arg3 == 2) {
			arg5 = 1;
			arg1 = 1;
		} else if (arg3 == 3) {
			arg5 = 1;
		}
		@Pc(79) int local79;
		if (arg6 < 0 || this.anInt6918 <= arg6 || arg9 < 0 || arg9 >= this.anInt6909) {
			while (true) {
				local79 = arg2.method6019();
				if (local79 == 0) {
					return;
				}
				if (local79 == 1) {
					arg2.method6019();
					return;
				}
				if (local79 <= 49) {
					arg2.method6019();
				}
			}
			return;
		}
		if (!this.aBoolean476 && !arg7) {
			Static267.aByteArrayArrayArray8[arg0][arg6][arg9] = 0;
		}
		while (true) {
			local79 = arg2.method6019();
			if (local79 == 0) {
				if (this.aBoolean476) {
					this.anIntArrayArrayArray12[0][arg6 + arg5][arg9 + arg1] = 0;
					return;
				} else if (arg0 == 0) {
					this.anIntArrayArrayArray12[0][arg5 + arg6][arg9 + arg1] = -Static185.method3092(arg8 + 932731, arg4 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray12[arg0][arg5 + arg6][arg9 + arg1] = this.anIntArrayArrayArray12[arg0 - 1][arg5 + arg6][arg1 + arg9] - 960;
					return;
				}
			}
			if (local79 == 1) {
				@Pc(167) int local167 = arg2.method6019();
				if (this.aBoolean476) {
					this.anIntArrayArrayArray12[0][arg6 + arg5][arg1 + arg9] = local167 * 8 << 2;
					return;
				}
				if (local167 == 1) {
					local167 = 0;
				}
				if (arg0 != 0) {
					this.anIntArrayArrayArray12[arg0][arg6 + arg5][arg9 + arg1] = this.anIntArrayArrayArray12[arg0 - 1][arg5 + arg6][arg1 + arg9] - (local167 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray12[0][arg5 + arg6][arg1 + arg9] = -local167 * 8 << 2;
				return;
			}
			if (local79 <= 49) {
				if (arg7) {
					arg2.method6019();
				} else {
					this.aByteArrayArrayArray15[arg0][arg6][arg9] = arg2.method6049();
					this.aByteArrayArrayArray20[arg0][arg6][arg9] = (byte) ((local79 - 2) / 4);
					this.aByteArrayArrayArray17[arg0][arg6][arg9] = (byte) (arg3 + local79 - 2 & 0x3);
				}
			} else if (local79 <= 81) {
				if (!this.aBoolean476 && !arg7) {
					Static267.aByteArrayArrayArray8[arg0][arg6][arg9] = (byte) (local79 - 49);
				}
			} else if (!arg7) {
				this.aByteArrayArrayArray18[arg0][arg6][arg9] = (byte) (local79 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!d;Lclient!oa;ILclient!d;)V")
	public final void method5544(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(3) Class46 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt6918][this.anInt6909];
		if (Static572.anIntArray721 == null || this.anInt6909 != Static572.anIntArray721.length) {
			Static487.anIntArray604 = new int[this.anInt6909];
			Static507.anIntArray626 = new int[this.anInt6909];
			Static348.anIntArray458 = new int[this.anInt6909];
			Static572.anIntArray721 = new int[this.anInt6909];
			Static134.anIntArray558 = new int[this.anInt6909];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt6912; local44++) {
			for (local48 = 0; local48 < this.anInt6909; local48++) {
				Static572.anIntArray721[local48] = 0;
				Static487.anIntArray604[local48] = 0;
				Static348.anIntArray458[local48] = 0;
				Static134.anIntArray558[local48] = 0;
				Static507.anIntArray626[local48] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt6918; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(178) int local178;
				for (@Pc(81) int local81 = 0; local81 < this.anInt6909; local81++) {
					local87 = local77 + 5;
					@Pc(155) int local155;
					if (this.anInt6918 > local87) {
						local106 = this.aByteArrayArrayArray18[local44][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(119) Class237 local119 = this.aClass41_4.method829(local106 - 1);
							Static572.anIntArray721[local81] += local119.anInt6854;
							Static487.anIntArray604[local81] += local119.anInt6858;
							Static348.anIntArray458[local81] += local119.anInt6861;
							Static134.anIntArray558[local81] += local119.anInt6856;
							local155 = Static507.anIntArray626[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local178 = this.aByteArrayArrayArray18[local44][local106][local81] & 0xFF;
						if (local178 > 0) {
							@Pc(191) Class237 local191 = this.aClass41_4.method829(local178 - 1);
							Static572.anIntArray721[local81] -= local191.anInt6854;
							Static487.anIntArray604[local81] -= local191.anInt6858;
							Static348.anIntArray458[local81] -= local191.anInt6861;
							Static134.anIntArray558[local81] -= local191.anInt6856;
							local155 = Static507.anIntArray626[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local178 = 0;
					@Pc(248) int local248 = 0;
					@Pc(250) int local250 = 0;
					for (@Pc(252) int local252 = -5; local252 < this.anInt6909; local252++) {
						@Pc(258) int local258 = local252 + 5;
						if (this.anInt6909 > local258) {
							local248 += Static134.anIntArray558[local258];
							local178 += Static348.anIntArray458[local258];
							local106 += Static487.anIntArray604[local258];
							local250 += Static507.anIntArray626[local258];
							local87 += Static572.anIntArray721[local258];
						}
						@Pc(300) int local300 = local252 - 5;
						if (local300 >= 0) {
							local250 -= Static507.anIntArray626[local300];
							local106 -= Static487.anIntArray604[local300];
							local87 -= Static572.anIntArray721[local300];
							local248 -= Static134.anIntArray558[local300];
							local178 -= Static348.anIntArray458[local300];
						}
						if (local252 >= 0 && local248 > 0 && local250 > 0) {
							local11[local77][local252] = Static482.method6779(local106 / local250, local178 / local250, local87 * 256 / local248);
						}
					}
				}
			}
			if (Static323.aBoolean443) {
				this.method5539(local11, arg1, local44 == 0 ? arg2 : null, Static205.aClass46Array1[local44], local44 == 0 ? arg0 : null, local44);
			} else {
				this.method5546(local11, arg1, local44, local44 == 0 ? arg0 : null, local44 == 0 ? arg2 : null, Static205.aClass46Array1[local44]);
			}
			this.aByteArrayArrayArray18[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray20[local44] = null;
			this.aByteArrayArrayArray17[local44] = null;
		}
		if (!this.aBoolean476) {
			if (Static33.anInt615 != 0) {
				Static521.method7110();
			}
			if (Static552.aBoolean657) {
				Static365.method5405();
			}
		}
		for (local48 = 0; local48 < this.anInt6912; local48++) {
			Static205.aClass46Array1[local48].ba();
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B[[ILclient!oa;ILclient!d;Lclient!d;Lclient!d;)V")
	private void method5546(@OriginalArg(1) int[][] arg0, @OriginalArg(2) Class90 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class46 arg3, @OriginalArg(5) Class46 arg4, @OriginalArg(6) Class46 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6918; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt6909; local7++) {
				if (Static308.anInt5671 == -1 || Static163.method2600(local3, Static308.anInt5671, local7, arg2)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray20[arg2][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray17[arg2][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray15[arg2][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray18[arg2][local3][local7] & 0xFF;
					@Pc(74) Class159 local74 = local51 == 0 ? null : this.aClass7_5.method89(local51 - 1);
					@Pc(89) Class237 local89 = local62 == 0 ? null : this.aClass41_4.method829(local62 - 1);
					@Pc(91) int local91 = 0;
					@Pc(93) int local93 = 0;
					if (local31 != 0) {
						local91 = local89 == null ? 0 : Static440.anIntArray560[local31];
						local93 = local74 == null ? 0 : Static355.anIntArray464[local31];
					} else if (local74 != null) {
						local93 = Static355.anIntArray464[local31];
					} else if (local89 != null) {
						local91 = Static355.anIntArray464[local31];
					}
					@Pc(131) int local131 = local91 + local93;
					@Pc(133) int local133 = 0;
					if (local131 != 0) {
						@Pc(138) int[] local138 = new int[local131];
						@Pc(141) int[] local141 = new int[local131];
						@Pc(144) int[] local144 = new int[local131];
						@Pc(147) int[] local147 = new int[local131];
						@Pc(149) boolean local149 = false;
						@Pc(173) int local173;
						@Pc(179) int local179;
						if (local74 == null || local74.anInt4610 == -1 && local74.anInt4621 == -1 && local74.anInt4617 == -1) {
							for (local173 = 0; local173 < local93; local173++) {
								local138[local133] = -1;
								local133++;
							}
						} else {
							local173 = arg1.method7480() ? local74.anInt4617 : local74.anInt4612;
							if (Static43.aBoolean54) {
								local173 = -1;
							}
							for (local179 = 0; local179 < local93; local179++) {
								local144[local133] = local173;
								local147[local133] = local74.anInt4613;
								if (local74.anInt4610 == -1) {
									local138[local133] = -1;
								} else {
									local138[local133] = local74.anInt4610;
								}
								if (local74.anInt4621 == -1) {
									local141[local133] = -1;
								} else {
									local149 = true;
									local141[local133] = local74.anInt4621;
								}
								local133++;
							}
							if (!this.aBoolean476 && arg2 == 0) {
								Static410.method5900(local3, local7, local74.anInt4608, local74.anInt4622 * 8, local74.anInt4611);
							}
						}
						if (!local149) {
							local141 = null;
						}
						if (local89 == null) {
							for (local173 = 0; local173 < local91; local173++) {
								local138[local133] = -1;
								local133++;
							}
						} else {
							local173 = local89.anInt6859;
							if (Static43.aBoolean54) {
								local173 = -1;
							}
							for (local179 = 0; local179 < local91; local179++) {
								local144[local133] = local173;
								local147[local133] = local89.anInt6862;
								local138[local133] = arg0[local3][local7];
								if (local141 != null) {
									local141[local133] = -1;
								}
								local133++;
							}
						}
						local173 = this.anIntArray489.length;
						@Pc(326) int[] local326 = new int[local173];
						@Pc(329) int[] local329 = new int[local173];
						@Pc(336) int[] local336 = arg3 == null ? null : new int[local173];
						@Pc(345) int[] local345 = arg3 == null && arg4 == null ? null : new int[local173];
						@Pc(354) int local354;
						@Pc(359) int local359;
						@Pc(437) int local437;
						@Pc(443) int local443;
						for (@Pc(347) int local347 = 0; local347 < local173; local347++) {
							local354 = this.anIntArray489[local347];
							local359 = this.anIntArray490[local347];
							if (local40 == 0) {
								local326[local347] = local354;
								local329[local347] = local359;
							} else if (local40 == 1) {
								local326[local347] = local359;
								local329[local347] = 512 - local354;
							} else if (local40 == 2) {
								local326[local347] = 512 - local354;
								local329[local347] = 512 - local359;
							} else if (local40 == 3) {
								local326[local347] = 512 - local359;
								local329[local347] = local354;
							}
							if (local336 != null && Static241.aBooleanArrayArray5[local31][local347]) {
								local437 = (local3 << 9) + local354;
								local443 = (local7 << 9) + local354;
								local336[local347] = arg3.sa(local437, local443) - arg5.sa(local437, local443);
							}
							if (local345 != null) {
								if (arg3 != null && !Static241.aBooleanArrayArray5[local31][local347]) {
									local437 = (local3 << 9) + local354;
									local443 = local354 + (local7 << 9);
									local345[local347] = arg5.sa(local437, local443) - arg3.sa(local437, local443);
								} else if (arg4 != null && !Static180.aBooleanArrayArray3[local31][local347]) {
									local437 = local354 + (local3 << 9);
									local443 = local354 + (local7 << 9);
									local345[local347] = arg4.sa(local437, local443) - arg5.sa(local437, local443);
								}
							}
						}
						local354 = arg5.JA(local3, local7);
						local359 = arg5.JA(local3 + 1, local7);
						local437 = arg5.JA(local3 + 1, local7 - -1);
						local443 = arg5.JA(local3, local7 + 1);
						if (arg2 > 0) {
							@Pc(565) boolean local565 = true;
							if (local62 == 0 && local31 != 0) {
								local565 = false;
							}
							if (local51 > 0 && local74 != null && !local74.aBoolean340) {
								local565 = false;
							}
							if (local565 && local354 == local359 && local354 == local437 && local443 == local354) {
								this.aByteArrayArrayArray16[arg2][local3][local7] = (byte) (this.aByteArrayArrayArray16[arg2][local3][local7] | 0x4);
							}
						}
						@Pc(623) int local623 = 0;
						@Pc(625) int local625 = 0;
						@Pc(627) int local627 = 0;
						if (this.aBoolean476) {
							local623 = Static393.method5720(local3, local7);
							local625 = Static334.method5142(local3, local7);
							local627 = Static4.method72(local3, local7);
						}
						arg5.method7971(local3, local7, local326, local336, local329, local345, Static249.anIntArrayArray42[local31], Static443.anIntArrayArray67[local31], Static373.anIntArrayArray59[local31], local138, local141, local144, local147, local623, local625, local627);
						Static256.method3972(arg2, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(II[[I)V")
	public final void method5547(@OriginalArg(2) int[][] arg0) {
		@Pc(14) int[][] local14 = this.anIntArrayArrayArray12[0];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6918 + 1; local16++) {
			for (@Pc(20) int local20 = 0; local20 < this.anInt6909 + 1; local20++) {
				local14[local16][local20] += arg0[local16][local20];
			}
		}
	}
}
