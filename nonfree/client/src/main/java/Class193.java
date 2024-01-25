import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class193 {

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "[I")
	public int[] anIntArray357;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "[I")
	public int[] anIntArray358;

	@OriginalMember(owner = "client!pq", name = "l", descriptor = "[Lclient!su;")
	public Class229[] aClass229Array3;

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "[I")
	public int[] anIntArray359;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "[I")
	public int[] anIntArray360;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "[I")
	public int[] anIntArray361;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "[I")
	public int[] anIntArray362;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!pq", name = "D", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!pq", name = "E", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!pq", name = "G", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!pq", name = "K", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!pq", name = "L", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!pq", name = "O", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!pq", name = "P", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!pq", name = "Q", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!pq", name = "R", descriptor = "[I")
	public int[] anIntArray364;

	@OriginalMember(owner = "client!pq", name = "T", descriptor = "[Lclient!op;")
	public Class181[] aClass181Array3;

	@OriginalMember(owner = "client!pq", name = "U", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!pq", name = "V", descriptor = "[I")
	public int[] anIntArray365;

	@OriginalMember(owner = "client!pq", name = "X", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!pq", name = "Y", descriptor = "[Lclient!nl;")
	public Class167[] aClass167Array1;

	@OriginalMember(owner = "client!pq", name = "ab", descriptor = "[I")
	public int[] anIntArray366;

	@OriginalMember(owner = "client!pq", name = "bb", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
	public int anInt5435 = 0;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
	public int anInt5437 = 0;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
	public int anInt5431 = 12;

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "B")
	public byte aByte93 = 0;

	@OriginalMember(owner = "client!pq", name = "N", descriptor = "I")
	public int anInt5447 = 0;

	@OriginalMember(owner = "client!pq", name = "W", descriptor = "I")
	public int anInt5449 = 0;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "([B)V")
	public Class193(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4255(arg0);
		} else {
			this.method4259(arg0);
		}
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(III)V")
	public Class193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 0) {
			this.aByteArray63 = new byte[arg2];
			this.aByteArray67 = new byte[arg2];
			this.aShortArray88 = new short[arg2];
			this.aShortArray92 = new short[arg2];
			this.anIntArray367 = new int[arg2];
			this.anIntArray360 = new int[arg2];
			this.aShortArray87 = new short[arg2];
			this.anIntArray362 = new int[arg2];
			this.aByteArray64 = new byte[arg2];
			this.anIntArray358 = new int[arg2];
			this.anIntArray357 = new int[arg2];
			this.anIntArray364 = new int[arg2];
		}
		this.anIntArray361 = new int[arg0];
		this.anIntArray359 = new int[arg1];
		this.aShortArray91 = new short[arg1];
		this.aByteArray65 = new byte[arg1];
		this.aShortArray93 = new short[arg1];
		this.aByteArray68 = new byte[arg1];
		this.aByteArray66 = new byte[arg1];
		this.anIntArray365 = new int[arg0];
		this.anIntArray366 = new int[arg0];
		this.aShortArray94 = new short[arg1];
		this.anIntArray363 = new int[arg0];
		this.aShortArray96 = new short[arg1];
		this.aByteArray69 = new byte[arg1];
		this.aShortArray89 = new short[arg1];
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "([Lclient!pq;I)V")
	public Class193(@OriginalArg(0) Class193[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5447 = 0;
		this.anInt5437 = 0;
		this.anInt5449 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte93 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class193 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5449 += local59.anInt5449;
				this.anInt5447 += local59.anInt5447;
				this.anInt5437 += local59.anInt5437;
				if (local59.aClass167Array1 != null) {
					local36 += local59.aClass167Array1.length;
				}
				if (local59.aClass181Array3 != null) {
					local34 += local59.aClass181Array3.length;
				}
				if (local59.aClass229Array3 != null) {
					local32 += local59.aClass229Array3.length;
				}
				local38 |= local59.aByteArray65 != null;
				local46 |= local59.aShortArray89 != null;
				local51 |= local59.anIntArray359 != null;
				if (local59.aByteArray66 == null) {
					if (this.aByte93 == -1) {
						this.aByte93 = local59.aByte93;
					}
					if (this.aByte93 != local59.aByte93) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray69 != null;
				local44 |= local59.aByteArray68 != null;
			}
		}
		this.aShortArray94 = new short[this.anInt5437];
		if (local44) {
			this.aByteArray68 = new byte[this.anInt5437];
		}
		if (local32 > 0) {
			this.aClass229Array3 = new Class229[local32];
		}
		if (this.anInt5449 > 0) {
			this.anIntArray360 = new int[this.anInt5449];
			this.anIntArray364 = new int[this.anInt5449];
			this.aByteArray63 = new byte[this.anInt5449];
			this.aShortArray88 = new short[this.anInt5449];
			this.aShortArray92 = new short[this.anInt5449];
			this.anIntArray362 = new int[this.anInt5449];
			this.anIntArray367 = new int[this.anInt5449];
			this.anIntArray358 = new int[this.anInt5449];
			this.aByteArray67 = new byte[this.anInt5449];
			this.anIntArray357 = new int[this.anInt5449];
			this.aShortArray87 = new short[this.anInt5449];
			this.aByteArray64 = new byte[this.anInt5449];
		}
		this.anIntArray363 = new int[this.anInt5447];
		if (local36 > 0) {
			this.aClass167Array1 = new Class167[local36];
		}
		if (local42) {
			this.aByteArray69 = new byte[this.anInt5437];
		}
		this.aShortArray91 = new short[this.anInt5437];
		if (local38) {
			this.aByteArray65 = new byte[this.anInt5437];
		}
		this.aShortArray96 = new short[this.anInt5437];
		this.aShortArray93 = new short[this.anInt5437];
		if (local34 > 0) {
			this.aClass181Array3 = new Class181[local34];
		}
		this.anIntArray361 = new int[this.anInt5447];
		this.anIntArray365 = new int[this.anInt5447];
		if (local46) {
			this.aShortArray89 = new short[this.anInt5437];
		}
		this.aShortArray90 = new short[this.anInt5447];
		if (local40) {
			this.aByteArray66 = new byte[this.anInt5437];
		}
		if (local51) {
			this.anIntArray359 = new int[this.anInt5437];
		}
		this.anIntArray366 = new int[this.anInt5447];
		this.aShortArray95 = new short[this.anInt5437];
		local34 = 0;
		this.anInt5437 = 0;
		local36 = 0;
		this.anInt5447 = 0;
		local32 = 0;
		this.anInt5449 = 0;
		@Pc(623) int local623;
		@Pc(634) int local634;
		for (@Pc(391) int local391 = 0; local391 < arg1; local391++) {
			@Pc(398) short local398 = (short) (0x1 << local391);
			@Pc(402) Class193 local402 = arg0[local391];
			if (local402 != null) {
				@Pc(409) int local409;
				if (local402.aClass167Array1 != null) {
					for (local409 = 0; local409 < local402.aClass167Array1.length; local409++) {
						@Pc(416) Class167 local416 = local402.aClass167Array1[local409];
						this.aClass167Array1[local36++] = local416.method3802(local416.anInt4862 + this.anInt5437);
					}
				}
				for (local409 = 0; local409 < local402.anInt5437; local409++) {
					if (local38 && local402.aByteArray65 != null) {
						this.aByteArray65[this.anInt5437] = local402.aByteArray65[local409];
					}
					if (local40) {
						if (local402.aByteArray66 == null) {
							this.aByteArray66[this.anInt5437] = local402.aByte93;
						} else {
							this.aByteArray66[this.anInt5437] = local402.aByteArray66[local409];
						}
					}
					if (local42 && local402.aByteArray69 != null) {
						this.aByteArray69[this.anInt5437] = local402.aByteArray69[local409];
					}
					if (local46) {
						if (local402.aShortArray89 == null) {
							this.aShortArray89[this.anInt5437] = -1;
						} else {
							this.aShortArray89[this.anInt5437] = local402.aShortArray89[local409];
						}
					}
					if (local51) {
						if (local402.anIntArray359 == null) {
							this.anIntArray359[this.anInt5437] = -1;
						} else {
							this.anIntArray359[this.anInt5437] = local402.anIntArray359[local409];
						}
					}
					this.aShortArray93[this.anInt5437] = (short) this.method4258(local398, local402, local402.aShortArray93[local409]);
					this.aShortArray96[this.anInt5437] = (short) this.method4258(local398, local402, local402.aShortArray96[local409]);
					this.aShortArray94[this.anInt5437] = (short) this.method4258(local398, local402, local402.aShortArray94[local409]);
					this.aShortArray95[this.anInt5437] = local398;
					this.aShortArray91[this.anInt5437] = local402.aShortArray91[local409];
					this.anInt5437++;
				}
				@Pc(610) int local610;
				if (local402.aClass229Array3 != null) {
					for (local610 = 0; local610 < local402.aClass229Array3.length; local610++) {
						local623 = this.method4258(local398, local402, local402.aClass229Array3[local610].anInt6353);
						local634 = this.method4258(local398, local402, local402.aClass229Array3[local610].anInt6352);
						@Pc(645) int local645 = this.method4258(local398, local402, local402.aClass229Array3[local610].anInt6347);
						this.aClass229Array3[local32] = local402.aClass229Array3[local610].method4987(local645, local634, local623);
						local32++;
					}
				}
				if (local402.aClass181Array3 != null) {
					for (local610 = 0; local610 < local402.aClass181Array3.length; local610++) {
						local623 = this.method4258(local398, local402, local402.aClass181Array3[local610].anInt5139);
						this.aClass181Array3[local34] = local402.aClass181Array3[local610].method4024(local623);
						local34++;
					}
				}
			}
		}
		this.anInt5435 = this.anInt5447;
		@Pc(715) int local715 = 0;
		for (@Pc(717) int local717 = 0; local717 < arg1; local717++) {
			@Pc(724) short local724 = (short) (0x1 << local717);
			@Pc(728) Class193 local728 = arg0[local717];
			if (local728 != null) {
				for (local623 = 0; local623 < local728.anInt5437; local623++) {
					if (local44) {
						this.aByteArray68[local715++] = (byte) (local728.aByteArray68 == null || local728.aByteArray68[local623] == -1 ? -1 : this.anInt5449 + local728.aByteArray68[local623]);
					}
				}
				for (local634 = 0; local634 < local728.anInt5449; local634++) {
					@Pc(780) byte local780 = this.aByteArray67[this.anInt5449] = local728.aByteArray67[local634];
					if (local780 == 0) {
						this.aShortArray88[this.anInt5449] = (short) this.method4258(local724, local728, local728.aShortArray88[local634]);
						this.aShortArray92[this.anInt5449] = (short) this.method4258(local724, local728, local728.aShortArray92[local634]);
						this.aShortArray87[this.anInt5449] = (short) this.method4258(local724, local728, local728.aShortArray87[local634]);
					}
					if (local780 >= 1 && local780 <= 3) {
						this.aShortArray88[this.anInt5449] = local728.aShortArray88[local634];
						this.aShortArray92[this.anInt5449] = local728.aShortArray92[local634];
						this.aShortArray87[this.anInt5449] = local728.aShortArray87[local634];
						this.anIntArray362[this.anInt5449] = local728.anIntArray362[local634];
						this.anIntArray367[this.anInt5449] = local728.anIntArray367[local634];
						this.anIntArray364[this.anInt5449] = local728.anIntArray364[local634];
						this.aByteArray63[this.anInt5449] = local728.aByteArray63[local634];
						this.aByteArray64[this.anInt5449] = local728.aByteArray64[local634];
						this.anIntArray357[this.anInt5449] = local728.anIntArray357[local634];
					}
					if (local780 == 2) {
						this.anIntArray360[this.anInt5449] = local728.anIntArray360[local634];
						this.anIntArray358[this.anInt5449] = local728.anIntArray358[local634];
					}
					this.anInt5449++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBISBIBSI)I")
	public int method4252(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) short arg7) {
		this.aShortArray93[this.anInt5437] = (short) arg0;
		this.aShortArray96[this.anInt5437] = (short) arg2;
		this.aShortArray94[this.anInt5437] = (short) arg5;
		this.aByteArray65[this.anInt5437] = arg4;
		this.aByteArray68[this.anInt5437] = arg1;
		this.aShortArray91[this.anInt5437] = arg3;
		this.aByteArray69[this.anInt5437] = arg6;
		this.aShortArray89[this.anInt5437] = arg7;
		return this.anInt5437++;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IZII)V")
	public void method4253(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(35) int local35;
		if (arg2 != 0) {
			local11 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg2];
			local15 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg2];
			for (local17 = 0; local17 < this.anInt5447; local17++) {
				local35 = local15 * this.anIntArray365[local17] + this.anIntArray363[local17] * local11 >> 15;
				this.anIntArray363[local17] = local15 * this.anIntArray363[local17] - local11 * this.anIntArray365[local17] >> 15;
				this.anIntArray365[local17] = local35;
			}
		}
		if (arg0 != 0) {
			local11 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg0];
			local15 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg0];
			for (local17 = 0; local17 < this.anInt5447; local17++) {
				local35 = this.anIntArray363[local17] * local15 - local11 * this.anIntArray361[local17] >> 15;
				this.anIntArray361[local17] = this.anIntArray363[local17] * local11 + this.anIntArray361[local17] * local15 >> 15;
				this.anIntArray363[local17] = local35;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local11 = Class1_Sub4_Sub8_Sub1.anIntArray50[arg1];
		local15 = Class1_Sub4_Sub8_Sub1.anIntArray49[arg1];
		for (local17 = 0; local17 < this.anInt5447; local17++) {
			local35 = local15 * this.anIntArray365[local17] + this.anIntArray361[local17] * local11 >> 15;
			this.anIntArray361[local17] = local15 * this.anIntArray361[local17] - local11 * this.anIntArray365[local17] >> 15;
			this.anIntArray365[local17] = local35;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)V")
	public void method4254() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5447; local7++) {
			this.anIntArray365[local7] <<= 0x0;
			this.anIntArray363[local7] <<= 0x0;
			this.anIntArray361[local7] <<= 0x0;
		}
		if (this.anInt5449 <= 0 || this.anIntArray362 == null) {
			return;
		}
		for (@Pc(50) int local50 = 0; local50 < this.anIntArray362.length; local50++) {
			this.anIntArray362[local50] <<= 0x0;
			this.anIntArray367[local50] <<= 0x0;
			if (this.aByteArray67[local50] != 1) {
				this.anIntArray364[local50] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([BI)V")
	private void method4255(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub28 local10 = new Class1_Sub28(arg0);
		@Pc(15) Class1_Sub28 local15 = new Class1_Sub28(arg0);
		@Pc(20) Class1_Sub28 local20 = new Class1_Sub28(arg0);
		@Pc(25) Class1_Sub28 local25 = new Class1_Sub28(arg0);
		@Pc(30) Class1_Sub28 local30 = new Class1_Sub28(arg0);
		@Pc(35) Class1_Sub28 local35 = new Class1_Sub28(arg0);
		@Pc(40) Class1_Sub28 local40 = new Class1_Sub28(arg0);
		local10.anInt6812 = arg0.length - 23;
		this.anInt5447 = local10.method5335();
		this.anInt5437 = local10.method5335();
		this.anInt5449 = local10.method5337();
		@Pc(65) int local65 = local10.method5337();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt6812 -= 7;
			this.anInt5431 = local10.method5337();
			local10.anInt6812 += 6;
		}
		@Pc(128) int local128 = local10.method5337();
		@Pc(132) int local132 = local10.method5337();
		@Pc(136) int local136 = local10.method5337();
		@Pc(140) int local140 = local10.method5337();
		@Pc(144) int local144 = local10.method5337();
		@Pc(150) int local150 = local10.method5335();
		@Pc(154) int local154 = local10.method5335();
		@Pc(158) int local158 = local10.method5335();
		@Pc(164) int local164 = local10.method5335();
		@Pc(170) int local170 = local10.method5335();
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(189) int local189;
		if (this.anInt5449 > 0) {
			local10.anInt6812 = 0;
			this.aByteArray67 = new byte[this.anInt5449];
			for (local189 = 0; local189 < this.anInt5449; local189++) {
				@Pc(200) byte local200 = this.aByteArray67[local189] = local10.method5367();
				if (local200 == 0) {
					local172++;
				}
				if (local200 >= 1 && local200 <= 3) {
					local174++;
				}
				if (local200 == 2) {
					local176++;
				}
			}
		}
		local189 = this.anInt5449;
		@Pc(228) int local228 = local189;
		local189 += this.anInt5447;
		@Pc(235) int local235 = local189;
		if (local74) {
			local189 += this.anInt5437;
		}
		@Pc(244) int local244 = local189;
		local189 += this.anInt5437;
		@Pc(251) int local251 = local189;
		if (local128 == 255) {
			local189 += this.anInt5437;
		}
		@Pc(261) int local261 = local189;
		if (local136 == 1) {
			local189 += this.anInt5437;
		}
		@Pc(273) int local273 = local189;
		if (local144 == 1) {
			local189 += this.anInt5447;
		}
		@Pc(285) int local285 = local189;
		if (local132 == 1) {
			local189 += this.anInt5437;
		}
		@Pc(295) int local295 = local189;
		local189 += local164;
		@Pc(301) int local301 = local189;
		if (local140 == 1) {
			local189 += this.anInt5437 * 2;
		}
		@Pc(313) int local313 = local189;
		local189 += local170;
		@Pc(319) int local319 = local189;
		local189 += this.anInt5437 * 2;
		@Pc(328) int local328 = local189;
		local189 += local150;
		@Pc(334) int local334 = local189;
		local189 += local154;
		@Pc(340) int local340 = local189;
		local189 += local158;
		@Pc(346) int local346 = local189;
		local189 += local172 * 6;
		@Pc(354) int local354 = local189;
		local189 += local174 * 6;
		@Pc(368) int local368 = this.anInt5431 >= 14 ? 7 : 6;
		@Pc(370) int local370 = local189;
		local189 += local368 * local174;
		@Pc(378) int local378 = local189;
		local189 += local174;
		@Pc(384) int local384 = local189;
		local189 += local174;
		@Pc(390) int local390 = local189;
		local189 += local174 + local176 * 2;
		if (local132 == 1) {
			this.aByteArray69 = new byte[this.anInt5437];
		}
		if (local128 == 255) {
			this.aByteArray66 = new byte[this.anInt5437];
		} else {
			this.aByte93 = (byte) local128;
		}
		if (local74) {
			this.aByteArray65 = new byte[this.anInt5437];
		}
		if (this.anInt5449 > 0) {
			this.aShortArray92 = new short[this.anInt5449];
			if (local174 > 0) {
				this.anIntArray364 = new int[local174];
				this.aByteArray63 = new byte[local174];
				this.anIntArray362 = new int[local174];
				this.anIntArray357 = new int[local174];
				this.aByteArray64 = new byte[local174];
				this.anIntArray367 = new int[local174];
			}
			this.aShortArray87 = new short[this.anInt5449];
			this.aShortArray88 = new short[this.anInt5449];
			if (local176 > 0) {
				this.anIntArray358 = new int[local176];
				this.anIntArray360 = new int[local176];
			}
		}
		if (local140 == 1 && this.anInt5449 > 0) {
			this.aByteArray68 = new byte[this.anInt5437];
		}
		this.anIntArray363 = new int[this.anInt5447];
		local10.anInt6812 = local228;
		this.anIntArray361 = new int[this.anInt5447];
		this.anIntArray365 = new int[this.anInt5447];
		this.aShortArray94 = new short[this.anInt5437];
		this.aShortArray96 = new short[this.anInt5437];
		if (local144 == 1) {
			this.anIntArray366 = new int[this.anInt5447];
		}
		this.aShortArray93 = new short[this.anInt5437];
		this.aShortArray91 = new short[this.anInt5437];
		if (local136 == 1) {
			this.anIntArray359 = new int[this.anInt5437];
		}
		if (local140 == 1) {
			this.aShortArray89 = new short[this.anInt5437];
		}
		local15.anInt6812 = local328;
		local20.anInt6812 = local334;
		local25.anInt6812 = local340;
		local30.anInt6812 = local273;
		@Pc(578) int local578 = 0;
		@Pc(580) int local580 = 0;
		@Pc(582) int local582 = 0;
		@Pc(590) int local590;
		for (@Pc(584) int local584 = 0; local584 < this.anInt5447; local584++) {
			local590 = local10.method5337();
			@Pc(592) int local592 = 0;
			if ((local590 & 0x1) != 0) {
				local592 = local15.method5338();
			}
			@Pc(602) int local602 = 0;
			if ((local590 & 0x2) != 0) {
				local602 = local20.method5338();
			}
			@Pc(617) int local617 = 0;
			if ((local590 & 0x4) != 0) {
				local617 = local25.method5338();
			}
			this.anIntArray365[local584] = local578 + local592;
			this.anIntArray363[local584] = local580 + local602;
			this.anIntArray361[local584] = local582 + local617;
			local578 = this.anIntArray365[local584];
			local582 = this.anIntArray361[local584];
			local580 = this.anIntArray363[local584];
			if (local144 == 1) {
				this.anIntArray366[local584] = local30.method5337();
			}
		}
		local10.anInt6812 = local319;
		local15.anInt6812 = local235;
		local20.anInt6812 = local251;
		local25.anInt6812 = local285;
		local30.anInt6812 = local261;
		local35.anInt6812 = local301;
		local40.anInt6812 = local313;
		for (local590 = 0; local590 < this.anInt5437; local590++) {
			this.aShortArray91[local590] = (short) local10.method5335();
			if (local74) {
				this.aByteArray65[local590] = local15.method5367();
			}
			if (local128 == 255) {
				this.aByteArray66[local590] = local20.method5367();
			}
			if (local132 == 1) {
				this.aByteArray69[local590] = local25.method5367();
			}
			if (local136 == 1) {
				this.anIntArray359[local590] = local30.method5337();
			}
			if (local140 == 1) {
				this.aShortArray89[local590] = (short) (local35.method5335() - 1);
			}
			if (this.aByteArray68 != null) {
				if (this.aShortArray89[local590] == -1) {
					this.aByteArray68[local590] = -1;
				} else {
					this.aByteArray68[local590] = (byte) (local40.method5337() - 1);
				}
			}
		}
		local10.anInt6812 = local295;
		this.anInt5435 = -1;
		local15.anInt6812 = local244;
		@Pc(818) short local818 = 0;
		@Pc(820) short local820 = 0;
		@Pc(822) short local822 = 0;
		@Pc(824) short local824 = 0;
		@Pc(832) int local832;
		for (@Pc(826) int local826 = 0; local826 < this.anInt5437; local826++) {
			local832 = local15.method5337();
			if (local832 == 1) {
				local818 = (short) (local824 + local10.method5338());
				local820 = (short) (local818 + local10.method5338());
				local822 = (short) (local820 + local10.method5338());
				this.aShortArray93[local826] = local818;
				local824 = local822;
				this.aShortArray96[local826] = local820;
				this.aShortArray94[local826] = local822;
				if (this.anInt5435 < local818) {
					this.anInt5435 = local818;
				}
				if (local820 > this.anInt5435) {
					this.anInt5435 = local820;
				}
				if (local822 > this.anInt5435) {
					this.anInt5435 = local822;
				}
			}
			if (local832 == 2) {
				local820 = local822;
				local822 = (short) (local10.method5338() + local824);
				local824 = local822;
				this.aShortArray93[local826] = local818;
				this.aShortArray96[local826] = local820;
				this.aShortArray94[local826] = local822;
				if (local822 > this.anInt5435) {
					this.anInt5435 = local822;
				}
			}
			if (local832 == 3) {
				local818 = local822;
				local822 = (short) (local10.method5338() + local824);
				local824 = local822;
				this.aShortArray93[local826] = local818;
				this.aShortArray96[local826] = local820;
				this.aShortArray94[local826] = local822;
				if (this.anInt5435 < local822) {
					this.anInt5435 = local822;
				}
			}
			if (local832 == 4) {
				@Pc(995) short local995 = local818;
				local818 = local820;
				local820 = local995;
				local822 = (short) (local824 + local10.method5338());
				this.aShortArray93[local826] = local818;
				local824 = local822;
				this.aShortArray96[local826] = local995;
				this.aShortArray94[local826] = local822;
				if (local822 > this.anInt5435) {
					this.anInt5435 = local822;
				}
			}
		}
		this.anInt5435++;
		local10.anInt6812 = local346;
		local15.anInt6812 = local354;
		local20.anInt6812 = local370;
		local25.anInt6812 = local378;
		local30.anInt6812 = local384;
		local35.anInt6812 = local390;
		@Pc(1074) int local1074;
		for (local832 = 0; local832 < this.anInt5449; local832++) {
			local1074 = this.aByteArray67[local832] & 0xFF;
			if (local1074 == 0) {
				this.aShortArray88[local832] = (short) local10.method5335();
				this.aShortArray92[local832] = (short) local10.method5335();
				this.aShortArray87[local832] = (short) local10.method5335();
			}
			if (local1074 == 1) {
				this.aShortArray88[local832] = (short) local15.method5335();
				this.aShortArray92[local832] = (short) local15.method5335();
				this.aShortArray87[local832] = (short) local15.method5335();
				this.anIntArray362[local832] = local20.method5335();
				if (this.anInt5431 >= 14) {
					this.anIntArray367[local832] = local20.method5345();
				} else {
					this.anIntArray367[local832] = local20.method5335();
				}
				this.anIntArray364[local832] = local20.method5335();
				this.aByteArray63[local832] = local25.method5367();
				this.aByteArray64[local832] = local30.method5367();
				this.anIntArray357[local832] = local35.method5367();
			}
			if (local1074 == 2) {
				this.aShortArray88[local832] = (short) local15.method5335();
				this.aShortArray92[local832] = (short) local15.method5335();
				this.aShortArray87[local832] = (short) local15.method5335();
				this.anIntArray362[local832] = local20.method5335();
				if (this.anInt5431 < 14) {
					this.anIntArray367[local832] = local20.method5335();
				} else {
					this.anIntArray367[local832] = local20.method5345();
				}
				this.anIntArray364[local832] = local20.method5335();
				this.aByteArray63[local832] = local25.method5367();
				this.aByteArray64[local832] = local30.method5367();
				this.anIntArray357[local832] = local35.method5367();
				this.anIntArray360[local832] = local35.method5367();
				this.anIntArray358[local832] = local35.method5367();
			}
			if (local1074 == 3) {
				this.aShortArray88[local832] = (short) local15.method5335();
				this.aShortArray92[local832] = (short) local15.method5335();
				this.aShortArray87[local832] = (short) local15.method5335();
				this.anIntArray362[local832] = local20.method5335();
				if (this.anInt5431 >= 14) {
					this.anIntArray367[local832] = local20.method5345();
				} else {
					this.anIntArray367[local832] = local20.method5335();
				}
				this.anIntArray364[local832] = local20.method5335();
				this.aByteArray63[local832] = local25.method5367();
				this.aByteArray64[local832] = local30.method5367();
				this.anIntArray357[local832] = local35.method5367();
			}
		}
		local10.anInt6812 = local189;
		@Pc(1400) int local1400;
		@Pc(1406) int local1406;
		@Pc(1410) int local1410;
		@Pc(1472) int local1472;
		if (local85) {
			local1074 = local10.method5337();
			if (local1074 > 0) {
				this.aClass229Array3 = new Class229[local1074];
				for (local1400 = 0; local1400 < local1074; local1400++) {
					local1406 = local10.method5335();
					local1410 = local10.method5335();
					@Pc(1418) byte local1418;
					if (local128 == 255) {
						local1418 = this.aByteArray66[local1410];
					} else {
						local1418 = (byte) local128;
					}
					this.aClass229Array3[local1400] = new Class229(local1406, this.aShortArray93[local1410], this.aShortArray96[local1410], this.aShortArray94[local1410], local1418);
				}
			}
			local1400 = local10.method5337();
			if (local1400 > 0) {
				this.aClass181Array3 = new Class181[local1400];
				for (local1406 = 0; local1406 < local1400; local1406++) {
					local1410 = local10.method5335();
					local1472 = local10.method5335();
					this.aClass181Array3[local1406] = new Class181(local1410, local1472);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1074 = local10.method5337();
		if (local1074 <= 0) {
			return;
		}
		this.aClass167Array1 = new Class167[local1074];
		for (local1400 = 0; local1400 < local1074; local1400++) {
			local1406 = local10.method5335();
			local1410 = local10.method5335();
			local1472 = local10.method5337();
			@Pc(1522) byte local1522 = local10.method5367();
			this.aClass167Array1[local1400] = new Class167(local1406, local1410, local1472, local1522);
		}
		return;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZSS)V")
	public void method4256(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray89 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt5437; local15++) {
			if (this.aShortArray89[local15] == arg1) {
				this.aShortArray89[local15] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BSSISBSBSS)B")
	public byte method4257() {
		if (this.anInt5449 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray67[this.anInt5449] = 3;
		this.aShortArray88[this.anInt5449] = 0;
		this.aShortArray92[this.anInt5449] = 32767;
		this.aShortArray87[this.anInt5449] = 0;
		this.anIntArray362[this.anInt5449] = 1024;
		this.anIntArray367[this.anInt5449] = 1024;
		this.anIntArray364[this.anInt5449] = 1024;
		this.aByteArray63[this.anInt5449] = 0;
		this.aByteArray64[this.anInt5449] = 0;
		this.anIntArray357[this.anInt5449] = 0;
		return (byte) this.anInt5449++;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(SLclient!pq;BI)I")
	private int method4258(@OriginalArg(0) short arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray365[arg2];
		@Pc(15) int local15 = arg1.anIntArray363[arg2];
		@Pc(20) int local20 = arg1.anIntArray361[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5447; local22++) {
			if (local10 == this.anIntArray365[local22] && this.anIntArray363[local22] == local15 && this.anIntArray361[local22] == local20) {
				this.aShortArray90[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray365[this.anInt5447] = local10;
		this.anIntArray363[this.anInt5447] = local15;
		this.anIntArray361[this.anInt5447] = local20;
		this.aShortArray90[this.anInt5447] = arg0;
		this.anIntArray366[this.anInt5447] = arg1.anIntArray366 == null ? -1 : arg1.anIntArray366[arg2];
		return this.anInt5447++;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I[B)V")
	private void method4259(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub28 local14 = new Class1_Sub28(arg0);
		@Pc(19) Class1_Sub28 local19 = new Class1_Sub28(arg0);
		@Pc(24) Class1_Sub28 local24 = new Class1_Sub28(arg0);
		@Pc(29) Class1_Sub28 local29 = new Class1_Sub28(arg0);
		@Pc(34) Class1_Sub28 local34 = new Class1_Sub28(arg0);
		local14.anInt6812 = arg0.length - 18;
		this.anInt5447 = local14.method5335();
		this.anInt5437 = local14.method5335();
		this.anInt5449 = local14.method5337();
		@Pc(59) int local59 = local14.method5337();
		@Pc(63) int local63 = local14.method5337();
		@Pc(67) int local67 = local14.method5337();
		@Pc(71) int local71 = local14.method5337();
		@Pc(75) int local75 = local14.method5337();
		@Pc(79) int local79 = local14.method5335();
		@Pc(83) int local83 = local14.method5335();
		@Pc(89) int local89 = local14.method5335();
		@Pc(95) int local95 = local14.method5335();
		@Pc(104) int local104 = this.anInt5447;
		@Pc(106) int local106 = local104;
		local104 += this.anInt5437;
		@Pc(113) int local113 = local104;
		if (local63 == 255) {
			local104 += this.anInt5437;
		}
		@Pc(123) int local123 = local104;
		if (local71 == 1) {
			local104 += this.anInt5437;
		}
		@Pc(133) int local133 = local104;
		if (local59 == 1) {
			local104 += this.anInt5437;
		}
		@Pc(143) int local143 = local104;
		if (local75 == 1) {
			local104 += this.anInt5447;
		}
		@Pc(155) int local155 = local104;
		if (local67 == 1) {
			local104 += this.anInt5437;
		}
		@Pc(167) int local167 = local104;
		local104 += local95;
		@Pc(173) int local173 = local104;
		local104 += this.anInt5437 * 2;
		@Pc(182) int local182 = local104;
		local104 += this.anInt5449 * 6;
		@Pc(191) int local191 = local104;
		local104 += local79;
		@Pc(197) int local197 = local104;
		local104 += local83;
		if (local59 == 1) {
			this.aByteArray65 = new byte[this.anInt5437];
			this.aShortArray89 = new short[this.anInt5437];
			this.aByteArray68 = new byte[this.anInt5437];
		}
		this.aShortArray93 = new short[this.anInt5437];
		if (local75 == 1) {
			this.anIntArray366 = new int[this.anInt5447];
		}
		this.aShortArray91 = new short[this.anInt5437];
		if (local67 == 1) {
			this.aByteArray69 = new byte[this.anInt5437];
		}
		if (local63 == 255) {
			this.aByteArray66 = new byte[this.anInt5437];
		} else {
			this.aByte93 = (byte) local63;
		}
		this.anIntArray361 = new int[this.anInt5447];
		local14.anInt6812 = 0;
		this.anIntArray363 = new int[this.anInt5447];
		if (this.anInt5449 > 0) {
			this.aShortArray88 = new short[this.anInt5449];
			this.aShortArray87 = new short[this.anInt5449];
			this.aShortArray92 = new short[this.anInt5449];
			this.aByteArray67 = new byte[this.anInt5449];
		}
		this.aShortArray94 = new short[this.anInt5437];
		if (local71 == 1) {
			this.anIntArray359 = new int[this.anInt5437];
		}
		this.aShortArray96 = new short[this.anInt5437];
		this.anIntArray365 = new int[this.anInt5447];
		local19.anInt6812 = local191;
		local24.anInt6812 = local197;
		local29.anInt6812 = local104;
		local34.anInt6812 = local143;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(356) int local356;
		@Pc(358) int local358;
		for (@Pc(350) int local350 = 0; local350 < this.anInt5447; local350++) {
			local356 = local14.method5337();
			local358 = 0;
			if ((local356 & 0x1) != 0) {
				local358 = local19.method5338();
			}
			@Pc(368) int local368 = 0;
			if ((local356 & 0x2) != 0) {
				local368 = local24.method5338();
			}
			@Pc(381) int local381 = 0;
			if ((local356 & 0x4) != 0) {
				local381 = local29.method5338();
			}
			this.anIntArray365[local350] = local344 + local358;
			this.anIntArray363[local350] = local368 + local346;
			this.anIntArray361[local350] = local381 + local348;
			local344 = this.anIntArray365[local350];
			local348 = this.anIntArray361[local350];
			local346 = this.anIntArray363[local350];
			if (local75 == 1) {
				this.anIntArray366[local350] = local34.method5337();
			}
		}
		local14.anInt6812 = local173;
		local19.anInt6812 = local133;
		local24.anInt6812 = local113;
		local29.anInt6812 = local155;
		local34.anInt6812 = local123;
		for (local356 = 0; local356 < this.anInt5437; local356++) {
			this.aShortArray91[local356] = (short) local14.method5335();
			if (local59 == 1) {
				local358 = local19.method5337();
				if ((local358 & 0x1) == 1) {
					this.aByteArray65[local356] = 1;
					local7 = true;
				} else {
					this.aByteArray65[local356] = 0;
				}
				if ((local358 & 0x2) == 2) {
					this.aByteArray68[local356] = (byte) (local358 >> 2);
					this.aShortArray89[local356] = this.aShortArray91[local356];
					this.aShortArray91[local356] = 127;
					if (this.aShortArray89[local356] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray68[local356] = -1;
					this.aShortArray89[local356] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray66[local356] = local24.method5367();
			}
			if (local67 == 1) {
				this.aByteArray69[local356] = local29.method5367();
			}
			if (local71 == 1) {
				this.anIntArray359[local356] = local34.method5337();
			}
		}
		this.anInt5435 = -1;
		local14.anInt6812 = local167;
		local19.anInt6812 = local106;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(617) int local617;
		for (@Pc(611) int local611 = 0; local611 < this.anInt5437; local611++) {
			local617 = local19.method5337();
			if (local617 == 1) {
				local603 = (short) (local14.method5338() + local609);
				local605 = (short) (local14.method5338() + local603);
				local607 = (short) (local14.method5338() + local605);
				this.aShortArray93[local611] = local603;
				local609 = local607;
				this.aShortArray96[local611] = local605;
				this.aShortArray94[local611] = local607;
				if (this.anInt5435 < local603) {
					this.anInt5435 = local603;
				}
				if (local605 > this.anInt5435) {
					this.anInt5435 = local605;
				}
				if (this.anInt5435 < local607) {
					this.anInt5435 = local607;
				}
			}
			if (local617 == 2) {
				local605 = local607;
				local607 = (short) (local14.method5338() + local609);
				local609 = local607;
				this.aShortArray93[local611] = local603;
				this.aShortArray96[local611] = local605;
				this.aShortArray94[local611] = local607;
				if (this.anInt5435 < local607) {
					this.anInt5435 = local607;
				}
			}
			if (local617 == 3) {
				local603 = local607;
				local607 = (short) (local609 + local14.method5338());
				local609 = local607;
				this.aShortArray93[local611] = local603;
				this.aShortArray96[local611] = local605;
				this.aShortArray94[local611] = local607;
				if (this.anInt5435 < local607) {
					this.anInt5435 = local607;
				}
			}
			if (local617 == 4) {
				@Pc(776) short local776 = local603;
				local603 = local605;
				local607 = (short) (local609 + local14.method5338());
				local605 = local776;
				this.aShortArray93[local611] = local603;
				local609 = local607;
				this.aShortArray96[local611] = local776;
				this.aShortArray94[local611] = local607;
				if (local607 > this.anInt5435) {
					this.anInt5435 = local607;
				}
			}
		}
		local14.anInt6812 = local182;
		this.anInt5435++;
		for (local617 = 0; local617 < this.anInt5449; local617++) {
			this.aByteArray67[local617] = 0;
			this.aShortArray88[local617] = (short) local14.method5335();
			this.aShortArray92[local617] = (short) local14.method5335();
			this.aShortArray87[local617] = (short) local14.method5335();
		}
		if (this.aByteArray68 != null) {
			@Pc(880) boolean local880 = false;
			for (@Pc(882) int local882 = 0; local882 < this.anInt5437; local882++) {
				@Pc(891) int local891 = this.aByteArray68[local882] & 0xFF;
				if (local891 != 255) {
					if ((this.aShortArray88[local891] & 0xFFFF) == this.aShortArray93[local882] && (this.aShortArray92[local891] & 0xFFFF) == this.aShortArray96[local882] && this.aShortArray94[local882] == (this.aShortArray87[local891] & 0xFFFF)) {
						this.aByteArray68[local882] = -1;
					} else {
						local880 = true;
					}
				}
			}
			if (!local880) {
				this.aByteArray68 = null;
			}
		}
		if (!local7) {
			this.aByteArray65 = null;
		}
		if (!local9) {
			this.aShortArray89 = null;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)[[I")
	public int[][] method4260() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5437; local17++) {
			@Pc(24) int local24 = this.anIntArray359[local17];
			if (local24 >= 0) {
				if (local10 < local24) {
					local10 = local24;
				}
				@Pc(38) int local38 = local8[local24]++;
			}
		}
		@Pc(55) int[][] local55 = new int[local10 + 1][];
		for (@Pc(57) int local57 = 0; local57 <= local10; local57++) {
			local55[local57] = new int[local8[local57]];
			local8[local57] = 0;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt5437; local76++) {
			@Pc(83) int local83 = this.anIntArray359[local76];
			if (local83 >= 0) {
				local55[local83][local8[local83]++] = local76;
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)[[I")
	public int[][] method4261() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.aClass167Array1.length; local17++) {
			@Pc(25) int local25 = this.aClass167Array1[local17].anInt4866;
			if (local25 >= 0) {
				@Pc(34) int local34 = local13[local25]++;
				if (local15 < local25) {
					local15 = local25;
				}
			}
		}
		@Pc(57) int[][] local57 = new int[local15 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local15; local59++) {
			local57[local59] = new int[local13[local59]];
			local13[local59] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass167Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass167Array1[local78].anInt4866;
			if (local86 >= 0) {
				local57[local86][local13[local86]++] = local78;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIZI)V")
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt5447; local9++) {
			this.anIntArray365[local9] += arg0;
			this.anIntArray363[local9] += arg2;
			this.anIntArray361[local9] += arg1;
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)[[I")
	public int[][] method4264() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5435; local12++) {
			@Pc(19) int local19 = this.anIntArray366[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(46) int[][] local46 = new int[local10 + 1][];
		for (@Pc(53) int local53 = 0; local53 <= local10; local53++) {
			local46[local53] = new int[local8[local53]];
			local8[local53] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt5435; local72++) {
			@Pc(79) int local79 = this.anIntArray366[local72];
			if (local79 >= 0) {
				local46[local79][local8[local79]++] = local72;
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZIII)I")
	public int method4265(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt5447; local13++) {
			if (arg0 == this.anIntArray365[local13] && this.anIntArray363[local13] == arg2 && arg1 == this.anIntArray361[local13]) {
				return local13;
			}
		}
		this.anIntArray365[this.anInt5447] = arg0;
		this.anIntArray363[this.anInt5447] = arg2;
		this.anIntArray361[this.anInt5447] = arg1;
		this.anInt5435 = this.anInt5447 + 1;
		return this.anInt5447++;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ISS)V")
	public void method4266(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt5437; local9++) {
			if (this.aShortArray91[local9] == arg1) {
				this.aShortArray91[local9] = arg0;
			}
		}
	}
}
