import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class2_Sub1_Sub2_Sub3_Sub2 extends Class2_Sub1_Sub2_Sub3 {

	@OriginalMember(owner = "client!wc", name = "ed", descriptor = "Lclient!jb;")
	public Class2_Sub1_Sub8 aClass2_Sub1_Sub8_1;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)Lclient!ga;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method2061() {
		if (this.aClass2_Sub1_Sub8_1 == null) {
			return null;
		}
		@Pc(26) Class2_Sub1_Sub1 local26 = super.anInt2901 != -1 && super.anInt2937 == 0 ? Static69.method1439(super.anInt2901) : null;
		@Pc(49) Class2_Sub1_Sub1 local49 = super.anInt2894 == -1 || super.anInt2895 == super.anInt2894 && local26 != null ? null : Static69.method1439(super.anInt2894);
		@Pc(60) Class2_Sub1_Sub2_Sub2 local60 = this.aClass2_Sub1_Sub8_1.method948(super.anInt2885, local26, super.anInt2928, local49);
		if (local60 == null) {
			return null;
		}
		local60.method697();
		super.anInt2911 = local60.anInt2876;
		if (super.anInt2904 != -1 && super.anInt2912 != -1) {
			@Pc(97) Class2_Sub1_Sub2_Sub2 local97 = Static5.method79(super.anInt2904).method1433(super.anInt2912);
			if (local97 != null) {
				local97.method692(0, -super.anInt2934, 0);
				@Pc(117) Class2_Sub1_Sub2_Sub2[] local117 = new Class2_Sub1_Sub2_Sub2[] { local60, local97 };
				local60 = new Class2_Sub1_Sub2_Sub2(local117, 2, true);
			}
		}
		if (this.aClass2_Sub1_Sub8_1.anInt1369 == 1) {
			local60.aBoolean56 = true;
		}
		return local60;
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method2067() {
		return this.aClass2_Sub1_Sub8_1 != null;
	}
}
