import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class1_Sub1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!hd", name = "Rc", descriptor = "Lclient!wa;")
	public Class1_Sub1_Sub17 aClass1_Sub1_Sub17_1;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)Lclient!ka;")
	@Override
	public Class1_Sub1_Sub1_Sub2 method1842() {
		if (this.aClass1_Sub1_Sub17_1 == null) {
			return null;
		}
		@Pc(23) Class1_Sub1_Sub6 local23 = super.anInt1388 != -1 && super.anInt1416 == 0 ? Static40.method687(super.anInt1388) : null;
		@Pc(46) Class1_Sub1_Sub6 local46 = super.anInt1446 == -1 || super.anInt1446 == super.anInt1409 && local23 != null ? null : Static40.method687(super.anInt1446);
		@Pc(65) Class1_Sub1_Sub1_Sub2 local65 = this.aClass1_Sub1_Sub17_1.method2017(super.anInt1401, local46, super.anInt1431, local23);
		if (local65 == null) {
			return null;
		}
		local65.method1103();
		super.anInt1451 = local65.anInt2759;
		if (super.anInt1414 != -1 && super.anInt1424 != -1) {
			@Pc(93) Class1_Sub1_Sub1_Sub2 local93 = Static11.method279(super.anInt1414).method1707(super.anInt1424);
			if (local93 != null) {
				local93.method1087(0, -super.anInt1407, 0);
				@Pc(113) Class1_Sub1_Sub1_Sub2[] local113 = new Class1_Sub1_Sub1_Sub2[] { local65, local93 };
				local65 = new Class1_Sub1_Sub1_Sub2(local113, 2);
			}
		}
		if (this.aClass1_Sub1_Sub17_1.anInt3042 == 1) {
			local65.aBoolean92 = true;
		}
		return local65;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method901() {
		return this.aClass1_Sub1_Sub17_1 != null;
	}
}
