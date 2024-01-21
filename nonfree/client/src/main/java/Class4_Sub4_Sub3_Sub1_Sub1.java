import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class4_Sub4_Sub3_Sub1_Sub1 extends Class4_Sub4_Sub3_Sub1 {

	@OriginalMember(owner = "client!fb", name = "Jc", descriptor = "Lclient!lc;")
	public Class4_Sub4_Sub10 aClass4_Sub4_Sub10_1;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)Lclient!u;")
	@Override
	public Class4_Sub4_Sub3_Sub7 method1754() {
		if (this.aClass4_Sub4_Sub10_1 == null) {
			return null;
		}
		@Pc(30) Class4_Sub4_Sub9 local30 = super.anInt1390 != -1 && super.anInt1417 == 0 ? Static118.method1796(super.anInt1390) : null;
		@Pc(53) Class4_Sub4_Sub9 local53 = super.anInt1432 == -1 || super.anInt1389 == super.anInt1432 && local30 != null ? null : Static118.method1796(super.anInt1432);
		@Pc(64) Class4_Sub4_Sub3_Sub7 local64 = this.aClass4_Sub4_Sub10_1.method1132(super.anInt1419, super.anInt1385, local53, local30);
		if (local64 == null) {
			return null;
		}
		local64.method1767();
		super.anInt1400 = local64.anInt2514;
		if (super.anInt1439 != -1 && super.anInt1428 != -1) {
			@Pc(92) Class4_Sub4_Sub3_Sub7 local92 = Static84.method1424(super.anInt1439).method1545(super.anInt1428);
			if (local92 != null) {
				@Pc(105) Class4_Sub4_Sub3_Sub7[] local105 = new Class4_Sub4_Sub3_Sub7[] { local64, local92 };
				local92.method1773(0, -super.anInt1401, 0);
				local64 = new Class4_Sub4_Sub3_Sub7(local105, 2);
			}
		}
		if (this.aClass4_Sub4_Sub10_1.anInt1706 == 1) {
			local64.aBoolean147 = true;
		}
		return local64;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method969() {
		return this.aClass4_Sub4_Sub10_1 != null;
	}
}
