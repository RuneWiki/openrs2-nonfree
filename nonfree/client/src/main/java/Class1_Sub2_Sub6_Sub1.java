import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub2_Sub6_Sub1 extends Class1_Sub2_Sub6 {

	@OriginalMember(owner = "client!ub", name = "Ac", descriptor = "Lclient!mv;")
	public Class158 aClass158_1;

	@OriginalMember(owner = "client!ub", name = "Ic", descriptor = "I")
	public int anInt6916 = -1;

	@OriginalMember(owner = "client!ub", name = "Oc", descriptor = "I")
	public int anInt6921 = -1;

	static {
		new Class174("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!mv;)V")
	public void method5632(@OriginalArg(1) Class158 arg0) {
		this.aClass158_1 = arg0;
		if (super.aClass23_Sub3_7 != null) {
			super.aClass23_Sub3_7.method2970();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIIIIZ)V")
	public void method5633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		super.aByte101 = (byte) arg3;
		if (super.anInt7612 != -1 && Static444.aClass59_3.method1552(super.anInt7612).anInt7404 == 1) {
			super.anInt7612 = -1;
		}
		@Pc(40) Class52 local40;
		if (super.anInt7596 != -1) {
			local40 = Static387.aClass201_2.method4775(super.anInt7596);
			if (local40.aBoolean92 && local40.anInt1397 != -1 && Static444.aClass59_3.method1552(local40.anInt1397).anInt7404 == 1) {
				super.anInt7596 = -1;
			}
		}
		if (super.anInt7605 != -1) {
			local40 = Static387.aClass201_2.method4775(super.anInt7605);
			if (local40.aBoolean92 && local40.anInt1397 != -1 && Static444.aClass59_3.method1552(local40.anInt1397).anInt7404 == 1) {
				super.anInt7605 = -1;
			}
		}
		if (!arg4) {
			@Pc(97) int local97 = arg1 - super.anIntArray510[0];
			@Pc(104) int local104 = arg2 - super.anIntArray509[0];
			if (local97 >= -8 && local97 <= 8 && local104 >= -8 && local104 <= 8) {
				if (super.anInt7644 < 9) {
					super.anInt7644++;
				}
				for (@Pc(131) int local131 = super.anInt7644; local131 > 0; local131--) {
					super.anIntArray510[local131] = super.anIntArray510[local131 - 1];
					super.anIntArray509[local131] = super.anIntArray509[local131 - 1];
					super.aByteArray122[local131] = super.aByteArray122[local131 - 1];
				}
				super.anIntArray510[0] = arg1;
				super.anIntArray509[0] = arg2;
				super.aByteArray122[0] = 1;
				return;
			}
		}
		super.anInt7641 = 0;
		super.anInt7642 = 0;
		super.anIntArray510[0] = arg1;
		super.anInt7644 = 0;
		super.anIntArray509[0] = arg2;
		super.anInt7560 = (arg0 << 6) + (super.anIntArray510[0] << 7);
		super.anInt7557 = (super.anIntArray509[0] << 7) + (arg0 << 6);
		if (super.aClass23_Sub3_7 != null) {
			super.aClass23_Sub3_7.method2970();
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		if (this.aClass158_1 == null || !this.method5637(131072, arg2)) {
			return false;
		}
		@Pc(19) Class11 local19 = arg2.method5989();
		@Pc(24) int local24 = super.aClass234_7.method5422();
		local19.s(local24);
		local19.J(super.anInt7560, super.anInt7563, super.anInt7557);
		@Pc(43) boolean local43 = false;
		for (@Pc(45) int local45 = 0; local45 < super.aClass108Array3.length; local45++) {
			if (super.aClass108Array3[local45] != null && super.aClass108Array3[local45].method4937(arg1, arg0, local19, this.aClass158_1.anInt4454 == 1)) {
				local43 = true;
				break;
			}
		}
		super.aClass108Array3[0] = super.aClass108Array3[1] = super.aClass108Array3[2] = super.aClass108Array3[3] = null;
		return local43;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)I")
	@Override
	protected int method6194() {
		if (this.aClass158_1.anIntArray294 != null) {
			@Pc(20) Class158 local20 = this.aClass158_1.method3705(Static119.aClass47_1);
			if (local20 != null && local20.anInt4458 != -1) {
				return local20.anInt4458;
			}
		}
		return this.aClass158_1.anInt4458;
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(B)Z")
	private boolean method5635() {
		return this.aClass158_1.aBoolean323;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
		if (this.aClass158_1 != null && (super.aBoolean511 || this.method5637(0, arg0))) {
			this.method6195(arg0, super.aClass108Array3, super.aBoolean511);
			super.aClass108Array3[0] = super.aClass108Array3[1] = super.aClass108Array3[2] = super.aClass108Array3[3] = null;
		}
	}

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)Z")
	public boolean method5636() {
		return this.aClass158_1 != null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!qa;I)Z")
	private boolean method5637(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class142 local11 = this.method6189();
		@Pc(30) Class261 local30 = super.anInt7612 != -1 && super.anInt7624 == 0 ? Static444.aClass59_3.method1552(super.anInt7612) : null;
		@Pc(48) Class261 local48 = super.anInt7586 == -1 || super.aBoolean507 && local30 != null ? null : Static444.aClass59_3.method1552(super.anInt7586);
		@Pc(51) int local51 = local11.anInt4156;
		@Pc(54) int local54 = local11.anInt4167;
		if (local51 != 0 || local54 != 0 || local11.anInt4178 != 0 || local11.anInt4172 != 0) {
			arg0 |= 0x7;
		}
		@Pc(103) boolean local103 = super.aByte102 != 0 && Static172.anInt3107 >= super.anInt7638 && super.anInt7633 > Static172.anInt3107;
		if (local103) {
			arg0 |= 0x80000;
		}
		@Pc(140) Class108 local140 = super.aClass108Array3[0] = this.aClass158_1.method3704(super.anInt7617, super.anInt7581, Static444.aClass59_3, super.anInt7620, local48, arg1, arg0, super.anInt7576, super.anInt7588, local30, super.aClass60Array3, Static119.aClass47_1, super.anInt7569, Static212.aClass238_1);
		if (local140 == null) {
			return false;
		}
		super.anInt7626 = local140.ja();
		this.method6205(local140);
		@Pc(157) int local157 = super.aClass234_7.method5422();
		if (local51 == 0 && local54 == 0) {
			this.method6199(0, local157, this.method6204() << 7, 0, this.method6204() << 7);
		} else {
			this.method6199(local11.anInt4160, local157, local51, local11.anInt4152, local54);
			if (super.anInt7573 != 0) {
				super.aClass108Array3[0].E(super.anInt7573);
			}
			if (super.anInt7600 != 0) {
				super.aClass108Array3[0].S(super.anInt7600);
			}
			if (super.anInt7566 != 0) {
				super.aClass108Array3[0].R(0, super.anInt7566, 0);
			}
		}
		if (local103) {
			local140.method4938(super.aByte104, super.aByte103, super.aByte105, super.aByte102 & 0xFF);
		}
		@Pc(269) Class52 local269;
		@Pc(283) boolean local283;
		@Pc(285) int local285;
		@Pc(328) Class108 local328;
		if (super.anInt7596 == -1 || super.anInt7572 == -1) {
			super.aClass108Array3[1] = null;
		} else {
			local269 = Static387.aClass201_2.method4775(super.anInt7596);
			local283 = local269.aByte12 == 3 && (local51 != 0 || local54 != 0);
			local285 = local7;
			if (local283) {
				local285 = local7 | 0x7;
			} else {
				if (super.anInt7635 != 0) {
					local285 = local7 | 0x5;
				}
				if (super.anInt7631 != 0) {
					local285 |= 0x2;
				}
			}
			local328 = super.aClass108Array3[1] = local269.method1411(arg1, super.anInt7572, super.anInt7604, local285, super.anInt7614, Static444.aClass59_3);
			if (local328 != null) {
				if (super.anInt7631 != 0) {
					local328.R(0, -super.anInt7631 << 0, 0);
				}
				if (super.anInt7635 != 0) {
					local328.l(super.anInt7635 * 2048);
				}
				if (local283) {
					if (super.anInt7573 != 0) {
						local328.E(super.anInt7573);
					}
					if (super.anInt7600 != 0) {
						local328.S(super.anInt7600);
					}
					if (super.anInt7566 != 0) {
						local328.R(0, super.anInt7566, 0);
					}
				}
			}
		}
		if (super.anInt7605 == -1 || super.anInt7629 == -1) {
			super.aClass108Array3[3] = null;
		} else {
			local269 = Static387.aClass201_2.method4775(super.anInt7605);
			local283 = local269.aByte12 == 3 && (local51 != 0 || local54 != 0);
			local285 = local7;
			if (local283) {
				local285 = local7 | 0x7;
			} else {
				if (super.anInt7584 != 0) {
					local285 = local7 | 0x5;
				}
				if (super.anInt7606 != 0) {
					local285 |= 0x2;
				}
			}
			local328 = super.aClass108Array3[3] = local269.method1410(super.anInt7629, local285, super.anInt7593, arg1, super.anInt7592, Static444.aClass59_3);
			if (local328 != null) {
				if (super.anInt7606 != 0) {
					local328.R(0, -super.anInt7606 << 0, 0);
				}
				if (super.anInt7584 != 0) {
					local328.l(super.anInt7584 * 2048);
				}
				if (local283) {
					if (super.anInt7573 != 0) {
						local328.E(super.anInt7573);
					}
					if (super.anInt7600 != 0) {
						local328.S(super.anInt7600);
					}
					if (super.anInt7566 != 0) {
						local328.R(0, super.anInt7566, 0);
					}
				}
			}
		}
		super.aClass108Array3[2] = null;
		if (super.aClass3_Sub47_3 != null) {
			if (Static172.anInt3107 >= super.aClass3_Sub47_3.anInt7701) {
				super.aClass3_Sub47_3 = null;
			} else if (super.aClass3_Sub47_3.anInt7693 <= Static172.anInt3107) {
				@Pc(560) Class108 local560 = super.aClass3_Sub47_3.method6228(arg1, local7 | 0x7);
				if (local560 != null) {
					local560.R(super.aClass3_Sub47_3.anInt7703 - super.anInt7560, super.aClass3_Sub47_3.anInt7698 + -super.anInt7563, super.aClass3_Sub47_3.anInt7707 - super.anInt7557);
					if (local157 != 0) {
						local560.l(local157);
					}
					super.aClass108Array3[2] = local560;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I")
	@Override
	public int method6184() {
		return super.anInt7626;
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return false;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(Z)I")
	@Override
	public int method6206() {
		if (this.aClass158_1.anIntArray294 != null) {
			@Pc(19) Class158 local19 = this.aClass158_1.method3705(Static119.aClass47_1);
			if (local19 != null && local19.anInt4443 != -1) {
				return local19.anInt4443;
			}
		}
		return this.aClass158_1.anInt4443;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIB)V")
	public void method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray510[0];
		@Pc(15) int local15 = super.anIntArray509[0];
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
		if (super.anInt7612 != -1 && Static444.aClass59_3.method1552(super.anInt7612).anInt7404 == 1) {
			super.anInt7612 = -1;
		}
		@Pc(91) Class52 local91;
		if (super.anInt7596 != -1) {
			local91 = Static387.aClass201_2.method4775(super.anInt7596);
			if (local91.aBoolean92 && local91.anInt1397 != -1 && Static444.aClass59_3.method1552(local91.anInt1397).anInt7404 == 1) {
				super.anInt7596 = -1;
			}
		}
		if (super.anInt7605 != -1) {
			local91 = Static387.aClass201_2.method4775(super.anInt7605);
			if (local91.aBoolean92 && local91.anInt1397 != -1 && Static444.aClass59_3.method1552(local91.anInt1397).anInt7404 == 1) {
				super.anInt7605 = -1;
			}
		}
		if (super.anInt7644 < 9) {
			super.anInt7644++;
		}
		for (@Pc(161) int local161 = super.anInt7644; local161 > 0; local161--) {
			super.anIntArray510[local161] = super.anIntArray510[local161 - 1];
			super.anIntArray509[local161] = super.anIntArray509[local161 - 1];
			super.aByteArray122[local161] = super.aByteArray122[local161 - 1];
		}
		super.anIntArray510[0] = local10;
		super.aByteArray122[0] = (byte) arg1;
		super.anIntArray509[0] = local15;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I")
	@Override
	public int method6193() {
		if (this.aClass158_1.anIntArray294 != null) {
			@Pc(19) Class158 local19 = this.aClass158_1.method3705(Static119.aClass47_1);
			if (local19 != null && local19.anInt4470 != -1) {
				return local19.anInt4470;
			}
		}
		return this.aClass158_1.anInt4470 == -1 ? super.method6193() : this.aClass158_1.anInt4470;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		if (this.aClass158_1 == null || !this.method5637(2048, arg0)) {
			return null;
		}
		@Pc(17) Class11 local17 = arg0.method5989();
		@Pc(22) int local22 = super.aClass234_7.method5422();
		local17.s(local22);
		local17.J(super.anInt7560, super.anInt7563, super.anInt7557);
		@Pc(37) Class142 local37 = this.method6189();
		@Pc(50) Class158 local50 = this.aClass158_1.anIntArray294 == null ? this.aClass158_1 : this.aClass158_1.method3705(Static119.aClass47_1);
		if (Static39.aClass79_Sub1_1.aBoolean151 && local50.aBoolean326 && local37.aBoolean300) {
			@Pc(74) Class261 local74 = super.anInt7612 != -1 && super.anInt7624 == 0 ? Static444.aClass59_3.method1552(super.anInt7612) : null;
			@Pc(93) Class261 local93 = super.anInt7586 == -1 || super.aBoolean507 && local74 != null ? null : Static444.aClass59_3.method1552(super.anInt7586);
			@Pc(95) int local95 = 0;
			if (super.anInt7628 != 0) {
				local95 = this.method6191();
			}
			@Pc(156) Class108 local156 = Static21.method6255(local22, local93 == null ? super.anInt7588 : super.anInt7569, this.aClass158_1.aShort58 & 0xFFFF, super.anInt7566, this.aClass158_1.aShort59 & 0xFFFF, arg0, local93 == null ? local74 : local93, super.anInt7600, this.aClass158_1.aByte55 & 0xFF, this.aClass158_1.aByte58 & 0xFF, super.anInt7573, local95, this.aClass158_1.anInt4454, super.aClass108Array3[0]);
			if (local156 != null) {
				@Pc(161) float local161 = arg0.I();
				@Pc(164) float local164 = arg0.s();
				arg0.method6011(false);
				arg0.PA(local161, local164 - 150.0F);
				local156.method4931(local17, null, 0);
				arg0.PA(local161, local164);
				arg0.method6011(true);
			}
		}
		@Pc(187) Class23_Sub5 local187 = null;
		if (this.method5635()) {
			local187 = Static217.method1031(super.aClass108Array3.length);
		}
		if (super.aClass23_Sub3_7 == null) {
			arg0.method6015(super.aClass108Array3, local17, local187 == null ? null : local187.aClass23_Sub6Array1, 0);
		} else {
			@Pc(218) Class77 local218 = super.aClass23_Sub3_7.method2974();
			arg0.method5950(super.aClass108Array3, local218, local17, local187 == null ? null : local187.aClass23_Sub6Array1, 0);
		}
		this.method6195(arg0, super.aClass108Array3, false);
		if (super.aClass108Array3[2] != null) {
			if (local22 != 0) {
				super.aClass108Array3[2].l(local22);
			}
			super.aClass108Array3[2].R(super.anInt7560 - super.aClass3_Sub47_3.anInt7703, super.anInt7563 + -super.aClass3_Sub47_3.anInt7698, super.anInt7557 - super.aClass3_Sub47_3.anInt7707);
		}
		super.anInt7575 = Static463.anInt7797;
		super.aClass108Array3[0] = super.aClass108Array3[1] = super.aClass108Array3[2] = super.aClass108Array3[3] = null;
		return local187;
	}
}
