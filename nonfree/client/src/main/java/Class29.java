import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public class Class29 {

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
	private final int[] anIntArray220 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!bk", name = "F", descriptor = "[I")
	private final int[] anIntArray222 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
	public final int anInt2050;

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "Z")
	public final boolean aBoolean128;

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
	protected final int anInt2062;

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "Lclient!uo;")
	private final Class251 aClass251_2;

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Lclient!ot;")
	private final Class191 aClass191_2;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
	protected final int anInt2055;

	@OriginalMember(owner = "client!bk", name = "E", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!bk", name = "G", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!bk", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!bk", name = "D", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(IIIZLclient!uo;Lclient!ot;)V")
	protected Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class251 arg4, @OriginalArg(5) Class191 arg5) {
		this.anInt2050 = arg0;
		this.aBoolean128 = arg3;
		this.anInt2062 = arg2;
		this.aClass251_2 = arg4;
		this.aClass191_2 = arg5;
		this.anInt2055 = arg1;
		this.aByteArrayArrayArray12 = new byte[this.anInt2050][this.anInt2055][this.anInt2062];
		this.aByteArrayArrayArray8 = new byte[this.anInt2050][this.anInt2055 + 1][this.anInt2062 + 1];
		this.anIntArrayArrayArray3 = new int[this.anInt2050][this.anInt2055 + 1][this.anInt2062 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt2050][this.anInt2055][this.anInt2062];
		this.aByteArrayArrayArray9 = new byte[this.anInt2050][this.anInt2055][this.anInt2062];
		this.aByteArrayArrayArray11 = new byte[this.anInt2050][this.anInt2055][this.anInt2062];
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V")
	private void method1533(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(4) int local4;
		for (@Pc(1) int local1 = arg0; local1 < arg0 + 64; local1++) {
			for (local4 = arg1; local4 < arg1 + 64; local4++) {
				if (local4 >= 0 && this.anInt2055 > local4 && local1 >= 0 && local1 < this.anInt2062) {
					this.anIntArrayArrayArray3[arg2][local4][local1] = arg2 > 0 ? this.anIntArrayArrayArray3[arg2 - 1][local4][local1] - 240 : 0;
				}
			}
		}
		if (arg1 > 0 && this.anInt2055 > arg1) {
			for (local4 = arg0 + 1; local4 < arg0 + 64; local4++) {
				if (local4 >= 0 && this.anInt2062 > local4) {
					this.anIntArrayArrayArray3[arg2][arg1][local4] = this.anIntArrayArrayArray3[arg2][arg1 - 1][local4];
				}
			}
		}
		if (arg0 > 0 && this.anInt2062 > arg0) {
			for (local4 = arg1 + 1; local4 < arg1 + 64; local4++) {
				if (local4 >= 0 && this.anInt2055 > local4) {
					this.anIntArrayArrayArray3[arg2][local4][arg0] = this.anIntArrayArrayArray3[arg2][local4][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || arg1 >= this.anInt2055 || arg0 >= this.anInt2062) {
			return;
		}
		if (arg2 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray3[arg2 - 1][arg1 - 1][arg0] != this.anIntArrayArrayArray3[arg2][arg1 - 1][arg0]) {
				this.anIntArrayArrayArray3[arg2][arg1][arg0] = this.anIntArrayArrayArray3[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray3[arg2 - 1][arg1][arg0 - 1] != this.anIntArrayArrayArray3[arg2][arg1][arg0 - 1]) {
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

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ya;Lclient!za;ILclient!ya;)V")
	public final void method1534(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(3) Class96 arg2) {
		@Pc(9) int[][] local9 = new int[this.anInt2055][this.anInt2062];
		if (Static125.anIntArray290 == null || Static125.anIntArray290.length != this.anInt2062) {
			Static459.anIntArray752 = new int[this.anInt2062];
			Static11.anIntArray11 = new int[this.anInt2062];
			Static44.anIntArray557 = new int[this.anInt2062];
			Static125.anIntArray290 = new int[this.anInt2062];
			Static332.anIntArray599 = new int[this.anInt2062];
		}
		@Pc(41) int local41;
		for (@Pc(38) int local38 = 0; local38 < this.anInt2050; local38++) {
			for (local41 = 0; local41 < this.anInt2062; local41++) {
				Static125.anIntArray290[local41] = 0;
				Static459.anIntArray752[local41] = 0;
				Static44.anIntArray557[local41] = 0;
				Static11.anIntArray11[local41] = 0;
				Static332.anIntArray599[local41] = 0;
			}
			for (@Pc(73) int local73 = -5; local73 < this.anInt2055; local73++) {
				@Pc(81) int local81;
				@Pc(96) int local96;
				@Pc(168) int local168;
				for (@Pc(76) int local76 = 0; local76 < this.anInt2062; local76++) {
					local81 = local73 + 5;
					@Pc(145) int local145;
					if (this.anInt2055 > local81) {
						local96 = this.aByteArrayArrayArray9[local38][local81][local76] & 0xFF;
						if (local96 > 0) {
							@Pc(109) Class217 local109 = this.aClass191_2.method4336(local96 - 1);
							Static125.anIntArray290[local76] += local109.anInt6518;
							Static459.anIntArray752[local76] += local109.anInt6516;
							Static44.anIntArray557[local76] += local109.anInt6522;
							Static11.anIntArray11[local76] += local109.anInt6521;
							local145 = Static332.anIntArray599[local76]++;
						}
					}
					local96 = local73 - 5;
					if (local96 >= 0) {
						local168 = this.aByteArrayArrayArray9[local38][local96][local76] & 0xFF;
						if (local168 > 0) {
							@Pc(181) Class217 local181 = this.aClass191_2.method4336(local168 - 1);
							Static125.anIntArray290[local76] -= local181.anInt6518;
							Static459.anIntArray752[local76] -= local181.anInt6516;
							Static44.anIntArray557[local76] -= local181.anInt6522;
							Static11.anIntArray11[local76] -= local181.anInt6521;
							local145 = Static332.anIntArray599[local76]--;
						}
					}
				}
				if (local73 >= 0) {
					local81 = 0;
					local96 = 0;
					local168 = 0;
					@Pc(235) int local235 = 0;
					@Pc(237) int local237 = 0;
					for (@Pc(239) int local239 = -5; local239 < this.anInt2062; local239++) {
						@Pc(244) int local244 = local239 + 5;
						if (this.anInt2062 > local244) {
							local168 += Static44.anIntArray557[local244];
							local96 += Static459.anIntArray752[local244];
							local235 += Static11.anIntArray11[local244];
							local81 += Static125.anIntArray290[local244];
							local237 += Static332.anIntArray599[local244];
						}
						@Pc(286) int local286 = local239 - 5;
						if (local286 >= 0) {
							local96 -= Static459.anIntArray752[local286];
							local168 -= Static44.anIntArray557[local286];
							local81 -= Static125.anIntArray290[local286];
							local237 -= Static332.anIntArray599[local286];
							local235 -= Static11.anIntArray11[local286];
						}
						if (local239 >= 0 && local235 > 0 && local237 > 0) {
							local9[local73][local239] = Static123.method1992(local81 * 256 / local235, local96 / local237, local168 / local237);
						}
					}
				}
			}
			if (Static331.aBoolean383) {
				this.method1546(Static396.aClass96Array5[local38], arg1, local9, local38 == 0 ? arg0 : null, local38 == 0 ? arg2 : null, local38);
			} else {
				this.method1547(arg1, local38 == 0 ? arg0 : null, local9, local38, Static396.aClass96Array5[local38], local38 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray9[local38] = null;
			this.aByteArrayArrayArray12[local38] = null;
			this.aByteArrayArrayArray10[local38] = null;
			this.aByteArrayArrayArray11[local38] = null;
		}
		if (!this.aBoolean128) {
			if (Static193.anInt4033 != 0) {
				Static351.method4973();
			}
			if (Static343.aBoolean400) {
				Static63.method1235();
			}
		}
		for (local41 = 0; local41 < this.anInt2050; local41++) {
			Static396.aClass96Array5[local41].aa();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIZII)V")
	public final void method1538(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2050; local1++) {
			this.method1533(arg0, arg1, local1);
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([Lclient!ir;Lclient!za;[[[II)V")
	public final void method1539(@OriginalArg(0) Class120[] arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int[][][] arg2) {
		@Pc(13) int local13;
		@Pc(16) int local16;
		@Pc(19) int local19;
		if (!this.aBoolean128) {
			for (local13 = 0; local13 < 4; local13++) {
				for (local16 = 0; local16 < this.anInt2055; local16++) {
					for (local19 = 0; local19 < this.anInt2062; local19++) {
						if ((Static110.aByteArrayArrayArray20[local13][local16][local19] & 0x1) != 0) {
							@Pc(35) int local35 = local13;
							if ((Static110.aByteArrayArrayArray20[1][local16][local19] & 0x2) != 0) {
								local35 = local13 - 1;
							}
							if (local35 >= 0) {
								arg0[local35].method3038(local19, local16);
							}
						}
					}
				}
			}
		}
		for (local13 = 0; local13 < this.anInt2050; local13++) {
			local16 = 0;
			local19 = 0;
			if (!this.aBoolean128) {
				if (Static343.aBoolean400) {
					local16 = 2;
				}
				if (Static381.aBoolean481) {
					local19 = 8;
				}
				if (Static193.anInt4033 != 0) {
					local16 |= 0x1;
					if (Static446.aBoolean509 | local13 == 0) {
						local19 |= 0x10;
					}
				}
			}
			if (Static343.aBoolean400) {
				local19 |= 0x7;
			}
			if (!Static190.aBoolean245) {
				local19 |= 0x20;
			}
			@Pc(150) int[][] local150 = arg2 == null || local13 >= arg2.length ? this.anIntArrayArrayArray3[local13] : arg2[local13];
			Static437.method5873(local13, arg1.method5979(this.anInt2055, this.anInt2062, this.anIntArrayArrayArray3[local13], local150, local16, local19));
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IILclient!ia;III[Lclient!ir;III)V")
	public final void method1540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class120[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = (arg0 & 0x7) * 8;
		@Pc(18) int local18;
		@Pc(47) int local47;
		if (!this.aBoolean128) {
			@Pc(16) Class120 local16 = arg5[arg8];
			for (local18 = 0; local18 < 8; local18++) {
				for (@Pc(21) int local21 = 0; local21 < 8; local21++) {
					@Pc(34) int local34 = Static102.method1725(local21 & 0x7, arg7, local18 & 0x7) + arg6;
					local47 = arg3 + Static446.method6043(arg7, local18 & 0x7, local21 & 0x7);
					if (local34 > 0 && local34 < this.anInt2055 - 1 && local47 > 0 && local47 < this.anInt2062 - 1) {
						local16.method3043(local34, local47);
					}
				}
			}
		}
		@Pc(84) int local84 = (arg4 & 0x7) * 8;
		@Pc(90) int local90 = (arg0 & 0xFFFFFFF8) << 3;
		local18 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(98) byte local98 = 0;
		@Pc(100) byte local100 = 0;
		if (arg7 == 1) {
			local100 = 1;
		} else if (arg7 == 2) {
			local98 = 1;
			local100 = 1;
		} else if (arg7 == 3) {
			local98 = 1;
		}
		for (local47 = 0; local47 < this.anInt2050; local47++) {
			for (@Pc(128) int local128 = 0; local128 < 64; local128++) {
				for (@Pc(131) int local131 = 0; local131 < 64; local131++) {
					if (arg1 == local47 && local9 <= local128 && local128 <= local9 + 8 && local84 <= local131 && local131 <= local84 + 8) {
						@Pc(200) int local200;
						@Pc(208) int local208;
						if (local128 == local9 + 8 || local84 + 8 == local131) {
							if (arg7 == 0) {
								local200 = arg6 + local128 - local9;
								local208 = local131 + arg3 - local84;
							} else if (arg7 == 1) {
								local208 = local9 + arg3 + 8 - local128;
								local200 = local131 + arg6 - local84;
							} else if (arg7 == 2) {
								local208 = arg3 + local84 + 8 - local131;
								local200 = local9 + arg6 + 8 - local128;
							} else {
								local208 = local128 + arg3 - local9;
								local200 = local84 + arg6 + 8 - local131;
							}
							this.method1544(local208, arg8, 0, local128 + local90, local200, arg2, true, local18 + local131, 0, 0);
						} else {
							local200 = arg6 + Static102.method1725(local131 & 0x7, arg7, local128 & 0x7);
							local208 = Static446.method6043(arg7, local128 & 0x7, local131 & 0x7) + arg3;
							this.method1544(local208, arg8, local100, local90 + local128, local200, arg2, false, local131 + local18, local98, arg7);
						}
						if (local128 == 63 || local131 == 63) {
							@Pc(338) byte local338 = 1;
							if (local128 == 63 && local131 == 63) {
								local338 = 3;
							}
							for (@Pc(350) int local350 = 0; local350 < local338; local350++) {
								@Pc(353) int local353 = local128;
								@Pc(355) int local355 = local131;
								if (local350 == 0) {
									local353 = local128 == 63 ? 64 : local128;
									local355 = local131 == 63 ? 64 : local131;
								} else if (local350 == 1) {
									local353 = 64;
								} else if (local350 == 2) {
									local355 = 64;
								}
								@Pc(395) int local395;
								@Pc(402) int local402;
								if (arg7 == 0) {
									local395 = local353 + arg6 - local9;
									local402 = local355 + arg3 - local84;
								} else if (arg7 == 1) {
									local395 = arg6 + local355 - local84;
									local402 = arg3 + local9 + 8 - local353;
								} else if (arg7 == 2) {
									local395 = arg6 + local9 + 8 - local353;
									local402 = local84 + arg3 + 8 - local355;
								} else {
									local402 = arg3 + local353 - local9;
									local395 = local84 + arg6 + 8 - local355;
								}
								if (local395 >= 0 && this.anInt2055 > local395 && local402 >= 0 && this.anInt2062 > local402) {
									this.anIntArrayArrayArray3[arg8][local395][local402] = this.anIntArrayArrayArray3[arg8][local98 + local200][local208 + local100];
								}
							}
						}
					} else {
						this.method1544(-1, 0, 0, 0, -1, arg2, false, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!rl;[[BII[ZLclient!za;Lclient!fv;IIII[[BB[[B)V")
	private void method1541(@OriginalArg(0) Class217 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4, @OriginalArg(5) Class106 arg5, @OriginalArg(6) Class92 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte[][] arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(22) boolean[] local22 = arg6 != null && arg6.aBoolean177 ? Static110.aBooleanArrayArray9[arg10] : Static327.aBooleanArrayArray7[arg10];
		@Pc(38) int local38;
		@Pc(51) Class92 local51;
		@Pc(69) byte local69;
		@Pc(85) int local85;
		@Pc(90) int local90;
		if (arg8 > 0) {
			if (arg3 > 0) {
				local38 = arg1[arg3 - 1][arg8 - 1] & 0xFF;
				if (local38 > 0) {
					local51 = this.aClass251_2.method5608(local38 - 1);
					if (local51.anInt2775 != -1 && local51.aBoolean177) {
						local69 = arg12[arg3 - 1][arg8 - 1];
						local85 = arg11[arg3 - 1][arg8 - 1] * 2 + 4 & 0x7;
						local90 = Static413.method5603(local51, arg5);
						if (Static421.aBooleanArrayArray10[local69][local85]) {
							Static173.anIntArray366[0] = local51.anInt2775;
							Static42.anIntArray108[0] = local90;
							Static97.anIntArray257[0] = arg5.method5975() ? local51.anInt2784 : local51.anInt2780;
							Static418.anIntArray705[0] = local51.anInt2782;
							Static140.anIntArray317[0] = local51.anInt2787;
							Static97.anIntArray258[0] = 256;
						}
					}
				}
			}
			if (arg2 - 1 > arg3) {
				local38 = arg1[arg3 + 1][arg8 - 1] & 0xFF;
				if (local38 > 0) {
					local51 = this.aClass251_2.method5608(local38 - 1);
					if (local51.anInt2775 != -1 && local51.aBoolean177) {
						local69 = arg12[arg3 + 1][arg8 - 1];
						local85 = arg11[arg3 + 1][arg8 - 1] * 2 + 6 & 0x7;
						local90 = Static413.method5603(local51, arg5);
						if (Static421.aBooleanArrayArray10[local69][local85]) {
							Static173.anIntArray366[2] = local51.anInt2775;
							Static42.anIntArray108[2] = local90;
							Static97.anIntArray257[2] = arg5.method5975() ? local51.anInt2784 : local51.anInt2780;
							Static418.anIntArray705[2] = local51.anInt2782;
							Static140.anIntArray317[2] = local51.anInt2787;
							Static97.anIntArray258[2] = 512;
						}
					}
				}
			}
		}
		if (arg7 - 1 > arg8) {
			if (arg3 > 0) {
				local38 = arg1[arg3 - 1][arg8 + 1] & 0xFF;
				if (local38 > 0) {
					local51 = this.aClass251_2.method5608(local38 - 1);
					if (local51.anInt2775 != -1 && local51.aBoolean177) {
						local69 = arg12[arg3 - 1][arg8 + 1];
						local85 = arg11[arg3 - 1][arg8 + 1] * 2 + 2 & 0x7;
						local90 = Static413.method5603(local51, arg5);
						if (Static421.aBooleanArrayArray10[local69][local85]) {
							Static173.anIntArray366[6] = local51.anInt2775;
							Static42.anIntArray108[6] = local90;
							Static97.anIntArray257[6] = arg5.method5975() ? local51.anInt2784 : local51.anInt2780;
							Static418.anIntArray705[6] = local51.anInt2782;
							Static140.anIntArray317[6] = local51.anInt2787;
							Static97.anIntArray258[6] = 64;
						}
					}
				}
			}
			if (arg3 < arg2 - 1) {
				local38 = arg1[arg3 + 1][arg8 + 1] & 0xFF;
				if (local38 > 0) {
					local51 = this.aClass251_2.method5608(local38 - 1);
					if (local51.anInt2775 != -1 && local51.aBoolean177) {
						local69 = arg12[arg3 + 1][arg8 + 1];
						local85 = --(arg11[arg3 + 1][arg8 + 1] * 2) & 0x7;
						local90 = Static413.method5603(local51, arg5);
						if (Static421.aBooleanArrayArray10[local69][local85]) {
							Static173.anIntArray366[4] = local51.anInt2775;
							Static42.anIntArray108[4] = local90;
							Static97.anIntArray257[4] = arg5.method5975() ? local51.anInt2784 : local51.anInt2780;
							Static418.anIntArray705[4] = local51.anInt2782;
							Static140.anIntArray317[4] = local51.anInt2787;
							Static97.anIntArray258[4] = 128;
						}
					}
				}
			}
		}
		@Pc(535) int local535;
		@Pc(540) int local540;
		@Pc(542) int local542;
		@Pc(524) byte local524;
		if (arg8 > 0) {
			local38 = arg1[arg3][arg8 - 1] & 0xFF;
			if (local38 > 0) {
				local51 = this.aClass251_2.method5608(local38 - 1);
				if (local51.anInt2775 != -1) {
					local69 = arg12[arg3][arg8 - 1];
					local524 = arg11[arg3][arg8 - 1];
					if (local51.aBoolean177) {
						local90 = 2;
						local535 = local524 * 2 + 4;
						local540 = Static413.method5603(local51, arg5);
						for (local542 = 0; local542 < 3; local542++) {
							local90 &= 0x7;
							local535 &= 0x7;
							if (Static421.aBooleanArrayArray10[local69][local535] && Static140.anIntArray317[local90] <= local51.anInt2787) {
								Static173.anIntArray366[local90] = local51.anInt2775;
								Static42.anIntArray108[local90] = local540;
								Static97.anIntArray257[local90] = arg5.method5975() ? local51.anInt2784 : local51.anInt2780;
								Static418.anIntArray705[local90] = local51.anInt2782;
								if (Static140.anIntArray317[local90] == local51.anInt2787) {
									Static97.anIntArray258[local90] |= 0x20;
								} else {
									Static97.anIntArray258[local90] = 32;
								}
								Static140.anIntArray317[local90] = local51.anInt2787;
							}
							local535++;
							local90--;
						}
						if (!local22[arg9 & 0x3]) {
							arg4[0] = Static110.aBooleanArrayArray9[local69][local524 + 2 & 0x3];
						}
					} else if (!local22[arg9 & 0x3]) {
						arg4[0] = Static327.aBooleanArrayArray7[local69][local524 + 2 & 0x3];
					}
				}
			}
		}
		if (arg7 - 1 > arg8) {
			local38 = arg1[arg3][arg8 + 1] & 0xFF;
			if (local38 > 0) {
				local51 = this.aClass251_2.method5608(local38 - 1);
				if (local51.anInt2775 != -1) {
					local69 = arg12[arg3][arg8 + 1];
					local524 = arg11[arg3][arg8 + 1];
					if (local51.aBoolean177) {
						local90 = 4;
						local535 = local524 * 2 + 2;
						local540 = Static413.method5603(local51, arg5);
						for (local542 = 0; local542 < 3; local542++) {
							local90 &= 0x7;
							local535 &= 0x7;
							if (Static421.aBooleanArrayArray10[local69][local535] && local51.anInt2787 >= Static140.anIntArray317[local90]) {
								Static173.anIntArray366[local90] = local51.anInt2775;
								Static42.anIntArray108[local90] = local540;
								Static97.anIntArray257[local90] = arg5.method5975() ? local51.anInt2784 : local51.anInt2780;
								Static418.anIntArray705[local90] = local51.anInt2782;
								if (Static140.anIntArray317[local90] == local51.anInt2787) {
									Static97.anIntArray258[local90] |= 0x10;
								} else {
									Static97.anIntArray258[local90] = 16;
								}
								Static140.anIntArray317[local90] = local51.anInt2787;
							}
							local535--;
							local90++;
						}
						if (!local22[arg9 + 2 & 0x3]) {
							arg4[2] = Static110.aBooleanArrayArray9[local69][local524 & 0x3];
						}
					} else if (!local22[arg9 + 2 & 0x3]) {
						arg4[2] = Static327.aBooleanArrayArray7[local69][--local524 & 0x3];
					}
				}
			}
		}
		if (arg3 > 0) {
			local38 = arg1[arg3 - 1][arg8] & 0xFF;
			if (local38 > 0) {
				local51 = this.aClass251_2.method5608(local38 - 1);
				if (local51.anInt2775 != -1) {
					local69 = arg12[arg3 - 1][arg8];
					local524 = arg11[arg3 - 1][arg8];
					if (local51.aBoolean177) {
						local90 = 6;
						local535 = local524 * 2 + 4;
						local540 = Static413.method5603(local51, arg5);
						for (local542 = 0; local542 < 3; local542++) {
							local535 &= 0x7;
							local90 &= 0x7;
							if (Static421.aBooleanArrayArray10[local69][local535] && local51.anInt2787 >= Static140.anIntArray317[local90]) {
								Static173.anIntArray366[local90] = local51.anInt2775;
								Static42.anIntArray108[local90] = local540;
								Static97.anIntArray257[local90] = arg5.method5975() ? local51.anInt2784 : local51.anInt2780;
								Static418.anIntArray705[local90] = local51.anInt2782;
								if (local51.anInt2787 == Static140.anIntArray317[local90]) {
									Static97.anIntArray258[local90] |= 0x8;
								} else {
									Static97.anIntArray258[local90] = 8;
								}
								Static140.anIntArray317[local90] = local51.anInt2787;
							}
							local535--;
							local90++;
						}
						if (!local22[arg9 + 3 & 0x3]) {
							arg4[3] = Static110.aBooleanArrayArray9[local69][local524 + 1 & 0x3];
						}
					} else if (!local22[arg9 + 3 & 0x3]) {
						arg4[3] = Static327.aBooleanArrayArray7[local69][local524 + 1 & 0x3];
					}
				}
			}
		}
		if (arg2 - 1 > arg3) {
			local38 = arg1[arg3 + 1][arg8] & 0xFF;
			if (local38 > 0) {
				local51 = this.aClass251_2.method5608(local38 - 1);
				if (local51.anInt2775 != -1) {
					local69 = arg12[arg3 + 1][arg8];
					local524 = arg11[arg3 + 1][arg8];
					if (local51.aBoolean177) {
						local90 = 4;
						local535 = local524 * 2 + 6;
						local540 = Static413.method5603(local51, arg5);
						for (local542 = 0; local542 < 3; local542++) {
							local535 &= 0x7;
							local90 &= 0x7;
							if (Static421.aBooleanArrayArray10[local69][local535] && Static140.anIntArray317[local90] <= local51.anInt2787) {
								Static173.anIntArray366[local90] = local51.anInt2775;
								Static42.anIntArray108[local90] = local540;
								Static97.anIntArray257[local90] = arg5.method5975() ? local51.anInt2784 : local51.anInt2780;
								Static418.anIntArray705[local90] = local51.anInt2782;
								if (Static140.anIntArray317[local90] == local51.anInt2787) {
									Static97.anIntArray258[local90] |= 0x4;
								} else {
									Static97.anIntArray258[local90] = 4;
								}
								Static140.anIntArray317[local90] = local51.anInt2787;
							}
							local90--;
							local535++;
						}
						if (!local22[arg9 + 1 & 0x3]) {
							arg4[1] = Static110.aBooleanArrayArray9[local69][local524 + 3 & 0x3];
						}
					} else if (!local22[arg9 + 1 & 0x3]) {
						arg4[1] = Static327.aBooleanArrayArray7[local69][local524 + 3 & 0x3];
					}
				}
			}
		}
		if (arg6 == null) {
			return;
		}
		local38 = Static413.method5603(arg6, arg5);
		if (!arg6.aBoolean177) {
			return;
		}
		for (@Pc(1248) int local1248 = 0; local1248 < 8; local1248++) {
			@Pc(1258) int local1258 = local1248 - arg9 * 2 & 0x7;
			if (Static421.aBooleanArrayArray10[arg10][local1248] && arg6.anInt2787 >= Static140.anIntArray317[local1258]) {
				Static173.anIntArray366[local1258] = arg6.anInt2775;
				Static42.anIntArray108[local1258] = local38;
				Static97.anIntArray257[local1258] = arg5.method5975() ? arg6.anInt2784 : arg6.anInt2780;
				Static418.anIntArray705[local1258] = arg6.anInt2782;
				if (arg6.anInt2787 == Static140.anIntArray317[local1258]) {
					Static97.anIntArray258[local1258] |= 0x2;
				} else {
					Static97.anIntArray258[local1258] = 2;
				}
				Static140.anIntArray317[local1258] = arg6.anInt2787;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI[Lclient!ir;ILclient!ia;II)V")
	public final void method1542(@OriginalArg(1) int arg0, @OriginalArg(2) Class120[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(4) int local4;
		@Pc(11) int local11;
		@Pc(14) int local14;
		@Pc(19) int local19;
		if (!this.aBoolean128) {
			for (local4 = 0; local4 < 4; local4++) {
				@Pc(9) Class120 local9 = arg1[local4];
				for (local11 = 0; local11 < 64; local11++) {
					for (local14 = 0; local14 < 64; local14++) {
						local19 = local11 + arg4;
						@Pc(23) int local23 = arg2 + local14;
						if (local19 >= 0 && local19 < this.anInt2055 && local23 >= 0 && this.anInt2062 > local23) {
							local9.method3043(local19, local23);
						}
					}
				}
			}
		}
		local4 = arg5 + arg4;
		@Pc(66) int local66 = arg0 + arg2;
		for (local11 = 0; local11 < this.anInt2050; local11++) {
			for (local14 = 0; local14 < 64; local14++) {
				for (local19 = 0; local19 < 64; local19++) {
					this.method1544(arg2 + local19, local11, 0, local14 + local4, arg4 + local14, arg3, false, local66 + local19, 0, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIILclient!ia;ZIII)V")
	private void method1544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub3 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg9 == 1) {
			arg2 = 1;
		} else if (arg9 == 2) {
			arg8 = 1;
			arg2 = 1;
		} else if (arg9 == 3) {
			arg8 = 1;
		}
		@Pc(57) int local57;
		if (arg4 < 0 || arg4 >= this.anInt2055 || arg0 < 0 || arg0 >= this.anInt2062) {
			while (true) {
				local57 = arg5.method1171();
				if (local57 == 0) {
					return;
				}
				if (local57 == 1) {
					arg5.method1171();
					return;
				}
				if (local57 <= 49) {
					arg5.method1171();
				}
			}
			return;
		}
		if (!this.aBoolean128 && !arg6) {
			Static110.aByteArrayArrayArray20[arg1][arg4][arg0] = 0;
		}
		while (true) {
			local57 = arg5.method1171();
			if (local57 == 0) {
				if (this.aBoolean128) {
					this.anIntArrayArrayArray3[0][arg8 + arg4][arg0 + arg2] = 0;
					return;
				} else if (arg1 == 0) {
					this.anIntArrayArrayArray3[0][arg4 + arg8][arg2 + arg0] = -Static45.method857(arg3 + 932731, 556238 - -arg7) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray3[arg1][arg8 + arg4][arg0 + arg2] = this.anIntArrayArrayArray3[arg1 - 1][arg8 + arg4][arg0 + arg2] - 240;
					return;
				}
			}
			if (local57 == 1) {
				@Pc(188) int local188 = arg5.method1171();
				if (!this.aBoolean128) {
					if (local188 == 1) {
						local188 = 0;
					}
					if (arg1 != 0) {
						this.anIntArrayArrayArray3[arg1][arg8 + arg4][arg2 + arg0] = this.anIntArrayArrayArray3[arg1 - 1][arg4 + arg8][arg0 + arg2] - (local188 * 8 << 0);
						return;
					}
					this.anIntArrayArrayArray3[0][arg4 + arg8][arg0 + arg2] = -local188 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray3[0][arg8 + arg4][arg0 + arg2] = local188 * 8 << 0;
				return;
			}
			if (local57 <= 49) {
				if (arg6) {
					arg5.method1171();
				} else {
					this.aByteArrayArrayArray12[arg1][arg4][arg0] = arg5.method1212();
					this.aByteArrayArrayArray10[arg1][arg4][arg0] = (byte) ((local57 - 2) / 4);
					this.aByteArrayArrayArray11[arg1][arg4][arg0] = (byte) (local57 + arg9 - 2 & 0x3);
				}
			} else if (local57 <= 81) {
				if (!this.aBoolean128 && !arg6) {
					Static110.aByteArrayArrayArray20[arg1][arg4][arg0] = (byte) (local57 - 49);
				}
			} else if (!arg6) {
				this.aByteArrayArrayArray9[arg1][arg4][arg0] = (byte) (local57 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB[[I)V")
	public final void method1545(@OriginalArg(2) int[][] arg0) {
		@Pc(8) int[][] local8 = this.anIntArrayArrayArray3[0];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2055 + 1; local10++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt2062 + 1; local13++) {
				local8[local10][local13] += arg0[local10][local13];
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ya;Lclient!za;[[IBLclient!ya;Lclient!ya;I)V")
	private void method1546(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) Class96 arg3, @OriginalArg(5) Class96 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) byte[][] local8 = this.aByteArrayArrayArray10[arg5];
		@Pc(18) byte[][] local18 = this.aByteArrayArrayArray11[arg5];
		@Pc(23) byte[][] local23 = this.aByteArrayArrayArray9[arg5];
		@Pc(28) byte[][] local28 = this.aByteArrayArrayArray12[arg5];
		for (@Pc(30) int local30 = 0; local30 < this.anInt2055; local30++) {
			@Pc(43) int local43 = this.anInt2055 - 1 > local30 ? local30 + 1 : local30;
			for (@Pc(45) int local45 = 0; local45 < this.anInt2062; local45++) {
				@Pc(58) int local58 = local45 >= this.anInt2062 - 1 ? local45 : local45 + 1;
				if (Static234.anInt4634 == -1 || Static318.method4536(arg5, local30, Static234.anInt4634, local45)) {
					@Pc(72) boolean local72 = false;
					@Pc(74) boolean local74 = false;
					@Pc(77) boolean[] local77 = new boolean[4];
					@Pc(83) int local83 = local8[local30][local45];
					@Pc(89) int local89 = local18[local30][local45];
					@Pc(97) int local97 = local28[local30][local45] & 0xFF;
					@Pc(105) int local105 = local23[local30][local45] & 0xFF;
					@Pc(113) int local113 = local23[local30][local58] & 0xFF;
					@Pc(121) int local121 = local23[local43][local58] & 0xFF;
					@Pc(129) int local129 = local23[local43][local45] & 0xFF;
					if (local97 != 0 || local105 != 0) {
						@Pc(154) Class92 local154 = local97 == 0 ? null : this.aClass251_2.method5608(local97 - 1);
						if (local83 == 0 && local154 == null) {
							local83 = 12;
						}
						@Pc(175) Class217 local175 = local105 == 0 ? null : this.aClass191_2.method4336(local105 - 1);
						@Pc(177) Class92 local177 = local154;
						if (local154 != null) {
							if (local154.anInt2775 == -1 && local154.anInt2778 == -1) {
								local177 = local154;
								local154 = null;
							} else if (local175 != null && local83 != 0) {
								local74 = local154.aBoolean177;
							}
						}
						@Pc(285) int local285;
						@Pc(300) int local300;
						@Pc(365) int local365;
						@Pc(375) int local375;
						if ((local83 == 0 || local83 == 12) && local30 > 0 && local45 > 0 && this.anInt2055 > local30 && local45 < this.anInt2062) {
							@Pc(247) int local247 = local105 == local23[local43][local58] ? 1 : -1;
							@Pc(262) int local262 = local23[local43][local45 - 1] == local105 ? 1 : -1;
							local285 = local23[local30 - 1][local45 - 1] == local105 ? 1 : -1;
							local300 = local23[local30 - 1][local58] == local105 ? 1 : -1;
							if (local105 == local23[local30][local45 - 1]) {
								local262++;
								local285++;
							} else {
								local262--;
								local285--;
							}
							if (local105 == local23[local43][local45]) {
								local262++;
								local247++;
							} else {
								local247--;
								local262--;
							}
							if (local23[local30][local58] == local105) {
								local247++;
								local300++;
							} else {
								local247--;
								local300--;
							}
							if (local105 == local23[local30 - 1][local45]) {
								local300++;
								local285++;
							} else {
								local285--;
								local300--;
							}
							local365 = local285 - local247;
							if (local365 < 0) {
								local365 = -local365;
							}
							local375 = local262 - local300;
							if (local375 < 0) {
								local375 = -local375;
							}
							if (local365 == local375) {
								local365 = arg0.ua(local30, local45) - arg0.ua(local43, local58);
								if (local365 < 0) {
									local365 = -local365;
								}
								local375 = arg0.ua(local43, local45) - arg0.ua(local30, local58);
								if (local375 < 0) {
									local375 = -local375;
								}
							}
							local89 = local375 > local365 ? 1 : 0;
						}
						for (local285 = 0; local285 < 13; local285++) {
							Static140.anIntArray317[local285] = -1;
							Static97.anIntArray258[local285] = 1;
						}
						@Pc(461) boolean[] local461 = local154 != null && local154.aBoolean177 ? Static110.aBooleanArrayArray9[local83] : Static327.aBooleanArrayArray7[local83];
						this.method1541(local175, local28, this.anInt2055, local30, local77, arg1, local154, this.anInt2062, local45, local89, local83, local18, local8);
						@Pc(494) boolean local494 = local154 != null && local154.anInt2778 != local154.anInt2775;
						if (!local494) {
							for (local300 = 0; local300 < 8; local300++) {
								if (Static140.anIntArray317[local300] >= 0 && Static42.anIntArray108[local300] != Static173.anIntArray366[local300]) {
									local494 = true;
									break;
								}
							}
						}
						if (!local461[local89 + 1 & 0x3]) {
							local77[1] = Static64.method1242(local77[1], (Static97.anIntArray258[2] & Static97.anIntArray258[4]) == 0);
						}
						if (!local461[local89 + 3 & 0x3]) {
							local77[3] = Static64.method1242(local77[3], (Static97.anIntArray258[6] & Static97.anIntArray258[0]) == 0);
						}
						if (!local461[local89 & 0x3]) {
							local77[0] = Static64.method1242(local77[0], (Static97.anIntArray258[0] & Static97.anIntArray258[2]) == 0);
						}
						if (!local461[local89 + 2 & 0x3]) {
							local77[2] = Static64.method1242(local77[2], (Static97.anIntArray258[4] & Static97.anIntArray258[6]) == 0);
						}
						if (!local74 && (local83 == 0 || local83 == 12)) {
							if (local77[0] && !local77[1] && !local77[2] && local77[3]) {
								local83 = local83 == 0 ? 13 : 14;
								local77[0] = local77[3] = false;
								local89 = 0;
							} else if (local77[0] && local77[1] && !local77[2] && !local77[3]) {
								local83 = local83 == 0 ? 13 : 14;
								local89 = 3;
								local77[0] = local77[1] = false;
							} else if (!local77[0] && local77[1] && local77[2] && !local77[3]) {
								local83 = local83 == 0 ? 13 : 14;
								local89 = 2;
								local77[1] = local77[2] = false;
							} else if (!local77[0] && !local77[1] && local77[2] && local77[3]) {
								local77[2] = local77[3] = false;
								local89 = 1;
								local83 = local83 == 0 ? 13 : 14;
							}
						}
						@Pc(796) boolean local796 = !local74 && !local77[0] && !local77[2] && !local77[1] && !local77[3];
						@Pc(798) int[] local798 = null;
						@Pc(810) int[] local810;
						@Pc(834) int[] local834;
						@Pc(830) int[] local830;
						if (local796) {
							local834 = Static219.anIntArrayArray36[local83];
							local830 = Static294.anIntArrayArray43[local83];
							local375 = local154 == null ? 0 : Static213.anIntArray386[local83];
							local365 = local175 == null ? 0 : Static77.anIntArray176[local83];
							local810 = Static251.anIntArrayArray40[local83];
						} else if (local74) {
							local798 = Static88.anIntArrayArray26[local83];
							local810 = Static24.anIntArrayArray9[local83];
							local365 = local175 == null ? 0 : Static200.anIntArray394[local83];
							local375 = local154 == null ? 0 : Static23.anIntArray40[local83];
							local830 = Static13.anIntArrayArray32[local83];
							local834 = Static314.anIntArrayArray46[local83];
						} else {
							local830 = Static409.anIntArrayArray60[local83];
							local365 = local175 == null ? 0 : Static374.anIntArray529[local83];
							local798 = Static365.anIntArrayArray54[local83];
							local810 = Static388.anIntArrayArray58[local83];
							local375 = local154 == null ? 0 : Static173.anIntArray368[local83];
							local834 = Static36.anIntArrayArray59[local83];
						}
						@Pc(900) int local900 = local365 + local375;
						if (local900 <= 0) {
							Static399.method508(arg5, local30, local45);
						} else {
							if (local77[0]) {
								local900++;
							}
							if (local77[2]) {
								local900++;
							}
							if (local77[1]) {
								local900++;
							}
							if (local77[3]) {
								local900++;
							}
							@Pc(932) int local932 = 0;
							@Pc(934) int local934 = 0;
							@Pc(938) int local938 = local900 * 3;
							@Pc(945) int[] local945 = local494 ? new int[local938] : null;
							@Pc(948) int[] local948 = new int[local938];
							@Pc(951) int[] local951 = new int[local938];
							@Pc(954) int[] local954 = new int[local938];
							@Pc(957) int[] local957 = new int[local938];
							@Pc(960) int[] local960 = new int[local938];
							@Pc(967) int[] local967 = arg4 == null ? null : new int[local938];
							@Pc(976) int[] local976 = arg4 == null && arg3 == null ? null : new int[local938];
							@Pc(978) int local978 = -1;
							@Pc(980) int local980 = -1;
							@Pc(982) int local982 = 256;
							@Pc(1120) byte local1120;
							@Pc(1029) int local1029;
							@Pc(1031) int local1031;
							@Pc(1267) int local1267;
							@Pc(1272) int local1272;
							@Pc(1281) int local1281;
							@Pc(1286) int local1286;
							@Pc(1303) int local1303;
							@Pc(1291) int local1291;
							@Pc(1301) int local1301;
							@Pc(1356) int local1356;
							@Pc(1363) int local1363;
							if (local154 != null) {
								local978 = local154.anInt2775;
								local980 = arg1.method5975() ? local154.anInt2784 : local154.anInt2780;
								local982 = local154.anInt2782;
								local1029 = Static413.method5603(local154, arg1);
								for (local1031 = 0; local1031 < local375; local1031++) {
									if (local77[-local89 & 0x3] && local932 == local798[0]) {
										Static28.anIntArray49[0] = local810[local932];
										Static28.anIntArray49[1] = 1;
										Static28.anIntArray49[2] = local830[local932];
										Static28.anIntArray49[3] = 1;
										Static28.anIntArray49[4] = local834[local932];
										Static28.anIntArray49[5] = local830[local932];
										local1120 = 6;
									} else if (local77[2 - local89 & 0x3] && local932 == local798[2]) {
										Static28.anIntArray49[0] = local810[local932];
										Static28.anIntArray49[1] = 5;
										Static28.anIntArray49[2] = local830[local932];
										Static28.anIntArray49[3] = 5;
										Static28.anIntArray49[4] = local834[local932];
										local1120 = 6;
										Static28.anIntArray49[5] = local830[local932];
									} else if (local77[1 - local89 & 0x3] && local932 == local798[1]) {
										Static28.anIntArray49[0] = local810[local932];
										Static28.anIntArray49[1] = 3;
										Static28.anIntArray49[2] = local830[local932];
										Static28.anIntArray49[3] = 3;
										Static28.anIntArray49[4] = local834[local932];
										Static28.anIntArray49[5] = local830[local932];
										local1120 = 6;
									} else if (local77[3 - local89 & 0x3] && local798[3] == local932) {
										Static28.anIntArray49[0] = local810[local932];
										Static28.anIntArray49[1] = 7;
										Static28.anIntArray49[2] = local830[local932];
										Static28.anIntArray49[3] = 7;
										Static28.anIntArray49[4] = local834[local932];
										Static28.anIntArray49[5] = local830[local932];
										local1120 = 6;
									} else {
										Static28.anIntArray49[0] = local810[local932];
										Static28.anIntArray49[1] = local834[local932];
										local1120 = 3;
										Static28.anIntArray49[2] = local830[local932];
									}
									local932++;
									for (local1267 = 0; local1267 < local1120; local1267++) {
										local1272 = Static28.anIntArray49[local1267];
										local1281 = local1272 - local89 * 2 & 0x7;
										local1286 = this.anIntArray222[local1272];
										local1291 = this.anIntArray220[local1272];
										if (local89 == 1) {
											local1301 = 128 - local1286;
											local1303 = local1291;
										} else if (local89 == 2) {
											local1303 = 128 - local1286;
											local1301 = 128 - local1291;
										} else if (local89 == 3) {
											local1303 = 128 - local1291;
											local1301 = local1286;
										} else {
											local1303 = local1286;
											local1301 = local1291;
										}
										local948[local934] = local1303;
										local951[local934] = local1301;
										if (local967 != null && Static421.aBooleanArrayArray10[local83][local1272]) {
											local1356 = local1303 + (local30 << 7);
											local1363 = (local45 << 7) + local1301;
											local967[local934] = arg4.ca(local1356, local1363) - arg0.ca(local1356, local1363);
										}
										if (local976 != null) {
											if (arg4 != null && !Static421.aBooleanArrayArray10[local83][local1272]) {
												local1356 = (local30 << 7) + local1303;
												local1363 = local1301 + (local45 << 7);
												local976[local934] = arg0.ca(local1356, local1363) - arg4.ca(local1356, local1363);
											} else if (arg3 != null && !Static269.aBooleanArrayArray6[local83][local1272]) {
												local1356 = (local30 << 7) + local1303;
												local1363 = (local45 << 7) + local1301;
												local976[local934] = arg3.ca(local1356, local1363) - arg0.ca(local1356, local1363);
											}
										}
										if (local1272 < 8 && Static140.anIntArray317[local1281] > local154.anInt2787) {
											if (local945 != null) {
												local945[local934] = Static42.anIntArray108[local1281];
											}
											local960[local934] = Static418.anIntArray705[local1281];
											local957[local934] = Static97.anIntArray257[local1281];
											local954[local934] = Static173.anIntArray366[local1281];
										} else {
											if (local945 != null) {
												local945[local934] = local1029;
											}
											local957[local934] = arg1.method5975() ? local154.anInt2784 : local154.anInt2780;
											local960[local934] = local154.anInt2782;
											local954[local934] = local978;
										}
										local934++;
									}
								}
								if (!this.aBoolean128 && arg5 == 0) {
									Static126.method2053(local30, local45, local154.anInt2781, local154.anInt2773 * 8, local154.anInt2785);
								}
								if (local83 != 12 && local154.anInt2775 != -1 && local154.aBoolean176) {
									local72 = true;
								}
							} else if (local796) {
								local932 = Static213.anIntArray386[local83];
							} else if (local74) {
								local932 = Static23.anIntArray40[local83];
							} else {
								local932 = Static173.anIntArray368[local83];
							}
							if (local175 != null) {
								if (local113 == 0) {
									local113 = local105;
								}
								if (local129 == 0) {
									local129 = local105;
								}
								if (local121 == 0) {
									local121 = local105;
								}
								@Pc(1582) Class217 local1582 = this.aClass191_2.method4336(local105 - 1);
								@Pc(1590) Class217 local1590 = this.aClass191_2.method4336(local113 - 1);
								@Pc(1598) Class217 local1598 = this.aClass191_2.method4336(local121 - 1);
								@Pc(1606) Class217 local1606 = this.aClass191_2.method4336(local129 - 1);
								for (local1281 = 0; local1281 < local365; local1281++) {
									if (local77[-local89 & 0x3] && local798[0] == local932) {
										Static28.anIntArray49[0] = local810[local932];
										Static28.anIntArray49[1] = 1;
										Static28.anIntArray49[2] = local830[local932];
										Static28.anIntArray49[3] = 1;
										Static28.anIntArray49[4] = local834[local932];
										local1120 = 6;
										Static28.anIntArray49[5] = local830[local932];
									} else if (local77[2 - local89 & 0x3] && local798[2] == local932) {
										Static28.anIntArray49[0] = local810[local932];
										Static28.anIntArray49[1] = 5;
										Static28.anIntArray49[2] = local830[local932];
										Static28.anIntArray49[3] = 5;
										Static28.anIntArray49[4] = local834[local932];
										Static28.anIntArray49[5] = local830[local932];
										local1120 = 6;
									} else if (local77[1 - local89 & 0x3] && local932 == local798[1]) {
										Static28.anIntArray49[0] = local810[local932];
										Static28.anIntArray49[1] = 3;
										Static28.anIntArray49[2] = local830[local932];
										Static28.anIntArray49[3] = 3;
										Static28.anIntArray49[4] = local834[local932];
										Static28.anIntArray49[5] = local830[local932];
										local1120 = 6;
									} else if (local77[3 - local89 & 0x3] && local798[3] == local932) {
										Static28.anIntArray49[0] = local810[local932];
										Static28.anIntArray49[1] = 7;
										Static28.anIntArray49[2] = local830[local932];
										Static28.anIntArray49[3] = 7;
										Static28.anIntArray49[4] = local834[local932];
										local1120 = 6;
										Static28.anIntArray49[5] = local830[local932];
									} else {
										Static28.anIntArray49[0] = local810[local932];
										Static28.anIntArray49[1] = local834[local932];
										Static28.anIntArray49[2] = local830[local932];
										local1120 = 3;
									}
									for (local1286 = 0; local1286 < local1120; local1286++) {
										local1303 = Static28.anIntArray49[local1286];
										local1291 = local1303 - local89 * 2 & 0x7;
										local1301 = this.anIntArray222[local1303];
										local1363 = this.anIntArray220[local1303];
										@Pc(1863) int local1863;
										if (local89 == 1) {
											local1863 = 128 - local1301;
											local1356 = local1363;
										} else if (local89 == 2) {
											local1356 = 128 - local1301;
											local1863 = 128 - local1363;
										} else if (local89 == 3) {
											local1863 = local1301;
											local1356 = 128 - local1363;
										} else {
											local1863 = local1363;
											local1356 = local1301;
										}
										local948[local934] = local1356;
										local951[local934] = local1863;
										@Pc(1921) int local1921;
										@Pc(1927) int local1927;
										if (local967 != null && Static421.aBooleanArrayArray10[local83][local1303]) {
											local1921 = local1356 + (local30 << 7);
											local1927 = local1863 + (local45 << 7);
											local967[local934] = arg4.ca(local1921, local1927) - arg0.ca(local1921, local1927);
										}
										if (local976 != null) {
											if (arg4 != null && !Static421.aBooleanArrayArray10[local83][local1303]) {
												local1921 = local1356 + (local30 << 7);
												local1927 = local1863 + (local45 << 7);
												local976[local934] = arg0.ca(local1921, local1927) - arg4.ca(local1921, local1927);
											} else if (arg3 != null && !Static269.aBooleanArrayArray6[local83][local1303]) {
												local1921 = (local30 << 7) + local1356;
												local1927 = local1863 + (local45 << 7);
												local976[local934] = arg3.ca(local1921, local1927) - arg0.ca(local1921, local1927);
											}
										}
										if (local1303 < 8 && Static140.anIntArray317[local1291] >= 0) {
											if (local945 != null) {
												local945[local934] = Static42.anIntArray108[local1291];
											}
											local960[local934] = Static418.anIntArray705[local1291];
											local957[local934] = Static97.anIntArray257[local1291];
											local954[local934] = Static173.anIntArray366[local1291];
										} else {
											if (local74 && Static421.aBooleanArrayArray10[local83][local1303]) {
												local957[local934] = local980;
												local960[local934] = local982;
												local954[local934] = local978;
											} else if (local1356 == 0 && local1863 == 0) {
												local954[local934] = arg2[local30][local45];
												local957[local934] = local1582.anInt6517;
												local960[local934] = local1582.anInt6523;
											} else if (local1356 == 0 && local1863 == 128) {
												local954[local934] = arg2[local30][local58];
												local957[local934] = local1590.anInt6517;
												local960[local934] = local1590.anInt6523;
											} else if (local1356 == 128 && local1863 == 128) {
												local954[local934] = arg2[local43][local58];
												local957[local934] = local1598.anInt6517;
												local960[local934] = local1598.anInt6523;
											} else if (local1356 == 128 && local1863 == 0) {
												local954[local934] = arg2[local43][local45];
												local957[local934] = local1606.anInt6517;
												local960[local934] = local1606.anInt6523;
											} else {
												if (local1356 < 64) {
													if (local1863 >= 64) {
														local957[local934] = local1590.anInt6517;
														local960[local934] = local1590.anInt6523;
													} else {
														local957[local934] = local1582.anInt6517;
														local960[local934] = local1582.anInt6523;
													}
												} else if (local1863 >= 64) {
													local957[local934] = local1598.anInt6517;
													local960[local934] = local1598.anInt6523;
												} else {
													local957[local934] = local1606.anInt6517;
													local960[local934] = local1606.anInt6523;
												}
												local1921 = Static243.method3645(local1356 << 7 >> 7, arg2[local30][local45], arg2[local43][local45]);
												local1927 = Static243.method3645(local1356 << 7 >> 7, arg2[local30][local58], arg2[local43][local58]);
												local954[local934] = Static243.method3645(local1863 << 7 >> 7, local1921, local1927);
											}
											if (local945 != null) {
												local945[local934] = local954[local934];
											}
										}
										local934++;
									}
									local932++;
								}
								if (local83 != 0 && local175.aBoolean410) {
									local72 = true;
								}
							}
							local1029 = arg0.ua(local30, local45);
							local1031 = arg0.ua(local43, local45);
							local1267 = arg0.ua(local43, local58);
							local1272 = arg0.ua(local30, local58);
							if (arg5 > 0) {
								@Pc(2324) boolean local2324 = true;
								if (local105 == 0 && local83 != 0) {
									local2324 = false;
								}
								if (local97 > 0 && local177 != null && !local177.aBoolean178) {
									local2324 = false;
								}
								if (local2324 && local1031 == local1029 && local1267 == local1029 && local1272 == local1029) {
									this.aByteArrayArrayArray8[arg5][local30][local45] = (byte) (this.aByteArrayArrayArray8[arg5][local30][local45] | 0x4);
								}
							}
							local1281 = 0;
							local1286 = 0;
							local1303 = 0;
							if (this.aBoolean128) {
								local1281 = Static172.method2873(local30, local45);
								local1286 = Static366.method5109(local30, local45);
								local1303 = Static64.method1239(local30, local45);
							}
							arg0.pa(local30, local45, local948, local967, local951, local976, local954, local945, local957, local960, local1281, local1286, local1303, local72);
							Static399.method508(arg5, local30, local45);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!za;Lclient!ya;[[IBILclient!ya;Lclient!ya;)V")
	private void method1547(@OriginalArg(0) Class106 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class96 arg4, @OriginalArg(6) Class96 arg5) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2055; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2062; local4++) {
				if (Static234.anInt4634 == -1 || Static318.method4536(arg3, local1, Static234.anInt4634, local4)) {
					@Pc(26) byte local26 = this.aByteArrayArrayArray10[arg3][local1][local4];
					@Pc(35) byte local35 = this.aByteArrayArrayArray11[arg3][local1][local4];
					@Pc(46) int local46 = this.aByteArrayArrayArray12[arg3][local1][local4] & 0xFF;
					@Pc(57) int local57 = this.aByteArrayArrayArray9[arg3][local1][local4] & 0xFF;
					@Pc(72) Class92 local72 = local46 == 0 ? null : this.aClass251_2.method5608(local46 - 1);
					@Pc(87) Class217 local87 = local57 == 0 ? null : this.aClass191_2.method4336(local57 - 1);
					@Pc(89) int local89 = 0;
					@Pc(91) int local91 = 0;
					if (local26 != 0) {
						local91 = local72 == null ? 0 : Static213.anIntArray386[local26];
						local89 = local87 == null ? 0 : Static77.anIntArray176[local26];
					} else if (local72 != null) {
						local91 = Static213.anIntArray386[local26];
					} else if (local87 != null) {
						local89 = Static213.anIntArray386[local26];
					}
					@Pc(130) int local130 = local89 + local91;
					@Pc(132) int local132 = 0;
					if (local130 != 0) {
						@Pc(140) int[] local140 = new int[local130];
						@Pc(143) int[] local143 = new int[local130];
						@Pc(146) int[] local146 = new int[local130];
						@Pc(149) int[] local149 = new int[local130];
						@Pc(151) boolean local151 = false;
						@Pc(168) int local168;
						@Pc(194) int local194;
						if (local72 == null || local72.anInt2775 == -1 && local72.anInt2778 == -1 && local72.anInt2784 == -1) {
							for (local168 = 0; local168 < local91; local168++) {
								local140[local132] = -1;
								local132++;
							}
						} else {
							local168 = arg0.method5975() ? local72.anInt2784 : local72.anInt2780;
							if (Static201.aBoolean261) {
								local168 = -1;
							}
							for (local194 = 0; local194 < local91; local194++) {
								local146[local132] = local168;
								local149[local132] = local72.anInt2782;
								if (local72.anInt2775 == -1) {
									local140[local132] = -1;
								} else {
									local140[local132] = local72.anInt2775;
								}
								if (local72.anInt2778 == -1) {
									local143[local132] = -1;
								} else {
									local143[local132] = local72.anInt2778;
									local151 = true;
								}
								local132++;
							}
							if (!this.aBoolean128 && arg3 == 0) {
								Static126.method2053(local1, local4, local72.anInt2781, local72.anInt2773 * 8, local72.anInt2785);
							}
						}
						if (!local151) {
							local143 = null;
						}
						if (local87 == null) {
							for (local168 = 0; local168 < local89; local168++) {
								local140[local132] = -1;
								local132++;
							}
						} else {
							local168 = local87.anInt6517;
							if (Static201.aBoolean261) {
								local168 = -1;
							}
							for (local194 = 0; local194 < local89; local194++) {
								local146[local132] = local168;
								local149[local132] = local87.anInt6523;
								local140[local132] = arg2[local1][local4];
								if (local143 != null) {
									local143[local132] = -1;
								}
								local132++;
							}
						}
						local168 = this.anIntArray222.length;
						@Pc(331) int[] local331 = new int[local168];
						@Pc(334) int[] local334 = new int[local168];
						@Pc(341) int[] local341 = arg5 == null ? null : new int[local168];
						@Pc(350) int[] local350 = arg5 == null && arg1 == null ? null : new int[local168];
						@Pc(358) int local358;
						@Pc(363) int local363;
						@Pc(438) int local438;
						@Pc(444) int local444;
						for (@Pc(352) int local352 = 0; local352 < local168; local352++) {
							local358 = this.anIntArray222[local352];
							local363 = this.anIntArray220[local352];
							if (local35 == 0) {
								local331[local352] = local358;
								local334[local352] = local363;
							} else if (local35 == 1) {
								local331[local352] = local363;
								local334[local352] = 128 - local358;
							} else if (local35 == 2) {
								local331[local352] = 128 - local358;
								local334[local352] = 128 - local363;
							} else if (local35 == 3) {
								local331[local352] = 128 - local363;
								local334[local352] = local358;
							}
							if (local341 != null && Static421.aBooleanArrayArray10[local26][local352]) {
								local438 = (local1 << 7) + local358;
								local444 = local358 + (local4 << 7);
								local341[local352] = arg5.ca(local438, local444) - arg4.ca(local438, local444);
							}
							if (local350 != null) {
								if (arg5 != null && !Static421.aBooleanArrayArray10[local26][local352]) {
									local438 = (local1 << 7) + local358;
									local444 = (local4 << 7) + local358;
									local350[local352] = arg4.ca(local438, local444) - arg5.ca(local438, local444);
								} else if (arg1 != null && !Static269.aBooleanArrayArray6[local26][local352]) {
									local438 = local358 + (local1 << 7);
									local444 = (local4 << 7) + local358;
									local350[local352] = arg1.ca(local438, local444) - arg4.ca(local438, local444);
								}
							}
						}
						local358 = arg4.ua(local1, local4);
						local363 = arg4.ua(local1 + 1, local4);
						local438 = arg4.ua(local1 + 1, local4 + 1);
						local444 = arg4.ua(local1, local4 + 1);
						if (arg3 > 0) {
							@Pc(571) boolean local571 = true;
							if (local57 == 0 && local26 != 0) {
								local571 = false;
							}
							if (local46 > 0 && local72 != null && !local72.aBoolean178) {
								local571 = false;
							}
							if (local571 && local363 == local358 && local438 == local358 && local444 == local358) {
								this.aByteArrayArrayArray8[arg3][local1][local4] = (byte) (this.aByteArrayArrayArray8[arg3][local1][local4] | 0x4);
							}
						}
						@Pc(629) int local629 = 0;
						@Pc(631) int local631 = 0;
						@Pc(633) int local633 = 0;
						if (this.aBoolean128) {
							local629 = Static172.method2873(local1, local4);
							local631 = Static366.method5109(local1, local4);
							local633 = Static64.method1239(local1, local4);
						}
						arg4.method4434(local1, local4, local331, local341, local334, local350, Static251.anIntArrayArray40[local26], Static219.anIntArrayArray36[local26], Static294.anIntArrayArray43[local26], local140, local143, local146, local149, local629, local631, local633);
						Static399.method508(arg3, local1, local4);
					}
				}
			}
		}
	}
}
