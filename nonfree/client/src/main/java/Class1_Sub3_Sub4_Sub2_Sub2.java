import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class1_Sub3_Sub4_Sub2_Sub2 extends Class1_Sub3_Sub4_Sub2 {

	@OriginalMember(owner = "client!uc", name = "Tc", descriptor = "Lclient!ne;")
	public Class1_Sub3_Sub12 aClass1_Sub3_Sub12_1;

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub4_Sub4 method2148() {
		if (this.aClass1_Sub3_Sub12_1 == null) {
			return null;
		}
		@Pc(26) Class1_Sub3_Sub11 local26 = super.anInt3068 != -1 && super.anInt3048 == 0 ? Static77.method1316(super.anInt3068) : null;
		@Pc(48) Class1_Sub3_Sub11 local48 = super.anInt3087 == -1 || super.anInt3087 == super.anInt3051 && local26 != null ? null : Static77.method1316(super.anInt3087);
		@Pc(59) Class1_Sub3_Sub4_Sub4 local59 = this.aClass1_Sub3_Sub12_1.method1482(local48, super.anInt3075, local26, super.anInt3077);
		if (local59 == null) {
			return null;
		}
		local59.method634();
		super.anInt3088 = local59.anInt3024;
		if (super.anInt3059 != -1 && super.anInt3065 != -1) {
			@Pc(89) Class1_Sub3_Sub4_Sub4 local89 = Static82.method1448(super.anInt3059).method584(super.anInt3065);
			if (local89 != null) {
				local89.method653(0, -super.anInt3042, 0);
				@Pc(109) Class1_Sub3_Sub4_Sub4[] local109 = new Class1_Sub3_Sub4_Sub4[] { local59, local89 };
				local59 = new Class1_Sub3_Sub4_Sub4(local109, 2);
			}
		}
		if (this.aClass1_Sub3_Sub12_1.anInt2092 == 1) {
			local59.aBoolean28 = true;
		}
		return local59;
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method2159() {
		return this.aClass1_Sub3_Sub12_1 != null;
	}
}
