import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class118 {

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!fu", name = "g", descriptor = "[I")
	public int[] anIntArray165;

	@OriginalMember(owner = "client!fu", name = "h", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "[I")
	public int[] anIntArray166;

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "[I")
	public int[] anIntArray167;

	@OriginalMember(owner = "client!fu", name = "l", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!fu", name = "m", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!fu", name = "s", descriptor = "[I")
	public int[] anIntArray168;

	@OriginalMember(owner = "client!fu", name = "t", descriptor = "[I")
	public int[] anIntArray169;

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!fu", name = "v", descriptor = "[I")
	public int[] anIntArray170;

	@OriginalMember(owner = "client!fu", name = "z", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!fu", name = "B", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!fu", name = "C", descriptor = "[Lclient!qv;")
	public Class284[] aClass284Array2;

	@OriginalMember(owner = "client!fu", name = "E", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!fu", name = "H", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!fu", name = "I", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!fu", name = "J", descriptor = "[Lclient!dd;")
	public Class66[] aClass66Array1;

	@OriginalMember(owner = "client!fu", name = "K", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!fu", name = "M", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!fu", name = "N", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!fu", name = "O", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!fu", name = "P", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!fu", name = "U", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!fu", name = "X", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!fu", name = "Y", descriptor = "[Lclient!vea;")
	public Class353[] aClass353Array2;

	@OriginalMember(owner = "client!fu", name = "Z", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!fu", name = "bb", descriptor = "[I")
	public int[] anIntArray174;

	@OriginalMember(owner = "client!fu", name = "cb", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
	public int anInt3251 = 0;

	@OriginalMember(owner = "client!fu", name = "w", descriptor = "I")
	public int anInt3252 = 0;

	@OriginalMember(owner = "client!fu", name = "y", descriptor = "I")
	public int anInt3254 = 0;

	@OriginalMember(owner = "client!fu", name = "G", descriptor = "I")
	public int anInt3256 = 0;

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
	public int anInt3246 = 12;

	@OriginalMember(owner = "client!fu", name = "A", descriptor = "B")
	public byte aByte43 = 0;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "()V")
	private Class118() {
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "([B)V")
	public Class118(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2923(arg0);
		} else {
			this.method2931(arg0);
		}
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(III)V")
	public Class118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray61 = new short[arg1];
		this.anIntArray165 = new int[arg1];
		this.anIntArray166 = new int[arg0];
		this.aShortArray62 = new short[arg1];
		this.aByteArray43 = new byte[arg1];
		this.aByteArray44 = new byte[arg1];
		this.aShortArray57 = new short[arg1];
		this.aByteArray45 = new byte[arg1];
		this.aShortArray63 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray174 = new int[arg2];
			this.anIntArray167 = new int[arg2];
			this.anIntArray173 = new int[arg2];
			this.aByteArray41 = new byte[arg2];
			this.aByteArray46 = new byte[arg2];
			this.anIntArray172 = new int[arg2];
			this.aShortArray64 = new short[arg2];
			this.anIntArray171 = new int[arg2];
			this.aByteArray42 = new byte[arg2];
			this.anIntArray170 = new int[arg2];
			this.aShortArray59 = new short[arg2];
			this.aShortArray55 = new short[arg2];
		}
		this.anIntArray168 = new int[arg0];
		this.anIntArray164 = new int[arg0];
		this.aByteArray40 = new byte[arg1];
		this.aShortArray60 = new short[arg1];
		this.anIntArray169 = new int[arg0];
	}

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "([Lclient!fu;I)V")
	public Class118(@OriginalArg(0) Class118[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3256 = 0;
		this.anInt3252 = 0;
		this.anInt3254 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte43 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class118 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt3256 += local59.anInt3256;
				this.anInt3252 += local59.anInt3252;
				this.anInt3254 += local59.anInt3254;
				if (local59.aClass353Array2 != null) {
					local34 += local59.aClass353Array2.length;
				}
				if (local59.aClass66Array1 != null) {
					local36 += local59.aClass66Array1.length;
				}
				local38 |= local59.aByteArray40 != null;
				if (local59.aClass284Array2 != null) {
					local32 += local59.aClass284Array2.length;
				}
				local48 |= local59.anIntArray165 != null;
				local46 |= local59.aShortArray62 != null;
				local44 |= local59.aByteArray45 != null;
				local42 |= local59.aByteArray44 != null;
				if (local59.aByteArray43 == null) {
					if (this.aByte43 == -1) {
						this.aByte43 = local59.aByte43;
					}
					if (this.aByte43 != local59.aByte43) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		this.anIntArray166 = new int[this.anInt3256];
		if (local38) {
			this.aByteArray40 = new byte[this.anInt3252];
		}
		this.aShortArray57 = new short[this.anInt3252];
		if (local40) {
			this.aByteArray43 = new byte[this.anInt3252];
		}
		this.anIntArray164 = new int[this.anInt3256];
		if (local46) {
			this.aShortArray62 = new short[this.anInt3252];
		}
		this.aShortArray61 = new short[this.anInt3252];
		this.aShortArray60 = new short[this.anInt3252];
		this.aShortArray63 = new short[this.anInt3252];
		if (this.anInt3254 > 0) {
			this.aShortArray55 = new short[this.anInt3254];
			this.anIntArray172 = new int[this.anInt3254];
			this.aByteArray41 = new byte[this.anInt3254];
			this.aShortArray64 = new short[this.anInt3254];
			this.anIntArray173 = new int[this.anInt3254];
			this.anIntArray170 = new int[this.anInt3254];
			this.aShortArray59 = new short[this.anInt3254];
			this.aByteArray46 = new byte[this.anInt3254];
			this.anIntArray174 = new int[this.anInt3254];
			this.anIntArray171 = new int[this.anInt3254];
			this.anIntArray167 = new int[this.anInt3254];
			this.aByteArray42 = new byte[this.anInt3254];
		}
		if (local48) {
			this.anIntArray165 = new int[this.anInt3252];
		}
		this.anIntArray168 = new int[this.anInt3256];
		this.aShortArray56 = new short[this.anInt3256];
		this.anIntArray169 = new int[this.anInt3256];
		if (local44) {
			this.aByteArray45 = new byte[this.anInt3252];
		}
		if (local36 > 0) {
			this.aClass66Array1 = new Class66[local36];
		}
		this.aShortArray58 = new short[this.anInt3252];
		if (local42) {
			this.aByteArray44 = new byte[this.anInt3252];
		}
		if (local32 > 0) {
			this.aClass284Array2 = new Class284[local32];
		}
		if (local34 > 0) {
			this.aClass353Array2 = new Class353[local34];
		}
		this.anInt3254 = 0;
		this.anInt3256 = 0;
		local36 = 0;
		this.anInt3252 = 0;
		local32 = 0;
		local34 = 0;
		@Pc(610) int local610;
		@Pc(621) int local621;
		for (@Pc(374) int local374 = 0; local374 < arg1; local374++) {
			@Pc(381) short local381 = (short) (0x1 << local374);
			@Pc(385) Class118 local385 = arg0[local374];
			if (local385 != null) {
				@Pc(392) int local392;
				if (local385.aClass66Array1 != null) {
					for (local392 = 0; local392 < local385.aClass66Array1.length; local392++) {
						@Pc(399) Class66 local399 = local385.aClass66Array1[local392];
						this.aClass66Array1[local36++] = local399.method2071(this.anInt3252 + local399.anInt2184);
					}
				}
				for (local392 = 0; local392 < local385.anInt3252; local392++) {
					if (local38 && local385.aByteArray40 != null) {
						this.aByteArray40[this.anInt3252] = local385.aByteArray40[local392];
					}
					if (local40) {
						if (local385.aByteArray43 == null) {
							this.aByteArray43[this.anInt3252] = local385.aByte43;
						} else {
							this.aByteArray43[this.anInt3252] = local385.aByteArray43[local392];
						}
					}
					if (local42 && local385.aByteArray44 != null) {
						this.aByteArray44[this.anInt3252] = local385.aByteArray44[local392];
					}
					if (local46) {
						if (local385.aShortArray62 == null) {
							this.aShortArray62[this.anInt3252] = -1;
						} else {
							this.aShortArray62[this.anInt3252] = local385.aShortArray62[local392];
						}
					}
					if (local48) {
						if (local385.anIntArray165 == null) {
							this.anIntArray165[this.anInt3252] = -1;
						} else {
							this.anIntArray165[this.anInt3252] = local385.anIntArray165[local392];
						}
					}
					this.aShortArray60[this.anInt3252] = (short) this.method2935(local381, local385.aShortArray60[local392], local385);
					this.aShortArray61[this.anInt3252] = (short) this.method2935(local381, local385.aShortArray61[local392], local385);
					this.aShortArray63[this.anInt3252] = (short) this.method2935(local381, local385.aShortArray63[local392], local385);
					this.aShortArray58[this.anInt3252] = local381;
					this.aShortArray57[this.anInt3252] = local385.aShortArray57[local392];
					this.anInt3252++;
				}
				@Pc(597) int local597;
				if (local385.aClass284Array2 != null) {
					for (local597 = 0; local597 < local385.aClass284Array2.length; local597++) {
						local610 = this.method2935(local381, local385.aClass284Array2[local597].anInt8333, local385);
						local621 = this.method2935(local381, local385.aClass284Array2[local597].anInt8326, local385);
						@Pc(632) int local632 = this.method2935(local381, local385.aClass284Array2[local597].anInt8323, local385);
						this.aClass284Array2[local32] = local385.aClass284Array2[local597].method7149(local610, local621, local632);
						local32++;
					}
				}
				if (local385.aClass353Array2 != null) {
					for (local597 = 0; local597 < local385.aClass353Array2.length; local597++) {
						local610 = this.method2935(local381, local385.aClass353Array2[local597].anInt9752, local385);
						this.aClass353Array2[local34] = local385.aClass353Array2[local597].method8350(local610);
						local34++;
					}
				}
			}
		}
		@Pc(702) int local702 = 0;
		this.anInt3251 = this.anInt3256;
		for (@Pc(708) int local708 = 0; local708 < arg1; local708++) {
			@Pc(715) short local715 = (short) (0x1 << local708);
			@Pc(719) Class118 local719 = arg0[local708];
			if (local719 != null) {
				for (local610 = 0; local610 < local719.anInt3252; local610++) {
					if (local44) {
						this.aByteArray45[local702++] = (byte) (local719.aByteArray45 == null || local719.aByteArray45[local610] == -1 ? -1 : local719.aByteArray45[local610] + this.anInt3254);
					}
				}
				for (local621 = 0; local621 < local719.anInt3254; local621++) {
					@Pc(771) byte local771 = this.aByteArray46[this.anInt3254] = local719.aByteArray46[local621];
					if (local771 == 0) {
						this.aShortArray64[this.anInt3254] = (short) this.method2935(local715, local719.aShortArray64[local621], local719);
						this.aShortArray59[this.anInt3254] = (short) this.method2935(local715, local719.aShortArray59[local621], local719);
						this.aShortArray55[this.anInt3254] = (short) this.method2935(local715, local719.aShortArray55[local621], local719);
					}
					if (local771 >= 1 && local771 <= 3) {
						this.aShortArray64[this.anInt3254] = local719.aShortArray64[local621];
						this.aShortArray59[this.anInt3254] = local719.aShortArray59[local621];
						this.aShortArray55[this.anInt3254] = local719.aShortArray55[local621];
						this.anIntArray173[this.anInt3254] = local719.anIntArray173[local621];
						this.anIntArray170[this.anInt3254] = local719.anIntArray170[local621];
						this.anIntArray174[this.anInt3254] = local719.anIntArray174[local621];
						this.aByteArray41[this.anInt3254] = local719.aByteArray41[local621];
						this.aByteArray42[this.anInt3254] = local719.aByteArray42[local621];
						this.anIntArray171[this.anInt3254] = local719.anIntArray171[local621];
					}
					if (local771 == 2) {
						this.anIntArray172[this.anInt3254] = local719.anIntArray172[local621];
						this.anIntArray167[this.anInt3254] = local719.anIntArray167[local621];
					}
					this.anInt3254++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I[B)V")
	private void method2923(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub3 local10 = new Class3_Sub3(arg0);
		@Pc(15) Class3_Sub3 local15 = new Class3_Sub3(arg0);
		@Pc(20) Class3_Sub3 local20 = new Class3_Sub3(arg0);
		@Pc(25) Class3_Sub3 local25 = new Class3_Sub3(arg0);
		@Pc(34) Class3_Sub3 local34 = new Class3_Sub3(arg0);
		@Pc(39) Class3_Sub3 local39 = new Class3_Sub3(arg0);
		@Pc(44) Class3_Sub3 local44 = new Class3_Sub3(arg0);
		local10.anInt4736 = arg0.length - 23;
		this.anInt3256 = local10.method4221();
		this.anInt3252 = local10.method4221();
		this.anInt3254 = local10.method4225();
		@Pc(69) int local69 = local10.method4225();
		@Pc(80) boolean local80 = (local69 & 0x1) == 1;
		@Pc(89) boolean local89 = (local69 & 0x2) == 2;
		@Pc(98) boolean local98 = (local69 & 0x4) == 4;
		@Pc(107) boolean local107 = (local69 & 0x8) == 8;
		if (local107) {
			local10.anInt4736 -= 7;
			this.anInt3246 = local10.method4225();
			local10.anInt4736 += 6;
		}
		@Pc(130) int local130 = local10.method4225();
		@Pc(134) int local134 = local10.method4225();
		@Pc(138) int local138 = local10.method4225();
		@Pc(142) int local142 = local10.method4225();
		@Pc(146) int local146 = local10.method4225();
		@Pc(150) int local150 = local10.method4221();
		@Pc(154) int local154 = local10.method4221();
		@Pc(158) int local158 = local10.method4221();
		@Pc(162) int local162 = local10.method4221();
		@Pc(166) int local166 = local10.method4221();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(188) int local188;
		if (this.anInt3254 > 0) {
			local10.anInt4736 = 0;
			this.aByteArray46 = new byte[this.anInt3254];
			for (local188 = 0; local188 < this.anInt3254; local188++) {
				@Pc(199) byte local199 = this.aByteArray46[local188] = local10.method4254();
				if (local199 == 2) {
					local172++;
				}
				if (local199 >= 1 && local199 <= 3) {
					local170++;
				}
				if (local199 == 0) {
					local168++;
				}
			}
		}
		local188 = this.anInt3254;
		@Pc(227) int local227 = local188;
		local188 += this.anInt3256;
		@Pc(234) int local234 = local188;
		if (local80) {
			local188 += this.anInt3252;
		}
		@Pc(243) int local243 = local188;
		local188 += this.anInt3252;
		@Pc(250) int local250 = local188;
		if (local130 == 255) {
			local188 += this.anInt3252;
		}
		@Pc(262) int local262 = local188;
		if (local138 == 1) {
			local188 += this.anInt3252;
		}
		@Pc(272) int local272 = local188;
		if (local146 == 1) {
			local188 += this.anInt3256;
		}
		@Pc(282) int local282 = local188;
		if (local134 == 1) {
			local188 += this.anInt3252;
		}
		@Pc(294) int local294 = local188;
		local188 += local162;
		@Pc(300) int local300 = local188;
		if (local142 == 1) {
			local188 += this.anInt3252 * 2;
		}
		@Pc(314) int local314 = local188;
		local188 += local166;
		@Pc(320) int local320 = local188;
		local188 += this.anInt3252 * 2;
		@Pc(329) int local329 = local188;
		local188 += local150;
		@Pc(335) int local335 = local188;
		local188 += local154;
		@Pc(341) int local341 = local188;
		local188 += local158;
		@Pc(347) int local347 = local188;
		local188 += local168 * 6;
		@Pc(355) int local355 = local188;
		local188 += local170 * 6;
		@Pc(363) byte local363 = 6;
		if (this.anInt3246 == 14) {
			local363 = 7;
		} else if (this.anInt3246 >= 15) {
			local363 = 9;
		}
		@Pc(383) int local383 = local188;
		local188 += local170 * local363;
		@Pc(391) int local391 = local188;
		local188 += local170;
		@Pc(397) int local397 = local188;
		local188 += local170;
		@Pc(403) int local403 = local188;
		local188 += local172 * 2 + local170;
		this.aShortArray57 = new short[this.anInt3252];
		this.anIntArray169 = new int[this.anInt3256];
		if (local138 == 1) {
			this.anIntArray165 = new int[this.anInt3252];
		}
		this.anIntArray166 = new int[this.anInt3256];
		local10.anInt4736 = local227;
		this.aShortArray61 = new short[this.anInt3252];
		this.anIntArray168 = new int[this.anInt3256];
		if (local130 == 255) {
			this.aByteArray43 = new byte[this.anInt3252];
		} else {
			this.aByte43 = (byte) local130;
		}
		this.aShortArray63 = new short[this.anInt3252];
		if (local146 == 1) {
			this.anIntArray164 = new int[this.anInt3256];
		}
		if (local80) {
			this.aByteArray40 = new byte[this.anInt3252];
		}
		this.aShortArray60 = new short[this.anInt3252];
		if (local142 == 1) {
			this.aShortArray62 = new short[this.anInt3252];
		}
		if (this.anInt3254 > 0) {
			if (local172 > 0) {
				this.anIntArray167 = new int[local172];
				this.anIntArray172 = new int[local172];
			}
			this.aShortArray55 = new short[this.anInt3254];
			if (local170 > 0) {
				this.anIntArray170 = new int[local170];
				this.anIntArray174 = new int[local170];
				this.aByteArray41 = new byte[local170];
				this.anIntArray171 = new int[local170];
				this.aByteArray42 = new byte[local170];
				this.anIntArray173 = new int[local170];
			}
			this.aShortArray59 = new short[this.anInt3254];
			this.aShortArray64 = new short[this.anInt3254];
		}
		if (local134 == 1) {
			this.aByteArray44 = new byte[this.anInt3252];
		}
		if (local142 == 1 && this.anInt3254 > 0) {
			this.aByteArray45 = new byte[this.anInt3252];
		}
		local15.anInt4736 = local329;
		local20.anInt4736 = local335;
		local25.anInt4736 = local341;
		local34.anInt4736 = local272;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(599) int local599 = 0;
		@Pc(607) int local607;
		for (@Pc(601) int local601 = 0; local601 < this.anInt3256; local601++) {
			local607 = local10.method4225();
			@Pc(609) int local609 = 0;
			if ((local607 & 0x1) != 0) {
				local609 = local15.method4264();
			}
			@Pc(619) int local619 = 0;
			if ((local607 & 0x2) != 0) {
				local619 = local20.method4264();
			}
			@Pc(629) int local629 = 0;
			if ((local607 & 0x4) != 0) {
				local629 = local25.method4264();
			}
			this.anIntArray166[local601] = local609 + local595;
			this.anIntArray169[local601] = local619 + local597;
			this.anIntArray168[local601] = local629 + local599;
			local599 = this.anIntArray168[local601];
			local595 = this.anIntArray166[local601];
			local597 = this.anIntArray169[local601];
			if (local146 == 1) {
				this.anIntArray164[local601] = local34.method4225();
			}
		}
		local10.anInt4736 = local320;
		local15.anInt4736 = local234;
		local20.anInt4736 = local250;
		local25.anInt4736 = local282;
		local34.anInt4736 = local262;
		local39.anInt4736 = local300;
		local44.anInt4736 = local314;
		for (local607 = 0; local607 < this.anInt3252; local607++) {
			this.aShortArray57[local607] = (short) local10.method4221();
			if (local80) {
				this.aByteArray40[local607] = local15.method4254();
			}
			if (local130 == 255) {
				this.aByteArray43[local607] = local20.method4254();
			}
			if (local134 == 1) {
				this.aByteArray44[local607] = local25.method4254();
			}
			if (local138 == 1) {
				this.anIntArray165[local607] = local34.method4225();
			}
			if (local142 == 1) {
				this.aShortArray62[local607] = (short) (local39.method4221() - 1);
			}
			if (this.aByteArray45 != null) {
				if (this.aShortArray62[local607] == -1) {
					this.aByteArray45[local607] = -1;
				} else {
					this.aByteArray45[local607] = (byte) (local44.method4225() - 1);
				}
			}
		}
		this.anInt3251 = -1;
		local10.anInt4736 = local294;
		local15.anInt4736 = local243;
		@Pc(828) short local828 = 0;
		@Pc(830) short local830 = 0;
		@Pc(832) short local832 = 0;
		@Pc(834) short local834 = 0;
		@Pc(842) int local842;
		for (@Pc(836) int local836 = 0; local836 < this.anInt3252; local836++) {
			local842 = local15.method4225();
			if (local842 == 1) {
				local828 = (short) (local10.method4264() + local834);
				local830 = (short) (local10.method4264() + local828);
				local832 = (short) (local10.method4264() + local830);
				local834 = local832;
				this.aShortArray60[local836] = local828;
				this.aShortArray61[local836] = local830;
				this.aShortArray63[local836] = local832;
				if (this.anInt3251 < local828) {
					this.anInt3251 = local828;
				}
				if (this.anInt3251 < local830) {
					this.anInt3251 = local830;
				}
				if (local832 > this.anInt3251) {
					this.anInt3251 = local832;
				}
			}
			if (local842 == 2) {
				local830 = local832;
				local832 = (short) (local10.method4264() + local834);
				this.aShortArray60[local836] = local828;
				local834 = local832;
				this.aShortArray61[local836] = local830;
				this.aShortArray63[local836] = local832;
				if (this.anInt3251 < local832) {
					this.anInt3251 = local832;
				}
			}
			if (local842 == 3) {
				local828 = local832;
				local832 = (short) (local10.method4264() + local834);
				this.aShortArray60[local836] = local828;
				local834 = local832;
				this.aShortArray61[local836] = local830;
				this.aShortArray63[local836] = local832;
				if (this.anInt3251 < local832) {
					this.anInt3251 = local832;
				}
			}
			if (local842 == 4) {
				@Pc(999) short local999 = local828;
				local828 = local830;
				local830 = local999;
				local832 = (short) (local834 + local10.method4264());
				local834 = local832;
				this.aShortArray60[local836] = local828;
				this.aShortArray61[local836] = local999;
				this.aShortArray63[local836] = local832;
				if (this.anInt3251 < local832) {
					this.anInt3251 = local832;
				}
			}
		}
		local10.anInt4736 = local347;
		this.anInt3251++;
		local15.anInt4736 = local355;
		local20.anInt4736 = local383;
		local25.anInt4736 = local391;
		local34.anInt4736 = local397;
		local39.anInt4736 = local403;
		@Pc(1074) int local1074;
		for (local842 = 0; local842 < this.anInt3254; local842++) {
			local1074 = this.aByteArray46[local842] & 0xFF;
			if (local1074 == 0) {
				this.aShortArray64[local842] = (short) local10.method4221();
				this.aShortArray59[local842] = (short) local10.method4221();
				this.aShortArray55[local842] = (short) local10.method4221();
			}
			if (local1074 == 1) {
				this.aShortArray64[local842] = (short) local15.method4221();
				this.aShortArray59[local842] = (short) local15.method4221();
				this.aShortArray55[local842] = (short) local15.method4221();
				if (this.anInt3246 < 15) {
					this.anIntArray173[local842] = local20.method4221();
					if (this.anInt3246 >= 14) {
						this.anIntArray170[local842] = local20.method4204();
					} else {
						this.anIntArray170[local842] = local20.method4221();
					}
					this.anIntArray174[local842] = local20.method4221();
				} else {
					this.anIntArray173[local842] = local20.method4204();
					this.anIntArray170[local842] = local20.method4204();
					this.anIntArray174[local842] = local20.method4204();
				}
				this.aByteArray41[local842] = local25.method4254();
				this.aByteArray42[local842] = local34.method4254();
				this.anIntArray171[local842] = local39.method4254();
			}
			if (local1074 == 2) {
				this.aShortArray64[local842] = (short) local15.method4221();
				this.aShortArray59[local842] = (short) local15.method4221();
				this.aShortArray55[local842] = (short) local15.method4221();
				if (this.anInt3246 >= 15) {
					this.anIntArray173[local842] = local20.method4204();
					this.anIntArray170[local842] = local20.method4204();
					this.anIntArray174[local842] = local20.method4204();
				} else {
					this.anIntArray173[local842] = local20.method4221();
					if (this.anInt3246 < 14) {
						this.anIntArray170[local842] = local20.method4221();
					} else {
						this.anIntArray170[local842] = local20.method4204();
					}
					this.anIntArray174[local842] = local20.method4221();
				}
				this.aByteArray41[local842] = local25.method4254();
				this.aByteArray42[local842] = local34.method4254();
				this.anIntArray171[local842] = local39.method4254();
				this.anIntArray172[local842] = local39.method4254();
				this.anIntArray167[local842] = local39.method4254();
			}
			if (local1074 == 3) {
				this.aShortArray64[local842] = (short) local15.method4221();
				this.aShortArray59[local842] = (short) local15.method4221();
				this.aShortArray55[local842] = (short) local15.method4221();
				if (this.anInt3246 >= 15) {
					this.anIntArray173[local842] = local20.method4204();
					this.anIntArray170[local842] = local20.method4204();
					this.anIntArray174[local842] = local20.method4204();
				} else {
					this.anIntArray173[local842] = local20.method4221();
					if (this.anInt3246 < 14) {
						this.anIntArray170[local842] = local20.method4221();
					} else {
						this.anIntArray170[local842] = local20.method4204();
					}
					this.anIntArray174[local842] = local20.method4221();
				}
				this.aByteArray41[local842] = local25.method4254();
				this.aByteArray42[local842] = local34.method4254();
				this.anIntArray171[local842] = local39.method4254();
			}
		}
		local10.anInt4736 = local188;
		@Pc(1483) int local1483;
		@Pc(1489) int local1489;
		@Pc(1493) int local1493;
		@Pc(1560) int local1560;
		if (local89) {
			local1074 = local10.method4225();
			if (local1074 > 0) {
				this.aClass284Array2 = new Class284[local1074];
				for (local1483 = 0; local1483 < local1074; local1483++) {
					local1489 = local10.method4221();
					local1493 = local10.method4221();
					@Pc(1499) byte local1499;
					if (local130 == 255) {
						local1499 = this.aByteArray43[local1493];
					} else {
						local1499 = (byte) local130;
					}
					this.aClass284Array2[local1483] = new Class284(local1489, this.aShortArray60[local1493], this.aShortArray61[local1493], this.aShortArray63[local1493], local1499);
				}
			}
			local1483 = local10.method4225();
			if (local1483 > 0) {
				this.aClass353Array2 = new Class353[local1483];
				for (local1489 = 0; local1489 < local1483; local1489++) {
					local1493 = local10.method4221();
					local1560 = local10.method4221();
					this.aClass353Array2[local1489] = new Class353(local1493, local1560);
				}
			}
		}
		if (!local98) {
			return;
		}
		local1074 = local10.method4225();
		if (local1074 <= 0) {
			return;
		}
		this.aClass66Array1 = new Class66[local1074];
		for (local1483 = 0; local1483 < local1074; local1483++) {
			local1489 = local10.method4221();
			local1493 = local10.method4221();
			local1560 = local10.method4225();
			@Pc(1612) byte local1612 = local10.method4254();
			this.aClass66Array1[local1483] = new Class66(local1489, local1493, local1560, local1612);
		}
		return;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BIII)I")
	public int method2924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt3256; local13++) {
			if (arg1 == this.anIntArray166[local13] && this.anIntArray169[local13] == arg0 && this.anIntArray168[local13] == arg2) {
				return local13;
			}
		}
		this.anIntArray166[this.anInt3256] = arg1;
		this.anIntArray169[this.anInt3256] = arg0;
		this.anIntArray168[this.anInt3256] = arg2;
		this.anInt3251 = this.anInt3256 + 1;
		return this.anInt3256++;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZI)V")
	public void method2926() {
		for (@Pc(18) int local18 = 0; local18 < this.anInt3256; local18++) {
			this.anIntArray166[local18] <<= 0x2;
			this.anIntArray169[local18] <<= 0x2;
			this.anIntArray168[local18] <<= 0x2;
		}
		if (this.anInt3254 <= 0 || this.anIntArray173 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray173.length; local57++) {
			this.anIntArray173[local57] <<= 0x2;
			this.anIntArray170[local57] <<= 0x2;
			if (this.aByteArray46[local57] != 1) {
				this.anIntArray174[local57] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIII)V")
	public void method2927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(36) int local36;
		if (arg2 != 0) {
			local12 = Class21.anIntArray656[arg2];
			local16 = Class21.anIntArray655[arg2];
			for (local18 = 0; local18 < this.anInt3256; local18++) {
				local36 = local12 * this.anIntArray169[local18] + this.anIntArray166[local18] * local16 >> 14;
				this.anIntArray169[local18] = this.anIntArray169[local18] * local16 - this.anIntArray166[local18] * local12 >> 14;
				this.anIntArray166[local18] = local36;
			}
		}
		if (arg1 != 0) {
			local12 = Class21.anIntArray656[arg1];
			local16 = Class21.anIntArray655[arg1];
			for (local18 = 0; local18 < this.anInt3256; local18++) {
				local36 = local16 * this.anIntArray169[local18] - local12 * this.anIntArray168[local18] >> 14;
				this.anIntArray168[local18] = local16 * this.anIntArray168[local18] + this.anIntArray169[local18] * local12 >> 14;
				this.anIntArray169[local18] = local36;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local12 = Class21.anIntArray656[arg0];
		local16 = Class21.anIntArray655[arg0];
		for (local18 = 0; local18 < this.anInt3256; local18++) {
			local36 = this.anIntArray166[local18] * local16 + this.anIntArray168[local18] * local12 >> 14;
			this.anIntArray168[local18] = local16 * this.anIntArray168[local18] - this.anIntArray166[local18] * local12 >> 14;
			this.anIntArray166[local18] = local36;
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(ZI)[[I")
	public int[][] method2928(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt3256 : this.anInt3251;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray164[local20];
			if (local27 >= 0) {
				@Pc(36) int local36 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < local18; local82++) {
			@Pc(89) int local89 = this.anIntArray164[local82];
			if (local89 >= 0) {
				local57[local89][local8[local89]++] = local82;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BSS)V")
	public void method2930(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt3252; local11++) {
			if (this.aShortArray57[local11] == arg1) {
				this.aShortArray57[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I[B)V")
	private void method2931(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub3 local14 = new Class3_Sub3(arg0);
		@Pc(19) Class3_Sub3 local19 = new Class3_Sub3(arg0);
		@Pc(24) Class3_Sub3 local24 = new Class3_Sub3(arg0);
		@Pc(29) Class3_Sub3 local29 = new Class3_Sub3(arg0);
		@Pc(34) Class3_Sub3 local34 = new Class3_Sub3(arg0);
		local14.anInt4736 = arg0.length - 18;
		this.anInt3256 = local14.method4221();
		this.anInt3252 = local14.method4221();
		this.anInt3254 = local14.method4225();
		@Pc(61) int local61 = local14.method4225();
		@Pc(65) int local65 = local14.method4225();
		@Pc(69) int local69 = local14.method4225();
		@Pc(73) int local73 = local14.method4225();
		@Pc(77) int local77 = local14.method4225();
		@Pc(83) int local83 = local14.method4221();
		@Pc(87) int local87 = local14.method4221();
		@Pc(91) int local91 = local14.method4221();
		@Pc(97) int local97 = local14.method4221();
		@Pc(106) int local106 = this.anInt3256;
		@Pc(108) int local108 = local106;
		local106 += this.anInt3252;
		@Pc(115) int local115 = local106;
		if (local65 == 255) {
			local106 += this.anInt3252;
		}
		@Pc(127) int local127 = local106;
		if (local73 == 1) {
			local106 += this.anInt3252;
		}
		@Pc(139) int local139 = local106;
		if (local61 == 1) {
			local106 += this.anInt3252;
		}
		@Pc(149) int local149 = local106;
		if (local77 == 1) {
			local106 += this.anInt3256;
		}
		@Pc(161) int local161 = local106;
		if (local69 == 1) {
			local106 += this.anInt3252;
		}
		@Pc(173) int local173 = local106;
		local106 += local97;
		@Pc(179) int local179 = local106;
		local106 += this.anInt3252 * 2;
		@Pc(188) int local188 = local106;
		local106 += this.anInt3254 * 6;
		@Pc(197) int local197 = local106;
		local106 += local83;
		@Pc(203) int local203 = local106;
		local106 += local87;
		this.anIntArray168 = new int[this.anInt3256];
		if (local69 == 1) {
			this.aByteArray44 = new byte[this.anInt3252];
		}
		this.anIntArray166 = new int[this.anInt3256];
		this.aShortArray61 = new short[this.anInt3252];
		this.aShortArray60 = new short[this.anInt3252];
		if (this.anInt3254 > 0) {
			this.aByteArray46 = new byte[this.anInt3254];
			this.aShortArray59 = new short[this.anInt3254];
			this.aShortArray64 = new short[this.anInt3254];
			this.aShortArray55 = new short[this.anInt3254];
		}
		if (local61 == 1) {
			this.aByteArray40 = new byte[this.anInt3252];
			this.aShortArray62 = new short[this.anInt3252];
			this.aByteArray45 = new byte[this.anInt3252];
		}
		if (local73 == 1) {
			this.anIntArray165 = new int[this.anInt3252];
		}
		this.aShortArray63 = new short[this.anInt3252];
		this.aShortArray57 = new short[this.anInt3252];
		local14.anInt4736 = 0;
		if (local77 == 1) {
			this.anIntArray164 = new int[this.anInt3256];
		}
		this.anIntArray169 = new int[this.anInt3256];
		if (local65 == 255) {
			this.aByteArray43 = new byte[this.anInt3252];
		} else {
			this.aByte43 = (byte) local65;
		}
		local19.anInt4736 = local197;
		local24.anInt4736 = local203;
		local29.anInt4736 = local106;
		local34.anInt4736 = local149;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(360) int local360;
		@Pc(362) int local362;
		for (@Pc(354) int local354 = 0; local354 < this.anInt3256; local354++) {
			local360 = local14.method4225();
			local362 = 0;
			if ((local360 & 0x1) != 0) {
				local362 = local19.method4264();
			}
			@Pc(375) int local375 = 0;
			if ((local360 & 0x2) != 0) {
				local375 = local24.method4264();
			}
			@Pc(385) int local385 = 0;
			if ((local360 & 0x4) != 0) {
				local385 = local29.method4264();
			}
			this.anIntArray166[local354] = local348 + local362;
			this.anIntArray169[local354] = local350 + local375;
			this.anIntArray168[local354] = local352 + local385;
			local348 = this.anIntArray166[local354];
			local352 = this.anIntArray168[local354];
			local350 = this.anIntArray169[local354];
			if (local77 == 1) {
				this.anIntArray164[local354] = local34.method4225();
			}
		}
		local14.anInt4736 = local179;
		local19.anInt4736 = local139;
		local24.anInt4736 = local115;
		local29.anInt4736 = local161;
		local34.anInt4736 = local127;
		for (local360 = 0; local360 < this.anInt3252; local360++) {
			this.aShortArray57[local360] = (short) local14.method4221();
			if (local61 == 1) {
				local362 = local19.method4225();
				if ((local362 & 0x1) == 1) {
					this.aByteArray40[local360] = 1;
					local7 = true;
				} else {
					this.aByteArray40[local360] = 0;
				}
				if ((local362 & 0x2) == 2) {
					this.aByteArray45[local360] = (byte) (local362 >> 2);
					this.aShortArray62[local360] = this.aShortArray57[local360];
					this.aShortArray57[local360] = 127;
					if (this.aShortArray62[local360] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray45[local360] = -1;
					this.aShortArray62[local360] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray43[local360] = local24.method4254();
			}
			if (local69 == 1) {
				this.aByteArray44[local360] = local29.method4254();
			}
			if (local73 == 1) {
				this.anIntArray165[local360] = local34.method4225();
			}
		}
		local14.anInt4736 = local173;
		this.anInt3251 = -1;
		local19.anInt4736 = local108;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(613) short local613 = 0;
		@Pc(621) int local621;
		for (@Pc(615) int local615 = 0; local615 < this.anInt3252; local615++) {
			local621 = local19.method4225();
			if (local621 == 1) {
				local607 = (short) (local613 + local14.method4264());
				local609 = (short) (local607 + local14.method4264());
				local611 = (short) (local14.method4264() + local609);
				this.aShortArray60[local615] = local607;
				local613 = local611;
				this.aShortArray61[local615] = local609;
				this.aShortArray63[local615] = local611;
				if (local607 > this.anInt3251) {
					this.anInt3251 = local607;
				}
				if (local609 > this.anInt3251) {
					this.anInt3251 = local609;
				}
				if (this.anInt3251 < local611) {
					this.anInt3251 = local611;
				}
			}
			if (local621 == 2) {
				local609 = local611;
				local611 = (short) (local613 + local14.method4264());
				this.aShortArray60[local615] = local607;
				local613 = local611;
				this.aShortArray61[local615] = local609;
				this.aShortArray63[local615] = local611;
				if (local611 > this.anInt3251) {
					this.anInt3251 = local611;
				}
			}
			if (local621 == 3) {
				local607 = local611;
				local611 = (short) (local613 + local14.method4264());
				this.aShortArray60[local615] = local607;
				local613 = local611;
				this.aShortArray61[local615] = local609;
				this.aShortArray63[local615] = local611;
				if (local611 > this.anInt3251) {
					this.anInt3251 = local611;
				}
			}
			if (local621 == 4) {
				@Pc(776) short local776 = local607;
				local607 = local609;
				local609 = local776;
				local611 = (short) (local613 + local14.method4264());
				local613 = local611;
				this.aShortArray60[local615] = local607;
				this.aShortArray61[local615] = local776;
				this.aShortArray63[local615] = local611;
				if (local611 > this.anInt3251) {
					this.anInt3251 = local611;
				}
			}
		}
		this.anInt3251++;
		local14.anInt4736 = local188;
		for (local621 = 0; local621 < this.anInt3254; local621++) {
			this.aByteArray46[local621] = 0;
			this.aShortArray64[local621] = (short) local14.method4221();
			this.aShortArray59[local621] = (short) local14.method4221();
			this.aShortArray55[local621] = (short) local14.method4221();
		}
		if (this.aByteArray45 != null) {
			@Pc(880) boolean local880 = false;
			for (@Pc(882) int local882 = 0; local882 < this.anInt3252; local882++) {
				@Pc(891) int local891 = this.aByteArray45[local882] & 0xFF;
				if (local891 != 255) {
					if (this.aShortArray60[local882] == (this.aShortArray64[local891] & 0xFFFF) && (this.aShortArray59[local891] & 0xFFFF) == this.aShortArray61[local882] && this.aShortArray63[local882] == (this.aShortArray55[local891] & 0xFFFF)) {
						this.aByteArray45[local882] = -1;
					} else {
						local880 = true;
					}
				}
			}
			if (!local880) {
				this.aByteArray45 = null;
			}
		}
		if (!local9) {
			this.aShortArray62 = null;
		}
		if (!local7) {
			this.aByteArray40 = null;
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)[[I")
	public int[][] method2932() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3252; local12++) {
			@Pc(19) int local19 = this.anIntArray165[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < this.anInt3252; local75++) {
			@Pc(82) int local82 = this.anIntArray165[local75];
			if (local82 >= 0) {
				local50[local82][local8[local82]++] = local75;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BBBSSIBII)I")
	public int method2933(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) short arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray60[this.anInt3252] = (short) arg4;
		this.aShortArray61[this.anInt3252] = (short) arg7;
		this.aShortArray63[this.anInt3252] = (short) arg6;
		this.aByteArray40[this.anInt3252] = arg0;
		this.aByteArray45[this.anInt3252] = arg5;
		this.aShortArray57[this.anInt3252] = arg3;
		this.aByteArray44[this.anInt3252] = arg1;
		this.aShortArray62[this.anInt3252] = arg2;
		return this.anInt3252++;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(SSZ)V")
	public void method2934(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray62 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt3252; local15++) {
			if (this.aShortArray62[local15] == arg0) {
				this.aShortArray62[local15] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(SZILclient!fu;)I")
	private int method2935(@OriginalArg(0) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class118 arg2) {
		@Pc(10) int local10 = arg2.anIntArray166[arg1];
		@Pc(15) int local15 = arg2.anIntArray169[arg1];
		@Pc(20) int local20 = arg2.anIntArray168[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3256; local22++) {
			if (this.anIntArray166[local22] == local10 && local15 == this.anIntArray169[local22] && this.anIntArray168[local22] == local20) {
				this.aShortArray56[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray166[this.anInt3256] = local10;
		this.anIntArray169[this.anInt3256] = local15;
		this.anIntArray168[this.anInt3256] = local20;
		this.aShortArray56[this.anInt3256] = arg0;
		this.anIntArray164[this.anInt3256] = arg2.anIntArray164 == null ? -1 : arg2.anIntArray164[arg1];
		return this.anInt3256++;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(BBSBSSSSSI)B")
	public byte method2936() {
		if (this.anInt3254 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray46[this.anInt3254] = 3;
		this.aShortArray64[this.anInt3254] = 0;
		this.aShortArray59[this.anInt3254] = 32767;
		this.aShortArray55[this.anInt3254] = 0;
		this.anIntArray173[this.anInt3254] = 1024;
		this.anIntArray170[this.anInt3254] = 1024;
		this.anIntArray174[this.anInt3254] = 1024;
		this.aByteArray41[this.anInt3254] = 0;
		this.aByteArray42[this.anInt3254] = 0;
		this.anIntArray171[this.anInt3254] = 0;
		return (byte) this.anInt3254++;
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(IIII)V")
	public void method2937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(9) int local9 = 0; local9 < this.anInt3256; local9++) {
			this.anIntArray166[local9] += arg0;
			this.anIntArray169[local9] += arg1;
			this.anIntArray168[local9] += arg2;
		}
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)[[I")
	public int[][] method2938() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.aClass66Array1.length; local18++) {
			@Pc(26) int local26 = this.aClass66Array1[local18].anInt2188;
			if (local26 >= 0) {
				@Pc(32) int local32 = local8[local26]++;
				if (local10 < local26) {
					local10 = local26;
				}
			}
		}
		@Pc(55) int[][] local55 = new int[local10 + 1][];
		for (@Pc(57) int local57 = 0; local57 <= local10; local57++) {
			local55[local57] = new int[local8[local57]];
			local8[local57] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.aClass66Array1.length; local80++) {
			@Pc(88) int local88 = this.aClass66Array1[local80].anInt2188;
			if (local88 >= 0) {
				local55[local88][local8[local88]++] = local80;
			}
		}
		return local55;
	}
}
