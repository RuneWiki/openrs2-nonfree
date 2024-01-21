import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class2_Sub1_Sub1_Sub4_Sub1 extends Class2_Sub1_Sub1_Sub4 {

	@OriginalMember(owner = "client!cc", name = "Xc", descriptor = "Lclient!rb;")
	public Class2_Sub1_Sub13 aClass2_Sub1_Sub13_1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)Lclient!be;")
	@Override
	public Class2_Sub1_Sub1_Sub2 method1423() {
		if (this.aClass2_Sub1_Sub13_1 == null) {
			return null;
		}
		@Pc(31) Class2_Sub1_Sub8 local31 = super.anInt2374 != -1 && super.anInt2353 == 0 ? Static93.method1443(super.anInt2374) : null;
		@Pc(49) Class2_Sub1_Sub8 local49 = super.anInt2351 == -1 || super.anInt2352 == super.anInt2351 && local31 != null ? null : Static93.method1443(super.anInt2351);
		@Pc(60) Class2_Sub1_Sub1_Sub2 local60 = this.aClass2_Sub1_Sub13_1.method1575(local31, super.anInt2339, super.anInt2350, local49);
		if (local60 == null) {
			return null;
		}
		local60.method221();
		super.anInt2327 = local60.anInt2306;
		if (super.anInt2362 != -1 && super.anInt2372 != -1) {
			@Pc(88) Class2_Sub1_Sub1_Sub2 local88 = Static106.method1805(super.anInt2362).method1343(super.anInt2372);
			if (local88 != null) {
				local88.method201(0, -super.anInt2331, 0);
				@Pc(108) Class2_Sub1_Sub1_Sub2[] local108 = new Class2_Sub1_Sub1_Sub2[] { local60, local88 };
				local60 = new Class2_Sub1_Sub1_Sub2(local108, 2);
			}
		}
		if (this.aClass2_Sub1_Sub13_1.anInt2573 == 1) {
			local60.aBoolean30 = true;
		}
		return local60;
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method1431() {
		return this.aClass2_Sub1_Sub13_1 != null;
	}
}
