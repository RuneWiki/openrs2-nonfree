import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class6_Sub1_Sub2_Sub2 extends Class6_Sub1_Sub2 {

	@OriginalMember(owner = "client!tt", name = "ad", descriptor = "Lclient!pl;")
	public Class230 aClass230_1;

	@OriginalMember(owner = "client!tt", name = "Ec", descriptor = "I")
	public int anInt8602 = -1;

	@OriginalMember(owner = "client!tt", name = "Gc", descriptor = "I")
	public int anInt8604 = -1;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIB)V")
	public void method7091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray733[0];
		@Pc(15) int local15 = super.anIntArray734[0];
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
		if (super.anInt8592 != -1 && Static46.aClass247_1.method6029(super.anInt8592).anInt4142 == 1) {
			super.anInt8592 = -1;
		}
		@Pc(85) Class186 local85;
		if (super.anInt8565 != -1) {
			local85 = Static17.aClass231_2.method5905(super.anInt8565);
			if (local85.aBoolean375 && local85.anInt5838 != -1 && Static46.aClass247_1.method6029(local85.anInt5838).anInt4142 == 1) {
				super.anInt8565 = -1;
			}
		}
		if (super.anInt8526 != -1) {
			local85 = Static17.aClass231_2.method5905(super.anInt8526);
			if (local85.aBoolean375 && local85.anInt5838 != -1 && Static46.aClass247_1.method6029(local85.anInt5838).anInt4142 == 1) {
				super.anInt8526 = -1;
			}
		}
		if (super.anInt8599 < 9) {
			super.anInt8599++;
		}
		for (@Pc(147) int local147 = super.anInt8599; local147 > 0; local147--) {
			super.anIntArray733[local147] = super.anIntArray733[local147 - 1];
			super.anIntArray734[local147] = super.anIntArray734[local147 - 1];
			super.aByteArray99[local147] = super.aByteArray99[local147 - 1];
		}
		super.anIntArray733[0] = local10;
		super.anIntArray734[0] = local15;
		super.aByteArray99[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		if (this.aClass230_1 == null || !this.method7093(arg0, 2048)) {
			return null;
		}
		@Pc(17) Class205 local17 = arg0.method7448();
		@Pc(22) int local22 = super.aClass173_7.method4694();
		local17.a(local22);
		local17.G(super.anInt8811, super.anInt8814 - 20, super.anInt8813);
		@Pc(39) Class73 local39 = this.method7088();
		@Pc(52) Class230 local52 = this.aClass230_1.anIntArray627 == null ? this.aClass230_1 : this.aClass230_1.method5898(Static127.aClass215_1);
		if (Static7.aClass3_Sub15_Sub1_1.aBoolean608 && local52.aBoolean449 && local39.aBoolean168) {
			@Pc(77) Class122 local77 = super.anInt8592 != -1 && super.anInt8575 == 0 ? Static46.aClass247_1.method6029(super.anInt8592) : null;
			@Pc(95) Class122 local95 = super.anInt8534 == -1 || super.aBoolean630 && local77 != null ? null : Static46.aClass247_1.method6029(super.anInt8534);
			@Pc(97) int local97 = 0;
			if (super.anInt8531 != 0) {
				local97 = this.method7078();
			}
			@Pc(158) Class2 local158 = Static518.method1673(super.anInt8572, this.aClass230_1.aByte61 & 0xFF, this.aClass230_1.aShort110 & 0xFFFF, local95 == null ? super.anInt8584 : super.anInt8556, local22, local95 == null ? local77 : local95, this.aClass230_1.anInt7040, super.anInt8564, super.aClass2Array3[0], local97, this.aClass230_1.aByte60 & 0xFF, this.aClass230_1.aShort109 & 0xFFFF, super.anInt8574, arg0);
			if (local158 != null) {
				arg0.method7412(false);
				local158.method5774(local17, null, 0);
				arg0.method7412(true);
			}
		}
		local17.a(local22);
		local17.G(super.anInt8811, super.anInt8814 - 5, super.anInt8813);
		@Pc(191) Class4_Sub1 local191 = null;
		if (this.method7094()) {
			local191 = Static264.method4641(super.aClass2Array3.length);
		}
		this.method7082(false, arg0, super.aClass2Array3, local17);
		if (super.aClass4_Sub4_8 == null) {
			arg0.method7468(super.aClass2Array3, local17, local191 == null ? null : local191.aClass4_Sub7Array1, 0);
		} else {
			@Pc(216) Class26 local216 = super.aClass4_Sub4_8.method4590();
			arg0.method7478(super.aClass2Array3, local216, local17, local191 == null ? null : local191.aClass4_Sub7Array1, 0);
		}
		super.aClass2Array3[0] = super.aClass2Array3[1] = super.aClass2Array3[2] = super.aClass2Array3[3] = null;
		super.anInt8595 = Static127.anInt2665;
		return local191;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZIIII)V")
	public void method7092(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		super.aByte100 = (byte) arg4;
		if (super.anInt8592 != -1 && Static46.aClass247_1.method6029(super.anInt8592).anInt4142 == 1) {
			super.anInt8592 = -1;
		}
		@Pc(37) Class186 local37;
		if (super.anInt8565 != -1) {
			local37 = Static17.aClass231_2.method5905(super.anInt8565);
			if (local37.aBoolean375 && local37.anInt5838 != -1 && Static46.aClass247_1.method6029(local37.anInt5838).anInt4142 == 1) {
				super.anInt8565 = -1;
			}
		}
		if (super.anInt8526 != -1) {
			local37 = Static17.aClass231_2.method5905(super.anInt8526);
			if (local37.aBoolean375 && local37.anInt5838 != -1 && Static46.aClass247_1.method6029(local37.anInt5838).anInt4142 == 1) {
				super.anInt8526 = -1;
			}
		}
		if (!arg1) {
			@Pc(98) int local98 = arg0 - super.anIntArray733[0];
			@Pc(106) int local106 = arg3 - super.anIntArray734[0];
			if (local98 >= -8 && local98 <= 8 && local106 >= -8 && local106 <= 8) {
				if (super.anInt8599 < 9) {
					super.anInt8599++;
				}
				for (@Pc(139) int local139 = super.anInt8599; local139 > 0; local139--) {
					super.anIntArray733[local139] = super.anIntArray733[local139 - 1];
					super.anIntArray734[local139] = super.anIntArray734[local139 - 1];
					super.aByteArray99[local139] = super.aByteArray99[local139 - 1];
				}
				super.anIntArray733[0] = arg0;
				super.anIntArray734[0] = arg3;
				super.aByteArray99[0] = 1;
				return;
			}
		}
		super.anInt8600 = 0;
		super.anIntArray733[0] = arg0;
		super.anInt8599 = 0;
		super.anInt8598 = 0;
		super.anIntArray734[0] = arg3;
		super.anInt8813 = (arg2 << 8) + (super.anIntArray734[0] << 9);
		super.anInt8811 = (arg2 << 8) + (super.anIntArray733[0] << 9);
		if (super.aClass4_Sub4_8 != null) {
			super.aClass4_Sub4_8.method4589();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)I")
	@Override
	protected int method7074() {
		if (this.aClass230_1.anIntArray627 != null) {
			@Pc(13) Class230 local13 = this.aClass230_1.method5898(Static127.aClass215_1);
			if (local13 != null && local13.anInt7031 != -1) {
				return local13.anInt7031;
			}
		}
		return this.aClass230_1.anInt7031;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!oa;BI)Z")
	private boolean method7093(@OriginalArg(0) Class5 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class73 local11 = this.method7088();
		@Pc(28) Class122 local28 = super.anInt8592 != -1 && super.anInt8575 == 0 ? Static46.aClass247_1.method6029(super.anInt8592) : null;
		@Pc(45) Class122 local45 = super.anInt8534 == -1 || super.aBoolean630 && local28 != null ? null : Static46.aClass247_1.method6029(super.anInt8534);
		@Pc(48) int local48 = local11.anInt2421;
		@Pc(51) int local51 = local11.anInt2430;
		if (local48 != 0 || local51 != 0 || local11.anInt2404 != 0 || local11.anInt2400 != 0) {
			arg1 |= 0x7;
		}
		@Pc(90) boolean local90 = super.aByte92 != 0 && Static223.anInt4829 >= super.anInt8547 && Static223.anInt4829 < super.anInt8523;
		if (local90) {
			arg1 |= 0x80000;
		}
		@Pc(129) Class2 local129 = super.aClass2Array3[0] = this.aClass230_1.method5890(super.anInt8551, super.anInt8580, local28, super.aClass152Array3, Static546.aClass132_1, Static127.aClass215_1, super.anInt8579, local45, arg1, arg0, super.anInt8584, super.anInt8556, Static46.aClass247_1, super.anInt8540);
		if (local129 == null) {
			return false;
		}
		super.anInt8530 = local129.DA();
		this.method7076(local129);
		@Pc(146) int local146 = super.aClass173_7.method4694();
		if (local48 == 0 && local51 == 0) {
			this.method7075(local146, this.method7083() << 9, this.method7083() << 9, 0, 0);
		} else {
			this.method7075(local146, local48, local51, local11.anInt2436, local11.anInt2401);
			if (super.anInt8574 != 0) {
				super.aClass2Array3[0].AA(super.anInt8574);
			}
			if (super.anInt8564 != 0) {
				super.aClass2Array3[0].v(super.anInt8564);
			}
			if (super.anInt8572 != 0) {
				super.aClass2Array3[0].m(0, super.anInt8572, 0);
			}
		}
		if (local90) {
			local129.method5782(super.aByte90, super.aByte91, super.aByte89, super.aByte92 & 0xFF);
		}
		@Pc(254) Class186 local254;
		@Pc(269) boolean local269;
		@Pc(271) int local271;
		@Pc(316) Class2 local316;
		if (super.anInt8565 == -1 || super.anInt8562 == -1) {
			super.aClass2Array3[1] = null;
		} else {
			local254 = Static17.aClass231_2.method5905(super.anInt8565);
			local269 = local254.aByte48 == 3 && (local48 != 0 || local51 != 0);
			local271 = local7;
			if (local269) {
				local271 = local7 | 0x7;
			} else {
				if (super.anInt8596 != 0) {
					local271 = local7 | 0x5;
				}
				if (super.anInt8578 != 0) {
					local271 |= 0x2;
				}
			}
			local316 = super.aClass2Array3[1] = local254.method4868(super.anInt8562, local271, Static46.aClass247_1, arg0, super.anInt8581, super.anInt8549);
			if (local316 != null) {
				if (super.anInt8578 != 0) {
					local316.m(0, -super.anInt8578 << 2, 0);
				}
				if (super.anInt8596 != 0) {
					local316.I(super.anInt8596 * 2048);
				}
				if (local269) {
					if (super.anInt8574 != 0) {
						local316.AA(super.anInt8574);
					}
					if (super.anInt8564 != 0) {
						local316.v(super.anInt8564);
					}
					if (super.anInt8572 != 0) {
						local316.m(0, super.anInt8572, 0);
					}
				}
			}
		}
		if (super.anInt8526 == -1 || super.anInt8543 == -1) {
			super.aClass2Array3[3] = null;
		} else {
			local254 = Static17.aClass231_2.method5905(super.anInt8526);
			local269 = local254.aByte48 == 3 && (local48 != 0 || local51 != 0);
			local271 = local7;
			if (local269) {
				local271 = local7 | 0x7;
			} else {
				if (super.anInt8571 != 0) {
					local271 = local7 | 0x5;
				}
				if (super.anInt8524 != 0) {
					local271 |= 0x2;
				}
			}
			local316 = super.aClass2Array3[3] = local254.method4861(Static46.aClass247_1, super.anInt8543, super.anInt8529, local271, arg0, super.anInt8586);
			if (local316 != null) {
				if (super.anInt8524 != 0) {
					local316.m(0, -super.anInt8524 << 2, 0);
				}
				if (super.anInt8571 != 0) {
					local316.I(super.anInt8571 * 2048);
				}
				if (local269) {
					if (super.anInt8574 != 0) {
						local316.AA(super.anInt8574);
					}
					if (super.anInt8564 != 0) {
						local316.v(super.anInt8564);
					}
					if (super.anInt8572 != 0) {
						local316.m(0, super.anInt8572, 0);
					}
				}
			}
		}
		super.aClass2Array3[2] = null;
		if (super.aClass3_Sub38_3 != null) {
			if (super.aClass3_Sub38_3.anInt6986 <= Static223.anInt4829) {
				super.aClass3_Sub38_3 = null;
			} else if (super.aClass3_Sub38_3.anInt6985 <= Static223.anInt4829) {
				@Pc(554) Class2 local554 = super.aClass3_Sub38_3.method5855(local7 | 0x7, arg0);
				if (local554 != null) {
					local554.m(-super.anInt8811 + super.aClass3_Sub38_3.anInt6983, -super.anInt8814 + super.aClass3_Sub38_3.anInt6969 + 5, -super.anInt8813 + super.aClass3_Sub38_3.anInt6980);
					if (local146 != 0) {
						local554.I(local146);
					}
					super.aClass2Array3[2] = local554;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
		if (this.aClass230_1 == null || !super.aBoolean633 && !this.method7093(arg0, 0)) {
			return;
		}
		@Pc(25) Class205 local25 = arg0.method7448();
		local25.a(super.aClass173_7.method4694());
		local25.G(super.anInt8811, super.anInt8814 - 20, super.anInt8813);
		this.method7082(super.aBoolean633, arg0, super.aClass2Array3, local25);
		super.aClass2Array3[0] = super.aClass2Array3[1] = super.aClass2Array3[2] = super.aClass2Array3[3] = null;
	}

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "(I)Z")
	private boolean method7094() {
		return this.aClass230_1.aBoolean452;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)I")
	@Override
	public int method7072() {
		if (this.aClass230_1.anIntArray627 != null) {
			@Pc(21) Class230 local21 = this.aClass230_1.method5898(Static127.aClass215_1);
			if (local21 != null && local21.anInt7056 != -1) {
				return local21.anInt7056;
			}
		}
		return this.aClass230_1.anInt7056 == -1 ? super.method7072() : this.aClass230_1.anInt7056;
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(B)I")
	@Override
	public int method7240() {
		return super.anInt8530;
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		if (this.aClass230_1 == null || !this.method7093(arg1, 131072)) {
			return false;
		}
		@Pc(31) Class205 local31 = arg1.method7448();
		@Pc(36) int local36 = super.aClass173_7.method4694();
		local31.a(local36);
		local31.G(super.anInt8811, super.anInt8814, super.anInt8813);
		@Pc(49) boolean local49 = false;
		for (@Pc(51) int local51 = 0; local51 < super.aClass2Array3.length; local51++) {
			if (super.aClass2Array3[local51] != null && super.aClass2Array3[local51].method5786(arg0, arg2, local31, this.aClass230_1.anInt7040 == 1)) {
				local49 = true;
				break;
			}
		}
		super.aClass2Array3[0] = super.aClass2Array3[1] = super.aClass2Array3[2] = super.aClass2Array3[3] = null;
		return local49;
	}

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "(I)Z")
	public boolean method7095() {
		return this.aClass230_1 != null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!pl;I)V")
	public void method7096(@OriginalArg(0) Class230 arg0) {
		this.aClass230_1 = arg0;
		if (super.aClass4_Sub4_8 != null) {
			super.aClass4_Sub4_8.method4589();
		}
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(B)I")
	@Override
	public int method7073() {
		if (this.aClass230_1.anIntArray627 != null) {
			@Pc(19) Class230 local19 = this.aClass230_1.method5898(Static127.aClass215_1);
			if (local19 != null && local19.anInt7034 != -1) {
				return local19.anInt7034;
			}
		}
		return this.aClass230_1.anInt7034;
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return false;
	}
}
