import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class71 {

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!g", name = "e", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "[Lclient!jc;")
	public Class101[] aClass101Array3;

	@OriginalMember(owner = "client!g", name = "l", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!g", name = "r", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "[B")
	public byte[] aByteArray54;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "[B")
	public byte[] aByteArray55;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "[I")
	public int[] anIntArray199;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!g", name = "F", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!g", name = "H", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!g", name = "P", descriptor = "[B")
	public byte[] aByteArray56;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!g", name = "R", descriptor = "[I")
	public int[] anIntArray201;

	@OriginalMember(owner = "client!g", name = "S", descriptor = "[I")
	public int[] anIntArray202;

	@OriginalMember(owner = "client!g", name = "T", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!g", name = "U", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!g", name = "V", descriptor = "[Lclient!kh;")
	public Class115[] aClass115Array3;

	@OriginalMember(owner = "client!g", name = "W", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!g", name = "X", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!g", name = "ab", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "I")
	public int anInt2198 = 0;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public int anInt2196 = 0;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public int anInt2193 = 0;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "I")
	public int anInt2207 = 0;

	@OriginalMember(owner = "client!g", name = "g", descriptor = "B")
	public byte aByte18 = 0;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "([B)V")
	public Class71(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2177(arg0);
		} else {
			this.method2184(arg0);
		}
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(III)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray55 = new short[arg1];
		this.aShortArray44 = new short[arg1];
		this.aShortArray54 = new short[arg1];
		this.anIntArray199 = new int[arg1];
		this.aByteArray54 = new byte[arg1];
		this.aShortArray52 = new short[arg1];
		this.aByteArray55 = new byte[arg1];
		this.aByteArray52 = new byte[arg1];
		this.anIntArray200 = new int[arg0];
		this.anIntArray203 = new int[arg0];
		this.anIntArray202 = new int[arg0];
		this.aByteArray51 = new byte[arg1];
		if (arg2 > 0) {
			this.aByteArray59 = new byte[arg2];
			this.aShortArray47 = new short[arg2];
			this.aByteArray53 = new byte[arg2];
			this.aByteArray57 = new byte[arg2];
			this.aShortArray49 = new short[arg2];
			this.aShortArray45 = new short[arg2];
			this.aByteArray50 = new byte[arg2];
			this.aByteArray58 = new byte[arg2];
			this.aShortArray46 = new short[arg2];
			this.aShortArray53 = new short[arg2];
			this.aShortArray48 = new short[arg2];
			this.aByteArray56 = new byte[arg2];
		}
		this.aShortArray50 = new short[arg1];
		this.anIntArray201 = new int[arg0];
	}

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "([Lclient!g;I)V")
	public Class71(@OriginalArg(0) Class71[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2196 = 0;
		this.anInt2207 = 0;
		this.anInt2198 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte18 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class71 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt2198 += local54.anInt2198;
				this.anInt2207 += local54.anInt2207;
				this.anInt2196 += local54.anInt2196;
				if (local54.aClass115Array3 != null) {
					local29 += local54.aClass115Array3.length;
				}
				if (local54.aClass101Array3 != null) {
					local31 += local54.aClass101Array3.length;
				}
				local33 |= local54.aByteArray54 != null;
				local46 |= local54.anIntArray199 != null;
				if (local54.aByteArray51 == null) {
					if (this.aByte18 == -1) {
						this.aByte18 = local54.aByte18;
					}
					if (local54.aByte18 != this.aByte18) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local37 |= local54.aByteArray52 != null;
				local41 |= local54.aShortArray50 != null;
				local39 |= local54.aByteArray55 != null;
			}
		}
		this.aShortArray54 = new short[this.anInt2198];
		this.anIntArray201 = new int[this.anInt2196];
		if (local39) {
			this.aByteArray55 = new byte[this.anInt2198];
		}
		this.aShortArray55 = new short[this.anInt2198];
		if (local46) {
			this.anIntArray199 = new int[this.anInt2198];
		}
		this.anIntArray202 = new int[this.anInt2196];
		this.aShortArray52 = new short[this.anInt2198];
		if (local33) {
			this.aByteArray54 = new byte[this.anInt2198];
		}
		this.aShortArray44 = new short[this.anInt2198];
		this.aShortArray56 = new short[this.anInt2198];
		this.anIntArray203 = new int[this.anInt2196];
		if (local37) {
			this.aByteArray52 = new byte[this.anInt2198];
		}
		if (local35) {
			this.aByteArray51 = new byte[this.anInt2198];
		}
		if (this.anInt2207 > 0) {
			this.aShortArray46 = new short[this.anInt2207];
			this.aShortArray48 = new short[this.anInt2207];
			this.aShortArray45 = new short[this.anInt2207];
			this.aShortArray49 = new short[this.anInt2207];
			this.aByteArray57 = new byte[this.anInt2207];
			this.aByteArray59 = new byte[this.anInt2207];
			this.aShortArray53 = new short[this.anInt2207];
			this.aByteArray53 = new byte[this.anInt2207];
			this.aShortArray47 = new short[this.anInt2207];
			this.aByteArray50 = new byte[this.anInt2207];
			this.aByteArray58 = new byte[this.anInt2207];
			this.aByteArray56 = new byte[this.anInt2207];
		}
		this.aShortArray51 = new short[this.anInt2196];
		if (local41) {
			this.aShortArray50 = new short[this.anInt2198];
		}
		this.anIntArray200 = new int[this.anInt2196];
		if (local29 > 0) {
			this.aClass115Array3 = new Class115[local29];
		}
		if (local31 > 0) {
			this.aClass101Array3 = new Class101[local31];
		}
		this.anInt2196 = 0;
		local31 = 0;
		this.anInt2207 = 0;
		this.anInt2198 = 0;
		local29 = 0;
		@Pc(565) int local565;
		@Pc(576) int local576;
		for (@Pc(360) int local360 = 0; local360 < arg1; local360++) {
			@Pc(367) short local367 = (short) (0x1 << local360);
			@Pc(371) Class71 local371 = arg0[local360];
			if (local371 != null) {
				for (@Pc(375) int local375 = 0; local375 < local371.anInt2198; local375++) {
					if (local33 && local371.aByteArray54 != null) {
						this.aByteArray54[this.anInt2198] = local371.aByteArray54[local375];
					}
					if (local35) {
						if (local371.aByteArray51 == null) {
							this.aByteArray51[this.anInt2198] = local371.aByte18;
						} else {
							this.aByteArray51[this.anInt2198] = local371.aByteArray51[local375];
						}
					}
					if (local37 && local371.aByteArray52 != null) {
						this.aByteArray52[this.anInt2198] = local371.aByteArray52[local375];
					}
					if (local41) {
						if (local371.aShortArray50 == null) {
							this.aShortArray50[this.anInt2198] = -1;
						} else {
							this.aShortArray50[this.anInt2198] = local371.aShortArray50[local375];
						}
					}
					if (local46) {
						if (local371.anIntArray199 == null) {
							this.anIntArray199[this.anInt2198] = -1;
						} else {
							this.anIntArray199[this.anInt2198] = local371.anIntArray199[local375];
						}
					}
					this.aShortArray52[this.anInt2198] = (short) this.method2182(local371.aShortArray52[local375], local367, local371);
					this.aShortArray54[this.anInt2198] = (short) this.method2182(local371.aShortArray54[local375], local367, local371);
					this.aShortArray55[this.anInt2198] = (short) this.method2182(local371.aShortArray55[local375], local367, local371);
					this.aShortArray56[this.anInt2198] = local367;
					this.aShortArray44[this.anInt2198] = local371.aShortArray44[local375];
					this.anInt2198++;
				}
				@Pc(552) int local552;
				if (local371.aClass115Array3 != null) {
					for (local552 = 0; local552 < local371.aClass115Array3.length; local552++) {
						local565 = this.method2182(local371.aClass115Array3[local552].anInt3462, local367, local371);
						local576 = this.method2182(local371.aClass115Array3[local552].anInt3439, local367, local371);
						@Pc(587) int local587 = this.method2182(local371.aClass115Array3[local552].anInt3449, local367, local371);
						this.aClass115Array3[local29] = new Class115(local371.aClass115Array3[local552].anInt3461, local565, local576, local587, local371.aClass115Array3[local552].aByte28);
						local29++;
					}
				}
				if (local371.aClass101Array3 != null) {
					for (local552 = 0; local552 < local371.aClass101Array3.length; local552++) {
						local565 = this.method2182(local371.aClass101Array3[local552].anInt3054, local367, local371);
						this.aClass101Array3[local31] = new Class101(local371.aClass101Array3[local552].anInt3055, local565);
						local31++;
					}
				}
			}
		}
		this.anInt2193 = this.anInt2196;
		@Pc(670) int local670 = 0;
		for (@Pc(672) int local672 = 0; local672 < arg1; local672++) {
			@Pc(679) short local679 = (short) (0x1 << local672);
			@Pc(683) Class71 local683 = arg0[local672];
			if (local683 != null) {
				for (local565 = 0; local565 < local683.anInt2198; local565++) {
					if (local39) {
						this.aByteArray55[local670++] = (byte) (local683.aByteArray55 == null || local683.aByteArray55[local565] == -1 ? -1 : this.anInt2207 + local683.aByteArray55[local565]);
					}
				}
				for (local576 = 0; local576 < local683.anInt2207; local576++) {
					@Pc(739) byte local739 = this.aByteArray57[this.anInt2207] = local683.aByteArray57[local576];
					if (local739 == 0) {
						this.aShortArray45[this.anInt2207] = (short) this.method2182(local683.aShortArray45[local576], local679, local683);
						this.aShortArray48[this.anInt2207] = (short) this.method2182(local683.aShortArray48[local576], local679, local683);
						this.aShortArray53[this.anInt2207] = (short) this.method2182(local683.aShortArray53[local576], local679, local683);
					}
					if (local739 >= 1 && local739 <= 3) {
						this.aShortArray45[this.anInt2207] = local683.aShortArray45[local576];
						this.aShortArray48[this.anInt2207] = local683.aShortArray48[local576];
						this.aShortArray53[this.anInt2207] = local683.aShortArray53[local576];
						this.aShortArray47[this.anInt2207] = local683.aShortArray47[local576];
						this.aShortArray46[this.anInt2207] = local683.aShortArray46[local576];
						this.aShortArray49[this.anInt2207] = local683.aShortArray49[local576];
						this.aByteArray56[this.anInt2207] = local683.aByteArray56[local576];
						this.aByteArray50[this.anInt2207] = local683.aByteArray50[local576];
						this.aByteArray59[this.anInt2207] = local683.aByteArray59[local576];
					}
					if (local739 == 2) {
						this.aByteArray58[this.anInt2207] = local683.aByteArray58[local576];
						this.aByteArray53[this.anInt2207] = local683.aByteArray53[local576];
					}
					this.anInt2207++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[B)V")
	private void method2177(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class14_Sub4 local10 = new Class14_Sub4(arg0);
		@Pc(15) Class14_Sub4 local15 = new Class14_Sub4(arg0);
		@Pc(20) Class14_Sub4 local20 = new Class14_Sub4(arg0);
		@Pc(25) Class14_Sub4 local25 = new Class14_Sub4(arg0);
		@Pc(30) Class14_Sub4 local30 = new Class14_Sub4(arg0);
		@Pc(35) Class14_Sub4 local35 = new Class14_Sub4(arg0);
		@Pc(40) Class14_Sub4 local40 = new Class14_Sub4(arg0);
		local10.anInt2637 = arg0.length - 23;
		this.anInt2196 = local10.method2498();
		this.anInt2198 = local10.method2498();
		this.anInt2207 = local10.method2548();
		@Pc(65) int local65 = local10.method2548();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(91) int local91 = local10.method2548();
		@Pc(95) int local95 = local10.method2548();
		@Pc(99) int local99 = local10.method2548();
		@Pc(103) int local103 = local10.method2548();
		@Pc(107) int local107 = local10.method2548();
		@Pc(111) int local111 = local10.method2498();
		@Pc(115) int local115 = local10.method2498();
		@Pc(119) int local119 = local10.method2498();
		@Pc(123) int local123 = local10.method2498();
		@Pc(127) int local127 = local10.method2498();
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(133) int local133 = 0;
		@Pc(146) int local146;
		if (this.anInt2207 > 0) {
			this.aByteArray57 = new byte[this.anInt2207];
			local10.anInt2637 = 0;
			for (local146 = 0; local146 < this.anInt2207; local146++) {
				@Pc(157) byte local157 = this.aByteArray57[local146] = local10.method2553();
				if (local157 == 2) {
					local133++;
				}
				if (local157 >= 1 && local157 <= 3) {
					local131++;
				}
				if (local157 == 0) {
					local129++;
				}
			}
		}
		local146 = this.anInt2207;
		@Pc(185) int local185 = local146;
		local146 += this.anInt2196;
		@Pc(192) int local192 = local146;
		if (local76) {
			local146 += this.anInt2198;
		}
		@Pc(201) int local201 = local146;
		local146 += this.anInt2198;
		@Pc(208) int local208 = local146;
		if (local91 == 255) {
			local146 += this.anInt2198;
		}
		@Pc(218) int local218 = local146;
		if (local99 == 1) {
			local146 += this.anInt2198;
		}
		@Pc(228) int local228 = local146;
		if (local107 == 1) {
			local146 += this.anInt2196;
		}
		@Pc(240) int local240 = local146;
		if (local95 == 1) {
			local146 += this.anInt2198;
		}
		@Pc(250) int local250 = local146;
		local146 += local123;
		@Pc(256) int local256 = local146;
		if (local103 == 1) {
			local146 += this.anInt2198 * 2;
		}
		@Pc(268) int local268 = local146;
		local146 += local127;
		@Pc(274) int local274 = local146;
		local146 += this.anInt2198 * 2;
		@Pc(283) int local283 = local146;
		local146 += local111;
		@Pc(289) int local289 = local146;
		local146 += local115;
		@Pc(295) int local295 = local146;
		local146 += local119;
		@Pc(301) int local301 = local146;
		local146 += local129 * 6;
		@Pc(309) int local309 = local146;
		local146 += local131 * 6;
		@Pc(317) int local317 = local146;
		local146 += local131 * 6;
		@Pc(325) int local325 = local146;
		local146 += local131;
		@Pc(331) int local331 = local146;
		local146 += local131;
		@Pc(337) int local337 = local146;
		local146 += local131 + local133 * 2;
		local10.anInt2637 = local185;
		this.aShortArray52 = new short[this.anInt2198];
		this.aShortArray55 = new short[this.anInt2198];
		if (local103 == 1 && this.anInt2207 > 0) {
			this.aByteArray55 = new byte[this.anInt2198];
		}
		this.anIntArray203 = new int[this.anInt2196];
		this.anIntArray202 = new int[this.anInt2196];
		if (this.anInt2207 > 0) {
			if (local131 > 0) {
				this.aByteArray50 = new byte[local131];
				this.aByteArray56 = new byte[local131];
				this.aShortArray46 = new short[local131];
				this.aShortArray49 = new short[local131];
				this.aShortArray47 = new short[local131];
				this.aByteArray59 = new byte[local131];
			}
			if (local133 > 0) {
				this.aByteArray53 = new byte[local133];
				this.aByteArray58 = new byte[local133];
			}
			this.aShortArray48 = new short[this.anInt2207];
			this.aShortArray45 = new short[this.anInt2207];
			this.aShortArray53 = new short[this.anInt2207];
		}
		if (local107 == 1) {
			this.anIntArray200 = new int[this.anInt2196];
		}
		if (local103 == 1) {
			this.aShortArray50 = new short[this.anInt2198];
		}
		if (local99 == 1) {
			this.anIntArray199 = new int[this.anInt2198];
		}
		this.aShortArray54 = new short[this.anInt2198];
		this.aShortArray44 = new short[this.anInt2198];
		if (local91 == 255) {
			this.aByteArray51 = new byte[this.anInt2198];
		} else {
			this.aByte18 = (byte) local91;
		}
		this.anIntArray201 = new int[this.anInt2196];
		if (local76) {
			this.aByteArray54 = new byte[this.anInt2198];
		}
		if (local95 == 1) {
			this.aByteArray52 = new byte[this.anInt2198];
		}
		local15.anInt2637 = local283;
		local20.anInt2637 = local289;
		local25.anInt2637 = local295;
		local30.anInt2637 = local228;
		@Pc(524) int local524 = 0;
		@Pc(526) int local526 = 0;
		@Pc(528) int local528 = 0;
		@Pc(536) int local536;
		for (@Pc(530) int local530 = 0; local530 < this.anInt2196; local530++) {
			local536 = local10.method2548();
			@Pc(538) int local538 = 0;
			if ((local536 & 0x1) != 0) {
				local538 = local15.method2515();
			}
			@Pc(548) int local548 = 0;
			if ((local536 & 0x2) != 0) {
				local548 = local20.method2515();
			}
			@Pc(558) int local558 = 0;
			if ((local536 & 0x4) != 0) {
				local558 = local25.method2515();
			}
			this.anIntArray201[local530] = local538 + local524;
			this.anIntArray202[local530] = local526 + local548;
			this.anIntArray203[local530] = local528 + local558;
			local526 = this.anIntArray202[local530];
			local528 = this.anIntArray203[local530];
			local524 = this.anIntArray201[local530];
			if (local107 == 1) {
				this.anIntArray200[local530] = local30.method2548();
			}
		}
		local10.anInt2637 = local274;
		local15.anInt2637 = local192;
		local20.anInt2637 = local208;
		local25.anInt2637 = local240;
		local30.anInt2637 = local218;
		local35.anInt2637 = local256;
		local40.anInt2637 = local268;
		for (local536 = 0; local536 < this.anInt2198; local536++) {
			this.aShortArray44[local536] = (short) local10.method2498();
			if (local76) {
				this.aByteArray54[local536] = local15.method2553();
			}
			if (local91 == 255) {
				this.aByteArray51[local536] = local20.method2553();
			}
			if (local95 == 1) {
				this.aByteArray52[local536] = local25.method2553();
			}
			if (local99 == 1) {
				this.anIntArray199[local536] = local30.method2548();
			}
			if (local103 == 1) {
				this.aShortArray50[local536] = (short) (local35.method2498() - 1);
			}
			if (this.aByteArray55 != null) {
				if (this.aShortArray50[local536] == -1) {
					this.aByteArray55[local536] = -1;
				} else {
					this.aByteArray55[local536] = (byte) (local40.method2548() - 1);
				}
			}
		}
		this.anInt2193 = -1;
		local10.anInt2637 = local250;
		local15.anInt2637 = local201;
		@Pc(756) short local756 = 0;
		@Pc(758) short local758 = 0;
		@Pc(760) short local760 = 0;
		@Pc(762) short local762 = 0;
		@Pc(770) int local770;
		for (@Pc(764) int local764 = 0; local764 < this.anInt2198; local764++) {
			local770 = local15.method2548();
			if (local770 == 1) {
				local756 = (short) (local10.method2515() + local762);
				local758 = (short) (local756 + local10.method2515());
				local760 = (short) (local758 + local10.method2515());
				local762 = local760;
				this.aShortArray52[local764] = local756;
				this.aShortArray54[local764] = local758;
				this.aShortArray55[local764] = local760;
				if (local756 > this.anInt2193) {
					this.anInt2193 = local756;
				}
				if (local758 > this.anInt2193) {
					this.anInt2193 = local758;
				}
				if (this.anInt2193 < local760) {
					this.anInt2193 = local760;
				}
			}
			if (local770 == 2) {
				local758 = local760;
				local760 = (short) (local10.method2515() + local762);
				this.aShortArray52[local764] = local756;
				local762 = local760;
				this.aShortArray54[local764] = local758;
				this.aShortArray55[local764] = local760;
				if (local760 > this.anInt2193) {
					this.anInt2193 = local760;
				}
			}
			if (local770 == 3) {
				local756 = local760;
				local760 = (short) (local10.method2515() + local762);
				local762 = local760;
				this.aShortArray52[local764] = local756;
				this.aShortArray54[local764] = local758;
				this.aShortArray55[local764] = local760;
				if (this.anInt2193 < local760) {
					this.anInt2193 = local760;
				}
			}
			if (local770 == 4) {
				@Pc(919) short local919 = local756;
				local756 = local758;
				local760 = (short) (local10.method2515() + local762);
				local758 = local919;
				this.aShortArray52[local764] = local756;
				local762 = local760;
				this.aShortArray54[local764] = local919;
				this.aShortArray55[local764] = local760;
				if (this.anInt2193 < local760) {
					this.anInt2193 = local760;
				}
			}
		}
		local10.anInt2637 = local301;
		this.anInt2193++;
		local15.anInt2637 = local309;
		local20.anInt2637 = local317;
		local25.anInt2637 = local325;
		local30.anInt2637 = local331;
		local35.anInt2637 = local337;
		@Pc(998) int local998;
		for (local770 = 0; local770 < this.anInt2207; local770++) {
			local998 = this.aByteArray57[local770] & 0xFF;
			if (local998 == 0) {
				this.aShortArray45[local770] = (short) local10.method2498();
				this.aShortArray48[local770] = (short) local10.method2498();
				this.aShortArray53[local770] = (short) local10.method2498();
			}
			if (local998 == 1) {
				this.aShortArray45[local770] = (short) local15.method2498();
				this.aShortArray48[local770] = (short) local15.method2498();
				this.aShortArray53[local770] = (short) local15.method2498();
				this.aShortArray47[local770] = (short) local20.method2498();
				this.aShortArray46[local770] = (short) local20.method2498();
				this.aShortArray49[local770] = (short) local20.method2498();
				this.aByteArray56[local770] = local25.method2553();
				this.aByteArray50[local770] = local30.method2553();
				this.aByteArray59[local770] = local35.method2553();
			}
			if (local998 == 2) {
				this.aShortArray45[local770] = (short) local15.method2498();
				this.aShortArray48[local770] = (short) local15.method2498();
				this.aShortArray53[local770] = (short) local15.method2498();
				this.aShortArray47[local770] = (short) local20.method2498();
				this.aShortArray46[local770] = (short) local20.method2498();
				this.aShortArray49[local770] = (short) local20.method2498();
				this.aByteArray56[local770] = local25.method2553();
				this.aByteArray50[local770] = local30.method2553();
				this.aByteArray59[local770] = local35.method2553();
				this.aByteArray58[local770] = local35.method2553();
				this.aByteArray53[local770] = local35.method2553();
			}
			if (local998 == 3) {
				this.aShortArray45[local770] = (short) local15.method2498();
				this.aShortArray48[local770] = (short) local15.method2498();
				this.aShortArray53[local770] = (short) local15.method2498();
				this.aShortArray47[local770] = (short) local20.method2498();
				this.aShortArray46[local770] = (short) local20.method2498();
				this.aShortArray49[local770] = (short) local20.method2498();
				this.aByteArray56[local770] = local25.method2553();
				this.aByteArray50[local770] = local30.method2553();
				this.aByteArray59[local770] = local35.method2553();
			}
		}
		if (!local87) {
			return;
		}
		local10.anInt2637 = local146;
		local998 = local10.method2548();
		@Pc(1285) int local1285;
		@Pc(1291) int local1291;
		if (local998 > 0) {
			this.aClass115Array3 = new Class115[local998];
			for (local1285 = 0; local1285 < local998; local1285++) {
				local1291 = local10.method2498();
				@Pc(1295) int local1295 = local10.method2498();
				@Pc(1303) byte local1303;
				if (local91 == 255) {
					local1303 = this.aByteArray51[local1295];
				} else {
					local1303 = (byte) local91;
				}
				this.aClass115Array3[local1285] = new Class115(local1291, this.aShortArray52[local1295], this.aShortArray54[local1295], this.aShortArray55[local1295], local1303);
			}
		}
		local1285 = local10.method2548();
		if (local1285 <= 0) {
			return;
		}
		this.aClass101Array3 = new Class101[local1285];
		for (local1291 = 0; local1291 < local1285; local1291++) {
			this.aClass101Array3[local1291] = new Class101(local10.method2498(), local10.method2498());
		}
		return;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIB)I")
	public int method2178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2196; local7++) {
			if (this.anIntArray201[local7] == arg2 && arg1 == this.anIntArray202[local7] && this.anIntArray203[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray201[this.anInt2196] = arg2;
		this.anIntArray202[this.anInt2196] = arg1;
		this.anIntArray203[this.anInt2196] = arg0;
		this.anInt2193 = this.anInt2196 + 1;
		return this.anInt2196++;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(SIS)V")
	public void method2179(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2198; local3++) {
			if (arg1 == this.aShortArray44[local3]) {
				this.aShortArray44[local3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)[[I")
	public int[][] method2180() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2198; local12++) {
			@Pc(19) int local19 = this.anIntArray199[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(60) int[][] local60 = new int[local10 + 1][];
		for (@Pc(62) int local62 = 0; local62 <= local10; local62++) {
			local60[local62] = new int[local8[local62]];
			local8[local62] = 0;
		}
		for (@Pc(85) int local85 = 0; local85 < this.anInt2198; local85++) {
			@Pc(92) int local92 = this.anIntArray199[local85];
			if (local92 >= 0) {
				local60[local92][local8[local92]++] = local85;
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)[[I")
	public int[][] method2181() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2193; local12++) {
			@Pc(19) int local19 = this.anIntArray200[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(46) int[][] local46 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local46[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt2193; local73++) {
			@Pc(80) int local80 = this.anIntArray200[local73];
			if (local80 >= 0) {
				local46[local80][local8[local80]++] = local73;
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ISILclient!g;)I")
	private int method2182(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) Class71 arg2) {
		@Pc(10) int local10 = arg2.anIntArray201[arg0];
		@Pc(15) int local15 = arg2.anIntArray202[arg0];
		@Pc(20) int local20 = arg2.anIntArray203[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt2196; local22++) {
			if (local10 == this.anIntArray201[local22] && this.anIntArray202[local22] == local15 && this.anIntArray203[local22] == local20) {
				this.aShortArray51[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray201[this.anInt2196] = local10;
		this.anIntArray202[this.anInt2196] = local15;
		this.anIntArray203[this.anInt2196] = local20;
		this.aShortArray51[this.anInt2196] = arg1;
		this.anIntArray200[this.anInt2196] = arg2.anIntArray200 == null ? -1 : arg2.anIntArray200[arg0];
		return this.anInt2196++;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(SSBBSSSBBS)B")
	public byte method2183() {
		if (this.anInt2207 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray57[this.anInt2207] = 3;
		this.aShortArray45[this.anInt2207] = 0;
		this.aShortArray48[this.anInt2207] = 32767;
		this.aShortArray53[this.anInt2207] = 0;
		this.aShortArray47[this.anInt2207] = 1024;
		this.aShortArray46[this.anInt2207] = 1024;
		this.aShortArray49[this.anInt2207] = 1024;
		this.aByteArray56[this.anInt2207] = 0;
		this.aByteArray50[this.anInt2207] = 0;
		this.aByteArray59[this.anInt2207] = 0;
		return (byte) this.anInt2207++;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BZ)V")
	private void method2184(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class14_Sub4 local14 = new Class14_Sub4(arg0);
		@Pc(19) Class14_Sub4 local19 = new Class14_Sub4(arg0);
		@Pc(24) Class14_Sub4 local24 = new Class14_Sub4(arg0);
		@Pc(29) Class14_Sub4 local29 = new Class14_Sub4(arg0);
		@Pc(34) Class14_Sub4 local34 = new Class14_Sub4(arg0);
		local14.anInt2637 = arg0.length - 18;
		this.anInt2196 = local14.method2498();
		this.anInt2198 = local14.method2498();
		this.anInt2207 = local14.method2548();
		@Pc(59) int local59 = local14.method2548();
		@Pc(63) int local63 = local14.method2548();
		@Pc(67) int local67 = local14.method2548();
		@Pc(71) int local71 = local14.method2548();
		@Pc(75) int local75 = local14.method2548();
		@Pc(79) int local79 = local14.method2498();
		@Pc(83) int local83 = local14.method2498();
		@Pc(87) int local87 = local14.method2498();
		@Pc(91) int local91 = local14.method2498();
		@Pc(100) int local100 = this.anInt2196;
		@Pc(102) int local102 = local100;
		local100 += this.anInt2198;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt2198;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt2198;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt2198;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt2196;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt2198;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt2198 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt2207 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		if (local75 == 1) {
			this.anIntArray200 = new int[this.anInt2196];
		}
		this.aShortArray52 = new short[this.anInt2198];
		if (this.anInt2207 > 0) {
			this.aShortArray45 = new short[this.anInt2207];
			this.aByteArray57 = new byte[this.anInt2207];
			this.aShortArray48 = new short[this.anInt2207];
			this.aShortArray53 = new short[this.anInt2207];
		}
		if (local63 == 255) {
			this.aByteArray51 = new byte[this.anInt2198];
		} else {
			this.aByte18 = (byte) local63;
		}
		this.aShortArray54 = new short[this.anInt2198];
		local14.anInt2637 = 0;
		this.anIntArray201 = new int[this.anInt2196];
		if (local59 == 1) {
			this.aByteArray55 = new byte[this.anInt2198];
			this.aByteArray54 = new byte[this.anInt2198];
			this.aShortArray50 = new short[this.anInt2198];
		}
		this.aShortArray44 = new short[this.anInt2198];
		this.aShortArray55 = new short[this.anInt2198];
		this.anIntArray202 = new int[this.anInt2196];
		if (local67 == 1) {
			this.aByteArray52 = new byte[this.anInt2198];
		}
		this.anIntArray203 = new int[this.anInt2196];
		if (local71 == 1) {
			this.anIntArray199 = new int[this.anInt2198];
		}
		local19.anInt2637 = local189;
		local24.anInt2637 = local195;
		local29.anInt2637 = local100;
		local34.anInt2637 = local141;
		@Pc(338) int local338 = 0;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		@Pc(350) int local350;
		@Pc(352) int local352;
		for (@Pc(344) int local344 = 0; local344 < this.anInt2196; local344++) {
			local350 = local14.method2548();
			local352 = 0;
			if ((local350 & 0x1) != 0) {
				local352 = local19.method2515();
			}
			@Pc(365) int local365 = 0;
			if ((local350 & 0x2) != 0) {
				local365 = local24.method2515();
			}
			@Pc(375) int local375 = 0;
			if ((local350 & 0x4) != 0) {
				local375 = local29.method2515();
			}
			this.anIntArray201[local344] = local352 + local338;
			this.anIntArray202[local344] = local340 + local365;
			this.anIntArray203[local344] = local342 + local375;
			local342 = this.anIntArray203[local344];
			local338 = this.anIntArray201[local344];
			local340 = this.anIntArray202[local344];
			if (local75 == 1) {
				this.anIntArray200[local344] = local34.method2548();
			}
		}
		local14.anInt2637 = local171;
		local19.anInt2637 = local131;
		local24.anInt2637 = local109;
		local29.anInt2637 = local153;
		local34.anInt2637 = local119;
		for (local350 = 0; local350 < this.anInt2198; local350++) {
			this.aShortArray44[local350] = (short) local14.method2498();
			if (local59 == 1) {
				local352 = local19.method2548();
				if ((local352 & 0x1) == 1) {
					this.aByteArray54[local350] = 1;
					local7 = true;
				} else {
					this.aByteArray54[local350] = 0;
				}
				if ((local352 & 0x2) == 2) {
					this.aByteArray55[local350] = (byte) (local352 >> 2);
					this.aShortArray50[local350] = this.aShortArray44[local350];
					this.aShortArray44[local350] = 127;
					if (this.aShortArray50[local350] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray55[local350] = -1;
					this.aShortArray50[local350] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray51[local350] = local24.method2553();
			}
			if (local67 == 1) {
				this.aByteArray52[local350] = local29.method2553();
			}
			if (local71 == 1) {
				this.anIntArray199[local350] = local34.method2548();
			}
		}
		local14.anInt2637 = local165;
		this.anInt2193 = -1;
		local19.anInt2637 = local102;
		@Pc(593) short local593 = 0;
		@Pc(595) short local595 = 0;
		@Pc(597) short local597 = 0;
		@Pc(599) short local599 = 0;
		@Pc(607) int local607;
		for (@Pc(601) int local601 = 0; local601 < this.anInt2198; local601++) {
			local607 = local19.method2548();
			if (local607 == 1) {
				local593 = (short) (local599 + local14.method2515());
				local595 = (short) (local14.method2515() + local593);
				local597 = (short) (local14.method2515() + local595);
				this.aShortArray52[local601] = local593;
				local599 = local597;
				this.aShortArray54[local601] = local595;
				this.aShortArray55[local601] = local597;
				if (this.anInt2193 < local593) {
					this.anInt2193 = local593;
				}
				if (local595 > this.anInt2193) {
					this.anInt2193 = local595;
				}
				if (this.anInt2193 < local597) {
					this.anInt2193 = local597;
				}
			}
			if (local607 == 2) {
				local595 = local597;
				local597 = (short) (local14.method2515() + local599);
				local599 = local597;
				this.aShortArray52[local601] = local593;
				this.aShortArray54[local601] = local595;
				this.aShortArray55[local601] = local597;
				if (local597 > this.anInt2193) {
					this.anInt2193 = local597;
				}
			}
			if (local607 == 3) {
				local593 = local597;
				local597 = (short) (local599 + local14.method2515());
				this.aShortArray52[local601] = local593;
				local599 = local597;
				this.aShortArray54[local601] = local595;
				this.aShortArray55[local601] = local597;
				if (local597 > this.anInt2193) {
					this.anInt2193 = local597;
				}
			}
			if (local607 == 4) {
				@Pc(756) short local756 = local593;
				local593 = local595;
				local595 = local756;
				local597 = (short) (local14.method2515() + local599);
				local599 = local597;
				this.aShortArray52[local601] = local593;
				this.aShortArray54[local601] = local756;
				this.aShortArray55[local601] = local597;
				if (this.anInt2193 < local597) {
					this.anInt2193 = local597;
				}
			}
		}
		local14.anInt2637 = local180;
		this.anInt2193++;
		for (local607 = 0; local607 < this.anInt2207; local607++) {
			this.aByteArray57[local607] = 0;
			this.aShortArray45[local607] = (short) local14.method2498();
			this.aShortArray48[local607] = (short) local14.method2498();
			this.aShortArray53[local607] = (short) local14.method2498();
		}
		if (this.aByteArray55 != null) {
			@Pc(856) boolean local856 = false;
			for (@Pc(858) int local858 = 0; local858 < this.anInt2198; local858++) {
				@Pc(867) int local867 = this.aByteArray55[local858] & 0xFF;
				if (local867 != 255) {
					if ((this.aShortArray45[local867] & 0xFFFF) == this.aShortArray52[local858] && this.aShortArray54[local858] == (this.aShortArray48[local867] & 0xFFFF) && (this.aShortArray53[local867] & 0xFFFF) == this.aShortArray55[local858]) {
						this.aByteArray55[local858] = -1;
					} else {
						local856 = true;
					}
				}
			}
			if (!local856) {
				this.aByteArray55 = null;
			}
		}
		if (!local9) {
			this.aShortArray50 = null;
		}
		if (!local7) {
			this.aByteArray54 = null;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBII)V")
	public void method2186(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt2196; local12++) {
			this.anIntArray201[local12] += arg0;
			this.anIntArray202[local12] += arg2;
			this.anIntArray203[local12] += arg1;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIII)V")
	public void method2187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg1 != 0) {
			local14 = Class14_Sub3_Sub34.anIntArray547[arg1];
			local18 = Class14_Sub3_Sub34.anIntArray546[arg1];
			for (local20 = 0; local20 < this.anInt2196; local20++) {
				local38 = local14 * this.anIntArray202[local20] + this.anIntArray201[local20] * local18 >> 15;
				this.anIntArray202[local20] = this.anIntArray202[local20] * local18 - this.anIntArray201[local20] * local14 >> 15;
				this.anIntArray201[local20] = local38;
			}
		}
		if (arg2 != 0) {
			local14 = Class14_Sub3_Sub34.anIntArray547[arg2];
			local18 = Class14_Sub3_Sub34.anIntArray546[arg2];
			for (local20 = 0; local20 < this.anInt2196; local20++) {
				local38 = local18 * this.anIntArray202[local20] - local14 * this.anIntArray203[local20] >> 15;
				this.anIntArray203[local20] = this.anIntArray202[local20] * local14 + local18 * this.anIntArray203[local20] >> 15;
				this.anIntArray202[local20] = local38;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local14 = Class14_Sub3_Sub34.anIntArray547[arg0];
		local18 = Class14_Sub3_Sub34.anIntArray546[arg0];
		for (local20 = 0; local20 < this.anInt2196; local20++) {
			local38 = this.anIntArray201[local20] * local18 + local14 * this.anIntArray203[local20] >> 15;
			this.anIntArray203[local20] = this.anIntArray203[local20] * local18 - local14 * this.anIntArray201[local20] >> 15;
			this.anIntArray201[local20] = local38;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ISISIBIBB)I")
	public int method2188(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray52[this.anInt2198] = (short) arg0;
		this.aShortArray54[this.anInt2198] = (short) arg3;
		this.aShortArray55[this.anInt2198] = (short) arg5;
		this.aByteArray54[this.anInt2198] = arg4;
		this.aByteArray55[this.anInt2198] = arg6;
		this.aShortArray44[this.anInt2198] = arg2;
		this.aByteArray52[this.anInt2198] = arg7;
		this.aShortArray50[this.anInt2198] = arg1;
		return this.anInt2198++;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(SZS)V")
	public void method2190(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray50 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt2198; local17++) {
			if (arg1 == this.aShortArray50[local17]) {
				this.aShortArray50[local17] = arg0;
			}
		}
	}
}
