import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public class Class268 {

	@OriginalMember(owner = "client!qca", name = "B", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!qca", name = "l", descriptor = "[I")
	private final int[] anIntArray473 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!qca", name = "F", descriptor = "[I")
	private final int[] anIntArray474 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "I")
	public final int anInt7987;

	@OriginalMember(owner = "client!qca", name = "r", descriptor = "Lclient!dp;")
	private final Class71 aClass71_5;

	@OriginalMember(owner = "client!qca", name = "j", descriptor = "Z")
	public final boolean aBoolean552;

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
	protected final int anInt7981;

	@OriginalMember(owner = "client!qca", name = "x", descriptor = "Lclient!kca;")
	private final Class171 aClass171_6;

	@OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
	protected final int anInt7982;

	@OriginalMember(owner = "client!qca", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!qca", name = "q", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!qca", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!qca", name = "n", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!qca", name = "y", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(IIIZLclient!kca;Lclient!dp;)V")
	protected Class268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class171 arg4, @OriginalArg(5) Class71 arg5) {
		this.anInt7987 = arg0;
		this.aClass71_5 = arg5;
		this.aBoolean552 = arg3;
		this.anInt7981 = arg2;
		this.aClass171_6 = arg4;
		this.anInt7982 = arg1;
		this.aByteArrayArrayArray14 = new byte[this.anInt7987][this.anInt7982][this.anInt7981];
		this.aByteArrayArrayArray12 = new byte[this.anInt7987][this.anInt7982][this.anInt7981];
		this.aByteArrayArrayArray16 = new byte[this.anInt7987][this.anInt7982 + 1][this.anInt7981 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt7987][this.anInt7982][this.anInt7981];
		this.aByteArrayArrayArray15 = new byte[this.anInt7987][this.anInt7982][this.anInt7981];
		this.anIntArrayArrayArray12 = new int[this.anInt7987][this.anInt7982 + 1][this.anInt7981 + 1];
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I[[II)V")
	public final void method6288(@OriginalArg(1) int[][] arg0) {
		@Pc(15) int[][] local15 = this.anIntArrayArrayArray12[0];
		for (@Pc(17) int local17 = 0; local17 < this.anInt7982 + 1; local17++) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt7981 + 1; local21++) {
				local15[local17][local21] += arg0[local17][local21];
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIII)V")
	public final void method6289(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt7987; local15++) {
			this.method6298(arg0, arg1, local15);
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I[Lclient!nc;Lclient!ie;IIIIIII)V")
	public final void method6290(@OriginalArg(0) int arg0, @OriginalArg(1) Class220[] arg1, @OriginalArg(2) Class3_Sub26 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(17) int local17 = (arg5 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean552) {
			@Pc(24) Class220 local24 = arg1[arg4];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static137.method2668(arg7, local26 & 0x7, local30 & 0x7) + arg3;
					local56 = Static511.method6874(arg7, local26 & 0x7, local30 & 0x7) + arg0;
					if (local44 > 0 && local44 < this.anInt7982 - 1 && local56 > 0 && this.anInt7981 - 1 > local56) {
						local24.method5080(local56, local44);
					}
				}
			}
		}
		@Pc(98) int local98 = (arg8 & 0xFFFFFFF8) << 3;
		local26 = (arg5 & 0x1FFFFFF8) << 3;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (arg7 == 1) {
			local108 = 1;
		} else if (arg7 == 2) {
			local108 = 1;
			local106 = 1;
		} else if (arg7 == 3) {
			local106 = 1;
		}
		for (local56 = 0; local56 < this.anInt7987; local56++) {
			for (@Pc(140) int local140 = 0; local140 < 64; local140++) {
				for (@Pc(144) int local144 = 0; local144 < 64; local144++) {
					if (local56 == arg6 && local11 <= local140 && local140 <= local11 + 8 && local17 <= local144 && local17 + 8 >= local144) {
						@Pc(214) int local214;
						@Pc(207) int local207;
						if (local11 + 8 == local140 || local17 + 8 == local144) {
							if (arg7 == 0) {
								local214 = arg3 + local140 - local11;
								local207 = arg0 + local144 - local17;
							} else if (arg7 == 1) {
								local207 = arg0 + local11 + 8 - local140;
								local214 = local144 + arg3 - local17;
							} else if (arg7 == 2) {
								local207 = arg0 + local17 + 8 - local144;
								local214 = arg3 + local11 + 8 - local140;
							} else {
								local207 = arg0 + local140 - local11;
								local214 = arg3 + local17 + 8 - local144;
							}
							this.method6293(local26 + local144, 0, 0, local214, local140 + local98, arg4, arg2, 0, local207, true);
						} else {
							local214 = Static137.method2668(arg7, local140 & 0x7, local144 & 0x7) + arg3;
							local207 = Static511.method6874(arg7, local140 & 0x7, local144 & 0x7) + arg0;
							this.method6293(local26 + local144, local108, arg7, local214, local98 + local140, arg4, arg2, local106, local207, false);
						}
						if (local140 == 63 || local144 == 63) {
							@Pc(349) byte local349 = 1;
							if (local140 == 63 && local144 == 63) {
								local349 = 3;
							}
							for (@Pc(361) int local361 = 0; local361 < local349; local361++) {
								@Pc(365) int local365 = local140;
								@Pc(367) int local367 = local144;
								if (local361 == 0) {
									local367 = local144 == 63 ? 64 : local144;
									local365 = local140 == 63 ? 64 : local140;
								} else if (local361 == 1) {
									local365 = 64;
								} else if (local361 == 2) {
									local367 = 64;
								}
								@Pc(414) int local414;
								@Pc(421) int local421;
								if (arg7 == 0) {
									local414 = local365 + arg3 - local11;
									local421 = arg0 + local367 - local17;
								} else if (arg7 == 1) {
									local421 = local11 + arg0 + 8 - local365;
									local414 = local367 + arg3 - local17;
								} else if (arg7 == 2) {
									local414 = arg3 + local11 + 8 - local365;
									local421 = arg0 + local17 + 8 - local367;
								} else {
									local421 = local365 + arg0 - local11;
									local414 = local17 + arg3 + 8 - local367;
								}
								if (local414 >= 0 && local414 < this.anInt7982 && local421 >= 0 && this.anInt7981 > local421) {
									this.anIntArrayArrayArray12[arg4][local414][local421] = this.anIntArrayArrayArray12[arg4][local214 + local106][local207 + local108];
								}
							}
						}
					} else {
						this.method6293(0, 0, 0, -1, 0, 0, arg2, 0, -1, false);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!i;Lclient!i;ILclient!r;[[ILclient!i;I)V")
	private void method6292(@OriginalArg(0) Class127 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) Class127 arg5) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt7982; local13++) {
			for (@Pc(17) int local17 = 0; local17 < this.anInt7981; local17++) {
				if (Static10.anInt87 == -1 || Static321.method4740(local17, Static10.anInt87, arg2, local13)) {
					@Pc(41) byte local41 = this.aByteArrayArrayArray12[arg2][local13][local17];
					@Pc(50) byte local50 = this.aByteArrayArrayArray13[arg2][local13][local17];
					@Pc(61) int local61 = this.aByteArrayArrayArray15[arg2][local13][local17] & 0xFF;
					@Pc(72) int local72 = this.aByteArrayArrayArray14[arg2][local13][local17] & 0xFF;
					@Pc(84) Class88 local84 = local61 == 0 ? null : this.aClass171_6.method4161(local61 - 1);
					@Pc(99) Class188 local99 = local72 == 0 ? null : this.aClass71_5.method2109(local72 - 1);
					@Pc(101) int local101 = 0;
					@Pc(103) int local103 = 0;
					if (local41 != 0) {
						local101 = local99 == null ? 0 : Static414.anIntArray421[local41];
						local103 = local84 == null ? 0 : Static539.anIntArray540[local41];
					} else if (local84 != null) {
						local103 = Static539.anIntArray540[local41];
					} else if (local99 != null) {
						local101 = Static539.anIntArray540[local41];
					}
					@Pc(141) int local141 = local103 + local101;
					@Pc(143) int local143 = 0;
					if (local141 != 0) {
						@Pc(157) int local157;
						if (Static525.aBoolean623) {
							local157 = local84 == null ? -1 : local84.anInt2807;
						} else {
							local157 = -1;
						}
						@Pc(164) int[] local164 = new int[local141];
						@Pc(167) int[] local167 = new int[local141];
						@Pc(170) int[] local170 = new int[local141];
						@Pc(173) int[] local173 = new int[local141];
						@Pc(175) boolean local175 = false;
						@Pc(192) int local192;
						if (local84 == null || local84.anInt2812 == -1 && local84.anInt2815 == -1 && local157 == -1) {
							for (local192 = 0; local192 < local103; local192++) {
								local164[local143] = -1;
								local143++;
							}
						} else {
							for (local192 = 0; local192 < local103; local192++) {
								local170[local143] = local157;
								local173[local143] = local84.anInt2818;
								if (local84.anInt2812 == -1) {
									local164[local143] = -1;
								} else {
									local164[local143] = local84.anInt2812;
								}
								if (local84.anInt2815 == -1) {
									local167[local143] = -1;
								} else {
									local175 = true;
									local167[local143] = local84.anInt2815;
								}
								local143++;
							}
							if (!this.aBoolean552 && arg2 == 0) {
								Static105.method2177(local13, local17, local84.anInt2819, local84.anInt2820 * 8, local84.anInt2813);
							}
						}
						if (!local175) {
							local167 = null;
						}
						if (local99 == null) {
							for (local192 = 0; local192 < local101; local192++) {
								local164[local143] = -1;
								local143++;
							}
						} else {
							local192 = local99.anInt5711;
							if (Static525.aBoolean623) {
								local192 = -1;
							}
							for (@Pc(296) int local296 = 0; local296 < local101; local296++) {
								local170[local143] = local192;
								local173[local143] = local99.anInt5721;
								local164[local143] = arg4[local13][local17];
								if (local167 != null) {
									local167[local143] = -1;
								}
								local143++;
							}
						}
						local192 = this.anIntArray474.length;
						@Pc(352) int[] local352 = new int[local192];
						@Pc(355) int[] local355 = new int[local192];
						@Pc(362) int[] local362 = arg1 == null ? null : new int[local192];
						@Pc(371) int[] local371 = arg1 == null && arg5 == null ? null : new int[local192];
						@Pc(380) int local380;
						@Pc(385) int local385;
						@Pc(468) int local468;
						@Pc(474) int local474;
						for (@Pc(373) int local373 = 0; local373 < local192; local373++) {
							local380 = this.anIntArray474[local373];
							local385 = this.anIntArray473[local373];
							if (local50 == 0) {
								local352[local373] = local380;
								local355[local373] = local385;
							} else if (local50 == 1) {
								local352[local373] = local385;
								local355[local373] = 512 - local380;
							} else if (local50 == 2) {
								local352[local373] = 512 - local380;
								local355[local373] = 512 - local385;
							} else if (local50 == 3) {
								local352[local373] = 512 - local385;
								local355[local373] = local380;
							}
							if (local362 != null && Static288.aBooleanArrayArray5[local41][local373]) {
								local468 = (local13 << 9) + local380;
								local474 = local380 + (local17 << 9);
								local362[local373] = arg1.method7860(local474, local468) - arg0.method7860(local474, local468);
							}
							if (local371 != null) {
								if (arg1 != null && !Static288.aBooleanArrayArray5[local41][local373]) {
									local468 = local380 + (local13 << 9);
									local474 = local380 + (local17 << 9);
									local371[local373] = arg0.method7860(local474, local468) - arg1.method7860(local474, local468);
								} else if (arg5 != null && !Static352.aBooleanArrayArray7[local41][local373]) {
									local468 = local380 + (local13 << 9);
									local474 = local380 + (local17 << 9);
									local371[local373] = arg5.method7860(local474, local468) - arg0.method7860(local474, local468);
								}
							}
						}
						local380 = arg0.method7862(local17, local13);
						local385 = arg0.method7862(local17, local13 + 1);
						local468 = arg0.method7862(local17 + 1, local13 + 1);
						local474 = arg0.method7862(local17 + 1, local13);
						@Pc(612) boolean local612 = Static269.method4098(local13, local17);
						if (local612 && arg2 > 1 || !local612 && arg2 > 0) {
							@Pc(625) boolean local625 = true;
							if (local99 != null && !local99.aBoolean390) {
								local625 = false;
							} else if (local72 == 0 && local41 != 0) {
								local625 = false;
							} else if (local61 > 0 && local84 != null && !local84.aBoolean193) {
								local625 = false;
							}
							if (local625 && local380 == local385 && local380 == local468 && local380 == local474) {
								this.aByteArrayArrayArray16[arg2][local13][local17] = (byte) (this.aByteArrayArrayArray16[arg2][local13][local17] | 0x4);
							}
						}
						@Pc(697) int local697 = 0;
						@Pc(699) int local699 = 0;
						@Pc(701) int local701 = 0;
						if (this.aBoolean552) {
							local697 = Static192.method3362(local13, local17);
							local699 = Static93.method1989(local13, local17);
							local701 = Static443.method6173(local13, local17);
						}
						arg0.method7858(local13, local17, local352, local362, local355, local371, Static346.anIntArrayArray65[local41], Static4.anIntArrayArray1[local41], Static544.anIntArrayArray96[local41], local164, local167, local170, local173, local697, local699, local701);
						Static125.method2370(arg2, local13, local17);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIIIILclient!ie;IIZ)V")
	private void method6293(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3_Sub26 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (arg2 == 1) {
			arg1 = 1;
		} else if (arg2 == 2) {
			arg1 = 1;
			arg7 = 1;
		} else if (arg2 == 3) {
			arg7 = 1;
		}
		@Pc(68) int local68;
		if (arg3 < 0 || arg3 >= this.anInt7982 || arg8 < 0 || this.anInt7981 <= arg8) {
			while (true) {
				local68 = arg6.method6814();
				if (local68 == 0) {
					return;
				}
				if (local68 == 1) {
					arg6.method6814();
					return;
				}
				if (local68 <= 49) {
					arg6.method6814();
				}
			}
			return;
		}
		if (!this.aBoolean552 && !arg9) {
			Static428.aByteArrayArrayArray4[arg5][arg3][arg8] = 0;
		}
		while (true) {
			local68 = arg6.method6814();
			if (local68 == 0) {
				if (this.aBoolean552) {
					this.anIntArrayArrayArray12[0][arg3 + arg7][arg8 + arg1] = 0;
					return;
				} else if (arg5 == 0) {
					this.anIntArrayArrayArray12[0][arg7 + arg3][arg8 + arg1] = -Static454.method6252(arg4 + 932731, arg0 + 556238) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray12[arg5][arg3 + arg7][arg1 + arg8] = this.anIntArrayArrayArray12[arg5 - 1][arg3 + arg7][arg8 + arg1] - 960;
					return;
				}
			}
			if (local68 == 1) {
				@Pc(157) int local157 = arg6.method6814();
				if (this.aBoolean552) {
					this.anIntArrayArrayArray12[0][arg3 + arg7][arg1 + arg8] = local157 * 8 << 2;
					return;
				}
				if (local157 == 1) {
					local157 = 0;
				}
				if (arg5 == 0) {
					this.anIntArrayArrayArray12[0][arg7 + arg3][arg8 + arg1] = -local157 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray12[arg5][arg7 + arg3][arg8 + arg1] = this.anIntArrayArrayArray12[arg5 - 1][arg3 + arg7][arg8 + arg1] - (local157 * 8 << 2);
				return;
			}
			if (local68 <= 49) {
				if (arg9) {
					arg6.method6814();
				} else {
					this.aByteArrayArrayArray15[arg5][arg3][arg8] = arg6.method6825();
					this.aByteArrayArrayArray12[arg5][arg3][arg8] = (byte) ((local68 - 2) / 4);
					this.aByteArrayArrayArray13[arg5][arg3][arg8] = (byte) (arg2 + local68 - 2 & 0x3);
				}
			} else if (local68 <= 81) {
				if (!this.aBoolean552 && !arg9) {
					Static428.aByteArrayArrayArray4[arg5][arg3][arg8] = (byte) (local68 - 49);
				}
			} else if (!arg9) {
				this.aByteArrayArrayArray14[arg5][arg3][arg8] = (byte) (local68 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!i;Lclient!i;Lclient!r;B)V")
	public final void method6294(@OriginalArg(0) Class127 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class31 arg2) {
		if (Static517.anIntArray530 == null || this.anInt7981 != Static517.anIntArray530.length) {
			Static285.anIntArray253 = new int[this.anInt7981];
			Static517.anIntArray530 = new int[this.anInt7981];
			Static466.anIntArray478 = new int[this.anInt7981];
			Static129.anIntArray106 = new int[this.anInt7981];
			Static245.anIntArray227 = new int[this.anInt7981];
		}
		@Pc(42) int[][] local42 = new int[this.anInt7982][this.anInt7981];
		@Pc(56) int local56;
		for (@Pc(44) int local44 = 0; local44 < this.anInt7987; local44++) {
			for (local56 = 0; local56 < this.anInt7981; local56++) {
				Static517.anIntArray530[local56] = 0;
				Static466.anIntArray478[local56] = 0;
				Static245.anIntArray227[local56] = 0;
				Static285.anIntArray253[local56] = 0;
				Static129.anIntArray106[local56] = 0;
			}
			for (@Pc(89) int local89 = -5; local89 < this.anInt7982; local89++) {
				@Pc(99) int local99;
				@Pc(114) int local114;
				@Pc(180) int local180;
				for (@Pc(93) int local93 = 0; local93 < this.anInt7981; local93++) {
					local99 = local89 + 5;
					@Pc(160) int local160;
					if (local99 < this.anInt7982) {
						local114 = this.aByteArrayArrayArray14[local44][local99][local93] & 0xFF;
						if (local114 > 0) {
							@Pc(124) Class188 local124 = this.aClass71_5.method2109(local114 - 1);
							Static517.anIntArray530[local93] += local124.anInt5716;
							Static466.anIntArray478[local93] += local124.anInt5718;
							Static245.anIntArray227[local93] += local124.anInt5717;
							Static285.anIntArray253[local93] += local124.anInt5714;
							local160 = Static129.anIntArray106[local93]++;
						}
					}
					local114 = local89 - 5;
					if (local114 >= 0) {
						local180 = this.aByteArrayArrayArray14[local44][local114][local93] & 0xFF;
						if (local180 > 0) {
							@Pc(190) Class188 local190 = this.aClass71_5.method2109(local180 - 1);
							Static517.anIntArray530[local93] -= local190.anInt5716;
							Static466.anIntArray478[local93] -= local190.anInt5718;
							Static245.anIntArray227[local93] -= local190.anInt5717;
							Static285.anIntArray253[local93] -= local190.anInt5714;
							local160 = Static129.anIntArray106[local93]--;
						}
					}
				}
				if (local89 >= 0) {
					local99 = 0;
					local114 = 0;
					local180 = 0;
					@Pc(251) int local251 = 0;
					@Pc(253) int local253 = 0;
					for (@Pc(255) int local255 = -5; local255 < this.anInt7981; local255++) {
						@Pc(261) int local261 = local255 + 5;
						if (this.anInt7981 > local261) {
							local99 += Static517.anIntArray530[local261];
							local251 += Static285.anIntArray253[local261];
							local253 += Static129.anIntArray106[local261];
							local114 += Static466.anIntArray478[local261];
							local180 += Static245.anIntArray227[local261];
						}
						@Pc(299) int local299 = local255 - 5;
						if (local299 >= 0) {
							local180 -= Static245.anIntArray227[local299];
							local99 -= Static517.anIntArray530[local299];
							local253 -= Static129.anIntArray106[local299];
							local114 -= Static466.anIntArray478[local299];
							local251 -= Static285.anIntArray253[local299];
						}
						if (local255 >= 0 && local251 > 0 && local253 > 0) {
							local42[local89][local255] = Static142.method2743(local99 * 256 / local251, local180 / local253, local114 / local253);
						}
					}
				}
			}
			if (Static498.aBoolean528) {
				this.method6299(Static256.aClass127Array3[local44], local44, local42, arg2, local44 == 0 ? arg0 : null, local44 == 0 ? arg1 : null);
			} else {
				this.method6292(Static256.aClass127Array3[local44], local44 == 0 ? arg1 : null, local44, arg2, local42, local44 == 0 ? arg0 : null);
			}
			this.aByteArrayArrayArray14[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray13[local44] = null;
		}
		if (!this.aBoolean552) {
			if (Static6.anInt45 != 0) {
				Static228.method3734();
			}
			if (Static167.aBoolean472) {
				Static254.method3975();
			}
		}
		for (local56 = 0; local56 < this.anInt7987; local56++) {
			Static256.aClass127Array3[local56].BA();
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "([Lclient!nc;ILclient!r;[[[I)V")
	public final void method6295(@OriginalArg(0) Class220[] arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (!this.aBoolean552) {
			for (local29 = 0; local29 < 4; local29++) {
				for (local33 = 0; local33 < this.anInt7982; local33++) {
					for (local37 = 0; local37 < this.anInt7981; local37++) {
						if ((Static428.aByteArrayArrayArray4[local29][local33][local37] & 0x1) != 0) {
							@Pc(54) int local54 = local29;
							if ((Static428.aByteArrayArrayArray4[1][local33][local37] & 0x2) != 0) {
								local54 = local29 - 1;
							}
							if (local54 >= 0) {
								arg0[local54].method5087(local33, local37);
							}
						}
					}
				}
			}
		}
		for (local29 = 0; local29 < this.anInt7987; local29++) {
			local33 = 0;
			local37 = 0;
			if (!this.aBoolean552) {
				if (Static167.aBoolean472) {
					local33 = 2;
				}
				if (Static266.aBoolean332) {
					local37 = 8;
				}
				if (Static6.anInt45 != 0) {
					if (local29 == 0 | Static331.aBoolean426) {
						local37 |= 0x10;
					}
					local33 |= 0x1;
				}
			}
			if (Static167.aBoolean472) {
				local37 |= 0x7;
			}
			if (!Static385.aBoolean469) {
				local37 |= 0x20;
			}
			@Pc(164) int[][] local164 = arg2 == null || arg2.length <= local29 ? this.anIntArrayArrayArray12[local29] : arg2[local29];
			Static158.method2896(local29, arg1.method8077(this.anInt7982, this.anInt7981, this.anIntArrayArrayArray12[local29], local164, local33, local37));
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "([Lclient!nc;IILclient!ie;III)V")
	public final void method6296(@OriginalArg(0) Class220[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub26 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(29) int local29;
		if (!this.aBoolean552) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class220 local16 = arg0[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local29 = arg5 + local18;
						@Pc(33) int local33 = local22 + arg1;
						if (local29 >= 0 && this.anInt7982 > local29 && local33 >= 0 && this.anInt7981 > local33) {
							local16.method5080(local33, local29);
						}
					}
				}
			}
		}
		local10 = arg4 + arg5;
		@Pc(82) int local82 = arg1 + arg2;
		for (local18 = 0; local18 < this.anInt7987; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local29 = 0; local29 < 64; local29++) {
					this.method6293(local82 + local29, 0, 0, arg5 + local22, local22 + local10, local18, arg3, 0, arg1 + local29, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!r;BILclient!ega;[[BI[[B[Z[[BIILclient!lj;II)V")
	private void method6297(@OriginalArg(0) Class31 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class88 arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) boolean[] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class188 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(24) boolean[] local24 = arg2 != null && arg2.aBoolean194 ? Static507.aBooleanArrayArray9[arg1] : Static244.aBooleanArrayArray4[arg1];
		@Pc(43) int local43;
		@Pc(56) Class88 local56;
		@Pc(73) byte local73;
		@Pc(89) int local89;
		@Pc(96) int local96;
		if (arg11 > 0) {
			if (arg8 > 0) {
				local43 = arg5[arg8 - 1][arg11 - 1] & 0xFF;
				if (local43 > 0) {
					local56 = this.aClass171_6.method4161(local43 - 1);
					if (local56.anInt2812 != -1 && local56.aBoolean194) {
						local73 = arg3[arg8 - 1][arg11 - 1];
						local89 = arg7[arg8 - 1][arg11 - 1] * 2 + 4 & 0x7;
						local96 = Static12.method113(arg0, local56);
						if (Static288.aBooleanArrayArray5[local73][local89]) {
							Static123.anIntArray99[0] = local56.anInt2812;
							Static340.anIntArray342[0] = local96;
							Static77.anIntArray67[0] = local56.anInt2807;
							Static4.anIntArray2[0] = local56.anInt2818;
							Static493.anIntArray505[0] = local56.anInt2816;
							Static106.anIntArray87[0] = 256;
						}
					}
				}
			}
			if (arg4 - 1 > arg8) {
				local43 = arg5[arg8 + 1][arg11 - 1] & 0xFF;
				if (local43 > 0) {
					local56 = this.aClass171_6.method4161(local43 - 1);
					if (local56.anInt2812 != -1 && local56.aBoolean194) {
						local73 = arg3[arg8 + 1][arg11 - 1];
						local89 = arg7[arg8 + 1][arg11 - 1] * 2 + 6 & 0x7;
						local96 = Static12.method113(arg0, local56);
						if (Static288.aBooleanArrayArray5[local73][local89]) {
							Static123.anIntArray99[2] = local56.anInt2812;
							Static340.anIntArray342[2] = local96;
							Static77.anIntArray67[2] = local56.anInt2807;
							Static4.anIntArray2[2] = local56.anInt2818;
							Static493.anIntArray505[2] = local56.anInt2816;
							Static106.anIntArray87[2] = 512;
						}
					}
				}
			}
		}
		if (arg9 - 1 > arg11) {
			if (arg8 > 0) {
				local43 = arg5[arg8 - 1][arg11 + 1] & 0xFF;
				if (local43 > 0) {
					local56 = this.aClass171_6.method4161(local43 - 1);
					if (local56.anInt2812 != -1 && local56.aBoolean194) {
						local73 = arg3[arg8 - 1][arg11 + 1];
						local89 = arg7[arg8 - 1][arg11 + 1] * 2 + 2 & 0x7;
						local96 = Static12.method113(arg0, local56);
						if (Static288.aBooleanArrayArray5[local73][local89]) {
							Static123.anIntArray99[6] = local56.anInt2812;
							Static340.anIntArray342[6] = local96;
							Static77.anIntArray67[6] = local56.anInt2807;
							Static4.anIntArray2[6] = local56.anInt2818;
							Static493.anIntArray505[6] = local56.anInt2816;
							Static106.anIntArray87[6] = 64;
						}
					}
				}
			}
			if (arg8 < arg4 - 1) {
				local43 = arg5[arg8 + 1][arg11 + 1] & 0xFF;
				if (local43 > 0) {
					local56 = this.aClass171_6.method4161(local43 - 1);
					if (local56.anInt2812 != -1 && local56.aBoolean194) {
						local73 = arg3[arg8 + 1][arg11 + 1];
						local89 = arg7[arg8 + 1][arg11 + 1] * 2 & 0x7;
						local96 = Static12.method113(arg0, local56);
						if (Static288.aBooleanArrayArray5[local73][local89]) {
							Static123.anIntArray99[4] = local56.anInt2812;
							Static340.anIntArray342[4] = local96;
							Static77.anIntArray67[4] = local56.anInt2807;
							Static4.anIntArray2[4] = local56.anInt2818;
							Static493.anIntArray505[4] = local56.anInt2816;
							Static106.anIntArray87[4] = 128;
						}
					}
				}
			}
		}
		@Pc(501) int local501;
		@Pc(508) int local508;
		@Pc(510) int local510;
		@Pc(490) byte local490;
		if (arg11 > 0) {
			local43 = arg5[arg8][arg11 - 1] & 0xFF;
			if (local43 > 0) {
				local56 = this.aClass171_6.method4161(local43 - 1);
				if (local56.anInt2812 != -1) {
					local73 = arg3[arg8][arg11 - 1];
					local490 = arg7[arg8][arg11 - 1];
					if (local56.aBoolean194) {
						local96 = 2;
						local501 = local490 * 2 + 4;
						local508 = Static12.method113(arg0, local56);
						for (local510 = 0; local510 < 3; local510++) {
							local96 &= 0x7;
							local501 &= 0x7;
							if (Static288.aBooleanArrayArray5[local73][local501] && local56.anInt2816 >= Static493.anIntArray505[local96]) {
								Static123.anIntArray99[local96] = local56.anInt2812;
								Static340.anIntArray342[local96] = local508;
								Static77.anIntArray67[local96] = local56.anInt2807;
								Static4.anIntArray2[local96] = local56.anInt2818;
								if (Static493.anIntArray505[local96] == local56.anInt2816) {
									Static106.anIntArray87[local96] |= 0x20;
								} else {
									Static106.anIntArray87[local96] = 32;
								}
								Static493.anIntArray505[local96] = local56.anInt2816;
							}
							local96--;
							local501++;
						}
						if (!local24[arg12 & 0x3]) {
							arg6[0] = Static507.aBooleanArrayArray9[local73][local490 + 2 & 0x3];
						}
					} else if (!local24[arg12 & 0x3]) {
						arg6[0] = Static244.aBooleanArrayArray4[local73][local490 + 2 & 0x3];
					}
				}
			}
		}
		if (arg11 < arg9 - 1) {
			local43 = arg5[arg8][arg11 + 1] & 0xFF;
			if (local43 > 0) {
				local56 = this.aClass171_6.method4161(local43 - 1);
				if (local56.anInt2812 != -1) {
					local73 = arg3[arg8][arg11 + 1];
					local490 = arg7[arg8][arg11 + 1];
					if (local56.aBoolean194) {
						local96 = 4;
						local501 = local490 * 2 + 2;
						local508 = Static12.method113(arg0, local56);
						for (local510 = 0; local510 < 3; local510++) {
							local501 &= 0x7;
							local96 &= 0x7;
							if (Static288.aBooleanArrayArray5[local73][local501] && local56.anInt2816 >= Static493.anIntArray505[local96]) {
								Static123.anIntArray99[local96] = local56.anInt2812;
								Static340.anIntArray342[local96] = local508;
								Static77.anIntArray67[local96] = local56.anInt2807;
								Static4.anIntArray2[local96] = local56.anInt2818;
								if (Static493.anIntArray505[local96] == local56.anInt2816) {
									Static106.anIntArray87[local96] |= 0x10;
								} else {
									Static106.anIntArray87[local96] = 16;
								}
								Static493.anIntArray505[local96] = local56.anInt2816;
							}
							local501--;
							local96++;
						}
						if (!local24[arg12 + 2 & 0x3]) {
							arg6[2] = Static507.aBooleanArrayArray9[local73][local490 & 0x3];
						}
					} else if (!local24[arg12 + 2 & 0x3]) {
						arg6[2] = Static244.aBooleanArrayArray4[local73][--local490 & 0x3];
					}
				}
			}
		}
		if (arg8 > 0) {
			local43 = arg5[arg8 - 1][arg11] & 0xFF;
			if (local43 > 0) {
				local56 = this.aClass171_6.method4161(local43 - 1);
				if (local56.anInt2812 != -1) {
					local73 = arg3[arg8 - 1][arg11];
					local490 = arg7[arg8 - 1][arg11];
					if (local56.aBoolean194) {
						local96 = 6;
						local501 = local490 * 2 + 4;
						local508 = Static12.method113(arg0, local56);
						for (local510 = 0; local510 < 3; local510++) {
							local501 &= 0x7;
							local96 &= 0x7;
							if (Static288.aBooleanArrayArray5[local73][local501] && local56.anInt2816 >= Static493.anIntArray505[local96]) {
								Static123.anIntArray99[local96] = local56.anInt2812;
								Static340.anIntArray342[local96] = local508;
								Static77.anIntArray67[local96] = local56.anInt2807;
								Static4.anIntArray2[local96] = local56.anInt2818;
								if (Static493.anIntArray505[local96] == local56.anInt2816) {
									Static106.anIntArray87[local96] |= 0x8;
								} else {
									Static106.anIntArray87[local96] = 8;
								}
								Static493.anIntArray505[local96] = local56.anInt2816;
							}
							local96++;
							local501--;
						}
						if (!local24[arg12 + 3 & 0x3]) {
							arg6[3] = Static507.aBooleanArrayArray9[local73][local490 + 1 & 0x3];
						}
					} else if (!local24[arg12 + 3 & 0x3]) {
						arg6[3] = Static244.aBooleanArrayArray4[local73][local490 + 1 & 0x3];
					}
				}
			}
		}
		if (arg4 - 1 > arg8) {
			local43 = arg5[arg8 + 1][arg11] & 0xFF;
			if (local43 > 0) {
				local56 = this.aClass171_6.method4161(local43 - 1);
				if (local56.anInt2812 != -1) {
					local73 = arg3[arg8 + 1][arg11];
					local490 = arg7[arg8 + 1][arg11];
					if (local56.aBoolean194) {
						local96 = 4;
						local501 = local490 * 2 + 6;
						local508 = Static12.method113(arg0, local56);
						for (local510 = 0; local510 < 3; local510++) {
							local96 &= 0x7;
							local501 &= 0x7;
							if (Static288.aBooleanArrayArray5[local73][local501] && Static493.anIntArray505[local96] <= local56.anInt2816) {
								Static123.anIntArray99[local96] = local56.anInt2812;
								Static340.anIntArray342[local96] = local508;
								Static77.anIntArray67[local96] = local56.anInt2807;
								Static4.anIntArray2[local96] = local56.anInt2818;
								if (local56.anInt2816 == Static493.anIntArray505[local96]) {
									Static106.anIntArray87[local96] |= 0x4;
								} else {
									Static106.anIntArray87[local96] = 4;
								}
								Static493.anIntArray505[local96] = local56.anInt2816;
							}
							local501++;
							local96--;
						}
						if (!local24[arg12 + 1 & 0x3]) {
							arg6[1] = Static507.aBooleanArrayArray9[local73][local490 + 3 & 0x3];
						}
					} else if (!local24[arg12 + 1 & 0x3]) {
						arg6[1] = Static244.aBooleanArrayArray4[local73][local490 + 3 & 0x3];
					}
				}
			}
		}
		if (arg2 == null) {
			return;
		}
		local43 = Static12.method113(arg0, arg2);
		if (!arg2.aBoolean194) {
			return;
		}
		for (@Pc(1206) int local1206 = 0; local1206 < 8; local1206++) {
			@Pc(1217) int local1217 = local1206 - arg12 * 2 & 0x7;
			if (Static288.aBooleanArrayArray5[arg1][local1206] && arg2.anInt2816 >= Static493.anIntArray505[local1217]) {
				Static123.anIntArray99[local1217] = arg2.anInt2812;
				Static340.anIntArray342[local1217] = local43;
				Static77.anIntArray67[local1217] = arg2.anInt2807;
				Static4.anIntArray2[local1217] = arg2.anInt2818;
				if (arg2.anInt2816 == Static493.anIntArray505[local1217]) {
					Static106.anIntArray87[local1217] |= 0x2;
				} else {
					Static106.anIntArray87[local1217] = 2;
				}
				Static493.anIntArray505[local1217] = arg2.anInt2816;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIII)V")
	private void method6298(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		@Pc(13) int local13;
		for (@Pc(7) int local7 = arg0; local7 < arg0 + 64; local7++) {
			for (local13 = arg1; local13 < arg1 + 64; local13++) {
				if (local13 >= 0 && this.anInt7982 > local13 && local7 >= 0 && this.anInt7981 > local7) {
					this.anIntArrayArrayArray12[arg2][local13][local7] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray12[arg2 - 1][local13][local7] - 960;
				}
			}
		}
		if (arg1 > 0 && this.anInt7982 > arg1) {
			for (local13 = arg0 + 1; local13 < arg0 + 64; local13++) {
				if (local13 >= 0 && local13 < this.anInt7981) {
					this.anIntArrayArrayArray12[arg2][arg1][local13] = this.anIntArrayArrayArray12[arg2][arg1 - 1][local13];
				}
			}
		}
		if (arg0 > 0 && this.anInt7981 > arg0) {
			for (local13 = arg1 + 1; local13 < arg1 + 64; local13++) {
				if (local13 >= 0 && this.anInt7982 > local13) {
					this.anIntArrayArrayArray12[arg2][local13][arg0] = this.anIntArrayArrayArray12[arg2][local13][arg0 - 1];
				}
			}
		}
		if (arg1 < 0 || arg0 < 0 || arg1 >= this.anInt7982 || arg0 >= this.anInt7981) {
			return;
		}
		if (arg2 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray12[arg2][arg1 - 1][arg0] != 0) {
				this.anIntArrayArrayArray12[arg2][arg1][arg0] = this.anIntArrayArrayArray12[arg2][arg1 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray12[arg2][arg1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray12[arg2][arg1][arg0] = this.anIntArrayArrayArray12[arg2][arg1][arg0 - 1];
				return;
			}
			if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray12[arg2][arg1 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray12[arg2][arg1][arg0] = this.anIntArrayArrayArray12[arg2][arg1 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray12[arg2][arg1 - 1][arg0] != this.anIntArrayArrayArray12[arg2 - 1][arg1 - 1][arg0]) {
			this.anIntArrayArrayArray12[arg2][arg1][arg0] = this.anIntArrayArrayArray12[arg2][arg1 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray12[arg2 - 1][arg1][arg0 - 1] != this.anIntArrayArrayArray12[arg2][arg1][arg0 - 1]) {
			this.anIntArrayArrayArray12[arg2][arg1][arg0] = this.anIntArrayArrayArray12[arg2][arg1][arg0 - 1];
			return;
		}
		if (arg1 > 0 && arg0 > 0 && this.anIntArrayArrayArray12[arg2][arg1 - 1][arg0 - 1] != this.anIntArrayArrayArray12[arg2 - 1][arg1 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray12[arg2][arg1][arg0] = this.anIntArrayArrayArray12[arg2][arg1 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!i;I[[ILclient!r;Lclient!i;Lclient!i;B)V")
	private void method6299(@OriginalArg(0) Class127 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) Class127 arg4, @OriginalArg(5) Class127 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray12[arg1];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray13[arg1];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray14[arg1];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray15[arg1];
		for (@Pc(27) int local27 = 0; local27 < this.anInt7982; local27++) {
			@Pc(45) int local45 = local27 >= this.anInt7982 - 1 ? local27 : local27 + 1;
			for (@Pc(47) int local47 = 0; local47 < this.anInt7981; local47++) {
				@Pc(61) int local61 = local47 < this.anInt7981 - 1 ? local47 + 1 : local47;
				if (Static10.anInt87 == -1 || Static321.method4740(local47, Static10.anInt87, arg1, local27)) {
					@Pc(76) boolean local76 = false;
					@Pc(78) boolean local78 = false;
					@Pc(81) boolean[] local81 = new boolean[4];
					@Pc(87) int local87 = local10[local27][local47];
					@Pc(93) int local93 = local15[local27][local47];
					@Pc(101) int local101 = local25[local27][local47] & 0xFF;
					@Pc(109) int local109 = local20[local27][local47] & 0xFF;
					@Pc(117) int local117 = local20[local27][local61] & 0xFF;
					@Pc(125) int local125 = local20[local45][local61] & 0xFF;
					@Pc(133) int local133 = local20[local45][local47] & 0xFF;
					if (local101 != 0 || local109 != 0) {
						@Pc(152) Class88 local152 = local101 == 0 ? null : this.aClass171_6.method4161(local101 - 1);
						@Pc(167) Class188 local167 = local109 == 0 ? null : this.aClass71_5.method2109(local109 - 1);
						if (local87 == 0 && local152 == null) {
							local87 = 12;
						}
						@Pc(178) Class88 local178 = local152;
						if (local152 != null) {
							if (local152.anInt2812 == -1 && local152.anInt2815 == -1) {
								local178 = local152;
								local152 = null;
							} else if (local167 != null && local87 != 0) {
								local78 = local152.aBoolean194;
							}
						}
						@Pc(271) int local271;
						@Pc(328) int local328;
						@Pc(381) int local381;
						@Pc(390) int local390;
						if ((local87 == 0 || local87 == 12) && local27 > 0 && local47 > 0 && local27 < this.anInt7982 && this.anInt7981 > local47) {
							@Pc(250) int local250 = local20[local45][local47 - 1] == local109 ? 1 : -1;
							local271 = local20[local27 - 1][local47 - 1] == local109 ? 1 : -1;
							@Pc(288) int local288 = local109 == local20[local45][local61] ? 1 : -1;
							if (local109 == local20[local27][local47 - 1]) {
								local271++;
								local250++;
							} else {
								local271--;
								local250--;
							}
							local328 = local20[local27 - 1][local61] == local109 ? 1 : -1;
							if (local109 == local20[local45][local47]) {
								local288++;
								local250++;
							} else {
								local288--;
								local250--;
							}
							if (local109 == local20[local27][local61]) {
								local328++;
								local288++;
							} else {
								local328--;
								local288--;
							}
							if (local20[local27 - 1][local47] == local109) {
								local271++;
								local328++;
							} else {
								local271--;
								local328--;
							}
							local381 = local271 - local288;
							if (local381 < 0) {
								local381 = -local381;
							}
							local390 = local250 - local328;
							if (local390 < 0) {
								local390 = -local390;
							}
							if (local381 == local390) {
								local381 = arg0.method7862(local47, local27) - arg0.method7862(local61, local45);
								if (local381 < 0) {
									local381 = -local381;
								}
								local390 = arg0.method7862(local47, local45) - arg0.method7862(local61, local27);
								if (local390 < 0) {
									local390 = -local390;
								}
							}
							local93 = local381 < local390 ? 1 : 0;
						}
						for (local271 = 0; local271 < 13; local271++) {
							Static493.anIntArray505[local271] = -1;
							Static106.anIntArray87[local271] = 1;
						}
						@Pc(478) boolean[] local478 = local152 != null && local152.aBoolean194 ? Static507.aBooleanArrayArray9[local87] : Static244.aBooleanArrayArray4[local87];
						this.method6297(arg3, local87, local152, local10, this.anInt7982, local25, local81, local15, local27, this.anInt7981, local167, local47, local93);
						@Pc(511) boolean local511 = local152 != null && local152.anInt2815 != local152.anInt2812;
						if (!local511) {
							for (local328 = 0; local328 < 8; local328++) {
								if (Static493.anIntArray505[local328] >= 0 && Static340.anIntArray342[local328] != Static123.anIntArray99[local328]) {
									local511 = true;
									break;
								}
							}
						}
						if (!local478[local93 + 1 & 0x3]) {
							local81[1] = Static183.method3255(local81[1], (Static106.anIntArray87[4] & Static106.anIntArray87[2]) == 0);
						}
						if (!local478[local93 + 3 & 0x3]) {
							local81[3] = Static183.method3255(local81[3], (Static106.anIntArray87[6] & Static106.anIntArray87[0]) == 0);
						}
						if (!local478[local93 & 0x3]) {
							local81[0] = Static183.method3255(local81[0], (Static106.anIntArray87[0] & Static106.anIntArray87[2]) == 0);
						}
						if (!local478[local93 + 2 & 0x3]) {
							local81[2] = Static183.method3255(local81[2], (Static106.anIntArray87[4] & Static106.anIntArray87[6]) == 0);
						}
						if (!local78 && (local87 == 0 || local87 == 12)) {
							if (local81[0] && !local81[1] && !local81[2] && local81[3]) {
								local87 = local87 == 0 ? 13 : 14;
								local81[0] = local81[3] = false;
								local93 = 0;
							} else if (local81[0] && local81[1] && !local81[2] && !local81[3]) {
								local81[0] = local81[1] = false;
								local93 = 3;
								local87 = local87 == 0 ? 13 : 14;
							} else if (!local81[0] && local81[1] && local81[2] && !local81[3]) {
								local81[1] = local81[2] = false;
								local87 = local87 == 0 ? 13 : 14;
								local93 = 2;
							} else if (!local81[0] && !local81[1] && local81[2] && local81[3]) {
								local93 = 1;
								local87 = local87 == 0 ? 13 : 14;
								local81[2] = local81[3] = false;
							}
						}
						@Pc(815) boolean local815 = !local78 && !local81[0] && !local81[2] && !local81[1] && !local81[3];
						@Pc(817) int[] local817 = null;
						@Pc(847) int[] local847;
						@Pc(843) int[] local843;
						@Pc(839) int[] local839;
						if (local815) {
							local390 = local152 == null ? 0 : Static539.anIntArray540[local87];
							local381 = local167 == null ? 0 : Static414.anIntArray421[local87];
							local839 = Static544.anIntArrayArray96[local87];
							local843 = Static4.anIntArrayArray1[local87];
							local847 = Static346.anIntArrayArray65[local87];
						} else if (local78) {
							local817 = Static406.anIntArrayArray73[local87];
							local390 = local152 == null ? 0 : Static512.anIntArray528[local87];
							local381 = local167 == null ? 0 : Static266.anIntArray239[local87];
							local839 = Static370.anIntArrayArray68[local87];
							local843 = Static429.anIntArrayArray82[local87];
							local847 = Static421.anIntArrayArray76[local87];
						} else {
							local817 = Static320.anIntArrayArray59[local87];
							local839 = Static35.anIntArrayArray7[local87];
							local390 = local152 == null ? 0 : Static146.anIntArray131[local87];
							local847 = Static594.anIntArrayArray106[local87];
							local381 = local167 == null ? 0 : Static500.anIntArray516[local87];
							local843 = Static474.anIntArrayArray85[local87];
						}
						@Pc(920) int local920 = local381 + local390;
						if (local920 <= 0) {
							Static125.method2370(arg1, local27, local47);
						} else {
							if (local81[0]) {
								local920++;
							}
							if (local81[2]) {
								local920++;
							}
							if (local81[1]) {
								local920++;
							}
							if (local81[3]) {
								local920++;
							}
							@Pc(950) int local950 = 0;
							@Pc(952) int local952 = 0;
							@Pc(956) int local956 = local920 * 3;
							@Pc(963) int[] local963 = local511 ? new int[local956] : null;
							@Pc(966) int[] local966 = new int[local956];
							@Pc(969) int[] local969 = new int[local956];
							@Pc(972) int[] local972 = new int[local956];
							@Pc(975) int[] local975 = new int[local956];
							@Pc(978) int[] local978 = new int[local956];
							@Pc(985) int[] local985 = arg5 == null ? null : new int[local956];
							@Pc(994) int[] local994 = arg5 == null && arg4 == null ? null : new int[local956];
							@Pc(996) int local996 = -1;
							@Pc(998) int local998 = -1;
							@Pc(1000) int local1000 = 256;
							@Pc(1062) byte local1062;
							@Pc(1016) int local1016;
							@Pc(1018) int local1018;
							@Pc(1247) int local1247;
							@Pc(1253) int local1253;
							@Pc(1262) int local1262;
							@Pc(1267) int local1267;
							@Pc(1286) int local1286;
							@Pc(1272) int local1272;
							@Pc(1290) int local1290;
							@Pc(1342) int local1342;
							@Pc(1348) int local1348;
							if (local152 != null) {
								local1000 = local152.anInt2818;
								local996 = local152.anInt2812;
								local998 = local152.anInt2807;
								local1016 = Static12.method113(arg3, local152);
								for (local1018 = 0; local1018 < local390; local1018++) {
									if (local81[-local93 & 0x3] && local817[0] == local950) {
										Static303.anIntArray273[0] = local847[local950];
										Static303.anIntArray273[1] = 1;
										Static303.anIntArray273[2] = local839[local950];
										Static303.anIntArray273[3] = 1;
										Static303.anIntArray273[4] = local843[local950];
										local1062 = 6;
										Static303.anIntArray273[5] = local839[local950];
									} else if (local81[2 - local93 & 0x3] && local950 == local817[2]) {
										Static303.anIntArray273[0] = local847[local950];
										Static303.anIntArray273[1] = 5;
										Static303.anIntArray273[2] = local839[local950];
										Static303.anIntArray273[3] = 5;
										Static303.anIntArray273[4] = local843[local950];
										local1062 = 6;
										Static303.anIntArray273[5] = local839[local950];
									} else if (local81[1 - local93 & 0x3] && local950 == local817[1]) {
										Static303.anIntArray273[0] = local847[local950];
										Static303.anIntArray273[1] = 3;
										Static303.anIntArray273[2] = local839[local950];
										Static303.anIntArray273[3] = 3;
										Static303.anIntArray273[4] = local843[local950];
										Static303.anIntArray273[5] = local839[local950];
										local1062 = 6;
									} else if (local81[3 - local93 & 0x3] && local950 == local817[3]) {
										Static303.anIntArray273[0] = local847[local950];
										Static303.anIntArray273[1] = 7;
										Static303.anIntArray273[2] = local839[local950];
										Static303.anIntArray273[3] = 7;
										Static303.anIntArray273[4] = local843[local950];
										Static303.anIntArray273[5] = local839[local950];
										local1062 = 6;
									} else {
										Static303.anIntArray273[0] = local847[local950];
										Static303.anIntArray273[1] = local843[local950];
										local1062 = 3;
										Static303.anIntArray273[2] = local839[local950];
									}
									local950++;
									for (local1247 = 0; local1247 < local1062; local1247++) {
										local1253 = Static303.anIntArray273[local1247];
										local1262 = local1253 - local93 * 2 & 0x7;
										local1267 = this.anIntArray474[local1253];
										local1272 = this.anIntArray473[local1253];
										if (local93 == 1) {
											local1290 = 512 - local1267;
											local1286 = local1272;
										} else if (local93 == 2) {
											local1286 = 512 - local1267;
											local1290 = 512 - local1272;
										} else if (local93 == 3) {
											local1290 = local1267;
											local1286 = 512 - local1272;
										} else {
											local1286 = local1267;
											local1290 = local1272;
										}
										local966[local952] = local1286;
										local969[local952] = local1290;
										if (local985 != null && Static288.aBooleanArrayArray5[local87][local1253]) {
											local1342 = (local27 << 9) + local1286;
											local1348 = local1290 + (local47 << 9);
											local985[local952] = arg5.method7860(local1348, local1342) - arg0.method7860(local1348, local1342);
										}
										if (local994 != null) {
											if (arg5 != null && !Static288.aBooleanArrayArray5[local87][local1253]) {
												local1342 = local1286 + (local27 << 9);
												local1348 = (local47 << 9) + local1290;
												local994[local952] = arg0.method7860(local1348, local1342) - arg5.method7860(local1348, local1342);
											} else if (arg4 != null && !Static352.aBooleanArrayArray7[local87][local1253]) {
												local1342 = (local27 << 9) + local1286;
												local1348 = local1290 + (local47 << 9);
												local994[local952] = arg4.method7860(local1348, local1342) - arg0.method7860(local1348, local1342);
											}
										}
										if (local1253 < 8 && local152.anInt2816 < Static493.anIntArray505[local1262]) {
											if (local963 != null) {
												local963[local952] = Static340.anIntArray342[local1262];
											}
											local978[local952] = Static4.anIntArray2[local1262];
											local975[local952] = Static77.anIntArray67[local1262];
											local972[local952] = Static123.anIntArray99[local1262];
										} else {
											if (local963 != null) {
												local963[local952] = local1016;
											}
											local975[local952] = local152.anInt2807;
											local978[local952] = local152.anInt2818;
											local972[local952] = local996;
										}
										local952++;
									}
								}
								if (!this.aBoolean552 && arg1 == 0) {
									Static105.method2177(local27, local47, local152.anInt2819, local152.anInt2820 * 8, local152.anInt2813);
								}
								if (local87 != 12 && local152.anInt2812 != -1 && local152.aBoolean192) {
									local76 = true;
								}
							} else if (local815) {
								local950 = Static539.anIntArray540[local87];
							} else if (local78) {
								local950 = Static512.anIntArray528[local87];
							} else {
								local950 = Static146.anIntArray131[local87];
							}
							if (local167 != null) {
								if (local125 == 0) {
									local125 = local109;
								}
								if (local117 == 0) {
									local117 = local109;
								}
								if (local133 == 0) {
									local133 = local109;
								}
								@Pc(1605) Class188 local1605 = this.aClass71_5.method2109(local109 - 1);
								@Pc(1613) Class188 local1613 = this.aClass71_5.method2109(local117 - 1);
								@Pc(1621) Class188 local1621 = this.aClass71_5.method2109(local125 - 1);
								@Pc(1629) Class188 local1629 = this.aClass71_5.method2109(local133 - 1);
								for (local1262 = 0; local1262 < local381; local1262++) {
									if (local81[-local93 & 0x3] && local950 == local817[0]) {
										Static303.anIntArray273[0] = local847[local950];
										Static303.anIntArray273[1] = 1;
										Static303.anIntArray273[2] = local839[local950];
										Static303.anIntArray273[3] = 1;
										Static303.anIntArray273[4] = local843[local950];
										local1062 = 6;
										Static303.anIntArray273[5] = local839[local950];
									} else if (local81[2 - local93 & 0x3] && local817[2] == local950) {
										Static303.anIntArray273[0] = local847[local950];
										Static303.anIntArray273[1] = 5;
										Static303.anIntArray273[2] = local839[local950];
										Static303.anIntArray273[3] = 5;
										Static303.anIntArray273[4] = local843[local950];
										Static303.anIntArray273[5] = local839[local950];
										local1062 = 6;
									} else if (local81[1 - local93 & 0x3] && local817[1] == local950) {
										Static303.anIntArray273[0] = local847[local950];
										Static303.anIntArray273[1] = 3;
										Static303.anIntArray273[2] = local839[local950];
										Static303.anIntArray273[3] = 3;
										Static303.anIntArray273[4] = local843[local950];
										Static303.anIntArray273[5] = local839[local950];
										local1062 = 6;
									} else if (local81[3 - local93 & 0x3] && local950 == local817[3]) {
										Static303.anIntArray273[0] = local847[local950];
										Static303.anIntArray273[1] = 7;
										Static303.anIntArray273[2] = local839[local950];
										Static303.anIntArray273[3] = 7;
										Static303.anIntArray273[4] = local843[local950];
										Static303.anIntArray273[5] = local839[local950];
										local1062 = 6;
									} else {
										Static303.anIntArray273[0] = local847[local950];
										Static303.anIntArray273[1] = local843[local950];
										local1062 = 3;
										Static303.anIntArray273[2] = local839[local950];
									}
									local950++;
									for (local1267 = 0; local1267 < local1062; local1267++) {
										local1286 = Static303.anIntArray273[local1267];
										local1272 = local1286 - local93 * 2 & 0x7;
										local1290 = this.anIntArray474[local1286];
										local1348 = this.anIntArray473[local1286];
										@Pc(1908) int local1908;
										if (local93 == 1) {
											local1908 = 512 - local1290;
											local1342 = local1348;
										} else if (local93 == 2) {
											local1342 = 512 - local1290;
											local1908 = 512 - local1348;
										} else if (local93 == 3) {
											local1908 = local1290;
											local1342 = 512 - local1348;
										} else {
											local1908 = local1348;
											local1342 = local1290;
										}
										local966[local952] = local1342;
										local969[local952] = local1908;
										@Pc(1957) int local1957;
										@Pc(1963) int local1963;
										if (local985 != null && Static288.aBooleanArrayArray5[local87][local1286]) {
											local1957 = (local27 << 9) + local1342;
											local1963 = local1908 + (local47 << 9);
											local985[local952] = arg5.method7860(local1963, local1957) - arg0.method7860(local1963, local1957);
										}
										if (local994 != null) {
											if (arg5 != null && !Static288.aBooleanArrayArray5[local87][local1286]) {
												local1957 = local1342 + (local27 << 9);
												local1963 = (local47 << 9) + local1908;
												local994[local952] = arg0.method7860(local1963, local1957) - arg5.method7860(local1963, local1957);
											} else if (arg4 != null && !Static352.aBooleanArrayArray7[local87][local1286]) {
												local1957 = local1342 + (local27 << 9);
												local1963 = (local47 << 9) + local1908;
												local994[local952] = arg4.method7860(local1963, local1957) - arg0.method7860(local1963, local1957);
											}
										}
										if (local1286 < 8 && Static493.anIntArray505[local1272] >= 0) {
											if (local963 != null) {
												local963[local952] = Static340.anIntArray342[local1272];
											}
											local978[local952] = Static4.anIntArray2[local1272];
											local975[local952] = Static77.anIntArray67[local1272];
											local972[local952] = Static123.anIntArray99[local1272];
										} else {
											if (local78 && Static288.aBooleanArrayArray5[local87][local1286]) {
												local975[local952] = local998;
												local978[local952] = local1000;
												local972[local952] = local996;
											} else if (local1342 == 0 && local1908 == 0) {
												local972[local952] = arg2[local27][local47];
												local975[local952] = local1605.anInt5711;
												local978[local952] = local1605.anInt5721;
											} else if (local1342 == 0 && local1908 == 512) {
												local972[local952] = arg2[local27][local61];
												local975[local952] = local1613.anInt5711;
												local978[local952] = local1613.anInt5721;
											} else if (local1342 == 512 && local1908 == 512) {
												local972[local952] = arg2[local45][local61];
												local975[local952] = local1621.anInt5711;
												local978[local952] = local1621.anInt5721;
											} else if (local1342 == 512 && local1908 == 0) {
												local972[local952] = arg2[local45][local47];
												local975[local952] = local1629.anInt5711;
												local978[local952] = local1629.anInt5721;
											} else {
												if (local1342 < 256) {
													if (local1908 < 256) {
														local975[local952] = local1605.anInt5711;
														local978[local952] = local1605.anInt5721;
													} else {
														local975[local952] = local1613.anInt5711;
														local978[local952] = local1613.anInt5721;
													}
												} else if (local1908 < 256) {
													local975[local952] = local1629.anInt5711;
													local978[local952] = local1629.anInt5721;
												} else {
													local975[local952] = local1621.anInt5711;
													local978[local952] = local1621.anInt5721;
												}
												local1957 = Static469.method7123(local1342 << 7 >> 9, arg2[local45][local47], arg2[local27][local47]);
												local1963 = Static469.method7123(local1342 << 7 >> 9, arg2[local45][local61], arg2[local27][local61]);
												local972[local952] = Static469.method7123(local1908 << 7 >> 9, local1963, local1957);
											}
											if (local963 != null) {
												local963[local952] = local972[local952];
											}
										}
										local952++;
									}
								}
								if (local87 != 0 && local167.aBoolean389) {
									local76 = true;
								}
							}
							local1016 = arg0.method7862(local47, local27);
							local1018 = arg0.method7862(local47, local45);
							local1247 = arg0.method7862(local61, local45);
							local1253 = arg0.method7862(local61, local27);
							@Pc(2385) boolean local2385 = Static269.method4098(local27, local47);
							if (local2385 && arg1 > 1 || !local2385 && arg1 > 0) {
								@Pc(2399) boolean local2399 = true;
								if (local167 != null && !local167.aBoolean390) {
									local2399 = false;
								} else if (local109 == 0 && local87 != 0) {
									local2399 = false;
								} else if (local101 > 0 && local178 != null && !local178.aBoolean193) {
									local2399 = false;
								}
								if (local2399 && local1016 == local1018 && local1247 == local1016 && local1253 == local1016) {
									this.aByteArrayArrayArray16[arg1][local27][local47] = (byte) (this.aByteArrayArrayArray16[arg1][local27][local47] | 0x4);
								}
							}
							local1267 = 0;
							local1286 = 0;
							local1272 = 0;
							if (this.aBoolean552) {
								local1267 = Static192.method3362(local27, local47);
								local1286 = Static93.method1989(local27, local47);
								local1272 = Static443.method6173(local27, local47);
							}
							arg0.O(local27, local47, local966, local985, local969, local994, local972, local963, local975, local978, local1267, local1286, local1272, local76);
							Static125.method2370(arg1, local27, local47);
						}
					}
				}
			}
		}
	}
}
