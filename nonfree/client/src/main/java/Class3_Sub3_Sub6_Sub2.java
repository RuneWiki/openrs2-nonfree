import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class3_Sub3_Sub6_Sub2 extends Class3_Sub3_Sub6 {

	@OriginalMember(owner = "client!uj", name = "Ac", descriptor = "Lclient!at;")
	public Class17 aClass17_1;

	@OriginalMember(owner = "client!uj", name = "wc", descriptor = "I")
	public int anInt6760 = -1;

	@OriginalMember(owner = "client!uj", name = "xc", descriptor = "I")
	public int anInt6761 = -1;

	static {
		new Class231(null, "geschickt werden.", null, null);
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)V")
	@Override
	public void method5798() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5791() {
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "(B)I")
	@Override
	public int method5519() {
		if (this.aClass17_1.anIntArray26 != null) {
			@Pc(13) Class17 local13 = this.aClass17_1.method288(Static71.aClass126_1);
			if (local13 != null && local13.anInt332 != -1) {
				return local13.anInt332;
			}
		}
		return this.aClass17_1.anInt332 == -1 ? super.method5519() : this.aClass17_1.anInt332;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass17_1 == null || !this.method5530(131072, arg0)) {
			return false;
		}
		@Pc(19) Class132 local19 = arg0.method3564();
		@Pc(26) int local26 = super.aClass191_7.method4332();
		local19.method3976(local26);
		local19.method3991(super.anInt6675, super.anInt6673, super.anInt6677);
		for (@Pc(39) int local39 = 0; local39 < super.aClass39Array3.length; local39++) {
			if (super.aClass39Array3[local39] != null && super.aClass39Array3[local39].method4888(arg1, arg2, local19, this.aClass17_1.anInt344 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "(I)Z")
	private boolean method5524() {
		return this.aClass17_1.aBoolean19;
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "(I)I")
	@Override
	public int method5503() {
		return super.anInt6698;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIIIZ)V")
	public void method5525(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		super.aByte93 = (byte) arg0;
		if (super.anInt6713 != -1 && Static244.aClass174_2.method4011(super.anInt6713).anInt1997 == 1) {
			super.anInt6713 = -1;
		}
		@Pc(36) Class250 local36;
		if (super.anInt6712 != -1) {
			local36 = Static93.aClass70_1.method1595(super.anInt6712);
			if (local36.aBoolean474 && local36.anInt6999 != -1 && Static244.aClass174_2.method4011(local36.anInt6999).anInt1997 == 1) {
				super.anInt6712 = -1;
			}
		}
		if (super.anInt6710 != -1) {
			local36 = Static93.aClass70_1.method1595(super.anInt6710);
			if (local36.aBoolean474 && local36.anInt6999 != -1 && Static244.aClass174_2.method4011(local36.anInt6999).anInt1997 == 1) {
				super.anInt6710 = -1;
			}
		}
		if (!arg4) {
			@Pc(111) int local111 = arg3 - super.anIntArray582[0];
			@Pc(119) int local119 = arg1 - super.anIntArray583[0];
			if (local111 >= -8 && local111 <= 8 && local119 >= -8 && local119 <= 8) {
				if (super.anInt6756 < 9) {
					super.anInt6756++;
				}
				for (@Pc(148) int local148 = super.anInt6756; local148 > 0; local148--) {
					super.anIntArray582[local148] = super.anIntArray582[local148 - 1];
					super.anIntArray583[local148] = super.anIntArray583[local148 - 1];
					super.aByteArray86[local148] = super.aByteArray86[local148 - 1];
				}
				super.anIntArray582[0] = arg3;
				super.aByteArray86[0] = 1;
				super.anIntArray583[0] = arg1;
				return;
			}
		}
		super.anIntArray582[0] = arg3;
		super.anInt6755 = 0;
		super.anInt6756 = 0;
		super.anInt6757 = 0;
		super.anIntArray583[0] = arg1;
		super.anInt6675 = (arg2 << 6) + (super.anIntArray582[0] << 7);
		super.anInt6677 = (super.anIntArray583[0] << 7) + (arg2 << 6);
		if (super.aClass48_Sub1_7 != null) {
			super.aClass48_Sub1_7.method1298();
		}
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)I")
	@Override
	protected int method5510() {
		if (this.aClass17_1.anIntArray26 != null) {
			@Pc(19) Class17 local19 = this.aClass17_1.method288(Static71.aClass126_1);
			if (local19 != null && local19.anInt328 != -1) {
				return local19.anInt328;
			}
		}
		return this.aClass17_1.anInt328;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
		if (this.aClass17_1 != null && (super.aBoolean455 || this.method5530(0, arg0))) {
			this.method5514(arg0, super.aClass39Array3, super.aBoolean455);
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)I")
	@Override
	public int method5508() {
		if (this.aClass17_1.anIntArray26 != null) {
			@Pc(13) Class17 local13 = this.aClass17_1.method288(Static71.aClass126_1);
			if (local13 != null && local13.anInt363 != -1) {
				return local13.anInt363;
			}
		}
		return this.aClass17_1.anInt363;
	}

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "(B)Z")
	public boolean method5527() {
		return this.aClass17_1 != null;
	}

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)V")
	public void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray582[0];
		@Pc(15) int local15 = super.anIntArray583[0];
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
		if (super.anInt6713 != -1 && Static244.aClass174_2.method4011(super.anInt6713).anInt1997 == 1) {
			super.anInt6713 = -1;
		}
		if (arg0 == 7) {
			local15++;
			local10--;
		}
		@Pc(86) Class250 local86;
		if (super.anInt6712 != -1) {
			local86 = Static93.aClass70_1.method1595(super.anInt6712);
			if (local86.aBoolean474 && local86.anInt6999 != -1 && Static244.aClass174_2.method4011(local86.anInt6999).anInt1997 == 1) {
				super.anInt6712 = -1;
			}
		}
		if (super.anInt6710 != -1) {
			local86 = Static93.aClass70_1.method1595(super.anInt6710);
			if (local86.aBoolean474 && local86.anInt6999 != -1 && Static244.aClass174_2.method4011(local86.anInt6999).anInt1997 == 1) {
				super.anInt6710 = -1;
			}
		}
		if (super.anInt6756 < 9) {
			super.anInt6756++;
		}
		for (@Pc(147) int local147 = super.anInt6756; local147 > 0; local147--) {
			super.anIntArray582[local147] = super.anIntArray582[local147 - 1];
			super.anIntArray583[local147] = super.anIntArray583[local147 - 1];
			super.aByteArray86[local147] = super.aByteArray86[local147 - 1];
		}
		super.anIntArray582[0] = local10;
		super.anIntArray583[0] = local15;
		super.aByteArray86[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		if (this.aClass17_1 == null || !this.method5530(2048, arg0)) {
			return null;
		}
		@Pc(17) Class132 local17 = arg0.method3564();
		@Pc(22) int local22 = super.aClass191_7.method4332();
		local17.method3976(local22);
		local17.method3991(super.anInt6675, super.anInt6673, super.anInt6677);
		@Pc(37) Class208 local37 = this.method5511();
		@Pc(50) Class17 local50 = this.aClass17_1.anIntArray26 == null ? this.aClass17_1 : this.aClass17_1.method288(Static71.aClass126_1);
		if (Static8.aClass173_Sub1_1.aBoolean307 && local50.aBoolean17 && local37.aBoolean380) {
			@Pc(75) Class83 local75 = super.anInt6713 != -1 && super.anInt6725 == 0 ? Static244.aClass174_2.method4011(super.anInt6713) : null;
			@Pc(93) Class83 local93 = super.anInt6735 == -1 || super.aBoolean453 && local75 != null ? null : Static244.aClass174_2.method4011(super.anInt6735);
			@Pc(145) Class39 local145 = Static394.method5399(this.aClass17_1.aShort8 & 0xFFFF, super.anInt6722, this.aClass17_1.aByte11 & 0xFF, local93 == null ? local75 : local93, this.aClass17_1.aShort7 & 0xFFFF, this.aClass17_1.anInt344, local93 == null ? super.anInt6683 : super.anInt6729, local22, super.anInt6685, super.anInt6744, this.aClass17_1.aByte9 & 0xFF, super.aBoolean452, super.aClass39Array3[0], arg0);
			if (local145 != null) {
				@Pc(150) float local150 = arg0.method3572();
				@Pc(153) float local153 = arg0.method3556();
				arg0.method3483(false);
				arg0.method3581(local150, local153 - 150.0F);
				local145.method4910(local17, null, 0);
				arg0.method3581(local150, local153);
				arg0.method3483(true);
			}
		}
		@Pc(176) Class48_Sub6 local176 = null;
		if (this.method5524()) {
			local176 = Static403.method5489(super.aClass39Array3.length);
		}
		if (super.aClass48_Sub1_7 == null) {
			arg0.method3566(super.aClass39Array3, local17, local176 == null ? null : local176.aClass48_Sub7Array1, 0);
		} else {
			@Pc(214) Class115 local214 = super.aClass48_Sub1_7.method1293();
			arg0.method3501(super.aClass39Array3, local214, local17, local176 == null ? null : local176.aClass48_Sub7Array1, 0);
		}
		this.method5514(arg0, super.aClass39Array3, false);
		if (super.aClass39Array3[2] != null) {
			if (local22 != 0) {
				super.aClass39Array3[2].method4907(local22);
			}
			super.aClass39Array3[2].method4874(-super.aClass6_Sub28_3.anInt5235 + super.anInt6675, -super.aClass6_Sub28_3.anInt5223 + super.anInt6673, -super.aClass6_Sub28_3.anInt5231 + super.anInt6677);
		}
		super.anInt6696 = Static75.anInt1503;
		return local176;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!qq;Lclient!ps;ZZII)V")
	@Override
	public void method5794(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(2) Class3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BLclient!at;)V")
	public void method5529(@OriginalArg(1) Class17 arg0) {
		this.aClass17_1 = arg0;
		if (super.aClass48_Sub1_7 != null) {
			super.aClass48_Sub1_7.method1298();
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILclient!qq;I)Z")
	private boolean method5530(@OriginalArg(0) int arg0, @OriginalArg(1) Class28 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(18) Class208 local18 = this.method5511();
		@Pc(36) Class83 local36 = super.anInt6713 != -1 && super.anInt6725 == 0 ? Static244.aClass174_2.method4011(super.anInt6713) : null;
		@Pc(53) Class83 local53 = super.anInt6735 == -1 || super.aBoolean453 && local36 != null ? null : Static244.aClass174_2.method4011(super.anInt6735);
		@Pc(56) int local56 = local18.anInt5577;
		@Pc(59) int local59 = local18.anInt5579;
		if (local56 != 0 || local59 != 0 || local18.anInt5559 != 0 || local18.anInt5592 != 0) {
			arg0 |= 0x7;
		}
		@Pc(101) boolean local101 = super.aByte96 != 0 && Static125.anInt2225 >= super.anInt6732 && Static125.anInt2225 < super.anInt6743;
		if (local101) {
			arg0 |= 0x80000;
		}
		@Pc(138) Class39 local138 = super.aClass39Array3[0] = this.aClass17_1.method282(arg1, arg0, local53, super.anInt6692, super.anInt6723, Static244.aClass174_2, super.anInt6738, super.aClass38Array3, super.anInt6683, local36, super.anInt6733, Static255.aClass222_1, Static71.aClass126_1, super.anInt6729);
		if (local138 == null) {
			return false;
		}
		super.anInt6698 = local138.method4875();
		this.method5520(local138);
		@Pc(155) int local155 = super.aClass191_7.method4332();
		if (local56 == 0 && local59 == 0) {
			this.method5518(this.method5512() << 7, 0, 0, local155, this.method5512() << 7);
		} else {
			this.method5518(local56, local18.anInt5589, local18.anInt5594, local155, local59);
			if (super.anInt6744 != 0) {
				super.aClass39Array3[0].method4883(super.anInt6744);
			}
			if (super.anInt6685 != 0) {
				super.aClass39Array3[0].method4886(super.anInt6685);
			}
			if (super.anInt6722 != 0) {
				super.aClass39Array3[0].method4874(0, super.anInt6722, 0);
			}
		}
		if (local101) {
			local138.method4869(super.aByte95, super.aByte98, super.aByte97, super.aByte96 & 0xFF);
		}
		@Pc(268) Class250 local268;
		@Pc(283) boolean local283;
		@Pc(285) int local285;
		@Pc(331) Class39 local331;
		if (super.anInt6712 == -1 || super.anInt6717 == -1) {
			super.aClass39Array3[1] = null;
		} else {
			local268 = Static93.aClass70_1.method1595(super.anInt6712);
			local283 = local268.aByte101 == 3 && (local56 != 0 || local59 != 0);
			local285 = local7;
			if (local283) {
				local285 = local7 | 0x7;
			} else {
				if (super.anInt6716 != 0) {
					local285 = local7 | 0x5;
				}
				if (super.anInt6752 != 0) {
					local285 |= 0x2;
				}
			}
			local331 = super.aClass39Array3[1] = local268.method5686(arg1, Static244.aClass174_2, super.anInt6739, super.anInt6724, local285, super.anInt6717);
			if (local331 != null) {
				if (super.anInt6752 != 0) {
					local331.method4874(0, -super.anInt6752 << 0, 0);
				}
				if (super.anInt6716 != 0) {
					local331.method4907(super.anInt6716 * 2048);
				}
				if (local283) {
					if (super.anInt6744 != 0) {
						local331.method4883(super.anInt6744);
					}
					if (super.anInt6685 != 0) {
						local331.method4886(super.anInt6685);
					}
					if (super.anInt6722 != 0) {
						local331.method4874(0, super.anInt6722, 0);
					}
				}
			}
		}
		if (super.anInt6710 == -1 || super.anInt6680 == -1) {
			super.aClass39Array3[3] = null;
		} else {
			local268 = Static93.aClass70_1.method1595(super.anInt6710);
			local283 = local268.aByte101 == 3 && (local56 != 0 || local59 != 0);
			local285 = local7;
			if (local283) {
				local285 = local7 | 0x7;
			} else {
				if (super.anInt6703 != 0) {
					local285 = local7 | 0x5;
				}
				if (super.anInt6709 != 0) {
					local285 |= 0x2;
				}
			}
			local331 = super.aClass39Array3[3] = local268.method5679(Static244.aClass174_2, super.anInt6680, super.anInt6715, super.anInt6705, arg1, local285);
			if (local331 != null) {
				if (super.anInt6709 != 0) {
					local331.method4874(0, -super.anInt6709 << 0, 0);
				}
				if (super.anInt6703 != 0) {
					local331.method4907(super.anInt6703 * 2048);
				}
				if (local283) {
					if (super.anInt6744 != 0) {
						local331.method4883(super.anInt6744);
					}
					if (super.anInt6685 != 0) {
						local331.method4886(super.anInt6685);
					}
					if (super.anInt6722 != 0) {
						local331.method4874(0, super.anInt6722, 0);
					}
				}
			}
		}
		super.aClass39Array3[2] = null;
		if (super.aClass6_Sub28_3 != null) {
			if (super.aClass6_Sub28_3.anInt5229 <= Static125.anInt2225) {
				super.aClass6_Sub28_3 = null;
			} else if (super.aClass6_Sub28_3.anInt5228 <= Static125.anInt2225) {
				@Pc(547) Class39 local547 = super.aClass6_Sub28_3.method4566(arg1, local7 | 0x7);
				if (local547 != null) {
					local547.method4874(-super.anInt6675 + super.aClass6_Sub28_3.anInt5235, super.aClass6_Sub28_3.anInt5223 + -super.anInt6673, super.aClass6_Sub28_3.anInt5231 - super.anInt6677);
					if (local155 != 0) {
						local547.method4907(local155);
					}
					super.aClass39Array3[2] = local547;
				}
			}
		}
		return true;
	}
}
