import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class140 {

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "[Lclient!ae;")
	public Class6[] aClass6Array3;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "[I")
	public int[] anIntArray565;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "[I")
	public int[] anIntArray566;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "[S")
	public short[] aShortArray71;

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "[S")
	public short[] aShortArray72;

	@OriginalMember(owner = "client!mr", name = "n", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!mr", name = "o", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!mr", name = "w", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!mr", name = "z", descriptor = "[I")
	public int[] anIntArray567;

	@OriginalMember(owner = "client!mr", name = "A", descriptor = "[I")
	public int[] anIntArray568;

	@OriginalMember(owner = "client!mr", name = "D", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!mr", name = "G", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!mr", name = "H", descriptor = "[I")
	public int[] anIntArray569;

	@OriginalMember(owner = "client!mr", name = "I", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!mr", name = "M", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!mr", name = "N", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!mr", name = "O", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!mr", name = "Q", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!mr", name = "S", descriptor = "[B")
	public byte[] aByteArray65;

	@OriginalMember(owner = "client!mr", name = "T", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!mr", name = "U", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!mr", name = "bb", descriptor = "[B")
	public byte[] aByteArray66;

	@OriginalMember(owner = "client!mr", name = "cb", descriptor = "[Lclient!ds;")
	public Class57[] aClass57Array3;

	@OriginalMember(owner = "client!mr", name = "eb", descriptor = "[S")
	public short[] aShortArray83;

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "I")
	public int anInt4125 = 0;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "I")
	public int anInt4126 = 0;

	@OriginalMember(owner = "client!mr", name = "C", descriptor = "I")
	public int anInt4133 = 0;

	@OriginalMember(owner = "client!mr", name = "W", descriptor = "B")
	public byte aByte44 = 0;

	@OriginalMember(owner = "client!mr", name = "Y", descriptor = "I")
	public int anInt4141 = 0;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "([B)V")
	public Class140(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3674(arg0);
		} else {
			this.method3681(arg0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(III)V")
	public Class140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray57 = new byte[arg1];
		this.anIntArray566 = new int[arg1];
		this.aByteArray60 = new byte[arg1];
		this.anIntArray567 = new int[arg0];
		this.aShortArray76 = new short[arg1];
		this.aByteArray65 = new byte[arg1];
		this.aShortArray79 = new short[arg1];
		this.anIntArray565 = new int[arg0];
		this.aShortArray83 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray59 = new byte[arg2];
			this.aShortArray82 = new short[arg2];
			this.aShortArray81 = new short[arg2];
			this.aByteArray58 = new byte[arg2];
			this.aShortArray71 = new short[arg2];
			this.aByteArray64 = new byte[arg2];
			this.aByteArray61 = new byte[arg2];
			this.aShortArray72 = new short[arg2];
			this.aShortArray73 = new short[arg2];
			this.aByteArray66 = new byte[arg2];
			this.aShortArray74 = new short[arg2];
			this.aByteArray63 = new byte[arg2];
		}
		this.aShortArray78 = new short[arg1];
		this.aByteArray62 = new byte[arg1];
		this.anIntArray568 = new int[arg0];
		this.aShortArray80 = new short[arg1];
		this.anIntArray569 = new int[arg0];
	}

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "([Lclient!mr;I)V")
	public Class140(@OriginalArg(0) Class140[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4126 = 0;
		this.anInt4133 = 0;
		this.anInt4141 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		this.aByte44 = -1;
		@Pc(44) boolean local44 = false;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(51) Class140 local51 = arg0[local46];
			if (local51 != null) {
				this.anInt4133 += local51.anInt4133;
				this.anInt4141 += local51.anInt4141;
				this.anInt4126 += local51.anInt4126;
				if (local51.aClass6Array3 != null) {
					local29 += local51.aClass6Array3.length;
				}
				local31 |= local51.aByteArray60 != null;
				if (local51.aClass57Array3 != null) {
					local27 += local51.aClass57Array3.length;
				}
				local37 |= local51.aByteArray62 != null;
				local39 |= local51.aShortArray80 != null;
				local35 |= local51.aByteArray57 != null;
				local44 |= local51.anIntArray566 != null;
				if (local51.aByteArray65 == null) {
					if (this.aByte44 == -1) {
						this.aByte44 = local51.aByte44;
					}
					if (this.aByte44 != local51.aByte44) {
						local33 = true;
					}
				} else {
					local33 = true;
				}
			}
		}
		if (local33) {
			this.aByteArray65 = new byte[this.anInt4126];
		}
		this.aShortArray78 = new short[this.anInt4126];
		this.aShortArray83 = new short[this.anInt4126];
		this.anIntArray568 = new int[this.anInt4133];
		if (local39) {
			this.aShortArray80 = new short[this.anInt4126];
		}
		if (local27 > 0) {
			this.aClass57Array3 = new Class57[local27];
		}
		if (local29 > 0) {
			this.aClass6Array3 = new Class6[local29];
		}
		this.aShortArray79 = new short[this.anInt4126];
		if (this.anInt4141 > 0) {
			this.aByteArray66 = new byte[this.anInt4141];
			this.aByteArray58 = new byte[this.anInt4141];
			this.aByteArray64 = new byte[this.anInt4141];
			this.aByteArray63 = new byte[this.anInt4141];
			this.aShortArray74 = new short[this.anInt4141];
			this.aShortArray82 = new short[this.anInt4141];
			this.aByteArray59 = new byte[this.anInt4141];
			this.aShortArray72 = new short[this.anInt4141];
			this.aShortArray71 = new short[this.anInt4141];
			this.aShortArray81 = new short[this.anInt4141];
			this.aByteArray61 = new byte[this.anInt4141];
			this.aShortArray73 = new short[this.anInt4141];
		}
		this.aShortArray77 = new short[this.anInt4133];
		if (local37) {
			this.aByteArray62 = new byte[this.anInt4126];
		}
		if (local31) {
			this.aByteArray60 = new byte[this.anInt4126];
		}
		this.anIntArray567 = new int[this.anInt4133];
		if (local35) {
			this.aByteArray57 = new byte[this.anInt4126];
		}
		this.anIntArray569 = new int[this.anInt4133];
		this.aShortArray75 = new short[this.anInt4126];
		if (local44) {
			this.anIntArray566 = new int[this.anInt4126];
		}
		this.anIntArray565 = new int[this.anInt4133];
		this.aShortArray76 = new short[this.anInt4126];
		this.anInt4133 = 0;
		local27 = 0;
		local29 = 0;
		this.anInt4126 = 0;
		this.anInt4141 = 0;
		@Pc(547) int local547;
		@Pc(558) int local558;
		for (@Pc(352) int local352 = 0; local352 < arg1; local352++) {
			@Pc(358) short local358 = (short) (0x1 << local352);
			@Pc(362) Class140 local362 = arg0[local352];
			if (local362 != null) {
				for (@Pc(366) int local366 = 0; local366 < local362.anInt4126; local366++) {
					if (local31 && local362.aByteArray60 != null) {
						this.aByteArray60[this.anInt4126] = local362.aByteArray60[local366];
					}
					if (local33) {
						if (local362.aByteArray65 == null) {
							this.aByteArray65[this.anInt4126] = local362.aByte44;
						} else {
							this.aByteArray65[this.anInt4126] = local362.aByteArray65[local366];
						}
					}
					if (local35 && local362.aByteArray57 != null) {
						this.aByteArray57[this.anInt4126] = local362.aByteArray57[local366];
					}
					if (local39) {
						if (local362.aShortArray80 == null) {
							this.aShortArray80[this.anInt4126] = -1;
						} else {
							this.aShortArray80[this.anInt4126] = local362.aShortArray80[local366];
						}
					}
					if (local44) {
						if (local362.anIntArray566 == null) {
							this.anIntArray566[this.anInt4126] = -1;
						} else {
							this.anIntArray566[this.anInt4126] = local362.anIntArray566[local366];
						}
					}
					this.aShortArray76[this.anInt4126] = (short) this.method3683(local362.aShortArray76[local366], local362, local358);
					this.aShortArray83[this.anInt4126] = (short) this.method3683(local362.aShortArray83[local366], local362, local358);
					this.aShortArray79[this.anInt4126] = (short) this.method3683(local362.aShortArray79[local366], local362, local358);
					this.aShortArray75[this.anInt4126] = local358;
					this.aShortArray78[this.anInt4126] = local362.aShortArray78[local366];
					this.anInt4126++;
				}
				@Pc(535) int local535;
				if (local362.aClass57Array3 != null) {
					for (local535 = 0; local535 < local362.aClass57Array3.length; local535++) {
						local547 = this.method3683(local362.aClass57Array3[local535].anInt1636, local362, local358);
						local558 = this.method3683(local362.aClass57Array3[local535].anInt1632, local362, local358);
						@Pc(569) int local569 = this.method3683(local362.aClass57Array3[local535].anInt1635, local362, local358);
						this.aClass57Array3[local27] = new Class57(local362.aClass57Array3[local535].anInt1634, local547, local558, local569, local362.aClass57Array3[local535].aByte31);
						local27++;
					}
				}
				if (local362.aClass6Array3 != null) {
					for (local535 = 0; local535 < local362.aClass6Array3.length; local535++) {
						local547 = this.method3683(local362.aClass6Array3[local535].anInt78, local362, local358);
						this.aClass6Array3[local29] = new Class6(local362.aClass6Array3[local535].anInt81, local547);
						local29++;
					}
				}
			}
		}
		@Pc(643) int local643 = 0;
		this.anInt4125 = this.anInt4133;
		for (@Pc(649) int local649 = 0; local649 < arg1; local649++) {
			@Pc(655) short local655 = (short) (0x1 << local649);
			@Pc(659) Class140 local659 = arg0[local649];
			if (local659 != null) {
				for (local547 = 0; local547 < local659.anInt4126; local547++) {
					if (local37) {
						this.aByteArray62[local643++] = (byte) (local659.aByteArray62 == null || local659.aByteArray62[local547] == -1 ? -1 : local659.aByteArray62[local547] + this.anInt4141);
					}
				}
				for (local558 = 0; local558 < local659.anInt4141; local558++) {
					@Pc(710) byte local710 = this.aByteArray59[this.anInt4141] = local659.aByteArray59[local558];
					if (local710 == 0) {
						this.aShortArray81[this.anInt4141] = (short) this.method3683(local659.aShortArray81[local558], local659, local655);
						this.aShortArray82[this.anInt4141] = (short) this.method3683(local659.aShortArray82[local558], local659, local655);
						this.aShortArray71[this.anInt4141] = (short) this.method3683(local659.aShortArray71[local558], local659, local655);
					}
					if (local710 >= 1 && local710 <= 3) {
						this.aShortArray81[this.anInt4141] = local659.aShortArray81[local558];
						this.aShortArray82[this.anInt4141] = local659.aShortArray82[local558];
						this.aShortArray71[this.anInt4141] = local659.aShortArray71[local558];
						this.aShortArray72[this.anInt4141] = local659.aShortArray72[local558];
						this.aShortArray73[this.anInt4141] = local659.aShortArray73[local558];
						this.aShortArray74[this.anInt4141] = local659.aShortArray74[local558];
						this.aByteArray63[this.anInt4141] = local659.aByteArray63[local558];
						this.aByteArray58[this.anInt4141] = local659.aByteArray58[local558];
						this.aByteArray61[this.anInt4141] = local659.aByteArray61[local558];
					}
					if (local710 == 2) {
						this.aByteArray66[this.anInt4141] = local659.aByteArray66[local558];
						this.aByteArray64[this.anInt4141] = local659.aByteArray64[local558];
					}
					this.anInt4141++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)[[I")
	public int[][] method3669() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4125; local12++) {
			@Pc(19) int local19 = this.anIntArray568[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(33) int local33 = local8[local19]++;
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt4125; local79++) {
			@Pc(86) int local86 = this.anIntArray568[local79];
			if (local86 >= 0) {
				local50[local86][local8[local86]++] = local79;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBII)I")
	public int method3671(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt4133; local5++) {
			if (this.anIntArray567[local5] == arg2 && this.anIntArray569[local5] == arg0 && this.anIntArray565[local5] == arg1) {
				return local5;
			}
		}
		this.anIntArray567[this.anInt4133] = arg2;
		this.anIntArray569[this.anInt4133] = arg0;
		this.anIntArray565[this.anInt4133] = arg1;
		this.anInt4125 = this.anInt4133 + 1;
		return this.anInt4133++;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(SSI)V")
	public void method3672(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4126; local1++) {
			if (this.aShortArray78[local1] == arg0) {
				this.aShortArray78[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I[B)V")
	private void method3674(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class7_Sub3 local8 = new Class7_Sub3(arg0);
		@Pc(13) Class7_Sub3 local13 = new Class7_Sub3(arg0);
		@Pc(18) Class7_Sub3 local18 = new Class7_Sub3(arg0);
		@Pc(23) Class7_Sub3 local23 = new Class7_Sub3(arg0);
		@Pc(28) Class7_Sub3 local28 = new Class7_Sub3(arg0);
		@Pc(33) Class7_Sub3 local33 = new Class7_Sub3(arg0);
		@Pc(38) Class7_Sub3 local38 = new Class7_Sub3(arg0);
		local8.anInt3005 = arg0.length - 23;
		this.anInt4133 = local8.method2764();
		this.anInt4126 = local8.method2764();
		this.anInt4141 = local8.method2772();
		@Pc(67) int local67 = local8.method2772();
		@Pc(76) boolean local76 = (local67 & 0x1) == 1;
		@Pc(87) boolean local87 = (local67 & 0x2) == 2;
		@Pc(91) int local91 = local8.method2772();
		@Pc(95) int local95 = local8.method2772();
		@Pc(99) int local99 = local8.method2772();
		@Pc(103) int local103 = local8.method2772();
		@Pc(107) int local107 = local8.method2772();
		@Pc(111) int local111 = local8.method2764();
		@Pc(115) int local115 = local8.method2764();
		@Pc(119) int local119 = local8.method2764();
		@Pc(123) int local123 = local8.method2764();
		@Pc(127) int local127 = local8.method2764();
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(133) int local133 = 0;
		@Pc(146) int local146;
		if (this.anInt4141 > 0) {
			local8.anInt3005 = 0;
			this.aByteArray59 = new byte[this.anInt4141];
			for (local146 = 0; local146 < this.anInt4141; local146++) {
				@Pc(156) byte local156 = this.aByteArray59[local146] = local8.method2779();
				if (local156 >= 1 && local156 <= 3) {
					local131++;
				}
				if (local156 == 0) {
					local129++;
				}
				if (local156 == 2) {
					local133++;
				}
			}
		}
		local146 = this.anInt4141;
		@Pc(185) int local185 = local146;
		local146 += this.anInt4133;
		@Pc(192) int local192 = local146;
		if (local76) {
			local146 += this.anInt4126;
		}
		@Pc(201) int local201 = local146;
		local146 += this.anInt4126;
		@Pc(208) int local208 = local146;
		if (local91 == 255) {
			local146 += this.anInt4126;
		}
		@Pc(220) int local220 = local146;
		if (local99 == 1) {
			local146 += this.anInt4126;
		}
		@Pc(232) int local232 = local146;
		if (local107 == 1) {
			local146 += this.anInt4133;
		}
		@Pc(244) int local244 = local146;
		if (local95 == 1) {
			local146 += this.anInt4126;
		}
		@Pc(258) int local258 = local146;
		local146 += local123;
		@Pc(264) int local264 = local146;
		if (local103 == 1) {
			local146 += this.anInt4126 * 2;
		}
		@Pc(278) int local278 = local146;
		local146 += local127;
		@Pc(284) int local284 = local146;
		local146 += this.anInt4126 * 2;
		@Pc(293) int local293 = local146;
		local146 += local111;
		@Pc(299) int local299 = local146;
		local146 += local115;
		@Pc(305) int local305 = local146;
		local146 += local119;
		@Pc(311) int local311 = local146;
		local146 += local129 * 6;
		@Pc(319) int local319 = local146;
		local146 += local131 * 6;
		@Pc(327) int local327 = local146;
		local146 += local131 * 6;
		@Pc(335) int local335 = local146;
		local146 += local131;
		@Pc(341) int local341 = local146;
		local146 += local131;
		@Pc(347) int local347 = local146;
		local146 += local131 + local133 * 2;
		this.aShortArray78 = new short[this.anInt4126];
		if (local107 == 1) {
			this.anIntArray568 = new int[this.anInt4133];
		}
		this.anIntArray565 = new int[this.anInt4133];
		this.anIntArray569 = new int[this.anInt4133];
		if (local103 == 1 && this.anInt4141 > 0) {
			this.aByteArray62 = new byte[this.anInt4126];
		}
		if (local91 == 255) {
			this.aByteArray65 = new byte[this.anInt4126];
		} else {
			this.aByte44 = (byte) local91;
		}
		if (local99 == 1) {
			this.anIntArray566 = new int[this.anInt4126];
		}
		this.anIntArray567 = new int[this.anInt4133];
		if (local76) {
			this.aByteArray60 = new byte[this.anInt4126];
		}
		this.aShortArray83 = new short[this.anInt4126];
		if (local103 == 1) {
			this.aShortArray80 = new short[this.anInt4126];
		}
		this.aShortArray76 = new short[this.anInt4126];
		local8.anInt3005 = local185;
		if (local95 == 1) {
			this.aByteArray57 = new byte[this.anInt4126];
		}
		if (this.anInt4141 > 0) {
			if (local131 > 0) {
				this.aByteArray61 = new byte[local131];
				this.aByteArray63 = new byte[local131];
				this.aShortArray73 = new short[local131];
				this.aShortArray72 = new short[local131];
				this.aByteArray58 = new byte[local131];
				this.aShortArray74 = new short[local131];
			}
			this.aShortArray81 = new short[this.anInt4141];
			this.aShortArray71 = new short[this.anInt4141];
			this.aShortArray82 = new short[this.anInt4141];
			if (local133 > 0) {
				this.aByteArray66 = new byte[local133];
				this.aByteArray64 = new byte[local133];
			}
		}
		this.aShortArray79 = new short[this.anInt4126];
		local13.anInt3005 = local293;
		local18.anInt3005 = local299;
		local23.anInt3005 = local305;
		local28.anInt3005 = local232;
		@Pc(543) int local543 = 0;
		@Pc(545) int local545 = 0;
		@Pc(547) int local547 = 0;
		@Pc(554) int local554;
		for (@Pc(549) int local549 = 0; local549 < this.anInt4133; local549++) {
			local554 = local8.method2772();
			@Pc(556) int local556 = 0;
			if ((local554 & 0x1) != 0) {
				local556 = local13.method2752();
			}
			@Pc(566) int local566 = 0;
			if ((local554 & 0x2) != 0) {
				local566 = local18.method2752();
			}
			@Pc(579) int local579 = 0;
			if ((local554 & 0x4) != 0) {
				local579 = local23.method2752();
			}
			this.anIntArray567[local549] = local556 + local543;
			this.anIntArray569[local549] = local566 + local545;
			this.anIntArray565[local549] = local579 + local547;
			local543 = this.anIntArray567[local549];
			local547 = this.anIntArray565[local549];
			local545 = this.anIntArray569[local549];
			if (local107 == 1) {
				this.anIntArray568[local549] = local28.method2772();
			}
		}
		local8.anInt3005 = local284;
		local13.anInt3005 = local192;
		local18.anInt3005 = local208;
		local23.anInt3005 = local244;
		local28.anInt3005 = local220;
		local33.anInt3005 = local264;
		local38.anInt3005 = local278;
		for (local554 = 0; local554 < this.anInt4126; local554++) {
			this.aShortArray78[local554] = (short) local8.method2764();
			if (local76) {
				this.aByteArray60[local554] = local13.method2779();
			}
			if (local91 == 255) {
				this.aByteArray65[local554] = local18.method2779();
			}
			if (local95 == 1) {
				this.aByteArray57[local554] = local23.method2779();
			}
			if (local99 == 1) {
				this.anIntArray566[local554] = local28.method2772();
			}
			if (local103 == 1) {
				this.aShortArray80[local554] = (short) (local33.method2764() - 1);
			}
			if (this.aByteArray62 != null) {
				if (this.aShortArray80[local554] == -1) {
					this.aByteArray62[local554] = -1;
				} else {
					this.aByteArray62[local554] = (byte) (local38.method2772() - 1);
				}
			}
		}
		this.anInt4125 = -1;
		local8.anInt3005 = local258;
		local13.anInt3005 = local201;
		@Pc(780) short local780 = 0;
		@Pc(782) short local782 = 0;
		@Pc(784) short local784 = 0;
		@Pc(786) short local786 = 0;
		@Pc(793) int local793;
		for (@Pc(788) int local788 = 0; local788 < this.anInt4126; local788++) {
			local793 = local13.method2772();
			if (local793 == 1) {
				local780 = (short) (local8.method2752() + local786);
				local782 = (short) (local8.method2752() + local780);
				local784 = (short) (local8.method2752() + local782);
				this.aShortArray76[local788] = local780;
				local786 = local784;
				this.aShortArray83[local788] = local782;
				this.aShortArray79[local788] = local784;
				if (this.anInt4125 < local780) {
					this.anInt4125 = local780;
				}
				if (this.anInt4125 < local782) {
					this.anInt4125 = local782;
				}
				if (this.anInt4125 < local784) {
					this.anInt4125 = local784;
				}
			}
			if (local793 == 2) {
				local782 = local784;
				local784 = (short) (local8.method2752() + local786);
				local786 = local784;
				this.aShortArray76[local788] = local780;
				this.aShortArray83[local788] = local782;
				this.aShortArray79[local788] = local784;
				if (this.anInt4125 < local784) {
					this.anInt4125 = local784;
				}
			}
			if (local793 == 3) {
				local780 = local784;
				local784 = (short) (local8.method2752() + local786);
				local786 = local784;
				this.aShortArray76[local788] = local780;
				this.aShortArray83[local788] = local782;
				this.aShortArray79[local788] = local784;
				if (this.anInt4125 < local784) {
					this.anInt4125 = local784;
				}
			}
			if (local793 == 4) {
				@Pc(942) short local942 = local780;
				local780 = local782;
				local782 = local942;
				local784 = (short) (local8.method2752() + local786);
				this.aShortArray76[local788] = local780;
				local786 = local784;
				this.aShortArray83[local788] = local942;
				this.aShortArray79[local788] = local784;
				if (local784 > this.anInt4125) {
					this.anInt4125 = local784;
				}
			}
		}
		this.anInt4125++;
		local8.anInt3005 = local311;
		local13.anInt3005 = local319;
		local18.anInt3005 = local327;
		local23.anInt3005 = local335;
		local28.anInt3005 = local341;
		local33.anInt3005 = local347;
		@Pc(1024) int local1024;
		for (local793 = 0; local793 < this.anInt4141; local793++) {
			local1024 = this.aByteArray59[local793] & 0xFF;
			if (local1024 == 0) {
				this.aShortArray81[local793] = (short) local8.method2764();
				this.aShortArray82[local793] = (short) local8.method2764();
				this.aShortArray71[local793] = (short) local8.method2764();
			}
			if (local1024 == 1) {
				this.aShortArray81[local793] = (short) local13.method2764();
				this.aShortArray82[local793] = (short) local13.method2764();
				this.aShortArray71[local793] = (short) local13.method2764();
				this.aShortArray72[local793] = (short) local18.method2764();
				this.aShortArray73[local793] = (short) local18.method2764();
				this.aShortArray74[local793] = (short) local18.method2764();
				this.aByteArray63[local793] = local23.method2779();
				this.aByteArray58[local793] = local28.method2779();
				this.aByteArray61[local793] = local33.method2779();
			}
			if (local1024 == 2) {
				this.aShortArray81[local793] = (short) local13.method2764();
				this.aShortArray82[local793] = (short) local13.method2764();
				this.aShortArray71[local793] = (short) local13.method2764();
				this.aShortArray72[local793] = (short) local18.method2764();
				this.aShortArray73[local793] = (short) local18.method2764();
				this.aShortArray74[local793] = (short) local18.method2764();
				this.aByteArray63[local793] = local23.method2779();
				this.aByteArray58[local793] = local28.method2779();
				this.aByteArray61[local793] = local33.method2779();
				this.aByteArray66[local793] = local33.method2779();
				this.aByteArray64[local793] = local33.method2779();
			}
			if (local1024 == 3) {
				this.aShortArray81[local793] = (short) local13.method2764();
				this.aShortArray82[local793] = (short) local13.method2764();
				this.aShortArray71[local793] = (short) local13.method2764();
				this.aShortArray72[local793] = (short) local18.method2764();
				this.aShortArray73[local793] = (short) local18.method2764();
				this.aShortArray74[local793] = (short) local18.method2764();
				this.aByteArray63[local793] = local23.method2779();
				this.aByteArray58[local793] = local28.method2779();
				this.aByteArray61[local793] = local33.method2779();
			}
		}
		if (!local87) {
			return;
		}
		local8.anInt3005 = local146;
		local1024 = local8.method2772();
		@Pc(1328) int local1328;
		@Pc(1335) int local1335;
		if (local1024 > 0) {
			this.aClass57Array3 = new Class57[local1024];
			for (local1328 = 0; local1328 < local1024; local1328++) {
				local1335 = local8.method2764();
				@Pc(1339) int local1339 = local8.method2764();
				@Pc(1349) byte local1349;
				if (local91 == 255) {
					local1349 = this.aByteArray65[local1339];
				} else {
					local1349 = (byte) local91;
				}
				this.aClass57Array3[local1328] = new Class57(local1335, this.aShortArray76[local1339], this.aShortArray83[local1339], this.aShortArray79[local1339], local1349);
			}
		}
		local1328 = local8.method2772();
		if (local1328 <= 0) {
			return;
		}
		this.aClass6Array3 = new Class6[local1328];
		for (local1335 = 0; local1335 < local1328; local1335++) {
			this.aClass6Array3[local1335] = new Class6(local8.method2764(), local8.method2764());
		}
		return;
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)[[I")
	public int[][] method3676() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4126; local12++) {
			@Pc(19) int local19 = this.anIntArray566[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < this.anInt4126; local79++) {
			@Pc(86) int local86 = this.anIntArray566[local79];
			if (local86 >= 0) {
				local50[local86][local8[local86]++] = local79;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(SSBBSBSSSB)B")
	public byte method3679() {
		if (this.anInt4141 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray59[this.anInt4141] = 3;
		this.aShortArray81[this.anInt4141] = 0;
		this.aShortArray82[this.anInt4141] = 32767;
		this.aShortArray71[this.anInt4141] = 0;
		this.aShortArray72[this.anInt4141] = 1024;
		this.aShortArray73[this.anInt4141] = 1024;
		this.aShortArray74[this.anInt4141] = 1024;
		this.aByteArray63[this.anInt4141] = 0;
		this.aByteArray58[this.anInt4141] = 0;
		this.aByteArray61[this.anInt4141] = 0;
		return (byte) this.anInt4141++;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(SBIBIBBSI)I")
	public int method3680(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) short arg6, @OriginalArg(8) int arg7) {
		this.aShortArray76[this.anInt4126] = (short) arg2;
		this.aShortArray83[this.anInt4126] = (short) arg4;
		this.aShortArray79[this.anInt4126] = (short) arg7;
		this.aByteArray60[this.anInt4126] = arg1;
		this.aByteArray62[this.anInt4126] = arg5;
		this.aShortArray78[this.anInt4126] = arg0;
		this.aByteArray57[this.anInt4126] = arg3;
		this.aShortArray80[this.anInt4126] = arg6;
		return this.anInt4126++;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([BZ)V")
	private void method3681(@OriginalArg(0) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class7_Sub3 local12 = new Class7_Sub3(arg0);
		@Pc(17) Class7_Sub3 local17 = new Class7_Sub3(arg0);
		@Pc(22) Class7_Sub3 local22 = new Class7_Sub3(arg0);
		@Pc(27) Class7_Sub3 local27 = new Class7_Sub3(arg0);
		@Pc(32) Class7_Sub3 local32 = new Class7_Sub3(arg0);
		local12.anInt3005 = arg0.length - 18;
		this.anInt4133 = local12.method2764();
		this.anInt4126 = local12.method2764();
		this.anInt4141 = local12.method2772();
		@Pc(57) int local57 = local12.method2772();
		@Pc(61) int local61 = local12.method2772();
		@Pc(65) int local65 = local12.method2772();
		@Pc(69) int local69 = local12.method2772();
		@Pc(73) int local73 = local12.method2772();
		@Pc(77) int local77 = local12.method2764();
		@Pc(81) int local81 = local12.method2764();
		@Pc(85) int local85 = local12.method2764();
		@Pc(89) int local89 = local12.method2764();
		@Pc(98) int local98 = this.anInt4133;
		@Pc(100) int local100 = local98;
		local98 += this.anInt4126;
		@Pc(107) int local107 = local98;
		if (local61 == 255) {
			local98 += this.anInt4126;
		}
		@Pc(119) int local119 = local98;
		if (local69 == 1) {
			local98 += this.anInt4126;
		}
		@Pc(131) int local131 = local98;
		if (local57 == 1) {
			local98 += this.anInt4126;
		}
		@Pc(141) int local141 = local98;
		if (local73 == 1) {
			local98 += this.anInt4133;
		}
		@Pc(153) int local153 = local98;
		if (local65 == 1) {
			local98 += this.anInt4126;
		}
		@Pc(165) int local165 = local98;
		local98 += local89;
		@Pc(177) int local177 = local98;
		local98 += this.anInt4126 * 2;
		@Pc(186) int local186 = local98;
		local98 += this.anInt4141 * 6;
		@Pc(195) int local195 = local98;
		local98 += local77;
		@Pc(201) int local201 = local98;
		local98 += local81;
		if (local57 == 1) {
			this.aShortArray80 = new short[this.anInt4126];
			this.aByteArray62 = new byte[this.anInt4126];
			this.aByteArray60 = new byte[this.anInt4126];
		}
		if (local69 == 1) {
			this.anIntArray566 = new int[this.anInt4126];
		}
		if (local65 == 1) {
			this.aByteArray57 = new byte[this.anInt4126];
		}
		if (local61 == 255) {
			this.aByteArray65 = new byte[this.anInt4126];
		} else {
			this.aByte44 = (byte) local61;
		}
		local12.anInt3005 = 0;
		if (local73 == 1) {
			this.anIntArray568 = new int[this.anInt4133];
		}
		this.aShortArray78 = new short[this.anInt4126];
		this.anIntArray569 = new int[this.anInt4133];
		this.anIntArray567 = new int[this.anInt4133];
		if (this.anInt4141 > 0) {
			this.aShortArray71 = new short[this.anInt4141];
			this.aShortArray81 = new short[this.anInt4141];
			this.aByteArray59 = new byte[this.anInt4141];
			this.aShortArray82 = new short[this.anInt4141];
		}
		this.aShortArray79 = new short[this.anInt4126];
		this.aShortArray83 = new short[this.anInt4126];
		this.aShortArray76 = new short[this.anInt4126];
		this.anIntArray565 = new int[this.anInt4133];
		local17.anInt3005 = local195;
		local22.anInt3005 = local201;
		local27.anInt3005 = local98;
		local32.anInt3005 = local141;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(356) int local356 = 0;
		@Pc(363) int local363;
		@Pc(365) int local365;
		for (@Pc(358) int local358 = 0; local358 < this.anInt4133; local358++) {
			local363 = local12.method2772();
			local365 = 0;
			if ((local363 & 0x1) != 0) {
				local365 = local17.method2752();
			}
			@Pc(378) int local378 = 0;
			if ((local363 & 0x2) != 0) {
				local378 = local22.method2752();
			}
			@Pc(388) int local388 = 0;
			if ((local363 & 0x4) != 0) {
				local388 = local27.method2752();
			}
			this.anIntArray567[local358] = local365 + local352;
			this.anIntArray569[local358] = local378 + local354;
			this.anIntArray565[local358] = local388 + local356;
			local356 = this.anIntArray565[local358];
			local352 = this.anIntArray567[local358];
			local354 = this.anIntArray569[local358];
			if (local73 == 1) {
				this.anIntArray568[local358] = local32.method2772();
			}
		}
		local12.anInt3005 = local177;
		local17.anInt3005 = local131;
		local22.anInt3005 = local107;
		local27.anInt3005 = local153;
		local32.anInt3005 = local119;
		for (local363 = 0; local363 < this.anInt4126; local363++) {
			this.aShortArray78[local363] = (short) local12.method2764();
			if (local57 == 1) {
				local365 = local17.method2772();
				if ((local365 & 0x1) == 1) {
					this.aByteArray60[local363] = 1;
					local5 = true;
				} else {
					this.aByteArray60[local363] = 0;
				}
				if ((local365 & 0x2) == 2) {
					this.aByteArray62[local363] = (byte) (local365 >> 2);
					this.aShortArray80[local363] = this.aShortArray78[local363];
					this.aShortArray78[local363] = 127;
					if (this.aShortArray80[local363] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray62[local363] = -1;
					this.aShortArray80[local363] = -1;
				}
			}
			if (local61 == 255) {
				this.aByteArray65[local363] = local22.method2779();
			}
			if (local65 == 1) {
				this.aByteArray57[local363] = local27.method2779();
			}
			if (local69 == 1) {
				this.anIntArray566[local363] = local32.method2772();
			}
		}
		local12.anInt3005 = local165;
		this.anInt4125 = -1;
		local17.anInt3005 = local100;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(614) int local614;
		for (@Pc(609) int local609 = 0; local609 < this.anInt4126; local609++) {
			local614 = local17.method2772();
			if (local614 == 1) {
				local601 = (short) (local12.method2752() + local607);
				local603 = (short) (local601 + local12.method2752());
				local605 = (short) (local603 + local12.method2752());
				local607 = local605;
				this.aShortArray76[local609] = local601;
				this.aShortArray83[local609] = local603;
				this.aShortArray79[local609] = local605;
				if (local601 > this.anInt4125) {
					this.anInt4125 = local601;
				}
				if (local603 > this.anInt4125) {
					this.anInt4125 = local603;
				}
				if (this.anInt4125 < local605) {
					this.anInt4125 = local605;
				}
			}
			if (local614 == 2) {
				local603 = local605;
				local605 = (short) (local607 + local12.method2752());
				local607 = local605;
				this.aShortArray76[local609] = local601;
				this.aShortArray83[local609] = local603;
				this.aShortArray79[local609] = local605;
				if (this.anInt4125 < local605) {
					this.anInt4125 = local605;
				}
			}
			if (local614 == 3) {
				local601 = local605;
				local605 = (short) (local12.method2752() + local607);
				this.aShortArray76[local609] = local601;
				local607 = local605;
				this.aShortArray83[local609] = local603;
				this.aShortArray79[local609] = local605;
				if (this.anInt4125 < local605) {
					this.anInt4125 = local605;
				}
			}
			if (local614 == 4) {
				@Pc(771) short local771 = local601;
				local601 = local603;
				local605 = (short) (local12.method2752() + local607);
				local603 = local771;
				this.aShortArray76[local609] = local601;
				local607 = local605;
				this.aShortArray83[local609] = local771;
				this.aShortArray79[local609] = local605;
				if (this.anInt4125 < local605) {
					this.anInt4125 = local605;
				}
			}
		}
		local12.anInt3005 = local186;
		this.anInt4125++;
		for (local614 = 0; local614 < this.anInt4141; local614++) {
			this.aByteArray59[local614] = 0;
			this.aShortArray81[local614] = (short) local12.method2764();
			this.aShortArray82[local614] = (short) local12.method2764();
			this.aShortArray71[local614] = (short) local12.method2764();
		}
		if (this.aByteArray62 != null) {
			@Pc(862) boolean local862 = false;
			for (@Pc(864) int local864 = 0; local864 < this.anInt4126; local864++) {
				@Pc(872) int local872 = this.aByteArray62[local864] & 0xFF;
				if (local872 != 255) {
					if (this.aShortArray76[local864] == (this.aShortArray81[local872] & 0xFFFF) && this.aShortArray83[local864] == (this.aShortArray82[local872] & 0xFFFF) && this.aShortArray79[local864] == (this.aShortArray71[local872] & 0xFFFF)) {
						this.aByteArray62[local864] = -1;
					} else {
						local862 = true;
					}
				}
			}
			if (!local862) {
				this.aByteArray62 = null;
			}
		}
		if (!local7) {
			this.aShortArray80 = null;
		}
		if (!local5) {
			this.aByteArray60 = null;
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(IIII)V")
	public void method3682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(18) int local18;
		@Pc(36) int local36;
		if (arg0 != 0) {
			local12 = Class147.anIntArray604[arg0];
			local16 = Class147.anIntArray603[arg0];
			for (local18 = 0; local18 < this.anInt4133; local18++) {
				local36 = this.anIntArray569[local18] * local12 + local16 * this.anIntArray567[local18] >> 15;
				this.anIntArray569[local18] = this.anIntArray569[local18] * local16 - this.anIntArray567[local18] * local12 >> 15;
				this.anIntArray567[local18] = local36;
			}
		}
		if (arg2 != 0) {
			local12 = Class147.anIntArray604[arg2];
			local16 = Class147.anIntArray603[arg2];
			for (local18 = 0; local18 < this.anInt4133; local18++) {
				local36 = local16 * this.anIntArray569[local18] - this.anIntArray565[local18] * local12 >> 15;
				this.anIntArray565[local18] = local12 * this.anIntArray569[local18] + this.anIntArray565[local18] * local16 >> 15;
				this.anIntArray569[local18] = local36;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local12 = Class147.anIntArray604[arg1];
		local16 = Class147.anIntArray603[arg1];
		for (local18 = 0; local18 < this.anInt4133; local18++) {
			local36 = this.anIntArray567[local18] * local16 + this.anIntArray565[local18] * local12 >> 15;
			this.anIntArray565[local18] = local16 * this.anIntArray565[local18] - local12 * this.anIntArray567[local18] >> 15;
			this.anIntArray567[local18] = local36;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IBLclient!mr;S)I")
	private int method3683(@OriginalArg(0) int arg0, @OriginalArg(2) Class140 arg1, @OriginalArg(3) short arg2) {
		@Pc(8) int local8 = arg1.anIntArray567[arg0];
		@Pc(13) int local13 = arg1.anIntArray569[arg0];
		@Pc(18) int local18 = arg1.anIntArray565[arg0];
		for (@Pc(20) int local20 = 0; local20 < this.anInt4133; local20++) {
			if (local8 == this.anIntArray567[local20] && local13 == this.anIntArray569[local20] && local18 == this.anIntArray565[local20]) {
				this.aShortArray77[local20] |= arg2;
				return local20;
			}
		}
		this.anIntArray567[this.anInt4133] = local8;
		this.anIntArray569[this.anInt4133] = local13;
		this.anIntArray565[this.anInt4133] = local18;
		this.aShortArray77[this.anInt4133] = arg2;
		this.anIntArray568[this.anInt4133] = arg1.anIntArray568 == null ? -1 : arg1.anIntArray568[arg0];
		return this.anInt4133++;
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(IIII)V")
	public void method3684(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt4133; local1++) {
			this.anIntArray567[local1] += arg1;
			this.anIntArray569[local1] += arg2;
			this.anIntArray565[local1] += arg0;
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BSS)V")
	public void method3685(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray80 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt4126; local17++) {
			if (this.aShortArray80[local17] == arg0) {
				this.aShortArray80[local17] = arg1;
			}
		}
	}
}
