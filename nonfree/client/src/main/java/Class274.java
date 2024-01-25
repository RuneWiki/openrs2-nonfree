import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class274 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "[B")
	public byte[] aByteArray97;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "[S")
	public short[] aShortArray122;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "[S")
	public short[] aShortArray123;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "[S")
	public short[] aShortArray124;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "[B")
	public byte[] aByteArray98;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "[B")
	public byte[] aByteArray99;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "[B")
	public byte[] aByteArray100;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "[I")
	public int[] anIntArray603;

	@OriginalMember(owner = "client!rf", name = "n", descriptor = "[I")
	public int[] anIntArray604;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "[I")
	public int[] anIntArray605;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "[I")
	public int[] anIntArray606;

	@OriginalMember(owner = "client!rf", name = "q", descriptor = "[I")
	public int[] anIntArray607;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "[S")
	public short[] aShortArray125;

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "[I")
	public int[] anIntArray608;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "[I")
	public int[] anIntArray609;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "[S")
	public short[] aShortArray126;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "[S")
	public short[] aShortArray127;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "[I")
	public int[] anIntArray610;

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "[S")
	public short[] aShortArray128;

	@OriginalMember(owner = "client!rf", name = "K", descriptor = "[Lclient!cp;")
	public Class55[] aClass55Array1;

	@OriginalMember(owner = "client!rf", name = "M", descriptor = "[I")
	public int[] anIntArray611;

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "[S")
	public short[] aShortArray129;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "[B")
	public byte[] aByteArray102;

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "[B")
	public byte[] aByteArray103;

	@OriginalMember(owner = "client!rf", name = "S", descriptor = "[S")
	public short[] aShortArray130;

	@OriginalMember(owner = "client!rf", name = "T", descriptor = "[I")
	public int[] anIntArray612;

	@OriginalMember(owner = "client!rf", name = "U", descriptor = "[Lclient!jq;")
	public Class163[] aClass163Array7;

	@OriginalMember(owner = "client!rf", name = "X", descriptor = "[S")
	public short[] aShortArray131;

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "[Lclient!pp;")
	public Class250[] aClass250Array7;

	@OriginalMember(owner = "client!rf", name = "cb", descriptor = "[I")
	public int[] anIntArray613;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "B")
	public byte aByte85 = 0;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	public int anInt7653 = 0;

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
	public int anInt7662 = 0;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
	public int anInt7656 = 0;

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
	public int anInt7670 = 12;

	@OriginalMember(owner = "client!rf", name = "Z", descriptor = "I")
	public int anInt7672 = 0;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([B)V")
	public Class274(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method6328(arg0);
		} else {
			this.method6343(arg0);
		}
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(III)V")
	public Class274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray102 = new byte[arg1];
		this.aByteArray101 = new byte[arg1];
		this.aByteArray97 = new byte[arg1];
		this.aShortArray131 = new short[arg1];
		this.anIntArray603 = new int[arg0];
		this.aByteArray100 = new byte[arg1];
		this.aShortArray122 = new short[arg1];
		this.anIntArray605 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray98 = new byte[arg2];
			this.anIntArray607 = new int[arg2];
			this.anIntArray613 = new int[arg2];
			this.anIntArray606 = new int[arg2];
			this.aByteArray99 = new byte[arg2];
			this.anIntArray610 = new int[arg2];
			this.anIntArray604 = new int[arg2];
			this.anIntArray611 = new int[arg2];
			this.aByteArray103 = new byte[arg2];
			this.aShortArray124 = new short[arg2];
			this.aShortArray123 = new short[arg2];
			this.aShortArray129 = new short[arg2];
		}
		this.aShortArray125 = new short[arg1];
		this.anIntArray608 = new int[arg0];
		this.anIntArray612 = new int[arg0];
		this.anIntArray609 = new int[arg1];
		this.aShortArray127 = new short[arg1];
		this.aShortArray126 = new short[arg1];
	}

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([Lclient!rf;I)V")
	public Class274(@OriginalArg(0) Class274[] arg0, @OriginalArg(1) int arg1) {
		this.anInt7653 = 0;
		this.anInt7672 = 0;
		this.anInt7656 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte85 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class274 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt7656 += local59.anInt7656;
				this.anInt7653 += local59.anInt7653;
				this.anInt7672 += local59.anInt7672;
				if (local59.aClass250Array7 != null) {
					local34 += local59.aClass250Array7.length;
				}
				if (local59.aClass163Array7 != null) {
					local32 += local59.aClass163Array7.length;
				}
				if (local59.aClass55Array1 != null) {
					local36 += local59.aClass55Array1.length;
				}
				local38 |= local59.aByteArray97 != null;
				local44 |= local59.aByteArray102 != null;
				local48 |= local59.anIntArray609 != null;
				local42 |= local59.aByteArray101 != null;
				local46 |= local59.aShortArray131 != null;
				if (local59.aByteArray100 == null) {
					if (this.aByte85 == -1) {
						this.aByte85 = local59.aByte85;
					}
					if (this.aByte85 != local59.aByte85) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		this.aShortArray125 = new short[this.anInt7656];
		this.anIntArray608 = new int[this.anInt7672];
		this.anIntArray603 = new int[this.anInt7672];
		this.aShortArray126 = new short[this.anInt7656];
		if (local48) {
			this.anIntArray609 = new int[this.anInt7656];
		}
		this.anIntArray612 = new int[this.anInt7672];
		if (local36 > 0) {
			this.aClass55Array1 = new Class55[local36];
		}
		if (local38) {
			this.aByteArray97 = new byte[this.anInt7656];
		}
		this.aShortArray128 = new short[this.anInt7656];
		this.aShortArray122 = new short[this.anInt7656];
		this.aShortArray130 = new short[this.anInt7672];
		if (local34 > 0) {
			this.aClass250Array7 = new Class250[local34];
		}
		if (local44) {
			this.aByteArray102 = new byte[this.anInt7656];
		}
		if (this.anInt7653 > 0) {
			this.anIntArray613 = new int[this.anInt7653];
			this.aByteArray98 = new byte[this.anInt7653];
			this.aByteArray99 = new byte[this.anInt7653];
			this.aShortArray129 = new short[this.anInt7653];
			this.anIntArray606 = new int[this.anInt7653];
			this.anIntArray611 = new int[this.anInt7653];
			this.anIntArray610 = new int[this.anInt7653];
			this.aByteArray103 = new byte[this.anInt7653];
			this.anIntArray607 = new int[this.anInt7653];
			this.aShortArray124 = new short[this.anInt7653];
			this.anIntArray604 = new int[this.anInt7653];
			this.aShortArray123 = new short[this.anInt7653];
		}
		if (local40) {
			this.aByteArray100 = new byte[this.anInt7656];
		}
		if (local42) {
			this.aByteArray101 = new byte[this.anInt7656];
		}
		if (local46) {
			this.aShortArray131 = new short[this.anInt7656];
		}
		this.aShortArray127 = new short[this.anInt7656];
		if (local32 > 0) {
			this.aClass163Array7 = new Class163[local32];
		}
		this.anIntArray605 = new int[this.anInt7672];
		this.anInt7656 = 0;
		local36 = 0;
		local32 = 0;
		this.anInt7672 = 0;
		local34 = 0;
		this.anInt7653 = 0;
		@Pc(611) int local611;
		@Pc(622) int local622;
		for (@Pc(379) int local379 = 0; local379 < arg1; local379++) {
			@Pc(386) short local386 = (short) (0x1 << local379);
			@Pc(390) Class274 local390 = arg0[local379];
			if (local390 != null) {
				@Pc(397) int local397;
				if (local390.aClass55Array1 != null) {
					for (local397 = 0; local397 < local390.aClass55Array1.length; local397++) {
						@Pc(404) Class55 local404 = local390.aClass55Array1[local397];
						this.aClass55Array1[local36++] = local404.method890(local404.anInt1155 + this.anInt7656);
					}
				}
				for (local397 = 0; local397 < local390.anInt7656; local397++) {
					if (local38 && local390.aByteArray97 != null) {
						this.aByteArray97[this.anInt7656] = local390.aByteArray97[local397];
					}
					if (local40) {
						if (local390.aByteArray100 == null) {
							this.aByteArray100[this.anInt7656] = local390.aByte85;
						} else {
							this.aByteArray100[this.anInt7656] = local390.aByteArray100[local397];
						}
					}
					if (local42 && local390.aByteArray101 != null) {
						this.aByteArray101[this.anInt7656] = local390.aByteArray101[local397];
					}
					if (local46) {
						if (local390.aShortArray131 == null) {
							this.aShortArray131[this.anInt7656] = -1;
						} else {
							this.aShortArray131[this.anInt7656] = local390.aShortArray131[local397];
						}
					}
					if (local48) {
						if (local390.anIntArray609 == null) {
							this.anIntArray609[this.anInt7656] = -1;
						} else {
							this.anIntArray609[this.anInt7656] = local390.anIntArray609[local397];
						}
					}
					this.aShortArray122[this.anInt7656] = (short) this.method6341(local390.aShortArray122[local397], local390, local386);
					this.aShortArray126[this.anInt7656] = (short) this.method6341(local390.aShortArray126[local397], local390, local386);
					this.aShortArray125[this.anInt7656] = (short) this.method6341(local390.aShortArray125[local397], local390, local386);
					this.aShortArray128[this.anInt7656] = local386;
					this.aShortArray127[this.anInt7656] = local390.aShortArray127[local397];
					this.anInt7656++;
				}
				@Pc(598) int local598;
				if (local390.aClass163Array7 != null) {
					for (local598 = 0; local598 < local390.aClass163Array7.length; local598++) {
						local611 = this.method6341(local390.aClass163Array7[local598].anInt4049, local390, local386);
						local622 = this.method6341(local390.aClass163Array7[local598].anInt4044, local390, local386);
						@Pc(633) int local633 = this.method6341(local390.aClass163Array7[local598].anInt4045, local390, local386);
						this.aClass163Array7[local32] = local390.aClass163Array7[local598].method3499(local622, local633, local611);
						local32++;
					}
				}
				if (local390.aClass250Array7 != null) {
					for (local598 = 0; local598 < local390.aClass250Array7.length; local598++) {
						local611 = this.method6341(local390.aClass250Array7[local598].anInt6989, local390, local386);
						this.aClass250Array7[local34] = local390.aClass250Array7[local598].method5828(local611);
						local34++;
					}
				}
			}
		}
		@Pc(703) int local703 = 0;
		this.anInt7662 = this.anInt7672;
		for (@Pc(709) int local709 = 0; local709 < arg1; local709++) {
			@Pc(716) short local716 = (short) (0x1 << local709);
			@Pc(720) Class274 local720 = arg0[local709];
			if (local720 != null) {
				for (local611 = 0; local611 < local720.anInt7656; local611++) {
					if (local44) {
						this.aByteArray102[local703++] = (byte) (local720.aByteArray102 == null || local720.aByteArray102[local611] == -1 ? -1 : local720.aByteArray102[local611] + this.anInt7653);
					}
				}
				for (local622 = 0; local622 < local720.anInt7653; local622++) {
					@Pc(776) byte local776 = this.aByteArray99[this.anInt7653] = local720.aByteArray99[local622];
					if (local776 == 0) {
						this.aShortArray123[this.anInt7653] = (short) this.method6341(local720.aShortArray123[local622], local720, local716);
						this.aShortArray129[this.anInt7653] = (short) this.method6341(local720.aShortArray129[local622], local720, local716);
						this.aShortArray124[this.anInt7653] = (short) this.method6341(local720.aShortArray124[local622], local720, local716);
					}
					if (local776 >= 1 && local776 <= 3) {
						this.aShortArray123[this.anInt7653] = local720.aShortArray123[local622];
						this.aShortArray129[this.anInt7653] = local720.aShortArray129[local622];
						this.aShortArray124[this.anInt7653] = local720.aShortArray124[local622];
						this.anIntArray610[this.anInt7653] = local720.anIntArray610[local622];
						this.anIntArray611[this.anInt7653] = local720.anIntArray611[local622];
						this.anIntArray606[this.anInt7653] = local720.anIntArray606[local622];
						this.aByteArray98[this.anInt7653] = local720.aByteArray98[local622];
						this.aByteArray103[this.anInt7653] = local720.aByteArray103[local622];
						this.anIntArray607[this.anInt7653] = local720.anIntArray607[local622];
					}
					if (local776 == 2) {
						this.anIntArray613[this.anInt7653] = local720.anIntArray613[local622];
						this.anIntArray604[this.anInt7653] = local720.anIntArray604[local622];
					}
					this.anInt7653++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIII)V")
	public void method6327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg0 != 0) {
			local14 = Class138.anIntArray392[arg0];
			local18 = Class138.anIntArray393[arg0];
			for (local20 = 0; local20 < this.anInt7672; local20++) {
				local38 = this.anIntArray603[local20] * local14 + this.anIntArray612[local20] * local18 >> 14;
				this.anIntArray603[local20] = local18 * this.anIntArray603[local20] - this.anIntArray612[local20] * local14 >> 14;
				this.anIntArray612[local20] = local38;
			}
		}
		if (arg2 != 0) {
			local14 = Class138.anIntArray392[arg2];
			local18 = Class138.anIntArray393[arg2];
			for (local20 = 0; local20 < this.anInt7672; local20++) {
				local38 = this.anIntArray603[local20] * local18 - this.anIntArray605[local20] * local14 >> 14;
				this.anIntArray605[local20] = this.anIntArray605[local20] * local18 + this.anIntArray603[local20] * local14 >> 14;
				this.anIntArray603[local20] = local38;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local14 = Class138.anIntArray392[arg1];
		local18 = Class138.anIntArray393[arg1];
		for (local20 = 0; local20 < this.anInt7672; local20++) {
			local38 = local18 * this.anIntArray612[local20] + local14 * this.anIntArray605[local20] >> 14;
			this.anIntArray605[local20] = local18 * this.anIntArray605[local20] - local14 * this.anIntArray612[local20] >> 14;
			this.anIntArray612[local20] = local38;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "([BI)V")
	private void method6328(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub14 local10 = new Class6_Sub14(arg0);
		@Pc(15) Class6_Sub14 local15 = new Class6_Sub14(arg0);
		@Pc(20) Class6_Sub14 local20 = new Class6_Sub14(arg0);
		@Pc(25) Class6_Sub14 local25 = new Class6_Sub14(arg0);
		@Pc(30) Class6_Sub14 local30 = new Class6_Sub14(arg0);
		@Pc(35) Class6_Sub14 local35 = new Class6_Sub14(arg0);
		@Pc(40) Class6_Sub14 local40 = new Class6_Sub14(arg0);
		local10.anInt7244 = arg0.length - 23;
		this.anInt7672 = local10.method6006();
		this.anInt7656 = local10.method6006();
		this.anInt7653 = local10.method6041();
		@Pc(65) int local65 = local10.method6041();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(107) boolean local107 = (local65 & 0x8) == 8;
		if (local107) {
			local10.anInt7244 -= 7;
			this.anInt7670 = local10.method6041();
			local10.anInt7244 += 6;
		}
		@Pc(130) int local130 = local10.method6041();
		@Pc(134) int local134 = local10.method6041();
		@Pc(138) int local138 = local10.method6041();
		@Pc(142) int local142 = local10.method6041();
		@Pc(146) int local146 = local10.method6041();
		@Pc(150) int local150 = local10.method6006();
		@Pc(154) int local154 = local10.method6006();
		@Pc(158) int local158 = local10.method6006();
		@Pc(162) int local162 = local10.method6006();
		@Pc(166) int local166 = local10.method6006();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(185) int local185;
		if (this.anInt7653 > 0) {
			local10.anInt7244 = 0;
			this.aByteArray99 = new byte[this.anInt7653];
			for (local185 = 0; local185 < this.anInt7653; local185++) {
				@Pc(196) byte local196 = this.aByteArray99[local185] = local10.method6034();
				if (local196 == 2) {
					local172++;
				}
				if (local196 == 0) {
					local168++;
				}
				if (local196 >= 1 && local196 <= 3) {
					local170++;
				}
			}
		}
		local185 = this.anInt7653;
		@Pc(222) int local222 = local185;
		local185 += this.anInt7672;
		@Pc(229) int local229 = local185;
		if (local74) {
			local185 += this.anInt7656;
		}
		@Pc(238) int local238 = local185;
		local185 += this.anInt7656;
		@Pc(245) int local245 = local185;
		if (local130 == 255) {
			local185 += this.anInt7656;
		}
		@Pc(257) int local257 = local185;
		if (local138 == 1) {
			local185 += this.anInt7656;
		}
		@Pc(269) int local269 = local185;
		if (local146 == 1) {
			local185 += this.anInt7672;
		}
		@Pc(279) int local279 = local185;
		if (local134 == 1) {
			local185 += this.anInt7656;
		}
		@Pc(289) int local289 = local185;
		local185 += local162;
		@Pc(295) int local295 = local185;
		if (local142 == 1) {
			local185 += this.anInt7656 * 2;
		}
		@Pc(309) int local309 = local185;
		local185 += local166;
		@Pc(315) int local315 = local185;
		local185 += this.anInt7656 * 2;
		@Pc(324) int local324 = local185;
		local185 += local150;
		@Pc(330) int local330 = local185;
		local185 += local154;
		@Pc(336) int local336 = local185;
		local185 += local158;
		@Pc(342) int local342 = local185;
		local185 += local168 * 6;
		@Pc(350) int local350 = local185;
		local185 += local170 * 6;
		@Pc(358) byte local358 = 6;
		if (this.anInt7670 == 14) {
			local358 = 7;
		} else if (this.anInt7670 >= 15) {
			local358 = 9;
		}
		@Pc(376) int local376 = local185;
		local185 += local358 * local170;
		@Pc(384) int local384 = local185;
		local185 += local170;
		@Pc(390) int local390 = local185;
		local185 += local170;
		@Pc(396) int local396 = local185;
		local185 += local172 * 2 + local170;
		if (local74) {
			this.aByteArray97 = new byte[this.anInt7656];
		}
		this.aShortArray122 = new short[this.anInt7656];
		local10.anInt7244 = local222;
		if (local138 == 1) {
			this.anIntArray609 = new int[this.anInt7656];
		}
		if (local130 == 255) {
			this.aByteArray100 = new byte[this.anInt7656];
		} else {
			this.aByte85 = (byte) local130;
		}
		this.aShortArray126 = new short[this.anInt7656];
		this.anIntArray612 = new int[this.anInt7672];
		if (local134 == 1) {
			this.aByteArray101 = new byte[this.anInt7656];
		}
		this.anIntArray603 = new int[this.anInt7672];
		if (local146 == 1) {
			this.anIntArray608 = new int[this.anInt7672];
		}
		this.aShortArray127 = new short[this.anInt7656];
		this.anIntArray605 = new int[this.anInt7672];
		if (this.anInt7653 > 0) {
			this.aShortArray123 = new short[this.anInt7653];
			if (local172 > 0) {
				this.anIntArray604 = new int[local172];
				this.anIntArray613 = new int[local172];
			}
			if (local170 > 0) {
				this.anIntArray607 = new int[local170];
				this.anIntArray606 = new int[local170];
				this.aByteArray103 = new byte[local170];
				this.aByteArray98 = new byte[local170];
				this.anIntArray610 = new int[local170];
				this.anIntArray611 = new int[local170];
			}
			this.aShortArray129 = new short[this.anInt7653];
			this.aShortArray124 = new short[this.anInt7653];
		}
		if (local142 == 1 && this.anInt7653 > 0) {
			this.aByteArray102 = new byte[this.anInt7656];
		}
		this.aShortArray125 = new short[this.anInt7656];
		if (local142 == 1) {
			this.aShortArray131 = new short[this.anInt7656];
		}
		local15.anInt7244 = local324;
		local20.anInt7244 = local330;
		local25.anInt7244 = local336;
		local30.anInt7244 = local269;
		@Pc(591) int local591 = 0;
		@Pc(593) int local593 = 0;
		@Pc(595) int local595 = 0;
		@Pc(603) int local603;
		for (@Pc(597) int local597 = 0; local597 < this.anInt7672; local597++) {
			local603 = local10.method6041();
			@Pc(605) int local605 = 0;
			if ((local603 & 0x1) != 0) {
				local605 = local15.method6015();
			}
			@Pc(615) int local615 = 0;
			if ((local603 & 0x2) != 0) {
				local615 = local20.method6015();
			}
			@Pc(628) int local628 = 0;
			if ((local603 & 0x4) != 0) {
				local628 = local25.method6015();
			}
			this.anIntArray612[local597] = local591 + local605;
			this.anIntArray603[local597] = local593 + local615;
			this.anIntArray605[local597] = local628 + local595;
			local593 = this.anIntArray603[local597];
			local591 = this.anIntArray612[local597];
			local595 = this.anIntArray605[local597];
			if (local146 == 1) {
				this.anIntArray608[local597] = local30.method6041();
			}
		}
		local10.anInt7244 = local315;
		local15.anInt7244 = local229;
		local20.anInt7244 = local245;
		local25.anInt7244 = local279;
		local30.anInt7244 = local257;
		local35.anInt7244 = local295;
		local40.anInt7244 = local309;
		for (local603 = 0; local603 < this.anInt7656; local603++) {
			this.aShortArray127[local603] = (short) local10.method6006();
			if (local74) {
				this.aByteArray97[local603] = local15.method6034();
			}
			if (local130 == 255) {
				this.aByteArray100[local603] = local20.method6034();
			}
			if (local134 == 1) {
				this.aByteArray101[local603] = local25.method6034();
			}
			if (local138 == 1) {
				this.anIntArray609[local603] = local30.method6041();
			}
			if (local142 == 1) {
				this.aShortArray131[local603] = (short) (local35.method6006() - 1);
			}
			if (this.aByteArray102 != null) {
				if (this.aShortArray131[local603] == -1) {
					this.aByteArray102[local603] = -1;
				} else {
					this.aByteArray102[local603] = (byte) (local40.method6041() - 1);
				}
			}
		}
		this.anInt7662 = -1;
		local10.anInt7244 = local289;
		local15.anInt7244 = local238;
		@Pc(826) short local826 = 0;
		@Pc(828) short local828 = 0;
		@Pc(830) short local830 = 0;
		@Pc(832) short local832 = 0;
		@Pc(840) int local840;
		for (@Pc(834) int local834 = 0; local834 < this.anInt7656; local834++) {
			local840 = local15.method6041();
			if (local840 == 1) {
				local826 = (short) (local832 + local10.method6015());
				local828 = (short) (local10.method6015() + local826);
				local830 = (short) (local10.method6015() + local828);
				local832 = local830;
				this.aShortArray122[local834] = local826;
				this.aShortArray126[local834] = local828;
				this.aShortArray125[local834] = local830;
				if (local826 > this.anInt7662) {
					this.anInt7662 = local826;
				}
				if (this.anInt7662 < local828) {
					this.anInt7662 = local828;
				}
				if (this.anInt7662 < local830) {
					this.anInt7662 = local830;
				}
			}
			if (local840 == 2) {
				local828 = local830;
				local830 = (short) (local832 + local10.method6015());
				this.aShortArray122[local834] = local826;
				local832 = local830;
				this.aShortArray126[local834] = local828;
				this.aShortArray125[local834] = local830;
				if (local830 > this.anInt7662) {
					this.anInt7662 = local830;
				}
			}
			if (local840 == 3) {
				local826 = local830;
				local830 = (short) (local832 + local10.method6015());
				this.aShortArray122[local834] = local826;
				local832 = local830;
				this.aShortArray126[local834] = local828;
				this.aShortArray125[local834] = local830;
				if (this.anInt7662 < local830) {
					this.anInt7662 = local830;
				}
			}
			if (local840 == 4) {
				@Pc(1005) short local1005 = local826;
				local826 = local828;
				local828 = local1005;
				local830 = (short) (local832 + local10.method6015());
				this.aShortArray122[local834] = local826;
				local832 = local830;
				this.aShortArray126[local834] = local1005;
				this.aShortArray125[local834] = local830;
				if (this.anInt7662 < local830) {
					this.anInt7662 = local830;
				}
			}
		}
		local10.anInt7244 = local342;
		this.anInt7662++;
		local15.anInt7244 = local350;
		local20.anInt7244 = local376;
		local25.anInt7244 = local384;
		local30.anInt7244 = local390;
		local35.anInt7244 = local396;
		@Pc(1082) int local1082;
		for (local840 = 0; local840 < this.anInt7653; local840++) {
			local1082 = this.aByteArray99[local840] & 0xFF;
			if (local1082 == 0) {
				this.aShortArray123[local840] = (short) local10.method6006();
				this.aShortArray129[local840] = (short) local10.method6006();
				this.aShortArray124[local840] = (short) local10.method6006();
			}
			if (local1082 == 1) {
				this.aShortArray123[local840] = (short) local15.method6006();
				this.aShortArray129[local840] = (short) local15.method6006();
				this.aShortArray124[local840] = (short) local15.method6006();
				if (this.anInt7670 < 15) {
					this.anIntArray610[local840] = local20.method6006();
					if (this.anInt7670 < 14) {
						this.anIntArray611[local840] = local20.method6006();
					} else {
						this.anIntArray611[local840] = local20.method5988();
					}
					this.anIntArray606[local840] = local20.method6006();
				} else {
					this.anIntArray610[local840] = local20.method5988();
					this.anIntArray611[local840] = local20.method5988();
					this.anIntArray606[local840] = local20.method5988();
				}
				this.aByteArray98[local840] = local25.method6034();
				this.aByteArray103[local840] = local30.method6034();
				this.anIntArray607[local840] = local35.method6034();
			}
			if (local1082 == 2) {
				this.aShortArray123[local840] = (short) local15.method6006();
				this.aShortArray129[local840] = (short) local15.method6006();
				this.aShortArray124[local840] = (short) local15.method6006();
				if (this.anInt7670 < 15) {
					this.anIntArray610[local840] = local20.method6006();
					if (this.anInt7670 < 14) {
						this.anIntArray611[local840] = local20.method6006();
					} else {
						this.anIntArray611[local840] = local20.method5988();
					}
					this.anIntArray606[local840] = local20.method6006();
				} else {
					this.anIntArray610[local840] = local20.method5988();
					this.anIntArray611[local840] = local20.method5988();
					this.anIntArray606[local840] = local20.method5988();
				}
				this.aByteArray98[local840] = local25.method6034();
				this.aByteArray103[local840] = local30.method6034();
				this.anIntArray607[local840] = local35.method6034();
				this.anIntArray613[local840] = local35.method6034();
				this.anIntArray604[local840] = local35.method6034();
			}
			if (local1082 == 3) {
				this.aShortArray123[local840] = (short) local15.method6006();
				this.aShortArray129[local840] = (short) local15.method6006();
				this.aShortArray124[local840] = (short) local15.method6006();
				if (this.anInt7670 >= 15) {
					this.anIntArray610[local840] = local20.method5988();
					this.anIntArray611[local840] = local20.method5988();
					this.anIntArray606[local840] = local20.method5988();
				} else {
					this.anIntArray610[local840] = local20.method6006();
					if (this.anInt7670 < 14) {
						this.anIntArray611[local840] = local20.method6006();
					} else {
						this.anIntArray611[local840] = local20.method5988();
					}
					this.anIntArray606[local840] = local20.method6006();
				}
				this.aByteArray98[local840] = local25.method6034();
				this.aByteArray103[local840] = local30.method6034();
				this.anIntArray607[local840] = local35.method6034();
			}
		}
		local10.anInt7244 = local185;
		@Pc(1490) int local1490;
		@Pc(1496) int local1496;
		@Pc(1500) int local1500;
		@Pc(1566) int local1566;
		if (local85) {
			local1082 = local10.method6041();
			if (local1082 > 0) {
				this.aClass163Array7 = new Class163[local1082];
				for (local1490 = 0; local1490 < local1082; local1490++) {
					local1496 = local10.method6006();
					local1500 = local10.method6006();
					@Pc(1510) byte local1510;
					if (local130 == 255) {
						local1510 = this.aByteArray100[local1500];
					} else {
						local1510 = (byte) local130;
					}
					this.aClass163Array7[local1490] = new Class163(local1496, this.aShortArray122[local1500], this.aShortArray126[local1500], this.aShortArray125[local1500], local1510);
				}
			}
			local1490 = local10.method6041();
			if (local1490 > 0) {
				this.aClass250Array7 = new Class250[local1490];
				for (local1496 = 0; local1496 < local1490; local1496++) {
					local1500 = local10.method6006();
					local1566 = local10.method6006();
					this.aClass250Array7[local1496] = new Class250(local1500, local1566);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1082 = local10.method6041();
		if (local1082 <= 0) {
			return;
		}
		this.aClass55Array1 = new Class55[local1082];
		for (local1490 = 0; local1490 < local1082; local1490++) {
			local1496 = local10.method6006();
			local1500 = local10.method6006();
			local1566 = local10.method6041();
			@Pc(1615) byte local1615 = local10.method6034();
			this.aClass55Array1[local1490] = new Class55(local1496, local1500, local1566, local1615);
		}
		return;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBII)V")
	public void method6329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7672; local3++) {
			this.anIntArray612[local3] += arg1;
			this.anIntArray603[local3] += arg0;
			this.anIntArray605[local3] += arg2;
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IZ)[[I")
	public int[][] method6331(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt7672 : this.anInt7662;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray608[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local27 > local10) {
					local10 = local27;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(84) int local84 = 0; local84 < local18; local84++) {
			@Pc(91) int local91 = this.anIntArray608[local84];
			if (local91 >= 0) {
				local54[local91][local8[local91]++] = local84;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(SBS)V")
	public void method6332(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(16) int local16 = 0; local16 < this.anInt7656; local16++) {
			if (this.aShortArray127[local16] == arg1) {
				this.aShortArray127[local16] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(SSZ)V")
	public void method6333(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray131 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt7656; local17++) {
			if (arg1 == this.aShortArray131[local17]) {
				this.aShortArray131[local17] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BSISSBSBSS)B")
	public byte method6334() {
		if (this.anInt7653 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray99[this.anInt7653] = 3;
		this.aShortArray123[this.anInt7653] = 0;
		this.aShortArray129[this.anInt7653] = 32767;
		this.aShortArray124[this.anInt7653] = 0;
		this.anIntArray610[this.anInt7653] = 1024;
		this.anIntArray611[this.anInt7653] = 1024;
		this.anIntArray606[this.anInt7653] = 1024;
		this.aByteArray98[this.anInt7653] = 0;
		this.aByteArray103[this.anInt7653] = 0;
		this.anIntArray607[this.anInt7653] = 0;
		return (byte) this.anInt7653++;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)V")
	public void method6335() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7672; local3++) {
			this.anIntArray612[local3] <<= 0x2;
			this.anIntArray603[local3] <<= 0x2;
			this.anIntArray605[local3] <<= 0x2;
		}
		if (this.anInt7653 <= 0 || this.anIntArray610 == null) {
			return;
		}
		for (@Pc(60) int local60 = 0; local60 < this.anIntArray610.length; local60++) {
			this.anIntArray610[local60] <<= 0x2;
			this.anIntArray611[local60] <<= 0x2;
			if (this.aByteArray99[local60] != 1) {
				this.anIntArray606[local60] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IBII)I")
	public int method6336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt7672; local12++) {
			if (arg2 == this.anIntArray612[local12] && arg0 == this.anIntArray603[local12] && arg1 == this.anIntArray605[local12]) {
				return local12;
			}
		}
		this.anIntArray612[this.anInt7672] = arg2;
		this.anIntArray603[this.anInt7672] = arg0;
		this.anIntArray605[this.anInt7672] = arg1;
		this.anInt7662 = this.anInt7672 + 1;
		return this.anInt7672++;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BSIBSIBBI)I")
	public int method6339(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray122[this.anInt7656] = (short) arg4;
		this.aShortArray126[this.anInt7656] = (short) arg2;
		this.aShortArray125[this.anInt7656] = (short) arg7;
		this.aByteArray97[this.anInt7656] = arg6;
		this.aByteArray102[this.anInt7656] = arg0;
		this.aShortArray127[this.anInt7656] = arg1;
		this.aByteArray101[this.anInt7656] = arg5;
		this.aShortArray131[this.anInt7656] = arg3;
		return this.anInt7656++;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)[[I")
	public int[][] method6340() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass55Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass55Array1[local12].anInt1148;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(31) int local31 = local8[local20]++;
			}
		}
		@Pc(49) int[][] local49 = new int[local10 + 1][];
		for (@Pc(51) int local51 = 0; local51 <= local10; local51++) {
			local49[local51] = new int[local8[local51]];
			local8[local51] = 0;
		}
		for (@Pc(70) int local70 = 0; local70 < this.aClass55Array1.length; local70++) {
			@Pc(78) int local78 = this.aClass55Array1[local70].anInt1148;
			if (local78 >= 0) {
				local49[local78][local8[local78]++] = local70;
			}
		}
		return local49;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!rf;BS)I")
	private int method6341(@OriginalArg(0) int arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray612[arg0];
		@Pc(15) int local15 = arg1.anIntArray603[arg0];
		@Pc(28) int local28 = arg1.anIntArray605[arg0];
		for (@Pc(30) int local30 = 0; local30 < this.anInt7672; local30++) {
			if (local10 == this.anIntArray612[local30] && this.anIntArray603[local30] == local15 && local28 == this.anIntArray605[local30]) {
				this.aShortArray130[local30] |= arg2;
				return local30;
			}
		}
		this.anIntArray612[this.anInt7672] = local10;
		this.anIntArray603[this.anInt7672] = local15;
		this.anIntArray605[this.anInt7672] = local28;
		this.aShortArray130[this.anInt7672] = arg2;
		this.anIntArray608[this.anInt7672] = arg1.anIntArray608 == null ? -1 : arg1.anIntArray608[arg0];
		return this.anInt7672++;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "([BI)V")
	private void method6343(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub14 local14 = new Class6_Sub14(arg0);
		@Pc(19) Class6_Sub14 local19 = new Class6_Sub14(arg0);
		@Pc(24) Class6_Sub14 local24 = new Class6_Sub14(arg0);
		@Pc(29) Class6_Sub14 local29 = new Class6_Sub14(arg0);
		@Pc(34) Class6_Sub14 local34 = new Class6_Sub14(arg0);
		local14.anInt7244 = arg0.length - 18;
		this.anInt7672 = local14.method6006();
		this.anInt7656 = local14.method6006();
		this.anInt7653 = local14.method6041();
		@Pc(59) int local59 = local14.method6041();
		@Pc(63) int local63 = local14.method6041();
		@Pc(67) int local67 = local14.method6041();
		@Pc(71) int local71 = local14.method6041();
		@Pc(75) int local75 = local14.method6041();
		@Pc(86) int local86 = local14.method6006();
		@Pc(90) int local90 = local14.method6006();
		@Pc(94) int local94 = local14.method6006();
		@Pc(98) int local98 = local14.method6006();
		@Pc(107) int local107 = this.anInt7672;
		@Pc(109) int local109 = local107;
		local107 += this.anInt7656;
		@Pc(116) int local116 = local107;
		if (local63 == 255) {
			local107 += this.anInt7656;
		}
		@Pc(126) int local126 = local107;
		if (local71 == 1) {
			local107 += this.anInt7656;
		}
		@Pc(136) int local136 = local107;
		if (local59 == 1) {
			local107 += this.anInt7656;
		}
		@Pc(146) int local146 = local107;
		if (local75 == 1) {
			local107 += this.anInt7672;
		}
		@Pc(158) int local158 = local107;
		if (local67 == 1) {
			local107 += this.anInt7656;
		}
		@Pc(170) int local170 = local107;
		local107 += local98;
		@Pc(176) int local176 = local107;
		local107 += this.anInt7656 * 2;
		@Pc(185) int local185 = local107;
		local107 += this.anInt7653 * 6;
		@Pc(194) int local194 = local107;
		local107 += local86;
		@Pc(200) int local200 = local107;
		local107 += local90;
		this.anIntArray612 = new int[this.anInt7672];
		this.aShortArray126 = new short[this.anInt7656];
		if (local63 == 255) {
			this.aByteArray100 = new byte[this.anInt7656];
		} else {
			this.aByte85 = (byte) local63;
		}
		local14.anInt7244 = 0;
		this.anIntArray605 = new int[this.anInt7672];
		if (local75 == 1) {
			this.anIntArray608 = new int[this.anInt7672];
		}
		this.aShortArray122 = new short[this.anInt7656];
		if (local71 == 1) {
			this.anIntArray609 = new int[this.anInt7656];
		}
		this.anIntArray603 = new int[this.anInt7672];
		if (this.anInt7653 > 0) {
			this.aShortArray124 = new short[this.anInt7653];
			this.aShortArray129 = new short[this.anInt7653];
			this.aByteArray99 = new byte[this.anInt7653];
			this.aShortArray123 = new short[this.anInt7653];
		}
		this.aShortArray127 = new short[this.anInt7656];
		if (local59 == 1) {
			this.aShortArray131 = new short[this.anInt7656];
			this.aByteArray97 = new byte[this.anInt7656];
			this.aByteArray102 = new byte[this.anInt7656];
		}
		this.aShortArray125 = new short[this.anInt7656];
		if (local67 == 1) {
			this.aByteArray101 = new byte[this.anInt7656];
		}
		local19.anInt7244 = local194;
		local24.anInt7244 = local200;
		local29.anInt7244 = local107;
		local34.anInt7244 = local146;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(356) int local356 = 0;
		@Pc(364) int local364;
		@Pc(366) int local366;
		for (@Pc(358) int local358 = 0; local358 < this.anInt7672; local358++) {
			local364 = local14.method6041();
			local366 = 0;
			if ((local364 & 0x1) != 0) {
				local366 = local19.method6015();
			}
			@Pc(379) int local379 = 0;
			if ((local364 & 0x2) != 0) {
				local379 = local24.method6015();
			}
			@Pc(389) int local389 = 0;
			if ((local364 & 0x4) != 0) {
				local389 = local29.method6015();
			}
			this.anIntArray612[local358] = local352 + local366;
			this.anIntArray603[local358] = local379 + local354;
			this.anIntArray605[local358] = local356 + local389;
			local352 = this.anIntArray612[local358];
			local356 = this.anIntArray605[local358];
			local354 = this.anIntArray603[local358];
			if (local75 == 1) {
				this.anIntArray608[local358] = local34.method6041();
			}
		}
		local14.anInt7244 = local176;
		local19.anInt7244 = local136;
		local24.anInt7244 = local116;
		local29.anInt7244 = local158;
		local34.anInt7244 = local126;
		for (local364 = 0; local364 < this.anInt7656; local364++) {
			this.aShortArray127[local364] = (short) local14.method6006();
			if (local59 == 1) {
				local366 = local19.method6041();
				if ((local366 & 0x1) == 1) {
					this.aByteArray97[local364] = 1;
					local7 = true;
				} else {
					this.aByteArray97[local364] = 0;
				}
				if ((local366 & 0x2) == 2) {
					this.aByteArray102[local364] = (byte) (local366 >> 2);
					this.aShortArray131[local364] = this.aShortArray127[local364];
					this.aShortArray127[local364] = 127;
					if (this.aShortArray131[local364] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray102[local364] = -1;
					this.aShortArray131[local364] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray100[local364] = local24.method6034();
			}
			if (local67 == 1) {
				this.aByteArray101[local364] = local29.method6034();
			}
			if (local71 == 1) {
				this.anIntArray609[local364] = local34.method6041();
			}
		}
		this.anInt7662 = -1;
		local14.anInt7244 = local170;
		local19.anInt7244 = local109;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(616) short local616 = 0;
		@Pc(624) int local624;
		for (@Pc(618) int local618 = 0; local618 < this.anInt7656; local618++) {
			local624 = local19.method6041();
			if (local624 == 1) {
				local610 = (short) (local14.method6015() + local616);
				local612 = (short) (local14.method6015() + local610);
				local614 = (short) (local14.method6015() + local612);
				local616 = local614;
				this.aShortArray122[local618] = local610;
				this.aShortArray126[local618] = local612;
				this.aShortArray125[local618] = local614;
				if (this.anInt7662 < local610) {
					this.anInt7662 = local610;
				}
				if (local612 > this.anInt7662) {
					this.anInt7662 = local612;
				}
				if (this.anInt7662 < local614) {
					this.anInt7662 = local614;
				}
			}
			if (local624 == 2) {
				local612 = local614;
				local614 = (short) (local616 + local14.method6015());
				local616 = local614;
				this.aShortArray122[local618] = local610;
				this.aShortArray126[local618] = local612;
				this.aShortArray125[local618] = local614;
				if (local614 > this.anInt7662) {
					this.anInt7662 = local614;
				}
			}
			if (local624 == 3) {
				local610 = local614;
				local614 = (short) (local616 + local14.method6015());
				this.aShortArray122[local618] = local610;
				local616 = local614;
				this.aShortArray126[local618] = local612;
				this.aShortArray125[local618] = local614;
				if (local614 > this.anInt7662) {
					this.anInt7662 = local614;
				}
			}
			if (local624 == 4) {
				@Pc(779) short local779 = local610;
				local610 = local612;
				local614 = (short) (local14.method6015() + local616);
				local612 = local779;
				local616 = local614;
				this.aShortArray122[local618] = local610;
				this.aShortArray126[local618] = local779;
				this.aShortArray125[local618] = local614;
				if (local614 > this.anInt7662) {
					this.anInt7662 = local614;
				}
			}
		}
		local14.anInt7244 = local185;
		this.anInt7662++;
		for (local624 = 0; local624 < this.anInt7653; local624++) {
			this.aByteArray99[local624] = 0;
			this.aShortArray123[local624] = (short) local14.method6006();
			this.aShortArray129[local624] = (short) local14.method6006();
			this.aShortArray124[local624] = (short) local14.method6006();
		}
		if (this.aByteArray102 != null) {
			@Pc(879) boolean local879 = false;
			for (@Pc(881) int local881 = 0; local881 < this.anInt7656; local881++) {
				@Pc(890) int local890 = this.aByteArray102[local881] & 0xFF;
				if (local890 != 255) {
					if (this.aShortArray122[local881] == (this.aShortArray123[local890] & 0xFFFF) && this.aShortArray126[local881] == (this.aShortArray129[local890] & 0xFFFF) && (this.aShortArray124[local890] & 0xFFFF) == this.aShortArray125[local881]) {
						this.aByteArray102[local881] = -1;
					} else {
						local879 = true;
					}
				}
			}
			if (!local879) {
				this.aByteArray102 = null;
			}
		}
		if (!local7) {
			this.aByteArray97 = null;
		}
		if (!local9) {
			this.aShortArray131 = null;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)[[I")
	public int[][] method6344() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt7656; local17++) {
			@Pc(24) int local24 = this.anIntArray609[local17];
			if (local24 >= 0) {
				@Pc(33) int local33 = local8[local24]++;
				if (local24 > local10) {
					local10 = local24;
				}
			}
		}
		@Pc(59) int[][] local59 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local59[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt7656; local80++) {
			@Pc(87) int local87 = this.anIntArray609[local80];
			if (local87 >= 0) {
				local59[local87][local8[local87]++] = local80;
			}
		}
		return local59;
	}
}
