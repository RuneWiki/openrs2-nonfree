import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class192 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "[I")
	public int[] anIntArray310;

	@OriginalMember(owner = "client!lv", name = "h", descriptor = "[I")
	public int[] anIntArray311;

	@OriginalMember(owner = "client!lv", name = "j", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!lv", name = "l", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!lv", name = "m", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "[I")
	public int[] anIntArray312;

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "[I")
	public int[] anIntArray313;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "[Lclient!cia;")
	public Class49[] aClass49Array4;

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!lv", name = "t", descriptor = "[I")
	public int[] anIntArray314;

	@OriginalMember(owner = "client!lv", name = "v", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!lv", name = "x", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!lv", name = "y", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!lv", name = "E", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!lv", name = "F", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!lv", name = "I", descriptor = "[S")
	public short[] aShortArray109;

	@OriginalMember(owner = "client!lv", name = "J", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!lv", name = "K", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!lv", name = "L", descriptor = "[Lclient!fk;")
	public Class103[] aClass103Array4;

	@OriginalMember(owner = "client!lv", name = "M", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!lv", name = "P", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!lv", name = "Q", descriptor = "[I")
	public int[] anIntArray317;

	@OriginalMember(owner = "client!lv", name = "T", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!lv", name = "U", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!lv", name = "V", descriptor = "[Lclient!gn;")
	public Class123[] aClass123Array1;

	@OriginalMember(owner = "client!lv", name = "W", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!lv", name = "Y", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!lv", name = "bb", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
	public int anInt6632 = 12;

	@OriginalMember(owner = "client!lv", name = "D", descriptor = "I")
	public int anInt6644 = 0;

	@OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
	public int anInt6635 = 0;

	@OriginalMember(owner = "client!lv", name = "Z", descriptor = "B")
	public byte aByte78 = 0;

	@OriginalMember(owner = "client!lv", name = "A", descriptor = "I")
	public int anInt6641 = 0;

	@OriginalMember(owner = "client!lv", name = "o", descriptor = "I")
	public int anInt6637 = 0;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	private Class192() {
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "([B)V")
	public Class192(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5546(arg0);
		} else {
			this.method5544(arg0);
		}
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(III)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray53 = new byte[arg1];
		this.anIntArray317 = new int[arg0];
		this.aByteArray50 = new byte[arg1];
		this.anIntArray319 = new int[arg0];
		this.anIntArray314 = new int[arg0];
		this.aByteArray52 = new byte[arg1];
		this.anIntArray312 = new int[arg1];
		this.aShortArray110 = new short[arg1];
		this.aShortArray109 = new short[arg1];
		this.aShortArray104 = new short[arg1];
		this.anIntArray318 = new int[arg0];
		this.aByteArray51 = new byte[arg1];
		if (arg2 > 0) {
			this.aByteArray49 = new byte[arg2];
			this.aByteArray54 = new byte[arg2];
			this.anIntArray316 = new int[arg2];
			this.aShortArray102 = new short[arg2];
			this.anIntArray309 = new int[arg2];
			this.anIntArray311 = new int[arg2];
			this.anIntArray313 = new int[arg2];
			this.aByteArray48 = new byte[arg2];
			this.anIntArray315 = new int[arg2];
			this.aShortArray111 = new short[arg2];
			this.anIntArray310 = new int[arg2];
			this.aShortArray106 = new short[arg2];
		}
		this.aShortArray108 = new short[arg1];
		this.aShortArray103 = new short[arg1];
	}

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "([Lclient!lv;I)V")
	public Class192(@OriginalArg(0) Class192[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6644 = 0;
		this.anInt6635 = 0;
		this.anInt6637 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte78 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class192 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt6635 += local59.anInt6635;
				this.anInt6644 += local59.anInt6644;
				this.anInt6637 += local59.anInt6637;
				if (local59.aClass103Array4 != null) {
					local32 += local59.aClass103Array4.length;
				}
				if (local59.aClass123Array1 != null) {
					local36 += local59.aClass123Array1.length;
				}
				local38 |= local59.aByteArray52 != null;
				if (local59.aClass49Array4 != null) {
					local34 += local59.aClass49Array4.length;
				}
				local46 |= local59.aShortArray108 != null;
				local44 |= local59.aByteArray53 != null;
				local42 |= local59.aByteArray51 != null;
				if (local59.aByteArray50 == null) {
					if (this.aByte78 == -1) {
						this.aByte78 = local59.aByte78;
					}
					if (this.aByte78 != local59.aByte78) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local51 |= local59.anIntArray312 != null;
			}
		}
		this.aShortArray109 = new short[this.anInt6635];
		this.aShortArray103 = new short[this.anInt6635];
		this.anIntArray319 = new int[this.anInt6644];
		if (local51) {
			this.anIntArray312 = new int[this.anInt6635];
		}
		this.anIntArray314 = new int[this.anInt6644];
		if (local34 > 0) {
			this.aClass49Array4 = new Class49[local34];
		}
		if (local42) {
			this.aByteArray51 = new byte[this.anInt6635];
		}
		this.anIntArray318 = new int[this.anInt6644];
		this.aShortArray105 = new short[this.anInt6635];
		if (local46) {
			this.aShortArray108 = new short[this.anInt6635];
		}
		if (local40) {
			this.aByteArray50 = new byte[this.anInt6635];
		}
		if (this.anInt6637 > 0) {
			this.aShortArray106 = new short[this.anInt6637];
			this.aByteArray48 = new byte[this.anInt6637];
			this.aByteArray49 = new byte[this.anInt6637];
			this.anIntArray311 = new int[this.anInt6637];
			this.aByteArray54 = new byte[this.anInt6637];
			this.aShortArray102 = new short[this.anInt6637];
			this.anIntArray309 = new int[this.anInt6637];
			this.anIntArray313 = new int[this.anInt6637];
			this.aShortArray111 = new short[this.anInt6637];
			this.anIntArray316 = new int[this.anInt6637];
			this.anIntArray310 = new int[this.anInt6637];
			this.anIntArray315 = new int[this.anInt6637];
		}
		if (local32 > 0) {
			this.aClass103Array4 = new Class103[local32];
		}
		if (local44) {
			this.aByteArray53 = new byte[this.anInt6635];
		}
		this.aShortArray107 = new short[this.anInt6644];
		this.anIntArray317 = new int[this.anInt6644];
		this.aShortArray110 = new short[this.anInt6635];
		if (local38) {
			this.aByteArray52 = new byte[this.anInt6635];
		}
		this.aShortArray104 = new short[this.anInt6635];
		if (local36 > 0) {
			this.aClass123Array1 = new Class123[local36];
		}
		this.anInt6644 = 0;
		this.anInt6637 = 0;
		local32 = 0;
		local36 = 0;
		this.anInt6635 = 0;
		local34 = 0;
		@Pc(621) int local621;
		@Pc(632) int local632;
		for (@Pc(381) int local381 = 0; local381 < arg1; local381++) {
			@Pc(388) short local388 = (short) (0x1 << local381);
			@Pc(392) Class192 local392 = arg0[local381];
			if (local392 != null) {
				@Pc(399) int local399;
				if (local392.aClass123Array1 != null) {
					for (local399 = 0; local399 < local392.aClass123Array1.length; local399++) {
						@Pc(406) Class123 local406 = local392.aClass123Array1[local399];
						this.aClass123Array1[local36++] = local406.method3520(this.anInt6635 + local406.anInt4150);
					}
				}
				for (local399 = 0; local399 < local392.anInt6635; local399++) {
					if (local38 && local392.aByteArray52 != null) {
						this.aByteArray52[this.anInt6635] = local392.aByteArray52[local399];
					}
					if (local40) {
						if (local392.aByteArray50 == null) {
							this.aByteArray50[this.anInt6635] = local392.aByte78;
						} else {
							this.aByteArray50[this.anInt6635] = local392.aByteArray50[local399];
						}
					}
					if (local42 && local392.aByteArray51 != null) {
						this.aByteArray51[this.anInt6635] = local392.aByteArray51[local399];
					}
					if (local46) {
						if (local392.aShortArray108 == null) {
							this.aShortArray108[this.anInt6635] = -1;
						} else {
							this.aShortArray108[this.anInt6635] = local392.aShortArray108[local399];
						}
					}
					if (local51) {
						if (local392.anIntArray312 == null) {
							this.anIntArray312[this.anInt6635] = -1;
						} else {
							this.anIntArray312[this.anInt6635] = local392.anIntArray312[local399];
						}
					}
					this.aShortArray104[this.anInt6635] = (short) this.method5555(local392, local392.aShortArray104[local399], local388);
					this.aShortArray109[this.anInt6635] = (short) this.method5555(local392, local392.aShortArray109[local399], local388);
					this.aShortArray103[this.anInt6635] = (short) this.method5555(local392, local392.aShortArray103[local399], local388);
					this.aShortArray105[this.anInt6635] = local388;
					this.aShortArray110[this.anInt6635] = local392.aShortArray110[local399];
					this.anInt6635++;
				}
				@Pc(608) int local608;
				if (local392.aClass103Array4 != null) {
					for (local608 = 0; local608 < local392.aClass103Array4.length; local608++) {
						local621 = this.method5555(local392, local392.aClass103Array4[local608].anInt3652, local388);
						local632 = this.method5555(local392, local392.aClass103Array4[local608].anInt3647, local388);
						@Pc(643) int local643 = this.method5555(local392, local392.aClass103Array4[local608].anInt3660, local388);
						this.aClass103Array4[local32] = local392.aClass103Array4[local608].method3126(local621, local643, local632);
						local32++;
					}
				}
				if (local392.aClass49Array4 != null) {
					for (local608 = 0; local608 < local392.aClass49Array4.length; local608++) {
						local621 = this.method5555(local392, local392.aClass49Array4[local608].anInt2379, local388);
						this.aClass49Array4[local34] = local392.aClass49Array4[local608].method2067(local621);
						local34++;
					}
				}
			}
		}
		@Pc(709) int local709 = 0;
		this.anInt6641 = this.anInt6644;
		for (@Pc(715) int local715 = 0; local715 < arg1; local715++) {
			@Pc(722) short local722 = (short) (0x1 << local715);
			@Pc(726) Class192 local726 = arg0[local715];
			if (local726 != null) {
				for (local621 = 0; local621 < local726.anInt6635; local621++) {
					if (local44) {
						this.aByteArray53[local709++] = (byte) (local726.aByteArray53 == null || local726.aByteArray53[local621] == -1 ? -1 : local726.aByteArray53[local621] + this.anInt6637);
					}
				}
				for (local632 = 0; local632 < local726.anInt6637; local632++) {
					@Pc(778) byte local778 = this.aByteArray48[this.anInt6637] = local726.aByteArray48[local632];
					if (local778 == 0) {
						this.aShortArray106[this.anInt6637] = (short) this.method5555(local726, local726.aShortArray106[local632], local722);
						this.aShortArray111[this.anInt6637] = (short) this.method5555(local726, local726.aShortArray111[local632], local722);
						this.aShortArray102[this.anInt6637] = (short) this.method5555(local726, local726.aShortArray102[local632], local722);
					}
					if (local778 >= 1 && local778 <= 3) {
						this.aShortArray106[this.anInt6637] = local726.aShortArray106[local632];
						this.aShortArray111[this.anInt6637] = local726.aShortArray111[local632];
						this.aShortArray102[this.anInt6637] = local726.aShortArray102[local632];
						this.anIntArray310[this.anInt6637] = local726.anIntArray310[local632];
						this.anIntArray315[this.anInt6637] = local726.anIntArray315[local632];
						this.anIntArray311[this.anInt6637] = local726.anIntArray311[local632];
						this.aByteArray54[this.anInt6637] = local726.aByteArray54[local632];
						this.aByteArray49[this.anInt6637] = local726.aByteArray49[local632];
						this.anIntArray316[this.anInt6637] = local726.anIntArray316[local632];
					}
					if (local778 == 2) {
						this.anIntArray313[this.anInt6637] = local726.anIntArray313[local632];
						this.anIntArray309[this.anInt6637] = local726.anIntArray309[local632];
					}
					this.anInt6637++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "([BI)V")
	private void method5544(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub8 local14 = new Class6_Sub8(arg0);
		@Pc(19) Class6_Sub8 local19 = new Class6_Sub8(arg0);
		@Pc(24) Class6_Sub8 local24 = new Class6_Sub8(arg0);
		@Pc(29) Class6_Sub8 local29 = new Class6_Sub8(arg0);
		@Pc(34) Class6_Sub8 local34 = new Class6_Sub8(arg0);
		local14.anInt10061 = arg0.length - 18;
		this.anInt6644 = local14.method8220();
		this.anInt6635 = local14.method8220();
		this.anInt6637 = local14.method8246();
		@Pc(59) int local59 = local14.method8246();
		@Pc(63) int local63 = local14.method8246();
		@Pc(67) int local67 = local14.method8246();
		@Pc(71) int local71 = local14.method8246();
		@Pc(75) int local75 = local14.method8246();
		@Pc(79) int local79 = local14.method8220();
		@Pc(83) int local83 = local14.method8220();
		@Pc(87) int local87 = local14.method8220();
		@Pc(91) int local91 = local14.method8220();
		@Pc(100) int local100 = this.anInt6644;
		@Pc(102) int local102 = local100;
		local100 += this.anInt6635;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt6635;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt6635;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt6635;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt6644;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt6635;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt6635 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt6637 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		this.anIntArray317 = new int[this.anInt6644];
		if (local67 == 1) {
			this.aByteArray51 = new byte[this.anInt6635];
		}
		if (this.anInt6637 > 0) {
			this.aShortArray111 = new short[this.anInt6637];
			this.aShortArray102 = new short[this.anInt6637];
			this.aShortArray106 = new short[this.anInt6637];
			this.aByteArray48 = new byte[this.anInt6637];
		}
		if (local59 == 1) {
			this.aByteArray52 = new byte[this.anInt6635];
			this.aByteArray53 = new byte[this.anInt6635];
			this.aShortArray108 = new short[this.anInt6635];
		}
		this.aShortArray110 = new short[this.anInt6635];
		this.anIntArray319 = new int[this.anInt6644];
		this.anIntArray314 = new int[this.anInt6644];
		this.aShortArray109 = new short[this.anInt6635];
		this.aShortArray103 = new short[this.anInt6635];
		local14.anInt10061 = 0;
		this.aShortArray104 = new short[this.anInt6635];
		if (local71 == 1) {
			this.anIntArray312 = new int[this.anInt6635];
		}
		if (local63 == 255) {
			this.aByteArray50 = new byte[this.anInt6635];
		} else {
			this.aByte78 = (byte) local63;
		}
		if (local75 == 1) {
			this.anIntArray318 = new int[this.anInt6644];
		}
		local19.anInt10061 = local187;
		local24.anInt10061 = local193;
		local29.anInt10061 = local100;
		local34.anInt10061 = local141;
		@Pc(338) int local338 = 0;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		@Pc(350) int local350;
		@Pc(352) int local352;
		for (@Pc(344) int local344 = 0; local344 < this.anInt6644; local344++) {
			local350 = local14.method8246();
			local352 = 0;
			if ((local350 & 0x1) != 0) {
				local352 = local19.method8256();
			}
			@Pc(365) int local365 = 0;
			if ((local350 & 0x2) != 0) {
				local365 = local24.method8256();
			}
			@Pc(378) int local378 = 0;
			if ((local350 & 0x4) != 0) {
				local378 = local29.method8256();
			}
			this.anIntArray317[local344] = local352 + local338;
			this.anIntArray314[local344] = local365 + local340;
			this.anIntArray319[local344] = local342 + local378;
			local340 = this.anIntArray314[local344];
			local342 = this.anIntArray319[local344];
			local338 = this.anIntArray317[local344];
			if (local75 == 1) {
				this.anIntArray318[local344] = local34.method8246();
			}
		}
		local14.anInt10061 = local169;
		local19.anInt10061 = local131;
		local24.anInt10061 = local109;
		local29.anInt10061 = local153;
		local34.anInt10061 = local119;
		for (local350 = 0; local350 < this.anInt6635; local350++) {
			this.aShortArray110[local350] = (short) local14.method8220();
			if (local59 == 1) {
				local352 = local19.method8246();
				if ((local352 & 0x1) == 1) {
					local7 = true;
					this.aByteArray52[local350] = 1;
				} else {
					this.aByteArray52[local350] = 0;
				}
				if ((local352 & 0x2) == 2) {
					this.aByteArray53[local350] = (byte) (local352 >> 2);
					this.aShortArray108[local350] = this.aShortArray110[local350];
					this.aShortArray110[local350] = 127;
					if (this.aShortArray108[local350] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray53[local350] = -1;
					this.aShortArray108[local350] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray50[local350] = local24.method8208();
			}
			if (local67 == 1) {
				this.aByteArray51[local350] = local29.method8208();
			}
			if (local71 == 1) {
				this.anIntArray312[local350] = local34.method8246();
			}
		}
		this.anInt6641 = -1;
		local14.anInt10061 = local163;
		local19.anInt10061 = local102;
		@Pc(597) short local597 = 0;
		@Pc(599) short local599 = 0;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(611) int local611;
		for (@Pc(605) int local605 = 0; local605 < this.anInt6635; local605++) {
			local611 = local19.method8246();
			if (local611 == 1) {
				local597 = (short) (local14.method8256() + local603);
				local599 = (short) (local14.method8256() + local597);
				local601 = (short) (local14.method8256() + local599);
				this.aShortArray104[local605] = local597;
				local603 = local601;
				this.aShortArray109[local605] = local599;
				this.aShortArray103[local605] = local601;
				if (this.anInt6641 < local597) {
					this.anInt6641 = local597;
				}
				if (local599 > this.anInt6641) {
					this.anInt6641 = local599;
				}
				if (this.anInt6641 < local601) {
					this.anInt6641 = local601;
				}
			}
			if (local611 == 2) {
				local599 = local601;
				local601 = (short) (local603 + local14.method8256());
				this.aShortArray104[local605] = local597;
				local603 = local601;
				this.aShortArray109[local605] = local599;
				this.aShortArray103[local605] = local601;
				if (local601 > this.anInt6641) {
					this.anInt6641 = local601;
				}
			}
			if (local611 == 3) {
				local597 = local601;
				local601 = (short) (local14.method8256() + local603);
				this.aShortArray104[local605] = local597;
				local603 = local601;
				this.aShortArray109[local605] = local599;
				this.aShortArray103[local605] = local601;
				if (local601 > this.anInt6641) {
					this.anInt6641 = local601;
				}
			}
			if (local611 == 4) {
				@Pc(768) short local768 = local597;
				local597 = local599;
				local599 = local768;
				local601 = (short) (local14.method8256() + local603);
				this.aShortArray104[local605] = local597;
				local603 = local601;
				this.aShortArray109[local605] = local768;
				this.aShortArray103[local605] = local601;
				if (this.anInt6641 < local601) {
					this.anInt6641 = local601;
				}
			}
		}
		local14.anInt10061 = local178;
		this.anInt6641++;
		for (local611 = 0; local611 < this.anInt6637; local611++) {
			this.aByteArray48[local611] = 0;
			this.aShortArray106[local611] = (short) local14.method8220();
			this.aShortArray111[local611] = (short) local14.method8220();
			this.aShortArray102[local611] = (short) local14.method8220();
		}
		if (this.aByteArray53 != null) {
			@Pc(860) boolean local860 = false;
			for (@Pc(862) int local862 = 0; local862 < this.anInt6635; local862++) {
				@Pc(871) int local871 = this.aByteArray53[local862] & 0xFF;
				if (local871 != 255) {
					if ((this.aShortArray106[local871] & 0xFFFF) == this.aShortArray104[local862] && (this.aShortArray111[local871] & 0xFFFF) == this.aShortArray109[local862] && this.aShortArray103[local862] == (this.aShortArray102[local871] & 0xFFFF)) {
						this.aByteArray53[local862] = -1;
					} else {
						local860 = true;
					}
				}
			}
			if (!local860) {
				this.aByteArray53 = null;
			}
		}
		if (!local7) {
			this.aByteArray52 = null;
		}
		if (!local9) {
			this.aShortArray108 = null;
		}
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "([BI)V")
	private void method5546(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub8 local10 = new Class6_Sub8(arg0);
		@Pc(15) Class6_Sub8 local15 = new Class6_Sub8(arg0);
		@Pc(20) Class6_Sub8 local20 = new Class6_Sub8(arg0);
		@Pc(25) Class6_Sub8 local25 = new Class6_Sub8(arg0);
		@Pc(30) Class6_Sub8 local30 = new Class6_Sub8(arg0);
		@Pc(35) Class6_Sub8 local35 = new Class6_Sub8(arg0);
		@Pc(40) Class6_Sub8 local40 = new Class6_Sub8(arg0);
		local10.anInt10061 = arg0.length - 23;
		this.anInt6644 = local10.method8220();
		this.anInt6635 = local10.method8220();
		this.anInt6637 = local10.method8246();
		@Pc(65) int local65 = local10.method8246();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(105) boolean local105 = (local65 & 0x8) == 8;
		if (local105) {
			local10.anInt10061 -= 7;
			this.anInt6632 = local10.method8246();
			local10.anInt10061 += 6;
		}
		@Pc(128) int local128 = local10.method8246();
		@Pc(132) int local132 = local10.method8246();
		@Pc(136) int local136 = local10.method8246();
		@Pc(140) int local140 = local10.method8246();
		@Pc(144) int local144 = local10.method8246();
		@Pc(148) int local148 = local10.method8220();
		@Pc(152) int local152 = local10.method8220();
		@Pc(156) int local156 = local10.method8220();
		@Pc(160) int local160 = local10.method8220();
		@Pc(164) int local164 = local10.method8220();
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(183) int local183;
		if (this.anInt6637 > 0) {
			local10.anInt10061 = 0;
			this.aByteArray48 = new byte[this.anInt6637];
			for (local183 = 0; local183 < this.anInt6637; local183++) {
				@Pc(194) byte local194 = this.aByteArray48[local183] = local10.method8208();
				if (local194 == 2) {
					local170++;
				}
				if (local194 == 0) {
					local166++;
				}
				if (local194 >= 1 && local194 <= 3) {
					local168++;
				}
			}
		}
		local183 = this.anInt6637;
		@Pc(225) int local225 = local183;
		local183 += this.anInt6644;
		@Pc(232) int local232 = local183;
		if (local74) {
			local183 += this.anInt6635;
		}
		@Pc(241) int local241 = local183;
		local183 += this.anInt6635;
		@Pc(248) int local248 = local183;
		if (local128 == 255) {
			local183 += this.anInt6635;
		}
		@Pc(258) int local258 = local183;
		if (local136 == 1) {
			local183 += this.anInt6635;
		}
		@Pc(268) int local268 = local183;
		if (local144 == 1) {
			local183 += this.anInt6644;
		}
		@Pc(278) int local278 = local183;
		if (local132 == 1) {
			local183 += this.anInt6635;
		}
		@Pc(288) int local288 = local183;
		local183 += local160;
		@Pc(294) int local294 = local183;
		if (local140 == 1) {
			local183 += this.anInt6635 * 2;
		}
		@Pc(306) int local306 = local183;
		local183 += local164;
		@Pc(312) int local312 = local183;
		local183 += this.anInt6635 * 2;
		@Pc(321) int local321 = local183;
		local183 += local148;
		@Pc(327) int local327 = local183;
		local183 += local152;
		@Pc(333) int local333 = local183;
		local183 += local156;
		@Pc(339) int local339 = local183;
		local183 += local166 * 6;
		@Pc(347) int local347 = local183;
		local183 += local168 * 6;
		@Pc(355) byte local355 = 6;
		if (this.anInt6632 == 14) {
			local355 = 7;
		} else if (this.anInt6632 >= 15) {
			local355 = 9;
		}
		@Pc(375) int local375 = local183;
		local183 += local168 * local355;
		@Pc(383) int local383 = local183;
		local183 += local168;
		@Pc(389) int local389 = local183;
		local183 += local168;
		@Pc(395) int local395 = local183;
		local183 += local170 * 2 + local168;
		this.aShortArray109 = new short[this.anInt6635];
		this.aShortArray104 = new short[this.anInt6635];
		if (local136 == 1) {
			this.anIntArray312 = new int[this.anInt6635];
		}
		if (local74) {
			this.aByteArray52 = new byte[this.anInt6635];
		}
		if (local132 == 1) {
			this.aByteArray51 = new byte[this.anInt6635];
		}
		local10.anInt10061 = local225;
		if (this.anInt6637 > 0) {
			if (local168 > 0) {
				this.anIntArray316 = new int[local168];
				this.anIntArray310 = new int[local168];
				this.aByteArray54 = new byte[local168];
				this.aByteArray49 = new byte[local168];
				this.anIntArray315 = new int[local168];
				this.anIntArray311 = new int[local168];
			}
			if (local170 > 0) {
				this.anIntArray313 = new int[local170];
				this.anIntArray309 = new int[local170];
			}
			this.aShortArray106 = new short[this.anInt6637];
			this.aShortArray111 = new short[this.anInt6637];
			this.aShortArray102 = new short[this.anInt6637];
		}
		this.anIntArray317 = new int[this.anInt6644];
		if (local140 == 1) {
			this.aShortArray108 = new short[this.anInt6635];
		}
		this.aShortArray103 = new short[this.anInt6635];
		this.aShortArray110 = new short[this.anInt6635];
		if (local128 == 255) {
			this.aByteArray50 = new byte[this.anInt6635];
		} else {
			this.aByte78 = (byte) local128;
		}
		this.anIntArray314 = new int[this.anInt6644];
		this.anIntArray319 = new int[this.anInt6644];
		if (local140 == 1 && this.anInt6637 > 0) {
			this.aByteArray53 = new byte[this.anInt6635];
		}
		if (local144 == 1) {
			this.anIntArray318 = new int[this.anInt6644];
		}
		local15.anInt10061 = local321;
		local20.anInt10061 = local327;
		local25.anInt10061 = local333;
		local30.anInt10061 = local268;
		@Pc(595) int local595 = 0;
		@Pc(597) int local597 = 0;
		@Pc(599) int local599 = 0;
		@Pc(607) int local607;
		for (@Pc(601) int local601 = 0; local601 < this.anInt6644; local601++) {
			local607 = local10.method8246();
			@Pc(609) int local609 = 0;
			if ((local607 & 0x1) != 0) {
				local609 = local15.method8256();
			}
			@Pc(624) int local624 = 0;
			if ((local607 & 0x2) != 0) {
				local624 = local20.method8256();
			}
			@Pc(637) int local637 = 0;
			if ((local607 & 0x4) != 0) {
				local637 = local25.method8256();
			}
			this.anIntArray317[local601] = local595 + local609;
			this.anIntArray314[local601] = local597 + local624;
			this.anIntArray319[local601] = local599 + local637;
			local597 = this.anIntArray314[local601];
			local599 = this.anIntArray319[local601];
			local595 = this.anIntArray317[local601];
			if (local144 == 1) {
				this.anIntArray318[local601] = local30.method8246();
			}
		}
		local10.anInt10061 = local312;
		local15.anInt10061 = local232;
		local20.anInt10061 = local248;
		local25.anInt10061 = local278;
		local30.anInt10061 = local258;
		local35.anInt10061 = local294;
		local40.anInt10061 = local306;
		for (local607 = 0; local607 < this.anInt6635; local607++) {
			this.aShortArray110[local607] = (short) local10.method8220();
			if (local74) {
				this.aByteArray52[local607] = local15.method8208();
			}
			if (local128 == 255) {
				this.aByteArray50[local607] = local20.method8208();
			}
			if (local132 == 1) {
				this.aByteArray51[local607] = local25.method8208();
			}
			if (local136 == 1) {
				this.anIntArray312[local607] = local30.method8246();
			}
			if (local140 == 1) {
				this.aShortArray108[local607] = (short) (local35.method8220() - 1);
			}
			if (this.aByteArray53 != null) {
				if (this.aShortArray108[local607] == -1) {
					this.aByteArray53[local607] = -1;
				} else {
					this.aByteArray53[local607] = (byte) (local40.method8246() - 1);
				}
			}
		}
		this.anInt6641 = -1;
		local10.anInt10061 = local288;
		local15.anInt10061 = local241;
		@Pc(832) short local832 = 0;
		@Pc(834) short local834 = 0;
		@Pc(836) short local836 = 0;
		@Pc(838) short local838 = 0;
		@Pc(846) int local846;
		for (@Pc(840) int local840 = 0; local840 < this.anInt6635; local840++) {
			local846 = local15.method8246();
			if (local846 == 1) {
				local832 = (short) (local838 + local10.method8256());
				local834 = (short) (local10.method8256() + local832);
				local836 = (short) (local10.method8256() + local834);
				local838 = local836;
				this.aShortArray104[local840] = local832;
				this.aShortArray109[local840] = local834;
				this.aShortArray103[local840] = local836;
				if (local832 > this.anInt6641) {
					this.anInt6641 = local832;
				}
				if (this.anInt6641 < local834) {
					this.anInt6641 = local834;
				}
				if (local836 > this.anInt6641) {
					this.anInt6641 = local836;
				}
			}
			if (local846 == 2) {
				local834 = local836;
				local836 = (short) (local838 + local10.method8256());
				this.aShortArray104[local840] = local832;
				local838 = local836;
				this.aShortArray109[local840] = local834;
				this.aShortArray103[local840] = local836;
				if (local836 > this.anInt6641) {
					this.anInt6641 = local836;
				}
			}
			if (local846 == 3) {
				local832 = local836;
				local836 = (short) (local838 + local10.method8256());
				local838 = local836;
				this.aShortArray104[local840] = local832;
				this.aShortArray109[local840] = local834;
				this.aShortArray103[local840] = local836;
				if (this.anInt6641 < local836) {
					this.anInt6641 = local836;
				}
			}
			if (local846 == 4) {
				@Pc(1009) short local1009 = local832;
				local832 = local834;
				local834 = local1009;
				local836 = (short) (local838 + local10.method8256());
				this.aShortArray104[local840] = local832;
				local838 = local836;
				this.aShortArray109[local840] = local1009;
				this.aShortArray103[local840] = local836;
				if (this.anInt6641 < local836) {
					this.anInt6641 = local836;
				}
			}
		}
		this.anInt6641++;
		local10.anInt10061 = local339;
		local15.anInt10061 = local347;
		local20.anInt10061 = local375;
		local25.anInt10061 = local383;
		local30.anInt10061 = local389;
		local35.anInt10061 = local395;
		@Pc(1090) int local1090;
		for (local846 = 0; local846 < this.anInt6637; local846++) {
			local1090 = this.aByteArray48[local846] & 0xFF;
			if (local1090 == 0) {
				this.aShortArray106[local846] = (short) local10.method8220();
				this.aShortArray111[local846] = (short) local10.method8220();
				this.aShortArray102[local846] = (short) local10.method8220();
			}
			if (local1090 == 1) {
				this.aShortArray106[local846] = (short) local15.method8220();
				this.aShortArray111[local846] = (short) local15.method8220();
				this.aShortArray102[local846] = (short) local15.method8220();
				if (this.anInt6632 < 15) {
					this.anIntArray310[local846] = local20.method8220();
					if (this.anInt6632 >= 14) {
						this.anIntArray315[local846] = local20.method8203();
					} else {
						this.anIntArray315[local846] = local20.method8220();
					}
					this.anIntArray311[local846] = local20.method8220();
				} else {
					this.anIntArray310[local846] = local20.method8203();
					this.anIntArray315[local846] = local20.method8203();
					this.anIntArray311[local846] = local20.method8203();
				}
				this.aByteArray54[local846] = local25.method8208();
				this.aByteArray49[local846] = local30.method8208();
				this.anIntArray316[local846] = local35.method8208();
			}
			if (local1090 == 2) {
				this.aShortArray106[local846] = (short) local15.method8220();
				this.aShortArray111[local846] = (short) local15.method8220();
				this.aShortArray102[local846] = (short) local15.method8220();
				if (this.anInt6632 >= 15) {
					this.anIntArray310[local846] = local20.method8203();
					this.anIntArray315[local846] = local20.method8203();
					this.anIntArray311[local846] = local20.method8203();
				} else {
					this.anIntArray310[local846] = local20.method8220();
					if (this.anInt6632 < 14) {
						this.anIntArray315[local846] = local20.method8220();
					} else {
						this.anIntArray315[local846] = local20.method8203();
					}
					this.anIntArray311[local846] = local20.method8220();
				}
				this.aByteArray54[local846] = local25.method8208();
				this.aByteArray49[local846] = local30.method8208();
				this.anIntArray316[local846] = local35.method8208();
				this.anIntArray313[local846] = local35.method8208();
				this.anIntArray309[local846] = local35.method8208();
			}
			if (local1090 == 3) {
				this.aShortArray106[local846] = (short) local15.method8220();
				this.aShortArray111[local846] = (short) local15.method8220();
				this.aShortArray102[local846] = (short) local15.method8220();
				if (this.anInt6632 < 15) {
					this.anIntArray310[local846] = local20.method8220();
					if (this.anInt6632 < 14) {
						this.anIntArray315[local846] = local20.method8220();
					} else {
						this.anIntArray315[local846] = local20.method8203();
					}
					this.anIntArray311[local846] = local20.method8220();
				} else {
					this.anIntArray310[local846] = local20.method8203();
					this.anIntArray315[local846] = local20.method8203();
					this.anIntArray311[local846] = local20.method8203();
				}
				this.aByteArray54[local846] = local25.method8208();
				this.aByteArray49[local846] = local30.method8208();
				this.anIntArray316[local846] = local35.method8208();
			}
		}
		local10.anInt10061 = local183;
		@Pc(1497) int local1497;
		@Pc(1503) int local1503;
		@Pc(1507) int local1507;
		@Pc(1573) int local1573;
		if (local85) {
			local1090 = local10.method8246();
			if (local1090 > 0) {
				this.aClass103Array4 = new Class103[local1090];
				for (local1497 = 0; local1497 < local1090; local1497++) {
					local1503 = local10.method8220();
					local1507 = local10.method8220();
					@Pc(1515) byte local1515;
					if (local128 == 255) {
						local1515 = this.aByteArray50[local1507];
					} else {
						local1515 = (byte) local128;
					}
					this.aClass103Array4[local1497] = new Class103(local1503, this.aShortArray104[local1507], this.aShortArray109[local1507], this.aShortArray103[local1507], local1515);
				}
			}
			local1497 = local10.method8246();
			if (local1497 > 0) {
				this.aClass49Array4 = new Class49[local1497];
				for (local1503 = 0; local1503 < local1497; local1503++) {
					local1507 = local10.method8220();
					local1573 = local10.method8220();
					this.aClass49Array4[local1503] = new Class49(local1507, local1573);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1090 = local10.method8246();
		if (local1090 <= 0) {
			return;
		}
		this.aClass123Array1 = new Class123[local1090];
		for (local1497 = 0; local1497 < local1090; local1497++) {
			local1503 = local10.method8220();
			local1507 = local10.method8220();
			local1573 = local10.method8246();
			@Pc(1625) byte local1625 = local10.method8208();
			this.aClass123Array1[local1497] = new Class123(local1503, local1507, local1573, local1625);
		}
		return;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(SBS)V")
	public void method5547(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray108 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anInt6635; local19++) {
			if (arg1 == this.aShortArray108[local19]) {
				this.aShortArray108[local19] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)[[I")
	public int[][] method5548() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6635; local12++) {
			@Pc(19) int local19 = this.anIntArray312[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local54[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt6635; local80++) {
			@Pc(87) int local87 = this.anIntArray312[local80];
			if (local87 >= 0) {
				local54[local87][local8[local87]++] = local80;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(II)V")
	public void method5549() {
		for (@Pc(14) int local14 = 0; local14 < this.anInt6644; local14++) {
			this.anIntArray317[local14] <<= 0x2;
			this.anIntArray314[local14] <<= 0x2;
			this.anIntArray319[local14] <<= 0x2;
		}
		if (this.anInt6637 <= 0 || this.anIntArray310 == null) {
			return;
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray310.length; local56++) {
			this.anIntArray310[local56] <<= 0x2;
			this.anIntArray315[local56] <<= 0x2;
			if (this.aByteArray48[local56] != 1) {
				this.anIntArray311[local56] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ISS)V")
	public void method5550(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6635; local3++) {
			if (arg0 == this.aShortArray110[local3]) {
				this.aShortArray110[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BSSBZIIBI)I")
	public int method5551(@OriginalArg(0) byte arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) int arg7) {
		this.aShortArray104[this.anInt6635] = (short) arg5;
		this.aShortArray109[this.anInt6635] = (short) arg7;
		this.aShortArray103[this.anInt6635] = (short) arg4;
		this.aByteArray52[this.anInt6635] = arg0;
		this.aByteArray53[this.anInt6635] = arg6;
		this.aShortArray110[this.anInt6635] = arg1;
		this.aByteArray51[this.anInt6635] = arg3;
		this.aShortArray108[this.anInt6635] = arg2;
		return this.anInt6635++;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZ)[[I")
	public int[][] method5552(@OriginalArg(1) boolean arg0) {
		@Pc(23) int[] local23 = new int[256];
		@Pc(25) int local25 = 0;
		@Pc(33) int local33 = arg0 ? this.anInt6644 : this.anInt6641;
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(42) int local42 = this.anIntArray318[local35];
			if (local42 >= 0) {
				if (local25 < local42) {
					local25 = local42;
				}
				@Pc(57) int local57 = local23[local42]++;
			}
		}
		@Pc(73) int[][] local73 = new int[local25 + 1][];
		for (@Pc(75) int local75 = 0; local75 <= local25; local75++) {
			local73[local75] = new int[local23[local75]];
			local23[local75] = 0;
		}
		for (@Pc(94) int local94 = 0; local94 < local33; local94++) {
			@Pc(101) int local101 = this.anIntArray318[local94];
			if (local101 >= 0) {
				local73[local101][local23[local101]++] = local94;
			}
		}
		return local73;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)[[I")
	public int[][] method5553() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass123Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass123Array1[local12].anInt4153;
			if (local20 >= 0) {
				if (local10 < local20) {
					local10 = local20;
				}
				@Pc(34) int local34 = local8[local20]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < this.aClass123Array1.length; local77++) {
			@Pc(91) int local91 = this.aClass123Array1[local77].anInt4153;
			if (local91 >= 0) {
				local52[local91][local8[local91]++] = local77;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIBI)V")
	public void method5554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6644; local7++) {
			this.anIntArray317[local7] += arg1;
			this.anIntArray314[local7] += arg2;
			this.anIntArray319[local7] += arg0;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!lv;ISI)I")
	private int method5555(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(10) int local10 = arg0.anIntArray317[arg1];
		@Pc(15) int local15 = arg0.anIntArray314[arg1];
		@Pc(20) int local20 = arg0.anIntArray319[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt6644; local22++) {
			if (this.anIntArray317[local22] == local10 && this.anIntArray314[local22] == local15 && this.anIntArray319[local22] == local20) {
				this.aShortArray107[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray317[this.anInt6644] = local10;
		this.anIntArray314[this.anInt6644] = local15;
		this.anIntArray319[this.anInt6644] = local20;
		this.aShortArray107[this.anInt6644] = arg2;
		this.anIntArray318[this.anInt6644] = arg0.anIntArray318 == null ? -1 : arg0.anIntArray318[arg1];
		return this.anInt6644++;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIII)I")
	public int method5556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6644; local7++) {
			if (arg0 == this.anIntArray317[local7] && this.anIntArray314[local7] == arg1 && arg2 == this.anIntArray319[local7]) {
				return local7;
			}
		}
		this.anIntArray317[this.anInt6644] = arg0;
		this.anIntArray314[this.anInt6644] = arg1;
		this.anIntArray319[this.anInt6644] = arg2;
		this.anInt6641 = this.anInt6644 + 1;
		return this.anInt6644++;
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(IIBI)V")
	public void method5557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg0 != 0) {
			@Pc(14) int local14 = Class78_Sub2_Sub2.anIntArray270[arg0];
			local18 = Class78_Sub2_Sub2.anIntArray271[arg0];
			for (local20 = 0; local20 < this.anInt6644; local20++) {
				local38 = local18 * this.anIntArray317[local20] + this.anIntArray314[local20] * local14 >> 14;
				this.anIntArray314[local20] = this.anIntArray314[local20] * local18 - this.anIntArray317[local20] * local14 >> 14;
				this.anIntArray317[local20] = local38;
			}
		}
		@Pc(110) int local110;
		if (arg1 != 0) {
			local18 = Class78_Sub2_Sub2.anIntArray270[arg1];
			local20 = Class78_Sub2_Sub2.anIntArray271[arg1];
			for (local38 = 0; local38 < this.anInt6644; local38++) {
				local110 = this.anIntArray314[local38] * local20 - local18 * this.anIntArray319[local38] >> 14;
				this.anIntArray319[local38] = this.anIntArray314[local38] * local18 + this.anIntArray319[local38] * local20 >> 14;
				this.anIntArray314[local38] = local110;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local18 = Class78_Sub2_Sub2.anIntArray270[arg2];
		local20 = Class78_Sub2_Sub2.anIntArray271[arg2];
		for (local38 = 0; local38 < this.anInt6644; local38++) {
			local110 = local18 * this.anIntArray319[local38] + local20 * this.anIntArray317[local38] >> 14;
			this.anIntArray319[local38] = this.anIntArray319[local38] * local20 - local18 * this.anIntArray317[local38] >> 14;
			this.anIntArray317[local38] = local110;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(BBSSSSSBSB)B")
	public byte method5558() {
		if (this.anInt6637 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray48[this.anInt6637] = 3;
		this.aShortArray106[this.anInt6637] = 0;
		this.aShortArray111[this.anInt6637] = 32767;
		this.aShortArray102[this.anInt6637] = 0;
		this.anIntArray310[this.anInt6637] = 1024;
		this.anIntArray315[this.anInt6637] = 1024;
		this.anIntArray311[this.anInt6637] = 1024;
		this.aByteArray54[this.anInt6637] = 0;
		this.aByteArray49[this.anInt6637] = 0;
		this.anIntArray316[this.anInt6637] = 0;
		return (byte) this.anInt6637++;
	}
}
