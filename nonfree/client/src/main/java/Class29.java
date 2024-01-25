import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public class Class29 {

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "[I")
	private final int[] anIntArray448 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "[I")
	private final int[] anIntArray449 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "Lclient!ui;")
	private final Class359 aClass359_4;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "I")
	protected final int anInt8889;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	protected final int anInt8880;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "Z")
	public final boolean aBoolean642;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public final int anInt8876;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "Lclient!oo;")
	private final Class266 aClass266_5;

	@OriginalMember(owner = "client!bf", name = "o", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIZLclient!oo;Lclient!ui;)V")
	protected Class29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class266 arg4, @OriginalArg(5) Class359 arg5) {
		this.aClass359_4 = arg5;
		this.anInt8889 = arg2;
		this.anInt8880 = arg1;
		this.aBoolean642 = arg3;
		this.anInt8876 = arg0;
		this.aClass266_5 = arg4;
		this.aByteArrayArrayArray14 = new byte[this.anInt8876][this.anInt8880 + 1][this.anInt8889 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt8876][this.anInt8880][this.anInt8889];
		this.aByteArrayArrayArray15 = new byte[this.anInt8876][this.anInt8880][this.anInt8889];
		this.anIntArrayArrayArray14 = new int[this.anInt8876][this.anInt8880 + 1][this.anInt8889 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt8876][this.anInt8880][this.anInt8889];
		this.aByteArrayArrayArray13 = new byte[this.anInt8876][this.anInt8880][this.anInt8889];
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIILclient!ol;ZII)V")
	private void method7846(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class2_Sub8 arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 1) {
			arg5 = 1;
		} else if (arg1 == 2) {
			arg8 = 1;
			arg5 = 1;
		} else if (arg1 == 3) {
			arg8 = 1;
		}
		@Pc(61) int local61;
		if (arg3 < 0 || arg3 >= this.anInt8880 || arg0 < 0 || this.anInt8889 <= arg0) {
			while (true) {
				local61 = arg6.method5203();
				if (local61 == 0) {
					return;
				}
				if (local61 == 1) {
					arg6.method5203();
					return;
				}
				if (local61 <= 49) {
					arg6.method5203();
				}
			}
			return;
		}
		if (!this.aBoolean642 && !arg7) {
			Static96.aByteArrayArrayArray10[arg2][arg3][arg0] = 0;
		}
		while (true) {
			local61 = arg6.method5203();
			if (local61 == 0) {
				if (this.aBoolean642) {
					this.anIntArrayArrayArray14[0][arg3 + arg8][arg5 + arg0] = 0;
					return;
				} else if (arg2 == 0) {
					this.anIntArrayArrayArray14[0][arg8 + arg3][arg0 + arg5] = -Static227.method4164(arg4 + 556238, arg9 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray14[arg2][arg3 + arg8][arg5 + arg0] = this.anIntArrayArrayArray14[arg2 - 1][arg8 + arg3][arg5 + arg0] - 960;
					return;
				}
			}
			if (local61 == 1) {
				@Pc(190) int local190 = arg6.method5203();
				if (!this.aBoolean642) {
					if (local190 == 1) {
						local190 = 0;
					}
					if (arg2 == 0) {
						this.anIntArrayArrayArray14[0][arg3 + arg8][arg0 + arg5] = -local190 * 8 << 2;
						return;
					}
					this.anIntArrayArrayArray14[arg2][arg3 + arg8][arg5 + arg0] = this.anIntArrayArrayArray14[arg2 - 1][arg8 + arg3][arg5 + arg0] - (local190 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray14[0][arg8 + arg3][arg5 + arg0] = local190 * 8 << 2;
				return;
			}
			if (local61 <= 49) {
				if (arg7) {
					arg6.method5203();
				} else {
					this.aByteArrayArrayArray16[arg2][arg3][arg0] = arg6.method5175();
					this.aByteArrayArrayArray15[arg2][arg3][arg0] = (byte) ((local61 - 2) / 4);
					this.aByteArrayArrayArray13[arg2][arg3][arg0] = (byte) (arg1 + local61 - 2 & 0x3);
				}
			} else if (local61 <= 81) {
				if (!this.aBoolean642 && !arg7) {
					Static96.aByteArrayArrayArray10[arg2][arg3][arg0] = (byte) (local61 - 49);
				}
			} else if (!arg7) {
				this.aByteArrayArrayArray12[arg2][arg3][arg0] = (byte) (local61 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V")
	public final void method7847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg1; local7 < arg0 + arg1; local7++) {
			for (local11 = arg4; local11 < arg3 + arg4; local11++) {
				if (local11 >= 0 && local11 < this.anInt8880 && local7 >= 0 && local7 < this.anInt8889) {
					this.anIntArrayArrayArray14[arg2][local11][local7] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray14[arg2 - 1][local11][local7] - 960;
				}
			}
		}
		if (arg4 > 0 && this.anInt8880 > arg4) {
			for (local11 = arg1 + 1; local11 < arg0 + arg1; local11++) {
				if (local11 >= 0 && local11 < this.anInt8889) {
					this.anIntArrayArrayArray14[arg2][arg4][local11] = this.anIntArrayArrayArray14[arg2][arg4 - 1][local11];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt8889) {
			for (local11 = arg4 + 1; local11 < arg4 + arg3; local11++) {
				if (local11 >= 0 && local11 < this.anInt8880) {
					this.anIntArrayArrayArray14[arg2][local11][arg1] = this.anIntArrayArrayArray14[arg2][local11][arg1 - 1];
				}
			}
		}
		if (arg4 < 0 || arg1 < 0 || arg4 >= this.anInt8880 || this.anInt8889 <= arg1) {
			return;
		}
		if (arg2 == 0) {
			if (arg4 > 0 && this.anIntArrayArrayArray14[arg2][arg4 - 1][arg1] != 0) {
				this.anIntArrayArrayArray14[arg2][arg4][arg1] = this.anIntArrayArrayArray14[arg2][arg4 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray14[arg2][arg4][arg1 - 1] != 0) {
				this.anIntArrayArrayArray14[arg2][arg4][arg1] = this.anIntArrayArrayArray14[arg2][arg4][arg1 - 1];
				return;
			}
			if (arg4 > 0 && arg1 > 0 && this.anIntArrayArrayArray14[arg2][arg4 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray14[arg2][arg4][arg1] = this.anIntArrayArrayArray14[arg2][arg4 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray14[arg2][arg4 - 1][arg1] != this.anIntArrayArrayArray14[arg2 - 1][arg4 - 1][arg1]) {
			this.anIntArrayArrayArray14[arg2][arg4][arg1] = this.anIntArrayArrayArray14[arg2][arg4 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray14[arg2][arg4][arg1 - 1] != this.anIntArrayArrayArray14[arg2 - 1][arg4][arg1 - 1]) {
			this.anIntArrayArrayArray14[arg2][arg4][arg1] = this.anIntArrayArrayArray14[arg2][arg4][arg1 - 1];
			return;
		}
		if (arg4 > 0 && arg1 > 0 && this.anIntArrayArrayArray14[arg2 - 1][arg4 - 1][arg1 - 1] != this.anIntArrayArrayArray14[arg2][arg4 - 1][arg1 - 1]) {
			this.anIntArrayArrayArray14[arg2][arg4][arg1] = this.anIntArrayArrayArray14[arg2][arg4 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!s;I[[ILclient!ha;Lclient!s;BLclient!s;)V")
	private void method7848(@OriginalArg(0) Class18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) Class101 arg3, @OriginalArg(4) Class18 arg4, @OriginalArg(6) Class18 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8880; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt8889; local7++) {
				if (Static293.anInt7588 == -1 || Static586.method8860(local3, Static293.anInt7588, local7, arg1)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray15[arg1][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray13[arg1][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray16[arg1][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray12[arg1][local3][local7] & 0xFF;
					@Pc(77) Class137 local77 = local51 == 0 ? null : this.aClass266_5.method7114(local51 - 1);
					if (local31 == 0 && local77 == null) {
						local31 = 12;
					}
					@Pc(95) Class240 local95 = local62 == 0 ? null : this.aClass359_4.method9053(local62 - 1);
					@Pc(97) Class137 local97 = local77;
					if (local77 != null && local77.anInt4435 == -1 && local77.anInt4434 == -1) {
						local97 = local77;
						local77 = null;
					}
					if (local77 != null || local95 != null) {
						@Pc(121) int local121 = Static552.anIntArray489[local31];
						@Pc(125) int local125 = Static288.anIntArray269[local31];
						@Pc(138) int local138 = (local77 == null ? 0 : local125) + (local95 == null ? 0 : local121);
						@Pc(140) int local140 = 0;
						@Pc(142) int local142 = 0;
						@Pc(149) int local149 = local77 == null ? -1 : local77.anInt4432;
						@Pc(156) int local156 = local95 == null ? -1 : local95.anInt7333;
						@Pc(159) int[] local159 = new int[local138];
						@Pc(162) int[] local162 = new int[local138];
						@Pc(165) int[] local165 = new int[local138];
						@Pc(168) int[] local168 = new int[local138];
						@Pc(171) int[] local171 = new int[local138];
						@Pc(174) int[] local174 = new int[local138];
						@Pc(186) int[] local186 = local77 == null || local77.anInt4434 == -1 ? null : new int[local138];
						@Pc(190) int local190;
						if (local77 == null) {
							local142 = local125;
						} else {
							for (local190 = 0; local190 < local125; local190++) {
								local159[local140] = Static520.anIntArrayArray44[local31][local142];
								local162[local140] = Static554.anIntArrayArray50[local31][local142];
								local165[local140] = Static653.anIntArrayArray60[local31][local142];
								local171[local140] = local149;
								local174[local140] = local77.anInt4438;
								local168[local140] = local77.anInt4435;
								if (local186 != null) {
									local186[local140] = local77.anInt4434;
								}
								local140++;
								local142++;
							}
							if (!this.aBoolean642 && arg1 == 0) {
								Static680.method5119(local3, local7, local77.anInt4444, local77.anInt4443 * 8, local77.anInt4441);
							}
						}
						if (local95 != null) {
							for (local190 = 0; local190 < local121; local190++) {
								local159[local140] = Static520.anIntArrayArray44[local31][local142];
								local162[local140] = Static554.anIntArrayArray50[local31][local142];
								local165[local140] = Static653.anIntArrayArray60[local31][local142];
								local171[local140] = local156;
								local174[local140] = local95.anInt7334;
								local168[local140] = arg2[local3][local7];
								if (local186 != null) {
									local186[local140] = local168[local140];
								}
								local140++;
								local142++;
							}
						}
						local190 = this.anIntArray449.length;
						@Pc(333) int[] local333 = new int[local190];
						@Pc(336) int[] local336 = new int[local190];
						@Pc(343) int[] local343 = arg0 == null ? null : new int[local190];
						@Pc(352) int[] local352 = arg0 == null && arg4 == null ? null : new int[local190];
						@Pc(361) int local361;
						@Pc(366) int local366;
						@Pc(449) int local449;
						@Pc(458) int local458;
						for (@Pc(354) int local354 = 0; local354 < local190; local354++) {
							local361 = this.anIntArray449[local354];
							local366 = this.anIntArray448[local354];
							if (local40 == 0) {
								local333[local354] = local361;
								local336[local354] = local366;
							} else if (local40 == 1) {
								local333[local354] = local366;
								local336[local354] = 512 - local361;
							} else if (local40 == 2) {
								local333[local354] = 512 - local361;
								local336[local354] = 512 - local366;
							} else if (local40 == 3) {
								local333[local354] = 512 - local366;
								local336[local354] = local361;
							}
							if (local343 != null && Static500.aBooleanArrayArray11[local31][local354]) {
								local449 = local333[local354] + (local3 << 9);
								local458 = (local7 << 9) + local336[local354];
								local343[local354] = arg0.method8542(local458, local449) - arg5.method8542(local458, local449);
							}
							if (local352 != null) {
								if (arg0 != null && !Static500.aBooleanArrayArray11[local31][local354]) {
									local449 = (local3 << 9) + local333[local354];
									local458 = (local7 << 9) + local336[local354];
									local352[local354] = arg5.method8542(local458, local449) - arg0.method8542(local458, local449);
								} else if (arg4 != null && !Static80.aBooleanArrayArray2[local31][local354]) {
									local449 = (local3 << 9) + local333[local354];
									local458 = local336[local354] + (local7 << 9);
									local352[local354] = arg4.method8542(local458, local449) - arg5.method8542(local458, local449);
								}
							}
						}
						local361 = arg5.method8537(local7, local3);
						local366 = arg5.method8537(local7, local3 + 1);
						local449 = arg5.method8537(local7 + 1, local3 + 1);
						local458 = arg5.method8537(local7 + 1, local3);
						@Pc(605) boolean local605 = Static45.method947(local3, local7);
						if (local605 && arg1 > 1 || !local605 && arg1 > 0) {
							@Pc(621) boolean local621 = true;
							if (local95 != null && !local95.aBoolean545) {
								local621 = false;
							} else if (local62 == 0 && local31 != 0) {
								local621 = false;
							} else if (local51 > 0 && local97 != null && !local97.aBoolean346) {
								local621 = false;
							}
							if (local621 && local361 == local366 && local449 == local361 && local458 == local361) {
								this.aByteArrayArrayArray14[arg1][local3][local7] = (byte) (this.aByteArrayArrayArray14[arg1][local3][local7] | 0x4);
							}
						}
						@Pc(690) int local690 = 0;
						@Pc(692) int local692 = 0;
						@Pc(694) int local694 = 0;
						if (this.aBoolean642) {
							local690 = Static432.method7061(local3, local7);
							local692 = Static249.method4412(local3, local7);
							local694 = Static394.method7229(local3, local7);
						}
						arg5.method8540(local3, local7, local333, local343, local336, local352, local159, local162, local165, local168, local186, local171, local174, local690, local692, local694);
						Static557.method8501(arg1, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([[BLclient!naa;Lclient!ha;Lclient!hca;II[[BI[[B[ZIIIZ)V")
	private void method7849(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class240 arg1, @OriginalArg(2) Class101 arg2, @OriginalArg(3) Class137 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) boolean[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		@Pc(24) boolean[] local24 = arg3 != null && arg3.aBoolean348 ? Static14.aBooleanArrayArray10[arg11] : Static113.aBooleanArrayArray4[arg11];
		@Pc(46) int local46;
		@Pc(59) Class137 local59;
		@Pc(77) byte local77;
		@Pc(93) int local93;
		@Pc(98) int local98;
		if (arg7 > 0) {
			if (arg10 > 0) {
				local46 = arg8[arg10 - 1][arg7 - 1] & 0xFF;
				if (local46 > 0) {
					local59 = this.aClass266_5.method7114(local46 - 1);
					if (local59.anInt4435 != -1 && local59.aBoolean348) {
						local77 = arg0[arg10 - 1][arg7 - 1];
						local93 = arg6[arg10 - 1][arg7 - 1] * 2 + 4 & 0x7;
						local98 = Static310.method5089(arg2, local59);
						if (Static500.aBooleanArrayArray11[local77][local93]) {
							Static307.anIntArray287[0] = local59.anInt4435;
							Static432.anIntArray395[0] = local98;
							Static347.anIntArray321[0] = local59.anInt4432;
							Static663.anIntArray593[0] = local59.anInt4438;
							Static424.anIntArray378[0] = local59.anInt4437;
							Static412.anIntArray367[0] = 256;
						}
					}
				}
			}
			if (arg10 < arg5 - 1) {
				local46 = arg8[arg10 + 1][arg7 - 1] & 0xFF;
				if (local46 > 0) {
					local59 = this.aClass266_5.method7114(local46 - 1);
					if (local59.anInt4435 != -1 && local59.aBoolean348) {
						local77 = arg0[arg10 + 1][arg7 - 1];
						local93 = arg6[arg10 + 1][arg7 - 1] * 2 + 6 & 0x7;
						local98 = Static310.method5089(arg2, local59);
						if (Static500.aBooleanArrayArray11[local77][local93]) {
							Static307.anIntArray287[2] = local59.anInt4435;
							Static432.anIntArray395[2] = local98;
							Static347.anIntArray321[2] = local59.anInt4432;
							Static663.anIntArray593[2] = local59.anInt4438;
							Static424.anIntArray378[2] = local59.anInt4437;
							Static412.anIntArray367[2] = 512;
						}
					}
				}
			}
		}
		if (arg12 - 1 > arg7) {
			if (arg10 > 0) {
				local46 = arg8[arg10 - 1][arg7 + 1] & 0xFF;
				if (local46 > 0) {
					local59 = this.aClass266_5.method7114(local46 - 1);
					if (local59.anInt4435 != -1 && local59.aBoolean348) {
						local77 = arg0[arg10 - 1][arg7 + 1];
						local93 = arg6[arg10 - 1][arg7 + 1] * 2 + 2 & 0x7;
						local98 = Static310.method5089(arg2, local59);
						if (Static500.aBooleanArrayArray11[local77][local93]) {
							Static307.anIntArray287[6] = local59.anInt4435;
							Static432.anIntArray395[6] = local98;
							Static347.anIntArray321[6] = local59.anInt4432;
							Static663.anIntArray593[6] = local59.anInt4438;
							Static424.anIntArray378[6] = local59.anInt4437;
							Static412.anIntArray367[6] = 64;
						}
					}
				}
			}
			if (arg10 < arg5 - 1) {
				local46 = arg8[arg10 + 1][arg7 + 1] & 0xFF;
				if (local46 > 0) {
					local59 = this.aClass266_5.method7114(local46 - 1);
					if (local59.anInt4435 != -1 && local59.aBoolean348) {
						local77 = arg0[arg10 + 1][arg7 + 1];
						local93 = arg6[arg10 + 1][arg7 + 1] * 2 & 0x7;
						local98 = Static310.method5089(arg2, local59);
						if (Static500.aBooleanArrayArray11[local77][local93]) {
							Static307.anIntArray287[4] = local59.anInt4435;
							Static432.anIntArray395[4] = local98;
							Static347.anIntArray321[4] = local59.anInt4432;
							Static663.anIntArray593[4] = local59.anInt4438;
							Static424.anIntArray378[4] = local59.anInt4437;
							Static412.anIntArray367[4] = 128;
						}
					}
				}
			}
		}
		@Pc(500) int local500;
		@Pc(505) int local505;
		@Pc(507) int local507;
		@Pc(489) byte local489;
		if (arg7 > 0) {
			local46 = arg8[arg10][arg7 - 1] & 0xFF;
			if (local46 > 0) {
				local59 = this.aClass266_5.method7114(local46 - 1);
				if (local59.anInt4435 != -1) {
					local77 = arg0[arg10][arg7 - 1];
					local489 = arg6[arg10][arg7 - 1];
					if (local59.aBoolean348) {
						local98 = 2;
						local500 = local489 * 2 + 4;
						local505 = Static310.method5089(arg2, local59);
						for (local507 = 0; local507 < 3; local507++) {
							local500 &= 0x7;
							local98 &= 0x7;
							if (Static500.aBooleanArrayArray11[local77][local500] && local59.anInt4437 >= Static424.anIntArray378[local98]) {
								Static307.anIntArray287[local98] = local59.anInt4435;
								Static432.anIntArray395[local98] = local505;
								Static347.anIntArray321[local98] = local59.anInt4432;
								Static663.anIntArray593[local98] = local59.anInt4438;
								if (local59.anInt4437 == Static424.anIntArray378[local98]) {
									Static412.anIntArray367[local98] |= 0x20;
								} else {
									Static412.anIntArray367[local98] = 32;
								}
								Static424.anIntArray378[local98] = local59.anInt4437;
							}
							local98--;
							local500++;
						}
						if (!local24[arg4 & 0x3]) {
							arg9[0] = Static14.aBooleanArrayArray10[local77][local489 + 2 & 0x3];
						}
					} else if (!local24[arg4 & 0x3]) {
						arg9[0] = Static113.aBooleanArrayArray4[local77][local489 + 2 & 0x3];
					}
				}
			}
		}
		if (arg7 < arg12 - 1) {
			local46 = arg8[arg10][arg7 + 1] & 0xFF;
			if (local46 > 0) {
				local59 = this.aClass266_5.method7114(local46 - 1);
				if (local59.anInt4435 != -1) {
					local77 = arg0[arg10][arg7 + 1];
					local489 = arg6[arg10][arg7 + 1];
					if (local59.aBoolean348) {
						local98 = 4;
						local500 = local489 * 2 + 2;
						local505 = Static310.method5089(arg2, local59);
						for (local507 = 0; local507 < 3; local507++) {
							local500 &= 0x7;
							local98 &= 0x7;
							if (Static500.aBooleanArrayArray11[local77][local500] && local59.anInt4437 >= Static424.anIntArray378[local98]) {
								Static307.anIntArray287[local98] = local59.anInt4435;
								Static432.anIntArray395[local98] = local505;
								Static347.anIntArray321[local98] = local59.anInt4432;
								Static663.anIntArray593[local98] = local59.anInt4438;
								if (local59.anInt4437 == Static424.anIntArray378[local98]) {
									Static412.anIntArray367[local98] |= 0x10;
								} else {
									Static412.anIntArray367[local98] = 16;
								}
								Static424.anIntArray378[local98] = local59.anInt4437;
							}
							local98++;
							local500--;
						}
						if (!local24[arg4 + 2 & 0x3]) {
							arg9[2] = Static14.aBooleanArrayArray10[local77][local489 & 0x3];
						}
					} else if (!local24[arg4 + 2 & 0x3]) {
						arg9[2] = Static113.aBooleanArrayArray4[local77][local489 & 0x3];
					}
				}
			}
		}
		if (arg10 > 0) {
			local46 = arg8[arg10 - 1][arg7] & 0xFF;
			if (local46 > 0) {
				local59 = this.aClass266_5.method7114(local46 - 1);
				if (local59.anInt4435 != -1) {
					local77 = arg0[arg10 - 1][arg7];
					local489 = arg6[arg10 - 1][arg7];
					if (local59.aBoolean348) {
						local98 = 6;
						local500 = local489 * 2 + 4;
						local505 = Static310.method5089(arg2, local59);
						for (local507 = 0; local507 < 3; local507++) {
							local98 &= 0x7;
							local500 &= 0x7;
							if (Static500.aBooleanArrayArray11[local77][local500] && local59.anInt4437 >= Static424.anIntArray378[local98]) {
								Static307.anIntArray287[local98] = local59.anInt4435;
								Static432.anIntArray395[local98] = local505;
								Static347.anIntArray321[local98] = local59.anInt4432;
								Static663.anIntArray593[local98] = local59.anInt4438;
								if (local59.anInt4437 == Static424.anIntArray378[local98]) {
									Static412.anIntArray367[local98] |= 0x8;
								} else {
									Static412.anIntArray367[local98] = 8;
								}
								Static424.anIntArray378[local98] = local59.anInt4437;
							}
							local500--;
							local98++;
						}
						if (!local24[arg4 + 3 & 0x3]) {
							arg9[3] = Static14.aBooleanArrayArray10[local77][local489 + 1 & 0x3];
						}
					} else if (!local24[arg4 + 3 & 0x3]) {
						arg9[3] = Static113.aBooleanArrayArray4[local77][local489 + 1 & 0x3];
					}
				}
			}
		}
		if (arg5 - 1 > arg10) {
			local46 = arg8[arg10 + 1][arg7] & 0xFF;
			if (local46 > 0) {
				local59 = this.aClass266_5.method7114(local46 - 1);
				if (local59.anInt4435 != -1) {
					local77 = arg0[arg10 + 1][arg7];
					local489 = arg6[arg10 + 1][arg7];
					if (local59.aBoolean348) {
						local98 = 4;
						local500 = local489 * 2 + 6;
						local505 = Static310.method5089(arg2, local59);
						for (local507 = 0; local507 < 3; local507++) {
							local500 &= 0x7;
							local98 &= 0x7;
							if (Static500.aBooleanArrayArray11[local77][local500] && local59.anInt4437 >= Static424.anIntArray378[local98]) {
								Static307.anIntArray287[local98] = local59.anInt4435;
								Static432.anIntArray395[local98] = local505;
								Static347.anIntArray321[local98] = local59.anInt4432;
								Static663.anIntArray593[local98] = local59.anInt4438;
								if (Static424.anIntArray378[local98] == local59.anInt4437) {
									Static412.anIntArray367[local98] |= 0x4;
								} else {
									Static412.anIntArray367[local98] = 4;
								}
								Static424.anIntArray378[local98] = local59.anInt4437;
							}
							local98--;
							local500++;
						}
						if (!local24[arg4 + 1 & 0x3]) {
							arg9[1] = Static14.aBooleanArrayArray10[local77][local489 + 3 & 0x3];
						}
					} else if (!local24[arg4 + 1 & 0x3]) {
						arg9[1] = Static113.aBooleanArrayArray4[local77][local489 + 3 & 0x3];
					}
				}
			}
		}
		if (arg3 == null) {
			return;
		}
		local46 = Static310.method5089(arg2, arg3);
		if (!arg3.aBoolean348) {
			return;
		}
		for (@Pc(1193) int local1193 = 0; local1193 < 8; local1193++) {
			@Pc(1204) int local1204 = local1193 - arg4 * 2 & 0x7;
			if (Static500.aBooleanArrayArray11[arg11][local1193] && arg3.anInt4437 >= Static424.anIntArray378[local1204]) {
				Static307.anIntArray287[local1204] = arg3.anInt4435;
				Static432.anIntArray395[local1204] = local46;
				Static347.anIntArray321[local1204] = arg3.anInt4432;
				Static663.anIntArray593[local1204] = arg3.anInt4438;
				if (arg3.anInt4437 == Static424.anIntArray378[local1204]) {
					Static412.anIntArray367[local1204] |= 0x2;
				} else {
					Static412.anIntArray367[local1204] = 2;
				}
				Static424.anIntArray378[local1204] = arg3.anInt4437;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!s;ILclient!ha;Lclient!s;)V")
	public final void method7850(@OriginalArg(0) Class18 arg0, @OriginalArg(2) Class101 arg1, @OriginalArg(3) Class18 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt8880][this.anInt8889];
		if (Static283.anIntArray266 == null || this.anInt8889 != Static283.anIntArray266.length) {
			Static197.anIntArray192 = new int[this.anInt8889];
			Static283.anIntArray266 = new int[this.anInt8889];
			Static465.anIntArray421 = new int[this.anInt8889];
			Static165.anIntArray169 = new int[this.anInt8889];
			Static398.anIntArray352 = new int[this.anInt8889];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt8876; local44++) {
			for (local48 = 0; local48 < this.anInt8889; local48++) {
				Static283.anIntArray266[local48] = 0;
				Static197.anIntArray192[local48] = 0;
				Static398.anIntArray352[local48] = 0;
				Static465.anIntArray421[local48] = 0;
				Static165.anIntArray169[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt8880; local81++) {
				@Pc(91) int local91;
				@Pc(106) int local106;
				@Pc(178) int local178;
				for (@Pc(85) int local85 = 0; local85 < this.anInt8889; local85++) {
					local91 = local81 + 5;
					@Pc(155) int local155;
					if (local91 < this.anInt8880) {
						local106 = this.aByteArrayArrayArray12[local44][local91][local85] & 0xFF;
						if (local106 > 0) {
							@Pc(119) Class240 local119 = this.aClass359_4.method9053(local106 - 1);
							Static283.anIntArray266[local85] += local119.anInt7335;
							Static197.anIntArray192[local85] += local119.anInt7325;
							Static398.anIntArray352[local85] += local119.anInt7328;
							Static465.anIntArray421[local85] += local119.anInt7326;
							local155 = Static165.anIntArray169[local85]++;
						}
					}
					local106 = local81 - 5;
					if (local106 >= 0) {
						local178 = this.aByteArrayArrayArray12[local44][local106][local85] & 0xFF;
						if (local178 > 0) {
							@Pc(191) Class240 local191 = this.aClass359_4.method9053(local178 - 1);
							Static283.anIntArray266[local85] -= local191.anInt7335;
							Static197.anIntArray192[local85] -= local191.anInt7325;
							Static398.anIntArray352[local85] -= local191.anInt7328;
							Static465.anIntArray421[local85] -= local191.anInt7326;
							local155 = Static165.anIntArray169[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local106 = 0;
					local178 = 0;
					@Pc(245) int local245 = 0;
					@Pc(247) int local247 = 0;
					for (@Pc(249) int local249 = -5; local249 < this.anInt8889; local249++) {
						@Pc(255) int local255 = local249 + 5;
						if (local255 < this.anInt8889) {
							local245 += Static465.anIntArray421[local255];
							local106 += Static197.anIntArray192[local255];
							local178 += Static398.anIntArray352[local255];
							local91 += Static283.anIntArray266[local255];
							local247 += Static165.anIntArray169[local255];
						}
						@Pc(297) int local297 = local249 - 5;
						if (local297 >= 0) {
							local91 -= Static283.anIntArray266[local297];
							local178 -= Static398.anIntArray352[local297];
							local247 -= Static165.anIntArray169[local297];
							local106 -= Static197.anIntArray192[local297];
							local245 -= Static465.anIntArray421[local297];
						}
						if (local249 >= 0 && local245 > 0 && local247 > 0) {
							local11[local81][local249] = Static581.method8772(local106 / local247, local178 / local247, local91 * 256 / local245);
						}
					}
				}
			}
			if (Static235.aBoolean365) {
				this.method7856(Static245.aClass18Array14[local44], local44 == 0 ? arg2 : null, local11, local44, arg1, local44 == 0 ? arg0 : null);
			} else {
				this.method7848(local44 == 0 ? arg0 : null, local44, local11, arg1, local44 == 0 ? arg2 : null, Static245.aClass18Array14[local44]);
			}
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray16[local44] = null;
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray13[local44] = null;
		}
		if (!this.aBoolean642) {
			if (Static443.anInt8022 != 0) {
				Static146.method9612();
			}
			if (Static169.aBoolean274) {
				Static18.method345();
			}
		}
		for (local48 = 0; local48 < this.anInt8876; local48++) {
			Static245.aClass18Array14[local48].YA();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
	public final void method7851(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt8876; local15++) {
			this.method7847(64, arg0, local15, 64, arg1);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIIILclient!ol;I[Lclient!kn;)V")
	public final void method7852(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub8 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class200[] arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean642) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class200 local12 = arg5[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg4;
						@Pc(28) int local28 = arg2 + local18;
						if (local24 >= 0 && this.anInt8880 > local24 && local28 >= 0 && this.anInt8889 > local28) {
							local12.method5286(local24, local28);
						}
					}
				}
			}
		}
		local6 = arg4 + arg1;
		@Pc(71) int local71 = arg2 + arg0;
		for (local14 = 0; local14 < this.anInt8876; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method7846(arg2 + local24, 0, local14, arg4 + local18, local24 + local71, 0, arg3, false, 0, local18 + local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IILclient!ol;IIII[Lclient!kn;II)V")
	public final void method7853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub8 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class200[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg3 & 0x7) * 8;
		@Pc(17) int local17 = (arg4 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean642) {
			@Pc(24) Class200 local24 = arg6[arg0];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static516.method8013(local30 & 0x7, arg7, local26 & 0x7) + arg5;
					local56 = Static196.method3781(arg7, local26 & 0x7, local30 & 0x7) + arg1;
					if (local44 > 0 && this.anInt8880 - 1 > local44 && local56 > 0 && this.anInt8889 - 1 > local56) {
						local24.method5286(local44, local56);
					}
				}
			}
		}
		@Pc(98) int local98 = (arg3 & 0xFFFFFFF8) << 3;
		local26 = (arg4 & 0x1FFFFFF8) << 3;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (arg7 == 1) {
			local108 = 1;
		} else if (arg7 == 2) {
			local106 = 1;
			local108 = 1;
		} else if (arg7 == 3) {
			local106 = 1;
		}
		for (local56 = 0; local56 < this.anInt8876; local56++) {
			for (@Pc(137) int local137 = 0; local137 < 64; local137++) {
				for (@Pc(141) int local141 = 0; local141 < 64; local141++) {
					if (arg8 == local56 && local137 >= local11 && local137 <= local11 + 8 && local141 >= local17 && local17 + 8 >= local141) {
						@Pc(212) int local212;
						@Pc(222) int local222;
						if (local11 + 8 == local137 || local17 + 8 == local141) {
							if (arg7 == 0) {
								local222 = arg1 + local141 - local17;
								local212 = arg5 + local137 - local11;
							} else if (arg7 == 1) {
								local222 = arg1 + local11 + 8 - local137;
								local212 = arg5 + local141 - local17;
							} else if (arg7 == 2) {
								local212 = arg5 + local11 + 8 - local137;
								local222 = local17 + arg1 + 8 - local141;
							} else {
								local212 = local17 + arg5 + 8 - local141;
								local222 = local137 + arg1 - local11;
							}
							this.method7846(local222, 0, arg0, local212, local26 + local141, 0, arg2, true, 0, local137 + local98);
						} else {
							local212 = arg5 + Static516.method8013(local141 & 0x7, arg7, local137 & 0x7);
							local222 = Static196.method3781(arg7, local137 & 0x7, local141 & 0x7) + arg1;
							this.method7846(local222, arg7, arg0, local212, local26 + local141, local108, arg2, false, local106, local137 + local98);
						}
						if (local137 == 63 || local141 == 63) {
							@Pc(344) byte local344 = 1;
							if (local137 == 63 && local141 == 63) {
								local344 = 3;
							}
							for (@Pc(354) int local354 = 0; local354 < local344; local354++) {
								@Pc(358) int local358 = local137;
								@Pc(360) int local360 = local141;
								if (local354 == 0) {
									local358 = local137 == 63 ? 64 : local137;
									local360 = local141 == 63 ? 64 : local141;
								} else if (local354 == 1) {
									local358 = 64;
								} else if (local354 == 2) {
									local360 = 64;
								}
								@Pc(410) int local410;
								@Pc(419) int local419;
								if (arg7 == 0) {
									local410 = local358 + arg5 - local11;
									local419 = arg1 + local360 - local17;
								} else if (arg7 == 1) {
									local410 = arg5 + local360 - local17;
									local419 = local11 + arg1 + 8 - local358;
								} else if (arg7 == 2) {
									local419 = arg1 + local17 + 8 - local360;
									local410 = arg5 + local11 + 8 - local358;
								} else {
									local419 = arg1 + local358 - local11;
									local410 = arg5 + local17 + 8 - local360;
								}
								if (local410 >= 0 && local410 < this.anInt8880 && local419 >= 0 && this.anInt8889 > local419) {
									this.anIntArrayArrayArray14[arg0][local410][local419] = this.anIntArrayArrayArray14[arg0][local212 + local106][local108 + local222];
								}
							}
						}
					} else {
						this.method7846(-1, 0, 0, -1, 0, 0, arg2, false, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([[[IBLclient!ha;[Lclient!kn;)V")
	public final void method7855(@OriginalArg(0) int[][][] arg0, @OriginalArg(2) Class101 arg1, @OriginalArg(3) Class200[] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean642) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt8880; local14++) {
					for (local18 = 0; local18 < this.anInt8889; local18++) {
						if ((Static96.aByteArrayArrayArray10[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static96.aByteArrayArrayArray10[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg2[local32].method5287(local18, local14);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt8876; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean642) {
				if (Static169.aBoolean274) {
					local14 = 2;
				}
				if (Static548.aBoolean708) {
					local18 = 8;
				}
				if (Static443.anInt8022 != 0) {
					local14 |= 0x1;
					if (Static425.aBoolean581 | local10 == 0) {
						local18 |= 0x10;
					}
				}
			}
			if (Static169.aBoolean274) {
				local18 |= 0x7;
			}
			if (!Static563.aBoolean717) {
				local18 |= 0x20;
			}
			@Pc(148) int[][] local148 = arg0 == null || arg0.length <= local10 ? this.anIntArrayArrayArray14[local10] : arg0[local10];
			Static18.method346(local10, arg1.method8087(this.anInt8880, this.anInt8889, this.anIntArrayArrayArray14[local10], local148, local14, local18));
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!s;Lclient!s;[[IZILclient!ha;Lclient!s;)V")
	private void method7856(@OriginalArg(0) Class18 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class101 arg4, @OriginalArg(6) Class18 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray15[arg3];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray13[arg3];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray12[arg3];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray16[arg3];
		for (@Pc(27) int local27 = 0; local27 < this.anInt8880; local27++) {
			@Pc(43) int local43 = local27 >= this.anInt8880 - 1 ? local27 : local27 + 1;
			for (@Pc(45) int local45 = 0; local45 < this.anInt8889; local45++) {
				@Pc(63) int local63 = this.anInt8889 - 1 <= local45 ? local45 : local45 + 1;
				if (Static293.anInt7588 == -1 || Static586.method8860(local27, Static293.anInt7588, local45, arg3)) {
					@Pc(78) boolean local78 = false;
					@Pc(80) boolean local80 = false;
					@Pc(83) boolean[] local83 = new boolean[4];
					@Pc(89) int local89 = local10[local27][local45];
					@Pc(95) int local95 = local15[local27][local45];
					@Pc(103) int local103 = local25[local27][local45] & 0xFF;
					@Pc(111) int local111 = local20[local27][local45] & 0xFF;
					@Pc(119) int local119 = local20[local27][local63] & 0xFF;
					@Pc(127) int local127 = local20[local43][local63] & 0xFF;
					@Pc(135) int local135 = local20[local43][local45] & 0xFF;
					if (local103 != 0 || local111 != 0) {
						@Pc(154) Class137 local154 = local103 == 0 ? null : this.aClass266_5.method7114(local103 - 1);
						if (local89 == 0 && local154 == null) {
							local89 = 12;
						}
						@Pc(178) Class240 local178 = local111 == 0 ? null : this.aClass359_4.method9053(local111 - 1);
						@Pc(180) Class137 local180 = local154;
						if (local154 != null) {
							if (local154.anInt4435 == -1 && local154.anInt4434 == -1) {
								local180 = local154;
								local154 = null;
							} else if (local178 != null && local89 != 0) {
								local80 = local154.aBoolean348;
							}
						}
						@Pc(268) int local268;
						@Pc(317) int local317;
						@Pc(371) int local371;
						@Pc(383) int local383;
						if ((local89 == 0 || local89 == 12) && local27 > 0 && local45 > 0 && this.anInt8880 > local27 && local45 < this.anInt8889) {
							@Pc(245) int local245 = local111 == local20[local43][local63] ? 1 : -1;
							local268 = local111 == local20[local27 - 1][local45 - 1] ? 1 : -1;
							@Pc(283) int local283 = local111 == local20[local43][local45 - 1] ? 1 : -1;
							if (local20[local27][local45 - 1] == local111) {
								local283++;
								local268++;
							} else {
								local268--;
								local283--;
							}
							local317 = local20[local27 - 1][local63] == local111 ? 1 : -1;
							if (local111 == local20[local43][local45]) {
								local245++;
								local283++;
							} else {
								local283--;
								local245--;
							}
							if (local111 == local20[local27][local63]) {
								local317++;
								local245++;
							} else {
								local245--;
								local317--;
							}
							if (local111 == local20[local27 - 1][local45]) {
								local268++;
								local317++;
							} else {
								local268--;
								local317--;
							}
							local371 = local268 - local245;
							if (local371 < 0) {
								local371 = -local371;
							}
							local383 = local283 - local317;
							if (local383 < 0) {
								local383 = -local383;
							}
							if (local383 == local371) {
								local371 = arg0.method8537(local45, local27) - arg0.method8537(local63, local43);
								local383 = arg0.method8537(local45, local43) - arg0.method8537(local63, local27);
								if (local371 < 0) {
									local371 = -local371;
								}
								if (local383 < 0) {
									local383 = -local383;
								}
							}
							local95 = local371 >= local383 ? 0 : 1;
						}
						for (local268 = 0; local268 < 13; local268++) {
							Static424.anIntArray378[local268] = -1;
							Static412.anIntArray367[local268] = 1;
						}
						@Pc(471) boolean[] local471 = local154 != null && local154.aBoolean348 ? Static14.aBooleanArrayArray10[local89] : Static113.aBooleanArrayArray4[local89];
						this.method7849(local10, local178, arg4, local154, local95, this.anInt8880, local15, local45, local25, local83, local27, local89, this.anInt8889);
						@Pc(500) boolean local500 = local154 != null && local154.anInt4434 != local154.anInt4435;
						if (!local500) {
							for (local317 = 0; local317 < 8; local317++) {
								if (Static424.anIntArray378[local317] >= 0 && Static307.anIntArray287[local317] != Static432.anIntArray395[local317]) {
									local500 = true;
									break;
								}
							}
						}
						if (!local471[local95 + 1 & 0x3]) {
							local83[1] = Static478.method7623(local83[1], (Static412.anIntArray367[2] & Static412.anIntArray367[4]) == 0);
						}
						if (!local471[local95 + 3 & 0x3]) {
							local83[3] = Static478.method7623(local83[3], (Static412.anIntArray367[6] & Static412.anIntArray367[0]) == 0);
						}
						if (!local471[local95 & 0x3]) {
							local83[0] = Static478.method7623(local83[0], (Static412.anIntArray367[0] & Static412.anIntArray367[2]) == 0);
						}
						if (!local471[local95 + 2 & 0x3]) {
							local83[2] = Static478.method7623(local83[2], (Static412.anIntArray367[6] & Static412.anIntArray367[4]) == 0);
						}
						if (!local80 && (local89 == 0 || local89 == 12)) {
							if (local83[0] && !local83[1] && !local83[2] && local83[3]) {
								local89 = local89 == 0 ? 13 : 14;
								local83[0] = local83[3] = false;
								local95 = 0;
							} else if (local83[0] && local83[1] && !local83[2] && !local83[3]) {
								local95 = 3;
								local83[0] = local83[1] = false;
								local89 = local89 == 0 ? 13 : 14;
							} else if (!local83[0] && local83[1] && local83[2] && !local83[3]) {
								local89 = local89 == 0 ? 13 : 14;
								local83[1] = local83[2] = false;
								local95 = 2;
							} else if (!local83[0] && !local83[1] && local83[2] && local83[3]) {
								local95 = 1;
								local83[2] = local83[3] = false;
								local89 = local89 == 0 ? 13 : 14;
							}
						}
						@Pc(809) boolean local809 = !local80 && !local83[0] && !local83[2] && !local83[1] && !local83[3];
						@Pc(811) int[] local811 = null;
						@Pc(847) int[] local847;
						@Pc(831) int[] local831;
						@Pc(843) int[] local843;
						if (local809) {
							local383 = local154 == null ? 0 : Static288.anIntArray269[local89];
							local847 = Static520.anIntArrayArray44[local89];
							local831 = Static554.anIntArrayArray50[local89];
							local843 = Static653.anIntArrayArray60[local89];
							local371 = local178 == null ? 0 : Static552.anIntArray489[local89];
						} else if (local80) {
							local383 = local154 == null ? 0 : Static346.anIntArray318[local89];
							local811 = Static607.anIntArrayArray57[local89];
							local831 = Static524.anIntArrayArray46[local89];
							local371 = local178 == null ? 0 : Static125.anIntArray147[local89];
							local843 = Static347.anIntArrayArray29[local89];
							local847 = Static301.anIntArrayArray21[local89];
						} else {
							local811 = Static312.anIntArrayArray22[local89];
							local847 = Static299.anIntArrayArray20[local89];
							local371 = local178 == null ? 0 : Static82.anIntArray72[local89];
							local843 = Static523.anIntArrayArray45[local89];
							local383 = local154 == null ? 0 : Static648.anIntArray584[local89];
							local831 = Static365.anIntArrayArray30[local89];
						}
						@Pc(913) int local913 = local371 + local383;
						if (local913 <= 0) {
							Static557.method8501(arg3, local27, local45);
						} else {
							if (local83[0]) {
								local913++;
							}
							if (local83[2]) {
								local913++;
							}
							if (local83[1]) {
								local913++;
							}
							if (local83[3]) {
								local913++;
							}
							@Pc(946) int local946 = 0;
							@Pc(948) int local948 = 0;
							@Pc(952) int local952 = local913 * 3;
							@Pc(959) int[] local959 = local500 ? new int[local952] : null;
							@Pc(962) int[] local962 = new int[local952];
							@Pc(965) int[] local965 = new int[local952];
							@Pc(968) int[] local968 = new int[local952];
							@Pc(971) int[] local971 = new int[local952];
							@Pc(974) int[] local974 = new int[local952];
							@Pc(981) int[] local981 = arg5 == null ? null : new int[local952];
							@Pc(990) int[] local990 = arg5 == null && arg1 == null ? null : new int[local952];
							@Pc(992) int local992 = -1;
							@Pc(994) int local994 = -1;
							@Pc(996) int local996 = 256;
							@Pc(1118) byte local1118;
							@Pc(1040) int local1040;
							@Pc(1042) int local1042;
							@Pc(1270) int local1270;
							@Pc(1276) int local1276;
							@Pc(1285) int local1285;
							@Pc(1290) int local1290;
							@Pc(1302) int local1302;
							@Pc(1295) int local1295;
							@Pc(1307) int local1307;
							@Pc(1364) int local1364;
							@Pc(1370) int local1370;
							if (local154 != null) {
								local992 = local154.anInt4435;
								local996 = local154.anInt4438;
								local994 = local154.anInt4432;
								local1040 = Static310.method5089(arg4, local154);
								for (local1042 = 0; local1042 < local383; local1042++) {
									if (local83[-local95 & 0x3] && local811[0] == local946) {
										Static432.anIntArray396[0] = local847[local946];
										Static432.anIntArray396[1] = 1;
										Static432.anIntArray396[2] = local843[local946];
										Static432.anIntArray396[3] = 1;
										Static432.anIntArray396[4] = local831[local946];
										local1118 = 6;
										Static432.anIntArray396[5] = local843[local946];
									} else if (local83[2 - local95 & 0x3] && local811[2] == local946) {
										Static432.anIntArray396[0] = local847[local946];
										Static432.anIntArray396[1] = 5;
										Static432.anIntArray396[2] = local843[local946];
										Static432.anIntArray396[3] = 5;
										Static432.anIntArray396[4] = local831[local946];
										local1118 = 6;
										Static432.anIntArray396[5] = local843[local946];
									} else if (local83[1 - local95 & 0x3] && local946 == local811[1]) {
										Static432.anIntArray396[0] = local847[local946];
										Static432.anIntArray396[1] = 3;
										Static432.anIntArray396[2] = local843[local946];
										Static432.anIntArray396[3] = 3;
										Static432.anIntArray396[4] = local831[local946];
										local1118 = 6;
										Static432.anIntArray396[5] = local843[local946];
									} else if (local83[3 - local95 & 0x3] && local811[3] == local946) {
										Static432.anIntArray396[0] = local847[local946];
										Static432.anIntArray396[1] = 7;
										Static432.anIntArray396[2] = local843[local946];
										Static432.anIntArray396[3] = 7;
										Static432.anIntArray396[4] = local831[local946];
										local1118 = 6;
										Static432.anIntArray396[5] = local843[local946];
									} else {
										Static432.anIntArray396[0] = local847[local946];
										Static432.anIntArray396[1] = local831[local946];
										Static432.anIntArray396[2] = local843[local946];
										local1118 = 3;
									}
									for (local1270 = 0; local1270 < local1118; local1270++) {
										local1276 = Static432.anIntArray396[local1270];
										local1285 = local1276 - local95 * 2 & 0x7;
										local1290 = this.anIntArray449[local1276];
										local1295 = this.anIntArray448[local1276];
										if (local95 == 1) {
											local1302 = local1295;
											local1307 = 512 - local1290;
										} else if (local95 == 2) {
											local1302 = 512 - local1290;
											local1307 = 512 - local1295;
										} else if (local95 == 3) {
											local1302 = 512 - local1295;
											local1307 = local1290;
										} else {
											local1307 = local1295;
											local1302 = local1290;
										}
										local962[local948] = local1302;
										local965[local948] = local1307;
										if (local981 != null && Static500.aBooleanArrayArray11[local89][local1276]) {
											local1364 = (local27 << 9) + local1302;
											local1370 = local1307 + (local45 << 9);
											local981[local948] = arg5.method8542(local1370, local1364) - arg0.method8542(local1370, local1364);
										}
										if (local990 != null) {
											if (arg5 != null && !Static500.aBooleanArrayArray11[local89][local1276]) {
												local1364 = (local27 << 9) + local1302;
												local1370 = (local45 << 9) + local1307;
												local990[local948] = arg0.method8542(local1370, local1364) - arg5.method8542(local1370, local1364);
											} else if (arg1 != null && !Static80.aBooleanArrayArray2[local89][local1276]) {
												local1364 = local1302 + (local27 << 9);
												local1370 = (local45 << 9) + local1307;
												local990[local948] = arg1.method8542(local1370, local1364) - arg0.method8542(local1370, local1364);
											}
										}
										if (local1276 < 8 && local154.anInt4437 < Static424.anIntArray378[local1285]) {
											if (local959 != null) {
												local959[local948] = Static432.anIntArray395[local1285];
											}
											local974[local948] = Static663.anIntArray593[local1285];
											local971[local948] = Static347.anIntArray321[local1285];
											local968[local948] = Static307.anIntArray287[local1285];
										} else {
											if (local959 != null) {
												local959[local948] = local1040;
											}
											local971[local948] = local154.anInt4432;
											local974[local948] = local154.anInt4438;
											local968[local948] = local992;
										}
										local948++;
									}
									local946++;
								}
								if (!this.aBoolean642 && arg3 == 0) {
									Static680.method5119(local27, local45, local154.anInt4444, local154.anInt4443 * 8, local154.anInt4441);
								}
								if (local89 != 12 && local154.anInt4435 != -1 && local154.aBoolean345) {
									local78 = true;
								}
							} else if (local809) {
								local946 = Static288.anIntArray269[local89];
							} else if (local80) {
								local946 = Static346.anIntArray318[local89];
							} else {
								local946 = Static648.anIntArray584[local89];
							}
							if (local178 != null) {
								if (local127 == 0) {
									local127 = local111;
								}
								if (local135 == 0) {
									local135 = local111;
								}
								if (local119 == 0) {
									local119 = local111;
								}
								@Pc(1593) Class240 local1593 = this.aClass359_4.method9053(local111 - 1);
								@Pc(1601) Class240 local1601 = this.aClass359_4.method9053(local119 - 1);
								@Pc(1609) Class240 local1609 = this.aClass359_4.method9053(local127 - 1);
								@Pc(1617) Class240 local1617 = this.aClass359_4.method9053(local135 - 1);
								for (local1285 = 0; local1285 < local371; local1285++) {
									if (local83[-local95 & 0x3] && local811[0] == local946) {
										Static432.anIntArray396[0] = local847[local946];
										Static432.anIntArray396[1] = 1;
										Static432.anIntArray396[2] = local843[local946];
										Static432.anIntArray396[3] = 1;
										Static432.anIntArray396[4] = local831[local946];
										Static432.anIntArray396[5] = local843[local946];
										local1118 = 6;
									} else if (local83[2 - local95 & 0x3] && local811[2] == local946) {
										Static432.anIntArray396[0] = local847[local946];
										Static432.anIntArray396[1] = 5;
										Static432.anIntArray396[2] = local843[local946];
										Static432.anIntArray396[3] = 5;
										Static432.anIntArray396[4] = local831[local946];
										Static432.anIntArray396[5] = local843[local946];
										local1118 = 6;
									} else if (local83[1 - local95 & 0x3] && local811[1] == local946) {
										Static432.anIntArray396[0] = local847[local946];
										Static432.anIntArray396[1] = 3;
										Static432.anIntArray396[2] = local843[local946];
										Static432.anIntArray396[3] = 3;
										Static432.anIntArray396[4] = local831[local946];
										local1118 = 6;
										Static432.anIntArray396[5] = local843[local946];
									} else if (local83[3 - local95 & 0x3] && local811[3] == local946) {
										Static432.anIntArray396[0] = local847[local946];
										Static432.anIntArray396[1] = 7;
										Static432.anIntArray396[2] = local843[local946];
										Static432.anIntArray396[3] = 7;
										Static432.anIntArray396[4] = local831[local946];
										Static432.anIntArray396[5] = local843[local946];
										local1118 = 6;
									} else {
										Static432.anIntArray396[0] = local847[local946];
										Static432.anIntArray396[1] = local831[local946];
										Static432.anIntArray396[2] = local843[local946];
										local1118 = 3;
									}
									for (local1290 = 0; local1290 < local1118; local1290++) {
										local1302 = Static432.anIntArray396[local1290];
										local1295 = local1302 - local95 * 2 & 0x7;
										local1307 = this.anIntArray449[local1302];
										local1370 = this.anIntArray448[local1302];
										@Pc(1898) int local1898;
										if (local95 == 1) {
											local1364 = local1370;
											local1898 = 512 - local1307;
										} else if (local95 == 2) {
											local1898 = 512 - local1370;
											local1364 = 512 - local1307;
										} else if (local95 == 3) {
											local1364 = 512 - local1370;
											local1898 = local1307;
										} else {
											local1898 = local1370;
											local1364 = local1307;
										}
										local962[local948] = local1364;
										local965[local948] = local1898;
										@Pc(1947) int local1947;
										@Pc(1953) int local1953;
										if (local981 != null && Static500.aBooleanArrayArray11[local89][local1302]) {
											local1947 = local1364 + (local27 << 9);
											local1953 = (local45 << 9) + local1898;
											local981[local948] = arg5.method8542(local1953, local1947) - arg0.method8542(local1953, local1947);
										}
										if (local990 != null) {
											if (arg5 != null && !Static500.aBooleanArrayArray11[local89][local1302]) {
												local1947 = local1364 + (local27 << 9);
												local1953 = (local45 << 9) + local1898;
												local990[local948] = arg0.method8542(local1953, local1947) - arg5.method8542(local1953, local1947);
											} else if (arg1 != null && !Static80.aBooleanArrayArray2[local89][local1302]) {
												local1947 = (local27 << 9) + local1364;
												local1953 = (local45 << 9) + local1898;
												local990[local948] = arg1.method8542(local1953, local1947) - arg0.method8542(local1953, local1947);
											}
										}
										if (local1302 < 8 && Static424.anIntArray378[local1295] >= 0) {
											if (local959 != null) {
												local959[local948] = Static432.anIntArray395[local1295];
											}
											local974[local948] = Static663.anIntArray593[local1295];
											local971[local948] = Static347.anIntArray321[local1295];
											local968[local948] = Static307.anIntArray287[local1295];
										} else {
											if (local80 && Static500.aBooleanArrayArray11[local89][local1302]) {
												local971[local948] = local994;
												local974[local948] = local996;
												local968[local948] = local992;
											} else if (local1364 == 0 && local1898 == 0) {
												local968[local948] = arg2[local27][local45];
												local971[local948] = local1593.anInt7333;
												local974[local948] = local1593.anInt7334;
											} else if (local1364 == 0 && local1898 == 512) {
												local968[local948] = arg2[local27][local63];
												local971[local948] = local1601.anInt7333;
												local974[local948] = local1601.anInt7334;
											} else if (local1364 == 512 && local1898 == 512) {
												local968[local948] = arg2[local43][local63];
												local971[local948] = local1609.anInt7333;
												local974[local948] = local1609.anInt7334;
											} else if (local1364 == 512 && local1898 == 0) {
												local968[local948] = arg2[local43][local45];
												local971[local948] = local1617.anInt7333;
												local974[local948] = local1617.anInt7334;
											} else {
												if (local1364 >= 256) {
													if (local1898 >= 256) {
														local971[local948] = local1609.anInt7333;
														local974[local948] = local1609.anInt7334;
													} else {
														local971[local948] = local1617.anInt7333;
														local974[local948] = local1617.anInt7334;
													}
												} else if (local1898 >= 256) {
													local971[local948] = local1601.anInt7333;
													local974[local948] = local1601.anInt7334;
												} else {
													local971[local948] = local1593.anInt7333;
													local974[local948] = local1593.anInt7334;
												}
												local1947 = Static610.method9193(arg2[local27][local45], arg2[local43][local45], local1364 << 7 >> 9);
												local1953 = Static610.method9193(arg2[local27][local63], arg2[local43][local63], local1364 << 7 >> 9);
												local968[local948] = Static610.method9193(local1947, local1953, local1898 << 7 >> 9);
											}
											if (local959 != null) {
												local959[local948] = local968[local948];
											}
										}
										local948++;
									}
									local946++;
								}
								if (local89 != 0 && local178.aBoolean546) {
									local78 = true;
								}
							}
							local1040 = arg0.method8537(local45, local27);
							local1042 = arg0.method8537(local45, local43);
							local1270 = arg0.method8537(local63, local43);
							local1276 = arg0.method8537(local63, local27);
							@Pc(2374) boolean local2374 = Static45.method947(local27, local45);
							if (local2374 && arg3 > 1 || !local2374 && arg3 > 0) {
								@Pc(2387) boolean local2387 = true;
								if (local178 != null && !local178.aBoolean545) {
									local2387 = false;
								} else if (local111 == 0 && local89 != 0) {
									local2387 = false;
								} else if (local103 > 0 && local180 != null && !local180.aBoolean346) {
									local2387 = false;
								}
								if (local2387 && local1042 == local1040 && local1040 == local1270 && local1276 == local1040) {
									this.aByteArrayArrayArray14[arg3][local27][local45] = (byte) (this.aByteArrayArrayArray14[arg3][local27][local45] | 0x4);
								}
							}
							local1290 = 0;
							local1302 = 0;
							local1295 = 0;
							if (this.aBoolean642) {
								local1290 = Static432.method7061(local27, local45);
								local1302 = Static249.method4412(local27, local45);
								local1295 = Static394.method7229(local27, local45);
							}
							arg0.U(local27, local45, local962, local981, local965, local990, local968, local959, local971, local974, local1290, local1302, local1295, local78);
							Static557.method8501(arg3, local27, local45);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II[[I)V")
	public final void method7858(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray14[0];
		for (@Pc(17) int local17 = 0; local17 < this.anInt8880 + 1; local17++) {
			for (@Pc(21) int local21 = 0; local21 < this.anInt8889 + 1; local21++) {
				local10[local17][local21] += arg0[local17][local21];
			}
		}
	}
}
