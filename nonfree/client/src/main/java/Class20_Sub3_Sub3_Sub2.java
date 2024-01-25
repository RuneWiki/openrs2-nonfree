import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class20_Sub3_Sub3_Sub2 extends Class20_Sub3_Sub3 {

	@OriginalMember(owner = "client!se", name = "Mc", descriptor = "Lclient!va;")
	public Class246 aClass246_1;

	@OriginalMember(owner = "client!se", name = "Gc", descriptor = "I")
	public int anInt6098 = -1;

	@OriginalMember(owner = "client!se", name = "Fc", descriptor = "I")
	public int anInt6097 = -1;

	@OriginalMember(owner = "client!se", name = "i", descriptor = "(I)Z")
	public boolean method4693() {
		return this.aClass246_1 != null;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
	@Override
	public void method5111() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)I")
	@Override
	public int method4683() {
		if (this.aClass246_1.anIntArray459 != null) {
			@Pc(20) Class246 local20 = this.aClass246_1.method5255(Static364.aClass259_1);
			if (local20 != null && local20.anInt6841 != -1) {
				return local20.anInt6841;
			}
		}
		return this.aClass246_1.anInt6841;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!qa;IB)Z")
	private boolean method4694(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1;
		@Pc(16) Class51 local16 = this.method4676();
		@Pc(32) Class171 local32 = super.anInt6051 != -1 && super.anInt6040 == 0 ? Static152.aClass213_1.method4410(super.anInt6051) : null;
		@Pc(49) Class171 local49 = super.anInt6037 == -1 || super.aBoolean502 && local32 != null ? null : Static152.aClass213_1.method4410(super.anInt6037);
		@Pc(52) int local52 = local16.anInt1301;
		@Pc(55) int local55 = local16.anInt1325;
		if (local52 != 0 || local55 != 0 || local16.anInt1293 != 0 || local16.anInt1299 != 0) {
			arg1 |= 0x7;
		}
		@Pc(98) boolean local98 = super.aByte78 != 0 && Static368.anInt6250 >= super.anInt6024 && super.anInt6055 > Static368.anInt6250;
		if (local98) {
			arg1 |= 0x80000;
		}
		@Pc(135) Class33 local135 = super.aClass33Array3[0] = this.aClass246_1.method5245(super.anInt6083, super.anInt6039, arg1, local32, Static364.aClass259_1, super.anInt6013, super.anInt6044, super.aClass99Array3, Static332.aClass174_1, Static152.aClass213_1, super.anInt6022, arg0, local49, super.anInt6068);
		if (local135 == null) {
			return false;
		}
		super.anInt6017 = local135.b();
		this.method4681(local135);
		@Pc(152) int local152 = super.aClass145_7.method2946();
		if (local52 == 0 && local55 == 0) {
			this.method4690(this.method4678() << 7, local152, this.method4678() << 7, 0, 0);
		} else {
			this.method4690(local55, local152, local52, local16.anInt1319, local16.anInt1296);
			if (super.anInt6057 != 0) {
				super.aClass33Array3[0].WA(super.anInt6057);
			}
			if (super.anInt6064 != 0) {
				super.aClass33Array3[0].o(super.anInt6064);
			}
			if (super.anInt6072 != 0) {
				super.aClass33Array3[0].ja(0, super.anInt6072, 0);
			}
		}
		if (local98) {
			local135.method5389(super.aByte80, super.aByte77, super.aByte79, super.aByte78 & 0xFF);
		}
		@Pc(257) Class14 local257;
		@Pc(269) boolean local269;
		@Pc(271) int local271;
		@Pc(314) Class33 local314;
		if (super.anInt6014 == -1 || super.anInt6041 == -1) {
			super.aClass33Array3[1] = null;
		} else {
			local257 = Static44.aClass190_2.method4005(super.anInt6014);
			local269 = local257.aByte2 == 3 && (local52 != 0 || local55 != 0);
			local271 = local12;
			if (local269) {
				local271 = local12 | 0x7;
			} else {
				if (super.anInt6028 != 0) {
					local271 = local12 | 0x5;
				}
				if (super.anInt6050 != 0) {
					local271 |= 0x2;
				}
			}
			local314 = super.aClass33Array3[1] = local257.method268(super.anInt6041, arg0, super.anInt6069, super.anInt6030, Static152.aClass213_1, local271);
			if (local314 != null) {
				if (super.anInt6050 != 0) {
					local314.ja(0, -super.anInt6050 << 0, 0);
				}
				if (super.anInt6028 != 0) {
					local314.k(super.anInt6028 * 2048);
				}
				if (local269) {
					if (super.anInt6057 != 0) {
						local314.WA(super.anInt6057);
					}
					if (super.anInt6064 != 0) {
						local314.o(super.anInt6064);
					}
					if (super.anInt6072 != 0) {
						local314.ja(0, super.anInt6072, 0);
					}
				}
			}
		}
		if (super.anInt6019 == -1 || super.anInt6071 == -1) {
			super.aClass33Array3[3] = null;
		} else {
			local257 = Static44.aClass190_2.method4005(super.anInt6019);
			local269 = local257.aByte2 == 3 && (local52 != 0 || local55 != 0);
			local271 = local12;
			if (local269) {
				local271 = local12 | 0x7;
			} else {
				if (super.anInt6066 != 0) {
					local271 = local12 | 0x5;
				}
				if (super.anInt6011 != 0) {
					local271 |= 0x2;
				}
			}
			local314 = super.aClass33Array3[3] = local257.method276(super.anInt6073, super.anInt6035, Static152.aClass213_1, arg0, local271, super.anInt6071);
			if (local314 != null) {
				if (super.anInt6011 != 0) {
					local314.ja(0, -super.anInt6011 << 0, 0);
				}
				if (super.anInt6066 != 0) {
					local314.k(super.anInt6066 * 2048);
				}
				if (local269) {
					if (super.anInt6057 != 0) {
						local314.WA(super.anInt6057);
					}
					if (super.anInt6064 != 0) {
						local314.o(super.anInt6064);
					}
					if (super.anInt6072 != 0) {
						local314.ja(0, super.anInt6072, 0);
					}
				}
			}
		}
		super.aClass33Array3[2] = null;
		if (super.aClass1_Sub38_3 != null) {
			if (Static368.anInt6250 >= super.aClass1_Sub38_3.anInt6266) {
				super.aClass1_Sub38_3 = null;
			} else if (Static368.anInt6250 >= super.aClass1_Sub38_3.anInt6275) {
				@Pc(558) Class33 local558 = super.aClass1_Sub38_3.method4823(local12 | 0x7, arg0);
				if (local558 != null) {
					local558.ja(-super.anInt6613 + super.aClass1_Sub38_3.anInt6263, -super.anInt6615 + super.aClass1_Sub38_3.anInt6272, -super.anInt6616 + super.aClass1_Sub38_3.anInt6279);
					if (local152 != 0) {
						local558.k(local152);
					}
					super.aClass33Array3[2] = local558;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!va;I)V")
	public void method4695(@OriginalArg(0) Class246 arg0) {
		this.aClass246_1 = arg0;
		if (super.aClass13_Sub2_6 != null) {
			super.aClass13_Sub2_6.method697();
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		if (this.aClass246_1 == null || !this.method4694(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class40 local17 = arg0.method3600();
		@Pc(22) int local22 = super.aClass145_7.method2946();
		local17.O(local22);
		local17.ZA(super.anInt6613, super.anInt6615, super.anInt6616);
		@Pc(37) Class51 local37 = this.method4676();
		@Pc(50) Class246 local50 = this.aClass246_1.anIntArray459 == null ? this.aClass246_1 : this.aClass246_1.method5255(Static364.aClass259_1);
		if (Static336.aClass106_Sub1_1.aBoolean473 && local50.aBoolean558 && local37.aBoolean103) {
			@Pc(74) Class171 local74 = super.anInt6051 != -1 && super.anInt6040 == 0 ? Static152.aClass213_1.method4410(super.anInt6051) : null;
			@Pc(92) Class171 local92 = super.anInt6037 == -1 || super.aBoolean502 && local74 != null ? null : Static152.aClass213_1.method4410(super.anInt6037);
			@Pc(144) Class33 local144 = Static168.method2298(local92 == null ? local74 : local92, arg0, super.anInt6072, this.aClass246_1.anInt6830, super.aClass33Array3[0], super.aBoolean501, this.aClass246_1.aShort90 & 0xFFFF, local22, local92 == null ? super.anInt6044 : super.anInt6013, super.anInt6064, this.aClass246_1.aShort91 & 0xFFFF, this.aClass246_1.aByte96 & 0xFF, super.anInt6057, this.aClass246_1.aByte97 & 0xFF);
			if (local144 != null) {
				@Pc(149) float local149 = arg0.la();
				@Pc(152) float local152 = arg0.w();
				arg0.method3598(false);
				arg0.o(local149, local152 - 150.0F);
				local144.method5391(local17, null, 0);
				arg0.o(local149, local152);
				arg0.method3598(true);
			}
		}
		@Pc(175) Class13_Sub4 local175 = null;
		if (this.method4700()) {
			local175 = Static192.method2550(super.aClass33Array3.length);
		}
		if (super.aClass13_Sub2_6 == null) {
			arg0.method3541(super.aClass33Array3, local17, local175 == null ? null : local175.aClass13_Sub8Array1, 0);
		} else {
			@Pc(206) Class194 local206 = super.aClass13_Sub2_6.method702();
			arg0.method3546(super.aClass33Array3, local206, local17, local175 == null ? null : local175.aClass13_Sub8Array1, 0);
		}
		this.method4680(false, arg0, super.aClass33Array3);
		if (super.aClass33Array3[2] != null) {
			if (local22 != 0) {
				super.aClass33Array3[2].k(local22);
			}
			super.aClass33Array3[2].ja(-super.aClass1_Sub38_3.anInt6263 + super.anInt6613, super.anInt6615 + -super.aClass1_Sub38_3.anInt6272, super.anInt6616 - super.aClass1_Sub38_3.anInt6279);
		}
		super.anInt6061 = Static116.anInt5420;
		super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = super.aClass33Array3[3] = null;
		return local175;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)I")
	@Override
	public int method4684() {
		if (this.aClass246_1.anIntArray459 != null) {
			@Pc(13) Class246 local13 = this.aClass246_1.method5255(Static364.aClass259_1);
			if (local13 != null && local13.anInt6847 != -1) {
				return local13.anInt6847;
			}
		}
		return this.aClass246_1.anInt6847 == -1 ? super.method4684() : this.aClass246_1.anInt6847;
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)I")
	@Override
	protected int method4682() {
		if (this.aClass246_1.anIntArray459 != null) {
			@Pc(21) Class246 local21 = this.aClass246_1.method5255(Static364.aClass259_1);
			if (local21 != null && local21.anInt6831 != -1) {
				return local21.anInt6831;
			}
		}
		return this.aClass246_1.anInt6831;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BIIIZI)V")
	public void method4697(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte89 = (byte) arg4;
		if (super.anInt6051 != -1 && Static152.aClass213_1.method4410(super.anInt6051).anInt4259 == 1) {
			super.anInt6051 = -1;
		}
		@Pc(36) Class14 local36;
		if (super.anInt6014 != -1) {
			local36 = Static44.aClass190_2.method4005(super.anInt6014);
			if (local36.aBoolean27 && local36.anInt325 != -1 && Static152.aClass213_1.method4410(local36.anInt325).anInt4259 == 1) {
				super.anInt6014 = -1;
			}
		}
		if (super.anInt6019 != -1) {
			local36 = Static44.aClass190_2.method4005(super.anInt6019);
			if (local36.aBoolean27 && local36.anInt325 != -1 && Static152.aClass213_1.method4410(local36.anInt325).anInt4259 == 1) {
				super.anInt6019 = -1;
			}
		}
		if (!arg3) {
			@Pc(95) int local95 = arg2 - super.anIntArray370[0];
			@Pc(103) int local103 = arg0 - super.anIntArray369[0];
			if (local95 >= -8 && local95 <= 8 && local103 >= -8 && local103 <= 8) {
				if (super.anInt6088 < 9) {
					super.anInt6088++;
				}
				for (@Pc(132) int local132 = super.anInt6088; local132 > 0; local132--) {
					super.anIntArray370[local132] = super.anIntArray370[local132 - 1];
					super.anIntArray369[local132] = super.anIntArray369[local132 - 1];
					super.aByteArray67[local132] = super.aByteArray67[local132 - 1];
				}
				super.anIntArray370[0] = arg2;
				super.anIntArray369[0] = arg0;
				super.aByteArray67[0] = 1;
				return;
			}
		}
		super.anInt6086 = 0;
		super.anIntArray370[0] = arg2;
		super.anInt6088 = 0;
		super.anInt6087 = 0;
		super.anIntArray369[0] = arg0;
		super.anInt6616 = (arg1 << 6) + (super.anIntArray369[0] << 7);
		super.anInt6613 = (super.anIntArray370[0] << 7) + (arg1 << 6);
		if (super.aClass13_Sub2_6 != null) {
			super.aClass13_Sub2_6.method697();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
		if (this.aClass246_1 != null && (super.aBoolean504 || this.method4694(arg0, 0))) {
			this.method4680(super.aBoolean504, arg0, super.aClass33Array3);
			super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = super.aClass33Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	public void method4698(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray370[0];
		@Pc(15) int local15 = super.anIntArray369[0];
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
		if (arg0 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt6051 != -1 && Static152.aClass213_1.method4410(super.anInt6051).anInt4259 == 1) {
			super.anInt6051 = -1;
		}
		@Pc(85) Class14 local85;
		if (super.anInt6014 != -1) {
			local85 = Static44.aClass190_2.method4005(super.anInt6014);
			if (local85.aBoolean27 && local85.anInt325 != -1 && Static152.aClass213_1.method4410(local85.anInt325).anInt4259 == 1) {
				super.anInt6014 = -1;
			}
		}
		if (super.anInt6019 != -1) {
			local85 = Static44.aClass190_2.method4005(super.anInt6019);
			if (local85.aBoolean27 && local85.anInt325 != -1 && Static152.aClass213_1.method4410(local85.anInt325).anInt4259 == 1) {
				super.anInt6019 = -1;
			}
		}
		if (super.anInt6088 < 9) {
			super.anInt6088++;
		}
		for (@Pc(149) int local149 = super.anInt6088; local149 > 0; local149--) {
			super.anIntArray370[local149] = super.anIntArray370[local149 - 1];
			super.anIntArray369[local149] = super.anIntArray369[local149 - 1];
			super.aByteArray67[local149] = super.aByteArray67[local149 - 1];
		}
		super.anIntArray370[0] = local10;
		super.anIntArray369[0] = local15;
		super.aByteArray67[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!se", name = "j", descriptor = "(I)Z")
	private boolean method4700() {
		return this.aClass246_1.aBoolean563;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZIILclient!er;Lclient!qa;IB)V")
	@Override
	public void method5116(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20 arg3, @OriginalArg(4) Class128 arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		if (this.aClass246_1 == null || !this.method4694(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class40 local19 = arg2.method3600();
		@Pc(24) int local24 = super.aClass145_7.method2946();
		local19.O(local24);
		local19.ZA(super.anInt6613, super.anInt6615, super.anInt6616);
		@Pc(37) boolean local37 = false;
		for (@Pc(47) int local47 = 0; super.aClass33Array3.length > local47; local47++) {
			if (super.aClass33Array3[local47] != null && super.aClass33Array3[local47].method5395(arg0, arg1, local19, this.aClass246_1.anInt6830 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass33Array3[0] = super.aClass33Array3[1] = super.aClass33Array3[2] = super.aClass33Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!se", name = "e", descriptor = "(I)I")
	@Override
	public int method5097() {
		return super.anInt6017;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5110() {
		return false;
	}
}
