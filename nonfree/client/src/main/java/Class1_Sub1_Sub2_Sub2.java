import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!lk", name = "Hc", descriptor = "[I")
	public static final int[] anIntArray451 = new int[32];

	@OriginalMember(owner = "client!lk", name = "Jc", descriptor = "Lclient!ai;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!lk", name = "Lc", descriptor = "I")
	public int anInt5119 = -1;

	@OriginalMember(owner = "client!lk", name = "wc", descriptor = "I")
	public int anInt5107 = -1;

	static {
		@Pc(12) int local12 = 2;
		for (@Pc(14) int local14 = 0; local14 < 32; local14++) {
			anIntArray451[local14] = local12 - 1;
			local12 += local12;
		}
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)I")
	@Override
	public int method6432() {
		return super.anInt5045;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(III)V")
	public void method4397(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray450[0];
		@Pc(15) int local15 = super.anIntArray449[0];
		if (arg0 == 0) {
			local15++;
		}
		if (arg0 == 1) {
			local15++;
			local10++;
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
		if (super.anInt5051 != -1 && Static396.aClass157_2.method3745(super.anInt5051).anInt126 == 1) {
			super.anInt5051 = -1;
		}
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		@Pc(89) Class226 local89;
		if (super.anInt5097 != -1) {
			local89 = Static305.aClass14_1.method555(super.anInt5097);
			if (local89.aBoolean524 && local89.anInt6964 != -1 && Static396.aClass157_2.method3745(local89.anInt6964).anInt126 == 1) {
				super.anInt5097 = -1;
			}
		}
		if (super.anInt5060 != -1) {
			local89 = Static305.aClass14_1.method555(super.anInt5060);
			if (local89.aBoolean524 && local89.anInt6964 != -1 && Static396.aClass157_2.method3745(local89.anInt6964).anInt126 == 1) {
				super.anInt5060 = -1;
			}
		}
		if (super.anInt5102 < 9) {
			super.anInt5102++;
		}
		for (@Pc(152) int local152 = super.anInt5102; local152 > 0; local152--) {
			super.anIntArray450[local152] = super.anIntArray450[local152 - 1];
			super.anIntArray449[local152] = super.anIntArray449[local152 - 1];
			super.aByteArray87[local152] = super.aByteArray87[local152 - 1];
		}
		super.anIntArray450[0] = local10;
		super.anIntArray449[0] = local15;
		super.aByteArray87[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		if (this.aClass12_1 == null || !this.method4398(2048, arg0)) {
			return null;
		}
		@Pc(17) Class181 local17 = arg0.method6022();
		@Pc(22) int local22 = super.aClass151_7.method3664();
		local17.ma(local22);
		local17.TA(super.anInt7660, super.anInt7657, super.anInt7659);
		@Pc(37) Class24 local37 = this.method4393();
		@Pc(50) Class12 local50 = this.aClass12_1.anIntArray21 == null ? this.aClass12_1 : this.aClass12_1.method455(Static84.aClass302_1);
		if (Static281.aClass2_Sub19_Sub1_1.aBoolean188 && local50.aBoolean24 && local37.aBoolean44) {
			@Pc(75) Class4 local75 = super.anInt5051 != -1 && super.anInt5094 == 0 ? Static396.aClass157_2.method3745(super.anInt5051) : null;
			@Pc(92) Class4 local92 = super.anInt5063 == -1 || super.aBoolean385 && local75 != null ? null : Static396.aClass157_2.method3745(super.anInt5063);
			@Pc(94) int local94 = 0;
			if (super.anInt5026 != 0) {
				local94 = this.method4392();
			}
			@Pc(155) Class63 local155 = Static70.method1446(super.anInt5070, super.anInt5083, this.aClass12_1.aByte7 & 0xFF, local22, this.aClass12_1.lb & 0xFFFF, arg0, super.aClass63Array3[0], local92 == null ? super.anInt5080 : super.anInt5032, this.aClass12_1.aByte10 & 0xFF, local92 == null ? local75 : local92, this.aClass12_1.anInt313, super.anInt5072, this.aClass12_1.aShort11 & 0xFFFF, local94);
			if (local155 != null) {
				@Pc(160) float local160 = arg0.P();
				@Pc(163) float local163 = arg0.ra();
				arg0.method6058(false);
				arg0.la(local160, local163 - 150.0F);
				local155.method7700(local17, null, 0);
				arg0.la(local160, local163);
				arg0.method6058(true);
			}
		}
		@Pc(186) Class6_Sub5 local186 = null;
		if (this.method4404()) {
			local186 = Static356.method2696(super.aClass63Array3.length);
		}
		if (super.aClass6_Sub7_6 == null) {
			arg0.method6046(super.aClass63Array3, local17, local186 == null ? null : local186.aClass6_Sub4Array1, 0);
		} else {
			@Pc(209) Class208 local209 = super.aClass6_Sub7_6.method6400();
			arg0.method6030(super.aClass63Array3, local209, local17, local186 == null ? null : local186.aClass6_Sub4Array1, 0);
		}
		this.method4391(super.aClass63Array3, false, arg0);
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		super.anInt5065 = Static313.anInt6819;
		return local186;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(B)I")
	@Override
	protected int method4395() {
		if (this.aClass12_1.anIntArray21 != null) {
			@Pc(21) Class12 local21 = this.aClass12_1.method455(Static84.aClass302_1);
			if (local21 != null && local21.anInt320 != -1) {
				return local21.anInt320;
			}
		}
		return this.aClass12_1.anInt320;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILclient!qa;)Z")
	private boolean method4398(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(13) Class24 local13 = this.method4393();
		@Pc(29) Class4 local29 = super.anInt5051 != -1 && super.anInt5094 == 0 ? Static396.aClass157_2.method3745(super.anInt5051) : null;
		@Pc(47) Class4 local47 = super.anInt5063 == -1 || super.aBoolean385 && local29 != null ? null : Static396.aClass157_2.method3745(super.anInt5063);
		@Pc(50) int local50 = local13.anInt649;
		@Pc(53) int local53 = local13.anInt670;
		if (local50 != 0 || local53 != 0 || local13.anInt647 != 0 || local13.anInt654 != 0) {
			arg0 |= 0x7;
		}
		@Pc(90) boolean local90 = super.aByte71 != 0 && super.anInt5091 <= Static115.anInt2326 && Static115.anInt2326 < super.anInt5095;
		if (local90) {
			arg0 |= 0x80000;
		}
		@Pc(127) Class63 local127 = super.aClass63Array3[0] = this.aClass12_1.method458(super.anInt5071, super.anInt5030, super.anInt5029, arg1, local47, Static396.aClass157_2, super.anInt5080, Static84.aClass302_1, super.aClass149Array3, local29, Static492.aClass218_1, super.anInt5032, arg0, super.anInt5037);
		if (local127 == null) {
			return false;
		}
		super.anInt5045 = local127.TA();
		this.method4389(local127);
		@Pc(146) int local146 = super.aClass151_7.method3664();
		if (local50 == 0 && local53 == 0) {
			this.method4386(local146, 0, this.method4394() << 7, 0, this.method4394() << 7);
		} else {
			this.method4386(local146, local13.anInt674, local53, local13.anInt657, local50);
			if (super.anInt5070 != 0) {
				super.aClass63Array3[0].D(super.anInt5070);
			}
			if (super.anInt5072 != 0) {
				super.aClass63Array3[0].b(super.anInt5072);
			}
			if (super.anInt5083 != 0) {
				super.aClass63Array3[0].ca(0, super.anInt5083, 0);
			}
		}
		if (local90) {
			local127.method7694(super.aByte70, super.aByte72, super.aByte69, super.aByte71 & 0xFF);
		}
		@Pc(264) Class226 local264;
		@Pc(281) boolean local281;
		@Pc(283) int local283;
		@Pc(329) Class63 local329;
		if (super.anInt5097 == -1 || super.anInt5031 == -1) {
			super.aClass63Array3[1] = null;
		} else {
			local264 = Static305.aClass14_1.method555(super.anInt5097);
			local281 = local264.aByte89 == 3 && (local50 != 0 || local53 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt5077 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt5074 != 0) {
					local283 |= 0x2;
				}
			}
			local329 = super.aClass63Array3[1] = local264.method5917(arg1, local283, super.anInt5050, Static396.aClass157_2, super.anInt5031, super.anInt5081);
			if (local329 != null) {
				if (super.anInt5074 != 0) {
					local329.ca(0, -super.anInt5074 << 0, 0);
				}
				if (super.anInt5077 != 0) {
					local329.OA(super.anInt5077 * 2048);
				}
				if (local281) {
					if (super.anInt5070 != 0) {
						local329.D(super.anInt5070);
					}
					if (super.anInt5072 != 0) {
						local329.b(super.anInt5072);
					}
					if (super.anInt5083 != 0) {
						local329.ca(0, super.anInt5083, 0);
					}
				}
			}
		}
		if (super.anInt5060 == -1 || super.anInt5034 == -1) {
			super.aClass63Array3[3] = null;
		} else {
			local264 = Static305.aClass14_1.method555(super.anInt5060);
			local281 = local264.aByte89 == 3 && (local50 != 0 || local53 != 0);
			local283 = local7;
			if (local281) {
				local283 = local7 | 0x7;
			} else {
				if (super.anInt5099 != 0) {
					local283 = local7 | 0x5;
				}
				if (super.anInt5067 != 0) {
					local283 |= 0x2;
				}
			}
			local329 = super.aClass63Array3[3] = local264.method5915(super.anInt5034, arg1, super.anInt5041, super.anInt5101, local283, Static396.aClass157_2);
			if (local329 != null) {
				if (super.anInt5067 != 0) {
					local329.ca(0, -super.anInt5067 << 0, 0);
				}
				if (super.anInt5099 != 0) {
					local329.OA(super.anInt5099 * 2048);
				}
				if (local281) {
					if (super.anInt5070 != 0) {
						local329.D(super.anInt5070);
					}
					if (super.anInt5072 != 0) {
						local329.b(super.anInt5072);
					}
					if (super.anInt5083 != 0) {
						local329.ca(0, super.anInt5083, 0);
					}
				}
			}
		}
		super.aClass63Array3[2] = null;
		if (super.aClass2_Sub47_3 != null) {
			if (super.aClass2_Sub47_3.anInt9145 <= Static115.anInt2326) {
				super.aClass2_Sub47_3 = null;
			} else if (super.aClass2_Sub47_3.anInt9135 <= Static115.anInt2326) {
				@Pc(554) Class63 local554 = super.aClass2_Sub47_3.method7632(arg1, local7 | 0x7);
				if (local554 != null) {
					local554.ca(super.aClass2_Sub47_3.anInt9136 - super.anInt7660, -super.anInt7657 + super.aClass2_Sub47_3.anInt9143, super.aClass2_Sub47_3.anInt9140 - super.anInt7659);
					if (local146 != 0) {
						local554.OA(local146);
					}
					super.aClass63Array3[2] = local554;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "(I)Z")
	public boolean method4399() {
		return this.aClass12_1 != null;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIZ)V")
	public void method4400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		super.aByte90 = (byte) arg0;
		if (super.anInt5051 != -1 && Static396.aClass157_2.method3745(super.anInt5051).anInt126 == 1) {
			super.anInt5051 = -1;
		}
		@Pc(39) Class226 local39;
		if (super.anInt5097 != -1) {
			local39 = Static305.aClass14_1.method555(super.anInt5097);
			if (local39.aBoolean524 && local39.anInt6964 != -1 && Static396.aClass157_2.method3745(local39.anInt6964).anInt126 == 1) {
				super.anInt5097 = -1;
			}
		}
		if (super.anInt5060 != -1) {
			local39 = Static305.aClass14_1.method555(super.anInt5060);
			if (local39.aBoolean524 && local39.anInt6964 != -1 && Static396.aClass157_2.method3745(local39.anInt6964).anInt126 == 1) {
				super.anInt5060 = -1;
			}
		}
		if (!arg4) {
			@Pc(97) int local97 = arg2 - super.anIntArray450[0];
			@Pc(104) int local104 = arg1 - super.anIntArray449[0];
			if (local97 >= -8 && local97 <= 8 && local104 >= -8 && local104 <= 8) {
				if (super.anInt5102 < 9) {
					super.anInt5102++;
				}
				for (@Pc(133) int local133 = super.anInt5102; local133 > 0; local133--) {
					super.anIntArray450[local133] = super.anIntArray450[local133 - 1];
					super.anIntArray449[local133] = super.anIntArray449[local133 - 1];
					super.aByteArray87[local133] = super.aByteArray87[local133 - 1];
				}
				super.anIntArray450[0] = arg2;
				super.aByteArray87[0] = 1;
				super.anIntArray449[0] = arg1;
				return;
			}
		}
		super.anIntArray450[0] = arg2;
		super.anInt5102 = 0;
		super.anInt5104 = 0;
		super.anInt5105 = 0;
		super.anIntArray449[0] = arg1;
		super.anInt7660 = (arg3 << 6) + (super.anIntArray450[0] << 7);
		super.anInt7659 = (super.anIntArray449[0] << 7) + (arg3 << 6);
		if (super.aClass6_Sub7_6 != null) {
			super.aClass6_Sub7_6.method6396();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ai;I)V")
	public void method4401(@OriginalArg(0) Class12 arg0) {
		this.aClass12_1 = arg0;
		if (super.aClass6_Sub7_6 != null) {
			super.aClass6_Sub7_6.method6396();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
		if (this.aClass12_1 != null && (super.aBoolean387 || this.method4398(0, arg0))) {
			this.method4391(super.aClass63Array3, super.aBoolean387, arg0);
			super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)I")
	@Override
	public int method4384() {
		if (this.aClass12_1.anIntArray21 != null) {
			@Pc(13) Class12 local13 = this.aClass12_1.method455(Static84.aClass302_1);
			if (local13 != null && local13.anInt330 != -1) {
				return local13.anInt330;
			}
		}
		return this.aClass12_1.anInt330;
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
	@Override
	public int method4379() {
		if (this.aClass12_1.anIntArray21 != null) {
			@Pc(25) Class12 local25 = this.aClass12_1.method455(Static84.aClass302_1);
			if (local25 != null && local25.anInt332 != -1) {
				return local25.anInt332;
			}
		}
		return this.aClass12_1.anInt332 == -1 ? super.method4379() : this.aClass12_1.anInt332;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(Z)Z")
	private boolean method4404() {
		return this.aClass12_1.aBoolean26;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		if (this.aClass12_1 == null || !this.method4398(131072, arg1)) {
			return false;
		}
		@Pc(27) Class181 local27 = arg1.method6022();
		@Pc(32) int local32 = super.aClass151_7.method3664();
		local27.ma(local32);
		local27.TA(super.anInt7660, super.anInt7657, super.anInt7659);
		@Pc(45) boolean local45 = false;
		for (@Pc(47) int local47 = 0; super.aClass63Array3.length > local47; local47++) {
			if (super.aClass63Array3[local47] != null && super.aClass63Array3[local47].method7697(arg0, arg2, local27, this.aClass12_1.anInt313 == 1)) {
				local45 = true;
				break;
			}
		}
		super.aClass63Array3[0] = super.aClass63Array3[1] = super.aClass63Array3[2] = super.aClass63Array3[3] = null;
		return local45;
	}
}
