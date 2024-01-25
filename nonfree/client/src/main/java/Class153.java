import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class153 {

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "[B")
	public byte[] aByteArray67;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "[I")
	public int[] anIntArray413;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "[B")
	public byte[] aByteArray68;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "[Lclient!oa;")
	public Class143[] aClass143Array3;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
	public int[] anIntArray414;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!pe", name = "n", descriptor = "[B")
	public byte[] aByteArray69;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "[B")
	public byte[] aByteArray70;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "[B")
	public byte[] aByteArray71;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!pe", name = "v", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!pe", name = "y", descriptor = "[I")
	public int[] anIntArray415;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!pe", name = "L", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!pe", name = "N", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!pe", name = "Q", descriptor = "[Lclient!md;")
	public Class125[] aClass125Array3;

	@OriginalMember(owner = "client!pe", name = "R", descriptor = "[I")
	public int[] anIntArray416;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "[I")
	public int[] anIntArray417;

	@OriginalMember(owner = "client!pe", name = "U", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!pe", name = "W", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!pe", name = "X", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!pe", name = "ab", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!pe", name = "cb", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
	public int anInt5034 = 0;

	@OriginalMember(owner = "client!pe", name = "M", descriptor = "I")
	public int anInt5042 = 0;

	@OriginalMember(owner = "client!pe", name = "p", descriptor = "B")
	public byte aByte61 = 0;

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "I")
	public int anInt5041 = 0;

	@OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
	public int anInt5043 = 0;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([B)V")
	public Class153(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4173(arg0);
		} else {
			this.method4170(arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(III)V")
	public Class153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray67 = new byte[arg1];
		this.anIntArray414 = new int[arg0];
		if (arg2 > 0) {
			this.aShortArray95 = new short[arg2];
			this.aByteArray73 = new byte[arg2];
			this.aByteArray71 = new byte[arg2];
			this.aShortArray97 = new short[arg2];
			this.aByteArray69 = new byte[arg2];
			this.aShortArray85 = new short[arg2];
			this.aByteArray70 = new byte[arg2];
			this.aByteArray74 = new byte[arg2];
			this.aShortArray96 = new short[arg2];
			this.aShortArray94 = new short[arg2];
			this.aShortArray88 = new short[arg2];
			this.aByteArray75 = new byte[arg2];
		}
		this.aByteArray68 = new byte[arg1];
		this.anIntArray415 = new int[arg1];
		this.aShortArray89 = new short[arg1];
		this.aByteArray76 = new byte[arg1];
		this.aShortArray93 = new short[arg1];
		this.anIntArray416 = new int[arg0];
		this.aShortArray92 = new short[arg1];
		this.aByteArray72 = new byte[arg1];
		this.aShortArray91 = new short[arg1];
		this.anIntArray417 = new int[arg0];
		this.anIntArray413 = new int[arg0];
		this.aShortArray86 = new short[arg1];
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "([Lclient!pe;I)V")
	public Class153(@OriginalArg(0) Class153[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5043 = 0;
		this.anInt5042 = 0;
		this.anInt5034 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte61 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class153 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt5034 += local54.anInt5034;
				this.anInt5042 += local54.anInt5042;
				this.anInt5043 += local54.anInt5043;
				local33 |= local54.aByteArray72 != null;
				if (local54.aClass143Array3 != null) {
					local31 += local54.aClass143Array3.length;
				}
				if (local54.aClass125Array3 != null) {
					local29 += local54.aClass125Array3.length;
				}
				local41 |= local54.aShortArray86 != null;
				if (local54.aByteArray68 == null) {
					if (this.aByte61 == -1) {
						this.aByte61 = local54.aByte61;
					}
					if (local54.aByte61 != this.aByte61) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local39 |= local54.aByteArray76 != null;
				local37 |= local54.aByteArray67 != null;
				local46 |= local54.anIntArray415 != null;
			}
		}
		if (local31 > 0) {
			this.aClass143Array3 = new Class143[local31];
		}
		this.aShortArray92 = new short[this.anInt5043];
		if (local39) {
			this.aByteArray76 = new byte[this.anInt5043];
		}
		if (local29 > 0) {
			this.aClass125Array3 = new Class125[local29];
		}
		this.aShortArray87 = new short[this.anInt5043];
		this.aShortArray91 = new short[this.anInt5043];
		this.anIntArray416 = new int[this.anInt5042];
		this.anIntArray413 = new int[this.anInt5042];
		if (local41) {
			this.aShortArray86 = new short[this.anInt5043];
		}
		if (local33) {
			this.aByteArray72 = new byte[this.anInt5043];
		}
		if (this.anInt5034 > 0) {
			this.aByteArray71 = new byte[this.anInt5034];
			this.aByteArray74 = new byte[this.anInt5034];
			this.aShortArray97 = new short[this.anInt5034];
			this.aShortArray95 = new short[this.anInt5034];
			this.aByteArray69 = new byte[this.anInt5034];
			this.aByteArray75 = new byte[this.anInt5034];
			this.aShortArray94 = new short[this.anInt5034];
			this.aShortArray96 = new short[this.anInt5034];
			this.aShortArray85 = new short[this.anInt5034];
			this.aShortArray88 = new short[this.anInt5034];
			this.aByteArray73 = new byte[this.anInt5034];
			this.aByteArray70 = new byte[this.anInt5034];
		}
		this.aShortArray89 = new short[this.anInt5043];
		this.anIntArray417 = new int[this.anInt5042];
		if (local46) {
			this.anIntArray415 = new int[this.anInt5043];
		}
		this.aShortArray90 = new short[this.anInt5042];
		this.aShortArray93 = new short[this.anInt5043];
		if (local37) {
			this.aByteArray67 = new byte[this.anInt5043];
		}
		if (local35) {
			this.aByteArray68 = new byte[this.anInt5043];
		}
		this.anIntArray414 = new int[this.anInt5042];
		this.anInt5043 = 0;
		this.anInt5034 = 0;
		this.anInt5042 = 0;
		local31 = 0;
		local29 = 0;
		@Pc(559) int local559;
		@Pc(570) int local570;
		for (@Pc(358) int local358 = 0; local358 < arg1; local358++) {
			@Pc(365) short local365 = (short) (0x1 << local358);
			@Pc(369) Class153 local369 = arg0[local358];
			if (local369 != null) {
				for (@Pc(373) int local373 = 0; local373 < local369.anInt5043; local373++) {
					if (local33 && local369.aByteArray72 != null) {
						this.aByteArray72[this.anInt5043] = local369.aByteArray72[local373];
					}
					if (local35) {
						if (local369.aByteArray68 == null) {
							this.aByteArray68[this.anInt5043] = local369.aByte61;
						} else {
							this.aByteArray68[this.anInt5043] = local369.aByteArray68[local373];
						}
					}
					if (local37 && local369.aByteArray67 != null) {
						this.aByteArray67[this.anInt5043] = local369.aByteArray67[local373];
					}
					if (local41) {
						if (local369.aShortArray86 == null) {
							this.aShortArray86[this.anInt5043] = -1;
						} else {
							this.aShortArray86[this.anInt5043] = local369.aShortArray86[local373];
						}
					}
					if (local46) {
						if (local369.anIntArray415 == null) {
							this.anIntArray415[this.anInt5043] = -1;
						} else {
							this.anIntArray415[this.anInt5043] = local369.anIntArray415[local373];
						}
					}
					this.aShortArray91[this.anInt5043] = (short) this.method4175(local369.aShortArray91[local373], local369, local365);
					this.aShortArray93[this.anInt5043] = (short) this.method4175(local369.aShortArray93[local373], local369, local365);
					this.aShortArray92[this.anInt5043] = (short) this.method4175(local369.aShortArray92[local373], local369, local365);
					this.aShortArray87[this.anInt5043] = local365;
					this.aShortArray89[this.anInt5043] = local369.aShortArray89[local373];
					this.anInt5043++;
				}
				@Pc(546) int local546;
				if (local369.aClass125Array3 != null) {
					for (local546 = 0; local546 < local369.aClass125Array3.length; local546++) {
						local559 = this.method4175(local369.aClass125Array3[local546].anInt4074, local369, local365);
						local570 = this.method4175(local369.aClass125Array3[local546].anInt4061, local369, local365);
						@Pc(581) int local581 = this.method4175(local369.aClass125Array3[local546].anInt4059, local369, local365);
						this.aClass125Array3[local29] = new Class125(local369.aClass125Array3[local546].anInt4076, local559, local570, local581, local369.aClass125Array3[local546].aByte47);
						local29++;
					}
				}
				if (local369.aClass143Array3 != null) {
					for (local546 = 0; local546 < local369.aClass143Array3.length; local546++) {
						local559 = this.method4175(local369.aClass143Array3[local546].anInt4565, local369, local365);
						this.aClass143Array3[local31] = new Class143(local369.aClass143Array3[local546].anInt4557, local559);
						local31++;
					}
				}
			}
		}
		@Pc(660) int local660 = 0;
		this.anInt5041 = this.anInt5042;
		for (@Pc(666) int local666 = 0; local666 < arg1; local666++) {
			@Pc(673) short local673 = (short) (0x1 << local666);
			@Pc(677) Class153 local677 = arg0[local666];
			if (local677 != null) {
				for (local559 = 0; local559 < local677.anInt5043; local559++) {
					if (local39) {
						this.aByteArray76[local660++] = (byte) (local677.aByteArray76 == null || local677.aByteArray76[local559] == -1 ? -1 : local677.aByteArray76[local559] + this.anInt5034);
					}
				}
				for (local570 = 0; local570 < local677.anInt5034; local570++) {
					@Pc(733) byte local733 = this.aByteArray69[this.anInt5034] = local677.aByteArray69[local570];
					if (local733 == 0) {
						this.aShortArray96[this.anInt5034] = (short) this.method4175(local677.aShortArray96[local570], local677, local673);
						this.aShortArray85[this.anInt5034] = (short) this.method4175(local677.aShortArray85[local570], local677, local673);
						this.aShortArray95[this.anInt5034] = (short) this.method4175(local677.aShortArray95[local570], local677, local673);
					}
					if (local733 >= 1 && local733 <= 3) {
						this.aShortArray96[this.anInt5034] = local677.aShortArray96[local570];
						this.aShortArray85[this.anInt5034] = local677.aShortArray85[local570];
						this.aShortArray95[this.anInt5034] = local677.aShortArray95[local570];
						this.aShortArray88[this.anInt5034] = local677.aShortArray88[local570];
						this.aShortArray94[this.anInt5034] = local677.aShortArray94[local570];
						this.aShortArray97[this.anInt5034] = local677.aShortArray97[local570];
						this.aByteArray71[this.anInt5034] = local677.aByteArray71[local570];
						this.aByteArray70[this.anInt5034] = local677.aByteArray70[local570];
						this.aByteArray75[this.anInt5034] = local677.aByteArray75[local570];
					}
					if (local733 == 2) {
						this.aByteArray74[this.anInt5034] = local677.aByteArray74[local570];
						this.aByteArray73[this.anInt5034] = local677.aByteArray73[local570];
					}
					this.anInt5034++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
	public void method4162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5042; local3++) {
			this.anIntArray413[local3] += arg2;
			this.anIntArray416[local3] += arg1;
			this.anIntArray414[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)[[I")
	public int[][] method4163() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5043; local17++) {
			@Pc(24) int local24 = this.anIntArray415[local17];
			if (local24 >= 0) {
				if (local15 < local24) {
					local15 = local24;
				}
				@Pc(35) int local35 = local13[local24]++;
			}
		}
		@Pc(48) int[][] local48 = new int[local15 + 1][];
		for (@Pc(50) int local50 = 0; local50 <= local15; local50++) {
			local48[local50] = new int[local13[local50]];
			local13[local50] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt5043; local73++) {
			@Pc(80) int local80 = this.anIntArray415[local73];
			if (local80 >= 0) {
				local48[local80][local13[local80]++] = local73;
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(SSBSIBSSBS)B")
	public byte method4165() {
		if (this.anInt5034 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray69[this.anInt5034] = 3;
		this.aShortArray96[this.anInt5034] = 0;
		this.aShortArray85[this.anInt5034] = 32767;
		this.aShortArray95[this.anInt5034] = 0;
		this.aShortArray88[this.anInt5034] = 1024;
		this.aShortArray94[this.anInt5034] = 1024;
		this.aShortArray97[this.anInt5034] = 1024;
		this.aByteArray71[this.anInt5034] = 0;
		this.aByteArray70[this.anInt5034] = 0;
		this.aByteArray75[this.anInt5034] = 0;
		return (byte) this.anInt5034++;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIBI)V")
	public void method4166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(39) int local39;
		if (arg1 != 0) {
			local14 = Class4_Sub4_Sub25.anIntArray384[arg1];
			local18 = Class4_Sub4_Sub25.anIntArray383[arg1];
			for (local20 = 0; local20 < this.anInt5042; local20++) {
				local39 = local14 * this.anIntArray416[local20] + this.anIntArray413[local20] * local18 >> 15;
				this.anIntArray416[local20] = local18 * this.anIntArray416[local20] - local14 * this.anIntArray413[local20] >> 15;
				this.anIntArray413[local20] = local39;
			}
		}
		if (arg0 != 0) {
			local14 = Class4_Sub4_Sub25.anIntArray384[arg0];
			local18 = Class4_Sub4_Sub25.anIntArray383[arg0];
			for (local20 = 0; local20 < this.anInt5042; local20++) {
				local39 = local18 * this.anIntArray416[local20] - local14 * this.anIntArray414[local20] >> 15;
				this.anIntArray414[local20] = this.anIntArray416[local20] * local14 + local18 * this.anIntArray414[local20] >> 15;
				this.anIntArray416[local20] = local39;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local14 = Class4_Sub4_Sub25.anIntArray384[arg2];
		local18 = Class4_Sub4_Sub25.anIntArray383[arg2];
		for (local20 = 0; local20 < this.anInt5042; local20++) {
			local39 = local18 * this.anIntArray413[local20] + local14 * this.anIntArray414[local20] >> 15;
			this.anIntArray414[local20] = local18 * this.anIntArray414[local20] - this.anIntArray413[local20] * local14 >> 15;
			this.anIntArray413[local20] = local39;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(SSI)V")
	public void method4167(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray86 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt5043; local11++) {
			if (this.aShortArray86[local11] == arg0) {
				this.aShortArray86[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([BI)V")
	private void method4170(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class4_Sub7 local14 = new Class4_Sub7(arg0);
		@Pc(19) Class4_Sub7 local19 = new Class4_Sub7(arg0);
		@Pc(24) Class4_Sub7 local24 = new Class4_Sub7(arg0);
		@Pc(29) Class4_Sub7 local29 = new Class4_Sub7(arg0);
		@Pc(34) Class4_Sub7 local34 = new Class4_Sub7(arg0);
		local14.anInt2667 = arg0.length - 18;
		this.anInt5042 = local14.method2404();
		this.anInt5043 = local14.method2404();
		this.anInt5034 = local14.method2380();
		@Pc(63) int local63 = local14.method2380();
		@Pc(67) int local67 = local14.method2380();
		@Pc(73) int local73 = local14.method2380();
		@Pc(77) int local77 = local14.method2380();
		@Pc(81) int local81 = local14.method2380();
		@Pc(85) int local85 = local14.method2404();
		@Pc(91) int local91 = local14.method2404();
		@Pc(95) int local95 = local14.method2404();
		@Pc(101) int local101 = local14.method2404();
		@Pc(110) int local110 = this.anInt5042;
		@Pc(112) int local112 = local110;
		local110 += this.anInt5043;
		@Pc(119) int local119 = local110;
		if (local67 == 255) {
			local110 += this.anInt5043;
		}
		@Pc(129) int local129 = local110;
		if (local77 == 1) {
			local110 += this.anInt5043;
		}
		@Pc(141) int local141 = local110;
		if (local63 == 1) {
			local110 += this.anInt5043;
		}
		@Pc(151) int local151 = local110;
		if (local81 == 1) {
			local110 += this.anInt5042;
		}
		@Pc(161) int local161 = local110;
		if (local73 == 1) {
			local110 += this.anInt5043;
		}
		@Pc(173) int local173 = local110;
		local110 += local101;
		@Pc(179) int local179 = local110;
		local110 += this.anInt5043 * 2;
		@Pc(188) int local188 = local110;
		local110 += this.anInt5034 * 6;
		@Pc(197) int local197 = local110;
		local110 += local85;
		@Pc(203) int local203 = local110;
		local110 += local91;
		if (local77 == 1) {
			this.anIntArray415 = new int[this.anInt5043];
		}
		if (this.anInt5034 > 0) {
			this.aShortArray96 = new short[this.anInt5034];
			this.aByteArray69 = new byte[this.anInt5034];
			this.aShortArray95 = new short[this.anInt5034];
			this.aShortArray85 = new short[this.anInt5034];
		}
		this.aShortArray89 = new short[this.anInt5043];
		this.anIntArray414 = new int[this.anInt5042];
		this.aShortArray91 = new short[this.anInt5043];
		this.anIntArray413 = new int[this.anInt5042];
		if (local81 == 1) {
			this.anIntArray417 = new int[this.anInt5042];
		}
		this.aShortArray93 = new short[this.anInt5043];
		this.anIntArray416 = new int[this.anInt5042];
		if (local63 == 1) {
			this.aByteArray76 = new byte[this.anInt5043];
			this.aShortArray86 = new short[this.anInt5043];
			this.aByteArray72 = new byte[this.anInt5043];
		}
		if (local67 == 255) {
			this.aByteArray68 = new byte[this.anInt5043];
		} else {
			this.aByte61 = (byte) local67;
		}
		local14.anInt2667 = 0;
		if (local73 == 1) {
			this.aByteArray67 = new byte[this.anInt5043];
		}
		this.aShortArray92 = new short[this.anInt5043];
		local19.anInt2667 = local197;
		local24.anInt2667 = local203;
		local29.anInt2667 = local110;
		local34.anInt2667 = local151;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(362) int local362;
		@Pc(364) int local364;
		for (@Pc(354) int local354 = 0; local354 < this.anInt5042; local354++) {
			local362 = local14.method2380();
			local364 = 0;
			if ((local362 & 0x1) != 0) {
				local364 = local19.method2370();
			}
			@Pc(377) int local377 = 0;
			if ((local362 & 0x2) != 0) {
				local377 = local24.method2370();
			}
			@Pc(387) int local387 = 0;
			if ((local362 & 0x4) != 0) {
				local387 = local29.method2370();
			}
			this.anIntArray413[local354] = local364 + local348;
			this.anIntArray416[local354] = local350 + local377;
			this.anIntArray414[local354] = local352 + local387;
			local352 = this.anIntArray414[local354];
			local348 = this.anIntArray413[local354];
			local350 = this.anIntArray416[local354];
			if (local81 == 1) {
				this.anIntArray417[local354] = local34.method2380();
			}
		}
		local14.anInt2667 = local179;
		local19.anInt2667 = local141;
		local24.anInt2667 = local119;
		local29.anInt2667 = local161;
		local34.anInt2667 = local129;
		for (local362 = 0; local362 < this.anInt5043; local362++) {
			this.aShortArray89[local362] = (short) local14.method2404();
			if (local63 == 1) {
				local364 = local19.method2380();
				if ((local364 & 0x1) == 1) {
					local7 = true;
					this.aByteArray72[local362] = 1;
				} else {
					this.aByteArray72[local362] = 0;
				}
				if ((local364 & 0x2) == 2) {
					this.aByteArray76[local362] = (byte) (local364 >> 2);
					this.aShortArray86[local362] = this.aShortArray89[local362];
					this.aShortArray89[local362] = 127;
					if (this.aShortArray86[local362] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray76[local362] = -1;
					this.aShortArray86[local362] = -1;
				}
			}
			if (local67 == 255) {
				this.aByteArray68[local362] = local24.method2393();
			}
			if (local73 == 1) {
				this.aByteArray67[local362] = local29.method2393();
			}
			if (local77 == 1) {
				this.anIntArray415[local362] = local34.method2380();
			}
		}
		this.anInt5041 = -1;
		local14.anInt2667 = local173;
		local19.anInt2667 = local112;
		@Pc(613) short local613 = 0;
		@Pc(615) short local615 = 0;
		@Pc(617) short local617 = 0;
		@Pc(619) short local619 = 0;
		@Pc(627) int local627;
		for (@Pc(621) int local621 = 0; local621 < this.anInt5043; local621++) {
			local627 = local19.method2380();
			if (local627 == 1) {
				local613 = (short) (local14.method2370() + local619);
				local615 = (short) (local14.method2370() + local613);
				local617 = (short) (local615 + local14.method2370());
				this.aShortArray91[local621] = local613;
				local619 = local617;
				this.aShortArray93[local621] = local615;
				this.aShortArray92[local621] = local617;
				if (this.anInt5041 < local613) {
					this.anInt5041 = local613;
				}
				if (local615 > this.anInt5041) {
					this.anInt5041 = local615;
				}
				if (this.anInt5041 < local617) {
					this.anInt5041 = local617;
				}
			}
			if (local627 == 2) {
				local615 = local617;
				local617 = (short) (local14.method2370() + local619);
				this.aShortArray91[local621] = local613;
				local619 = local617;
				this.aShortArray93[local621] = local615;
				this.aShortArray92[local621] = local617;
				if (local617 > this.anInt5041) {
					this.anInt5041 = local617;
				}
			}
			if (local627 == 3) {
				local613 = local617;
				local617 = (short) (local619 + local14.method2370());
				local619 = local617;
				this.aShortArray91[local621] = local613;
				this.aShortArray93[local621] = local615;
				this.aShortArray92[local621] = local617;
				if (local617 > this.anInt5041) {
					this.anInt5041 = local617;
				}
			}
			if (local627 == 4) {
				@Pc(776) short local776 = local613;
				local613 = local615;
				local617 = (short) (local14.method2370() + local619);
				local615 = local776;
				local619 = local617;
				this.aShortArray91[local621] = local613;
				this.aShortArray93[local621] = local776;
				this.aShortArray92[local621] = local617;
				if (this.anInt5041 < local617) {
					this.anInt5041 = local617;
				}
			}
		}
		this.anInt5041++;
		local14.anInt2667 = local188;
		for (local627 = 0; local627 < this.anInt5034; local627++) {
			this.aByteArray69[local627] = 0;
			this.aShortArray96[local627] = (short) local14.method2404();
			this.aShortArray85[local627] = (short) local14.method2404();
			this.aShortArray95[local627] = (short) local14.method2404();
		}
		if (this.aByteArray76 != null) {
			@Pc(878) boolean local878 = false;
			for (@Pc(880) int local880 = 0; local880 < this.anInt5043; local880++) {
				@Pc(889) int local889 = this.aByteArray76[local880] & 0xFF;
				if (local889 != 255) {
					if (this.aShortArray91[local880] == (this.aShortArray96[local889] & 0xFFFF) && (this.aShortArray85[local889] & 0xFFFF) == this.aShortArray93[local880] && (this.aShortArray95[local889] & 0xFFFF) == this.aShortArray92[local880]) {
						this.aByteArray76[local880] = -1;
					} else {
						local878 = true;
					}
				}
			}
			if (!local878) {
				this.aByteArray76 = null;
			}
		}
		if (!local9) {
			this.aShortArray86 = null;
		}
		if (!local7) {
			this.aByteArray72 = null;
		}
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)[[I")
	public int[][] method4171() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5041; local12++) {
			@Pc(19) int local19 = this.anIntArray417[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(64) int local64 = 0; local64 <= local10; local64++) {
			local54[local64] = new int[local8[local64]];
			local8[local64] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt5041; local83++) {
			@Pc(90) int local90 = this.anIntArray417[local83];
			if (local90 >= 0) {
				local54[local90][local8[local90]++] = local83;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZSS)V")
	public void method4172(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5043; local3++) {
			if (this.aShortArray89[local3] == arg0) {
				this.aShortArray89[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B[B)V")
	private void method4173(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class4_Sub7 local10 = new Class4_Sub7(arg0);
		@Pc(15) Class4_Sub7 local15 = new Class4_Sub7(arg0);
		@Pc(20) Class4_Sub7 local20 = new Class4_Sub7(arg0);
		@Pc(25) Class4_Sub7 local25 = new Class4_Sub7(arg0);
		@Pc(30) Class4_Sub7 local30 = new Class4_Sub7(arg0);
		@Pc(35) Class4_Sub7 local35 = new Class4_Sub7(arg0);
		@Pc(40) Class4_Sub7 local40 = new Class4_Sub7(arg0);
		local10.anInt2667 = arg0.length - 23;
		this.anInt5042 = local10.method2404();
		this.anInt5043 = local10.method2404();
		this.anInt5034 = local10.method2380();
		@Pc(65) int local65 = local10.method2380();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(91) int local91 = local10.method2380();
		@Pc(95) int local95 = local10.method2380();
		@Pc(99) int local99 = local10.method2380();
		@Pc(103) int local103 = local10.method2380();
		@Pc(107) int local107 = local10.method2380();
		@Pc(111) int local111 = local10.method2404();
		@Pc(115) int local115 = local10.method2404();
		@Pc(119) int local119 = local10.method2404();
		@Pc(123) int local123 = local10.method2404();
		@Pc(127) int local127 = local10.method2404();
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(133) int local133 = 0;
		@Pc(146) int local146;
		if (this.anInt5034 > 0) {
			local10.anInt2667 = 0;
			this.aByteArray69 = new byte[this.anInt5034];
			for (local146 = 0; local146 < this.anInt5034; local146++) {
				@Pc(157) byte local157 = this.aByteArray69[local146] = local10.method2393();
				if (local157 == 0) {
					local129++;
				}
				if (local157 >= 1 && local157 <= 3) {
					local131++;
				}
				if (local157 == 2) {
					local133++;
				}
			}
		}
		local146 = this.anInt5034;
		@Pc(187) int local187 = local146;
		local146 += this.anInt5042;
		@Pc(194) int local194 = local146;
		if (local76) {
			local146 += this.anInt5043;
		}
		@Pc(203) int local203 = local146;
		local146 += this.anInt5043;
		@Pc(210) int local210 = local146;
		if (local91 == 255) {
			local146 += this.anInt5043;
		}
		@Pc(222) int local222 = local146;
		if (local99 == 1) {
			local146 += this.anInt5043;
		}
		@Pc(232) int local232 = local146;
		if (local107 == 1) {
			local146 += this.anInt5042;
		}
		@Pc(242) int local242 = local146;
		if (local95 == 1) {
			local146 += this.anInt5043;
		}
		@Pc(252) int local252 = local146;
		local146 += local123;
		@Pc(258) int local258 = local146;
		if (local103 == 1) {
			local146 += this.anInt5043 * 2;
		}
		@Pc(270) int local270 = local146;
		local146 += local127;
		@Pc(276) int local276 = local146;
		local146 += this.anInt5043 * 2;
		@Pc(285) int local285 = local146;
		local146 += local111;
		@Pc(291) int local291 = local146;
		local146 += local115;
		@Pc(297) int local297 = local146;
		local146 += local119;
		@Pc(303) int local303 = local146;
		local146 += local129 * 6;
		@Pc(311) int local311 = local146;
		local146 += local131 * 6;
		@Pc(319) int local319 = local146;
		local146 += local131 * 6;
		@Pc(327) int local327 = local146;
		local146 += local131;
		@Pc(333) int local333 = local146;
		local146 += local131;
		@Pc(339) int local339 = local146;
		local146 += local131 + local133 * 2;
		this.anIntArray413 = new int[this.anInt5042];
		if (local103 == 1) {
			this.aShortArray86 = new short[this.anInt5043];
		}
		if (local99 == 1) {
			this.anIntArray415 = new int[this.anInt5043];
		}
		this.aShortArray93 = new short[this.anInt5043];
		this.aShortArray91 = new short[this.anInt5043];
		if (local76) {
			this.aByteArray72 = new byte[this.anInt5043];
		}
		if (this.anInt5034 > 0) {
			this.aShortArray85 = new short[this.anInt5034];
			if (local131 > 0) {
				this.aShortArray97 = new short[local131];
				this.aByteArray70 = new byte[local131];
				this.aByteArray71 = new byte[local131];
				this.aShortArray88 = new short[local131];
				this.aShortArray94 = new short[local131];
				this.aByteArray75 = new byte[local131];
			}
			if (local133 > 0) {
				this.aByteArray74 = new byte[local133];
				this.aByteArray73 = new byte[local133];
			}
			this.aShortArray96 = new short[this.anInt5034];
			this.aShortArray95 = new short[this.anInt5034];
		}
		this.anIntArray414 = new int[this.anInt5042];
		if (local107 == 1) {
			this.anIntArray417 = new int[this.anInt5042];
		}
		if (local95 == 1) {
			this.aByteArray67 = new byte[this.anInt5043];
		}
		if (local91 == 255) {
			this.aByteArray68 = new byte[this.anInt5043];
		} else {
			this.aByte61 = (byte) local91;
		}
		if (local103 == 1 && this.anInt5034 > 0) {
			this.aByteArray76 = new byte[this.anInt5043];
		}
		this.aShortArray89 = new short[this.anInt5043];
		this.anIntArray416 = new int[this.anInt5042];
		this.aShortArray92 = new short[this.anInt5043];
		local10.anInt2667 = local187;
		local15.anInt2667 = local285;
		local20.anInt2667 = local291;
		local25.anInt2667 = local297;
		local30.anInt2667 = local232;
		@Pc(540) int local540 = 0;
		@Pc(542) int local542 = 0;
		@Pc(544) int local544 = 0;
		@Pc(552) int local552;
		for (@Pc(546) int local546 = 0; local546 < this.anInt5042; local546++) {
			local552 = local10.method2380();
			@Pc(554) int local554 = 0;
			if ((local552 & 0x1) != 0) {
				local554 = local15.method2370();
			}
			@Pc(567) int local567 = 0;
			if ((local552 & 0x2) != 0) {
				local567 = local20.method2370();
			}
			@Pc(577) int local577 = 0;
			if ((local552 & 0x4) != 0) {
				local577 = local25.method2370();
			}
			this.anIntArray413[local546] = local554 + local540;
			this.anIntArray416[local546] = local542 + local567;
			this.anIntArray414[local546] = local577 + local544;
			local540 = this.anIntArray413[local546];
			local544 = this.anIntArray414[local546];
			local542 = this.anIntArray416[local546];
			if (local107 == 1) {
				this.anIntArray417[local546] = local30.method2380();
			}
		}
		local10.anInt2667 = local276;
		local15.anInt2667 = local194;
		local20.anInt2667 = local210;
		local25.anInt2667 = local242;
		local30.anInt2667 = local222;
		local35.anInt2667 = local258;
		local40.anInt2667 = local270;
		for (local552 = 0; local552 < this.anInt5043; local552++) {
			this.aShortArray89[local552] = (short) local10.method2404();
			if (local76) {
				this.aByteArray72[local552] = local15.method2393();
			}
			if (local91 == 255) {
				this.aByteArray68[local552] = local20.method2393();
			}
			if (local95 == 1) {
				this.aByteArray67[local552] = local25.method2393();
			}
			if (local99 == 1) {
				this.anIntArray415[local552] = local30.method2380();
			}
			if (local103 == 1) {
				this.aShortArray86[local552] = (short) (local35.method2404() - 1);
			}
			if (this.aByteArray76 != null) {
				if (this.aShortArray86[local552] == -1) {
					this.aByteArray76[local552] = -1;
				} else {
					this.aByteArray76[local552] = (byte) (local40.method2380() - 1);
				}
			}
		}
		this.anInt5041 = -1;
		local10.anInt2667 = local252;
		local15.anInt2667 = local203;
		@Pc(778) short local778 = 0;
		@Pc(780) short local780 = 0;
		@Pc(782) short local782 = 0;
		@Pc(784) short local784 = 0;
		@Pc(796) int local796;
		for (@Pc(790) int local790 = 0; local790 < this.anInt5043; local790++) {
			local796 = local15.method2380();
			if (local796 == 1) {
				local778 = (short) (local10.method2370() + local784);
				local780 = (short) (local10.method2370() + local778);
				local782 = (short) (local10.method2370() + local780);
				this.aShortArray91[local790] = local778;
				local784 = local782;
				this.aShortArray93[local790] = local780;
				this.aShortArray92[local790] = local782;
				if (local778 > this.anInt5041) {
					this.anInt5041 = local778;
				}
				if (this.anInt5041 < local780) {
					this.anInt5041 = local780;
				}
				if (local782 > this.anInt5041) {
					this.anInt5041 = local782;
				}
			}
			if (local796 == 2) {
				local780 = local782;
				local782 = (short) (local10.method2370() + local784);
				this.aShortArray91[local790] = local778;
				local784 = local782;
				this.aShortArray93[local790] = local780;
				this.aShortArray92[local790] = local782;
				if (this.anInt5041 < local782) {
					this.anInt5041 = local782;
				}
			}
			if (local796 == 3) {
				local778 = local782;
				local782 = (short) (local10.method2370() + local784);
				local784 = local782;
				this.aShortArray91[local790] = local778;
				this.aShortArray93[local790] = local780;
				this.aShortArray92[local790] = local782;
				if (local782 > this.anInt5041) {
					this.anInt5041 = local782;
				}
			}
			if (local796 == 4) {
				@Pc(953) short local953 = local778;
				local778 = local780;
				local780 = local953;
				local782 = (short) (local10.method2370() + local784);
				this.aShortArray91[local790] = local778;
				local784 = local782;
				this.aShortArray93[local790] = local953;
				this.aShortArray92[local790] = local782;
				if (this.anInt5041 < local782) {
					this.anInt5041 = local782;
				}
			}
		}
		local10.anInt2667 = local303;
		this.anInt5041++;
		local15.anInt2667 = local311;
		local20.anInt2667 = local319;
		local25.anInt2667 = local327;
		local30.anInt2667 = local333;
		local35.anInt2667 = local339;
		@Pc(1036) int local1036;
		for (local796 = 0; local796 < this.anInt5034; local796++) {
			local1036 = this.aByteArray69[local796] & 0xFF;
			if (local1036 == 0) {
				this.aShortArray96[local796] = (short) local10.method2404();
				this.aShortArray85[local796] = (short) local10.method2404();
				this.aShortArray95[local796] = (short) local10.method2404();
			}
			if (local1036 == 1) {
				this.aShortArray96[local796] = (short) local15.method2404();
				this.aShortArray85[local796] = (short) local15.method2404();
				this.aShortArray95[local796] = (short) local15.method2404();
				this.aShortArray88[local796] = (short) local20.method2404();
				this.aShortArray94[local796] = (short) local20.method2404();
				this.aShortArray97[local796] = (short) local20.method2404();
				this.aByteArray71[local796] = local25.method2393();
				this.aByteArray70[local796] = local30.method2393();
				this.aByteArray75[local796] = local35.method2393();
			}
			if (local1036 == 2) {
				this.aShortArray96[local796] = (short) local15.method2404();
				this.aShortArray85[local796] = (short) local15.method2404();
				this.aShortArray95[local796] = (short) local15.method2404();
				this.aShortArray88[local796] = (short) local20.method2404();
				this.aShortArray94[local796] = (short) local20.method2404();
				this.aShortArray97[local796] = (short) local20.method2404();
				this.aByteArray71[local796] = local25.method2393();
				this.aByteArray70[local796] = local30.method2393();
				this.aByteArray75[local796] = local35.method2393();
				this.aByteArray74[local796] = local35.method2393();
				this.aByteArray73[local796] = local35.method2393();
			}
			if (local1036 == 3) {
				this.aShortArray96[local796] = (short) local15.method2404();
				this.aShortArray85[local796] = (short) local15.method2404();
				this.aShortArray95[local796] = (short) local15.method2404();
				this.aShortArray88[local796] = (short) local20.method2404();
				this.aShortArray94[local796] = (short) local20.method2404();
				this.aShortArray97[local796] = (short) local20.method2404();
				this.aByteArray71[local796] = local25.method2393();
				this.aByteArray70[local796] = local30.method2393();
				this.aByteArray75[local796] = local35.method2393();
			}
		}
		if (!local87) {
			return;
		}
		local10.anInt2667 = local146;
		local1036 = local10.method2380();
		@Pc(1323) int local1323;
		@Pc(1329) int local1329;
		if (local1036 > 0) {
			this.aClass125Array3 = new Class125[local1036];
			for (local1323 = 0; local1323 < local1036; local1323++) {
				local1329 = local10.method2404();
				@Pc(1333) int local1333 = local10.method2404();
				@Pc(1343) byte local1343;
				if (local91 == 255) {
					local1343 = this.aByteArray68[local1333];
				} else {
					local1343 = (byte) local91;
				}
				this.aClass125Array3[local1323] = new Class125(local1329, this.aShortArray91[local1333], this.aShortArray93[local1333], this.aShortArray92[local1333], local1343);
			}
		}
		local1323 = local10.method2380();
		if (local1323 <= 0) {
			return;
		}
		this.aClass143Array3 = new Class143[local1323];
		for (local1329 = 0; local1329 < local1323; local1329++) {
			this.aClass143Array3[local1329] = new Class143(local10.method2404(), local10.method2404());
		}
		return;
	}

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIBI)I")
	public int method4174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5042; local7++) {
			if (arg2 == this.anIntArray413[local7] && this.anIntArray416[local7] == arg0 && this.anIntArray414[local7] == arg1) {
				return local7;
			}
		}
		this.anIntArray413[this.anInt5042] = arg2;
		this.anIntArray416[this.anInt5042] = arg0;
		this.anIntArray414[this.anInt5042] = arg1;
		this.anInt5041 = this.anInt5042 + 1;
		return this.anInt5042++;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!pe;BS)I")
	private int method4175(@OriginalArg(0) int arg0, @OriginalArg(1) Class153 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray413[arg0];
		@Pc(15) int local15 = arg1.anIntArray416[arg0];
		@Pc(20) int local20 = arg1.anIntArray414[arg0];
		for (@Pc(28) int local28 = 0; local28 < this.anInt5042; local28++) {
			if (local10 == this.anIntArray413[local28] && local15 == this.anIntArray416[local28] && this.anIntArray414[local28] == local20) {
				this.aShortArray90[local28] |= arg2;
				return local28;
			}
		}
		this.anIntArray413[this.anInt5042] = local10;
		this.anIntArray416[this.anInt5042] = local15;
		this.anIntArray414[this.anInt5042] = local20;
		this.aShortArray90[this.anInt5042] = arg2;
		this.anIntArray417[this.anInt5042] = arg1.anIntArray417 == null ? -1 : arg1.anIntArray417[arg0];
		return this.anInt5042++;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(SBSZBBIII)I")
	public int method4176(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray91[this.anInt5043] = (short) arg7;
		this.aShortArray93[this.anInt5043] = (short) arg5;
		this.aShortArray92[this.anInt5043] = (short) arg6;
		this.aByteArray72[this.anInt5043] = arg3;
		this.aByteArray76[this.anInt5043] = arg1;
		this.aShortArray89[this.anInt5043] = arg2;
		this.aByteArray67[this.anInt5043] = arg4;
		this.aShortArray86[this.anInt5043] = arg0;
		return this.anInt5043++;
	}
}
