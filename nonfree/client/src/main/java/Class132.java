import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public class Class132 {

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "[I")
	private final int[] anIntArray580 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "[I")
	private final int[] anIntArray579 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
	public final int anInt9342;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "Lclient!pe;")
	private final Class258 aClass258_5;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "Lclient!sl;")
	private final Class310 aClass310_5;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
	protected final int anInt9341;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	protected final int anInt9338;

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "Z")
	public final boolean aBoolean787;

	@OriginalMember(owner = "client!hk", name = "D", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIZLclient!pe;Lclient!sl;)V")
	protected Class132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class258 arg4, @OriginalArg(5) Class310 arg5) {
		this.anInt9342 = arg0;
		this.aClass258_5 = arg4;
		this.aClass310_5 = arg5;
		this.anInt9341 = arg1;
		this.anInt9338 = arg2;
		this.aBoolean787 = arg3;
		this.aByteArrayArrayArray18 = new byte[this.anInt9342][this.anInt9341][this.anInt9338];
		this.aByteArrayArrayArray13 = new byte[this.anInt9342][this.anInt9341 + 1][this.anInt9338 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt9342][this.anInt9341][this.anInt9338];
		this.aByteArrayArrayArray14 = new byte[this.anInt9342][this.anInt9341][this.anInt9338];
		this.anIntArrayArrayArray12 = new int[this.anInt9342][this.anInt9341 + 1][this.anInt9338 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt9342][this.anInt9341][this.anInt9338];
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII[Lclient!rl;IIILclient!tn;I)V")
	public final void method7702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class291[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub15 arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg0 & 0x7) * 8;
		@Pc(17) int local17 = (arg6 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(57) int local57;
		if (!this.aBoolean787) {
			@Pc(24) Class291 local24 = arg4[arg5];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(45) int local45 = arg8 + Static122.method2840(arg2, local30 & 0x7, local26 & 0x7);
					local57 = Static158.method3379(local26 & 0x7, arg2, local30 & 0x7) + arg3;
					if (local45 > 0 && this.anInt9341 - 1 > local45 && local57 > 0 && this.anInt9338 - 1 > local57) {
						local24.method7205(local45, local57);
					}
				}
			}
		}
		@Pc(99) int local99 = (arg0 & 0xFFFFFFF8) << 3;
		local26 = (arg6 & 0xFFFFFFF8) << 3;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		if (arg2 == 1) {
			local117 = 1;
		} else if (arg2 == 2) {
			local115 = 1;
			local117 = 1;
		} else if (arg2 == 3) {
			local115 = 1;
		}
		for (local57 = 0; local57 < this.anInt9342; local57++) {
			for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
				for (@Pc(150) int local150 = 0; local150 < 64; local150++) {
					if (local57 == arg1 && local146 >= local11 && local146 <= local11 + 8 && local17 <= local150 && local150 <= local17 + 8) {
						@Pc(216) int local216;
						@Pc(223) int local223;
						if (local11 + 8 == local146 || local17 + 8 == local150) {
							if (arg2 == 0) {
								local216 = local146 + arg8 - local11;
								local223 = local150 + arg3 - local17;
							} else if (arg2 == 1) {
								local216 = arg8 + local150 - local17;
								local223 = local11 + arg3 + 8 - local146;
							} else if (arg2 == 2) {
								local223 = arg3 + local17 + 8 - local150;
								local216 = arg8 + local11 + 8 - local146;
							} else {
								local223 = arg3 + local146 - local11;
								local216 = arg8 + local17 + 8 - local150;
							}
							this.method7703(arg5, 0, local26 + local150, true, 0, arg7, local216, local223, local146 + local99, 0);
						} else {
							local216 = Static122.method2840(arg2, local150 & 0x7, local146 & 0x7) + arg8;
							local223 = Static158.method3379(local146 & 0x7, arg2, local150 & 0x7) + arg3;
							this.method7703(arg5, local117, local150 + local26, false, arg2, arg7, local216, local223, local146 + local99, local115);
						}
						if (local146 == 63 || local150 == 63) {
							@Pc(363) byte local363 = 1;
							if (local146 == 63 && local150 == 63) {
								local363 = 3;
							}
							for (@Pc(377) int local377 = 0; local377 < local363; local377++) {
								@Pc(381) int local381 = local146;
								@Pc(383) int local383 = local150;
								if (local377 == 0) {
									local381 = local146 == 63 ? 64 : local146;
									local383 = local150 == 63 ? 64 : local150;
								} else if (local377 == 1) {
									local381 = 64;
								} else if (local377 == 2) {
									local383 = 64;
								}
								@Pc(436) int local436;
								@Pc(429) int local429;
								if (arg2 == 0) {
									local429 = local383 + arg3 - local17;
									local436 = local381 + arg8 - local11;
								} else if (arg2 == 1) {
									local429 = arg3 + local11 + 8 - local381;
									local436 = arg8 + local383 - local17;
								} else if (arg2 == 2) {
									local436 = local11 + arg8 + 8 - local381;
									local429 = local17 + arg3 + 8 - local383;
								} else {
									local436 = local17 + arg8 + 8 - local383;
									local429 = arg3 + local381 - local11;
								}
								if (local436 >= 0 && local436 < this.anInt9341 && local429 >= 0 && local429 < this.anInt9338) {
									this.anIntArrayArrayArray12[arg5][local436][local429] = this.anIntArrayArrayArray12[arg5][local216 + local115][local117 + local223];
								}
							}
						}
					} else {
						this.method7703(0, 0, 0, false, 0, arg7, -1, -1, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIZILclient!tn;IIII)V")
	private void method7703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg4 == 1) {
			arg1 = 1;
		} else if (arg4 == 2) {
			arg9 = 1;
			arg1 = 1;
		} else if (arg4 == 3) {
			arg9 = 1;
		}
		@Pc(57) int local57;
		if (arg6 < 0 || this.anInt9341 <= arg6 || arg7 < 0 || arg7 >= this.anInt9338) {
			while (true) {
				local57 = arg5.method8401();
				if (local57 == 0) {
					return;
				}
				if (local57 == 1) {
					arg5.method8401();
					return;
				}
				if (local57 <= 49) {
					arg5.method8401();
				}
			}
			return;
		}
		if (!this.aBoolean787 && !arg3) {
			Static244.aByteArrayArrayArray10[arg0][arg6][arg7] = 0;
		}
		while (true) {
			local57 = arg5.method8401();
			if (local57 == 0) {
				if (this.aBoolean787) {
					this.anIntArrayArrayArray12[0][arg6 + arg9][arg7 + arg1] = 0;
					return;
				} else if (arg0 == 0) {
					this.anIntArrayArrayArray12[0][arg6 + arg9][arg7 + arg1] = -Static188.method3753(arg8 + 932731, arg2 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray12[arg0][arg6 + arg9][arg7 + arg1] = this.anIntArrayArrayArray12[arg0 - 1][arg9 + arg6][arg1 + arg7] - 960;
					return;
				}
			}
			if (local57 == 1) {
				@Pc(190) int local190 = arg5.method8401();
				if (this.aBoolean787) {
					this.anIntArrayArrayArray12[0][arg9 + arg6][arg1 + arg7] = local190 * 8 << 2;
					return;
				}
				if (local190 == 1) {
					local190 = 0;
				}
				if (arg0 == 0) {
					this.anIntArrayArrayArray12[0][arg9 + arg6][arg7 + arg1] = -local190 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray12[arg0][arg9 + arg6][arg7 + arg1] = this.anIntArrayArrayArray12[arg0 - 1][arg9 + arg6][arg1 + arg7] - (local190 * 8 << 2);
				return;
			}
			if (local57 <= 49) {
				if (arg3) {
					arg5.method8401();
				} else {
					this.aByteArrayArrayArray16[arg0][arg6][arg7] = arg5.method8440();
					this.aByteArrayArrayArray15[arg0][arg6][arg7] = (byte) ((local57 - 2) / 4);
					this.aByteArrayArrayArray18[arg0][arg6][arg7] = (byte) (arg4 + local57 - 2 & 0x3);
				}
			} else if (local57 <= 81) {
				if (!this.aBoolean787 && !arg3) {
					Static244.aByteArrayArrayArray10[arg0][arg6][arg7] = (byte) (local57 - 49);
				}
			} else if (!arg3) {
				this.aByteArrayArrayArray14[arg0][arg6][arg7] = (byte) (local57 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIII)V")
	public final void method7704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg1; local7 < arg1 + arg0; local7++) {
			for (local11 = arg2; local11 < arg2 + arg4; local11++) {
				if (local11 >= 0 && local11 < this.anInt9341 && local7 >= 0 && this.anInt9338 > local7) {
					this.anIntArrayArrayArray12[arg3][local11][local7] = arg3 > 0 ? this.anIntArrayArrayArray12[arg3 - 1][local11][local7] - 960 : 0;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt9341) {
			for (local11 = arg1 + 1; local11 < arg1 + arg0; local11++) {
				if (local11 >= 0 && local11 < this.anInt9338) {
					this.anIntArrayArrayArray12[arg3][arg2][local11] = this.anIntArrayArrayArray12[arg3][arg2 - 1][local11];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt9338) {
			for (local11 = arg2 + 1; local11 < arg2 + arg4; local11++) {
				if (local11 >= 0 && local11 < this.anInt9341) {
					this.anIntArrayArrayArray12[arg3][local11][arg1] = this.anIntArrayArrayArray12[arg3][local11][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || this.anInt9341 <= arg2 || this.anInt9338 <= arg1) {
			return;
		}
		if (arg3 != 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray12[arg3][arg2 - 1][arg1] != this.anIntArrayArrayArray12[arg3 - 1][arg2 - 1][arg1]) {
				this.anIntArrayArrayArray12[arg3][arg2][arg1] = this.anIntArrayArrayArray12[arg3][arg2 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray12[arg3 - 1][arg2][arg1 - 1] != this.anIntArrayArrayArray12[arg3][arg2][arg1 - 1]) {
				this.anIntArrayArrayArray12[arg3][arg2][arg1] = this.anIntArrayArrayArray12[arg3][arg2][arg1 - 1];
				return;
			}
			if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray12[arg3][arg2 - 1][arg1 - 1] != this.anIntArrayArrayArray12[arg3 - 1][arg2 - 1][arg1 - 1]) {
				this.anIntArrayArrayArray12[arg3][arg2][arg1] = this.anIntArrayArrayArray12[arg3][arg2 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray12[arg3][arg2 - 1][arg1] != 0) {
			this.anIntArrayArrayArray12[arg3][arg2][arg1] = this.anIntArrayArrayArray12[arg3][arg2 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray12[arg3][arg2][arg1 - 1] != 0) {
			this.anIntArrayArrayArray12[arg3][arg2][arg1] = this.anIntArrayArrayArray12[arg3][arg2][arg1 - 1];
			return;
		}
		if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray12[arg3][arg2 - 1][arg1 - 1] != 0) {
			this.anIntArrayArrayArray12[arg3][arg2][arg1] = this.anIntArrayArrayArray12[arg3][arg2 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(BIIII)V")
	public final void method7705(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt9342; local13++) {
			this.method7704(64, arg1, arg0, local13, 64);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IILclient!ha;Lclient!s;Lclient!s;Lclient!s;[[I)V")
	private void method7707(@OriginalArg(1) int arg0, @OriginalArg(2) Class33 arg1, @OriginalArg(3) Class274 arg2, @OriginalArg(4) Class274 arg3, @OriginalArg(5) Class274 arg4, @OriginalArg(6) int[][] arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9341; local7++) {
			for (@Pc(11) int local11 = 0; local11 < this.anInt9338; local11++) {
				if (Static403.anInt4294 == -1 || Static394.method6311(local7, Static403.anInt4294, arg0, local11)) {
					@Pc(34) byte local34 = this.aByteArrayArrayArray15[arg0][local7][local11];
					@Pc(43) byte local43 = this.aByteArrayArrayArray18[arg0][local7][local11];
					@Pc(54) int local54 = this.aByteArrayArrayArray16[arg0][local7][local11] & 0xFF;
					@Pc(65) int local65 = this.aByteArrayArrayArray14[arg0][local7][local11] & 0xFF;
					@Pc(77) Class374 local77 = local54 == 0 ? null : this.aClass258_5.method6555(local54 - 1);
					@Pc(92) Class69 local92 = local65 == 0 ? null : this.aClass310_5.method7464(local65 - 1);
					if (local34 == 0 && local77 == null) {
						local34 = 12;
					}
					@Pc(103) Class374 local103 = local77;
					if (local77 != null && local77.anInt10477 == -1 && local77.anInt10472 == -1) {
						local103 = local77;
						local77 = null;
					}
					if (local77 != null || local92 != null) {
						@Pc(126) int local126 = Static613.anIntArray617[local34];
						@Pc(130) int local130 = Static641.anIntArray627[local34];
						@Pc(142) int local142 = (local92 == null ? 0 : local126) + (local77 == null ? 0 : local130);
						@Pc(144) int local144 = 0;
						@Pc(146) int local146 = 0;
						@Pc(153) int local153 = local77 == null ? -1 : local77.anInt10478;
						@Pc(160) int local160 = local92 == null ? -1 : local92.anInt2630;
						@Pc(163) int[] local163 = new int[local142];
						@Pc(166) int[] local166 = new int[local142];
						@Pc(169) int[] local169 = new int[local142];
						@Pc(172) int[] local172 = new int[local142];
						@Pc(175) int[] local175 = new int[local142];
						@Pc(178) int[] local178 = new int[local142];
						@Pc(190) int[] local190 = local77 == null || local77.anInt10472 == -1 ? null : new int[local142];
						@Pc(200) int local200;
						if (local77 == null) {
							local146 = local130;
						} else {
							for (local200 = 0; local200 < local130; local200++) {
								local163[local144] = Static96.anIntArrayArray22[local34][local146];
								local166[local144] = Static364.anIntArrayArray64[local34][local146];
								local169[local144] = Static14.anIntArrayArray104[local34][local146];
								local175[local144] = local153;
								local178[local144] = local77.anInt10468;
								local172[local144] = local77.anInt10477;
								if (local190 != null) {
									local190[local144] = local77.anInt10472;
								}
								local144++;
								local146++;
							}
							if (!this.aBoolean787 && arg0 == 0) {
								Static138.method3127(local7, local11, local77.anInt10467, local77.anInt10470 * 8, local77.anInt10471);
							}
						}
						if (local92 != null) {
							for (local200 = 0; local200 < local126; local200++) {
								local163[local144] = Static96.anIntArrayArray22[local34][local146];
								local166[local144] = Static364.anIntArrayArray64[local34][local146];
								local169[local144] = Static14.anIntArrayArray104[local34][local146];
								local175[local144] = local160;
								local178[local144] = local92.anInt2632;
								local172[local144] = arg5[local7][local11];
								if (local190 != null) {
									local190[local144] = local172[local144];
								}
								local146++;
								local144++;
							}
						}
						local200 = this.anIntArray580.length;
						@Pc(344) int[] local344 = new int[local200];
						@Pc(347) int[] local347 = new int[local200];
						@Pc(354) int[] local354 = arg4 == null ? null : new int[local200];
						@Pc(363) int[] local363 = arg4 == null && arg3 == null ? null : new int[local200];
						@Pc(372) int local372;
						@Pc(377) int local377;
						@Pc(464) int local464;
						@Pc(473) int local473;
						for (@Pc(365) int local365 = 0; local365 < local200; local365++) {
							local372 = this.anIntArray580[local365];
							local377 = this.anIntArray579[local365];
							if (local43 == 0) {
								local344[local365] = local372;
								local347[local365] = local377;
							} else if (local43 == 1) {
								local344[local365] = local377;
								local347[local365] = 512 - local372;
							} else if (local43 == 2) {
								local344[local365] = 512 - local372;
								local347[local365] = 512 - local377;
							} else if (local43 == 3) {
								local344[local365] = 512 - local377;
								local347[local365] = local372;
							}
							if (local354 != null && Static138.aBooleanArrayArray4[local34][local365]) {
								local464 = local344[local365] + (local7 << 9);
								local473 = (local11 << 9) + local347[local365];
								local354[local365] = arg4.method8043(local473, local464) - arg2.method8043(local473, local464);
							}
							if (local363 != null) {
								if (arg4 != null && !Static138.aBooleanArrayArray4[local34][local365]) {
									local464 = (local7 << 9) + local344[local365];
									local473 = local347[local365] + (local11 << 9);
									local363[local365] = arg2.method8043(local473, local464) - arg4.method8043(local473, local464);
								} else if (arg3 != null && !Static463.aBooleanArrayArray8[local34][local365]) {
									local464 = (local7 << 9) + local344[local365];
									local473 = (local11 << 9) + local347[local365];
									local363[local365] = arg3.method8043(local473, local464) - arg2.method8043(local473, local464);
								}
							}
						}
						local372 = arg2.method8041(local7, local11);
						local377 = arg2.method8041(local7 + 1, local11);
						local464 = arg2.method8041(local7 + 1, local11 + 1);
						local473 = arg2.method8041(local7, local11 + 1);
						@Pc(617) boolean local617 = Static525.method7485(local11, local7);
						if (local617 && arg0 > 1 || !local617 && arg0 > 0) {
							@Pc(633) boolean local633 = true;
							if (local92 != null && !local92.aBoolean212) {
								local633 = false;
							} else if (local65 == 0 && local34 != 0) {
								local633 = false;
							} else if (local54 > 0 && local103 != null && !local103.aBoolean882) {
								local633 = false;
							}
							if (local633 && local377 == local372 && local372 == local464 && local473 == local372) {
								this.aByteArrayArrayArray13[arg0][local7][local11] = (byte) (this.aByteArrayArrayArray13[arg0][local7][local11] | 0x4);
							}
						}
						@Pc(701) int local701 = 0;
						@Pc(703) int local703 = 0;
						@Pc(705) int local705 = 0;
						if (this.aBoolean787) {
							local701 = Static494.method7245(local7, local11);
							local703 = Static629.method8528(local7, local11);
							local705 = Static610.method8293(local7, local11);
						}
						arg2.method8039(local7, local11, local344, local354, local347, local363, local163, local166, local169, local172, local190, local175, local178, local701, local703, local705);
						Static96.method2488(arg0, local7, local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([[IILclient!s;Lclient!ha;BLclient!s;Lclient!s;)V")
	private void method7709(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class274 arg2, @OriginalArg(3) Class33 arg3, @OriginalArg(5) Class274 arg4, @OriginalArg(6) Class274 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray15[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray18[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray14[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray16[arg1];
		for (@Pc(31) int local31 = 0; local31 < this.anInt9341; local31++) {
			@Pc(49) int local49 = this.anInt9341 - 1 > local31 ? local31 + 1 : local31;
			for (@Pc(51) int local51 = 0; local51 < this.anInt9338; local51++) {
				@Pc(69) int local69 = this.anInt9338 - 1 > local51 ? local51 + 1 : local51;
				if (Static403.anInt4294 == -1 || Static394.method6311(local31, Static403.anInt4294, arg1, local51)) {
					@Pc(85) boolean local85 = false;
					@Pc(87) boolean local87 = false;
					@Pc(90) boolean[] local90 = new boolean[4];
					@Pc(96) int local96 = local10[local31][local51];
					@Pc(102) int local102 = local15[local31][local51];
					@Pc(110) int local110 = local25[local31][local51] & 0xFF;
					@Pc(118) int local118 = local20[local31][local51] & 0xFF;
					@Pc(126) int local126 = local20[local31][local69] & 0xFF;
					@Pc(134) int local134 = local20[local49][local69] & 0xFF;
					@Pc(142) int local142 = local20[local49][local51] & 0xFF;
					if (local110 != 0 || local118 != 0) {
						@Pc(167) Class374 local167 = local110 == 0 ? null : this.aClass258_5.method6555(local110 - 1);
						@Pc(182) Class69 local182 = local118 == 0 ? null : this.aClass310_5.method7464(local118 - 1);
						if (local96 == 0 && local167 == null) {
							local96 = 12;
						}
						@Pc(193) Class374 local193 = local167;
						if (local167 != null) {
							if (local167.anInt10477 == -1 && local167.anInt10472 == -1) {
								local193 = local167;
								local167 = null;
							} else if (local182 != null && local96 != 0) {
								local87 = local167.aBoolean883;
							}
						}
						@Pc(299) int local299;
						@Pc(333) int local333;
						@Pc(391) int local391;
						@Pc(401) int local401;
						if ((local96 == 0 || local96 == 12) && local31 > 0 && local51 > 0 && local31 < this.anInt9341 && local51 < this.anInt9338) {
							@Pc(263) int local263 = local118 == local20[local49][local69] ? 1 : -1;
							@Pc(278) int local278 = local20[local49][local51 - 1] == local118 ? 1 : -1;
							local299 = local20[local31 - 1][local51 - 1] == local118 ? 1 : -1;
							if (local118 == local20[local31][local51 - 1]) {
								local299++;
								local278++;
							} else {
								local299--;
								local278--;
							}
							local333 = local20[local31 - 1][local69] == local118 ? 1 : -1;
							if (local20[local49][local51] == local118) {
								local263++;
								local278++;
							} else {
								local278--;
								local263--;
							}
							if (local20[local31][local69] == local118) {
								local263++;
								local333++;
							} else {
								local263--;
								local333--;
							}
							if (local20[local31 - 1][local51] == local118) {
								local333++;
								local299++;
							} else {
								local299--;
								local333--;
							}
							local391 = local299 - local263;
							if (local391 < 0) {
								local391 = -local391;
							}
							local401 = local278 - local333;
							if (local401 < 0) {
								local401 = -local401;
							}
							if (local401 == local391) {
								local391 = arg4.method8041(local31, local51) - arg4.method8041(local49, local69);
								if (local391 < 0) {
									local391 = -local391;
								}
								local401 = arg4.method8041(local49, local51) - arg4.method8041(local31, local69);
								if (local401 < 0) {
									local401 = -local401;
								}
							}
							local102 = local401 <= local391 ? 0 : 1;
						}
						for (local299 = 0; local299 < 13; local299++) {
							Static427.anIntArray486[local299] = -1;
							Static13.anIntArray11[local299] = 1;
						}
						@Pc(493) boolean[] local493 = local167 != null && local167.aBoolean883 ? Static465.aBooleanArrayArray9[local96] : Static545.aBooleanArrayArray10[local96];
						this.method7714(local102, local182, local25, this.anInt9338, local15, local51, arg3, local167, local90, local10, this.anInt9341, local96, local31);
						@Pc(526) boolean local526 = local167 != null && local167.anInt10477 != local167.anInt10472;
						if (!local526) {
							for (local333 = 0; local333 < 8; local333++) {
								if (Static427.anIntArray486[local333] >= 0 && Static195.anIntArray449[local333] != Static420.anIntArray484[local333]) {
									local526 = true;
									break;
								}
							}
						}
						if (!local493[local102 + 1 & 0x3]) {
							local90[1] = Static83.method5853(local90[1], (Static13.anIntArray11[2] & Static13.anIntArray11[4]) == 0);
						}
						if (!local493[local102 + 3 & 0x3]) {
							local90[3] = Static83.method5853(local90[3], (Static13.anIntArray11[6] & Static13.anIntArray11[0]) == 0);
						}
						if (!local493[local102 & 0x3]) {
							local90[0] = Static83.method5853(local90[0], (Static13.anIntArray11[2] & Static13.anIntArray11[0]) == 0);
						}
						if (!local493[local102 + 2 & 0x3]) {
							local90[2] = Static83.method5853(local90[2], (Static13.anIntArray11[6] & Static13.anIntArray11[4]) == 0);
						}
						if (!local87 && (local96 == 0 || local96 == 12)) {
							if (local90[0] && !local90[1] && !local90[2] && local90[3]) {
								local90[0] = local90[3] = false;
								local96 = local96 == 0 ? 13 : 14;
								local102 = 0;
							} else if (local90[0] && local90[1] && !local90[2] && !local90[3]) {
								local90[0] = local90[1] = false;
								local96 = local96 == 0 ? 13 : 14;
								local102 = 3;
							} else if (!local90[0] && local90[1] && local90[2] && !local90[3]) {
								local90[1] = local90[2] = false;
								local96 = local96 == 0 ? 13 : 14;
								local102 = 2;
							} else if (!local90[0] && !local90[1] && local90[2] && local90[3]) {
								local90[2] = local90[3] = false;
								local102 = 1;
								local96 = local96 == 0 ? 13 : 14;
							}
						}
						@Pc(828) boolean local828 = !local87 && !local90[0] && !local90[2] && !local90[1] && !local90[3];
						@Pc(830) int[] local830 = null;
						@Pc(848) int[] local848;
						@Pc(836) int[] local836;
						@Pc(852) int[] local852;
						if (local828) {
							local836 = Static364.anIntArrayArray64[local96];
							local401 = local167 == null ? 0 : Static641.anIntArray627[local96];
							local848 = Static96.anIntArrayArray22[local96];
							local852 = Static14.anIntArrayArray104[local96];
							local391 = local182 == null ? 0 : Static613.anIntArray617[local96];
						} else if (local87) {
							local852 = Static19.anIntArrayArray2[local96];
							local401 = local167 == null ? 0 : Static54.anIntArray250[local96];
							local391 = local182 == null ? 0 : Static638.anIntArray625[local96];
							local830 = Static217.anIntArrayArray18[local96];
							local848 = Static145.anIntArrayArray101[local96];
							local836 = Static87.anIntArrayArray20[local96];
						} else {
							local401 = local167 == null ? 0 : Static621.anIntArray619[local96];
							local836 = Static570.anIntArrayArray97[local96];
							local852 = Static152.anIntArrayArray32[local96];
							local848 = Static340.anIntArrayArray61[local96];
							local830 = Static518.anIntArrayArray100[local96];
							local391 = local182 == null ? 0 : Static287.anIntArray347[local96];
						}
						@Pc(933) int local933 = local391 + local401;
						if (local933 <= 0) {
							Static96.method2488(arg1, local31, local51);
						} else {
							if (local90[0]) {
								local933++;
							}
							if (local90[2]) {
								local933++;
							}
							if (local90[1]) {
								local933++;
							}
							if (local90[3]) {
								local933++;
							}
							@Pc(963) int local963 = 0;
							@Pc(965) int local965 = 0;
							@Pc(969) int local969 = local933 * 3;
							@Pc(976) int[] local976 = local526 ? new int[local969] : null;
							@Pc(979) int[] local979 = new int[local969];
							@Pc(982) int[] local982 = new int[local969];
							@Pc(985) int[] local985 = new int[local969];
							@Pc(988) int[] local988 = new int[local969];
							@Pc(991) int[] local991 = new int[local969];
							@Pc(998) int[] local998 = arg2 == null ? null : new int[local969];
							@Pc(1007) int[] local1007 = arg2 == null && arg5 == null ? null : new int[local969];
							@Pc(1009) int local1009 = -1;
							@Pc(1011) int local1011 = -1;
							@Pc(1013) int local1013 = 256;
							@Pc(1103) byte local1103;
							@Pc(1057) int local1057;
							@Pc(1059) int local1059;
							@Pc(1292) int local1292;
							@Pc(1298) int local1298;
							@Pc(1307) int local1307;
							@Pc(1312) int local1312;
							@Pc(1334) int local1334;
							@Pc(1317) int local1317;
							@Pc(1336) int local1336;
							@Pc(1385) int local1385;
							@Pc(1391) int local1391;
							if (local167 != null) {
								local1009 = local167.anInt10477;
								local1011 = local167.anInt10478;
								local1013 = local167.anInt10468;
								local1057 = Static116.method2772(arg3, local167);
								for (local1059 = 0; local1059 < local401; local1059++) {
									if (local90[-local102 & 0x3] && local963 == local830[0]) {
										Static587.anIntArray594[0] = local848[local963];
										Static587.anIntArray594[1] = 1;
										Static587.anIntArray594[2] = local852[local963];
										Static587.anIntArray594[3] = 1;
										Static587.anIntArray594[4] = local836[local963];
										local1103 = 6;
										Static587.anIntArray594[5] = local852[local963];
									} else if (local90[2 - local102 & 0x3] && local830[2] == local963) {
										Static587.anIntArray594[0] = local848[local963];
										Static587.anIntArray594[1] = 5;
										Static587.anIntArray594[2] = local852[local963];
										Static587.anIntArray594[3] = 5;
										Static587.anIntArray594[4] = local836[local963];
										local1103 = 6;
										Static587.anIntArray594[5] = local852[local963];
									} else if (local90[1 - local102 & 0x3] && local963 == local830[1]) {
										Static587.anIntArray594[0] = local848[local963];
										Static587.anIntArray594[1] = 3;
										Static587.anIntArray594[2] = local852[local963];
										Static587.anIntArray594[3] = 3;
										Static587.anIntArray594[4] = local836[local963];
										Static587.anIntArray594[5] = local852[local963];
										local1103 = 6;
									} else if (local90[3 - local102 & 0x3] && local963 == local830[3]) {
										Static587.anIntArray594[0] = local848[local963];
										Static587.anIntArray594[1] = 7;
										Static587.anIntArray594[2] = local852[local963];
										Static587.anIntArray594[3] = 7;
										Static587.anIntArray594[4] = local836[local963];
										local1103 = 6;
										Static587.anIntArray594[5] = local852[local963];
									} else {
										Static587.anIntArray594[0] = local848[local963];
										Static587.anIntArray594[1] = local836[local963];
										local1103 = 3;
										Static587.anIntArray594[2] = local852[local963];
									}
									local963++;
									for (local1292 = 0; local1292 < local1103; local1292++) {
										local1298 = Static587.anIntArray594[local1292];
										local1307 = local1298 - local102 * 2 & 0x7;
										local1312 = this.anIntArray580[local1298];
										local1317 = this.anIntArray579[local1298];
										if (local102 == 1) {
											local1336 = 512 - local1312;
											local1334 = local1317;
										} else if (local102 == 2) {
											local1334 = 512 - local1312;
											local1336 = 512 - local1317;
										} else if (local102 == 3) {
											local1334 = 512 - local1317;
											local1336 = local1312;
										} else {
											local1336 = local1317;
											local1334 = local1312;
										}
										local979[local965] = local1334;
										local982[local965] = local1336;
										if (local998 != null && Static138.aBooleanArrayArray4[local96][local1298]) {
											local1385 = (local31 << 9) + local1334;
											local1391 = local1336 + (local51 << 9);
											local998[local965] = arg2.method8043(local1391, local1385) - arg4.method8043(local1391, local1385);
										}
										if (local1007 != null) {
											if (arg2 != null && !Static138.aBooleanArrayArray4[local96][local1298]) {
												local1385 = (local31 << 9) + local1334;
												local1391 = (local51 << 9) + local1336;
												local1007[local965] = arg4.method8043(local1391, local1385) - arg2.method8043(local1391, local1385);
											} else if (arg5 != null && !Static463.aBooleanArrayArray8[local96][local1298]) {
												local1385 = local1334 + (local31 << 9);
												local1391 = local1336 + (local51 << 9);
												local1007[local965] = arg5.method8043(local1391, local1385) - arg4.method8043(local1391, local1385);
											}
										}
										if (local1298 < 8 && Static427.anIntArray486[local1307] > local167.anInt10469) {
											if (local976 != null) {
												local976[local965] = Static420.anIntArray484[local1307];
											}
											local991[local965] = Static221.anIntArray289[local1307];
											local988[local965] = Static16.anIntArray12[local1307];
											local985[local965] = Static195.anIntArray449[local1307];
										} else {
											if (local976 != null) {
												local976[local965] = local1057;
											}
											local988[local965] = local167.anInt10478;
											local991[local965] = local167.anInt10468;
											local985[local965] = local1009;
										}
										local965++;
									}
								}
								if (!this.aBoolean787 && arg1 == 0) {
									Static138.method3127(local31, local51, local167.anInt10467, local167.anInt10470 * 8, local167.anInt10471);
								}
								if (local96 != 12 && local167.anInt10477 != -1 && local167.aBoolean884) {
									local85 = true;
								}
							} else if (local828) {
								local963 = Static641.anIntArray627[local96];
							} else if (local87) {
								local963 = Static54.anIntArray250[local96];
							} else {
								local963 = Static621.anIntArray619[local96];
							}
							if (local182 != null) {
								if (local126 == 0) {
									local126 = local118;
								}
								if (local134 == 0) {
									local134 = local118;
								}
								if (local142 == 0) {
									local142 = local118;
								}
								@Pc(1599) Class69 local1599 = this.aClass310_5.method7464(local118 - 1);
								@Pc(1607) Class69 local1607 = this.aClass310_5.method7464(local126 - 1);
								@Pc(1615) Class69 local1615 = this.aClass310_5.method7464(local134 - 1);
								@Pc(1623) Class69 local1623 = this.aClass310_5.method7464(local142 - 1);
								for (local1307 = 0; local1307 < local391; local1307++) {
									if (local90[-local102 & 0x3] && local830[0] == local963) {
										Static587.anIntArray594[0] = local848[local963];
										Static587.anIntArray594[1] = 1;
										Static587.anIntArray594[2] = local852[local963];
										Static587.anIntArray594[3] = 1;
										Static587.anIntArray594[4] = local836[local963];
										Static587.anIntArray594[5] = local852[local963];
										local1103 = 6;
									} else if (local90[2 - local102 & 0x3] && local963 == local830[2]) {
										Static587.anIntArray594[0] = local848[local963];
										Static587.anIntArray594[1] = 5;
										Static587.anIntArray594[2] = local852[local963];
										Static587.anIntArray594[3] = 5;
										Static587.anIntArray594[4] = local836[local963];
										local1103 = 6;
										Static587.anIntArray594[5] = local852[local963];
									} else if (local90[1 - local102 & 0x3] && local830[1] == local963) {
										Static587.anIntArray594[0] = local848[local963];
										Static587.anIntArray594[1] = 3;
										Static587.anIntArray594[2] = local852[local963];
										Static587.anIntArray594[3] = 3;
										Static587.anIntArray594[4] = local836[local963];
										local1103 = 6;
										Static587.anIntArray594[5] = local852[local963];
									} else if (local90[3 - local102 & 0x3] && local830[3] == local963) {
										Static587.anIntArray594[0] = local848[local963];
										Static587.anIntArray594[1] = 7;
										Static587.anIntArray594[2] = local852[local963];
										Static587.anIntArray594[3] = 7;
										Static587.anIntArray594[4] = local836[local963];
										local1103 = 6;
										Static587.anIntArray594[5] = local852[local963];
									} else {
										Static587.anIntArray594[0] = local848[local963];
										Static587.anIntArray594[1] = local836[local963];
										local1103 = 3;
										Static587.anIntArray594[2] = local852[local963];
									}
									for (local1312 = 0; local1312 < local1103; local1312++) {
										local1334 = Static587.anIntArray594[local1312];
										local1317 = local1334 - local102 * 2 & 0x7;
										local1336 = this.anIntArray580[local1334];
										local1391 = this.anIntArray579[local1334];
										@Pc(1890) int local1890;
										if (local102 == 1) {
											local1890 = 512 - local1336;
											local1385 = local1391;
										} else if (local102 == 2) {
											local1890 = 512 - local1391;
											local1385 = 512 - local1336;
										} else if (local102 == 3) {
											local1890 = local1336;
											local1385 = 512 - local1391;
										} else {
											local1385 = local1336;
											local1890 = local1391;
										}
										local979[local965] = local1385;
										local982[local965] = local1890;
										@Pc(1949) int local1949;
										@Pc(1956) int local1956;
										if (local998 != null && Static138.aBooleanArrayArray4[local96][local1334]) {
											local1949 = local1385 + (local31 << 9);
											local1956 = (local51 << 9) + local1890;
											local998[local965] = arg2.method8043(local1956, local1949) - arg4.method8043(local1956, local1949);
										}
										if (local1007 != null) {
											if (arg2 != null && !Static138.aBooleanArrayArray4[local96][local1334]) {
												local1949 = local1385 + (local31 << 9);
												local1956 = (local51 << 9) + local1890;
												local1007[local965] = arg4.method8043(local1956, local1949) - arg2.method8043(local1956, local1949);
											} else if (arg5 != null && !Static463.aBooleanArrayArray8[local96][local1334]) {
												local1949 = (local31 << 9) + local1385;
												local1956 = local1890 + (local51 << 9);
												local1007[local965] = arg5.method8043(local1956, local1949) - arg4.method8043(local1956, local1949);
											}
										}
										if (local1334 < 8 && Static427.anIntArray486[local1317] >= 0) {
											if (local976 != null) {
												local976[local965] = Static420.anIntArray484[local1317];
											}
											local991[local965] = Static221.anIntArray289[local1317];
											local988[local965] = Static16.anIntArray12[local1317];
											local985[local965] = Static195.anIntArray449[local1317];
										} else {
											if (local87 && Static138.aBooleanArrayArray4[local96][local1334]) {
												local988[local965] = local1011;
												local991[local965] = local1013;
												local985[local965] = local1009;
											} else if (local1385 == 0 && local1890 == 0) {
												local985[local965] = arg0[local31][local51];
												local988[local965] = local1599.anInt2630;
												local991[local965] = local1599.anInt2632;
											} else if (local1385 == 0 && local1890 == 512) {
												local985[local965] = arg0[local31][local69];
												local988[local965] = local1607.anInt2630;
												local991[local965] = local1607.anInt2632;
											} else if (local1385 == 512 && local1890 == 512) {
												local985[local965] = arg0[local49][local69];
												local988[local965] = local1615.anInt2630;
												local991[local965] = local1615.anInt2632;
											} else if (local1385 == 512 && local1890 == 0) {
												local985[local965] = arg0[local49][local51];
												local988[local965] = local1623.anInt2630;
												local991[local965] = local1623.anInt2632;
											} else {
												if (local1385 >= 256) {
													if (local1890 < 256) {
														local988[local965] = local1623.anInt2630;
														local991[local965] = local1623.anInt2632;
													} else {
														local988[local965] = local1615.anInt2630;
														local991[local965] = local1615.anInt2632;
													}
												} else if (local1890 < 256) {
													local988[local965] = local1599.anInt2630;
													local991[local965] = local1599.anInt2632;
												} else {
													local988[local965] = local1607.anInt2630;
													local991[local965] = local1607.anInt2632;
												}
												local1949 = Static164.method7298(arg0[local31][local51], arg0[local49][local51], local1385 << 7 >> 9);
												local1956 = Static164.method7298(arg0[local31][local69], arg0[local49][local69], local1385 << 7 >> 9);
												local985[local965] = Static164.method7298(local1949, local1956, local1890 << 7 >> 9);
											}
											if (local976 != null) {
												local976[local965] = local985[local965];
											}
										}
										local965++;
									}
									local963++;
								}
								if (local96 != 0 && local182.aBoolean213) {
									local85 = true;
								}
							}
							local1057 = arg4.method8041(local31, local51);
							local1059 = arg4.method8041(local49, local51);
							local1292 = arg4.method8041(local49, local69);
							local1298 = arg4.method8041(local31, local69);
							@Pc(2370) boolean local2370 = Static525.method7485(local51, local31);
							if (local2370 && arg1 > 1 || !local2370 && arg1 > 0) {
								@Pc(2383) boolean local2383 = true;
								if (local182 != null && !local182.aBoolean212) {
									local2383 = false;
								} else if (local118 == 0 && local96 != 0) {
									local2383 = false;
								} else if (local110 > 0 && local193 != null && !local193.aBoolean882) {
									local2383 = false;
								}
								if (local2383 && local1057 == local1059 && local1057 == local1292 && local1057 == local1298) {
									this.aByteArrayArrayArray13[arg1][local31][local51] = (byte) (this.aByteArrayArrayArray13[arg1][local31][local51] | 0x4);
								}
							}
							local1312 = 0;
							local1334 = 0;
							local1317 = 0;
							if (this.aBoolean787) {
								local1312 = Static494.method7245(local31, local51);
								local1334 = Static629.method8528(local31, local51);
								local1317 = Static610.method8293(local31, local51);
							}
							arg4.U(local31, local51, local979, local998, local982, local1007, local985, local976, local988, local991, local1312, local1334, local1317, local85);
							Static96.method2488(arg1, local31, local51);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[[II)V")
	public final void method7710(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray12[0];
		for (@Pc(17) int local17 = 0; local17 < this.anInt9341 + 1; local17++) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt9338 + 1; local21++) {
				local10[local17][local21] += arg0[local17][local21];
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([[[ILclient!ha;B[Lclient!rl;)V")
	public final void method7711(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) Class291[] arg2) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		if (!this.aBoolean787) {
			for (local16 = 0; local16 < 4; local16++) {
				for (local20 = 0; local20 < this.anInt9341; local20++) {
					for (local24 = 0; local24 < this.anInt9338; local24++) {
						if ((Static244.aByteArrayArrayArray10[local16][local20][local24] & 0x1) != 0) {
							@Pc(38) int local38 = local16;
							if ((Static244.aByteArrayArrayArray10[1][local20][local24] & 0x2) != 0) {
								local38 = local16 - 1;
							}
							if (local38 >= 0) {
								arg2[local38].method7206(local24, local20);
							}
						}
					}
				}
			}
		}
		for (local16 = 0; local16 < this.anInt9342; local16++) {
			local20 = 0;
			local24 = 0;
			if (!this.aBoolean787) {
				if (Static385.aBoolean888) {
					local20 = 2;
				}
				if (Static236.aBoolean471) {
					local24 = 8;
				}
				if (Static54.anInt4726 != 0) {
					local20 |= 0x1;
					if (local16 == 0 | Static23.aBoolean32) {
						local24 |= 0x10;
					}
				}
			}
			if (Static385.aBoolean888) {
				local24 |= 0x7;
			}
			if (!Static379.aBoolean626) {
				local24 |= 0x20;
			}
			@Pc(159) int[][] local159 = arg0 == null || arg0.length <= local16 ? this.anIntArrayArrayArray12[local16] : arg0[local16];
			Static30.method571(local16, arg1.method6206(this.anInt9341, this.anInt9338, this.anIntArrayArrayArray12[local16], local159, local20, local24));
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!ha;Lclient!s;Lclient!s;I)V")
	public final void method7712(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class274 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt9341][this.anInt9338];
		if (Static568.anIntArray588 == null || Static568.anIntArray588.length != this.anInt9338) {
			Static568.anIntArray588 = new int[this.anInt9338];
			Static148.anIntArray193 = new int[this.anInt9338];
			Static224.anIntArray291 = new int[this.anInt9338];
			Static365.anIntArray409 = new int[this.anInt9338];
			Static393.anIntArray157 = new int[this.anInt9338];
		}
		@Pc(73) int local73;
		for (@Pc(40) int local40 = 0; local40 < this.anInt9342; local40++) {
			for (@Pc(44) int local44 = 0; local44 < this.anInt9338; local44++) {
				Static568.anIntArray588[local44] = 0;
				Static224.anIntArray291[local44] = 0;
				Static393.anIntArray157[local44] = 0;
				Static365.anIntArray409[local44] = 0;
				Static148.anIntArray193[local44] = 0;
			}
			for (local73 = -5; local73 < this.anInt9341; local73++) {
				@Pc(83) int local83;
				@Pc(98) int local98;
				@Pc(170) int local170;
				for (@Pc(77) int local77 = 0; local77 < this.anInt9338; local77++) {
					local83 = local73 + 5;
					@Pc(147) int local147;
					if (local83 < this.anInt9341) {
						local98 = this.aByteArrayArrayArray14[local40][local83][local77] & 0xFF;
						if (local98 > 0) {
							@Pc(111) Class69 local111 = this.aClass310_5.method7464(local98 - 1);
							Static568.anIntArray588[local77] += local111.anInt2624;
							Static224.anIntArray291[local77] += local111.anInt2629;
							Static393.anIntArray157[local77] += local111.anInt2621;
							Static365.anIntArray409[local77] += local111.anInt2620;
							local147 = Static148.anIntArray193[local77]++;
						}
					}
					local98 = local73 - 5;
					if (local98 >= 0) {
						local170 = this.aByteArrayArrayArray14[local40][local98][local77] & 0xFF;
						if (local170 > 0) {
							@Pc(183) Class69 local183 = this.aClass310_5.method7464(local170 - 1);
							Static568.anIntArray588[local77] -= local183.anInt2624;
							Static224.anIntArray291[local77] -= local183.anInt2629;
							Static393.anIntArray157[local77] -= local183.anInt2621;
							Static365.anIntArray409[local77] -= local183.anInt2620;
							local147 = Static148.anIntArray193[local77]--;
						}
					}
				}
				if (local73 >= 0) {
					local83 = 0;
					local98 = 0;
					local170 = 0;
					@Pc(244) int local244 = 0;
					@Pc(246) int local246 = 0;
					for (@Pc(248) int local248 = -5; local248 < this.anInt9338; local248++) {
						@Pc(254) int local254 = local248 + 5;
						if (this.anInt9338 > local254) {
							local244 += Static365.anIntArray409[local254];
							local83 += Static568.anIntArray588[local254];
							local98 += Static224.anIntArray291[local254];
							local246 += Static148.anIntArray193[local254];
							local170 += Static393.anIntArray157[local254];
						}
						@Pc(292) int local292 = local248 - 5;
						if (local292 >= 0) {
							local170 -= Static393.anIntArray157[local292];
							local246 -= Static148.anIntArray193[local292];
							local244 -= Static365.anIntArray409[local292];
							local98 -= Static224.anIntArray291[local292];
							local83 -= Static568.anIntArray588[local292];
						}
						if (local248 >= 0 && local244 > 0 && local246 > 0) {
							local11[local73][local248] = Static370.method5910(local83 * 256 / local244, local170 / local246, local98 / local246);
						}
					}
				}
			}
			if (Static242.aBoolean482) {
				this.method7709(local11, local40, local40 == 0 ? arg2 : null, arg0, Static500.aClass274Array2[local40], local40 == 0 ? arg1 : null);
			} else {
				this.method7707(local40, arg0, Static500.aClass274Array2[local40], local40 == 0 ? arg1 : null, local40 == 0 ? arg2 : null, local11);
			}
			this.aByteArrayArrayArray14[local40] = null;
			this.aByteArrayArrayArray16[local40] = null;
			this.aByteArrayArrayArray15[local40] = null;
			this.aByteArrayArrayArray18[local40] = null;
		}
		if (!this.aBoolean787) {
			if (Static54.anInt4726 != 0) {
				Static594.method8138();
			}
			if (Static385.aBoolean888) {
				Static299.method7321();
			}
		}
		for (local73 = 0; local73 < this.anInt9342; local73++) {
			Static500.aClass274Array2[local73].YA();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "([Lclient!rl;IIIILclient!tn;Z)V")
	public final void method7713(@OriginalArg(0) Class291[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub15 arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean787) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class291 local16 = arg0[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg4;
						@Pc(32) int local32 = local22 + arg1;
						if (local28 >= 0 && local28 < this.anInt9341 && local32 >= 0 && local32 < this.anInt9338) {
							local16.method7205(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg4 + arg3;
		@Pc(78) int local78 = arg1 + arg2;
		for (local18 = 0; local18 < this.anInt9342; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method7703(local18, 0, local78 + local28, false, 0, arg5, local22 + arg4, arg1 + local28, local22 + local10, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!ds;[[BI[[BILclient!ha;Lclient!wm;[ZI[[BIII)V")
	private void method7714(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class33 arg6, @OriginalArg(7) Class374 arg7, @OriginalArg(8) boolean[] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg7 != null && arg7.aBoolean883 ? Static465.aBooleanArrayArray9[arg11] : Static545.aBooleanArrayArray10[arg11];
		@Pc(34) int local34;
		@Pc(47) Class374 local47;
		@Pc(65) byte local65;
		@Pc(82) int local82;
		@Pc(87) int local87;
		if (arg5 > 0) {
			if (arg12 > 0) {
				local34 = arg2[arg12 - 1][arg5 - 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass258_5.method6555(local34 - 1);
					if (local47.anInt10477 != -1 && local47.aBoolean883) {
						local65 = arg9[arg12 - 1][arg5 - 1];
						local82 = arg4[arg12 - 1][arg5 - 1] * 2 + 4 & 0x7;
						local87 = Static116.method2772(arg6, local47);
						if (Static138.aBooleanArrayArray4[local65][local82]) {
							Static195.anIntArray449[0] = local47.anInt10477;
							Static420.anIntArray484[0] = local87;
							Static16.anIntArray12[0] = local47.anInt10478;
							Static221.anIntArray289[0] = local47.anInt10468;
							Static427.anIntArray486[0] = local47.anInt10469;
							Static13.anIntArray11[0] = 256;
						}
					}
				}
			}
			if (arg10 - 1 > arg12) {
				local34 = arg2[arg12 + 1][arg5 - 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass258_5.method6555(local34 - 1);
					if (local47.anInt10477 != -1 && local47.aBoolean883) {
						local65 = arg9[arg12 + 1][arg5 - 1];
						local82 = arg4[arg12 + 1][arg5 - 1] * 2 + 6 & 0x7;
						local87 = Static116.method2772(arg6, local47);
						if (Static138.aBooleanArrayArray4[local65][local82]) {
							Static195.anIntArray449[2] = local47.anInt10477;
							Static420.anIntArray484[2] = local87;
							Static16.anIntArray12[2] = local47.anInt10478;
							Static221.anIntArray289[2] = local47.anInt10468;
							Static427.anIntArray486[2] = local47.anInt10469;
							Static13.anIntArray11[2] = 512;
						}
					}
				}
			}
		}
		if (arg5 < arg3 - 1) {
			if (arg12 > 0) {
				local34 = arg2[arg12 - 1][arg5 + 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass258_5.method6555(local34 - 1);
					if (local47.anInt10477 != -1 && local47.aBoolean883) {
						local65 = arg9[arg12 - 1][arg5 + 1];
						local82 = arg4[arg12 - 1][arg5 + 1] * 2 + 2 & 0x7;
						local87 = Static116.method2772(arg6, local47);
						if (Static138.aBooleanArrayArray4[local65][local82]) {
							Static195.anIntArray449[6] = local47.anInt10477;
							Static420.anIntArray484[6] = local87;
							Static16.anIntArray12[6] = local47.anInt10478;
							Static221.anIntArray289[6] = local47.anInt10468;
							Static427.anIntArray486[6] = local47.anInt10469;
							Static13.anIntArray11[6] = 64;
						}
					}
				}
			}
			if (arg10 - 1 > arg12) {
				local34 = arg2[arg12 + 1][arg5 + 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass258_5.method6555(local34 - 1);
					if (local47.anInt10477 != -1 && local47.aBoolean883) {
						local65 = arg9[arg12 + 1][arg5 + 1];
						local82 = arg4[arg12 + 1][arg5 + 1] * 2 & 0x7;
						local87 = Static116.method2772(arg6, local47);
						if (Static138.aBooleanArrayArray4[local65][local82]) {
							Static195.anIntArray449[4] = local47.anInt10477;
							Static420.anIntArray484[4] = local87;
							Static16.anIntArray12[4] = local47.anInt10478;
							Static221.anIntArray289[4] = local47.anInt10468;
							Static427.anIntArray486[4] = local47.anInt10469;
							Static13.anIntArray11[4] = 128;
						}
					}
				}
			}
		}
		@Pc(501) int local501;
		@Pc(506) int local506;
		@Pc(508) int local508;
		@Pc(489) byte local489;
		if (arg5 > 0) {
			local34 = arg2[arg12][arg5 - 1] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass258_5.method6555(local34 - 1);
				if (local47.anInt10477 != -1) {
					local65 = arg9[arg12][arg5 - 1];
					local489 = arg4[arg12][arg5 - 1];
					if (local47.aBoolean883) {
						local87 = 2;
						local501 = local489 * 2 + 4;
						local506 = Static116.method2772(arg6, local47);
						for (local508 = 0; local508 < 3; local508++) {
							local501 &= 0x7;
							local87 &= 0x7;
							if (Static138.aBooleanArrayArray4[local65][local501] && Static427.anIntArray486[local87] <= local47.anInt10469) {
								Static195.anIntArray449[local87] = local47.anInt10477;
								Static420.anIntArray484[local87] = local506;
								Static16.anIntArray12[local87] = local47.anInt10478;
								Static221.anIntArray289[local87] = local47.anInt10468;
								if (Static427.anIntArray486[local87] == local47.anInt10469) {
									Static13.anIntArray11[local87] |= 0x20;
								} else {
									Static13.anIntArray11[local87] = 32;
								}
								Static427.anIntArray486[local87] = local47.anInt10469;
							}
							local501++;
							local87--;
						}
						if (!local18[arg0 & 0x3]) {
							arg8[0] = Static465.aBooleanArrayArray9[local65][local489 + 2 & 0x3];
						}
					} else if (!local18[arg0 & 0x3]) {
						arg8[0] = Static545.aBooleanArrayArray10[local65][local489 + 2 & 0x3];
					}
				}
			}
		}
		if (arg3 - 1 > arg5) {
			local34 = arg2[arg12][arg5 + 1] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass258_5.method6555(local34 - 1);
				if (local47.anInt10477 != -1) {
					local65 = arg9[arg12][arg5 + 1];
					local489 = arg4[arg12][arg5 + 1];
					if (local47.aBoolean883) {
						local87 = 4;
						local501 = local489 * 2 + 2;
						local506 = Static116.method2772(arg6, local47);
						for (local508 = 0; local508 < 3; local508++) {
							local87 &= 0x7;
							local501 &= 0x7;
							if (Static138.aBooleanArrayArray4[local65][local501] && local47.anInt10469 >= Static427.anIntArray486[local87]) {
								Static195.anIntArray449[local87] = local47.anInt10477;
								Static420.anIntArray484[local87] = local506;
								Static16.anIntArray12[local87] = local47.anInt10478;
								Static221.anIntArray289[local87] = local47.anInt10468;
								if (Static427.anIntArray486[local87] == local47.anInt10469) {
									Static13.anIntArray11[local87] |= 0x10;
								} else {
									Static13.anIntArray11[local87] = 16;
								}
								Static427.anIntArray486[local87] = local47.anInt10469;
							}
							local501--;
							local87++;
						}
						if (!local18[arg0 + 2 & 0x3]) {
							arg8[2] = Static465.aBooleanArrayArray9[local65][local489 & 0x3];
						}
					} else if (!local18[arg0 + 2 & 0x3]) {
						arg8[2] = Static545.aBooleanArrayArray10[local65][local489 & 0x3];
					}
				}
			}
		}
		if (arg12 > 0) {
			local34 = arg2[arg12 - 1][arg5] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass258_5.method6555(local34 - 1);
				if (local47.anInt10477 != -1) {
					local65 = arg9[arg12 - 1][arg5];
					local489 = arg4[arg12 - 1][arg5];
					if (local47.aBoolean883) {
						local87 = 6;
						local501 = local489 * 2 + 4;
						local506 = Static116.method2772(arg6, local47);
						for (local508 = 0; local508 < 3; local508++) {
							local501 &= 0x7;
							local87 &= 0x7;
							if (Static138.aBooleanArrayArray4[local65][local501] && Static427.anIntArray486[local87] <= local47.anInt10469) {
								Static195.anIntArray449[local87] = local47.anInt10477;
								Static420.anIntArray484[local87] = local506;
								Static16.anIntArray12[local87] = local47.anInt10478;
								Static221.anIntArray289[local87] = local47.anInt10468;
								if (Static427.anIntArray486[local87] == local47.anInt10469) {
									Static13.anIntArray11[local87] |= 0x8;
								} else {
									Static13.anIntArray11[local87] = 8;
								}
								Static427.anIntArray486[local87] = local47.anInt10469;
							}
							local87++;
							local501--;
						}
						if (!local18[arg0 + 3 & 0x3]) {
							arg8[3] = Static465.aBooleanArrayArray9[local65][local489 + 1 & 0x3];
						}
					} else if (!local18[arg0 + 3 & 0x3]) {
						arg8[3] = Static545.aBooleanArrayArray10[local65][local489 + 1 & 0x3];
					}
				}
			}
		}
		if (arg10 - 1 > arg12) {
			local34 = arg2[arg12 + 1][arg5] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass258_5.method6555(local34 - 1);
				if (local47.anInt10477 != -1) {
					local65 = arg9[arg12 + 1][arg5];
					local489 = arg4[arg12 + 1][arg5];
					if (local47.aBoolean883) {
						local87 = 4;
						local501 = local489 * 2 + 6;
						local506 = Static116.method2772(arg6, local47);
						for (local508 = 0; local508 < 3; local508++) {
							local87 &= 0x7;
							local501 &= 0x7;
							if (Static138.aBooleanArrayArray4[local65][local501] && local47.anInt10469 >= Static427.anIntArray486[local87]) {
								Static195.anIntArray449[local87] = local47.anInt10477;
								Static420.anIntArray484[local87] = local506;
								Static16.anIntArray12[local87] = local47.anInt10478;
								Static221.anIntArray289[local87] = local47.anInt10468;
								if (local47.anInt10469 == Static427.anIntArray486[local87]) {
									Static13.anIntArray11[local87] |= 0x4;
								} else {
									Static13.anIntArray11[local87] = 4;
								}
								Static427.anIntArray486[local87] = local47.anInt10469;
							}
							local87--;
							local501++;
						}
						if (!local18[arg0 + 1 & 0x3]) {
							arg8[1] = Static465.aBooleanArrayArray9[local65][local489 + 3 & 0x3];
						}
					} else if (!local18[arg0 + 1 & 0x3]) {
						arg8[1] = Static545.aBooleanArrayArray10[local65][local489 + 3 & 0x3];
					}
				}
			}
		}
		if (arg7 == null) {
			return;
		}
		local34 = Static116.method2772(arg6, arg7);
		if (!arg7.aBoolean883) {
			return;
		}
		for (@Pc(1189) int local1189 = 0; local1189 < 8; local1189++) {
			@Pc(1200) int local1200 = local1189 - arg0 * 2 & 0x7;
			if (Static138.aBooleanArrayArray4[arg11][local1189] && Static427.anIntArray486[local1200] <= arg7.anInt10469) {
				Static195.anIntArray449[local1200] = arg7.anInt10477;
				Static420.anIntArray484[local1200] = local34;
				Static16.anIntArray12[local1200] = arg7.anInt10478;
				Static221.anIntArray289[local1200] = arg7.anInt10468;
				if (Static427.anIntArray486[local1200] == arg7.anInt10469) {
					Static13.anIntArray11[local1200] |= 0x2;
				} else {
					Static13.anIntArray11[local1200] = 2;
				}
				Static427.anIntArray486[local1200] = arg7.anInt10469;
			}
		}
		return;
	}
}
