import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class5_Sub3_Sub3_Sub2 extends Class5_Sub3_Sub3 {

	@OriginalMember(owner = "client!ql", name = "Uc", descriptor = "Lclient!lp;")
	public Class122 aClass122_1;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILclient!aa;)Z")
	@Override
	public boolean method5684(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2 arg2) {
		if (this.aClass122_1 == null || !this.method4550(65536, arg2)) {
			return false;
		}
		@Pc(19) Class21 local19 = arg2.method3284();
		@Pc(24) int local24 = super.aClass11_7.method322();
		local19.method2809(local24);
		local19.method2810(super.anInt5050, super.anInt5046, super.anInt5047);
		for (@Pc(37) int local37 = 0; local37 < super.aClass78Array3.length; local37++) {
			if (super.aClass78Array3[local37] != null && super.aClass78Array3[local37].method4381(arg0, arg1, local19, this.aClass122_1.anInt3819 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!lp;I)V")
	public void method4549(@OriginalArg(0) Class122 arg0) {
		this.aClass122_1 = arg0;
		if (super.aClass15_Sub5_6 != null) {
			super.aClass15_Sub5_6.method2866();
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IILclient!aa;)Z")
	private boolean method4550(@OriginalArg(0) int arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(9) Class45 local9 = this.method4533();
		@Pc(27) Class121 local27 = super.anInt4977 != -1 && super.anInt4936 == 0 ? Static133.method2520(super.anInt4977) : null;
		@Pc(44) Class121 local44 = super.anInt4975 == -1 || super.aBoolean412 && local27 != null ? null : Static133.method2520(super.anInt4975);
		@Pc(47) int local47 = local9.anInt1487;
		@Pc(50) int local50 = local9.anInt1497;
		if (local47 != 0 || local50 != 0 || local9.anInt1483 != 0 || local9.anInt1503 != 0) {
			arg0 |= 0x7;
		}
		@Pc(95) Class78 local95 = super.aClass78Array3[0] = this.aClass122_1.method3572(super.anInt4965, super.anInt4950, local27, super.aClass59Array3, arg1, super.anInt4957, super.anInt4973, arg0, super.anInt4941, super.anInt4954, local44);
		if (local95 == null) {
			return false;
		}
		super.anInt4956 = local95.method4388();
		this.method4539(local95);
		@Pc(112) int local112 = super.aClass11_7.method322();
		super.anInt4938 = 0;
		super.anInt4948 = 0;
		super.anInt4946 = 0;
		if (local47 == 0 && local50 == 0) {
			this.method4543(this.method4541() << 7, local112, this.method4541() << 7);
		} else {
			this.method4543(local47, local112, local50);
			if (super.anInt4938 != 0) {
				super.aClass78Array3[0].method4369(super.anInt4938);
			}
			if (super.anInt4946 != 0) {
				super.aClass78Array3[0].method4389(super.anInt4946);
			}
			if (super.anInt4948 != 0) {
				super.aClass78Array3[0].method4399(0, super.anInt4948, 0);
			}
		}
		super.aClass78Array3[1] = null;
		if (super.anInt4934 != -1 && super.anInt4979 != -1) {
			@Pc(213) Class125 local213 = Static183.method3571(super.anInt4934);
			@Pc(232) Class78 local232 = local213.method3646(super.anInt4979, super.anInt4976, super.anInt4972, arg1, local5 | (local213.aBoolean334 ? 7 : 2));
			if (local232 != null) {
				local232.method4399(0, -super.anInt4958, 0);
				if (local213.aBoolean334 && (local47 != 0 || local50 != 0)) {
					if (super.anInt4938 != 0) {
						local232.method4369(super.anInt4938);
					}
					if (super.anInt4946 != 0) {
						local232.method4389(super.anInt4946);
					}
					if (super.anInt4948 != 0) {
						local232.method4399(0, super.anInt4948, 0);
					}
				}
				super.aClass78Array3[1] = local232;
			}
		}
		super.aClass78Array3[2] = null;
		if (super.anInterface8_3 != null) {
			if (Static215.anInt4246 >= super.anInt4983) {
				super.anInterface8_3 = null;
			}
			if (Static215.anInt4246 >= super.anInt4982 && Static215.anInt4246 < super.anInt4983) {
				@Pc(324) Class78 local324 = super.anInterface8_3.method5695(arg1, local5 | 0x7);
				if (local324 != null) {
					local324.method4399(super.anInt4987 - super.anInt5050, super.anInt4992 + -super.anInt5046, super.anInt4988 - super.anInt5047);
					if (local112 != 0) {
						local324.method4372(local112);
					}
					super.aClass78Array3[2] = local324;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)I")
	@Override
	public int method4586() {
		return super.anInt4956;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!aa;I)Lclient!cn;")
	@Override
	public Class15_Sub3 method5680(@OriginalArg(0) Class2 arg0) {
		if (this.aClass122_1 == null || !this.method4550(1024, arg0)) {
			return null;
		}
		@Pc(17) Class21 local17 = arg0.method3284();
		@Pc(22) int local22 = super.aClass11_7.method322();
		local17.method2809(local22);
		local17.method2810(super.anInt5050, super.anInt5046, super.anInt5047);
		@Pc(43) Class45 local43 = this.method4533();
		@Pc(55) Class122 local55 = this.aClass122_1.anIntArray451 == null ? this.aClass122_1 : this.aClass122_1.method3573();
		if (Static264.aBoolean464 && local55.aBoolean323 && local43.aBoolean130) {
			@Pc(81) Class121 local81 = super.anInt4977 != -1 && super.anInt4936 == 0 ? Static133.method2520(super.anInt4977) : null;
			@Pc(98) Class121 local98 = super.anInt4975 == -1 || super.aBoolean412 && local81 != null ? null : Static133.method2520(super.anInt4975);
			@Pc(150) Class78 local150 = Static56.method1210(super.anInt4948, this.aClass122_1.aByte37 & 0xFF, local22, this.aClass122_1.aShort38 & 0xFFFF, this.aClass122_1.anInt3819, local98 == null ? local81 : local98, super.anInt4938, local98 == null ? super.anInt4950 : super.anInt4941, super.aClass78Array3[0], super.anInt4946, this.aClass122_1.aByte34 & 0xFF, super.aBoolean414, this.aClass122_1.aShort37 & 0xFFFF, arg0);
			if (local150 != null) {
				@Pc(155) float local155 = arg0.method3317();
				@Pc(158) float local158 = arg0.method3282();
				arg0.method3337(false);
				arg0.method3320(local155, local158 - 150.0F);
				local150.method4379(local17, null, 0);
				arg0.method3320(local155, local158);
				arg0.method3337(true);
			}
		}
		@Pc(181) Class15_Sub3 local181 = null;
		if (this.method4555()) {
			local181 = Static186.method3613(super.aClass78Array3.length);
		}
		if (super.aClass15_Sub5_6 == null) {
			arg0.method3285(super.aClass78Array3, local17, local181 == null ? null : local181.aClass15_Sub2Array1, 0);
		} else {
			@Pc(212) Class162 local212 = super.aClass15_Sub5_6.method2868();
			arg0.method3318(super.aClass78Array3, local212, local17, local181 == null ? null : local181.aClass15_Sub2Array1, 0);
		}
		this.method4547(arg0, false, super.aClass78Array3);
		if (super.aClass78Array3[2] != null) {
			if (local22 != 0) {
				super.aClass78Array3[2].method4372(local22);
			}
			super.aClass78Array3[2].method4399(super.anInt5050 - super.anInt4987, -super.anInt4992 + super.anInt5046, super.anInt5047 - super.anInt4988);
		}
		return local181;
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)I")
	@Override
	public int method4538() {
		if (this.aClass122_1.anIntArray451 != null) {
			@Pc(12) Class122 local12 = this.aClass122_1.method3573();
			if (local12 != null && local12.anInt3801 != -1) {
				return local12.anInt3801;
			}
		}
		return this.aClass122_1.anInt3801 == -1 ? super.method4538() : this.aClass122_1.anInt3801;
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)I")
	@Override
	public int method4542() {
		if (this.aClass122_1.anIntArray451 != null) {
			@Pc(19) Class122 local19 = this.aClass122_1.method3573();
			if (local19 != null && local19.anInt3813 != -1) {
				return local19.anInt3813;
			}
		}
		return this.aClass122_1.anInt3813;
	}

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "(I)Z")
	public boolean method4552() {
		return this.aClass122_1 != null;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(Z)I")
	@Override
	protected int method4544() {
		if (this.aClass122_1.anIntArray451 != null) {
			@Pc(12) Class122 local12 = this.aClass122_1.method3573();
			if (local12 != null && local12.anInt3806 != -1) {
				return local12.anInt3806;
			}
		}
		return this.aClass122_1.anInt3806;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZIILclient!aa;ILclient!qh;)V")
	@Override
	public void method5677(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(B)V")
	@Override
	public void method5678() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5681() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(Z)Z")
	private boolean method4555() {
		return this.aClass122_1.aBoolean322;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!aa;Z)V")
	@Override
	public void method5686(@OriginalArg(0) Class2 arg0) {
		if (this.aClass122_1 != null && (super.aBoolean416 || this.method4550(0, arg0))) {
			this.method4547(arg0, super.aBoolean416, super.aClass78Array3);
		}
	}
}
