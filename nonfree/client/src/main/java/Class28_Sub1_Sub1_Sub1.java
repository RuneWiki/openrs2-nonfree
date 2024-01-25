import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class28_Sub1_Sub1_Sub1 extends Class28_Sub1_Sub1 {

	@OriginalMember(owner = "client!km", name = "tc", descriptor = "Lclient!dr;")
	public Class61 aClass61_1;

	@OriginalMember(owner = "client!km", name = "wc", descriptor = "I")
	public int anInt3383 = -1;

	@OriginalMember(owner = "client!km", name = "Hc", descriptor = "I")
	public int anInt3393 = -1;

	static {
		new Class57("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		if (this.aClass61_1 == null || !this.method2969(arg2, 65536)) {
			return false;
		}
		@Pc(26) Class118 local26 = arg2.method4908();
		@Pc(31) int local31 = super.aClass251_7.method5710();
		local26.method2656(local31);
		local26.method2658(super.anInt5774, super.anInt5769, super.anInt5766);
		for (@Pc(44) int local44 = 0; super.aClass75Array3.length > local44; local44++) {
			if (super.aClass75Array3[local44] != null && super.aClass75Array3[local44].method5460(arg0, arg1, local26, this.aClass61_1.anInt1467 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)I")
	@Override
	public int method4012() {
		if (this.aClass61_1.anIntArray142 != null) {
			@Pc(15) Class61 local15 = this.aClass61_1.method1216(Static331.aClass115_1);
			if (local15 != null && local15.anInt1470 != -1) {
				return local15.anInt1470;
			}
		}
		return this.aClass61_1.anInt1470 == -1 ? super.method4012() : this.aClass61_1.anInt1470;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZIIIIB)V")
	public void method2965(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super.aByte73 = (byte) arg3;
		if (super.anInt4314 != -1 && Static176.aClass43_2.method930(super.anInt4314).anInt4510 == 1) {
			super.anInt4314 = -1;
		}
		if (super.anInt4367 != -1) {
			@Pc(45) Class125 local45 = Static224.aClass203_2.method4559(super.anInt4367);
			if (local45.aBoolean236 && local45.anInt3050 != -1 && Static176.aClass43_2.method930(local45.anInt3050).anInt4510 == 1) {
				super.anInt4367 = -1;
			}
		}
		if (!arg0) {
			@Pc(73) int local73 = arg1 - super.anIntArray491[0];
			@Pc(81) int local81 = arg2 - super.anIntArray490[0];
			if (local73 >= -8 && local73 <= 8 && local81 >= -8 && local81 <= 8) {
				if (super.anInt4378 < 9) {
					super.anInt4378++;
				}
				for (@Pc(110) int local110 = super.anInt4378; local110 > 0; local110--) {
					super.anIntArray491[local110] = super.anIntArray491[local110 - 1];
					super.anIntArray490[local110] = super.anIntArray490[local110 - 1];
					super.aByteArray56[local110] = super.aByteArray56[local110 - 1];
				}
				super.anIntArray491[0] = arg1;
				super.anIntArray490[0] = arg2;
				super.aByteArray56[0] = 1;
				return;
			}
		}
		super.anInt4378 = 0;
		super.anInt4375 = 0;
		super.anInt4376 = 0;
		super.anIntArray491[0] = arg1;
		super.anIntArray490[0] = arg2;
		super.anInt5774 = super.anIntArray491[0] * 128 + arg4 * 64;
		super.anInt5766 = arg4 * 64 + super.anIntArray490[0] * 128;
		if (super.aClass12_Sub4_4 != null) {
			super.aClass12_Sub4_4.method1801();
		}
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		if (this.aClass61_1 == null || !this.method2969(arg0, 1024)) {
			return null;
		}
		@Pc(17) Class118 local17 = arg0.method4908();
		@Pc(26) int local26 = super.aClass251_7.method5710();
		local17.method2656(local26);
		local17.method2658(super.anInt5774, super.anInt5769, super.anInt5766);
		@Pc(41) Class36 local41 = this.method4014();
		@Pc(54) Class61 local54 = this.aClass61_1.anIntArray142 == null ? this.aClass61_1 : this.aClass61_1.method1216(Static331.aClass115_1);
		if (Static164.aClass154_Sub1_1.aBoolean474 && local54.aBoolean98 && local41.aBoolean35) {
			@Pc(79) Class177 local79 = super.anInt4314 != -1 && super.anInt4327 == 0 ? Static176.aClass43_2.method930(super.anInt4314) : null;
			@Pc(96) Class177 local96 = super.anInt4333 == -1 || super.aBoolean340 && local79 != null ? null : Static176.aClass43_2.method930(super.anInt4333);
			@Pc(148) Class75 local148 = Static392.method5712(super.aClass75Array3[0], this.aClass61_1.aByte19 & 0xFF, this.aClass61_1.anInt1467, this.aClass61_1.aShort20 & 0xFFFF, super.anInt4364, arg0, this.aClass61_1.aShort21 & 0xFFFF, super.anInt4372, this.aClass61_1.aByte20 & 0xFF, local96 == null ? super.anInt4356 : super.anInt4316, super.aBoolean337, local26, local96 == null ? local79 : local96, super.anInt4355);
			if (local148 != null) {
				@Pc(153) float local153 = arg0.method4912();
				@Pc(156) float local156 = arg0.method4913();
				arg0.method4923(false);
				arg0.method4856(local153, local156 - 150.0F);
				local148.method5469(local17, null, 0);
				arg0.method4856(local153, local156);
				arg0.method4923(true);
			}
		}
		@Pc(179) Class12_Sub7 local179 = null;
		if (this.method2968()) {
			local179 = Static146.method2294(super.aClass75Array3.length);
		}
		if (super.aClass12_Sub4_4 == null) {
			arg0.method4937(super.aClass75Array3, local17, local179 == null ? null : local179.aClass12_Sub5Array1, 0);
		} else {
			@Pc(210) Class47 local210 = super.aClass12_Sub4_4.method1797();
			arg0.method4886(super.aClass75Array3, local210, local17, local179 == null ? null : local179.aClass12_Sub5Array1, 0);
		}
		this.method4006(false, super.aClass75Array3, arg0);
		if (super.aClass75Array3[2] != null) {
			if (local26 != 0) {
				super.aClass75Array3[2].method5475(local26);
			}
			super.aClass75Array3[2].method5482(-super.aClass3_Sub32_3.anInt4606 + super.anInt5774, -super.aClass3_Sub32_3.anInt4614 + super.anInt5769, super.anInt5766 - super.aClass3_Sub32_3.anInt4601);
		}
		super.anInt4332 = Static226.anInt3990;
		return local179;
	}

	@OriginalMember(owner = "client!km", name = "j", descriptor = "(I)I")
	@Override
	public int method5191() {
		return super.anInt4344;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
		if (this.aClass61_1 != null && (super.aBoolean341 || this.method2969(arg0, 0))) {
			this.method4006(super.aBoolean341, super.aClass75Array3, arg0);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!dr;)V")
	public void method2967(@OriginalArg(1) Class61 arg0) {
		this.aClass61_1 = arg0;
		if (super.aClass12_Sub4_4 != null) {
			super.aClass12_Sub4_4.method1801();
		}
	}

	@OriginalMember(owner = "client!km", name = "l", descriptor = "(I)Z")
	private boolean method2968() {
		return this.aClass61_1.aBoolean102;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)I")
	@Override
	protected int method4007() {
		if (this.aClass61_1.anIntArray142 != null) {
			@Pc(18) Class61 local18 = this.aClass61_1.method1216(Static331.aClass115_1);
			if (local18 != null && local18.anInt1469 != -1) {
				return local18.anInt1469;
			}
		}
		return this.aClass61_1.anInt1469;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)I")
	@Override
	public int method4013() {
		if (this.aClass61_1.anIntArray142 != null) {
			@Pc(23) Class61 local23 = this.aClass61_1.method1216(Static331.aClass115_1);
			if (local23 != null && local23.anInt1447 != -1) {
				return local23.anInt1447;
			}
		}
		return this.aClass61_1.anInt1447;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!np;I)Z")
	private boolean method2969(@OriginalArg(1) Class155 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class36 local11 = this.method4014();
		@Pc(29) Class177 local29 = super.anInt4314 != -1 && super.anInt4327 == 0 ? Static176.aClass43_2.method930(super.anInt4314) : null;
		@Pc(47) Class177 local47 = super.anInt4333 == -1 || super.aBoolean340 && local29 != null ? null : Static176.aClass43_2.method930(super.anInt4333);
		@Pc(50) int local50 = local11.anInt678;
		@Pc(53) int local53 = local11.anInt673;
		if (local50 != 0 || local53 != 0 || local11.anInt669 != 0 || local11.anInt671 != 0) {
			arg1 |= 0x7;
		}
		@Pc(101) Class75 local101 = super.aClass75Array3[0] = this.aClass61_1.method1211(super.anInt4317, super.anInt4338, super.aClass81Array3, super.anInt4356, super.anInt4363, arg1, super.anInt4352, Static176.aClass43_2, arg0, Static331.aClass115_1, super.anInt4316, Static79.aClass124_1, local47, local29);
		if (local101 == null) {
			return false;
		}
		super.anInt4344 = local101.method5476();
		this.method4018(local101);
		@Pc(118) int local118 = super.aClass251_7.method5710();
		super.anInt4355 = 0;
		super.anInt4364 = 0;
		super.anInt4372 = 0;
		if (local50 == 0 && local53 == 0) {
			this.method4016(this.method4009() << 7, this.method4009() << 7, local118);
		} else {
			this.method4016(local50, local53, local118);
			if (super.anInt4364 != 0) {
				super.aClass75Array3[0].method5466(super.anInt4364);
			}
			if (super.anInt4372 != 0) {
				super.aClass75Array3[0].method5474(super.anInt4372);
			}
			if (super.anInt4355 != 0) {
				super.aClass75Array3[0].method5482(0, super.anInt4355, 0);
			}
		}
		super.aClass75Array3[1] = null;
		if (super.anInt4367 != -1 && super.anInt4351 != -1) {
			@Pc(219) Class125 local219 = Static224.aClass203_2.method4559(super.anInt4367);
			@Pc(239) Class75 local239 = local219.method2695(Static176.aClass43_2, super.anInt4361, arg0, super.anInt4341, super.anInt4351, local7 | (local219.aBoolean235 ? 7 : 2));
			if (local239 != null) {
				local239.method5482(0, -super.anInt4331, 0);
				if (local219.aBoolean235 && (local50 != 0 || local53 != 0)) {
					if (super.anInt4364 != 0) {
						local239.method5466(super.anInt4364);
					}
					if (super.anInt4372 != 0) {
						local239.method5474(super.anInt4372);
					}
					if (super.anInt4355 != 0) {
						local239.method5482(0, super.anInt4355, 0);
					}
				}
				super.aClass75Array3[1] = local239;
			}
		}
		super.aClass75Array3[2] = null;
		if (super.aClass3_Sub32_3 != null) {
			if (Static76.anInt1617 >= super.aClass3_Sub32_3.anInt4604) {
				super.aClass3_Sub32_3 = null;
			} else if (Static76.anInt1617 >= super.aClass3_Sub32_3.anInt4602) {
				@Pc(316) Class75 local316 = super.aClass3_Sub32_3.method4152(arg0, local7 | 0x7);
				if (local316 != null) {
					local316.method5482(super.aClass3_Sub32_3.anInt4606 - super.anInt5774, super.aClass3_Sub32_3.anInt4614 + -super.anInt5769, super.aClass3_Sub32_3.anInt4601 - super.anInt5766);
					if (local118 != 0) {
						local316.method5475(local118);
					}
					super.aClass75Array3[2] = local316;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5413() {
		return false;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V")
	public void method2970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = super.anIntArray491[0];
		@Pc(15) int local15 = super.anIntArray490[0];
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
		if (super.anInt4314 != -1 && Static176.aClass43_2.method930(super.anInt4314).anInt4510 == 1) {
			super.anInt4314 = -1;
		}
		if (super.anInt4367 != -1) {
			@Pc(93) Class125 local93 = Static224.aClass203_2.method4559(super.anInt4367);
			if (local93.aBoolean236 && local93.anInt3050 != -1 && Static176.aClass43_2.method930(local93.anInt3050).anInt4510 == 1) {
				super.anInt4367 = -1;
			}
		}
		if (super.anInt4378 < 9) {
			super.anInt4378++;
		}
		for (@Pc(126) int local126 = super.anInt4378; local126 > 0; local126--) {
			super.anIntArray491[local126] = super.anIntArray491[local126 - 1];
			super.anIntArray490[local126] = super.anIntArray490[local126 - 1];
			super.aByteArray56[local126] = super.aByteArray56[local126 - 1];
		}
		super.anIntArray491[0] = local10;
		super.anIntArray490[0] = local15;
		super.aByteArray56[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(B)Z")
	public boolean method2971() {
		return this.aClass61_1 != null;
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V")
	@Override
	public void method5411() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!in;ILclient!np;BZI)V")
	@Override
	public void method5410(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class155 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}
}
