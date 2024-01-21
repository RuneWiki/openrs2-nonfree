import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class2_Sub1_Sub1_Sub3_Sub1 extends Class2_Sub1_Sub1_Sub3 {

	@OriginalMember(owner = "client!db", name = "Rc", descriptor = "Lclient!qa;")
	public Class2_Sub1_Sub11 aClass2_Sub1_Sub11_1;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Lclient!ad;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method2168() {
		if (this.aClass2_Sub1_Sub11_1 == null) {
			return null;
		}
		@Pc(24) Class2_Sub1_Sub7 local24 = super.anInt1817 != -1 && super.anInt1814 == 0 ? Static40.method724(super.anInt1817) : null;
		@Pc(42) Class2_Sub1_Sub7 local42 = super.anInt1790 == -1 || super.anInt1790 == super.anInt1786 && local24 != null ? null : Static40.method724(super.anInt1790);
		@Pc(55) Class2_Sub1_Sub1_Sub2 local55 = this.aClass2_Sub1_Sub11_1.method1661(super.anInt1802, local24, local42, super.anInt1804);
		if (local55 == null) {
			return null;
		}
		local55.method117();
		super.anInt1773 = local55.anInt3029;
		if (super.anInt1816 != -1 && super.anInt1774 != -1) {
			@Pc(84) Class2_Sub1_Sub1_Sub2 local84 = Static63.method291(super.anInt1816).method2026(super.anInt1774);
			if (local84 != null) {
				local84.method126(0, -super.anInt1791, 0);
				@Pc(104) Class2_Sub1_Sub1_Sub2[] local104 = new Class2_Sub1_Sub1_Sub2[] { local55, local84 };
				local55 = new Class2_Sub1_Sub1_Sub2(local104, 2);
			}
		}
		if (this.aClass2_Sub1_Sub11_1.anInt2343 == 1) {
			local55.aBoolean14 = true;
		}
		return local55;
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(B)Z")
	@Override
	public boolean method1174() {
		return this.aClass2_Sub1_Sub11_1 != null;
	}
}
