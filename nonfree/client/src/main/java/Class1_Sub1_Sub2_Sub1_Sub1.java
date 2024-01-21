import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class1_Sub1_Sub2_Sub1_Sub1 extends Class1_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!ba", name = "fd", descriptor = "Lclient!df;")
	public Class1_Sub1_Sub5 aClass1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1797() {
		return this.aClass1_Sub1_Sub5_1 != null;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Lclient!na;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1790() {
		if (this.aClass1_Sub1_Sub5_1 == null) {
			return null;
		}
		@Pc(22) Class1_Sub1_Sub7 local22 = super.anInt2526 != -1 && super.anInt2492 == 0 ? Static82.method1398(super.anInt2526) : null;
		@Pc(40) Class1_Sub1_Sub7 local40 = super.anInt2495 == -1 || super.anInt2495 == super.anInt2503 && local22 != null ? null : Static82.method1398(super.anInt2495);
		@Pc(51) Class1_Sub1_Sub2_Sub7 local51 = this.aClass1_Sub1_Sub5_1.method518(super.anInt2524, super.anInt2485, local22, local40);
		if (local51 == null) {
			return null;
		}
		local51.method1371();
		super.anInt2488 = local51.anInt2467;
		if (super.anInt2535 != -1 && super.anInt2506 != -1) {
			@Pc(81) Class1_Sub1_Sub2_Sub7 local81 = Static64.method1146(super.anInt2535).method1840(super.anInt2506);
			if (local81 != null) {
				local81.method1376(0, -super.anInt2497, 0);
				@Pc(101) Class1_Sub1_Sub2_Sub7[] local101 = new Class1_Sub1_Sub2_Sub7[] { local51, local81 };
				local51 = new Class1_Sub1_Sub2_Sub7(local101, 2);
			}
		}
		if (this.aClass1_Sub1_Sub5_1.anInt910 == 1) {
			local51.aBoolean162 = true;
		}
		return local51;
	}
}
