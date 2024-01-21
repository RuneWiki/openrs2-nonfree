import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class3_Sub1_Sub3_Sub1_Sub2 extends Class3_Sub1_Sub3_Sub1 {

	@OriginalMember(owner = "client!nb", name = "Kc", descriptor = "Lclient!db;")
	public Class3_Sub1_Sub4 aClass3_Sub1_Sub4_1;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)Lclient!lb;")
	@Override
	protected Class3_Sub1_Sub3_Sub3 method1843() {
		if (this.aClass3_Sub1_Sub4_1 == null) {
			return null;
		}
		@Pc(31) Class3_Sub1_Sub11 local31 = super.anInt1868 != -1 && super.anInt1843 == 0 ? Static41.method705(super.anInt1868) : null;
		@Pc(49) Class3_Sub1_Sub11 local49 = super.anInt1854 == -1 || super.anInt1847 == super.anInt1854 && local31 != null ? null : Static41.method705(super.anInt1854);
		@Pc(60) Class3_Sub1_Sub3_Sub3 local60 = this.aClass3_Sub1_Sub4_1.method441(local31, super.anInt1851, super.anInt1832, local49);
		if (local60 == null) {
			return null;
		}
		local60.method970();
		super.anInt1850 = local60.anInt2799;
		if (super.anInt1859 != -1 && super.anInt1870 != -1) {
			@Pc(88) Class3_Sub1_Sub3_Sub3 local88 = Static105.method1827(super.anInt1859).method1608(super.anInt1870);
			if (local88 != null) {
				local88.method964(0, -super.anInt1839, 0);
				@Pc(108) Class3_Sub1_Sub3_Sub3[] local108 = new Class3_Sub1_Sub3_Sub3[] { local60, local88 };
				local60 = new Class3_Sub1_Sub3_Sub3(local108, 2, true);
			}
		}
		if (this.aClass3_Sub1_Sub4_1.anInt648 == 1) {
			local60.aBoolean85 = true;
		}
		return local60;
	}

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method1153() {
		return this.aClass3_Sub1_Sub4_1 != null;
	}
}
