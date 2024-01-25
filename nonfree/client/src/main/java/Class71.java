import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public class Class71 {

	@OriginalMember(owner = "client!em", name = "A", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "[I")
	private final int[] anIntArray448 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!em", name = "y", descriptor = "[I")
	private final int[] anIntArray449 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	protected final int anInt6059;

	@OriginalMember(owner = "client!em", name = "q", descriptor = "Lclient!jb;")
	private final Class123 aClass123_4;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "Z")
	public final boolean aBoolean488;

	@OriginalMember(owner = "client!em", name = "z", descriptor = "Lclient!gs;")
	private final Class104 aClass104_3;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public final int anInt6060;

	@OriginalMember(owner = "client!em", name = "r", descriptor = "I")
	protected final int anInt6066;

	@OriginalMember(owner = "client!em", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!em", name = "w", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray106;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!em", name = "B", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IIIZLclient!jb;Lclient!gs;)V")
	protected Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class123 arg4, @OriginalArg(5) Class104 arg5) {
		this.anInt6059 = arg2;
		this.aClass123_4 = arg4;
		this.aBoolean488 = arg3;
		this.aClass104_3 = arg5;
		this.anInt6060 = arg0;
		this.anInt6066 = arg1;
		this.aByteArrayArrayArray11 = new byte[this.anInt6060][this.anInt6066][this.anInt6059];
		this.aByteArrayArrayArray12 = new byte[this.anInt6060][this.anInt6066][this.anInt6059];
		this.aByteArrayArrayArray10 = new byte[this.anInt6060][this.anInt6066 + 1][this.anInt6059 + 1];
		this.anIntArrayArrayArray106 = new int[this.anInt6060][this.anInt6066 + 1][this.anInt6059 + 1];
		this.aByteArrayArrayArray9 = new byte[this.anInt6060][this.anInt6066][this.anInt6059];
		this.aByteArrayArrayArray14 = new byte[this.anInt6060][this.anInt6066][this.anInt6059];
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IILclient!ti;BII[Lclient!oe;III)V")
	public final void method4791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub14 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class181[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean488) {
			@Pc(18) Class181 local18 = arg5[arg3];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static73.method1099(arg8, local24 & 0x7, local20 & 0x7) + arg4;
					local50 = Static453.method2830(arg8, local20 & 0x7, local24 & 0x7) + arg0;
					if (local38 > 0 && this.anInt6066 - 1 > local38 && local50 > 0 && this.anInt6059 - 1 > local50) {
						local18.method3872(local50, local38);
					}
				}
			}
		}
		@Pc(92) int local92 = (arg1 & 0x7) * 8;
		@Pc(98) int local98 = (arg6 & 0xFFFFFFF8) << 3;
		local20 = (arg1 & 0xFFFFFFF8) << 3;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (arg8 == 1) {
			local108 = 1;
		} else if (arg8 == 2) {
			local108 = 1;
			local106 = 1;
		} else if (arg8 == 3) {
			local106 = 1;
		}
		for (local50 = 0; local50 < this.anInt6060; local50++) {
			for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
				for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
					if (local50 == arg7 && local11 <= local154 && local154 <= local11 + 8 && local158 >= local92 && local92 + 8 >= local158) {
						@Pc(240) int local240;
						@Pc(248) int local248;
						if (local11 + 8 == local154 || local92 + 8 == local158) {
							if (arg8 == 0) {
								local248 = local158 + arg0 - local92;
								local240 = arg4 + local154 - local11;
							} else if (arg8 == 1) {
								local248 = arg0 + local11 + 8 - local154;
								local240 = local158 + arg4 - local92;
							} else if (arg8 == 2) {
								local248 = local92 + arg0 + 8 - local158;
								local240 = arg4 + local11 + 8 - local154;
							} else {
								local240 = arg4 + local92 + 8 - local158;
								local248 = arg0 + local154 - local11;
							}
							this.method4802(0, 0, 0, local248, local98 + local154, true, local158 + local20, arg2, arg3, local240);
						} else {
							local240 = Static73.method1099(arg8, local158 & 0x7, local154 & 0x7) + arg4;
							local248 = arg0 + Static453.method2830(arg8, local154 & 0x7, local158 & 0x7);
							this.method4802(local106, arg8, local108, local248, local154 + local98, false, local158 + local20, arg2, arg3, local240);
							if (local154 == 63 || local158 == 63) {
								@Pc(381) int local381 = local154 == 63 ? 64 : local154;
								@Pc(388) int local388 = local158 == 63 ? 64 : local158;
								@Pc(397) int local397;
								@Pc(405) int local405;
								if (arg8 == 0) {
									local397 = arg4 + local381 - local11;
									local405 = local388 + arg0 - local92;
								} else if (arg8 == 1) {
									local405 = arg0 + local11 + 8 - local381;
									local397 = local388 + arg4 - local92;
								} else if (arg8 == 2) {
									local405 = arg0 + local92 + 8 - local388;
									local397 = arg4 + local11 + 8 - local381;
								} else {
									local405 = arg0 + local381 - local11;
									local397 = arg4 + local92 + 8 - local388;
								}
								if (local397 >= 0 && this.anInt6066 > local397 && local405 >= 0 && this.anInt6059 > local405) {
									this.anIntArrayArrayArray106[arg3][local397][local405] = this.anIntArrayArrayArray106[arg3][local106 + local240][local108 + local248];
								}
							}
						}
					} else {
						this.method4802(0, 0, 0, -1, 0, false, 0, arg2, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([ZILclient!on;Lclient!qa;ILclient!mh;I[[BI[[BII[[BI)V")
	private void method4793(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class185 arg2, @OriginalArg(3) Class121 arg3, @OriginalArg(5) Class160 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) int arg12) {
		@Pc(58) int local58;
		if (arg2 != null && arg4 != null || arg4 != null && arg1 == 12 || arg2 != null && arg1 == 0) {
			@Pc(42) boolean[] local42 = arg2 != null && arg2.aBoolean389 ? Static64.aBooleanArrayArray4[arg1] : Static279.aBooleanArrayArray12[arg1];
			@Pc(68) Class185 local68;
			@Pc(85) byte local85;
			@Pc(101) int local101;
			@Pc(106) int local106;
			if (arg12 > 0) {
				if (arg7 > 0) {
					local58 = arg8[arg7 - 1][arg12 - 1] & 0xFF;
					if (local58 > 0) {
						local68 = this.aClass123_4.method2915(local58 - 1);
						if (local68.anInt4860 != -1 && local68.aBoolean389) {
							local85 = arg11[arg7 - 1][arg12 - 1];
							local101 = arg6[arg7 - 1][arg12 - 1] * 2 + 4 & 0x7;
							local106 = Static253.method848(local68, arg3);
							if (Static315.aBooleanArrayArray9[local85][local101]) {
								Static132.anIntArray178[0] = local68.anInt4860;
								Static331.anIntArray446[0] = local106;
								Static55.anIntArray51[0] = arg3.method4605() ? local68.anInt4866 : local68.anInt4873;
								Static407.anIntArray531[0] = local68.anInt4861;
								Static55.anIntArray52[0] = local68.anInt4874;
								Static112.anIntArray113[0] = 256;
							}
						}
					}
				}
				if (arg7 < arg9 - 1) {
					local58 = arg8[arg7 + 1][arg12 - 1] & 0xFF;
					if (local58 > 0) {
						local68 = this.aClass123_4.method2915(local58 - 1);
						if (local68.anInt4860 != -1 && local68.aBoolean389) {
							local85 = arg11[arg7 + 1][arg12 - 1];
							local101 = arg6[arg7 + 1][arg12 - 1] * 2 + 6 & 0x7;
							local106 = Static253.method848(local68, arg3);
							if (Static315.aBooleanArrayArray9[local85][local101]) {
								Static132.anIntArray178[2] = local68.anInt4860;
								Static331.anIntArray446[2] = local106;
								Static55.anIntArray51[2] = arg3.method4605() ? local68.anInt4866 : local68.anInt4873;
								Static407.anIntArray531[2] = local68.anInt4861;
								Static55.anIntArray52[2] = local68.anInt4874;
								Static112.anIntArray113[2] = 512;
							}
						}
					}
				}
			}
			if (arg12 < arg10 - 1) {
				if (arg7 > 0) {
					local58 = arg8[arg7 - 1][arg12 + 1] & 0xFF;
					if (local58 > 0) {
						local68 = this.aClass123_4.method2915(local58 - 1);
						if (local68.anInt4860 != -1 && local68.aBoolean389) {
							local85 = arg11[arg7 - 1][arg12 + 1];
							local101 = arg6[arg7 - 1][arg12 + 1] * 2 + 2 & 0x7;
							local106 = Static253.method848(local68, arg3);
							if (Static315.aBooleanArrayArray9[local85][local101]) {
								Static132.anIntArray178[6] = local68.anInt4860;
								Static331.anIntArray446[6] = local106;
								Static55.anIntArray51[6] = arg3.method4605() ? local68.anInt4866 : local68.anInt4873;
								Static407.anIntArray531[6] = local68.anInt4861;
								Static55.anIntArray52[6] = local68.anInt4874;
								Static112.anIntArray113[6] = 64;
							}
						}
					}
				}
				if (arg9 - 1 > arg7) {
					local58 = arg8[arg7 + 1][arg12 + 1] & 0xFF;
					if (local58 > 0) {
						local68 = this.aClass123_4.method2915(local58 - 1);
						if (local68.anInt4860 != -1 && local68.aBoolean389) {
							local85 = arg11[arg7 + 1][arg12 + 1];
							local101 = --(arg6[arg7 + 1][arg12 + 1] * 2) & 0x7;
							local106 = Static253.method848(local68, arg3);
							if (Static315.aBooleanArrayArray9[local85][local101]) {
								Static132.anIntArray178[4] = local68.anInt4860;
								Static331.anIntArray446[4] = local106;
								Static55.anIntArray51[4] = arg3.method4605() ? local68.anInt4866 : local68.anInt4873;
								Static407.anIntArray531[4] = local68.anInt4861;
								Static55.anIntArray52[4] = local68.anInt4874;
								Static112.anIntArray113[4] = 128;
							}
						}
					}
				}
			}
			@Pc(557) int local557;
			@Pc(562) int local562;
			@Pc(564) int local564;
			@Pc(526) byte local526;
			if (arg12 > 0) {
				local58 = arg8[arg7][arg12 - 1] & 0xFF;
				if (local58 > 0) {
					local68 = this.aClass123_4.method2915(local58 - 1);
					if (local68.anInt4860 != -1) {
						local85 = arg11[arg7][arg12 - 1];
						local526 = arg6[arg7][arg12 - 1];
						if (local68.aBoolean389) {
							local106 = 2;
							local557 = local526 * 2 + 4;
							local562 = Static253.method848(local68, arg3);
							for (local564 = 0; local564 < 3; local564++) {
								local557 &= 0x7;
								local106 &= 0x7;
								if (Static315.aBooleanArrayArray9[local85][local557] && Static55.anIntArray52[local106] <= local68.anInt4874) {
									Static132.anIntArray178[local106] = local68.anInt4860;
									Static331.anIntArray446[local106] = local562;
									Static55.anIntArray51[local106] = arg3.method4605() ? local68.anInt4866 : local68.anInt4873;
									Static407.anIntArray531[local106] = local68.anInt4861;
									if (Static55.anIntArray52[local106] == local68.anInt4874) {
										Static112.anIntArray113[local106] |= 0x20;
									} else {
										Static112.anIntArray113[local106] = 32;
									}
									Static55.anIntArray52[local106] = local68.anInt4874;
								}
								local557++;
								local106--;
							}
							if (!local42[arg5 & 0x3]) {
								arg0[0] = Static64.aBooleanArrayArray4[local85][local526 + 2 & 0x3];
							}
						} else if (!local42[arg5 & 0x3]) {
							arg0[0] = Static279.aBooleanArrayArray12[local85][local526 + 2 & 0x3];
						}
					}
				}
			}
			if (arg10 - 1 > arg12) {
				local58 = arg8[arg7][arg12 + 1] & 0xFF;
				if (local58 > 0) {
					local68 = this.aClass123_4.method2915(local58 - 1);
					if (local68.anInt4860 != -1) {
						local85 = arg11[arg7][arg12 + 1];
						local526 = arg6[arg7][arg12 + 1];
						if (local68.aBoolean389) {
							local106 = 4;
							local557 = local526 * 2 + 2;
							local562 = Static253.method848(local68, arg3);
							for (local564 = 0; local564 < 3; local564++) {
								local106 &= 0x7;
								local557 &= 0x7;
								if (Static315.aBooleanArrayArray9[local85][local557] && local68.anInt4874 >= Static55.anIntArray52[local106]) {
									Static132.anIntArray178[local106] = local68.anInt4860;
									Static331.anIntArray446[local106] = local562;
									Static55.anIntArray51[local106] = arg3.method4605() ? local68.anInt4866 : local68.anInt4873;
									Static407.anIntArray531[local106] = local68.anInt4861;
									if (local68.anInt4874 == Static55.anIntArray52[local106]) {
										Static112.anIntArray113[local106] |= 0x10;
									} else {
										Static112.anIntArray113[local106] = 16;
									}
									Static55.anIntArray52[local106] = local68.anInt4874;
								}
								local557--;
								local106++;
							}
							if (!local42[arg5 + 2 & 0x3]) {
								arg0[2] = Static64.aBooleanArrayArray4[local85][--local526 & 0x3];
							}
						} else if (!local42[arg5 + 2 & 0x3]) {
							arg0[2] = Static279.aBooleanArrayArray12[local85][local526 & 0x3];
						}
					}
				}
			}
			if (arg7 > 0) {
				local58 = arg8[arg7 - 1][arg12] & 0xFF;
				if (local58 > 0) {
					local68 = this.aClass123_4.method2915(local58 - 1);
					if (local68.anInt4860 != -1) {
						local85 = arg11[arg7 - 1][arg12];
						local526 = arg6[arg7 - 1][arg12];
						if (local68.aBoolean389) {
							local106 = 6;
							local557 = local526 * 2 + 4;
							local562 = Static253.method848(local68, arg3);
							for (local564 = 0; local564 < 3; local564++) {
								local557 &= 0x7;
								local106 &= 0x7;
								if (Static315.aBooleanArrayArray9[local85][local557] && local68.anInt4874 >= Static55.anIntArray52[local106]) {
									Static132.anIntArray178[local106] = local68.anInt4860;
									Static331.anIntArray446[local106] = local562;
									Static55.anIntArray51[local106] = arg3.method4605() ? local68.anInt4866 : local68.anInt4873;
									Static407.anIntArray531[local106] = local68.anInt4861;
									if (local68.anInt4874 == Static55.anIntArray52[local106]) {
										Static112.anIntArray113[local106] |= 0x8;
									} else {
										Static112.anIntArray113[local106] = 8;
									}
									Static55.anIntArray52[local106] = local68.anInt4874;
								}
								local106++;
								local557--;
							}
							if (!local42[arg5 + 3 & 0x3]) {
								arg0[3] = Static64.aBooleanArrayArray4[local85][local526 + 1 & 0x3];
							}
						} else if (!local42[arg5 + 3 & 0x3]) {
							arg0[3] = Static279.aBooleanArrayArray12[local85][local526 + 1 & 0x3];
						}
					}
				}
			}
			if (arg7 < arg9 - 1) {
				local58 = arg8[arg7 + 1][arg12] & 0xFF;
				if (local58 > 0) {
					local68 = this.aClass123_4.method2915(local58 - 1);
					if (local68.anInt4860 != -1) {
						local85 = arg11[arg7 + 1][arg12];
						local526 = arg6[arg7 + 1][arg12];
						if (local68.aBoolean389) {
							local106 = 4;
							local557 = local526 * 2 + 6;
							local562 = Static253.method848(local68, arg3);
							for (local564 = 0; local564 < 3; local564++) {
								local557 &= 0x7;
								local106 &= 0x7;
								if (Static315.aBooleanArrayArray9[local85][local557] && local68.anInt4874 >= Static55.anIntArray52[local106]) {
									Static132.anIntArray178[local106] = local68.anInt4860;
									Static331.anIntArray446[local106] = local562;
									Static55.anIntArray51[local106] = arg3.method4605() ? local68.anInt4866 : local68.anInt4873;
									Static407.anIntArray531[local106] = local68.anInt4861;
									if (Static55.anIntArray52[local106] == local68.anInt4874) {
										Static112.anIntArray113[local106] |= 0x4;
									} else {
										Static112.anIntArray113[local106] = 4;
									}
									Static55.anIntArray52[local106] = local68.anInt4874;
								}
								local557++;
								local106--;
							}
							if (!local42[arg5 + 1 & 0x3]) {
								arg0[1] = Static64.aBooleanArrayArray4[local85][local526 + 3 & 0x3];
							}
						} else if (!local42[arg5 + 1 & 0x3]) {
							arg0[1] = Static279.aBooleanArrayArray12[local85][local526 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg2 == null) {
			return;
		}
		@Pc(1256) int local1256 = Static253.method848(arg2, arg3);
		if (!arg2.aBoolean389) {
			return;
		}
		for (local58 = 0; local58 < 8; local58++) {
			@Pc(1272) int local1272 = local58 - arg5 * 2 & 0x7;
			if (Static315.aBooleanArrayArray9[arg1][local58] && arg2.anInt4874 >= Static55.anIntArray52[local1272]) {
				Static132.anIntArray178[local1272] = arg2.anInt4860;
				Static331.anIntArray446[local1272] = local1256;
				Static55.anIntArray51[local1272] = arg3.method4605() ? arg2.anInt4866 : arg2.anInt4873;
				Static407.anIntArray531[local1272] = arg2.anInt4861;
				if (arg2.anInt4874 == Static55.anIntArray52[local1272]) {
					Static112.anIntArray113[local1272] |= 0x2;
				} else {
					Static112.anIntArray113[local1272] = 2;
				}
				Static55.anIntArray52[local1272] = arg2.anInt4874;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I[[IILclient!na;Lclient!qa;Lclient!na;Lclient!na;)V")
	private void method4794(@OriginalArg(1) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class70 arg2, @OriginalArg(4) Class121 arg3, @OriginalArg(5) Class70 arg4, @OriginalArg(6) Class70 arg5) {
		for (@Pc(22) int local22 = 0; local22 < this.anInt6066; local22++) {
			for (@Pc(26) int local26 = 0; local26 < this.anInt6059; local26++) {
				if (Static103.anInt1993 == -1 || Static17.method239(local22, Static103.anInt1993, local26, arg1)) {
					@Pc(49) byte local49 = this.aByteArrayArrayArray11[arg1][local22][local26];
					@Pc(58) byte local58 = this.aByteArrayArrayArray12[arg1][local22][local26];
					@Pc(69) int local69 = this.aByteArrayArrayArray14[arg1][local22][local26] & 0xFF;
					@Pc(80) int local80 = this.aByteArrayArrayArray9[arg1][local22][local26] & 0xFF;
					@Pc(95) Class185 local95 = local69 == 0 ? null : this.aClass123_4.method2915(local69 - 1);
					@Pc(110) Class160 local110 = local80 == 0 ? null : this.aClass104_3.method2058(local80 - 1);
					@Pc(112) int local112 = 0;
					@Pc(114) int local114 = 0;
					if (local49 != 0) {
						local114 = local95 == null ? 0 : Static421.anIntArray557[local49];
						local112 = local110 == null ? 0 : Static267.anIntArray355[local49];
					} else if (local95 != null) {
						local114 = Static421.anIntArray557[local49];
					} else if (local110 != null) {
						local112 = Static421.anIntArray557[local49];
					}
					@Pc(153) int local153 = local114 + local112;
					@Pc(155) int local155 = 0;
					if (local153 != 0) {
						@Pc(163) int[] local163 = new int[local153];
						@Pc(166) int[] local166 = new int[local153];
						@Pc(169) int[] local169 = new int[local153];
						@Pc(172) int[] local172 = new int[local153];
						@Pc(174) boolean local174 = false;
						@Pc(192) int local192;
						@Pc(224) int local224;
						if (local95 == null || local95.anInt4860 == -1 && local95.anInt4868 == -1 && local95.anInt4866 == -1) {
							for (local192 = 0; local192 < local114; local192++) {
								local163[local155] = -1;
								local155++;
							}
						} else {
							local192 = arg3.method4605() ? local95.anInt4866 : local95.anInt4873;
							if (Static410.aBoolean597) {
								local192 = -1;
							}
							for (local224 = 0; local224 < local114; local224++) {
								local169[local155] = local192;
								local172[local155] = local95.anInt4861;
								if (local95.anInt4860 == -1) {
									local163[local155] = -1;
								} else {
									local163[local155] = local95.anInt4860;
								}
								if (local95.anInt4868 == -1) {
									local166[local155] = -1;
								} else {
									local166[local155] = local95.anInt4868;
									local174 = true;
								}
								local155++;
							}
							if (!this.aBoolean488 && arg1 == 0) {
								Static380.method5356(local22, local26, local95.anInt4870, local95.anInt4865 * 8, local95.anInt4863);
							}
						}
						if (!local174) {
							local166 = null;
						}
						if (local110 == null) {
							for (local192 = 0; local192 < local112; local192++) {
								local163[local155] = -1;
								local155++;
							}
						} else {
							local192 = local110.anInt4276;
							if (Static410.aBoolean597) {
								local192 = -1;
							}
							for (local224 = 0; local224 < local112; local224++) {
								local169[local155] = local192;
								local172[local155] = local110.anInt4285;
								local163[local155] = arg0[local22][local26];
								if (local166 != null) {
									local166[local155] = -1;
								}
								local155++;
							}
						}
						local192 = this.anIntArray448.length;
						@Pc(363) int[] local363 = new int[local192];
						@Pc(366) int[] local366 = new int[local192];
						@Pc(373) int[] local373 = arg2 == null ? null : new int[local192];
						@Pc(382) int[] local382 = arg2 == null && arg4 == null ? null : new int[local192];
						@Pc(391) int local391;
						@Pc(396) int local396;
						@Pc(481) int local481;
						@Pc(488) int local488;
						for (@Pc(384) int local384 = 0; local384 < local192; local384++) {
							local391 = this.anIntArray448[local384];
							local396 = this.anIntArray449[local384];
							if (local58 == 0) {
								local363[local384] = local391;
								local366[local384] = local396;
							} else if (local58 == 1) {
								local363[local384] = local396;
								local366[local384] = 128 - local391;
							} else if (local58 == 2) {
								local363[local384] = 128 - local391;
								local366[local384] = 128 - local396;
							} else if (local58 == 3) {
								local363[local384] = 128 - local396;
								local366[local384] = local391;
							}
							if (local373 != null && Static315.aBooleanArrayArray9[local49][local384]) {
								local481 = local391 + (local22 << 7);
								local488 = (local26 << 7) + local391;
								local373[local384] = arg2.va(local481, local488) - arg5.va(local481, local488);
							}
							if (local382 != null) {
								if (arg2 != null && !Static315.aBooleanArrayArray9[local49][local384]) {
									local481 = local391 + (local22 << 7);
									local488 = (local26 << 7) + local391;
									local382[local384] = arg5.va(local481, local488) - arg2.va(local481, local488);
								} else if (arg4 != null && !Static288.aBooleanArrayArray8[local49][local384]) {
									local481 = local391 + (local22 << 7);
									local488 = local391 + (local26 << 7);
									local382[local384] = arg4.va(local481, local488) - arg5.va(local481, local488);
								}
							}
						}
						local391 = arg5.I(local22, local26);
						local396 = arg5.I(local22 + 1, local26);
						local481 = arg5.I(local22 + 1, local26 + 1);
						local488 = arg5.I(local22, local26 + 1);
						if (arg1 > 0) {
							@Pc(608) boolean local608 = true;
							if (local80 == 0 && local49 != 0) {
								local608 = false;
							}
							if (local69 > 0 && local95 != null && !local95.aBoolean387) {
								local608 = false;
							}
							if (local608 && local396 == local391 && local481 == local391 && local488 == local391) {
								this.aByteArrayArrayArray10[arg1][local22][local26] = (byte) (this.aByteArrayArrayArray10[arg1][local22][local26] | 0x4);
							}
						}
						@Pc(669) int local669 = 0;
						@Pc(671) int local671 = 0;
						@Pc(673) int local673 = 0;
						if (this.aBoolean488) {
							local669 = Static233.method3388(local22, local26);
							local671 = Static59.method899(local22, local26);
							local673 = Static440.method5907(local22, local26);
						}
						arg5.method4261(local22, local26, local363, local373, local366, local382, Static335.anIntArrayArray45[local49], Static410.anIntArrayArray54[local49], Static298.anIntArrayArray34[local49], local163, local166, local169, local172, local669, local671, local673);
						Static221.method5883(arg1, local22, local26);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([[[II[Lclient!oe;Lclient!qa;)V")
	public final void method4795(@OriginalArg(0) int[][][] arg0, @OriginalArg(2) Class181[] arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean488) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt6066; local14++) {
					for (local18 = 0; local18 < this.anInt6059; local18++) {
						if ((Static228.aByteArrayArrayArray8[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static228.aByteArrayArrayArray8[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg1[local32].method3870(local14, local18);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt6060; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean488) {
				if (Static138.aBoolean636) {
					local18 = 8;
				}
				if (Static53.aBoolean76) {
					local14 = 2;
				}
				if (Static197.anInt3553 != 0) {
					if (Static313.aBoolean427 | local10 == 0) {
						local18 |= 0x10;
					}
					local14 |= 0x1;
				}
			}
			if (Static53.aBoolean76) {
				local18 |= 0x7;
			}
			if (!Static277.aBoolean370) {
				local18 |= 0x20;
			}
			@Pc(164) int[][] local164 = arg0 == null || arg0.length <= local10 ? this.anIntArrayArrayArray106[local10] : arg0[local10];
			Static144.method2320(local10, arg2.method4580(this.anInt6066, this.anInt6059, this.anIntArrayArrayArray106[local10], local164, local14, local18));
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!qa;Lclient!na;Lclient!na;)V")
	public final void method4797(@OriginalArg(1) Class121 arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) Class70 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt6066][this.anInt6059];
		if (Static12.anIntArray15 == null || Static12.anIntArray15.length != this.anInt6059) {
			Static139.anIntArray201 = new int[this.anInt6059];
			Static412.anIntArray545 = new int[this.anInt6059];
			Static199.anIntArray292 = new int[this.anInt6059];
			Static159.anIntArray218 = new int[this.anInt6059];
			Static12.anIntArray15 = new int[this.anInt6059];
		}
		@Pc(54) int local54;
		for (@Pc(50) int local50 = 0; local50 < this.anInt6060; local50++) {
			for (local54 = 0; local54 < this.anInt6059; local54++) {
				Static12.anIntArray15[local54] = 0;
				Static412.anIntArray545[local54] = 0;
				Static199.anIntArray292[local54] = 0;
				Static139.anIntArray201[local54] = 0;
				Static159.anIntArray218[local54] = 0;
			}
			for (@Pc(87) int local87 = -5; local87 < this.anInt6066; local87++) {
				@Pc(97) int local97;
				@Pc(116) int local116;
				@Pc(185) int local185;
				for (@Pc(91) int local91 = 0; local91 < this.anInt6059; local91++) {
					local97 = local87 + 5;
					@Pc(162) int local162;
					if (local97 < this.anInt6066) {
						local116 = this.aByteArrayArrayArray9[local50][local97][local91] & 0xFF;
						if (local116 > 0) {
							@Pc(126) Class160 local126 = this.aClass104_3.method2058(local116 - 1);
							Static12.anIntArray15[local91] += local126.anInt4287;
							Static412.anIntArray545[local91] += local126.anInt4277;
							Static199.anIntArray292[local91] += local126.anInt4281;
							Static139.anIntArray201[local91] += local126.anInt4278;
							local162 = Static159.anIntArray218[local91]++;
						}
					}
					local116 = local87 - 5;
					if (local116 >= 0) {
						local185 = this.aByteArrayArrayArray9[local50][local116][local91] & 0xFF;
						if (local185 > 0) {
							@Pc(198) Class160 local198 = this.aClass104_3.method2058(local185 - 1);
							Static12.anIntArray15[local91] -= local198.anInt4287;
							Static412.anIntArray545[local91] -= local198.anInt4277;
							Static199.anIntArray292[local91] -= local198.anInt4281;
							Static139.anIntArray201[local91] -= local198.anInt4278;
							local162 = Static159.anIntArray218[local91]--;
						}
					}
				}
				if (local87 >= 0) {
					local97 = 0;
					local116 = 0;
					local185 = 0;
					@Pc(259) int local259 = 0;
					@Pc(261) int local261 = 0;
					for (@Pc(263) int local263 = -5; local263 < this.anInt6059; local263++) {
						@Pc(269) int local269 = local263 + 5;
						if (this.anInt6059 > local269) {
							local97 += Static12.anIntArray15[local269];
							local185 += Static199.anIntArray292[local269];
							local259 += Static139.anIntArray201[local269];
							local116 += Static412.anIntArray545[local269];
							local261 += Static159.anIntArray218[local269];
						}
						@Pc(307) int local307 = local263 - 5;
						if (local307 >= 0) {
							local185 -= Static199.anIntArray292[local307];
							local116 -= Static412.anIntArray545[local307];
							local259 -= Static139.anIntArray201[local307];
							local97 -= Static12.anIntArray15[local307];
							local261 -= Static159.anIntArray218[local307];
						}
						if (local263 >= 0 && local259 > 0 && local261 > 0) {
							local11[local87][local263] = Static59.method898(local185 / local261, local97 * 256 / local259, local116 / local261);
						}
					}
				}
			}
			if (Static80.aBoolean532) {
				this.method4801(local11, Static256.aClass70Array2[local50], arg0, local50 == 0 ? arg1 : null, local50, local50 == 0 ? arg2 : null);
			} else {
				this.method4794(local11, local50, local50 == 0 ? arg1 : null, arg0, local50 == 0 ? arg2 : null, Static256.aClass70Array2[local50]);
			}
			this.aByteArrayArrayArray9[local50] = null;
			this.aByteArrayArrayArray14[local50] = null;
			this.aByteArrayArrayArray11[local50] = null;
			this.aByteArrayArrayArray12[local50] = null;
		}
		if (!this.aBoolean488) {
			if (Static197.anInt3553 != 0) {
				Static420.method5676();
			}
			if (Static53.aBoolean76) {
				Static266.method5736();
			}
		}
		for (local54 = 0; local54 < this.anInt6060; local54++) {
			Static256.aClass70Array2[local54].f();
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
	public final void method4798(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt6060; local9++) {
			this.method4803(local9, 64, arg1, arg0, 64);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I[Lclient!oe;ZIIILclient!ti;)V")
	public final void method4799(@OriginalArg(0) int arg0, @OriginalArg(1) Class181[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub14 arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean488) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class181 local12 = arg1[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = arg3 + local14;
						@Pc(28) int local28 = local18 + arg2;
						if (local24 >= 0 && local24 < this.anInt6066 && local28 >= 0 && local28 < this.anInt6059) {
							local12.method3872(local28, local24);
						}
					}
				}
			}
		}
		local6 = arg3 + arg4;
		@Pc(73) int local73 = arg2 + arg0;
		for (local14 = 0; local14 < this.anInt6060; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method4802(0, 0, 0, local24 + arg2, local18 + local6, false, local73 + local24, arg5, local14, local18 + arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([[IIZ)V")
	public final void method4800(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray106[0];
		for (@Pc(23) int local23 = 0; local23 < this.anInt6066 + 1; local23++) {
			for (@Pc(27) int local27 = 0; local27 < this.anInt6059 + 1; local27++) {
				local10[local23][local27] += arg0[local23][local27];
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([[ILclient!na;Lclient!qa;Lclient!na;BILclient!na;)V")
	private void method4801(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class70 arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class70 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class70 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg4];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray12[arg4];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray9[arg4];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray14[arg4];
		for (@Pc(27) int local27 = 0; local27 < this.anInt6066; local27++) {
			@Pc(41) int local41 = this.anInt6066 - 1 > local27 ? local27 + 1 : local27;
			for (@Pc(43) int local43 = 0; local43 < this.anInt6059; local43++) {
				@Pc(61) int local61 = this.anInt6059 - 1 > local43 ? local43 + 1 : local43;
				if (Static103.anInt1993 == -1 || Static17.method239(local27, Static103.anInt1993, local43, arg4)) {
					@Pc(75) boolean local75 = false;
					@Pc(77) boolean local77 = false;
					@Pc(80) boolean[] local80 = new boolean[4];
					@Pc(86) int local86 = local10[local27][local43];
					@Pc(92) int local92 = local15[local27][local43];
					@Pc(100) int local100 = local25[local27][local43] & 0xFF;
					@Pc(108) int local108 = local20[local27][local43] & 0xFF;
					@Pc(116) int local116 = local20[local27][local61] & 0xFF;
					@Pc(124) int local124 = local20[local41][local61] & 0xFF;
					@Pc(132) int local132 = local20[local41][local43] & 0xFF;
					if (local100 != 0 || local108 != 0) {
						@Pc(154) Class185 local154 = local100 == 0 ? null : this.aClass123_4.method2915(local100 - 1);
						@Pc(166) Class160 local166 = local108 == 0 ? null : this.aClass104_3.method2058(local108 - 1);
						if (local86 == 0 && local154 == null) {
							local86 = 12;
						}
						@Pc(177) Class185 local177 = local154;
						if (local154 != null) {
							if (local154.anInt4860 == -1 && local154.anInt4868 == -1) {
								local177 = local154;
								local154 = null;
							} else if (local166 != null && local86 != 0) {
								local77 = local154.aBoolean389;
							}
						}
						@Pc(266) int local266;
						@Pc(332) int local332;
						@Pc(385) int local385;
						@Pc(395) int local395;
						if ((local86 == 0 || local86 == 12) && local27 > 0 && local43 > 0 && local27 < this.anInt6066 && this.anInt6059 > local43) {
							local266 = local108 == local20[local27 - 1][local43 - 1] ? 1 : -1;
							@Pc(283) int local283 = local108 == local20[local41][local61] ? 1 : -1;
							@Pc(302) int local302 = local108 == local20[local41][local43 - 1] ? 1 : -1;
							if (local108 == local20[local27][local43 - 1]) {
								local266++;
								local302++;
							} else {
								local302--;
								local266--;
							}
							local332 = local20[local27 - 1][local61] == local108 ? 1 : -1;
							if (local20[local41][local43] == local108) {
								local302++;
								local283++;
							} else {
								local302--;
								local283--;
							}
							if (local108 == local20[local27][local61]) {
								local332++;
								local283++;
							} else {
								local332--;
								local283--;
							}
							if (local108 == local20[local27 - 1][local43]) {
								local266++;
								local332++;
							} else {
								local332--;
								local266--;
							}
							local385 = local266 - local283;
							if (local385 < 0) {
								local385 = -local385;
							}
							local395 = local302 - local332;
							if (local395 < 0) {
								local395 = -local395;
							}
							if (local385 == local395) {
								local385 = arg1.I(local27, local43) - arg1.I(local41, local61);
								local395 = arg1.I(local41, local43) - arg1.I(local27, local61);
								if (local385 < 0) {
									local385 = -local385;
								}
								if (local395 < 0) {
									local395 = -local395;
								}
							}
							local92 = local395 <= local385 ? 0 : 1;
						}
						for (local266 = 0; local266 < 13; local266++) {
							Static55.anIntArray52[local266] = -1;
							Static112.anIntArray113[local266] = 1;
						}
						@Pc(482) boolean[] local482 = local154 != null && local154.aBoolean389 ? Static64.aBooleanArrayArray4[local86] : Static279.aBooleanArrayArray12[local86];
						this.method4793(local80, local86, local154, arg2, local166, local92, local15, local27, local25, this.anInt6066, this.anInt6059, local10, local43);
						@Pc(515) boolean local515 = local154 != null && local154.anInt4860 != local154.anInt4868;
						if (!local515) {
							for (local332 = 0; local332 < 8; local332++) {
								if (Static55.anIntArray52[local332] >= 0 && Static132.anIntArray178[local332] != Static331.anIntArray446[local332]) {
									local515 = true;
									break;
								}
							}
						}
						if (!local482[local92 + 1 & 0x3]) {
							local80[1] = Static99.method1610(local80[1], (Static112.anIntArray113[2] & Static112.anIntArray113[4]) == 0);
						}
						if (!local482[local92 + 3 & 0x3]) {
							local80[3] = Static99.method1610(local80[3], (Static112.anIntArray113[0] & Static112.anIntArray113[6]) == 0);
						}
						if (!local482[local92 & 0x3]) {
							local80[0] = Static99.method1610(local80[0], (Static112.anIntArray113[0] & Static112.anIntArray113[2]) == 0);
						}
						if (!local482[local92 + 2 & 0x3]) {
							local80[2] = Static99.method1610(local80[2], (Static112.anIntArray113[4] & Static112.anIntArray113[6]) == 0);
						}
						if (!local77 && (local86 == 0 || local86 == 12)) {
							if (local80[0] && !local80[1] && !local80[2] && local80[3]) {
								local86 = local86 == 0 ? 13 : 14;
								local80[0] = local80[3] = false;
								local92 = 0;
							} else if (local80[0] && local80[1] && !local80[2] && !local80[3]) {
								local86 = local86 == 0 ? 13 : 14;
								local92 = 3;
								local80[0] = local80[1] = false;
							} else if (!local80[0] && local80[1] && local80[2] && !local80[3]) {
								local80[1] = local80[2] = false;
								local86 = local86 == 0 ? 13 : 14;
								local92 = 2;
							} else if (!local80[0] && !local80[1] && local80[2] && local80[3]) {
								local80[2] = local80[3] = false;
								local86 = local86 == 0 ? 13 : 14;
								local92 = 1;
							}
						}
						@Pc(827) boolean local827 = !local77 && !local80[0] && !local80[2] && !local80[1] && !local80[3];
						@Pc(829) int[] local829 = null;
						@Pc(845) int[] local845;
						@Pc(861) int[] local861;
						@Pc(865) int[] local865;
						if (local827) {
							local865 = Static298.anIntArrayArray34[local86];
							local385 = local166 == null ? 0 : Static267.anIntArray355[local86];
							local845 = Static335.anIntArrayArray45[local86];
							local861 = Static410.anIntArrayArray54[local86];
							local395 = local154 == null ? 0 : Static421.anIntArray557[local86];
						} else if (local77) {
							local395 = local154 == null ? 0 : Static166.anIntArray226[local86];
							local861 = Static286.anIntArrayArray33[local86];
							local865 = Static78.anIntArrayArray6[local86];
							local385 = local166 == null ? 0 : Static424.anIntArray559[local86];
							local829 = Static274.anIntArrayArray28[local86];
							local845 = Static316.anIntArrayArray41[local86];
						} else {
							local395 = local154 == null ? 0 : Static98.anIntArray97[local86];
							local845 = Static346.anIntArrayArray46[local86];
							local385 = local166 == null ? 0 : Static110.anIntArray112[local86];
							local829 = Static397.anIntArrayArray53[local86];
							local861 = Static67.anIntArrayArray3[local86];
							local865 = Static149.anIntArrayArray16[local86];
						}
						@Pc(931) int local931 = local395 + local385;
						if (local931 <= 0) {
							Static221.method5883(arg4, local27, local43);
						} else {
							if (local80[0]) {
								local931++;
							}
							if (local80[2]) {
								local931++;
							}
							if (local80[1]) {
								local931++;
							}
							if (local80[3]) {
								local931++;
							}
							@Pc(964) int local964 = 0;
							@Pc(966) int local966 = 0;
							@Pc(970) int local970 = local931 * 3;
							@Pc(977) int[] local977 = local515 ? new int[local970] : null;
							@Pc(980) int[] local980 = new int[local970];
							@Pc(983) int[] local983 = new int[local970];
							@Pc(986) int[] local986 = new int[local970];
							@Pc(989) int[] local989 = new int[local970];
							@Pc(992) int[] local992 = new int[local970];
							@Pc(999) int[] local999 = arg3 == null ? null : new int[local970];
							@Pc(1008) int[] local1008 = arg3 == null && arg5 == null ? null : new int[local970];
							@Pc(1010) int local1010 = -1;
							@Pc(1012) int local1012 = -1;
							@Pc(1014) int local1014 = 256;
							@Pc(1116) byte local1116;
							@Pc(1066) int local1066;
							@Pc(1068) int local1068;
							@Pc(1299) int local1299;
							@Pc(1305) int local1305;
							@Pc(1314) int local1314;
							@Pc(1319) int local1319;
							@Pc(1341) int local1341;
							@Pc(1324) int local1324;
							@Pc(1343) int local1343;
							@Pc(1395) int local1395;
							@Pc(1401) int local1401;
							if (local154 != null) {
								local1010 = local154.anInt4860;
								local1012 = arg2.method4605() ? local154.anInt4866 : local154.anInt4873;
								local1014 = local154.anInt4861;
								local1066 = Static253.method848(local154, arg2);
								for (local1068 = 0; local1068 < local395; local1068++) {
									if (local80[-local92 & 0x3] && local829[0] == local964) {
										Static28.anIntArray29[0] = local845[local964];
										Static28.anIntArray29[1] = 1;
										Static28.anIntArray29[2] = local865[local964];
										Static28.anIntArray29[3] = 1;
										Static28.anIntArray29[4] = local861[local964];
										local1116 = 6;
										Static28.anIntArray29[5] = local865[local964];
									} else if (local80[2 - local92 & 0x3] && local829[2] == local964) {
										Static28.anIntArray29[0] = local845[local964];
										Static28.anIntArray29[1] = 5;
										Static28.anIntArray29[2] = local865[local964];
										Static28.anIntArray29[3] = 5;
										Static28.anIntArray29[4] = local861[local964];
										Static28.anIntArray29[5] = local865[local964];
										local1116 = 6;
									} else if (local80[1 - local92 & 0x3] && local829[1] == local964) {
										Static28.anIntArray29[0] = local845[local964];
										Static28.anIntArray29[1] = 3;
										Static28.anIntArray29[2] = local865[local964];
										Static28.anIntArray29[3] = 3;
										Static28.anIntArray29[4] = local861[local964];
										Static28.anIntArray29[5] = local865[local964];
										local1116 = 6;
									} else if (local80[3 - local92 & 0x3] && local829[3] == local964) {
										Static28.anIntArray29[0] = local845[local964];
										Static28.anIntArray29[1] = 7;
										Static28.anIntArray29[2] = local865[local964];
										Static28.anIntArray29[3] = 7;
										Static28.anIntArray29[4] = local861[local964];
										local1116 = 6;
										Static28.anIntArray29[5] = local865[local964];
									} else {
										Static28.anIntArray29[0] = local845[local964];
										Static28.anIntArray29[1] = local861[local964];
										local1116 = 3;
										Static28.anIntArray29[2] = local865[local964];
									}
									for (local1299 = 0; local1299 < local1116; local1299++) {
										local1305 = Static28.anIntArray29[local1299];
										local1314 = local1305 - local92 * 2 & 0x7;
										local1319 = this.anIntArray448[local1305];
										local1324 = this.anIntArray449[local1305];
										if (local92 == 1) {
											local1343 = 128 - local1319;
											local1341 = local1324;
										} else if (local92 == 2) {
											local1343 = 128 - local1324;
											local1341 = 128 - local1319;
										} else if (local92 == 3) {
											local1341 = 128 - local1324;
											local1343 = local1319;
										} else {
											local1341 = local1319;
											local1343 = local1324;
										}
										local980[local966] = local1341;
										local983[local966] = local1343;
										if (local999 != null && Static315.aBooleanArrayArray9[local86][local1305]) {
											local1395 = local1341 + (local27 << 7);
											local1401 = (local43 << 7) + local1343;
											local999[local966] = arg3.va(local1395, local1401) - arg1.va(local1395, local1401);
										}
										if (local1008 != null) {
											if (arg3 != null && !Static315.aBooleanArrayArray9[local86][local1305]) {
												local1395 = local1341 + (local27 << 7);
												local1401 = (local43 << 7) + local1343;
												local1008[local966] = arg1.va(local1395, local1401) - arg3.va(local1395, local1401);
											} else if (arg5 != null && !Static288.aBooleanArrayArray8[local86][local1305]) {
												local1395 = (local27 << 7) + local1341;
												local1401 = local1343 + (local43 << 7);
												local1008[local966] = arg5.va(local1395, local1401) - arg1.va(local1395, local1401);
											}
										}
										if (local1305 < 8 && local154.anInt4874 < Static55.anIntArray52[local1314]) {
											if (local977 != null) {
												local977[local966] = Static331.anIntArray446[local1314];
											}
											local992[local966] = Static407.anIntArray531[local1314];
											local989[local966] = Static55.anIntArray51[local1314];
											local986[local966] = Static132.anIntArray178[local1314];
										} else {
											if (local977 != null) {
												local977[local966] = local1066;
											}
											local989[local966] = arg2.method4605() ? local154.anInt4866 : local154.anInt4873;
											local992[local966] = local154.anInt4861;
											local986[local966] = local1010;
										}
										local966++;
									}
									local964++;
								}
								if (!this.aBoolean488 && arg4 == 0) {
									Static380.method5356(local27, local43, local154.anInt4870, local154.anInt4865 * 8, local154.anInt4863);
								}
								if (local86 != 12 && local154.anInt4860 != -1 && local154.aBoolean388) {
									local75 = true;
								}
							} else if (local827) {
								local964 = Static421.anIntArray557[local86];
							} else if (local77) {
								local964 = Static166.anIntArray226[local86];
							} else {
								local964 = Static98.anIntArray97[local86];
							}
							if (local166 != null) {
								if (local132 == 0) {
									local132 = local108;
								}
								if (local124 == 0) {
									local124 = local108;
								}
								if (local116 == 0) {
									local116 = local108;
								}
								@Pc(1618) Class160 local1618 = this.aClass104_3.method2058(local108 - 1);
								@Pc(1626) Class160 local1626 = this.aClass104_3.method2058(local116 - 1);
								@Pc(1634) Class160 local1634 = this.aClass104_3.method2058(local124 - 1);
								@Pc(1642) Class160 local1642 = this.aClass104_3.method2058(local132 - 1);
								for (local1314 = 0; local1314 < local385; local1314++) {
									if (local80[-local92 & 0x3] && local964 == local829[0]) {
										Static28.anIntArray29[0] = local845[local964];
										Static28.anIntArray29[1] = 1;
										Static28.anIntArray29[2] = local865[local964];
										Static28.anIntArray29[3] = 1;
										Static28.anIntArray29[4] = local861[local964];
										local1116 = 6;
										Static28.anIntArray29[5] = local865[local964];
									} else if (local80[2 - local92 & 0x3] && local829[2] == local964) {
										Static28.anIntArray29[0] = local845[local964];
										Static28.anIntArray29[1] = 5;
										Static28.anIntArray29[2] = local865[local964];
										Static28.anIntArray29[3] = 5;
										Static28.anIntArray29[4] = local861[local964];
										local1116 = 6;
										Static28.anIntArray29[5] = local865[local964];
									} else if (local80[1 - local92 & 0x3] && local964 == local829[1]) {
										Static28.anIntArray29[0] = local845[local964];
										Static28.anIntArray29[1] = 3;
										Static28.anIntArray29[2] = local865[local964];
										Static28.anIntArray29[3] = 3;
										Static28.anIntArray29[4] = local861[local964];
										local1116 = 6;
										Static28.anIntArray29[5] = local865[local964];
									} else if (local80[3 - local92 & 0x3] && local964 == local829[3]) {
										Static28.anIntArray29[0] = local845[local964];
										Static28.anIntArray29[1] = 7;
										Static28.anIntArray29[2] = local865[local964];
										Static28.anIntArray29[3] = 7;
										Static28.anIntArray29[4] = local861[local964];
										local1116 = 6;
										Static28.anIntArray29[5] = local865[local964];
									} else {
										Static28.anIntArray29[0] = local845[local964];
										Static28.anIntArray29[1] = local861[local964];
										Static28.anIntArray29[2] = local865[local964];
										local1116 = 3;
									}
									local964++;
									for (local1319 = 0; local1319 < local1116; local1319++) {
										local1341 = Static28.anIntArray29[local1319];
										local1324 = local1341 - local92 * 2 & 0x7;
										local1343 = this.anIntArray448[local1341];
										local1401 = this.anIntArray449[local1341];
										@Pc(1914) int local1914;
										if (local92 == 1) {
											local1914 = 128 - local1343;
											local1395 = local1401;
										} else if (local92 == 2) {
											local1395 = 128 - local1343;
											local1914 = 128 - local1401;
										} else if (local92 == 3) {
											local1914 = local1343;
											local1395 = 128 - local1401;
										} else {
											local1395 = local1343;
											local1914 = local1401;
										}
										local980[local966] = local1395;
										local983[local966] = local1914;
										@Pc(1975) int local1975;
										@Pc(1982) int local1982;
										if (local999 != null && Static315.aBooleanArrayArray9[local86][local1341]) {
											local1975 = (local27 << 7) + local1395;
											local1982 = (local43 << 7) + local1914;
											local999[local966] = arg3.va(local1975, local1982) - arg1.va(local1975, local1982);
										}
										if (local1008 != null) {
											if (arg3 != null && !Static315.aBooleanArrayArray9[local86][local1341]) {
												local1975 = (local27 << 7) + local1395;
												local1982 = (local43 << 7) + local1914;
												local1008[local966] = arg1.va(local1975, local1982) - arg3.va(local1975, local1982);
											} else if (arg5 != null && !Static288.aBooleanArrayArray8[local86][local1341]) {
												local1975 = (local27 << 7) + local1395;
												local1982 = (local43 << 7) + local1914;
												local1008[local966] = arg5.va(local1975, local1982) - arg1.va(local1975, local1982);
											}
										}
										if (local1341 < 8 && Static55.anIntArray52[local1324] >= 0) {
											if (local977 != null) {
												local977[local966] = Static331.anIntArray446[local1324];
											}
											local992[local966] = Static407.anIntArray531[local1324];
											local989[local966] = Static55.anIntArray51[local1324];
											local986[local966] = Static132.anIntArray178[local1324];
										} else {
											if (local77 && Static315.aBooleanArrayArray9[local86][local1341]) {
												local989[local966] = local1012;
												local992[local966] = local1014;
												local986[local966] = local1010;
											} else if (local1395 == 0 && local1914 == 0) {
												local986[local966] = arg0[local27][local43];
												local989[local966] = local1618.anInt4276;
												local992[local966] = local1618.anInt4285;
											} else if (local1395 == 0 && local1914 == 128) {
												local986[local966] = arg0[local27][local61];
												local989[local966] = local1626.anInt4276;
												local992[local966] = local1626.anInt4285;
											} else if (local1395 == 128 && local1914 == 128) {
												local986[local966] = arg0[local41][local61];
												local989[local966] = local1634.anInt4276;
												local992[local966] = local1634.anInt4285;
											} else if (local1395 == 128 && local1914 == 0) {
												local986[local966] = arg0[local41][local43];
												local989[local966] = local1642.anInt4276;
												local992[local966] = local1642.anInt4285;
											} else {
												if (local1395 < 64) {
													if (local1914 >= 64) {
														local989[local966] = local1626.anInt4276;
														local992[local966] = local1626.anInt4285;
													} else {
														local989[local966] = local1618.anInt4276;
														local992[local966] = local1618.anInt4285;
													}
												} else if (local1914 < 64) {
													local989[local966] = local1642.anInt4276;
													local992[local966] = local1642.anInt4285;
												} else {
													local989[local966] = local1634.anInt4276;
													local992[local966] = local1634.anInt4285;
												}
												local1975 = Static390.method5401(arg0[local27][local43], local1395 << 7 >> 7, arg0[local41][local43]);
												local1982 = Static390.method5401(arg0[local27][local61], local1395 << 7 >> 7, arg0[local41][local61]);
												local986[local966] = Static390.method5401(local1975, local1914 << 7 >> 7, local1982);
											}
											if (local977 != null) {
												local977[local966] = local986[local966];
											}
										}
										local966++;
									}
								}
								if (local86 != 0 && local166.aBoolean342) {
									local75 = true;
								}
							}
							local1066 = arg1.I(local27, local43);
							local1068 = arg1.I(local41, local43);
							local1299 = arg1.I(local41, local61);
							local1305 = arg1.I(local27, local61);
							if (arg4 > 0) {
								@Pc(2394) boolean local2394 = true;
								if (local108 == 0 && local86 != 0) {
									local2394 = false;
								}
								if (local100 > 0 && local177 != null && !local177.aBoolean387) {
									local2394 = false;
								}
								if (local2394 && local1066 == local1068 && local1066 == local1299 && local1066 == local1305) {
									this.aByteArrayArrayArray10[arg4][local27][local43] = (byte) (this.aByteArrayArrayArray10[arg4][local27][local43] | 0x4);
								}
							}
							local1314 = 0;
							local1319 = 0;
							local1341 = 0;
							if (this.aBoolean488) {
								local1314 = Static233.method3388(local27, local43);
								local1319 = Static59.method899(local27, local43);
								local1341 = Static440.method5907(local27, local43);
							}
							arg1.JA(local27, local43, local980, local999, local983, local1008, local986, local977, local989, local992, local1314, local1319, local1341, local75);
							Static221.method5883(arg4, local27, local43);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIZILclient!ti;II)V")
	private void method4802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub14 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 1) {
			arg2 = 1;
		} else if (arg1 == 2) {
			arg0 = 1;
			arg2 = 1;
		} else if (arg1 == 3) {
			arg0 = 1;
		}
		@Pc(62) int local62;
		if (arg9 < 0 || this.anInt6066 <= arg9 || arg3 < 0 || arg3 >= this.anInt6059) {
			while (true) {
				local62 = arg7.method4548();
				if (local62 == 0) {
					return;
				}
				if (local62 == 1) {
					arg7.method4548();
					return;
				}
				if (local62 <= 49) {
					arg7.method4548();
				}
			}
			return;
		}
		if (!this.aBoolean488 && !arg5) {
			Static228.aByteArrayArrayArray8[arg8][arg9][arg3] = 0;
		}
		while (true) {
			local62 = arg7.method4548();
			if (local62 == 0) {
				if (this.aBoolean488) {
					this.anIntArrayArrayArray106[0][arg0 + arg9][arg2 + arg3] = 0;
					return;
				} else if (arg8 == 0) {
					this.anIntArrayArrayArray106[0][arg0 + arg9][arg3 + arg2] = -Static262.method3697(arg6 + 556238, arg4 + 932731) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray106[arg8][arg0 + arg9][arg3 + arg2] = this.anIntArrayArrayArray106[arg8 - 1][arg0 + arg9][arg2 + arg3] - 240;
					return;
				}
			}
			if (local62 == 1) {
				@Pc(148) int local148 = arg7.method4548();
				if (this.aBoolean488) {
					this.anIntArrayArrayArray106[0][arg9 + arg0][arg2 + arg3] = local148 * 8 << 0;
					return;
				}
				if (local148 == 1) {
					local148 = 0;
				}
				if (arg8 == 0) {
					this.anIntArrayArrayArray106[0][arg9 + arg0][arg3 + arg2] = -local148 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray106[arg8][arg0 + arg9][arg2 + arg3] = this.anIntArrayArrayArray106[arg8 - 1][arg9 + arg0][arg3 + arg2] - (local148 * 8 << 0);
				return;
			}
			if (local62 <= 49) {
				if (arg5) {
					arg7.method4548();
				} else {
					this.aByteArrayArrayArray14[arg8][arg9][arg3] = arg7.method4529();
					this.aByteArrayArrayArray11[arg8][arg9][arg3] = (byte) ((local62 - 2) / 4);
					this.aByteArrayArrayArray12[arg8][arg9][arg3] = (byte) (arg1 + local62 - 2 & 0x3);
				}
			} else if (local62 <= 81) {
				if (!this.aBoolean488 && !arg5) {
					Static228.aByteArrayArrayArray8[arg8][arg9][arg3] = (byte) (local62 - 49);
				}
			} else if (!arg5) {
				this.aByteArrayArrayArray9[arg8][arg9][arg3] = (byte) (local62 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZIIII)V")
	public final void method4803(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + arg1; local3++) {
			for (local7 = arg3; local7 < arg4 + arg3; local7++) {
				if (local7 >= 0 && this.anInt6066 > local7 && local3 >= 0 && local3 < this.anInt6059) {
					this.anIntArrayArrayArray106[arg0][local7][local3] = arg0 > 0 ? this.anIntArrayArrayArray106[arg0 - 1][local7][local3] - 240 : 0;
				}
			}
		}
		if (arg3 > 0 && this.anInt6066 > arg3) {
			for (local7 = arg2 + 1; local7 < arg1 + arg2; local7++) {
				if (local7 >= 0 && local7 < this.anInt6059) {
					this.anIntArrayArrayArray106[arg0][arg3][local7] = this.anIntArrayArrayArray106[arg0][arg3 - 1][local7];
				}
			}
		}
		if (arg2 > 0 && this.anInt6059 > arg2) {
			for (local7 = arg3 + 1; local7 < arg4 + arg3; local7++) {
				if (local7 >= 0 && local7 < this.anInt6066) {
					this.anIntArrayArrayArray106[arg0][local7][arg2] = this.anIntArrayArrayArray106[arg0][local7][arg2 - 1];
				}
			}
		}
		if (arg3 < 0 || arg2 < 0 || arg3 >= this.anInt6066 || arg2 >= this.anInt6059) {
			return;
		}
		if (arg0 == 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray106[arg0][arg3 - 1][arg2] != 0) {
				this.anIntArrayArrayArray106[arg0][arg3][arg2] = this.anIntArrayArrayArray106[arg0][arg3 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray106[arg0][arg3][arg2 - 1] != 0) {
				this.anIntArrayArrayArray106[arg0][arg3][arg2] = this.anIntArrayArrayArray106[arg0][arg3][arg2 - 1];
				return;
			}
			if (arg3 > 0 && arg2 > 0 && this.anIntArrayArrayArray106[arg0][arg3 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray106[arg0][arg3][arg2] = this.anIntArrayArrayArray106[arg0][arg3 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray106[arg0][arg3 - 1][arg2] != this.anIntArrayArrayArray106[arg0 - 1][arg3 - 1][arg2]) {
			this.anIntArrayArrayArray106[arg0][arg3][arg2] = this.anIntArrayArrayArray106[arg0][arg3 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray106[arg0 - 1][arg3][arg2 - 1] != this.anIntArrayArrayArray106[arg0][arg3][arg2 - 1]) {
			this.anIntArrayArrayArray106[arg0][arg3][arg2] = this.anIntArrayArrayArray106[arg0][arg3][arg2 - 1];
			return;
		}
		if (arg3 > 0 && arg2 > 0 && this.anIntArrayArrayArray106[arg0 - 1][arg3 - 1][arg2 - 1] != this.anIntArrayArrayArray106[arg0][arg3 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray106[arg0][arg3][arg2] = this.anIntArrayArrayArray106[arg0][arg3 - 1][arg2 - 1];
			return;
		}
	}
}
