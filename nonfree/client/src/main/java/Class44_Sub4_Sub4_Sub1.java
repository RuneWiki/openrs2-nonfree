import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class44_Sub4_Sub4_Sub1 extends Class44_Sub4_Sub4 {

	@OriginalMember(owner = "client!qo", name = "Zc", descriptor = "I")
	private int anInt4899;

	@OriginalMember(owner = "client!qo", name = "ed", descriptor = "Ljava/lang/String;")
	public String aString206;

	@OriginalMember(owner = "client!qo", name = "jd", descriptor = "Ljava/lang/String;")
	public String aString207;

	@OriginalMember(owner = "client!qo", name = "pd", descriptor = "Lclient!bn;")
	public Class21 aClass21_2;

	@OriginalMember(owner = "client!qo", name = "Qc", descriptor = "I")
	public int anInt4890 = -1;

	@OriginalMember(owner = "client!qo", name = "Xc", descriptor = "I")
	public int anInt4897 = -1;

	@OriginalMember(owner = "client!qo", name = "fd", descriptor = "I")
	public int anInt4904 = 0;

	@OriginalMember(owner = "client!qo", name = "Rc", descriptor = "I")
	public int anInt4891 = -1;

	@OriginalMember(owner = "client!qo", name = "ld", descriptor = "B")
	private byte aByte70 = 0;

	@OriginalMember(owner = "client!qo", name = "Yc", descriptor = "I")
	public int anInt4898 = -1;

	@OriginalMember(owner = "client!qo", name = "Sc", descriptor = "I")
	public int anInt4892 = -1;

	@OriginalMember(owner = "client!qo", name = "id", descriptor = "I")
	public int anInt4907 = 0;

	@OriginalMember(owner = "client!qo", name = "wd", descriptor = "I")
	public int anInt4917 = -1;

	@OriginalMember(owner = "client!qo", name = "kd", descriptor = "I")
	public int anInt4908 = -1;

	@OriginalMember(owner = "client!qo", name = "Pc", descriptor = "Z")
	public boolean aBoolean347 = false;

	@OriginalMember(owner = "client!qo", name = "xd", descriptor = "I")
	public int anInt4918 = 0;

	@OriginalMember(owner = "client!qo", name = "zd", descriptor = "I")
	public int anInt4920 = 0;

	@OriginalMember(owner = "client!qo", name = "vd", descriptor = "I")
	public int anInt4916 = 255;

	@OriginalMember(owner = "client!qo", name = "ud", descriptor = "I")
	public int anInt4915 = 0;

	@OriginalMember(owner = "client!qo", name = "Dd", descriptor = "B")
	private byte aByte71 = 0;

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "(I)Z")
	public boolean method4476() {
		return this.aClass21_2 != null;
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(B)I")
	@Override
	public int method4714() {
		return this.aClass21_2 == null || this.aClass21_2.anInt552 == -1 ? super.method4714() : Static162.method3235(this.aClass21_2.anInt552).anInt409;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5783() {
		return false;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIZII)V")
	public void method4477(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		super.method4708(arg0, this.method4714(), arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ec;I)V")
	public void method4478(@OriginalArg(0) Class6_Sub10 arg0) {
		arg0.anInt4188 = 0;
		@Pc(12) int local12 = arg0.method3972();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(24) boolean local24 = (local12 & 0x2) != 0;
		@Pc(32) boolean local32 = (local12 & 0x4) != 0;
		@Pc(36) int local36 = super.method4714();
		this.method4712((local12 >> 3 & 0x7) + 1);
		this.aByte70 = (byte) (local12 >> 6 & 0x3);
		super.anInt6340 += (this.method4714() - local36) * 64;
		super.anInt6339 += (this.method4714() - local36) * 64;
		this.aByte71 = arg0.method3992();
		this.anInt4892 = arg0.method3992();
		this.anInt4897 = arg0.method3992();
		this.anInt4918 = 0;
		@Pc(100) int local100 = -1;
		@Pc(103) int[] local103 = new int[12];
		@Pc(123) int local123;
		@Pc(129) int local129;
		@Pc(169) int local169;
		for (@Pc(105) int local105 = 0; local105 < 12; local105++) {
			@Pc(111) int local111 = arg0.method3972();
			if (local111 == 0) {
				local103[local105] = 0;
			} else {
				local123 = arg0.method3972();
				local129 = (local111 << 8) + local123;
				if (local105 == 0 && local129 == 65535) {
					local100 = arg0.method4021();
					this.anInt4918 = arg0.method3972();
					break;
				}
				if (local129 >= 32768) {
					local129 = Static150.anIntArray347[local129 - 32768];
					local103[local105] = local129 | 0x40000000;
					local169 = Static211.method3762(local129).anInt3955;
					if (local169 != 0) {
						this.anInt4918 = local169;
					}
				} else {
					local103[local105] = local129 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(193) int[] local193 = new int[5];
		for (local123 = 0; local123 < 5; local123++) {
			local129 = arg0.method3972();
			if (local129 < 0 || local129 >= Static263.aShortArrayArray46[local123].length) {
				local129 = 0;
			}
			local193[local123] = local129;
		}
		this.anInt4899 = arg0.method4021();
		this.aString206 = arg0.method4023();
		if (local24) {
			this.aString207 = arg0.method4023();
		} else {
			this.aString207 = this.aString206;
		}
		this.anInt4907 = arg0.method3972();
		if (local32) {
			this.anInt4920 = arg0.method4021();
			this.anInt4898 = -1;
			this.anInt4915 = this.anInt4907;
		} else {
			this.anInt4920 = 0;
			this.anInt4915 = arg0.method3972();
			this.anInt4898 = arg0.method3972();
			if (this.anInt4898 == 255) {
				this.anInt4898 = -1;
			}
		}
		local129 = this.anInt4904;
		this.anInt4904 = arg0.method3972();
		@Pc(314) int local314;
		if (this.anInt4904 == 0) {
			Static285.method4910(this);
		} else {
			local169 = this.anInt4908;
			@Pc(311) int local311 = this.anInt4917;
			local314 = this.anInt4891;
			@Pc(317) int local317 = this.anInt4890;
			@Pc(320) int local320 = this.anInt4916;
			this.anInt4908 = arg0.method4021();
			this.anInt4917 = arg0.method4021();
			this.anInt4891 = arg0.method4021();
			this.anInt4890 = arg0.method4021();
			this.anInt4916 = arg0.method3972();
			if (local129 != this.anInt4904 || this.anInt4908 != local169 || local311 != this.anInt4917 || local314 != this.anInt4891 || local317 != this.anInt4890 || this.anInt4916 != local320) {
				Static9.method168(this);
			}
		}
		if (this.aClass21_2 == null) {
			this.aClass21_2 = new Class21();
		}
		local169 = this.aClass21_2.anInt552;
		@Pc(394) int[] local394 = this.aClass21_2.anIntArray61;
		this.aClass21_2.method469(local100, this.method4718(), local193, local16 == 1, local103);
		if (local100 != local169) {
			super.anInt6340 = super.anIntArray560[0] * 128 + this.method4714() * 64;
			super.anInt6339 = super.anIntArray561[0] * 128 + this.method4714() * 64;
		}
		if (super.anInt5127 == 2047 && local394 != null) {
			for (local314 = 0; local314 < local193.length; local314++) {
				if (local394[local314] != local193[local314]) {
					Static198.method3625();
					break;
				}
			}
		}
		if (super.aClass20_Sub2_7 != null) {
			super.aClass20_Sub2_7.method450();
		}
		if (super.anInt5116 == -1 || !super.aBoolean358) {
			return;
		}
		@Pc(495) Class128 local495 = this.method4716();
		if (!local495.method3459(super.anInt5116)) {
			super.anInt5116 = -1;
			super.aBoolean358 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IBZIILclient!nf;Lclient!ja;)V")
	@Override
	public void method5780(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class44 arg4, @OriginalArg(6) Class81 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)Ljava/lang/String;")
	public String method4480() {
		@Pc(13) String local13 = "";
		if (Static161.aStringArray19 != null) {
			local13 = local13 + Static161.aStringArray19[this.aByte70];
		}
		if (Static119.anIntArray301 != null && Static119.anIntArray301[this.aByte70] != -1) {
			@Pc(42) Class6_Sub2_Sub3 local42 = Static39.method685(Static119.anIntArray301[this.aByte70]);
			if (local42.aChar4 == 's') {
				local13 = local13 + local42.method662(this.aByte71 & 0xFF);
			} else {
				Static346.method5707("gdn1", new Throwable());
				Static119.anIntArray301[this.aByte70] = -1;
			}
		}
		local13 = local13 + this.aString206;
		if (Static190.aStringArray24 != null) {
			local13 = local13 + Static190.aStringArray24[this.aByte70];
		}
		return local13;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)I")
	@Override
	protected int method4718() {
		return this.anInt4899;
	}

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "(I)I")
	@Override
	public int method5784() {
		return super.anInt5095;
	}

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
	@Override
	public void method5777() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ja;BI)Z")
	private boolean method4482(@OriginalArg(0) Class81 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class128 local11 = this.method4716();
		@Pc(25) Class24 local25 = super.anInt5099 != -1 && super.anInt5118 == 0 ? Static209.method3737(super.anInt5099) : null;
		@Pc(44) Class24 local44 = super.anInt5116 == -1 || this.aBoolean347 || super.aBoolean358 && local25 != null ? null : Static209.method3737(super.anInt5116);
		@Pc(47) int local47 = local11.anInt3382;
		@Pc(55) int local55 = local11.anInt3380;
		if (local47 != 0 || local55 != 0 || local11.anInt3392 != 0 || local11.anInt3371 != 0) {
			arg1 |= 0x7;
		}
		super.aClass78Array3[0] = this.aClass21_2.method466(local25, local44, arg1, super.anInt5133, super.aClass192Array3, arg0, super.anInt5152, super.anInt5129, super.anInt5119, super.anInt5091, super.anInt5114);
		@Pc(99) int local99 = Static103.method2100();
		if (Static183.anInt3439 < 96 && local99 > 50) {
			Static162.method3238();
		}
		@Pc(116) int local116;
		if (Static285.anInt5397 != 0 && local99 < 50) {
			local116 = 50 - local99;
			while (local116 > Static141.anInt2540) {
				Static5.aByteArrayArray1[Static141.anInt2540] = new byte[102400];
				Static141.anInt2540++;
			}
			while (local116 < Static141.anInt2540) {
				Static141.anInt2540--;
				Static5.aByteArrayArray1[Static141.anInt2540] = null;
			}
		} else if (Static285.anInt5397 != 0) {
			Static141.anInt2540 = 0;
			Static5.aByteArrayArray1 = new byte[50][];
		}
		if (super.aClass78Array3[0] == null) {
			return false;
		}
		super.anInt5095 = super.aClass78Array3[0].method4639();
		this.method4707(super.aClass78Array3[0]);
		local116 = super.aClass219_7.method5750();
		super.anInt5138 = 0;
		super.anInt5101 = 0;
		super.anInt5090 = 0;
		if (local47 == 0 && local55 == 0) {
			this.method4721(this.method4714() << 7, this.method4714() << 7, local116);
		} else {
			this.method4721(local47, local55, local116);
			if (super.anInt5101 != 0) {
				super.aClass78Array3[0].method4651(super.anInt5101);
			}
			if (super.anInt5090 != 0) {
				super.aClass78Array3[0].method4658(super.anInt5090);
			}
			if (super.anInt5138 != 0) {
				super.aClass78Array3[0].method4641(0, super.anInt5138, 0);
			}
		}
		super.aClass78Array3[1] = null;
		if (!this.aBoolean347 && super.anInt5148 != -1 && super.anInt5107 != -1) {
			@Pc(275) Class166 local275 = Static62.method999(super.anInt5148);
			@Pc(294) Class78 local294 = local275.method4372(arg0, local7 | (local275.aBoolean334 ? 7 : 2), super.anInt5147, super.anInt5122, super.anInt5107);
			if (local294 != null) {
				local294.method4641(0, -super.anInt5139, 0);
				if (local275.aBoolean334 && (local47 != 0 || local55 != 0)) {
					if (super.anInt5101 != 0) {
						local294.method4651(super.anInt5101);
					}
					if (super.anInt5090 != 0) {
						local294.method4658(super.anInt5090);
					}
					if (super.anInt5138 != 0) {
						local294.method4641(0, super.anInt5138, 0);
					}
				}
				super.aClass78Array3[1] = local294;
			}
		}
		super.aClass78Array3[2] = null;
		if (!this.aBoolean347 && super.anInterface7_3 != null) {
			if (Static76.anInt2853 >= super.anInt5165) {
				super.anInterface7_3 = null;
			}
			if (super.anInt5163 <= Static76.anInt2853 && super.anInt5165 > Static76.anInt2853) {
				@Pc(382) Class78 local382 = super.anInterface7_3.method5792(local7 | 0x7, arg0);
				if (local382 != null) {
					local382.method4641(-super.anInt6340 + super.anInt5166, -super.anInt6335 + super.anInt5157, super.anInt5164 - super.anInt6339);
					if (local116 != 0) {
						local382.method4648(-local116 & 0x3FFF);
					}
					super.aClass78Array3[2] = local382;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLclient!ja;)Lclient!kh;")
	@Override
	public Class20_Sub6 method5779(@OriginalArg(1) Class81 arg0) {
		if (this.aClass21_2 == null || !this.method4482(arg0, 1024)) {
			return null;
		}
		@Pc(19) Class72 local19 = arg0.method2990();
		@Pc(24) int local24 = super.aClass219_7.method5750();
		local19.method4081(local24);
		local19.method4068(super.anInt6340, super.anInt6335, super.anInt6339);
		@Pc(44) float local44 = arg0.method3040();
		@Pc(47) float local47 = arg0.method2970();
		if (Static196.aBoolean281) {
			@Pc(53) Class128 local53 = this.method4716();
			if (local53.aBoolean245 && (this.aClass21_2.anInt552 == -1 || Static162.method3235(this.aClass21_2.anInt552).aBoolean29)) {
				@Pc(85) Class24 local85 = super.anInt5099 != -1 && super.anInt5118 == 0 ? Static209.method3737(super.anInt5099) : null;
				@Pc(105) Class24 local105 = super.anInt5116 == -1 || this.aBoolean347 || super.aBoolean358 && local85 != null ? null : Static209.method3737(super.anInt5116);
				@Pc(139) Class78 local139 = Static342.method5629(160, super.aClass78Array3[0], super.anInt5138, arg0, local105 == null ? local85 : local105, 1, 240, 0, local24, super.anInt5101, super.aBoolean355, local105 == null ? super.anInt5152 : super.anInt5129, 0, super.anInt5090);
				if (local139 != null) {
					arg0.method2974(local44, local47 - 128.0F);
					arg0.method2957(false);
					local139.method4649(local19, null, 0);
					arg0.method2957(true);
				}
			}
		}
		if (Static253.aClass44_Sub4_Sub4_Sub1_1 == this) {
			arg0.method2974(local44, local47 - 144.0F);
			local19.method4067(super.anInt6340, super.anInt6335, super.anInt6339);
			for (@Pc(180) int local180 = Static330.aClass154Array1.length - 1; local180 >= 0; local180--) {
				@Pc(186) Class154 local186 = Static330.aClass154Array1[local180];
				if (local186 != null && local186.anInt4216 != -1) {
					@Pc(242) int local242;
					@Pc(231) int local231;
					if (local186.anInt4211 == 1 && local186.anInt4206 >= 0 && Static239.aClass44_Sub4_Sub4_Sub2Array8.length > local186.anInt4206) {
						@Pc(218) Class44_Sub4_Sub4_Sub2 local218 = Static239.aClass44_Sub4_Sub4_Sub2Array8[local186.anInt4206];
						if (local218 != null) {
							local231 = local218.anInt6340 / 32 - Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 / 32;
							local242 = local218.anInt6339 / 32 - Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 / 32;
							this.method4484(super.aClass78Array3[0], 360000, local186.anInt4216, arg0, local19, local242, local231);
						}
					}
					if (local186.anInt4211 == 2) {
						@Pc(278) int local278 = (local186.anInt4208 - Static44.anInt881) * 4 + 2 - Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 / 32;
						local231 = (local186.anInt4212 - Static300.anInt5672) * 4 + 2 - Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 / 32;
						local242 = local186.anInt4204 * 4;
						local242 *= local242;
						this.method4484(super.aClass78Array3[0], local242, local186.anInt4216, arg0, local19, local231, local278);
					}
					if (local186.anInt4211 == 10 && local186.anInt4206 >= 0 && Static343.aClass44_Sub4_Sub4_Sub1Array1.length > local186.anInt4206) {
						@Pc(341) Class44_Sub4_Sub4_Sub1 local341 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local186.anInt4206];
						if (local341 != null) {
							local231 = local341.anInt6340 / 32 - Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 / 32;
							local242 = local341.anInt6339 / 32 - Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 / 32;
							this.method4484(super.aClass78Array3[0], 360000, local186.anInt4216, arg0, local19, local242, local231);
						}
					}
				}
			}
			local19.method4081(local24);
			local19.method4068(super.anInt6340, super.anInt6335, super.anInt6339);
		}
		arg0.method2974(local44, local47);
		@Pc(403) Class20_Sub6 local403 = Static208.method5776(super.aClass78Array3.length);
		if (super.aClass20_Sub2_7 == null) {
			arg0.method3037(super.aClass78Array3, local19, local403.aClass20_Sub8Array1, Static253.aClass44_Sub4_Sub4_Sub1_1 == this ? 1 : 0);
		} else {
			@Pc(425) Class90 local425 = super.aClass20_Sub2_7.method449();
			arg0.method2971(super.aClass78Array3, local425, local19, local403.aClass20_Sub8Array1, Static253.aClass44_Sub4_Sub4_Sub1_1 == this ? 1 : 0);
		}
		this.method4710(super.aClass78Array3, arg0, false);
		if (super.aClass78Array3[2] != null) {
			if (local24 != 0) {
				super.aClass78Array3[2].method4648(local24);
			}
			super.aClass78Array3[2].method4641(super.anInt6340 - super.anInt5166, -super.anInt5157 + super.anInt6335, -super.anInt5164 + super.anInt6339);
		}
		return local403;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(ZI)Ljava/lang/String;")
	public String method4483() {
		return this.aString207;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!rc;IILclient!ja;BLclient!po;II)V")
	private void method4484(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class81 arg3, @OriginalArg(5) Class72 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg5 * arg5 + arg6 * arg6;
		if (local17 < 16 || arg1 < local17) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg6, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(54) Class78 local54 = Static317.method5318(super.anInt5138, super.anInt6335, local35, super.anInt5101, super.anInt5090, arg2, super.anInt6340, arg3, super.anInt6339, arg0);
		if (local54 != null) {
			arg3.method2957(false);
			local54.method4649(arg4, null, 0);
			arg3.method2957(true);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)I")
	@Override
	public int method4709() {
		return -1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!ja;)V")
	@Override
	public void method5775(@OriginalArg(1) Class81 arg0) {
		if (this.aClass21_2 != null && (super.aBoolean360 || this.method4482(arg0, 0))) {
			this.method4710(super.aClass78Array3, arg0, super.aBoolean360);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!ja;II)Z")
	@Override
	public boolean method5778(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass21_2 == null || !this.method4482(arg1, 65536)) {
			return true;
		}
		@Pc(24) Class72 local24 = arg1.method2990();
		@Pc(29) int local29 = super.aClass219_7.method5750();
		local24.method4081(local29);
		local24.method4067(super.anInt6340, super.anInt6335, super.anInt6339);
		for (@Pc(42) int local42 = 0; super.aClass78Array3.length > local42; local42++) {
			if (super.aClass78Array3[local42] != null) {
				return super.aClass78Array3[local42].method4644(arg2, arg0, local24, true);
			}
		}
		return false;
	}
}
