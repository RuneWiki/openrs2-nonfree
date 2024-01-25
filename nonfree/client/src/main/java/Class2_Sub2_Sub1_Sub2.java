import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class2_Sub2_Sub1_Sub2 extends Class2_Sub2_Sub1 {

	@OriginalMember(owner = "client!ur", name = "Lc", descriptor = "Lclient!ce;")
	public Class34 aClass34_1;

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)I")
	@Override
	protected int method5434() {
		if (this.aClass34_1.anIntArray108 != null) {
			@Pc(12) Class34 local12 = this.aClass34_1.method748();
			if (local12 != null && local12.anInt869 != -1) {
				return local12.anInt869;
			}
		}
		return this.aClass34_1.anInt869;
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)I")
	@Override
	public int method5416() {
		return super.anInt6522;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
		if (this.aClass34_1 != null && (super.aBoolean570 || this.method5443(0, arg0))) {
			this.method5431(super.aBoolean570, arg0, super.aClass5Array3);
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(I)V")
	@Override
	public void method5408() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "(I)Z")
	public boolean method5441() {
		return this.aClass34_1 != null;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		if (this.aClass34_1 == null || !this.method5443(65536, arg2)) {
			return false;
		}
		@Pc(19) Class23 local19 = arg2.method4466();
		@Pc(26) int local26 = super.aClass108_7.method2976();
		local19.method5099(local26);
		local19.method5091(super.anInt6465, super.anInt6464, super.anInt6466);
		for (@Pc(39) int local39 = 0; super.aClass5Array3.length > local39; local39++) {
			if (super.aClass5Array3[local39] != null) {
				return super.aClass5Array3[local39].method3995(arg0, arg1, local19, this.aClass34_1.anInt842 == 1);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "(I)Z")
	private boolean method5442() {
		return this.aClass34_1.aBoolean56;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZIIILclient!ai;ILclient!vm;)V")
	@Override
	public void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILclient!vm;B)Z")
	private boolean method5443(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class10 local9 = this.method5428();
		@Pc(24) Class116 local24 = super.anInt6517 != -1 && super.anInt6490 == 0 ? Static340.method5560(super.anInt6517) : null;
		@Pc(41) Class116 local41 = super.anInt6540 == -1 || super.aBoolean569 && local24 != null ? null : Static340.method5560(super.anInt6540);
		@Pc(44) int local44 = local9.anInt237;
		@Pc(47) int local47 = local9.anInt235;
		if (local44 != 0 || local47 != 0 || local9.anInt206 != 0 || local9.anInt220 != 0) {
			arg0 |= 0x7;
		}
		@Pc(98) Class5 local98 = super.aClass5Array3[0] = this.aClass34_1.method745(super.anInt6518, arg0, arg1, local24, super.anInt6504, super.anInt6485, super.anInt6493, super.anInt6487, super.anInt6534, super.aClass186Array3, local41);
		if (local98 == null) {
			return false;
		}
		super.anInt6522 = local98.method4020();
		this.method5423(local98);
		@Pc(115) int local115 = super.aClass108_7.method2976();
		super.anInt6494 = 0;
		super.lb = 0;
		super.anInt6510 = 0;
		if (local44 == 0 && local47 == 0) {
			this.method5432(this.method5425() << 7, local115, this.method5425() << 7);
		} else {
			this.method5432(local44, local115, local47);
			if (super.anInt6494 != 0) {
				super.aClass5Array3[0].method4003(super.anInt6494);
			}
			if (super.lb != 0) {
				super.aClass5Array3[0].method3987(super.lb);
			}
			if (super.anInt6510 != 0) {
				super.aClass5Array3[0].method4026(0, super.anInt6510, 0);
			}
		}
		super.aClass5Array3[1] = null;
		if (super.anInt6482 != -1 && super.anInt6492 != -1) {
			@Pc(212) Class156 local212 = Static244.method4224(super.anInt6482);
			@Pc(231) Class5 local231 = local212.method4236(super.anInt6525, super.anInt6492, arg1, super.anInt6512, (local212.aBoolean431 ? 7 : 2) | local5);
			if (local231 != null) {
				local231.method4026(0, -super.anInt6531, 0);
				if (local212.aBoolean431 && (local44 != 0 || local47 != 0)) {
					if (super.anInt6494 != 0) {
						local231.method4003(super.anInt6494);
					}
					if (super.lb != 0) {
						local231.method3987(super.lb);
					}
					if (super.anInt6510 != 0) {
						local231.method4026(0, super.anInt6510, 0);
					}
				}
				super.aClass5Array3[1] = local231;
			}
		}
		super.aClass5Array3[2] = null;
		if (super.anInterface5_3 != null) {
			if (super.anInt6554 <= Static342.anInt6706) {
				super.anInterface5_3 = null;
			}
			if (super.anInt6546 <= Static342.anInt6706 && super.anInt6554 > Static342.anInt6706) {
				@Pc(321) Class5 local321 = super.anInterface5_3.method4727(arg1, local5 | 0x7);
				if (local321 != null) {
					local321.method4026(-super.anInt6465 + super.anInt6549, super.anInt6544 + -super.anInt6464, -super.anInt6466 + super.anInt6555);
					if (local115 != 0) {
						local321.method3997(local115);
					}
					super.aClass5Array3[2] = local321;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		if (this.aClass34_1 == null || !this.method5443(1024, arg0)) {
			return null;
		}
		@Pc(17) Class23 local17 = arg0.method4466();
		@Pc(22) int local22 = super.aClass108_7.method2976();
		local17.method5099(local22);
		local17.method5089(super.anInt6465, super.anInt6464, super.anInt6466);
		@Pc(37) Class10 local37 = this.method5428();
		@Pc(49) Class34 local49 = this.aClass34_1.anIntArray108 == null ? this.aClass34_1 : this.aClass34_1.method748();
		if (Static128.aBoolean242 && local49.aBoolean54 && local37.aBoolean16) {
			@Pc(72) Class116 local72 = super.anInt6517 != -1 && super.anInt6490 == 0 ? Static340.method5560(super.anInt6517) : null;
			@Pc(89) Class116 local89 = super.anInt6540 == -1 || super.aBoolean569 && local72 != null ? null : Static340.method5560(super.anInt6540);
			@Pc(141) Class5 local141 = Static224.method3840(local89 == null ? local72 : local89, this.aClass34_1.aByte16 & 0xFF, this.aClass34_1.aShort23 & 0xFFFF, local89 == null ? super.anInt6487 : super.anInt6485, super.anInt6510, super.lb, this.aClass34_1.aByte17 & 0xFF, this.aClass34_1.aShort22 & 0xFFFF, arg0, this.aClass34_1.anInt842, local22, super.aClass5Array3[0], super.anInt6494, super.aBoolean567);
			if (local141 != null) {
				@Pc(146) float local146 = arg0.method4490();
				@Pc(149) float local149 = arg0.method4473();
				arg0.method4439(false);
				arg0.method4539(local146, local149 - 150.0F);
				local141.method4029(local17, null, 0);
				arg0.method4539(local146, local149);
				arg0.method4439(true);
			}
		}
		@Pc(172) Class17_Sub2 local172 = null;
		if (this.method5442()) {
			local172 = Static238.method4100(super.aClass5Array3.length);
		}
		if (super.aClass17_Sub3_7 == null) {
			arg0.method4455(super.aClass5Array3, local17, local172 == null ? null : local172.aClass17_Sub6Array1, 0);
		} else {
			@Pc(203) Class88 local203 = super.aClass17_Sub3_7.method1067();
			arg0.method4474(super.aClass5Array3, local203, local17, local172 == null ? null : local172.aClass17_Sub6Array1, 0);
		}
		this.method5431(false, arg0, super.aClass5Array3);
		if (super.aClass5Array3[2] != null) {
			if (local22 != 0) {
				super.aClass5Array3[2].method3997(local22);
			}
			super.aClass5Array3[2].method4026(-super.anInt6549 + super.anInt6465, super.anInt6464 - super.anInt6544, -super.anInt6555 + super.anInt6466);
		}
		return local172;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5411() {
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "(B)I")
	@Override
	public int method5436() {
		if (this.aClass34_1.anIntArray108 != null) {
			@Pc(21) Class34 local21 = this.aClass34_1.method748();
			if (local21 != null && local21.anInt850 != -1) {
				return local21.anInt850;
			}
		}
		return this.aClass34_1.anInt850;
	}

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "(I)I")
	@Override
	public int method5430() {
		if (this.aClass34_1.anIntArray108 != null) {
			@Pc(14) Class34 local14 = this.aClass34_1.method748();
			if (local14 != null && local14.anInt882 != -1) {
				return local14.anInt882;
			}
		}
		return this.aClass34_1.anInt882 == -1 ? super.method5430() : this.aClass34_1.anInt882;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!ce;I)V")
	public void method5445(@OriginalArg(0) Class34 arg0) {
		this.aClass34_1 = arg0;
		if (super.aClass17_Sub3_7 != null) {
			super.aClass17_Sub3_7.method1062();
		}
	}
}
