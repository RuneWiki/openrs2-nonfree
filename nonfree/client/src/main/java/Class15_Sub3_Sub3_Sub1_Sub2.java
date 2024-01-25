import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class15_Sub3_Sub3_Sub1_Sub2 extends Class15_Sub3_Sub3_Sub1 {

	@OriginalMember(owner = "client!gh", name = "id", descriptor = "Lclient!ap;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!gh", name = "jd", descriptor = "I")
	public int anInt4052;

	@OriginalMember(owner = "client!gh", name = "kd", descriptor = "Ljava/lang/String;")
	public String aString47;

	@OriginalMember(owner = "client!gh", name = "vd", descriptor = "Lclient!rf;")
	public Class312 aClass312_1;

	@OriginalMember(owner = "client!gh", name = "Xc", descriptor = "I")
	public int anInt4043 = -1;

	@OriginalMember(owner = "client!gh", name = "md", descriptor = "I")
	public int anInt4054 = 1;

	@OriginalMember(owner = "client!gh", name = "nd", descriptor = "I")
	public int anInt4055 = 1;

	@OriginalMember(owner = "client!gh", name = "gd", descriptor = "I")
	public int anInt4050 = -1;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9439() {
		return false;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BIILclient!ha;)Z")
	@Override
	public boolean method9431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2) {
		if (this.aClass312_1 == null || !this.method3696(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class76 local19 = arg2.method8085();
		@Pc(24) int local24 = super.aClass106_7.method3290();
		local19.method9633(local24);
		local19.method9640(super.anInt11022, super.anInt11029, super.anInt11024);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; super.aClass14Array3.length > local39; local39++) {
			if (super.aClass14Array3[local39] != null) {
				@Pc(62) boolean var10000;
				label41: {
					if (this.aClass312_1.anInt9066 <= 0) {
						label39: {
							if (this.aClass312_1.anInt9077 == -1) {
								if (this.aClass312_1.anInt9095 == 1) {
									break label39;
								}
								var10000 = false;
							} else {
								if (this.aClass312_1.anInt9077 == 1) {
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
				@Pc(75) boolean local75 = var10000;
				@Pc(91) boolean local91;
				if (Static110.aBoolean800) {
					local91 = super.aClass14Array3[local39].method8625(arg0, arg1, local19, local75, this.aClass312_1.anInt9066, Static165.anInt3552);
				} else {
					local91 = super.aClass14Array3[local39].method8624(arg0, arg1, local19, local75, this.aClass312_1.anInt9066);
				}
				if (local91) {
					local37 = true;
					break;
				}
			}
		}
		super.aClass14Array3[0] = super.aClass14Array3[1] = super.aClass14Array3[2] = null;
		return local37;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(BLclient!ha;)Lclient!mg;")
	@Override
	public Class232 method9442(@OriginalArg(1) Class101 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "(I)I")
	@Override
	public int method9432() {
		return this.aClass312_1 == null ? 0 : this.aClass312_1.anInt9066;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ha;I)Lclient!uh;")
	@Override
	public Class15_Sub9 method9427(@OriginalArg(0) Class101 arg0) {
		if (this.aClass312_1 == null || !this.method3696(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class76 local19 = arg0.method8085();
		@Pc(26) int local26 = super.aClass106_7.method3290();
		local19.method9633(local26);
		@Pc(44) Class291 local44 = Static193.aClass291ArrayArrayArray2[super.aByte142][super.anInt11022 >> Static170.anInt3602][super.anInt11024 >> Static170.anInt3602];
		if (local44 == null || local44.aClass15_Sub3_Sub5_1 == null) {
			super.anInt4007 = (int) ((float) super.anInt4007 - (float) super.anInt4007 / 10.0F);
		} else {
			@Pc(71) int local71 = super.anInt4007 - local44.aClass15_Sub3_Sub5_1.aShort74;
			super.anInt4007 = (int) ((float) super.anInt4007 - (float) local71 / 10.0F);
		}
		local19.method9640(super.anInt11022, -super.anInt4007 + super.anInt11029 - 20, super.anInt11024);
		@Pc(100) Class248 local100 = this.method3673();
		@Pc(113) Class312 local113 = this.aClass312_1.anIntArray458 == null ? this.aClass312_1 : this.aClass312_1.method7953(Static113.aClass282_1);
		super.aBoolean316 = false;
		@Pc(118) Class15_Sub9 local118 = null;
		if (Static230.aClass2_Sub54_15.aClass4_Sub10_1.method2604() == 1 && local113.aBoolean657 && local100.aBoolean558) {
			@Pc(148) Class178 local148 = super.anInt3985 != -1 && super.anInt4030 == 0 ? Static354.aClass40_2.method1123(super.anInt3985) : null;
			@Pc(166) Class178 local166 = super.anInt3968 == -1 || super.aBoolean314 && local148 != null ? null : Static354.aClass40_2.method1123(super.anInt3968);
			@Pc(216) Class14 local216 = Static235.method4259(super.anInt4033, super.anInt4016, this.aClass312_1.aShort99 & 0xFFFF, local166 == null ? local148 : local166, local166 == null ? super.anInt4021 : super.anInt4028, this.aClass312_1.anInt9095, local26, super.anInt4029, this.aClass312_1.aByte117 & 0xFF, this.aClass312_1.aShort100 & 0xFFFF, arg0, this.aClass312_1.aByte116 & 0xFF, super.aClass14Array3[0]);
			if (local216 != null) {
				local118 = Static401.method6614(super.aClass14Array3.length + 1, this.method3699());
				super.aBoolean316 = true;
				arg0.C(false);
				if (Static110.aBoolean800) {
					local216.method8623(local19, local118.aClass15_Sub6Array1[super.aClass14Array3.length], Static165.anInt3552, 0);
				} else {
					local216.method8641(local19, local118.aClass15_Sub6Array1[super.aClass14Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local19.method9633(local26);
		local19.method9640(super.anInt11022, -super.anInt4007 + super.anInt11029 - 5, super.anInt11024);
		if (local118 == null) {
			local118 = Static401.method6614(super.aClass14Array3.length, this.method3699());
		}
		this.method3676(false, local19, super.aClass14Array3, arg0);
		@Pc(307) int local307;
		if (Static110.aBoolean800) {
			for (local307 = 0; local307 < super.aClass14Array3.length; local307++) {
				if (super.aClass14Array3[local307] != null) {
					super.aClass14Array3[local307].method8623(local19, local118.aClass15_Sub6Array1[local307], Static165.anInt3552, 0);
				}
			}
		} else {
			for (local307 = 0; super.aClass14Array3.length > local307; local307++) {
				if (super.aClass14Array3[local307] != null) {
					super.aClass14Array3[local307].method8641(local19, local118.aClass15_Sub6Array1[local307], 0);
				}
			}
		}
		if (super.aClass15_Sub5_3 != null) {
			@Pc(375) Class127 local375 = super.aClass15_Sub5_3.method2300();
			if (Static110.aBoolean800) {
				arg0.method8115(local375, Static165.anInt3552);
			} else {
				arg0.method8065(local375);
			}
		}
		for (local307 = 0; super.aClass14Array3.length > local307; local307++) {
			if (super.aClass14Array3[local307] != null) {
				super.aBoolean316 |= super.aClass14Array3[local307].F();
			}
		}
		super.aClass14Array3[0] = super.aClass14Array3[1] = super.aClass14Array3[2] = null;
		super.anInt4022 = Static125.anInt2441;
		return local118;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIZ)V")
	public void method3695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		super.aByte142 = super.aByte141 = (byte) arg0;
		if (Static45.method947(arg1, arg2)) {
			super.aByte141++;
		}
		if (super.anInt3985 != -1 && Static354.aClass40_2.method1123(super.anInt3985).anInt5134 == 1) {
			super.anInt3985 = -1;
			super.anIntArray184 = null;
		}
		for (@Pc(48) int local48 = 0; local48 < super.aClass358Array3.length; local48++) {
			if (super.aClass358Array3[local48].anInt10525 != -1) {
				@Pc(69) Class336 local69 = Static391.aClass319_1.method8041(super.aClass358Array3[local48].anInt10525);
				if (local69.aBoolean711 && local69.anInt9651 != -1 && Static354.aClass40_2.method1123(local69.anInt9651).anInt5134 == 1) {
					super.aClass358Array3[local48].anInt10525 = -1;
				}
			}
		}
		if (!arg4) {
			@Pc(108) int local108 = arg1 - super.anIntArray189[0];
			@Pc(116) int local116 = arg2 - super.anIntArray188[0];
			if (local108 >= -8 && local108 <= 8 && local116 >= -8 && local116 <= 8) {
				if (super.anInt4039 < 9) {
					super.anInt4039++;
				}
				for (@Pc(147) int local147 = super.anInt4039; local147 > 0; local147--) {
					super.anIntArray189[local147] = super.anIntArray189[local147 - 1];
					super.anIntArray188[local147] = super.anIntArray188[local147 - 1];
					super.aByteArray33[local147] = super.aByteArray33[local147 - 1];
				}
				super.anIntArray189[0] = arg1;
				super.anIntArray188[0] = arg2;
				super.aByteArray33[0] = 1;
				return;
			}
		}
		super.anInt4039 = 0;
		super.anInt4040 = 0;
		super.anInt4038 = 0;
		super.anIntArray189[0] = arg1;
		super.anIntArray188[0] = arg2;
		super.anInt11024 = (super.anIntArray188[0] << 9) + (arg3 << 8);
		super.anInt11022 = (arg3 << 8) + (super.anIntArray189[0] << 9);
		if (super.aClass15_Sub5_3 != null) {
			super.aClass15_Sub5_3.method2306();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!ha;II)Z")
	private boolean method3696(@OriginalArg(0) Class101 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(9) Class248 local9 = this.method3673();
		@Pc(30) Class178 local30 = super.anInt3985 != -1 && super.anInt4030 == 0 ? Static354.aClass40_2.method1123(super.anInt3985) : null;
		@Pc(50) Class178 local50 = super.anInt3968 == -1 || super.aBoolean314 && local30 != null ? null : Static354.aClass40_2.method1123(super.anInt3968);
		@Pc(53) int local53 = local9.anInt7448;
		@Pc(56) int local56 = local9.anInt7468;
		if (local53 != 0 || local56 != 0 || local9.anInt7462 != 0 || local9.anInt7456 != 0) {
			arg1 |= 0x7;
		}
		@Pc(94) boolean local94 = super.aByte54 != 0 && Static62.anInt1184 >= super.anInt4003 && Static62.anInt1184 < super.anInt4027;
		if (local94) {
			arg1 |= 0x80000;
		}
		@Pc(107) int local107 = super.aClass106_7.method3290();
		@Pc(143) Class14 local143 = super.aClass14Array3[0] = this.aClass312_1.method7954(super.anInt3974, super.anInt4028, this.aClass21_1, super.anInt4021, super.anInt4018, arg1, super.anInt4036, Static665.aClass267_2, super.aClass171Array3, super.anInt3995, super.anIntArray186, local50, Static354.aClass40_2, arg0, local107, Static113.aClass282_1, local30);
		if (local143 == null) {
			return false;
		}
		super.anInt3971 = local143.fa();
		super.anInt3988 = local143.ma();
		this.method3682(local143);
		if (local53 == 0 && local56 == 0) {
			this.method3678(this.method3690() << 9, 0, this.method3690() << 9, 0, local107);
		} else {
			this.method3678(local56, local9.anInt7452, local53, local9.anInt7465, local107);
			if (super.anInt4033 != 0) {
				super.aClass14Array3[0].FA(super.anInt4033);
			}
			if (super.anInt4016 != 0) {
				super.aClass14Array3[0].VA(super.anInt4016);
			}
			if (super.anInt4029 != 0) {
				super.aClass14Array3[0].H(0, super.anInt4029, 0);
			}
		}
		if (local94) {
			local143.method8638(super.aByte55, super.aByte57, super.aByte56, super.aByte54 & 0xFF);
		}
		this.method3677(local5, local107, local56, arg0, local53, local9);
		return true;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IZI)V")
	public void method3697(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray189[0];
		@Pc(15) int local15 = super.anIntArray188[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local10++;
			local15++;
		}
		if (arg0 == 2) {
			local10++;
		}
		if (arg0 == 3) {
			local15--;
			local10++;
		}
		if (arg0 == 4) {
			local15--;
		}
		if (arg0 == 5) {
			local10--;
			local15--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (super.anInt3985 != -1 && Static354.aClass40_2.method1123(super.anInt3985).anInt5134 == 1) {
			super.anInt3985 = -1;
			super.anIntArray184 = null;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		for (@Pc(86) int local86 = 0; local86 < super.aClass358Array3.length; local86++) {
			if (super.aClass358Array3[local86].anInt10525 != -1) {
				@Pc(105) Class336 local105 = Static391.aClass319_1.method8041(super.aClass358Array3[local86].anInt10525);
				if (local105.aBoolean711 && local105.anInt9651 != -1 && Static354.aClass40_2.method1123(local105.anInt9651).anInt5134 == 1) {
					super.aClass358Array3[local86].anInt10525 = -1;
				}
			}
		}
		if (super.anInt4039 < 9) {
			super.anInt4039++;
		}
		for (@Pc(152) int local152 = super.anInt4039; local152 > 0; local152--) {
			super.anIntArray189[local152] = super.anIntArray189[local152 - 1];
			super.anIntArray188[local152] = super.anIntArray188[local152 - 1];
			super.aByteArray33[local152] = super.aByteArray33[local152 - 1];
		}
		super.anIntArray189[0] = local10;
		super.aByteArray33[0] = (byte) arg1;
		super.anIntArray188[0] = local15;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;ZI)V")
	@Override
	public void method9426(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) Class15_Sub3 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILclient!rf;)V")
	public void method3698(@OriginalArg(1) Class312 arg0) {
		this.aClass312_1 = arg0;
		if (this.aClass312_1 != null) {
			this.aString47 = this.aClass312_1.aString108;
			this.anInt4052 = this.aClass312_1.anInt9080;
		}
		if (super.aClass15_Sub5_3 != null) {
			super.aClass15_Sub5_3.method2306();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
	@Override
	public int method3680() {
		if (this.aClass312_1.anIntArray458 != null) {
			@Pc(13) Class312 local13 = this.aClass312_1.method7953(Static113.aClass282_1);
			if (local13 != null && local13.anInt9100 != -1) {
				return local13.anInt9100;
			}
		}
		return this.aClass312_1.anInt9100 == -1 ? super.method3680() : this.aClass312_1.anInt9100;
	}

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "(I)I")
	@Override
	protected int method3691() {
		if (this.aClass312_1.anIntArray458 != null) {
			@Pc(18) Class312 local18 = this.aClass312_1.method7953(Static113.aClass282_1);
			if (local18 != null && local18.anInt9071 != -1) {
				return local18.anInt9071;
			}
		}
		return this.aClass312_1.anInt9071;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)I")
	@Override
	public int method3685() {
		if (this.aClass312_1.anIntArray458 != null) {
			@Pc(13) Class312 local13 = this.aClass312_1.method7953(Static113.aClass282_1);
			if (local13 != null && local13.anInt9074 != -1) {
				return local13.anInt9074;
			}
		}
		return this.aClass312_1.anInt9074;
	}

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "(B)Z")
	private boolean method3699() {
		return this.aClass312_1.aBoolean656;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9438(@OriginalArg(1) Class101 arg0) {
		if (this.aClass312_1 == null || !super.aBoolean317 && !this.method3696(arg0, 0)) {
			return;
		}
		@Pc(27) Class76 local27 = arg0.method8085();
		local27.method9633(super.aClass106_7.method3290());
		local27.method9640(super.anInt11022, super.anInt11029 - 20, super.anInt11024);
		this.method3676(super.aBoolean317, local27, super.aClass14Array3, arg0);
		super.aClass14Array3[0] = super.aClass14Array3[1] = super.aClass14Array3[2] = null;
	}

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "(I)Z")
	public boolean method3700() {
		return this.aClass312_1 != null;
	}

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "(I)V")
	@Override
	public void method9429() {
		throw new IllegalStateException();
	}
}
