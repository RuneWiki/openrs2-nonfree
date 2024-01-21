import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class1_Sub1_Sub2_Sub1_Sub1 extends Class1_Sub1_Sub2_Sub1 {

	@OriginalMember(owner = "client!b", name = "md", descriptor = "Lclient!tb;")
	public Class1_Sub1_Sub15 aClass1_Sub1_Sub15_1;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method1685() {
		return this.aClass1_Sub1_Sub15_1 != null;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(B)Lclient!ue;")
	@Override
	public Class1_Sub1_Sub2_Sub7 method1910() {
		if (this.aClass1_Sub1_Sub15_1 == null) {
			return null;
		}
		@Pc(27) Class1_Sub1_Sub4 local27 = super.anInt2407 != -1 && super.anInt2368 == 0 ? Static10.method254(super.anInt2407) : null;
		@Pc(49) Class1_Sub1_Sub4 local49 = super.anInt2396 == -1 || super.anInt2396 == super.anInt2361 && local27 != null ? null : Static10.method254(super.anInt2396);
		@Pc(60) Class1_Sub1_Sub2_Sub7 local60 = this.aClass1_Sub1_Sub15_1.method1651(super.anInt2367, local27, super.anInt2357, local49);
		if (local60 == null) {
			return null;
		}
		local60.method1919();
		super.anInt2404 = local60.anInt2678;
		if (super.anInt2382 != -1 && super.anInt2402 != -1) {
			@Pc(89) Class1_Sub1_Sub2_Sub7 local89 = Static62.method1091(super.anInt2382).method915(super.anInt2402);
			if (local89 != null) {
				local89.method1934(0, -super.anInt2391, 0);
				@Pc(109) Class1_Sub1_Sub2_Sub7[] local109 = new Class1_Sub1_Sub2_Sub7[] { local60, local89 };
				local60 = new Class1_Sub1_Sub2_Sub7(local109, 2);
			}
		}
		if (this.aClass1_Sub1_Sub15_1.anInt2313 == 1) {
			local60.aBoolean157 = true;
		}
		return local60;
	}
}
