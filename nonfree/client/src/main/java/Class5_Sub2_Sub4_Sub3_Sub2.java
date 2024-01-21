import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class5_Sub2_Sub4_Sub3_Sub2 extends Class5_Sub2_Sub4_Sub3 {

	@OriginalMember(owner = "client!pc", name = "cd", descriptor = "Lclient!ve;")
	public Class5_Sub2_Sub17 aClass5_Sub2_Sub17_1;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)Lclient!dd;")
	@Override
	public Class5_Sub2_Sub4_Sub2 method1612() {
		if (this.aClass5_Sub2_Sub17_1 == null) {
			return null;
		}
		@Pc(23) Class5_Sub2_Sub9 local23 = super.anInt2436 != -1 && super.anInt2387 == 0 ? Static63.method1252(super.anInt2436) : null;
		@Pc(42) Class5_Sub2_Sub9 local42 = super.anInt2419 == -1 || super.anInt2419 == super.anInt2426 && local23 != null ? null : Static63.method1252(super.anInt2419);
		@Pc(53) Class5_Sub2_Sub4_Sub2 local53 = this.aClass5_Sub2_Sub17_1.method2127(super.anInt2425, local42, local23, super.anInt2420);
		if (local53 == null) {
			return null;
		}
		local53.method419();
		super.anInt2431 = local53.anInt2379;
		if (super.anInt2434 != -1 && super.anInt2414 != -1) {
			@Pc(85) Class5_Sub2_Sub4_Sub2 local85 = Static91.method1710(super.anInt2434).method1965(super.anInt2414);
			if (local85 != null) {
				@Pc(98) Class5_Sub2_Sub4_Sub2[] local98 = new Class5_Sub2_Sub4_Sub2[] { local53, local85 };
				local85.method422(0, -super.anInt2432, 0);
				local53 = new Class5_Sub2_Sub4_Sub2(local98, 2);
			}
		}
		if (this.aClass5_Sub2_Sub17_1.anInt3057 == 1) {
			local53.aBoolean28 = true;
		}
		return local53;
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1614() {
		return this.aClass5_Sub2_Sub17_1 != null;
	}
}
