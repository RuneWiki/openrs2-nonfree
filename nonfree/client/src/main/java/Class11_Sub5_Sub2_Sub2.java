import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class11_Sub5_Sub2_Sub2 extends Class11_Sub5_Sub2 {

	@OriginalMember(owner = "client!oe", name = "nc", descriptor = "[I")
	public static int[] anIntArray318 = new int[2];

	@OriginalMember(owner = "client!oe", name = "Ec", descriptor = "I")
	public static int anInt4652 = 0;

	@OriginalMember(owner = "client!oe", name = "tc", descriptor = "Lclient!fk;")
	public Class71 aClass71_1;

	@OriginalMember(owner = "client!oe", name = "Ac", descriptor = "I")
	public int anInt4648 = -1;

	@OriginalMember(owner = "client!oe", name = "Gc", descriptor = "I")
	public int anInt4654 = -1;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!wm;)Z", line = 3)
	private boolean method4336(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class222 local11 = this.method4333();
		@Pc(27) Class157 local27 = super.anInt4589 != -1 && super.anInt4582 == 0 ? Static37.aClass85_1.method2373(super.anInt4589) : null;
		@Pc(45) Class157 local45 = super.anInt4577 == -1 || super.aBoolean317 && local27 != null ? null : Static37.aClass85_1.method2373(super.anInt4577);
		@Pc(48) int local48 = local11.anInt6275;
		@Pc(51) int local51 = local11.anInt6278;
		if (local48 != 0 || local51 != 0 || local11.anInt6269 != 0 || local11.anInt6271 != 0) {
			arg0 |= 0x7;
		}
		@Pc(102) Class31 local102 = super.aClass31Array3[0] = this.aClass71_1.method2088(Static55.aClass7_1, super.anInt4599, local27, arg1, Static37.aClass85_1, super.anInt4620, super.anInt4617, super.anInt4585, local45, arg0, super.aClass20Array3, super.anInt4615, Static199.aClass226_1, super.anInt4584);
		if (local102 == null) {
			return false;
		}
		super.anInt4621 = local102.method3803();
		this.method4321(local102);
		@Pc(119) int local119 = super.aClass248_7.method6442();
		super.anInt4581 = 0;
		super.anInt4600 = 0;
		super.anInt4588 = 0;
		if (local48 == 0 && local51 == 0) {
			this.method4322(this.method4329() << 7, this.method4329() << 7, local119);
		} else {
			this.method4322(local51, local48, local119);
			if (super.anInt4581 != 0) {
				super.aClass31Array3[0].method3825(super.anInt4581);
			}
			if (super.anInt4588 != 0) {
				super.aClass31Array3[0].method3816(super.anInt4588);
			}
			if (super.anInt4600 != 0) {
				super.aClass31Array3[0].method3814(0, super.anInt4600, 0);
			}
		}
		super.aClass31Array3[1] = null;
		if (super.anInt4586 != -1 && super.anInt4574 != -1) {
			@Pc(218) Class91 local218 = Static299.aClass211_2.method5408(super.anInt4586);
			@Pc(238) Class31 local238 = local218.method2435(super.anInt4603, super.anInt4611, arg1, (local218.aBoolean178 ? 7 : 2) | local7, Static37.aClass85_1, super.anInt4574);
			if (local238 != null) {
				local238.method3814(0, -super.anInt4630, 0);
				if (local218.aBoolean178 && (local48 != 0 || local51 != 0)) {
					if (super.anInt4581 != 0) {
						local238.method3825(super.anInt4581);
					}
					if (super.anInt4588 != 0) {
						local238.method3816(super.anInt4588);
					}
					if (super.anInt4600 != 0) {
						local238.method3814(0, super.anInt4600, 0);
					}
				}
				super.aClass31Array3[1] = local238;
			}
		}
		super.aClass31Array3[2] = null;
		if (super.aClass2_Sub6_3 != null) {
			if (super.aClass2_Sub6_3.anInt1117 <= Class83.anInt2345) {
				super.aClass2_Sub6_3 = null;
			} else if (Class83.anInt2345 >= super.aClass2_Sub6_3.anInt1099) {
				@Pc(331) Class31 local331 = super.aClass2_Sub6_3.method1360(arg1, local7 | 0x7);
				if (local331 != null) {
					local331.method3814(-super.anInt6768 + super.aClass2_Sub6_3.anInt1103, super.aClass2_Sub6_3.anInt1113 + -super.anInt6769, -super.anInt6770 + super.aClass2_Sub6_3.anInt1100);
					if (local119 != 0) {
						local331.method3834(local119);
					}
					super.aClass31Array3[2] = local331;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V", line = 116)
	@Override
	public void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Z", line = 129)
	public boolean method4337() {
		return this.aClass71_1 != null;
	}

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "(I)Z", line = 145)
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)V", line = 166)
	@Override
	public void method6070() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)I", line = 177)
	@Override
	public int method4325() {
		if (this.aClass71_1.anIntArray129 != null) {
			@Pc(18) Class71 local18 = this.aClass71_1.method2095(Static199.aClass226_1);
			if (local18 != null && local18.anInt2029 != -1) {
				return local18.anInt2029;
			}
		}
		return this.aClass71_1.anInt2029;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)V", line = 197)
	public void method4339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray316[0];
		@Pc(15) int local15 = super.anIntArray317[0];
		if (arg1 == 0) {
			local15++;
		}
		if (arg1 == 1) {
			local10++;
			local15++;
		}
		if (arg1 == 2) {
			local10++;
		}
		if (arg1 == 3) {
			local15--;
			local10++;
		}
		if (arg1 == 4) {
			local15--;
		}
		if (arg1 == 5) {
			local10--;
			local15--;
		}
		if (arg1 == 6) {
			local10--;
		}
		if (arg1 == 7) {
			local10--;
			local15++;
		}
		if (super.anInt4589 != -1 && Static37.aClass85_1.method2373(super.anInt4589).anInt4024 == 1) {
			super.anInt4589 = -1;
		}
		if (super.anInt4586 != -1) {
			@Pc(83) Class91 local83 = Static299.aClass211_2.method5408(super.anInt4586);
			if (local83.aBoolean177 && local83.anInt2445 != -1 && Static37.aClass85_1.method2373(local83.anInt2445).anInt4024 == 1) {
				super.anInt4586 = -1;
			}
		}
		if (super.anInt4634 < 9) {
			super.anInt4634++;
		}
		for (@Pc(118) int local118 = super.anInt4634; local118 > 0; local118--) {
			super.anIntArray316[local118] = super.anIntArray316[local118 - 1];
			super.anIntArray317[local118] = super.anIntArray317[local118 - 1];
			super.aByteArray51[local118] = super.aByteArray51[local118 - 1];
		}
		super.anIntArray316[0] = local10;
		super.aByteArray51[0] = (byte) arg0;
		super.anIntArray317[0] = local15;
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 285)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		if (this.aClass71_1 == null || !this.method4336(1024, arg0)) {
			return null;
		}
		@Pc(17) Class14 local17 = arg0.method2810();
		@Pc(22) int local22 = super.aClass248_7.method6442();
		local17.method3926(local22);
		local17.method3937(super.anInt6768, super.anInt6769, super.anInt6770);
		@Pc(37) Class222 local37 = this.method4333();
		@Pc(50) Class71 local50 = this.aClass71_1.anIntArray129 == null ? this.aClass71_1 : this.aClass71_1.method2095(Static199.aClass226_1);
		if (Static203.aClass177_Sub1_2.aBoolean358 && local50.aBoolean142 && local37.aBoolean424) {
			@Pc(75) Class157 local75 = super.anInt4589 != -1 && super.anInt4582 == 0 ? Static37.aClass85_1.method2373(super.anInt4589) : null;
			@Pc(92) Class157 local92 = super.anInt4577 == -1 || super.aBoolean317 && local75 != null ? null : Static37.aClass85_1.method2373(super.anInt4577);
			@Pc(144) Class31 local144 = Static166.method2342(local92 == null ? super.anInt4599 : super.anInt4617, this.aClass71_1.aByte15 & 0xFF, this.aClass71_1.aByte14 & 0xFF, super.anInt4588, local92 == null ? local75 : local92, this.aClass71_1.anInt2038, this.aClass71_1.aShort25 & 0xFFFF, super.aClass31Array3[0], local22, arg0, this.aClass71_1.aShort24 & 0xFFFF, super.aBoolean318, super.anInt4600, super.anInt4581);
			if (local144 != null) {
				@Pc(149) float local149 = arg0.method2804();
				@Pc(152) float local152 = arg0.method2862();
				arg0.method2854(false);
				arg0.method2825(local149, local152 - 150.0F);
				local144.method3836(local17, null, 0);
				arg0.method2825(local149, local152);
				arg0.method2854(true);
			}
		}
		@Pc(175) Class12_Sub4 local175 = null;
		if (this.method4341()) {
			local175 = Static138.method2708(super.aClass31Array3.length);
		}
		if (super.aClass12_Sub5_3 == null) {
			arg0.method2883(super.aClass31Array3, local17, local175 == null ? null : local175.aClass12_Sub2Array1, 0);
		} else {
			@Pc(211) Class224 local211 = super.aClass12_Sub5_3.method4359();
			arg0.method2832(super.aClass31Array3, local211, local17, local175 == null ? null : local175.aClass12_Sub2Array1, 0);
		}
		this.method4334(arg0, super.aClass31Array3, false);
		if (super.aClass31Array3[2] != null) {
			if (local22 != 0) {
				super.aClass31Array3[2].method3834(local22);
			}
			super.aClass31Array3[2].method3814(-super.aClass2_Sub6_3.anInt1103 + super.anInt6768, super.anInt6769 + -super.aClass2_Sub6_3.anInt1113, super.anInt6770 - super.aClass2_Sub6_3.anInt1100);
		}
		super.anInt4595 = Class2_Sub2_Sub10_Sub1.anInt3082;
		return local175;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIZI)V", line = 365)
	public void method4340(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte78 = (byte) arg1;
		if (super.anInt4589 != -1 && Static37.aClass85_1.method2373(super.anInt4589).anInt4024 == 1) {
			super.anInt4589 = -1;
		}
		if (super.anInt4586 != -1) {
			@Pc(37) Class91 local37 = Static299.aClass211_2.method5408(super.anInt4586);
			if (local37.aBoolean177 && local37.anInt2445 != -1 && Static37.aClass85_1.method2373(local37.anInt2445).anInt4024 == 1) {
				super.anInt4586 = -1;
			}
		}
		if (!arg3) {
			@Pc(67) int local67 = arg2 - super.anIntArray316[0];
			@Pc(75) int local75 = arg4 - super.anIntArray317[0];
			if (local67 >= -8 && local67 <= 8 && local75 >= -8 && local75 <= 8) {
				if (super.anInt4634 < 9) {
					super.anInt4634++;
				}
				for (@Pc(108) int local108 = super.anInt4634; local108 > 0; local108--) {
					super.anIntArray316[local108] = super.anIntArray316[local108 - 1];
					super.anIntArray317[local108] = super.anIntArray317[local108 - 1];
					super.aByteArray51[local108] = super.aByteArray51[local108 - 1];
				}
				super.anIntArray316[0] = arg2;
				super.anIntArray317[0] = arg4;
				super.aByteArray51[0] = 1;
				return;
			}
		}
		super.anInt4634 = 0;
		super.anIntArray316[0] = arg2;
		super.anInt4632 = 0;
		super.anInt4633 = 0;
		super.anIntArray317[0] = arg4;
		super.anInt6768 = arg0 * 64 + super.anIntArray316[0] * 128;
		super.anInt6770 = super.anIntArray317[0] * 128 + arg0 * 64;
		if (super.aClass12_Sub5_3 != null) {
			super.aClass12_Sub5_3.method4360();
		}
	}

	@OriginalMember(owner = "client!oe", name = "h", descriptor = "(I)I", line = 433)
	@Override
	public int method6081() {
		return super.anInt4621;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 445)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		if (this.aClass71_1 == null || !this.method4336(65536, arg2)) {
			return false;
		}
		@Pc(19) Class14 local19 = arg2.method2810();
		@Pc(24) int local24 = super.aClass248_7.method6442();
		local19.method3926(local24);
		local19.method3937(super.anInt6768, super.anInt6769, super.anInt6770);
		for (@Pc(43) int local43 = 0; super.aClass31Array3.length > local43; local43++) {
			if (super.aClass31Array3[local43] != null && super.aClass31Array3[local43].method3821(arg0, arg1, local19, this.aClass71_1.anInt2038 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I", line = 481)
	@Override
	public int method4324() {
		if (this.aClass71_1.anIntArray129 != null) {
			@Pc(21) Class71 local21 = this.aClass71_1.method2095(Static199.aClass226_1);
			if (local21 != null && local21.anInt2008 != -1) {
				return local21.anInt2008;
			}
		}
		return this.aClass71_1.anInt2008 == -1 ? super.method4324() : this.aClass71_1.anInt2008;
	}

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "(I)Z", line = 516)
	private boolean method4341() {
		return this.aClass71_1.aBoolean145;
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(B)I", line = 542)
	@Override
	protected int method4330() {
		if (this.aClass71_1.anIntArray129 != null) {
			@Pc(19) Class71 local19 = this.aClass71_1.method2095(Static199.aClass226_1);
			if (local19 != null && local19.anInt2030 != -1) {
				return local19.anInt2030;
			}
		}
		return this.aClass71_1.anInt2030;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!wm;B)V", line = 570)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
		if (this.aClass71_1 != null && (super.aBoolean321 || this.method4336(0, arg0))) {
			this.method4334(arg0, super.aClass31Array3, super.aBoolean321);
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!fk;I)V", line = 595)
	public void method4343(@OriginalArg(0) Class71 arg0) {
		this.aClass71_1 = arg0;
		if (super.aClass12_Sub5_3 != null) {
			super.aClass12_Sub5_3.method4360();
		}
	}
}
