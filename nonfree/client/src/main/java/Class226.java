import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class226 {

	@OriginalMember(owner = "client!nda", name = "d", descriptor = "[S")
	public short[] aShortArray193;

	@OriginalMember(owner = "client!nda", name = "e", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!nda", name = "f", descriptor = "[I")
	public int[] anIntArray474;

	@OriginalMember(owner = "client!nda", name = "h", descriptor = "[S")
	public short[] aShortArray194;

	@OriginalMember(owner = "client!nda", name = "i", descriptor = "[I")
	public int[] anIntArray475;

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!nda", name = "k", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!nda", name = "n", descriptor = "[S")
	public short[] aShortArray195;

	@OriginalMember(owner = "client!nda", name = "p", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!nda", name = "r", descriptor = "[I")
	public int[] anIntArray476;

	@OriginalMember(owner = "client!nda", name = "t", descriptor = "[S")
	public short[] aShortArray196;

	@OriginalMember(owner = "client!nda", name = "u", descriptor = "[Lclient!tk;")
	public Class323[] aClass323Array3;

	@OriginalMember(owner = "client!nda", name = "v", descriptor = "[I")
	public int[] anIntArray477;

	@OriginalMember(owner = "client!nda", name = "w", descriptor = "[Lclient!jca;")
	public Class161[] aClass161Array1;

	@OriginalMember(owner = "client!nda", name = "x", descriptor = "[I")
	public int[] anIntArray478;

	@OriginalMember(owner = "client!nda", name = "y", descriptor = "[S")
	public short[] aShortArray197;

	@OriginalMember(owner = "client!nda", name = "z", descriptor = "[I")
	public int[] anIntArray479;

	@OriginalMember(owner = "client!nda", name = "A", descriptor = "[S")
	public short[] aShortArray198;

	@OriginalMember(owner = "client!nda", name = "B", descriptor = "[I")
	public int[] anIntArray480;

	@OriginalMember(owner = "client!nda", name = "C", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!nda", name = "H", descriptor = "[S")
	public short[] aShortArray199;

	@OriginalMember(owner = "client!nda", name = "I", descriptor = "[I")
	public int[] anIntArray482;

	@OriginalMember(owner = "client!nda", name = "J", descriptor = "[I")
	public int[] anIntArray483;

	@OriginalMember(owner = "client!nda", name = "K", descriptor = "[S")
	public short[] aShortArray200;

	@OriginalMember(owner = "client!nda", name = "P", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!nda", name = "Q", descriptor = "[Lclient!aq;")
	public Class15[] aClass15Array3;

	@OriginalMember(owner = "client!nda", name = "T", descriptor = "[S")
	public short[] aShortArray201;

	@OriginalMember(owner = "client!nda", name = "U", descriptor = "[S")
	public short[] aShortArray202;

	@OriginalMember(owner = "client!nda", name = "X", descriptor = "[I")
	public int[] anIntArray484;

	@OriginalMember(owner = "client!nda", name = "Y", descriptor = "[I")
	public int[] anIntArray485;

	@OriginalMember(owner = "client!nda", name = "ab", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
	public int anInt6103 = 12;

	@OriginalMember(owner = "client!nda", name = "q", descriptor = "B")
	public byte aByte76 = 0;

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
	public int anInt6105 = 0;

	@OriginalMember(owner = "client!nda", name = "o", descriptor = "I")
	public int anInt6108 = 0;

	@OriginalMember(owner = "client!nda", name = "Z", descriptor = "I")
	public int anInt6119 = 0;

	@OriginalMember(owner = "client!nda", name = "R", descriptor = "I")
	public int anInt6115 = 0;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "()V")
	private Class226() {
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "([B)V")
	public Class226(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5288(arg0);
		} else {
			this.method5282(arg0);
		}
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(III)V")
	public Class226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray485 = new int[arg0];
		this.anIntArray479 = new int[arg1];
		this.aShortArray199 = new short[arg1];
		this.aByteArray74 = new byte[arg1];
		this.anIntArray483 = new int[arg0];
		this.aByteArray73 = new byte[arg1];
		this.aShortArray195 = new short[arg1];
		this.aShortArray200 = new short[arg1];
		this.aShortArray193 = new short[arg1];
		this.aByteArray75 = new byte[arg1];
		this.aShortArray194 = new short[arg1];
		this.aByteArray76 = new byte[arg1];
		this.anIntArray475 = new int[arg0];
		this.anIntArray478 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray72 = new byte[arg2];
			this.anIntArray476 = new int[arg2];
			this.anIntArray474 = new int[arg2];
			this.aShortArray202 = new short[arg2];
			this.aByteArray71 = new byte[arg2];
			this.aByteArray77 = new byte[arg2];
			this.anIntArray480 = new int[arg2];
			this.anIntArray482 = new int[arg2];
			this.anIntArray484 = new int[arg2];
			this.anIntArray477 = new int[arg2];
			this.aShortArray196 = new short[arg2];
			this.aShortArray201 = new short[arg2];
		}
	}

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "([Lclient!nda;I)V")
	public Class226(@OriginalArg(0) Class226[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6119 = 0;
		this.anInt6105 = 0;
		this.anInt6115 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte76 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class226 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt6119 += local59.anInt6119;
				this.anInt6105 += local59.anInt6105;
				this.anInt6115 += local59.anInt6115;
				if (local59.aClass15Array3 != null) {
					local34 += local59.aClass15Array3.length;
				}
				if (local59.aClass161Array1 != null) {
					local36 += local59.aClass161Array1.length;
				}
				local38 |= local59.aByteArray73 != null;
				if (local59.aClass323Array3 != null) {
					local32 += local59.aClass323Array3.length;
				}
				local44 |= local59.aByteArray75 != null;
				local46 |= local59.aShortArray200 != null;
				local42 |= local59.aByteArray76 != null;
				local51 |= local59.anIntArray479 != null;
				if (local59.aByteArray74 == null) {
					if (this.aByte76 == -1) {
						this.aByte76 = local59.aByte76;
					}
					if (local59.aByte76 != this.aByte76) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
			}
		}
		if (local34 > 0) {
			this.aClass15Array3 = new Class15[local34];
		}
		if (local44) {
			this.aByteArray75 = new byte[this.anInt6105];
		}
		if (local38) {
			this.aByteArray73 = new byte[this.anInt6105];
		}
		this.aShortArray197 = new short[this.anInt6119];
		this.anIntArray483 = new int[this.anInt6119];
		if (local42) {
			this.aByteArray76 = new byte[this.anInt6105];
		}
		if (local36 > 0) {
			this.aClass161Array1 = new Class161[local36];
		}
		this.anIntArray475 = new int[this.anInt6119];
		this.anIntArray485 = new int[this.anInt6119];
		this.aShortArray199 = new short[this.anInt6105];
		this.aShortArray198 = new short[this.anInt6105];
		if (local32 > 0) {
			this.aClass323Array3 = new Class323[local32];
		}
		if (local51) {
			this.anIntArray479 = new int[this.anInt6105];
		}
		this.aShortArray193 = new short[this.anInt6105];
		if (this.anInt6115 > 0) {
			this.anIntArray474 = new int[this.anInt6115];
			this.aByteArray72 = new byte[this.anInt6115];
			this.anIntArray484 = new int[this.anInt6115];
			this.aByteArray71 = new byte[this.anInt6115];
			this.anIntArray480 = new int[this.anInt6115];
			this.aShortArray202 = new short[this.anInt6115];
			this.anIntArray476 = new int[this.anInt6115];
			this.aShortArray201 = new short[this.anInt6115];
			this.aByteArray77 = new byte[this.anInt6115];
			this.anIntArray482 = new int[this.anInt6115];
			this.aShortArray196 = new short[this.anInt6115];
			this.anIntArray477 = new int[this.anInt6115];
		}
		this.anIntArray478 = new int[this.anInt6119];
		this.aShortArray194 = new short[this.anInt6105];
		if (local40) {
			this.aByteArray74 = new byte[this.anInt6105];
		}
		if (local46) {
			this.aShortArray200 = new short[this.anInt6105];
		}
		this.aShortArray195 = new short[this.anInt6105];
		local34 = 0;
		local32 = 0;
		local36 = 0;
		this.anInt6105 = 0;
		this.anInt6115 = 0;
		this.anInt6119 = 0;
		@Pc(617) int local617;
		@Pc(628) int local628;
		for (@Pc(380) int local380 = 0; local380 < arg1; local380++) {
			@Pc(387) short local387 = (short) (0x1 << local380);
			@Pc(391) Class226 local391 = arg0[local380];
			if (local391 != null) {
				@Pc(398) int local398;
				if (local391.aClass161Array1 != null) {
					for (local398 = 0; local398 < local391.aClass161Array1.length; local398++) {
						@Pc(405) Class161 local405 = local391.aClass161Array1[local398];
						this.aClass161Array1[local36++] = local405.method4002(local405.anInt4511 + this.anInt6105);
					}
				}
				for (local398 = 0; local398 < local391.anInt6105; local398++) {
					if (local38 && local391.aByteArray73 != null) {
						this.aByteArray73[this.anInt6105] = local391.aByteArray73[local398];
					}
					if (local40) {
						if (local391.aByteArray74 == null) {
							this.aByteArray74[this.anInt6105] = local391.aByte76;
						} else {
							this.aByteArray74[this.anInt6105] = local391.aByteArray74[local398];
						}
					}
					if (local42 && local391.aByteArray76 != null) {
						this.aByteArray76[this.anInt6105] = local391.aByteArray76[local398];
					}
					if (local46) {
						if (local391.aShortArray200 == null) {
							this.aShortArray200[this.anInt6105] = -1;
						} else {
							this.aShortArray200[this.anInt6105] = local391.aShortArray200[local398];
						}
					}
					if (local51) {
						if (local391.anIntArray479 == null) {
							this.anIntArray479[this.anInt6105] = -1;
						} else {
							this.anIntArray479[this.anInt6105] = local391.anIntArray479[local398];
						}
					}
					this.aShortArray193[this.anInt6105] = (short) this.method5297(local391.aShortArray193[local398], local391, local387);
					this.aShortArray194[this.anInt6105] = (short) this.method5297(local391.aShortArray194[local398], local391, local387);
					this.aShortArray195[this.anInt6105] = (short) this.method5297(local391.aShortArray195[local398], local391, local387);
					this.aShortArray198[this.anInt6105] = local387;
					this.aShortArray199[this.anInt6105] = local391.aShortArray199[local398];
					this.anInt6105++;
				}
				@Pc(604) int local604;
				if (local391.aClass323Array3 != null) {
					for (local604 = 0; local604 < local391.aClass323Array3.length; local604++) {
						local617 = this.method5297(local391.aClass323Array3[local604].anInt8095, local391, local387);
						local628 = this.method5297(local391.aClass323Array3[local604].anInt8103, local391, local387);
						@Pc(639) int local639 = this.method5297(local391.aClass323Array3[local604].anInt8106, local391, local387);
						this.aClass323Array3[local32] = local391.aClass323Array3[local604].method6825(local628, local639, local617);
						local32++;
					}
				}
				if (local391.aClass15Array3 != null) {
					for (local604 = 0; local604 < local391.aClass15Array3.length; local604++) {
						local617 = this.method5297(local391.aClass15Array3[local604].anInt548, local391, local387);
						this.aClass15Array3[local34] = local391.aClass15Array3[local604].method440(local617);
						local34++;
					}
				}
			}
		}
		@Pc(705) int local705 = 0;
		this.anInt6108 = this.anInt6119;
		for (@Pc(711) int local711 = 0; local711 < arg1; local711++) {
			@Pc(718) short local718 = (short) (0x1 << local711);
			@Pc(722) Class226 local722 = arg0[local711];
			if (local722 != null) {
				for (local617 = 0; local617 < local722.anInt6105; local617++) {
					if (local44) {
						this.aByteArray75[local705++] = (byte) (local722.aByteArray75 == null || local722.aByteArray75[local617] == -1 ? -1 : this.anInt6115 + local722.aByteArray75[local617]);
					}
				}
				for (local628 = 0; local628 < local722.anInt6115; local628++) {
					@Pc(779) byte local779 = this.aByteArray72[this.anInt6115] = local722.aByteArray72[local628];
					if (local779 == 0) {
						this.aShortArray202[this.anInt6115] = (short) this.method5297(local722.aShortArray202[local628], local722, local718);
						this.aShortArray196[this.anInt6115] = (short) this.method5297(local722.aShortArray196[local628], local722, local718);
						this.aShortArray201[this.anInt6115] = (short) this.method5297(local722.aShortArray201[local628], local722, local718);
					}
					if (local779 >= 1 && local779 <= 3) {
						this.aShortArray202[this.anInt6115] = local722.aShortArray202[local628];
						this.aShortArray196[this.anInt6115] = local722.aShortArray196[local628];
						this.aShortArray201[this.anInt6115] = local722.aShortArray201[local628];
						this.anIntArray482[this.anInt6115] = local722.anIntArray482[local628];
						this.anIntArray484[this.anInt6115] = local722.anIntArray484[local628];
						this.anIntArray477[this.anInt6115] = local722.anIntArray477[local628];
						this.aByteArray77[this.anInt6115] = local722.aByteArray77[local628];
						this.aByteArray71[this.anInt6115] = local722.aByteArray71[local628];
						this.anIntArray480[this.anInt6115] = local722.anIntArray480[local628];
					}
					if (local779 == 2) {
						this.anIntArray476[this.anInt6115] = local722.anIntArray476[local628];
						this.anIntArray474[this.anInt6115] = local722.anIntArray474[local628];
					}
					this.anInt6115++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(B[B)V")
	private void method5282(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub11 local14 = new Class3_Sub11(arg0);
		@Pc(19) Class3_Sub11 local19 = new Class3_Sub11(arg0);
		@Pc(24) Class3_Sub11 local24 = new Class3_Sub11(arg0);
		@Pc(29) Class3_Sub11 local29 = new Class3_Sub11(arg0);
		@Pc(34) Class3_Sub11 local34 = new Class3_Sub11(arg0);
		local14.anInt3520 = arg0.length - 18;
		this.anInt6119 = local14.method3109();
		this.anInt6105 = local14.method3109();
		this.anInt6115 = local14.method3118();
		@Pc(59) int local59 = local14.method3118();
		@Pc(63) int local63 = local14.method3118();
		@Pc(67) int local67 = local14.method3118();
		@Pc(71) int local71 = local14.method3118();
		@Pc(75) int local75 = local14.method3118();
		@Pc(79) int local79 = local14.method3109();
		@Pc(83) int local83 = local14.method3109();
		@Pc(87) int local87 = local14.method3109();
		@Pc(91) int local91 = local14.method3109();
		@Pc(100) int local100 = this.anInt6119;
		@Pc(108) int local108 = local100;
		local100 += this.anInt6105;
		@Pc(115) int local115 = local100;
		if (local63 == 255) {
			local100 += this.anInt6105;
		}
		@Pc(125) int local125 = local100;
		if (local71 == 1) {
			local100 += this.anInt6105;
		}
		@Pc(137) int local137 = local100;
		if (local59 == 1) {
			local100 += this.anInt6105;
		}
		@Pc(149) int local149 = local100;
		if (local75 == 1) {
			local100 += this.anInt6119;
		}
		@Pc(159) int local159 = local100;
		if (local67 == 1) {
			local100 += this.anInt6105;
		}
		@Pc(169) int local169 = local100;
		local100 += local91;
		@Pc(175) int local175 = local100;
		local100 += this.anInt6105 * 2;
		@Pc(184) int local184 = local100;
		local100 += this.anInt6115 * 6;
		@Pc(193) int local193 = local100;
		local100 += local79;
		@Pc(199) int local199 = local100;
		local100 += local83;
		this.aShortArray193 = new short[this.anInt6105];
		if (local59 == 1) {
			this.aByteArray73 = new byte[this.anInt6105];
			this.aShortArray200 = new short[this.anInt6105];
			this.aByteArray75 = new byte[this.anInt6105];
		}
		if (local63 == 255) {
			this.aByteArray74 = new byte[this.anInt6105];
		} else {
			this.aByte76 = (byte) local63;
		}
		if (local71 == 1) {
			this.anIntArray479 = new int[this.anInt6105];
		}
		if (this.anInt6115 > 0) {
			this.aShortArray201 = new short[this.anInt6115];
			this.aByteArray72 = new byte[this.anInt6115];
			this.aShortArray202 = new short[this.anInt6115];
			this.aShortArray196 = new short[this.anInt6115];
		}
		if (local75 == 1) {
			this.anIntArray485 = new int[this.anInt6119];
		}
		this.aShortArray194 = new short[this.anInt6105];
		this.anIntArray478 = new int[this.anInt6119];
		this.aShortArray195 = new short[this.anInt6105];
		local14.anInt3520 = 0;
		this.aShortArray199 = new short[this.anInt6105];
		this.anIntArray483 = new int[this.anInt6119];
		if (local67 == 1) {
			this.aByteArray76 = new byte[this.anInt6105];
		}
		this.anIntArray475 = new int[this.anInt6119];
		local19.anInt3520 = local193;
		local24.anInt3520 = local199;
		local29.anInt3520 = local100;
		local34.anInt3520 = local149;
		@Pc(351) int local351 = 0;
		@Pc(353) int local353 = 0;
		@Pc(355) int local355 = 0;
		@Pc(363) int local363;
		@Pc(365) int local365;
		for (@Pc(357) int local357 = 0; local357 < this.anInt6119; local357++) {
			local363 = local14.method3118();
			local365 = 0;
			if ((local363 & 0x1) != 0) {
				local365 = local19.method3085();
			}
			@Pc(375) int local375 = 0;
			if ((local363 & 0x2) != 0) {
				local375 = local24.method3085();
			}
			@Pc(388) int local388 = 0;
			if ((local363 & 0x4) != 0) {
				local388 = local29.method3085();
			}
			this.anIntArray483[local357] = local365 + local351;
			this.anIntArray478[local357] = local353 + local375;
			this.anIntArray475[local357] = local355 + local388;
			local353 = this.anIntArray478[local357];
			local355 = this.anIntArray475[local357];
			local351 = this.anIntArray483[local357];
			if (local75 == 1) {
				this.anIntArray485[local357] = local34.method3118();
			}
		}
		local14.anInt3520 = local175;
		local19.anInt3520 = local137;
		local24.anInt3520 = local115;
		local29.anInt3520 = local159;
		local34.anInt3520 = local125;
		for (local363 = 0; local363 < this.anInt6105; local363++) {
			this.aShortArray199[local363] = (short) local14.method3109();
			if (local59 == 1) {
				local365 = local19.method3118();
				if ((local365 & 0x1) == 1) {
					local7 = true;
					this.aByteArray73[local363] = 1;
				} else {
					this.aByteArray73[local363] = 0;
				}
				if ((local365 & 0x2) == 2) {
					this.aByteArray75[local363] = (byte) (local365 >> 2);
					this.aShortArray200[local363] = this.aShortArray199[local363];
					this.aShortArray199[local363] = 127;
					if (this.aShortArray200[local363] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray75[local363] = -1;
					this.aShortArray200[local363] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray74[local363] = local24.method3096();
			}
			if (local67 == 1) {
				this.aByteArray76[local363] = local29.method3096();
			}
			if (local71 == 1) {
				this.anIntArray479[local363] = local34.method3118();
			}
		}
		this.anInt6108 = -1;
		local14.anInt3520 = local169;
		local19.anInt3520 = local108;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(619) int local619;
		for (@Pc(613) int local613 = 0; local613 < this.anInt6105; local613++) {
			local619 = local19.method3118();
			if (local619 == 1) {
				local605 = (short) (local14.method3085() + local611);
				local607 = (short) (local605 + local14.method3085());
				local609 = (short) (local607 + local14.method3085());
				local611 = local609;
				this.aShortArray193[local613] = local605;
				this.aShortArray194[local613] = local607;
				this.aShortArray195[local613] = local609;
				if (local605 > this.anInt6108) {
					this.anInt6108 = local605;
				}
				if (local607 > this.anInt6108) {
					this.anInt6108 = local607;
				}
				if (local609 > this.anInt6108) {
					this.anInt6108 = local609;
				}
			}
			if (local619 == 2) {
				local607 = local609;
				local609 = (short) (local611 + local14.method3085());
				this.aShortArray193[local613] = local605;
				local611 = local609;
				this.aShortArray194[local613] = local607;
				this.aShortArray195[local613] = local609;
				if (this.anInt6108 < local609) {
					this.anInt6108 = local609;
				}
			}
			if (local619 == 3) {
				local605 = local609;
				local609 = (short) (local14.method3085() + local611);
				this.aShortArray193[local613] = local605;
				local611 = local609;
				this.aShortArray194[local613] = local607;
				this.aShortArray195[local613] = local609;
				if (local609 > this.anInt6108) {
					this.anInt6108 = local609;
				}
			}
			if (local619 == 4) {
				@Pc(772) short local772 = local605;
				local605 = local607;
				local607 = local772;
				local609 = (short) (local611 + local14.method3085());
				this.aShortArray193[local613] = local605;
				local611 = local609;
				this.aShortArray194[local613] = local772;
				this.aShortArray195[local613] = local609;
				if (this.anInt6108 < local609) {
					this.anInt6108 = local609;
				}
			}
		}
		this.anInt6108++;
		local14.anInt3520 = local184;
		for (local619 = 0; local619 < this.anInt6115; local619++) {
			this.aByteArray72[local619] = 0;
			this.aShortArray202[local619] = (short) local14.method3109();
			this.aShortArray196[local619] = (short) local14.method3109();
			this.aShortArray201[local619] = (short) local14.method3109();
		}
		if (this.aByteArray75 != null) {
			@Pc(872) boolean local872 = false;
			for (@Pc(874) int local874 = 0; local874 < this.anInt6105; local874++) {
				@Pc(883) int local883 = this.aByteArray75[local874] & 0xFF;
				if (local883 != 255) {
					if ((this.aShortArray202[local883] & 0xFFFF) == this.aShortArray193[local874] && (this.aShortArray196[local883] & 0xFFFF) == this.aShortArray194[local874] && (this.aShortArray201[local883] & 0xFFFF) == this.aShortArray195[local874]) {
						this.aByteArray75[local874] = -1;
					} else {
						local872 = true;
					}
				}
			}
			if (!local872) {
				this.aByteArray75 = null;
			}
		}
		if (!local9) {
			this.aShortArray200 = null;
		}
		if (!local7) {
			this.aByteArray73 = null;
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(SSI)V")
	public void method5283(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray200 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anInt6105; local19++) {
			if (arg1 == this.aShortArray200[local19]) {
				this.aShortArray200[local19] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BZ)[[I")
	public int[][] method5284(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt6119 : this.anInt6108;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray485[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(41) int local41 = local8[local27]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < local18; local82++) {
			@Pc(97) int local97 = this.anIntArray485[local82];
			if (local97 >= 0) {
				local57[local97][local8[local97]++] = local82;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIII)V")
	public void method5285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(31) int local31;
		if (arg0 != 0) {
			local7 = Class3_Sub17.anIntArray175[arg0];
			local11 = Class3_Sub17.anIntArray177[arg0];
			for (local13 = 0; local13 < this.anInt6119; local13++) {
				local31 = local7 * this.anIntArray478[local13] + local11 * this.anIntArray483[local13] >> 14;
				this.anIntArray478[local13] = local11 * this.anIntArray478[local13] - local7 * this.anIntArray483[local13] >> 14;
				this.anIntArray483[local13] = local31;
			}
		}
		if (arg2 != 0) {
			local7 = Class3_Sub17.anIntArray175[arg2];
			local11 = Class3_Sub17.anIntArray177[arg2];
			for (local13 = 0; local13 < this.anInt6119; local13++) {
				local31 = local11 * this.anIntArray478[local13] - this.anIntArray475[local13] * local7 >> 14;
				this.anIntArray475[local13] = this.anIntArray475[local13] * local11 + local7 * this.anIntArray478[local13] >> 14;
				this.anIntArray478[local13] = local31;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local7 = Class3_Sub17.anIntArray175[arg1];
		local11 = Class3_Sub17.anIntArray177[arg1];
		for (local13 = 0; local13 < this.anInt6119; local13++) {
			local31 = local7 * this.anIntArray475[local13] + this.anIntArray483[local13] * local11 >> 14;
			this.anIntArray475[local13] = local11 * this.anIntArray475[local13] - this.anIntArray483[local13] * local7 >> 14;
			this.anIntArray483[local13] = local31;
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IBBSIISIB)I")
	public int method5286(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray193[this.anInt6105] = (short) arg4;
		this.aShortArray194[this.anInt6105] = (short) arg0;
		this.aShortArray195[this.anInt6105] = (short) arg6;
		this.aByteArray73[this.anInt6105] = arg1;
		this.aByteArray75[this.anInt6105] = arg7;
		this.aShortArray199[this.anInt6105] = arg3;
		this.aByteArray76[this.anInt6105] = arg2;
		this.aShortArray200[this.anInt6105] = arg5;
		return this.anInt6105++;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(IIII)V")
	public void method5287(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt6119; local11++) {
			this.anIntArray483[local11] += arg2;
			this.anIntArray478[local11] += arg0;
			this.anIntArray475[local11] += arg1;
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "([BI)V")
	private void method5288(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub11 local10 = new Class3_Sub11(arg0);
		@Pc(15) Class3_Sub11 local15 = new Class3_Sub11(arg0);
		@Pc(20) Class3_Sub11 local20 = new Class3_Sub11(arg0);
		@Pc(25) Class3_Sub11 local25 = new Class3_Sub11(arg0);
		@Pc(30) Class3_Sub11 local30 = new Class3_Sub11(arg0);
		@Pc(35) Class3_Sub11 local35 = new Class3_Sub11(arg0);
		@Pc(40) Class3_Sub11 local40 = new Class3_Sub11(arg0);
		local10.anInt3520 = arg0.length - 23;
		this.anInt6119 = local10.method3109();
		this.anInt6105 = local10.method3109();
		this.anInt6115 = local10.method3118();
		@Pc(65) int local65 = local10.method3118();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt3520 -= 7;
			this.anInt6103 = local10.method3118();
			local10.anInt3520 += 6;
		}
		@Pc(128) int local128 = local10.method3118();
		@Pc(132) int local132 = local10.method3118();
		@Pc(136) int local136 = local10.method3118();
		@Pc(140) int local140 = local10.method3118();
		@Pc(144) int local144 = local10.method3118();
		@Pc(148) int local148 = local10.method3109();
		@Pc(152) int local152 = local10.method3109();
		@Pc(156) int local156 = local10.method3109();
		@Pc(160) int local160 = local10.method3109();
		@Pc(164) int local164 = local10.method3109();
		@Pc(166) int local166 = 0;
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(190) int local190;
		if (this.anInt6115 > 0) {
			local10.anInt3520 = 0;
			this.aByteArray72 = new byte[this.anInt6115];
			for (local190 = 0; local190 < this.anInt6115; local190++) {
				@Pc(201) byte local201 = this.aByteArray72[local190] = local10.method3096();
				if (local201 >= 1 && local201 <= 3) {
					local172++;
				}
				if (local201 == 0) {
					local166++;
				}
				if (local201 == 2) {
					local174++;
				}
			}
		}
		local190 = this.anInt6115;
		@Pc(229) int local229 = local190;
		local190 += this.anInt6119;
		@Pc(236) int local236 = local190;
		if (local76) {
			local190 += this.anInt6105;
		}
		@Pc(245) int local245 = local190;
		local190 += this.anInt6105;
		@Pc(252) int local252 = local190;
		if (local128 == 255) {
			local190 += this.anInt6105;
		}
		@Pc(264) int local264 = local190;
		if (local136 == 1) {
			local190 += this.anInt6105;
		}
		@Pc(274) int local274 = local190;
		if (local144 == 1) {
			local190 += this.anInt6119;
		}
		@Pc(284) int local284 = local190;
		if (local132 == 1) {
			local190 += this.anInt6105;
		}
		@Pc(296) int local296 = local190;
		local190 += local160;
		@Pc(302) int local302 = local190;
		if (local140 == 1) {
			local190 += this.anInt6105 * 2;
		}
		@Pc(314) int local314 = local190;
		local190 += local164;
		@Pc(320) int local320 = local190;
		local190 += this.anInt6105 * 2;
		@Pc(329) int local329 = local190;
		local190 += local148;
		@Pc(335) int local335 = local190;
		local190 += local152;
		@Pc(341) int local341 = local190;
		local190 += local156;
		@Pc(347) int local347 = local190;
		local190 += local166 * 6;
		@Pc(355) int local355 = local190;
		local190 += local172 * 6;
		@Pc(363) byte local363 = 6;
		if (this.anInt6103 == 14) {
			local363 = 7;
		} else if (this.anInt6103 >= 15) {
			local363 = 9;
		}
		@Pc(379) int local379 = local190;
		local190 += local363 * local172;
		@Pc(387) int local387 = local190;
		local190 += local172;
		@Pc(393) int local393 = local190;
		local190 += local172;
		@Pc(399) int local399 = local190;
		local190 += local172 + local174 * 2;
		if (local136 == 1) {
			this.anIntArray479 = new int[this.anInt6105];
		}
		this.aShortArray199 = new short[this.anInt6105];
		if (local128 == 255) {
			this.aByteArray74 = new byte[this.anInt6105];
		} else {
			this.aByte76 = (byte) local128;
		}
		if (local132 == 1) {
			this.aByteArray76 = new byte[this.anInt6105];
		}
		this.aShortArray194 = new short[this.anInt6105];
		if (local76) {
			this.aByteArray73 = new byte[this.anInt6105];
		}
		this.aShortArray195 = new short[this.anInt6105];
		this.aShortArray193 = new short[this.anInt6105];
		if (this.anInt6115 > 0) {
			this.aShortArray202 = new short[this.anInt6115];
			if (local174 > 0) {
				this.anIntArray476 = new int[local174];
				this.anIntArray474 = new int[local174];
			}
			this.aShortArray201 = new short[this.anInt6115];
			this.aShortArray196 = new short[this.anInt6115];
			if (local172 > 0) {
				this.anIntArray480 = new int[local172];
				this.anIntArray482 = new int[local172];
				this.aByteArray71 = new byte[local172];
				this.aByteArray77 = new byte[local172];
				this.anIntArray484 = new int[local172];
				this.anIntArray477 = new int[local172];
			}
		}
		this.anIntArray483 = new int[this.anInt6119];
		if (local140 == 1) {
			this.aShortArray200 = new short[this.anInt6105];
		}
		this.anIntArray475 = new int[this.anInt6119];
		local10.anInt3520 = local229;
		if (local144 == 1) {
			this.anIntArray485 = new int[this.anInt6119];
		}
		this.anIntArray478 = new int[this.anInt6119];
		if (local140 == 1 && this.anInt6115 > 0) {
			this.aByteArray75 = new byte[this.anInt6105];
		}
		local15.anInt3520 = local329;
		local20.anInt3520 = local335;
		local25.anInt3520 = local341;
		local30.anInt3520 = local274;
		@Pc(592) int local592 = 0;
		@Pc(594) int local594 = 0;
		@Pc(596) int local596 = 0;
		@Pc(604) int local604;
		for (@Pc(598) int local598 = 0; local598 < this.anInt6119; local598++) {
			local604 = local10.method3118();
			@Pc(606) int local606 = 0;
			if ((local604 & 0x1) != 0) {
				local606 = local15.method3085();
			}
			@Pc(616) int local616 = 0;
			if ((local604 & 0x2) != 0) {
				local616 = local20.method3085();
			}
			@Pc(626) int local626 = 0;
			if ((local604 & 0x4) != 0) {
				local626 = local25.method3085();
			}
			this.anIntArray483[local598] = local606 + local592;
			this.anIntArray478[local598] = local616 + local594;
			this.anIntArray475[local598] = local596 + local626;
			local592 = this.anIntArray483[local598];
			local594 = this.anIntArray478[local598];
			local596 = this.anIntArray475[local598];
			if (local144 == 1) {
				this.anIntArray485[local598] = local30.method3118();
			}
		}
		local10.anInt3520 = local320;
		local15.anInt3520 = local236;
		local20.anInt3520 = local252;
		local25.anInt3520 = local284;
		local30.anInt3520 = local264;
		local35.anInt3520 = local302;
		local40.anInt3520 = local314;
		for (local604 = 0; local604 < this.anInt6105; local604++) {
			this.aShortArray199[local604] = (short) local10.method3109();
			if (local76) {
				this.aByteArray73[local604] = local15.method3096();
			}
			if (local128 == 255) {
				this.aByteArray74[local604] = local20.method3096();
			}
			if (local132 == 1) {
				this.aByteArray76[local604] = local25.method3096();
			}
			if (local136 == 1) {
				this.anIntArray479[local604] = local30.method3118();
			}
			if (local140 == 1) {
				this.aShortArray200[local604] = (short) (local35.method3109() - 1);
			}
			if (this.aByteArray75 != null) {
				if (this.aShortArray200[local604] == -1) {
					this.aByteArray75[local604] = -1;
				} else {
					this.aByteArray75[local604] = (byte) (local40.method3118() - 1);
				}
			}
		}
		this.anInt6108 = -1;
		local10.anInt3520 = local296;
		local15.anInt3520 = local245;
		@Pc(823) short local823 = 0;
		@Pc(825) short local825 = 0;
		@Pc(827) short local827 = 0;
		@Pc(829) short local829 = 0;
		@Pc(837) int local837;
		for (@Pc(831) int local831 = 0; local831 < this.anInt6105; local831++) {
			local837 = local15.method3118();
			if (local837 == 1) {
				local823 = (short) (local10.method3085() + local829);
				local825 = (short) (local10.method3085() + local823);
				local827 = (short) (local10.method3085() + local825);
				this.aShortArray193[local831] = local823;
				local829 = local827;
				this.aShortArray194[local831] = local825;
				this.aShortArray195[local831] = local827;
				if (this.anInt6108 < local823) {
					this.anInt6108 = local823;
				}
				if (this.anInt6108 < local825) {
					this.anInt6108 = local825;
				}
				if (this.anInt6108 < local827) {
					this.anInt6108 = local827;
				}
			}
			if (local837 == 2) {
				local825 = local827;
				local827 = (short) (local10.method3085() + local829);
				local829 = local827;
				this.aShortArray193[local831] = local823;
				this.aShortArray194[local831] = local825;
				this.aShortArray195[local831] = local827;
				if (this.anInt6108 < local827) {
					this.anInt6108 = local827;
				}
			}
			if (local837 == 3) {
				local823 = local827;
				local827 = (short) (local829 + local10.method3085());
				this.aShortArray193[local831] = local823;
				local829 = local827;
				this.aShortArray194[local831] = local825;
				this.aShortArray195[local831] = local827;
				if (local827 > this.anInt6108) {
					this.anInt6108 = local827;
				}
			}
			if (local837 == 4) {
				@Pc(998) short local998 = local823;
				local823 = local825;
				local825 = local998;
				local827 = (short) (local829 + local10.method3085());
				local829 = local827;
				this.aShortArray193[local831] = local823;
				this.aShortArray194[local831] = local998;
				this.aShortArray195[local831] = local827;
				if (local827 > this.anInt6108) {
					this.anInt6108 = local827;
				}
			}
		}
		local10.anInt3520 = local347;
		this.anInt6108++;
		local15.anInt3520 = local355;
		local20.anInt3520 = local379;
		local25.anInt3520 = local387;
		local30.anInt3520 = local393;
		local35.anInt3520 = local399;
		@Pc(1077) int local1077;
		for (local837 = 0; local837 < this.anInt6115; local837++) {
			local1077 = this.aByteArray72[local837] & 0xFF;
			if (local1077 == 0) {
				this.aShortArray202[local837] = (short) local10.method3109();
				this.aShortArray196[local837] = (short) local10.method3109();
				this.aShortArray201[local837] = (short) local10.method3109();
			}
			if (local1077 == 1) {
				this.aShortArray202[local837] = (short) local15.method3109();
				this.aShortArray196[local837] = (short) local15.method3109();
				this.aShortArray201[local837] = (short) local15.method3109();
				if (this.anInt6103 < 15) {
					this.anIntArray482[local837] = local20.method3109();
					if (this.anInt6103 >= 14) {
						this.anIntArray484[local837] = local20.method3126();
					} else {
						this.anIntArray484[local837] = local20.method3109();
					}
					this.anIntArray477[local837] = local20.method3109();
				} else {
					this.anIntArray482[local837] = local20.method3126();
					this.anIntArray484[local837] = local20.method3126();
					this.anIntArray477[local837] = local20.method3126();
				}
				this.aByteArray77[local837] = local25.method3096();
				this.aByteArray71[local837] = local30.method3096();
				this.anIntArray480[local837] = local35.method3096();
			}
			if (local1077 == 2) {
				this.aShortArray202[local837] = (short) local15.method3109();
				this.aShortArray196[local837] = (short) local15.method3109();
				this.aShortArray201[local837] = (short) local15.method3109();
				if (this.anInt6103 >= 15) {
					this.anIntArray482[local837] = local20.method3126();
					this.anIntArray484[local837] = local20.method3126();
					this.anIntArray477[local837] = local20.method3126();
				} else {
					this.anIntArray482[local837] = local20.method3109();
					if (this.anInt6103 >= 14) {
						this.anIntArray484[local837] = local20.method3126();
					} else {
						this.anIntArray484[local837] = local20.method3109();
					}
					this.anIntArray477[local837] = local20.method3109();
				}
				this.aByteArray77[local837] = local25.method3096();
				this.aByteArray71[local837] = local30.method3096();
				this.anIntArray480[local837] = local35.method3096();
				this.anIntArray476[local837] = local35.method3096();
				this.anIntArray474[local837] = local35.method3096();
			}
			if (local1077 == 3) {
				this.aShortArray202[local837] = (short) local15.method3109();
				this.aShortArray196[local837] = (short) local15.method3109();
				this.aShortArray201[local837] = (short) local15.method3109();
				if (this.anInt6103 < 15) {
					this.anIntArray482[local837] = local20.method3109();
					if (this.anInt6103 >= 14) {
						this.anIntArray484[local837] = local20.method3126();
					} else {
						this.anIntArray484[local837] = local20.method3109();
					}
					this.anIntArray477[local837] = local20.method3109();
				} else {
					this.anIntArray482[local837] = local20.method3126();
					this.anIntArray484[local837] = local20.method3126();
					this.anIntArray477[local837] = local20.method3126();
				}
				this.aByteArray77[local837] = local25.method3096();
				this.aByteArray71[local837] = local30.method3096();
				this.anIntArray480[local837] = local35.method3096();
			}
		}
		local10.anInt3520 = local190;
		@Pc(1480) int local1480;
		@Pc(1486) int local1486;
		@Pc(1490) int local1490;
		@Pc(1559) int local1559;
		if (local85) {
			local1077 = local10.method3118();
			if (local1077 > 0) {
				this.aClass323Array3 = new Class323[local1077];
				for (local1480 = 0; local1480 < local1077; local1480++) {
					local1486 = local10.method3109();
					local1490 = local10.method3109();
					@Pc(1498) byte local1498;
					if (local128 == 255) {
						local1498 = this.aByteArray74[local1490];
					} else {
						local1498 = (byte) local128;
					}
					this.aClass323Array3[local1480] = new Class323(local1486, this.aShortArray193[local1490], this.aShortArray194[local1490], this.aShortArray195[local1490], local1498);
				}
			}
			local1480 = local10.method3118();
			if (local1480 > 0) {
				this.aClass15Array3 = new Class15[local1480];
				for (local1486 = 0; local1486 < local1480; local1486++) {
					local1490 = local10.method3109();
					local1559 = local10.method3109();
					this.aClass15Array3[local1486] = new Class15(local1490, local1559);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1077 = local10.method3118();
		if (local1077 <= 0) {
			return;
		}
		this.aClass161Array1 = new Class161[local1077];
		for (local1480 = 0; local1480 < local1077; local1480++) {
			local1486 = local10.method3109();
			local1490 = local10.method3109();
			local1559 = local10.method3118();
			@Pc(1604) byte local1604 = local10.method3096();
			this.aClass161Array1[local1480] = new Class161(local1486, local1490, local1559, local1604);
		}
		return;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)[[I")
	public int[][] method5291() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6105; local12++) {
			@Pc(19) int local19 = this.anIntArray479[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(34) int local34 = local8[local19]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt6105; local72++) {
			@Pc(79) int local79 = this.anIntArray479[local72];
			if (local79 >= 0) {
				local47[local79][local8[local79]++] = local72;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(SSZSBBSBSS)B")
	public byte method5292() {
		if (this.anInt6115 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray72[this.anInt6115] = 3;
		this.aShortArray202[this.anInt6115] = 0;
		this.aShortArray196[this.anInt6115] = 32767;
		this.aShortArray201[this.anInt6115] = 0;
		this.anIntArray482[this.anInt6115] = 1024;
		this.anIntArray484[this.anInt6115] = 1024;
		this.anIntArray477[this.anInt6115] = 1024;
		this.aByteArray77[this.anInt6115] = 0;
		this.aByteArray71[this.anInt6115] = 0;
		this.anIntArray480[this.anInt6115] = 0;
		return (byte) this.anInt6115++;
	}

	@OriginalMember(owner = "client!nda", name = "c", descriptor = "(IIII)I")
	public int method5293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6119; local7++) {
			if (this.anIntArray483[local7] == arg1 && this.anIntArray478[local7] == arg2 && this.anIntArray475[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray483[this.anInt6119] = arg1;
		this.anIntArray478[this.anInt6119] = arg2;
		this.anIntArray475[this.anInt6119] = arg0;
		this.anInt6108 = this.anInt6119 + 1;
		return this.anInt6119++;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)[[I")
	public int[][] method5294() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass161Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass161Array1[local12].anInt4504;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(38) int local38 = local8[local20]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass161Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass161Array1[local78].anInt4504;
			if (local86 >= 0) {
				local52[local86][local8[local86]++] = local78;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(SIS)V")
	public void method5295(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6105; local7++) {
			if (arg0 == this.aShortArray199[local7]) {
				this.aShortArray199[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(BI)V")
	public void method5296() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt6119; local15++) {
			this.anIntArray483[local15] <<= 0x2;
			this.anIntArray478[local15] <<= 0x2;
			this.anIntArray475[local15] <<= 0x2;
		}
		if (this.anInt6115 <= 0 || this.anIntArray482 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray482.length; local57++) {
			this.anIntArray482[local57] <<= 0x2;
			this.anIntArray484[local57] <<= 0x2;
			if (this.aByteArray72[local57] != 1) {
				this.anIntArray477[local57] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(ILclient!nda;SI)I")
	private int method5297(@OriginalArg(0) int arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray483[arg0];
		@Pc(15) int local15 = arg1.anIntArray478[arg0];
		@Pc(20) int local20 = arg1.anIntArray475[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt6119; local22++) {
			if (this.anIntArray483[local22] == local10 && this.anIntArray478[local22] == local15 && this.anIntArray475[local22] == local20) {
				this.aShortArray197[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray483[this.anInt6119] = local10;
		this.anIntArray478[this.anInt6119] = local15;
		this.anIntArray475[this.anInt6119] = local20;
		this.aShortArray197[this.anInt6119] = arg2;
		this.anIntArray485[this.anInt6119] = arg1.anIntArray485 == null ? -1 : arg1.anIntArray485[arg0];
		return this.anInt6119++;
	}
}
