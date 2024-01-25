import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class332 {

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "[I")
	public int[] anIntArray546;

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "[B")
	public byte[] aByteArray223;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "[I")
	public int[] anIntArray547;

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "[Lclient!rea;")
	public Class280[] aClass280Array4;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "[B")
	public byte[] aByteArray224;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "[S")
	public short[] aShortArray131;

	@OriginalMember(owner = "client!uo", name = "k", descriptor = "[B")
	public byte[] aByteArray225;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "[I")
	public int[] anIntArray548;

	@OriginalMember(owner = "client!uo", name = "n", descriptor = "[B")
	public byte[] aByteArray226;

	@OriginalMember(owner = "client!uo", name = "p", descriptor = "[S")
	public short[] aShortArray132;

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "[I")
	public int[] anIntArray549;

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "[I")
	public int[] anIntArray550;

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "[B")
	public byte[] aByteArray227;

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "[Lclient!af;")
	public Class10[] aClass10Array1;

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "[S")
	public short[] aShortArray133;

	@OriginalMember(owner = "client!uo", name = "z", descriptor = "[S")
	public short[] aShortArray134;

	@OriginalMember(owner = "client!uo", name = "B", descriptor = "[B")
	public byte[] aByteArray228;

	@OriginalMember(owner = "client!uo", name = "D", descriptor = "[S")
	public short[] aShortArray135;

	@OriginalMember(owner = "client!uo", name = "G", descriptor = "[Lclient!ti;")
	public Class317[] aClass317Array4;

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "[S")
	public short[] aShortArray136;

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "[I")
	public int[] anIntArray551;

	@OriginalMember(owner = "client!uo", name = "O", descriptor = "[S")
	public short[] aShortArray137;

	@OriginalMember(owner = "client!uo", name = "S", descriptor = "[I")
	public int[] anIntArray552;

	@OriginalMember(owner = "client!uo", name = "T", descriptor = "[S")
	public short[] aShortArray138;

	@OriginalMember(owner = "client!uo", name = "U", descriptor = "[S")
	public short[] aShortArray139;

	@OriginalMember(owner = "client!uo", name = "W", descriptor = "[B")
	public byte[] aByteArray229;

	@OriginalMember(owner = "client!uo", name = "Y", descriptor = "[I")
	public int[] anIntArray553;

	@OriginalMember(owner = "client!uo", name = "Z", descriptor = "[I")
	public int[] anIntArray554;

	@OriginalMember(owner = "client!uo", name = "ab", descriptor = "[I")
	public int[] anIntArray555;

	@OriginalMember(owner = "client!uo", name = "cb", descriptor = "[S")
	public short[] aShortArray140;

	@OriginalMember(owner = "client!uo", name = "db", descriptor = "[I")
	public int[] anIntArray556;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
	public int anInt9541 = 0;

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "B")
	public byte aByte126 = 0;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	public int anInt9539 = 12;

	@OriginalMember(owner = "client!uo", name = "C", descriptor = "I")
	public int anInt9546 = 0;

	@OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
	public int anInt9552 = 0;

	@OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
	public int anInt9553 = 0;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	private Class332() {
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([B)V")
	public Class332(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method7499(arg0);
		} else {
			this.method7491(arg0);
		}
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(III)V")
	public Class332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray224 = new byte[arg1];
		this.aByteArray223 = new byte[arg1];
		this.anIntArray550 = new int[arg0];
		if (arg2 > 0) {
			this.aShortArray140 = new short[arg2];
			this.aByteArray229 = new byte[arg2];
			this.anIntArray546 = new int[arg2];
			this.anIntArray554 = new int[arg2];
			this.anIntArray551 = new int[arg2];
			this.aShortArray133 = new short[arg2];
			this.anIntArray547 = new int[arg2];
			this.aByteArray225 = new byte[arg2];
			this.anIntArray556 = new int[arg2];
			this.aByteArray226 = new byte[arg2];
			this.anIntArray549 = new int[arg2];
			this.aShortArray139 = new short[arg2];
		}
		this.anIntArray552 = new int[arg1];
		this.anIntArray553 = new int[arg0];
		this.aShortArray137 = new short[arg1];
		this.aShortArray135 = new short[arg1];
		this.anIntArray548 = new int[arg0];
		this.aShortArray138 = new short[arg1];
		this.aShortArray132 = new short[arg1];
		this.aByteArray227 = new byte[arg1];
		this.anIntArray555 = new int[arg0];
		this.aShortArray136 = new short[arg1];
		this.aByteArray228 = new byte[arg1];
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([Lclient!uo;I)V")
	public Class332(@OriginalArg(0) Class332[] arg0, @OriginalArg(1) int arg1) {
		this.anInt9553 = 0;
		this.anInt9552 = 0;
		this.anInt9541 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte126 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class332 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt9541 += local59.anInt9541;
				this.anInt9553 += local59.anInt9553;
				this.anInt9552 += local59.anInt9552;
				if (local59.aClass280Array4 != null) {
					local34 += local59.aClass280Array4.length;
				}
				if (local59.aClass317Array4 != null) {
					local32 += local59.aClass317Array4.length;
				}
				local38 |= local59.aByteArray223 != null;
				if (local59.aClass10Array1 != null) {
					local36 += local59.aClass10Array1.length;
				}
				local44 |= local59.aByteArray228 != null;
				local46 |= local59.aShortArray132 != null;
				local42 |= local59.aByteArray224 != null;
				local51 |= local59.anIntArray552 != null;
				if (local59.aByteArray227 == null) {
					if (this.aByte126 == -1) {
						this.aByte126 = local59.aByte126;
					}
					if (this.aByte126 != local59.aByte126) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		this.aShortArray138 = new short[this.anInt9552];
		if (local38) {
			this.aByteArray223 = new byte[this.anInt9552];
		}
		this.aShortArray135 = new short[this.anInt9552];
		this.anIntArray555 = new int[this.anInt9541];
		if (local46) {
			this.aShortArray132 = new short[this.anInt9552];
		}
		this.aShortArray137 = new short[this.anInt9552];
		if (local40) {
			this.aByteArray227 = new byte[this.anInt9552];
		}
		if (local42) {
			this.aByteArray224 = new byte[this.anInt9552];
		}
		if (local34 > 0) {
			this.aClass280Array4 = new Class280[local34];
		}
		if (local32 > 0) {
			this.aClass317Array4 = new Class317[local32];
		}
		this.anIntArray553 = new int[this.anInt9541];
		if (local44) {
			this.aByteArray228 = new byte[this.anInt9552];
		}
		this.aShortArray134 = new short[this.anInt9541];
		this.anIntArray548 = new int[this.anInt9541];
		if (this.anInt9553 > 0) {
			this.anIntArray556 = new int[this.anInt9553];
			this.anIntArray546 = new int[this.anInt9553];
			this.aShortArray133 = new short[this.anInt9553];
			this.anIntArray547 = new int[this.anInt9553];
			this.aShortArray140 = new short[this.anInt9553];
			this.aByteArray225 = new byte[this.anInt9553];
			this.aByteArray226 = new byte[this.anInt9553];
			this.aShortArray139 = new short[this.anInt9553];
			this.anIntArray554 = new int[this.anInt9553];
			this.anIntArray549 = new int[this.anInt9553];
			this.aByteArray229 = new byte[this.anInt9553];
			this.anIntArray551 = new int[this.anInt9553];
		}
		if (local36 > 0) {
			this.aClass10Array1 = new Class10[local36];
		}
		this.anIntArray550 = new int[this.anInt9541];
		if (local51) {
			this.anIntArray552 = new int[this.anInt9552];
		}
		this.aShortArray131 = new short[this.anInt9552];
		this.aShortArray136 = new short[this.anInt9552];
		local36 = 0;
		this.anInt9541 = 0;
		this.anInt9553 = 0;
		local34 = 0;
		this.anInt9552 = 0;
		local32 = 0;
		@Pc(615) int local615;
		@Pc(626) int local626;
		for (@Pc(379) int local379 = 0; local379 < arg1; local379++) {
			@Pc(386) short local386 = (short) (0x1 << local379);
			@Pc(390) Class332 local390 = arg0[local379];
			if (local390 != null) {
				@Pc(397) int local397;
				if (local390.aClass10Array1 != null) {
					for (local397 = 0; local397 < local390.aClass10Array1.length; local397++) {
						@Pc(404) Class10 local404 = local390.aClass10Array1[local397];
						this.aClass10Array1[local36++] = local404.method93(this.anInt9552 + local404.anInt88);
					}
				}
				for (local397 = 0; local397 < local390.anInt9552; local397++) {
					if (local38 && local390.aByteArray223 != null) {
						this.aByteArray223[this.anInt9552] = local390.aByteArray223[local397];
					}
					if (local40) {
						if (local390.aByteArray227 == null) {
							this.aByteArray227[this.anInt9552] = local390.aByte126;
						} else {
							this.aByteArray227[this.anInt9552] = local390.aByteArray227[local397];
						}
					}
					if (local42 && local390.aByteArray224 != null) {
						this.aByteArray224[this.anInt9552] = local390.aByteArray224[local397];
					}
					if (local46) {
						if (local390.aShortArray132 == null) {
							this.aShortArray132[this.anInt9552] = -1;
						} else {
							this.aShortArray132[this.anInt9552] = local390.aShortArray132[local397];
						}
					}
					if (local51) {
						if (local390.anIntArray552 == null) {
							this.anIntArray552[this.anInt9552] = -1;
						} else {
							this.anIntArray552[this.anInt9552] = local390.anIntArray552[local397];
						}
					}
					this.aShortArray135[this.anInt9552] = (short) this.method7502(local390.aShortArray135[local397], local386, local390);
					this.aShortArray138[this.anInt9552] = (short) this.method7502(local390.aShortArray138[local397], local386, local390);
					this.aShortArray137[this.anInt9552] = (short) this.method7502(local390.aShortArray137[local397], local386, local390);
					this.aShortArray131[this.anInt9552] = local386;
					this.aShortArray136[this.anInt9552] = local390.aShortArray136[local397];
					this.anInt9552++;
				}
				@Pc(602) int local602;
				if (local390.aClass317Array4 != null) {
					for (local602 = 0; local602 < local390.aClass317Array4.length; local602++) {
						local615 = this.method7502(local390.aClass317Array4[local602].anInt8871, local386, local390);
						local626 = this.method7502(local390.aClass317Array4[local602].anInt8874, local386, local390);
						@Pc(637) int local637 = this.method7502(local390.aClass317Array4[local602].anInt8867, local386, local390);
						this.aClass317Array4[local32] = local390.aClass317Array4[local602].method6931(local626, local637, local615);
						local32++;
					}
				}
				if (local390.aClass280Array4 != null) {
					for (local602 = 0; local602 < local390.aClass280Array4.length; local602++) {
						local615 = this.method7502(local390.aClass280Array4[local602].anInt7963, local386, local390);
						this.aClass280Array4[local34] = local390.aClass280Array4[local602].method6280(local615);
						local34++;
					}
				}
			}
		}
		this.anInt9546 = this.anInt9541;
		@Pc(711) int local711 = 0;
		for (@Pc(713) int local713 = 0; local713 < arg1; local713++) {
			@Pc(720) short local720 = (short) (0x1 << local713);
			@Pc(724) Class332 local724 = arg0[local713];
			if (local724 != null) {
				for (local615 = 0; local615 < local724.anInt9552; local615++) {
					if (local44) {
						this.aByteArray228[local711++] = (byte) (local724.aByteArray228 == null || local724.aByteArray228[local615] == -1 ? -1 : local724.aByteArray228[local615] + this.anInt9553);
					}
				}
				for (local626 = 0; local626 < local724.anInt9553; local626++) {
					@Pc(777) byte local777 = this.aByteArray229[this.anInt9553] = local724.aByteArray229[local626];
					if (local777 == 0) {
						this.aShortArray133[this.anInt9553] = (short) this.method7502(local724.aShortArray133[local626], local720, local724);
						this.aShortArray140[this.anInt9553] = (short) this.method7502(local724.aShortArray140[local626], local720, local724);
						this.aShortArray139[this.anInt9553] = (short) this.method7502(local724.aShortArray139[local626], local720, local724);
					}
					if (local777 >= 1 && local777 <= 3) {
						this.aShortArray133[this.anInt9553] = local724.aShortArray133[local626];
						this.aShortArray140[this.anInt9553] = local724.aShortArray140[local626];
						this.aShortArray139[this.anInt9553] = local724.aShortArray139[local626];
						this.anIntArray556[this.anInt9553] = local724.anIntArray556[local626];
						this.anIntArray549[this.anInt9553] = local724.anIntArray549[local626];
						this.anIntArray554[this.anInt9553] = local724.anIntArray554[local626];
						this.aByteArray226[this.anInt9553] = local724.aByteArray226[local626];
						this.aByteArray225[this.anInt9553] = local724.aByteArray225[local626];
						this.anIntArray546[this.anInt9553] = local724.anIntArray546[local626];
					}
					if (local777 == 2) {
						this.anIntArray551[this.anInt9553] = local724.anIntArray551[local626];
						this.anIntArray547[this.anInt9553] = local724.anIntArray547[local626];
					}
					this.anInt9553++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)[[I")
	public int[][] method7488() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass10Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass10Array1[local12].anInt85;
			if (local20 >= 0) {
				if (local10 < local20) {
					local10 = local20;
				}
				@Pc(31) int local31 = local8[local20]++;
			}
		}
		@Pc(45) int[][] local45 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local45[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(71) int local71 = 0; local71 < this.aClass10Array1.length; local71++) {
			@Pc(79) int local79 = this.aClass10Array1[local71].anInt85;
			if (local79 >= 0) {
				local45[local79][local8[local79]++] = local71;
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)I")
	public int method7490(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9541; local7++) {
			if (this.anIntArray555[local7] == arg0 && arg1 == this.anIntArray550[local7] && this.anIntArray548[local7] == arg2) {
				return local7;
			}
		}
		this.anIntArray555[this.anInt9541] = arg0;
		this.anIntArray550[this.anInt9541] = arg1;
		this.anIntArray548[this.anInt9541] = arg2;
		this.anInt9546 = this.anInt9541 + 1;
		return this.anInt9541++;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([BI)V")
	private void method7491(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub26 local14 = new Class3_Sub26(arg0);
		@Pc(19) Class3_Sub26 local19 = new Class3_Sub26(arg0);
		@Pc(24) Class3_Sub26 local24 = new Class3_Sub26(arg0);
		@Pc(29) Class3_Sub26 local29 = new Class3_Sub26(arg0);
		@Pc(34) Class3_Sub26 local34 = new Class3_Sub26(arg0);
		local14.anInt8703 = arg0.length - 18;
		this.anInt9541 = local14.method6811();
		this.anInt9552 = local14.method6811();
		this.anInt9553 = local14.method6814();
		@Pc(59) int local59 = local14.method6814();
		@Pc(65) int local65 = local14.method6814();
		@Pc(69) int local69 = local14.method6814();
		@Pc(75) int local75 = local14.method6814();
		@Pc(79) int local79 = local14.method6814();
		@Pc(83) int local83 = local14.method6811();
		@Pc(89) int local89 = local14.method6811();
		@Pc(93) int local93 = local14.method6811();
		@Pc(99) int local99 = local14.method6811();
		@Pc(112) int local112 = this.anInt9541;
		@Pc(114) int local114 = local112;
		local112 += this.anInt9552;
		@Pc(121) int local121 = local112;
		if (local65 == 255) {
			local112 += this.anInt9552;
		}
		@Pc(133) int local133 = local112;
		if (local75 == 1) {
			local112 += this.anInt9552;
		}
		@Pc(145) int local145 = local112;
		if (local59 == 1) {
			local112 += this.anInt9552;
		}
		@Pc(155) int local155 = local112;
		if (local79 == 1) {
			local112 += this.anInt9541;
		}
		@Pc(165) int local165 = local112;
		if (local69 == 1) {
			local112 += this.anInt9552;
		}
		@Pc(177) int local177 = local112;
		local112 += local99;
		@Pc(183) int local183 = local112;
		local112 += this.anInt9552 * 2;
		@Pc(192) int local192 = local112;
		local112 += this.anInt9553 * 6;
		@Pc(201) int local201 = local112;
		local112 += local83;
		@Pc(207) int local207 = local112;
		local112 += local89;
		this.anIntArray555 = new int[this.anInt9541];
		if (this.anInt9553 > 0) {
			this.aShortArray133 = new short[this.anInt9553];
			this.aShortArray140 = new short[this.anInt9553];
			this.aShortArray139 = new short[this.anInt9553];
			this.aByteArray229 = new byte[this.anInt9553];
		}
		if (local75 == 1) {
			this.anIntArray552 = new int[this.anInt9552];
		}
		this.aShortArray136 = new short[this.anInt9552];
		local14.anInt8703 = 0;
		if (local59 == 1) {
			this.aByteArray223 = new byte[this.anInt9552];
			this.aByteArray228 = new byte[this.anInt9552];
			this.aShortArray132 = new short[this.anInt9552];
		}
		this.aShortArray135 = new short[this.anInt9552];
		if (local65 == 255) {
			this.aByteArray227 = new byte[this.anInt9552];
		} else {
			this.aByte126 = (byte) local65;
		}
		if (local69 == 1) {
			this.aByteArray224 = new byte[this.anInt9552];
		}
		this.anIntArray550 = new int[this.anInt9541];
		this.anIntArray548 = new int[this.anInt9541];
		this.aShortArray138 = new short[this.anInt9552];
		this.aShortArray137 = new short[this.anInt9552];
		if (local79 == 1) {
			this.anIntArray553 = new int[this.anInt9541];
		}
		local19.anInt8703 = local201;
		local24.anInt8703 = local207;
		local29.anInt8703 = local112;
		local34.anInt8703 = local155;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(364) int local364;
		@Pc(366) int local366;
		for (@Pc(356) int local356 = 0; local356 < this.anInt9541; local356++) {
			local364 = local14.method6814();
			local366 = 0;
			if ((local364 & 0x1) != 0) {
				local366 = local19.method6784();
			}
			@Pc(376) int local376 = 0;
			if ((local364 & 0x2) != 0) {
				local376 = local24.method6784();
			}
			@Pc(389) int local389 = 0;
			if ((local364 & 0x4) != 0) {
				local389 = local29.method6784();
			}
			this.anIntArray555[local356] = local350 + local366;
			this.anIntArray550[local356] = local376 + local352;
			this.anIntArray548[local356] = local354 + local389;
			local354 = this.anIntArray548[local356];
			local350 = this.anIntArray555[local356];
			local352 = this.anIntArray550[local356];
			if (local79 == 1) {
				this.anIntArray553[local356] = local34.method6814();
			}
		}
		local14.anInt8703 = local183;
		local19.anInt8703 = local145;
		local24.anInt8703 = local121;
		local29.anInt8703 = local165;
		local34.anInt8703 = local133;
		for (local364 = 0; local364 < this.anInt9552; local364++) {
			this.aShortArray136[local364] = (short) local14.method6811();
			if (local59 == 1) {
				local366 = local19.method6814();
				if ((local366 & 0x1) == 1) {
					local7 = true;
					this.aByteArray223[local364] = 1;
				} else {
					this.aByteArray223[local364] = 0;
				}
				if ((local366 & 0x2) == 2) {
					this.aByteArray228[local364] = (byte) (local366 >> 2);
					this.aShortArray132[local364] = this.aShortArray136[local364];
					this.aShortArray136[local364] = 127;
					if (this.aShortArray132[local364] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray228[local364] = -1;
					this.aShortArray132[local364] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray227[local364] = local24.method6825();
			}
			if (local69 == 1) {
				this.aByteArray224[local364] = local29.method6825();
			}
			if (local75 == 1) {
				this.anIntArray552[local364] = local34.method6814();
			}
		}
		this.anInt9546 = -1;
		local14.anInt8703 = local177;
		local19.anInt8703 = local114;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(619) int local619;
		for (@Pc(613) int local613 = 0; local613 < this.anInt9552; local613++) {
			local619 = local19.method6814();
			if (local619 == 1) {
				local605 = (short) (local611 + local14.method6784());
				local607 = (short) (local14.method6784() + local605);
				local609 = (short) (local14.method6784() + local607);
				this.aShortArray135[local613] = local605;
				local611 = local609;
				this.aShortArray138[local613] = local607;
				this.aShortArray137[local613] = local609;
				if (local605 > this.anInt9546) {
					this.anInt9546 = local605;
				}
				if (this.anInt9546 < local607) {
					this.anInt9546 = local607;
				}
				if (local609 > this.anInt9546) {
					this.anInt9546 = local609;
				}
			}
			if (local619 == 2) {
				local607 = local609;
				local609 = (short) (local14.method6784() + local611);
				this.aShortArray135[local613] = local605;
				local611 = local609;
				this.aShortArray138[local613] = local607;
				this.aShortArray137[local613] = local609;
				if (local609 > this.anInt9546) {
					this.anInt9546 = local609;
				}
			}
			if (local619 == 3) {
				local605 = local609;
				local609 = (short) (local611 + local14.method6784());
				this.aShortArray135[local613] = local605;
				local611 = local609;
				this.aShortArray138[local613] = local607;
				this.aShortArray137[local613] = local609;
				if (local609 > this.anInt9546) {
					this.anInt9546 = local609;
				}
			}
			if (local619 == 4) {
				@Pc(776) short local776 = local605;
				local605 = local607;
				local609 = (short) (local611 + local14.method6784());
				local607 = local776;
				this.aShortArray135[local613] = local605;
				local611 = local609;
				this.aShortArray138[local613] = local776;
				this.aShortArray137[local613] = local609;
				if (local609 > this.anInt9546) {
					this.anInt9546 = local609;
				}
			}
		}
		this.anInt9546++;
		local14.anInt8703 = local192;
		for (local619 = 0; local619 < this.anInt9553; local619++) {
			this.aByteArray229[local619] = 0;
			this.aShortArray133[local619] = (short) local14.method6811();
			this.aShortArray140[local619] = (short) local14.method6811();
			this.aShortArray139[local619] = (short) local14.method6811();
		}
		if (this.aByteArray228 != null) {
			@Pc(874) boolean local874 = false;
			for (@Pc(876) int local876 = 0; local876 < this.anInt9552; local876++) {
				@Pc(885) int local885 = this.aByteArray228[local876] & 0xFF;
				if (local885 != 255) {
					if ((this.aShortArray133[local885] & 0xFFFF) == this.aShortArray135[local876] && this.aShortArray138[local876] == (this.aShortArray140[local885] & 0xFFFF) && (this.aShortArray139[local885] & 0xFFFF) == this.aShortArray137[local876]) {
						this.aByteArray228[local876] = -1;
					} else {
						local874 = true;
					}
				}
			}
			if (!local874) {
				this.aByteArray228 = null;
			}
		}
		if (!local7) {
			this.aByteArray223 = null;
		}
		if (!local9) {
			this.aShortArray132 = null;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(SSBBSSBBSS)B")
	public byte method7492() {
		if (this.anInt9553 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray229[this.anInt9553] = 3;
		this.aShortArray133[this.anInt9553] = 0;
		this.aShortArray140[this.anInt9553] = 32767;
		this.aShortArray139[this.anInt9553] = 0;
		this.anIntArray556[this.anInt9553] = 1024;
		this.anIntArray549[this.anInt9553] = 1024;
		this.anIntArray554[this.anInt9553] = 1024;
		this.aByteArray226[this.anInt9553] = 0;
		this.aByteArray225[this.anInt9553] = 0;
		this.anIntArray546[this.anInt9553] = 0;
		return (byte) this.anInt9553++;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIII)V")
	public void method7493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9541; local7++) {
			this.anIntArray555[local7] += arg1;
			this.anIntArray550[local7] += arg0;
			this.anIntArray548[local7] += arg2;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BSBSIIBII)I")
	public int method7495(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) short arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray135[this.anInt9552] = (short) arg5;
		this.aShortArray138[this.anInt9552] = (short) arg4;
		this.aShortArray137[this.anInt9552] = (short) arg7;
		this.aByteArray223[this.anInt9552] = arg2;
		this.aByteArray228[this.anInt9552] = arg0;
		this.aShortArray136[this.anInt9552] = arg3;
		this.aByteArray224[this.anInt9552] = arg6;
		this.aShortArray132[this.anInt9552] = arg1;
		return this.anInt9552++;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(SSI)V")
	public void method7496(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray132 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt9552; local11++) {
			if (this.aShortArray132[local11] == arg1) {
				this.aShortArray132[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BZ)[[I")
	public int[][] method7497(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt9541 : this.anInt9546;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray553[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < local18; local81++) {
			@Pc(88) int local88 = this.anIntArray553[local81];
			if (local88 >= 0) {
				local54[local88][local8[local88]++] = local81;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ISS)V")
	public void method7498(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt9552; local13++) {
			if (this.aShortArray136[local13] == arg0) {
				this.aShortArray136[local13] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "([BI)V")
	private void method7499(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub26 local10 = new Class3_Sub26(arg0);
		@Pc(15) Class3_Sub26 local15 = new Class3_Sub26(arg0);
		@Pc(20) Class3_Sub26 local20 = new Class3_Sub26(arg0);
		@Pc(25) Class3_Sub26 local25 = new Class3_Sub26(arg0);
		@Pc(30) Class3_Sub26 local30 = new Class3_Sub26(arg0);
		@Pc(35) Class3_Sub26 local35 = new Class3_Sub26(arg0);
		@Pc(40) Class3_Sub26 local40 = new Class3_Sub26(arg0);
		local10.anInt8703 = arg0.length - 23;
		this.anInt9541 = local10.method6811();
		this.anInt9552 = local10.method6811();
		this.anInt9553 = local10.method6814();
		@Pc(69) int local69 = local10.method6814();
		@Pc(80) boolean local80 = (local69 & 0x1) == 1;
		@Pc(91) boolean local91 = (local69 & 0x2) == 2;
		@Pc(100) boolean local100 = (local69 & 0x4) == 4;
		@Pc(109) boolean local109 = (local69 & 0x8) == 8;
		if (local109) {
			local10.anInt8703 -= 7;
			this.anInt9539 = local10.method6814();
			local10.anInt8703 += 6;
		}
		@Pc(134) int local134 = local10.method6814();
		@Pc(140) int local140 = local10.method6814();
		@Pc(144) int local144 = local10.method6814();
		@Pc(148) int local148 = local10.method6814();
		@Pc(152) int local152 = local10.method6814();
		@Pc(156) int local156 = local10.method6811();
		@Pc(162) int local162 = local10.method6811();
		@Pc(166) int local166 = local10.method6811();
		@Pc(172) int local172 = local10.method6811();
		@Pc(176) int local176 = local10.method6811();
		@Pc(178) int local178 = 0;
		@Pc(180) int local180 = 0;
		@Pc(182) int local182 = 0;
		@Pc(195) int local195;
		if (this.anInt9553 > 0) {
			local10.anInt8703 = 0;
			this.aByteArray229 = new byte[this.anInt9553];
			for (local195 = 0; local195 < this.anInt9553; local195++) {
				@Pc(206) byte local206 = this.aByteArray229[local195] = local10.method6825();
				if (local206 >= 1 && local206 <= 3) {
					local180++;
				}
				if (local206 == 0) {
					local178++;
				}
				if (local206 == 2) {
					local182++;
				}
			}
		}
		local195 = this.anInt9553;
		@Pc(236) int local236 = local195;
		local195 += this.anInt9541;
		@Pc(243) int local243 = local195;
		if (local80) {
			local195 += this.anInt9552;
		}
		@Pc(252) int local252 = local195;
		local195 += this.anInt9552;
		@Pc(259) int local259 = local195;
		if (local134 == 255) {
			local195 += this.anInt9552;
		}
		@Pc(271) int local271 = local195;
		if (local144 == 1) {
			local195 += this.anInt9552;
		}
		@Pc(281) int local281 = local195;
		if (local152 == 1) {
			local195 += this.anInt9541;
		}
		@Pc(293) int local293 = local195;
		if (local140 == 1) {
			local195 += this.anInt9552;
		}
		@Pc(303) int local303 = local195;
		local195 += local172;
		@Pc(309) int local309 = local195;
		if (local148 == 1) {
			local195 += this.anInt9552 * 2;
		}
		@Pc(321) int local321 = local195;
		local195 += local176;
		@Pc(327) int local327 = local195;
		local195 += this.anInt9552 * 2;
		@Pc(336) int local336 = local195;
		local195 += local156;
		@Pc(342) int local342 = local195;
		local195 += local162;
		@Pc(348) int local348 = local195;
		local195 += local166;
		@Pc(354) int local354 = local195;
		local195 += local178 * 6;
		@Pc(362) int local362 = local195;
		local195 += local180 * 6;
		@Pc(370) byte local370 = 6;
		if (this.anInt9539 == 14) {
			local370 = 7;
		} else if (this.anInt9539 >= 15) {
			local370 = 9;
		}
		@Pc(390) int local390 = local195;
		local195 += local370 * local180;
		@Pc(398) int local398 = local195;
		local195 += local180;
		@Pc(404) int local404 = local195;
		local195 += local180;
		@Pc(410) int local410 = local195;
		local195 += local182 * 2 + local180;
		if (local144 == 1) {
			this.anIntArray552 = new int[this.anInt9552];
		}
		if (local148 == 1 && this.anInt9553 > 0) {
			this.aByteArray228 = new byte[this.anInt9552];
		}
		this.aShortArray135 = new short[this.anInt9552];
		local10.anInt8703 = local236;
		if (local152 == 1) {
			this.anIntArray553 = new int[this.anInt9541];
		}
		if (this.anInt9553 > 0) {
			if (local180 > 0) {
				this.anIntArray554 = new int[local180];
				this.anIntArray546 = new int[local180];
				this.anIntArray549 = new int[local180];
				this.aByteArray226 = new byte[local180];
				this.aByteArray225 = new byte[local180];
				this.anIntArray556 = new int[local180];
			}
			this.aShortArray139 = new short[this.anInt9553];
			this.aShortArray140 = new short[this.anInt9553];
			this.aShortArray133 = new short[this.anInt9553];
			if (local182 > 0) {
				this.anIntArray547 = new int[local182];
				this.anIntArray551 = new int[local182];
			}
		}
		this.aShortArray138 = new short[this.anInt9552];
		this.aShortArray137 = new short[this.anInt9552];
		this.anIntArray550 = new int[this.anInt9541];
		this.aShortArray136 = new short[this.anInt9552];
		if (local80) {
			this.aByteArray223 = new byte[this.anInt9552];
		}
		this.anIntArray548 = new int[this.anInt9541];
		if (local148 == 1) {
			this.aShortArray132 = new short[this.anInt9552];
		}
		if (local134 == 255) {
			this.aByteArray227 = new byte[this.anInt9552];
		} else {
			this.aByte126 = (byte) local134;
		}
		if (local140 == 1) {
			this.aByteArray224 = new byte[this.anInt9552];
		}
		this.anIntArray555 = new int[this.anInt9541];
		local15.anInt8703 = local336;
		local20.anInt8703 = local342;
		local25.anInt8703 = local348;
		local30.anInt8703 = local281;
		@Pc(607) int local607 = 0;
		@Pc(609) int local609 = 0;
		@Pc(611) int local611 = 0;
		@Pc(619) int local619;
		for (@Pc(613) int local613 = 0; local613 < this.anInt9541; local613++) {
			local619 = local10.method6814();
			@Pc(621) int local621 = 0;
			if ((local619 & 0x1) != 0) {
				local621 = local15.method6784();
			}
			@Pc(631) int local631 = 0;
			if ((local619 & 0x2) != 0) {
				local631 = local20.method6784();
			}
			@Pc(644) int local644 = 0;
			if ((local619 & 0x4) != 0) {
				local644 = local25.method6784();
			}
			this.anIntArray555[local613] = local621 + local607;
			this.anIntArray550[local613] = local631 + local609;
			this.anIntArray548[local613] = local611 + local644;
			local609 = this.anIntArray550[local613];
			local607 = this.anIntArray555[local613];
			local611 = this.anIntArray548[local613];
			if (local152 == 1) {
				this.anIntArray553[local613] = local30.method6814();
			}
		}
		local10.anInt8703 = local327;
		local15.anInt8703 = local243;
		local20.anInt8703 = local259;
		local25.anInt8703 = local293;
		local30.anInt8703 = local271;
		local35.anInt8703 = local309;
		local40.anInt8703 = local321;
		for (local619 = 0; local619 < this.anInt9552; local619++) {
			this.aShortArray136[local619] = (short) local10.method6811();
			if (local80) {
				this.aByteArray223[local619] = local15.method6825();
			}
			if (local134 == 255) {
				this.aByteArray227[local619] = local20.method6825();
			}
			if (local140 == 1) {
				this.aByteArray224[local619] = local25.method6825();
			}
			if (local144 == 1) {
				this.anIntArray552[local619] = local30.method6814();
			}
			if (local148 == 1) {
				this.aShortArray132[local619] = (short) (local35.method6811() - 1);
			}
			if (this.aByteArray228 != null) {
				if (this.aShortArray132[local619] == -1) {
					this.aByteArray228[local619] = -1;
				} else {
					this.aByteArray228[local619] = (byte) (local40.method6814() - 1);
				}
			}
		}
		this.anInt9546 = -1;
		local10.anInt8703 = local303;
		local15.anInt8703 = local252;
		@Pc(845) short local845 = 0;
		@Pc(847) short local847 = 0;
		@Pc(850) short local850 = 0;
		@Pc(852) short local852 = 0;
		@Pc(860) int local860;
		for (@Pc(854) int local854 = 0; local854 < this.anInt9552; local854++) {
			local860 = local15.method6814();
			if (local860 == 1) {
				local845 = (short) (local852 + local10.method6784());
				local847 = (short) (local845 + local10.method6784());
				local850 = (short) (local10.method6784() + local847);
				local852 = local850;
				this.aShortArray135[local854] = local845;
				this.aShortArray138[local854] = local847;
				this.aShortArray137[local854] = local850;
				if (this.anInt9546 < local845) {
					this.anInt9546 = local845;
				}
				if (local847 > this.anInt9546) {
					this.anInt9546 = local847;
				}
				if (this.anInt9546 < local850) {
					this.anInt9546 = local850;
				}
			}
			if (local860 == 2) {
				local847 = local850;
				local850 = (short) (local852 + local10.method6784());
				this.aShortArray135[local854] = local845;
				local852 = local850;
				this.aShortArray138[local854] = local847;
				this.aShortArray137[local854] = local850;
				if (local850 > this.anInt9546) {
					this.anInt9546 = local850;
				}
			}
			if (local860 == 3) {
				local845 = local850;
				local850 = (short) (local852 + local10.method6784());
				this.aShortArray135[local854] = local845;
				local852 = local850;
				this.aShortArray138[local854] = local847;
				this.aShortArray137[local854] = local850;
				if (this.anInt9546 < local850) {
					this.anInt9546 = local850;
				}
			}
			if (local860 == 4) {
				@Pc(1021) short local1021 = local845;
				local845 = local847;
				local850 = (short) (local10.method6784() + local852);
				local847 = local1021;
				this.aShortArray135[local854] = local845;
				local852 = local850;
				this.aShortArray138[local854] = local1021;
				this.aShortArray137[local854] = local850;
				if (this.anInt9546 < local850) {
					this.anInt9546 = local850;
				}
			}
		}
		this.anInt9546++;
		local10.anInt8703 = local354;
		local15.anInt8703 = local362;
		local20.anInt8703 = local390;
		local25.anInt8703 = local398;
		local30.anInt8703 = local404;
		local35.anInt8703 = local410;
		@Pc(1100) int local1100;
		for (local860 = 0; local860 < this.anInt9553; local860++) {
			local1100 = this.aByteArray229[local860] & 0xFF;
			if (local1100 == 0) {
				this.aShortArray133[local860] = (short) local10.method6811();
				this.aShortArray140[local860] = (short) local10.method6811();
				this.aShortArray139[local860] = (short) local10.method6811();
			}
			if (local1100 == 1) {
				this.aShortArray133[local860] = (short) local15.method6811();
				this.aShortArray140[local860] = (short) local15.method6811();
				this.aShortArray139[local860] = (short) local15.method6811();
				if (this.anInt9539 >= 15) {
					this.anIntArray556[local860] = local20.method6830();
					this.anIntArray549[local860] = local20.method6830();
					this.anIntArray554[local860] = local20.method6830();
				} else {
					this.anIntArray556[local860] = local20.method6811();
					if (this.anInt9539 >= 14) {
						this.anIntArray549[local860] = local20.method6830();
					} else {
						this.anIntArray549[local860] = local20.method6811();
					}
					this.anIntArray554[local860] = local20.method6811();
				}
				this.aByteArray226[local860] = local25.method6825();
				this.aByteArray225[local860] = local30.method6825();
				this.anIntArray546[local860] = local35.method6825();
			}
			if (local1100 == 2) {
				this.aShortArray133[local860] = (short) local15.method6811();
				this.aShortArray140[local860] = (short) local15.method6811();
				this.aShortArray139[local860] = (short) local15.method6811();
				if (this.anInt9539 < 15) {
					this.anIntArray556[local860] = local20.method6811();
					if (this.anInt9539 >= 14) {
						this.anIntArray549[local860] = local20.method6830();
					} else {
						this.anIntArray549[local860] = local20.method6811();
					}
					this.anIntArray554[local860] = local20.method6811();
				} else {
					this.anIntArray556[local860] = local20.method6830();
					this.anIntArray549[local860] = local20.method6830();
					this.anIntArray554[local860] = local20.method6830();
				}
				this.aByteArray226[local860] = local25.method6825();
				this.aByteArray225[local860] = local30.method6825();
				this.anIntArray546[local860] = local35.method6825();
				this.anIntArray551[local860] = local35.method6825();
				this.anIntArray547[local860] = local35.method6825();
			}
			if (local1100 == 3) {
				this.aShortArray133[local860] = (short) local15.method6811();
				this.aShortArray140[local860] = (short) local15.method6811();
				this.aShortArray139[local860] = (short) local15.method6811();
				if (this.anInt9539 < 15) {
					this.anIntArray556[local860] = local20.method6811();
					if (this.anInt9539 >= 14) {
						this.anIntArray549[local860] = local20.method6830();
					} else {
						this.anIntArray549[local860] = local20.method6811();
					}
					this.anIntArray554[local860] = local20.method6811();
				} else {
					this.anIntArray556[local860] = local20.method6830();
					this.anIntArray549[local860] = local20.method6830();
					this.anIntArray554[local860] = local20.method6830();
				}
				this.aByteArray226[local860] = local25.method6825();
				this.aByteArray225[local860] = local30.method6825();
				this.anIntArray546[local860] = local35.method6825();
			}
		}
		local10.anInt8703 = local195;
		@Pc(1516) int local1516;
		@Pc(1524) int local1524;
		@Pc(1528) int local1528;
		@Pc(1593) int local1593;
		if (local91) {
			local1100 = local10.method6814();
			if (local1100 > 0) {
				this.aClass317Array4 = new Class317[local1100];
				for (local1516 = 0; local1516 < local1100; local1516++) {
					local1524 = local10.method6811();
					local1528 = local10.method6811();
					@Pc(1536) byte local1536;
					if (local134 == 255) {
						local1536 = this.aByteArray227[local1528];
					} else {
						local1536 = (byte) local134;
					}
					this.aClass317Array4[local1516] = new Class317(local1524, this.aShortArray135[local1528], this.aShortArray138[local1528], this.aShortArray137[local1528], local1536);
				}
			}
			local1516 = local10.method6814();
			if (local1516 > 0) {
				this.aClass280Array4 = new Class280[local1516];
				for (local1524 = 0; local1524 < local1516; local1524++) {
					local1528 = local10.method6811();
					local1593 = local10.method6811();
					this.aClass280Array4[local1524] = new Class280(local1528, local1593);
				}
			}
		}
		if (!local100) {
			return;
		}
		local1100 = local10.method6814();
		if (local1100 <= 0) {
			return;
		}
		this.aClass10Array1 = new Class10[local1100];
		for (local1516 = 0; local1516 < local1100; local1516++) {
			local1524 = local10.method6811();
			local1528 = local10.method6811();
			local1593 = local10.method6814();
			@Pc(1641) byte local1641 = local10.method6825();
			this.aClass10Array1[local1516] = new Class10(local1524, local1528, local1593, local1641);
		}
		return;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)[[I")
	public int[][] method7501() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt9552; local17++) {
			@Pc(24) int local24 = this.anIntArray552[local17];
			if (local24 >= 0) {
				@Pc(30) int local30 = local8[local24]++;
				if (local24 > local10) {
					local10 = local24;
				}
			}
		}
		@Pc(48) int[][] local48 = new int[local10 + 1][];
		for (@Pc(50) int local50 = 0; local50 <= local10; local50++) {
			local48[local50] = new int[local8[local50]];
			local8[local50] = 0;
		}
		for (@Pc(69) int local69 = 0; local69 < this.anInt9552; local69++) {
			@Pc(76) int local76 = this.anIntArray552[local69];
			if (local76 >= 0) {
				local48[local76][local8[local76]++] = local69;
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(ISBLclient!uo;)I")
	private int method7502(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) Class332 arg2) {
		@Pc(10) int local10 = arg2.anIntArray555[arg0];
		@Pc(22) int local22 = arg2.anIntArray550[arg0];
		@Pc(27) int local27 = arg2.anIntArray548[arg0];
		for (@Pc(29) int local29 = 0; local29 < this.anInt9541; local29++) {
			if (local10 == this.anIntArray555[local29] && local22 == this.anIntArray550[local29] && local27 == this.anIntArray548[local29]) {
				this.aShortArray134[local29] |= arg1;
				return local29;
			}
		}
		this.anIntArray555[this.anInt9541] = local10;
		this.anIntArray550[this.anInt9541] = local22;
		this.anIntArray548[this.anInt9541] = local27;
		this.aShortArray134[this.anInt9541] = arg1;
		this.anIntArray553[this.anInt9541] = arg2.anIntArray553 == null ? -1 : arg2.anIntArray553[arg0];
		return this.anInt9541++;
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)V")
	public void method7503() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9541; local7++) {
			this.anIntArray555[local7] <<= 0x2;
			this.anIntArray550[local7] <<= 0x2;
			this.anIntArray548[local7] <<= 0x2;
		}
		if (this.anInt9553 <= 0 || this.anIntArray556 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray556.length; local56++) {
			this.anIntArray556[local56] <<= 0x2;
			this.anIntArray549[local56] <<= 0x2;
			if (this.aByteArray229[local56] != 1) {
				this.anIntArray554[local56] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIII)V")
	public void method7504(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg1 != 0) {
			local14 = Class3_Sub28.anIntArray232[arg1];
			local18 = Class3_Sub28.anIntArray231[arg1];
			for (local20 = 0; local20 < this.anInt9541; local20++) {
				local38 = local14 * this.anIntArray550[local20] + this.anIntArray555[local20] * local18 >> 14;
				this.anIntArray550[local20] = this.anIntArray550[local20] * local18 - local14 * this.anIntArray555[local20] >> 14;
				this.anIntArray555[local20] = local38;
			}
		}
		if (arg2 != 0) {
			local14 = Class3_Sub28.anIntArray232[arg2];
			local18 = Class3_Sub28.anIntArray231[arg2];
			for (local20 = 0; local20 < this.anInt9541; local20++) {
				local38 = local18 * this.anIntArray550[local20] - local14 * this.anIntArray548[local20] >> 14;
				this.anIntArray548[local20] = this.anIntArray550[local20] * local14 + local18 * this.anIntArray548[local20] >> 14;
				this.anIntArray550[local20] = local38;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local14 = Class3_Sub28.anIntArray232[arg0];
		local18 = Class3_Sub28.anIntArray231[arg0];
		for (local20 = 0; local20 < this.anInt9541; local20++) {
			local38 = this.anIntArray548[local20] * local14 + local18 * this.anIntArray555[local20] >> 14;
			this.anIntArray548[local20] = this.anIntArray548[local20] * local18 - local14 * this.anIntArray555[local20] >> 14;
			this.anIntArray555[local20] = local38;
		}
	}
}
