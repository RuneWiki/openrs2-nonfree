import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ica")
public final class Class47_Sub2_Sub3_Sub1 extends Class47_Sub2_Sub3 {

	@OriginalMember(owner = "client!ica", name = "Kc", descriptor = "Lclient!qda;")
	public Class238 aClass238_1;

	@OriginalMember(owner = "client!ica", name = "Vc", descriptor = "I")
	public int anInt4225 = -1;

	@OriginalMember(owner = "client!ica", name = "Hc", descriptor = "I")
	public int anInt4213 = -1;

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)I")
	@Override
	public int method4354() {
		if (this.aClass238_1.anIntArray511 != null) {
			@Pc(13) Class238 local13 = this.aClass238_1.method5866(Static343.aClass286_1);
			if (local13 != null && local13.anInt6772 != -1) {
				return local13.anInt6772;
			}
		}
		return this.aClass238_1.anInt6772;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		if (this.aClass238_1 == null || !this.method3704(arg0, 2048)) {
			return null;
		}
		@Pc(25) Class22 local25 = arg0.method7642();
		@Pc(30) int local30 = super.aClass146_7.method3943();
		local25.ma(local30);
		local25.TA(super.anInt8189, super.anInt8192, super.anInt8191);
		@Pc(45) Class255 local45 = this.method4356();
		@Pc(58) Class238 local58 = this.aClass238_1.anIntArray511 == null ? this.aClass238_1 : this.aClass238_1.method5866(Static343.aClass286_1);
		if (Static89.aClass1_Sub28_Sub1_1.aBoolean331 && local58.aBoolean449 && local45.aBoolean480) {
			@Pc(85) Class280 local85 = super.anInt5018 != -1 && super.anInt5026 == 0 ? Static6.aClass126_1.method3574(super.anInt5018) : null;
			@Pc(102) Class280 local102 = super.anInt5039 == -1 || super.aBoolean343 && local85 != null ? null : Static6.aClass126_1.method3574(super.anInt5039);
			@Pc(104) int local104 = 0;
			if (super.anInt5005 != 0) {
				local104 = this.method4355();
			}
			@Pc(162) Class19 local162 = Static398.method5998(local102 == null ? super.anInt5007 : super.anInt5021, super.aClass19Array3[0], local104, local102 == null ? local85 : local102, this.aClass238_1.aByte78 & 0xFF, this.aClass238_1.aByte77 & 0xFF, super.anInt5077, local30, this.aClass238_1.aShort100 & 0xFFFF, super.anInt5078, this.aClass238_1.anInt6754, arg0, this.aClass238_1.aShort99 & 0xFFFF, super.anInt5040);
			if (local162 != null) {
				@Pc(167) float local167 = arg0.P();
				@Pc(170) float local170 = arg0.ra();
				arg0.method7589(false);
				arg0.la(local167, local170 - 150.0F);
				local162.method7258(local25, null, 0);
				arg0.la(local167, local170);
				arg0.method7589(true);
			}
		}
		@Pc(193) Class2_Sub6 local193 = null;
		if (this.method3710()) {
			local193 = Static275.method4678(super.aClass19Array3.length);
		}
		if (super.aClass2_Sub3_6 == null) {
			arg0.method7578(super.aClass19Array3, local25, local193 == null ? null : local193.aClass2_Sub7Array1, 0);
		} else {
			@Pc(224) Class249 local224 = super.aClass2_Sub3_6.method2067();
			arg0.method7593(super.aClass19Array3, local224, local25, local193 == null ? null : local193.aClass2_Sub7Array1, 0);
		}
		this.method4368(false, super.aClass19Array3, arg0);
		super.anInt5011 = Static15.anInt833;
		super.aClass19Array3[0] = super.aClass19Array3[1] = super.aClass19Array3[2] = super.aClass19Array3[3] = null;
		return local193;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!qa;II)Z")
	private boolean method3704(@OriginalArg(0) Class9 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class255 local11 = this.method4356();
		@Pc(27) Class280 local27 = super.anInt5018 != -1 && super.anInt5026 == 0 ? Static6.aClass126_1.method3574(super.anInt5018) : null;
		@Pc(45) Class280 local45 = super.anInt5039 == -1 || super.aBoolean343 && local27 != null ? null : Static6.aClass126_1.method3574(super.anInt5039);
		@Pc(53) int local53 = local11.anInt7295;
		@Pc(56) int local56 = local11.anInt7266;
		if (local53 != 0 || local56 != 0 || local11.anInt7292 != 0 || local11.anInt7294 != 0) {
			arg1 |= 0x7;
		}
		@Pc(102) boolean local102 = super.aByte46 != 0 && Static416.anInt7252 >= super.anInt5079 && Static416.anInt7252 < super.anInt5034;
		if (local102) {
			arg1 |= 0x80000;
		}
		@Pc(139) Class19 local139 = super.aClass19Array3[0] = this.aClass238_1.method5858(arg1, super.anInt5021, super.aClass8Array3, super.anInt5063, local27, super.anInt5054, Static109.aClass18_1, super.anInt5074, local45, super.anInt5007, Static6.aClass126_1, arg0, super.anInt5041, Static343.aClass286_1);
		if (local139 == null) {
			return false;
		}
		super.anInt5024 = local139.TA();
		this.method4360(local139);
		@Pc(156) int local156 = super.aClass146_7.method3943();
		if (local53 == 0 && local56 == 0) {
			this.method4353(0, local156, this.method4350() << 7, 0, this.method4350() << 7);
		} else {
			this.method4353(local11.anInt7271, local156, local53, local11.anInt7275, local56);
			if (super.anInt5040 != 0) {
				super.aClass19Array3[0].D(super.anInt5040);
			}
			if (super.anInt5077 != 0) {
				super.aClass19Array3[0].b(super.anInt5077);
			}
			if (super.anInt5078 != 0) {
				super.aClass19Array3[0].ca(0, super.anInt5078, 0);
			}
		}
		if (local102) {
			local139.method7252(super.aByte49, super.aByte48, super.aByte47, super.aByte46 & 0xFF);
		}
		@Pc(265) Class112 local265;
		@Pc(282) boolean local282;
		@Pc(284) int local284;
		@Pc(327) Class19 local327;
		if (super.anInt5052 == -1 || super.anInt5012 == -1) {
			super.aClass19Array3[1] = null;
		} else {
			local265 = Static529.aClass90_2.method2963(super.anInt5052);
			local282 = local265.aByte29 == 3 && (local53 != 0 || local56 != 0);
			local284 = local7;
			if (local282) {
				local284 = local7 | 0x7;
			} else {
				if (super.anInt5028 != 0) {
					local284 = local7 | 0x5;
				}
				if (super.anInt5076 != 0) {
					local284 |= 0x2;
				}
			}
			local327 = super.aClass19Array3[1] = local265.method3309(super.anInt5010, Static6.aClass126_1, super.anInt5012, super.anInt5004, local284, arg0);
			if (local327 != null) {
				if (super.anInt5076 != 0) {
					local327.ca(0, -super.anInt5076 << 0, 0);
				}
				if (super.anInt5028 != 0) {
					local327.OA(super.anInt5028 * 2048);
				}
				if (local282) {
					if (super.anInt5040 != 0) {
						local327.D(super.anInt5040);
					}
					if (super.anInt5077 != 0) {
						local327.b(super.anInt5077);
					}
					if (super.anInt5078 != 0) {
						local327.ca(0, super.anInt5078, 0);
					}
				}
			}
		}
		if (super.anInt5070 == -1 || super.anInt5022 == -1) {
			super.aClass19Array3[3] = null;
		} else {
			local265 = Static529.aClass90_2.method2963(super.anInt5070);
			local282 = local265.aByte29 == 3 && (local53 != 0 || local56 != 0);
			local284 = local7;
			if (local282) {
				local284 = local7 | 0x7;
			} else {
				if (super.anInt5071 != 0) {
					local284 = local7 | 0x5;
				}
				if (super.anInt5019 != 0) {
					local284 |= 0x2;
				}
			}
			local327 = super.aClass19Array3[3] = local265.method3314(Static6.aClass126_1, arg0, super.anInt5022, super.anInt5044, super.anInt5009, local284);
			if (local327 != null) {
				if (super.anInt5019 != 0) {
					local327.ca(0, -super.anInt5019 << 0, 0);
				}
				if (super.anInt5071 != 0) {
					local327.OA(super.anInt5071 * 2048);
				}
				if (local282) {
					if (super.anInt5040 != 0) {
						local327.D(super.anInt5040);
					}
					if (super.anInt5077 != 0) {
						local327.b(super.anInt5077);
					}
					if (super.anInt5078 != 0) {
						local327.ca(0, super.anInt5078, 0);
					}
				}
			}
		}
		super.aClass19Array3[2] = null;
		if (super.aClass1_Sub47_3 != null) {
			if (Static416.anInt7252 >= super.aClass1_Sub47_3.anInt8051) {
				super.aClass1_Sub47_3 = null;
			} else if (Static416.anInt7252 >= super.aClass1_Sub47_3.anInt8052) {
				@Pc(547) Class19 local547 = super.aClass1_Sub47_3.method6836(arg0, local7 | 0x7);
				if (local547 != null) {
					local547.ca(super.aClass1_Sub47_3.anInt8046 - super.anInt8189, super.aClass1_Sub47_3.anInt8048 - super.anInt8192, super.aClass1_Sub47_3.anInt8042 - super.anInt8191);
					if (local156 != 0) {
						local547.OA(local156);
					}
					super.aClass19Array3[2] = local547;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(III)V")
	public void method3705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = super.anIntArray362[0];
		@Pc(20) int local20 = super.anIntArray361[0];
		if (arg1 == 0) {
			local20++;
		}
		if (arg1 == 1) {
			local20++;
			local15++;
		}
		if (arg1 == 2) {
			local15++;
		}
		if (arg1 == 3) {
			local15++;
			local20--;
		}
		if (arg1 == 4) {
			local20--;
		}
		if (arg1 == 5) {
			local15--;
			local20--;
		}
		if (arg1 == 6) {
			local15--;
		}
		if (arg1 == 7) {
			local15--;
			local20++;
		}
		if (super.anInt5018 != -1 && Static6.aClass126_1.method3574(super.anInt5018).anInt8112 == 1) {
			super.anInt5018 = -1;
		}
		@Pc(92) Class112 local92;
		if (super.anInt5052 != -1) {
			local92 = Static529.aClass90_2.method2963(super.anInt5052);
			if (local92.aBoolean233 && local92.anInt3703 != -1 && Static6.aClass126_1.method3574(local92.anInt3703).anInt8112 == 1) {
				super.anInt5052 = -1;
			}
		}
		if (super.anInt5070 != -1) {
			local92 = Static529.aClass90_2.method2963(super.anInt5070);
			if (local92.aBoolean233 && local92.anInt3703 != -1 && Static6.aClass126_1.method3574(local92.anInt3703).anInt8112 == 1) {
				super.anInt5070 = -1;
			}
		}
		if (super.anInt5082 < 9) {
			super.anInt5082++;
		}
		for (@Pc(156) int local156 = super.anInt5082; local156 > 0; local156--) {
			super.anIntArray362[local156] = super.anIntArray362[local156 - 1];
			super.anIntArray361[local156] = super.anIntArray361[local156 - 1];
			super.aByteArray68[local156] = super.aByteArray68[local156 - 1];
		}
		super.anIntArray362[0] = local15;
		super.aByteArray68[0] = (byte) arg0;
		super.anIntArray361[0] = local20;
	}

	@OriginalMember(owner = "client!ica", name = "l", descriptor = "(I)Z")
	public boolean method3706() {
		return this.aClass238_1 != null;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass238_1 == null || !this.method3704(arg1, 131072)) {
			return false;
		}
		@Pc(27) Class22 local27 = arg1.method7642();
		@Pc(32) int local32 = super.aClass146_7.method3943();
		local27.ma(local32);
		local27.TA(super.anInt8189, super.anInt8192, super.anInt8191);
		@Pc(45) boolean local45 = false;
		for (@Pc(47) int local47 = 0; local47 < super.aClass19Array3.length; local47++) {
			if (super.aClass19Array3[local47] != null && super.aClass19Array3[local47].method7257(arg2, arg0, local27, this.aClass238_1.anInt6754 == 1)) {
				local45 = true;
				break;
			}
		}
		super.aClass19Array3[0] = super.aClass19Array3[1] = super.aClass19Array3[2] = super.aClass19Array3[3] = null;
		return local45;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIZII)V")
	public void method3707(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte94 = (byte) arg3;
		if (super.anInt5018 != -1 && Static6.aClass126_1.method3574(super.anInt5018).anInt8112 == 1) {
			super.anInt5018 = -1;
		}
		@Pc(32) Class112 local32;
		if (super.anInt5052 != -1) {
			local32 = Static529.aClass90_2.method2963(super.anInt5052);
			if (local32.aBoolean233 && local32.anInt3703 != -1 && Static6.aClass126_1.method3574(local32.anInt3703).anInt8112 == 1) {
				super.anInt5052 = -1;
			}
		}
		if (super.anInt5070 != -1) {
			local32 = Static529.aClass90_2.method2963(super.anInt5070);
			if (local32.aBoolean233 && local32.anInt3703 != -1 && Static6.aClass126_1.method3574(local32.anInt3703).anInt8112 == 1) {
				super.anInt5070 = -1;
			}
		}
		if (!arg2) {
			@Pc(92) int local92 = arg4 - super.anIntArray362[0];
			@Pc(99) int local99 = arg0 - super.anIntArray361[0];
			if (local92 >= -8 && local92 <= 8 && local99 >= -8 && local99 <= 8) {
				if (super.anInt5082 < 9) {
					super.anInt5082++;
				}
				for (@Pc(130) int local130 = super.anInt5082; local130 > 0; local130--) {
					super.anIntArray362[local130] = super.anIntArray362[local130 - 1];
					super.anIntArray361[local130] = super.anIntArray361[local130 - 1];
					super.aByteArray68[local130] = super.aByteArray68[local130 - 1];
				}
				super.anIntArray362[0] = arg4;
				super.aByteArray68[0] = 1;
				super.anIntArray361[0] = arg0;
				return;
			}
		}
		super.anInt5081 = 0;
		super.anIntArray362[0] = arg4;
		super.anInt5080 = 0;
		super.anInt5082 = 0;
		super.anIntArray361[0] = arg0;
		super.anInt8191 = (super.anIntArray361[0] << 7) + (arg1 << 6);
		super.anInt8189 = (arg1 << 6) + (super.anIntArray362[0] << 7);
		if (super.aClass2_Sub3_6 != null) {
			super.aClass2_Sub3_6.method2080();
		}
	}

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ica", name = "e", descriptor = "(B)I")
	@Override
	public int method6953() {
		return super.anInt5024;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
		if (this.aClass238_1 != null && (super.aBoolean344 || this.method3704(arg0, 0))) {
			this.method4368(super.aBoolean344, super.aClass19Array3, arg0);
			super.aClass19Array3[0] = super.aClass19Array3[1] = super.aClass19Array3[2] = super.aClass19Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!qda;I)V")
	public void method3708(@OriginalArg(0) Class238 arg0) {
		this.aClass238_1 = arg0;
		if (super.aClass2_Sub3_6 != null) {
			super.aClass2_Sub3_6.method2080();
		}
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ica", name = "i", descriptor = "(I)I")
	@Override
	protected int method4366() {
		if (this.aClass238_1.anIntArray511 != null) {
			@Pc(18) Class238 local18 = this.aClass238_1.method5866(Static343.aClass286_1);
			if (local18 != null && local18.anInt6781 != -1) {
				return local18.anInt6781;
			}
		}
		return this.aClass238_1.anInt6781;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(Z)Z")
	private boolean method3710() {
		return this.aClass238_1.aBoolean452;
	}

	@OriginalMember(owner = "client!ica", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return false;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)I")
	@Override
	public int method4358() {
		if (this.aClass238_1.anIntArray511 != null) {
			@Pc(18) Class238 local18 = this.aClass238_1.method5866(Static343.aClass286_1);
			if (local18 != null && local18.anInt6768 != -1) {
				return local18.anInt6768;
			}
		}
		return this.aClass238_1.anInt6768 == -1 ? super.method4358() : this.aClass238_1.anInt6768;
	}
}
