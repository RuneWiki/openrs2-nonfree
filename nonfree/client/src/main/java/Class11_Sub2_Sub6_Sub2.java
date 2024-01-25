import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class11_Sub2_Sub6_Sub2 extends Class11_Sub2_Sub6 {

	@OriginalMember(owner = "client!we", name = "vc", descriptor = "Lclient!un;")
	public Class208 aClass208_1;

	@OriginalMember(owner = "client!we", name = "yc", descriptor = "I")
	public int anInt6812 = -1;

	@OriginalMember(owner = "client!we", name = "zc", descriptor = "I")
	public int anInt6813 = -1;

	static {
		new Class106("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!we", name = "i", descriptor = "(B)I")
	@Override
	protected int method5896() {
		if (this.aClass208_1.anIntArray480 != null) {
			@Pc(12) Class208 local12 = this.aClass208_1.method5539();
			if (local12 != null && local12.anInt6168 != -1) {
				return local12.anInt6168;
			}
		}
		return this.aClass208_1.anInt6168;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!fp;I)Z")
	private boolean method5899(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class67 local11 = this.method5898();
		@Pc(25) Class199 local25 = super.anInt6772 != -1 && super.anInt6761 == 0 ? Static161.method3066(super.anInt6772) : null;
		@Pc(44) Class199 local44 = super.anInt6733 == -1 || super.aBoolean499 && local25 != null ? null : Static161.method3066(super.anInt6733);
		@Pc(47) int local47 = local11.anInt2121;
		@Pc(50) int local50 = local11.anInt2118;
		if (local47 != 0 || local50 != 0 || local11.anInt2131 != 0 || local11.anInt2125 != 0) {
			arg0 |= 0x7;
		}
		@Pc(98) Class3 local98 = super.aClass3Array3[0] = this.aClass208_1.method5543(local44, super.anInt6743, super.aClass163Array3, arg0, arg1, super.anInt6768, super.anInt6776, local25, super.anInt6747, super.anInt6788, super.anInt6794);
		if (local98 == null) {
			return false;
		}
		super.anInt6760 = local98.method1245();
		this.method5897(local98);
		@Pc(115) int local115 = super.aClass223_7.method6057();
		super.anInt6763 = 0;
		super.anInt6756 = 0;
		super.anInt6749 = 0;
		if (local47 == 0 && local50 == 0) {
			this.method5888(this.method5894() << 7, this.method5894() << 7, local115);
		} else {
			this.method5888(local47, local50, local115);
			if (super.anInt6749 != 0) {
				super.aClass3Array3[0].method1239(super.anInt6749);
			}
			if (super.anInt6756 != 0) {
				super.aClass3Array3[0].method1253(super.anInt6756);
			}
			if (super.anInt6763 != 0) {
				super.aClass3Array3[0].method1241(0, super.anInt6763, 0);
			}
		}
		super.aClass3Array3[1] = null;
		if (super.anInt6795 != -1 && super.anInt6778 != -1) {
			@Pc(210) Class109 local210 = Static345.method5752(super.anInt6795);
			@Pc(229) Class3 local229 = local210.method2993(local7 | (local210.aBoolean220 ? 7 : 2), super.anInt6782, super.anInt6748, super.anInt6778, arg1);
			if (local229 != null) {
				local229.method1241(0, -super.anInt6734, 0);
				if (local210.aBoolean220 && (local47 != 0 || local50 != 0)) {
					if (super.anInt6749 != 0) {
						local229.method1239(super.anInt6749);
					}
					if (super.anInt6756 != 0) {
						local229.method1253(super.anInt6756);
					}
					if (super.anInt6763 != 0) {
						local229.method1241(0, super.anInt6763, 0);
					}
				}
				super.aClass3Array3[1] = local229;
			}
		}
		super.aClass3Array3[2] = null;
		if (super.aClass1_Sub41_3 != null) {
			if (Static51.anInt1301 >= super.aClass1_Sub41_3.anInt6214) {
				super.aClass1_Sub41_3 = null;
			} else if (super.aClass1_Sub41_3.anInt6226 <= Static51.anInt1301) {
				@Pc(307) Class3 local307 = super.aClass1_Sub41_3.method5565(local7 | 0x7, arg1);
				if (local307 != null) {
					local307.method1241(-super.anInt6729 + super.aClass1_Sub41_3.anInt6230, -super.anInt6727 + super.aClass1_Sub41_3.anInt6211, super.aClass1_Sub41_3.anInt6210 - super.anInt6726);
					if (local115 != 0) {
						local307.method1249(local115);
					}
					super.aClass3Array3[2] = local307;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	public void method5900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = super.anIntArray505[0];
		@Pc(15) int local15 = super.anIntArray504[0];
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
			local15++;
			local10--;
		}
		if (super.anInt6772 != -1 && Static161.method3066(super.anInt6772).anInt6016 == 1) {
			super.anInt6772 = -1;
		}
		if (super.anInt6795 != -1) {
			@Pc(93) Class109 local93 = Static345.method5752(super.anInt6795);
			if (local93.aBoolean221 && local93.anInt3267 != -1 && Static161.method3066(local93.anInt3267).anInt6016 == 1) {
				super.anInt6795 = -1;
			}
		}
		if (super.anInt6798 < 9) {
			super.anInt6798++;
		}
		for (@Pc(126) int local126 = super.anInt6798; local126 > 0; local126--) {
			super.anIntArray505[local126] = super.anIntArray505[local126 - 1];
			super.anIntArray504[local126] = super.anIntArray504[local126 - 1];
			super.aByteArray97[local126] = super.aByteArray97[local126 - 1];
		}
		super.anIntArray505[0] = local10;
		super.anIntArray504[0] = local15;
		super.aByteArray97[0] = (byte) arg1;
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)Z")
	public boolean method5901() {
		return this.aClass208_1 != null;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(Z)Z")
	private boolean method5902() {
		return this.aClass208_1.aBoolean458;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(B)I")
	@Override
	public int method5877() {
		return super.anInt6760;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
		if (this.aClass208_1 != null && (super.aBoolean503 || this.method5899(0, arg0))) {
			this.method5889(super.aClass3Array3, super.aBoolean503, arg0);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass208_1 == null || !this.method5899(65536, arg0)) {
			return false;
		}
		@Pc(29) Class129 local29 = arg0.method4634();
		@Pc(36) int local36 = super.aClass223_7.method6057();
		local29.method5787(local36);
		local29.method5776(super.anInt6729, super.anInt6727, super.anInt6726);
		for (@Pc(49) int local49 = 0; super.aClass3Array3.length > local49; local49++) {
			if (super.aClass3Array3[local49] != null && super.aClass3Array3[local49].method1283(arg2, arg1, local29, this.aClass208_1.anInt6162 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!we", name = "h", descriptor = "(B)I")
	@Override
	public int method5887() {
		if (this.aClass208_1.anIntArray480 != null) {
			@Pc(12) Class208 local12 = this.aClass208_1.method5539();
			if (local12 != null && local12.anInt6185 != -1) {
				return local12.anInt6185;
			}
		}
		return this.aClass208_1.anInt6185 == -1 ? super.method5887() : this.aClass208_1.anInt6185;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		if (this.aClass208_1 == null || !this.method5899(1024, arg0)) {
			return null;
		}
		@Pc(17) Class129 local17 = arg0.method4634();
		@Pc(22) int local22 = super.aClass223_7.method6057();
		local17.method5787(local22);
		local17.method5776(super.anInt6729, super.anInt6727, super.anInt6726);
		@Pc(37) Class67 local37 = this.method5898();
		@Pc(49) Class208 local49 = this.aClass208_1.anIntArray480 == null ? this.aClass208_1 : this.aClass208_1.method5539();
		if (Static61.aBoolean108 && local49.aBoolean461 && local37.aBoolean148) {
			@Pc(75) Class199 local75 = super.anInt6772 != -1 && super.anInt6761 == 0 ? Static161.method3066(super.anInt6772) : null;
			@Pc(91) Class199 local91 = super.anInt6733 == -1 || super.aBoolean499 && local75 != null ? null : Static161.method3066(super.anInt6733);
			@Pc(143) Class3 local143 = Static28.method696(this.aClass208_1.aShort81 & 0xFFFF, this.aClass208_1.aByte67 & 0xFF, local22, this.aClass208_1.anInt6162, super.anInt6756, super.anInt6749, arg0, super.anInt6763, local91 == null ? local75 : local91, super.aBoolean501, super.aClass3Array3[0], this.aClass208_1.aShort80 & 0xFFFF, local91 == null ? super.anInt6743 : super.anInt6747, this.aClass208_1.aByte65 & 0xFF);
			if (local143 != null) {
				@Pc(148) float local148 = arg0.method4621();
				@Pc(151) float local151 = arg0.method4638();
				arg0.method4635(false);
				arg0.method4570(local148, local151 - 150.0F);
				local143.method1242(local17, null, 0);
				arg0.method4570(local148, local151);
				arg0.method4635(true);
			}
		}
		@Pc(174) Class32_Sub7 local174 = null;
		if (this.method5902()) {
			local174 = Static67.method1550(super.aClass3Array3.length);
		}
		if (super.aClass32_Sub2_7 == null) {
			arg0.method4636(super.aClass3Array3, local17, local174 == null ? null : local174.aClass32_Sub4Array1, 0);
		} else {
			@Pc(205) Class26 local205 = super.aClass32_Sub2_7.method1403();
			arg0.method4597(super.aClass3Array3, local205, local17, local174 == null ? null : local174.aClass32_Sub4Array1, 0);
		}
		this.method5889(super.aClass3Array3, false, arg0);
		if (super.aClass3Array3[2] != null) {
			if (local22 != 0) {
				super.aClass3Array3[2].method1249(local22);
			}
			super.aClass3Array3[2].method1241(super.anInt6729 - super.aClass1_Sub41_3.anInt6230, super.anInt6727 - super.aClass1_Sub41_3.anInt6211, -super.aClass1_Sub41_3.anInt6210 + super.anInt6726);
		}
		return local174;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!un;I)V")
	public void method5906(@OriginalArg(0) Class208 arg0) {
		this.aClass208_1 = arg0;
		if (super.aClass32_Sub2_7 != null) {
			super.aClass32_Sub2_7.method1406();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIBIZI)V")
	public void method5907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		super.aByte79 = (byte) arg0;
		if (super.anInt6772 != -1 && Static161.method3066(super.anInt6772).anInt6016 == 1) {
			super.anInt6772 = -1;
		}
		if (super.anInt6795 != -1) {
			@Pc(36) Class109 local36 = Static345.method5752(super.anInt6795);
			if (local36.aBoolean221 && local36.anInt3267 != -1 && Static161.method3066(local36.anInt3267).anInt6016 == 1) {
				super.anInt6795 = -1;
			}
		}
		if (!arg3) {
			@Pc(67) int local67 = arg2 - super.anIntArray505[0];
			@Pc(74) int local74 = arg1 - super.anIntArray504[0];
			if (local67 >= -8 && local67 <= 8 && local74 >= -8 && local74 <= 8) {
				if (super.anInt6798 < 9) {
					super.anInt6798++;
				}
				for (@Pc(105) int local105 = super.anInt6798; local105 > 0; local105--) {
					super.anIntArray505[local105] = super.anIntArray505[local105 - 1];
					super.anIntArray504[local105] = super.anIntArray504[local105 - 1];
					super.aByteArray97[local105] = super.aByteArray97[local105 - 1];
				}
				super.anIntArray505[0] = arg2;
				super.aByteArray97[0] = 1;
				super.anIntArray504[0] = arg1;
				return;
			}
		}
		super.anInt6796 = 0;
		super.anInt6797 = 0;
		super.anIntArray505[0] = arg2;
		super.anInt6798 = 0;
		super.anIntArray504[0] = arg1;
		super.anInt6729 = super.anIntArray505[0] * 128 + arg4 * 64;
		super.anInt6726 = arg4 * 64 + super.anIntArray504[0] * 128;
		if (super.aClass32_Sub2_7 != null) {
			super.aClass32_Sub2_7.method1406();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I")
	@Override
	public int method5886() {
		if (this.aClass208_1.anIntArray480 != null) {
			@Pc(22) Class208 local22 = this.aClass208_1.method5539();
			if (local22 != null && local22.anInt6170 != -1) {
				return local22.anInt6170;
			}
		}
		return this.aClass208_1.anInt6170;
	}
}
