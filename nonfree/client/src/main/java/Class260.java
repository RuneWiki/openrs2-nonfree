import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class260 {

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "[Lclient!dg;")
	public Class69[] aClass69Array3;

	@OriginalMember(owner = "client!qda", name = "e", descriptor = "[I")
	public int[] anIntArray542;

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "[I")
	public int[] anIntArray543;

	@OriginalMember(owner = "client!qda", name = "n", descriptor = "[I")
	public int[] anIntArray544;

	@OriginalMember(owner = "client!qda", name = "o", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!qda", name = "q", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!qda", name = "r", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!qda", name = "u", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!qda", name = "w", descriptor = "[I")
	public int[] anIntArray545;

	@OriginalMember(owner = "client!qda", name = "y", descriptor = "[I")
	public int[] anIntArray546;

	@OriginalMember(owner = "client!qda", name = "C", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!qda", name = "E", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!qda", name = "F", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!qda", name = "G", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!qda", name = "H", descriptor = "[I")
	public int[] anIntArray547;

	@OriginalMember(owner = "client!qda", name = "I", descriptor = "[I")
	public int[] anIntArray548;

	@OriginalMember(owner = "client!qda", name = "J", descriptor = "[Lclient!haa;")
	public Class128[] aClass128Array3;

	@OriginalMember(owner = "client!qda", name = "L", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!qda", name = "M", descriptor = "[I")
	public int[] anIntArray549;

	@OriginalMember(owner = "client!qda", name = "N", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!qda", name = "P", descriptor = "[I")
	public int[] anIntArray550;

	@OriginalMember(owner = "client!qda", name = "R", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!qda", name = "S", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!qda", name = "T", descriptor = "[I")
	public int[] anIntArray551;

	@OriginalMember(owner = "client!qda", name = "U", descriptor = "[Lclient!wg;")
	public Class346[] aClass346Array1;

	@OriginalMember(owner = "client!qda", name = "V", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!qda", name = "X", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!qda", name = "Z", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!qda", name = "db", descriptor = "[I")
	public int[] anIntArray552;

	@OriginalMember(owner = "client!qda", name = "B", descriptor = "I")
	public int anInt7707 = 0;

	@OriginalMember(owner = "client!qda", name = "Q", descriptor = "I")
	public int anInt7710 = 0;

	@OriginalMember(owner = "client!qda", name = "s", descriptor = "I")
	public int anInt7702 = 0;

	@OriginalMember(owner = "client!qda", name = "K", descriptor = "B")
	public byte aByte92 = 0;

	@OriginalMember(owner = "client!qda", name = "Y", descriptor = "I")
	public int anInt7712 = 0;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "I")
	public int anInt7693 = 12;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "([B)V")
	public Class260(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method6424(arg0);
		} else {
			this.method6432(arg0);
		}
	}

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(III)V")
	public Class260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray88 = new byte[arg1];
		this.anIntArray542 = new int[arg0];
		this.anIntArray548 = new int[arg0];
		this.aShortArray102 = new short[arg1];
		this.anIntArray545 = new int[arg1];
		this.aByteArray93 = new byte[arg1];
		this.aShortArray99 = new short[arg1];
		this.aShortArray104 = new short[arg1];
		this.aByteArray87 = new byte[arg1];
		this.anIntArray550 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray91 = new byte[arg2];
			this.aByteArray90 = new byte[arg2];
			this.aShortArray100 = new short[arg2];
			this.anIntArray549 = new int[arg2];
			this.anIntArray551 = new int[arg2];
			this.anIntArray543 = new int[arg2];
			this.anIntArray547 = new int[arg2];
			this.anIntArray544 = new int[arg2];
			this.aShortArray97 = new short[arg2];
			this.aByteArray89 = new byte[arg2];
			this.anIntArray552 = new int[arg2];
			this.aShortArray101 = new short[arg2];
		}
		this.aShortArray105 = new short[arg1];
		this.aShortArray98 = new short[arg1];
		this.anIntArray546 = new int[arg0];
		this.aByteArray92 = new byte[arg1];
	}

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "([Lclient!qda;I)V")
	public Class260(@OriginalArg(0) Class260[] arg0, @OriginalArg(1) int arg1) {
		this.anInt7712 = 0;
		this.anInt7710 = 0;
		this.anInt7702 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte92 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class260 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt7710 += local59.anInt7710;
				this.anInt7712 += local59.anInt7712;
				this.anInt7702 += local59.anInt7702;
				if (local59.aClass69Array3 != null) {
					local32 += local59.aClass69Array3.length;
				}
				local38 |= local59.aByteArray88 != null;
				if (local59.aClass346Array1 != null) {
					local36 += local59.aClass346Array1.length;
				}
				if (local59.aClass128Array3 != null) {
					local34 += local59.aClass128Array3.length;
				}
				local44 |= local59.aByteArray92 != null;
				if (local59.aByteArray87 == null) {
					if (this.aByte92 == -1) {
						this.aByte92 = local59.aByte92;
					}
					if (this.aByte92 != local59.aByte92) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray98 != null;
				local48 |= local59.anIntArray545 != null;
				local42 |= local59.aByteArray93 != null;
			}
		}
		this.anIntArray542 = new int[this.anInt7712];
		if (local46) {
			this.aShortArray98 = new short[this.anInt7710];
		}
		this.aShortArray105 = new short[this.anInt7710];
		this.anIntArray546 = new int[this.anInt7712];
		this.anIntArray550 = new int[this.anInt7712];
		this.aShortArray96 = new short[this.anInt7710];
		this.aShortArray104 = new short[this.anInt7710];
		this.aShortArray102 = new short[this.anInt7710];
		if (local40) {
			this.aByteArray87 = new byte[this.anInt7710];
		}
		if (local36 > 0) {
			this.aClass346Array1 = new Class346[local36];
		}
		this.anIntArray548 = new int[this.anInt7712];
		if (local34 > 0) {
			this.aClass128Array3 = new Class128[local34];
		}
		if (local48) {
			this.anIntArray545 = new int[this.anInt7710];
		}
		this.aShortArray99 = new short[this.anInt7710];
		if (this.anInt7702 > 0) {
			this.anIntArray549 = new int[this.anInt7702];
			this.anIntArray551 = new int[this.anInt7702];
			this.anIntArray552 = new int[this.anInt7702];
			this.anIntArray547 = new int[this.anInt7702];
			this.anIntArray543 = new int[this.anInt7702];
			this.aShortArray100 = new short[this.anInt7702];
			this.aShortArray101 = new short[this.anInt7702];
			this.aShortArray97 = new short[this.anInt7702];
			this.aByteArray89 = new byte[this.anInt7702];
			this.aByteArray91 = new byte[this.anInt7702];
			this.aByteArray90 = new byte[this.anInt7702];
			this.anIntArray544 = new int[this.anInt7702];
		}
		if (local38) {
			this.aByteArray88 = new byte[this.anInt7710];
		}
		this.aShortArray103 = new short[this.anInt7712];
		if (local32 > 0) {
			this.aClass69Array3 = new Class69[local32];
		}
		if (local44) {
			this.aByteArray92 = new byte[this.anInt7710];
		}
		if (local42) {
			this.aByteArray93 = new byte[this.anInt7710];
		}
		this.anInt7710 = 0;
		local36 = 0;
		local34 = 0;
		this.anInt7702 = 0;
		local32 = 0;
		this.anInt7712 = 0;
		@Pc(613) int local613;
		@Pc(624) int local624;
		for (@Pc(377) int local377 = 0; local377 < arg1; local377++) {
			@Pc(384) short local384 = (short) (0x1 << local377);
			@Pc(388) Class260 local388 = arg0[local377];
			if (local388 != null) {
				@Pc(395) int local395;
				if (local388.aClass346Array1 != null) {
					for (local395 = 0; local395 < local388.aClass346Array1.length; local395++) {
						@Pc(402) Class346 local402 = local388.aClass346Array1[local395];
						this.aClass346Array1[local36++] = local402.method8022(local402.anInt9613 + this.anInt7710);
					}
				}
				for (local395 = 0; local395 < local388.anInt7710; local395++) {
					if (local38 && local388.aByteArray88 != null) {
						this.aByteArray88[this.anInt7710] = local388.aByteArray88[local395];
					}
					if (local40) {
						if (local388.aByteArray87 == null) {
							this.aByteArray87[this.anInt7710] = local388.aByte92;
						} else {
							this.aByteArray87[this.anInt7710] = local388.aByteArray87[local395];
						}
					}
					if (local42 && local388.aByteArray93 != null) {
						this.aByteArray93[this.anInt7710] = local388.aByteArray93[local395];
					}
					if (local46) {
						if (local388.aShortArray98 == null) {
							this.aShortArray98[this.anInt7710] = -1;
						} else {
							this.aShortArray98[this.anInt7710] = local388.aShortArray98[local395];
						}
					}
					if (local48) {
						if (local388.anIntArray545 == null) {
							this.anIntArray545[this.anInt7710] = -1;
						} else {
							this.anIntArray545[this.anInt7710] = local388.anIntArray545[local395];
						}
					}
					this.aShortArray104[this.anInt7710] = (short) this.method6425(local388.aShortArray104[local395], local388, local384);
					this.aShortArray105[this.anInt7710] = (short) this.method6425(local388.aShortArray105[local395], local388, local384);
					this.aShortArray99[this.anInt7710] = (short) this.method6425(local388.aShortArray99[local395], local388, local384);
					this.aShortArray96[this.anInt7710] = local384;
					this.aShortArray102[this.anInt7710] = local388.aShortArray102[local395];
					this.anInt7710++;
				}
				@Pc(600) int local600;
				if (local388.aClass69Array3 != null) {
					for (local600 = 0; local600 < local388.aClass69Array3.length; local600++) {
						local613 = this.method6425(local388.aClass69Array3[local600].anInt2226, local388, local384);
						local624 = this.method6425(local388.aClass69Array3[local600].anInt2232, local388, local384);
						@Pc(635) int local635 = this.method6425(local388.aClass69Array3[local600].anInt2230, local388, local384);
						this.aClass69Array3[local32] = local388.aClass69Array3[local600].method2010(local635, local613, local624);
						local32++;
					}
				}
				if (local388.aClass128Array3 != null) {
					for (local600 = 0; local600 < local388.aClass128Array3.length; local600++) {
						local613 = this.method6425(local388.aClass128Array3[local600].anInt4093, local388, local384);
						this.aClass128Array3[local34] = local388.aClass128Array3[local600].method3605(local613);
						local34++;
					}
				}
			}
		}
		this.anInt7707 = this.anInt7712;
		@Pc(701) int local701 = 0;
		for (@Pc(703) int local703 = 0; local703 < arg1; local703++) {
			@Pc(710) short local710 = (short) (0x1 << local703);
			@Pc(714) Class260 local714 = arg0[local703];
			if (local714 != null) {
				for (local613 = 0; local613 < local714.anInt7710; local613++) {
					if (local44) {
						this.aByteArray92[local701++] = (byte) (local714.aByteArray92 == null || local714.aByteArray92[local613] == -1 ? -1 : local714.aByteArray92[local613] + this.anInt7702);
					}
				}
				for (local624 = 0; local624 < local714.anInt7702; local624++) {
					@Pc(770) byte local770 = this.aByteArray91[this.anInt7702] = local714.aByteArray91[local624];
					if (local770 == 0) {
						this.aShortArray100[this.anInt7702] = (short) this.method6425(local714.aShortArray100[local624], local714, local710);
						this.aShortArray101[this.anInt7702] = (short) this.method6425(local714.aShortArray101[local624], local714, local710);
						this.aShortArray97[this.anInt7702] = (short) this.method6425(local714.aShortArray97[local624], local714, local710);
					}
					if (local770 >= 1 && local770 <= 3) {
						this.aShortArray100[this.anInt7702] = local714.aShortArray100[local624];
						this.aShortArray101[this.anInt7702] = local714.aShortArray101[local624];
						this.aShortArray97[this.anInt7702] = local714.aShortArray97[local624];
						this.anIntArray544[this.anInt7702] = local714.anIntArray544[local624];
						this.anIntArray543[this.anInt7702] = local714.anIntArray543[local624];
						this.anIntArray551[this.anInt7702] = local714.anIntArray551[local624];
						this.aByteArray90[this.anInt7702] = local714.aByteArray90[local624];
						this.aByteArray89[this.anInt7702] = local714.aByteArray89[local624];
						this.anIntArray547[this.anInt7702] = local714.anIntArray547[local624];
					}
					if (local770 == 2) {
						this.anIntArray552[this.anInt7702] = local714.anIntArray552[local624];
						this.anIntArray549[this.anInt7702] = local714.anIntArray549[local624];
					}
					this.anInt7702++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BSS)V")
	public void method6422(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt7710; local11++) {
			if (arg0 == this.aShortArray102[local11]) {
				this.aShortArray102[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
	public void method6423() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7712; local7++) {
			this.anIntArray550[local7] <<= 0x2;
			this.anIntArray548[local7] <<= 0x2;
			this.anIntArray542[local7] <<= 0x2;
		}
		if (this.anInt7702 <= 0 || this.anIntArray544 == null) {
			return;
		}
		for (@Pc(49) int local49 = 0; local49 < this.anIntArray544.length; local49++) {
			this.anIntArray544[local49] <<= 0x2;
			this.anIntArray543[local49] <<= 0x2;
			if (this.aByteArray91[local49] != 1) {
				this.anIntArray551[local49] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "([BZ)V")
	private void method6424(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub26 local10 = new Class6_Sub26(arg0);
		@Pc(15) Class6_Sub26 local15 = new Class6_Sub26(arg0);
		@Pc(20) Class6_Sub26 local20 = new Class6_Sub26(arg0);
		@Pc(25) Class6_Sub26 local25 = new Class6_Sub26(arg0);
		@Pc(30) Class6_Sub26 local30 = new Class6_Sub26(arg0);
		@Pc(35) Class6_Sub26 local35 = new Class6_Sub26(arg0);
		@Pc(40) Class6_Sub26 local40 = new Class6_Sub26(arg0);
		local10.anInt5769 = arg0.length - 23;
		this.anInt7712 = local10.method4999();
		this.anInt7710 = local10.method4999();
		this.anInt7702 = local10.method4966();
		@Pc(65) int local65 = local10.method4966();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(98) boolean local98 = (local65 & 0x4) == 4;
		@Pc(109) boolean local109 = (local65 & 0x8) == 8;
		if (local109) {
			local10.anInt5769 -= 7;
			this.anInt7693 = local10.method4966();
			local10.anInt5769 += 6;
		}
		@Pc(132) int local132 = local10.method4966();
		@Pc(136) int local136 = local10.method4966();
		@Pc(140) int local140 = local10.method4966();
		@Pc(144) int local144 = local10.method4966();
		@Pc(148) int local148 = local10.method4966();
		@Pc(152) int local152 = local10.method4999();
		@Pc(156) int local156 = local10.method4999();
		@Pc(160) int local160 = local10.method4999();
		@Pc(164) int local164 = local10.method4999();
		@Pc(168) int local168 = local10.method4999();
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(187) int local187;
		if (this.anInt7702 > 0) {
			this.aByteArray91 = new byte[this.anInt7702];
			local10.anInt5769 = 0;
			for (local187 = 0; local187 < this.anInt7702; local187++) {
				@Pc(198) byte local198 = this.aByteArray91[local187] = local10.method4972();
				if (local198 == 0) {
					local170++;
				}
				if (local198 >= 1 && local198 <= 3) {
					local172++;
				}
				if (local198 == 2) {
					local174++;
				}
			}
		}
		local187 = this.anInt7702;
		@Pc(232) int local232 = local187;
		local187 += this.anInt7712;
		@Pc(239) int local239 = local187;
		if (local76) {
			local187 += this.anInt7710;
		}
		@Pc(248) int local248 = local187;
		local187 += this.anInt7710;
		@Pc(255) int local255 = local187;
		if (local132 == 255) {
			local187 += this.anInt7710;
		}
		@Pc(265) int local265 = local187;
		if (local140 == 1) {
			local187 += this.anInt7710;
		}
		@Pc(277) int local277 = local187;
		if (local148 == 1) {
			local187 += this.anInt7712;
		}
		@Pc(287) int local287 = local187;
		if (local136 == 1) {
			local187 += this.anInt7710;
		}
		@Pc(299) int local299 = local187;
		local187 += local164;
		@Pc(305) int local305 = local187;
		if (local144 == 1) {
			local187 += this.anInt7710 * 2;
		}
		@Pc(317) int local317 = local187;
		local187 += local168;
		@Pc(323) int local323 = local187;
		local187 += this.anInt7710 * 2;
		@Pc(332) int local332 = local187;
		local187 += local152;
		@Pc(338) int local338 = local187;
		local187 += local156;
		@Pc(344) int local344 = local187;
		local187 += local160;
		@Pc(350) int local350 = local187;
		local187 += local170 * 6;
		@Pc(358) int local358 = local187;
		local187 += local172 * 6;
		@Pc(366) byte local366 = 6;
		if (this.anInt7693 == 14) {
			local366 = 7;
		} else if (this.anInt7693 >= 15) {
			local366 = 9;
		}
		@Pc(384) int local384 = local187;
		local187 += local366 * local172;
		@Pc(396) int local396 = local187;
		local187 += local172;
		@Pc(402) int local402 = local187;
		local187 += local172;
		@Pc(408) int local408 = local187;
		local187 += local174 * 2 + local172;
		this.anIntArray548 = new int[this.anInt7712];
		local10.anInt5769 = local232;
		if (local140 == 1) {
			this.anIntArray545 = new int[this.anInt7710];
		}
		this.aShortArray102 = new short[this.anInt7710];
		if (local148 == 1) {
			this.anIntArray546 = new int[this.anInt7712];
		}
		this.anIntArray542 = new int[this.anInt7712];
		if (this.anInt7702 > 0) {
			this.aShortArray100 = new short[this.anInt7702];
			this.aShortArray101 = new short[this.anInt7702];
			if (local172 > 0) {
				this.anIntArray551 = new int[local172];
				this.anIntArray547 = new int[local172];
				this.aByteArray89 = new byte[local172];
				this.anIntArray543 = new int[local172];
				this.aByteArray90 = new byte[local172];
				this.anIntArray544 = new int[local172];
			}
			if (local174 > 0) {
				this.anIntArray552 = new int[local174];
				this.anIntArray549 = new int[local174];
			}
			this.aShortArray97 = new short[this.anInt7702];
		}
		this.aShortArray104 = new short[this.anInt7710];
		if (local132 == 255) {
			this.aByteArray87 = new byte[this.anInt7710];
		} else {
			this.aByte92 = (byte) local132;
		}
		if (local144 == 1 && this.anInt7702 > 0) {
			this.aByteArray92 = new byte[this.anInt7710];
		}
		if (local144 == 1) {
			this.aShortArray98 = new short[this.anInt7710];
		}
		this.anIntArray550 = new int[this.anInt7712];
		if (local136 == 1) {
			this.aByteArray93 = new byte[this.anInt7710];
		}
		this.aShortArray105 = new short[this.anInt7710];
		this.aShortArray99 = new short[this.anInt7710];
		if (local76) {
			this.aByteArray88 = new byte[this.anInt7710];
		}
		local15.anInt5769 = local332;
		local20.anInt5769 = local338;
		local25.anInt5769 = local344;
		local30.anInt5769 = local277;
		@Pc(604) int local604 = 0;
		@Pc(606) int local606 = 0;
		@Pc(608) int local608 = 0;
		@Pc(616) int local616;
		for (@Pc(610) int local610 = 0; local610 < this.anInt7712; local610++) {
			local616 = local10.method4966();
			@Pc(618) int local618 = 0;
			if ((local616 & 0x1) != 0) {
				local618 = local15.method4997();
			}
			@Pc(628) int local628 = 0;
			if ((local616 & 0x2) != 0) {
				local628 = local20.method4997();
			}
			@Pc(638) int local638 = 0;
			if ((local616 & 0x4) != 0) {
				local638 = local25.method4997();
			}
			this.anIntArray550[local610] = local618 + local604;
			this.anIntArray548[local610] = local628 + local606;
			this.anIntArray542[local610] = local638 + local608;
			local604 = this.anIntArray550[local610];
			local608 = this.anIntArray542[local610];
			local606 = this.anIntArray548[local610];
			if (local148 == 1) {
				this.anIntArray546[local610] = local30.method4966();
			}
		}
		local10.anInt5769 = local323;
		local15.anInt5769 = local239;
		local20.anInt5769 = local255;
		local25.anInt5769 = local287;
		local30.anInt5769 = local265;
		local35.anInt5769 = local305;
		local40.anInt5769 = local317;
		for (local616 = 0; local616 < this.anInt7710; local616++) {
			this.aShortArray102[local616] = (short) local10.method4999();
			if (local76) {
				this.aByteArray88[local616] = local15.method4972();
			}
			if (local132 == 255) {
				this.aByteArray87[local616] = local20.method4972();
			}
			if (local136 == 1) {
				this.aByteArray93[local616] = local25.method4972();
			}
			if (local140 == 1) {
				this.anIntArray545[local616] = local30.method4966();
			}
			if (local144 == 1) {
				this.aShortArray98[local616] = (short) (local35.method4999() - 1);
			}
			if (this.aByteArray92 != null) {
				if (this.aShortArray98[local616] == -1) {
					this.aByteArray92[local616] = -1;
				} else {
					this.aByteArray92[local616] = (byte) (local40.method4966() - 1);
				}
			}
		}
		this.anInt7707 = -1;
		local10.anInt5769 = local299;
		local15.anInt5769 = local248;
		@Pc(838) short local838 = 0;
		@Pc(840) short local840 = 0;
		@Pc(842) short local842 = 0;
		@Pc(844) short local844 = 0;
		@Pc(852) int local852;
		for (@Pc(846) int local846 = 0; local846 < this.anInt7710; local846++) {
			local852 = local15.method4966();
			if (local852 == 1) {
				local838 = (short) (local844 + local10.method4997());
				local840 = (short) (local838 + local10.method4997());
				local842 = (short) (local10.method4997() + local840);
				this.aShortArray104[local846] = local838;
				local844 = local842;
				this.aShortArray105[local846] = local840;
				this.aShortArray99[local846] = local842;
				if (local838 > this.anInt7707) {
					this.anInt7707 = local838;
				}
				if (local840 > this.anInt7707) {
					this.anInt7707 = local840;
				}
				if (this.anInt7707 < local842) {
					this.anInt7707 = local842;
				}
			}
			if (local852 == 2) {
				local840 = local842;
				local842 = (short) (local844 + local10.method4997());
				local844 = local842;
				this.aShortArray104[local846] = local838;
				this.aShortArray105[local846] = local840;
				this.aShortArray99[local846] = local842;
				if (local842 > this.anInt7707) {
					this.anInt7707 = local842;
				}
			}
			if (local852 == 3) {
				local838 = local842;
				local842 = (short) (local844 + local10.method4997());
				this.aShortArray104[local846] = local838;
				local844 = local842;
				this.aShortArray105[local846] = local840;
				this.aShortArray99[local846] = local842;
				if (local842 > this.anInt7707) {
					this.anInt7707 = local842;
				}
			}
			if (local852 == 4) {
				@Pc(1009) short local1009 = local838;
				local838 = local840;
				local842 = (short) (local844 + local10.method4997());
				local840 = local1009;
				this.aShortArray104[local846] = local838;
				local844 = local842;
				this.aShortArray105[local846] = local1009;
				this.aShortArray99[local846] = local842;
				if (this.anInt7707 < local842) {
					this.anInt7707 = local842;
				}
			}
		}
		this.anInt7707++;
		local10.anInt5769 = local350;
		local15.anInt5769 = local358;
		local20.anInt5769 = local384;
		local25.anInt5769 = local396;
		local30.anInt5769 = local402;
		local35.anInt5769 = local408;
		@Pc(1088) int local1088;
		for (local852 = 0; local852 < this.anInt7702; local852++) {
			local1088 = this.aByteArray91[local852] & 0xFF;
			if (local1088 == 0) {
				this.aShortArray100[local852] = (short) local10.method4999();
				this.aShortArray101[local852] = (short) local10.method4999();
				this.aShortArray97[local852] = (short) local10.method4999();
			}
			if (local1088 == 1) {
				this.aShortArray100[local852] = (short) local15.method4999();
				this.aShortArray101[local852] = (short) local15.method4999();
				this.aShortArray97[local852] = (short) local15.method4999();
				if (this.anInt7693 < 15) {
					this.anIntArray544[local852] = local20.method4999();
					if (this.anInt7693 >= 14) {
						this.anIntArray543[local852] = local20.method4949();
					} else {
						this.anIntArray543[local852] = local20.method4999();
					}
					this.anIntArray551[local852] = local20.method4999();
				} else {
					this.anIntArray544[local852] = local20.method4949();
					this.anIntArray543[local852] = local20.method4949();
					this.anIntArray551[local852] = local20.method4949();
				}
				this.aByteArray90[local852] = local25.method4972();
				this.aByteArray89[local852] = local30.method4972();
				this.anIntArray547[local852] = local35.method4972();
			}
			if (local1088 == 2) {
				this.aShortArray100[local852] = (short) local15.method4999();
				this.aShortArray101[local852] = (short) local15.method4999();
				this.aShortArray97[local852] = (short) local15.method4999();
				if (this.anInt7693 < 15) {
					this.anIntArray544[local852] = local20.method4999();
					if (this.anInt7693 >= 14) {
						this.anIntArray543[local852] = local20.method4949();
					} else {
						this.anIntArray543[local852] = local20.method4999();
					}
					this.anIntArray551[local852] = local20.method4999();
				} else {
					this.anIntArray544[local852] = local20.method4949();
					this.anIntArray543[local852] = local20.method4949();
					this.anIntArray551[local852] = local20.method4949();
				}
				this.aByteArray90[local852] = local25.method4972();
				this.aByteArray89[local852] = local30.method4972();
				this.anIntArray547[local852] = local35.method4972();
				this.anIntArray552[local852] = local35.method4972();
				this.anIntArray549[local852] = local35.method4972();
			}
			if (local1088 == 3) {
				this.aShortArray100[local852] = (short) local15.method4999();
				this.aShortArray101[local852] = (short) local15.method4999();
				this.aShortArray97[local852] = (short) local15.method4999();
				if (this.anInt7693 < 15) {
					this.anIntArray544[local852] = local20.method4999();
					if (this.anInt7693 < 14) {
						this.anIntArray543[local852] = local20.method4999();
					} else {
						this.anIntArray543[local852] = local20.method4949();
					}
					this.anIntArray551[local852] = local20.method4999();
				} else {
					this.anIntArray544[local852] = local20.method4949();
					this.anIntArray543[local852] = local20.method4949();
					this.anIntArray551[local852] = local20.method4949();
				}
				this.aByteArray90[local852] = local25.method4972();
				this.aByteArray89[local852] = local30.method4972();
				this.anIntArray547[local852] = local35.method4972();
			}
		}
		local10.anInt5769 = local187;
		@Pc(1497) int local1497;
		@Pc(1503) int local1503;
		@Pc(1507) int local1507;
		@Pc(1572) int local1572;
		if (local87) {
			local1088 = local10.method4966();
			if (local1088 > 0) {
				this.aClass69Array3 = new Class69[local1088];
				for (local1497 = 0; local1497 < local1088; local1497++) {
					local1503 = local10.method4999();
					local1507 = local10.method4999();
					@Pc(1517) byte local1517;
					if (local132 == 255) {
						local1517 = this.aByteArray87[local1507];
					} else {
						local1517 = (byte) local132;
					}
					this.aClass69Array3[local1497] = new Class69(local1503, this.aShortArray104[local1507], this.aShortArray105[local1507], this.aShortArray99[local1507], local1517);
				}
			}
			local1497 = local10.method4966();
			if (local1497 > 0) {
				this.aClass128Array3 = new Class128[local1497];
				for (local1503 = 0; local1503 < local1497; local1503++) {
					local1507 = local10.method4999();
					local1572 = local10.method4999();
					this.aClass128Array3[local1503] = new Class128(local1507, local1572);
				}
			}
		}
		if (!local98) {
			return;
		}
		local1088 = local10.method4966();
		if (local1088 <= 0) {
			return;
		}
		this.aClass346Array1 = new Class346[local1088];
		for (local1497 = 0; local1497 < local1088; local1497++) {
			local1503 = local10.method4999();
			local1507 = local10.method4999();
			local1572 = local10.method4966();
			@Pc(1621) byte local1621 = local10.method4972();
			this.aClass346Array1[local1497] = new Class346(local1503, local1507, local1572, local1621);
		}
		return;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ILclient!qda;IS)I")
	private int method6425(@OriginalArg(0) int arg0, @OriginalArg(1) Class260 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray550[arg0];
		@Pc(15) int local15 = arg1.anIntArray548[arg0];
		@Pc(20) int local20 = arg1.anIntArray542[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt7712; local22++) {
			if (local10 == this.anIntArray550[local22] && this.anIntArray548[local22] == local15 && local20 == this.anIntArray542[local22]) {
				this.aShortArray103[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray550[this.anInt7712] = local10;
		this.anIntArray548[this.anInt7712] = local15;
		this.anIntArray542[this.anInt7712] = local20;
		this.aShortArray103[this.anInt7712] = arg2;
		this.anIntArray546[this.anInt7712] = arg1.anIntArray546 == null ? -1 : arg1.anIntArray546[arg0];
		return this.anInt7712++;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIII)V")
	public void method6426(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7712; local3++) {
			this.anIntArray550[local3] += arg1;
			this.anIntArray548[local3] += arg0;
			this.anIntArray542[local3] += arg2;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IISBISBIB)I")
	public int method6428(@OriginalArg(1) int arg0, @OriginalArg(2) short arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3, @OriginalArg(5) short arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray104[this.anInt7710] = (short) arg6;
		this.aShortArray105[this.anInt7710] = (short) arg3;
		this.aShortArray99[this.anInt7710] = (short) arg0;
		this.aByteArray88[this.anInt7710] = arg7;
		this.aByteArray92[this.anInt7710] = arg2;
		this.aShortArray102[this.anInt7710] = arg4;
		this.aByteArray93[this.anInt7710] = arg5;
		this.aShortArray98[this.anInt7710] = arg1;
		return this.anInt7710++;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZIII)V")
	public void method6430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg1 != 0) {
			local10 = Class179.anIntArray756[arg1];
			local14 = Class179.anIntArray757[arg1];
			for (local16 = 0; local16 < this.anInt7712; local16++) {
				local34 = local10 * this.anIntArray548[local16] + this.anIntArray550[local16] * local14 >> 14;
				this.anIntArray548[local16] = this.anIntArray548[local16] * local14 - this.anIntArray550[local16] * local10 >> 14;
				this.anIntArray550[local16] = local34;
			}
		}
		if (arg0 != 0) {
			local10 = Class179.anIntArray756[arg0];
			local14 = Class179.anIntArray757[arg0];
			for (local16 = 0; local16 < this.anInt7712; local16++) {
				local34 = this.anIntArray548[local16] * local14 - this.anIntArray542[local16] * local10 >> 14;
				this.anIntArray542[local16] = this.anIntArray542[local16] * local14 + this.anIntArray548[local16] * local10 >> 14;
				this.anIntArray548[local16] = local34;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local10 = Class179.anIntArray756[arg2];
		local14 = Class179.anIntArray757[arg2];
		for (local16 = 0; local16 < this.anInt7712; local16++) {
			local34 = local10 * this.anIntArray542[local16] + local14 * this.anIntArray550[local16] >> 14;
			this.anIntArray542[local16] = this.anIntArray542[local16] * local14 - this.anIntArray550[local16] * local10 >> 14;
			this.anIntArray550[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(IIII)I")
	public int method6431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7712; local7++) {
			if (this.anIntArray550[local7] == arg2 && arg1 == this.anIntArray548[local7] && arg0 == this.anIntArray542[local7]) {
				return local7;
			}
		}
		this.anIntArray550[this.anInt7712] = arg2;
		this.anIntArray548[this.anInt7712] = arg1;
		this.anIntArray542[this.anInt7712] = arg0;
		this.anInt7707 = this.anInt7712 + 1;
		return this.anInt7712++;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "([BI)V")
	private void method6432(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub26 local14 = new Class6_Sub26(arg0);
		@Pc(19) Class6_Sub26 local19 = new Class6_Sub26(arg0);
		@Pc(24) Class6_Sub26 local24 = new Class6_Sub26(arg0);
		@Pc(29) Class6_Sub26 local29 = new Class6_Sub26(arg0);
		@Pc(34) Class6_Sub26 local34 = new Class6_Sub26(arg0);
		local14.anInt5769 = arg0.length - 18;
		this.anInt7712 = local14.method4999();
		this.anInt7710 = local14.method4999();
		this.anInt7702 = local14.method4966();
		@Pc(61) int local61 = local14.method4966();
		@Pc(67) int local67 = local14.method4966();
		@Pc(73) int local73 = local14.method4966();
		@Pc(77) int local77 = local14.method4966();
		@Pc(81) int local81 = local14.method4966();
		@Pc(85) int local85 = local14.method4999();
		@Pc(89) int local89 = local14.method4999();
		@Pc(93) int local93 = local14.method4999();
		@Pc(97) int local97 = local14.method4999();
		@Pc(106) int local106 = this.anInt7712;
		@Pc(108) int local108 = local106;
		local106 += this.anInt7710;
		@Pc(115) int local115 = local106;
		if (local67 == 255) {
			local106 += this.anInt7710;
		}
		@Pc(125) int local125 = local106;
		if (local77 == 1) {
			local106 += this.anInt7710;
		}
		@Pc(135) int local135 = local106;
		if (local61 == 1) {
			local106 += this.anInt7710;
		}
		@Pc(145) int local145 = local106;
		if (local81 == 1) {
			local106 += this.anInt7712;
		}
		@Pc(157) int local157 = local106;
		if (local73 == 1) {
			local106 += this.anInt7710;
		}
		@Pc(169) int local169 = local106;
		local106 += local97;
		@Pc(175) int local175 = local106;
		local106 += this.anInt7710 * 2;
		@Pc(184) int local184 = local106;
		local106 += this.anInt7702 * 6;
		@Pc(193) int local193 = local106;
		local106 += local85;
		@Pc(199) int local199 = local106;
		local106 += local89;
		if (local73 == 1) {
			this.aByteArray93 = new byte[this.anInt7710];
		}
		this.aShortArray105 = new short[this.anInt7710];
		local14.anInt5769 = 0;
		if (local77 == 1) {
			this.anIntArray545 = new int[this.anInt7710];
		}
		this.anIntArray550 = new int[this.anInt7712];
		this.anIntArray548 = new int[this.anInt7712];
		if (this.anInt7702 > 0) {
			this.aShortArray100 = new short[this.anInt7702];
			this.aShortArray97 = new short[this.anInt7702];
			this.aShortArray101 = new short[this.anInt7702];
			this.aByteArray91 = new byte[this.anInt7702];
		}
		this.aShortArray102 = new short[this.anInt7710];
		if (local67 == 255) {
			this.aByteArray87 = new byte[this.anInt7710];
		} else {
			this.aByte92 = (byte) local67;
		}
		this.anIntArray542 = new int[this.anInt7712];
		this.aShortArray99 = new short[this.anInt7710];
		if (local61 == 1) {
			this.aByteArray92 = new byte[this.anInt7710];
			this.aByteArray88 = new byte[this.anInt7710];
			this.aShortArray98 = new short[this.anInt7710];
		}
		this.aShortArray104 = new short[this.anInt7710];
		if (local81 == 1) {
			this.anIntArray546 = new int[this.anInt7712];
		}
		local19.anInt5769 = local193;
		local24.anInt5769 = local199;
		local29.anInt5769 = local106;
		local34.anInt5769 = local145;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(358) int local358;
		@Pc(360) int local360;
		for (@Pc(352) int local352 = 0; local352 < this.anInt7712; local352++) {
			local358 = local14.method4966();
			local360 = 0;
			if ((local358 & 0x1) != 0) {
				local360 = local19.method4997();
			}
			@Pc(373) int local373 = 0;
			if ((local358 & 0x2) != 0) {
				local373 = local24.method4997();
			}
			@Pc(383) int local383 = 0;
			if ((local358 & 0x4) != 0) {
				local383 = local29.method4997();
			}
			this.anIntArray550[local352] = local360 + local346;
			this.anIntArray548[local352] = local373 + local348;
			this.anIntArray542[local352] = local383 + local350;
			local348 = this.anIntArray548[local352];
			local350 = this.anIntArray542[local352];
			local346 = this.anIntArray550[local352];
			if (local81 == 1) {
				this.anIntArray546[local352] = local34.method4966();
			}
		}
		local14.anInt5769 = local175;
		local19.anInt5769 = local135;
		local24.anInt5769 = local115;
		local29.anInt5769 = local157;
		local34.anInt5769 = local125;
		for (local358 = 0; local358 < this.anInt7710; local358++) {
			this.aShortArray102[local358] = (short) local14.method4999();
			if (local61 == 1) {
				local360 = local19.method4966();
				if ((local360 & 0x1) == 1) {
					local7 = true;
					this.aByteArray88[local358] = 1;
				} else {
					this.aByteArray88[local358] = 0;
				}
				if ((local360 & 0x2) == 2) {
					this.aByteArray92[local358] = (byte) (local360 >> 2);
					this.aShortArray98[local358] = this.aShortArray102[local358];
					this.aShortArray102[local358] = 127;
					if (this.aShortArray98[local358] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray92[local358] = -1;
					this.aShortArray98[local358] = -1;
				}
			}
			if (local67 == 255) {
				this.aByteArray87[local358] = local24.method4972();
			}
			if (local73 == 1) {
				this.aByteArray93[local358] = local29.method4972();
			}
			if (local77 == 1) {
				this.anIntArray545[local358] = local34.method4966();
			}
		}
		local14.anInt5769 = local169;
		this.anInt7707 = -1;
		local19.anInt5769 = local108;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(622) int local622;
		for (@Pc(616) int local616 = 0; local616 < this.anInt7710; local616++) {
			local622 = local19.method4966();
			if (local622 == 1) {
				local608 = (short) (local14.method4997() + local614);
				local610 = (short) (local608 + local14.method4997());
				local612 = (short) (local14.method4997() + local610);
				local614 = local612;
				this.aShortArray104[local616] = local608;
				this.aShortArray105[local616] = local610;
				this.aShortArray99[local616] = local612;
				if (local608 > this.anInt7707) {
					this.anInt7707 = local608;
				}
				if (local610 > this.anInt7707) {
					this.anInt7707 = local610;
				}
				if (local612 > this.anInt7707) {
					this.anInt7707 = local612;
				}
			}
			if (local622 == 2) {
				local610 = local612;
				local612 = (short) (local614 + local14.method4997());
				local614 = local612;
				this.aShortArray104[local616] = local608;
				this.aShortArray105[local616] = local610;
				this.aShortArray99[local616] = local612;
				if (this.anInt7707 < local612) {
					this.anInt7707 = local612;
				}
			}
			if (local622 == 3) {
				local608 = local612;
				local612 = (short) (local14.method4997() + local614);
				this.aShortArray104[local616] = local608;
				local614 = local612;
				this.aShortArray105[local616] = local610;
				this.aShortArray99[local616] = local612;
				if (this.anInt7707 < local612) {
					this.anInt7707 = local612;
				}
			}
			if (local622 == 4) {
				@Pc(769) short local769 = local608;
				local608 = local610;
				local610 = local769;
				local612 = (short) (local14.method4997() + local614);
				local614 = local612;
				this.aShortArray104[local616] = local608;
				this.aShortArray105[local616] = local769;
				this.aShortArray99[local616] = local612;
				if (this.anInt7707 < local612) {
					this.anInt7707 = local612;
				}
			}
		}
		local14.anInt5769 = local184;
		this.anInt7707++;
		for (local622 = 0; local622 < this.anInt7702; local622++) {
			this.aByteArray91[local622] = 0;
			this.aShortArray100[local622] = (short) local14.method4999();
			this.aShortArray101[local622] = (short) local14.method4999();
			this.aShortArray97[local622] = (short) local14.method4999();
		}
		if (this.aByteArray92 != null) {
			@Pc(873) boolean local873 = false;
			for (@Pc(875) int local875 = 0; local875 < this.anInt7710; local875++) {
				@Pc(884) int local884 = this.aByteArray92[local875] & 0xFF;
				if (local884 != 255) {
					if (this.aShortArray104[local875] == (this.aShortArray100[local884] & 0xFFFF) && (this.aShortArray101[local884] & 0xFFFF) == this.aShortArray105[local875] && this.aShortArray99[local875] == (this.aShortArray97[local884] & 0xFFFF)) {
						this.aByteArray92[local875] = -1;
					} else {
						local873 = true;
					}
				}
			}
			if (!local873) {
				this.aByteArray92 = null;
			}
		}
		if (!local9) {
			this.aShortArray98 = null;
		}
		if (!local7) {
			this.aByteArray88 = null;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ISS)V")
	public void method6433(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray98 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt7710; local11++) {
			if (this.aShortArray98[local11] == arg1) {
				this.aShortArray98[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)[[I")
	public int[][] method6435() {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt7710; local18++) {
			@Pc(25) int local25 = this.anIntArray545[local18];
			if (local25 >= 0) {
				@Pc(34) int local34 = local14[local25]++;
				if (local16 < local25) {
					local16 = local25;
				}
			}
		}
		@Pc(60) int[][] local60 = new int[local16 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local16; local62++) {
			local60[local62] = new int[local14[local62]];
			local14[local62] = 0;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt7710; local85++) {
			@Pc(92) int local92 = this.anIntArray545[local85];
			if (local92 >= 0) {
				local60[local92][local14[local92]++] = local85;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BSSBSSSIBS)B")
	public byte method6436() {
		if (this.anInt7702 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray91[this.anInt7702] = 3;
		this.aShortArray100[this.anInt7702] = 0;
		this.aShortArray101[this.anInt7702] = 32767;
		this.aShortArray97[this.anInt7702] = 0;
		this.anIntArray544[this.anInt7702] = 1024;
		this.anIntArray543[this.anInt7702] = 1024;
		this.anIntArray551[this.anInt7702] = 1024;
		this.aByteArray90[this.anInt7702] = 0;
		this.aByteArray89[this.anInt7702] = 0;
		this.anIntArray547[this.anInt7702] = 0;
		return (byte) this.anInt7702++;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZI)[[I")
	public int[][] method6437(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt7712 : this.anInt7707;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(42) int local42 = this.anIntArray546[local20];
			if (local42 >= 0) {
				if (local10 < local42) {
					local10 = local42;
				}
				@Pc(57) int local57 = local8[local42]++;
			}
		}
		@Pc(73) int[][] local73 = new int[local10 + 1][];
		for (@Pc(75) int local75 = 0; local75 <= local10; local75++) {
			local73[local75] = new int[local8[local75]];
			local8[local75] = 0;
		}
		for (@Pc(94) int local94 = 0; local94 < local18; local94++) {
			@Pc(101) int local101 = this.anIntArray546[local94];
			if (local101 >= 0) {
				local73[local101][local8[local101]++] = local94;
			}
		}
		return local73;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)[[I")
	public int[][] method6438() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass346Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass346Array1[local12].anInt9615;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(31) int local31 = local8[local20]++;
			}
		}
		@Pc(45) int[][] local45 = new int[local10 + 1][];
		for (@Pc(47) int local47 = 0; local47 <= local10; local47++) {
			local45[local47] = new int[local8[local47]];
			local8[local47] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < this.aClass346Array1.length; local74++) {
			@Pc(82) int local82 = this.aClass346Array1[local74].anInt9615;
			if (local82 >= 0) {
				local45[local82][local8[local82]++] = local74;
			}
		}
		return local45;
	}
}
