import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class1_Sub3_Sub3_Sub2 extends Class1_Sub3_Sub3 {

	@OriginalMember(owner = "client!qt", name = "Sc", descriptor = "Lclient!de;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!qt", name = "Wc", descriptor = "I")
	public int anInt6152 = -1;

	@OriginalMember(owner = "client!qt", name = "Qc", descriptor = "I")
	public int anInt6147 = -1;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIZI)V")
	public void method4849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super.aByte77 = (byte) arg3;
		if (super.anInt6092 != -1 && Static196.aClass30_2.method942(super.anInt6092).anInt3324 == 1) {
			super.anInt6092 = -1;
		}
		@Pc(36) Class186 local36;
		if (super.anInt6104 != -1) {
			local36 = Static102.aClass91_2.method2560(super.anInt6104);
			if (local36.aBoolean406 && local36.anInt5611 != -1 && Static196.aClass30_2.method942(local36.anInt5611).anInt3324 == 1) {
				super.anInt6104 = -1;
			}
		}
		if (super.anInt6079 != -1) {
			local36 = Static102.aClass91_2.method2560(super.anInt6079);
			if (local36.aBoolean406 && local36.anInt5611 != -1 && Static196.aClass30_2.method942(local36.anInt5611).anInt3324 == 1) {
				super.anInt6079 = -1;
			}
		}
		if (!arg4) {
			@Pc(94) int local94 = arg1 - super.anIntArray453[0];
			@Pc(102) int local102 = arg2 - super.anIntArray454[0];
			if (local94 >= -8 && local94 <= 8 && local102 >= -8 && local102 <= 8) {
				if (super.anInt6133 < 9) {
					super.anInt6133++;
				}
				for (@Pc(133) int local133 = super.anInt6133; local133 > 0; local133--) {
					super.anIntArray453[local133] = super.anIntArray453[local133 - 1];
					super.anIntArray454[local133] = super.anIntArray454[local133 - 1];
					super.aByteArray69[local133] = super.aByteArray69[local133 - 1];
				}
				super.anIntArray453[0] = arg1;
				super.anIntArray454[0] = arg2;
				super.aByteArray69[0] = 1;
				return;
			}
		}
		super.anIntArray453[0] = arg1;
		super.anInt6133 = 0;
		super.anInt6136 = 0;
		super.anInt6134 = 0;
		super.anIntArray454[0] = arg2;
		super.anInt6055 = (super.anIntArray454[0] << 7) + (arg0 << 6);
		super.anInt6053 = (arg0 << 6) + (super.anIntArray453[0] << 7);
		if (super.aClass13_Sub8_6 != null) {
			super.aClass13_Sub8_6.method5942();
		}
	}

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "(B)I")
	@Override
	public int method4846() {
		if (this.aClass47_1.anIntArray134 != null) {
			@Pc(13) Class47 local13 = this.aClass47_1.method1296(Static369.aClass11_1);
			if (local13 != null && local13.anInt1579 != -1) {
				return local13.anInt1579;
			}
		}
		return this.aClass47_1.anInt1579 == -1 ? super.method4846() : this.aClass47_1.anInt1579;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BLclient!rn;ZIILclient!qa;I)V")
	@Override
	public void method5836(@OriginalArg(1) Class1 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class75 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
		if (this.aClass47_1 != null && (super.aBoolean430 || this.method4855(0, arg0))) {
			this.method4840(super.aBoolean430, arg0, super.aClass31Array3);
		}
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)I")
	@Override
	public int method4835() {
		if (this.aClass47_1.anIntArray134 != null) {
			@Pc(13) Class47 local13 = this.aClass47_1.method1296(Static369.aClass11_1);
			if (local13 != null && local13.anInt1590 != -1) {
				return local13.anInt1590;
			}
		}
		return this.aClass47_1.anInt1590;
	}

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "(I)Z")
	public boolean method4850() {
		return this.aClass47_1 != null;
	}

	@OriginalMember(owner = "client!qt", name = "i", descriptor = "(I)I")
	@Override
	public int method4828() {
		return super.anInt6075;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)V")
	public void method4852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = super.anIntArray453[0];
		@Pc(13) int local13 = super.anIntArray454[0];
		if (arg0 == 0) {
			local13++;
		}
		if (arg0 == 1) {
			local13++;
			local8++;
		}
		if (arg0 == 2) {
			local8++;
		}
		if (arg0 == 3) {
			local8++;
			local13--;
		}
		if (arg0 == 4) {
			local13--;
		}
		if (arg0 == 5) {
			local13--;
			local8--;
		}
		if (arg0 == 6) {
			local8--;
		}
		if (arg0 == 7) {
			local13++;
			local8--;
		}
		if (super.anInt6092 != -1 && Static196.aClass30_2.method942(super.anInt6092).anInt3324 == 1) {
			super.anInt6092 = -1;
		}
		@Pc(91) Class186 local91;
		if (super.anInt6104 != -1) {
			local91 = Static102.aClass91_2.method2560(super.anInt6104);
			if (local91.aBoolean406 && local91.anInt5611 != -1 && Static196.aClass30_2.method942(local91.anInt5611).anInt3324 == 1) {
				super.anInt6104 = -1;
			}
		}
		if (super.anInt6079 != -1) {
			local91 = Static102.aClass91_2.method2560(super.anInt6079);
			if (local91.aBoolean406 && local91.anInt5611 != -1 && Static196.aClass30_2.method942(local91.anInt5611).anInt3324 == 1) {
				super.anInt6079 = -1;
			}
		}
		if (super.anInt6133 < 9) {
			super.anInt6133++;
		}
		for (@Pc(155) int local155 = super.anInt6133; local155 > 0; local155--) {
			super.anIntArray453[local155] = super.anIntArray453[local155 - 1];
			super.anIntArray454[local155] = super.anIntArray454[local155 - 1];
			super.aByteArray69[local155] = super.aByteArray69[local155 - 1];
		}
		super.anIntArray453[0] = local8;
		super.anIntArray454[0] = local13;
		super.aByteArray69[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "(B)Z")
	private boolean method4853() {
		return this.aClass47_1.aBoolean122;
	}

	@OriginalMember(owner = "client!qt", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		if (this.aClass47_1 == null || !this.method4855(2048, arg0)) {
			return null;
		}
		@Pc(25) Class106 local25 = arg0.method2587();
		@Pc(30) int local30 = super.aClass160_7.method3877();
		local25.O(local30);
		local25.ZA(super.anInt6053, super.anInt6045, super.anInt6055);
		@Pc(45) Class137 local45 = this.method4837();
		@Pc(58) Class47 local58 = this.aClass47_1.anIntArray134 == null ? this.aClass47_1 : this.aClass47_1.method1296(Static369.aClass11_1);
		if (Static123.aClass21_Sub1_1.aBoolean78 && local58.aBoolean128 && local45.aBoolean329) {
			@Pc(82) Class96 local82 = super.anInt6092 != -1 && super.anInt6083 == 0 ? Static196.aClass30_2.method942(super.anInt6092) : null;
			@Pc(100) Class96 local100 = super.anInt6080 == -1 || super.aBoolean429 && local82 != null ? null : Static196.aClass30_2.method942(super.anInt6080);
			@Pc(152) Class31 local152 = Static111.method5933(arg0, this.aClass47_1.anInt1578, super.aBoolean426, super.aClass31Array3[0], this.aClass47_1.aByte20 & 0xFF, this.aClass47_1.aByte14 & 0xFF, super.anInt6057, super.anInt6118, this.aClass47_1.aShort42 & 0xFFFF, this.aClass47_1.aShort41 & 0xFFFF, local100 == null ? super.anInt6082 : super.anInt6056, local100 == null ? local82 : local100, local30, super.anInt6114);
			if (local152 != null) {
				@Pc(157) float local157 = arg0.la();
				@Pc(160) float local160 = arg0.w();
				arg0.method2572(false);
				arg0.o(local157, local160 - 150.0F);
				local152.method5704(local25, null, 0);
				arg0.o(local157, local160);
				arg0.method2572(true);
			}
		}
		@Pc(183) Class13_Sub7 local183 = null;
		if (this.method4853()) {
			local183 = Static120.method2160(super.aClass31Array3.length);
		}
		if (super.aClass13_Sub8_6 == null) {
			arg0.method2605(super.aClass31Array3, local25, local183 == null ? null : local183.aClass13_Sub1Array1, 0);
		} else {
			@Pc(200) Class116 local200 = super.aClass13_Sub8_6.method5943();
			arg0.method2602(super.aClass31Array3, local200, local25, local183 == null ? null : local183.aClass13_Sub1Array1, 0);
		}
		this.method4840(false, arg0, super.aClass31Array3);
		if (super.aClass31Array3[2] != null) {
			if (local30 != 0) {
				super.aClass31Array3[2].k(local30);
			}
			super.aClass31Array3[2].ja(-super.aClass3_Sub11_3.anInt1455 + super.anInt6053, super.anInt6045 - super.aClass3_Sub11_3.anInt1454, -super.aClass3_Sub11_3.anInt1463 + super.anInt6055);
		}
		super.anInt6090 = Static164.anInt3507;
		return local183;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		if (this.aClass47_1 == null || !this.method4855(131072, arg2)) {
			return false;
		}
		@Pc(19) Class106 local19 = arg2.method2587();
		@Pc(24) int local24 = super.aClass160_7.method3877();
		local19.O(local24);
		local19.ZA(super.anInt6053, super.anInt6045, super.anInt6055);
		for (@Pc(37) int local37 = 0; local37 < super.aClass31Array3.length; local37++) {
			if (super.aClass31Array3[local37] != null && super.aClass31Array3[local37].method5702(arg0, arg1, local19, this.aClass47_1.anInt1578 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
	@Override
	public void method5838() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!de;B)V")
	public void method4854(@OriginalArg(0) Class47 arg0) {
		this.aClass47_1 = arg0;
		if (super.aClass13_Sub8_6 != null) {
			super.aClass13_Sub8_6.method5942();
		}
	}

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "(I)I")
	@Override
	protected int method4842() {
		if (this.aClass47_1.anIntArray134 != null) {
			@Pc(21) Class47 local21 = this.aClass47_1.method1296(Static369.aClass11_1);
			if (local21 != null && local21.anInt1571 != -1) {
				return local21.anInt1571;
			}
		}
		return this.aClass47_1.anInt1571;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!qa;B)Z")
	private boolean method4855(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class137 local11 = this.method4837();
		@Pc(29) Class96 local29 = super.anInt6092 != -1 && super.anInt6083 == 0 ? Static196.aClass30_2.method942(super.anInt6092) : null;
		@Pc(46) Class96 local46 = super.anInt6080 == -1 || super.aBoolean429 && local29 != null ? null : Static196.aClass30_2.method942(super.anInt6080);
		@Pc(49) int local49 = local11.anInt4218;
		@Pc(52) int local52 = local11.anInt4199;
		if (local49 != 0 || local52 != 0 || local11.anInt4219 != 0 || local11.anInt4221 != 0) {
			arg0 |= 0x7;
		}
		@Pc(88) boolean local88 = super.aByte81 != 0 && Static290.anInt5325 >= super.anInt6116 && Static290.anInt5325 < super.anInt6103;
		if (local88) {
			arg0 |= 0x80000;
		}
		@Pc(125) Class31 local125 = super.aClass31Array3[0] = this.aClass47_1.method1307(super.anInt6082, super.anInt6086, super.anInt6056, local29, super.anInt6117, Static369.aClass11_1, Static196.aClass30_2, super.aClass34Array3, arg0, arg1, local46, super.anInt6127, Static427.aClass237_1, super.lb);
		if (local125 == null) {
			return false;
		}
		super.anInt6075 = local125.b();
		this.method4839(local125);
		@Pc(150) int local150 = super.aClass160_7.method3877();
		if (local49 == 0 && local52 == 0) {
			this.method4836(this.method4831() << 7, this.method4831() << 7, local150, 0, 0);
		} else {
			this.method4836(local49, local52, local150, local11.anInt4202, local11.anInt4198);
			if (super.anInt6114 != 0) {
				super.aClass31Array3[0].WA(super.anInt6114);
			}
			if (super.anInt6057 != 0) {
				super.aClass31Array3[0].o(super.anInt6057);
			}
			if (super.anInt6118 != 0) {
				super.aClass31Array3[0].ja(0, super.anInt6118, 0);
			}
		}
		if (local88) {
			local125.method5714(super.aByte79, super.aByte82, super.aByte80, super.aByte81 & 0xFF);
		}
		@Pc(253) Class186 local253;
		@Pc(268) boolean local268;
		@Pc(270) int local270;
		@Pc(316) Class31 local316;
		if (super.anInt6104 == -1 || super.anInt6074 == -1) {
			super.aClass31Array3[1] = null;
		} else {
			local253 = Static102.aClass91_2.method2560(super.anInt6104);
			local268 = local253.aByte73 == 3 && (local49 != 0 || local52 != 0);
			local270 = local7;
			if (local268) {
				local270 = local7 | 0x7;
			} else {
				if (super.anInt6091 != 0) {
					local270 = local7 | 0x5;
				}
				if (super.anInt6063 != 0) {
					local270 |= 0x2;
				}
			}
			local316 = super.aClass31Array3[1] = local253.method4526(super.anInt6095, local270, arg1, super.anInt6074, Static196.aClass30_2, super.anInt6070);
			if (local316 != null) {
				if (super.anInt6063 != 0) {
					local316.ja(0, -super.anInt6063 << 0, 0);
				}
				if (super.anInt6091 != 0) {
					local316.k(super.anInt6091 * 2048);
				}
				if (local268) {
					if (super.anInt6114 != 0) {
						local316.WA(super.anInt6114);
					}
					if (super.anInt6057 != 0) {
						local316.o(super.anInt6057);
					}
					if (super.anInt6118 != 0) {
						local316.ja(0, super.anInt6118, 0);
					}
				}
			}
		}
		if (super.anInt6079 == -1 || super.anInt6106 == -1) {
			super.aClass31Array3[3] = null;
		} else {
			local253 = Static102.aClass91_2.method2560(super.anInt6079);
			local268 = local253.aByte73 == 3 && (local49 != 0 || local52 != 0);
			local270 = local7;
			if (local268) {
				local270 = local7 | 0x7;
			} else {
				if (super.anInt6130 != 0) {
					local270 = local7 | 0x5;
				}
				if (super.anInt6113 != 0) {
					local270 |= 0x2;
				}
			}
			local316 = super.aClass31Array3[3] = local253.method4521(super.anInt6131, super.anInt6088, super.anInt6106, Static196.aClass30_2, local270, arg1);
			if (local316 != null) {
				if (super.anInt6113 != 0) {
					local316.ja(0, -super.anInt6113 << 0, 0);
				}
				if (super.anInt6130 != 0) {
					local316.k(super.anInt6130 * 2048);
				}
				if (local268) {
					if (super.anInt6114 != 0) {
						local316.WA(super.anInt6114);
					}
					if (super.anInt6057 != 0) {
						local316.o(super.anInt6057);
					}
					if (super.anInt6118 != 0) {
						local316.ja(0, super.anInt6118, 0);
					}
				}
			}
		}
		super.aClass31Array3[2] = null;
		if (super.aClass3_Sub11_3 != null) {
			if (Static290.anInt5325 >= super.aClass3_Sub11_3.anInt1451) {
				super.aClass3_Sub11_3 = null;
			} else if (Static290.anInt5325 >= super.aClass3_Sub11_3.anInt1467) {
				@Pc(542) Class31 local542 = super.aClass3_Sub11_3.method1210(local7 | 0x7, arg1);
				if (local542 != null) {
					local542.ja(super.aClass3_Sub11_3.anInt1455 - super.anInt6053, -super.anInt6045 + super.aClass3_Sub11_3.anInt1454, super.aClass3_Sub11_3.anInt1463 - super.anInt6055);
					if (local150 != 0) {
						local542.k(local150);
					}
					super.aClass31Array3[2] = local542;
				}
			}
		}
		return true;
	}
}
