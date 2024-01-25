import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class49_Sub2_Sub2_Sub2 extends Class49_Sub2_Sub2 {

	@OriginalMember(owner = "client!jc", name = "Vc", descriptor = "Lclient!mt;")
	public Class196 aClass196_1;

	@OriginalMember(owner = "client!jc", name = "Ac", descriptor = "I")
	public int anInt4341 = -1;

	@OriginalMember(owner = "client!jc", name = "Ec", descriptor = "I")
	public int anInt4345 = -1;

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return false;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!mt;)V")
	public void method3802(@OriginalArg(1) Class196 arg0) {
		this.aClass196_1 = arg0;
		if (super.aClass72_Sub4_5 != null) {
			super.aClass72_Sub4_5.method4528();
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		if (this.aClass196_1 == null || !this.method3807(2048, arg0)) {
			return null;
		}
		@Pc(17) Class118 local17 = arg0.method7256();
		@Pc(22) int local22 = super.aClass143_7.method3599();
		local17.ma(local22);
		local17.TA(super.anInt7137, super.anInt7140 - 20, super.anInt7141);
		@Pc(39) Class230 local39 = this.method3799();
		@Pc(52) Class196 local52 = this.aClass196_1.anIntArray570 == null ? this.aClass196_1 : this.aClass196_1.method4855(Static251.aClass119_1);
		if (Static544.aClass1_Sub22_Sub1_1.aBoolean394 && local52.aBoolean416 && local39.aBoolean467) {
			@Pc(79) Class199 local79 = super.anInt4297 != -1 && super.anInt4316 == 0 ? Static182.aClass218_1.method5221(super.anInt4297) : null;
			@Pc(97) Class199 local97 = super.anInt4282 == -1 || super.aBoolean306 && local79 != null ? null : Static182.aClass218_1.method5221(super.anInt4282);
			@Pc(99) int local99 = 0;
			if (super.anInt4306 != 0) {
				local99 = this.method3787();
			}
			@Pc(157) Class145 local157 = Static223.method3885(local97 == null ? local79 : local97, local22, arg0, local97 == null ? super.anInt4303 : super.anInt4286, this.aClass196_1.anInt5718, this.aClass196_1.aShort98 & 0xFFFF, super.anInt4331, this.aClass196_1.aShort99 & 0xFFFF, this.aClass196_1.aByte72 & 0xFF, local99, this.aClass196_1.aByte74 & 0xFF, super.lb, super.anInt4318, super.aClass145Array3[0]);
			if (local157 != null) {
				arg0.method7271(false);
				local157.method6686(local17, null, 0);
				arg0.method7271(true);
			}
		}
		local17.ma(local22);
		local17.TA(super.anInt7137, super.anInt7140 - 5, super.anInt7141);
		@Pc(185) Class72_Sub7 local185 = null;
		if (this.method3809()) {
			local185 = Static186.method2914(super.aClass145Array3.length);
		}
		if (super.aClass72_Sub4_5 == null) {
			arg0.method7257(super.aClass145Array3, local17, local185 == null ? null : local185.aClass72_Sub2Array1, 0);
		} else {
			@Pc(216) Class175 local216 = super.aClass72_Sub4_5.method4537();
			arg0.method7283(super.aClass145Array3, local216, local17, local185 == null ? null : local185.aClass72_Sub2Array1, 0);
		}
		this.method3781(false, super.aClass145Array3, arg0);
		super.anInt4312 = Static45.anInt915;
		super.aClass145Array3[0] = super.aClass145Array3[1] = super.aClass145Array3[2] = super.aClass145Array3[3] = null;
		return local185;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(Z)I")
	@Override
	public int method3797() {
		if (this.aClass196_1.anIntArray570 != null) {
			@Pc(13) Class196 local13 = this.aClass196_1.method4855(Static251.aClass119_1);
			if (local13 != null && local13.anInt5724 != -1) {
				return local13.anInt5724;
			}
		}
		return this.aClass196_1.anInt5724 == -1 ? super.method3797() : this.aClass196_1.anInt5724;
	}

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "(I)Z")
	public boolean method3803() {
		return this.aClass196_1 != null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V")
	public void method3805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray428[0];
		@Pc(15) int local15 = super.anIntArray427[0];
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
			local15++;
			local10--;
		}
		if (super.anInt4297 != -1 && Static182.aClass218_1.method5221(super.anInt4297).anInt5736 == 1) {
			super.anInt4297 = -1;
		}
		@Pc(83) Class52 local83;
		if (super.anInt4307 != -1) {
			local83 = Static489.aClass194_2.method4810(super.anInt4307);
			if (local83.aBoolean84 && local83.anInt1342 != -1 && Static182.aClass218_1.method5221(local83.anInt1342).anInt5736 == 1) {
				super.anInt4307 = -1;
			}
		}
		if (super.anInt4289 != -1) {
			local83 = Static489.aClass194_2.method4810(super.anInt4289);
			if (local83.aBoolean84 && local83.anInt1342 != -1 && Static182.aClass218_1.method5221(local83.anInt1342).anInt5736 == 1) {
				super.anInt4289 = -1;
			}
		}
		if (super.anInt4338 < 9) {
			super.anInt4338++;
		}
		for (@Pc(146) int local146 = super.anInt4338; local146 > 0; local146--) {
			super.anIntArray428[local146] = super.anIntArray428[local146 - 1];
			super.anIntArray427[local146] = super.anIntArray427[local146 - 1];
			super.aByteArray64[local146] = super.aByteArray64[local146 - 1];
		}
		super.anIntArray428[0] = local10;
		super.aByteArray64[0] = (byte) arg1;
		super.anIntArray427[0] = local15;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)I")
	@Override
	public int method5994() {
		return super.anInt4315;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		if (this.aClass196_1 == null || !this.method3807(131072, arg2)) {
			return false;
		}
		@Pc(19) Class118 local19 = arg2.method7256();
		@Pc(24) int local24 = super.aClass143_7.method3599();
		local19.ma(local24);
		local19.TA(super.anInt7137, super.anInt7140, super.anInt7141);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass145Array3.length; local45++) {
			if (super.aClass145Array3[local45] != null && super.aClass145Array3[local45].method6683(arg0, arg1, local19, this.aClass196_1.anInt5718 == 1)) {
				local43 = true;
				break;
			}
		}
		super.aClass145Array3[0] = super.aClass145Array3[1] = super.aClass145Array3[2] = super.aClass145Array3[3] = null;
		return local43;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I")
	@Override
	public int method3785() {
		if (this.aClass196_1.anIntArray570 != null) {
			@Pc(13) Class196 local13 = this.aClass196_1.method4855(Static251.aClass119_1);
			if (local13 != null && local13.anInt5714 != -1) {
				return local13.anInt5714;
			}
		}
		return this.aClass196_1.anInt5714;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!qa;B)Z")
	private boolean method3807(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class230 local11 = this.method3799();
		@Pc(38) Class199 local38 = super.anInt4297 != -1 && super.anInt4316 == 0 ? Static182.aClass218_1.method5221(super.anInt4297) : null;
		@Pc(56) Class199 local56 = super.anInt4282 == -1 || super.aBoolean306 && local38 != null ? null : Static182.aClass218_1.method5221(super.anInt4282);
		@Pc(59) int local59 = local11.anInt6414;
		@Pc(62) int local62 = local11.anInt6386;
		if (local59 != 0 || local62 != 0 || local11.anInt6401 != 0 || local11.anInt6389 != 0) {
			arg0 |= 0x7;
		}
		@Pc(97) boolean local97 = super.aByte56 != 0 && Static436.anInt6850 >= super.anInt4261 && super.anInt4326 > Static436.anInt6850;
		if (local97) {
			arg0 |= 0x80000;
		}
		@Pc(134) Class145 local134 = super.aClass145Array3[0] = this.aClass196_1.method4856(super.aClass166Array3, super.anInt4286, Static182.aClass218_1, Static251.aClass119_1, arg1, super.anInt4303, local38, local56, super.anInt4265, super.anInt4288, arg0, super.anInt4291, Static351.aClass228_1, super.anInt4305);
		if (local134 == null) {
			return false;
		}
		super.anInt4315 = local134.TA();
		this.method3782(local134);
		@Pc(151) int local151 = super.aClass143_7.method3599();
		if (local59 == 0 && local62 == 0) {
			this.method3798(0, this.method3788() << 9, local151, this.method3788() << 9, 0);
		} else {
			this.method3798(local11.anInt6383, local59, local151, local62, local11.anInt6397);
			if (super.lb != 0) {
				super.aClass145Array3[0].D(super.lb);
			}
			if (super.anInt4318 != 0) {
				super.aClass145Array3[0].b(super.anInt4318);
			}
			if (super.anInt4331 != 0) {
				super.aClass145Array3[0].ca(0, super.anInt4331, 0);
			}
		}
		if (local97) {
			local134.method6671(super.aByte55, super.aByte58, super.aByte57, super.aByte56 & 0xFF);
		}
		@Pc(258) Class52 local258;
		@Pc(276) boolean local276;
		@Pc(278) int local278;
		@Pc(321) Class145 local321;
		if (super.anInt4307 == -1 || super.anInt4334 == -1) {
			super.aClass145Array3[1] = null;
		} else {
			local258 = Static489.aClass194_2.method4810(super.anInt4307);
			local276 = local258.aByte13 == 3 && (local59 != 0 || local62 != 0);
			local278 = local7;
			if (local276) {
				local278 = local7 | 0x7;
			} else {
				if (super.anInt4281 != 0) {
					local278 = local7 | 0x5;
				}
				if (super.anInt4302 != 0) {
					local278 |= 0x2;
				}
			}
			local321 = super.aClass145Array3[1] = local258.method1270(super.anInt4313, local278, super.anInt4334, arg1, super.anInt4262, Static182.aClass218_1);
			if (local321 != null) {
				if (super.anInt4302 != 0) {
					local321.ca(0, -super.anInt4302 << 2, 0);
				}
				if (super.anInt4281 != 0) {
					local321.OA(super.anInt4281 * 2048);
				}
				if (local276) {
					if (super.lb != 0) {
						local321.D(super.lb);
					}
					if (super.anInt4318 != 0) {
						local321.b(super.anInt4318);
					}
					if (super.anInt4331 != 0) {
						local321.ca(0, super.anInt4331, 0);
					}
				}
			}
		}
		if (super.anInt4289 == -1 || super.anInt4284 == -1) {
			super.aClass145Array3[3] = null;
		} else {
			local258 = Static489.aClass194_2.method4810(super.anInt4289);
			local276 = local258.aByte13 == 3 && (local59 != 0 || local62 != 0);
			local278 = local7;
			if (local276) {
				local278 = local7 | 0x7;
			} else {
				if (super.anInt4266 != 0) {
					local278 = local7 | 0x5;
				}
				if (super.anInt4259 != 0) {
					local278 |= 0x2;
				}
			}
			local321 = super.aClass145Array3[3] = local258.method1275(super.anInt4327, super.anInt4284, Static182.aClass218_1, arg1, super.anInt4290, local278);
			if (local321 != null) {
				if (super.anInt4259 != 0) {
					local321.ca(0, -super.anInt4259 << 2, 0);
				}
				if (super.anInt4266 != 0) {
					local321.OA(super.anInt4266 * 2048);
				}
				if (local276) {
					if (super.lb != 0) {
						local321.D(super.lb);
					}
					if (super.anInt4318 != 0) {
						local321.b(super.anInt4318);
					}
					if (super.anInt4331 != 0) {
						local321.ca(0, super.anInt4331, 0);
					}
				}
			}
		}
		super.aClass145Array3[2] = null;
		if (super.aClass1_Sub50_3 != null) {
			if (super.aClass1_Sub50_3.anInt8765 <= Static436.anInt6850) {
				super.aClass1_Sub50_3 = null;
			} else if (super.aClass1_Sub50_3.anInt8760 <= Static436.anInt6850) {
				@Pc(548) Class145 local548 = super.aClass1_Sub50_3.method7170(local7 | 0x7, arg1);
				if (local548 != null) {
					local548.ca(super.aClass1_Sub50_3.anInt8757 - super.anInt7137, -super.anInt7140 + 5 + super.aClass1_Sub50_3.anInt8766, -super.anInt7141 + super.aClass1_Sub50_3.anInt8768);
					if (local151 != 0) {
						local548.OA(local151);
					}
					super.aClass145Array3[2] = local548;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIZII)V")
	public void method3808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte98 = (byte) arg4;
		if (super.anInt4297 != -1 && Static182.aClass218_1.method5221(super.anInt4297).anInt5736 == 1) {
			super.anInt4297 = -1;
		}
		@Pc(37) Class52 local37;
		if (super.anInt4307 != -1) {
			local37 = Static489.aClass194_2.method4810(super.anInt4307);
			if (local37.aBoolean84 && local37.anInt1342 != -1 && Static182.aClass218_1.method5221(local37.anInt1342).anInt5736 == 1) {
				super.anInt4307 = -1;
			}
		}
		if (super.anInt4289 != -1) {
			local37 = Static489.aClass194_2.method4810(super.anInt4289);
			if (local37.aBoolean84 && local37.anInt1342 != -1 && Static182.aClass218_1.method5221(local37.anInt1342).anInt5736 == 1) {
				super.anInt4289 = -1;
			}
		}
		if (!arg2) {
			@Pc(101) int local101 = arg0 - super.anIntArray428[0];
			@Pc(108) int local108 = arg1 - super.anIntArray427[0];
			if (local101 >= -8 && local101 <= 8 && local108 >= -8 && local108 <= 8) {
				if (super.anInt4338 < 9) {
					super.anInt4338++;
				}
				for (@Pc(137) int local137 = super.anInt4338; local137 > 0; local137--) {
					super.anIntArray428[local137] = super.anIntArray428[local137 - 1];
					super.anIntArray427[local137] = super.anIntArray427[local137 - 1];
					super.aByteArray64[local137] = super.aByteArray64[local137 - 1];
				}
				super.anIntArray428[0] = arg0;
				super.anIntArray427[0] = arg1;
				super.aByteArray64[0] = 1;
				return;
			}
		}
		super.anInt4339 = 0;
		super.anInt4337 = 0;
		super.anInt4338 = 0;
		super.anIntArray428[0] = arg0;
		super.anIntArray427[0] = arg1;
		super.anInt7137 = (arg3 << 8) + (super.anIntArray428[0] << 9);
		super.anInt7141 = (arg3 << 8) + (super.anIntArray427[0] << 9);
		if (super.aClass72_Sub4_5 != null) {
			super.aClass72_Sub4_5.method4528();
		}
	}

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "(I)Z")
	private boolean method3809() {
		return this.aClass196_1.aBoolean410;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
	@Override
	protected int method3786() {
		if (this.aClass196_1.anIntArray570 != null) {
			@Pc(13) Class196 local13 = this.aClass196_1.method4855(Static251.aClass119_1);
			if (local13 != null && local13.lb != -1) {
				return local13.lb;
			}
		}
		return this.aClass196_1.lb;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
		if (this.aClass196_1 != null && (super.aBoolean307 || this.method3807(0, arg0))) {
			this.method3781(super.aBoolean307, super.aClass145Array3, arg0);
			super.aClass145Array3[0] = super.aClass145Array3[1] = super.aClass145Array3[2] = super.aClass145Array3[3] = null;
		}
	}
}
