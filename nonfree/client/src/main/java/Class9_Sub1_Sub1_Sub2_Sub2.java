import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class9_Sub1_Sub1_Sub2_Sub2 extends Class9_Sub1_Sub1_Sub2 {

	@OriginalMember(owner = "client!rw", name = "cd", descriptor = "Lclient!is;")
	public Class187 aClass187_1;

	@OriginalMember(owner = "client!rw", name = "qd", descriptor = "Lclient!lb;")
	public Class219 aClass219_1;

	@OriginalMember(owner = "client!rw", name = "jd", descriptor = "I")
	public int anInt8835;

	@OriginalMember(owner = "client!rw", name = "Xc", descriptor = "Ljava/lang/String;")
	public String aString115;

	@OriginalMember(owner = "client!rw", name = "Jc", descriptor = "I")
	public int anInt8839 = -1;

	@OriginalMember(owner = "client!rw", name = "Pc", descriptor = "I")
	public int anInt8842 = -1;

	@OriginalMember(owner = "client!rw", name = "Uc", descriptor = "I")
	public int anInt8840 = 1;

	@OriginalMember(owner = "client!rw", name = "Zc", descriptor = "I")
	public int anInt8828 = 1;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
	public Class9_Sub1_Sub1_Sub2_Sub2() {
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(I)V")
	public Class9_Sub1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(ILclient!ha;)Lclient!tc;")
	@Override
	public Class354 method9080(@OriginalArg(1) Class22 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7478() {
		return Static29.aClass378_1.aBoolean676;
	}

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "(I)I")
	@Override
	public int method7475() {
		if (this.aClass219_1.anIntArray405 != null) {
			@Pc(13) Class219 local13 = this.aClass219_1.method5035(Static380.aClass127_1);
			if (local13 != null && local13.anInt5703 != -1) {
				return local13.anInt5703;
			}
		}
		return this.aClass219_1.anInt5703;
	}

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "(I)I")
	@Override
	public int method9088() {
		return this.aClass219_1 == null ? 0 : this.aClass219_1.anInt5677;
	}

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "(B)I")
	@Override
	public int method7498() {
		if (this.aClass219_1.anIntArray405 != null) {
			@Pc(21) Class219 local21 = this.aClass219_1.method5035(Static380.aClass127_1);
			if (local21 != null && local21.anInt5697 != -1) {
				return local21.anInt5697;
			}
		}
		return this.aClass219_1.anInt5697 == -1 ? super.method7498() : this.aClass219_1.anInt5697;
	}

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "(B)Z")
	public boolean method7500() {
		return this.aClass219_1 != null;
	}

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "(I)I")
	@Override
	protected int method7490() {
		if (this.aClass219_1.anIntArray405 != null) {
			@Pc(20) Class219 local20 = this.aClass219_1.method5035(Static380.aClass127_1);
			if (local20 != null && local20.anInt5696 != -1) {
				return local20.anInt5696;
			}
		}
		return this.aClass219_1.anInt5696;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!ha;B)Z")
	private boolean method7501(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class226 local9 = this.method7489();
		@Pc(27) Class45 local27 = super.aClass45_10.method6572() && !super.aClass45_10.method6589() ? super.aClass45_10 : null;
		@Pc(47) Class45 local47 = super.aClass45_9.method6572() && (!super.aBoolean593 || local27 == null) ? super.aClass45_9 : null;
		@Pc(50) int local50 = local9.anInt5813;
		@Pc(53) int local53 = local9.anInt5791;
		if (local50 != 0 || local53 != 0 || local9.anInt5775 != 0 || local9.anInt5805 != 0) {
			arg0 |= 0x7;
		}
		@Pc(103) boolean local103 = super.aByte130 != 0 && Static716.anInt11157 >= super.anInt8804 && super.anInt8802 > Static716.anInt11157;
		if (local103) {
			arg0 |= 0x80000;
		}
		@Pc(123) int local123 = super.aClass365_7.method8385();
		@Pc(146) Class170 local146 = super.aClass170Array3[0] = this.aClass219_1.method5036(Static380.aClass127_1, super.anIntArray642, arg1, local27, local123, arg0, this.aClass187_1, local47, super.aClass45_Sub2_Sub1Array3, Static288.aClass97_1);
		if (local146 == null) {
			return false;
		}
		super.anInt8796 = local146.fa();
		super.anInt8794 = local146.ma();
		this.method7477(local146);
		if (local50 == 0 && local53 == 0) {
			this.method7476(this.method7485() << 9, local123, this.method7485() << 9, 0, 0);
		} else {
			this.method7476(local50, local123, local53, local9.anInt5804, local9.anInt5809);
			if (super.anInt8758 != 0) {
				super.aClass170Array3[0].FA(super.anInt8758);
			}
			if (super.anInt8763 != 0) {
				super.aClass170Array3[0].VA(super.anInt8763);
			}
			if (super.anInt8800 != 0) {
				super.aClass170Array3[0].H(0, super.anInt8800, 0);
			}
		}
		if (local103) {
			local146.method8358(super.aByte128, super.aByte127, super.aByte129, super.aByte130 & 0xFF);
		}
		this.method7484(local50, local123, arg1, local9, local53, local5);
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!ee;Lclient!ha;IZIIZ)V")
	@Override
	public void method9091(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9085(@OriginalArg(1) Class22 arg0) {
		if (this.aClass219_1 == null || !super.aBoolean594 && !this.method7501(0, arg0)) {
			return;
		}
		@Pc(26) Class58 local26 = arg0.method9354();
		local26.method9525(super.aClass365_7.method8385());
		local26.method9509(super.anInt10694, super.anInt10690 - 20, super.anInt10695);
		this.method7494(local26, super.aBoolean594, arg0, super.aClass170Array3);
		for (@Pc(58) int local58 = 0; super.aClass170Array3.length > local58; local58++) {
			super.aClass170Array3[local58] = null;
		}
	}

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)V")
	@Override
	public void method9086() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "(B)Z")
	private boolean method7504() {
		return this.aClass219_1.aBoolean370;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIZLjava/lang/String;)V")
	public void method7505(@OriginalArg(3) String arg0) {
		@Pc(9) int local9 = Static163.method2669() * Static29.aClass378_1.anInt10090;
		this.method7487(local9, 0, 0, arg0);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZLclient!ha;)Lclient!nk;")
	@Override
	public Class9_Sub6 method9092(@OriginalArg(1) Class22 arg0) {
		if (this.aClass219_1 == null || !this.method7501(2048, arg0)) {
			return null;
		}
		@Pc(22) Class58 local22 = arg0.method9354();
		@Pc(27) int local27 = super.aClass365_7.method8385();
		local22.method9525(local27);
		@Pc(45) Class364 local45 = Static448.aClass364ArrayArrayArray2[super.aByte139][super.anInt10694 >> Static626.anInt9669][super.anInt10695 >> Static626.anInt9669];
		if (local45 == null || local45.aClass9_Sub1_Sub4_1 == null) {
			super.anInt8785 = (int) ((float) super.anInt8785 - (float) super.anInt8785 / 10.0F);
		} else {
			@Pc(60) int local60 = super.anInt8785 - local45.aClass9_Sub1_Sub4_1.aShort97;
			super.anInt8785 = (int) ((float) super.anInt8785 - (float) local60 / 10.0F);
		}
		local22.method9509(super.anInt10694, -super.anInt8785 + super.anInt10690 - 20, super.anInt10695);
		@Pc(105) Class226 local105 = this.method7489();
		@Pc(119) Class219 local119 = this.aClass219_1.anIntArray405 == null ? this.aClass219_1 : this.aClass219_1.method5035(Static380.aClass127_1);
		super.aBoolean595 = false;
		@Pc(124) Class9_Sub6 local124 = null;
		if (Static580.aClass3_Sub22_24.aClass21_Sub7_1.method3410() == 1 && local119.aBoolean366 && local105.aBoolean375) {
			@Pc(168) Class45 local168 = super.aClass45_10.method6572() && super.aClass45_10.method6589() ? super.aClass45_10 : null;
			@Pc(188) Class45 local188 = super.aClass45_9.method6572() && (!super.aBoolean593 || local168 == null) ? super.aClass45_9 : null;
			@Pc(232) Class170 local232 = Static76.method1622(this.aClass219_1.anInt5693, this.aClass219_1.aShort73 & 0xFFFF, this.aClass219_1.aShort74 & 0xFFFF, local188 == null ? local168 : local188, super.aClass170Array3[0], super.anInt8800, local27, arg0, this.aClass219_1.aByte80 & 0xFF, super.anInt8758, super.anInt8763, this.aClass219_1.aByte84 & 0xFF);
			if (local232 != null) {
				local124 = Static135.method9083(super.aClass170Array3.length + 1, this.method7504());
				super.aBoolean595 = true;
				arg0.C(false);
				if (Static444.aBoolean451) {
					local232.method8350(local22, local124.aClass9_Sub9Array1[super.aClass170Array3.length], Static668.anInt10260, 0);
				} else {
					local232.method8360(local22, local124.aClass9_Sub9Array1[super.aClass170Array3.length], 0);
				}
				arg0.C(true);
			}
		}
		local22.method9525(local27);
		local22.method9509(super.anInt10694, -super.anInt8785 + super.anInt10690 - 5, super.anInt10695);
		if (local124 == null) {
			local124 = Static135.method9083(super.aClass170Array3.length, this.method7504());
		}
		this.method7494(local22, false, arg0, super.aClass170Array3);
		@Pc(323) int local323;
		if (Static444.aBoolean451) {
			for (local323 = 0; super.aClass170Array3.length > local323; local323++) {
				if (super.aClass170Array3[local323] != null) {
					super.aClass170Array3[local323].method8350(local22, local124.aClass9_Sub9Array1[local323], Static668.anInt10260, 0);
				}
			}
		} else {
			for (local323 = 0; super.aClass170Array3.length > local323; local323++) {
				if (super.aClass170Array3[local323] != null) {
					super.aClass170Array3[local323].method8360(local22, local124.aClass9_Sub9Array1[local323], 0);
				}
			}
		}
		if (super.aClass9_Sub5_8 != null) {
			@Pc(407) Class346 local407 = super.aClass9_Sub5_8.method5580();
			if (Static444.aBoolean451) {
				arg0.method9360(local407, Static668.anInt10260);
			} else {
				arg0.method9384(local407);
			}
		}
		for (local323 = 0; super.aClass170Array3.length > local323; local323++) {
			if (super.aClass170Array3[local323] != null) {
				super.aBoolean595 |= super.aClass170Array3[local323].F();
			}
			super.aClass170Array3[local323] = null;
		}
		super.anInt8778 = Static247.anInt3877;
		return local124;
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)Lclient!oka;")
	@Override
	public Class279 method7491() {
		return super.aClass279_3 != null && super.aClass279_3.aString95 == null ? null : super.aClass279_3;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIIZI)V")
	public void method7506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte139 = super.aByte140 = (byte) arg4;
		if (Static574.method7435(arg2, arg1)) {
			super.aByte140++;
		}
		if (super.aClass45_10.method6572() && super.aClass45_10.method6579().anInt3750 == 1) {
			super.anIntArray641 = null;
			super.aClass45_10.method6576(-1);
		}
		for (@Pc(61) int local61 = 0; local61 < super.aClass407Array3.length; local61++) {
			if (super.aClass407Array3[local61].anInt11162 != -1) {
				@Pc(82) Class139 local82 = Static381.aClass106_2.method2618(super.aClass407Array3[local61].anInt11162);
				if (local82.aBoolean218 && local82.anInt3453 != -1 && Static592.aClass155_2.method3422(local82.anInt3453).anInt3750 == 1) {
					super.aClass407Array3[local61].aClass45_11.method6576(-1);
					super.aClass407Array3[local61].anInt11162 = -1;
				}
			}
		}
		if (!arg3) {
			@Pc(140) int local140 = arg2 - super.anIntArray644[0];
			@Pc(148) int local148 = arg1 - super.anIntArray643[0];
			if (local140 >= -8 && local140 <= 8 && local148 >= -8 && local148 <= 8) {
				if (super.anInt8817 < super.anIntArray644.length - 1) {
					super.anInt8817++;
				}
				for (@Pc(195) int local195 = super.anInt8817; local195 > 0; local195--) {
					super.anIntArray644[local195] = super.anIntArray644[local195 - 1];
					super.anIntArray643[local195] = super.anIntArray643[local195 - 1];
					super.aByteArray86[local195] = super.aByteArray86[local195 - 1];
				}
				super.anIntArray644[0] = arg2;
				super.anIntArray643[0] = arg1;
				super.aByteArray86[0] = 1;
				return;
			}
		}
		super.anInt8814 = 0;
		super.anInt8816 = 0;
		super.anInt8817 = 0;
		super.anIntArray644[0] = arg2;
		super.anIntArray643[0] = arg1;
		super.anInt10695 = (arg0 << 8) + (super.anIntArray643[0] << 9);
		super.anInt10694 = (arg0 << 8) + (super.anIntArray644[0] << 9);
		if (super.aClass9_Sub5_8 != null) {
			super.aClass9_Sub5_8.method5584();
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(III)V")
	public void method7508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray644[0];
		@Pc(15) int local15 = super.anIntArray643[0];
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
			local15--;
			local10--;
		}
		if (arg0 == 6) {
			local10--;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		if (super.aClass45_10.method6572() && super.aClass45_10.method6579().anInt3750 == 1) {
			super.anIntArray641 = null;
			super.aClass45_10.method6576(-1);
		}
		for (@Pc(105) int local105 = 0; local105 < super.aClass407Array3.length; local105++) {
			if (super.aClass407Array3[local105].anInt11162 != -1) {
				@Pc(127) Class139 local127 = Static381.aClass106_2.method2618(super.aClass407Array3[local105].anInt11162);
				if (local127.aBoolean218 && local127.anInt3453 != -1 && Static592.aClass155_2.method3422(local127.anInt3453).anInt3750 == 1) {
					super.aClass407Array3[local105].aClass45_11.method6576(-1);
					super.aClass407Array3[local105].anInt11162 = -1;
				}
			}
		}
		if (super.anInt8817 < super.anIntArray644.length - 1) {
			super.anInt8817++;
		}
		for (@Pc(213) int local213 = super.anInt8817; local213 > 0; local213--) {
			super.anIntArray644[local213] = super.anIntArray644[local213 - 1];
			super.anIntArray643[local213] = super.anIntArray643[local213 - 1];
			super.aByteArray86[local213] = super.aByteArray86[local213 - 1];
		}
		super.anIntArray644[0] = local10;
		super.aByteArray86[0] = (byte) arg1;
		super.anIntArray643[0] = local15;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(Lclient!ha;IZI)Z")
	@Override
	public boolean method9089(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass219_1 == null || !this.method7501(131072, arg0)) {
			return false;
		}
		@Pc(22) Class58 local22 = arg0.method9354();
		@Pc(27) int local27 = super.aClass365_7.method8385();
		local22.method9525(local27);
		local22.method9509(super.anInt10694, super.anInt10690, super.anInt10695);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; local42 < super.aClass170Array3.length; local42++) {
			if (super.aClass170Array3[local42] != null) {
				@Pc(74) boolean var10000;
				label50: {
					if (this.aClass219_1.anInt5677 <= 0) {
						label48: {
							if (this.aClass219_1.anInt5700 == -1) {
								if (this.aClass219_1.anInt5693 == 1) {
									break label48;
								}
								var10000 = false;
							} else {
								if (this.aClass219_1.anInt5700 == 1) {
									break label48;
								}
								var10000 = false;
							}
							if (!var10000) {
								var10000 = false;
								break label50;
							}
						}
					}
					var10000 = true;
				}
				@Pc(90) boolean local90 = var10000;
				@Pc(106) boolean local106;
				if (Static444.aBoolean451) {
					local106 = super.aClass170Array3[local42].method8351(arg1, arg2, local22, local90, this.aClass219_1.anInt5677, Static668.anInt10260);
				} else {
					local106 = super.aClass170Array3[local42].method8349(arg1, arg2, local22, local90, this.aClass219_1.anInt5677);
				}
				if (local106) {
					local40 = true;
					break;
				}
			}
		}
		for (@Pc(135) int local135 = 0; local135 < super.aClass170Array3.length; local135++) {
			super.aClass170Array3[local135] = null;
		}
		return local40;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(BLclient!lb;)V")
	public void method7509(@OriginalArg(1) Class219 arg0) {
		if (arg0 != this.aClass219_1 && Static530.aBoolean556 && Static218.method3253(super.anInt8783)) {
			Static54.method1303();
		}
		this.aClass219_1 = arg0;
		if (this.aClass219_1 != null) {
			this.anInt8835 = this.aClass219_1.anInt5702;
			this.aString115 = this.aClass219_1.aString69;
		}
		if (super.aClass9_Sub5_8 != null) {
			super.aClass9_Sub5_8.method5584();
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method9077() {
		return false;
	}
}
