import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public class Class45 {

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "[I")
	private final int[] anIntArray733 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!bv", name = "C", descriptor = "[I")
	private final int[] anIntArray734 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!bv", name = "h", descriptor = "Lclient!dl;")
	private final Class77 aClass77_6;

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "Z")
	public final boolean aBoolean755;

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
	protected final int anInt10197;

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
	protected final int anInt10198;

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "Lclient!ah;")
	private final Class14 aClass14_5;

	@OriginalMember(owner = "client!bv", name = "y", descriptor = "I")
	public final int anInt10205;

	@OriginalMember(owner = "client!bv", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!bv", name = "A", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray22;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIZLclient!dl;Lclient!ah;)V")
	protected Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class77 arg4, @OriginalArg(5) Class14 arg5) {
		this.aClass77_6 = arg4;
		this.aBoolean755 = arg3;
		this.anInt10197 = arg1;
		this.anInt10198 = arg2;
		this.aClass14_5 = arg5;
		this.anInt10205 = arg0;
		this.aByteArrayArrayArray17 = new byte[this.anInt10205][this.anInt10197][this.anInt10198];
		this.aByteArrayArrayArray13 = new byte[this.anInt10205][this.anInt10197 + 1][this.anInt10198 + 1];
		this.aByteArrayArrayArray18 = new byte[this.anInt10205][this.anInt10197][this.anInt10198];
		this.aByteArrayArrayArray15 = new byte[this.anInt10205][this.anInt10197][this.anInt10198];
		this.aByteArrayArrayArray16 = new byte[this.anInt10205][this.anInt10197][this.anInt10198];
		this.anIntArrayArrayArray22 = new int[this.anInt10205][this.anInt10197 + 1][this.anInt10198 + 1];
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([Lclient!jn;Lclient!ud;ZIIII)V")
	public final void method8515(@OriginalArg(0) Class179[] arg0, @OriginalArg(1) Class2_Sub34 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean755) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class179 local16 = arg0[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = arg5 + local18;
						@Pc(32) int local32 = local22 + arg2;
						if (local28 >= 0 && local28 < this.anInt10197 && local32 >= 0 && this.anInt10198 > local32) {
							local16.method4344(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg3 + arg5;
		@Pc(89) int local89 = arg2 + arg4;
		for (local18 = 0; local18 < this.anInt10205; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method8522(0, arg1, 0, false, local28 + arg2, local18, local28 + local89, 0, arg5 + local22, local10 + local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(BIIIII)V")
	public final void method8516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(23) int local23;
		for (@Pc(19) int local19 = arg0; local19 < arg3 + arg0; local19++) {
			for (local23 = arg2; local23 < arg4 + arg2; local23++) {
				if (local23 >= 0 && local23 < this.anInt10197 && local19 >= 0 && this.anInt10198 > local19) {
					this.anIntArrayArrayArray22[arg1][local23][local19] = arg1 > 0 ? this.anIntArrayArrayArray22[arg1 - 1][local23][local19] - 960 : 0;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt10197) {
			for (local23 = arg0 + 1; local23 < arg3 + arg0; local23++) {
				if (local23 >= 0 && this.anInt10198 > local23) {
					this.anIntArrayArrayArray22[arg1][arg2][local23] = this.anIntArrayArrayArray22[arg1][arg2 - 1][local23];
				}
			}
		}
		if (arg0 > 0 && this.anInt10198 > arg0) {
			for (local23 = arg2 + 1; local23 < arg4 + arg2; local23++) {
				if (local23 >= 0 && local23 < this.anInt10197) {
					this.anIntArrayArrayArray22[arg1][local23][arg0] = this.anIntArrayArrayArray22[arg1][local23][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || this.anInt10197 <= arg2 || this.anInt10198 <= arg0) {
			return;
		}
		if (arg1 != 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray22[arg1 - 1][arg2 - 1][arg0] != this.anIntArrayArrayArray22[arg1][arg2 - 1][arg0]) {
				this.anIntArrayArrayArray22[arg1][arg2][arg0] = this.anIntArrayArrayArray22[arg1][arg2 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray22[arg1 - 1][arg2][arg0 - 1] != this.anIntArrayArrayArray22[arg1][arg2][arg0 - 1]) {
				this.anIntArrayArrayArray22[arg1][arg2][arg0] = this.anIntArrayArrayArray22[arg1][arg2][arg0 - 1];
				return;
			}
			if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray22[arg1 - 1][arg2 - 1][arg0 - 1] != this.anIntArrayArrayArray22[arg1][arg2 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray22[arg1][arg2][arg0] = this.anIntArrayArrayArray22[arg1][arg2 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray22[arg1][arg2 - 1][arg0] != 0) {
			this.anIntArrayArrayArray22[arg1][arg2][arg0] = this.anIntArrayArrayArray22[arg1][arg2 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray22[arg1][arg2][arg0 - 1] != 0) {
			this.anIntArrayArrayArray22[arg1][arg2][arg0] = this.anIntArrayArrayArray22[arg1][arg2][arg0 - 1];
			return;
		}
		if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray22[arg1][arg2 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray22[arg1][arg2][arg0] = this.anIntArrayArrayArray22[arg1][arg2 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIBI)V")
	public final void method8517(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10205; local7++) {
			this.method8516(arg1, local7, arg0, 64, 64);
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([[[I[Lclient!jn;Lclient!ha;I)V")
	public final void method8518(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class179[] arg1, @OriginalArg(2) Class87 arg2) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(35) int local35;
		if (!this.aBoolean755) {
			for (local10 = 0; local10 < 4; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt10197; local14++) {
					for (local18 = 0; local18 < this.anInt10198; local18++) {
						if ((Static244.aByteArrayArrayArray9[local10][local14][local18] & 0x1) != 0) {
							local35 = local10;
							if ((Static244.aByteArrayArrayArray9[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg1[local35].method4350(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt10205; local10++) {
			local18 = 0;
			local35 = 0;
			if (!this.aBoolean755) {
				if (Static347.aBoolean477) {
					local35 = 8;
				}
				if (Static223.aBoolean386) {
					local18 = 2;
				}
				if (Static324.anInt5883 != 0) {
					local18 |= 0x1;
					if (local10 == 0 | Static66.aBoolean115) {
						local35 |= 0x10;
					}
				}
			}
			if (Static223.aBoolean386) {
				local35 |= 0x7;
			}
			if (!Static216.aBoolean377) {
				local35 |= 0x20;
			}
			@Pc(159) int[][] local159 = arg0 == null || arg0.length <= local10 ? this.anIntArrayArrayArray22[local10] : arg0[local10];
			Static517.method7260(local10, arg2.method7957(this.anInt10197, this.anInt10198, this.anIntArrayArrayArray22[local10], local159, local18, local35));
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(B[[II)V")
	public final void method8520(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray22[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt10197 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt10198 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IILclient!ud;IZIIIIII)V")
	private void method8522(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub34 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg7 == 1) {
			arg0 = 1;
		} else if (arg7 == 2) {
			arg2 = 1;
			arg0 = 1;
		} else if (arg7 == 3) {
			arg2 = 1;
		}
		@Pc(66) int local66;
		if (arg8 < 0 || arg8 >= this.anInt10197 || arg4 < 0 || this.anInt10198 <= arg4) {
			while (true) {
				local66 = arg1.method6904();
				if (local66 == 0) {
					return;
				}
				if (local66 == 1) {
					arg1.method6904();
					return;
				}
				if (local66 <= 49) {
					arg1.method6904();
				}
			}
			return;
		}
		if (!this.aBoolean755 && !arg3) {
			Static244.aByteArrayArrayArray9[arg5][arg8][arg4] = 0;
		}
		while (true) {
			local66 = arg1.method6904();
			if (local66 == 0) {
				if (this.aBoolean755) {
					this.anIntArrayArrayArray22[0][arg2 + arg8][arg4 + arg0] = 0;
					return;
				} else if (arg5 == 0) {
					this.anIntArrayArrayArray22[0][arg8 + arg2][arg4 + arg0] = -Static462.method6719(arg9 + 932731, arg6 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray22[arg5][arg2 + arg8][arg0 + arg4] = this.anIntArrayArrayArray22[arg5 - 1][arg8 + arg2][arg0 + arg4] - 960;
					return;
				}
			}
			if (local66 == 1) {
				@Pc(159) int local159 = arg1.method6904();
				if (this.aBoolean755) {
					this.anIntArrayArrayArray22[0][arg2 + arg8][arg4 + arg0] = local159 * 8 << 2;
					return;
				}
				if (local159 == 1) {
					local159 = 0;
				}
				if (arg5 != 0) {
					this.anIntArrayArrayArray22[arg5][arg8 + arg2][arg0 + arg4] = this.anIntArrayArrayArray22[arg5 - 1][arg8 + arg2][arg4 + arg0] - (local159 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray22[0][arg2 + arg8][arg0 + arg4] = -local159 * 8 << 2;
				return;
			}
			if (local66 <= 49) {
				if (arg3) {
					arg1.method6904();
				} else {
					this.aByteArrayArrayArray17[arg5][arg8][arg4] = arg1.method6908();
					this.aByteArrayArrayArray15[arg5][arg8][arg4] = (byte) ((local66 - 2) / 4);
					this.aByteArrayArrayArray16[arg5][arg8][arg4] = (byte) (local66 + arg7 - 2 & 0x3);
				}
			} else if (local66 <= 81) {
				if (!this.aBoolean755 && !arg3) {
					Static244.aByteArrayArrayArray9[arg5][arg8][arg4] = (byte) (local66 - 49);
				}
			} else if (!arg3) {
				this.aByteArrayArrayArray18[arg5][arg8][arg4] = (byte) (local66 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(II[Z[[BILclient!wl;[[BIIILclient!ul;[[BLclient!ha;I)V")
	private void method8523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class373 arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class342 arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class87 arg11, @OriginalArg(13) int arg12) {
		@Pc(30) boolean[] local30 = arg9 != null && arg9.aBoolean690 ? Static99.aBooleanArrayArray5[arg0] : Static489.aBooleanArrayArray7[arg0];
		@Pc(52) int local52;
		@Pc(65) Class342 local65;
		@Pc(83) byte local83;
		@Pc(99) int local99;
		@Pc(104) int local104;
		if (arg8 > 0) {
			if (arg12 > 0) {
				local52 = arg6[arg12 - 1][arg8 - 1] & 0xFF;
				if (local52 > 0) {
					local65 = this.aClass77_6.method1683(local52 - 1);
					if (local65.anInt9511 != -1 && local65.aBoolean690) {
						local83 = arg10[arg12 - 1][arg8 - 1];
						local99 = arg3[arg12 - 1][arg8 - 1] * 2 + 4 & 0x7;
						local104 = Static258.method8463(local65, arg11);
						if (Static14.aBooleanArrayArray1[local83][local99]) {
							Static390.anIntArray469[0] = local65.anInt9511;
							Static200.anIntArray288[0] = local104;
							Static136.anIntArray223[0] = local65.anInt9515;
							Static524.anIntArray602[0] = local65.anInt9516;
							Static378.anIntArray451[0] = local65.anInt9518;
							Static92.anIntArray166[0] = 256;
						}
					}
				}
			}
			if (arg1 - 1 > arg12) {
				local52 = arg6[arg12 + 1][arg8 - 1] & 0xFF;
				if (local52 > 0) {
					local65 = this.aClass77_6.method1683(local52 - 1);
					if (local65.anInt9511 != -1 && local65.aBoolean690) {
						local83 = arg10[arg12 + 1][arg8 - 1];
						local99 = arg3[arg12 + 1][arg8 - 1] * 2 + 6 & 0x7;
						local104 = Static258.method8463(local65, arg11);
						if (Static14.aBooleanArrayArray1[local83][local99]) {
							Static390.anIntArray469[2] = local65.anInt9511;
							Static200.anIntArray288[2] = local104;
							Static136.anIntArray223[2] = local65.anInt9515;
							Static524.anIntArray602[2] = local65.anInt9516;
							Static378.anIntArray451[2] = local65.anInt9518;
							Static92.anIntArray166[2] = 512;
						}
					}
				}
			}
		}
		if (arg4 - 1 > arg8) {
			if (arg12 > 0) {
				local52 = arg6[arg12 - 1][arg8 + 1] & 0xFF;
				if (local52 > 0) {
					local65 = this.aClass77_6.method1683(local52 - 1);
					if (local65.anInt9511 != -1 && local65.aBoolean690) {
						local83 = arg10[arg12 - 1][arg8 + 1];
						local99 = arg3[arg12 - 1][arg8 + 1] * 2 + 2 & 0x7;
						local104 = Static258.method8463(local65, arg11);
						if (Static14.aBooleanArrayArray1[local83][local99]) {
							Static390.anIntArray469[6] = local65.anInt9511;
							Static200.anIntArray288[6] = local104;
							Static136.anIntArray223[6] = local65.anInt9515;
							Static524.anIntArray602[6] = local65.anInt9516;
							Static378.anIntArray451[6] = local65.anInt9518;
							Static92.anIntArray166[6] = 64;
						}
					}
				}
			}
			if (arg1 - 1 > arg12) {
				local52 = arg6[arg12 + 1][arg8 + 1] & 0xFF;
				if (local52 > 0) {
					local65 = this.aClass77_6.method1683(local52 - 1);
					if (local65.anInt9511 != -1 && local65.aBoolean690) {
						local83 = arg10[arg12 + 1][arg8 + 1];
						local99 = --(arg3[arg12 + 1][arg8 + 1] * 2) & 0x7;
						local104 = Static258.method8463(local65, arg11);
						if (Static14.aBooleanArrayArray1[local83][local99]) {
							Static390.anIntArray469[4] = local65.anInt9511;
							Static200.anIntArray288[4] = local104;
							Static136.anIntArray223[4] = local65.anInt9515;
							Static524.anIntArray602[4] = local65.anInt9516;
							Static378.anIntArray451[4] = local65.anInt9518;
							Static92.anIntArray166[4] = 128;
						}
					}
				}
			}
		}
		@Pc(510) int local510;
		@Pc(515) int local515;
		@Pc(517) int local517;
		@Pc(498) byte local498;
		if (arg8 > 0) {
			local52 = arg6[arg12][arg8 - 1] & 0xFF;
			if (local52 > 0) {
				local65 = this.aClass77_6.method1683(local52 - 1);
				if (local65.anInt9511 != -1) {
					local83 = arg10[arg12][arg8 - 1];
					local498 = arg3[arg12][arg8 - 1];
					if (local65.aBoolean690) {
						local104 = 2;
						local510 = local498 * 2 + 4;
						local515 = Static258.method8463(local65, arg11);
						for (local517 = 0; local517 < 3; local517++) {
							local104 &= 0x7;
							local510 &= 0x7;
							if (Static14.aBooleanArrayArray1[local83][local510] && Static378.anIntArray451[local104] <= local65.anInt9518) {
								Static390.anIntArray469[local104] = local65.anInt9511;
								Static200.anIntArray288[local104] = local515;
								Static136.anIntArray223[local104] = local65.anInt9515;
								Static524.anIntArray602[local104] = local65.anInt9516;
								if (local65.anInt9518 == Static378.anIntArray451[local104]) {
									Static92.anIntArray166[local104] |= 0x20;
								} else {
									Static92.anIntArray166[local104] = 32;
								}
								Static378.anIntArray451[local104] = local65.anInt9518;
							}
							local104--;
							local510++;
						}
						if (!local30[arg7 & 0x3]) {
							arg2[0] = Static99.aBooleanArrayArray5[local83][local498 + 2 & 0x3];
						}
					} else if (!local30[arg7 & 0x3]) {
						arg2[0] = Static489.aBooleanArrayArray7[local83][local498 + 2 & 0x3];
					}
				}
			}
		}
		if (arg4 - 1 > arg8) {
			local52 = arg6[arg12][arg8 + 1] & 0xFF;
			if (local52 > 0) {
				local65 = this.aClass77_6.method1683(local52 - 1);
				if (local65.anInt9511 != -1) {
					local83 = arg10[arg12][arg8 + 1];
					local498 = arg3[arg12][arg8 + 1];
					if (local65.aBoolean690) {
						local104 = 4;
						local510 = local498 * 2 + 2;
						local515 = Static258.method8463(local65, arg11);
						for (local517 = 0; local517 < 3; local517++) {
							local510 &= 0x7;
							local104 &= 0x7;
							if (Static14.aBooleanArrayArray1[local83][local510] && Static378.anIntArray451[local104] <= local65.anInt9518) {
								Static390.anIntArray469[local104] = local65.anInt9511;
								Static200.anIntArray288[local104] = local515;
								Static136.anIntArray223[local104] = local65.anInt9515;
								Static524.anIntArray602[local104] = local65.anInt9516;
								if (Static378.anIntArray451[local104] == local65.anInt9518) {
									Static92.anIntArray166[local104] |= 0x10;
								} else {
									Static92.anIntArray166[local104] = 16;
								}
								Static378.anIntArray451[local104] = local65.anInt9518;
							}
							local104++;
							local510--;
						}
						if (!local30[arg7 + 2 & 0x3]) {
							arg2[2] = Static99.aBooleanArrayArray5[local83][local498 & 0x3];
						}
					} else if (!local30[arg7 + 2 & 0x3]) {
						arg2[2] = Static489.aBooleanArrayArray7[local83][local498 & 0x3];
					}
				}
			}
		}
		if (arg12 > 0) {
			local52 = arg6[arg12 - 1][arg8] & 0xFF;
			if (local52 > 0) {
				local65 = this.aClass77_6.method1683(local52 - 1);
				if (local65.anInt9511 != -1) {
					local83 = arg10[arg12 - 1][arg8];
					local498 = arg3[arg12 - 1][arg8];
					if (local65.aBoolean690) {
						local104 = 6;
						local510 = local498 * 2 + 4;
						local515 = Static258.method8463(local65, arg11);
						for (local517 = 0; local517 < 3; local517++) {
							local104 &= 0x7;
							local510 &= 0x7;
							if (Static14.aBooleanArrayArray1[local83][local510] && local65.anInt9518 >= Static378.anIntArray451[local104]) {
								Static390.anIntArray469[local104] = local65.anInt9511;
								Static200.anIntArray288[local104] = local515;
								Static136.anIntArray223[local104] = local65.anInt9515;
								Static524.anIntArray602[local104] = local65.anInt9516;
								if (Static378.anIntArray451[local104] == local65.anInt9518) {
									Static92.anIntArray166[local104] |= 0x8;
								} else {
									Static92.anIntArray166[local104] = 8;
								}
								Static378.anIntArray451[local104] = local65.anInt9518;
							}
							local510--;
							local104++;
						}
						if (!local30[arg7 + 3 & 0x3]) {
							arg2[3] = Static99.aBooleanArrayArray5[local83][local498 + 1 & 0x3];
						}
					} else if (!local30[arg7 + 3 & 0x3]) {
						arg2[3] = Static489.aBooleanArrayArray7[local83][local498 + 1 & 0x3];
					}
				}
			}
		}
		if (arg12 < arg1 - 1) {
			local52 = arg6[arg12 + 1][arg8] & 0xFF;
			if (local52 > 0) {
				local65 = this.aClass77_6.method1683(local52 - 1);
				if (local65.anInt9511 != -1) {
					local83 = arg10[arg12 + 1][arg8];
					local498 = arg3[arg12 + 1][arg8];
					if (local65.aBoolean690) {
						local104 = 4;
						local510 = local498 * 2 + 6;
						local515 = Static258.method8463(local65, arg11);
						for (local517 = 0; local517 < 3; local517++) {
							local510 &= 0x7;
							local104 &= 0x7;
							if (Static14.aBooleanArrayArray1[local83][local510] && Static378.anIntArray451[local104] <= local65.anInt9518) {
								Static390.anIntArray469[local104] = local65.anInt9511;
								Static200.anIntArray288[local104] = local515;
								Static136.anIntArray223[local104] = local65.anInt9515;
								Static524.anIntArray602[local104] = local65.anInt9516;
								if (local65.anInt9518 == Static378.anIntArray451[local104]) {
									Static92.anIntArray166[local104] |= 0x4;
								} else {
									Static92.anIntArray166[local104] = 4;
								}
								Static378.anIntArray451[local104] = local65.anInt9518;
							}
							local104--;
							local510++;
						}
						if (!local30[arg7 + 1 & 0x3]) {
							arg2[1] = Static99.aBooleanArrayArray5[local83][local498 + 3 & 0x3];
						}
					} else if (!local30[arg7 + 1 & 0x3]) {
						arg2[1] = Static489.aBooleanArrayArray7[local83][local498 + 3 & 0x3];
					}
				}
			}
		}
		if (arg9 == null) {
			return;
		}
		local52 = Static258.method8463(arg9, arg11);
		if (!arg9.aBoolean690) {
			return;
		}
		for (@Pc(1189) int local1189 = 0; local1189 < 8; local1189++) {
			@Pc(1200) int local1200 = local1189 - arg7 * 2 & 0x7;
			if (Static14.aBooleanArrayArray1[arg0][local1189] && Static378.anIntArray451[local1200] <= arg9.anInt9518) {
				Static390.anIntArray469[local1200] = arg9.anInt9511;
				Static200.anIntArray288[local1200] = local52;
				Static136.anIntArray223[local1200] = arg9.anInt9515;
				Static524.anIntArray602[local1200] = arg9.anInt9516;
				if (Static378.anIntArray451[local1200] == arg9.anInt9518) {
					Static92.anIntArray166[local1200] |= 0x2;
				} else {
					Static92.anIntArray166[local1200] = 2;
				}
				Static378.anIntArray451[local1200] = arg9.anInt9518;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!ha;[[IIILclient!s;Lclient!s;Lclient!s;)V")
	private void method8524(@OriginalArg(0) Class87 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class112 arg3, @OriginalArg(5) Class112 arg4, @OriginalArg(6) Class112 arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10197; local7++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt10198; local13++) {
				if (Static446.anInt7903 == -1 || Static403.method6234(local7, arg2, local13, Static446.anInt7903)) {
					@Pc(37) byte local37 = this.aByteArrayArrayArray15[arg2][local7][local13];
					@Pc(46) byte local46 = this.aByteArrayArrayArray16[arg2][local7][local13];
					@Pc(57) int local57 = this.aByteArrayArrayArray17[arg2][local7][local13] & 0xFF;
					@Pc(68) int local68 = this.aByteArrayArrayArray18[arg2][local7][local13] & 0xFF;
					@Pc(85) Class342 local85 = local57 == 0 ? null : this.aClass77_6.method1683(local57 - 1);
					@Pc(100) Class373 local100 = local68 == 0 ? null : this.aClass14_5.method293(local68 - 1);
					if (local37 == 0 && local85 == null) {
						local37 = 12;
					}
					@Pc(108) int local108 = 0;
					@Pc(110) int local110 = 0;
					if (local37 != 0) {
						local108 = local100 == null ? 0 : Static554.anIntArray755[local37];
						local110 = local85 == null ? 0 : Static29.anIntArray99[local37];
					} else if (local85 != null) {
						local110 = Static29.anIntArray99[local37];
					} else if (local100 != null) {
						local108 = Static29.anIntArray99[local37];
					}
					@Pc(148) int local148 = local108 + local110;
					@Pc(150) int local150 = 0;
					if (local148 != 0) {
						@Pc(162) int local162 = local85 == null ? -1 : local85.anInt9515;
						@Pc(169) int local169 = local100 == null ? -1 : local100.anInt10155;
						@Pc(172) int[] local172 = new int[local148];
						@Pc(175) int[] local175 = new int[local148];
						@Pc(178) int[] local178 = new int[local148];
						@Pc(181) int[] local181 = new int[local148];
						@Pc(183) boolean local183 = false;
						@Pc(185) boolean local185 = false;
						@Pc(204) int local204;
						if (local85 == null || local85.anInt9511 == -1 && local85.anInt9520 == -1 && local162 == -1) {
							local185 = true;
							for (local204 = 0; local204 < local110; local204++) {
								local172[local150] = -1;
								local150++;
							}
						} else {
							for (local204 = 0; local204 < local110; local204++) {
								local178[local150] = local162;
								local181[local150] = local85.anInt9516;
								if (local85.anInt9511 == -1) {
									local172[local150] = -1;
								} else {
									local172[local150] = local85.anInt9511;
								}
								if (local85.anInt9520 == -1) {
									local175[local150] = -1;
								} else {
									local175[local150] = local85.anInt9520;
									local183 = true;
								}
								local150++;
							}
							if (!this.aBoolean755 && arg2 == 0) {
								Static125.method2518(local7, local13, local85.anInt9514, local85.anInt9512 * 8, local85.anInt9521);
							}
						}
						if (!local183) {
							local175 = null;
						}
						if (local100 == null) {
							if (local185) {
								continue;
							}
							for (local204 = 0; local204 < local108; local204++) {
								local172[local150] = -1;
								local150++;
							}
						} else {
							for (local204 = 0; local204 < local108; local204++) {
								local178[local150] = local169;
								local181[local150] = local100.anInt10162;
								local172[local150] = arg1[local7][local13];
								if (local175 != null) {
									local175[local150] = -1;
								}
								local150++;
							}
						}
						local204 = this.anIntArray733.length;
						@Pc(345) int[] local345 = new int[local204];
						@Pc(348) int[] local348 = new int[local204];
						@Pc(355) int[] local355 = arg5 == null ? null : new int[local204];
						@Pc(364) int[] local364 = arg5 == null && arg4 == null ? null : new int[local204];
						@Pc(373) int local373;
						@Pc(378) int local378;
						@Pc(460) int local460;
						@Pc(469) int local469;
						for (@Pc(366) int local366 = 0; local366 < local204; local366++) {
							local373 = this.anIntArray733[local366];
							local378 = this.anIntArray734[local366];
							if (local46 == 0) {
								local345[local366] = local373;
								local348[local366] = local378;
							} else if (local46 == 1) {
								local345[local366] = local378;
								local348[local366] = 512 - local373;
							} else if (local46 == 2) {
								local345[local366] = 512 - local373;
								local348[local366] = 512 - local378;
							} else if (local46 == 3) {
								local345[local366] = 512 - local378;
								local348[local366] = local373;
							}
							if (local355 != null && Static14.aBooleanArrayArray1[local37][local366]) {
								local460 = (local7 << 9) + local345[local366];
								local469 = (local13 << 9) + local348[local366];
								local355[local366] = arg5.method7826(local460, local469) - arg3.method7826(local460, local469);
							}
							if (local364 != null) {
								if (arg5 != null && !Static14.aBooleanArrayArray1[local37][local366]) {
									local460 = local345[local366] + (local7 << 9);
									local469 = local348[local366] + (local13 << 9);
									local364[local366] = arg3.method7826(local460, local469) - arg5.method7826(local460, local469);
								} else if (arg4 != null && !Static47.aBooleanArrayArray4[local37][local366]) {
									local460 = local345[local366] + (local7 << 9);
									local469 = (local13 << 9) + local348[local366];
									local364[local366] = arg4.method7826(local460, local469) - arg3.method7826(local460, local469);
								}
							}
						}
						local373 = arg3.method7819(local13, local7);
						local378 = arg3.method7819(local13, local7 + 1);
						local460 = arg3.method7819(local13 + 1, local7 + 1);
						local469 = arg3.method7819(local13 + 1, local7);
						@Pc(616) boolean local616 = Static471.method6782(local13, local7);
						if (local616 && arg2 > 1 || !local616 && arg2 > 0) {
							@Pc(632) boolean local632 = true;
							if (local100 != null && !local100.aBoolean752) {
								local632 = false;
							} else if (local68 == 0 && local37 != 0) {
								local632 = false;
							} else if (local57 > 0 && local85 != null && !local85.aBoolean691) {
								local632 = false;
							}
							if (local632 && local373 == local378 && local460 == local373 && local469 == local373) {
								this.aByteArrayArrayArray13[arg2][local7][local13] = (byte) (this.aByteArrayArrayArray13[arg2][local7][local13] | 0x4);
							}
						}
						@Pc(707) int local707 = 0;
						@Pc(709) int local709 = 0;
						@Pc(711) int local711 = 0;
						if (this.aBoolean755) {
							local707 = Static165.method3055(local7, local13);
							local709 = Static501.method7135(local7, local13);
							local711 = Static230.method7150(local7, local13);
						}
						arg3.method7822(local7, local13, local345, local355, local348, local364, Static314.anIntArrayArray52[local37], Static336.anIntArrayArray54[local37], Static106.anIntArrayArray97[local37], local172, local175, local178, local181, local707, local709, local711);
						Static526.method7336(arg2, local7, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "([Lclient!jn;IBIIIILclient!ud;II)V")
	public final void method8525(@OriginalArg(0) Class179[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub34 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg3 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(58) int local58;
		if (!this.aBoolean755) {
			@Pc(24) Class179 local24 = arg0[arg8];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(45) int local45 = arg5 + Static450.method4872(arg2, local26 & 0x7, local30 & 0x7);
					local58 = arg4 + Static371.method5588(local26 & 0x7, local30 & 0x7, arg2);
					if (local45 > 0 && this.anInt10197 - 1 > local45 && local58 > 0 && this.anInt10198 - 1 > local58) {
						local24.method4344(local45, local58);
					}
				}
			}
		}
		@Pc(104) int local104 = (arg3 & 0x1FFFFFF8) << 3;
		local26 = (arg7 & 0x1FFFFFF8) << 3;
		@Pc(117) byte local117 = 0;
		@Pc(119) byte local119 = 0;
		if (arg2 == 1) {
			local119 = 1;
		} else if (arg2 == 2) {
			local117 = 1;
			local119 = 1;
		} else if (arg2 == 3) {
			local117 = 1;
		}
		for (local58 = 0; local58 < this.anInt10205; local58++) {
			for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
				for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
					if (local58 == arg1 && local11 <= local148 && local11 + 8 >= local148 && local152 >= local17 && local17 + 8 >= local152) {
						@Pc(233) int local233;
						@Pc(227) int local227;
						if (local148 == local11 + 8 || local152 == local17 + 8) {
							if (arg2 == 0) {
								local227 = arg4 + local152 - local17;
								local233 = arg5 + local148 - local11;
							} else if (arg2 == 1) {
								local227 = arg4 + local11 + 8 - local148;
								local233 = local152 + arg5 - local17;
							} else if (arg2 == 2) {
								local233 = arg5 + local11 + 8 - local148;
								local227 = arg4 + local17 + 8 - local152;
							} else {
								local227 = local148 + arg4 - local11;
								local233 = arg5 + local17 + 8 - local152;
							}
							this.method8522(0, arg6, 0, true, local227, arg8, local152 + local26, 0, local233, local104 + local148);
						} else {
							local233 = Static450.method4872(arg2, local148 & 0x7, local152 & 0x7) + arg5;
							local227 = arg4 + Static371.method5588(local148 & 0x7, local152 & 0x7, arg2);
							this.method8522(local119, arg6, local117, false, local227, arg8, local26 + local152, arg2, local233, local148 + local104);
						}
						if (local148 == 63 || local152 == 63) {
							@Pc(358) byte local358 = 1;
							if (local148 == 63 && local152 == 63) {
								local358 = 3;
							}
							for (@Pc(368) int local368 = 0; local368 < local358; local368++) {
								@Pc(372) int local372 = local148;
								@Pc(374) int local374 = local152;
								if (local368 == 0) {
									local374 = local152 == 63 ? 64 : local152;
									local372 = local148 == 63 ? 64 : local148;
								} else if (local368 == 1) {
									local372 = 64;
								} else if (local368 == 2) {
									local374 = 64;
								}
								@Pc(422) int local422;
								@Pc(429) int local429;
								if (arg2 == 0) {
									local422 = arg5 + local372 - local11;
									local429 = arg4 + local374 - local17;
								} else if (arg2 == 1) {
									local422 = arg5 + local374 - local17;
									local429 = arg4 + local11 + 8 - local372;
								} else if (arg2 == 2) {
									local429 = local17 + arg4 + 8 - local374;
									local422 = local11 + arg5 + 8 - local372;
								} else {
									local429 = local372 + arg4 - local11;
									local422 = arg5 + local17 + 8 - local374;
								}
								if (local422 >= 0 && local422 < this.anInt10197 && local429 >= 0 && this.anInt10198 > local429) {
									this.anIntArrayArrayArray22[arg8][local422][local429] = this.anIntArrayArrayArray22[arg8][local233 + local117][local119 + local227];
								}
							}
						}
					} else {
						this.method8522(0, arg6, 0, false, -1, 0, 0, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!s;ILclient!s;Lclient!s;Lclient!ha;I[[I)V")
	private void method8526(@OriginalArg(0) Class112 arg0, @OriginalArg(2) Class112 arg1, @OriginalArg(3) Class112 arg2, @OriginalArg(4) Class87 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray15[arg4];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray16[arg4];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray18[arg4];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray17[arg4];
		for (@Pc(27) int local27 = 0; local27 < this.anInt10197; local27++) {
			@Pc(41) int local41 = local27 < this.anInt10197 - 1 ? local27 + 1 : local27;
			for (@Pc(43) int local43 = 0; local43 < this.anInt10198; local43++) {
				@Pc(57) int local57 = local43 < this.anInt10198 - 1 ? local43 + 1 : local43;
				if (Static446.anInt7903 == -1 || Static403.method6234(local27, arg4, local43, Static446.anInt7903)) {
					@Pc(72) boolean local72 = false;
					@Pc(74) boolean local74 = false;
					@Pc(77) boolean[] local77 = new boolean[4];
					@Pc(83) int local83 = local10[local27][local43];
					@Pc(89) int local89 = local15[local27][local43];
					@Pc(97) int local97 = local25[local27][local43] & 0xFF;
					@Pc(105) int local105 = local20[local27][local43] & 0xFF;
					@Pc(113) int local113 = local20[local27][local57] & 0xFF;
					@Pc(121) int local121 = local20[local41][local57] & 0xFF;
					@Pc(129) int local129 = local20[local41][local43] & 0xFF;
					if (local97 != 0 || local105 != 0) {
						@Pc(148) Class342 local148 = local97 == 0 ? null : this.aClass77_6.method1683(local97 - 1);
						@Pc(163) Class373 local163 = local105 == 0 ? null : this.aClass14_5.method293(local105 - 1);
						if (local83 == 0 && local148 == null) {
							local83 = 12;
						}
						@Pc(174) Class342 local174 = local148;
						if (local148 != null) {
							if (local148.anInt9511 == -1 && local148.anInt9520 == -1) {
								local174 = local148;
								local148 = null;
							} else if (local163 != null && local83 != 0) {
								local74 = local148.aBoolean690;
							}
						}
						@Pc(268) int local268;
						@Pc(296) int local296;
						@Pc(361) int local361;
						@Pc(373) int local373;
						if ((local83 == 0 || local83 == 12) && local27 > 0 && local43 > 0 && this.anInt10197 > local27 && this.anInt10198 > local43) {
							@Pc(249) int local249 = local20[local41][local43 - 1] == local105 ? 1 : -1;
							local268 = local20[local27 - 1][local43 - 1] == local105 ? 1 : -1;
							@Pc(281) int local281 = local105 == local20[local41][local57] ? 1 : -1;
							local296 = local105 == local20[local27 - 1][local57] ? 1 : -1;
							if (local105 == local20[local27][local43 - 1]) {
								local268++;
								local249++;
							} else {
								local268--;
								local249--;
							}
							if (local20[local41][local43] == local105) {
								local249++;
								local281++;
							} else {
								local281--;
								local249--;
							}
							if (local20[local27][local57] == local105) {
								local281++;
								local296++;
							} else {
								local296--;
								local281--;
							}
							if (local20[local27 - 1][local43] == local105) {
								local268++;
								local296++;
							} else {
								local296--;
								local268--;
							}
							local361 = local268 - local281;
							if (local361 < 0) {
								local361 = -local361;
							}
							local373 = local249 - local296;
							if (local373 < 0) {
								local373 = -local373;
							}
							if (local373 == local361) {
								local361 = arg1.method7819(local43, local27) - arg1.method7819(local57, local41);
								local373 = arg1.method7819(local43, local41) - arg1.method7819(local57, local27);
								if (local361 < 0) {
									local361 = -local361;
								}
								if (local373 < 0) {
									local373 = -local373;
								}
							}
							local89 = local361 >= local373 ? 0 : 1;
						}
						for (local268 = 0; local268 < 13; local268++) {
							Static378.anIntArray451[local268] = -1;
							Static92.anIntArray166[local268] = 1;
						}
						@Pc(455) boolean[] local455 = local148 != null && local148.aBoolean690 ? Static99.aBooleanArrayArray5[local83] : Static489.aBooleanArrayArray7[local83];
						this.method8523(local83, this.anInt10197, local77, local15, this.anInt10198, local163, local25, local89, local43, local148, local10, arg3, local27);
						@Pc(488) boolean local488 = local148 != null && local148.anInt9511 != local148.anInt9520;
						if (!local488) {
							for (local296 = 0; local296 < 8; local296++) {
								if (Static378.anIntArray451[local296] >= 0 && Static200.anIntArray288[local296] != Static390.anIntArray469[local296]) {
									local488 = true;
									break;
								}
							}
						}
						if (!local455[local89 + 1 & 0x3]) {
							local77[1] = Static625.method8455(local77[1], (Static92.anIntArray166[2] & Static92.anIntArray166[4]) == 0);
						}
						if (!local455[local89 + 3 & 0x3]) {
							local77[3] = Static625.method8455(local77[3], (Static92.anIntArray166[0] & Static92.anIntArray166[6]) == 0);
						}
						if (!local455[local89 & 0x3]) {
							local77[0] = Static625.method8455(local77[0], (Static92.anIntArray166[0] & Static92.anIntArray166[2]) == 0);
						}
						if (!local455[local89 + 2 & 0x3]) {
							local77[2] = Static625.method8455(local77[2], (Static92.anIntArray166[6] & Static92.anIntArray166[4]) == 0);
						}
						if (!local74 && (local83 == 0 || local83 == 12)) {
							if (local77[0] && !local77[1] && !local77[2] && local77[3]) {
								local89 = 0;
								local83 = local83 == 0 ? 13 : 14;
								local77[0] = local77[3] = false;
							} else if (local77[0] && local77[1] && !local77[2] && !local77[3]) {
								local77[0] = local77[1] = false;
								local89 = 3;
								local83 = local83 == 0 ? 13 : 14;
							} else if (!local77[0] && local77[1] && local77[2] && !local77[3]) {
								local89 = 2;
								local83 = local83 == 0 ? 13 : 14;
								local77[1] = local77[2] = false;
							} else if (!local77[0] && !local77[1] && local77[2] && local77[3]) {
								local89 = 1;
								local77[2] = local77[3] = false;
								local83 = local83 == 0 ? 13 : 14;
							}
						}
						@Pc(803) boolean local803 = !local74 && !local77[0] && !local77[2] && !local77[1] && !local77[3];
						@Pc(805) int[] local805 = null;
						@Pc(817) int[] local817;
						@Pc(813) int[] local813;
						@Pc(833) int[] local833;
						if (local803) {
							local833 = Static106.anIntArrayArray97[local83];
							local373 = local148 == null ? 0 : Static29.anIntArray99[local83];
							local361 = local163 == null ? 0 : Static554.anIntArray755[local83];
							local817 = Static314.anIntArrayArray52[local83];
							local813 = Static336.anIntArrayArray54[local83];
						} else if (local74) {
							local361 = local163 == null ? 0 : Static627.anIntArray726[local83];
							local833 = Static276.anIntArrayArray46[local83];
							local813 = Static406.anIntArrayArray102[local83];
							local817 = Static593.anIntArrayArray94[local83];
							local373 = local148 == null ? 0 : Static134.anIntArray221[local83];
							local805 = Static635.anIntArrayArray104[local83];
						} else {
							local813 = Static594.anIntArrayArray95[local83];
							local817 = Static42.anIntArrayArray10[local83];
							local361 = local163 == null ? 0 : Static96.anIntArray170[local83];
							local805 = Static338.anIntArrayArray55[local83];
							local833 = Static254.anIntArrayArray41[local83];
							local373 = local148 == null ? 0 : Static489.anIntArray568[local83];
						}
						@Pc(907) int local907 = local361 + local373;
						if (local907 <= 0) {
							Static526.method7336(arg4, local27, local43);
						} else {
							if (local77[0]) {
								local907++;
							}
							if (local77[2]) {
								local907++;
							}
							if (local77[1]) {
								local907++;
							}
							if (local77[3]) {
								local907++;
							}
							@Pc(937) int local937 = 0;
							@Pc(939) int local939 = 0;
							@Pc(943) int local943 = local907 * 3;
							@Pc(950) int[] local950 = local488 ? new int[local943] : null;
							@Pc(953) int[] local953 = new int[local943];
							@Pc(956) int[] local956 = new int[local943];
							@Pc(959) int[] local959 = new int[local943];
							@Pc(962) int[] local962 = new int[local943];
							@Pc(965) int[] local965 = new int[local943];
							@Pc(972) int[] local972 = arg2 == null ? null : new int[local943];
							@Pc(981) int[] local981 = arg2 == null && arg0 == null ? null : new int[local943];
							@Pc(983) int local983 = -1;
							@Pc(985) int local985 = -1;
							@Pc(987) int local987 = 256;
							@Pc(1095) byte local1095;
							@Pc(1031) int local1031;
							@Pc(1033) int local1033;
							@Pc(1265) int local1265;
							@Pc(1271) int local1271;
							@Pc(1280) int local1280;
							@Pc(1285) int local1285;
							@Pc(1295) int local1295;
							@Pc(1290) int local1290;
							@Pc(1299) int local1299;
							@Pc(1356) int local1356;
							@Pc(1362) int local1362;
							if (local148 != null) {
								local985 = local148.anInt9515;
								local987 = local148.anInt9516;
								local983 = local148.anInt9511;
								local1031 = Static258.method8463(local148, arg3);
								for (local1033 = 0; local1033 < local373; local1033++) {
									if (local77[-local89 & 0x3] && local805[0] == local937) {
										Static419.anIntArray513[0] = local817[local937];
										Static419.anIntArray513[1] = 1;
										Static419.anIntArray513[2] = local833[local937];
										Static419.anIntArray513[3] = 1;
										Static419.anIntArray513[4] = local813[local937];
										Static419.anIntArray513[5] = local833[local937];
										local1095 = 6;
									} else if (local77[2 - local89 & 0x3] && local937 == local805[2]) {
										Static419.anIntArray513[0] = local817[local937];
										Static419.anIntArray513[1] = 5;
										Static419.anIntArray513[2] = local833[local937];
										Static419.anIntArray513[3] = 5;
										Static419.anIntArray513[4] = local813[local937];
										local1095 = 6;
										Static419.anIntArray513[5] = local833[local937];
									} else if (local77[1 - local89 & 0x3] && local805[1] == local937) {
										Static419.anIntArray513[0] = local817[local937];
										Static419.anIntArray513[1] = 3;
										Static419.anIntArray513[2] = local833[local937];
										Static419.anIntArray513[3] = 3;
										Static419.anIntArray513[4] = local813[local937];
										local1095 = 6;
										Static419.anIntArray513[5] = local833[local937];
									} else if (local77[3 - local89 & 0x3] && local805[3] == local937) {
										Static419.anIntArray513[0] = local817[local937];
										Static419.anIntArray513[1] = 7;
										Static419.anIntArray513[2] = local833[local937];
										Static419.anIntArray513[3] = 7;
										Static419.anIntArray513[4] = local813[local937];
										Static419.anIntArray513[5] = local833[local937];
										local1095 = 6;
									} else {
										Static419.anIntArray513[0] = local817[local937];
										Static419.anIntArray513[1] = local813[local937];
										Static419.anIntArray513[2] = local833[local937];
										local1095 = 3;
									}
									for (local1265 = 0; local1265 < local1095; local1265++) {
										local1271 = Static419.anIntArray513[local1265];
										local1280 = local1271 - local89 * 2 & 0x7;
										local1285 = this.anIntArray733[local1271];
										local1290 = this.anIntArray734[local1271];
										if (local89 == 1) {
											local1295 = local1290;
											local1299 = 512 - local1285;
										} else if (local89 == 2) {
											local1295 = 512 - local1285;
											local1299 = 512 - local1290;
										} else if (local89 == 3) {
											local1299 = local1285;
											local1295 = 512 - local1290;
										} else {
											local1299 = local1290;
											local1295 = local1285;
										}
										local953[local939] = local1295;
										local956[local939] = local1299;
										if (local972 != null && Static14.aBooleanArrayArray1[local83][local1271]) {
											local1356 = local1295 + (local27 << 9);
											local1362 = local1299 + (local43 << 9);
											local972[local939] = arg2.method7826(local1356, local1362) - arg1.method7826(local1356, local1362);
										}
										if (local981 != null) {
											if (arg2 != null && !Static14.aBooleanArrayArray1[local83][local1271]) {
												local1356 = local1295 + (local27 << 9);
												local1362 = local1299 + (local43 << 9);
												local981[local939] = arg1.method7826(local1356, local1362) - arg2.method7826(local1356, local1362);
											} else if (arg0 != null && !Static47.aBooleanArrayArray4[local83][local1271]) {
												local1356 = local1295 + (local27 << 9);
												local1362 = (local43 << 9) + local1299;
												local981[local939] = arg0.method7826(local1356, local1362) - arg1.method7826(local1356, local1362);
											}
										}
										if (local1271 < 8 && Static378.anIntArray451[local1280] > local148.anInt9518) {
											if (local950 != null) {
												local950[local939] = Static200.anIntArray288[local1280];
											}
											local965[local939] = Static524.anIntArray602[local1280];
											local962[local939] = Static136.anIntArray223[local1280];
											local959[local939] = Static390.anIntArray469[local1280];
										} else {
											if (local950 != null) {
												local950[local939] = local1031;
											}
											local962[local939] = local148.anInt9515;
											local965[local939] = local148.anInt9516;
											local959[local939] = local983;
										}
										local939++;
									}
									local937++;
								}
								if (!this.aBoolean755 && arg4 == 0) {
									Static125.method2518(local27, local43, local148.anInt9514, local148.anInt9512 * 8, local148.anInt9521);
								}
								if (local83 != 12 && local148.anInt9511 != -1 && local148.aBoolean689) {
									local72 = true;
								}
							} else if (local803) {
								local937 = Static29.anIntArray99[local83];
							} else if (local74) {
								local937 = Static134.anIntArray221[local83];
							} else {
								local937 = Static489.anIntArray568[local83];
							}
							if (local163 != null) {
								if (local113 == 0) {
									local113 = local105;
								}
								if (local121 == 0) {
									local121 = local105;
								}
								if (local129 == 0) {
									local129 = local105;
								}
								@Pc(1582) Class373 local1582 = this.aClass14_5.method293(local105 - 1);
								@Pc(1590) Class373 local1590 = this.aClass14_5.method293(local113 - 1);
								@Pc(1598) Class373 local1598 = this.aClass14_5.method293(local121 - 1);
								@Pc(1606) Class373 local1606 = this.aClass14_5.method293(local129 - 1);
								for (local1280 = 0; local1280 < local361; local1280++) {
									if (local77[-local89 & 0x3] && local937 == local805[0]) {
										Static419.anIntArray513[0] = local817[local937];
										Static419.anIntArray513[1] = 1;
										Static419.anIntArray513[2] = local833[local937];
										Static419.anIntArray513[3] = 1;
										Static419.anIntArray513[4] = local813[local937];
										local1095 = 6;
										Static419.anIntArray513[5] = local833[local937];
									} else if (local77[2 - local89 & 0x3] && local805[2] == local937) {
										Static419.anIntArray513[0] = local817[local937];
										Static419.anIntArray513[1] = 5;
										Static419.anIntArray513[2] = local833[local937];
										Static419.anIntArray513[3] = 5;
										Static419.anIntArray513[4] = local813[local937];
										local1095 = 6;
										Static419.anIntArray513[5] = local833[local937];
									} else if (local77[1 - local89 & 0x3] && local937 == local805[1]) {
										Static419.anIntArray513[0] = local817[local937];
										Static419.anIntArray513[1] = 3;
										Static419.anIntArray513[2] = local833[local937];
										Static419.anIntArray513[3] = 3;
										Static419.anIntArray513[4] = local813[local937];
										local1095 = 6;
										Static419.anIntArray513[5] = local833[local937];
									} else if (local77[3 - local89 & 0x3] && local805[3] == local937) {
										Static419.anIntArray513[0] = local817[local937];
										Static419.anIntArray513[1] = 7;
										Static419.anIntArray513[2] = local833[local937];
										Static419.anIntArray513[3] = 7;
										Static419.anIntArray513[4] = local813[local937];
										Static419.anIntArray513[5] = local833[local937];
										local1095 = 6;
									} else {
										Static419.anIntArray513[0] = local817[local937];
										Static419.anIntArray513[1] = local813[local937];
										local1095 = 3;
										Static419.anIntArray513[2] = local833[local937];
									}
									local937++;
									for (local1285 = 0; local1285 < local1095; local1285++) {
										local1295 = Static419.anIntArray513[local1285];
										local1290 = local1295 - local89 * 2 & 0x7;
										local1299 = this.anIntArray733[local1295];
										local1362 = this.anIntArray734[local1295];
										@Pc(1874) int local1874;
										if (local89 == 1) {
											local1356 = local1362;
											local1874 = 512 - local1299;
										} else if (local89 == 2) {
											local1874 = 512 - local1362;
											local1356 = 512 - local1299;
										} else if (local89 == 3) {
											local1874 = local1299;
											local1356 = 512 - local1362;
										} else {
											local1874 = local1362;
											local1356 = local1299;
										}
										local953[local939] = local1356;
										local956[local939] = local1874;
										@Pc(1932) int local1932;
										@Pc(1938) int local1938;
										if (local972 != null && Static14.aBooleanArrayArray1[local83][local1295]) {
											local1932 = local1356 + (local27 << 9);
											local1938 = local1874 + (local43 << 9);
											local972[local939] = arg2.method7826(local1932, local1938) - arg1.method7826(local1932, local1938);
										}
										if (local981 != null) {
											if (arg2 != null && !Static14.aBooleanArrayArray1[local83][local1295]) {
												local1932 = local1356 + (local27 << 9);
												local1938 = (local43 << 9) + local1874;
												local981[local939] = arg1.method7826(local1932, local1938) - arg2.method7826(local1932, local1938);
											} else if (arg0 != null && !Static47.aBooleanArrayArray4[local83][local1295]) {
												local1932 = local1356 + (local27 << 9);
												local1938 = (local43 << 9) + local1874;
												local981[local939] = arg0.method7826(local1932, local1938) - arg1.method7826(local1932, local1938);
											}
										}
										if (local1295 < 8 && Static378.anIntArray451[local1290] >= 0) {
											if (local950 != null) {
												local950[local939] = Static200.anIntArray288[local1290];
											}
											local965[local939] = Static524.anIntArray602[local1290];
											local962[local939] = Static136.anIntArray223[local1290];
											local959[local939] = Static390.anIntArray469[local1290];
										} else {
											if (local74 && Static14.aBooleanArrayArray1[local83][local1295]) {
												local962[local939] = local985;
												local965[local939] = local987;
												local959[local939] = local983;
											} else if (local1356 == 0 && local1874 == 0) {
												local959[local939] = arg5[local27][local43];
												local962[local939] = local1582.anInt10155;
												local965[local939] = local1582.anInt10162;
											} else if (local1356 == 0 && local1874 == 512) {
												local959[local939] = arg5[local27][local57];
												local962[local939] = local1590.anInt10155;
												local965[local939] = local1590.anInt10162;
											} else if (local1356 == 512 && local1874 == 512) {
												local959[local939] = arg5[local41][local57];
												local962[local939] = local1598.anInt10155;
												local965[local939] = local1598.anInt10162;
											} else if (local1356 == 512 && local1874 == 0) {
												local959[local939] = arg5[local41][local43];
												local962[local939] = local1606.anInt10155;
												local965[local939] = local1606.anInt10162;
											} else {
												if (local1356 >= 256) {
													if (local1874 < 256) {
														local962[local939] = local1606.anInt10155;
														local965[local939] = local1606.anInt10162;
													} else {
														local962[local939] = local1598.anInt10155;
														local965[local939] = local1598.anInt10162;
													}
												} else if (local1874 < 256) {
													local962[local939] = local1582.anInt10155;
													local965[local939] = local1582.anInt10162;
												} else {
													local962[local939] = local1590.anInt10155;
													local965[local939] = local1590.anInt10162;
												}
												local1932 = Static142.method2700(local1356 << 7 >> 9, arg5[local27][local43], arg5[local41][local43]);
												local1938 = Static142.method2700(local1356 << 7 >> 9, arg5[local27][local57], arg5[local41][local57]);
												local959[local939] = Static142.method2700(local1874 << 7 >> 9, local1932, local1938);
											}
											if (local950 != null) {
												local950[local939] = local959[local939];
											}
										}
										local939++;
									}
								}
								if (local83 != 0 && local163.aBoolean750) {
									local72 = true;
								}
							}
							local1031 = arg1.method7819(local43, local27);
							local1033 = arg1.method7819(local43, local41);
							local1265 = arg1.method7819(local57, local41);
							local1271 = arg1.method7819(local57, local27);
							@Pc(2374) boolean local2374 = Static471.method6782(local43, local27);
							if (local2374 && arg4 > 1 || !local2374 && arg4 > 0) {
								@Pc(2390) boolean local2390 = true;
								if (local163 != null && !local163.aBoolean752) {
									local2390 = false;
								} else if (local105 == 0 && local83 != 0) {
									local2390 = false;
								} else if (local97 > 0 && local174 != null && !local174.aBoolean691) {
									local2390 = false;
								}
								if (local2390 && local1031 == local1033 && local1031 == local1265 && local1271 == local1031) {
									this.aByteArrayArrayArray13[arg4][local27][local43] = (byte) (this.aByteArrayArrayArray13[arg4][local27][local43] | 0x4);
								}
							}
							local1285 = 0;
							local1295 = 0;
							local1290 = 0;
							if (this.aBoolean755) {
								local1285 = Static165.method3055(local27, local43);
								local1295 = Static501.method7135(local27, local43);
								local1290 = Static230.method7150(local27, local43);
							}
							arg1.U(local27, local43, local953, local972, local956, local981, local959, local950, local962, local965, local1285, local1295, local1290, local72);
							Static526.method7336(arg4, local27, local43);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!s;ILclient!ha;Lclient!s;)V")
	public final void method8527(@OriginalArg(0) Class112 arg0, @OriginalArg(2) Class87 arg1, @OriginalArg(3) Class112 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt10197][this.anInt10198];
		if (Static191.anIntArray403 == null || this.anInt10198 != Static191.anIntArray403.length) {
			Static191.anIntArray403 = new int[this.anInt10198];
			Static107.anIntArray193 = new int[this.anInt10198];
			Static477.anIntArray556 = new int[this.anInt10198];
			Static401.anIntArray496 = new int[this.anInt10198];
			Static495.anIntArray581 = new int[this.anInt10198];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt10205; local44++) {
			for (local48 = 0; local48 < this.anInt10198; local48++) {
				Static191.anIntArray403[local48] = 0;
				Static477.anIntArray556[local48] = 0;
				Static495.anIntArray581[local48] = 0;
				Static107.anIntArray193[local48] = 0;
				Static401.anIntArray496[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt10197; local81++) {
				@Pc(91) int local91;
				@Pc(106) int local106;
				@Pc(178) int local178;
				for (@Pc(85) int local85 = 0; local85 < this.anInt10198; local85++) {
					local91 = local81 + 5;
					@Pc(155) int local155;
					if (local91 < this.anInt10197) {
						local106 = this.aByteArrayArrayArray18[local44][local91][local85] & 0xFF;
						if (local106 > 0) {
							@Pc(119) Class373 local119 = this.aClass14_5.method293(local106 - 1);
							Static191.anIntArray403[local85] += local119.anInt10157;
							Static477.anIntArray556[local85] += local119.anInt10158;
							Static495.anIntArray581[local85] += local119.anInt10161;
							Static107.anIntArray193[local85] += local119.anInt10163;
							local155 = Static401.anIntArray496[local85]++;
						}
					}
					local106 = local81 - 5;
					if (local106 >= 0) {
						local178 = this.aByteArrayArrayArray18[local44][local106][local85] & 0xFF;
						if (local178 > 0) {
							@Pc(191) Class373 local191 = this.aClass14_5.method293(local178 - 1);
							Static191.anIntArray403[local85] -= local191.anInt10157;
							Static477.anIntArray556[local85] -= local191.anInt10158;
							Static495.anIntArray581[local85] -= local191.anInt10161;
							Static107.anIntArray193[local85] -= local191.anInt10163;
							local155 = Static401.anIntArray496[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local106 = 0;
					local178 = 0;
					@Pc(249) int local249 = 0;
					@Pc(251) int local251 = 0;
					for (@Pc(253) int local253 = -5; local253 < this.anInt10198; local253++) {
						@Pc(259) int local259 = local253 + 5;
						if (this.anInt10198 > local259) {
							local106 += Static477.anIntArray556[local259];
							local251 += Static401.anIntArray496[local259];
							local249 += Static107.anIntArray193[local259];
							local91 += Static191.anIntArray403[local259];
							local178 += Static495.anIntArray581[local259];
						}
						@Pc(297) int local297 = local253 - 5;
						if (local297 >= 0) {
							local249 -= Static107.anIntArray193[local297];
							local91 -= Static191.anIntArray403[local297];
							local178 -= Static495.anIntArray581[local297];
							local106 -= Static477.anIntArray556[local297];
							local251 -= Static401.anIntArray496[local297];
						}
						if (local253 >= 0 && local249 > 0 && local251 > 0) {
							local11[local81][local253] = Static172.method3187(local178 / local251, local91 * 256 / local249, local106 / local251);
						}
					}
				}
			}
			if (Static506.aBoolean634) {
				this.method8526(local44 == 0 ? arg2 : null, Static331.aClass112Array3[local44], local44 == 0 ? arg0 : null, arg1, local44, local11);
			} else {
				this.method8524(arg1, local11, local44, Static331.aClass112Array3[local44], local44 == 0 ? arg2 : null, local44 == 0 ? arg0 : null);
			}
			this.aByteArrayArrayArray18[local44] = null;
			this.aByteArrayArrayArray17[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray16[local44] = null;
		}
		if (!this.aBoolean755) {
			if (Static324.anInt5883 != 0) {
				Static357.method5478();
			}
			if (Static223.aBoolean386) {
				Static38.method829();
			}
		}
		for (local48 = 0; local48 < this.anInt10205; local48++) {
			Static331.aClass112Array3[local48].YA();
		}
	}
}
