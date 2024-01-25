import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class25_Sub1_Sub1_Sub2 extends Class25_Sub1_Sub1 {

	@OriginalMember(owner = "client!re", name = "Pc", descriptor = "Lclient!wm;")
	public Class216 aClass216_1;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	@Override
	public void method5588() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!re", name = "j", descriptor = "(I)Z")
	public boolean method4662() {
		return this.aClass216_1 != null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)I")
	@Override
	public int method4643() {
		if (this.aClass216_1.anIntArray562 != null) {
			@Pc(12) Class216 local12 = this.aClass216_1.method5777();
			if (local12 != null && local12.anInt6562 != -1) {
				return local12.anInt6562;
			}
		}
		return this.aClass216_1.anInt6562;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5585() {
		return false;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(Z)I")
	@Override
	protected int method4639() {
		if (this.aClass216_1.anIntArray562 != null) {
			@Pc(25) Class216 local25 = this.aClass216_1.method5777();
			if (local25 != null && local25.anInt6563 != -1) {
				return local25.anInt6563;
			}
		}
		return this.aClass216_1.anInt6563;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		if (this.aClass216_1 == null || !this.method4665(1024, arg0)) {
			return null;
		}
		@Pc(23) Class112 local23 = arg0.method4798();
		@Pc(28) int local28 = super.aClass131_7.method3517();
		local23.method3595(local28);
		local23.method3584(super.anInt5769, super.anInt5772, super.anInt5773);
		@Pc(43) Class33 local43 = this.method4659();
		@Pc(55) Class216 local55 = this.aClass216_1.anIntArray562 == null ? this.aClass216_1 : this.aClass216_1.method5777();
		if (Static267.aBoolean391 && local55.aBoolean485 && local43.aBoolean67) {
			@Pc(80) Class17 local80 = super.anInt5312 != -1 && super.anInt5263 == 0 ? Static261.method4492(super.anInt5312) : null;
			@Pc(96) Class17 local96 = super.anInt5276 == -1 || super.aBoolean405 && local80 != null ? null : Static261.method4492(super.anInt5276);
			@Pc(148) Class101 local148 = Static73.method1594(super.anInt5265, local28, this.aClass216_1.anInt6566, local96 == null ? local80 : local96, this.aClass216_1.aByte74 & 0xFF, super.aBoolean404, this.aClass216_1.aShort94 & 0xFFFF, arg0, super.anInt5331, this.aClass216_1.aShort93 & 0xFFFF, this.aClass216_1.aByte72 & 0xFF, local96 == null ? super.anInt5285 : super.anInt5268, super.anInt5260, super.aClass101Array3[0]);
			if (local148 != null) {
				@Pc(153) float local153 = arg0.method4808();
				@Pc(156) float local156 = arg0.method4814();
				arg0.method4825(false);
				arg0.method4859(local153, local156 - 150.0F);
				local148.method5172(local23, null, 0);
				arg0.method4859(local153, local156);
				arg0.method4825(true);
			}
		}
		@Pc(179) Class63_Sub3 local179 = null;
		if (this.method4666()) {
			local179 = Static273.method4667(super.aClass101Array3.length);
		}
		if (super.aClass63_Sub5_4 == null) {
			arg0.method4840(super.aClass101Array3, local23, local179 == null ? null : local179.aClass63_Sub7Array1, 0);
		} else {
			@Pc(210) Class21 local210 = super.aClass63_Sub5_4.method4125();
			arg0.method4856(super.aClass101Array3, local210, local23, local179 == null ? null : local179.aClass63_Sub7Array1, 0);
		}
		this.method4655(super.aClass101Array3, arg0, false);
		if (super.aClass101Array3[2] != null) {
			if (local28 != 0) {
				super.aClass101Array3[2].method5177(local28);
			}
			super.aClass101Array3[2].method5194(super.anInt5769 - super.anInt5345, super.anInt5772 + -super.anInt5342, super.anInt5773 - super.anInt5344);
		}
		return local179;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
		if (this.aClass216_1 != null && (super.aBoolean406 || this.method4665(0, arg0))) {
			this.method4655(super.aClass101Array3, arg0, super.aBoolean406);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!wm;B)V")
	public void method4664(@OriginalArg(0) Class216 arg0) {
		this.aClass216_1 = arg0;
		if (super.aClass63_Sub5_4 != null) {
			super.aClass63_Sub5_4.method4121();
		}
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(I)I")
	@Override
	public int method5096() {
		return super.anInt5274;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		if (this.aClass216_1 == null || !this.method4665(65536, arg2)) {
			return false;
		}
		@Pc(19) Class112 local19 = arg2.method4798();
		@Pc(24) int local24 = super.aClass131_7.method3517();
		local19.method3595(local24);
		local19.method3589(super.anInt5769, super.anInt5772, super.anInt5773);
		for (@Pc(37) int local37 = 0; local37 < super.aClass101Array3.length; local37++) {
			if (super.aClass101Array3[local37] != null) {
				return super.aClass101Array3[local37].method5187(arg0, arg1, local19, this.aClass216_1.anInt6566 == 1);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLclient!en;)Z")
	private boolean method4665(@OriginalArg(0) int arg0, @OriginalArg(2) Class59 arg1) {
		@Pc(11) int local11 = arg0;
		@Pc(15) Class33 local15 = this.method4659();
		@Pc(29) Class17 local29 = super.anInt5312 != -1 && super.anInt5263 == 0 ? Static261.method4492(super.anInt5312) : null;
		@Pc(45) Class17 local45 = super.anInt5276 == -1 || super.aBoolean405 && local29 != null ? null : Static261.method4492(super.anInt5276);
		@Pc(48) int local48 = local15.anInt978;
		@Pc(51) int local51 = local15.anInt969;
		if (local48 != 0 || local51 != 0 || local15.anInt968 != 0 || local15.anInt986 != 0) {
			arg0 |= 0x7;
		}
		@Pc(96) Class101 local96 = super.aClass101Array3[0] = this.aClass216_1.method5769(super.anInt5322, super.aClass146Array3, arg0, super.anInt5268, super.anInt5299, super.anInt5298, super.anInt5285, arg1, local29, super.anInt5281, local45);
		if (local96 == null) {
			return false;
		}
		super.anInt5274 = local96.method5147();
		this.method4652(local96);
		@Pc(113) int local113 = super.aClass131_7.method3517();
		super.anInt5265 = 0;
		super.anInt5331 = 0;
		super.anInt5260 = 0;
		if (local48 == 0 && local51 == 0) {
			this.method4641(this.method4646() << 7, local113, this.method4646() << 7);
		} else {
			this.method4641(local48, local113, local51);
			if (super.anInt5331 != 0) {
				super.aClass101Array3[0].method5144(super.anInt5331);
			}
			if (super.anInt5265 != 0) {
				super.aClass101Array3[0].method5186(super.anInt5265);
			}
			if (super.anInt5260 != 0) {
				super.aClass101Array3[0].method5194(0, super.anInt5260, 0);
			}
		}
		super.aClass101Array3[1] = null;
		if (super.anInt5269 != -1 && super.anInt5315 != -1) {
			@Pc(209) Class128 local209 = Static136.method2578(super.anInt5269);
			@Pc(228) Class101 local228 = local209.method3470((local209.aBoolean267 ? 7 : 2) | local11, arg1, super.anInt5330, super.anInt5279, super.anInt5315);
			if (local228 != null) {
				local228.method5194(0, -super.anInt5319, 0);
				if (local209.aBoolean267 && (local48 != 0 || local51 != 0)) {
					if (super.anInt5331 != 0) {
						local228.method5144(super.anInt5331);
					}
					if (super.anInt5265 != 0) {
						local228.method5186(super.anInt5265);
					}
					if (super.anInt5260 != 0) {
						local228.method5194(0, super.anInt5260, 0);
					}
				}
				super.aClass101Array3[1] = local228;
			}
		}
		super.aClass101Array3[2] = null;
		if (super.anInterface8_3 != null) {
			if (Static180.anInt3606 >= super.anInt5338) {
				super.anInterface8_3 = null;
			}
			if (super.anInt5335 <= Static180.anInt3606 && Static180.anInt3606 < super.anInt5338) {
				@Pc(324) Class101 local324 = super.anInterface8_3.method5548(local11 | 0x7, arg1);
				if (local324 != null) {
					local324.method5194(-super.anInt5769 + super.anInt5345, -super.anInt5772 + super.anInt5342, super.anInt5344 - super.anInt5773);
					if (local113 != 0) {
						local324.method5177(local113);
					}
					super.aClass101Array3[2] = local324;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(I)Z")
	private boolean method4666() {
		return this.aClass216_1.aBoolean480;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)I")
	@Override
	public int method4649() {
		if (this.aClass216_1.anIntArray562 != null) {
			@Pc(18) Class216 local18 = this.aClass216_1.method5777();
			if (local18 != null && local18.anInt6557 != -1) {
				return local18.anInt6557;
			}
		}
		return this.aClass216_1.anInt6557 == -1 ? super.method4649() : this.aClass216_1.anInt6557;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}
}
