import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class10_Sub3_Sub3_Sub1 extends Class10_Sub3_Sub3 {

	@OriginalMember(owner = "client!sd", name = "Sc", descriptor = "Lclient!tb;")
	public Class192 aClass192_1;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)I")
	@Override
	protected int method5370() {
		if (this.aClass192_1.anIntArray525 != null) {
			@Pc(17) Class192 local17 = this.aClass192_1.method5281();
			if (local17 != null && local17.anInt5789 != -1) {
				return local17.anInt5789;
			}
		}
		return this.aClass192_1.anInt5789;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!e;I)Z")
	private boolean method4953(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1) {
		@Pc(5) int local5 = arg0;
		@Pc(11) Class128 local11 = this.method5364();
		@Pc(25) Class79 local25 = super.anInt5961 != -1 && super.anInt5963 == 0 ? Static233.method4080(super.anInt5961) : null;
		@Pc(41) Class79 local41 = super.anInt5939 == -1 || super.aBoolean414 && local25 != null ? null : Static233.method4080(super.anInt5939);
		@Pc(44) int local44 = local11.anInt3746;
		@Pc(47) int local47 = local11.anInt3734;
		if (local44 != 0 || local47 != 0 || local11.anInt3756 != 0 || local11.anInt3759 != 0) {
			arg0 |= 0x7;
		}
		@Pc(92) Class45 local92 = super.aClass45Array3[0] = this.aClass192_1.method5285(super.anInt5968, arg1, super.anInt5960, super.anInt5959, super.anInt5933, super.anInt5966, super.aClass3Array3, super.anInt5975, local41, local25, arg0);
		if (local92 == null) {
			return false;
		}
		super.anInt5978 = local92.method1781();
		this.method5359(local92);
		@Pc(109) int local109 = super.aClass133_7.method3620();
		super.anInt5938 = 0;
		super.anInt5924 = 0;
		super.anInt5926 = 0;
		if (local44 == 0 && local47 == 0) {
			this.method5369(this.method5353() << 7, local109, this.method5353() << 7);
		} else {
			this.method5369(local47, local109, local44);
			if (super.anInt5924 != 0) {
				super.aClass45Array3[0].method1818(super.anInt5924);
			}
			if (super.anInt5926 != 0) {
				super.aClass45Array3[0].method1784(super.anInt5926);
			}
			if (super.anInt5938 != 0) {
				super.aClass45Array3[0].method1788(0, super.anInt5938, 0);
			}
		}
		super.aClass45Array3[1] = null;
		if (super.anInt5957 != -1 && super.anInt5962 != -1) {
			@Pc(208) Class78 local208 = Static76.method1908(super.anInt5957);
			@Pc(227) Class45 local227 = local208.method2266(super.anInt5953, super.anInt5962, local5 | (local208.aBoolean160 ? 7 : 2), arg1, super.anInt5952);
			if (local227 != null) {
				local227.method1788(0, -super.anInt5917, 0);
				if (local208.aBoolean160 && (local44 != 0 || local47 != 0)) {
					if (super.anInt5924 != 0) {
						local227.method1818(super.anInt5924);
					}
					if (super.anInt5926 != 0) {
						local227.method1784(super.anInt5926);
					}
					if (super.anInt5938 != 0) {
						local227.method1788(0, super.anInt5938, 0);
					}
				}
				super.aClass45Array3[1] = local227;
			}
		}
		super.aClass45Array3[2] = null;
		if (super.anInterface7_3 != null) {
			if (super.anInt5980 <= Static153.anInt3257) {
				super.anInterface7_3 = null;
			}
			if (Static153.anInt3257 >= super.anInt5985 && super.anInt5980 > Static153.anInt3257) {
				@Pc(317) Class45 local317 = super.anInterface7_3.method4071(arg1, local5 | 0x7);
				if (local317 != null) {
					local317.method1788(super.anInt5982 - super.anInt5910, super.anInt5981 - super.anInt5907, super.anInt5987 - super.anInt5908);
					if (local109 != 0) {
						local317.method1797(local109);
					}
					super.aClass45Array3[2] = local317;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "(I)Z")
	private boolean method4955() {
		return this.aClass192_1.aBoolean403;
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)I")
	@Override
	public int method5345() {
		return super.anInt5978;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5339() {
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!tb;I)V")
	public void method4957(@OriginalArg(0) Class192 arg0) {
		this.aClass192_1 = arg0;
		if (super.aClass1_Sub7_7 != null) {
			super.aClass1_Sub7_7.method4322();
		}
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
	@Override
	public void method5340() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)I")
	@Override
	public int method5356() {
		if (this.aClass192_1.anIntArray525 != null) {
			@Pc(12) Class192 local12 = this.aClass192_1.method5281();
			if (local12 != null && local12.anInt5803 != -1) {
				return local12.anInt5803;
			}
		}
		return this.aClass192_1.anInt5803 == -1 ? super.method5356() : this.aClass192_1.anInt5803;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		if (this.aClass192_1 == null || !this.method4953(65536, arg2)) {
			return false;
		}
		@Pc(24) Class51 local24 = arg2.method5145();
		@Pc(31) int local31 = super.aClass133_7.method3620();
		local24.method3559(local31);
		local24.method3561(super.anInt5910, super.anInt5907, super.anInt5908);
		for (@Pc(44) int local44 = 0; super.aClass45Array3.length > local44; local44++) {
			if (super.aClass45Array3[local44] != null && super.aClass45Array3[local44].method1823(arg0, arg1, local24, this.aClass192_1.anInt5798 == 1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)Z")
	public boolean method4960() {
		return this.aClass192_1 != null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		if (this.aClass192_1 == null || !this.method4953(1024, arg0)) {
			return null;
		}
		@Pc(17) Class51 local17 = arg0.method5145();
		@Pc(22) int local22 = super.aClass133_7.method3620();
		local17.method3559(local22);
		local17.method3561(super.anInt5910, super.anInt5907, super.anInt5908);
		@Pc(37) Class128 local37 = this.method5364();
		@Pc(49) Class192 local49 = this.aClass192_1.anIntArray525 == null ? this.aClass192_1 : this.aClass192_1.method5281();
		if (Static153.aBoolean212 && local49.aBoolean401 && local37.aBoolean238) {
			@Pc(72) Class79 local72 = super.anInt5961 != -1 && super.anInt5963 == 0 ? Static233.method4080(super.anInt5961) : null;
			@Pc(88) Class79 local88 = super.anInt5939 == -1 || super.aBoolean414 && local72 != null ? null : Static233.method4080(super.anInt5939);
			@Pc(140) Class45 local140 = Static41.method988(super.aClass45Array3[0], this.aClass192_1.anInt5798, arg0, super.anInt5926, super.anInt5938, super.anInt5924, this.aClass192_1.aByte61 & 0xFF, local88 == null ? local72 : local88, this.aClass192_1.aByte60 & 0xFF, super.aBoolean415, this.aClass192_1.aShort78 & 0xFFFF, this.aClass192_1.aShort79 & 0xFFFF, local88 == null ? super.anInt5933 : super.anInt5959, local22);
			if (local140 != null) {
				@Pc(145) float local145 = arg0.method5098();
				@Pc(148) float local148 = arg0.method5097();
				arg0.method5156(false);
				arg0.method5161(local145, local148 - 150.0F);
				local140.method1794(local17, null, 0);
				arg0.method5161(local145, local148);
				arg0.method5156(true);
			}
		}
		@Pc(178) Class1_Sub8 local178 = null;
		if (this.method4955()) {
			local178 = Static182.method3510(super.aClass45Array3.length);
		}
		if (super.aClass1_Sub7_7 == null) {
			arg0.method5123(super.aClass45Array3, local17, local178 == null ? null : local178.aClass1_Sub3Array1, 0);
		} else {
			@Pc(209) Class109 local209 = super.aClass1_Sub7_7.method4320();
			arg0.method5130(super.aClass45Array3, local209, local17, local178 == null ? null : local178.aClass1_Sub3Array1, 0);
		}
		this.method5355(super.aClass45Array3, false, arg0);
		if (super.aClass45Array3[2] != null) {
			if (local22 != 0) {
				super.aClass45Array3[2].method1797(local22);
			}
			super.aClass45Array3[2].method1788(super.anInt5910 - super.anInt5982, -super.anInt5981 + super.anInt5907, -super.anInt5987 + super.anInt5908);
		}
		return local178;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
		if (this.aClass192_1 != null && (super.aBoolean417 || this.method4953(0, arg0))) {
			this.method5355(super.aClass45Array3, super.aBoolean417, arg0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(I)I")
	@Override
	public int method5358() {
		if (this.aClass192_1.anIntArray525 != null) {
			@Pc(12) Class192 local12 = this.aClass192_1.method5281();
			if (local12 != null && local12.anInt5795 != -1) {
				return local12.anInt5795;
			}
		}
		return this.aClass192_1.anInt5795;
	}
}
