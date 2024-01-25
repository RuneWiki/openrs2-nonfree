import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class192 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "[I")
	public int[] anIntArray519;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "[I")
	public int[] anIntArray520;

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "[Lclient!fi;")
	public Class78[] aClass78Array3;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "[I")
	public int[] anIntArray522;

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!pn", name = "A", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!pn", name = "B", descriptor = "[I")
	public int[] anIntArray523;

	@OriginalMember(owner = "client!pn", name = "C", descriptor = "[I")
	public int[] anIntArray524;

	@OriginalMember(owner = "client!pn", name = "E", descriptor = "[I")
	public int[] anIntArray525;

	@OriginalMember(owner = "client!pn", name = "G", descriptor = "[Lclient!kh;")
	public Class141[] aClass141Array3;

	@OriginalMember(owner = "client!pn", name = "J", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!pn", name = "K", descriptor = "[I")
	public int[] anIntArray526;

	@OriginalMember(owner = "client!pn", name = "M", descriptor = "[I")
	public int[] anIntArray527;

	@OriginalMember(owner = "client!pn", name = "N", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!pn", name = "O", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!pn", name = "P", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!pn", name = "Q", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!pn", name = "T", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!pn", name = "U", descriptor = "[I")
	public int[] anIntArray528;

	@OriginalMember(owner = "client!pn", name = "V", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!pn", name = "X", descriptor = "[Lclient!me;")
	public Class162[] aClass162Array1;

	@OriginalMember(owner = "client!pn", name = "ab", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!pn", name = "cb", descriptor = "[I")
	public int[] anIntArray529;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
	public int anInt5443 = 12;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
	public int anInt5445 = 0;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
	public int anInt5444 = 0;

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "B")
	public byte aByte64 = 0;

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "I")
	public int anInt5448 = 0;

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "I")
	public int anInt5453 = 0;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "([B)V")
	public Class192(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4332(arg0);
		} else {
			this.method4346(arg0);
		}
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(III)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray69 = new byte[arg1];
		this.aByteArray67 = new byte[arg1];
		this.aShortArray93 = new short[arg1];
		this.aShortArray96 = new short[arg1];
		this.anIntArray528 = new int[arg0];
		this.aByteArray63 = new byte[arg1];
		this.aByteArray66 = new byte[arg1];
		this.anIntArray519 = new int[arg0];
		this.anIntArray520 = new int[arg0];
		this.aShortArray94 = new short[arg1];
		this.anIntArray526 = new int[arg1];
		this.aShortArray97 = new short[arg1];
		this.aShortArray91 = new short[arg1];
		this.anIntArray527 = new int[arg0];
		if (arg2 > 0) {
			this.aShortArray92 = new short[arg2];
			this.anIntArray522 = new int[arg2];
			this.anIntArray521 = new int[arg2];
			this.aByteArray64 = new byte[arg2];
			this.anIntArray523 = new int[arg2];
			this.aByteArray65 = new byte[arg2];
			this.anIntArray524 = new int[arg2];
			this.aShortArray95 = new short[arg2];
			this.aShortArray89 = new short[arg2];
			this.aByteArray68 = new byte[arg2];
			this.anIntArray529 = new int[arg2];
			this.anIntArray525 = new int[arg2];
		}
	}

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "([Lclient!pn;I)V")
	public Class192(@OriginalArg(0) Class192[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5444 = 0;
		this.anInt5448 = 0;
		this.anInt5453 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte64 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class192 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5448 += local59.anInt5448;
				this.anInt5453 += local59.anInt5453;
				this.anInt5444 += local59.anInt5444;
				if (local59.aClass162Array1 != null) {
					local36 += local59.aClass162Array1.length;
				}
				if (local59.aClass78Array3 != null) {
					local32 += local59.aClass78Array3.length;
				}
				if (local59.aClass141Array3 != null) {
					local34 += local59.aClass141Array3.length;
				}
				local38 |= local59.aByteArray63 != null;
				if (local59.aByteArray66 == null) {
					if (this.aByte64 == -1) {
						this.aByte64 = local59.aByte64;
					}
					if (local59.aByte64 != this.aByte64) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray69 != null;
				local42 |= local59.aByteArray67 != null;
				local48 |= local59.anIntArray526 != null;
				local46 |= local59.aShortArray96 != null;
			}
		}
		this.anIntArray528 = new int[this.anInt5453];
		this.anIntArray520 = new int[this.anInt5453];
		if (local46) {
			this.aShortArray96 = new short[this.anInt5448];
		}
		this.aShortArray97 = new short[this.anInt5448];
		if (local44) {
			this.aByteArray69 = new byte[this.anInt5448];
		}
		if (local34 > 0) {
			this.aClass141Array3 = new Class141[local34];
		}
		if (local42) {
			this.aByteArray67 = new byte[this.anInt5448];
		}
		if (local38) {
			this.aByteArray63 = new byte[this.anInt5448];
		}
		this.aShortArray98 = new short[this.anInt5453];
		this.aShortArray90 = new short[this.anInt5448];
		this.anIntArray519 = new int[this.anInt5453];
		this.aShortArray91 = new short[this.anInt5448];
		if (local32 > 0) {
			this.aClass78Array3 = new Class78[local32];
		}
		if (local36 > 0) {
			this.aClass162Array1 = new Class162[local36];
		}
		if (local48) {
			this.anIntArray526 = new int[this.anInt5448];
		}
		this.aShortArray94 = new short[this.anInt5448];
		this.aShortArray93 = new short[this.anInt5448];
		this.anIntArray527 = new int[this.anInt5453];
		if (this.anInt5444 > 0) {
			this.aShortArray95 = new short[this.anInt5444];
			this.anIntArray523 = new int[this.anInt5444];
			this.anIntArray521 = new int[this.anInt5444];
			this.aShortArray92 = new short[this.anInt5444];
			this.aShortArray89 = new short[this.anInt5444];
			this.aByteArray65 = new byte[this.anInt5444];
			this.aByteArray64 = new byte[this.anInt5444];
			this.anIntArray525 = new int[this.anInt5444];
			this.aByteArray68 = new byte[this.anInt5444];
			this.anIntArray529 = new int[this.anInt5444];
			this.anIntArray522 = new int[this.anInt5444];
			this.anIntArray524 = new int[this.anInt5444];
		}
		if (local40) {
			this.aByteArray66 = new byte[this.anInt5448];
		}
		this.anInt5453 = 0;
		local34 = 0;
		local32 = 0;
		local36 = 0;
		this.anInt5444 = 0;
		this.anInt5448 = 0;
		@Pc(614) int local614;
		@Pc(625) int local625;
		for (@Pc(377) int local377 = 0; local377 < arg1; local377++) {
			@Pc(384) short local384 = (short) (0x1 << local377);
			@Pc(388) Class192 local388 = arg0[local377];
			if (local388 != null) {
				@Pc(395) int local395;
				if (local388.aClass162Array1 != null) {
					for (local395 = 0; local395 < local388.aClass162Array1.length; local395++) {
						@Pc(402) Class162 local402 = local388.aClass162Array1[local395];
						this.aClass162Array1[local36++] = local402.method3611(local402.anInt4484 + this.anInt5448);
					}
				}
				for (local395 = 0; local395 < local388.anInt5448; local395++) {
					if (local38 && local388.aByteArray63 != null) {
						this.aByteArray63[this.anInt5448] = local388.aByteArray63[local395];
					}
					if (local40) {
						if (local388.aByteArray66 == null) {
							this.aByteArray66[this.anInt5448] = local388.aByte64;
						} else {
							this.aByteArray66[this.anInt5448] = local388.aByteArray66[local395];
						}
					}
					if (local42 && local388.aByteArray67 != null) {
						this.aByteArray67[this.anInt5448] = local388.aByteArray67[local395];
					}
					if (local46) {
						if (local388.aShortArray96 == null) {
							this.aShortArray96[this.anInt5448] = -1;
						} else {
							this.aShortArray96[this.anInt5448] = local388.aShortArray96[local395];
						}
					}
					if (local48) {
						if (local388.anIntArray526 == null) {
							this.anIntArray526[this.anInt5448] = -1;
						} else {
							this.anIntArray526[this.anInt5448] = local388.anIntArray526[local395];
						}
					}
					this.aShortArray97[this.anInt5448] = (short) this.method4342(local388, local388.aShortArray97[local395], local384);
					this.aShortArray94[this.anInt5448] = (short) this.method4342(local388, local388.aShortArray94[local395], local384);
					this.aShortArray93[this.anInt5448] = (short) this.method4342(local388, local388.aShortArray93[local395], local384);
					this.aShortArray90[this.anInt5448] = local384;
					this.aShortArray91[this.anInt5448] = local388.aShortArray91[local395];
					this.anInt5448++;
				}
				@Pc(601) int local601;
				if (local388.aClass78Array3 != null) {
					for (local601 = 0; local601 < local388.aClass78Array3.length; local601++) {
						local614 = this.method4342(local388, local388.aClass78Array3[local601].anInt2278, local384);
						local625 = this.method4342(local388, local388.aClass78Array3[local601].anInt2275, local384);
						@Pc(636) int local636 = this.method4342(local388, local388.aClass78Array3[local601].anInt2271, local384);
						this.aClass78Array3[local32] = local388.aClass78Array3[local601].method1972(local614, local636, local625);
						local32++;
					}
				}
				if (local388.aClass141Array3 != null) {
					for (local601 = 0; local601 < local388.aClass141Array3.length; local601++) {
						local614 = this.method4342(local388, local388.aClass141Array3[local601].anInt4090, local384);
						this.aClass141Array3[local34] = local388.aClass141Array3[local601].method3253(local614);
						local34++;
					}
				}
			}
		}
		this.anInt5445 = this.anInt5453;
		@Pc(710) int local710 = 0;
		for (@Pc(712) int local712 = 0; local712 < arg1; local712++) {
			@Pc(719) short local719 = (short) (0x1 << local712);
			@Pc(723) Class192 local723 = arg0[local712];
			if (local723 != null) {
				for (local614 = 0; local614 < local723.anInt5448; local614++) {
					if (local44) {
						this.aByteArray69[local710++] = (byte) (local723.aByteArray69 == null || local723.aByteArray69[local614] == -1 ? -1 : this.anInt5444 + local723.aByteArray69[local614]);
					}
				}
				for (local625 = 0; local625 < local723.anInt5444; local625++) {
					@Pc(780) byte local780 = this.aByteArray68[this.anInt5444] = local723.aByteArray68[local625];
					if (local780 == 0) {
						this.aShortArray95[this.anInt5444] = (short) this.method4342(local723, local723.aShortArray95[local625], local719);
						this.aShortArray92[this.anInt5444] = (short) this.method4342(local723, local723.aShortArray92[local625], local719);
						this.aShortArray89[this.anInt5444] = (short) this.method4342(local723, local723.aShortArray89[local625], local719);
					}
					if (local780 >= 1 && local780 <= 3) {
						this.aShortArray95[this.anInt5444] = local723.aShortArray95[local625];
						this.aShortArray92[this.anInt5444] = local723.aShortArray92[local625];
						this.aShortArray89[this.anInt5444] = local723.aShortArray89[local625];
						this.anIntArray529[this.anInt5444] = local723.anIntArray529[local625];
						this.anIntArray524[this.anInt5444] = local723.anIntArray524[local625];
						this.anIntArray523[this.anInt5444] = local723.anIntArray523[local625];
						this.aByteArray64[this.anInt5444] = local723.aByteArray64[local625];
						this.aByteArray65[this.anInt5444] = local723.aByteArray65[local625];
						this.anIntArray525[this.anInt5444] = local723.anIntArray525[local625];
					}
					if (local780 == 2) {
						this.anIntArray522[this.anInt5444] = local723.anIntArray522[local625];
						this.anIntArray521[this.anInt5444] = local723.anIntArray521[local625];
					}
					this.anInt5444++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B[B)V")
	private void method4332(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class10_Sub8 local10 = new Class10_Sub8(arg0);
		@Pc(15) Class10_Sub8 local15 = new Class10_Sub8(arg0);
		@Pc(20) Class10_Sub8 local20 = new Class10_Sub8(arg0);
		@Pc(25) Class10_Sub8 local25 = new Class10_Sub8(arg0);
		@Pc(30) Class10_Sub8 local30 = new Class10_Sub8(arg0);
		@Pc(35) Class10_Sub8 local35 = new Class10_Sub8(arg0);
		@Pc(40) Class10_Sub8 local40 = new Class10_Sub8(arg0);
		local10.anInt2989 = arg0.length - 23;
		this.anInt5453 = local10.method2485();
		this.anInt5448 = local10.method2485();
		this.anInt5444 = local10.method2502();
		@Pc(65) int local65 = local10.method2502();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(83) boolean local83 = (local65 & 0x2) == 2;
		@Pc(100) boolean local100 = (local65 & 0x4) == 4;
		@Pc(109) boolean local109 = (local65 & 0x8) == 8;
		if (local109) {
			local10.anInt2989 -= 7;
			this.anInt5443 = local10.method2502();
			local10.anInt2989 += 6;
		}
		@Pc(132) int local132 = local10.method2502();
		@Pc(138) int local138 = local10.method2502();
		@Pc(142) int local142 = local10.method2502();
		@Pc(146) int local146 = local10.method2502();
		@Pc(150) int local150 = local10.method2502();
		@Pc(154) int local154 = local10.method2485();
		@Pc(158) int local158 = local10.method2485();
		@Pc(162) int local162 = local10.method2485();
		@Pc(166) int local166 = local10.method2485();
		@Pc(170) int local170 = local10.method2485();
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(189) int local189;
		if (this.anInt5444 > 0) {
			this.aByteArray68 = new byte[this.anInt5444];
			local10.anInt2989 = 0;
			for (local189 = 0; local189 < this.anInt5444; local189++) {
				@Pc(200) byte local200 = this.aByteArray68[local189] = local10.method2460();
				if (local200 == 0) {
					local172++;
				}
				if (local200 == 2) {
					local176++;
				}
				if (local200 >= 1 && local200 <= 3) {
					local174++;
				}
			}
		}
		local189 = this.anInt5444;
		@Pc(229) int local229 = local189;
		local189 += this.anInt5453;
		@Pc(236) int local236 = local189;
		if (local74) {
			local189 += this.anInt5448;
		}
		@Pc(245) int local245 = local189;
		local189 += this.anInt5448;
		@Pc(252) int local252 = local189;
		if (local132 == 255) {
			local189 += this.anInt5448;
		}
		@Pc(262) int local262 = local189;
		if (local142 == 1) {
			local189 += this.anInt5448;
		}
		@Pc(272) int local272 = local189;
		if (local150 == 1) {
			local189 += this.anInt5453;
		}
		@Pc(282) int local282 = local189;
		if (local138 == 1) {
			local189 += this.anInt5448;
		}
		@Pc(294) int local294 = local189;
		local189 += local166;
		@Pc(300) int local300 = local189;
		if (local146 == 1) {
			local189 += this.anInt5448 * 2;
		}
		@Pc(312) int local312 = local189;
		local189 += local170;
		@Pc(318) int local318 = local189;
		local189 += this.anInt5448 * 2;
		@Pc(327) int local327 = local189;
		local189 += local154;
		@Pc(333) int local333 = local189;
		local189 += local158;
		@Pc(339) int local339 = local189;
		local189 += local162;
		@Pc(345) int local345 = local189;
		local189 += local172 * 6;
		@Pc(353) int local353 = local189;
		local189 += local174 * 6;
		@Pc(367) int local367 = this.anInt5443 >= 14 ? 7 : 6;
		@Pc(369) int local369 = local189;
		local189 += local174 * local367;
		@Pc(377) int local377 = local189;
		local189 += local174;
		@Pc(383) int local383 = local189;
		local189 += local174;
		@Pc(389) int local389 = local189;
		local189 += local174 + local176 * 2;
		this.aShortArray97 = new short[this.anInt5448];
		if (local74) {
			this.aByteArray63 = new byte[this.anInt5448];
		}
		this.anIntArray520 = new int[this.anInt5453];
		this.aShortArray94 = new short[this.anInt5448];
		this.aShortArray91 = new short[this.anInt5448];
		if (this.anInt5444 > 0) {
			this.aShortArray89 = new short[this.anInt5444];
			this.aShortArray92 = new short[this.anInt5444];
			if (local176 > 0) {
				this.anIntArray522 = new int[local176];
				this.anIntArray521 = new int[local176];
			}
			if (local174 > 0) {
				this.aByteArray65 = new byte[local174];
				this.anIntArray524 = new int[local174];
				this.anIntArray525 = new int[local174];
				this.anIntArray523 = new int[local174];
				this.anIntArray529 = new int[local174];
				this.aByteArray64 = new byte[local174];
			}
			this.aShortArray95 = new short[this.anInt5444];
		}
		if (local146 == 1) {
			this.aShortArray96 = new short[this.anInt5448];
		}
		local10.anInt2989 = local229;
		if (local150 == 1) {
			this.anIntArray528 = new int[this.anInt5453];
		}
		this.anIntArray519 = new int[this.anInt5453];
		if (local146 == 1 && this.anInt5444 > 0) {
			this.aByteArray69 = new byte[this.anInt5448];
		}
		if (local138 == 1) {
			this.aByteArray67 = new byte[this.anInt5448];
		}
		if (local142 == 1) {
			this.anIntArray526 = new int[this.anInt5448];
		}
		if (local132 == 255) {
			this.aByteArray66 = new byte[this.anInt5448];
		} else {
			this.aByte64 = (byte) local132;
		}
		this.anIntArray527 = new int[this.anInt5453];
		this.aShortArray93 = new short[this.anInt5448];
		local15.anInt2989 = local327;
		local20.anInt2989 = local333;
		local25.anInt2989 = local339;
		local30.anInt2989 = local272;
		@Pc(576) int local576 = 0;
		@Pc(578) int local578 = 0;
		@Pc(580) int local580 = 0;
		@Pc(588) int local588;
		for (@Pc(582) int local582 = 0; local582 < this.anInt5453; local582++) {
			local588 = local10.method2502();
			@Pc(590) int local590 = 0;
			if ((local588 & 0x1) != 0) {
				local590 = local15.method2462();
			}
			@Pc(603) int local603 = 0;
			if ((local588 & 0x2) != 0) {
				local603 = local20.method2462();
			}
			@Pc(616) int local616 = 0;
			if ((local588 & 0x4) != 0) {
				local616 = local25.method2462();
			}
			this.anIntArray519[local582] = local576 + local590;
			this.anIntArray527[local582] = local578 + local603;
			this.anIntArray520[local582] = local616 + local580;
			local578 = this.anIntArray527[local582];
			local580 = this.anIntArray520[local582];
			local576 = this.anIntArray519[local582];
			if (local150 == 1) {
				this.anIntArray528[local582] = local30.method2502();
			}
		}
		local10.anInt2989 = local318;
		local15.anInt2989 = local236;
		local20.anInt2989 = local252;
		local25.anInt2989 = local282;
		local30.anInt2989 = local262;
		local35.anInt2989 = local300;
		local40.anInt2989 = local312;
		for (local588 = 0; local588 < this.anInt5448; local588++) {
			this.aShortArray91[local588] = (short) local10.method2485();
			if (local74) {
				this.aByteArray63[local588] = local15.method2460();
			}
			if (local132 == 255) {
				this.aByteArray66[local588] = local20.method2460();
			}
			if (local138 == 1) {
				this.aByteArray67[local588] = local25.method2460();
			}
			if (local142 == 1) {
				this.anIntArray526[local588] = local30.method2502();
			}
			if (local146 == 1) {
				this.aShortArray96[local588] = (short) (local35.method2485() - 1);
			}
			if (this.aByteArray69 != null) {
				if (this.aShortArray96[local588] == -1) {
					this.aByteArray69[local588] = -1;
				} else {
					this.aByteArray69[local588] = (byte) (local40.method2502() - 1);
				}
			}
		}
		this.anInt5445 = -1;
		local10.anInt2989 = local294;
		local15.anInt2989 = local245;
		@Pc(808) short local808 = 0;
		@Pc(810) short local810 = 0;
		@Pc(812) short local812 = 0;
		@Pc(814) short local814 = 0;
		@Pc(822) int local822;
		for (@Pc(816) int local816 = 0; local816 < this.anInt5448; local816++) {
			local822 = local15.method2502();
			if (local822 == 1) {
				local808 = (short) (local10.method2462() + local814);
				local810 = (short) (local808 + local10.method2462());
				local812 = (short) (local810 + local10.method2462());
				this.aShortArray97[local816] = local808;
				local814 = local812;
				this.aShortArray94[local816] = local810;
				this.aShortArray93[local816] = local812;
				if (this.anInt5445 < local808) {
					this.anInt5445 = local808;
				}
				if (this.anInt5445 < local810) {
					this.anInt5445 = local810;
				}
				if (local812 > this.anInt5445) {
					this.anInt5445 = local812;
				}
			}
			if (local822 == 2) {
				local810 = local812;
				local812 = (short) (local814 + local10.method2462());
				this.aShortArray97[local816] = local808;
				local814 = local812;
				this.aShortArray94[local816] = local810;
				this.aShortArray93[local816] = local812;
				if (this.anInt5445 < local812) {
					this.anInt5445 = local812;
				}
			}
			if (local822 == 3) {
				local808 = local812;
				local812 = (short) (local10.method2462() + local814);
				local814 = local812;
				this.aShortArray97[local816] = local808;
				this.aShortArray94[local816] = local810;
				this.aShortArray93[local816] = local812;
				if (local812 > this.anInt5445) {
					this.anInt5445 = local812;
				}
			}
			if (local822 == 4) {
				@Pc(987) short local987 = local808;
				local808 = local810;
				local812 = (short) (local814 + local10.method2462());
				local810 = local987;
				local814 = local812;
				this.aShortArray97[local816] = local808;
				this.aShortArray94[local816] = local987;
				this.aShortArray93[local816] = local812;
				if (local812 > this.anInt5445) {
					this.anInt5445 = local812;
				}
			}
		}
		local10.anInt2989 = local345;
		this.anInt5445++;
		local15.anInt2989 = local353;
		local20.anInt2989 = local369;
		local25.anInt2989 = local377;
		local30.anInt2989 = local383;
		local35.anInt2989 = local389;
		@Pc(1062) int local1062;
		for (local822 = 0; local822 < this.anInt5444; local822++) {
			local1062 = this.aByteArray68[local822] & 0xFF;
			if (local1062 == 0) {
				this.aShortArray95[local822] = (short) local10.method2485();
				this.aShortArray92[local822] = (short) local10.method2485();
				this.aShortArray89[local822] = (short) local10.method2485();
			}
			if (local1062 == 1) {
				this.aShortArray95[local822] = (short) local15.method2485();
				this.aShortArray92[local822] = (short) local15.method2485();
				this.aShortArray89[local822] = (short) local15.method2485();
				this.anIntArray529[local822] = local20.method2485();
				if (this.anInt5443 >= 14) {
					this.anIntArray524[local822] = local20.method2507();
				} else {
					this.anIntArray524[local822] = local20.method2485();
				}
				this.anIntArray523[local822] = local20.method2485();
				this.aByteArray64[local822] = local25.method2460();
				this.aByteArray65[local822] = local30.method2460();
				this.anIntArray525[local822] = local35.method2460();
			}
			if (local1062 == 2) {
				this.aShortArray95[local822] = (short) local15.method2485();
				this.aShortArray92[local822] = (short) local15.method2485();
				this.aShortArray89[local822] = (short) local15.method2485();
				this.anIntArray529[local822] = local20.method2485();
				if (this.anInt5443 >= 14) {
					this.anIntArray524[local822] = local20.method2507();
				} else {
					this.anIntArray524[local822] = local20.method2485();
				}
				this.anIntArray523[local822] = local20.method2485();
				this.aByteArray64[local822] = local25.method2460();
				this.aByteArray65[local822] = local30.method2460();
				this.anIntArray525[local822] = local35.method2460();
				this.anIntArray522[local822] = local35.method2460();
				this.anIntArray521[local822] = local35.method2460();
			}
			if (local1062 == 3) {
				this.aShortArray95[local822] = (short) local15.method2485();
				this.aShortArray92[local822] = (short) local15.method2485();
				this.aShortArray89[local822] = (short) local15.method2485();
				this.anIntArray529[local822] = local20.method2485();
				if (this.anInt5443 < 14) {
					this.anIntArray524[local822] = local20.method2485();
				} else {
					this.anIntArray524[local822] = local20.method2507();
				}
				this.anIntArray523[local822] = local20.method2485();
				this.aByteArray64[local822] = local25.method2460();
				this.aByteArray65[local822] = local30.method2460();
				this.anIntArray525[local822] = local35.method2460();
			}
		}
		local10.anInt2989 = local189;
		@Pc(1381) int local1381;
		@Pc(1387) int local1387;
		@Pc(1391) int local1391;
		@Pc(1460) int local1460;
		if (local83) {
			local1062 = local10.method2502();
			if (local1062 > 0) {
				this.aClass78Array3 = new Class78[local1062];
				for (local1381 = 0; local1381 < local1062; local1381++) {
					local1387 = local10.method2485();
					local1391 = local10.method2485();
					@Pc(1399) byte local1399;
					if (local132 == 255) {
						local1399 = this.aByteArray66[local1391];
					} else {
						local1399 = (byte) local132;
					}
					this.aClass78Array3[local1381] = new Class78(local1387, this.aShortArray97[local1391], this.aShortArray94[local1391], this.aShortArray93[local1391], local1399);
				}
			}
			local1381 = local10.method2502();
			if (local1381 > 0) {
				this.aClass141Array3 = new Class141[local1381];
				for (local1387 = 0; local1387 < local1381; local1387++) {
					local1391 = local10.method2485();
					local1460 = local10.method2485();
					this.aClass141Array3[local1387] = new Class141(local1391, local1460);
				}
			}
		}
		if (!local100) {
			return;
		}
		local1062 = local10.method2502();
		if (local1062 <= 0) {
			return;
		}
		this.aClass162Array1 = new Class162[local1062];
		for (local1381 = 0; local1381 < local1062; local1381++) {
			local1387 = local10.method2485();
			local1391 = local10.method2485();
			local1460 = local10.method2502();
			@Pc(1505) byte local1505 = local10.method2460();
			this.aClass162Array1[local1381] = new Class162(local1387, local1391, local1460, local1505);
		}
		return;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(SSSBBSBSSB)B")
	public byte method4333() {
		if (this.anInt5444 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray68[this.anInt5444] = 3;
		this.aShortArray95[this.anInt5444] = 0;
		this.aShortArray92[this.anInt5444] = 32767;
		this.aShortArray89[this.anInt5444] = 0;
		this.anIntArray529[this.anInt5444] = 1024;
		this.anIntArray524[this.anInt5444] = 1024;
		this.anIntArray523[this.anInt5444] = 1024;
		this.aByteArray64[this.anInt5444] = 0;
		this.aByteArray65[this.anInt5444] = 0;
		this.anIntArray525[this.anInt5444] = 0;
		return (byte) this.anInt5444++;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)[[I")
	public int[][] method4334() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass162Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass162Array1[local12].anInt4485;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(34) int local34 = local8[local20]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < this.aClass162Array1.length; local79++) {
			@Pc(87) int local87 = this.aClass162Array1[local79].anInt4485;
			if (local87 >= 0) {
				local52[local87][local8[local87]++] = local79;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)[[I")
	public int[][] method4335() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5445; local12++) {
			@Pc(19) int local19 = this.anIntArray528[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(30) int local30 = local8[local19]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local47[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt5445; local73++) {
			@Pc(80) int local80 = this.anIntArray528[local73];
			if (local80 >= 0) {
				local47[local80][local8[local80]++] = local73;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIB)V")
	public void method4337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(27) int local27;
		@Pc(46) int local46;
		if (arg1 != 0) {
			local21 = Class250.anIntArray675[arg1];
			local25 = Class250.anIntArray674[arg1];
			for (local27 = 0; local27 < this.anInt5453; local27++) {
				local46 = local21 * this.anIntArray527[local27] + this.anIntArray519[local27] * local25 >> 15;
				this.anIntArray527[local27] = this.anIntArray527[local27] * local25 - this.anIntArray519[local27] * local21 >> 15;
				this.anIntArray519[local27] = local46;
			}
		}
		if (arg2 != 0) {
			local21 = Class250.anIntArray675[arg2];
			local25 = Class250.anIntArray674[arg2];
			for (local27 = 0; local27 < this.anInt5453; local27++) {
				local46 = this.anIntArray527[local27] * local25 - local21 * this.anIntArray520[local27] >> 15;
				this.anIntArray520[local27] = local25 * this.anIntArray520[local27] + this.anIntArray527[local27] * local21 >> 15;
				this.anIntArray527[local27] = local46;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local21 = Class250.anIntArray675[arg0];
		local25 = Class250.anIntArray674[arg0];
		for (local27 = 0; local27 < this.anInt5453; local27++) {
			local46 = this.anIntArray519[local27] * local25 + this.anIntArray520[local27] * local21 >> 15;
			this.anIntArray520[local27] = this.anIntArray520[local27] * local25 - local21 * this.anIntArray519[local27] >> 15;
			this.anIntArray519[local27] = local46;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIBI)I")
	public int method4340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5453; local7++) {
			if (this.anIntArray519[local7] == arg0 && arg2 == this.anIntArray527[local7] && this.anIntArray520[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray519[this.anInt5453] = arg0;
		this.anIntArray527[this.anInt5453] = arg2;
		this.anIntArray520[this.anInt5453] = arg1;
		this.anInt5445 = this.anInt5453 + 1;
		return this.anInt5453++;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BSIBBBIIS)I")
	public int method4341(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) short arg7) {
		this.aShortArray97[this.anInt5448] = (short) arg6;
		this.aShortArray94[this.anInt5448] = (short) arg2;
		this.aShortArray93[this.anInt5448] = (short) arg5;
		this.aByteArray63[this.anInt5448] = arg4;
		this.aByteArray69[this.anInt5448] = arg0;
		this.aShortArray91[this.anInt5448] = arg7;
		this.aByteArray67[this.anInt5448] = arg3;
		this.aShortArray96[this.anInt5448] = arg1;
		return this.anInt5448++;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(Lclient!pn;IIS)I")
	private int method4342(@OriginalArg(0) Class192 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg0.anIntArray519[arg1];
		@Pc(15) int local15 = arg0.anIntArray527[arg1];
		@Pc(20) int local20 = arg0.anIntArray520[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5453; local22++) {
			if (this.anIntArray519[local22] == local10 && local15 == this.anIntArray527[local22] && this.anIntArray520[local22] == local20) {
				this.aShortArray98[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray519[this.anInt5453] = local10;
		this.anIntArray527[this.anInt5453] = local15;
		this.anIntArray520[this.anInt5453] = local20;
		this.aShortArray98[this.anInt5453] = arg2;
		this.anIntArray528[this.anInt5453] = arg0.anIntArray528 == null ? -1 : arg0.anIntArray528[arg1];
		return this.anInt5453++;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)[[I")
	public int[][] method4343() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anInt5448; local22++) {
			@Pc(29) int local29 = this.anIntArray526[local22];
			if (local29 >= 0) {
				@Pc(35) int local35 = local8[local29]++;
				if (local10 < local29) {
					local10 = local29;
				}
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.anInt5448; local82++) {
			@Pc(89) int local89 = this.anIntArray526[local82];
			if (local89 >= 0) {
				local57[local89][local8[local89]++] = local82;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIII)V")
	public void method4344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(22) int local22 = 0; local22 < this.anInt5453; local22++) {
			this.anIntArray519[local22] += arg2;
			this.anIntArray527[local22] += arg1;
			this.anIntArray520[local22] += arg0;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(SSI)V")
	public void method4345(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5448; local7++) {
			if (arg0 == this.aShortArray91[local7]) {
				this.aShortArray91[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(B[B)V")
	private void method4346(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class10_Sub8 local14 = new Class10_Sub8(arg0);
		@Pc(19) Class10_Sub8 local19 = new Class10_Sub8(arg0);
		@Pc(24) Class10_Sub8 local24 = new Class10_Sub8(arg0);
		@Pc(29) Class10_Sub8 local29 = new Class10_Sub8(arg0);
		@Pc(34) Class10_Sub8 local34 = new Class10_Sub8(arg0);
		local14.anInt2989 = arg0.length - 18;
		this.anInt5453 = local14.method2485();
		this.anInt5448 = local14.method2485();
		this.anInt5444 = local14.method2502();
		@Pc(59) int local59 = local14.method2502();
		@Pc(63) int local63 = local14.method2502();
		@Pc(67) int local67 = local14.method2502();
		@Pc(71) int local71 = local14.method2502();
		@Pc(75) int local75 = local14.method2502();
		@Pc(79) int local79 = local14.method2485();
		@Pc(83) int local83 = local14.method2485();
		@Pc(87) int local87 = local14.method2485();
		@Pc(91) int local91 = local14.method2485();
		@Pc(100) int local100 = this.anInt5453;
		@Pc(102) int local102 = local100;
		local100 += this.anInt5448;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt5448;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt5448;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt5448;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt5453;
		}
		@Pc(155) int local155 = local100;
		if (local67 == 1) {
			local100 += this.anInt5448;
		}
		@Pc(167) int local167 = local100;
		local100 += local91;
		@Pc(173) int local173 = local100;
		local100 += this.anInt5448 * 2;
		@Pc(182) int local182 = local100;
		local100 += this.anInt5444 * 6;
		@Pc(191) int local191 = local100;
		local100 += local79;
		@Pc(197) int local197 = local100;
		local100 += local83;
		local14.anInt2989 = 0;
		this.aShortArray94 = new short[this.anInt5448];
		if (local71 == 1) {
			this.anIntArray526 = new int[this.anInt5448];
		}
		if (local59 == 1) {
			this.aShortArray96 = new short[this.anInt5448];
			this.aByteArray63 = new byte[this.anInt5448];
			this.aByteArray69 = new byte[this.anInt5448];
		}
		if (local63 == 255) {
			this.aByteArray66 = new byte[this.anInt5448];
		} else {
			this.aByte64 = (byte) local63;
		}
		this.anIntArray520 = new int[this.anInt5453];
		if (this.anInt5444 > 0) {
			this.aShortArray92 = new short[this.anInt5444];
			this.aShortArray89 = new short[this.anInt5444];
			this.aByteArray68 = new byte[this.anInt5444];
			this.aShortArray95 = new short[this.anInt5444];
		}
		this.aShortArray93 = new short[this.anInt5448];
		this.aShortArray91 = new short[this.anInt5448];
		if (local67 == 1) {
			this.aByteArray67 = new byte[this.anInt5448];
		}
		this.anIntArray527 = new int[this.anInt5453];
		this.aShortArray97 = new short[this.anInt5448];
		this.anIntArray519 = new int[this.anInt5453];
		if (local75 == 1) {
			this.anIntArray528 = new int[this.anInt5453];
		}
		local19.anInt2989 = local191;
		local24.anInt2989 = local197;
		local29.anInt2989 = local100;
		local34.anInt2989 = local143;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(356) int local356;
		@Pc(358) int local358;
		for (@Pc(350) int local350 = 0; local350 < this.anInt5453; local350++) {
			local356 = local14.method2502();
			local358 = 0;
			if ((local356 & 0x1) != 0) {
				local358 = local19.method2462();
			}
			@Pc(371) int local371 = 0;
			if ((local356 & 0x2) != 0) {
				local371 = local24.method2462();
			}
			@Pc(384) int local384 = 0;
			if ((local356 & 0x4) != 0) {
				local384 = local29.method2462();
			}
			this.anIntArray519[local350] = local344 + local358;
			this.anIntArray527[local350] = local371 + local346;
			this.anIntArray520[local350] = local384 + local348;
			local346 = this.anIntArray527[local350];
			local344 = this.anIntArray519[local350];
			local348 = this.anIntArray520[local350];
			if (local75 == 1) {
				this.anIntArray528[local350] = local34.method2502();
			}
		}
		local14.anInt2989 = local173;
		local19.anInt2989 = local131;
		local24.anInt2989 = local109;
		local29.anInt2989 = local155;
		local34.anInt2989 = local121;
		for (local356 = 0; local356 < this.anInt5448; local356++) {
			this.aShortArray91[local356] = (short) local14.method2485();
			if (local59 == 1) {
				local358 = local19.method2502();
				if ((local358 & 0x1) == 1) {
					this.aByteArray63[local356] = 1;
					local7 = true;
				} else {
					this.aByteArray63[local356] = 0;
				}
				if ((local358 & 0x2) == 2) {
					this.aByteArray69[local356] = (byte) (local358 >> 2);
					this.aShortArray96[local356] = this.aShortArray91[local356];
					this.aShortArray91[local356] = 127;
					if (this.aShortArray96[local356] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray69[local356] = -1;
					this.aShortArray96[local356] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray66[local356] = local24.method2460();
			}
			if (local67 == 1) {
				this.aByteArray67[local356] = local29.method2460();
			}
			if (local71 == 1) {
				this.anIntArray526[local356] = local34.method2502();
			}
		}
		local14.anInt2989 = local167;
		this.anInt5445 = -1;
		local19.anInt2989 = local102;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(619) short local619 = 0;
		@Pc(627) int local627;
		for (@Pc(621) int local621 = 0; local621 < this.anInt5448; local621++) {
			local627 = local19.method2502();
			if (local627 == 1) {
				local607 = (short) (local14.method2462() + local619);
				local609 = (short) (local14.method2462() + local607);
				local611 = (short) (local609 + local14.method2462());
				local619 = local611;
				this.aShortArray97[local621] = local607;
				this.aShortArray94[local621] = local609;
				this.aShortArray93[local621] = local611;
				if (this.anInt5445 < local607) {
					this.anInt5445 = local607;
				}
				if (this.anInt5445 < local609) {
					this.anInt5445 = local609;
				}
				if (this.anInt5445 < local611) {
					this.anInt5445 = local611;
				}
			}
			if (local627 == 2) {
				local609 = local611;
				local611 = (short) (local14.method2462() + local619);
				this.aShortArray97[local621] = local607;
				local619 = local611;
				this.aShortArray94[local621] = local609;
				this.aShortArray93[local621] = local611;
				if (local611 > this.anInt5445) {
					this.anInt5445 = local611;
				}
			}
			if (local627 == 3) {
				local607 = local611;
				local611 = (short) (local14.method2462() + local619);
				this.aShortArray97[local621] = local607;
				local619 = local611;
				this.aShortArray94[local621] = local609;
				this.aShortArray93[local621] = local611;
				if (this.anInt5445 < local611) {
					this.anInt5445 = local611;
				}
			}
			if (local627 == 4) {
				@Pc(780) short local780 = local607;
				local607 = local609;
				local611 = (short) (local14.method2462() + local619);
				local609 = local780;
				local619 = local611;
				this.aShortArray97[local621] = local607;
				this.aShortArray94[local621] = local780;
				this.aShortArray93[local621] = local611;
				if (local611 > this.anInt5445) {
					this.anInt5445 = local611;
				}
			}
		}
		this.anInt5445++;
		local14.anInt2989 = local182;
		for (local627 = 0; local627 < this.anInt5444; local627++) {
			this.aByteArray68[local627] = 0;
			this.aShortArray95[local627] = (short) local14.method2485();
			this.aShortArray92[local627] = (short) local14.method2485();
			this.aShortArray89[local627] = (short) local14.method2485();
		}
		if (this.aByteArray69 != null) {
			@Pc(884) boolean local884 = false;
			for (@Pc(886) int local886 = 0; local886 < this.anInt5448; local886++) {
				@Pc(895) int local895 = this.aByteArray69[local886] & 0xFF;
				if (local895 != 255) {
					if (this.aShortArray97[local886] == (this.aShortArray95[local895] & 0xFFFF) && this.aShortArray94[local886] == (this.aShortArray92[local895] & 0xFFFF) && this.aShortArray93[local886] == (this.aShortArray89[local895] & 0xFFFF)) {
						this.aByteArray69[local886] = -1;
					} else {
						local884 = true;
					}
				}
			}
			if (!local884) {
				this.aByteArray69 = null;
			}
		}
		if (!local7) {
			this.aByteArray63 = null;
		}
		if (!local9) {
			this.aShortArray96 = null;
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BI)V")
	public void method4347() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5453; local7++) {
			this.anIntArray519[local7] <<= 0x0;
			this.anIntArray527[local7] <<= 0x0;
			this.anIntArray520[local7] <<= 0x0;
		}
		if (this.anInt5444 <= 0 || this.anIntArray529 == null) {
			return;
		}
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray529.length; local54++) {
			this.anIntArray529[local54] <<= 0x0;
			this.anIntArray524[local54] <<= 0x0;
			if (this.aByteArray68[local54] != 1) {
				this.anIntArray523[local54] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(SSB)V")
	public void method4348(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray96 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt5448; local11++) {
			if (this.aShortArray96[local11] == arg0) {
				this.aShortArray96[local11] = arg1;
			}
		}
	}
}
