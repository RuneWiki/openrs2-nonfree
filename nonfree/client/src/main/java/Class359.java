import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class359 {

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "[B")
	public byte[] aByteArray99;

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "[I")
	public int[] anIntArray622;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "[S")
	public short[] aShortArray147;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "[B")
	public byte[] aByteArray100;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "[I")
	public int[] anIntArray623;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "[I")
	public int[] anIntArray624;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "[I")
	public int[] anIntArray625;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "[S")
	public short[] aShortArray148;

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "[S")
	public short[] aShortArray149;

	@OriginalMember(owner = "client!vo", name = "u", descriptor = "[S")
	public short[] aShortArray150;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "[B")
	public byte[] aByteArray102;

	@OriginalMember(owner = "client!vo", name = "w", descriptor = "[I")
	public int[] anIntArray626;

	@OriginalMember(owner = "client!vo", name = "y", descriptor = "[B")
	public byte[] aByteArray103;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "[I")
	public int[] anIntArray627;

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "[S")
	public short[] aShortArray151;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "[S")
	public short[] aShortArray152;

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "[I")
	public int[] anIntArray628;

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "[S")
	public short[] aShortArray153;

	@OriginalMember(owner = "client!vo", name = "K", descriptor = "[I")
	public int[] anIntArray629;

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "[I")
	public int[] anIntArray630;

	@OriginalMember(owner = "client!vo", name = "N", descriptor = "[I")
	public int[] anIntArray631;

	@OriginalMember(owner = "client!vo", name = "P", descriptor = "[B")
	public byte[] aByteArray104;

	@OriginalMember(owner = "client!vo", name = "Q", descriptor = "[Lclient!nba;")
	public Class232[] aClass232Array5;

	@OriginalMember(owner = "client!vo", name = "R", descriptor = "[S")
	public short[] aShortArray154;

	@OriginalMember(owner = "client!vo", name = "T", descriptor = "[S")
	public short[] aShortArray155;

	@OriginalMember(owner = "client!vo", name = "V", descriptor = "[Lclient!mv;")
	public Class228[] aClass228Array5;

	@OriginalMember(owner = "client!vo", name = "W", descriptor = "[I")
	public int[] anIntArray632;

	@OriginalMember(owner = "client!vo", name = "X", descriptor = "[B")
	public byte[] aByteArray105;

	@OriginalMember(owner = "client!vo", name = "Y", descriptor = "[S")
	public short[] aShortArray156;

	@OriginalMember(owner = "client!vo", name = "bb", descriptor = "[Lclient!sq;")
	public Class311[] aClass311Array1;

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
	public int anInt9825 = 0;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
	public int anInt9832 = 0;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "I")
	public int anInt9836 = 0;

	@OriginalMember(owner = "client!vo", name = "O", descriptor = "I")
	public int anInt9841 = 12;

	@OriginalMember(owner = "client!vo", name = "U", descriptor = "B")
	public byte aByte126 = 0;

	@OriginalMember(owner = "client!vo", name = "ab", descriptor = "I")
	public int anInt9844 = 0;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V")
	private Class359() {
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "([B)V")
	public Class359(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method8358(arg0);
		} else {
			this.method8357(arg0);
		}
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(III)V")
	public Class359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray148 = new short[arg1];
		this.anIntArray627 = new int[arg0];
		this.aByteArray99 = new byte[arg1];
		this.aShortArray156 = new short[arg1];
		this.aShortArray155 = new short[arg1];
		this.aShortArray150 = new short[arg1];
		this.anIntArray631 = new int[arg1];
		this.anIntArray625 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray102 = new byte[arg2];
			this.anIntArray628 = new int[arg2];
			this.aShortArray152 = new short[arg2];
			this.anIntArray629 = new int[arg2];
			this.aByteArray101 = new byte[arg2];
			this.aShortArray147 = new short[arg2];
			this.anIntArray624 = new int[arg2];
			this.aByteArray103 = new byte[arg2];
			this.anIntArray623 = new int[arg2];
			this.anIntArray622 = new int[arg2];
			this.aShortArray154 = new short[arg2];
			this.anIntArray626 = new int[arg2];
		}
		this.aByteArray104 = new byte[arg1];
		this.aByteArray105 = new byte[arg1];
		this.aShortArray149 = new short[arg1];
		this.aByteArray100 = new byte[arg1];
		this.anIntArray630 = new int[arg0];
		this.anIntArray632 = new int[arg0];
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "([Lclient!vo;I)V")
	public Class359(@OriginalArg(0) Class359[] arg0, @OriginalArg(1) int arg1) {
		this.anInt9844 = 0;
		this.anInt9836 = 0;
		this.anInt9832 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte126 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class359 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt9836 += local59.anInt9836;
				this.anInt9844 += local59.anInt9844;
				this.anInt9832 += local59.anInt9832;
				local38 |= local59.aByteArray104 != null;
				if (local59.aClass311Array1 != null) {
					local36 += local59.aClass311Array1.length;
				}
				if (local59.aClass232Array5 != null) {
					local34 += local59.aClass232Array5.length;
				}
				if (local59.aClass228Array5 != null) {
					local32 += local59.aClass228Array5.length;
				}
				local44 |= local59.aByteArray100 != null;
				if (local59.aByteArray105 == null) {
					if (this.aByte126 == -1) {
						this.aByte126 = local59.aByte126;
					}
					if (this.aByte126 != local59.aByte126) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray99 != null;
				local46 |= local59.aShortArray155 != null;
				local48 |= local59.anIntArray631 != null;
			}
		}
		this.anIntArray625 = new int[this.anInt9844];
		if (this.anInt9836 > 0) {
			this.anIntArray622 = new int[this.anInt9836];
			this.anIntArray624 = new int[this.anInt9836];
			this.aShortArray152 = new short[this.anInt9836];
			this.anIntArray628 = new int[this.anInt9836];
			this.aShortArray154 = new short[this.anInt9836];
			this.aByteArray101 = new byte[this.anInt9836];
			this.anIntArray629 = new int[this.anInt9836];
			this.anIntArray623 = new int[this.anInt9836];
			this.aShortArray147 = new short[this.anInt9836];
			this.aByteArray102 = new byte[this.anInt9836];
			this.aByteArray103 = new byte[this.anInt9836];
			this.anIntArray626 = new int[this.anInt9836];
		}
		if (local42) {
			this.aByteArray99 = new byte[this.anInt9832];
		}
		this.anIntArray630 = new int[this.anInt9844];
		this.aShortArray151 = new short[this.anInt9844];
		if (local34 > 0) {
			this.aClass232Array5 = new Class232[local34];
		}
		if (local44) {
			this.aByteArray100 = new byte[this.anInt9832];
		}
		if (local38) {
			this.aByteArray104 = new byte[this.anInt9832];
		}
		if (local40) {
			this.aByteArray105 = new byte[this.anInt9832];
		}
		this.aShortArray148 = new short[this.anInt9832];
		this.anIntArray627 = new int[this.anInt9844];
		this.anIntArray632 = new int[this.anInt9844];
		if (local32 > 0) {
			this.aClass228Array5 = new Class228[local32];
		}
		this.aShortArray150 = new short[this.anInt9832];
		if (local36 > 0) {
			this.aClass311Array1 = new Class311[local36];
		}
		if (local46) {
			this.aShortArray155 = new short[this.anInt9832];
		}
		this.aShortArray156 = new short[this.anInt9832];
		this.aShortArray149 = new short[this.anInt9832];
		this.aShortArray153 = new short[this.anInt9832];
		if (local48) {
			this.anIntArray631 = new int[this.anInt9832];
		}
		this.anInt9836 = 0;
		local32 = 0;
		this.anInt9832 = 0;
		this.anInt9844 = 0;
		local36 = 0;
		local34 = 0;
		@Pc(620) int local620;
		@Pc(631) int local631;
		for (@Pc(384) int local384 = 0; local384 < arg1; local384++) {
			@Pc(391) short local391 = (short) (0x1 << local384);
			@Pc(395) Class359 local395 = arg0[local384];
			if (local395 != null) {
				@Pc(402) int local402;
				if (local395.aClass311Array1 != null) {
					for (local402 = 0; local402 < local395.aClass311Array1.length; local402++) {
						@Pc(409) Class311 local409 = local395.aClass311Array1[local402];
						this.aClass311Array1[local36++] = local409.method7681(local409.anInt8944 + this.anInt9832);
					}
				}
				for (local402 = 0; local402 < local395.anInt9832; local402++) {
					if (local38 && local395.aByteArray104 != null) {
						this.aByteArray104[this.anInt9832] = local395.aByteArray104[local402];
					}
					if (local40) {
						if (local395.aByteArray105 == null) {
							this.aByteArray105[this.anInt9832] = local395.aByte126;
						} else {
							this.aByteArray105[this.anInt9832] = local395.aByteArray105[local402];
						}
					}
					if (local42 && local395.aByteArray99 != null) {
						this.aByteArray99[this.anInt9832] = local395.aByteArray99[local402];
					}
					if (local46) {
						if (local395.aShortArray155 == null) {
							this.aShortArray155[this.anInt9832] = -1;
						} else {
							this.aShortArray155[this.anInt9832] = local395.aShortArray155[local402];
						}
					}
					if (local48) {
						if (local395.anIntArray631 == null) {
							this.anIntArray631[this.anInt9832] = -1;
						} else {
							this.anIntArray631[this.anInt9832] = local395.anIntArray631[local402];
						}
					}
					this.aShortArray156[this.anInt9832] = (short) this.method8359(local391, local395, local395.aShortArray156[local402]);
					this.aShortArray149[this.anInt9832] = (short) this.method8359(local391, local395, local395.aShortArray149[local402]);
					this.aShortArray150[this.anInt9832] = (short) this.method8359(local391, local395, local395.aShortArray150[local402]);
					this.aShortArray153[this.anInt9832] = local391;
					this.aShortArray148[this.anInt9832] = local395.aShortArray148[local402];
					this.anInt9832++;
				}
				@Pc(607) int local607;
				if (local395.aClass228Array5 != null) {
					for (local607 = 0; local607 < local395.aClass228Array5.length; local607++) {
						local620 = this.method8359(local391, local395, local395.aClass228Array5[local607].anInt6691);
						local631 = this.method8359(local391, local395, local395.aClass228Array5[local607].anInt6698);
						@Pc(642) int local642 = this.method8359(local391, local395, local395.aClass228Array5[local607].anInt6685);
						this.aClass228Array5[local32] = local395.aClass228Array5[local607].method5813(local631, local620, local642);
						local32++;
					}
				}
				if (local395.aClass232Array5 != null) {
					for (local607 = 0; local607 < local395.aClass232Array5.length; local607++) {
						local620 = this.method8359(local391, local395, local395.aClass232Array5[local607].anInt6734);
						this.aClass232Array5[local34] = local395.aClass232Array5[local607].method5855(local620);
						local34++;
					}
				}
			}
		}
		@Pc(712) int local712 = 0;
		this.anInt9825 = this.anInt9844;
		for (@Pc(718) int local718 = 0; local718 < arg1; local718++) {
			@Pc(725) short local725 = (short) (0x1 << local718);
			@Pc(729) Class359 local729 = arg0[local718];
			if (local729 != null) {
				for (local620 = 0; local620 < local729.anInt9832; local620++) {
					if (local44) {
						this.aByteArray100[local712++] = (byte) (local729.aByteArray100 == null || local729.aByteArray100[local620] == -1 ? -1 : this.anInt9836 + local729.aByteArray100[local620]);
					}
				}
				for (local631 = 0; local631 < local729.anInt9836; local631++) {
					@Pc(786) byte local786 = this.aByteArray103[this.anInt9836] = local729.aByteArray103[local631];
					if (local786 == 0) {
						this.aShortArray154[this.anInt9836] = (short) this.method8359(local725, local729, local729.aShortArray154[local631]);
						this.aShortArray147[this.anInt9836] = (short) this.method8359(local725, local729, local729.aShortArray147[local631]);
						this.aShortArray152[this.anInt9836] = (short) this.method8359(local725, local729, local729.aShortArray152[local631]);
					}
					if (local786 >= 1 && local786 <= 3) {
						this.aShortArray154[this.anInt9836] = local729.aShortArray154[local631];
						this.aShortArray147[this.anInt9836] = local729.aShortArray147[local631];
						this.aShortArray152[this.anInt9836] = local729.aShortArray152[local631];
						this.anIntArray624[this.anInt9836] = local729.anIntArray624[local631];
						this.anIntArray628[this.anInt9836] = local729.anIntArray628[local631];
						this.anIntArray622[this.anInt9836] = local729.anIntArray622[local631];
						this.aByteArray102[this.anInt9836] = local729.aByteArray102[local631];
						this.aByteArray101[this.anInt9836] = local729.aByteArray101[local631];
						this.anIntArray629[this.anInt9836] = local729.anIntArray629[local631];
					}
					if (local786 == 2) {
						this.anIntArray626[this.anInt9836] = local729.anIntArray626[local631];
						this.anIntArray623[this.anInt9836] = local729.anIntArray623[local631];
					}
					this.anInt9836++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(SBSBSSIBSS)B")
	public byte method8345() {
		if (this.anInt9836 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray103[this.anInt9836] = 3;
		this.aShortArray154[this.anInt9836] = 0;
		this.aShortArray147[this.anInt9836] = 32767;
		this.aShortArray152[this.anInt9836] = 0;
		this.anIntArray624[this.anInt9836] = 1024;
		this.anIntArray628[this.anInt9836] = 1024;
		this.anIntArray622[this.anInt9836] = 1024;
		this.aByteArray102[this.anInt9836] = 0;
		this.aByteArray101[this.anInt9836] = 0;
		this.anIntArray629[this.anInt9836] = 0;
		return (byte) this.anInt9836++;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public void method8347() {
		for (@Pc(13) int local13 = 0; local13 < this.anInt9844; local13++) {
			this.anIntArray625[local13] <<= 0x2;
			this.anIntArray632[local13] <<= 0x2;
			this.anIntArray627[local13] <<= 0x2;
		}
		if (this.anInt9836 <= 0 || this.anIntArray624 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray624.length; local56++) {
			this.anIntArray624[local56] <<= 0x2;
			this.anIntArray628[local56] <<= 0x2;
			if (this.aByteArray103[local56] != 1) {
				this.anIntArray622[local56] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)[[I")
	public int[][] method8348() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt9832; local17++) {
			@Pc(24) int local24 = this.anIntArray631[local17];
			if (local24 >= 0) {
				if (local24 > local10) {
					local10 = local24;
				}
				@Pc(39) int local39 = local8[local24]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt9832; local73++) {
			@Pc(80) int local80 = this.anIntArray631[local73];
			if (local80 >= 0) {
				local52[local80][local8[local80]++] = local73;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(SBS)V")
	public void method8349(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray155 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt9832; local15++) {
			if (arg1 == this.aShortArray155[local15]) {
				this.aShortArray155[local15] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIBI)I")
	public int method8350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) int local17 = 0; local17 < this.anInt9844; local17++) {
			if (this.anIntArray625[local17] == arg1 && arg2 == this.anIntArray632[local17] && this.anIntArray627[local17] == arg0) {
				return local17;
			}
		}
		this.anIntArray625[this.anInt9844] = arg1;
		this.anIntArray632[this.anInt9844] = arg2;
		this.anIntArray627[this.anInt9844] = arg0;
		this.anInt9825 = this.anInt9844 + 1;
		return this.anInt9844++;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(SSI)V")
	public void method8352(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9832; local3++) {
			if (arg1 == this.aShortArray148[local3]) {
				this.aShortArray148[local3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)[[I")
	public int[][] method8353() {
		@Pc(17) int[] local17 = new int[256];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < this.aClass311Array1.length; local21++) {
			@Pc(29) int local29 = this.aClass311Array1[local21].anInt8940;
			if (local29 >= 0) {
				if (local19 < local29) {
					local19 = local29;
				}
				@Pc(43) int local43 = local17[local29]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local19 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local19; local59++) {
			local57[local59] = new int[local17[local59]];
			local17[local59] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass311Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass311Array1[local78].anInt8940;
			if (local86 >= 0) {
				local57[local86][local17[local86]++] = local78;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIBSBIBSI)I")
	public int method8354(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) short arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) short arg6, @OriginalArg(8) int arg7) {
		this.aShortArray156[this.anInt9832] = (short) arg0;
		this.aShortArray149[this.anInt9832] = (short) arg4;
		this.aShortArray150[this.anInt9832] = (short) arg7;
		this.aByteArray104[this.anInt9832] = arg1;
		this.aByteArray100[this.anInt9832] = arg3;
		this.aShortArray148[this.anInt9832] = arg2;
		this.aByteArray99[this.anInt9832] = arg5;
		this.aShortArray155[this.anInt9832] = arg6;
		return this.anInt9832++;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BZ)[[I")
	public int[][] method8355(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt9844 : this.anInt9825;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray630[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local27 > local10) {
					local10 = local27;
				}
			}
		}
		@Pc(58) int[][] local58 = new int[local10 + 1][];
		for (@Pc(60) int local60 = 0; local60 <= local10; local60++) {
			local58[local60] = new int[local8[local60]];
			local8[local60] = 0;
		}
		for (@Pc(87) int local87 = 0; local87 < local18; local87++) {
			@Pc(94) int local94 = this.anIntArray630[local87];
			if (local94 >= 0) {
				local58[local94][local8[local94]++] = local87;
			}
		}
		return local58;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIII)V")
	public void method8356(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9844; local3++) {
			this.anIntArray625[local3] += arg1;
			this.anIntArray632[local3] += arg0;
			this.anIntArray627[local3] += arg2;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([BZ)V")
	private void method8357(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class3_Sub9 local14 = new Class3_Sub9(arg0);
		@Pc(19) Class3_Sub9 local19 = new Class3_Sub9(arg0);
		@Pc(24) Class3_Sub9 local24 = new Class3_Sub9(arg0);
		@Pc(29) Class3_Sub9 local29 = new Class3_Sub9(arg0);
		@Pc(34) Class3_Sub9 local34 = new Class3_Sub9(arg0);
		local14.anInt6453 = arg0.length - 18;
		this.anInt9844 = local14.method5610();
		this.anInt9832 = local14.method5610();
		this.anInt9836 = local14.method5633();
		@Pc(59) int local59 = local14.method5633();
		@Pc(63) int local63 = local14.method5633();
		@Pc(67) int local67 = local14.method5633();
		@Pc(71) int local71 = local14.method5633();
		@Pc(75) int local75 = local14.method5633();
		@Pc(79) int local79 = local14.method5610();
		@Pc(83) int local83 = local14.method5610();
		@Pc(87) int local87 = local14.method5610();
		@Pc(91) int local91 = local14.method5610();
		@Pc(100) int local100 = this.anInt9844;
		@Pc(102) int local102 = local100;
		local100 += this.anInt9832;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt9832;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt9832;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt9832;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt9844;
		}
		@Pc(151) int local151 = local100;
		if (local67 == 1) {
			local100 += this.anInt9832;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt9832 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt9836 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		this.aShortArray156 = new short[this.anInt9832];
		this.anIntArray625 = new int[this.anInt9844];
		if (local67 == 1) {
			this.aByteArray99 = new byte[this.anInt9832];
		}
		if (local71 == 1) {
			this.anIntArray631 = new int[this.anInt9832];
		}
		local14.anInt6453 = 0;
		if (this.anInt9836 > 0) {
			this.aShortArray152 = new short[this.anInt9836];
			this.aByteArray103 = new byte[this.anInt9836];
			this.aShortArray154 = new short[this.anInt9836];
			this.aShortArray147 = new short[this.anInt9836];
		}
		this.aShortArray150 = new short[this.anInt9832];
		this.anIntArray627 = new int[this.anInt9844];
		if (local59 == 1) {
			this.aByteArray100 = new byte[this.anInt9832];
			this.aShortArray155 = new short[this.anInt9832];
			this.aByteArray104 = new byte[this.anInt9832];
		}
		this.aShortArray149 = new short[this.anInt9832];
		if (local63 == 255) {
			this.aByteArray105 = new byte[this.anInt9832];
		} else {
			this.aByte126 = (byte) local63;
		}
		this.aShortArray148 = new short[this.anInt9832];
		if (local75 == 1) {
			this.anIntArray630 = new int[this.anInt9844];
		}
		this.anIntArray632 = new int[this.anInt9844];
		local19.anInt6453 = local187;
		local24.anInt6453 = local193;
		local29.anInt6453 = local100;
		local34.anInt6453 = local141;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(356) int local356;
		@Pc(358) int local358;
		for (@Pc(350) int local350 = 0; local350 < this.anInt9844; local350++) {
			local356 = local14.method5633();
			local358 = 0;
			if ((local356 & 0x1) != 0) {
				local358 = local19.method5608();
			}
			@Pc(368) int local368 = 0;
			if ((local356 & 0x2) != 0) {
				local368 = local24.method5608();
			}
			@Pc(378) int local378 = 0;
			if ((local356 & 0x4) != 0) {
				local378 = local29.method5608();
			}
			this.anIntArray625[local350] = local344 + local358;
			this.anIntArray632[local350] = local368 + local346;
			this.anIntArray627[local350] = local378 + local348;
			local348 = this.anIntArray627[local350];
			local344 = this.anIntArray625[local350];
			local346 = this.anIntArray632[local350];
			if (local75 == 1) {
				this.anIntArray630[local350] = local34.method5633();
			}
		}
		local14.anInt6453 = local169;
		local19.anInt6453 = local129;
		local24.anInt6453 = local109;
		local29.anInt6453 = local151;
		local34.anInt6453 = local119;
		for (local356 = 0; local356 < this.anInt9832; local356++) {
			this.aShortArray148[local356] = (short) local14.method5610();
			if (local59 == 1) {
				local358 = local19.method5633();
				if ((local358 & 0x1) == 1) {
					this.aByteArray104[local356] = 1;
					local7 = true;
				} else {
					this.aByteArray104[local356] = 0;
				}
				if ((local358 & 0x2) == 2) {
					this.aByteArray100[local356] = (byte) (local358 >> 2);
					this.aShortArray155[local356] = this.aShortArray148[local356];
					this.aShortArray148[local356] = 127;
					if (this.aShortArray155[local356] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray100[local356] = -1;
					this.aShortArray155[local356] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray105[local356] = local24.method5619();
			}
			if (local67 == 1) {
				this.aByteArray99[local356] = local29.method5619();
			}
			if (local71 == 1) {
				this.anIntArray631[local356] = local34.method5633();
			}
		}
		this.anInt9825 = -1;
		local14.anInt6453 = local163;
		local19.anInt6453 = local102;
		@Pc(599) short local599 = 0;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(613) int local613;
		for (@Pc(607) int local607 = 0; local607 < this.anInt9832; local607++) {
			local613 = local19.method5633();
			if (local613 == 1) {
				local599 = (short) (local605 + local14.method5608());
				local601 = (short) (local599 + local14.method5608());
				local603 = (short) (local14.method5608() + local601);
				this.aShortArray156[local607] = local599;
				local605 = local603;
				this.aShortArray149[local607] = local601;
				this.aShortArray150[local607] = local603;
				if (local599 > this.anInt9825) {
					this.anInt9825 = local599;
				}
				if (this.anInt9825 < local601) {
					this.anInt9825 = local601;
				}
				if (this.anInt9825 < local603) {
					this.anInt9825 = local603;
				}
			}
			if (local613 == 2) {
				local601 = local603;
				local603 = (short) (local14.method5608() + local605);
				local605 = local603;
				this.aShortArray156[local607] = local599;
				this.aShortArray149[local607] = local601;
				this.aShortArray150[local607] = local603;
				if (local603 > this.anInt9825) {
					this.anInt9825 = local603;
				}
			}
			if (local613 == 3) {
				local599 = local603;
				local603 = (short) (local14.method5608() + local605);
				this.aShortArray156[local607] = local599;
				local605 = local603;
				this.aShortArray149[local607] = local601;
				this.aShortArray150[local607] = local603;
				if (this.anInt9825 < local603) {
					this.anInt9825 = local603;
				}
			}
			if (local613 == 4) {
				@Pc(772) short local772 = local599;
				local599 = local601;
				local601 = local772;
				local603 = (short) (local605 + local14.method5608());
				local605 = local603;
				this.aShortArray156[local607] = local599;
				this.aShortArray149[local607] = local772;
				this.aShortArray150[local607] = local603;
				if (this.anInt9825 < local603) {
					this.anInt9825 = local603;
				}
			}
		}
		this.anInt9825++;
		local14.anInt6453 = local178;
		for (local613 = 0; local613 < this.anInt9836; local613++) {
			this.aByteArray103[local613] = 0;
			this.aShortArray154[local613] = (short) local14.method5610();
			this.aShortArray147[local613] = (short) local14.method5610();
			this.aShortArray152[local613] = (short) local14.method5610();
		}
		if (this.aByteArray100 != null) {
			@Pc(872) boolean local872 = false;
			for (@Pc(874) int local874 = 0; local874 < this.anInt9832; local874++) {
				@Pc(883) int local883 = this.aByteArray100[local874] & 0xFF;
				if (local883 != 255) {
					if (this.aShortArray156[local874] == (this.aShortArray154[local883] & 0xFFFF) && this.aShortArray149[local874] == (this.aShortArray147[local883] & 0xFFFF) && (this.aShortArray152[local883] & 0xFFFF) == this.aShortArray150[local874]) {
						this.aByteArray100[local874] = -1;
					} else {
						local872 = true;
					}
				}
			}
			if (!local872) {
				this.aByteArray100 = null;
			}
		}
		if (!local9) {
			this.aShortArray155 = null;
		}
		if (!local7) {
			this.aByteArray104 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[B)V")
	private void method8358(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub9 local10 = new Class3_Sub9(arg0);
		@Pc(15) Class3_Sub9 local15 = new Class3_Sub9(arg0);
		@Pc(20) Class3_Sub9 local20 = new Class3_Sub9(arg0);
		@Pc(25) Class3_Sub9 local25 = new Class3_Sub9(arg0);
		@Pc(30) Class3_Sub9 local30 = new Class3_Sub9(arg0);
		@Pc(35) Class3_Sub9 local35 = new Class3_Sub9(arg0);
		@Pc(40) Class3_Sub9 local40 = new Class3_Sub9(arg0);
		local10.anInt6453 = arg0.length - 23;
		this.anInt9844 = local10.method5610();
		this.anInt9832 = local10.method5610();
		this.anInt9836 = local10.method5633();
		@Pc(65) int local65 = local10.method5633();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt6453 -= 7;
			this.anInt9841 = local10.method5633();
			local10.anInt6453 += 6;
		}
		@Pc(128) int local128 = local10.method5633();
		@Pc(132) int local132 = local10.method5633();
		@Pc(136) int local136 = local10.method5633();
		@Pc(140) int local140 = local10.method5633();
		@Pc(144) int local144 = local10.method5633();
		@Pc(150) int local150 = local10.method5610();
		@Pc(154) int local154 = local10.method5610();
		@Pc(160) int local160 = local10.method5610();
		@Pc(164) int local164 = local10.method5610();
		@Pc(168) int local168 = local10.method5610();
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(174) int local174 = 0;
		@Pc(190) int local190;
		if (this.anInt9836 > 0) {
			local10.anInt6453 = 0;
			this.aByteArray103 = new byte[this.anInt9836];
			for (local190 = 0; local190 < this.anInt9836; local190++) {
				@Pc(201) byte local201 = this.aByteArray103[local190] = local10.method5619();
				if (local201 >= 1 && local201 <= 3) {
					local172++;
				}
				if (local201 == 2) {
					local174++;
				}
				if (local201 == 0) {
					local170++;
				}
			}
		}
		local190 = this.anInt9836;
		@Pc(236) int local236 = local190;
		local190 += this.anInt9844;
		@Pc(243) int local243 = local190;
		if (local74) {
			local190 += this.anInt9832;
		}
		@Pc(252) int local252 = local190;
		local190 += this.anInt9832;
		@Pc(263) int local263 = local190;
		if (local128 == 255) {
			local190 += this.anInt9832;
		}
		@Pc(275) int local275 = local190;
		if (local136 == 1) {
			local190 += this.anInt9832;
		}
		@Pc(285) int local285 = local190;
		if (local144 == 1) {
			local190 += this.anInt9844;
		}
		@Pc(295) int local295 = local190;
		if (local132 == 1) {
			local190 += this.anInt9832;
		}
		@Pc(305) int local305 = local190;
		local190 += local164;
		@Pc(311) int local311 = local190;
		if (local140 == 1) {
			local190 += this.anInt9832 * 2;
		}
		@Pc(323) int local323 = local190;
		local190 += local168;
		@Pc(329) int local329 = local190;
		local190 += this.anInt9832 * 2;
		@Pc(338) int local338 = local190;
		local190 += local150;
		@Pc(344) int local344 = local190;
		local190 += local154;
		@Pc(350) int local350 = local190;
		local190 += local160;
		@Pc(356) int local356 = local190;
		local190 += local170 * 6;
		@Pc(364) int local364 = local190;
		local190 += local172 * 6;
		@Pc(372) byte local372 = 6;
		if (this.anInt9841 == 14) {
			local372 = 7;
		} else if (this.anInt9841 >= 15) {
			local372 = 9;
		}
		@Pc(390) int local390 = local190;
		local190 += local372 * local172;
		@Pc(398) int local398 = local190;
		local190 += local172;
		@Pc(404) int local404 = local190;
		local190 += local172;
		@Pc(410) int local410 = local190;
		local190 += local172 + local174 * 2;
		if (local74) {
			this.aByteArray104 = new byte[this.anInt9832];
		}
		if (local140 == 1 && this.anInt9836 > 0) {
			this.aByteArray100 = new byte[this.anInt9832];
		}
		this.anIntArray625 = new int[this.anInt9844];
		this.aShortArray150 = new short[this.anInt9832];
		this.aShortArray148 = new short[this.anInt9832];
		if (local136 == 1) {
			this.anIntArray631 = new int[this.anInt9832];
		}
		this.aShortArray149 = new short[this.anInt9832];
		if (local132 == 1) {
			this.aByteArray99 = new byte[this.anInt9832];
		}
		if (local128 == 255) {
			this.aByteArray105 = new byte[this.anInt9832];
		} else {
			this.aByte126 = (byte) local128;
		}
		this.anIntArray632 = new int[this.anInt9844];
		this.anIntArray627 = new int[this.anInt9844];
		this.aShortArray156 = new short[this.anInt9832];
		if (local144 == 1) {
			this.anIntArray630 = new int[this.anInt9844];
		}
		if (this.anInt9836 > 0) {
			this.aShortArray154 = new short[this.anInt9836];
			this.aShortArray147 = new short[this.anInt9836];
			if (local172 > 0) {
				this.aByteArray101 = new byte[local172];
				this.anIntArray628 = new int[local172];
				this.anIntArray624 = new int[local172];
				this.aByteArray102 = new byte[local172];
				this.anIntArray629 = new int[local172];
				this.anIntArray622 = new int[local172];
			}
			if (local174 > 0) {
				this.anIntArray626 = new int[local174];
				this.anIntArray623 = new int[local174];
			}
			this.aShortArray152 = new short[this.anInt9836];
		}
		if (local140 == 1) {
			this.aShortArray155 = new short[this.anInt9832];
		}
		local10.anInt6453 = local236;
		local15.anInt6453 = local338;
		local20.anInt6453 = local344;
		local25.anInt6453 = local350;
		local30.anInt6453 = local285;
		@Pc(596) int local596 = 0;
		@Pc(598) int local598 = 0;
		@Pc(600) int local600 = 0;
		@Pc(608) int local608;
		for (@Pc(602) int local602 = 0; local602 < this.anInt9844; local602++) {
			local608 = local10.method5633();
			@Pc(610) int local610 = 0;
			if ((local608 & 0x1) != 0) {
				local610 = local15.method5608();
			}
			@Pc(623) int local623 = 0;
			if ((local608 & 0x2) != 0) {
				local623 = local20.method5608();
			}
			@Pc(636) int local636 = 0;
			if ((local608 & 0x4) != 0) {
				local636 = local25.method5608();
			}
			this.anIntArray625[local602] = local596 + local610;
			this.anIntArray632[local602] = local598 + local623;
			this.anIntArray627[local602] = local636 + local600;
			local600 = this.anIntArray627[local602];
			local598 = this.anIntArray632[local602];
			local596 = this.anIntArray625[local602];
			if (local144 == 1) {
				this.anIntArray630[local602] = local30.method5633();
			}
		}
		local10.anInt6453 = local329;
		local15.anInt6453 = local243;
		local20.anInt6453 = local263;
		local25.anInt6453 = local295;
		local30.anInt6453 = local275;
		local35.anInt6453 = local311;
		local40.anInt6453 = local323;
		for (local608 = 0; local608 < this.anInt9832; local608++) {
			this.aShortArray148[local608] = (short) local10.method5610();
			if (local74) {
				this.aByteArray104[local608] = local15.method5619();
			}
			if (local128 == 255) {
				this.aByteArray105[local608] = local20.method5619();
			}
			if (local132 == 1) {
				this.aByteArray99[local608] = local25.method5619();
			}
			if (local136 == 1) {
				this.anIntArray631[local608] = local30.method5633();
			}
			if (local140 == 1) {
				this.aShortArray155[local608] = (short) (local35.method5610() - 1);
			}
			if (this.aByteArray100 != null) {
				if (this.aShortArray155[local608] == -1) {
					this.aByteArray100[local608] = -1;
				} else {
					this.aByteArray100[local608] = (byte) (local40.method5633() - 1);
				}
			}
		}
		this.anInt9825 = -1;
		local10.anInt6453 = local305;
		local15.anInt6453 = local252;
		@Pc(828) short local828 = 0;
		@Pc(830) short local830 = 0;
		@Pc(832) short local832 = 0;
		@Pc(834) short local834 = 0;
		@Pc(842) int local842;
		for (@Pc(836) int local836 = 0; local836 < this.anInt9832; local836++) {
			local842 = local15.method5633();
			if (local842 == 1) {
				local828 = (short) (local834 + local10.method5608());
				local830 = (short) (local828 + local10.method5608());
				local832 = (short) (local10.method5608() + local830);
				local834 = local832;
				this.aShortArray156[local836] = local828;
				this.aShortArray149[local836] = local830;
				this.aShortArray150[local836] = local832;
				if (this.anInt9825 < local828) {
					this.anInt9825 = local828;
				}
				if (local830 > this.anInt9825) {
					this.anInt9825 = local830;
				}
				if (this.anInt9825 < local832) {
					this.anInt9825 = local832;
				}
			}
			if (local842 == 2) {
				local830 = local832;
				local832 = (short) (local834 + local10.method5608());
				local834 = local832;
				this.aShortArray156[local836] = local828;
				this.aShortArray149[local836] = local830;
				this.aShortArray150[local836] = local832;
				if (this.anInt9825 < local832) {
					this.anInt9825 = local832;
				}
			}
			if (local842 == 3) {
				local828 = local832;
				local832 = (short) (local10.method5608() + local834);
				local834 = local832;
				this.aShortArray156[local836] = local828;
				this.aShortArray149[local836] = local830;
				this.aShortArray150[local836] = local832;
				if (this.anInt9825 < local832) {
					this.anInt9825 = local832;
				}
			}
			if (local842 == 4) {
				@Pc(999) short local999 = local828;
				local828 = local830;
				local830 = local999;
				local832 = (short) (local834 + local10.method5608());
				local834 = local832;
				this.aShortArray156[local836] = local828;
				this.aShortArray149[local836] = local999;
				this.aShortArray150[local836] = local832;
				if (local832 > this.anInt9825) {
					this.anInt9825 = local832;
				}
			}
		}
		local10.anInt6453 = local356;
		this.anInt9825++;
		local15.anInt6453 = local364;
		local20.anInt6453 = local390;
		local25.anInt6453 = local398;
		local30.anInt6453 = local404;
		local35.anInt6453 = local410;
		@Pc(1078) int local1078;
		for (local842 = 0; local842 < this.anInt9836; local842++) {
			local1078 = this.aByteArray103[local842] & 0xFF;
			if (local1078 == 0) {
				this.aShortArray154[local842] = (short) local10.method5610();
				this.aShortArray147[local842] = (short) local10.method5610();
				this.aShortArray152[local842] = (short) local10.method5610();
			}
			if (local1078 == 1) {
				this.aShortArray154[local842] = (short) local15.method5610();
				this.aShortArray147[local842] = (short) local15.method5610();
				this.aShortArray152[local842] = (short) local15.method5610();
				if (this.anInt9841 < 15) {
					this.anIntArray624[local842] = local20.method5610();
					if (this.anInt9841 < 14) {
						this.anIntArray628[local842] = local20.method5610();
					} else {
						this.anIntArray628[local842] = local20.method5604();
					}
					this.anIntArray622[local842] = local20.method5610();
				} else {
					this.anIntArray624[local842] = local20.method5604();
					this.anIntArray628[local842] = local20.method5604();
					this.anIntArray622[local842] = local20.method5604();
				}
				this.aByteArray102[local842] = local25.method5619();
				this.aByteArray101[local842] = local30.method5619();
				this.anIntArray629[local842] = local35.method5619();
			}
			if (local1078 == 2) {
				this.aShortArray154[local842] = (short) local15.method5610();
				this.aShortArray147[local842] = (short) local15.method5610();
				this.aShortArray152[local842] = (short) local15.method5610();
				if (this.anInt9841 < 15) {
					this.anIntArray624[local842] = local20.method5610();
					if (this.anInt9841 >= 14) {
						this.anIntArray628[local842] = local20.method5604();
					} else {
						this.anIntArray628[local842] = local20.method5610();
					}
					this.anIntArray622[local842] = local20.method5610();
				} else {
					this.anIntArray624[local842] = local20.method5604();
					this.anIntArray628[local842] = local20.method5604();
					this.anIntArray622[local842] = local20.method5604();
				}
				this.aByteArray102[local842] = local25.method5619();
				this.aByteArray101[local842] = local30.method5619();
				this.anIntArray629[local842] = local35.method5619();
				this.anIntArray626[local842] = local35.method5619();
				this.anIntArray623[local842] = local35.method5619();
			}
			if (local1078 == 3) {
				this.aShortArray154[local842] = (short) local15.method5610();
				this.aShortArray147[local842] = (short) local15.method5610();
				this.aShortArray152[local842] = (short) local15.method5610();
				if (this.anInt9841 >= 15) {
					this.anIntArray624[local842] = local20.method5604();
					this.anIntArray628[local842] = local20.method5604();
					this.anIntArray622[local842] = local20.method5604();
				} else {
					this.anIntArray624[local842] = local20.method5610();
					if (this.anInt9841 < 14) {
						this.anIntArray628[local842] = local20.method5610();
					} else {
						this.anIntArray628[local842] = local20.method5604();
					}
					this.anIntArray622[local842] = local20.method5610();
				}
				this.aByteArray102[local842] = local25.method5619();
				this.aByteArray101[local842] = local30.method5619();
				this.anIntArray629[local842] = local35.method5619();
			}
		}
		local10.anInt6453 = local190;
		@Pc(1489) int local1489;
		@Pc(1495) int local1495;
		@Pc(1501) int local1501;
		@Pc(1570) int local1570;
		if (local85) {
			local1078 = local10.method5633();
			if (local1078 > 0) {
				this.aClass228Array5 = new Class228[local1078];
				for (local1489 = 0; local1489 < local1078; local1489++) {
					local1495 = local10.method5610();
					local1501 = local10.method5610();
					@Pc(1509) byte local1509;
					if (local128 == 255) {
						local1509 = this.aByteArray105[local1501];
					} else {
						local1509 = (byte) local128;
					}
					this.aClass228Array5[local1489] = new Class228(local1495, this.aShortArray156[local1501], this.aShortArray149[local1501], this.aShortArray150[local1501], local1509);
				}
			}
			local1489 = local10.method5633();
			if (local1489 > 0) {
				this.aClass232Array5 = new Class232[local1489];
				for (local1495 = 0; local1495 < local1489; local1495++) {
					local1501 = local10.method5610();
					local1570 = local10.method5610();
					this.aClass232Array5[local1495] = new Class232(local1501, local1570);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1078 = local10.method5633();
		if (local1078 <= 0) {
			return;
		}
		this.aClass311Array1 = new Class311[local1078];
		for (local1489 = 0; local1489 < local1078; local1489++) {
			local1495 = local10.method5610();
			local1501 = local10.method5610();
			local1570 = local10.method5633();
			@Pc(1621) byte local1621 = local10.method5619();
			this.aClass311Array1[local1489] = new Class311(local1495, local1501, local1570, local1621);
		}
		return;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(SLclient!vo;II)I")
	private int method8359(@OriginalArg(0) short arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg1.anIntArray625[arg2];
		@Pc(20) int local20 = arg1.anIntArray632[arg2];
		@Pc(25) int local25 = arg1.anIntArray627[arg2];
		for (@Pc(27) int local27 = 0; local27 < this.anInt9844; local27++) {
			if (this.anIntArray625[local27] == local15 && this.anIntArray632[local27] == local20 && local25 == this.anIntArray627[local27]) {
				this.aShortArray151[local27] |= arg0;
				return local27;
			}
		}
		this.anIntArray625[this.anInt9844] = local15;
		this.anIntArray632[this.anInt9844] = local20;
		this.anIntArray627[this.anInt9844] = local25;
		this.aShortArray151[this.anInt9844] = arg0;
		this.anIntArray630[this.anInt9844] = arg1.anIntArray630 == null ? -1 : arg1.anIntArray630[arg2];
		return this.anInt9844++;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BIII)V")
	public void method8360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(35) int local35;
		if (arg0 != 0) {
			local11 = Class3_Sub13.anIntArray147[arg0];
			local15 = Class3_Sub13.anIntArray146[arg0];
			for (local17 = 0; local17 < this.anInt9844; local17++) {
				local35 = this.anIntArray632[local17] * local11 + this.anIntArray625[local17] * local15 >> 14;
				this.anIntArray632[local17] = local15 * this.anIntArray632[local17] - this.anIntArray625[local17] * local11 >> 14;
				this.anIntArray625[local17] = local35;
			}
		}
		if (arg1 != 0) {
			local11 = Class3_Sub13.anIntArray147[arg1];
			local15 = Class3_Sub13.anIntArray146[arg1];
			for (local17 = 0; local17 < this.anInt9844; local17++) {
				local35 = local15 * this.anIntArray632[local17] - this.anIntArray627[local17] * local11 >> 14;
				this.anIntArray627[local17] = local11 * this.anIntArray632[local17] + this.anIntArray627[local17] * local15 >> 14;
				this.anIntArray632[local17] = local35;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local11 = Class3_Sub13.anIntArray147[arg2];
		local15 = Class3_Sub13.anIntArray146[arg2];
		for (local17 = 0; local17 < this.anInt9844; local17++) {
			local35 = local15 * this.anIntArray625[local17] + this.anIntArray627[local17] * local11 >> 14;
			this.anIntArray627[local17] = local15 * this.anIntArray627[local17] - local11 * this.anIntArray625[local17] >> 14;
			this.anIntArray625[local17] = local35;
		}
	}
}
