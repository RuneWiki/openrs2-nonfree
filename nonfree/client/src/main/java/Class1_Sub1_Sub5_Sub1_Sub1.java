import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class1_Sub1_Sub5_Sub1_Sub1 extends Class1_Sub1_Sub5_Sub1 {

	@OriginalMember(owner = "client!ld", name = "Oc", descriptor = "Lclient!r;")
	public Class1_Sub1_Sub15 aClass1_Sub1_Sub15_1;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method2479() {
		return this.aClass1_Sub1_Sub15_1 != null;
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(Z)Lclient!rg;")
	@Override
	public Class1_Sub1_Sub5_Sub4 method2896() {
		if (this.aClass1_Sub1_Sub15_1 == null) {
			return null;
		}
		@Pc(23) Class1_Sub1_Sub12 local23 = super.anInt3568 != -1 && super.anInt3597 == 0 ? Static121.method2378(super.anInt3568) : null;
		@Pc(50) Class1_Sub1_Sub12 local50 = super.anInt3562 == -1 || super.anInt3562 == super.anInt3607 && local23 != null ? null : Static121.method2378(super.anInt3562);
		@Pc(61) Class1_Sub1_Sub5_Sub4 local61 = this.aClass1_Sub1_Sub15_1.method2585(local50, local23, super.anInt3586, super.anInt3554);
		if (local61 == null) {
			return null;
		}
		local61.method1008();
		super.anInt3599 = local61.anInt4233;
		if (super.anInt3552 != -1 && super.anInt3567 != -1) {
			@Pc(89) Class1_Sub1_Sub5_Sub4 local89 = Static155.method2902(super.anInt3552).method3152(super.anInt3567);
			if (local89 != null) {
				local89.method996(0, -super.anInt3601, 0);
				local61 = local61.method1002(local89);
			}
		}
		if (this.aClass1_Sub1_Sub15_1.anInt3809 == 1) {
			local61.aBoolean56 = true;
		}
		return local61;
	}
}
