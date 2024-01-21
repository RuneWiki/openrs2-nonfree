import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class2_Sub2_Sub12_Sub1_Sub2 extends Class2_Sub2_Sub12_Sub1 {

	@OriginalMember(owner = "client!ua", name = "Rc", descriptor = "Lclient!gb;")
	public Class2_Sub2_Sub7 aClass2_Sub2_Sub7_1;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)Lclient!ne;")
	@Override
	protected Class2_Sub2_Sub12_Sub4 method1533() {
		if (this.aClass2_Sub2_Sub7_1 == null) {
			return null;
		}
		@Pc(28) Class2_Sub2_Sub6 local28 = super.anInt2307 != -1 && super.anInt2313 == 0 ? Static62.method1042(super.anInt2307) : null;
		@Pc(50) Class2_Sub2_Sub6 local50 = super.anInt2318 == -1 || super.anInt2318 == super.anInt2290 && local28 != null ? null : Static62.method1042(super.anInt2318);
		@Pc(61) Class2_Sub2_Sub12_Sub4 local61 = this.aClass2_Sub2_Sub7_1.method605(local28, local50, super.anInt2316, super.anInt2295);
		if (local61 == null) {
			return null;
		}
		local61.method1135();
		super.anInt2310 = local61.anInt2265;
		if (super.anInt2302 != -1 && super.anInt2291 != -1) {
			@Pc(89) Class2_Sub2_Sub12_Sub4 local89 = Static5.method116(super.anInt2302).method501(super.anInt2291);
			if (local89 != null) {
				local89.method1137(0, -super.anInt2289, 0);
				@Pc(109) Class2_Sub2_Sub12_Sub4[] local109 = new Class2_Sub2_Sub12_Sub4[] { local61, local89 };
				local61 = new Class2_Sub2_Sub12_Sub4(local109, 2, true);
			}
		}
		if (this.aClass2_Sub2_Sub7_1.anInt758 == 1) {
			local61.aBoolean139 = true;
		}
		return local61;
	}

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method1544() {
		return this.aClass2_Sub2_Sub7_1 != null;
	}
}
