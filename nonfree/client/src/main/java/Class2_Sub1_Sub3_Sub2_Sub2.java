import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class2_Sub1_Sub3_Sub2_Sub2 extends Class2_Sub1_Sub3_Sub2 {

	@OriginalMember(owner = "client!uc", name = "qc", descriptor = "Lclient!ac;")
	public Class2_Sub1_Sub2 aClass2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method2467() {
		return this.aClass2_Sub1_Sub2_1 != null;
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Lclient!bh;")
	@Override
	public Class2_Sub1_Sub3_Sub3 method2544() {
		if (this.aClass2_Sub1_Sub2_1 == null) {
			return null;
		}
		@Pc(22) Class2_Sub1_Sub9 local22 = super.anInt3509 != -1 && super.anInt3481 == 0 ? Static19.method325(super.anInt3509) : null;
		@Pc(44) Class2_Sub1_Sub9 local44 = super.anInt3479 == -1 || super.anInt3487 == super.anInt3479 && local22 != null ? null : Static19.method325(super.anInt3479);
		@Pc(60) Class2_Sub1_Sub3_Sub3 local60 = this.aClass2_Sub1_Sub2_1.method49(super.anInt3507, local22, local44, super.anInt3458);
		if (local60 == null) {
			return null;
		}
		local60.method825();
		super.anInt3505 = local60.anInt3614;
		if (super.anInt3508 != -1 && super.anInt3500 != -1) {
			@Pc(88) Class2_Sub1_Sub3_Sub3 local88 = Static76.method1260(super.anInt3508).method612(super.anInt3500);
			if (local88 != null) {
				local88.method822(0, -super.anInt3478, 0);
				local60 = local60.method824(local88);
			}
		}
		if (this.aClass2_Sub1_Sub2_1.anInt72 == 1) {
			local60.aBoolean34 = true;
		}
		return local60;
	}
}
