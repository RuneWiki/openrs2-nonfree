import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public class Class149 {

	@OriginalMember(owner = "client!me", name = "F", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!me", name = "r", descriptor = "[I")
	private final int[] anIntArray436 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
	private final int[] anIntArray435 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	protected final int anInt4435;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "Z")
	public final boolean aBoolean310;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!dd;")
	private final Class61 aClass61_5;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!tc;")
	private final Class279 aClass279_4;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "I")
	protected final int anInt4448;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "I")
	public final int anInt4443;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIZLclient!tc;Lclient!dd;)V")
	protected Class149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class279 arg4, @OriginalArg(5) Class61 arg5) {
		this.anInt4435 = arg1;
		this.aBoolean310 = arg3;
		this.aClass61_5 = arg5;
		this.aClass279_4 = arg4;
		this.anInt4448 = arg2;
		this.anInt4443 = arg0;
		this.aByteArrayArrayArray13 = new byte[this.anInt4443][this.anInt4435][this.anInt4448];
		this.aByteArrayArrayArray9 = new byte[this.anInt4443][this.anInt4435][this.anInt4448];
		this.aByteArrayArrayArray11 = new byte[this.anInt4443][this.anInt4435][this.anInt4448];
		this.aByteArrayArrayArray10 = new byte[this.anInt4443][this.anInt4435][this.anInt4448];
		this.anIntArrayArrayArray5 = new int[this.anInt4443][this.anInt4435 + 1][this.anInt4448 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt4443][this.anInt4435 + 1][this.anInt4448 + 1];
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!ge;ZIIIIIIIII)V")
	private void method3861(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg4 == 1) {
			arg6 = 1;
		} else if (arg4 == 2) {
			arg6 = 1;
			arg3 = 1;
		} else if (arg4 == 3) {
			arg3 = 1;
		}
		@Pc(66) int local66;
		if (arg7 < 0 || arg7 >= this.anInt4435 || arg8 < 0 || arg8 >= this.anInt4448) {
			while (true) {
				local66 = arg0.method3922();
				if (local66 == 0) {
					return;
				}
				if (local66 == 1) {
					arg0.method3922();
					return;
				}
				if (local66 <= 49) {
					arg0.method3922();
				}
			}
			return;
		}
		if (!this.aBoolean310 && !arg1) {
			Static530.aByteArrayArrayArray17[arg2][arg7][arg8] = 0;
		}
		while (true) {
			local66 = arg0.method3922();
			if (local66 == 0) {
				if (this.aBoolean310) {
					this.anIntArrayArrayArray5[0][arg3 + arg7][arg6 + arg8] = 0;
					return;
				} else if (arg2 == 0) {
					this.anIntArrayArrayArray5[0][arg3 + arg7][arg6 + arg8] = -Static365.method5439(arg9 + 932731, arg5 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray5[arg2][arg7 + arg3][arg6 + arg8] = this.anIntArrayArrayArray5[arg2 - 1][arg3 + arg7][arg8 + arg6] - 960;
					return;
				}
			}
			if (local66 == 1) {
				@Pc(157) int local157 = arg0.method3922();
				if (!this.aBoolean310) {
					if (local157 == 1) {
						local157 = 0;
					}
					if (arg2 != 0) {
						this.anIntArrayArrayArray5[arg2][arg7 + arg3][arg6 + arg8] = this.anIntArrayArrayArray5[arg2 - 1][arg3 + arg7][arg8 + arg6] - (local157 * 8 << 2);
						return;
					}
					this.anIntArrayArrayArray5[0][arg7 + arg3][arg8 + arg6] = -local157 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray5[0][arg7 + arg3][arg8 + arg6] = local157 * 8 << 2;
				return;
			}
			if (local66 <= 49) {
				if (arg1) {
					arg0.method3922();
				} else {
					this.aByteArrayArrayArray9[arg2][arg7][arg8] = arg0.method3928();
					this.aByteArrayArrayArray11[arg2][arg7][arg8] = (byte) ((local66 - 2) / 4);
					this.aByteArrayArrayArray10[arg2][arg7][arg8] = (byte) (local66 + arg4 - 2 & 0x3);
				}
			} else if (local66 <= 81) {
				if (!this.aBoolean310 && !arg1) {
					Static530.aByteArrayArrayArray17[arg2][arg7][arg8] = (byte) (local66 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray13[arg2][arg7][arg8] = (byte) (local66 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIZ)V")
	private void method3862(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(13) int local13;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + 64; local3++) {
			for (local13 = arg1; local13 < arg1 + 64; local13++) {
				if (local13 >= 0 && local13 < this.anInt4435 && local3 >= 0 && local3 < this.anInt4448) {
					this.anIntArrayArrayArray5[arg0][local13][local3] = arg0 <= 0 ? 0 : this.anIntArrayArrayArray5[arg0 - 1][local13][local3] - 960;
				}
			}
		}
		if (arg1 > 0 && this.anInt4435 > arg1) {
			for (local13 = arg2 + 1; local13 < arg2 + 64; local13++) {
				if (local13 >= 0 && this.anInt4448 > local13) {
					this.anIntArrayArrayArray5[arg0][arg1][local13] = this.anIntArrayArrayArray5[arg0][arg1 - 1][local13];
				}
			}
		}
		if (arg2 > 0 && this.anInt4448 > arg2) {
			for (local13 = arg1 + 1; local13 < arg1 + 64; local13++) {
				if (local13 >= 0 && this.anInt4435 > local13) {
					this.anIntArrayArrayArray5[arg0][local13][arg2] = this.anIntArrayArrayArray5[arg0][local13][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || this.anInt4435 <= arg1 || this.anInt4448 <= arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2] != 0) {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray5[arg0][arg1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = this.anIntArrayArrayArray5[arg0][arg1][arg2 - 1];
				return;
			}
			if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2] != this.anIntArrayArrayArray5[arg0 - 1][arg1 - 1][arg2]) {
			this.anIntArrayArrayArray5[arg0][arg1][arg2] = this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray5[arg0 - 1][arg1][arg2 - 1] != this.anIntArrayArrayArray5[arg0][arg1][arg2 - 1]) {
			this.anIntArrayArrayArray5[arg0][arg1][arg2] = this.anIntArrayArrayArray5[arg0][arg1][arg2 - 1];
			return;
		}
		if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray5[arg0 - 1][arg1 - 1][arg2 - 1] != this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray5[arg0][arg1][arg2] = this.anIntArrayArrayArray5[arg0][arg1 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([[[ILclient!qa;[Lclient!fd;Z)V")
	public final void method3863(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) Class91[] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean310) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt4435; local10++) {
					for (local14 = 0; local14 < this.anInt4448; local14++) {
						if ((Static530.aByteArrayArrayArray17[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static530.aByteArrayArrayArray17[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg2[local31].method2166(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt4443; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean310) {
				if (Static521.aBoolean617) {
					local10 = 2;
				}
				if (Static427.aBoolean540) {
					local14 = 8;
				}
				if (Static212.anInt4112 != 0) {
					if (Static449.aBoolean553 | local6 == 0) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static521.aBoolean617) {
				local14 |= 0x7;
			}
			if (!Static237.aBoolean337) {
				local14 |= 0x20;
			}
			@Pc(179) int[][] local179 = arg0 == null || local6 >= arg0.length ? this.anIntArrayArrayArray5[local6] : arg0[local6];
			Static177.method2905(local6, arg1.method7219(this.anInt4435, this.anInt4448, this.anIntArrayArrayArray5[local6], local179, local10, local14));
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!sa;Lclient!sa;Lclient!sa;Lclient!qa;I[[IB)V")
	private void method3864(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class122 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4435; local7++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt4448; local16++) {
				if (Static402.anInt7240 == -1 || Static371.method5719(arg4, local16, local7, Static402.anInt7240)) {
					@Pc(40) byte local40 = this.aByteArrayArrayArray11[arg4][local7][local16];
					@Pc(49) byte local49 = this.aByteArrayArrayArray10[arg4][local7][local16];
					@Pc(60) int local60 = this.aByteArrayArrayArray9[arg4][local7][local16] & 0xFF;
					@Pc(71) int local71 = this.aByteArrayArrayArray13[arg4][local7][local16] & 0xFF;
					@Pc(86) Class151 local86 = local60 == 0 ? null : this.aClass279_4.method6485(local60 - 1);
					@Pc(101) Class146 local101 = local71 == 0 ? null : this.aClass61_5.method1458(local71 - 1);
					@Pc(103) int local103 = 0;
					@Pc(105) int local105 = 0;
					if (local40 != 0) {
						local105 = local86 == null ? 0 : Static251.anIntArray470[local40];
						local103 = local101 == null ? 0 : Static537.anIntArray837[local40];
					} else if (local86 != null) {
						local105 = Static251.anIntArray470[local40];
					} else if (local101 != null) {
						local103 = Static251.anIntArray470[local40];
					}
					@Pc(146) int local146 = local103 + local105;
					@Pc(148) int local148 = 0;
					if (local146 != 0) {
						@Pc(156) int[] local156 = new int[local146];
						@Pc(159) int[] local159 = new int[local146];
						@Pc(162) int[] local162 = new int[local146];
						@Pc(165) int[] local165 = new int[local146];
						@Pc(167) boolean local167 = false;
						@Pc(192) int local192;
						@Pc(198) int local198;
						if (local86 == null || local86.anInt4473 == -1 && local86.anInt4485 == -1 && local86.anInt4479 == -1) {
							for (local192 = 0; local192 < local105; local192++) {
								local156[local148] = -1;
								local148++;
							}
						} else {
							local192 = arg3.method7267() ? local86.anInt4479 : local86.anInt4478;
							if (Static247.aBoolean344) {
								local192 = -1;
							}
							for (local198 = 0; local198 < local105; local198++) {
								local162[local148] = local192;
								local165[local148] = local86.anInt4484;
								if (local86.anInt4473 == -1) {
									local156[local148] = -1;
								} else {
									local156[local148] = local86.anInt4473;
								}
								if (local86.anInt4485 == -1) {
									local159[local148] = -1;
								} else {
									local167 = true;
									local159[local148] = local86.anInt4485;
								}
								local148++;
							}
							if (!this.aBoolean310 && arg4 == 0) {
								Static45.method918(local7, local16, local86.anInt4476, local86.anInt4474 * 8, local86.anInt4482);
							}
						}
						if (!local167) {
							local159 = null;
						}
						if (local101 == null) {
							for (local192 = 0; local192 < local103; local192++) {
								local156[local148] = -1;
								local148++;
							}
						} else {
							local192 = local101.anInt4198;
							if (Static247.aBoolean344) {
								local192 = -1;
							}
							for (local198 = 0; local198 < local103; local198++) {
								local162[local148] = local192;
								local165[local148] = local101.anInt4195;
								local156[local148] = arg5[local7][local16];
								if (local159 != null) {
									local159[local148] = -1;
								}
								local148++;
							}
						}
						local192 = this.anIntArray435.length;
						@Pc(348) int[] local348 = new int[local192];
						@Pc(351) int[] local351 = new int[local192];
						@Pc(358) int[] local358 = arg1 == null ? null : new int[local192];
						@Pc(367) int[] local367 = arg1 == null && arg0 == null ? null : new int[local192];
						@Pc(376) int local376;
						@Pc(381) int local381;
						@Pc(460) int local460;
						@Pc(466) int local466;
						for (@Pc(369) int local369 = 0; local369 < local192; local369++) {
							local376 = this.anIntArray435[local369];
							local381 = this.anIntArray436[local369];
							if (local49 == 0) {
								local348[local369] = local376;
								local351[local369] = local381;
							} else if (local49 == 1) {
								local348[local369] = local381;
								local351[local369] = 512 - local376;
							} else if (local49 == 2) {
								local348[local369] = 512 - local376;
								local351[local369] = 512 - local381;
							} else if (local49 == 3) {
								local348[local369] = 512 - local381;
								local351[local369] = local376;
							}
							if (local358 != null && Static93.aBooleanArrayArray4[local40][local369]) {
								local460 = (local7 << 9) + local376;
								local466 = local376 + (local16 << 9);
								local358[local369] = arg1.aa(local460, local466) - arg2.aa(local460, local466);
							}
							if (local367 != null) {
								if (arg1 != null && !Static93.aBooleanArrayArray4[local40][local369]) {
									local460 = local376 + (local7 << 9);
									local466 = (local16 << 9) + local376;
									local367[local369] = arg2.aa(local460, local466) - arg1.aa(local460, local466);
								} else if (arg0 != null && !Static62.aBooleanArrayArray3[local40][local369]) {
									local460 = local376 + (local7 << 9);
									local466 = local376 + (local16 << 9);
									local367[local369] = arg0.aa(local460, local466) - arg2.aa(local460, local466);
								}
							}
						}
						local376 = arg2.ba(local7, local16);
						local381 = arg2.ba(local7 + 1, local16);
						local460 = arg2.ba(local7 + 1, local16 + 1);
						local466 = arg2.ba(local7, local16 + 1);
						if (arg4 > 0) {
							@Pc(585) boolean local585 = true;
							if (local71 == 0 && local40 != 0) {
								local585 = false;
							}
							if (local60 > 0 && local86 != null && !local86.aBoolean312) {
								local585 = false;
							}
							if (local585 && local376 == local381 && local460 == local376 && local466 == local376) {
								this.aByteArrayArrayArray12[arg4][local7][local16] = (byte) (this.aByteArrayArrayArray12[arg4][local7][local16] | 0x4);
							}
						}
						@Pc(646) int local646 = 0;
						@Pc(648) int local648 = 0;
						@Pc(650) int local650 = 0;
						if (this.aBoolean310) {
							local646 = Static342.method5173(local7, local16);
							local648 = Static83.method1448(local7, local16);
							local650 = Static219.method6543(local7, local16);
						}
						arg2.method6745(local7, local16, local348, local358, local351, local367, Static475.anIntArrayArray81[local40], Static24.anIntArrayArray6[local40], Static480.anIntArrayArray105[local40], local156, local159, local162, local165, local646, local648, local650);
						Static161.method2492(arg4, local7, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILclient!jg;[[BI[[B[[BLclient!qa;III[ZLclient!iv;)V")
	private void method3865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class151 arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) byte[][] arg7, @OriginalArg(8) Class122 arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean[] arg11, @OriginalArg(13) Class146 arg12) {
		@Pc(18) boolean[] local18 = arg3 != null && arg3.aBoolean313 ? Static388.aBooleanArrayArray7[arg9] : Static47.aBooleanArrayArray2[arg9];
		@Pc(37) int local37;
		@Pc(47) Class151 local47;
		@Pc(65) byte local65;
		@Pc(82) int local82;
		@Pc(89) int local89;
		if (arg2 > 0) {
			if (arg0 > 0) {
				local37 = arg7[arg0 - 1][arg2 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass279_4.method6485(local37 - 1);
					if (local47.anInt4473 != -1 && local47.aBoolean313) {
						local65 = arg6[arg0 - 1][arg2 - 1];
						local82 = arg4[arg0 - 1][arg2 - 1] * 2 + 4 & 0x7;
						local89 = Static3.method210(arg8, local47);
						if (Static93.aBooleanArrayArray4[local65][local82]) {
							Static383.anIntArray579[0] = local47.anInt4473;
							Static403.anIntArray698[0] = local89;
							Static173.anIntArray290[0] = arg8.method7267() ? local47.anInt4479 : local47.anInt4478;
							Static254.anIntArray515[0] = local47.anInt4484;
							Static360.anIntArray647[0] = local47.anInt4480;
							Static229.anIntArray443[0] = 256;
						}
					}
				}
			}
			if (arg1 - 1 > arg0) {
				local37 = arg7[arg0 + 1][arg2 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass279_4.method6485(local37 - 1);
					if (local47.anInt4473 != -1 && local47.aBoolean313) {
						local65 = arg6[arg0 + 1][arg2 - 1];
						local82 = arg4[arg0 + 1][arg2 - 1] * 2 + 6 & 0x7;
						local89 = Static3.method210(arg8, local47);
						if (Static93.aBooleanArrayArray4[local65][local82]) {
							Static383.anIntArray579[2] = local47.anInt4473;
							Static403.anIntArray698[2] = local89;
							Static173.anIntArray290[2] = arg8.method7267() ? local47.anInt4479 : local47.anInt4478;
							Static254.anIntArray515[2] = local47.anInt4484;
							Static360.anIntArray647[2] = local47.anInt4480;
							Static229.anIntArray443[2] = 512;
						}
					}
				}
			}
		}
		if (arg10 - 1 > arg2) {
			if (arg0 > 0) {
				local37 = arg7[arg0 - 1][arg2 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass279_4.method6485(local37 - 1);
					if (local47.anInt4473 != -1 && local47.aBoolean313) {
						local65 = arg6[arg0 - 1][arg2 + 1];
						local82 = arg4[arg0 - 1][arg2 + 1] * 2 + 2 & 0x7;
						local89 = Static3.method210(arg8, local47);
						if (Static93.aBooleanArrayArray4[local65][local82]) {
							Static383.anIntArray579[6] = local47.anInt4473;
							Static403.anIntArray698[6] = local89;
							Static173.anIntArray290[6] = arg8.method7267() ? local47.anInt4479 : local47.anInt4478;
							Static254.anIntArray515[6] = local47.anInt4484;
							Static360.anIntArray647[6] = local47.anInt4480;
							Static229.anIntArray443[6] = 64;
						}
					}
				}
			}
			if (arg0 < arg1 - 1) {
				local37 = arg7[arg0 + 1][arg2 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass279_4.method6485(local37 - 1);
					if (local47.anInt4473 != -1 && local47.aBoolean313) {
						local65 = arg6[arg0 + 1][arg2 + 1];
						local82 = --(arg4[arg0 + 1][arg2 + 1] * 2) & 0x7;
						local89 = Static3.method210(arg8, local47);
						if (Static93.aBooleanArrayArray4[local65][local82]) {
							Static383.anIntArray579[4] = local47.anInt4473;
							Static403.anIntArray698[4] = local89;
							Static173.anIntArray290[4] = arg8.method7267() ? local47.anInt4479 : local47.anInt4478;
							Static254.anIntArray515[4] = local47.anInt4484;
							Static360.anIntArray647[4] = local47.anInt4480;
							Static229.anIntArray443[4] = 128;
						}
					}
				}
			}
		}
		@Pc(509) int local509;
		@Pc(516) int local516;
		@Pc(518) int local518;
		@Pc(498) byte local498;
		if (arg2 > 0) {
			local37 = arg7[arg0][arg2 - 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass279_4.method6485(local37 - 1);
				if (local47.anInt4473 != -1) {
					local65 = arg6[arg0][arg2 - 1];
					local498 = arg4[arg0][arg2 - 1];
					if (local47.aBoolean313) {
						local89 = 2;
						local509 = local498 * 2 + 4;
						local516 = Static3.method210(arg8, local47);
						for (local518 = 0; local518 < 3; local518++) {
							local89 &= 0x7;
							local509 &= 0x7;
							if (Static93.aBooleanArrayArray4[local65][local509] && Static360.anIntArray647[local89] <= local47.anInt4480) {
								Static383.anIntArray579[local89] = local47.anInt4473;
								Static403.anIntArray698[local89] = local516;
								Static173.anIntArray290[local89] = arg8.method7267() ? local47.anInt4479 : local47.anInt4478;
								Static254.anIntArray515[local89] = local47.anInt4484;
								if (Static360.anIntArray647[local89] == local47.anInt4480) {
									Static229.anIntArray443[local89] |= 0x20;
								} else {
									Static229.anIntArray443[local89] = 32;
								}
								Static360.anIntArray647[local89] = local47.anInt4480;
							}
							local89--;
							local509++;
						}
						if (!local18[arg5 & 0x3]) {
							arg11[0] = Static388.aBooleanArrayArray7[local65][local498 + 2 & 0x3];
						}
					} else if (!local18[--arg5 & 0x3]) {
						arg11[0] = Static47.aBooleanArrayArray2[local65][local498 + 2 & 0x3];
					}
				}
			}
		}
		if (arg10 - 1 > arg2) {
			local37 = arg7[arg0][arg2 + 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass279_4.method6485(local37 - 1);
				if (local47.anInt4473 != -1) {
					local65 = arg6[arg0][arg2 + 1];
					local498 = arg4[arg0][arg2 + 1];
					if (local47.aBoolean313) {
						local89 = 4;
						local509 = local498 * 2 + 2;
						local516 = Static3.method210(arg8, local47);
						for (local518 = 0; local518 < 3; local518++) {
							local89 &= 0x7;
							local509 &= 0x7;
							if (Static93.aBooleanArrayArray4[local65][local509] && local47.anInt4480 >= Static360.anIntArray647[local89]) {
								Static383.anIntArray579[local89] = local47.anInt4473;
								Static403.anIntArray698[local89] = local516;
								Static173.anIntArray290[local89] = arg8.method7267() ? local47.anInt4479 : local47.anInt4478;
								Static254.anIntArray515[local89] = local47.anInt4484;
								if (Static360.anIntArray647[local89] == local47.anInt4480) {
									Static229.anIntArray443[local89] |= 0x10;
								} else {
									Static229.anIntArray443[local89] = 16;
								}
								Static360.anIntArray647[local89] = local47.anInt4480;
							}
							local89++;
							local509--;
						}
						if (!local18[arg5 + 2 & 0x3]) {
							arg11[2] = Static388.aBooleanArrayArray7[local65][local498 & 0x3];
						}
					} else if (!local18[arg5 + 2 & 0x3]) {
						arg11[2] = Static47.aBooleanArrayArray2[local65][local498 & 0x3];
					}
				}
			}
		}
		if (arg0 > 0) {
			local37 = arg7[arg0 - 1][arg2] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass279_4.method6485(local37 - 1);
				if (local47.anInt4473 != -1) {
					local65 = arg6[arg0 - 1][arg2];
					local498 = arg4[arg0 - 1][arg2];
					if (local47.aBoolean313) {
						local89 = 6;
						local509 = local498 * 2 + 4;
						local516 = Static3.method210(arg8, local47);
						for (local518 = 0; local518 < 3; local518++) {
							local509 &= 0x7;
							local89 &= 0x7;
							if (Static93.aBooleanArrayArray4[local65][local509] && local47.anInt4480 >= Static360.anIntArray647[local89]) {
								Static383.anIntArray579[local89] = local47.anInt4473;
								Static403.anIntArray698[local89] = local516;
								Static173.anIntArray290[local89] = arg8.method7267() ? local47.anInt4479 : local47.anInt4478;
								Static254.anIntArray515[local89] = local47.anInt4484;
								if (local47.anInt4480 == Static360.anIntArray647[local89]) {
									Static229.anIntArray443[local89] |= 0x8;
								} else {
									Static229.anIntArray443[local89] = 8;
								}
								Static360.anIntArray647[local89] = local47.anInt4480;
							}
							local509--;
							local89++;
						}
						if (!local18[arg5 + 3 & 0x3]) {
							arg11[3] = Static388.aBooleanArrayArray7[local65][local498 + 1 & 0x3];
						}
					} else if (!local18[arg5 + 3 & 0x3]) {
						arg11[3] = Static47.aBooleanArrayArray2[local65][local498 + 1 & 0x3];
					}
				}
			}
		}
		if (arg0 < arg1 - 1) {
			local37 = arg7[arg0 + 1][arg2] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass279_4.method6485(local37 - 1);
				if (local47.anInt4473 != -1) {
					local65 = arg6[arg0 + 1][arg2];
					local498 = arg4[arg0 + 1][arg2];
					if (local47.aBoolean313) {
						local89 = 4;
						local509 = local498 * 2 + 6;
						local516 = Static3.method210(arg8, local47);
						for (local518 = 0; local518 < 3; local518++) {
							local509 &= 0x7;
							local89 &= 0x7;
							if (Static93.aBooleanArrayArray4[local65][local509] && local47.anInt4480 >= Static360.anIntArray647[local89]) {
								Static383.anIntArray579[local89] = local47.anInt4473;
								Static403.anIntArray698[local89] = local516;
								Static173.anIntArray290[local89] = arg8.method7267() ? local47.anInt4479 : local47.anInt4478;
								Static254.anIntArray515[local89] = local47.anInt4484;
								if (Static360.anIntArray647[local89] == local47.anInt4480) {
									Static229.anIntArray443[local89] |= 0x4;
								} else {
									Static229.anIntArray443[local89] = 4;
								}
								Static360.anIntArray647[local89] = local47.anInt4480;
							}
							local509++;
							local89--;
						}
						if (!local18[arg5 + 1 & 0x3]) {
							arg11[1] = Static388.aBooleanArrayArray7[local65][local498 + 3 & 0x3];
						}
					} else if (!local18[arg5 + 1 & 0x3]) {
						arg11[1] = Static47.aBooleanArrayArray2[local65][local498 + 3 & 0x3];
					}
				}
			}
		}
		if (arg3 == null) {
			return;
		}
		local37 = Static3.method210(arg8, arg3);
		if (!arg3.aBoolean313) {
			return;
		}
		for (@Pc(1237) int local1237 = 0; local1237 < 8; local1237++) {
			@Pc(1248) int local1248 = local1237 - arg5 * 2 & 0x7;
			if (Static93.aBooleanArrayArray4[arg9][local1237] && Static360.anIntArray647[local1248] <= arg3.anInt4480) {
				Static383.anIntArray579[local1248] = arg3.anInt4473;
				Static403.anIntArray698[local1248] = local37;
				Static173.anIntArray290[local1248] = arg8.method7267() ? arg3.anInt4479 : arg3.anInt4478;
				Static254.anIntArray515[local1248] = arg3.anInt4484;
				if (Static360.anIntArray647[local1248] == arg3.anInt4480) {
					Static229.anIntArray443[local1248] |= 0x2;
				} else {
					Static229.anIntArray443[local1248] = 2;
				}
				Static360.anIntArray647[local1248] = arg3.anInt4480;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII[Lclient!fd;BIIILclient!ge;)V")
	public final void method3868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class91[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class1_Sub6 arg8) {
		@Pc(15) int local15 = (arg2 & 0x7) * 8;
		@Pc(21) int local21 = (arg5 & 0x7) * 8;
		@Pc(30) int local30;
		@Pc(60) int local60;
		if (!this.aBoolean310) {
			@Pc(28) Class91 local28 = arg4[arg3];
			for (local30 = 0; local30 < 8; local30++) {
				for (@Pc(34) int local34 = 0; local34 < 8; local34++) {
					@Pc(48) int local48 = arg6 + Static181.method2703(arg1, local34 & 0x7, local30 & 0x7);
					local60 = Static535.method7412(local34 & 0x7, local30 & 0x7, arg1) + arg7;
					if (local48 > 0 && local48 < this.anInt4435 - 1 && local60 > 0 && local60 < this.anInt4448 - 1) {
						local28.method2173(local60, local48);
					}
				}
			}
		}
		@Pc(103) int local103 = (arg2 & 0x1FFFFFF8) << 3;
		local30 = (arg5 & 0xFFFFFFF8) << 3;
		@Pc(111) byte local111 = 0;
		@Pc(113) byte local113 = 0;
		if (arg1 == 1) {
			local113 = 1;
		} else if (arg1 == 2) {
			local111 = 1;
			local113 = 1;
		} else if (arg1 == 3) {
			local111 = 1;
		}
		for (local60 = 0; local60 < this.anInt4443; local60++) {
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
					if (local60 == arg0 && local15 <= local140 && local140 <= local15 + 8 && local144 >= local21 && local21 + 8 >= local144) {
						@Pc(204) int local204;
						@Pc(211) int local211;
						if (local140 == local15 + 8 || local144 == local21 + 8) {
							if (arg1 == 0) {
								local204 = local140 + arg6 - local15;
								local211 = arg7 + local144 - local21;
							} else if (arg1 == 1) {
								local204 = local144 + arg6 - local21;
								local211 = local15 + arg7 + 8 - local140;
							} else if (arg1 == 2) {
								local211 = local21 + arg7 + 8 - local144;
								local204 = arg6 + local15 + 8 - local140;
							} else {
								local204 = arg6 + local21 + 8 - local144;
								local211 = local140 + arg7 - local15;
							}
							this.method3861(arg8, true, arg3, 0, 0, local30 + local144, 0, local204, local211, local103 + local140);
						} else {
							local204 = arg6 + Static181.method2703(arg1, local144 & 0x7, local140 & 0x7);
							local211 = Static535.method7412(local144 & 0x7, local140 & 0x7, arg1) + arg7;
							this.method3861(arg8, false, arg3, local111, arg1, local144 + local30, local113, local204, local211, local103 + local140);
						}
						if (local140 == 63 || local144 == 63) {
							@Pc(351) byte local351 = 1;
							if (local140 == 63 && local144 == 63) {
								local351 = 3;
							}
							for (@Pc(365) int local365 = 0; local365 < local351; local365++) {
								@Pc(369) int local369 = local140;
								@Pc(371) int local371 = local144;
								if (local365 == 0) {
									local369 = local140 == 63 ? 64 : local140;
									local371 = local144 == 63 ? 64 : local144;
								} else if (local365 == 1) {
									local369 = 64;
								} else if (local365 == 2) {
									local371 = 64;
								}
								@Pc(424) int local424;
								@Pc(417) int local417;
								if (arg1 == 0) {
									local417 = arg7 + local371 - local21;
									local424 = arg6 + local369 - local15;
								} else if (arg1 == 1) {
									local424 = arg6 + local371 - local21;
									local417 = arg7 + local15 + 8 - local369;
								} else if (arg1 == 2) {
									local417 = arg7 + local21 + 8 - local371;
									local424 = local15 + arg6 + 8 - local369;
								} else {
									local424 = local21 + arg6 + 8 - local371;
									local417 = arg7 + local369 - local15;
								}
								if (local424 >= 0 && this.anInt4435 > local424 && local417 >= 0 && this.anInt4448 > local417) {
									this.anIntArrayArrayArray5[arg3][local424][local417] = this.anIntArrayArrayArray5[arg3][local111 + local204][local113 + local211];
								}
							}
						}
					} else {
						this.method3861(arg8, false, 0, 0, 0, 0, 0, -1, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZIIII)V")
	public final void method3869(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt4443; local9++) {
			this.method3862(local9, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!sa;[[ILclient!sa;Lclient!qa;IILclient!sa;)V")
	private void method3870(@OriginalArg(0) Class205 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class122 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class205 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg4];
		@Pc(23) byte[][] local23 = this.aByteArrayArrayArray10[arg4];
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray13[arg4];
		@Pc(33) byte[][] local33 = this.aByteArrayArrayArray9[arg4];
		for (@Pc(35) int local35 = 0; local35 < this.anInt4435; local35++) {
			@Pc(53) int local53 = local35 < this.anInt4435 - 1 ? local35 + 1 : local35;
			for (@Pc(55) int local55 = 0; local55 < this.anInt4448; local55++) {
				@Pc(73) int local73 = this.anInt4448 - 1 > local55 ? local55 + 1 : local55;
				if (Static402.anInt7240 == -1 || Static371.method5719(arg4, local55, local35, Static402.anInt7240)) {
					@Pc(87) boolean local87 = false;
					@Pc(89) boolean local89 = false;
					@Pc(92) boolean[] local92 = new boolean[4];
					@Pc(98) int local98 = local10[local35][local55];
					@Pc(104) int local104 = local23[local35][local55];
					@Pc(112) int local112 = local33[local35][local55] & 0xFF;
					@Pc(120) int local120 = local28[local35][local55] & 0xFF;
					@Pc(128) int local128 = local28[local35][local73] & 0xFF;
					@Pc(136) int local136 = local28[local53][local73] & 0xFF;
					@Pc(144) int local144 = local28[local53][local55] & 0xFF;
					if (local112 != 0 || local120 != 0) {
						@Pc(166) Class151 local166 = local112 == 0 ? null : this.aClass279_4.method6485(local112 - 1);
						if (local98 == 0 && local166 == null) {
							local98 = 12;
						}
						@Pc(184) Class146 local184 = local120 == 0 ? null : this.aClass61_5.method1458(local120 - 1);
						@Pc(186) Class151 local186 = local166;
						if (local166 != null) {
							if (local166.anInt4473 == -1 && local166.anInt4485 == -1) {
								local186 = local166;
								local166 = null;
							} else if (local184 != null && local98 != 0) {
								local89 = local166.aBoolean313;
							}
						}
						@Pc(262) int local262;
						@Pc(322) int local322;
						@Pc(376) int local376;
						@Pc(389) int local389;
						if ((local98 == 0 || local98 == 12) && local35 > 0 && local55 > 0 && this.anInt4435 > local35 && local55 < this.anInt4448) {
							local262 = local120 == local28[local35 - 1][local55 - 1] ? 1 : -1;
							@Pc(277) int local277 = local28[local53][local73] == local120 ? 1 : -1;
							@Pc(292) int local292 = local120 == local28[local53][local55 - 1] ? 1 : -1;
							if (local120 == local28[local35][local55 - 1]) {
								local292++;
								local262++;
							} else {
								local292--;
								local262--;
							}
							local322 = local28[local35 - 1][local73] == local120 ? 1 : -1;
							if (local28[local53][local55] == local120) {
								local277++;
								local292++;
							} else {
								local277--;
								local292--;
							}
							if (local28[local35][local73] == local120) {
								local322++;
								local277++;
							} else {
								local277--;
								local322--;
							}
							if (local28[local35 - 1][local55] == local120) {
								local322++;
								local262++;
							} else {
								local262--;
								local322--;
							}
							local376 = local262 - local277;
							if (local376 < 0) {
								local376 = -local376;
							}
							local389 = local292 - local322;
							if (local389 < 0) {
								local389 = -local389;
							}
							if (local389 == local376) {
								local376 = arg2.ba(local35, local55) - arg2.ba(local53, local73);
								local389 = arg2.ba(local53, local55) - arg2.ba(local35, local73);
								if (local376 < 0) {
									local376 = -local376;
								}
								if (local389 < 0) {
									local389 = -local389;
								}
							}
							local104 = local389 <= local376 ? 0 : 1;
						}
						for (local262 = 0; local262 < 13; local262++) {
							Static360.anIntArray647[local262] = -1;
							Static229.anIntArray443[local262] = 1;
						}
						@Pc(478) boolean[] local478 = local166 != null && local166.aBoolean313 ? Static388.aBooleanArrayArray7[local98] : Static47.aBooleanArrayArray2[local98];
						this.method3865(local35, this.anInt4435, local55, local166, local23, local104, local10, local33, arg3, local98, this.anInt4448, local92, local184);
						@Pc(507) boolean local507 = local166 != null && local166.anInt4485 != local166.anInt4473;
						if (!local507) {
							for (local322 = 0; local322 < 8; local322++) {
								if (Static360.anIntArray647[local322] >= 0 && Static383.anIntArray579[local322] != Static403.anIntArray698[local322]) {
									local507 = true;
									break;
								}
							}
						}
						if (!local478[local104 + 1 & 0x3]) {
							local92[1] = Static420.method6172(local92[1], (Static229.anIntArray443[4] & Static229.anIntArray443[2]) == 0);
						}
						if (!local478[local104 + 3 & 0x3]) {
							local92[3] = Static420.method6172(local92[3], (Static229.anIntArray443[6] & Static229.anIntArray443[0]) == 0);
						}
						if (!local478[local104 & 0x3]) {
							local92[0] = Static420.method6172(local92[0], (Static229.anIntArray443[0] & Static229.anIntArray443[2]) == 0);
						}
						if (!local478[local104 + 2 & 0x3]) {
							local92[2] = Static420.method6172(local92[2], (Static229.anIntArray443[6] & Static229.anIntArray443[4]) == 0);
						}
						if (!local89 && (local98 == 0 || local98 == 12)) {
							if (local92[0] && !local92[1] && !local92[2] && local92[3]) {
								local98 = local98 == 0 ? 13 : 14;
								local104 = 0;
								local92[0] = local92[3] = false;
							} else if (local92[0] && local92[1] && !local92[2] && !local92[3]) {
								local104 = 3;
								local92[0] = local92[1] = false;
								local98 = local98 == 0 ? 13 : 14;
							} else if (!local92[0] && local92[1] && local92[2] && !local92[3]) {
								local98 = local98 == 0 ? 13 : 14;
								local92[1] = local92[2] = false;
								local104 = 2;
							} else if (!local92[0] && !local92[1] && local92[2] && local92[3]) {
								local104 = 1;
								local98 = local98 == 0 ? 13 : 14;
								local92[2] = local92[3] = false;
							}
						}
						@Pc(808) boolean local808 = !local89 && !local92[0] && !local92[2] && !local92[1] && !local92[3];
						@Pc(810) int[] local810 = null;
						@Pc(832) int[] local832;
						@Pc(820) int[] local820;
						@Pc(816) int[] local816;
						if (local808) {
							local816 = Static480.anIntArrayArray105[local98];
							local820 = Static24.anIntArrayArray6[local98];
							local389 = local166 == null ? 0 : Static251.anIntArray470[local98];
							local832 = Static475.anIntArrayArray81[local98];
							local376 = local184 == null ? 0 : Static537.anIntArray837[local98];
						} else if (local89) {
							local832 = Static266.anIntArrayArray116[local98];
							local820 = Static529.anIntArrayArray114[local98];
							local810 = Static473.anIntArrayArray104[local98];
							local376 = local184 == null ? 0 : Static134.anIntArray253[local98];
							local389 = local166 == null ? 0 : Static215.anIntArray348[local98];
							local816 = Static304.anIntArrayArray71[local98];
						} else {
							local820 = Static225.anIntArrayArray52[local98];
							local810 = Static426.anIntArrayArray96[local98];
							local832 = Static268.anIntArrayArray61[local98];
							local816 = Static37.anIntArrayArray13[local98];
							local389 = local166 == null ? 0 : Static467.anIntArray740[local98];
							local376 = local184 == null ? 0 : Static159.anIntArray280[local98];
						}
						@Pc(913) int local913 = local376 + local389;
						if (local913 <= 0) {
							Static161.method2492(arg4, local35, local55);
						} else {
							if (local92[0]) {
								local913++;
							}
							if (local92[2]) {
								local913++;
							}
							if (local92[1]) {
								local913++;
							}
							if (local92[3]) {
								local913++;
							}
							@Pc(943) int local943 = 0;
							@Pc(945) int local945 = 0;
							@Pc(949) int local949 = local913 * 3;
							@Pc(956) int[] local956 = local507 ? new int[local949] : null;
							@Pc(959) int[] local959 = new int[local949];
							@Pc(962) int[] local962 = new int[local949];
							@Pc(965) int[] local965 = new int[local949];
							@Pc(968) int[] local968 = new int[local949];
							@Pc(971) int[] local971 = new int[local949];
							@Pc(978) int[] local978 = arg5 == null ? null : new int[local949];
							@Pc(987) int[] local987 = arg5 == null && arg0 == null ? null : new int[local949];
							@Pc(989) int local989 = -1;
							@Pc(991) int local991 = -1;
							@Pc(993) int local993 = 256;
							@Pc(1123) byte local1123;
							@Pc(1043) int local1043;
							@Pc(1045) int local1045;
							@Pc(1278) int local1278;
							@Pc(1284) int local1284;
							@Pc(1293) int local1293;
							@Pc(1298) int local1298;
							@Pc(1308) int local1308;
							@Pc(1303) int local1303;
							@Pc(1313) int local1313;
							@Pc(1371) int local1371;
							@Pc(1378) int local1378;
							if (local166 != null) {
								local989 = local166.anInt4473;
								local991 = arg3.method7267() ? local166.anInt4479 : local166.anInt4478;
								local993 = local166.anInt4484;
								local1043 = Static3.method210(arg3, local166);
								for (local1045 = 0; local1045 < local389; local1045++) {
									if (local92[-local104 & 0x3] && local810[0] == local943) {
										Static2.anIntArray563[0] = local832[local943];
										Static2.anIntArray563[1] = 1;
										Static2.anIntArray563[2] = local816[local943];
										Static2.anIntArray563[3] = 1;
										Static2.anIntArray563[4] = local820[local943];
										local1123 = 6;
										Static2.anIntArray563[5] = local816[local943];
									} else if (local92[2 - local104 & 0x3] && local810[2] == local943) {
										Static2.anIntArray563[0] = local832[local943];
										Static2.anIntArray563[1] = 5;
										Static2.anIntArray563[2] = local816[local943];
										Static2.anIntArray563[3] = 5;
										Static2.anIntArray563[4] = local820[local943];
										Static2.anIntArray563[5] = local816[local943];
										local1123 = 6;
									} else if (local92[1 - local104 & 0x3] && local943 == local810[1]) {
										Static2.anIntArray563[0] = local832[local943];
										Static2.anIntArray563[1] = 3;
										Static2.anIntArray563[2] = local816[local943];
										Static2.anIntArray563[3] = 3;
										Static2.anIntArray563[4] = local820[local943];
										local1123 = 6;
										Static2.anIntArray563[5] = local816[local943];
									} else if (local92[3 - local104 & 0x3] && local943 == local810[3]) {
										Static2.anIntArray563[0] = local832[local943];
										Static2.anIntArray563[1] = 7;
										Static2.anIntArray563[2] = local816[local943];
										Static2.anIntArray563[3] = 7;
										Static2.anIntArray563[4] = local820[local943];
										Static2.anIntArray563[5] = local816[local943];
										local1123 = 6;
									} else {
										Static2.anIntArray563[0] = local832[local943];
										Static2.anIntArray563[1] = local820[local943];
										local1123 = 3;
										Static2.anIntArray563[2] = local816[local943];
									}
									for (local1278 = 0; local1278 < local1123; local1278++) {
										local1284 = Static2.anIntArray563[local1278];
										local1293 = local1284 - local104 * 2 & 0x7;
										local1298 = this.anIntArray435[local1284];
										local1303 = this.anIntArray436[local1284];
										if (local104 == 1) {
											local1308 = local1303;
											local1313 = 512 - local1298;
										} else if (local104 == 2) {
											local1313 = 512 - local1303;
											local1308 = 512 - local1298;
										} else if (local104 == 3) {
											local1313 = local1298;
											local1308 = 512 - local1303;
										} else {
											local1308 = local1298;
											local1313 = local1303;
										}
										local959[local945] = local1308;
										local962[local945] = local1313;
										if (local978 != null && Static93.aBooleanArrayArray4[local98][local1284]) {
											local1371 = (local35 << 9) + local1308;
											local1378 = (local55 << 9) + local1313;
											local978[local945] = arg5.aa(local1371, local1378) - arg2.aa(local1371, local1378);
										}
										if (local987 != null) {
											if (arg5 != null && !Static93.aBooleanArrayArray4[local98][local1284]) {
												local1371 = local1308 + (local35 << 9);
												local1378 = (local55 << 9) + local1313;
												local987[local945] = arg2.aa(local1371, local1378) - arg5.aa(local1371, local1378);
											} else if (arg0 != null && !Static62.aBooleanArrayArray3[local98][local1284]) {
												local1371 = local1308 + (local35 << 9);
												local1378 = (local55 << 9) + local1313;
												local987[local945] = arg0.aa(local1371, local1378) - arg2.aa(local1371, local1378);
											}
										}
										if (local1284 < 8 && Static360.anIntArray647[local1293] > local166.anInt4480) {
											if (local956 != null) {
												local956[local945] = Static403.anIntArray698[local1293];
											}
											local971[local945] = Static254.anIntArray515[local1293];
											local968[local945] = Static173.anIntArray290[local1293];
											local965[local945] = Static383.anIntArray579[local1293];
										} else {
											if (local956 != null) {
												local956[local945] = local1043;
											}
											local968[local945] = arg3.method7267() ? local166.anInt4479 : local166.anInt4478;
											local971[local945] = local166.anInt4484;
											local965[local945] = local989;
										}
										local945++;
									}
									local943++;
								}
								if (!this.aBoolean310 && arg4 == 0) {
									Static45.method918(local35, local55, local166.anInt4476, local166.anInt4474 * 8, local166.anInt4482);
								}
								if (local98 != 12 && local166.anInt4473 != -1 && local166.aBoolean311) {
									local87 = true;
								}
							} else if (local808) {
								local943 = Static251.anIntArray470[local98];
							} else if (local89) {
								local943 = Static215.anIntArray348[local98];
							} else {
								local943 = Static467.anIntArray740[local98];
							}
							if (local184 != null) {
								if (local144 == 0) {
									local144 = local120;
								}
								if (local136 == 0) {
									local136 = local120;
								}
								if (local128 == 0) {
									local128 = local120;
								}
								@Pc(1598) Class146 local1598 = this.aClass61_5.method1458(local120 - 1);
								@Pc(1606) Class146 local1606 = this.aClass61_5.method1458(local128 - 1);
								@Pc(1614) Class146 local1614 = this.aClass61_5.method1458(local136 - 1);
								@Pc(1622) Class146 local1622 = this.aClass61_5.method1458(local144 - 1);
								for (local1293 = 0; local1293 < local376; local1293++) {
									if (local92[-local104 & 0x3] && local810[0] == local943) {
										Static2.anIntArray563[0] = local832[local943];
										Static2.anIntArray563[1] = 1;
										Static2.anIntArray563[2] = local816[local943];
										Static2.anIntArray563[3] = 1;
										Static2.anIntArray563[4] = local820[local943];
										local1123 = 6;
										Static2.anIntArray563[5] = local816[local943];
									} else if (local92[2 - local104 & 0x3] && local943 == local810[2]) {
										Static2.anIntArray563[0] = local832[local943];
										Static2.anIntArray563[1] = 5;
										Static2.anIntArray563[2] = local816[local943];
										Static2.anIntArray563[3] = 5;
										Static2.anIntArray563[4] = local820[local943];
										Static2.anIntArray563[5] = local816[local943];
										local1123 = 6;
									} else if (local92[1 - local104 & 0x3] && local943 == local810[1]) {
										Static2.anIntArray563[0] = local832[local943];
										Static2.anIntArray563[1] = 3;
										Static2.anIntArray563[2] = local816[local943];
										Static2.anIntArray563[3] = 3;
										Static2.anIntArray563[4] = local820[local943];
										Static2.anIntArray563[5] = local816[local943];
										local1123 = 6;
									} else if (local92[3 - local104 & 0x3] && local943 == local810[3]) {
										Static2.anIntArray563[0] = local832[local943];
										Static2.anIntArray563[1] = 7;
										Static2.anIntArray563[2] = local816[local943];
										Static2.anIntArray563[3] = 7;
										Static2.anIntArray563[4] = local820[local943];
										local1123 = 6;
										Static2.anIntArray563[5] = local816[local943];
									} else {
										Static2.anIntArray563[0] = local832[local943];
										Static2.anIntArray563[1] = local820[local943];
										local1123 = 3;
										Static2.anIntArray563[2] = local816[local943];
									}
									for (local1298 = 0; local1298 < local1123; local1298++) {
										local1308 = Static2.anIntArray563[local1298];
										local1303 = local1308 - local104 * 2 & 0x7;
										local1313 = this.anIntArray435[local1308];
										local1378 = this.anIntArray436[local1308];
										@Pc(1892) int local1892;
										if (local104 == 1) {
											local1371 = local1378;
											local1892 = 512 - local1313;
										} else if (local104 == 2) {
											local1371 = 512 - local1313;
											local1892 = 512 - local1378;
										} else if (local104 == 3) {
											local1371 = 512 - local1378;
											local1892 = local1313;
										} else {
											local1371 = local1313;
											local1892 = local1378;
										}
										local959[local945] = local1371;
										local962[local945] = local1892;
										@Pc(1951) int local1951;
										@Pc(1957) int local1957;
										if (local978 != null && Static93.aBooleanArrayArray4[local98][local1308]) {
											local1951 = (local35 << 9) + local1371;
											local1957 = local1892 + (local55 << 9);
											local978[local945] = arg5.aa(local1951, local1957) - arg2.aa(local1951, local1957);
										}
										if (local987 != null) {
											if (arg5 != null && !Static93.aBooleanArrayArray4[local98][local1308]) {
												local1951 = local1371 + (local35 << 9);
												local1957 = (local55 << 9) + local1892;
												local987[local945] = arg2.aa(local1951, local1957) - arg5.aa(local1951, local1957);
											} else if (arg0 != null && !Static62.aBooleanArrayArray3[local98][local1308]) {
												local1951 = (local35 << 9) + local1371;
												local1957 = (local55 << 9) + local1892;
												local987[local945] = arg0.aa(local1951, local1957) - arg2.aa(local1951, local1957);
											}
										}
										if (local1308 < 8 && Static360.anIntArray647[local1303] >= 0) {
											if (local956 != null) {
												local956[local945] = Static403.anIntArray698[local1303];
											}
											local971[local945] = Static254.anIntArray515[local1303];
											local968[local945] = Static173.anIntArray290[local1303];
											local965[local945] = Static383.anIntArray579[local1303];
										} else {
											if (local89 && Static93.aBooleanArrayArray4[local98][local1308]) {
												local968[local945] = local991;
												local971[local945] = local993;
												local965[local945] = local989;
											} else if (local1371 == 0 && local1892 == 0) {
												local965[local945] = arg1[local35][local55];
												local968[local945] = local1598.anInt4198;
												local971[local945] = local1598.anInt4195;
											} else if (local1371 == 0 && local1892 == 512) {
												local965[local945] = arg1[local35][local73];
												local968[local945] = local1606.anInt4198;
												local971[local945] = local1606.anInt4195;
											} else if (local1371 == 512 && local1892 == 512) {
												local965[local945] = arg1[local53][local73];
												local968[local945] = local1614.anInt4198;
												local971[local945] = local1614.anInt4195;
											} else if (local1371 == 512 && local1892 == 0) {
												local965[local945] = arg1[local53][local55];
												local968[local945] = local1622.anInt4198;
												local971[local945] = local1622.anInt4195;
											} else {
												if (local1371 < 256) {
													if (local1892 >= 256) {
														local968[local945] = local1606.anInt4198;
														local971[local945] = local1606.anInt4195;
													} else {
														local968[local945] = local1598.anInt4198;
														local971[local945] = local1598.anInt4195;
													}
												} else if (local1892 < 256) {
													local968[local945] = local1622.anInt4198;
													local971[local945] = local1622.anInt4195;
												} else {
													local968[local945] = local1614.anInt4198;
													local971[local945] = local1614.anInt4195;
												}
												local1951 = Static388.method5885(arg1[local35][local55], local1371 << 7 >> 9, arg1[local53][local55]);
												local1957 = Static388.method5885(arg1[local35][local73], local1371 << 7 >> 9, arg1[local53][local73]);
												local965[local945] = Static388.method5885(local1951, local1892 << 7 >> 9, local1957);
											}
											if (local956 != null) {
												local956[local945] = local965[local945];
											}
										}
										local945++;
									}
									local943++;
								}
								if (local98 != 0 && local184.aBoolean301) {
									local87 = true;
								}
							}
							local1043 = arg2.ba(local35, local55);
							local1045 = arg2.ba(local53, local55);
							local1278 = arg2.ba(local53, local73);
							local1284 = arg2.ba(local35, local73);
							if (arg4 > 0) {
								@Pc(2374) boolean local2374 = true;
								if (local120 == 0 && local98 != 0) {
									local2374 = false;
								}
								if (local112 > 0 && local186 != null && !local186.aBoolean312) {
									local2374 = false;
								}
								if (local2374 && local1043 == local1045 && local1043 == local1278 && local1043 == local1284) {
									this.aByteArrayArrayArray12[arg4][local35][local55] = (byte) (this.aByteArrayArrayArray12[arg4][local35][local55] | 0x4);
								}
							}
							local1293 = 0;
							local1298 = 0;
							local1308 = 0;
							if (this.aBoolean310) {
								local1293 = Static342.method5173(local35, local55);
								local1298 = Static83.method1448(local35, local55);
								local1308 = Static219.method6543(local35, local55);
							}
							arg2.IA(local35, local55, local959, local978, local962, local987, local965, local956, local968, local971, local1293, local1298, local1308, local87);
							Static161.method2492(arg4, local35, local55);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I[[II)V")
	public final void method3871(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray5[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt4435 + 1; local12++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt4448 + 1; local24++) {
				local10[local12][local24] += arg0[local12][local24];
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!ge;II[Lclient!fd;B)V")
	public final void method3872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub6 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class91[] arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean310) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class91 local16 = arg5[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = arg4 + local18;
						@Pc(32) int local32 = local22 + arg3;
						if (local28 >= 0 && this.anInt4435 > local28 && local32 >= 0 && this.anInt4448 > local32) {
							local16.method2173(local32, local28);
						}
					}
				}
			}
		}
		local10 = arg0 + arg4;
		@Pc(83) int local83 = arg3 + arg1;
		for (local18 = 0; local18 < this.anInt4443; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method3861(arg2, false, local18, 0, 0, local83 + local28, 0, local22 + arg4, arg3 + local28, local22 + local10);
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!qa;Lclient!sa;Lclient!sa;)V")
	public final void method3873(@OriginalArg(1) Class122 arg0, @OriginalArg(2) Class205 arg1, @OriginalArg(3) Class205 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt4435][this.anInt4448];
		if (Static321.anIntArray589 == null || this.anInt4448 != Static321.anIntArray589.length) {
			Static349.anIntArray635 = new int[this.anInt4448];
			Static158.anIntArray278 = new int[this.anInt4448];
			Static169.anIntArray288 = new int[this.anInt4448];
			Static321.anIntArray589 = new int[this.anInt4448];
			Static468.anIntArray741 = new int[this.anInt4448];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt4443; local44++) {
			for (local48 = 0; local48 < this.anInt4448; local48++) {
				Static321.anIntArray589[local48] = 0;
				Static468.anIntArray741[local48] = 0;
				Static158.anIntArray278[local48] = 0;
				Static349.anIntArray635[local48] = 0;
				Static169.anIntArray288[local48] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt4435; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(174) int local174;
				for (@Pc(81) int local81 = 0; local81 < this.anInt4448; local81++) {
					local87 = local77 + 5;
					@Pc(154) int local154;
					if (this.anInt4435 > local87) {
						local106 = this.aByteArrayArrayArray13[local44][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(118) Class146 local118 = this.aClass61_5.method1458(local106 - 1);
							Static321.anIntArray589[local81] += local118.anInt4196;
							Static468.anIntArray741[local81] += local118.anInt4201;
							Static158.anIntArray278[local81] += local118.anInt4204;
							Static349.anIntArray635[local81] += local118.anInt4199;
							local154 = Static169.anIntArray288[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local174 = this.aByteArrayArrayArray13[local44][local106][local81] & 0xFF;
						if (local174 > 0) {
							@Pc(186) Class146 local186 = this.aClass61_5.method1458(local174 - 1);
							Static321.anIntArray589[local81] -= local186.anInt4196;
							Static468.anIntArray741[local81] -= local186.anInt4201;
							Static158.anIntArray278[local81] -= local186.anInt4204;
							Static349.anIntArray635[local81] -= local186.anInt4199;
							local154 = Static169.anIntArray288[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local174 = 0;
					@Pc(244) int local244 = 0;
					@Pc(246) int local246 = 0;
					for (@Pc(248) int local248 = -5; local248 < this.anInt4448; local248++) {
						@Pc(254) int local254 = local248 + 5;
						if (local254 < this.anInt4448) {
							local87 += Static321.anIntArray589[local254];
							local174 += Static158.anIntArray278[local254];
							local244 += Static349.anIntArray635[local254];
							local106 += Static468.anIntArray741[local254];
							local246 += Static169.anIntArray288[local254];
						}
						@Pc(292) int local292 = local248 - 5;
						if (local292 >= 0) {
							local174 -= Static158.anIntArray278[local292];
							local244 -= Static349.anIntArray635[local292];
							local106 -= Static468.anIntArray741[local292];
							local87 -= Static321.anIntArray589[local292];
							local246 -= Static169.anIntArray288[local292];
						}
						if (local248 >= 0 && local244 > 0 && local246 > 0) {
							local11[local77][local248] = Static318.method4963(local106 / local246, local174 / local246, local87 * 256 / local244);
						}
					}
				}
			}
			if (Static469.aBoolean633) {
				this.method3870(local44 == 0 ? arg2 : null, local11, Static544.aClass205Array3[local44], arg0, local44, local44 == 0 ? arg1 : null);
			} else {
				this.method3864(local44 == 0 ? arg2 : null, local44 == 0 ? arg1 : null, Static544.aClass205Array3[local44], arg0, local44, local11);
			}
			this.aByteArrayArrayArray13[local44] = null;
			this.aByteArrayArrayArray9[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray10[local44] = null;
		}
		if (!this.aBoolean310) {
			if (Static212.anInt4112 != 0) {
				Static496.method6744();
			}
			if (Static521.aBoolean617) {
				Static200.method3439();
			}
		}
		for (local48 = 0; local48 < this.anInt4443; local48++) {
			Static544.aClass205Array3[local48].N();
		}
	}
}
