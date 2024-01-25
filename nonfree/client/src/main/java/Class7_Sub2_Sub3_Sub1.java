import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class7_Sub2_Sub3_Sub1 extends Class7_Sub2_Sub3 {

	@OriginalMember(owner = "client!at", name = "Xc", descriptor = "Lclient!da;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!at", name = "Dc", descriptor = "I")
	public int anInt681 = -1;

	@OriginalMember(owner = "client!at", name = "Jc", descriptor = "I")
	public int anInt687 = -1;

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)I")
	@Override
	public int method3494() {
		return super.anInt4371;
	}

	@OriginalMember(owner = "client!at", name = "f", descriptor = "(B)I")
	@Override
	public int method3510() {
		if (this.aClass47_1.anIntArray94 != null) {
			@Pc(18) Class47 local18 = this.aClass47_1.method1251(Static85.aClass49_1);
			if (local18 != null && local18.anInt1610 != -1) {
				return local18.anInt1610;
			}
		}
		return this.aClass47_1.anInt1610;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!qa;ZLclient!to;III)V")
	@Override
	public void method5273(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(B)V")
	@Override
	public void method5268() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)I")
	@Override
	public int method3511() {
		if (this.aClass47_1.anIntArray94 != null) {
			@Pc(20) Class47 local20 = this.aClass47_1.method1251(Static85.aClass49_1);
			if (local20 != null && local20.anInt1581 != -1) {
				return local20.anInt1581;
			}
		}
		return this.aClass47_1.anInt1581 == -1 ? super.method3511() : this.aClass47_1.anInt1581;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)I")
	@Override
	protected int method3498() {
		if (this.aClass47_1.anIntArray94 != null) {
			@Pc(13) Class47 local13 = this.aClass47_1.method1251(Static85.aClass49_1);
			if (local13 != null && local13.anInt1606 != -1) {
				return local13.anInt1606;
			}
		}
		return this.aClass47_1.anInt1606;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZILclient!qa;)Z")
	private boolean method453(@OriginalArg(1) int arg0, @OriginalArg(2) Class172 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class1 local11 = this.method3514();
		@Pc(30) Class128 local30 = super.anInt4366 != -1 && super.anInt4387 == 0 ? Static301.aClass170_3.method3936(super.anInt4366) : null;
		@Pc(48) Class128 local48 = super.anInt4389 == -1 || super.aBoolean378 && local30 != null ? null : Static301.aClass170_3.method3936(super.anInt4389);
		@Pc(51) int local51 = local11.anInt35;
		@Pc(54) int local54 = local11.anInt3;
		if (local51 != 0 || local54 != 0 || local11.anInt38 != 0 || local11.anInt26 != 0) {
			arg0 |= 0x7;
		}
		@Pc(96) boolean local96 = super.aByte79 != 0 && super.anInt4361 <= Static253.anInt4787 && super.anInt4365 > Static253.anInt4787;
		if (local96) {
			arg0 |= 0x80000;
		}
		@Pc(133) Class9 local133 = super.aClass9Array3[0] = this.aClass47_1.method1249(Static432.aClass73_1, super.aClass17Array3, Static85.aClass49_1, arg1, super.anInt4350, super.anInt4327, local30, arg0, Static301.aClass170_3, super.anInt4355, local48, super.anInt4397, super.anInt4328, super.anInt4336);
		if (local133 == null) {
			return false;
		}
		super.anInt4371 = local133.b();
		this.method3509(local133);
		@Pc(150) int local150 = super.aClass91_7.method2048();
		if (local51 == 0 && local54 == 0) {
			this.method3505(0, this.method3499() << 7, this.method3499() << 7, local150, 0);
		} else {
			this.method3505(local11.anInt47, local54, local51, local150, local11.anInt41);
			if (super.anInt4353 != 0) {
				super.aClass9Array3[0].WA(super.anInt4353);
			}
			if (super.anInt4381 != 0) {
				super.aClass9Array3[0].o(super.anInt4381);
			}
			if (super.anInt4382 != 0) {
				super.aClass9Array3[0].ja(0, super.anInt4382, 0);
			}
		}
		if (local96) {
			local133.method5700(super.aByte80, super.aByte81, super.aByte78, super.aByte79 & 0xFF);
		}
		@Pc(252) Class13 local252;
		@Pc(270) boolean local270;
		@Pc(272) int local272;
		@Pc(312) Class9 local312;
		if (super.anInt4345 == -1 || super.anInt4380 == -1) {
			super.aClass9Array3[1] = null;
		} else {
			local252 = Static96.aClass41_2.method1134(super.anInt4345);
			local270 = local252.aByte11 == 3 && (local51 != 0 || local54 != 0);
			local272 = local7;
			if (local270) {
				local272 = local7 | 0x7;
			} else {
				if (super.anInt4326 != 0) {
					local272 = local7 | 0x5;
				}
				if (super.anInt4351 != 0) {
					local272 |= 0x2;
				}
			}
			local312 = super.aClass9Array3[1] = local252.method373(arg1, super.anInt4380, super.anInt4390, super.anInt4342, local272, Static301.aClass170_3);
			if (local312 != null) {
				if (super.anInt4351 != 0) {
					local312.ja(0, -super.anInt4351 << 0, 0);
				}
				if (super.anInt4326 != 0) {
					local312.k(super.anInt4326 * 2048);
				}
				if (local270) {
					if (super.anInt4353 != 0) {
						local312.WA(super.anInt4353);
					}
					if (super.anInt4381 != 0) {
						local312.o(super.anInt4381);
					}
					if (super.anInt4382 != 0) {
						local312.ja(0, super.anInt4382, 0);
					}
				}
			}
		}
		if (super.anInt4349 == -1 || super.anInt4346 == -1) {
			super.aClass9Array3[3] = null;
		} else {
			local252 = Static96.aClass41_2.method1134(super.anInt4349);
			local270 = local252.aByte11 == 3 && (local51 != 0 || local54 != 0);
			local272 = local7;
			if (local270) {
				local272 = local7 | 0x7;
			} else {
				if (super.anInt4341 != 0) {
					local272 = local7 | 0x5;
				}
				if (super.anInt4360 != 0) {
					local272 |= 0x2;
				}
			}
			local312 = super.aClass9Array3[3] = local252.method374(Static301.aClass170_3, super.anInt4346, arg1, local272, super.anInt4329, super.anInt4368);
			if (local312 != null) {
				if (super.anInt4360 != 0) {
					local312.ja(0, -super.anInt4360 << 0, 0);
				}
				if (super.anInt4341 != 0) {
					local312.k(super.anInt4341 * 2048);
				}
				if (local270) {
					if (super.anInt4353 != 0) {
						local312.WA(super.anInt4353);
					}
					if (super.anInt4381 != 0) {
						local312.o(super.anInt4381);
					}
					if (super.anInt4382 != 0) {
						local312.ja(0, super.anInt4382, 0);
					}
				}
			}
		}
		super.aClass9Array3[2] = null;
		if (super.aClass3_Sub15_3 != null) {
			if (Static253.anInt4787 >= super.aClass3_Sub15_3.anInt2340) {
				super.aClass3_Sub15_3 = null;
			} else if (Static253.anInt4787 >= super.aClass3_Sub15_3.anInt2333) {
				@Pc(541) Class9 local541 = super.aClass3_Sub15_3.method1800(local7 | 0x7, arg1);
				if (local541 != null) {
					local541.ja(super.aClass3_Sub15_3.anInt2336 - super.anInt4318, super.aClass3_Sub15_3.anInt2339 - super.anInt4320, super.aClass3_Sub15_3.anInt2323 - super.anInt4321);
					if (local150 != 0) {
						local541.k(local150);
					}
					super.aClass9Array3[2] = local541;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!da;)V")
	public void method454(@OriginalArg(1) Class47 arg0) {
		this.aClass47_1 = arg0;
		if (super.aClass6_Sub8_7 != null) {
			super.aClass6_Sub8_7.method5916();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5267(@OriginalArg(1) Class172 arg0) {
		if (this.aClass47_1 != null && (super.aBoolean379 || this.method453(0, arg0))) {
			this.method3501(super.aBoolean379, arg0, super.aClass9Array3);
			super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(III)V")
	public void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = super.anIntArray287[0];
		@Pc(13) int local13 = super.anIntArray288[0];
		if (arg1 == 0) {
			local13++;
		}
		if (arg1 == 1) {
			local8++;
			local13++;
		}
		if (arg1 == 2) {
			local8++;
		}
		if (arg1 == 3) {
			local8++;
			local13--;
		}
		if (arg1 == 4) {
			local13--;
		}
		if (arg1 == 5) {
			local13--;
			local8--;
		}
		if (arg1 == 6) {
			local8--;
		}
		if (arg1 == 7) {
			local8--;
			local13++;
		}
		if (super.anInt4366 != -1 && Static301.aClass170_3.method3936(super.anInt4366).anInt3975 == 1) {
			super.anInt4366 = -1;
		}
		@Pc(88) Class13 local88;
		if (super.anInt4345 != -1) {
			local88 = Static96.aClass41_2.method1134(super.anInt4345);
			if (local88.aBoolean32 && local88.anInt466 != -1 && Static301.aClass170_3.method3936(local88.anInt466).anInt3975 == 1) {
				super.anInt4345 = -1;
			}
		}
		if (super.anInt4349 != -1) {
			local88 = Static96.aClass41_2.method1134(super.anInt4349);
			if (local88.aBoolean32 && local88.anInt466 != -1 && Static301.aClass170_3.method3936(local88.anInt466).anInt3975 == 1) {
				super.anInt4349 = -1;
			}
		}
		if (super.anInt4404 < 9) {
			super.anInt4404++;
		}
		for (@Pc(153) int local153 = super.anInt4404; local153 > 0; local153--) {
			super.anIntArray287[local153] = super.anIntArray287[local153 - 1];
			super.anIntArray288[local153] = super.anIntArray288[local153 - 1];
			super.aByteArray52[local153] = super.aByteArray52[local153 - 1];
		}
		super.anIntArray287[0] = local8;
		super.aByteArray52[0] = (byte) arg0;
		super.anIntArray288[0] = local13;
	}

	@OriginalMember(owner = "client!at", name = "g", descriptor = "(I)Z")
	public boolean method456() {
		return this.aClass47_1 != null;
	}

	@OriginalMember(owner = "client!at", name = "e", descriptor = "(Z)Z")
	private boolean method457() {
		return this.aClass47_1.aBoolean134;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!qa;II)Z")
	@Override
	public boolean method5270(@OriginalArg(1) Class172 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass47_1 == null || !this.method453(131072, arg0)) {
			return false;
		}
		@Pc(19) Class107 local19 = arg0.method5495();
		@Pc(24) int local24 = super.aClass91_7.method2048();
		local19.O(local24);
		local19.ZA(super.anInt4318, super.anInt4320, super.anInt4321);
		@Pc(37) boolean local37 = false;
		for (@Pc(39) int local39 = 0; local39 < super.aClass9Array3.length; local39++) {
			if (super.aClass9Array3[local39] != null && super.aClass9Array3[local39].method5693(arg2, arg1, local19, this.aClass47_1.anInt1616 == 1)) {
				local37 = true;
				break;
			}
		}
		super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
		return local37;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZLclient!qa;)Lclient!ae;")
	@Override
	public Class6_Sub1 method5274(@OriginalArg(1) Class172 arg0) {
		if (this.aClass47_1 == null || !this.method453(2048, arg0)) {
			return null;
		}
		@Pc(21) Class107 local21 = arg0.method5495();
		@Pc(26) int local26 = super.aClass91_7.method2048();
		local21.O(local26);
		local21.ZA(super.anInt4318, super.anInt4320, super.anInt4321);
		@Pc(41) Class1 local41 = this.method3514();
		@Pc(54) Class47 local54 = this.aClass47_1.anIntArray94 == null ? this.aClass47_1 : this.aClass47_1.method1251(Static85.aClass49_1);
		if (Static374.aClass20_Sub1_1.aBoolean191 && local54.aBoolean131 && local41.aBoolean1) {
			@Pc(79) Class128 local79 = super.anInt4366 != -1 && super.anInt4387 == 0 ? Static301.aClass170_3.method3936(super.anInt4366) : null;
			@Pc(96) Class128 local96 = super.anInt4389 == -1 || super.aBoolean378 && local79 != null ? null : Static301.aClass170_3.method3936(super.anInt4389);
			@Pc(148) Class9 local148 = Static9.method113(arg0, local26, this.aClass47_1.anInt1616, this.aClass47_1.aByte27 & 0xFF, this.aClass47_1.aShort37 & 0xFFFF, super.anInt4353, super.aBoolean376, super.aClass9Array3[0], local96 == null ? super.anInt4327 : super.anInt4350, this.aClass47_1.aShort36 & 0xFFFF, super.anInt4381, local96 == null ? local79 : local96, super.anInt4382, this.aClass47_1.aByte30 & 0xFF);
			if (local148 != null) {
				@Pc(153) float local153 = arg0.la();
				@Pc(156) float local156 = arg0.w();
				arg0.method5527(false);
				arg0.o(local153, local156 - 150.0F);
				local148.method5695(local21, null, 0);
				arg0.o(local153, local156);
				arg0.method5527(true);
			}
		}
		@Pc(179) Class6_Sub1 local179 = null;
		if (this.method457()) {
			local179 = Static43.method829(super.aClass9Array3.length);
		}
		if (super.aClass6_Sub8_7 == null) {
			arg0.method5509(super.aClass9Array3, local21, local179 == null ? null : local179.aClass6_Sub5Array1, 0);
		} else {
			@Pc(196) Class227 local196 = super.aClass6_Sub8_7.method5923();
			arg0.method5522(super.aClass9Array3, local196, local21, local179 == null ? null : local179.aClass6_Sub5Array1, 0);
		}
		this.method3501(false, arg0, super.aClass9Array3);
		if (super.aClass9Array3[2] != null) {
			if (local26 != 0) {
				super.aClass9Array3[2].k(local26);
			}
			super.aClass9Array3[2].ja(-super.aClass3_Sub15_3.anInt2336 + super.anInt4318, super.anInt4320 + -super.aClass3_Sub15_3.anInt2339, -super.aClass3_Sub15_3.anInt2323 + super.anInt4321);
		}
		super.anInt4375 = Static52.anInt1374;
		super.aClass9Array3[0] = super.aClass9Array3[1] = super.aClass9Array3[2] = super.aClass9Array3[3] = null;
		return local179;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method5276() {
		return false;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BIIZII)V")
	public void method458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		super.aByte77 = (byte) arg1;
		if (super.anInt4366 != -1 && Static301.aClass170_3.method3936(super.anInt4366).anInt3975 == 1) {
			super.anInt4366 = -1;
		}
		@Pc(42) Class13 local42;
		if (super.anInt4345 != -1) {
			local42 = Static96.aClass41_2.method1134(super.anInt4345);
			if (local42.aBoolean32 && local42.anInt466 != -1 && Static301.aClass170_3.method3936(local42.anInt466).anInt3975 == 1) {
				super.anInt4345 = -1;
			}
		}
		if (super.anInt4349 != -1) {
			local42 = Static96.aClass41_2.method1134(super.anInt4349);
			if (local42.aBoolean32 && local42.anInt466 != -1 && Static301.aClass170_3.method3936(local42.anInt466).anInt3975 == 1) {
				super.anInt4349 = -1;
			}
		}
		if (!arg2) {
			@Pc(102) int local102 = arg4 - super.anIntArray287[0];
			@Pc(110) int local110 = arg3 - super.anIntArray288[0];
			if (local102 >= -8 && local102 <= 8 && local110 >= -8 && local110 <= 8) {
				if (super.anInt4404 < 9) {
					super.anInt4404++;
				}
				for (@Pc(139) int local139 = super.anInt4404; local139 > 0; local139--) {
					super.anIntArray287[local139] = super.anIntArray287[local139 - 1];
					super.anIntArray288[local139] = super.anIntArray288[local139 - 1];
					super.aByteArray52[local139] = super.aByteArray52[local139 - 1];
				}
				super.anIntArray287[0] = arg4;
				super.aByteArray52[0] = 1;
				super.anIntArray288[0] = arg3;
				return;
			}
		}
		super.anInt4403 = 0;
		super.anIntArray287[0] = arg4;
		super.anInt4405 = 0;
		super.anInt4404 = 0;
		super.anIntArray288[0] = arg3;
		super.anInt4318 = (super.anIntArray287[0] << 7) + (arg0 << 6);
		super.anInt4321 = (super.anIntArray288[0] << 7) + (arg0 << 6);
		if (super.aClass6_Sub8_7 != null) {
			super.aClass6_Sub8_7.method5916();
		}
	}
}
