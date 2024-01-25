import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class97 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "[Lclient!fi;")
	public Class93[] aClass93Array1;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "[Lclient!kca;")
	public Class161[] aClass161Array1;

	@OriginalMember(owner = "client!fp", name = "d", descriptor = "[I")
	public int[] anIntArray258;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "[I")
	public int[] anIntArray260;

	@OriginalMember(owner = "client!fp", name = "l", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!fp", name = "m", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "[I")
	public int[] anIntArray261;

	@OriginalMember(owner = "client!fp", name = "u", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!fp", name = "w", descriptor = "[Lclient!np;")
	public Class208[] aClass208Array1;

	@OriginalMember(owner = "client!fp", name = "z", descriptor = "[I")
	public int[] anIntArray262;

	@OriginalMember(owner = "client!fp", name = "A", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!fp", name = "B", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!fp", name = "C", descriptor = "[S")
	public short[] aShortArray43;

	@OriginalMember(owner = "client!fp", name = "D", descriptor = "[I")
	public int[] anIntArray263;

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "[I")
	public int[] anIntArray264;

	@OriginalMember(owner = "client!fp", name = "G", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!fp", name = "H", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!fp", name = "J", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!fp", name = "L", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!fp", name = "N", descriptor = "[I")
	public int[] anIntArray265;

	@OriginalMember(owner = "client!fp", name = "O", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!fp", name = "Q", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!fp", name = "V", descriptor = "[I")
	public int[] anIntArray267;

	@OriginalMember(owner = "client!fp", name = "Y", descriptor = "[I")
	public int[] anIntArray268;

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
	public int anInt2710 = 0;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "B")
	public byte aByte44 = 0;

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
	public int anInt2715 = 0;

	@OriginalMember(owner = "client!fp", name = "R", descriptor = "I")
	public int anInt2722 = 12;

	@OriginalMember(owner = "client!fp", name = "ab", descriptor = "I")
	public int anInt2729 = 0;

	@OriginalMember(owner = "client!fp", name = "X", descriptor = "I")
	public int anInt2727 = 0;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "([B)V")
	public Class97(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2308(arg0);
		} else {
			this.method2313(arg0);
		}
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(III)V")
	public Class97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray265 = new int[arg0];
		this.aShortArray39 = new short[arg1];
		this.aShortArray40 = new short[arg1];
		this.aByteArray38 = new byte[arg1];
		this.anIntArray264 = new int[arg0];
		this.anIntArray259 = new int[arg0];
		if (arg2 > 0) {
			this.anIntArray263 = new int[arg2];
			this.anIntArray260 = new int[arg2];
			this.aShortArray46 = new short[arg2];
			this.aByteArray34 = new byte[arg2];
			this.aByteArray37 = new byte[arg2];
			this.anIntArray267 = new int[arg2];
			this.anIntArray266 = new int[arg2];
			this.anIntArray262 = new int[arg2];
			this.anIntArray268 = new int[arg2];
			this.aShortArray38 = new short[arg2];
			this.aByteArray35 = new byte[arg2];
			this.aShortArray44 = new short[arg2];
		}
		this.aByteArray36 = new byte[arg1];
		this.aShortArray47 = new short[arg1];
		this.aByteArray33 = new byte[arg1];
		this.aShortArray45 = new short[arg1];
		this.aByteArray39 = new byte[arg1];
		this.anIntArray258 = new int[arg1];
		this.anIntArray261 = new int[arg0];
		this.aShortArray42 = new short[arg1];
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "([Lclient!fp;I)V")
	public Class97(@OriginalArg(0) Class97[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2727 = 0;
		this.anInt2729 = 0;
		this.anInt2710 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte44 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class97 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt2727 += local59.anInt2727;
				this.anInt2710 += local59.anInt2710;
				this.anInt2729 += local59.anInt2729;
				if (local59.aClass93Array1 != null) {
					local34 += local59.aClass93Array1.length;
				}
				local38 |= local59.aByteArray39 != null;
				if (local59.aClass161Array1 != null) {
					local32 += local59.aClass161Array1.length;
				}
				if (local59.aClass208Array1 != null) {
					local36 += local59.aClass208Array1.length;
				}
				local48 |= local59.anIntArray258 != null;
				local42 |= local59.aByteArray33 != null;
				local44 |= local59.aByteArray36 != null;
				if (local59.aByteArray38 == null) {
					if (this.aByte44 == -1) {
						this.aByte44 = local59.aByte44;
					}
					if (this.aByte44 != local59.aByte44) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray47 != null;
			}
		}
		this.aShortArray42 = new short[this.anInt2727];
		this.aShortArray45 = new short[this.anInt2727];
		if (local42) {
			this.aByteArray33 = new byte[this.anInt2727];
		}
		if (local44) {
			this.aByteArray36 = new byte[this.anInt2727];
		}
		if (local36 > 0) {
			this.aClass208Array1 = new Class208[local36];
		}
		this.aShortArray43 = new short[this.anInt2729];
		if (local48) {
			this.anIntArray258 = new int[this.anInt2727];
		}
		this.aShortArray39 = new short[this.anInt2727];
		this.anIntArray259 = new int[this.anInt2729];
		this.anIntArray264 = new int[this.anInt2729];
		this.aShortArray41 = new short[this.anInt2727];
		if (local32 > 0) {
			this.aClass161Array1 = new Class161[local32];
		}
		this.anIntArray261 = new int[this.anInt2729];
		this.anIntArray265 = new int[this.anInt2729];
		if (local40) {
			this.aByteArray38 = new byte[this.anInt2727];
		}
		if (local38) {
			this.aByteArray39 = new byte[this.anInt2727];
		}
		if (local46) {
			this.aShortArray47 = new short[this.anInt2727];
		}
		if (this.anInt2710 > 0) {
			this.anIntArray268 = new int[this.anInt2710];
			this.anIntArray263 = new int[this.anInt2710];
			this.anIntArray266 = new int[this.anInt2710];
			this.anIntArray260 = new int[this.anInt2710];
			this.anIntArray267 = new int[this.anInt2710];
			this.aByteArray35 = new byte[this.anInt2710];
			this.aShortArray44 = new short[this.anInt2710];
			this.aByteArray37 = new byte[this.anInt2710];
			this.aShortArray46 = new short[this.anInt2710];
			this.aByteArray34 = new byte[this.anInt2710];
			this.anIntArray262 = new int[this.anInt2710];
			this.aShortArray38 = new short[this.anInt2710];
		}
		this.aShortArray40 = new short[this.anInt2727];
		if (local34 > 0) {
			this.aClass93Array1 = new Class93[local34];
		}
		local36 = 0;
		this.anInt2710 = 0;
		this.anInt2727 = 0;
		this.anInt2729 = 0;
		local32 = 0;
		local34 = 0;
		@Pc(612) int local612;
		@Pc(623) int local623;
		for (@Pc(380) int local380 = 0; local380 < arg1; local380++) {
			@Pc(387) short local387 = (short) (0x1 << local380);
			@Pc(391) Class97 local391 = arg0[local380];
			if (local391 != null) {
				@Pc(398) int local398;
				if (local391.aClass208Array1 != null) {
					for (local398 = 0; local398 < local391.aClass208Array1.length; local398++) {
						@Pc(405) Class208 local405 = local391.aClass208Array1[local398];
						this.aClass208Array1[local36++] = local405.method5049(this.anInt2727 + local405.anInt5962);
					}
				}
				for (local398 = 0; local398 < local391.anInt2727; local398++) {
					if (local38 && local391.aByteArray39 != null) {
						this.aByteArray39[this.anInt2727] = local391.aByteArray39[local398];
					}
					if (local40) {
						if (local391.aByteArray38 == null) {
							this.aByteArray38[this.anInt2727] = local391.aByte44;
						} else {
							this.aByteArray38[this.anInt2727] = local391.aByteArray38[local398];
						}
					}
					if (local42 && local391.aByteArray33 != null) {
						this.aByteArray33[this.anInt2727] = local391.aByteArray33[local398];
					}
					if (local46) {
						if (local391.aShortArray47 == null) {
							this.aShortArray47[this.anInt2727] = -1;
						} else {
							this.aShortArray47[this.anInt2727] = local391.aShortArray47[local398];
						}
					}
					if (local48) {
						if (local391.anIntArray258 == null) {
							this.anIntArray258[this.anInt2727] = -1;
						} else {
							this.anIntArray258[this.anInt2727] = local391.anIntArray258[local398];
						}
					}
					this.aShortArray45[this.anInt2727] = (short) this.method2317(local391, local387, local391.aShortArray45[local398]);
					this.aShortArray42[this.anInt2727] = (short) this.method2317(local391, local387, local391.aShortArray42[local398]);
					this.aShortArray40[this.anInt2727] = (short) this.method2317(local391, local387, local391.aShortArray40[local398]);
					this.aShortArray41[this.anInt2727] = local387;
					this.aShortArray39[this.anInt2727] = local391.aShortArray39[local398];
					this.anInt2727++;
				}
				@Pc(599) int local599;
				if (local391.aClass161Array1 != null) {
					for (local599 = 0; local599 < local391.aClass161Array1.length; local599++) {
						local612 = this.method2317(local391, local387, local391.aClass161Array1[local599].anInt4842);
						local623 = this.method2317(local391, local387, local391.aClass161Array1[local599].anInt4841);
						@Pc(634) int local634 = this.method2317(local391, local387, local391.aClass161Array1[local599].anInt4847);
						this.aClass161Array1[local32] = local391.aClass161Array1[local599].method4180(local634, local623, local612);
						local32++;
					}
				}
				if (local391.aClass93Array1 != null) {
					for (local599 = 0; local599 < local391.aClass93Array1.length; local599++) {
						local612 = this.method2317(local391, local387, local391.aClass93Array1[local599].anInt2654);
						this.aClass93Array1[local34] = local391.aClass93Array1[local599].method2257(local612);
						local34++;
					}
				}
			}
		}
		this.anInt2715 = this.anInt2729;
		@Pc(700) int local700 = 0;
		for (@Pc(702) int local702 = 0; local702 < arg1; local702++) {
			@Pc(709) short local709 = (short) (0x1 << local702);
			@Pc(713) Class97 local713 = arg0[local702];
			if (local713 != null) {
				for (local612 = 0; local612 < local713.anInt2727; local612++) {
					if (local44) {
						this.aByteArray36[local700++] = (byte) (local713.aByteArray36 == null || local713.aByteArray36[local612] == -1 ? -1 : this.anInt2710 + local713.aByteArray36[local612]);
					}
				}
				for (local623 = 0; local623 < local713.anInt2710; local623++) {
					@Pc(766) byte local766 = this.aByteArray37[this.anInt2710] = local713.aByteArray37[local623];
					if (local766 == 0) {
						this.aShortArray38[this.anInt2710] = (short) this.method2317(local713, local709, local713.aShortArray38[local623]);
						this.aShortArray46[this.anInt2710] = (short) this.method2317(local713, local709, local713.aShortArray46[local623]);
						this.aShortArray44[this.anInt2710] = (short) this.method2317(local713, local709, local713.aShortArray44[local623]);
					}
					if (local766 >= 1 && local766 <= 3) {
						this.aShortArray38[this.anInt2710] = local713.aShortArray38[local623];
						this.aShortArray46[this.anInt2710] = local713.aShortArray46[local623];
						this.aShortArray44[this.anInt2710] = local713.aShortArray44[local623];
						this.anIntArray266[this.anInt2710] = local713.anIntArray266[local623];
						this.anIntArray267[this.anInt2710] = local713.anIntArray267[local623];
						this.anIntArray260[this.anInt2710] = local713.anIntArray260[local623];
						this.aByteArray34[this.anInt2710] = local713.aByteArray34[local623];
						this.aByteArray35[this.anInt2710] = local713.aByteArray35[local623];
						this.anIntArray262[this.anInt2710] = local713.anIntArray262[local623];
					}
					if (local766 == 2) {
						this.anIntArray268[this.anInt2710] = local713.anIntArray268[local623];
						this.anIntArray263[this.anInt2710] = local713.anIntArray263[local623];
					}
					this.anInt2710++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIII)V")
	public void method2306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2729; local11++) {
			this.anIntArray261[local11] += arg0;
			this.anIntArray264[local11] += arg2;
			this.anIntArray265[local11] += arg1;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IIIB)I")
	public int method2307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt2729; local13++) {
			if (this.anIntArray261[local13] == arg2 && arg1 == this.anIntArray264[local13] && this.anIntArray265[local13] == arg0) {
				return local13;
			}
		}
		this.anIntArray261[this.anInt2729] = arg2;
		this.anIntArray264[this.anInt2729] = arg1;
		this.anIntArray265[this.anInt2729] = arg0;
		this.anInt2715 = this.anInt2729 + 1;
		return this.anInt2729++;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([BB)V")
	private void method2308(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub6 local10 = new Class1_Sub6(arg0);
		@Pc(15) Class1_Sub6 local15 = new Class1_Sub6(arg0);
		@Pc(20) Class1_Sub6 local20 = new Class1_Sub6(arg0);
		@Pc(25) Class1_Sub6 local25 = new Class1_Sub6(arg0);
		@Pc(30) Class1_Sub6 local30 = new Class1_Sub6(arg0);
		@Pc(35) Class1_Sub6 local35 = new Class1_Sub6(arg0);
		@Pc(40) Class1_Sub6 local40 = new Class1_Sub6(arg0);
		local10.anInt4555 = arg0.length - 23;
		this.anInt2729 = local10.method3967();
		this.anInt2727 = local10.method3967();
		this.anInt2710 = local10.method3922();
		@Pc(75) int local75 = local10.method3922();
		@Pc(86) boolean local86 = (local75 & 0x1) == 1;
		@Pc(95) boolean local95 = (local75 & 0x2) == 2;
		@Pc(106) boolean local106 = (local75 & 0x4) == 4;
		@Pc(115) boolean local115 = (local75 & 0x8) == 8;
		if (local115) {
			local10.anInt4555 -= 7;
			this.anInt2722 = local10.method3922();
			local10.anInt4555 += 6;
		}
		@Pc(138) int local138 = local10.method3922();
		@Pc(142) int local142 = local10.method3922();
		@Pc(146) int local146 = local10.method3922();
		@Pc(150) int local150 = local10.method3922();
		@Pc(154) int local154 = local10.method3922();
		@Pc(158) int local158 = local10.method3967();
		@Pc(164) int local164 = local10.method3967();
		@Pc(170) int local170 = local10.method3967();
		@Pc(174) int local174 = local10.method3967();
		@Pc(178) int local178 = local10.method3967();
		@Pc(180) int local180 = 0;
		@Pc(182) int local182 = 0;
		@Pc(184) int local184 = 0;
		@Pc(197) int local197;
		if (this.anInt2710 > 0) {
			local10.anInt4555 = 0;
			this.aByteArray37 = new byte[this.anInt2710];
			for (local197 = 0; local197 < this.anInt2710; local197++) {
				@Pc(208) byte local208 = this.aByteArray37[local197] = local10.method3928();
				if (local208 == 0) {
					local180++;
				}
				if (local208 >= 1 && local208 <= 3) {
					local182++;
				}
				if (local208 == 2) {
					local184++;
				}
			}
		}
		local197 = this.anInt2710;
		@Pc(238) int local238 = local197;
		local197 += this.anInt2729;
		@Pc(245) int local245 = local197;
		if (local86) {
			local197 += this.anInt2727;
		}
		@Pc(254) int local254 = local197;
		local197 += this.anInt2727;
		@Pc(261) int local261 = local197;
		if (local138 == 255) {
			local197 += this.anInt2727;
		}
		@Pc(271) int local271 = local197;
		if (local146 == 1) {
			local197 += this.anInt2727;
		}
		@Pc(283) int local283 = local197;
		if (local154 == 1) {
			local197 += this.anInt2729;
		}
		@Pc(295) int local295 = local197;
		if (local142 == 1) {
			local197 += this.anInt2727;
		}
		@Pc(305) int local305 = local197;
		local197 += local174;
		@Pc(311) int local311 = local197;
		if (local150 == 1) {
			local197 += this.anInt2727 * 2;
		}
		@Pc(325) int local325 = local197;
		local197 += local178;
		@Pc(331) int local331 = local197;
		local197 += this.anInt2727 * 2;
		@Pc(340) int local340 = local197;
		local197 += local158;
		@Pc(346) int local346 = local197;
		local197 += local164;
		@Pc(352) int local352 = local197;
		local197 += local170;
		@Pc(358) int local358 = local197;
		local197 += local180 * 6;
		@Pc(366) int local366 = local197;
		local197 += local182 * 6;
		@Pc(374) byte local374 = 6;
		if (this.anInt2722 == 14) {
			local374 = 7;
		} else if (this.anInt2722 >= 15) {
			local374 = 9;
		}
		@Pc(392) int local392 = local197;
		local197 += local374 * local182;
		@Pc(400) int local400 = local197;
		local197 += local182;
		@Pc(406) int local406 = local197;
		local197 += local182;
		@Pc(412) int local412 = local197;
		local197 += local182 + local184 * 2;
		if (this.anInt2710 > 0) {
			this.aShortArray38 = new short[this.anInt2710];
			if (local182 > 0) {
				this.anIntArray266 = new int[local182];
				this.aByteArray35 = new byte[local182];
				this.anIntArray262 = new int[local182];
				this.aByteArray34 = new byte[local182];
				this.anIntArray260 = new int[local182];
				this.anIntArray267 = new int[local182];
			}
			this.aShortArray46 = new short[this.anInt2710];
			this.aShortArray44 = new short[this.anInt2710];
			if (local184 > 0) {
				this.anIntArray263 = new int[local184];
				this.anIntArray268 = new int[local184];
			}
		}
		if (local138 == 255) {
			this.aByteArray38 = new byte[this.anInt2727];
		} else {
			this.aByte44 = (byte) local138;
		}
		this.anIntArray264 = new int[this.anInt2729];
		if (local142 == 1) {
			this.aByteArray33 = new byte[this.anInt2727];
		}
		this.aShortArray42 = new short[this.anInt2727];
		if (local150 == 1) {
			this.aShortArray47 = new short[this.anInt2727];
		}
		if (local154 == 1) {
			this.anIntArray259 = new int[this.anInt2729];
		}
		if (local86) {
			this.aByteArray39 = new byte[this.anInt2727];
		}
		this.anIntArray265 = new int[this.anInt2729];
		local10.anInt4555 = local238;
		this.aShortArray39 = new short[this.anInt2727];
		this.aShortArray40 = new short[this.anInt2727];
		this.aShortArray45 = new short[this.anInt2727];
		this.anIntArray261 = new int[this.anInt2729];
		if (local150 == 1 && this.anInt2710 > 0) {
			this.aByteArray36 = new byte[this.anInt2727];
		}
		if (local146 == 1) {
			this.anIntArray258 = new int[this.anInt2727];
		}
		local15.anInt4555 = local340;
		local20.anInt4555 = local346;
		local25.anInt4555 = local352;
		local30.anInt4555 = local283;
		@Pc(605) int local605 = 0;
		@Pc(607) int local607 = 0;
		@Pc(609) int local609 = 0;
		@Pc(617) int local617;
		for (@Pc(611) int local611 = 0; local611 < this.anInt2729; local611++) {
			local617 = local10.method3922();
			@Pc(619) int local619 = 0;
			if ((local617 & 0x1) != 0) {
				local619 = local15.method3946();
			}
			@Pc(629) int local629 = 0;
			if ((local617 & 0x2) != 0) {
				local629 = local20.method3946();
			}
			@Pc(639) int local639 = 0;
			if ((local617 & 0x4) != 0) {
				local639 = local25.method3946();
			}
			this.anIntArray261[local611] = local619 + local605;
			this.anIntArray264[local611] = local629 + local607;
			this.anIntArray265[local611] = local639 + local609;
			local605 = this.anIntArray261[local611];
			local607 = this.anIntArray264[local611];
			local609 = this.anIntArray265[local611];
			if (local154 == 1) {
				this.anIntArray259[local611] = local30.method3922();
			}
		}
		local10.anInt4555 = local331;
		local15.anInt4555 = local245;
		local20.anInt4555 = local261;
		local25.anInt4555 = local295;
		local30.anInt4555 = local271;
		local35.anInt4555 = local311;
		local40.anInt4555 = local325;
		for (local617 = 0; local617 < this.anInt2727; local617++) {
			this.aShortArray39[local617] = (short) local10.method3967();
			if (local86) {
				this.aByteArray39[local617] = local15.method3928();
			}
			if (local138 == 255) {
				this.aByteArray38[local617] = local20.method3928();
			}
			if (local142 == 1) {
				this.aByteArray33[local617] = local25.method3928();
			}
			if (local146 == 1) {
				this.anIntArray258[local617] = local30.method3922();
			}
			if (local150 == 1) {
				this.aShortArray47[local617] = (short) (local35.method3967() - 1);
			}
			if (this.aByteArray36 != null) {
				if (this.aShortArray47[local617] == -1) {
					this.aByteArray36[local617] = -1;
				} else {
					this.aByteArray36[local617] = (byte) (local40.method3922() - 1);
				}
			}
		}
		local10.anInt4555 = local305;
		this.anInt2715 = -1;
		local15.anInt4555 = local254;
		@Pc(839) short local839 = 0;
		@Pc(841) short local841 = 0;
		@Pc(843) short local843 = 0;
		@Pc(845) short local845 = 0;
		@Pc(853) int local853;
		for (@Pc(847) int local847 = 0; local847 < this.anInt2727; local847++) {
			local853 = local15.method3922();
			if (local853 == 1) {
				local839 = (short) (local845 + local10.method3946());
				local841 = (short) (local10.method3946() + local839);
				local843 = (short) (local841 + local10.method3946());
				this.aShortArray45[local847] = local839;
				local845 = local843;
				this.aShortArray42[local847] = local841;
				this.aShortArray40[local847] = local843;
				if (this.anInt2715 < local839) {
					this.anInt2715 = local839;
				}
				if (this.anInt2715 < local841) {
					this.anInt2715 = local841;
				}
				if (local843 > this.anInt2715) {
					this.anInt2715 = local843;
				}
			}
			if (local853 == 2) {
				local841 = local843;
				local843 = (short) (local10.method3946() + local845);
				local845 = local843;
				this.aShortArray45[local847] = local839;
				this.aShortArray42[local847] = local841;
				this.aShortArray40[local847] = local843;
				if (local843 > this.anInt2715) {
					this.anInt2715 = local843;
				}
			}
			if (local853 == 3) {
				local839 = local843;
				local843 = (short) (local10.method3946() + local845);
				local845 = local843;
				this.aShortArray45[local847] = local839;
				this.aShortArray42[local847] = local841;
				this.aShortArray40[local847] = local843;
				if (this.anInt2715 < local843) {
					this.anInt2715 = local843;
				}
			}
			if (local853 == 4) {
				@Pc(1010) short local1010 = local839;
				local839 = local841;
				local841 = local1010;
				local843 = (short) (local845 + local10.method3946());
				local845 = local843;
				this.aShortArray45[local847] = local839;
				this.aShortArray42[local847] = local1010;
				this.aShortArray40[local847] = local843;
				if (this.anInt2715 < local843) {
					this.anInt2715 = local843;
				}
			}
		}
		this.anInt2715++;
		local10.anInt4555 = local358;
		local15.anInt4555 = local366;
		local20.anInt4555 = local392;
		local25.anInt4555 = local400;
		local30.anInt4555 = local406;
		local35.anInt4555 = local412;
		@Pc(1093) int local1093;
		for (local853 = 0; local853 < this.anInt2710; local853++) {
			local1093 = this.aByteArray37[local853] & 0xFF;
			if (local1093 == 0) {
				this.aShortArray38[local853] = (short) local10.method3967();
				this.aShortArray46[local853] = (short) local10.method3967();
				this.aShortArray44[local853] = (short) local10.method3967();
			}
			if (local1093 == 1) {
				this.aShortArray38[local853] = (short) local15.method3967();
				this.aShortArray46[local853] = (short) local15.method3967();
				this.aShortArray44[local853] = (short) local15.method3967();
				if (this.anInt2722 >= 15) {
					this.anIntArray266[local853] = local20.method3920();
					this.anIntArray267[local853] = local20.method3920();
					this.anIntArray260[local853] = local20.method3920();
				} else {
					this.anIntArray266[local853] = local20.method3967();
					if (this.anInt2722 < 14) {
						this.anIntArray267[local853] = local20.method3967();
					} else {
						this.anIntArray267[local853] = local20.method3920();
					}
					this.anIntArray260[local853] = local20.method3967();
				}
				this.aByteArray34[local853] = local25.method3928();
				this.aByteArray35[local853] = local30.method3928();
				this.anIntArray262[local853] = local35.method3928();
			}
			if (local1093 == 2) {
				this.aShortArray38[local853] = (short) local15.method3967();
				this.aShortArray46[local853] = (short) local15.method3967();
				this.aShortArray44[local853] = (short) local15.method3967();
				if (this.anInt2722 < 15) {
					this.anIntArray266[local853] = local20.method3967();
					if (this.anInt2722 >= 14) {
						this.anIntArray267[local853] = local20.method3920();
					} else {
						this.anIntArray267[local853] = local20.method3967();
					}
					this.anIntArray260[local853] = local20.method3967();
				} else {
					this.anIntArray266[local853] = local20.method3920();
					this.anIntArray267[local853] = local20.method3920();
					this.anIntArray260[local853] = local20.method3920();
				}
				this.aByteArray34[local853] = local25.method3928();
				this.aByteArray35[local853] = local30.method3928();
				this.anIntArray262[local853] = local35.method3928();
				this.anIntArray268[local853] = local35.method3928();
				this.anIntArray263[local853] = local35.method3928();
			}
			if (local1093 == 3) {
				this.aShortArray38[local853] = (short) local15.method3967();
				this.aShortArray46[local853] = (short) local15.method3967();
				this.aShortArray44[local853] = (short) local15.method3967();
				if (this.anInt2722 >= 15) {
					this.anIntArray266[local853] = local20.method3920();
					this.anIntArray267[local853] = local20.method3920();
					this.anIntArray260[local853] = local20.method3920();
				} else {
					this.anIntArray266[local853] = local20.method3967();
					if (this.anInt2722 < 14) {
						this.anIntArray267[local853] = local20.method3967();
					} else {
						this.anIntArray267[local853] = local20.method3920();
					}
					this.anIntArray260[local853] = local20.method3967();
				}
				this.aByteArray34[local853] = local25.method3928();
				this.aByteArray35[local853] = local30.method3928();
				this.anIntArray262[local853] = local35.method3928();
			}
		}
		local10.anInt4555 = local197;
		@Pc(1515) int local1515;
		@Pc(1523) int local1523;
		@Pc(1527) int local1527;
		@Pc(1594) int local1594;
		if (local95) {
			local1093 = local10.method3922();
			if (local1093 > 0) {
				this.aClass161Array1 = new Class161[local1093];
				for (local1515 = 0; local1515 < local1093; local1515++) {
					local1523 = local10.method3967();
					local1527 = local10.method3967();
					@Pc(1535) byte local1535;
					if (local138 == 255) {
						local1535 = this.aByteArray38[local1527];
					} else {
						local1535 = (byte) local138;
					}
					this.aClass161Array1[local1515] = new Class161(local1523, this.aShortArray45[local1527], this.aShortArray42[local1527], this.aShortArray40[local1527], local1535);
				}
			}
			local1515 = local10.method3922();
			if (local1515 > 0) {
				this.aClass93Array1 = new Class93[local1515];
				for (local1523 = 0; local1523 < local1515; local1523++) {
					local1527 = local10.method3967();
					local1594 = local10.method3967();
					this.aClass93Array1[local1523] = new Class93(local1527, local1594);
				}
			}
		}
		if (!local106) {
			return;
		}
		local1093 = local10.method3922();
		if (local1093 <= 0) {
			return;
		}
		this.aClass208Array1 = new Class208[local1093];
		for (local1515 = 0; local1515 < local1093; local1515++) {
			local1523 = local10.method3967();
			local1527 = local10.method3967();
			local1594 = local10.method3922();
			@Pc(1652) byte local1652 = local10.method3928();
			this.aClass208Array1[local1515] = new Class208(local1523, local1527, local1594, local1652);
		}
		return;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)[[I")
	public int[][] method2309(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(24) int local24 = arg0 ? this.anInt2729 : this.anInt2715;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(33) int local33 = this.anIntArray259[local26];
			if (local33 >= 0) {
				if (local10 < local33) {
					local10 = local33;
				}
				@Pc(51) int local51 = local8[local33]++;
			}
		}
		@Pc(67) int[][] local67 = new int[local10 + 1][];
		for (@Pc(69) int local69 = 0; local69 <= local10; local69++) {
			local67[local69] = new int[local8[local69]];
			local8[local69] = 0;
		}
		for (@Pc(88) int local88 = 0; local88 < local24; local88++) {
			@Pc(95) int local95 = this.anIntArray259[local88];
			if (local95 >= 0) {
				local67[local95][local8[local95]++] = local88;
			}
		}
		return local67;
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(IIII)V")
	public void method2310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg1 != 0) {
			local10 = Class310.anIntArray827[arg1];
			local14 = Class310.anIntArray826[arg1];
			for (local16 = 0; local16 < this.anInt2729; local16++) {
				local34 = this.anIntArray264[local16] * local10 + local14 * this.anIntArray261[local16] >> 14;
				this.anIntArray264[local16] = local14 * this.anIntArray264[local16] - local10 * this.anIntArray261[local16] >> 14;
				this.anIntArray261[local16] = local34;
			}
		}
		if (arg2 != 0) {
			local10 = Class310.anIntArray827[arg2];
			local14 = Class310.anIntArray826[arg2];
			for (local16 = 0; local16 < this.anInt2729; local16++) {
				local34 = local14 * this.anIntArray264[local16] - local10 * this.anIntArray265[local16] >> 14;
				this.anIntArray265[local16] = this.anIntArray264[local16] * local10 + this.anIntArray265[local16] * local14 >> 14;
				this.anIntArray264[local16] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class310.anIntArray827[arg0];
		local14 = Class310.anIntArray826[arg0];
		for (local16 = 0; local16 < this.anInt2729; local16++) {
			local34 = local10 * this.anIntArray265[local16] + this.anIntArray261[local16] * local14 >> 14;
			this.anIntArray265[local16] = this.anIntArray265[local16] * local14 - local10 * this.anIntArray261[local16] >> 14;
			this.anIntArray261[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "([BB)V")
	private void method2313(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub6 local14 = new Class1_Sub6(arg0);
		@Pc(19) Class1_Sub6 local19 = new Class1_Sub6(arg0);
		@Pc(24) Class1_Sub6 local24 = new Class1_Sub6(arg0);
		@Pc(29) Class1_Sub6 local29 = new Class1_Sub6(arg0);
		@Pc(40) Class1_Sub6 local40 = new Class1_Sub6(arg0);
		local14.anInt4555 = arg0.length - 18;
		this.anInt2729 = local14.method3967();
		this.anInt2727 = local14.method3967();
		this.anInt2710 = local14.method3922();
		@Pc(65) int local65 = local14.method3922();
		@Pc(69) int local69 = local14.method3922();
		@Pc(73) int local73 = local14.method3922();
		@Pc(77) int local77 = local14.method3922();
		@Pc(81) int local81 = local14.method3922();
		@Pc(85) int local85 = local14.method3967();
		@Pc(89) int local89 = local14.method3967();
		@Pc(93) int local93 = local14.method3967();
		@Pc(97) int local97 = local14.method3967();
		@Pc(106) int local106 = this.anInt2729;
		@Pc(108) int local108 = local106;
		local106 += this.anInt2727;
		@Pc(115) int local115 = local106;
		if (local69 == 255) {
			local106 += this.anInt2727;
		}
		@Pc(127) int local127 = local106;
		if (local77 == 1) {
			local106 += this.anInt2727;
		}
		@Pc(139) int local139 = local106;
		if (local65 == 1) {
			local106 += this.anInt2727;
		}
		@Pc(151) int local151 = local106;
		if (local81 == 1) {
			local106 += this.anInt2729;
		}
		@Pc(161) int local161 = local106;
		if (local73 == 1) {
			local106 += this.anInt2727;
		}
		@Pc(173) int local173 = local106;
		local106 += local97;
		@Pc(179) int local179 = local106;
		local106 += this.anInt2727 * 2;
		@Pc(188) int local188 = local106;
		local106 += this.anInt2710 * 6;
		@Pc(197) int local197 = local106;
		local106 += local85;
		@Pc(203) int local203 = local106;
		local106 += local89;
		this.aShortArray39 = new short[this.anInt2727];
		this.aShortArray42 = new short[this.anInt2727];
		if (local77 == 1) {
			this.anIntArray258 = new int[this.anInt2727];
		}
		this.anIntArray261 = new int[this.anInt2729];
		this.anIntArray264 = new int[this.anInt2729];
		if (local81 == 1) {
			this.anIntArray259 = new int[this.anInt2729];
		}
		this.anIntArray265 = new int[this.anInt2729];
		if (local73 == 1) {
			this.aByteArray33 = new byte[this.anInt2727];
		}
		if (local65 == 1) {
			this.aByteArray39 = new byte[this.anInt2727];
			this.aByteArray36 = new byte[this.anInt2727];
			this.aShortArray47 = new short[this.anInt2727];
		}
		local14.anInt4555 = 0;
		this.aShortArray40 = new short[this.anInt2727];
		if (local69 == 255) {
			this.aByteArray38 = new byte[this.anInt2727];
		} else {
			this.aByte44 = (byte) local69;
		}
		if (this.anInt2710 > 0) {
			this.aShortArray46 = new short[this.anInt2710];
			this.aShortArray44 = new short[this.anInt2710];
			this.aShortArray38 = new short[this.anInt2710];
			this.aByteArray37 = new byte[this.anInt2710];
		}
		this.aShortArray45 = new short[this.anInt2727];
		local19.anInt4555 = local197;
		local24.anInt4555 = local203;
		local29.anInt4555 = local106;
		local40.anInt4555 = local151;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(362) int local362;
		@Pc(364) int local364;
		for (@Pc(356) int local356 = 0; local356 < this.anInt2729; local356++) {
			local362 = local14.method3922();
			local364 = 0;
			if ((local362 & 0x1) != 0) {
				local364 = local19.method3946();
			}
			@Pc(374) int local374 = 0;
			if ((local362 & 0x2) != 0) {
				local374 = local24.method3946();
			}
			@Pc(384) int local384 = 0;
			if ((local362 & 0x4) != 0) {
				local384 = local29.method3946();
			}
			this.anIntArray261[local356] = local350 + local364;
			this.anIntArray264[local356] = local352 + local374;
			this.anIntArray265[local356] = local384 + local354;
			local350 = this.anIntArray261[local356];
			local354 = this.anIntArray265[local356];
			local352 = this.anIntArray264[local356];
			if (local81 == 1) {
				this.anIntArray259[local356] = local40.method3922();
			}
		}
		local14.anInt4555 = local179;
		local19.anInt4555 = local139;
		local24.anInt4555 = local115;
		local29.anInt4555 = local161;
		local40.anInt4555 = local127;
		for (local362 = 0; local362 < this.anInt2727; local362++) {
			this.aShortArray39[local362] = (short) local14.method3967();
			if (local65 == 1) {
				local364 = local19.method3922();
				if ((local364 & 0x1) == 1) {
					local7 = true;
					this.aByteArray39[local362] = 1;
				} else {
					this.aByteArray39[local362] = 0;
				}
				if ((local364 & 0x2) == 2) {
					this.aByteArray36[local362] = (byte) (local364 >> 2);
					this.aShortArray47[local362] = this.aShortArray39[local362];
					this.aShortArray39[local362] = 127;
					if (this.aShortArray47[local362] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray36[local362] = -1;
					this.aShortArray47[local362] = -1;
				}
			}
			if (local69 == 255) {
				this.aByteArray38[local362] = local24.method3928();
			}
			if (local73 == 1) {
				this.aByteArray33[local362] = local29.method3928();
			}
			if (local77 == 1) {
				this.anIntArray258[local362] = local40.method3922();
			}
		}
		this.anInt2715 = -1;
		local14.anInt4555 = local173;
		local19.anInt4555 = local108;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(617) int local617;
		for (@Pc(611) int local611 = 0; local611 < this.anInt2727; local611++) {
			local617 = local19.method3922();
			if (local617 == 1) {
				local603 = (short) (local609 + local14.method3946());
				local605 = (short) (local14.method3946() + local603);
				local607 = (short) (local605 + local14.method3946());
				local609 = local607;
				this.aShortArray45[local611] = local603;
				this.aShortArray42[local611] = local605;
				this.aShortArray40[local611] = local607;
				if (local603 > this.anInt2715) {
					this.anInt2715 = local603;
				}
				if (this.anInt2715 < local605) {
					this.anInt2715 = local605;
				}
				if (local607 > this.anInt2715) {
					this.anInt2715 = local607;
				}
			}
			if (local617 == 2) {
				local605 = local607;
				local607 = (short) (local609 + local14.method3946());
				local609 = local607;
				this.aShortArray45[local611] = local603;
				this.aShortArray42[local611] = local605;
				this.aShortArray40[local611] = local607;
				if (local607 > this.anInt2715) {
					this.anInt2715 = local607;
				}
			}
			if (local617 == 3) {
				local603 = local607;
				local607 = (short) (local609 + local14.method3946());
				local609 = local607;
				this.aShortArray45[local611] = local603;
				this.aShortArray42[local611] = local605;
				this.aShortArray40[local611] = local607;
				if (local607 > this.anInt2715) {
					this.anInt2715 = local607;
				}
			}
			if (local617 == 4) {
				@Pc(768) short local768 = local603;
				local603 = local605;
				local607 = (short) (local609 + local14.method3946());
				local605 = local768;
				local609 = local607;
				this.aShortArray45[local611] = local603;
				this.aShortArray42[local611] = local768;
				this.aShortArray40[local611] = local607;
				if (local607 > this.anInt2715) {
					this.anInt2715 = local607;
				}
			}
		}
		local14.anInt4555 = local188;
		this.anInt2715++;
		for (local617 = 0; local617 < this.anInt2710; local617++) {
			this.aByteArray37[local617] = 0;
			this.aShortArray38[local617] = (short) local14.method3967();
			this.aShortArray46[local617] = (short) local14.method3967();
			this.aShortArray44[local617] = (short) local14.method3967();
		}
		if (this.aByteArray36 != null) {
			@Pc(864) boolean local864 = false;
			for (@Pc(866) int local866 = 0; local866 < this.anInt2727; local866++) {
				@Pc(875) int local875 = this.aByteArray36[local866] & 0xFF;
				if (local875 != 255) {
					if ((this.aShortArray38[local875] & 0xFFFF) == this.aShortArray45[local866] && this.aShortArray42[local866] == (this.aShortArray46[local875] & 0xFFFF) && (this.aShortArray44[local875] & 0xFFFF) == this.aShortArray40[local866]) {
						this.aByteArray36[local866] = -1;
					} else {
						local864 = true;
					}
				}
			}
			if (!local864) {
				this.aByteArray36 = null;
			}
		}
		if (!local9) {
			this.aShortArray47 = null;
		}
		if (!local7) {
			this.aByteArray39 = null;
		}
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)[[I")
	public int[][] method2314() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2727; local12++) {
			@Pc(19) int local19 = this.anIntArray258[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt2727; local72++) {
			@Pc(79) int local79 = this.anIntArray258[local72];
			if (local79 >= 0) {
				local47[local79][local8[local79]++] = local72;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(SBSSSBISBS)B")
	public byte method2315() {
		if (this.anInt2710 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray37[this.anInt2710] = 3;
		this.aShortArray38[this.anInt2710] = 0;
		this.aShortArray46[this.anInt2710] = 32767;
		this.aShortArray44[this.anInt2710] = 0;
		this.anIntArray266[this.anInt2710] = 1024;
		this.anIntArray267[this.anInt2710] = 1024;
		this.anIntArray260[this.anInt2710] = 1024;
		this.aByteArray34[this.anInt2710] = 0;
		this.aByteArray35[this.anInt2710] = 0;
		this.anIntArray262[this.anInt2710] = 0;
		return (byte) this.anInt2710++;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)[[I")
	public int[][] method2316() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.aClass208Array1.length; local18++) {
			@Pc(26) int local26 = this.aClass208Array1[local18].anInt5959;
			if (local26 >= 0) {
				@Pc(35) int local35 = local8[local26]++;
				if (local26 > local10) {
					local10 = local26;
				}
			}
		}
		@Pc(58) int[][] local58 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local58[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < this.aClass208Array1.length; local79++) {
			@Pc(87) int local87 = this.aClass208Array1[local79].anInt5959;
			if (local87 >= 0) {
				local58[local87][local8[local87]++] = local79;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!fp;SIZ)I")
	private int method2317(@OriginalArg(0) Class97 arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray261[arg2];
		@Pc(15) int local15 = arg0.anIntArray264[arg2];
		@Pc(20) int local20 = arg0.anIntArray265[arg2];
		for (@Pc(31) int local31 = 0; local31 < this.anInt2729; local31++) {
			if (this.anIntArray261[local31] == local10 && local15 == this.anIntArray264[local31] && this.anIntArray265[local31] == local20) {
				this.aShortArray43[local31] |= arg1;
				return local31;
			}
		}
		this.anIntArray261[this.anInt2729] = local10;
		this.anIntArray264[this.anInt2729] = local15;
		this.anIntArray265[this.anInt2729] = local20;
		this.aShortArray43[this.anInt2729] = arg1;
		this.anIntArray259[this.anInt2729] = arg0.anIntArray259 == null ? -1 : arg0.anIntArray259[arg2];
		return this.anInt2729++;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(SSI)V")
	public void method2318(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray47 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2727; local18++) {
			if (this.aShortArray47[local18] == arg0) {
				this.aShortArray47[local18] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZSS)V")
	public void method2319(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2727; local7++) {
			if (this.aShortArray39[local7] == arg0) {
				this.aShortArray39[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)V")
	public void method2320() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2729; local11++) {
			this.anIntArray261[local11] <<= 0x2;
			this.anIntArray264[local11] <<= 0x2;
			this.anIntArray265[local11] <<= 0x2;
		}
		if (this.anInt2710 <= 0 || this.anIntArray266 == null) {
			return;
		}
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray266.length; local54++) {
			this.anIntArray266[local54] <<= 0x2;
			this.anIntArray267[local54] <<= 0x2;
			if (this.aByteArray37[local54] != 1) {
				this.anIntArray260[local54] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ISBIIBBSI)I")
	public int method2321(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) short arg6, @OriginalArg(8) int arg7) {
		this.aShortArray45[this.anInt2727] = (short) arg7;
		this.aShortArray42[this.anInt2727] = (short) arg0;
		this.aShortArray40[this.anInt2727] = (short) arg3;
		this.aByteArray39[this.anInt2727] = arg2;
		this.aByteArray36[this.anInt2727] = arg4;
		this.aShortArray39[this.anInt2727] = arg1;
		this.aByteArray33[this.anInt2727] = arg5;
		this.aShortArray47[this.anInt2727] = arg6;
		return this.anInt2727++;
	}
}
