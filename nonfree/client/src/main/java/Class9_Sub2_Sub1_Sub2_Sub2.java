import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class9_Sub2_Sub1_Sub2_Sub2 extends Class9_Sub2_Sub1_Sub2 {

	@OriginalMember(owner = "client!wq", name = "Rc", descriptor = "I")
	public int anInt10238;

	@OriginalMember(owner = "client!wq", name = "Xc", descriptor = "Ljava/lang/String;")
	public String aString108;

	@OriginalMember(owner = "client!wq", name = "id", descriptor = "Lclient!sk;")
	public Class309 aClass309_1;

	@OriginalMember(owner = "client!wq", name = "pd", descriptor = "Lclient!ew;")
	public Class101 aClass101_1;

	@OriginalMember(owner = "client!wq", name = "Tc", descriptor = "I")
	public int anInt10240 = 1;

	@OriginalMember(owner = "client!wq", name = "ad", descriptor = "I")
	public int anInt10245 = 1;

	@OriginalMember(owner = "client!wq", name = "nd", descriptor = "I")
	public int anInt10256 = -1;

	@OriginalMember(owner = "client!wq", name = "ud", descriptor = "I")
	public int anInt10260 = -1;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "(I)I")
	@Override
	public int method8599() {
		return this.aClass309_1 == null ? 0 : this.aClass309_1.anInt8826;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method8637(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(9) Class176 local9 = this.method8633();
		@Pc(24) Class267 local24 = super.anInt10193 != -1 && super.anInt10219 == 0 ? Static474.aClass264_2.method6574(super.anInt10193) : null;
		@Pc(43) Class267 local43 = super.anInt10211 == -1 || super.aBoolean773 && local24 != null ? null : Static474.aClass264_2.method6574(super.anInt10211);
		@Pc(46) int local46 = local9.anInt5195;
		@Pc(49) int local49 = local9.anInt5226;
		if (local46 != 0 || local49 != 0 || local9.anInt5207 != 0 || local9.anInt5194 != 0) {
			arg1 |= 0x7;
		}
		@Pc(95) boolean local95 = super.aByte131 != 0 && super.anInt10207 <= Static304.anInt8391 && super.anInt10184 > Static304.anInt8391;
		if (local95) {
			arg1 |= 0x80000;
		}
		@Pc(106) int local106 = super.aClass191_7.method5071();
		@Pc(142) Class75 local142 = super.aClass75Array3[0] = this.aClass309_1.method7588(local24, super.anInt10175, local106, super.aClass140Array3, Static61.aClass119_1, super.anInt10195, super.anInt10224, super.anIntArray667, arg1, super.anInt10189, Static474.aClass264_2, Static183.aClass285_1, arg0, super.anInt10192, local43, this.aClass101_1, super.anInt10214);
		if (local142 == null) {
			return false;
		}
		super.anInt10216 = local142.fa();
		super.anInt10229 = local142.ma();
		this.method8628(local142);
		if (local46 == 0 && local49 == 0) {
			this.method8629(0, local106, this.method8619() << 9, 0, this.method8619() << 9);
		} else {
			this.method8629(local9.anInt5216, local106, local49, local9.anInt5228, local46);
			if (super.anInt10210 != 0) {
				super.aClass75Array3[0].FA(super.anInt10210);
			}
			if (super.anInt10223 != 0) {
				super.aClass75Array3[0].VA(super.anInt10223);
			}
			if (super.anInt10202 != 0) {
				super.aClass75Array3[0].H(0, super.anInt10202, 0);
			}
		}
		if (local95) {
			local142.method6792(super.aByte132, super.aByte130, super.aByte133, super.aByte131 & 0xFF);
		}
		this.method8624(local46, local5, local9, local106, arg0, local49);
		return true;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Z")
	public boolean method8638() {
		return this.aClass309_1 != null;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		if (this.aClass309_1 == null || !this.method8637(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class31 local19 = arg0.method6125();
		@Pc(24) int local24 = super.aClass191_7.method5071();
		local19.method7933(local24);
		@Pc(42) Class351 local42 = Static567.aClass351ArrayArrayArray4[super.aByte127][super.anInt10152 >> Static485.anInt8241][super.anInt10158 >> Static485.anInt8241];
		if (local42 == null || local42.aClass9_Sub2_Sub4_1 == null) {
			super.anInt10172 = (int) ((float) super.anInt10172 - (float) super.anInt10172 / 10.0F);
		} else {
			@Pc(55) int local55 = super.anInt10172 - local42.aClass9_Sub2_Sub4_1.aShort93;
			super.anInt10172 = (int) ((float) super.anInt10172 - (float) local55 / 10.0F);
		}
		local19.method7930(super.anInt10152, -super.anInt10172 + super.anInt10154 - 20, super.anInt10158);
		@Pc(98) Class176 local98 = this.method8633();
		@Pc(111) Class309 local111 = this.aClass309_1.anIntArray553 == null ? this.aClass309_1 : this.aClass309_1.method7594(Static183.aClass285_1);
		super.aBoolean776 = false;
		@Pc(116) Class9_Sub10 local116 = null;
		if (Static32.aClass3_Sub41_3.aClass7_Sub10_1.method4510() == 1 && local111.aBoolean655 && local98.aBoolean383) {
			@Pc(147) Class267 local147 = super.anInt10193 != -1 && super.anInt10219 == 0 ? Static474.aClass264_2.method6574(super.anInt10193) : null;
			@Pc(165) Class267 local165 = super.anInt10211 == -1 || super.aBoolean773 && local147 != null ? null : Static474.aClass264_2.method6574(super.anInt10211);
			@Pc(215) Class75 local215 = Static128.method1420(super.anInt10223, this.aClass309_1.aByte96 & 0xFF, super.anInt10202, local24, local165 == null ? local147 : local165, local165 == null ? super.anInt10189 : super.anInt10195, this.aClass309_1.aShort104 & 0xFFFF, super.aClass75Array3[0], this.aClass309_1.anInt8833, this.aClass309_1.aByte101 & 0xFF, super.anInt10210, arg0, this.aClass309_1.aShort105 & 0xFFFF);
			if (local215 != null) {
				local116 = Static635.method8548(super.aClass75Array3.length + 1, this.method8639());
				super.aBoolean776 = true;
				arg0.C(false);
				if (Static40.aBoolean34) {
					local215.method6788(local19, local116.aClass9_Sub5Array1[super.aClass75Array3.length], Static562.anInt9327, 0);
				} else {
					local215.method6799(local19, local116.aClass9_Sub5Array1[super.aClass75Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method7933(local24);
		local19.method7930(super.anInt10152, -super.anInt10172 + super.anInt10154 - 5, super.anInt10158);
		if (local116 == null) {
			local116 = Static635.method8548(super.aClass75Array3.length, this.method8639());
		}
		this.method8623(arg0, super.aClass75Array3, false, local19);
		@Pc(304) int local304;
		if (Static40.aBoolean34) {
			for (local304 = 0; super.aClass75Array3.length > local304; local304++) {
				if (super.aClass75Array3[local304] != null) {
					super.aClass75Array3[local304].method6788(local19, local116.aClass9_Sub5Array1[local304], Static562.anInt9327, 0);
				}
			}
		} else {
			for (local304 = 0; local304 < super.aClass75Array3.length; local304++) {
				if (super.aClass75Array3[local304] != null) {
					super.aClass75Array3[local304].method6799(local19, local116.aClass9_Sub5Array1[local304], 0);
				}
			}
		}
		if (super.aClass9_Sub8_8 != null) {
			@Pc(364) Class162 local364 = super.aClass9_Sub8_8.method5949();
			if (Static40.aBoolean34) {
				arg0.method6107(local364, Static562.anInt9327);
			} else {
				arg0.method6161(local364);
			}
		}
		for (local304 = 0; local304 < super.aClass75Array3.length; local304++) {
			if (super.aClass75Array3[local304] != null) {
				super.aBoolean776 |= super.aClass75Array3[local304].F();
			}
		}
		super.aClass75Array3[0] = super.aClass75Array3[1] = super.aClass75Array3[2] = null;
		super.anInt10209 = Static609.anInt9804;
		return local116;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
		if (this.aClass309_1 == null || !super.aBoolean775 && !this.method8637(arg0, 0)) {
			return;
		}
		@Pc(20) Class31 local20 = arg0.method6125();
		local20.method7933(super.aClass191_7.method5071());
		local20.method7930(super.anInt10152, super.anInt10154 - 20, super.anInt10158);
		this.method8623(arg0, super.aClass75Array3, super.aBoolean775, local20);
		super.aClass75Array3[0] = super.aClass75Array3[1] = super.aClass75Array3[2] = null;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass309_1 == null || !this.method8637(arg1, 131072)) {
			return false;
		}
		@Pc(26) Class31 local26 = arg1.method6125();
		@Pc(31) int local31 = super.aClass191_7.method5071();
		local26.method7933(local31);
		local26.method7930(super.anInt10152, super.anInt10154, super.anInt10158);
		@Pc(44) boolean local44 = false;
		for (@Pc(46) int local46 = 0; local46 < super.aClass75Array3.length; local46++) {
			if (super.aClass75Array3[local46] != null) {
				@Pc(74) boolean var10000;
				label41: {
					if (this.aClass309_1.anInt8826 <= 0) {
						label39: {
							if (this.aClass309_1.anInt8855 == -1) {
								if (this.aClass309_1.anInt8833 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass309_1.anInt8855 == 1) {
									break label39;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label41;
							}
						}
					}
					var10000 = true;
				}
				@Pc(89) boolean local89 = var10000;
				@Pc(104) boolean local104;
				if (Static40.aBoolean34) {
					local104 = super.aClass75Array3[local46].method6800(arg0, arg2, local26, local89, this.aClass309_1.anInt8826, Static562.anInt9327);
				} else {
					local104 = super.aClass75Array3[local46].method6804(arg0, arg2, local26, local89, this.aClass309_1.anInt8826);
				}
				if (local104) {
					local44 = true;
					break;
				}
			}
		}
		super.aClass75Array3[0] = super.aClass75Array3[1] = super.aClass75Array3[2] = null;
		return local44;
	}

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "(B)I")
	@Override
	protected int method8620() {
		if (this.aClass309_1.anIntArray553 != null) {
			@Pc(21) Class309 local21 = this.aClass309_1.method7594(Static183.aClass285_1);
			if (local21 != null && local21.anInt8852 != -1) {
				return local21.anInt8852;
			}
		}
		return this.aClass309_1.anInt8852;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)Z")
	private boolean method8639() {
		return this.aClass309_1.aBoolean659;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)I")
	@Override
	public int method8634() {
		if (this.aClass309_1.anIntArray553 != null) {
			@Pc(21) Class309 local21 = this.aClass309_1.method7594(Static183.aClass285_1);
			if (local21 != null && local21.anInt8838 != -1) {
				return local21.anInt8838;
			}
		}
		return this.aClass309_1.anInt8838 == -1 ? super.method8634() : this.aClass309_1.anInt8838;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)V")
	public void method8641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = super.anIntArray675[0];
		@Pc(22) int local22 = super.anIntArray676[0];
		if (arg1 == 0) {
			local22++;
		}
		if (arg1 == 1) {
			local17++;
			local22++;
		}
		if (arg1 == 2) {
			local17++;
		}
		if (arg1 == 3) {
			local22--;
			local17++;
		}
		if (arg1 == 4) {
			local22--;
		}
		if (arg1 == 5) {
			local17--;
			local22--;
		}
		if (arg1 == 6) {
			local17--;
		}
		if (super.anInt10193 != -1 && Static474.aClass264_2.method6574(super.anInt10193).anInt7571 == 1) {
			super.anIntArray666 = null;
			super.anInt10193 = -1;
		}
		if (arg1 == 7) {
			local22++;
			local17--;
		}
		for (@Pc(91) int local91 = 0; local91 < super.aClass380Array3.length; local91++) {
			if (super.aClass380Array3[local91].anInt10136 != -1) {
				@Pc(111) Class207 local111 = Static266.aClass135_1.method3108(super.aClass380Array3[local91].anInt10136);
				if (local111.aBoolean457 && local111.anInt6225 != -1 && Static474.aClass264_2.method6574(local111.anInt6225).anInt7571 == 1) {
					super.aClass380Array3[local91].anInt10136 = -1;
				}
			}
		}
		if (super.anInt10236 < 9) {
			super.anInt10236++;
		}
		for (@Pc(159) int local159 = super.anInt10236; local159 > 0; local159--) {
			super.anIntArray675[local159] = super.anIntArray675[local159 - 1];
			super.anIntArray676[local159] = super.anIntArray676[local159 - 1];
			super.aByteArray107[local159] = super.aByteArray107[local159 - 1];
		}
		super.anIntArray675[0] = local17;
		super.aByteArray107[0] = (byte) arg0;
		super.anIntArray676[0] = local22;
	}

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "(I)V")
	@Override
	public void method8612() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)I")
	@Override
	public int method8627() {
		if (this.aClass309_1.anIntArray553 != null) {
			@Pc(18) Class309 local18 = this.aClass309_1.method7594(Static183.aClass285_1);
			if (local18 != null && local18.anInt8836 != -1) {
				return local18.anInt8836;
			}
		}
		return this.aClass309_1.anInt8836;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8610() {
		return false;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIZII)V")
	public void method8643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte127 = super.aByte128 = (byte) arg0;
		if (Static97.method1657(arg2, arg4)) {
			super.aByte128++;
		}
		if (super.anInt10193 != -1 && Static474.aClass264_2.method6574(super.anInt10193).anInt7571 == 1) {
			super.anInt10193 = -1;
			super.anIntArray666 = null;
		}
		for (@Pc(45) int local45 = 0; local45 < super.aClass380Array3.length; local45++) {
			if (super.aClass380Array3[local45].anInt10136 != -1) {
				@Pc(65) Class207 local65 = Static266.aClass135_1.method3108(super.aClass380Array3[local45].anInt10136);
				if (local65.aBoolean457 && local65.anInt6225 != -1 && Static474.aClass264_2.method6574(local65.anInt6225).anInt7571 == 1) {
					super.aClass380Array3[local45].anInt10136 = -1;
				}
			}
		}
		if (!arg3) {
			@Pc(107) int local107 = arg4 - super.anIntArray675[0];
			@Pc(114) int local114 = arg2 - super.anIntArray676[0];
			if (local107 >= -8 && local107 <= 8 && local114 >= -8 && local114 <= 8) {
				if (super.anInt10236 < 9) {
					super.anInt10236++;
				}
				for (@Pc(145) int local145 = super.anInt10236; local145 > 0; local145--) {
					super.anIntArray675[local145] = super.anIntArray675[local145 - 1];
					super.anIntArray676[local145] = super.anIntArray676[local145 - 1];
					super.aByteArray107[local145] = super.aByteArray107[local145 - 1];
				}
				super.anIntArray675[0] = arg4;
				super.anIntArray676[0] = arg2;
				super.aByteArray107[0] = 1;
				return;
			}
		}
		super.anInt10234 = 0;
		super.anIntArray675[0] = arg4;
		super.anInt10235 = 0;
		super.anInt10236 = 0;
		super.anIntArray676[0] = arg2;
		super.anInt10152 = (arg1 << 8) + (super.anIntArray675[0] << 9);
		super.anInt10158 = (super.anIntArray676[0] << 9) + (arg1 << 8);
		if (super.aClass9_Sub8_8 != null) {
			super.aClass9_Sub8_8.method5937();
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!sk;I)V")
	public void method8644(@OriginalArg(0) Class309 arg0) {
		this.aClass309_1 = arg0;
		if (this.aClass309_1 != null) {
			this.aString108 = this.aClass309_1.aString86;
			this.anInt10238 = this.aClass309_1.anInt8850;
		}
		if (super.aClass9_Sub8_8 != null) {
			super.aClass9_Sub8_8.method5937();
		}
	}
}
