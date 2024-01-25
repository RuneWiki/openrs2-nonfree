import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public class Class131 {

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "[I")
	private final int[] anIntArray188 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "[I")
	private final int[] anIntArray189 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!g;")
	private final Class124 aClass124_2;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "Lclient!gu;")
	private final Class140 aClass140_4;

	@OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
	protected final int anInt3582;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "Z")
	public final boolean aBoolean291;

	@OriginalMember(owner = "client!wq", name = "z", descriptor = "I")
	protected final int anInt3577;

	@OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
	public final int anInt3589;

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!wq", name = "v", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!wq", name = "x", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(IIIZLclient!gu;Lclient!g;)V")
	protected Class131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class140 arg4, @OriginalArg(5) Class124 arg5) {
		this.aClass124_2 = arg5;
		this.aClass140_4 = arg4;
		this.anInt3582 = arg2;
		this.aBoolean291 = arg3;
		this.anInt3577 = arg1;
		this.anInt3589 = arg0;
		this.aByteArrayArrayArray13 = new byte[this.anInt3589][this.anInt3577][this.anInt3582];
		this.aByteArrayArrayArray10 = new byte[this.anInt3589][this.anInt3577][this.anInt3582];
		this.aByteArrayArrayArray9 = new byte[this.anInt3589][this.anInt3577][this.anInt3582];
		this.aByteArrayArrayArray14 = new byte[this.anInt3589][this.anInt3577][this.anInt3582];
		this.anIntArrayArrayArray4 = new int[this.anInt3589][this.anInt3577 + 1][this.anInt3582 + 1];
		this.aByteArrayArrayArray11 = new byte[this.anInt3589][this.anInt3577 + 1][this.anInt3582 + 1];
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "([Lclient!tq;Lclient!ha;I[[[I)V")
	public final void method3068(@OriginalArg(0) Class360[] arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(34) int local34;
		if (!this.aBoolean291) {
			for (@Pc(10) int local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt3577; local14++) {
					for (local18 = 0; local18 < this.anInt3582; local18++) {
						if ((Static6.aByteArrayArrayArray1[local10][local14][local18] & 0x1) != 0) {
							local34 = local10;
							if ((Static6.aByteArrayArrayArray1[1][local14][local18] & 0x2) != 0) {
								local34 = local10 - 1;
							}
							if (local34 >= 0) {
								arg0[local34].method8498(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local14 = 0; local14 < this.anInt3589; local14++) {
			local18 = 0;
			local34 = 0;
			if (!this.aBoolean291) {
				if (Static197.aBoolean282) {
					local18 = 2;
				}
				if (Static342.aBoolean751) {
					local34 = 8;
				}
				if (Static12.anInt155 != 0) {
					if (local14 == 0 | Static116.aBoolean186) {
						local34 |= 0x10;
					}
					local18 |= 0x1;
				}
			}
			if (Static197.aBoolean282) {
				local34 |= 0x7;
			}
			if (!Static657.aBoolean758) {
				local34 |= 0x20;
			}
			@Pc(184) int[][] local184 = arg2 == null || arg2.length <= local14 ? this.anIntArrayArrayArray4[local14] : arg2[local14];
			Static640.method8684(local14, arg1.method7679(this.anInt3577, this.anInt3582, this.anIntArrayArrayArray4[local14], local184, local18, local34));
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!s;BLclient!ha;ILclient!s;[[ILclient!s;)V")
	private void method3069(@OriginalArg(0) Class313 arg0, @OriginalArg(2) Class67 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class313 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class313 arg5) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3577; local11++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt3582; local17++) {
				if (Static477.anInt8337 == -1 || Static467.method6925(arg2, local11, Static477.anInt8337, local17)) {
					@Pc(47) byte local47 = this.aByteArrayArrayArray13[arg2][local11][local17];
					@Pc(56) byte local56 = this.aByteArrayArrayArray9[arg2][local11][local17];
					@Pc(67) int local67 = this.aByteArrayArrayArray10[arg2][local11][local17] & 0xFF;
					@Pc(78) int local78 = this.aByteArrayArrayArray14[arg2][local11][local17] & 0xFF;
					@Pc(94) Class46 local94 = local67 == 0 ? null : this.aClass140_4.method3535(local67 - 1);
					@Pc(110) Class159 local110 = local78 == 0 ? null : this.aClass124_2.method2963(local78 - 1);
					if (local47 == 0 && local94 == null) {
						local47 = 12;
					}
					@Pc(123) Class46 local123 = local94;
					if (local94 != null && local94.anInt1150 == -1 && local94.anInt1148 == -1) {
						local123 = local94;
						local94 = null;
					}
					if (local94 != null || local110 != null) {
						@Pc(153) int local153 = Static490.anIntArray463[local47];
						@Pc(157) int local157 = Static143.anIntArray131[local47];
						@Pc(172) int local172 = (local94 == null ? 0 : local157) + (local110 == null ? 0 : local153);
						@Pc(174) int local174 = 0;
						@Pc(176) int local176 = 0;
						@Pc(184) int local184 = local94 == null ? -1 : local94.anInt1147;
						@Pc(192) int local192 = local110 == null ? -1 : local110.anInt4732;
						@Pc(195) int[] local195 = new int[local172];
						@Pc(198) int[] local198 = new int[local172];
						@Pc(201) int[] local201 = new int[local172];
						@Pc(204) int[] local204 = new int[local172];
						@Pc(207) int[] local207 = new int[local172];
						@Pc(210) int[] local210 = new int[local172];
						@Pc(224) int[] local224 = local94 == null || local94.anInt1148 == -1 ? null : new int[local172];
						@Pc(234) int local234;
						if (local94 == null) {
							local176 = local157;
						} else {
							for (local234 = 0; local234 < local157; local234++) {
								local195[local174] = Static551.anIntArrayArray51[local47][local176];
								local198[local174] = Static397.anIntArrayArray39[local47][local176];
								local201[local174] = Static699.anIntArrayArray61[local47][local176];
								local207[local174] = local184;
								local210[local174] = local94.anInt1145;
								local204[local174] = local94.anInt1150;
								if (local224 != null) {
									local224[local174] = local94.anInt1148;
								}
								local174++;
								local176++;
							}
							if (!this.aBoolean291 && arg2 == 0) {
								Static89.method1193(local11, local17, local94.anInt1140, local94.anInt1143 * 8, local94.anInt1139);
							}
						}
						if (local110 != null) {
							for (local234 = 0; local234 < local153; local234++) {
								local195[local174] = Static551.anIntArrayArray51[local47][local176];
								local198[local174] = Static397.anIntArrayArray39[local47][local176];
								local201[local174] = Static699.anIntArrayArray61[local47][local176];
								local207[local174] = local192;
								local210[local174] = local110.anInt4730;
								local204[local174] = arg4[local11][local17];
								if (local224 != null) {
									local224[local174] = local204[local174];
								}
								local174++;
								local176++;
							}
						}
						local234 = this.anIntArray188.length;
						@Pc(395) int[] local395 = new int[local234];
						@Pc(398) int[] local398 = new int[local234];
						@Pc(410) int[] local410 = arg0 == null ? null : new int[local234];
						@Pc(422) int[] local422 = arg0 == null && arg5 == null ? null : new int[local234];
						@Pc(431) int local431;
						@Pc(436) int local436;
						@Pc(536) int local536;
						@Pc(545) int local545;
						for (@Pc(424) int local424 = 0; local424 < local234; local424++) {
							local431 = this.anIntArray188[local424];
							local436 = this.anIntArray189[local424];
							if (local56 == 0) {
								local395[local424] = local431;
								local398[local424] = local436;
							} else if (local56 == 1) {
								local395[local424] = local436;
								local398[local424] = 512 - local431;
							} else if (local56 == 2) {
								local395[local424] = 512 - local431;
								local398[local424] = 512 - local436;
							} else if (local56 == 3) {
								local395[local424] = 512 - local436;
								local398[local424] = local431;
							}
							if (local410 != null && Static600.aBooleanArrayArray6[local47][local424]) {
								local536 = local395[local424] + (local11 << 9);
								local545 = (local17 << 9) + local398[local424];
								local410[local424] = arg0.method9096(local536, local545) - arg3.method9096(local536, local545);
							}
							if (local422 != null) {
								if (arg0 != null && !Static600.aBooleanArrayArray6[local47][local424]) {
									local536 = (local11 << 9) + local395[local424];
									local545 = local398[local424] + (local17 << 9);
									local422[local424] = arg3.method9096(local536, local545) - arg0.method9096(local536, local545);
								} else if (arg5 != null && !Static374.aBooleanArrayArray3[local47][local424]) {
									local536 = (local11 << 9) + local395[local424];
									local545 = (local17 << 9) + local398[local424];
									local422[local424] = arg5.method9096(local536, local545) - arg3.method9096(local536, local545);
								}
							}
						}
						local431 = arg3.method9095(local17, local11);
						local436 = arg3.method9095(local17, local11 + 1);
						local536 = arg3.method9095(local17 + 1, local11 + 1);
						local545 = arg3.method9095(local17 + 1, local11);
						@Pc(693) boolean local693 = Static135.method2226(local11, local17);
						if (local693 && arg2 > 1 || !local693 && arg2 > 0) {
							@Pc(717) boolean local717 = true;
							if (local110 != null && !local110.aBoolean414) {
								local717 = false;
							} else if (local78 == 0 && local47 != 0) {
								local717 = false;
							} else if (local67 > 0 && local123 != null && !local123.aBoolean92) {
								local717 = false;
							}
							if (local717 && local431 == local436 && local536 == local431 && local545 == local431) {
								this.aByteArrayArrayArray11[arg2][local11][local17] = (byte) (this.aByteArrayArrayArray11[arg2][local11][local17] | 0x4);
							}
						}
						@Pc(802) int local802 = 0;
						@Pc(804) int local804 = 0;
						@Pc(806) int local806 = 0;
						if (this.aBoolean291) {
							local802 = Static405.method6058(local11, local17);
							local804 = Static479.method7001(local11, local17);
							local806 = Static671.method8889(local11, local17);
						}
						arg3.method9088(local11, local17, local395, local410, local398, local422, local195, local198, local201, local204, local224, local207, local210, local802, local804, local806);
						Static306.method4660(arg2, local11, local17);
					}
				}
			}
		}
		Static721.anInt3584++;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIII)V")
	public final void method3070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(28) int local28 = 0; local28 < this.anInt3589; local28++) {
			this.method3072(arg0, local28, 64, arg1, 64);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!rba;IIIIIIZII)V")
	private void method3071(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg2 == 1) {
			arg6 = 1;
		} else if (arg2 == 2) {
			arg8 = 1;
			arg6 = 1;
		} else if (arg2 == 3) {
			arg8 = 1;
		}
		@Pc(86) int local86;
		if (arg9 < 0 || this.anInt3577 <= arg9 || arg5 < 0 || arg5 >= this.anInt3582) {
			while (true) {
				local86 = arg1.method5322(-105);
				if (local86 == 0) {
					return;
				}
				if (local86 == 1) {
					arg1.method5322(-22);
					return;
				}
				if (local86 <= 49) {
					arg1.method5322(-65);
				}
			}
			return;
		}
		if (!this.aBoolean291 && !arg7) {
			Static6.aByteArrayArrayArray1[arg4][arg9][arg5] = 0;
		}
		while (true) {
			local86 = arg1.method5322(-62);
			if (local86 == 0) {
				if (this.aBoolean291) {
					this.anIntArrayArrayArray4[0][arg9 + arg8][arg6 + arg5] = 0;
					return;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray4[0][arg8 + arg9][arg5 + arg6] = -Static173.method2696(arg0 + 932731, arg3 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray4[arg4][arg9 + arg8][arg6 + arg5] = this.anIntArrayArrayArray4[arg4 - 1][arg8 + arg9][arg6 + arg5] - 960;
					return;
				}
			}
			if (local86 == 1) {
				@Pc(178) int local178 = arg1.method5322(-38);
				if (!this.aBoolean291) {
					if (local178 == 1) {
						local178 = 0;
					}
					if (arg4 != 0) {
						this.anIntArrayArrayArray4[arg4][arg8 + arg9][arg5 + arg6] = this.anIntArrayArrayArray4[arg4 - 1][arg9 + arg8][arg5 + arg6] - (local178 * 8 << 2);
						return;
					}
					this.anIntArrayArrayArray4[0][arg8 + arg9][arg6 + arg5] = -local178 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray4[0][arg8 + arg9][arg6 + arg5] = local178 * 8 << 2;
				return;
			}
			if (local86 <= 49) {
				if (arg7) {
					arg1.method5322(-77);
				} else {
					this.aByteArrayArrayArray10[arg4][arg9][arg5] = arg1.method5288();
					this.aByteArrayArrayArray13[arg4][arg9][arg5] = (byte) ((local86 - 2) / 4);
					this.aByteArrayArrayArray9[arg4][arg9][arg5] = (byte) (arg2 + local86 - 2 & 0x3);
				}
			} else if (local86 <= 81) {
				if (!this.aBoolean291 && !arg7) {
					Static6.aByteArrayArrayArray1[arg4][arg9][arg5] = (byte) (local86 - 49);
				}
			} else if (!arg7) {
				this.aByteArrayArrayArray14[arg4][arg9][arg5] = (byte) (local86 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIBI)V")
	public final void method3072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(21) int local21;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + arg2; local7++) {
			for (local21 = arg3; local21 < arg3 + arg4; local21++) {
				if (local21 >= 0 && local21 < this.anInt3577 && local7 >= 0 && local7 < this.anInt3582) {
					this.anIntArrayArrayArray4[arg1][local21][local7] = arg1 > 0 ? this.anIntArrayArrayArray4[arg1 - 1][local21][local7] - 960 : 0;
				}
			}
		}
		if (arg3 > 0 && this.anInt3577 > arg3) {
			for (local21 = arg0 + 1; local21 < arg2 + arg0; local21++) {
				if (local21 >= 0 && this.anInt3582 > local21) {
					this.anIntArrayArrayArray4[arg1][arg3][local21] = this.anIntArrayArrayArray4[arg1][arg3 - 1][local21];
				}
			}
		}
		if (arg0 > 0 && this.anInt3582 > arg0) {
			for (local21 = arg3 + 1; local21 < arg4 + arg3; local21++) {
				if (local21 >= 0 && local21 < this.anInt3577) {
					this.anIntArrayArrayArray4[arg1][local21][arg0] = this.anIntArrayArrayArray4[arg1][local21][arg0 - 1];
				}
			}
		}
		if (arg3 < 0 || arg0 < 0 || arg3 >= this.anInt3577 || this.anInt3582 <= arg0) {
			return;
		}
		if (arg1 == 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray4[arg1][arg3 - 1][arg0] != 0) {
				this.anIntArrayArrayArray4[arg1][arg3][arg0] = this.anIntArrayArrayArray4[arg1][arg3 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray4[arg1][arg3][arg0 - 1] != 0) {
				this.anIntArrayArrayArray4[arg1][arg3][arg0] = this.anIntArrayArrayArray4[arg1][arg3][arg0 - 1];
				return;
			}
			if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray4[arg1][arg3 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray4[arg1][arg3][arg0] = this.anIntArrayArrayArray4[arg1][arg3 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray4[arg1 - 1][arg3 - 1][arg0] != this.anIntArrayArrayArray4[arg1][arg3 - 1][arg0]) {
			this.anIntArrayArrayArray4[arg1][arg3][arg0] = this.anIntArrayArrayArray4[arg1][arg3 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray4[arg1 - 1][arg3][arg0 - 1] != this.anIntArrayArrayArray4[arg1][arg3][arg0 - 1]) {
			this.anIntArrayArrayArray4[arg1][arg3][arg0] = this.anIntArrayArrayArray4[arg1][arg3][arg0 - 1];
			return;
		}
		if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray4[arg1 - 1][arg3 - 1][arg0 - 1] != this.anIntArrayArrayArray4[arg1][arg3 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray4[arg1][arg3][arg0] = this.anIntArrayArrayArray4[arg1][arg3 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!rba;IZIII[Lclient!tq;III)V")
	public final void method3073(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class360[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg7 & 0x7) * 8;
		@Pc(17) int local17 = (arg6 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean291) {
			@Pc(24) Class360 local24 = arg5[arg3];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = arg8 + Static497.method7170(local26 & 0x7, local30 & 0x7, arg1);
					local56 = arg4 + Static659.method8820(local26 & 0x7, local30 & 0x7, arg1);
					if (local44 > 0 && this.anInt3577 - 1 > local44 && local56 > 0 && local56 < this.anInt3582 - 1) {
						local24.method8484(local56, local44);
					}
				}
			}
		}
		@Pc(116) int local116 = (arg7 & 0xFFFFFFF8) << 3;
		local26 = (arg6 & 0xFFFFFFF8) << 3;
		@Pc(124) byte local124 = 0;
		@Pc(126) byte local126 = 0;
		if (arg1 == 1) {
			local126 = 1;
		} else if (arg1 == 2) {
			local124 = 1;
			local126 = 1;
		} else if (arg1 == 3) {
			local124 = 1;
		}
		for (local56 = 0; local56 < this.anInt3589; local56++) {
			for (@Pc(163) int local163 = 0; local163 < 64; local163++) {
				for (@Pc(167) int local167 = 0; local167 < 64; local167++) {
					if (local56 == arg2 && local163 >= local11 && local163 <= local11 + 8 && local17 <= local167 && local167 <= local17 + 8) {
						@Pc(266) int local266;
						@Pc(278) int local278;
						if (local163 == local11 + 8 || local17 + 8 == local167) {
							if (arg1 == 0) {
								local278 = local167 + arg4 - local17;
								local266 = local163 + arg8 - local11;
							} else if (arg1 == 1) {
								local266 = local167 + arg8 - local17;
								local278 = local11 + arg4 + 8 - local163;
							} else if (arg1 == 2) {
								local266 = arg8 + local11 + 8 - local163;
								local278 = local17 + arg4 + 8 - local167;
							} else {
								local278 = local163 + arg4 - local11;
								local266 = arg8 + local17 + 8 - local167;
							}
							this.method3071(local163 + local116, arg0, 0, local167 + local26, arg3, local278, 0, true, 0, local266);
						} else {
							local266 = arg8 + Static497.method7170(local163 & 0x7, local167 & 0x7, arg1);
							local278 = Static659.method8820(local163 & 0x7, local167 & 0x7, arg1) + arg4;
							this.method3071(local116 + local163, arg0, arg1, local26 + local167, arg3, local278, local126, false, local124, local266);
						}
						if (local163 == 63 || local167 == 63) {
							@Pc(412) byte local412 = 1;
							if (local163 == 63 && local167 == 63) {
								local412 = 3;
							}
							for (@Pc(428) int local428 = 0; local428 < local412; local428++) {
								@Pc(432) int local432 = local163;
								@Pc(434) int local434 = local167;
								if (local428 == 0) {
									local432 = local163 == 63 ? 64 : local163;
									local434 = local167 == 63 ? 64 : local167;
								} else if (local428 == 1) {
									local432 = 64;
								} else if (local428 == 2) {
									local434 = 64;
								}
								@Pc(508) int local508;
								@Pc(515) int local515;
								if (arg1 == 0) {
									local515 = arg4 + local434 - local17;
									local508 = local432 + arg8 - local11;
								} else if (arg1 == 1) {
									local508 = local434 + arg8 - local17;
									local515 = arg4 + local11 + 8 - local432;
								} else if (arg1 == 2) {
									local508 = local11 + arg8 + 8 - local432;
									local515 = arg4 + local17 + 8 - local434;
								} else {
									local508 = local17 + arg8 + 8 - local434;
									local515 = local432 + arg4 - local11;
								}
								if (local508 >= 0 && this.anInt3577 > local508 && local515 >= 0 && this.anInt3582 > local515) {
									this.anIntArrayArrayArray4[arg3][local508][local515] = this.anIntArrayArrayArray4[arg3][local124 + local266][local278 + local126];
								}
							}
						}
					} else {
						this.method3071(0, arg0, 0, 0, 0, -1, 0, false, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[[BILclient!ha;BLclient!ce;I[[B[ZLclient!hr;[[BI)V")
	private void method3075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class67 arg5, @OriginalArg(7) Class46 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) boolean[] arg9, @OriginalArg(11) Class159 arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) int arg12) {
		@Pc(26) boolean[] local26 = arg6 != null && arg6.aBoolean95 ? Static526.aBooleanArrayArray5[arg1] : Static208.aBooleanArrayArray2[arg1];
		@Pc(44) int local44;
		@Pc(54) Class46 local54;
		@Pc(74) byte local74;
		@Pc(91) int local91;
		@Pc(96) int local96;
		if (arg2 > 0) {
			if (arg0 > 0) {
				local44 = arg8[arg0 - 1][arg2 - 1] & 0xFF;
				if (local44 > 0) {
					local54 = this.aClass140_4.method3535(local44 - 1);
					if (local54.anInt1150 != -1 && local54.aBoolean95) {
						local74 = arg3[arg0 - 1][arg2 - 1];
						local91 = arg11[arg0 - 1][arg2 - 1] * 2 + 4 & 0x7;
						local96 = Static147.method2422(arg5, local54);
						if (Static600.aBooleanArrayArray6[local74][local91]) {
							Static144.anIntArray132[0] = local54.anInt1150;
							Static268.anIntArray277[0] = local96;
							Static675.anIntArray602[0] = local54.anInt1147;
							Static535.anIntArray490[0] = local54.anInt1145;
							Static698.anIntArray611[0] = local54.anInt1144;
							Static48.anIntArray57[0] = 256;
						}
					}
				}
			}
			if (arg0 < arg4 - 1) {
				local44 = arg8[arg0 + 1][arg2 - 1] & 0xFF;
				if (local44 > 0) {
					local54 = this.aClass140_4.method3535(local44 - 1);
					if (local54.anInt1150 != -1 && local54.aBoolean95) {
						local74 = arg3[arg0 + 1][arg2 - 1];
						local91 = arg11[arg0 + 1][arg2 - 1] * 2 + 6 & 0x7;
						local96 = Static147.method2422(arg5, local54);
						if (Static600.aBooleanArrayArray6[local74][local91]) {
							Static144.anIntArray132[2] = local54.anInt1150;
							Static268.anIntArray277[2] = local96;
							Static675.anIntArray602[2] = local54.anInt1147;
							Static535.anIntArray490[2] = local54.anInt1145;
							Static698.anIntArray611[2] = local54.anInt1144;
							Static48.anIntArray57[2] = 512;
						}
					}
				}
			}
		}
		if (arg12 - 1 > arg2) {
			if (arg0 > 0) {
				local44 = arg8[arg0 - 1][arg2 + 1] & 0xFF;
				if (local44 > 0) {
					local54 = this.aClass140_4.method3535(local44 - 1);
					if (local54.anInt1150 != -1 && local54.aBoolean95) {
						local74 = arg3[arg0 - 1][arg2 + 1];
						local91 = arg11[arg0 - 1][arg2 + 1] * 2 + 2 & 0x7;
						local96 = Static147.method2422(arg5, local54);
						if (Static600.aBooleanArrayArray6[local74][local91]) {
							Static144.anIntArray132[6] = local54.anInt1150;
							Static268.anIntArray277[6] = local96;
							Static675.anIntArray602[6] = local54.anInt1147;
							Static535.anIntArray490[6] = local54.anInt1145;
							Static698.anIntArray611[6] = local54.anInt1144;
							Static48.anIntArray57[6] = 64;
						}
					}
				}
			}
			if (arg4 - 1 > arg0) {
				local44 = arg8[arg0 + 1][arg2 + 1] & 0xFF;
				if (local44 > 0) {
					local54 = this.aClass140_4.method3535(local44 - 1);
					if (local54.anInt1150 != -1 && local54.aBoolean95) {
						local74 = arg3[arg0 + 1][arg2 + 1];
						local91 = --(arg11[arg0 + 1][arg2 + 1] * 2) & 0x7;
						local96 = Static147.method2422(arg5, local54);
						if (Static600.aBooleanArrayArray6[local74][local91]) {
							Static144.anIntArray132[4] = local54.anInt1150;
							Static268.anIntArray277[4] = local96;
							Static675.anIntArray602[4] = local54.anInt1147;
							Static535.anIntArray490[4] = local54.anInt1145;
							Static698.anIntArray611[4] = local54.anInt1144;
							Static48.anIntArray57[4] = 128;
						}
					}
				}
			}
		}
		@Pc(522) int local522;
		@Pc(527) int local527;
		@Pc(529) int local529;
		@Pc(511) byte local511;
		if (arg2 > 0) {
			local44 = arg8[arg0][arg2 - 1] & 0xFF;
			if (local44 > 0) {
				local54 = this.aClass140_4.method3535(local44 - 1);
				if (local54.anInt1150 != -1) {
					local74 = arg3[arg0][arg2 - 1];
					local511 = arg11[arg0][arg2 - 1];
					if (local54.aBoolean95) {
						local96 = 2;
						local522 = local511 * 2 + 4;
						local527 = Static147.method2422(arg5, local54);
						for (local529 = 0; local529 < 3; local529++) {
							local96 &= 0x7;
							local522 &= 0x7;
							if (Static600.aBooleanArrayArray6[local74][local522] && Static698.anIntArray611[local96] <= local54.anInt1144) {
								Static144.anIntArray132[local96] = local54.anInt1150;
								Static268.anIntArray277[local96] = local527;
								Static675.anIntArray602[local96] = local54.anInt1147;
								Static535.anIntArray490[local96] = local54.anInt1145;
								if (local54.anInt1144 == Static698.anIntArray611[local96]) {
									Static48.anIntArray57[local96] |= 0x20;
								} else {
									Static48.anIntArray57[local96] = 32;
								}
								Static698.anIntArray611[local96] = local54.anInt1144;
							}
							local96--;
							local522++;
						}
						if (!local26[arg7 & 0x3]) {
							arg9[0] = Static526.aBooleanArrayArray5[local74][local511 + 2 & 0x3];
						}
					} else if (!local26[--arg7 & 0x3]) {
						arg9[0] = Static208.aBooleanArrayArray2[local74][local511 + 2 & 0x3];
					}
				}
			}
		}
		if (arg2 < arg12 - 1) {
			local44 = arg8[arg0][arg2 + 1] & 0xFF;
			if (local44 > 0) {
				local54 = this.aClass140_4.method3535(local44 - 1);
				if (local54.anInt1150 != -1) {
					local74 = arg3[arg0][arg2 + 1];
					local511 = arg11[arg0][arg2 + 1];
					if (local54.aBoolean95) {
						local96 = 4;
						local522 = local511 * 2 + 2;
						local527 = Static147.method2422(arg5, local54);
						for (local529 = 0; local529 < 3; local529++) {
							local522 &= 0x7;
							local96 &= 0x7;
							if (Static600.aBooleanArrayArray6[local74][local522] && Static698.anIntArray611[local96] <= local54.anInt1144) {
								Static144.anIntArray132[local96] = local54.anInt1150;
								Static268.anIntArray277[local96] = local527;
								Static675.anIntArray602[local96] = local54.anInt1147;
								Static535.anIntArray490[local96] = local54.anInt1145;
								if (local54.anInt1144 == Static698.anIntArray611[local96]) {
									Static48.anIntArray57[local96] |= 0x10;
								} else {
									Static48.anIntArray57[local96] = 16;
								}
								Static698.anIntArray611[local96] = local54.anInt1144;
							}
							local522--;
							local96++;
						}
						if (!local26[arg7 + 2 & 0x3]) {
							arg9[2] = Static526.aBooleanArrayArray5[local74][local511 & 0x3];
						}
					} else if (!local26[arg7 + 2 & 0x3]) {
						arg9[2] = Static208.aBooleanArrayArray2[local74][local511 & 0x3];
					}
				}
			}
		}
		if (arg0 > 0) {
			local44 = arg8[arg0 - 1][arg2] & 0xFF;
			if (local44 > 0) {
				local54 = this.aClass140_4.method3535(local44 - 1);
				if (local54.anInt1150 != -1) {
					local74 = arg3[arg0 - 1][arg2];
					local511 = arg11[arg0 - 1][arg2];
					if (local54.aBoolean95) {
						local96 = 6;
						local522 = local511 * 2 + 4;
						local527 = Static147.method2422(arg5, local54);
						for (local529 = 0; local529 < 3; local529++) {
							local522 &= 0x7;
							local96 &= 0x7;
							if (Static600.aBooleanArrayArray6[local74][local522] && local54.anInt1144 >= Static698.anIntArray611[local96]) {
								Static144.anIntArray132[local96] = local54.anInt1150;
								Static268.anIntArray277[local96] = local527;
								Static675.anIntArray602[local96] = local54.anInt1147;
								Static535.anIntArray490[local96] = local54.anInt1145;
								if (Static698.anIntArray611[local96] == local54.anInt1144) {
									Static48.anIntArray57[local96] |= 0x8;
								} else {
									Static48.anIntArray57[local96] = 8;
								}
								Static698.anIntArray611[local96] = local54.anInt1144;
							}
							local96++;
							local522--;
						}
						if (!local26[arg7 + 3 & 0x3]) {
							arg9[3] = Static526.aBooleanArrayArray5[local74][local511 + 1 & 0x3];
						}
					} else if (!local26[arg7 + 3 & 0x3]) {
						arg9[3] = Static208.aBooleanArrayArray2[local74][local511 + 1 & 0x3];
					}
				}
			}
		}
		if (arg4 - 1 > arg0) {
			local44 = arg8[arg0 + 1][arg2] & 0xFF;
			if (local44 > 0) {
				local54 = this.aClass140_4.method3535(local44 - 1);
				if (local54.anInt1150 != -1) {
					local74 = arg3[arg0 + 1][arg2];
					local511 = arg11[arg0 + 1][arg2];
					if (local54.aBoolean95) {
						local96 = 4;
						local522 = local511 * 2 + 6;
						local527 = Static147.method2422(arg5, local54);
						for (local529 = 0; local529 < 3; local529++) {
							local96 &= 0x7;
							local522 &= 0x7;
							if (Static600.aBooleanArrayArray6[local74][local522] && local54.anInt1144 >= Static698.anIntArray611[local96]) {
								Static144.anIntArray132[local96] = local54.anInt1150;
								Static268.anIntArray277[local96] = local527;
								Static675.anIntArray602[local96] = local54.anInt1147;
								Static535.anIntArray490[local96] = local54.anInt1145;
								if (local54.anInt1144 == Static698.anIntArray611[local96]) {
									Static48.anIntArray57[local96] |= 0x4;
								} else {
									Static48.anIntArray57[local96] = 4;
								}
								Static698.anIntArray611[local96] = local54.anInt1144;
							}
							local522++;
							local96--;
						}
						if (!local26[arg7 + 1 & 0x3]) {
							arg9[1] = Static526.aBooleanArrayArray5[local74][local511 + 3 & 0x3];
						}
					} else if (!local26[arg7 + 1 & 0x3]) {
						arg9[1] = Static208.aBooleanArrayArray2[local74][local511 + 3 & 0x3];
					}
				}
			}
		}
		if (arg6 == null) {
			return;
		}
		local44 = Static147.method2422(arg5, arg6);
		if (!arg6.aBoolean95) {
			return;
		}
		for (@Pc(1289) int local1289 = 0; local1289 < 8; local1289++) {
			@Pc(1300) int local1300 = local1289 - arg7 * 2 & 0x7;
			if (Static600.aBooleanArrayArray6[arg1][local1289] && arg6.anInt1144 >= Static698.anIntArray611[local1300]) {
				Static144.anIntArray132[local1300] = arg6.anInt1150;
				Static268.anIntArray277[local1300] = local44;
				Static675.anIntArray602[local1300] = arg6.anInt1147;
				Static535.anIntArray490[local1300] = arg6.anInt1145;
				if (arg6.anInt1144 == Static698.anIntArray611[local1300]) {
					Static48.anIntArray57[local1300] |= 0x2;
				} else {
					Static48.anIntArray57[local1300] = 2;
				}
				Static698.anIntArray611[local1300] = arg6.anInt1144;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLclient!ha;Lclient!s;Lclient!s;)V")
	public final void method3076(@OriginalArg(1) Class67 arg0, @OriginalArg(2) Class313 arg1, @OriginalArg(3) Class313 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt3577][this.anInt3582];
		if (Static328.anIntArray320 == null || Static328.anIntArray320.length != this.anInt3582) {
			Static696.anIntArray609 = new int[this.anInt3582];
			Static46.anIntArray55 = new int[this.anInt3582];
			Static510.anIntArray605 = new int[this.anInt3582];
			Static328.anIntArray320 = new int[this.anInt3582];
			Static530.anIntArray486 = new int[this.anInt3582];
		}
		@Pc(62) int local62;
		for (@Pc(48) int local48 = 0; local48 < this.anInt3589; local48++) {
			for (local62 = 0; local62 < this.anInt3582; local62++) {
				Static328.anIntArray320[local62] = 0;
				Static46.anIntArray55[local62] = 0;
				Static510.anIntArray605[local62] = 0;
				Static530.anIntArray486[local62] = 0;
				Static696.anIntArray609[local62] = 0;
			}
			for (@Pc(97) int local97 = -5; local97 < this.anInt3577; local97++) {
				@Pc(113) int local113;
				@Pc(132) int local132;
				@Pc(201) int local201;
				for (@Pc(105) int local105 = 0; local105 < this.anInt3582; local105++) {
					local113 = local97 + 5;
					@Pc(178) int local178;
					if (this.anInt3577 > local113) {
						local132 = this.aByteArrayArrayArray14[local48][local113][local105] & 0xFF;
						if (local132 > 0) {
							@Pc(142) Class159 local142 = this.aClass124_2.method2963(local132 - 1);
							Static328.anIntArray320[local105] += local142.anInt4734;
							Static46.anIntArray55[local105] += local142.anInt4737;
							Static510.anIntArray605[local105] += local142.anInt4735;
							Static530.anIntArray486[local105] += local142.anInt4731;
							local178 = Static696.anIntArray609[local105]++;
						}
					}
					local132 = local97 - 5;
					if (local132 >= 0) {
						local201 = this.aByteArrayArrayArray14[local48][local132][local105] & 0xFF;
						if (local201 > 0) {
							@Pc(214) Class159 local214 = this.aClass124_2.method2963(local201 - 1);
							Static328.anIntArray320[local105] -= local214.anInt4734;
							Static46.anIntArray55[local105] -= local214.anInt4737;
							Static510.anIntArray605[local105] -= local214.anInt4735;
							Static530.anIntArray486[local105] -= local214.anInt4731;
							local178 = Static696.anIntArray609[local105]--;
						}
					}
				}
				if (local97 >= 0) {
					local113 = 0;
					local132 = 0;
					local201 = 0;
					@Pc(275) int local275 = 0;
					@Pc(277) int local277 = 0;
					for (@Pc(279) int local279 = -5; local279 < this.anInt3582; local279++) {
						@Pc(285) int local285 = local279 + 5;
						if (this.anInt3582 > local285) {
							local275 += Static530.anIntArray486[local285];
							local201 += Static510.anIntArray605[local285];
							local113 += Static328.anIntArray320[local285];
							local277 += Static696.anIntArray609[local285];
							local132 += Static46.anIntArray55[local285];
						}
						@Pc(327) int local327 = local279 - 5;
						if (local327 >= 0) {
							local132 -= Static46.anIntArray55[local327];
							local201 -= Static510.anIntArray605[local327];
							local277 -= Static696.anIntArray609[local327];
							local275 -= Static530.anIntArray486[local327];
							local113 -= Static328.anIntArray320[local327];
						}
						if (local279 >= 0 && local275 > 0 && local277 > 0) {
							local11[local97][local279] = Static480.method7030(local132 / local277, local113 * 256 / local275, local201 / local277);
						}
					}
				}
			}
			if (Static210.aBoolean296) {
				this.method3079(arg0, Static639.aClass313Array2[local48], local48, local11, local48 == 0 ? arg1 : null, local48 == 0 ? arg2 : null);
			} else {
				this.method3069(local48 == 0 ? arg2 : null, arg0, local48, Static639.aClass313Array2[local48], local11, local48 == 0 ? arg1 : null);
			}
			this.aByteArrayArrayArray14[local48] = null;
			this.aByteArrayArrayArray10[local48] = null;
			this.aByteArrayArrayArray13[local48] = null;
			this.aByteArrayArrayArray9[local48] = null;
		}
		if (!this.aBoolean291) {
			if (Static12.anInt155 != 0) {
				Static658.method8809();
			}
			if (Static197.aBoolean282) {
				Static563.method7837();
			}
		}
		for (local62 = 0; local62 < this.anInt3589; local62++) {
			Static639.aClass313Array2[local62].YA();
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[Lclient!tq;Lclient!rba;II)V")
	public final void method3077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class360[] arg2, @OriginalArg(4) Class3_Sub28 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(28) int local28;
		if (!this.aBoolean291) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class360 local12 = arg2[local6];
				for (@Pc(14) int local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = arg5 + local14;
						local28 = local18 + arg0;
						if (local24 >= 0 && this.anInt3577 > local24 && local28 >= 0 && this.anInt3582 > local28) {
							local12.method8484(local28, local24);
						}
					}
				}
			}
		}
		local6 = arg5 + arg4;
		@Pc(102) int local102 = arg1 + arg0;
		for (local18 = 0; local18 < this.anInt3589; local18++) {
			for (local24 = 0; local24 < 64; local24++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method3071(local24 + local6, arg3, 0, local102 + local28, local18, arg0 + local28, 0, false, 0, arg5 + local24);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I[[II)V")
	public final void method3078(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray4[0];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3577 + 1; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt3582 + 1; local24++) {
				local10[local20][local24] += arg0[local20][local24];
			}
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!ha;Lclient!s;I[[ILclient!s;Lclient!s;B)V")
	private void method3079(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) Class313 arg4, @OriginalArg(5) Class313 arg5) {
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray13[arg2];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray9[arg2];
		@Pc(38) byte[][] local38 = this.aByteArrayArrayArray14[arg2];
		@Pc(43) byte[][] local43 = this.aByteArrayArrayArray10[arg2];
		for (@Pc(45) int local45 = 0; local45 < this.anInt3577; local45++) {
			@Pc(62) int local62 = local45 < this.anInt3577 - 1 ? local45 + 1 : local45;
			for (@Pc(64) int local64 = 0; local64 < this.anInt3582; local64++) {
				@Pc(81) int local81 = this.anInt3582 - 1 > local64 ? local64 + 1 : local64;
				if (Static477.anInt8337 == -1 || Static467.method6925(arg2, local45, Static477.anInt8337, local64)) {
					@Pc(100) boolean local100 = false;
					@Pc(102) boolean local102 = false;
					@Pc(105) boolean[] local105 = new boolean[4];
					@Pc(111) int local111 = local28[local45][local64];
					@Pc(117) int local117 = local33[local45][local64];
					@Pc(125) int local125 = local43[local45][local64] & 0xFF;
					@Pc(133) int local133 = local38[local45][local64] & 0xFF;
					@Pc(141) int local141 = local38[local45][local81] & 0xFF;
					@Pc(149) int local149 = local38[local62][local81] & 0xFF;
					@Pc(157) int local157 = local38[local62][local64] & 0xFF;
					if (local125 != 0 || local133 != 0) {
						@Pc(187) Class46 local187 = local125 == 0 ? null : this.aClass140_4.method3535(local125 - 1);
						@Pc(200) Class159 local200 = local133 == 0 ? null : this.aClass124_2.method2963(local133 - 1);
						if (local111 == 0 && local187 == null) {
							local111 = 12;
						}
						@Pc(210) Class46 local210 = local187;
						if (local187 != null) {
							if (local187.anInt1150 == -1 && local187.anInt1148 == -1) {
								local210 = local187;
								local187 = null;
							} else if (local200 != null && local111 != 0) {
								local102 = local187.aBoolean95;
							}
						}
						@Pc(310) int local310;
						@Pc(377) int local377;
						@Pc(447) int local447;
						@Pc(457) int local457;
						if ((local111 == 0 || local111 == 12) && local45 > 0 && local64 > 0 && local45 < this.anInt3577 && this.anInt3582 > local64) {
							local310 = local38[local45 - 1][local64 - 1] == local133 ? 1 : -1;
							@Pc(326) int local326 = local38[local62][local64 - 1] == local133 ? 1 : -1;
							@Pc(340) int local340 = local38[local62][local81] == local133 ? 1 : -1;
							if (local133 == local38[local45][local64 - 1]) {
								local310++;
								local326++;
							} else {
								local310--;
								local326--;
							}
							local377 = local38[local45 - 1][local81] == local133 ? 1 : -1;
							if (local133 == local38[local62][local64]) {
								local326++;
								local340++;
							} else {
								local340--;
								local326--;
							}
							if (local38[local45][local81] == local133) {
								local340++;
								local377++;
							} else {
								local377--;
								local340--;
							}
							if (local133 == local38[local45 - 1][local64]) {
								local310++;
								local377++;
							} else {
								local310--;
								local377--;
							}
							local447 = local310 - local340;
							if (local447 < 0) {
								local447 = -local447;
							}
							local457 = local326 - local377;
							if (local457 < 0) {
								local457 = -local457;
							}
							if (local447 == local457) {
								local447 = arg1.method9095(local64, local45) - arg1.method9095(local81, local62);
								if (local447 < 0) {
									local447 = -local447;
								}
								local457 = arg1.method9095(local64, local62) - arg1.method9095(local81, local45);
								if (local457 < 0) {
									local457 = -local457;
								}
							}
							local117 = local447 >= local457 ? 0 : 1;
						}
						for (local310 = 0; local310 < 13; local310++) {
							Static698.anIntArray611[local310] = -1;
							Static48.anIntArray57[local310] = 1;
						}
						@Pc(559) boolean[] local559 = local187 != null && local187.aBoolean95 ? Static526.aBooleanArrayArray5[local111] : Static208.aBooleanArrayArray2[local111];
						this.method3075(local45, local111, local64, local28, this.anInt3577, arg0, local187, local117, local43, local105, local200, local33, this.anInt3582);
						@Pc(591) boolean local591 = local187 != null && local187.anInt1148 != local187.anInt1150;
						if (!local591) {
							for (local377 = 0; local377 < 8; local377++) {
								if (Static698.anIntArray611[local377] >= 0 && Static144.anIntArray132[local377] != Static268.anIntArray277[local377]) {
									local591 = true;
									break;
								}
							}
						}
						if (!local559[local117 + 1 & 0x3]) {
							local105[1] = Static5.method81(local105[1], (Static48.anIntArray57[2] & Static48.anIntArray57[4]) == 0);
						}
						if (!local559[local117 + 3 & 0x3]) {
							local105[3] = Static5.method81(local105[3], (Static48.anIntArray57[0] & Static48.anIntArray57[6]) == 0);
						}
						if (!local559[local117 & 0x3]) {
							local105[0] = Static5.method81(local105[0], (Static48.anIntArray57[0] & Static48.anIntArray57[2]) == 0);
						}
						if (!local559[local117 + 2 & 0x3]) {
							local105[2] = Static5.method81(local105[2], (Static48.anIntArray57[4] & Static48.anIntArray57[6]) == 0);
						}
						if (!local102 && (local111 == 0 || local111 == 12)) {
							if (local105[0] && !local105[1] && !local105[2] && local105[3]) {
								local111 = local111 == 0 ? 13 : 14;
								local105[0] = local105[3] = false;
								local117 = 0;
							} else if (local105[0] && local105[1] && !local105[2] && !local105[3]) {
								local111 = local111 == 0 ? 13 : 14;
								local117 = 3;
								local105[0] = local105[1] = false;
							} else if (!local105[0] && local105[1] && local105[2] && !local105[3]) {
								local117 = 2;
								local105[1] = local105[2] = false;
								local111 = local111 == 0 ? 13 : 14;
							} else if (!local105[0] && !local105[1] && local105[2] && local105[3]) {
								local117 = 1;
								local111 = local111 == 0 ? 13 : 14;
								local105[2] = local105[3] = false;
							}
						}
						@Pc(982) boolean local982 = !local102 && !local105[0] && !local105[2] && !local105[1] && !local105[3];
						@Pc(984) int[] local984 = null;
						@Pc(1024) int[] local1024;
						@Pc(1011) int[] local1011;
						@Pc(998) int[] local998;
						if (local982) {
							local1024 = Static551.anIntArrayArray51[local111];
							local447 = local200 == null ? 0 : Static490.anIntArray463[local111];
							local1011 = Static397.anIntArrayArray39[local111];
							local457 = local187 == null ? 0 : Static143.anIntArray131[local111];
							local998 = Static699.anIntArrayArray61[local111];
						} else if (local102) {
							local984 = Static664.anIntArrayArray58[local111];
							local998 = Static726.anIntArrayArray65[local111];
							local457 = local187 == null ? 0 : Static471.anIntArray597[local111];
							local1011 = Static339.anIntArrayArray32[local111];
							local447 = local200 == null ? 0 : Static623.anIntArray575[local111];
							local1024 = Static680.anIntArrayArray59[local111];
						} else {
							local984 = Static25.anIntArrayArray2[local111];
							local447 = local200 == null ? 0 : Static395.anIntArray385[local111];
							local1024 = Static622.anIntArrayArray55[local111];
							local1011 = Static292.anIntArrayArray27[local111];
							local457 = local187 == null ? 0 : Static673.anIntArray600[local111];
							local998 = Static151.anIntArrayArray14[local111];
						}
						@Pc(1094) int local1094 = local447 + local457;
						if (local1094 <= 0) {
							Static306.method4660(arg2, local45, local64);
						} else {
							if (local105[0]) {
								local1094++;
							}
							if (local105[2]) {
								local1094++;
							}
							if (local105[1]) {
								local1094++;
							}
							if (local105[3]) {
								local1094++;
							}
							@Pc(1139) int local1139 = 0;
							@Pc(1141) int local1141 = 0;
							@Pc(1145) int local1145 = local1094 * 3;
							@Pc(1153) int[] local1153 = local591 ? new int[local1145] : null;
							@Pc(1156) int[] local1156 = new int[local1145];
							@Pc(1159) int[] local1159 = new int[local1145];
							@Pc(1162) int[] local1162 = new int[local1145];
							@Pc(1165) int[] local1165 = new int[local1145];
							@Pc(1168) int[] local1168 = new int[local1145];
							@Pc(1176) int[] local1176 = arg5 == null ? null : new int[local1145];
							@Pc(1188) int[] local1188 = arg5 == null && arg4 == null ? null : new int[local1145];
							@Pc(1190) int local1190 = -1;
							@Pc(1192) int local1192 = -1;
							@Pc(1194) int local1194 = 256;
							@Pc(1218) boolean local1218;
							@Pc(1210) int local1210;
							@Pc(1212) int local1212;
							@Pc(1469) int local1469;
							@Pc(1475) int local1475;
							@Pc(1483) int local1483;
							@Pc(1488) int local1488;
							@Pc(1500) int local1500;
							@Pc(1493) int local1493;
							@Pc(1504) int local1504;
							@Pc(1568) int local1568;
							@Pc(1574) int local1574;
							@Pc(1270) byte local1270;
							if (local187 != null) {
								local1190 = local187.anInt1150;
								local1192 = local187.anInt1147;
								local1194 = local187.anInt1145;
								local1210 = Static147.method2422(arg0, local187);
								for (local1212 = 0; local1212 < local457; local1212++) {
									local1218 = false;
									if (local105[-local117 & 0x3] && local984[0] == local1139) {
										Static543.anIntArray499[0] = local1024[local1139];
										Static543.anIntArray499[1] = 1;
										Static543.anIntArray499[2] = local998[local1139];
										Static543.anIntArray499[3] = 1;
										Static543.anIntArray499[4] = local1011[local1139];
										Static543.anIntArray499[5] = local998[local1139];
										local1270 = 6;
									} else if (local105[2 - local117 & 0x3] && local1139 == local984[2]) {
										Static543.anIntArray499[0] = local1024[local1139];
										Static543.anIntArray499[1] = 5;
										Static543.anIntArray499[2] = local998[local1139];
										Static543.anIntArray499[3] = 5;
										Static543.anIntArray499[4] = local1011[local1139];
										local1270 = 6;
										Static543.anIntArray499[5] = local998[local1139];
									} else if (local105[1 - local117 & 0x3] && local984[1] == local1139) {
										Static543.anIntArray499[0] = local1024[local1139];
										Static543.anIntArray499[1] = 3;
										Static543.anIntArray499[2] = local998[local1139];
										Static543.anIntArray499[3] = 3;
										Static543.anIntArray499[4] = local1011[local1139];
										local1270 = 6;
										Static543.anIntArray499[5] = local998[local1139];
									} else if (local105[3 - local117 & 0x3] && local984[3] == local1139) {
										Static543.anIntArray499[0] = local1024[local1139];
										Static543.anIntArray499[1] = 7;
										Static543.anIntArray499[2] = local998[local1139];
										Static543.anIntArray499[3] = 7;
										Static543.anIntArray499[4] = local1011[local1139];
										Static543.anIntArray499[5] = local998[local1139];
										local1270 = 6;
									} else {
										Static543.anIntArray499[0] = local1024[local1139];
										Static543.anIntArray499[1] = local1011[local1139];
										local1270 = 3;
										Static543.anIntArray499[2] = local998[local1139];
									}
									local1139++;
									for (local1469 = 0; local1469 < local1270; local1469++) {
										local1475 = Static543.anIntArray499[local1469];
										local1483 = local1475 - local117 * 2 & 0x7;
										local1488 = this.anIntArray188[local1475];
										local1493 = this.anIntArray189[local1475];
										if (local117 == 1) {
											local1500 = local1493;
											local1504 = 512 - local1488;
										} else if (local117 == 2) {
											local1504 = 512 - local1493;
											local1500 = 512 - local1488;
										} else if (local117 == 3) {
											local1504 = local1488;
											local1500 = 512 - local1493;
										} else {
											local1500 = local1488;
											local1504 = local1493;
										}
										local1156[local1141] = local1500;
										local1159[local1141] = local1504;
										if (local1176 != null && Static600.aBooleanArrayArray6[local111][local1475]) {
											local1568 = local1500 + (local45 << 9);
											local1574 = (local64 << 9) + local1504;
											local1176[local1141] = arg5.method9096(local1568, local1574) - arg1.method9096(local1568, local1574);
										}
										if (local1188 != null) {
											if (arg5 != null && !Static600.aBooleanArrayArray6[local111][local1475]) {
												local1568 = local1500 + (local45 << 9);
												local1574 = (local64 << 9) + local1504;
												local1188[local1141] = arg1.method9096(local1568, local1574) - arg5.method9096(local1568, local1574);
											} else if (arg4 != null && !Static374.aBooleanArrayArray3[local111][local1475]) {
												local1568 = local1500 + (local45 << 9);
												local1574 = (local64 << 9) + local1504;
												local1188[local1141] = arg4.method9096(local1568, local1574) - arg1.method9096(local1568, local1574);
											}
										}
										if (local1475 < 8 && Static698.anIntArray611[local1483] > local187.anInt1144) {
											if (local1153 != null) {
												local1153[local1141] = Static268.anIntArray277[local1483];
											}
											local1168[local1141] = Static535.anIntArray490[local1483];
											local1165[local1141] = Static675.anIntArray602[local1483];
											local1162[local1141] = Static144.anIntArray132[local1483];
										} else {
											if (local1153 != null) {
												local1153[local1141] = local1210;
											}
											local1165[local1141] = local187.anInt1147;
											local1168[local1141] = local187.anInt1145;
											local1162[local1141] = local1190;
										}
										local1141++;
									}
								}
								if (!this.aBoolean291 && arg2 == 0) {
									Static89.method1193(local45, local64, local187.anInt1140, local187.anInt1143 * 8, local187.anInt1139);
								}
								if (local111 != 12 && local187.anInt1150 != -1 && local187.aBoolean93) {
									local100 = true;
								}
							} else if (local982) {
								local1139 = Static143.anIntArray131[local111];
							} else if (local102) {
								local1139 = Static471.anIntArray597[local111];
							} else {
								local1139 = Static673.anIntArray600[local111];
							}
							if (local200 != null) {
								if (local157 == 0) {
									local157 = local133;
								}
								if (local141 == 0) {
									local141 = local133;
								}
								if (local149 == 0) {
									local149 = local133;
								}
								@Pc(1861) Class159 local1861 = this.aClass124_2.method2963(local133 - 1);
								@Pc(1869) Class159 local1869 = this.aClass124_2.method2963(local141 - 1);
								@Pc(1877) Class159 local1877 = this.aClass124_2.method2963(local149 - 1);
								@Pc(1885) Class159 local1885 = this.aClass124_2.method2963(local157 - 1);
								for (local1483 = 0; local1483 < local447; local1483++) {
									local1218 = false;
									if (local105[-local117 & 0x3] && local984[0] == local1139) {
										Static543.anIntArray499[0] = local1024[local1139];
										Static543.anIntArray499[1] = 1;
										Static543.anIntArray499[2] = local998[local1139];
										Static543.anIntArray499[3] = 1;
										Static543.anIntArray499[4] = local1011[local1139];
										local1270 = 6;
										Static543.anIntArray499[5] = local998[local1139];
									} else if (local105[2 - local117 & 0x3] && local984[2] == local1139) {
										Static543.anIntArray499[0] = local1024[local1139];
										Static543.anIntArray499[1] = 5;
										Static543.anIntArray499[2] = local998[local1139];
										Static543.anIntArray499[3] = 5;
										Static543.anIntArray499[4] = local1011[local1139];
										local1270 = 6;
										Static543.anIntArray499[5] = local998[local1139];
									} else if (local105[1 - local117 & 0x3] && local1139 == local984[1]) {
										Static543.anIntArray499[0] = local1024[local1139];
										Static543.anIntArray499[1] = 3;
										Static543.anIntArray499[2] = local998[local1139];
										Static543.anIntArray499[3] = 3;
										Static543.anIntArray499[4] = local1011[local1139];
										Static543.anIntArray499[5] = local998[local1139];
										local1270 = 6;
									} else if (local105[3 - local117 & 0x3] && local1139 == local984[3]) {
										Static543.anIntArray499[0] = local1024[local1139];
										Static543.anIntArray499[1] = 7;
										Static543.anIntArray499[2] = local998[local1139];
										Static543.anIntArray499[3] = 7;
										Static543.anIntArray499[4] = local1011[local1139];
										Static543.anIntArray499[5] = local998[local1139];
										local1270 = 6;
									} else {
										Static543.anIntArray499[0] = local1024[local1139];
										Static543.anIntArray499[1] = local1011[local1139];
										local1270 = 3;
										Static543.anIntArray499[2] = local998[local1139];
									}
									for (local1488 = 0; local1488 < local1270; local1488++) {
										local1500 = Static543.anIntArray499[local1488];
										local1493 = local1500 - local117 * 2 & 0x7;
										local1504 = this.anIntArray188[local1500];
										local1574 = this.anIntArray189[local1500];
										@Pc(2166) int local2166;
										if (local117 == 1) {
											local2166 = 512 - local1504;
											local1568 = local1574;
										} else if (local117 == 2) {
											local2166 = 512 - local1574;
											local1568 = 512 - local1504;
										} else if (local117 == 3) {
											local1568 = 512 - local1574;
											local2166 = local1504;
										} else {
											local1568 = local1504;
											local2166 = local1574;
										}
										local1156[local1141] = local1568;
										local1159[local1141] = local2166;
										@Pc(2229) int local2229;
										@Pc(2235) int local2235;
										if (local1176 != null && Static600.aBooleanArrayArray6[local111][local1500]) {
											local2229 = local1568 + (local45 << 9);
											local2235 = (local64 << 9) + local2166;
											local1176[local1141] = arg5.method9096(local2229, local2235) - arg1.method9096(local2229, local2235);
										}
										if (local1188 != null) {
											if (arg5 != null && !Static600.aBooleanArrayArray6[local111][local1500]) {
												local2229 = local1568 + (local45 << 9);
												local2235 = (local64 << 9) + local2166;
												local1188[local1141] = arg1.method9096(local2229, local2235) - arg5.method9096(local2229, local2235);
											} else if (arg4 != null && !Static374.aBooleanArrayArray3[local111][local1500]) {
												local2229 = (local45 << 9) + local1568;
												local2235 = local2166 + (local64 << 9);
												local1188[local1141] = arg4.method9096(local2229, local2235) - arg1.method9096(local2229, local2235);
											}
										}
										if (local1500 < 8 && Static698.anIntArray611[local1493] >= 0) {
											if (local1153 != null) {
												local1153[local1141] = Static268.anIntArray277[local1493];
											}
											local1168[local1141] = Static535.anIntArray490[local1493];
											local1165[local1141] = Static675.anIntArray602[local1493];
											local1162[local1141] = Static144.anIntArray132[local1493];
										} else {
											if (local102 && Static600.aBooleanArrayArray6[local111][local1500]) {
												local1165[local1141] = local1192;
												local1168[local1141] = local1194;
												local1162[local1141] = local1190;
											} else if (local1568 == 0 && local2166 == 0) {
												local1162[local1141] = arg3[local45][local64];
												local1165[local1141] = local1861.anInt4732;
												local1168[local1141] = local1861.anInt4730;
											} else if (local1568 == 0 && local2166 == 512) {
												local1162[local1141] = arg3[local45][local81];
												local1165[local1141] = local1869.anInt4732;
												local1168[local1141] = local1869.anInt4730;
											} else if (local1568 == 512 && local2166 == 512) {
												local1162[local1141] = arg3[local62][local81];
												local1165[local1141] = local1877.anInt4732;
												local1168[local1141] = local1877.anInt4730;
											} else if (local1568 == 512 && local2166 == 0) {
												local1162[local1141] = arg3[local62][local64];
												local1165[local1141] = local1885.anInt4732;
												local1168[local1141] = local1885.anInt4730;
											} else {
												if (local1568 < 256) {
													if (local2166 >= 256) {
														local1165[local1141] = local1869.anInt4732;
														local1168[local1141] = local1869.anInt4730;
													} else {
														local1165[local1141] = local1861.anInt4732;
														local1168[local1141] = local1861.anInt4730;
													}
												} else if (local2166 < 256) {
													local1165[local1141] = local1885.anInt4732;
													local1168[local1141] = local1885.anInt4730;
												} else {
													local1165[local1141] = local1877.anInt4732;
													local1168[local1141] = local1877.anInt4730;
												}
												local2229 = Static713.method9290(arg3[local45][local64], arg3[local62][local64], local1568 << 7 >> 9);
												local2235 = Static713.method9290(arg3[local45][local81], arg3[local62][local81], local1568 << 7 >> 9);
												local1162[local1141] = Static713.method9290(local2229, local2235, local2166 << 7 >> 9);
											}
											if (local1153 != null) {
												local1153[local1141] = local1162[local1141];
											}
										}
										local1141++;
									}
									local1139++;
								}
								if (local111 != 0 && local200.aBoolean415) {
									local100 = true;
								}
							}
							local1210 = arg1.method9095(local64, local45);
							local1212 = arg1.method9095(local64, local62);
							local1469 = arg1.method9095(local81, local62);
							local1475 = arg1.method9095(local81, local45);
							@Pc(2723) boolean local2723 = Static135.method2226(local45, local64);
							if (local2723 && arg2 > 1 || !local2723 && arg2 > 0) {
								@Pc(2743) boolean local2743 = true;
								if (local200 != null && !local200.aBoolean414) {
									local2743 = false;
								} else if (local133 == 0 && local111 != 0) {
									local2743 = false;
								} else if (local125 > 0 && local210 != null && !local210.aBoolean92) {
									local2743 = false;
								}
								if (local2743 && local1212 == local1210 && local1469 == local1210 && local1210 == local1475) {
									this.aByteArrayArrayArray11[arg2][local45][local64] = (byte) (this.aByteArrayArrayArray11[arg2][local45][local64] | 0x4);
								}
							}
							local1488 = 0;
							local1500 = 0;
							local1493 = 0;
							if (this.aBoolean291) {
								local1488 = Static405.method6058(local45, local64);
								local1500 = Static479.method7001(local45, local64);
								local1493 = Static671.method8889(local45, local64);
							}
							arg1.U(local45, local64, local1156, local1176, local1159, local1188, local1162, local1153, local1165, local1168, local1488, local1500, local1493, local100);
							Static306.method4660(arg2, local45, local64);
						}
					}
				}
			}
		}
	}
}
