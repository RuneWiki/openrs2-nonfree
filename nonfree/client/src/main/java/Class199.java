import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ria")
public class Class199 {

	@OriginalMember(owner = "client!ria", name = "o", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ria", name = "v", descriptor = "[I")
	private final int[] anIntArray338 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "[I")
	private final int[] anIntArray339 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!ria", name = "x", descriptor = "Lclient!ej;")
	private final Class100 aClass100_7;

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "Lclient!lp;")
	private final Class231 aClass231_15;

	@OriginalMember(owner = "client!ria", name = "u", descriptor = "I")
	protected final int anInt4695;

	@OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
	protected final int anInt4687;

	@OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
	public final int anInt4694;

	@OriginalMember(owner = "client!ria", name = "w", descriptor = "Z")
	public final boolean aBoolean406;

	@OriginalMember(owner = "client!ria", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ria", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ria", name = "e", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ria", name = "t", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!ria", name = "l", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(IIIZLclient!lp;Lclient!ej;)V")
	protected Class199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class231 arg4, @OriginalArg(5) Class100 arg5) {
		this.aClass100_7 = arg5;
		this.aClass231_15 = arg4;
		this.anInt4695 = arg2;
		this.anInt4687 = arg1;
		this.anInt4694 = arg0;
		this.aBoolean406 = arg3;
		this.aByteArrayArrayArray12 = new byte[this.anInt4694][this.anInt4687][this.anInt4695];
		this.aByteArrayArrayArray10 = new byte[this.anInt4694][this.anInt4687][this.anInt4695];
		this.aByteArrayArrayArray13 = new byte[this.anInt4694][this.anInt4687][this.anInt4695];
		this.aByteArrayArrayArray14 = new byte[this.anInt4694][this.anInt4687 + 1][this.anInt4695 + 1];
		this.anIntArrayArrayArray17 = new int[this.anInt4694][this.anInt4687 + 1][this.anInt4695 + 1];
		this.aByteArrayArrayArray11 = new byte[this.anInt4694][this.anInt4687][this.anInt4695];
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!s;Lclient!ha;Lclient!s;Z)V")
	public final void method4260(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class133 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt4687][this.anInt4695];
		if (Static570.anIntArray655 == null || Static570.anIntArray655.length != this.anInt4695) {
			Static570.anIntArray655 = new int[this.anInt4695];
			Static331.anIntArray360 = new int[this.anInt4695];
			Static68.anIntArray104 = new int[this.anInt4695];
			Static575.anIntArray661 = new int[this.anInt4695];
			Static704.anIntArray747 = new int[this.anInt4695];
		}
		@Pc(50) int local50;
		for (@Pc(44) int local44 = 0; local44 < this.anInt4694; local44++) {
			for (local50 = 0; local50 < this.anInt4695; local50++) {
				Static570.anIntArray655[local50] = 0;
				Static331.anIntArray360[local50] = 0;
				Static575.anIntArray661[local50] = 0;
				Static68.anIntArray104[local50] = 0;
				Static704.anIntArray747[local50] = 0;
			}
			for (@Pc(85) int local85 = -5; local85 < this.anInt4687; local85++) {
				@Pc(101) int local101;
				@Pc(120) int local120;
				@Pc(189) int local189;
				for (@Pc(93) int local93 = 0; local93 < this.anInt4695; local93++) {
					local101 = local85 + 5;
					@Pc(169) int local169;
					if (this.anInt4687 > local101) {
						local120 = this.aByteArrayArrayArray10[local44][local101][local93] & 0xFF;
						if (local120 > 0) {
							@Pc(133) Class287 local133 = this.aClass100_7.method2141(local120 - 1);
							Static570.anIntArray655[local93] += local133.anInt7729;
							Static331.anIntArray360[local93] += local133.anInt7736;
							Static575.anIntArray661[local93] += local133.anInt7734;
							Static68.anIntArray104[local93] += local133.anInt7732;
							local169 = Static704.anIntArray747[local93]++;
						}
					}
					local120 = local85 - 5;
					if (local120 >= 0) {
						local189 = this.aByteArrayArrayArray10[local44][local120][local93] & 0xFF;
						if (local189 > 0) {
							@Pc(202) Class287 local202 = this.aClass100_7.method2141(local189 - 1);
							Static570.anIntArray655[local93] -= local202.anInt7729;
							Static331.anIntArray360[local93] -= local202.anInt7736;
							Static575.anIntArray661[local93] -= local202.anInt7734;
							Static68.anIntArray104[local93] -= local202.anInt7732;
							local169 = Static704.anIntArray747[local93]--;
						}
					}
				}
				if (local85 >= 0) {
					local101 = 0;
					local120 = 0;
					local189 = 0;
					@Pc(264) int local264 = 0;
					@Pc(266) int local266 = 0;
					for (@Pc(268) int local268 = -5; local268 < this.anInt4695; local268++) {
						@Pc(274) int local274 = local268 + 5;
						if (this.anInt4695 > local274) {
							local264 += Static68.anIntArray104[local274];
							local266 += Static704.anIntArray747[local274];
							local189 += Static575.anIntArray661[local274];
							local120 += Static331.anIntArray360[local274];
							local101 += Static570.anIntArray655[local274];
						}
						@Pc(312) int local312 = local268 - 5;
						if (local312 >= 0) {
							local101 -= Static570.anIntArray655[local312];
							local266 -= Static704.anIntArray747[local312];
							local189 -= Static575.anIntArray661[local312];
							local120 -= Static331.anIntArray360[local312];
							local264 -= Static68.anIntArray104[local312];
						}
						if (local268 >= 0 && local264 > 0 && local266 > 0) {
							local11[local85][local268] = Static299.method4192(local101 * 256 / local264, local120 / local266, local189 / local266);
						}
					}
				}
			}
			if (Static34.aBoolean734) {
				this.method4266(local44 == 0 ? arg0 : null, arg1, local44 == 0 ? arg2 : null, Static158.aClass133Array4[local44], local11, local44);
			} else {
				this.method4265(arg1, local44 == 0 ? arg0 : null, Static158.aClass133Array4[local44], local44 == 0 ? arg2 : null, local44, local11);
			}
			this.aByteArrayArrayArray10[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray13[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
		}
		if (!this.aBoolean406) {
			if (Static329.anInt5040 != 0) {
				Static582.method8096();
			}
			if (Static233.aBoolean332) {
				Static415.method6540();
			}
		}
		for (local50 = 0; local50 < this.anInt4694; local50++) {
			Static158.aClass133Array4[local50].YA();
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IZIILclient!et;IIIIII)V")
	private void method4261(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub20 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (arg6 == 1) {
			arg2 = 1;
		} else if (arg6 == 2) {
			arg7 = 1;
			arg2 = 1;
		} else if (arg6 == 3) {
			arg7 = 1;
		}
		@Pc(59) int local59;
		if (arg9 < 0 || arg9 >= this.anInt4687 || arg0 < 0 || arg0 >= this.anInt4695) {
			while (true) {
				local59 = arg4.method8581(-17416);
				if (local59 == 0) {
					break;
				}
				if (local59 == 1) {
					arg4.method8581(-17416);
					break;
				}
				if (local59 <= 49) {
					arg4.method8581(-17416);
				}
			}
			return;
		}
		if (!this.aBoolean406 && !arg1) {
			Static392.aByteArrayArrayArray16[arg8][arg9][arg0] = 0;
		}
		while (true) {
			local59 = arg4.method8581(-17416);
			if (local59 == 0) {
				if (this.aBoolean406) {
					this.anIntArrayArrayArray17[0][arg7 + arg9][arg0 + arg2] = 0;
				} else if (arg8 == 0) {
					this.anIntArrayArrayArray17[0][arg9 + arg7][arg2 + arg0] = -Static498.method7109(arg5 + 932731, arg3 + 556238) * 8 << 2;
				} else {
					this.anIntArrayArrayArray17[arg8][arg9 + arg7][arg2 + arg0] = this.anIntArrayArrayArray17[arg8 - 1][arg7 + arg9][arg0 + arg2] - 960;
				}
				break;
			}
			if (local59 == 1) {
				@Pc(221) int local221 = arg4.method8581(-17416);
				if (this.aBoolean406) {
					this.anIntArrayArrayArray17[0][arg9 + arg7][arg0 + arg2] = local221 * 8 << 2;
				} else {
					if (local221 == 1) {
						local221 = 0;
					}
					if (arg8 == 0) {
						this.anIntArrayArrayArray17[0][arg9 + arg7][arg2 + arg0] = -local221 * 8 << 2;
					} else {
						this.anIntArrayArrayArray17[arg8][arg7 + arg9][arg2 + arg0] = this.anIntArrayArrayArray17[arg8 - 1][arg9 + arg7][arg0 + arg2] - (local221 * 8 << 2);
					}
				}
				break;
			}
			if (local59 <= 49) {
				if (arg1) {
					arg4.method8581(-17416);
				} else {
					this.aByteArrayArrayArray11[arg8][arg9][arg0] = arg4.method8536();
					this.aByteArrayArrayArray13[arg8][arg9][arg0] = (byte) ((local59 - 2) / 4);
					this.aByteArrayArrayArray12[arg8][arg9][arg0] = (byte) (local59 + arg6 - 2 & 0x3);
				}
			} else if (local59 <= 81) {
				if (!this.aBoolean406 && !arg1) {
					Static392.aByteArrayArrayArray16[arg8][arg9][arg0] = (byte) (local59 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray10[arg8][arg9][arg0] = (byte) (local59 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIII)V")
	public final void method4262(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4694; local3++) {
			this.method4273(64, 64, arg1, arg0, local3);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILclient!mg;I[ZLclient!pfa;II[[BIILclient!ha;[[B[[BI)V")
	private void method4263(@OriginalArg(1) Class240 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[] arg2, @OriginalArg(4) Class287 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class145 arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) byte[][] arg11, @OriginalArg(13) int arg12) {
		@Pc(29) boolean[] local29 = arg0 != null && arg0.aBoolean552 ? Static334.aBooleanArrayArray5[arg1] : Static587.aBooleanArrayArray8[arg1];
		@Pc(50) int local50;
		@Pc(60) Class240 local60;
		@Pc(79) byte local79;
		@Pc(96) int local96;
		@Pc(101) int local101;
		if (arg12 > 0) {
			if (arg7 > 0) {
				local50 = arg10[arg7 - 1][arg12 - 1] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass231_15.method5329(local50 - 1);
					if (local60.anInt6500 != -1 && local60.aBoolean552) {
						local79 = arg11[arg7 - 1][arg12 - 1];
						local96 = arg6[arg7 - 1][arg12 - 1] * 2 + 4 & 0x7;
						local101 = Static275.method3841(arg9, local60);
						if (Static510.aBooleanArrayArray9[local79][local96]) {
							Static172.anIntArray223[0] = local60.anInt6500;
							Static162.anIntArray206[0] = local101;
							Static467.anIntArray539[0] = local60.anInt6496;
							Static54.anIntArray83[0] = local60.anInt6498;
							Static280.anIntArray477[0] = local60.anInt6499;
							Static314.anIntArray346[0] = 256;
						}
					}
				}
			}
			if (arg4 - 1 > arg7) {
				local50 = arg10[arg7 + 1][arg12 - 1] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass231_15.method5329(local50 - 1);
					if (local60.anInt6500 != -1 && local60.aBoolean552) {
						local79 = arg11[arg7 + 1][arg12 - 1];
						local96 = arg6[arg7 + 1][arg12 - 1] * 2 + 6 & 0x7;
						local101 = Static275.method3841(arg9, local60);
						if (Static510.aBooleanArrayArray9[local79][local96]) {
							Static172.anIntArray223[2] = local60.anInt6500;
							Static162.anIntArray206[2] = local101;
							Static467.anIntArray539[2] = local60.anInt6496;
							Static54.anIntArray83[2] = local60.anInt6498;
							Static280.anIntArray477[2] = local60.anInt6499;
							Static314.anIntArray346[2] = 512;
						}
					}
				}
			}
		}
		if (arg8 - 1 > arg12) {
			if (arg7 > 0) {
				local50 = arg10[arg7 - 1][arg12 + 1] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass231_15.method5329(local50 - 1);
					if (local60.anInt6500 != -1 && local60.aBoolean552) {
						local79 = arg11[arg7 - 1][arg12 + 1];
						local96 = arg6[arg7 - 1][arg12 + 1] * 2 + 2 & 0x7;
						local101 = Static275.method3841(arg9, local60);
						if (Static510.aBooleanArrayArray9[local79][local96]) {
							Static172.anIntArray223[6] = local60.anInt6500;
							Static162.anIntArray206[6] = local101;
							Static467.anIntArray539[6] = local60.anInt6496;
							Static54.anIntArray83[6] = local60.anInt6498;
							Static280.anIntArray477[6] = local60.anInt6499;
							Static314.anIntArray346[6] = 64;
						}
					}
				}
			}
			if (arg7 < arg4 - 1) {
				local50 = arg10[arg7 + 1][arg12 + 1] & 0xFF;
				if (local50 > 0) {
					local60 = this.aClass231_15.method5329(local50 - 1);
					if (local60.anInt6500 != -1 && local60.aBoolean552) {
						local79 = arg11[arg7 + 1][arg12 + 1];
						local96 = arg6[arg7 + 1][arg12 + 1] * 2 & 0x7;
						local101 = Static275.method3841(arg9, local60);
						if (Static510.aBooleanArrayArray9[local79][local96]) {
							Static172.anIntArray223[4] = local60.anInt6500;
							Static162.anIntArray206[4] = local101;
							Static467.anIntArray539[4] = local60.anInt6496;
							Static54.anIntArray83[4] = local60.anInt6498;
							Static280.anIntArray477[4] = local60.anInt6499;
							Static314.anIntArray346[4] = 128;
						}
					}
				}
			}
		}
		@Pc(523) int local523;
		@Pc(528) int local528;
		@Pc(530) int local530;
		@Pc(512) byte local512;
		if (arg12 > 0) {
			local50 = arg10[arg7][arg12 - 1] & 0xFF;
			if (local50 > 0) {
				local60 = this.aClass231_15.method5329(local50 - 1);
				if (local60.anInt6500 != -1) {
					local79 = arg11[arg7][arg12 - 1];
					local512 = arg6[arg7][arg12 - 1];
					if (local60.aBoolean552) {
						local101 = 2;
						local523 = local512 * 2 + 4;
						local528 = Static275.method3841(arg9, local60);
						for (local530 = 0; local530 < 3; local530++) {
							local101 &= 0x7;
							local523 &= 0x7;
							if (Static510.aBooleanArrayArray9[local79][local523] && local60.anInt6499 >= Static280.anIntArray477[local101]) {
								Static172.anIntArray223[local101] = local60.anInt6500;
								Static162.anIntArray206[local101] = local528;
								Static467.anIntArray539[local101] = local60.anInt6496;
								Static54.anIntArray83[local101] = local60.anInt6498;
								if (Static280.anIntArray477[local101] == local60.anInt6499) {
									Static314.anIntArray346[local101] |= 0x20;
								} else {
									Static314.anIntArray346[local101] = 32;
								}
								Static280.anIntArray477[local101] = local60.anInt6499;
							}
							local101--;
							local523++;
						}
						if (!local29[arg5 & 0x3]) {
							arg2[0] = Static334.aBooleanArrayArray5[local79][local512 + 2 & 0x3];
						}
					} else if (!local29[arg5 & 0x3]) {
						arg2[0] = Static587.aBooleanArrayArray8[local79][local512 + 2 & 0x3];
					}
				}
			}
		}
		if (arg8 - 1 > arg12) {
			local50 = arg10[arg7][arg12 + 1] & 0xFF;
			if (local50 > 0) {
				local60 = this.aClass231_15.method5329(local50 - 1);
				if (local60.anInt6500 != -1) {
					local79 = arg11[arg7][arg12 + 1];
					local512 = arg6[arg7][arg12 + 1];
					if (local60.aBoolean552) {
						local101 = 4;
						local523 = local512 * 2 + 2;
						local528 = Static275.method3841(arg9, local60);
						for (local530 = 0; local530 < 3; local530++) {
							local523 &= 0x7;
							local101 &= 0x7;
							if (Static510.aBooleanArrayArray9[local79][local523] && local60.anInt6499 >= Static280.anIntArray477[local101]) {
								Static172.anIntArray223[local101] = local60.anInt6500;
								Static162.anIntArray206[local101] = local528;
								Static467.anIntArray539[local101] = local60.anInt6496;
								Static54.anIntArray83[local101] = local60.anInt6498;
								if (local60.anInt6499 == Static280.anIntArray477[local101]) {
									Static314.anIntArray346[local101] |= 0x10;
								} else {
									Static314.anIntArray346[local101] = 16;
								}
								Static280.anIntArray477[local101] = local60.anInt6499;
							}
							local523--;
							local101++;
						}
						if (!local29[arg5 + 2 & 0x3]) {
							arg2[2] = Static334.aBooleanArrayArray5[local79][--local512 & 0x3];
						}
					} else if (!local29[arg5 + 2 & 0x3]) {
						arg2[2] = Static587.aBooleanArrayArray8[local79][--local512 & 0x3];
					}
				}
			}
		}
		if (arg7 > 0) {
			local50 = arg10[arg7 - 1][arg12] & 0xFF;
			if (local50 > 0) {
				local60 = this.aClass231_15.method5329(local50 - 1);
				if (local60.anInt6500 != -1) {
					local79 = arg11[arg7 - 1][arg12];
					local512 = arg6[arg7 - 1][arg12];
					if (local60.aBoolean552) {
						local101 = 6;
						local523 = local512 * 2 + 4;
						local528 = Static275.method3841(arg9, local60);
						for (local530 = 0; local530 < 3; local530++) {
							local101 &= 0x7;
							local523 &= 0x7;
							if (Static510.aBooleanArrayArray9[local79][local523] && Static280.anIntArray477[local101] <= local60.anInt6499) {
								Static172.anIntArray223[local101] = local60.anInt6500;
								Static162.anIntArray206[local101] = local528;
								Static467.anIntArray539[local101] = local60.anInt6496;
								Static54.anIntArray83[local101] = local60.anInt6498;
								if (local60.anInt6499 == Static280.anIntArray477[local101]) {
									Static314.anIntArray346[local101] |= 0x8;
								} else {
									Static314.anIntArray346[local101] = 8;
								}
								Static280.anIntArray477[local101] = local60.anInt6499;
							}
							local101++;
							local523--;
						}
						if (!local29[arg5 + 3 & 0x3]) {
							arg2[3] = Static334.aBooleanArrayArray5[local79][local512 + 1 & 0x3];
						}
					} else if (!local29[arg5 + 3 & 0x3]) {
						arg2[3] = Static587.aBooleanArrayArray8[local79][local512 + 1 & 0x3];
					}
				}
			}
		}
		if (arg7 < arg4 - 1) {
			local50 = arg10[arg7 + 1][arg12] & 0xFF;
			if (local50 > 0) {
				local60 = this.aClass231_15.method5329(local50 - 1);
				if (local60.anInt6500 != -1) {
					local79 = arg11[arg7 + 1][arg12];
					local512 = arg6[arg7 + 1][arg12];
					if (local60.aBoolean552) {
						local101 = 4;
						local523 = local512 * 2 + 6;
						local528 = Static275.method3841(arg9, local60);
						for (local530 = 0; local530 < 3; local530++) {
							local523 &= 0x7;
							local101 &= 0x7;
							if (Static510.aBooleanArrayArray9[local79][local523] && Static280.anIntArray477[local101] <= local60.anInt6499) {
								Static172.anIntArray223[local101] = local60.anInt6500;
								Static162.anIntArray206[local101] = local528;
								Static467.anIntArray539[local101] = local60.anInt6496;
								Static54.anIntArray83[local101] = local60.anInt6498;
								if (Static280.anIntArray477[local101] == local60.anInt6499) {
									Static314.anIntArray346[local101] |= 0x4;
								} else {
									Static314.anIntArray346[local101] = 4;
								}
								Static280.anIntArray477[local101] = local60.anInt6499;
							}
							local523++;
							local101--;
						}
						if (!local29[arg5 + 1 & 0x3]) {
							arg2[1] = Static334.aBooleanArrayArray5[local79][local512 + 3 & 0x3];
						}
					} else if (!local29[arg5 + 1 & 0x3]) {
						arg2[1] = Static587.aBooleanArrayArray8[local79][local512 + 3 & 0x3];
					}
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		local50 = Static275.method3841(arg9, arg0);
		if (!arg0.aBoolean552) {
			return;
		}
		for (@Pc(1285) int local1285 = 0; local1285 < 8; local1285++) {
			@Pc(1296) int local1296 = local1285 - arg5 * 2 & 0x7;
			if (Static510.aBooleanArrayArray9[arg1][local1285] && Static280.anIntArray477[local1296] <= arg0.anInt6499) {
				Static172.anIntArray223[local1296] = arg0.anInt6500;
				Static162.anIntArray206[local1296] = local50;
				Static467.anIntArray539[local1296] = arg0.anInt6496;
				Static54.anIntArray83[local1296] = arg0.anInt6498;
				if (arg0.anInt6499 == Static280.anIntArray477[local1296]) {
					Static314.anIntArray346[local1296] |= 0x2;
				} else {
					Static314.anIntArray346[local1296] = 2;
				}
				Static280.anIntArray477[local1296] = arg0.anInt6499;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!ha;ZLclient!s;Lclient!s;Lclient!s;I[[I)V")
	private void method4265(@OriginalArg(0) Class145 arg0, @OriginalArg(2) Class133 arg1, @OriginalArg(3) Class133 arg2, @OriginalArg(4) Class133 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4687; local7++) {
			for (@Pc(14) int local14 = 0; local14 < this.anInt4695; local14++) {
				if (Static519.anInt8270 == -1 || Static208.method4773(local14, local7, arg4, Static519.anInt8270)) {
					@Pc(44) byte local44 = this.aByteArrayArrayArray13[arg4][local7][local14];
					@Pc(53) byte local53 = this.aByteArrayArrayArray12[arg4][local7][local14];
					@Pc(64) int local64 = this.aByteArrayArrayArray11[arg4][local7][local14] & 0xFF;
					@Pc(75) int local75 = this.aByteArrayArrayArray10[arg4][local7][local14] & 0xFF;
					@Pc(88) Class240 local88 = local64 == 0 ? null : this.aClass231_15.method5329(local64 - 1);
					@Pc(104) Class287 local104 = local75 == 0 ? null : this.aClass100_7.method2141(local75 - 1);
					if (local44 == 0 && local88 == null) {
						local44 = 12;
					}
					@Pc(117) Class240 local117 = local88;
					if (local88 != null && local88.anInt6500 == -1 && local88.anInt6494 == -1) {
						local117 = local88;
						local88 = null;
					}
					if (local88 != null || local104 != null) {
						@Pc(147) int local147 = Static71.anIntArray325[local44];
						@Pc(151) int local151 = Static571.anIntArray657[local44];
						@Pc(166) int local166 = (local88 == null ? 0 : local151) + (local104 == null ? 0 : local147);
						@Pc(168) int local168 = 0;
						@Pc(170) int local170 = 0;
						@Pc(178) int local178 = local88 == null ? -1 : local88.anInt6496;
						@Pc(186) int local186 = local104 == null ? -1 : local104.anInt7730;
						@Pc(189) int[] local189 = new int[local166];
						@Pc(192) int[] local192 = new int[local166];
						@Pc(195) int[] local195 = new int[local166];
						@Pc(198) int[] local198 = new int[local166];
						@Pc(201) int[] local201 = new int[local166];
						@Pc(204) int[] local204 = new int[local166];
						@Pc(219) int[] local219 = local88 == null || local88.anInt6494 == -1 ? null : new int[local166];
						@Pc(229) int local229;
						if (local88 == null) {
							local170 = local151;
						} else {
							for (local229 = 0; local229 < local151; local229++) {
								local189[local168] = Static628.anIntArrayArray61[local44][local170];
								local192[local168] = Static111.anIntArrayArray10[local44][local170];
								local195[local168] = Static701.anIntArrayArray57[local44][local170];
								local201[local168] = local178;
								local204[local168] = local88.anInt6498;
								local198[local168] = local88.anInt6500;
								if (local219 != null) {
									local219[local168] = local88.anInt6494;
								}
								local170++;
								local168++;
							}
							if (!this.aBoolean406 && arg4 == 0) {
								Static379.method5479(local7, local14, local88.anInt6504, local88.anInt6495 * 8, local88.anInt6501);
							}
						}
						if (local104 != null) {
							for (local229 = 0; local229 < local147; local229++) {
								local189[local168] = Static628.anIntArrayArray61[local44][local170];
								local192[local168] = Static111.anIntArrayArray10[local44][local170];
								local195[local168] = Static701.anIntArrayArray57[local44][local170];
								local201[local168] = local186;
								local204[local168] = local104.anInt7733;
								local198[local168] = arg5[local7][local14];
								if (local219 != null) {
									local219[local168] = local198[local168];
								}
								local168++;
								local170++;
							}
						}
						local229 = this.anIntArray338.length;
						@Pc(382) int[] local382 = new int[local229];
						@Pc(385) int[] local385 = new int[local229];
						@Pc(397) int[] local397 = arg3 == null ? null : new int[local229];
						@Pc(409) int[] local409 = arg3 == null && arg1 == null ? null : new int[local229];
						@Pc(418) int local418;
						@Pc(423) int local423;
						@Pc(521) int local521;
						@Pc(529) int local529;
						for (@Pc(411) int local411 = 0; local411 < local229; local411++) {
							local418 = this.anIntArray338[local411];
							local423 = this.anIntArray339[local411];
							if (local53 == 0) {
								local382[local411] = local418;
								local385[local411] = local423;
							} else if (local53 == 1) {
								local382[local411] = local423;
								local385[local411] = 512 - local418;
							} else if (local53 == 2) {
								local382[local411] = 512 - local418;
								local385[local411] = 512 - local423;
							} else if (local53 == 3) {
								local382[local411] = 512 - local423;
								local385[local411] = local418;
							}
							if (local397 != null && Static510.aBooleanArrayArray9[local44][local411]) {
								local521 = (local7 << 9) + local382[local411];
								local529 = (local14 << 9) + local385[local411];
								local397[local411] = arg3.method8214(local521, local529) - arg2.method8214(local521, local529);
							}
							if (local409 != null) {
								if (arg3 != null && !Static510.aBooleanArrayArray9[local44][local411]) {
									local521 = (local7 << 9) + local382[local411];
									local529 = local385[local411] + (local14 << 9);
									local409[local411] = arg2.method8214(local521, local529) - arg3.method8214(local521, local529);
								} else if (arg1 != null && !Static218.aBooleanArrayArray4[local44][local411]) {
									local521 = (local7 << 9) + local382[local411];
									local529 = local385[local411] + (local14 << 9);
									local409[local411] = arg1.method8214(local521, local529) - arg2.method8214(local521, local529);
								}
							}
						}
						local418 = arg2.method8217(local7, local14);
						local423 = arg2.method8217(local7 + 1, local14);
						local521 = arg2.method8217(local7 + 1, local14 - -1);
						local529 = arg2.method8217(local7, local14 + 1);
						@Pc(677) boolean local677 = Static83.method1237(local7, local14);
						if (local677 && arg4 > 1 || !local677 && arg4 > 0) {
							@Pc(698) boolean local698 = true;
							if (local104 != null && !local104.aBoolean676) {
								local698 = false;
							} else if (local75 == 0 && local44 != 0) {
								local698 = false;
							} else if (local64 > 0 && local117 != null && !local117.aBoolean550) {
								local698 = false;
							}
							if (local698 && local418 == local423 && local418 == local521 && local418 == local529) {
								this.aByteArrayArrayArray14[arg4][local7][local14] = (byte) (this.aByteArrayArrayArray14[arg4][local7][local14] | 0x4);
							}
						}
						@Pc(790) int local790 = 0;
						@Pc(792) int local792 = 0;
						@Pc(794) int local794 = 0;
						if (this.aBoolean406) {
							local790 = Static308.method4294(local7, local14);
							local792 = Static112.method1642(local7, local14);
							local794 = Static53.method748(local7, local14);
						}
						arg2.method8216(local7, local14, local382, local397, local385, local409, local189, local192, local195, local198, local219, local201, local204, local790, local792, local794);
						Static572.method7965(arg4, local7, local14);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!s;Lclient!ha;Lclient!s;Lclient!s;[[IBI)V")
	private void method4266(@OriginalArg(0) Class133 arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class133 arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray13[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray12[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray10[arg5];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray11[arg5];
		for (@Pc(27) int local27 = 0; local27 < this.anInt4687; local27++) {
			@Pc(48) int local48 = this.anInt4687 - 1 > local27 ? local27 + 1 : local27;
			for (@Pc(50) int local50 = 0; local50 < this.anInt4695; local50++) {
				@Pc(71) int local71 = this.anInt4695 - 1 > local50 ? local50 + 1 : local50;
				if (Static519.anInt8270 == -1 || Static208.method4773(local50, local27, arg5, Static519.anInt8270)) {
					@Pc(90) boolean local90 = false;
					@Pc(92) boolean local92 = false;
					@Pc(95) boolean[] local95 = new boolean[4];
					@Pc(101) int local101 = local10[local27][local50];
					@Pc(107) int local107 = local15[local27][local50];
					@Pc(115) int local115 = local25[local27][local50] & 0xFF;
					@Pc(123) int local123 = local20[local27][local50] & 0xFF;
					@Pc(131) int local131 = local20[local27][local71] & 0xFF;
					@Pc(139) int local139 = local20[local48][local71] & 0xFF;
					@Pc(147) int local147 = local20[local48][local50] & 0xFF;
					if (local115 != 0 || local123 != 0) {
						@Pc(171) Class240 local171 = local115 == 0 ? null : this.aClass231_15.method5329(local115 - 1);
						@Pc(187) Class287 local187 = local123 == 0 ? null : this.aClass100_7.method2141(local123 - 1);
						if (local101 == 0 && local171 == null) {
							local101 = 12;
						}
						@Pc(197) Class240 local197 = local171;
						if (local171 != null) {
							if (local171.anInt6500 == -1 && local171.anInt6494 == -1) {
								local197 = local171;
								local171 = null;
							} else if (local187 != null && local101 != 0) {
								local92 = local171.aBoolean552;
							}
						}
						@Pc(331) int local331;
						@Pc(351) int local351;
						@Pc(440) int local440;
						@Pc(449) int local449;
						if ((local101 == 0 || local101 == 12) && local27 > 0 && local50 > 0 && local27 < this.anInt4687 && this.anInt4695 > local50) {
							@Pc(287) int local287 = local123 == local20[local48][local71] ? 1 : -1;
							@Pc(307) int local307 = local20[local48][local50 - 1] == local123 ? 1 : -1;
							local331 = local123 == local20[local27 - 1][local50 - 1] ? 1 : -1;
							local351 = local123 == local20[local27 - 1][local71] ? 1 : -1;
							if (local20[local27][local50 - 1] == local123) {
								local307++;
								local331++;
							} else {
								local331--;
								local307--;
							}
							if (local123 == local20[local48][local50]) {
								local307++;
								local287++;
							} else {
								local287--;
								local307--;
							}
							if (local123 == local20[local27][local71]) {
								local351++;
								local287++;
							} else {
								local287--;
								local351--;
							}
							if (local123 == local20[local27 - 1][local50]) {
								local351++;
								local331++;
							} else {
								local351--;
								local331--;
							}
							local440 = local331 - local287;
							if (local440 < 0) {
								local440 = -local440;
							}
							local449 = local307 - local351;
							if (local449 < 0) {
								local449 = -local449;
							}
							if (local440 == local449) {
								local440 = arg3.method8217(local27, local50) - arg3.method8217(local48, local71);
								local449 = arg3.method8217(local48, local50) - arg3.method8217(local27, local71);
								if (local440 < 0) {
									local440 = -local440;
								}
								if (local449 < 0) {
									local449 = -local449;
								}
							}
							local107 = local440 < local449 ? 1 : 0;
						}
						for (local331 = 0; local331 < 13; local331++) {
							Static280.anIntArray477[local331] = -1;
							Static314.anIntArray346[local331] = 1;
						}
						@Pc(545) boolean[] local545 = local171 != null && local171.aBoolean552 ? Static334.aBooleanArrayArray5[local101] : Static587.aBooleanArrayArray8[local101];
						this.method4263(local171, local101, local95, local187, this.anInt4687, local107, local15, local27, this.anInt4695, arg1, local25, local10, local50);
						@Pc(577) boolean local577 = local171 != null && local171.anInt6494 != local171.anInt6500;
						if (!local577) {
							for (local351 = 0; local351 < 8; local351++) {
								if (Static280.anIntArray477[local351] >= 0 && Static162.anIntArray206[local351] != Static172.anIntArray223[local351]) {
									local577 = true;
									break;
								}
							}
						}
						if (!local545[local107 + 1 & 0x3]) {
							local95[1] = Static687.method9259(local95[1], (Static314.anIntArray346[2] & Static314.anIntArray346[4]) == 0);
						}
						if (!local545[local107 + 3 & 0x3]) {
							local95[3] = Static687.method9259(local95[3], (Static314.anIntArray346[6] & Static314.anIntArray346[0]) == 0);
						}
						if (!local545[local107 & 0x3]) {
							local95[0] = Static687.method9259(local95[0], (Static314.anIntArray346[0] & Static314.anIntArray346[2]) == 0);
						}
						if (!local545[local107 + 2 & 0x3]) {
							local95[2] = Static687.method9259(local95[2], (Static314.anIntArray346[6] & Static314.anIntArray346[4]) == 0);
						}
						if (!local92 && (local101 == 0 || local101 == 12)) {
							if (local95[0] && !local95[1] && !local95[2] && local95[3]) {
								local107 = 0;
								local95[0] = local95[3] = false;
								local101 = local101 == 0 ? 13 : 14;
							} else if (local95[0] && local95[1] && !local95[2] && !local95[3]) {
								local95[0] = local95[1] = false;
								local107 = 3;
								local101 = local101 == 0 ? 13 : 14;
							} else if (!local95[0] && local95[1] && local95[2] && !local95[3]) {
								local95[1] = local95[2] = false;
								local101 = local101 == 0 ? 13 : 14;
								local107 = 2;
							} else if (!local95[0] && !local95[1] && local95[2] && local95[3]) {
								local107 = 1;
								local101 = local101 == 0 ? 13 : 14;
								local95[2] = local95[3] = false;
							}
						}
						@Pc(956) boolean local956 = !local92 && !local95[0] && !local95[2] && !local95[1] && !local95[3];
						@Pc(958) int[] local958 = null;
						@Pc(964) int[] local964;
						@Pc(968) int[] local968;
						@Pc(972) int[] local972;
						if (local956) {
							local964 = Static628.anIntArrayArray61[local101];
							local968 = Static111.anIntArrayArray10[local101];
							local972 = Static701.anIntArrayArray57[local101];
							local449 = local171 == null ? 0 : Static571.anIntArray657[local101];
							local440 = local187 == null ? 0 : Static71.anIntArray325[local101];
						} else if (local92) {
							local964 = Static12.anIntArrayArray1[local101];
							local968 = Static39.anIntArrayArray2[local101];
							local958 = Static121.anIntArrayArray13[local101];
							local440 = local187 == null ? 0 : Static188.anIntArray240[local101];
							local449 = local171 == null ? 0 : Static726.anIntArray765[local101];
							local972 = Static117.anIntArrayArray12[local101];
						} else {
							local449 = local171 == null ? 0 : Static410.anIntArray471[local101];
							local968 = Static562.anIntArrayArray59[local101];
							local972 = Static204.anIntArrayArray27[local101];
							local958 = Static284.anIntArrayArray36[local101];
							local964 = Static129.anIntArrayArray14[local101];
							local440 = local187 == null ? 0 : Static254.anIntArray298[local101];
						}
						@Pc(1069) int local1069 = local449 + local440;
						if (local1069 <= 0) {
							Static572.method7965(arg5, local27, local50);
						} else {
							if (local95[0]) {
								local1069++;
							}
							if (local95[2]) {
								local1069++;
							}
							if (local95[1]) {
								local1069++;
							}
							if (local95[3]) {
								local1069++;
							}
							@Pc(1111) int local1111 = 0;
							@Pc(1113) int local1113 = 0;
							@Pc(1117) int local1117 = local1069 * 3;
							@Pc(1125) int[] local1125 = local577 ? new int[local1117] : null;
							@Pc(1128) int[] local1128 = new int[local1117];
							@Pc(1131) int[] local1131 = new int[local1117];
							@Pc(1134) int[] local1134 = new int[local1117];
							@Pc(1137) int[] local1137 = new int[local1117];
							@Pc(1140) int[] local1140 = new int[local1117];
							@Pc(1148) int[] local1148 = arg2 == null ? null : new int[local1117];
							@Pc(1160) int[] local1160 = arg2 == null && arg0 == null ? null : new int[local1117];
							@Pc(1162) int local1162 = -1;
							@Pc(1164) int local1164 = -1;
							@Pc(1166) int local1166 = 256;
							@Pc(1222) boolean local1222;
							@Pc(1214) int local1214;
							@Pc(1216) int local1216;
							@Pc(1464) int local1464;
							@Pc(1470) int local1470;
							@Pc(1479) int local1479;
							@Pc(1484) int local1484;
							@Pc(1500) int local1500;
							@Pc(1489) int local1489;
							@Pc(1498) int local1498;
							@Pc(1564) int local1564;
							@Pc(1570) int local1570;
							@Pc(1314) byte local1314;
							if (local171 != null) {
								local1162 = local171.anInt6500;
								local1164 = local171.anInt6496;
								local1166 = local171.anInt6498;
								local1214 = Static275.method3841(arg1, local171);
								for (local1216 = 0; local1216 < local449; local1216++) {
									local1222 = false;
									if (local95[-local107 & 0x3] && local958[0] == local1111) {
										Static191.anIntArray244[0] = local964[local1111];
										Static191.anIntArray244[1] = 1;
										Static191.anIntArray244[2] = local972[local1111];
										Static191.anIntArray244[3] = 1;
										Static191.anIntArray244[4] = local968[local1111];
										local1314 = 6;
										Static191.anIntArray244[5] = local972[local1111];
									} else if (local95[2 - local107 & 0x3] && local1111 == local958[2]) {
										Static191.anIntArray244[0] = local964[local1111];
										Static191.anIntArray244[1] = 5;
										Static191.anIntArray244[2] = local972[local1111];
										Static191.anIntArray244[3] = 5;
										Static191.anIntArray244[4] = local968[local1111];
										Static191.anIntArray244[5] = local972[local1111];
										local1314 = 6;
									} else if (local95[1 - local107 & 0x3] && local958[1] == local1111) {
										Static191.anIntArray244[0] = local964[local1111];
										Static191.anIntArray244[1] = 3;
										Static191.anIntArray244[2] = local972[local1111];
										Static191.anIntArray244[3] = 3;
										Static191.anIntArray244[4] = local968[local1111];
										Static191.anIntArray244[5] = local972[local1111];
										local1314 = 6;
									} else if (local95[3 - local107 & 0x3] && local1111 == local958[3]) {
										Static191.anIntArray244[0] = local964[local1111];
										Static191.anIntArray244[1] = 7;
										Static191.anIntArray244[2] = local972[local1111];
										Static191.anIntArray244[3] = 7;
										Static191.anIntArray244[4] = local968[local1111];
										Static191.anIntArray244[5] = local972[local1111];
										local1314 = 6;
									} else {
										Static191.anIntArray244[0] = local964[local1111];
										Static191.anIntArray244[1] = local968[local1111];
										Static191.anIntArray244[2] = local972[local1111];
										local1314 = 3;
									}
									local1111++;
									for (local1464 = 0; local1464 < local1314; local1464++) {
										local1470 = Static191.anIntArray244[local1464];
										local1479 = local1470 - local107 * 2 & 0x7;
										local1484 = this.anIntArray338[local1470];
										local1489 = this.anIntArray339[local1470];
										if (local107 == 1) {
											local1498 = 512 - local1484;
											local1500 = local1489;
										} else if (local107 == 2) {
											local1500 = 512 - local1484;
											local1498 = 512 - local1489;
										} else if (local107 == 3) {
											local1500 = 512 - local1489;
											local1498 = local1484;
										} else {
											local1500 = local1484;
											local1498 = local1489;
										}
										local1128[local1113] = local1500;
										local1131[local1113] = local1498;
										if (local1148 != null && Static510.aBooleanArrayArray9[local101][local1470]) {
											local1564 = (local27 << 9) + local1500;
											local1570 = (local50 << 9) + local1498;
											local1148[local1113] = arg2.method8214(local1564, local1570) - arg3.method8214(local1564, local1570);
										}
										if (local1160 != null) {
											if (arg2 != null && !Static510.aBooleanArrayArray9[local101][local1470]) {
												local1564 = local1500 + (local27 << 9);
												local1570 = (local50 << 9) + local1498;
												local1160[local1113] = arg3.method8214(local1564, local1570) - arg2.method8214(local1564, local1570);
											} else if (arg0 != null && !Static218.aBooleanArrayArray4[local101][local1470]) {
												local1564 = local1500 + (local27 << 9);
												local1570 = (local50 << 9) + local1498;
												local1160[local1113] = arg0.method8214(local1564, local1570) - arg3.method8214(local1564, local1570);
											}
										}
										if (local1470 < 8 && local171.anInt6499 < Static280.anIntArray477[local1479]) {
											if (local1125 != null) {
												local1125[local1113] = Static162.anIntArray206[local1479];
											}
											local1140[local1113] = Static54.anIntArray83[local1479];
											local1137[local1113] = Static467.anIntArray539[local1479];
											local1134[local1113] = Static172.anIntArray223[local1479];
										} else {
											if (local1125 != null) {
												local1125[local1113] = local1214;
											}
											local1137[local1113] = local171.anInt6496;
											local1140[local1113] = local171.anInt6498;
											local1134[local1113] = local1162;
										}
										local1113++;
									}
								}
								if (!this.aBoolean406 && arg5 == 0) {
									Static379.method5479(local27, local50, local171.anInt6504, local171.anInt6495 * 8, local171.anInt6501);
								}
								if (local101 != 12 && local171.anInt6500 != -1 && local171.aBoolean551) {
									local90 = true;
								}
							} else if (local956) {
								local1111 = Static571.anIntArray657[local101];
							} else if (local92) {
								local1111 = Static726.anIntArray765[local101];
							} else {
								local1111 = Static410.anIntArray471[local101];
							}
							if (local187 != null) {
								if (local147 == 0) {
									local147 = local123;
								}
								if (local139 == 0) {
									local139 = local123;
								}
								if (local131 == 0) {
									local131 = local123;
								}
								@Pc(1819) Class287 local1819 = this.aClass100_7.method2141(local123 - 1);
								@Pc(1827) Class287 local1827 = this.aClass100_7.method2141(local131 - 1);
								@Pc(1835) Class287 local1835 = this.aClass100_7.method2141(local139 - 1);
								@Pc(1843) Class287 local1843 = this.aClass100_7.method2141(local147 - 1);
								for (local1479 = 0; local1479 < local440; local1479++) {
									local1222 = false;
									if (local95[-local107 & 0x3] && local1111 == local958[0]) {
										Static191.anIntArray244[0] = local964[local1111];
										Static191.anIntArray244[1] = 1;
										Static191.anIntArray244[2] = local972[local1111];
										Static191.anIntArray244[3] = 1;
										Static191.anIntArray244[4] = local968[local1111];
										Static191.anIntArray244[5] = local972[local1111];
										local1314 = 6;
									} else if (local95[2 - local107 & 0x3] && local1111 == local958[2]) {
										Static191.anIntArray244[0] = local964[local1111];
										Static191.anIntArray244[1] = 5;
										Static191.anIntArray244[2] = local972[local1111];
										Static191.anIntArray244[3] = 5;
										Static191.anIntArray244[4] = local968[local1111];
										Static191.anIntArray244[5] = local972[local1111];
										local1314 = 6;
									} else if (local95[1 - local107 & 0x3] && local1111 == local958[1]) {
										Static191.anIntArray244[0] = local964[local1111];
										Static191.anIntArray244[1] = 3;
										Static191.anIntArray244[2] = local972[local1111];
										Static191.anIntArray244[3] = 3;
										Static191.anIntArray244[4] = local968[local1111];
										Static191.anIntArray244[5] = local972[local1111];
										local1314 = 6;
									} else if (local95[3 - local107 & 0x3] && local958[3] == local1111) {
										Static191.anIntArray244[0] = local964[local1111];
										Static191.anIntArray244[1] = 7;
										Static191.anIntArray244[2] = local972[local1111];
										Static191.anIntArray244[3] = 7;
										Static191.anIntArray244[4] = local968[local1111];
										Static191.anIntArray244[5] = local972[local1111];
										local1314 = 6;
									} else {
										Static191.anIntArray244[0] = local964[local1111];
										Static191.anIntArray244[1] = local968[local1111];
										local1314 = 3;
										Static191.anIntArray244[2] = local972[local1111];
									}
									local1111++;
									for (local1484 = 0; local1484 < local1314; local1484++) {
										local1500 = Static191.anIntArray244[local1484];
										local1489 = local1500 - local107 * 2 & 0x7;
										local1498 = this.anIntArray338[local1500];
										local1570 = this.anIntArray339[local1500];
										@Pc(2119) int local2119;
										if (local107 == 1) {
											local2119 = 512 - local1498;
											local1564 = local1570;
										} else if (local107 == 2) {
											local2119 = 512 - local1570;
											local1564 = 512 - local1498;
										} else if (local107 == 3) {
											local1564 = 512 - local1570;
											local2119 = local1498;
										} else {
											local2119 = local1570;
											local1564 = local1498;
										}
										local1128[local1113] = local1564;
										local1131[local1113] = local2119;
										@Pc(2186) int local2186;
										@Pc(2193) int local2193;
										if (local1148 != null && Static510.aBooleanArrayArray9[local101][local1500]) {
											local2186 = (local27 << 9) + local1564;
											local2193 = (local50 << 9) + local2119;
											local1148[local1113] = arg2.method8214(local2186, local2193) - arg3.method8214(local2186, local2193);
										}
										if (local1160 != null) {
											if (arg2 != null && !Static510.aBooleanArrayArray9[local101][local1500]) {
												local2186 = (local27 << 9) + local1564;
												local2193 = (local50 << 9) + local2119;
												local1160[local1113] = arg3.method8214(local2186, local2193) - arg2.method8214(local2186, local2193);
											} else if (arg0 != null && !Static218.aBooleanArrayArray4[local101][local1500]) {
												local2186 = local1564 + (local27 << 9);
												local2193 = local2119 + (local50 << 9);
												local1160[local1113] = arg0.method8214(local2186, local2193) - arg3.method8214(local2186, local2193);
											}
										}
										if (local1500 < 8 && Static280.anIntArray477[local1489] >= 0) {
											if (local1125 != null) {
												local1125[local1113] = Static162.anIntArray206[local1489];
											}
											local1140[local1113] = Static54.anIntArray83[local1489];
											local1137[local1113] = Static467.anIntArray539[local1489];
											local1134[local1113] = Static172.anIntArray223[local1489];
										} else {
											if (local92 && Static510.aBooleanArrayArray9[local101][local1500]) {
												local1137[local1113] = local1164;
												local1140[local1113] = local1166;
												local1134[local1113] = local1162;
											} else if (local1564 == 0 && local2119 == 0) {
												local1134[local1113] = arg4[local27][local50];
												local1137[local1113] = local1819.anInt7730;
												local1140[local1113] = local1819.anInt7733;
											} else if (local1564 == 0 && local2119 == 512) {
												local1134[local1113] = arg4[local27][local71];
												local1137[local1113] = local1827.anInt7730;
												local1140[local1113] = local1827.anInt7733;
											} else if (local1564 == 512 && local2119 == 512) {
												local1134[local1113] = arg4[local48][local71];
												local1137[local1113] = local1835.anInt7730;
												local1140[local1113] = local1835.anInt7733;
											} else if (local1564 == 512 && local2119 == 0) {
												local1134[local1113] = arg4[local48][local50];
												local1137[local1113] = local1843.anInt7730;
												local1140[local1113] = local1843.anInt7733;
											} else {
												if (local1564 < 256) {
													if (local2119 < 256) {
														local1137[local1113] = local1819.anInt7730;
														local1140[local1113] = local1819.anInt7733;
													} else {
														local1137[local1113] = local1827.anInt7730;
														local1140[local1113] = local1827.anInt7733;
													}
												} else if (local2119 < 256) {
													local1137[local1113] = local1843.anInt7730;
													local1140[local1113] = local1843.anInt7733;
												} else {
													local1137[local1113] = local1835.anInt7730;
													local1140[local1113] = local1835.anInt7733;
												}
												local2186 = Static418.method6113(arg4[local27][local50], local1564 << 7 >> 9, arg4[local48][local50]);
												local2193 = Static418.method6113(arg4[local27][local71], local1564 << 7 >> 9, arg4[local48][local71]);
												local1134[local1113] = Static418.method6113(local2186, local2119 << 7 >> 9, local2193);
											}
											if (local1125 != null) {
												local1125[local1113] = local1134[local1113];
											}
										}
										local1113++;
									}
								}
								if (local101 != 0 && local187.aBoolean675) {
									local90 = true;
								}
							}
							local1214 = arg3.method8217(local27, local50);
							local1216 = arg3.method8217(local48, local50);
							local1464 = arg3.method8217(local48, local71);
							local1470 = arg3.method8217(local27, local71);
							@Pc(2679) boolean local2679 = Static83.method1237(local27, local50);
							if (local2679 && arg5 > 1 || !local2679 && arg5 > 0) {
								@Pc(2701) boolean local2701 = true;
								if (local187 != null && !local187.aBoolean676) {
									local2701 = false;
								} else if (local123 == 0 && local101 != 0) {
									local2701 = false;
								} else if (local115 > 0 && local197 != null && !local197.aBoolean550) {
									local2701 = false;
								}
								if (local2701 && local1214 == local1216 && local1214 == local1464 && local1470 == local1214) {
									this.aByteArrayArrayArray14[arg5][local27][local50] = (byte) (this.aByteArrayArrayArray14[arg5][local27][local50] | 0x4);
								}
							}
							local1484 = 0;
							local1500 = 0;
							local1489 = 0;
							if (this.aBoolean406) {
								local1484 = Static308.method4294(local27, local50);
								local1500 = Static112.method1642(local27, local50);
								local1489 = Static53.method748(local27, local50);
							}
							arg3.U(local27, local50, local1128, local1148, local1131, local1160, local1134, local1125, local1137, local1140, local1484, local1500, local1489, local90);
							Static572.method7965(arg5, local27, local50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIII[Lclient!lka;IIILclient!et;)V")
	public final void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class226[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class2_Sub20 arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean406) {
			@Pc(18) Class226 local18 = arg4[arg6];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = arg3 + Static683.method9206(local20 & 0x7, local24 & 0x7, arg2);
					local50 = arg7 + Static666.method9085(local20 & 0x7, arg2, local24 & 0x7);
					if (local38 > 0 && this.anInt4687 - 1 > local38 && local50 > 0 && local50 < this.anInt4695 - 1) {
						local18.method5281(local50, local38);
					}
				}
			}
		}
		@Pc(108) int local108 = (arg5 & 0x7) * 8;
		@Pc(122) int local122 = (arg1 & 0x1FFFFFF8) << 3;
		local20 = (arg5 & 0x1FFFFFF8) << 3;
		@Pc(130) byte local130 = 0;
		@Pc(132) byte local132 = 0;
		if (arg2 == 1) {
			local132 = 1;
		} else if (arg2 == 2) {
			local132 = 1;
			local130 = 1;
		} else if (arg2 == 3) {
			local130 = 1;
		}
		for (local50 = 0; local50 < this.anInt4694; local50++) {
			for (@Pc(163) int local163 = 0; local163 < 64; local163++) {
				for (@Pc(167) int local167 = 0; local167 < 64; local167++) {
					if (arg0 == local50 && local11 <= local163 && local163 <= local11 + 8 && local167 >= local108 && local108 + 8 >= local167) {
						@Pc(252) int local252;
						@Pc(260) int local260;
						if (local11 + 8 == local163 || local108 + 8 == local167) {
							if (arg2 == 0) {
								local252 = arg3 + local163 - local11;
								local260 = arg7 + local167 - local108;
							} else if (arg2 == 1) {
								local260 = local11 + arg7 + 8 - local163;
								local252 = arg3 + local167 - local108;
							} else if (arg2 == 2) {
								local260 = arg7 + local108 + 8 - local167;
								local252 = local11 + arg3 + 8 - local163;
							} else {
								local252 = local108 + arg3 + 8 - local167;
								local260 = local163 + arg7 - local11;
							}
							this.method4261(local260, true, 0, local167 + local20, arg8, local122 + local163, 0, 0, arg6, local252);
						} else {
							local252 = Static683.method9206(local163 & 0x7, local167 & 0x7, arg2) + arg3;
							local260 = arg7 + Static666.method9085(local163 & 0x7, arg2, local167 & 0x7);
							this.method4261(local260, false, local132, local167 + local20, arg8, local163 + local122, arg2, local130, arg6, local252);
						}
						if (local163 == 63 || local167 == 63) {
							@Pc(400) byte local400 = 1;
							if (local163 == 63 && local167 == 63) {
								local400 = 3;
							}
							for (@Pc(416) int local416 = 0; local416 < local400; local416++) {
								@Pc(420) int local420 = local163;
								@Pc(422) int local422 = local167;
								if (local416 == 0) {
									local420 = local163 == 63 ? 64 : local163;
									local422 = local167 == 63 ? 64 : local167;
								} else if (local416 == 1) {
									local420 = 64;
								} else if (local416 == 2) {
									local422 = 64;
								}
								@Pc(483) int local483;
								@Pc(476) int local476;
								if (arg2 == 0) {
									local476 = arg7 + local422 - local108;
									local483 = arg3 + local420 - local11;
								} else if (arg2 == 1) {
									local476 = arg7 + local11 + 8 - local420;
									local483 = arg3 + local422 - local108;
								} else if (arg2 == 2) {
									local476 = local108 + arg7 + 8 - local422;
									local483 = arg3 + local11 + 8 - local420;
								} else {
									local483 = arg3 + local108 + 8 - local422;
									local476 = arg7 + local420 - local11;
								}
								if (local483 >= 0 && local483 < this.anInt4687 && local476 >= 0 && this.anInt4695 > local476) {
									this.anIntArrayArrayArray17[arg6][local483][local476] = this.anIntArrayArrayArray17[arg6][local252 + local130][local132 + local260];
								}
							}
						}
					} else {
						this.method4261(-1, false, 0, 0, arg8, 0, 0, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!ha;[Lclient!lka;I[[[I)V")
	public final void method4269(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class226[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(30) int local30;
		if (!this.aBoolean406) {
			for (@Pc(6) int local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt4687; local10++) {
					for (local14 = 0; local14 < this.anInt4695; local14++) {
						if ((Static392.aByteArrayArrayArray16[local6][local10][local14] & 0x1) != 0) {
							local30 = local6;
							if ((Static392.aByteArrayArrayArray16[1][local10][local14] & 0x2) != 0) {
								local30 = local6 - 1;
							}
							if (local30 >= 0) {
								arg1[local30].method5283(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt4694; local10++) {
			local14 = 0;
			local30 = 0;
			if (!this.aBoolean406) {
				if (Static705.aBoolean927) {
					local30 = 8;
				}
				if (Static233.aBoolean332) {
					local14 = 2;
				}
				if (Static329.anInt5040 != 0) {
					local14 |= 0x1;
					if (local10 == 0 | Static12.aBoolean27) {
						local30 |= 0x10;
					}
				}
			}
			if (Static233.aBoolean332) {
				local30 |= 0x7;
			}
			if (!Static175.aBoolean928) {
				local30 |= 0x20;
			}
			@Pc(186) int[][] local186 = arg2 == null || local10 >= arg2.length ? this.anIntArrayArrayArray17[local10] : arg2[local10];
			Static342.method4760(local10, arg0.method9679(this.anInt4687, this.anInt4695, this.anIntArrayArrayArray17[local10], local186, local14, local30));
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!et;[Lclient!lka;IBIII)V")
	public final void method4270(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(1) Class226[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(21) int local21;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(39) int local39;
		if (!this.aBoolean406) {
			for (local21 = 0; local21 < 4; local21++) {
				@Pc(27) Class226 local27 = arg1[local21];
				for (local29 = 0; local29 < 64; local29++) {
					for (local33 = 0; local33 < 64; local33++) {
						local39 = local29 + arg3;
						@Pc(43) int local43 = local33 + arg5;
						if (local39 >= 0 && this.anInt4687 > local39 && local43 >= 0 && local43 < this.anInt4695) {
							local27.method5281(local43, local39);
						}
					}
				}
			}
		}
		local21 = arg3 + arg2;
		@Pc(98) int local98 = arg5 + arg4;
		for (local29 = 0; local29 < this.anInt4694; local29++) {
			for (local33 = 0; local33 < 64; local33++) {
				for (local39 = 0; local39 < 64; local39++) {
					this.method4261(local39 + arg5, false, 0, local98 + local39, arg0, local33 + local21, 0, 0, local29, local33 + arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "([[IBI)V")
	public final void method4271(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray17[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt4687 + 1; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt4695 + 1; local18++) {
				local10[local12][local18] += arg0[local12][local18];
			}
		}
		if (-79 != -79) {
			this.aByteArrayArrayArray11 = null;
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIII)V")
	public final void method4273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(13) int local13;
		for (@Pc(7) int local7 = arg3; local7 < arg3 + arg1; local7++) {
			for (local13 = arg2; local13 < arg0 + arg2; local13++) {
				if (local13 >= 0 && this.anInt4687 > local13 && local7 >= 0 && local7 < this.anInt4695) {
					this.anIntArrayArrayArray17[arg4][local13][local7] = arg4 > 0 ? this.anIntArrayArrayArray17[arg4 - 1][local13][local7] - 960 : 0;
				}
			}
		}
		if (arg2 > 0 && this.anInt4687 > arg2) {
			for (local13 = arg3 + 1; local13 < arg3 + arg1; local13++) {
				if (local13 >= 0 && local13 < this.anInt4695) {
					this.anIntArrayArrayArray17[arg4][arg2][local13] = this.anIntArrayArrayArray17[arg4][arg2 - 1][local13];
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt4695) {
			for (local13 = arg2 + 1; local13 < arg2 + arg0; local13++) {
				if (local13 >= 0 && this.anInt4687 > local13) {
					this.anIntArrayArrayArray17[arg4][local13][arg3] = this.anIntArrayArrayArray17[arg4][local13][arg3 - 1];
				}
			}
		}
		if (arg2 < 0 || arg3 < 0 || arg2 >= this.anInt4687 || arg3 >= this.anInt4695) {
			return;
		}
		if (arg4 != 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray17[arg4 - 1][arg2 - 1][arg3] != this.anIntArrayArrayArray17[arg4][arg2 - 1][arg3]) {
				this.anIntArrayArrayArray17[arg4][arg2][arg3] = this.anIntArrayArrayArray17[arg4][arg2 - 1][arg3];
				return;
			}
			if (arg3 > 0 && this.anIntArrayArrayArray17[arg4][arg2][arg3 - 1] != this.anIntArrayArrayArray17[arg4 - 1][arg2][arg3 - 1]) {
				this.anIntArrayArrayArray17[arg4][arg2][arg3] = this.anIntArrayArrayArray17[arg4][arg2][arg3 - 1];
				return;
			}
			if (arg2 > 0 && arg3 > 0 && this.anIntArrayArrayArray17[arg4][arg2 - 1][arg3 - 1] != this.anIntArrayArrayArray17[arg4 - 1][arg2 - 1][arg3 - 1]) {
				this.anIntArrayArrayArray17[arg4][arg2][arg3] = this.anIntArrayArrayArray17[arg4][arg2 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray17[arg4][arg2 - 1][arg3] != 0) {
			this.anIntArrayArrayArray17[arg4][arg2][arg3] = this.anIntArrayArrayArray17[arg4][arg2 - 1][arg3];
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray17[arg4][arg2][arg3 - 1] != 0) {
			this.anIntArrayArrayArray17[arg4][arg2][arg3] = this.anIntArrayArrayArray17[arg4][arg2][arg3 - 1];
			return;
		}
		if (arg2 > 0 && arg3 > 0 && this.anIntArrayArrayArray17[arg4][arg2 - 1][arg3 - 1] != 0) {
			this.anIntArrayArrayArray17[arg4][arg2][arg3] = this.anIntArrayArrayArray17[arg4][arg2 - 1][arg3 - 1];
			return;
		}
	}
}
