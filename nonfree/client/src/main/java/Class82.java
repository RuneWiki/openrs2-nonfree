import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class82 {

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "[S")
	public short[] aShortArray45;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "[Lclient!kh;")
	public Class115[] aClass115Array1;

	@OriginalMember(owner = "client!hf", name = "i", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!hf", name = "j", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!hf", name = "m", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!hf", name = "n", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!hf", name = "v", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!hf", name = "E", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!hf", name = "G", descriptor = "[Lclient!un;")
	public Class206[] aClass206Array1;

	@OriginalMember(owner = "client!hf", name = "I", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!hf", name = "J", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!hf", name = "K", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "[I")
	public int[] anIntArray238;

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "[I")
	public int[] anIntArray239;

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!hf", name = "ab", descriptor = "[I")
	public int[] anIntArray240;

	@OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
	public int anInt2576 = 0;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
	public int anInt2568 = 0;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
	public int anInt2571 = 0;

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "B")
	public byte aByte19 = 0;

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
	public int anInt2569 = 0;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "([B)V")
	public Class82(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2349(arg0);
		} else {
			this.method2347(arg0);
		}
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(III)V")
	public Class82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray48 = new short[arg1];
		this.anIntArray238 = new int[arg0];
		this.anIntArray236 = new int[arg0];
		this.aByteArray49 = new byte[arg1];
		this.aByteArray48 = new byte[arg1];
		this.anIntArray237 = new int[arg0];
		this.aShortArray57 = new short[arg1];
		this.anIntArray240 = new int[arg1];
		this.aByteArray46 = new byte[arg1];
		this.aByteArray41 = new byte[arg1];
		this.aShortArray46 = new short[arg1];
		if (arg2 > 0) {
			this.aShortArray55 = new short[arg2];
			this.aShortArray50 = new short[arg2];
			this.aByteArray42 = new byte[arg2];
			this.aShortArray51 = new short[arg2];
			this.aShortArray53 = new short[arg2];
			this.aByteArray44 = new byte[arg2];
			this.aByteArray45 = new byte[arg2];
			this.aByteArray43 = new byte[arg2];
			this.aShortArray56 = new short[arg2];
			this.aShortArray54 = new short[arg2];
			this.aByteArray40 = new byte[arg2];
			this.aByteArray47 = new byte[arg2];
		}
		this.aShortArray49 = new short[arg1];
		this.aShortArray52 = new short[arg1];
		this.anIntArray239 = new int[arg0];
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "([Lclient!hf;I)V")
	public Class82(@OriginalArg(0) Class82[] arg0, @OriginalArg(1) int arg1) {
		this.anInt2576 = 0;
		this.anInt2568 = 0;
		this.anInt2571 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte19 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class82 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt2568 += local54.anInt2568;
				this.anInt2571 += local54.anInt2571;
				this.anInt2576 += local54.anInt2576;
				local33 |= local54.aByteArray48 != null;
				if (local54.aClass115Array1 != null) {
					local31 += local54.aClass115Array1.length;
				}
				if (local54.aClass206Array1 != null) {
					local29 += local54.aClass206Array1.length;
				}
				local37 |= local54.aByteArray46 != null;
				local46 |= local54.anIntArray240 != null;
				if (local54.aByteArray41 == null) {
					if (this.aByte19 == -1) {
						this.aByte19 = local54.aByte19;
					}
					if (local54.aByte19 != this.aByte19) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local39 |= local54.aByteArray49 != null;
				local41 |= local54.aShortArray48 != null;
			}
		}
		this.aShortArray46 = new short[this.anInt2568];
		if (local35) {
			this.aByteArray41 = new byte[this.anInt2568];
		}
		if (local41) {
			this.aShortArray48 = new short[this.anInt2568];
		}
		this.anIntArray238 = new int[this.anInt2571];
		this.aShortArray45 = new short[this.anInt2571];
		if (local46) {
			this.anIntArray240 = new int[this.anInt2568];
		}
		if (local31 > 0) {
			this.aClass115Array1 = new Class115[local31];
		}
		if (local29 > 0) {
			this.aClass206Array1 = new Class206[local29];
		}
		if (local37) {
			this.aByteArray46 = new byte[this.anInt2568];
		}
		this.anIntArray237 = new int[this.anInt2571];
		this.anIntArray239 = new int[this.anInt2571];
		if (local33) {
			this.aByteArray48 = new byte[this.anInt2568];
		}
		if (local39) {
			this.aByteArray49 = new byte[this.anInt2568];
		}
		this.aShortArray57 = new short[this.anInt2568];
		this.aShortArray49 = new short[this.anInt2568];
		this.aShortArray47 = new short[this.anInt2568];
		this.anIntArray236 = new int[this.anInt2571];
		this.aShortArray52 = new short[this.anInt2568];
		if (this.anInt2576 > 0) {
			this.aByteArray43 = new byte[this.anInt2576];
			this.aByteArray40 = new byte[this.anInt2576];
			this.aByteArray47 = new byte[this.anInt2576];
			this.aByteArray42 = new byte[this.anInt2576];
			this.aShortArray55 = new short[this.anInt2576];
			this.aShortArray51 = new short[this.anInt2576];
			this.aShortArray53 = new short[this.anInt2576];
			this.aByteArray45 = new byte[this.anInt2576];
			this.aShortArray56 = new short[this.anInt2576];
			this.aShortArray50 = new short[this.anInt2576];
			this.aShortArray54 = new short[this.anInt2576];
			this.aByteArray44 = new byte[this.anInt2576];
		}
		this.anInt2576 = 0;
		local31 = 0;
		this.anInt2568 = 0;
		this.anInt2571 = 0;
		local29 = 0;
		@Pc(553) int local553;
		@Pc(564) int local564;
		for (@Pc(352) int local352 = 0; local352 < arg1; local352++) {
			@Pc(359) short local359 = (short) (0x1 << local352);
			@Pc(363) Class82 local363 = arg0[local352];
			if (local363 != null) {
				for (@Pc(367) int local367 = 0; local367 < local363.anInt2568; local367++) {
					if (local33 && local363.aByteArray48 != null) {
						this.aByteArray48[this.anInt2568] = local363.aByteArray48[local367];
					}
					if (local35) {
						if (local363.aByteArray41 == null) {
							this.aByteArray41[this.anInt2568] = local363.aByte19;
						} else {
							this.aByteArray41[this.anInt2568] = local363.aByteArray41[local367];
						}
					}
					if (local37 && local363.aByteArray46 != null) {
						this.aByteArray46[this.anInt2568] = local363.aByteArray46[local367];
					}
					if (local41) {
						if (local363.aShortArray48 == null) {
							this.aShortArray48[this.anInt2568] = -1;
						} else {
							this.aShortArray48[this.anInt2568] = local363.aShortArray48[local367];
						}
					}
					if (local46) {
						if (local363.anIntArray240 == null) {
							this.anIntArray240[this.anInt2568] = -1;
						} else {
							this.anIntArray240[this.anInt2568] = local363.anIntArray240[local367];
						}
					}
					this.aShortArray46[this.anInt2568] = (short) this.method2351(local363.aShortArray46[local367], local363, local359);
					this.aShortArray52[this.anInt2568] = (short) this.method2351(local363.aShortArray52[local367], local363, local359);
					this.aShortArray49[this.anInt2568] = (short) this.method2351(local363.aShortArray49[local367], local363, local359);
					this.aShortArray47[this.anInt2568] = local359;
					this.aShortArray57[this.anInt2568] = local363.aShortArray57[local367];
					this.anInt2568++;
				}
				@Pc(540) int local540;
				if (local363.aClass206Array1 != null) {
					for (local540 = 0; local540 < local363.aClass206Array1.length; local540++) {
						local553 = this.method2351(local363.aClass206Array1[local540].anInt6262, local363, local359);
						local564 = this.method2351(local363.aClass206Array1[local540].anInt6260, local363, local359);
						@Pc(575) int local575 = this.method2351(local363.aClass206Array1[local540].anInt6264, local363, local359);
						this.aClass206Array1[local29] = new Class206(local363.aClass206Array1[local540].anInt6266, local553, local564, local575, local363.aClass206Array1[local540].aByte72);
						local29++;
					}
				}
				if (local363.aClass115Array1 != null) {
					for (local540 = 0; local540 < local363.aClass115Array1.length; local540++) {
						local553 = this.method2351(local363.aClass115Array1[local540].anInt3425, local363, local359);
						this.aClass115Array1[local31] = new Class115(local363.aClass115Array1[local540].anInt3429, local553);
						local31++;
					}
				}
			}
		}
		@Pc(650) int local650 = 0;
		this.anInt2569 = this.anInt2571;
		for (@Pc(656) int local656 = 0; local656 < arg1; local656++) {
			@Pc(663) short local663 = (short) (0x1 << local656);
			@Pc(667) Class82 local667 = arg0[local656];
			if (local667 != null) {
				for (local553 = 0; local553 < local667.anInt2568; local553++) {
					if (local39) {
						this.aByteArray49[local650++] = (byte) (local667.aByteArray49 == null || local667.aByteArray49[local553] == -1 ? -1 : this.anInt2576 + local667.aByteArray49[local553]);
					}
				}
				for (local564 = 0; local564 < local667.anInt2576; local564++) {
					@Pc(723) byte local723 = this.aByteArray42[this.anInt2576] = local667.aByteArray42[local564];
					if (local723 == 0) {
						this.aShortArray54[this.anInt2576] = (short) this.method2351(local667.aShortArray54[local564], local667, local663);
						this.aShortArray55[this.anInt2576] = (short) this.method2351(local667.aShortArray55[local564], local667, local663);
						this.aShortArray53[this.anInt2576] = (short) this.method2351(local667.aShortArray53[local564], local667, local663);
					}
					if (local723 >= 1 && local723 <= 3) {
						this.aShortArray54[this.anInt2576] = local667.aShortArray54[local564];
						this.aShortArray55[this.anInt2576] = local667.aShortArray55[local564];
						this.aShortArray53[this.anInt2576] = local667.aShortArray53[local564];
						this.aShortArray56[this.anInt2576] = local667.aShortArray56[local564];
						this.aShortArray50[this.anInt2576] = local667.aShortArray50[local564];
						this.aShortArray51[this.anInt2576] = local667.aShortArray51[local564];
						this.aByteArray45[this.anInt2576] = local667.aByteArray45[local564];
						this.aByteArray43[this.anInt2576] = local667.aByteArray43[local564];
						this.aByteArray40[this.anInt2576] = local667.aByteArray40[local564];
					}
					if (local723 == 2) {
						this.aByteArray44[this.anInt2576] = local667.aByteArray44[local564];
						this.aByteArray47[this.anInt2576] = local667.aByteArray47[local564];
					}
					this.anInt2576++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(SSI)V")
	public void method2345(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2568; local11++) {
			if (arg0 == this.aShortArray57[local11]) {
				this.aShortArray57[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
	public void method2346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg1 != 0) {
			local10 = Class1_Sub3_Sub8.anIntArray159[arg1];
			local14 = Class1_Sub3_Sub8.anIntArray156[arg1];
			for (local16 = 0; local16 < this.anInt2571; local16++) {
				local34 = local10 * this.anIntArray237[local16] + local14 * this.anIntArray238[local16] >> 15;
				this.anIntArray237[local16] = this.anIntArray237[local16] * local14 - local10 * this.anIntArray238[local16] >> 15;
				this.anIntArray238[local16] = local34;
			}
		}
		if (arg2 != 0) {
			local10 = Class1_Sub3_Sub8.anIntArray159[arg2];
			local14 = Class1_Sub3_Sub8.anIntArray156[arg2];
			for (local16 = 0; local16 < this.anInt2571; local16++) {
				local34 = local14 * this.anIntArray237[local16] - local10 * this.anIntArray239[local16] >> 15;
				this.anIntArray239[local16] = this.anIntArray239[local16] * local14 + local10 * this.anIntArray237[local16] >> 15;
				this.anIntArray237[local16] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class1_Sub3_Sub8.anIntArray159[arg0];
		local14 = Class1_Sub3_Sub8.anIntArray156[arg0];
		for (local16 = 0; local16 < this.anInt2571; local16++) {
			local34 = this.anIntArray239[local16] * local10 + this.anIntArray238[local16] * local14 >> 15;
			this.anIntArray239[local16] = this.anIntArray239[local16] * local14 - local10 * this.anIntArray238[local16] >> 15;
			this.anIntArray238[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([BB)V")
	private void method2347(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub8 local14 = new Class1_Sub8(arg0);
		@Pc(19) Class1_Sub8 local19 = new Class1_Sub8(arg0);
		@Pc(24) Class1_Sub8 local24 = new Class1_Sub8(arg0);
		@Pc(29) Class1_Sub8 local29 = new Class1_Sub8(arg0);
		@Pc(34) Class1_Sub8 local34 = new Class1_Sub8(arg0);
		local14.anInt5182 = arg0.length - 18;
		this.anInt2571 = local14.method4556();
		this.anInt2568 = local14.method4556();
		this.anInt2576 = local14.method4532();
		@Pc(59) int local59 = local14.method4532();
		@Pc(63) int local63 = local14.method4532();
		@Pc(67) int local67 = local14.method4532();
		@Pc(71) int local71 = local14.method4532();
		@Pc(75) int local75 = local14.method4532();
		@Pc(79) int local79 = local14.method4556();
		@Pc(83) int local83 = local14.method4556();
		@Pc(87) int local87 = local14.method4556();
		@Pc(91) int local91 = local14.method4556();
		@Pc(100) int local100 = this.anInt2571;
		@Pc(102) int local102 = local100;
		local100 += this.anInt2568;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt2568;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt2568;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt2568;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt2571;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt2568;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt2568 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt2576 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		if (local67 == 1) {
			this.aByteArray46 = new byte[this.anInt2568];
		}
		this.aShortArray46 = new short[this.anInt2568];
		if (local63 == 255) {
			this.aByteArray41 = new byte[this.anInt2568];
		} else {
			this.aByte19 = (byte) local63;
		}
		this.anIntArray238 = new int[this.anInt2571];
		local14.anInt5182 = 0;
		if (this.anInt2576 > 0) {
			this.aByteArray42 = new byte[this.anInt2576];
			this.aShortArray55 = new short[this.anInt2576];
			this.aShortArray54 = new short[this.anInt2576];
			this.aShortArray53 = new short[this.anInt2576];
		}
		if (local59 == 1) {
			this.aShortArray48 = new short[this.anInt2568];
			this.aByteArray49 = new byte[this.anInt2568];
			this.aByteArray48 = new byte[this.anInt2568];
		}
		this.anIntArray239 = new int[this.anInt2571];
		if (local71 == 1) {
			this.anIntArray240 = new int[this.anInt2568];
		}
		if (local75 == 1) {
			this.anIntArray236 = new int[this.anInt2571];
		}
		this.anIntArray237 = new int[this.anInt2571];
		this.aShortArray57 = new short[this.anInt2568];
		this.aShortArray52 = new short[this.anInt2568];
		this.aShortArray49 = new short[this.anInt2568];
		local19.anInt5182 = local187;
		local24.anInt5182 = local193;
		local29.anInt5182 = local100;
		local34.anInt5182 = local143;
		@Pc(351) int local351 = 0;
		@Pc(353) int local353 = 0;
		@Pc(355) int local355 = 0;
		@Pc(363) int local363;
		@Pc(365) int local365;
		for (@Pc(357) int local357 = 0; local357 < this.anInt2571; local357++) {
			local363 = local14.method4532();
			local365 = 0;
			if ((local363 & 0x1) != 0) {
				local365 = local19.method4522();
			}
			@Pc(378) int local378 = 0;
			if ((local363 & 0x2) != 0) {
				local378 = local24.method4522();
			}
			@Pc(391) int local391 = 0;
			if ((local363 & 0x4) != 0) {
				local391 = local29.method4522();
			}
			this.anIntArray238[local357] = local351 + local365;
			this.anIntArray237[local357] = local378 + local353;
			this.anIntArray239[local357] = local355 + local391;
			local351 = this.anIntArray238[local357];
			local353 = this.anIntArray237[local357];
			local355 = this.anIntArray239[local357];
			if (local75 == 1) {
				this.anIntArray236[local357] = local34.method4532();
			}
		}
		local14.anInt5182 = local169;
		local19.anInt5182 = local133;
		local24.anInt5182 = local109;
		local29.anInt5182 = local153;
		local34.anInt5182 = local121;
		for (local363 = 0; local363 < this.anInt2568; local363++) {
			this.aShortArray57[local363] = (short) local14.method4556();
			if (local59 == 1) {
				local365 = local19.method4532();
				if ((local365 & 0x1) == 1) {
					local7 = true;
					this.aByteArray48[local363] = 1;
				} else {
					this.aByteArray48[local363] = 0;
				}
				if ((local365 & 0x2) == 2) {
					this.aByteArray49[local363] = (byte) (local365 >> 2);
					this.aShortArray48[local363] = this.aShortArray57[local363];
					this.aShortArray57[local363] = 127;
					if (this.aShortArray48[local363] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray49[local363] = -1;
					this.aShortArray48[local363] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray41[local363] = local24.method4558();
			}
			if (local67 == 1) {
				this.aByteArray46[local363] = local29.method4558();
			}
			if (local71 == 1) {
				this.anIntArray240[local363] = local34.method4532();
			}
		}
		this.anInt2569 = -1;
		local14.anInt5182 = local163;
		local19.anInt5182 = local102;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(613) short local613 = 0;
		@Pc(621) int local621;
		for (@Pc(615) int local615 = 0; local615 < this.anInt2568; local615++) {
			local621 = local19.method4532();
			if (local621 == 1) {
				local607 = (short) (local613 + local14.method4522());
				local609 = (short) (local607 + local14.method4522());
				local611 = (short) (local609 + local14.method4522());
				local613 = local611;
				this.aShortArray46[local615] = local607;
				this.aShortArray52[local615] = local609;
				this.aShortArray49[local615] = local611;
				if (local607 > this.anInt2569) {
					this.anInt2569 = local607;
				}
				if (local609 > this.anInt2569) {
					this.anInt2569 = local609;
				}
				if (local611 > this.anInt2569) {
					this.anInt2569 = local611;
				}
			}
			if (local621 == 2) {
				local609 = local611;
				local611 = (short) (local14.method4522() + local613);
				this.aShortArray46[local615] = local607;
				local613 = local611;
				this.aShortArray52[local615] = local609;
				this.aShortArray49[local615] = local611;
				if (this.anInt2569 < local611) {
					this.anInt2569 = local611;
				}
			}
			if (local621 == 3) {
				local607 = local611;
				local611 = (short) (local613 + local14.method4522());
				local613 = local611;
				this.aShortArray46[local615] = local607;
				this.aShortArray52[local615] = local609;
				this.aShortArray49[local615] = local611;
				if (local611 > this.anInt2569) {
					this.anInt2569 = local611;
				}
			}
			if (local621 == 4) {
				@Pc(774) short local774 = local607;
				local607 = local609;
				local611 = (short) (local613 + local14.method4522());
				local609 = local774;
				this.aShortArray46[local615] = local607;
				local613 = local611;
				this.aShortArray52[local615] = local774;
				this.aShortArray49[local615] = local611;
				if (local611 > this.anInt2569) {
					this.anInt2569 = local611;
				}
			}
		}
		this.anInt2569++;
		local14.anInt5182 = local178;
		for (local621 = 0; local621 < this.anInt2576; local621++) {
			this.aByteArray42[local621] = 0;
			this.aShortArray54[local621] = (short) local14.method4556();
			this.aShortArray55[local621] = (short) local14.method4556();
			this.aShortArray53[local621] = (short) local14.method4556();
		}
		if (this.aByteArray49 != null) {
			@Pc(874) boolean local874 = false;
			for (@Pc(876) int local876 = 0; local876 < this.anInt2568; local876++) {
				@Pc(885) int local885 = this.aByteArray49[local876] & 0xFF;
				if (local885 != 255) {
					if ((this.aShortArray54[local885] & 0xFFFF) == this.aShortArray46[local876] && (this.aShortArray55[local885] & 0xFFFF) == this.aShortArray52[local876] && this.aShortArray49[local876] == (this.aShortArray53[local885] & 0xFFFF)) {
						this.aByteArray49[local876] = -1;
					} else {
						local874 = true;
					}
				}
			}
			if (!local874) {
				this.aByteArray49 = null;
			}
		}
		if (!local9) {
			this.aShortArray48 = null;
		}
		if (!local7) {
			this.aByteArray48 = null;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BSBSSSSBSB)B")
	public byte method2348() {
		if (this.anInt2576 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray42[this.anInt2576] = 3;
		this.aShortArray54[this.anInt2576] = 0;
		this.aShortArray55[this.anInt2576] = 32767;
		this.aShortArray53[this.anInt2576] = 0;
		this.aShortArray56[this.anInt2576] = 1024;
		this.aShortArray50[this.anInt2576] = 1024;
		this.aShortArray51[this.anInt2576] = 1024;
		this.aByteArray45[this.anInt2576] = 0;
		this.aByteArray43[this.anInt2576] = 0;
		this.aByteArray40[this.anInt2576] = 0;
		return (byte) this.anInt2576++;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z[B)V")
	private void method2349(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub8 local10 = new Class1_Sub8(arg0);
		@Pc(15) Class1_Sub8 local15 = new Class1_Sub8(arg0);
		@Pc(20) Class1_Sub8 local20 = new Class1_Sub8(arg0);
		@Pc(25) Class1_Sub8 local25 = new Class1_Sub8(arg0);
		@Pc(30) Class1_Sub8 local30 = new Class1_Sub8(arg0);
		@Pc(35) Class1_Sub8 local35 = new Class1_Sub8(arg0);
		@Pc(40) Class1_Sub8 local40 = new Class1_Sub8(arg0);
		local10.anInt5182 = arg0.length - 23;
		this.anInt2571 = local10.method4556();
		this.anInt2568 = local10.method4556();
		this.anInt2576 = local10.method4532();
		@Pc(65) int local65 = local10.method4532();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(87) boolean local87 = (local65 & 0x2) == 2;
		@Pc(91) int local91 = local10.method4532();
		@Pc(95) int local95 = local10.method4532();
		@Pc(99) int local99 = local10.method4532();
		@Pc(103) int local103 = local10.method4532();
		@Pc(107) int local107 = local10.method4532();
		@Pc(111) int local111 = local10.method4556();
		@Pc(115) int local115 = local10.method4556();
		@Pc(119) int local119 = local10.method4556();
		@Pc(123) int local123 = local10.method4556();
		@Pc(127) int local127 = local10.method4556();
		@Pc(129) int local129 = 0;
		@Pc(131) int local131 = 0;
		@Pc(133) int local133 = 0;
		@Pc(146) int local146;
		if (this.anInt2576 > 0) {
			this.aByteArray42 = new byte[this.anInt2576];
			local10.anInt5182 = 0;
			for (local146 = 0; local146 < this.anInt2576; local146++) {
				@Pc(157) byte local157 = this.aByteArray42[local146] = local10.method4558();
				if (local157 >= 1 && local157 <= 3) {
					local131++;
				}
				if (local157 == 0) {
					local129++;
				}
				if (local157 == 2) {
					local133++;
				}
			}
		}
		local146 = this.anInt2576;
		@Pc(189) int local189 = local146;
		local146 += this.anInt2571;
		@Pc(196) int local196 = local146;
		if (local76) {
			local146 += this.anInt2568;
		}
		@Pc(205) int local205 = local146;
		local146 += this.anInt2568;
		@Pc(212) int local212 = local146;
		if (local91 == 255) {
			local146 += this.anInt2568;
		}
		@Pc(232) int local232 = local146;
		if (local99 == 1) {
			local146 += this.anInt2568;
		}
		@Pc(242) int local242 = local146;
		if (local107 == 1) {
			local146 += this.anInt2571;
		}
		@Pc(254) int local254 = local146;
		if (local95 == 1) {
			local146 += this.anInt2568;
		}
		@Pc(264) int local264 = local146;
		local146 += local123;
		@Pc(270) int local270 = local146;
		if (local103 == 1) {
			local146 += this.anInt2568 * 2;
		}
		@Pc(284) int local284 = local146;
		local146 += local127;
		@Pc(290) int local290 = local146;
		local146 += this.anInt2568 * 2;
		@Pc(299) int local299 = local146;
		local146 += local111;
		@Pc(305) int local305 = local146;
		local146 += local115;
		@Pc(311) int local311 = local146;
		local146 += local119;
		@Pc(317) int local317 = local146;
		local146 += local129 * 6;
		@Pc(325) int local325 = local146;
		local146 += local131 * 6;
		@Pc(333) int local333 = local146;
		local146 += local131 * 6;
		@Pc(341) int local341 = local146;
		local146 += local131;
		@Pc(347) int local347 = local146;
		local146 += local131;
		@Pc(353) int local353 = local146;
		local146 += local131 + local133 * 2;
		this.anIntArray237 = new int[this.anInt2571];
		this.aShortArray46 = new short[this.anInt2568];
		this.aShortArray57 = new short[this.anInt2568];
		if (local107 == 1) {
			this.anIntArray236 = new int[this.anInt2571];
		}
		if (local91 == 255) {
			this.aByteArray41 = new byte[this.anInt2568];
		} else {
			this.aByte19 = (byte) local91;
		}
		this.anIntArray238 = new int[this.anInt2571];
		if (local95 == 1) {
			this.aByteArray46 = new byte[this.anInt2568];
		}
		if (local103 == 1 && this.anInt2576 > 0) {
			this.aByteArray49 = new byte[this.anInt2568];
		}
		if (local103 == 1) {
			this.aShortArray48 = new short[this.anInt2568];
		}
		this.aShortArray52 = new short[this.anInt2568];
		local10.anInt5182 = local189;
		this.anIntArray239 = new int[this.anInt2571];
		if (local99 == 1) {
			this.anIntArray240 = new int[this.anInt2568];
		}
		if (local76) {
			this.aByteArray48 = new byte[this.anInt2568];
		}
		this.aShortArray49 = new short[this.anInt2568];
		if (this.anInt2576 > 0) {
			if (local131 > 0) {
				this.aByteArray43 = new byte[local131];
				this.aByteArray45 = new byte[local131];
				this.aShortArray51 = new short[local131];
				this.aShortArray56 = new short[local131];
				this.aByteArray40 = new byte[local131];
				this.aShortArray50 = new short[local131];
			}
			this.aShortArray53 = new short[this.anInt2576];
			if (local133 > 0) {
				this.aByteArray47 = new byte[local133];
				this.aByteArray44 = new byte[local133];
			}
			this.aShortArray55 = new short[this.anInt2576];
			this.aShortArray54 = new short[this.anInt2576];
		}
		local15.anInt5182 = local299;
		local20.anInt5182 = local305;
		local25.anInt5182 = local311;
		local30.anInt5182 = local242;
		@Pc(556) int local556 = 0;
		@Pc(558) int local558 = 0;
		@Pc(560) int local560 = 0;
		@Pc(568) int local568;
		for (@Pc(562) int local562 = 0; local562 < this.anInt2571; local562++) {
			local568 = local10.method4532();
			@Pc(570) int local570 = 0;
			if ((local568 & 0x1) != 0) {
				local570 = local15.method4522();
			}
			@Pc(584) int local584 = 0;
			if ((local568 & 0x2) != 0) {
				local584 = local20.method4522();
			}
			@Pc(601) int local601 = 0;
			if ((local568 & 0x4) != 0) {
				local601 = local25.method4522();
			}
			this.anIntArray238[local562] = local570 + local556;
			this.anIntArray237[local562] = local558 + local584;
			this.anIntArray239[local562] = local601 + local560;
			local560 = this.anIntArray239[local562];
			local556 = this.anIntArray238[local562];
			local558 = this.anIntArray237[local562];
			if (local107 == 1) {
				this.anIntArray236[local562] = local30.method4532();
			}
		}
		local10.anInt5182 = local290;
		local15.anInt5182 = local196;
		local20.anInt5182 = local212;
		local25.anInt5182 = local254;
		local30.anInt5182 = local232;
		local35.anInt5182 = local270;
		local40.anInt5182 = local284;
		for (local568 = 0; local568 < this.anInt2568; local568++) {
			this.aShortArray57[local568] = (short) local10.method4556();
			if (local76) {
				this.aByteArray48[local568] = local15.method4558();
			}
			if (local91 == 255) {
				this.aByteArray41[local568] = local20.method4558();
			}
			if (local95 == 1) {
				this.aByteArray46[local568] = local25.method4558();
			}
			if (local99 == 1) {
				this.anIntArray240[local568] = local30.method4532();
			}
			if (local103 == 1) {
				this.aShortArray48[local568] = (short) (local35.method4556() - 1);
			}
			if (this.aByteArray49 != null) {
				if (this.aShortArray48[local568] == -1) {
					this.aByteArray49[local568] = -1;
				} else {
					this.aByteArray49[local568] = (byte) (local40.method4532() - 1);
				}
			}
		}
		local10.anInt5182 = local264;
		this.anInt2569 = -1;
		local15.anInt5182 = local205;
		@Pc(802) short local802 = 0;
		@Pc(804) short local804 = 0;
		@Pc(806) short local806 = 0;
		@Pc(808) short local808 = 0;
		@Pc(816) int local816;
		for (@Pc(810) int local810 = 0; local810 < this.anInt2568; local810++) {
			local816 = local15.method4532();
			if (local816 == 1) {
				local802 = (short) (local808 + local10.method4522());
				local804 = (short) (local10.method4522() + local802);
				local806 = (short) (local10.method4522() + local804);
				local808 = local806;
				this.aShortArray46[local810] = local802;
				this.aShortArray52[local810] = local804;
				this.aShortArray49[local810] = local806;
				if (local802 > this.anInt2569) {
					this.anInt2569 = local802;
				}
				if (this.anInt2569 < local804) {
					this.anInt2569 = local804;
				}
				if (this.anInt2569 < local806) {
					this.anInt2569 = local806;
				}
			}
			if (local816 == 2) {
				local804 = local806;
				local806 = (short) (local808 + local10.method4522());
				local808 = local806;
				this.aShortArray46[local810] = local802;
				this.aShortArray52[local810] = local804;
				this.aShortArray49[local810] = local806;
				if (local806 > this.anInt2569) {
					this.anInt2569 = local806;
				}
			}
			if (local816 == 3) {
				local802 = local806;
				local806 = (short) (local808 + local10.method4522());
				this.aShortArray46[local810] = local802;
				local808 = local806;
				this.aShortArray52[local810] = local804;
				this.aShortArray49[local810] = local806;
				if (this.anInt2569 < local806) {
					this.anInt2569 = local806;
				}
			}
			if (local816 == 4) {
				@Pc(971) short local971 = local802;
				local802 = local804;
				local804 = local971;
				local806 = (short) (local10.method4522() + local808);
				local808 = local806;
				this.aShortArray46[local810] = local802;
				this.aShortArray52[local810] = local971;
				this.aShortArray49[local810] = local806;
				if (this.anInt2569 < local806) {
					this.anInt2569 = local806;
				}
			}
		}
		this.anInt2569++;
		local10.anInt5182 = local317;
		local15.anInt5182 = local325;
		local20.anInt5182 = local333;
		local25.anInt5182 = local341;
		local30.anInt5182 = local347;
		local35.anInt5182 = local353;
		@Pc(1050) int local1050;
		for (local816 = 0; local816 < this.anInt2576; local816++) {
			local1050 = this.aByteArray42[local816] & 0xFF;
			if (local1050 == 0) {
				this.aShortArray54[local816] = (short) local10.method4556();
				this.aShortArray55[local816] = (short) local10.method4556();
				this.aShortArray53[local816] = (short) local10.method4556();
			}
			if (local1050 == 1) {
				this.aShortArray54[local816] = (short) local15.method4556();
				this.aShortArray55[local816] = (short) local15.method4556();
				this.aShortArray53[local816] = (short) local15.method4556();
				this.aShortArray56[local816] = (short) local20.method4556();
				this.aShortArray50[local816] = (short) local20.method4556();
				this.aShortArray51[local816] = (short) local20.method4556();
				this.aByteArray45[local816] = local25.method4558();
				this.aByteArray43[local816] = local30.method4558();
				this.aByteArray40[local816] = local35.method4558();
			}
			if (local1050 == 2) {
				this.aShortArray54[local816] = (short) local15.method4556();
				this.aShortArray55[local816] = (short) local15.method4556();
				this.aShortArray53[local816] = (short) local15.method4556();
				this.aShortArray56[local816] = (short) local20.method4556();
				this.aShortArray50[local816] = (short) local20.method4556();
				this.aShortArray51[local816] = (short) local20.method4556();
				this.aByteArray45[local816] = local25.method4558();
				this.aByteArray43[local816] = local30.method4558();
				this.aByteArray40[local816] = local35.method4558();
				this.aByteArray44[local816] = local35.method4558();
				this.aByteArray47[local816] = local35.method4558();
			}
			if (local1050 == 3) {
				this.aShortArray54[local816] = (short) local15.method4556();
				this.aShortArray55[local816] = (short) local15.method4556();
				this.aShortArray53[local816] = (short) local15.method4556();
				this.aShortArray56[local816] = (short) local20.method4556();
				this.aShortArray50[local816] = (short) local20.method4556();
				this.aShortArray51[local816] = (short) local20.method4556();
				this.aByteArray45[local816] = local25.method4558();
				this.aByteArray43[local816] = local30.method4558();
				this.aByteArray40[local816] = local35.method4558();
			}
		}
		if (!local87) {
			return;
		}
		local10.anInt5182 = local146;
		local1050 = local10.method4532();
		@Pc(1334) int local1334;
		@Pc(1340) int local1340;
		if (local1050 > 0) {
			this.aClass206Array1 = new Class206[local1050];
			for (local1334 = 0; local1334 < local1050; local1334++) {
				local1340 = local10.method4556();
				@Pc(1344) int local1344 = local10.method4556();
				@Pc(1350) byte local1350;
				if (local91 == 255) {
					local1350 = this.aByteArray41[local1344];
				} else {
					local1350 = (byte) local91;
				}
				this.aClass206Array1[local1334] = new Class206(local1340, this.aShortArray46[local1344], this.aShortArray52[local1344], this.aShortArray49[local1344], local1350);
			}
		}
		local1334 = local10.method4532();
		if (local1334 <= 0) {
			return;
		}
		this.aClass115Array1 = new Class115[local1334];
		for (local1340 = 0; local1340 < local1334; local1340++) {
			this.aClass115Array1[local1340] = new Class115(local10.method4556(), local10.method4556());
		}
		return;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)[[I")
	public int[][] method2350() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2568; local12++) {
			@Pc(19) int local19 = this.anIntArray240[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(30) int local30 = local8[local19]++;
			}
		}
		@Pc(43) int[][] local43 = new int[local10 + 1][];
		for (@Pc(45) int local45 = 0; local45 <= local10; local45++) {
			local43[local45] = new int[local8[local45]];
			local8[local45] = 0;
		}
		for (@Pc(68) int local68 = 0; local68 < this.anInt2568; local68++) {
			@Pc(75) int local75 = this.anIntArray240[local68];
			if (local75 >= 0) {
				local43[local75][local8[local75]++] = local68;
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!hf;SB)I")
	private int method2351(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray238[arg0];
		@Pc(15) int local15 = arg1.anIntArray237[arg0];
		@Pc(20) int local20 = arg1.anIntArray239[arg0];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2571; local27++) {
			if (this.anIntArray238[local27] == local10 && this.anIntArray237[local27] == local15 && local20 == this.anIntArray239[local27]) {
				this.aShortArray45[local27] |= arg2;
				return local27;
			}
		}
		this.anIntArray238[this.anInt2571] = local10;
		this.anIntArray237[this.anInt2571] = local15;
		this.anIntArray239[this.anInt2571] = local20;
		this.aShortArray45[this.anInt2571] = arg2;
		this.anIntArray236[this.anInt2571] = arg1.anIntArray236 == null ? -1 : arg1.anIntArray236[arg0];
		return this.anInt2571++;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(SBS)V")
	public void method2353(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray48 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < this.anInt2568; local19++) {
			if (arg0 == this.aShortArray48[local19]) {
				this.aShortArray48[local19] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)[[I")
	public int[][] method2356() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2569; local12++) {
			@Pc(19) int local19 = this.anIntArray236[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
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
		for (@Pc(83) int local83 = 0; local83 < this.anInt2569; local83++) {
			@Pc(90) int local90 = this.anIntArray236[local83];
			if (local90 >= 0) {
				local50[local90][local8[local90]++] = local83;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BBIIBSISI)I")
	public int method2358(@OriginalArg(0) byte arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) short arg4, @OriginalArg(6) int arg5, @OriginalArg(7) short arg6, @OriginalArg(8) int arg7) {
		this.aShortArray46[this.anInt2568] = (short) arg2;
		this.aShortArray52[this.anInt2568] = (short) arg7;
		this.aShortArray49[this.anInt2568] = (short) arg5;
		this.aByteArray48[this.anInt2568] = arg1;
		this.aByteArray49[this.anInt2568] = arg3;
		this.aShortArray57[this.anInt2568] = arg6;
		this.aByteArray46[this.anInt2568] = arg0;
		this.aShortArray48[this.anInt2568] = arg4;
		return this.anInt2568++;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)I")
	public int method2360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2571; local7++) {
			if (this.anIntArray238[local7] == arg1 && this.anIntArray237[local7] == arg2 && arg0 == this.anIntArray239[local7]) {
				return local7;
			}
		}
		this.anIntArray238[this.anInt2571] = arg1;
		this.anIntArray237[this.anInt2571] = arg2;
		this.anIntArray239[this.anInt2571] = arg0;
		this.anInt2569 = this.anInt2571 + 1;
		return this.anInt2571++;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(IIII)V")
	public void method2361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2571; local3++) {
			this.anIntArray238[local3] += arg0;
			this.anIntArray237[local3] += arg1;
			this.anIntArray239[local3] += arg2;
		}
	}
}
