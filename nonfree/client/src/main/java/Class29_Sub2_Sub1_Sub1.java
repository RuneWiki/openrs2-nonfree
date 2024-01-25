import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class29_Sub2_Sub1_Sub1 extends Class29_Sub2_Sub1 {

	@OriginalMember(owner = "client!dw", name = "Tc", descriptor = "Lclient!qba;")
	public Class257 aClass257_1;

	@OriginalMember(owner = "client!dw", name = "Lc", descriptor = "I")
	public int anInt1815 = -1;

	@OriginalMember(owner = "client!dw", name = "Sc", descriptor = "I")
	public int anInt1820 = -1;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V")
	@Override
	public void method7537() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "(I)I")
	@Override
	public int method7546() {
		return super.anInt8557;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIBZI)V")
	public void method1586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte103 = (byte) arg0;
		if (super.anInt8538 != -1 && Static31.aClass345_1.method7798(super.anInt8538).anInt2594 == 1) {
			super.anInt8538 = -1;
		}
		@Pc(34) Class237 local34;
		if (super.anInt8525 != -1) {
			local34 = Static448.aClass117_2.method2317(super.anInt8525);
			if (local34.aBoolean443 && local34.anInt6458 != -1 && Static31.aClass345_1.method7798(local34.anInt6458).anInt2594 == 1) {
				super.anInt8525 = -1;
			}
		}
		if (super.anInt8534 != -1) {
			local34 = Static448.aClass117_2.method2317(super.anInt8534);
			if (local34.aBoolean443 && local34.anInt6458 != -1 && Static31.aClass345_1.method7798(local34.anInt6458).anInt2594 == 1) {
				super.anInt8534 = -1;
			}
		}
		if (!arg3) {
			@Pc(98) int local98 = arg2 - super.anIntArray661[0];
			@Pc(106) int local106 = arg1 - super.anIntArray660[0];
			if (local98 >= -8 && local98 <= 8 && local106 >= -8 && local106 <= 8) {
				if (super.anInt8582 < 9) {
					super.anInt8582++;
				}
				for (@Pc(135) int local135 = super.anInt8582; local135 > 0; local135--) {
					super.anIntArray661[local135] = super.anIntArray661[local135 - 1];
					super.anIntArray660[local135] = super.anIntArray660[local135 - 1];
					super.aByteArray110[local135] = super.aByteArray110[local135 - 1];
				}
				super.anIntArray661[0] = arg2;
				super.aByteArray110[0] = 1;
				super.anIntArray660[0] = arg1;
				return;
			}
		}
		super.anInt8584 = 0;
		super.anIntArray661[0] = arg2;
		super.anInt8583 = 0;
		super.anInt8582 = 0;
		super.anIntArray660[0] = arg1;
		super.anInt9218 = (super.anIntArray660[0] << 9) + (arg4 << 8);
		super.anInt9222 = (super.anIntArray661[0] << 9) + (arg4 << 8);
		if (super.aClass102_Sub6_8 != null) {
			super.aClass102_Sub6_8.method6836();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7540() {
		return false;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)Z")
	public boolean method1587() {
		return this.aClass257_1 != null;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Z)Z")
	private boolean method1588() {
		return this.aClass257_1.aBoolean504;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)I")
	@Override
	public int method7001() {
		if (this.aClass257_1.anIntArray571 != null) {
			@Pc(13) Class257 local13 = this.aClass257_1.method5935(Static505.aClass30_1);
			if (local13 != null && local13.anInt7130 != -1) {
				return local13.anInt7130;
			}
		}
		return this.aClass257_1.anInt7130;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		if (this.aClass257_1 == null || !this.method1591(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class34 local17 = arg0.method7096();
		@Pc(22) int local22 = super.aClass293_7.method6528();
		local17.a(local22);
		local17.G(super.anInt9222, super.anInt9223 - 20, super.anInt9218);
		@Pc(39) Class120 local39 = this.method7009();
		@Pc(52) Class257 local52 = this.aClass257_1.anIntArray571 == null ? this.aClass257_1 : this.aClass257_1.method5935(Static505.aClass30_1);
		if (Static480.aClass6_Sub37_Sub1_1.aBoolean413 && local52.aBoolean498 && local39.aBoolean191) {
			@Pc(85) Class108 local85 = super.anInt8538 != -1 && super.anInt8563 == 0 ? Static31.aClass345_1.method7798(super.anInt8538) : null;
			@Pc(103) Class108 local103 = super.anInt8535 == -1 || super.aBoolean597 && local85 != null ? null : Static31.aClass345_1.method7798(super.anInt8535);
			@Pc(105) int local105 = 0;
			if (super.anInt8553 != 0) {
				local105 = this.method6994();
			}
			@Pc(166) Class22 local166 = Static131.method1968(local103 == null ? super.anInt8536 : super.anInt8581, super.anInt8520, arg0, super.aClass22Array3[0], this.aClass257_1.aByte67 & 0xFF, local103 == null ? local85 : local103, super.anInt8508, this.aClass257_1.aByte70 & 0xFF, this.aClass257_1.anInt7167, super.anInt8562, local22, this.aClass257_1.aShort95 & 0xFFFF, local105, this.aClass257_1.aShort96 & 0xFFFF);
			if (local166 != null) {
				arg0.method7129(false);
				local166.method4689(local17, null, 0);
				arg0.method7129(true);
			}
		}
		local17.a(local22);
		local17.G(super.anInt9222, super.anInt9223 - 5, super.anInt9218);
		@Pc(194) Class102_Sub2 local194 = null;
		if (this.method1588()) {
			local194 = Static228.method3369(super.aClass22Array3.length);
		}
		this.method7004(super.aClass22Array3, false, local17, arg0);
		if (super.aClass102_Sub6_8 == null) {
			arg0.method7136(super.aClass22Array3, local17, local194 == null ? null : local194.aClass102_Sub5Array1, 0);
		} else {
			@Pc(233) Class222 local233 = super.aClass102_Sub6_8.method6847();
			arg0.method7151(super.aClass22Array3, local233, local17, local194 == null ? null : local194.aClass102_Sub5Array1, 0);
		}
		super.anInt8573 = Static43.anInt710;
		super.aClass22Array3[0] = super.aClass22Array3[1] = super.aClass22Array3[2] = super.aClass22Array3[3] = null;
		return local194;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
		if (this.aClass257_1 == null || !super.aBoolean600 && !this.method1591(arg0, 0)) {
			return;
		}
		@Pc(24) Class34 local24 = arg0.method7096();
		local24.a(super.aClass293_7.method6528());
		local24.G(super.anInt9222, super.anInt9223 - 20, super.anInt9218);
		this.method7004(super.aClass22Array3, super.aBoolean600, local24, arg0);
		super.aClass22Array3[0] = super.aClass22Array3[1] = super.aClass22Array3[2] = super.aClass22Array3[3] = null;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)I")
	@Override
	protected int method6995() {
		if (this.aClass257_1.anIntArray571 != null) {
			@Pc(18) Class257 local18 = this.aClass257_1.method5935(Static505.aClass30_1);
			if (local18 != null && local18.anInt7149 != -1) {
				return local18.anInt7149;
			}
		}
		return this.aClass257_1.anInt7149;
	}

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "(I)I")
	@Override
	public int method7010() {
		if (this.aClass257_1.anIntArray571 != null) {
			@Pc(21) Class257 local21 = this.aClass257_1.method5935(Static505.aClass30_1);
			if (local21 != null && local21.anInt7148 != -1) {
				return local21.anInt7148;
			}
		}
		return this.aClass257_1.anInt7148 == -1 ? super.method7010() : this.aClass257_1.anInt7148;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!bo;ILclient!oa;IIIZ)V")
	@Override
	public void method7543(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!oa;BI)Z")
	private boolean method1591(@OriginalArg(0) Class121 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class120 local11 = this.method7009();
		@Pc(27) Class108 local27 = super.anInt8538 != -1 && super.anInt8563 == 0 ? Static31.aClass345_1.method7798(super.anInt8538) : null;
		@Pc(45) Class108 local45 = super.anInt8535 == -1 || super.aBoolean597 && local27 != null ? null : Static31.aClass345_1.method7798(super.anInt8535);
		@Pc(53) int local53 = local11.anInt2894;
		@Pc(56) int local56 = local11.anInt2899;
		if (local53 != 0 || local56 != 0 || local11.anInt2892 != 0 || local11.anInt2879 != 0) {
			arg1 |= 0x7;
		}
		@Pc(89) boolean local89 = super.aByte98 != 0 && super.anInt8565 <= Static358.anInt6263 && Static358.anInt6263 < super.anInt8578;
		if (local89) {
			arg1 |= 0x80000;
		}
		@Pc(126) Class22 local126 = super.aClass22Array3[0] = this.aClass257_1.method5936(super.anInt8577, super.aClass325Array3, super.anInt8536, super.anInt8540, Static492.aClass189_1, local27, Static31.aClass345_1, Static505.aClass30_1, super.anInt8532, local45, super.anInt8581, arg1, arg0, super.anInt8515);
		if (local126 == null) {
			return false;
		}
		super.anInt8557 = local126.DA();
		this.method7002(local126);
		@Pc(145) int local145 = super.aClass293_7.method6528();
		if (local53 == 0 && local56 == 0) {
			this.method7006(this.method7008() << 9, local145, 0, 0, this.method7008() << 9);
		} else {
			this.method7006(local53, local145, local11.anInt2875, local11.anInt2890, local56);
			if (super.anInt8520 != 0) {
				super.aClass22Array3[0].AA(super.anInt8520);
			}
			if (super.anInt8562 != 0) {
				super.aClass22Array3[0].v(super.anInt8562);
			}
			if (super.anInt8508 != 0) {
				super.aClass22Array3[0].m(0, super.anInt8508, 0);
			}
		}
		if (local89) {
			local126.method4690(super.aByte99, super.lb, super.aByte97, super.aByte98 & 0xFF);
		}
		@Pc(258) Class237 local258;
		@Pc(275) boolean local275;
		@Pc(277) int local277;
		@Pc(320) Class22 local320;
		if (super.anInt8525 == -1 || super.anInt8542 == -1) {
			super.aClass22Array3[1] = null;
		} else {
			local258 = Static448.aClass117_2.method2317(super.anInt8525);
			local275 = local258.aByte63 == 3 && (local53 != 0 || local56 != 0);
			local277 = local7;
			if (local275) {
				local277 = local7 | 0x7;
			} else {
				if (super.anInt8530 != 0) {
					local277 = local7 | 0x5;
				}
				if (super.anInt8519 != 0) {
					local277 |= 0x2;
				}
			}
			local320 = super.aClass22Array3[1] = local258.method5496(super.anInt8561, super.anInt8529, super.anInt8542, local277, arg0, Static31.aClass345_1);
			if (local320 != null) {
				if (super.anInt8519 != 0) {
					local320.m(0, -super.anInt8519 << 2, 0);
				}
				if (super.anInt8530 != 0) {
					local320.I(super.anInt8530 * 2048);
				}
				if (local275) {
					if (super.anInt8520 != 0) {
						local320.AA(super.anInt8520);
					}
					if (super.anInt8562 != 0) {
						local320.v(super.anInt8562);
					}
					if (super.anInt8508 != 0) {
						local320.m(0, super.anInt8508, 0);
					}
				}
			}
		}
		if (super.anInt8534 == -1 || super.anInt8555 == -1) {
			super.aClass22Array3[3] = null;
		} else {
			local258 = Static448.aClass117_2.method2317(super.anInt8534);
			local275 = local258.aByte63 == 3 && (local53 != 0 || local56 != 0);
			local277 = local7;
			if (local275) {
				local277 = local7 | 0x7;
			} else {
				if (super.anInt8526 != 0) {
					local277 = local7 | 0x5;
				}
				if (super.anInt8523 != 0) {
					local277 |= 0x2;
				}
			}
			local320 = super.aClass22Array3[3] = local258.method5498(super.anInt8512, local277, Static31.aClass345_1, super.anInt8555, arg0, super.anInt8550);
			if (local320 != null) {
				if (super.anInt8523 != 0) {
					local320.m(0, -super.anInt8523 << 2, 0);
				}
				if (super.anInt8526 != 0) {
					local320.I(super.anInt8526 * 2048);
				}
				if (local275) {
					if (super.anInt8520 != 0) {
						local320.AA(super.anInt8520);
					}
					if (super.anInt8562 != 0) {
						local320.v(super.anInt8562);
					}
					if (super.anInt8508 != 0) {
						local320.m(0, super.anInt8508, 0);
					}
				}
			}
		}
		super.aClass22Array3[2] = null;
		if (super.aClass6_Sub4_3 != null) {
			if (Static358.anInt6263 >= super.aClass6_Sub4_3.anInt521) {
				super.aClass6_Sub4_3 = null;
			} else if (super.aClass6_Sub4_3.anInt519 <= Static358.anInt6263) {
				@Pc(549) Class22 local549 = super.aClass6_Sub4_3.method430(local7 | 0x7, arg0);
				if (local549 != null) {
					local549.m(super.aClass6_Sub4_3.anInt516 - super.anInt9222, -super.anInt9223 + super.aClass6_Sub4_3.anInt517 + 5, -super.anInt9218 + super.aClass6_Sub4_3.anInt518);
					if (local145 != 0) {
						local549.I(local145);
					}
					super.aClass22Array3[2] = local549;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIB)V")
	public void method1592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray661[0];
		@Pc(15) int local15 = super.anIntArray660[0];
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
			local10++;
			local15--;
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
		if (super.anInt8538 != -1 && Static31.aClass345_1.method7798(super.anInt8538).anInt2594 == 1) {
			super.anInt8538 = -1;
		}
		@Pc(94) Class237 local94;
		if (super.anInt8525 != -1) {
			local94 = Static448.aClass117_2.method2317(super.anInt8525);
			if (local94.aBoolean443 && local94.anInt6458 != -1 && Static31.aClass345_1.method7798(local94.anInt6458).anInt2594 == 1) {
				super.anInt8525 = -1;
			}
		}
		if (super.anInt8534 != -1) {
			local94 = Static448.aClass117_2.method2317(super.anInt8534);
			if (local94.aBoolean443 && local94.anInt6458 != -1 && Static31.aClass345_1.method7798(local94.anInt6458).anInt2594 == 1) {
				super.anInt8534 = -1;
			}
		}
		if (super.anInt8582 < 9) {
			super.anInt8582++;
		}
		for (@Pc(157) int local157 = super.anInt8582; local157 > 0; local157--) {
			super.anIntArray661[local157] = super.anIntArray661[local157 - 1];
			super.anIntArray660[local157] = super.anIntArray660[local157 - 1];
			super.aByteArray110[local157] = super.aByteArray110[local157 - 1];
		}
		super.anIntArray661[0] = local10;
		super.anIntArray660[0] = local15;
		super.aByteArray110[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!qba;I)V")
	public void method1594(@OriginalArg(0) Class257 arg0) {
		this.aClass257_1 = arg0;
		if (super.aClass102_Sub6_8 != null) {
			super.aClass102_Sub6_8.method6836();
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		if (this.aClass257_1 == null || !this.method1591(arg2, 131072)) {
			return false;
		}
		@Pc(19) Class34 local19 = arg2.method7096();
		@Pc(24) int local24 = super.aClass293_7.method6528();
		local19.a(local24);
		local19.G(super.anInt9222, super.anInt9223, super.anInt9218);
		@Pc(49) boolean local49 = false;
		for (@Pc(51) int local51 = 0; local51 < super.aClass22Array3.length; local51++) {
			if (super.aClass22Array3[local51] != null && super.aClass22Array3[local51].method4698(arg0, arg1, local19, this.aClass257_1.anInt7167 == 1)) {
				local49 = true;
				break;
			}
		}
		super.aClass22Array3[0] = super.aClass22Array3[1] = super.aClass22Array3[2] = super.aClass22Array3[3] = null;
		return local49;
	}
}
