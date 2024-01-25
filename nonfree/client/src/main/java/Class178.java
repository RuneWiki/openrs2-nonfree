import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class178 {

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!iq", name = "V", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!iq", name = "Z", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "[Lclient!sw;")
	public Class348[] aClass348Array4;

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "[I")
	public int[] anIntArray296;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!iq", name = "E", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "[Lclient!hl;")
	public Class156[] aClass156Array4;

	@OriginalMember(owner = "client!iq", name = "P", descriptor = "[I")
	public int[] anIntArray297;

	@OriginalMember(owner = "client!iq", name = "cb", descriptor = "[I")
	public int[] anIntArray298;

	@OriginalMember(owner = "client!iq", name = "Q", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!iq", name = "db", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "[I")
	public int[] anIntArray301;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!iq", name = "L", descriptor = "[I")
	public int[] anIntArray302;

	@OriginalMember(owner = "client!iq", name = "N", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!iq", name = "bb", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!iq", name = "G", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "[I")
	public int[] anIntArray303;

	@OriginalMember(owner = "client!iq", name = "S", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "[Lclient!dla;")
	public Class74[] aClass74Array1;

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!iq", name = "D", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!iq", name = "U", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "[I")
	public int[] anIntArray304;

	@OriginalMember(owner = "client!iq", name = "Y", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
	public int anInt5135 = 0;

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
	public int anInt5138 = 0;

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
	public int anInt5129 = 0;

	@OriginalMember(owner = "client!iq", name = "H", descriptor = "B")
	public byte aByte86 = 0;

	@OriginalMember(owner = "client!iq", name = "I", descriptor = "I")
	public int anInt5134 = 0;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
	public int anInt5137 = 12;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	private Class178() {
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "([B)V")
	public Class178(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4268(arg0);
		} else {
			this.method4277(arg0);
		}
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(III)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray303 = new int[arg0];
		this.anIntArray302 = new int[arg0];
		this.aShortArray100 = new short[arg1];
		this.aShortArray92 = new short[arg1];
		this.aByteArray37 = new byte[arg1];
		this.aByteArray42 = new byte[arg1];
		this.aShortArray101 = new short[arg1];
		this.aByteArray36 = new byte[arg1];
		this.aShortArray95 = new short[arg1];
		this.anIntArray299 = new int[arg1];
		this.anIntArray298 = new int[arg0];
		this.aByteArray40 = new byte[arg1];
		this.aShortArray96 = new short[arg1];
		this.anIntArray304 = new int[arg0];
		if (arg2 > 0) {
			this.aShortArray93 = new short[arg2];
			this.anIntArray300 = new int[arg2];
			this.aShortArray94 = new short[arg2];
			this.anIntArray296 = new int[arg2];
			this.anIntArray295 = new int[arg2];
			this.aByteArray41 = new byte[arg2];
			this.anIntArray294 = new int[arg2];
			this.anIntArray297 = new int[arg2];
			this.aShortArray99 = new short[arg2];
			this.aByteArray38 = new byte[arg2];
			this.aByteArray39 = new byte[arg2];
			this.anIntArray301 = new int[arg2];
		}
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "([Lclient!iq;I)V")
	public Class178(@OriginalArg(0) Class178[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5134 = 0;
		this.anInt5138 = 0;
		this.anInt5135 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte86 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class178 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5134 += local59.anInt5134;
				this.anInt5135 += local59.anInt5135;
				this.anInt5138 += local59.anInt5138;
				local38 |= local59.aByteArray36 != null;
				if (local59.aClass156Array4 != null) {
					local32 += local59.aClass156Array4.length;
				}
				if (local59.aClass348Array4 != null) {
					local34 += local59.aClass348Array4.length;
				}
				if (local59.aClass74Array1 != null) {
					local36 += local59.aClass74Array1.length;
				}
				local42 |= local59.aByteArray42 != null;
				if (local59.aByteArray40 == null) {
					if (this.aByte86 == -1) {
						this.aByte86 = local59.aByte86;
					}
					if (this.aByte86 != local59.aByte86) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local51 |= local59.anIntArray299 != null;
				local44 |= local59.aByteArray37 != null;
				local46 |= local59.aShortArray101 != null;
			}
		}
		if (local44) {
			this.aByteArray37 = new byte[this.anInt5135];
		}
		if (local38) {
			this.aByteArray36 = new byte[this.anInt5135];
		}
		this.aShortArray97 = new short[this.anInt5135];
		this.aShortArray92 = new short[this.anInt5135];
		this.aShortArray100 = new short[this.anInt5135];
		if (local34 > 0) {
			this.aClass348Array4 = new Class348[local34];
		}
		this.aShortArray98 = new short[this.anInt5138];
		if (local46) {
			this.aShortArray101 = new short[this.anInt5135];
		}
		if (local40) {
			this.aByteArray40 = new byte[this.anInt5135];
		}
		this.anIntArray304 = new int[this.anInt5138];
		if (local32 > 0) {
			this.aClass156Array4 = new Class156[local32];
		}
		this.anIntArray302 = new int[this.anInt5138];
		this.anIntArray298 = new int[this.anInt5138];
		if (local36 > 0) {
			this.aClass74Array1 = new Class74[local36];
		}
		if (local51) {
			this.anIntArray299 = new int[this.anInt5135];
		}
		if (this.anInt5134 > 0) {
			this.aByteArray38 = new byte[this.anInt5134];
			this.aShortArray94 = new short[this.anInt5134];
			this.anIntArray294 = new int[this.anInt5134];
			this.anIntArray297 = new int[this.anInt5134];
			this.aShortArray99 = new short[this.anInt5134];
			this.anIntArray300 = new int[this.anInt5134];
			this.aByteArray41 = new byte[this.anInt5134];
			this.aShortArray93 = new short[this.anInt5134];
			this.aByteArray39 = new byte[this.anInt5134];
			this.anIntArray301 = new int[this.anInt5134];
			this.anIntArray296 = new int[this.anInt5134];
			this.anIntArray295 = new int[this.anInt5134];
		}
		this.anIntArray303 = new int[this.anInt5138];
		this.aShortArray96 = new short[this.anInt5135];
		if (local42) {
			this.aByteArray42 = new byte[this.anInt5135];
		}
		this.aShortArray95 = new short[this.anInt5135];
		local34 = 0;
		this.anInt5138 = 0;
		local32 = 0;
		local36 = 0;
		this.anInt5134 = 0;
		this.anInt5135 = 0;
		@Pc(679) int local679;
		@Pc(690) int local690;
		for (@Pc(413) int local413 = 0; local413 < arg1; local413++) {
			@Pc(420) short local420 = (short) (0x1 << local413);
			@Pc(424) Class178 local424 = arg0[local413];
			if (local424 != null) {
				@Pc(433) int local433;
				if (local424.aClass74Array1 != null) {
					for (local433 = 0; local433 < local424.aClass74Array1.length; local433++) {
						@Pc(440) Class74 local440 = local424.aClass74Array1[local433];
						this.aClass74Array1[local36++] = local440.method2067(this.anInt5135 + local440.anInt2328);
					}
				}
				for (local433 = 0; local433 < local424.anInt5135; local433++) {
					if (local38 && local424.aByteArray36 != null) {
						this.aByteArray36[this.anInt5135] = local424.aByteArray36[local433];
					}
					if (local40) {
						if (local424.aByteArray40 == null) {
							this.aByteArray40[this.anInt5135] = local424.aByte86;
						} else {
							this.aByteArray40[this.anInt5135] = local424.aByteArray40[local433];
						}
					}
					if (local42 && local424.aByteArray42 != null) {
						this.aByteArray42[this.anInt5135] = local424.aByteArray42[local433];
					}
					if (local46) {
						if (local424.aShortArray101 == null) {
							this.aShortArray101[this.anInt5135] = -1;
						} else {
							this.aShortArray101[this.anInt5135] = local424.aShortArray101[local433];
						}
					}
					if (local51) {
						if (local424.anIntArray299 == null) {
							this.anIntArray299[this.anInt5135] = -1;
						} else {
							this.anIntArray299[this.anInt5135] = local424.anIntArray299[local433];
						}
					}
					this.aShortArray96[this.anInt5135] = (short) this.method4269(local420, local424.aShortArray96[local433], local424);
					this.aShortArray95[this.anInt5135] = (short) this.method4269(local420, local424.aShortArray95[local433], local424);
					this.aShortArray92[this.anInt5135] = (short) this.method4269(local420, local424.aShortArray92[local433], local424);
					this.aShortArray97[this.anInt5135] = local420;
					this.aShortArray100[this.anInt5135] = local424.aShortArray100[local433];
					this.anInt5135++;
				}
				@Pc(666) int local666;
				if (local424.aClass156Array4 != null) {
					for (local666 = 0; local666 < local424.aClass156Array4.length; local666++) {
						local679 = this.method4269(local420, local424.aClass156Array4[local666].anInt4597, local424);
						local690 = this.method4269(local420, local424.aClass156Array4[local666].anInt4586, local424);
						@Pc(701) int local701 = this.method4269(local420, local424.aClass156Array4[local666].anInt4588, local424);
						this.aClass156Array4[local32] = local424.aClass156Array4[local666].method3752(local690, local701, local679);
						local32++;
					}
				}
				if (local424.aClass348Array4 != null) {
					for (local666 = 0; local666 < local424.aClass348Array4.length; local666++) {
						local679 = this.method4269(local420, local424.aClass348Array4[local666].anInt9766, local424);
						this.aClass348Array4[local34] = local424.aClass348Array4[local666].method8243(local679);
						local34++;
					}
				}
			}
		}
		this.anInt5129 = this.anInt5138;
		@Pc(783) int local783 = 0;
		for (@Pc(785) int local785 = 0; local785 < arg1; local785++) {
			@Pc(794) short local794 = (short) (0x1 << local785);
			@Pc(798) Class178 local798 = arg0[local785];
			if (local798 != null) {
				for (local679 = 0; local679 < local798.anInt5135; local679++) {
					if (local44) {
						this.aByteArray37[local783++] = (byte) (local798.aByteArray37 == null || local798.aByteArray37[local679] == -1 ? -1 : local798.aByteArray37[local679] + this.anInt5134);
					}
				}
				for (local690 = 0; local690 < local798.anInt5134; local690++) {
					@Pc(859) byte local859 = this.aByteArray41[this.anInt5134] = local798.aByteArray41[local690];
					if (local859 == 0) {
						this.aShortArray93[this.anInt5134] = (short) this.method4269(local794, local798.aShortArray93[local690], local798);
						this.aShortArray94[this.anInt5134] = (short) this.method4269(local794, local798.aShortArray94[local690], local798);
						this.aShortArray99[this.anInt5134] = (short) this.method4269(local794, local798.aShortArray99[local690], local798);
					}
					if (local859 >= 1 && local859 <= 3) {
						this.aShortArray93[this.anInt5134] = local798.aShortArray93[local690];
						this.aShortArray94[this.anInt5134] = local798.aShortArray94[local690];
						this.aShortArray99[this.anInt5134] = local798.aShortArray99[local690];
						this.anIntArray294[this.anInt5134] = local798.anIntArray294[local690];
						this.anIntArray301[this.anInt5134] = local798.anIntArray301[local690];
						this.anIntArray295[this.anInt5134] = local798.anIntArray295[local690];
						this.aByteArray38[this.anInt5134] = local798.aByteArray38[local690];
						this.aByteArray39[this.anInt5134] = local798.aByteArray39[local690];
						this.anIntArray297[this.anInt5134] = local798.anIntArray297[local690];
					}
					if (local859 == 2) {
						this.anIntArray296[this.anInt5134] = local798.anIntArray296[local690];
						this.anIntArray300[this.anInt5134] = local798.anIntArray300[local690];
					}
					this.anInt5134++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "([BI)V")
	private void method4268(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub28 local10 = new Class3_Sub28(arg0);
		@Pc(15) Class3_Sub28 local15 = new Class3_Sub28(arg0);
		@Pc(20) Class3_Sub28 local20 = new Class3_Sub28(arg0);
		@Pc(25) Class3_Sub28 local25 = new Class3_Sub28(arg0);
		@Pc(30) Class3_Sub28 local30 = new Class3_Sub28(arg0);
		@Pc(35) Class3_Sub28 local35 = new Class3_Sub28(arg0);
		@Pc(40) Class3_Sub28 local40 = new Class3_Sub28(arg0);
		local10.anInt6241 = arg0.length - 23;
		this.anInt5138 = local10.method5272();
		this.anInt5135 = local10.method5272();
		this.anInt5134 = local10.method5322(-32);
		@Pc(65) int local65 = local10.method5322(-90);
		@Pc(75) boolean local75 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(97) boolean local97 = (local65 & 0x4) == 4;
		@Pc(109) boolean local109 = (local65 & 0x8) == 8;
		if (local109) {
			local10.anInt6241 -= 7;
			this.anInt5137 = local10.method5322(-72);
			local10.anInt6241 += 6;
		}
		@Pc(134) int local134 = local10.method5322(-13);
		@Pc(138) int local138 = local10.method5322(-89);
		@Pc(142) int local142 = local10.method5322(-42);
		@Pc(146) int local146 = local10.method5322(-34);
		@Pc(150) int local150 = local10.method5322(-21);
		@Pc(154) int local154 = local10.method5272();
		@Pc(158) int local158 = local10.method5272();
		@Pc(162) int local162 = local10.method5272();
		@Pc(166) int local166 = local10.method5272();
		@Pc(170) int local170 = local10.method5272();
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(189) int local189;
		if (this.anInt5134 > 0) {
			this.aByteArray41 = new byte[this.anInt5134];
			local10.anInt6241 = 0;
			for (local189 = 0; local189 < this.anInt5134; local189++) {
				@Pc(200) byte local200 = this.aByteArray41[local189] = local10.method5288();
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
		local189 = this.anInt5134;
		@Pc(245) int local245 = local189;
		local189 += this.anInt5138;
		@Pc(252) int local252 = local189;
		if (local75) {
			local189 += this.anInt5135;
		}
		@Pc(265) int local265 = local189;
		local189 += this.anInt5135;
		@Pc(272) int local272 = local189;
		if (local134 == 255) {
			local189 += this.anInt5135;
		}
		@Pc(282) int local282 = local189;
		if (local142 == 1) {
			local189 += this.anInt5135;
		}
		@Pc(294) int local294 = local189;
		if (local150 == 1) {
			local189 += this.anInt5138;
		}
		@Pc(306) int local306 = local189;
		if (local138 == 1) {
			local189 += this.anInt5135;
		}
		@Pc(316) int local316 = local189;
		local189 += local166;
		@Pc(322) int local322 = local189;
		if (local146 == 1) {
			local189 += this.anInt5135 * 2;
		}
		@Pc(336) int local336 = local189;
		local189 += local170;
		@Pc(342) int local342 = local189;
		local189 += this.anInt5135 * 2;
		@Pc(351) int local351 = local189;
		local189 += local154;
		@Pc(357) int local357 = local189;
		local189 += local158;
		@Pc(363) int local363 = local189;
		local189 += local162;
		@Pc(369) int local369 = local189;
		local189 += local172 * 6;
		@Pc(377) int local377 = local189;
		local189 += local174 * 6;
		@Pc(385) byte local385 = 6;
		if (this.anInt5137 == 14) {
			local385 = 7;
		} else if (this.anInt5137 >= 15) {
			local385 = 9;
		}
		@Pc(405) int local405 = local189;
		local189 += local385 * local174;
		@Pc(413) int local413 = local189;
		local189 += local174;
		@Pc(419) int local419 = local189;
		local189 += local174;
		@Pc(425) int local425 = local189;
		local189 += local174 + local176 * 2;
		this.aShortArray95 = new short[this.anInt5135];
		if (local146 == 1 && this.anInt5134 > 0) {
			this.aByteArray37 = new byte[this.anInt5135];
		}
		this.aShortArray92 = new short[this.anInt5135];
		this.anIntArray302 = new int[this.anInt5138];
		if (local134 == 255) {
			this.aByteArray40 = new byte[this.anInt5135];
		} else {
			this.aByte86 = (byte) local134;
		}
		if (local150 == 1) {
			this.anIntArray303 = new int[this.anInt5138];
		}
		if (local138 == 1) {
			this.aByteArray42 = new byte[this.anInt5135];
		}
		if (local75) {
			this.aByteArray36 = new byte[this.anInt5135];
		}
		this.aShortArray96 = new short[this.anInt5135];
		if (this.anInt5134 > 0) {
			this.aShortArray93 = new short[this.anInt5134];
			if (local176 > 0) {
				this.anIntArray296 = new int[local176];
				this.anIntArray300 = new int[local176];
			}
			this.aShortArray99 = new short[this.anInt5134];
			this.aShortArray94 = new short[this.anInt5134];
			if (local174 > 0) {
				this.aByteArray39 = new byte[local174];
				this.anIntArray297 = new int[local174];
				this.anIntArray301 = new int[local174];
				this.aByteArray38 = new byte[local174];
				this.anIntArray294 = new int[local174];
				this.anIntArray295 = new int[local174];
			}
		}
		this.anIntArray304 = new int[this.anInt5138];
		this.aShortArray100 = new short[this.anInt5135];
		local10.anInt6241 = local245;
		if (local142 == 1) {
			this.anIntArray299 = new int[this.anInt5135];
		}
		if (local146 == 1) {
			this.aShortArray101 = new short[this.anInt5135];
		}
		this.anIntArray298 = new int[this.anInt5138];
		local15.anInt6241 = local351;
		local20.anInt6241 = local357;
		local25.anInt6241 = local363;
		local30.anInt6241 = local294;
		@Pc(655) int local655 = 0;
		@Pc(657) int local657 = 0;
		@Pc(659) int local659 = 0;
		@Pc(667) int local667;
		for (@Pc(661) int local661 = 0; local661 < this.anInt5138; local661++) {
			local667 = local10.method5322(-21);
			@Pc(669) int local669 = 0;
			if ((local667 & 0x1) != 0) {
				local669 = local15.method5285();
			}
			@Pc(682) int local682 = 0;
			if ((local667 & 0x2) != 0) {
				local682 = local20.method5285();
			}
			@Pc(695) int local695 = 0;
			if ((local667 & 0x4) != 0) {
				local695 = local25.method5285();
			}
			this.anIntArray298[local661] = local655 + local669;
			this.anIntArray304[local661] = local682 + local657;
			this.anIntArray302[local661] = local659 + local695;
			local657 = this.anIntArray304[local661];
			local655 = this.anIntArray298[local661];
			local659 = this.anIntArray302[local661];
			if (local150 == 1) {
				this.anIntArray303[local661] = local30.method5322(-65);
			}
		}
		local10.anInt6241 = local342;
		local15.anInt6241 = local252;
		local20.anInt6241 = local272;
		local25.anInt6241 = local306;
		local30.anInt6241 = local282;
		local35.anInt6241 = local322;
		local40.anInt6241 = local336;
		for (local667 = 0; local667 < this.anInt5135; local667++) {
			this.aShortArray100[local667] = (short) local10.method5272();
			if (local75) {
				this.aByteArray36[local667] = local15.method5288();
			}
			if (local134 == 255) {
				this.aByteArray40[local667] = local20.method5288();
			}
			if (local138 == 1) {
				this.aByteArray42[local667] = local25.method5288();
			}
			if (local142 == 1) {
				this.anIntArray299[local667] = local30.method5322(-35);
			}
			if (local146 == 1) {
				this.aShortArray101[local667] = (short) (local35.method5272() - 1);
			}
			if (this.aByteArray37 != null) {
				if (this.aShortArray101[local667] == -1) {
					this.aByteArray37[local667] = -1;
				} else {
					this.aByteArray37[local667] = (byte) (local40.method5322(-9) - 1);
				}
			}
		}
		local10.anInt6241 = local316;
		this.anInt5129 = -1;
		local15.anInt6241 = local265;
		@Pc(921) short local921 = 0;
		@Pc(923) short local923 = 0;
		@Pc(925) short local925 = 0;
		@Pc(927) short local927 = 0;
		@Pc(937) int local937;
		for (@Pc(929) int local929 = 0; local929 < this.anInt5135; local929++) {
			local937 = local15.method5322(-19);
			if (local937 == 1) {
				local921 = (short) (local927 + local10.method5285());
				local923 = (short) (local10.method5285() + local921);
				local925 = (short) (local923 + local10.method5285());
				this.aShortArray96[local929] = local921;
				local927 = local925;
				this.aShortArray95[local929] = local923;
				this.aShortArray92[local929] = local925;
				if (local921 > this.anInt5129) {
					this.anInt5129 = local921;
				}
				if (local923 > this.anInt5129) {
					this.anInt5129 = local923;
				}
				if (this.anInt5129 < local925) {
					this.anInt5129 = local925;
				}
			}
			if (local937 == 2) {
				local923 = local925;
				local925 = (short) (local10.method5285() + local927);
				this.aShortArray96[local929] = local921;
				local927 = local925;
				this.aShortArray95[local929] = local923;
				this.aShortArray92[local929] = local925;
				if (local925 > this.anInt5129) {
					this.anInt5129 = local925;
				}
			}
			if (local937 == 3) {
				local921 = local925;
				local925 = (short) (local927 + local10.method5285());
				local927 = local925;
				this.aShortArray96[local929] = local921;
				this.aShortArray95[local929] = local923;
				this.aShortArray92[local929] = local925;
				if (this.anInt5129 < local925) {
					this.anInt5129 = local925;
				}
			}
			if (local937 == 4) {
				@Pc(1100) short local1100 = local921;
				local921 = local923;
				local923 = local1100;
				local925 = (short) (local927 + local10.method5285());
				this.aShortArray96[local929] = local921;
				local927 = local925;
				this.aShortArray95[local929] = local1100;
				this.aShortArray92[local929] = local925;
				if (this.anInt5129 < local925) {
					this.anInt5129 = local925;
				}
			}
		}
		this.anInt5129++;
		local10.anInt6241 = local369;
		local15.anInt6241 = local377;
		local20.anInt6241 = local405;
		local25.anInt6241 = local413;
		local30.anInt6241 = local419;
		local35.anInt6241 = local425;
		@Pc(1189) int local1189;
		for (local937 = 0; local937 < this.anInt5134; local937++) {
			local1189 = this.aByteArray41[local937] & 0xFF;
			if (local1189 == 0) {
				this.aShortArray93[local937] = (short) local10.method5272();
				this.aShortArray94[local937] = (short) local10.method5272();
				this.aShortArray99[local937] = (short) local10.method5272();
			}
			if (local1189 == 1) {
				this.aShortArray93[local937] = (short) local15.method5272();
				this.aShortArray94[local937] = (short) local15.method5272();
				this.aShortArray99[local937] = (short) local15.method5272();
				if (this.anInt5137 < 15) {
					this.anIntArray294[local937] = local20.method5272();
					if (this.anInt5137 < 14) {
						this.anIntArray301[local937] = local20.method5272();
					} else {
						this.anIntArray301[local937] = local20.method5307();
					}
					this.anIntArray295[local937] = local20.method5272();
				} else {
					this.anIntArray294[local937] = local20.method5307();
					this.anIntArray301[local937] = local20.method5307();
					this.anIntArray295[local937] = local20.method5307();
				}
				this.aByteArray38[local937] = local25.method5288();
				this.aByteArray39[local937] = local30.method5288();
				this.anIntArray297[local937] = local35.method5288();
			}
			if (local1189 == 2) {
				this.aShortArray93[local937] = (short) local15.method5272();
				this.aShortArray94[local937] = (short) local15.method5272();
				this.aShortArray99[local937] = (short) local15.method5272();
				if (this.anInt5137 >= 15) {
					this.anIntArray294[local937] = local20.method5307();
					this.anIntArray301[local937] = local20.method5307();
					this.anIntArray295[local937] = local20.method5307();
				} else {
					this.anIntArray294[local937] = local20.method5272();
					if (this.anInt5137 >= 14) {
						this.anIntArray301[local937] = local20.method5307();
					} else {
						this.anIntArray301[local937] = local20.method5272();
					}
					this.anIntArray295[local937] = local20.method5272();
				}
				this.aByteArray38[local937] = local25.method5288();
				this.aByteArray39[local937] = local30.method5288();
				this.anIntArray297[local937] = local35.method5288();
				this.anIntArray296[local937] = local35.method5288();
				this.anIntArray300[local937] = local35.method5288();
			}
			if (local1189 == 3) {
				this.aShortArray93[local937] = (short) local15.method5272();
				this.aShortArray94[local937] = (short) local15.method5272();
				this.aShortArray99[local937] = (short) local15.method5272();
				if (this.anInt5137 < 15) {
					this.anIntArray294[local937] = local20.method5272();
					if (this.anInt5137 < 14) {
						this.anIntArray301[local937] = local20.method5272();
					} else {
						this.anIntArray301[local937] = local20.method5307();
					}
					this.anIntArray295[local937] = local20.method5272();
				} else {
					this.anIntArray294[local937] = local20.method5307();
					this.anIntArray301[local937] = local20.method5307();
					this.anIntArray295[local937] = local20.method5307();
				}
				this.aByteArray38[local937] = local25.method5288();
				this.aByteArray39[local937] = local30.method5288();
				this.anIntArray297[local937] = local35.method5288();
			}
		}
		local10.anInt6241 = local189;
		@Pc(1625) int local1625;
		@Pc(1633) int local1633;
		@Pc(1637) int local1637;
		@Pc(1701) int local1701;
		if (local87) {
			local1189 = local10.method5322(-109);
			if (local1189 > 0) {
				this.aClass156Array4 = new Class156[local1189];
				for (local1625 = 0; local1625 < local1189; local1625++) {
					local1633 = local10.method5272();
					local1637 = local10.method5272();
					@Pc(1643) byte local1643;
					if (local134 == 255) {
						local1643 = this.aByteArray40[local1637];
					} else {
						local1643 = (byte) local134;
					}
					this.aClass156Array4[local1625] = new Class156(local1633, this.aShortArray96[local1637], this.aShortArray95[local1637], this.aShortArray92[local1637], local1643);
				}
			}
			local1625 = local10.method5322(-14);
			if (local1625 > 0) {
				this.aClass348Array4 = new Class348[local1625];
				for (local1633 = 0; local1633 < local1625; local1633++) {
					local1637 = local10.method5272();
					local1701 = local10.method5272();
					this.aClass348Array4[local1633] = new Class348(local1637, local1701);
				}
			}
		}
		if (!local97) {
			return;
		}
		local1189 = local10.method5322(-126);
		if (local1189 <= 0) {
			return;
		}
		this.aClass74Array1 = new Class74[local1189];
		for (local1625 = 0; local1625 < local1189; local1625++) {
			local1633 = local10.method5272();
			local1637 = local10.method5272();
			local1701 = local10.method5322(-109);
			@Pc(1751) byte local1751 = local10.method5288();
			this.aClass74Array1[local1625] = new Class74(local1633, local1637, local1701, local1751);
		}
		return;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(SIILclient!iq;)I")
	private int method4269(@OriginalArg(0) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class178 arg2) {
		@Pc(10) int local10 = arg2.anIntArray298[arg1];
		@Pc(15) int local15 = arg2.anIntArray304[arg1];
		@Pc(20) int local20 = arg2.anIntArray302[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt5138; local22++) {
			if (local10 == this.anIntArray298[local22] && local15 == this.anIntArray304[local22] && this.anIntArray302[local22] == local20) {
				this.aShortArray98[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray298[this.anInt5138] = local10;
		this.anIntArray304[this.anInt5138] = local15;
		this.anIntArray302[this.anInt5138] = local20;
		this.aShortArray98[this.anInt5138] = arg0;
		this.anIntArray303[this.anInt5138] = arg2.anIntArray303 == null ? -1 : arg2.anIntArray303[arg1];
		return this.anInt5138++;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)V")
	public void method4270() {
		for (@Pc(8) int local8 = 0; local8 < this.anInt5138; local8++) {
			this.anIntArray298[local8] <<= 0x2;
			this.anIntArray304[local8] <<= 0x2;
			this.anIntArray302[local8] <<= 0x2;
		}
		if (this.anInt5134 <= 0 || this.anIntArray294 == null) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < this.anIntArray294.length; local62++) {
			this.anIntArray294[local62] <<= 0x2;
			this.anIntArray301[local62] <<= 0x2;
			if (this.aByteArray41[local62] != 1) {
				this.anIntArray295[local62] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(SBS)V")
	public void method4271(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt5135; local12++) {
			if (this.aShortArray100[local12] == arg0) {
				this.aShortArray100[local12] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIBI)V")
	public void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5138; local3++) {
			this.anIntArray298[local3] += arg2;
			this.anIntArray304[local3] += arg1;
			this.anIntArray302[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZ)[[I")
	public int[][] method4273(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(25) int local25 = arg0 ? this.anInt5138 : this.anInt5129;
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			@Pc(36) int local36 = this.anIntArray303[local27];
			if (local36 >= 0) {
				@Pc(45) int local45 = local8[local36]++;
				if (local36 > local10) {
					local10 = local36;
				}
			}
		}
		@Pc(64) int[][] local64 = new int[local10 + 1][];
		for (@Pc(68) int local68 = 0; local68 <= local10; local68++) {
			local64[local68] = new int[local8[local68]];
			local8[local68] = 0;
		}
		for (@Pc(93) int local93 = 0; local93 < local25; local93++) {
			@Pc(102) int local102 = this.anIntArray303[local93];
			if (local102 >= 0) {
				local64[local102][local8[local102]++] = local93;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(SBIBIIZBS)I")
	public int method4274(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) short arg7) {
		this.aShortArray96[this.anInt5135] = (short) arg2;
		this.aShortArray95[this.anInt5135] = (short) arg5;
		this.aShortArray92[this.anInt5135] = (short) arg4;
		this.aByteArray36[this.anInt5135] = arg1;
		this.aByteArray37[this.anInt5135] = arg3;
		this.aShortArray100[this.anInt5135] = arg7;
		this.aByteArray42[this.anInt5135] = arg6;
		this.aShortArray101[this.anInt5135] = arg0;
		return this.anInt5135++;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)[[I")
	public int[][] method4275() {
		@Pc(19) int[] local19 = new int[256];
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.aClass74Array1.length; local23++) {
			@Pc(33) int local33 = this.aClass74Array1[local23].anInt2330;
			if (local33 >= 0) {
				if (local33 > local21) {
					local21 = local33;
				}
				@Pc(50) int local50 = local19[local33]++;
			}
		}
		@Pc(64) int[][] local64 = new int[local21 + 1][];
		for (@Pc(68) int local68 = 0; local68 <= local21; local68++) {
			local64[local68] = new int[local19[local68]];
			local19[local68] = 0;
		}
		for (@Pc(93) int local93 = 0; local93 < this.aClass74Array1.length; local93++) {
			@Pc(103) int local103 = this.aClass74Array1[local93].anInt2330;
			if (local103 >= 0) {
				local64[local103][local19[local103]++] = local93;
			}
		}
		return local64;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIII)V")
	public void method4276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(35) int local35;
		if (arg0 != 0) {
			local11 = Class3_Sub2_Sub21.anIntArray358[arg0];
			local15 = Class3_Sub2_Sub21.anIntArray356[arg0];
			for (local17 = 0; local17 < this.anInt5138; local17++) {
				local35 = this.anIntArray298[local17] * local15 + local11 * this.anIntArray304[local17] >> 14;
				this.anIntArray304[local17] = local15 * this.anIntArray304[local17] - this.anIntArray298[local17] * local11 >> 14;
				this.anIntArray298[local17] = local35;
			}
		}
		if (arg1 != 0) {
			local11 = Class3_Sub2_Sub21.anIntArray358[arg1];
			local15 = Class3_Sub2_Sub21.anIntArray356[arg1];
			for (local17 = 0; local17 < this.anInt5138; local17++) {
				local35 = local15 * this.anIntArray304[local17] - this.anIntArray302[local17] * local11 >> 14;
				this.anIntArray302[local17] = local11 * this.anIntArray304[local17] + local15 * this.anIntArray302[local17] >> 14;
				this.anIntArray304[local17] = local35;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local11 = Class3_Sub2_Sub21.anIntArray358[arg2];
		local15 = Class3_Sub2_Sub21.anIntArray356[arg2];
		for (local17 = 0; local17 < this.anInt5138; local17++) {
			local35 = local15 * this.anIntArray298[local17] + local11 * this.anIntArray302[local17] >> 14;
			this.anIntArray302[local17] = this.anIntArray302[local17] * local15 - local11 * this.anIntArray298[local17] >> 14;
			this.anIntArray298[local17] = local35;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B[B)V")
	private void method4277(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub28 local14 = new Class3_Sub28(arg0);
		@Pc(19) Class3_Sub28 local19 = new Class3_Sub28(arg0);
		@Pc(24) Class3_Sub28 local24 = new Class3_Sub28(arg0);
		@Pc(29) Class3_Sub28 local29 = new Class3_Sub28(arg0);
		@Pc(34) Class3_Sub28 local34 = new Class3_Sub28(arg0);
		local14.anInt6241 = arg0.length - 18;
		this.anInt5138 = local14.method5272();
		this.anInt5135 = local14.method5272();
		this.anInt5134 = local14.method5322(-112);
		@Pc(59) int local59 = local14.method5322(-84);
		@Pc(65) int local65 = local14.method5322(-22);
		@Pc(69) int local69 = local14.method5322(-52);
		@Pc(75) int local75 = local14.method5322(-79);
		@Pc(79) int local79 = local14.method5322(-117);
		@Pc(83) int local83 = local14.method5272();
		@Pc(87) int local87 = local14.method5272();
		@Pc(91) int local91 = local14.method5272();
		@Pc(95) int local95 = local14.method5272();
		@Pc(104) int local104 = this.anInt5138;
		@Pc(106) int local106 = local104;
		local104 += this.anInt5135;
		@Pc(113) int local113 = local104;
		if (local65 == 255) {
			local104 += this.anInt5135;
		}
		@Pc(123) int local123 = local104;
		if (local75 == 1) {
			local104 += this.anInt5135;
		}
		@Pc(135) int local135 = local104;
		if (local59 == 1) {
			local104 += this.anInt5135;
		}
		@Pc(145) int local145 = local104;
		if (local79 == 1) {
			local104 += this.anInt5138;
		}
		@Pc(155) int local155 = local104;
		if (local69 == 1) {
			local104 += this.anInt5135;
		}
		@Pc(165) int local165 = local104;
		local104 += local95;
		@Pc(171) int local171 = local104;
		local104 += this.anInt5135 * 2;
		@Pc(180) int local180 = local104;
		local104 += this.anInt5134 * 6;
		@Pc(189) int local189 = local104;
		local104 += local83;
		@Pc(203) int local203 = local104;
		local104 += local87;
		local14.anInt6241 = 0;
		this.aShortArray96 = new short[this.anInt5135];
		if (local59 == 1) {
			this.aShortArray101 = new short[this.anInt5135];
			this.aByteArray37 = new byte[this.anInt5135];
			this.aByteArray36 = new byte[this.anInt5135];
		}
		this.aShortArray92 = new short[this.anInt5135];
		this.aShortArray95 = new short[this.anInt5135];
		this.aShortArray100 = new short[this.anInt5135];
		if (local75 == 1) {
			this.anIntArray299 = new int[this.anInt5135];
		}
		if (local69 == 1) {
			this.aByteArray42 = new byte[this.anInt5135];
		}
		if (local65 == 255) {
			this.aByteArray40 = new byte[this.anInt5135];
		} else {
			this.aByte86 = (byte) local65;
		}
		this.anIntArray304 = new int[this.anInt5138];
		this.anIntArray298 = new int[this.anInt5138];
		if (local79 == 1) {
			this.anIntArray303 = new int[this.anInt5138];
		}
		if (this.anInt5134 > 0) {
			this.aShortArray99 = new short[this.anInt5134];
			this.aByteArray41 = new byte[this.anInt5134];
			this.aShortArray94 = new short[this.anInt5134];
			this.aShortArray93 = new short[this.anInt5134];
		}
		this.anIntArray302 = new int[this.anInt5138];
		local19.anInt6241 = local189;
		local24.anInt6241 = local203;
		local29.anInt6241 = local104;
		local34.anInt6241 = local145;
		@Pc(366) int local366 = 0;
		@Pc(368) int local368 = 0;
		@Pc(370) int local370 = 0;
		@Pc(378) int local378;
		@Pc(380) int local380;
		for (@Pc(372) int local372 = 0; local372 < this.anInt5138; local372++) {
			local378 = local14.method5322(-85);
			local380 = 0;
			if ((local378 & 0x1) != 0) {
				local380 = local19.method5285();
			}
			@Pc(393) int local393 = 0;
			if ((local378 & 0x2) != 0) {
				local393 = local24.method5285();
			}
			@Pc(403) int local403 = 0;
			if ((local378 & 0x4) != 0) {
				local403 = local29.method5285();
			}
			this.anIntArray298[local372] = local380 + local366;
			this.anIntArray304[local372] = local393 + local368;
			this.anIntArray302[local372] = local403 + local370;
			local366 = this.anIntArray298[local372];
			local370 = this.anIntArray302[local372];
			local368 = this.anIntArray304[local372];
			if (local79 == 1) {
				this.anIntArray303[local372] = local34.method5322(-121);
			}
		}
		local14.anInt6241 = local171;
		local19.anInt6241 = local135;
		local24.anInt6241 = local113;
		local29.anInt6241 = local155;
		local34.anInt6241 = local123;
		for (local378 = 0; local378 < this.anInt5135; local378++) {
			this.aShortArray100[local378] = (short) local14.method5272();
			if (local59 == 1) {
				local380 = local19.method5322(-117);
				if ((local380 & 0x1) == 1) {
					this.aByteArray36[local378] = 1;
					local7 = true;
				} else {
					this.aByteArray36[local378] = 0;
				}
				if ((local380 & 0x2) == 2) {
					this.aByteArray37[local378] = (byte) (local380 >> 2);
					this.aShortArray101[local378] = this.aShortArray100[local378];
					this.aShortArray100[local378] = 127;
					if (this.aShortArray101[local378] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray37[local378] = -1;
					this.aShortArray101[local378] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray40[local378] = local24.method5288();
			}
			if (local69 == 1) {
				this.aByteArray42[local378] = local29.method5288();
			}
			if (local75 == 1) {
				this.anIntArray299[local378] = local34.method5322(-110);
			}
		}
		this.anInt5129 = -1;
		local14.anInt6241 = local165;
		local19.anInt6241 = local106;
		@Pc(644) short local644 = 0;
		@Pc(646) short local646 = 0;
		@Pc(648) short local648 = 0;
		@Pc(650) short local650 = 0;
		@Pc(662) int local662;
		for (@Pc(652) int local652 = 0; local652 < this.anInt5135; local652++) {
			local662 = local19.method5322(-76);
			if (local662 == 1) {
				local644 = (short) (local14.method5285() + local650);
				local646 = (short) (local644 + local14.method5285());
				local648 = (short) (local646 + local14.method5285());
				this.aShortArray96[local652] = local644;
				local650 = local648;
				this.aShortArray95[local652] = local646;
				this.aShortArray92[local652] = local648;
				if (local644 > this.anInt5129) {
					this.anInt5129 = local644;
				}
				if (this.anInt5129 < local646) {
					this.anInt5129 = local646;
				}
				if (this.anInt5129 < local648) {
					this.anInt5129 = local648;
				}
			}
			if (local662 == 2) {
				local646 = local648;
				local648 = (short) (local14.method5285() + local650);
				this.aShortArray96[local652] = local644;
				local650 = local648;
				this.aShortArray95[local652] = local646;
				this.aShortArray92[local652] = local648;
				if (this.anInt5129 < local648) {
					this.anInt5129 = local648;
				}
			}
			if (local662 == 3) {
				local644 = local648;
				local648 = (short) (local650 + local14.method5285());
				local650 = local648;
				this.aShortArray96[local652] = local644;
				this.aShortArray95[local652] = local646;
				this.aShortArray92[local652] = local648;
				if (this.anInt5129 < local648) {
					this.anInt5129 = local648;
				}
			}
			if (local662 == 4) {
				@Pc(835) short local835 = local644;
				local644 = local646;
				local646 = local835;
				local648 = (short) (local14.method5285() + local650);
				local650 = local648;
				this.aShortArray96[local652] = local644;
				this.aShortArray95[local652] = local835;
				this.aShortArray92[local652] = local648;
				if (local648 > this.anInt5129) {
					this.anInt5129 = local648;
				}
			}
		}
		local14.anInt6241 = local180;
		this.anInt5129++;
		for (local662 = 0; local662 < this.anInt5134; local662++) {
			this.aByteArray41[local662] = 0;
			this.aShortArray93[local662] = (short) local14.method5272();
			this.aShortArray94[local662] = (short) local14.method5272();
			this.aShortArray99[local662] = (short) local14.method5272();
		}
		if (this.aByteArray37 != null) {
			@Pc(941) boolean local941 = false;
			for (@Pc(943) int local943 = 0; local943 < this.anInt5135; local943++) {
				@Pc(954) int local954 = this.aByteArray37[local943] & 0xFF;
				if (local954 != 255) {
					if (this.aShortArray96[local943] == (this.aShortArray93[local954] & 0xFFFF) && (this.aShortArray94[local954] & 0xFFFF) == this.aShortArray95[local943] && this.aShortArray92[local943] == (this.aShortArray99[local954] & 0xFFFF)) {
						this.aByteArray37[local943] = -1;
					} else {
						local941 = true;
					}
				}
			}
			if (!local941) {
				this.aByteArray37 = null;
			}
		}
		if (!local9) {
			this.aShortArray101 = null;
		}
		if (!local7) {
			this.aByteArray36 = null;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(SBS)V")
	public void method4278(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray101 == null) {
			return;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5135; local12++) {
			if (this.aShortArray101[local12] == arg1) {
				this.aShortArray101[local12] = arg0;
			}
		}
		if (-63 != -63) {
			Static283.anInt5144 = 5;
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)[[I")
	public int[][] method4280() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5135; local12++) {
			@Pc(21) int local21 = this.anIntArray299[local12];
			if (local21 >= 0) {
				@Pc(27) int local27 = local8[local21]++;
				if (local21 > local10) {
					local10 = local21;
				}
			}
		}
		@Pc(55) int[][] local55 = new int[local10 + 1][];
		@Pc(57) int local57 = 0;
		if (-98 <= -108) {
			this.aClass156Array4 = null;
		}
		while (local10 >= local57) {
			local55[local57] = new int[local8[local57]];
			local8[local57] = 0;
			local57++;
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt5135; local92++) {
			@Pc(101) int local101 = this.anIntArray299[local92];
			if (local101 >= 0) {
				local55[local101][local8[local101]++] = local92;
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(SSSBSSBBSI)B")
	public byte method4281() {
		if (this.anInt5134 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray41[this.anInt5134] = 3;
		this.aShortArray93[this.anInt5134] = 0;
		this.aShortArray94[this.anInt5134] = 32767;
		this.aShortArray99[this.anInt5134] = 0;
		this.anIntArray294[this.anInt5134] = 1024;
		this.anIntArray301[this.anInt5134] = 1024;
		this.anIntArray295[this.anInt5134] = 1024;
		this.aByteArray38[this.anInt5134] = 0;
		this.aByteArray39[this.anInt5134] = 0;
		this.anIntArray297[this.anInt5134] = 0;
		return (byte) this.anInt5134++;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(IIBI)I")
	public int method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5138; local7++) {
			if (arg3 == this.anIntArray298[local7] && this.anIntArray304[local7] == arg1 && arg0 == this.anIntArray302[local7]) {
				return local7;
			}
		}
		if (arg2 <= 106) {
			this.anIntArray295 = null;
		}
		this.anIntArray298[this.anInt5138] = arg3;
		this.anIntArray304[this.anInt5138] = arg1;
		this.anIntArray302[this.anInt5138] = arg0;
		this.anInt5129 = this.anInt5138 + 1;
		return this.anInt5138++;
	}
}
