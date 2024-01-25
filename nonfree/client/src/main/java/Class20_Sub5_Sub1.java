import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class20_Sub5_Sub1 extends Class20_Sub5 {

	@OriginalMember(owner = "client!le", name = "v", descriptor = "I")
	public int anInt3629;

	@OriginalMember(owner = "client!le", name = "x", descriptor = "I")
	public int anInt3630;

	@OriginalMember(owner = "client!le", name = "B", descriptor = "I")
	public int anInt3634;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "I")
	public int anInt3639;

	@OriginalMember(owner = "client!le", name = "D", descriptor = "I")
	public int anInt3636 = -1;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "I")
	public int anInt3638 = -1;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IILclient!qa;B)Z")
	@Override
	public boolean method5112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class128 arg2) {
		@Pc(6) Class40 local6 = arg2.method3600();
		local6.R(super.anInt3628, super.anInt3619, super.anInt3626);
		@Pc(39) Class33 local39 = Static227.aClass65_2.method1327(this.anInt3639).method1502(this.anInt3630, arg2, -1, 131072, 0, 0, null, null);
		if (local39 != null && local39.method5395(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt3636 != -1) {
			local39 = Static227.aClass65_2.method1327(this.anInt3636).method1502(this.anInt3634, arg2, -1, 131072, 0, 0, null, null);
			if (local39 != null && local39.method5395(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt3638 != -1) {
			local39 = Static227.aClass65_2.method1327(this.anInt3638).method1502(this.anInt3629, arg2, -1, 131072, 0, 0, null, null);
			if (local39 != null && local39.method5395(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(ILclient!qa;)Lclient!nf;")
	@Override
	public Class13_Sub4 method5115(@OriginalArg(1) Class128 arg0) {
		@Pc(12) Class40 local12 = arg0.method3600();
		local12.R(super.anInt3628, super.anInt3619, super.anInt3626);
		@Pc(24) Class13_Sub4 local24 = Static192.method2550(3);
		@Pc(45) Class33 local45;
		if (this.anInt3638 != -1) {
			local45 = Static227.aClass65_2.method1327(this.anInt3638).method1502(this.anInt3629, arg0, -1, 2048, 0, 0, null, null);
			if (local45 != null) {
				local45.method5391(local12, local24.aClass13_Sub8Array1[2], 0);
			}
		}
		if (this.anInt3636 != -1) {
			local45 = Static227.aClass65_2.method1327(this.anInt3636).method1502(this.anInt3634, arg0, -1, 2048, 0, 0, null, null);
			if (local45 != null) {
				local45.method5391(local12, local24.aClass13_Sub8Array1[1], 0);
			}
		}
		local45 = Static227.aClass65_2.method1327(this.anInt3639).method1502(this.anInt3630, arg0, -1, 2048, 0, 0, null, null);
		if (local45 != null) {
			local45.method5391(local12, local24.aClass13_Sub8Array1[0], 0);
		}
		return local24;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5114(@OriginalArg(1) Class128 arg0) {
	}
}
