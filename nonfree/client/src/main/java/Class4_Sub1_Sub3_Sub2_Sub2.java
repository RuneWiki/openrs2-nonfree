import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class4_Sub1_Sub3_Sub2_Sub2 extends Class4_Sub1_Sub3_Sub2 {

	@OriginalMember(owner = "client!q", name = "Hc", descriptor = "Lclient!o;")
	public Class4_Sub1_Sub10 aClass4_Sub1_Sub10_1;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method1614() {
		return this.aClass4_Sub1_Sub10_1 != null;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(B)Lclient!od;")
	@Override
	public Class4_Sub1_Sub3_Sub3 method1816() {
		if (this.aClass4_Sub1_Sub10_1 == null) {
			return null;
		}
		@Pc(23) Class4_Sub1_Sub17 local23 = super.anInt2474 != -1 && super.anInt2477 == 0 ? Static79.method1437(super.anInt2474) : null;
		@Pc(49) Class4_Sub1_Sub17 local49 = super.anInt2470 == -1 || super.anInt2470 == super.anInt2452 && local23 != null ? null : Static79.method1437(super.anInt2470);
		@Pc(60) Class4_Sub1_Sub3_Sub3 local60 = this.aClass4_Sub1_Sub10_1.method1438(local49, super.anInt2483, local23, super.anInt2486);
		if (local60 == null) {
			return null;
		}
		local60.method1474();
		super.anInt2453 = local60.anInt2808;
		if (super.anInt2489 != -1 && super.anInt2507 != -1) {
			@Pc(87) Class4_Sub1_Sub3_Sub3 local87 = Static33.method549(super.anInt2489).method1790(super.anInt2507);
			if (local87 != null) {
				local87.method1487(0, -super.anInt2485, 0);
				@Pc(107) Class4_Sub1_Sub3_Sub3[] local107 = new Class4_Sub1_Sub3_Sub3[] { local60, local87 };
				local60 = new Class4_Sub1_Sub3_Sub3(local107, 2);
			}
		}
		if (this.aClass4_Sub1_Sub10_1.anInt2153 == 1) {
			local60.aBoolean199 = true;
		}
		return local60;
	}
}
