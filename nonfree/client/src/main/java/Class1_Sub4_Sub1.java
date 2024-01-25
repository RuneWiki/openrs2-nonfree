import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
	public int anInt3908;

	@OriginalMember(owner = "client!jp", name = "A", descriptor = "I")
	public int anInt3910;

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
	public int anInt3912;

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
	public int anInt3914;

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
	public int anInt3909 = -1;

	@OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
	public int anInt3915 = -1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLclient!qa;)V")
	@Override
	public void method5840(@OriginalArg(1) Class75 arg0) {
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(Lclient!qa;B)Lclient!vs;")
	@Override
	public Class13_Sub7 method5837(@OriginalArg(0) Class75 arg0) {
		@Pc(6) Class106 local6 = arg0.method2587();
		local6.R(super.anInt3896, super.anInt3899, super.anInt3898);
		@Pc(18) Class13_Sub7 local18 = Static120.method2160(3);
		@Pc(48) Class31 local48;
		if (this.anInt3915 != -1) {
			local48 = Static89.aClass157_1.method3832(this.anInt3915).method4670(2048, 0, arg0, this.anInt3914, 0, -1, null, null);
			if (local48 != null) {
				local48.method5704(local6, local18.aClass13_Sub1Array1[2], 0);
			}
		}
		if (this.anInt3909 != -1) {
			local48 = Static89.aClass157_1.method3832(this.anInt3909).method4670(2048, 0, arg0, this.anInt3908, 0, -1, null, null);
			if (local48 != null) {
				local48.method5704(local6, local18.aClass13_Sub1Array1[1], 0);
			}
		}
		local48 = Static89.aClass157_1.method3832(this.anInt3912).method4670(2048, 0, arg0, this.anInt3910, 0, -1, null, null);
		if (local48 != null) {
			local48.method5704(local6, local18.aClass13_Sub1Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZILclient!qa;)Z")
	@Override
	public boolean method5835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		@Pc(6) Class106 local6 = arg2.method2587();
		local6.R(super.anInt3896, super.anInt3899, super.anInt3898);
		@Pc(37) Class31 local37 = Static89.aClass157_1.method3832(this.anInt3912).method4670(131072, 0, arg2, this.anInt3910, 0, -1, null, null);
		if (local37 != null && local37.method5702(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt3909 != -1) {
			local37 = Static89.aClass157_1.method3832(this.anInt3909).method4670(131072, 0, arg2, this.anInt3908, 0, -1, null, null);
			if (local37 != null && local37.method5702(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt3915 != -1) {
			local37 = Static89.aClass157_1.method3832(this.anInt3915).method4670(131072, 0, arg2, this.anInt3914, 0, -1, null, null);
			if (local37 != null && local37.method5702(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
