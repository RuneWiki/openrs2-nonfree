import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class3_Sub1_Sub4_Sub1_Sub1 extends Class3_Sub1_Sub4_Sub1 {

	@OriginalMember(owner = "client!db", name = "dd", descriptor = "Lclient!ad;")
	public Class3_Sub1_Sub1 aClass3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method1036() {
		return this.aClass3_Sub1_Sub1_1 != null;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Lclient!ua;")
	@Override
	public Class3_Sub1_Sub4_Sub7 method1750() {
		if (this.aClass3_Sub1_Sub1_1 == null) {
			return null;
		}
		@Pc(30) Class3_Sub1_Sub11 local30 = super.anInt1442 != -1 && super.anInt1460 == 0 ? Static97.method1629(super.anInt1442) : null;
		@Pc(53) Class3_Sub1_Sub11 local53 = super.anInt1436 == -1 || super.anInt1436 == super.anInt1449 && local30 != null ? null : Static97.method1629(super.anInt1436);
		@Pc(64) Class3_Sub1_Sub4_Sub7 local64 = this.aClass3_Sub1_Sub1_1.method83(super.anInt1422, local30, super.anInt1415, local53);
		if (local64 == null) {
			return null;
		}
		local64.method1761();
		super.anInt1465 = local64.anInt2525;
		if (super.anInt1439 != -1 && super.anInt1431 != -1) {
			@Pc(91) Class3_Sub1_Sub4_Sub7 local91 = Static89.method1461(super.anInt1439).method239(super.anInt1431);
			if (local91 != null) {
				@Pc(104) Class3_Sub1_Sub4_Sub7[] local104 = new Class3_Sub1_Sub4_Sub7[] { local64, local91 };
				local91.method1771(0, -super.anInt1425, 0);
				local64 = new Class3_Sub1_Sub4_Sub7(local104, 2);
			}
		}
		if (this.aClass3_Sub1_Sub1_1.anInt137 == 1) {
			local64.aBoolean106 = true;
		}
		return local64;
	}
}
