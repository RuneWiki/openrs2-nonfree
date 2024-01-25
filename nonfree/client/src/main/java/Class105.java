import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public class Class105 {

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "[I")
	private final int[] anIntArray210 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "[I")
	private final int[] anIntArray211 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!vl", name = "z", descriptor = "Z")
	public final boolean aBoolean286;

	@OriginalMember(owner = "client!vl", name = "s", descriptor = "Lclient!hv;")
	private final Class106 aClass106_4;

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
	public final int anInt3293;

	@OriginalMember(owner = "client!vl", name = "p", descriptor = "Lclient!sg;")
	private final Class226 aClass226_8;

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
	protected final int anInt3306;

	@OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
	protected final int anInt3307;

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!vl", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!vl", name = "x", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	static {
		new Class189("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIZLclient!sg;Lclient!hv;)V")
	protected Class105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class226 arg4, @OriginalArg(5) Class106 arg5) {
		this.aBoolean286 = arg3;
		this.aClass106_4 = arg5;
		this.anInt3293 = arg0;
		this.aClass226_8 = arg4;
		this.anInt3306 = arg2;
		this.anInt3307 = arg1;
		this.anIntArrayArrayArray5 = new int[this.anInt3293][this.anInt3307 + 1][this.anInt3306 + 1];
		this.aByteArrayArrayArray10 = new byte[this.anInt3293][this.anInt3307 + 1][this.anInt3306 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt3293][this.anInt3307][this.anInt3306];
		this.aByteArrayArrayArray11 = new byte[this.anInt3293][this.anInt3307][this.anInt3306];
		this.aByteArrayArrayArray14 = new byte[this.anInt3293][this.anInt3307][this.anInt3306];
		this.aByteArrayArrayArray13 = new byte[this.anInt3293][this.anInt3307][this.anInt3306];
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILclient!cu;IIII[Lclient!br;II)V")
	public final void method2662(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class29[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg3 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(51) int local51;
		if (!this.aBoolean286) {
			@Pc(18) Class29 local18 = arg6[arg4];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = arg7 + Static373.method4872(local24 & 0x7, local20 & 0x7, arg8);
					local51 = arg2 + Static262.method3811(arg8, local20 & 0x7, local24 & 0x7);
					if (local38 > 0 && this.anInt3307 - 1 > local38 && local51 > 0 && this.anInt3306 - 1 > local51) {
						local18.method746(local38, local51);
					}
				}
			}
		}
		@Pc(93) int local93 = (arg0 & 0x7) * 8;
		@Pc(99) int local99 = (arg3 & 0x1FFFFFF8) << 3;
		local20 = (arg0 & 0x1FFFFFF8) << 3;
		@Pc(111) byte local111 = 0;
		@Pc(113) byte local113 = 0;
		if (arg8 == 1) {
			local113 = 1;
		} else if (arg8 == 2) {
			local111 = 1;
			local113 = 1;
		} else if (arg8 == 3) {
			local111 = 1;
		}
		for (local51 = 0; local51 < this.anInt3293; local51++) {
			for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
				for (@Pc(150) int local150 = 0; local150 < 64; local150++) {
					if (arg5 == local51 && local146 >= local11 && local146 <= local11 + 8 && local93 <= local150 && local150 <= local93 + 8) {
						@Pc(212) int local212;
						@Pc(219) int local219;
						if (local146 == local11 + 8 || local150 == local93 + 8) {
							if (arg8 == 0) {
								local212 = local146 + arg7 - local11;
								local219 = local150 + arg2 - local93;
							} else if (arg8 == 1) {
								local212 = arg7 + local150 - local93;
								local219 = local11 + arg2 + 8 - local146;
							} else if (arg8 == 2) {
								local212 = arg7 + local11 + 8 - local146;
								local219 = arg2 + local93 + 8 - local150;
							} else {
								local219 = arg2 + local146 - local11;
								local212 = arg7 + local93 + 8 - local150;
							}
							this.method2667(0, true, local146 + local99, arg4, 0, 0, local219, local150 + local20, arg1, local212);
						} else {
							local212 = arg7 + Static373.method4872(local150 & 0x7, local146 & 0x7, arg8);
							local219 = arg2 + Static262.method3811(arg8, local146 & 0x7, local150 & 0x7);
							this.method2667(local111, false, local146 + local99, arg4, arg8, local113, local219, local20 + local150, arg1, local212);
							if (local146 == 63 || local150 == 63) {
								@Pc(360) int local360 = local146 == 63 ? 64 : local146;
								@Pc(369) int local369 = local150 == 63 ? 64 : local150;
								@Pc(385) int local385;
								@Pc(378) int local378;
								if (arg8 == 0) {
									local378 = arg2 + local369 - local93;
									local385 = local360 + arg7 - local11;
								} else if (arg8 == 1) {
									local378 = arg2 + local11 + 8 - local360;
									local385 = local369 + arg7 - local93;
								} else if (arg8 == 2) {
									local385 = local11 + arg7 + 8 - local360;
									local378 = arg2 + local93 + 8 - local369;
								} else {
									local385 = arg7 + local93 + 8 - local369;
									local378 = local360 + arg2 - local11;
								}
								if (local385 >= 0 && this.anInt3307 > local385 && local378 >= 0 && local378 < this.anInt3306) {
									this.anIntArrayArrayArray5[arg4][local385][local378] = this.anIntArrayArrayArray5[arg4][local111 + local212][local113 + local219];
								}
							}
						}
					} else {
						this.method2667(0, false, 0, 0, 0, 0, -1, 0, arg1, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[[BLclient!qa;IILclient!sf;[[BILclient!gf;I[[BII[Z)V")
	private void method2663(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class225 arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class87 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) boolean[] arg12) {
		@Pc(48) int local48;
		if (arg7 != null && arg4 != null || arg4 != null && arg8 == 12 || arg7 != null && arg8 == 0) {
			@Pc(29) boolean[] local29 = arg7 != null && arg7.aBoolean235 ? Static366.aBooleanArrayArray7[arg8] : Static201.aBooleanArrayArray5[arg8];
			@Pc(61) Class87 local61;
			@Pc(78) byte local78;
			@Pc(94) int local94;
			@Pc(99) int local99;
			if (arg10 > 0) {
				if (arg0 > 0) {
					local48 = arg9[arg0 - 1][arg10 - 1] & 0xFF;
					if (local48 > 0) {
						local61 = this.aClass226_8.method4823(local48 - 1);
						if (local61.anInt2663 != -1 && local61.aBoolean235) {
							local78 = arg5[arg0 - 1][arg10 - 1];
							local94 = arg1[arg0 - 1][arg10 - 1] * 2 + 4 & 0x7;
							local99 = Static306.method4280(local61, arg2);
							if (Static421.aBooleanArrayArray8[local78][local94]) {
								Static97.anIntArray133[0] = local61.anInt2663;
								Static310.anIntArray370[0] = local99;
								Static181.anIntArray228[0] = arg2.method5483() ? local61.anInt2669 : local61.anInt2668;
								Static17.anIntArray51[0] = local61.anInt2670;
								Static111.anIntArray142[0] = local61.anInt2667;
								Static334.anIntArray384[0] = 256;
							}
						}
					}
				}
				if (arg6 - 1 > arg0) {
					local48 = arg9[arg0 + 1][arg10 - 1] & 0xFF;
					if (local48 > 0) {
						local61 = this.aClass226_8.method4823(local48 - 1);
						if (local61.anInt2663 != -1 && local61.aBoolean235) {
							local78 = arg5[arg0 + 1][arg10 - 1];
							local94 = arg1[arg0 + 1][arg10 - 1] * 2 + 6 & 0x7;
							local99 = Static306.method4280(local61, arg2);
							if (Static421.aBooleanArrayArray8[local78][local94]) {
								Static97.anIntArray133[2] = local61.anInt2663;
								Static310.anIntArray370[2] = local99;
								Static181.anIntArray228[2] = arg2.method5483() ? local61.anInt2669 : local61.anInt2668;
								Static17.anIntArray51[2] = local61.anInt2670;
								Static111.anIntArray142[2] = local61.anInt2667;
								Static334.anIntArray384[2] = 512;
							}
						}
					}
				}
			}
			if (arg10 < arg11 - 1) {
				if (arg0 > 0) {
					local48 = arg9[arg0 - 1][arg10 + 1] & 0xFF;
					if (local48 > 0) {
						local61 = this.aClass226_8.method4823(local48 - 1);
						if (local61.anInt2663 != -1 && local61.aBoolean235) {
							local78 = arg5[arg0 - 1][arg10 + 1];
							local94 = arg1[arg0 - 1][arg10 + 1] * 2 + 2 & 0x7;
							local99 = Static306.method4280(local61, arg2);
							if (Static421.aBooleanArrayArray8[local78][local94]) {
								Static97.anIntArray133[6] = local61.anInt2663;
								Static310.anIntArray370[6] = local99;
								Static181.anIntArray228[6] = arg2.method5483() ? local61.anInt2669 : local61.anInt2668;
								Static17.anIntArray51[6] = local61.anInt2670;
								Static111.anIntArray142[6] = local61.anInt2667;
								Static334.anIntArray384[6] = 64;
							}
						}
					}
				}
				if (arg6 - 1 > arg0) {
					local48 = arg9[arg0 + 1][arg10 + 1] & 0xFF;
					if (local48 > 0) {
						local61 = this.aClass226_8.method4823(local48 - 1);
						if (local61.anInt2663 != -1 && local61.aBoolean235) {
							local78 = arg5[arg0 + 1][arg10 + 1];
							local94 = arg1[arg0 + 1][arg10 + 1] * 2 & 0x7;
							local99 = Static306.method4280(local61, arg2);
							if (Static421.aBooleanArrayArray8[local78][local94]) {
								Static97.anIntArray133[4] = local61.anInt2663;
								Static310.anIntArray370[4] = local99;
								Static181.anIntArray228[4] = arg2.method5483() ? local61.anInt2669 : local61.anInt2668;
								Static17.anIntArray51[4] = local61.anInt2670;
								Static111.anIntArray142[4] = local61.anInt2667;
								Static334.anIntArray384[4] = 128;
							}
						}
					}
				}
			}
			@Pc(542) int local542;
			@Pc(547) int local547;
			@Pc(549) int local549;
			@Pc(509) byte local509;
			if (arg10 > 0) {
				local48 = arg9[arg0][arg10 - 1] & 0xFF;
				if (local48 > 0) {
					local61 = this.aClass226_8.method4823(local48 - 1);
					if (local61.anInt2663 != -1) {
						local78 = arg5[arg0][arg10 - 1];
						local509 = arg1[arg0][arg10 - 1];
						if (local61.aBoolean235) {
							local99 = 2;
							local542 = local509 * 2 + 4;
							local547 = Static306.method4280(local61, arg2);
							for (local549 = 0; local549 < 3; local549++) {
								local99 &= 0x7;
								local542 &= 0x7;
								if (Static421.aBooleanArrayArray8[local78][local542] && Static111.anIntArray142[local99] <= local61.anInt2667) {
									Static97.anIntArray133[local99] = local61.anInt2663;
									Static310.anIntArray370[local99] = local547;
									Static181.anIntArray228[local99] = arg2.method5483() ? local61.anInt2669 : local61.anInt2668;
									Static17.anIntArray51[local99] = local61.anInt2670;
									if (local61.anInt2667 == Static111.anIntArray142[local99]) {
										Static334.anIntArray384[local99] |= 0x20;
									} else {
										Static334.anIntArray384[local99] = 32;
									}
									Static111.anIntArray142[local99] = local61.anInt2667;
								}
								local542++;
								local99--;
							}
							if (!local29[arg3 & 0x3]) {
								arg12[0] = Static366.aBooleanArrayArray7[local78][local509 + 2 & 0x3];
							}
						} else if (!local29[--arg3 & 0x3]) {
							arg12[0] = Static201.aBooleanArrayArray5[local78][local509 + 2 & 0x3];
						}
					}
				}
			}
			if (arg10 < arg11 - 1) {
				local48 = arg9[arg0][arg10 + 1] & 0xFF;
				if (local48 > 0) {
					local61 = this.aClass226_8.method4823(local48 - 1);
					if (local61.anInt2663 != -1) {
						local78 = arg5[arg0][arg10 + 1];
						local509 = arg1[arg0][arg10 + 1];
						if (local61.aBoolean235) {
							local99 = 4;
							local542 = local509 * 2 + 2;
							local547 = Static306.method4280(local61, arg2);
							for (local549 = 0; local549 < 3; local549++) {
								local542 &= 0x7;
								local99 &= 0x7;
								if (Static421.aBooleanArrayArray8[local78][local542] && Static111.anIntArray142[local99] <= local61.anInt2667) {
									Static97.anIntArray133[local99] = local61.anInt2663;
									Static310.anIntArray370[local99] = local547;
									Static181.anIntArray228[local99] = arg2.method5483() ? local61.anInt2669 : local61.anInt2668;
									Static17.anIntArray51[local99] = local61.anInt2670;
									if (Static111.anIntArray142[local99] == local61.anInt2667) {
										Static334.anIntArray384[local99] |= 0x10;
									} else {
										Static334.anIntArray384[local99] = 16;
									}
									Static111.anIntArray142[local99] = local61.anInt2667;
								}
								local542--;
								local99++;
							}
							if (!local29[arg3 + 2 & 0x3]) {
								arg12[2] = Static366.aBooleanArrayArray7[local78][local509 & 0x3];
							}
						} else if (!local29[arg3 + 2 & 0x3]) {
							arg12[2] = Static201.aBooleanArrayArray5[local78][local509 & 0x3];
						}
					}
				}
			}
			if (arg0 > 0) {
				local48 = arg9[arg0 - 1][arg10] & 0xFF;
				if (local48 > 0) {
					local61 = this.aClass226_8.method4823(local48 - 1);
					if (local61.anInt2663 != -1) {
						local78 = arg5[arg0 - 1][arg10];
						local509 = arg1[arg0 - 1][arg10];
						if (local61.aBoolean235) {
							local99 = 6;
							local542 = local509 * 2 + 4;
							local547 = Static306.method4280(local61, arg2);
							for (local549 = 0; local549 < 3; local549++) {
								local542 &= 0x7;
								local99 &= 0x7;
								if (Static421.aBooleanArrayArray8[local78][local542] && local61.anInt2667 >= Static111.anIntArray142[local99]) {
									Static97.anIntArray133[local99] = local61.anInt2663;
									Static310.anIntArray370[local99] = local547;
									Static181.anIntArray228[local99] = arg2.method5483() ? local61.anInt2669 : local61.anInt2668;
									Static17.anIntArray51[local99] = local61.anInt2670;
									if (Static111.anIntArray142[local99] == local61.anInt2667) {
										Static334.anIntArray384[local99] |= 0x8;
									} else {
										Static334.anIntArray384[local99] = 8;
									}
									Static111.anIntArray142[local99] = local61.anInt2667;
								}
								local542--;
								local99++;
							}
							if (!local29[arg3 + 3 & 0x3]) {
								arg12[3] = Static366.aBooleanArrayArray7[local78][local509 + 1 & 0x3];
							}
						} else if (!local29[arg3 + 3 & 0x3]) {
							arg12[3] = Static201.aBooleanArrayArray5[local78][local509 + 1 & 0x3];
						}
					}
				}
			}
			if (arg0 < arg6 - 1) {
				local48 = arg9[arg0 + 1][arg10] & 0xFF;
				if (local48 > 0) {
					local61 = this.aClass226_8.method4823(local48 - 1);
					if (local61.anInt2663 != -1) {
						local78 = arg5[arg0 + 1][arg10];
						local509 = arg1[arg0 + 1][arg10];
						if (local61.aBoolean235) {
							local99 = 4;
							local542 = local509 * 2 + 6;
							local547 = Static306.method4280(local61, arg2);
							for (local549 = 0; local549 < 3; local549++) {
								local542 &= 0x7;
								local99 &= 0x7;
								if (Static421.aBooleanArrayArray8[local78][local542] && Static111.anIntArray142[local99] <= local61.anInt2667) {
									Static97.anIntArray133[local99] = local61.anInt2663;
									Static310.anIntArray370[local99] = local547;
									Static181.anIntArray228[local99] = arg2.method5483() ? local61.anInt2669 : local61.anInt2668;
									Static17.anIntArray51[local99] = local61.anInt2670;
									if (Static111.anIntArray142[local99] == local61.anInt2667) {
										Static334.anIntArray384[local99] |= 0x4;
									} else {
										Static334.anIntArray384[local99] = 4;
									}
									Static111.anIntArray142[local99] = local61.anInt2667;
								}
								local542++;
								local99--;
							}
							if (!local29[arg3 + 1 & 0x3]) {
								arg12[1] = Static366.aBooleanArrayArray7[local78][local509 + 3 & 0x3];
							}
						} else if (!local29[arg3 + 1 & 0x3]) {
							arg12[1] = Static201.aBooleanArrayArray5[local78][local509 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg7 == null) {
			return;
		}
		@Pc(1244) int local1244 = Static306.method4280(arg7, arg2);
		if (!arg7.aBoolean235) {
			return;
		}
		for (local48 = 0; local48 < 8; local48++) {
			@Pc(1260) int local1260 = local48 - arg3 * 2 & 0x7;
			if (Static421.aBooleanArrayArray8[arg8][local48] && Static111.anIntArray142[local1260] <= arg7.anInt2667) {
				Static97.anIntArray133[local1260] = arg7.anInt2663;
				Static310.anIntArray370[local1260] = local1244;
				Static181.anIntArray228[local1260] = arg2.method5483() ? arg7.anInt2669 : arg7.anInt2668;
				Static17.anIntArray51[local1260] = arg7.anInt2670;
				if (arg7.anInt2667 == Static111.anIntArray142[local1260]) {
					Static334.anIntArray384[local1260] |= 0x2;
				} else {
					Static334.anIntArray384[local1260] = 2;
				}
				Static111.anIntArray142[local1260] = arg7.anInt2667;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!na;BLclient!qa;Lclient!na;)V")
	public final void method2664(@OriginalArg(0) Class159 arg0, @OriginalArg(2) Class172 arg1, @OriginalArg(3) Class159 arg2) {
		if (Static378.anIntArray406 == null || Static378.anIntArray406.length != this.anInt3306) {
			Static378.anIntArray406 = new int[this.anInt3306];
			Static318.anIntArray510 = new int[this.anInt3306];
			Static262.anIntArray327 = new int[this.anInt3306];
			Static421.anIntArray500 = new int[this.anInt3306];
			Static206.anIntArray258 = new int[this.anInt3306];
		}
		@Pc(42) int[][] local42 = new int[this.anInt3307][this.anInt3306];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt3293; local44++) {
			for (local48 = 0; local48 < this.anInt3306; local48++) {
				Static378.anIntArray406[local48] = 0;
				Static318.anIntArray510[local48] = 0;
				Static421.anIntArray500[local48] = 0;
				Static262.anIntArray327[local48] = 0;
				Static206.anIntArray258[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt3307; local81++) {
				@Pc(91) int local91;
				@Pc(110) int local110;
				@Pc(179) int local179;
				for (@Pc(85) int local85 = 0; local85 < this.anInt3306; local85++) {
					local91 = local81 + 5;
					@Pc(156) int local156;
					if (this.anInt3307 > local91) {
						local110 = this.aByteArrayArrayArray15[local44][local91][local85] & 0xFF;
						if (local110 > 0) {
							@Pc(120) Class225 local120 = this.aClass106_4.method2690(local110 - 1);
							Static378.anIntArray406[local85] += local120.anInt6173;
							Static318.anIntArray510[local85] += local120.anInt6174;
							Static421.anIntArray500[local85] += local120.anInt6169;
							Static262.anIntArray327[local85] += local120.anInt6166;
							local156 = Static206.anIntArray258[local85]++;
						}
					}
					local110 = local81 - 5;
					if (local110 >= 0) {
						local179 = this.aByteArrayArrayArray15[local44][local110][local85] & 0xFF;
						if (local179 > 0) {
							@Pc(189) Class225 local189 = this.aClass106_4.method2690(local179 - 1);
							Static378.anIntArray406[local85] -= local189.anInt6173;
							Static318.anIntArray510[local85] -= local189.anInt6174;
							Static421.anIntArray500[local85] -= local189.anInt6169;
							Static262.anIntArray327[local85] -= local189.anInt6166;
							local156 = Static206.anIntArray258[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local110 = 0;
					local179 = 0;
					@Pc(250) int local250 = 0;
					@Pc(252) int local252 = 0;
					for (@Pc(254) int local254 = -5; local254 < this.anInt3306; local254++) {
						@Pc(260) int local260 = local254 + 5;
						if (local260 < this.anInt3306) {
							local250 += Static262.anIntArray327[local260];
							local110 += Static318.anIntArray510[local260];
							local252 += Static206.anIntArray258[local260];
							local91 += Static378.anIntArray406[local260];
							local179 += Static421.anIntArray500[local260];
						}
						@Pc(298) int local298 = local254 - 5;
						if (local298 >= 0) {
							local250 -= Static262.anIntArray327[local298];
							local179 -= Static421.anIntArray500[local298];
							local110 -= Static318.anIntArray510[local298];
							local252 -= Static206.anIntArray258[local298];
							local91 -= Static378.anIntArray406[local298];
						}
						if (local254 >= 0 && local250 > 0 && local252 > 0) {
							local42[local81][local254] = Static155.method2512(local110 / local252, local91 * 256 / local250, local179 / local252);
						}
					}
				}
			}
			if (Static387.aBoolean560) {
				this.method2666(local44 == 0 ? arg2 : null, local44, Static444.aClass159Array3[local44], local42, arg1, local44 == 0 ? arg0 : null);
			} else {
				this.method2669(local44 == 0 ? arg0 : null, local44, arg1, local44 == 0 ? arg2 : null, local42, Static444.aClass159Array3[local44]);
			}
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray13[local44] = null;
			this.aByteArrayArrayArray14[local44] = null;
		}
		if (!this.aBoolean286) {
			if (Static72.anInt1822 != 0) {
				Static69.method1368();
			}
			if (Static204.aBoolean340) {
				Static371.method4861();
			}
		}
		for (local48 = 0; local48 < this.anInt3293; local48++) {
			Static444.aClass159Array3[local48].f();
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "([Lclient!br;IILclient!cu;III)V")
	public final void method2665(@OriginalArg(0) Class29[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(29) int local29;
		if (!this.aBoolean286) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class29 local16 = arg0[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local29 = arg1 + local18;
						@Pc(33) int local33 = local22 + arg4;
						if (local29 >= 0 && this.anInt3307 > local29 && local33 >= 0 && this.anInt3306 > local33) {
							local16.method746(local29, local33);
						}
					}
				}
			}
		}
		local10 = arg1 + arg2;
		@Pc(83) int local83 = arg4 + arg5;
		for (local18 = 0; local18 < this.anInt3293; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local29 = 0; local29 < 64; local29++) {
					this.method2667(0, false, local10 + local22, local18, 0, 0, local29 + arg4, local83 - -local29, arg3, arg1 + local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!na;IBLclient!na;[[ILclient!qa;Lclient!na;)V")
	private void method2666(@OriginalArg(0) Class159 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class159 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) Class172 arg4, @OriginalArg(6) Class159 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray13[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray14[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray15[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray11[arg1];
		for (@Pc(31) int local31 = 0; local31 < this.anInt3307; local31++) {
			@Pc(49) int local49 = this.anInt3307 - 1 <= local31 ? local31 : local31 + 1;
			for (@Pc(51) int local51 = 0; local51 < this.anInt3306; local51++) {
				@Pc(69) int local69 = this.anInt3306 - 1 <= local51 ? local51 : local51 + 1;
				if (Static419.anInt6868 == -1 || Static222.method3354(local51, local31, arg1, Static419.anInt6868)) {
					@Pc(84) boolean local84 = false;
					@Pc(86) boolean local86 = false;
					@Pc(89) boolean[] local89 = new boolean[4];
					@Pc(95) int local95 = local10[local31][local51];
					@Pc(101) int local101 = local15[local31][local51];
					@Pc(109) int local109 = local25[local31][local51] & 0xFF;
					@Pc(117) int local117 = local20[local31][local51] & 0xFF;
					@Pc(125) int local125 = local20[local31][local69] & 0xFF;
					@Pc(133) int local133 = local20[local49][local69] & 0xFF;
					@Pc(141) int local141 = local20[local49][local51] & 0xFF;
					if (local109 != 0 || local117 != 0) {
						@Pc(163) Class87 local163 = local109 == 0 ? null : this.aClass226_8.method4823(local109 - 1);
						@Pc(175) Class225 local175 = local117 == 0 ? null : this.aClass106_4.method2690(local117 - 1);
						if (local95 == 0 && local163 == null) {
							local95 = 12;
						}
						@Pc(186) Class87 local186 = local163;
						if (local163 != null) {
							if (local163.anInt2663 == -1 && local163.anInt2662 == -1) {
								local186 = local163;
								local163 = null;
							} else if (local175 != null && local95 != 0) {
								local86 = local163.aBoolean235;
							}
						}
						@Pc(280) int local280;
						@Pc(339) int local339;
						@Pc(393) int local393;
						@Pc(403) int local403;
						if ((local95 == 0 || local95 == 12) && local31 > 0 && local51 > 0 && local31 < this.anInt3307 && this.anInt3306 > local51) {
							@Pc(259) int local259 = local117 == local20[local49][local69] ? 1 : -1;
							local280 = local20[local31 - 1][local51 - 1] == local117 ? 1 : -1;
							@Pc(301) int local301 = local20[local49][local51 - 1] == local117 ? 1 : -1;
							if (local20[local31][local51 - 1] == local117) {
								local301++;
								local280++;
							} else {
								local280--;
								local301--;
							}
							local339 = local20[local31 - 1][local69] == local117 ? 1 : -1;
							if (local20[local49][local51] == local117) {
								local259++;
								local301++;
							} else {
								local259--;
								local301--;
							}
							if (local117 == local20[local31][local69]) {
								local339++;
								local259++;
							} else {
								local339--;
								local259--;
							}
							if (local117 == local20[local31 - 1][local51]) {
								local280++;
								local339++;
							} else {
								local339--;
								local280--;
							}
							local393 = local280 - local259;
							if (local393 < 0) {
								local393 = -local393;
							}
							local403 = local301 - local339;
							if (local403 < 0) {
								local403 = -local403;
							}
							if (local403 == local393) {
								local393 = arg2.I(local31, local51) - arg2.I(local49, local69);
								if (local393 < 0) {
									local393 = -local393;
								}
								local403 = arg2.I(local49, local51) - arg2.I(local31, local69);
								if (local403 < 0) {
									local403 = -local403;
								}
							}
							local101 = local403 <= local393 ? 0 : 1;
						}
						for (local280 = 0; local280 < 13; local280++) {
							Static111.anIntArray142[local280] = -1;
							Static334.anIntArray384[local280] = 1;
						}
						@Pc(485) boolean[] local485 = local163 != null && local163.aBoolean235 ? Static366.aBooleanArrayArray7[local95] : Static201.aBooleanArrayArray5[local95];
						this.method2663(local31, local15, arg4, local101, local175, local10, this.anInt3307, local163, local95, local25, local51, this.anInt3306, local89);
						@Pc(514) boolean local514 = local163 != null && local163.anInt2662 != local163.anInt2663;
						if (!local514) {
							for (local339 = 0; local339 < 8; local339++) {
								if (Static111.anIntArray142[local339] >= 0 && Static97.anIntArray133[local339] != Static310.anIntArray370[local339]) {
									local514 = true;
									break;
								}
							}
						}
						if (!local485[local101 + 1 & 0x3]) {
							local89[1] = Static223.method5948(local89[1], (Static334.anIntArray384[4] & Static334.anIntArray384[2]) == 0);
						}
						if (!local485[local101 + 3 & 0x3]) {
							local89[3] = Static223.method5948(local89[3], (Static334.anIntArray384[0] & Static334.anIntArray384[6]) == 0);
						}
						if (!local485[local101 & 0x3]) {
							local89[0] = Static223.method5948(local89[0], (Static334.anIntArray384[0] & Static334.anIntArray384[2]) == 0);
						}
						if (!local485[local101 + 2 & 0x3]) {
							local89[2] = Static223.method5948(local89[2], (Static334.anIntArray384[6] & Static334.anIntArray384[4]) == 0);
						}
						if (!local86 && (local95 == 0 || local95 == 12)) {
							if (local89[0] && !local89[1] && !local89[2] && local89[3]) {
								local95 = local95 == 0 ? 13 : 14;
								local89[0] = local89[3] = false;
								local101 = 0;
							} else if (local89[0] && local89[1] && !local89[2] && !local89[3]) {
								local101 = 3;
								local95 = local95 == 0 ? 13 : 14;
								local89[0] = local89[1] = false;
							} else if (!local89[0] && local89[1] && local89[2] && !local89[3]) {
								local95 = local95 == 0 ? 13 : 14;
								local89[1] = local89[2] = false;
								local101 = 2;
							} else if (!local89[0] && !local89[1] && local89[2] && local89[3]) {
								local95 = local95 == 0 ? 13 : 14;
								local89[2] = local89[3] = false;
								local101 = 1;
							}
						}
						@Pc(827) boolean local827 = !local86 && !local89[0] && !local89[2] && !local89[1] && !local89[3];
						@Pc(829) int[] local829 = null;
						@Pc(837) int[] local837;
						@Pc(853) int[] local853;
						@Pc(849) int[] local849;
						if (local827) {
							local837 = Static117.anIntArrayArray16[local95];
							local393 = local175 == null ? 0 : Static156.anIntArray202[local95];
							local853 = Static360.anIntArrayArray42[local95];
							local403 = local163 == null ? 0 : Static408.anIntArray459[local95];
							local849 = Static338.anIntArrayArray41[local95];
						} else if (local86) {
							local837 = Static308.anIntArrayArray38[local95];
							local403 = local163 == null ? 0 : Static355.anIntArray393[local95];
							local849 = Static401.anIntArrayArray47[local95];
							local853 = Static310.anIntArrayArray39[local95];
							local393 = local175 == null ? 0 : Static274.anIntArray341[local95];
							local829 = Static423.anIntArrayArray53[local95];
						} else {
							local403 = local163 == null ? 0 : Static126.anIntArray158[local95];
							local829 = Static133.anIntArrayArray20[local95];
							local393 = local175 == null ? 0 : Static333.anIntArray380[local95];
							local849 = Static426.anIntArrayArray54[local95];
							local837 = Static383.anIntArrayArray44[local95];
							local853 = Static168.anIntArrayArray22[local95];
						}
						@Pc(931) int local931 = local393 + local403;
						if (local931 <= 0) {
							Static136.method2168(arg1, local31, local51);
						} else {
							if (local89[0]) {
								local931++;
							}
							if (local89[2]) {
								local931++;
							}
							if (local89[1]) {
								local931++;
							}
							if (local89[3]) {
								local931++;
							}
							@Pc(961) int local961 = 0;
							@Pc(963) int local963 = 0;
							@Pc(967) int local967 = local931 * 3;
							@Pc(974) int[] local974 = local514 ? new int[local967] : null;
							@Pc(977) int[] local977 = new int[local967];
							@Pc(980) int[] local980 = new int[local967];
							@Pc(983) int[] local983 = new int[local967];
							@Pc(986) int[] local986 = new int[local967];
							@Pc(989) int[] local989 = new int[local967];
							@Pc(996) int[] local996 = arg5 == null ? null : new int[local967];
							@Pc(1005) int[] local1005 = arg5 == null && arg0 == null ? null : new int[local967];
							@Pc(1007) int local1007 = -1;
							@Pc(1009) int local1009 = -1;
							@Pc(1011) int local1011 = 256;
							@Pc(1111) byte local1111;
							@Pc(1061) int local1061;
							@Pc(1063) int local1063;
							@Pc(1302) int local1302;
							@Pc(1308) int local1308;
							@Pc(1316) int local1316;
							@Pc(1321) int local1321;
							@Pc(1343) int local1343;
							@Pc(1326) int local1326;
							@Pc(1345) int local1345;
							@Pc(1394) int local1394;
							@Pc(1400) int local1400;
							if (local163 != null) {
								local1007 = local163.anInt2663;
								local1009 = arg4.method5483() ? local163.anInt2669 : local163.anInt2668;
								local1011 = local163.anInt2670;
								local1061 = Static306.method4280(local163, arg4);
								for (local1063 = 0; local1063 < local403; local1063++) {
									if (local89[-local101 & 0x3] && local961 == local829[0]) {
										Static208.anIntArray264[0] = local837[local961];
										Static208.anIntArray264[1] = 1;
										Static208.anIntArray264[2] = local849[local961];
										Static208.anIntArray264[3] = 1;
										Static208.anIntArray264[4] = local853[local961];
										local1111 = 6;
										Static208.anIntArray264[5] = local849[local961];
									} else if (local89[2 - local101 & 0x3] && local961 == local829[2]) {
										Static208.anIntArray264[0] = local837[local961];
										Static208.anIntArray264[1] = 5;
										Static208.anIntArray264[2] = local849[local961];
										Static208.anIntArray264[3] = 5;
										Static208.anIntArray264[4] = local853[local961];
										Static208.anIntArray264[5] = local849[local961];
										local1111 = 6;
									} else if (local89[1 - local101 & 0x3] && local829[1] == local961) {
										Static208.anIntArray264[0] = local837[local961];
										Static208.anIntArray264[1] = 3;
										Static208.anIntArray264[2] = local849[local961];
										Static208.anIntArray264[3] = 3;
										Static208.anIntArray264[4] = local853[local961];
										Static208.anIntArray264[5] = local849[local961];
										local1111 = 6;
									} else if (local89[3 - local101 & 0x3] && local961 == local829[3]) {
										Static208.anIntArray264[0] = local837[local961];
										Static208.anIntArray264[1] = 7;
										Static208.anIntArray264[2] = local849[local961];
										Static208.anIntArray264[3] = 7;
										Static208.anIntArray264[4] = local853[local961];
										Static208.anIntArray264[5] = local849[local961];
										local1111 = 6;
									} else {
										Static208.anIntArray264[0] = local837[local961];
										Static208.anIntArray264[1] = local853[local961];
										Static208.anIntArray264[2] = local849[local961];
										local1111 = 3;
									}
									local961++;
									for (local1302 = 0; local1302 < local1111; local1302++) {
										local1308 = Static208.anIntArray264[local1302];
										local1316 = local1308 - local101 * 2 & 0x7;
										local1321 = this.anIntArray211[local1308];
										local1326 = this.anIntArray210[local1308];
										if (local101 == 1) {
											local1345 = 128 - local1321;
											local1343 = local1326;
										} else if (local101 == 2) {
											local1345 = 128 - local1326;
											local1343 = 128 - local1321;
										} else if (local101 == 3) {
											local1343 = 128 - local1326;
											local1345 = local1321;
										} else {
											local1345 = local1326;
											local1343 = local1321;
										}
										local977[local963] = local1343;
										local980[local963] = local1345;
										if (local996 != null && Static421.aBooleanArrayArray8[local95][local1308]) {
											local1394 = local1343 + (local31 << 7);
											local1400 = local1345 + (local51 << 7);
											local996[local963] = arg5.va(local1394, local1400) - arg2.va(local1394, local1400);
										}
										if (local1005 != null) {
											if (arg5 != null && !Static421.aBooleanArrayArray8[local95][local1308]) {
												local1394 = local1343 + (local31 << 7);
												local1400 = (local51 << 7) + local1345;
												local1005[local963] = arg2.va(local1394, local1400) - arg5.va(local1394, local1400);
											} else if (arg0 != null && !Static64.aBooleanArrayArray4[local95][local1308]) {
												local1394 = local1343 + (local31 << 7);
												local1400 = local1345 + (local51 << 7);
												local1005[local963] = arg0.va(local1394, local1400) - arg2.va(local1394, local1400);
											}
										}
										if (local1308 < 8 && Static111.anIntArray142[local1316] > local163.anInt2667) {
											if (local974 != null) {
												local974[local963] = Static310.anIntArray370[local1316];
											}
											local989[local963] = Static17.anIntArray51[local1316];
											local986[local963] = Static181.anIntArray228[local1316];
											local983[local963] = Static97.anIntArray133[local1316];
										} else {
											if (local974 != null) {
												local974[local963] = local1061;
											}
											local986[local963] = arg4.method5483() ? local163.anInt2669 : local163.anInt2668;
											local989[local963] = local163.anInt2670;
											local983[local963] = local1007;
										}
										local963++;
									}
								}
								if (!this.aBoolean286 && arg1 == 0) {
									Static382.method1461(local31, local51, local163.anInt2666, local163.anInt2661 * 8, local163.anInt2664);
								}
								if (local95 != 12 && local163.anInt2663 != -1 && local163.aBoolean234) {
									local84 = true;
								}
							} else if (local827) {
								local961 = Static408.anIntArray459[local95];
							} else if (local86) {
								local961 = Static355.anIntArray393[local95];
							} else {
								local961 = Static126.anIntArray158[local95];
							}
							if (local175 != null) {
								if (local141 == 0) {
									local141 = local117;
								}
								if (local125 == 0) {
									local125 = local117;
								}
								if (local133 == 0) {
									local133 = local117;
								}
								@Pc(1618) Class225 local1618 = this.aClass106_4.method2690(local117 - 1);
								@Pc(1626) Class225 local1626 = this.aClass106_4.method2690(local125 - 1);
								@Pc(1634) Class225 local1634 = this.aClass106_4.method2690(local133 - 1);
								@Pc(1642) Class225 local1642 = this.aClass106_4.method2690(local141 - 1);
								for (local1316 = 0; local1316 < local393; local1316++) {
									if (local89[-local101 & 0x3] && local829[0] == local961) {
										Static208.anIntArray264[0] = local837[local961];
										Static208.anIntArray264[1] = 1;
										Static208.anIntArray264[2] = local849[local961];
										Static208.anIntArray264[3] = 1;
										Static208.anIntArray264[4] = local853[local961];
										Static208.anIntArray264[5] = local849[local961];
										local1111 = 6;
									} else if (local89[2 - local101 & 0x3] && local829[2] == local961) {
										Static208.anIntArray264[0] = local837[local961];
										Static208.anIntArray264[1] = 5;
										Static208.anIntArray264[2] = local849[local961];
										Static208.anIntArray264[3] = 5;
										Static208.anIntArray264[4] = local853[local961];
										local1111 = 6;
										Static208.anIntArray264[5] = local849[local961];
									} else if (local89[1 - local101 & 0x3] && local829[1] == local961) {
										Static208.anIntArray264[0] = local837[local961];
										Static208.anIntArray264[1] = 3;
										Static208.anIntArray264[2] = local849[local961];
										Static208.anIntArray264[3] = 3;
										Static208.anIntArray264[4] = local853[local961];
										local1111 = 6;
										Static208.anIntArray264[5] = local849[local961];
									} else if (local89[3 - local101 & 0x3] && local829[3] == local961) {
										Static208.anIntArray264[0] = local837[local961];
										Static208.anIntArray264[1] = 7;
										Static208.anIntArray264[2] = local849[local961];
										Static208.anIntArray264[3] = 7;
										Static208.anIntArray264[4] = local853[local961];
										Static208.anIntArray264[5] = local849[local961];
										local1111 = 6;
									} else {
										Static208.anIntArray264[0] = local837[local961];
										Static208.anIntArray264[1] = local853[local961];
										local1111 = 3;
										Static208.anIntArray264[2] = local849[local961];
									}
									for (local1321 = 0; local1321 < local1111; local1321++) {
										local1343 = Static208.anIntArray264[local1321];
										local1326 = local1343 - local101 * 2 & 0x7;
										local1345 = this.anIntArray211[local1343];
										local1400 = this.anIntArray210[local1343];
										@Pc(1916) int local1916;
										if (local101 == 1) {
											local1394 = local1400;
											local1916 = 128 - local1345;
										} else if (local101 == 2) {
											local1394 = 128 - local1345;
											local1916 = 128 - local1400;
										} else if (local101 == 3) {
											local1394 = 128 - local1400;
											local1916 = local1345;
										} else {
											local1394 = local1345;
											local1916 = local1400;
										}
										local977[local963] = local1394;
										local980[local963] = local1916;
										@Pc(1974) int local1974;
										@Pc(1980) int local1980;
										if (local996 != null && Static421.aBooleanArrayArray8[local95][local1343]) {
											local1974 = (local31 << 7) + local1394;
											local1980 = (local51 << 7) + local1916;
											local996[local963] = arg5.va(local1974, local1980) - arg2.va(local1974, local1980);
										}
										if (local1005 != null) {
											if (arg5 != null && !Static421.aBooleanArrayArray8[local95][local1343]) {
												local1974 = (local31 << 7) + local1394;
												local1980 = (local51 << 7) + local1916;
												local1005[local963] = arg2.va(local1974, local1980) - arg5.va(local1974, local1980);
											} else if (arg0 != null && !Static64.aBooleanArrayArray4[local95][local1343]) {
												local1974 = (local31 << 7) + local1394;
												local1980 = local1916 + (local51 << 7);
												local1005[local963] = arg0.va(local1974, local1980) - arg2.va(local1974, local1980);
											}
										}
										if (local1343 < 8 && Static111.anIntArray142[local1326] >= 0) {
											if (local974 != null) {
												local974[local963] = Static310.anIntArray370[local1326];
											}
											local989[local963] = Static17.anIntArray51[local1326];
											local986[local963] = Static181.anIntArray228[local1326];
											local983[local963] = Static97.anIntArray133[local1326];
										} else {
											if (local86 && Static421.aBooleanArrayArray8[local95][local1343]) {
												local986[local963] = local1009;
												local989[local963] = local1011;
												local983[local963] = local1007;
											} else if (local1394 == 0 && local1916 == 0) {
												local983[local963] = arg3[local31][local51];
												local986[local963] = local1618.anInt6168;
												local989[local963] = local1618.anInt6170;
											} else if (local1394 == 0 && local1916 == 128) {
												local983[local963] = arg3[local31][local69];
												local986[local963] = local1626.anInt6168;
												local989[local963] = local1626.anInt6170;
											} else if (local1394 == 128 && local1916 == 128) {
												local983[local963] = arg3[local49][local69];
												local986[local963] = local1634.anInt6168;
												local989[local963] = local1634.anInt6170;
											} else if (local1394 == 128 && local1916 == 0) {
												local983[local963] = arg3[local49][local51];
												local986[local963] = local1642.anInt6168;
												local989[local963] = local1642.anInt6170;
											} else {
												if (local1394 < 64) {
													if (local1916 < 64) {
														local986[local963] = local1618.anInt6168;
														local989[local963] = local1618.anInt6170;
													} else {
														local986[local963] = local1626.anInt6168;
														local989[local963] = local1626.anInt6170;
													}
												} else if (local1916 < 64) {
													local986[local963] = local1642.anInt6168;
													local989[local963] = local1642.anInt6170;
												} else {
													local986[local963] = local1634.anInt6168;
													local989[local963] = local1634.anInt6170;
												}
												local1974 = Static36.method724(local1394 << 7 >> 7, arg3[local49][local51], arg3[local31][local51]);
												local1980 = Static36.method724(local1394 << 7 >> 7, arg3[local49][local69], arg3[local31][local69]);
												local983[local963] = Static36.method724(local1916 << 7 >> 7, local1980, local1974);
											}
											if (local974 != null) {
												local974[local963] = local983[local963];
											}
										}
										local963++;
									}
									local961++;
								}
								if (local95 != 0 && local175.aBoolean535) {
									local84 = true;
								}
							}
							local1061 = arg2.I(local31, local51);
							local1063 = arg2.I(local49, local51);
							local1302 = arg2.I(local49, local69);
							local1308 = arg2.I(local31, local69);
							if (arg1 > 0) {
								@Pc(2385) boolean local2385 = true;
								if (local117 == 0 && local95 != 0) {
									local2385 = false;
								}
								if (local109 > 0 && local186 != null && !local186.aBoolean233) {
									local2385 = false;
								}
								if (local2385 && local1063 == local1061 && local1061 == local1302 && local1061 == local1308) {
									this.aByteArrayArrayArray10[arg1][local31][local51] = (byte) (this.aByteArrayArrayArray10[arg1][local31][local51] | 0x4);
								}
							}
							local1316 = 0;
							local1321 = 0;
							local1343 = 0;
							if (this.aBoolean286) {
								local1316 = Static376.method4927(local31, local51);
								local1321 = Static239.method1376(local31, local51);
								local1343 = Static121.method1960(local31, local51);
							}
							arg2.JA(local31, local51, local977, local996, local980, local1005, local983, local974, local986, local989, local1316, local1321, local1343, local84);
							Static136.method2168(arg1, local31, local51);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZIIIIIIILclient!cu;I)V")
	private void method2667(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class3_Sub7 arg8, @OriginalArg(10) int arg9) {
		if (arg4 == 1) {
			arg5 = 1;
		} else if (arg4 == 2) {
			arg0 = 1;
			arg5 = 1;
		} else if (arg4 == 3) {
			arg0 = 1;
		}
		@Pc(68) int local68;
		if (arg9 < 0 || this.anInt3307 <= arg9 || arg6 < 0 || arg6 >= this.anInt3306) {
			while (true) {
				local68 = arg8.method2582();
				if (local68 == 0) {
					return;
				}
				if (local68 == 1) {
					arg8.method2582();
					return;
				}
				if (local68 <= 49) {
					arg8.method2582();
				}
			}
			return;
		}
		if (!this.aBoolean286 && !arg1) {
			Static9.aByteArrayArrayArray1[arg3][arg9][arg6] = 0;
		}
		while (true) {
			local68 = arg8.method2582();
			if (local68 == 0) {
				if (this.aBoolean286) {
					this.anIntArrayArrayArray5[0][arg9 + arg0][arg6 + arg5] = 0;
					return;
				} else if (arg3 == 0) {
					this.anIntArrayArrayArray5[0][arg0 + arg9][arg6 + arg5] = -Static100.method1758(arg2 + 932731, arg7 + 556238) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray5[arg3][arg0 + arg9][arg5 + arg6] = this.anIntArrayArrayArray5[arg3 - 1][arg0 + arg9][arg6 + arg5] - 240;
					return;
				}
			}
			if (local68 == 1) {
				@Pc(160) int local160 = arg8.method2582();
				if (!this.aBoolean286) {
					if (local160 == 1) {
						local160 = 0;
					}
					if (arg3 != 0) {
						this.anIntArrayArrayArray5[arg3][arg9 + arg0][arg5 + arg6] = this.anIntArrayArrayArray5[arg3 - 1][arg9 + arg0][arg5 + arg6] - (local160 * 8 << 0);
						return;
					}
					this.anIntArrayArrayArray5[0][arg0 + arg9][arg5 + arg6] = -local160 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray5[0][arg0 + arg9][arg6 + arg5] = local160 * 8 << 0;
				return;
			}
			if (local68 <= 49) {
				if (arg1) {
					arg8.method2582();
				} else {
					this.aByteArrayArrayArray11[arg3][arg9][arg6] = arg8.method2612();
					this.aByteArrayArrayArray13[arg3][arg9][arg6] = (byte) ((local68 - 2) / 4);
					this.aByteArrayArrayArray14[arg3][arg9][arg6] = (byte) (local68 + arg4 - 2 & 0x3);
				}
			} else if (local68 <= 81) {
				if (!this.aBoolean286 && !arg1) {
					Static9.aByteArrayArrayArray1[arg3][arg9][arg6] = (byte) (local68 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray15[arg3][arg9][arg6] = (byte) (local68 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!na;BILclient!qa;Lclient!na;[[ILclient!na;)V")
	private void method2669(@OriginalArg(0) Class159 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class172 arg2, @OriginalArg(4) Class159 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class159 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3307; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt3306; local7++) {
				if (Static419.anInt6868 == -1 || Static222.method3354(local7, local3, arg1, Static419.anInt6868)) {
					@Pc(30) byte local30 = this.aByteArrayArrayArray13[arg1][local3][local7];
					@Pc(39) byte local39 = this.aByteArrayArrayArray14[arg1][local3][local7];
					@Pc(50) int local50 = this.aByteArrayArrayArray11[arg1][local3][local7] & 0xFF;
					@Pc(61) int local61 = this.aByteArrayArrayArray15[arg1][local3][local7] & 0xFF;
					@Pc(73) Class87 local73 = local50 == 0 ? null : this.aClass226_8.method4823(local50 - 1);
					@Pc(85) Class225 local85 = local61 == 0 ? null : this.aClass106_4.method2690(local61 - 1);
					@Pc(87) int local87 = 0;
					@Pc(89) int local89 = 0;
					if (local30 != 0) {
						local87 = local85 == null ? 0 : Static156.anIntArray202[local30];
						local89 = local73 == null ? 0 : Static408.anIntArray459[local30];
					} else if (local73 != null) {
						local89 = Static408.anIntArray459[local30];
					} else if (local85 != null) {
						local87 = Static408.anIntArray459[local30];
					}
					@Pc(130) int local130 = local87 + local89;
					@Pc(132) int local132 = 0;
					if (local130 != 0) {
						@Pc(140) int[] local140 = new int[local130];
						@Pc(143) int[] local143 = new int[local130];
						@Pc(146) int[] local146 = new int[local130];
						@Pc(149) int[] local149 = new int[local130];
						@Pc(151) boolean local151 = false;
						@Pc(168) int local168;
						@Pc(196) int local196;
						if (local73 == null || local73.anInt2663 == -1 && local73.anInt2662 == -1 && local73.anInt2669 == -1) {
							for (local168 = 0; local168 < local89; local168++) {
								local140[local132] = -1;
								local132++;
							}
						} else {
							local168 = arg2.method5483() ? local73.anInt2669 : local73.anInt2668;
							if (Static177.aBoolean303) {
								local168 = -1;
							}
							for (local196 = 0; local196 < local89; local196++) {
								local146[local132] = local168;
								local149[local132] = local73.anInt2670;
								if (local73.anInt2663 == -1) {
									local140[local132] = -1;
								} else {
									local140[local132] = local73.anInt2663;
								}
								if (local73.anInt2662 == -1) {
									local143[local132] = -1;
								} else {
									local151 = true;
									local143[local132] = local73.anInt2662;
								}
								local132++;
							}
							if (!this.aBoolean286 && arg1 == 0) {
								Static382.method1461(local3, local7, local73.anInt2666, local73.anInt2661 * 8, local73.anInt2664);
							}
						}
						if (!local151) {
							local143 = null;
						}
						if (local85 == null) {
							for (local168 = 0; local168 < local87; local168++) {
								local140[local132] = -1;
								local132++;
							}
						} else {
							local168 = local85.anInt6168;
							if (Static177.aBoolean303) {
								local168 = -1;
							}
							for (local196 = 0; local196 < local87; local196++) {
								local146[local132] = local168;
								local149[local132] = local85.anInt6170;
								local140[local132] = arg4[local3][local7];
								if (local143 != null) {
									local143[local132] = -1;
								}
								local132++;
							}
						}
						local168 = this.anIntArray211.length;
						@Pc(333) int[] local333 = new int[local168];
						@Pc(336) int[] local336 = new int[local168];
						@Pc(343) int[] local343 = arg0 == null ? null : new int[local168];
						@Pc(352) int[] local352 = arg0 == null && arg3 == null ? null : new int[local168];
						@Pc(361) int local361;
						@Pc(366) int local366;
						@Pc(451) int local451;
						@Pc(457) int local457;
						for (@Pc(354) int local354 = 0; local354 < local168; local354++) {
							local361 = this.anIntArray211[local354];
							local366 = this.anIntArray210[local354];
							if (local39 == 0) {
								local333[local354] = local361;
								local336[local354] = local366;
							} else if (local39 == 1) {
								local333[local354] = local366;
								local336[local354] = 128 - local361;
							} else if (local39 == 2) {
								local333[local354] = 128 - local361;
								local336[local354] = 128 - local366;
							} else if (local39 == 3) {
								local333[local354] = 128 - local366;
								local336[local354] = local361;
							}
							if (local343 != null && Static421.aBooleanArrayArray8[local30][local354]) {
								local451 = (local3 << 7) + local361;
								local457 = local361 + (local7 << 7);
								local343[local354] = arg0.va(local451, local457) - arg5.va(local451, local457);
							}
							if (local352 != null) {
								if (arg0 != null && !Static421.aBooleanArrayArray8[local30][local354]) {
									local451 = (local3 << 7) + local361;
									local457 = local361 + (local7 << 7);
									local352[local354] = arg5.va(local451, local457) - arg0.va(local451, local457);
								} else if (arg3 != null && !Static64.aBooleanArrayArray4[local30][local354]) {
									local451 = local361 + (local3 << 7);
									local457 = (local7 << 7) + local361;
									local352[local354] = arg3.va(local451, local457) - arg5.va(local451, local457);
								}
							}
						}
						local361 = arg5.I(local3, local7);
						local366 = arg5.I(local3 + 1, local7);
						local451 = arg5.I(local3 + 1, local7 + 1);
						local457 = arg5.I(local3, local7 + 1);
						if (arg1 > 0) {
							@Pc(575) boolean local575 = true;
							if (local61 == 0 && local30 != 0) {
								local575 = false;
							}
							if (local50 > 0 && local73 != null && !local73.aBoolean233) {
								local575 = false;
							}
							if (local575 && local361 == local366 && local451 == local361 && local361 == local457) {
								this.aByteArrayArrayArray10[arg1][local3][local7] = (byte) (this.aByteArrayArrayArray10[arg1][local3][local7] | 0x4);
							}
						}
						@Pc(632) int local632 = 0;
						@Pc(634) int local634 = 0;
						@Pc(636) int local636 = 0;
						if (this.aBoolean286) {
							local632 = Static376.method4927(local3, local7);
							local634 = Static239.method1376(local3, local7);
							local636 = Static121.method1960(local3, local7);
						}
						arg5.method4829(local3, local7, local333, local343, local336, local352, Static117.anIntArrayArray16[local30], Static360.anIntArrayArray42[local30], Static338.anIntArrayArray41[local30], local140, local143, local146, local149, local632, local634, local636);
						Static136.method2168(arg1, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
	public final void method2670(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3293; local1++) {
			this.method2675(arg0, 64, arg1, local1, 64);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II[[I)V")
	public final void method2672(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray5[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt3307 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt3306 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!qa;[Lclient!br;[[[II)V")
	public final void method2674(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class29[] arg1, @OriginalArg(2) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean286) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt3307; local14++) {
					for (local18 = 0; local18 < this.anInt3306; local18++) {
						if ((Static9.aByteArrayArrayArray1[local10][local14][local18] & 0x1) != 0) {
							@Pc(35) int local35 = local10;
							if ((Static9.aByteArrayArrayArray1[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg1[local35].method758(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt3293; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean286) {
				if (Static204.aBoolean340) {
					local14 = 2;
				}
				if (Static436.aBoolean633) {
					local18 = 8;
				}
				if (Static72.anInt1822 != 0) {
					if (local10 == 0 | Static388.aBoolean563) {
						local18 |= 0x10;
					}
					local14 |= 0x1;
				}
			}
			if (Static204.aBoolean340) {
				local18 |= 0x7;
			}
			if (!Static382.aBoolean155) {
				local18 |= 0x20;
			}
			@Pc(164) int[][] local164 = arg2 == null || arg2.length <= local10 ? this.anIntArrayArrayArray5[local10] : arg2[local10];
			Static379.method4944(local10, arg0.method5519(this.anInt3307, this.anInt3306, this.anIntArrayArrayArray5[local10], local164, local14, local18));
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIII)V")
	public final void method2675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + arg1; local7++) {
			for (local11 = arg2; local11 < arg2 + arg4; local11++) {
				if (local11 >= 0 && local11 < this.anInt3307 && local7 >= 0 && this.anInt3306 > local7) {
					this.anIntArrayArrayArray5[arg3][local11][local7] = arg3 > 0 ? this.anIntArrayArrayArray5[arg3 - 1][local11][local7] - 240 : 0;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt3307) {
			for (local11 = arg0 + 1; local11 < arg1 + arg0; local11++) {
				if (local11 >= 0 && local11 < this.anInt3306) {
					this.anIntArrayArrayArray5[arg3][arg2][local11] = this.anIntArrayArrayArray5[arg3][arg2 - 1][local11];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt3306) {
			for (local11 = arg2 + 1; local11 < arg2 + arg4; local11++) {
				if (local11 >= 0 && local11 < this.anInt3307) {
					this.anIntArrayArrayArray5[arg3][local11][arg0] = this.anIntArrayArrayArray5[arg3][local11][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || arg2 >= this.anInt3307 || arg0 >= this.anInt3306) {
			return;
		}
		if (arg3 != 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray5[arg3 - 1][arg2 - 1][arg0] != this.anIntArrayArrayArray5[arg3][arg2 - 1][arg0]) {
				this.anIntArrayArrayArray5[arg3][arg2][arg0] = this.anIntArrayArrayArray5[arg3][arg2 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray5[arg3][arg2][arg0 - 1] != this.anIntArrayArrayArray5[arg3 - 1][arg2][arg0 - 1]) {
				this.anIntArrayArrayArray5[arg3][arg2][arg0] = this.anIntArrayArrayArray5[arg3][arg2][arg0 - 1];
				return;
			}
			if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray5[arg3][arg2 - 1][arg0 - 1] != this.anIntArrayArrayArray5[arg3 - 1][arg2 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray5[arg3][arg2][arg0] = this.anIntArrayArrayArray5[arg3][arg2 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray5[arg3][arg2 - 1][arg0] != 0) {
			this.anIntArrayArrayArray5[arg3][arg2][arg0] = this.anIntArrayArrayArray5[arg3][arg2 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray5[arg3][arg2][arg0 - 1] != 0) {
			this.anIntArrayArrayArray5[arg3][arg2][arg0] = this.anIntArrayArrayArray5[arg3][arg2][arg0 - 1];
			return;
		}
		if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray5[arg3][arg2 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray5[arg3][arg2][arg0] = this.anIntArrayArrayArray5[arg3][arg2 - 1][arg0 - 1];
			return;
		}
	}
}
