import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class2_Sub1_Sub1_Sub1_Sub2 extends Class2_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!vd", name = "Ad", descriptor = "Lclient!h;")
	public Class2_Sub1_Sub7 aClass2_Sub1_Sub7_1;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)Lclient!pa;")
	@Override
	public Class2_Sub1_Sub1_Sub5 method1778() {
		if (this.aClass2_Sub1_Sub7_1 == null) {
			return null;
		}
		@Pc(31) Class2_Sub1_Sub9 local31 = super.anInt2759 != -1 && super.anInt2744 == 0 ? Static4.method192(super.anInt2759) : null;
		@Pc(49) Class2_Sub1_Sub9 local49 = super.anInt2708 == -1 || super.anInt2708 == super.anInt2747 && local31 != null ? null : Static4.method192(super.anInt2708);
		@Pc(60) Class2_Sub1_Sub1_Sub5 local60 = this.aClass2_Sub1_Sub7_1.method930(local31, local49, super.anInt2739, super.anInt2730);
		if (local60 == null) {
			return null;
		}
		local60.method1400();
		super.anInt2740 = local60.anInt2698;
		if (super.anInt2718 != -1 && super.anInt2758 != -1) {
			@Pc(88) Class2_Sub1_Sub1_Sub5 local88 = Static65.method1339(super.anInt2718).method715(super.anInt2758);
			if (local88 != null) {
				local88.method1429(0, -super.anInt2735, 0);
				@Pc(108) Class2_Sub1_Sub1_Sub5[] local108 = new Class2_Sub1_Sub1_Sub5[] { local60, local88 };
				local60 = new Class2_Sub1_Sub1_Sub5(local108, 2, true);
			}
		}
		if (this.aClass2_Sub1_Sub7_1.anInt1335 == 1) {
			local60.aBoolean111 = true;
		}
		return local60;
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method1783() {
		return this.aClass2_Sub1_Sub7_1 != null;
	}
}
